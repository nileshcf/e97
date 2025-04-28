  package com.cloudframe.app.process.impl;
  /* 
*****************************************************************
*  program:  usbaeext                                           *
*   this program will read a file created by tm bap program     *
*   ae_unload.pl. that file is pipe delimited.                  *
*   it is parsed by this program and the ae extract is          *
*   created.                                                    *
*                                                               *
*   input files:                                                *
*      tm-file:        pipe delimited file from tm              *
*      adj-table:      input file for adj select                *
*                                      criteria.                *
*                                                               *
*   output files:                                               *
*      ae-output-file: adjustment express file.                 *
*                                                               *
*                                                               *
*   copybooks:                                                  *
*      usbpdsc:        usb pds read.                            *
*      adjorss:        adj exp output file layout.              *
*                                                               *
*   input parms:   n/a                                          *
*                                                               *
*   return codes:                                               *
*      zero:   normal return code.                              *
*      u0100:  usbpdsio abend code,                             *
*                check console messages.                        *
*                                                               *
*****************************************************************
* usbank y900 modification log:                                 *
*                                                               *
* ccn     date     userid  description                          *
* ------- -------- ------- ------------------------------------ *
* ccn0031 10/04/11 mffago  initial release                      *
*****************************************************************
*/
  
  import org.springframework.beans.factory.annotation.Autowired;
  import org.springframework.beans.factory.annotation.Qualifier;
  import com.cloudframe.app.usbaeext.file.*;
  import com.cloudframe.app.usbaeext.UsbaeextCtx.*;
  import com.cloudframe.app.usbaeext.UsbaeextCtx;
  import com.cloudframe.app.process.Usbaeext;
  import com.cloudframe.app.process.BaseProcess;
  import org.springframework.web.bind.annotation.GetMapping;
  import org.slf4j.Logger;
  import org.slf4j.LoggerFactory;
  import com.cloudframe.app.exception.CFException;
  import org.springframework.stereotype.Component;
  import org.springframework.web.bind.annotation.RestController;
  import com.cloudframe.app.dto.GlobalExecutorCtx;
  import com.cloudframe.app.exception.Terminate;
  import com.cloudframe.app.data.Field;
  import com.cloudframe.app.utility.CFUtil;
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
  import java.math.BigDecimal;
  import org.springframework.beans.factory.annotation.Value;
  import java.math.RoundingMode;
  import com.cloudframe.app.usbaeext.dto.*;
  import com.cloudframe.app.usbaeext.dto.TmAdjDate;
  import com.cloudframe.app.usbaeext.file.records.TmRecord;
  import com.cloudframe.app.usbaeext.file.records.Adjtable;
  import com.cloudframe.app.usbaeext.file.records.Ov4ParameterList;
  import com.cloudframe.app.usbaeext.dto.WaCurrentDateGroup;
  import com.cloudframe.app.usbaeext.dto.TableAreas;
  import com.cloudframe.app.usbaeext.dto.Work;
  import com.cloudframe.app.common.CONSTANTS;
  
  @Component("usbaeext")
  
  public class UsbaeextImpl extends CommonProcess implements Usbaeext {
  
  Logger logger = LoggerFactory.getLogger(UsbaeextImpl.class);
  
  
  @Value("${timeZoneId:Etc/GMT}")
  private String timeZoneId;
  
  
  @Autowired 
  @Qualifier("usbaeext_tmFile")
  TmFile tmFile;
  @Autowired 
  @Qualifier("usbaeext_adjTable")
  AdjTable adjTable;
  @Autowired 
  @Qualifier("usbaeext_aeOutputFile")
  AeOutputFile aeOutputFile;
  
  
  private Map<String, Pattern> patternMap = new HashMap<>();
  
  
  
  
      /**
      * process 
      * Input  :  

      * - waEndSw                        COBOL Name: WA-END-SW
      * - waReturnCode                   COBOL Name: WA-RETURN-CODE
      *
      * Output :  

      * - rc                             COBOL Name: RETURN-CODE
      * - waReturnCode                   COBOL Name: WA-RETURN-CODE
      *
      * @throws CFException
      */
      public int process(UsbaeextCtx programCtx) throws Exception {
       try {
       setCodePage("1047");
            // Reset program ended flag
           programCtx.setProgramEnded(false);
ProcessInCtx methodIn = programCtx.getProcessInCtx();
ProcessOutCtx methodOut = methodIn.getProcessOutCtx();
//  PERFORM 0000-INITIALIZATION THRU 0000-EXIT
          initialization(programCtx.getInitializationInCtx());/*0000-INITIALIZATION*/
          if (programCtx.isProgramEnded()) {
              return programCtx.getRc();
          }
//  PERFORM 0010-OPEN-FILES THRU 0010-EXIT
          openFiles(programCtx.getOpenFilesInCtx());/*0010-OPEN-FILES*/
          if (programCtx.isProgramEnded()) {
              return programCtx.getRc();
          }
//  PERFORM 0100-READ-TM-FILE THRU 0100-EXIT
          readTmFile(programCtx);/*0100-READ-TM-FILE*/
          if (programCtx.isProgramEnded()) {
              return programCtx.getRc();
          }
//  PERFORM 0200-PROCESS-FILE THRU 0200-EXIT UNTIL WA-END-SW = HIGH-VALUES
          while (!( isHighValue(methodIn.getWaEndSw()) ) ) {
             processFile(programCtx.getProcessFileInCtx());/*0200-PROCESS-FILE*/
             if (programCtx.isProgramEnded()) {
                 return programCtx.getRc();
             }
          }
//  PERFORM 0300-CLOSE-FILES THRU 0300-EXIT
          closeFiles(programCtx);/*0300-CLOSE-FILES*/
          if (programCtx.isProgramEnded()) {
              return programCtx.getRc();
          }
//  MOVE WA-RETURN-CODE TO RETURN-CODE
          programCtx.setRc(methodOut.getWaReturnCode());
//  GOBACK
          setNotLogged(false); // no need to log, it is a normal termination
          programCtx.setProgramEnded(true);
          return programCtx.getRc();
       } catch(Exception e) {
            handleErrorCode(e);
            throw e;
       }
        finally {
      		if(tmFile.hasOpened() && !tmFile.isReadOnly()) { 
      			tmFile.flush(); 
      		}
      		if(adjTable.hasOpened() && !adjTable.isReadOnly()) { 
      			adjTable.flush(); 
      		}
      		if(aeOutputFile.hasOpened() && !aeOutputFile.isReadOnly()) { 
      			aeOutputFile.flush(); 
      		}
      }
      
      // end of process method
      }
      /**
      * initialization 
      *   This method is derived from 
  *   COBOL Paragraph - 0000-INITIALIZATION COBOL Cyclomatic complexity - 2
      * Input  : None 

      * Output :  

      * - waEndSw                        COBOL Name: WA-END-SW
      * - taAdjIndex                     COBOL Name: TA-ADJ-INDEX
      *
      * @throws CFException
      */
      @Override
      public InitializationOutCtx initialization(InitializationInCtx methodIn) throws Exception {
UsbaeextCtx programCtx = methodIn.getUsbaeextCtx();
InitializationOutCtx methodOut = methodIn.getInitializationOutCtx();
//  OPEN INPUT ADJ-TABLE
          adjTable.open(new String(CONSTANTS.MODE_READ_ONLY_36242),adjTable.getFileName(),adjTable.getAdjTableCharSet(),adjTable.getAdjTableCrlfFlag());
          // MOVE LOW-VALUES TO WA-END-SW
          methodOut.setWaEndSw(CONSTANTS.LOW_VALUE_1703015924);
//  SET TA-ADJ-INDEX TO 1
          methodOut.setTaAdjIndex(1); 
          
//  PERFORM 2000-READ-ADJ-TABLE THRU 2000-EXIT
             programCtx.setLoopReadAdjTable(true);
          while (programCtx.getLoopReadAdjTable()) {readAdjTable(programCtx);}/*2000-READ-ADJ-TABLE*/
//  PERFORM 2100-PROCESS-ADJ-TABLE THRU 2100-EXIT UNTIL WA-END-SW = HIGH-VALUES
          while (!( isHighValue(methodOut.getWaEndSw()) ) ) {
             processAdjTable(programCtx.getProcessAdjTableInCtx());/*2100-PROCESS-ADJ-TABLE*/
          }
//  CLOSE ADJ-TABLE
          adjTable.close(); 
          // MOVE LOW-VALUES TO WA-END-SW
          methodOut.setWaEndSw(CONSTANTS.LOW_VALUE_1703015924);
      
      return methodOut;
      }
      /**
      * openFiles 
      *   This method is derived from 
  *   COBOL Paragraph - 0010-OPEN-FILES COBOL Cyclomatic complexity - 1
      * Input  : None 

      * Output : None 

      * @throws CFException
      */
      @Override
      public void openFiles(OpenFilesInCtx methodIn) throws Exception {
UsbaeextCtx programCtx = methodIn.getUsbaeextCtx();
//  OPEN INPUT TM-FILE
          tmFile.open(new String(CONSTANTS.MODE_READ_ONLY_36242),tmFile.getFileName(),tmFile.getTmFileCharSet(),tmFile.getTmFileCrlfFlag());
//  OPEN OUTPUT AE-OUTPUT-FILE
          aeOutputFile.open(new String(CONSTANTS.MODE_WRITE_ONLY_36397),aeOutputFile.getFileName(),aeOutputFile.getAeOutputFileCharSet(),aeOutputFile.getAeOutputFileCrlfFlag());
      
      }
      /**
      * readTmFile 
      *   This method is derived from 
  *   COBOL Paragraph - 0100-READ-TM-FILE COBOL Cyclomatic complexity - 1
      * Input  : None 

      * Output :  

      * - tmRecord                       COBOL Name: TM-RECORD
      * - waEndSw                        COBOL Name: WA-END-SW
      *
      * @throws CFException
      */
      @Override
      public ReadTmFileOutCtx readTmFile(UsbaeextCtx programCtx) throws Exception {
ReadTmFileOutCtx methodOut = programCtx.getReadTmFileOutCtx();
//  READ TM-FILE
          	tmFile.read();
          if (!tmFile.hasEnded()) {
          	methodOut.getTmRecord().setString(tmFile.getRecord());
          }
//  AT END
          if (tmFile.hasEnded()) {  
              // MOVE HIGH-VALUES TO WA-END-SW
              methodOut.setWaEndSw(CONSTANTS.HIGH_VALUE_STRING);
            }
      
      return methodOut;
      }
      /**
      * processFile 
      *   This method is derived from 
  *   COBOL Paragraph - 0200-PROCESS-FILE COBOL Cyclomatic complexity - 2
      * Input  :  

      * - waEndSw                        COBOL Name: WA-END-SW
      *
      * Output : None 

      * @throws CFException
      */
      @Override
      public void processFile(ProcessFileInCtx methodIn) throws Exception {
UsbaeextCtx programCtx = methodIn.getUsbaeextCtx();
//  PERFORM 1200-PROCESS-TM THRU 1200-EXIT UNTIL WA-END-SW = HIGH-VALUES
          while (!( isHighValue(methodIn.getWaEndSw()) ) ) {
             processTm(programCtx.getProcessTmInCtx());/*1200-PROCESS-TM*/
          }
          ;
      
      }
      /**
      * closeFiles 
      *   This method is derived from 
  *   COBOL Paragraph - 0300-CLOSE-FILES COBOL Cyclomatic complexity - 1
      * Input  : None 

      * Output : None 

      * @throws CFException
      */
      @Override
      public void closeFiles(UsbaeextCtx programCtx) throws Exception {
//  CLOSE TM-FILE
          tmFile.close(); 
//  CLOSE AE-OUTPUT-FILE
          aeOutputFile.close(); 
      
      }
      /**
      * processTm 
      *   This method is derived from 
  *   COBOL Paragraph - 1200-PROCESS-TM COBOL Cyclomatic complexity - 1
      * Input  :  

      * - tmRecord                       COBOL Name: TM-RECORD
      *
      * Output :  

      * - tmAdjNo                        COBOL Name: TM-ADJ-NO
      * - tmAdjDate                      COBOL Name: TM-ADJ-DATE
      * - tmAdjTime                      COBOL Name: TM-ADJ-TIME
      * - tmAdjAcct                      COBOL Name: TM-ADJ-ACCT
      * - tmAdjDepDdrKey                 COBOL Name: TM-ADJ-DEP-DDR-KEY
      * - tmAdjPset                      COBOL Name: TM-ADJ-PSET
      * - tmAdjDdrKey                    COBOL Name: TM-ADJ-DDR-KEY
      * - tmAdjDepAcct                   COBOL Name: TM-ADJ-DEP-ACCT
      * - tmAdjDepAmt                    COBOL Name: TM-ADJ-DEP-AMT
      * - tmAdjCorrAmt                   COBOL Name: TM-ADJ-CORR-AMT
      * - tmAdjClass                     COBOL Name: TM-ADJ-CLASS
      * - tmAdjCode                      COBOL Name: TM-ADJ-CODE
      * - tmAdjName                      COBOL Name: TM-ADJ-NAME
      * - tmAdjOperNo                    COBOL Name: TM-ADJ-OPER-NO
      * - tmAdjEntryKey                  COBOL Name: TM-ADJ-ENTRY-KEY
      * - tmAdjState                     COBOL Name: TM-ADJ-STATE
      * - tmAdjComment                   COBOL Name: TM-ADJ-COMMENT
      * - tmAdjRt                        COBOL Name: TM-ADJ-RT
      * - tmAdjAmt                       COBOL Name: TM-ADJ-AMT
      * - tmAdjItemClass                 COBOL Name: TM-ADJ-ITEM-CLASS
      * - tmAdjFirstDrn                  COBOL Name: TM-ADJ-FIRST-DRN
      * - tmAdjDrn                       COBOL Name: TM-ADJ-DRN
      * - tmAdjLookupText                COBOL Name: TM-ADJ-LOOKUP-TEXT
      * - tmAdjAdviceKey                 COBOL Name: TM-ADJ-ADVICE-KEY
      * - tmAdjCorrF5                    COBOL Name: TM-ADJ-CORR-F5
      * - tmAdjDepF5                     COBOL Name: TM-ADJ-DEP-F5
      * - tmAdjAppInstance               COBOL Name: TM-ADJ-APP-INSTANCE
      * - tmAdjEntry                     COBOL Name: TM-ADJ-ENTRY
      * - tmAdjCycle                     COBOL Name: TM-ADJ-CYCLE
      * - tmAdjEnd                       COBOL Name: TM-ADJ-END
      *
      * @throws CFException
      */
      @Override
      public ProcessTmOutCtx processTm(ProcessTmInCtx methodIn) throws Exception {
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

UsbaeextCtx programCtx = methodIn.getUsbaeextCtx();
ProcessTmOutCtx methodOut = methodIn.getProcessTmOutCtx();

// **********************************************************
// ** This procedure will process the tm file by           **
// ** reading the individual records, process the informa- **
// ** tion, and write the adjustments express record(s).   **
// **********************************************************
//  UNSTRING TM-RECORD DELIMITED BY '|' INTO TM-ADJ-NO TM-ADJ-DATE TM-ADJ-TIME TM-ADJ-ACCT TM-ADJ-DEP-DDR-KEY TM-ADJ-PSET TM-ADJ-DDR-KEY TM-ADJ-DEP-ACCT TM-ADJ-DEP-AMT TM-ADJ-CORR-AMT TM-ADJ-CLASS TM-ADJ-CODE TM-ADJ-NAME TM-ADJ-OPER-NO TM-ADJ-ENTRY-KEY TM-ADJ-STATE TM-ADJ-COMMENT TM-ADJ-RT TM-ADJ-AMT TM-ADJ-ITEM-CLASS TM-ADJ-FIRST-DRN TM-ADJ-DRN TM-ADJ-LOOKUP-TEXT TM-ADJ-ADVICE-KEY TM-ADJ-CORR-F5 TM-ADJ-DEP-F5 TM-ADJ-APP-INSTANCE TM-ADJ-ENTRY TM-ADJ-CYCLE TM-ADJ-END END-UNSTRING
          //This will have the no of characters parsed while un string. On NoOverflow pointerCnt == actualstring.length
          actualUnstringStr = methodOut.getTmRecord().toCharArray();
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
          	methodOut.setTmAdjNo(CFUtil.getLong(resultKey));
          	
          	loop++;
          	resultKey = (char[])result.get(loop).getKey();
          	resultValue = (char[])result.get(loop).getValue();
          	methodOut.getTmAdjDate().setString(resultKey);
          	
          	loop++;
          	resultKey = (char[])result.get(loop).getKey();
          	resultValue = (char[])result.get(loop).getValue();
          	methodOut.setTmAdjTime(CFUtil.getLong(resultKey));
          	
          	loop++;
          	resultKey = (char[])result.get(loop).getKey();
          	resultValue = (char[])result.get(loop).getValue();
          	methodOut.setTmAdjAcct(resultKey);
          	
          	loop++;
          	resultKey = (char[])result.get(loop).getKey();
          	resultValue = (char[])result.get(loop).getValue();
          	methodOut.setTmAdjDepDdrKey(resultKey);
          	
          	loop++;
          	resultKey = (char[])result.get(loop).getKey();
          	resultValue = (char[])result.get(loop).getValue();
          	methodOut.setTmAdjPset(resultKey);
          	
          	loop++;
          	resultKey = (char[])result.get(loop).getKey();
          	resultValue = (char[])result.get(loop).getValue();
          	methodOut.setTmAdjDdrKey(resultKey);
          	
          	loop++;
          	resultKey = (char[])result.get(loop).getKey();
          	resultValue = (char[])result.get(loop).getValue();
          	methodOut.setTmAdjDepAcct(resultKey);
          	
          	loop++;
          	resultKey = (char[])result.get(loop).getKey();
          	resultValue = (char[])result.get(loop).getValue();
          	if(resultKey.length == 0 ) {methodOut.setTmAdjDepAmt(new BigDecimal(0));} else {methodOut.setTmAdjDepAmt(new BigDecimal(String.valueOf(resultKey)));}
          	
          	loop++;
          	resultKey = (char[])result.get(loop).getKey();
          	resultValue = (char[])result.get(loop).getValue();
          	if(resultKey.length == 0 ) {methodOut.setTmAdjCorrAmt(new BigDecimal(0));} else {methodOut.setTmAdjCorrAmt(new BigDecimal(String.valueOf(resultKey)));}
          	
          	loop++;
          	resultKey = (char[])result.get(loop).getKey();
          	resultValue = (char[])result.get(loop).getValue();
          	methodOut.setTmAdjClass(resultKey);
          	
          	loop++;
          	resultKey = (char[])result.get(loop).getKey();
          	resultValue = (char[])result.get(loop).getValue();
          	methodOut.setTmAdjCode(resultKey);
          	
          	loop++;
          	resultKey = (char[])result.get(loop).getKey();
          	resultValue = (char[])result.get(loop).getValue();
          	methodOut.setTmAdjName(resultKey);
          	
          	loop++;
          	resultKey = (char[])result.get(loop).getKey();
          	resultValue = (char[])result.get(loop).getValue();
          	methodOut.setTmAdjOperNo(resultKey);
          	
          	loop++;
          	resultKey = (char[])result.get(loop).getKey();
          	resultValue = (char[])result.get(loop).getValue();
          	methodOut.setTmAdjEntryKey(resultKey);
          	
          	loop++;
          	resultKey = (char[])result.get(loop).getKey();
          	resultValue = (char[])result.get(loop).getValue();
          	methodOut.setTmAdjState(resultKey);
          	
          	loop++;
          	resultKey = (char[])result.get(loop).getKey();
          	resultValue = (char[])result.get(loop).getValue();
          	methodOut.setTmAdjComment(resultKey);
          	
          	loop++;
          	resultKey = (char[])result.get(loop).getKey();
          	resultValue = (char[])result.get(loop).getValue();
          	methodOut.setTmAdjRt(resultKey);
          	
          	loop++;
          	resultKey = (char[])result.get(loop).getKey();
          	resultValue = (char[])result.get(loop).getValue();
          	if(resultKey.length == 0 ) {methodOut.setTmAdjAmt(new BigDecimal(0));} else {methodOut.setTmAdjAmt(new BigDecimal(String.valueOf(resultKey)));}
          	
          	loop++;
          	resultKey = (char[])result.get(loop).getKey();
          	resultValue = (char[])result.get(loop).getValue();
          	methodOut.setTmAdjItemClass(resultKey);
          	
          	loop++;
          	resultKey = (char[])result.get(loop).getKey();
          	resultValue = (char[])result.get(loop).getValue();
          	methodOut.setTmAdjFirstDrn(resultKey);
          	
          	loop++;
          	resultKey = (char[])result.get(loop).getKey();
          	resultValue = (char[])result.get(loop).getValue();
          	methodOut.setTmAdjDrn(resultKey);
          	
          	loop++;
          	resultKey = (char[])result.get(loop).getKey();
          	resultValue = (char[])result.get(loop).getValue();
          	methodOut.setTmAdjLookupText(resultKey);
          	
          	loop++;
          	resultKey = (char[])result.get(loop).getKey();
          	resultValue = (char[])result.get(loop).getValue();
          	methodOut.setTmAdjAdviceKey(resultKey);
          	
          	loop++;
          	resultKey = (char[])result.get(loop).getKey();
          	resultValue = (char[])result.get(loop).getValue();
          	methodOut.setTmAdjCorrF5(resultKey);
          	
          	loop++;
          	resultKey = (char[])result.get(loop).getKey();
          	resultValue = (char[])result.get(loop).getValue();
          	methodOut.setTmAdjDepF5(resultKey);
          	
          	loop++;
          	resultKey = (char[])result.get(loop).getKey();
          	resultValue = (char[])result.get(loop).getValue();
          	methodOut.setTmAdjAppInstance(resultKey);
          	
          	loop++;
          	resultKey = (char[])result.get(loop).getKey();
          	resultValue = (char[])result.get(loop).getValue();
          	methodOut.setTmAdjEntry(resultKey);
          	
          	loop++;
          	resultKey = (char[])result.get(loop).getKey();
          	resultValue = (char[])result.get(loop).getValue();
          	methodOut.setTmAdjCycle(resultKey);
          	
          	loop++;
          	resultKey = (char[])result.get(loop).getKey();
          	resultValue = (char[])result.get(loop).getValue();
          	methodOut.setTmAdjEnd(resultKey);
          	
          	loop++;
          }
          catch(IndexOutOfBoundsException e ){
          	//logger.info(e.getMessage());
          }
//  PERFORM 1400-CREATE-AE-OUTPUT-RECORD THRU 1400-EXIT
          createAeOutputRecord(programCtx.getCreateAeOutputRecordInCtx());/*1400-CREATE-AE-OUTPUT-RECORD*/
//  PERFORM 0100-READ-TM-FILE THRU 0100-EXIT
          readTmFile(programCtx);/*0100-READ-TM-FILE*/
          ;
      
      return methodOut;
      }
      /**
      * createAeOutputRecord 
      *   This method is derived from 
  *   COBOL Paragraph - 1400-CREATE-AE-OUTPUT-RECORD COBOL Cyclomatic complexity - 6
      * Input  :  

      * - taAdjCode                      COBOL Name: TA-ADJ-CODE
      * - taAdjIndexMax                  COBOL Name: TA-ADJ-INDEX-MAX
      * - tmAdjCode                      COBOL Name: TM-ADJ-CODE
      * - tmAdjNo                        COBOL Name: TM-ADJ-NO
      * - tmAdjDate                      COBOL Name: TM-ADJ-DATE
      * - tmAdjTime                      COBOL Name: TM-ADJ-TIME
      * - tmAdjAcct                      COBOL Name: TM-ADJ-ACCT
      * - tmAdjDepDdrKey                 COBOL Name: TM-ADJ-DEP-DDR-KEY
      * - tmAdjPset                      COBOL Name: TM-ADJ-PSET
      * - tmAdjDdrKey                    COBOL Name: TM-ADJ-DDR-KEY
      * - tmAdjDepAcct                   COBOL Name: TM-ADJ-DEP-ACCT
      * - tmAdjDepAmt                    COBOL Name: TM-ADJ-DEP-AMT
      * - tmAdjCorrAmt                   COBOL Name: TM-ADJ-CORR-AMT
      * - tmAdjClass                     COBOL Name: TM-ADJ-CLASS
      * - tmAdjName                      COBOL Name: TM-ADJ-NAME
      * - tmAdjOperNo                    COBOL Name: TM-ADJ-OPER-NO
      * - tmAdjEntryKey                  COBOL Name: TM-ADJ-ENTRY-KEY
      * - tmAdjState                     COBOL Name: TM-ADJ-STATE
      * - tmAdjComment                   COBOL Name: TM-ADJ-COMMENT
      * - tmAdjRt                        COBOL Name: TM-ADJ-RT
      * - tmAdjAmt                       COBOL Name: TM-ADJ-AMT
      * - tmAdjItemClass                 COBOL Name: TM-ADJ-ITEM-CLASS
      * - tmAdjFirstDrn                  COBOL Name: TM-ADJ-FIRST-DRN
      * - tmAdjDrn                       COBOL Name: TM-ADJ-DRN
      * - tmAdjLookupText                COBOL Name: TM-ADJ-LOOKUP-TEXT
      * - tmAdjAdviceKey                 COBOL Name: TM-ADJ-ADVICE-KEY
      * - tmAdjCorrF5                    COBOL Name: TM-ADJ-CORR-F5
      * - tmAdjDepF5                     COBOL Name: TM-ADJ-DEP-F5
      * - tmAdjAppInstance               COBOL Name: TM-ADJ-APP-INSTANCE
      * - tmAdjEntry                     COBOL Name: TM-ADJ-ENTRY
      * - tmAdjCycle                     COBOL Name: TM-ADJ-CYCLE
      * - tmAdjEnd                       COBOL Name: TM-ADJ-END
      * - taBankNo                       COBOL Name: TA-BANK-NO
      * - taDeptNo                       COBOL Name: TA-DEPT-NO
      * - taClerkId                      COBOL Name: TA-CLERK-ID
      * - taAcctCd                       COBOL Name: TA-ACCT-CD
      * - taSrcReceiptCd                 COBOL Name: TA-SRC-RECEIPT-CD
      * - taSrcErrorCd                   COBOL Name: TA-SRC-ERROR-CD
      * - taTypeCd                       COBOL Name: TA-TYPE-CD
      * - tmAdjDateMm                    COBOL Name: TM-ADJ-DATE-MM
      * - tmAdjDateDd                    COBOL Name: TM-ADJ-DATE-DD
      * - tmAdjDateYyyy                  COBOL Name: TM-ADJ-DATE-YYYY
      * - waCdMm                         COBOL Name: WA-CD-MM
      * - waCdDd                         COBOL Name: WA-CD-DD
      * - waCdYyyy                       COBOL Name: WA-CD-YYYY
      *
      * Output :  

      * - ov4ParameterList               COBOL Name: OV4-PARAMETER-LIST
      * - ov4BankNo                      COBOL Name: OV4-BANK-NO
      * - ov4DeptNo                      COBOL Name: OV4-DEPT-NO
      * - ov4InJulYear                   COBOL Name: OV4-IN-JUL-YEAR
      * - ov4InJulDay                    COBOL Name: OV4-IN-JUL-DAY
      * - ov4InBatch                     COBOL Name: OV4-IN-BATCH
      * - ov4InSeqInBat                  COBOL Name: OV4-IN-SEQ-IN-BAT
      * - ov4GlAccountNumber             COBOL Name: OV4-GL-ACCOUNT-NUMBER
      * - ov4CycleDate                   COBOL Name: OV4-CYCLE-DATE
      * - ov4EntryNumber                 COBOL Name: OV4-ENTRY-NUMBER
      * - ov4TrcrNo                      COBOL Name: OV4-TRCR-NO
      * - ov4BlkNo                       COBOL Name: OV4-BLK-NO
      * - ov4SeqNo                       COBOL Name: OV4-SEQ-NO
      * - ov4Aba                         COBOL Name: OV4-ABA
      * - ov4AcctNo                      COBOL Name: OV4-ACCT-NO
      * - ov4Amnt                        COBOL Name: OV4-AMNT
      * - ov4AdjAmnt                     COBOL Name: OV4-ADJ-AMNT
      * - ov4IclDate                     COBOL Name: OV4-ICL-DATE
      * - ov4IclFromAba                  COBOL Name: OV4-ICL-FROM-ABA
      * - ov4IclToAba                    COBOL Name: OV4-ICL-TO-ABA
      * - ov4IclAmt                      COBOL Name: OV4-ICL-AMT
      * - ov4IclTapeTotal                COBOL Name: OV4-ICL-TAPE-TOTAL
      * - ov4IclPrevious                 COBOL Name: OV4-ICL-PREVIOUS
      * - ov4IclNext                     COBOL Name: OV4-ICL-NEXT
      * - ov4IclListedAs                 COBOL Name: OV4-ICL-LISTED-AS
      * - ov4IclShouldBe                 COBOL Name: OV4-ICL-SHOULD-BE
      * - ov4IclSerialNo                 COBOL Name: OV4-ICL-SERIAL-NO
      * - ov4Md2CrTc                     COBOL Name: OV4-MD2-CR-TC
      * - ov4Md2CrAmt                    COBOL Name: OV4-MD2-CR-AMT
      * - ov4Md1RrKblk                   COBOL Name: OV4-MD1-RR-KBLK
      * - taAdjIndex                     COBOL Name: TA-ADJ-INDEX
      * - taBankNo                       COBOL Name: TA-BANK-NO
      * - taDeptNo                       COBOL Name: TA-DEPT-NO
      * - ov4ClerkId                     COBOL Name: OV4-CLERK-ID
      * - taClerkId                      COBOL Name: TA-CLERK-ID
      * - ov4AcctCd                      COBOL Name: OV4-ACCT-CD
      * - taAcctCd                       COBOL Name: TA-ACCT-CD
      * - ov4SrcReceiptCd                COBOL Name: OV4-SRC-RECEIPT-CD
      * - taSrcReceiptCd                 COBOL Name: TA-SRC-RECEIPT-CD
      * - ov4SrcErrorCd                  COBOL Name: OV4-SRC-ERROR-CD
      * - taSrcErrorCd                   COBOL Name: TA-SRC-ERROR-CD
      * - ov4TypeCd                      COBOL Name: OV4-TYPE-CD
      * - taTypeCd                       COBOL Name: TA-TYPE-CD
      * - ov4CycleDateMm                 COBOL Name: OV4-CYCLE-DATE-MM
      * - tmAdjDateMm                    COBOL Name: TM-ADJ-DATE-MM
      * - ov4CycleDateDd                 COBOL Name: OV4-CYCLE-DATE-DD
      * - tmAdjDateDd                    COBOL Name: TM-ADJ-DATE-DD
      * - ov4CycleDateYy                 COBOL Name: OV4-CYCLE-DATE-YY
      * - tmAdjDateYyyy                  COBOL Name: TM-ADJ-DATE-YYYY
      * - waCurrentDate                  COBOL Name: WA-CURRENT-DATE
      * - ov4CurrentDate                 COBOL Name: OV4-CURRENT-DATE
      * - waCdMm                         COBOL Name: WA-CD-MM
      * - waCdDd                         COBOL Name: WA-CD-DD
      * - waCdYyyy                       COBOL Name: WA-CD-YYYY
      * - ov4CycleNo                     COBOL Name: OV4-CYCLE-NO
      * - tmAdjCycle                     COBOL Name: TM-ADJ-CYCLE
      * - tmAdjEntry                     COBOL Name: TM-ADJ-ENTRY
      * - tmAdjDrn                       COBOL Name: TM-ADJ-DRN
      * - ov4AbaNo                       COBOL Name: OV4-ABA-NO
      * - tmAdjRt                        COBOL Name: TM-ADJ-RT
      * - ov4AcctAppl                    COBOL Name: OV4-ACCT-APPL
      * - tmAdjAcct                      COBOL Name: TM-ADJ-ACCT
      * - ov4Md2CrAcct                   COBOL Name: OV4-MD2-CR-ACCT
      * - ov4AdjSign                     COBOL Name: OV4-ADJ-SIGN
      * - ov4AmntSign                    COBOL Name: OV4-AMNT-SIGN
      * - ov4Md1SortType                 COBOL Name: OV4-MD1-SORT-TYPE
      * - ov4Md1Oper                     COBOL Name: OV4-MD1-OPER
      * - ov4Md1Tracer                   COBOL Name: OV4-MD1-TRACER
      * - ov4Md1Block                    COBOL Name: OV4-MD1-BLOCK
      *
      * @throws CFException
      */
      @Override
      public CreateAeOutputRecordOutCtx createAeOutputRecord(CreateAeOutputRecordInCtx methodIn) throws Exception {
UsbaeextCtx programCtx = methodIn.getUsbaeextCtx();
CreateAeOutputRecordOutCtx methodOut = methodIn.getCreateAeOutputRecordOutCtx();
//  MOVE SPACES TO OV4-PARAMETER-LIST
          methodOut.getOv4ParameterList().setString(CONSTANTS.SPACE_525);
//  MOVE ZEROS TO OV4-BANK-NO OV4-DEPT-NO OV4-IN-JUL-YEAR OV4-IN-JUL-DAY OV4-IN-BATCH OV4-IN-SEQ-IN-BAT OV4-GL-ACCOUNT-NUMBER OV4-CYCLE-DATE OV4-ENTRY-NUMBER OV4-TRCR-NO OV4-BLK-NO OV4-SEQ-NO OV4-ABA OV4-ACCT-NO OV4-AMNT OV4-ADJ-AMNT OV4-ICL-DATE OV4-ICL-FROM-ABA OV4-ICL-TO-ABA OV4-ICL-AMT OV4-ICL-TAPE-TOTAL OV4-ICL-PREVIOUS OV4-ICL-NEXT OV4-ICL-LISTED-AS OV4-ICL-SHOULD-BE OV4-ICL-FROM-ABA OV4-ICL-TO-ABA OV4-ICL-SERIAL-NO OV4-MD2-CR-TC OV4-MD2-CR-AMT
          methodOut.setOv4BankNo(0);
          methodOut.setOv4DeptNo(0);
          methodOut.setOv4InJulYear(0);
          methodOut.setOv4InJulDay(0);
          methodOut.setOv4InBatch(0);
          methodOut.setOv4InSeqInBat(0);
          methodOut.setOv4GlAccountNumber(0);
          methodOut.setOv4CycleDate(0);
          methodOut.setOv4EntryNumber(0);
          methodOut.setOv4TrcrNo(0);
          methodOut.setOv4BlkNo(0);
          methodOut.setOv4SeqNo(0);
          methodOut.getOv4Aba().setString(CONSTANTS.ZERO_9);
          methodOut.setOv4AcctNo(0);
          methodOut.setOv4Amnt(BigDecimal.ZERO);
          methodOut.setOv4AdjAmnt(BigDecimal.ZERO);
          methodOut.setOv4IclDate(0);
          methodOut.setOv4IclFromAba(0);
          methodOut.setOv4IclToAba(0);
          methodOut.setOv4IclAmt(BigDecimal.ZERO);
          methodOut.setOv4IclTapeTotal(BigDecimal.ZERO);
          methodOut.setOv4IclPrevious(BigDecimal.ZERO);
          methodOut.setOv4IclNext(BigDecimal.ZERO);
          methodOut.setOv4IclListedAs(BigDecimal.ZERO);
          methodOut.setOv4IclShouldBe(BigDecimal.ZERO);
          methodOut.setOv4IclFromAba(0);
          methodOut.setOv4IclToAba(0);
          methodOut.setOv4IclSerialNo(0);
          methodOut.setOv4Md2CrTc(CONSTANTS.ZERO_5);
          methodOut.setOv4Md2CrAmt(BigDecimal.ZERO);
//  MOVE '0000 ' TO OV4-MD1-RR-KBLK
//  LITERAL_0000_B_ = '0000 '
          methodOut.setOv4Md1RrKblk(CONSTANTS.LITERAL_0000_B_);
//  SET TA-ADJ-INDEX TO 1
          methodOut.setTaAdjIndex(1); 
          
//  PERFORM UNTIL TA-ADJ-CODE ( TA-ADJ-INDEX ) = LOW-VALUES OR TA-ADJ-INDEX NOT < TA-ADJ-INDEX-MAX
          while ((!( checkLowValue(methodIn.getTaAdjCode(methodOut.getTaAdjIndex() - 1)) )  && 	( methodOut.getTaAdjIndex() < methodIn.getTaAdjIndexMax() ))) {

// ************Display ' tm-adj-code ->' tm-adj-code
// ************        ' ta-adj-code(ta-adj-index) ->'
// ************          ta-adj-code(ta-adj-index)
//  IF TM-ADJ-CODE = TA-ADJ-CODE ( TA-ADJ-INDEX )
              if (		compareChars(methodIn.getTmAdjCode(),methodIn.getTaAdjCode(methodOut.getTaAdjIndex() - 1)) == 0 ) { 
//  DISPLAY ' '
                  logger.info(" "); 
//  DISPLAY ' ADJUSTMENT CODE MATCH ' ' TM-ADJ-CODE ->' TM-ADJ-CODE
                  logger.info(" ADJUSTMENT CODE MATCH  TM-ADJ-CODE ->{}", new String(methodIn.getTmAdjCode())); 
//  DISPLAY ' '
                  logger.info(" "); 
//  DISPLAY ' TM-ADJ-NO              PIC 9(07)=' TM-ADJ-NO
                  logger.info(" TM-ADJ-NO              PIC 9(07)={}", String.valueOf(methodIn.getTmAdjNo())); 
//  DISPLAY ' TM-ADJ-DATE            PIC X(10)=' TM-ADJ-DATE
                  logger.info(" TM-ADJ-DATE            PIC X(10)={}", methodIn.getTmAdjDate().toString()); 
//  DISPLAY ' TM-ADJ-TIME            PIC 9(07)=' TM-ADJ-TIME
                  logger.info(" TM-ADJ-TIME            PIC 9(07)={}", String.valueOf(methodIn.getTmAdjTime())); 
//  DISPLAY ' TM-ADJ-ACCT  J-RIGHT   PIC X(18)=' TM-ADJ-ACCT
                  logger.info(" TM-ADJ-ACCT  J-RIGHT   PIC X(18)={}", new String(methodOut.getTmAdjAcct())); 
//  DISPLAY ' TM-ADJ-DEP-DDR-KEY     PIC X(08)=' TM-ADJ-DEP-DDR-KEY
                  logger.info(" TM-ADJ-DEP-DDR-KEY     PIC X(08)={}", new String(methodIn.getTmAdjDepDdrKey())); 
//  DISPLAY ' TM-ADJ-PSET            PIC X(01)=' TM-ADJ-PSET
                  logger.info(" TM-ADJ-PSET            PIC X(01)={}", new String(methodIn.getTmAdjPset())); 
//  DISPLAY ' TM-ADJ-DDR-KEY         PIC X(08)=' TM-ADJ-DDR-KEY
                  logger.info(" TM-ADJ-DDR-KEY         PIC X(08)={}", new String(methodIn.getTmAdjDdrKey())); 
//  DISPLAY ' TM-ADJ-DEP-ACCT J-RGHT PIC X(18)=' TM-ADJ-DEP-ACCT
                  logger.info(" TM-ADJ-DEP-ACCT J-RGHT PIC X(18)={}", new String(methodIn.getTmAdjDepAcct())); 
//  DISPLAY ' TM-ADJ-DEP-AMT       PIC 9(16)V99=' TM-ADJ-DEP-AMT
                  logger.info(" TM-ADJ-DEP-AMT       PIC 9(16)V99={}", String.valueOf(methodIn.getTmAdjDepAmt().movePointRight(2))); 
//  DISPLAY ' TM-ADJ-CORR-AMT      PIC 9(16)V99=' TM-ADJ-CORR-AMT
                  logger.info(" TM-ADJ-CORR-AMT      PIC 9(16)V99={}", String.valueOf(methodIn.getTmAdjCorrAmt().movePointRight(2))); 
//  DISPLAY ' TM-ADJ-CLASS           PIC X(02)=' TM-ADJ-CLASS
                  logger.info(" TM-ADJ-CLASS           PIC X(02)={}", new String(methodIn.getTmAdjClass())); 
//  DISPLAY ' TM-ADJ-CODE            PIC X(04)=' TM-ADJ-CODE
                  logger.info(" TM-ADJ-CODE            PIC X(04)={}", new String(methodIn.getTmAdjCode())); 
//  DISPLAY ' TM-ADJ-NAME            PIC X(15)=' TM-ADJ-NAME
                  logger.info(" TM-ADJ-NAME            PIC X(15)={}", new String(methodIn.getTmAdjName())); 
//  DISPLAY ' TM-ADJ-OPER-NO         PIC X(03)=' TM-ADJ-OPER-NO
                  logger.info(" TM-ADJ-OPER-NO         PIC X(03)={}", new String(methodIn.getTmAdjOperNo())); 
//  DISPLAY ' TM-ADJ-ENTRY-KEY       PIC X(05)=' TM-ADJ-ENTRY-KEY
                  logger.info(" TM-ADJ-ENTRY-KEY       PIC X(05)={}", new String(methodIn.getTmAdjEntryKey())); 
//  DISPLAY ' TM-ADJ-STATE           PIC X(03)=' TM-ADJ-STATE
                  logger.info(" TM-ADJ-STATE           PIC X(03)={}", new String(methodIn.getTmAdjState())); 
//  DISPLAY ' TM-ADJ-COMMENT         PIC X(50)=' TM-ADJ-COMMENT
                  logger.info(" TM-ADJ-COMMENT         PIC X(50)={}", new String(methodIn.getTmAdjComment())); 
//  DISPLAY ' TM-ADJ-RT              PIC X(09)=' TM-ADJ-RT
                  logger.info(" TM-ADJ-RT              PIC X(09)={}", new String(methodOut.getTmAdjRt())); 
//  DISPLAY ' TM-ADJ-AMT           PIC 9(16)V99=' TM-ADJ-AMT
                  logger.info(" TM-ADJ-AMT           PIC 9(16)V99={}", String.valueOf(methodIn.getTmAdjAmt().movePointRight(2))); 
//  DISPLAY ' TM-ADJ-ITEM-CLASS      PIC X(02)=' TM-ADJ-ITEM-CLASS
                  logger.info(" TM-ADJ-ITEM-CLASS      PIC X(02)={}", new String(methodIn.getTmAdjItemClass())); 
//  DISPLAY ' TM-ADJ-FIRST-DRN       PIC X(20)=' TM-ADJ-FIRST-DRN
                  logger.info(" TM-ADJ-FIRST-DRN       PIC X(20)={}", new String(methodIn.getTmAdjFirstDrn())); 
//  DISPLAY ' TM-ADJ-DRN             PIC X(20)=' TM-ADJ-DRN
                  logger.info(" TM-ADJ-DRN             PIC X(20)={}", new String(methodOut.getTmAdjDrn())); 
//  DISPLAY ' TM-ADJ-LOOKUP-TEXT     PIC X(30)=' TM-ADJ-LOOKUP-TEXT
                  logger.info(" TM-ADJ-LOOKUP-TEXT     PIC X(30)={}", new String(methodIn.getTmAdjLookupText())); 
//  DISPLAY ' TM-ADJ-ADVICE-KEY      PIC X(08)=' TM-ADJ-ADVICE-KEY
                  logger.info(" TM-ADJ-ADVICE-KEY      PIC X(08)={}", new String(methodIn.getTmAdjAdviceKey())); 
//  DISPLAY ' TM-ADJ-CORR-F5         PIC X(10)=' TM-ADJ-CORR-F5
                  logger.info(" TM-ADJ-CORR-F5         PIC X(10)={}", new String(methodIn.getTmAdjCorrF5())); 
//  DISPLAY ' TM-ADJ-DEP-F5          PIC X(10)=' TM-ADJ-DEP-F5
                  logger.info(" TM-ADJ-DEP-F5          PIC X(10)={}", new String(methodIn.getTmAdjDepF5())); 
//  DISPLAY ' TM-ADJ-APP-INSTANCE    PIC X(02)=' TM-ADJ-APP-INSTANCE
                  logger.info(" TM-ADJ-APP-INSTANCE    PIC X(02)={}", new String(methodIn.getTmAdjAppInstance())); 
//  DISPLAY ' TM-ADJ-ENTRY           PIC X(04)=' TM-ADJ-ENTRY
                  logger.info(" TM-ADJ-ENTRY           PIC X(04)={}", new String(methodOut.getTmAdjEntry())); 
//  DISPLAY ' TM-ADJ-CYCLE           PIC X(01)=' TM-ADJ-CYCLE
                  logger.info(" TM-ADJ-CYCLE           PIC X(01)={}", new String(methodOut.getTmAdjCycle())); 
//  DISPLAY ' TM-ADJ-END             PIC X(03)=' TM-ADJ-END
                  logger.info(" TM-ADJ-END             PIC X(03)={}", new String(methodIn.getTmAdjEnd())); 
//  MOVE TA-BANK-NO ( TA-ADJ-INDEX ) TO OV4-BANK-NO
                  methodOut.setOv4BankNo(CFUtil.getInt(methodOut.getTaBankNo(methodOut.getTaAdjIndex() - 1)));
//  MOVE TA-DEPT-NO ( TA-ADJ-INDEX ) TO OV4-DEPT-NO
                  methodOut.setOv4DeptNo(CFUtil.getInt(methodOut.getTaDeptNo(methodOut.getTaAdjIndex() - 1)));
//  MOVE TA-CLERK-ID ( TA-ADJ-INDEX ) TO OV4-CLERK-ID
                  methodOut.setOv4ClerkId(methodOut.getTaClerkId(methodOut.getTaAdjIndex() - 1));
//  MOVE TA-ACCT-CD ( TA-ADJ-INDEX ) TO OV4-ACCT-CD
                  methodOut.setOv4AcctCd(methodOut.getTaAcctCd(methodOut.getTaAdjIndex() - 1));
//  MOVE TA-SRC-RECEIPT-CD ( TA-ADJ-INDEX ) TO OV4-SRC-RECEIPT-CD
                  methodOut.setOv4SrcReceiptCd(methodOut.getTaSrcReceiptCd(methodOut.getTaAdjIndex() - 1));
//  MOVE TA-SRC-ERROR-CD ( TA-ADJ-INDEX ) TO OV4-SRC-ERROR-CD
                  methodOut.setOv4SrcErrorCd(methodOut.getTaSrcErrorCd(methodOut.getTaAdjIndex() - 1));
//  MOVE TA-TYPE-CD ( TA-ADJ-INDEX ) TO OV4-TYPE-CD
                  methodOut.setOv4TypeCd(methodOut.getTaTypeCd(methodOut.getTaAdjIndex() - 1));
                  // MOVE TM-ADJ-DATE-MM TO OV4-CYCLE-DATE-MM
                  methodOut.setOv4CycleDateMm(padLeftZeros(2,methodOut.getTmAdjDateMm(),false));
                  // MOVE TM-ADJ-DATE-DD TO OV4-CYCLE-DATE-DD
                  methodOut.setOv4CycleDateDd(padLeftZeros(2,methodOut.getTmAdjDateDd(),false));
//  MOVE TM-ADJ-DATE-YYYY (3 : 2) TO OV4-CYCLE-DATE-YY
                  methodOut.setOv4CycleDateYy(CFUtil.getInt(substring(methodOut.getTmAdjDateYyyy(),2,4)));
//  MOVE FUNCTION CURRENT-DATE TO WA-CURRENT-DATE
                  methodOut.setWaCurrentDate( substring(CFUtil.getCurrentDate(timeZoneId),0,21));
//  MOVE WA-CD-MM TO OV4-CURRENT-DATE (1 : 2)
                  methodOut.getOv4ParameterList().replace(methodIn.getWaCurrentDateGroup()/*parent*/,4/*fromOffset - (ov4CurrentDate) */,2/*fromLen*/,57/*toOffset - (waCdMm) */,2/*toLen*/);
//  MOVE '/' TO OV4-CURRENT-DATE (3 : 1)
//  LITERAL_SL_ = '/'
                  methodOut.setOv4CurrentDate(replace(methodOut.getOv4CurrentDate(),CONSTANTS.LITERAL_SL_,2,3));
//  MOVE WA-CD-DD TO OV4-CURRENT-DATE (4 : 2)
                  methodOut.getOv4ParameterList().replace(methodIn.getWaCurrentDateGroup()/*parent*/,6/*fromOffset - (ov4CurrentDate) */,2/*fromLen*/,57+4 - 1/*toOffset - (waCdDd) */,2/*toLen*/);
//  MOVE '/' TO OV4-CURRENT-DATE (6 : 1)
//  LITERAL_SL_ = '/'
                  methodOut.setOv4CurrentDate(replace(methodOut.getOv4CurrentDate(),CONSTANTS.LITERAL_SL_,5,6));
//  MOVE WA-CD-YYYY TO OV4-CURRENT-DATE (7 : 4)
                  methodOut.getOv4ParameterList().replace(methodIn.getWaCurrentDateGroup()/*parent*/,0/*fromOffset - (ov4CurrentDate) */,4/*fromLen*/,57+7 - 1/*toOffset - (waCdYyyy) */,4/*toLen*/);
//  MOVE TM-ADJ-CYCLE TO OV4-CYCLE-NO (2 : 1)
                  methodOut.setOv4CycleNo(methodOut.getTmAdjCycle(),0,methodOut.getTmAdjCycle().length,1/* ov4CycleNo */ ,1 /* field,targetIndex,targetLen */);
//  MOVE TM-ADJ-ENTRY TO OV4-ENTRY-NUMBER OV4-TRCR-NO
                  methodOut.setOv4EntryNumber(padLeftZeros(4,methodOut.getTmAdjEntry(),false));
                  methodOut.setOv4TrcrNo(padLeftZeros(4,methodOut.getTmAdjEntry(),false));
//  MOVE ZEROS TO OV4-BLK-NO
                  methodOut.setOv4BlkNo(0);
//  MOVE TM-ADJ-DRN TO OV4-SEQ-NO
                  methodOut.setOv4SeqNo(padLeftZeros(12,methodOut.getTmAdjDrn(),false));
//  MOVE '00' TO OV4-SEQ-NO (1 : 2)
//  LITERAL_00 = '00'
                  methodOut.setOv4SeqNo(replace(String.valueOf(methodOut.getOv4SeqNoString()).toCharArray(),CONSTANTS.LITERAL_00,0,2));
//  MOVE TM-ADJ-RT (1 : 8) TO OV4-ABA-NO
                  try {
                  methodOut.setOv4AbaNo(CFUtil.getLong(substring(methodOut.getTmAdjRt(),0,8)));
                  } catch(NumberFormatException e) {}
//  MOVE 'G' TO OV4-ACCT-APPL
//  LITERAL_G = 'G'
                  methodOut.setOv4AcctAppl(CONSTANTS.LITERAL_G);
//  MOVE '0300' TO OV4-ACCT-NO (1 : 4)
//  LITERAL_0300 = '0300'
                  methodOut.setOv4AcctNo(replace(String.valueOf(methodOut.getOv4AcctNoString()).toCharArray(),CONSTANTS.LITERAL_0300,0,4));
//  MOVE TM-ADJ-ACCT (5 : 14) TO OV4-ACCT-NO (5 : 14)
                  methodOut.setOv4AcctNo(replace(String.valueOf(methodOut.getOv4AcctNoString()).toCharArray(),substring(methodOut.getTmAdjAcct(),4,18),4,18));
//  INSPECT OV4-ACCT-NO REPLACING ALL ' ' BY '0'
                  methodOut.setOv4AcctNo(  replaceAll(String.valueOf(methodOut.getOv4AcctNoString()).toCharArray(),CONSTANTS.SPACE,CONSTANTS.LITERAL_0)  );
//  MOVE TM-ADJ-ACCT TO OV4-MD2-CR-ACCT
                  methodOut.setOv4Md2CrAcct(padLeftZeros(12,methodOut.getTmAdjAcct(),false));
//  MOVE 030000009031851461 TO OV4-GL-ACCOUNT-NUMBER
                  methodOut.setOv4GlAccountNumber(30000009031851461l);
                  methodOut.setOv4AdjAmnt(methodIn.getTmAdjCorrAmt().divide(BigDecimal.valueOf(100),18,RoundingMode.DOWN).setScale(2,BigDecimal.ROUND_DOWN));
                  if(methodOut.getOv4AdjAmnt().signum() < 0 )  methodOut.setOv4AdjAmnt(methodOut.getOv4AdjAmnt().negate());
//  DISPLAY ' '
                  logger.info(" "); 
//  DISPLAY ' TM-ADJ-CORR-AMT  ->' TM-ADJ-CORR-AMT ' OV4-ADJ-AMNT ->' OV4-ADJ-AMNT
                  logger.info(" TM-ADJ-CORR-AMT  ->{} OV4-ADJ-AMNT ->{}", String.valueOf(methodIn.getTmAdjCorrAmt().movePointRight(2)), String.valueOf(methodOut.getOv4AdjAmnt().movePointRight(2))); 
//  IF TM-ADJ-RT (1 : 8) = '52300932' OR TM-ADJ-RT (1 : 8) = '54321048'
//  LITERAL_54321048 = '54321048'
                  if (Field.compareChar(methodOut.getTmAdjRt() , CONSTANTS.LITERAL_52300932 , ( 0 /*start*/ ), 8 /*left len*/ , 8 /*right len*/) || Field.compareChar(methodOut.getTmAdjRt() , CONSTANTS.LITERAL_54321048 , ( 0 /*start*/ ), 8 /*left len*/ , 8 /*right len*/)) { 
//  MOVE 'C' TO OV4-ADJ-SIGN
//  LITERAL_C = 'C'
                      methodOut.setOv4AdjSign(CONSTANTS.LITERAL_C);
                  }
//  ELSE
                  else { 
//  MOVE 'D' TO OV4-ADJ-SIGN
//  LITERAL_D = 'D'
                      methodOut.setOv4AdjSign(CONSTANTS.LITERAL_D);
                  }
//  MOVE SPACES TO OV4-AMNT-SIGN
                  methodOut.setOv4AmntSign(CONSTANTS.SPACE);
                  // MOVE '150' TO OV4-MD1-SORT-TYPE
                  //  LITERAL_150 = '150'
                  methodOut.setOv4Md1SortType(CONSTANTS.LITERAL_150);
//  MOVE 'TM   ' TO OV4-MD1-OPER
//  LITERAL_TM_B3_ = 'TM   '
                  methodOut.setOv4Md1Oper(CONSTANTS.LITERAL_TM_B3_);
//  MOVE TM-ADJ-ENTRY TO OV4-MD1-TRACER OV4-MD1-BLOCK
                  methodOut.setOv4Md1Tracer(methodOut.getTmAdjEntry());
                  methodOut.setOv4Md1Block(methodOut.getTmAdjEntry());
//  WRITE OV4-PARAMETER-LIST
                  aeOutputFile.write(methodOut.getOv4ParameterList().toCharArray()); 
                  methodOut.getOv4ParameterList().setString(CONSTANTS.LOW_VALUE_215633691);
//  SET TA-ADJ-INDEX TO TA-ADJ-INDEX-MAX
                  methodOut.setTaAdjIndex(methodIn.getTaAdjIndexMax()); 
                  
              }
//  SET TA-ADJ-INDEX UP BY 1
              methodOut.setTaAdjIndex(methodOut.getTaAdjIndex() + 1); 
              
          }
      
      return methodOut;
      }
      /**
      * readAdjTable 
      *   This method is derived from 
  *   COBOL Paragraph - 2000-READ-ADJ-TABLE COBOL Cyclomatic complexity - 2
      * Input  : None 

      * Output :  

      * - adjtable                       COBOL Name: ADJTABLE
      * - waEndSw                        COBOL Name: WA-END-SW
      * - adjtblColumn1                  COBOL Name: ADJTBL-COLUMN-1
      *
      * @throws CFException
      */
      @Override
      public ReadAdjTableOutCtx readAdjTable(UsbaeextCtx programCtx) throws Exception {
          programCtx.setLoopReadAdjTable(false);
ReadAdjTableOutCtx methodOut = programCtx.getReadAdjTableOutCtx();
          // READ ADJ-TABLE
          adjTable.read();
          if (!adjTable.hasEnded()) {
            methodOut.getAdjtable().setString(adjTable.getRecord());
          }
//  AT END
          if (adjTable.hasEnded()) {  
              // MOVE HIGH-VALUES TO WA-END-SW
              methodOut.setWaEndSw(CONSTANTS.HIGH_VALUE_STRING);
//cobolCode::GO TO 2000-EXIT
return methodOut;
//cobolCodeEnds::GO TO 2000-EXIT
            }
//  IF ADJTBL-COMMENT-LINE
          if ( methodOut.isAdjtblCommentLine()  ) { 
//cobolCode::GO TO 2000-READ-ADJ-TABLE
programCtx.setLoopReadAdjTable(true);
return methodOut;
//cobolCodeEnds::GO TO 2000-READ-ADJ-TABLE
          }
      
      return methodOut;
      }
      /**
      * processAdjTable 
      *   This method is derived from 
  *   COBOL Paragraph - 2100-PROCESS-ADJ-TABLE COBOL Cyclomatic complexity - 1
      * Input  :  

      * - adjtblCpcsSite                 COBOL Name: ADJTBL-CPCS-SITE
      * - adjtblAdjustmentCode           COBOL Name: ADJTBL-ADJUSTMENT-CODE
      * - adjtblSortType                 COBOL Name: ADJTBL-SORT-TYPE
      * - adjtblBankNumber               COBOL Name: ADJTBL-BANK-NUMBER
      * - adjtblDeptNumber               COBOL Name: ADJTBL-DEPT-NUMBER
      * - adjtblAccountCode              COBOL Name: ADJTBL-ACCOUNT-CODE
      * - adjtblTypeCode                 COBOL Name: ADJTBL-TYPE-CODE
      * - adjtblClerkId                  COBOL Name: ADJTBL-CLERK-ID
      * - adjtblSrcReceiptCd             COBOL Name: ADJTBL-SRC-RECEIPT-CD
      * - adjtblSrcErrorCd               COBOL Name: ADJTBL-SRC-ERROR-CD
      * - taAdjIndexMax                  COBOL Name: TA-ADJ-INDEX-MAX
      *
      * Output :  

      * - taSiteCode                     COBOL Name: TA-SITE-CODE
      * - adjtblCpcsSite                 COBOL Name: ADJTBL-CPCS-SITE
      * - taAdjCode                      COBOL Name: TA-ADJ-CODE
      * - adjtblAdjustmentCode           COBOL Name: ADJTBL-ADJUSTMENT-CODE
      * - taSortType                     COBOL Name: TA-SORT-TYPE
      * - adjtblSortType                 COBOL Name: ADJTBL-SORT-TYPE
      * - taBankNo                       COBOL Name: TA-BANK-NO
      * - adjtblBankNumber               COBOL Name: ADJTBL-BANK-NUMBER
      * - taDeptNo                       COBOL Name: TA-DEPT-NO
      * - adjtblDeptNumber               COBOL Name: ADJTBL-DEPT-NUMBER
      * - taAcctCd                       COBOL Name: TA-ACCT-CD
      * - adjtblAccountCode              COBOL Name: ADJTBL-ACCOUNT-CODE
      * - taTypeCd                       COBOL Name: TA-TYPE-CD
      * - adjtblTypeCode                 COBOL Name: ADJTBL-TYPE-CODE
      * - taClerkId                      COBOL Name: TA-CLERK-ID
      * - adjtblClerkId                  COBOL Name: ADJTBL-CLERK-ID
      * - taSrcReceiptCd                 COBOL Name: TA-SRC-RECEIPT-CD
      * - adjtblSrcReceiptCd             COBOL Name: ADJTBL-SRC-RECEIPT-CD
      * - taSrcErrorCd                   COBOL Name: TA-SRC-ERROR-CD
      * - adjtblSrcErrorCd               COBOL Name: ADJTBL-SRC-ERROR-CD
      * - taAdjCodeCnt                   COBOL Name: TA-ADJ-CODE-CNT
      * - taAdjIndexMax                  COBOL Name: TA-ADJ-INDEX-MAX
      * - taAdjIndex                     COBOL Name: TA-ADJ-INDEX
      *
      * @throws CFException
      */
      @Override
      public ProcessAdjTableOutCtx processAdjTable(ProcessAdjTableInCtx methodIn) throws Exception {
UsbaeextCtx programCtx = methodIn.getUsbaeextCtx();
ProcessAdjTableOutCtx methodOut = methodIn.getProcessAdjTableOutCtx();
//  MOVE ADJTBL-CPCS-SITE TO TA-SITE-CODE ( TA-ADJ-INDEX )
          methodOut.setTaSiteCode(methodOut.getTaAdjIndex() - 1,methodOut.getAdjtblCpcsSite());
//  MOVE ADJTBL-ADJUSTMENT-CODE TO TA-ADJ-CODE ( TA-ADJ-INDEX )
          methodOut.setTaAdjCode(methodOut.getTaAdjIndex() - 1,methodOut.getAdjtblAdjustmentCode());
//  MOVE ADJTBL-SORT-TYPE TO TA-SORT-TYPE ( TA-ADJ-INDEX )
          methodOut.setTaSortType(methodOut.getTaAdjIndex() - 1,methodOut.getAdjtblSortType());
//  MOVE ADJTBL-BANK-NUMBER TO TA-BANK-NO ( TA-ADJ-INDEX )
          methodOut.setTaBankNo(methodOut.getTaAdjIndex() - 1,methodOut.getAdjtblBankNumber());
//  MOVE ADJTBL-DEPT-NUMBER TO TA-DEPT-NO ( TA-ADJ-INDEX )
          methodOut.setTaDeptNo(methodOut.getTaAdjIndex() - 1,methodOut.getAdjtblDeptNumber());
//  MOVE ADJTBL-ACCOUNT-CODE TO TA-ACCT-CD ( TA-ADJ-INDEX )
          methodOut.setTaAcctCd(methodOut.getTaAdjIndex() - 1,methodOut.getAdjtblAccountCode());
//  MOVE ADJTBL-TYPE-CODE TO TA-TYPE-CD ( TA-ADJ-INDEX )
          methodOut.setTaTypeCd(methodOut.getTaAdjIndex() - 1,methodOut.getAdjtblTypeCode());
//  MOVE ADJTBL-CLERK-ID TO TA-CLERK-ID ( TA-ADJ-INDEX )
          methodOut.setTaClerkId(methodOut.getTaAdjIndex() - 1,methodOut.getAdjtblClerkId());
//  MOVE ADJTBL-SRC-RECEIPT-CD TO TA-SRC-RECEIPT-CD ( TA-ADJ-INDEX )
          methodOut.setTaSrcReceiptCd(methodOut.getTaAdjIndex() - 1,methodOut.getAdjtblSrcReceiptCd());
//  MOVE ADJTBL-SRC-ERROR-CD TO TA-SRC-ERROR-CD ( TA-ADJ-INDEX )
          methodOut.setTaSrcErrorCd(methodOut.getTaAdjIndex() - 1,methodOut.getAdjtblSrcErrorCd());
//  MOVE 0 TO TA-ADJ-CODE-CNT ( TA-ADJ-INDEX )
//  LITERAL_0 = 0
          methodOut.setTaAdjCodeCnt(methodOut.getTaAdjIndex() - 1,0);
//  ADD 1 TO TA-ADJ-INDEX-MAX
          methodOut.setTaAdjIndexMax(methodOut.getTaAdjIndexMax()+1);
//  SET TA-ADJ-INDEX UP BY 1
          methodOut.setTaAdjIndex(methodOut.getTaAdjIndex() + 1); 
          
//  PERFORM 2000-READ-ADJ-TABLE THRU 2000-EXIT
             programCtx.setLoopReadAdjTable(true);
          while (programCtx.getLoopReadAdjTable()) {readAdjTable(programCtx);}/*2000-READ-ADJ-TABLE*/
          ;
      
      return methodOut;
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
