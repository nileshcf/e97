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
  import com.cloudframe.app.db2varch.dto.BreqPublishedDate;
  import com.cloudframe.app.db2varch.dto.BreqTitleGrp;
  import com.cloudframe.app.process.Db2varcl;
  import org.springframework.beans.factory.annotation.Autowired;
  import org.springframework.beans.factory.annotation.Qualifier;
  import com.cloudframe.app.exception.Terminate;
  import com.cloudframe.app.repository.Db2varchRepository;
  import com.cloudframe.app.db2varch.dto.PublishedDate;
  import com.cloudframe.app.db2varch.dto.TitleGrp;
  import com.cloudframe.app.utility.CFUtil;
  import com.cloudframe.app.data.Field;
  import com.cloudframe.app.db2varch.dto.*;
  import com.cloudframe.app.db2varch.dto.BookWorkArea;
  import com.cloudframe.app.db2varch.dto.Dclbook;
  import com.cloudframe.app.db2varch.dto.Nullvars;
  import com.cloudframe.app.db2varch.dto.Sqlca;
  import com.cloudframe.app.db2varch.dto.Ibook;
  import com.cloudframe.app.db2varch.dto.BookReqArea;
  import com.cloudframe.app.db2varch.dto.Work;
  import com.cloudframe.app.common.CONSTANTS;
  import com.cloudframe.app.common.SQLS;
  import org.springframework.beans.factory.annotation.Value;
  import com.cloudframe.app.dao.Db2Base;
  import java.sql.SQLException;
  
  @Component("db2varch")
  
  public class Db2varch extends CommonProcess {
  
  Logger logger = LoggerFactory.getLogger(Db2varch.class);
  
  private BookWorkArea bookWorkArea = new BookWorkArea() ;
  private Dclbook dclbook = new Dclbook() ;
  private Nullvars nullvars = new Nullvars() ;
  private Sqlca sqlca = new Sqlca() ;
  private Ibook ibook = new Ibook() ;
  private BookReqArea bookReqArea = new BookReqArea() ;
  private Work work = new Work() ;
  
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
      private void main() throws Exception {
			// Declare local variables used in the method
			BreqPublishedDate breqPublishedDate = bookReqArea.getBreqPublishedDate();
			BreqTitleGrp breqTitleGrp = bookReqArea.getBreqTitleGrp();
			PublishedDate publishedDate = dclbook.getPublishedDate();
			// End of variable declaration

//  INITIALIZE DCLBOOK IBOOK
          dclbook.initialize();
          ibook.initialize();
          // MOVE 9999 TO BREQ-BOOK-ID
          bookReqArea.setBreqBookId(9999);
          // MOVE 88887776 TO BREQ-ISBN
          bookReqArea.setBreqIsbn(88887776);
//  MOVE '16th April 2022' TO BREQ-PUBLISHED-DATE-TEXT
          breqPublishedDate.setBreqPublishedDateText(CONSTANTS.LITERAL_1872643415);
  
//  MOVE 15 TO BREQ-PUBLISHED-DATE-LEN
          breqPublishedDate.setBreqPublishedDateLen((short)15);
  
          // MOVE 1234 TO BREQ-PUBLISHER-ID
          bookReqArea.setBreqPublisherId(1234);
          // MOVE 5432 TO BREQ-RATING
          bookReqArea.setBreqRating(5432);
//  MOVE 'Testing VARCHAR Length Issues' TO BREQ-TITLE-TEXT
          breqTitleGrp.setBreqTitleText(CONSTANTS.LITERAL_1927616395);
  
//  MOVE 30 TO BREQ-TITLE-LEN
          breqTitleGrp.setBreqTitleLen((short)30);
  
          // MOVE 98 TO BREQ-TOTAL-PAGES
          bookReqArea.setBreqTotalPages(98);
//  DISPLAY '>>> Inserting a Book >>>'
          logger.info(">>> Inserting a Book >>>"); 
//  CALL WS-DB2VARCL USING SQLCA , BOOK-WORK-AREA , BOOK-REQ-AREA
          // CALL WS-DB2VARCL USING SQLCA , BOOK-WORK-AREA , BOOK-REQ-AREA
               this.setRc( db2varcl.call(sqlca,bookWorkArea,bookReqArea));

// *    Perform 9999-sql-err-chk         thru 9999-exit
// *****goback.
//  IF BOOK-IO-OK OR BOOK-IO-DUPLICATE
//  ELSE
          if (!(bookWorkArea.isBookIoOk())  && !(bookWorkArea.isBookIoDuplicate()) ) { 
//  DISPLAY '>>> DB2VARCL Call Failed >>> RC Not OK'
              logger.info(">>> DB2VARCL Call Failed >>> RC Not OK"); 
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
//  GOBACK
              setNotLogged(false); // no need to log, it is a normal termination
              this.setProgramEnded(true);
              return ;
          }
//  DISPLAY '>>> DB2 Commit       >>>'
          logger.info(">>> DB2 Commit       >>>"); 
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
//  PERFORM 1000-SELECT-BOOK THRU 1000-EXIT
          selectBook();/*1000-SELECT-BOOK*/
          if (this.isProgramEnded()) {
              return ;
          }

// *
//  DISPLAY '>>> Updating  Book   >>>'
          logger.info(">>> Updating  Book   >>>"); 
          // MOVE 9999 TO BOOK-ID
          dclbook.setBookId(9999);
//  MOVE -1 TO WS-DATE-NULL
//  LITERAL_MN_1 = -1
          nullvars.setDateNull((short)-1);
//  UPDATE BOOK SET PUBLISHED_DATE = ? WHERE BOOK_ID = ?
          db2varchRepository.updateBook(dclbook,nullvars,sqlca);
  
//  PERFORM 1000-SELECT-BOOK THRU 1000-EXIT
          selectBook();/*1000-SELECT-BOOK*/
          if (this.isProgramEnded()) {
              return ;
          }

// *
//  DISPLAY '>>> Deleting  Book   >>>'
          logger.info(">>> Deleting  Book   >>>"); 
          // MOVE 9999 TO BOOK-ID
          dclbook.setBookId(9999);
//  DELETE FROM BOOK WHERE BOOK_ID = ?
          db2varchRepository.deleteBook(dclbook,sqlca);
//  PERFORM 9999-SQL-ERR-CHK THRU 9999-EXIT
          sqlErrChk();/*9999-SQL-ERR-CHK*/
          if (this.isProgramEnded()) {
              return ;
          }

// *

// *-----------------------------------------------------------------

// *
//  STOP RUN
          setNotLogged(false); // no need to log, it is a normal termination
          this.setProgramEnded(true);
          return ;
      
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
      private void selectBook() throws Exception {
			// Declare local variables used in the method
			PublishedDate publishedDate = dclbook.getPublishedDate();
			TitleGrp titleGrp = dclbook.getTitleGrp();
			short dateNull = 0;
			short rateNull = 0;
			// End of variable declaration

//  DISPLAY '>>> Selecting Book   >>>'
          logger.info(">>> Selecting Book   >>>"); 
//  INITIALIZE DCLBOOK IBOOK
          dclbook.initialize();
          ibook.initialize();
          // MOVE 9999 TO BOOK-ID
          dclbook.setBookId(9999);
//  SELECT BOOK_ID , ISBN , PUBLISHED_DATE , PUBLISHER_ID , RATING , TITLE , TOTAL_PAGES FROM BOOK WHERE BOOK_ID = ?
          db2varchRepository.selectBook1(dclbook,nullvars,sqlca);
  
//  PERFORM 9999-SQL-ERR-CHK THRU 9999-EXIT
          sqlErrChk();/*9999-SQL-ERR-CHK*/
          // MOVE BOOK-ID TO PRT-BOOK-ID
          //  FORMAT260474221 = "-ZZZZZZZZZ"
          work.setPrtBookId(CFUtil.cobolNumberFormatter(CONSTANTS.FORMAT260474221,String.valueOf(dclbook.getBookId()).toCharArray()));
          // MOVE ISBN TO PRT-ISBN
          //  FORMAT260474221 = "-ZZZZZZZZZ"
          work.setPrtIsbn(CFUtil.cobolNumberFormatter(CONSTANTS.FORMAT260474221,String.valueOf(dclbook.getIsbn()).toCharArray()));
          dateNull = nullvars.getDateNull();
//  IF WS-DATE-NULL = -1 THEN
//  LITERAL_MN_1 = -1
          if (	( dateNull == -1 ) ) { 
              // MOVE 'Null' TO PRT-PUBLISHED-DATE-TEXT
              work.setPrtPublishedDateText(CONSTANTS.LITERAL_521471397);
//  MOVE '4' TO PRT-PUBLISHED-DATE-LEN
              work.setPrtPublishedDateLen(4);
          }
  
//  ELSE
          else { 
              // MOVE PUBLISHED-DATE-TEXT TO PRT-PUBLISHED-DATE-TEXT
              work.setPrtPublishedDateText(dclbook.getPublishedDate().getPublishedDateText());
  
//  MOVE PUBLISHED-DATE-LEN TO PRT-PUBLISHED-DATE-LEN
              work.setPrtPublishedDateLen(publishedDate.getPublishedDateLen());
  
          }
          // MOVE PUBLISHER-ID TO PRT-PUBLISHER-ID
          //  FORMAT260474221 = "-ZZZZZZZZZ"
          work.setPrtPublisherId(CFUtil.cobolNumberFormatter(CONSTANTS.FORMAT260474221,String.valueOf(dclbook.getPublisherId()).toCharArray()));
          rateNull = nullvars.getRateNull();
//  IF WS-RATE-NULL = -1 THEN
//  LITERAL_MN_1 = -1
          if (	( rateNull == -1 ) ) { 
//  MOVE -1 TO PRT-RATING
//  LITERAL_MN_1 = -1, FORMAT260474221 = "-ZZZZZZZZZ"
              work.setPrtRating(CFUtil.cobolNumberFormatter(CONSTANTS.FORMAT260474221,CONSTANTS.LITERAL_MN_1));
          }
  
//  ELSE
          else { 
              // MOVE RATING TO PRT-RATING
              //  FORMAT260474221 = "-ZZZZZZZZZ"
              work.setPrtRating(CFUtil.cobolNumberFormatter(CONSTANTS.FORMAT260474221,String.valueOf(dclbook.getRating()).toCharArray()));
          }
          // MOVE TITLE-TEXT TO PRT-TITLE-TEXT
          work.setPrtTitleText(dclbook.getTitleGrp().getTitleText());
  
//  MOVE TITLE-LEN TO PRT-TITLE-LEN
          work.setPrtTitleLen(titleGrp.getTitleLen());
  
          // MOVE TOTAL-PAGES TO PRT-TOTAL-PAGES
          //  FORMAT260474221 = "-ZZZZZZZZZ"
          work.setPrtTotalPages(CFUtil.cobolNumberFormatter(CONSTANTS.FORMAT260474221,String.valueOf(dclbook.getTotalPages()).toCharArray()));
//  DISPLAY '>>> Printing Book Details'
          logger.info(">>> Printing Book Details"); 
//  DISPLAY 'BOOK-ID            =(' PRT-BOOK-ID ')'
          logger.info("BOOK-ID            =({})", new String(work.getPrtBookId())); 
//  DISPLAY 'ISBN               =(' PRT-ISBN ')'
          logger.info("ISBN               =({})", new String(work.getPrtIsbn())); 
//  DISPLAY 'PUBLISHED-DATE-LEN =(' PRT-PUBLISHED-DATE-LEN ')'
          logger.info("PUBLISHED-DATE-LEN =({})", String.valueOf(work.getPrtPublishedDateLen())); 
//  DISPLAY 'PUBLISHED-DATE-TEXT=(' PRT-PUBLISHED-DATE-TEXT (1 : PRT-PUBLISHED-DATE-LEN ) ')'
          logger.info("PUBLISHED-DATE-TEXT=({})", new String(substring(work.getPrtPublishedDateText(),0,work.getPrtPublishedDateLen()))); 
//  DISPLAY 'PUBLISHER-ID       =(' PRT-PUBLISHER-ID ')'
          logger.info("PUBLISHER-ID       =({})", new String(work.getPrtPublisherId())); 
//  DISPLAY 'RATING             =(' PRT-RATING ')'
          logger.info("RATING             =({})", new String(work.getPrtRating())); 
//  DISPLAY 'TITLE-LEN          =(' PRT-TITLE-LEN ')'
          logger.info("TITLE-LEN          =({})", String.valueOf(work.getPrtTitleLen())); 
//  DISPLAY 'TITLE-TEXT         =(' PRT-TITLE-TEXT (1 : PRT-TITLE-LEN ) ')'
          logger.info("TITLE-TEXT         =({})", new String(substring(work.getPrtTitleText(),0,work.getPrtTitleLen()))); 
//  DISPLAY 'TOTAL-PAGES        =(' PRT-TOTAL-PAGES ')'
          logger.info("TOTAL-PAGES        =({})", new String(work.getPrtTotalPages())); 
//  DISPLAY '<<<'
          logger.info("<<<"); 
          ;
      
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
      private void sqlErrChk() throws Exception {
			// Declare local variables used in the method
			int sqlcode = 0;
			// End of variable declaration

          // MOVE SQLCODE TO WS-SQLCODE
          //  FORMAT1016334848 = "----"
          work.setSqlcode_Ws(CFUtil.cobolNumberFormatter(CONSTANTS.FORMAT1016334848,String.valueOf(sqlca.getSqlcode()).toCharArray()));
          sqlcode = sqlca.getSqlcode();
//  EVALUATE TRUE
          if  (	( sqlcode == 0 )) { 
              ;
          }
          else if  (	( sqlcode == 100 )) { 
              // MOVE 'Y' TO EOF-FLAG
              //  LITERAL_Y = 'Y'
              work.setEofFlag(CONSTANTS.LITERAL_Y);
          }
          else   { 
//  DISPLAY '---SQL ERROR--- SQLCODE = ' WS-SQLCODE
              logger.info("---SQL ERROR--- SQLCODE = {}", new String(work.getSqlcode_Ws())); 
          }
  
      
      }
  
  
      /**
* This method pre-initializes variables consistent with
* what a mainframe program would have done at the start of a program
*/
      @Override
      public void initVars() throws CFException {
      setProgramEnded(false);
          db2Base.reset("DB2VARCH" ,dbQualifier, true/*use Dynamic SQL*/);
          if(!isInitDone()) {
          	this.setRc(0);
          	setInitDone(true);
          }
        CFUtil.resetDecimalAsComma();
       }
  
      public void setFromDb2varcl(Object[] params) {
      int len = params.length;
         if (len > 0)
         if(params[0] instanceof Field) 
   sqlca.setString(((Field)params[0] ).toCharArray());
 else    sqlca.setString((char[])params[0] );
         if (len > 1)
         if(params[1] instanceof Field) 
   bookWorkArea.setString(((Field)params[1] ).toCharArray());
 else    bookWorkArea.setString((char[])params[1] );
         if (len > 2)
         if(params[2] instanceof Field) 
   bookReqArea.setString(((Field)params[2] ).toCharArray());
 else    bookReqArea.setString((char[])params[2] );
      }
  
  
  
  
  
  }
