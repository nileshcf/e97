  package com.cloudframe.app.process;
  /* 
*------------------------
*------------------------
*--------------
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
  
  public class Db2set3 extends CommonProcess {
  
  Logger logger = LoggerFactory.getLogger(Db2set3.class);
  
  private Sqlca sqlca = new Sqlca() ;
  private Vars vars = new Vars() ;
  private Work work = new Work() ;
  
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
      @Override
      public int process() throws Exception {
       initVars();
       try {
       setCodePage("1047");
          ;
//  PERFORM 0000-MAIN
          main();/*0000-MAIN*/
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
      * main 
      *   This method is derived from 
  *   COBOL Paragraph - 0000-MAIN COBOL Cyclomatic complexity - 2
      * Input  : None 

      * Output : None 

      * @throws CFException
      */
      private void main() throws Exception {

// *
//  PERFORM 1000-INITIALIZE THRU 1000-EXIT
          initialize();/*1000-INITIALIZE*/
          if (this.isProgramEnded()) {
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
      private void initialize() throws Exception {
			// Declare local variables used in the method
			int sqlcode = 0;
			// End of variable declaration

      
// *-----------------------------------------------------------------
//  MOVE '2020-03-31' TO WS-INPUT-DATE
//  LITERAL_2020_MN2_0331 = '2020-03-31'
          vars.setInputDate(CONSTANTS.LITERAL_2020_MN2_0331);
//  MOVE '2020-03-31' TO WS-EFF-END-DATE-BUILD
//  LITERAL_2020_MN2_0331 = '2020-03-31'
          vars.setEffEndDateBuild(CONSTANTS.LITERAL_2020_MN2_0331);
//  SELECT ADD_MONTHS ( DATE ( ? ) , +1 ) , LAST_DAY ( DATE ( ? ) - 1 MONTH ) FROM SYSIBM.SYSDUMMY1
          db2set3Repository.select(vars,sqlca);
          sqlcode = sqlca.getSqlcode();
//  IF SQLCODE = ZERO
          if (	( sqlcode == 0 )) { 
//  DISPLAY 'WS-FIRST-DAY-MNTH    =' WS-FIRST-DAY-MNTH ' <-- USING SET '
              logger.info("WS-FIRST-DAY-MNTH    ={} <-- USING SET ", new String(vars.getFirstDayMnth())); 
//  DISPLAY 'WS-EFF-END-DATE-CALC =' WS-EFF-END-DATE-CALC ' <-- USING SET '
              logger.info("WS-EFF-END-DATE-CALC ={} <-- USING SET ", new String(vars.getEffEndDateCalc())); 
          }
  
//  ELSE
          else { 
//  DISPLAY 'SQLCODE = ' SQLCODE
              logger.info("SQLCODE = {}", String.valueOf(sqlca.getSqlcode())); 
          }

// *
//  MOVE '2020-02-28' TO WS-INPUT-DATE WS-EFF-END-DATE-BUILD
//  LITERAL_2020_MN2_0228 = '2020-02-28'
          vars.setInputDate(CONSTANTS.LITERAL_2020_MN2_0228);
          vars.setEffEndDateBuild(CONSTANTS.LITERAL_2020_MN2_0228);
//  SELECT ADD_MONTHS ( DATE ( ? ) , -2 ) , LAST_DAY ( DATE ( ? ) + 2 MONTH ) , ADD_MONTHS ( LAST_DAY ( CURRENT_DATE ) , 1 ) FROM SYSIBM.SYSDUMMY1
          db2set3Repository.select1(vars,sqlca);
          sqlcode = sqlca.getSqlcode();
//  IF SQLCODE = ZERO
          if (	( sqlcode == 0 )) { 
//  DISPLAY 'WS-FIRST-DAY-MNTH    =' WS-FIRST-DAY-MNTH ' <-- USING SET '
              logger.info("WS-FIRST-DAY-MNTH    ={} <-- USING SET ", new String(vars.getFirstDayMnth())); 
//  DISPLAY 'WS-EFF-END-DATE-CALC =' WS-EFF-END-DATE-CALC ' <-- USING SET '
              logger.info("WS-EFF-END-DATE-CALC ={} <-- USING SET ", new String(vars.getEffEndDateCalc())); 
//  DISPLAY 'WS-LAST DATE         =' WS-LAST-DATE ' <-- USING SET '
              logger.info("WS-LAST DATE         ={} <-- USING SET ", new String(vars.getLastDate())); 
          }
  
//  ELSE
          else { 
//  DISPLAY 'SQLCODE = ' SQLCODE
              logger.info("SQLCODE = {}", String.valueOf(sqlca.getSqlcode())); 
          }
      
      }
  
  
      /**
* This method pre-initializes variables consistent with
* what a mainframe program would have done at the start of a program
*/
      @Override
      public void initVars() throws CFException {
      setProgramEnded(false);
          db2Base.reset("DB2SET3" ,dbQualifier, true/*use Dynamic SQL*/);
          if(!isInitDone()) {
          	this.setRc(0);
          	setInitDone(true);
          }
        CFUtil.resetDecimalAsComma();
       }
  
  
  
  
  
  
  }
