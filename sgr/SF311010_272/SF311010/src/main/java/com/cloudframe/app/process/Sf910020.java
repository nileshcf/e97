  package com.cloudframe.app.process;
  /* 
****************************************************************
*author.                 fred schwamle                         *
*installation.           mastercard international, inc.        *
*date-written.           feb 12,2014.                          *
****************************************************************
****************************************************************
*          -- -- -- c o n f i d e n t i a l -- -- --           *
*                                                              *
*    this item contains information and procedures which are   *
*    proprietary to mastercard international, incorporated,    *
*    and which are confidential.  it is provided with the      *
*    express understanding that it is to be used only for the  *
*    benefit of interbank card association, and is not to be   *
*    used, copied, or disclosed for any other purpose.  any    *
*    authorized reproduction (in whole or in part) of this     *
*    material must be marked with this legend.                 *
****************************************************************
****************************************************************
*                                                              *
*   program name:      sf910020.                               *
*   function:          convert 1 byte of bits to 8 bytes       *
*   language:          cobol ii.                               *
*   system name:       stand-in.                               *
*   frequency:         on request.                             *
*   classification:    batch.                                  *
*                                                              *
****************************************************************
*    r e v i s i o n   h i s t o r y                           *
****************************************************************
*  ver |  date   |  rpi  |  pgmr    |       modifications      *
*------|---------|-------|----------|--------------------------*
*   01 | 09/19/12|rel    |f.schwamle|original version.         *
*      |         |14.q4  |          |standin mps rewrite       *
*      |         |c36895 |          |assembler modules.        *
*      |         |       |          |converted the assembler   *
*      |         |       |          |program into cobol.       *
*------|---------|-------|----------|--------------------------*
*   02 | 11/24/20|rel    |nagaveena |modified the processor    *
*      |         |21.q2  |    uppala|group from co3 to co6.    *
*      |         |pbi    |          |                          *
*      |         |  28592|          |                          *
*------|---------|-------|----------|--------------------------*
*   xx | mm/dd/yy|rel xxx|xxxxxxxx x| xxxxxxxxxxxxxxxxxxxxxxx  *
*------|---------|-------|----------|--------------------------*
****************************************************************
****************************************************************
*    e n v i r o n m e n t   d i v i s i o n .                 *
****************************************************************
*/
  
  import org.springframework.web.bind.annotation.GetMapping;
  import org.slf4j.Logger;
  import org.slf4j.LoggerFactory;
  import com.cloudframe.app.exception.CFException;
  import org.springframework.stereotype.Component;
  import org.springframework.web.bind.annotation.RestController;
  import org.springframework.web.bind.annotation.RequestParam;
  import com.cloudframe.app.exception.Terminate;
  import com.cloudframe.app.data.Field;
  import com.cloudframe.app.sf910020.dto.*;
  import com.cloudframe.app.sf910020.dto.Dfhcommarea;
  import com.cloudframe.app.sf910020.dto.ParsingPatternValuesGroup500;
  import com.cloudframe.app.sf910020.dto.IdxGroup800;
  import com.cloudframe.app.sf910020.dto.Work;
  import com.cloudframe.app.common.CONSTANTS;
  import com.cloudframe.app.utility.CFUtil;
  
  @Component("sf910020")
  
  public class Sf910020 extends CommonProcess {
  
  Logger logger = LoggerFactory.getLogger(Sf910020.class);
  
  private Dfhcommarea dfhcommarea = new Dfhcommarea() ;
  private ParsingPatternValuesGroup500 parsingPatternValuesGroup500 = new ParsingPatternValuesGroup500() ;
  private IdxGroup800 idxGroup800 = new IdxGroup800() ;
  private Work work = new Work() ;
  
  
  
  
  
  
  int idx500;
  
  
  
      public int setParameter(String dfhcommarea) throws Exception {
      		if(dfhcommarea != null)
      		    this.dfhcommarea.setString(com.cloudframe.app.data.Field.getParm(dfhcommarea),new String(CONSTANTS.EBCDIC_ENCODING));
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
//  PERFORM 0000-MAINLINE
          mainline();/*0000-MAINLINE*/
          if (this.isProgramEnded()) {
              return getRc();
          }
       } catch(Exception e) {
            handleErrorCode(e);
            throw e;
       }
      
       return getRc(); // Exit with return code
      // end of process method
      }
      /**
      * mainline 
      *   This method is derived from 
  *   COBOL Paragraph - 0000-MAINLINE COBOL Cyclomatic complexity - 1
      * Input  : None 

      * Output : None 

      * @throws CFException
      */
      private void mainline() throws Exception {
      
// ****************************************************************
// *    0 0 0 0 - M a i n l i n e .                               *
// ****************************************************************
//  PERFORM 1000-INITIALIZE-PROGRAM
          initializeProgram();/*1000-INITIALIZE-PROGRAM*/
          if (this.isProgramEnded()) {
              return ;
          }
//  PERFORM 2000-CONVERT-BITS-TO-BYTES
          convertBitsToBytes();/*2000-CONVERT-BITS-TO-BYTES*/
          if (this.isProgramEnded()) {
              return ;
          }
//  GOBACK
          setNotLogged(false); // no need to log, it is a normal termination
          this.setProgramEnded(true);
          return ;
      
      }
      /**
      * initializeProgram 
      *   This method is derived from 
  *   COBOL Paragraph - 1000-INITIALIZE-PROGRAM COBOL Cyclomatic complexity - 1
      * Input  : None 

      * Output :  

      * - idxX800                        COBOL Name: 800-IDX-X
      *
      * @throws CFException
      */
      private void initializeProgram() throws Exception {
      
// ****************************************************************
// *    1 0 0 0 - I n i t i a l i z e - p r o g r a m .           *
// ****************************************************************
// *    1. initializes the varialbes in the program.              *
// ****************************************************************
//  MOVE SPACES TO 800-IDX-X
          idxGroup800.getIdx800Redefined().setIdxX800(CONSTANTS.SPACE);
      
      }
      /**
      * convertBitsToBytes 
      *   This method is derived from 
  *   COBOL Paragraph - 2000-CONVERT-BITS-TO-BYTES COBOL Cyclomatic complexity - 1
      * Input  :  

      * - bytePassed2000                 COBOL Name: 2000-BYTE-PASSED
      * - idx800                         COBOL Name: 800-IDX
      * - parsingPattern500              COBOL Name: 500-PARSING-PATTERN
      *
      * Output :  

      * - idxX800                        COBOL Name: 800-IDX-X
      * - bytePassed2000                 COBOL Name: 2000-BYTE-PASSED
      * - idx500                         COBOL Name: 500-IDX
      * - byteTable800                   COBOL Name: 800-BYTE-TABLE
      * - parsingPattern500              COBOL Name: 500-PARSING-PATTERN
      * - bitValue02000                  COBOL Name: 2000-BIT-VALUE-0
      * - bitValue12000                  COBOL Name: 2000-BIT-VALUE-1
      * - bitValue22000                  COBOL Name: 2000-BIT-VALUE-2
      * - bitValue32000                  COBOL Name: 2000-BIT-VALUE-3
      * - bitValue42000                  COBOL Name: 2000-BIT-VALUE-4
      * - bitValue52000                  COBOL Name: 2000-BIT-VALUE-5
      * - bitValue62000                  COBOL Name: 2000-BIT-VALUE-6
      * - bitValue72000                  COBOL Name: 2000-BIT-VALUE-7
      *
      * @throws CFException
      */
      private void convertBitsToBytes() throws Exception {
      
// ****************************************************************
// *    1. Convert the single byte passed to the program into 8   *
// *       bytes, representing each of the 8 bits in the passed   *
// *       byte.                                                  *
// ****************************************************************
//  MOVE 2000-BYTE-PASSED TO 800-IDX-X
          idxGroup800.getIdx800Redefined().setIdxX800(dfhcommarea.getBytePassed2000());
//  SET 500-IDX TO 800-IDX
          idx500 = idxGroup800.getIdx800(); 
          
//  SET 500-IDX UP BY 300-BINARY-1
          idx500 = idx500 + work.getBinary1300(); 
          
//  MOVE 500-PARSING-PATTERN ( 500-IDX ) TO 800-BYTE-TABLE
          work.setByteTable800(parsingPatternValuesGroup500.getParsingPatternValues500Redefined().getParsingPattern500(idx500 - 1));
//  INSPECT 800-BYTE-TABLE REPLACING ALL 300-CHAR-X BY 300-CHAR-1
          work.setByteTable800(  replaceAll(work.getByteTable800(),work.getCharX300(),work.getChar1300())  );
//  INSPECT 800-BYTE-TABLE REPLACING ALL SPACES BY ZEROES
          work.setByteTable800(  replaceAll(work.getByteTable800(),CONSTANTS.SPACE,CONSTANTS.ZERO_STRING)  );
          // MOVE 800-BYTE-TABLE (1 : 1) TO 2000-BIT-VALUE-0
          dfhcommarea.setBitValue02000(work.getByteTable800()/* byteTable800 */,0,1,0/* bitValue02000 */,dfhcommarea.getBitValue02000().length);
          // MOVE 800-BYTE-TABLE (2 : 1) TO 2000-BIT-VALUE-1
          dfhcommarea.setBitValue12000(work.getByteTable800()/* byteTable800 */,1,1,0/* bitValue12000 */,dfhcommarea.getBitValue12000().length);
          // MOVE 800-BYTE-TABLE (3 : 1) TO 2000-BIT-VALUE-2
          dfhcommarea.setBitValue22000(work.getByteTable800()/* byteTable800 */,2,1,0/* bitValue22000 */,dfhcommarea.getBitValue22000().length);
          // MOVE 800-BYTE-TABLE (4 : 1) TO 2000-BIT-VALUE-3
          dfhcommarea.setBitValue32000(work.getByteTable800()/* byteTable800 */,3,1,0/* bitValue32000 */,dfhcommarea.getBitValue32000().length);
          // MOVE 800-BYTE-TABLE (5 : 1) TO 2000-BIT-VALUE-4
          dfhcommarea.setBitValue42000(work.getByteTable800()/* byteTable800 */,4,1,0/* bitValue42000 */,dfhcommarea.getBitValue42000().length);
          // MOVE 800-BYTE-TABLE (6 : 1) TO 2000-BIT-VALUE-5
          dfhcommarea.setBitValue52000(work.getByteTable800()/* byteTable800 */,5,1,0/* bitValue52000 */,dfhcommarea.getBitValue52000().length);
          // MOVE 800-BYTE-TABLE (7 : 1) TO 2000-BIT-VALUE-6
          dfhcommarea.setBitValue62000(work.getByteTable800()/* byteTable800 */,6,1,0/* bitValue62000 */,dfhcommarea.getBitValue62000().length);
          // MOVE 800-BYTE-TABLE (8 : 1) TO 2000-BIT-VALUE-7
          dfhcommarea.setBitValue72000(work.getByteTable800()/* byteTable800 */,7,1,0/* bitValue72000 */,dfhcommarea.getBitValue72000().length);
      
      }
      /**
      * returnToCallingPgm 
      *   This method is derived from 
  *   COBOL Paragraph - 9000-RETURN-TO-CALLING-PGM COBOL Cyclomatic complexity - 2
      * Input  : None 

      * Output : None 

      * @throws CFException
      */
      private void returnToCallingPgm() throws Exception {
      
// ****************************************************************
// *    9 0 0 0 - R e t u r n - t o - c a l l i n g - p g m.      *
// ****************************************************************
// *    1. return the control of execution back to calling program*
// ****************************************************************
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
          if(!isInitDone()) {
          	this.setRc(0);
          	setInitDone(true);
          }
        CFUtil.resetDecimalAsComma();
       }
  
      public int call(Object[] params) throws Exception {
      
      int len = params.length;
         if (len > 0 && params[0] != null )
            dfhcommarea.set((Field)params[0]);
         // invoke the process and return rc
         return process();
         
      }
      
      public int call(Field... parameters) throws Exception {
         for (int index = 0; index < parameters.length;index++) {
             switch(index) {
              case 0:
                      if(parameters[index] != null ) {
              		if (parameters[index] instanceof Dfhcommarea) {
                       	this.dfhcommarea = ((Dfhcommarea) parameters[index]);
                  	} else {
                       	this.dfhcommarea.set(parameters[index]);
                  	}
                  }
                
                  break;
            }
         }
          return process();
      }
      
      
  
  
  
  
  
  }
