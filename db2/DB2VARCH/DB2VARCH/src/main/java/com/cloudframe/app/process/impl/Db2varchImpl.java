  package com.cloudframe.app.process.impl;
  /* 
*------------------------
*------------------------
*--------------
*/
  
  import com.cloudframe.app.db2varch.Db2varchCtx.*;
  import com.cloudframe.app.db2varch.Db2varchCtx;
  import com.cloudframe.app.process.Db2varch;
  import com.cloudframe.app.process.BaseProcess;
  import org.springframework.web.bind.annotation.GetMapping;
  import org.slf4j.Logger;
  import org.slf4j.LoggerFactory;
  import com.cloudframe.app.exception.CFException;
  import org.springframework.stereotype.Component;
  import org.springframework.web.bind.annotation.RestController;
  import com.cloudframe.app.dto.GlobalExecutorCtx;
  import com.cloudframe.app.process.Db2varcl;
  import org.springframework.beans.factory.annotation.Autowired;
  import org.springframework.beans.factory.annotation.Qualifier;
  import com.cloudframe.app.process.*;
  import com.cloudframe.app.exception.Terminate;
  import com.cloudframe.app.repository.Db2varchRepository;
  import com.cloudframe.app.utility.CFUtil;
  import com.cloudframe.app.data.Field;
  import com.cloudframe.app.db2varch.dto.*;
  import com.cloudframe.app.db2varch.dto.Dclbook;
  import com.cloudframe.app.db2varch.dto.BookReqArea;
  import com.cloudframe.app.db2varch.dto.Sqlca;
  import com.cloudframe.app.db2varch.dto.BookWorkArea;
  import com.cloudframe.app.db2varch.dto.Nullvars;
  import com.cloudframe.app.db2varch.dto.Ibook;
  import com.cloudframe.app.db2varch.dto.Work;
  import com.cloudframe.app.common.CONSTANTS;
  import com.cloudframe.app.common.SQLS;
  import org.springframework.beans.factory.annotation.Value;
  import com.cloudframe.app.dao.Db2Base;
  import java.sql.SQLException;
  
  @Component("db2varch")
  
  public class Db2varchImpl extends CommonProcess implements Db2varch {
  
  Logger logger = LoggerFactory.getLogger(Db2varchImpl.class);
  
  
  @Value("${DB2VARCH.dbQualifier:}")
  private String dbQualifier;
  
  
  @Autowired 
  @Qualifier("db2varcl")
  Db2varcl db2varcl;
  @Autowired 
  @Qualifier("db2varchRepository")
  Db2varchRepository db2varchRepository;
  
  
  
  
  
  
      /**
      * process 
      * Input  : None 

      * Output : None 

      * @throws CFException
      */
      public int process(Db2varchCtx programCtx) throws Exception {
       try {
       setCodePage("1047");
            // Reset program ended flag
           programCtx.setProgramEnded(false);
      	db2Base.reset("DB2VARCH" ,dbQualifier, true/*use Dynamic SQL*/);
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
		handleDbAtEnd(db2Base); 
		clearVars(); 
      

      }
      
       return programCtx.getRc(); // Exit with return code
      // end of process method
      }
      /**
      * main 
      *   This method is derived from 
  *   COBOL Paragraph - 0000-MAIN COBOL Cyclomatic complexity - 9
      * Input  :  

      * - bookIoStatus                   COBOL Name: BOOK-IO-STATUS
      *
      * Output :  

      * - dclbook                        COBOL Name: DCLBOOK
      * - ibook                          COBOL Name: IBOOK
      * - breqBookId                     COBOL Name: BREQ-BOOK-ID
      * - breqIsbn                       COBOL Name: BREQ-ISBN
      * - breqPublishedDateText          COBOL Name: BREQ-PUBLISHED-DATE-TEXT
      * - breqPublishedDateLen           COBOL Name: BREQ-PUBLISHED-DATE-LEN
      * - breqPublisherId                COBOL Name: BREQ-PUBLISHER-ID
      * - breqRating                     COBOL Name: BREQ-RATING
      * - breqTitleText                  COBOL Name: BREQ-TITLE-TEXT
      * - breqTitleLen                   COBOL Name: BREQ-TITLE-LEN
      * - breqTotalPages                 COBOL Name: BREQ-TOTAL-PAGES
      * - rc                             COBOL Name: RETURN-CODE
      * - bookId                         COBOL Name: BOOK-ID
      * - dateNull                       COBOL Name: WS-DATE-NULL
      *
      * @throws CFException
      */
      @Override
      public MainOutCtx main(MainInCtx methodIn) throws Exception {
Db2varchCtx programCtx = methodIn.getDb2varchCtx();
MainOutCtx methodOut = methodIn.getMainOutCtx();
//  INITIALIZE DCLBOOK IBOOK
          methodOut.getDclbook().initialize();
          methodOut.getIbook().initialize();
          // MOVE 9999 TO BREQ-BOOK-ID
          methodOut.setBreqBookId(9999);
          // MOVE 88887776 TO BREQ-ISBN
          methodOut.setBreqIsbn(88887776);
//  MOVE '16th April 2022' TO BREQ-PUBLISHED-DATE-TEXT
          methodOut.setBreqPublishedDateText(CONSTANTS.LITERAL_1872643415);
//  MOVE 15 TO BREQ-PUBLISHED-DATE-LEN
          methodOut.setBreqPublishedDateLen((short)15);
          // MOVE 1234 TO BREQ-PUBLISHER-ID
          methodOut.setBreqPublisherId(1234);
          // MOVE 5432 TO BREQ-RATING
          methodOut.setBreqRating(5432);
//  MOVE 'Testing VARCHAR Length Issues' TO BREQ-TITLE-TEXT
          methodOut.setBreqTitleText(CONSTANTS.LITERAL_1927616395);
//  MOVE 30 TO BREQ-TITLE-LEN
          methodOut.setBreqTitleLen((short)30);
          // MOVE 98 TO BREQ-TOTAL-PAGES
          methodOut.setBreqTotalPages(98);
//  DISPLAY '>>> Inserting a Book >>>'
          logger.info(">>> Inserting a Book >>>"); 
//  CALL WS-DB2VARCL USING SQLCA , BOOK-WORK-AREA , BOOK-REQ-AREA
          // CALL WS-DB2VARCL USING SQLCA , BOOK-WORK-AREA , BOOK-REQ-AREA
               programCtx.setRc( db2varcl.call(programCtx.getGlobalCtx().getContext("DB2VARCL"),programCtx.getSqlca(),methodOut.getBookWorkArea(),methodOut.getBookReqArea()));

// *    Perform 9999-sql-err-chk         thru 9999-exit
// *****goback.
//  IF BOOK-IO-OK OR BOOK-IO-DUPLICATE
//  ELSE
          if (!(methodIn.isBookIoOk())  && !(methodIn.isBookIoDuplicate()) ) { 
//  DISPLAY '>>> DB2VARCL Call Failed >>> RC Not OK'
              logger.info(">>> DB2VARCL Call Failed >>> RC Not OK"); 
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
//  GOBACK
              setNotLogged(false); // no need to log, it is a normal termination
              programCtx.setProgramEnded(true);
              return methodOut;
          }
//  DISPLAY '>>> DB2 Commit       >>>'
          logger.info(">>> DB2 Commit       >>>"); 
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
//  PERFORM 1000-SELECT-BOOK THRU 1000-EXIT
          selectBook(programCtx.getSelectBookInCtx());/*1000-SELECT-BOOK*/
          if (programCtx.isProgramEnded()) {
              return methodOut;
          }

// *
//  DISPLAY '>>> Updating  Book   >>>'
          logger.info(">>> Updating  Book   >>>"); 
          // MOVE 9999 TO BOOK-ID
          methodOut.setBookId(9999);
//  MOVE -1 TO WS-DATE-NULL
//  LITERAL_MN_1 = -1
          methodOut.setDateNull((short)-1);
//  UPDATE BOOK SET PUBLISHED_DATE = ? WHERE BOOK_ID = ?
          db2varchRepository.updateBook(methodOut.getDclbook(),programCtx.getSqlca(),methodOut.getNullvars());
//  PERFORM 1000-SELECT-BOOK THRU 1000-EXIT
          selectBook(programCtx.getSelectBookInCtx());/*1000-SELECT-BOOK*/
          if (programCtx.isProgramEnded()) {
              return methodOut;
          }

// *
//  DISPLAY '>>> Deleting  Book   >>>'
          logger.info(">>> Deleting  Book   >>>"); 
          // MOVE 9999 TO BOOK-ID
          methodOut.setBookId(9999);
//  DELETE FROM BOOK WHERE BOOK_ID = ?
          db2varchRepository.deleteBook(methodOut.getDclbook(),programCtx.getSqlca());
//  PERFORM 9999-SQL-ERR-CHK THRU 9999-EXIT
          sqlErrChk(programCtx.getSqlErrChkInCtx());/*9999-SQL-ERR-CHK*/
          if (programCtx.isProgramEnded()) {
              return methodOut;
          }

// *

// *-----------------------------------------------------------------

// *
//  STOP RUN
          setNotLogged(false); // no need to log, it is a normal termination
          programCtx.setProgramEnded(true);
          return methodOut;
      
      }
      /**
      * selectBook 
      *   This method is derived from 
  *   COBOL Paragraph - 1000-SELECT-BOOK COBOL Cyclomatic complexity - 4
      * Input  :  

      * - dateNull                       COBOL Name: WS-DATE-NULL
      * - rateNull                       COBOL Name: WS-RATE-NULL
      *
      * Output :  

      * - dclbook                        COBOL Name: DCLBOOK
      * - ibook                          COBOL Name: IBOOK
      * - bookId                         COBOL Name: BOOK-ID
      * - prtBookId                      COBOL Name: PRT-BOOK-ID
      * - isbn                           COBOL Name: ISBN
      * - prtIsbn                        COBOL Name: PRT-ISBN
      * - prtPublishedDateText           COBOL Name: PRT-PUBLISHED-DATE-TEXT
      * - prtPublishedDateLen            COBOL Name: PRT-PUBLISHED-DATE-LEN
      * - publishedDateText              COBOL Name: PUBLISHED-DATE-TEXT
      * - publishedDateLen               COBOL Name: PUBLISHED-DATE-LEN
      * - publisherId                    COBOL Name: PUBLISHER-ID
      * - prtPublisherId                 COBOL Name: PRT-PUBLISHER-ID
      * - prtRating                      COBOL Name: PRT-RATING
      * - rating                         COBOL Name: RATING
      * - titleText                      COBOL Name: TITLE-TEXT
      * - prtTitleText                   COBOL Name: PRT-TITLE-TEXT
      * - titleLen                       COBOL Name: TITLE-LEN
      * - prtTitleLen                    COBOL Name: PRT-TITLE-LEN
      * - totalPages                     COBOL Name: TOTAL-PAGES
      * - prtTotalPages                  COBOL Name: PRT-TOTAL-PAGES
      *
      * @throws CFException
      */
      @Override
      public SelectBookOutCtx selectBook(SelectBookInCtx methodIn) throws Exception {
Db2varchCtx programCtx = methodIn.getDb2varchCtx();
SelectBookOutCtx methodOut = methodIn.getSelectBookOutCtx();
//  DISPLAY '>>> Selecting Book   >>>'
          logger.info(">>> Selecting Book   >>>"); 
//  INITIALIZE DCLBOOK IBOOK
          methodOut.getDclbook().initialize();
          methodOut.getIbook().initialize();
          // MOVE 9999 TO BOOK-ID
          methodOut.setBookId(9999);
//  SELECT BOOK_ID , ISBN , PUBLISHED_DATE , PUBLISHER_ID , RATING , TITLE , TOTAL_PAGES FROM BOOK WHERE BOOK_ID = ?
          db2varchRepository.selectBook1(methodOut.getDclbook(),programCtx.getSqlca(),methodOut.getNullvars());
//  PERFORM 9999-SQL-ERR-CHK THRU 9999-EXIT
          sqlErrChk(programCtx.getSqlErrChkInCtx());/*9999-SQL-ERR-CHK*/
          // MOVE BOOK-ID TO PRT-BOOK-ID
          //  FORMAT260474221 = "-ZZZZZZZZZ"
          methodOut.setPrtBookId(CFUtil.cobolNumberFormatter(CONSTANTS.FORMAT260474221,String.valueOf(methodOut.getBookId()).toCharArray()));
          // MOVE ISBN TO PRT-ISBN
          //  FORMAT260474221 = "-ZZZZZZZZZ"
          methodOut.setPrtIsbn(CFUtil.cobolNumberFormatter(CONSTANTS.FORMAT260474221,String.valueOf(methodOut.getIsbn()).toCharArray()));
//  IF WS-DATE-NULL = -1 THEN
//  LITERAL_MN_1 = -1
          if (	( methodIn.getDateNull() == -1 ) ) { 
              // MOVE 'Null' TO PRT-PUBLISHED-DATE-TEXT
              methodOut.setPrtPublishedDateText(CONSTANTS.LITERAL_521471397);
//  MOVE '4' TO PRT-PUBLISHED-DATE-LEN
              methodOut.setPrtPublishedDateLen(4);
          }
//  ELSE
          else { 
              // MOVE PUBLISHED-DATE-TEXT TO PRT-PUBLISHED-DATE-TEXT
              methodOut.setPrtPublishedDateText(methodOut.getPublishedDateText());
//  MOVE PUBLISHED-DATE-LEN TO PRT-PUBLISHED-DATE-LEN
              methodOut.setPrtPublishedDateLen(methodOut.getPublishedDateLen());
          }
          // MOVE PUBLISHER-ID TO PRT-PUBLISHER-ID
          //  FORMAT260474221 = "-ZZZZZZZZZ"
          methodOut.setPrtPublisherId(CFUtil.cobolNumberFormatter(CONSTANTS.FORMAT260474221,String.valueOf(methodOut.getPublisherId()).toCharArray()));
//  IF WS-RATE-NULL = -1 THEN
//  LITERAL_MN_1 = -1
          if (	( methodIn.getRateNull() == -1 ) ) { 
//  MOVE -1 TO PRT-RATING
//  LITERAL_MN_1 = -1, FORMAT260474221 = "-ZZZZZZZZZ"
              methodOut.setPrtRating(CFUtil.cobolNumberFormatter(CONSTANTS.FORMAT260474221,CONSTANTS.LITERAL_MN_1));
          }
//  ELSE
          else { 
              // MOVE RATING TO PRT-RATING
              //  FORMAT260474221 = "-ZZZZZZZZZ"
              methodOut.setPrtRating(CFUtil.cobolNumberFormatter(CONSTANTS.FORMAT260474221,String.valueOf(methodOut.getRating()).toCharArray()));
          }
          // MOVE TITLE-TEXT TO PRT-TITLE-TEXT
          methodOut.setPrtTitleText(methodOut.getTitleText());
//  MOVE TITLE-LEN TO PRT-TITLE-LEN
          methodOut.setPrtTitleLen(methodOut.getTitleLen());
          // MOVE TOTAL-PAGES TO PRT-TOTAL-PAGES
          //  FORMAT260474221 = "-ZZZZZZZZZ"
          methodOut.setPrtTotalPages(CFUtil.cobolNumberFormatter(CONSTANTS.FORMAT260474221,String.valueOf(methodOut.getTotalPages()).toCharArray()));
//  DISPLAY '>>> Printing Book Details'
          logger.info(">>> Printing Book Details"); 
//  DISPLAY 'BOOK-ID            =(' PRT-BOOK-ID ')'
          logger.info("BOOK-ID            =({})", new String(methodOut.getPrtBookId())); 
//  DISPLAY 'ISBN               =(' PRT-ISBN ')'
          logger.info("ISBN               =({})", new String(methodOut.getPrtIsbn())); 
//  DISPLAY 'PUBLISHED-DATE-LEN =(' PRT-PUBLISHED-DATE-LEN ')'
          logger.info("PUBLISHED-DATE-LEN =({})", String.valueOf(methodOut.getPrtPublishedDateLen())); 
//  DISPLAY 'PUBLISHED-DATE-TEXT=(' PRT-PUBLISHED-DATE-TEXT (1 : PRT-PUBLISHED-DATE-LEN ) ')'
          logger.info("PUBLISHED-DATE-TEXT=({})", new String(substring(methodOut.getPrtPublishedDateText(),0,methodOut.getPrtPublishedDateLen()))); 
//  DISPLAY 'PUBLISHER-ID       =(' PRT-PUBLISHER-ID ')'
          logger.info("PUBLISHER-ID       =({})", new String(methodOut.getPrtPublisherId())); 
//  DISPLAY 'RATING             =(' PRT-RATING ')'
          logger.info("RATING             =({})", new String(methodOut.getPrtRating())); 
//  DISPLAY 'TITLE-LEN          =(' PRT-TITLE-LEN ')'
          logger.info("TITLE-LEN          =({})", String.valueOf(methodOut.getPrtTitleLen())); 
//  DISPLAY 'TITLE-TEXT         =(' PRT-TITLE-TEXT (1 : PRT-TITLE-LEN ) ')'
          logger.info("TITLE-TEXT         =({})", new String(substring(methodOut.getPrtTitleText(),0,methodOut.getPrtTitleLen()))); 
//  DISPLAY 'TOTAL-PAGES        =(' PRT-TOTAL-PAGES ')'
          logger.info("TOTAL-PAGES        =({})", new String(methodOut.getPrtTotalPages())); 
//  DISPLAY '<<<'
          logger.info("<<<"); 
          ;
      
      return methodOut;
      }
      /**
      * sqlErrChk 
      *   This method is derived from 
  *   COBOL Paragraph - 9999-SQL-ERR-CHK COBOL Cyclomatic complexity - 4
      * Input  :  

      * - sqlcode                        COBOL Name: SQLCODE
      *
      * Output :  

      * - sqlcode_Ws                     COBOL Name: WS-SQLCODE
      * - sqlcode                        COBOL Name: SQLCODE
      * - eofFlag                        COBOL Name: EOF-FLAG
      *
      * @throws CFException
      */
      @Override
      public SqlErrChkOutCtx sqlErrChk(SqlErrChkInCtx methodIn) throws Exception {
Db2varchCtx programCtx = methodIn.getDb2varchCtx();
SqlErrChkOutCtx methodOut = methodIn.getSqlErrChkOutCtx();
          // MOVE SQLCODE TO WS-SQLCODE
          //  FORMAT1016334848 = "----"
          methodOut.setSqlcode_Ws(CFUtil.cobolNumberFormatter(CONSTANTS.FORMAT1016334848,String.valueOf(methodOut.getSqlcode()).toCharArray()));
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
//  DISPLAY '---SQL ERROR--- SQLCODE = ' WS-SQLCODE
              logger.info("---SQL ERROR--- SQLCODE = {}", new String(methodOut.getSqlcode_Ws())); 
          }
      
      return methodOut;
      }
  
  
  
      public void setFromDb2varcl(Db2varchCtx programCtx, Object[] params) {
      int len = params.length;
         if (len > 0)
         if(params[0] instanceof Field) 
   programCtx.getSqlca().setString(((Field)params[0] ).toCharArray());
 else    programCtx.getSqlca().setString((char[])params[0] );
         if (len > 1)
         if(params[1] instanceof Field) 
   programCtx.getBookWorkArea().setString(((Field)params[1] ).toCharArray());
 else    programCtx.getBookWorkArea().setString((char[])params[1] );
         if (len > 2)
         if(params[2] instanceof Field) 
   programCtx.getBookReqArea().setString(((Field)params[2] ).toCharArray());
 else    programCtx.getBookReqArea().setString((char[])params[2] );
      }
  
  
  
  
  
  }
