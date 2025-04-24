  package com.cloudframe.app.process.impl;
  /* 
*
*/
  
  import com.cloudframe.app.refmod1.Refmod1Ctx.*;
  import com.cloudframe.app.refmod1.Refmod1Ctx;
  import com.cloudframe.app.process.Refmod1;
  import com.cloudframe.app.process.BaseProcess;
  import org.springframework.web.bind.annotation.GetMapping;
  import org.slf4j.Logger;
  import org.slf4j.LoggerFactory;
  import com.cloudframe.app.exception.CFException;
  import org.springframework.stereotype.Component;
  import org.springframework.web.bind.annotation.RestController;
  import com.cloudframe.app.dto.GlobalExecutorCtx;
  import com.cloudframe.app.utility.CFUtil;
  import com.cloudframe.app.global.sharedvar.AS5;
  import com.cloudframe.app.global.sharedvar.AT5;
  import com.cloudframe.app.global.sharedvar.BS5;
  import com.cloudframe.app.global.sharedvar.BT5;
  import com.cloudframe.app.global.sharedvar.BT6;
  import com.cloudframe.app.global.sharedvar.AT6;
  import com.cloudframe.app.global.sharedvar.AS7;
  import com.cloudframe.app.global.sharedvar.AT7;
  import com.cloudframe.app.global.sharedvar.BS7;
  import com.cloudframe.app.global.sharedvar.BT7;
  import com.cloudframe.app.global.sharedvar.AT8;
  import com.cloudframe.app.global.sharedvar.BT8;
  import com.cloudframe.app.global.sharedvar.AS9;
  import com.cloudframe.app.global.sharedvar.AT9;
  import com.cloudframe.app.global.sharedvar.BS9;
  import com.cloudframe.app.global.sharedvar.BT9;
  import com.cloudframe.app.global.sharedvar.AT10;
  import com.cloudframe.app.global.sharedvar.BT10;
  import com.cloudframe.app.global.sharedvar.AT11;
  import com.cloudframe.app.global.sharedvar.BT11;
  import com.cloudframe.app.global.sharedvar.AT12;
  import com.cloudframe.app.global.sharedvar.BT12;
  import com.cloudframe.app.global.sharedvar.AS13;
  import com.cloudframe.app.global.sharedvar.AT13;
  import com.cloudframe.app.global.sharedvar.BS13;
  import com.cloudframe.app.global.sharedvar.BT13;
  import com.cloudframe.app.global.sharedvar.AT14;
  import com.cloudframe.app.global.sharedvar.BT14;
  import com.cloudframe.app.global.sharedvar.AS15;
  import com.cloudframe.app.global.sharedvar.AT15;
  import com.cloudframe.app.global.sharedvar.BS15;
  import com.cloudframe.app.global.sharedvar.BT15;
  import com.cloudframe.app.global.sharedvar.AT16;
  import com.cloudframe.app.global.sharedvar.BT16;
  import com.cloudframe.app.global.sharedvar.AS17;
  import com.cloudframe.app.global.sharedvar.AT17;
  import com.cloudframe.app.global.sharedvar.BS17;
  import com.cloudframe.app.global.sharedvar.BT17;
  import com.cloudframe.app.global.sharedvar.AT18;
  import com.cloudframe.app.global.sharedvar.BT18;
  import com.cloudframe.app.global.sharedvar.AT19;
  import com.cloudframe.app.global.sharedvar.BT19;
  import com.cloudframe.app.global.sharedvar.AT20;
  import com.cloudframe.app.global.sharedvar.BT20;
  import com.cloudframe.app.global.sharedvar.Wse5aS;
  import com.cloudframe.app.global.sharedvar.Wse5aT;
  import com.cloudframe.app.global.sharedvar.Wse5bS;
  import com.cloudframe.app.global.sharedvar.Wse5bT;
  import com.cloudframe.app.global.sharedvar.Wse6aT;
  import com.cloudframe.app.global.sharedvar.Wse6bT;
  import com.cloudframe.app.global.sharedvar.Wse7aS;
  import com.cloudframe.app.global.sharedvar.Wse7aT;
  import com.cloudframe.app.global.sharedvar.Wse7bS;
  import com.cloudframe.app.global.sharedvar.Wse7bT;
  import com.cloudframe.app.global.sharedvar.Wse8aT;
  import com.cloudframe.app.global.sharedvar.Wse8bT;
  import com.cloudframe.app.global.sharedvar.Wse9aS;
  import com.cloudframe.app.global.sharedvar.Wse9aT;
  import com.cloudframe.app.global.sharedvar.Wse9bS;
  import com.cloudframe.app.global.sharedvar.Wse9bT;
  import com.cloudframe.app.global.sharedvar.Wse10aT;
  import com.cloudframe.app.global.sharedvar.Wse10bT;
  import com.cloudframe.app.global.sharedvar.Wse11aT;
  import com.cloudframe.app.global.sharedvar.Wse11bT;
  import com.cloudframe.app.global.sharedvar.Wse12aT;
  import com.cloudframe.app.global.sharedvar.Wse12bT;
  import com.cloudframe.app.global.sharedvar.Wse13aS;
  import com.cloudframe.app.global.sharedvar.Wse13aT;
  import com.cloudframe.app.global.sharedvar.Wse13bS;
  import com.cloudframe.app.global.sharedvar.Wse13bT;
  import com.cloudframe.app.global.sharedvar.Wse14aT;
  import com.cloudframe.app.global.sharedvar.Wse14bT;
  import com.cloudframe.app.global.sharedvar.Wse15aS;
  import com.cloudframe.app.global.sharedvar.Wse15aT;
  import com.cloudframe.app.global.sharedvar.Wse15bS;
  import com.cloudframe.app.global.sharedvar.Wse15bT;
  import com.cloudframe.app.global.sharedvar.Wse16aT;
  import com.cloudframe.app.global.sharedvar.Wse16bT;
  import com.cloudframe.app.global.sharedvar.Wse17aS;
  import com.cloudframe.app.global.sharedvar.Wse17aT;
  import com.cloudframe.app.global.sharedvar.Wse17bS;
  import com.cloudframe.app.global.sharedvar.Wse17bT;
  import com.cloudframe.app.global.sharedvar.Wse18aT;
  import com.cloudframe.app.global.sharedvar.Wse18bT;
  import com.cloudframe.app.global.sharedvar.Wse19aT;
  import com.cloudframe.app.global.sharedvar.Wse19bT;
  import com.cloudframe.app.global.sharedvar.Wse20aT;
  import com.cloudframe.app.global.sharedvar.Wse20bT;
  import com.cloudframe.app.global.sharedvar.Wse20cS;
  import com.cloudframe.app.exception.Terminate;
  import org.springframework.beans.factory.annotation.Autowired;
  import org.springframework.beans.factory.annotation.Qualifier;
  import com.cloudframe.app.global.sharedvar.ASGrp16;
  import com.cloudframe.app.global.sharedvar.Wse11aS;
  import com.cloudframe.app.refmod1.dto.*;
  import com.cloudframe.app.refmod1.dto.BS1;
  import com.cloudframe.app.global.sharedvar.BS11;
  import com.cloudframe.app.global.sharedvar.Wse16bSGrp;
  import com.cloudframe.app.refmod1.dto.Wse1bS;
  import com.cloudframe.app.global.sharedvar.ASGrp14;
  import com.cloudframe.app.global.sharedvar.Wse6bSGrp;
  import com.cloudframe.app.refmod1.dto.Wse3bS;
  import com.cloudframe.app.global.sharedvar.Wse10aSGrp;
  import com.cloudframe.app.refmod1.dto.AS3;
  import com.cloudframe.app.global.sharedvar.BSGrp15;
  import com.cloudframe.app.global.sharedvar.Wse13aSGrp;
  import com.cloudframe.app.global.sharedvar.Wse19aS;
  import com.cloudframe.app.global.sharedvar.BSGrp6;
  import com.cloudframe.app.global.sharedvar.BSGrp13;
  import com.cloudframe.app.refmod1.dto.Wse1aS;
  import com.cloudframe.app.global.sharedvar.BSGrp10;
  import com.cloudframe.app.refmod1.dto.AS1;
  import com.cloudframe.app.global.sharedvar.BSGrp16;
  import com.cloudframe.app.global.sharedvar.Wse15aSGrp;
  import com.cloudframe.app.refmod1.dto.Wse3aS;
  import com.cloudframe.app.global.sharedvar.Wse14aSGrp;
  import com.cloudframe.app.global.sharedvar.Wse16aSGrp;
  import com.cloudframe.app.refmod1.dto.BS3;
  import com.cloudframe.app.global.sharedvar.Wse11bS;
  import com.cloudframe.app.global.sharedvar.Wse5aSGrp;
  import com.cloudframe.app.global.sharedvar.AS11;
  import com.cloudframe.app.global.sharedvar.ASGrp9;
  import com.cloudframe.app.global.sharedvar.Wse9bSGrp;
  import com.cloudframe.app.global.sharedvar.Wse6aSGrp;
  import com.cloudframe.app.global.sharedvar.Wse15bSGrp;
  import com.cloudframe.app.global.sharedvar.AS19;
  import com.cloudframe.app.global.sharedvar.BS19;
  import com.cloudframe.app.global.sharedvar.ASGrp5;
  import com.cloudframe.app.global.sharedvar.Wse10bSGrp;
  import com.cloudframe.app.global.sharedvar.Wse5bSGrp;
  import com.cloudframe.app.global.sharedvar.Wse19bS;
  import com.cloudframe.app.global.sharedvar.Wse20cSGrp;
  import com.cloudframe.app.global.sharedvar.Wse13bSGrp;
  import com.cloudframe.app.global.sharedvar.ASGrp13;
  import com.cloudframe.app.global.sharedvar.ASGrp6;
  import com.cloudframe.app.global.sharedvar.Wse9aSGrp;
  import com.cloudframe.app.global.sharedvar.ASGrp15;
  import com.cloudframe.app.global.sharedvar.BSGrp9;
  import com.cloudframe.app.global.sharedvar.BSGrp5;
  import com.cloudframe.app.global.sharedvar.ASGrp10;
  import com.cloudframe.app.global.sharedvar.Wse14bSGrp;
  import com.cloudframe.app.global.sharedvar.BSGrp14;
  import com.cloudframe.app.refmod1.dto.ATGroup1;
  import com.cloudframe.app.refmod1.dto.BTGroup1;
  import com.cloudframe.app.refmod1.dto.ATGroup2;
  import com.cloudframe.app.refmod1.dto.BTGroup2;
  import com.cloudframe.app.refmod1.dto.ATGroup3;
  import com.cloudframe.app.refmod1.dto.BTGroup3;
  import com.cloudframe.app.refmod1.dto.ATGroup4;
  import com.cloudframe.app.refmod1.dto.BTGroup4;
  import com.cloudframe.app.refmod1.dto.Wse1aTGroup;
  import com.cloudframe.app.refmod1.dto.Wse1bTGroup;
  import com.cloudframe.app.refmod1.dto.Wse2aTGroup;
  import com.cloudframe.app.refmod1.dto.Wse2bTGroup;
  import com.cloudframe.app.refmod1.dto.Wse3aTGroup;
  import com.cloudframe.app.refmod1.dto.Wse3bTGroup;
  import com.cloudframe.app.refmod1.dto.Wse4aTGroup;
  import com.cloudframe.app.refmod1.dto.Wse4bTGroup;
  import com.cloudframe.app.refmod1.dto.Wse20cTGroup;
  import com.cloudframe.app.global.sharedvar.ATGroup5;
  import com.cloudframe.app.global.sharedvar.BTGroup5;
  import com.cloudframe.app.global.sharedvar.ATGroup6;
  import com.cloudframe.app.global.sharedvar.BTGroup6;
  import com.cloudframe.app.global.sharedvar.ATGrpGroup7;
  import com.cloudframe.app.global.sharedvar.BTGrpGroup7;
  import com.cloudframe.app.global.sharedvar.ATGrpGroup8;
  import com.cloudframe.app.global.sharedvar.BTGrpGroup8;
  import com.cloudframe.app.global.sharedvar.ATGrpGroup9;
  import com.cloudframe.app.global.sharedvar.BTGrpGroup9;
  import com.cloudframe.app.global.sharedvar.ATGrpGroup10;
  import com.cloudframe.app.global.sharedvar.BTGrpGroup10;
  import com.cloudframe.app.global.sharedvar.ATGrpGroup11;
  import com.cloudframe.app.global.sharedvar.BTGrpGroup11;
  import com.cloudframe.app.global.sharedvar.ATGrpGroup12;
  import com.cloudframe.app.global.sharedvar.BTGrpGroup12;
  import com.cloudframe.app.global.sharedvar.ATGrpGroup13;
  import com.cloudframe.app.global.sharedvar.BTGrpGroup13;
  import com.cloudframe.app.global.sharedvar.ATGrpGroup14;
  import com.cloudframe.app.global.sharedvar.BTGrpGroup14;
  import com.cloudframe.app.global.sharedvar.ATGroup15;
  import com.cloudframe.app.global.sharedvar.BTGroup15;
  import com.cloudframe.app.global.sharedvar.ATGroup16;
  import com.cloudframe.app.global.sharedvar.BTGroup16;
  import com.cloudframe.app.global.sharedvar.ATGrpGroup17;
  import com.cloudframe.app.global.sharedvar.BTGrpGroup17;
  import com.cloudframe.app.global.sharedvar.ATGrpGroup18;
  import com.cloudframe.app.global.sharedvar.BTGrpGroup18;
  import com.cloudframe.app.global.sharedvar.ATGrpGroup19;
  import com.cloudframe.app.global.sharedvar.BTGrpGroup19;
  import com.cloudframe.app.global.sharedvar.ATGrpGroup20;
  import com.cloudframe.app.global.sharedvar.BTGrpGroup20;
  import com.cloudframe.app.global.sharedvar.Wse5aTGroup;
  import com.cloudframe.app.global.sharedvar.Wse5bTGroup;
  import com.cloudframe.app.global.sharedvar.Wse6aTGroup;
  import com.cloudframe.app.global.sharedvar.Wse6bTGroup;
  import com.cloudframe.app.global.sharedvar.Wse7aTGrpGroup;
  import com.cloudframe.app.global.sharedvar.Wse7bTGrpGroup;
  import com.cloudframe.app.global.sharedvar.Wse8aTGrpGroup;
  import com.cloudframe.app.global.sharedvar.Wse8bTGrpGroup;
  import com.cloudframe.app.global.sharedvar.Wse9aTGrpGroup;
  import com.cloudframe.app.global.sharedvar.Wse9bTGrpGroup;
  import com.cloudframe.app.global.sharedvar.Wse10aTGrpGroup;
  import com.cloudframe.app.global.sharedvar.Wse10bTGrpGroup;
  import com.cloudframe.app.global.sharedvar.Wse11aTGrpGroup;
  import com.cloudframe.app.global.sharedvar.Wse11bTGrpGroup;
  import com.cloudframe.app.global.sharedvar.Wse12aTGrpGroup;
  import com.cloudframe.app.global.sharedvar.Wse12bTGrpGroup;
  import com.cloudframe.app.global.sharedvar.Wse13aTGrpGroup;
  import com.cloudframe.app.global.sharedvar.Wse13bTGrpGroup;
  import com.cloudframe.app.global.sharedvar.Wse14aTGrpGroup;
  import com.cloudframe.app.global.sharedvar.Wse14bTGrpGroup;
  import com.cloudframe.app.global.sharedvar.Wse15aTGroup;
  import com.cloudframe.app.global.sharedvar.Wse15bTGroup;
  import com.cloudframe.app.global.sharedvar.Wse16aTGroup;
  import com.cloudframe.app.global.sharedvar.Wse16bTGroup;
  import com.cloudframe.app.global.sharedvar.Wse17aTGrpGroup;
  import com.cloudframe.app.global.sharedvar.Wse17bTGrpGroup;
  import com.cloudframe.app.global.sharedvar.Wse18aTGrpGroup;
  import com.cloudframe.app.global.sharedvar.Wse18bTGrpGroup;
  import com.cloudframe.app.global.sharedvar.Wse19aTGrpGroup;
  import com.cloudframe.app.global.sharedvar.Wse19bTGrpGroup;
  import com.cloudframe.app.global.sharedvar.Wse20aTGrpGroup;
  import com.cloudframe.app.global.sharedvar.Wse20bTGrpGroup;
  import com.cloudframe.app.refmod1.dto.Work;
  import com.cloudframe.app.common.CONSTANTS;
  
  @Component("refmod1")
  
  public class Refmod1Impl extends CommonProcess implements Refmod1 {
  
  Logger logger = LoggerFactory.getLogger(Refmod1Impl.class);
  
  
  
  
  
  
  
  
  
  
      /**
      * process 
      * Input  : None 

      * Output : None 

      * @throws CFException
      */
      public int process(Refmod1Ctx programCtx) throws Exception {
			// Declare local variables used in the method
			 final int A_S_2_LENGTH = 70;
			 final int B_S_2_LENGTH = 70;
			 final int A_S_6_LENGTH = 70;
			 final int B_S_6_LENGTH = 70;
			 final int A_S_8_LENGTH = 70;
			 final int B_S_8_LENGTH = 70;
			 final int A_S_10_LENGTH = 70;
			 final int B_S_10_LENGTH = 70;
			 final int A_S_14_LENGTH = 70;
			 final int B_S_14_LENGTH = 70;
			 final int A_S_16_LENGTH = 70;
			 final int B_S_16_LENGTH = 70;
			 final int A_S_18_LENGTH = 70;
			 final int B_S_18_LENGTH = 70;
			 final int WSE_2A_S_LENGTH = 60;
			 final int WSE_2B_S_LENGTH = 60;
			 final int WSE_6A_S_LENGTH = 60;
			 final int WSE_6B_S_LENGTH = 60;
			 final int WSE_8A_S_LENGTH = 60;
			 final int WSE_8B_S_LENGTH = 60;
			 final int WSE_10A_S_LENGTH = 60;
			 final int WSE_10B_S_LENGTH = 60;
			 final int WSE_14A_S_LENGTH = 60;
			 final int WSE_14B_S_LENGTH = 60;
			 final int WSE_16A_S_LENGTH = 60;
			 final int WSE_16B_S_LENGTH = 60;
			 final int WSE_18A_S_LENGTH = 60;
			 final int WSE_18B_S_LENGTH = 60;
			// End of variable declaration

       try {
       setCodePage("1047");
            // Reset program ended flag
           programCtx.setProgramEnded(false);
          ;
//  PERFORM MAINLINE
          mainline(programCtx);/*MAINLINE*/
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
  *   COBOL Paragraph - MAINLINE COBOL Cyclomatic complexity - 2
      * Input  : None 

      * Output : None 

      * @throws CFException
      */
      @Override
      public void mainline(Refmod1Ctx programCtx) throws Exception {
      
// *

// *
//  PERFORM MAINLINE-SPLIT0
          mainlineSplit0(programCtx.getMainlineSplit0InCtx());/*MAINLINE-SPLIT0*/
//  PERFORM MAINLINE-SPLIT1
          mainlineSplit1(programCtx.getMainlineSplit1InCtx());/*MAINLINE-SPLIT1*/
//  PERFORM MAINLINE-SPLIT2
          mainlineSplit2(programCtx.getMainlineSplit2InCtx());/*MAINLINE-SPLIT2*/
//  PERFORM MAINLINE-SPLIT3
          mainlineSplit3(programCtx.getMainlineSplit3InCtx());/*MAINLINE-SPLIT3*/
//  PERFORM MAINLINE-SPLIT4
          mainlineSplit4(programCtx.getMainlineSplit4InCtx());/*MAINLINE-SPLIT4*/
//  PERFORM MAINLINE-SPLIT5
          mainlineSplit5(programCtx.getMainlineSplit5InCtx());/*MAINLINE-SPLIT5*/
//  PERFORM MAINLINE-SPLIT6
          mainlineSplit6(programCtx.getMainlineSplit6InCtx());/*MAINLINE-SPLIT6*/
//  PERFORM MAINLINE-SPLIT7
          mainlineSplit7(programCtx.getMainlineSplit7InCtx());/*MAINLINE-SPLIT7*/
//  PERFORM MAINLINE-SPLIT8
          mainlineSplit8(programCtx.getMainlineSplit8InCtx());/*MAINLINE-SPLIT8*/
//  PERFORM MAINLINE-SPLIT9
          mainlineSplit9(programCtx.getMainlineSplit9InCtx());/*MAINLINE-SPLIT9*/
//  PERFORM MAINLINE-SPLIT10
          mainlineSplit10(programCtx.getMainlineSplit10InCtx());/*MAINLINE-SPLIT10*/
//  PERFORM MAINLINE-SPLIT11
          mainlineSplit11(programCtx.getMainlineSplit11InCtx());/*MAINLINE-SPLIT11*/
//  PERFORM MAINLINE-SPLIT12
          mainlineSplit12(programCtx.getMainlineSplit12InCtx());/*MAINLINE-SPLIT12*/
//  PERFORM MAINLINE-SPLIT13
          mainlineSplit13(programCtx.getMainlineSplit13InCtx());/*MAINLINE-SPLIT13*/
//  PERFORM MAINLINE-SPLIT14
          mainlineSplit14(programCtx.getMainlineSplit14InCtx());/*MAINLINE-SPLIT14*/
//  PERFORM MAINLINE-SPLIT15
          mainlineSplit15(programCtx.getMainlineSplit15InCtx());/*MAINLINE-SPLIT15*/
//  PERFORM MAINLINE-SPLIT16
          mainlineSplit16(programCtx.getMainlineSplit16InCtx());/*MAINLINE-SPLIT16*/
//  PERFORM MAINLINE-SPLIT17
          mainlineSplit17(programCtx.getMainlineSplit17InCtx());/*MAINLINE-SPLIT17*/
//  PERFORM MAINLINE-SPLIT18
          mainlineSplit18(programCtx.getMainlineSplit18InCtx());/*MAINLINE-SPLIT18*/
//  PERFORM MAINLINE-SPLIT19
          mainlineSplit19(programCtx.getMainlineSplit19InCtx());/*MAINLINE-SPLIT19*/
//  PERFORM MAINLINE-SPLIT20
          mainlineSplit20(programCtx.getMainlineSplit20InCtx());/*MAINLINE-SPLIT20*/
//  PERFORM MAINLINE-SPLIT21
          mainlineSplit21(programCtx.getMainlineSplit21InCtx());/*MAINLINE-SPLIT21*/
//  PERFORM MAINLINE-SPLIT22
          mainlineSplit22(programCtx.getMainlineSplit22InCtx());/*MAINLINE-SPLIT22*/
//  PERFORM MAINLINE-SPLIT23
          mainlineSplit23(programCtx.getMainlineSplit23InCtx());/*MAINLINE-SPLIT23*/
//  PERFORM MAINLINE-SPLIT24
          mainlineSplit24(programCtx.getMainlineSplit24InCtx());/*MAINLINE-SPLIT24*/
//  PERFORM MAINLINE-SPLIT25
          mainlineSplit25(programCtx.getMainlineSplit25InCtx());/*MAINLINE-SPLIT25*/
//  PERFORM MAINLINE-SPLIT26
          mainlineSplit26(programCtx.getMainlineSplit26InCtx());/*MAINLINE-SPLIT26*/
//  PERFORM MAINLINE-SPLIT27
          mainlineSplit27(programCtx.getMainlineSplit27InCtx());/*MAINLINE-SPLIT27*/
//  PERFORM MAINLINE-SPLIT28
          mainlineSplit28(programCtx.getMainlineSplit28InCtx());/*MAINLINE-SPLIT28*/
//  PERFORM MAINLINE-SPLIT29
          mainlineSplit29(programCtx.getMainlineSplit29InCtx());/*MAINLINE-SPLIT29*/
//  PERFORM MAINLINE-SPLIT30
          mainlineSplit30(programCtx.getMainlineSplit30InCtx());/*MAINLINE-SPLIT30*/
//  PERFORM MAINLINE-SPLIT31
          mainlineSplit31(programCtx.getMainlineSplit31InCtx());/*MAINLINE-SPLIT31*/
//  PERFORM MAINLINE-SPLIT32
          mainlineSplit32(programCtx.getMainlineSplit32InCtx());/*MAINLINE-SPLIT32*/
//  PERFORM MAINLINE-SPLIT33
          mainlineSplit33(programCtx.getMainlineSplit33InCtx());/*MAINLINE-SPLIT33*/
//  PERFORM MAINLINE-SPLIT34
          mainlineSplit34(programCtx.getMainlineSplit34InCtx());/*MAINLINE-SPLIT34*/
      
      }
      /**
      * mainlineSplit0 
      *   This method is derived from 
  *   COBOL Paragraph - MAINLINE-SPLIT0 COBOL Cyclomatic complexity - 1
      * Input  :  

      * - aTR1                           COBOL Name: WS-1A-T-R
      * - bTR1                           COBOL Name: WS-1B-T-R
      *
      * Output :  

      * - aSGrp5                         COBOL Name: WS-5A-S-GRP
      * - bSGrp5                         COBOL Name: WS-5B-S-GRP
      * - aSGrp6                         COBOL Name: WS-6A-S-GRP
      * - bSGrp6                         COBOL Name: WS-6B-S-GRP
      * - aTGrp7                         COBOL Name: WS-7A-T-GRP
      * - bTGrp7                         COBOL Name: WS-7B-T-GRP
      * - aTGrp8                         COBOL Name: WS-8A-T-GRP
      * - bTGrp8                         COBOL Name: WS-8B-T-GRP
      * - aSGrp9                         COBOL Name: WS-9A-S-GRP
      * - aTGrp9                         COBOL Name: WS-9A-T-GRP
      * - bSGrp9                         COBOL Name: WS-9B-S-GRP
      * - bTGrp9                         COBOL Name: WS-9B-T-GRP
      * - aSGrp10                        COBOL Name: WS-10A-S-GRP
      * - aTGrp10                        COBOL Name: WS-10A-T-GRP
      * - bSGrp10                        COBOL Name: WS-10B-S-GRP
      * - bTGrp10                        COBOL Name: WS-10B-T-GRP
      * - aTGrp11                        COBOL Name: WS-11A-T-GRP
      * - bTGrp11                        COBOL Name: WS-11B-T-GRP
      * - aTGrp12                        COBOL Name: WS-12A-T-GRP
      * - bTGrp12                        COBOL Name: WS-12B-T-GRP
      * - aSGrp13                        COBOL Name: WS-13A-S-GRP
      * - aTGrp13                        COBOL Name: WS-13A-T-GRP
      * - bSGrp13                        COBOL Name: WS-13B-S-GRP
      * - bTGrp13                        COBOL Name: WS-13B-T-GRP
      * - aSGrp14                        COBOL Name: WS-14A-S-GRP
      * - aTGrp14                        COBOL Name: WS-14A-T-GRP
      * - bSGrp14                        COBOL Name: WS-14B-S-GRP
      * - bTGrp14                        COBOL Name: WS-14B-T-GRP
      * - aSGrp15                        COBOL Name: WS-15A-S-GRP
      * - bSGrp15                        COBOL Name: WS-15B-S-GRP
      * - aSGrp16                        COBOL Name: WS-16A-S-GRP
      * - bSGrp16                        COBOL Name: WS-16B-S-GRP
      * - aTGrp17                        COBOL Name: WS-17A-T-GRP
      * - bTGrp17                        COBOL Name: WS-17B-T-GRP
      * - aTGrp18                        COBOL Name: WS-18A-T-GRP
      * - bTGrp18                        COBOL Name: WS-18B-T-GRP
      * - aTGrp19                        COBOL Name: WS-19A-T-GRP
      * - bTGrp19                        COBOL Name: WS-19B-T-GRP
      * - aTGrp20                        COBOL Name: WS-20A-T-GRP
      * - bTGrp20                        COBOL Name: WS-20B-T-GRP
      * - wse5aSGrp                      COBOL Name: WSE-5A-S-GRP
      * - wse5bSGrp                      COBOL Name: WSE-5B-S-GRP
      * - wse6aSGrp                      COBOL Name: WSE-6A-S-GRP
      * - wse6bSGrp                      COBOL Name: WSE-6B-S-GRP
      * - wse7aTGrp                      COBOL Name: WSE-7A-T-GRP
      * - wse7bTGrp                      COBOL Name: WSE-7B-T-GRP
      * - wse8aTGrp                      COBOL Name: WSE-8A-T-GRP
      * - wse8bTGrp                      COBOL Name: WSE-8B-T-GRP
      * - wse9aSGrp                      COBOL Name: WSE-9A-S-GRP
      * - wse9aTGrp                      COBOL Name: WSE-9A-T-GRP
      * - wse9bSGrp                      COBOL Name: WSE-9B-S-GRP
      * - wse9bTGrp                      COBOL Name: WSE-9B-T-GRP
      * - wse10aSGrp                     COBOL Name: WSE-10A-S-GRP
      * - wse10aTGrp                     COBOL Name: WSE-10A-T-GRP
      * - wse10bSGrp                     COBOL Name: WSE-10B-S-GRP
      * - wse10bTGrp                     COBOL Name: WSE-10B-T-GRP
      * - wse11aTGrp                     COBOL Name: WSE-11A-T-GRP
      * - wse11bTGrp                     COBOL Name: WSE-11B-T-GRP
      * - wse12aTGrp                     COBOL Name: WSE-12A-T-GRP
      * - wse12bTGrp                     COBOL Name: WSE-12B-T-GRP
      * - wse13aSGrp                     COBOL Name: WSE-13A-S-GRP
      * - wse13aTGrp                     COBOL Name: WSE-13A-T-GRP
      * - wse13bSGrp                     COBOL Name: WSE-13B-S-GRP
      * - wse13bTGrp                     COBOL Name: WSE-13B-T-GRP
      * - wse14aSGrp                     COBOL Name: WSE-14A-S-GRP
      * - wse14aTGrp                     COBOL Name: WSE-14A-T-GRP
      * - wse14bSGrp                     COBOL Name: WSE-14B-S-GRP
      * - wse14bTGrp                     COBOL Name: WSE-14B-T-GRP
      * - wse15aSGrp                     COBOL Name: WSE-15A-S-GRP
      * - wse15bSGrp                     COBOL Name: WSE-15B-S-GRP
      * - wse16aSGrp                     COBOL Name: WSE-16A-S-GRP
      * - wse16bSGrp                     COBOL Name: WSE-16B-S-GRP
      * - wse17aTGrp                     COBOL Name: WSE-17A-T-GRP
      * - wse17bTGrp                     COBOL Name: WSE-17B-T-GRP
      * - wse18aTGrp                     COBOL Name: WSE-18A-T-GRP
      * - wse18bTGrp                     COBOL Name: WSE-18B-T-GRP
      * - wse19aTGrp                     COBOL Name: WSE-19A-T-GRP
      * - wse19bTGrp                     COBOL Name: WSE-19B-T-GRP
      * - wse20aTGrp                     COBOL Name: WSE-20A-T-GRP
      * - wse20bTGrp                     COBOL Name: WSE-20B-T-GRP
      * - aS1                            COBOL Name: WS-1A-S
      * - aT1                            COBOL Name: WS-1A-T
      * - aSFld11                        COBOL Name: WS-1A-S-FLD1
      * - aSFld21                        COBOL Name: WS-1A-S-FLD2
      * - aTFld11                        COBOL Name: WS-1A-T-FLD1
      * - aTFld21                        COBOL Name: WS-1A-T-FLD2
      * - sLen                           COBOL Name: WS-S-LEN
      * - tLen                           COBOL Name: WS-T-LEN
      * - bS1                            COBOL Name: WS-1B-S
      * - bT1                            COBOL Name: WS-1B-T
      * - bSFld11                        COBOL Name: WS-1B-S-FLD1
      * - bSFld21                        COBOL Name: WS-1B-S-FLD2
      * - bTFld31                        COBOL Name: WS-1B-T-FLD3
      * - bTFld11                        COBOL Name: WS-1B-T-FLD1
      * - bTFld21                        COBOL Name: WS-1B-T-FLD2
      *
      * @throws CFException
      */
      @Override
      public MainlineSplit0OutCtx mainlineSplit0(MainlineSplit0InCtx methodIn) throws Exception {
Refmod1Ctx programCtx = methodIn.getRefmod1Ctx();
MainlineSplit0OutCtx methodOut = methodIn.getMainlineSplit0OutCtx();
//  MOVE ALL '*' TO WS-5A-S-GRP WS-5B-S-GRP WS-6A-S-GRP WS-6B-S-GRP WS-7A-T-GRP WS-7B-T-GRP WS-8A-T-GRP WS-8B-T-GRP WS-9A-S-GRP WS-9A-T-GRP WS-9B-S-GRP WS-9B-T-GRP WS-10A-S-GRP WS-10A-T-GRP WS-10B-S-GRP WS-10B-T-GRP WS-11A-T-GRP WS-11B-T-GRP WS-12A-T-GRP WS-12B-T-GRP WS-13A-S-GRP WS-13A-T-GRP WS-13B-S-GRP WS-13B-T-GRP WS-14A-S-GRP WS-14A-T-GRP WS-14B-S-GRP WS-14B-T-GRP WS-15A-S-GRP WS-15B-S-GRP WS-16A-S-GRP WS-16B-S-GRP WS-17A-T-GRP WS-17B-T-GRP WS-18A-T-GRP WS-18B-T-GRP WS-19A-T-GRP WS-19B-T-GRP WS-20A-T-GRP WS-20B-T-GRP
          methodOut.getASGrp5().setString(CONSTANTS.LITERAL_897270192);
          methodOut.getBSGrp5().setString(CONSTANTS.LITERAL_897270192);
          methodOut.getASGrp6().setString(CONSTANTS.LITERAL_897270192);
          methodOut.getBSGrp6().setString(CONSTANTS.LITERAL_897270192);
          methodOut.setATGrp7(CONSTANTS.LITERAL_2022809837);
          methodOut.setBTGrp7(CONSTANTS.LITERAL_1988861456);
          methodOut.setATGrp8(CONSTANTS.LITERAL_2022809837);
          methodOut.setBTGrp8(CONSTANTS.LITERAL_1988861456);
          methodOut.getASGrp9().setString(CONSTANTS.LITERAL_897270192);
          methodOut.setATGrp9(CONSTANTS.LITERAL_2022809837);
          methodOut.getBSGrp9().setString(CONSTANTS.LITERAL_897270192);
          methodOut.setBTGrp9(CONSTANTS.LITERAL_1988861456);
          methodOut.getASGrp10().setString(CONSTANTS.LITERAL_897270192);
          methodOut.setATGrp10(CONSTANTS.LITERAL_2022809837);
          methodOut.getBSGrp10().setString(CONSTANTS.LITERAL_897270192);
          methodOut.setBTGrp10(CONSTANTS.LITERAL_1988861456);
          methodOut.setATGrp11(CONSTANTS.LITERAL_2022809837);
          methodOut.setBTGrp11(CONSTANTS.LITERAL_1988861456);
          methodOut.setATGrp12(CONSTANTS.LITERAL_2022809837);
          methodOut.setBTGrp12(CONSTANTS.LITERAL_1988861456);
          methodOut.getASGrp13().setString(CONSTANTS.LITERAL_897270192);
          methodOut.setATGrp13(CONSTANTS.LITERAL_2022809837);
          methodOut.getBSGrp13().setString(CONSTANTS.LITERAL_897270192);
          methodOut.setBTGrp13(CONSTANTS.LITERAL_1988861456);
          methodOut.getASGrp14().setString(CONSTANTS.LITERAL_897270192);
          methodOut.setATGrp14(CONSTANTS.LITERAL_2022809837);
          methodOut.getBSGrp14().setString(CONSTANTS.LITERAL_897270192);
          methodOut.setBTGrp14(CONSTANTS.LITERAL_1988861456);
          methodOut.getASGrp15().setString(CONSTANTS.LITERAL_897270192);
          methodOut.getBSGrp15().setString(CONSTANTS.LITERAL_897270192);
          methodOut.getASGrp16().setString(CONSTANTS.LITERAL_897270192);
          methodOut.getBSGrp16().setString(CONSTANTS.LITERAL_897270192);
          methodOut.setATGrp17(CONSTANTS.LITERAL_2022809837);
          methodOut.setBTGrp17(CONSTANTS.LITERAL_1988861456);
          methodOut.setATGrp18(CONSTANTS.LITERAL_2022809837);
          methodOut.setBTGrp18(CONSTANTS.LITERAL_1988861456);
          methodOut.setATGrp19(CONSTANTS.LITERAL_2022809837);
          methodOut.setBTGrp19(CONSTANTS.LITERAL_1988861456);
          methodOut.setATGrp20(CONSTANTS.LITERAL_2022809837);
          methodOut.setBTGrp20(CONSTANTS.LITERAL_1988861456);
//  MOVE ALL '*' TO WSE-5A-S-GRP WSE-5B-S-GRP WSE-6A-S-GRP WSE-6B-S-GRP WSE-7A-T-GRP WSE-7B-T-GRP WSE-8A-T-GRP WSE-8B-T-GRP WSE-9A-S-GRP WSE-9A-T-GRP WSE-9B-S-GRP WSE-9B-T-GRP WSE-10A-S-GRP WSE-10A-T-GRP WSE-10B-S-GRP WSE-10B-T-GRP WSE-11A-T-GRP WSE-11B-T-GRP WSE-12A-T-GRP WSE-12B-T-GRP WSE-13A-S-GRP WSE-13A-T-GRP WSE-13B-S-GRP WSE-13B-T-GRP WSE-14A-S-GRP WSE-14A-T-GRP WSE-14B-S-GRP WSE-14B-T-GRP WSE-15A-S-GRP WSE-15B-S-GRP WSE-16A-S-GRP WSE-16B-S-GRP WSE-17A-T-GRP WSE-17B-T-GRP WSE-18A-T-GRP WSE-18B-T-GRP WSE-19A-T-GRP WSE-19B-T-GRP WSE-20A-T-GRP WSE-20B-T-GRP
          methodOut.getWse5aSGrp().setString(CONSTANTS.LITERAL_885954065);
          methodOut.getWse5bSGrp().setString(CONSTANTS.LITERAL_885954065);
          methodOut.getWse6aSGrp().setString(CONSTANTS.LITERAL_885954065);
          methodOut.getWse6bSGrp().setString(CONSTANTS.LITERAL_885954065);
          methodOut.setWse7aTGrp(CONSTANTS.LITERAL_2022809837);
          methodOut.setWse7bTGrp(CONSTANTS.LITERAL_2022809837);
          methodOut.setWse8aTGrp(CONSTANTS.LITERAL_2022809837);
          methodOut.setWse8bTGrp(CONSTANTS.LITERAL_2022809837);
          methodOut.getWse9aSGrp().setString(CONSTANTS.LITERAL_885954065);
          methodOut.setWse9aTGrp(CONSTANTS.LITERAL_2022809837);
          methodOut.getWse9bSGrp().setString(CONSTANTS.LITERAL_885954065);
          methodOut.setWse9bTGrp(CONSTANTS.LITERAL_2022809837);
          methodOut.getWse10aSGrp().setString(CONSTANTS.LITERAL_885954065);
          methodOut.setWse10aTGrp(CONSTANTS.LITERAL_2022809837);
          methodOut.getWse10bSGrp().setString(CONSTANTS.LITERAL_885954065);
          methodOut.setWse10bTGrp(CONSTANTS.LITERAL_2022809837);
          methodOut.setWse11aTGrp(CONSTANTS.LITERAL_2022809837);
          methodOut.setWse11bTGrp(CONSTANTS.LITERAL_2022809837);
          methodOut.setWse12aTGrp(CONSTANTS.LITERAL_2022809837);
          methodOut.setWse12bTGrp(CONSTANTS.LITERAL_2022809837);
          methodOut.getWse13aSGrp().setString(CONSTANTS.LITERAL_885954065);
          methodOut.setWse13aTGrp(CONSTANTS.LITERAL_2022809837);
          methodOut.getWse13bSGrp().setString(CONSTANTS.LITERAL_885954065);
          methodOut.setWse13bTGrp(CONSTANTS.LITERAL_2022809837);
          methodOut.getWse14aSGrp().setString(CONSTANTS.LITERAL_885954065);
          methodOut.setWse14aTGrp(CONSTANTS.LITERAL_2022809837);
          methodOut.getWse14bSGrp().setString(CONSTANTS.LITERAL_885954065);
          methodOut.setWse14bTGrp(CONSTANTS.LITERAL_2022809837);
          methodOut.getWse15aSGrp().setString(CONSTANTS.LITERAL_885954065);
          methodOut.getWse15bSGrp().setString(CONSTANTS.LITERAL_885954065);
          methodOut.getWse16aSGrp().setString(CONSTANTS.LITERAL_885954065);
          methodOut.getWse16bSGrp().setString(CONSTANTS.LITERAL_885954065);
          methodOut.setWse17aTGrp(CONSTANTS.LITERAL_2022809837);
          methodOut.setWse17bTGrp(CONSTANTS.LITERAL_2022809837);
          methodOut.setWse18aTGrp(CONSTANTS.LITERAL_2022809837);
          methodOut.setWse18bTGrp(CONSTANTS.LITERAL_2022809837);
          methodOut.setWse19aTGrp(CONSTANTS.LITERAL_2022809837);
          methodOut.setWse19bTGrp(CONSTANTS.LITERAL_2022809837);
          methodOut.setWse20aTGrp(CONSTANTS.LITERAL_2022809837);
          methodOut.setWse20bTGrp(CONSTANTS.LITERAL_2022809837);

// *
// * Src -> group; tgt -> group ; src bigger than tgt
// *
//  INITIALIZE WS-1A-S WS-1A-T
          methodOut.getAS1().initialize();
          methodOut.getAT1().initialize();
//  MOVE ALL 'ABCD' TO WS-1A-S-FLD1
          methodOut.setASFld11(CONSTANTS.LITERAL_ABCDABCDABCDABCDABCDABCDABCDABCD);
//  MOVE ALL 'ZYXW' TO WS-1A-S-FLD2
          methodOut.setASFld21(CONSTANTS.LITERAL_645286444);
//  MOVE WS-1A-S ( 1 : LENGTH OF WS-1A-S ) TO WS-1A-T ( 1 : LENGTH OF WS-1A-T )
          methodOut.setAT1(replace(methodOut.getAT1().toCharArray(),substring(methodOut.getAS1().getCharArray(),0,AS1.getAS1FieldLength()),0,AT1.getAT1FieldLength()));

// *
//  DISPLAY '*   1* WS-1A-S         = (' WS-1A-S ')'
          logger.info("*   1* WS-1A-S         = ({})", methodOut.getAS1().toString()); 
//  DISPLAY '*   2*   WS-1A-S-FLD1  = (' WS-1A-S-FLD1 ')'
          logger.info("*   2*   WS-1A-S-FLD1  = ({})", new String(methodOut.getASFld11())); 
//  DISPLAY '*   3*   WS-1A-S-FLD2  = (' WS-1A-S-FLD2 ')'
          logger.info("*   3*   WS-1A-S-FLD2  = ({})", new String(methodOut.getASFld21())); 
//  DISPLAY '*   4* WS-1A-T-R       = (' WS-1A-T-R ')'
          logger.info("*   4* WS-1A-T-R       = ({})", new String(methodIn.getATR1())); 
//  DISPLAY '*   5* WS-1A-T         = (' WS-1A-T ')'
          logger.info("*   5* WS-1A-T         = ({})", methodOut.getAT1().toString()); 
//  DISPLAY '*   6*   WS-1A-T-FLD1  = (' WS-1A-T-FLD1 ')'
          logger.info("*   6*   WS-1A-T-FLD1  = ({})", new String(methodOut.getATFld11())); 
//  DISPLAY '*   7*   WS-1A-T-FLD2  = (' WS-1A-T-FLD2 ')'
          logger.info("*   7*   WS-1A-T-FLD2  = ({})", new String(methodOut.getATFld21())); 

// *
//  INITIALIZE WS-1A-S WS-1A-T
          methodOut.getAS1().initialize();
          methodOut.getAT1().initialize();
//  MOVE ALL 'ABCD' TO WS-1A-S-FLD1
          methodOut.setASFld11(CONSTANTS.LITERAL_ABCDABCDABCDABCDABCDABCDABCDABCD);
//  MOVE ALL 'ZYXW' TO WS-1A-S-FLD2
          methodOut.setASFld21(CONSTANTS.LITERAL_645286444);
//  MOVE LENGTH OF WS-1A-S TO WS-S-LEN
          methodOut.setSLen((short) AS1.getAS1FieldLength());
//  MOVE LENGTH OF WS-1A-T TO WS-T-LEN
          methodOut.setTLen((short) AT1.getAT1FieldLength());
//  MOVE WS-1A-S ( 1 : WS-S-LEN ) TO WS-1A-T ( 1 : WS-T-LEN )
          methodOut.setAT1(replace(methodOut.getAT1().toCharArray(),substring(methodOut.getAS1().getCharArray(),0,methodOut.getSLen()),0,methodOut.getTLen()));

// *
//  DISPLAY '*   8* WS-1A-S         = (' WS-1A-S ')'
          logger.info("*   8* WS-1A-S         = ({})", methodOut.getAS1().toString()); 
//  DISPLAY '*   9*   WS-1A-S-FLD1  = (' WS-1A-S-FLD1 ')'
          logger.info("*   9*   WS-1A-S-FLD1  = ({})", new String(methodOut.getASFld11())); 
//  DISPLAY '*  10*   WS-1A-S-FLD2  = (' WS-1A-S-FLD2 ')'
          logger.info("*  10*   WS-1A-S-FLD2  = ({})", new String(methodOut.getASFld21())); 
//  DISPLAY '*  11* WS-1A-T-R       = (' WS-1A-T-R ')'
          logger.info("*  11* WS-1A-T-R       = ({})", new String(methodIn.getATR1())); 
//  DISPLAY '*  12* WS-1A-T         = (' WS-1A-T ')'
          logger.info("*  12* WS-1A-T         = ({})", methodOut.getAT1().toString()); 
//  DISPLAY '*  13*   WS-1A-T-FLD1  = (' WS-1A-T-FLD1 ')'
          logger.info("*  13*   WS-1A-T-FLD1  = ({})", new String(methodOut.getATFld11())); 
//  DISPLAY '*  14*   WS-1A-T-FLD2  = (' WS-1A-T-FLD2 ')'
          logger.info("*  14*   WS-1A-T-FLD2  = ({})", new String(methodOut.getATFld21())); 

// *
// * Src -> group; tgt -> group ; src smaller than tgt
// *
//  INITIALIZE WS-1B-S WS-1B-T
          methodOut.getBS1().initialize();
          methodOut.getBT1().initialize();
//  MOVE ALL 'ABCD' TO WS-1B-S-FLD1
          methodOut.setBSFld11(CONSTANTS.LITERAL_ABCDABCDABCDABCDABCDABCDABCDABCD);
//  MOVE ALL 'ZYXW' TO WS-1B-S-FLD2
          methodOut.setBSFld21(CONSTANTS.LITERAL_645286444);
//  MOVE ALL 'MNOP' TO WS-1B-T-FLD3
          methodOut.setBTFld31(CONSTANTS.LITERAL_MNOPMNOPMNOPMNOPMNOPMNOPMNOPMNOP);
//  MOVE WS-1B-S ( 1 : LENGTH OF WS-1B-S ) TO WS-1B-T ( 1 : LENGTH OF WS-1B-T )
          methodOut.setBT1(replace(methodOut.getBT1().toCharArray(),substring(methodOut.getBS1().getCharArray(),0,BS1.getBS1FieldLength()),0,BT1.getBT1FieldLength()));

// *
//  DISPLAY '*  15* WS-1B-S         = (' WS-1B-S ')'
          logger.info("*  15* WS-1B-S         = ({})", methodOut.getBS1().toString()); 
//  DISPLAY '*  16*   WS-1B-S-FLD1  = (' WS-1B-S-FLD1 ')'
          logger.info("*  16*   WS-1B-S-FLD1  = ({})", new String(methodOut.getBSFld11())); 
//  DISPLAY '*  17*   WS-1B-S-FLD2  = (' WS-1B-S-FLD2 ')'
          logger.info("*  17*   WS-1B-S-FLD2  = ({})", new String(methodOut.getBSFld21())); 
//  DISPLAY '*  18* WS-1B-T-R       = (' WS-1B-T-R ')'
          logger.info("*  18* WS-1B-T-R       = ({})", new String(methodIn.getBTR1())); 
//  DISPLAY '*  19* WS-1B-T         = (' WS-1B-T ')'
          logger.info("*  19* WS-1B-T         = ({})", methodOut.getBT1().toString()); 
//  DISPLAY '*  20*   WS-1B-T-FLD1  = (' WS-1B-T-FLD1 ')'
          logger.info("*  20*   WS-1B-T-FLD1  = ({})", new String(methodOut.getBTFld11())); 
//  DISPLAY '*  21*   WS-1B-T-FLD2  = (' WS-1B-T-FLD2 ')'
          logger.info("*  21*   WS-1B-T-FLD2  = ({})", new String(methodOut.getBTFld21())); 
//  DISPLAY '*  22*   WS-1B-T-FLD3  = (' WS-1B-T-FLD3 ')'
          logger.info("*  22*   WS-1B-T-FLD3  = ({})", new String(methodOut.getBTFld31())); 

// *
//  INITIALIZE WS-1B-S WS-1B-T
          methodOut.getBS1().initialize();
          methodOut.getBT1().initialize();
//  MOVE ALL 'ABCD' TO WS-1B-S-FLD1
          methodOut.setBSFld11(CONSTANTS.LITERAL_ABCDABCDABCDABCDABCDABCDABCDABCD);
//  MOVE ALL 'ZYXW' TO WS-1B-S-FLD2
          methodOut.setBSFld21(CONSTANTS.LITERAL_645286444);
//  MOVE ALL 'MNOP' TO WS-1B-T-FLD3
          methodOut.setBTFld31(CONSTANTS.LITERAL_MNOPMNOPMNOPMNOPMNOPMNOPMNOPMNOP);
//  MOVE LENGTH OF WS-1B-S TO WS-S-LEN
          methodOut.setSLen((short) BS1.getBS1FieldLength());
//  MOVE LENGTH OF WS-1B-T TO WS-T-LEN
          methodOut.setTLen((short) BT1.getBT1FieldLength());
//  MOVE WS-1B-S ( 1 : WS-S-LEN ) TO WS-1B-T ( 1 : WS-T-LEN )
          methodOut.setBT1(replace(methodOut.getBT1().toCharArray(),substring(methodOut.getBS1().getCharArray(),0,methodOut.getSLen()),0,methodOut.getTLen()));

// *
//  DISPLAY '*  23* WS-1B-S         = (' WS-1B-S ')'
          logger.info("*  23* WS-1B-S         = ({})", methodOut.getBS1().toString()); 
//  DISPLAY '*  24*   WS-1B-S-FLD1  = (' WS-1B-S-FLD1 ')'
          logger.info("*  24*   WS-1B-S-FLD1  = ({})", new String(methodOut.getBSFld11())); 
//  DISPLAY '*  25*   WS-1B-S-FLD2  = (' WS-1B-S-FLD2 ')'
          logger.info("*  25*   WS-1B-S-FLD2  = ({})", new String(methodOut.getBSFld21())); 
//  DISPLAY '*  26* WS-1B-T-R       = (' WS-1B-T-R ')'
          logger.info("*  26* WS-1B-T-R       = ({})", new String(methodIn.getBTR1())); 
//  DISPLAY '*  27* WS-1B-T         = (' WS-1B-T ')'
          logger.info("*  27* WS-1B-T         = ({})", methodOut.getBT1().toString()); 
      
      return methodOut;
      }
      /**
      * mainlineSplit1 
      *   This method is derived from 
  *   COBOL Paragraph - MAINLINE-SPLIT1 COBOL Cyclomatic complexity - 1
      * Input  :  

      * - bTFld11                        COBOL Name: WS-1B-T-FLD1
      * - bTFld21                        COBOL Name: WS-1B-T-FLD2
      * - bTFld31                        COBOL Name: WS-1B-T-FLD3
      * - aTR2                           COBOL Name: WS-2A-T-R
      * - bTR2                           COBOL Name: WS-2B-T-R
      * - aTR3                           COBOL Name: WS-3A-T-R
      *
      * Output :  

      * - aS2                            COBOL Name: WS-2A-S
      * - aT2                            COBOL Name: WS-2A-T
      * - aTFld12                        COBOL Name: WS-2A-T-FLD1
      * - aTFld22                        COBOL Name: WS-2A-T-FLD2
      * - sLen                           COBOL Name: WS-S-LEN
      * - tLen                           COBOL Name: WS-T-LEN
      * - bS2                            COBOL Name: WS-2B-S
      * - bT2                            COBOL Name: WS-2B-T
      * - bTFld32                        COBOL Name: WS-2B-T-FLD3
      * - bTFld12                        COBOL Name: WS-2B-T-FLD1
      * - bTFld22                        COBOL Name: WS-2B-T-FLD2
      * - aS3                            COBOL Name: WS-3A-S
      * - aT3                            COBOL Name: WS-3A-T
      * - aSFld13                        COBOL Name: WS-3A-S-FLD1
      * - aSFld23                        COBOL Name: WS-3A-S-FLD2
      *
      * @throws CFException
      */
      @Override
      public MainlineSplit1OutCtx mainlineSplit1(MainlineSplit1InCtx methodIn) throws Exception {
			// Declare local variables used in the method
			 final int A_S_2_LENGTH = 70;
			 final int B_S_2_LENGTH = 70;
			// End of variable declaration

Refmod1Ctx programCtx = methodIn.getRefmod1Ctx();
MainlineSplit1OutCtx methodOut = methodIn.getMainlineSplit1OutCtx();
//  DISPLAY '*  28*   WS-1B-T-FLD1  = (' WS-1B-T-FLD1 ')'
          logger.info("*  28*   WS-1B-T-FLD1  = ({})", new String(methodIn.getBTFld11())); 
//  DISPLAY '*  29*   WS-1B-T-FLD2  = (' WS-1B-T-FLD2 ')'
          logger.info("*  29*   WS-1B-T-FLD2  = ({})", new String(methodIn.getBTFld21())); 
//  DISPLAY '*  30*   WS-1B-T-FLD3  = (' WS-1B-T-FLD3 ')'
          logger.info("*  30*   WS-1B-T-FLD3  = ({})", new String(methodIn.getBTFld31())); 

// *
// * Src -> string; tgt -> group ; src bigger than tgt
// *
//  INITIALIZE WS-2A-S WS-2A-T
          methodOut.setAS2(CONSTANTS.SPACE_70 /* Fill 70 Spaces*/);
          methodOut.getAT2().initialize();
          // MOVE ALL 'ABCD' TO WS-2A-S
          methodOut.setAS2(CONSTANTS.LITERAL_1222519919);
//  MOVE WS-2A-S ( 1 : LENGTH OF WS-2A-S ) TO WS-2A-T ( 1 : LENGTH OF WS-2A-T )
          methodOut.setAT2(methodOut.getAS2(),0/* aS2 */ ,A_S_2_LENGTH,0,AT2.getAT2FieldLength() /* field,sourceIndex,sourceLen,targetIndex,targetLen */);

// *
//  DISPLAY '*  31* WS-2A-S         = (' WS-2A-S ')'
          logger.info("*  31* WS-2A-S         = ({})", new String(methodOut.getAS2())); 
//  DISPLAY '*  32* WS-2A-T-R       = (' WS-2A-T-R ')'
          logger.info("*  32* WS-2A-T-R       = ({})", new String(methodIn.getATR2())); 
//  DISPLAY '*  33* WS-2A-T         = (' WS-2A-T ')'
          logger.info("*  33* WS-2A-T         = ({})", methodOut.getAT2().toString()); 
//  DISPLAY '*  34*   WS-2A-T-FLD1  = (' WS-2A-T-FLD1 ')'
          logger.info("*  34*   WS-2A-T-FLD1  = ({})", new String(methodOut.getATFld12())); 
//  DISPLAY '*  35*   WS-2A-T-FLD2  = (' WS-2A-T-FLD2 ')'
          logger.info("*  35*   WS-2A-T-FLD2  = ({})", new String(methodOut.getATFld22())); 

// *
//  INITIALIZE WS-2A-S WS-2A-T
          methodOut.setAS2(CONSTANTS.SPACE_70 /* Fill 70 Spaces*/);
          methodOut.getAT2().initialize();
          // MOVE ALL 'ABCD' TO WS-2A-S
          methodOut.setAS2(CONSTANTS.LITERAL_1222519919);
//  MOVE LENGTH OF WS-2A-S TO WS-S-LEN
          methodOut.setSLen((short) A_S_2_LENGTH);
//  MOVE LENGTH OF WS-2A-T TO WS-T-LEN
          methodOut.setTLen((short) AT2.getAT2FieldLength());
//  MOVE WS-2A-S ( 1 : WS-S-LEN ) TO WS-2A-T ( 1 : WS-T-LEN )
          methodOut.setAT2(methodOut.getAS2(),0/* aS2 */ ,methodOut.getSLen(),0,methodOut.getTLen() /* field,sourceIndex,sourceLen,targetIndex,targetLen */);

// *
//  DISPLAY '*  36* WS-2A-S         = (' WS-2A-S ')'
          logger.info("*  36* WS-2A-S         = ({})", new String(methodOut.getAS2())); 
//  DISPLAY '*  37* WS-2A-T-R       = (' WS-2A-T-R ')'
          logger.info("*  37* WS-2A-T-R       = ({})", new String(methodIn.getATR2())); 
//  DISPLAY '*  38* WS-2A-T         = (' WS-2A-T ')'
          logger.info("*  38* WS-2A-T         = ({})", methodOut.getAT2().toString()); 
//  DISPLAY '*  39*   WS-2A-T-FLD1  = (' WS-2A-T-FLD1 ')'
          logger.info("*  39*   WS-2A-T-FLD1  = ({})", new String(methodOut.getATFld12())); 
//  DISPLAY '*  40*   WS-2A-T-FLD2  = (' WS-2A-T-FLD2 ')'
          logger.info("*  40*   WS-2A-T-FLD2  = ({})", new String(methodOut.getATFld22())); 

// *
// * Src -> string; tgt -> group ; src smaller than tgt
// *
//  INITIALIZE WS-2B-S WS-2B-T
          methodOut.setBS2(CONSTANTS.SPACE_70 /* Fill 70 Spaces*/);
          methodOut.getBT2().initialize();
          // MOVE ALL 'ABCD' TO WS-2B-S
          methodOut.setBS2(CONSTANTS.LITERAL_1222519919);
//  MOVE ALL 'MNOP' TO WS-2B-T-FLD3
          methodOut.setBTFld32(CONSTANTS.LITERAL_MNOPMNOPMNOPMNOPMNOPMNOPMNOPMNOP);
//  MOVE WS-2B-S ( 1 : LENGTH OF WS-2B-S ) TO WS-2B-T ( 1 : LENGTH OF WS-2B-T )
          methodOut.setBT2(methodOut.getBS2(),0/* bS2 */ ,B_S_2_LENGTH,0,BT2.getBT2FieldLength() /* field,sourceIndex,sourceLen,targetIndex,targetLen */);

// *
//  DISPLAY '*  41* WS-2B-S         = (' WS-2B-S ')'
          logger.info("*  41* WS-2B-S         = ({})", new String(methodOut.getBS2())); 
//  DISPLAY '*  42* WS-2B-T-R       = (' WS-2B-T-R ')'
          logger.info("*  42* WS-2B-T-R       = ({})", new String(methodIn.getBTR2())); 
//  DISPLAY '*  43* WS-2B-T         = (' WS-2B-T ')'
          logger.info("*  43* WS-2B-T         = ({})", methodOut.getBT2().toString()); 
//  DISPLAY '*  44*   WS-2B-T-FLD1  = (' WS-2B-T-FLD1 ')'
          logger.info("*  44*   WS-2B-T-FLD1  = ({})", new String(methodOut.getBTFld12())); 
//  DISPLAY '*  45*   WS-2B-T-FLD2  = (' WS-2B-T-FLD2 ')'
          logger.info("*  45*   WS-2B-T-FLD2  = ({})", new String(methodOut.getBTFld22())); 
//  DISPLAY '*  46*   WS-2B-T-FLD3  = (' WS-2B-T-FLD3 ')'
          logger.info("*  46*   WS-2B-T-FLD3  = ({})", new String(methodOut.getBTFld32())); 

// *
//  INITIALIZE WS-2B-S WS-2B-T
          methodOut.setBS2(CONSTANTS.SPACE_70 /* Fill 70 Spaces*/);
          methodOut.getBT2().initialize();
          // MOVE ALL 'ABCD' TO WS-2B-S
          methodOut.setBS2(CONSTANTS.LITERAL_1222519919);
//  MOVE ALL 'MNOP' TO WS-2B-T-FLD3
          methodOut.setBTFld32(CONSTANTS.LITERAL_MNOPMNOPMNOPMNOPMNOPMNOPMNOPMNOP);
//  MOVE LENGTH OF WS-2B-S TO WS-S-LEN
          methodOut.setSLen((short) B_S_2_LENGTH);
//  MOVE LENGTH OF WS-2B-T TO WS-T-LEN
          methodOut.setTLen((short) BT2.getBT2FieldLength());
//  MOVE WS-2B-S ( 1 : WS-S-LEN ) TO WS-2B-T ( 1 : WS-T-LEN )
          methodOut.setBT2(methodOut.getBS2(),0/* bS2 */ ,methodOut.getSLen(),0,methodOut.getTLen() /* field,sourceIndex,sourceLen,targetIndex,targetLen */);

// *
//  DISPLAY '*  47* WS-2B-S         = (' WS-2B-S ')'
          logger.info("*  47* WS-2B-S         = ({})", new String(methodOut.getBS2())); 
//  DISPLAY '*  48* WS-2B-T-R       = (' WS-2B-T-R ')'
          logger.info("*  48* WS-2B-T-R       = ({})", new String(methodIn.getBTR2())); 
//  DISPLAY '*  49* WS-2B-T         = (' WS-2B-T ')'
          logger.info("*  49* WS-2B-T         = ({})", methodOut.getBT2().toString()); 
//  DISPLAY '*  50*   WS-2B-T-FLD1  = (' WS-2B-T-FLD1 ')'
          logger.info("*  50*   WS-2B-T-FLD1  = ({})", new String(methodOut.getBTFld12())); 
//  DISPLAY '*  51*   WS-2B-T-FLD2  = (' WS-2B-T-FLD2 ')'
          logger.info("*  51*   WS-2B-T-FLD2  = ({})", new String(methodOut.getBTFld22())); 
//  DISPLAY '*  52*   WS-2B-T-FLD3  = (' WS-2B-T-FLD3 ')'
          logger.info("*  52*   WS-2B-T-FLD3  = ({})", new String(methodOut.getBTFld32())); 

// *
// * Src -> group; tgt -> group ; src bigger than tgt
// *
//  INITIALIZE WS-3A-S WS-3A-T
          methodOut.getAS3().initialize();
          methodOut.getAT3().initialize();
//  MOVE ALL 'ABCD' TO WS-3A-S-FLD1
          methodOut.setASFld13(CONSTANTS.LITERAL_ABCDABCDABCDABCDABCDABCDABCDABCD);
//  MOVE ALL 'ZYXW' TO WS-3A-S-FLD2
          methodOut.setASFld23(CONSTANTS.LITERAL_645286444);
//  MOVE WS-3A-S TO WS-3A-T ( 1 : LENGTH OF WS-3A-T )
          methodOut.setAT3(replace(methodOut.getAT3().toCharArray(),methodOut.getAS3().toCharArray(),0,AT3.getAT3FieldLength()));

// *
//  DISPLAY '*  53* WS-3A-S         = (' WS-3A-S ')'
          logger.info("*  53* WS-3A-S         = ({})", methodOut.getAS3().toString()); 
//  DISPLAY '*  54*   WS-3A-S-FLD1  = (' WS-3A-S-FLD1 ')'
          logger.info("*  54*   WS-3A-S-FLD1  = ({})", new String(methodOut.getASFld13())); 
//  DISPLAY '*  55*   WS-3A-S-FLD2  = (' WS-3A-S-FLD2 ')'
          logger.info("*  55*   WS-3A-S-FLD2  = ({})", new String(methodOut.getASFld23())); 
//  DISPLAY '*  56* WS-3A-T-R       = (' WS-3A-T-R ')'
          logger.info("*  56* WS-3A-T-R       = ({})", new String(methodIn.getATR3())); 
      
      return methodOut;
      }
      /**
      * mainlineSplit2 
      *   This method is derived from 
  *   COBOL Paragraph - MAINLINE-SPLIT2 COBOL Cyclomatic complexity - 1
      * Input  :  

      * - aT3                            COBOL Name: WS-3A-T
      * - aTFld13                        COBOL Name: WS-3A-T-FLD1
      * - aTFld23                        COBOL Name: WS-3A-T-FLD2
      * - aTR3                           COBOL Name: WS-3A-T-R
      * - bTR3                           COBOL Name: WS-3B-T-R
      * - aTR4                           COBOL Name: WS-4A-T-R
      *
      * Output :  

      * - aS3                            COBOL Name: WS-3A-S
      * - aT3                            COBOL Name: WS-3A-T
      * - aSFld13                        COBOL Name: WS-3A-S-FLD1
      * - aSFld23                        COBOL Name: WS-3A-S-FLD2
      * - tLen                           COBOL Name: WS-T-LEN
      * - bS3                            COBOL Name: WS-3B-S
      * - bT3                            COBOL Name: WS-3B-T
      * - bSFld13                        COBOL Name: WS-3B-S-FLD1
      * - bSFld23                        COBOL Name: WS-3B-S-FLD2
      * - bTFld33                        COBOL Name: WS-3B-T-FLD3
      * - bTFld13                        COBOL Name: WS-3B-T-FLD1
      * - bTFld23                        COBOL Name: WS-3B-T-FLD2
      * - aS4                            COBOL Name: WS-4A-S
      * - aT4                            COBOL Name: WS-4A-T
      * - aTFld14                        COBOL Name: WS-4A-T-FLD1
      * - aTFld24                        COBOL Name: WS-4A-T-FLD2
      *
      * @throws CFException
      */
      @Override
      public MainlineSplit2OutCtx mainlineSplit2(MainlineSplit2InCtx methodIn) throws Exception {
Refmod1Ctx programCtx = methodIn.getRefmod1Ctx();
MainlineSplit2OutCtx methodOut = methodIn.getMainlineSplit2OutCtx();
//  DISPLAY '*  57* WS-3A-T         = (' WS-3A-T ')'
          logger.info("*  57* WS-3A-T         = ({})", methodOut.getAT3().toString()); 
//  DISPLAY '*  58*   WS-3A-T-FLD1  = (' WS-3A-T-FLD1 ')'
          logger.info("*  58*   WS-3A-T-FLD1  = ({})", new String(methodIn.getATFld13())); 
//  DISPLAY '*  59*   WS-3A-T-FLD2  = (' WS-3A-T-FLD2 ')'
          logger.info("*  59*   WS-3A-T-FLD2  = ({})", new String(methodIn.getATFld23())); 

// *
//  INITIALIZE WS-3A-S WS-3A-T
          methodOut.getAS3().initialize();
          methodOut.getAT3().initialize();
//  MOVE ALL 'ABCD' TO WS-3A-S-FLD1
          methodOut.setASFld13(CONSTANTS.LITERAL_ABCDABCDABCDABCDABCDABCDABCDABCD);
//  MOVE ALL 'ZYXW' TO WS-3A-S-FLD2
          methodOut.setASFld23(CONSTANTS.LITERAL_645286444);
//  MOVE LENGTH OF WS-3A-T TO WS-T-LEN
          methodOut.setTLen((short) AT3.getAT3FieldLength());
//  MOVE WS-3A-S TO WS-3A-T ( 1 : WS-T-LEN )
          methodOut.setAT3(replace(methodOut.getAT3().toCharArray(),methodOut.getAS3().toCharArray(),0,methodOut.getTLen()));

// *
//  DISPLAY '*  60* WS-3A-S         = (' WS-3A-S ')'
          logger.info("*  60* WS-3A-S         = ({})", methodOut.getAS3().toString()); 
//  DISPLAY '*  61*   WS-3A-S-FLD1  = (' WS-3A-S-FLD1 ')'
          logger.info("*  61*   WS-3A-S-FLD1  = ({})", new String(methodOut.getASFld13())); 
//  DISPLAY '*  62*   WS-3A-S-FLD2  = (' WS-3A-S-FLD2 ')'
          logger.info("*  62*   WS-3A-S-FLD2  = ({})", new String(methodOut.getASFld23())); 
//  DISPLAY '*  63* WS-3A-T-R       = (' WS-3A-T-R ')'
          logger.info("*  63* WS-3A-T-R       = ({})", new String(methodIn.getATR3())); 
//  DISPLAY '*  64* WS-3A-T         = (' WS-3A-T ')'
          logger.info("*  64* WS-3A-T         = ({})", methodOut.getAT3().toString()); 
//  DISPLAY '*  65*   WS-3A-T-FLD1  = (' WS-3A-T-FLD1 ')'
          logger.info("*  65*   WS-3A-T-FLD1  = ({})", new String(methodIn.getATFld13())); 
//  DISPLAY '*  66*   WS-3A-T-FLD2  = (' WS-3A-T-FLD2 ')'
          logger.info("*  66*   WS-3A-T-FLD2  = ({})", new String(methodIn.getATFld23())); 

// *
// * Src -> group; tgt -> group ; src smaller than tgt
// *
//  INITIALIZE WS-3B-S WS-3B-T
          methodOut.getBS3().initialize();
          methodOut.getBT3().initialize();
//  MOVE ALL 'ABCD' TO WS-3B-S-FLD1
          methodOut.setBSFld13(CONSTANTS.LITERAL_ABCDABCDABCDABCDABCDABCDABCDABCD);
//  MOVE ALL 'ZYXW' TO WS-3B-S-FLD2
          methodOut.setBSFld23(CONSTANTS.LITERAL_645286444);
//  MOVE ALL 'MNOP' TO WS-3B-T-FLD3
          methodOut.setBTFld33(CONSTANTS.LITERAL_MNOPMNOPMNOPMNOPMNOPMNOPMNOPMNOP);
//  MOVE WS-3B-S TO WS-3B-T ( 1 : LENGTH OF WS-3B-T )
          methodOut.setBT3(replace(methodOut.getBT3().toCharArray(),methodOut.getBS3().toCharArray(),0,BT3.getBT3FieldLength()));

// *
//  DISPLAY '*  67* WS-3B-S         = (' WS-3B-S ')'
          logger.info("*  67* WS-3B-S         = ({})", methodOut.getBS3().toString()); 
//  DISPLAY '*  68*   WS-3B-S-FLD1  = (' WS-3B-S-FLD1 ')'
          logger.info("*  68*   WS-3B-S-FLD1  = ({})", new String(methodOut.getBSFld13())); 
//  DISPLAY '*  69*   WS-3B-S-FLD2  = (' WS-3B-S-FLD2 ')'
          logger.info("*  69*   WS-3B-S-FLD2  = ({})", new String(methodOut.getBSFld23())); 
//  DISPLAY '*  70* WS-3B-T-R       = (' WS-3B-T-R ')'
          logger.info("*  70* WS-3B-T-R       = ({})", new String(methodIn.getBTR3())); 
//  DISPLAY '*  71* WS-3B-T         = (' WS-3B-T ')'
          logger.info("*  71* WS-3B-T         = ({})", methodOut.getBT3().toString()); 
//  DISPLAY '*  72*   WS-3B-T-FLD1  = (' WS-3B-T-FLD1 ')'
          logger.info("*  72*   WS-3B-T-FLD1  = ({})", new String(methodOut.getBTFld13())); 
//  DISPLAY '*  73*   WS-3B-T-FLD2  = (' WS-3B-T-FLD2 ')'
          logger.info("*  73*   WS-3B-T-FLD2  = ({})", new String(methodOut.getBTFld23())); 
//  DISPLAY '*  74*   WS-3B-T-FLD3  = (' WS-3B-T-FLD3 ')'
          logger.info("*  74*   WS-3B-T-FLD3  = ({})", new String(methodOut.getBTFld33())); 

// *
//  INITIALIZE WS-3B-S WS-3B-T
          methodOut.getBS3().initialize();
          methodOut.getBT3().initialize();
//  MOVE ALL 'ABCD' TO WS-3B-S-FLD1
          methodOut.setBSFld13(CONSTANTS.LITERAL_ABCDABCDABCDABCDABCDABCDABCDABCD);
//  MOVE ALL 'ZYXW' TO WS-3B-S-FLD2
          methodOut.setBSFld23(CONSTANTS.LITERAL_645286444);
//  MOVE ALL 'MNOP' TO WS-3B-T-FLD3
          methodOut.setBTFld33(CONSTANTS.LITERAL_MNOPMNOPMNOPMNOPMNOPMNOPMNOPMNOP);
//  MOVE LENGTH OF WS-3B-T TO WS-T-LEN
          methodOut.setTLen((short) BT3.getBT3FieldLength());
//  MOVE WS-3B-S TO WS-3B-T ( 1 : WS-T-LEN )
          methodOut.setBT3(replace(methodOut.getBT3().toCharArray(),methodOut.getBS3().toCharArray(),0,methodOut.getTLen()));

// *
//  DISPLAY '*  75* WS-3B-S         = (' WS-3B-S ')'
          logger.info("*  75* WS-3B-S         = ({})", methodOut.getBS3().toString()); 
//  DISPLAY '*  76*   WS-3B-S-FLD1  = (' WS-3B-S-FLD1 ')'
          logger.info("*  76*   WS-3B-S-FLD1  = ({})", new String(methodOut.getBSFld13())); 
//  DISPLAY '*  77*   WS-3B-S-FLD2  = (' WS-3B-S-FLD2 ')'
          logger.info("*  77*   WS-3B-S-FLD2  = ({})", new String(methodOut.getBSFld23())); 
//  DISPLAY '*  78* WS-3B-T-R       = (' WS-3B-T-R ')'
          logger.info("*  78* WS-3B-T-R       = ({})", new String(methodIn.getBTR3())); 
//  DISPLAY '*  79* WS-3B-T         = (' WS-3B-T ')'
          logger.info("*  79* WS-3B-T         = ({})", methodOut.getBT3().toString()); 
//  DISPLAY '*  80*   WS-3B-T-FLD1  = (' WS-3B-T-FLD1 ')'
          logger.info("*  80*   WS-3B-T-FLD1  = ({})", new String(methodOut.getBTFld13())); 
//  DISPLAY '*  81*   WS-3B-T-FLD2  = (' WS-3B-T-FLD2 ')'
          logger.info("*  81*   WS-3B-T-FLD2  = ({})", new String(methodOut.getBTFld23())); 
//  DISPLAY '*  82*   WS-3B-T-FLD3  = (' WS-3B-T-FLD3 ')'
          logger.info("*  82*   WS-3B-T-FLD3  = ({})", new String(methodOut.getBTFld33())); 

// *
// * Src -> string; tgt -> group ; src bigger than tgt
// *
//  INITIALIZE WS-4A-S WS-4A-T
          methodOut.setAS4(CONSTANTS.SPACE_70 /* Fill 70 Spaces*/);
          methodOut.getAT4().initialize();
          // MOVE ALL 'ABCD' TO WS-4A-S
          methodOut.setAS4(CONSTANTS.LITERAL_1222519919);
//  MOVE WS-4A-S TO WS-4A-T ( 1 : LENGTH OF WS-4A-T )
          methodOut.setAT4(methodOut.getAS4(),0,methodOut.getAS4().length,0/* aT4 */ ,AT4.getAT4FieldLength() /* field,targetIndex,targetLen */);

// *
//  DISPLAY '*  83* WS-4A-S         = (' WS-4A-S ')'
          logger.info("*  83* WS-4A-S         = ({})", new String(methodOut.getAS4())); 
//  DISPLAY '*  84* WS-4A-T-R       = (' WS-4A-T-R ')'
          logger.info("*  84* WS-4A-T-R       = ({})", new String(methodIn.getATR4())); 
//  DISPLAY '*  85* WS-4A-T         = (' WS-4A-T ')'
          logger.info("*  85* WS-4A-T         = ({})", methodOut.getAT4().toString()); 
//  DISPLAY '*  86*   WS-4A-T-FLD1  = (' WS-4A-T-FLD1 ')'
          logger.info("*  86*   WS-4A-T-FLD1  = ({})", new String(methodOut.getATFld14())); 
//  DISPLAY '*  87*   WS-4A-T-FLD2  = (' WS-4A-T-FLD2 ')'
          logger.info("*  87*   WS-4A-T-FLD2  = ({})", new String(methodOut.getATFld24())); 

// *
//  INITIALIZE WS-4A-S WS-4A-T
          methodOut.setAS4(CONSTANTS.SPACE_70 /* Fill 70 Spaces*/);
          methodOut.getAT4().initialize();
      
      return methodOut;
      }
      /**
      * mainlineSplit3 
      *   This method is derived from 
  *   COBOL Paragraph - MAINLINE-SPLIT3 COBOL Cyclomatic complexity - 1
      * Input  :  

      * - aTR4                           COBOL Name: WS-4A-T-R
      * - bTR4                           COBOL Name: WS-4B-T-R
      * - aTR1                           COBOL Name: WS-1A-T-R
      *
      * Output :  

      * - aS4                            COBOL Name: WS-4A-S
      * - tLen                           COBOL Name: WS-T-LEN
      * - aT4                            COBOL Name: WS-4A-T
      * - aTFld14                        COBOL Name: WS-4A-T-FLD1
      * - aTFld24                        COBOL Name: WS-4A-T-FLD2
      * - bS4                            COBOL Name: WS-4B-S
      * - bT4                            COBOL Name: WS-4B-T
      * - bTFld34                        COBOL Name: WS-4B-T-FLD3
      * - bTFld14                        COBOL Name: WS-4B-T-FLD1
      * - bTFld24                        COBOL Name: WS-4B-T-FLD2
      * - aS1                            COBOL Name: WS-1A-S
      * - aT1                            COBOL Name: WS-1A-T
      * - aSFld11                        COBOL Name: WS-1A-S-FLD1
      * - aSFld21                        COBOL Name: WS-1A-S-FLD2
      * - sLen                           COBOL Name: WS-S-LEN
      * - aTFld11                        COBOL Name: WS-1A-T-FLD1
      * - aTFld21                        COBOL Name: WS-1A-T-FLD2
      *
      * @throws CFException
      */
      @Override
      public MainlineSplit3OutCtx mainlineSplit3(MainlineSplit3InCtx methodIn) throws Exception {
Refmod1Ctx programCtx = methodIn.getRefmod1Ctx();
MainlineSplit3OutCtx methodOut = methodIn.getMainlineSplit3OutCtx();
          // MOVE ALL 'ABCD' TO WS-4A-S
          methodOut.setAS4(CONSTANTS.LITERAL_1222519919);
//  MOVE LENGTH OF WS-4A-T TO WS-T-LEN
          methodOut.setTLen((short) AT4.getAT4FieldLength());
//  MOVE WS-4A-S TO WS-4A-T ( 1 : WS-T-LEN )
          methodOut.setAT4(methodOut.getAS4(),0,methodOut.getAS4().length,0/* aT4 */ ,methodOut.getTLen() /* field,targetIndex,targetLen */);

// *
//  DISPLAY '*  88* WS-4A-S         = (' WS-4A-S ')'
          logger.info("*  88* WS-4A-S         = ({})", new String(methodOut.getAS4())); 
//  DISPLAY '*  89* WS-4A-T-R       = (' WS-4A-T-R ')'
          logger.info("*  89* WS-4A-T-R       = ({})", new String(methodIn.getATR4())); 
//  DISPLAY '*  90* WS-4A-T         = (' WS-4A-T ')'
          logger.info("*  90* WS-4A-T         = ({})", methodOut.getAT4().toString()); 
//  DISPLAY '*  91*   WS-4A-T-FLD1  = (' WS-4A-T-FLD1 ')'
          logger.info("*  91*   WS-4A-T-FLD1  = ({})", new String(methodOut.getATFld14())); 
//  DISPLAY '*  92*   WS-4A-T-FLD2  = (' WS-4A-T-FLD2 ')'
          logger.info("*  92*   WS-4A-T-FLD2  = ({})", new String(methodOut.getATFld24())); 

// *
// * Src -> string; tgt -> group ; src smaller than tgt
// *
//  INITIALIZE WS-4B-S WS-4B-T
          methodOut.setBS4(CONSTANTS.SPACE_70 /* Fill 70 Spaces*/);
          methodOut.getBT4().initialize();
          // MOVE ALL 'ABCD' TO WS-4B-S
          methodOut.setBS4(CONSTANTS.LITERAL_1222519919);
//  MOVE ALL 'MNOP' TO WS-4B-T-FLD3
          methodOut.setBTFld34(CONSTANTS.LITERAL_MNOPMNOPMNOPMNOPMNOPMNOPMNOPMNOP);
//  MOVE WS-4B-S TO WS-4B-T ( 1 : LENGTH OF WS-4B-T )
          methodOut.setBT4(methodOut.getBS4(),0,methodOut.getBS4().length,0/* bT4 */ ,BT4.getBT4FieldLength() /* field,targetIndex,targetLen */);

// *
//  DISPLAY '*  93* WS-4B-S         = (' WS-4B-S ')'
          logger.info("*  93* WS-4B-S         = ({})", new String(methodOut.getBS4())); 
//  DISPLAY '*  94* WS-4B-T-R       = (' WS-4B-T-R ')'
          logger.info("*  94* WS-4B-T-R       = ({})", new String(methodIn.getBTR4())); 
//  DISPLAY '*  95* WS-4B-T         = (' WS-4B-T ')'
          logger.info("*  95* WS-4B-T         = ({})", methodOut.getBT4().toString()); 
//  DISPLAY '*  96*   WS-4B-T-FLD1  = (' WS-4B-T-FLD1 ')'
          logger.info("*  96*   WS-4B-T-FLD1  = ({})", new String(methodOut.getBTFld14())); 
//  DISPLAY '*  97*   WS-4B-T-FLD2  = (' WS-4B-T-FLD2 ')'
          logger.info("*  97*   WS-4B-T-FLD2  = ({})", new String(methodOut.getBTFld24())); 
//  DISPLAY '*  98*   WS-4B-T-FLD3  = (' WS-4B-T-FLD3 ')'
          logger.info("*  98*   WS-4B-T-FLD3  = ({})", new String(methodOut.getBTFld34())); 

// *
//  INITIALIZE WS-4B-S WS-4B-T
          methodOut.setBS4(CONSTANTS.SPACE_70 /* Fill 70 Spaces*/);
          methodOut.getBT4().initialize();
          // MOVE ALL 'ABCD' TO WS-4B-S
          methodOut.setBS4(CONSTANTS.LITERAL_1222519919);
//  MOVE ALL 'MNOP' TO WS-4B-T-FLD3
          methodOut.setBTFld34(CONSTANTS.LITERAL_MNOPMNOPMNOPMNOPMNOPMNOPMNOPMNOP);
//  MOVE LENGTH OF WS-4B-T TO WS-T-LEN
          methodOut.setTLen((short) BT4.getBT4FieldLength());
//  MOVE WS-4B-S TO WS-4B-T ( 1 : WS-T-LEN )
          methodOut.setBT4(methodOut.getBS4(),0,methodOut.getBS4().length,0/* bT4 */ ,methodOut.getTLen() /* field,targetIndex,targetLen */);

// *
//  DISPLAY '*  99* WS-4B-S         = (' WS-4B-S ')'
          logger.info("*  99* WS-4B-S         = ({})", new String(methodOut.getBS4())); 
//  DISPLAY '* 100* WS-4B-T-R       = (' WS-4B-T-R ')'
          logger.info("* 100* WS-4B-T-R       = ({})", new String(methodIn.getBTR4())); 
//  DISPLAY '* 101* WS-4B-T         = (' WS-4B-T ')'
          logger.info("* 101* WS-4B-T         = ({})", methodOut.getBT4().toString()); 
//  DISPLAY '* 102*   WS-4B-T-FLD1  = (' WS-4B-T-FLD1 ')'
          logger.info("* 102*   WS-4B-T-FLD1  = ({})", new String(methodOut.getBTFld14())); 
//  DISPLAY '* 103*   WS-4B-T-FLD2  = (' WS-4B-T-FLD2 ')'
          logger.info("* 103*   WS-4B-T-FLD2  = ({})", new String(methodOut.getBTFld24())); 
//  DISPLAY '* 104*   WS-4B-T-FLD3  = (' WS-4B-T-FLD3 ')'
          logger.info("* 104*   WS-4B-T-FLD3  = ({})", new String(methodOut.getBTFld34())); 

// *
// * Src -> group; tgt -> group ; src bigger than tgt
// *
//  INITIALIZE WS-1A-S WS-1A-T
          methodOut.getAS1().initialize();
          methodOut.getAT1().initialize();
//  MOVE ALL 'ABCD' TO WS-1A-S-FLD1
          methodOut.setASFld11(CONSTANTS.LITERAL_ABCDABCDABCDABCDABCDABCDABCDABCD);
//  MOVE ALL 'ZYXW' TO WS-1A-S-FLD2
          methodOut.setASFld21(CONSTANTS.LITERAL_645286444);
//  MOVE LENGTH OF WS-1A-S TO WS-S-LEN
          methodOut.setSLen((short) AS1.getAS1FieldLength());
//  MOVE LENGTH OF WS-1A-T TO WS-T-LEN
          methodOut.setTLen((short) AT1.getAT1FieldLength());
//  MOVE WS-1A-S ( 3 : LENGTH OF WS-1A-S - 3) TO WS-1A-T ( 5 : LENGTH OF WS-1A-T - 5)
          methodOut.setAT1(replace(methodOut.getAT1().toCharArray(),substring(methodOut.getAS1().getCharArray(),2, (AS1.getAS1FieldLength() - 3 + 2) ),4, (AT1.getAT1FieldLength() - 5 + 4) ));

// *
//  DISPLAY '* 105* WS-1A-S         = (' WS-1A-S ')'
          logger.info("* 105* WS-1A-S         = ({})", methodOut.getAS1().toString()); 
//  DISPLAY '* 106*   WS-1A-S-FLD1  = (' WS-1A-S-FLD1 ')'
          logger.info("* 106*   WS-1A-S-FLD1  = ({})", new String(methodOut.getASFld11())); 
//  DISPLAY '* 107*   WS-1A-S-FLD2  = (' WS-1A-S-FLD2 ')'
          logger.info("* 107*   WS-1A-S-FLD2  = ({})", new String(methodOut.getASFld21())); 
//  DISPLAY '* 108* WS-1A-T-R       = (' WS-1A-T-R ')'
          logger.info("* 108* WS-1A-T-R       = ({})", new String(methodIn.getATR1())); 
//  DISPLAY '* 109* WS-1A-T         = (' WS-1A-T ')'
          logger.info("* 109* WS-1A-T         = ({})", methodOut.getAT1().toString()); 
//  DISPLAY '* 110*   WS-1A-T-FLD1  = (' WS-1A-T-FLD1 ')'
          logger.info("* 110*   WS-1A-T-FLD1  = ({})", new String(methodOut.getATFld11())); 
//  DISPLAY '* 111*   WS-1A-T-FLD2  = (' WS-1A-T-FLD2 ')'
          logger.info("* 111*   WS-1A-T-FLD2  = ({})", new String(methodOut.getATFld21())); 

// *
//  INITIALIZE WS-1A-S WS-1A-T
          methodOut.getAS1().initialize();
          methodOut.getAT1().initialize();
//  MOVE ALL 'ABCD' TO WS-1A-S-FLD1
          methodOut.setASFld11(CONSTANTS.LITERAL_ABCDABCDABCDABCDABCDABCDABCDABCD);
//  MOVE ALL 'ZYXW' TO WS-1A-S-FLD2
          methodOut.setASFld21(CONSTANTS.LITERAL_645286444);
//  MOVE LENGTH OF WS-1A-S TO WS-S-LEN
          methodOut.setSLen((short) AS1.getAS1FieldLength());
//  MOVE LENGTH OF WS-1A-T TO WS-T-LEN
          methodOut.setTLen((short) AT1.getAT1FieldLength());
//  MOVE WS-1A-S ( 3 : WS-S-LEN - 3 ) TO WS-1A-T ( 5 : WS-T-LEN - 5)
          methodOut.setAT1(replace(methodOut.getAT1().toCharArray(),substring(methodOut.getAS1().getCharArray(),2, (methodOut.getSLen() - 3 + 2) ),4, (methodOut.getTLen() - 5 + 4) ));

// *
//  DISPLAY '* 112* WS-1A-S         = (' WS-1A-S ')'
          logger.info("* 112* WS-1A-S         = ({})", methodOut.getAS1().toString()); 
//  DISPLAY '* 113*   WS-1A-S-FLD1  = (' WS-1A-S-FLD1 ')'
          logger.info("* 113*   WS-1A-S-FLD1  = ({})", new String(methodOut.getASFld11())); 
//  DISPLAY '* 114*   WS-1A-S-FLD2  = (' WS-1A-S-FLD2 ')'
          logger.info("* 114*   WS-1A-S-FLD2  = ({})", new String(methodOut.getASFld21())); 
      
      return methodOut;
      }
      /**
      * mainlineSplit4 
      *   This method is derived from 
  *   COBOL Paragraph - MAINLINE-SPLIT4 COBOL Cyclomatic complexity - 1
      * Input  :  

      * - aTR1                           COBOL Name: WS-1A-T-R
      * - aT1                            COBOL Name: WS-1A-T
      * - aTFld11                        COBOL Name: WS-1A-T-FLD1
      * - aTFld21                        COBOL Name: WS-1A-T-FLD2
      * - bTR1                           COBOL Name: WS-1B-T-R
      * - aTR2                           COBOL Name: WS-2A-T-R
      *
      * Output :  

      * - bS1                            COBOL Name: WS-1B-S
      * - bT1                            COBOL Name: WS-1B-T
      * - bSFld11                        COBOL Name: WS-1B-S-FLD1
      * - bSFld21                        COBOL Name: WS-1B-S-FLD2
      * - bTFld31                        COBOL Name: WS-1B-T-FLD3
      * - bTFld11                        COBOL Name: WS-1B-T-FLD1
      * - bTFld21                        COBOL Name: WS-1B-T-FLD2
      * - sLen                           COBOL Name: WS-S-LEN
      * - tLen                           COBOL Name: WS-T-LEN
      * - aS2                            COBOL Name: WS-2A-S
      * - aT2                            COBOL Name: WS-2A-T
      * - aTFld12                        COBOL Name: WS-2A-T-FLD1
      * - aTFld22                        COBOL Name: WS-2A-T-FLD2
      *
      * @throws CFException
      */
      @Override
      public MainlineSplit4OutCtx mainlineSplit4(MainlineSplit4InCtx methodIn) throws Exception {
			// Declare local variables used in the method
			 final int A_S_2_LENGTH = 70;
			// End of variable declaration

Refmod1Ctx programCtx = methodIn.getRefmod1Ctx();
MainlineSplit4OutCtx methodOut = methodIn.getMainlineSplit4OutCtx();
//  DISPLAY '* 115* WS-1A-T-R       = (' WS-1A-T-R ')'
          logger.info("* 115* WS-1A-T-R       = ({})", new String(methodIn.getATR1())); 
//  DISPLAY '* 116* WS-1A-T         = (' WS-1A-T ')'
          logger.info("* 116* WS-1A-T         = ({})", methodIn.getAT1().toString()); 
//  DISPLAY '* 117*   WS-1A-T-FLD1  = (' WS-1A-T-FLD1 ')'
          logger.info("* 117*   WS-1A-T-FLD1  = ({})", new String(methodIn.getATFld11())); 
//  DISPLAY '* 118*   WS-1A-T-FLD2  = (' WS-1A-T-FLD2 ')'
          logger.info("* 118*   WS-1A-T-FLD2  = ({})", new String(methodIn.getATFld21())); 

// *
// * Src -> group; tgt -> group ; src smaller than tgt
// *
//  INITIALIZE WS-1B-S WS-1B-T
          methodOut.getBS1().initialize();
          methodOut.getBT1().initialize();
//  MOVE ALL 'ABCD' TO WS-1B-S-FLD1
          methodOut.setBSFld11(CONSTANTS.LITERAL_ABCDABCDABCDABCDABCDABCDABCDABCD);
//  MOVE ALL 'ZYXW' TO WS-1B-S-FLD2
          methodOut.setBSFld21(CONSTANTS.LITERAL_645286444);
//  MOVE ALL 'MNOP' TO WS-1B-T-FLD3
          methodOut.setBTFld31(CONSTANTS.LITERAL_MNOPMNOPMNOPMNOPMNOPMNOPMNOPMNOP);
//  MOVE WS-1B-S ( 3 : LENGTH OF WS-1B-S - 3 ) TO WS-1B-T ( 5 : LENGTH OF WS-1B-T - 5)
          methodOut.setBT1(replace(methodOut.getBT1().toCharArray(),substring(methodOut.getBS1().getCharArray(),2, (BS1.getBS1FieldLength() - 3 + 2) ),4, (BT1.getBT1FieldLength() - 5 + 4) ));

// *
//  DISPLAY '* 119* WS-1B-S         = (' WS-1B-S ')'
          logger.info("* 119* WS-1B-S         = ({})", methodOut.getBS1().toString()); 
//  DISPLAY '* 120*   WS-1B-S-FLD1  = (' WS-1B-S-FLD1 ')'
          logger.info("* 120*   WS-1B-S-FLD1  = ({})", new String(methodOut.getBSFld11())); 
//  DISPLAY '* 121*   WS-1B-S-FLD2  = (' WS-1B-S-FLD2 ')'
          logger.info("* 121*   WS-1B-S-FLD2  = ({})", new String(methodOut.getBSFld21())); 
//  DISPLAY '* 122* WS-1B-T-R       = (' WS-1B-T-R ')'
          logger.info("* 122* WS-1B-T-R       = ({})", new String(methodIn.getBTR1())); 
//  DISPLAY '* 123* WS-1B-T         = (' WS-1B-T ')'
          logger.info("* 123* WS-1B-T         = ({})", methodOut.getBT1().toString()); 
//  DISPLAY '* 124*   WS-1B-T-FLD1  = (' WS-1B-T-FLD1 ')'
          logger.info("* 124*   WS-1B-T-FLD1  = ({})", new String(methodOut.getBTFld11())); 
//  DISPLAY '* 125*   WS-1B-T-FLD2  = (' WS-1B-T-FLD2 ')'
          logger.info("* 125*   WS-1B-T-FLD2  = ({})", new String(methodOut.getBTFld21())); 
//  DISPLAY '* 126*   WS-1B-T-FLD3  = (' WS-1B-T-FLD3 ')'
          logger.info("* 126*   WS-1B-T-FLD3  = ({})", new String(methodOut.getBTFld31())); 

// *
//  INITIALIZE WS-1B-S WS-1B-T
          methodOut.getBS1().initialize();
          methodOut.getBT1().initialize();
//  MOVE ALL 'ABCD' TO WS-1B-S-FLD1
          methodOut.setBSFld11(CONSTANTS.LITERAL_ABCDABCDABCDABCDABCDABCDABCDABCD);
//  MOVE ALL 'ZYXW' TO WS-1B-S-FLD2
          methodOut.setBSFld21(CONSTANTS.LITERAL_645286444);
//  MOVE ALL 'MNOP' TO WS-1B-T-FLD3
          methodOut.setBTFld31(CONSTANTS.LITERAL_MNOPMNOPMNOPMNOPMNOPMNOPMNOPMNOP);
//  MOVE LENGTH OF WS-1B-S TO WS-S-LEN
          methodOut.setSLen((short) BS1.getBS1FieldLength());
//  MOVE LENGTH OF WS-1B-T TO WS-T-LEN
          methodOut.setTLen((short) BT1.getBT1FieldLength());
//  MOVE WS-1B-S ( 3 : WS-S-LEN - 3 ) TO WS-1B-T ( 5 : WS-T-LEN - 5)
          methodOut.setBT1(replace(methodOut.getBT1().toCharArray(),substring(methodOut.getBS1().getCharArray(),2, (methodOut.getSLen() - 3 + 2) ),4, (methodOut.getTLen() - 5 + 4) ));

// *
//  DISPLAY '* 127* WS-1B-S         = (' WS-1B-S ')'
          logger.info("* 127* WS-1B-S         = ({})", methodOut.getBS1().toString()); 
//  DISPLAY '* 128*   WS-1B-S-FLD1  = (' WS-1B-S-FLD1 ')'
          logger.info("* 128*   WS-1B-S-FLD1  = ({})", new String(methodOut.getBSFld11())); 
//  DISPLAY '* 129*   WS-1B-S-FLD2  = (' WS-1B-S-FLD2 ')'
          logger.info("* 129*   WS-1B-S-FLD2  = ({})", new String(methodOut.getBSFld21())); 
//  DISPLAY '* 130* WS-1B-T-R       = (' WS-1B-T-R ')'
          logger.info("* 130* WS-1B-T-R       = ({})", new String(methodIn.getBTR1())); 
//  DISPLAY '* 131* WS-1B-T         = (' WS-1B-T ')'
          logger.info("* 131* WS-1B-T         = ({})", methodOut.getBT1().toString()); 
//  DISPLAY '* 132*   WS-1B-T-FLD1  = (' WS-1B-T-FLD1 ')'
          logger.info("* 132*   WS-1B-T-FLD1  = ({})", new String(methodOut.getBTFld11())); 
//  DISPLAY '* 133*   WS-1B-T-FLD2  = (' WS-1B-T-FLD2 ')'
          logger.info("* 133*   WS-1B-T-FLD2  = ({})", new String(methodOut.getBTFld21())); 
//  DISPLAY '* 134*   WS-1B-T-FLD3  = (' WS-1B-T-FLD3 ')'
          logger.info("* 134*   WS-1B-T-FLD3  = ({})", new String(methodOut.getBTFld31())); 

// *
// * Src -> string; tgt -> group ; src bigger than tgt
// *
//  INITIALIZE WS-2A-S WS-2A-T
          methodOut.setAS2(CONSTANTS.SPACE_70 /* Fill 70 Spaces*/);
          methodOut.getAT2().initialize();
          // MOVE ALL 'ABCD' TO WS-2A-S
          methodOut.setAS2(CONSTANTS.LITERAL_1222519919);
//  MOVE WS-2A-S ( 3 : LENGTH OF WS-2A-S - 3 ) TO WS-2A-T ( 5 : LENGTH OF WS-2A-T - 5)
          methodOut.setAT2(methodOut.getAS2(),2/* aS2 */ ,A_S_2_LENGTH - 3,4,AT2.getAT2FieldLength() - 5 /* field,sourceIndex,sourceLen,targetIndex,targetLen */);

// *
//  DISPLAY '* 135* WS-2A-S         = (' WS-2A-S ')'
          logger.info("* 135* WS-2A-S         = ({})", new String(methodOut.getAS2())); 
//  DISPLAY '* 136* WS-2A-T-R       = (' WS-2A-T-R ')'
          logger.info("* 136* WS-2A-T-R       = ({})", new String(methodIn.getATR2())); 
//  DISPLAY '* 137* WS-2A-T         = (' WS-2A-T ')'
          logger.info("* 137* WS-2A-T         = ({})", methodOut.getAT2().toString()); 
//  DISPLAY '* 138*   WS-2A-T-FLD1  = (' WS-2A-T-FLD1 ')'
          logger.info("* 138*   WS-2A-T-FLD1  = ({})", new String(methodOut.getATFld12())); 
//  DISPLAY '* 139*   WS-2A-T-FLD2  = (' WS-2A-T-FLD2 ')'
          logger.info("* 139*   WS-2A-T-FLD2  = ({})", new String(methodOut.getATFld22())); 

// *
//  INITIALIZE WS-2A-S WS-2A-T
          methodOut.setAS2(CONSTANTS.SPACE_70 /* Fill 70 Spaces*/);
          methodOut.getAT2().initialize();
          // MOVE ALL 'ABCD' TO WS-2A-S
          methodOut.setAS2(CONSTANTS.LITERAL_1222519919);
//  MOVE LENGTH OF WS-2A-S TO WS-S-LEN
          methodOut.setSLen((short) A_S_2_LENGTH);
//  MOVE LENGTH OF WS-2A-T TO WS-T-LEN
          methodOut.setTLen((short) AT2.getAT2FieldLength());
//  SUBTRACT 3 FROM WS-S-LEN
          methodOut.setSLen( (short) (methodOut.getSLen()-(short)3));
//  SUBTRACT 5 FROM WS-T-LEN
          methodOut.setTLen( (short) (methodOut.getTLen()-(short)5));
//  MOVE WS-2A-S ( 3 : WS-S-LEN ) TO WS-2A-T ( 5 : WS-T-LEN )
          methodOut.setAT2(methodOut.getAS2(),2/* aS2 */ ,methodOut.getSLen(),4,methodOut.getTLen() /* field,sourceIndex,sourceLen,targetIndex,targetLen */);

// *
//  DISPLAY '* 140* WS-2A-S         = (' WS-2A-S ')'
          logger.info("* 140* WS-2A-S         = ({})", new String(methodOut.getAS2())); 
//  DISPLAY '* 141* WS-2A-T-R       = (' WS-2A-T-R ')'
          logger.info("* 141* WS-2A-T-R       = ({})", new String(methodIn.getATR2())); 
//  DISPLAY '* 142* WS-2A-T         = (' WS-2A-T ')'
          logger.info("* 142* WS-2A-T         = ({})", methodOut.getAT2().toString()); 
//  DISPLAY '* 143*   WS-2A-T-FLD1  = (' WS-2A-T-FLD1 ')'
          logger.info("* 143*   WS-2A-T-FLD1  = ({})", new String(methodOut.getATFld12())); 
      
      return methodOut;
      }
      /**
      * mainlineSplit5 
      *   This method is derived from 
  *   COBOL Paragraph - MAINLINE-SPLIT5 COBOL Cyclomatic complexity - 1
      * Input  :  

      * - aTFld22                        COBOL Name: WS-2A-T-FLD2
      * - bTR2                           COBOL Name: WS-2B-T-R
      * - aTR3                           COBOL Name: WS-3A-T-R
      *
      * Output :  

      * - bS2                            COBOL Name: WS-2B-S
      * - bT2                            COBOL Name: WS-2B-T
      * - bTFld32                        COBOL Name: WS-2B-T-FLD3
      * - bTFld12                        COBOL Name: WS-2B-T-FLD1
      * - bTFld22                        COBOL Name: WS-2B-T-FLD2
      * - sLen                           COBOL Name: WS-S-LEN
      * - tLen                           COBOL Name: WS-T-LEN
      * - aS3                            COBOL Name: WS-3A-S
      * - aT3                            COBOL Name: WS-3A-T
      * - aSFld13                        COBOL Name: WS-3A-S-FLD1
      * - aSFld23                        COBOL Name: WS-3A-S-FLD2
      * - aTFld13                        COBOL Name: WS-3A-T-FLD1
      * - aTFld23                        COBOL Name: WS-3A-T-FLD2
      * - bS3                            COBOL Name: WS-3B-S
      * - bT3                            COBOL Name: WS-3B-T
      * - bSFld13                        COBOL Name: WS-3B-S-FLD1
      *
      * @throws CFException
      */
      @Override
      public MainlineSplit5OutCtx mainlineSplit5(MainlineSplit5InCtx methodIn) throws Exception {
			// Declare local variables used in the method
			 final int B_S_2_LENGTH = 70;
			// End of variable declaration

Refmod1Ctx programCtx = methodIn.getRefmod1Ctx();
MainlineSplit5OutCtx methodOut = methodIn.getMainlineSplit5OutCtx();
//  DISPLAY '* 144*   WS-2A-T-FLD2  = (' WS-2A-T-FLD2 ')'
          logger.info("* 144*   WS-2A-T-FLD2  = ({})", new String(methodIn.getATFld22())); 

// *
// * Src -> string; tgt -> group ; src smaller than tgt
// *
//  INITIALIZE WS-2B-S WS-2B-T
          methodOut.setBS2(CONSTANTS.SPACE_70 /* Fill 70 Spaces*/);
          methodOut.getBT2().initialize();
          // MOVE ALL 'ABCD' TO WS-2B-S
          methodOut.setBS2(CONSTANTS.LITERAL_1222519919);
//  MOVE ALL 'MNOP' TO WS-2B-T-FLD3
          methodOut.setBTFld32(CONSTANTS.LITERAL_MNOPMNOPMNOPMNOPMNOPMNOPMNOPMNOP);
//  MOVE WS-2B-S ( 3 : LENGTH OF WS-2B-S - 3 ) TO WS-2B-T ( 5 : LENGTH OF WS-2B-T - 5)
          methodOut.setBT2(methodOut.getBS2(),2/* bS2 */ ,B_S_2_LENGTH - 3,4,BT2.getBT2FieldLength() - 5 /* field,sourceIndex,sourceLen,targetIndex,targetLen */);

// *
//  DISPLAY '* 145* WS-2B-S         = (' WS-2B-S ')'
          logger.info("* 145* WS-2B-S         = ({})", new String(methodOut.getBS2())); 
//  DISPLAY '* 146* WS-2B-T-R       = (' WS-2B-T-R ')'
          logger.info("* 146* WS-2B-T-R       = ({})", new String(methodIn.getBTR2())); 
//  DISPLAY '* 147* WS-2B-T         = (' WS-2B-T ')'
          logger.info("* 147* WS-2B-T         = ({})", methodOut.getBT2().toString()); 
//  DISPLAY '* 148*   WS-2B-T-FLD1  = (' WS-2B-T-FLD1 ')'
          logger.info("* 148*   WS-2B-T-FLD1  = ({})", new String(methodOut.getBTFld12())); 
//  DISPLAY '* 149*   WS-2B-T-FLD2  = (' WS-2B-T-FLD2 ')'
          logger.info("* 149*   WS-2B-T-FLD2  = ({})", new String(methodOut.getBTFld22())); 
//  DISPLAY '* 150*   WS-2B-T-FLD3  = (' WS-2B-T-FLD3 ')'
          logger.info("* 150*   WS-2B-T-FLD3  = ({})", new String(methodOut.getBTFld32())); 

// *
//  INITIALIZE WS-2B-S WS-2B-T
          methodOut.setBS2(CONSTANTS.SPACE_70 /* Fill 70 Spaces*/);
          methodOut.getBT2().initialize();
          // MOVE ALL 'ABCD' TO WS-2B-S
          methodOut.setBS2(CONSTANTS.LITERAL_1222519919);
//  MOVE ALL 'MNOP' TO WS-2B-T-FLD3
          methodOut.setBTFld32(CONSTANTS.LITERAL_MNOPMNOPMNOPMNOPMNOPMNOPMNOPMNOP);
//  MOVE LENGTH OF WS-2B-S TO WS-S-LEN
          methodOut.setSLen((short) B_S_2_LENGTH);
//  MOVE LENGTH OF WS-2B-T TO WS-T-LEN
          methodOut.setTLen((short) BT2.getBT2FieldLength());
//  SUBTRACT 3 FROM WS-S-LEN
          methodOut.setSLen( (short) (methodOut.getSLen()-(short)3));
//  SUBTRACT 5 FROM WS-T-LEN
          methodOut.setTLen( (short) (methodOut.getTLen()-(short)5));
//  MOVE WS-2B-S ( 3 : WS-S-LEN ) TO WS-2B-T ( 5 : WS-T-LEN )
          methodOut.setBT2(methodOut.getBS2(),2/* bS2 */ ,methodOut.getSLen(),4,methodOut.getTLen() /* field,sourceIndex,sourceLen,targetIndex,targetLen */);

// *
//  DISPLAY '* 151* WS-2B-S         = (' WS-2B-S ')'
          logger.info("* 151* WS-2B-S         = ({})", new String(methodOut.getBS2())); 
//  DISPLAY '* 152* WS-2B-T-R       = (' WS-2B-T-R ')'
          logger.info("* 152* WS-2B-T-R       = ({})", new String(methodIn.getBTR2())); 
//  DISPLAY '* 153* WS-2B-T         = (' WS-2B-T ')'
          logger.info("* 153* WS-2B-T         = ({})", methodOut.getBT2().toString()); 
//  DISPLAY '* 154*   WS-2B-T-FLD1  = (' WS-2B-T-FLD1 ')'
          logger.info("* 154*   WS-2B-T-FLD1  = ({})", new String(methodOut.getBTFld12())); 
//  DISPLAY '* 155*   WS-2B-T-FLD2  = (' WS-2B-T-FLD2 ')'
          logger.info("* 155*   WS-2B-T-FLD2  = ({})", new String(methodOut.getBTFld22())); 
//  DISPLAY '* 156*   WS-2B-T-FLD3  = (' WS-2B-T-FLD3 ')'
          logger.info("* 156*   WS-2B-T-FLD3  = ({})", new String(methodOut.getBTFld32())); 

// *
// * Src -> group; tgt -> group ; src bigger than tgt
// *
//  INITIALIZE WS-3A-S WS-3A-T
          methodOut.getAS3().initialize();
          methodOut.getAT3().initialize();
//  MOVE ALL 'ABCD' TO WS-3A-S-FLD1
          methodOut.setASFld13(CONSTANTS.LITERAL_ABCDABCDABCDABCDABCDABCDABCDABCD);
//  MOVE ALL 'ZYXW' TO WS-3A-S-FLD2
          methodOut.setASFld23(CONSTANTS.LITERAL_645286444);
//  MOVE WS-3A-S TO WS-3A-T ( 5 : LENGTH OF WS-3A-T - 5)
          methodOut.setAT3(replace(methodOut.getAT3().toCharArray(),methodOut.getAS3().toCharArray(),4, (AT3.getAT3FieldLength() - 5 + 4) ));

// *
//  DISPLAY '* 157* WS-3A-S         = (' WS-3A-S ')'
          logger.info("* 157* WS-3A-S         = ({})", methodOut.getAS3().toString()); 
//  DISPLAY '* 158*   WS-3A-S-FLD1  = (' WS-3A-S-FLD1 ')'
          logger.info("* 158*   WS-3A-S-FLD1  = ({})", new String(methodOut.getASFld13())); 
//  DISPLAY '* 159*   WS-3A-S-FLD2  = (' WS-3A-S-FLD2 ')'
          logger.info("* 159*   WS-3A-S-FLD2  = ({})", new String(methodOut.getASFld23())); 
//  DISPLAY '* 160* WS-3A-T-R       = (' WS-3A-T-R ')'
          logger.info("* 160* WS-3A-T-R       = ({})", new String(methodIn.getATR3())); 
//  DISPLAY '* 161* WS-3A-T         = (' WS-3A-T ')'
          logger.info("* 161* WS-3A-T         = ({})", methodOut.getAT3().toString()); 
//  DISPLAY '* 162*   WS-3A-T-FLD1  = (' WS-3A-T-FLD1 ')'
          logger.info("* 162*   WS-3A-T-FLD1  = ({})", new String(methodOut.getATFld13())); 
//  DISPLAY '* 163*   WS-3A-T-FLD2  = (' WS-3A-T-FLD2 ')'
          logger.info("* 163*   WS-3A-T-FLD2  = ({})", new String(methodOut.getATFld23())); 

// *
//  INITIALIZE WS-3A-S WS-3A-T
          methodOut.getAS3().initialize();
          methodOut.getAT3().initialize();
//  MOVE ALL 'ABCD' TO WS-3A-S-FLD1
          methodOut.setASFld13(CONSTANTS.LITERAL_ABCDABCDABCDABCDABCDABCDABCDABCD);
//  MOVE ALL 'ZYXW' TO WS-3A-S-FLD2
          methodOut.setASFld23(CONSTANTS.LITERAL_645286444);
//  MOVE LENGTH OF WS-3A-T TO WS-T-LEN
          methodOut.setTLen((short) AT3.getAT3FieldLength());
//  SUBTRACT 5 FROM WS-T-LEN
          methodOut.setTLen( (short) (methodOut.getTLen()-(short)5));
//  MOVE WS-3A-S TO WS-3A-T ( 5 : WS-T-LEN )
          methodOut.setAT3(replace(methodOut.getAT3().toCharArray(),methodOut.getAS3().toCharArray(),4, (methodOut.getTLen() + 4) ));

// *
//  DISPLAY '* 164* WS-3A-S         = (' WS-3A-S ')'
          logger.info("* 164* WS-3A-S         = ({})", methodOut.getAS3().toString()); 
//  DISPLAY '* 165*   WS-3A-S-FLD1  = (' WS-3A-S-FLD1 ')'
          logger.info("* 165*   WS-3A-S-FLD1  = ({})", new String(methodOut.getASFld13())); 
//  DISPLAY '* 166*   WS-3A-S-FLD2  = (' WS-3A-S-FLD2 ')'
          logger.info("* 166*   WS-3A-S-FLD2  = ({})", new String(methodOut.getASFld23())); 
//  DISPLAY '* 167* WS-3A-T-R       = (' WS-3A-T-R ')'
          logger.info("* 167* WS-3A-T-R       = ({})", new String(methodIn.getATR3())); 
//  DISPLAY '* 168* WS-3A-T         = (' WS-3A-T ')'
          logger.info("* 168* WS-3A-T         = ({})", methodOut.getAT3().toString()); 
//  DISPLAY '* 169*   WS-3A-T-FLD1  = (' WS-3A-T-FLD1 ')'
          logger.info("* 169*   WS-3A-T-FLD1  = ({})", new String(methodOut.getATFld13())); 
//  DISPLAY '* 170*   WS-3A-T-FLD2  = (' WS-3A-T-FLD2 ')'
          logger.info("* 170*   WS-3A-T-FLD2  = ({})", new String(methodOut.getATFld23())); 

// *
// * Src -> group; tgt -> group ; src smaller than tgt
// *
//  INITIALIZE WS-3B-S WS-3B-T
          methodOut.getBS3().initialize();
          methodOut.getBT3().initialize();
//  MOVE ALL 'ABCD' TO WS-3B-S-FLD1
          methodOut.setBSFld13(CONSTANTS.LITERAL_ABCDABCDABCDABCDABCDABCDABCDABCD);
      
      return methodOut;
      }
      /**
      * mainlineSplit6 
      *   This method is derived from 
  *   COBOL Paragraph - MAINLINE-SPLIT6 COBOL Cyclomatic complexity - 1
      * Input  :  

      * - bS3                            COBOL Name: WS-3B-S
      * - bTR3                           COBOL Name: WS-3B-T-R
      * - aTR4                           COBOL Name: WS-4A-T-R
      * - bTR4                           COBOL Name: WS-4B-T-R
      *
      * Output :  

      * - bSFld23                        COBOL Name: WS-3B-S-FLD2
      * - bTFld33                        COBOL Name: WS-3B-T-FLD3
      * - bT3                            COBOL Name: WS-3B-T
      * - bS3                            COBOL Name: WS-3B-S
      * - bSFld13                        COBOL Name: WS-3B-S-FLD1
      * - bTFld13                        COBOL Name: WS-3B-T-FLD1
      * - bTFld23                        COBOL Name: WS-3B-T-FLD2
      * - tLen                           COBOL Name: WS-T-LEN
      * - aS4                            COBOL Name: WS-4A-S
      * - aT4                            COBOL Name: WS-4A-T
      * - aTFld14                        COBOL Name: WS-4A-T-FLD1
      * - aTFld24                        COBOL Name: WS-4A-T-FLD2
      * - bS4                            COBOL Name: WS-4B-S
      * - bT4                            COBOL Name: WS-4B-T
      * - bTFld34                        COBOL Name: WS-4B-T-FLD3
      *
      * @throws CFException
      */
      @Override
      public MainlineSplit6OutCtx mainlineSplit6(MainlineSplit6InCtx methodIn) throws Exception {
Refmod1Ctx programCtx = methodIn.getRefmod1Ctx();
MainlineSplit6OutCtx methodOut = methodIn.getMainlineSplit6OutCtx();
//  MOVE ALL 'ZYXW' TO WS-3B-S-FLD2
          methodOut.setBSFld23(CONSTANTS.LITERAL_645286444);
//  MOVE ALL 'MNOP' TO WS-3B-T-FLD3
          methodOut.setBTFld33(CONSTANTS.LITERAL_MNOPMNOPMNOPMNOPMNOPMNOPMNOPMNOP);
//  MOVE WS-3B-S TO WS-3B-T ( 5 : LENGTH OF WS-3B-T - 5)
          methodOut.setBT3(replace(methodOut.getBT3().toCharArray(),methodOut.getBS3().toCharArray(),4, (BT3.getBT3FieldLength() - 5 + 4) ));

// *
//  DISPLAY '* 171* WS-3B-S         = (' WS-3B-S ')'
          logger.info("* 171* WS-3B-S         = ({})", methodOut.getBS3().toString()); 
//  DISPLAY '* 172*   WS-3B-S-FLD1  = (' WS-3B-S-FLD1 ')'
          logger.info("* 172*   WS-3B-S-FLD1  = ({})", new String(methodOut.getBSFld13())); 
//  DISPLAY '* 173*   WS-3B-S-FLD2  = (' WS-3B-S-FLD2 ')'
          logger.info("* 173*   WS-3B-S-FLD2  = ({})", new String(methodOut.getBSFld23())); 
//  DISPLAY '* 174* WS-3B-T-R       = (' WS-3B-T-R ')'
          logger.info("* 174* WS-3B-T-R       = ({})", new String(methodIn.getBTR3())); 
//  DISPLAY '* 175* WS-3B-T         = (' WS-3B-T ')'
          logger.info("* 175* WS-3B-T         = ({})", methodOut.getBT3().toString()); 
//  DISPLAY '* 176*   WS-3B-T-FLD1  = (' WS-3B-T-FLD1 ')'
          logger.info("* 176*   WS-3B-T-FLD1  = ({})", new String(methodOut.getBTFld13())); 
//  DISPLAY '* 177*   WS-3B-T-FLD2  = (' WS-3B-T-FLD2 ')'
          logger.info("* 177*   WS-3B-T-FLD2  = ({})", new String(methodOut.getBTFld23())); 
//  DISPLAY '* 178*   WS-3B-T-FLD3  = (' WS-3B-T-FLD3 ')'
          logger.info("* 178*   WS-3B-T-FLD3  = ({})", new String(methodOut.getBTFld33())); 

// *
//  INITIALIZE WS-3B-S WS-3B-T
          methodOut.getBS3().initialize();
          methodOut.getBT3().initialize();
//  MOVE ALL 'ABCD' TO WS-3B-S-FLD1
          methodOut.setBSFld13(CONSTANTS.LITERAL_ABCDABCDABCDABCDABCDABCDABCDABCD);
//  MOVE ALL 'ZYXW' TO WS-3B-S-FLD2
          methodOut.setBSFld23(CONSTANTS.LITERAL_645286444);
//  MOVE ALL 'MNOP' TO WS-3B-T-FLD3
          methodOut.setBTFld33(CONSTANTS.LITERAL_MNOPMNOPMNOPMNOPMNOPMNOPMNOPMNOP);
//  MOVE LENGTH OF WS-3B-T TO WS-T-LEN
          methodOut.setTLen((short) BT3.getBT3FieldLength());
//  SUBTRACT 5 FROM WS-T-LEN
          methodOut.setTLen( (short) (methodOut.getTLen()-(short)5));
//  MOVE WS-3B-S TO WS-3B-T ( 5 : WS-T-LEN )
          methodOut.setBT3(replace(methodOut.getBT3().toCharArray(),methodOut.getBS3().toCharArray(),4, (methodOut.getTLen() + 4) ));

// *
//  DISPLAY '* 179* WS-3B-S         = (' WS-3B-S ')'
          logger.info("* 179* WS-3B-S         = ({})", methodOut.getBS3().toString()); 
//  DISPLAY '* 180*   WS-3B-S-FLD1  = (' WS-3B-S-FLD1 ')'
          logger.info("* 180*   WS-3B-S-FLD1  = ({})", new String(methodOut.getBSFld13())); 
//  DISPLAY '* 181*   WS-3B-S-FLD2  = (' WS-3B-S-FLD2 ')'
          logger.info("* 181*   WS-3B-S-FLD2  = ({})", new String(methodOut.getBSFld23())); 
//  DISPLAY '* 182* WS-3B-T-R       = (' WS-3B-T-R ')'
          logger.info("* 182* WS-3B-T-R       = ({})", new String(methodIn.getBTR3())); 
//  DISPLAY '* 183* WS-3B-T         = (' WS-3B-T ')'
          logger.info("* 183* WS-3B-T         = ({})", methodOut.getBT3().toString()); 
//  DISPLAY '* 184*   WS-3B-T-FLD1  = (' WS-3B-T-FLD1 ')'
          logger.info("* 184*   WS-3B-T-FLD1  = ({})", new String(methodOut.getBTFld13())); 
//  DISPLAY '* 185*   WS-3B-T-FLD2  = (' WS-3B-T-FLD2 ')'
          logger.info("* 185*   WS-3B-T-FLD2  = ({})", new String(methodOut.getBTFld23())); 
//  DISPLAY '* 186*   WS-3B-T-FLD3  = (' WS-3B-T-FLD3 ')'
          logger.info("* 186*   WS-3B-T-FLD3  = ({})", new String(methodOut.getBTFld33())); 

// *
// * Src -> string; tgt -> group ; src bigger than tgt
// *
//  INITIALIZE WS-4A-S WS-4A-T
          methodOut.setAS4(CONSTANTS.SPACE_70 /* Fill 70 Spaces*/);
          methodOut.getAT4().initialize();
          // MOVE ALL 'ABCD' TO WS-4A-S
          methodOut.setAS4(CONSTANTS.LITERAL_1222519919);
//  MOVE WS-4A-S TO WS-4A-T ( 5 : LENGTH OF WS-4A-T - 5)
          methodOut.setAT4(methodOut.getAS4(),0,methodOut.getAS4().length,4/* aT4 */ ,AT4.getAT4FieldLength() - 5 /* field,targetIndex,targetLen */);

// *
//  DISPLAY '* 187* WS-4A-S         = (' WS-4A-S ')'
          logger.info("* 187* WS-4A-S         = ({})", new String(methodOut.getAS4())); 
//  DISPLAY '* 188* WS-4A-T-R       = (' WS-4A-T-R ')'
          logger.info("* 188* WS-4A-T-R       = ({})", new String(methodIn.getATR4())); 
//  DISPLAY '* 189* WS-4A-T         = (' WS-4A-T ')'
          logger.info("* 189* WS-4A-T         = ({})", methodOut.getAT4().toString()); 
//  DISPLAY '* 190*   WS-4A-T-FLD1  = (' WS-4A-T-FLD1 ')'
          logger.info("* 190*   WS-4A-T-FLD1  = ({})", new String(methodOut.getATFld14())); 
//  DISPLAY '* 191*   WS-4A-T-FLD2  = (' WS-4A-T-FLD2 ')'
          logger.info("* 191*   WS-4A-T-FLD2  = ({})", new String(methodOut.getATFld24())); 

// *
//  INITIALIZE WS-4A-S WS-4A-T
          methodOut.setAS4(CONSTANTS.SPACE_70 /* Fill 70 Spaces*/);
          methodOut.getAT4().initialize();
          // MOVE ALL 'ABCD' TO WS-4A-S
          methodOut.setAS4(CONSTANTS.LITERAL_1222519919);
//  MOVE LENGTH OF WS-4A-T TO WS-T-LEN
          methodOut.setTLen((short) AT4.getAT4FieldLength());
//  SUBTRACT 5 FROM WS-T-LEN
          methodOut.setTLen( (short) (methodOut.getTLen()-(short)5));
//  MOVE WS-4A-S TO WS-4A-T ( 5 : WS-T-LEN )
          methodOut.setAT4(methodOut.getAS4(),0,methodOut.getAS4().length,4/* aT4 */ ,methodOut.getTLen() /* field,targetIndex,targetLen */);

// *
//  DISPLAY '* 192* WS-4A-S         = (' WS-4A-S ')'
          logger.info("* 192* WS-4A-S         = ({})", new String(methodOut.getAS4())); 
//  DISPLAY '* 193* WS-4A-T-R       = (' WS-4A-T-R ')'
          logger.info("* 193* WS-4A-T-R       = ({})", new String(methodIn.getATR4())); 
//  DISPLAY '* 194* WS-4A-T         = (' WS-4A-T ')'
          logger.info("* 194* WS-4A-T         = ({})", methodOut.getAT4().toString()); 
//  DISPLAY '* 195*   WS-4A-T-FLD1  = (' WS-4A-T-FLD1 ')'
          logger.info("* 195*   WS-4A-T-FLD1  = ({})", new String(methodOut.getATFld14())); 
//  DISPLAY '* 196*   WS-4A-T-FLD2  = (' WS-4A-T-FLD2 ')'
          logger.info("* 196*   WS-4A-T-FLD2  = ({})", new String(methodOut.getATFld24())); 

// *
// * Src -> string; tgt -> group ; src smaller than tgt
// *
//  INITIALIZE WS-4B-S WS-4B-T
          methodOut.setBS4(CONSTANTS.SPACE_70 /* Fill 70 Spaces*/);
          methodOut.getBT4().initialize();
          // MOVE ALL 'ABCD' TO WS-4B-S
          methodOut.setBS4(CONSTANTS.LITERAL_1222519919);
//  MOVE ALL 'MNOP' TO WS-4B-T-FLD3
          methodOut.setBTFld34(CONSTANTS.LITERAL_MNOPMNOPMNOPMNOPMNOPMNOPMNOPMNOP);
//  MOVE WS-4B-S TO WS-4B-T ( 5 : LENGTH OF WS-4B-T - 5)
          methodOut.setBT4(methodOut.getBS4(),0,methodOut.getBS4().length,4/* bT4 */ ,BT4.getBT4FieldLength() - 5 /* field,targetIndex,targetLen */);

// *
//  DISPLAY '* 197* WS-4B-S         = (' WS-4B-S ')'
          logger.info("* 197* WS-4B-S         = ({})", new String(methodOut.getBS4())); 
//  DISPLAY '* 198* WS-4B-T-R       = (' WS-4B-T-R ')'
          logger.info("* 198* WS-4B-T-R       = ({})", new String(methodIn.getBTR4())); 
//  DISPLAY '* 199* WS-4B-T         = (' WS-4B-T ')'
          logger.info("* 199* WS-4B-T         = ({})", methodOut.getBT4().toString()); 
      
      return methodOut;
      }
      /**
      * mainlineSplit7 
      *   This method is derived from 
  *   COBOL Paragraph - MAINLINE-SPLIT7 COBOL Cyclomatic complexity - 1
      * Input  :  

      * - bTFld14                        COBOL Name: WS-4B-T-FLD1
      * - bTFld24                        COBOL Name: WS-4B-T-FLD2
      * - bTFld34                        COBOL Name: WS-4B-T-FLD3
      * - bTR4                           COBOL Name: WS-4B-T-R
      * - aSGrp5                         COBOL Name: WS-5A-S-GRP
      * - aTR5                           COBOL Name: WS-5A-T-R
      * - bSGrp5                         COBOL Name: WS-5B-S-GRP
      * - bTR5                           COBOL Name: WS-5B-T-R
      *
      * Output :  

      * - bS4                            COBOL Name: WS-4B-S
      * - bT4                            COBOL Name: WS-4B-T
      * - bTFld34                        COBOL Name: WS-4B-T-FLD3
      * - tLen                           COBOL Name: WS-T-LEN
      * - aS5                            COBOL Name: WS-5A-S
      * - aT5                            COBOL Name: WS-5A-T
      * - aSFld15                        COBOL Name: WS-5A-S-FLD1
      * - aSFld25                        COBOL Name: WS-5A-S-FLD2
      * - aTFld15                        COBOL Name: WS-5A-T-FLD1
      * - aTFld25                        COBOL Name: WS-5A-T-FLD2
      * - sLen                           COBOL Name: WS-S-LEN
      * - bS5                            COBOL Name: WS-5B-S
      * - bT5                            COBOL Name: WS-5B-T
      * - bSFld15                        COBOL Name: WS-5B-S-FLD1
      * - bSFld25                        COBOL Name: WS-5B-S-FLD2
      * - bTFld35                        COBOL Name: WS-5B-T-FLD3
      *
      * @throws CFException
      */
      @Override
      public MainlineSplit7OutCtx mainlineSplit7(MainlineSplit7InCtx methodIn) throws Exception {
Refmod1Ctx programCtx = methodIn.getRefmod1Ctx();
MainlineSplit7OutCtx methodOut = methodIn.getMainlineSplit7OutCtx();
//  DISPLAY '* 200*   WS-4B-T-FLD1  = (' WS-4B-T-FLD1 ')'
          logger.info("* 200*   WS-4B-T-FLD1  = ({})", new String(methodIn.getBTFld14())); 
//  DISPLAY '* 201*   WS-4B-T-FLD2  = (' WS-4B-T-FLD2 ')'
          logger.info("* 201*   WS-4B-T-FLD2  = ({})", new String(methodIn.getBTFld24())); 
//  DISPLAY '* 202*   WS-4B-T-FLD3  = (' WS-4B-T-FLD3 ')'
          logger.info("* 202*   WS-4B-T-FLD3  = ({})", new String(methodOut.getBTFld34())); 

// *
//  INITIALIZE WS-4B-S WS-4B-T
          methodOut.setBS4(CONSTANTS.SPACE_70 /* Fill 70 Spaces*/);
          methodOut.getBT4().initialize();
          // MOVE ALL 'ABCD' TO WS-4B-S
          methodOut.setBS4(CONSTANTS.LITERAL_1222519919);
//  MOVE ALL 'MNOP' TO WS-4B-T-FLD3
          methodOut.setBTFld34(CONSTANTS.LITERAL_MNOPMNOPMNOPMNOPMNOPMNOPMNOPMNOP);
//  MOVE LENGTH OF WS-4B-T TO WS-T-LEN
          methodOut.setTLen((short) BT4.getBT4FieldLength());
//  SUBTRACT 5 FROM WS-T-LEN
          methodOut.setTLen( (short) (methodOut.getTLen()-(short)5));
//  MOVE WS-4B-S TO WS-4B-T ( 5 : WS-T-LEN )
          methodOut.setBT4(methodOut.getBS4(),0,methodOut.getBS4().length,4/* bT4 */ ,methodOut.getTLen() /* field,targetIndex,targetLen */);

// *
//  DISPLAY '* 203* WS-4B-S         = (' WS-4B-S ')'
          logger.info("* 203* WS-4B-S         = ({})", new String(methodOut.getBS4())); 
//  DISPLAY '* 204* WS-4B-T-R       = (' WS-4B-T-R ')'
          logger.info("* 204* WS-4B-T-R       = ({})", new String(methodIn.getBTR4())); 
//  DISPLAY '* 205* WS-4B-T         = (' WS-4B-T ')'
          logger.info("* 205* WS-4B-T         = ({})", methodOut.getBT4().toString()); 
//  DISPLAY '* 206*   WS-4B-T-FLD1  = (' WS-4B-T-FLD1 ')'
          logger.info("* 206*   WS-4B-T-FLD1  = ({})", new String(methodIn.getBTFld14())); 
//  DISPLAY '* 207*   WS-4B-T-FLD2  = (' WS-4B-T-FLD2 ')'
          logger.info("* 207*   WS-4B-T-FLD2  = ({})", new String(methodIn.getBTFld24())); 
//  DISPLAY '* 208*   WS-4B-T-FLD3  = (' WS-4B-T-FLD3 ')'
          logger.info("* 208*   WS-4B-T-FLD3  = ({})", new String(methodOut.getBTFld34())); 

// *
// * Src -> group; tgt -> group ; src bigger than tgt ; src offset 3
// *
//  INITIALIZE WS-5A-S WS-5A-T
          methodOut.getAS5().initialize();
          methodOut.getAT5().initialize();
//  MOVE ALL 'ABCD' TO WS-5A-S-FLD1
          methodOut.setASFld15(CONSTANTS.LITERAL_ABCDABCDABCDABCDABCDABCDABCDABCD);
//  MOVE ALL 'ZYXW' TO WS-5A-S-FLD2
          methodOut.setASFld25(CONSTANTS.LITERAL_645286444);
//  MOVE WS-5A-S ( 1 : LENGTH OF WS-5A-S ) TO WS-5A-T ( 1 : LENGTH OF WS-5A-T )
          methodOut.getATGroup5().replace(methodIn.getASGrp5()/*parent*/,3/*fromOffset - (aT5) */,AS5.getAS5FieldLength()/*fromLen*/,0/*toOffset - (aS5) */,AT5.getAT5FieldLength()/*toLen*/);

// *
//  DISPLAY '* 209* WS-5A-S-GRP     = (' WS-5A-S-GRP ')'
          logger.info("* 209* WS-5A-S-GRP     = ({})", methodIn.getASGrp5().toString()); 
//  DISPLAY '* 210* WS-5A-S         = (' WS-5A-S ')'
          logger.info("* 210* WS-5A-S         = ({})", methodOut.getAS5().toString()); 
//  DISPLAY '* 211*   WS-5A-S-FLD1  = (' WS-5A-S-FLD1 ')'
          logger.info("* 211*   WS-5A-S-FLD1  = ({})", new String(methodOut.getASFld15())); 
//  DISPLAY '* 212*   WS-5A-S-FLD2  = (' WS-5A-S-FLD2 ')'
          logger.info("* 212*   WS-5A-S-FLD2  = ({})", new String(methodOut.getASFld25())); 
//  DISPLAY '* 213* WS-5A-T-R       = (' WS-5A-T-R ')'
          logger.info("* 213* WS-5A-T-R       = ({})", new String(methodIn.getATR5())); 
//  DISPLAY '* 214* WS-5A-T         = (' WS-5A-T ')'
          logger.info("* 214* WS-5A-T         = ({})", methodOut.getAT5().toString()); 
//  DISPLAY '* 215*   WS-5A-T-FLD1  = (' WS-5A-T-FLD1 ')'
          logger.info("* 215*   WS-5A-T-FLD1  = ({})", new String(methodOut.getATFld15())); 
//  DISPLAY '* 216*   WS-5A-T-FLD2  = (' WS-5A-T-FLD2 ')'
          logger.info("* 216*   WS-5A-T-FLD2  = ({})", new String(methodOut.getATFld25())); 

// *
//  INITIALIZE WS-5A-S WS-5A-T
          methodOut.getAS5().initialize();
          methodOut.getAT5().initialize();
//  MOVE ALL 'ABCD' TO WS-5A-S-FLD1
          methodOut.setASFld15(CONSTANTS.LITERAL_ABCDABCDABCDABCDABCDABCDABCDABCD);
//  MOVE ALL 'ZYXW' TO WS-5A-S-FLD2
          methodOut.setASFld25(CONSTANTS.LITERAL_645286444);
//  MOVE LENGTH OF WS-5A-S TO WS-S-LEN
          methodOut.setSLen((short) AS5.getAS5FieldLength());
//  MOVE LENGTH OF WS-5A-T TO WS-T-LEN
          methodOut.setTLen((short) AT5.getAT5FieldLength());
//  MOVE WS-5A-S ( 1 : WS-S-LEN ) TO WS-5A-T ( 1 : WS-T-LEN )
          methodOut.getATGroup5().replace(methodIn.getASGrp5()/*parent*/,3/*fromOffset - (aT5) */,methodOut.getSLen()/*fromLen*/,0/*toOffset - (aS5) */,methodOut.getTLen()/*toLen*/);

// *
//  DISPLAY '* 217* WS-5A-S-GRP     = (' WS-5A-S-GRP ')'
          logger.info("* 217* WS-5A-S-GRP     = ({})", methodIn.getASGrp5().toString()); 
//  DISPLAY '* 218* WS-5A-S         = (' WS-5A-S ')'
          logger.info("* 218* WS-5A-S         = ({})", methodOut.getAS5().toString()); 
//  DISPLAY '* 219*   WS-5A-S-FLD1  = (' WS-5A-S-FLD1 ')'
          logger.info("* 219*   WS-5A-S-FLD1  = ({})", new String(methodOut.getASFld15())); 
//  DISPLAY '* 220*   WS-5A-S-FLD2  = (' WS-5A-S-FLD2 ')'
          logger.info("* 220*   WS-5A-S-FLD2  = ({})", new String(methodOut.getASFld25())); 
//  DISPLAY '* 221* WS-5A-T-R       = (' WS-5A-T-R ')'
          logger.info("* 221* WS-5A-T-R       = ({})", new String(methodIn.getATR5())); 
//  DISPLAY '* 222* WS-5A-T         = (' WS-5A-T ')'
          logger.info("* 222* WS-5A-T         = ({})", methodOut.getAT5().toString()); 
//  DISPLAY '* 223*   WS-5A-T-FLD1  = (' WS-5A-T-FLD1 ')'
          logger.info("* 223*   WS-5A-T-FLD1  = ({})", new String(methodOut.getATFld15())); 
//  DISPLAY '* 224*   WS-5A-T-FLD2  = (' WS-5A-T-FLD2 ')'
          logger.info("* 224*   WS-5A-T-FLD2  = ({})", new String(methodOut.getATFld25())); 

// *
// * Src -> group; tgt -> group ; src smaller than tgt ;src offset 3
// *
//  INITIALIZE WS-5B-S WS-5B-T
          methodOut.getBS5().initialize();
          methodOut.getBT5().initialize();
//  MOVE ALL 'ABCD' TO WS-5B-S-FLD1
          methodOut.setBSFld15(CONSTANTS.LITERAL_ABCDABCDABCDABCDABCDABCDABCDABCD);
//  MOVE ALL 'ZYXW' TO WS-5B-S-FLD2
          methodOut.setBSFld25(CONSTANTS.LITERAL_645286444);
//  MOVE ALL 'MNOP' TO WS-5B-T-FLD3
          methodOut.setBTFld35(CONSTANTS.LITERAL_MNOPMNOPMNOPMNOPMNOPMNOPMNOPMNOP);
//  MOVE WS-5B-S ( 1 : LENGTH OF WS-5B-S ) TO WS-5B-T ( 1 : LENGTH OF WS-5B-T )
          methodOut.getBTGroup5().replace(methodIn.getBSGrp5()/*parent*/,3/*fromOffset - (bT5) */,BS5.getBS5FieldLength()/*fromLen*/,0/*toOffset - (bS5) */,BT5.getBT5FieldLength()/*toLen*/);

// *
//  DISPLAY '* 225* WS-5B-S-GRP     = (' WS-5B-S-GRP ')'
          logger.info("* 225* WS-5B-S-GRP     = ({})", methodIn.getBSGrp5().toString()); 
//  DISPLAY '* 226* WS-5B-S         = (' WS-5B-S ')'
          logger.info("* 226* WS-5B-S         = ({})", methodOut.getBS5().toString()); 
//  DISPLAY '* 227*   WS-5B-S-FLD1  = (' WS-5B-S-FLD1 ')'
          logger.info("* 227*   WS-5B-S-FLD1  = ({})", new String(methodOut.getBSFld15())); 
//  DISPLAY '* 228*   WS-5B-S-FLD2  = (' WS-5B-S-FLD2 ')'
          logger.info("* 228*   WS-5B-S-FLD2  = ({})", new String(methodOut.getBSFld25())); 
//  DISPLAY '* 229* WS-5B-T-R       = (' WS-5B-T-R ')'
          logger.info("* 229* WS-5B-T-R       = ({})", new String(methodIn.getBTR5())); 
      
      return methodOut;
      }
      /**
      * mainlineSplit8 
      *   This method is derived from 
  *   COBOL Paragraph - MAINLINE-SPLIT8 COBOL Cyclomatic complexity - 1
      * Input  :  

      * - bT5                            COBOL Name: WS-5B-T
      * - bTFld15                        COBOL Name: WS-5B-T-FLD1
      * - bTFld25                        COBOL Name: WS-5B-T-FLD2
      * - bTFld35                        COBOL Name: WS-5B-T-FLD3
      * - bSGrp5                         COBOL Name: WS-5B-S-GRP
      * - bTR5                           COBOL Name: WS-5B-T-R
      * - aSGrp6                         COBOL Name: WS-6A-S-GRP
      * - aTR6                           COBOL Name: WS-6A-T-R
      * - bSGrp6                         COBOL Name: WS-6B-S-GRP
      * - bTR6                           COBOL Name: WS-6B-T-R
      *
      * Output :  

      * - bS5                            COBOL Name: WS-5B-S
      * - bT5                            COBOL Name: WS-5B-T
      * - bSFld15                        COBOL Name: WS-5B-S-FLD1
      * - bSFld25                        COBOL Name: WS-5B-S-FLD2
      * - bTFld35                        COBOL Name: WS-5B-T-FLD3
      * - sLen                           COBOL Name: WS-S-LEN
      * - tLen                           COBOL Name: WS-T-LEN
      * - aS6                            COBOL Name: WS-6A-S
      * - aT6                            COBOL Name: WS-6A-T
      * - aTFld16                        COBOL Name: WS-6A-T-FLD1
      * - aTFld26                        COBOL Name: WS-6A-T-FLD2
      * - bS6                            COBOL Name: WS-6B-S
      * - bT6                            COBOL Name: WS-6B-T
      * - bTFld36                        COBOL Name: WS-6B-T-FLD3
      * - bTFld16                        COBOL Name: WS-6B-T-FLD1
      * - bTFld26                        COBOL Name: WS-6B-T-FLD2
      *
      * @throws CFException
      */
      @Override
      public MainlineSplit8OutCtx mainlineSplit8(MainlineSplit8InCtx methodIn) throws Exception {
			// Declare local variables used in the method
			 final int A_S_6_LENGTH = 70;
			 final int B_S_6_LENGTH = 70;
			// End of variable declaration

Refmod1Ctx programCtx = methodIn.getRefmod1Ctx();
MainlineSplit8OutCtx methodOut = methodIn.getMainlineSplit8OutCtx();
//  DISPLAY '* 230* WS-5B-T         = (' WS-5B-T ')'
          logger.info("* 230* WS-5B-T         = ({})", methodOut.getBT5().toString()); 
//  DISPLAY '* 231*   WS-5B-T-FLD1  = (' WS-5B-T-FLD1 ')'
          logger.info("* 231*   WS-5B-T-FLD1  = ({})", new String(methodIn.getBTFld15())); 
//  DISPLAY '* 232*   WS-5B-T-FLD2  = (' WS-5B-T-FLD2 ')'
          logger.info("* 232*   WS-5B-T-FLD2  = ({})", new String(methodIn.getBTFld25())); 
//  DISPLAY '* 233*   WS-5B-T-FLD3  = (' WS-5B-T-FLD3 ')'
          logger.info("* 233*   WS-5B-T-FLD3  = ({})", new String(methodOut.getBTFld35())); 

// *
//  INITIALIZE WS-5B-S WS-5B-T
          methodOut.getBS5().initialize();
          methodOut.getBT5().initialize();
//  MOVE ALL 'ABCD' TO WS-5B-S-FLD1
          methodOut.setBSFld15(CONSTANTS.LITERAL_ABCDABCDABCDABCDABCDABCDABCDABCD);
//  MOVE ALL 'ZYXW' TO WS-5B-S-FLD2
          methodOut.setBSFld25(CONSTANTS.LITERAL_645286444);
//  MOVE ALL 'MNOP' TO WS-5B-T-FLD3
          methodOut.setBTFld35(CONSTANTS.LITERAL_MNOPMNOPMNOPMNOPMNOPMNOPMNOPMNOP);
//  MOVE LENGTH OF WS-5B-S TO WS-S-LEN
          methodOut.setSLen((short) BS5.getBS5FieldLength());
//  MOVE LENGTH OF WS-6B-T TO WS-T-LEN
          methodOut.setTLen((short) BT6.getBT6FieldLength());
//  MOVE WS-5B-S ( 1 : WS-S-LEN ) TO WS-5B-T ( 1 : WS-T-LEN )
          methodOut.getBTGroup5().replace(methodIn.getBSGrp5()/*parent*/,3/*fromOffset - (bT5) */,methodOut.getSLen()/*fromLen*/,0/*toOffset - (bS5) */,methodOut.getTLen()/*toLen*/);

// *
//  DISPLAY '* 234* WS-5B-S-GRP     = (' WS-5B-S-GRP ')'
          logger.info("* 234* WS-5B-S-GRP     = ({})", methodIn.getBSGrp5().toString()); 
//  DISPLAY '* 235* WS-5B-S         = (' WS-5B-S ')'
          logger.info("* 235* WS-5B-S         = ({})", methodOut.getBS5().toString()); 
//  DISPLAY '* 236*   WS-5B-S-FLD1  = (' WS-5B-S-FLD1 ')'
          logger.info("* 236*   WS-5B-S-FLD1  = ({})", new String(methodOut.getBSFld15())); 
//  DISPLAY '* 237*   WS-5B-S-FLD2  = (' WS-5B-S-FLD2 ')'
          logger.info("* 237*   WS-5B-S-FLD2  = ({})", new String(methodOut.getBSFld25())); 
//  DISPLAY '* 238* WS-5B-T-R       = (' WS-5B-T-R ')'
          logger.info("* 238* WS-5B-T-R       = ({})", new String(methodIn.getBTR5())); 
//  DISPLAY '* 239* WS-5B-T         = (' WS-5B-T ')'
          logger.info("* 239* WS-5B-T         = ({})", methodOut.getBT5().toString()); 
//  DISPLAY '* 240*   WS-5B-T-FLD1  = (' WS-5B-T-FLD1 ')'
          logger.info("* 240*   WS-5B-T-FLD1  = ({})", new String(methodIn.getBTFld15())); 
//  DISPLAY '* 241*   WS-5B-T-FLD2  = (' WS-5B-T-FLD2 ')'
          logger.info("* 241*   WS-5B-T-FLD2  = ({})", new String(methodIn.getBTFld25())); 
//  DISPLAY '* 242*   WS-5B-T-FLD3  = (' WS-5B-T-FLD3 ')'
          logger.info("* 242*   WS-5B-T-FLD3  = ({})", new String(methodOut.getBTFld35())); 

// *
// * Src -> string; tgt -> group ; src bigger than tgt ; srcoffset 3
// *
//  INITIALIZE WS-6A-S WS-6A-T
          methodOut.setAS6(CONSTANTS.SPACE_70 /* Fill 70 Spaces*/);
          methodOut.getAT6().initialize();
//  MOVE ALL 'ABCD' TO WS-6A-S
          methodOut.setAS6(CONSTANTS.LITERAL_1222519919);
//  MOVE WS-6A-S ( 1 : LENGTH OF WS-6A-S ) TO WS-6A-T ( 1 : LENGTH OF WS-6A-T )
          methodOut.getATGroup6().replace(methodIn.getASGrp6()/*parent*/,3/*fromOffset - (aT6) */,A_S_6_LENGTH/*fromLen*/,0/*toOffset - (aS6) */,AT6.getAT6FieldLength()/*toLen*/);

// *
//  DISPLAY '* 243* WS-6A-S-GRP     = (' WS-6A-S-GRP ')'
          logger.info("* 243* WS-6A-S-GRP     = ({})", methodIn.getASGrp6().toString()); 
//  DISPLAY '* 244* WS-6A-S         = (' WS-6A-S ')'
          logger.info("* 244* WS-6A-S         = ({})", new String(methodOut.getAS6())); 
//  DISPLAY '* 245* WS-6A-T-R       = (' WS-6A-T-R ')'
          logger.info("* 245* WS-6A-T-R       = ({})", new String(methodIn.getATR6())); 
//  DISPLAY '* 246* WS-6A-T         = (' WS-6A-T ')'
          logger.info("* 246* WS-6A-T         = ({})", methodOut.getAT6().toString()); 
//  DISPLAY '* 247*   WS-6A-T-FLD1  = (' WS-6A-T-FLD1 ')'
          logger.info("* 247*   WS-6A-T-FLD1  = ({})", new String(methodOut.getATFld16())); 
//  DISPLAY '* 248*   WS-6A-T-FLD2  = (' WS-6A-T-FLD2 ')'
          logger.info("* 248*   WS-6A-T-FLD2  = ({})", new String(methodOut.getATFld26())); 

// *
//  INITIALIZE WS-6A-S WS-6A-T
          methodOut.setAS6(CONSTANTS.SPACE_70 /* Fill 70 Spaces*/);
          methodOut.getAT6().initialize();
//  MOVE ALL 'ABCD' TO WS-6A-S
          methodOut.setAS6(CONSTANTS.LITERAL_1222519919);
//  MOVE LENGTH OF WS-6A-S TO WS-S-LEN
          methodOut.setSLen((short) A_S_6_LENGTH);
//  MOVE LENGTH OF WS-6A-T TO WS-T-LEN
          methodOut.setTLen((short) AT6.getAT6FieldLength());
//  MOVE WS-6A-S ( 1 : WS-S-LEN ) TO WS-6A-T ( 1 : WS-T-LEN )
          methodOut.getATGroup6().replace(methodIn.getASGrp6()/*parent*/,3/*fromOffset - (aT6) */,methodOut.getSLen()/*fromLen*/,0/*toOffset - (aS6) */,methodOut.getTLen()/*toLen*/);

// *
//  DISPLAY '* 249* WS-6A-S-GRP     = (' WS-6A-S-GRP ')'
          logger.info("* 249* WS-6A-S-GRP     = ({})", methodIn.getASGrp6().toString()); 
//  DISPLAY '* 250* WS-6A-S         = (' WS-6A-S ')'
          logger.info("* 250* WS-6A-S         = ({})", new String(methodOut.getAS6())); 
//  DISPLAY '* 251* WS-6A-T-R       = (' WS-6A-T-R ')'
          logger.info("* 251* WS-6A-T-R       = ({})", new String(methodIn.getATR6())); 
//  DISPLAY '* 252* WS-6A-T         = (' WS-6A-T ')'
          logger.info("* 252* WS-6A-T         = ({})", methodOut.getAT6().toString()); 
//  DISPLAY '* 253*   WS-6A-T-FLD1  = (' WS-6A-T-FLD1 ')'
          logger.info("* 253*   WS-6A-T-FLD1  = ({})", new String(methodOut.getATFld16())); 
//  DISPLAY '* 254*   WS-6A-T-FLD2  = (' WS-6A-T-FLD2 ')'
          logger.info("* 254*   WS-6A-T-FLD2  = ({})", new String(methodOut.getATFld26())); 

// *
// * Src -> string; tgt -> group ; src smaller than tgt; srcoffset 3
// *
//  INITIALIZE WS-6B-S WS-6B-T
          methodOut.setBS6(CONSTANTS.SPACE_70 /* Fill 70 Spaces*/);
          methodOut.getBT6().initialize();
//  MOVE ALL 'ABCD' TO WS-6B-S
          methodOut.setBS6(CONSTANTS.LITERAL_1222519919);
//  MOVE ALL 'MNOP' TO WS-6B-T-FLD3
          methodOut.setBTFld36(CONSTANTS.LITERAL_MNOPMNOPMNOPMNOPMNOPMNOPMNOPMNOP);
//  MOVE WS-6B-S ( 1 : LENGTH OF WS-6B-S ) TO WS-6B-T ( 1 : LENGTH OF WS-6B-T )
          methodOut.getBTGroup6().replace(methodIn.getBSGrp6()/*parent*/,3/*fromOffset - (bT6) */,B_S_6_LENGTH/*fromLen*/,0/*toOffset - (bS6) */,BT6.getBT6FieldLength()/*toLen*/);

// *
//  DISPLAY '* 255* WS-6B-S-GRP     = (' WS-6B-S-GRP ')'
          logger.info("* 255* WS-6B-S-GRP     = ({})", methodIn.getBSGrp6().toString()); 
//  DISPLAY '* 256* WS-6B-S         = (' WS-6B-S ')'
          logger.info("* 256* WS-6B-S         = ({})", new String(methodOut.getBS6())); 
//  DISPLAY '* 257* WS-6B-T-R       = (' WS-6B-T-R ')'
          logger.info("* 257* WS-6B-T-R       = ({})", new String(methodIn.getBTR6())); 
//  DISPLAY '* 258* WS-6B-T         = (' WS-6B-T ')'
          logger.info("* 258* WS-6B-T         = ({})", methodOut.getBT6().toString()); 
//  DISPLAY '* 259*   WS-6B-T-FLD1  = (' WS-6B-T-FLD1 ')'
          logger.info("* 259*   WS-6B-T-FLD1  = ({})", new String(methodOut.getBTFld16())); 
//  DISPLAY '* 260*   WS-6B-T-FLD2  = (' WS-6B-T-FLD2 ')'
          logger.info("* 260*   WS-6B-T-FLD2  = ({})", new String(methodOut.getBTFld26())); 
//  DISPLAY '* 261*   WS-6B-T-FLD3  = (' WS-6B-T-FLD3 ')'
          logger.info("* 261*   WS-6B-T-FLD3  = ({})", new String(methodOut.getBTFld36())); 
      
      return methodOut;
      }
      /**
      * mainlineSplit9 
      *   This method is derived from 
  *   COBOL Paragraph - MAINLINE-SPLIT9 COBOL Cyclomatic complexity - 1
      * Input  :  

      * - bSGrp6                         COBOL Name: WS-6B-S-GRP
      * - bTR6                           COBOL Name: WS-6B-T-R
      * - aTGrpR7                        COBOL Name: WS-7A-T-GRP-R
      * - aTGrp7                         COBOL Name: WS-7A-T-GRP
      * - bTGrpR7                        COBOL Name: WS-7B-T-GRP-R
      * - bTGrp7                         COBOL Name: WS-7B-T-GRP
      *
      * Output :  

      * - bS6                            COBOL Name: WS-6B-S
      * - bT6                            COBOL Name: WS-6B-T
      * - bTFld36                        COBOL Name: WS-6B-T-FLD3
      * - sLen                           COBOL Name: WS-S-LEN
      * - tLen                           COBOL Name: WS-T-LEN
      * - bTFld16                        COBOL Name: WS-6B-T-FLD1
      * - bTFld26                        COBOL Name: WS-6B-T-FLD2
      * - aS7                            COBOL Name: WS-7A-S
      * - aT7                            COBOL Name: WS-7A-T
      * - aSFld17                        COBOL Name: WS-7A-S-FLD1
      * - aSFld27                        COBOL Name: WS-7A-S-FLD2
      * - aTFld17                        COBOL Name: WS-7A-T-FLD1
      * - aTFld27                        COBOL Name: WS-7A-T-FLD2
      * - bS7                            COBOL Name: WS-7B-S
      * - bT7                            COBOL Name: WS-7B-T
      * - bSFld17                        COBOL Name: WS-7B-S-FLD1
      * - bSFld27                        COBOL Name: WS-7B-S-FLD2
      * - bTFld37                        COBOL Name: WS-7B-T-FLD3
      * - bTFld17                        COBOL Name: WS-7B-T-FLD1
      *
      * @throws CFException
      */
      @Override
      public MainlineSplit9OutCtx mainlineSplit9(MainlineSplit9InCtx methodIn) throws Exception {
			// Declare local variables used in the method
			 final int B_S_6_LENGTH = 70;
			// End of variable declaration

Refmod1Ctx programCtx = methodIn.getRefmod1Ctx();
MainlineSplit9OutCtx methodOut = methodIn.getMainlineSplit9OutCtx();

// *
//  INITIALIZE WS-6B-S WS-6B-T
          methodOut.setBS6(CONSTANTS.SPACE_70 /* Fill 70 Spaces*/);
          methodOut.getBT6().initialize();
//  MOVE ALL 'ABCD' TO WS-6B-S
          methodOut.setBS6(CONSTANTS.LITERAL_1222519919);
//  MOVE ALL 'MNOP' TO WS-6B-T-FLD3
          methodOut.setBTFld36(CONSTANTS.LITERAL_MNOPMNOPMNOPMNOPMNOPMNOPMNOPMNOP);
//  MOVE LENGTH OF WS-6B-S TO WS-S-LEN
          methodOut.setSLen((short) B_S_6_LENGTH);
//  MOVE LENGTH OF WS-6B-T TO WS-T-LEN
          methodOut.setTLen((short) BT6.getBT6FieldLength());
//  MOVE WS-6B-S ( 1 : WS-S-LEN ) TO WS-6B-T ( 1 : WS-T-LEN )
          methodOut.getBTGroup6().replace(methodIn.getBSGrp6()/*parent*/,3/*fromOffset - (bT6) */,methodOut.getSLen()/*fromLen*/,0/*toOffset - (bS6) */,methodOut.getTLen()/*toLen*/);

// *
//  DISPLAY '* 262* WS-6B-S-GRP     = (' WS-6B-S-GRP ')'
          logger.info("* 262* WS-6B-S-GRP     = ({})", methodIn.getBSGrp6().toString()); 
//  DISPLAY '* 263* WS-6B-S         = (' WS-6B-S ')'
          logger.info("* 263* WS-6B-S         = ({})", new String(methodOut.getBS6())); 
//  DISPLAY '* 264* WS-6B-T-R       = (' WS-6B-T-R ')'
          logger.info("* 264* WS-6B-T-R       = ({})", new String(methodIn.getBTR6())); 
//  DISPLAY '* 265* WS-6B-T         = (' WS-6B-T ')'
          logger.info("* 265* WS-6B-T         = ({})", methodOut.getBT6().toString()); 
//  DISPLAY '* 266*   WS-6B-T-FLD1  = (' WS-6B-T-FLD1 ')'
          logger.info("* 266*   WS-6B-T-FLD1  = ({})", new String(methodOut.getBTFld16())); 
//  DISPLAY '* 267*   WS-6B-T-FLD2  = (' WS-6B-T-FLD2 ')'
          logger.info("* 267*   WS-6B-T-FLD2  = ({})", new String(methodOut.getBTFld26())); 
//  DISPLAY '* 268*   WS-6B-T-FLD3  = (' WS-6B-T-FLD3 ')'
          logger.info("* 268*   WS-6B-T-FLD3  = ({})", new String(methodOut.getBTFld36())); 

// *
// * Src -> group; tgt -> group ; src bigger than tgt ; tgt offset 5
// *
//  INITIALIZE WS-7A-S WS-7A-T
          methodOut.getAS7().initialize();
          methodOut.getAT7().initialize();
//  MOVE ALL 'ABCD' TO WS-7A-S-FLD1
          methodOut.setASFld17(CONSTANTS.LITERAL_ABCDABCDABCDABCDABCDABCDABCDABCD);
//  MOVE ALL 'ZYXW' TO WS-7A-S-FLD2
          methodOut.setASFld27(CONSTANTS.LITERAL_645286444);
//  MOVE WS-7A-S ( 1 : LENGTH OF WS-7A-S ) TO WS-7A-T ( 1 : LENGTH OF WS-7A-T )
          methodOut.getAT7().replace(methodOut.getAS7(),0,AS7.getAS7FieldLength(),methodOut.getAT7().begin,AT7.getAT7FieldLength() /* replace,sourceIndex,sourceLen,targetIndex,targetLen */);

// *
//  DISPLAY '* 269* WS-7A-S         = (' WS-7A-S ')'
          logger.info("* 269* WS-7A-S         = ({})", methodOut.getAS7().toString()); 
//  DISPLAY '* 270*   WS-7A-S-FLD1  = (' WS-7A-S-FLD1 ')'
          logger.info("* 270*   WS-7A-S-FLD1  = ({})", new String(methodOut.getASFld17())); 
//  DISPLAY '* 271*   WS-7A-S-FLD2  = (' WS-7A-S-FLD2 ')'
          logger.info("* 271*   WS-7A-S-FLD2  = ({})", new String(methodOut.getASFld27())); 
//  DISPLAY '* 272* WS-7A-T-GRP-R   = (' WS-7A-T-GRP-R ')'
          logger.info("* 272* WS-7A-T-GRP-R   = ({})", new String(methodIn.getATGrpR7())); 
//  DISPLAY '* 273* WS-7A-T-GRP     = (' WS-7A-T-GRP ')'
          logger.info("* 273* WS-7A-T-GRP     = ({})", methodIn.getATGrp7().toString()); 
//  DISPLAY '* 274* WS-7A-T         = (' WS-7A-T ')'
          logger.info("* 274* WS-7A-T         = ({})", methodOut.getAT7().toString()); 
//  DISPLAY '* 275*   WS-7A-T-FLD1  = (' WS-7A-T-FLD1 ')'
          logger.info("* 275*   WS-7A-T-FLD1  = ({})", new String(methodOut.getATFld17())); 
//  DISPLAY '* 276*   WS-7A-T-FLD2  = (' WS-7A-T-FLD2 ')'
          logger.info("* 276*   WS-7A-T-FLD2  = ({})", new String(methodOut.getATFld27())); 

// *
//  INITIALIZE WS-7A-S WS-7A-T
          methodOut.getAS7().initialize();
          methodOut.getAT7().initialize();
//  MOVE ALL 'ABCD' TO WS-7A-S-FLD1
          methodOut.setASFld17(CONSTANTS.LITERAL_ABCDABCDABCDABCDABCDABCDABCDABCD);
//  MOVE ALL 'ZYXW' TO WS-7A-S-FLD2
          methodOut.setASFld27(CONSTANTS.LITERAL_645286444);
//  MOVE LENGTH OF WS-7A-S TO WS-S-LEN
          methodOut.setSLen((short) AS7.getAS7FieldLength());
//  MOVE LENGTH OF WS-7A-T TO WS-T-LEN
          methodOut.setTLen((short) AT7.getAT7FieldLength());
//  MOVE WS-7A-S ( 1 : WS-S-LEN ) TO WS-7A-T ( 1 : WS-T-LEN )
          methodOut.getAT7().replace(methodOut.getAS7(),0,methodOut.getSLen(),methodOut.getAT7().begin,methodOut.getTLen() /* replace,sourceIndex,sourceLen,targetIndex,targetLen */);

// *
//  DISPLAY '* 277* WS-7A-S         = (' WS-7A-S ')'
          logger.info("* 277* WS-7A-S         = ({})", methodOut.getAS7().toString()); 
//  DISPLAY '* 278*   WS-7A-S-FLD1  = (' WS-7A-S-FLD1 ')'
          logger.info("* 278*   WS-7A-S-FLD1  = ({})", new String(methodOut.getASFld17())); 
//  DISPLAY '* 279*   WS-7A-S-FLD2  = (' WS-7A-S-FLD2 ')'
          logger.info("* 279*   WS-7A-S-FLD2  = ({})", new String(methodOut.getASFld27())); 
//  DISPLAY '* 280* WS-7A-T-GRP-R   = (' WS-7A-T-GRP-R ')'
          logger.info("* 280* WS-7A-T-GRP-R   = ({})", new String(methodIn.getATGrpR7())); 
//  DISPLAY '* 281* WS-7A-T-GRP     = (' WS-7A-T-GRP ')'
          logger.info("* 281* WS-7A-T-GRP     = ({})", methodIn.getATGrp7().toString()); 
//  DISPLAY '* 282* WS-7A-T         = (' WS-7A-T ')'
          logger.info("* 282* WS-7A-T         = ({})", methodOut.getAT7().toString()); 
//  DISPLAY '* 283*   WS-7A-T-FLD1  = (' WS-7A-T-FLD1 ')'
          logger.info("* 283*   WS-7A-T-FLD1  = ({})", new String(methodOut.getATFld17())); 
//  DISPLAY '* 284*   WS-7A-T-FLD2  = (' WS-7A-T-FLD2 ')'
          logger.info("* 284*   WS-7A-T-FLD2  = ({})", new String(methodOut.getATFld27())); 

// *
// * Src -> group; tgt -> group ; src smaller than tgt ;tgt offset 5
// *
//  INITIALIZE WS-7B-S WS-7B-T
          methodOut.getBS7().initialize();
          methodOut.getBT7().initialize();
//  MOVE ALL 'ABCD' TO WS-7B-S-FLD1
          methodOut.setBSFld17(CONSTANTS.LITERAL_ABCDABCDABCDABCDABCDABCDABCDABCD);
//  MOVE ALL 'ZYXW' TO WS-7B-S-FLD2
          methodOut.setBSFld27(CONSTANTS.LITERAL_645286444);
//  MOVE ALL 'MNOP' TO WS-7B-T-FLD3
          methodOut.setBTFld37(CONSTANTS.LITERAL_MNOPMNOPMNOPMNOPMNOPMNOPMNOPMNOP);
//  MOVE WS-7B-S ( 1 : LENGTH OF WS-7B-S ) TO WS-7B-T ( 1 : LENGTH OF WS-7B-T )
          methodOut.getBT7().replace(methodOut.getBS7(),0,BS7.getBS7FieldLength(),methodOut.getBT7().begin,BT7.getBT7FieldLength() /* replace,sourceIndex,sourceLen,targetIndex,targetLen */);

// *
//  DISPLAY '* 285* WS-7B-S         = (' WS-7B-S ')'
          logger.info("* 285* WS-7B-S         = ({})", methodOut.getBS7().toString()); 
//  DISPLAY '* 286*   WS-7B-S-FLD1  = (' WS-7B-S-FLD1 ')'
          logger.info("* 286*   WS-7B-S-FLD1  = ({})", new String(methodOut.getBSFld17())); 
//  DISPLAY '* 287*   WS-7B-S-FLD2  = (' WS-7B-S-FLD2 ')'
          logger.info("* 287*   WS-7B-S-FLD2  = ({})", new String(methodOut.getBSFld27())); 
//  DISPLAY '* 288* WS-7B-T-GRP-R   = (' WS-7B-T-GRP-R ')'
          logger.info("* 288* WS-7B-T-GRP-R   = ({})", new String(methodIn.getBTGrpR7())); 
//  DISPLAY '* 289* WS-7B-T-GRP     = (' WS-7B-T-GRP ')'
          logger.info("* 289* WS-7B-T-GRP     = ({})", methodIn.getBTGrp7().toString()); 
//  DISPLAY '* 290* WS-7B-T         = (' WS-7B-T ')'
          logger.info("* 290* WS-7B-T         = ({})", methodOut.getBT7().toString()); 
//  DISPLAY '* 291*   WS-7B-T-FLD1  = (' WS-7B-T-FLD1 ')'
          logger.info("* 291*   WS-7B-T-FLD1  = ({})", new String(methodOut.getBTFld17())); 
      
      return methodOut;
      }
      /**
      * mainlineSplit10 
      *   This method is derived from 
  *   COBOL Paragraph - MAINLINE-SPLIT10 COBOL Cyclomatic complexity - 1
      * Input  :  

      * - bTFld27                        COBOL Name: WS-7B-T-FLD2
      * - bTFld37                        COBOL Name: WS-7B-T-FLD3
      * - aTGrpR8                        COBOL Name: WS-8A-T-GRP-R
      * - aTGrp8                         COBOL Name: WS-8A-T-GRP
      * - bTGrpR8                        COBOL Name: WS-8B-T-GRP-R
      * - bTGrp8                         COBOL Name: WS-8B-T-GRP
      * - aSGrp9                         COBOL Name: WS-9A-S-GRP
      *
      * Output :  

      * - aS8                            COBOL Name: WS-8A-S
      * - aT8                            COBOL Name: WS-8A-T
      * - aTFld18                        COBOL Name: WS-8A-T-FLD1
      * - aTFld28                        COBOL Name: WS-8A-T-FLD2
      * - sLen                           COBOL Name: WS-S-LEN
      * - tLen                           COBOL Name: WS-T-LEN
      * - bS8                            COBOL Name: WS-8B-S
      * - bT8                            COBOL Name: WS-8B-T
      * - bTFld38                        COBOL Name: WS-8B-T-FLD3
      * - bTFld18                        COBOL Name: WS-8B-T-FLD1
      * - bTFld28                        COBOL Name: WS-8B-T-FLD2
      * - aS9                            COBOL Name: WS-9A-S
      * - aT9                            COBOL Name: WS-9A-T
      * - aSFld19                        COBOL Name: WS-9A-S-FLD1
      * - aSFld29                        COBOL Name: WS-9A-S-FLD2
      *
      * @throws CFException
      */
      @Override
      public MainlineSplit10OutCtx mainlineSplit10(MainlineSplit10InCtx methodIn) throws Exception {
			// Declare local variables used in the method
			 final int A_S_8_LENGTH = 70;
			 final int B_S_8_LENGTH = 70;
			// End of variable declaration

Refmod1Ctx programCtx = methodIn.getRefmod1Ctx();
MainlineSplit10OutCtx methodOut = methodIn.getMainlineSplit10OutCtx();
//  DISPLAY '* 292*   WS-7B-T-FLD2  = (' WS-7B-T-FLD2 ')'
          logger.info("* 292*   WS-7B-T-FLD2  = ({})", new String(methodIn.getBTFld27())); 
//  DISPLAY '* 293*   WS-7B-T-FLD3  = (' WS-7B-T-FLD3 ')'
          logger.info("* 293*   WS-7B-T-FLD3  = ({})", new String(methodIn.getBTFld37())); 

// *
// * Src -> string; tgt -> group ; src bigger than tgt ; tgtoffset 5
// *
//  INITIALIZE WS-8A-S WS-8A-T
          methodOut.setAS8(CONSTANTS.SPACE_70 /* Fill 70 Spaces*/);
          methodOut.getAT8().initialize();
          // MOVE ALL 'ABCD' TO WS-8A-S
          methodOut.setAS8(CONSTANTS.LITERAL_1222519919);
//  MOVE WS-8A-S ( 1 : LENGTH OF WS-8A-S ) TO WS-8A-T ( 1 : LENGTH OF WS-8A-T )
          methodOut.getAT8().replace(methodOut.getAS8(),0/* aS8 */ ,A_S_8_LENGTH,methodOut.getAT8().begin /* aT8 */,AT8.getAT8FieldLength() /* replace,startIndex,targetLen */);

// *
//  DISPLAY '* 294* WS-8A-S         = (' WS-8A-S ')'
          logger.info("* 294* WS-8A-S         = ({})", new String(methodOut.getAS8())); 
//  DISPLAY '* 295* WS-8A-T-GRP-R   = (' WS-8A-T-GRP-R ')'
          logger.info("* 295* WS-8A-T-GRP-R   = ({})", new String(methodIn.getATGrpR8())); 
//  DISPLAY '* 296* WS-8A-T-GRP     = (' WS-8A-T-GRP ')'
          logger.info("* 296* WS-8A-T-GRP     = ({})", methodIn.getATGrp8().toString()); 
//  DISPLAY '* 297* WS-8A-T         = (' WS-8A-T ')'
          logger.info("* 297* WS-8A-T         = ({})", methodOut.getAT8().toString()); 
//  DISPLAY '* 298*   WS-8A-T-FLD1  = (' WS-8A-T-FLD1 ')'
          logger.info("* 298*   WS-8A-T-FLD1  = ({})", new String(methodOut.getATFld18())); 
//  DISPLAY '* 299*   WS-8A-T-FLD2  = (' WS-8A-T-FLD2 ')'
          logger.info("* 299*   WS-8A-T-FLD2  = ({})", new String(methodOut.getATFld28())); 

// *
//  INITIALIZE WS-8A-S WS-8A-T
          methodOut.setAS8(CONSTANTS.SPACE_70 /* Fill 70 Spaces*/);
          methodOut.getAT8().initialize();
          // MOVE ALL 'ABCD' TO WS-8A-S
          methodOut.setAS8(CONSTANTS.LITERAL_1222519919);
//  MOVE LENGTH OF WS-8A-S TO WS-S-LEN
          methodOut.setSLen((short) A_S_8_LENGTH);
//  MOVE LENGTH OF WS-8A-T TO WS-T-LEN
          methodOut.setTLen((short) AT8.getAT8FieldLength());
//  MOVE WS-8A-S ( 1 : WS-S-LEN ) TO WS-8A-T ( 1 : WS-T-LEN )
          methodOut.getAT8().replace(methodOut.getAS8(),0/* aS8 */ ,methodOut.getSLen(),methodOut.getAT8().begin /* aT8 */,methodOut.getTLen() /* replace,startIndex,targetLen */);

// *
//  DISPLAY '* 300* WS-8A-S         = (' WS-8A-S ')'
          logger.info("* 300* WS-8A-S         = ({})", new String(methodOut.getAS8())); 
//  DISPLAY '* 301* WS-8A-T-GRP-R   = (' WS-8A-T-GRP-R ')'
          logger.info("* 301* WS-8A-T-GRP-R   = ({})", new String(methodIn.getATGrpR8())); 
//  DISPLAY '* 302* WS-8A-T-GRP     = (' WS-8A-T-GRP ')'
          logger.info("* 302* WS-8A-T-GRP     = ({})", methodIn.getATGrp8().toString()); 
//  DISPLAY '* 303* WS-8A-T         = (' WS-8A-T ')'
          logger.info("* 303* WS-8A-T         = ({})", methodOut.getAT8().toString()); 
//  DISPLAY '* 304*   WS-8A-T-FLD1  = (' WS-8A-T-FLD1 ')'
          logger.info("* 304*   WS-8A-T-FLD1  = ({})", new String(methodOut.getATFld18())); 
//  DISPLAY '* 305*   WS-8A-T-FLD2  = (' WS-8A-T-FLD2 ')'
          logger.info("* 305*   WS-8A-T-FLD2  = ({})", new String(methodOut.getATFld28())); 

// *
// * Src -> string; tgt -> group ; src smaller than tgt; tgtoffset 5
// *
//  INITIALIZE WS-8B-S WS-8B-T
          methodOut.setBS8(CONSTANTS.SPACE_70 /* Fill 70 Spaces*/);
          methodOut.getBT8().initialize();
          // MOVE ALL 'ABCD' TO WS-8B-S
          methodOut.setBS8(CONSTANTS.LITERAL_1222519919);
//  MOVE ALL 'MNOP' TO WS-8B-T-FLD3
          methodOut.setBTFld38(CONSTANTS.LITERAL_MNOPMNOPMNOPMNOPMNOPMNOPMNOPMNOP);
//  MOVE WS-8B-S ( 1 : LENGTH OF WS-8B-S ) TO WS-8B-T ( 1 : LENGTH OF WS-8B-T )
          methodOut.getBT8().replace(methodOut.getBS8(),0/* bS8 */ ,B_S_8_LENGTH,methodOut.getBT8().begin /* bT8 */,BT8.getBT8FieldLength() /* replace,startIndex,targetLen */);

// *
//  DISPLAY '* 306* WS-8B-S         = (' WS-8B-S ')'
          logger.info("* 306* WS-8B-S         = ({})", new String(methodOut.getBS8())); 
//  DISPLAY '* 307* WS-8B-T-GRP-R   = (' WS-8B-T-GRP-R ')'
          logger.info("* 307* WS-8B-T-GRP-R   = ({})", new String(methodIn.getBTGrpR8())); 
//  DISPLAY '* 308* WS-8B-T-GRP     = (' WS-8B-T-GRP ')'
          logger.info("* 308* WS-8B-T-GRP     = ({})", methodIn.getBTGrp8().toString()); 
//  DISPLAY '* 309* WS-8B-T         = (' WS-8B-T ')'
          logger.info("* 309* WS-8B-T         = ({})", methodOut.getBT8().toString()); 
//  DISPLAY '* 310*   WS-8B-T-FLD1  = (' WS-8B-T-FLD1 ')'
          logger.info("* 310*   WS-8B-T-FLD1  = ({})", new String(methodOut.getBTFld18())); 
//  DISPLAY '* 311*   WS-8B-T-FLD2  = (' WS-8B-T-FLD2 ')'
          logger.info("* 311*   WS-8B-T-FLD2  = ({})", new String(methodOut.getBTFld28())); 
//  DISPLAY '* 312*   WS-8B-T-FLD3  = (' WS-8B-T-FLD3 ')'
          logger.info("* 312*   WS-8B-T-FLD3  = ({})", new String(methodOut.getBTFld38())); 

// *
//  INITIALIZE WS-8B-S WS-8B-T
          methodOut.setBS8(CONSTANTS.SPACE_70 /* Fill 70 Spaces*/);
          methodOut.getBT8().initialize();
          // MOVE ALL 'ABCD' TO WS-8B-S
          methodOut.setBS8(CONSTANTS.LITERAL_1222519919);
//  MOVE ALL 'MNOP' TO WS-8B-T-FLD3
          methodOut.setBTFld38(CONSTANTS.LITERAL_MNOPMNOPMNOPMNOPMNOPMNOPMNOPMNOP);
//  MOVE LENGTH OF WS-8B-S TO WS-S-LEN
          methodOut.setSLen((short) B_S_8_LENGTH);
//  MOVE LENGTH OF WS-8B-T TO WS-T-LEN
          methodOut.setTLen((short) BT8.getBT8FieldLength());
//  MOVE WS-8B-S ( 1 : WS-S-LEN ) TO WS-8B-T ( 1 : WS-T-LEN )
          methodOut.getBT8().replace(methodOut.getBS8(),0/* bS8 */ ,methodOut.getSLen(),methodOut.getBT8().begin /* bT8 */,methodOut.getTLen() /* replace,startIndex,targetLen */);

// *
//  DISPLAY '* 313* WS-8B-S         = (' WS-8B-S ')'
          logger.info("* 313* WS-8B-S         = ({})", new String(methodOut.getBS8())); 
//  DISPLAY '* 314* WS-8B-T-GRP-R   = (' WS-8B-T-GRP-R ')'
          logger.info("* 314* WS-8B-T-GRP-R   = ({})", new String(methodIn.getBTGrpR8())); 
//  DISPLAY '* 315* WS-8B-T-GRP     = (' WS-8B-T-GRP ')'
          logger.info("* 315* WS-8B-T-GRP     = ({})", methodIn.getBTGrp8().toString()); 
//  DISPLAY '* 316* WS-8B-T         = (' WS-8B-T ')'
          logger.info("* 316* WS-8B-T         = ({})", methodOut.getBT8().toString()); 
//  DISPLAY '* 317*   WS-8B-T-FLD1  = (' WS-8B-T-FLD1 ')'
          logger.info("* 317*   WS-8B-T-FLD1  = ({})", new String(methodOut.getBTFld18())); 
//  DISPLAY '* 318*   WS-8B-T-FLD2  = (' WS-8B-T-FLD2 ')'
          logger.info("* 318*   WS-8B-T-FLD2  = ({})", new String(methodOut.getBTFld28())); 
//  DISPLAY '* 319*   WS-8B-T-FLD3  = (' WS-8B-T-FLD3 ')'
          logger.info("* 319*   WS-8B-T-FLD3  = ({})", new String(methodOut.getBTFld38())); 

// *
// * Src -> group; tgt -> group ; src bigger than tgt
// * source offset 3 ; target offset 5
// *
//  INITIALIZE WS-9A-S WS-9A-T
          methodOut.getAS9().initialize();
          methodOut.getAT9().initialize();
//  MOVE ALL 'ABCD' TO WS-9A-S-FLD1
          methodOut.setASFld19(CONSTANTS.LITERAL_ABCDABCDABCDABCDABCDABCDABCDABCD);
//  MOVE ALL 'ZYXW' TO WS-9A-S-FLD2
          methodOut.setASFld29(CONSTANTS.LITERAL_645286444);
//  MOVE WS-9A-S ( 1 : LENGTH OF WS-9A-S ) TO WS-9A-T ( 1 : LENGTH OF WS-9A-T )
          methodOut.getATGrpGroup9().replace(methodIn.getASGrp9()/*parent*/,3/*fromOffset - (aT9) */,AS9.getAS9FieldLength()/*fromLen*/,5/*toOffset - (aS9) */,AT9.getAT9FieldLength()/*toLen*/);

// *
//  DISPLAY '* 320* WS-9A-S-GRP     = (' WS-9A-S-GRP ')'
          logger.info("* 320* WS-9A-S-GRP     = ({})", methodIn.getASGrp9().toString()); 
      
      return methodOut;
      }
      /**
      * mainlineSplit11 
      *   This method is derived from 
  *   COBOL Paragraph - MAINLINE-SPLIT11 COBOL Cyclomatic complexity - 1
      * Input  :  

      * - aS9                            COBOL Name: WS-9A-S
      * - aSFld19                        COBOL Name: WS-9A-S-FLD1
      * - aSFld29                        COBOL Name: WS-9A-S-FLD2
      * - aTGrpR9                        COBOL Name: WS-9A-T-GRP-R
      * - aTGrp9                         COBOL Name: WS-9A-T-GRP
      * - aT9                            COBOL Name: WS-9A-T
      * - aTFld19                        COBOL Name: WS-9A-T-FLD1
      * - aTFld29                        COBOL Name: WS-9A-T-FLD2
      * - aSGrp9                         COBOL Name: WS-9A-S-GRP
      * - bSGrp9                         COBOL Name: WS-9B-S-GRP
      * - bTGrpR9                        COBOL Name: WS-9B-T-GRP-R
      * - bTGrp9                         COBOL Name: WS-9B-T-GRP
      *
      * Output :  

      * - aS9                            COBOL Name: WS-9A-S
      * - aT9                            COBOL Name: WS-9A-T
      * - aSFld19                        COBOL Name: WS-9A-S-FLD1
      * - aSFld29                        COBOL Name: WS-9A-S-FLD2
      * - sLen                           COBOL Name: WS-S-LEN
      * - tLen                           COBOL Name: WS-T-LEN
      * - bS9                            COBOL Name: WS-9B-S
      * - bT9                            COBOL Name: WS-9B-T
      * - bSFld19                        COBOL Name: WS-9B-S-FLD1
      * - bSFld29                        COBOL Name: WS-9B-S-FLD2
      * - bTFld39                        COBOL Name: WS-9B-T-FLD3
      * - bTFld19                        COBOL Name: WS-9B-T-FLD1
      * - bTFld29                        COBOL Name: WS-9B-T-FLD2
      *
      * @throws CFException
      */
      @Override
      public MainlineSplit11OutCtx mainlineSplit11(MainlineSplit11InCtx methodIn) throws Exception {
Refmod1Ctx programCtx = methodIn.getRefmod1Ctx();
MainlineSplit11OutCtx methodOut = methodIn.getMainlineSplit11OutCtx();
//  DISPLAY '* 321* WS-9A-S         = (' WS-9A-S ')'
          logger.info("* 321* WS-9A-S         = ({})", methodOut.getAS9().toString()); 
//  DISPLAY '* 322*   WS-9A-S-FLD1  = (' WS-9A-S-FLD1 ')'
          logger.info("* 322*   WS-9A-S-FLD1  = ({})", new String(methodOut.getASFld19())); 
//  DISPLAY '* 323*   WS-9A-S-FLD2  = (' WS-9A-S-FLD2 ')'
          logger.info("* 323*   WS-9A-S-FLD2  = ({})", new String(methodOut.getASFld29())); 
//  DISPLAY '* 324* WS-9A-T-GRP-R   = (' WS-9A-T-GRP-R ')'
          logger.info("* 324* WS-9A-T-GRP-R   = ({})", new String(methodIn.getATGrpR9())); 
//  DISPLAY '* 325* WS-9A-T-GRP     = (' WS-9A-T-GRP ')'
          logger.info("* 325* WS-9A-T-GRP     = ({})", methodIn.getATGrp9().toString()); 
//  DISPLAY '* 326* WS-9A-T         = (' WS-9A-T ')'
          logger.info("* 326* WS-9A-T         = ({})", methodOut.getAT9().toString()); 
//  DISPLAY '* 327*   WS-9A-T-FLD1  = (' WS-9A-T-FLD1 ')'
          logger.info("* 327*   WS-9A-T-FLD1  = ({})", new String(methodIn.getATFld19())); 
//  DISPLAY '* 328*   WS-9A-T-FLD2  = (' WS-9A-T-FLD2 ')'
          logger.info("* 328*   WS-9A-T-FLD2  = ({})", new String(methodIn.getATFld29())); 

// *
//  INITIALIZE WS-9A-S WS-9A-T
          methodOut.getAS9().initialize();
          methodOut.getAT9().initialize();
//  MOVE ALL 'ABCD' TO WS-9A-S-FLD1
          methodOut.setASFld19(CONSTANTS.LITERAL_ABCDABCDABCDABCDABCDABCDABCDABCD);
//  MOVE ALL 'ZYXW' TO WS-9A-S-FLD2
          methodOut.setASFld29(CONSTANTS.LITERAL_645286444);
//  MOVE LENGTH OF WS-9A-S TO WS-S-LEN
          methodOut.setSLen((short) AS9.getAS9FieldLength());
//  MOVE LENGTH OF WS-9A-T TO WS-T-LEN
          methodOut.setTLen((short) AT9.getAT9FieldLength());
//  MOVE WS-9A-S ( 1 : WS-S-LEN ) TO WS-9A-T ( 1 : WS-T-LEN )
          methodOut.getATGrpGroup9().replace(methodIn.getASGrp9()/*parent*/,3/*fromOffset - (aT9) */,methodOut.getSLen()/*fromLen*/,5/*toOffset - (aS9) */,methodOut.getTLen()/*toLen*/);

// *
//  DISPLAY '* 329* WS-9A-S-GRP     = (' WS-9A-S-GRP ')'
          logger.info("* 329* WS-9A-S-GRP     = ({})", methodIn.getASGrp9().toString()); 
//  DISPLAY '* 330* WS-9A-S         = (' WS-9A-S ')'
          logger.info("* 330* WS-9A-S         = ({})", methodOut.getAS9().toString()); 
//  DISPLAY '* 331*   WS-9A-S-FLD1  = (' WS-9A-S-FLD1 ')'
          logger.info("* 331*   WS-9A-S-FLD1  = ({})", new String(methodOut.getASFld19())); 
//  DISPLAY '* 332*   WS-9A-S-FLD2  = (' WS-9A-S-FLD2 ')'
          logger.info("* 332*   WS-9A-S-FLD2  = ({})", new String(methodOut.getASFld29())); 
//  DISPLAY '* 333* WS-9A-T-GRP-R   = (' WS-9A-T-GRP-R ')'
          logger.info("* 333* WS-9A-T-GRP-R   = ({})", new String(methodIn.getATGrpR9())); 
//  DISPLAY '* 334* WS-9A-T-GRP     = (' WS-9A-T-GRP ')'
          logger.info("* 334* WS-9A-T-GRP     = ({})", methodIn.getATGrp9().toString()); 
//  DISPLAY '* 335* WS-9A-T         = (' WS-9A-T ')'
          logger.info("* 335* WS-9A-T         = ({})", methodOut.getAT9().toString()); 
//  DISPLAY '* 336*   WS-9A-T-FLD1  = (' WS-9A-T-FLD1 ')'
          logger.info("* 336*   WS-9A-T-FLD1  = ({})", new String(methodIn.getATFld19())); 
//  DISPLAY '* 337*   WS-9A-T-FLD2  = (' WS-9A-T-FLD2 ')'
          logger.info("* 337*   WS-9A-T-FLD2  = ({})", new String(methodIn.getATFld29())); 

// *
// * Src -> group; tgt -> group ; src smaller than tgt
// * source offset 3 ; target offset 5
// *
//  INITIALIZE WS-9B-S WS-9B-T
          methodOut.getBS9().initialize();
          methodOut.getBT9().initialize();
//  MOVE ALL 'ABCD' TO WS-9B-S-FLD1
          methodOut.setBSFld19(CONSTANTS.LITERAL_ABCDABCDABCDABCDABCDABCDABCDABCD);
//  MOVE ALL 'ZYXW' TO WS-9B-S-FLD2
          methodOut.setBSFld29(CONSTANTS.LITERAL_645286444);
//  MOVE ALL 'MNOP' TO WS-9B-T-FLD3
          methodOut.setBTFld39(CONSTANTS.LITERAL_MNOPMNOPMNOPMNOPMNOPMNOPMNOPMNOP);
//  MOVE WS-9B-S ( 1 : LENGTH OF WS-9B-S ) TO WS-9B-T ( 1 : LENGTH OF WS-9B-T )
          methodOut.getBTGrpGroup9().replace(methodIn.getBSGrp9()/*parent*/,3/*fromOffset - (bT9) */,BS9.getBS9FieldLength()/*fromLen*/,5/*toOffset - (bS9) */,BT9.getBT9FieldLength()/*toLen*/);

// *
//  DISPLAY '* 338* WS-9B-S-GRP     = (' WS-9B-S-GRP ')'
          logger.info("* 338* WS-9B-S-GRP     = ({})", methodIn.getBSGrp9().toString()); 
//  DISPLAY '* 339* WS-9B-S         = (' WS-9B-S ')'
          logger.info("* 339* WS-9B-S         = ({})", methodOut.getBS9().toString()); 
//  DISPLAY '* 340*   WS-9B-S-FLD1  = (' WS-9B-S-FLD1 ')'
          logger.info("* 340*   WS-9B-S-FLD1  = ({})", new String(methodOut.getBSFld19())); 
//  DISPLAY '* 341*   WS-9B-S-FLD2  = (' WS-9B-S-FLD2 ')'
          logger.info("* 341*   WS-9B-S-FLD2  = ({})", new String(methodOut.getBSFld29())); 
//  DISPLAY '* 342* WS-9B-T-GRP-R   = (' WS-9B-T-GRP-R ')'
          logger.info("* 342* WS-9B-T-GRP-R   = ({})", new String(methodIn.getBTGrpR9())); 
//  DISPLAY '* 343* WS-9B-T-GRP     = (' WS-9B-T-GRP ')'
          logger.info("* 343* WS-9B-T-GRP     = ({})", methodIn.getBTGrp9().toString()); 
//  DISPLAY '* 344* WS-9B-T         = (' WS-9B-T ')'
          logger.info("* 344* WS-9B-T         = ({})", methodOut.getBT9().toString()); 
//  DISPLAY '* 345*   WS-9B-T-FLD1  = (' WS-9B-T-FLD1 ')'
          logger.info("* 345*   WS-9B-T-FLD1  = ({})", new String(methodOut.getBTFld19())); 
//  DISPLAY '* 346*   WS-9B-T-FLD2  = (' WS-9B-T-FLD2 ')'
          logger.info("* 346*   WS-9B-T-FLD2  = ({})", new String(methodOut.getBTFld29())); 
//  DISPLAY '* 347*   WS-9B-T-FLD3  = (' WS-9B-T-FLD3 ')'
          logger.info("* 347*   WS-9B-T-FLD3  = ({})", new String(methodOut.getBTFld39())); 

// *
//  INITIALIZE WS-9B-S WS-9B-T
          methodOut.getBS9().initialize();
          methodOut.getBT9().initialize();
//  MOVE ALL 'ABCD' TO WS-9B-S-FLD1
          methodOut.setBSFld19(CONSTANTS.LITERAL_ABCDABCDABCDABCDABCDABCDABCDABCD);
//  MOVE ALL 'ZYXW' TO WS-9B-S-FLD2
          methodOut.setBSFld29(CONSTANTS.LITERAL_645286444);
//  MOVE ALL 'MNOP' TO WS-9B-T-FLD3
          methodOut.setBTFld39(CONSTANTS.LITERAL_MNOPMNOPMNOPMNOPMNOPMNOPMNOPMNOP);
//  MOVE LENGTH OF WS-9B-S TO WS-S-LEN
          methodOut.setSLen((short) BS9.getBS9FieldLength());
//  MOVE LENGTH OF WS-9B-T TO WS-T-LEN
          methodOut.setTLen((short) BT9.getBT9FieldLength());
//  MOVE WS-9B-S ( 1 : WS-S-LEN ) TO WS-9B-T ( 1 : WS-T-LEN )
          methodOut.getBTGrpGroup9().replace(methodIn.getBSGrp9()/*parent*/,3/*fromOffset - (bT9) */,methodOut.getSLen()/*fromLen*/,5/*toOffset - (bS9) */,methodOut.getTLen()/*toLen*/);

// *
//  DISPLAY '* 348* WS-9B-S-GRP     = (' WS-9B-S-GRP ')'
          logger.info("* 348* WS-9B-S-GRP     = ({})", methodIn.getBSGrp9().toString()); 
//  DISPLAY '* 349* WS-9B-S         = (' WS-9B-S ')'
          logger.info("* 349* WS-9B-S         = ({})", methodOut.getBS9().toString()); 
//  DISPLAY '* 350*   WS-9B-S-FLD1  = (' WS-9B-S-FLD1 ')'
          logger.info("* 350*   WS-9B-S-FLD1  = ({})", new String(methodOut.getBSFld19())); 
//  DISPLAY '* 351*   WS-9B-S-FLD2  = (' WS-9B-S-FLD2 ')'
          logger.info("* 351*   WS-9B-S-FLD2  = ({})", new String(methodOut.getBSFld29())); 
//  DISPLAY '* 352* WS-9B-T-GRP-R   = (' WS-9B-T-GRP-R ')'
          logger.info("* 352* WS-9B-T-GRP-R   = ({})", new String(methodIn.getBTGrpR9())); 
//  DISPLAY '* 353* WS-9B-T-GRP     = (' WS-9B-T-GRP ')'
          logger.info("* 353* WS-9B-T-GRP     = ({})", methodIn.getBTGrp9().toString()); 
      
      return methodOut;
      }
      /**
      * mainlineSplit12 
      *   This method is derived from 
  *   COBOL Paragraph - MAINLINE-SPLIT12 COBOL Cyclomatic complexity - 1
      * Input  :  

      * - bT9                            COBOL Name: WS-9B-T
      * - bTFld19                        COBOL Name: WS-9B-T-FLD1
      * - bTFld29                        COBOL Name: WS-9B-T-FLD2
      * - bTFld39                        COBOL Name: WS-9B-T-FLD3
      * - aSGrp10                        COBOL Name: WS-10A-S-GRP
      * - aTGrpR10                       COBOL Name: WS-10A-T-GRP-R
      * - aTGrp10                        COBOL Name: WS-10A-T-GRP
      * - bSGrp10                        COBOL Name: WS-10B-S-GRP
      * - bTGrpR10                       COBOL Name: WS-10B-T-GRP-R
      * - bTGrp10                        COBOL Name: WS-10B-T-GRP
      *
      * Output :  

      * - aS10                           COBOL Name: WS-10A-S
      * - aT10                           COBOL Name: WS-10A-T
      * - aTFld110                       COBOL Name: WS-10A-T-FLD1
      * - aTFld210                       COBOL Name: WS-10A-T-FLD2
      * - sLen                           COBOL Name: WS-S-LEN
      * - tLen                           COBOL Name: WS-T-LEN
      * - bS10                           COBOL Name: WS-10B-S
      * - bT10                           COBOL Name: WS-10B-T
      * - bTFld310                       COBOL Name: WS-10B-T-FLD3
      * - bTFld110                       COBOL Name: WS-10B-T-FLD1
      * - bTFld210                       COBOL Name: WS-10B-T-FLD2
      *
      * @throws CFException
      */
      @Override
      public MainlineSplit12OutCtx mainlineSplit12(MainlineSplit12InCtx methodIn) throws Exception {
			// Declare local variables used in the method
			 final int A_S_10_LENGTH = 70;
			 final int B_S_10_LENGTH = 70;
			// End of variable declaration

Refmod1Ctx programCtx = methodIn.getRefmod1Ctx();
MainlineSplit12OutCtx methodOut = methodIn.getMainlineSplit12OutCtx();
//  DISPLAY '* 354* WS-9B-T         = (' WS-9B-T ')'
          logger.info("* 354* WS-9B-T         = ({})", methodIn.getBT9().toString()); 
//  DISPLAY '* 355*   WS-9B-T-FLD1  = (' WS-9B-T-FLD1 ')'
          logger.info("* 355*   WS-9B-T-FLD1  = ({})", new String(methodIn.getBTFld19())); 
//  DISPLAY '* 356*   WS-9B-T-FLD2  = (' WS-9B-T-FLD2 ')'
          logger.info("* 356*   WS-9B-T-FLD2  = ({})", new String(methodIn.getBTFld29())); 
//  DISPLAY '* 357*   WS-9B-T-FLD3  = (' WS-9B-T-FLD3 ')'
          logger.info("* 357*   WS-9B-T-FLD3  = ({})", new String(methodIn.getBTFld39())); 

// *
// * Src -> string; tgt -> group ; src bigger than tgt
// * source offset 3 ; target offset 5
// *
//  INITIALIZE WS-10A-S WS-10A-T
          methodOut.setAS10(CONSTANTS.SPACE_70 /* Fill 70 Spaces*/);
          methodOut.getAT10().initialize();
//  MOVE ALL 'ABCD' TO WS-10A-S
          methodOut.setAS10(CONSTANTS.LITERAL_1222519919);
//  MOVE WS-10A-S ( 1 : LENGTH OF WS-10A-S ) TO WS-10A-T ( 1 : LENGTH OF WS-10A-T )
          methodOut.getATGrpGroup10().replace(methodIn.getASGrp10()/*parent*/,3/*fromOffset - (aT10) */,A_S_10_LENGTH/*fromLen*/,5/*toOffset - (aS10) */,AT10.getAT10FieldLength()/*toLen*/);

// *
//  DISPLAY '* 358* WS-10A-S-GRP    = (' WS-10A-S-GRP ')'
          logger.info("* 358* WS-10A-S-GRP    = ({})", methodIn.getASGrp10().toString()); 
//  DISPLAY '* 359* WS-10A-S        = (' WS-10A-S ')'
          logger.info("* 359* WS-10A-S        = ({})", new String(methodOut.getAS10())); 
//  DISPLAY '* 360* WS-10A-T-GRP-R  = (' WS-10A-T-GRP-R ')'
          logger.info("* 360* WS-10A-T-GRP-R  = ({})", new String(methodIn.getATGrpR10())); 
//  DISPLAY '* 361* WS-10A-T-GRP    = (' WS-10A-T-GRP ')'
          logger.info("* 361* WS-10A-T-GRP    = ({})", methodIn.getATGrp10().toString()); 
//  DISPLAY '* 362* WS-10A-T        = (' WS-10A-T ')'
          logger.info("* 362* WS-10A-T        = ({})", methodOut.getAT10().toString()); 
//  DISPLAY '* 363*   WS-10A-T-FLD1 = (' WS-10A-T-FLD1 ')'
          logger.info("* 363*   WS-10A-T-FLD1 = ({})", new String(methodOut.getATFld110())); 
//  DISPLAY '* 364*   WS-10A-T-FLD2 = (' WS-10A-T-FLD2 ')'
          logger.info("* 364*   WS-10A-T-FLD2 = ({})", new String(methodOut.getATFld210())); 

// *
//  INITIALIZE WS-10A-S WS-10A-T
          methodOut.setAS10(CONSTANTS.SPACE_70 /* Fill 70 Spaces*/);
          methodOut.getAT10().initialize();
//  MOVE ALL 'ABCD' TO WS-10A-S
          methodOut.setAS10(CONSTANTS.LITERAL_1222519919);
//  MOVE LENGTH OF WS-10A-S TO WS-S-LEN
          methodOut.setSLen((short) A_S_10_LENGTH);
//  MOVE LENGTH OF WS-10A-T TO WS-T-LEN
          methodOut.setTLen((short) AT10.getAT10FieldLength());
//  MOVE WS-10A-S ( 1 : WS-S-LEN ) TO WS-10A-T ( 1 : WS-T-LEN )
          methodOut.getATGrpGroup10().replace(methodIn.getASGrp10()/*parent*/,3/*fromOffset - (aT10) */,methodOut.getSLen()/*fromLen*/,5/*toOffset - (aS10) */,methodOut.getTLen()/*toLen*/);

// *
//  DISPLAY '* 365* WS-10A-S-GRP    = (' WS-10A-S-GRP ')'
          logger.info("* 365* WS-10A-S-GRP    = ({})", methodIn.getASGrp10().toString()); 
//  DISPLAY '* 366* WS-10A-S        = (' WS-10A-S ')'
          logger.info("* 366* WS-10A-S        = ({})", new String(methodOut.getAS10())); 
//  DISPLAY '* 367* WS-10A-T-GRP-R  = (' WS-10A-T-GRP-R ')'
          logger.info("* 367* WS-10A-T-GRP-R  = ({})", new String(methodIn.getATGrpR10())); 
//  DISPLAY '* 368* WS-10A-T-GRP    = (' WS-10A-T-GRP ')'
          logger.info("* 368* WS-10A-T-GRP    = ({})", methodIn.getATGrp10().toString()); 
//  DISPLAY '* 369* WS-10A-T        = (' WS-10A-T ')'
          logger.info("* 369* WS-10A-T        = ({})", methodOut.getAT10().toString()); 
//  DISPLAY '* 370*   WS-10A-T-FLD1 = (' WS-10A-T-FLD1 ')'
          logger.info("* 370*   WS-10A-T-FLD1 = ({})", new String(methodOut.getATFld110())); 
//  DISPLAY '* 371*   WS-10A-T-FLD2 = (' WS-10A-T-FLD2 ')'
          logger.info("* 371*   WS-10A-T-FLD2 = ({})", new String(methodOut.getATFld210())); 

// *
// * Src -> string; tgt -> group ; src smaller than tgt
// * source offset 3 ; target offset 5
// *
//  INITIALIZE WS-10B-S WS-10B-T
          methodOut.setBS10(CONSTANTS.SPACE_70 /* Fill 70 Spaces*/);
          methodOut.getBT10().initialize();
//  MOVE ALL 'ABCD' TO WS-10B-S
          methodOut.setBS10(CONSTANTS.LITERAL_1222519919);
//  MOVE ALL 'MNOP' TO WS-10B-T-FLD3
          methodOut.setBTFld310(CONSTANTS.LITERAL_MNOPMNOPMNOPMNOPMNOPMNOPMNOPMNOP);
//  MOVE WS-10B-S ( 1 : LENGTH OF WS-10B-S ) TO WS-10B-T ( 1 : LENGTH OF WS-10B-T )
          methodOut.getBTGrpGroup10().replace(methodIn.getBSGrp10()/*parent*/,3/*fromOffset - (bT10) */,B_S_10_LENGTH/*fromLen*/,5/*toOffset - (bS10) */,BT10.getBT10FieldLength()/*toLen*/);

// *
//  DISPLAY '* 372* WS-10B-S-GRP    = (' WS-10B-S-GRP ')'
          logger.info("* 372* WS-10B-S-GRP    = ({})", methodIn.getBSGrp10().toString()); 
//  DISPLAY '* 373* WS-10B-S        = (' WS-10B-S ')'
          logger.info("* 373* WS-10B-S        = ({})", new String(methodOut.getBS10())); 
//  DISPLAY '* 374* WS-10B-T-GRP-R  = (' WS-10B-T-GRP-R ')'
          logger.info("* 374* WS-10B-T-GRP-R  = ({})", new String(methodIn.getBTGrpR10())); 
//  DISPLAY '* 375* WS-10B-T-GRP    = (' WS-10B-T-GRP ')'
          logger.info("* 375* WS-10B-T-GRP    = ({})", methodIn.getBTGrp10().toString()); 
//  DISPLAY '* 376* WS-10B-T        = (' WS-10B-T ')'
          logger.info("* 376* WS-10B-T        = ({})", methodOut.getBT10().toString()); 
//  DISPLAY '* 377*   WS-10B-T-FLD1 = (' WS-10B-T-FLD1 ')'
          logger.info("* 377*   WS-10B-T-FLD1 = ({})", new String(methodOut.getBTFld110())); 
//  DISPLAY '* 378*   WS-10B-T-FLD2 = (' WS-10B-T-FLD2 ')'
          logger.info("* 378*   WS-10B-T-FLD2 = ({})", new String(methodOut.getBTFld210())); 
//  DISPLAY '* 379*   WS-10B-T-FLD3 = (' WS-10B-T-FLD3 ')'
          logger.info("* 379*   WS-10B-T-FLD3 = ({})", new String(methodOut.getBTFld310())); 

// *
//  INITIALIZE WS-10B-S WS-10B-T
          methodOut.setBS10(CONSTANTS.SPACE_70 /* Fill 70 Spaces*/);
          methodOut.getBT10().initialize();
//  MOVE ALL 'ABCD' TO WS-10B-S
          methodOut.setBS10(CONSTANTS.LITERAL_1222519919);
//  MOVE ALL 'MNOP' TO WS-10B-T-FLD3
          methodOut.setBTFld310(CONSTANTS.LITERAL_MNOPMNOPMNOPMNOPMNOPMNOPMNOPMNOP);
//  MOVE LENGTH OF WS-10B-S TO WS-S-LEN
          methodOut.setSLen((short) B_S_10_LENGTH);
//  MOVE LENGTH OF WS-10B-T TO WS-T-LEN
          methodOut.setTLen((short) BT10.getBT10FieldLength());
//  MOVE WS-10B-S ( 1 : WS-S-LEN ) TO WS-10B-T ( 1 : WS-T-LEN )
          methodOut.getBTGrpGroup10().replace(methodIn.getBSGrp10()/*parent*/,3/*fromOffset - (bT10) */,methodOut.getSLen()/*fromLen*/,5/*toOffset - (bS10) */,methodOut.getTLen()/*toLen*/);

// *
//  DISPLAY '* 380* WS-10B-S-GRP    = (' WS-10B-S-GRP ')'
          logger.info("* 380* WS-10B-S-GRP    = ({})", methodIn.getBSGrp10().toString()); 
//  DISPLAY '* 381* WS-10B-S        = (' WS-10B-S ')'
          logger.info("* 381* WS-10B-S        = ({})", new String(methodOut.getBS10())); 
//  DISPLAY '* 382* WS-10B-T-GRP-R  = (' WS-10B-T-GRP-R ')'
          logger.info("* 382* WS-10B-T-GRP-R  = ({})", new String(methodIn.getBTGrpR10())); 
//  DISPLAY '* 383* WS-10B-T-GRP    = (' WS-10B-T-GRP ')'
          logger.info("* 383* WS-10B-T-GRP    = ({})", methodIn.getBTGrp10().toString()); 
//  DISPLAY '* 384* WS-10B-T        = (' WS-10B-T ')'
          logger.info("* 384* WS-10B-T        = ({})", methodOut.getBT10().toString()); 
//  DISPLAY '* 385*   WS-10B-T-FLD1 = (' WS-10B-T-FLD1 ')'
          logger.info("* 385*   WS-10B-T-FLD1 = ({})", new String(methodOut.getBTFld110())); 
//  DISPLAY '* 386*   WS-10B-T-FLD2 = (' WS-10B-T-FLD2 ')'
          logger.info("* 386*   WS-10B-T-FLD2 = ({})", new String(methodOut.getBTFld210())); 
      
      return methodOut;
      }
      /**
      * mainlineSplit13 
      *   This method is derived from 
  *   COBOL Paragraph - MAINLINE-SPLIT13 COBOL Cyclomatic complexity - 1
      * Input  :  

      * - bTFld310                       COBOL Name: WS-10B-T-FLD3
      * - aTGrpR11                       COBOL Name: WS-11A-T-GRP-R
      * - aTGrp11                        COBOL Name: WS-11A-T-GRP
      * - bTGrpR11                       COBOL Name: WS-11B-T-GRP-R
      * - bTGrp11                        COBOL Name: WS-11B-T-GRP
      *
      * Output :  

      * - aS11                           COBOL Name: WS-11A-S
      * - aT11                           COBOL Name: WS-11A-T
      * - aSFld111                       COBOL Name: WS-11A-S-FLD1
      * - aSFld211                       COBOL Name: WS-11A-S-FLD2
      * - aTFld111                       COBOL Name: WS-11A-T-FLD1
      * - aTFld211                       COBOL Name: WS-11A-T-FLD2
      * - tLen                           COBOL Name: WS-T-LEN
      * - bS11                           COBOL Name: WS-11B-S
      * - bT11                           COBOL Name: WS-11B-T
      * - bSFld111                       COBOL Name: WS-11B-S-FLD1
      * - bSFld211                       COBOL Name: WS-11B-S-FLD2
      * - bTFld311                       COBOL Name: WS-11B-T-FLD3
      * - bTFld111                       COBOL Name: WS-11B-T-FLD1
      * - bTFld211                       COBOL Name: WS-11B-T-FLD2
      *
      * @throws CFException
      */
      @Override
      public MainlineSplit13OutCtx mainlineSplit13(MainlineSplit13InCtx methodIn) throws Exception {
Refmod1Ctx programCtx = methodIn.getRefmod1Ctx();
MainlineSplit13OutCtx methodOut = methodIn.getMainlineSplit13OutCtx();
//  DISPLAY '* 387*   WS-10B-T-FLD3 = (' WS-10B-T-FLD3 ')'
          logger.info("* 387*   WS-10B-T-FLD3 = ({})", new String(methodIn.getBTFld310())); 

// *
// * Src -> group; tgt -> group ; src bigger than tgt
// *    src not refmod;target offset 5
// *
//  INITIALIZE WS-11A-S WS-11A-T
          methodOut.getAS11().initialize();
          methodOut.getAT11().initialize();
//  MOVE ALL 'ABCD' TO WS-11A-S-FLD1
          methodOut.setASFld111(CONSTANTS.LITERAL_ABCDABCDABCDABCDABCDABCDABCDABCD);
//  MOVE ALL 'ZYXW' TO WS-11A-S-FLD2
          methodOut.setASFld211(CONSTANTS.LITERAL_645286444);
//  MOVE WS-11A-S TO WS-11A-T ( 1 : LENGTH OF WS-11A-T )
          methodOut.getAT11().replace(methodOut.getAS11().getCharArray(),0,methodOut.getAS11().length(),methodOut.getAT11().begin,AT11.getAT11FieldLength() /* replace,sourceIndex,sourceLen,targetIndex,targetLen */);

// *
//  DISPLAY '* 388* WS-11A-S        = (' WS-11A-S ')'
          logger.info("* 388* WS-11A-S        = ({})", methodOut.getAS11().toString()); 
//  DISPLAY '* 389*   WS-11A-S-FLD1 = (' WS-11A-S-FLD1 ')'
          logger.info("* 389*   WS-11A-S-FLD1 = ({})", new String(methodOut.getASFld111())); 
//  DISPLAY '* 390*   WS-11A-S-FLD2 = (' WS-11A-S-FLD2 ')'
          logger.info("* 390*   WS-11A-S-FLD2 = ({})", new String(methodOut.getASFld211())); 
//  DISPLAY '* 391* WS-11A-T-GRP-R  = (' WS-11A-T-GRP-R ')'
          logger.info("* 391* WS-11A-T-GRP-R  = ({})", new String(methodIn.getATGrpR11())); 
//  DISPLAY '* 392* WS-11A-T-GRP    = (' WS-11A-T-GRP ')'
          logger.info("* 392* WS-11A-T-GRP    = ({})", methodIn.getATGrp11().toString()); 
//  DISPLAY '* 393* WS-11A-T        = (' WS-11A-T ')'
          logger.info("* 393* WS-11A-T        = ({})", methodOut.getAT11().toString()); 
//  DISPLAY '* 394*   WS-11A-T-FLD1 = (' WS-11A-T-FLD1 ')'
          logger.info("* 394*   WS-11A-T-FLD1 = ({})", new String(methodOut.getATFld111())); 
//  DISPLAY '* 395*   WS-11A-T-FLD2 = (' WS-11A-T-FLD2 ')'
          logger.info("* 395*   WS-11A-T-FLD2 = ({})", new String(methodOut.getATFld211())); 

// *
//  INITIALIZE WS-11A-S WS-11A-T
          methodOut.getAS11().initialize();
          methodOut.getAT11().initialize();
//  MOVE ALL 'ABCD' TO WS-11A-S-FLD1
          methodOut.setASFld111(CONSTANTS.LITERAL_ABCDABCDABCDABCDABCDABCDABCDABCD);
//  MOVE ALL 'ZYXW' TO WS-11A-S-FLD2
          methodOut.setASFld211(CONSTANTS.LITERAL_645286444);
//  MOVE LENGTH OF WS-11A-T TO WS-T-LEN
          methodOut.setTLen((short) AT11.getAT11FieldLength());
//  MOVE WS-11A-S TO WS-11A-T ( 1 : WS-T-LEN )
          methodOut.getAT11().replace(methodOut.getAS11().getCharArray(),0,methodOut.getAS11().length(),methodOut.getAT11().begin,methodOut.getTLen() /* replace,sourceIndex,sourceLen,targetIndex,targetLen */);

// *
//  DISPLAY '* 396* WS-11A-S        = (' WS-11A-S ')'
          logger.info("* 396* WS-11A-S        = ({})", methodOut.getAS11().toString()); 
//  DISPLAY '* 397*   WS-11A-S-FLD1 = (' WS-11A-S-FLD1 ')'
          logger.info("* 397*   WS-11A-S-FLD1 = ({})", new String(methodOut.getASFld111())); 
//  DISPLAY '* 398*   WS-11A-S-FLD2 = (' WS-11A-S-FLD2 ')'
          logger.info("* 398*   WS-11A-S-FLD2 = ({})", new String(methodOut.getASFld211())); 
//  DISPLAY '* 399* WS-11A-T-GRP-R  = (' WS-11A-T-GRP-R ')'
          logger.info("* 399* WS-11A-T-GRP-R  = ({})", new String(methodIn.getATGrpR11())); 
//  DISPLAY '* 400* WS-11A-T-GRP    = (' WS-11A-T-GRP ')'
          logger.info("* 400* WS-11A-T-GRP    = ({})", methodIn.getATGrp11().toString()); 
//  DISPLAY '* 401* WS-11A-T        = (' WS-11A-T ')'
          logger.info("* 401* WS-11A-T        = ({})", methodOut.getAT11().toString()); 
//  DISPLAY '* 402*   WS-11A-T-FLD1 = (' WS-11A-T-FLD1 ')'
          logger.info("* 402*   WS-11A-T-FLD1 = ({})", new String(methodOut.getATFld111())); 
//  DISPLAY '* 403*   WS-11A-T-FLD2 = (' WS-11A-T-FLD2 ')'
          logger.info("* 403*   WS-11A-T-FLD2 = ({})", new String(methodOut.getATFld211())); 

// *
// * Src -> group; tgt -> group ; src smaller than tgt
// *    src not refmod;target offset 5
// *
//  INITIALIZE WS-11B-S WS-11B-T
          methodOut.getBS11().initialize();
          methodOut.getBT11().initialize();
//  MOVE ALL 'ABCD' TO WS-11B-S-FLD1
          methodOut.setBSFld111(CONSTANTS.LITERAL_ABCDABCDABCDABCDABCDABCDABCDABCD);
//  MOVE ALL 'ZYXW' TO WS-11B-S-FLD2
          methodOut.setBSFld211(CONSTANTS.LITERAL_645286444);
//  MOVE ALL 'MNOP' TO WS-11B-T-FLD3
          methodOut.setBTFld311(CONSTANTS.LITERAL_MNOPMNOPMNOPMNOPMNOPMNOPMNOPMNOP);
//  MOVE WS-11B-S TO WS-11B-T ( 1 : LENGTH OF WS-11B-T )
          methodOut.getBT11().replace(methodOut.getBS11().getCharArray(),0,methodOut.getBS11().length(),methodOut.getBT11().begin,BT11.getBT11FieldLength() /* replace,sourceIndex,sourceLen,targetIndex,targetLen */);

// *
//  DISPLAY '* 404* WS-11B-S        = (' WS-11B-S ')'
          logger.info("* 404* WS-11B-S        = ({})", methodOut.getBS11().toString()); 
//  DISPLAY '* 405*   WS-11B-S-FLD1 = (' WS-11B-S-FLD1 ')'
          logger.info("* 405*   WS-11B-S-FLD1 = ({})", new String(methodOut.getBSFld111())); 
//  DISPLAY '* 406*   WS-11B-S-FLD2 = (' WS-11B-S-FLD2 ')'
          logger.info("* 406*   WS-11B-S-FLD2 = ({})", new String(methodOut.getBSFld211())); 
//  DISPLAY '* 407* WS-11B-T-GRP-R  = (' WS-11B-T-GRP-R ')'
          logger.info("* 407* WS-11B-T-GRP-R  = ({})", new String(methodIn.getBTGrpR11())); 
//  DISPLAY '* 408* WS-11B-T-GRP    = (' WS-11B-T-GRP ')'
          logger.info("* 408* WS-11B-T-GRP    = ({})", methodIn.getBTGrp11().toString()); 
//  DISPLAY '* 409* WS-11B-T        = (' WS-11B-T ')'
          logger.info("* 409* WS-11B-T        = ({})", methodOut.getBT11().toString()); 
//  DISPLAY '* 410*   WS-11B-T-FLD1 = (' WS-11B-T-FLD1 ')'
          logger.info("* 410*   WS-11B-T-FLD1 = ({})", new String(methodOut.getBTFld111())); 
//  DISPLAY '* 411*   WS-11B-T-FLD2 = (' WS-11B-T-FLD2 ')'
          logger.info("* 411*   WS-11B-T-FLD2 = ({})", new String(methodOut.getBTFld211())); 
//  DISPLAY '* 412*   WS-11B-T-FLD3 = (' WS-11B-T-FLD3 ')'
          logger.info("* 412*   WS-11B-T-FLD3 = ({})", new String(methodOut.getBTFld311())); 

// *
//  INITIALIZE WS-11B-S WS-11B-T
          methodOut.getBS11().initialize();
          methodOut.getBT11().initialize();
//  MOVE ALL 'ABCD' TO WS-11B-S-FLD1
          methodOut.setBSFld111(CONSTANTS.LITERAL_ABCDABCDABCDABCDABCDABCDABCDABCD);
//  MOVE ALL 'ZYXW' TO WS-11B-S-FLD2
          methodOut.setBSFld211(CONSTANTS.LITERAL_645286444);
//  MOVE ALL 'MNOP' TO WS-11B-T-FLD3
          methodOut.setBTFld311(CONSTANTS.LITERAL_MNOPMNOPMNOPMNOPMNOPMNOPMNOPMNOP);
//  MOVE LENGTH OF WS-11B-T TO WS-T-LEN
          methodOut.setTLen((short) BT11.getBT11FieldLength());
//  MOVE WS-11B-S TO WS-11B-T ( 1 : WS-T-LEN )
          methodOut.getBT11().replace(methodOut.getBS11().getCharArray(),0,methodOut.getBS11().length(),methodOut.getBT11().begin,methodOut.getTLen() /* replace,sourceIndex,sourceLen,targetIndex,targetLen */);

// *
//  DISPLAY '* 413* WS-11B-S        = (' WS-11B-S ')'
          logger.info("* 413* WS-11B-S        = ({})", methodOut.getBS11().toString()); 
//  DISPLAY '* 414*   WS-11B-S-FLD1 = (' WS-11B-S-FLD1 ')'
          logger.info("* 414*   WS-11B-S-FLD1 = ({})", new String(methodOut.getBSFld111())); 
//  DISPLAY '* 415*   WS-11B-S-FLD2 = (' WS-11B-S-FLD2 ')'
          logger.info("* 415*   WS-11B-S-FLD2 = ({})", new String(methodOut.getBSFld211())); 
//  DISPLAY '* 416* WS-11B-T-GRP-R  = (' WS-11B-T-GRP-R ')'
          logger.info("* 416* WS-11B-T-GRP-R  = ({})", new String(methodIn.getBTGrpR11())); 
//  DISPLAY '* 417* WS-11B-T-GRP    = (' WS-11B-T-GRP ')'
          logger.info("* 417* WS-11B-T-GRP    = ({})", methodIn.getBTGrp11().toString()); 
      
      return methodOut;
      }
      /**
      * mainlineSplit14 
      *   This method is derived from 
  *   COBOL Paragraph - MAINLINE-SPLIT14 COBOL Cyclomatic complexity - 1
      * Input  :  

      * - bT11                           COBOL Name: WS-11B-T
      * - bTFld111                       COBOL Name: WS-11B-T-FLD1
      * - bTFld211                       COBOL Name: WS-11B-T-FLD2
      * - bTFld311                       COBOL Name: WS-11B-T-FLD3
      * - aTGrpR12                       COBOL Name: WS-12A-T-GRP-R
      * - aTGrp12                        COBOL Name: WS-12A-T-GRP
      * - bTGrpR12                       COBOL Name: WS-12B-T-GRP-R
      * - bTGrp12                        COBOL Name: WS-12B-T-GRP
      * - aSGrp13                        COBOL Name: WS-13A-S-GRP
      * - aTGrpR13                       COBOL Name: WS-13A-T-GRP-R
      * - aTGrp13                        COBOL Name: WS-13A-T-GRP
      *
      * Output :  

      * - aS12                           COBOL Name: WS-12A-S
      * - aT12                           COBOL Name: WS-12A-T
      * - aTFld112                       COBOL Name: WS-12A-T-FLD1
      * - aTFld212                       COBOL Name: WS-12A-T-FLD2
      * - tLen                           COBOL Name: WS-T-LEN
      * - bS12                           COBOL Name: WS-12B-S
      * - bT12                           COBOL Name: WS-12B-T
      * - bTFld312                       COBOL Name: WS-12B-T-FLD3
      * - bTFld112                       COBOL Name: WS-12B-T-FLD1
      * - bTFld212                       COBOL Name: WS-12B-T-FLD2
      * - aS13                           COBOL Name: WS-13A-S
      * - aT13                           COBOL Name: WS-13A-T
      * - aSFld113                       COBOL Name: WS-13A-S-FLD1
      * - aSFld213                       COBOL Name: WS-13A-S-FLD2
      * - aTFld113                       COBOL Name: WS-13A-T-FLD1
      * - aTFld213                       COBOL Name: WS-13A-T-FLD2
      * - sLen                           COBOL Name: WS-S-LEN
      *
      * @throws CFException
      */
      @Override
      public MainlineSplit14OutCtx mainlineSplit14(MainlineSplit14InCtx methodIn) throws Exception {
Refmod1Ctx programCtx = methodIn.getRefmod1Ctx();
MainlineSplit14OutCtx methodOut = methodIn.getMainlineSplit14OutCtx();
//  DISPLAY '* 418* WS-11B-T        = (' WS-11B-T ')'
          logger.info("* 418* WS-11B-T        = ({})", methodIn.getBT11().toString()); 
//  DISPLAY '* 419*   WS-11B-T-FLD1 = (' WS-11B-T-FLD1 ')'
          logger.info("* 419*   WS-11B-T-FLD1 = ({})", new String(methodIn.getBTFld111())); 
//  DISPLAY '* 420*   WS-11B-T-FLD2 = (' WS-11B-T-FLD2 ')'
          logger.info("* 420*   WS-11B-T-FLD2 = ({})", new String(methodIn.getBTFld211())); 
//  DISPLAY '* 421*   WS-11B-T-FLD3 = (' WS-11B-T-FLD3 ')'
          logger.info("* 421*   WS-11B-T-FLD3 = ({})", new String(methodIn.getBTFld311())); 

// *    Src not refmod;target offset 5
// *
//  INITIALIZE WS-12A-S WS-12A-T
          methodOut.setAS12(CONSTANTS.SPACE_70 /* Fill 70 Spaces*/);
          methodOut.getAT12().initialize();
          // MOVE ALL 'ABCD' TO WS-12A-S
          methodOut.setAS12(CONSTANTS.LITERAL_1222519919);
//  MOVE WS-12A-S TO WS-12A-T ( 1 : LENGTH OF WS-12A-T )
          methodOut.getAT12().replace(methodOut.getAS12(),0,methodOut.getAS12().length,methodOut.getAT12().begin /* aT12 */,AT12.getAT12FieldLength() /* replace,sourceIndex,sourceLen,targetIndex,targetLen */);

// *
//  DISPLAY '* 422* WS-12A-S        = (' WS-12A-S ')'
          logger.info("* 422* WS-12A-S        = ({})", new String(methodOut.getAS12())); 
//  DISPLAY '* 423* WS-12A-T-GRP-R  = (' WS-12A-T-GRP-R ')'
          logger.info("* 423* WS-12A-T-GRP-R  = ({})", new String(methodIn.getATGrpR12())); 
//  DISPLAY '* 424* WS-12A-T-GRP    = (' WS-12A-T-GRP ')'
          logger.info("* 424* WS-12A-T-GRP    = ({})", methodIn.getATGrp12().toString()); 
//  DISPLAY '* 425* WS-12A-T        = (' WS-12A-T ')'
          logger.info("* 425* WS-12A-T        = ({})", methodOut.getAT12().toString()); 
//  DISPLAY '* 426*   WS-12A-T-FLD1 = (' WS-12A-T-FLD1 ')'
          logger.info("* 426*   WS-12A-T-FLD1 = ({})", new String(methodOut.getATFld112())); 
//  DISPLAY '* 427*   WS-12A-T-FLD2 = (' WS-12A-T-FLD2 ')'
          logger.info("* 427*   WS-12A-T-FLD2 = ({})", new String(methodOut.getATFld212())); 

// *
// *
//  INITIALIZE WS-12A-S WS-12A-T
          methodOut.setAS12(CONSTANTS.SPACE_70 /* Fill 70 Spaces*/);
          methodOut.getAT12().initialize();
          // MOVE ALL 'ABCD' TO WS-12A-S
          methodOut.setAS12(CONSTANTS.LITERAL_1222519919);
//  MOVE LENGTH OF WS-12A-T TO WS-T-LEN
          methodOut.setTLen((short) AT12.getAT12FieldLength());
//  MOVE WS-12A-S TO WS-12A-T ( 1 : WS-T-LEN )
          methodOut.getAT12().replace(methodOut.getAS12(),0,methodOut.getAS12().length,methodOut.getAT12().begin /* aT12 */,methodOut.getTLen() /* replace,sourceIndex,sourceLen,targetIndex,targetLen */);

// *
//  DISPLAY '* 428* WS-12A-S        = (' WS-12A-S ')'
          logger.info("* 428* WS-12A-S        = ({})", new String(methodOut.getAS12())); 
//  DISPLAY '* 429* WS-12A-T-GRP-R  = (' WS-12A-T-GRP-R ')'
          logger.info("* 429* WS-12A-T-GRP-R  = ({})", new String(methodIn.getATGrpR12())); 
//  DISPLAY '* 430* WS-12A-T-GRP    = (' WS-12A-T-GRP ')'
          logger.info("* 430* WS-12A-T-GRP    = ({})", methodIn.getATGrp12().toString()); 
//  DISPLAY '* 431* WS-12A-T        = (' WS-12A-T ')'
          logger.info("* 431* WS-12A-T        = ({})", methodOut.getAT12().toString()); 
//  DISPLAY '* 432*   WS-12A-T-FLD1 = (' WS-12A-T-FLD1 ')'
          logger.info("* 432*   WS-12A-T-FLD1 = ({})", new String(methodOut.getATFld112())); 
//  DISPLAY '* 433*   WS-12A-T-FLD2 = (' WS-12A-T-FLD2 ')'
          logger.info("* 433*   WS-12A-T-FLD2 = ({})", new String(methodOut.getATFld212())); 

// *
// * Src -> string; tgt -> group ; src smaller than tgt
// *    src not refmod;target offset 5
// *
//  INITIALIZE WS-12B-S WS-12B-T
          methodOut.setBS12(CONSTANTS.SPACE_70 /* Fill 70 Spaces*/);
          methodOut.getBT12().initialize();
          // MOVE ALL 'ABCD' TO WS-12B-S
          methodOut.setBS12(CONSTANTS.LITERAL_1222519919);
//  MOVE ALL 'MNOP' TO WS-12B-T-FLD3
          methodOut.setBTFld312(CONSTANTS.LITERAL_MNOPMNOPMNOPMNOPMNOPMNOPMNOPMNOP);
//  MOVE WS-12B-S TO WS-12B-T ( 1 : LENGTH OF WS-12B-T )
          methodOut.getBT12().replace(methodOut.getBS12(),0,methodOut.getBS12().length,methodOut.getBT12().begin /* bT12 */,BT12.getBT12FieldLength() /* replace,sourceIndex,sourceLen,targetIndex,targetLen */);

// *
//  DISPLAY '* 434* WS-12B-S        = (' WS-12B-S ')'
          logger.info("* 434* WS-12B-S        = ({})", new String(methodOut.getBS12())); 
//  DISPLAY '* 435* WS-12B-T-GRP-R  = (' WS-12B-T-GRP-R ')'
          logger.info("* 435* WS-12B-T-GRP-R  = ({})", new String(methodIn.getBTGrpR12())); 
//  DISPLAY '* 436* WS-12B-T-GRP    = (' WS-12B-T-GRP ')'
          logger.info("* 436* WS-12B-T-GRP    = ({})", methodIn.getBTGrp12().toString()); 
//  DISPLAY '* 437* WS-12B-T        = (' WS-12B-T ')'
          logger.info("* 437* WS-12B-T        = ({})", methodOut.getBT12().toString()); 
//  DISPLAY '* 438*   WS-12B-T-FLD1 = (' WS-12B-T-FLD1 ')'
          logger.info("* 438*   WS-12B-T-FLD1 = ({})", new String(methodOut.getBTFld112())); 
//  DISPLAY '* 439*   WS-12B-T-FLD2 = (' WS-12B-T-FLD2 ')'
          logger.info("* 439*   WS-12B-T-FLD2 = ({})", new String(methodOut.getBTFld212())); 
//  DISPLAY '* 440*   WS-12B-T-FLD3 = (' WS-12B-T-FLD3 ')'
          logger.info("* 440*   WS-12B-T-FLD3 = ({})", new String(methodOut.getBTFld312())); 

// *
// * Src -> group; tgt -> group ; src bigger than tgt
// *    src offset 3  ;target offset 5
// *
//  INITIALIZE WS-13A-S WS-13A-T
          methodOut.getAS13().initialize();
          methodOut.getAT13().initialize();
//  MOVE ALL 'ABCD' TO WS-13A-S-FLD1
          methodOut.setASFld113(CONSTANTS.LITERAL_ABCDABCDABCDABCDABCDABCDABCDABCD);
//  MOVE ALL 'ZYXW' TO WS-13A-S-FLD2
          methodOut.setASFld213(CONSTANTS.LITERAL_645286444);
//  MOVE WS-13A-S ( 3 : LENGTH OF WS-13A-S - 3 ) TO WS-13A-T ( 5 : LENGTH OF WS-13A-T - 5)
          methodOut.getATGrpGroup13().replace(methodIn.getASGrp13()/*parent*/,3+3 - 1/*fromOffset - (aT13) */,AS13.getAS13FieldLength() - 3/*fromLen*/,5+5 - 1/*toOffset - (aS13) */,AT13.getAT13FieldLength() - 5/*toLen*/);

// *
//  DISPLAY '* 441* WS-13A-S-GRP    = (' WS-13A-S-GRP ')'
          logger.info("* 441* WS-13A-S-GRP    = ({})", methodIn.getASGrp13().toString()); 
//  DISPLAY '* 442* WS-13A-S        = (' WS-13A-S ')'
          logger.info("* 442* WS-13A-S        = ({})", methodOut.getAS13().toString()); 
//  DISPLAY '* 443*   WS-13A-S-FLD1 = (' WS-13A-S-FLD1 ')'
          logger.info("* 443*   WS-13A-S-FLD1 = ({})", new String(methodOut.getASFld113())); 
//  DISPLAY '* 444*   WS-13A-S-FLD2 = (' WS-13A-S-FLD2 ')'
          logger.info("* 444*   WS-13A-S-FLD2 = ({})", new String(methodOut.getASFld213())); 
//  DISPLAY '* 445* WS-13A-T-GRP-R  = (' WS-13A-T-GRP-R ')'
          logger.info("* 445* WS-13A-T-GRP-R  = ({})", new String(methodIn.getATGrpR13())); 
//  DISPLAY '* 446* WS-13A-T-GRP    = (' WS-13A-T-GRP ')'
          logger.info("* 446* WS-13A-T-GRP    = ({})", methodIn.getATGrp13().toString()); 
//  DISPLAY '* 447* WS-13A-T        = (' WS-13A-T ')'
          logger.info("* 447* WS-13A-T        = ({})", methodOut.getAT13().toString()); 
//  DISPLAY '* 448*   WS-13A-T-FLD1 = (' WS-13A-T-FLD1 ')'
          logger.info("* 448*   WS-13A-T-FLD1 = ({})", new String(methodOut.getATFld113())); 
//  DISPLAY '* 449*   WS-13A-T-FLD2 = (' WS-13A-T-FLD2 ')'
          logger.info("* 449*   WS-13A-T-FLD2 = ({})", new String(methodOut.getATFld213())); 

// *
//  INITIALIZE WS-13A-S WS-13A-T
          methodOut.getAS13().initialize();
          methodOut.getAT13().initialize();
//  MOVE ALL 'ABCD' TO WS-13A-S-FLD1
          methodOut.setASFld113(CONSTANTS.LITERAL_ABCDABCDABCDABCDABCDABCDABCDABCD);
//  MOVE ALL 'ZYXW' TO WS-13A-S-FLD2
          methodOut.setASFld213(CONSTANTS.LITERAL_645286444);
//  MOVE LENGTH OF WS-13A-S TO WS-S-LEN
          methodOut.setSLen((short) AS13.getAS13FieldLength());
      
      return methodOut;
      }
      /**
      * mainlineSplit15 
      *   This method is derived from 
  *   COBOL Paragraph - MAINLINE-SPLIT15 COBOL Cyclomatic complexity - 1
      * Input  :  

      * - sLen                           COBOL Name: WS-S-LEN
      * - aS13                           COBOL Name: WS-13A-S
      * - aSGrp13                        COBOL Name: WS-13A-S-GRP
      * - aTGrpR13                       COBOL Name: WS-13A-T-GRP-R
      * - aTGrp13                        COBOL Name: WS-13A-T-GRP
      * - bSGrp13                        COBOL Name: WS-13B-S-GRP
      * - bTGrpR13                       COBOL Name: WS-13B-T-GRP-R
      * - bTGrp13                        COBOL Name: WS-13B-T-GRP
      * - aSGrp14                        COBOL Name: WS-14A-S-GRP
      *
      * Output :  

      * - tLen                           COBOL Name: WS-T-LEN
      * - sLen                           COBOL Name: WS-S-LEN
      * - aT13                           COBOL Name: WS-13A-T
      * - aS13                           COBOL Name: WS-13A-S
      * - aSFld113                       COBOL Name: WS-13A-S-FLD1
      * - aSFld213                       COBOL Name: WS-13A-S-FLD2
      * - aTFld113                       COBOL Name: WS-13A-T-FLD1
      * - aTFld213                       COBOL Name: WS-13A-T-FLD2
      * - bS13                           COBOL Name: WS-13B-S
      * - bT13                           COBOL Name: WS-13B-T
      * - bSFld113                       COBOL Name: WS-13B-S-FLD1
      * - bSFld213                       COBOL Name: WS-13B-S-FLD2
      * - bTFld313                       COBOL Name: WS-13B-T-FLD3
      * - bTFld113                       COBOL Name: WS-13B-T-FLD1
      * - bTFld213                       COBOL Name: WS-13B-T-FLD2
      * - aS14                           COBOL Name: WS-14A-S
      * - aT14                           COBOL Name: WS-14A-T
      *
      * @throws CFException
      */
      @Override
      public MainlineSplit15OutCtx mainlineSplit15(MainlineSplit15InCtx methodIn) throws Exception {
			// Declare local variables used in the method
			 final int A_S_14_LENGTH = 70;
			// End of variable declaration

Refmod1Ctx programCtx = methodIn.getRefmod1Ctx();
MainlineSplit15OutCtx methodOut = methodIn.getMainlineSplit15OutCtx();
//  MOVE LENGTH OF WS-13A-T TO WS-T-LEN
          methodOut.setTLen((short) AT13.getAT13FieldLength());
//  SUBTRACT 3 FROM WS-S-LEN
          methodOut.setSLen( (short) (methodOut.getSLen()-(short)3));
//  SUBTRACT 5 FROM WS-T-LEN
          methodOut.setTLen( (short) (methodOut.getTLen()-(short)5));
//  MOVE WS-13A-S ( 3 : WS-S-LEN ) TO WS-13A-T ( 5 : WS-T-LEN )
          methodOut.getATGrpGroup13().replace(methodIn.getASGrp13()/*parent*/,3+3 - 1/*fromOffset - (aT13) */,methodOut.getSLen()/*fromLen*/,5+5 - 1/*toOffset - (aS13) */,methodOut.getTLen()/*toLen*/);

// *
//  DISPLAY '* 450* WS-13A-S-GRP    = (' WS-13A-S-GRP ')'
          logger.info("* 450* WS-13A-S-GRP    = ({})", methodIn.getASGrp13().toString()); 
//  DISPLAY '* 451* WS-13A-S        = (' WS-13A-S ')'
          logger.info("* 451* WS-13A-S        = ({})", methodOut.getAS13().toString()); 
//  DISPLAY '* 452*   WS-13A-S-FLD1 = (' WS-13A-S-FLD1 ')'
          logger.info("* 452*   WS-13A-S-FLD1 = ({})", new String(methodOut.getASFld113())); 
//  DISPLAY '* 453*   WS-13A-S-FLD2 = (' WS-13A-S-FLD2 ')'
          logger.info("* 453*   WS-13A-S-FLD2 = ({})", new String(methodOut.getASFld213())); 
//  DISPLAY '* 454* WS-13A-T-GRP-R  = (' WS-13A-T-GRP-R ')'
          logger.info("* 454* WS-13A-T-GRP-R  = ({})", new String(methodIn.getATGrpR13())); 
//  DISPLAY '* 455* WS-13A-T-GRP    = (' WS-13A-T-GRP ')'
          logger.info("* 455* WS-13A-T-GRP    = ({})", methodIn.getATGrp13().toString()); 
//  DISPLAY '* 456* WS-13A-T        = (' WS-13A-T ')'
          logger.info("* 456* WS-13A-T        = ({})", methodOut.getAT13().toString()); 
//  DISPLAY '* 457*   WS-13A-T-FLD1 = (' WS-13A-T-FLD1 ')'
          logger.info("* 457*   WS-13A-T-FLD1 = ({})", new String(methodOut.getATFld113())); 
//  DISPLAY '* 458*   WS-13A-T-FLD2 = (' WS-13A-T-FLD2 ')'
          logger.info("* 458*   WS-13A-T-FLD2 = ({})", new String(methodOut.getATFld213())); 

// *
// * Src -> group; tgt -> group ; src smaller than tgt
// *    src offset 3  ;target offset 5
// *
//  INITIALIZE WS-13B-S WS-13B-T
          methodOut.getBS13().initialize();
          methodOut.getBT13().initialize();
//  MOVE ALL 'ABCD' TO WS-13B-S-FLD1
          methodOut.setBSFld113(CONSTANTS.LITERAL_ABCDABCDABCDABCDABCDABCDABCDABCD);
//  MOVE ALL 'ZYXW' TO WS-13B-S-FLD2
          methodOut.setBSFld213(CONSTANTS.LITERAL_645286444);
//  MOVE ALL 'MNOP' TO WS-13B-T-FLD3
          methodOut.setBTFld313(CONSTANTS.LITERAL_MNOPMNOPMNOPMNOPMNOPMNOPMNOPMNOP);
//  MOVE WS-13B-S ( 3 : LENGTH OF WS-13B-S - 3 ) TO WS-13B-T ( 5 : LENGTH OF WS-13B-T - 5)
          methodOut.getBTGrpGroup13().replace(methodIn.getBSGrp13()/*parent*/,3+3 - 1/*fromOffset - (bT13) */,BS13.getBS13FieldLength() - 3/*fromLen*/,5+5 - 1/*toOffset - (bS13) */,BT13.getBT13FieldLength() - 5/*toLen*/);

// *
//  DISPLAY '* 459* WS-13B-S-GRP    = (' WS-13B-S-GRP ')'
          logger.info("* 459* WS-13B-S-GRP    = ({})", methodIn.getBSGrp13().toString()); 
//  DISPLAY '* 460* WS-13B-S        = (' WS-13B-S ')'
          logger.info("* 460* WS-13B-S        = ({})", methodOut.getBS13().toString()); 
//  DISPLAY '* 461*   WS-13B-S-FLD1 = (' WS-13B-S-FLD1 ')'
          logger.info("* 461*   WS-13B-S-FLD1 = ({})", new String(methodOut.getBSFld113())); 
//  DISPLAY '* 462*   WS-13B-S-FLD2 = (' WS-13B-S-FLD2 ')'
          logger.info("* 462*   WS-13B-S-FLD2 = ({})", new String(methodOut.getBSFld213())); 
//  DISPLAY '* 463* WS-13B-T-GRP-R  = (' WS-13B-T-GRP-R ')'
          logger.info("* 463* WS-13B-T-GRP-R  = ({})", new String(methodIn.getBTGrpR13())); 
//  DISPLAY '* 464* WS-13B-T-GRP    = (' WS-13B-T-GRP ')'
          logger.info("* 464* WS-13B-T-GRP    = ({})", methodIn.getBTGrp13().toString()); 
//  DISPLAY '* 465* WS-13B-T        = (' WS-13B-T ')'
          logger.info("* 465* WS-13B-T        = ({})", methodOut.getBT13().toString()); 
//  DISPLAY '* 466*   WS-13B-T-FLD1 = (' WS-13B-T-FLD1 ')'
          logger.info("* 466*   WS-13B-T-FLD1 = ({})", new String(methodOut.getBTFld113())); 
//  DISPLAY '* 467*   WS-13B-T-FLD2 = (' WS-13B-T-FLD2 ')'
          logger.info("* 467*   WS-13B-T-FLD2 = ({})", new String(methodOut.getBTFld213())); 
//  DISPLAY '* 468*   WS-13B-T-FLD3 = (' WS-13B-T-FLD3 ')'
          logger.info("* 468*   WS-13B-T-FLD3 = ({})", new String(methodOut.getBTFld313())); 

// *
//  INITIALIZE WS-13B-S WS-13B-T
          methodOut.getBS13().initialize();
          methodOut.getBT13().initialize();
//  MOVE ALL 'ABCD' TO WS-13B-S-FLD1
          methodOut.setBSFld113(CONSTANTS.LITERAL_ABCDABCDABCDABCDABCDABCDABCDABCD);
//  MOVE ALL 'ZYXW' TO WS-13B-S-FLD2
          methodOut.setBSFld213(CONSTANTS.LITERAL_645286444);
//  MOVE ALL 'MNOP' TO WS-13B-T-FLD3
          methodOut.setBTFld313(CONSTANTS.LITERAL_MNOPMNOPMNOPMNOPMNOPMNOPMNOPMNOP);
//  MOVE LENGTH OF WS-13B-S TO WS-S-LEN
          methodOut.setSLen((short) BS13.getBS13FieldLength());
//  MOVE LENGTH OF WS-13B-T TO WS-T-LEN
          methodOut.setTLen((short) BT13.getBT13FieldLength());
//  SUBTRACT 3 FROM WS-S-LEN
          methodOut.setSLen( (short) (methodOut.getSLen()-(short)3));
//  SUBTRACT 5 FROM WS-T-LEN
          methodOut.setTLen( (short) (methodOut.getTLen()-(short)5));
//  MOVE WS-13B-S ( 3 : WS-S-LEN ) TO WS-13B-T ( 5 : WS-T-LEN )
          methodOut.getBTGrpGroup13().replace(methodIn.getBSGrp13()/*parent*/,3+3 - 1/*fromOffset - (bT13) */,methodOut.getSLen()/*fromLen*/,5+5 - 1/*toOffset - (bS13) */,methodOut.getTLen()/*toLen*/);

// *
//  DISPLAY '* 469* WS-13B-S-GRP    = (' WS-13B-S-GRP ')'
          logger.info("* 469* WS-13B-S-GRP    = ({})", methodIn.getBSGrp13().toString()); 
//  DISPLAY '* 470* WS-13B-S        = (' WS-13B-S ')'
          logger.info("* 470* WS-13B-S        = ({})", methodOut.getBS13().toString()); 
//  DISPLAY '* 471*   WS-13B-S-FLD1 = (' WS-13B-S-FLD1 ')'
          logger.info("* 471*   WS-13B-S-FLD1 = ({})", new String(methodOut.getBSFld113())); 
//  DISPLAY '* 472*   WS-13B-S-FLD2 = (' WS-13B-S-FLD2 ')'
          logger.info("* 472*   WS-13B-S-FLD2 = ({})", new String(methodOut.getBSFld213())); 
//  DISPLAY '* 473* WS-13B-T-GRP-R  = (' WS-13B-T-GRP-R ')'
          logger.info("* 473* WS-13B-T-GRP-R  = ({})", new String(methodIn.getBTGrpR13())); 
//  DISPLAY '* 474* WS-13B-T-GRP    = (' WS-13B-T-GRP ')'
          logger.info("* 474* WS-13B-T-GRP    = ({})", methodIn.getBTGrp13().toString()); 
//  DISPLAY '* 475* WS-13B-T        = (' WS-13B-T ')'
          logger.info("* 475* WS-13B-T        = ({})", methodOut.getBT13().toString()); 
//  DISPLAY '* 476*   WS-13B-T-FLD1 = (' WS-13B-T-FLD1 ')'
          logger.info("* 476*   WS-13B-T-FLD1 = ({})", new String(methodOut.getBTFld113())); 
//  DISPLAY '* 477*   WS-13B-T-FLD2 = (' WS-13B-T-FLD2 ')'
          logger.info("* 477*   WS-13B-T-FLD2 = ({})", new String(methodOut.getBTFld213())); 
//  DISPLAY '* 478*   WS-13B-T-FLD3 = (' WS-13B-T-FLD3 ')'
          logger.info("* 478*   WS-13B-T-FLD3 = ({})", new String(methodOut.getBTFld313())); 

// *
// * Src -> string; tgt -> group ; src bigger than tgt
// *    src offset 3  ;target offset 5
// *
//  INITIALIZE WS-14A-S WS-14A-T
          methodOut.setAS14(CONSTANTS.SPACE_70 /* Fill 70 Spaces*/);
          methodOut.getAT14().initialize();
//  MOVE ALL 'ABCD' TO WS-14A-S
          methodOut.setAS14(CONSTANTS.LITERAL_1222519919);
//  MOVE WS-14A-S ( 3 : LENGTH OF WS-14A-S - 3 ) TO WS-14A-T ( 5 : LENGTH OF WS-14A-T - 5)
          methodOut.getATGrpGroup14().replace(methodIn.getASGrp14()/*parent*/,3+3 - 1/*fromOffset - (aT14) */,A_S_14_LENGTH - 3/*fromLen*/,5+5 - 1/*toOffset - (aS14) */,AT14.getAT14FieldLength() - 5/*toLen*/);

// *
//  DISPLAY '* 479* WS-14A-S-GRP    = (' WS-14A-S-GRP ')'
          logger.info("* 479* WS-14A-S-GRP    = ({})", methodIn.getASGrp14().toString()); 
      
      return methodOut;
      }
      /**
      * mainlineSplit16 
      *   This method is derived from 
  *   COBOL Paragraph - MAINLINE-SPLIT16 COBOL Cyclomatic complexity - 1
      * Input  :  

      * - aS14                           COBOL Name: WS-14A-S
      * - aTGrpR14                       COBOL Name: WS-14A-T-GRP-R
      * - aTGrp14                        COBOL Name: WS-14A-T-GRP
      * - aT14                           COBOL Name: WS-14A-T
      * - aTFld114                       COBOL Name: WS-14A-T-FLD1
      * - aTFld214                       COBOL Name: WS-14A-T-FLD2
      * - aSGrp14                        COBOL Name: WS-14A-S-GRP
      * - bSGrp14                        COBOL Name: WS-14B-S-GRP
      * - bTGrpR14                       COBOL Name: WS-14B-T-GRP-R
      * - bTGrp14                        COBOL Name: WS-14B-T-GRP
      *
      * Output :  

      * - aS14                           COBOL Name: WS-14A-S
      * - aT14                           COBOL Name: WS-14A-T
      * - sLen                           COBOL Name: WS-S-LEN
      * - tLen                           COBOL Name: WS-T-LEN
      * - bS14                           COBOL Name: WS-14B-S
      * - bT14                           COBOL Name: WS-14B-T
      * - bTFld314                       COBOL Name: WS-14B-T-FLD3
      * - bTFld114                       COBOL Name: WS-14B-T-FLD1
      * - bTFld214                       COBOL Name: WS-14B-T-FLD2
      * - aS15                           COBOL Name: WS-15A-S
      * - aT15                           COBOL Name: WS-15A-T
      * - aSFld115                       COBOL Name: WS-15A-S-FLD1
      * - aSFld215                       COBOL Name: WS-15A-S-FLD2
      *
      * @throws CFException
      */
      @Override
      public MainlineSplit16OutCtx mainlineSplit16(MainlineSplit16InCtx methodIn) throws Exception {
			// Declare local variables used in the method
			 final int A_S_14_LENGTH = 70;
			 final int B_S_14_LENGTH = 70;
			// End of variable declaration

Refmod1Ctx programCtx = methodIn.getRefmod1Ctx();
MainlineSplit16OutCtx methodOut = methodIn.getMainlineSplit16OutCtx();
//  DISPLAY '* 480* WS-14A-S        = (' WS-14A-S ')'
          logger.info("* 480* WS-14A-S        = ({})", new String(methodOut.getAS14())); 
//  DISPLAY '* 481* WS-14A-T-GRP-R  = (' WS-14A-T-GRP-R ')'
          logger.info("* 481* WS-14A-T-GRP-R  = ({})", new String(methodIn.getATGrpR14())); 
//  DISPLAY '* 482* WS-14A-T-GRP    = (' WS-14A-T-GRP ')'
          logger.info("* 482* WS-14A-T-GRP    = ({})", methodIn.getATGrp14().toString()); 
//  DISPLAY '* 483* WS-14A-T        = (' WS-14A-T ')'
          logger.info("* 483* WS-14A-T        = ({})", methodOut.getAT14().toString()); 
//  DISPLAY '* 484*   WS-14A-T-FLD1 = (' WS-14A-T-FLD1 ')'
          logger.info("* 484*   WS-14A-T-FLD1 = ({})", new String(methodIn.getATFld114())); 
//  DISPLAY '* 485*   WS-14A-T-FLD2 = (' WS-14A-T-FLD2 ')'
          logger.info("* 485*   WS-14A-T-FLD2 = ({})", new String(methodIn.getATFld214())); 

// *
//  INITIALIZE WS-14A-S WS-14A-T
          methodOut.setAS14(CONSTANTS.SPACE_70 /* Fill 70 Spaces*/);
          methodOut.getAT14().initialize();
//  MOVE ALL 'ABCD' TO WS-14A-S
          methodOut.setAS14(CONSTANTS.LITERAL_1222519919);
//  MOVE LENGTH OF WS-14A-S TO WS-S-LEN
          methodOut.setSLen((short) A_S_14_LENGTH);
//  MOVE LENGTH OF WS-14A-T TO WS-T-LEN
          methodOut.setTLen((short) AT14.getAT14FieldLength());
//  SUBTRACT 3 FROM WS-S-LEN
          methodOut.setSLen( (short) (methodOut.getSLen()-(short)3));
//  SUBTRACT 5 FROM WS-T-LEN
          methodOut.setTLen( (short) (methodOut.getTLen()-(short)5));
//  MOVE WS-14A-S ( 3 : WS-S-LEN ) TO WS-14A-T ( 5 : WS-T-LEN )
          methodOut.getATGrpGroup14().replace(methodIn.getASGrp14()/*parent*/,3+3 - 1/*fromOffset - (aT14) */,methodOut.getSLen()/*fromLen*/,5+5 - 1/*toOffset - (aS14) */,methodOut.getTLen()/*toLen*/);

// *
//  DISPLAY '* 486* WS-14A-S-GRP    = (' WS-14A-S-GRP ')'
          logger.info("* 486* WS-14A-S-GRP    = ({})", methodIn.getASGrp14().toString()); 
//  DISPLAY '* 487* WS-14A-S        = (' WS-14A-S ')'
          logger.info("* 487* WS-14A-S        = ({})", new String(methodOut.getAS14())); 
//  DISPLAY '* 488* WS-14A-T-GRP-R  = (' WS-14A-T-GRP-R ')'
          logger.info("* 488* WS-14A-T-GRP-R  = ({})", new String(methodIn.getATGrpR14())); 
//  DISPLAY '* 489* WS-14A-T-GRP    = (' WS-14A-T-GRP ')'
          logger.info("* 489* WS-14A-T-GRP    = ({})", methodIn.getATGrp14().toString()); 
//  DISPLAY '* 490* WS-14A-T        = (' WS-14A-T ')'
          logger.info("* 490* WS-14A-T        = ({})", methodOut.getAT14().toString()); 
//  DISPLAY '* 491*   WS-14A-T-FLD1 = (' WS-14A-T-FLD1 ')'
          logger.info("* 491*   WS-14A-T-FLD1 = ({})", new String(methodIn.getATFld114())); 
//  DISPLAY '* 492*   WS-14A-T-FLD2 = (' WS-14A-T-FLD2 ')'
          logger.info("* 492*   WS-14A-T-FLD2 = ({})", new String(methodIn.getATFld214())); 

// *
// * Src -> string; tgt -> group ; src smaller than tgt
// *    src offset 3  ;target offset 5
// *
//  INITIALIZE WS-14B-S WS-14B-T
          methodOut.setBS14(CONSTANTS.SPACE_70 /* Fill 70 Spaces*/);
          methodOut.getBT14().initialize();
//  MOVE ALL 'ABCD' TO WS-14B-S
          methodOut.setBS14(CONSTANTS.LITERAL_1222519919);
//  MOVE ALL 'MNOP' TO WS-14B-T-FLD3
          methodOut.setBTFld314(CONSTANTS.LITERAL_MNOPMNOPMNOPMNOPMNOPMNOPMNOPMNOP);
//  MOVE WS-14B-S ( 3 : LENGTH OF WS-14B-S - 3 ) TO WS-14B-T ( 5 : LENGTH OF WS-14B-T - 5)
          methodOut.getBTGrpGroup14().replace(methodIn.getBSGrp14()/*parent*/,3+3 - 1/*fromOffset - (bT14) */,B_S_14_LENGTH - 3/*fromLen*/,5+5 - 1/*toOffset - (bS14) */,BT14.getBT14FieldLength() - 5/*toLen*/);

// *
//  DISPLAY '* 493* WS-14B-S-GRP    = (' WS-14B-S-GRP ')'
          logger.info("* 493* WS-14B-S-GRP    = ({})", methodIn.getBSGrp14().toString()); 
//  DISPLAY '* 494* WS-14B-S        = (' WS-14B-S ')'
          logger.info("* 494* WS-14B-S        = ({})", new String(methodOut.getBS14())); 
//  DISPLAY '* 495* WS-14B-T-GRP-R  = (' WS-14B-T-GRP-R ')'
          logger.info("* 495* WS-14B-T-GRP-R  = ({})", new String(methodIn.getBTGrpR14())); 
//  DISPLAY '* 496* WS-14B-T-GRP    = (' WS-14B-T-GRP ')'
          logger.info("* 496* WS-14B-T-GRP    = ({})", methodIn.getBTGrp14().toString()); 
//  DISPLAY '* 497* WS-14B-T        = (' WS-14B-T ')'
          logger.info("* 497* WS-14B-T        = ({})", methodOut.getBT14().toString()); 
//  DISPLAY '* 498*   WS-14B-T-FLD1 = (' WS-14B-T-FLD1 ')'
          logger.info("* 498*   WS-14B-T-FLD1 = ({})", new String(methodOut.getBTFld114())); 
//  DISPLAY '* 499*   WS-14B-T-FLD2 = (' WS-14B-T-FLD2 ')'
          logger.info("* 499*   WS-14B-T-FLD2 = ({})", new String(methodOut.getBTFld214())); 
//  DISPLAY '* 500*   WS-14B-T-FLD3 = (' WS-14B-T-FLD3 ')'
          logger.info("* 500*   WS-14B-T-FLD3 = ({})", new String(methodOut.getBTFld314())); 

// *
//  INITIALIZE WS-14B-S WS-14B-T
          methodOut.setBS14(CONSTANTS.SPACE_70 /* Fill 70 Spaces*/);
          methodOut.getBT14().initialize();
//  MOVE ALL 'ABCD' TO WS-14B-S
          methodOut.setBS14(CONSTANTS.LITERAL_1222519919);
//  MOVE ALL 'MNOP' TO WS-14B-T-FLD3
          methodOut.setBTFld314(CONSTANTS.LITERAL_MNOPMNOPMNOPMNOPMNOPMNOPMNOPMNOP);
//  MOVE LENGTH OF WS-14B-S TO WS-S-LEN
          methodOut.setSLen((short) B_S_14_LENGTH);
//  MOVE LENGTH OF WS-14B-T TO WS-T-LEN
          methodOut.setTLen((short) BT14.getBT14FieldLength());
//  SUBTRACT 3 FROM WS-S-LEN
          methodOut.setSLen( (short) (methodOut.getSLen()-(short)3));
//  SUBTRACT 5 FROM WS-T-LEN
          methodOut.setTLen( (short) (methodOut.getTLen()-(short)5));
//  MOVE WS-14B-S ( 3 : WS-S-LEN ) TO WS-14B-T ( 5 : WS-T-LEN )
          methodOut.getBTGrpGroup14().replace(methodIn.getBSGrp14()/*parent*/,3+3 - 1/*fromOffset - (bT14) */,methodOut.getSLen()/*fromLen*/,5+5 - 1/*toOffset - (bS14) */,methodOut.getTLen()/*toLen*/);

// *
//  DISPLAY '* 501* WS-14B-S-GRP    = (' WS-14B-S-GRP ')'
          logger.info("* 501* WS-14B-S-GRP    = ({})", methodIn.getBSGrp14().toString()); 
//  DISPLAY '* 502* WS-14B-S        = (' WS-14B-S ')'
          logger.info("* 502* WS-14B-S        = ({})", new String(methodOut.getBS14())); 
//  DISPLAY '* 503* WS-14B-T-GRP-R  = (' WS-14B-T-GRP-R ')'
          logger.info("* 503* WS-14B-T-GRP-R  = ({})", new String(methodIn.getBTGrpR14())); 
//  DISPLAY '* 504* WS-14B-T-GRP    = (' WS-14B-T-GRP ')'
          logger.info("* 504* WS-14B-T-GRP    = ({})", methodIn.getBTGrp14().toString()); 
//  DISPLAY '* 505* WS-14B-T        = (' WS-14B-T ')'
          logger.info("* 505* WS-14B-T        = ({})", methodOut.getBT14().toString()); 
//  DISPLAY '* 506*   WS-14B-T-FLD1 = (' WS-14B-T-FLD1 ')'
          logger.info("* 506*   WS-14B-T-FLD1 = ({})", new String(methodOut.getBTFld114())); 
//  DISPLAY '* 507*   WS-14B-T-FLD2 = (' WS-14B-T-FLD2 ')'
          logger.info("* 507*   WS-14B-T-FLD2 = ({})", new String(methodOut.getBTFld214())); 
//  DISPLAY '* 508*   WS-14B-T-FLD3 = (' WS-14B-T-FLD3 ')'
          logger.info("* 508*   WS-14B-T-FLD3 = ({})", new String(methodOut.getBTFld314())); 

// *
// * Src -> group; tgt -> group ; src bigger than tgt
// *    src offset 3  ;target offset 0
// *
//  INITIALIZE WS-15A-S WS-15A-T
          methodOut.getAS15().initialize();
          methodOut.getAT15().initialize();
//  MOVE ALL 'ABCD' TO WS-15A-S-FLD1
          methodOut.setASFld115(CONSTANTS.LITERAL_ABCDABCDABCDABCDABCDABCDABCDABCD);
//  MOVE ALL 'ZYXW' TO WS-15A-S-FLD2
          methodOut.setASFld215(CONSTANTS.LITERAL_645286444);
      
      return methodOut;
      }
      /**
      * mainlineSplit17 
      *   This method is derived from 
  *   COBOL Paragraph - MAINLINE-SPLIT17 COBOL Cyclomatic complexity - 1
      * Input  :  

      * - aS15                           COBOL Name: WS-15A-S
      * - aSGrp15                        COBOL Name: WS-15A-S-GRP
      * - aTR15                          COBOL Name: WS-15A-T-R
      * - bSGrp15                        COBOL Name: WS-15B-S-GRP
      * - bTR15                          COBOL Name: WS-15B-T-R
      *
      * Output :  

      * - aT15                           COBOL Name: WS-15A-T
      * - aS15                           COBOL Name: WS-15A-S
      * - aSFld115                       COBOL Name: WS-15A-S-FLD1
      * - aSFld215                       COBOL Name: WS-15A-S-FLD2
      * - aTFld115                       COBOL Name: WS-15A-T-FLD1
      * - aTFld215                       COBOL Name: WS-15A-T-FLD2
      * - sLen                           COBOL Name: WS-S-LEN
      * - tLen                           COBOL Name: WS-T-LEN
      * - bS15                           COBOL Name: WS-15B-S
      * - bT15                           COBOL Name: WS-15B-T
      * - bSFld115                       COBOL Name: WS-15B-S-FLD1
      * - bSFld215                       COBOL Name: WS-15B-S-FLD2
      * - bTFld315                       COBOL Name: WS-15B-T-FLD3
      * - bTFld115                       COBOL Name: WS-15B-T-FLD1
      * - bTFld215                       COBOL Name: WS-15B-T-FLD2
      *
      * @throws CFException
      */
      @Override
      public MainlineSplit17OutCtx mainlineSplit17(MainlineSplit17InCtx methodIn) throws Exception {
Refmod1Ctx programCtx = methodIn.getRefmod1Ctx();
MainlineSplit17OutCtx methodOut = methodIn.getMainlineSplit17OutCtx();
//  MOVE WS-15A-S ( 3 : LENGTH OF WS-15A-S - 3 ) TO WS-15A-T ( 5 : LENGTH OF WS-15A-T - 5)
          methodOut.getATGroup15().replace(methodIn.getASGrp15()/*parent*/,3+3 - 1/*fromOffset - (aT15) */,AS15.getAS15FieldLength() - 3/*fromLen*/,0+5 - 1/*toOffset - (aS15) */,AT15.getAT15FieldLength() - 5/*toLen*/);

// *
//  DISPLAY '* 509* WS-15A-S-GRP    = (' WS-15A-S-GRP ')'
          logger.info("* 509* WS-15A-S-GRP    = ({})", methodIn.getASGrp15().toString()); 
//  DISPLAY '* 510* WS-15A-S        = (' WS-15A-S ')'
          logger.info("* 510* WS-15A-S        = ({})", methodOut.getAS15().toString()); 
//  DISPLAY '* 511*   WS-15A-S-FLD1 = (' WS-15A-S-FLD1 ')'
          logger.info("* 511*   WS-15A-S-FLD1 = ({})", new String(methodOut.getASFld115())); 
//  DISPLAY '* 512*   WS-15A-S-FLD2 = (' WS-15A-S-FLD2 ')'
          logger.info("* 512*   WS-15A-S-FLD2 = ({})", new String(methodOut.getASFld215())); 
//  DISPLAY '* 513* WS-15A-T-R      = (' WS-15A-T-R ')'
          logger.info("* 513* WS-15A-T-R      = ({})", new String(methodIn.getATR15())); 
//  DISPLAY '* 514* WS-15A-T        = (' WS-15A-T ')'
          logger.info("* 514* WS-15A-T        = ({})", methodOut.getAT15().toString()); 
//  DISPLAY '* 515*   WS-15A-T-FLD1 = (' WS-15A-T-FLD1 ')'
          logger.info("* 515*   WS-15A-T-FLD1 = ({})", new String(methodOut.getATFld115())); 
//  DISPLAY '* 516*   WS-15A-T-FLD2 = (' WS-15A-T-FLD2 ')'
          logger.info("* 516*   WS-15A-T-FLD2 = ({})", new String(methodOut.getATFld215())); 

// *
//  INITIALIZE WS-15A-S WS-15A-T
          methodOut.getAS15().initialize();
          methodOut.getAT15().initialize();
//  MOVE ALL 'ABCD' TO WS-15A-S-FLD1
          methodOut.setASFld115(CONSTANTS.LITERAL_ABCDABCDABCDABCDABCDABCDABCDABCD);
//  MOVE ALL 'ZYXW' TO WS-15A-S-FLD2
          methodOut.setASFld215(CONSTANTS.LITERAL_645286444);
//  MOVE LENGTH OF WS-15A-S TO WS-S-LEN
          methodOut.setSLen((short) AS15.getAS15FieldLength());
//  MOVE LENGTH OF WS-15A-T TO WS-T-LEN
          methodOut.setTLen((short) AT15.getAT15FieldLength());
//  SUBTRACT 3 FROM WS-S-LEN
          methodOut.setSLen( (short) (methodOut.getSLen()-(short)3));
//  SUBTRACT 5 FROM WS-T-LEN
          methodOut.setTLen( (short) (methodOut.getTLen()-(short)5));
//  MOVE WS-15A-S ( 3 : WS-S-LEN ) TO WS-15A-T ( 5 : WS-T-LEN )
          methodOut.getATGroup15().replace(methodIn.getASGrp15()/*parent*/,3+3 - 1/*fromOffset - (aT15) */,methodOut.getSLen()/*fromLen*/,0+5 - 1/*toOffset - (aS15) */,methodOut.getTLen()/*toLen*/);

// *
//  DISPLAY '* 517* WS-15A-S-GRP    = (' WS-15A-S-GRP ')'
          logger.info("* 517* WS-15A-S-GRP    = ({})", methodIn.getASGrp15().toString()); 
//  DISPLAY '* 518* WS-15A-S        = (' WS-15A-S ')'
          logger.info("* 518* WS-15A-S        = ({})", methodOut.getAS15().toString()); 
//  DISPLAY '* 519*   WS-15A-S-FLD1 = (' WS-15A-S-FLD1 ')'
          logger.info("* 519*   WS-15A-S-FLD1 = ({})", new String(methodOut.getASFld115())); 
//  DISPLAY '* 520*   WS-15A-S-FLD2 = (' WS-15A-S-FLD2 ')'
          logger.info("* 520*   WS-15A-S-FLD2 = ({})", new String(methodOut.getASFld215())); 
//  DISPLAY '* 521* WS-15A-T-R      = (' WS-15A-T-R ')'
          logger.info("* 521* WS-15A-T-R      = ({})", new String(methodIn.getATR15())); 
//  DISPLAY '* 522* WS-15A-T        = (' WS-15A-T ')'
          logger.info("* 522* WS-15A-T        = ({})", methodOut.getAT15().toString()); 
//  DISPLAY '* 523*   WS-15A-T-FLD1 = (' WS-15A-T-FLD1 ')'
          logger.info("* 523*   WS-15A-T-FLD1 = ({})", new String(methodOut.getATFld115())); 
//  DISPLAY '* 524*   WS-15A-T-FLD2 = (' WS-15A-T-FLD2 ')'
          logger.info("* 524*   WS-15A-T-FLD2 = ({})", new String(methodOut.getATFld215())); 

// *
// * Src -> group; tgt -> group ; src smaller than tgt
// *    src offset 3  ;target offset 0
// *
//  INITIALIZE WS-15B-S WS-15B-T
          methodOut.getBS15().initialize();
          methodOut.getBT15().initialize();
//  MOVE ALL 'ABCD' TO WS-15B-S-FLD1
          methodOut.setBSFld115(CONSTANTS.LITERAL_ABCDABCDABCDABCDABCDABCDABCDABCD);
//  MOVE ALL 'ZYXW' TO WS-15B-S-FLD2
          methodOut.setBSFld215(CONSTANTS.LITERAL_645286444);
//  MOVE ALL 'MNOP' TO WS-15B-T-FLD3
          methodOut.setBTFld315(CONSTANTS.LITERAL_MNOPMNOPMNOPMNOPMNOPMNOPMNOPMNOP);
//  MOVE WS-15B-S ( 3 : LENGTH OF WS-15B-S - 3 ) TO WS-15B-T ( 5 : LENGTH OF WS-15B-T - 5)
          methodOut.getBTGroup15().replace(methodIn.getBSGrp15()/*parent*/,3+3 - 1/*fromOffset - (bT15) */,BS15.getBS15FieldLength() - 3/*fromLen*/,0+5 - 1/*toOffset - (bS15) */,BT15.getBT15FieldLength() - 5/*toLen*/);

// *
//  DISPLAY '* 525* WS-15B-S-GRP    = (' WS-15B-S-GRP ')'
          logger.info("* 525* WS-15B-S-GRP    = ({})", methodIn.getBSGrp15().toString()); 
//  DISPLAY '* 526* WS-15B-S        = (' WS-15B-S ')'
          logger.info("* 526* WS-15B-S        = ({})", methodOut.getBS15().toString()); 
//  DISPLAY '* 527*   WS-15B-S-FLD1 = (' WS-15B-S-FLD1 ')'
          logger.info("* 527*   WS-15B-S-FLD1 = ({})", new String(methodOut.getBSFld115())); 
//  DISPLAY '* 528*   WS-15B-S-FLD2 = (' WS-15B-S-FLD2 ')'
          logger.info("* 528*   WS-15B-S-FLD2 = ({})", new String(methodOut.getBSFld215())); 
//  DISPLAY '* 529* WS-15B-T-R      = (' WS-15B-T-R ')'
          logger.info("* 529* WS-15B-T-R      = ({})", new String(methodIn.getBTR15())); 
//  DISPLAY '* 530* WS-15B-T        = (' WS-15B-T ')'
          logger.info("* 530* WS-15B-T        = ({})", methodOut.getBT15().toString()); 
//  DISPLAY '* 531*   WS-15B-T-FLD1 = (' WS-15B-T-FLD1 ')'
          logger.info("* 531*   WS-15B-T-FLD1 = ({})", new String(methodOut.getBTFld115())); 
//  DISPLAY '* 532*   WS-15B-T-FLD2 = (' WS-15B-T-FLD2 ')'
          logger.info("* 532*   WS-15B-T-FLD2 = ({})", new String(methodOut.getBTFld215())); 
//  DISPLAY '* 533*   WS-15B-T-FLD3 = (' WS-15B-T-FLD3 ')'
          logger.info("* 533*   WS-15B-T-FLD3 = ({})", new String(methodOut.getBTFld315())); 

// *
//  INITIALIZE WS-15B-S WS-15B-T
          methodOut.getBS15().initialize();
          methodOut.getBT15().initialize();
//  MOVE ALL 'ABCD' TO WS-15B-S-FLD1
          methodOut.setBSFld115(CONSTANTS.LITERAL_ABCDABCDABCDABCDABCDABCDABCDABCD);
//  MOVE ALL 'ZYXW' TO WS-15B-S-FLD2
          methodOut.setBSFld215(CONSTANTS.LITERAL_645286444);
//  MOVE ALL 'MNOP' TO WS-15B-T-FLD3
          methodOut.setBTFld315(CONSTANTS.LITERAL_MNOPMNOPMNOPMNOPMNOPMNOPMNOPMNOP);
//  MOVE LENGTH OF WS-15B-S TO WS-S-LEN
          methodOut.setSLen((short) BS15.getBS15FieldLength());
//  MOVE LENGTH OF WS-15B-T TO WS-T-LEN
          methodOut.setTLen((short) BT15.getBT15FieldLength());
//  SUBTRACT 3 FROM WS-S-LEN
          methodOut.setSLen( (short) (methodOut.getSLen()-(short)3));
//  SUBTRACT 5 FROM WS-T-LEN
          methodOut.setTLen( (short) (methodOut.getTLen()-(short)5));
//  MOVE WS-15B-S ( 3 : WS-S-LEN ) TO WS-15B-T ( 5 : WS-T-LEN )
          methodOut.getBTGroup15().replace(methodIn.getBSGrp15()/*parent*/,3+3 - 1/*fromOffset - (bT15) */,methodOut.getSLen()/*fromLen*/,0+5 - 1/*toOffset - (bS15) */,methodOut.getTLen()/*toLen*/);

// *
//  DISPLAY '* 534* WS-15B-S-GRP    = (' WS-15B-S-GRP ')'
          logger.info("* 534* WS-15B-S-GRP    = ({})", methodIn.getBSGrp15().toString()); 
//  DISPLAY '* 535* WS-15B-S        = (' WS-15B-S ')'
          logger.info("* 535* WS-15B-S        = ({})", methodOut.getBS15().toString()); 
//  DISPLAY '* 536*   WS-15B-S-FLD1 = (' WS-15B-S-FLD1 ')'
          logger.info("* 536*   WS-15B-S-FLD1 = ({})", new String(methodOut.getBSFld115())); 
      
      return methodOut;
      }
      /**
      * mainlineSplit18 
      *   This method is derived from 
  *   COBOL Paragraph - MAINLINE-SPLIT18 COBOL Cyclomatic complexity - 1
      * Input  :  

      * - bSFld215                       COBOL Name: WS-15B-S-FLD2
      * - bTR15                          COBOL Name: WS-15B-T-R
      * - bT15                           COBOL Name: WS-15B-T
      * - bTFld115                       COBOL Name: WS-15B-T-FLD1
      * - bTFld215                       COBOL Name: WS-15B-T-FLD2
      * - bTFld315                       COBOL Name: WS-15B-T-FLD3
      * - aSGrp16                        COBOL Name: WS-16A-S-GRP
      * - aTR16                          COBOL Name: WS-16A-T-R
      * - bSGrp16                        COBOL Name: WS-16B-S-GRP
      * - bTR16                          COBOL Name: WS-16B-T-R
      *
      * Output :  

      * - aS16                           COBOL Name: WS-16A-S
      * - aT16                           COBOL Name: WS-16A-T
      * - aTFld116                       COBOL Name: WS-16A-T-FLD1
      * - aTFld216                       COBOL Name: WS-16A-T-FLD2
      * - sLen                           COBOL Name: WS-S-LEN
      * - tLen                           COBOL Name: WS-T-LEN
      * - bS16                           COBOL Name: WS-16B-S
      * - bT16                           COBOL Name: WS-16B-T
      * - bTFld316                       COBOL Name: WS-16B-T-FLD3
      * - bTFld116                       COBOL Name: WS-16B-T-FLD1
      * - bTFld216                       COBOL Name: WS-16B-T-FLD2
      *
      * @throws CFException
      */
      @Override
      public MainlineSplit18OutCtx mainlineSplit18(MainlineSplit18InCtx methodIn) throws Exception {
			// Declare local variables used in the method
			 final int A_S_16_LENGTH = 70;
			 final int B_S_16_LENGTH = 70;
			// End of variable declaration

Refmod1Ctx programCtx = methodIn.getRefmod1Ctx();
MainlineSplit18OutCtx methodOut = methodIn.getMainlineSplit18OutCtx();
//  DISPLAY '* 537*   WS-15B-S-FLD2 = (' WS-15B-S-FLD2 ')'
          logger.info("* 537*   WS-15B-S-FLD2 = ({})", new String(methodIn.getBSFld215())); 
//  DISPLAY '* 538* WS-15B-T-R      = (' WS-15B-T-R ')'
          logger.info("* 538* WS-15B-T-R      = ({})", new String(methodIn.getBTR15())); 
//  DISPLAY '* 539* WS-15B-T        = (' WS-15B-T ')'
          logger.info("* 539* WS-15B-T        = ({})", methodIn.getBT15().toString()); 
//  DISPLAY '* 540*   WS-15B-T-FLD1 = (' WS-15B-T-FLD1 ')'
          logger.info("* 540*   WS-15B-T-FLD1 = ({})", new String(methodIn.getBTFld115())); 
//  DISPLAY '* 541*   WS-15B-T-FLD2 = (' WS-15B-T-FLD2 ')'
          logger.info("* 541*   WS-15B-T-FLD2 = ({})", new String(methodIn.getBTFld215())); 
//  DISPLAY '* 542*   WS-15B-T-FLD3 = (' WS-15B-T-FLD3 ')'
          logger.info("* 542*   WS-15B-T-FLD3 = ({})", new String(methodIn.getBTFld315())); 

// *
// * Src -> string; tgt -> group ; src bigger than tgt
// *    src offset 3  ;target offset 0
// *
//  INITIALIZE WS-16A-S WS-16A-T
          methodOut.setAS16(CONSTANTS.SPACE_70 /* Fill 70 Spaces*/);
          methodOut.getAT16().initialize();
//  MOVE ALL 'ABCD' TO WS-16A-S
          methodOut.setAS16(CONSTANTS.LITERAL_1222519919);
//  MOVE WS-16A-S ( 3 : LENGTH OF WS-16A-S - 3 ) TO WS-16A-T ( 5 : LENGTH OF WS-16A-T - 5)
          methodOut.getATGroup16().replace(methodIn.getASGrp16()/*parent*/,3+3 - 1/*fromOffset - (aT16) */,A_S_16_LENGTH - 3/*fromLen*/,0+5 - 1/*toOffset - (aS16) */,AT16.getAT16FieldLength() - 5/*toLen*/);

// *
//  DISPLAY '* 543* WS-16A-S-GRP    = (' WS-16A-S-GRP ')'
          logger.info("* 543* WS-16A-S-GRP    = ({})", methodIn.getASGrp16().toString()); 
//  DISPLAY '* 544* WS-16A-S        = (' WS-16A-S ')'
          logger.info("* 544* WS-16A-S        = ({})", new String(methodOut.getAS16())); 
//  DISPLAY '* 545* WS-16A-T-R      = (' WS-16A-T-R ')'
          logger.info("* 545* WS-16A-T-R      = ({})", new String(methodIn.getATR16())); 
//  DISPLAY '* 546* WS-16A-T        = (' WS-16A-T ')'
          logger.info("* 546* WS-16A-T        = ({})", methodOut.getAT16().toString()); 
//  DISPLAY '* 547*   WS-16A-T-FLD1 = (' WS-16A-T-FLD1 ')'
          logger.info("* 547*   WS-16A-T-FLD1 = ({})", new String(methodOut.getATFld116())); 
//  DISPLAY '* 548*   WS-16A-T-FLD2 = (' WS-16A-T-FLD2 ')'
          logger.info("* 548*   WS-16A-T-FLD2 = ({})", new String(methodOut.getATFld216())); 

// *
//  INITIALIZE WS-16A-S WS-16A-T
          methodOut.setAS16(CONSTANTS.SPACE_70 /* Fill 70 Spaces*/);
          methodOut.getAT16().initialize();
//  MOVE ALL 'ABCD' TO WS-16A-S
          methodOut.setAS16(CONSTANTS.LITERAL_1222519919);
//  MOVE LENGTH OF WS-16A-S TO WS-S-LEN
          methodOut.setSLen((short) A_S_16_LENGTH);
//  MOVE LENGTH OF WS-16A-T TO WS-T-LEN
          methodOut.setTLen((short) AT16.getAT16FieldLength());
//  SUBTRACT 3 FROM WS-S-LEN
          methodOut.setSLen( (short) (methodOut.getSLen()-(short)3));
//  SUBTRACT 5 FROM WS-T-LEN
          methodOut.setTLen( (short) (methodOut.getTLen()-(short)5));
//  MOVE WS-16A-S ( 3 : WS-S-LEN ) TO WS-16A-T ( 5 : WS-T-LEN )
          methodOut.getATGroup16().replace(methodIn.getASGrp16()/*parent*/,3+3 - 1/*fromOffset - (aT16) */,methodOut.getSLen()/*fromLen*/,0+5 - 1/*toOffset - (aS16) */,methodOut.getTLen()/*toLen*/);

// *
//  DISPLAY '* 549* WS-16A-S-GRP    = (' WS-16A-S-GRP ')'
          logger.info("* 549* WS-16A-S-GRP    = ({})", methodIn.getASGrp16().toString()); 
//  DISPLAY '* 550* WS-16A-S        = (' WS-16A-S ')'
          logger.info("* 550* WS-16A-S        = ({})", new String(methodOut.getAS16())); 
//  DISPLAY '* 551* WS-16A-T-R      = (' WS-16A-T-R ')'
          logger.info("* 551* WS-16A-T-R      = ({})", new String(methodIn.getATR16())); 
//  DISPLAY '* 552* WS-16A-T        = (' WS-16A-T ')'
          logger.info("* 552* WS-16A-T        = ({})", methodOut.getAT16().toString()); 
//  DISPLAY '* 553*   WS-16A-T-FLD1 = (' WS-16A-T-FLD1 ')'
          logger.info("* 553*   WS-16A-T-FLD1 = ({})", new String(methodOut.getATFld116())); 
//  DISPLAY '* 554*   WS-16A-T-FLD2 = (' WS-16A-T-FLD2 ')'
          logger.info("* 554*   WS-16A-T-FLD2 = ({})", new String(methodOut.getATFld216())); 

// *
// * Src -> string; tgt -> group ; src smaller than tgt
// *    src offset 3  ;target offset 0
// *
//  INITIALIZE WS-16B-S WS-16B-T
          methodOut.setBS16(CONSTANTS.SPACE_70 /* Fill 70 Spaces*/);
          methodOut.getBT16().initialize();
//  MOVE ALL 'ABCD' TO WS-16B-S
          methodOut.setBS16(CONSTANTS.LITERAL_1222519919);
//  MOVE ALL 'MNOP' TO WS-16B-T-FLD3
          methodOut.setBTFld316(CONSTANTS.LITERAL_MNOPMNOPMNOPMNOPMNOPMNOPMNOPMNOP);
//  MOVE WS-16B-S ( 3 : LENGTH OF WS-16B-S - 3 ) TO WS-16B-T ( 5 : LENGTH OF WS-16B-T - 5)
          methodOut.getBTGroup16().replace(methodIn.getBSGrp16()/*parent*/,3+3 - 1/*fromOffset - (bT16) */,B_S_16_LENGTH - 3/*fromLen*/,0+5 - 1/*toOffset - (bS16) */,BT16.getBT16FieldLength() - 5/*toLen*/);

// *
//  DISPLAY '* 555* WS-16B-S-GRP    = (' WS-16B-S-GRP ')'
          logger.info("* 555* WS-16B-S-GRP    = ({})", methodIn.getBSGrp16().toString()); 
//  DISPLAY '* 556* WS-16B-S        = (' WS-16B-S ')'
          logger.info("* 556* WS-16B-S        = ({})", new String(methodOut.getBS16())); 
//  DISPLAY '* 557* WS-16B-T-R      = (' WS-16B-T-R ')'
          logger.info("* 557* WS-16B-T-R      = ({})", new String(methodIn.getBTR16())); 
//  DISPLAY '* 558* WS-16B-T        = (' WS-16B-T ')'
          logger.info("* 558* WS-16B-T        = ({})", methodOut.getBT16().toString()); 
//  DISPLAY '* 559*   WS-16B-T-FLD1 = (' WS-16B-T-FLD1 ')'
          logger.info("* 559*   WS-16B-T-FLD1 = ({})", new String(methodOut.getBTFld116())); 
//  DISPLAY '* 560*   WS-16B-T-FLD2 = (' WS-16B-T-FLD2 ')'
          logger.info("* 560*   WS-16B-T-FLD2 = ({})", new String(methodOut.getBTFld216())); 
//  DISPLAY '* 561*   WS-16B-T-FLD3 = (' WS-16B-T-FLD3 ')'
          logger.info("* 561*   WS-16B-T-FLD3 = ({})", new String(methodOut.getBTFld316())); 

// *
//  INITIALIZE WS-16B-S WS-16B-T
          methodOut.setBS16(CONSTANTS.SPACE_70 /* Fill 70 Spaces*/);
          methodOut.getBT16().initialize();
//  MOVE ALL 'ABCD' TO WS-16B-S
          methodOut.setBS16(CONSTANTS.LITERAL_1222519919);
//  MOVE ALL 'MNOP' TO WS-16B-T-FLD3
          methodOut.setBTFld316(CONSTANTS.LITERAL_MNOPMNOPMNOPMNOPMNOPMNOPMNOPMNOP);
//  MOVE LENGTH OF WS-16B-S TO WS-S-LEN
          methodOut.setSLen((short) B_S_16_LENGTH);
//  MOVE LENGTH OF WS-16B-T TO WS-T-LEN
          methodOut.setTLen((short) BT16.getBT16FieldLength());
//  SUBTRACT 3 FROM WS-S-LEN
          methodOut.setSLen( (short) (methodOut.getSLen()-(short)3));
//  SUBTRACT 5 FROM WS-T-LEN
          methodOut.setTLen( (short) (methodOut.getTLen()-(short)5));
//  MOVE WS-16B-S ( 3 : WS-S-LEN ) TO WS-16B-T ( 5 : WS-T-LEN )
          methodOut.getBTGroup16().replace(methodIn.getBSGrp16()/*parent*/,3+3 - 1/*fromOffset - (bT16) */,methodOut.getSLen()/*fromLen*/,0+5 - 1/*toOffset - (bS16) */,methodOut.getTLen()/*toLen*/);

// *
//  DISPLAY '* 562* WS-16B-S-GRP    = (' WS-16B-S-GRP ')'
          logger.info("* 562* WS-16B-S-GRP    = ({})", methodIn.getBSGrp16().toString()); 
//  DISPLAY '* 563* WS-16B-S        = (' WS-16B-S ')'
          logger.info("* 563* WS-16B-S        = ({})", new String(methodOut.getBS16())); 
//  DISPLAY '* 564* WS-16B-T-R      = (' WS-16B-T-R ')'
          logger.info("* 564* WS-16B-T-R      = ({})", new String(methodIn.getBTR16())); 
//  DISPLAY '* 565* WS-16B-T        = (' WS-16B-T ')'
          logger.info("* 565* WS-16B-T        = ({})", methodOut.getBT16().toString()); 
      
      return methodOut;
      }
      /**
      * mainlineSplit19 
      *   This method is derived from 
  *   COBOL Paragraph - MAINLINE-SPLIT19 COBOL Cyclomatic complexity - 1
      * Input  :  

      * - bTFld116                       COBOL Name: WS-16B-T-FLD1
      * - bTFld216                       COBOL Name: WS-16B-T-FLD2
      * - bTFld316                       COBOL Name: WS-16B-T-FLD3
      * - aTGrpR17                       COBOL Name: WS-17A-T-GRP-R
      * - aTGrp17                        COBOL Name: WS-17A-T-GRP
      * - bTGrpR17                       COBOL Name: WS-17B-T-GRP-R
      * - bTGrp17                        COBOL Name: WS-17B-T-GRP
      *
      * Output :  

      * - aS17                           COBOL Name: WS-17A-S
      * - aT17                           COBOL Name: WS-17A-T
      * - aSFld117                       COBOL Name: WS-17A-S-FLD1
      * - aSFld217                       COBOL Name: WS-17A-S-FLD2
      * - aTFld117                       COBOL Name: WS-17A-T-FLD1
      * - aTFld217                       COBOL Name: WS-17A-T-FLD2
      * - sLen                           COBOL Name: WS-S-LEN
      * - tLen                           COBOL Name: WS-T-LEN
      * - bS17                           COBOL Name: WS-17B-S
      * - bT17                           COBOL Name: WS-17B-T
      * - bSFld117                       COBOL Name: WS-17B-S-FLD1
      * - bSFld217                       COBOL Name: WS-17B-S-FLD2
      * - bTFld317                       COBOL Name: WS-17B-T-FLD3
      * - bTFld117                       COBOL Name: WS-17B-T-FLD1
      * - bTFld217                       COBOL Name: WS-17B-T-FLD2
      *
      * @throws CFException
      */
      @Override
      public MainlineSplit19OutCtx mainlineSplit19(MainlineSplit19InCtx methodIn) throws Exception {
Refmod1Ctx programCtx = methodIn.getRefmod1Ctx();
MainlineSplit19OutCtx methodOut = methodIn.getMainlineSplit19OutCtx();
//  DISPLAY '* 566*   WS-16B-T-FLD1 = (' WS-16B-T-FLD1 ')'
          logger.info("* 566*   WS-16B-T-FLD1 = ({})", new String(methodIn.getBTFld116())); 
//  DISPLAY '* 567*   WS-16B-T-FLD2 = (' WS-16B-T-FLD2 ')'
          logger.info("* 567*   WS-16B-T-FLD2 = ({})", new String(methodIn.getBTFld216())); 
//  DISPLAY '* 568*   WS-16B-T-FLD3 = (' WS-16B-T-FLD3 ')'
          logger.info("* 568*   WS-16B-T-FLD3 = ({})", new String(methodIn.getBTFld316())); 

// *    Src offset 0  ;target offset 5
// *
//  INITIALIZE WS-17A-S WS-17A-T
          methodOut.getAS17().initialize();
          methodOut.getAT17().initialize();
//  MOVE ALL 'ABCD' TO WS-17A-S-FLD1
          methodOut.setASFld117(CONSTANTS.LITERAL_ABCDABCDABCDABCDABCDABCDABCDABCD);
//  MOVE ALL 'ZYXW' TO WS-17A-S-FLD2
          methodOut.setASFld217(CONSTANTS.LITERAL_645286444);
//  MOVE WS-17A-S ( 3 : LENGTH OF WS-17A-S - 3 ) TO WS-17A-T ( 5 : LENGTH OF WS-17A-T - 5)
          methodOut.getAT17().replace(methodOut.getAS17(),2,AS17.getAS17FieldLength() - 3, (methodOut.getAT17().begin + 4) ,AT17.getAT17FieldLength() - 5 /* replace,sourceIndex,sourceLen,targetIndex,targetLen */);

// *
//  DISPLAY '* 569* WS-17A-S        = (' WS-17A-S ')'
          logger.info("* 569* WS-17A-S        = ({})", methodOut.getAS17().toString()); 
//  DISPLAY '* 570*   WS-17A-S-FLD1 = (' WS-17A-S-FLD1 ')'
          logger.info("* 570*   WS-17A-S-FLD1 = ({})", new String(methodOut.getASFld117())); 
//  DISPLAY '* 571*   WS-17A-S-FLD2 = (' WS-17A-S-FLD2 ')'
          logger.info("* 571*   WS-17A-S-FLD2 = ({})", new String(methodOut.getASFld217())); 
//  DISPLAY '* 572* WS-17A-T-GRP-R  = (' WS-17A-T-GRP-R ')'
          logger.info("* 572* WS-17A-T-GRP-R  = ({})", new String(methodIn.getATGrpR17())); 
//  DISPLAY '* 573* WS-17A-T-GRP    = (' WS-17A-T-GRP ')'
          logger.info("* 573* WS-17A-T-GRP    = ({})", methodIn.getATGrp17().toString()); 
//  DISPLAY '* 574* WS-17A-T        = (' WS-17A-T ')'
          logger.info("* 574* WS-17A-T        = ({})", methodOut.getAT17().toString()); 
//  DISPLAY '* 575*   WS-17A-T-FLD1 = (' WS-17A-T-FLD1 ')'
          logger.info("* 575*   WS-17A-T-FLD1 = ({})", new String(methodOut.getATFld117())); 
//  DISPLAY '* 576*   WS-17A-T-FLD2 = (' WS-17A-T-FLD2 ')'
          logger.info("* 576*   WS-17A-T-FLD2 = ({})", new String(methodOut.getATFld217())); 

// *
//  INITIALIZE WS-17A-S WS-17A-T
          methodOut.getAS17().initialize();
          methodOut.getAT17().initialize();
//  MOVE ALL 'ABCD' TO WS-17A-S-FLD1
          methodOut.setASFld117(CONSTANTS.LITERAL_ABCDABCDABCDABCDABCDABCDABCDABCD);
//  MOVE ALL 'ZYXW' TO WS-17A-S-FLD2
          methodOut.setASFld217(CONSTANTS.LITERAL_645286444);
//  MOVE LENGTH OF WS-17A-S TO WS-S-LEN
          methodOut.setSLen((short) AS17.getAS17FieldLength());
//  MOVE LENGTH OF WS-17A-T TO WS-T-LEN
          methodOut.setTLen((short) AT17.getAT17FieldLength());
//  SUBTRACT 3 FROM WS-S-LEN
          methodOut.setSLen( (short) (methodOut.getSLen()-(short)3));
//  SUBTRACT 5 FROM WS-T-LEN
          methodOut.setTLen( (short) (methodOut.getTLen()-(short)5));
//  MOVE WS-17A-S ( 3 : WS-S-LEN ) TO WS-17A-T ( 5 : WS-T-LEN )
          methodOut.getAT17().replace(methodOut.getAS17(),2,methodOut.getSLen(), (methodOut.getAT17().begin + 4) ,methodOut.getTLen() /* replace,sourceIndex,sourceLen,targetIndex,targetLen */);

// *
//  DISPLAY '* 577* WS-17A-S        = (' WS-17A-S ')'
          logger.info("* 577* WS-17A-S        = ({})", methodOut.getAS17().toString()); 
//  DISPLAY '* 578*   WS-17A-S-FLD1 = (' WS-17A-S-FLD1 ')'
          logger.info("* 578*   WS-17A-S-FLD1 = ({})", new String(methodOut.getASFld117())); 
//  DISPLAY '* 579*   WS-17A-S-FLD2 = (' WS-17A-S-FLD2 ')'
          logger.info("* 579*   WS-17A-S-FLD2 = ({})", new String(methodOut.getASFld217())); 
//  DISPLAY '* 580* WS-17A-T-GRP-R  = (' WS-17A-T-GRP-R ')'
          logger.info("* 580* WS-17A-T-GRP-R  = ({})", new String(methodIn.getATGrpR17())); 
//  DISPLAY '* 581* WS-17A-T-GRP    = (' WS-17A-T-GRP ')'
          logger.info("* 581* WS-17A-T-GRP    = ({})", methodIn.getATGrp17().toString()); 
//  DISPLAY '* 582* WS-17A-T        = (' WS-17A-T ')'
          logger.info("* 582* WS-17A-T        = ({})", methodOut.getAT17().toString()); 
//  DISPLAY '* 583*   WS-17A-T-FLD1 = (' WS-17A-T-FLD1 ')'
          logger.info("* 583*   WS-17A-T-FLD1 = ({})", new String(methodOut.getATFld117())); 
//  DISPLAY '* 584*   WS-17A-T-FLD2 = (' WS-17A-T-FLD2 ')'
          logger.info("* 584*   WS-17A-T-FLD2 = ({})", new String(methodOut.getATFld217())); 

// *
// * Src -> group; tgt -> group ; src smaller than tgt
// *    src offset 0  ;target offset 5
// *
//  INITIALIZE WS-17B-S WS-17B-T
          methodOut.getBS17().initialize();
          methodOut.getBT17().initialize();
//  MOVE ALL 'ABCD' TO WS-17B-S-FLD1
          methodOut.setBSFld117(CONSTANTS.LITERAL_ABCDABCDABCDABCDABCDABCDABCDABCD);
//  MOVE ALL 'ZYXW' TO WS-17B-S-FLD2
          methodOut.setBSFld217(CONSTANTS.LITERAL_645286444);
//  MOVE ALL 'MNOP' TO WS-17B-T-FLD3
          methodOut.setBTFld317(CONSTANTS.LITERAL_MNOPMNOPMNOPMNOPMNOPMNOPMNOPMNOP);
//  MOVE WS-17B-S ( 3 : LENGTH OF WS-17B-S - 3 ) TO WS-17B-T ( 5 : LENGTH OF WS-17B-T - 5)
          methodOut.getBT17().replace(methodOut.getBS17(),2,BS17.getBS17FieldLength() - 3, (methodOut.getBT17().begin + 4) ,BT17.getBT17FieldLength() - 5 /* replace,sourceIndex,sourceLen,targetIndex,targetLen */);

// *
//  DISPLAY '* 585* WS-17B-S        = (' WS-17B-S ')'
          logger.info("* 585* WS-17B-S        = ({})", methodOut.getBS17().toString()); 
//  DISPLAY '* 586*   WS-17B-S-FLD1 = (' WS-17B-S-FLD1 ')'
          logger.info("* 586*   WS-17B-S-FLD1 = ({})", new String(methodOut.getBSFld117())); 
//  DISPLAY '* 587*   WS-17B-S-FLD2 = (' WS-17B-S-FLD2 ')'
          logger.info("* 587*   WS-17B-S-FLD2 = ({})", new String(methodOut.getBSFld217())); 
//  DISPLAY '* 588* WS-17B-T-GRP-R  = (' WS-17B-T-GRP-R ')'
          logger.info("* 588* WS-17B-T-GRP-R  = ({})", new String(methodIn.getBTGrpR17())); 
//  DISPLAY '* 589* WS-17B-T-GRP    = (' WS-17B-T-GRP ')'
          logger.info("* 589* WS-17B-T-GRP    = ({})", methodIn.getBTGrp17().toString()); 
//  DISPLAY '* 590* WS-17B-T        = (' WS-17B-T ')'
          logger.info("* 590* WS-17B-T        = ({})", methodOut.getBT17().toString()); 
//  DISPLAY '* 591*   WS-17B-T-FLD1 = (' WS-17B-T-FLD1 ')'
          logger.info("* 591*   WS-17B-T-FLD1 = ({})", new String(methodOut.getBTFld117())); 
//  DISPLAY '* 592*   WS-17B-T-FLD2 = (' WS-17B-T-FLD2 ')'
          logger.info("* 592*   WS-17B-T-FLD2 = ({})", new String(methodOut.getBTFld217())); 
//  DISPLAY '* 593*   WS-17B-T-FLD3 = (' WS-17B-T-FLD3 ')'
          logger.info("* 593*   WS-17B-T-FLD3 = ({})", new String(methodOut.getBTFld317())); 

// *
//  INITIALIZE WS-17B-S WS-17B-T
          methodOut.getBS17().initialize();
          methodOut.getBT17().initialize();
//  MOVE ALL 'ABCD' TO WS-17B-S-FLD1
          methodOut.setBSFld117(CONSTANTS.LITERAL_ABCDABCDABCDABCDABCDABCDABCDABCD);
//  MOVE ALL 'ZYXW' TO WS-17B-S-FLD2
          methodOut.setBSFld217(CONSTANTS.LITERAL_645286444);
//  MOVE ALL 'MNOP' TO WS-17B-T-FLD3
          methodOut.setBTFld317(CONSTANTS.LITERAL_MNOPMNOPMNOPMNOPMNOPMNOPMNOPMNOP);
//  MOVE LENGTH OF WS-17B-S TO WS-S-LEN
          methodOut.setSLen((short) BS17.getBS17FieldLength());
//  MOVE LENGTH OF WS-17B-T TO WS-T-LEN
          methodOut.setTLen((short) BT17.getBT17FieldLength());
      
      return methodOut;
      }
      /**
      * mainlineSplit20 
      *   This method is derived from 
  *   COBOL Paragraph - MAINLINE-SPLIT20 COBOL Cyclomatic complexity - 1
      * Input  :  

      * - sLen                           COBOL Name: WS-S-LEN
      * - tLen                           COBOL Name: WS-T-LEN
      * - bS17                           COBOL Name: WS-17B-S
      * - bTGrpR17                       COBOL Name: WS-17B-T-GRP-R
      * - bTGrp17                        COBOL Name: WS-17B-T-GRP
      * - aTGrpR18                       COBOL Name: WS-18A-T-GRP-R
      * - aTGrp18                        COBOL Name: WS-18A-T-GRP
      * - bTGrpR18                       COBOL Name: WS-18B-T-GRP-R
      * - bTGrp18                        COBOL Name: WS-18B-T-GRP
      *
      * Output :  

      * - sLen                           COBOL Name: WS-S-LEN
      * - tLen                           COBOL Name: WS-T-LEN
      * - bT17                           COBOL Name: WS-17B-T
      * - bS17                           COBOL Name: WS-17B-S
      * - bSFld117                       COBOL Name: WS-17B-S-FLD1
      * - bSFld217                       COBOL Name: WS-17B-S-FLD2
      * - bTFld117                       COBOL Name: WS-17B-T-FLD1
      * - bTFld217                       COBOL Name: WS-17B-T-FLD2
      * - bTFld317                       COBOL Name: WS-17B-T-FLD3
      * - aS18                           COBOL Name: WS-18A-S
      * - aT18                           COBOL Name: WS-18A-T
      * - aTFld118                       COBOL Name: WS-18A-T-FLD1
      * - aTFld218                       COBOL Name: WS-18A-T-FLD2
      * - bS18                           COBOL Name: WS-18B-S
      * - bT18                           COBOL Name: WS-18B-T
      * - bTFld318                       COBOL Name: WS-18B-T-FLD3
      * - bTFld118                       COBOL Name: WS-18B-T-FLD1
      * - bTFld218                       COBOL Name: WS-18B-T-FLD2
      *
      * @throws CFException
      */
      @Override
      public MainlineSplit20OutCtx mainlineSplit20(MainlineSplit20InCtx methodIn) throws Exception {
			// Declare local variables used in the method
			 final int A_S_18_LENGTH = 70;
			 final int B_S_18_LENGTH = 70;
			// End of variable declaration

Refmod1Ctx programCtx = methodIn.getRefmod1Ctx();
MainlineSplit20OutCtx methodOut = methodIn.getMainlineSplit20OutCtx();
//  SUBTRACT 3 FROM WS-S-LEN
          methodOut.setSLen( (short) (methodOut.getSLen()-(short)3));
//  SUBTRACT 5 FROM WS-T-LEN
          methodOut.setTLen( (short) (methodOut.getTLen()-(short)5));
//  MOVE WS-17B-S ( 3 : WS-S-LEN ) TO WS-17B-T ( 5 : WS-T-LEN )
          methodOut.getBT17().replace(methodOut.getBS17(),2,methodOut.getSLen(), (methodOut.getBT17().begin + 4) ,methodOut.getTLen() /* replace,sourceIndex,sourceLen,targetIndex,targetLen */);

// *
//  DISPLAY '* 594* WS-17B-S        = (' WS-17B-S ')'
          logger.info("* 594* WS-17B-S        = ({})", methodOut.getBS17().toString()); 
//  DISPLAY '* 595*   WS-17B-S-FLD1 = (' WS-17B-S-FLD1 ')'
          logger.info("* 595*   WS-17B-S-FLD1 = ({})", new String(methodOut.getBSFld117())); 
//  DISPLAY '* 596*   WS-17B-S-FLD2 = (' WS-17B-S-FLD2 ')'
          logger.info("* 596*   WS-17B-S-FLD2 = ({})", new String(methodOut.getBSFld217())); 
//  DISPLAY '* 597* WS-17B-T-GRP-R  = (' WS-17B-T-GRP-R ')'
          logger.info("* 597* WS-17B-T-GRP-R  = ({})", new String(methodIn.getBTGrpR17())); 
//  DISPLAY '* 598* WS-17B-T-GRP    = (' WS-17B-T-GRP ')'
          logger.info("* 598* WS-17B-T-GRP    = ({})", methodIn.getBTGrp17().toString()); 
//  DISPLAY '* 599* WS-17B-T        = (' WS-17B-T ')'
          logger.info("* 599* WS-17B-T        = ({})", methodOut.getBT17().toString()); 
//  DISPLAY '* 600*   WS-17B-T-FLD1 = (' WS-17B-T-FLD1 ')'
          logger.info("* 600*   WS-17B-T-FLD1 = ({})", new String(methodOut.getBTFld117())); 
//  DISPLAY '* 601*   WS-17B-T-FLD2 = (' WS-17B-T-FLD2 ')'
          logger.info("* 601*   WS-17B-T-FLD2 = ({})", new String(methodOut.getBTFld217())); 
//  DISPLAY '* 602*   WS-17B-T-FLD3 = (' WS-17B-T-FLD3 ')'
          logger.info("* 602*   WS-17B-T-FLD3 = ({})", new String(methodOut.getBTFld317())); 

// *
// * Src -> string; tgt -> group ; src bigger than tgt
// *    src offset 0  ;target offset 5
// *
//  INITIALIZE WS-18A-S WS-18A-T
          methodOut.setAS18(CONSTANTS.SPACE_70 /* Fill 70 Spaces*/);
          methodOut.getAT18().initialize();
          // MOVE ALL 'ABCD' TO WS-18A-S
          methodOut.setAS18(CONSTANTS.LITERAL_1222519919);
//  MOVE WS-18A-S ( 3 : LENGTH OF WS-18A-S - 3 ) TO WS-18A-T ( 5 : LENGTH OF WS-18A-T - 5)
          methodOut.getAT18().replace(methodOut.getAS18(),2/* aS18 */ ,A_S_18_LENGTH - 3, (methodOut.getAT18().begin + 4) /* aT18 */,AT18.getAT18FieldLength() - 5 /* replace,startIndex,targetLen */);

// *
//  DISPLAY '* 603* WS-18A-S        = (' WS-18A-S ')'
          logger.info("* 603* WS-18A-S        = ({})", new String(methodOut.getAS18())); 
//  DISPLAY '* 604* WS-18A-T-GRP-R  = (' WS-18A-T-GRP-R ')'
          logger.info("* 604* WS-18A-T-GRP-R  = ({})", new String(methodIn.getATGrpR18())); 
//  DISPLAY '* 605* WS-18A-T-GRP    = (' WS-18A-T-GRP ')'
          logger.info("* 605* WS-18A-T-GRP    = ({})", methodIn.getATGrp18().toString()); 
//  DISPLAY '* 606* WS-18A-T        = (' WS-18A-T ')'
          logger.info("* 606* WS-18A-T        = ({})", methodOut.getAT18().toString()); 
//  DISPLAY '* 607*   WS-18A-T-FLD1 = (' WS-18A-T-FLD1 ')'
          logger.info("* 607*   WS-18A-T-FLD1 = ({})", new String(methodOut.getATFld118())); 
//  DISPLAY '* 608*   WS-18A-T-FLD2 = (' WS-18A-T-FLD2 ')'
          logger.info("* 608*   WS-18A-T-FLD2 = ({})", new String(methodOut.getATFld218())); 

// *
//  INITIALIZE WS-18A-S WS-18A-T
          methodOut.setAS18(CONSTANTS.SPACE_70 /* Fill 70 Spaces*/);
          methodOut.getAT18().initialize();
          // MOVE ALL 'ABCD' TO WS-18A-S
          methodOut.setAS18(CONSTANTS.LITERAL_1222519919);
//  MOVE LENGTH OF WS-18A-S TO WS-S-LEN
          methodOut.setSLen((short) A_S_18_LENGTH);
//  MOVE LENGTH OF WS-18A-T TO WS-T-LEN
          methodOut.setTLen((short) AT18.getAT18FieldLength());
//  SUBTRACT 3 FROM WS-S-LEN
          methodOut.setSLen( (short) (methodOut.getSLen()-(short)3));
//  SUBTRACT 5 FROM WS-T-LEN
          methodOut.setTLen( (short) (methodOut.getTLen()-(short)5));
//  MOVE WS-18A-S ( 3 : WS-S-LEN ) TO WS-18A-T ( 5 : WS-T-LEN )
          methodOut.getAT18().replace(methodOut.getAS18(),2/* aS18 */ ,methodOut.getSLen(), (methodOut.getAT18().begin + 4) /* aT18 */,methodOut.getTLen() /* replace,startIndex,targetLen */);

// *
//  DISPLAY '* 609* WS-18A-S        = (' WS-18A-S ')'
          logger.info("* 609* WS-18A-S        = ({})", new String(methodOut.getAS18())); 
//  DISPLAY '* 610* WS-18A-T-GRP-R  = (' WS-18A-T-GRP-R ')'
          logger.info("* 610* WS-18A-T-GRP-R  = ({})", new String(methodIn.getATGrpR18())); 
//  DISPLAY '* 611* WS-18A-T-GRP    = (' WS-18A-T-GRP ')'
          logger.info("* 611* WS-18A-T-GRP    = ({})", methodIn.getATGrp18().toString()); 
//  DISPLAY '* 612* WS-18A-T        = (' WS-18A-T ')'
          logger.info("* 612* WS-18A-T        = ({})", methodOut.getAT18().toString()); 
//  DISPLAY '* 613*   WS-18A-T-FLD1 = (' WS-18A-T-FLD1 ')'
          logger.info("* 613*   WS-18A-T-FLD1 = ({})", new String(methodOut.getATFld118())); 
//  DISPLAY '* 614*   WS-18A-T-FLD2 = (' WS-18A-T-FLD2 ')'
          logger.info("* 614*   WS-18A-T-FLD2 = ({})", new String(methodOut.getATFld218())); 

// *
// * Src -> string; tgt -> group ; src smaller than tgt
// *    src offset 0  ;target offset 5
// *
//  INITIALIZE WS-18B-S WS-18B-T
          methodOut.setBS18(CONSTANTS.SPACE_70 /* Fill 70 Spaces*/);
          methodOut.getBT18().initialize();
          // MOVE ALL 'ABCD' TO WS-18B-S
          methodOut.setBS18(CONSTANTS.LITERAL_1222519919);
//  MOVE ALL 'MNOP' TO WS-18B-T-FLD3
          methodOut.setBTFld318(CONSTANTS.LITERAL_MNOPMNOPMNOPMNOPMNOPMNOPMNOPMNOP);
//  MOVE WS-18B-S ( 3 : LENGTH OF WS-18B-S - 3 ) TO WS-18B-T ( 5 : LENGTH OF WS-18B-T - 5)
          methodOut.getBT18().replace(methodOut.getBS18(),2/* bS18 */ ,B_S_18_LENGTH - 3, (methodOut.getBT18().begin + 4) /* bT18 */,BT18.getBT18FieldLength() - 5 /* replace,startIndex,targetLen */);

// *
//  DISPLAY '* 615* WS-18B-S        = (' WS-18B-S ')'
          logger.info("* 615* WS-18B-S        = ({})", new String(methodOut.getBS18())); 
//  DISPLAY '* 616* WS-18B-T-GRP-R  = (' WS-18B-T-GRP-R ')'
          logger.info("* 616* WS-18B-T-GRP-R  = ({})", new String(methodIn.getBTGrpR18())); 
//  DISPLAY '* 617* WS-18B-T-GRP    = (' WS-18B-T-GRP ')'
          logger.info("* 617* WS-18B-T-GRP    = ({})", methodIn.getBTGrp18().toString()); 
//  DISPLAY '* 618* WS-18B-T        = (' WS-18B-T ')'
          logger.info("* 618* WS-18B-T        = ({})", methodOut.getBT18().toString()); 
//  DISPLAY '* 619*   WS-18B-T-FLD1 = (' WS-18B-T-FLD1 ')'
          logger.info("* 619*   WS-18B-T-FLD1 = ({})", new String(methodOut.getBTFld118())); 
//  DISPLAY '* 620*   WS-18B-T-FLD2 = (' WS-18B-T-FLD2 ')'
          logger.info("* 620*   WS-18B-T-FLD2 = ({})", new String(methodOut.getBTFld218())); 
//  DISPLAY '* 621*   WS-18B-T-FLD3 = (' WS-18B-T-FLD3 ')'
          logger.info("* 621*   WS-18B-T-FLD3 = ({})", new String(methodOut.getBTFld318())); 

// *
//  INITIALIZE WS-18B-S WS-18B-T
          methodOut.setBS18(CONSTANTS.SPACE_70 /* Fill 70 Spaces*/);
          methodOut.getBT18().initialize();
          // MOVE ALL 'ABCD' TO WS-18B-S
          methodOut.setBS18(CONSTANTS.LITERAL_1222519919);
//  MOVE ALL 'MNOP' TO WS-18B-T-FLD3
          methodOut.setBTFld318(CONSTANTS.LITERAL_MNOPMNOPMNOPMNOPMNOPMNOPMNOPMNOP);
//  MOVE LENGTH OF WS-18B-S TO WS-S-LEN
          methodOut.setSLen((short) B_S_18_LENGTH);
//  MOVE LENGTH OF WS-18B-T TO WS-T-LEN
          methodOut.setTLen((short) BT18.getBT18FieldLength());
//  SUBTRACT 3 FROM WS-S-LEN
          methodOut.setSLen( (short) (methodOut.getSLen()-(short)3));
      
      return methodOut;
      }
      /**
      * mainlineSplit21 
      *   This method is derived from 
  *   COBOL Paragraph - MAINLINE-SPLIT21 COBOL Cyclomatic complexity - 1
      * Input  :  

      * - tLen                           COBOL Name: WS-T-LEN
      * - bS18                           COBOL Name: WS-18B-S
      * - bTGrpR18                       COBOL Name: WS-18B-T-GRP-R
      * - bTGrp18                        COBOL Name: WS-18B-T-GRP
      * - aTGrpR19                       COBOL Name: WS-19A-T-GRP-R
      * - aTGrp19                        COBOL Name: WS-19A-T-GRP
      * - bTGrpR19                       COBOL Name: WS-19B-T-GRP-R
      * - bTGrp19                        COBOL Name: WS-19B-T-GRP
      *
      * Output :  

      * - tLen                           COBOL Name: WS-T-LEN
      * - bT18                           COBOL Name: WS-18B-T
      * - bS18                           COBOL Name: WS-18B-S
      * - bTFld118                       COBOL Name: WS-18B-T-FLD1
      * - bTFld218                       COBOL Name: WS-18B-T-FLD2
      * - bTFld318                       COBOL Name: WS-18B-T-FLD3
      * - aS19                           COBOL Name: WS-19A-S
      * - aT19                           COBOL Name: WS-19A-T
      * - aSFld119                       COBOL Name: WS-19A-S-FLD1
      * - aSFld219                       COBOL Name: WS-19A-S-FLD2
      * - aTFld119                       COBOL Name: WS-19A-T-FLD1
      * - aTFld219                       COBOL Name: WS-19A-T-FLD2
      * - bS19                           COBOL Name: WS-19B-S
      * - bT19                           COBOL Name: WS-19B-T
      * - bSFld119                       COBOL Name: WS-19B-S-FLD1
      * - bSFld219                       COBOL Name: WS-19B-S-FLD2
      * - bTFld319                       COBOL Name: WS-19B-T-FLD3
      * - bTFld119                       COBOL Name: WS-19B-T-FLD1
      * - bTFld219                       COBOL Name: WS-19B-T-FLD2
      *
      * @throws CFException
      */
      @Override
      public MainlineSplit21OutCtx mainlineSplit21(MainlineSplit21InCtx methodIn) throws Exception {
Refmod1Ctx programCtx = methodIn.getRefmod1Ctx();
MainlineSplit21OutCtx methodOut = methodIn.getMainlineSplit21OutCtx();
//  SUBTRACT 5 FROM WS-T-LEN
          methodOut.setTLen( (short) (methodOut.getTLen()-(short)5));
//  MOVE WS-18B-S ( 3 : WS-S-LEN ) TO WS-18B-T ( 5 : WS-T-LEN )
          methodOut.getBT18().replace(methodOut.getBS18(),2/* bS18 */ ,methodIn.getSLen(), (methodOut.getBT18().begin + 4) /* bT18 */,methodOut.getTLen() /* replace,startIndex,targetLen */);

// *
//  DISPLAY '* 622* WS-18B-S        = (' WS-18B-S ')'
          logger.info("* 622* WS-18B-S        = ({})", new String(methodOut.getBS18())); 
//  DISPLAY '* 623* WS-18B-T-GRP-R  = (' WS-18B-T-GRP-R ')'
          logger.info("* 623* WS-18B-T-GRP-R  = ({})", new String(methodIn.getBTGrpR18())); 
//  DISPLAY '* 624* WS-18B-T-GRP    = (' WS-18B-T-GRP ')'
          logger.info("* 624* WS-18B-T-GRP    = ({})", methodIn.getBTGrp18().toString()); 
//  DISPLAY '* 625* WS-18B-T        = (' WS-18B-T ')'
          logger.info("* 625* WS-18B-T        = ({})", methodOut.getBT18().toString()); 
//  DISPLAY '* 626*   WS-18B-T-FLD1 = (' WS-18B-T-FLD1 ')'
          logger.info("* 626*   WS-18B-T-FLD1 = ({})", new String(methodOut.getBTFld118())); 
//  DISPLAY '* 627*   WS-18B-T-FLD2 = (' WS-18B-T-FLD2 ')'
          logger.info("* 627*   WS-18B-T-FLD2 = ({})", new String(methodOut.getBTFld218())); 
//  DISPLAY '* 628*   WS-18B-T-FLD3 = (' WS-18B-T-FLD3 ')'
          logger.info("* 628*   WS-18B-T-FLD3 = ({})", new String(methodOut.getBTFld318())); 

// *
// * Src -> group; tgt -> group ; src bigger than tgt
// *    src not refmod;target offset 5
// *
//  INITIALIZE WS-19A-S WS-19A-T
          methodOut.getAS19().initialize();
          methodOut.getAT19().initialize();
//  MOVE ALL 'ABCD' TO WS-19A-S-FLD1
          methodOut.setASFld119(CONSTANTS.LITERAL_ABCDABCDABCDABCDABCDABCDABCDABCD);
//  MOVE ALL 'ZYXW' TO WS-19A-S-FLD2
          methodOut.setASFld219(CONSTANTS.LITERAL_645286444);
//  MOVE WS-19A-S TO WS-19A-T ( 5 : LENGTH OF WS-19A-T - 5)
          methodOut.getAT19().replace(methodOut.getAS19().getCharArray(),0,methodOut.getAS19().length(), (methodOut.getAT19().begin + 4) ,AT19.getAT19FieldLength() - 5 /* replace,sourceIndex,sourceLen,targetIndex,targetLen */);

// *
//  DISPLAY '* 629* WS-19A-S        = (' WS-19A-S ')'
          logger.info("* 629* WS-19A-S        = ({})", methodOut.getAS19().toString()); 
//  DISPLAY '* 630*   WS-19A-S-FLD1 = (' WS-19A-S-FLD1 ')'
          logger.info("* 630*   WS-19A-S-FLD1 = ({})", new String(methodOut.getASFld119())); 
//  DISPLAY '* 631*   WS-19A-S-FLD2 = (' WS-19A-S-FLD2 ')'
          logger.info("* 631*   WS-19A-S-FLD2 = ({})", new String(methodOut.getASFld219())); 
//  DISPLAY '* 632* WS-19A-T-GRP-R  = (' WS-19A-T-GRP-R ')'
          logger.info("* 632* WS-19A-T-GRP-R  = ({})", new String(methodIn.getATGrpR19())); 
//  DISPLAY '* 633* WS-19A-T-GRP    = (' WS-19A-T-GRP ')'
          logger.info("* 633* WS-19A-T-GRP    = ({})", methodIn.getATGrp19().toString()); 
//  DISPLAY '* 634* WS-19A-T        = (' WS-19A-T ')'
          logger.info("* 634* WS-19A-T        = ({})", methodOut.getAT19().toString()); 
//  DISPLAY '* 635*   WS-19A-T-FLD1 = (' WS-19A-T-FLD1 ')'
          logger.info("* 635*   WS-19A-T-FLD1 = ({})", new String(methodOut.getATFld119())); 
//  DISPLAY '* 636*   WS-19A-T-FLD2 = (' WS-19A-T-FLD2 ')'
          logger.info("* 636*   WS-19A-T-FLD2 = ({})", new String(methodOut.getATFld219())); 

// *
//  INITIALIZE WS-19A-S WS-19A-T
          methodOut.getAS19().initialize();
          methodOut.getAT19().initialize();
//  MOVE ALL 'ABCD' TO WS-19A-S-FLD1
          methodOut.setASFld119(CONSTANTS.LITERAL_ABCDABCDABCDABCDABCDABCDABCDABCD);
//  MOVE ALL 'ZYXW' TO WS-19A-S-FLD2
          methodOut.setASFld219(CONSTANTS.LITERAL_645286444);
//  MOVE LENGTH OF WS-19A-T TO WS-T-LEN
          methodOut.setTLen((short) AT19.getAT19FieldLength());
//  SUBTRACT 5 FROM WS-T-LEN
          methodOut.setTLen( (short) (methodOut.getTLen()-(short)5));
//  MOVE WS-19A-S TO WS-19A-T ( 5 : WS-T-LEN )
          methodOut.getAT19().replace(methodOut.getAS19().getCharArray(),0,methodOut.getAS19().length(), (methodOut.getAT19().begin + 4) ,methodOut.getTLen() /* replace,sourceIndex,sourceLen,targetIndex,targetLen */);

// *
//  DISPLAY '* 637* WS-19A-S        = (' WS-19A-S ')'
          logger.info("* 637* WS-19A-S        = ({})", methodOut.getAS19().toString()); 
//  DISPLAY '* 638*   WS-19A-S-FLD1 = (' WS-19A-S-FLD1 ')'
          logger.info("* 638*   WS-19A-S-FLD1 = ({})", new String(methodOut.getASFld119())); 
//  DISPLAY '* 639*   WS-19A-S-FLD2 = (' WS-19A-S-FLD2 ')'
          logger.info("* 639*   WS-19A-S-FLD2 = ({})", new String(methodOut.getASFld219())); 
//  DISPLAY '* 640* WS-19A-T-GRP-R  = (' WS-19A-T-GRP-R ')'
          logger.info("* 640* WS-19A-T-GRP-R  = ({})", new String(methodIn.getATGrpR19())); 
//  DISPLAY '* 641* WS-19A-T-GRP    = (' WS-19A-T-GRP ')'
          logger.info("* 641* WS-19A-T-GRP    = ({})", methodIn.getATGrp19().toString()); 
//  DISPLAY '* 642* WS-19A-T        = (' WS-19A-T ')'
          logger.info("* 642* WS-19A-T        = ({})", methodOut.getAT19().toString()); 
//  DISPLAY '* 643*   WS-19A-T-FLD1 = (' WS-19A-T-FLD1 ')'
          logger.info("* 643*   WS-19A-T-FLD1 = ({})", new String(methodOut.getATFld119())); 
//  DISPLAY '* 644*   WS-19A-T-FLD2 = (' WS-19A-T-FLD2 ')'
          logger.info("* 644*   WS-19A-T-FLD2 = ({})", new String(methodOut.getATFld219())); 

// *
// * Src -> group; tgt -> group ; src smaller than tgt
// *    src not refmod;target offset 5
// *
//  INITIALIZE WS-19B-S WS-19B-T
          methodOut.getBS19().initialize();
          methodOut.getBT19().initialize();
//  MOVE ALL 'ABCD' TO WS-19B-S-FLD1
          methodOut.setBSFld119(CONSTANTS.LITERAL_ABCDABCDABCDABCDABCDABCDABCDABCD);
//  MOVE ALL 'ZYXW' TO WS-19B-S-FLD2
          methodOut.setBSFld219(CONSTANTS.LITERAL_645286444);
//  MOVE ALL 'MNOP' TO WS-19B-T-FLD3
          methodOut.setBTFld319(CONSTANTS.LITERAL_MNOPMNOPMNOPMNOPMNOPMNOPMNOPMNOP);
//  MOVE WS-19B-S TO WS-19B-T ( 5 : LENGTH OF WS-19B-T - 5)
          methodOut.getBT19().replace(methodOut.getBS19().getCharArray(),0,methodOut.getBS19().length(), (methodOut.getBT19().begin + 4) ,BT19.getBT19FieldLength() - 5 /* replace,sourceIndex,sourceLen,targetIndex,targetLen */);

// *
//  DISPLAY '* 645* WS-19B-S        = (' WS-19B-S ')'
          logger.info("* 645* WS-19B-S        = ({})", methodOut.getBS19().toString()); 
//  DISPLAY '* 646*   WS-19B-S-FLD1 = (' WS-19B-S-FLD1 ')'
          logger.info("* 646*   WS-19B-S-FLD1 = ({})", new String(methodOut.getBSFld119())); 
//  DISPLAY '* 647*   WS-19B-S-FLD2 = (' WS-19B-S-FLD2 ')'
          logger.info("* 647*   WS-19B-S-FLD2 = ({})", new String(methodOut.getBSFld219())); 
//  DISPLAY '* 648* WS-19B-T-GRP-R  = (' WS-19B-T-GRP-R ')'
          logger.info("* 648* WS-19B-T-GRP-R  = ({})", new String(methodIn.getBTGrpR19())); 
//  DISPLAY '* 649* WS-19B-T-GRP    = (' WS-19B-T-GRP ')'
          logger.info("* 649* WS-19B-T-GRP    = ({})", methodIn.getBTGrp19().toString()); 
//  DISPLAY '* 650* WS-19B-T        = (' WS-19B-T ')'
          logger.info("* 650* WS-19B-T        = ({})", methodOut.getBT19().toString()); 
//  DISPLAY '* 651*   WS-19B-T-FLD1 = (' WS-19B-T-FLD1 ')'
          logger.info("* 651*   WS-19B-T-FLD1 = ({})", new String(methodOut.getBTFld119())); 
//  DISPLAY '* 652*   WS-19B-T-FLD2 = (' WS-19B-T-FLD2 ')'
          logger.info("* 652*   WS-19B-T-FLD2 = ({})", new String(methodOut.getBTFld219())); 
//  DISPLAY '* 653*   WS-19B-T-FLD3 = (' WS-19B-T-FLD3 ')'
          logger.info("* 653*   WS-19B-T-FLD3 = ({})", new String(methodOut.getBTFld319())); 

// *
//  INITIALIZE WS-19B-S WS-19B-T
          methodOut.getBS19().initialize();
          methodOut.getBT19().initialize();
//  MOVE ALL 'ABCD' TO WS-19B-S-FLD1
          methodOut.setBSFld119(CONSTANTS.LITERAL_ABCDABCDABCDABCDABCDABCDABCDABCD);
      
      return methodOut;
      }
      /**
      * mainlineSplit22 
      *   This method is derived from 
  *   COBOL Paragraph - MAINLINE-SPLIT22 COBOL Cyclomatic complexity - 1
      * Input  :  

      * - bS19                           COBOL Name: WS-19B-S
      * - bTGrpR19                       COBOL Name: WS-19B-T-GRP-R
      * - bTGrp19                        COBOL Name: WS-19B-T-GRP
      * - aTGrpR20                       COBOL Name: WS-20A-T-GRP-R
      * - aTGrp20                        COBOL Name: WS-20A-T-GRP
      * - bTGrpR20                       COBOL Name: WS-20B-T-GRP-R
      * - bTGrp20                        COBOL Name: WS-20B-T-GRP
      *
      * Output :  

      * - bSFld219                       COBOL Name: WS-19B-S-FLD2
      * - bTFld319                       COBOL Name: WS-19B-T-FLD3
      * - tLen                           COBOL Name: WS-T-LEN
      * - bT19                           COBOL Name: WS-19B-T
      * - bS19                           COBOL Name: WS-19B-S
      * - bSFld119                       COBOL Name: WS-19B-S-FLD1
      * - bTFld119                       COBOL Name: WS-19B-T-FLD1
      * - bTFld219                       COBOL Name: WS-19B-T-FLD2
      * - aS20                           COBOL Name: WS-20A-S
      * - aT20                           COBOL Name: WS-20A-T
      * - aTFld120                       COBOL Name: WS-20A-T-FLD1
      * - aTFld220                       COBOL Name: WS-20A-T-FLD2
      * - bS20                           COBOL Name: WS-20B-S
      * - bT20                           COBOL Name: WS-20B-T
      * - bTFld320                       COBOL Name: WS-20B-T-FLD3
      * - bTFld120                       COBOL Name: WS-20B-T-FLD1
      * - bTFld220                       COBOL Name: WS-20B-T-FLD2
      *
      * @throws CFException
      */
      @Override
      public MainlineSplit22OutCtx mainlineSplit22(MainlineSplit22InCtx methodIn) throws Exception {
Refmod1Ctx programCtx = methodIn.getRefmod1Ctx();
MainlineSplit22OutCtx methodOut = methodIn.getMainlineSplit22OutCtx();
//  MOVE ALL 'ZYXW' TO WS-19B-S-FLD2
          methodOut.setBSFld219(CONSTANTS.LITERAL_645286444);
//  MOVE ALL 'MNOP' TO WS-19B-T-FLD3
          methodOut.setBTFld319(CONSTANTS.LITERAL_MNOPMNOPMNOPMNOPMNOPMNOPMNOPMNOP);
//  MOVE LENGTH OF WS-19B-T TO WS-T-LEN
          methodOut.setTLen((short) BT19.getBT19FieldLength());
//  SUBTRACT 5 FROM WS-T-LEN
          methodOut.setTLen( (short) (methodOut.getTLen()-(short)5));
//  MOVE WS-19B-S TO WS-19B-T ( 5 : WS-T-LEN )
          methodOut.getBT19().replace(methodOut.getBS19().getCharArray(),0,methodOut.getBS19().length(), (methodOut.getBT19().begin + 4) ,methodOut.getTLen() /* replace,sourceIndex,sourceLen,targetIndex,targetLen */);

// *
//  DISPLAY '* 654* WS-19B-S        = (' WS-19B-S ')'
          logger.info("* 654* WS-19B-S        = ({})", methodOut.getBS19().toString()); 
//  DISPLAY '* 655*   WS-19B-S-FLD1 = (' WS-19B-S-FLD1 ')'
          logger.info("* 655*   WS-19B-S-FLD1 = ({})", new String(methodOut.getBSFld119())); 
//  DISPLAY '* 656*   WS-19B-S-FLD2 = (' WS-19B-S-FLD2 ')'
          logger.info("* 656*   WS-19B-S-FLD2 = ({})", new String(methodOut.getBSFld219())); 
//  DISPLAY '* 657* WS-19B-T-GRP-R  = (' WS-19B-T-GRP-R ')'
          logger.info("* 657* WS-19B-T-GRP-R  = ({})", new String(methodIn.getBTGrpR19())); 
//  DISPLAY '* 658* WS-19B-T-GRP    = (' WS-19B-T-GRP ')'
          logger.info("* 658* WS-19B-T-GRP    = ({})", methodIn.getBTGrp19().toString()); 
//  DISPLAY '* 659* WS-19B-T        = (' WS-19B-T ')'
          logger.info("* 659* WS-19B-T        = ({})", methodOut.getBT19().toString()); 
//  DISPLAY '* 660*   WS-19B-T-FLD1 = (' WS-19B-T-FLD1 ')'
          logger.info("* 660*   WS-19B-T-FLD1 = ({})", new String(methodOut.getBTFld119())); 
//  DISPLAY '* 661*   WS-19B-T-FLD2 = (' WS-19B-T-FLD2 ')'
          logger.info("* 661*   WS-19B-T-FLD2 = ({})", new String(methodOut.getBTFld219())); 
//  DISPLAY '* 662*   WS-19B-T-FLD3 = (' WS-19B-T-FLD3 ')'
          logger.info("* 662*   WS-19B-T-FLD3 = ({})", new String(methodOut.getBTFld319())); 

// *
// * Src -> string; tgt -> group ; src bigger than tgt
// *    src not refmod;target offset 5
// *
//  INITIALIZE WS-20A-S WS-20A-T
          methodOut.setAS20(CONSTANTS.SPACE_70 /* Fill 70 Spaces*/);
          methodOut.getAT20().initialize();
          // MOVE ALL 'ABCD' TO WS-20A-S
          methodOut.setAS20(CONSTANTS.LITERAL_1222519919);
//  MOVE WS-20A-S TO WS-20A-T ( 5 : LENGTH OF WS-20A-T - 5)
          methodOut.getAT20().replace(methodOut.getAS20(),0,methodOut.getAS20().length, (methodOut.getAT20().begin + 4) /* aT20 */,AT20.getAT20FieldLength() - 5 /* replace,sourceIndex,sourceLen,targetIndex,targetLen */);

// *
//  DISPLAY '* 663* WS-20A-S        = (' WS-20A-S ')'
          logger.info("* 663* WS-20A-S        = ({})", new String(methodOut.getAS20())); 
//  DISPLAY '* 664* WS-20A-T-GRP-R  = (' WS-20A-T-GRP-R ')'
          logger.info("* 664* WS-20A-T-GRP-R  = ({})", new String(methodIn.getATGrpR20())); 
//  DISPLAY '* 665* WS-20A-T-GRP    = (' WS-20A-T-GRP ')'
          logger.info("* 665* WS-20A-T-GRP    = ({})", methodIn.getATGrp20().toString()); 
//  DISPLAY '* 666* WS-20A-T        = (' WS-20A-T ')'
          logger.info("* 666* WS-20A-T        = ({})", methodOut.getAT20().toString()); 
//  DISPLAY '* 667*   WS-20A-T-FLD1 = (' WS-20A-T-FLD1 ')'
          logger.info("* 667*   WS-20A-T-FLD1 = ({})", new String(methodOut.getATFld120())); 
//  DISPLAY '* 668*   WS-20A-T-FLD2 = (' WS-20A-T-FLD2 ')'
          logger.info("* 668*   WS-20A-T-FLD2 = ({})", new String(methodOut.getATFld220())); 

// *
//  INITIALIZE WS-20A-S WS-20A-T
          methodOut.setAS20(CONSTANTS.SPACE_70 /* Fill 70 Spaces*/);
          methodOut.getAT20().initialize();
          // MOVE ALL 'ABCD' TO WS-20A-S
          methodOut.setAS20(CONSTANTS.LITERAL_1222519919);
//  MOVE LENGTH OF WS-20A-T TO WS-T-LEN
          methodOut.setTLen((short) AT20.getAT20FieldLength());
//  SUBTRACT 5 FROM WS-T-LEN
          methodOut.setTLen( (short) (methodOut.getTLen()-(short)5));
//  MOVE WS-20A-S TO WS-20A-T ( 5 : WS-T-LEN )
          methodOut.getAT20().replace(methodOut.getAS20(),0,methodOut.getAS20().length, (methodOut.getAT20().begin + 4) /* aT20 */,methodOut.getTLen() /* replace,sourceIndex,sourceLen,targetIndex,targetLen */);

// *
//  DISPLAY '* 669* WS-20A-S        = (' WS-20A-S ')'
          logger.info("* 669* WS-20A-S        = ({})", new String(methodOut.getAS20())); 
//  DISPLAY '* 670* WS-20A-T-GRP-R  = (' WS-20A-T-GRP-R ')'
          logger.info("* 670* WS-20A-T-GRP-R  = ({})", new String(methodIn.getATGrpR20())); 
//  DISPLAY '* 671* WS-20A-T-GRP    = (' WS-20A-T-GRP ')'
          logger.info("* 671* WS-20A-T-GRP    = ({})", methodIn.getATGrp20().toString()); 
//  DISPLAY '* 672* WS-20A-T        = (' WS-20A-T ')'
          logger.info("* 672* WS-20A-T        = ({})", methodOut.getAT20().toString()); 
//  DISPLAY '* 673*   WS-20A-T-FLD1 = (' WS-20A-T-FLD1 ')'
          logger.info("* 673*   WS-20A-T-FLD1 = ({})", new String(methodOut.getATFld120())); 
//  DISPLAY '* 674*   WS-20A-T-FLD2 = (' WS-20A-T-FLD2 ')'
          logger.info("* 674*   WS-20A-T-FLD2 = ({})", new String(methodOut.getATFld220())); 

// *
// * Src -> string; tgt -> group ; src smaller than tgt
// *    src not refmod;target offset 5
// *
//  INITIALIZE WS-20B-S WS-20B-T
          methodOut.setBS20(CONSTANTS.SPACE_70 /* Fill 70 Spaces*/);
          methodOut.getBT20().initialize();
          // MOVE ALL 'ABCD' TO WS-20B-S
          methodOut.setBS20(CONSTANTS.LITERAL_1222519919);
//  MOVE ALL 'MNOP' TO WS-20B-T-FLD3
          methodOut.setBTFld320(CONSTANTS.LITERAL_MNOPMNOPMNOPMNOPMNOPMNOPMNOPMNOP);
//  MOVE WS-20B-S TO WS-20B-T ( 5 : LENGTH OF WS-20B-T - 5)
          methodOut.getBT20().replace(methodOut.getBS20(),0,methodOut.getBS20().length, (methodOut.getBT20().begin + 4) /* bT20 */,BT20.getBT20FieldLength() - 5 /* replace,sourceIndex,sourceLen,targetIndex,targetLen */);

// *
//  DISPLAY '* 675* WS-20B-S        = (' WS-20B-S ')'
          logger.info("* 675* WS-20B-S        = ({})", new String(methodOut.getBS20())); 
//  DISPLAY '* 676* WS-20B-T-GRP-R  = (' WS-20B-T-GRP-R ')'
          logger.info("* 676* WS-20B-T-GRP-R  = ({})", new String(methodIn.getBTGrpR20())); 
//  DISPLAY '* 677* WS-20B-T-GRP    = (' WS-20B-T-GRP ')'
          logger.info("* 677* WS-20B-T-GRP    = ({})", methodIn.getBTGrp20().toString()); 
//  DISPLAY '* 678* WS-20B-T        = (' WS-20B-T ')'
          logger.info("* 678* WS-20B-T        = ({})", methodOut.getBT20().toString()); 
//  DISPLAY '* 679*   WS-20B-T-FLD1 = (' WS-20B-T-FLD1 ')'
          logger.info("* 679*   WS-20B-T-FLD1 = ({})", new String(methodOut.getBTFld120())); 
//  DISPLAY '* 680*   WS-20B-T-FLD2 = (' WS-20B-T-FLD2 ')'
          logger.info("* 680*   WS-20B-T-FLD2 = ({})", new String(methodOut.getBTFld220())); 
//  DISPLAY '* 681*   WS-20B-T-FLD3 = (' WS-20B-T-FLD3 ')'
          logger.info("* 681*   WS-20B-T-FLD3 = ({})", new String(methodOut.getBTFld320())); 

// *
//  INITIALIZE WS-20B-S WS-20B-T
          methodOut.setBS20(CONSTANTS.SPACE_70 /* Fill 70 Spaces*/);
          methodOut.getBT20().initialize();
          // MOVE ALL 'ABCD' TO WS-20B-S
          methodOut.setBS20(CONSTANTS.LITERAL_1222519919);
//  MOVE ALL 'MNOP' TO WS-20B-T-FLD3
          methodOut.setBTFld320(CONSTANTS.LITERAL_MNOPMNOPMNOPMNOPMNOPMNOPMNOPMNOP);
//  MOVE LENGTH OF WS-20B-T TO WS-T-LEN
          methodOut.setTLen((short) BT20.getBT20FieldLength());
//  SUBTRACT 5 FROM WS-T-LEN
          methodOut.setTLen( (short) (methodOut.getTLen()-(short)5));
//  MOVE WS-20B-S TO WS-20B-T ( 5 : WS-T-LEN )
          methodOut.getBT20().replace(methodOut.getBS20(),0,methodOut.getBS20().length, (methodOut.getBT20().begin + 4) /* bT20 */,methodOut.getTLen() /* replace,sourceIndex,sourceLen,targetIndex,targetLen */);
      
      return methodOut;
      }
      /**
      * mainlineSplit23 
      *   This method is derived from 
  *   COBOL Paragraph - MAINLINE-SPLIT23 COBOL Cyclomatic complexity - 1
      * Input  :  

      * - bS20                           COBOL Name: WS-20B-S
      * - bTGrpR20                       COBOL Name: WS-20B-T-GRP-R
      * - bTGrp20                        COBOL Name: WS-20B-T-GRP
      * - bT20                           COBOL Name: WS-20B-T
      * - bTFld120                       COBOL Name: WS-20B-T-FLD1
      * - bTFld220                       COBOL Name: WS-20B-T-FLD2
      * - bTFld320                       COBOL Name: WS-20B-T-FLD3
      * - wse1aTR                        COBOL Name: WSE-1A-T-R
      * - wse1bTR                        COBOL Name: WSE-1B-T-R
      * - wse2aTR                        COBOL Name: WSE-2A-T-R
      * - wse2bTR                        COBOL Name: WSE-2B-T-R
      *
      * Output :  

      * - wse1aS                         COBOL Name: WSE-1A-S
      * - wse1aT                         COBOL Name: WSE-1A-T
      * - wse1aSFld1                     COBOL Name: WSE-1A-S-FLD1
      * - wse1aSFld2                     COBOL Name: WSE-1A-S-FLD2
      * - wse1aTFld1                     COBOL Name: WSE-1A-T-FLD1
      * - wse1aTFld2                     COBOL Name: WSE-1A-T-FLD2
      * - wse1bS                         COBOL Name: WSE-1B-S
      * - wse1bT                         COBOL Name: WSE-1B-T
      * - wse1bSFld1                     COBOL Name: WSE-1B-S-FLD1
      * - wse1bSFld2                     COBOL Name: WSE-1B-S-FLD2
      * - wse1bTFld3                     COBOL Name: WSE-1B-T-FLD3
      * - wse1bTFld1                     COBOL Name: WSE-1B-T-FLD1
      * - wse1bTFld2                     COBOL Name: WSE-1B-T-FLD2
      * - wse2aS                         COBOL Name: WSE-2A-S
      * - wse2aT                         COBOL Name: WSE-2A-T
      * - wse2aTFld1                     COBOL Name: WSE-2A-T-FLD1
      * - wse2aTFld2                     COBOL Name: WSE-2A-T-FLD2
      * - wse2bS                         COBOL Name: WSE-2B-S
      * - wse2bT                         COBOL Name: WSE-2B-T
      * - wse2bTFld3                     COBOL Name: WSE-2B-T-FLD3
      * - wse2bTFld1                     COBOL Name: WSE-2B-T-FLD1
      * - wse2bTFld2                     COBOL Name: WSE-2B-T-FLD2
      * - wse3aS                         COBOL Name: WSE-3A-S
      * - wse3aT                         COBOL Name: WSE-3A-T
      * - wse3aSFld1                     COBOL Name: WSE-3A-S-FLD1
      *
      * @throws CFException
      */
      @Override
      public MainlineSplit23OutCtx mainlineSplit23(MainlineSplit23InCtx methodIn) throws Exception {
			// Declare local variables used in the method
			 final int WSE_2A_S_LENGTH = 60;
			 final int WSE_2B_S_LENGTH = 60;
			// End of variable declaration

Refmod1Ctx programCtx = methodIn.getRefmod1Ctx();
MainlineSplit23OutCtx methodOut = methodIn.getMainlineSplit23OutCtx();

// *
//  DISPLAY '* 682* WS-20B-S        = (' WS-20B-S ')'
          logger.info("* 682* WS-20B-S        = ({})", new String(methodIn.getBS20())); 
//  DISPLAY '* 683* WS-20B-T-GRP-R  = (' WS-20B-T-GRP-R ')'
          logger.info("* 683* WS-20B-T-GRP-R  = ({})", new String(methodIn.getBTGrpR20())); 
//  DISPLAY '* 684* WS-20B-T-GRP    = (' WS-20B-T-GRP ')'
          logger.info("* 684* WS-20B-T-GRP    = ({})", methodIn.getBTGrp20().toString()); 
//  DISPLAY '* 685* WS-20B-T        = (' WS-20B-T ')'
          logger.info("* 685* WS-20B-T        = ({})", methodIn.getBT20().toString()); 
//  DISPLAY '* 686*   WS-20B-T-FLD1 = (' WS-20B-T-FLD1 ')'
          logger.info("* 686*   WS-20B-T-FLD1 = ({})", new String(methodIn.getBTFld120())); 
//  DISPLAY '* 687*   WS-20B-T-FLD2 = (' WS-20B-T-FLD2 ')'
          logger.info("* 687*   WS-20B-T-FLD2 = ({})", new String(methodIn.getBTFld220())); 
//  DISPLAY '* 688*   WS-20B-T-FLD3 = (' WS-20B-T-FLD3 ')'
          logger.info("* 688*   WS-20B-T-FLD3 = ({})", new String(methodIn.getBTFld320())); 

// *
// * Below usecases are repeat of above one with equal src and tgt
// *
// * src -> group; tgt -> group ; src same size as tgt
// *
//  INITIALIZE WSE-1A-S WSE-1A-T
          methodOut.getWse1aS().initialize();
          methodOut.getWse1aT().initialize();
//  MOVE ALL 'ABCD' TO WSE-1A-S-FLD1
          methodOut.setWse1aSFld1(CONSTANTS.LITERAL_ABCDABCDABCDABCDABCDABCDABCDABCD);
//  MOVE ALL 'ZYXW' TO WSE-1A-S-FLD2
          methodOut.setWse1aSFld2(CONSTANTS.LITERAL_ZYXWZYXWZYXWZYXWZYXWZYXWZYXWZYXW);
//  MOVE WSE-1A-S ( 1 : LENGTH OF WSE-1A-S ) TO WSE-1A-T ( 1 : LENGTH OF WSE-1A-T )
          methodOut.setWse1aT(replace(methodOut.getWse1aT().toCharArray(),substring(methodOut.getWse1aS().getCharArray(),0,Wse1aS.getWse1aSFieldLength()),0,Wse1aT.getWse1aTFieldLength()));

// *
//  DISPLAY '* 689* WSE-1A-S        = (' WSE-1A-S ')'
          logger.info("* 689* WSE-1A-S        = ({})", methodOut.getWse1aS().toString()); 
//  DISPLAY '* 690*   WSE-1A-S-FLD1 = (' WSE-1A-S-FLD1 ')'
          logger.info("* 690*   WSE-1A-S-FLD1 = ({})", new String(methodOut.getWse1aSFld1())); 
//  DISPLAY '* 691*   WSE-1A-S-FLD2 = (' WSE-1A-S-FLD2 ')'
          logger.info("* 691*   WSE-1A-S-FLD2 = ({})", new String(methodOut.getWse1aSFld2())); 
//  DISPLAY '* 692* WSE-1A-T-R      = (' WSE-1A-T-R ')'
          logger.info("* 692* WSE-1A-T-R      = ({})", new String(methodIn.getWse1aTR())); 
//  DISPLAY '* 693* WSE-1A-T        = (' WSE-1A-T ')'
          logger.info("* 693* WSE-1A-T        = ({})", methodOut.getWse1aT().toString()); 
//  DISPLAY '* 694*   WSE-1A-T-FLD1 = (' WSE-1A-T-FLD1 ')'
          logger.info("* 694*   WSE-1A-T-FLD1 = ({})", new String(methodOut.getWse1aTFld1())); 
//  DISPLAY '* 695*   WSE-1A-T-FLD2 = (' WSE-1A-T-FLD2 ')'
          logger.info("* 695*   WSE-1A-T-FLD2 = ({})", new String(methodOut.getWse1aTFld2())); 

// *
// * Src -> group; tgt -> group ; src same size as tgt
// *
//  INITIALIZE WSE-1B-S WSE-1B-T
          methodOut.getWse1bS().initialize();
          methodOut.getWse1bT().initialize();
//  MOVE ALL 'ABCD' TO WSE-1B-S-FLD1
          methodOut.setWse1bSFld1(CONSTANTS.LITERAL_ABCDABCDABCDABCDABCDABCDABCDABCD);
//  MOVE ALL 'ZYXW' TO WSE-1B-S-FLD2
          methodOut.setWse1bSFld2(CONSTANTS.LITERAL_ZYXWZYXWZYXWZYXWZYXWZYXWZYXWZYXW);
//  MOVE ALL 'MNOP' TO WSE-1B-T-FLD3
          methodOut.setWse1bTFld3(CONSTANTS.LITERAL_MNOPMNOPMNOPMNOPMNOPMNOPMNOPMNOP);
//  MOVE WSE-1B-S ( 1 : LENGTH OF WSE-1B-S ) TO WSE-1B-T ( 1 : LENGTH OF WSE-1B-T )
          methodOut.setWse1bT(replace(methodOut.getWse1bT().toCharArray(),substring(methodOut.getWse1bS().getCharArray(),0,Wse1bS.getWse1bSFieldLength()),0,Wse1bT.getWse1bTFieldLength()));

// *
//  DISPLAY '* 696* WSE-1B-S        = (' WSE-1B-S ')'
          logger.info("* 696* WSE-1B-S        = ({})", methodOut.getWse1bS().toString()); 
//  DISPLAY '* 697*   WSE-1B-S-FLD1 = (' WSE-1B-S-FLD1 ')'
          logger.info("* 697*   WSE-1B-S-FLD1 = ({})", new String(methodOut.getWse1bSFld1())); 
//  DISPLAY '* 698*   WSE-1B-S-FLD2 = (' WSE-1B-S-FLD2 ')'
          logger.info("* 698*   WSE-1B-S-FLD2 = ({})", new String(methodOut.getWse1bSFld2())); 
//  DISPLAY '* 699* WSE-1B-T-R      = (' WSE-1B-T-R ')'
          logger.info("* 699* WSE-1B-T-R      = ({})", new String(methodIn.getWse1bTR())); 
//  DISPLAY '* 700* WSE-1B-T        = (' WSE-1B-T ')'
          logger.info("* 700* WSE-1B-T        = ({})", methodOut.getWse1bT().toString()); 
//  DISPLAY '* 701*   WSE-1B-T-FLD1 = (' WSE-1B-T-FLD1 ')'
          logger.info("* 701*   WSE-1B-T-FLD1 = ({})", new String(methodOut.getWse1bTFld1())); 
//  DISPLAY '* 702*   WSE-1B-T-FLD2 = (' WSE-1B-T-FLD2 ')'
          logger.info("* 702*   WSE-1B-T-FLD2 = ({})", new String(methodOut.getWse1bTFld2())); 
//  DISPLAY '* 703*   WSE-1B-T-FLD3 = (' WSE-1B-T-FLD3 ')'
          logger.info("* 703*   WSE-1B-T-FLD3 = ({})", new String(methodOut.getWse1bTFld3())); 

// *
// * Src -> string; tgt -> group ; src same size as tgt
// *
//  INITIALIZE WSE-2A-S WSE-2A-T
          methodOut.setWse2aS(CONSTANTS.SPACE_60 /* Fill 60 Spaces*/);
          methodOut.getWse2aT().initialize();
          // MOVE ALL 'ABCD' TO WSE-2A-S
          methodOut.setWse2aS(CONSTANTS.LITERAL_1122147122);
//  MOVE WSE-2A-S ( 1 : LENGTH OF WSE-2A-S ) TO WSE-2A-T ( 1 : LENGTH OF WSE-2A-T )
          methodOut.setWse2aT(methodOut.getWse2aS(),0/* wse2aS */ ,WSE_2A_S_LENGTH,0,Wse2aT.getWse2aTFieldLength() /* field,sourceIndex,sourceLen,targetIndex,targetLen */);

// *
//  DISPLAY '* 704* WSE-2A-S        = (' WSE-2A-S ')'
          logger.info("* 704* WSE-2A-S        = ({})", new String(methodOut.getWse2aS())); 
//  DISPLAY '* 705* WSE-2A-T-R      = (' WSE-2A-T-R ')'
          logger.info("* 705* WSE-2A-T-R      = ({})", new String(methodIn.getWse2aTR())); 
//  DISPLAY '* 706* WSE-2A-T        = (' WSE-2A-T ')'
          logger.info("* 706* WSE-2A-T        = ({})", methodOut.getWse2aT().toString()); 
//  DISPLAY '* 707*   WSE-2A-T-FLD1 = (' WSE-2A-T-FLD1 ')'
          logger.info("* 707*   WSE-2A-T-FLD1 = ({})", new String(methodOut.getWse2aTFld1())); 
//  DISPLAY '* 708*   WSE-2A-T-FLD2 = (' WSE-2A-T-FLD2 ')'
          logger.info("* 708*   WSE-2A-T-FLD2 = ({})", new String(methodOut.getWse2aTFld2())); 

// *
// * Src -> string; tgt -> group ; src same size as tgt
// *
//  INITIALIZE WSE-2B-S WSE-2B-T
          methodOut.setWse2bS(CONSTANTS.SPACE_60 /* Fill 60 Spaces*/);
          methodOut.getWse2bT().initialize();
          // MOVE ALL 'ABCD' TO WSE-2B-S
          methodOut.setWse2bS(CONSTANTS.LITERAL_1122147122);
//  MOVE ALL 'MNOP' TO WSE-2B-T-FLD3
          methodOut.setWse2bTFld3(CONSTANTS.LITERAL_MNOPMNOPMNOPMNOPMNOPMNOPMNOPMNOP);
//  MOVE WSE-2B-S ( 1 : LENGTH OF WSE-2B-S ) TO WSE-2B-T ( 1 : LENGTH OF WSE-2B-T )
          methodOut.setWse2bT(methodOut.getWse2bS(),0/* wse2bS */ ,WSE_2B_S_LENGTH,0,Wse2bT.getWse2bTFieldLength() /* field,sourceIndex,sourceLen,targetIndex,targetLen */);

// *
//  DISPLAY '* 709* WSE-2B-S        = (' WSE-2B-S ')'
          logger.info("* 709* WSE-2B-S        = ({})", new String(methodOut.getWse2bS())); 
//  DISPLAY '* 710* WSE-2B-T-R      = (' WSE-2B-T-R ')'
          logger.info("* 710* WSE-2B-T-R      = ({})", new String(methodIn.getWse2bTR())); 
//  DISPLAY '* 711* WSE-2B-T        = (' WSE-2B-T ')'
          logger.info("* 711* WSE-2B-T        = ({})", methodOut.getWse2bT().toString()); 
//  DISPLAY '* 712*   WSE-2B-T-FLD1 = (' WSE-2B-T-FLD1 ')'
          logger.info("* 712*   WSE-2B-T-FLD1 = ({})", new String(methodOut.getWse2bTFld1())); 
//  DISPLAY '* 713*   WSE-2B-T-FLD2 = (' WSE-2B-T-FLD2 ')'
          logger.info("* 713*   WSE-2B-T-FLD2 = ({})", new String(methodOut.getWse2bTFld2())); 
//  DISPLAY '* 714*   WSE-2B-T-FLD3 = (' WSE-2B-T-FLD3 ')'
          logger.info("* 714*   WSE-2B-T-FLD3 = ({})", new String(methodOut.getWse2bTFld3())); 

// *
// * Src -> group; tgt -> group ; src same size as tgt
// *
//  INITIALIZE WSE-3A-S WSE-3A-T
          methodOut.getWse3aS().initialize();
          methodOut.getWse3aT().initialize();
//  MOVE ALL 'ABCD' TO WSE-3A-S-FLD1
          methodOut.setWse3aSFld1(CONSTANTS.LITERAL_ABCDABCDABCDABCDABCDABCDABCDABCD);
      
      return methodOut;
      }
      /**
      * mainlineSplit24 
      *   This method is derived from 
  *   COBOL Paragraph - MAINLINE-SPLIT24 COBOL Cyclomatic complexity - 1
      * Input  :  

      * - wse3aS                         COBOL Name: WSE-3A-S
      * - wse3aTR                        COBOL Name: WSE-3A-T-R
      * - wse3bTR                        COBOL Name: WSE-3B-T-R
      * - wse4aTR                        COBOL Name: WSE-4A-T-R
      * - wse4bTR                        COBOL Name: WSE-4B-T-R
      * - wse1aTR                        COBOL Name: WSE-1A-T-R
      *
      * Output :  

      * - wse3aSFld2                     COBOL Name: WSE-3A-S-FLD2
      * - wse3aT                         COBOL Name: WSE-3A-T
      * - wse3aS                         COBOL Name: WSE-3A-S
      * - wse3aSFld1                     COBOL Name: WSE-3A-S-FLD1
      * - wse3aTFld1                     COBOL Name: WSE-3A-T-FLD1
      * - wse3aTFld2                     COBOL Name: WSE-3A-T-FLD2
      * - wse3bS                         COBOL Name: WSE-3B-S
      * - wse3bT                         COBOL Name: WSE-3B-T
      * - wse3bSFld1                     COBOL Name: WSE-3B-S-FLD1
      * - wse3bSFld2                     COBOL Name: WSE-3B-S-FLD2
      * - wse3bTFld3                     COBOL Name: WSE-3B-T-FLD3
      * - wse3bTFld1                     COBOL Name: WSE-3B-T-FLD1
      * - wse3bTFld2                     COBOL Name: WSE-3B-T-FLD2
      * - wse4aS                         COBOL Name: WSE-4A-S
      * - wse4aT                         COBOL Name: WSE-4A-T
      * - wse4aTFld1                     COBOL Name: WSE-4A-T-FLD1
      * - wse4aTFld2                     COBOL Name: WSE-4A-T-FLD2
      * - wse4bS                         COBOL Name: WSE-4B-S
      * - wse4bT                         COBOL Name: WSE-4B-T
      * - wse4bTFld3                     COBOL Name: WSE-4B-T-FLD3
      * - wse4bTFld1                     COBOL Name: WSE-4B-T-FLD1
      * - wse4bTFld2                     COBOL Name: WSE-4B-T-FLD2
      * - wse1aS                         COBOL Name: WSE-1A-S
      * - wse1aT                         COBOL Name: WSE-1A-T
      * - wse1aSFld1                     COBOL Name: WSE-1A-S-FLD1
      * - wse1aSFld2                     COBOL Name: WSE-1A-S-FLD2
      * - wse1aTFld1                     COBOL Name: WSE-1A-T-FLD1
      * - wse1aTFld2                     COBOL Name: WSE-1A-T-FLD2
      *
      * @throws CFException
      */
      @Override
      public MainlineSplit24OutCtx mainlineSplit24(MainlineSplit24InCtx methodIn) throws Exception {
Refmod1Ctx programCtx = methodIn.getRefmod1Ctx();
MainlineSplit24OutCtx methodOut = methodIn.getMainlineSplit24OutCtx();
//  MOVE ALL 'ZYXW' TO WSE-3A-S-FLD2
          methodOut.setWse3aSFld2(CONSTANTS.LITERAL_ZYXWZYXWZYXWZYXWZYXWZYXWZYXWZYXW);
//  MOVE WSE-3A-S TO WSE-3A-T ( 1 : LENGTH OF WSE-3A-T )
          methodOut.setWse3aT(replace(methodOut.getWse3aT().toCharArray(),methodOut.getWse3aS().toCharArray(),0,Wse3aT.getWse3aTFieldLength()));

// *
//  DISPLAY '* 715* WSE-3A-S        = (' WSE-3A-S ')'
          logger.info("* 715* WSE-3A-S        = ({})", methodOut.getWse3aS().toString()); 
//  DISPLAY '* 716*   WSE-3A-S-FLD1 = (' WSE-3A-S-FLD1 ')'
          logger.info("* 716*   WSE-3A-S-FLD1 = ({})", new String(methodOut.getWse3aSFld1())); 
//  DISPLAY '* 717*   WSE-3A-S-FLD2 = (' WSE-3A-S-FLD2 ')'
          logger.info("* 717*   WSE-3A-S-FLD2 = ({})", new String(methodOut.getWse3aSFld2())); 
//  DISPLAY '* 718* WSE-3A-T-R      = (' WSE-3A-T-R ')'
          logger.info("* 718* WSE-3A-T-R      = ({})", new String(methodIn.getWse3aTR())); 
//  DISPLAY '* 719* WSE-3A-T        = (' WSE-3A-T ')'
          logger.info("* 719* WSE-3A-T        = ({})", methodOut.getWse3aT().toString()); 
//  DISPLAY '* 720*   WSE-3A-T-FLD1 = (' WSE-3A-T-FLD1 ')'
          logger.info("* 720*   WSE-3A-T-FLD1 = ({})", new String(methodOut.getWse3aTFld1())); 
//  DISPLAY '* 721*   WSE-3A-T-FLD2 = (' WSE-3A-T-FLD2 ')'
          logger.info("* 721*   WSE-3A-T-FLD2 = ({})", new String(methodOut.getWse3aTFld2())); 

// *
// * Src -> group; tgt -> group ; src same size as tgt
// *
//  INITIALIZE WSE-3B-S WSE-3B-T
          methodOut.getWse3bS().initialize();
          methodOut.getWse3bT().initialize();
//  MOVE ALL 'ABCD' TO WSE-3B-S-FLD1
          methodOut.setWse3bSFld1(CONSTANTS.LITERAL_ABCDABCDABCDABCDABCDABCDABCDABCD);
//  MOVE ALL 'ZYXW' TO WSE-3B-S-FLD2
          methodOut.setWse3bSFld2(CONSTANTS.LITERAL_ZYXWZYXWZYXWZYXWZYXWZYXWZYXWZYXW);
//  MOVE ALL 'MNOP' TO WSE-3B-T-FLD3
          methodOut.setWse3bTFld3(CONSTANTS.LITERAL_MNOPMNOPMNOPMNOPMNOPMNOPMNOPMNOP);
//  MOVE WSE-3B-S TO WSE-3B-T ( 1 : LENGTH OF WSE-3B-T )
          methodOut.setWse3bT(replace(methodOut.getWse3bT().toCharArray(),methodOut.getWse3bS().toCharArray(),0,Wse3bT.getWse3bTFieldLength()));

// *
//  DISPLAY '* 722* WSE-3B-S        = (' WSE-3B-S ')'
          logger.info("* 722* WSE-3B-S        = ({})", methodOut.getWse3bS().toString()); 
//  DISPLAY '* 723*   WSE-3B-S-FLD1 = (' WSE-3B-S-FLD1 ')'
          logger.info("* 723*   WSE-3B-S-FLD1 = ({})", new String(methodOut.getWse3bSFld1())); 
//  DISPLAY '* 724*   WSE-3B-S-FLD2 = (' WSE-3B-S-FLD2 ')'
          logger.info("* 724*   WSE-3B-S-FLD2 = ({})", new String(methodOut.getWse3bSFld2())); 
//  DISPLAY '* 725* WSE-3B-T-R      = (' WSE-3B-T-R ')'
          logger.info("* 725* WSE-3B-T-R      = ({})", new String(methodIn.getWse3bTR())); 
//  DISPLAY '* 726* WSE-3B-T        = (' WSE-3B-T ')'
          logger.info("* 726* WSE-3B-T        = ({})", methodOut.getWse3bT().toString()); 
//  DISPLAY '* 727*   WSE-3B-T-FLD1 = (' WSE-3B-T-FLD1 ')'
          logger.info("* 727*   WSE-3B-T-FLD1 = ({})", new String(methodOut.getWse3bTFld1())); 
//  DISPLAY '* 728*   WSE-3B-T-FLD2 = (' WSE-3B-T-FLD2 ')'
          logger.info("* 728*   WSE-3B-T-FLD2 = ({})", new String(methodOut.getWse3bTFld2())); 
//  DISPLAY '* 729*   WSE-3B-T-FLD3 = (' WSE-3B-T-FLD3 ')'
          logger.info("* 729*   WSE-3B-T-FLD3 = ({})", new String(methodOut.getWse3bTFld3())); 

// *
// * Src -> string; tgt -> group ; src same size as tgt
// *
//  INITIALIZE WSE-4A-S WSE-4A-T
          methodOut.setWse4aS(CONSTANTS.SPACE_60 /* Fill 60 Spaces*/);
          methodOut.getWse4aT().initialize();
          // MOVE ALL 'ABCD' TO WSE-4A-S
          methodOut.setWse4aS(CONSTANTS.LITERAL_1122147122);
//  MOVE WSE-4A-S TO WSE-4A-T ( 1 : LENGTH OF WSE-4A-T )
          methodOut.setWse4aT(methodOut.getWse4aS(),0,methodOut.getWse4aS().length,0/* wse4aT */ ,Wse4aT.getWse4aTFieldLength() /* field,targetIndex,targetLen */);

// *
//  DISPLAY '* 730* WSE-4A-S        = (' WSE-4A-S ')'
          logger.info("* 730* WSE-4A-S        = ({})", new String(methodOut.getWse4aS())); 
//  DISPLAY '* 731* WSE-4A-T-R      = (' WSE-4A-T-R ')'
          logger.info("* 731* WSE-4A-T-R      = ({})", new String(methodIn.getWse4aTR())); 
//  DISPLAY '* 732* WSE-4A-T        = (' WSE-4A-T ')'
          logger.info("* 732* WSE-4A-T        = ({})", methodOut.getWse4aT().toString()); 
//  DISPLAY '* 733*   WSE-4A-T-FLD1 = (' WSE-4A-T-FLD1 ')'
          logger.info("* 733*   WSE-4A-T-FLD1 = ({})", new String(methodOut.getWse4aTFld1())); 
//  DISPLAY '* 734*   WSE-4A-T-FLD2 = (' WSE-4A-T-FLD2 ')'
          logger.info("* 734*   WSE-4A-T-FLD2 = ({})", new String(methodOut.getWse4aTFld2())); 

// *
// * Src -> string; tgt -> group ; src same size as tgt
// *
//  INITIALIZE WSE-4B-S WSE-4B-T
          methodOut.setWse4bS(CONSTANTS.SPACE_60 /* Fill 60 Spaces*/);
          methodOut.getWse4bT().initialize();
          // MOVE ALL 'ABCD' TO WSE-4B-S
          methodOut.setWse4bS(CONSTANTS.LITERAL_1122147122);
//  MOVE ALL 'MNOP' TO WSE-4B-T-FLD3
          methodOut.setWse4bTFld3(CONSTANTS.LITERAL_MNOPMNOPMNOPMNOPMNOPMNOPMNOPMNOP);
//  MOVE WSE-4B-S TO WSE-4B-T ( 1 : LENGTH OF WSE-4B-T )
          methodOut.setWse4bT(methodOut.getWse4bS(),0,methodOut.getWse4bS().length,0/* wse4bT */ ,Wse4bT.getWse4bTFieldLength() /* field,targetIndex,targetLen */);

// *
//  DISPLAY '* 735* WSE-4B-S        = (' WSE-4B-S ')'
          logger.info("* 735* WSE-4B-S        = ({})", new String(methodOut.getWse4bS())); 
//  DISPLAY '* 736* WSE-4B-T-R      = (' WSE-4B-T-R ')'
          logger.info("* 736* WSE-4B-T-R      = ({})", new String(methodIn.getWse4bTR())); 
//  DISPLAY '* 737* WSE-4B-T        = (' WSE-4B-T ')'
          logger.info("* 737* WSE-4B-T        = ({})", methodOut.getWse4bT().toString()); 
//  DISPLAY '* 738*   WSE-4B-T-FLD1 = (' WSE-4B-T-FLD1 ')'
          logger.info("* 738*   WSE-4B-T-FLD1 = ({})", new String(methodOut.getWse4bTFld1())); 
//  DISPLAY '* 739*   WSE-4B-T-FLD2 = (' WSE-4B-T-FLD2 ')'
          logger.info("* 739*   WSE-4B-T-FLD2 = ({})", new String(methodOut.getWse4bTFld2())); 
//  DISPLAY '* 740*   WSE-4B-T-FLD3 = (' WSE-4B-T-FLD3 ')'
          logger.info("* 740*   WSE-4B-T-FLD3 = ({})", new String(methodOut.getWse4bTFld3())); 

// *
// * Src -> group; tgt -> group ; src same size as tgt
// *
//  INITIALIZE WSE-1A-S WSE-1A-T
          methodOut.getWse1aS().initialize();
          methodOut.getWse1aT().initialize();
//  MOVE ALL 'ABCD' TO WSE-1A-S-FLD1
          methodOut.setWse1aSFld1(CONSTANTS.LITERAL_ABCDABCDABCDABCDABCDABCDABCDABCD);
//  MOVE ALL 'ZYXW' TO WSE-1A-S-FLD2
          methodOut.setWse1aSFld2(CONSTANTS.LITERAL_ZYXWZYXWZYXWZYXWZYXWZYXWZYXWZYXW);
//  MOVE WSE-1A-S ( 3 : LENGTH OF WSE-1A-S - 3 ) TO WSE-1A-T ( 5 : LENGTH OF WSE-1A-T - 5)
          methodOut.setWse1aT(replace(methodOut.getWse1aT().toCharArray(),substring(methodOut.getWse1aS().getCharArray(),2, (Wse1aS.getWse1aSFieldLength() - 3 + 2) ),4, (Wse1aT.getWse1aTFieldLength() - 5 + 4) ));

// *
//  DISPLAY '* 741* WSE-1A-S        = (' WSE-1A-S ')'
          logger.info("* 741* WSE-1A-S        = ({})", methodOut.getWse1aS().toString()); 
//  DISPLAY '* 742*   WSE-1A-S-FLD1 = (' WSE-1A-S-FLD1 ')'
          logger.info("* 742*   WSE-1A-S-FLD1 = ({})", new String(methodOut.getWse1aSFld1())); 
//  DISPLAY '* 743*   WSE-1A-S-FLD2 = (' WSE-1A-S-FLD2 ')'
          logger.info("* 743*   WSE-1A-S-FLD2 = ({})", new String(methodOut.getWse1aSFld2())); 
//  DISPLAY '* 744* WSE-1A-T-R      = (' WSE-1A-T-R ')'
          logger.info("* 744* WSE-1A-T-R      = ({})", new String(methodIn.getWse1aTR())); 
//  DISPLAY '* 745* WSE-1A-T        = (' WSE-1A-T ')'
          logger.info("* 745* WSE-1A-T        = ({})", methodOut.getWse1aT().toString()); 
//  DISPLAY '* 746*   WSE-1A-T-FLD1 = (' WSE-1A-T-FLD1 ')'
          logger.info("* 746*   WSE-1A-T-FLD1 = ({})", new String(methodOut.getWse1aTFld1())); 
//  DISPLAY '* 747*   WSE-1A-T-FLD2 = (' WSE-1A-T-FLD2 ')'
          logger.info("* 747*   WSE-1A-T-FLD2 = ({})", new String(methodOut.getWse1aTFld2())); 
      
      return methodOut;
      }
      /**
      * mainlineSplit25 
      *   This method is derived from 
  *   COBOL Paragraph - MAINLINE-SPLIT25 COBOL Cyclomatic complexity - 1
      * Input  :  

      * - wse1bTR                        COBOL Name: WSE-1B-T-R
      * - wse2aTR                        COBOL Name: WSE-2A-T-R
      * - wse2bTR                        COBOL Name: WSE-2B-T-R
      * - wse3aTR                        COBOL Name: WSE-3A-T-R
      * - wse3bTR                        COBOL Name: WSE-3B-T-R
      *
      * Output :  

      * - wse1bS                         COBOL Name: WSE-1B-S
      * - wse1bT                         COBOL Name: WSE-1B-T
      * - wse1bSFld1                     COBOL Name: WSE-1B-S-FLD1
      * - wse1bSFld2                     COBOL Name: WSE-1B-S-FLD2
      * - wse1bTFld3                     COBOL Name: WSE-1B-T-FLD3
      * - wse1bTFld1                     COBOL Name: WSE-1B-T-FLD1
      * - wse1bTFld2                     COBOL Name: WSE-1B-T-FLD2
      * - wse2aS                         COBOL Name: WSE-2A-S
      * - wse2aT                         COBOL Name: WSE-2A-T
      * - wse2aTFld1                     COBOL Name: WSE-2A-T-FLD1
      * - wse2aTFld2                     COBOL Name: WSE-2A-T-FLD2
      * - wse2bS                         COBOL Name: WSE-2B-S
      * - wse2bT                         COBOL Name: WSE-2B-T
      * - wse2bTFld3                     COBOL Name: WSE-2B-T-FLD3
      * - wse2bTFld1                     COBOL Name: WSE-2B-T-FLD1
      * - wse2bTFld2                     COBOL Name: WSE-2B-T-FLD2
      * - wse3aS                         COBOL Name: WSE-3A-S
      * - wse3aT                         COBOL Name: WSE-3A-T
      * - wse3aSFld1                     COBOL Name: WSE-3A-S-FLD1
      * - wse3aSFld2                     COBOL Name: WSE-3A-S-FLD2
      * - wse3aTFld1                     COBOL Name: WSE-3A-T-FLD1
      * - wse3aTFld2                     COBOL Name: WSE-3A-T-FLD2
      * - wse3bS                         COBOL Name: WSE-3B-S
      * - wse3bT                         COBOL Name: WSE-3B-T
      * - wse3bSFld1                     COBOL Name: WSE-3B-S-FLD1
      * - wse3bSFld2                     COBOL Name: WSE-3B-S-FLD2
      * - wse3bTFld3                     COBOL Name: WSE-3B-T-FLD3
      *
      * @throws CFException
      */
      @Override
      public MainlineSplit25OutCtx mainlineSplit25(MainlineSplit25InCtx methodIn) throws Exception {
			// Declare local variables used in the method
			 final int WSE_2A_S_LENGTH = 60;
			 final int WSE_2B_S_LENGTH = 60;
			// End of variable declaration

Refmod1Ctx programCtx = methodIn.getRefmod1Ctx();
MainlineSplit25OutCtx methodOut = methodIn.getMainlineSplit25OutCtx();

// *
// * Src -> group; tgt -> group ; src same size as tgt
// *
//  INITIALIZE WSE-1B-S WSE-1B-T
          methodOut.getWse1bS().initialize();
          methodOut.getWse1bT().initialize();
//  MOVE ALL 'ABCD' TO WSE-1B-S-FLD1
          methodOut.setWse1bSFld1(CONSTANTS.LITERAL_ABCDABCDABCDABCDABCDABCDABCDABCD);
//  MOVE ALL 'ZYXW' TO WSE-1B-S-FLD2
          methodOut.setWse1bSFld2(CONSTANTS.LITERAL_ZYXWZYXWZYXWZYXWZYXWZYXWZYXWZYXW);
//  MOVE ALL 'MNOP' TO WSE-1B-T-FLD3
          methodOut.setWse1bTFld3(CONSTANTS.LITERAL_MNOPMNOPMNOPMNOPMNOPMNOPMNOPMNOP);
//  MOVE WSE-1B-S ( 3 : LENGTH OF WSE-1B-S - 3 ) TO WSE-1B-T ( 5 : LENGTH OF WSE-1B-T - 5)
          methodOut.setWse1bT(replace(methodOut.getWse1bT().toCharArray(),substring(methodOut.getWse1bS().getCharArray(),2, (Wse1bS.getWse1bSFieldLength() - 3 + 2) ),4, (Wse1bT.getWse1bTFieldLength() - 5 + 4) ));

// *
//  DISPLAY '* 748* WSE-1B-S        = (' WSE-1B-S ')'
          logger.info("* 748* WSE-1B-S        = ({})", methodOut.getWse1bS().toString()); 
//  DISPLAY '* 749*   WSE-1B-S-FLD1 = (' WSE-1B-S-FLD1 ')'
          logger.info("* 749*   WSE-1B-S-FLD1 = ({})", new String(methodOut.getWse1bSFld1())); 
//  DISPLAY '* 750*   WSE-1B-S-FLD2 = (' WSE-1B-S-FLD2 ')'
          logger.info("* 750*   WSE-1B-S-FLD2 = ({})", new String(methodOut.getWse1bSFld2())); 
//  DISPLAY '* 751* WSE-1B-T-R      = (' WSE-1B-T-R ')'
          logger.info("* 751* WSE-1B-T-R      = ({})", new String(methodIn.getWse1bTR())); 
//  DISPLAY '* 752* WSE-1B-T        = (' WSE-1B-T ')'
          logger.info("* 752* WSE-1B-T        = ({})", methodOut.getWse1bT().toString()); 
//  DISPLAY '* 753*   WSE-1B-T-FLD1 = (' WSE-1B-T-FLD1 ')'
          logger.info("* 753*   WSE-1B-T-FLD1 = ({})", new String(methodOut.getWse1bTFld1())); 
//  DISPLAY '* 754*   WSE-1B-T-FLD2 = (' WSE-1B-T-FLD2 ')'
          logger.info("* 754*   WSE-1B-T-FLD2 = ({})", new String(methodOut.getWse1bTFld2())); 
//  DISPLAY '* 755*   WSE-1B-T-FLD3 = (' WSE-1B-T-FLD3 ')'
          logger.info("* 755*   WSE-1B-T-FLD3 = ({})", new String(methodOut.getWse1bTFld3())); 

// *
// * Src -> string; tgt -> group ; src same size as tgt
// *
//  INITIALIZE WSE-2A-S WSE-2A-T
          methodOut.setWse2aS(CONSTANTS.SPACE_60 /* Fill 60 Spaces*/);
          methodOut.getWse2aT().initialize();
          // MOVE ALL 'ABCD' TO WSE-2A-S
          methodOut.setWse2aS(CONSTANTS.LITERAL_1122147122);
//  MOVE WSE-2A-S ( 3 : LENGTH OF WSE-2A-S - 3 ) TO WSE-2A-T ( 5 : LENGTH OF WSE-2A-T - 5)
          methodOut.setWse2aT(methodOut.getWse2aS(),2/* wse2aS */ ,WSE_2A_S_LENGTH - 3,4,Wse2aT.getWse2aTFieldLength() - 5 /* field,sourceIndex,sourceLen,targetIndex,targetLen */);

// *
//  DISPLAY '* 756* WSE-2A-S        = (' WSE-2A-S ')'
          logger.info("* 756* WSE-2A-S        = ({})", new String(methodOut.getWse2aS())); 
//  DISPLAY '* 757* WSE-2A-T-R      = (' WSE-2A-T-R ')'
          logger.info("* 757* WSE-2A-T-R      = ({})", new String(methodIn.getWse2aTR())); 
//  DISPLAY '* 758* WSE-2A-T        = (' WSE-2A-T ')'
          logger.info("* 758* WSE-2A-T        = ({})", methodOut.getWse2aT().toString()); 
//  DISPLAY '* 759*   WSE-2A-T-FLD1 = (' WSE-2A-T-FLD1 ')'
          logger.info("* 759*   WSE-2A-T-FLD1 = ({})", new String(methodOut.getWse2aTFld1())); 
//  DISPLAY '* 760*   WSE-2A-T-FLD2 = (' WSE-2A-T-FLD2 ')'
          logger.info("* 760*   WSE-2A-T-FLD2 = ({})", new String(methodOut.getWse2aTFld2())); 

// *
// * Src -> string; tgt -> group ; src same size as tgt
// *
//  INITIALIZE WSE-2B-S WSE-2B-T
          methodOut.setWse2bS(CONSTANTS.SPACE_60 /* Fill 60 Spaces*/);
          methodOut.getWse2bT().initialize();
          // MOVE ALL 'ABCD' TO WSE-2B-S
          methodOut.setWse2bS(CONSTANTS.LITERAL_1122147122);
//  MOVE ALL 'MNOP' TO WSE-2B-T-FLD3
          methodOut.setWse2bTFld3(CONSTANTS.LITERAL_MNOPMNOPMNOPMNOPMNOPMNOPMNOPMNOP);
//  MOVE WSE-2B-S ( 3 : LENGTH OF WSE-2B-S - 3 ) TO WSE-2B-T ( 5 : LENGTH OF WSE-2B-T - 5)
          methodOut.setWse2bT(methodOut.getWse2bS(),2/* wse2bS */ ,WSE_2B_S_LENGTH - 3,4,Wse2bT.getWse2bTFieldLength() - 5 /* field,sourceIndex,sourceLen,targetIndex,targetLen */);

// *
//  DISPLAY '* 761* WSE-2B-S        = (' WSE-2B-S ')'
          logger.info("* 761* WSE-2B-S        = ({})", new String(methodOut.getWse2bS())); 
//  DISPLAY '* 762* WSE-2B-T-R      = (' WSE-2B-T-R ')'
          logger.info("* 762* WSE-2B-T-R      = ({})", new String(methodIn.getWse2bTR())); 
//  DISPLAY '* 763* WSE-2B-T        = (' WSE-2B-T ')'
          logger.info("* 763* WSE-2B-T        = ({})", methodOut.getWse2bT().toString()); 
//  DISPLAY '* 764*   WSE-2B-T-FLD1 = (' WSE-2B-T-FLD1 ')'
          logger.info("* 764*   WSE-2B-T-FLD1 = ({})", new String(methodOut.getWse2bTFld1())); 
//  DISPLAY '* 765*   WSE-2B-T-FLD2 = (' WSE-2B-T-FLD2 ')'
          logger.info("* 765*   WSE-2B-T-FLD2 = ({})", new String(methodOut.getWse2bTFld2())); 
//  DISPLAY '* 766*   WSE-2B-T-FLD3 = (' WSE-2B-T-FLD3 ')'
          logger.info("* 766*   WSE-2B-T-FLD3 = ({})", new String(methodOut.getWse2bTFld3())); 

// *
// * Src -> group; tgt -> group ; src same size as tgt
// *
//  INITIALIZE WSE-3A-S WSE-3A-T
          methodOut.getWse3aS().initialize();
          methodOut.getWse3aT().initialize();
//  MOVE ALL 'ABCD' TO WSE-3A-S-FLD1
          methodOut.setWse3aSFld1(CONSTANTS.LITERAL_ABCDABCDABCDABCDABCDABCDABCDABCD);
//  MOVE ALL 'ZYXW' TO WSE-3A-S-FLD2
          methodOut.setWse3aSFld2(CONSTANTS.LITERAL_ZYXWZYXWZYXWZYXWZYXWZYXWZYXWZYXW);
//  MOVE WSE-3A-S TO WSE-3A-T ( 5 : LENGTH OF WSE-3A-T - 5)
          methodOut.setWse3aT(replace(methodOut.getWse3aT().toCharArray(),methodOut.getWse3aS().toCharArray(),4, (Wse3aT.getWse3aTFieldLength() - 5 + 4) ));

// *
//  DISPLAY '* 767* WSE-3A-S        = (' WSE-3A-S ')'
          logger.info("* 767* WSE-3A-S        = ({})", methodOut.getWse3aS().toString()); 
//  DISPLAY '* 768*   WSE-3A-S-FLD1 = (' WSE-3A-S-FLD1 ')'
          logger.info("* 768*   WSE-3A-S-FLD1 = ({})", new String(methodOut.getWse3aSFld1())); 
//  DISPLAY '* 769*   WSE-3A-S-FLD2 = (' WSE-3A-S-FLD2 ')'
          logger.info("* 769*   WSE-3A-S-FLD2 = ({})", new String(methodOut.getWse3aSFld2())); 
//  DISPLAY '* 770* WSE-3A-T-R      = (' WSE-3A-T-R ')'
          logger.info("* 770* WSE-3A-T-R      = ({})", new String(methodIn.getWse3aTR())); 
//  DISPLAY '* 771* WSE-3A-T        = (' WSE-3A-T ')'
          logger.info("* 771* WSE-3A-T        = ({})", methodOut.getWse3aT().toString()); 
//  DISPLAY '* 772*   WSE-3A-T-FLD1 = (' WSE-3A-T-FLD1 ')'
          logger.info("* 772*   WSE-3A-T-FLD1 = ({})", new String(methodOut.getWse3aTFld1())); 
//  DISPLAY '* 773*   WSE-3A-T-FLD2 = (' WSE-3A-T-FLD2 ')'
          logger.info("* 773*   WSE-3A-T-FLD2 = ({})", new String(methodOut.getWse3aTFld2())); 

// *
// * Src -> group; tgt -> group ; src same size as tgt
// *
//  INITIALIZE WSE-3B-S WSE-3B-T
          methodOut.getWse3bS().initialize();
          methodOut.getWse3bT().initialize();
//  MOVE ALL 'ABCD' TO WSE-3B-S-FLD1
          methodOut.setWse3bSFld1(CONSTANTS.LITERAL_ABCDABCDABCDABCDABCDABCDABCDABCD);
//  MOVE ALL 'ZYXW' TO WSE-3B-S-FLD2
          methodOut.setWse3bSFld2(CONSTANTS.LITERAL_ZYXWZYXWZYXWZYXWZYXWZYXWZYXWZYXW);
//  MOVE ALL 'MNOP' TO WSE-3B-T-FLD3
          methodOut.setWse3bTFld3(CONSTANTS.LITERAL_MNOPMNOPMNOPMNOPMNOPMNOPMNOPMNOP);
//  MOVE WSE-3B-S TO WSE-3B-T ( 5 : LENGTH OF WSE-3B-T - 5)
          methodOut.setWse3bT(replace(methodOut.getWse3bT().toCharArray(),methodOut.getWse3bS().toCharArray(),4, (Wse3bT.getWse3bTFieldLength() - 5 + 4) ));

// *
//  DISPLAY '* 774* WSE-3B-S        = (' WSE-3B-S ')'
          logger.info("* 774* WSE-3B-S        = ({})", methodOut.getWse3bS().toString()); 
//  DISPLAY '* 775*   WSE-3B-S-FLD1 = (' WSE-3B-S-FLD1 ')'
          logger.info("* 775*   WSE-3B-S-FLD1 = ({})", new String(methodOut.getWse3bSFld1())); 
//  DISPLAY '* 776*   WSE-3B-S-FLD2 = (' WSE-3B-S-FLD2 ')'
          logger.info("* 776*   WSE-3B-S-FLD2 = ({})", new String(methodOut.getWse3bSFld2())); 
//  DISPLAY '* 777* WSE-3B-T-R      = (' WSE-3B-T-R ')'
          logger.info("* 777* WSE-3B-T-R      = ({})", new String(methodIn.getWse3bTR())); 
      
      return methodOut;
      }
      /**
      * mainlineSplit26 
      *   This method is derived from 
  *   COBOL Paragraph - MAINLINE-SPLIT26 COBOL Cyclomatic complexity - 1
      * Input  :  

      * - wse3bT                         COBOL Name: WSE-3B-T
      * - wse3bTFld1                     COBOL Name: WSE-3B-T-FLD1
      * - wse3bTFld2                     COBOL Name: WSE-3B-T-FLD2
      * - wse3bTFld3                     COBOL Name: WSE-3B-T-FLD3
      * - wse4aTR                        COBOL Name: WSE-4A-T-R
      * - wse4bTR                        COBOL Name: WSE-4B-T-R
      * - wse5aSGrp                      COBOL Name: WSE-5A-S-GRP
      * - wse5aTR                        COBOL Name: WSE-5A-T-R
      * - wse5bSGrp                      COBOL Name: WSE-5B-S-GRP
      * - wse5bTR                        COBOL Name: WSE-5B-T-R
      *
      * Output :  

      * - wse4aS                         COBOL Name: WSE-4A-S
      * - wse4aT                         COBOL Name: WSE-4A-T
      * - wse4aTFld1                     COBOL Name: WSE-4A-T-FLD1
      * - wse4aTFld2                     COBOL Name: WSE-4A-T-FLD2
      * - wse4bS                         COBOL Name: WSE-4B-S
      * - wse4bT                         COBOL Name: WSE-4B-T
      * - wse4bTFld3                     COBOL Name: WSE-4B-T-FLD3
      * - wse4bTFld1                     COBOL Name: WSE-4B-T-FLD1
      * - wse4bTFld2                     COBOL Name: WSE-4B-T-FLD2
      * - wse5aS                         COBOL Name: WSE-5A-S
      * - wse5aT                         COBOL Name: WSE-5A-T
      * - wse5aSFld1                     COBOL Name: WSE-5A-S-FLD1
      * - wse5aSFld2                     COBOL Name: WSE-5A-S-FLD2
      * - wse5aTFld1                     COBOL Name: WSE-5A-T-FLD1
      * - wse5aTFld2                     COBOL Name: WSE-5A-T-FLD2
      * - wse5bS                         COBOL Name: WSE-5B-S
      * - wse5bT                         COBOL Name: WSE-5B-T
      * - wse5bSFld1                     COBOL Name: WSE-5B-S-FLD1
      * - wse5bSFld2                     COBOL Name: WSE-5B-S-FLD2
      * - wse5bTFld3                     COBOL Name: WSE-5B-T-FLD3
      * - wse5bTFld1                     COBOL Name: WSE-5B-T-FLD1
      * - wse5bTFld2                     COBOL Name: WSE-5B-T-FLD2
      * - wse6aS                         COBOL Name: WSE-6A-S
      * - wse6aT                         COBOL Name: WSE-6A-T
      *
      * @throws CFException
      */
      @Override
      public MainlineSplit26OutCtx mainlineSplit26(MainlineSplit26InCtx methodIn) throws Exception {
			// Declare local variables used in the method
			 final int WSE_6A_S_LENGTH = 60;
			// End of variable declaration

Refmod1Ctx programCtx = methodIn.getRefmod1Ctx();
MainlineSplit26OutCtx methodOut = methodIn.getMainlineSplit26OutCtx();
//  DISPLAY '* 778* WSE-3B-T        = (' WSE-3B-T ')'
          logger.info("* 778* WSE-3B-T        = ({})", methodIn.getWse3bT().toString()); 
//  DISPLAY '* 779*   WSE-3B-T-FLD1 = (' WSE-3B-T-FLD1 ')'
          logger.info("* 779*   WSE-3B-T-FLD1 = ({})", new String(methodIn.getWse3bTFld1())); 
//  DISPLAY '* 780*   WSE-3B-T-FLD2 = (' WSE-3B-T-FLD2 ')'
          logger.info("* 780*   WSE-3B-T-FLD2 = ({})", new String(methodIn.getWse3bTFld2())); 
//  DISPLAY '* 781*   WSE-3B-T-FLD3 = (' WSE-3B-T-FLD3 ')'
          logger.info("* 781*   WSE-3B-T-FLD3 = ({})", new String(methodIn.getWse3bTFld3())); 

// *
// * Src -> string; tgt -> group ; src same size as tgt
// *
//  INITIALIZE WSE-4A-S WSE-4A-T
          methodOut.setWse4aS(CONSTANTS.SPACE_60 /* Fill 60 Spaces*/);
          methodOut.getWse4aT().initialize();
          // MOVE ALL 'ABCD' TO WSE-4A-S
          methodOut.setWse4aS(CONSTANTS.LITERAL_1122147122);
//  MOVE WSE-4A-S TO WSE-4A-T ( 5 : LENGTH OF WSE-4A-T - 5)
          methodOut.setWse4aT(methodOut.getWse4aS(),0,methodOut.getWse4aS().length,4/* wse4aT */ ,Wse4aT.getWse4aTFieldLength() - 5 /* field,targetIndex,targetLen */);

// *
//  DISPLAY '* 782* WSE-4A-S        = (' WSE-4A-S ')'
          logger.info("* 782* WSE-4A-S        = ({})", new String(methodOut.getWse4aS())); 
//  DISPLAY '* 783* WSE-4A-T-R      = (' WSE-4A-T-R ')'
          logger.info("* 783* WSE-4A-T-R      = ({})", new String(methodIn.getWse4aTR())); 
//  DISPLAY '* 784* WSE-4A-T        = (' WSE-4A-T ')'
          logger.info("* 784* WSE-4A-T        = ({})", methodOut.getWse4aT().toString()); 
//  DISPLAY '* 785*   WSE-4A-T-FLD1 = (' WSE-4A-T-FLD1 ')'
          logger.info("* 785*   WSE-4A-T-FLD1 = ({})", new String(methodOut.getWse4aTFld1())); 
//  DISPLAY '* 786*   WSE-4A-T-FLD2 = (' WSE-4A-T-FLD2 ')'
          logger.info("* 786*   WSE-4A-T-FLD2 = ({})", new String(methodOut.getWse4aTFld2())); 

// *
// * Src -> string; tgt -> group ; src same size as tgt
// *
//  INITIALIZE WSE-4B-S WSE-4B-T
          methodOut.setWse4bS(CONSTANTS.SPACE_60 /* Fill 60 Spaces*/);
          methodOut.getWse4bT().initialize();
          // MOVE ALL 'ABCD' TO WSE-4B-S
          methodOut.setWse4bS(CONSTANTS.LITERAL_1122147122);
//  MOVE ALL 'MNOP' TO WSE-4B-T-FLD3
          methodOut.setWse4bTFld3(CONSTANTS.LITERAL_MNOPMNOPMNOPMNOPMNOPMNOPMNOPMNOP);
//  MOVE WSE-4B-S TO WSE-4B-T ( 5 : LENGTH OF WSE-4B-T - 5)
          methodOut.setWse4bT(methodOut.getWse4bS(),0,methodOut.getWse4bS().length,4/* wse4bT */ ,Wse4bT.getWse4bTFieldLength() - 5 /* field,targetIndex,targetLen */);

// *
//  DISPLAY '* 787* WSE-4B-S        = (' WSE-4B-S ')'
          logger.info("* 787* WSE-4B-S        = ({})", new String(methodOut.getWse4bS())); 
//  DISPLAY '* 788* WSE-4B-T-R      = (' WSE-4B-T-R ')'
          logger.info("* 788* WSE-4B-T-R      = ({})", new String(methodIn.getWse4bTR())); 
//  DISPLAY '* 789* WSE-4B-T        = (' WSE-4B-T ')'
          logger.info("* 789* WSE-4B-T        = ({})", methodOut.getWse4bT().toString()); 
//  DISPLAY '* 790*   WSE-4B-T-FLD1 = (' WSE-4B-T-FLD1 ')'
          logger.info("* 790*   WSE-4B-T-FLD1 = ({})", new String(methodOut.getWse4bTFld1())); 
//  DISPLAY '* 791*   WSE-4B-T-FLD2 = (' WSE-4B-T-FLD2 ')'
          logger.info("* 791*   WSE-4B-T-FLD2 = ({})", new String(methodOut.getWse4bTFld2())); 
//  DISPLAY '* 792*   WSE-4B-T-FLD3 = (' WSE-4B-T-FLD3 ')'
          logger.info("* 792*   WSE-4B-T-FLD3 = ({})", new String(methodOut.getWse4bTFld3())); 

// *
// * Src -> group; tgt -> group ; src same size as tgt ; src offset 3
// *
//  INITIALIZE WSE-5A-S WSE-5A-T
          methodOut.getWse5aS().initialize();
          methodOut.getWse5aT().initialize();
//  MOVE ALL 'ABCD' TO WSE-5A-S-FLD1
          methodOut.setWse5aSFld1(CONSTANTS.LITERAL_ABCDABCDABCDABCDABCDABCDABCDABCD);
//  MOVE ALL 'ZYXW' TO WSE-5A-S-FLD2
          methodOut.setWse5aSFld2(CONSTANTS.LITERAL_ZYXWZYXWZYXWZYXWZYXWZYXWZYXWZYXW);
//  MOVE WSE-5A-S ( 1 : LENGTH OF WSE-5A-S ) TO WSE-5A-T ( 1 : LENGTH OF WSE-5A-T )
          methodOut.getWse5aTGroup().replace(methodIn.getWse5aSGrp()/*parent*/,3/*fromOffset - (wse5aT) */,Wse5aS.getWse5aSFieldLength()/*fromLen*/,0/*toOffset - (wse5aS) */,Wse5aT.getWse5aTFieldLength()/*toLen*/);

// *
//  DISPLAY '* 793* WSE-5A-S-GRP    = (' WSE-5A-S-GRP ')'
          logger.info("* 793* WSE-5A-S-GRP    = ({})", methodIn.getWse5aSGrp().toString()); 
//  DISPLAY '* 794* WSE-5A-S        = (' WSE-5A-S ')'
          logger.info("* 794* WSE-5A-S        = ({})", methodOut.getWse5aS().toString()); 
//  DISPLAY '* 795*   WSE-5A-S-FLD1 = (' WSE-5A-S-FLD1 ')'
          logger.info("* 795*   WSE-5A-S-FLD1 = ({})", new String(methodOut.getWse5aSFld1())); 
//  DISPLAY '* 796*   WSE-5A-S-FLD2 = (' WSE-5A-S-FLD2 ')'
          logger.info("* 796*   WSE-5A-S-FLD2 = ({})", new String(methodOut.getWse5aSFld2())); 
//  DISPLAY '* 797* WSE-5A-T-R      = (' WSE-5A-T-R ')'
          logger.info("* 797* WSE-5A-T-R      = ({})", new String(methodIn.getWse5aTR())); 
//  DISPLAY '* 798* WSE-5A-T        = (' WSE-5A-T ')'
          logger.info("* 798* WSE-5A-T        = ({})", methodOut.getWse5aT().toString()); 
//  DISPLAY '* 799*   WSE-5A-T-FLD1 = (' WSE-5A-T-FLD1 ')'
          logger.info("* 799*   WSE-5A-T-FLD1 = ({})", new String(methodOut.getWse5aTFld1())); 
//  DISPLAY '* 800*   WSE-5A-T-FLD2 = (' WSE-5A-T-FLD2 ')'
          logger.info("* 800*   WSE-5A-T-FLD2 = ({})", new String(methodOut.getWse5aTFld2())); 

// *
// * Src -> group; tgt -> group ; src same size as tgt ;src offset 3
// *
//  INITIALIZE WSE-5B-S WSE-5B-T
          methodOut.getWse5bS().initialize();
          methodOut.getWse5bT().initialize();
//  MOVE ALL 'ABCD' TO WSE-5B-S-FLD1
          methodOut.setWse5bSFld1(CONSTANTS.LITERAL_ABCDABCDABCDABCDABCDABCDABCDABCD);
//  MOVE ALL 'ZYXW' TO WSE-5B-S-FLD2
          methodOut.setWse5bSFld2(CONSTANTS.LITERAL_ZYXWZYXWZYXWZYXWZYXWZYXWZYXWZYXW);
//  MOVE ALL 'MNOP' TO WSE-5B-T-FLD3
          methodOut.setWse5bTFld3(CONSTANTS.LITERAL_MNOPMNOPMNOPMNOPMNOPMNOPMNOPMNOP);
//  MOVE WSE-5B-S ( 1 : LENGTH OF WSE-5B-S ) TO WSE-5B-T ( 1 : LENGTH OF WSE-5B-T )
          methodOut.getWse5bTGroup().replace(methodIn.getWse5bSGrp()/*parent*/,3/*fromOffset - (wse5bT) */,Wse5bS.getWse5bSFieldLength()/*fromLen*/,0/*toOffset - (wse5bS) */,Wse5bT.getWse5bTFieldLength()/*toLen*/);

// *
//  DISPLAY '* 801* WSE-5B-S-GRP    = (' WSE-5B-S-GRP ')'
          logger.info("* 801* WSE-5B-S-GRP    = ({})", methodIn.getWse5bSGrp().toString()); 
//  DISPLAY '* 802* WSE-5B-S        = (' WSE-5B-S ')'
          logger.info("* 802* WSE-5B-S        = ({})", methodOut.getWse5bS().toString()); 
//  DISPLAY '* 803*   WSE-5B-S-FLD1 = (' WSE-5B-S-FLD1 ')'
          logger.info("* 803*   WSE-5B-S-FLD1 = ({})", new String(methodOut.getWse5bSFld1())); 
//  DISPLAY '* 804*   WSE-5B-S-FLD2 = (' WSE-5B-S-FLD2 ')'
          logger.info("* 804*   WSE-5B-S-FLD2 = ({})", new String(methodOut.getWse5bSFld2())); 
//  DISPLAY '* 805* WSE-5B-T-R      = (' WSE-5B-T-R ')'
          logger.info("* 805* WSE-5B-T-R      = ({})", new String(methodIn.getWse5bTR())); 
//  DISPLAY '* 806* WSE-5B-T        = (' WSE-5B-T ')'
          logger.info("* 806* WSE-5B-T        = ({})", methodOut.getWse5bT().toString()); 
//  DISPLAY '* 807*   WSE-5B-T-FLD1 = (' WSE-5B-T-FLD1 ')'
          logger.info("* 807*   WSE-5B-T-FLD1 = ({})", new String(methodOut.getWse5bTFld1())); 
//  DISPLAY '* 808*   WSE-5B-T-FLD2 = (' WSE-5B-T-FLD2 ')'
          logger.info("* 808*   WSE-5B-T-FLD2 = ({})", new String(methodOut.getWse5bTFld2())); 
//  DISPLAY '* 809*   WSE-5B-T-FLD3 = (' WSE-5B-T-FLD3 ')'
          logger.info("* 809*   WSE-5B-T-FLD3 = ({})", new String(methodOut.getWse5bTFld3())); 

// *
// * Src -> string; tgt -> group ; src same size as tgt ; srcoffset 3
// *
//  INITIALIZE WSE-6A-S WSE-6A-T
          methodOut.setWse6aS(CONSTANTS.SPACE_60 /* Fill 60 Spaces*/);
          methodOut.getWse6aT().initialize();
//  MOVE ALL 'ABCD' TO WSE-6A-S
          methodOut.setWse6aS(CONSTANTS.LITERAL_1122147122);
//  MOVE WSE-6A-S ( 1 : LENGTH OF WSE-6A-S ) TO WSE-6A-T ( 1 : LENGTH OF WSE-6A-T )
          methodOut.getWse6aTGroup().replace(methodIn.getWse6aSGrp()/*parent*/,3/*fromOffset - (wse6aT) */,WSE_6A_S_LENGTH/*fromLen*/,0/*toOffset - (wse6aS) */,Wse6aT.getWse6aTFieldLength()/*toLen*/);
      
      return methodOut;
      }
      /**
      * mainlineSplit27 
      *   This method is derived from 
  *   COBOL Paragraph - MAINLINE-SPLIT27 COBOL Cyclomatic complexity - 1
      * Input  :  

      * - wse6aSGrp                      COBOL Name: WSE-6A-S-GRP
      * - wse6aS                         COBOL Name: WSE-6A-S
      * - wse6aTR                        COBOL Name: WSE-6A-T-R
      * - wse6aT                         COBOL Name: WSE-6A-T
      * - wse6aTFld1                     COBOL Name: WSE-6A-T-FLD1
      * - wse6aTFld2                     COBOL Name: WSE-6A-T-FLD2
      * - wse6bSGrp                      COBOL Name: WSE-6B-S-GRP
      * - wse6bTR                        COBOL Name: WSE-6B-T-R
      * - wse7aTGrpR                     COBOL Name: WSE-7A-T-GRP-R
      * - wse7aTGrp                      COBOL Name: WSE-7A-T-GRP
      * - wse7bTGrpR                     COBOL Name: WSE-7B-T-GRP-R
      * - wse7bTGrp                      COBOL Name: WSE-7B-T-GRP
      * - wse8aTGrpR                     COBOL Name: WSE-8A-T-GRP-R
      * - wse8aTGrp                      COBOL Name: WSE-8A-T-GRP
      *
      * Output :  

      * - wse6bS                         COBOL Name: WSE-6B-S
      * - wse6bT                         COBOL Name: WSE-6B-T
      * - wse6bTFld3                     COBOL Name: WSE-6B-T-FLD3
      * - wse6bTFld1                     COBOL Name: WSE-6B-T-FLD1
      * - wse6bTFld2                     COBOL Name: WSE-6B-T-FLD2
      * - wse7aS                         COBOL Name: WSE-7A-S
      * - wse7aT                         COBOL Name: WSE-7A-T
      * - wse7aSFld1                     COBOL Name: WSE-7A-S-FLD1
      * - wse7aSFld2                     COBOL Name: WSE-7A-S-FLD2
      * - wse7aTFld1                     COBOL Name: WSE-7A-T-FLD1
      * - wse7aTFld2                     COBOL Name: WSE-7A-T-FLD2
      * - wse7bS                         COBOL Name: WSE-7B-S
      * - wse7bT                         COBOL Name: WSE-7B-T
      * - wse7bSFld1                     COBOL Name: WSE-7B-S-FLD1
      * - wse7bSFld2                     COBOL Name: WSE-7B-S-FLD2
      * - wse7bTFld3                     COBOL Name: WSE-7B-T-FLD3
      * - wse7bTFld1                     COBOL Name: WSE-7B-T-FLD1
      * - wse7bTFld2                     COBOL Name: WSE-7B-T-FLD2
      * - wse8aS                         COBOL Name: WSE-8A-S
      * - wse8aT                         COBOL Name: WSE-8A-T
      * - wse8aTFld1                     COBOL Name: WSE-8A-T-FLD1
      *
      * @throws CFException
      */
      @Override
      public MainlineSplit27OutCtx mainlineSplit27(MainlineSplit27InCtx methodIn) throws Exception {
			// Declare local variables used in the method
			 final int WSE_6B_S_LENGTH = 60;
			 final int WSE_8A_S_LENGTH = 60;
			// End of variable declaration

Refmod1Ctx programCtx = methodIn.getRefmod1Ctx();
MainlineSplit27OutCtx methodOut = methodIn.getMainlineSplit27OutCtx();

// *
//  DISPLAY '* 810* WSE-6A-S-GRP    = (' WSE-6A-S-GRP ')'
          logger.info("* 810* WSE-6A-S-GRP    = ({})", methodIn.getWse6aSGrp().toString()); 
//  DISPLAY '* 811* WSE-6A-S        = (' WSE-6A-S ')'
          logger.info("* 811* WSE-6A-S        = ({})", new String(methodIn.getWse6aS())); 
//  DISPLAY '* 812* WSE-6A-T-R      = (' WSE-6A-T-R ')'
          logger.info("* 812* WSE-6A-T-R      = ({})", new String(methodIn.getWse6aTR())); 
//  DISPLAY '* 813* WSE-6A-T        = (' WSE-6A-T ')'
          logger.info("* 813* WSE-6A-T        = ({})", methodIn.getWse6aT().toString()); 
//  DISPLAY '* 814*   WSE-6A-T-FLD1 = (' WSE-6A-T-FLD1 ')'
          logger.info("* 814*   WSE-6A-T-FLD1 = ({})", new String(methodIn.getWse6aTFld1())); 
//  DISPLAY '* 815*   WSE-6A-T-FLD2 = (' WSE-6A-T-FLD2 ')'
          logger.info("* 815*   WSE-6A-T-FLD2 = ({})", new String(methodIn.getWse6aTFld2())); 

// *
// * Src -> string; tgt -> group ; src same size as tgt; srcoffset 3
// *
//  INITIALIZE WSE-6B-S WSE-6B-T
          methodOut.setWse6bS(CONSTANTS.SPACE_60 /* Fill 60 Spaces*/);
          methodOut.getWse6bT().initialize();
//  MOVE ALL 'ABCD' TO WSE-6B-S
          methodOut.setWse6bS(CONSTANTS.LITERAL_1122147122);
//  MOVE ALL 'MNOP' TO WSE-6B-T-FLD3
          methodOut.setWse6bTFld3(CONSTANTS.LITERAL_MNOPMNOPMNOPMNOPMNOPMNOPMNOPMNOP);
//  MOVE WSE-6B-S ( 1 : LENGTH OF WSE-6B-S ) TO WSE-6B-T ( 1 : LENGTH OF WSE-6B-T )
          methodOut.getWse6bTGroup().replace(methodIn.getWse6bSGrp()/*parent*/,3/*fromOffset - (wse6bT) */,WSE_6B_S_LENGTH/*fromLen*/,0/*toOffset - (wse6bS) */,Wse6bT.getWse6bTFieldLength()/*toLen*/);

// *
//  DISPLAY '* 816* WSE-6B-S-GRP    = (' WSE-6B-S-GRP ')'
          logger.info("* 816* WSE-6B-S-GRP    = ({})", methodIn.getWse6bSGrp().toString()); 
//  DISPLAY '* 817* WSE-6B-S        = (' WSE-6B-S ')'
          logger.info("* 817* WSE-6B-S        = ({})", new String(methodOut.getWse6bS())); 
//  DISPLAY '* 818* WSE-6B-T-R      = (' WSE-6B-T-R ')'
          logger.info("* 818* WSE-6B-T-R      = ({})", new String(methodIn.getWse6bTR())); 
//  DISPLAY '* 819* WSE-6B-T        = (' WSE-6B-T ')'
          logger.info("* 819* WSE-6B-T        = ({})", methodOut.getWse6bT().toString()); 
//  DISPLAY '* 820*   WSE-6B-T-FLD1 = (' WSE-6B-T-FLD1 ')'
          logger.info("* 820*   WSE-6B-T-FLD1 = ({})", new String(methodOut.getWse6bTFld1())); 
//  DISPLAY '* 821*   WSE-6B-T-FLD2 = (' WSE-6B-T-FLD2 ')'
          logger.info("* 821*   WSE-6B-T-FLD2 = ({})", new String(methodOut.getWse6bTFld2())); 
//  DISPLAY '* 822*   WSE-6B-T-FLD3 = (' WSE-6B-T-FLD3 ')'
          logger.info("* 822*   WSE-6B-T-FLD3 = ({})", new String(methodOut.getWse6bTFld3())); 

// *
// * Src -> group; tgt -> group ; src same size as tgt ; tgt offset 5
// *
//  INITIALIZE WSE-7A-S WSE-7A-T
          methodOut.getWse7aS().initialize();
          methodOut.getWse7aT().initialize();
//  MOVE ALL 'ABCD' TO WSE-7A-S-FLD1
          methodOut.setWse7aSFld1(CONSTANTS.LITERAL_ABCDABCDABCDABCDABCDABCDABCDABCD);
//  MOVE ALL 'ZYXW' TO WSE-7A-S-FLD2
          methodOut.setWse7aSFld2(CONSTANTS.LITERAL_ZYXWZYXWZYXWZYXWZYXWZYXWZYXWZYXW);
//  MOVE WSE-7A-S ( 1 : LENGTH OF WSE-7A-S ) TO WSE-7A-T ( 1 : LENGTH OF WSE-7A-T )
          methodOut.getWse7aT().replace(methodOut.getWse7aS(),0,Wse7aS.getWse7aSFieldLength(),methodOut.getWse7aT().begin,Wse7aT.getWse7aTFieldLength() /* replace,sourceIndex,sourceLen,targetIndex,targetLen */);

// *
//  DISPLAY '* 823* WSE-7A-S        = (' WSE-7A-S ')'
          logger.info("* 823* WSE-7A-S        = ({})", methodOut.getWse7aS().toString()); 
//  DISPLAY '* 824*   WSE-7A-S-FLD1 = (' WSE-7A-S-FLD1 ')'
          logger.info("* 824*   WSE-7A-S-FLD1 = ({})", new String(methodOut.getWse7aSFld1())); 
//  DISPLAY '* 825*   WSE-7A-S-FLD2 = (' WSE-7A-S-FLD2 ')'
          logger.info("* 825*   WSE-7A-S-FLD2 = ({})", new String(methodOut.getWse7aSFld2())); 
//  DISPLAY '* 826* WSE-7A-T-GRP-R  = (' WSE-7A-T-GRP-R ')'
          logger.info("* 826* WSE-7A-T-GRP-R  = ({})", new String(methodIn.getWse7aTGrpR())); 
//  DISPLAY '* 827* WSE-7A-T-GRP    = (' WSE-7A-T-GRP ')'
          logger.info("* 827* WSE-7A-T-GRP    = ({})", methodIn.getWse7aTGrp().toString()); 
//  DISPLAY '* 828* WSE-7A-T        = (' WSE-7A-T ')'
          logger.info("* 828* WSE-7A-T        = ({})", methodOut.getWse7aT().toString()); 
//  DISPLAY '* 829*   WSE-7A-T-FLD1 = (' WSE-7A-T-FLD1 ')'
          logger.info("* 829*   WSE-7A-T-FLD1 = ({})", new String(methodOut.getWse7aTFld1())); 
//  DISPLAY '* 830*   WSE-7A-T-FLD2 = (' WSE-7A-T-FLD2 ')'
          logger.info("* 830*   WSE-7A-T-FLD2 = ({})", new String(methodOut.getWse7aTFld2())); 

// *
// * Src -> group; tgt -> group ; src same size as tgt ;tgt offset 5
// *
//  INITIALIZE WSE-7B-S WSE-7B-T
          methodOut.getWse7bS().initialize();
          methodOut.getWse7bT().initialize();
//  MOVE ALL 'ABCD' TO WSE-7B-S-FLD1
          methodOut.setWse7bSFld1(CONSTANTS.LITERAL_ABCDABCDABCDABCDABCDABCDABCDABCD);
//  MOVE ALL 'ZYXW' TO WSE-7B-S-FLD2
          methodOut.setWse7bSFld2(CONSTANTS.LITERAL_ZYXWZYXWZYXWZYXWZYXWZYXWZYXWZYXW);
//  MOVE ALL 'MNOP' TO WSE-7B-T-FLD3
          methodOut.setWse7bTFld3(CONSTANTS.LITERAL_MNOPMNOPMNOPMNOPMNOPMNOPMNOPMNOP);
//  MOVE WSE-7B-S ( 1 : LENGTH OF WSE-7B-S ) TO WSE-7B-T ( 1 : LENGTH OF WSE-7B-T )
          methodOut.getWse7bT().replace(methodOut.getWse7bS(),0,Wse7bS.getWse7bSFieldLength(),methodOut.getWse7bT().begin,Wse7bT.getWse7bTFieldLength() /* replace,sourceIndex,sourceLen,targetIndex,targetLen */);

// *
//  DISPLAY '* 831* WSE-7B-S        = (' WSE-7B-S ')'
          logger.info("* 831* WSE-7B-S        = ({})", methodOut.getWse7bS().toString()); 
//  DISPLAY '* 832*   WSE-7B-S-FLD1 = (' WSE-7B-S-FLD1 ')'
          logger.info("* 832*   WSE-7B-S-FLD1 = ({})", new String(methodOut.getWse7bSFld1())); 
//  DISPLAY '* 833*   WSE-7B-S-FLD2 = (' WSE-7B-S-FLD2 ')'
          logger.info("* 833*   WSE-7B-S-FLD2 = ({})", new String(methodOut.getWse7bSFld2())); 
//  DISPLAY '* 834* WSE-7B-T-GRP-R  = (' WSE-7B-T-GRP-R ')'
          logger.info("* 834* WSE-7B-T-GRP-R  = ({})", new String(methodIn.getWse7bTGrpR())); 
//  DISPLAY '* 835* WSE-7B-T-GRP    = (' WSE-7B-T-GRP ')'
          logger.info("* 835* WSE-7B-T-GRP    = ({})", methodIn.getWse7bTGrp().toString()); 
//  DISPLAY '* 836* WSE-7B-T        = (' WSE-7B-T ')'
          logger.info("* 836* WSE-7B-T        = ({})", methodOut.getWse7bT().toString()); 
//  DISPLAY '* 837*   WSE-7B-T-FLD1 = (' WSE-7B-T-FLD1 ')'
          logger.info("* 837*   WSE-7B-T-FLD1 = ({})", new String(methodOut.getWse7bTFld1())); 
//  DISPLAY '* 838*   WSE-7B-T-FLD2 = (' WSE-7B-T-FLD2 ')'
          logger.info("* 838*   WSE-7B-T-FLD2 = ({})", new String(methodOut.getWse7bTFld2())); 
//  DISPLAY '* 839*   WSE-7B-T-FLD3 = (' WSE-7B-T-FLD3 ')'
          logger.info("* 839*   WSE-7B-T-FLD3 = ({})", new String(methodOut.getWse7bTFld3())); 

// *
// * Src -> string; tgt -> group ; src same size as tgt ; tgtoffset 5
// *
//  INITIALIZE WSE-8A-S WSE-8A-T
          methodOut.setWse8aS(CONSTANTS.SPACE_60 /* Fill 60 Spaces*/);
          methodOut.getWse8aT().initialize();
          // MOVE ALL 'ABCD' TO WSE-8A-S
          methodOut.setWse8aS(CONSTANTS.LITERAL_1122147122);
//  MOVE WSE-8A-S ( 1 : LENGTH OF WSE-8A-S ) TO WSE-8A-T ( 1 : LENGTH OF WSE-8A-T )
          methodOut.getWse8aT().replace(methodOut.getWse8aS(),0/* wse8aS */ ,WSE_8A_S_LENGTH,methodOut.getWse8aT().begin /* wse8aT */,Wse8aT.getWse8aTFieldLength() /* replace,startIndex,targetLen */);

// *
//  DISPLAY '* 840* WSE-8A-S        = (' WSE-8A-S ')'
          logger.info("* 840* WSE-8A-S        = ({})", new String(methodOut.getWse8aS())); 
//  DISPLAY '* 841* WSE-8A-T-GRP-R  = (' WSE-8A-T-GRP-R ')'
          logger.info("* 841* WSE-8A-T-GRP-R  = ({})", new String(methodIn.getWse8aTGrpR())); 
//  DISPLAY '* 842* WSE-8A-T-GRP    = (' WSE-8A-T-GRP ')'
          logger.info("* 842* WSE-8A-T-GRP    = ({})", methodIn.getWse8aTGrp().toString()); 
//  DISPLAY '* 843* WSE-8A-T        = (' WSE-8A-T ')'
          logger.info("* 843* WSE-8A-T        = ({})", methodOut.getWse8aT().toString()); 
//  DISPLAY '* 844*   WSE-8A-T-FLD1 = (' WSE-8A-T-FLD1 ')'
          logger.info("* 844*   WSE-8A-T-FLD1 = ({})", new String(methodOut.getWse8aTFld1())); 
      
      return methodOut;
      }
      /**
      * mainlineSplit28 
      *   This method is derived from 
  *   COBOL Paragraph - MAINLINE-SPLIT28 COBOL Cyclomatic complexity - 1
      * Input  :  

      * - wse8aTFld2                     COBOL Name: WSE-8A-T-FLD2
      * - wse8bTGrpR                     COBOL Name: WSE-8B-T-GRP-R
      * - wse8bTGrp                      COBOL Name: WSE-8B-T-GRP
      * - wse9aSGrp                      COBOL Name: WSE-9A-S-GRP
      * - wse9aTGrpR                     COBOL Name: WSE-9A-T-GRP-R
      * - wse9aTGrp                      COBOL Name: WSE-9A-T-GRP
      * - wse9bSGrp                      COBOL Name: WSE-9B-S-GRP
      * - wse9bTGrpR                     COBOL Name: WSE-9B-T-GRP-R
      * - wse9bTGrp                      COBOL Name: WSE-9B-T-GRP
      * - wse10aSGrp                     COBOL Name: WSE-10A-S-GRP
      * - wse10aTGrpR                    COBOL Name: WSE-10A-T-GRP-R
      * - wse10aTGrp                     COBOL Name: WSE-10A-T-GRP
      *
      * Output :  

      * - wse8bS                         COBOL Name: WSE-8B-S
      * - wse8bT                         COBOL Name: WSE-8B-T
      * - wse8bTFld3                     COBOL Name: WSE-8B-T-FLD3
      * - wse8bTFld1                     COBOL Name: WSE-8B-T-FLD1
      * - wse8bTFld2                     COBOL Name: WSE-8B-T-FLD2
      * - wse9aS                         COBOL Name: WSE-9A-S
      * - wse9aT                         COBOL Name: WSE-9A-T
      * - wse9aSFld1                     COBOL Name: WSE-9A-S-FLD1
      * - wse9aSFld2                     COBOL Name: WSE-9A-S-FLD2
      * - wse9aTFld1                     COBOL Name: WSE-9A-T-FLD1
      * - wse9aTFld2                     COBOL Name: WSE-9A-T-FLD2
      * - wse9bS                         COBOL Name: WSE-9B-S
      * - wse9bT                         COBOL Name: WSE-9B-T
      * - wse9bSFld1                     COBOL Name: WSE-9B-S-FLD1
      * - wse9bSFld2                     COBOL Name: WSE-9B-S-FLD2
      * - wse9bTFld3                     COBOL Name: WSE-9B-T-FLD3
      * - wse9bTFld1                     COBOL Name: WSE-9B-T-FLD1
      * - wse9bTFld2                     COBOL Name: WSE-9B-T-FLD2
      * - wse10aS                        COBOL Name: WSE-10A-S
      * - wse10aT                        COBOL Name: WSE-10A-T
      * - wse10aTFld1                    COBOL Name: WSE-10A-T-FLD1
      * - wse10aTFld2                    COBOL Name: WSE-10A-T-FLD2
      * - wse10bS                        COBOL Name: WSE-10B-S
      * - wse10bT                        COBOL Name: WSE-10B-T
      *
      * @throws CFException
      */
      @Override
      public MainlineSplit28OutCtx mainlineSplit28(MainlineSplit28InCtx methodIn) throws Exception {
			// Declare local variables used in the method
			 final int WSE_8B_S_LENGTH = 60;
			 final int WSE_10A_S_LENGTH = 60;
			// End of variable declaration

Refmod1Ctx programCtx = methodIn.getRefmod1Ctx();
MainlineSplit28OutCtx methodOut = methodIn.getMainlineSplit28OutCtx();
//  DISPLAY '* 845*   WSE-8A-T-FLD2 = (' WSE-8A-T-FLD2 ')'
          logger.info("* 845*   WSE-8A-T-FLD2 = ({})", new String(methodIn.getWse8aTFld2())); 

// *
// * Src -> string; tgt -> group ; src same size as tgt; tgtoffset 5
// *
//  INITIALIZE WSE-8B-S WSE-8B-T
          methodOut.setWse8bS(CONSTANTS.SPACE_60 /* Fill 60 Spaces*/);
          methodOut.getWse8bT().initialize();
          // MOVE ALL 'ABCD' TO WSE-8B-S
          methodOut.setWse8bS(CONSTANTS.LITERAL_1122147122);
//  MOVE ALL 'MNOP' TO WSE-8B-T-FLD3
          methodOut.setWse8bTFld3(CONSTANTS.LITERAL_MNOPMNOPMNOPMNOPMNOPMNOPMNOPMNOP);
//  MOVE WSE-8B-S ( 1 : LENGTH OF WSE-8B-S ) TO WSE-8B-T ( 1 : LENGTH OF WSE-8B-T )
          methodOut.getWse8bT().replace(methodOut.getWse8bS(),0/* wse8bS */ ,WSE_8B_S_LENGTH,methodOut.getWse8bT().begin /* wse8bT */,Wse8bT.getWse8bTFieldLength() /* replace,startIndex,targetLen */);

// *
//  DISPLAY '* 846* WSE-8B-S        = (' WSE-8B-S ')'
          logger.info("* 846* WSE-8B-S        = ({})", new String(methodOut.getWse8bS())); 
//  DISPLAY '* 847* WSE-8B-T-GRP-R  = (' WSE-8B-T-GRP-R ')'
          logger.info("* 847* WSE-8B-T-GRP-R  = ({})", new String(methodIn.getWse8bTGrpR())); 
//  DISPLAY '* 848* WSE-8B-T-GRP    = (' WSE-8B-T-GRP ')'
          logger.info("* 848* WSE-8B-T-GRP    = ({})", methodIn.getWse8bTGrp().toString()); 
//  DISPLAY '* 849* WSE-8B-T        = (' WSE-8B-T ')'
          logger.info("* 849* WSE-8B-T        = ({})", methodOut.getWse8bT().toString()); 
//  DISPLAY '* 850*   WSE-8B-T-FLD1 = (' WSE-8B-T-FLD1 ')'
          logger.info("* 850*   WSE-8B-T-FLD1 = ({})", new String(methodOut.getWse8bTFld1())); 
//  DISPLAY '* 851*   WSE-8B-T-FLD2 = (' WSE-8B-T-FLD2 ')'
          logger.info("* 851*   WSE-8B-T-FLD2 = ({})", new String(methodOut.getWse8bTFld2())); 
//  DISPLAY '* 852*   WSE-8B-T-FLD3 = (' WSE-8B-T-FLD3 ')'
          logger.info("* 852*   WSE-8B-T-FLD3 = ({})", new String(methodOut.getWse8bTFld3())); 

// *
// * Src -> group; tgt -> group ; src same size as tgt
// * source offset 3 ; target offset 5
// *
//  INITIALIZE WSE-9A-S WSE-9A-T
          methodOut.getWse9aS().initialize();
          methodOut.getWse9aT().initialize();
//  MOVE ALL 'ABCD' TO WSE-9A-S-FLD1
          methodOut.setWse9aSFld1(CONSTANTS.LITERAL_ABCDABCDABCDABCDABCDABCDABCDABCD);
//  MOVE ALL 'ZYXW' TO WSE-9A-S-FLD2
          methodOut.setWse9aSFld2(CONSTANTS.LITERAL_ZYXWZYXWZYXWZYXWZYXWZYXWZYXWZYXW);
//  MOVE WSE-9A-S ( 1 : LENGTH OF WSE-9A-S ) TO WSE-9A-T ( 1 : LENGTH OF WSE-9A-T )
          methodOut.getWse9aTGrpGroup().replace(methodIn.getWse9aSGrp()/*parent*/,3/*fromOffset - (wse9aT) */,Wse9aS.getWse9aSFieldLength()/*fromLen*/,5/*toOffset - (wse9aS) */,Wse9aT.getWse9aTFieldLength()/*toLen*/);

// *
//  DISPLAY '* 853* WSE-9A-S-GRP    = (' WSE-9A-S-GRP ')'
          logger.info("* 853* WSE-9A-S-GRP    = ({})", methodIn.getWse9aSGrp().toString()); 
//  DISPLAY '* 854* WSE-9A-S        = (' WSE-9A-S ')'
          logger.info("* 854* WSE-9A-S        = ({})", methodOut.getWse9aS().toString()); 
//  DISPLAY '* 855*   WSE-9A-S-FLD1 = (' WSE-9A-S-FLD1 ')'
          logger.info("* 855*   WSE-9A-S-FLD1 = ({})", new String(methodOut.getWse9aSFld1())); 
//  DISPLAY '* 856*   WSE-9A-S-FLD2 = (' WSE-9A-S-FLD2 ')'
          logger.info("* 856*   WSE-9A-S-FLD2 = ({})", new String(methodOut.getWse9aSFld2())); 
//  DISPLAY '* 857* WSE-9A-T-GRP-R  = (' WSE-9A-T-GRP-R ')'
          logger.info("* 857* WSE-9A-T-GRP-R  = ({})", new String(methodIn.getWse9aTGrpR())); 
//  DISPLAY '* 858* WSE-9A-T-GRP    = (' WSE-9A-T-GRP ')'
          logger.info("* 858* WSE-9A-T-GRP    = ({})", methodIn.getWse9aTGrp().toString()); 
//  DISPLAY '* 859* WSE-9A-T        = (' WSE-9A-T ')'
          logger.info("* 859* WSE-9A-T        = ({})", methodOut.getWse9aT().toString()); 
//  DISPLAY '* 860*   WSE-9A-T-FLD1 = (' WSE-9A-T-FLD1 ')'
          logger.info("* 860*   WSE-9A-T-FLD1 = ({})", new String(methodOut.getWse9aTFld1())); 
//  DISPLAY '* 861*   WSE-9A-T-FLD2 = (' WSE-9A-T-FLD2 ')'
          logger.info("* 861*   WSE-9A-T-FLD2 = ({})", new String(methodOut.getWse9aTFld2())); 

// *
// * Src -> group; tgt -> group ; src same size as tgt
// * source offset 3 ; target offset 5
// *
//  INITIALIZE WSE-9B-S WSE-9B-T
          methodOut.getWse9bS().initialize();
          methodOut.getWse9bT().initialize();
//  MOVE ALL 'ABCD' TO WSE-9B-S-FLD1
          methodOut.setWse9bSFld1(CONSTANTS.LITERAL_ABCDABCDABCDABCDABCDABCDABCDABCD);
//  MOVE ALL 'ZYXW' TO WSE-9B-S-FLD2
          methodOut.setWse9bSFld2(CONSTANTS.LITERAL_ZYXWZYXWZYXWZYXWZYXWZYXWZYXWZYXW);
//  MOVE ALL 'MNOP' TO WSE-9B-T-FLD3
          methodOut.setWse9bTFld3(CONSTANTS.LITERAL_MNOPMNOPMNOPMNOPMNOPMNOPMNOPMNOP);
//  MOVE WSE-9B-S ( 1 : LENGTH OF WSE-9B-S ) TO WSE-9B-T ( 1 : LENGTH OF WSE-9B-T )
          methodOut.getWse9bTGrpGroup().replace(methodIn.getWse9bSGrp()/*parent*/,3/*fromOffset - (wse9bT) */,Wse9bS.getWse9bSFieldLength()/*fromLen*/,5/*toOffset - (wse9bS) */,Wse9bT.getWse9bTFieldLength()/*toLen*/);

// *
//  DISPLAY '* 862* WSE-9B-S-GRP    = (' WSE-9B-S-GRP ')'
          logger.info("* 862* WSE-9B-S-GRP    = ({})", methodIn.getWse9bSGrp().toString()); 
//  DISPLAY '* 863* WSE-9B-S        = (' WSE-9B-S ')'
          logger.info("* 863* WSE-9B-S        = ({})", methodOut.getWse9bS().toString()); 
//  DISPLAY '* 864*   WSE-9B-S-FLD1 = (' WSE-9B-S-FLD1 ')'
          logger.info("* 864*   WSE-9B-S-FLD1 = ({})", new String(methodOut.getWse9bSFld1())); 
//  DISPLAY '* 865*   WSE-9B-S-FLD2 = (' WSE-9B-S-FLD2 ')'
          logger.info("* 865*   WSE-9B-S-FLD2 = ({})", new String(methodOut.getWse9bSFld2())); 
//  DISPLAY '* 866* WSE-9B-T-GRP-R  = (' WSE-9B-T-GRP-R ')'
          logger.info("* 866* WSE-9B-T-GRP-R  = ({})", new String(methodIn.getWse9bTGrpR())); 
//  DISPLAY '* 867* WSE-9B-T-GRP    = (' WSE-9B-T-GRP ')'
          logger.info("* 867* WSE-9B-T-GRP    = ({})", methodIn.getWse9bTGrp().toString()); 
//  DISPLAY '* 868* WSE-9B-T        = (' WSE-9B-T ')'
          logger.info("* 868* WSE-9B-T        = ({})", methodOut.getWse9bT().toString()); 
//  DISPLAY '* 869*   WSE-9B-T-FLD1 = (' WSE-9B-T-FLD1 ')'
          logger.info("* 869*   WSE-9B-T-FLD1 = ({})", new String(methodOut.getWse9bTFld1())); 
//  DISPLAY '* 870*   WSE-9B-T-FLD2 = (' WSE-9B-T-FLD2 ')'
          logger.info("* 870*   WSE-9B-T-FLD2 = ({})", new String(methodOut.getWse9bTFld2())); 
//  DISPLAY '* 871*   WSE-9B-T-FLD3 = (' WSE-9B-T-FLD3 ')'
          logger.info("* 871*   WSE-9B-T-FLD3 = ({})", new String(methodOut.getWse9bTFld3())); 

// *
// * Src -> string; tgt -> group ; src same size as tgt
// * source offset 3 ; target offset 5
// *
//  INITIALIZE WSE-10A-S WSE-10A-T
          methodOut.setWse10aS(CONSTANTS.SPACE_60 /* Fill 60 Spaces*/);
          methodOut.getWse10aT().initialize();
//  MOVE ALL 'ABCD' TO WSE-10A-S
          methodOut.setWse10aS(CONSTANTS.LITERAL_1122147122);
//  MOVE WSE-10A-S ( 1 : LENGTH OF WSE-10A-S ) TO WSE-10A-T ( 1 : LENGTH OF WSE-10A-T )
          methodOut.getWse10aTGrpGroup().replace(methodIn.getWse10aSGrp()/*parent*/,3/*fromOffset - (wse10aT) */,WSE_10A_S_LENGTH/*fromLen*/,5/*toOffset - (wse10aS) */,Wse10aT.getWse10aTFieldLength()/*toLen*/);

// *
//  DISPLAY '* 872* WSE-10A-S-GRP   = (' WSE-10A-S-GRP ')'
          logger.info("* 872* WSE-10A-S-GRP   = ({})", methodIn.getWse10aSGrp().toString()); 
//  DISPLAY '* 873* WSE-10A-S       = (' WSE-10A-S ')'
          logger.info("* 873* WSE-10A-S       = ({})", new String(methodOut.getWse10aS())); 
//  DISPLAY '* 874* WSE-10A-T-GRP-R = (' WSE-10A-T-GRP-R ')'
          logger.info("* 874* WSE-10A-T-GRP-R = ({})", new String(methodIn.getWse10aTGrpR())); 
//  DISPLAY '* 875* WSE-10A-T-GRP   = (' WSE-10A-T-GRP ')'
          logger.info("* 875* WSE-10A-T-GRP   = ({})", methodIn.getWse10aTGrp().toString()); 
//  DISPLAY '* 876* WSE-10A-T       = (' WSE-10A-T ')'
          logger.info("* 876* WSE-10A-T       = ({})", methodOut.getWse10aT().toString()); 
//  DISPLAY '* 877*   WSE-10A-T-FLD1= (' WSE-10A-T-FLD1 ')'
          logger.info("* 877*   WSE-10A-T-FLD1= ({})", new String(methodOut.getWse10aTFld1())); 
//  DISPLAY '* 878*   WSE-10A-T-FLD2= (' WSE-10A-T-FLD2 ')'
          logger.info("* 878*   WSE-10A-T-FLD2= ({})", new String(methodOut.getWse10aTFld2())); 

// *
// * Src -> string; tgt -> group ; src same size as tgt
// * source offset 3 ; target offset 5
// *
//  INITIALIZE WSE-10B-S WSE-10B-T
          methodOut.setWse10bS(CONSTANTS.SPACE_60 /* Fill 60 Spaces*/);
          methodOut.getWse10bT().initialize();
      
      return methodOut;
      }
      /**
      * mainlineSplit29 
      *   This method is derived from 
  *   COBOL Paragraph - MAINLINE-SPLIT29 COBOL Cyclomatic complexity - 1
      * Input  :  

      * - wse10bSGrp                     COBOL Name: WSE-10B-S-GRP
      * - wse10bTGrpR                    COBOL Name: WSE-10B-T-GRP-R
      * - wse10bTGrp                     COBOL Name: WSE-10B-T-GRP
      * - wse11aTGrpR                    COBOL Name: WSE-11A-T-GRP-R
      * - wse11aTGrp                     COBOL Name: WSE-11A-T-GRP
      * - wse11bTGrpR                    COBOL Name: WSE-11B-T-GRP-R
      * - wse11bTGrp                     COBOL Name: WSE-11B-T-GRP
      * - wse12aTGrpR                    COBOL Name: WSE-12A-T-GRP-R
      * - wse12aTGrp                     COBOL Name: WSE-12A-T-GRP
      *
      * Output :  

      * - wse10bS                        COBOL Name: WSE-10B-S
      * - wse10bTFld3                    COBOL Name: WSE-10B-T-FLD3
      * - wse10bT                        COBOL Name: WSE-10B-T
      * - wse10bTFld1                    COBOL Name: WSE-10B-T-FLD1
      * - wse10bTFld2                    COBOL Name: WSE-10B-T-FLD2
      * - wse11aS                        COBOL Name: WSE-11A-S
      * - wse11aT                        COBOL Name: WSE-11A-T
      * - wse11aSFld1                    COBOL Name: WSE-11A-S-FLD1
      * - wse11aSFld2                    COBOL Name: WSE-11A-S-FLD2
      * - wse11aTFld1                    COBOL Name: WSE-11A-T-FLD1
      * - wse11aTFld2                    COBOL Name: WSE-11A-T-FLD2
      * - wse11bS                        COBOL Name: WSE-11B-S
      * - wse11bT                        COBOL Name: WSE-11B-T
      * - wse11bSFld1                    COBOL Name: WSE-11B-S-FLD1
      * - wse11bSFld2                    COBOL Name: WSE-11B-S-FLD2
      * - wse11bTFld3                    COBOL Name: WSE-11B-T-FLD3
      * - wse11bTFld1                    COBOL Name: WSE-11B-T-FLD1
      * - wse11bTFld2                    COBOL Name: WSE-11B-T-FLD2
      * - wse12aS                        COBOL Name: WSE-12A-S
      * - wse12aT                        COBOL Name: WSE-12A-T
      * - wse12aTFld1                    COBOL Name: WSE-12A-T-FLD1
      * - wse12aTFld2                    COBOL Name: WSE-12A-T-FLD2
      * - wse12bS                        COBOL Name: WSE-12B-S
      * - wse12bT                        COBOL Name: WSE-12B-T
      * - wse12bTFld3                    COBOL Name: WSE-12B-T-FLD3
      *
      * @throws CFException
      */
      @Override
      public MainlineSplit29OutCtx mainlineSplit29(MainlineSplit29InCtx methodIn) throws Exception {
			// Declare local variables used in the method
			 final int WSE_10B_S_LENGTH = 60;
			// End of variable declaration

Refmod1Ctx programCtx = methodIn.getRefmod1Ctx();
MainlineSplit29OutCtx methodOut = methodIn.getMainlineSplit29OutCtx();
//  MOVE ALL 'ABCD' TO WSE-10B-S
          methodOut.setWse10bS(CONSTANTS.LITERAL_1122147122);
//  MOVE ALL 'MNOP' TO WSE-10B-T-FLD3
          methodOut.setWse10bTFld3(CONSTANTS.LITERAL_MNOPMNOPMNOPMNOPMNOPMNOPMNOPMNOP);
//  MOVE WSE-10B-S ( 1 : LENGTH OF WSE-10B-S ) TO WSE-10B-T ( 1 : LENGTH OF WSE-10B-T )
          methodOut.getWse10bTGrpGroup().replace(methodIn.getWse10bSGrp()/*parent*/,3/*fromOffset - (wse10bT) */,WSE_10B_S_LENGTH/*fromLen*/,5/*toOffset - (wse10bS) */,Wse10bT.getWse10bTFieldLength()/*toLen*/);

// *
//  DISPLAY '* 879* WSE-10B-S-GRP   = (' WSE-10B-S-GRP ')'
          logger.info("* 879* WSE-10B-S-GRP   = ({})", methodIn.getWse10bSGrp().toString()); 
//  DISPLAY '* 880* WSE-10B-S       = (' WSE-10B-S ')'
          logger.info("* 880* WSE-10B-S       = ({})", new String(methodOut.getWse10bS())); 
//  DISPLAY '* 881* WSE-10B-T-GRP-R = (' WSE-10B-T-GRP-R ')'
          logger.info("* 881* WSE-10B-T-GRP-R = ({})", new String(methodIn.getWse10bTGrpR())); 
//  DISPLAY '* 882* WSE-10B-T-GRP   = (' WSE-10B-T-GRP ')'
          logger.info("* 882* WSE-10B-T-GRP   = ({})", methodIn.getWse10bTGrp().toString()); 
//  DISPLAY '* 883* WSE-10B-T       = (' WSE-10B-T ')'
          logger.info("* 883* WSE-10B-T       = ({})", methodOut.getWse10bT().toString()); 
//  DISPLAY '* 884*   WSE-10B-T-FLD1= (' WSE-10B-T-FLD1 ')'
          logger.info("* 884*   WSE-10B-T-FLD1= ({})", new String(methodOut.getWse10bTFld1())); 
//  DISPLAY '* 885*   WSE-10B-T-FLD2= (' WSE-10B-T-FLD2 ')'
          logger.info("* 885*   WSE-10B-T-FLD2= ({})", new String(methodOut.getWse10bTFld2())); 
//  DISPLAY '* 886*   WSE-10B-T-FLD3= (' WSE-10B-T-FLD3 ')'
          logger.info("* 886*   WSE-10B-T-FLD3= ({})", new String(methodOut.getWse10bTFld3())); 

// *
// * Src -> group; tgt -> group ; src same size as tgt
// *    src not refmod;target offset 5
// *
//  INITIALIZE WSE-11A-S WSE-11A-T
          methodOut.getWse11aS().initialize();
          methodOut.getWse11aT().initialize();
//  MOVE ALL 'ABCD' TO WSE-11A-S-FLD1
          methodOut.setWse11aSFld1(CONSTANTS.LITERAL_ABCDABCDABCDABCDABCDABCDABCDABCD);
//  MOVE ALL 'ZYXW' TO WSE-11A-S-FLD2
          methodOut.setWse11aSFld2(CONSTANTS.LITERAL_ZYXWZYXWZYXWZYXWZYXWZYXWZYXWZYXW);
//  MOVE WSE-11A-S TO WSE-11A-T ( 1 : LENGTH OF WSE-11A-T )
          methodOut.getWse11aT().replace(methodOut.getWse11aS().getCharArray(),0,methodOut.getWse11aS().length(),methodOut.getWse11aT().begin,Wse11aT.getWse11aTFieldLength() /* replace,sourceIndex,sourceLen,targetIndex,targetLen */);

// *
//  DISPLAY '* 887* WSE-11A-S       = (' WSE-11A-S ')'
          logger.info("* 887* WSE-11A-S       = ({})", methodOut.getWse11aS().toString()); 
//  DISPLAY '* 888*   WSE-11A-S-FLD1= (' WSE-11A-S-FLD1 ')'
          logger.info("* 888*   WSE-11A-S-FLD1= ({})", new String(methodOut.getWse11aSFld1())); 
//  DISPLAY '* 889*   WSE-11A-S-FLD2= (' WSE-11A-S-FLD2 ')'
          logger.info("* 889*   WSE-11A-S-FLD2= ({})", new String(methodOut.getWse11aSFld2())); 
//  DISPLAY '* 890* WSE-11A-T-GRP-R = (' WSE-11A-T-GRP-R ')'
          logger.info("* 890* WSE-11A-T-GRP-R = ({})", new String(methodIn.getWse11aTGrpR())); 
//  DISPLAY '* 891* WSE-11A-T-GRP   = (' WSE-11A-T-GRP ')'
          logger.info("* 891* WSE-11A-T-GRP   = ({})", methodIn.getWse11aTGrp().toString()); 
//  DISPLAY '* 892* WSE-11A-T       = (' WSE-11A-T ')'
          logger.info("* 892* WSE-11A-T       = ({})", methodOut.getWse11aT().toString()); 
//  DISPLAY '* 893*   WSE-11A-T-FLD1= (' WSE-11A-T-FLD1 ')'
          logger.info("* 893*   WSE-11A-T-FLD1= ({})", new String(methodOut.getWse11aTFld1())); 
//  DISPLAY '* 894*   WSE-11A-T-FLD2= (' WSE-11A-T-FLD2 ')'
          logger.info("* 894*   WSE-11A-T-FLD2= ({})", new String(methodOut.getWse11aTFld2())); 

// *
// * Src -> group; tgt -> group ; src same size as tgt
// *    src not refmod;target offset 5
// *
//  INITIALIZE WSE-11B-S WSE-11B-T
          methodOut.getWse11bS().initialize();
          methodOut.getWse11bT().initialize();
//  MOVE ALL 'ABCD' TO WSE-11B-S-FLD1
          methodOut.setWse11bSFld1(CONSTANTS.LITERAL_ABCDABCDABCDABCDABCDABCDABCDABCD);
//  MOVE ALL 'ZYXW' TO WSE-11B-S-FLD2
          methodOut.setWse11bSFld2(CONSTANTS.LITERAL_ZYXWZYXWZYXWZYXWZYXWZYXWZYXWZYXW);
//  MOVE ALL 'MNOP' TO WSE-11B-T-FLD3
          methodOut.setWse11bTFld3(CONSTANTS.LITERAL_MNOPMNOPMNOPMNOPMNOPMNOPMNOPMNOP);
//  MOVE WSE-11B-S TO WSE-11B-T ( 1 : LENGTH OF WSE-11B-T )
          methodOut.getWse11bT().replace(methodOut.getWse11bS().getCharArray(),0,methodOut.getWse11bS().length(),methodOut.getWse11bT().begin,Wse11bT.getWse11bTFieldLength() /* replace,sourceIndex,sourceLen,targetIndex,targetLen */);

// *
//  DISPLAY '* 895* WSE-11B-S       = (' WSE-11B-S ')'
          logger.info("* 895* WSE-11B-S       = ({})", methodOut.getWse11bS().toString()); 
//  DISPLAY '* 896*   WSE-11B-S-FLD1= (' WSE-11B-S-FLD1 ')'
          logger.info("* 896*   WSE-11B-S-FLD1= ({})", new String(methodOut.getWse11bSFld1())); 
//  DISPLAY '* 897*   WSE-11B-S-FLD2= (' WSE-11B-S-FLD2 ')'
          logger.info("* 897*   WSE-11B-S-FLD2= ({})", new String(methodOut.getWse11bSFld2())); 
//  DISPLAY '* 898* WSE-11B-T-GRP-R = (' WSE-11B-T-GRP-R ')'
          logger.info("* 898* WSE-11B-T-GRP-R = ({})", new String(methodIn.getWse11bTGrpR())); 
//  DISPLAY '* 899* WSE-11B-T-GRP   = (' WSE-11B-T-GRP ')'
          logger.info("* 899* WSE-11B-T-GRP   = ({})", methodIn.getWse11bTGrp().toString()); 
//  DISPLAY '* 900* WSE-11B-T       = (' WSE-11B-T ')'
          logger.info("* 900* WSE-11B-T       = ({})", methodOut.getWse11bT().toString()); 
//  DISPLAY '* 901*   WSE-11B-T-FLD1= (' WSE-11B-T-FLD1 ')'
          logger.info("* 901*   WSE-11B-T-FLD1= ({})", new String(methodOut.getWse11bTFld1())); 
//  DISPLAY '* 902*   WSE-11B-T-FLD2= (' WSE-11B-T-FLD2 ')'
          logger.info("* 902*   WSE-11B-T-FLD2= ({})", new String(methodOut.getWse11bTFld2())); 
//  DISPLAY '* 903*   WSE-11B-T-FLD3= (' WSE-11B-T-FLD3 ')'
          logger.info("* 903*   WSE-11B-T-FLD3= ({})", new String(methodOut.getWse11bTFld3())); 

// *
// * Src -> string; tgt -> group ; src same size as tgt
// *    src not refmod;target offset 5
// *
//  INITIALIZE WSE-12A-S WSE-12A-T
          methodOut.setWse12aS(CONSTANTS.SPACE_60 /* Fill 60 Spaces*/);
          methodOut.getWse12aT().initialize();
          // MOVE ALL 'ABCD' TO WSE-12A-S
          methodOut.setWse12aS(CONSTANTS.LITERAL_1122147122);
//  MOVE WSE-12A-S TO WSE-12A-T ( 1 : LENGTH OF WSE-12A-T )
          methodOut.getWse12aT().replace(methodOut.getWse12aS(),0,methodOut.getWse12aS().length,methodOut.getWse12aT().begin /* wse12aT */,Wse12aT.getWse12aTFieldLength() /* replace,sourceIndex,sourceLen,targetIndex,targetLen */);

// *
//  DISPLAY '* 904* WSE-12A-S       = (' WSE-12A-S ')'
          logger.info("* 904* WSE-12A-S       = ({})", new String(methodOut.getWse12aS())); 
//  DISPLAY '* 905* WSE-12A-T-GRP-R = (' WSE-12A-T-GRP-R ')'
          logger.info("* 905* WSE-12A-T-GRP-R = ({})", new String(methodIn.getWse12aTGrpR())); 
//  DISPLAY '* 906* WSE-12A-T-GRP   = (' WSE-12A-T-GRP ')'
          logger.info("* 906* WSE-12A-T-GRP   = ({})", methodIn.getWse12aTGrp().toString()); 
//  DISPLAY '* 907* WSE-12A-T       = (' WSE-12A-T ')'
          logger.info("* 907* WSE-12A-T       = ({})", methodOut.getWse12aT().toString()); 
//  DISPLAY '* 908*   WSE-12A-T-FLD1= (' WSE-12A-T-FLD1 ')'
          logger.info("* 908*   WSE-12A-T-FLD1= ({})", new String(methodOut.getWse12aTFld1())); 
//  DISPLAY '* 909*   WSE-12A-T-FLD2= (' WSE-12A-T-FLD2 ')'
          logger.info("* 909*   WSE-12A-T-FLD2= ({})", new String(methodOut.getWse12aTFld2())); 

// *
// * Src -> string; tgt -> group ; src same size as tgt
// *    src not refmod;target offset 5
// *
//  INITIALIZE WSE-12B-S WSE-12B-T
          methodOut.setWse12bS(CONSTANTS.SPACE_60 /* Fill 60 Spaces*/);
          methodOut.getWse12bT().initialize();
          // MOVE ALL 'ABCD' TO WSE-12B-S
          methodOut.setWse12bS(CONSTANTS.LITERAL_1122147122);
//  MOVE ALL 'MNOP' TO WSE-12B-T-FLD3
          methodOut.setWse12bTFld3(CONSTANTS.LITERAL_MNOPMNOPMNOPMNOPMNOPMNOPMNOPMNOP);
//  MOVE WSE-12B-S TO WSE-12B-T ( 1 : LENGTH OF WSE-12B-T )
          methodOut.getWse12bT().replace(methodOut.getWse12bS(),0,methodOut.getWse12bS().length,methodOut.getWse12bT().begin /* wse12bT */,Wse12bT.getWse12bTFieldLength() /* replace,sourceIndex,sourceLen,targetIndex,targetLen */);

// *
//  DISPLAY '* 910* WSE-12B-S       = (' WSE-12B-S ')'
          logger.info("* 910* WSE-12B-S       = ({})", new String(methodOut.getWse12bS())); 
      
      return methodOut;
      }
      /**
      * mainlineSplit30 
      *   This method is derived from 
  *   COBOL Paragraph - MAINLINE-SPLIT30 COBOL Cyclomatic complexity - 1
      * Input  :  

      * - wse12bTGrpR                    COBOL Name: WSE-12B-T-GRP-R
      * - wse12bTGrp                     COBOL Name: WSE-12B-T-GRP
      * - wse12bT                        COBOL Name: WSE-12B-T
      * - wse12bTFld1                    COBOL Name: WSE-12B-T-FLD1
      * - wse12bTFld2                    COBOL Name: WSE-12B-T-FLD2
      * - wse12bTFld3                    COBOL Name: WSE-12B-T-FLD3
      * - wse13aSGrp                     COBOL Name: WSE-13A-S-GRP
      * - wse13aTGrpR                    COBOL Name: WSE-13A-T-GRP-R
      * - wse13aTGrp                     COBOL Name: WSE-13A-T-GRP
      * - wse13bSGrp                     COBOL Name: WSE-13B-S-GRP
      * - wse13bTGrpR                    COBOL Name: WSE-13B-T-GRP-R
      * - wse13bTGrp                     COBOL Name: WSE-13B-T-GRP
      * - wse14aSGrp                     COBOL Name: WSE-14A-S-GRP
      * - wse14aTGrpR                    COBOL Name: WSE-14A-T-GRP-R
      * - wse14aTGrp                     COBOL Name: WSE-14A-T-GRP
      * - wse14bSGrp                     COBOL Name: WSE-14B-S-GRP
      * - wse14bTGrpR                    COBOL Name: WSE-14B-T-GRP-R
      *
      * Output :  

      * - wse13aS                        COBOL Name: WSE-13A-S
      * - wse13aT                        COBOL Name: WSE-13A-T
      * - wse13aSFld1                    COBOL Name: WSE-13A-S-FLD1
      * - wse13aSFld2                    COBOL Name: WSE-13A-S-FLD2
      * - wse13aTFld1                    COBOL Name: WSE-13A-T-FLD1
      * - wse13aTFld2                    COBOL Name: WSE-13A-T-FLD2
      * - wse13bS                        COBOL Name: WSE-13B-S
      * - wse13bT                        COBOL Name: WSE-13B-T
      * - wse13bSFld1                    COBOL Name: WSE-13B-S-FLD1
      * - wse13bSFld2                    COBOL Name: WSE-13B-S-FLD2
      * - wse13bTFld3                    COBOL Name: WSE-13B-T-FLD3
      * - wse13bTFld1                    COBOL Name: WSE-13B-T-FLD1
      * - wse13bTFld2                    COBOL Name: WSE-13B-T-FLD2
      * - wse14aS                        COBOL Name: WSE-14A-S
      * - wse14aT                        COBOL Name: WSE-14A-T
      * - wse14aTFld1                    COBOL Name: WSE-14A-T-FLD1
      * - wse14aTFld2                    COBOL Name: WSE-14A-T-FLD2
      * - wse14bS                        COBOL Name: WSE-14B-S
      * - wse14bT                        COBOL Name: WSE-14B-T
      * - wse14bTFld3                    COBOL Name: WSE-14B-T-FLD3
      *
      * @throws CFException
      */
      @Override
      public MainlineSplit30OutCtx mainlineSplit30(MainlineSplit30InCtx methodIn) throws Exception {
			// Declare local variables used in the method
			 final int WSE_14A_S_LENGTH = 60;
			 final int WSE_14B_S_LENGTH = 60;
			// End of variable declaration

Refmod1Ctx programCtx = methodIn.getRefmod1Ctx();
MainlineSplit30OutCtx methodOut = methodIn.getMainlineSplit30OutCtx();
//  DISPLAY '* 911* WSE-12B-T-GRP-R = (' WSE-12B-T-GRP-R ')'
          logger.info("* 911* WSE-12B-T-GRP-R = ({})", new String(methodIn.getWse12bTGrpR())); 
//  DISPLAY '* 912* WSE-12B-T-GRP   = (' WSE-12B-T-GRP ')'
          logger.info("* 912* WSE-12B-T-GRP   = ({})", methodIn.getWse12bTGrp().toString()); 
//  DISPLAY '* 913* WSE-12B-T       = (' WSE-12B-T ')'
          logger.info("* 913* WSE-12B-T       = ({})", methodIn.getWse12bT().toString()); 
//  DISPLAY '* 914*   WSE-12B-T-FLD1= (' WSE-12B-T-FLD1 ')'
          logger.info("* 914*   WSE-12B-T-FLD1= ({})", new String(methodIn.getWse12bTFld1())); 
//  DISPLAY '* 915*   WSE-12B-T-FLD2= (' WSE-12B-T-FLD2 ')'
          logger.info("* 915*   WSE-12B-T-FLD2= ({})", new String(methodIn.getWse12bTFld2())); 
//  DISPLAY '* 916*   WSE-12B-T-FLD3= (' WSE-12B-T-FLD3 ')'
          logger.info("* 916*   WSE-12B-T-FLD3= ({})", new String(methodIn.getWse12bTFld3())); 

// *
// * Src -> group; tgt -> group ; src same size as tgt
// *    src offset 3  ;target offset 5
// *
//  INITIALIZE WSE-13A-S WSE-13A-T
          methodOut.getWse13aS().initialize();
          methodOut.getWse13aT().initialize();
//  MOVE ALL 'ABCD' TO WSE-13A-S-FLD1
          methodOut.setWse13aSFld1(CONSTANTS.LITERAL_ABCDABCDABCDABCDABCDABCDABCDABCD);
//  MOVE ALL 'ZYXW' TO WSE-13A-S-FLD2
          methodOut.setWse13aSFld2(CONSTANTS.LITERAL_ZYXWZYXWZYXWZYXWZYXWZYXWZYXWZYXW);
//  MOVE WSE-13A-S ( 3 : LENGTH OF WSE-13A-S - 3 ) TO WSE-13A-T ( 5 : LENGTH OF WSE-13A-T - 5)
          methodOut.getWse13aTGrpGroup().replace(methodIn.getWse13aSGrp()/*parent*/,3+3 - 1/*fromOffset - (wse13aT) */,Wse13aS.getWse13aSFieldLength() - 3/*fromLen*/,5+5 - 1/*toOffset - (wse13aS) */,Wse13aT.getWse13aTFieldLength() - 5/*toLen*/);

// *
//  DISPLAY '* 917* WSE-13A-S-GRP   = (' WSE-13A-S-GRP ')'
          logger.info("* 917* WSE-13A-S-GRP   = ({})", methodIn.getWse13aSGrp().toString()); 
//  DISPLAY '* 918* WSE-13A-S       = (' WSE-13A-S ')'
          logger.info("* 918* WSE-13A-S       = ({})", methodOut.getWse13aS().toString()); 
//  DISPLAY '* 919*   WSE-13A-S-FLD1= (' WSE-13A-S-FLD1 ')'
          logger.info("* 919*   WSE-13A-S-FLD1= ({})", new String(methodOut.getWse13aSFld1())); 
//  DISPLAY '* 920*   WSE-13A-S-FLD2= (' WSE-13A-S-FLD2 ')'
          logger.info("* 920*   WSE-13A-S-FLD2= ({})", new String(methodOut.getWse13aSFld2())); 
//  DISPLAY '* 921* WSE-13A-T-GRP-R = (' WSE-13A-T-GRP-R ')'
          logger.info("* 921* WSE-13A-T-GRP-R = ({})", new String(methodIn.getWse13aTGrpR())); 
//  DISPLAY '* 922* WSE-13A-T-GRP   = (' WSE-13A-T-GRP ')'
          logger.info("* 922* WSE-13A-T-GRP   = ({})", methodIn.getWse13aTGrp().toString()); 
//  DISPLAY '* 923* WSE-13A-T       = (' WSE-13A-T ')'
          logger.info("* 923* WSE-13A-T       = ({})", methodOut.getWse13aT().toString()); 
//  DISPLAY '* 924*   WSE-13A-T-FLD1= (' WSE-13A-T-FLD1 ')'
          logger.info("* 924*   WSE-13A-T-FLD1= ({})", new String(methodOut.getWse13aTFld1())); 
//  DISPLAY '* 925*   WSE-13A-T-FLD2= (' WSE-13A-T-FLD2 ')'
          logger.info("* 925*   WSE-13A-T-FLD2= ({})", new String(methodOut.getWse13aTFld2())); 

// *
// * Src -> group; tgt -> group ; src same size as tgt
// *    src offset 3  ;target offset 5
// *
//  INITIALIZE WSE-13B-S WSE-13B-T
          methodOut.getWse13bS().initialize();
          methodOut.getWse13bT().initialize();
//  MOVE ALL 'ABCD' TO WSE-13B-S-FLD1
          methodOut.setWse13bSFld1(CONSTANTS.LITERAL_ABCDABCDABCDABCDABCDABCDABCDABCD);
//  MOVE ALL 'ZYXW' TO WSE-13B-S-FLD2
          methodOut.setWse13bSFld2(CONSTANTS.LITERAL_ZYXWZYXWZYXWZYXWZYXWZYXWZYXWZYXW);
//  MOVE ALL 'MNOP' TO WSE-13B-T-FLD3
          methodOut.setWse13bTFld3(CONSTANTS.LITERAL_MNOPMNOPMNOPMNOPMNOPMNOPMNOPMNOP);
//  MOVE WSE-13B-S ( 3 : LENGTH OF WSE-13B-S - 3 ) TO WSE-13B-T ( 5 : LENGTH OF WSE-13B-T - 5)
          methodOut.getWse13bTGrpGroup().replace(methodIn.getWse13bSGrp()/*parent*/,3+3 - 1/*fromOffset - (wse13bT) */,Wse13bS.getWse13bSFieldLength() - 3/*fromLen*/,5+5 - 1/*toOffset - (wse13bS) */,Wse13bT.getWse13bTFieldLength() - 5/*toLen*/);

// *
//  DISPLAY '* 926* WSE-13B-S-GRP   = (' WSE-13B-S-GRP ')'
          logger.info("* 926* WSE-13B-S-GRP   = ({})", methodIn.getWse13bSGrp().toString()); 
//  DISPLAY '* 927* WSE-13B-S       = (' WSE-13B-S ')'
          logger.info("* 927* WSE-13B-S       = ({})", methodOut.getWse13bS().toString()); 
//  DISPLAY '* 928*   WSE-13B-S-FLD1= (' WSE-13B-S-FLD1 ')'
          logger.info("* 928*   WSE-13B-S-FLD1= ({})", new String(methodOut.getWse13bSFld1())); 
//  DISPLAY '* 929*   WSE-13B-S-FLD2= (' WSE-13B-S-FLD2 ')'
          logger.info("* 929*   WSE-13B-S-FLD2= ({})", new String(methodOut.getWse13bSFld2())); 
//  DISPLAY '* 930* WSE-13B-T-GRP-R = (' WSE-13B-T-GRP-R ')'
          logger.info("* 930* WSE-13B-T-GRP-R = ({})", new String(methodIn.getWse13bTGrpR())); 
//  DISPLAY '* 931* WSE-13B-T-GRP   = (' WSE-13B-T-GRP ')'
          logger.info("* 931* WSE-13B-T-GRP   = ({})", methodIn.getWse13bTGrp().toString()); 
//  DISPLAY '* 932* WSE-13B-T       = (' WSE-13B-T ')'
          logger.info("* 932* WSE-13B-T       = ({})", methodOut.getWse13bT().toString()); 
//  DISPLAY '* 933*   WSE-13B-T-FLD1= (' WSE-13B-T-FLD1 ')'
          logger.info("* 933*   WSE-13B-T-FLD1= ({})", new String(methodOut.getWse13bTFld1())); 
//  DISPLAY '* 934*   WSE-13B-T-FLD2= (' WSE-13B-T-FLD2 ')'
          logger.info("* 934*   WSE-13B-T-FLD2= ({})", new String(methodOut.getWse13bTFld2())); 
//  DISPLAY '* 935*   WSE-13B-T-FLD3= (' WSE-13B-T-FLD3 ')'
          logger.info("* 935*   WSE-13B-T-FLD3= ({})", new String(methodOut.getWse13bTFld3())); 

// *
// * Src -> string; tgt -> group ; src same size as tgt
// *    src offset 3  ;target offset 5
// *
//  INITIALIZE WSE-14A-S WSE-14A-T
          methodOut.setWse14aS(CONSTANTS.SPACE_60 /* Fill 60 Spaces*/);
          methodOut.getWse14aT().initialize();
//  MOVE ALL 'ABCD' TO WSE-14A-S
          methodOut.setWse14aS(CONSTANTS.LITERAL_1122147122);
//  MOVE WSE-14A-S ( 3 : LENGTH OF WSE-14A-S - 3 ) TO WSE-14A-T ( 5 : LENGTH OF WSE-14A-T - 5)
          methodOut.getWse14aTGrpGroup().replace(methodIn.getWse14aSGrp()/*parent*/,3+3 - 1/*fromOffset - (wse14aT) */,WSE_14A_S_LENGTH - 3/*fromLen*/,5+5 - 1/*toOffset - (wse14aS) */,Wse14aT.getWse14aTFieldLength() - 5/*toLen*/);

// *
//  DISPLAY '* 936* WSE-14A-S-GRP   = (' WSE-14A-S-GRP ')'
          logger.info("* 936* WSE-14A-S-GRP   = ({})", methodIn.getWse14aSGrp().toString()); 
//  DISPLAY '* 937* WSE-14A-S       = (' WSE-14A-S ')'
          logger.info("* 937* WSE-14A-S       = ({})", new String(methodOut.getWse14aS())); 
//  DISPLAY '* 938* WSE-14A-T-GRP-R = (' WSE-14A-T-GRP-R ')'
          logger.info("* 938* WSE-14A-T-GRP-R = ({})", new String(methodIn.getWse14aTGrpR())); 
//  DISPLAY '* 939* WSE-14A-T-GRP   = (' WSE-14A-T-GRP ')'
          logger.info("* 939* WSE-14A-T-GRP   = ({})", methodIn.getWse14aTGrp().toString()); 
//  DISPLAY '* 940* WSE-14A-T       = (' WSE-14A-T ')'
          logger.info("* 940* WSE-14A-T       = ({})", methodOut.getWse14aT().toString()); 
//  DISPLAY '* 941*   WSE-14A-T-FLD1= (' WSE-14A-T-FLD1 ')'
          logger.info("* 941*   WSE-14A-T-FLD1= ({})", new String(methodOut.getWse14aTFld1())); 
//  DISPLAY '* 942*   WSE-14A-T-FLD2= (' WSE-14A-T-FLD2 ')'
          logger.info("* 942*   WSE-14A-T-FLD2= ({})", new String(methodOut.getWse14aTFld2())); 

// *
// * Src -> string; tgt -> group ; src same size as tgt
// *    src offset 3  ;target offset 5
// *
//  INITIALIZE WSE-14B-S WSE-14B-T
          methodOut.setWse14bS(CONSTANTS.SPACE_60 /* Fill 60 Spaces*/);
          methodOut.getWse14bT().initialize();
//  MOVE ALL 'ABCD' TO WSE-14B-S
          methodOut.setWse14bS(CONSTANTS.LITERAL_1122147122);
//  MOVE ALL 'MNOP' TO WSE-14B-T-FLD3
          methodOut.setWse14bTFld3(CONSTANTS.LITERAL_MNOPMNOPMNOPMNOPMNOPMNOPMNOPMNOP);
//  MOVE WSE-14B-S ( 3 : LENGTH OF WSE-14B-S - 3 ) TO WSE-14B-T ( 5 : LENGTH OF WSE-14B-T - 5)
          methodOut.getWse14bTGrpGroup().replace(methodIn.getWse14bSGrp()/*parent*/,3+3 - 1/*fromOffset - (wse14bT) */,WSE_14B_S_LENGTH - 3/*fromLen*/,5+5 - 1/*toOffset - (wse14bS) */,Wse14bT.getWse14bTFieldLength() - 5/*toLen*/);

// *
//  DISPLAY '* 943* WSE-14B-S-GRP   = (' WSE-14B-S-GRP ')'
          logger.info("* 943* WSE-14B-S-GRP   = ({})", methodIn.getWse14bSGrp().toString()); 
//  DISPLAY '* 944* WSE-14B-S       = (' WSE-14B-S ')'
          logger.info("* 944* WSE-14B-S       = ({})", new String(methodOut.getWse14bS())); 
//  DISPLAY '* 945* WSE-14B-T-GRP-R = (' WSE-14B-T-GRP-R ')'
          logger.info("* 945* WSE-14B-T-GRP-R = ({})", new String(methodIn.getWse14bTGrpR())); 
      
      return methodOut;
      }
      /**
      * mainlineSplit31 
      *   This method is derived from 
  *   COBOL Paragraph - MAINLINE-SPLIT31 COBOL Cyclomatic complexity - 1
      * Input  :  

      * - wse14bTGrp                     COBOL Name: WSE-14B-T-GRP
      * - wse14bT                        COBOL Name: WSE-14B-T
      * - wse14bTFld1                    COBOL Name: WSE-14B-T-FLD1
      * - wse14bTFld2                    COBOL Name: WSE-14B-T-FLD2
      * - wse14bTFld3                    COBOL Name: WSE-14B-T-FLD3
      * - wse15aSGrp                     COBOL Name: WSE-15A-S-GRP
      * - wse15aTR                       COBOL Name: WSE-15A-T-R
      * - wse15bSGrp                     COBOL Name: WSE-15B-S-GRP
      * - wse15bTR                       COBOL Name: WSE-15B-T-R
      * - wse16aSGrp                     COBOL Name: WSE-16A-S-GRP
      * - wse16aTR                       COBOL Name: WSE-16A-T-R
      * - wse16bSGrp                     COBOL Name: WSE-16B-S-GRP
      * - wse16bTR                       COBOL Name: WSE-16B-T-R
      *
      * Output :  

      * - wse15aS                        COBOL Name: WSE-15A-S
      * - wse15aT                        COBOL Name: WSE-15A-T
      * - wse15aSFld1                    COBOL Name: WSE-15A-S-FLD1
      * - wse15aSFld2                    COBOL Name: WSE-15A-S-FLD2
      * - wse15aTFld1                    COBOL Name: WSE-15A-T-FLD1
      * - wse15aTFld2                    COBOL Name: WSE-15A-T-FLD2
      * - wse15bS                        COBOL Name: WSE-15B-S
      * - wse15bT                        COBOL Name: WSE-15B-T
      * - wse15bSFld1                    COBOL Name: WSE-15B-S-FLD1
      * - wse15bSFld2                    COBOL Name: WSE-15B-S-FLD2
      * - wse15bTFld3                    COBOL Name: WSE-15B-T-FLD3
      * - wse15bTFld1                    COBOL Name: WSE-15B-T-FLD1
      * - wse15bTFld2                    COBOL Name: WSE-15B-T-FLD2
      * - wse16aS                        COBOL Name: WSE-16A-S
      * - wse16aT                        COBOL Name: WSE-16A-T
      * - wse16aTFld1                    COBOL Name: WSE-16A-T-FLD1
      * - wse16aTFld2                    COBOL Name: WSE-16A-T-FLD2
      * - wse16bS                        COBOL Name: WSE-16B-S
      * - wse16bT                        COBOL Name: WSE-16B-T
      * - wse16bTFld3                    COBOL Name: WSE-16B-T-FLD3
      * - wse16bTFld1                    COBOL Name: WSE-16B-T-FLD1
      * - wse16bTFld2                    COBOL Name: WSE-16B-T-FLD2
      *
      * @throws CFException
      */
      @Override
      public MainlineSplit31OutCtx mainlineSplit31(MainlineSplit31InCtx methodIn) throws Exception {
			// Declare local variables used in the method
			 final int WSE_16A_S_LENGTH = 60;
			 final int WSE_16B_S_LENGTH = 60;
			// End of variable declaration

Refmod1Ctx programCtx = methodIn.getRefmod1Ctx();
MainlineSplit31OutCtx methodOut = methodIn.getMainlineSplit31OutCtx();
//  DISPLAY '* 946* WSE-14B-T-GRP   = (' WSE-14B-T-GRP ')'
          logger.info("* 946* WSE-14B-T-GRP   = ({})", methodIn.getWse14bTGrp().toString()); 
//  DISPLAY '* 947* WSE-14B-T       = (' WSE-14B-T ')'
          logger.info("* 947* WSE-14B-T       = ({})", methodIn.getWse14bT().toString()); 
//  DISPLAY '* 948*   WSE-14B-T-FLD1= (' WSE-14B-T-FLD1 ')'
          logger.info("* 948*   WSE-14B-T-FLD1= ({})", new String(methodIn.getWse14bTFld1())); 
//  DISPLAY '* 949*   WSE-14B-T-FLD2= (' WSE-14B-T-FLD2 ')'
          logger.info("* 949*   WSE-14B-T-FLD2= ({})", new String(methodIn.getWse14bTFld2())); 
//  DISPLAY '* 950*   WSE-14B-T-FLD3= (' WSE-14B-T-FLD3 ')'
          logger.info("* 950*   WSE-14B-T-FLD3= ({})", new String(methodIn.getWse14bTFld3())); 

// *
// * Src -> group; tgt -> group ; src same size as tgt
// *    src offset 3  ;target offset 0
// *
//  INITIALIZE WSE-15A-S WSE-15A-T
          methodOut.getWse15aS().initialize();
          methodOut.getWse15aT().initialize();
//  MOVE ALL 'ABCD' TO WSE-15A-S-FLD1
          methodOut.setWse15aSFld1(CONSTANTS.LITERAL_ABCDABCDABCDABCDABCDABCDABCDABCD);
//  MOVE ALL 'ZYXW' TO WSE-15A-S-FLD2
          methodOut.setWse15aSFld2(CONSTANTS.LITERAL_ZYXWZYXWZYXWZYXWZYXWZYXWZYXWZYXW);
//  MOVE WSE-15A-S ( 3 : LENGTH OF WSE-15A-S - 3 ) TO WSE-15A-T ( 5 : LENGTH OF WSE-15A-T - 5)
          methodOut.getWse15aTGroup().replace(methodIn.getWse15aSGrp()/*parent*/,3+3 - 1/*fromOffset - (wse15aT) */,Wse15aS.getWse15aSFieldLength() - 3/*fromLen*/,0+5 - 1/*toOffset - (wse15aS) */,Wse15aT.getWse15aTFieldLength() - 5/*toLen*/);

// *
//  DISPLAY '* 951* WSE-15A-S-GRP   = (' WSE-15A-S-GRP ')'
          logger.info("* 951* WSE-15A-S-GRP   = ({})", methodIn.getWse15aSGrp().toString()); 
//  DISPLAY '* 952* WSE-15A-S       = (' WSE-15A-S ')'
          logger.info("* 952* WSE-15A-S       = ({})", methodOut.getWse15aS().toString()); 
//  DISPLAY '* 953*   WSE-15A-S-FLD1= (' WSE-15A-S-FLD1 ')'
          logger.info("* 953*   WSE-15A-S-FLD1= ({})", new String(methodOut.getWse15aSFld1())); 
//  DISPLAY '* 954*   WSE-15A-S-FLD2= (' WSE-15A-S-FLD2 ')'
          logger.info("* 954*   WSE-15A-S-FLD2= ({})", new String(methodOut.getWse15aSFld2())); 
//  DISPLAY '* 955* WSE-15A-T-R     = (' WSE-15A-T-R ')'
          logger.info("* 955* WSE-15A-T-R     = ({})", new String(methodIn.getWse15aTR())); 
//  DISPLAY '* 956* WSE-15A-T       = (' WSE-15A-T ')'
          logger.info("* 956* WSE-15A-T       = ({})", methodOut.getWse15aT().toString()); 
//  DISPLAY '* 957*   WSE-15A-T-FLD1= (' WSE-15A-T-FLD1 ')'
          logger.info("* 957*   WSE-15A-T-FLD1= ({})", new String(methodOut.getWse15aTFld1())); 
//  DISPLAY '* 958*   WSE-15A-T-FLD2= (' WSE-15A-T-FLD2 ')'
          logger.info("* 958*   WSE-15A-T-FLD2= ({})", new String(methodOut.getWse15aTFld2())); 

// *
// * Src -> group; tgt -> group ; src same size as tgt
// *    src offset 3  ;target offset 0
// *
//  INITIALIZE WSE-15B-S WSE-15B-T
          methodOut.getWse15bS().initialize();
          methodOut.getWse15bT().initialize();
//  MOVE ALL 'ABCD' TO WSE-15B-S-FLD1
          methodOut.setWse15bSFld1(CONSTANTS.LITERAL_ABCDABCDABCDABCDABCDABCDABCDABCD);
//  MOVE ALL 'ZYXW' TO WSE-15B-S-FLD2
          methodOut.setWse15bSFld2(CONSTANTS.LITERAL_ZYXWZYXWZYXWZYXWZYXWZYXWZYXWZYXW);
//  MOVE ALL 'MNOP' TO WSE-15B-T-FLD3
          methodOut.setWse15bTFld3(CONSTANTS.LITERAL_MNOPMNOPMNOPMNOPMNOPMNOPMNOPMNOP);
//  MOVE WSE-15B-S ( 3 : LENGTH OF WSE-15B-S - 3 ) TO WSE-15B-T ( 5 : LENGTH OF WSE-15B-T - 5)
          methodOut.getWse15bTGroup().replace(methodIn.getWse15bSGrp()/*parent*/,3+3 - 1/*fromOffset - (wse15bT) */,Wse15bS.getWse15bSFieldLength() - 3/*fromLen*/,0+5 - 1/*toOffset - (wse15bS) */,Wse15bT.getWse15bTFieldLength() - 5/*toLen*/);

// *
//  DISPLAY '* 959* WSE-15B-S-GRP   = (' WSE-15B-S-GRP ')'
          logger.info("* 959* WSE-15B-S-GRP   = ({})", methodIn.getWse15bSGrp().toString()); 
//  DISPLAY '* 960* WSE-15B-S       = (' WSE-15B-S ')'
          logger.info("* 960* WSE-15B-S       = ({})", methodOut.getWse15bS().toString()); 
//  DISPLAY '* 961*   WSE-15B-S-FLD1= (' WSE-15B-S-FLD1 ')'
          logger.info("* 961*   WSE-15B-S-FLD1= ({})", new String(methodOut.getWse15bSFld1())); 
//  DISPLAY '* 962*   WSE-15B-S-FLD2= (' WSE-15B-S-FLD2 ')'
          logger.info("* 962*   WSE-15B-S-FLD2= ({})", new String(methodOut.getWse15bSFld2())); 
//  DISPLAY '* 963* WSE-15B-T-R     = (' WSE-15B-T-R ')'
          logger.info("* 963* WSE-15B-T-R     = ({})", new String(methodIn.getWse15bTR())); 
//  DISPLAY '* 964* WSE-15B-T       = (' WSE-15B-T ')'
          logger.info("* 964* WSE-15B-T       = ({})", methodOut.getWse15bT().toString()); 
//  DISPLAY '* 965*   WSE-15B-T-FLD1= (' WSE-15B-T-FLD1 ')'
          logger.info("* 965*   WSE-15B-T-FLD1= ({})", new String(methodOut.getWse15bTFld1())); 
//  DISPLAY '* 966*   WSE-15B-T-FLD2= (' WSE-15B-T-FLD2 ')'
          logger.info("* 966*   WSE-15B-T-FLD2= ({})", new String(methodOut.getWse15bTFld2())); 
//  DISPLAY '* 967*   WSE-15B-T-FLD3= (' WSE-15B-T-FLD3 ')'
          logger.info("* 967*   WSE-15B-T-FLD3= ({})", new String(methodOut.getWse15bTFld3())); 

// *
// * Src -> string; tgt -> group ; src same size as tgt
// *    src offset 3  ;target offset 0
// *
//  INITIALIZE WSE-16A-S WSE-16A-T
          methodOut.setWse16aS(CONSTANTS.SPACE_60 /* Fill 60 Spaces*/);
          methodOut.getWse16aT().initialize();
//  MOVE ALL 'ABCD' TO WSE-16A-S
          methodOut.setWse16aS(CONSTANTS.LITERAL_1122147122);
//  MOVE WSE-16A-S ( 3 : LENGTH OF WSE-16A-S - 3 ) TO WSE-16A-T ( 5 : LENGTH OF WSE-16A-T - 5)
          methodOut.getWse16aTGroup().replace(methodIn.getWse16aSGrp()/*parent*/,3+3 - 1/*fromOffset - (wse16aT) */,WSE_16A_S_LENGTH - 3/*fromLen*/,0+5 - 1/*toOffset - (wse16aS) */,Wse16aT.getWse16aTFieldLength() - 5/*toLen*/);

// *
//  DISPLAY '* 968* WSE-16A-S-GRP   = (' WSE-16A-S-GRP ')'
          logger.info("* 968* WSE-16A-S-GRP   = ({})", methodIn.getWse16aSGrp().toString()); 
//  DISPLAY '* 969* WSE-16A-S       = (' WSE-16A-S ')'
          logger.info("* 969* WSE-16A-S       = ({})", new String(methodOut.getWse16aS())); 
//  DISPLAY '* 970* WSE-16A-T-R     = (' WSE-16A-T-R ')'
          logger.info("* 970* WSE-16A-T-R     = ({})", new String(methodIn.getWse16aTR())); 
//  DISPLAY '* 971* WSE-16A-T       = (' WSE-16A-T ')'
          logger.info("* 971* WSE-16A-T       = ({})", methodOut.getWse16aT().toString()); 
//  DISPLAY '* 972*   WSE-16A-T-FLD1= (' WSE-16A-T-FLD1 ')'
          logger.info("* 972*   WSE-16A-T-FLD1= ({})", new String(methodOut.getWse16aTFld1())); 
//  DISPLAY '* 973*   WSE-16A-T-FLD2= (' WSE-16A-T-FLD2 ')'
          logger.info("* 973*   WSE-16A-T-FLD2= ({})", new String(methodOut.getWse16aTFld2())); 

// *
// * Src -> string; tgt -> group ; src same size as tgt
// *    src offset 3  ;target offset 0
// *
//  INITIALIZE WSE-16B-S WSE-16B-T
          methodOut.setWse16bS(CONSTANTS.SPACE_60 /* Fill 60 Spaces*/);
          methodOut.getWse16bT().initialize();
//  MOVE ALL 'ABCD' TO WSE-16B-S
          methodOut.setWse16bS(CONSTANTS.LITERAL_1122147122);
//  MOVE ALL 'MNOP' TO WSE-16B-T-FLD3
          methodOut.setWse16bTFld3(CONSTANTS.LITERAL_MNOPMNOPMNOPMNOPMNOPMNOPMNOPMNOP);
//  MOVE WSE-16B-S ( 3 : LENGTH OF WSE-16B-S - 3 ) TO WSE-16B-T ( 5 : LENGTH OF WSE-16B-T - 5)
          methodOut.getWse16bTGroup().replace(methodIn.getWse16bSGrp()/*parent*/,3+3 - 1/*fromOffset - (wse16bT) */,WSE_16B_S_LENGTH - 3/*fromLen*/,0+5 - 1/*toOffset - (wse16bS) */,Wse16bT.getWse16bTFieldLength() - 5/*toLen*/);

// *
//  DISPLAY '* 974* WSE-16B-S-GRP   = (' WSE-16B-S-GRP ')'
          logger.info("* 974* WSE-16B-S-GRP   = ({})", methodIn.getWse16bSGrp().toString()); 
//  DISPLAY '* 975* WSE-16B-S       = (' WSE-16B-S ')'
          logger.info("* 975* WSE-16B-S       = ({})", new String(methodOut.getWse16bS())); 
//  DISPLAY '* 976* WSE-16B-T-R     = (' WSE-16B-T-R ')'
          logger.info("* 976* WSE-16B-T-R     = ({})", new String(methodIn.getWse16bTR())); 
//  DISPLAY '* 977* WSE-16B-T       = (' WSE-16B-T ')'
          logger.info("* 977* WSE-16B-T       = ({})", methodOut.getWse16bT().toString()); 
//  DISPLAY '* 978*   WSE-16B-T-FLD1= (' WSE-16B-T-FLD1 ')'
          logger.info("* 978*   WSE-16B-T-FLD1= ({})", new String(methodOut.getWse16bTFld1())); 
//  DISPLAY '* 979*   WSE-16B-T-FLD2= (' WSE-16B-T-FLD2 ')'
          logger.info("* 979*   WSE-16B-T-FLD2= ({})", new String(methodOut.getWse16bTFld2())); 
//  DISPLAY '* 980*   WSE-16B-T-FLD3= (' WSE-16B-T-FLD3 ')'
          logger.info("* 980*   WSE-16B-T-FLD3= ({})", new String(methodOut.getWse16bTFld3())); 
      
      return methodOut;
      }
      /**
      * mainlineSplit32 
      *   This method is derived from 
  *   COBOL Paragraph - MAINLINE-SPLIT32 COBOL Cyclomatic complexity - 1
      * Input  :  

      * - wse17aTGrpR                    COBOL Name: WSE-17A-T-GRP-R
      * - wse17aTGrp                     COBOL Name: WSE-17A-T-GRP
      * - wse17bTGrpR                    COBOL Name: WSE-17B-T-GRP-R
      * - wse17bTGrp                     COBOL Name: WSE-17B-T-GRP
      * - wse18aTGrpR                    COBOL Name: WSE-18A-T-GRP-R
      * - wse18aTGrp                     COBOL Name: WSE-18A-T-GRP
      * - wse18bTGrpR                    COBOL Name: WSE-18B-T-GRP-R
      * - wse18bTGrp                     COBOL Name: WSE-18B-T-GRP
      *
      * Output :  

      * - wse17aS                        COBOL Name: WSE-17A-S
      * - wse17aT                        COBOL Name: WSE-17A-T
      * - wse17aSFld1                    COBOL Name: WSE-17A-S-FLD1
      * - wse17aSFld2                    COBOL Name: WSE-17A-S-FLD2
      * - wse17aTFld1                    COBOL Name: WSE-17A-T-FLD1
      * - wse17aTFld2                    COBOL Name: WSE-17A-T-FLD2
      * - wse17bS                        COBOL Name: WSE-17B-S
      * - wse17bT                        COBOL Name: WSE-17B-T
      * - wse17bSFld1                    COBOL Name: WSE-17B-S-FLD1
      * - wse17bSFld2                    COBOL Name: WSE-17B-S-FLD2
      * - wse17bTFld3                    COBOL Name: WSE-17B-T-FLD3
      * - wse17bTFld1                    COBOL Name: WSE-17B-T-FLD1
      * - wse17bTFld2                    COBOL Name: WSE-17B-T-FLD2
      * - wse18aS                        COBOL Name: WSE-18A-S
      * - wse18aT                        COBOL Name: WSE-18A-T
      * - wse18aTFld1                    COBOL Name: WSE-18A-T-FLD1
      * - wse18aTFld2                    COBOL Name: WSE-18A-T-FLD2
      * - wse18bS                        COBOL Name: WSE-18B-S
      * - wse18bT                        COBOL Name: WSE-18B-T
      * - wse18bTFld3                    COBOL Name: WSE-18B-T-FLD3
      * - wse18bTFld1                    COBOL Name: WSE-18B-T-FLD1
      * - wse18bTFld2                    COBOL Name: WSE-18B-T-FLD2
      * - wse19aS                        COBOL Name: WSE-19A-S
      * - wse19aT                        COBOL Name: WSE-19A-T
      * - wse19aSFld1                    COBOL Name: WSE-19A-S-FLD1
      * - wse19aSFld2                    COBOL Name: WSE-19A-S-FLD2
      *
      * @throws CFException
      */
      @Override
      public MainlineSplit32OutCtx mainlineSplit32(MainlineSplit32InCtx methodIn) throws Exception {
			// Declare local variables used in the method
			 final int WSE_18A_S_LENGTH = 60;
			 final int WSE_18B_S_LENGTH = 60;
			// End of variable declaration

Refmod1Ctx programCtx = methodIn.getRefmod1Ctx();
MainlineSplit32OutCtx methodOut = methodIn.getMainlineSplit32OutCtx();

// *
// * Src -> group; tgt -> group ; src same size as tgt
// *    src offset 0  ;target offset 5
// *
//  INITIALIZE WSE-17A-S WSE-17A-T
          methodOut.getWse17aS().initialize();
          methodOut.getWse17aT().initialize();
//  MOVE ALL 'ABCD' TO WSE-17A-S-FLD1
          methodOut.setWse17aSFld1(CONSTANTS.LITERAL_ABCDABCDABCDABCDABCDABCDABCDABCD);
//  MOVE ALL 'ZYXW' TO WSE-17A-S-FLD2
          methodOut.setWse17aSFld2(CONSTANTS.LITERAL_ZYXWZYXWZYXWZYXWZYXWZYXWZYXWZYXW);
//  MOVE WSE-17A-S ( 3 : LENGTH OF WSE-17A-S - 3 ) TO WSE-17A-T ( 5 : LENGTH OF WSE-17A-T - 5)
          methodOut.getWse17aT().replace(methodOut.getWse17aS(),2,Wse17aS.getWse17aSFieldLength() - 3, (methodOut.getWse17aT().begin + 4) ,Wse17aT.getWse17aTFieldLength() - 5 /* replace,sourceIndex,sourceLen,targetIndex,targetLen */);

// *
//  DISPLAY '* 981* WSE-17A-S       = (' WSE-17A-S ')'
          logger.info("* 981* WSE-17A-S       = ({})", methodOut.getWse17aS().toString()); 
//  DISPLAY '* 982*   WSE-17A-S-FLD1= (' WSE-17A-S-FLD1 ')'
          logger.info("* 982*   WSE-17A-S-FLD1= ({})", new String(methodOut.getWse17aSFld1())); 
//  DISPLAY '* 983*   WSE-17A-S-FLD2= (' WSE-17A-S-FLD2 ')'
          logger.info("* 983*   WSE-17A-S-FLD2= ({})", new String(methodOut.getWse17aSFld2())); 
//  DISPLAY '* 984* WSE-17A-T-GRP-R = (' WSE-17A-T-GRP-R ')'
          logger.info("* 984* WSE-17A-T-GRP-R = ({})", new String(methodIn.getWse17aTGrpR())); 
//  DISPLAY '* 985* WSE-17A-T-GRP   = (' WSE-17A-T-GRP ')'
          logger.info("* 985* WSE-17A-T-GRP   = ({})", methodIn.getWse17aTGrp().toString()); 
//  DISPLAY '* 986* WSE-17A-T       = (' WSE-17A-T ')'
          logger.info("* 986* WSE-17A-T       = ({})", methodOut.getWse17aT().toString()); 
//  DISPLAY '* 987*   WSE-17A-T-FLD1= (' WSE-17A-T-FLD1 ')'
          logger.info("* 987*   WSE-17A-T-FLD1= ({})", new String(methodOut.getWse17aTFld1())); 
//  DISPLAY '* 988*   WSE-17A-T-FLD2= (' WSE-17A-T-FLD2 ')'
          logger.info("* 988*   WSE-17A-T-FLD2= ({})", new String(methodOut.getWse17aTFld2())); 

// *
//  INITIALIZE WSE-17B-S WSE-17B-T
          methodOut.getWse17bS().initialize();
          methodOut.getWse17bT().initialize();
//  MOVE ALL 'ABCD' TO WSE-17B-S-FLD1
          methodOut.setWse17bSFld1(CONSTANTS.LITERAL_ABCDABCDABCDABCDABCDABCDABCDABCD);
//  MOVE ALL 'ZYXW' TO WSE-17B-S-FLD2
          methodOut.setWse17bSFld2(CONSTANTS.LITERAL_ZYXWZYXWZYXWZYXWZYXWZYXWZYXWZYXW);
//  MOVE ALL 'MNOP' TO WSE-17B-T-FLD3
          methodOut.setWse17bTFld3(CONSTANTS.LITERAL_MNOPMNOPMNOPMNOPMNOPMNOPMNOPMNOP);
//  MOVE WSE-17B-S ( 3 : LENGTH OF WSE-17B-S - 3 ) TO WSE-17B-T ( 5 : LENGTH OF WSE-17B-T - 5)
          methodOut.getWse17bT().replace(methodOut.getWse17bS(),2,Wse17bS.getWse17bSFieldLength() - 3, (methodOut.getWse17bT().begin + 4) ,Wse17bT.getWse17bTFieldLength() - 5 /* replace,sourceIndex,sourceLen,targetIndex,targetLen */);

// *
//  DISPLAY '* 989* WSE-17B-S       = (' WSE-17B-S ')'
          logger.info("* 989* WSE-17B-S       = ({})", methodOut.getWse17bS().toString()); 
//  DISPLAY '* 990*   WSE-17B-S-FLD1= (' WSE-17B-S-FLD1 ')'
          logger.info("* 990*   WSE-17B-S-FLD1= ({})", new String(methodOut.getWse17bSFld1())); 
//  DISPLAY '* 991*   WSE-17B-S-FLD2= (' WSE-17B-S-FLD2 ')'
          logger.info("* 991*   WSE-17B-S-FLD2= ({})", new String(methodOut.getWse17bSFld2())); 
//  DISPLAY '* 992* WSE-17B-T-GRP-R = (' WSE-17B-T-GRP-R ')'
          logger.info("* 992* WSE-17B-T-GRP-R = ({})", new String(methodIn.getWse17bTGrpR())); 
//  DISPLAY '* 993* WSE-17B-T-GRP   = (' WSE-17B-T-GRP ')'
          logger.info("* 993* WSE-17B-T-GRP   = ({})", methodIn.getWse17bTGrp().toString()); 
//  DISPLAY '* 994* WSE-17B-T       = (' WSE-17B-T ')'
          logger.info("* 994* WSE-17B-T       = ({})", methodOut.getWse17bT().toString()); 
//  DISPLAY '* 995*   WSE-17B-T-FLD1= (' WSE-17B-T-FLD1 ')'
          logger.info("* 995*   WSE-17B-T-FLD1= ({})", new String(methodOut.getWse17bTFld1())); 
//  DISPLAY '* 996*   WSE-17B-T-FLD2= (' WSE-17B-T-FLD2 ')'
          logger.info("* 996*   WSE-17B-T-FLD2= ({})", new String(methodOut.getWse17bTFld2())); 
//  DISPLAY '* 997*   WSE-17B-T-FLD3= (' WSE-17B-T-FLD3 ')'
          logger.info("* 997*   WSE-17B-T-FLD3= ({})", new String(methodOut.getWse17bTFld3())); 

// *
// * Src -> string; tgt -> group ; src same size as tgt
// *    src offset 0  ;target offset 5
// *
//  INITIALIZE WSE-18A-S WSE-18A-T
          methodOut.setWse18aS(CONSTANTS.SPACE_60 /* Fill 60 Spaces*/);
          methodOut.getWse18aT().initialize();
          // MOVE ALL 'ABCD' TO WSE-18A-S
          methodOut.setWse18aS(CONSTANTS.LITERAL_1122147122);
//  MOVE WSE-18A-S ( 3 : LENGTH OF WSE-18A-S - 3 ) TO WSE-18A-T ( 5 : LENGTH OF WSE-18A-T - 5)
          methodOut.getWse18aT().replace(methodOut.getWse18aS(),2/* wse18aS */ ,WSE_18A_S_LENGTH - 3, (methodOut.getWse18aT().begin + 4) /* wse18aT */,Wse18aT.getWse18aTFieldLength() - 5 /* replace,startIndex,targetLen */);

// *
//  DISPLAY '* 998* WSE-18A-S       = (' WSE-18A-S ')'
          logger.info("* 998* WSE-18A-S       = ({})", new String(methodOut.getWse18aS())); 
//  DISPLAY '* 999* WSE-18A-T-GRP-R = (' WSE-18A-T-GRP-R ')'
          logger.info("* 999* WSE-18A-T-GRP-R = ({})", new String(methodIn.getWse18aTGrpR())); 
//  DISPLAY '*1000* WSE-18A-T-GRP   = (' WSE-18A-T-GRP ')'
          logger.info("*1000* WSE-18A-T-GRP   = ({})", methodIn.getWse18aTGrp().toString()); 
//  DISPLAY '*1001* WSE-18A-T       = (' WSE-18A-T ')'
          logger.info("*1001* WSE-18A-T       = ({})", methodOut.getWse18aT().toString()); 
//  DISPLAY '*1002*   WSE-18A-T-FLD1= (' WSE-18A-T-FLD1 ')'
          logger.info("*1002*   WSE-18A-T-FLD1= ({})", new String(methodOut.getWse18aTFld1())); 
//  DISPLAY '*1003*   WSE-18A-T-FLD2= (' WSE-18A-T-FLD2 ')'
          logger.info("*1003*   WSE-18A-T-FLD2= ({})", new String(methodOut.getWse18aTFld2())); 

// *
// * Src -> string; tgt -> group ; src same size as tgt
// *    src offset 0  ;target offset 5
// *
//  INITIALIZE WSE-18B-S WSE-18B-T
          methodOut.setWse18bS(CONSTANTS.SPACE_60 /* Fill 60 Spaces*/);
          methodOut.getWse18bT().initialize();
          // MOVE ALL 'ABCD' TO WSE-18B-S
          methodOut.setWse18bS(CONSTANTS.LITERAL_1122147122);
//  MOVE ALL 'MNOP' TO WSE-18B-T-FLD3
          methodOut.setWse18bTFld3(CONSTANTS.LITERAL_MNOPMNOPMNOPMNOPMNOPMNOPMNOPMNOP);
//  MOVE WSE-18B-S ( 3 : LENGTH OF WSE-18B-S - 3 ) TO WSE-18B-T ( 5 : LENGTH OF WSE-18B-T - 5)
          methodOut.getWse18bT().replace(methodOut.getWse18bS(),2/* wse18bS */ ,WSE_18B_S_LENGTH - 3, (methodOut.getWse18bT().begin + 4) /* wse18bT */,Wse18bT.getWse18bTFieldLength() - 5 /* replace,startIndex,targetLen */);

// *
//  DISPLAY '*1004* WSE-18B-S       = (' WSE-18B-S ')'
          logger.info("*1004* WSE-18B-S       = ({})", new String(methodOut.getWse18bS())); 
//  DISPLAY '*1005* WSE-18B-T-GRP-R = (' WSE-18B-T-GRP-R ')'
          logger.info("*1005* WSE-18B-T-GRP-R = ({})", new String(methodIn.getWse18bTGrpR())); 
//  DISPLAY '*1006* WSE-18B-T-GRP   = (' WSE-18B-T-GRP ')'
          logger.info("*1006* WSE-18B-T-GRP   = ({})", methodIn.getWse18bTGrp().toString()); 
//  DISPLAY '*1007* WSE-18B-T       = (' WSE-18B-T ')'
          logger.info("*1007* WSE-18B-T       = ({})", methodOut.getWse18bT().toString()); 
//  DISPLAY '*1008*   WSE-18B-T-FLD1= (' WSE-18B-T-FLD1 ')'
          logger.info("*1008*   WSE-18B-T-FLD1= ({})", new String(methodOut.getWse18bTFld1())); 
//  DISPLAY '*1009*   WSE-18B-T-FLD2= (' WSE-18B-T-FLD2 ')'
          logger.info("*1009*   WSE-18B-T-FLD2= ({})", new String(methodOut.getWse18bTFld2())); 
//  DISPLAY '*1010*   WSE-18B-T-FLD3= (' WSE-18B-T-FLD3 ')'
          logger.info("*1010*   WSE-18B-T-FLD3= ({})", new String(methodOut.getWse18bTFld3())); 

// *
// * Src -> group; tgt -> group ; src same size as tgt
// *    src not refmod;target offset 5
// *
//  INITIALIZE WSE-19A-S WSE-19A-T
          methodOut.getWse19aS().initialize();
          methodOut.getWse19aT().initialize();
//  MOVE ALL 'ABCD' TO WSE-19A-S-FLD1
          methodOut.setWse19aSFld1(CONSTANTS.LITERAL_ABCDABCDABCDABCDABCDABCDABCDABCD);
//  MOVE ALL 'ZYXW' TO WSE-19A-S-FLD2
          methodOut.setWse19aSFld2(CONSTANTS.LITERAL_ZYXWZYXWZYXWZYXWZYXWZYXWZYXWZYXW);
//  MOVE WSE-19A-S TO WSE-19A-T ( 5 : LENGTH OF WSE-19A-T - 5)
          methodOut.getWse19aT().replace(methodOut.getWse19aS().getCharArray(),0,methodOut.getWse19aS().length(), (methodOut.getWse19aT().begin + 4) ,Wse19aT.getWse19aTFieldLength() - 5 /* replace,sourceIndex,sourceLen,targetIndex,targetLen */);

// *
//  DISPLAY '*1011* WSE-19A-S       = (' WSE-19A-S ')'
          logger.info("*1011* WSE-19A-S       = ({})", methodOut.getWse19aS().toString()); 
      
      return methodOut;
      }
      /**
      * mainlineSplit33 
      *   This method is derived from 
  *   COBOL Paragraph - MAINLINE-SPLIT33 COBOL Cyclomatic complexity - 1
      * Input  :  

      * - wse19aSFld1                    COBOL Name: WSE-19A-S-FLD1
      * - wse19aSFld2                    COBOL Name: WSE-19A-S-FLD2
      * - wse19aTGrpR                    COBOL Name: WSE-19A-T-GRP-R
      * - wse19aTGrp                     COBOL Name: WSE-19A-T-GRP
      * - wse19aT                        COBOL Name: WSE-19A-T
      * - wse19aTFld1                    COBOL Name: WSE-19A-T-FLD1
      * - wse19aTFld2                    COBOL Name: WSE-19A-T-FLD2
      * - wse19bTGrpR                    COBOL Name: WSE-19B-T-GRP-R
      * - wse19bTGrp                     COBOL Name: WSE-19B-T-GRP
      * - wse20aTGrpR                    COBOL Name: WSE-20A-T-GRP-R
      * - wse20aTGrp                     COBOL Name: WSE-20A-T-GRP
      * - wse20bTGrpR                    COBOL Name: WSE-20B-T-GRP-R
      * - wse20bTGrp                     COBOL Name: WSE-20B-T-GRP
      * - wse20cSGrp                     COBOL Name: WSE-20C-S-GRP
      *
      * Output :  

      * - wse19bS                        COBOL Name: WSE-19B-S
      * - wse19bT                        COBOL Name: WSE-19B-T
      * - wse19bSFld1                    COBOL Name: WSE-19B-S-FLD1
      * - wse19bSFld2                    COBOL Name: WSE-19B-S-FLD2
      * - wse19bTFld3                    COBOL Name: WSE-19B-T-FLD3
      * - wse19bTFld1                    COBOL Name: WSE-19B-T-FLD1
      * - wse19bTFld2                    COBOL Name: WSE-19B-T-FLD2
      * - wse20aS                        COBOL Name: WSE-20A-S
      * - wse20aT                        COBOL Name: WSE-20A-T
      * - wse20aTFld1                    COBOL Name: WSE-20A-T-FLD1
      * - wse20aTFld2                    COBOL Name: WSE-20A-T-FLD2
      * - wse20bS                        COBOL Name: WSE-20B-S
      * - wse20bT                        COBOL Name: WSE-20B-T
      * - wse20bTFld3                    COBOL Name: WSE-20B-T-FLD3
      * - wse20bTFld1                    COBOL Name: WSE-20B-T-FLD1
      * - wse20bTFld2                    COBOL Name: WSE-20B-T-FLD2
      * - wse20cS                        COBOL Name: WSE-20C-S
      * - wse20cT                        COBOL Name: WSE-20C-T
      * - wse20cSFld1                    COBOL Name: WSE-20C-S-FLD1
      * - wse20cSFld2                    COBOL Name: WSE-20C-S-FLD2
      * - wse20cSFld3                    COBOL Name: WSE-20C-S-FLD3
      *
      * @throws CFException
      */
      @Override
      public MainlineSplit33OutCtx mainlineSplit33(MainlineSplit33InCtx methodIn) throws Exception {
Refmod1Ctx programCtx = methodIn.getRefmod1Ctx();
MainlineSplit33OutCtx methodOut = methodIn.getMainlineSplit33OutCtx();
//  DISPLAY '*1012*   WSE-19A-S-FLD1= (' WSE-19A-S-FLD1 ')'
          logger.info("*1012*   WSE-19A-S-FLD1= ({})", new String(methodIn.getWse19aSFld1())); 
//  DISPLAY '*1013*   WSE-19A-S-FLD2= (' WSE-19A-S-FLD2 ')'
          logger.info("*1013*   WSE-19A-S-FLD2= ({})", new String(methodIn.getWse19aSFld2())); 
//  DISPLAY '*1014* WSE-19A-T-GRP-R = (' WSE-19A-T-GRP-R ')'
          logger.info("*1014* WSE-19A-T-GRP-R = ({})", new String(methodIn.getWse19aTGrpR())); 
//  DISPLAY '*1015* WSE-19A-T-GRP   = (' WSE-19A-T-GRP ')'
          logger.info("*1015* WSE-19A-T-GRP   = ({})", methodIn.getWse19aTGrp().toString()); 
//  DISPLAY '*1016* WSE-19A-T       = (' WSE-19A-T ')'
          logger.info("*1016* WSE-19A-T       = ({})", methodIn.getWse19aT().toString()); 
//  DISPLAY '*1017*   WSE-19A-T-FLD1= (' WSE-19A-T-FLD1 ')'
          logger.info("*1017*   WSE-19A-T-FLD1= ({})", new String(methodIn.getWse19aTFld1())); 
//  DISPLAY '*1018*   WSE-19A-T-FLD2= (' WSE-19A-T-FLD2 ')'
          logger.info("*1018*   WSE-19A-T-FLD2= ({})", new String(methodIn.getWse19aTFld2())); 

// *
// * Src -> group; tgt -> group ; src same size as tgt
// *    src not refmod;target offset 5
// *
//  INITIALIZE WSE-19B-S WSE-19B-T
          methodOut.getWse19bS().initialize();
          methodOut.getWse19bT().initialize();
//  MOVE ALL 'ABCD' TO WSE-19B-S-FLD1
          methodOut.setWse19bSFld1(CONSTANTS.LITERAL_ABCDABCDABCDABCDABCDABCDABCDABCD);
//  MOVE ALL 'ZYXW' TO WSE-19B-S-FLD2
          methodOut.setWse19bSFld2(CONSTANTS.LITERAL_ZYXWZYXWZYXWZYXWZYXWZYXWZYXWZYXW);
//  MOVE ALL 'MNOP' TO WSE-19B-T-FLD3
          methodOut.setWse19bTFld3(CONSTANTS.LITERAL_MNOPMNOPMNOPMNOPMNOPMNOPMNOPMNOP);
//  MOVE WSE-19B-S TO WSE-19B-T ( 5 : LENGTH OF WSE-19B-T - 5)
          methodOut.getWse19bT().replace(methodOut.getWse19bS().getCharArray(),0,methodOut.getWse19bS().length(), (methodOut.getWse19bT().begin + 4) ,Wse19bT.getWse19bTFieldLength() - 5 /* replace,sourceIndex,sourceLen,targetIndex,targetLen */);

// *
//  DISPLAY '*1019* WSE-19B-S       = (' WSE-19B-S ')'
          logger.info("*1019* WSE-19B-S       = ({})", methodOut.getWse19bS().toString()); 
//  DISPLAY '*1020*   WSE-19B-S-FLD1= (' WSE-19B-S-FLD1 ')'
          logger.info("*1020*   WSE-19B-S-FLD1= ({})", new String(methodOut.getWse19bSFld1())); 
//  DISPLAY '*1021*   WSE-19B-S-FLD2= (' WSE-19B-S-FLD2 ')'
          logger.info("*1021*   WSE-19B-S-FLD2= ({})", new String(methodOut.getWse19bSFld2())); 
//  DISPLAY '*1022* WSE-19B-T-GRP-R = (' WSE-19B-T-GRP-R ')'
          logger.info("*1022* WSE-19B-T-GRP-R = ({})", new String(methodIn.getWse19bTGrpR())); 
//  DISPLAY '*1023* WSE-19B-T-GRP   = (' WSE-19B-T-GRP ')'
          logger.info("*1023* WSE-19B-T-GRP   = ({})", methodIn.getWse19bTGrp().toString()); 
//  DISPLAY '*1024* WSE-19B-T       = (' WSE-19B-T ')'
          logger.info("*1024* WSE-19B-T       = ({})", methodOut.getWse19bT().toString()); 
//  DISPLAY '*1025*   WSE-19B-T-FLD1= (' WSE-19B-T-FLD1 ')'
          logger.info("*1025*   WSE-19B-T-FLD1= ({})", new String(methodOut.getWse19bTFld1())); 
//  DISPLAY '*1026*   WSE-19B-T-FLD2= (' WSE-19B-T-FLD2 ')'
          logger.info("*1026*   WSE-19B-T-FLD2= ({})", new String(methodOut.getWse19bTFld2())); 
//  DISPLAY '*1027*   WSE-19B-T-FLD3= (' WSE-19B-T-FLD3 ')'
          logger.info("*1027*   WSE-19B-T-FLD3= ({})", new String(methodOut.getWse19bTFld3())); 

// *
// * Src -> string; tgt -> group ; src same size as tgt
// *    src not refmod;target offset 5
// *
//  INITIALIZE WSE-20A-S WSE-20A-T
          methodOut.setWse20aS(CONSTANTS.SPACE_60 /* Fill 60 Spaces*/);
          methodOut.getWse20aT().initialize();
          // MOVE ALL 'ABCD' TO WSE-20A-S
          methodOut.setWse20aS(CONSTANTS.LITERAL_1122147122);
//  MOVE WSE-20A-S TO WSE-20A-T ( 5 : LENGTH OF WSE-20A-T - 5)
          methodOut.getWse20aT().replace(methodOut.getWse20aS(),0,methodOut.getWse20aS().length, (methodOut.getWse20aT().begin + 4) /* wse20aT */,Wse20aT.getWse20aTFieldLength() - 5 /* replace,sourceIndex,sourceLen,targetIndex,targetLen */);

// *
//  DISPLAY '*1028* WSE-20A-S       = (' WSE-20A-S ')'
          logger.info("*1028* WSE-20A-S       = ({})", new String(methodOut.getWse20aS())); 
//  DISPLAY '*1029* WSE-20A-T-GRP-R = (' WSE-20A-T-GRP-R ')'
          logger.info("*1029* WSE-20A-T-GRP-R = ({})", new String(methodIn.getWse20aTGrpR())); 
//  DISPLAY '*1030* WSE-20A-T-GRP   = (' WSE-20A-T-GRP ')'
          logger.info("*1030* WSE-20A-T-GRP   = ({})", methodIn.getWse20aTGrp().toString()); 
//  DISPLAY '*1031* WSE-20A-T       = (' WSE-20A-T ')'
          logger.info("*1031* WSE-20A-T       = ({})", methodOut.getWse20aT().toString()); 
//  DISPLAY '*1032*   WSE-20A-T-FLD1= (' WSE-20A-T-FLD1 ')'
          logger.info("*1032*   WSE-20A-T-FLD1= ({})", new String(methodOut.getWse20aTFld1())); 
//  DISPLAY '*1033*   WSE-20A-T-FLD2= (' WSE-20A-T-FLD2 ')'
          logger.info("*1033*   WSE-20A-T-FLD2= ({})", new String(methodOut.getWse20aTFld2())); 

// *
// * Src -> string; tgt -> group ; src same size as tgt
// *    src not refmod;target offset 5
// *
//  INITIALIZE WSE-20B-S WSE-20B-T
          methodOut.setWse20bS(CONSTANTS.SPACE_60 /* Fill 60 Spaces*/);
          methodOut.getWse20bT().initialize();
          // MOVE ALL 'ABCD' TO WSE-20B-S
          methodOut.setWse20bS(CONSTANTS.LITERAL_1122147122);
//  MOVE ALL 'MNOP' TO WSE-20B-T-FLD3
          methodOut.setWse20bTFld3(CONSTANTS.LITERAL_MNOPMNOPMNOPMNOPMNOPMNOPMNOPMNOP);
//  MOVE WSE-20B-S TO WSE-20B-T ( 5 : LENGTH OF WSE-20B-T - 5)
          methodOut.getWse20bT().replace(methodOut.getWse20bS(),0,methodOut.getWse20bS().length, (methodOut.getWse20bT().begin + 4) /* wse20bT */,Wse20bT.getWse20bTFieldLength() - 5 /* replace,sourceIndex,sourceLen,targetIndex,targetLen */);

// *
//  DISPLAY '*1034* WSE-20B-S       = (' WSE-20B-S ')'
          logger.info("*1034* WSE-20B-S       = ({})", new String(methodOut.getWse20bS())); 
//  DISPLAY '*1035* WSE-20B-T-GRP-R = (' WSE-20B-T-GRP-R ')'
          logger.info("*1035* WSE-20B-T-GRP-R = ({})", new String(methodIn.getWse20bTGrpR())); 
//  DISPLAY '*1036* WSE-20B-T-GRP   = (' WSE-20B-T-GRP ')'
          logger.info("*1036* WSE-20B-T-GRP   = ({})", methodIn.getWse20bTGrp().toString()); 
//  DISPLAY '*1037* WSE-20B-T       = (' WSE-20B-T ')'
          logger.info("*1037* WSE-20B-T       = ({})", methodOut.getWse20bT().toString()); 
//  DISPLAY '*1038*   WSE-20B-T-FLD1= (' WSE-20B-T-FLD1 ')'
          logger.info("*1038*   WSE-20B-T-FLD1= ({})", new String(methodOut.getWse20bTFld1())); 
//  DISPLAY '*1039*   WSE-20B-T-FLD2= (' WSE-20B-T-FLD2 ')'
          logger.info("*1039*   WSE-20B-T-FLD2= ({})", new String(methodOut.getWse20bTFld2())); 
//  DISPLAY '*1040*   WSE-20B-T-FLD3= (' WSE-20B-T-FLD3 ')'
          logger.info("*1040*   WSE-20B-T-FLD3= ({})", new String(methodOut.getWse20bTFld3())); 

// *
// * Src -> string; tgt -> group ; src same size as tgt
// *    src offset 5  ;
// *
//  INITIALIZE WSE-20C-S WSE-20C-T
          methodOut.getWse20cS().initialize();
          methodOut.setWse20cT(CONSTANTS.SPACE_60 /* Fill 60 Spaces*/);
//  MOVE ALL 'ABCD' TO WSE-20C-S-FLD1
          methodOut.setWse20cSFld1(CONSTANTS.LITERAL_ABCDABCDABCD);
//  MOVE ALL 'MNOP' TO WSE-20C-S-FLD2
          methodOut.setWse20cSFld2(CONSTANTS.LITERAL_MNOPMNOPMNOPMNOPMNOP);
//  MOVE ALL 'VXYZ' TO WSE-20C-S-FLD3
          methodOut.setWse20cSFld3(CONSTANTS.LITERAL_VXYZVXYZVXYZVXYZVXYZVXYZVXYZVXYZ);
//  MOVE WSE-20C-S ( 1 : LENGTH OF WSE-20C-S ) TO WSE-20C-T
          methodIn.getWse20cTGroup().replace(methodIn.getWse20cSGrp()/*parent*/,5/*fromOffset - (wse20cT) */,Wse20cS.getWse20cSFieldLength()/*fromLen*/,0/*toOffset - (wse20cS) */,60/*toLen*/);

// *
//  DISPLAY '*1041* WSE-20C-S-GRP   = (' WSE-20C-S-GRP ')'
          logger.info("*1041* WSE-20C-S-GRP   = ({})", methodIn.getWse20cSGrp().toString()); 
//  DISPLAY '*1042* WSE-20C-S       = (' WSE-20C-S ')'
          logger.info("*1042* WSE-20C-S       = ({})", methodOut.getWse20cS().toString()); 
//  DISPLAY '*1043*   WSE-20C-S-FLD1= (' WSE-20C-S-FLD1 ')'
          logger.info("*1043*   WSE-20C-S-FLD1= ({})", new String(methodOut.getWse20cSFld1())); 
//  DISPLAY '*1044*   WSE-20C-S-FLD2= (' WSE-20C-S-FLD2 ')'
          logger.info("*1044*   WSE-20C-S-FLD2= ({})", new String(methodOut.getWse20cSFld2())); 
//  DISPLAY '*1045*   WSE-20C-S-FLD3= (' WSE-20C-S-FLD3 ')'
          logger.info("*1045*   WSE-20C-S-FLD3= ({})", new String(methodOut.getWse20cSFld3())); 
      
      return methodOut;
      }
      /**
      * mainlineSplit34 
      *   This method is derived from 
  *   COBOL Paragraph - MAINLINE-SPLIT34 COBOL Cyclomatic complexity - 1
      * Input  :  

      * - wse20cTR                       COBOL Name: WSE-20C-T-R
      * - wse20cT                        COBOL Name: WSE-20C-T
      *
      * Output : None 

      * @throws CFException
      */
      @Override
      public void mainlineSplit34(MainlineSplit34InCtx methodIn) throws Exception {
Refmod1Ctx programCtx = methodIn.getRefmod1Ctx();
//  DISPLAY '*1046* WSE-20C-T-R     = (' WSE-20C-T-R ')'
          logger.info("*1046* WSE-20C-T-R     = ({})", new String(methodIn.getWse20cTR())); 
//  DISPLAY '*1047* WSE-20C-T       = (' WSE-20C-T ')'
          logger.info("*1047* WSE-20C-T       = ({})", new String(methodIn.getWse20cT())); 

// *
//  STOP RUN
          throw Terminate.TERMINATE;
      
      }
  
  
  
  
  
  
  
  
  }
