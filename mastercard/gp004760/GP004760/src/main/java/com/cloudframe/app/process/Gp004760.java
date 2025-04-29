  package com.cloudframe.app.process;
  /* 
******************************************************************
*          -- -- -- c o n f i d e n t i a l -- -- --             *
*    this item contains information and procedures which are     *
*    proprietary to mastercard international, incorporated,      *
*    and which are confidential.  it is provided with the        *
*    express understanding that it is to be used only for the    *
*    benefit of interbank card association, and is not to be     *
*    used, copied, or disclosed for any other purpose.  any      *
*    authorized reproduction (in whole or in part) of this       *
*    material must be marked with this legend.                   *
******************************************************************
* author.         siva kumar.                                    *
* date-written.   apr,2007.                                      *
* date compiled.  apr,2007.                                      *
* security.       property of mastercard international, inc.     *
******************************************************************
* program functionality:                                         *
******************************************************************
*                                                                *
*  this is a cobol db2 program that takes care of                *
*  mps extract of cab code                                       *
*                                                                *
******************************************************************
*                       h i s t o r y                            *
******************************************************************
*    project         :mps  release 07.2                          *
*    date            :2007/04/03                                 *
*    version         :intial                                     *
*    programmer      :siva kumar.                              *
*    modification    :initial version.                           *
******************************************************************
*    project         :mps  release 08.2                          *
*    date            :2008/16/07                                 *
*    version         :1.01                                       *
*    programmer      :chandrasekaran                             *
*    modification    :included the 9300-db2-error-handling in    *
*                     2300-cabtccext-csr-close (taskid#210)      *
******************************************************************
*    project         :mps  release 15.1 (nspk  c76142)           *
*    date            :2015/03/27                                 *
*    programmer      :de la cerda                                *
*    modification    :added sys202 for the nspk extract file     *
*                     all changes noted with 'c76142'            *
******************************************************************
*/
  
  import org.springframework.beans.factory.annotation.Autowired;
  import org.springframework.beans.factory.annotation.Qualifier;
  import com.cloudframe.app.gp004760.file.*;
  import org.springframework.web.bind.annotation.GetMapping;
  import org.slf4j.Logger;
  import org.slf4j.LoggerFactory;
  import com.cloudframe.app.exception.CFException;
  import org.springframework.stereotype.Component;
  import org.springframework.web.bind.annotation.RestController;
  import com.cloudframe.app.utility.CFUtil;
  import com.cloudframe.app.repository.Gp004760Repository;
  import com.cloudframe.app.data.Field;
  import com.cloudframe.app.process.Db200020;
  import com.cloudframe.app.exception.Terminate;
  import com.cloudframe.app.gp004760.dto.*;
  import com.cloudframe.app.gp004760.dto.NspkExtractRec800;
  import com.cloudframe.app.gp004760.dto.Gp004760CabTccExtract;
  import com.cloudframe.app.gp004760.file.records.Sys202NspkCabTccExtRec;
  import com.cloudframe.app.gp004760.dto.Tgpaitb;
  import com.cloudframe.app.gp004760.dto.Db2ErrModuleMsg600;
  import com.cloudframe.app.gp004760.dto.CabTccArray800;
  import com.cloudframe.app.gp004760.dto.ThisProgramNameGroup300;
  import com.cloudframe.app.gp004760.file.records.Sys201CabTccExtRec;
  import com.cloudframe.app.gp004760.dto.Sqlca;
  import com.cloudframe.app.global.sharedvar.Db85102dWorkFields;
  import com.cloudframe.app.gp004760.dto.Work;
  import com.cloudframe.app.common.CONSTANTS;
  import com.cloudframe.app.common.SQLS;
  import org.springframework.beans.factory.annotation.Value;
  import com.cloudframe.app.dao.Db2Base;
  import java.sql.SQLException;
  
  @Component("gp004760")
  
  public class Gp004760 extends CommonProcess {
  
  Logger logger = LoggerFactory.getLogger(Gp004760.class);
  
  private NspkExtractRec800 nspkExtractRec800 = new NspkExtractRec800() ;
  private Gp004760CabTccExtract gp004760CabTccExtract = new Gp004760CabTccExtract() ;
  private Sys202NspkCabTccExtRec sys202NspkCabTccExtRec = new Sys202NspkCabTccExtRec() ;
  private Tgpaitb tgpaitb = new Tgpaitb() ;
  private Db2ErrModuleMsg600 db2ErrModuleMsg600 = new Db2ErrModuleMsg600() ;
  private CabTccArray800 cabTccArray800 = new CabTccArray800() ;
  private ThisProgramNameGroup300 thisProgramNameGroup300 = new ThisProgramNameGroup300() ;
  private Sys201CabTccExtRec sys201CabTccExtRec = new Sys201CabTccExtRec() ;
  private Sqlca sqlca = new Sqlca() ;
  private Work work = new Work() ;
  
  @Value("${GP004760.dbQualifier:}")
  private String dbQualifier;
  
  
  @Autowired 
  @Qualifier("gp004760_db2cloneFile")
  Sys201CabTccExt sys201CabTccExt;
  @Autowired 
  @Qualifier("gp004760_sys201CabTccExt")
  Sys202NspkCabTccExt sys202NspkCabTccExt;
  @Autowired 
  @Qualifier("gp004760_sys202NspkCabTccExt")
  Db2Base db2Base;
  @Autowired 
  @Qualifier("db2Base")
  Gp004760Repository gp004760Repository;
  @Autowired 
  @Qualifier("gp004760Repository")
  Db200020 db200020;
  @Autowired 
  @Qualifier("db200020")
  Db85102dWorkFields db85102dWorkFields;
  
  
  
  
  
  
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
//  PERFORM 0000-MAINLINE-PROCESS
          mainlineProcess();/*0000-MAINLINE-PROCESS*/
          if (this.isProgramEnded()) {
              return getRc();
          }
       } catch(Exception e) {
            handleErrorCode(e);
            throw e;
       }
        finally {
      		if(sys201CabTccExt.hasOpened() && !sys201CabTccExt.isReadOnly()) { 
      			sys201CabTccExt.flush(); 
      		}
      		if(sys202NspkCabTccExt.hasOpened() && !sys202NspkCabTccExt.isReadOnly()) { 
      			sys202NspkCabTccExt.flush(); 
      		}
		handleDbAtEnd(db2Base); 
		clearVars(); 
      

      }
      
       return getRc(); // Exit with return code
      // end of process method
      }
      /**
      * mainlineProcess 
      *   This method is derived from 
  *   COBOL Paragraph - 0000-MAINLINE-PROCESS COBOL Cyclomatic complexity - 1
      * Input  : None 

      * Output : None 

      * @throws CFException
      */
      private void mainlineProcess() throws Exception {
//  PERFORM 1000-INITIALIZATION THRU 1000-EXIT
          initialization();/*1000-INITIALIZATION*/
          if (this.isProgramEnded()) {
              return ;
          }
//  PERFORM 2000-PROCESS-CABTCCEXT THRU 2000-EXIT
          processCabtccext();/*2000-PROCESS-CABTCCEXT*/
          if (this.isProgramEnded()) {
              return ;
          }
//  PERFORM 3000-FINALIZE THRU 3000-EXIT
          finalize3000();/*3000-FINALIZE*/
          if (this.isProgramEnded()) {
              return ;
          }
//  PERFORM 9900-TERMINATION
          termination();/*9900-TERMINATION*/
          if (this.isProgramEnded()) {
              return ;
          }
          ;
      
      }
      /**
      * initialization 
      *   This method is derived from 
  *   COBOL Paragraph - 1000-INITIALIZATION COBOL Cyclomatic complexity - 1
      * Input  : None 

      * Output :  

      * - cabTccArray800                 COBOL Name: 800-CAB-TCC-ARRAY
      * - outfileCnt                     COBOL Name: WS-OUTFILE-CNT
      * - ocrCnt                         COBOL Name: WS-OCR-CNT
      *
      * @throws CFException
      */
      private void initialization() throws Exception {
      
// ******************************************************************
// * This paragraph does the necessary initialization.              *
// ******************************************************************
//  MOVE SPACES TO 800-CAB-TCC-ARRAY
          cabTccArray800.setString(CONSTANTS.SPACE_9999);
//  PERFORM 1100-OPEN-SYS201-FILE
          openSys201File();/*1100-OPEN-SYS201-FILE*/
          if (this.isProgramEnded()) {
              return ;
          }
//  PERFORM 1101-OPEN-SYS202-FILE
          openSys202File();/*1101-OPEN-SYS202-FILE*/
          if (this.isProgramEnded()) {
              return ;
          }

// ********* C76142 changes start

// ********* C76142 changes end
//  INITIALIZE WS-OUTFILE-CNT , WS-OCR-CNT
          work.setOutfileCnt(0);
          work.setOcrCnt(0);
      
      }
      /**
      * openSys201File 
      *   This method is derived from 
  *   COBOL Paragraph - 1100-OPEN-SYS201-FILE COBOL Cyclomatic complexity - 2
      * Input  : None 

      * Output :  

      * - db85102dDb2cloneStatus         COBOL Name: DB85102D-DB2CLONE-STATUS
      * - sys201FileStatus200            COBOL Name: 200-SYS201-FILE-STATUS
      * - sys202FileStatus200            COBOL Name: 200-SYS202-FILE-STATUS
      * - abendCode300                   COBOL Name: 300-ABEND-CODE
      * - errorMessage600                COBOL Name: 600-ERROR-MESSAGE
      * - abendPara300                   COBOL Name: 300-ABEND-PARA
      * - rc                             COBOL Name: RETURN-CODE
      * - statusCode600                  COBOL Name: 600-STATUS-CODE
      *
      * @throws CFException
      */
      private void openSys201File() throws Exception {
      
// ******************************************************************
// * 1100-Open-sys201-file.                                         *
// *    open mip extract file                                       *
// ******************************************************************
//  OPEN OUTPUT SYS201-CAB-TCC-EXT
          sys201CabTccExt.open(new String(CONSTANTS.MODE_WRITE_ONLY_36397),sys201CabTccExt.getFileName(),sys201CabTccExt.getSys201CabTccExtCharSet(),sys201CabTccExt.getSys201CabTccExtCrlfFlag());
          work.setSys201FileStatus200(sys201CabTccExt.getStatusString() );
//  IF 88-200-SYS201-SUCCESS
//  ELSE
          if (!(work.isSys201Success88200()) ) { 
//  SET 88-300-FILE-OPEN-ABEND-CODE TO TRUE
              work.setFileOpenAbendCode88300True(); 
              
//  SET 88-600-ABEND-OPEN-SYS201 TO TRUE
              work.setAbendOpenSys20188600True(); 
              
//  SET 88-300-OPEN-SYS201-PARA TO TRUE
              work.setOpenSys201Para88300True(); 
              
//  MOVE 300-ABEND-CODE TO RETURN-CODE
              this.setRc(CFUtil.getInt(work.getAbendCode300()));
//  MOVE 200-SYS201-FILE-STATUS TO 600-STATUS-CODE
              work.setStatusCode600(padLeftZeros(2,work.getSys201FileStatus200(),false));
//  PERFORM 9000-ABEND-PARA
              abendPara();/*9000-ABEND-PARA*/
              if (this.isProgramEnded()) {
                  return ;
              }
          }
      
      }
      /**
      * openSys202File 
      *   This method is derived from 
  *   COBOL Paragraph - 1101-OPEN-SYS202-FILE COBOL Cyclomatic complexity - 2
      * Input  : None 

      * Output :  

      * - db85102dDb2cloneStatus         COBOL Name: DB85102D-DB2CLONE-STATUS
      * - sys201FileStatus200            COBOL Name: 200-SYS201-FILE-STATUS
      * - sys202FileStatus200            COBOL Name: 200-SYS202-FILE-STATUS
      * - abendCode300                   COBOL Name: 300-ABEND-CODE
      * - errorMessage600                COBOL Name: 600-ERROR-MESSAGE
      * - abendPara300                   COBOL Name: 300-ABEND-PARA
      * - rc                             COBOL Name: RETURN-CODE
      * - statusCode600                  COBOL Name: 600-STATUS-CODE
      *
      * @throws CFException
      */
      private void openSys202File() throws Exception {
      
// ********* C76142 changes start
// ******************************************************************
// * 1101-open-sys202-file.                                         *
// *    open nspk extract file                                      *
// ******************************************************************
//  OPEN OUTPUT SYS202-NSPK-CAB-TCC-EXT
          sys202NspkCabTccExt.open(new String(CONSTANTS.MODE_WRITE_ONLY_36397),sys202NspkCabTccExt.getFileName(),sys202NspkCabTccExt.getSys202NspkCabTccExtCharSet(),sys202NspkCabTccExt.getSys202NspkCabTccExtCrlfFlag());
          work.setSys202FileStatus200(sys202NspkCabTccExt.getStatusString() );
//  IF 88-200-SYS202-SUCCESS
//  ELSE
          if (!(work.isSys202Success88200()) ) { 
//  SET 88-300-FILE-OPEN-ABEND-CODE TO TRUE
              work.setFileOpenAbendCode88300True(); 
              
//  SET 88-600-ABEND-OPEN-SYS202 TO TRUE
              work.setAbendOpenSys20288600True(); 
              
//  SET 88-300-OPEN-SYS202-PARA TO TRUE
              work.setOpenSys202Para88300True(); 
              
//  MOVE 300-ABEND-CODE TO RETURN-CODE
              this.setRc(CFUtil.getInt(work.getAbendCode300()));
//  MOVE 200-SYS202-FILE-STATUS TO 600-STATUS-CODE
              work.setStatusCode600(padLeftZeros(2,work.getSys202FileStatus200(),false));
//  PERFORM 9000-ABEND-PARA
              abendPara();/*9000-ABEND-PARA*/
              if (this.isProgramEnded()) {
                  return ;
              }
          }
      
      }
      /**
      * processCabtccext 
      *   This method is derived from 
  *   COBOL Paragraph - 2000-PROCESS-CABTCCEXT COBOL Cyclomatic complexity - 2
      * Input  :  

      * - cabtccextCsr100                COBOL Name: 100-CABTCCEXT-CSR
      *
      * Output : None 

      * @throws CFException
      */
      private void processCabtccext() throws Exception {
      
// ******************************************************************
// ***** 2000-Process-cabtccext                                 *****
// ***** processes all records until sqlcode = 100              *****
// ******************************************************************
//  PERFORM 2100-CABTCCEXT-CSR-OPEN
          cabtccextCsrOpen();/*2100-CABTCCEXT-CSR-OPEN*/
          if (this.isProgramEnded()) {
              return ;
          }
//  PERFORM 2200-CABTCCEXT-CSR-FETCH UNTIL 100-END-CABTCCEXT-CSR
          while (!(work.isEndCabtccextCsr100()) ) {
             cabtccextCsrFetch();/*2200-CABTCCEXT-CSR-FETCH*/
             if (this.isProgramEnded()) {
                 return ;
             }
          }
//  PERFORM 2300-CABTCCEXT-CSR-CLOSE
          cabtccextCsrClose();/*2300-CABTCCEXT-CSR-CLOSE*/
          if (this.isProgramEnded()) {
              return ;
          }
//  PERFORM 2500-CABEXT-OUTFILE-PROCESS THRU 2500-EXIT
          cabextOutfileProcess();/*2500-CABEXT-OUTFILE-PROCESS*/
          if (this.isProgramEnded()) {
              return ;
          }
          ;
      
      }
      /**
      * cabtccextCsrOpen 
      *   This method is derived from 
  *   COBOL Paragraph - 2100-CABTCCEXT-CSR-OPEN COBOL Cyclomatic complexity - 4
      * Input  :  

      * - sqlcode                        COBOL Name: SQLCODE
      *
      * Output :  

      * - cabtccextCsr100                COBOL Name: 100-CABTCCEXT-CSR
      * - wsSqlcodeDisp800               COBOL Name: 800-WS-SQLCODE-DISP
      * - sqlcode                        COBOL Name: SQLCODE
      * - wsCurrParagraph800             COBOL Name: 800-WS-CURR-PARAGRAPH
      * - wsSqlFunction800               COBOL Name: 800-WS-SQL-FUNCTION
      * - wsCurrTable800                 COBOL Name: 800-WS-CURR-TABLE
      *
      * @throws CFException
      */
      private void cabtccextCsrOpen() throws Exception {
      
// ******************************************************************
// ***** 2100-Cabtccext-csr-open.                               *****
// ***** open the cursor                                        *****
// ******************************************************************
//  SET 100-START-CABTCCEXT-CSR TO TRUE
          work.setStartCabtccextCsr100True(); 
          
//  SELECT A.CAB_CD , A.AUTH_TXN_CAT_CD FROM TGPAITB A WHERE A.REC_STAT_CD = 'A' AND A.EFF_TS = ( SELECT MAX ( A1.EFF_TS ) FROM TGPAITB A1 WHERE A.CAB_CD = A1.CAB_CD AND A1.DEL_SW = 'N' AND A1.EFF_TS <= CURRENT TIMESTAMP - CURRENT TIMEZONE ) ORDER BY CAB_CD
          gp004760Repository.openCabtccextCsrGp004760(sqlca);
//  EVALUATE SQLCODE
          switch(sqlca.getSqlcode()){
          	case 0:
          break;
          default :
              // MOVE SQLCODE TO 800-WS-SQLCODE-DISP
              //  FORMAT1016704244 = "-999"
              work.setWsSqlcodeDisp800(CFUtil.cobolNumberFormatter(CONSTANTS.FORMAT1016704244,String.valueOf(sqlca.getSqlcode()).toCharArray()));
              // MOVE '2100-CABTCCEXT-CSR-OPEN' TO 800-WS-CURR-PARAGRAPH
              work.setWsCurrParagraph800(CONSTANTS.LITERAL_2100_MN3_CABTCCEXTCSROPEN_B7_);
              // MOVE 'OPEN CURSOR' TO 800-WS-SQL-FUNCTION
              work.setWsSqlFunction800(CONSTANTS.LITERAL_OPEN_B15_CURSOR);
              // MOVE 'TGPAITB' TO 800-WS-CURR-TABLE
              work.setWsCurrTable800(CONSTANTS.LITERAL_TGPAITB_B18_);
//  PERFORM 9300-DB2-ERROR-HANDLING
              db2ErrorHandling();/*9300-DB2-ERROR-HANDLING*/
              if (this.isProgramEnded()) {
                  return ;
              }
          }
      
      }
      /**
      * cabtccextCsrFetch 
      *   This method is derived from 
  *   COBOL Paragraph - 2200-CABTCCEXT-CSR-FETCH COBOL Cyclomatic complexity - 5
      * Input  :  

      * - tgpaitbCabCd                   COBOL Name: TGPAITB-CAB-CD
      * - tgpaitbAuthTxnCatCd            COBOL Name: TGPAITB-AUTH-TXN-CAT-CD
      * - plusOneHundred300              COBOL Name: 300-PLUS-ONE-HUNDRED
      * - sqlcode                        COBOL Name: SQLCODE
      *
      * Output :  

      * - idx800                         COBOL Name: 800-IDX
      * - tgpaitbCabCd                   COBOL Name: TGPAITB-CAB-CD
      * - authTxnCatCd800                COBOL Name: 800-AUTH-TXN-CAT-CD
      * - tgpaitbAuthTxnCatCd            COBOL Name: TGPAITB-AUTH-TXN-CAT-CD
      * - nspkCabCd800                   COBOL Name: 800-NSPK-CAB-CD
      * - nspkTcc800                     COBOL Name: 800-NSPK-TCC
      * - cabtccextCsr100                COBOL Name: 100-CABTCCEXT-CSR
      * - wsSqlcodeDisp800               COBOL Name: 800-WS-SQLCODE-DISP
      * - sqlcode                        COBOL Name: SQLCODE
      * - wsCurrParagraph800             COBOL Name: 800-WS-CURR-PARAGRAPH
      * - wsSqlFunction800               COBOL Name: 800-WS-SQL-FUNCTION
      * - wsCurrTable800                 COBOL Name: 800-WS-CURR-TABLE
      *
      * @throws CFException
      */
      private void cabtccextCsrFetch() throws Exception {
			// Declare local variables used in the method
			int sqlcode = 0;
			short plusOneHundred300 = 0;
			// End of variable declaration

      
// ******************************************************************
// ***** 2200-Cabtccext-csr-fetch                               *****
// ***** cursor fetch                                           *****
// ******************************************************************
//  FETCH CABTCCEXT_CSR INTO ? , ?
          gp004760Repository.fetchCabtccextCsrGp004760(tgpaitb,sqlca);
          sqlcode = sqlca.getSqlcode();
          plusOneHundred300 = work.getPlusOneHundred300();
//  EVALUATE SQLCODE
          if  (	( sqlcode == 0 )) { 
//  MOVE TGPAITB-CAB-CD TO 800-IDX
              work.setIdx800( tgpaitb.getTgpaitbCabCd());
//  MOVE TGPAITB-AUTH-TXN-CAT-CD TO 800-AUTH-TXN-CAT-CD ( 800-IDX )
              cabTccArray800.setAuthTxnCatCd800(((int) work.getIdx800() - 1),tgpaitb.getTgpaitbAuthTxnCatCd());

// ********* C76142 changes start
//  MOVE TGPAITB-CAB-CD TO 800-NSPK-CAB-CD
              nspkExtractRec800.setNspkCabCd800(tgpaitb.getTgpaitbCabCd());
//  MOVE TGPAITB-AUTH-TXN-CAT-CD TO 800-NSPK-TCC
              nspkExtractRec800.setNspkTcc800(tgpaitb.getTgpaitbAuthTxnCatCd());
//  PERFORM 2901-WRITE-SYS202-FILE
              writeSys202File();/*2901-WRITE-SYS202-FILE*/
              if (this.isProgramEnded()) {
                  return ;
              }
          }
          else if  (	( sqlcode == plusOneHundred300 ) ) { 
//  SET 100-END-CABTCCEXT-CSR TO TRUE
              work.setEndCabtccextCsr100True(); 
              
          }
          else   { 
              // MOVE SQLCODE TO 800-WS-SQLCODE-DISP
              //  FORMAT1016704244 = "-999"
              work.setWsSqlcodeDisp800(CFUtil.cobolNumberFormatter(CONSTANTS.FORMAT1016704244,String.valueOf(sqlca.getSqlcode()).toCharArray()));
              // MOVE ' 2200-CABTCCEXT-CSR-FETCH' TO 800-WS-CURR-PARAGRAPH
              work.setWsCurrParagraph800(CONSTANTS.LITERAL_B6_2200_MN3_CABTCCEXTCSRFETCH);
              // MOVE 'FETCH CURSOR' TO 800-WS-SQL-FUNCTION
              work.setWsSqlFunction800(CONSTANTS.LITERAL_FETCH_B14_CURSOR);
              // MOVE 'TGPAITB' TO 800-WS-CURR-TABLE
              work.setWsCurrTable800(CONSTANTS.LITERAL_TGPAITB_B18_);
//  PERFORM 9300-DB2-ERROR-HANDLING
              db2ErrorHandling();/*9300-DB2-ERROR-HANDLING*/
              if (this.isProgramEnded()) {
                  return ;
              }
          }
  
      
      }
      /**
      * cabextOutfileProcess 
      *   This method is derived from 
  *   COBOL Paragraph - 2500-CABEXT-OUTFILE-PROCESS COBOL Cyclomatic complexity - 5
      * Input  :  

      * - idx800                         COBOL Name: 800-IDX
      * - authTxnCatCd800                COBOL Name: 800-AUTH-TXN-CAT-CD
      *
      * Output :  

      * - sub800                         COBOL Name: 800-SUB
      * - idx800                         COBOL Name: 800-IDX
      * - gp004760RecordId               COBOL Name: GP004760-RECORD-ID
      * - gp004760AuthTxnCatCd           COBOL Name: GP004760-AUTH-TXN-CAT-CD
      * - authTxnCatCd800                COBOL Name: 800-AUTH-TXN-CAT-CD
      *
      * @throws CFException
      */
      private void cabextOutfileProcess() throws Exception {
			// Declare local variables used in the method
			long idx800 = 0;
			long sub800 = 0;
			// End of variable declaration

      
// ******************************************************************
// ***** 2500-Cabext-outfile-process.                           *****
// ***** populate the values to the output records.             *****
// ***** write to the cab  ext output file.                     *****
// ******************************************************************
          // MOVE 1 TO 800-SUB
          work.setSub800((long)1);
//  PERFORM VARYING 800-IDX FROM 1 BY 1 UNTIL 800-IDX > 9999
          for (work.setIdx800(1); (	( work.getIdx800() <= 9999 ) ) ; work.setIdx800((int) work.getIdx800() + 1) ) {
              idx800 = work.getIdx800();
//  IF 800-IDX = 1
              if (	( idx800 == 1 ) ) { 
//  MOVE ZERO TO GP004760-RECORD-ID
                  gp004760CabTccExtract.setGp004760RecordId(0);
//  MOVE SPACES TO GP004760-AUTH-TXN-CAT-CD ( 800-SUB )
                  gp004760CabTccExtract.getGp004760CabTccArray().setGp004760AuthTxnCatCd(((int) work.getSub800() - 1),CONSTANTS.SPACE);
//  ADD +1 TO 800-SUB
                  work.setSub800(work.getSub800()+(long)1);
              }
  
//  MOVE 800-AUTH-TXN-CAT-CD ( 800-IDX ) TO GP004760-AUTH-TXN-CAT-CD ( 800-SUB )
              gp004760CabTccExtract.getGp004760CabTccArray().setGp004760AuthTxnCatCd(((int) work.getSub800() - 1),cabTccArray800.getAuthTxnCatCd800((int) work.getIdx800() - 1));
              sub800 = work.getSub800();
//  IF 800-SUB = 250
              if (	( sub800 == 250 ) ) { 
//  PERFORM 2900-WRITE-SYS201-FILE
                  writeSys201File();/*2900-WRITE-SYS201-FILE*/
                  if (this.isProgramEnded()) {
                      return ;
                  }
              }
  
//  ELSE
              else { 
//  ADD +1 TO 800-SUB
                  work.setSub800(work.getSub800()+(long)1);
              }
          }
      
      }
      /**
      * writeSys201File 
      *   This method is derived from 
  *   COBOL Paragraph - 2900-WRITE-SYS201-FILE COBOL Cyclomatic complexity - 2
      * Input  :  

      * - sys201CabTccExtRec             COBOL Name: SYS201-CAB-TCC-EXT-REC
      * - gp004760RecordId               COBOL Name: GP004760-RECORD-ID
      *
      * Output :  

      * - sub800                         COBOL Name: 800-SUB
      * - sys201FileStatus200            COBOL Name: 200-SYS201-FILE-STATUS
      * - gp004760RecordId               COBOL Name: GP004760-RECORD-ID
      * - abendCode300                   COBOL Name: 300-ABEND-CODE
      * - errorMessage600                COBOL Name: 600-ERROR-MESSAGE
      * - abendPara300                   COBOL Name: 300-ABEND-PARA
      * - rc                             COBOL Name: RETURN-CODE
      * - statusCode600                  COBOL Name: 600-STATUS-CODE
      *
      * @throws CFException
      */
      private void writeSys201File() throws Exception {
      
// ******************************************************************
// ***** 2900-Write-sys201-file.                                *****
// ***** write to the gcms extract file                         *****
// ******************************************************************
//  INITIALIZE 800-SUB
          work.setSub800(0);
//  WRITE SYS201-CAB-TCC-EXT-REC FROM GP004760-CAB-TCC-EXTRACT
          sys201CabTccExt.write(gp004760CabTccExtract.toCharArray()); 
          sys201CabTccExtRec.setString(CONSTANTS.LOW_VALUE_215720150);
          work.setSys201FileStatus200(sys201CabTccExt.getStatusString() );
//  IF 88-200-SYS201-SUCCESS
          if ( work.isSys201Success88200()  ) { 
//  ADD 1 TO GP004760-RECORD-ID
              gp004760CabTccExtract.setGp004760RecordId(gp004760CabTccExtract.getGp004760RecordId()+1);
              // MOVE 1 TO 800-SUB
              work.setSub800((long)1);
          }
//  ELSE
          else { 
//  SET 88-300-FILE-WRITE-ABEND-CODE TO TRUE
              work.setFileWriteAbendCode88300True(); 
              
//  SET 88-600-ABEND-WRITE-SYS201 TO TRUE
              work.setAbendWriteSys20188600True(); 
              
//  SET 88-300-WRITE-SYS201-PARA TO TRUE
              work.setWriteSys201Para88300True(); 
              
//  MOVE 300-ABEND-CODE TO RETURN-CODE
              this.setRc(CFUtil.getInt(work.getAbendCode300()));
//  MOVE 200-SYS201-FILE-STATUS TO 600-STATUS-CODE
              work.setStatusCode600(padLeftZeros(2,work.getSys201FileStatus200(),false));
//  PERFORM 9000-ABEND-PARA
              abendPara();/*9000-ABEND-PARA*/
              if (this.isProgramEnded()) {
                  return ;
              }
          }
      
      }
      /**
      * writeSys202File 
      *   This method is derived from 
  *   COBOL Paragraph - 2901-WRITE-SYS202-FILE COBOL Cyclomatic complexity - 2
      * Input  :  

      * - sys202NspkCabTccExtRec         COBOL Name: SYS202-NSPK-CAB-TCC-EXT-REC
      *
      * Output :  

      * - sys202FileStatus200            COBOL Name: 200-SYS202-FILE-STATUS
      * - abendCode300                   COBOL Name: 300-ABEND-CODE
      * - errorMessage600                COBOL Name: 600-ERROR-MESSAGE
      * - abendPara300                   COBOL Name: 300-ABEND-PARA
      * - rc                             COBOL Name: RETURN-CODE
      * - statusCode600                  COBOL Name: 600-STATUS-CODE
      *
      * @throws CFException
      */
      private void writeSys202File() throws Exception {
      
// ********* C76142 changes start
// ******************************************************************
// ***** 2901-write-sys202-file.                                *****
// ***** write to the nspk extract file                         *****
// ******************************************************************
//  WRITE SYS202-NSPK-CAB-TCC-EXT-REC FROM 800-NSPK-EXTRACT-REC
          sys202NspkCabTccExt.write(nspkExtractRec800.toCharArray()); 
          sys202NspkCabTccExtRec.setString(CONSTANTS.LOW_VALUE_1253885834);
          work.setSys202FileStatus200(sys202NspkCabTccExt.getStatusString() );
//  IF 88-200-SYS202-SUCCESS
//  ELSE
          if (!(work.isSys202Success88200()) ) { 
//  SET 88-300-FILE-WRITE-ABEND-CODE TO TRUE
              work.setFileWriteAbendCode88300True(); 
              
//  SET 88-600-ABEND-WRITE-SYS202 TO TRUE
              work.setAbendWriteSys20288600True(); 
              
//  SET 88-300-WRITE-SYS202-PARA TO TRUE
              work.setWriteSys202Para88300True(); 
              
//  MOVE 300-ABEND-CODE TO RETURN-CODE
              this.setRc(CFUtil.getInt(work.getAbendCode300()));
//  MOVE 200-SYS202-FILE-STATUS TO 600-STATUS-CODE
              work.setStatusCode600(padLeftZeros(2,work.getSys202FileStatus200(),false));
//  PERFORM 9000-ABEND-PARA
              abendPara();/*9000-ABEND-PARA*/
              if (this.isProgramEnded()) {
                  return ;
              }
          }
      
      }
      /**
      * cabtccextCsrClose 
      *   This method is derived from 
  *   COBOL Paragraph - 2300-CABTCCEXT-CSR-CLOSE COBOL Cyclomatic complexity - 4
      * Input  :  

      * - sqlcode                        COBOL Name: SQLCODE
      *
      * Output :  

      * - wsSqlcodeDisp800               COBOL Name: 800-WS-SQLCODE-DISP
      * - sqlcode                        COBOL Name: SQLCODE
      * - wsCurrParagraph800             COBOL Name: 800-WS-CURR-PARAGRAPH
      * - wsSqlFunction800               COBOL Name: 800-WS-SQL-FUNCTION
      * - wsCurrTable800                 COBOL Name: 800-WS-CURR-TABLE
      *
      * @throws CFException
      */
      private void cabtccextCsrClose() throws Exception {
      
// ******************************************************************
// * 2300-Cabtccext-csr-close.
// * close the cursor.                                          *
// ******************************************************************
//  CLOSE CABTCCEXT_CSR
          gp004760Repository.closeCabtccextCsrGp004760(sqlca);

// ***Mps 8.2 changes task#210 start***
//  EVALUATE SQLCODE
          switch(sqlca.getSqlcode()){
          	case 0:
          break;
          default :
              // MOVE SQLCODE TO 800-WS-SQLCODE-DISP
              //  FORMAT1016704244 = "-999"
              work.setWsSqlcodeDisp800(CFUtil.cobolNumberFormatter(CONSTANTS.FORMAT1016704244,String.valueOf(sqlca.getSqlcode()).toCharArray()));
              // MOVE '2300-CABTCCEXT-CSR-CLOSE' TO 800-WS-CURR-PARAGRAPH
              work.setWsCurrParagraph800(CONSTANTS.LITERAL_2300_MN3_CABTCCEXTCSRCLOSE_B6_);
              // MOVE 'CLOSE CURSOR' TO 800-WS-SQL-FUNCTION
              work.setWsSqlFunction800(CONSTANTS.LITERAL_CLOSE_B14_CURSOR);
              // MOVE 'TGPAITB' TO 800-WS-CURR-TABLE
              work.setWsCurrTable800(CONSTANTS.LITERAL_TGPAITB_B18_);
//  PERFORM 9300-DB2-ERROR-HANDLING
              db2ErrorHandling();/*9300-DB2-ERROR-HANDLING*/
              if (this.isProgramEnded()) {
                  return ;
              }
          }
      
      }
      /**
      * finalize3000 
      *   This method is derived from 
  *   COBOL Paragraph - 3000-FINALIZE COBOL Cyclomatic complexity - 1
      * Input  : None 

      * Output : None 

      * @throws CFException
      */
      private void finalize3000() throws Exception {
      
// ******************************************************************
// * 3000-Finalize.
// * finalization - close files.                                    *
// ******************************************************************
//  PERFORM 2950-CLOSE-SYS201-FILE
          closeSys201File();/*2950-CLOSE-SYS201-FILE*/
          if (this.isProgramEnded()) {
              return ;
          }
//  PERFORM 2951-CLOSE-SYS202-FILE
          closeSys202File();/*2951-CLOSE-SYS202-FILE*/
          if (this.isProgramEnded()) {
              return ;
          }
          ;
      
      }
      /**
      * closeSys201File 
      *   This method is derived from 
  *   COBOL Paragraph - 2950-CLOSE-SYS201-FILE COBOL Cyclomatic complexity - 2
      * Input  :  

      * - sys201FileStatus200            COBOL Name: 200-SYS201-FILE-STATUS
      *
      * Output :  

      * - abendCode300                   COBOL Name: 300-ABEND-CODE
      * - errorMessage600                COBOL Name: 600-ERROR-MESSAGE
      * - abendPara300                   COBOL Name: 300-ABEND-PARA
      * - statusCode600                  COBOL Name: 600-STATUS-CODE
      * - sys201FileStatus200            COBOL Name: 200-SYS201-FILE-STATUS
      *
      * @throws CFException
      */
      private void closeSys201File() throws Exception {
      
// ******************************************************************
// * 2950-Close-sys201-file.
// * finalization - close files.                                    *
// ******************************************************************
//  CLOSE SYS201-CAB-TCC-EXT
          sys201CabTccExt.close(); 
          work.setSys201FileStatus200(sys201CabTccExt.getStatusString() );
//  IF 88-200-SYS201-SUCCESS
//  ELSE
          if (!(work.isSys201Success88200()) ) { 
//  SET 88-300-FILE-CLOSE-ABEND-CODE 88-600-ABEND-CLOSE-SYS201 88-300-CLOSE-SYS201-PARA TO TRUE
              work.setFileCloseAbendCode88300True(); 
              
              work.setAbendCloseSys20188600True(); 
              
              work.setCloseSys201Para88300True(); 
              
//  MOVE 200-SYS201-FILE-STATUS TO 600-STATUS-CODE
              work.setStatusCode600(padLeftZeros(2,work.getSys201FileStatus200(),false));
//  PERFORM 9000-ABEND-PARA
              abendPara();/*9000-ABEND-PARA*/
              if (this.isProgramEnded()) {
                  return ;
              }
          }
      
      }
      /**
      * closeSys202File 
      *   This method is derived from 
  *   COBOL Paragraph - 2951-CLOSE-SYS202-FILE COBOL Cyclomatic complexity - 2
      * Input  :  

      * - sys202FileStatus200            COBOL Name: 200-SYS202-FILE-STATUS
      *
      * Output :  

      * - abendCode300                   COBOL Name: 300-ABEND-CODE
      * - errorMessage600                COBOL Name: 600-ERROR-MESSAGE
      * - abendPara300                   COBOL Name: 300-ABEND-PARA
      * - statusCode600                  COBOL Name: 600-STATUS-CODE
      * - sys202FileStatus200            COBOL Name: 200-SYS202-FILE-STATUS
      *
      * @throws CFException
      */
      private void closeSys202File() throws Exception {
      
// ********* C76142 changes start
// ******************************************************************
// * 2951-close-sys202-file.
// * finalization - close files.                                    *
// ******************************************************************
//  CLOSE SYS202-NSPK-CAB-TCC-EXT
          sys202NspkCabTccExt.close(); 
          work.setSys202FileStatus200(sys202NspkCabTccExt.getStatusString() );
//  IF 88-200-SYS202-SUCCESS
//  ELSE
          if (!(work.isSys202Success88200()) ) { 
//  SET 88-300-FILE-CLOSE-ABEND-CODE 88-600-ABEND-CLOSE-SYS202 88-300-CLOSE-SYS202-PARA TO TRUE
              work.setFileCloseAbendCode88300True(); 
              
              work.setAbendCloseSys20288600True(); 
              
              work.setCloseSys202Para88300True(); 
              
//  MOVE 200-SYS202-FILE-STATUS TO 600-STATUS-CODE
              work.setStatusCode600(padLeftZeros(2,work.getSys202FileStatus200(),false));
//  PERFORM 9000-ABEND-PARA
              abendPara();/*9000-ABEND-PARA*/
              if (this.isProgramEnded()) {
                  return ;
              }
          }
      
      }
      /**
      * db2ErrorHandling 
      *   This method is derived from 
  *   COBOL Paragraph - 9300-DB2-ERROR-HANDLING COBOL Cyclomatic complexity - 2
      * Input  :  

      * - db2ErrModuleMsg600             COBOL Name: 600-DB2-ERR-MODULE-MSG
      * - wsSqlcodeDisp800               COBOL Name: 800-WS-SQLCODE-DISP
      * - wsCurrParagraph800             COBOL Name: 800-WS-CURR-PARAGRAPH
      * - wsSqlFunction800               COBOL Name: 800-WS-SQL-FUNCTION
      * - wsCurrTable800                 COBOL Name: 800-WS-CURR-TABLE
      *
      * Output :  

      * - rc                             COBOL Name: RETURN-CODE
      * - db2ErrRtnCode600               COBOL Name: 600-DB2-ERR-RTN-CODE
      *
      * @throws CFException
      */
      private void db2ErrorHandling() throws Exception {
      
// **************************************************************
// *  Call the db2 error handling batch routine to format and   *
// *  display error messages.                                   *
// *  then display messages indicating where in the program the *
// *  sql error was encountered.                                *
// *  note: for stored procedures these messages are displayed  *
// *  in the  address space job where the stored procedures is  *
// *  defined to run.                                           *
// **************************************************************
//  CALL 300-DB2-ERR-MODULE USING SQLCA 300-THIS-PROGRAM-NAME
          // CALL 300-DB2-ERR-MODULE USING SQLCA 300-THIS-PROGRAM-NAME
               this.setRc( db200020.call(sqlca,thisProgramNameGroup300));
//  IF RETURN-CODE = +0
//  ELSE
          if (	( getRc() != 0 )) { 
//  MOVE RETURN-CODE TO 600-DB2-ERR-RTN-CODE
              db2ErrModuleMsg600.setDb2ErrRtnCode600(String.valueOf(CFUtil.pad(4,String.valueOf(getRc()),"0",CFUtil.LEFT_PAD)).toCharArray());
//  DISPLAY ' '
              logger.info(" "); 
//  DISPLAY 600-DB2-ERR-MODULE-MSG
              logger.info(db2ErrModuleMsg600.toString()); 
          }
//  DISPLAY 'GP004760 : ERROR MESSAGES :'
          logger.info("GP004760 : ERROR MESSAGES :"); 
//  DISPLAY 'SQLCODE = ' 800-WS-SQLCODE-DISP
          logger.info("SQLCODE = {}", new String(work.getWsSqlcodeDisp800())); 
//  DISPLAY SPACE
          logger.info(" "); 
//  DISPLAY '******************************************'
          logger.info("******************************************"); 
//  DISPLAY '***  PARAGRAPH     = ' 800-WS-CURR-PARAGRAPH
          logger.info("***  PARAGRAPH     = {}", new String(work.getWsCurrParagraph800())); 
//  DISPLAY '***  SQL FUNCTION  = ' 800-WS-SQL-FUNCTION
          logger.info("***  SQL FUNCTION  = {}", new String(work.getWsSqlFunction800())); 
//  DISPLAY '***  TABLE         = ' 800-WS-CURR-TABLE
          logger.info("***  TABLE         = {}", new String(work.getWsCurrTable800())); 
//  DISPLAY '******************************************'
          logger.info("******************************************"); 
          // MOVE 3007 TO RETURN-CODE
          this.setRc( 3007);
//  PERFORM 9900-TERMINATION
          termination();/*9900-TERMINATION*/
          if (this.isProgramEnded()) {
              return ;
          }
          ;
      
      }
      /**
      * abendPara 
      *   This method is derived from 
  *   COBOL Paragraph - 9000-ABEND-PARA COBOL Cyclomatic complexity - 4
      * Input  :  

      * - abendCode300                   COBOL Name: 300-ABEND-CODE
      * - statusCode300                  COBOL Name: 300-STATUS-CODE
      * - statusCode600                  COBOL Name: 600-STATUS-CODE
      * - abendPara300                   COBOL Name: 300-ABEND-PARA
      * - displayAbendMsgTxt600          COBOL Name: 600-DISPLAY-ABEND-MSG-TXT
      *
      * Output : None 

      * @throws CFException
      */
      private void abendPara() throws Exception {
      
// ******************************************************************
// * Abend routine-in case of file open/write/close failure         *
// ******************************************************************
//  EVALUATE TRUE
          if  ( work.isFileOpenAbendCode88300()  ) { 

// *            Display 800-pgm-header 600-error-message
//  DISPLAY 300-STATUS-CODE 600-STATUS-CODE
              logger.info("{}{}", new String(work.getStatusCode300()), String.valueOf(work.getStatusCode600())); 
//  DISPLAY 'ABEND CODE       : ' 300-ABEND-CODE
              logger.info("ABEND CODE       : {}", new String(work.getAbendCode300())); 
//  DISPLAY 'ABEND PARAGRAPHS : ' 300-ABEND-PARA
              logger.info("ABEND PARAGRAPHS : {}", new String(work.getAbendPara300())); 
//  DISPLAY 600-DISPLAY-ABEND-MSG-TXT
              logger.info(new String(work.getDisplayAbendMsgTxt600())); 
          }
          else if  ( work.isFileWriteAbendCode88300()  ) { 

// *            Display 800-pgm-header 600-error-message
//  DISPLAY 300-STATUS-CODE 600-STATUS-CODE
              logger.info("{}{}", new String(work.getStatusCode300()), String.valueOf(work.getStatusCode600())); 
//  DISPLAY 'ABEND CODE       : ' 300-ABEND-CODE
              logger.info("ABEND CODE       : {}", new String(work.getAbendCode300())); 
//  DISPLAY 'ABEND PARAGRAPHS : ' 300-ABEND-PARA
              logger.info("ABEND PARAGRAPHS : {}", new String(work.getAbendPara300())); 
//  DISPLAY 600-DISPLAY-ABEND-MSG-TXT
              logger.info(new String(work.getDisplayAbendMsgTxt600())); 
          }
          else if  ( work.isFileCloseAbendCode88300()  ) { 

// *            Display 800-pgm-header 600-error-message
//  DISPLAY 300-STATUS-CODE 600-STATUS-CODE
              logger.info("{}{}", new String(work.getStatusCode300()), String.valueOf(work.getStatusCode600())); 
//  DISPLAY 'ABEND CODE       : ' 300-ABEND-CODE
              logger.info("ABEND CODE       : {}", new String(work.getAbendCode300())); 
//  DISPLAY 'ABEND PARAGRAPHS : ' 300-ABEND-PARA
              logger.info("ABEND PARAGRAPHS : {}", new String(work.getAbendPara300())); 
//  DISPLAY 600-DISPLAY-ABEND-MSG-TXT
              logger.info(new String(work.getDisplayAbendMsgTxt600())); 
          }

// *       When other
// *            display 800-pgm-header
// *            display 800-all-astericks
// *            display 800-all-astericks
//  PERFORM 9900-TERMINATION
          termination();/*9900-TERMINATION*/
          if (this.isProgramEnded()) {
              return ;
          }
          ;
      
      }
      /**
      * termination 
      *   This method is derived from 
  *   COBOL Paragraph - 9900-TERMINATION COBOL Cyclomatic complexity - 2
      * Input  :  

      * - outputCntMsg600                COBOL Name: 600-OUTPUT-CNT-MSG
      * - outfileCnt                     COBOL Name: WS-OUTFILE-CNT
      *
      * Output : None 

      * @throws CFException
      */
      private void termination() throws Exception {
      
// **************************************************************
// *  This is the termination para and it goes back to its      *
// *  call program.                                             *
// **************************************************************
//  DISPLAY SPACE
          logger.info(" "); 
//  DISPLAY SPACE
          logger.info(" "); 
//  DISPLAY '************ RECORD COUNTS **********************'
          logger.info("************ RECORD COUNTS **********************"); 
//  DISPLAY 600-OUTPUT-CNT-MSG WS-OUTFILE-CNT
          logger.info("{}{}", new String(work.getOutputCntMsg600()), String.valueOf(work.getOutfileCnt())); 
//  DISPLAY '*************************************************'
          logger.info("*************************************************"); 
//  DISPLAY SPACE
          logger.info(" "); 
//  DISPLAY SPACE
          logger.info(" "); 
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
          db2Base.reset("GP004760" ,dbQualifier, true/*use Dynamic SQL*/);
          if(!isInitDone()) {
          	this.setRc(0);
          	setInitDone(true);
          }
        CFUtil.resetDecimalAsComma();
       }
  
      public void setFromDb200020(Object[] params) {
      int len = params.length;
         if (len > 0)
         if(params[0] instanceof Field) 
   sqlca.setString(((Field)params[0] ).toCharArray());
 else    sqlca.setString((char[])params[0] );
         if (len > 1)
         if(params[1] instanceof Field) 
   thisProgramNameGroup300.setString(((Field)params[1] ).toCharArray());
 else    thisProgramNameGroup300.setString((char[])params[1] );
      }
  
  
  
  
  
  }
