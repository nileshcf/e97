package org.optum.uhg.service.impl;
  /* 
*------------------------
*------------------------
*--------------
*/
  
import org.optum.uhg.common.CommonProcess;
import com.cloudframe.app.process.BaseProcess;
import org.optum.uhg.dto.cfwidget.CfwidgetCtx.*;
import org.optum.uhg.dto.cfwidget.CfwidgetCtx;
import org.optum.uhg.service.Cfwidget;
  import com.cloudframe.app.process.BaseProcess;
import org.springframework.web.bind.annotation.GetMapping;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
  import com.cloudframe.app.exception.CFException;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RestController;
  import com.cloudframe.app.dto.GlobalExecutorCtx;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.optum.uhg.repository.CfwidgetRepository;
  import com.cloudframe.app.exception.Terminate;
  import com.cloudframe.app.data.Field;
import org.optum.uhg.dto.cfwidget.*;
import org.optum.uhg.dto.cfwidget.Sqlca;
import org.optum.uhg.dto.cfwidget.Tbxmlwgt;
import org.optum.uhg.dto.cfwidget.Work;
import org.optum.uhg.common.CONSTANTS;
import org.optum.uhg.common.SQLS;
  import com.cloudframe.app.utility.CFUtil;
import org.springframework.beans.factory.annotation.Value;
  import com.cloudframe.app.dao.Db2Base;
