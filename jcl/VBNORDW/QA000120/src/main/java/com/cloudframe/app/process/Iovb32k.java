  package com.cloudframe.app.process;
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
  import org.springframework.web.bind.annotation.GetMapping;
  import org.slf4j.Logger;
  import org.slf4j.LoggerFactory;
  import com.cloudframe.app.exception.CFException;
  import org.springframework.stereotype.Component;
  import org.springframework.web.bind.annotation.RestController;
  import org.springframework.web.bind.annotation.RequestParam;
  import com.cloudframe.app.utility.CFUtil;
  import com.cloudframe.app.exception.Terminate;
  import com.cloudframe.app.iovb32k.dto.LsParmG;
  import com.cloudframe.app.iovb32k.dto.InRecData;
  import com.cloudframe.app.data.Field;
  import com.cloudframe.app.iovb32k.dto.*;
  import com.cloudframe.app.iovb32k.dto.LsParm;
  import com.cloudframe.app.iovb32k.dto.OutRec;
  import com.cloudframe.app.iovb32k.file.records.OutRecMax;
  import com.cloudframe.app.iovb32k.file.records.InRecMax;
  import com.cloudframe.app.iovb32k.dto.DataValues;
  import com.cloudframe.app.iovb32k.dto.InRec;
  import com.cloudframe.app.iovb32k.dto.Work;
  import com.cloudframe.app.common.CONSTANTS;
  
  @Component("iovb32k")
  
  public class Iovb32k extends CommonProcess {
  
  Logger logger = LoggerFactory.getLogger(Iovb32k.class);
  
  private LsParm lsParm = new LsParm() ;
  private OutRec outRec = new OutRec() ;
  private OutRecMax outRecMax = new OutRecMax() ;
  private InRecMax inRecMax = new InRecMax() ;
  private DataValues dataValues = new DataValues() ;
  private InRec inRec = new InRec() ;
  private Work work = new Work() ;
  
  
  
  @Autowired 
  @Qualifier("iovb32k_inFile")
  InFile inFile;
  @Autowired 
  @Qualifier("iovb32k_outFile")
  OutFile outFile;
  
  
  
  
  
  
      public int setParameter(String lsParm) throws Exception {
      		if(lsParm != null)
      		    this.lsParm.setString(com.cloudframe.app.data.Field.getParm(lsParm),new String(CONSTANTS.EBCDIC_ENCODING));
      		setInitDone(false);
      		process();
      		return getRc();
      }
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
        finally {
      		if(inFile.hasOpened() && !inFile.isReadOnly()) { 
      			inFile.flush(); 
      		}
      		if(outFile.hasOpened() && !outFile.isReadOnly()) { 
      			outFile.flush(); 
      		}
      }
      
       return getRc(); // Exit with return code
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
      private void mainline() throws Exception {
//  PERFORM 0010-VALIDATE-INPUT-PARM THRU 0010-VALIDATE-INPUT-PARM-EXIT
          validateInputParm();/*0010-VALIDATE-INPUT-PARM*/
          if (this.isProgramEnded()) {
              return ;
          }
//  IF WS-MODE-WRITE
          if ( work.isModeWrite()  ) { 
//  PERFORM 0100-OPEN-OUT-FILE THRU 0100-OPEN-OUT-FILE-EXIT
              openOutFile();/*0100-OPEN-OUT-FILE*/
              if (this.isProgramEnded()) {
                  return ;
              }
//  PERFORM 0210-INITIALIZE-OUT-REC THRU 0210-INITIALIZE-OUT-REC-EXIT
              initializeOutRec();/*0210-INITIALIZE-OUT-REC*/
              if (this.isProgramEnded()) {
                  return ;
              }
//  PERFORM 0200-WRITE-OUT-FILE THRU 0200-WRITE-OUT-FILE-EXIT VARYING I FROM WS-DATA-LEN-MIN BY +1 UNTIL I > WS-DATA-LEN-MAX
              for (work.setI(work.getDataLenMin()); 	( work.getI() <= work.getDataLenMax() ) ; work.setI(work.getI() + 1) ) {
              	writeOutFile();/*0200-WRITE-OUT-FILE*/
                  if (this.isProgramEnded()) {
                      return ;
                  }
              }
//  PERFORM 0300-CLOSE-OUT-FILE THRU 0300-CLOSE-OUT-FILE-EXIT
              closeOutFile();/*0300-CLOSE-OUT-FILE*/
//  MOVE WS-REC-OUT-CTR TO WS-DISPLAY-NUM-1
//  FORMAT_1223488108 = "-ZZZZ9"
              work.setDisplayNum1(CFUtil.cobolNumberFormatter(CONSTANTS.FORMAT_1223488108,String.valueOf(work.getRecOutCtr()).toCharArray()));
//  DISPLAY 'RECORDS WRITTEN: ' WS-DISPLAY-NUM-1
              logger.info("RECORDS WRITTEN: {}", new String(work.getDisplayNum1())); 
          }
//  IF WS-MODE-READ
          if ( work.isModeRead()  ) { 
//  PERFORM 0100-OPEN-IN-FILE THRU 0100-OPEN-IN-FILE-EXIT
              openInFile();/*0100-OPEN-IN-FILE*/
              if (this.isProgramEnded()) {
                  return ;
              }
//  PERFORM 0200-READ-IN-FILE THRU 0200-READ-IN-FILE-EXIT UNTIL NO-MORE-RECORDS
              while (!(work.isNoMoreRecords()) ) {
                 readInFile();/*0200-READ-IN-FILE*/
                 if (this.isProgramEnded()) {
                     return ;
                 }
              }
//  PERFORM 0300-CLOSE-IN-FILE THRU 0300-CLOSE-IN-FILE-EXIT
              closeInFile();/*0300-CLOSE-IN-FILE*/
//  MOVE WS-REC-IN-CTR TO WS-DISPLAY-NUM-1
//  FORMAT_1223488108 = "-ZZZZ9"
              work.setDisplayNum1(CFUtil.cobolNumberFormatter(CONSTANTS.FORMAT_1223488108,String.valueOf(work.getRecInCtr()).toCharArray()));
//  DISPLAY 'RECORDS READ: ' WS-DISPLAY-NUM-1
              logger.info("RECORDS READ: {}", new String(work.getDisplayNum1())); 
          }
//  GOBACK
          setNotLogged(false); // no need to log, it is a normal termination
          this.setProgramEnded(true);
          return ;
      
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
      private void validateInputParm() throws Exception {
			// Declare local variables used in the method
			short lsParmLen = 0;
			short lreclMax = 0;
			short dataLenMin = 0;
			short dataLenMax = 0;
			LsParmG lsParmG = lsParm.getLsParmG();
			long lsParmDataLenMin = 0;
			long lsParmDataLenMax = 0;
			// End of variable declaration

      
// *----------------------------------------------------------------*

// *     Display '0010-validate-input-parm'
          lsParmLen = lsParm.getLsParmLen();
          lsParmG = lsParm.getLsParmG();
//  IF LS-PARM-LEN NOT = LENGTH OF LS-PARM-G OR NOT LS-PARM-MODE-VALID
          if (	( lsParmLen != LsParmG.getLsParmGFieldLength() )  || !(lsParmG.isLsParmModeValid()) ) { 
//  DISPLAY 'MISSING OR INVALID MODE PASSED' 'DEFAULTING MODE B'
              logger.info("MISSING OR INVALID MODE PASSEDDEFAULTING MODE B"); 
//  SET WS-MODE-BOTH TO TRUE
              work.setModeBothTrue(); 
              
          }
  
//  ELSE
          else { 
//  MOVE LS-PARM-MODE TO WS-MODE
              work.setMode(lsParmG.getLsParmMode());
  
          }
          lsParmDataLenMin = lsParmG.getLsParmDataLenMin();
          lsParmLen = lsParm.getLsParmLen();
//  IF LS-PARM-LEN NOT = LENGTH OF LS-PARM-G OR LS-PARM-DATA-LEN-MIN NOT NUMERIC
          if (	( lsParmLen != LsParmG.getLsParmGFieldLength() )  ||          !(lsParmG.lsParmDataLenMinIsNumeric() ) ) { 
//  DISPLAY 'MISSING OR INVALID MINIMUM LENGTH PASSED ' 'DEFAULTING MINIMUM LENGTH TO 0'
              logger.info("MISSING OR INVALID MINIMUM LENGTH PASSED DEFAULTING MINIMUM LENGTH TO 0"); 
              // MOVE +0 TO WS-DATA-LEN-MIN
              work.setDataLenMin((short)0);
          }
  
//  ELSE
          else { 
              lsParmDataLenMin = lsParmG.getLsParmDataLenMin();
              lreclMax = work.getLreclMax();
//  IF LS-PARM-DATA-LEN-MIN > WS-LRECL-MAX
              if (	( lsParmDataLenMin > lreclMax ) ) { 
//  MOVE LS-PARM-DATA-LEN-MAX TO WS-DISPLAY-NUM-1
//  FORMAT_1223488108 = "-ZZZZ9"
                  work.setDisplayNum1(CFUtil.cobolNumberFormatter(CONSTANTS.FORMAT_1223488108,String.valueOf(lsParmG.getLsParmDataLenMax()).toCharArray()));
  
//  MOVE WS-LRECL-MAX TO WS-DISPLAY-NUM-2
//  FORMAT_1223488108 = "-ZZZZ9"
                  work.setDisplayNum2(CFUtil.cobolNumberFormatter(CONSTANTS.FORMAT_1223488108,String.valueOf(work.getLreclMax()).toCharArray()));
//  DISPLAY 'INVALID MINIMUM LENGTH PASSED: ' WS-DISPLAY-NUM-1 ', IS GREATER THAN PERMITTED VALUE OF: ' WS-DISPLAY-NUM-2 ', DEFAULTING MINIMUM LENGTH TO 0'
                  logger.info("INVALID MINIMUM LENGTH PASSED: {}, IS GREATER THAN PERMITTED VALUE OF: {}, DEFAULTING MINIMUM LENGTH TO 0", new String(work.getDisplayNum1()), new String(work.getDisplayNum2())); 
                  // MOVE +0 TO WS-DATA-LEN-MIN
                  work.setDataLenMin((short)0);
              }
  
//  ELSE
              else { 
//  MOVE LS-PARM-DATA-LEN-MIN TO WS-DATA-LEN-MIN
                  work.setDataLenMin((short) lsParmG.getLsParmDataLenMin());
  
              }
          }
          lsParmLen = lsParm.getLsParmLen();
          lsParmDataLenMax = lsParmG.getLsParmDataLenMax();
//  IF LS-PARM-LEN NOT = LENGTH OF LS-PARM-G OR LS-PARM-DATA-LEN-MAX NOT NUMERIC
          if (	( lsParmLen != LsParmG.getLsParmGFieldLength() )  ||          !(lsParmG.lsParmDataLenMaxIsNumeric() ) ) { 
//  DISPLAY 'MISSING OR INVALID MAXIMUM LENGTH PASSED ' 'DEFAULTING MAXIMUM LENGTH TO 80'
              logger.info("MISSING OR INVALID MAXIMUM LENGTH PASSED DEFAULTING MAXIMUM LENGTH TO 80"); 
              // MOVE +80 TO WS-DATA-LEN-MAX
              work.setDataLenMax((short)80);
          }
  
//  ELSE
          else { 
              lsParmDataLenMax = lsParmG.getLsParmDataLenMax();
              lreclMax = work.getLreclMax();
//  IF LS-PARM-DATA-LEN-MAX > WS-LRECL-MAX
              if (	( lsParmDataLenMax > lreclMax ) ) { 
//  MOVE LS-PARM-DATA-LEN-MAX TO WS-DISPLAY-NUM-1
//  FORMAT_1223488108 = "-ZZZZ9"
                  work.setDisplayNum1(CFUtil.cobolNumberFormatter(CONSTANTS.FORMAT_1223488108,String.valueOf(lsParmG.getLsParmDataLenMax()).toCharArray()));
  
//  MOVE WS-LRECL-MAX TO WS-DISPLAY-NUM-2
//  FORMAT_1223488108 = "-ZZZZ9"
                  work.setDisplayNum2(CFUtil.cobolNumberFormatter(CONSTANTS.FORMAT_1223488108,String.valueOf(work.getLreclMax()).toCharArray()));
//  DISPLAY 'INVALID MAXIMUM LENGTH PASSED: ' WS-DISPLAY-NUM-1 ', IS GREATER THAN PERMITTED VALUE OF: ' WS-DISPLAY-NUM-2 ', DEFAULTING MAXIMUM LENGTH TO 80'
                  logger.info("INVALID MAXIMUM LENGTH PASSED: {}, IS GREATER THAN PERMITTED VALUE OF: {}, DEFAULTING MAXIMUM LENGTH TO 80", new String(work.getDisplayNum1()), new String(work.getDisplayNum2())); 
                  // MOVE +80 TO WS-DATA-LEN-MAX
                  work.setDataLenMax((short)80);
              }
  
//  ELSE
              else { 
//  MOVE LS-PARM-DATA-LEN-MAX TO WS-DATA-LEN-MAX
                  work.setDataLenMax((short) lsParmG.getLsParmDataLenMax());
  
              }
          }
          dataLenMin = work.getDataLenMin();
          dataLenMax = work.getDataLenMax();
//  IF WS-DATA-LEN-MIN > WS-DATA-LEN-MAX
          if (	( dataLenMin > dataLenMax )) { 
//  DISPLAY 'INVALID MINIMUM > MAXIMUM LENGTH PASSED.' ' DEFAULTING MINIMUM LENGTH TO 0' ', DEFAULTING MAXIMUM LENGTH TO 80'
              logger.info("INVALID MINIMUM > MAXIMUM LENGTH PASSED. DEFAULTING MINIMUM LENGTH TO 0, DEFAULTING MAXIMUM LENGTH TO 80"); 
              // MOVE +0 TO WS-DATA-LEN-MIN
              work.setDataLenMin((short)0);
              // MOVE +80 TO WS-DATA-LEN-MAX
              work.setDataLenMax((short)80);
          }
  
//  MOVE WS-DATA-LEN-MIN TO WS-DISPLAY-NUM-1
//  FORMAT_1223488108 = "-ZZZZ9"
          work.setDisplayNum1(CFUtil.cobolNumberFormatter(CONSTANTS.FORMAT_1223488108,String.valueOf(work.getDataLenMin()).toCharArray()));
//  MOVE WS-DATA-LEN-MAX TO WS-DISPLAY-NUM-2
//  FORMAT_1223488108 = "-ZZZZ9"
          work.setDisplayNum2(CFUtil.cobolNumberFormatter(CONSTANTS.FORMAT_1223488108,String.valueOf(work.getDataLenMax()).toCharArray()));
//  DISPLAY 'PROCESSING MODE IS: ' WS-MODE ', INPUT MINIMUM PARAMETER LENGTH ' WS-DISPLAY-NUM-1 ', WILL BE USED TO CONTROL ENGTH OF FIRST RECORD' ' WRITTEN'
          logger.info("PROCESSING MODE IS: {}, INPUT MINIMUM PARAMETER LENGTH {}, WILL BE USED TO CONTROL ENGTH OF FIRST RECORD WRITTEN", new String(work.getMode()), new String(work.getDisplayNum1())); 
//  DISPLAY 'INPUT MAXIMUM PARAMETER LENGTH ' WS-DISPLAY-NUM-2 ', WILL BE USED TO CONTROL NUMBER OF RECORDS' ' WRITTEN, AND LENGTH OF LONGEST RECORD'
          logger.info("INPUT MAXIMUM PARAMETER LENGTH {}, WILL BE USED TO CONTROL NUMBER OF RECORDS WRITTEN, AND LENGTH OF LONGEST RECORD", new String(work.getDisplayNum2())); 
      
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
      private void openInFile() throws Exception {
			// Declare local variables used in the method
			int inFileStatus = 0;
			// End of variable declaration

      
// *----------------------------------------------------------------*

// *     Display '0100-open-in-file'
//  OPEN INPUT IN-FILE
          inFile.open(new String(CONSTANTS.MODE_READ_ONLY_36242),inFile.getFileName(),inFile.getInFileCharSet(),inFile.getInFileCrlfFlag());
          work.setInFileStatus(inFile.getStatus() );
          inFileStatus = work.getInFileStatus();
//  IF WS-IN-FILE-STATUS NOT = 0
          if (	( inFileStatus != 0 )) { 
              // MOVE 16 TO RETURN-CODE
              this.setRc( 16);
//  DISPLAY 'ERROR OPENING INPUT FILE: ' WS-IN-FILE-STATUS
              logger.info("ERROR OPENING INPUT FILE: {}", String.valueOf(work.getInFileStatus())); 
//  GOBACK
              setNotLogged(false); // no need to log, it is a normal termination
              this.setProgramEnded(true);
              return ;
          }
  
      
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
      private void openOutFile() throws Exception {
			// Declare local variables used in the method
			int outFileStatus = 0;
			// End of variable declaration

      
// *----------------------------------------------------------------*

// *     Global variables used herein set by calling paragraphs:
// *     - none
// *----------------------------------------------------------------*
// *     display '0100-open-out-file'
//  OPEN OUTPUT OUT-FILE
          outFile.open(new String(CONSTANTS.MODE_WRITE_ONLY_36397),outFile.getFileName(),outFile.getOutFileCharSet(),outFile.getOutFileCrlfFlag());
          work.setOutFileStatus(outFile.getStatus() );
          outFileStatus = work.getOutFileStatus();
//  IF WS-OUT-FILE-STATUS NOT = 0
          if (	( outFileStatus != 0 )) { 
              // MOVE 16 TO RETURN-CODE
              this.setRc( 16);
//  DISPLAY 'ERROR OPENING OUPUT FILE: ' WS-OUT-FILE-STATUS
              logger.info("ERROR OPENING OUPUT FILE: {}", String.valueOf(work.getOutFileStatus())); 
//  GOBACK
              setNotLogged(false); // no need to log, it is a normal termination
              this.setProgramEnded(true);
              return ;
          }
  
      
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
      private void readInFile() throws Exception {
      
// *----------------------------------------------------------------*

// *     Global variables set herein for calling paragraphs:
// *     - ws-rec-in-ctr: number of records written
// *     - ws-in-eof-flag: end of file marker
// *----------------------------------------------------------------*
// *     display '0200-read-in-file'
//  MOVE ZERO TO WS-IN-REC-LEN
          work.setInRecLen(0);
//  READ IN-FILE INTO WS-IN-REC
          	inFile.read();
          work.setInRecLen(inFile.getRecLen());
          work.setInFileStatus(inFile.getStatus() );
          if (!inFile.hasEnded()) {
             inRecMax.setString(inFile.getRecord());
             inRec.setString(replace(inRec.toCharArray(),substring(inRecMax.toCharArray(),0,inFile.getRecLen()),0,inRec.length()));
          }
//  AT END
          if (inFile.hasEnded()) {  
//  SET NO-MORE-RECORDS TO TRUE
              work.setNoMoreRecordsTrue(); 
              
            }
//  NOT AT END
          else  {
//  ADD +1 TO WS-REC-IN-CTR
              work.setRecInCtr( (short) (work.getRecInCtr()+(short)1));
//  PERFORM 0210-VALIDATE-IN-REC-DATA THRU 0210-VALIDATE-IN-REC-DATA-EXIT
              validateInRecData();/*0210-VALIDATE-IN-REC-DATA*/
              if (this.isProgramEnded()) {
                  return ;
              }
            }
      
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
      private void validateInRecData() throws Exception {
			// Declare local variables used in the method
			int inRecDataLen = 0;
			short dataLenMax = 0;
			short k = 0;
			 final int IN_REC_LEN_LENGTH = 2;
			InRecData inRecData = inRec.getInRecData();
			// End of variable declaration

      
// *----------------------------------------------------------------*

// *     Global variables used herein set by calling paragraphs:
// *     - none
// *----------------------------------------------------------------*
// *     display '0210-validate-in-rec-data'
          dataLenMax = work.getDataLenMax();
          inRecDataLen = inRec.getInRecDataLen();
//  IF WS-IN-REC-DATA-LEN > WS-DATA-LEN-MAX
          if (	( inRecDataLen > dataLenMax ) ) { 
              // MOVE 16 TO RETURN-CODE
              this.setRc( 16);
//  MOVE WS-REC-IN-CTR TO WS-DISPLAY-NUM-1
//  FORMAT_1223488108 = "-ZZZZ9"
              work.setDisplayNum1(CFUtil.cobolNumberFormatter(CONSTANTS.FORMAT_1223488108,String.valueOf(work.getRecInCtr()).toCharArray()));
//  MOVE WS-IN-REC-DATA-LEN TO WS-DISPLAY-NUM-2
//  FORMAT_1223488108 = "-ZZZZ9"
              work.setDisplayNum2(CFUtil.cobolNumberFormatter(CONSTANTS.FORMAT_1223488108,String.valueOf(inRec.getInRecDataLen()).toCharArray()));
//  DISPLAY 'INPUT FILE DATA INTEGRITY ERROR, ' 'RECORD NUMBER: ' WS-DISPLAY-NUM-1 ', RECORD LENGTH: ' WS-DISPLAY-NUM-2
              logger.info("INPUT FILE DATA INTEGRITY ERROR, RECORD NUMBER: {}, RECORD LENGTH: {}", new String(work.getDisplayNum1()), new String(work.getDisplayNum2())); 
//  GOBACK
              setNotLogged(false); // no need to log, it is a normal termination
              this.setProgramEnded(true);
              return ;
          }
  
          // MOVE ZERO TO K
          work.setK((short) 0);
//  PERFORM VARYING J FROM +1 BY +1 UNTIL J > WS-IN-REC-DATA-LEN
          for (work.setJ(1); (	( work.getJ() <= inRec.getInRecDataLen() ) ) ; work.setJ(work.getJ() + 1) ) {
//  ADD +1 TO K
              work.setK( (short) (work.getK()+(short)1));
              k = work.getK();
//  IF K > LENGTH OF WS-DATA-VALUES
              if (	( k > DataValues.getDataValuesFieldLength() ) ) { 
                  // MOVE +1 TO K
                  work.setK((short)1);
              }
  
//  IF WS-DATA-VALUES (K : 1) NOT = WS-IN-REC-BYTE (J)
              if (		compareChars(substring(dataValues.getCharArray(),(work.getK()-1), (work.getK() + 0) ),inRecData.getInRecByte(work.getJ() - 1)) != 0 ) { 
                  // MOVE 16 TO RETURN-CODE
                  this.setRc( 16);
//  MOVE WS-REC-IN-CTR TO WS-DISPLAY-NUM-1
//  FORMAT_1223488108 = "-ZZZZ9"
                  work.setDisplayNum1(CFUtil.cobolNumberFormatter(CONSTANTS.FORMAT_1223488108,String.valueOf(work.getRecInCtr()).toCharArray()));
//  MOVE WS-IN-REC-LEN TO WS-DISPLAY-NUM-2
//  FORMAT_1223488108 = "-ZZZZ9"
                  work.setDisplayNum2(CFUtil.cobolNumberFormatter(CONSTANTS.FORMAT_1223488108,String.valueOf(work.getInRecLen()).toCharArray()));
                  work.setDisplayNum3(CFUtil.cobolNumberFormatter(CONSTANTS.FORMAT_1223488108,String.valueOf(work.getJ() + IN_REC_LEN_LENGTH)));
//  DISPLAY 'INPUT FILE DATA INTEGRITY ERROR AT ' 'RECORD NUMBER: ' WS-DISPLAY-NUM-1 ', RECORD LENGTH: ' WS-DISPLAY-NUM-2 ', AT BYTE: ' WS-DISPLAY-NUM-3 ', EXPECTED: ' WS-DATA-VALUES (K : 1) ', FOUND: ' WS-IN-REC-BYTE (J)
                  logger.info("INPUT FILE DATA INTEGRITY ERROR AT RECORD NUMBER: {}, RECORD LENGTH: {}, AT BYTE: {}, EXPECTED: {}, FOUND: {}", new String(work.getDisplayNum1()), new String(work.getDisplayNum2()), new String(work.getDisplayNum3()), new String(substring(dataValues.getCharArray(),(work.getK()-1), (work.getK() + 0) )), new String(inRec.getInRecData().getInRecByte(work.getJ() - 1))); 
//  GOBACK
                  setNotLogged(false); // no need to log, it is a normal termination
                  this.setProgramEnded(true);
                  return ;
              }
  
          }
      
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
      private void writeOutFile() throws Exception {
			// Declare local variables used in the method
			 final int OUT_REC_LEN_LENGTH = 2;
			int outFileStatus = 0;
			// End of variable declaration

      
// *----------------------------------------------------------------*

// *     Global variables used herein set by calling paragraphs:
// *     - i: subscript is used to calculate variable record length
// *
// *     global variables set herein for calling ragraphs:
// *     - ws-rec-out-ctr: number of records written
// *----------------------------------------------------------------*
// *     display '0200-write-out-file'
//  MOVE I TO WS-OUT-REC-DATA-LEN
          outRec.setOutRecDataLen(work.getI());
          work.setOutRecLen((int)Math.abs(work.getI() + OUT_REC_LEN_LENGTH));

// *     Move ws-out-rec-data-len    to ws-display-num-1
// *     display 'about to write out-file with data len of: '
// *             ws-display-num-1
//  WRITE OUT-REC-MAX FROM WS-OUT-REC
          outRecMax.setString(outRec.toCharArray());
          outFile.setRecord(substring(outRecMax.toCharArray(),0,work.getOutRecLen()));
          outFile.write(work.getOutRecLen()); 
          work.setOutFileStatus(outFile.getStatus() );
          outFileStatus = work.getOutFileStatus();
//  IF WS-OUT-FILE-STATUS NOT = 0
          if (	( outFileStatus != 0 )) { 
              // MOVE 16 TO RETURN-CODE
              this.setRc( 16);
//  DISPLAY 'ERROR WRITING OUTPUT: ' WS-OUT-FILE-STATUS
              logger.info("ERROR WRITING OUTPUT: {}", String.valueOf(work.getOutFileStatus())); 
//  GOBACK
              setNotLogged(false); // no need to log, it is a normal termination
              this.setProgramEnded(true);
              return ;
          }
  
//  ADD +1 TO WS-REC-OUT-CTR
          work.setRecOutCtr( (short) (work.getRecOutCtr()+(short)1));
      
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
      private void initializeOutRec() throws Exception {
			// Declare local variables used in the method
			short k = 0;
			// End of variable declaration

      
// *----------------------------------------------------------------*

// *     Global variables used herein set by calling paragraphs:
// *     - none
// *----------------------------------------------------------------*
// *     display '0210-initialize-out-rec'
//  MOVE WS-DATA-LEN-MAX TO WS-OUT-REC-DATA-LEN
          outRec.setOutRecDataLen(work.getDataLenMax());
          // MOVE ZERO TO K
          work.setK((short) 0);
//  PERFORM VARYING J FROM +1 BY +1 UNTIL J > WS-DATA-LEN-MAX
          for (work.setJ(1); (	( work.getJ() <= work.getDataLenMax() )) ; work.setJ(work.getJ() + 1) ) {
//  ADD +1 TO K
              work.setK( (short) (work.getK()+(short)1));
              k = work.getK();
//  IF K > LENGTH OF WS-DATA-VALUES
              if (	( k > DataValues.getDataValuesFieldLength() ) ) { 
                  // MOVE +1 TO K
                  work.setK((short)1);
              }
  
//  MOVE WS-DATA-VALUES (K : 1) TO WS-OUT-REC-BYTE (J)
              outRec.getOutRecData().setOutRecByte((work.getJ() - 1),substring(dataValues.getCharArray(),(work.getK()-1), (work.getK() + 0) ));
          }
      
      }
      /**
      * closeInFile 
      *   This method is derived from 
  *   COBOL Paragraph - 0300-CLOSE-IN-FILE COBOL Cyclomatic complexity - 1
      * Input  : None 

      * Output : None 

      * @throws CFException
      */
      private void closeInFile() throws Exception {
      
// *----------------------------------------------------------------*

// *     Global variables used herein set by calling paragraphs:
// *     - none
// *----------------------------------------------------------------*
// *     display '0300-close-in-file'
//  CLOSE IN-FILE
          inFile.close(); 
          work.setInFileStatus(inFile.getStatus() );
      
      }
      /**
      * closeOutFile 
      *   This method is derived from 
  *   COBOL Paragraph - 0300-CLOSE-OUT-FILE COBOL Cyclomatic complexity - 1
      * Input  : None 

      * Output : None 

      * @throws CFException
      */
      private void closeOutFile() throws Exception {
      
// *----------------------------------------------------------------*

// *     Global variables used herein set by calling paragraphs:
// *     - none
// *----------------------------------------------------------------*
// *     display '0300-close-out-file'
//  CLOSE OUT-FILE
          outFile.close(); 
          work.setOutFileStatus(outFile.getStatus() );
      
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
  
      public int call(Object[] params) throws Exception {
      
      int len = params.length;
         if (len > 0 && params[0] != null )
            lsParm.set((Field)params[0]);
         // invoke the process and return rc
         return process();
         
      }
      
      public int call(Field... parameters) throws Exception {
         for (int index = 0; index < parameters.length;index++) {
             switch(index) {
              case 0:
                      if(parameters[index] != null ) {
              		if (parameters[index] instanceof LsParm) {
                       	this.lsParm = ((LsParm) parameters[index]);
                  	} else {
                       	this.lsParm.set(parameters[index]);
                  	}
                  }
                
                  break;
            }
         }
          return process();
      }
      
      
  
  
  
  
  
  }
