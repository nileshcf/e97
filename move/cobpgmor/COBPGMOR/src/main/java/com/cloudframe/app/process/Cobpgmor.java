  package com.cloudframe.app.process;
  /* 
*
*/
  
  import org.springframework.web.bind.annotation.GetMapping;
  import org.slf4j.Logger;
  import org.slf4j.LoggerFactory;
  import com.cloudframe.app.exception.CFException;
  import org.springframework.stereotype.Component;
  import org.springframework.web.bind.annotation.RestController;
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
  
  public class Cobpgmor extends CommonProcess {
  
  Logger logger = LoggerFactory.getLogger(Cobpgmor.class);
  
  private Sqlca sqlca = new Sqlca() ;
  private Ibook ibook = new Ibook() ;
  private HvErec hvErec = new HvErec() ;
  private Work work = new Work() ;
  
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
      @Override
      public int process() throws Exception {
       initVars();
       try {
       setCodePage("1047");
          ;
//  PERFORM 0000-MAIN-PARA
          mainPara();/*0000-MAIN-PARA*/
          if (this.isProgramEnded()) {
              return getRc();
          }
       } catch(Exception e) {
            handleErrorCode(e);
            throw e;
       }
        finally {
		handleDbAtEnd(db2Base); 
		clearVars(); 
      

      }
      
       return getRc(); // Exit with return code
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
      private void mainPara() throws Exception {

// *-----------------------------------------------------------------
//  PERFORM 1000-INIT-PARA THRU 1000-INIT-EXIT
          initPara();/*1000-INIT-PARA*/
          if (this.isProgramEnded()) {
              return ;
          }
//  PERFORM 2000-PROCESS-PARA THRU 2000-PROCESS-EXIT UNTIL SQLCODE = 100
          while (	( sqlca.getSqlcode() != 100 )) {
             processPara();/*2000-PROCESS-PARA*/
             if (this.isProgramEnded()) {
                 return ;
             }
          }
//  PERFORM 3000-FINISH-PARA THRU 3000-FINISH-EXIT
          finishPara();/*3000-FINISH-PARA*/
          if (this.isProgramEnded()) {
              return ;
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
      private void initPara() throws Exception {
      
// *-----------------------------------------------------------------
//  SELECT ENO , ENAME , EADD , ESAL , EDOJ FROM CLOUDFRM.TBJEMP ORDER BY ENO
          cobpgmorRepository.openCcurCobpgmor(sqlca);
//  EVALUATE SQLCODE
          switch(sqlca.getSqlcode()){
          	case 0:
          break;
          default :
              // MOVE SQLCODE TO WS-SQLCODE
              //  FORMAT1016346752 = "--99"
              work.setSqlcode_Ws(CFUtil.cobolNumberFormatter(CONSTANTS.FORMAT1016346752,String.valueOf(sqlca.getSqlcode()).toCharArray()));
//  DISPLAY 'ERROR IN OPEN CSR - SQLCODE: ' WS-SQLCODE
              logger.info("ERROR IN OPEN CSR - SQLCODE: {}", new String(work.getSqlcode_Ws())); 
          }
//  PERFORM 8880-ADDTL-DB2-QRS THRU 8880-ADDTL-DB2-QRS-EXIT
          addtlDb2Qrs();/*8880-ADDTL-DB2-QRS*/
          ;
      
      }
      /**
      * processPara 
      *   This method is derived from 
  *   COBOL Paragraph - 2000-PROCESS-PARA COBOL Cyclomatic complexity - 1
      * Input  : None 

      * Output : None 

      * @throws CFException
      */
      private void processPara() throws Exception {

// *-----------------------------------------------------------------
//  PERFORM 8000-FETCH-PARA THRU 8000-FETCH-PARA-EXIT
          fetchPara();/*8000-FETCH-PARA*/
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
      private void finishPara() throws Exception {
//  CLOSE CCUR
          cobpgmorRepository.closeCcurCobpgmor(sqlca);
//  EVALUATE SQLCODE
          switch(sqlca.getSqlcode()){
          	case 0:
          break;
          default :
              // MOVE SQLCODE TO WS-SQLCODE
              //  FORMAT1016346752 = "--99"
              work.setSqlcode_Ws(CFUtil.cobolNumberFormatter(CONSTANTS.FORMAT1016346752,String.valueOf(sqlca.getSqlcode()).toCharArray()));
//  DISPLAY 'ERROR IN CLOSE CSR - SQLCODE: ' WS-SQLCODE
              logger.info("ERROR IN CLOSE CSR - SQLCODE: {}", new String(work.getSqlcode_Ws())); 
          }
      
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
      private void fetchPara() throws Exception {
//  FETCH CCUR INTO ?
          cobpgmorRepository.fetchCcurCobpgmor(sqlca,ibook,hvErec);
//  EVALUATE SQLCODE
          switch(sqlca.getSqlcode()){
          	case 0:
          break;
          	case 100:
//  DISPLAY 'ALL RECORDS PROCESSED'
              logger.info("ALL RECORDS PROCESSED"); 
          break;
          default :
              // MOVE SQLCODE TO WS-SQLCODE
              //  FORMAT1016346752 = "--99"
              work.setSqlcode_Ws(CFUtil.cobolNumberFormatter(CONSTANTS.FORMAT1016346752,String.valueOf(sqlca.getSqlcode()).toCharArray()));
//  DISPLAY 'ERROR IN FETCH CSR - SQLCODE: ' WS-SQLCODE
              logger.info("ERROR IN FETCH CSR - SQLCODE: {}", new String(work.getSqlcode_Ws())); 
          }
      
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
      private void addtlDb2Qrs() throws Exception {
			// Declare local variables used in the method
			int sqlcode = 0;
			// End of variable declaration

      
// *-----------------------------------------------------------------
//  SELECT COUNT ( * ) FROM CLOUDFRM.TBJEMP
          cobpgmorRepository.selectTbjemp(sqlca,work);
          sqlcode = sqlca.getSqlcode();
//  IF SQLCODE NOT = 0
          if (	( sqlcode != 0 )) { 
//  DISPLAY 'SQL ERROR IN GETTING EMPLOYEES COUNT : ' SQLCODE
              logger.info("SQL ERROR IN GETTING EMPLOYEES COUNT : {}", String.valueOf(sqlca.getSqlcode())); 
          }
  
//  ELSE
          else { 
//  DISPLAY 'TOTAL NO OF EMPLOYEES ARE: ' WS-COUNT
              logger.info("TOTAL NO OF EMPLOYEES ARE: {}", new String(work.getCount())); 
          }
      
      }
  
  
      /**
* This method pre-initializes variables consistent with
* what a mainframe program would have done at the start of a program
*/
      @Override
      public void initVars() throws CFException {
      setProgramEnded(false);
          db2Base.reset("COBPGMOR" ,dbQualifier, true/*use Dynamic SQL*/);
          if(!isInitDone()) {
          	this.setRc(0);
          	setInitDone(true);
          }
        CFUtil.resetDecimalAsComma();
       }
  
  
  
  
  
  
  }
