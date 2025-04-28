  package com.cloudframe.app.process.impl;
  /* 
*----------------------------------------------------------------*
* this module is named iovb32k as a mneumonic for:
* - test module for input and output
* - variable blocked file processing
* - minimum through maximum record length of 32k
*
* this test module is design to assure data integrity when
* reading and writing variable length files up to maximum
* length of 32752 bytes for variable blocked, sequential,
* non-spanned data set organization.
*
* the lrecl of 32752 is the upper maximum non-spanned
* variable record cobol can write or read. the mvs file
* system will prefix the record with a 4 byte record
* descriptor word (rdw), and a 4 bytes block descriptor
* word (bdw).
*
* the logic of this module is as follows:
* 1. open the output file
* 2. validate and set runtime parameters
* 3. if operating in write mode
*    a. initialize the output record in working storage using
*       the letters a-z and numbers 1-9 in a repeating pattern
*    b. loop per runtime parameters, writing records increasing
*       by 1 byte in length until the maximum record length
*    c. close the output file
* 4. if operating in read mode
*    a. open the output file for input
*    b. read the output file
*    c. verify the accuracy of every byte of data per the
*        pattern in step 3
*     d. close the outpur file.
* 5. terminate
*
* if any logic or non-fatal errors occur, this module termiates
* with a cond code of 16.
*
*----------------------------------------------------------------*
*/
  
  import org.springframework.beans.factory.annotation.Autowired;
  import org.springframework.beans.factory.annotation.Qualifier;
  import com.cloudframe.app.iovb32k.file.*;
  import com.cloudframe.app.iovb32k.Iovb32kCtx.*;
  import com.cloudframe.app.iovb32k.Iovb32kCtx;
  import com.cloudframe.app.process.Iovb32k;
  import com.cloudframe.app.process.BaseProcess;
  import org.springframework.web.bind.annotation.GetMapping;
  import org.slf4j.Logger;
  import org.slf4j.LoggerFactory;
  import com.cloudframe.app.exception.CFException;
  import org.springframework.stereotype.Component;
  import org.springframework.web.bind.annotation.RestController;
  import org.springframework.web.bind.annotation.RequestParam;
  import com.cloudframe.app.dto.GlobalExecutorCtx;
  import com.cloudframe.app.utility.CFUtil;
  import com.cloudframe.app.exception.Terminate;
  import com.cloudframe.app.dto.ProgramContext;
  import com.cloudframe.app.data.Field;
  import com.cloudframe.app.iovb32k.dto.*;
  import com.cloudframe.app.iovb32k.dto.LsParm;
  import com.cloudframe.app.iovb32k.dto.OutRec;
  import com.cloudframe.app.iovb32k.file.records.OutRecMax;
  import com.cloudframe.app.iovb32k.file.records.InRecMax;
  import com.cloudframe.app.iovb32k.dto.InRec;
  import com.cloudframe.app.iovb32k.dto.DataValues;
  import com.cloudframe.app.iovb32k.dto.Work;
  import com.cloudframe.app.common.CONSTANTS;
  
  @Component("iovb32k")
  
  public class Iovb32kImpl extends CommonProcess implements Iovb32k {
  
  Logger logger = LoggerFactory.getLogger(Iovb32kImpl.class);
  
  
  
  
  @Autowired 
  @Qualifier("iovb32k_inFile")
  InFile inFile;
  @Autowired 
  @Qualifier("iovb32k_outFile")
  OutFile outFile;
  
  
  
  
  
  
      @Override
      public int setParameter(Iovb32kCtx programCtx, String lsParm) throws Exception {
      		if(lsParm != null)
      		    programCtx.getLsParm().setString(com.cloudframe.app.data.Field.getParm(lsParm),new String(CONSTANTS.EBCDIC_ENCODING));
      		setInitDone(false);
      		process(programCtx);
      		return programCtx.getRc();
      }
      /**
      * process 
      * Input  : None 

      * Output : None 

      * @throws CFException
      */
      public int process(Iovb32kCtx programCtx) throws Exception {
       try {
       setCodePage("1047");
            // Reset program ended flag
           programCtx.setProgramEnded(false);
ProcessInCtx methodIn = programCtx.getProcessInCtx();
          ;
//  PERFORM 0000-MAINLINE
          mainline(programCtx.getMainlineInCtx());/*0000-MAINLINE*/
          if (programCtx.isProgramEnded()) {
              return programCtx.getRc();
          }
       } catch(Exception e) {
            handleErrorCode(e);
            throw e;
       }
        finally {
      		if(inFile.hasOpened() && !inFile.isReadOnly()) { 
      			inFile.flush(); 
      		}
      		if(outFile.hasOpened() && !outFile.isReadOnly()) { 
      			outFile.flush(); 
      		}
      }
      
       return programCtx.getRc(); // Exit with return code
      // end of process method
      }
      /**
      * mainline 
      *   This method is derived from 
  *   COBOL Paragraph - 0000-MAINLINE COBOL Cyclomatic complexity - 7
      * Input  :  

      * - mode                           COBOL Name: WS-MODE
      * - dataLenMin                     COBOL Name: WS-DATA-LEN-MIN
      * - i                              COBOL Name: I
      * - dataLenMax                     COBOL Name: WS-DATA-LEN-MAX
      * - recOutCtr                      COBOL Name: WS-REC-OUT-CTR
      * - inEofFlag                      COBOL Name: WS-IN-EOF-FLAG
      * - recInCtr                       COBOL Name: WS-REC-IN-CTR
      *
      * Output :  

      * - i                              COBOL Name: I
      * - displayNum1                    COBOL Name: WS-DISPLAY-NUM-1
      * - recOutCtr                      COBOL Name: WS-REC-OUT-CTR
      * - recInCtr                       COBOL Name: WS-REC-IN-CTR
      *
      * @throws CFException
      */
      @Override
      public MainlineOutCtx mainline(MainlineInCtx methodIn) throws Exception {
Iovb32kCtx programCtx = methodIn.getIovb32kCtx();
MainlineOutCtx methodOut = methodIn.getMainlineOutCtx();
//  PERFORM 0010-VALIDATE-INPUT-PARM THRU 0010-VALIDATE-INPUT-PARM-EXIT
          validateInputParm(programCtx.getValidateInputParmInCtx());/*0010-VALIDATE-INPUT-PARM*/
          if (programCtx.isProgramEnded()) {
              return methodOut;
          }
//  IF WS-MODE-WRITE
          if ( methodIn.isModeWrite()  ) { 
//  PERFORM 0100-OPEN-OUT-FILE THRU 0100-OPEN-OUT-FILE-EXIT
              openOutFile(programCtx.getOpenOutFileInCtx());/*0100-OPEN-OUT-FILE*/
              if (programCtx.isProgramEnded()) {
                  return methodOut;
              }
//  PERFORM 0210-INITIALIZE-OUT-REC THRU 0210-INITIALIZE-OUT-REC-EXIT
              initializeOutRec(programCtx.getInitializeOutRecInCtx());/*0210-INITIALIZE-OUT-REC*/
              if (programCtx.isProgramEnded()) {
                  return methodOut;
              }
//  PERFORM 0200-WRITE-OUT-FILE THRU 0200-WRITE-OUT-FILE-EXIT VARYING I FROM WS-DATA-LEN-MIN BY +1 UNTIL I > WS-DATA-LEN-MAX
              for (methodOut.setI(methodIn.getDataLenMin()); 	( methodOut.getI() <= methodIn.getDataLenMax() ) ; methodOut.setI(methodOut.getI() + 1) ) {
              	writeOutFile(programCtx.getWriteOutFileInCtx());/*0200-WRITE-OUT-FILE*/
                  if (programCtx.isProgramEnded()) {
                      return methodOut;
                  }
              }
//  PERFORM 0300-CLOSE-OUT-FILE THRU 0300-CLOSE-OUT-FILE-EXIT
              closeOutFile(programCtx);/*0300-CLOSE-OUT-FILE*/
//  MOVE WS-REC-OUT-CTR TO WS-DISPLAY-NUM-1
//  FORMAT_1223488108 = "-ZZZZ9"
              methodOut.setDisplayNum1(CFUtil.cobolNumberFormatter(CONSTANTS.FORMAT_1223488108,String.valueOf(methodOut.getRecOutCtr()).toCharArray()));
//  DISPLAY 'RECORDS WRITTEN: ' WS-DISPLAY-NUM-1
              logger.info("RECORDS WRITTEN: {}", new String(methodOut.getDisplayNum1())); 
          }
//  IF WS-MODE-READ
          if ( methodIn.isModeRead()  ) { 
//  PERFORM 0100-OPEN-IN-FILE THRU 0100-OPEN-IN-FILE-EXIT
              openInFile(programCtx.getOpenInFileInCtx());/*0100-OPEN-IN-FILE*/
              if (programCtx.isProgramEnded()) {
                  return methodOut;
              }
//  PERFORM 0200-READ-IN-FILE THRU 0200-READ-IN-FILE-EXIT UNTIL NO-MORE-RECORDS
              while (!(methodIn.isNoMoreRecords()) ) {
                 readInFile(programCtx.getReadInFileInCtx());/*0200-READ-IN-FILE*/
                 if (programCtx.isProgramEnded()) {
                     return methodOut;
                 }
              }
//  PERFORM 0300-CLOSE-IN-FILE THRU 0300-CLOSE-IN-FILE-EXIT
              closeInFile(programCtx);/*0300-CLOSE-IN-FILE*/
//  MOVE WS-REC-IN-CTR TO WS-DISPLAY-NUM-1
//  FORMAT_1223488108 = "-ZZZZ9"
              methodOut.setDisplayNum1(CFUtil.cobolNumberFormatter(CONSTANTS.FORMAT_1223488108,String.valueOf(methodOut.getRecInCtr()).toCharArray()));
//  DISPLAY 'RECORDS READ: ' WS-DISPLAY-NUM-1
              logger.info("RECORDS READ: {}", new String(methodOut.getDisplayNum1())); 
          }
//  GOBACK
          setNotLogged(false); // no need to log, it is a normal termination
          programCtx.setProgramEnded(true);
          return methodOut;
      
      }
      /**
      * validateInputParm 
      *   This method is derived from 
  *   COBOL Paragraph - 0010-VALIDATE-INPUT-PARM COBOL Cyclomatic complexity - 20
      * Input  :  

      * - lsParmLen                      COBOL Name: LS-PARM-LEN
      * - lsParmMode                     COBOL Name: LS-PARM-MODE
      * - lsParmG                        COBOL Name: LS-PARM-G
      * - lsParmDataLenMin               COBOL Name: LS-PARM-DATA-LEN-MIN
      * - lreclMax                       COBOL Name: WS-LRECL-MAX
      * - lsParmDataLenMax               COBOL Name: LS-PARM-DATA-LEN-MAX
      *
      * Output :  

      * - mode                           COBOL Name: WS-MODE
      * - lsParmMode                     COBOL Name: LS-PARM-MODE
      * - dataLenMin                     COBOL Name: WS-DATA-LEN-MIN
      * - displayNum1                    COBOL Name: WS-DISPLAY-NUM-1
      * - lsParmDataLenMax               COBOL Name: LS-PARM-DATA-LEN-MAX
      * - displayNum2                    COBOL Name: WS-DISPLAY-NUM-2
      * - lreclMax                       COBOL Name: WS-LRECL-MAX
      * - lsParmDataLenMin               COBOL Name: LS-PARM-DATA-LEN-MIN
      * - dataLenMax                     COBOL Name: WS-DATA-LEN-MAX
      *
      * @throws CFException
      */
      @Override
      public ValidateInputParmOutCtx validateInputParm(ValidateInputParmInCtx methodIn) throws Exception {
      
// *----------------------------------------------------------------*

// *     Display '0010-validate-input-parm'
Iovb32kCtx programCtx = methodIn.getIovb32kCtx();
ValidateInputParmOutCtx methodOut = methodIn.getValidateInputParmOutCtx();
//  IF LS-PARM-LEN NOT = LENGTH OF LS-PARM-G OR NOT LS-PARM-MODE-VALID
          if (	( methodIn.getLsParmLen() != LsParmG.getLsParmGFieldLength() )  || !(methodIn.isLsParmModeValid()) ) { 
//  DISPLAY 'MISSING OR INVALID MODE PASSED' 'DEFAULTING MODE B'
              logger.info("MISSING OR INVALID MODE PASSEDDEFAULTING MODE B"); 
//  SET WS-MODE-BOTH TO TRUE
              methodOut.setModeBothTrue(); 
              
          }
//  ELSE
          else { 
//  MOVE LS-PARM-MODE TO WS-MODE
              methodOut.setMode(methodOut.getLsParmMode());
          }
//  IF LS-PARM-LEN NOT = LENGTH OF LS-PARM-G OR LS-PARM-DATA-LEN-MIN NOT NUMERIC
          if (	( methodIn.getLsParmLen() != LsParmG.getLsParmGFieldLength() )  ||          !(methodIn.getLsParmG().lsParmDataLenMinIsNumeric() ) ) { 
//  DISPLAY 'MISSING OR INVALID MINIMUM LENGTH PASSED ' 'DEFAULTING MINIMUM LENGTH TO 0'
              logger.info("MISSING OR INVALID MINIMUM LENGTH PASSED DEFAULTING MINIMUM LENGTH TO 0"); 
              // MOVE +0 TO WS-DATA-LEN-MIN
              methodOut.setDataLenMin((short)0);
          }
//  ELSE
          else { 
//  IF LS-PARM-DATA-LEN-MIN > WS-LRECL-MAX
              if (	( methodOut.getLsParmDataLenMin() > methodOut.getLreclMax() ) ) { 
//  MOVE LS-PARM-DATA-LEN-MAX TO WS-DISPLAY-NUM-1
//  FORMAT_1223488108 = "-ZZZZ9"
                  methodOut.setDisplayNum1(CFUtil.cobolNumberFormatter(CONSTANTS.FORMAT_1223488108,String.valueOf(methodOut.getLsParmDataLenMax()).toCharArray()));
//  MOVE WS-LRECL-MAX TO WS-DISPLAY-NUM-2
//  FORMAT_1223488108 = "-ZZZZ9"
                  methodOut.setDisplayNum2(CFUtil.cobolNumberFormatter(CONSTANTS.FORMAT_1223488108,String.valueOf(methodOut.getLreclMax()).toCharArray()));
//  DISPLAY 'INVALID MINIMUM LENGTH PASSED: ' WS-DISPLAY-NUM-1 ', IS GREATER THAN PERMITTED VALUE OF: ' WS-DISPLAY-NUM-2 ', DEFAULTING MINIMUM LENGTH TO 0'
                  logger.info("INVALID MINIMUM LENGTH PASSED: {}, IS GREATER THAN PERMITTED VALUE OF: {}, DEFAULTING MINIMUM LENGTH TO 0", new String(methodOut.getDisplayNum1()), new String(methodOut.getDisplayNum2())); 
                  // MOVE +0 TO WS-DATA-LEN-MIN
                  methodOut.setDataLenMin((short)0);
              }
//  ELSE
              else { 
//  MOVE LS-PARM-DATA-LEN-MIN TO WS-DATA-LEN-MIN
                  methodOut.setDataLenMin((short) methodOut.getLsParmDataLenMin());
              }
          }
//  IF LS-PARM-LEN NOT = LENGTH OF LS-PARM-G OR LS-PARM-DATA-LEN-MAX NOT NUMERIC
          if (	( methodIn.getLsParmLen() != LsParmG.getLsParmGFieldLength() )  ||          !(methodIn.getLsParmG().lsParmDataLenMaxIsNumeric() ) ) { 
//  DISPLAY 'MISSING OR INVALID MAXIMUM LENGTH PASSED ' 'DEFAULTING MAXIMUM LENGTH TO 80'
              logger.info("MISSING OR INVALID MAXIMUM LENGTH PASSED DEFAULTING MAXIMUM LENGTH TO 80"); 
              // MOVE +80 TO WS-DATA-LEN-MAX
              methodOut.setDataLenMax((short)80);
          }
//  ELSE
          else { 
//  IF LS-PARM-DATA-LEN-MAX > WS-LRECL-MAX
              if (	( methodOut.getLsParmDataLenMax() > methodOut.getLreclMax() ) ) { 
//  MOVE LS-PARM-DATA-LEN-MAX TO WS-DISPLAY-NUM-1
//  FORMAT_1223488108 = "-ZZZZ9"
                  methodOut.setDisplayNum1(CFUtil.cobolNumberFormatter(CONSTANTS.FORMAT_1223488108,String.valueOf(methodOut.getLsParmDataLenMax()).toCharArray()));
//  MOVE WS-LRECL-MAX TO WS-DISPLAY-NUM-2
//  FORMAT_1223488108 = "-ZZZZ9"
                  methodOut.setDisplayNum2(CFUtil.cobolNumberFormatter(CONSTANTS.FORMAT_1223488108,String.valueOf(methodOut.getLreclMax()).toCharArray()));
//  DISPLAY 'INVALID MAXIMUM LENGTH PASSED: ' WS-DISPLAY-NUM-1 ', IS GREATER THAN PERMITTED VALUE OF: ' WS-DISPLAY-NUM-2 ', DEFAULTING MAXIMUM LENGTH TO 80'
                  logger.info("INVALID MAXIMUM LENGTH PASSED: {}, IS GREATER THAN PERMITTED VALUE OF: {}, DEFAULTING MAXIMUM LENGTH TO 80", new String(methodOut.getDisplayNum1()), new String(methodOut.getDisplayNum2())); 
                  // MOVE +80 TO WS-DATA-LEN-MAX
                  methodOut.setDataLenMax((short)80);
              }
//  ELSE
              else { 
//  MOVE LS-PARM-DATA-LEN-MAX TO WS-DATA-LEN-MAX
                  methodOut.setDataLenMax((short) methodOut.getLsParmDataLenMax());
              }
          }
//  IF WS-DATA-LEN-MIN > WS-DATA-LEN-MAX
          if (	( methodOut.getDataLenMin() > methodOut.getDataLenMax() )) { 
//  DISPLAY 'INVALID MINIMUM > MAXIMUM LENGTH PASSED.' ' DEFAULTING MINIMUM LENGTH TO 0' ', DEFAULTING MAXIMUM LENGTH TO 80'
              logger.info("INVALID MINIMUM > MAXIMUM LENGTH PASSED. DEFAULTING MINIMUM LENGTH TO 0, DEFAULTING MAXIMUM LENGTH TO 80"); 
              // MOVE +0 TO WS-DATA-LEN-MIN
              methodOut.setDataLenMin((short)0);
              // MOVE +80 TO WS-DATA-LEN-MAX
              methodOut.setDataLenMax((short)80);
          }
//  MOVE WS-DATA-LEN-MIN TO WS-DISPLAY-NUM-1
//  FORMAT_1223488108 = "-ZZZZ9"
          methodOut.setDisplayNum1(CFUtil.cobolNumberFormatter(CONSTANTS.FORMAT_1223488108,String.valueOf(methodOut.getDataLenMin()).toCharArray()));
//  MOVE WS-DATA-LEN-MAX TO WS-DISPLAY-NUM-2
//  FORMAT_1223488108 = "-ZZZZ9"
          methodOut.setDisplayNum2(CFUtil.cobolNumberFormatter(CONSTANTS.FORMAT_1223488108,String.valueOf(methodOut.getDataLenMax()).toCharArray()));
//  DISPLAY 'PROCESSING MODE IS: ' WS-MODE ', INPUT MINIMUM PARAMETER LENGTH ' WS-DISPLAY-NUM-1 ', WILL BE USED TO CONTROL ENGTH OF FIRST RECORD' ' WRITTEN'
          logger.info("PROCESSING MODE IS: {}, INPUT MINIMUM PARAMETER LENGTH {}, WILL BE USED TO CONTROL ENGTH OF FIRST RECORD WRITTEN", new String(methodOut.getMode()), new String(methodOut.getDisplayNum1())); 
//  DISPLAY 'INPUT MAXIMUM PARAMETER LENGTH ' WS-DISPLAY-NUM-2 ', WILL BE USED TO CONTROL NUMBER OF RECORDS' ' WRITTEN, AND LENGTH OF LONGEST RECORD'
          logger.info("INPUT MAXIMUM PARAMETER LENGTH {}, WILL BE USED TO CONTROL NUMBER OF RECORDS WRITTEN, AND LENGTH OF LONGEST RECORD", new String(methodOut.getDisplayNum2())); 
      
      return methodOut;
      }
      /**
      * openInFile 
      *   This method is derived from 
  *   COBOL Paragraph - 0100-OPEN-IN-FILE COBOL Cyclomatic complexity - 3
      * Input  : None 

      * Output :  

      * - outFileStatus                  COBOL Name: WS-OUT-FILE-STATUS
      * - inFileStatus                   COBOL Name: WS-IN-FILE-STATUS
      * - rc                             COBOL Name: RETURN-CODE
      *
      * @throws CFException
      */
      @Override
      public OpenInFileOutCtx openInFile(OpenInFileInCtx methodIn) throws Exception {
      
// *----------------------------------------------------------------*

// *     Display '0100-open-in-file'
Iovb32kCtx programCtx = methodIn.getIovb32kCtx();
OpenInFileOutCtx methodOut = methodIn.getOpenInFileOutCtx();
//  OPEN INPUT IN-FILE
          inFile.open(new String(CONSTANTS.MODE_READ_ONLY_36242),inFile.getFileName(),inFile.getInFileCharSet(),inFile.getInFileCrlfFlag());
          methodOut.setInFileStatus(inFile.getStatus() );
//  IF WS-IN-FILE-STATUS NOT = 0
          if (	( methodOut.getInFileStatus() != 0 )) { 
              // MOVE 16 TO RETURN-CODE
              programCtx.setRc( 16);
//  DISPLAY 'ERROR OPENING INPUT FILE: ' WS-IN-FILE-STATUS
              logger.info("ERROR OPENING INPUT FILE: {}", String.valueOf(methodOut.getInFileStatus())); 
//  GOBACK
              setNotLogged(false); // no need to log, it is a normal termination
              programCtx.setProgramEnded(true);
              return methodOut;
          }
      
      return methodOut;
      }
      /**
      * openOutFile 
      *   This method is derived from 
  *   COBOL Paragraph - 0100-OPEN-OUT-FILE COBOL Cyclomatic complexity - 3
      * Input  : None 

      * Output :  

      * - outFileStatus                  COBOL Name: WS-OUT-FILE-STATUS
      * - inFileStatus                   COBOL Name: WS-IN-FILE-STATUS
      * - rc                             COBOL Name: RETURN-CODE
      *
      * @throws CFException
      */
      @Override
      public OpenOutFileOutCtx openOutFile(OpenOutFileInCtx methodIn) throws Exception {
      
// *----------------------------------------------------------------*

// *     Global variables used herein set by calling paragraphs:
// *     - none
// *----------------------------------------------------------------*
// *     display '0100-open-out-file'
Iovb32kCtx programCtx = methodIn.getIovb32kCtx();
OpenOutFileOutCtx methodOut = methodIn.getOpenOutFileOutCtx();
//  OPEN OUTPUT OUT-FILE
          outFile.open(new String(CONSTANTS.MODE_WRITE_ONLY_36397),outFile.getFileName(),outFile.getOutFileCharSet(),outFile.getOutFileCrlfFlag());
          methodOut.setOutFileStatus(outFile.getStatus() );
//  IF WS-OUT-FILE-STATUS NOT = 0
          if (	( methodOut.getOutFileStatus() != 0 )) { 
              // MOVE 16 TO RETURN-CODE
              programCtx.setRc( 16);
//  DISPLAY 'ERROR OPENING OUPUT FILE: ' WS-OUT-FILE-STATUS
              logger.info("ERROR OPENING OUPUT FILE: {}", String.valueOf(methodOut.getOutFileStatus())); 
//  GOBACK
              setNotLogged(false); // no need to log, it is a normal termination
              programCtx.setProgramEnded(true);
              return methodOut;
          }
      
      return methodOut;
      }
      /**
      * readInFile 
      *   This method is derived from 
  *   COBOL Paragraph - 0200-READ-IN-FILE COBOL Cyclomatic complexity - 1
      * Input  :  

      * - recInCtr                       COBOL Name: WS-REC-IN-CTR
      *
      * Output :  

      * - inRecLen                       COBOL Name: WS-IN-REC-LEN
      * - inRecMax                       COBOL Name: IN-REC-MAX
      * - inFileStatus                   COBOL Name: WS-IN-FILE-STATUS
      * - inEofFlag                      COBOL Name: WS-IN-EOF-FLAG
      * - recInCtr                       COBOL Name: WS-REC-IN-CTR
      *
      * @throws CFException
      */
      @Override
      public ReadInFileOutCtx readInFile(ReadInFileInCtx methodIn) throws Exception {
      
// *----------------------------------------------------------------*

// *     Global variables set herein for calling paragraphs:
// *     - ws-rec-in-ctr: number of records written
// *     - ws-in-eof-flag: end of file marker
// *----------------------------------------------------------------*
// *     display '0200-read-in-file'
Iovb32kCtx programCtx = methodIn.getIovb32kCtx();
ReadInFileOutCtx methodOut = methodIn.getReadInFileOutCtx();
//  MOVE ZERO TO WS-IN-REC-LEN
          methodOut.setInRecLen(0);
//  READ IN-FILE INTO WS-IN-REC
          	inFile.read();
          methodOut.setInRecLen(inFile.getRecLen());
          methodOut.setInFileStatus(inFile.getStatus() );
          if (!inFile.hasEnded()) {
             methodOut.getInRecMax().setString(inFile.getRecord());
             methodIn.getInRec().setString(replace(methodIn.getInRec().toCharArray(),substring(methodOut.getInRecMax().toCharArray(),0,inFile.getRecLen()),0,methodIn.getInRec().length()));
          }
//  AT END
          if (inFile.hasEnded()) {  
//  SET NO-MORE-RECORDS TO TRUE
              methodOut.setNoMoreRecordsTrue(); 
              
            }
//  NOT AT END
          else  {
//  ADD +1 TO WS-REC-IN-CTR
              methodOut.setRecInCtr( (short) (methodOut.getRecInCtr()+(short)1));
//  PERFORM 0210-VALIDATE-IN-REC-DATA THRU 0210-VALIDATE-IN-REC-DATA-EXIT
              validateInRecData(programCtx.getValidateInRecDataInCtx());/*0210-VALIDATE-IN-REC-DATA*/
              if (programCtx.isProgramEnded()) {
                  return methodOut;
              }
            }
      
      return methodOut;
      }
      /**
      * validateInRecData 
      *   This method is derived from 
  *   COBOL Paragraph - 0210-VALIDATE-IN-REC-DATA COBOL Cyclomatic complexity - 8
      * Input  :  

      * - inRecDataLen                   COBOL Name: WS-IN-REC-DATA-LEN
      * - dataLenMax                     COBOL Name: WS-DATA-LEN-MAX
      * - recInCtr                       COBOL Name: WS-REC-IN-CTR
      * - j                              COBOL Name: J
      * - dataValues                     COBOL Name: WS-DATA-VALUES
      * - inRecByte                      COBOL Name: WS-IN-REC-BYTE
      * - inRecLen                       COBOL Name: WS-IN-REC-LEN
      *
      * Output :  

      * - rc                             COBOL Name: RETURN-CODE
      * - displayNum1                    COBOL Name: WS-DISPLAY-NUM-1
      * - recInCtr                       COBOL Name: WS-REC-IN-CTR
      * - displayNum2                    COBOL Name: WS-DISPLAY-NUM-2
      * - inRecDataLen                   COBOL Name: WS-IN-REC-DATA-LEN
      * - k                              COBOL Name: K
      * - j                              COBOL Name: J
      * - inRecLen                       COBOL Name: WS-IN-REC-LEN
      * - displayNum3                    COBOL Name: WS-DISPLAY-NUM-3
      *
      * @throws CFException
      */
      @Override
      public ValidateInRecDataOutCtx validateInRecData(ValidateInRecDataInCtx methodIn) throws Exception {
			// Declare local variables used in the method
			 final int IN_REC_LEN_LENGTH = 2;
			// End of variable declaration

      
// *----------------------------------------------------------------*

// *     Global variables used herein set by calling paragraphs:
// *     - none
// *----------------------------------------------------------------*
// *     display '0210-validate-in-rec-data'
Iovb32kCtx programCtx = methodIn.getIovb32kCtx();
ValidateInRecDataOutCtx methodOut = methodIn.getValidateInRecDataOutCtx();
//  IF WS-IN-REC-DATA-LEN > WS-DATA-LEN-MAX
          if (	( methodOut.getInRecDataLen() > methodIn.getDataLenMax() ) ) { 
              // MOVE 16 TO RETURN-CODE
              programCtx.setRc( 16);
//  MOVE WS-REC-IN-CTR TO WS-DISPLAY-NUM-1
//  FORMAT_1223488108 = "-ZZZZ9"
              methodOut.setDisplayNum1(CFUtil.cobolNumberFormatter(CONSTANTS.FORMAT_1223488108,String.valueOf(methodOut.getRecInCtr()).toCharArray()));
//  MOVE WS-IN-REC-DATA-LEN TO WS-DISPLAY-NUM-2
//  FORMAT_1223488108 = "-ZZZZ9"
              methodOut.setDisplayNum2(CFUtil.cobolNumberFormatter(CONSTANTS.FORMAT_1223488108,String.valueOf(methodOut.getInRecDataLen()).toCharArray()));
//  DISPLAY 'INPUT FILE DATA INTEGRITY ERROR, ' 'RECORD NUMBER: ' WS-DISPLAY-NUM-1 ', RECORD LENGTH: ' WS-DISPLAY-NUM-2
              logger.info("INPUT FILE DATA INTEGRITY ERROR, RECORD NUMBER: {}, RECORD LENGTH: {}", new String(methodOut.getDisplayNum1()), new String(methodOut.getDisplayNum2())); 
//  GOBACK
              setNotLogged(false); // no need to log, it is a normal termination
              programCtx.setProgramEnded(true);
              return methodOut;
          }
          // MOVE ZERO TO K
          methodOut.setK((short) 0);
//  PERFORM VARYING J FROM +1 BY +1 UNTIL J > WS-IN-REC-DATA-LEN
          for (methodOut.setJ(1); (	( methodOut.getJ() <= methodOut.getInRecDataLen() ) ) ; methodOut.setJ(methodOut.getJ() + 1) ) {
//  ADD +1 TO K
              methodOut.setK( (short) (methodOut.getK()+(short)1));
//  IF K > LENGTH OF WS-DATA-VALUES
              if (	( methodOut.getK() > DataValues.getDataValuesFieldLength() ) ) { 
                  // MOVE +1 TO K
                  methodOut.setK((short)1);
              }
//  IF WS-DATA-VALUES (K : 1) NOT = WS-IN-REC-BYTE (J)
              if (		compareChars(substring(methodIn.getDataValues().getCharArray(),(methodOut.getK()-1), (methodOut.getK() + 0) ),methodIn.getInRecByte(methodOut.getJ() - 1)) != 0 ) { 
                  // MOVE 16 TO RETURN-CODE
                  programCtx.setRc( 16);
//  MOVE WS-REC-IN-CTR TO WS-DISPLAY-NUM-1
//  FORMAT_1223488108 = "-ZZZZ9"
                  methodOut.setDisplayNum1(CFUtil.cobolNumberFormatter(CONSTANTS.FORMAT_1223488108,String.valueOf(methodOut.getRecInCtr()).toCharArray()));
//  MOVE WS-IN-REC-LEN TO WS-DISPLAY-NUM-2
//  FORMAT_1223488108 = "-ZZZZ9"
                  methodOut.setDisplayNum2(CFUtil.cobolNumberFormatter(CONSTANTS.FORMAT_1223488108,String.valueOf(methodOut.getInRecLen()).toCharArray()));
                  methodOut.setDisplayNum3(CFUtil.cobolNumberFormatter(CONSTANTS.FORMAT_1223488108,String.valueOf(methodOut.getJ() + IN_REC_LEN_LENGTH)));
//  DISPLAY 'INPUT FILE DATA INTEGRITY ERROR AT ' 'RECORD NUMBER: ' WS-DISPLAY-NUM-1 ', RECORD LENGTH: ' WS-DISPLAY-NUM-2 ', AT BYTE: ' WS-DISPLAY-NUM-3 ', EXPECTED: ' WS-DATA-VALUES (K : 1) ', FOUND: ' WS-IN-REC-BYTE (J)
                  logger.info("INPUT FILE DATA INTEGRITY ERROR AT RECORD NUMBER: {}, RECORD LENGTH: {}, AT BYTE: {}, EXPECTED: {}, FOUND: {}", new String(methodOut.getDisplayNum1()), new String(methodOut.getDisplayNum2()), new String(methodOut.getDisplayNum3()), new String(substring(methodIn.getDataValues().getCharArray(),(methodOut.getK()-1), (methodOut.getK() + 0) )), new String(methodIn.getInRecByte(methodOut.getJ() - 1))); 
//  GOBACK
                  setNotLogged(false); // no need to log, it is a normal termination
                  programCtx.setProgramEnded(true);
                  return methodOut;
              }
          }
      
      return methodOut;
      }
      /**
      * writeOutFile 
      *   This method is derived from 
  *   COBOL Paragraph - 0200-WRITE-OUT-FILE COBOL Cyclomatic complexity - 3
      * Input  :  

      * - i                              COBOL Name: I
      * - outRecMax                      COBOL Name: OUT-REC-MAX
      * - recOutCtr                      COBOL Name: WS-REC-OUT-CTR
      *
      * Output :  

      * - outRecDataLen                  COBOL Name: WS-OUT-REC-DATA-LEN
      * - i                              COBOL Name: I
      * - outRecLen                      COBOL Name: WS-OUT-REC-LEN
      * - outFileStatus                  COBOL Name: WS-OUT-FILE-STATUS
      * - rc                             COBOL Name: RETURN-CODE
      * - recOutCtr                      COBOL Name: WS-REC-OUT-CTR
      *
      * @throws CFException
      */
      @Override
      public WriteOutFileOutCtx writeOutFile(WriteOutFileInCtx methodIn) throws Exception {
			// Declare local variables used in the method
			 final int OUT_REC_LEN_LENGTH = 2;
			// End of variable declaration

      
// *----------------------------------------------------------------*

// *     Global variables used herein set by calling paragraphs:
// *     - i: subscript is used to calculate variable record length
// *
// *     global variables set herein for calling ragraphs:
// *     - ws-rec-out-ctr: number of records written
// *----------------------------------------------------------------*
// *     display '0200-write-out-file'
Iovb32kCtx programCtx = methodIn.getIovb32kCtx();
WriteOutFileOutCtx methodOut = methodIn.getWriteOutFileOutCtx();
//  MOVE I TO WS-OUT-REC-DATA-LEN
          methodOut.setOutRecDataLen(methodOut.getI());
          methodOut.setOutRecLen((int)Math.abs(methodOut.getI() + OUT_REC_LEN_LENGTH));

// *     Move ws-out-rec-data-len    to ws-display-num-1
// *     display 'about to write out-file with data len of: '
// *             ws-display-num-1
//  WRITE OUT-REC-MAX FROM WS-OUT-REC
          methodOut.getOutRecMax().setString(methodIn.getOutRec().toCharArray());
          outFile.setRecord(substring(methodOut.getOutRecMax().toCharArray(),0,methodOut.getOutRecLen()));
          outFile.write(methodOut.getOutRecLen()); 
          methodOut.setOutFileStatus(outFile.getStatus() );
//  IF WS-OUT-FILE-STATUS NOT = 0
          if (	( methodOut.getOutFileStatus() != 0 )) { 
              // MOVE 16 TO RETURN-CODE
              programCtx.setRc( 16);
//  DISPLAY 'ERROR WRITING OUTPUT: ' WS-OUT-FILE-STATUS
              logger.info("ERROR WRITING OUTPUT: {}", String.valueOf(methodOut.getOutFileStatus())); 
//  GOBACK
              setNotLogged(false); // no need to log, it is a normal termination
              programCtx.setProgramEnded(true);
              return methodOut;
          }
//  ADD +1 TO WS-REC-OUT-CTR
          methodOut.setRecOutCtr( (short) (methodOut.getRecOutCtr()+(short)1));
      
      return methodOut;
      }
      /**
      * initializeOutRec 
      *   This method is derived from 
  *   COBOL Paragraph - 0210-INITIALIZE-OUT-REC COBOL Cyclomatic complexity - 4
      * Input  :  

      * - dataLenMax                     COBOL Name: WS-DATA-LEN-MAX
      * - j                              COBOL Name: J
      * - dataValues                     COBOL Name: WS-DATA-VALUES
      *
      * Output :  

      * - outRecDataLen                  COBOL Name: WS-OUT-REC-DATA-LEN
      * - dataLenMax                     COBOL Name: WS-DATA-LEN-MAX
      * - k                              COBOL Name: K
      * - j                              COBOL Name: J
      * - outRecByte                     COBOL Name: WS-OUT-REC-BYTE
      * - dataValues                     COBOL Name: WS-DATA-VALUES
      *
      * @throws CFException
      */
      @Override
      public InitializeOutRecOutCtx initializeOutRec(InitializeOutRecInCtx methodIn) throws Exception {
      
// *----------------------------------------------------------------*

// *     Global variables used herein set by calling paragraphs:
// *     - none
// *----------------------------------------------------------------*
// *     display '0210-initialize-out-rec'
Iovb32kCtx programCtx = methodIn.getIovb32kCtx();
InitializeOutRecOutCtx methodOut = methodIn.getInitializeOutRecOutCtx();
//  MOVE WS-DATA-LEN-MAX TO WS-OUT-REC-DATA-LEN
          methodOut.setOutRecDataLen(methodOut.getDataLenMax());
          // MOVE ZERO TO K
          methodOut.setK((short) 0);
//  PERFORM VARYING J FROM +1 BY +1 UNTIL J > WS-DATA-LEN-MAX
          for (methodOut.setJ(1); (	( methodOut.getJ() <= methodOut.getDataLenMax() )) ; methodOut.setJ(methodOut.getJ() + 1) ) {
//  ADD +1 TO K
              methodOut.setK( (short) (methodOut.getK()+(short)1));
//  IF K > LENGTH OF WS-DATA-VALUES
              if (	( methodOut.getK() > DataValues.getDataValuesFieldLength() ) ) { 
                  // MOVE +1 TO K
                  methodOut.setK((short)1);
              }
//  MOVE WS-DATA-VALUES (K : 1) TO WS-OUT-REC-BYTE (J)
              methodOut.setOutRecByte(methodOut.getJ() - 1,substring(methodOut.getDataValues().getCharArray(),(methodOut.getK()-1), (methodOut.getK() + 0) ));
          }
      
      return methodOut;
      }
      /**
      * closeInFile 
      *   This method is derived from 
  *   COBOL Paragraph - 0300-CLOSE-IN-FILE COBOL Cyclomatic complexity - 1
      * Input  : None 

      * Output : None 

      * @throws CFException
      */
      @Override
      public CloseInFileOutCtx closeInFile(Iovb32kCtx programCtx) throws Exception {
      
// *----------------------------------------------------------------*

// *     Global variables used herein set by calling paragraphs:
// *     - none
// *----------------------------------------------------------------*
// *     display '0300-close-in-file'
CloseInFileOutCtx methodOut = programCtx.getCloseInFileOutCtx();
//  CLOSE IN-FILE
          inFile.close(); 
          methodOut.setInFileStatus(inFile.getStatus() );
      
      return methodOut;
      }
      /**
      * closeOutFile 
      *   This method is derived from 
  *   COBOL Paragraph - 0300-CLOSE-OUT-FILE COBOL Cyclomatic complexity - 1
      * Input  : None 

      * Output : None 

      * @throws CFException
      */
      @Override
      public CloseOutFileOutCtx closeOutFile(Iovb32kCtx programCtx) throws Exception {
      
// *----------------------------------------------------------------*

// *     Global variables used herein set by calling paragraphs:
// *     - none
// *----------------------------------------------------------------*
// *     display '0300-close-out-file'
CloseOutFileOutCtx methodOut = programCtx.getCloseOutFileOutCtx();
//  CLOSE OUT-FILE
          outFile.close(); 
          methodOut.setOutFileStatus(outFile.getStatus() );
      
      return methodOut;
      }
  
  
  
      public int call(ProgramContext ctx, Object[] params) throws Exception {
      Iovb32kCtx programCtx = (Iovb32kCtx) ctx;
      
      int len = params.length;
         if (len > 0 && params[0] != null )
            programCtx.getLsParm().set((Field)params[0]);
         // invoke the process and return rc
         return process(programCtx);
         
      }
      
      public int call(ProgramContext ctx, Field... parameters) throws Exception {
      Iovb32kCtx programCtx = (Iovb32kCtx) ctx;
         for (int index = 0; index < parameters.length;index++) {
             switch(index) {
              case 0:
                      if(parameters[index] != null ) {
              		if (parameters[index] instanceof LsParm) {
                       	programCtx.setLsParm((LsParm) parameters[index]);
                  	} else {
                       	programCtx.getLsParm().set(parameters[index]);
                  	}
                  }
                
                  break;
            }
         }
      	return process(programCtx);
      }
      
      
  
  
  
  
  
  }
