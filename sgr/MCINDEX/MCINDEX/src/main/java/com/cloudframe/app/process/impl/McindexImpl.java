  package com.cloudframe.app.process.impl;
  /* 
*------------------------
*------------------------
*---------------------
*/
  
  import com.cloudframe.app.mcindex.McindexCtx.*;
  import com.cloudframe.app.mcindex.McindexCtx;
  import com.cloudframe.app.process.Mcindex;
  import com.cloudframe.app.process.BaseProcess;
  import org.springframework.web.bind.annotation.GetMapping;
  import org.slf4j.Logger;
  import org.slf4j.LoggerFactory;
  import com.cloudframe.app.exception.CFException;
  import org.springframework.stereotype.Component;
  import org.springframework.web.bind.annotation.RestController;
  import com.cloudframe.app.dto.GlobalExecutorCtx;
  import com.cloudframe.app.utility.CFUtil;
  import com.cloudframe.app.data.Field;
  import com.cloudframe.app.exception.Terminate;
  import com.cloudframe.app.mcindex.dto.*;
  import com.cloudframe.app.mcindex.dto.IndexVal800;
  import org.springframework.beans.factory.annotation.Autowired;
  import org.springframework.beans.factory.annotation.Qualifier;
  import com.cloudframe.app.global.sharedvar.Ip0006o4DeAttrTable;
  import com.cloudframe.app.mcindex.dto.ZeroValGroup800;
  import com.cloudframe.app.global.sharedvar.Ip0007o4DeSubAttrTable;
  import com.cloudframe.app.mcindex.dto.Index;
  import com.cloudframe.app.mcindex.dto.ErrorInfoTableDefault315;
  import com.cloudframe.app.mcindex.dto.Ip3oo8o1EditsPerfTbl;
  import com.cloudframe.app.mcindex.dto.Work;
  import com.cloudframe.app.common.CONSTANTS;
  
  @Component("mcindex")
  
  public class McindexImpl extends CommonProcess implements Mcindex {
  
  Logger logger = LoggerFactory.getLogger(McindexImpl.class);
  
  
  
  
  
  
  private static final int IP66601_USER_TAG_LENGTH = 13;
  private static final int IP0007O4_DE_SUB_ATTR_ROW_LENGTH = 70;
  
  
  
  
      /**
      * process 
      * Input  : None 

      * Output : None 

      * @throws CFException
      */
      public int process(McindexCtx programCtx) throws Exception {
       try {
       setCodePage("1047");
            // Reset program ended flag
           programCtx.setProgramEnded(false);
          ;
//  PERFORM 0000-MAIN
          main(programCtx);/*0000-MAIN*/
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
      * main 
      *   This method is derived from 
  *   COBOL Paragraph - 0000-MAIN COBOL Cyclomatic complexity - 7
      * Input  : None 

      * Output : None 

      * @throws CFException
      */
      @Override
      public void main(McindexCtx programCtx) throws Exception {
//  PERFORM 0000-MAIN-SPLIT0
          mainSplit0(programCtx.getMainSplit0InCtx());/*0000-MAIN-SPLIT0*/
//  PERFORM 0000-MAIN-SPLIT1
          mainSplit1(programCtx.getMainSplit1InCtx());/*0000-MAIN-SPLIT1*/
//  PERFORM 0000-MAIN-SPLIT2
          mainSplit2(programCtx.getMainSplit2InCtx());/*0000-MAIN-SPLIT2*/
//  PERFORM 0000-MAIN-SPLIT3
          mainSplit3(programCtx.getMainSplit3InCtx());/*0000-MAIN-SPLIT3*/
//  PERFORM 0000-MAIN-SPLIT4
          mainSplit4(programCtx.getMainSplit4InCtx());/*0000-MAIN-SPLIT4*/
//  PERFORM 0000-MAIN-SPLIT5
          mainSplit5(programCtx.getMainSplit5InCtx());/*0000-MAIN-SPLIT5*/
      
      }
      /**
      * mainSplit0 
      *   This method is derived from 
  *   COBOL Paragraph - 0000-MAIN-SPLIT0 COBOL Cyclomatic complexity - 1
      * Input  :  

      * - zero800                        COBOL Name: 800-ZERO
      * - zeroIdx2800                    COBOL Name: 800-ZERO-IDX2
      *
      * Output :  

      * - ip66601UserT                   COBOL Name: IP66601-USER-T
      * - val400                         COBOL Name: 400-VAL
      * - val1400                        COBOL Name: 400-VAL1
      * - val2400                        COBOL Name: 400-VAL2
      * - val3400                        COBOL Name: 400-VAL3
      *
      * @throws CFException
      */
      @Override
      public MainSplit0OutCtx mainSplit0(MainSplit0InCtx methodIn) throws Exception {
McindexCtx programCtx = methodIn.getMcindexCtx();
MainSplit0OutCtx methodOut = methodIn.getMainSplit0OutCtx();

// *
// * Setting zero to table index
// *
//  SET IP66601-USER-T TO 800-ZERO
          methodOut.setIp66601UserT((methodIn.getZero800()/IP66601_USER_TAG_LENGTH) + 1 ); 
          
//  IF IP66601-USER-T = 1 THEN
          if (	( methodOut.getIp66601UserT() == 1 )) { 
//  DISPLAY '*   1* IP66601-USER-T =  1 '
              logger.info("*   1* IP66601-USER-T =  1 "); 
          }
//  ELSE
          else { 
//  DISPLAY '*   2* IP66601-USER-T FLOORING NOT DONE'
              logger.info("*   2* IP66601-USER-T FLOORING NOT DONE"); 
          }
//  SET 400-VAL TO IP66601-USER-T
          methodOut.setVal400(methodOut.getIp66601UserT()); 
          
//  DISPLAY '*   3* 400-VAL  = ' 400-VAL
          logger.info("*   3* 400-VAL  = {}", String.valueOf(methodOut.getVal400())); 
//  SET 400-VAL1 TO IP66601-USER-T
          methodOut.setVal1400(methodOut.getIp66601UserT()); 
          
//  DISPLAY '*   4* 400-VAL1 = ' 400-VAL1
          logger.info("*   4* 400-VAL1 = {}", String.valueOf(methodOut.getVal1400())); 
//  SET 400-VAL2 TO IP66601-USER-T
          methodOut.setVal2400((short) (short) methodOut.getIp66601UserT()); 
          
//  DISPLAY '*   5* 400-VAL1 = ' 400-VAL2
          logger.info("*   5* 400-VAL1 = {}", String.valueOf(methodOut.getVal2400())); 
//  SET 400-VAL3 TO IP66601-USER-T
          methodOut.setVal3400(methodOut.getIp66601UserT()); 
          
//  DISPLAY '*   6* 400-VAL1 = ' 400-VAL3
          logger.info("*   6* 400-VAL1 = {}", String.valueOf(methodOut.getVal3400())); 

// *
// * Setting zero to table index
// *
//  SET IP66601-USER-T UP BY 1
          methodOut.setIp66601UserT(methodOut.getIp66601UserT() + 1); 
          
//  SET 400-VAL TO IP66601-USER-T
          methodOut.setVal400(methodOut.getIp66601UserT()); 
          
//  DISPLAY '*   7* 400-VAL  = ' 400-VAL
          logger.info("*   7* 400-VAL  = {}", String.valueOf(methodOut.getVal400())); 
//  SET 400-VAL1 TO IP66601-USER-T
          methodOut.setVal1400(methodOut.getIp66601UserT()); 
          
//  DISPLAY '*   8* 400-VAL1 = ' 400-VAL1
          logger.info("*   8* 400-VAL1 = {}", String.valueOf(methodOut.getVal1400())); 
//  SET 400-VAL2 TO IP66601-USER-T
          methodOut.setVal2400((short) (short) methodOut.getIp66601UserT()); 
          
//  DISPLAY '*   9* 400-VAL1 = ' 400-VAL2
          logger.info("*   9* 400-VAL1 = {}", String.valueOf(methodOut.getVal2400())); 
//  SET 400-VAL3 TO IP66601-USER-T
          methodOut.setVal3400(methodOut.getIp66601UserT()); 
          
//  DISPLAY '*  10* 400-VAL1 = ' 400-VAL3
          logger.info("*  10* 400-VAL1 = {}", String.valueOf(methodOut.getVal3400())); 

// *
//  SET IP66601-USER-T DOWN BY 1
          methodOut.setIp66601UserT(methodOut.getIp66601UserT() - 1); 
          
//  SET IP66601-USER-T DOWN BY 1
          methodOut.setIp66601UserT(methodOut.getIp66601UserT() - 1); 
          
//  SET 400-VAL TO IP66601-USER-T
          methodOut.setVal400(methodOut.getIp66601UserT()); 
          
//  DISPLAY '*  11* 400-VAL  = ' 400-VAL
          logger.info("*  11* 400-VAL  = {}", String.valueOf(methodOut.getVal400())); 
//  SET 400-VAL1 TO IP66601-USER-T
          methodOut.setVal1400(methodOut.getIp66601UserT()); 
          
//  DISPLAY '*  12* 400-VAL1 = ' 400-VAL1
          logger.info("*  12* 400-VAL1 = {}", String.valueOf(methodOut.getVal1400())); 
//  SET 400-VAL2 TO IP66601-USER-T
          methodOut.setVal2400((short) (short) methodOut.getIp66601UserT()); 
          
//  DISPLAY '*  13* 400-VAL1 = ' 400-VAL2
          logger.info("*  13* 400-VAL1 = {}", String.valueOf(methodOut.getVal2400())); 
//  SET 400-VAL3 TO IP66601-USER-T
          methodOut.setVal3400(methodOut.getIp66601UserT()); 
          
//  DISPLAY '*  14* 400-VAL1 = ' 400-VAL3
          logger.info("*  14* 400-VAL1 = {}", String.valueOf(methodOut.getVal3400())); 

// *-------------------------------------------
// *
// * Setting zero to table index
// *
//  SET IP66601-USER-T TO 800-ZERO-IDX2
          methodOut.setIp66601UserT((methodIn.getZeroIdx2800()/IP66601_USER_TAG_LENGTH) + 1 ); 
          
//  IF IP66601-USER-T = 1 THEN
          if (	( methodOut.getIp66601UserT() == 1 )) { 
//  DISPLAY '*  15* IP66601-USER-T =  1 '
              logger.info("*  15* IP66601-USER-T =  1 "); 
          }
//  ELSE
          else { 
//  DISPLAY '*  16* IP66601-USER-T FLOORING NOT DONE'
              logger.info("*  16* IP66601-USER-T FLOORING NOT DONE"); 
          }
//  SET 400-VAL TO IP66601-USER-T
          methodOut.setVal400(methodOut.getIp66601UserT()); 
          
//  DISPLAY '*  17* 400-VAL  = ' 400-VAL
          logger.info("*  17* 400-VAL  = {}", String.valueOf(methodOut.getVal400())); 
//  SET 400-VAL1 TO IP66601-USER-T
          methodOut.setVal1400(methodOut.getIp66601UserT()); 
          
//  DISPLAY '*  18* 400-VAL1 = ' 400-VAL1
          logger.info("*  18* 400-VAL1 = {}", String.valueOf(methodOut.getVal1400())); 
//  SET 400-VAL2 TO IP66601-USER-T
          methodOut.setVal2400((short) (short) methodOut.getIp66601UserT()); 
          
//  DISPLAY '*  19* 400-VAL1 = ' 400-VAL2
          logger.info("*  19* 400-VAL1 = {}", String.valueOf(methodOut.getVal2400())); 
//  SET 400-VAL3 TO IP66601-USER-T
          methodOut.setVal3400(methodOut.getIp66601UserT()); 
          
//  DISPLAY '*  20* 400-VAL1 = ' 400-VAL3
          logger.info("*  20* 400-VAL1 = {}", String.valueOf(methodOut.getVal3400())); 

// *
// * Setting zero to table index
// *
//  SET IP66601-USER-T UP BY 1
          methodOut.setIp66601UserT(methodOut.getIp66601UserT() + 1); 
          
//  SET 400-VAL TO IP66601-USER-T
          methodOut.setVal400(methodOut.getIp66601UserT()); 
          
//  DISPLAY '*  21* 400-VAL  = ' 400-VAL
          logger.info("*  21* 400-VAL  = {}", String.valueOf(methodOut.getVal400())); 
//  SET 400-VAL1 TO IP66601-USER-T
          methodOut.setVal1400(methodOut.getIp66601UserT()); 
          
//  DISPLAY '*  22* 400-VAL1 = ' 400-VAL1
          logger.info("*  22* 400-VAL1 = {}", String.valueOf(methodOut.getVal1400())); 
//  SET 400-VAL2 TO IP66601-USER-T
          methodOut.setVal2400((short) (short) methodOut.getIp66601UserT()); 
          
//  DISPLAY '*  23* 400-VAL1 = ' 400-VAL2
          logger.info("*  23* 400-VAL1 = {}", String.valueOf(methodOut.getVal2400())); 
//  SET 400-VAL3 TO IP66601-USER-T
          methodOut.setVal3400(methodOut.getIp66601UserT()); 
          
//  DISPLAY '*  24* 400-VAL1 = ' 400-VAL3
          logger.info("*  24* 400-VAL1 = {}", String.valueOf(methodOut.getVal3400())); 

// *
//  SET IP66601-USER-T DOWN BY 1
          methodOut.setIp66601UserT(methodOut.getIp66601UserT() - 1); 
          
//  SET IP66601-USER-T DOWN BY 1
          methodOut.setIp66601UserT(methodOut.getIp66601UserT() - 1); 
          
//  SET 400-VAL TO IP66601-USER-T
          methodOut.setVal400(methodOut.getIp66601UserT()); 
          
//  DISPLAY '*  25* 400-VAL  = ' 400-VAL
          logger.info("*  25* 400-VAL  = {}", String.valueOf(methodOut.getVal400())); 
//  SET 400-VAL1 TO IP66601-USER-T
          methodOut.setVal1400(methodOut.getIp66601UserT()); 
          
      
      return methodOut;
      }
      /**
      * mainSplit1 
      *   This method is derived from 
  *   COBOL Paragraph - 0000-MAIN-SPLIT1 COBOL Cyclomatic complexity - 1
      * Input  :  

      * - val1400                        COBOL Name: 400-VAL1
      * - ip66601UserT                   COBOL Name: IP66601-USER-T
      * - zeroIdx3800                    COBOL Name: 800-ZERO-IDX3
      * - zeroIdx4800                    COBOL Name: 800-ZERO-IDX4
      *
      * Output :  

      * - val2400                        COBOL Name: 400-VAL2
      * - val3400                        COBOL Name: 400-VAL3
      * - ip66601UserT                   COBOL Name: IP66601-USER-T
      * - val400                         COBOL Name: 400-VAL
      * - val1400                        COBOL Name: 400-VAL1
      *
      * @throws CFException
      */
      @Override
      public MainSplit1OutCtx mainSplit1(MainSplit1InCtx methodIn) throws Exception {
McindexCtx programCtx = methodIn.getMcindexCtx();
MainSplit1OutCtx methodOut = methodIn.getMainSplit1OutCtx();
//  DISPLAY '*  26* 400-VAL1 = ' 400-VAL1
          logger.info("*  26* 400-VAL1 = {}", String.valueOf(methodOut.getVal1400())); 
//  SET 400-VAL2 TO IP66601-USER-T
          methodOut.setVal2400((short) (short) methodOut.getIp66601UserT()); 
          
//  DISPLAY '*  27* 400-VAL1 = ' 400-VAL2
          logger.info("*  27* 400-VAL1 = {}", String.valueOf(methodOut.getVal2400())); 
//  SET 400-VAL3 TO IP66601-USER-T
          methodOut.setVal3400(methodOut.getIp66601UserT()); 
          
//  DISPLAY '*  28* 400-VAL1 = ' 400-VAL3
          logger.info("*  28* 400-VAL1 = {}", String.valueOf(methodOut.getVal3400())); 

// *-------------------------------------------
// *
// * Setting zero to table index
// *
//  SET IP66601-USER-T TO 800-ZERO-IDX3
          methodOut.setIp66601UserT((methodIn.getZeroIdx3800()/IP66601_USER_TAG_LENGTH) + 1 ); 
          
//  IF IP66601-USER-T = 1 THEN
          if (	( methodOut.getIp66601UserT() == 1 )) { 
//  DISPLAY '*  29* IP66601-USER-T =  1 '
              logger.info("*  29* IP66601-USER-T =  1 "); 
          }
//  ELSE
          else { 
//  DISPLAY '*  30* IP66601-USER-T FLOORING NOT DONE'
              logger.info("*  30* IP66601-USER-T FLOORING NOT DONE"); 
          }
//  SET 400-VAL TO IP66601-USER-T
          methodOut.setVal400(methodOut.getIp66601UserT()); 
          
//  DISPLAY '*  31* 400-VAL  = ' 400-VAL
          logger.info("*  31* 400-VAL  = {}", String.valueOf(methodOut.getVal400())); 
//  SET 400-VAL1 TO IP66601-USER-T
          methodOut.setVal1400(methodOut.getIp66601UserT()); 
          
//  DISPLAY '*  32* 400-VAL1 = ' 400-VAL1
          logger.info("*  32* 400-VAL1 = {}", String.valueOf(methodOut.getVal1400())); 
//  SET 400-VAL2 TO IP66601-USER-T
          methodOut.setVal2400((short) (short) methodOut.getIp66601UserT()); 
          
//  DISPLAY '*  33* 400-VAL1 = ' 400-VAL2
          logger.info("*  33* 400-VAL1 = {}", String.valueOf(methodOut.getVal2400())); 
//  SET 400-VAL3 TO IP66601-USER-T
          methodOut.setVal3400(methodOut.getIp66601UserT()); 
          
//  DISPLAY '*  34* 400-VAL1 = ' 400-VAL3
          logger.info("*  34* 400-VAL1 = {}", String.valueOf(methodOut.getVal3400())); 

// *
// * Setting zero to table index
// *
//  SET IP66601-USER-T UP BY 1
          methodOut.setIp66601UserT(methodOut.getIp66601UserT() + 1); 
          
//  SET 400-VAL TO IP66601-USER-T
          methodOut.setVal400(methodOut.getIp66601UserT()); 
          
//  DISPLAY '*  35* 400-VAL  = ' 400-VAL
          logger.info("*  35* 400-VAL  = {}", String.valueOf(methodOut.getVal400())); 
//  SET 400-VAL1 TO IP66601-USER-T
          methodOut.setVal1400(methodOut.getIp66601UserT()); 
          
//  DISPLAY '*  36* 400-VAL1 = ' 400-VAL1
          logger.info("*  36* 400-VAL1 = {}", String.valueOf(methodOut.getVal1400())); 
//  SET 400-VAL2 TO IP66601-USER-T
          methodOut.setVal2400((short) (short) methodOut.getIp66601UserT()); 
          
//  DISPLAY '*  37* 400-VAL1 = ' 400-VAL2
          logger.info("*  37* 400-VAL1 = {}", String.valueOf(methodOut.getVal2400())); 
//  SET 400-VAL3 TO IP66601-USER-T
          methodOut.setVal3400(methodOut.getIp66601UserT()); 
          
//  DISPLAY '*  38* 400-VAL1 = ' 400-VAL3
          logger.info("*  38* 400-VAL1 = {}", String.valueOf(methodOut.getVal3400())); 

// *
//  SET IP66601-USER-T DOWN BY 1
          methodOut.setIp66601UserT(methodOut.getIp66601UserT() - 1); 
          
//  SET IP66601-USER-T DOWN BY 1
          methodOut.setIp66601UserT(methodOut.getIp66601UserT() - 1); 
          
//  SET 400-VAL TO IP66601-USER-T
          methodOut.setVal400(methodOut.getIp66601UserT()); 
          
//  DISPLAY '*  39* 400-VAL  = ' 400-VAL
          logger.info("*  39* 400-VAL  = {}", String.valueOf(methodOut.getVal400())); 
//  SET 400-VAL1 TO IP66601-USER-T
          methodOut.setVal1400(methodOut.getIp66601UserT()); 
          
//  DISPLAY '*  40* 400-VAL1 = ' 400-VAL1
          logger.info("*  40* 400-VAL1 = {}", String.valueOf(methodOut.getVal1400())); 
//  SET 400-VAL2 TO IP66601-USER-T
          methodOut.setVal2400((short) (short) methodOut.getIp66601UserT()); 
          
//  DISPLAY '*  41* 400-VAL1 = ' 400-VAL2
          logger.info("*  41* 400-VAL1 = {}", String.valueOf(methodOut.getVal2400())); 
//  SET 400-VAL3 TO IP66601-USER-T
          methodOut.setVal3400(methodOut.getIp66601UserT()); 
          
//  DISPLAY '*  42* 400-VAL1 = ' 400-VAL3
          logger.info("*  42* 400-VAL1 = {}", String.valueOf(methodOut.getVal3400())); 

// *-------------------------------------------
// *
// * Setting zero to table index
// *
//  SET IP66601-USER-T TO 800-ZERO-IDX4 (1)
          methodOut.setIp66601UserT((methodIn.getZeroIdx4800(0)/IP66601_USER_TAG_LENGTH) + 1 ); 
          
//  IF IP66601-USER-T = 1 THEN
          if (	( methodOut.getIp66601UserT() == 1 )) { 
//  DISPLAY '*  43* IP66601-USER-T =  1 '
              logger.info("*  43* IP66601-USER-T =  1 "); 
          }
//  ELSE
          else { 
//  DISPLAY '*  44* IP66601-USER-T FLOORING NOT DONE'
              logger.info("*  44* IP66601-USER-T FLOORING NOT DONE"); 
          }
//  SET 400-VAL TO IP66601-USER-T
          methodOut.setVal400(methodOut.getIp66601UserT()); 
          
//  DISPLAY '*  45* 400-VAL  = ' 400-VAL
          logger.info("*  45* 400-VAL  = {}", String.valueOf(methodOut.getVal400())); 
//  SET 400-VAL1 TO IP66601-USER-T
          methodOut.setVal1400(methodOut.getIp66601UserT()); 
          
//  DISPLAY '*  46* 400-VAL1 = ' 400-VAL1
          logger.info("*  46* 400-VAL1 = {}", String.valueOf(methodOut.getVal1400())); 
//  SET 400-VAL2 TO IP66601-USER-T
          methodOut.setVal2400((short) (short) methodOut.getIp66601UserT()); 
          
//  DISPLAY '*  47* 400-VAL1 = ' 400-VAL2
          logger.info("*  47* 400-VAL1 = {}", String.valueOf(methodOut.getVal2400())); 
//  SET 400-VAL3 TO IP66601-USER-T
          methodOut.setVal3400(methodOut.getIp66601UserT()); 
          
//  DISPLAY '*  48* 400-VAL1 = ' 400-VAL3
          logger.info("*  48* 400-VAL1 = {}", String.valueOf(methodOut.getVal3400())); 

// *
// * Setting zero to table index
// *
//  SET IP66601-USER-T UP BY 1
          methodOut.setIp66601UserT(methodOut.getIp66601UserT() + 1); 
          
//  SET 400-VAL TO IP66601-USER-T
          methodOut.setVal400(methodOut.getIp66601UserT()); 
          
//  DISPLAY '*  49* 400-VAL  = ' 400-VAL
          logger.info("*  49* 400-VAL  = {}", String.valueOf(methodOut.getVal400())); 
//  SET 400-VAL1 TO IP66601-USER-T
          methodOut.setVal1400(methodOut.getIp66601UserT()); 
          
//  DISPLAY '*  50* 400-VAL1 = ' 400-VAL1
          logger.info("*  50* 400-VAL1 = {}", String.valueOf(methodOut.getVal1400())); 
//  SET 400-VAL2 TO IP66601-USER-T
          methodOut.setVal2400((short) (short) methodOut.getIp66601UserT()); 
          
//  DISPLAY '*  51* 400-VAL1 = ' 400-VAL2
          logger.info("*  51* 400-VAL1 = {}", String.valueOf(methodOut.getVal2400())); 
//  SET 400-VAL3 TO IP66601-USER-T
          methodOut.setVal3400(methodOut.getIp66601UserT()); 
          
//  DISPLAY '*  52* 400-VAL1 = ' 400-VAL3
          logger.info("*  52* 400-VAL1 = {}", String.valueOf(methodOut.getVal3400())); 
      
      return methodOut;
      }
      /**
      * mainSplit2 
      *   This method is derived from 
  *   COBOL Paragraph - 0000-MAIN-SPLIT2 COBOL Cyclomatic complexity - 1
      * Input  :  

      * - zeroIdx5800                    COBOL Name: 800-ZERO-IDX5
      * - zeroVal300                     COBOL Name: 300-ZERO-VAL
      *
      * Output :  

      * - ip66601UserT                   COBOL Name: IP66601-USER-T
      * - val400                         COBOL Name: 400-VAL
      * - val1400                        COBOL Name: 400-VAL1
      * - val2400                        COBOL Name: 400-VAL2
      * - val3400                        COBOL Name: 400-VAL3
      * - valEdit400                     COBOL Name: 400-VAL-EDIT
      *
      * @throws CFException
      */
      @Override
      public MainSplit2OutCtx mainSplit2(MainSplit2InCtx methodIn) throws Exception {
McindexCtx programCtx = methodIn.getMcindexCtx();
MainSplit2OutCtx methodOut = methodIn.getMainSplit2OutCtx();

// *
//  SET IP66601-USER-T DOWN BY 1
          methodOut.setIp66601UserT(methodOut.getIp66601UserT() - 1); 
          
//  SET IP66601-USER-T DOWN BY 1
          methodOut.setIp66601UserT(methodOut.getIp66601UserT() - 1); 
          
//  SET 400-VAL TO IP66601-USER-T
          methodOut.setVal400(methodOut.getIp66601UserT()); 
          
//  DISPLAY '*  53* 400-VAL  = ' 400-VAL
          logger.info("*  53* 400-VAL  = {}", String.valueOf(methodOut.getVal400())); 
//  SET 400-VAL1 TO IP66601-USER-T
          methodOut.setVal1400(methodOut.getIp66601UserT()); 
          
//  DISPLAY '*  54* 400-VAL1 = ' 400-VAL1
          logger.info("*  54* 400-VAL1 = {}", String.valueOf(methodOut.getVal1400())); 
//  SET 400-VAL2 TO IP66601-USER-T
          methodOut.setVal2400((short) (short) methodOut.getIp66601UserT()); 
          
//  DISPLAY '*  55* 400-VAL1 = ' 400-VAL2
          logger.info("*  55* 400-VAL1 = {}", String.valueOf(methodOut.getVal2400())); 
//  SET 400-VAL3 TO IP66601-USER-T
          methodOut.setVal3400(methodOut.getIp66601UserT()); 
          
//  DISPLAY '*  56* 400-VAL1 = ' 400-VAL3
          logger.info("*  56* 400-VAL1 = {}", String.valueOf(methodOut.getVal3400())); 

// *-------------------------------------------
// *
// * Setting zero to table index
// *
//  SET IP66601-USER-T TO 800-ZERO-IDX5 (1)
          methodOut.setIp66601UserT((methodIn.getZeroIdx5800(0)/IP66601_USER_TAG_LENGTH) + 1 ); 
          
//  IF IP66601-USER-T = 1 THEN
          if (	( methodOut.getIp66601UserT() == 1 )) { 
//  DISPLAY '*  57* IP66601-USER-T =  1 '
              logger.info("*  57* IP66601-USER-T =  1 "); 
          }
//  ELSE
          else { 
//  DISPLAY '*  58* IP66601-USER-T FLOORING NOT DONE'
              logger.info("*  58* IP66601-USER-T FLOORING NOT DONE"); 
          }
//  SET 400-VAL TO IP66601-USER-T
          methodOut.setVal400(methodOut.getIp66601UserT()); 
          
//  DISPLAY '*  59* 400-VAL  = ' 400-VAL
          logger.info("*  59* 400-VAL  = {}", String.valueOf(methodOut.getVal400())); 
//  SET 400-VAL1 TO IP66601-USER-T
          methodOut.setVal1400(methodOut.getIp66601UserT()); 
          
//  DISPLAY '*  60* 400-VAL1 = ' 400-VAL1
          logger.info("*  60* 400-VAL1 = {}", String.valueOf(methodOut.getVal1400())); 
//  SET 400-VAL2 TO IP66601-USER-T
          methodOut.setVal2400((short) (short) methodOut.getIp66601UserT()); 
          
//  DISPLAY '*  61* 400-VAL1 = ' 400-VAL2
          logger.info("*  61* 400-VAL1 = {}", String.valueOf(methodOut.getVal2400())); 
//  SET 400-VAL3 TO IP66601-USER-T
          methodOut.setVal3400(methodOut.getIp66601UserT()); 
          
//  DISPLAY '*  62* 400-VAL1 = ' 400-VAL3
          logger.info("*  62* 400-VAL1 = {}", String.valueOf(methodOut.getVal3400())); 

// *
// * Setting zero to table index
// *
//  SET IP66601-USER-T UP BY 1
          methodOut.setIp66601UserT(methodOut.getIp66601UserT() + 1); 
          
//  SET 400-VAL TO IP66601-USER-T
          methodOut.setVal400(methodOut.getIp66601UserT()); 
          
//  DISPLAY '*  63* 400-VAL  = ' 400-VAL
          logger.info("*  63* 400-VAL  = {}", String.valueOf(methodOut.getVal400())); 
//  SET 400-VAL1 TO IP66601-USER-T
          methodOut.setVal1400(methodOut.getIp66601UserT()); 
          
//  DISPLAY '*  64* 400-VAL1 = ' 400-VAL1
          logger.info("*  64* 400-VAL1 = {}", String.valueOf(methodOut.getVal1400())); 
//  SET 400-VAL2 TO IP66601-USER-T
          methodOut.setVal2400((short) (short) methodOut.getIp66601UserT()); 
          
//  DISPLAY '*  65* 400-VAL1 = ' 400-VAL2
          logger.info("*  65* 400-VAL1 = {}", String.valueOf(methodOut.getVal2400())); 
//  SET 400-VAL3 TO IP66601-USER-T
          methodOut.setVal3400(methodOut.getIp66601UserT()); 
          
//  DISPLAY '*  66* 400-VAL1 = ' 400-VAL3
          logger.info("*  66* 400-VAL1 = {}", String.valueOf(methodOut.getVal3400())); 

// *
//  SET IP66601-USER-T DOWN BY 1
          methodOut.setIp66601UserT(methodOut.getIp66601UserT() - 1); 
          
//  SET IP66601-USER-T DOWN BY 1
          methodOut.setIp66601UserT(methodOut.getIp66601UserT() - 1); 
          
//  SET 400-VAL TO IP66601-USER-T
          methodOut.setVal400(methodOut.getIp66601UserT()); 
          
//  DISPLAY '*  67* 400-VAL  = ' 400-VAL
          logger.info("*  67* 400-VAL  = {}", String.valueOf(methodOut.getVal400())); 
//  SET 400-VAL1 TO IP66601-USER-T
          methodOut.setVal1400(methodOut.getIp66601UserT()); 
          
//  DISPLAY '*  68* 400-VAL1 = ' 400-VAL1
          logger.info("*  68* 400-VAL1 = {}", String.valueOf(methodOut.getVal1400())); 
//  SET 400-VAL2 TO IP66601-USER-T
          methodOut.setVal2400((short) (short) methodOut.getIp66601UserT()); 
          
//  DISPLAY '*  69* 400-VAL1 = ' 400-VAL2
          logger.info("*  69* 400-VAL1 = {}", String.valueOf(methodOut.getVal2400())); 
//  SET 400-VAL3 TO IP66601-USER-T
          methodOut.setVal3400(methodOut.getIp66601UserT()); 
          
//  DISPLAY '*  70* 400-VAL1 = ' 400-VAL3
          logger.info("*  70* 400-VAL1 = {}", String.valueOf(methodOut.getVal3400())); 

// *-------------------------------------------
// *-------------------------------------------
//  SET IP66601-USER-T TO 300-ZERO-VAL
          methodOut.setIp66601UserT((int) (int) methodIn.getZeroVal300()); 
          
//  SET 400-VAL TO IP66601-USER-T
          methodOut.setVal400(methodOut.getIp66601UserT()); 
          
//  DISPLAY '*  71* 400-VAL  = ' 400-VAL
          logger.info("*  71* 400-VAL  = {}", String.valueOf(methodOut.getVal400())); 
//  SET 400-VAL1 TO IP66601-USER-T
          methodOut.setVal1400(methodOut.getIp66601UserT()); 
          
//  DISPLAY '*  72* 400-VAL1 = ' 400-VAL1
          logger.info("*  72* 400-VAL1 = {}", String.valueOf(methodOut.getVal1400())); 
//  SET 400-VAL2 TO IP66601-USER-T
          methodOut.setVal2400((short) (short) methodOut.getIp66601UserT()); 
          
//  DISPLAY '*  73* 400-VAL1 = ' 400-VAL2
          logger.info("*  73* 400-VAL1 = {}", String.valueOf(methodOut.getVal2400())); 
//  SET 400-VAL3 TO IP66601-USER-T
          methodOut.setVal3400(methodOut.getIp66601UserT()); 
          
//  DISPLAY '*  74* 400-VAL1 = ' 400-VAL3
          logger.info("*  74* 400-VAL1 = {}", String.valueOf(methodOut.getVal3400())); 

// *
//  SET IP66601-USER-T DOWN BY 1
          methodOut.setIp66601UserT(methodOut.getIp66601UserT() - 1); 
          
//  SET 400-VAL TO IP66601-USER-T
          methodOut.setVal400(methodOut.getIp66601UserT()); 
          
//  MOVE 400-VAL TO 400-VAL-EDIT
//  FORMAT_515235511 = "-ZZZZZZZZZZ"
          methodOut.setValEdit400(CFUtil.cobolNumberFormatter(CONSTANTS.FORMAT_515235511,String.valueOf(methodOut.getVal400()).toCharArray()));
//  DISPLAY '*  75* 400-VAL  = ' 400-VAL-EDIT
          logger.info("*  75* 400-VAL  = {}", new String(methodOut.getValEdit400())); 
      
      return methodOut;
      }
      /**
      * mainSplit3 
      *   This method is derived from 
  *   COBOL Paragraph - 0000-MAIN-SPLIT3 COBOL Cyclomatic complexity - 1
      * Input  :  

      * - ip66601UserT                   COBOL Name: IP66601-USER-T
      * - minusoneVal300                 COBOL Name: 300-MINUSONE-VAL
      * - zeroVal300                     COBOL Name: 300-ZERO-VAL
      *
      * Output :  

      * - val1400                        COBOL Name: 400-VAL1
      * - valEdit400                     COBOL Name: 400-VAL-EDIT
      * - val2400                        COBOL Name: 400-VAL2
      * - val3400                        COBOL Name: 400-VAL3
      * - ip66601UserT                   COBOL Name: IP66601-USER-T
      * - val400                         COBOL Name: 400-VAL
      * - ip66601UserLeft                COBOL Name: IP66601-USER-LEFT
      *
      * @throws CFException
      */
      @Override
      public MainSplit3OutCtx mainSplit3(MainSplit3InCtx methodIn) throws Exception {
McindexCtx programCtx = methodIn.getMcindexCtx();
MainSplit3OutCtx methodOut = methodIn.getMainSplit3OutCtx();
//  SET 400-VAL1 TO IP66601-USER-T
          methodOut.setVal1400(methodOut.getIp66601UserT()); 
          
//  MOVE 400-VAL1 TO 400-VAL-EDIT
//  FORMAT_515235511 = "-ZZZZZZZZZZ"
          methodOut.setValEdit400(CFUtil.cobolNumberFormatter(CONSTANTS.FORMAT_515235511,String.valueOf(methodOut.getVal1400()).toCharArray()));
//  DISPLAY '*  76* 400-VAL1 = ' 400-VAL-EDIT
          logger.info("*  76* 400-VAL1 = {}", new String(methodOut.getValEdit400())); 
//  SET 400-VAL2 TO IP66601-USER-T
          methodOut.setVal2400((short) (short) methodOut.getIp66601UserT()); 
          
//  MOVE 400-VAL2 TO 400-VAL-EDIT
//  FORMAT_515235511 = "-ZZZZZZZZZZ"
          methodOut.setValEdit400(CFUtil.cobolNumberFormatter(CONSTANTS.FORMAT_515235511,String.valueOf(methodOut.getVal2400()).toCharArray()));
//  DISPLAY '*  77* 400-VAL1 = ' 400-VAL-EDIT
          logger.info("*  77* 400-VAL1 = {}", new String(methodOut.getValEdit400())); 
//  SET 400-VAL3 TO IP66601-USER-T
          methodOut.setVal3400(methodOut.getIp66601UserT()); 
          
//  MOVE 400-VAL3 TO 400-VAL-EDIT
//  FORMAT_515235511 = "-ZZZZZZZZZZ"
          methodOut.setValEdit400(CFUtil.cobolNumberFormatter(CONSTANTS.FORMAT_515235511,String.valueOf(methodOut.getVal3400()).toCharArray()));
//  DISPLAY '*  78* 400-VAL1 = ' 400-VAL-EDIT
          logger.info("*  78* 400-VAL1 = {}", new String(methodOut.getValEdit400())); 

// *
//  SET IP66601-USER-T TO 300-MINUSONE-VAL
          methodOut.setIp66601UserT(methodIn.getMinusoneVal300()); 
          
//  SET 400-VAL TO IP66601-USER-T
          methodOut.setVal400(methodOut.getIp66601UserT()); 
          
//  MOVE 400-VAL TO 400-VAL-EDIT
//  FORMAT_515235511 = "-ZZZZZZZZZZ"
          methodOut.setValEdit400(CFUtil.cobolNumberFormatter(CONSTANTS.FORMAT_515235511,String.valueOf(methodOut.getVal400()).toCharArray()));
//  DISPLAY '*  79* 400-VAL  = ' 400-VAL-EDIT
          logger.info("*  79* 400-VAL  = {}", new String(methodOut.getValEdit400())); 
//  SET 400-VAL1 TO IP66601-USER-T
          methodOut.setVal1400(methodOut.getIp66601UserT()); 
          
//  MOVE 400-VAL1 TO 400-VAL-EDIT
//  FORMAT_515235511 = "-ZZZZZZZZZZ"
          methodOut.setValEdit400(CFUtil.cobolNumberFormatter(CONSTANTS.FORMAT_515235511,String.valueOf(methodOut.getVal1400()).toCharArray()));
//  DISPLAY '*  80* 400-VAL1 = ' 400-VAL-EDIT
          logger.info("*  80* 400-VAL1 = {}", new String(methodOut.getValEdit400())); 
//  SET 400-VAL2 TO IP66601-USER-T
          methodOut.setVal2400((short) (short) methodOut.getIp66601UserT()); 
          
//  MOVE 400-VAL2 TO 400-VAL-EDIT
//  FORMAT_515235511 = "-ZZZZZZZZZZ"
          methodOut.setValEdit400(CFUtil.cobolNumberFormatter(CONSTANTS.FORMAT_515235511,String.valueOf(methodOut.getVal2400()).toCharArray()));
//  DISPLAY '*  81* 400-VAL1 = ' 400-VAL-EDIT
          logger.info("*  81* 400-VAL1 = {}", new String(methodOut.getValEdit400())); 
//  SET 400-VAL3 TO IP66601-USER-T
          methodOut.setVal3400(methodOut.getIp66601UserT()); 
          
//  MOVE 400-VAL3 TO 400-VAL-EDIT
//  FORMAT_515235511 = "-ZZZZZZZZZZ"
          methodOut.setValEdit400(CFUtil.cobolNumberFormatter(CONSTANTS.FORMAT_515235511,String.valueOf(methodOut.getVal3400()).toCharArray()));
//  DISPLAY '*  82* 400-VAL1 = ' 400-VAL-EDIT
          logger.info("*  82* 400-VAL1 = {}", new String(methodOut.getValEdit400())); 

// *
//  SET IP66601-USER-T DOWN BY 1
          methodOut.setIp66601UserT(methodOut.getIp66601UserT() - 1); 
          
//  SET 400-VAL TO IP66601-USER-T
          methodOut.setVal400(methodOut.getIp66601UserT()); 
          
//  MOVE 400-VAL TO 400-VAL-EDIT
//  FORMAT_515235511 = "-ZZZZZZZZZZ"
          methodOut.setValEdit400(CFUtil.cobolNumberFormatter(CONSTANTS.FORMAT_515235511,String.valueOf(methodOut.getVal400()).toCharArray()));
//  DISPLAY '*  83* 400-VAL  = ' 400-VAL-EDIT
          logger.info("*  83* 400-VAL  = {}", new String(methodOut.getValEdit400())); 
//  SET 400-VAL1 TO IP66601-USER-T
          methodOut.setVal1400(methodOut.getIp66601UserT()); 
          
//  MOVE 400-VAL1 TO 400-VAL-EDIT
//  FORMAT_515235511 = "-ZZZZZZZZZZ"
          methodOut.setValEdit400(CFUtil.cobolNumberFormatter(CONSTANTS.FORMAT_515235511,String.valueOf(methodOut.getVal1400()).toCharArray()));
//  DISPLAY '*  84* 400-VAL1 = ' 400-VAL-EDIT
          logger.info("*  84* 400-VAL1 = {}", new String(methodOut.getValEdit400())); 
//  SET 400-VAL2 TO IP66601-USER-T
          methodOut.setVal2400((short) (short) methodOut.getIp66601UserT()); 
          
//  MOVE 400-VAL2 TO 400-VAL-EDIT
//  FORMAT_515235511 = "-ZZZZZZZZZZ"
          methodOut.setValEdit400(CFUtil.cobolNumberFormatter(CONSTANTS.FORMAT_515235511,String.valueOf(methodOut.getVal2400()).toCharArray()));
//  DISPLAY '*  85* 400-VAL1 = ' 400-VAL-EDIT
          logger.info("*  85* 400-VAL1 = {}", new String(methodOut.getValEdit400())); 
//  SET 400-VAL3 TO IP66601-USER-T
          methodOut.setVal3400(methodOut.getIp66601UserT()); 
          
//  MOVE 400-VAL3 TO 400-VAL-EDIT
//  FORMAT_515235511 = "-ZZZZZZZZZZ"
          methodOut.setValEdit400(CFUtil.cobolNumberFormatter(CONSTANTS.FORMAT_515235511,String.valueOf(methodOut.getVal3400()).toCharArray()));
//  DISPLAY '*  86* 400-VAL1 = ' 400-VAL-EDIT
          logger.info("*  86* 400-VAL1 = {}", new String(methodOut.getValEdit400())); 

// *
//  SET IP66601-USER-LEFT TO 300-ZERO-VAL
          methodOut.setIp66601UserLeft((int) (int) methodIn.getZeroVal300()); 
          
//  SET IP66601-USER-T TO IP66601-USER-LEFT
          methodOut.setIp66601UserT(methodOut.getIp66601UserLeft()); 
          
//  SET 400-VAL TO IP66601-USER-T
          methodOut.setVal400(methodOut.getIp66601UserT()); 
          
//  DISPLAY '*  87* 400-VAL  = ' 400-VAL
          logger.info("*  87* 400-VAL  = {}", String.valueOf(methodOut.getVal400())); 
//  SET 400-VAL1 TO IP66601-USER-T
          methodOut.setVal1400(methodOut.getIp66601UserT()); 
          
//  DISPLAY '*  88* 400-VAL1 = ' 400-VAL1
          logger.info("*  88* 400-VAL1 = {}", String.valueOf(methodOut.getVal1400())); 
//  SET 400-VAL2 TO IP66601-USER-T
          methodOut.setVal2400((short) (short) methodOut.getIp66601UserT()); 
          
//  DISPLAY '*  89* 400-VAL1 = ' 400-VAL2
          logger.info("*  89* 400-VAL1 = {}", String.valueOf(methodOut.getVal2400())); 
//  SET 400-VAL3 TO IP66601-USER-T
          methodOut.setVal3400(methodOut.getIp66601UserT()); 
          
//  DISPLAY '*  90* 400-VAL1 = ' 400-VAL3
          logger.info("*  90* 400-VAL1 = {}", String.valueOf(methodOut.getVal3400())); 

// *
//  SET IP66601-USER-LEFT TO 1
          methodOut.setIp66601UserLeft(1); 
          
//  SET 400-VAL TO IP66601-USER-LEFT
          methodOut.setVal400(methodOut.getIp66601UserLeft()); 
          
//  DISPLAY '*  91* 400-VAL  = ' 400-VAL
          logger.info("*  91* 400-VAL  = {}", String.valueOf(methodOut.getVal400())); 
//  SET 400-VAL1 TO IP66601-USER-LEFT
          methodOut.setVal1400(methodOut.getIp66601UserLeft()); 
          
//  DISPLAY '*  92* 400-VAL1 = ' 400-VAL1
          logger.info("*  92* 400-VAL1 = {}", String.valueOf(methodOut.getVal1400())); 
//  SET 400-VAL2 TO IP66601-USER-LEFT
          methodOut.setVal2400((short) (short) methodOut.getIp66601UserLeft()); 
          
      
      return methodOut;
      }
      /**
      * mainSplit4 
      *   This method is derived from 
  *   COBOL Paragraph - 0000-MAIN-SPLIT4 COBOL Cyclomatic complexity - 1
      * Input  :  

      * - val2400                        COBOL Name: 400-VAL2
      * - ip66601UserLeft                COBOL Name: IP66601-USER-LEFT
      * - minusoneVal300                 COBOL Name: 300-MINUSONE-VAL
      * - zeroVal300                     COBOL Name: 300-ZERO-VAL
      * - indexVal800                    COBOL Name: 800-INDEX-VAL
      * - zero800                        COBOL Name: 800-ZERO
      *
      * Output :  

      * - val3400                        COBOL Name: 400-VAL3
      * - ip66601UserLeft                COBOL Name: IP66601-USER-LEFT
      * - ip66601UserT                   COBOL Name: IP66601-USER-T
      * - val400                         COBOL Name: 400-VAL
      * - val1400                        COBOL Name: 400-VAL1
      * - val2400                        COBOL Name: 400-VAL2
      * - valEdit400                     COBOL Name: 400-VAL-EDIT
      * - index800                       COBOL Name: 800-INDEX
      *
      * @throws CFException
      */
      @Override
      public MainSplit4OutCtx mainSplit4(MainSplit4InCtx methodIn) throws Exception {
McindexCtx programCtx = methodIn.getMcindexCtx();
MainSplit4OutCtx methodOut = methodIn.getMainSplit4OutCtx();
//  DISPLAY '*  93* 400-VAL1 = ' 400-VAL2
          logger.info("*  93* 400-VAL1 = {}", String.valueOf(methodOut.getVal2400())); 
//  SET 400-VAL3 TO IP66601-USER-LEFT
          methodOut.setVal3400(methodOut.getIp66601UserLeft()); 
          
//  DISPLAY '*  94* 400-VAL1 = ' 400-VAL3
          logger.info("*  94* 400-VAL1 = {}", String.valueOf(methodOut.getVal3400())); 

// *
//  SET IP66601-USER-LEFT DOWN BY 1
          methodOut.setIp66601UserLeft(methodOut.getIp66601UserLeft() - 1); 
          
//  SET IP66601-USER-T TO IP66601-USER-LEFT
          methodOut.setIp66601UserT(methodOut.getIp66601UserLeft()); 
          
//  SET 400-VAL TO IP66601-USER-T
          methodOut.setVal400(methodOut.getIp66601UserT()); 
          
//  DISPLAY '*  95* 400-VAL  = ' 400-VAL
          logger.info("*  95* 400-VAL  = {}", String.valueOf(methodOut.getVal400())); 
//  SET 400-VAL1 TO IP66601-USER-T
          methodOut.setVal1400(methodOut.getIp66601UserT()); 
          
//  DISPLAY '*  96* 400-VAL1 = ' 400-VAL1
          logger.info("*  96* 400-VAL1 = {}", String.valueOf(methodOut.getVal1400())); 
//  SET 400-VAL2 TO IP66601-USER-T
          methodOut.setVal2400((short) (short) methodOut.getIp66601UserT()); 
          
//  DISPLAY '*  97* 400-VAL1 = ' 400-VAL2
          logger.info("*  97* 400-VAL1 = {}", String.valueOf(methodOut.getVal2400())); 
//  SET 400-VAL3 TO IP66601-USER-T
          methodOut.setVal3400(methodOut.getIp66601UserT()); 
          
//  DISPLAY '*  98* 400-VAL1 = ' 400-VAL3
          logger.info("*  98* 400-VAL1 = {}", String.valueOf(methodOut.getVal3400())); 

// *
//  SET IP66601-USER-LEFT TO 300-MINUSONE-VAL
          methodOut.setIp66601UserLeft(methodIn.getMinusoneVal300()); 
          
//  SET IP66601-USER-T TO IP66601-USER-LEFT
          methodOut.setIp66601UserT(methodOut.getIp66601UserLeft()); 
          
//  SET 400-VAL TO IP66601-USER-T
          methodOut.setVal400(methodOut.getIp66601UserT()); 
          
//  MOVE 400-VAL TO 400-VAL-EDIT
//  FORMAT_515235511 = "-ZZZZZZZZZZ"
          methodOut.setValEdit400(CFUtil.cobolNumberFormatter(CONSTANTS.FORMAT_515235511,String.valueOf(methodOut.getVal400()).toCharArray()));
//  DISPLAY '*  99* 400-VAL  = ' 400-VAL-EDIT
          logger.info("*  99* 400-VAL  = {}", new String(methodOut.getValEdit400())); 
//  SET 400-VAL1 TO IP66601-USER-T
          methodOut.setVal1400(methodOut.getIp66601UserT()); 
          
//  MOVE 400-VAL1 TO 400-VAL-EDIT
//  FORMAT_515235511 = "-ZZZZZZZZZZ"
          methodOut.setValEdit400(CFUtil.cobolNumberFormatter(CONSTANTS.FORMAT_515235511,String.valueOf(methodOut.getVal1400()).toCharArray()));
//  DISPLAY '* 100* 400-VAL1 = ' 400-VAL-EDIT
          logger.info("* 100* 400-VAL1 = {}", new String(methodOut.getValEdit400())); 
//  SET 400-VAL2 TO IP66601-USER-T
          methodOut.setVal2400((short) (short) methodOut.getIp66601UserT()); 
          
//  MOVE 400-VAL2 TO 400-VAL-EDIT
//  FORMAT_515235511 = "-ZZZZZZZZZZ"
          methodOut.setValEdit400(CFUtil.cobolNumberFormatter(CONSTANTS.FORMAT_515235511,String.valueOf(methodOut.getVal2400()).toCharArray()));
//  DISPLAY '* 101* 400-VAL1 = ' 400-VAL-EDIT
          logger.info("* 101* 400-VAL1 = {}", new String(methodOut.getValEdit400())); 
//  SET 400-VAL3 TO IP66601-USER-T
          methodOut.setVal3400(methodOut.getIp66601UserT()); 
          
//  MOVE 400-VAL3 TO 400-VAL-EDIT
//  FORMAT_515235511 = "-ZZZZZZZZZZ"
          methodOut.setValEdit400(CFUtil.cobolNumberFormatter(CONSTANTS.FORMAT_515235511,String.valueOf(methodOut.getVal3400()).toCharArray()));
//  DISPLAY '* 102* 400-VAL1 = ' 400-VAL-EDIT
          logger.info("* 102* 400-VAL1 = {}", new String(methodOut.getValEdit400())); 

// *
//  SET IP66601-USER-T UP BY 1
          methodOut.setIp66601UserT(methodOut.getIp66601UserT() + 1); 
          
//  SET 400-VAL TO IP66601-USER-T
          methodOut.setVal400(methodOut.getIp66601UserT()); 
          
//  DISPLAY '* 103* 400-VAL  = ' 400-VAL
          logger.info("* 103* 400-VAL  = {}", String.valueOf(methodOut.getVal400())); 
//  SET 400-VAL1 TO IP66601-USER-T
          methodOut.setVal1400(methodOut.getIp66601UserT()); 
          
//  DISPLAY '* 104* 400-VAL1 = ' 400-VAL1
          logger.info("* 104* 400-VAL1 = {}", String.valueOf(methodOut.getVal1400())); 
//  SET 400-VAL2 TO IP66601-USER-T
          methodOut.setVal2400((short) (short) methodOut.getIp66601UserT()); 
          
//  DISPLAY '* 105* 400-VAL1 = ' 400-VAL2
          logger.info("* 105* 400-VAL1 = {}", String.valueOf(methodOut.getVal2400())); 
//  SET 400-VAL3 TO IP66601-USER-T
          methodOut.setVal3400(methodOut.getIp66601UserT()); 
          
//  DISPLAY '* 106* 400-VAL1 = ' 400-VAL3
          logger.info("* 106* 400-VAL1 = {}", String.valueOf(methodOut.getVal3400())); 

// *
//  SET IP66601-USER-T TO 300-ZERO-VAL
          methodOut.setIp66601UserT((int) (int) methodIn.getZeroVal300()); 
          
//  SET IP66601-USER-T UP BY 1
          methodOut.setIp66601UserT(methodOut.getIp66601UserT() + 1); 
          
//  SET 400-VAL TO IP66601-USER-T
          methodOut.setVal400(methodOut.getIp66601UserT()); 
          
//  DISPLAY '* 107* 400-VAL  = ' 400-VAL
          logger.info("* 107* 400-VAL  = {}", String.valueOf(methodOut.getVal400())); 
//  SET 400-VAL1 TO IP66601-USER-T
          methodOut.setVal1400(methodOut.getIp66601UserT()); 
          
//  DISPLAY '* 108* 400-VAL1 = ' 400-VAL1
          logger.info("* 108* 400-VAL1 = {}", String.valueOf(methodOut.getVal1400())); 
//  SET 400-VAL2 TO IP66601-USER-T
          methodOut.setVal2400((short) (short) methodOut.getIp66601UserT()); 
          
//  DISPLAY '* 109* 400-VAL1 = ' 400-VAL2
          logger.info("* 109* 400-VAL1 = {}", String.valueOf(methodOut.getVal2400())); 
//  SET 400-VAL3 TO IP66601-USER-T
          methodOut.setVal3400(methodOut.getIp66601UserT()); 
          
//  DISPLAY '* 110* 400-VAL1 = ' 400-VAL3
          logger.info("* 110* 400-VAL1 = {}", String.valueOf(methodOut.getVal3400())); 

// *
//  SET IP66601-USER-T TO 300-ZERO-VAL
          methodOut.setIp66601UserT((int) (int) methodIn.getZeroVal300()); 
          
//  SET 800-INDEX TO IP66601-USER-T
          methodOut.setIndex800(IP66601_USER_TAG_LENGTH * ( ((methodOut.getIp66601UserT() < 1) ? 1:methodOut.getIp66601UserT()) - 1)); 
          
//  DISPLAY '* 111* 800-INDEX= ' 800-INDEX-VAL
          logger.info("* 111* 800-INDEX= {}", methodIn.getIndexVal800().toString()); 

// *
//  SET IP66601-USER-T TO 800-ZERO
          methodOut.setIp66601UserT((methodIn.getZero800()/IP66601_USER_TAG_LENGTH) + 1 ); 
          
//  SET 800-INDEX TO IP66601-USER-T
          methodOut.setIndex800(IP66601_USER_TAG_LENGTH * ( ((methodOut.getIp66601UserT() < 1) ? 1:methodOut.getIp66601UserT()) - 1)); 
          
      
      return methodOut;
      }
      /**
      * mainSplit5 
      *   This method is derived from 
  *   COBOL Paragraph - 0000-MAIN-SPLIT5 COBOL Cyclomatic complexity - 1
      * Input  :  

      * - indexVal800                    COBOL Name: 800-INDEX-VAL
      * - ip66601UserT                   COBOL Name: IP66601-USER-T
      *
      * Output :  

      * - val400                         COBOL Name: 400-VAL
      * - ip0006o4I                      COBOL Name: IP0006O4-I
      * - ip0006o4DeAttrTable            COBOL Name: IP0006O4-DE-ATTR-TABLE
      * - ip0006o4DeFirstSubfld          COBOL Name: IP0006O4-DE-FIRST-SUBFLD
      * - ip0007o4I                      COBOL Name: IP0007O4-I
      *
      * @throws CFException
      */
      @Override
      public MainSplit5OutCtx mainSplit5(MainSplit5InCtx methodIn) throws Exception {
McindexCtx programCtx = methodIn.getMcindexCtx();
MainSplit5OutCtx methodOut = methodIn.getMainSplit5OutCtx();
//  DISPLAY '* 112* 800-INDEX= ' 800-INDEX-VAL
          logger.info("* 112* 800-INDEX= {}", methodIn.getIndexVal800().toString()); 
//  SET 400-VAL TO IP66601-USER-T
          methodOut.setVal400(methodIn.getIp66601UserT()); 
          
//  DISPLAY '* 113* 400-VAL  = ' 400-VAL
          logger.info("* 113* 400-VAL  = {}", String.valueOf(methodOut.getVal400())); 

// *
// *-----------
//  SET IP0006O4-I TO 1
          methodOut.setIp0006o4I(1); 
          
          // MOVE LOW-VALUES TO IP0006O4-DE-ATTR-TABLE
          methodOut.getIp0006o4DeAttrTable().setString(CONSTANTS.LOW_VALUE_1181837784);

// *
//  SET IP0007O4-I TO IP0006O4-DE-FIRST-SUBFLD ( IP0006O4-I )
          methodOut.setIp0007o4I((methodOut.getIp0006o4DeFirstSubfld(methodOut.getIp0006o4I() - 1)/IP0007O4_DE_SUB_ATTR_ROW_LENGTH) + 1 ); 
          
//  SET 400-VAL TO IP0007O4-I
          methodOut.setVal400(methodOut.getIp0007o4I()); 
          
//  DISPLAY '* 114* 400-VAL  = ' 400-VAL
          logger.info("* 114* 400-VAL  = {}", String.valueOf(methodOut.getVal400())); 

// *
//  GOBACK
          setNotLogged(false); // no need to log, it is a normal termination
          programCtx.setProgramEnded(true);
          return methodOut;
      
      }
  
  
  
  
  
  
  
  
  }
