  package com.cloudframe.app.process.impl;
  /* 
*
*/
  
  import com.cloudframe.app.cobpgmor.CobpgmorCtx.*;
  import com.cloudframe.app.cobpgmor.CobpgmorCtx;
  import com.cloudframe.app.process.Cobpgmor;
  import com.cloudframe.app.process.BaseProcess;
  import org.springframework.web.bind.annotation.GetMapping;
  import org.slf4j.Logger;
  import org.slf4j.LoggerFactory;
  import com.cloudframe.app.exception.CFException;
  import org.springframework.stereotype.Component;
  import org.springframework.web.bind.annotation.RestController;
  import com.cloudframe.app.dto.GlobalExecutorCtx;
  import com.cloudframe.app.exception.Terminate;
  import org.springframework.beans.factory.annotation.Autowired;
  import org.springframework.beans.factory.annotation.Qualifier;
  import com.cloudframe.app.repository.CobpgmorRepository;
  import com.cloudframe.app.utility.CFUtil;
  import com.cloudframe.app.cobpgmor.dto.*;
  import com.cloudframe.app.cobpgmor.dto.Sqlca;
  import com.cloudframe.app.cobpgmor.dto.Ibook;
  import com.cloudframe.app.cobpgmor.dto.HvErec;
  import com.cloudframe.app.cobpgmor.dto.Work;
  import com.cloudframe.app.common.CONSTANTS;
  import com.cloudframe.app.common.SQLS;
  import org.springframework.beans.factory.annotation.Value;
  import com.cloudframe.app.dao.Db2Base;
  import java.sql.SQLException;
  
  @Component("cobpgmor")
  
  public class CobpgmorImpl extends CommonProcess implements Cobpgmor {
  
  Logger logger = LoggerFactory.getLogger(CobpgmorImpl.class);
  
  
  @Value("${COBPGMOR.dbQualifier:}")
  private String dbQualifier;
  
  
  @Autowired 
  @Qualifier("db2Base")
  Db2Base db2Base;
  @Autowired 
  @Qualifier("cobpgmorRepository")
  CobpgmorRepository cobpgmorRepository;
  
  
  
  
  
  
      /**
      * process 
      * Input  : None 

      * Output : None 

      * @throws CFException
      */
      public int process(CobpgmorCtx programCtx) throws Exception {
       try {
       setCodePage("1047");
            // Reset program ended flag
           programCtx.setProgramEnded(false);
      	db2Base.reset("COBPGMOR" ,dbQualifier, true/*use Dynamic SQL*/);
          ;
//  PERFORM 0000-MAIN-PARA
          mainPara(programCtx.getMainParaInCtx());/*0000-MAIN-PARA*/
          if (programCtx.isProgramEnded()) {
              return programCtx.getRc();
          }
       } catch(Exception e) {
            handleErrorCode(e);
            throw e;
       }
        finally {
		handleDbAtEnd(db2Base); 
		clearVars(); 
      

      }
      
       return programCtx.getRc(); // Exit with return code
      // end of process method
      }
      /**
      * mainPara 
      *   This method is derived from 
  *   COBOL Paragraph - 0000-MAIN-PARA COBOL Cyclomatic complexity - 3
      * Input  :  

      * - sqlcode                        COBOL Name: SQLCODE
      *
      * Output : None 

      * @throws CFException
      */
      @Override
      public MainParaOutCtx mainPara(MainParaInCtx methodIn) throws Exception {
CobpgmorCtx programCtx = methodIn.getCobpgmorCtx();
MainParaOutCtx methodOut = methodIn.getMainParaOutCtx();

// *-----------------------------------------------------------------
//  PERFORM 1000-INIT-PARA THRU 1000-INIT-EXIT
          initPara(programCtx.getInitParaInCtx());/*1000-INIT-PARA*/
          if (programCtx.isProgramEnded()) {
              return methodOut;
          }
//  PERFORM 2000-PROCESS-PARA THRU 2000-PROCESS-EXIT UNTIL SQLCODE = 100
          while (	( methodOut.getSqlcode() != 100 )) {
             processPara(programCtx);/*2000-PROCESS-PARA*/
             if (programCtx.isProgramEnded()) {
                 return methodOut;
             }
          }
//  PERFORM 3000-FINISH-PARA THRU 3000-FINISH-EXIT
          finishPara(programCtx.getFinishParaInCtx());/*3000-FINISH-PARA*/
          if (programCtx.isProgramEnded()) {
              return methodOut;
          }
//  STOP RUN
          throw Terminate.TERMINATE;
      
      }
      /**
      * initPara 
      *   This method is derived from 
  *   COBOL Paragraph - 1000-INIT-PARA COBOL Cyclomatic complexity - 4
      * Input  :  

      * - sqlcode                        COBOL Name: SQLCODE
      *
      * Output :  

      * - sqlcode_Ws                     COBOL Name: WS-SQLCODE
      * - sqlcode                        COBOL Name: SQLCODE
      *
      * @throws CFException
      */
      @Override
      public InitParaOutCtx initPara(InitParaInCtx methodIn) throws Exception {
      
// *-----------------------------------------------------------------
CobpgmorCtx programCtx = methodIn.getCobpgmorCtx();
InitParaOutCtx methodOut = methodIn.getInitParaOutCtx();
//  SELECT ENO , ENAME , EADD , ESAL , EDOJ FROM CLOUDFRM.TBJEMP ORDER BY ENO
          programCtx.setCcurResultSet(cobpgmorRepository.openCcurCobpgmor(programCtx.getSqlca()));
//  EVALUATE SQLCODE
          switch(methodOut.getSqlcode()){
          	case 0:
          break;
          default :
              // MOVE SQLCODE TO WS-SQLCODE
              //  FORMAT1016346752 = "--99"
              methodOut.setSqlcode_Ws(CFUtil.cobolNumberFormatter(CONSTANTS.FORMAT1016346752,String.valueOf(methodOut.getSqlcode()).toCharArray()));
//  DISPLAY 'ERROR IN OPEN CSR - SQLCODE: ' WS-SQLCODE
              logger.info("ERROR IN OPEN CSR - SQLCODE: {}", new String(methodOut.getSqlcode_Ws())); 
          }
//  PERFORM 8880-ADDTL-DB2-QRS THRU 8880-ADDTL-DB2-QRS-EXIT
          addtlDb2Qrs(programCtx.getAddtlDb2QrsInCtx());/*8880-ADDTL-DB2-QRS*/
          ;
      
      return methodOut;
      }
      /**
      * processPara 
      *   This method is derived from 
  *   COBOL Paragraph - 2000-PROCESS-PARA COBOL Cyclomatic complexity - 1
      * Input  : None 

      * Output : None 

      * @throws CFException
      */
      @Override
      public void processPara(CobpgmorCtx programCtx) throws Exception {

// *-----------------------------------------------------------------
//  PERFORM 8000-FETCH-PARA THRU 8000-FETCH-PARA-EXIT
          fetchPara(programCtx.getFetchParaInCtx());/*8000-FETCH-PARA*/
          ;
      
      }
      /**
      * finishPara 
      *   This method is derived from 
  *   COBOL Paragraph - 3000-FINISH-PARA COBOL Cyclomatic complexity - 4
      * Input  :  

      * - sqlcode                        COBOL Name: SQLCODE
      *
      * Output :  

      * - sqlcode_Ws                     COBOL Name: WS-SQLCODE
      * - sqlcode                        COBOL Name: SQLCODE
      *
      * @throws CFException
      */
      @Override
      public FinishParaOutCtx finishPara(FinishParaInCtx methodIn) throws Exception {
CobpgmorCtx programCtx = methodIn.getCobpgmorCtx();
FinishParaOutCtx methodOut = methodIn.getFinishParaOutCtx();
//  CLOSE CCUR
          cobpgmorRepository.closeCcurCobpgmor(programCtx.getCcurResultSet(),programCtx.getSqlca());
//  EVALUATE SQLCODE
          switch(methodOut.getSqlcode()){
          	case 0:
          break;
          default :
              // MOVE SQLCODE TO WS-SQLCODE
              //  FORMAT1016346752 = "--99"
              methodOut.setSqlcode_Ws(CFUtil.cobolNumberFormatter(CONSTANTS.FORMAT1016346752,String.valueOf(methodOut.getSqlcode()).toCharArray()));
//  DISPLAY 'ERROR IN CLOSE CSR - SQLCODE: ' WS-SQLCODE
              logger.info("ERROR IN CLOSE CSR - SQLCODE: {}", new String(methodOut.getSqlcode_Ws())); 
          }
      
      return methodOut;
      }
      /**
      * fetchPara 
      *   This method is derived from 
  *   COBOL Paragraph - 8000-FETCH-PARA COBOL Cyclomatic complexity - 5
      * Input  :  

      * - sqlcode                        COBOL Name: SQLCODE
      *
      * Output :  

      * - sqlcode_Ws                     COBOL Name: WS-SQLCODE
      * - sqlcode                        COBOL Name: SQLCODE
      *
      * @throws CFException
      */
      @Override
      public FetchParaOutCtx fetchPara(FetchParaInCtx methodIn) throws Exception {
CobpgmorCtx programCtx = methodIn.getCobpgmorCtx();
FetchParaOutCtx methodOut = methodIn.getFetchParaOutCtx();
//  FETCH CCUR INTO ?
          cobpgmorRepository.fetchCcurCobpgmor(programCtx.getCcurResultSet(),programCtx.getSqlca(),methodOut.getHvErec(),methodOut.getIbook());
//  EVALUATE SQLCODE
          switch(methodOut.getSqlcode()){
          	case 0:
          break;
          	case 100:
//  DISPLAY 'ALL RECORDS PROCESSED'
              logger.info("ALL RECORDS PROCESSED"); 
          break;
          default :
              // MOVE SQLCODE TO WS-SQLCODE
              //  FORMAT1016346752 = "--99"
              methodOut.setSqlcode_Ws(CFUtil.cobolNumberFormatter(CONSTANTS.FORMAT1016346752,String.valueOf(methodOut.getSqlcode()).toCharArray()));
//  DISPLAY 'ERROR IN FETCH CSR - SQLCODE: ' WS-SQLCODE
              logger.info("ERROR IN FETCH CSR - SQLCODE: {}", new String(methodOut.getSqlcode_Ws())); 
          }
      
      return methodOut;
      }
      /**
      * addtlDb2Qrs 
      *   This method is derived from 
  *   COBOL Paragraph - 8880-ADDTL-DB2-QRS COBOL Cyclomatic complexity - 3
      * Input  :  

      * - sqlcode                        COBOL Name: SQLCODE
      * - count                          COBOL Name: WS-COUNT
      *
      * Output : None 

      * @throws CFException
      */
      @Override
      public AddtlDb2QrsOutCtx addtlDb2Qrs(AddtlDb2QrsInCtx methodIn) throws Exception {
      
// *-----------------------------------------------------------------
CobpgmorCtx programCtx = methodIn.getCobpgmorCtx();
AddtlDb2QrsOutCtx methodOut = methodIn.getAddtlDb2QrsOutCtx();
//  SELECT COUNT ( * ) FROM CLOUDFRM.TBJEMP
          cobpgmorRepository.selectTbjemp(programCtx.getSqlca(),methodOut.getWork());
//  IF SQLCODE NOT = 0
          if (	( methodOut.getSqlcode() != 0 )) { 
//  DISPLAY 'SQL ERROR IN GETTING EMPLOYEES COUNT : ' SQLCODE
              logger.info("SQL ERROR IN GETTING EMPLOYEES COUNT : {}", String.valueOf(methodOut.getSqlcode())); 
          }
//  ELSE
          else { 
//  DISPLAY 'TOTAL NO OF EMPLOYEES ARE: ' WS-COUNT
              logger.info("TOTAL NO OF EMPLOYEES ARE: {}", new String(methodIn.getCount())); 
          }
      
      return methodOut;
      }
  
  
  
  
  
  
  
  
  }
