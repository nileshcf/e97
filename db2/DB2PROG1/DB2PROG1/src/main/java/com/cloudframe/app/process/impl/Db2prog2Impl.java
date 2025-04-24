  package com.cloudframe.app.process.impl;
  /* 
*------------------------
*------------------------
*---------------------
*/
  
  import com.cloudframe.app.db2prog2.Db2prog2Ctx.*;
  import com.cloudframe.app.db2prog2.Db2prog2Ctx;
  import com.cloudframe.app.process.Db2prog2;
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
  import com.cloudframe.app.repository.Db2prog2Repository;
  import java.math.BigDecimal;
  import com.cloudframe.app.utility.CFUtil;
  import com.cloudframe.app.db2prog2.dto.*;
  import com.cloudframe.app.db2prog2.dto.Sqlca;
  import com.cloudframe.app.db2prog2.dto.Tbwidget;
  import com.cloudframe.app.db2prog2.dto.Dclbooks;
  import com.cloudframe.app.db2prog2.dto.Work;
  import com.cloudframe.app.common.CONSTANTS;
  import com.cloudframe.app.common.SQLS;
  import org.springframework.beans.factory.annotation.Value;
  import com.cloudframe.app.dao.Db2Base;
  import java.sql.SQLException;
  
  @Component("db2prog2")
  
  public class Db2prog2Impl extends CommonProcess implements Db2prog2 {
  
  Logger logger = LoggerFactory.getLogger(Db2prog2Impl.class);
  
  
  @Value("${DB2PROG2.dbQualifier:}")
  private String dbQualifier;
  
  
  @Autowired 
  @Qualifier("db2prog2Repository")
  Db2prog2Repository db2prog2Repository;
  
  
  
  
  
  
      /**
      * process 
      * Input  : None 

      * Output : None 

      * @throws CFException
      */
      public int process(Db2prog2Ctx programCtx) throws Exception {
       try {
       setCodePage("1047");
            // Reset program ended flag
           programCtx.setProgramEnded(false);
      	db2Base.reset("DB2PROG2" ,dbQualifier, true/*use Dynamic SQL*/);
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
      public void main(Db2prog2Ctx programCtx) throws Exception {
//  PERFORM 1000-PROCESS THRU 1000-EXIT
          process1000(programCtx.getProcess1000InCtx());/*1000-PROCESS*/
          if (programCtx.isProgramEnded()) {
              return ;
          }

// *

// *-----------------------------------------------------------------
//  GOBACK
          setNotLogged(false); // no need to log, it is a normal termination
          programCtx.setProgramEnded(true);
          return ;
      
      }
      /**
      * process1000 
      *   This method is derived from 
  *   COBOL Paragraph - 1000-PROCESS COBOL Cyclomatic complexity - 3
      * Input  :  

      * - sqlcode                        COBOL Name: SQLCODE
      * - booksTitleText                 COBOL Name: BOOKS-TITLE-TEXT
      *
      * Output :  

      * - booksBookId                    COBOL Name: BOOKS-BOOK-ID
      *
      * @throws CFException
      */
      @Override
      public Process1000OutCtx process1000(Process1000InCtx methodIn) throws Exception {
Db2prog2Ctx programCtx = methodIn.getDb2prog2Ctx();
Process1000OutCtx methodOut = methodIn.getProcess1000OutCtx();
//  DISPLAY '*-------------------------------------------------*'
          logger.info("*-------------------------------------------------*"); 
//  DISPLAY ' IN DB2PROG2'
          logger.info(" IN DB2PROG2"); 
//  DISPLAY ' '
          logger.info(" "); 
//  DISPLAY 'Current Qualfier= CLOUDFR2'
          logger.info("Current Qualfier= CLOUDFR2"); 

// *
          // MOVE 1 TO BOOKS-BOOK-ID
          methodOut.setBooksBookId(1);
//  SELECT RTRIM ( TITLE ) FROM BOOKS WHERE BOOK_ID = ?
          db2prog2Repository.selectBooks(programCtx.getSqlca(),methodOut.getDclbooks());
//  IF SQLCODE = 0 THEN
          if (	( methodOut.getSqlcode() == 0 )) { 
//  DISPLAY 'BOOK TITLE = ' BOOKS-TITLE-TEXT (1 : BOOKS-TITLE-LEN )
              logger.info("BOOK TITLE = {}", new String(substring(methodIn.getBooksTitleText(),0,methodIn.getBooksTitleLen()))); 
//  DISPLAY ' '
              logger.info(" "); 
          }
//  ELSE
          else { 
//  PERFORM 9000-CHECK-SQLCODE THRU 9000-EXIT
              checkSqlcode(programCtx.getCheckSqlcodeInCtx());/*9000-CHECK-SQLCODE*/
              if (programCtx.isProgramEnded()) {
                  return methodOut;
              }
          }
//  PERFORM 1001-INSERT-WIDGETS THRU 1001-EXIT
          insertWidgets(programCtx.getInsertWidgetsInCtx());/*1001-INSERT-WIDGETS*/

// *
//  PERFORM 1002-UPDATE-WIDGETS THRU 1002-EXIT
          updateWidgets(programCtx.getUpdateWidgetsInCtx());/*1002-UPDATE-WIDGETS*/

// *
//  PERFORM 1003-PRINT-WIDGETS THRU 1003-EXIT
          printWidgets(programCtx.getPrintWidgetsInCtx());/*1003-PRINT-WIDGETS*/

// *
//  PERFORM 1004-DELETE-WIDGETS THRU 1004-EXIT
          deleteWidgets(programCtx.getDeleteWidgetsInCtx());/*1004-DELETE-WIDGETS*/

// *

// *

// *
//  DISPLAY '*-------------------------------------------------*'
          logger.info("*-------------------------------------------------*"); 
          ;
      
      return methodOut;
      }
      /**
      * insertWidgets 
      *   This method is derived from 
  *   COBOL Paragraph - 1001-INSERT-WIDGETS COBOL Cyclomatic complexity - 6
      * Input  :  

      * - sqlcode                        COBOL Name: SQLCODE
      *
      * Output :  

      * - widgetNum                      COBOL Name: WIDGET-NUM
      * - widgetColor                    COBOL Name: WIDGET-COLOR
      * - widgetSize                     COBOL Name: WIDGET-SIZE
      * - widgetPrice                    COBOL Name: WIDGET-PRICE
      * - widgetSupplier                 COBOL Name: WIDGET-SUPPLIER
      * - widgetDesc                     COBOL Name: WIDGET-DESC
      * - widgetManuPlant                COBOL Name: WIDGET-MANU-PLANT
      * - widgetManuCost                 COBOL Name: WIDGET-MANU-COST
      * - widgetLeadTime                 COBOL Name: WIDGET-LEAD-TIME
      * - sqlcodeDisp                    COBOL Name: SQLCODE-DISP
      * - sqlcode                        COBOL Name: SQLCODE
      *
      * @throws CFException
      */
      @Override
      public InsertWidgetsOutCtx insertWidgets(InsertWidgetsInCtx methodIn) throws Exception {
      
// *-----------------------------------------------------------------
Db2prog2Ctx programCtx = methodIn.getDb2prog2Ctx();
InsertWidgetsOutCtx methodOut = methodIn.getInsertWidgetsOutCtx();
          // MOVE '90000009' TO WIDGET-NUM
          //  LITERAL_90000009 = '90000009'
          methodOut.setWidgetNum(CONSTANTS.LITERAL_90000009);
//  MOVE 'BLACK2' TO WIDGET-COLOR
//  LITERAL_BLACK2 = 'BLACK2'
          methodOut.setWidgetColor(CONSTANTS.LITERAL_BLACK2);
//  MOVE 'X' TO WIDGET-SIZE
//  LITERAL_X = 'X'
          methodOut.setWidgetSize(CONSTANTS.LITERAL_X);
//  MOVE 325.54 TO WIDGET-PRICE
          methodOut.setWidgetPrice(BigDecimal.valueOf(325.54).setScale(2));
//  MOVE '*NOSUP2*' TO WIDGET-SUPPLIER
//  LITERAL_STR2_NOSUP2 = '*NOSUP2*'
          methodOut.setWidgetSupplier(CONSTANTS.LITERAL_STR2_NOSUP2);
//  MOVE '*NODES2*' TO WIDGET-DESC
          methodOut.setWidgetDesc(CONSTANTS.LITERAL_STR2_NODES2B12_);
//  MOVE 'CF2' TO WIDGET-MANU-PLANT
          methodOut.setWidgetManuPlant(CONSTANTS.LITERAL_CF2_B5_);
//  MOVE 120.23 TO WIDGET-MANU-COST
          methodOut.setWidgetManuCost(BigDecimal.valueOf(120.23).setScale(2));
//  MOVE 8 TO WIDGET-LEAD-TIME
          methodOut.setWidgetLeadTime((short)8);
//  INSERT INTO TBWIDGET ( WIDGET_NUM , WIDGET_COLOR , WIDGET_SIZE , WIDGET_PRICE , WIDGET_SUPPLIER , WIDGET_DESC , WIDGET_MANU_PLANT , WIDGET_MANU_COST , WIDGET_LEAD_TIME ) VALUES ( ? , ? , ? , ? , ? , ? , ? , ? , ? )
          db2prog2Repository.insertTbwidget(programCtx.getSqlca(),methodIn.getTbwidget());
          // MOVE SQLCODE TO SQLCODE-DISP
          //  FORMAT1016704244 = "-999"
          methodOut.setSqlcodeDisp(CFUtil.cobolNumberFormatter(CONSTANTS.FORMAT1016704244,String.valueOf(methodOut.getSqlcode()).toCharArray()));
//  EVALUATE SQLCODE
          switch(methodOut.getSqlcode()){
          	case 0:
//  DISPLAY 'INSERT SUCCESSFUL: WIDGET = ' WIDGET-NUM
              logger.info("INSERT SUCCESSFUL: WIDGET = {}", new String(methodOut.getWidgetNum())); 
//  COMMIT
              try {
              	// COMMIT
              	// reset SQLCODE
              	methodOut.setSqlcode(0);
                 // execute jdbc commit
                 db2Base.commit();
              }
               catch (SQLException e) {
                         methodOut.setSqlcode(Db2Base.fillSQLCode(e.getMessage()));
                     }
               catch(Exception e) {
                 handleErrorCode(e);
              }
//  PERFORM 1005-SELECT-WIDGET THRU 1005-EXIT
              selectWidget(programCtx.getSelectWidgetInCtx());/*1005-SELECT-WIDGET*/
          break;
          	case -803:
//  DISPLAY 'DUPLICATE INSERT : WIDGET = ' WIDGET-NUM
              logger.info("DUPLICATE INSERT : WIDGET = {}", new String(methodOut.getWidgetNum())); 
          break;
          default :
//  DISPLAY 'INSERT FAILED : SQLCODE = ' SQLCODE-DISP
              logger.info("INSERT FAILED : SQLCODE = {}", new String(methodOut.getSqlcodeDisp())); 
          }
          ;
      
      return methodOut;
      }
      /**
      * updateWidgets 
      *   This method is derived from 
  *   COBOL Paragraph - 1002-UPDATE-WIDGETS COBOL Cyclomatic complexity - 5
      * Input  :  

      * - sqlcode                        COBOL Name: SQLCODE
      *
      * Output :  

      * - widgetNum                      COBOL Name: WIDGET-NUM
      * - widgetColor                    COBOL Name: WIDGET-COLOR
      * - widgetSize                     COBOL Name: WIDGET-SIZE
      * - widgetPrice                    COBOL Name: WIDGET-PRICE
      * - widgetSupplier                 COBOL Name: WIDGET-SUPPLIER
      * - widgetDesc                     COBOL Name: WIDGET-DESC
      * - sqlcodeDisp                    COBOL Name: SQLCODE-DISP
      * - sqlcode                        COBOL Name: SQLCODE
      *
      * @throws CFException
      */
      @Override
      public UpdateWidgetsOutCtx updateWidgets(UpdateWidgetsInCtx methodIn) throws Exception {
Db2prog2Ctx programCtx = methodIn.getDb2prog2Ctx();
UpdateWidgetsOutCtx methodOut = methodIn.getUpdateWidgetsOutCtx();
          // MOVE '90000009' TO WIDGET-NUM
          //  LITERAL_90000009 = '90000009'
          methodOut.setWidgetNum(CONSTANTS.LITERAL_90000009);
//  MOVE 'BLUE2' TO WIDGET-COLOR
          methodOut.setWidgetColor(CONSTANTS.LITERAL_BLUE2_B_);
//  MOVE 'M' TO WIDGET-SIZE
//  LITERAL_M = 'M'
          methodOut.setWidgetSize(CONSTANTS.LITERAL_M);
//  MOVE 529.36 TO WIDGET-PRICE
          methodOut.setWidgetPrice(BigDecimal.valueOf(529.36).setScale(2));
//  MOVE 'CLOUDFR2' TO WIDGET-SUPPLIER
//  LITERAL_CLOUDFR2 = 'CLOUDFR2'
          methodOut.setWidgetSupplier(CONSTANTS.LITERAL_CLOUDFR2);
//  MOVE 'CFWIDGT2' TO WIDGET-DESC
          methodOut.setWidgetDesc(CONSTANTS.LITERAL_CFWIDGT2_B12_);
//  UPDATE TBWIDGET SET WIDGET_COLOR = ? , WIDGET_SIZE = ? , WIDGET_PRICE = ? , WIDGET_SUPPLIER = ? , WIDGET_DESC = ? WHERE WIDGET_NUM = ?
          db2prog2Repository.updateTbwidget(programCtx.getSqlca(),methodIn.getTbwidget());
          // MOVE SQLCODE TO SQLCODE-DISP
          //  FORMAT1016704244 = "-999"
          methodOut.setSqlcodeDisp(CFUtil.cobolNumberFormatter(CONSTANTS.FORMAT1016704244,String.valueOf(methodOut.getSqlcode()).toCharArray()));
//  EVALUATE SQLCODE
          switch(methodOut.getSqlcode()){
          	case 0:
//  DISPLAY 'UPDATE SUCCESSFUL: WIDGET = ' WIDGET-NUM
              logger.info("UPDATE SUCCESSFUL: WIDGET = {}", new String(methodOut.getWidgetNum())); 
//  COMMIT
              try {
              	// COMMIT
              	// reset SQLCODE
              	methodOut.setSqlcode(0);
                 // execute jdbc commit
                 db2Base.commit();
              }
               catch (SQLException e) {
                         methodOut.setSqlcode(Db2Base.fillSQLCode(e.getMessage()));
                     }
               catch(Exception e) {
                 handleErrorCode(e);
              }
//  PERFORM 1005-SELECT-WIDGET THRU 1005-EXIT
              selectWidget(programCtx.getSelectWidgetInCtx());/*1005-SELECT-WIDGET*/
          break;
          default :
//  DISPLAY 'INSERT FAILED : SQLCODE = ' SQLCODE-DISP
              logger.info("INSERT FAILED : SQLCODE = {}", new String(methodOut.getSqlcodeDisp())); 
          }
          ;
      
      return methodOut;
      }
      /**
      * printWidgets 
      *   This method is derived from 
  *   COBOL Paragraph - 1003-PRINT-WIDGETS COBOL Cyclomatic complexity - 10
      * Input  :  

      * - sqlcode                        COBOL Name: SQLCODE
      * - widgetNum                      COBOL Name: WIDGET-NUM
      * - widgetColor                    COBOL Name: WIDGET-COLOR
      * - widgetSize                     COBOL Name: WIDGET-SIZE
      * - widgetPrice                    COBOL Name: WIDGET-PRICE
      * - widgetSupplier                 COBOL Name: WIDGET-SUPPLIER
      * - widgetDesc                     COBOL Name: WIDGET-DESC
      * - widgetManuPlant                COBOL Name: WIDGET-MANU-PLANT
      * - widgetManuCost                 COBOL Name: WIDGET-MANU-COST
      * - widgetLeadTime                 COBOL Name: WIDGET-LEAD-TIME
      *
      * Output :  

      * - sqlcodeDisp                    COBOL Name: SQLCODE-DISP
      * - sqlcode                        COBOL Name: SQLCODE
      *
      * @throws CFException
      */
      @Override
      public PrintWidgetsOutCtx printWidgets(PrintWidgetsInCtx methodIn) throws Exception {
Db2prog2Ctx programCtx = methodIn.getDb2prog2Ctx();
PrintWidgetsOutCtx methodOut = methodIn.getPrintWidgetsOutCtx();
//  DISPLAY '************* PRINT ALL WIDGETS ****************'
          logger.info("************* PRINT ALL WIDGETS ****************"); 
//  SELECT WIDGET_NUM , WIDGET_COLOR , WIDGET_SIZE , WIDGET_PRICE , WIDGET_SUPPLIER , WIDGET_DESC , WIDGET_MANU_PLANT , WIDGET_MANU_COST , WIDGET_LEAD_TIME FROM TBWIDGET ORDER BY WIDGET_NUM FOR FETCH ONLY
          programCtx.setWidgetResultSet(db2prog2Repository.openWidgetDb2prog2(programCtx.getSqlca()));
          // MOVE SQLCODE TO SQLCODE-DISP
          //  FORMAT1016704244 = "-999"
          methodOut.setSqlcodeDisp(CFUtil.cobolNumberFormatter(CONSTANTS.FORMAT1016704244,String.valueOf(methodOut.getSqlcode()).toCharArray()));
//  IF SQLCODE = 0 THEN
          if (	( methodOut.getSqlcode() == 0 )) { 
//  DISPLAY 'OPEN CURSOR SUCCESSFUL'
              logger.info("OPEN CURSOR SUCCESSFUL"); 
          }
//  ELSE
          else { 
//  DISPLAY 'OPEN CURSOR FAILED : SQLCODE = ' SQLCODE-DISP
              logger.info("OPEN CURSOR FAILED : SQLCODE = {}", new String(methodOut.getSqlcodeDisp())); 
//cobolCode::GO TO 1003-EXIT
return methodOut;
//cobolCodeEnds::GO TO 1003-EXIT
          }
//  PERFORM UNTIL SQLCODE NOT = 0
          while ((	( methodOut.getSqlcode() == 0 ))) {
//  FETCH WIDGET INTO ? , ? , ? , ? , ? , ? , ? , ? , ?
              db2prog2Repository.fetchWidgetDb2prog2(programCtx.getWidgetResultSet(),programCtx.getSqlca(),methodOut.getTbwidget());
              // MOVE SQLCODE TO SQLCODE-DISP
              //  FORMAT1016704244 = "-999"
              methodOut.setSqlcodeDisp(CFUtil.cobolNumberFormatter(CONSTANTS.FORMAT1016704244,String.valueOf(methodOut.getSqlcode()).toCharArray()));

// *
//  EVALUATE SQLCODE
              switch(methodOut.getSqlcode()){
              	case 0:
//  DISPLAY WIDGET-NUM ' * ' WIDGET-COLOR ' * ' WIDGET-SIZE ' * ' WIDGET-PRICE ' * ' WIDGET-SUPPLIER ' * ' WIDGET-DESC ' * ' WIDGET-MANU-PLANT ' * ' WIDGET-MANU-COST ' * ' WIDGET-LEAD-TIME
                  logger.info("{} * {} * {} * {} * {} * {} * {} * {} * {}", new String(methodIn.getWidgetNum()), new String(methodIn.getWidgetColor()), new String(methodIn.getWidgetSize()), String.valueOf(methodIn.getWidgetPrice().movePointRight(2)), new String(methodIn.getWidgetSupplier()), new String(methodIn.getWidgetDesc()), new String(methodIn.getWidgetManuPlant()), String.valueOf(methodIn.getWidgetManuCost().movePointRight(2)), String.valueOf(methodIn.getWidgetLeadTime())); 
              break;
              	case 100:
//  DISPLAY '*** END OF DATA ***'
                  logger.info("*** END OF DATA ***"); 
              break;
              default :
//  DISPLAY 'FETCH CURSOR FAILED : SQLCODE = ' SQLCODE-DISP
                  logger.info("FETCH CURSOR FAILED : SQLCODE = {}", new String(methodOut.getSqlcodeDisp())); 
              }
          }
//  CLOSE WIDGET
          db2prog2Repository.closeWidgetDb2prog2(programCtx.getWidgetResultSet(),programCtx.getSqlca());
          // MOVE SQLCODE TO SQLCODE-DISP
          //  FORMAT1016704244 = "-999"
          methodOut.setSqlcodeDisp(CFUtil.cobolNumberFormatter(CONSTANTS.FORMAT1016704244,String.valueOf(methodOut.getSqlcode()).toCharArray()));

// *
//  IF SQLCODE = 0 THEN
          if (	( methodOut.getSqlcode() == 0 )) { 
//  DISPLAY 'CLOSE CURSOR SUCCESSFUL'
              logger.info("CLOSE CURSOR SUCCESSFUL"); 
          }
//  ELSE
          else { 
//  DISPLAY 'CLOSE CURSOR FAILED : SQLCODE = ' SQLCODE-DISP
              logger.info("CLOSE CURSOR FAILED : SQLCODE = {}", new String(methodOut.getSqlcodeDisp())); 
          }
          ;
      
      return methodOut;
      }
      /**
      * deleteWidgets 
      *   This method is derived from 
  *   COBOL Paragraph - 1004-DELETE-WIDGETS COBOL Cyclomatic complexity - 5
      * Input  :  

      * - sqlcode                        COBOL Name: SQLCODE
      *
      * Output :  

      * - widgetNum                      COBOL Name: WIDGET-NUM
      * - sqlcodeDisp                    COBOL Name: SQLCODE-DISP
      * - sqlcode                        COBOL Name: SQLCODE
      *
      * @throws CFException
      */
      @Override
      public DeleteWidgetsOutCtx deleteWidgets(DeleteWidgetsInCtx methodIn) throws Exception {
Db2prog2Ctx programCtx = methodIn.getDb2prog2Ctx();
DeleteWidgetsOutCtx methodOut = methodIn.getDeleteWidgetsOutCtx();
          // MOVE '90000009' TO WIDGET-NUM
          //  LITERAL_90000009 = '90000009'
          methodOut.setWidgetNum(CONSTANTS.LITERAL_90000009);
//  DELETE FROM TBWIDGET WHERE WIDGET_NUM = ?
          db2prog2Repository.deleteTbwidget(programCtx.getSqlca(),methodIn.getTbwidget());
          // MOVE SQLCODE TO SQLCODE-DISP
          //  FORMAT1016704244 = "-999"
          methodOut.setSqlcodeDisp(CFUtil.cobolNumberFormatter(CONSTANTS.FORMAT1016704244,String.valueOf(methodOut.getSqlcode()).toCharArray()));
//  EVALUATE SQLCODE
          switch(methodOut.getSqlcode()){
          	case 0:
//  DISPLAY 'DELETE SUCCESSFUL: WIDGET = ' WIDGET-NUM
              logger.info("DELETE SUCCESSFUL: WIDGET = {}", new String(methodOut.getWidgetNum())); 
//  COMMIT
              try {
              	// COMMIT
              	// reset SQLCODE
              	methodOut.setSqlcode(0);
                 // execute jdbc commit
                 db2Base.commit();
              }
               catch (SQLException e) {
                         methodOut.setSqlcode(Db2Base.fillSQLCode(e.getMessage()));
                     }
               catch(Exception e) {
                 handleErrorCode(e);
              }
//  PERFORM 1005-SELECT-WIDGET THRU 1005-EXIT
              selectWidget(programCtx.getSelectWidgetInCtx());/*1005-SELECT-WIDGET*/
          break;
          default :
//  DISPLAY 'DELETE FAILED : SQLCODE = ' SQLCODE-DISP
              logger.info("DELETE FAILED : SQLCODE = {}", new String(methodOut.getSqlcodeDisp())); 
          }
          ;
      
      return methodOut;
      }
      /**
      * selectWidget 
      *   This method is derived from 
  *   COBOL Paragraph - 1005-SELECT-WIDGET COBOL Cyclomatic complexity - 5
      * Input  :  

      * - sqlcode                        COBOL Name: SQLCODE
      * - widgetColor                    COBOL Name: WIDGET-COLOR
      * - widgetSize                     COBOL Name: WIDGET-SIZE
      * - widgetPrice                    COBOL Name: WIDGET-PRICE
      * - widgetSupplier                 COBOL Name: WIDGET-SUPPLIER
      * - widgetDesc                     COBOL Name: WIDGET-DESC
      * - widgetManuPlant                COBOL Name: WIDGET-MANU-PLANT
      * - widgetManuCost                 COBOL Name: WIDGET-MANU-COST
      * - widgetLeadTime                 COBOL Name: WIDGET-LEAD-TIME
      *
      * Output :  

      * - widgetNum                      COBOL Name: WIDGET-NUM
      * - sqlcodeDisp                    COBOL Name: SQLCODE-DISP
      * - sqlcode                        COBOL Name: SQLCODE
      *
      * @throws CFException
      */
      @Override
      public SelectWidgetOutCtx selectWidget(SelectWidgetInCtx methodIn) throws Exception {
Db2prog2Ctx programCtx = methodIn.getDb2prog2Ctx();
SelectWidgetOutCtx methodOut = methodIn.getSelectWidgetOutCtx();
          // MOVE '90000009' TO WIDGET-NUM
          //  LITERAL_90000009 = '90000009'
          methodOut.setWidgetNum(CONSTANTS.LITERAL_90000009);
//  SELECT WIDGET_NUM , WIDGET_COLOR , WIDGET_SIZE , WIDGET_PRICE , WIDGET_SUPPLIER , WIDGET_DESC , WIDGET_MANU_PLANT , WIDGET_MANU_COST , WIDGET_LEAD_TIME FROM TBWIDGET WHERE WIDGET_NUM = ?
          db2prog2Repository.selectTbwidget(programCtx.getSqlca(),methodOut.getTbwidget());
          // MOVE SQLCODE TO SQLCODE-DISP
          //  FORMAT1016704244 = "-999"
          methodOut.setSqlcodeDisp(CFUtil.cobolNumberFormatter(CONSTANTS.FORMAT1016704244,String.valueOf(methodOut.getSqlcode()).toCharArray()));
//  EVALUATE SQLCODE
          switch(methodOut.getSqlcode()){
          	case 0:
//  DISPLAY 'SELECT SUCCESSFUL: WIDGET      = ' WIDGET-NUM
              logger.info("SELECT SUCCESSFUL: WIDGET      = {}", new String(methodOut.getWidgetNum())); 
//  DISPLAY '                   COLOR       = ' WIDGET-COLOR
              logger.info("                   COLOR       = {}", new String(methodIn.getWidgetColor())); 
//  DISPLAY '                   SIZE        = ' WIDGET-SIZE
              logger.info("                   SIZE        = {}", new String(methodIn.getWidgetSize())); 
//  DISPLAY '                   PRICE       = ' WIDGET-PRICE
              logger.info("                   PRICE       = {}", String.valueOf(methodIn.getWidgetPrice().movePointRight(2))); 
//  DISPLAY '                   SUPPLIER    = ' WIDGET-SUPPLIER
              logger.info("                   SUPPLIER    = {}", new String(methodIn.getWidgetSupplier())); 
//  DISPLAY '                   DESC        = ' WIDGET-DESC
              logger.info("                   DESC        = {}", new String(methodIn.getWidgetDesc())); 
//  DISPLAY '                   MANU-PLANT  = ' WIDGET-MANU-PLANT
              logger.info("                   MANU-PLANT  = {}", new String(methodIn.getWidgetManuPlant())); 
//  DISPLAY '                   MANU-COST   = ' WIDGET-MANU-COST
              logger.info("                   MANU-COST   = {}", String.valueOf(methodIn.getWidgetManuCost().movePointRight(2))); 
//  DISPLAY '                   LEAD-TIME   = ' WIDGET-LEAD-TIME
              logger.info("                   LEAD-TIME   = {}", String.valueOf(methodIn.getWidgetLeadTime())); 
          break;
          default :
//  DISPLAY 'SELECT FAILED : SQLCODE = ' SQLCODE-DISP
              logger.info("SELECT FAILED : SQLCODE = {}", new String(methodOut.getSqlcodeDisp())); 
          }
          ;
      
      return methodOut;
      }
      /**
      * checkSqlcode 
      *   This method is derived from 
  *   COBOL Paragraph - 9000-CHECK-SQLCODE COBOL Cyclomatic complexity - 4
      * Input  :  

      * - sqlcode                        COBOL Name: SQLCODE
      *
      * Output :  

      * - sqlcodeDisp                    COBOL Name: SQLCODE-DISP
      * - sqlcode                        COBOL Name: SQLCODE
      *
      * @throws CFException
      */
      @Override
      public CheckSqlcodeOutCtx checkSqlcode(CheckSqlcodeInCtx methodIn) throws Exception {
      
// *-----------------------------------------------------------------
Db2prog2Ctx programCtx = methodIn.getDb2prog2Ctx();
CheckSqlcodeOutCtx methodOut = methodIn.getCheckSqlcodeOutCtx();
//  EVALUATE TRUE
          if  (	( methodOut.getSqlcode() == 0 )) { 
              ;
          }
          else   { 
              // MOVE SQLCODE TO SQLCODE-DISP
              //  FORMAT1016704244 = "-999"
              methodOut.setSqlcodeDisp(CFUtil.cobolNumberFormatter(CONSTANTS.FORMAT1016704244,String.valueOf(methodOut.getSqlcode()).toCharArray()));
//  DISPLAY '---SQL ERROR---'
              logger.info("---SQL ERROR---"); 
//  DISPLAY 'SQLCODE  = ' SQLCODE-DISP
              logger.info("SQLCODE  = {}", new String(methodOut.getSqlcodeDisp())); 
//  STOP RUN
              throw Terminate.TERMINATE;
          }
      
      return methodOut;
      }
  
  
  
  
  
  
  
  
  }
