  package com.cloudframe.app.process;
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
  
  import org.springframework.web.bind.annotation.GetMapping;
  import org.slf4j.Logger;
  import org.slf4j.LoggerFactory;
  import com.cloudframe.app.exception.CFException;
  import org.springframework.stereotype.Component;
  import org.springframework.web.bind.annotation.RestController;
  import org.springframework.web.bind.annotation.RequestParam;
  import com.cloudframe.app.db2func.file.Scanner;
  import org.springframework.beans.factory.annotation.Autowired;
  import org.springframework.beans.factory.annotation.Qualifier;
  import com.cloudframe.app.exception.Terminate;
  import com.cloudframe.app.repository.Db2funcRepository;
  import com.cloudframe.app.utility.CFUtil;
  import com.cloudframe.app.db2func.dto.Bdms01InputData;
  import com.cloudframe.app.db2func.dto.Bdms01AdpMasterSegData;
  import com.cloudframe.app.db2func.dto.Bdms01BaseSecuritySegData;
  import com.cloudframe.app.db2func.dto.Bdms01SecurityTypeSegData;
  import com.cloudframe.app.db2func.dto.Bdms01ReturnData;
  import com.cloudframe.app.db2func.dto.HostAppCodeTbl;
  import com.cloudframe.app.db2func.dto.Bdms01AdpMasterExpData;
  import java.math.BigDecimal;
  import com.cloudframe.app.db2func.dto.Bdms01BaseSecurityExpData;
  import com.cloudframe.app.data.Field;
  import com.cloudframe.app.db2func.dto.*;
  import com.cloudframe.app.db2func.dto.Dclscpsectb;
  import com.cloudframe.app.db2func.dto.Sdms01Parm;
  import com.cloudframe.app.db2func.dto.Sqlca;
  import com.cloudframe.app.db2func.dto.Parm;
  import com.cloudframe.app.db2func.dto.HostVariables;
  import com.cloudframe.app.db2func.dto.DateFields;
  import com.cloudframe.app.db2func.dto.Dclvcrrexrt;
  import com.cloudframe.app.db2func.dto.Bdms01CallParameters;
  import com.cloudframe.app.db2func.dto.Dcltbdemsec;
  import com.cloudframe.app.db2func.dto.Db2Indicators;
  import com.cloudframe.app.db2func.dto.Dclvbsscrdt;
  import com.cloudframe.app.db2func.dto.C1Dtl;
  import com.cloudframe.app.db2func.dto.AcceptInput;
  import com.cloudframe.app.db2func.dto.Dclvmstranb;
  import com.cloudframe.app.db2func.dto.Dclvmsdxrfk;
  import com.cloudframe.app.db2func.dto.ParmlstGroup;
  import com.cloudframe.app.db2func.dto.ApplicationCodeListGroup;
  import com.cloudframe.app.db2func.dto.Work;
  import com.cloudframe.app.common.CONSTANTS;
  import com.cloudframe.app.common.SQLS;
  import org.springframework.beans.factory.annotation.Value;
  import com.cloudframe.app.dao.Db2Base;
  import java.sql.SQLException;
  
  @Component("db2func")
  
  public class Db2func extends CommonProcess {
  
  Logger logger = LoggerFactory.getLogger(Db2func.class);
  
  private Dclscpsectb dclscpsectb = new Dclscpsectb() ;
  private Sdms01Parm sdms01Parm = new Sdms01Parm() ;
  private Sqlca sqlca = new Sqlca() ;
  private Parm parm = new Parm() ;
  private HostVariables hostVariables = new HostVariables() ;
  private DateFields dateFields = new DateFields() ;
  private Dclvcrrexrt dclvcrrexrt = new Dclvcrrexrt() ;
  private Bdms01CallParameters bdms01CallParameters = new Bdms01CallParameters() ;
  private Dcltbdemsec dcltbdemsec = new Dcltbdemsec() ;
  private Db2Indicators db2Indicators = new Db2Indicators() ;
  private Dclvbsscrdt dclvbsscrdt = new Dclvbsscrdt() ;
  private C1Dtl c1Dtl = new C1Dtl() ;
  private AcceptInput acceptInput = new AcceptInput() ;
  private Dclvmstranb dclvmstranb = new Dclvmstranb() ;
  private Dclvmsdxrfk dclvmsdxrfk = new Dclvmsdxrfk() ;
  private ParmlstGroup parmlstGroup = new ParmlstGroup() ;
  private ApplicationCodeListGroup applicationCodeListGroup = new ApplicationCodeListGroup() ;
  private Work work = new Work() ;
  
  @Value("${DB2FUNC.dbQualifier:}")
  private String dbQualifier;
  
  
  @Autowired 
  @Qualifier("db2Base")
  Db2Base db2Base;
  @Autowired 
  @Qualifier("db2funcRepository")
  Db2funcRepository db2funcRepository;
  
  
  
  
    @Autowired
    @Qualifier("db2func_scanner")
    Scanner scanner;
  
  
  
      public int setParameter(String parm) throws Exception {
      		if(parm != null)
      		    this.parm.setString(com.cloudframe.app.data.Field.getParm(parm),new String(CONSTANTS.EBCDIC_ENCODING));
      		setInitDone(false);
      		process();
      		return getRc();
      }
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
  *   COBOL Paragraph - 0000-MAIN COBOL Cyclomatic complexity - 9
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
      private void main() throws Exception {
			// Declare local variables used in the method
			short parmLen01 = 0;
			char[] useSysin = null;
			char[] consoleInput = null;
			// End of variable declaration


// *
          parmLen01 = parm.getParmLen01();
          useSysin = parm.getUseSysin();
//  IF LK-PARM-LEN = 0 OR ( LK-PARM-LEN > 1 AND LK-USE-SYSIN = 'Y' )
//  LITERAL_Y = 'Y'
          if (	( parmLen01 == 0 )  || (	( parmLen01 > 1 )  && compareChars(useSysin, CONSTANTS.LITERAL_Y) == 0)) { 
//  SET USE-SYSIN TO TRUE
              work.setUseSysin1True(); 
              
          }
  
//  IF USE-SYSIN
          if ( work.isUseSysin1()  ) { 
//  MOVE SPACES TO WS-ACCEPT-INPUT
              acceptInput.setString(CONSTANTS.SPACE_80);
//  PERFORM UNTIL C-TERMINATE
              while ((!(acceptInput.isCTerminate()) )) {
//  ACCEPT WS-ACCEPT-INPUT
                  consoleInput = scanner.nextLine();
                  if (!scanner.hasEnded()) {
                     acceptInput.setString(consoleInput);  // read from console and assign
                  }
//  DISPLAY '-------------------------------------------'
                  logger.info("-------------------------------------------"); 
//  DISPLAY '>>>>>>>> SYSIN Record >>>>>>> ' WS-ACCEPT-INPUT
                  logger.info(">>>>>>>> SYSIN Record >>>>>>> {}", acceptInput.toString()); 
//  IF C-TERMINATE THEN
//  ELSE
                  if (!(acceptInput.isCTerminate()) ) { 
//  PERFORM PROCESS-COMMAND
                      processCommand();/*PROCESS-COMMAND*/
                      if (this.isProgramEnded()) {
                          return ;
                      }
                  }
              }
//  DISPLAY '-------------------------------------------'
              logger.info("-------------------------------------------"); 
          }
//  ELSE
          else { 
//  MOVE LK-COMMAND TO WS-SCALAR-FUNCTION
              acceptInput.setScalarFunction(parm.getCommand());
//  PERFORM PROCESS-COMMAND
              processCommand();/*PROCESS-COMMAND*/
              if (this.isProgramEnded()) {
                  return ;
              }
          }
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
//  GOBACK
          setNotLogged(false); // no need to log, it is a normal termination
          this.setProgramEnded(true);
          return ;
      
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
      private void processCommand() throws Exception {
//  DISPLAY 'Using parm to process command : ' WS-SCALAR-FUNCTION
          logger.info("Using parm to process command : {}", new String(acceptInput.getScalarFunction())); 
//  DISPLAY '>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>'
          logger.info(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>"); 
//  DISPLAY ' '
          logger.info(" "); 
//  EVALUATE TRUE
          if  ( acceptInput.isCDate()  ) { 
//  PERFORM 1000-DATE
              date1000();/*1000-DATE*/
              if (this.isProgramEnded()) {
                  return ;
              }
          }
          else if  ( acceptInput.isCSpGetprml()  ) { 
//  PERFORM 1001-SP-GETPRML
              spGetprml();/*1001-SP-GETPRML*/
              if (this.isProgramEnded()) {
                  return ;
              }
          }
          else if  ( acceptInput.isCSpGetdata()  ) { 
//  PERFORM 1002-SP-GETDATA
              spGetdata();/*1002-SP-GETDATA*/
              if (this.isProgramEnded()) {
                  return ;
              }
          }
          else if  ( acceptInput.isCCursor1()  ) { 
//  PERFORM 1003-CURSOR1
              cursor1();/*1003-CURSOR1*/
              if (this.isProgramEnded()) {
                  return ;
              }
          }
          else if  ( acceptInput.isCDateSubstringChar()  ) { 
//  PERFORM 1004-DATE-SUBSTRING-CHAR
              dateSubstringChar();/*1004-DATE-SUBSTRING-CHAR*/
              if (this.isProgramEnded()) {
                  return ;
              }
          }
          else if  ( acceptInput.isCSecurityLookup()  ) { 
//  PERFORM 1005-SECURITY-LOOKUP
              securityLookup();/*1005-SECURITY-LOOKUP*/
              if (this.isProgramEnded()) {
                  return ;
              }
          }
          else if  ( acceptInput.isCCurrency()  ) { 
//  PERFORM 1006-CURRENCY
              currency();/*1006-CURRENCY*/
              if (this.isProgramEnded()) {
                  return ;
              }
          }
          else if  ( acceptInput.isCXrefCursor()  ) { 
//  DISPLAY ' '
              logger.info(" "); 
//  DISPLAY '* RUN 1 *'
              logger.info("* RUN 1 *"); 
//  PERFORM 1007-XREF-CURSOR
              xrefCursor();/*1007-XREF-CURSOR*/
              if (this.isProgramEnded()) {
                  return ;
              }
//  DISPLAY ' '
              logger.info(" "); 
//  DISPLAY '* RUN 2 *'
              logger.info("* RUN 2 *"); 
//  PERFORM 1007-XREF-CURSOR
              xrefCursor();/*1007-XREF-CURSOR*/
              if (this.isProgramEnded()) {
                  return ;
              }
//  DISPLAY ' '
              logger.info(" "); 
//  DISPLAY '* RUN 3 *'
              logger.info("* RUN 3 *"); 
//  PERFORM 1007-XREF-CURSOR
              xrefCursor();/*1007-XREF-CURSOR*/
              if (this.isProgramEnded()) {
                  return ;
              }
          }
          else if  ( acceptInput.isCIsinCursor()  ) { 
//  PERFORM 1008-ISIN
              isin();/*1008-ISIN*/
              if (this.isProgramEnded()) {
                  return ;
              }
          }
          else if  ( acceptInput.isCDecimalToFloat()  ) { 
//  PERFORM 1009-DECIMAL-TO-FLOAT
              decimalToFloat();/*1009-DECIMAL-TO-FLOAT*/
              if (this.isProgramEnded()) {
                  return ;
              }
          }
          else if  ( acceptInput.isCSelect1()  ) { 
//  PERFORM 1010-SELECT-1
              select1();/*1010-SELECT-1*/
              if (this.isProgramEnded()) {
                  return ;
              }
          }
          else if  ( acceptInput.isCSelectCount()  ) { 
//  PERFORM 1011-SELECT-COUNT
              selectCount();/*1011-SELECT-COUNT*/
              if (this.isProgramEnded()) {
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
  *   COBOL Paragraph - 1000-DATE COBOL Cyclomatic complexity - 2
      * Input  :  

      * - mthsAgoDate18                  COBOL Name: WS-18MTHS-AGO-DATE
      *
      * Output :  

      * - currentDate                    COBOL Name: WS-CURRENT-DATE
      *
      * @throws CFException
      */
      private void date1000() throws Exception {

// *
//  MOVE '2021-03-31' TO WS-CURRENT-DATE
//  LITERAL_2021_MN2_0331 = '2021-03-31'
          dateFields.setCurrentDate(CONSTANTS.LITERAL_2021_MN2_0331);
//  SELECT DATE ( ? ) - 18 MONTHS FROM TBDEMSEC WHERE ISIN = 'DE000PAH0038'
          db2funcRepository.selectTbdemsec(dateFields,sqlca);
//  PERFORM 9000-CHECK-SQLCODE THRU 9000-EXIT
          checkSqlcode();/*9000-CHECK-SQLCODE*/
          if (this.isProgramEnded()) {
              return ;
          }

// *

// *
//  DISPLAY 'WS-18MTHS-AGO-DATE = ' WS-18MTHS-AGO-DATE
          logger.info("WS-18MTHS-AGO-DATE = {}", new String(dateFields.getMthsAgoDate18())); 
      
      }
      /**
      * spGetprml 
      *   This method is derived from 
  *   COBOL Paragraph - 1001-SP-GETPRML COBOL Cyclomatic complexity - 5
      * Input  :  

      * - sqlcode                        COBOL Name: SQLCODE
      *
      * Output :  

      * - numCursors                     COBOL Name: NUM-CURSORS
      * - procnm                         COBOL Name: PROCNM
      * - schema                         COBOL Name: SCHEMA
      * - parmind                        COBOL Name: PARMIND
      * - dsnpnm                         COBOL Name: DSNPNM
      * - sqlcodeDisp                    COBOL Name: SQLCODE-DISP
      * - sqlcode                        COBOL Name: SQLCODE
      *
      * @throws CFException
      */
      private void spGetprml() throws Exception {
			// Declare local variables used in the method
			int numCursors = 0;
			int sqlcode = 0;
			// End of variable declaration

//  MOVE 1 TO NUM-CURSORS
          work.setNumCursors(1);
          // MOVE 'GETPRML' TO PROCNM
          work.setProcnm(CONSTANTS.LITERAL_GETPRML_B11_);

// *              Input parameter -- procedure to be found

// *              Input parameter -- schema in sysroutines
// CALL GETPRML (  ?   ,    ?   ,    ?   ,    ?   ,    ?   ) 
          // MOVE 'CLOUDFRM' TO SCHEMA
          //  LITERAL_CLOUDFRM = 'CLOUDFRM'
          work.setSchema(CONSTANTS.LITERAL_CLOUDFRM);
          // MOVE -1 TO PARMIND
          work.setParmind((short)-1);
//  MOVE 'GETPRML' TO DSNPNM (1 : 7)
//  LITERAL_GETPRML = 'GETPRML'
          work.setDsnpnm(replace(work.getDsnpnm(),CONSTANTS.LITERAL_GETPRML,0,7));
//  CALL GETPRML ( ? , ? , ? , ? , ? )
          db2funcRepository.call(work,parmlstGroup,sqlca);
          sqlcode = sqlca.getSqlcode();
          numCursors = work.getNumCursors();
//  IF NUM-CURSORS > 0 AND SQLCODE NOT EQUAL TO +466 THEN
          if (	( numCursors > 0 ) && 	( sqlcode != 466 )) { 
              // MOVE SQLCODE TO SQLCODE-DISP
              //  FORMAT1484553271 = "-ZZZZ"
              work.setSqlcodeDisp(CFUtil.cobolNumberFormatter(CONSTANTS.FORMAT1484553271,String.valueOf(sqlca.getSqlcode()).toCharArray()));
//  DISPLAY '---SQL ERROR---'
              logger.info("---SQL ERROR---"); 
//  DISPLAY 'SQLCODE  = ' SQLCODE-DISP
              logger.info("SQLCODE  = {}", new String(work.getSqlcodeDisp())); 
          }
  
//  ELSE
          else { 
// ASSOCIATE LOCATORS  (  ?  )  WITH PROCEDURE GETPRML
//  MOVE 'GETPRML' TO DSNPNM (1 : 7)
//  LITERAL_GETPRML = 'GETPRML'
              work.setDsnpnm(replace(work.getDsnpnm(),CONSTANTS.LITERAL_GETPRML,0,7));
//  ASSOCIATE LOCATORS ( ? ) WITH PROCEDURE GETPRML
              db2funcRepository.associate(work,sqlca);
//  PERFORM 8000-GET-ISIN-DTLS
              getIsinDtls();/*8000-GET-ISIN-DTLS*/
          }
          ;
      
      }
      /**
      * getIsinDtls 
      *   This method is derived from 
  *   COBOL Paragraph - 8000-GET-ISIN-DTLS COBOL Cyclomatic complexity - 5
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

      * - dsncnm                         COBOL Name: DSNCNM
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
      private void getIsinDtls() throws Exception {
			// Declare local variables used in the method
			int sqlcode = 0;
			// End of variable declaration

      
// *-----------------------------------------------------------------
// ALLOCATE C1 CURSOR FOR RESULT SET  ? 
          // MOVE 'C1' TO DSNCNM
          work.setDsncnm(CONSTANTS.LITERAL_650934265);
//  ALLOCATE C1 CURSOR FOR RESULT SET ?
          db2funcRepository.allocate(work,sqlca);

// *
//  DISPLAY 'SECURITIES REPORT :'
          logger.info("SECURITIES REPORT :"); 
//  DISPLAY '-------------------'
          logger.info("-------------------"); 

// *
// FETCH C1 INTO  ?    ,   ?    ,   ?    ,   ?    ,   ?    ,   ?    ,   ?    ,   ?    ,   ?    ,   ?    ,   ? 
//  PERFORM UNTIL SQLCODE = 100
          while ((	( sqlca.getSqlcode() != 100 ))) {
              // MOVE 'C1' TO DSNCNM
              work.setDsncnm(CONSTANTS.LITERAL_650934265);
//  FETCH C1 INTO ? , ? , ? , ? , ? , ? , ? , ? , ? , ? , ?
              db2funcRepository.fetchC1Db2func(dcltbdemsec,sqlca);
              sqlcode = sqlca.getSqlcode();
//  IF SQLCODE = 0 THEN
              if (	( sqlcode == 0 )) { 
//  MOVE ISIN TO WS-ISIN OF C1-DTL
                  c1Dtl.setIsin(dcltbdemsec.getIsin01());
//  MOVE SEDOL TO WS-SEDOL OF C1-DTL
                  c1Dtl.setSedol(dcltbdemsec.getSedol01());
//  MOVE RIC TO WS-RIC OF C1-DTL
                  c1Dtl.setRic(dcltbdemsec.getRic01());
//  MOVE INTLKEY TO WS-INTLKEY OF C1-DTL
                  c1Dtl.setIntlkey(dcltbdemsec.getIntlkey01());
//  MOVE COMPANY TO WS-COMPANY OF C1-DTL
                  c1Dtl.setCompany(dcltbdemsec.getCompany01());
//  MOVE COUNTRY TO WS-COUNTRY OF C1-DTL
                  c1Dtl.setCountry(dcltbdemsec.getCountry01());
//  MOVE CURRENCY1 TO WS-CURRENCY OF C1-DTL
                  c1Dtl.setCurrency(dcltbdemsec.getCurrency1());
//  DISPLAY C1-DTL
                  logger.info(c1Dtl.toString()); 
              }
  
          }
          ;
      
      }
      /**
      * spGetdata 
      *   This method is derived from 
  *   COBOL Paragraph - 1002-SP-GETDATA COBOL Cyclomatic complexity - 3
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
      * - dsnpnm                         COBOL Name: DSNPNM
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
      private void spGetdata() throws Exception {
			// Declare local variables used in the method
			Bdms01InputData bdms01InputData = bdms01CallParameters.getBdms01InputData();
			Bdms01AdpMasterSegData bdms01AdpMasterSegData = bdms01CallParameters.getBdms01ReturnData().getBdms01AdpMasterSegData();
			Bdms01BaseSecuritySegData bdms01BaseSecuritySegData = bdms01CallParameters.getBdms01ReturnData().getBdms01BaseSecuritySegData();
			Bdms01SecurityTypeSegData bdms01SecurityTypeSegData = bdms01CallParameters.getBdms01ReturnData().getBdms01SecurityTypeSegData();
			int sqlcode = 0;
			Bdms01ReturnData bdms01ReturnData = bdms01CallParameters.getBdms01ReturnData();
			// End of variable declaration

      
// *-----------------------------------------------------------------
//  INITIALIZE BDMS01-CALL-PARAMETERS
          bdms01CallParameters.initialize();
//  MOVE 'Y' TO BDMS01-ADP-MASTER-SEG-IND
//  LITERAL_Y = 'Y'
          bdms01InputData.setBdms01AdpMasterSegInd(CONSTANTS.LITERAL_Y);
  
//  MOVE 'Y' TO BDMS01-BASE-SECURITY-SEG-IND
//  LITERAL_Y = 'Y'
          bdms01InputData.setBdms01BaseSecuritySegInd(CONSTANTS.LITERAL_Y);
  
//  MOVE 'Y' TO BDMS01-SECURITY-TYPE-SEG-IND
//  LITERAL_Y = 'Y'
          bdms01InputData.setBdms01SecurityTypeSegInd(CONSTANTS.LITERAL_Y);
  
//  MOVE LENGTH OF BDMS01-CALL-PARAMETERS TO SDMS01-PARM-LEN
          sdms01Parm.setSdms01ParmLen((short) Bdms01CallParameters.getBdms01CallParametersFieldLength());
          // MOVE BDMS01-CALL-PARAMETERS TO SDMS01-PARM-DATA
          sdms01Parm.setSdms01ParmData(bdms01CallParameters.toCharArray());
// CALL GETDATA  (  ?  ) 
//  MOVE 'GETDATA' TO DSNPNM (1 : 7)
//  LITERAL_GETDATA = 'GETDATA'
          work.setDsnpnm(replace(work.getDsnpnm(),CONSTANTS.LITERAL_GETDATA,0,7));
//  CALL GETDATA ( ? )
          db2funcRepository.call1(sdms01Parm,sqlca);

// *****Display 'sdms01-parm-data = ' sdms01-parm-data
//  MOVE SDMS01-PARM-DATA TO BDMS01-CALL-PARAMETERS
          bdms01CallParameters.setString(sdms01Parm.getSdms01ParmData());
          sqlcode = sqlca.getSqlcode();
//  IF SQLCODE = 0
          if (	( sqlcode == 0 )) { 
//  DISPLAY 'ADP-MASTER-SEG'
              logger.info("ADP-MASTER-SEG"); 
//  DISPLAY '--------------'
              logger.info("--------------"); 
//  DISPLAY ' BDMS01-ADP-MASTER-SEG-SQLCD  =' BDMS01-ADP-MASTER-SEG-SQLCD
              logger.info(" BDMS01-ADP-MASTER-SEG-SQLCD  ={}", String.valueOf(bdms01AdpMasterSegData.getBdms01AdpMasterSegSqlcd())); 
  
//  DISPLAY ' MSD-COUNTRY-CODE             =' MSD-COUNTRY-CODE
              logger.info(" MSD-COUNTRY-CODE             ={}", new String(bdms01AdpMasterSegData.getMsdCountryCode())); 
  
//  DISPLAY ' MSD-COUNTRY-OF-ORIGIN        =' MSD-COUNTRY-OF-ORIGIN
              logger.info(" MSD-COUNTRY-OF-ORIGIN        ={}", new String(bdms01AdpMasterSegData.getMsdCountryOfOrigin())); 
  
//  DISPLAY ' MSD-ADDED-CCYYMMDD           =' MSD-ADDED-CCYYMMDD
              logger.info(" MSD-ADDED-CCYYMMDD           ={}", bdms01AdpMasterSegData.getMsdAddedCcyymmdd().toString()); 
  
//  DISPLAY ' MSD-SECURITY-DESC1           =' MSD-SECURITY-DESC1
              logger.info(" MSD-SECURITY-DESC1           ={}", bdms01AdpMasterSegData.getMsdSecurityDesc1().toString()); 
  
//  DISPLAY ' BDMS01-CNTRY-ISSUE-CD        =' BDMS01-CNTRY-ISSUE-CD
              logger.info(" BDMS01-CNTRY-ISSUE-CD        ={}", new String(bdms01AdpMasterSegData.getBdms01CntryIssueCd())); 
  
//  DISPLAY ' BDMS01-CNTRY-ORGN-CD         =' BDMS01-CNTRY-ORGN-CD
              logger.info(" BDMS01-CNTRY-ORGN-CD         ={}", new String(bdms01AdpMasterSegData.getBdms01CntryOrgnCd())); 
  
//  DISPLAY ' BDMS01-CLIENT-NBR            =' BDMS01-CLIENT-NBR
              logger.info(" BDMS01-CLIENT-NBR            ={}", new String(bdms01AdpMasterSegData.getBdms01ClientNbr())); 
  
//  DISPLAY ' BDMS01-MCGILL-CD             =' BDMS01-MCGILL-CD
              logger.info(" BDMS01-MCGILL-CD             ={}", String.valueOf(bdms01AdpMasterSegData.getBdms01McgillCd())); 
  
//  DISPLAY ' BDMS01-CUSIP-CNTRA-NBR       =' BDMS01-CUSIP-CNTRA-NBR
              logger.info(" BDMS01-CUSIP-CNTRA-NBR       ={}", new String(bdms01AdpMasterSegData.getBdms01CusipCntraNbr())); 
  
//  DISPLAY ' MSD-CLASS-IND                =' MSD-CLASS-IND
              logger.info(" MSD-CLASS-IND                ={}", new String(bdms01AdpMasterSegData.getMsdClassInd())); 
  
//  DISPLAY '--------------'
              logger.info("--------------"); 

// *
//  DISPLAY 'BASE-SECURITY-SEG'
              logger.info("BASE-SECURITY-SEG"); 
//  DISPLAY '-----------------'
              logger.info("-----------------"); 
//  DISPLAY ' BDMS01-BASE-SECURITY-SEG-SQLCD =' BDMS01-BASE-SECURITY-SEG-SQLCD
              logger.info(" BDMS01-BASE-SECURITY-SEG-SQLCD ={}", String.valueOf(bdms01BaseSecuritySegData.getBdms01BaseSecuritySegSqlcd())); 
  
//  DISPLAY ' MSD-INDUSTRIAL-CLASS           =' MSD-INDUSTRIAL-CLASS
              logger.info(" MSD-INDUSTRIAL-CLASS           ={}", new String(bdms01BaseSecuritySegData.getMsdIndustrialClass())); 
  
//  DISPLAY ' MSD-AIDS-CODE                  =' MSD-AIDS-CODE
              logger.info(" MSD-AIDS-CODE                  ={}", new String(bdms01BaseSecuritySegData.getMsdAidsCode())); 
  
//  DISPLAY ' MSD-STK-DAILY-VOLUME           =' MSD-STK-DAILY-VOLUME
              logger.info(" MSD-STK-DAILY-VOLUME           ={}", String.valueOf(bdms01BaseSecuritySegData.getMsdStkDailyVolume())); 
  
//  DISPLAY ' MSD-CURRENCY-CODE              =' MSD-CURRENCY-CODE OF BDMS01-BASE-SECURITY-SEG-DATA
              logger.info(" MSD-CURRENCY-CODE              ={}", new String(bdms01BaseSecuritySegData.getMsdCurrencyCode())); 
  
//  DISPLAY ' BDMS01-REDENOMINATION-DT       =' BDMS01-REDENOMINATION-DT
              logger.info(" BDMS01-REDENOMINATION-DT       ={}", new String(bdms01BaseSecuritySegData.getBdms01RedenominationDt())); 
  
//  DISPLAY ' BDMS01-PUT-STRT-DT             =' BDMS01-PUT-STRT-DT
              logger.info(" BDMS01-PUT-STRT-DT             ={}", new String(bdms01BaseSecuritySegData.getBdms01PutStrtDt())); 
  
//  DISPLAY ' BDMS01-PUT-TMNG-CD             =' BDMS01-PUT-TMNG-CD
              logger.info(" BDMS01-PUT-TMNG-CD             ={}", new String(bdms01BaseSecuritySegData.getBdms01PutTmngCd())); 
  
//  DISPLAY ' BDMS01-CALL-TMNG-CD            =' BDMS01-CALL-TMNG-CD
              logger.info(" BDMS01-CALL-TMNG-CD            ={}", new String(bdms01BaseSecuritySegData.getBdms01CallTmngCd())); 
  
//  DISPLAY ' BDMS01-OTC-BLLTN-STK-IND       =' BDMS01-OTC-BLLTN-STK-IND
              logger.info(" BDMS01-OTC-BLLTN-STK-IND       ={}", new String(bdms01BaseSecuritySegData.getBdms01OtcBlltnStkInd())); 
  
//  DISPLAY '-----------------'
              logger.info("-----------------"); 
//  DISPLAY 'BDMS01-SECURITY-TYPE-SEG-IND'
              logger.info("BDMS01-SECURITY-TYPE-SEG-IND"); 
//  DISPLAY '----------------------------'
              logger.info("----------------------------"); 
//  DISPLAY ' BDMS01-SECURITY-TYPE-SEG-SQLCD =' BDMS01-SECURITY-TYPE-SEG-SQLCD
              logger.info(" BDMS01-SECURITY-TYPE-SEG-SQLCD ={}", String.valueOf(bdms01SecurityTypeSegData.getBdms01SecurityTypeSegSqlcd())); 
  
//  DISPLAY ' MSD-TYPE-OF-RECORD-IND         =' MSD-TYPE-OF-RECORD-IND
              logger.info(" MSD-TYPE-OF-RECORD-IND         ={}", new String(bdms01SecurityTypeSegData.getMsdTypeOfRecordInd())); 
  
//  DISPLAY ' MSD-SECURITY-TYPE-POS1         =' MSD-SECURITY-TYPE-POS1
              logger.info(" MSD-SECURITY-TYPE-POS1         ={}", new String(bdms01SecurityTypeSegData.getMsdSecurityTypePos1())); 
  
//  DISPLAY ' MSD-SEC-TYPE-CODES             =' MSD-SEC-TYPE-CODES
              logger.info(" MSD-SEC-TYPE-CODES             ={}", bdms01SecurityTypeSegData.getMsdSecTypeCodes().toString()); 
  
//  DISPLAY ' MSD-SEC-PRICE-MULTIPLIER       =' MSD-SEC-PRICE-MULTIPLIER
              logger.info(" MSD-SEC-PRICE-MULTIPLIER       ={}", new String(bdms01SecurityTypeSegData.getMsdSecPriceMultiplier())); 
  
          }
  
//  ELSE
          else { 
//  DISPLAY 'CANNOT SELECT FROM GETDATA'
              logger.info("CANNOT SELECT FROM GETDATA"); 
//  DISPLAY 'SQL ERROR CODE = ' BDMS01-RETURN-SQLCODE
              logger.info("SQL ERROR CODE = {}", String.valueOf(bdms01ReturnData.getBdms01ReturnSqlcode())); 
  
          }
      
      }
      /**
      * cursor1 
      *   This method is derived from 
  *   COBOL Paragraph - 1003-CURSOR1 COBOL Cyclomatic complexity - 2
      * Input  : None 

      * Output : None 

      * @throws CFException
      */
      private void cursor1() throws Exception {
			// Declare local variables used in the method
			HostAppCodeTbl hostAppCodeTbl = applicationCodeListGroup.getHostAppCodeList().getHostAppCodeTbl();
			// End of variable declaration

//  SELECT X.ADP_NO AS ADP_NO , X.APPL_CODE_CD AS APPL_CODE_CD , T13.SYMBOL AS SYMBOL , T13.CUSIP AS CUSIP , T13.SEDOL AS SEDOL , T13.ISIN AS ISIN , X.FAM_ID AS FAM_ID , T15.FAM_NAME AS FAM_NAME , X.ACCOUNT AS ACCOUNT , X.ACCT_CHK_DIGIT AS ACCT_CHK_DIGIT , T16.MACT_NAME AS ACCT_NAME , DECIMAL ( X.POS_QTY , 18 , 5 ) AS POS_QTY , DECIMAL ( X.PRICE , 17 , 8 ) AS PRICE , X.SOURCE_CD AS SOURCE_CD , X.PRICE_CD AS PRICE_CD , X.SOURCE_ID AS SOURCE_ID , X.SOURCE_TYPE AS SOURCE_TYPE , T13.INSTRUMENT_TYPE1 CONCAT ' ' CONCAT T13.INSTRUMENT_TYPE2 CONCAT ' ' CONCAT T13.EXCHANGE_OR_OTHER AS INSTRUMENT_TYPE , T14.INST_1_DESC CONCAT ' ' CONCAT T14.INST_2_DESC CONCAT ' ' CONCAT T14.EXCH_OTHER_DESC AS INSTRUMENT_DESC FROM ( SELECT T1.ADP_SECURITY_NO AS ADP_NO , T1.APPL_CODE_CD AS APPL_CODE_CD , T1.FAMILY_ID AS FAM_ID , ( T1.OFFICE_ACCOUNT_CD CONCAT T1.ACCT_CURR_CD CONCAT T1.ACCT_TYP ) AS ACCOUNT , T1.ACCT_CHKDIGIT_NO AS ACCT_CHK_DIGIT , T1.SOURCE_CD AS SOURCE_CD , T1.PRICE_CD AS PRICE_CD , MIN ( T1.SOURCE_ID ) AS SOURCE_ID , MIN ( T1.SOURCE_TYP ) AS SOURCE_TYPE , MIN ( T1.PRICE_PRC ) AS PRICE , MIN ( T1.POS_QTY ) AS POS_QTY FROM SCPSECTB T1 WHERE T1.ADP_SECURITY_NO = ? AND ( ( T1.APPL_CODE_CD IN ( ? ) ) OR ( ( ( ? = 'Y' AND T1.APPL_CODE_CD = 'RAP' ) OR ( ? = 'Y' AND T1.APPL_CODE_CD = 'REM' ) OR ( ? = 'Y' AND T1.APPL_CODE_CD = 'RTL' ) ) AND T1.FAMILY_ID = '52V' AND T1.OFFICE_ACCOUNT_CD = 'SHA00001' AND T1.ACCT_CURR_CD = 'USD' AND T1.ACCT_TYP IN ( '1' , '3' ) ) ) AND T1.POS_QTY <> 0 AND T1.SOURCE_DSC <> 'UNPRICED' AND T1.SOURCE_DSC <> 'STALE' AND T1.SOURCE_DSC <> 'EXPIRED' AND ( ( T1.SOURCE_CD <> '999' AND T1.SOURCE_ID <> 'STALE' ) OR T1.SOURCE_CD = '999' ) AND T1.PRICE_PRC <> 0 AND T1.PRICE_CD = ? AND T1.SOURCE_CD = ? GROUP BY T1.ADP_SECURITY_NO , T1.APPL_CODE_CD , T1.FAMILY_ID , T1.OFFICE_ACCOUNT_CD , T1.ACCT_CURR_CD , T1.ACCT_TYP , T1.ACCT_CHKDIGIT_NO , T1.SOURCE_CD , T1.PRICE_CD ) X LEFT OUTER JOIN SCSECXTB T13 ON T13.ADP_SECURITY_NO = X.ADP_NO LEFT OUTER JOIN SCINSTTB T14 ON T14.INSTRUMENT_TYPE1 = T13.INSTRUMENT_TYPE1 AND T14.INSTRUMENT_TYPE2 = T13.INSTRUMENT_TYPE2 AND T14.EXCHANGE_OR_OTHER = T13.EXCHANGE_OR_OTHER LEFT OUTER JOIN CLOUDFRM.SPCFAMTB T15 ON T15.FAM_NUMBER = X.FAM_ID LEFT OUTER JOIN CLOUDFRM.SPCACTTB T16 ON T16.MACT_OFFICE = SUBSTR ( X.ACCOUNT , 01 , 03 ) AND T16.MACT_ACCT_NO = SUBSTR ( X.ACCOUNT , 04 , 05 ) AND T16.ACCT_CURR_BSC = SUBSTR ( X.ACCOUNT , 09 , 03 ) AND T16.ACCT_TYP = SUBSTR ( X.ACCOUNT , 12 , 01 ) ORDER BY 1 , 2 FOR FETCH ONLY
          db2funcRepository.openPositionCursorDb2func(sqlca,hostVariables,applicationCodeListGroup,dclscpsectb);
  
//  PERFORM 9000-CHECK-SQLCODE THRU 9000-EXIT
          checkSqlcode();/*9000-CHECK-SQLCODE*/
          if (this.isProgramEnded()) {
              return ;
          }
          ;
      
      }
      /**
      * dateSubstringChar 
      *   This method is derived from 
  *   COBOL Paragraph - 1004-DATE-SUBSTRING-CHAR COBOL Cyclomatic complexity - 2
      * Input  :  

      * - lastDayDt                      COBOL Name: WS-LAST-DAY-DT
      *
      * Output :  

      * - currentDate                    COBOL Name: WS-CURRENT-DATE
      *
      * @throws CFException
      */
      private void dateSubstringChar() throws Exception {
//  MOVE '2021-06-19' TO WS-CURRENT-DATE
//  LITERAL_2021_MN2_0619 = '2021-06-19'
          dateFields.setCurrentDate(CONSTANTS.LITERAL_2021_MN2_0619);
//  SELECT DATE ( SUBSTR ( CHAR ( ? ) , 1 , 8 ) || '01' ) + 1 MONTH - 1 DAY FROM SYSIBM.SYSDUMMY1 WITH UR
          db2funcRepository.selectSysdummy1(dateFields,sqlca);
//  PERFORM 9000-CHECK-SQLCODE THRU 9000-EXIT
          checkSqlcode();/*9000-CHECK-SQLCODE*/
          if (this.isProgramEnded()) {
              return ;
          }

// *

// *
//  DISPLAY 'WS-LAST-DAY-DT     = ' WS-LAST-DAY-DT
          logger.info("WS-LAST-DAY-DT     = {}", new String(dateFields.getLastDayDt())); 
          ;
      
      }
      /**
      * securityLookup 
      *   This method is derived from 
  *   COBOL Paragraph - 1005-SECURITY-LOOKUP COBOL Cyclomatic complexity - 9
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
      private void securityLookup() throws Exception {
			// Declare local variables used in the method
			Bdms01AdpMasterExpData bdms01AdpMasterExpData = bdms01CallParameters.getBdms01ReturnData().getBdms01AdpMasterExpData();
			short doNotUseDtNull = 0;
			short clientNbrNull = 0;
			short mcgillCdNull = 0;
			short cusipCntraNbrNull = 0;
			short symblTrdsAsCdNull = 0;
			short symblTrdsWhiNull = 0;
			short mtrlMdfdDtNull = 0;
			// End of variable declaration

          // MOVE '1234567' TO SECURITY-ADP-NBR OF DCLVMSTRANB
          //  LITERAL_1234567 = '1234567'
          dclvmstranb.setSecurityAdpNbr(CONSTANTS.LITERAL_1234567);
//  SELECT TRML_CD , TRAN_CD , ADDED_TMSTP , DO_NOT_USE_DT , SRCE_SETUP_SEC_CD , SECURITY_IDA_CD , TYPE_SECURITY_CD , CNTRY_ISSUE_CD , CNTRY_ORGN_CD , A.CLIENT_NBR , DESC_SEC_TXT , MCGILL_CD , CUSIP_CNTRA_NBR , CLASS_IND , SYMBL_TRDS_AS_CD , SYMBL_TRDS_WHI_CD , SEC_LCKD_IND , FATCA_CD , MTRL_MDFD_DT , FATCA_OVRRD_CD , FATCA_CD_CALC_IND FROM CLOUDFRM.TMASTER_ADP_NUMBER A WHERE SECURITY_ADP_NBR = ? WITH UR
          db2funcRepository.selectTmasterAdpNumber(db2Indicators,sqlca,bdms01CallParameters,dclvmstranb);
  
//  DISPLAY ' TRML-CD                 = ' TRML-CD
          logger.info(" TRML-CD                 = {}", new String(dclvmstranb.getTrmlCd())); 
//  DISPLAY ' TRAN-CD                 = ' TRAN-CD
          logger.info(" TRAN-CD                 = {}", new String(dclvmstranb.getTranCd())); 
//  DISPLAY ' ADDED-TMSTP             = ' ADDED-TMSTP
          logger.info(" ADDED-TMSTP             = {}", new String(dclvmstranb.getAddedTmstp())); 
          doNotUseDtNull = db2Indicators.getDoNotUseDtNull();
//  IF DO-NOT-USE-DT-NULL = -1
          if (	( doNotUseDtNull == -1 ) ) { 
//  DISPLAY ' DO-NOT-USE-DT           = NULL'
              logger.info(" DO-NOT-USE-DT           = NULL"); 
          }
  
//  ELSE
          else { 
//  DISPLAY ' DO-NOT-USE-DT           = ' DO-NOT-USE-DT
              logger.info(" DO-NOT-USE-DT           = {}", new String(dclvmstranb.getDoNotUseDt())); 
          }
//  DISPLAY ' SRCE-SETUP-SEC-CD       = ' SRCE-SETUP-SEC-CD
          logger.info(" SRCE-SETUP-SEC-CD       = {}", new String(dclvmstranb.getSrceSetupSecCd())); 
//  DISPLAY ' SECURITY-IDA-CD         = ' SECURITY-IDA-CD
          logger.info(" SECURITY-IDA-CD         = {}", new String(dclvmstranb.getSecurityIdaCd())); 
//  DISPLAY ' TYPE-SECURITY-CD        = ' TYPE-SECURITY-CD
          logger.info(" TYPE-SECURITY-CD        = {}", new String(dclvmstranb.getTypeSecurityCd())); 
//  DISPLAY ' CNTRY-ISSUE-CD          = ' CNTRY-ISSUE-CD
          logger.info(" CNTRY-ISSUE-CD          = {}", new String(dclvmstranb.getCntryIssueCd())); 
//  DISPLAY ' CNTRY-ORGN-CD           = ' CNTRY-ORGN-CD
          logger.info(" CNTRY-ORGN-CD           = {}", new String(dclvmstranb.getCntryOrgnCd())); 
          clientNbrNull = db2Indicators.getClientNbrNull();
//  IF CLIENT-NBR-NULL = -1
          if (	( clientNbrNull == -1 ) ) { 
//  DISPLAY ' CLIENT-NBR              = NULL'
              logger.info(" CLIENT-NBR              = NULL"); 
          }
  
//  ELSE
          else { 
//  DISPLAY ' CLIENT-NBR              = ' CLIENT-NBR
              logger.info(" CLIENT-NBR              = {}", new String(dclvmstranb.getClientNbr())); 
          }
//  DISPLAY ' DESC-SEC-TXT            = ' DESC-SEC-TXT
          logger.info(" DESC-SEC-TXT            = {}", new String(dclvmstranb.getDescSecTxt())); 
//  DISPLAY ' CLASS-IND               = ' CLASS-IND
          logger.info(" CLASS-IND               = {}", new String(dclvmstranb.getClassInd())); 
//  DISPLAY ' SEC-LCKD-IND            = ' SEC-LCKD-IND
          logger.info(" SEC-LCKD-IND            = {}", new String(dclvmstranb.getSecLckdInd())); 
//  DISPLAY ' BDMS01-FATCA-CD         = ' BDMS01-FATCA-CD
          logger.info(" BDMS01-FATCA-CD         = {}", new String(bdms01AdpMasterExpData.getBdms01FatcaCd())); 
  
//  DISPLAY ' BDMS01-FATCA-OVRRD-CD   = ' BDMS01-FATCA-OVRRD-CD
          logger.info(" BDMS01-FATCA-OVRRD-CD   = {}", new String(bdms01AdpMasterExpData.getBdms01FatcaOvrrdCd())); 
  
//  DISPLAY ' BDMS01-FATCA-CD-CALC-IND= ' BDMS01-FATCA-CD-CALC-IND
          logger.info(" BDMS01-FATCA-CD-CALC-IND= {}", new String(bdms01AdpMasterExpData.getBdms01FatcaCdCalcInd())); 
  
          mcgillCdNull = db2Indicators.getMcgillCdNull();
//  IF MCGILL-CD-NULL = -1
          if (	( mcgillCdNull == -1 ) ) { 
//  DISPLAY ' MCGILL-CD               = NULL'
              logger.info(" MCGILL-CD               = NULL"); 
          }
  
//  ELSE
          else { 
//  DISPLAY ' MCGILL-CD               = ' MCGILL-CD
              logger.info(" MCGILL-CD               = {}", String.valueOf(dclvmstranb.getMcgillCd())); 
          }
          cusipCntraNbrNull = db2Indicators.getCusipCntraNbrNull();
//  IF CUSIP-CNTRA-NBR-NULL = -1
          if (	( cusipCntraNbrNull == -1 ) ) { 
//  DISPLAY ' CUSIP-CNTRA-NBR         = NULL'
              logger.info(" CUSIP-CNTRA-NBR         = NULL"); 
          }
  
//  ELSE
          else { 
//  DISPLAY ' CUSIP-CNTRA-NBR         = ' CUSIP-CNTRA-NBR
              logger.info(" CUSIP-CNTRA-NBR         = {}", new String(dclvmstranb.getCusipCntraNbr())); 
          }
          symblTrdsAsCdNull = db2Indicators.getSymblTrdsAsCdNull();
//  IF SYMBL-TRDS-AS-CD-NULL = -1
          if (	( symblTrdsAsCdNull == -1 ) ) { 
//  DISPLAY ' SYMBL-TRDS-AS-CD        = NULL'
              logger.info(" SYMBL-TRDS-AS-CD        = NULL"); 
          }
  
//  ELSE
          else { 
//  DISPLAY ' SYMBL-TRDS-AS-CD        = ' SYMBL-TRDS-AS-CD
              logger.info(" SYMBL-TRDS-AS-CD        = {}", new String(dclvmstranb.getSymblTrdsAsCd())); 
          }
          symblTrdsWhiNull = db2Indicators.getSymblTrdsWhiNull();
//  IF SYMBL-TRDS-WHI-NULL = -1
          if (	( symblTrdsWhiNull == -1 ) ) { 
//  DISPLAY ' SYMBL-TRDS-WHI-CD       = NULL'
              logger.info(" SYMBL-TRDS-WHI-CD       = NULL"); 
          }
  
//  ELSE
          else { 
//  DISPLAY ' SYMBL-TRDS-WHI-CD       = ' SYMBL-TRDS-WHI-CD
              logger.info(" SYMBL-TRDS-WHI-CD       = {}", new String(dclvmstranb.getSymblTrdsWhiCd())); 
          }
          mtrlMdfdDtNull = db2Indicators.getMtrlMdfdDtNull();
//  IF MTRL-MDFD-DT-NULL = -1
          if (	( mtrlMdfdDtNull == -1 ) ) { 
//  DISPLAY ' BDMS01-MTRL-MDFD-DT     = NULL'
              logger.info(" BDMS01-MTRL-MDFD-DT     = NULL"); 
          }
  
//  ELSE
          else { 
//  DISPLAY ' BDMS01-MTRL-MDFD-DT     = ' BDMS01-MTRL-MDFD-DT
              logger.info(" BDMS01-MTRL-MDFD-DT     = {}", new String(bdms01AdpMasterExpData.getBdms01MtrlMdfdDt())); 
  
          }
//  PERFORM 9000-CHECK-SQLCODE THRU 9000-EXIT
          checkSqlcode();/*9000-CHECK-SQLCODE*/
          if (this.isProgramEnded()) {
              return ;
          }
          ;
      
      }
      /**
      * currency 
      *   This method is derived from 
  *   COBOL Paragraph - 1006-CURRENCY COBOL Cyclomatic complexity - 2
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
      private void currency() throws Exception {
//  MOVE 'US' TO CURRENCY-CD OF DCLVCRREXRT
//  LITERAL_US = 'US'
          dclvcrrexrt.setCurrencyCd(CONSTANTS.LITERAL_US);
//  SELECT EXCHANGE_RATE_AMT FROM CLOUDFRM.TCRRNCY_EXCH_RATE WHERE CURRENCY_CD = ? WITH UR
          db2funcRepository.selectTcrrncyExchRate(sqlca,dclvcrrexrt);
//  PERFORM 9000-CHECK-SQLCODE THRU 9000-EXIT
          checkSqlcode();/*9000-CHECK-SQLCODE*/
          if (this.isProgramEnded()) {
              return ;
          }

// *
//  MOVE EXCHANGE-RATE-AMT TO DECIMAL-EDIT
//  FORMAT_2056242199 = "-ZZZZZZZZ9.99999"
          work.setDecimalEdit(CFUtil.cobolNumberFormatter(CONSTANTS.FORMAT_2056242199,dclvcrrexrt.getExchangeRateAmt().toPlainString().toCharArray()));
//  DISPLAY 'EXCHANGE-RATE-AMT = ' DECIMAL-EDIT
          logger.info("EXCHANGE-RATE-AMT = {}", new String(work.getDecimalEdit())); 
          ;
      
      }
      /**
      * xrefCursor 
      *   This method is derived from 
  *   COBOL Paragraph - 1007-XREF-CURSOR COBOL Cyclomatic complexity - 8
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
      private void xrefCursor() throws Exception {
          // MOVE '1234567' TO SECURITY-ADP-NBR OF DCLVMSDXRFK
          //  LITERAL_1234567 = '1234567'
          dclvmsdxrfk.setSecurityAdpNbr01(CONSTANTS.LITERAL_1234567);
//  SELECT CROSS_REFERENCE_CD , TYPE_XREF_CD FROM CLOUDFRM.TMSD_XREF_KEYS WHERE SECURITY_ADP_NBR = ? AND TYPE_XREF_CD IN ( 'CU' , 'CB' , 'SY' , 'SW' , 'IS' , 'SD' , 'EU' , 'CI' , 'CM' , 'OC' , 'OP' , 'D' ) UNION SELECT SECURITY_ADP_NBR , TYPE_XREF_CD FROM CLOUDFRM.TMSD_XREF_KEYS WHERE CROSS_REFERENCE_CD = ? AND TYPE_XREF_CD = 'D' WITH UR
          db2funcRepository.openXrefCursorDb2func(dclvmsdxrfk,sqlca);
//  PERFORM 9000-CHECK-SQLCODE THRU 9000-EXIT
          checkSqlcode();/*9000-CHECK-SQLCODE*/
          if (this.isProgramEnded()) {
              return ;
          }

// *
//  PERFORM UNTIL SQLCODE NOT = 0
          while ((	( sqlca.getSqlcode() == 0 ))) {
//  FETCH XREF-CURSOR INTO ? , ?
              db2funcRepository.fetchXrefCursorDb2func(dclvmsdxrfk,sqlca);
//  EVALUATE SQLCODE
              switch(sqlca.getSqlcode()){
              	case 0:
//  DISPLAY '|'
                  logger.info("|"); 
//  DISPLAY '| CROSS-REFERENCE-CD = ' CROSS-REFERENCE-CD OF DCLVMSDXRFK
                  logger.info("| CROSS-REFERENCE-CD = {}", new String(dclvmsdxrfk.getCrossReferenceCd())); 
//  DISPLAY '| TYPE-XREF-CD       = ' TYPE-XREF-CD OF DCLVMSDXRFK
                  logger.info("| TYPE-XREF-CD       = {}", new String(dclvmsdxrfk.getTypeXrefCd())); 
              break;
              	case 100:
              break;
              default :
//  PERFORM 9000-CHECK-SQLCODE THRU 9000-EXIT
                  checkSqlcode();/*9000-CHECK-SQLCODE*/
                  if (this.isProgramEnded()) {
                      return ;
                  }
              }
          }
//  CLOSE XREF-CURSOR
          db2funcRepository.closeXrefCursorDb2func(sqlca);
//  PERFORM 9000-CHECK-SQLCODE THRU 9000-EXIT
          checkSqlcode();/*9000-CHECK-SQLCODE*/
          if (this.isProgramEnded()) {
              return ;
          }
          ;
      
      }
      /**
      * isin 
      *   This method is derived from 
  *   COBOL Paragraph - 1008-ISIN COBOL Cyclomatic complexity - 18
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
      private void isin() throws Exception {
			// Declare local variables used in the method
			long isinCnt = 0;
			// End of variable declaration

          // MOVE 0 TO ISIN-CNT
          work.setIsinCnt((long)0);
//  SELECT ISIN , SEDOL , RIC , INTLKEY , COMPANY , COUNTRY , INDUSTRY , SECTOR , FFMCAPMILUSD , SECTORWEIGHT FROM TBDEMSEC ORDER BY ISIN
          db2funcRepository.openIsinCursorDb2func(sqlca);
//  PERFORM 9000-CHECK-SQLCODE THRU 9000-EXIT
          checkSqlcode();/*9000-CHECK-SQLCODE*/
          if (this.isProgramEnded()) {
              return ;
          }

// *
//  PERFORM UNTIL EOC-ISIN-CURSOR
          while ((!(work.isEocIsinCursor()) )) {
//  FETCH ISIN-CURSOR INTO ? , ? , ? , ? , ? , ? , ? , ? , ? , ?
              db2funcRepository.fetchIsinCursorDb2func(dcltbdemsec,sqlca);
//  EVALUATE SQLCODE
              switch(sqlca.getSqlcode()){
              	case 0:
//  DISPLAY '> ' ISIN ' : ' COMPANY
                  logger.info("> {} : {}", new String(dcltbdemsec.getIsin01()), new String(dcltbdemsec.getCompany01())); 
//  ADD 1 TO ISIN-CNT
                  work.setIsinCnt(work.getIsinCnt()+(long)1);
//  UPDATE TBDEMSEC SET COMPANY = ? WHERE ISIN = ?
                  db2funcRepository.updateTbdemsec1(dcltbdemsec,sqlca);
//  PERFORM 9000-CHECK-SQLCODE THRU 9000-EXIT
                  checkSqlcode();/*9000-CHECK-SQLCODE*/
                  if (this.isProgramEnded()) {
                      return ;
                  }
              break;
              	case 100:
//  SET EOC-ISIN-CURSOR TO TRUE
                  work.setEocIsinCursorTrue(); 
                  
              break;
              default :
//  PERFORM 9000-CHECK-SQLCODE THRU 9000-EXIT
                  checkSqlcode();/*9000-CHECK-SQLCODE*/
                  if (this.isProgramEnded()) {
                      return ;
                  }
              }
//  IF EOC-ISIN-CURSOR
//  ELSE
              if (!(work.isEocIsinCursor()) ) { 
                  isinCnt = work.getIsinCnt();
//  IF ISIN-CNT = 3
                  if (	( isinCnt == 3 ) ) { 
//  MOVE 'IN0000123456' TO ISIN
//  LITERAL_IN0000123456 = 'IN0000123456'
                      dcltbdemsec.setIsin01(CONSTANTS.LITERAL_IN0000123456);
//  SELECT ISIN FROM TBDEMSEC WHERE ISIN = ?
                      db2funcRepository.selectTbdemsec1(dcltbdemsec,sqlca);
                  }
  
                  isinCnt = work.getIsinCnt();
//  IF ISIN-CNT = 2 OR 4 OR 6 OR 8 OR 10
                  if (	( isinCnt == 2 )  || 	( isinCnt == 4 )  || 	( isinCnt == 6 )  || 	( isinCnt == 8 )  || 	( isinCnt == 10 ) ) { 
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
//  PERFORM 9000-CHECK-SQLCODE THRU 9000-EXIT
                      checkSqlcode();/*9000-CHECK-SQLCODE*/
                      if (this.isProgramEnded()) {
                          return ;
                      }
                  }
  
              }
          }
//  DISPLAY 'TOTAL ISINs Fetched = ' ISIN-CNT
          logger.info("TOTAL ISINs Fetched = {}", String.valueOf(work.getIsinCnt())); 
//  CLOSE ISIN-CURSOR
          db2funcRepository.closeIsinCursorDb2func(sqlca);
//  PERFORM 9000-CHECK-SQLCODE THRU 9000-EXIT
          checkSqlcode();/*9000-CHECK-SQLCODE*/
          if (this.isProgramEnded()) {
              return ;
          }
          ;
      
      }
      /**
      * decimalToFloat 
      *   This method is derived from 
  *   COBOL Paragraph - 1009-DECIMAL-TO-FLOAT COBOL Cyclomatic complexity - 5
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
      private void decimalToFloat() throws Exception {
			// Declare local variables used in the method
			short yieldBidNull = 0;
			short putNtcMinNull = 0;
			short putNtcMaxNull = 0;
			Bdms01BaseSecurityExpData bdms01BaseSecurityExpData = bdms01CallParameters.getBdms01ReturnData().getBdms01BaseSecurityExpData();
			// End of variable declaration

//  SELECT YIELD_BID_PCT , PUT_NTC_MIN_DY_QTY , PUT_NTC_MAX_DY_QTY , CNTNG_YLD_RT FROM CLOUDFRM.TBASE_SECURITY_DAT A WITH UR
          db2funcRepository.selectTbaseSecurityDat(work,db2Indicators,sqlca,dclvbsscrdt);
//  PERFORM 9000-CHECK-SQLCODE THRU 9000-EXIT
          checkSqlcode();/*9000-CHECK-SQLCODE*/
          if (this.isProgramEnded()) {
              return ;
          }

// *
          yieldBidNull = db2Indicators.getYieldBidNull();
//  IF YIELD-BID-NULL = -1
          if (	( yieldBidNull == -1 ) ) { 
//  DISPLAY 'YIELD-BID-PCT IS NULL'
              logger.info("YIELD-BID-PCT IS NULL"); 
          }
  
//  ELSE
          else { 
//  DISPLAY 'YIELD-BID-PCT           = ' YIELD-BID-PCT
              logger.info("YIELD-BID-PCT           = {}", new String(dclvbsscrdt.getYieldBidPct().toPlainString().toCharArray())); 
          }
          putNtcMinNull = db2Indicators.getPutNtcMinNull();
//  IF PUT-NTC-MIN-NULL = -1
          if (	( putNtcMinNull == -1 ) ) { 
//  DISPLAY 'PUT-NTC-MIN-DY-QTY IS NULL'
              logger.info("PUT-NTC-MIN-DY-QTY IS NULL"); 
          }
  
//  ELSE
          else { 
//  DISPLAY 'PUT-NTC-MIN-DY-QTY      = ' PUT-NTC-MIN-DY-QTY
              logger.info("PUT-NTC-MIN-DY-QTY      = {}", String.valueOf(dclvbsscrdt.getPutNtcMinDyQty())); 
          }
          putNtcMaxNull = db2Indicators.getPutNtcMaxNull();
//  IF PUT-NTC-MAX-NULL = -1
          if (	( putNtcMaxNull == -1 ) ) { 
//  DISPLAY 'PUT-NTC-MAX-DY-QTY IS NULL'
              logger.info("PUT-NTC-MAX-DY-QTY IS NULL"); 
          }
  
//  ELSE
          else { 
//  DISPLAY 'PUT-NTC-MAX-DY-QTY      = ' PUT-NTC-MAX-DY-QTY
              logger.info("PUT-NTC-MAX-DY-QTY      = {}", String.valueOf(dclvbsscrdt.getPutNtcMaxDyQty())); 
          }
//  MOVE WS-CNTNG-YLD-RT TO BDMS01-CNTNG-YLD-RT
          bdms01BaseSecurityExpData.setBdms01CntngYldRt(work.getCntngYldRt());
  
//  DISPLAY 'BDMS01-CNTNG-YLD-RT     = ' BDMS01-CNTNG-YLD-RT
          logger.info("BDMS01-CNTNG-YLD-RT     = {}", String.valueOf(bdms01BaseSecurityExpData.getBdms01CntngYldRt().movePointRight(8))); 
  
          // MOVE BDMS01-CNTNG-YLD-RT TO BDMS01-CNTNG-YLD-RT-EDT
          //  FORMAT_1371274613 = "ZZZZZZ9.99999999"
          work.setBdms01CntngYldRtEdt(CFUtil.cobolNumberFormatter(CONSTANTS.FORMAT_1371274613,bdms01CallParameters.getBdms01ReturnData().getBdms01BaseSecurityExpData().getBdms01CntngYldRt().toPlainString().toCharArray()));
  
//  DISPLAY 'BDMS01-CNTNG-YLD-RT-EDT = ' BDMS01-CNTNG-YLD-RT-EDT
          logger.info("BDMS01-CNTNG-YLD-RT-EDT = {}", new String(work.getBdms01CntngYldRtEdt())); 
          ;
      
      }
      /**
      * select1 
      *   This method is derived from 
  *   COBOL Paragraph - 1010-SELECT-1 COBOL Cyclomatic complexity - 2
      * Input  :  

      * - ctryHoliCt                     COBOL Name: WS-CTRY-HOLI-CT
      *
      * Output : None 

      * @throws CFException
      */
      private void select1() throws Exception {
//  SELECT 1 FROM SCHOLITB WHERE ISO_CNTRY_CD = 'US' AND HOLIDAY_DT = '2020-04-16' AND HOLIDAY_IND = 'Y' FETCH FIRST 1 ROWS ONLY WITH UR
          db2funcRepository.selectScholitb(work,sqlca);
//  PERFORM 9000-CHECK-SQLCODE THRU 9000-EXIT
          checkSqlcode();/*9000-CHECK-SQLCODE*/
          if (this.isProgramEnded()) {
              return ;
          }

// *
//  DISPLAY 'WS-CTRY-HOLI-CT = ' WS-CTRY-HOLI-CT
          logger.info("WS-CTRY-HOLI-CT = {}", String.valueOf(work.getCtryHoliCt())); 
          ;
      
      }
      /**
      * selectCount 
      *   This method is derived from 
  *   COBOL Paragraph - 1011-SELECT-COUNT COBOL Cyclomatic complexity - 2
      * Input  :  

      * - ctryHoliCt                     COBOL Name: WS-CTRY-HOLI-CT
      *
      * Output : None 

      * @throws CFException
      */
      private void selectCount() throws Exception {
//  SELECT COUNT ( * ) FROM SCHOLITB WHERE ISO_CNTRY_CD = 'US' AND HOLIDAY_DT = '2020-04-16' AND HOLIDAY_IND = 'Y' FETCH FIRST 1 ROWS ONLY WITH UR
          db2funcRepository.selectScholitb1(work,sqlca);
//  PERFORM 9000-CHECK-SQLCODE THRU 9000-EXIT
          checkSqlcode();/*9000-CHECK-SQLCODE*/
          if (this.isProgramEnded()) {
              return ;
          }

// *
//  DISPLAY 'WS-CTRY-HOLI-CT = ' WS-CTRY-HOLI-CT
          logger.info("WS-CTRY-HOLI-CT = {}", String.valueOf(work.getCtryHoliCt())); 
          ;
      
      }
      /**
      * checkSqlcode 
      *   This method is derived from 
  *   COBOL Paragraph - 9000-CHECK-SQLCODE COBOL Cyclomatic complexity - 5
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

          sqlcode = sqlca.getSqlcode();
//  EVALUATE TRUE
          if  (	( sqlcode == 0 )) { 
              ;
          }
          else   { 
              // MOVE SQLCODE TO SQLCODE-DISP
              //  FORMAT1484553271 = "-ZZZZ"
              work.setSqlcodeDisp(CFUtil.cobolNumberFormatter(CONSTANTS.FORMAT1484553271,String.valueOf(sqlca.getSqlcode()).toCharArray()));
//  DISPLAY '---SQL ERROR---'
              logger.info("---SQL ERROR---"); 
//  DISPLAY 'SQLCODE  = ' SQLCODE-DISP
              logger.info("SQLCODE  = {}", new String(work.getSqlcodeDisp())); 
//  ROLLBACK
              try {
              	// COMMIT
              	// reset SQLCODE
              	sqlca.setSqlcode(0);
                 // execute jdbc commit
                 db2Base.rollback();
              }
               catch (SQLException e) {
                         sqlca.setSqlcode(Db2Base.fillSQLCode(e.getMessage()));
                     }
               catch(Exception e) {
                handleErrorCode(e);
              }
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
          db2Base.reset("DB2FUNC" ,dbQualifier, true/*use Dynamic SQL*/);
          if(!isInitDone()) {
          	this.setRc(0);
          	setInitDone(true);
          }
        CFUtil.resetDecimalAsComma();
       }
  
      public int call(Object[] params) throws Exception {
      
      int len = params.length;
         if (len > 0 && params[0] != null )
            parm.set((Field)params[0]);
         // invoke the process and return rc
         return process();
         
      }
      
      public int call(Field... parameters) throws Exception {
         for (int index = 0; index < parameters.length;index++) {
             switch(index) {
              case 0:
                      if(parameters[index] != null ) {
              		if (parameters[index] instanceof Parm) {
                       	this.parm = ((Parm) parameters[index]);
                  	} else {
                       	this.parm.set(parameters[index]);
                  	}
                  }
                
                  break;
            }
         }
          return process();
      }
      
      
  
  
  
  
  
  }
