  package com.cloudframe.app.process.impl;
  /* 
*------------------------
*------------------------
*----------------------------------------------------------------*
* this is a cobol-db2 program for testing scalar functions
*
* when running in cf in dyanmic sql mode, host variable
* arguments cannot be passed as parameter markers
*----------------------------------------------------------------*
*---------------------
*/
  
  import com.cloudframe.app.db2funci.Db2funciCtx.*;
  import com.cloudframe.app.db2funci.Db2funciCtx;
  import com.cloudframe.app.process.Db2funci;
  import com.cloudframe.app.process.BaseProcess;
  import org.springframework.web.bind.annotation.GetMapping;
  import org.slf4j.Logger;
  import org.slf4j.LoggerFactory;
  import com.cloudframe.app.exception.CFException;
  import org.springframework.stereotype.Component;
  import org.springframework.web.bind.annotation.RestController;
  import org.springframework.web.bind.annotation.RequestParam;
  import com.cloudframe.app.dto.GlobalExecutorCtx;
  import com.cloudframe.app.db2funci.file.Scanner;
  import org.springframework.beans.factory.annotation.Autowired;
  import org.springframework.beans.factory.annotation.Qualifier;
  import com.cloudframe.app.exception.Terminate;
  import com.cloudframe.app.repository.Db2funciRepository;
  import com.cloudframe.app.utility.CFUtil;
  import java.math.BigDecimal;
  import com.cloudframe.app.dto.ProgramContext;
  import com.cloudframe.app.data.Field;
  import com.cloudframe.app.db2funci.dto.*;
  import com.cloudframe.app.db2funci.dto.HostVariables;
  import com.cloudframe.app.db2funci.dto.Dclscpsectb;
  import com.cloudframe.app.db2funci.dto.Sdms01Parm;
  import com.cloudframe.app.db2funci.dto.Parm;
  import com.cloudframe.app.db2funci.dto.Sqlca;
  import com.cloudframe.app.db2funci.dto.Dcltbdemsec;
  import com.cloudframe.app.db2funci.dto.AcceptInput;
  import com.cloudframe.app.db2funci.dto.Dclvbsscrdt;
  import com.cloudframe.app.db2funci.dto.Dclvmstranb;
  import com.cloudframe.app.db2funci.dto.Bdms01CallParameters;
  import com.cloudframe.app.db2funci.dto.Dclvcrrexrt;
  import com.cloudframe.app.db2funci.dto.C1Dtl;
  import com.cloudframe.app.db2funci.dto.DateFields;
  import com.cloudframe.app.db2funci.dto.Db2Indicators;
  import com.cloudframe.app.db2funci.dto.Dclvmsdxrfk;
  import com.cloudframe.app.db2funci.dto.ParmlstGroup;
  import com.cloudframe.app.db2funci.dto.ApplicationCodeListGroup;
  import com.cloudframe.app.db2funci.dto.Work;
  import com.cloudframe.app.common.CONSTANTS;
  import com.cloudframe.app.common.SQLS;
  import org.springframework.beans.factory.annotation.Value;
  import com.cloudframe.app.dao.Db2Base;
  import java.sql.SQLException;
  
  @Component("db2funci")
  
  public class Db2funciImpl extends CommonProcess implements Db2funci {
  
  Logger logger = LoggerFactory.getLogger(Db2funciImpl.class);
  
  
  @Value("${DB2FUNCI.dbQualifier:}")
  private String dbQualifier;
  
  
  @Autowired 
  @Qualifier("db2Base")
  Db2Base db2Base;
  @Autowired 
  @Qualifier("db2funciRepository")
  Db2funciRepository db2funciRepository;
  
  
  
  
    @Autowired
    @Qualifier("db2funci_scanner")
    Scanner scanner;
  
  
  
      @Override
      public int setParameter(Db2funciCtx programCtx, String parm) throws Exception {
      		if(parm != null)
      		    programCtx.getParm().setString(com.cloudframe.app.data.Field.getParm(parm),new String(CONSTANTS.EBCDIC_ENCODING));
      		setInitDone(false);
      		process(programCtx);
      		return programCtx.getRc();
      }
      /**
      * process 
      * Input  : None 

      * Output : None 

      * @throws CFException
      */
      public int process(Db2funciCtx programCtx) throws Exception {
       try {
       setCodePage("1047");
            // Reset program ended flag
           programCtx.setProgramEnded(false);
      	db2Base.reset("DB2FUNCI" ,dbQualifier, true/*use Dynamic SQL*/);
ProcessInCtx methodIn = programCtx.getProcessInCtx();
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
  *   COBOL Paragraph - 0000-MAIN COBOL Cyclomatic complexity - 8
      * Input  :  

      * - parmLen01                      COBOL Name: LK-PARM-LEN
      * - useSysin                       COBOL Name: LK-USE-SYSIN
      * - command                        COBOL Name: LK-COMMAND
      *
      * Output :  

      * - sysinFlag                      COBOL Name: SYSIN-FLAG
      * - acceptInput                    COBOL Name: WS-ACCEPT-INPUT
      * - scalarFunction                 COBOL Name: WS-SCALAR-FUNCTION
      * - command                        COBOL Name: LK-COMMAND
      *
      * @throws CFException
      */
      @Override
      public MainOutCtx main(MainInCtx methodIn) throws Exception {
			// Declare local variables used in the method
			char[] consoleInput = null;
			// End of variable declaration

      // DECLARE PROP.SCHOLITB TABLE ( ISO_CNTRY_CD                   CHAR(2) NOT NULL, HOLIDAY_DT                     DATE NOT NULL, MIC_CD                         CHAR(4) NOT NULL, HOLIDAY_IND                    CHAR(1) NOT NULL, SOURCE_DSC                     CHAR(15) NOT NULL, UPDATE_SOURCE_ID               CHAR(8), UPDATE_TS                      TIMESTAMP NOT NULL, ORIG_SOURCE_ID                 CHAR(8), ORIG_TS                        TIMESTAMP )
Db2funciCtx programCtx = methodIn.getDb2funciCtx();
MainOutCtx methodOut = methodIn.getMainOutCtx();

// *
//  IF LK-PARM-LEN = 0 OR ( LK-PARM-LEN > 1 AND LK-USE-SYSIN = 'Y' )
//  LITERAL_Y = 'Y'
          if (	( methodIn.getParmLen01() == 0 )  || (	( methodIn.getParmLen01() > 1 )  && compareChars(methodIn.getUseSysin(), CONSTANTS.LITERAL_Y) == 0)) { 
//  SET USE-SYSIN TO TRUE
              methodOut.setUseSysin1True(); 
              
          }
//  IF USE-SYSIN
          if ( methodOut.isUseSysin1()  ) { 
//  MOVE SPACES TO WS-ACCEPT-INPUT
              methodOut.getAcceptInput().setString(CONSTANTS.SPACE_80);
//  PERFORM UNTIL C-TERMINATE
              while ((!(methodOut.isCTerminate()) )) {
//  ACCEPT WS-ACCEPT-INPUT
                  consoleInput = scanner.nextLine();
                  if (!scanner.hasEnded()) {
                     methodOut.getAcceptInput().setString(consoleInput);  // read from console and assign
                  }
//  DISPLAY '-------------------------------------------'
                  logger.info("-------------------------------------------"); 
//  DISPLAY '>>>>>>>> SYSIN Record >>>>>>> ' WS-ACCEPT-INPUT
                  logger.info(">>>>>>>> SYSIN Record >>>>>>> {}", methodOut.getAcceptInput().toString()); 
//  IF C-TERMINATE THEN
//  ELSE
                  if (!(methodOut.isCTerminate()) ) { 
//  PERFORM PROCESS-COMMAND
                      processCommand(programCtx.getProcessCommandInCtx());/*PROCESS-COMMAND*/
                      if (programCtx.isProgramEnded()) {
                          return methodOut;
                      }
                  }
              }
//  DISPLAY '-------------------------------------------'
              logger.info("-------------------------------------------"); 
          }
//  ELSE
          else { 
//  MOVE LK-COMMAND TO WS-SCALAR-FUNCTION
              methodOut.setScalarFunction(methodOut.getCommand());
//  PERFORM PROCESS-COMMAND
              processCommand(programCtx.getProcessCommandInCtx());/*PROCESS-COMMAND*/
              if (programCtx.isProgramEnded()) {
                  return methodOut;
              }
          }
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
//  GOBACK
          setNotLogged(false); // no need to log, it is a normal termination
          programCtx.setProgramEnded(true);
          return methodOut;
      
      }
      /**
      * processCommand 
      *   This method is derived from 
  *   COBOL Paragraph - PROCESS-COMMAND COBOL Cyclomatic complexity - 14
      * Input  :  

      * - scalarFunction                 COBOL Name: WS-SCALAR-FUNCTION
      *
      * Output : None 

      * @throws CFException
      */
      @Override
      public void processCommand(ProcessCommandInCtx methodIn) throws Exception {
Db2funciCtx programCtx = methodIn.getDb2funciCtx();
//  DISPLAY 'Using parm to process command : ' WS-SCALAR-FUNCTION
          logger.info("Using parm to process command : {}", new String(methodIn.getScalarFunction())); 
//  DISPLAY '>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>'
          logger.info(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>"); 
//  DISPLAY ' '
          logger.info(" "); 
//  EVALUATE TRUE
          if  ( methodIn.isCDate()  ) { 
//  PERFORM 1000-DATE
              date1000(programCtx.getDate1000InCtx());/*1000-DATE*/
              if (programCtx.isProgramEnded()) {
                  return ;
              }
          }
          else if  ( methodIn.isCSpGetprml()  ) { 
//  PERFORM 1001-SP-GETPRML
              spGetprml(programCtx.getSpGetprmlInCtx());/*1001-SP-GETPRML*/
              if (programCtx.isProgramEnded()) {
                  return ;
              }
          }
          else if  ( methodIn.isCSpGetdata()  ) { 
//  PERFORM 1002-SP-GETDATA
              spGetdata(programCtx.getSpGetdataInCtx());/*1002-SP-GETDATA*/
              if (programCtx.isProgramEnded()) {
                  return ;
              }
          }
          else if  ( methodIn.isCCursor1()  ) { 
//  PERFORM 1003-CURSOR1
              cursor1(programCtx.getCursor1InCtx());/*1003-CURSOR1*/
              if (programCtx.isProgramEnded()) {
                  return ;
              }
          }
          else if  ( methodIn.isCDateSubstringChar()  ) { 
//  PERFORM 1004-DATE-SUBSTRING-CHAR
              dateSubstringChar(programCtx.getDateSubstringCharInCtx());/*1004-DATE-SUBSTRING-CHAR*/
              if (programCtx.isProgramEnded()) {
                  return ;
              }
          }
          else if  ( methodIn.isCSecurityLookup()  ) { 
//  PERFORM 1005-SECURITY-LOOKUP
              securityLookup(programCtx.getSecurityLookupInCtx());/*1005-SECURITY-LOOKUP*/
              if (programCtx.isProgramEnded()) {
                  return ;
              }
          }
          else if  ( methodIn.isCCurrency()  ) { 
//  PERFORM 1006-CURRENCY
              currency(programCtx.getCurrencyInCtx());/*1006-CURRENCY*/
              if (programCtx.isProgramEnded()) {
                  return ;
              }
          }
          else if  ( methodIn.isCXrefCursor()  ) { 
//  DISPLAY ' '
              logger.info(" "); 
//  DISPLAY '* RUN 1 *'
              logger.info("* RUN 1 *"); 
//  PERFORM 1007-XREF-CURSOR
              xrefCursor(programCtx.getXrefCursorInCtx());/*1007-XREF-CURSOR*/
              if (programCtx.isProgramEnded()) {
                  return ;
              }
//  DISPLAY ' '
              logger.info(" "); 
//  DISPLAY '* RUN 2 *'
              logger.info("* RUN 2 *"); 
//  PERFORM 1007-XREF-CURSOR
              xrefCursor(programCtx.getXrefCursorInCtx());/*1007-XREF-CURSOR*/
              if (programCtx.isProgramEnded()) {
                  return ;
              }
//  DISPLAY ' '
              logger.info(" "); 
//  DISPLAY '* RUN 3 *'
              logger.info("* RUN 3 *"); 
//  PERFORM 1007-XREF-CURSOR
              xrefCursor(programCtx.getXrefCursorInCtx());/*1007-XREF-CURSOR*/
              if (programCtx.isProgramEnded()) {
                  return ;
              }
          }
          else if  ( methodIn.isCIsinCursor()  ) { 
//  PERFORM 1008-ISIN
              isin(programCtx.getIsinInCtx());/*1008-ISIN*/
              if (programCtx.isProgramEnded()) {
                  return ;
              }
          }
          else if  ( methodIn.isCDecimalToFloat()  ) { 
//  PERFORM 1009-DECIMAL-TO-FLOAT
              decimalToFloat(programCtx.getDecimalToFloatInCtx());/*1009-DECIMAL-TO-FLOAT*/
              if (programCtx.isProgramEnded()) {
                  return ;
              }
          }
          else if  ( methodIn.isCSelect1()  ) { 
//  PERFORM 1010-SELECT-1
              select1(programCtx.getSelect1InCtx());/*1010-SELECT-1*/
              if (programCtx.isProgramEnded()) {
                  return ;
              }
          }
          else if  ( methodIn.isCSelectCount()  ) { 
//  PERFORM 1011-SELECT-COUNT
              selectCount(programCtx.getSelectCountInCtx());/*1011-SELECT-COUNT*/
              if (programCtx.isProgramEnded()) {
                  return ;
              }
          }
          else   { 
              ;
          }
          ;
      
      }
      /**
      * date1000 
      *   This method is derived from 
  *   COBOL Paragraph - 1000-DATE COBOL Cyclomatic complexity - 1
      * Input  :  

      * - mthsAgoDate18                  COBOL Name: WS-18MTHS-AGO-DATE
      *
      * Output :  

      * - currentDate                    COBOL Name: WS-CURRENT-DATE
      *
      * @throws CFException
      */
      @Override
      public Date1000OutCtx date1000(Date1000InCtx methodIn) throws Exception {
Db2funciCtx programCtx = methodIn.getDb2funciCtx();
Date1000OutCtx methodOut = methodIn.getDate1000OutCtx();

// *
// SELECT DATE (  ?  )  - 18 MONTHS FROM TBDEMSEC WHERE ISIN = 'DE000PAH0038'

// *
//  MOVE '2021-03-31' TO WS-CURRENT-DATE
//  LITERAL_2021_MN2_0331 = '2021-03-31'
          methodOut.setCurrentDate(CONSTANTS.LITERAL_2021_MN2_0331);
//  SELECT DATE ( ? ) - 18 MONTHS FROM TBDEMSEC WHERE ISIN = 'DE000PAH0038'
          db2funciRepository.selectTbdemsec(methodOut.getDateFields(),programCtx.getSqlca());
//  PERFORM 9000-CHECK-SQLCODE THRU 9000-EXIT
          checkSqlcode(programCtx.getCheckSqlcodeInCtx());/*9000-CHECK-SQLCODE*/
          if (programCtx.isProgramEnded()) {
              return methodOut;
          }

// *

// *
//  DISPLAY 'WS-18MTHS-AGO-DATE = ' WS-18MTHS-AGO-DATE
          logger.info("WS-18MTHS-AGO-DATE = {}", new String(methodIn.getMthsAgoDate18())); 
      
      return methodOut;
      }
      /**
      * spGetprml 
      *   This method is derived from 
  *   COBOL Paragraph - 1001-SP-GETPRML COBOL Cyclomatic complexity - 3
      * Input  :  

      * - sqlcode                        COBOL Name: SQLCODE
      *
      * Output :  

      * - numCursors                     COBOL Name: NUM-CURSORS
      * - procnm                         COBOL Name: PROCNM
      * - schema                         COBOL Name: SCHEMA
      * - parmind                        COBOL Name: PARMIND
      * - sqlcodeDisp                    COBOL Name: SQLCODE-DISP
      * - sqlcode                        COBOL Name: SQLCODE
      *
      * @throws CFException
      */
      @Override
      public SpGetprmlOutCtx spGetprml(SpGetprmlInCtx methodIn) throws Exception {
Db2funciCtx programCtx = methodIn.getDb2funciCtx();
SpGetprmlOutCtx methodOut = methodIn.getSpGetprmlOutCtx();
//  MOVE 1 TO NUM-CURSORS
          methodOut.setNumCursors(1);
          // MOVE 'GETPRML' TO PROCNM
          methodOut.setProcnm(CONSTANTS.LITERAL_GETPRML_B11_);

// *              Input parameter -- procedure to be found

// *              Input parameter -- schema in sysroutines
// CALL GETPRML (  ?   ,    ?   ,    ?   ,    ?   ,    ?   ) 
          // MOVE 'CLOUDFRM' TO SCHEMA
          //  LITERAL_CLOUDFRM = 'CLOUDFRM'
          methodOut.setSchema(CONSTANTS.LITERAL_CLOUDFRM);
          // MOVE -1 TO PARMIND
          methodOut.setParmind((short)-1);
//  CALL GETPRML ( ? , ? , ? , ? , ? )
          db2funciRepository.call(methodOut.getWork(),methodIn.getParmlstGroup(),programCtx.getSqlca());
//  IF NUM-CURSORS > 0 AND SQLCODE NOT EQUAL TO +466 THEN
          if (	( methodOut.getNumCursors() > 0 ) && 	( methodOut.getSqlcode() != 466 )) { 
              // MOVE SQLCODE TO SQLCODE-DISP
              //  FORMAT1484553271 = "-ZZZZ"
              methodOut.setSqlcodeDisp(CFUtil.cobolNumberFormatter(CONSTANTS.FORMAT1484553271,String.valueOf(methodOut.getSqlcode()).toCharArray()));
//  DISPLAY '---SQL ERROR---'
              logger.info("---SQL ERROR---"); 
//  DISPLAY 'SQLCODE  = ' SQLCODE-DISP
              logger.info("SQLCODE  = {}", new String(methodOut.getSqlcodeDisp())); 
          }
//  ELSE
          else { 
//  ASSOCIATE LOCATORS ( ? ) WITH PROCEDURE GETPRML
              db2funciRepository.associate(methodOut.getWork(),programCtx.getSqlca());
//  PERFORM 8000-GET-ISIN-DTLS
              getIsinDtls(programCtx.getGetIsinDtlsInCtx());/*8000-GET-ISIN-DTLS*/
          }
          ;
      
      return methodOut;
      }
      /**
      * getIsinDtls 
      *   This method is derived from 
  *   COBOL Paragraph - 8000-GET-ISIN-DTLS COBOL Cyclomatic complexity - 3
      * Input  :  

      * - sqlcode                        COBOL Name: SQLCODE
      * - isin01                         COBOL Name: ISIN
      * - sedol01                        COBOL Name: SEDOL
      * - ric01                          COBOL Name: RIC
      * - intlkey01                      COBOL Name: INTLKEY
      * - company01                      COBOL Name: COMPANY
      * - country01                      COBOL Name: COUNTRY
      * - currency1                      COBOL Name: CURRENCY1
      * - c1Dtl                          COBOL Name: C1-DTL
      *
      * Output :  

      * - isin                           COBOL Name: WS-ISIN
      * - isin01                         COBOL Name: ISIN
      * - sedol                          COBOL Name: WS-SEDOL
      * - sedol01                        COBOL Name: SEDOL
      * - ric                            COBOL Name: WS-RIC
      * - ric01                          COBOL Name: RIC
      * - intlkey                        COBOL Name: WS-INTLKEY
      * - intlkey01                      COBOL Name: INTLKEY
      * - company                        COBOL Name: WS-COMPANY
      * - company01                      COBOL Name: COMPANY
      * - country                        COBOL Name: WS-COUNTRY
      * - country01                      COBOL Name: COUNTRY
      * - currency                       COBOL Name: WS-CURRENCY
      * - currency1                      COBOL Name: CURRENCY1
      *
      * @throws CFException
      */
      @Override
      public GetIsinDtlsOutCtx getIsinDtls(GetIsinDtlsInCtx methodIn) throws Exception {
      
// *-----------------------------------------------------------------
// ALLOCATE C1 CURSOR FOR RESULT SET  ? 

// *
Db2funciCtx programCtx = methodIn.getDb2funciCtx();
GetIsinDtlsOutCtx methodOut = methodIn.getGetIsinDtlsOutCtx();
//  ALLOCATE C1 CURSOR FOR RESULT SET ?
          db2funciRepository.allocate(methodIn.getWork(),programCtx.getSqlca());
//  DISPLAY 'SECURITIES REPORT :'
          logger.info("SECURITIES REPORT :"); 
//  DISPLAY '-------------------'
          logger.info("-------------------"); 

// *
// FETCH C1 INTO  ?    ,   ?    ,   ?    ,   ?    ,   ?    ,   ?    ,   ?    ,   ?    ,   ?    ,   ?    ,   ? 
//  PERFORM UNTIL SQLCODE = 100
          while ((	( methodOut.getSqlcode() != 100 ))) {
//  FETCH C1 INTO ? , ? , ? , ? , ? , ? , ? , ? , ? , ? , ?
              db2funciRepository.fetchC1Db2funci(programCtx.getC1ResultSet(),programCtx.getSqlca(),methodOut.getDcltbdemsec());
//  IF SQLCODE = 0 THEN
              if (	( methodOut.getSqlcode() == 0 )) { 
//  MOVE ISIN TO WS-ISIN OF C1-DTL
                  methodOut.setIsin(methodOut.getIsin01());
//  MOVE SEDOL TO WS-SEDOL OF C1-DTL
                  methodOut.setSedol(methodOut.getSedol01());
//  MOVE RIC TO WS-RIC OF C1-DTL
                  methodOut.setRic(methodOut.getRic01());
//  MOVE INTLKEY TO WS-INTLKEY OF C1-DTL
                  methodOut.setIntlkey(methodOut.getIntlkey01());
//  MOVE COMPANY TO WS-COMPANY OF C1-DTL
                  methodOut.setCompany(methodOut.getCompany01());
//  MOVE COUNTRY TO WS-COUNTRY OF C1-DTL
                  methodOut.setCountry(methodOut.getCountry01());
//  MOVE CURRENCY1 TO WS-CURRENCY OF C1-DTL
                  methodOut.setCurrency(methodOut.getCurrency1());
//  DISPLAY C1-DTL
                  logger.info(methodIn.getC1Dtl().toString()); 
              }
          }
          ;
      
      return methodOut;
      }
      /**
      * spGetdata 
      *   This method is derived from 
  *   COBOL Paragraph - 1002-SP-GETDATA COBOL Cyclomatic complexity - 2
      * Input  :  

      * - sqlcode                        COBOL Name: SQLCODE
      *
      * Output :  

      * - bdms01CallParameters           COBOL Name: BDMS01-CALL-PARAMETERS
      * - bdms01AdpMasterSegInd          COBOL Name: BDMS01-ADP-MASTER-SEG-IND
      * - bdms01BaseSecuritySegInd       COBOL Name: BDMS01-BASE-SECURITY-SEG-IND
      * - bdms01SecurityTypeSegInd       COBOL Name: BDMS01-SECURITY-TYPE-SEG-IND
      * - sdms01ParmLen                  COBOL Name: SDMS01-PARM-LEN
      * - sdms01ParmData                 COBOL Name: SDMS01-PARM-DATA
      * - bdms01AdpMasterSegSqlcd        COBOL Name: BDMS01-ADP-MASTER-SEG-SQLCD
      * - msdCountryCode                 COBOL Name: MSD-COUNTRY-CODE
      * - msdCountryOfOrigin             COBOL Name: MSD-COUNTRY-OF-ORIGIN
      * - msdAddedCcyymmdd               COBOL Name: MSD-ADDED-CCYYMMDD
      * - msdSecurityDesc1               COBOL Name: MSD-SECURITY-DESC1
      * - bdms01CntryIssueCd             COBOL Name: BDMS01-CNTRY-ISSUE-CD
      * - bdms01CntryOrgnCd              COBOL Name: BDMS01-CNTRY-ORGN-CD
      * - bdms01ClientNbr                COBOL Name: BDMS01-CLIENT-NBR
      * - bdms01McgillCd                 COBOL Name: BDMS01-MCGILL-CD
      * - bdms01CusipCntraNbr            COBOL Name: BDMS01-CUSIP-CNTRA-NBR
      * - msdClassInd                    COBOL Name: MSD-CLASS-IND
      * - bdms01BaseSecuritySegSqlcd     COBOL Name: BDMS01-BASE-SECURITY-SEG-SQLCD
      * - msdIndustrialClass             COBOL Name: MSD-INDUSTRIAL-CLASS
      * - msdAidsCode                    COBOL Name: MSD-AIDS-CODE
      * - msdStkDailyVolume              COBOL Name: MSD-STK-DAILY-VOLUME
      * - msdCurrencyCode                COBOL Name: MSD-CURRENCY-CODE
      * - bdms01RedenominationDt         COBOL Name: BDMS01-REDENOMINATION-DT
      * - bdms01PutStrtDt                COBOL Name: BDMS01-PUT-STRT-DT
      * - bdms01PutTmngCd                COBOL Name: BDMS01-PUT-TMNG-CD
      * - bdms01CallTmngCd               COBOL Name: BDMS01-CALL-TMNG-CD
      * - bdms01OtcBlltnStkInd           COBOL Name: BDMS01-OTC-BLLTN-STK-IND
      * - bdms01SecurityTypeSegSqlcd     COBOL Name: BDMS01-SECURITY-TYPE-SEG-SQLCD
      * - msdTypeOfRecordInd             COBOL Name: MSD-TYPE-OF-RECORD-IND
      * - msdSecurityTypePos1            COBOL Name: MSD-SECURITY-TYPE-POS1
      * - msdSecTypeCodes                COBOL Name: MSD-SEC-TYPE-CODES
      * - msdSecPriceMultiplier          COBOL Name: MSD-SEC-PRICE-MULTIPLIER
      * - bdms01ReturnSqlcode            COBOL Name: BDMS01-RETURN-SQLCODE
      *
      * @throws CFException
      */
      @Override
      public SpGetdataOutCtx spGetdata(SpGetdataInCtx methodIn) throws Exception {
      
// *-----------------------------------------------------------------
Db2funciCtx programCtx = methodIn.getDb2funciCtx();
SpGetdataOutCtx methodOut = methodIn.getSpGetdataOutCtx();
//  INITIALIZE BDMS01-CALL-PARAMETERS
          methodOut.getBdms01CallParameters().initialize();
//  MOVE 'Y' TO BDMS01-ADP-MASTER-SEG-IND
//  LITERAL_Y = 'Y'
          methodOut.setBdms01AdpMasterSegInd(CONSTANTS.LITERAL_Y);
//  MOVE 'Y' TO BDMS01-BASE-SECURITY-SEG-IND
//  LITERAL_Y = 'Y'
          methodOut.setBdms01BaseSecuritySegInd(CONSTANTS.LITERAL_Y);
//  MOVE 'Y' TO BDMS01-SECURITY-TYPE-SEG-IND
//  LITERAL_Y = 'Y'
          methodOut.setBdms01SecurityTypeSegInd(CONSTANTS.LITERAL_Y);
//  MOVE LENGTH OF BDMS01-CALL-PARAMETERS TO SDMS01-PARM-LEN
          methodOut.setSdms01ParmLen((short) Bdms01CallParameters.getBdms01CallParametersFieldLength());
          // MOVE BDMS01-CALL-PARAMETERS TO SDMS01-PARM-DATA
          methodOut.setSdms01ParmData(methodOut.getBdms01CallParameters().toCharArray());
//  CALL GETDATA ( ? )
          db2funciRepository.call1(programCtx.getSqlca(),methodIn.getSdms01Parm());
//  MOVE SDMS01-PARM-DATA TO BDMS01-CALL-PARAMETERS
          methodOut.getBdms01CallParameters().setString(methodOut.getSdms01ParmData());
//  IF SQLCODE = 0
          if (	( methodOut.getSqlcode() == 0 )) { 
//  DISPLAY 'ADP-MASTER-SEG'
              logger.info("ADP-MASTER-SEG"); 
//  DISPLAY '--------------'
              logger.info("--------------"); 
//  DISPLAY ' BDMS01-ADP-MASTER-SEG-SQLCD  =' BDMS01-ADP-MASTER-SEG-SQLCD
              logger.info(" BDMS01-ADP-MASTER-SEG-SQLCD  ={}", String.valueOf(methodOut.getBdms01AdpMasterSegSqlcd())); 
//  DISPLAY ' MSD-COUNTRY-CODE             =' MSD-COUNTRY-CODE
              logger.info(" MSD-COUNTRY-CODE             ={}", new String(methodOut.getMsdCountryCode())); 
//  DISPLAY ' MSD-COUNTRY-OF-ORIGIN        =' MSD-COUNTRY-OF-ORIGIN
              logger.info(" MSD-COUNTRY-OF-ORIGIN        ={}", new String(methodOut.getMsdCountryOfOrigin())); 
//  DISPLAY ' MSD-ADDED-CCYYMMDD           =' MSD-ADDED-CCYYMMDD
              logger.info(" MSD-ADDED-CCYYMMDD           ={}", methodOut.getMsdAddedCcyymmdd().toString()); 
//  DISPLAY ' MSD-SECURITY-DESC1           =' MSD-SECURITY-DESC1
              logger.info(" MSD-SECURITY-DESC1           ={}", methodOut.getMsdSecurityDesc1().toString()); 
//  DISPLAY ' BDMS01-CNTRY-ISSUE-CD        =' BDMS01-CNTRY-ISSUE-CD
              logger.info(" BDMS01-CNTRY-ISSUE-CD        ={}", new String(methodOut.getBdms01CntryIssueCd())); 
//  DISPLAY ' BDMS01-CNTRY-ORGN-CD         =' BDMS01-CNTRY-ORGN-CD
              logger.info(" BDMS01-CNTRY-ORGN-CD         ={}", new String(methodOut.getBdms01CntryOrgnCd())); 
//  DISPLAY ' BDMS01-CLIENT-NBR            =' BDMS01-CLIENT-NBR
              logger.info(" BDMS01-CLIENT-NBR            ={}", new String(methodOut.getBdms01ClientNbr())); 
//  DISPLAY ' BDMS01-MCGILL-CD             =' BDMS01-MCGILL-CD
              logger.info(" BDMS01-MCGILL-CD             ={}", String.valueOf(methodOut.getBdms01McgillCd())); 
//  DISPLAY ' BDMS01-CUSIP-CNTRA-NBR       =' BDMS01-CUSIP-CNTRA-NBR
              logger.info(" BDMS01-CUSIP-CNTRA-NBR       ={}", new String(methodOut.getBdms01CusipCntraNbr())); 
//  DISPLAY ' MSD-CLASS-IND                =' MSD-CLASS-IND
              logger.info(" MSD-CLASS-IND                ={}", new String(methodOut.getMsdClassInd())); 
//  DISPLAY '--------------'
              logger.info("--------------"); 

// *
//  DISPLAY 'BASE-SECURITY-SEG'
              logger.info("BASE-SECURITY-SEG"); 
//  DISPLAY '-----------------'
              logger.info("-----------------"); 
//  DISPLAY ' BDMS01-BASE-SECURITY-SEG-SQLCD =' BDMS01-BASE-SECURITY-SEG-SQLCD
              logger.info(" BDMS01-BASE-SECURITY-SEG-SQLCD ={}", String.valueOf(methodOut.getBdms01BaseSecuritySegSqlcd())); 
//  DISPLAY ' MSD-INDUSTRIAL-CLASS           =' MSD-INDUSTRIAL-CLASS
              logger.info(" MSD-INDUSTRIAL-CLASS           ={}", new String(methodOut.getMsdIndustrialClass())); 
//  DISPLAY ' MSD-AIDS-CODE                  =' MSD-AIDS-CODE
              logger.info(" MSD-AIDS-CODE                  ={}", new String(methodOut.getMsdAidsCode())); 
//  DISPLAY ' MSD-STK-DAILY-VOLUME           =' MSD-STK-DAILY-VOLUME
              logger.info(" MSD-STK-DAILY-VOLUME           ={}", String.valueOf(methodOut.getMsdStkDailyVolume())); 
//  DISPLAY ' MSD-CURRENCY-CODE              =' MSD-CURRENCY-CODE OF BDMS01-BASE-SECURITY-SEG-DATA
              logger.info(" MSD-CURRENCY-CODE              ={}", new String(methodOut.getMsdCurrencyCode())); 
//  DISPLAY ' BDMS01-REDENOMINATION-DT       =' BDMS01-REDENOMINATION-DT
              logger.info(" BDMS01-REDENOMINATION-DT       ={}", new String(methodOut.getBdms01RedenominationDt())); 
//  DISPLAY ' BDMS01-PUT-STRT-DT             =' BDMS01-PUT-STRT-DT
              logger.info(" BDMS01-PUT-STRT-DT             ={}", new String(methodOut.getBdms01PutStrtDt())); 
//  DISPLAY ' BDMS01-PUT-TMNG-CD             =' BDMS01-PUT-TMNG-CD
              logger.info(" BDMS01-PUT-TMNG-CD             ={}", new String(methodOut.getBdms01PutTmngCd())); 
//  DISPLAY ' BDMS01-CALL-TMNG-CD            =' BDMS01-CALL-TMNG-CD
              logger.info(" BDMS01-CALL-TMNG-CD            ={}", new String(methodOut.getBdms01CallTmngCd())); 
//  DISPLAY ' BDMS01-OTC-BLLTN-STK-IND       =' BDMS01-OTC-BLLTN-STK-IND
              logger.info(" BDMS01-OTC-BLLTN-STK-IND       ={}", new String(methodOut.getBdms01OtcBlltnStkInd())); 
//  DISPLAY '-----------------'
              logger.info("-----------------"); 
//  DISPLAY 'BDMS01-SECURITY-TYPE-SEG-IND'
              logger.info("BDMS01-SECURITY-TYPE-SEG-IND"); 
//  DISPLAY '----------------------------'
              logger.info("----------------------------"); 
//  DISPLAY ' BDMS01-SECURITY-TYPE-SEG-SQLCD =' BDMS01-SECURITY-TYPE-SEG-SQLCD
              logger.info(" BDMS01-SECURITY-TYPE-SEG-SQLCD ={}", String.valueOf(methodOut.getBdms01SecurityTypeSegSqlcd())); 
//  DISPLAY ' MSD-TYPE-OF-RECORD-IND         =' MSD-TYPE-OF-RECORD-IND
              logger.info(" MSD-TYPE-OF-RECORD-IND         ={}", new String(methodOut.getMsdTypeOfRecordInd())); 
//  DISPLAY ' MSD-SECURITY-TYPE-POS1         =' MSD-SECURITY-TYPE-POS1
              logger.info(" MSD-SECURITY-TYPE-POS1         ={}", new String(methodOut.getMsdSecurityTypePos1())); 
//  DISPLAY ' MSD-SEC-TYPE-CODES             =' MSD-SEC-TYPE-CODES
              logger.info(" MSD-SEC-TYPE-CODES             ={}", methodOut.getMsdSecTypeCodes().toString()); 
//  DISPLAY ' MSD-SEC-PRICE-MULTIPLIER       =' MSD-SEC-PRICE-MULTIPLIER
              logger.info(" MSD-SEC-PRICE-MULTIPLIER       ={}", new String(methodOut.getMsdSecPriceMultiplier())); 
          }
//  ELSE
          else { 
//  DISPLAY 'CANNOT SELECT FROM GETDATA'
              logger.info("CANNOT SELECT FROM GETDATA"); 
//  DISPLAY 'SQL ERROR CODE = ' BDMS01-RETURN-SQLCODE
              logger.info("SQL ERROR CODE = {}", String.valueOf(methodOut.getBdms01ReturnSqlcode())); 
          }
      
      return methodOut;
      }
      /**
      * cursor1 
      *   This method is derived from 
  *   COBOL Paragraph - 1003-CURSOR1 COBOL Cyclomatic complexity - 1
      * Input  : None 

      * Output : None 

      * @throws CFException
      */
      @Override
      public Cursor1OutCtx cursor1(Cursor1InCtx methodIn) throws Exception {
Db2funciCtx programCtx = methodIn.getDb2funciCtx();
Cursor1OutCtx methodOut = methodIn.getCursor1OutCtx();
//  SELECT X.ADP_NO AS ADP_NO , X.APPL_CODE_CD AS APPL_CODE_CD , T13.SYMBOL AS SYMBOL , T13.CUSIP AS CUSIP , T13.SEDOL AS SEDOL , T13.ISIN AS ISIN , X.FAM_ID AS FAM_ID , T15.FAM_NAME AS FAM_NAME , X.ACCOUNT AS ACCOUNT , X.ACCT_CHK_DIGIT AS ACCT_CHK_DIGIT , T16.MACT_NAME AS ACCT_NAME , DECIMAL ( X.POS_QTY , 18 , 5 ) AS POS_QTY , DECIMAL ( X.PRICE , 17 , 8 ) AS PRICE , X.SOURCE_CD AS SOURCE_CD , X.PRICE_CD AS PRICE_CD , X.SOURCE_ID AS SOURCE_ID , X.SOURCE_TYPE AS SOURCE_TYPE , T13.INSTRUMENT_TYPE1 CONCAT ' ' CONCAT T13.INSTRUMENT_TYPE2 CONCAT ' ' CONCAT T13.EXCHANGE_OR_OTHER AS INSTRUMENT_TYPE , T14.INST_1_DESC CONCAT ' ' CONCAT T14.INST_2_DESC CONCAT ' ' CONCAT T14.EXCH_OTHER_DESC AS INSTRUMENT_DESC FROM ( SELECT T1.ADP_SECURITY_NO AS ADP_NO , T1.APPL_CODE_CD AS APPL_CODE_CD , T1.FAMILY_ID AS FAM_ID , ( T1.OFFICE_ACCOUNT_CD CONCAT T1.ACCT_CURR_CD CONCAT T1.ACCT_TYP ) AS ACCOUNT , T1.ACCT_CHKDIGIT_NO AS ACCT_CHK_DIGIT , T1.SOURCE_CD AS SOURCE_CD , T1.PRICE_CD AS PRICE_CD , MIN ( T1.SOURCE_ID ) AS SOURCE_ID , MIN ( T1.SOURCE_TYP ) AS SOURCE_TYPE , MIN ( T1.PRICE_PRC ) AS PRICE , MIN ( T1.POS_QTY ) AS POS_QTY FROM SCPSECTB T1 WHERE T1.ADP_SECURITY_NO = ? AND ( ( T1.APPL_CODE_CD IN ( ? ) ) OR ( ( ( ? = 'Y' AND T1.APPL_CODE_CD = 'RAP' ) OR ( ? = 'Y' AND T1.APPL_CODE_CD = 'REM' ) OR ( ? = 'Y' AND T1.APPL_CODE_CD = 'RTL' ) ) AND T1.FAMILY_ID = '52V' AND T1.OFFICE_ACCOUNT_CD = 'SHA00001' AND T1.ACCT_CURR_CD = 'USD' AND T1.ACCT_TYP IN ( '1' , '3' ) ) ) AND T1.POS_QTY <> 0 AND T1.SOURCE_DSC <> 'UNPRICED' AND T1.SOURCE_DSC <> 'STALE' AND T1.SOURCE_DSC <> 'EXPIRED' AND ( ( T1.SOURCE_CD <> '999' AND T1.SOURCE_ID <> 'STALE' ) OR T1.SOURCE_CD = '999' ) AND T1.PRICE_PRC <> 0 AND T1.PRICE_CD = ? AND T1.SOURCE_CD = ? GROUP BY T1.ADP_SECURITY_NO , T1.APPL_CODE_CD , T1.FAMILY_ID , T1.OFFICE_ACCOUNT_CD , T1.ACCT_CURR_CD , T1.ACCT_TYP , T1.ACCT_CHKDIGIT_NO , T1.SOURCE_CD , T1.PRICE_CD ) X LEFT OUTER JOIN SCSECXTB T13 ON T13.ADP_SECURITY_NO = X.ADP_NO LEFT OUTER JOIN SCINSTTB T14 ON T14.INSTRUMENT_TYPE1 = T13.INSTRUMENT_TYPE1 AND T14.INSTRUMENT_TYPE2 = T13.INSTRUMENT_TYPE2 AND T14.EXCHANGE_OR_OTHER = T13.EXCHANGE_OR_OTHER LEFT OUTER JOIN CLOUDFRM.SPCFAMTB T15 ON T15.FAM_NUMBER = X.FAM_ID LEFT OUTER JOIN CLOUDFRM.SPCACTTB T16 ON T16.MACT_OFFICE = SUBSTR ( X.ACCOUNT , 01 , 03 ) AND T16.MACT_ACCT_NO = SUBSTR ( X.ACCOUNT , 04 , 05 ) AND T16.ACCT_CURR_BSC = SUBSTR ( X.ACCOUNT , 09 , 03 ) AND T16.ACCT_TYP = SUBSTR ( X.ACCOUNT , 12 , 01 ) ORDER BY 1 , 2 FOR FETCH ONLY
          programCtx.setPositionCursorResultSet(db2funciRepository.openPositionCursorDb2funci(methodIn.getHostVariables(),programCtx.getSqlca(),methodIn.getDclscpsectb(),methodIn.getApplicationCodeListGroup()));
//  PERFORM 9000-CHECK-SQLCODE THRU 9000-EXIT
          checkSqlcode(programCtx.getCheckSqlcodeInCtx());/*9000-CHECK-SQLCODE*/
          if (programCtx.isProgramEnded()) {
              return methodOut;
          }
          ;
      
      return methodOut;
      }
      /**
      * dateSubstringChar 
      *   This method is derived from 
  *   COBOL Paragraph - 1004-DATE-SUBSTRING-CHAR COBOL Cyclomatic complexity - 1
      * Input  :  

      * - lastDayDt                      COBOL Name: WS-LAST-DAY-DT
      *
      * Output :  

      * - currentDate                    COBOL Name: WS-CURRENT-DATE
      *
      * @throws CFException
      */
      @Override
      public DateSubstringCharOutCtx dateSubstringChar(DateSubstringCharInCtx methodIn) throws Exception {
Db2funciCtx programCtx = methodIn.getDb2funciCtx();
DateSubstringCharOutCtx methodOut = methodIn.getDateSubstringCharOutCtx();
//  MOVE '2021-06-19' TO WS-CURRENT-DATE
//  LITERAL_2021_MN2_0619 = '2021-06-19'
          methodOut.setCurrentDate(CONSTANTS.LITERAL_2021_MN2_0619);
//  SELECT DATE ( SUBSTR ( CHAR ( ? ) , 1 , 8 ) || '01' ) + 1 MONTH - 1 DAY FROM SYSIBM.SYSDUMMY1 WITH UR
          db2funciRepository.selectSysdummy1(methodOut.getDateFields(),programCtx.getSqlca());
//  PERFORM 9000-CHECK-SQLCODE THRU 9000-EXIT
          checkSqlcode(programCtx.getCheckSqlcodeInCtx());/*9000-CHECK-SQLCODE*/
          if (programCtx.isProgramEnded()) {
              return methodOut;
          }

// *

// *
//  DISPLAY 'WS-LAST-DAY-DT     = ' WS-LAST-DAY-DT
          logger.info("WS-LAST-DAY-DT     = {}", new String(methodIn.getLastDayDt())); 
          ;
      
      return methodOut;
      }
      /**
      * securityLookup 
      *   This method is derived from 
  *   COBOL Paragraph - 1005-SECURITY-LOOKUP COBOL Cyclomatic complexity - 8
      * Input  :  

      * - trmlCd                         COBOL Name: TRML-CD
      * - tranCd                         COBOL Name: TRAN-CD
      * - addedTmstp                     COBOL Name: ADDED-TMSTP
      * - doNotUseDtNull                 COBOL Name: DO-NOT-USE-DT-NULL
      * - doNotUseDt                     COBOL Name: DO-NOT-USE-DT
      * - srceSetupSecCd                 COBOL Name: SRCE-SETUP-SEC-CD
      * - securityIdaCd                  COBOL Name: SECURITY-IDA-CD
      * - typeSecurityCd                 COBOL Name: TYPE-SECURITY-CD
      * - cntryIssueCd                   COBOL Name: CNTRY-ISSUE-CD
      * - cntryOrgnCd                    COBOL Name: CNTRY-ORGN-CD
      * - clientNbrNull                  COBOL Name: CLIENT-NBR-NULL
      * - clientNbr                      COBOL Name: CLIENT-NBR
      * - descSecTxt                     COBOL Name: DESC-SEC-TXT
      * - classInd                       COBOL Name: CLASS-IND
      * - secLckdInd                     COBOL Name: SEC-LCKD-IND
      * - bdms01FatcaCd                  COBOL Name: BDMS01-FATCA-CD
      * - bdms01FatcaOvrrdCd             COBOL Name: BDMS01-FATCA-OVRRD-CD
      * - bdms01FatcaCdCalcInd           COBOL Name: BDMS01-FATCA-CD-CALC-IND
      * - mcgillCdNull                   COBOL Name: MCGILL-CD-NULL
      * - mcgillCd                       COBOL Name: MCGILL-CD
      * - cusipCntraNbrNull              COBOL Name: CUSIP-CNTRA-NBR-NULL
      * - cusipCntraNbr                  COBOL Name: CUSIP-CNTRA-NBR
      * - symblTrdsAsCdNull              COBOL Name: SYMBL-TRDS-AS-CD-NULL
      * - symblTrdsAsCd                  COBOL Name: SYMBL-TRDS-AS-CD
      * - symblTrdsWhiNull               COBOL Name: SYMBL-TRDS-WHI-NULL
      * - symblTrdsWhiCd                 COBOL Name: SYMBL-TRDS-WHI-CD
      * - mtrlMdfdDtNull                 COBOL Name: MTRL-MDFD-DT-NULL
      * - bdms01MtrlMdfdDt               COBOL Name: BDMS01-MTRL-MDFD-DT
      *
      * Output :  

      * - securityAdpNbr                 COBOL Name: SECURITY-ADP-NBR
      *
      * @throws CFException
      */
      @Override
      public SecurityLookupOutCtx securityLookup(SecurityLookupInCtx methodIn) throws Exception {
Db2funciCtx programCtx = methodIn.getDb2funciCtx();
SecurityLookupOutCtx methodOut = methodIn.getSecurityLookupOutCtx();
          // MOVE '1234567' TO SECURITY-ADP-NBR OF DCLVMSTRANB
          //  LITERAL_1234567 = '1234567'
          methodOut.setSecurityAdpNbr(CONSTANTS.LITERAL_1234567);
//  SELECT TRML_CD , TRAN_CD , ADDED_TMSTP , DO_NOT_USE_DT , SRCE_SETUP_SEC_CD , SECURITY_IDA_CD , TYPE_SECURITY_CD , CNTRY_ISSUE_CD , CNTRY_ORGN_CD , A.CLIENT_NBR , DESC_SEC_TXT , MCGILL_CD , CUSIP_CNTRA_NBR , CLASS_IND , SYMBL_TRDS_AS_CD , SYMBL_TRDS_WHI_CD , SEC_LCKD_IND , FATCA_CD , MTRL_MDFD_DT , FATCA_OVRRD_CD , FATCA_CD_CALC_IND FROM CLOUDFRM.TMASTER_ADP_NUMBER A WHERE SECURITY_ADP_NBR = ? WITH UR
          db2funciRepository.selectTmasterAdpNumber(methodOut.getDb2Indicators(),programCtx.getSqlca(),methodOut.getBdms01CallParameters(),methodOut.getDclvmstranb());
//  DISPLAY ' TRML-CD                 = ' TRML-CD
          logger.info(" TRML-CD                 = {}", new String(methodIn.getTrmlCd())); 
//  DISPLAY ' TRAN-CD                 = ' TRAN-CD
          logger.info(" TRAN-CD                 = {}", new String(methodIn.getTranCd())); 
//  DISPLAY ' ADDED-TMSTP             = ' ADDED-TMSTP
          logger.info(" ADDED-TMSTP             = {}", new String(methodIn.getAddedTmstp())); 
//  IF DO-NOT-USE-DT-NULL = -1
          if (	( methodIn.getDoNotUseDtNull() == -1 ) ) { 
//  DISPLAY ' DO-NOT-USE-DT           = NULL'
              logger.info(" DO-NOT-USE-DT           = NULL"); 
          }
//  ELSE
          else { 
//  DISPLAY ' DO-NOT-USE-DT           = ' DO-NOT-USE-DT
              logger.info(" DO-NOT-USE-DT           = {}", new String(methodIn.getDoNotUseDt())); 
          }
//  DISPLAY ' SRCE-SETUP-SEC-CD       = ' SRCE-SETUP-SEC-CD
          logger.info(" SRCE-SETUP-SEC-CD       = {}", new String(methodIn.getSrceSetupSecCd())); 
//  DISPLAY ' SECURITY-IDA-CD         = ' SECURITY-IDA-CD
          logger.info(" SECURITY-IDA-CD         = {}", new String(methodIn.getSecurityIdaCd())); 
//  DISPLAY ' TYPE-SECURITY-CD        = ' TYPE-SECURITY-CD
          logger.info(" TYPE-SECURITY-CD        = {}", new String(methodIn.getTypeSecurityCd())); 
//  DISPLAY ' CNTRY-ISSUE-CD          = ' CNTRY-ISSUE-CD
          logger.info(" CNTRY-ISSUE-CD          = {}", new String(methodIn.getCntryIssueCd())); 
//  DISPLAY ' CNTRY-ORGN-CD           = ' CNTRY-ORGN-CD
          logger.info(" CNTRY-ORGN-CD           = {}", new String(methodIn.getCntryOrgnCd())); 
//  IF CLIENT-NBR-NULL = -1
          if (	( methodIn.getClientNbrNull() == -1 ) ) { 
//  DISPLAY ' CLIENT-NBR              = NULL'
              logger.info(" CLIENT-NBR              = NULL"); 
          }
//  ELSE
          else { 
//  DISPLAY ' CLIENT-NBR              = ' CLIENT-NBR
              logger.info(" CLIENT-NBR              = {}", new String(methodIn.getClientNbr())); 
          }
//  DISPLAY ' DESC-SEC-TXT            = ' DESC-SEC-TXT
          logger.info(" DESC-SEC-TXT            = {}", new String(methodIn.getDescSecTxt())); 
//  DISPLAY ' CLASS-IND               = ' CLASS-IND
          logger.info(" CLASS-IND               = {}", new String(methodIn.getClassInd())); 
//  DISPLAY ' SEC-LCKD-IND            = ' SEC-LCKD-IND
          logger.info(" SEC-LCKD-IND            = {}", new String(methodIn.getSecLckdInd())); 
//  DISPLAY ' BDMS01-FATCA-CD         = ' BDMS01-FATCA-CD
          logger.info(" BDMS01-FATCA-CD         = {}", new String(methodIn.getBdms01FatcaCd())); 
//  DISPLAY ' BDMS01-FATCA-OVRRD-CD   = ' BDMS01-FATCA-OVRRD-CD
          logger.info(" BDMS01-FATCA-OVRRD-CD   = {}", new String(methodIn.getBdms01FatcaOvrrdCd())); 
//  DISPLAY ' BDMS01-FATCA-CD-CALC-IND= ' BDMS01-FATCA-CD-CALC-IND
          logger.info(" BDMS01-FATCA-CD-CALC-IND= {}", new String(methodIn.getBdms01FatcaCdCalcInd())); 
//  IF MCGILL-CD-NULL = -1
          if (	( methodIn.getMcgillCdNull() == -1 ) ) { 
//  DISPLAY ' MCGILL-CD               = NULL'
              logger.info(" MCGILL-CD               = NULL"); 
          }
//  ELSE
          else { 
//  DISPLAY ' MCGILL-CD               = ' MCGILL-CD
              logger.info(" MCGILL-CD               = {}", String.valueOf(methodIn.getMcgillCd())); 
          }
//  IF CUSIP-CNTRA-NBR-NULL = -1
          if (	( methodIn.getCusipCntraNbrNull() == -1 ) ) { 
//  DISPLAY ' CUSIP-CNTRA-NBR         = NULL'
              logger.info(" CUSIP-CNTRA-NBR         = NULL"); 
          }
//  ELSE
          else { 
//  DISPLAY ' CUSIP-CNTRA-NBR         = ' CUSIP-CNTRA-NBR
              logger.info(" CUSIP-CNTRA-NBR         = {}", new String(methodIn.getCusipCntraNbr())); 
          }
//  IF SYMBL-TRDS-AS-CD-NULL = -1
          if (	( methodIn.getSymblTrdsAsCdNull() == -1 ) ) { 
//  DISPLAY ' SYMBL-TRDS-AS-CD        = NULL'
              logger.info(" SYMBL-TRDS-AS-CD        = NULL"); 
          }
//  ELSE
          else { 
//  DISPLAY ' SYMBL-TRDS-AS-CD        = ' SYMBL-TRDS-AS-CD
              logger.info(" SYMBL-TRDS-AS-CD        = {}", new String(methodIn.getSymblTrdsAsCd())); 
          }
//  IF SYMBL-TRDS-WHI-NULL = -1
          if (	( methodIn.getSymblTrdsWhiNull() == -1 ) ) { 
//  DISPLAY ' SYMBL-TRDS-WHI-CD       = NULL'
              logger.info(" SYMBL-TRDS-WHI-CD       = NULL"); 
          }
//  ELSE
          else { 
//  DISPLAY ' SYMBL-TRDS-WHI-CD       = ' SYMBL-TRDS-WHI-CD
              logger.info(" SYMBL-TRDS-WHI-CD       = {}", new String(methodIn.getSymblTrdsWhiCd())); 
          }
//  IF MTRL-MDFD-DT-NULL = -1
          if (	( methodIn.getMtrlMdfdDtNull() == -1 ) ) { 
//  DISPLAY ' BDMS01-MTRL-MDFD-DT     = NULL'
              logger.info(" BDMS01-MTRL-MDFD-DT     = NULL"); 
          }
//  ELSE
          else { 
//  DISPLAY ' BDMS01-MTRL-MDFD-DT     = ' BDMS01-MTRL-MDFD-DT
              logger.info(" BDMS01-MTRL-MDFD-DT     = {}", new String(methodIn.getBdms01MtrlMdfdDt())); 
          }
//  PERFORM 9000-CHECK-SQLCODE THRU 9000-EXIT
          checkSqlcode(programCtx.getCheckSqlcodeInCtx());/*9000-CHECK-SQLCODE*/
          if (programCtx.isProgramEnded()) {
              return methodOut;
          }
          ;
      
      return methodOut;
      }
      /**
      * currency 
      *   This method is derived from 
  *   COBOL Paragraph - 1006-CURRENCY COBOL Cyclomatic complexity - 1
      * Input  :  

      * - exchangeRateAmt                COBOL Name: EXCHANGE-RATE-AMT
      *
      * Output :  

      * - currencyCd                     COBOL Name: CURRENCY-CD
      * - decimalEdit                    COBOL Name: DECIMAL-EDIT
      * - exchangeRateAmt                COBOL Name: EXCHANGE-RATE-AMT
      *
      * @throws CFException
      */
      @Override
      public CurrencyOutCtx currency(CurrencyInCtx methodIn) throws Exception {
Db2funciCtx programCtx = methodIn.getDb2funciCtx();
CurrencyOutCtx methodOut = methodIn.getCurrencyOutCtx();
//  MOVE 'US' TO CURRENCY-CD OF DCLVCRREXRT
//  LITERAL_US = 'US'
          methodOut.setCurrencyCd(CONSTANTS.LITERAL_US);
//  SELECT EXCHANGE_RATE_AMT FROM CLOUDFRM.TCRRNCY_EXCH_RATE WHERE CURRENCY_CD = ? WITH UR
          db2funciRepository.selectTcrrncyExchRate(methodOut.getDclvcrrexrt(),programCtx.getSqlca());
//  PERFORM 9000-CHECK-SQLCODE THRU 9000-EXIT
          checkSqlcode(programCtx.getCheckSqlcodeInCtx());/*9000-CHECK-SQLCODE*/
          if (programCtx.isProgramEnded()) {
              return methodOut;
          }

// *
//  MOVE EXCHANGE-RATE-AMT TO DECIMAL-EDIT
//  FORMAT_2056242199 = "-ZZZZZZZZ9.99999"
          methodOut.setDecimalEdit(CFUtil.cobolNumberFormatter(CONSTANTS.FORMAT_2056242199,methodOut.getExchangeRateAmt().toPlainString().toCharArray()));
//  DISPLAY 'EXCHANGE-RATE-AMT = ' DECIMAL-EDIT
          logger.info("EXCHANGE-RATE-AMT = {}", new String(methodOut.getDecimalEdit())); 
          ;
      
      return methodOut;
      }
      /**
      * xrefCursor 
      *   This method is derived from 
  *   COBOL Paragraph - 1007-XREF-CURSOR COBOL Cyclomatic complexity - 5
      * Input  :  

      * - sqlcode                        COBOL Name: SQLCODE
      * - crossReferenceCd               COBOL Name: CROSS-REFERENCE-CD
      * - typeXrefCd                     COBOL Name: TYPE-XREF-CD
      *
      * Output :  

      * - securityAdpNbr01               COBOL Name: SECURITY-ADP-NBR
      *
      * @throws CFException
      */
      @Override
      public XrefCursorOutCtx xrefCursor(XrefCursorInCtx methodIn) throws Exception {
Db2funciCtx programCtx = methodIn.getDb2funciCtx();
XrefCursorOutCtx methodOut = methodIn.getXrefCursorOutCtx();
          // MOVE '1234567' TO SECURITY-ADP-NBR OF DCLVMSDXRFK
          //  LITERAL_1234567 = '1234567'
          methodOut.setSecurityAdpNbr01(CONSTANTS.LITERAL_1234567);
//  SELECT CROSS_REFERENCE_CD , TYPE_XREF_CD FROM CLOUDFRM.TMSD_XREF_KEYS WHERE SECURITY_ADP_NBR = ? AND TYPE_XREF_CD IN ( 'CU' , 'CB' , 'SY' , 'SW' , 'IS' , 'SD' , 'EU' , 'CI' , 'CM' , 'OC' , 'OP' , 'D' ) UNION SELECT SECURITY_ADP_NBR , TYPE_XREF_CD FROM CLOUDFRM.TMSD_XREF_KEYS WHERE CROSS_REFERENCE_CD = ? AND TYPE_XREF_CD = 'D' WITH UR
          programCtx.setXrefCursorResultSet(db2funciRepository.openXrefCursorDb2funci(programCtx.getSqlca(),methodOut.getDclvmsdxrfk()));
//  PERFORM 9000-CHECK-SQLCODE THRU 9000-EXIT
          checkSqlcode(programCtx.getCheckSqlcodeInCtx());/*9000-CHECK-SQLCODE*/
          if (programCtx.isProgramEnded()) {
              return methodOut;
          }

// *
// FETCH XREF-CURSOR INTO   ?    ,   ? 
//  PERFORM UNTIL SQLCODE NOT = 0
          while ((	( methodOut.getSqlcode() == 0 ))) {
//  FETCH XREF-CURSOR INTO ? , ?
              db2funciRepository.fetchXrefCursorDb2funci(programCtx.getXrefCursorResultSet(),programCtx.getSqlca(),methodOut.getDclvmsdxrfk());
//  EVALUATE SQLCODE
              switch(methodOut.getSqlcode()){
              	case 0:
//  DISPLAY '|'
                  logger.info("|"); 
//  DISPLAY '| CROSS-REFERENCE-CD = ' CROSS-REFERENCE-CD OF DCLVMSDXRFK
                  logger.info("| CROSS-REFERENCE-CD = {}", new String(methodIn.getCrossReferenceCd())); 
//  DISPLAY '| TYPE-XREF-CD       = ' TYPE-XREF-CD OF DCLVMSDXRFK
                  logger.info("| TYPE-XREF-CD       = {}", new String(methodIn.getTypeXrefCd())); 
              break;
              	case 100:
              break;
              default :
//  PERFORM 9000-CHECK-SQLCODE THRU 9000-EXIT
                  checkSqlcode(programCtx.getCheckSqlcodeInCtx());/*9000-CHECK-SQLCODE*/
                  if (programCtx.isProgramEnded()) {
                      return methodOut;
                  }
              }
          }
//  CLOSE XREF-CURSOR
          db2funciRepository.closeXrefCursorDb2funci(programCtx.getXrefCursorResultSet(),programCtx.getSqlca());
//  PERFORM 9000-CHECK-SQLCODE THRU 9000-EXIT
          checkSqlcode(programCtx.getCheckSqlcodeInCtx());/*9000-CHECK-SQLCODE*/
          if (programCtx.isProgramEnded()) {
              return methodOut;
          }
          ;
      
      return methodOut;
      }
      /**
      * isin 
      *   This method is derived from 
  *   COBOL Paragraph - 1008-ISIN COBOL Cyclomatic complexity - 12
      * Input  :  

      * - isinCursorFlg                  COBOL Name: ISIN-CURSOR-FLG
      * - isin01                         COBOL Name: ISIN
      * - company01                      COBOL Name: COMPANY
      *
      * Output :  

      * - isinCnt                        COBOL Name: ISIN-CNT
      * - isinCursorFlg                  COBOL Name: ISIN-CURSOR-FLG
      * - isin01                         COBOL Name: ISIN
      *
      * @throws CFException
      */
      @Override
      public IsinOutCtx isin(IsinInCtx methodIn) throws Exception {
Db2funciCtx programCtx = methodIn.getDb2funciCtx();
IsinOutCtx methodOut = methodIn.getIsinOutCtx();
          // MOVE 0 TO ISIN-CNT
          methodOut.setIsinCnt((long)0);
//  SELECT ISIN , SEDOL , RIC , INTLKEY , COMPANY , COUNTRY , INDUSTRY , SECTOR , FFMCAPMILUSD , SECTORWEIGHT FROM TBDEMSEC ORDER BY ISIN
          programCtx.setIsinCursorResultSet(db2funciRepository.openIsinCursorDb2funci(programCtx.getSqlca()));
//  PERFORM 9000-CHECK-SQLCODE THRU 9000-EXIT
          checkSqlcode(programCtx.getCheckSqlcodeInCtx());/*9000-CHECK-SQLCODE*/
          if (programCtx.isProgramEnded()) {
              return methodOut;
          }

// *
// FETCH ISIN-CURSOR INTO   ?    ,   ?    ,   ?    ,   ?    ,   ?    ,   ?    ,   ?    ,   ?    ,   ?    ,   ? 
//  PERFORM UNTIL EOC-ISIN-CURSOR
          while ((!(methodOut.isEocIsinCursor()) )) {
//  FETCH ISIN-CURSOR INTO ? , ? , ? , ? , ? , ? , ? , ? , ? , ?
              db2funciRepository.fetchIsinCursorDb2funci(programCtx.getIsinCursorResultSet(),programCtx.getSqlca(),methodOut.getDcltbdemsec());
//  EVALUATE SQLCODE
              switch(methodOut.getSqlcode()){
              	case 0:
//  DISPLAY '> ' ISIN ' : ' COMPANY
                  logger.info("> {} : {}", new String(methodOut.getIsin01()), new String(methodIn.getCompany01())); 
//  ADD 1 TO ISIN-CNT
                  methodOut.setIsinCnt(methodOut.getIsinCnt()+(long)1);
//  UPDATE TBDEMSEC SET COMPANY = ? WHERE ISIN = ?
                  db2funciRepository.updateTbdemsec1(programCtx.getSqlca(),methodOut.getDcltbdemsec());
//  PERFORM 9000-CHECK-SQLCODE THRU 9000-EXIT
                  checkSqlcode(programCtx.getCheckSqlcodeInCtx());/*9000-CHECK-SQLCODE*/
                  if (programCtx.isProgramEnded()) {
                      return methodOut;
                  }
              break;
              	case 100:
//  SET EOC-ISIN-CURSOR TO TRUE
                  methodOut.setEocIsinCursorTrue(); 
                  
              break;
              default :
//  PERFORM 9000-CHECK-SQLCODE THRU 9000-EXIT
                  checkSqlcode(programCtx.getCheckSqlcodeInCtx());/*9000-CHECK-SQLCODE*/
                  if (programCtx.isProgramEnded()) {
                      return methodOut;
                  }
              }
//  IF EOC-ISIN-CURSOR
//  ELSE
              if (!(methodOut.isEocIsinCursor()) ) { 
//  IF ISIN-CNT = 3
                  if (	( methodOut.getIsinCnt() == 3 ) ) { 
//  MOVE 'IN0000123456' TO ISIN
//  LITERAL_IN0000123456 = 'IN0000123456'
                      methodOut.setIsin01(CONSTANTS.LITERAL_IN0000123456);
//  SELECT ISIN FROM TBDEMSEC WHERE ISIN = ?
                      db2funciRepository.selectTbdemsec1(programCtx.getSqlca(),methodOut.getDcltbdemsec());
                  }
//  IF ISIN-CNT = 2 OR 4 OR 6 OR 8 OR 10
                  if (	( methodOut.getIsinCnt() == 2 )  || 	( methodOut.getIsinCnt() == 4 )  || 	( methodOut.getIsinCnt() == 6 )  || 	( methodOut.getIsinCnt() == 8 )  || 	( methodOut.getIsinCnt() == 10 ) ) { 
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
//  PERFORM 9000-CHECK-SQLCODE THRU 9000-EXIT
                      checkSqlcode(programCtx.getCheckSqlcodeInCtx());/*9000-CHECK-SQLCODE*/
                      if (programCtx.isProgramEnded()) {
                          return methodOut;
                      }
                  }
              }
          }
//  DISPLAY 'TOTAL ISINs Fetched = ' ISIN-CNT
          logger.info("TOTAL ISINs Fetched = {}", String.valueOf(methodOut.getIsinCnt())); 
//  CLOSE ISIN-CURSOR
          db2funciRepository.closeIsinCursorDb2funci(programCtx.getIsinCursorResultSet(),programCtx.getSqlca());
//  PERFORM 9000-CHECK-SQLCODE THRU 9000-EXIT
          checkSqlcode(programCtx.getCheckSqlcodeInCtx());/*9000-CHECK-SQLCODE*/
          if (programCtx.isProgramEnded()) {
              return methodOut;
          }
          ;
      
      return methodOut;
      }
      /**
      * decimalToFloat 
      *   This method is derived from 
  *   COBOL Paragraph - 1009-DECIMAL-TO-FLOAT COBOL Cyclomatic complexity - 4
      * Input  :  

      * - yieldBidNull                   COBOL Name: YIELD-BID-NULL
      * - yieldBidPct                    COBOL Name: YIELD-BID-PCT
      * - putNtcMinNull                  COBOL Name: PUT-NTC-MIN-NULL
      * - putNtcMinDyQty                 COBOL Name: PUT-NTC-MIN-DY-QTY
      * - putNtcMaxNull                  COBOL Name: PUT-NTC-MAX-NULL
      * - putNtcMaxDyQty                 COBOL Name: PUT-NTC-MAX-DY-QTY
      * - cntngYldRt                     COBOL Name: WS-CNTNG-YLD-RT
      *
      * Output :  

      * - bdms01CntngYldRt               COBOL Name: BDMS01-CNTNG-YLD-RT
      * - cntngYldRt                     COBOL Name: WS-CNTNG-YLD-RT
      * - bdms01CntngYldRtEdt            COBOL Name: BDMS01-CNTNG-YLD-RT-EDT
      *
      * @throws CFException
      */
      @Override
      public DecimalToFloatOutCtx decimalToFloat(DecimalToFloatInCtx methodIn) throws Exception {
Db2funciCtx programCtx = methodIn.getDb2funciCtx();
DecimalToFloatOutCtx methodOut = methodIn.getDecimalToFloatOutCtx();
//  SELECT YIELD_BID_PCT , PUT_NTC_MIN_DY_QTY , PUT_NTC_MAX_DY_QTY , CNTNG_YLD_RT FROM CLOUDFRM.TBASE_SECURITY_DAT A WITH UR
          db2funciRepository.selectTbaseSecurityDat(methodOut.getDb2Indicators(),methodOut.getWork(),methodOut.getDclvbsscrdt(),programCtx.getSqlca());
//  PERFORM 9000-CHECK-SQLCODE THRU 9000-EXIT
          checkSqlcode(programCtx.getCheckSqlcodeInCtx());/*9000-CHECK-SQLCODE*/
          if (programCtx.isProgramEnded()) {
              return methodOut;
          }

// *
//  IF YIELD-BID-NULL = -1
          if (	( methodIn.getYieldBidNull() == -1 ) ) { 
//  DISPLAY 'YIELD-BID-PCT IS NULL'
              logger.info("YIELD-BID-PCT IS NULL"); 
          }
//  ELSE
          else { 
//  DISPLAY 'YIELD-BID-PCT           = ' YIELD-BID-PCT
              logger.info("YIELD-BID-PCT           = {}", new String(methodIn.getYieldBidPct().toPlainString().toCharArray())); 
          }
//  IF PUT-NTC-MIN-NULL = -1
          if (	( methodIn.getPutNtcMinNull() == -1 ) ) { 
//  DISPLAY 'PUT-NTC-MIN-DY-QTY IS NULL'
              logger.info("PUT-NTC-MIN-DY-QTY IS NULL"); 
          }
//  ELSE
          else { 
//  DISPLAY 'PUT-NTC-MIN-DY-QTY      = ' PUT-NTC-MIN-DY-QTY
              logger.info("PUT-NTC-MIN-DY-QTY      = {}", String.valueOf(methodIn.getPutNtcMinDyQty())); 
          }
//  IF PUT-NTC-MAX-NULL = -1
          if (	( methodIn.getPutNtcMaxNull() == -1 ) ) { 
//  DISPLAY 'PUT-NTC-MAX-DY-QTY IS NULL'
              logger.info("PUT-NTC-MAX-DY-QTY IS NULL"); 
          }
//  ELSE
          else { 
//  DISPLAY 'PUT-NTC-MAX-DY-QTY      = ' PUT-NTC-MAX-DY-QTY
              logger.info("PUT-NTC-MAX-DY-QTY      = {}", String.valueOf(methodIn.getPutNtcMaxDyQty())); 
          }
//  MOVE WS-CNTNG-YLD-RT TO BDMS01-CNTNG-YLD-RT
          methodOut.setBdms01CntngYldRt(methodOut.getCntngYldRt());
//  DISPLAY 'BDMS01-CNTNG-YLD-RT     = ' BDMS01-CNTNG-YLD-RT
          logger.info("BDMS01-CNTNG-YLD-RT     = {}", String.valueOf(methodOut.getBdms01CntngYldRt().movePointRight(8))); 
          // MOVE BDMS01-CNTNG-YLD-RT TO BDMS01-CNTNG-YLD-RT-EDT
          //  FORMAT_1371274613 = "ZZZZZZ9.99999999"
          methodOut.setBdms01CntngYldRtEdt(CFUtil.cobolNumberFormatter(CONSTANTS.FORMAT_1371274613,methodOut.getBdms01CntngYldRt().toPlainString().toCharArray()));
//  DISPLAY 'BDMS01-CNTNG-YLD-RT-EDT = ' BDMS01-CNTNG-YLD-RT-EDT
          logger.info("BDMS01-CNTNG-YLD-RT-EDT = {}", new String(methodOut.getBdms01CntngYldRtEdt())); 
          ;
      
      return methodOut;
      }
      /**
      * select1 
      *   This method is derived from 
  *   COBOL Paragraph - 1010-SELECT-1 COBOL Cyclomatic complexity - 1
      * Input  :  

      * - ctryHoliCt                     COBOL Name: WS-CTRY-HOLI-CT
      *
      * Output : None 

      * @throws CFException
      */
      @Override
      public Select1OutCtx select1(Select1InCtx methodIn) throws Exception {
Db2funciCtx programCtx = methodIn.getDb2funciCtx();
Select1OutCtx methodOut = methodIn.getSelect1OutCtx();
//  SELECT 1 FROM SCHOLITB WHERE ISO_CNTRY_CD = 'US' AND HOLIDAY_DT = '2020-04-16' AND HOLIDAY_IND = 'Y' FETCH FIRST 1 ROWS ONLY WITH UR
          db2funciRepository.selectScholitb(methodOut.getWork(),programCtx.getSqlca());
//  PERFORM 9000-CHECK-SQLCODE THRU 9000-EXIT
          checkSqlcode(programCtx.getCheckSqlcodeInCtx());/*9000-CHECK-SQLCODE*/
          if (programCtx.isProgramEnded()) {
              return methodOut;
          }
//  DISPLAY 'WS-CTRY-HOLI-CT = ' WS-CTRY-HOLI-CT
          logger.info("WS-CTRY-HOLI-CT = {}", String.valueOf(methodIn.getCtryHoliCt())); 
          ;
      
      return methodOut;
      }
      /**
      * selectCount 
      *   This method is derived from 
  *   COBOL Paragraph - 1011-SELECT-COUNT COBOL Cyclomatic complexity - 1
      * Input  :  

      * - ctryHoliCt                     COBOL Name: WS-CTRY-HOLI-CT
      *
      * Output : None 

      * @throws CFException
      */
      @Override
      public SelectCountOutCtx selectCount(SelectCountInCtx methodIn) throws Exception {
Db2funciCtx programCtx = methodIn.getDb2funciCtx();
SelectCountOutCtx methodOut = methodIn.getSelectCountOutCtx();
//  SELECT COUNT ( * ) FROM SCHOLITB WHERE ISO_CNTRY_CD = 'US' AND HOLIDAY_DT = '2020-04-16' AND HOLIDAY_IND = 'Y' FETCH FIRST 1 ROWS ONLY WITH UR
          db2funciRepository.selectScholitb1(methodOut.getWork(),programCtx.getSqlca());
//  PERFORM 9000-CHECK-SQLCODE THRU 9000-EXIT
          checkSqlcode(programCtx.getCheckSqlcodeInCtx());/*9000-CHECK-SQLCODE*/
          if (programCtx.isProgramEnded()) {
              return methodOut;
          }
//  DISPLAY 'WS-CTRY-HOLI-CT = ' WS-CTRY-HOLI-CT
          logger.info("WS-CTRY-HOLI-CT = {}", String.valueOf(methodIn.getCtryHoliCt())); 
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
Db2funciCtx programCtx = methodIn.getDb2funciCtx();
CheckSqlcodeOutCtx methodOut = methodIn.getCheckSqlcodeOutCtx();
//  EVALUATE TRUE
          if  (	( methodOut.getSqlcode() == 0 )) { 
              ;
          }
          else   { 
              // MOVE SQLCODE TO SQLCODE-DISP
              //  FORMAT1484553271 = "-ZZZZ"
              methodOut.setSqlcodeDisp(CFUtil.cobolNumberFormatter(CONSTANTS.FORMAT1484553271,String.valueOf(methodOut.getSqlcode()).toCharArray()));
//  DISPLAY '---SQL ERROR---'
              logger.info("---SQL ERROR---"); 
//  DISPLAY 'SQLCODE  = ' SQLCODE-DISP
              logger.info("SQLCODE  = {}", new String(methodOut.getSqlcodeDisp())); 
//  ROLLBACK
              try {
              	// COMMIT
              	// reset SQLCODE
              	methodOut.setSqlcode(0);
                 // execute jdbc commit
                 db2Base.rollback();
              }
               catch (SQLException e) {
                         methodOut.setSqlcode(Db2Base.fillSQLCode(e.getMessage()));
                     }
               catch(Exception e) {
                handleErrorCode(e);
              }
//  STOP RUN
              throw Terminate.TERMINATE;
          }
      
      return methodOut;
      }
  
  
  
      public int call(ProgramContext ctx, Object[] params) throws Exception {
      Db2funciCtx programCtx = (Db2funciCtx) ctx;
      
      int len = params.length;
         if (len > 0 && params[0] != null )
            programCtx.getParm().set((Field)params[0]);
         // invoke the process and return rc
         return process(programCtx);
         
      }
      
      public int call(ProgramContext ctx, Field... parameters) throws Exception {
      Db2funciCtx programCtx = (Db2funciCtx) ctx;
         for (int index = 0; index < parameters.length;index++) {
             switch(index) {
              case 0:
                      if(parameters[index] != null ) {
              		if (parameters[index] instanceof Parm) {
                       	programCtx.setParm((Parm) parameters[index]);
                  	} else {
                       	programCtx.getParm().set(parameters[index]);
                  	}
                  }
                
                  break;
            }
         }
      	return process(programCtx);
      }
      
      
  
  
  
  
  
  }