import java.sql.SQLException;
  
  @Component("cfwidget")
  
  public class CfwidgetImpl extends CommonProcess implements Cfwidget {
  
  Logger logger = LoggerFactory.getLogger(CfwidgetImpl.class);
  
  
  @Value("${CFWIDGET.dbQualifier:}")
  private String dbQualifier;
  
  
  @Autowired 
  @Qualifier("cfwidgetRepository")
  CfwidgetRepository cfwidgetRepository;
  
  
  
  
  
  
      /**
      * process 
      * Input  : None 

      * Output : None 

      * @throws CFException
      */
      public int process(CfwidgetCtx programCtx) throws Exception {
       try {
       setCodePage("1047");
            // Reset program ended flag
           programCtx.setProgramEnded(false);
      	db2Base.reset("CFWIDGET" ,dbQualifier, true/*use Dynamic SQL*/);
//  PERFORM 0000-MAIN
          main(programCtx.getMainInCtx());/*0000-MAIN*/
       } catch(Exception e) {
            handleErrorCode(e);
            throw e;
       }
        finally {
		handleDbAtEnd(db2Base); 
      

      }
      
       return programCtx.getRc(); // Exit with return code
      // end of process method
      }
      /**
      * main 
      *   This method is derived from 
  *   COBOL Paragraph - 0000-MAIN COBOL Cyclomatic complexity - 5
      * Input  :  

      * - loSupplier                     COBOL Name: LO-SUPPLIER
      * - hiSupplier                     COBOL Name: HI-SUPPLIER
      * - eofFlag                        COBOL Name: EOF-FLAG
      *
      * Output :  

      * - errMsg                         COBOL Name: ERR-MSG
      * - writeRec                       COBOL Name: WS-WRITE-REC
      *
      * @throws CFException
      */
      @Override
      public MainOutCtx main(MainInCtx methodIn) throws Exception {
CfwidgetCtx programCtx = methodIn.getCfwidgetCtx();
MainOutCtx methodOut = methodIn.getMainOutCtx();
//  PERFORM 1000-INITIALIZE THRU 1000-EXIT
          initialize(programCtx.getInitializeInCtx());/*1000-INITIALIZE*/
//  DISPLAY 'Predicate : '
          logger.info("Predicate : "); 
//  DISPLAY ' LO-SUPPLIER -> ' LO-SUPPLIER
          logger.info(" LO-SUPPLIER -> {}", new String(methodIn.getLoSupplier())); 
//  DISPLAY ' HI-SUPPLIER -> ' HI-SUPPLIER
          logger.info(" HI-SUPPLIER -> {}", new String(methodIn.getHiSupplier())); 
//  DISPLAY '-------------------------------'
          logger.info("-------------------------------"); 
//  SELECT WIDGET_NUM , WIDGET_COLOR FROM TBWIDGET WHERE WIDGET_SUPPLIER BETWEEN ? AND ? WITH UR
          programCtx.setWidgetcurResultSet(cfwidgetRepository.openWidgetcurCfwidget(methodIn.getWork(),programCtx.getSqlca()));
          // MOVE 'ERROR OPENING WIDGETCUR' TO ERR-MSG
          methodOut.setErrMsg(CONSTANTS.LITERAL_ERROR_B9_OPENINGWIDGETCUR);
//  PERFORM 9999-SQL-ERR-CHK THRU 9999-EXIT
          sqlErrChk(programCtx.getSqlErrChkInCtx());/*9999-SQL-ERR-CHK*/
//  PERFORM 1200-FETCH-CURSOR THRU 1200-EXIT
          fetchCursor(programCtx);/*1200-FETCH-CURSOR*/

// *

// *
//  PERFORM 2000-SQLMAIN THRU 2000-EXIT UNTIL END-OF-FILE
          while (!(methodIn.isEndOfFile()) ) {
             sqlmain(programCtx.getSqlmainInCtx());/*2000-SQLMAIN*/
          }
//  SET 88-DONT-WRITE-REC TO TRUE
          methodOut.setDontWriteRec88True(); 
          
//  CLOSE WIDGETCUR
          cfwidgetRepository.closeWidgetcurCfwidget(programCtx.getWidgetcurResultSet(),programCtx.getSqlca());
          // MOVE 'ERROR CLOSING WIDGETCUR' TO ERR-MSG
          methodOut.setErrMsg(CONSTANTS.LITERAL_ERROR_B9_CLOSINGWIDGETCUR);
//  PERFORM 9999-SQL-ERR-CHK THRU 9999-EXIT
          sqlErrChk(programCtx.getSqlErrChkInCtx());/*9999-SQL-ERR-CHK*/

// *
//  PERFORM 3000-HOUSEKEEPING THRU 3000-EXIT
          housekeeping(programCtx);/*3000-HOUSEKEEPING*/
//  STOP RUN
          throw Terminate.TERMINATE;
      
      }
      /**
      * initialize 
      *   This method is derived from 
  *   COBOL Paragraph - 1000-INITIALIZE COBOL Cyclomatic complexity - 2
      * Input  :  

      * - timestamp                      COBOL Name: WS-TIMESTAMP
      *
      * Output :  

      * - errLoc                         COBOL Name: ERR-LOC
      * - errMsg                         COBOL Name: ERR-MSG
      * - dateR                          COBOL Name: WS-DATE-R
      * - timestamp                      COBOL Name: WS-TIMESTAMP
      * - timeR                          COBOL Name: WS-TIME-R
      * - loSupplier                     COBOL Name: LO-SUPPLIER
      * - hiSupplier                     COBOL Name: HI-SUPPLIER
      *
      * @throws CFException
      */
      @Override
      public InitializeOutCtx initialize(InitializeInCtx methodIn) throws Exception {
      
// *-----------------------------------------------------------------
CfwidgetCtx programCtx = methodIn.getCfwidgetCtx();
InitializeOutCtx methodOut = methodIn.getInitializeOutCtx();
          // MOVE '1000-INITALIZE' TO ERR-LOC
          methodOut.setErrLoc(CONSTANTS.LITERAL_1000_MN_INITALIZE_B6_);
//  SELECT CURRENT_TIMESTAMP FROM SYSIBM.SYSDUMMY1
          
/**
******      SELECT CURRENT_TIMESTAMP                               
******      INTO :WS-TIMESTAMP                                     
******      FROM SYSIBM.SYSDUMMY1                                  
**/
          methodOut.setSqlcode(0);
          methodOut.setTimestamp(db2Base.getCurrentTimestamp()); 
          // MOVE 'ERROR WITH TIMESTAMP' TO ERR-MSG
          methodOut.setErrMsg(CONSTANTS.LITERAL_ERROR_B12_WITHTIMESTAMP);
//  PERFORM 9999-SQL-ERR-CHK THRU 9999-EXIT
          sqlErrChk(programCtx.getSqlErrChkInCtx());/*9999-SQL-ERR-CHK*/
//  MOVE WS-TIMESTAMP (1 : 10) TO WS-DATE-R
          methodOut.setDateR(substring(methodOut.getTimestamp(),0,10));
//  MOVE WS-TIMESTAMP (12 : 12) TO WS-TIME-R
          methodOut.setTimeR(substring(methodOut.getTimestamp(),11,23));
          // MOVE LOW-VALUES TO LO-SUPPLIER
          methodOut.setLoSupplier(CONSTANTS.LOW_VALUE_1703015707);
          // MOVE HIGH-VALUES TO HI-SUPPLIER
          methodOut.setHiSupplier(CONSTANTS.HIGH_VALUE_1986603393);
      
      return methodOut;
      }
      /**
      * fetchCursor 
      *   This method is derived from 
  *   COBOL Paragraph - 1200-FETCH-CURSOR COBOL Cyclomatic complexity - 2
      * Input  : None 

      * Output :  

      * - errLoc                         COBOL Name: ERR-LOC
      * - errMsg                         COBOL Name: ERR-MSG
      *
      * @throws CFException
      */
      @Override
      public FetchCursorOutCtx fetchCursor(CfwidgetCtx programCtx) throws Exception {
      
// *-----------------------------------------------------------------
FetchCursorOutCtx methodOut = programCtx.getFetchCursorOutCtx();
          // MOVE '1200-FETCH-CURSOR' TO ERR-LOC
          methodOut.setErrLoc(CONSTANTS.LITERAL_1200_MN2_FETCHCURSOR_B3_);
//  FETCH WIDGETCUR INTO ? , ?
          cfwidgetRepository.fetchWidgetcurCfwidget(programCtx.getWidgetcurResultSet(),methodOut.getTbxmlwgt(),programCtx.getSqlca());
          // MOVE 'ERROR FETCHING WIDGETCUR' TO ERR-MSG
          methodOut.setErrMsg(CONSTANTS.LITERAL_ERROR_B8_FETCHINGWIDGETCUR);
//  PERFORM 9999-SQL-ERR-CHK THRU 9999-EXIT
          sqlErrChk(programCtx.getSqlErrChkInCtx());/*9999-SQL-ERR-CHK*/
      
      return methodOut;
      }
      /**
      * sqlmain 
      *   This method is derived from 
  *   COBOL Paragraph - 2000-SQLMAIN COBOL Cyclomatic complexity - 1
      * Input  :  

      * - widgetNum                      COBOL Name: WIDGET-NUM
      * - widgetColor                    COBOL Name: WIDGET-COLOR
      *
      * Output : None 

      * @throws CFException
      */
      @Override
      public void sqlmain(SqlmainInCtx methodIn) throws Exception {
      
// *-----------------------------------------------------------------
CfwidgetCtx programCtx = methodIn.getCfwidgetCtx();
//  PERFORM 1200-FETCH-CURSOR THRU 1200-EXIT
          fetchCursor(programCtx);/*1200-FETCH-CURSOR*/
//  DISPLAY '--> ' WIDGET-NUM ' : ' WIDGET-COLOR
          logger.info("--> {} : {}", new String(methodIn.getWidgetNum()), new String(methodIn.getWidgetColor())); 
      
      }
      /**
      * housekeeping 
      *   This method is derived from 
  *   COBOL Paragraph - 3000-HOUSEKEEPING COBOL Cyclomatic complexity - 1
      * Input  : None 

      * Output :  

      * - errLoc                         COBOL Name: ERR-LOC
      *
      * @throws CFException
      */
      @Override
      public HousekeepingOutCtx housekeeping(CfwidgetCtx programCtx) throws Exception {
      
// *-----------------------------------------------------------------

// * Write footer record and close the report file

// *
HousekeepingOutCtx methodOut = programCtx.getHousekeepingOutCtx();
          // MOVE '3000-HOUSEKEEPING' TO ERR-LOC
          methodOut.setErrLoc(CONSTANTS.LITERAL_3000_MN_HOUSEKEEPING_B3_);
      
      return methodOut;
      }
      /**
      * sqlErrChk 
      *   This method is derived from 
  *   COBOL Paragraph - 9999-SQL-ERR-CHK COBOL Cyclomatic complexity - 5
      * Input  :  

      * - sqlcode                        COBOL Name: SQLCODE
      * - errPgm                         COBOL Name: ERR-PGM
      * - errLoc                         COBOL Name: ERR-LOC
      * - errMsg                         COBOL Name: ERR-MSG
      *
      * Output :  

      * - errCode                        COBOL Name: ERR-CODE
      * - sqlcode                        COBOL Name: SQLCODE
      * - eofFlag                        COBOL Name: EOF-FLAG
      *
      * @throws CFException
      */
      @Override
      public SqlErrChkOutCtx sqlErrChk(SqlErrChkInCtx methodIn) throws Exception {
      
// *-----------------------------------------------------------------
// *-----------------------------------------------------------------
CfwidgetCtx programCtx = methodIn.getCfwidgetCtx();
SqlErrChkOutCtx methodOut = methodIn.getSqlErrChkOutCtx();
          // MOVE SQLCODE TO ERR-CODE
          methodOut.setErrCode(methodOut.getSqlcode());
//  EVALUATE TRUE
          if  (	( methodOut.getSqlcode() == 0 )) { 
              ;
          }
          else if  (	( methodOut.getSqlcode() == 100 )) { 
              // MOVE 'Y' TO EOF-FLAG
              //  LITERAL_Y = 'Y'
              methodOut.setEofFlag(CONSTANTS.LITERAL_Y);
          }
          else   { 
//  DISPLAY '---SQL ERROR---'
              logger.info("---SQL ERROR---"); 
//  DISPLAY 'PROG: ' ERR-PGM
              logger.info("PROG: {}", new String(methodIn.getErrPgm())); 
//  DISPLAY '  IN: ' ERR-LOC
              logger.info("  IN: {}", new String(methodIn.getErrLoc())); 
//  DISPLAY ' MSG: ' ERR-MSG
              logger.info(" MSG: {}", new String(methodIn.getErrMsg())); 
//  DISPLAY 'CODE: ' ERR-CODE
              logger.info("CODE: {}", String.valueOf(methodIn.getWork().getErrCodeString())); 
//  STOP RUN
              throw Terminate.TERMINATE;
          }
      
      return methodOut;
      }
  
  
  
  
  
  
  
  
  }
