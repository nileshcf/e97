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
  import org.springframework.web.bind.annotation.RequestParam;
  import org.springframework.beans.factory.annotation.Autowired;
  import org.springframework.beans.factory.annotation.Qualifier;
  import com.cloudframe.app.repository.Db2varclRepository;
  import com.cloudframe.app.db2varcl.dto.BreqPublishedDate;
  import com.cloudframe.app.db2varcl.dto.BreqTitleGrp;
  import com.cloudframe.app.exception.Terminate;
  import com.cloudframe.app.utility.CFUtil;
  import com.cloudframe.app.data.Field;
  import com.cloudframe.app.db2varcl.dto.*;
  import com.cloudframe.app.db2varcl.dto.Sqlca;
  import com.cloudframe.app.db2varcl.dto.BookReqArea;
  import com.cloudframe.app.db2varcl.dto.Nullvars;
  import com.cloudframe.app.db2varcl.dto.BookWorkArea;
  import com.cloudframe.app.db2varcl.dto.Work;
  import com.cloudframe.app.common.CONSTANTS;
  import com.cloudframe.app.common.SQLS;
  import org.springframework.beans.factory.annotation.Value;
  import com.cloudframe.app.dao.Db2Base;
  import java.sql.SQLException;
  
  @Component("db2varcl")
  
  public class Db2varcl extends CommonProcess {
  
  Logger logger = LoggerFactory.getLogger(Db2varcl.class);
  
  private Sqlca sqlca = new Sqlca() ;
  private BookReqArea bookReqArea = new BookReqArea() ;
  private Nullvars nullvars = new Nullvars() ;
  private BookWorkArea bookWorkArea = new BookWorkArea() ;
  private Work work = new Work() ;
  
  @Value("${DB2VARCL.dbQualifier:}")
  private String dbQualifier;
  
  
  @Autowired 
  @Qualifier("db2varclRepository")
  Db2varclRepository db2varclRepository;
  
  
  
  
  
  
      public int setParameter(String sqlca,String bookWorkArea,String bookReqArea) throws Exception {
      		if(sqlca != null)
      		    this.sqlca.setString(com.cloudframe.app.data.Field.getParm(sqlca),new String(CONSTANTS.EBCDIC_ENCODING));
      		if(bookWorkArea != null)
      		    this.bookWorkArea.setString(com.cloudframe.app.data.Field.getParm(bookWorkArea),new String(CONSTANTS.EBCDIC_ENCODING));
      		if(bookReqArea != null)
      		    this.bookReqArea.setString(com.cloudframe.app.data.Field.getParm(bookReqArea),new String(CONSTANTS.EBCDIC_ENCODING));
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
		handleDbAtEnd(db2Base); 
      

      }
      
       return getRc(); // Exit with return code
      // end of process method
      }
      /**
      * main 
      *   This method is derived from 
  *   COBOL Paragraph - 0000-MAIN COBOL Cyclomatic complexity - 3
      * Input  : None 

      * Output :  

      * - rateNull                       COBOL Name: WS-RATE-NULL
      *
      * @throws CFException
      */
      private void main() throws Exception {
			// Declare local variables used in the method
			BreqPublishedDate breqPublishedDate = bookReqArea.getBreqPublishedDate();
			BreqTitleGrp breqTitleGrp = bookReqArea.getBreqTitleGrp();
			// End of variable declaration

//  MOVE -1 TO WS-RATE-NULL
          nullvars.setRateNull((short)-1);
//  INSERT INTO BOOK ( BOOK_ID , ISBN , PUBLISHED_DATE , PUBLISHER_ID , RATING , TITLE , TOTAL_PAGES ) VALUES ( ? , ? , ? , ? , ? , ? , ? )
          db2varclRepository.insertBook(nullvars,sqlca,bookReqArea);
  
//  PERFORM 9999-SQL-ERR-CHK THRU 9999-EXIT
          sqlErrChk();/*9999-SQL-ERR-CHK*/
          if (this.isProgramEnded()) {
              return ;
          }
//  GOBACK
          setNotLogged(false); // no need to log, it is a normal termination
          this.setProgramEnded(true);
          return ;
      
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
      * - bookIoStatus                   COBOL Name: BOOK-IO-STATUS
      *
      * @throws CFException
      */
      private void sqlErrChk() throws Exception {
			// Declare local variables used in the method
			int sqlcode = 0;
			// End of variable declaration

      
// *-----------------------------------------------------------------
          // MOVE SQLCODE TO WS-SQLCODE
          //  FORMAT1016334848 = "----"
          work.setSqlcode_Ws(CFUtil.cobolNumberFormatter(CONSTANTS.FORMAT1016334848,String.valueOf(sqlca.getSqlcode()).toCharArray()));
          sqlcode = sqlca.getSqlcode();
//  EVALUATE TRUE
          if  (	( sqlcode == 0 )) { 
//  SET BOOK-IO-OK TO TRUE
              bookWorkArea.setBookIoOkTrue(); 
              
          }
          else if  (	( sqlcode == -803 )) { 
//  SET BOOK-IO-DUPLICATE TO TRUE
              bookWorkArea.setBookIoDuplicateTrue(); 
              
          }
          else   { 
//  DISPLAY '---SQL ERROR--- SQLCODE = ' WS-SQLCODE
              logger.info("---SQL ERROR--- SQLCODE = {}", new String(work.getSqlcode_Ws())); 
//  SET BOOK-IO-NOT-OK TO TRUE
              bookWorkArea.setBookIoNotOkTrue(); 
              
          }
  
      
      }
  
  
      /**
* This method pre-initializes variables consistent with
* what a mainframe program would have done at the start of a program
*/
      @Override
      public void initVars() throws CFException {
      setProgramEnded(false);
          db2Base.reset("DB2VARCL" ,dbQualifier, true/*use Dynamic SQL*/);
          if(!isInitDone()) {
          	this.setRc(0);
          	setInitDone(true);
          }
        CFUtil.resetDecimalAsComma();
       }
  
      public int call(Object[] params) throws Exception {
      
      int len = params.length;
         if (len > 0 && params[0] != null )
            sqlca.set((Field)params[0]);
         if (len > 1 && params[1] != null )
            bookWorkArea.set((Field)params[1]);
         if (len > 2 && params[2] != null )
            bookReqArea.set((Field)params[2]);
         // invoke the process and return rc
         return process();
         
      }
      
      public int call(Field... parameters) throws Exception {
         for (int index = 0; index < parameters.length;index++) {
             switch(index) {
              case 0:
                      if(parameters[index] != null ) {
              		if (parameters[index] instanceof Sqlca) {
                       	this.sqlca = ((Sqlca) parameters[index]);
                  	} else {
                       	this.sqlca.set(parameters[index]);
                  	}
                  }
                
                  break;
              case 1:
                      if(parameters[index] != null ) {
              		if (parameters[index] instanceof BookWorkArea) {
                       	this.bookWorkArea = ((BookWorkArea) parameters[index]);
                  	} else {
                       	this.bookWorkArea.set(parameters[index]);
                  	}
                  }
                
                  break;
              case 2:
                      if(parameters[index] != null ) {
              		if (parameters[index] instanceof BookReqArea) {
                       	this.bookReqArea = ((BookReqArea) parameters[index]);
                  	} else {
                       	this.bookReqArea.set(parameters[index]);
                  	}
                  }
                
                  break;
            }
         }
          return process();
      }
      
      
  
  
  
  
  
  }
