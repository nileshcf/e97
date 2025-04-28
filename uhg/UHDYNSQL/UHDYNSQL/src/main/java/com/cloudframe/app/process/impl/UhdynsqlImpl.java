  package com.cloudframe.app.process.impl;
  /* 
*------------------------
*------------------------
*---------------------
*/
  
  import com.cloudframe.app.uhdynsql.UhdynsqlCtx.*;
  import com.cloudframe.app.uhdynsql.UhdynsqlCtx;
  import com.cloudframe.app.process.Uhdynsql;
  import com.cloudframe.app.process.BaseProcess;
  import org.springframework.web.bind.annotation.GetMapping;
  import org.slf4j.Logger;
  import org.slf4j.LoggerFactory;
  import com.cloudframe.app.exception.CFException;
  import org.springframework.stereotype.Component;
  import org.springframework.web.bind.annotation.RestController;
  import com.cloudframe.app.dto.GlobalExecutorCtx;
  import com.cloudframe.app.utility.CFUtil;
  import com.cloudframe.app.uhdynsql.file.Scanner;
  import org.springframework.beans.factory.annotation.Autowired;
  import org.springframework.beans.factory.annotation.Qualifier;
  import java.util.ArrayList;
  import com.cloudframe.app.data.Field;
  import java.util.Map;
  import java.util.HashMap;
  import com.cloudframe.app.repository.UhdynsqlRepository;
  import com.cloudframe.app.exception.Terminate;
  import com.cloudframe.app.uhdynsql.dto.*;
  import com.cloudframe.app.uhdynsql.dto.Sqlca;
  import com.cloudframe.app.uhdynsql.dto.WqSqlFullClause;
  import com.cloudframe.app.uhdynsql.dto.Tbxmlwgt;
  import com.cloudframe.app.uhdynsql.dto.SqlFilter;
  import com.cloudframe.app.uhdynsql.dto.Sqlda;
  import com.cloudframe.app.uhdynsql.dto.Work;
  import com.cloudframe.app.common.CONSTANTS;
  import com.cloudframe.app.common.SQLS;
  import org.springframework.beans.factory.annotation.Value;
  import com.cloudframe.app.dao.Db2Base;
  import java.sql.SQLException;
  
  @Component("uhdynsql")
  
  public class UhdynsqlImpl extends CommonProcess implements Uhdynsql {
  
  Logger logger = LoggerFactory.getLogger(UhdynsqlImpl.class);
  
  
  @Value("${UHDYNSQL.dbQualifier:}")
  private String dbQualifier;
  
  
  @Autowired 
  @Qualifier("db2Base")
  Db2Base db2Base;
  @Autowired 
  @Qualifier("uhdynsqlRepository")
  UhdynsqlRepository uhdynsqlRepository;
  
  
  
  
    @Autowired
    @Qualifier("uhdynsql_scanner")
    Scanner scanner;
  
  
  
      /**
      * process 
      * Input  : None 

      * Output : None 

      * @throws CFException
      */
      public int process(UhdynsqlCtx programCtx) throws Exception {
       try {
       setCodePage("1047");
            // Reset program ended flag
           programCtx.setProgramEnded(false);
      	db2Base.reset("UHDYNSQL" ,dbQualifier, true/*use Dynamic SQL*/);
          ;
//  PERFORM 0000-MAIN
          main(programCtx.getMainInCtx());/*0000-MAIN*/
          if (programCtx.isProgramEnded()) {
              return programCtx.getRc();
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
      
       return programCtx.getRc(); // Exit with return code
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
      @Override
      public void main(MainInCtx methodIn) throws Exception {
UhdynsqlCtx programCtx = methodIn.getUhdynsqlCtx();

// *
//  PERFORM 0010-INITIALIZE THRU 0010-EXIT
          initialize(programCtx);/*0010-INITIALIZE*/
          if (programCtx.isProgramEnded()) {
              return ;
          }

// *
//  PERFORM 1000-BUILD-SQL THRU 1000-EXIT
          buildSql(programCtx.getBuildSqlInCtx());/*1000-BUILD-SQL*/
          if (programCtx.isProgramEnded()) {
              return ;
          }

// *
//  PERFORM 2000-PREPARE-AND-OPEN THRU 2000-EXIT
          prepareAndOpen(programCtx.getPrepareAndOpenInCtx());/*2000-PREPARE-AND-OPEN*/
          if (programCtx.isProgramEnded()) {
              return ;
          }

// *
//  PERFORM 2001-FETCH-AND-PRINT-WIDGETS UNTIL WF-ALL-WIDGETS-FETCHED
          while (!(methodIn.isWfAllWidgetsFetched()) ) {
             fetchAndPrintWidgets(programCtx.getFetchAndPrintWidgetsInCtx());/*2001-FETCH-AND-PRINT-WIDGETS*/
             if (programCtx.isProgramEnded()) {
                 return ;
             }
          }

// *
// *
//cobolCode::GO TO 9999-EXIT-PROGRAM
exitProgram(programCtx);
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
      @Override
      public InitializeOutCtx initialize(UhdynsqlCtx programCtx) throws Exception {
InitializeOutCtx methodOut = programCtx.getInitializeOutCtx();

// *
//  INITIALIZE WQ-SQL-FULL-CLAUSE WQ-SQL-SELECT-CLAUSE WQ-SQL-FROM-CLAUSE WQ-SQL-PREDICATE-CLAUSE
          methodOut.getWqSqlFullClause().initialize();
          methodOut.setWqSqlSelectClause(CONSTANTS.SPACE_200 /* Fill 200 Spaces*/);
          methodOut.setWqSqlFromClause(CONSTANTS.SPACE_50 /* Fill 50 Spaces*/);
          methodOut.setWqSqlPredicateClause(CONSTANTS.SPACE_200 /* Fill 200 Spaces*/);
//  SET WF-START-FETCH-WIDGETS TO TRUE
          methodOut.setWfStartFetchWidgetsTrue(); 
          
          ;
      
      return methodOut;
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
      @Override
      public BuildSqlOutCtx buildSql(BuildSqlInCtx methodIn) throws Exception {
			// Declare local variables used in the method
			char[] consoleInput = null;
			char[] joinCharArray = null;
			ArrayList<char[]> charArray = new ArrayList<char[]>();
			Map<String,Object> updated = null;
			// End of variable declaration

UhdynsqlCtx programCtx = methodIn.getUhdynsqlCtx();
BuildSqlOutCtx methodOut = methodIn.getBuildSqlOutCtx();
//  ACCEPT WS-SQL-FILTER
          consoleInput = scanner.nextLine();
          if (!scanner.hasEnded()) {
             methodOut.getSqlFilter().setString(consoleInput);  // read from console and assign
          }
//  IF WS-SQL-FILTER-COLOR1 = ' ' OR WS-SQL-FILTER-COLOR2 = ' ' OR WS-SQL-FILTER-SUPPLIER = ' ' THEN
          if (        ( allSpaces(methodOut.getSqlFilterColor1())   ) ||         ( allSpaces(methodOut.getSqlFilterColor2())   ) ||         ( allSpaces(methodOut.getSqlFilterSupplier())   )) { 
//  DISPLAY 'SQL FILTER VALUES NOT SPECIFIED ON SYSIN!!'
              logger.info("SQL FILTER VALUES NOT SPECIFIED ON SYSIN!!"); 
//cobolCode::GO TO 9999-EXIT-PROGRAM
exitProgram(programCtx);
 return methodOut;
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
          updated = updateString(methodOut.getWqSqlSelectClause() ,joinCharArray);
          methodOut.setWqSqlSelectClause(  (char[])updated.get("string"));

// *
//  STRING 'FROM TBWIDGET' ' #' DELIMITED BY SIZE INTO WQ-SQL-FROM-CLAUSE END-STRING
          charArray = new ArrayList<char[]>();
             charArray.add(CONSTANTS.LITERAL_FROM_B_TBWIDGET);
             charArray.add(CONSTANTS.LITERAL_B_HS_);
          joinCharArray = Field.mergeArrays(charArray.get(0),charArray.get(1));
          updated = updateString(methodOut.getWqSqlFromClause() ,joinCharArray);
          methodOut.setWqSqlFromClause(  (char[])updated.get("string"));

// *
//  STRING WQ-SQL-COLOR-PRED '#' DELIMITED BY SIZE INTO WQ-SQL-PREDICATE-CLAUSE
          charArray = new ArrayList<char[]>();
             charArray.add(methodIn.getWqSqlColorPred());
             charArray.add(CONSTANTS.LITERAL_HS_);
          joinCharArray = Field.mergeArrays(charArray.get(0),charArray.get(1));
          updated = updateString(methodOut.getWqSqlPredicateClause() ,joinCharArray);
          methodOut.setWqSqlPredicateClause(  (char[])updated.get("string"));
//  IF WS-SQL-FILTER-SUPPLIER > SPACES
          if (             ( isGreaterThanSpaces(methodOut.getSqlFilterSupplier()) )) { 
//  STRING WQ-SQL-PREDICATE-CLAUSE DELIMITED BY '#' WQ-SQL-SUPPLIER-PRED '#' DELIMITED BY SIZE INTO WQ-SQL-PREDICATE-CLAUSE
              charArray = new ArrayList<char[]>();
                 charArray.add(splitFirst( methodOut.getWqSqlPredicateClause() , CONSTANTS.LITERAL_HS_ ) );
                 charArray.add(methodIn.getWqSqlSupplierPred());
                 charArray.add(CONSTANTS.LITERAL_HS_);
              joinCharArray = Field.mergeArrays(charArray.get(0),charArray.get(1),charArray.get(2));
              updated = updateString(methodOut.getWqSqlPredicateClause() ,joinCharArray);
              methodOut.setWqSqlPredicateClause(  (char[])updated.get("string"));
          }

// *
// *
//  STRING WQ-SQL-SELECT-CLAUSE WQ-SQL-FROM-CLAUSE DELIMITED BY '#' WQ-SQL-PREDICATE-CLAUSE DELIMITED BY '#' WQ-SQL-ORDER-BY-CLAUSE DELIMITED BY SIZE INTO WQ-SQL-FULL-CLAUSE-TEXT
          charArray = new ArrayList<char[]>();
             charArray.add(splitFirst( methodOut.getWqSqlSelectClause() , CONSTANTS.LITERAL_HS_ ) );
             charArray.add(splitFirst( methodOut.getWqSqlFromClause() , CONSTANTS.LITERAL_HS_ ) );
             charArray.add(splitFirst( methodOut.getWqSqlPredicateClause() , CONSTANTS.LITERAL_HS_ ) );
             charArray.add(methodIn.getWqSqlOrderByClause());
          joinCharArray = Field.mergeArrays(charArray.get(0),charArray.get(1),charArray.get(2),charArray.get(3));
          updated = updateString(methodOut.getWqSqlFullClauseText() ,joinCharArray);
          methodOut.setWqSqlFullClauseText(  (char[])updated.get("string"));

// *

// *
//  MOVE 7000 TO WQ-SQL-FULL-CLAUSE-LEN
          methodOut.setWqSqlFullClauseLen((short)7000);
//  DISPLAY 'SQL : '
          logger.info("SQL : "); 
//  DISPLAY '      ' WQ-SQL-FULL-CLAUSE-TEXT (1 : 100)
          logger.info("      {}", new String(substring(methodOut.getWqSqlFullClauseText(),0,100))); 
//  DISPLAY '      ' WQ-SQL-FULL-CLAUSE-TEXT (101 : 100)
          logger.info("      {}", new String(substring(methodOut.getWqSqlFullClauseText(),100,200))); 
//  DISPLAY '      ' WQ-SQL-FULL-CLAUSE-TEXT (201 : 100)
          logger.info("      {}", new String(substring(methodOut.getWqSqlFullClauseText(),200,300))); 
//  DISPLAY '      ' WQ-SQL-FULL-CLAUSE-TEXT (301 : 100)
          logger.info("      {}", new String(substring(methodOut.getWqSqlFullClauseText(),300,400))); 
//  DISPLAY '      ' WQ-SQL-FULL-CLAUSE-TEXT (401 : 100)
          logger.info("      {}", new String(substring(methodOut.getWqSqlFullClauseText(),400,500))); 
          ;
      
      return methodOut;
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
      @Override
      public PrepareAndOpenOutCtx prepareAndOpen(PrepareAndOpenInCtx methodIn) throws Exception {
			// Declare local variables used in the method
			 final int SQL_FILTER_COLOR_1_LENGTH = 6;
			 final int SQL_FILTER_COLOR_2_LENGTH = 6;
			 final int SQL_FILTER_SUPPLIER_LENGTH = 8;
			 final int SQLDAID_LENGTH = 8;
			 final int SQLDABC_LENGTH = 4;
			 final int SQLN_LENGTH = 2;
			 final int SQLD_LENGTH = 2;
			// End of variable declaration

      
// *----------------------------------------------------------------*
UhdynsqlCtx programCtx = methodIn.getUhdynsqlCtx();
PrepareAndOpenOutCtx methodOut = methodIn.getPrepareAndOpenOutCtx();
//  PREPARE WIDGTQRY FROM ?
          uhdynsqlRepository.prepare(methodIn.getWqSqlFullClause(),programCtx.getSqlca());
//  IF SQLCODE = 0 THEN
//  ELSE
          if (	( methodOut.getSqlcode() != 0 )) { 
              // MOVE SQLCODE TO WS-SQLCODE-DISP
              //  FORMAT1016704244 = "-999"
              methodOut.setSqlcodeDisp(CFUtil.cobolNumberFormatter(CONSTANTS.FORMAT1016704244,String.valueOf(methodOut.getSqlcode()).toCharArray()));
//  DISPLAY 'SQL DYN_PREPARE FAILED! SQLCODE = ' WS-SQLCODE-DISP
              logger.info("SQL DYN_PREPARE FAILED! SQLCODE = {}", new String(methodOut.getSqlcodeDisp())); 
//cobolCode::GO TO 9999-EXIT-PROGRAM
exitProgram(programCtx);
 return methodOut;
//cobolCodeEnds::GO TO 9999-EXIT-PROGRAM
          }
// DECLARE WIDGET-CSR CURSOR FOR WIDGTQRY
//  IF SQLCODE = 0 THEN
//  ELSE
          if (	( methodOut.getSqlcode() != 0 )) { 
              // MOVE SQLCODE TO WS-SQLCODE-DISP
              //  FORMAT1016704244 = "-999"
              methodOut.setSqlcodeDisp(CFUtil.cobolNumberFormatter(CONSTANTS.FORMAT1016704244,String.valueOf(methodOut.getSqlcode()).toCharArray()));
//  DISPLAY 'SQL DECLARE_CURSOR FAILED! SQLCODE = ' WS-SQLCODE-DISP
              logger.info("SQL DECLARE_CURSOR FAILED! SQLCODE = {}", new String(methodOut.getSqlcodeDisp())); 
//cobolCode::GO TO 9999-EXIT-PROGRAM
exitProgram(programCtx);
 return methodOut;
//cobolCodeEnds::GO TO 9999-EXIT-PROGRAM
          }

// *
// *    Fill sqlda
// *

// *
// * Put marker  :ws-sql-filter-color1
// *
//  MOVE ZERO TO SQLN, SQLD
          methodOut.setSqln((short) 0);
          methodOut.setSqld((short) 0);
//  ADD 1 TO SQLN, SQLD
          methodOut.setSqln( (short) (methodOut.getSqln()+(short)1));
          methodOut.setSqld( (short) (methodOut.getSqld()+(short)1));
//  MOVE +452 TO SQLTYPE (SQLN)
          methodOut.setSqltype(methodOut.getSqln() - 1,(short)452);
//  MOVE LENGTH OF WS-SQL-FILTER-COLOR1 TO SQLLEN (SQLN)
          methodOut.setSqllen(methodOut.getSqln() - 1,(short) SQL_FILTER_COLOR_1_LENGTH);
//  MOVE ZERO TO SQLNAMEL (SQLN)
          methodOut.setSqlnamel(methodOut.getSqln() - 1,(short) 0);
//  SET SQLIND (SQLN) TO NULL
          methodOut.setSqlind(methodOut.getSqln() - 1,0); 
          
//  SET SQLDATA (SQLN) TO ADDRESS OF WS-SQL-FILTER-COLOR1
          methodOut.setSqldata(methodOut.getSqln() - 1,setObject(methodIn.getSqlFilterColor1Group())); 
          

// *
// * Put marker  :ws-sql-filter-color2
// *
//  ADD 1 TO SQLN, SQLD
          methodOut.setSqln( (short) (methodOut.getSqln()+(short)1));
          methodOut.setSqld( (short) (methodOut.getSqld()+(short)1));
//  MOVE +452 TO SQLTYPE (SQLN)
          methodOut.setSqltype(methodOut.getSqln() - 1,(short)452);
//  MOVE LENGTH OF WS-SQL-FILTER-COLOR2 TO SQLLEN (SQLN)
          methodOut.setSqllen(methodOut.getSqln() - 1,(short) SQL_FILTER_COLOR_2_LENGTH);
//  MOVE ZERO TO SQLNAMEL (SQLN)
          methodOut.setSqlnamel(methodOut.getSqln() - 1,(short) 0);
//  SET SQLIND (SQLN) TO NULL
          methodOut.setSqlind(methodOut.getSqln() - 1,0); 
          
//  SET SQLDATA (SQLN) TO ADDRESS OF WS-SQL-FILTER-COLOR2
          methodOut.setSqldata(methodOut.getSqln() - 1,setObject(methodIn.getSqlFilterColor2Group(),7,6)); 
          

// *
// * Put marker  :ws-sql-filter-supplier
// *
//  IF WS-SQL-FILTER-SUPPLIER NOT = SPACES
          if (        ( !allSpaces(methodIn.getSqlFilterSupplier())  )) { 
//  ADD 1 TO SQLN, SQLD
              methodOut.setSqln( (short) (methodOut.getSqln()+(short)1));
              methodOut.setSqld( (short) (methodOut.getSqld()+(short)1));
//  MOVE +452 TO SQLTYPE (SQLN)
              methodOut.setSqltype(methodOut.getSqln() - 1,(short)452);
//  MOVE LENGTH OF WS-SQL-FILTER-SUPPLIER TO SQLLEN (SQLN)
              methodOut.setSqllen(methodOut.getSqln() - 1,(short) SQL_FILTER_SUPPLIER_LENGTH);
//  MOVE ZERO TO SQLNAMEL (SQLN)
              methodOut.setSqlnamel(methodOut.getSqln() - 1,(short) 0);
//  SET SQLIND (SQLN) TO NULL
              methodOut.setSqlind(methodOut.getSqln() - 1,0); 
              
//  SET SQLDATA (SQLN) TO ADDRESS OF WS-SQL-FILTER-SUPPLIER
              methodOut.setSqldata(methodOut.getSqln() - 1,setObject(methodIn.getSqlFilterSupplierGroup(),14,8)); 
              
          }

// *
// * Set sqlda id and length vars
//  MOVE 'SQLDA' TO SQLDAID
          methodOut.setSqldaid(CONSTANTS.LITERAL_SQLDA_B3_);
          methodOut.setSqldabc(SQLDAID_LENGTH + SQLDABC_LENGTH + SQLN_LENGTH + SQLD_LENGTH +  ( methodOut.getSqln() * Sqlvar1.getSqlvar1FieldLength() ) );

// *
//  DISPLAY 'MARKER VALUES : ' WS-SQL-FILTER-COLOR1 ' ' WS-SQL-FILTER-COLOR2 ' ' WS-SQL-FILTER-SUPPLIER
          logger.info("MARKER VALUES : {} {} {}", new String(methodIn.getSqlFilterColor1()), new String(methodIn.getSqlFilterColor2()), new String(methodIn.getSqlFilterSupplier())); 
//  DISPLAY ' '
          logger.info(" "); 
//  DECLARE WIDGET-CSR CURSOR FOR WIDGTQRY
          programCtx.setWidgetCsrResultSet(uhdynsqlRepository.openWidgetCsrUhdynsql(programCtx.getSqlda(),programCtx.getSqlca()));
//  EVALUATE SQLCODE
          switch(methodOut.getSqlcode()){
          	case 0:
//  PERFORM 3000-FETCH-WIDGETS
              fetchWidgets(programCtx.getFetchWidgetsInCtx());/*3000-FETCH-WIDGETS*/
              if (programCtx.isProgramEnded()) {
                  return methodOut;
              }
          break;
          default :
              // MOVE SQLCODE TO WS-SQLCODE-DISP
              //  FORMAT1016704244 = "-999"
              methodOut.setSqlcodeDisp(CFUtil.cobolNumberFormatter(CONSTANTS.FORMAT1016704244,String.valueOf(methodOut.getSqlcode()).toCharArray()));
//  DISPLAY 'SQL OPEN_CURSOR FAILED! SQLCODE = ' WS-SQLCODE-DISP
              logger.info("SQL OPEN_CURSOR FAILED! SQLCODE = {}", new String(methodOut.getSqlcodeDisp())); 
//cobolCode::GO TO 9999-EXIT-PROGRAM
exitProgram(programCtx);
 return methodOut;
//cobolCodeEnds::GO TO 9999-EXIT-PROGRAM
          }
          ;
      
      return methodOut;
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
      @Override
      public void fetchAndPrintWidgets(FetchAndPrintWidgetsInCtx methodIn) throws Exception {
      
// *

// *
UhdynsqlCtx programCtx = methodIn.getUhdynsqlCtx();
//  DISPLAY '-----------------------------------------'
          logger.info("-----------------------------------------"); 
//  DISPLAY 'WIDGET-NUM           = ' WIDGET-NUM
          logger.info("WIDGET-NUM           = {}", new String(methodIn.getWidgetNum())); 
//  DISPLAY 'WIDGET-COLOR         = ' WIDGET-COLOR
          logger.info("WIDGET-COLOR         = {}", new String(methodIn.getWidgetColor())); 
//  DISPLAY 'WIDGET-SIZE          = ' WIDGET-SIZE
          logger.info("WIDGET-SIZE          = {}", new String(methodIn.getWidgetSize())); 
//  DISPLAY 'WIDGET-PRICE         = ' WIDGET-PRICE
          logger.info("WIDGET-PRICE         = {}", String.valueOf(methodIn.getWidgetPrice().movePointRight(2))); 
//  DISPLAY 'WIDGET-SUPPLIER      = ' WIDGET-SUPPLIER
          logger.info("WIDGET-SUPPLIER      = {}", new String(methodIn.getWidgetSupplier())); 
//  DISPLAY 'WIDGET-DESC          = ' WIDGET-DESC
          logger.info("WIDGET-DESC          = {}", new String(methodIn.getWidgetDesc())); 
//  DISPLAY 'WIDGET-MANU-PLANT    = ' WIDGET-MANU-PLANT
          logger.info("WIDGET-MANU-PLANT    = {}", new String(methodIn.getWidgetManuPlant())); 
//  DISPLAY 'WIDGET-MANU-COST     = ' WIDGET-MANU-COST
          logger.info("WIDGET-MANU-COST     = {}", String.valueOf(methodIn.getWidgetManuCost().movePointRight(2))); 
//  DISPLAY 'WIDGET-LEAD-TIME     = ' WIDGET-LEAD-TIME
          logger.info("WIDGET-LEAD-TIME     = {}", String.valueOf(methodIn.getWidgetLeadTime())); 

// *
//  PERFORM 3000-FETCH-WIDGETS THRU 3000-EXIT
          fetchWidgets(programCtx.getFetchWidgetsInCtx());/*3000-FETCH-WIDGETS*/
          if (programCtx.isProgramEnded()) {
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
      @Override
      public FetchWidgetsOutCtx fetchWidgets(FetchWidgetsInCtx methodIn) throws Exception {
UhdynsqlCtx programCtx = methodIn.getUhdynsqlCtx();
FetchWidgetsOutCtx methodOut = methodIn.getFetchWidgetsOutCtx();
//  FETCH WIDGET-CSR INTO ? , ? , ? , ? , ? , ? , ? , ? , ?
          uhdynsqlRepository.fetchWidgetCsrUhdynsql(programCtx.getWidgetCsrResultSet(),methodOut.getTbxmlwgt(),programCtx.getSqlca());
//  EVALUATE SQLCODE
          switch(methodOut.getSqlcode()){
          	case 0:
          break;
          	case 100:
//  SET WF-ALL-WIDGETS-FETCHED TO TRUE
              methodOut.setWfAllWidgetsFetchedTrue(); 
              
//  PERFORM 4000-CLOSE-WIDGETS
              closeWidgets(programCtx.getCloseWidgetsInCtx());/*4000-CLOSE-WIDGETS*/
              if (programCtx.isProgramEnded()) {
                  return methodOut;
              }
          break;
          default :
              // MOVE SQLCODE TO WS-SQLCODE-DISP
              //  FORMAT1016704244 = "-999"
              methodOut.setSqlcodeDisp(CFUtil.cobolNumberFormatter(CONSTANTS.FORMAT1016704244,String.valueOf(methodOut.getSqlcode()).toCharArray()));
//  DISPLAY 'FETCH CURSR FAILED! SQLCODE = ' WS-SQLCODE-DISP
              logger.info("FETCH CURSR FAILED! SQLCODE = {}", new String(methodOut.getSqlcodeDisp())); 
//cobolCode::GO TO 9999-EXIT-PROGRAM
exitProgram(programCtx);
 return methodOut;
//cobolCodeEnds::GO TO 9999-EXIT-PROGRAM
          }
          ;
      
      return methodOut;
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
      @Override
      public CloseWidgetsOutCtx closeWidgets(CloseWidgetsInCtx methodIn) throws Exception {
      
// *
UhdynsqlCtx programCtx = methodIn.getUhdynsqlCtx();
CloseWidgetsOutCtx methodOut = methodIn.getCloseWidgetsOutCtx();
//  CLOSE WIDGET-CSR
          uhdynsqlRepository.closeWidgetCsrUhdynsql(programCtx.getWidgetCsrResultSet(),programCtx.getSqlca());
//  EVALUATE SQLCODE
          switch(methodOut.getSqlcode()){
          	case 0:
          break;
          default :
              // MOVE SQLCODE TO WS-SQLCODE-DISP
              //  FORMAT1016704244 = "-999"
              methodOut.setSqlcodeDisp(CFUtil.cobolNumberFormatter(CONSTANTS.FORMAT1016704244,String.valueOf(methodOut.getSqlcode()).toCharArray()));
//  DISPLAY 'CLOSE CURSR FAILED! SQLCODE = ' WS-SQLCODE-DISP
              logger.info("CLOSE CURSR FAILED! SQLCODE = {}", new String(methodOut.getSqlcodeDisp())); 
//cobolCode::GO TO 9999-EXIT-PROGRAM
exitProgram(programCtx);
 return methodOut;
//cobolCodeEnds::GO TO 9999-EXIT-PROGRAM
          }
      
      return methodOut;
      }
      /**
      * exitProgram 
      *   This method is derived from 
  *   COBOL Paragraph - 9999-EXIT-PROGRAM COBOL Cyclomatic complexity - 2
      * Input  : None 

      * Output : None 

      * @throws CFException
      */
      @Override
      public void exitProgram(UhdynsqlCtx programCtx) throws Exception {
      
// *
// *
// *----------------------------------------------------------------*

// *----------------------------------------------------------------*
//  GOBACK
          setNotLogged(false); // no need to log, it is a normal termination
          programCtx.setProgramEnded(true);
          return ;
      
      }
  
  
  
  
  
  
  
  
  }
