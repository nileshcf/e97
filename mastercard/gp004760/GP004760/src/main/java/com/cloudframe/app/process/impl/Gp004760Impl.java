  package com.cloudframe.app.process.impl;
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
  import com.cloudframe.app.gp004760.Gp004760Ctx.*;
  import com.cloudframe.app.gp004760.Gp004760Ctx;
  import com.cloudframe.app.process.Gp004760;
  import com.cloudframe.app.process.BaseProcess;
  import org.springframework.web.bind.annotation.GetMapping;
  import org.slf4j.Logger;
  import org.slf4j.LoggerFactory;
  import com.cloudframe.app.exception.CFException;
  import org.springframework.stereotype.Component;
  import org.springframework.web.bind.annotation.RestController;
  import com.cloudframe.app.dto.GlobalExecutorCtx;
  import com.cloudframe.app.utility.CFUtil;
  import com.cloudframe.app.repository.Gp004760Repository;
  import com.cloudframe.app.data.Field;
  import com.cloudframe.app.process.Db200020;
  import com.cloudframe.app.process.*;
  import com.cloudframe.app.exception.Terminate;
  import com.cloudframe.app.gp004760.dto.*;
  import com.cloudframe.app.gp004760.dto.NspkExtractRec800;
  import com.cloudframe.app.gp004760.dto.Gp004760CabTccExtract;
  import com.cloudframe.app.gp004760.dto.Sqlca;
  import com.cloudframe.app.gp004760.dto.ThisProgramNameGroup300;
  import com.cloudframe.app.gp004760.file.records.Sys201CabTccExtRec;
  import com.cloudframe.app.gp004760.file.records.Sys202NspkCabTccExtRec;
  import com.cloudframe.app.gp004760.dto.CabTccArray800;
  import com.cloudframe.app.gp004760.dto.Db2ErrModuleMsg600;
  import com.cloudframe.app.gp004760.dto.Tgpaitb;
  import com.cloudframe.app.global.sharedvar.Db85102dWorkFields;
  import com.cloudframe.app.gp004760.dto.Work;
  import com.cloudframe.app.common.CONSTANTS;
  import com.cloudframe.app.common.SQLS;
  import org.springframework.beans.factory.annotation.Value;
  import com.cloudframe.app.dao.Db2Base;
  import java.sql.SQLException;
  
  @Component("gp004760")
  
  public class Gp004760Impl extends CommonProcess implements Gp004760 {
  
  Logger logger = LoggerFactory.getLogger(Gp004760Impl.class);
  
  
  @Value("${GP004760.dbQualifier:}")
  private String dbQualifier;
  
  
  @Autowired 
  @Qualifier("gp004760_sys201CabTccExt")
  Sys201CabTccExt sys201CabTccExt;
  @Autowired 
  @Qualifier("gp004760_sys202NspkCabTccExt")
  Sys202NspkCabTccExt sys202NspkCabTccExt;
  @Autowired 
  @Qualifier("db2Base")
  Db2Base db2Base;
  @Autowired 
  @Qualifier("gp004760Repository")
  Gp004760Repository gp004760Repository;
  @Autowired 
  @Qualifier("db200020")
  Db200020 db200020;
  
  
  
  
  
  
      /**
      * process 
      * Input  : None 

      * Output : None 

      * @throws CFException
      */
      public int process(Gp004760Ctx programCtx) throws Exception {
       try {
       setCodePage("1047");
            // Reset program ended flag
           programCtx.setProgramEnded(false);
      	db2Base.reset("GP004760" ,dbQualifier, true/*use Dynamic SQL*/);
          ;
//  PERFORM 0000-MAINLINE-PROCESS
          mainlineProcess(programCtx);/*0000-MAINLINE-PROCESS*/
          if (programCtx.isProgramEnded()) {
              return programCtx.getRc();
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
      
       return programCtx.getRc(); // Exit with return code
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
      @Override
      public void mainlineProcess(Gp004760Ctx programCtx) throws Exception {
//  PERFORM 1000-INITIALIZATION THRU 1000-EXIT
          initialization(programCtx);/*1000-INITIALIZATION*/
          if (programCtx.isProgramEnded()) {
              return ;
          }
//  PERFORM 2000-PROCESS-CABTCCEXT THRU 2000-EXIT
          processCabtccext(programCtx.getProcessCabtccextInCtx());/*2000-PROCESS-CABTCCEXT*/
          if (programCtx.isProgramEnded()) {
              return ;
          }
//  PERFORM 3000-FINALIZE THRU 3000-EXIT
          finalize3000(programCtx);/*3000-FINALIZE*/
          if (programCtx.isProgramEnded()) {
              return ;
          }
//  PERFORM 9900-TERMINATION
          termination(programCtx.getTerminationInCtx());/*9900-TERMINATION*/
          if (programCtx.isProgramEnded()) {
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
      @Override
      public InitializationOutCtx initialization(Gp004760Ctx programCtx) throws Exception {
      
// ******************************************************************
// * This paragraph does the necessary initialization.              *
// ******************************************************************
InitializationOutCtx methodOut = programCtx.getInitializationOutCtx();
//  MOVE SPACES TO 800-CAB-TCC-ARRAY
          methodOut.getCabTccArray800().setString(CONSTANTS.SPACE_9999);
//  PERFORM 1100-OPEN-SYS201-FILE
          openSys201File(programCtx.getOpenSys201FileInCtx());/*1100-OPEN-SYS201-FILE*/
          if (programCtx.isProgramEnded()) {
              return methodOut;
          }
//  PERFORM 1101-OPEN-SYS202-FILE
          openSys202File(programCtx.getOpenSys202FileInCtx());/*1101-OPEN-SYS202-FILE*/
          if (programCtx.isProgramEnded()) {
              return methodOut;
          }

// ********* C76142 changes start

// ********* C76142 changes end
//  INITIALIZE WS-OUTFILE-CNT , WS-OCR-CNT
          methodOut.setOutfileCnt(0);
          methodOut.setOcrCnt(0);
      
      return methodOut;
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
      @Override
      public OpenSys201FileOutCtx openSys201File(OpenSys201FileInCtx methodIn) throws Exception {
      
// ******************************************************************
// * 1100-Open-sys201-file.                                         *
// *    open mip extract file                                       *
// ******************************************************************
Gp004760Ctx programCtx = methodIn.getGp004760Ctx();
OpenSys201FileOutCtx methodOut = methodIn.getOpenSys201FileOutCtx();
//  OPEN OUTPUT SYS201-CAB-TCC-EXT
          sys201CabTccExt.open(new String(CONSTANTS.MODE_WRITE_ONLY_36397),sys201CabTccExt.getFileName(),sys201CabTccExt.getSys201CabTccExtCharSet(),sys201CabTccExt.getSys201CabTccExtCrlfFlag());
          methodOut.setSys201FileStatus200(sys201CabTccExt.getStatusString() );
//  IF 88-200-SYS201-SUCCESS
//  ELSE
          if (!(methodOut.isSys201Success88200()) ) { 
//  SET 88-300-FILE-OPEN-ABEND-CODE TO TRUE
              methodOut.setFileOpenAbendCode88300True(); 
              
//  SET 88-600-ABEND-OPEN-SYS201 TO TRUE
              methodOut.setAbendOpenSys20188600True(); 
              
//  SET 88-300-OPEN-SYS201-PARA TO TRUE
              methodOut.setOpenSys201Para88300True(); 
              
//  MOVE 300-ABEND-CODE TO RETURN-CODE
              programCtx.setRc(CFUtil.getInt(methodOut.getAbendCode300()));
//  MOVE 200-SYS201-FILE-STATUS TO 600-STATUS-CODE
              methodOut.setStatusCode600(padLeftZeros(2,methodOut.getSys201FileStatus200(),false));
//  PERFORM 9000-ABEND-PARA
              abendPara(programCtx.getAbendParaInCtx());/*9000-ABEND-PARA*/
              if (programCtx.isProgramEnded()) {
                  return methodOut;
              }
          }
      
      return methodOut;
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
      @Override
      public OpenSys202FileOutCtx openSys202File(OpenSys202FileInCtx methodIn) throws Exception {
      
// ********* C76142 changes start
// ******************************************************************
// * 1101-open-sys202-file.                                         *
// *    open nspk extract file                                      *
// ******************************************************************
Gp004760Ctx programCtx = methodIn.getGp004760Ctx();
OpenSys202FileOutCtx methodOut = methodIn.getOpenSys202FileOutCtx();
//  OPEN OUTPUT SYS202-NSPK-CAB-TCC-EXT
          sys202NspkCabTccExt.open(new String(CONSTANTS.MODE_WRITE_ONLY_36397),sys202NspkCabTccExt.getFileName(),sys202NspkCabTccExt.getSys202NspkCabTccExtCharSet(),sys202NspkCabTccExt.getSys202NspkCabTccExtCrlfFlag());
          methodOut.setSys202FileStatus200(sys202NspkCabTccExt.getStatusString() );
//  IF 88-200-SYS202-SUCCESS
//  ELSE
          if (!(methodOut.isSys202Success88200()) ) { 
//  SET 88-300-FILE-OPEN-ABEND-CODE TO TRUE
              methodOut.setFileOpenAbendCode88300True(); 
              
//  SET 88-600-ABEND-OPEN-SYS202 TO TRUE
              methodOut.setAbendOpenSys20288600True(); 
              
//  SET 88-300-OPEN-SYS202-PARA TO TRUE
              methodOut.setOpenSys202Para88300True(); 
              
//  MOVE 300-ABEND-CODE TO RETURN-CODE
              programCtx.setRc(CFUtil.getInt(methodOut.getAbendCode300()));
//  MOVE 200-SYS202-FILE-STATUS TO 600-STATUS-CODE
              methodOut.setStatusCode600(padLeftZeros(2,methodOut.getSys202FileStatus200(),false));
//  PERFORM 9000-ABEND-PARA
              abendPara(programCtx.getAbendParaInCtx());/*9000-ABEND-PARA*/
              if (programCtx.isProgramEnded()) {
                  return methodOut;
              }
          }
      
      return methodOut;
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
      @Override
      public void processCabtccext(ProcessCabtccextInCtx methodIn) throws Exception {
      
// ******************************************************************
// ***** 2000-Process-cabtccext                                 *****
// ***** processes all records until sqlcode = 100              *****
// ******************************************************************
Gp004760Ctx programCtx = methodIn.getGp004760Ctx();
//  PERFORM 2100-CABTCCEXT-CSR-OPEN
          cabtccextCsrOpen(programCtx.getCabtccextCsrOpenInCtx());/*2100-CABTCCEXT-CSR-OPEN*/
          if (programCtx.isProgramEnded()) {
              return ;
          }
//  PERFORM 2200-CABTCCEXT-CSR-FETCH UNTIL 100-END-CABTCCEXT-CSR
          while (!(methodIn.isEndCabtccextCsr100()) ) {
             cabtccextCsrFetch(programCtx.getCabtccextCsrFetchInCtx());/*2200-CABTCCEXT-CSR-FETCH*/
             if (programCtx.isProgramEnded()) {
                 return ;
             }
          }
//  PERFORM 2300-CABTCCEXT-CSR-CLOSE
          cabtccextCsrClose(programCtx.getCabtccextCsrCloseInCtx());/*2300-CABTCCEXT-CSR-CLOSE*/
          if (programCtx.isProgramEnded()) {
              return ;
          }
//  PERFORM 2500-CABEXT-OUTFILE-PROCESS THRU 2500-EXIT
          cabextOutfileProcess(programCtx.getCabextOutfileProcessInCtx());/*2500-CABEXT-OUTFILE-PROCESS*/
          if (programCtx.isProgramEnded()) {
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
      @Override
      public CabtccextCsrOpenOutCtx cabtccextCsrOpen(CabtccextCsrOpenInCtx methodIn) throws Exception {
      
// ******************************************************************
// ***** 2100-Cabtccext-csr-open.                               *****
// ***** open the cursor                                        *****
// ******************************************************************
Gp004760Ctx programCtx = methodIn.getGp004760Ctx();
CabtccextCsrOpenOutCtx methodOut = methodIn.getCabtccextCsrOpenOutCtx();
//  SET 100-START-CABTCCEXT-CSR TO TRUE
          methodOut.setStartCabtccextCsr100True(); 
          
//  SELECT A.CAB_CD , A.AUTH_TXN_CAT_CD FROM TGPAITB A WHERE A.REC_STAT_CD = 'A' AND A.EFF_TS = ( SELECT MAX ( A1.EFF_TS ) FROM TGPAITB A1 WHERE A.CAB_CD = A1.CAB_CD AND A1.DEL_SW = 'N' AND A1.EFF_TS <= CURRENT TIMESTAMP - CURRENT TIMEZONE ) ORDER BY CAB_CD
          programCtx.setCabtccextCsrResultSet(gp004760Repository.openCabtccextCsrGp004760(programCtx.getSqlca()));
//  EVALUATE SQLCODE
          switch(methodOut.getSqlcode()){
          	case 0:
          break;
          default :
              // MOVE SQLCODE TO 800-WS-SQLCODE-DISP
              //  FORMAT1016704244 = "-999"
              methodOut.setWsSqlcodeDisp800(CFUtil.cobolNumberFormatter(CONSTANTS.FORMAT1016704244,String.valueOf(methodOut.getSqlcode()).toCharArray()));
              // MOVE '2100-CABTCCEXT-CSR-OPEN' TO 800-WS-CURR-PARAGRAPH
              methodOut.setWsCurrParagraph800(CONSTANTS.LITERAL_2100_MN3_CABTCCEXTCSROPEN_B7_);
              // MOVE 'OPEN CURSOR' TO 800-WS-SQL-FUNCTION
              methodOut.setWsSqlFunction800(CONSTANTS.LITERAL_OPEN_B15_CURSOR);
              // MOVE 'TGPAITB' TO 800-WS-CURR-TABLE
              methodOut.setWsCurrTable800(CONSTANTS.LITERAL_TGPAITB_B18_);
//  PERFORM 9300-DB2-ERROR-HANDLING
              db2ErrorHandling(programCtx.getDb2ErrorHandlingInCtx());/*9300-DB2-ERROR-HANDLING*/
              if (programCtx.isProgramEnded()) {
                  return methodOut;
              }
          }
      
      return methodOut;
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
      @Override
      public CabtccextCsrFetchOutCtx cabtccextCsrFetch(CabtccextCsrFetchInCtx methodIn) throws Exception {
      
// ******************************************************************
// ***** 2200-Cabtccext-csr-fetch                               *****
// ***** cursor fetch                                           *****
// ******************************************************************
Gp004760Ctx programCtx = methodIn.getGp004760Ctx();
CabtccextCsrFetchOutCtx methodOut = methodIn.getCabtccextCsrFetchOutCtx();
//  FETCH CABTCCEXT_CSR INTO ? , ?
          gp004760Repository.fetchCabtccextCsrGp004760(programCtx.getCabtccextCsrResultSet(),methodOut.getTgpaitb(),programCtx.getSqlca());
//  EVALUATE SQLCODE
          if  (	( methodOut.getSqlcode() == 0 )) { 
//  MOVE TGPAITB-CAB-CD TO 800-IDX
              methodOut.setIdx800( methodOut.getTgpaitbCabCd());
//  MOVE TGPAITB-AUTH-TXN-CAT-CD TO 800-AUTH-TXN-CAT-CD ( 800-IDX )
              methodOut.setAuthTxnCatCd800((int) methodOut.getIdx800() - 1,methodOut.getTgpaitbAuthTxnCatCd());

// ********* C76142 changes start
//  MOVE TGPAITB-CAB-CD TO 800-NSPK-CAB-CD
              methodOut.setNspkCabCd800(methodOut.getTgpaitbCabCd());
//  MOVE TGPAITB-AUTH-TXN-CAT-CD TO 800-NSPK-TCC
              methodOut.setNspkTcc800(methodOut.getTgpaitbAuthTxnCatCd());
//  PERFORM 2901-WRITE-SYS202-FILE
              writeSys202File(programCtx.getWriteSys202FileInCtx());/*2901-WRITE-SYS202-FILE*/
              if (programCtx.isProgramEnded()) {
                  return methodOut;
              }
          }
          else if  (	( methodOut.getSqlcode() == methodIn.getPlusOneHundred300() ) ) { 
//  SET 100-END-CABTCCEXT-CSR TO TRUE
              methodOut.setEndCabtccextCsr100True(); 
              
          }
          else   { 
              // MOVE SQLCODE TO 800-WS-SQLCODE-DISP
              //  FORMAT1016704244 = "-999"
              methodOut.setWsSqlcodeDisp800(CFUtil.cobolNumberFormatter(CONSTANTS.FORMAT1016704244,String.valueOf(methodOut.getSqlcode()).toCharArray()));
              // MOVE ' 2200-CABTCCEXT-CSR-FETCH' TO 800-WS-CURR-PARAGRAPH
              methodOut.setWsCurrParagraph800(CONSTANTS.LITERAL_B6_2200_MN3_CABTCCEXTCSRFETCH);
              // MOVE 'FETCH CURSOR' TO 800-WS-SQL-FUNCTION
              methodOut.setWsSqlFunction800(CONSTANTS.LITERAL_FETCH_B14_CURSOR);
              // MOVE 'TGPAITB' TO 800-WS-CURR-TABLE
              methodOut.setWsCurrTable800(CONSTANTS.LITERAL_TGPAITB_B18_);
//  PERFORM 9300-DB2-ERROR-HANDLING
              db2ErrorHandling(programCtx.getDb2ErrorHandlingInCtx());/*9300-DB2-ERROR-HANDLING*/
              if (programCtx.isProgramEnded()) {
                  return methodOut;
              }
          }
      
      return methodOut;
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
      @Override
      public CabextOutfileProcessOutCtx cabextOutfileProcess(CabextOutfileProcessInCtx methodIn) throws Exception {
      
// ******************************************************************
// ***** 2500-Cabext-outfile-process.                           *****
// ***** populate the values to the output records.             *****
// ***** write to the cab  ext output file.                     *****
// ******************************************************************
Gp004760Ctx programCtx = methodIn.getGp004760Ctx();
CabextOutfileProcessOutCtx methodOut = methodIn.getCabextOutfileProcessOutCtx();
          // MOVE 1 TO 800-SUB
          methodOut.setSub800((long)1);
//  PERFORM VARYING 800-IDX FROM 1 BY 1 UNTIL 800-IDX > 9999
          for (methodOut.setIdx800(1); (	( methodOut.getIdx800() <= 9999 ) ) ; methodOut.setIdx800((int) methodOut.getIdx800() + 1) ) {
//  IF 800-IDX = 1
              if (	( methodOut.getIdx800() == 1 ) ) { 
//  MOVE ZERO TO GP004760-RECORD-ID
                  methodOut.setGp004760RecordId(0);
//  MOVE SPACES TO GP004760-AUTH-TXN-CAT-CD ( 800-SUB )
                  methodOut.setGp004760AuthTxnCatCd((int) methodOut.getSub800() - 1,CONSTANTS.SPACE);
//  ADD +1 TO 800-SUB
                  methodOut.setSub800(methodOut.getSub800()+(long)1);
              }
//  MOVE 800-AUTH-TXN-CAT-CD ( 800-IDX ) TO GP004760-AUTH-TXN-CAT-CD ( 800-SUB )
              methodOut.setGp004760AuthTxnCatCd((int) methodOut.getSub800() - 1,methodOut.getAuthTxnCatCd800((int) methodOut.getIdx800() - 1));
//  IF 800-SUB = 250
              if (	( methodOut.getSub800() == 250 ) ) { 
//  PERFORM 2900-WRITE-SYS201-FILE
                  writeSys201File(programCtx.getWriteSys201FileInCtx());/*2900-WRITE-SYS201-FILE*/
                  if (programCtx.isProgramEnded()) {
                      return methodOut;
                  }
              }
//  ELSE
              else { 
//  ADD +1 TO 800-SUB
                  methodOut.setSub800(methodOut.getSub800()+(long)1);
              }
          }
      
      return methodOut;
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
      @Override
      public WriteSys201FileOutCtx writeSys201File(WriteSys201FileInCtx methodIn) throws Exception {
      
// ******************************************************************
// ***** 2900-Write-sys201-file.                                *****
// ***** write to the gcms extract file                         *****
// ******************************************************************
Gp004760Ctx programCtx = methodIn.getGp004760Ctx();
WriteSys201FileOutCtx methodOut = methodIn.getWriteSys201FileOutCtx();
//  INITIALIZE 800-SUB
          methodOut.setSub800(0);
//  WRITE SYS201-CAB-TCC-EXT-REC FROM GP004760-CAB-TCC-EXTRACT
          sys201CabTccExt.write(methodIn.getGp004760CabTccExtract().toCharArray()); 
          methodOut.getSys201CabTccExtRec().setString(CONSTANTS.LOW_VALUE_215720150);
          methodOut.setSys201FileStatus200(sys201CabTccExt.getStatusString() );
//  IF 88-200-SYS201-SUCCESS
          if ( methodOut.isSys201Success88200()  ) { 
//  ADD 1 TO GP004760-RECORD-ID
              methodOut.setGp004760RecordId(methodOut.getGp004760RecordId()+1);
              // MOVE 1 TO 800-SUB
              methodOut.setSub800((long)1);
          }
//  ELSE
          else { 
//  SET 88-300-FILE-WRITE-ABEND-CODE TO TRUE
              methodOut.setFileWriteAbendCode88300True(); 
              
//  SET 88-600-ABEND-WRITE-SYS201 TO TRUE
              methodOut.setAbendWriteSys20188600True(); 
              
//  SET 88-300-WRITE-SYS201-PARA TO TRUE
              methodOut.setWriteSys201Para88300True(); 
              
//  MOVE 300-ABEND-CODE TO RETURN-CODE
              programCtx.setRc(CFUtil.getInt(methodOut.getAbendCode300()));
//  MOVE 200-SYS201-FILE-STATUS TO 600-STATUS-CODE
              methodOut.setStatusCode600(padLeftZeros(2,methodOut.getSys201FileStatus200(),false));
//  PERFORM 9000-ABEND-PARA
              abendPara(programCtx.getAbendParaInCtx());/*9000-ABEND-PARA*/
              if (programCtx.isProgramEnded()) {
                  return methodOut;
              }
          }
      
      return methodOut;
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
      @Override
      public WriteSys202FileOutCtx writeSys202File(WriteSys202FileInCtx methodIn) throws Exception {
      
// ********* C76142 changes start
// ******************************************************************
// ***** 2901-write-sys202-file.                                *****
// ***** write to the nspk extract file                         *****
// ******************************************************************
Gp004760Ctx programCtx = methodIn.getGp004760Ctx();
WriteSys202FileOutCtx methodOut = methodIn.getWriteSys202FileOutCtx();
//  WRITE SYS202-NSPK-CAB-TCC-EXT-REC FROM 800-NSPK-EXTRACT-REC
          sys202NspkCabTccExt.write(methodIn.getNspkExtractRec800().toCharArray()); 
          methodOut.getSys202NspkCabTccExtRec().setString(CONSTANTS.LOW_VALUE_1253885834);
          methodOut.setSys202FileStatus200(sys202NspkCabTccExt.getStatusString() );
//  IF 88-200-SYS202-SUCCESS
//  ELSE
          if (!(methodOut.isSys202Success88200()) ) { 
//  SET 88-300-FILE-WRITE-ABEND-CODE TO TRUE
              methodOut.setFileWriteAbendCode88300True(); 
              
//  SET 88-600-ABEND-WRITE-SYS202 TO TRUE
              methodOut.setAbendWriteSys20288600True(); 
              
//  SET 88-300-WRITE-SYS202-PARA TO TRUE
              methodOut.setWriteSys202Para88300True(); 
              
//  MOVE 300-ABEND-CODE TO RETURN-CODE
              programCtx.setRc(CFUtil.getInt(methodOut.getAbendCode300()));
//  MOVE 200-SYS202-FILE-STATUS TO 600-STATUS-CODE
              methodOut.setStatusCode600(padLeftZeros(2,methodOut.getSys202FileStatus200(),false));
//  PERFORM 9000-ABEND-PARA
              abendPara(programCtx.getAbendParaInCtx());/*9000-ABEND-PARA*/
              if (programCtx.isProgramEnded()) {
                  return methodOut;
              }
          }
      
      return methodOut;
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
      @Override
      public CabtccextCsrCloseOutCtx cabtccextCsrClose(CabtccextCsrCloseInCtx methodIn) throws Exception {
      
// ******************************************************************
// * 2300-Cabtccext-csr-close.
// * close the cursor.                                          *
// ******************************************************************
Gp004760Ctx programCtx = methodIn.getGp004760Ctx();
CabtccextCsrCloseOutCtx methodOut = methodIn.getCabtccextCsrCloseOutCtx();
//  CLOSE CABTCCEXT_CSR
          gp004760Repository.closeCabtccextCsrGp004760(programCtx.getCabtccextCsrResultSet(),programCtx.getSqlca());

// ***Mps 8.2 changes task#210 start***
//  EVALUATE SQLCODE
          switch(methodOut.getSqlcode()){
          	case 0:
          break;
          default :
              // MOVE SQLCODE TO 800-WS-SQLCODE-DISP
              //  FORMAT1016704244 = "-999"
              methodOut.setWsSqlcodeDisp800(CFUtil.cobolNumberFormatter(CONSTANTS.FORMAT1016704244,String.valueOf(methodOut.getSqlcode()).toCharArray()));
              // MOVE '2300-CABTCCEXT-CSR-CLOSE' TO 800-WS-CURR-PARAGRAPH
              methodOut.setWsCurrParagraph800(CONSTANTS.LITERAL_2300_MN3_CABTCCEXTCSRCLOSE_B6_);
              // MOVE 'CLOSE CURSOR' TO 800-WS-SQL-FUNCTION
              methodOut.setWsSqlFunction800(CONSTANTS.LITERAL_CLOSE_B14_CURSOR);
              // MOVE 'TGPAITB' TO 800-WS-CURR-TABLE
              methodOut.setWsCurrTable800(CONSTANTS.LITERAL_TGPAITB_B18_);
//  PERFORM 9300-DB2-ERROR-HANDLING
              db2ErrorHandling(programCtx.getDb2ErrorHandlingInCtx());/*9300-DB2-ERROR-HANDLING*/
              if (programCtx.isProgramEnded()) {
                  return methodOut;
              }
          }
      
      return methodOut;
      }
      /**
      * finalize3000 
      *   This method is derived from 
  *   COBOL Paragraph - 3000-FINALIZE COBOL Cyclomatic complexity - 1
      * Input  : None 

      * Output : None 

      * @throws CFException
      */
      @Override
      public void finalize3000(Gp004760Ctx programCtx) throws Exception {
      
// ******************************************************************
// * 3000-Finalize.
// * finalization - close files.                                    *
// ******************************************************************
//  PERFORM 2950-CLOSE-SYS201-FILE
          closeSys201File(programCtx.getCloseSys201FileInCtx());/*2950-CLOSE-SYS201-FILE*/
          if (programCtx.isProgramEnded()) {
              return ;
          }
//  PERFORM 2951-CLOSE-SYS202-FILE
          closeSys202File(programCtx.getCloseSys202FileInCtx());/*2951-CLOSE-SYS202-FILE*/
          if (programCtx.isProgramEnded()) {
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
      @Override
      public CloseSys201FileOutCtx closeSys201File(CloseSys201FileInCtx methodIn) throws Exception {
      
// ******************************************************************
// * 2950-Close-sys201-file.
// * finalization - close files.                                    *
// ******************************************************************
Gp004760Ctx programCtx = methodIn.getGp004760Ctx();
CloseSys201FileOutCtx methodOut = methodIn.getCloseSys201FileOutCtx();
//  CLOSE SYS201-CAB-TCC-EXT
          sys201CabTccExt.close(); 
          methodOut.setSys201FileStatus200(sys201CabTccExt.getStatusString() );
//  IF 88-200-SYS201-SUCCESS
//  ELSE
          if (!(methodIn.isSys201Success88200()) ) { 
//  SET 88-300-FILE-CLOSE-ABEND-CODE 88-600-ABEND-CLOSE-SYS201 88-300-CLOSE-SYS201-PARA TO TRUE
              methodOut.setFileCloseAbendCode88300True(); 
              
              methodOut.setAbendCloseSys20188600True(); 
              
              methodOut.setCloseSys201Para88300True(); 
              
//  MOVE 200-SYS201-FILE-STATUS TO 600-STATUS-CODE
              methodOut.setStatusCode600(padLeftZeros(2,methodOut.getSys201FileStatus200(),false));
//  PERFORM 9000-ABEND-PARA
              abendPara(programCtx.getAbendParaInCtx());/*9000-ABEND-PARA*/
              if (programCtx.isProgramEnded()) {
                  return methodOut;
              }
          }
      
      return methodOut;
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
      @Override
      public CloseSys202FileOutCtx closeSys202File(CloseSys202FileInCtx methodIn) throws Exception {
      
// ********* C76142 changes start
// ******************************************************************
// * 2951-close-sys202-file.
// * finalization - close files.                                    *
// ******************************************************************
Gp004760Ctx programCtx = methodIn.getGp004760Ctx();
CloseSys202FileOutCtx methodOut = methodIn.getCloseSys202FileOutCtx();
//  CLOSE SYS202-NSPK-CAB-TCC-EXT
          sys202NspkCabTccExt.close(); 
          methodOut.setSys202FileStatus200(sys202NspkCabTccExt.getStatusString() );
//  IF 88-200-SYS202-SUCCESS
//  ELSE
          if (!(methodIn.isSys202Success88200()) ) { 
//  SET 88-300-FILE-CLOSE-ABEND-CODE 88-600-ABEND-CLOSE-SYS202 88-300-CLOSE-SYS202-PARA TO TRUE
              methodOut.setFileCloseAbendCode88300True(); 
              
              methodOut.setAbendCloseSys20288600True(); 
              
              methodOut.setCloseSys202Para88300True(); 
              
//  MOVE 200-SYS202-FILE-STATUS TO 600-STATUS-CODE
              methodOut.setStatusCode600(padLeftZeros(2,methodOut.getSys202FileStatus200(),false));
//  PERFORM 9000-ABEND-PARA
              abendPara(programCtx.getAbendParaInCtx());/*9000-ABEND-PARA*/
              if (programCtx.isProgramEnded()) {
                  return methodOut;
              }
          }
      
      return methodOut;
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
      @Override
      public Db2ErrorHandlingOutCtx db2ErrorHandling(Db2ErrorHandlingInCtx methodIn) throws Exception {
      
// **************************************************************
// *  Call the db2 error handling batch routine to format and   *
// *  display error messages.                                   *
// *  then display messages indicating where in the program the *
// *  sql error was encountered.                                *
// *  note: for stored procedures these messages are displayed  *
// *  in the  address space job where the stored procedures is  *
// *  defined to run.                                           *
// **************************************************************
Gp004760Ctx programCtx = methodIn.getGp004760Ctx();
Db2ErrorHandlingOutCtx methodOut = methodIn.getDb2ErrorHandlingOutCtx();
//  CALL 300-DB2-ERR-MODULE USING SQLCA 300-THIS-PROGRAM-NAME
          // CALL 300-DB2-ERR-MODULE USING SQLCA 300-THIS-PROGRAM-NAME
               programCtx.setRc( db200020.call(programCtx.getGlobalCtx().getContext("DB200020"),programCtx.getSqlca(),methodOut.getThisProgramNameGroup300()));
//  IF RETURN-CODE = +0
//  ELSE
          if (	( programCtx.getRc() != 0 )) { 
//  MOVE RETURN-CODE TO 600-DB2-ERR-RTN-CODE
              methodOut.setDb2ErrRtnCode600(CFUtil.pad(4,String.valueOf(programCtx.getRc()),"0",CFUtil.LEFT_PAD));
//  DISPLAY ' '
              logger.info(" "); 
//  DISPLAY 600-DB2-ERR-MODULE-MSG
              logger.info(methodIn.getDb2ErrModuleMsg600().toString()); 
          }
//  DISPLAY 'GP004760 : ERROR MESSAGES :'
          logger.info("GP004760 : ERROR MESSAGES :"); 
//  DISPLAY 'SQLCODE = ' 800-WS-SQLCODE-DISP
          logger.info("SQLCODE = {}", new String(methodIn.getWsSqlcodeDisp800())); 
//  DISPLAY SPACE
          logger.info(" "); 
//  DISPLAY '******************************************'
          logger.info("******************************************"); 
//  DISPLAY '***  PARAGRAPH     = ' 800-WS-CURR-PARAGRAPH
          logger.info("***  PARAGRAPH     = {}", new String(methodIn.getWsCurrParagraph800())); 
//  DISPLAY '***  SQL FUNCTION  = ' 800-WS-SQL-FUNCTION
          logger.info("***  SQL FUNCTION  = {}", new String(methodIn.getWsSqlFunction800())); 
//  DISPLAY '***  TABLE         = ' 800-WS-CURR-TABLE
          logger.info("***  TABLE         = {}", new String(methodIn.getWsCurrTable800())); 
//  DISPLAY '******************************************'
          logger.info("******************************************"); 
          // MOVE 3007 TO RETURN-CODE
          programCtx.setRc( 3007);
//  PERFORM 9900-TERMINATION
          termination(programCtx.getTerminationInCtx());/*9900-TERMINATION*/
          if (programCtx.isProgramEnded()) {
              return methodOut;
          }
          ;
      
      return methodOut;
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
      @Override
      public void abendPara(AbendParaInCtx methodIn) throws Exception {
      
// ******************************************************************
// * Abend routine-in case of file open/write/close failure         *
// ******************************************************************
Gp004760Ctx programCtx = methodIn.getGp004760Ctx();
//  EVALUATE TRUE
          if  ( methodIn.isFileOpenAbendCode88300()  ) { 

// *            Display 800-pgm-header 600-error-message
//  DISPLAY 300-STATUS-CODE 600-STATUS-CODE
              logger.info("{}{}", new String(methodIn.getStatusCode300()), String.valueOf(methodIn.getStatusCode600())); 
//  DISPLAY 'ABEND CODE       : ' 300-ABEND-CODE
              logger.info("ABEND CODE       : {}", new String(methodIn.getAbendCode300())); 
//  DISPLAY 'ABEND PARAGRAPHS : ' 300-ABEND-PARA
              logger.info("ABEND PARAGRAPHS : {}", new String(methodIn.getAbendPara300())); 
//  DISPLAY 600-DISPLAY-ABEND-MSG-TXT
              logger.info(new String(methodIn.getDisplayAbendMsgTxt600())); 
          }
          else if  ( methodIn.isFileWriteAbendCode88300()  ) { 

// *            Display 800-pgm-header 600-error-message
//  DISPLAY 300-STATUS-CODE 600-STATUS-CODE
              logger.info("{}{}", new String(methodIn.getStatusCode300()), String.valueOf(methodIn.getStatusCode600())); 
//  DISPLAY 'ABEND CODE       : ' 300-ABEND-CODE
              logger.info("ABEND CODE       : {}", new String(methodIn.getAbendCode300())); 
//  DISPLAY 'ABEND PARAGRAPHS : ' 300-ABEND-PARA
              logger.info("ABEND PARAGRAPHS : {}", new String(methodIn.getAbendPara300())); 
//  DISPLAY 600-DISPLAY-ABEND-MSG-TXT
              logger.info(new String(methodIn.getDisplayAbendMsgTxt600())); 
          }
          else if  ( methodIn.isFileCloseAbendCode88300()  ) { 

// *            Display 800-pgm-header 600-error-message
//  DISPLAY 300-STATUS-CODE 600-STATUS-CODE
              logger.info("{}{}", new String(methodIn.getStatusCode300()), String.valueOf(methodIn.getStatusCode600())); 
//  DISPLAY 'ABEND CODE       : ' 300-ABEND-CODE
              logger.info("ABEND CODE       : {}", new String(methodIn.getAbendCode300())); 
//  DISPLAY 'ABEND PARAGRAPHS : ' 300-ABEND-PARA
              logger.info("ABEND PARAGRAPHS : {}", new String(methodIn.getAbendPara300())); 
//  DISPLAY 600-DISPLAY-ABEND-MSG-TXT
              logger.info(new String(methodIn.getDisplayAbendMsgTxt600())); 
          }

// *       When other
// *            display 800-pgm-header
// *            display 800-all-astericks
// *            display 800-all-astericks
//  PERFORM 9900-TERMINATION
          termination(programCtx.getTerminationInCtx());/*9900-TERMINATION*/
          if (programCtx.isProgramEnded()) {
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
      @Override
      public void termination(TerminationInCtx methodIn) throws Exception {
      
// **************************************************************
// *  This is the termination para and it goes back to its      *
// *  call program.                                             *
// **************************************************************
Gp004760Ctx programCtx = methodIn.getGp004760Ctx();
//  DISPLAY SPACE
          logger.info(" "); 
//  DISPLAY SPACE
          logger.info(" "); 
//  DISPLAY '************ RECORD COUNTS **********************'
          logger.info("************ RECORD COUNTS **********************"); 
//  DISPLAY 600-OUTPUT-CNT-MSG WS-OUTFILE-CNT
          logger.info("{}{}", new String(methodIn.getOutputCntMsg600()), String.valueOf(methodIn.getOutfileCnt())); 
//  DISPLAY '*************************************************'
          logger.info("*************************************************"); 
//  DISPLAY SPACE
          logger.info(" "); 
//  DISPLAY SPACE
          logger.info(" "); 
//  GOBACK
          setNotLogged(false); // no need to log, it is a normal termination
          programCtx.setProgramEnded(true);
          return ;
      
      }
  
  
  
      public void setFromDb200020(Gp004760Ctx programCtx, Object[] params) {
      int len = params.length;
         if (len > 0)
         if(params[0] instanceof Field) 
   programCtx.getSqlca().setString(((Field)params[0] ).toCharArray());
 else    programCtx.getSqlca().setString((char[])params[0] );
         if (len > 1)
         if(params[1] instanceof Field) 
   programCtx.getThisProgramNameGroup300().setString(((Field)params[1] ).toCharArray());
 else    programCtx.getThisProgramNameGroup300().setString((char[])params[1] );
      }
  
  
  
  
  
  }
