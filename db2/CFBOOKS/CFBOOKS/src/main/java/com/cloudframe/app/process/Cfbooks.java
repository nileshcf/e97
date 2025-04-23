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
  import org.springframework.beans.factory.annotation.Autowired;
  import org.springframework.beans.factory.annotation.Qualifier;
  import com.cloudframe.app.repository.CfbooksRepository;
  import com.cloudframe.app.exception.Terminate;
  import com.cloudframe.app.cfbooks.file.*;
  import com.cloudframe.app.cfbooks.dto.BooksTitle;
  import com.cloudframe.app.cfbooks.dto.BooksIsbn;
  import com.cloudframe.app.data.Field;
  import com.cloudframe.app.utility.CFUtil;
  import java.math.BigDecimal;
  import java.util.ArrayList;
  import java.util.Map;
  import java.util.HashMap;
  import com.cloudframe.app.cfbooks.dto.*;
  import com.cloudframe.app.cfbooks.dto.Sqlca;
  import com.cloudframe.app.cfbooks.dto.HeaderTitle;
  import com.cloudframe.app.cfbooks.dto.HeaderTime;
  import com.cloudframe.app.cfbooks.dto.Nullvars;
  import com.cloudframe.app.cfbooks.file.records.RepOpFields;
  import com.cloudframe.app.cfbooks.dto.Vars;
  import com.cloudframe.app.cfbooks.dto.Dclbooks;
  import com.cloudframe.app.cfbooks.dto.Work;
  import com.cloudframe.app.common.CONSTANTS;
  import com.cloudframe.app.common.SQLS;
  import org.springframework.beans.factory.annotation.Value;
  import com.cloudframe.app.dao.Db2Base;
  import java.sql.SQLException;
  
  @Component("cfbooks")
  
  public class Cfbooks extends CommonProcess {
  
  Logger logger = LoggerFactory.getLogger(Cfbooks.class);
  
  private Sqlca sqlca = new Sqlca() ;
  private HeaderTitle headerTitle = new HeaderTitle() ;
  private HeaderTime headerTime = new HeaderTime() ;
  private Nullvars nullvars = new Nullvars() ;
  private RepOpFields repOpFields = new RepOpFields() ;
  private Vars vars = new Vars() ;
  private Dclbooks dclbooks = new Dclbooks() ;
  private Work work = new Work() ;
  
  @Value("${CFBOOKS.dbQualifier:}")
  private String dbQualifier;
  
  
  @Autowired 
  @Qualifier("db2Base")
  Db2Base db2Base;
  @Autowired 
  @Qualifier("cfbooksRepository")
  CfbooksRepository cfbooksRepository;
  @Autowired 
  @Qualifier("cfbooks_repOp")
  RepOp repOp;
  
  
  
  
  
  
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
      		if(repOp.hasOpened() && !repOp.isReadOnly()) { 
      			repOp.flush(); 
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
  *   COBOL Paragraph - 0000-MAIN COBOL Cyclomatic complexity - 5
      * Input  : None 

      * Output :  

      * - pageNo                         COBOL Name: WS-PAGE-NO
      * - eofFlag                        COBOL Name: EOF-FLAG
      * - errMsg                         COBOL Name: ERR-MSG
      * - writeRec                       COBOL Name: WS-WRITE-REC
      *
      * @throws CFException
      */
      private void main() throws Exception {
//  PERFORM 1000-INITIALIZE THRU 1000-EXIT
          initialize();/*1000-INITIALIZE*/
          if (this.isProgramEnded()) {
              return ;
          }
          // MOVE 1 TO WS-PAGE-NO
          headerTime.setPageNo(1);
//  PERFORM 1100-WRITE-HEADER THRU 1100-EXIT
          writeHeader();/*1100-WRITE-HEADER*/
          if (this.isProgramEnded()) {
              return ;
          }

// * Extract all books from database and generate report
//  MOVE SPACES TO EOF-FLAG
          work.setEofFlag(CONSTANTS.SPACE);
//  SELECT BOOK_ID , RTRIM ( TITLE ) , TOTAL_PAGES , RATING , ISBN , PUBLISHED_DATE , PUBLISHER_ID FROM BOOKS ORDER BY BOOK_ID ASC WITH UR
          cfbooksRepository.openBookscurCfbooks(sqlca);
          // MOVE 'ERROR OPENING BOOKSCUR' TO ERR-MSG
          work.setErrMsg(CONSTANTS.LITERAL_ERROR_B10_OPENINGBOOKSCUR);
//  PERFORM 9999-SQL-ERR-CHK THRU 9999-EXIT
          sqlErrChk();/*9999-SQL-ERR-CHK*/
          if (this.isProgramEnded()) {
              return ;
          }
//  PERFORM 1200-FETCH-CURSOR THRU 1200-EXIT
          fetchCursor();/*1200-FETCH-CURSOR*/
          if (this.isProgramEnded()) {
              return ;
          }

// *

// *
//  PERFORM 2000-SQLMAIN THRU 2000-EXIT UNTIL END-OF-FILE
          while (!(work.isEndOfFile()) ) {
             sqlmain();/*2000-SQLMAIN*/
             if (this.isProgramEnded()) {
                 return ;
             }
          }
//  SET 88-DONT-WRITE-REC TO TRUE
          work.setDontWriteRec88True(); 
          
//  CLOSE BOOKSCUR
          cfbooksRepository.closeBookscurCfbooks(sqlca);
          // MOVE 'ERROR CLOSING BOOKSCUR' TO ERR-MSG
          work.setErrMsg(CONSTANTS.LITERAL_ERROR_B10_CLOSINGBOOKSCUR);
//  PERFORM 9999-SQL-ERR-CHK THRU 9999-EXIT
          sqlErrChk();/*9999-SQL-ERR-CHK*/
          if (this.isProgramEnded()) {
              return ;
          }

// *
//  PERFORM 3000-HOUSEKEEPING THRU 3000-EXIT
          housekeeping();/*3000-HOUSEKEEPING*/
          if (this.isProgramEnded()) {
              return ;
          }
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
      * - repopStat                      COBOL Name: REPOP-STAT
      * - booksTitleText                 COBOL Name: BOOKS-TITLE-TEXT
      * - booksIsbnText                  COBOL Name: BOOKS-ISBN-TEXT
      * - booksTitleLen                  COBOL Name: BOOKS-TITLE-LEN
      * - booksIsbnLen                   COBOL Name: BOOKS-ISBN-LEN
      *
      * @throws CFException
      */
      private void initialize() throws Exception {
			// Declare local variables used in the method
			BooksTitle booksTitle = dclbooks.getBooksTitle();
			BooksIsbn booksIsbn = dclbooks.getBooksIsbn();
			// End of variable declaration

      
// *-----------------------------------------------------------------
          // MOVE '1000-INITALIZE' TO ERR-LOC
          work.setErrLoc(CONSTANTS.LITERAL_1000_MN_INITALIZE_B6_);
//  SELECT CURRENT_TIMESTAMP FROM SYSIBM.SYSDUMMY1
          
/**
******      SELECT CURRENT_TIMESTAMP                               
******      INTO :WS-TIMESTAMP                                     
******      FROM SYSIBM.SYSDUMMY1                                  
**/
          sqlca.setSqlcode(0);
          vars.setTimestamp(db2Base.getCurrentTimestamp()); 
          // MOVE 'ERROR WITH TIMESTAMP' TO ERR-MSG
          work.setErrMsg(CONSTANTS.LITERAL_ERROR_B12_WITHTIMESTAMP);
//  PERFORM 9999-SQL-ERR-CHK THRU 9999-EXIT
          sqlErrChk();/*9999-SQL-ERR-CHK*/
          if (this.isProgramEnded()) {
              return ;
          }
//  MOVE WS-TIMESTAMP (1 : 10) TO WS-DATE-R
          headerTitle.setDateR(vars.getTimestamp());
//  MOVE WS-TIMESTAMP (12 : 12) TO WS-TIME-R
          headerTime.replace(vars/*parent*/,0+12 - 1/*fromOffset - (timeR) */,12/*fromLen*/,119/*toOffset - (timestamp) */,12/*toLen*/);
//  MOVE '2021-10-13' TO WS-DATE-R
//  LITERAL_2021_MN2_1013 = '2021-10-13'
          headerTitle.setDateR(CONSTANTS.LITERAL_2021_MN2_1013);
//  MOVE '15.51.03.325' TO WS-TIME-R
//  LITERAL_486634995 = '15.51.03.325'
          headerTime.setTimeR(CONSTANTS.LITERAL_486634995);
//  OPEN OUTPUT REP-OP
          repOp.open(new String(CONSTANTS.MODE_WRITE_ONLY_36397),repOp.getFileName(),repOp.getRepOpCharSet(),repOp.getRepOpCrlfFlag());
          work.setRepopStat(repOp.getStatus() );
          // MOVE 'ERROR OPENING REP-OP' TO ERR-MSG
          work.setErrMsg(CONSTANTS.LITERAL_ERROR_B12_OPENINGREP_MN_OP);
//  PERFORM 9998-FILE-ERR-CHK THRU 9998-EXIT
          fileErrChk();/*9998-FILE-ERR-CHK*/
          if (this.isProgramEnded()) {
              return ;
          }
//  MOVE SPACES TO BOOKS-TITLE-TEXT BOOKS-ISBN-TEXT
          booksTitle.setBooksTitleText(CONSTANTS.SPACE_255);
          booksIsbn.setBooksIsbnText(CONSTANTS.SPACE_13);
  
//  MOVE 0 TO BOOKS-TITLE-LEN BOOKS-ISBN-LEN
          booksTitle.setBooksTitleLen((short)0);
          booksIsbn.setBooksIsbnLen((short)0);
  
      
      }
      /**
      * writeHeader 
      *   This method is derived from 
  *   COBOL Paragraph - 1100-WRITE-HEADER COBOL Cyclomatic complexity - 1
      * Input  :  

      * - repOpFields                    COBOL Name: REP-OP-FIELDS
      *
      * Output :  

      * - errLoc                         COBOL Name: ERR-LOC
      * - repopStat                      COBOL Name: REPOP-STAT
      * - errMsg                         COBOL Name: ERR-MSG
      *
      * @throws CFException
      */
      private void writeHeader() throws Exception {
      
// *-----------------------------------------------------------------

// * Write header records
          // MOVE '1100-WRITE-HEADER' TO ERR-LOC
          work.setErrLoc(CONSTANTS.LITERAL_1100_MN2_WRITEHEADER_B3_);
//  WRITE REP-OP-FIELDS FROM WS-HEADER-TITLE
          repOp.write(headerTitle.toCharArray()); 
          repOpFields.setString(CONSTANTS.LOW_VALUE_215751987);
          work.setRepopStat(repOp.getStatus() );
//  WRITE REP-OP-FIELDS FROM WS-HEADER-TIME
          repOp.write(headerTime.toCharArray()); 
          repOpFields.setString(CONSTANTS.LOW_VALUE_215751987);
          work.setRepopStat(repOp.getStatus() );
//  WRITE REP-OP-FIELDS FROM WS-SPACE
          repOp.write(work.getSpace()); 
          repOpFields.setString(CONSTANTS.LOW_VALUE_215751987);
          work.setRepopStat(repOp.getStatus() );
//  WRITE REP-OP-FIELDS FROM WS-SPACE
          repOp.write(work.getSpace()); 
          repOpFields.setString(CONSTANTS.LOW_VALUE_215751987);
          work.setRepopStat(repOp.getStatus() );
//  WRITE REP-OP-FIELDS FROM WS-HEADER-LABEL
          repOp.write(work.getHeaderLabel()); 
          repOpFields.setString(CONSTANTS.LOW_VALUE_215751987);
          work.setRepopStat(repOp.getStatus() );
//  WRITE REP-OP-FIELDS FROM WS-HEADER-LINE
          repOp.write(work.getHeaderLine()); 
          repOpFields.setString(CONSTANTS.LOW_VALUE_215751987);
          work.setRepopStat(repOp.getStatus() );
          // MOVE 'ERROR WRITING HEADER' TO ERR-MSG
          work.setErrMsg(CONSTANTS.LITERAL_ERROR_B12_WRITINGHEADER);
//  PERFORM 9998-FILE-ERR-CHK THRU 9998-EXIT
          fileErrChk();/*9998-FILE-ERR-CHK*/
          if (this.isProgramEnded()) {
              return ;
          }
          ;
      
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
      private void fetchCursor() throws Exception {
			// Declare local variables used in the method
			BooksTitle booksTitle = dclbooks.getBooksTitle();
			BooksIsbn booksIsbn = dclbooks.getBooksIsbn();
			// End of variable declaration

      
// *-----------------------------------------------------------------
          // MOVE '1200-FETCH-CURSOR' TO ERR-LOC
          work.setErrLoc(CONSTANTS.LITERAL_1200_MN2_FETCHCURSOR_B3_);
//  FETCH BOOKSCUR INTO ? , ? , ? , ? , ? , ? , ?
          cfbooksRepository.fetchBookscurCfbooks(dclbooks,sqlca,nullvars);
  
          // MOVE 'ERROR FETCHING BOOKSCUR' TO ERR-MSG
          work.setErrMsg(CONSTANTS.LITERAL_ERROR_B9_FETCHINGBOOKSCUR);
//  PERFORM 9999-SQL-ERR-CHK THRU 9999-EXIT
          sqlErrChk();/*9999-SQL-ERR-CHK*/
          if (this.isProgramEnded()) {
              return ;
          }
          ;
      
      }
      /**
      * sqlmain 
      *   This method is derived from 
  *   COBOL Paragraph - 2000-SQLMAIN COBOL Cyclomatic complexity - 17
      * Input  :  

      * - booksBookId                    COBOL Name: BOOKS-BOOK-ID
      * - booksTotalPages                COBOL Name: BOOKS-TOTAL-PAGES
      * - booksRating                    COBOL Name: BOOKS-RATING
      * - booksIsbnText                  COBOL Name: BOOKS-ISBN-TEXT
      * - booksPublishedDate             COBOL Name: BOOKS-PUBLISHED-DATE
      * - booksPublisherId               COBOL Name: BOOKS-PUBLISHER-ID
      * - booksTitleLen                  COBOL Name: BOOKS-TITLE-LEN
      * - booksTitleText                 COBOL Name: BOOKS-TITLE-TEXT
      *
      * Output :  

      * - errLoc                         COBOL Name: ERR-LOC
      * - repOpFields                    COBOL Name: REP-OP-FIELDS
      * - bookid                         COBOL Name: WS-BOOKID
      * - booksBookId                    COBOL Name: BOOKS-BOOK-ID
      * - opBookid                       COBOL Name: OP-BOOKID
      * - pages                          COBOL Name: WS-PAGES
      * - booksTotalPages                COBOL Name: BOOKS-TOTAL-PAGES
      * - opPages                        COBOL Name: OP-PAGES
      * - rating                         COBOL Name: WS-RATING
      * - booksRating                    COBOL Name: BOOKS-RATING
      * - opRating                       COBOL Name: OP-RATING
      * - opIsbn                         COBOL Name: OP-ISBN
      * - booksIsbnText                  COBOL Name: BOOKS-ISBN-TEXT
      * - opPubdate                      COBOL Name: OP-PUBDATE
      * - booksPublishedDate             COBOL Name: BOOKS-PUBLISHED-DATE
      * - pubid                          COBOL Name: WS-PUBID
      * - booksPublisherId               COBOL Name: BOOKS-PUBLISHER-ID
      * - opPubid                        COBOL Name: OP-PUBID
      * - opTitle                        COBOL Name: OP-TITLE
      * - booksTitleText                 COBOL Name: BOOKS-TITLE-TEXT
      * - booksTitleLen                  COBOL Name: BOOKS-TITLE-LEN
      * - booksIsbnLen                   COBOL Name: BOOKS-ISBN-LEN
      *
      * @throws CFException
      */
      private void sqlmain() throws Exception {
			// Declare local variables used in the method
			BooksIsbn booksIsbn = dclbooks.getBooksIsbn();
			ArrayList<char[]> charArray = new ArrayList<char[]>();
			char[] joinCharArray = null;
			Map<String,Object> updated = null;
			BooksTitle booksTitle = dclbooks.getBooksTitle();
			short booksTitleLen = 0;
			// End of variable declaration

      
// *-----------------------------------------------------------------
          // MOVE '2000-SQLMAIN' TO ERR-LOC
          work.setErrLoc(CONSTANTS.LITERAL_2000_MN_SQLMAIN_B8_);
//  MOVE SPACES TO REP-OP-FIELDS
          repOpFields.setString(CONSTANTS.SPACE_132);
          // MOVE BOOKS-BOOK-ID TO WS-BOOKID
          vars.setBookid(dclbooks.getBooksBookId());
//  MOVE WS-BOOKID TO OP-BOOKID
          repOpFields.setOpBookid(String.valueOf(vars.getBookidString()).toCharArray());
//  MOVE BOOKS-TOTAL-PAGES TO WS-PAGES
          vars.setPages(dclbooks.getBooksTotalPages());
//  MOVE WS-PAGES TO OP-PAGES
          repOpFields.setOpPages(String.valueOf(vars.getPagesString()).toCharArray());
//  MOVE BOOKS-RATING TO WS-RATING
//  FORMAT_1027458795 = "9.99"
          vars.setRating(CFUtil.cobolNumberFormatter(CONSTANTS.FORMAT_1027458795,dclbooks.getBooksRating().toPlainString().toCharArray()));
//  MOVE WS-RATING TO OP-RATING
          repOpFields.setOpRating(vars.getRating());
//  MOVE BOOKS-ISBN-TEXT TO OP-ISBN
          repOpFields.setOpIsbn(booksIsbn.getBooksIsbnText());
  
//  MOVE BOOKS-PUBLISHED-DATE TO OP-PUBDATE
          repOpFields.setOpPubdate(dclbooks.getBooksPublishedDate());
//  MOVE BOOKS-PUBLISHER-ID TO WS-PUBID
          vars.setPubid(dclbooks.getBooksPublisherId());
//  MOVE WS-PUBID TO OP-PUBID
          repOpFields.setOpPubid(String.valueOf(vars.getPubidString()).toCharArray());
          booksTitleLen = booksTitle.getBooksTitleLen();
//  EVALUATE TRUE
          if  (	( booksTitleLen > 228 ) ) { 
//  STRING BOOKS-TITLE-TEXT (1 : 76) DELIMITED BY SIZE '-' DELIMITED BY SIZE INTO OP-TITLE END-STRING
              charArray = new ArrayList<char[]>();
                 charArray.add(substring(dclbooks.getBooksTitle().getBooksTitleText(),0,76));
                 charArray.add(CONSTANTS.LITERAL_MN_);
              joinCharArray = Field.mergeArrays(charArray.get(0),charArray.get(1));
              updated = updateString(repOpFields.getOpTitle() ,joinCharArray);
              repOpFields.setOpTitle(  (char[])updated.get("string"));
//  PERFORM 2100-WRITE-RECORD THRU 2100-EXIT
              writeRecord();/*2100-WRITE-RECORD*/
              if (this.isProgramEnded()) {
                  return ;
              }
//  STRING BOOKS-TITLE-TEXT (77 : 76) DELIMITED BY SIZE '-' DELIMITED BY SIZE INTO OP-TITLE END-STRING
              charArray = new ArrayList<char[]>();
                 charArray.add(substring(dclbooks.getBooksTitle().getBooksTitleText(),76,152));
                 charArray.add(CONSTANTS.LITERAL_MN_);
              joinCharArray = Field.mergeArrays(charArray.get(0),charArray.get(1));
              updated = updateString(repOpFields.getOpTitle() ,joinCharArray);
              repOpFields.setOpTitle(  (char[])updated.get("string"));
//  PERFORM 2100-WRITE-RECORD THRU 2100-EXIT
              writeRecord();/*2100-WRITE-RECORD*/
              if (this.isProgramEnded()) {
                  return ;
              }
//  STRING BOOKS-TITLE-TEXT (153 : 76) DELIMITED BY SIZE '-' DELIMITED BY SIZE INTO OP-TITLE END-STRING
              charArray = new ArrayList<char[]>();
                 charArray.add(substring(dclbooks.getBooksTitle().getBooksTitleText(),152,228));
                 charArray.add(CONSTANTS.LITERAL_MN_);
              joinCharArray = Field.mergeArrays(charArray.get(0),charArray.get(1));
              updated = updateString(repOpFields.getOpTitle() ,joinCharArray);
              repOpFields.setOpTitle(  (char[])updated.get("string"));
//  PERFORM 2100-WRITE-RECORD THRU 2100-EXIT
              writeRecord();/*2100-WRITE-RECORD*/
              if (this.isProgramEnded()) {
                  return ;
              }
//  MOVE BOOKS-TITLE-TEXT (229 : 27) TO OP-TITLE
              repOpFields.replace(dclbooks/*parent*/,6+229 - 1/*fromOffset - (opTitle) */,27/*fromLen*/,9/*toOffset - (booksTitleText) */,77/*toLen*/);
//  PERFORM 2100-WRITE-RECORD THRU 2100-EXIT
              writeRecord();/*2100-WRITE-RECORD*/
              if (this.isProgramEnded()) {
                  return ;
              }
          }
          else if  (	( booksTitleLen > 152 ) ) { 
//  STRING BOOKS-TITLE-TEXT (1 : 76) DELIMITED BY SIZE '-' DELIMITED BY SIZE INTO OP-TITLE END-STRING
              charArray = new ArrayList<char[]>();
                 charArray.add(substring(dclbooks.getBooksTitle().getBooksTitleText(),0,76));
                 charArray.add(CONSTANTS.LITERAL_MN_);
              joinCharArray = Field.mergeArrays(charArray.get(0),charArray.get(1));
              updated = updateString(repOpFields.getOpTitle() ,joinCharArray);
              repOpFields.setOpTitle(  (char[])updated.get("string"));
//  PERFORM 2100-WRITE-RECORD THRU 2100-EXIT
              writeRecord();/*2100-WRITE-RECORD*/
              if (this.isProgramEnded()) {
                  return ;
              }
//  STRING BOOKS-TITLE-TEXT (77 : 76) DELIMITED BY SIZE '-' DELIMITED BY SIZE INTO OP-TITLE END-STRING
              charArray = new ArrayList<char[]>();
                 charArray.add(substring(dclbooks.getBooksTitle().getBooksTitleText(),76,152));
                 charArray.add(CONSTANTS.LITERAL_MN_);
              joinCharArray = Field.mergeArrays(charArray.get(0),charArray.get(1));
              updated = updateString(repOpFields.getOpTitle() ,joinCharArray);
              repOpFields.setOpTitle(  (char[])updated.get("string"));
//  PERFORM 2100-WRITE-RECORD THRU 2100-EXIT
              writeRecord();/*2100-WRITE-RECORD*/
              if (this.isProgramEnded()) {
                  return ;
              }
//  MOVE BOOKS-TITLE-TEXT (153 : 77) TO OP-TITLE
              repOpFields.replace(dclbooks/*parent*/,6+153 - 1/*fromOffset - (opTitle) */,77/*fromLen*/,9/*toOffset - (booksTitleText) */,77/*toLen*/);
//  PERFORM 2100-WRITE-RECORD THRU 2100-EXIT
              writeRecord();/*2100-WRITE-RECORD*/
              if (this.isProgramEnded()) {
                  return ;
              }
          }
          else if  (	( booksTitleLen > 77 ) ) { 
//  STRING BOOKS-TITLE-TEXT (1 : 76) DELIMITED BY SIZE '-' DELIMITED BY SIZE INTO OP-TITLE END-STRING
              charArray = new ArrayList<char[]>();
                 charArray.add(substring(dclbooks.getBooksTitle().getBooksTitleText(),0,76));
                 charArray.add(CONSTANTS.LITERAL_MN_);
              joinCharArray = Field.mergeArrays(charArray.get(0),charArray.get(1));
              updated = updateString(repOpFields.getOpTitle() ,joinCharArray);
              repOpFields.setOpTitle(  (char[])updated.get("string"));
//  PERFORM 2100-WRITE-RECORD THRU 2100-EXIT
              writeRecord();/*2100-WRITE-RECORD*/
              if (this.isProgramEnded()) {
                  return ;
              }
//  MOVE BOOKS-TITLE-TEXT (77 : 77) TO OP-TITLE
              repOpFields.replace(dclbooks/*parent*/,6+77 - 1/*fromOffset - (opTitle) */,77/*fromLen*/,9/*toOffset - (booksTitleText) */,77/*toLen*/);
//  PERFORM 2100-WRITE-RECORD THRU 2100-EXIT
              writeRecord();/*2100-WRITE-RECORD*/
              if (this.isProgramEnded()) {
                  return ;
              }
          }
          else   { 
//  MOVE BOOKS-TITLE-TEXT (1 : 77) TO OP-TITLE
              repOpFields.replace(dclbooks/*parent*/,6/*fromOffset - (opTitle) */,77/*fromLen*/,9/*toOffset - (booksTitleText) */,77/*toLen*/);
//  PERFORM 2100-WRITE-RECORD THRU 2100-EXIT
              writeRecord();/*2100-WRITE-RECORD*/
              if (this.isProgramEnded()) {
                  return ;
              }
          }
  
//  MOVE SPACES TO BOOKS-TITLE-TEXT BOOKS-ISBN-TEXT
          booksTitle.setBooksTitleText(CONSTANTS.SPACE_255);
          booksIsbn.setBooksIsbnText(CONSTANTS.SPACE_13);
  
//  MOVE 0 TO BOOKS-TITLE-LEN BOOKS-ISBN-LEN
          booksTitle.setBooksTitleLen((short)0);
          booksIsbn.setBooksIsbnLen((short)0);
  
//  PERFORM 1200-FETCH-CURSOR THRU 1200-EXIT
          fetchCursor();/*1200-FETCH-CURSOR*/
          if (this.isProgramEnded()) {
              return ;
          }
          ;
      
      }
      /**
      * writeRecord 
      *   This method is derived from 
  *   COBOL Paragraph - 2100-WRITE-RECORD COBOL Cyclomatic complexity - 3
      * Input  :  

      * - writeRec                       COBOL Name: WS-WRITE-REC
      * - recCount                       COBOL Name: WS-REC-COUNT
      * - pageNo                         COBOL Name: WS-PAGE-NO
      * - repOpFields                    COBOL Name: REP-OP-FIELDS
      *
      * Output :  

      * - errLoc                         COBOL Name: ERR-LOC
      * - recCount                       COBOL Name: WS-REC-COUNT
      * - pageNo                         COBOL Name: WS-PAGE-NO
      * - recBuffer                      COBOL Name: WS-REC-BUFFER
      * - repOpFields                    COBOL Name: REP-OP-FIELDS
      * - repopStat                      COBOL Name: REPOP-STAT
      * - errMsg                         COBOL Name: ERR-MSG
      *
      * @throws CFException
      */
      private void writeRecord() throws Exception {
			// Declare local variables used in the method
			int recCount = 0;
			// End of variable declaration

      
// *-----------------------------------------------------------------
          // MOVE '2100-WRITE-RECORD' TO ERR-LOC
          work.setErrLoc(CONSTANTS.LITERAL_2100_MN2_WRITERECORD_B3_);
//  IF 88-DONT-WRITE-REC THEN
          if ( work.isDontWriteRec88()  ) { 
//cobolCode::GO TO 2100-EXIT
return ;
//cobolCodeEnds::GO TO 2100-EXIT
          }
          recCount = vars.getRecCount();
//  IF WS-REC-COUNT = 30
          if (	( recCount == 30 )) { 
              // MOVE 0 TO WS-REC-COUNT
              vars.setRecCount(0);
//  ADD 1 TO WS-PAGE-NO
              headerTime.setPageNo(headerTime.getPageNo()+1);
              // MOVE REP-OP-FIELDS TO WS-REC-BUFFER
              vars.setRecBuffer(repOpFields.toCharArray());
//  WRITE REP-OP-FIELDS FROM WS-PAGE-BREAK
              repOp.write(work.getPageBreak()); 
              repOpFields.setString(CONSTANTS.LOW_VALUE_215751987);
              work.setRepopStat(repOp.getStatus() );
//  WRITE REP-OP-FIELDS FROM WS-SPACE
              repOp.write(work.getSpace()); 
              repOpFields.setString(CONSTANTS.LOW_VALUE_215751987);
              work.setRepopStat(repOp.getStatus() );
//  PERFORM 1100-WRITE-HEADER THRU 1100-EXIT
              writeHeader();/*1100-WRITE-HEADER*/
              if (this.isProgramEnded()) {
                  return ;
              }
//  MOVE WS-REC-BUFFER TO REP-OP-FIELDS
              repOpFields.setString(vars.getRecBuffer());
          }
  
//  WRITE REP-OP-FIELDS
          repOp.write(repOpFields.toCharArray()); 
          repOpFields.setString(CONSTANTS.LOW_VALUE_215751987);
          work.setRepopStat(repOp.getStatus() );
          // MOVE 'ERROR WRITING REP-OP' TO ERR-MSG
          work.setErrMsg(CONSTANTS.LITERAL_ERROR_B12_WRITINGREP_MN_OP);
//  PERFORM 9998-FILE-ERR-CHK THRU 9998-EXIT
          fileErrChk();/*9998-FILE-ERR-CHK*/
          if (this.isProgramEnded()) {
              return ;
          }
//  ADD 1 TO WS-REC-COUNT
          vars.setRecCount(vars.getRecCount()+1);
//  MOVE SPACES TO REP-OP-FIELDS
          repOpFields.setString(CONSTANTS.SPACE_132);
      
      }
      /**
      * housekeeping 
      *   This method is derived from 
  *   COBOL Paragraph - 3000-HOUSEKEEPING COBOL Cyclomatic complexity - 1
      * Input  :  

      * - repOpFields                    COBOL Name: REP-OP-FIELDS
      *
      * Output :  

      * - errLoc                         COBOL Name: ERR-LOC
      * - repopStat                      COBOL Name: REPOP-STAT
      * - errMsg                         COBOL Name: ERR-MSG
      *
      * @throws CFException
      */
      private void housekeeping() throws Exception {
      
// *-----------------------------------------------------------------

// * Write footer record and close the report file

// *
          // MOVE '3000-HOUSEKEEPING' TO ERR-LOC
          work.setErrLoc(CONSTANTS.LITERAL_3000_MN_HOUSEKEEPING_B3_);
//  WRITE REP-OP-FIELDS FROM WS-FOOTER
          repOp.write(work.getFooter()); 
          repOpFields.setString(CONSTANTS.LOW_VALUE_215751987);
          work.setRepopStat(repOp.getStatus() );
//  CLOSE REP-OP
          repOp.close(); 
          work.setRepopStat(repOp.getStatus() );
          // MOVE 'ERROR CLOSING REP-OP' TO ERR-MSG
          work.setErrMsg(CONSTANTS.LITERAL_ERROR_B12_CLOSINGREP_MN_OP);
//  PERFORM 9998-FILE-ERR-CHK THRU 9998-EXIT
          fileErrChk();/*9998-FILE-ERR-CHK*/
          if (this.isProgramEnded()) {
              return ;
          }
          ;
      
      }
      /**
      * fileErrChk 
      *   This method is derived from 
  *   COBOL Paragraph - 9998-FILE-ERR-CHK COBOL Cyclomatic complexity - 4
      * Input  :  

      * - repopStat                      COBOL Name: REPOP-STAT
      * - errPgm                         COBOL Name: ERR-PGM
      * - errLoc                         COBOL Name: ERR-LOC
      * - errMsg                         COBOL Name: ERR-MSG
      *
      * Output : None 

      * @throws CFException
      */
      private void fileErrChk() throws Exception {
			// Declare local variables used in the method
			int repopStat = 0;
			// End of variable declaration

      
// *-----------------------------------------------------------------
          repopStat = work.getRepopStat();
//  EVALUATE TRUE
          if  (	( repopStat == 0 )) { 
              ;
          }
          else   { 
//  DISPLAY 'FILE ERROR'
              logger.info("FILE ERROR"); 
//  DISPLAY 'PROG: ' ERR-PGM
              logger.info("PROG: {}", new String(work.getErrPgm())); 
//  DISPLAY '  IN: ' ERR-LOC
              logger.info("  IN: {}", new String(work.getErrLoc())); 
//  DISPLAY ' MSG: ' ERR-MSG
              logger.info(" MSG: {}", new String(work.getErrMsg())); 
//  DISPLAY 'CODE: ' REPOP-STAT
              logger.info("CODE: {}", String.valueOf(work.getRepopStat())); 
//  STOP RUN
              throw Terminate.TERMINATE;
          }
  
      
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
      private void sqlErrChk() throws Exception {
			// Declare local variables used in the method
			int sqlcode = 0;
			// End of variable declaration

      
// *-----------------------------------------------------------------
          // MOVE SQLCODE TO ERR-CODE
          work.setErrCode(sqlca.getSqlcode());
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
//  DISPLAY '---SQL ERROR---'
              logger.info("---SQL ERROR---"); 
//  DISPLAY 'PROG: ' ERR-PGM
              logger.info("PROG: {}", new String(work.getErrPgm())); 
//  DISPLAY '  IN: ' ERR-LOC
              logger.info("  IN: {}", new String(work.getErrLoc())); 
//  DISPLAY ' MSG: ' ERR-MSG
              logger.info(" MSG: {}", new String(work.getErrMsg())); 
//  DISPLAY 'CODE: ' ERR-CODE
              logger.info("CODE: {}", String.valueOf(work.getErrCode())); 
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
          db2Base.reset("CFBOOKS" ,dbQualifier, true/*use Dynamic SQL*/);
          if(!isInitDone()) {
          	this.setRc(0);
          	setInitDone(true);
          }
        CFUtil.resetDecimalAsComma();
       }
  
  
  
  
  
  
  }
