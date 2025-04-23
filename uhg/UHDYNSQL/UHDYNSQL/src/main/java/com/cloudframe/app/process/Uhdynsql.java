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
  import com.cloudframe.app.utility.CFUtil;
  import com.cloudframe.app.uhdynsql.file.Scanner;
  import org.springframework.beans.factory.annotation.Autowired;
  import org.springframework.beans.factory.annotation.Qualifier;
  import com.cloudframe.app.uhdynsql.dto.SqlFilterColor1Group;
  import com.cloudframe.app.uhdynsql.dto.SqlFilterColor2Group;
  import com.cloudframe.app.uhdynsql.dto.SqlFilterSupplierGroup;
  import java.util.ArrayList;
  import com.cloudframe.app.data.Field;
  import java.util.Map;
  import java.util.HashMap;
  import com.cloudframe.app.repository.UhdynsqlRepository;
  import com.cloudframe.app.exception.Terminate;
  import com.cloudframe.app.uhdynsql.dto.*;
  import com.cloudframe.app.uhdynsql.dto.Sqlca;
  import com.cloudframe.app.uhdynsql.dto.Tbxmlwgt;
  import com.cloudframe.app.uhdynsql.dto.WqSqlFullClause;
  import com.cloudframe.app.uhdynsql.dto.SqlFilter;
  import com.cloudframe.app.uhdynsql.dto.Sqlda;
  import com.cloudframe.app.uhdynsql.dto.Work;
  import com.cloudframe.app.common.CONSTANTS;
  import com.cloudframe.app.common.SQLS;
  import org.springframework.beans.factory.annotation.Value;
  import com.cloudframe.app.dao.Db2Base;
  import java.sql.SQLException;
  
  @Component("uhdynsql")
  
  public class Uhdynsql extends CommonProcess {
  
  Logger logger = LoggerFactory.getLogger(Uhdynsql.class);
  
  private Sqlca sqlca = new Sqlca() ;
  private Tbxmlwgt tbxmlwgt = new Tbxmlwgt() ;
  private WqSqlFullClause wqSqlFullClause = new WqSqlFullClause() ;
  private SqlFilter sqlFilter = new SqlFilter() ;
  private Sqlda sqlda = new Sqlda() ;
  private Work work = new Work() ;
  
  @Value("${UHDYNSQL.dbQualifier:}")
  private String dbQualifier;
  
  
  @Autowired 
  @Qualifier("db2Base")
  Db2Base db2Base;
  @Autowired 
  @Qualifier("uhdynsqlRepository")
  UhdynsqlRepository uhdynsqlRepository;
  
  
  private boolean doNotSkipPrepareAndOpen = true;
  private boolean doNotSkipFetchAndPrintWidgets = true;
  private boolean doNotSkipFetchWidgets = true;
  private boolean doNotSkipCloseWidgets = true;
  
  
    @Autowired
    @Qualifier("uhdynsql_scanner")
    Scanner scanner;
  
  
  
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
      		if(scanner.hasOpened()) { 
      			scanner.close();
      		}
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
      * Input  :  

      * - wfWidgetsFlag                  COBOL Name: WF-WIDGETS-FLAG
      *
      * Output : None 

      * @throws CFException
      */
      private void main() throws Exception {

// *
//  PERFORM 0010-INITIALIZE THRU 0010-EXIT
          initialize();/*0010-INITIALIZE*/
          if (this.isProgramEnded()) {
              return ;
          }

// *
//  PERFORM 1000-BUILD-SQL THRU 1000-EXIT
          buildSql();/*1000-BUILD-SQL*/
          if (this.isProgramEnded()) {
              return ;
          }

// *
//  PERFORM 2000-PREPARE-AND-OPEN THRU 2000-EXIT
          prepareAndOpen();/*2000-PREPARE-AND-OPEN*/
          if (this.isProgramEnded()) {
              return ;
          }

// *
//  PERFORM 2001-FETCH-AND-PRINT-WIDGETS UNTIL WF-ALL-WIDGETS-FETCHED
          while (!(work.isWfAllWidgetsFetched()) ) {
             fetchAndPrintWidgets();/*2001-FETCH-AND-PRINT-WIDGETS*/
             if (this.isProgramEnded()) {
                 return ;
             }
          }

// *
// *
//cobolCode::GO TO 9999-EXIT-PROGRAM
exitProgram();
 return ;
//cobolCodeEnds::GO TO 9999-EXIT-PROGRAM
      
      }
      /**
      * initialize 
      *   This method is derived from 
  *   COBOL Paragraph - 0010-INITIALIZE COBOL Cyclomatic complexity - 1
      * Input  : None 

      * Output :  

      * - wqSqlFullClause                COBOL Name: WQ-SQL-FULL-CLAUSE
      * - wqSqlSelectClause              COBOL Name: WQ-SQL-SELECT-CLAUSE
      * - wqSqlFromClause                COBOL Name: WQ-SQL-FROM-CLAUSE
      * - wqSqlPredicateClause           COBOL Name: WQ-SQL-PREDICATE-CLAUSE
      * - wfWidgetsFlag                  COBOL Name: WF-WIDGETS-FLAG
      *
      * @throws CFException
      */
      private void initialize() throws Exception {

// *
//  INITIALIZE WQ-SQL-FULL-CLAUSE WQ-SQL-SELECT-CLAUSE WQ-SQL-FROM-CLAUSE WQ-SQL-PREDICATE-CLAUSE
          wqSqlFullClause.initialize();
          work.setWqSqlSelectClause(CONSTANTS.SPACE_200 /* Fill 200 Spaces*/);
          work.setWqSqlFromClause(CONSTANTS.SPACE_50 /* Fill 50 Spaces*/);
          work.setWqSqlPredicateClause(CONSTANTS.SPACE_200 /* Fill 200 Spaces*/);
//  SET WF-START-FETCH-WIDGETS TO TRUE
          work.setWfStartFetchWidgetsTrue(); 
          
          ;
      
      }
      /**
      * buildSql 
      *   This method is derived from 
  *   COBOL Paragraph - 1000-BUILD-SQL COBOL Cyclomatic complexity - 10
      * Input  :  

      * - wqSqlColorPred                 COBOL Name: WQ-SQL-COLOR-PRED
      * - wqSqlSupplierPred              COBOL Name: WQ-SQL-SUPPLIER-PRED
      * - wqSqlOrderByClause             COBOL Name: WQ-SQL-ORDER-BY-CLAUSE
      *
      * Output :  

      * - sqlFilter                      COBOL Name: WS-SQL-FILTER
      * - sqlFilterColor1                COBOL Name: WS-SQL-FILTER-COLOR1
      * - sqlFilterColor2                COBOL Name: WS-SQL-FILTER-COLOR2
      * - sqlFilterSupplier              COBOL Name: WS-SQL-FILTER-SUPPLIER
      * - wqSqlSelectClause              COBOL Name: WQ-SQL-SELECT-CLAUSE
      * - wqSqlFromClause                COBOL Name: WQ-SQL-FROM-CLAUSE
      * - wqSqlPredicateClause           COBOL Name: WQ-SQL-PREDICATE-CLAUSE
      * - wqSqlFullClauseText            COBOL Name: WQ-SQL-FULL-CLAUSE-TEXT
      * - wqSqlFullClauseLen             COBOL Name: WQ-SQL-FULL-CLAUSE-LEN
      *
      * @throws CFException
      */
      private void buildSql() throws Exception {
			// Declare local variables used in the method
			char[] consoleInput = null;
			char[] sqlFilterColor1 = null;
			char[] sqlFilterColor2 = null;
			char[] sqlFilterSupplier = null;
			char[] joinCharArray = null;
			SqlFilterColor1Group sqlFilterColor1Group = sqlFilter.getSqlFilterColor1Group();
			SqlFilterColor2Group sqlFilterColor2Group = sqlFilter.getSqlFilterColor2Group();
			SqlFilterSupplierGroup sqlFilterSupplierGroup = sqlFilter.getSqlFilterSupplierGroup();
			ArrayList<char[]> charArray = new ArrayList<char[]>();
			Map<String,Object> updated = null;
			// End of variable declaration

//  ACCEPT WS-SQL-FILTER
          consoleInput = scanner.nextLine();
          if (!scanner.hasEnded()) {
             sqlFilter.setString(consoleInput);  // read from console and assign
          }
          sqlFilterColor1 = sqlFilterColor1Group.getSqlFilterColor1();
          sqlFilterColor2 = sqlFilterColor2Group.getSqlFilterColor2();
          sqlFilterSupplier = sqlFilterSupplierGroup.getSqlFilterSupplier();
//  IF WS-SQL-FILTER-COLOR1 = ' ' OR WS-SQL-FILTER-COLOR2 = ' ' OR WS-SQL-FILTER-SUPPLIER = ' ' THEN
          if (        ( allSpaces(sqlFilterColor1)   ) ||         ( allSpaces(sqlFilterColor2)   ) ||         ( allSpaces(sqlFilterSupplier)   )) { 
//  DISPLAY 'SQL FILTER VALUES NOT SPECIFIED ON SYSIN!!'
              logger.info("SQL FILTER VALUES NOT SPECIFIED ON SYSIN!!"); 
//cobolCode::GO TO 9999-EXIT-PROGRAM
exitProgram();
 return ;
//cobolCodeEnds::GO TO 9999-EXIT-PROGRAM
          }
  

// *
//  STRING 'SELECT WIDGET_NUM, WIDGET_COLOR, WIDGET_SIZE' ', WIDGET_PRICE, WIDGET_SUPPLIER, WIDGET_DESC' ', WIDGET_MANU_PLANT, WIDGET_MANU_COST' ', WIDGET_LEAD_TIME' ' #' DELIMITED BY SIZE INTO WQ-SQL-SELECT-CLAUSE END-STRING
          charArray = new ArrayList<char[]>();
             charArray.add(CONSTANTS.LITERAL_1832445661);
             charArray.add(CONSTANTS.LITERAL_225636967);
             charArray.add(CONSTANTS.LITERAL_1571420044);
             charArray.add(CONSTANTS.LITERAL_1894985001);
             charArray.add(CONSTANTS.LITERAL_B_HS_);
          joinCharArray = Field.mergeArrays(charArray.get(0),charArray.get(1),charArray.get(2),charArray.get(3),charArray.get(4));
          updated = updateString(work.getWqSqlSelectClause() ,joinCharArray);
          work.setWqSqlSelectClause(  (char[])updated.get("string"));

// *
//  STRING 'FROM TBWIDGET' ' #' DELIMITED BY SIZE INTO WQ-SQL-FROM-CLAUSE END-STRING
          charArray = new ArrayList<char[]>();
             charArray.add(CONSTANTS.LITERAL_FROM_B_TBWIDGET);
             charArray.add(CONSTANTS.LITERAL_B_HS_);
          joinCharArray = Field.mergeArrays(charArray.get(0),charArray.get(1));
          updated = updateString(work.getWqSqlFromClause() ,joinCharArray);
          work.setWqSqlFromClause(  (char[])updated.get("string"));

// *
//  STRING WQ-SQL-COLOR-PRED '#' DELIMITED BY SIZE INTO WQ-SQL-PREDICATE-CLAUSE
          charArray = new ArrayList<char[]>();
             charArray.add(work.getWqSqlColorPred());
             charArray.add(CONSTANTS.LITERAL_HS_);
          joinCharArray = Field.mergeArrays(charArray.get(0),charArray.get(1));
          updated = updateString(work.getWqSqlPredicateClause() ,joinCharArray);
          work.setWqSqlPredicateClause(  (char[])updated.get("string"));
          sqlFilterSupplier = sqlFilterSupplierGroup.getSqlFilterSupplier();
//  IF WS-SQL-FILTER-SUPPLIER > SPACES
          if (             ( isGreaterThanSpaces(sqlFilterSupplier) )) { 
//  STRING WQ-SQL-PREDICATE-CLAUSE DELIMITED BY '#' WQ-SQL-SUPPLIER-PRED '#' DELIMITED BY SIZE INTO WQ-SQL-PREDICATE-CLAUSE
              charArray = new ArrayList<char[]>();
                 charArray.add(splitFirst( work.getWqSqlPredicateClause() , CONSTANTS.LITERAL_HS_ ) );
                 charArray.add(work.getWqSqlSupplierPred());
                 charArray.add(CONSTANTS.LITERAL_HS_);
              joinCharArray = Field.mergeArrays(charArray.get(0),charArray.get(1),charArray.get(2));
              updated = updateString(work.getWqSqlPredicateClause() ,joinCharArray);
              work.setWqSqlPredicateClause(  (char[])updated.get("string"));
          }
  

// *
// *
//  STRING WQ-SQL-SELECT-CLAUSE WQ-SQL-FROM-CLAUSE DELIMITED BY '#' WQ-SQL-PREDICATE-CLAUSE DELIMITED BY '#' WQ-SQL-ORDER-BY-CLAUSE DELIMITED BY SIZE INTO WQ-SQL-FULL-CLAUSE-TEXT
          charArray = new ArrayList<char[]>();
             charArray.add(splitFirst( work.getWqSqlSelectClause() , CONSTANTS.LITERAL_HS_ ) );
             charArray.add(splitFirst( work.getWqSqlFromClause() , CONSTANTS.LITERAL_HS_ ) );
             charArray.add(splitFirst( work.getWqSqlPredicateClause() , CONSTANTS.LITERAL_HS_ ) );
             charArray.add(work.getWqSqlOrderByClause());
          joinCharArray = Field.mergeArrays(charArray.get(0),charArray.get(1),charArray.get(2),charArray.get(3));
          updated = updateString(wqSqlFullClause.getWqSqlFullClauseText() ,joinCharArray);
          wqSqlFullClause.setWqSqlFullClauseText(  (char[])updated.get("string"));

// *

// *
//  MOVE 7000 TO WQ-SQL-FULL-CLAUSE-LEN
          wqSqlFullClause.setWqSqlFullClauseLen((short)7000);
//  DISPLAY 'SQL : '
          logger.info("SQL : "); 
//  DISPLAY '      ' WQ-SQL-FULL-CLAUSE-TEXT (1 : 100)
          logger.info("      {}", new String(substring(wqSqlFullClause.getWqSqlFullClauseText(),0,100))); 
//  DISPLAY '      ' WQ-SQL-FULL-CLAUSE-TEXT (101 : 100)
          logger.info("      {}", new String(substring(wqSqlFullClause.getWqSqlFullClauseText(),100,200))); 
//  DISPLAY '      ' WQ-SQL-FULL-CLAUSE-TEXT (201 : 100)
          logger.info("      {}", new String(substring(wqSqlFullClause.getWqSqlFullClauseText(),200,300))); 
//  DISPLAY '      ' WQ-SQL-FULL-CLAUSE-TEXT (301 : 100)
          logger.info("      {}", new String(substring(wqSqlFullClause.getWqSqlFullClauseText(),300,400))); 
//  DISPLAY '      ' WQ-SQL-FULL-CLAUSE-TEXT (401 : 100)
          logger.info("      {}", new String(substring(wqSqlFullClause.getWqSqlFullClauseText(),400,500))); 
          ;
      
      }
      /**
      * prepareAndOpen 
      *   This method is derived from 
  *   COBOL Paragraph - 2000-PREPARE-AND-OPEN COBOL Cyclomatic complexity - 8
      * Input  :  

      * - sqlcode                        COBOL Name: SQLCODE
      * - sqlFilterColor1                COBOL Name: WS-SQL-FILTER-COLOR1
      * - sqlFilterColor2                COBOL Name: WS-SQL-FILTER-COLOR2
      * - sqlFilterSupplier              COBOL Name: WS-SQL-FILTER-SUPPLIER
      *
      * Output :  

      * - sqlcodeDisp                    COBOL Name: WS-SQLCODE-DISP
      * - sqlcode                        COBOL Name: SQLCODE
      * - sqln                           COBOL Name: SQLN
      * - sqld                           COBOL Name: SQLD
      * - sqltype                        COBOL Name: SQLTYPE
      * - sqllen                         COBOL Name: SQLLEN
      * - sqlnamel                       COBOL Name: SQLNAMEL
      * - sqlind                         COBOL Name: SQLIND
      * - sqldata                        COBOL Name: SQLDATA
      * - sqldaid                        COBOL Name: SQLDAID
      * - sqldabc                        COBOL Name: SQLDABC
      *
      * @throws CFException
      */
      private void prepareAndOpen() throws Exception {
			// Declare local variables used in the method
			int sqlcode = 0;
			 final int SQL_FILTER_COLOR_1_LENGTH = 6;
			 final int SQL_FILTER_COLOR_2_LENGTH = 6;
			 final int SQL_FILTER_SUPPLIER_LENGTH = 8;
			 final int SQLDAID_LENGTH = 8;
			 final int SQLDABC_LENGTH = 4;
			 final int SQLN_LENGTH = 2;
			 final int SQLD_LENGTH = 2;
			SqlFilterColor1Group sqlFilterColor1Group = sqlFilter.getSqlFilterColor1Group();
			SqlFilterColor2Group sqlFilterColor2Group = sqlFilter.getSqlFilterColor2Group();
			SqlFilterSupplierGroup sqlFilterSupplierGroup = sqlFilter.getSqlFilterSupplierGroup();
			char[] sqlFilterSupplier = null;
			// End of variable declaration

      
// *----------------------------------------------------------------*
//  PREPARE WIDGTQRY FROM ?
          uhdynsqlRepository.prepare(sqlca,wqSqlFullClause);
//  IF SQLCODE = 0 THEN
          sqlcode = sqlca.getSqlcode();
//  ELSE
          if (	( sqlcode != 0 )) { 
              // MOVE SQLCODE TO WS-SQLCODE-DISP
              //  FORMAT1016704244 = "-999"
              work.setSqlcodeDisp(CFUtil.cobolNumberFormatter(CONSTANTS.FORMAT1016704244,String.valueOf(sqlca.getSqlcode()).toCharArray()));
//  DISPLAY 'SQL DYN_PREPARE FAILED! SQLCODE = ' WS-SQLCODE-DISP
              logger.info("SQL DYN_PREPARE FAILED! SQLCODE = {}", new String(work.getSqlcodeDisp())); 
//cobolCode::GO TO 9999-EXIT-PROGRAM
exitProgram();
 return ;
//cobolCodeEnds::GO TO 9999-EXIT-PROGRAM
          }
  
// DECLARE WIDGET-CSR CURSOR FOR WIDGTQRY
//  IF SQLCODE = 0 THEN
          sqlcode = sqlca.getSqlcode();
//  ELSE
          if (	( sqlcode != 0 )) { 
              // MOVE SQLCODE TO WS-SQLCODE-DISP
              //  FORMAT1016704244 = "-999"
              work.setSqlcodeDisp(CFUtil.cobolNumberFormatter(CONSTANTS.FORMAT1016704244,String.valueOf(sqlca.getSqlcode()).toCharArray()));
//  DISPLAY 'SQL DECLARE_CURSOR FAILED! SQLCODE = ' WS-SQLCODE-DISP
              logger.info("SQL DECLARE_CURSOR FAILED! SQLCODE = {}", new String(work.getSqlcodeDisp())); 
//cobolCode::GO TO 9999-EXIT-PROGRAM
exitProgram();
 return ;
//cobolCodeEnds::GO TO 9999-EXIT-PROGRAM
          }
  

// *
// *    Fill sqlda
// *

// *
// * Put marker  :ws-sql-filter-color1
// *
//  MOVE ZERO TO SQLN, SQLD
          sqlda.setSqln((short) 0);
          sqlda.setSqld((short) 0);
//  ADD 1 TO SQLN, SQLD
          sqlda.setSqln( (short) (sqlda.getSqln()+(short)1));
          sqlda.setSqld( (short) (sqlda.getSqld()+(short)1));
//  MOVE +452 TO SQLTYPE (SQLN)
          sqlda.getSqlvar(sqlda.getSqln() - 1).getSqlvar1().setSqltype((short)452);
//  MOVE LENGTH OF WS-SQL-FILTER-COLOR1 TO SQLLEN (SQLN)
          sqlda.getSqlvar(sqlda.getSqln() - 1).getSqlvar1().setSqllen((short) SQL_FILTER_COLOR_1_LENGTH);
//  MOVE ZERO TO SQLNAMEL (SQLN)
          sqlda.getSqlvar(sqlda.getSqln() - 1).getSqlvar1().getSqlname().setSqlnamel((short) 0);
//  SET SQLIND (SQLN) TO NULL
          sqlda.getSqlvar(sqlda.getSqln() - 1).getSqlvar1().setSqlind(0); 
          
//  SET SQLDATA (SQLN) TO ADDRESS OF WS-SQL-FILTER-COLOR1
          sqlda.getSqlvar(sqlda.getSqln() - 1).getSqlvar1().setSqldata(setObject(sqlFilterColor1Group)); 
          
  

// *
// * Put marker  :ws-sql-filter-color2
// *
//  ADD 1 TO SQLN, SQLD
          sqlda.setSqln( (short) (sqlda.getSqln()+(short)1));
          sqlda.setSqld( (short) (sqlda.getSqld()+(short)1));
//  MOVE +452 TO SQLTYPE (SQLN)
          sqlda.getSqlvar(sqlda.getSqln() - 1).getSqlvar1().setSqltype((short)452);
//  MOVE LENGTH OF WS-SQL-FILTER-COLOR2 TO SQLLEN (SQLN)
          sqlda.getSqlvar(sqlda.getSqln() - 1).getSqlvar1().setSqllen((short) SQL_FILTER_COLOR_2_LENGTH);
//  MOVE ZERO TO SQLNAMEL (SQLN)
          sqlda.getSqlvar(sqlda.getSqln() - 1).getSqlvar1().getSqlname().setSqlnamel((short) 0);
//  SET SQLIND (SQLN) TO NULL
          sqlda.getSqlvar(sqlda.getSqln() - 1).getSqlvar1().setSqlind(0); 
          
//  SET SQLDATA (SQLN) TO ADDRESS OF WS-SQL-FILTER-COLOR2
          sqlda.getSqlvar(sqlda.getSqln() - 1).getSqlvar1().setSqldata(setObject(sqlFilterColor2Group,7,6)); 
          
  

// *
// * Put marker  :ws-sql-filter-supplier
// *
          sqlFilterSupplier = sqlFilterSupplierGroup.getSqlFilterSupplier();
//  IF WS-SQL-FILTER-SUPPLIER NOT = SPACES
          if (        ( !allSpaces(sqlFilterSupplier)  )) { 
//  ADD 1 TO SQLN, SQLD
              sqlda.setSqln( (short) (sqlda.getSqln()+(short)1));
              sqlda.setSqld( (short) (sqlda.getSqld()+(short)1));
//  MOVE +452 TO SQLTYPE (SQLN)
              sqlda.getSqlvar(sqlda.getSqln() - 1).getSqlvar1().setSqltype((short)452);
//  MOVE LENGTH OF WS-SQL-FILTER-SUPPLIER TO SQLLEN (SQLN)
              sqlda.getSqlvar(sqlda.getSqln() - 1).getSqlvar1().setSqllen((short) SQL_FILTER_SUPPLIER_LENGTH);
//  MOVE ZERO TO SQLNAMEL (SQLN)
              sqlda.getSqlvar(sqlda.getSqln() - 1).getSqlvar1().getSqlname().setSqlnamel((short) 0);
//  SET SQLIND (SQLN) TO NULL
              sqlda.getSqlvar(sqlda.getSqln() - 1).getSqlvar1().setSqlind(0); 
              
//  SET SQLDATA (SQLN) TO ADDRESS OF WS-SQL-FILTER-SUPPLIER
              sqlda.getSqlvar(sqlda.getSqln() - 1).getSqlvar1().setSqldata(setObject(sqlFilterSupplierGroup,14,8)); 
              
  
          }
  

// *
// * Set sqlda id and length vars
//  MOVE 'SQLDA' TO SQLDAID
          sqlda.setSqldaid(CONSTANTS.LITERAL_SQLDA_B3_);
          sqlda.setSqldabc(SQLDAID_LENGTH + SQLDABC_LENGTH + SQLN_LENGTH + SQLD_LENGTH +  ( sqlda.getSqln() * Sqlvar1.getSqlvar1FieldLength() ) );

// *
//  DISPLAY 'MARKER VALUES : ' WS-SQL-FILTER-COLOR1 ' ' WS-SQL-FILTER-COLOR2 ' ' WS-SQL-FILTER-SUPPLIER
          logger.info("MARKER VALUES : {} {} {}", new String(sqlFilterColor1Group.getSqlFilterColor1()), new String(sqlFilterColor2Group.getSqlFilterColor2()), new String(sqlFilterSupplierGroup.getSqlFilterSupplier())); 
  
//  DISPLAY ' '
          logger.info(" "); 
//  DECLARE WIDGET-CSR CURSOR FOR WIDGTQRY
          uhdynsqlRepository.openWidgetCsrUhdynsql(sqlda,sqlca);
//  EVALUATE SQLCODE
          switch(sqlca.getSqlcode()){
          	case 0:
//  PERFORM 3000-FETCH-WIDGETS
              fetchWidgets();/*3000-FETCH-WIDGETS*/
              if (this.isProgramEnded()) {
                  return ;
              }
          break;
          default :
              // MOVE SQLCODE TO WS-SQLCODE-DISP
              //  FORMAT1016704244 = "-999"
              work.setSqlcodeDisp(CFUtil.cobolNumberFormatter(CONSTANTS.FORMAT1016704244,String.valueOf(sqlca.getSqlcode()).toCharArray()));
//  DISPLAY 'SQL OPEN_CURSOR FAILED! SQLCODE = ' WS-SQLCODE-DISP
              logger.info("SQL OPEN_CURSOR FAILED! SQLCODE = {}", new String(work.getSqlcodeDisp())); 
//cobolCode::GO TO 9999-EXIT-PROGRAM
exitProgram();
 return ;
//cobolCodeEnds::GO TO 9999-EXIT-PROGRAM
          }
          ;
      
      }
      /**
      * fetchAndPrintWidgets 
      *   This method is derived from 
  *   COBOL Paragraph - 2001-FETCH-AND-PRINT-WIDGETS COBOL Cyclomatic complexity - 1
      * Input  :  

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
      * Output : None 

      * @throws CFException
      */
      private void fetchAndPrintWidgets() throws Exception {
      
// *

// *
//  DISPLAY '-----------------------------------------'
          logger.info("-----------------------------------------"); 
//  DISPLAY 'WIDGET-NUM           = ' WIDGET-NUM
          logger.info("WIDGET-NUM           = {}", new String(tbxmlwgt.getWidgetNum())); 
//  DISPLAY 'WIDGET-COLOR         = ' WIDGET-COLOR
          logger.info("WIDGET-COLOR         = {}", new String(tbxmlwgt.getWidgetColor())); 
//  DISPLAY 'WIDGET-SIZE          = ' WIDGET-SIZE
          logger.info("WIDGET-SIZE          = {}", new String(tbxmlwgt.getWidgetSize())); 
//  DISPLAY 'WIDGET-PRICE         = ' WIDGET-PRICE
          logger.info("WIDGET-PRICE         = {}", String.valueOf(tbxmlwgt.getWidgetPrice().movePointRight(2))); 
//  DISPLAY 'WIDGET-SUPPLIER      = ' WIDGET-SUPPLIER
          logger.info("WIDGET-SUPPLIER      = {}", new String(tbxmlwgt.getWidgetSupplier())); 
//  DISPLAY 'WIDGET-DESC          = ' WIDGET-DESC
          logger.info("WIDGET-DESC          = {}", new String(tbxmlwgt.getWidgetDesc())); 
//  DISPLAY 'WIDGET-MANU-PLANT    = ' WIDGET-MANU-PLANT
          logger.info("WIDGET-MANU-PLANT    = {}", new String(tbxmlwgt.getWidgetManuPlant())); 
//  DISPLAY 'WIDGET-MANU-COST     = ' WIDGET-MANU-COST
          logger.info("WIDGET-MANU-COST     = {}", String.valueOf(tbxmlwgt.getWidgetManuCost().movePointRight(2))); 
//  DISPLAY 'WIDGET-LEAD-TIME     = ' WIDGET-LEAD-TIME
          logger.info("WIDGET-LEAD-TIME     = {}", String.valueOf(tbxmlwgt.getWidgetLeadTime())); 

// *
//  PERFORM 3000-FETCH-WIDGETS THRU 3000-EXIT
          fetchWidgets();/*3000-FETCH-WIDGETS*/
          if (this.isProgramEnded()) {
              return ;
          }
          ;
      
      }
      /**
      * fetchWidgets 
      *   This method is derived from 
  *   COBOL Paragraph - 3000-FETCH-WIDGETS COBOL Cyclomatic complexity - 5
      * Input  :  

      * - sqlcode                        COBOL Name: SQLCODE
      *
      * Output :  

      * - wfWidgetsFlag                  COBOL Name: WF-WIDGETS-FLAG
      * - sqlcodeDisp                    COBOL Name: WS-SQLCODE-DISP
      * - sqlcode                        COBOL Name: SQLCODE
      *
      * @throws CFException
      */
      private void fetchWidgets() throws Exception {
//  FETCH WIDGET-CSR INTO ? , ? , ? , ? , ? , ? , ? , ? , ?
          uhdynsqlRepository.fetchWidgetCsrUhdynsql(tbxmlwgt,sqlca);
//  EVALUATE SQLCODE
          switch(sqlca.getSqlcode()){
          	case 0:
          break;
          	case 100:
//  SET WF-ALL-WIDGETS-FETCHED TO TRUE
              work.setWfAllWidgetsFetchedTrue(); 
              
//  PERFORM 4000-CLOSE-WIDGETS
              closeWidgets();/*4000-CLOSE-WIDGETS*/
              if (this.isProgramEnded()) {
                  return ;
              }
          break;
          default :
              // MOVE SQLCODE TO WS-SQLCODE-DISP
              //  FORMAT1016704244 = "-999"
              work.setSqlcodeDisp(CFUtil.cobolNumberFormatter(CONSTANTS.FORMAT1016704244,String.valueOf(sqlca.getSqlcode()).toCharArray()));
//  DISPLAY 'FETCH CURSR FAILED! SQLCODE = ' WS-SQLCODE-DISP
              logger.info("FETCH CURSR FAILED! SQLCODE = {}", new String(work.getSqlcodeDisp())); 
//cobolCode::GO TO 9999-EXIT-PROGRAM
exitProgram();
 return ;
//cobolCodeEnds::GO TO 9999-EXIT-PROGRAM
          }
          ;
      
      }
      /**
      * closeWidgets 
      *   This method is derived from 
  *   COBOL Paragraph - 4000-CLOSE-WIDGETS COBOL Cyclomatic complexity - 4
      * Input  :  

      * - sqlcode                        COBOL Name: SQLCODE
      *
      * Output :  

      * - sqlcodeDisp                    COBOL Name: WS-SQLCODE-DISP
      * - sqlcode                        COBOL Name: SQLCODE
      *
      * @throws CFException
      */
      private void closeWidgets() throws Exception {
      
// *
//  CLOSE WIDGET-CSR
          uhdynsqlRepository.closeWidgetCsrUhdynsql(sqlca);
//  EVALUATE SQLCODE
          switch(sqlca.getSqlcode()){
          	case 0:
          break;
          default :
              // MOVE SQLCODE TO WS-SQLCODE-DISP
              //  FORMAT1016704244 = "-999"
              work.setSqlcodeDisp(CFUtil.cobolNumberFormatter(CONSTANTS.FORMAT1016704244,String.valueOf(sqlca.getSqlcode()).toCharArray()));
//  DISPLAY 'CLOSE CURSR FAILED! SQLCODE = ' WS-SQLCODE-DISP
              logger.info("CLOSE CURSR FAILED! SQLCODE = {}", new String(work.getSqlcodeDisp())); 
//cobolCode::GO TO 9999-EXIT-PROGRAM
exitProgram();
 return ;
//cobolCodeEnds::GO TO 9999-EXIT-PROGRAM
          }
      
      }
      /**
      * exitProgram 
      *   This method is derived from 
  *   COBOL Paragraph - 9999-EXIT-PROGRAM COBOL Cyclomatic complexity - 2
      * Input  : None 

      * Output : None 

      * @throws CFException
      */
      private void exitProgram() throws Exception {
      
// *
// *
// *----------------------------------------------------------------*

// *----------------------------------------------------------------*
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
          db2Base.reset("UHDYNSQL" ,dbQualifier, true/*use Dynamic SQL*/);
       doNotSkipPrepareAndOpen = true;
       doNotSkipFetchAndPrintWidgets = true;
       doNotSkipFetchWidgets = true;
       doNotSkipCloseWidgets = true;
          if(!isInitDone()) {
          	this.setRc(0);
          	setInitDone(true);
          }
        CFUtil.resetDecimalAsComma();
       }
  
  
  
  
  
  
  }
