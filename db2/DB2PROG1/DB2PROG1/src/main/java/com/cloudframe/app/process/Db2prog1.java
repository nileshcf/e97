  package com.cloudframe.app.process;
  /* 
*------------------------
*------------------------
*---------------------
*/
  
  import org.springframework.web.bind.annotation.GetMapping;
  import org.slf4j.Logger;
  import org.slf4j.LoggerFactory;
  import com.cloudframe.app.exception.CFException;
  import org.springframework.stereotype.Component;
  import org.springframework.web.bind.annotation.RestController;
  import com.cloudframe.app.process.Db2prog2;
  import org.springframework.beans.factory.annotation.Autowired;
  import org.springframework.beans.factory.annotation.Qualifier;
  import com.cloudframe.app.exception.Terminate;
  import com.cloudframe.app.repository.Db2prog1Repository;
  import com.cloudframe.app.db2prog1.dto.BooksTitle;
  import java.math.BigDecimal;
  import com.cloudframe.app.utility.CFUtil;
  import com.cloudframe.app.db2prog1.dto.*;
  import com.cloudframe.app.db2prog1.dto.Sqlca;
  import com.cloudframe.app.db2prog1.dto.Tbwidget;
  import com.cloudframe.app.db2prog1.dto.Dclbooks;
  import com.cloudframe.app.db2prog1.dto.Work;
  import com.cloudframe.app.common.CONSTANTS;
  import com.cloudframe.app.common.SQLS;
  import org.springframework.beans.factory.annotation.Value;
  import com.cloudframe.app.dao.Db2Base;
  import java.sql.SQLException;
  
  @Component("db2prog1")
  
  public class Db2prog1 extends CommonProcess {
  
  Logger logger = LoggerFactory.getLogger(Db2prog1.class);
  
  private Sqlca sqlca = new Sqlca() ;
  private Tbwidget tbwidget = new Tbwidget() ;
  private Dclbooks dclbooks = new Dclbooks() ;
  private Work work = new Work() ;
  
  @Value("${DB2PROG1.dbQualifier:}")
  private String dbQualifier;
  
  
  @Autowired 
  @Qualifier("db2prog2")
  Db2prog2 db2prog2;
  @Autowired 
  @Qualifier("db2prog1Repository")
  Db2prog1Repository db2prog1Repository;
  
  
  
  
  
  
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
  *   COBOL Paragraph - 0000-MAIN COBOL Cyclomatic complexity - 4
      * Input  :  

      * - i                              COBOL Name: WS-I
      *
      * Output :  

      * - i                              COBOL Name: WS-I
      * - rc                             COBOL Name: RETURN-CODE
      *
      * @throws CFException
      */
      private void main() throws Exception {
//  PERFORM VARYING WS-I FROM 1 BY 1 UNTIL WS-I > 2
          for (work.setI(1); (	( work.getI() <= 2 ) ) ; work.setI(work.getI() + 1) ) {
//  PERFORM 1000-PROCESS THRU 1000-EXIT
              process1000();/*1000-PROCESS*/
              if (this.isProgramEnded()) {
                  return ;
              }

// *
//  DISPLAY ' '
              logger.info(" "); 
//  DISPLAY '>>>>>> CALLING DB2PROG2 >>>>>>'
              logger.info(">>>>>> CALLING DB2PROG2 >>>>>>"); 
//  DISPLAY ' '
              logger.info(" "); 
//  CALL WS-DB2PROG2
              // CALL WS-DB2PROG2
              	this.setRc( db2prog2.process());
//  DISPLAY ' '
              logger.info(" "); 
//  DISPLAY '<<<<<< EXITING DB2PROG2 <<<<<<'
              logger.info("<<<<<< EXITING DB2PROG2 <<<<<<"); 
//  DISPLAY ' '
              logger.info(" "); 
          }

// *

// *-----------------------------------------------------------------
//  STOP RUN
          throw Terminate.TERMINATE;
      
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
      private void process1000() throws Exception {
			// Declare local variables used in the method
			BooksTitle booksTitle = dclbooks.getBooksTitle();
			int sqlcode = 0;
			// End of variable declaration

//  DISPLAY '*-------------------------------------------------*'
          logger.info("*-------------------------------------------------*"); 
//  DISPLAY ' IN DB2PROG1'
          logger.info(" IN DB2PROG1"); 
//  DISPLAY ' '
          logger.info(" "); 
//  DISPLAY 'Current Qualfier= CLOUDFRM'
          logger.info("Current Qualfier= CLOUDFRM"); 

// *
          // MOVE 1 TO BOOKS-BOOK-ID
          dclbooks.setBooksBookId(1);
//  SELECT RTRIM ( TITLE ) FROM BOOKS WHERE BOOK_ID = ?
          db2prog1Repository.selectBooks(dclbooks,sqlca);
  
          sqlcode = sqlca.getSqlcode();
//  IF SQLCODE = 0 THEN
          if (	( sqlcode == 0 )) { 
//  DISPLAY 'BOOK TITLE = ' BOOKS-TITLE-TEXT (1 : BOOKS-TITLE-LEN )
              logger.info("BOOK TITLE = {}", new String(substring(dclbooks.getBooksTitle().getBooksTitleText(),0,dclbooks.getBooksTitle().getBooksTitleLen()))); 
//  DISPLAY ' '
              logger.info(" "); 
          }
  
//  ELSE
          else { 
//  PERFORM 9000-CHECK-SQLCODE THRU 9000-EXIT
              checkSqlcode();/*9000-CHECK-SQLCODE*/
              if (this.isProgramEnded()) {
                  return ;
              }
          }
//  PERFORM 1001-INSERT-WIDGETS THRU 1001-EXIT
          insertWidgets();/*1001-INSERT-WIDGETS*/

// *
//  PERFORM 1002-UPDATE-WIDGETS THRU 1002-EXIT
          updateWidgets();/*1002-UPDATE-WIDGETS*/

// *
//  PERFORM 1003-PRINT-WIDGETS THRU 1003-EXIT
          printWidgets();/*1003-PRINT-WIDGETS*/

// *
//  PERFORM 1004-DELETE-WIDGETS THRU 1004-EXIT
          deleteWidgets();/*1004-DELETE-WIDGETS*/

// *

// *

// *
//  DISPLAY '*-------------------------------------------------*'
          logger.info("*-------------------------------------------------*"); 
          ;
      
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
      private void insertWidgets() throws Exception {
      
// *-----------------------------------------------------------------
          // MOVE '90000009' TO WIDGET-NUM
          //  LITERAL_90000009 = '90000009'
          tbwidget.setWidgetNum(CONSTANTS.LITERAL_90000009);
//  MOVE 'BLACK' TO WIDGET-COLOR
          tbwidget.setWidgetColor(CONSTANTS.LITERAL_BLACK_B_);
//  MOVE 'L' TO WIDGET-SIZE
//  LITERAL_L = 'L'
          tbwidget.setWidgetSize(CONSTANTS.LITERAL_L);
//  MOVE 225.54 TO WIDGET-PRICE
          tbwidget.setWidgetPrice(BigDecimal.valueOf(225.54).setScale(2));
//  MOVE '*NOSUPP*' TO WIDGET-SUPPLIER
//  LITERAL_STR2_NOSUPP = '*NOSUPP*'
          tbwidget.setWidgetSupplier(CONSTANTS.LITERAL_STR2_NOSUPP);
//  MOVE '*NODESC*' TO WIDGET-DESC
          tbwidget.setWidgetDesc(CONSTANTS.LITERAL_STR2_NODESCB12_);
//  MOVE 'CF' TO WIDGET-MANU-PLANT
          tbwidget.setWidgetManuPlant(CONSTANTS.LITERAL_CF_B6_);
//  MOVE 100.23 TO WIDGET-MANU-COST
          tbwidget.setWidgetManuCost(BigDecimal.valueOf(100.23).setScale(2));
//  MOVE 5 TO WIDGET-LEAD-TIME
          tbwidget.setWidgetLeadTime((short)5);
//  INSERT INTO "TBWIDGET" ( "WIDGET_NUM" , "WIDGET_COLOR" , "WIDGET_SIZE" , "WIDGET_PRICE" , "WIDGET_SUPPLIER" , "WIDGET_DESC" , "WIDGET_MANU_PLANT" , "WIDGET_MANU_COST" , "WIDGET_LEAD_TIME" ) VALUES ( ? , ? , ? , ? , ? , ? , ? , ? , ? )
          db2prog1Repository.insertTbwidget(sqlca,tbwidget);
          // MOVE SQLCODE TO SQLCODE-DISP
          //  FORMAT1016704244 = "-999"
          work.setSqlcodeDisp(CFUtil.cobolNumberFormatter(CONSTANTS.FORMAT1016704244,String.valueOf(sqlca.getSqlcode()).toCharArray()));
//  EVALUATE SQLCODE
          switch(sqlca.getSqlcode()){
          	case 0:
//  DISPLAY 'INSERT SUCCESSFUL: WIDGET = ' WIDGET-NUM
              logger.info("INSERT SUCCESSFUL: WIDGET = {}", new String(tbwidget.getWidgetNum())); 
//  COMMIT
              try {
              	// COMMIT
              	// reset SQLCODE
              	sqlca.setSqlcode(0);
                 // execute jdbc commit
                 db2Base.commit();
              }
               catch (SQLException e) {
                         sqlca.setSqlcode(Db2Base.fillSQLCode(e.getMessage()));
                     }
               catch(Exception e) {
                 handleErrorCode(e);
              }
//  PERFORM 1005-SELECT-WIDGET THRU 1005-EXIT
              selectWidget();/*1005-SELECT-WIDGET*/
          break;
          	case -803:
//  DISPLAY 'DUPLICATE INSERT : WIDGET = ' WIDGET-NUM
              logger.info("DUPLICATE INSERT : WIDGET = {}", new String(tbwidget.getWidgetNum())); 
          break;
          default :
//  DISPLAY 'INSERT FAILED : SQLCODE = ' SQLCODE-DISP
              logger.info("INSERT FAILED : SQLCODE = {}", new String(work.getSqlcodeDisp())); 
          }
          ;
      
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
      private void updateWidgets() throws Exception {
          // MOVE '90000009' TO WIDGET-NUM
          //  LITERAL_90000009 = '90000009'
          tbwidget.setWidgetNum(CONSTANTS.LITERAL_90000009);
//  MOVE 'BLUE' TO WIDGET-COLOR
          tbwidget.setWidgetColor(CONSTANTS.LITERAL_BLUE_B2_);
//  MOVE 'X' TO WIDGET-SIZE
//  LITERAL_X = 'X'
          tbwidget.setWidgetSize(CONSTANTS.LITERAL_X);
//  MOVE 253.25 TO WIDGET-PRICE
          tbwidget.setWidgetPrice(BigDecimal.valueOf(253.25).setScale(2));
//  MOVE 'CLOUDFRM' TO WIDGET-SUPPLIER
//  LITERAL_CLOUDFRM = 'CLOUDFRM'
          tbwidget.setWidgetSupplier(CONSTANTS.LITERAL_CLOUDFRM);
//  MOVE 'CFWIDGET' TO WIDGET-DESC
          tbwidget.setWidgetDesc(CONSTANTS.LITERAL_CFWIDGET_B12_);
//  UPDATE TBWIDGET SET "WIDGET_COLOR" = ? , "WIDGET_SIZE" = ? , "WIDGET_PRICE" = ? , "WIDGET_SUPPLIER" = ? , "WIDGET_DESC" = ? WHERE WIDGET_NUM = ?
          db2prog1Repository.updateTbwidget(sqlca,tbwidget);
          // MOVE SQLCODE TO SQLCODE-DISP
          //  FORMAT1016704244 = "-999"
          work.setSqlcodeDisp(CFUtil.cobolNumberFormatter(CONSTANTS.FORMAT1016704244,String.valueOf(sqlca.getSqlcode()).toCharArray()));
//  EVALUATE SQLCODE
          switch(sqlca.getSqlcode()){
          	case 0:
//  DISPLAY 'UPDATE SUCCESSFUL: WIDGET = ' WIDGET-NUM
              logger.info("UPDATE SUCCESSFUL: WIDGET = {}", new String(tbwidget.getWidgetNum())); 
//  COMMIT
              try {
              	// COMMIT
              	// reset SQLCODE
              	sqlca.setSqlcode(0);
                 // execute jdbc commit
                 db2Base.commit();
              }
               catch (SQLException e) {
                         sqlca.setSqlcode(Db2Base.fillSQLCode(e.getMessage()));
                     }
               catch(Exception e) {
                 handleErrorCode(e);
              }
//  PERFORM 1005-SELECT-WIDGET THRU 1005-EXIT
              selectWidget();/*1005-SELECT-WIDGET*/
          break;
          default :
//  DISPLAY 'INSERT FAILED : SQLCODE = ' SQLCODE-DISP
              logger.info("INSERT FAILED : SQLCODE = {}", new String(work.getSqlcodeDisp())); 
          }
          ;
      
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
      private void printWidgets() throws Exception {
			// Declare local variables used in the method
			int sqlcode = 0;
			// End of variable declaration

//  DISPLAY '************* PRINT ALL WIDGETS ****************'
          logger.info("************* PRINT ALL WIDGETS ****************"); 
//  SELECT WIDGET_NUM , WIDGET_COLOR , WIDGET_SIZE , WIDGET_PRICE , WIDGET_SUPPLIER , WIDGET_DESC , WIDGET_MANU_PLANT , WIDGET_MANU_COST , WIDGET_LEAD_TIME FROM TBWIDGET ORDER BY WIDGET_NUM FOR FETCH ONLY
          db2prog1Repository.openWidgetDb2prog1(sqlca);
          // MOVE SQLCODE TO SQLCODE-DISP
          //  FORMAT1016704244 = "-999"
          work.setSqlcodeDisp(CFUtil.cobolNumberFormatter(CONSTANTS.FORMAT1016704244,String.valueOf(sqlca.getSqlcode()).toCharArray()));
          sqlcode = sqlca.getSqlcode();
//  IF SQLCODE = 0 THEN
          if (	( sqlcode == 0 )) { 
//  DISPLAY 'OPEN CURSOR SUCCESSFUL'
              logger.info("OPEN CURSOR SUCCESSFUL"); 
          }
  
//  ELSE
          else { 
//  DISPLAY 'OPEN CURSOR FAILED : SQLCODE = ' SQLCODE-DISP
              logger.info("OPEN CURSOR FAILED : SQLCODE = {}", new String(work.getSqlcodeDisp())); 
//cobolCode::GO TO 1003-EXIT
return ;
//cobolCodeEnds::GO TO 1003-EXIT
          }
//  PERFORM UNTIL SQLCODE NOT = 0
          while ((	( sqlca.getSqlcode() == 0 ))) {
//  FETCH WIDGET INTO ? , ? , ? , ? , ? , ? , ? , ? , ?
              db2prog1Repository.fetchWidgetDb2prog1(sqlca,tbwidget);
              // MOVE SQLCODE TO SQLCODE-DISP
              //  FORMAT1016704244 = "-999"
              work.setSqlcodeDisp(CFUtil.cobolNumberFormatter(CONSTANTS.FORMAT1016704244,String.valueOf(sqlca.getSqlcode()).toCharArray()));

// *
//  EVALUATE SQLCODE
              switch(sqlca.getSqlcode()){
              	case 0:
//  DISPLAY WIDGET-NUM ' * ' WIDGET-COLOR ' * ' WIDGET-SIZE ' * ' WIDGET-PRICE ' * ' WIDGET-SUPPLIER ' * ' WIDGET-DESC ' * ' WIDGET-MANU-PLANT ' * ' WIDGET-MANU-COST ' * ' WIDGET-LEAD-TIME
                  logger.info("{} * {} * {} * {} * {} * {} * {} * {} * {}", new String(tbwidget.getWidgetNum()), new String(tbwidget.getWidgetColor()), new String(tbwidget.getWidgetSize()), String.valueOf(tbwidget.getWidgetPrice().movePointRight(2)), new String(tbwidget.getWidgetSupplier()), new String(tbwidget.getWidgetDesc()), new String(tbwidget.getWidgetManuPlant()), String.valueOf(tbwidget.getWidgetManuCost().movePointRight(2)), String.valueOf(tbwidget.getWidgetLeadTime())); 
              break;
              	case 100:
//  DISPLAY '*** END OF DATA ***'
                  logger.info("*** END OF DATA ***"); 
              break;
              default :
//  DISPLAY 'FETCH CURSOR FAILED : SQLCODE = ' SQLCODE-DISP
                  logger.info("FETCH CURSOR FAILED : SQLCODE = {}", new String(work.getSqlcodeDisp())); 
              }
          }
//  CLOSE WIDGET
          db2prog1Repository.closeWidgetDb2prog1(sqlca);
          // MOVE SQLCODE TO SQLCODE-DISP
          //  FORMAT1016704244 = "-999"
          work.setSqlcodeDisp(CFUtil.cobolNumberFormatter(CONSTANTS.FORMAT1016704244,String.valueOf(sqlca.getSqlcode()).toCharArray()));

// *
          sqlcode = sqlca.getSqlcode();
//  IF SQLCODE = 0 THEN
          if (	( sqlcode == 0 )) { 
//  DISPLAY 'CLOSE CURSOR SUCCESSFUL'
              logger.info("CLOSE CURSOR SUCCESSFUL"); 
          }
  
//  ELSE
          else { 
//  DISPLAY 'CLOSE CURSOR FAILED : SQLCODE = ' SQLCODE-DISP
              logger.info("CLOSE CURSOR FAILED : SQLCODE = {}", new String(work.getSqlcodeDisp())); 
          }
          ;
      
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
      private void deleteWidgets() throws Exception {
          // MOVE '90000009' TO WIDGET-NUM
          //  LITERAL_90000009 = '90000009'
          tbwidget.setWidgetNum(CONSTANTS.LITERAL_90000009);
//  DELETE FROM TBWIDGET WHERE WIDGET_NUM = ?
          db2prog1Repository.deleteTbwidget(sqlca,tbwidget);
          // MOVE SQLCODE TO SQLCODE-DISP
          //  FORMAT1016704244 = "-999"
          work.setSqlcodeDisp(CFUtil.cobolNumberFormatter(CONSTANTS.FORMAT1016704244,String.valueOf(sqlca.getSqlcode()).toCharArray()));
//  EVALUATE SQLCODE
          switch(sqlca.getSqlcode()){
          	case 0:
//  DISPLAY 'DELETE SUCCESSFUL: WIDGET = ' WIDGET-NUM
              logger.info("DELETE SUCCESSFUL: WIDGET = {}", new String(tbwidget.getWidgetNum())); 
//  COMMIT
              try {
              	// COMMIT
              	// reset SQLCODE
              	sqlca.setSqlcode(0);
                 // execute jdbc commit
                 db2Base.commit();
              }
               catch (SQLException e) {
                         sqlca.setSqlcode(Db2Base.fillSQLCode(e.getMessage()));
                     }
               catch(Exception e) {
                 handleErrorCode(e);
              }
//  PERFORM 1005-SELECT-WIDGET THRU 1005-EXIT
              selectWidget();/*1005-SELECT-WIDGET*/
          break;
          default :
//  DISPLAY 'DELETE FAILED : SQLCODE = ' SQLCODE-DISP
              logger.info("DELETE FAILED : SQLCODE = {}", new String(work.getSqlcodeDisp())); 
          }
          ;
      
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
      private void selectWidget() throws Exception {
          // MOVE '90000009' TO WIDGET-NUM
          //  LITERAL_90000009 = '90000009'
          tbwidget.setWidgetNum(CONSTANTS.LITERAL_90000009);
//  SELECT WIDGET_NUM , WIDGET_COLOR , WIDGET_SIZE , WIDGET_PRICE , WIDGET_SUPPLIER , WIDGET_DESC , WIDGET_MANU_PLANT , WIDGET_MANU_COST , WIDGET_LEAD_TIME FROM TBWIDGET WHERE WIDGET_NUM = ?
          db2prog1Repository.selectTbwidget(sqlca,tbwidget);
          // MOVE SQLCODE TO SQLCODE-DISP
          //  FORMAT1016704244 = "-999"
          work.setSqlcodeDisp(CFUtil.cobolNumberFormatter(CONSTANTS.FORMAT1016704244,String.valueOf(sqlca.getSqlcode()).toCharArray()));
//  EVALUATE SQLCODE
          switch(sqlca.getSqlcode()){
          	case 0:
//  DISPLAY 'SELECT SUCCESSFUL: WIDGET      = ' WIDGET-NUM
              logger.info("SELECT SUCCESSFUL: WIDGET      = {}", new String(tbwidget.getWidgetNum())); 
//  DISPLAY '                   COLOR       = ' WIDGET-COLOR
              logger.info("                   COLOR       = {}", new String(tbwidget.getWidgetColor())); 
//  DISPLAY '                   SIZE        = ' WIDGET-SIZE
              logger.info("                   SIZE        = {}", new String(tbwidget.getWidgetSize())); 
//  DISPLAY '                   PRICE       = ' WIDGET-PRICE
              logger.info("                   PRICE       = {}", String.valueOf(tbwidget.getWidgetPrice().movePointRight(2))); 
//  DISPLAY '                   SUPPLIER    = ' WIDGET-SUPPLIER
              logger.info("                   SUPPLIER    = {}", new String(tbwidget.getWidgetSupplier())); 
//  DISPLAY '                   DESC        = ' WIDGET-DESC
              logger.info("                   DESC        = {}", new String(tbwidget.getWidgetDesc())); 
//  DISPLAY '                   MANU-PLANT  = ' WIDGET-MANU-PLANT
              logger.info("                   MANU-PLANT  = {}", new String(tbwidget.getWidgetManuPlant())); 
//  DISPLAY '                   MANU-COST   = ' WIDGET-MANU-COST
              logger.info("                   MANU-COST   = {}", String.valueOf(tbwidget.getWidgetManuCost().movePointRight(2))); 
//  DISPLAY '                   LEAD-TIME   = ' WIDGET-LEAD-TIME
              logger.info("                   LEAD-TIME   = {}", String.valueOf(tbwidget.getWidgetLeadTime())); 
          break;
          default :
//  DISPLAY 'SELECT FAILED : SQLCODE = ' SQLCODE-DISP
              logger.info("SELECT FAILED : SQLCODE = {}", new String(work.getSqlcodeDisp())); 
          }
          ;
      
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
      private void checkSqlcode() throws Exception {
			// Declare local variables used in the method
			int sqlcode = 0;
			// End of variable declaration

      
// *-----------------------------------------------------------------
          sqlcode = sqlca.getSqlcode();
//  EVALUATE TRUE
          if  (	( sqlcode == 0 )) { 
              ;
          }
          else   { 
              // MOVE SQLCODE TO SQLCODE-DISP
              //  FORMAT1016704244 = "-999"
              work.setSqlcodeDisp(CFUtil.cobolNumberFormatter(CONSTANTS.FORMAT1016704244,String.valueOf(sqlca.getSqlcode()).toCharArray()));
//  DISPLAY '---SQL ERROR---'
              logger.info("---SQL ERROR---"); 
//  DISPLAY 'SQLCODE  = ' SQLCODE-DISP
              logger.info("SQLCODE  = {}", new String(work.getSqlcodeDisp())); 
//  STOP RUN
              throw Terminate.TERMINATE;
          }
  
      
      }
  
  
      /**
* This method pre-initializes variables consistent with
* what a mainframe program would have done at the start of a program
*/
      @Override
      public void initVars() throws CFException {
      setProgramEnded(false);
          db2Base.reset("DB2PROG1" ,dbQualifier, true/*use Dynamic SQL*/);
          if(!isInitDone()) {
          	this.setRc(0);
          	setInitDone(true);
          }
        CFUtil.resetDecimalAsComma();
       }
  
  
  
  
  
  
  }
