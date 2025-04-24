  package com.cloudframe.app.process.impl;
  /* 
*------------------------
*------------------------
*--------------
*/
  
  import com.cloudframe.app.db2set3.Db2set3Ctx.*;
  import com.cloudframe.app.db2set3.Db2set3Ctx;
  import com.cloudframe.app.process.Db2set3;
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
  import com.cloudframe.app.repository.Db2set3Repository;
  import com.cloudframe.app.db2set3.dto.*;
  import com.cloudframe.app.db2set3.dto.Sqlca;
  import com.cloudframe.app.db2set3.dto.Vars;
  import com.cloudframe.app.db2set3.dto.Work;
  import com.cloudframe.app.common.CONSTANTS;
  import com.cloudframe.app.common.SQLS;
  import com.cloudframe.app.utility.CFUtil;
  import org.springframework.beans.factory.annotation.Value;
  import com.cloudframe.app.dao.Db2Base;
  import java.sql.SQLException;
  
  @Component("db2set3")
  
  public class Db2set3Impl extends CommonProcess implements Db2set3 {
  
  Logger logger = LoggerFactory.getLogger(Db2set3Impl.class);
  
  
  @Value("${DB2SET3.dbQualifier:}")
  private String dbQualifier;
  
  
  @Autowired 
  @Qualifier("db2Base")
  Db2Base db2Base;
  @Autowired 
  @Qualifier("db2set3Repository")
  Db2set3Repository db2set3Repository;
  
  
  
  
  
  
      /**
      * process 
      * Input  : None 

      * Output : None 

      * @throws CFException
      */
      public int process(Db2set3Ctx programCtx) throws Exception {
       try {
       setCodePage("1047");
            // Reset program ended flag
           programCtx.setProgramEnded(false);
      	db2Base.reset("DB2SET3" ,dbQualifier, true/*use Dynamic SQL*/);
          ;
//  PERFORM 0000-MAIN
          main(programCtx);/*0000-MAIN*/
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
      * main 
      *   This method is derived from 
  *   COBOL Paragraph - 0000-MAIN COBOL Cyclomatic complexity - 2
      * Input  : None 

      * Output : None 

      * @throws CFException
      */
      @Override
      public void main(Db2set3Ctx programCtx) throws Exception {

// *
//  PERFORM 1000-INITIALIZE THRU 1000-EXIT
          initialize(programCtx.getInitializeInCtx());/*1000-INITIALIZE*/
          if (programCtx.isProgramEnded()) {
              return ;
          }
//  STOP RUN
          throw Terminate.TERMINATE;
      
      }
      /**
      * initialize 
      *   This method is derived from 
  *   COBOL Paragraph - 1000-INITIALIZE COBOL Cyclomatic complexity - 5
      * Input  :  

      * - sqlcode                        COBOL Name: SQLCODE
      * - firstDayMnth                   COBOL Name: WS-FIRST-DAY-MNTH
      * - effEndDateCalc                 COBOL Name: WS-EFF-END-DATE-CALC
      * - lastDate                       COBOL Name: WS-LAST-DATE
      *
      * Output :  

      * - inputDate                      COBOL Name: WS-INPUT-DATE
      * - effEndDateBuild                COBOL Name: WS-EFF-END-DATE-BUILD
      *
      * @throws CFException
      */
      @Override
      public InitializeOutCtx initialize(InitializeInCtx methodIn) throws Exception {
      
// *-----------------------------------------------------------------
Db2set3Ctx programCtx = methodIn.getDb2set3Ctx();
InitializeOutCtx methodOut = methodIn.getInitializeOutCtx();
//  MOVE '2020-03-31' TO WS-INPUT-DATE
//  LITERAL_2020_MN2_0331 = '2020-03-31'
          methodOut.setInputDate(CONSTANTS.LITERAL_2020_MN2_0331);
//  MOVE '2020-03-31' TO WS-EFF-END-DATE-BUILD
//  LITERAL_2020_MN2_0331 = '2020-03-31'
          methodOut.setEffEndDateBuild(CONSTANTS.LITERAL_2020_MN2_0331);
//  SELECT ADD_MONTHS ( DATE ( ? ) , +1 ) , LAST_DAY ( DATE ( ? ) - 1 MONTH ) FROM SYSIBM.SYSDUMMY1
          db2set3Repository.select(programCtx.getSqlca(),methodOut.getVars());
//  IF SQLCODE = ZERO
          if (	( methodOut.getSqlcode() == 0 )) { 
//  DISPLAY 'WS-FIRST-DAY-MNTH    =' WS-FIRST-DAY-MNTH ' <-- USING SET '
              logger.info("WS-FIRST-DAY-MNTH    ={} <-- USING SET ", new String(methodIn.getFirstDayMnth())); 
//  DISPLAY 'WS-EFF-END-DATE-CALC =' WS-EFF-END-DATE-CALC ' <-- USING SET '
              logger.info("WS-EFF-END-DATE-CALC ={} <-- USING SET ", new String(methodIn.getEffEndDateCalc())); 
          }
//  ELSE
          else { 
//  DISPLAY 'SQLCODE = ' SQLCODE
              logger.info("SQLCODE = {}", String.valueOf(methodOut.getSqlcode())); 
          }

// *
//  MOVE '2020-02-28' TO WS-INPUT-DATE WS-EFF-END-DATE-BUILD
//  LITERAL_2020_MN2_0228 = '2020-02-28'
          methodOut.setInputDate(CONSTANTS.LITERAL_2020_MN2_0228);
          methodOut.setEffEndDateBuild(CONSTANTS.LITERAL_2020_MN2_0228);
//  SELECT ADD_MONTHS ( DATE ( ? ) , -2 ) , LAST_DAY ( DATE ( ? ) + 2 MONTH ) , ADD_MONTHS ( LAST_DAY ( CURRENT_DATE ) , 1 ) FROM SYSIBM.SYSDUMMY1
          db2set3Repository.select1(programCtx.getSqlca(),methodOut.getVars());
//  IF SQLCODE = ZERO
          if (	( methodOut.getSqlcode() == 0 )) { 
//  DISPLAY 'WS-FIRST-DAY-MNTH    =' WS-FIRST-DAY-MNTH ' <-- USING SET '
              logger.info("WS-FIRST-DAY-MNTH    ={} <-- USING SET ", new String(methodIn.getFirstDayMnth())); 
//  DISPLAY 'WS-EFF-END-DATE-CALC =' WS-EFF-END-DATE-CALC ' <-- USING SET '
              logger.info("WS-EFF-END-DATE-CALC ={} <-- USING SET ", new String(methodIn.getEffEndDateCalc())); 
//  DISPLAY 'WS-LAST DATE         =' WS-LAST-DATE ' <-- USING SET '
              logger.info("WS-LAST DATE         ={} <-- USING SET ", new String(methodIn.getLastDate())); 
          }
//  ELSE
          else { 
//  DISPLAY 'SQLCODE = ' SQLCODE
              logger.info("SQLCODE = {}", String.valueOf(methodOut.getSqlcode())); 
          }
      
      return methodOut;
      }
  
  
  
  
  
  
  
  
  }
