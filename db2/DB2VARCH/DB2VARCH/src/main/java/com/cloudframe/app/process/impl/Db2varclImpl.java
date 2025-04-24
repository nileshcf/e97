  package com.cloudframe.app.process.impl;
  /* 
*------------------------
*------------------------
*--------------
*/
  
  import com.cloudframe.app.db2varcl.Db2varclCtx.*;
  import com.cloudframe.app.db2varcl.Db2varclCtx;
  import com.cloudframe.app.process.Db2varcl;
  import com.cloudframe.app.process.BaseProcess;
  import org.springframework.web.bind.annotation.GetMapping;
  import org.slf4j.Logger;
  import org.slf4j.LoggerFactory;
  import com.cloudframe.app.exception.CFException;
  import org.springframework.stereotype.Component;
  import org.springframework.web.bind.annotation.RestController;
  import org.springframework.web.bind.annotation.RequestParam;
  import com.cloudframe.app.dto.GlobalExecutorCtx;
  import org.springframework.beans.factory.annotation.Autowired;
  import org.springframework.beans.factory.annotation.Qualifier;
  import com.cloudframe.app.repository.Db2varclRepository;
  import com.cloudframe.app.exception.Terminate;
  import com.cloudframe.app.utility.CFUtil;
  import com.cloudframe.app.dto.ProgramContext;
  import com.cloudframe.app.data.Field;
  import com.cloudframe.app.db2varcl.dto.*;
  import com.cloudframe.app.db2varcl.dto.Nullvars;
  import com.cloudframe.app.db2varcl.dto.BookWorkArea;
  import com.cloudframe.app.db2varcl.dto.BookReqArea;
  import com.cloudframe.app.db2varcl.dto.Sqlca;
  import com.cloudframe.app.db2varcl.dto.Work;
  import com.cloudframe.app.common.CONSTANTS;
  import com.cloudframe.app.common.SQLS;
  import org.springframework.beans.factory.annotation.Value;
  import com.cloudframe.app.dao.Db2Base;
  import java.sql.SQLException;
  
  @Component("db2varcl")
  
  public class Db2varclImpl extends CommonProcess implements Db2varcl {
  
  Logger logger = LoggerFactory.getLogger(Db2varclImpl.class);
  
  
  @Value("${DB2VARCL.dbQualifier:}")
  private String dbQualifier;
  
  
  @Autowired 
  @Qualifier("db2varclRepository")
  Db2varclRepository db2varclRepository;
  
  
  
  
  
  
      @Override
      public int setParameter(Db2varclCtx programCtx, String sqlca,String bookWorkArea,String bookReqArea) throws Exception {
      		if(sqlca != null)
      		    programCtx.getSqlca().setString(com.cloudframe.app.data.Field.getParm(sqlca),new String(CONSTANTS.EBCDIC_ENCODING));
      		if(bookWorkArea != null)
      		    programCtx.getBookWorkArea().setString(com.cloudframe.app.data.Field.getParm(bookWorkArea),new String(CONSTANTS.EBCDIC_ENCODING));
      		if(bookReqArea != null)
      		    programCtx.getBookReqArea().setString(com.cloudframe.app.data.Field.getParm(bookReqArea),new String(CONSTANTS.EBCDIC_ENCODING));
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
      public int process(Db2varclCtx programCtx) throws Exception {
       try {
       setCodePage("1047");
            // Reset program ended flag
           programCtx.setProgramEnded(false);
      	db2Base.reset("DB2VARCL" ,dbQualifier, true/*use Dynamic SQL*/);
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
		handleDbAtEnd(db2Base); 
      

      }
      
       return programCtx.getRc(); // Exit with return code
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
      @Override
      public MainOutCtx main(MainInCtx methodIn) throws Exception {
Db2varclCtx programCtx = methodIn.getDb2varclCtx();
MainOutCtx methodOut = methodIn.getMainOutCtx();
//  MOVE -1 TO WS-RATE-NULL
          methodOut.setRateNull((short)-1);
//  INSERT INTO BOOK ( BOOK_ID , ISBN , PUBLISHED_DATE , PUBLISHER_ID , RATING , TITLE , TOTAL_PAGES ) VALUES ( ? , ? , ? , ? , ? , ? , ? )
          db2varclRepository.insertBook(methodOut.getNullvars(),programCtx.getSqlca(),methodIn.getBookReqArea());
//  PERFORM 9999-SQL-ERR-CHK THRU 9999-EXIT
          sqlErrChk(programCtx.getSqlErrChkInCtx());/*9999-SQL-ERR-CHK*/
          if (programCtx.isProgramEnded()) {
              return methodOut;
          }
//  GOBACK
          setNotLogged(false); // no need to log, it is a normal termination
          programCtx.setProgramEnded(true);
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
      * - bookIoStatus                   COBOL Name: BOOK-IO-STATUS
      *
      * @throws CFException
      */
      @Override
      public SqlErrChkOutCtx sqlErrChk(SqlErrChkInCtx methodIn) throws Exception {
      
// *-----------------------------------------------------------------
Db2varclCtx programCtx = methodIn.getDb2varclCtx();
SqlErrChkOutCtx methodOut = methodIn.getSqlErrChkOutCtx();
          // MOVE SQLCODE TO WS-SQLCODE
          //  FORMAT1016334848 = "----"
          methodOut.setSqlcode_Ws(CFUtil.cobolNumberFormatter(CONSTANTS.FORMAT1016334848,String.valueOf(methodOut.getSqlcode()).toCharArray()));
//  EVALUATE TRUE
          if  (	( methodOut.getSqlcode() == 0 )) { 
//  SET BOOK-IO-OK TO TRUE
              methodOut.setBookIoOkTrue(); 
              
          }
          else if  (	( methodOut.getSqlcode() == -803 )) { 
//  SET BOOK-IO-DUPLICATE TO TRUE
              methodOut.setBookIoDuplicateTrue(); 
              
          }
          else   { 
//  DISPLAY '---SQL ERROR--- SQLCODE = ' WS-SQLCODE
              logger.info("---SQL ERROR--- SQLCODE = {}", new String(methodOut.getSqlcode_Ws())); 
//  SET BOOK-IO-NOT-OK TO TRUE
              methodOut.setBookIoNotOkTrue(); 
              
          }
      
      return methodOut;
      }
  
  
  
      public int call(ProgramContext ctx, Object[] params) throws Exception {
      Db2varclCtx programCtx = (Db2varclCtx) ctx;
      
      int len = params.length;
         if (len > 0 && params[0] != null )
            programCtx.getSqlca().set((Field)params[0]);
         if (len > 1 && params[1] != null )
            programCtx.getBookWorkArea().set((Field)params[1]);
         if (len > 2 && params[2] != null )
            programCtx.getBookReqArea().set((Field)params[2]);
         // invoke the process and return rc
         return process(programCtx);
         
      }
      
      public int call(ProgramContext ctx, Field... parameters) throws Exception {
      Db2varclCtx programCtx = (Db2varclCtx) ctx;
         for (int index = 0; index < parameters.length;index++) {
             switch(index) {
              case 0:
                      if(parameters[index] != null ) {
              		if (parameters[index] instanceof Sqlca) {
                       	programCtx.setSqlca((Sqlca) parameters[index]);
                  	} else {
                       	programCtx.getSqlca().set(parameters[index]);
                  	}
                  }
                
                  break;
              case 1:
                      if(parameters[index] != null ) {
              		if (parameters[index] instanceof BookWorkArea) {
                       	programCtx.setBookWorkArea((BookWorkArea) parameters[index]);
                  	} else {
                       	programCtx.getBookWorkArea().set(parameters[index]);
                  	}
                  }
                
                  break;
              case 2:
                      if(parameters[index] != null ) {
              		if (parameters[index] instanceof BookReqArea) {
                       	programCtx.setBookReqArea((BookReqArea) parameters[index]);
                  	} else {
                       	programCtx.getBookReqArea().set(parameters[index]);
                  	}
                  }
                
                  break;
            }
         }
      	return process(programCtx);
      }
      
      
  
  
  
  
  
  }
