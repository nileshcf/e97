  package com.cloudframe.app.process.impl;
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
  
  import com.cloudframe.app.sf910020.Sf910020Ctx.*;
  import com.cloudframe.app.sf910020.Sf910020Ctx;
  import com.cloudframe.app.process.Sf910020;
  import com.cloudframe.app.process.BaseProcess;
  import org.springframework.web.bind.annotation.GetMapping;
  import org.slf4j.Logger;
  import org.slf4j.LoggerFactory;
  import com.cloudframe.app.exception.CFException;
  import org.springframework.stereotype.Component;
  import org.springframework.web.bind.annotation.RestController;
  import org.springframework.web.bind.annotation.RequestParam;
  import com.cloudframe.app.dto.GlobalExecutorCtx;
  import com.cloudframe.app.exception.Terminate;
  import com.cloudframe.app.dto.ProgramContext;
  import com.cloudframe.app.data.Field;
  import com.cloudframe.app.sf910020.dto.*;
  import com.cloudframe.app.sf910020.dto.Dfhcommarea;
  import com.cloudframe.app.sf910020.dto.ParsingPatternValuesGroup500;
  import com.cloudframe.app.sf910020.dto.IdxGroup800;
  import com.cloudframe.app.sf910020.dto.Work;
  import com.cloudframe.app.common.CONSTANTS;
  import com.cloudframe.app.utility.CFUtil;
  
  @Component("sf910020")
  
  public class Sf910020Impl extends CommonProcess implements Sf910020 {
  
  Logger logger = LoggerFactory.getLogger(Sf910020Impl.class);
  
  
  
  
  
  
  
  
  
  
      @Override
      public int setParameter(Sf910020Ctx programCtx, String dfhcommarea) throws Exception {
      		if(dfhcommarea != null)
      		    programCtx.getDfhcommarea().setString(com.cloudframe.app.data.Field.getParm(dfhcommarea),new String(CONSTANTS.EBCDIC_ENCODING));
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
      public int process(Sf910020Ctx programCtx) throws Exception {
       try {
       setCodePage("1047");
            // Reset program ended flag
           programCtx.setProgramEnded(false);
ProcessInCtx methodIn = programCtx.getProcessInCtx();
          ;
//  PERFORM 0000-MAINLINE
          mainline(programCtx);/*0000-MAINLINE*/
          if (programCtx.isProgramEnded()) {
              return programCtx.getRc();
          }
       } catch(Exception e) {
            handleErrorCode(e);
            throw e;
       }
      
       return programCtx.getRc(); // Exit with return code
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
      @Override
      public void mainline(Sf910020Ctx programCtx) throws Exception {
      
// ****************************************************************
// *    0 0 0 0 - M a i n l i n e .                               *
// ****************************************************************
//  PERFORM 1000-INITIALIZE-PROGRAM
          initializeProgram(programCtx);/*1000-INITIALIZE-PROGRAM*/
          if (programCtx.isProgramEnded()) {
              return ;
          }
//  PERFORM 2000-CONVERT-BITS-TO-BYTES
          convertBitsToBytes(programCtx.getConvertBitsToBytesInCtx());/*2000-CONVERT-BITS-TO-BYTES*/
          if (programCtx.isProgramEnded()) {
              return ;
          }
//  GOBACK
          setNotLogged(false); // no need to log, it is a normal termination
          programCtx.setProgramEnded(true);
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
      @Override
      public InitializeProgramOutCtx initializeProgram(Sf910020Ctx programCtx) throws Exception {
      
// ****************************************************************
// *    1 0 0 0 - I n i t i a l i z e - p r o g r a m .           *
// ****************************************************************
// *    1. initializes the varialbes in the program.              *
// ****************************************************************
InitializeProgramOutCtx methodOut = programCtx.getInitializeProgramOutCtx();
//  MOVE SPACES TO 800-IDX-X
          methodOut.setIdxX800(CONSTANTS.SPACE);
      
      return methodOut;
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
      @Override
      public ConvertBitsToBytesOutCtx convertBitsToBytes(ConvertBitsToBytesInCtx methodIn) throws Exception {
      
// ****************************************************************
// *    1. Convert the single byte passed to the program into 8   *
// *       bytes, representing each of the 8 bits in the passed   *
// *       byte.                                                  *
// ****************************************************************
Sf910020Ctx programCtx = methodIn.getSf910020Ctx();
ConvertBitsToBytesOutCtx methodOut = methodIn.getConvertBitsToBytesOutCtx();
//  MOVE 2000-BYTE-PASSED TO 800-IDX-X
          methodOut.setIdxX800(methodOut.getBytePassed2000());
//  SET 500-IDX TO 800-IDX
          methodOut.setIdx500(methodIn.getIdx800()); 
          
//  SET 500-IDX UP BY 300-BINARY-1
          methodOut.setIdx500(methodOut.getIdx500() + methodIn.getBinary1300()); 
          
//  MOVE 500-PARSING-PATTERN ( 500-IDX ) TO 800-BYTE-TABLE
          methodOut.setByteTable800(methodOut.getParsingPattern500(methodOut.getIdx500() - 1));
//  INSPECT 800-BYTE-TABLE REPLACING ALL 300-CHAR-X BY 300-CHAR-1
          methodOut.setByteTable800(  replaceAll(methodOut.getByteTable800(),methodIn.getCharX300(),methodIn.getChar1300())  );
//  INSPECT 800-BYTE-TABLE REPLACING ALL SPACES BY ZEROES
          methodOut.setByteTable800(  replaceAll(methodOut.getByteTable800(),CONSTANTS.SPACE,CONSTANTS.ZERO_STRING)  );
          // MOVE 800-BYTE-TABLE (1 : 1) TO 2000-BIT-VALUE-0
          methodOut.setBitValue02000(methodOut.getByteTable800()/* byteTable800 */,0,1,0/* bitValue02000 */,methodOut.getBitValue02000().length);
          // MOVE 800-BYTE-TABLE (2 : 1) TO 2000-BIT-VALUE-1
          methodOut.setBitValue12000(methodOut.getByteTable800()/* byteTable800 */,1,1,0/* bitValue12000 */,methodOut.getBitValue12000().length);
          // MOVE 800-BYTE-TABLE (3 : 1) TO 2000-BIT-VALUE-2
          methodOut.setBitValue22000(methodOut.getByteTable800()/* byteTable800 */,2,1,0/* bitValue22000 */,methodOut.getBitValue22000().length);
          // MOVE 800-BYTE-TABLE (4 : 1) TO 2000-BIT-VALUE-3
          methodOut.setBitValue32000(methodOut.getByteTable800()/* byteTable800 */,3,1,0/* bitValue32000 */,methodOut.getBitValue32000().length);
          // MOVE 800-BYTE-TABLE (5 : 1) TO 2000-BIT-VALUE-4
          methodOut.setBitValue42000(methodOut.getByteTable800()/* byteTable800 */,4,1,0/* bitValue42000 */,methodOut.getBitValue42000().length);
          // MOVE 800-BYTE-TABLE (6 : 1) TO 2000-BIT-VALUE-5
          methodOut.setBitValue52000(methodOut.getByteTable800()/* byteTable800 */,5,1,0/* bitValue52000 */,methodOut.getBitValue52000().length);
          // MOVE 800-BYTE-TABLE (7 : 1) TO 2000-BIT-VALUE-6
          methodOut.setBitValue62000(methodOut.getByteTable800()/* byteTable800 */,6,1,0/* bitValue62000 */,methodOut.getBitValue62000().length);
          // MOVE 800-BYTE-TABLE (8 : 1) TO 2000-BIT-VALUE-7
          methodOut.setBitValue72000(methodOut.getByteTable800()/* byteTable800 */,7,1,0/* bitValue72000 */,methodOut.getBitValue72000().length);
      
      return methodOut;
      }
      /**
      * returnToCallingPgm 
      *   This method is derived from 
  *   COBOL Paragraph - 9000-RETURN-TO-CALLING-PGM COBOL Cyclomatic complexity - 2
      * Input  : None 

      * Output : None 

      * @throws CFException
      */
      @Override
      public void returnToCallingPgm(Sf910020Ctx programCtx) throws Exception {
      
// ****************************************************************
// *    9 0 0 0 - R e t u r n - t o - c a l l i n g - p g m.      *
// ****************************************************************
// *    1. return the control of execution back to calling program*
// ****************************************************************
//  GOBACK
          setNotLogged(false); // no need to log, it is a normal termination
          programCtx.setProgramEnded(true);
          return ;
      
      }
  
  
  
      public int call(ProgramContext ctx, Object[] params) throws Exception {
      Sf910020Ctx programCtx = (Sf910020Ctx) ctx;
      
      int len = params.length;
         if (len > 0 && params[0] != null )
            programCtx.getDfhcommarea().set((Field)params[0]);
         // invoke the process and return rc
         return process(programCtx);
         
      }
      
      public int call(ProgramContext ctx, Field... parameters) throws Exception {
      Sf910020Ctx programCtx = (Sf910020Ctx) ctx;
         for (int index = 0; index < parameters.length;index++) {
             switch(index) {
              case 0:
                      if(parameters[index] != null ) {
              		if (parameters[index] instanceof Dfhcommarea) {
                       	programCtx.setDfhcommarea((Dfhcommarea) parameters[index]);
                  	} else {
                       	programCtx.getDfhcommarea().set(parameters[index]);
                  	}
                  }
                
                  break;
            }
         }
      	return process(programCtx);
      }
      
      
  
  
  
  
  
  }
