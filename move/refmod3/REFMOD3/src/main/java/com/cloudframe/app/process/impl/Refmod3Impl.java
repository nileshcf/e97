  package com.cloudframe.app.process.impl;
  /* 
*
*/
  
  import com.cloudframe.app.refmod3.Refmod3Ctx.*;
  import com.cloudframe.app.refmod3.Refmod3Ctx;
  import com.cloudframe.app.process.Refmod3;
  import com.cloudframe.app.process.BaseProcess;
  import org.springframework.web.bind.annotation.GetMapping;
  import org.slf4j.Logger;
  import org.slf4j.LoggerFactory;
  import com.cloudframe.app.exception.CFException;
  import org.springframework.stereotype.Component;
  import org.springframework.web.bind.annotation.RestController;
  import com.cloudframe.app.dto.GlobalExecutorCtx;
  import com.cloudframe.app.utility.CFUtil;
  import com.cloudframe.app.exception.Terminate;
  import com.cloudframe.app.refmod3.dto.*;
  import com.cloudframe.app.refmod3.dto.AdRptDate7JulnGroup;
  import com.cloudframe.app.refmod3.dto.ATGrp217;
  import com.cloudframe.app.refmod3.dto.ATGrp29;
  import com.cloudframe.app.refmod3.dto.Wse23bS;
  import com.cloudframe.app.refmod3.dto.BT24;
  import com.cloudframe.app.refmod3.dto.Wse219aTGrp;
  import com.cloudframe.app.refmod3.dto.Wse211aTGrp;
  import com.cloudframe.app.refmod3.dto.AS21;
  import com.cloudframe.app.refmod3.dto.Wse210bTGrp;
  import com.cloudframe.app.refmod3.dto.Wse24aT;
  import com.cloudframe.app.refmod3.dto.ASGrp26;
  import com.cloudframe.app.refmod3.dto.ATGrp27;
  import com.cloudframe.app.refmod3.dto.BS27;
  import com.cloudframe.app.refmod3.dto.ASGrp215;
  import com.cloudframe.app.refmod3.dto.BTGrp213;
  import com.cloudframe.app.refmod3.dto.BTGrp214;
  import com.cloudframe.app.refmod3.dto.AS211;
  import com.cloudframe.app.refmod3.dto.Wse219bS;
  import com.cloudframe.app.refmod3.dto.Wse218aTGrp;
  import com.cloudframe.app.refmod3.dto.Wse27bTGrp;
  import com.cloudframe.app.refmod3.dto.Wse211aS;
  import com.cloudframe.app.refmod3.dto.Wse26aSGrp;
  import com.cloudframe.app.refmod3.dto.ASGrp216;
  import com.cloudframe.app.refmod3.dto.BT22;
  import com.cloudframe.app.refmod3.dto.BS21;
  import com.cloudframe.app.refmod3.dto.AT216;
  import com.cloudframe.app.refmod3.dto.Wse217bS;
  import com.cloudframe.app.refmod3.dto.AT215;
  import com.cloudframe.app.refmod3.dto.Wse220bTGrp;
  import com.cloudframe.app.refmod3.dto.Wse215bSGrp;
  import com.cloudframe.app.refmod3.dto.BTGrp28;
  import com.cloudframe.app.refmod3.dto.AS217;
  import com.cloudframe.app.refmod3.dto.Wse213bSGrp;
  import com.cloudframe.app.refmod3.dto.AT22;
  import com.cloudframe.app.refmod3.dto.BTGrp29;
  import com.cloudframe.app.refmod3.dto.ATGrp28;
  import com.cloudframe.app.refmod3.dto.Wse23bT;
  import com.cloudframe.app.refmod3.dto.ASGrp213;
  import com.cloudframe.app.refmod3.dto.Wse217aS;
  import com.cloudframe.app.refmod3.dto.Wse28aTGrp;
  import com.cloudframe.app.refmod3.dto.Wse215aSGrp;
  import com.cloudframe.app.refmod3.dto.Wse217aTGrp;
  import com.cloudframe.app.refmod3.dto.Wse215aT;
  import com.cloudframe.app.refmod3.dto.Wse28bTGrp;
  import com.cloudframe.app.refmod3.dto.Wse22aT;
  import com.cloudframe.app.refmod3.dto.BTGrp218;
  import com.cloudframe.app.refmod3.dto.Wse216aT;
  import com.cloudframe.app.refmod3.dto.Wse214aTGrp;
  import com.cloudframe.app.refmod3.dto.Wse27aTGrp;
  import com.cloudframe.app.refmod3.dto.AT25;
  import com.cloudframe.app.refmod3.dto.BT216;
  import com.cloudframe.app.refmod3.dto.Wse210aSGrp;
  import com.cloudframe.app.refmod3.dto.BSGrp25;
  import com.cloudframe.app.refmod3.dto.Wse24bT;
  import com.cloudframe.app.refmod3.dto.Wse25aT;
  import com.cloudframe.app.refmod3.dto.BT23;
  import com.cloudframe.app.refmod3.dto.BTGrp212;
  import com.cloudframe.app.refmod3.dto.Wse210bSGrp;
  import com.cloudframe.app.refmod3.dto.Wse21aS;
  import com.cloudframe.app.refmod3.dto.BSGrp26;
  import com.cloudframe.app.refmod3.dto.Wse214bSGrp;
  import com.cloudframe.app.refmod3.dto.BTGrp217;
  import com.cloudframe.app.refmod3.dto.BSGrp216;
  import com.cloudframe.app.refmod3.dto.BSGrp210;
  import com.cloudframe.app.refmod3.dto.Wse213bTGrp;
  import com.cloudframe.app.refmod3.dto.BSGrp29;
  import com.cloudframe.app.refmod3.dto.Wse220cSGrp;
  import com.cloudframe.app.refmod3.dto.BT215;
  import com.cloudframe.app.refmod3.dto.BT26;
  import com.cloudframe.app.refmod3.dto.AT21;
  import com.cloudframe.app.refmod3.dto.ASGrp210;
  import com.cloudframe.app.refmod3.dto.Wse210aTGrp;
  import com.cloudframe.app.refmod3.dto.Wse220aTGrp;
  import com.cloudframe.app.refmod3.dto.Wse29bSGrp;
  import com.cloudframe.app.refmod3.dto.BTGrp220;
  import com.cloudframe.app.refmod3.dto.Wse25aSGrp;
  import com.cloudframe.app.refmod3.dto.ATGrp219;
  import com.cloudframe.app.refmod3.dto.Wse22bT;
  import com.cloudframe.app.refmod3.dto.ATGrp211;
  import com.cloudframe.app.refmod3.dto.Wse27bS;
  import com.cloudframe.app.refmod3.dto.ATGrp214;
  import com.cloudframe.app.refmod3.dto.BSGrp215;
  import com.cloudframe.app.refmod3.dto.ATGrp210;
  import com.cloudframe.app.refmod3.dto.Wse23aS;
  import com.cloudframe.app.refmod3.dto.ASGrp29;
  import com.cloudframe.app.refmod3.dto.Wse26bSGrp;
  import com.cloudframe.app.refmod3.dto.ATGrp218;
  import com.cloudframe.app.refmod3.dto.Wse211bS;
  import com.cloudframe.app.refmod3.dto.AT26;
  import com.cloudframe.app.refmod3.dto.Wse25bT;
  import com.cloudframe.app.refmod3.dto.ASGrp214;
  import com.cloudframe.app.refmod3.dto.Wse25bSGrp;
  import com.cloudframe.app.refmod3.dto.BTGrp211;
  import com.cloudframe.app.refmod3.dto.Wse213aSGrp;
  import com.cloudframe.app.refmod3.dto.Wse21bT;
  import com.cloudframe.app.refmod3.dto.BS219;
  import com.cloudframe.app.refmod3.dto.Wse219bTGrp;
  import com.cloudframe.app.refmod3.dto.AT24;
  import com.cloudframe.app.refmod3.dto.Wse27aS;
  import com.cloudframe.app.refmod3.dto.Wse21bS;
  import com.cloudframe.app.refmod3.dto.Wse29aSGrp;
  import com.cloudframe.app.refmod3.dto.BT25;
  import com.cloudframe.app.refmod3.dto.ATGrp212;
  import com.cloudframe.app.refmod3.dto.Wse23aT;
  import com.cloudframe.app.refmod3.dto.Wse214aSGrp;
  import com.cloudframe.app.refmod3.dto.Wse216bSGrp;
  import com.cloudframe.app.refmod3.dto.BTGrp27;
  import com.cloudframe.app.refmod3.dto.BS211;
  import com.cloudframe.app.refmod3.dto.Wse219aS;
  import com.cloudframe.app.refmod3.dto.Wse29bTGrp;
  import com.cloudframe.app.refmod3.dto.ASGrp25;
  import com.cloudframe.app.refmod3.dto.Wse212bTGrp;
  import com.cloudframe.app.refmod3.dto.Wse217bTGrp;
  import com.cloudframe.app.refmod3.dto.Wse212aTGrp;
  import com.cloudframe.app.refmod3.dto.Wse211bTGrp;
  import com.cloudframe.app.refmod3.dto.BS23;
  import com.cloudframe.app.refmod3.dto.Wse215bT;
  import com.cloudframe.app.refmod3.dto.BSGrp214;
  import com.cloudframe.app.refmod3.dto.AS27;
  import com.cloudframe.app.refmod3.dto.Wse216aSGrp;
  import com.cloudframe.app.refmod3.dto.Wse29aTGrp;
  import com.cloudframe.app.refmod3.dto.Wse216bT;
  import com.cloudframe.app.refmod3.dto.AS23;
  import com.cloudframe.app.refmod3.dto.BSGrp213;
  import com.cloudframe.app.refmod3.dto.Wse26aT;
  import com.cloudframe.app.refmod3.dto.AS219;
  import com.cloudframe.app.refmod3.dto.BTGrp210;
  import com.cloudframe.app.refmod3.dto.BTGrp219;
  import com.cloudframe.app.refmod3.dto.ATGrp213;
  import com.cloudframe.app.refmod3.dto.Wse213aTGrp;
  import com.cloudframe.app.refmod3.dto.Wse218bTGrp;
  import com.cloudframe.app.refmod3.dto.Wse214bTGrp;
  import com.cloudframe.app.refmod3.dto.ATGrp220;
  import com.cloudframe.app.refmod3.dto.BT21;
  import com.cloudframe.app.refmod3.dto.BS217;
  import com.cloudframe.app.refmod3.dto.Wse26bT;
  import com.cloudframe.app.refmod3.dto.AT23;
  import com.cloudframe.app.refmod3.dto.Wse21aT;
  import com.cloudframe.app.refmod3.dto.Work;
  import com.cloudframe.app.common.CONSTANTS;
  
  @Component("refmod3")
  
  public class Refmod3Impl extends CommonProcess implements Refmod3 {
  
  Logger logger = LoggerFactory.getLogger(Refmod3Impl.class);
  
  
  
  
  
  
  
  
  
  
      /**
      * process 
      * Input  : None 

      * Output : None 

      * @throws CFException
      */
      public int process(Refmod3Ctx programCtx) throws Exception {
			// Declare local variables used in the method
			 final int A_S_22_LENGTH = 70;
			 final int B_S_22_LENGTH = 70;
			 final int A_S_26_LENGTH = 70;
			 final int B_S_26_LENGTH = 70;
			 final int A_S_28_LENGTH = 70;
			 final int B_S_28_LENGTH = 70;
			 final int A_S_210_LENGTH = 70;
			 final int B_S_210_LENGTH = 70;
			 final int A_S_214_LENGTH = 70;
			 final int B_S_214_LENGTH = 70;
			 final int A_S_216_LENGTH = 70;
			 final int B_S_216_LENGTH = 70;
			 final int A_S_218_LENGTH = 70;
			 final int B_S_218_LENGTH = 70;
			 final int WSE_22A_S_LENGTH = 60;
			 final int WSE_22B_S_LENGTH = 60;
			 final int WSE_26A_S_LENGTH = 60;
			 final int WSE_26B_S_LENGTH = 60;
			 final int WSE_28A_S_LENGTH = 60;
			 final int WSE_28B_S_LENGTH = 60;
			 final int WSE_210A_S_LENGTH = 60;
			 final int WSE_210B_S_LENGTH = 60;
			 final int WSE_214A_S_LENGTH = 60;
			 final int WSE_214B_S_LENGTH = 60;
			 final int WSE_216A_S_LENGTH = 60;
			 final int WSE_216B_S_LENGTH = 60;
			 final int WSE_218A_S_LENGTH = 60;
			 final int WSE_218B_S_LENGTH = 60;
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
  *   COBOL Paragraph - MAINLINE COBOL Cyclomatic complexity - 3
      * Input  : None 

      * Output : None 

      * @throws CFException
      */
      @Override
      public void mainline(Refmod3Ctx programCtx) throws Exception {
      
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
      
      }
      /**
      * mainlineSplit0 
      *   This method is derived from 
  *   COBOL Paragraph - MAINLINE-SPLIT0 COBOL Cyclomatic complexity - 1
      * Input  : None 

      * Output :  

      * - one                            COBOL Name: WS-ONE
      * - three                          COBOL Name: WS-THREE
      * - five                           COBOL Name: WS-FIVE
      * - aSGrp25                        COBOL Name: WS-2-5A-S-GRP
      * - bSGrp25                        COBOL Name: WS-2-5B-S-GRP
      * - aSGrp26                        COBOL Name: WS-2-6A-S-GRP
      * - bSGrp26                        COBOL Name: WS-2-6B-S-GRP
      * - aTGrp27                        COBOL Name: WS-2-7A-T-GRP
      * - bTGrp27                        COBOL Name: WS-2-7B-T-GRP
      * - aTGrp28                        COBOL Name: WS-2-8A-T-GRP
      * - bTGrp28                        COBOL Name: WS-2-8B-T-GRP
      * - aSGrp29                        COBOL Name: WS-2-9A-S-GRP
      * - aTGrp29                        COBOL Name: WS-2-9A-T-GRP
      * - bSGrp29                        COBOL Name: WS-2-9B-S-GRP
      * - bTGrp29                        COBOL Name: WS-2-9B-T-GRP
      * - aSGrp210                       COBOL Name: WS-2-10A-S-GRP
      * - aTGrp210                       COBOL Name: WS-2-10A-T-GRP
      * - bSGrp210                       COBOL Name: WS-2-10B-S-GRP
      * - bTGrp210                       COBOL Name: WS-2-10B-T-GRP
      * - aTGrp211                       COBOL Name: WS-2-11A-T-GRP
      * - bTGrp211                       COBOL Name: WS-2-11B-T-GRP
      * - aTGrp212                       COBOL Name: WS-2-12A-T-GRP
      * - bTGrp212                       COBOL Name: WS-2-12B-T-GRP
      * - aSGrp213                       COBOL Name: WS-2-13A-S-GRP
      * - aTGrp213                       COBOL Name: WS-2-13A-T-GRP
      * - bSGrp213                       COBOL Name: WS-2-13B-S-GRP
      * - bTGrp213                       COBOL Name: WS-2-13B-T-GRP
      * - aSGrp214                       COBOL Name: WS-2-14A-S-GRP
      * - aTGrp214                       COBOL Name: WS-2-14A-T-GRP
      * - bSGrp214                       COBOL Name: WS-2-14B-S-GRP
      * - bTGrp214                       COBOL Name: WS-2-14B-T-GRP
      * - aSGrp215                       COBOL Name: WS-2-15A-S-GRP
      * - bSGrp215                       COBOL Name: WS-2-15B-S-GRP
      * - aSGrp216                       COBOL Name: WS-2-16A-S-GRP
      * - bSGrp216                       COBOL Name: WS-2-16B-S-GRP
      * - aTGrp217                       COBOL Name: WS-2-17A-T-GRP
      * - bTGrp217                       COBOL Name: WS-2-17B-T-GRP
      * - aTGrp218                       COBOL Name: WS-2-18A-T-GRP
      * - bTGrp218                       COBOL Name: WS-2-18B-T-GRP
      * - aTGrp219                       COBOL Name: WS-2-19A-T-GRP
      * - bTGrp219                       COBOL Name: WS-2-19B-T-GRP
      * - aTGrp220                       COBOL Name: WS-2-20A-T-GRP
      * - bTGrp220                       COBOL Name: WS-2-20B-T-GRP
      * - wse25aSGrp                     COBOL Name: WSE-2-5A-S-GRP
      * - wse25bSGrp                     COBOL Name: WSE-2-5B-S-GRP
      * - wse26aSGrp                     COBOL Name: WSE-2-6A-S-GRP
      * - wse26bSGrp                     COBOL Name: WSE-2-6B-S-GRP
      * - wse27aTGrp                     COBOL Name: WSE-2-7A-T-GRP
      * - wse27bTGrp                     COBOL Name: WSE-2-7B-T-GRP
      * - wse28aTGrp                     COBOL Name: WSE-2-8A-T-GRP
      * - wse28bTGrp                     COBOL Name: WSE-2-8B-T-GRP
      * - wse29aSGrp                     COBOL Name: WSE-2-9A-S-GRP
      * - wse29aTGrp                     COBOL Name: WSE-2-9A-T-GRP
      * - wse29bSGrp                     COBOL Name: WSE-2-9B-S-GRP
      * - wse29bTGrp                     COBOL Name: WSE-2-9B-T-GRP
      * - wse210aSGrp                    COBOL Name: WSE-2-10A-S-GRP
      * - wse210aTGrp                    COBOL Name: WSE-2-10A-T-GRP
      * - wse210bSGrp                    COBOL Name: WSE-2-10B-S-GRP
      * - wse210bTGrp                    COBOL Name: WSE-2-10B-T-GRP
      * - wse211aTGrp                    COBOL Name: WSE-2-11A-T-GRP
      * - wse211bTGrp                    COBOL Name: WSE-2-11B-T-GRP
      * - wse212aTGrp                    COBOL Name: WSE-2-12A-T-GRP
      * - wse212bTGrp                    COBOL Name: WSE-2-12B-T-GRP
      * - wse213aSGrp                    COBOL Name: WSE-2-13A-S-GRP
      * - wse213aTGrp                    COBOL Name: WSE-2-13A-T-GRP
      * - wse213bSGrp                    COBOL Name: WSE-2-13B-S-GRP
      * - wse213bTGrp                    COBOL Name: WSE-2-13B-T-GRP
      * - wse214aSGrp                    COBOL Name: WSE-2-14A-S-GRP
      * - wse214aTGrp                    COBOL Name: WSE-2-14A-T-GRP
      * - wse214bSGrp                    COBOL Name: WSE-2-14B-S-GRP
      * - wse214bTGrp                    COBOL Name: WSE-2-14B-T-GRP
      * - wse215aSGrp                    COBOL Name: WSE-2-15A-S-GRP
      * - wse215bSGrp                    COBOL Name: WSE-2-15B-S-GRP
      * - wse216aSGrp                    COBOL Name: WSE-2-16A-S-GRP
      * - wse216bSGrp                    COBOL Name: WSE-2-16B-S-GRP
      * - wse217aTGrp                    COBOL Name: WSE-2-17A-T-GRP
      * - wse217bTGrp                    COBOL Name: WSE-2-17B-T-GRP
      * - wse218aTGrp                    COBOL Name: WSE-2-18A-T-GRP
      * - wse218bTGrp                    COBOL Name: WSE-2-18B-T-GRP
      * - wse219aTGrp                    COBOL Name: WSE-2-19A-T-GRP
      * - wse219bTGrp                    COBOL Name: WSE-2-19B-T-GRP
      * - wse220aTGrp                    COBOL Name: WSE-2-20A-T-GRP
      * - wse220bTGrp                    COBOL Name: WSE-2-20B-T-GRP
      * - aS21                           COBOL Name: WS-2-1A-S
      * - aT21                           COBOL Name: WS-2-1A-T
      * - aSFld121                       COBOL Name: WS-2-1A-S-FLD1
      * - aSFld221                       COBOL Name: WS-2-1A-S-FLD2
      * - aTFld121                       COBOL Name: WS-2-1A-T-FLD1
      * - aTFld221                       COBOL Name: WS-2-1A-T-FLD2
      * - sLen2                          COBOL Name: WS-2-S-LEN
      * - tLen2                          COBOL Name: WS-2-T-LEN
      * - bS21                           COBOL Name: WS-2-1B-S
      * - bT21                           COBOL Name: WS-2-1B-T
      * - bSFld121                       COBOL Name: WS-2-1B-S-FLD1
      * - bSFld221                       COBOL Name: WS-2-1B-S-FLD2
      * - bTFld321                       COBOL Name: WS-2-1B-T-FLD3
      * - bTFld121                       COBOL Name: WS-2-1B-T-FLD1
      * - bTFld221                       COBOL Name: WS-2-1B-T-FLD2
      *
      * @throws CFException
      */
      @Override
      public MainlineSplit0OutCtx mainlineSplit0(MainlineSplit0InCtx methodIn) throws Exception {
Refmod3Ctx programCtx = methodIn.getRefmod3Ctx();
MainlineSplit0OutCtx methodOut = methodIn.getMainlineSplit0OutCtx();
          // MOVE 1 TO WS-ONE
          methodOut.setOne(1);
          // MOVE 3 TO WS-THREE
          methodOut.setThree(3);
          // MOVE 5 TO WS-FIVE
          methodOut.setFive(5);

// *
//  MOVE ALL '*' TO WS-2-5A-S-GRP WS-2-5B-S-GRP WS-2-6A-S-GRP WS-2-6B-S-GRP WS-2-7A-T-GRP WS-2-7B-T-GRP WS-2-8A-T-GRP WS-2-8B-T-GRP WS-2-9A-S-GRP WS-2-9A-T-GRP WS-2-9B-S-GRP WS-2-9B-T-GRP WS-2-10A-S-GRP WS-2-10A-T-GRP WS-2-10B-S-GRP WS-2-10B-T-GRP WS-2-11A-T-GRP WS-2-11B-T-GRP WS-2-12A-T-GRP WS-2-12B-T-GRP WS-2-13A-S-GRP WS-2-13A-T-GRP WS-2-13B-S-GRP WS-2-13B-T-GRP WS-2-14A-S-GRP WS-2-14A-T-GRP WS-2-14B-S-GRP WS-2-14B-T-GRP WS-2-15A-S-GRP WS-2-15B-S-GRP WS-2-16A-S-GRP WS-2-16B-S-GRP WS-2-17A-T-GRP WS-2-17B-T-GRP WS-2-18A-T-GRP WS-2-18B-T-GRP WS-2-19A-T-GRP WS-2-19B-T-GRP WS-2-20A-T-GRP WS-2-20B-T-GRP
          methodOut.getASGrp25().setString(CONSTANTS.LITERAL_897270192);
          methodOut.getBSGrp25().setString(CONSTANTS.LITERAL_897270192);
          methodOut.getASGrp26().setString(CONSTANTS.LITERAL_897270192);
          methodOut.getBSGrp26().setString(CONSTANTS.LITERAL_897270192);
          methodOut.getATGrp27().setString(CONSTANTS.LITERAL_2022809837);
          methodOut.getBTGrp27().setString(CONSTANTS.LITERAL_1988861456);
          methodOut.getATGrp28().setString(CONSTANTS.LITERAL_2022809837);
          methodOut.getBTGrp28().setString(CONSTANTS.LITERAL_1988861456);
          methodOut.getASGrp29().setString(CONSTANTS.LITERAL_897270192);
          methodOut.getATGrp29().setString(CONSTANTS.LITERAL_2022809837);
          methodOut.getBSGrp29().setString(CONSTANTS.LITERAL_897270192);
          methodOut.getBTGrp29().setString(CONSTANTS.LITERAL_1988861456);
          methodOut.getASGrp210().setString(CONSTANTS.LITERAL_897270192);
          methodOut.getATGrp210().setString(CONSTANTS.LITERAL_2022809837);
          methodOut.getBSGrp210().setString(CONSTANTS.LITERAL_897270192);
          methodOut.getBTGrp210().setString(CONSTANTS.LITERAL_1988861456);
          methodOut.getATGrp211().setString(CONSTANTS.LITERAL_2022809837);
          methodOut.getBTGrp211().setString(CONSTANTS.LITERAL_1988861456);
          methodOut.getATGrp212().setString(CONSTANTS.LITERAL_2022809837);
          methodOut.getBTGrp212().setString(CONSTANTS.LITERAL_1988861456);
          methodOut.getASGrp213().setString(CONSTANTS.LITERAL_897270192);
          methodOut.getATGrp213().setString(CONSTANTS.LITERAL_2022809837);
          methodOut.getBSGrp213().setString(CONSTANTS.LITERAL_897270192);
          methodOut.getBTGrp213().setString(CONSTANTS.LITERAL_1988861456);
          methodOut.getASGrp214().setString(CONSTANTS.LITERAL_897270192);
          methodOut.getATGrp214().setString(CONSTANTS.LITERAL_2022809837);
          methodOut.getBSGrp214().setString(CONSTANTS.LITERAL_897270192);
          methodOut.getBTGrp214().setString(CONSTANTS.LITERAL_1988861456);
          methodOut.getASGrp215().setString(CONSTANTS.LITERAL_897270192);
          methodOut.getBSGrp215().setString(CONSTANTS.LITERAL_897270192);
          methodOut.getASGrp216().setString(CONSTANTS.LITERAL_897270192);
          methodOut.getBSGrp216().setString(CONSTANTS.LITERAL_897270192);
          methodOut.getATGrp217().setString(CONSTANTS.LITERAL_2022809837);
          methodOut.getBTGrp217().setString(CONSTANTS.LITERAL_1988861456);
          methodOut.getATGrp218().setString(CONSTANTS.LITERAL_2022809837);
          methodOut.getBTGrp218().setString(CONSTANTS.LITERAL_1988861456);
          methodOut.getATGrp219().setString(CONSTANTS.LITERAL_2022809837);
          methodOut.getBTGrp219().setString(CONSTANTS.LITERAL_1988861456);
          methodOut.getATGrp220().setString(CONSTANTS.LITERAL_2022809837);
          methodOut.getBTGrp220().setString(CONSTANTS.LITERAL_1988861456);
//  MOVE ALL '*' TO WSE-2-5A-S-GRP WSE-2-5B-S-GRP WSE-2-6A-S-GRP WSE-2-6B-S-GRP WSE-2-7A-T-GRP WSE-2-7B-T-GRP WSE-2-8A-T-GRP WSE-2-8B-T-GRP WSE-2-9A-S-GRP WSE-2-9A-T-GRP WSE-2-9B-S-GRP WSE-2-9B-T-GRP WSE-2-10A-S-GRP WSE-2-10A-T-GRP WSE-2-10B-S-GRP WSE-2-10B-T-GRP WSE-2-11A-T-GRP WSE-2-11B-T-GRP WSE-2-12A-T-GRP WSE-2-12B-T-GRP WSE-2-13A-S-GRP WSE-2-13A-T-GRP WSE-2-13B-S-GRP WSE-2-13B-T-GRP WSE-2-14A-S-GRP WSE-2-14A-T-GRP WSE-2-14B-S-GRP WSE-2-14B-T-GRP WSE-2-15A-S-GRP WSE-2-15B-S-GRP WSE-2-16A-S-GRP WSE-2-16B-S-GRP WSE-2-17A-T-GRP WSE-2-17B-T-GRP WSE-2-18A-T-GRP WSE-2-18B-T-GRP WSE-2-19A-T-GRP WSE-2-19B-T-GRP WSE-2-20A-T-GRP WSE-2-20B-T-GRP
          methodOut.getWse25aSGrp().setString(CONSTANTS.LITERAL_885954065);
          methodOut.getWse25bSGrp().setString(CONSTANTS.LITERAL_885954065);
          methodOut.getWse26aSGrp().setString(CONSTANTS.LITERAL_885954065);
          methodOut.getWse26bSGrp().setString(CONSTANTS.LITERAL_885954065);
          methodOut.getWse27aTGrp().setString(CONSTANTS.LITERAL_2022809837);
          methodOut.getWse27bTGrp().setString(CONSTANTS.LITERAL_2022809837);
          methodOut.getWse28aTGrp().setString(CONSTANTS.LITERAL_2022809837);
          methodOut.getWse28bTGrp().setString(CONSTANTS.LITERAL_2022809837);
          methodOut.getWse29aSGrp().setString(CONSTANTS.LITERAL_885954065);
          methodOut.getWse29aTGrp().setString(CONSTANTS.LITERAL_2022809837);
          methodOut.getWse29bSGrp().setString(CONSTANTS.LITERAL_885954065);
          methodOut.getWse29bTGrp().setString(CONSTANTS.LITERAL_2022809837);
          methodOut.getWse210aSGrp().setString(CONSTANTS.LITERAL_885954065);
          methodOut.getWse210aTGrp().setString(CONSTANTS.LITERAL_2022809837);
          methodOut.getWse210bSGrp().setString(CONSTANTS.LITERAL_885954065);
          methodOut.getWse210bTGrp().setString(CONSTANTS.LITERAL_2022809837);
          methodOut.getWse211aTGrp().setString(CONSTANTS.LITERAL_2022809837);
          methodOut.getWse211bTGrp().setString(CONSTANTS.LITERAL_2022809837);
          methodOut.getWse212aTGrp().setString(CONSTANTS.LITERAL_2022809837);
          methodOut.getWse212bTGrp().setString(CONSTANTS.LITERAL_2022809837);
          methodOut.getWse213aSGrp().setString(CONSTANTS.LITERAL_885954065);
          methodOut.getWse213aTGrp().setString(CONSTANTS.LITERAL_2022809837);
          methodOut.getWse213bSGrp().setString(CONSTANTS.LITERAL_885954065);
          methodOut.getWse213bTGrp().setString(CONSTANTS.LITERAL_2022809837);
          methodOut.getWse214aSGrp().setString(CONSTANTS.LITERAL_885954065);
          methodOut.getWse214aTGrp().setString(CONSTANTS.LITERAL_2022809837);
          methodOut.getWse214bSGrp().setString(CONSTANTS.LITERAL_885954065);
          methodOut.getWse214bTGrp().setString(CONSTANTS.LITERAL_2022809837);
          methodOut.getWse215aSGrp().setString(CONSTANTS.LITERAL_885954065);
          methodOut.getWse215bSGrp().setString(CONSTANTS.LITERAL_885954065);
          methodOut.getWse216aSGrp().setString(CONSTANTS.LITERAL_885954065);
          methodOut.getWse216bSGrp().setString(CONSTANTS.LITERAL_885954065);
          methodOut.getWse217aTGrp().setString(CONSTANTS.LITERAL_2022809837);
          methodOut.getWse217bTGrp().setString(CONSTANTS.LITERAL_2022809837);
          methodOut.getWse218aTGrp().setString(CONSTANTS.LITERAL_2022809837);
          methodOut.getWse218bTGrp().setString(CONSTANTS.LITERAL_2022809837);
          methodOut.getWse219aTGrp().setString(CONSTANTS.LITERAL_2022809837);
          methodOut.getWse219bTGrp().setString(CONSTANTS.LITERAL_2022809837);
          methodOut.getWse220aTGrp().setString(CONSTANTS.LITERAL_2022809837);
          methodOut.getWse220bTGrp().setString(CONSTANTS.LITERAL_2022809837);

// *
// * Src -> group; tgt -> group ; src bigger than tgt
// *
//  INITIALIZE WS-2-1A-S WS-2-1A-T
          methodOut.getAS21().initialize();
          methodOut.getAT21().initialize();
//  MOVE ALL 'ABCD' TO WS-2-1A-S-FLD1
          methodOut.setASFld121(CONSTANTS.LITERAL_ABCDABCDABCDABCDABCDABCDABCDABCD);
//  MOVE ALL 'ZYXW' TO WS-2-1A-S-FLD2
          methodOut.setASFld221(CONSTANTS.LITERAL_645286444);
//  MOVE WS-2-1A-S ( WS-ONE : LENGTH OF WS-2-1A-S ) TO WS-2-1A-T ( WS-ONE : LENGTH OF WS-2-1A-T )
          methodOut.getAT21().replace(methodOut.getAS21(),(methodOut.getOne()-1),AS21.getAS21FieldLength(),(methodOut.getOne()-1),AT21.getAT21FieldLength() /* replace,sourceIndex,sourceLen,targetIndex,targetLen */);

// *
//  DISPLAY '*  1* WS-2-1A-S        = (' WS-2-1A-S ')'
          logger.info("*  1* WS-2-1A-S        = ({})", methodOut.getAS21().toString()); 
//  DISPLAY '*  2*   WS-2-1A-S-FLD1 = (' WS-2-1A-S-FLD1 ')'
          logger.info("*  2*   WS-2-1A-S-FLD1 = ({})", new String(methodOut.getASFld121())); 
//  DISPLAY '*  3*   WS-2-1A-S-FLD2 = (' WS-2-1A-S-FLD2 ')'
          logger.info("*  3*   WS-2-1A-S-FLD2 = ({})", new String(methodOut.getASFld221())); 
//  DISPLAY '*  4* WS-2-1A-T        = (' WS-2-1A-T ')'
          logger.info("*  4* WS-2-1A-T        = ({})", methodOut.getAT21().toString()); 
//  DISPLAY '*  5*   WS-2-1A-T-FLD1 = (' WS-2-1A-T-FLD1 ')'
          logger.info("*  5*   WS-2-1A-T-FLD1 = ({})", new String(methodOut.getATFld121())); 
//  DISPLAY '*  6*   WS-2-1A-T-FLD2 = (' WS-2-1A-T-FLD2 ')'
          logger.info("*  6*   WS-2-1A-T-FLD2 = ({})", new String(methodOut.getATFld221())); 

// *
//  INITIALIZE WS-2-1A-S WS-2-1A-T
          methodOut.getAS21().initialize();
          methodOut.getAT21().initialize();
//  MOVE ALL 'ABCD' TO WS-2-1A-S-FLD1
          methodOut.setASFld121(CONSTANTS.LITERAL_ABCDABCDABCDABCDABCDABCDABCDABCD);
//  MOVE ALL 'ZYXW' TO WS-2-1A-S-FLD2
          methodOut.setASFld221(CONSTANTS.LITERAL_645286444);
//  MOVE LENGTH OF WS-2-1A-S TO WS-2-S-LEN
          methodOut.setSLen2((short) AS21.getAS21FieldLength());
//  MOVE LENGTH OF WS-2-1A-T TO WS-2-T-LEN
          methodOut.setTLen2((short) AT21.getAT21FieldLength());
//  MOVE WS-2-1A-S ( WS-ONE : WS-2-S-LEN ) TO WS-2-1A-T ( WS-ONE : WS-2-T-LEN )
          methodOut.getAT21().replace(methodOut.getAS21(),(methodOut.getOne()-1),methodOut.getSLen2(),(methodOut.getOne()-1),methodOut.getTLen2() /* replace,sourceIndex,sourceLen,targetIndex,targetLen */);

// *
//  DISPLAY '*  7* WS-2-1A-S        = (' WS-2-1A-S ')'
          logger.info("*  7* WS-2-1A-S        = ({})", methodOut.getAS21().toString()); 
//  DISPLAY '*  8*   WS-2-1A-S-FLD1 = (' WS-2-1A-S-FLD1 ')'
          logger.info("*  8*   WS-2-1A-S-FLD1 = ({})", new String(methodOut.getASFld121())); 
//  DISPLAY '*  9*   WS-2-1A-S-FLD2 = (' WS-2-1A-S-FLD2 ')'
          logger.info("*  9*   WS-2-1A-S-FLD2 = ({})", new String(methodOut.getASFld221())); 
//  DISPLAY '* 10* WS-2-1A-T        = (' WS-2-1A-T ')'
          logger.info("* 10* WS-2-1A-T        = ({})", methodOut.getAT21().toString()); 
//  DISPLAY '* 11*   WS-2-1A-T-FLD1 = (' WS-2-1A-T-FLD1 ')'
          logger.info("* 11*   WS-2-1A-T-FLD1 = ({})", new String(methodOut.getATFld121())); 
//  DISPLAY '* 12*   WS-2-1A-T-FLD2 = (' WS-2-1A-T-FLD2 ')'
          logger.info("* 12*   WS-2-1A-T-FLD2 = ({})", new String(methodOut.getATFld221())); 

// *
// * Src -> group; tgt -> group ; src smaller than tgt
// *
//  INITIALIZE WS-2-1B-S WS-2-1B-T
          methodOut.getBS21().initialize();
          methodOut.getBT21().initialize();
//  MOVE ALL 'ABCD' TO WS-2-1B-S-FLD1
          methodOut.setBSFld121(CONSTANTS.LITERAL_ABCDABCDABCDABCDABCDABCDABCDABCD);
//  MOVE ALL 'ZYXW' TO WS-2-1B-S-FLD2
          methodOut.setBSFld221(CONSTANTS.LITERAL_645286444);
//  MOVE ALL 'MNOP' TO WS-2-1B-T-FLD3
          methodOut.setBTFld321(CONSTANTS.LITERAL_MNOPMNOPMNOPMNOPMNOPMNOPMNOPMNOP);
//  MOVE WS-2-1B-S ( WS-ONE : LENGTH OF WS-2-1B-S ) TO WS-2-1B-T ( WS-ONE : LENGTH OF WS-2-1B-T )
          methodOut.getBT21().replace(methodOut.getBS21(),(methodOut.getOne()-1),BS21.getBS21FieldLength(),(methodOut.getOne()-1),BT21.getBT21FieldLength() /* replace,sourceIndex,sourceLen,targetIndex,targetLen */);

// *
//  DISPLAY '* 13* WS-2-1B-S        = (' WS-2-1B-S ')'
          logger.info("* 13* WS-2-1B-S        = ({})", methodOut.getBS21().toString()); 
//  DISPLAY '* 14*   WS-2-1B-S-FLD1 = (' WS-2-1B-S-FLD1 ')'
          logger.info("* 14*   WS-2-1B-S-FLD1 = ({})", new String(methodOut.getBSFld121())); 
//  DISPLAY '* 15*   WS-2-1B-S-FLD2 = (' WS-2-1B-S-FLD2 ')'
          logger.info("* 15*   WS-2-1B-S-FLD2 = ({})", new String(methodOut.getBSFld221())); 
//  DISPLAY '* 16* WS-2-1B-T        = (' WS-2-1B-T ')'
          logger.info("* 16* WS-2-1B-T        = ({})", methodOut.getBT21().toString()); 
//  DISPLAY '* 17*   WS-2-1B-T-FLD1 = (' WS-2-1B-T-FLD1 ')'
          logger.info("* 17*   WS-2-1B-T-FLD1 = ({})", new String(methodOut.getBTFld121())); 
//  DISPLAY '* 18*   WS-2-1B-T-FLD2 = (' WS-2-1B-T-FLD2 ')'
          logger.info("* 18*   WS-2-1B-T-FLD2 = ({})", new String(methodOut.getBTFld221())); 
//  DISPLAY '* 19*   WS-2-1B-T-FLD3 = (' WS-2-1B-T-FLD3 ')'
          logger.info("* 19*   WS-2-1B-T-FLD3 = ({})", new String(methodOut.getBTFld321())); 

// *
//  INITIALIZE WS-2-1B-S WS-2-1B-T
          methodOut.getBS21().initialize();
          methodOut.getBT21().initialize();
//  MOVE ALL 'ABCD' TO WS-2-1B-S-FLD1
          methodOut.setBSFld121(CONSTANTS.LITERAL_ABCDABCDABCDABCDABCDABCDABCDABCD);
//  MOVE ALL 'ZYXW' TO WS-2-1B-S-FLD2
          methodOut.setBSFld221(CONSTANTS.LITERAL_645286444);
//  MOVE ALL 'MNOP' TO WS-2-1B-T-FLD3
          methodOut.setBTFld321(CONSTANTS.LITERAL_MNOPMNOPMNOPMNOPMNOPMNOPMNOPMNOP);
//  MOVE LENGTH OF WS-2-1B-S TO WS-2-S-LEN
          methodOut.setSLen2((short) BS21.getBS21FieldLength());
//  MOVE LENGTH OF WS-2-1B-T TO WS-2-T-LEN
          methodOut.setTLen2((short) BT21.getBT21FieldLength());
//  MOVE WS-2-1B-S ( WS-ONE : WS-2-S-LEN ) TO WS-2-1B-T ( WS-ONE : WS-2-T-LEN )
          methodOut.getBT21().replace(methodOut.getBS21(),(methodOut.getOne()-1),methodOut.getSLen2(),(methodOut.getOne()-1),methodOut.getTLen2() /* replace,sourceIndex,sourceLen,targetIndex,targetLen */);

// *
//  DISPLAY '* 20* WS-2-1B-S        = (' WS-2-1B-S ')'
          logger.info("* 20* WS-2-1B-S        = ({})", methodOut.getBS21().toString()); 
//  DISPLAY '* 21*   WS-2-1B-S-FLD1 = (' WS-2-1B-S-FLD1 ')'
          logger.info("* 21*   WS-2-1B-S-FLD1 = ({})", new String(methodOut.getBSFld121())); 
//  DISPLAY '* 22*   WS-2-1B-S-FLD2 = (' WS-2-1B-S-FLD2 ')'
          logger.info("* 22*   WS-2-1B-S-FLD2 = ({})", new String(methodOut.getBSFld221())); 
//  DISPLAY '* 23* WS-2-1B-T        = (' WS-2-1B-T ')'
          logger.info("* 23* WS-2-1B-T        = ({})", methodOut.getBT21().toString()); 
//  DISPLAY '* 24*   WS-2-1B-T-FLD1 = (' WS-2-1B-T-FLD1 ')'
          logger.info("* 24*   WS-2-1B-T-FLD1 = ({})", new String(methodOut.getBTFld121())); 
      
      return methodOut;
      }
      /**
      * mainlineSplit1 
      *   This method is derived from 
  *   COBOL Paragraph - MAINLINE-SPLIT1 COBOL Cyclomatic complexity - 1
      * Input  :  

      * - bTFld221                       COBOL Name: WS-2-1B-T-FLD2
      * - bTFld321                       COBOL Name: WS-2-1B-T-FLD3
      *
      * Output :  

      * - aS22                           COBOL Name: WS-2-2A-S
      * - aT22                           COBOL Name: WS-2-2A-T
      * - aTFld122                       COBOL Name: WS-2-2A-T-FLD1
      * - aTFld222                       COBOL Name: WS-2-2A-T-FLD2
      * - sLen2                          COBOL Name: WS-2-S-LEN
      * - tLen2                          COBOL Name: WS-2-T-LEN
      * - bS22                           COBOL Name: WS-2-2B-S
      * - bT22                           COBOL Name: WS-2-2B-T
      * - bTFld322                       COBOL Name: WS-2-2B-T-FLD3
      * - bTFld122                       COBOL Name: WS-2-2B-T-FLD1
      * - bTFld222                       COBOL Name: WS-2-2B-T-FLD2
      * - aS23                           COBOL Name: WS-2-3A-S
      * - aT23                           COBOL Name: WS-2-3A-T
      * - aSFld123                       COBOL Name: WS-2-3A-S-FLD1
      * - aSFld223                       COBOL Name: WS-2-3A-S-FLD2
      * - aTFld123                       COBOL Name: WS-2-3A-T-FLD1
      * - aTFld223                       COBOL Name: WS-2-3A-T-FLD2
      *
      * @throws CFException
      */
      @Override
      public MainlineSplit1OutCtx mainlineSplit1(MainlineSplit1InCtx methodIn) throws Exception {
			// Declare local variables used in the method
			 final int A_S_22_LENGTH = 70;
			 final int B_S_22_LENGTH = 70;
			// End of variable declaration

Refmod3Ctx programCtx = methodIn.getRefmod3Ctx();
MainlineSplit1OutCtx methodOut = methodIn.getMainlineSplit1OutCtx();
//  DISPLAY '* 25*   WS-2-1B-T-FLD2 = (' WS-2-1B-T-FLD2 ')'
          logger.info("* 25*   WS-2-1B-T-FLD2 = ({})", new String(methodIn.getBTFld221())); 
//  DISPLAY '* 26*   WS-2-1B-T-FLD3 = (' WS-2-1B-T-FLD3 ')'
          logger.info("* 26*   WS-2-1B-T-FLD3 = ({})", new String(methodIn.getBTFld321())); 

// *
// * Src -> string; tgt -> group ; src bigger than tgt
// *
//  INITIALIZE WS-2-2A-S WS-2-2A-T
          methodOut.setAS22(CONSTANTS.SPACE_70 /* Fill 70 Spaces*/);
          methodOut.getAT22().initialize();
          // MOVE ALL 'ABCD' TO WS-2-2A-S
          methodOut.setAS22(CONSTANTS.LITERAL_1222519919);
//  MOVE WS-2-2A-S ( WS-ONE : LENGTH OF WS-2-2A-S ) TO WS-2-2A-T ( WS-ONE : LENGTH OF WS-2-2A-T )
          methodOut.getAT22().replace(methodOut.getAS22(),(methodIn.getOne()-1)/* aS22 */ ,A_S_22_LENGTH,(methodIn.getOne()-1),AT22.getAT22FieldLength() /* replace,startIndex,targetLen */);

// *
//  DISPLAY '* 27* WS-2-2A-S        = (' WS-2-2A-S ')'
          logger.info("* 27* WS-2-2A-S        = ({})", new String(methodOut.getAS22())); 
//  DISPLAY '* 28* WS-2-2A-T        = (' WS-2-2A-T ')'
          logger.info("* 28* WS-2-2A-T        = ({})", methodOut.getAT22().toString()); 
//  DISPLAY '* 29*   WS-2-2A-T-FLD1 = (' WS-2-2A-T-FLD1 ')'
          logger.info("* 29*   WS-2-2A-T-FLD1 = ({})", new String(methodOut.getATFld122())); 
//  DISPLAY '* 30*   WS-2-2A-T-FLD2 = (' WS-2-2A-T-FLD2 ')'
          logger.info("* 30*   WS-2-2A-T-FLD2 = ({})", new String(methodOut.getATFld222())); 

// *
//  INITIALIZE WS-2-2A-S WS-2-2A-T
          methodOut.setAS22(CONSTANTS.SPACE_70 /* Fill 70 Spaces*/);
          methodOut.getAT22().initialize();
          // MOVE ALL 'ABCD' TO WS-2-2A-S
          methodOut.setAS22(CONSTANTS.LITERAL_1222519919);
//  MOVE LENGTH OF WS-2-2A-S TO WS-2-S-LEN
          methodOut.setSLen2((short) A_S_22_LENGTH);
//  MOVE LENGTH OF WS-2-2A-T TO WS-2-T-LEN
          methodOut.setTLen2((short) AT22.getAT22FieldLength());
//  MOVE WS-2-2A-S ( WS-ONE : WS-2-S-LEN ) TO WS-2-2A-T ( WS-ONE : WS-2-T-LEN )
          methodOut.getAT22().replace(methodOut.getAS22(),(methodIn.getOne()-1)/* aS22 */ ,methodOut.getSLen2(),(methodIn.getOne()-1),methodOut.getTLen2() /* replace,startIndex,targetLen */);

// *
//  DISPLAY '* 31* WS-2-2A-S        = (' WS-2-2A-S ')'
          logger.info("* 31* WS-2-2A-S        = ({})", new String(methodOut.getAS22())); 
//  DISPLAY '* 32* WS-2-2A-T        = (' WS-2-2A-T ')'
          logger.info("* 32* WS-2-2A-T        = ({})", methodOut.getAT22().toString()); 
//  DISPLAY '* 33*   WS-2-2A-T-FLD1 = (' WS-2-2A-T-FLD1 ')'
          logger.info("* 33*   WS-2-2A-T-FLD1 = ({})", new String(methodOut.getATFld122())); 
//  DISPLAY '* 34*   WS-2-2A-T-FLD2 = (' WS-2-2A-T-FLD2 ')'
          logger.info("* 34*   WS-2-2A-T-FLD2 = ({})", new String(methodOut.getATFld222())); 

// *
// * Src -> string; tgt -> group ; src smaller than tgt
// *
//  INITIALIZE WS-2-2B-S WS-2-2B-T
          methodOut.setBS22(CONSTANTS.SPACE_70 /* Fill 70 Spaces*/);
          methodOut.getBT22().initialize();
          // MOVE ALL 'ABCD' TO WS-2-2B-S
          methodOut.setBS22(CONSTANTS.LITERAL_1222519919);
//  MOVE ALL 'MNOP' TO WS-2-2B-T-FLD3
          methodOut.setBTFld322(CONSTANTS.LITERAL_MNOPMNOPMNOPMNOPMNOPMNOPMNOPMNOP);
//  MOVE WS-2-2B-S ( WS-ONE : LENGTH OF WS-2-2B-S ) TO WS-2-2B-T ( WS-ONE : LENGTH OF WS-2-2B-T )
          methodOut.getBT22().replace(methodOut.getBS22(),(methodIn.getOne()-1)/* bS22 */ ,B_S_22_LENGTH,(methodIn.getOne()-1),BT22.getBT22FieldLength() /* replace,startIndex,targetLen */);

// *
//  DISPLAY '* 35* WS-2-2B-S        = (' WS-2-2B-S ')'
          logger.info("* 35* WS-2-2B-S        = ({})", new String(methodOut.getBS22())); 
//  DISPLAY '* 36* WS-2-2B-T        = (' WS-2-2B-T ')'
          logger.info("* 36* WS-2-2B-T        = ({})", methodOut.getBT22().toString()); 
//  DISPLAY '* 37*   WS-2-2B-T-FLD1 = (' WS-2-2B-T-FLD1 ')'
          logger.info("* 37*   WS-2-2B-T-FLD1 = ({})", new String(methodOut.getBTFld122())); 
//  DISPLAY '* 38*   WS-2-2B-T-FLD2 = (' WS-2-2B-T-FLD2 ')'
          logger.info("* 38*   WS-2-2B-T-FLD2 = ({})", new String(methodOut.getBTFld222())); 
//  DISPLAY '* 39*   WS-2-2B-T-FLD3 = (' WS-2-2B-T-FLD3 ')'
          logger.info("* 39*   WS-2-2B-T-FLD3 = ({})", new String(methodOut.getBTFld322())); 

// *
//  INITIALIZE WS-2-2B-S WS-2-2B-T
          methodOut.setBS22(CONSTANTS.SPACE_70 /* Fill 70 Spaces*/);
          methodOut.getBT22().initialize();
          // MOVE ALL 'ABCD' TO WS-2-2B-S
          methodOut.setBS22(CONSTANTS.LITERAL_1222519919);
//  MOVE ALL 'MNOP' TO WS-2-2B-T-FLD3
          methodOut.setBTFld322(CONSTANTS.LITERAL_MNOPMNOPMNOPMNOPMNOPMNOPMNOPMNOP);
//  MOVE LENGTH OF WS-2-2B-S TO WS-2-S-LEN
          methodOut.setSLen2((short) B_S_22_LENGTH);
//  MOVE LENGTH OF WS-2-2B-T TO WS-2-T-LEN
          methodOut.setTLen2((short) BT22.getBT22FieldLength());
//  MOVE WS-2-2B-S ( WS-ONE : WS-2-S-LEN ) TO WS-2-2B-T ( WS-ONE : WS-2-T-LEN )
          methodOut.getBT22().replace(methodOut.getBS22(),(methodIn.getOne()-1)/* bS22 */ ,methodOut.getSLen2(),(methodIn.getOne()-1),methodOut.getTLen2() /* replace,startIndex,targetLen */);

// *
//  DISPLAY '* 40* WS-2-2B-S        = (' WS-2-2B-S ')'
          logger.info("* 40* WS-2-2B-S        = ({})", new String(methodOut.getBS22())); 
//  DISPLAY '* 41* WS-2-2B-T        = (' WS-2-2B-T ')'
          logger.info("* 41* WS-2-2B-T        = ({})", methodOut.getBT22().toString()); 
//  DISPLAY '* 42*   WS-2-2B-T-FLD1 = (' WS-2-2B-T-FLD1 ')'
          logger.info("* 42*   WS-2-2B-T-FLD1 = ({})", new String(methodOut.getBTFld122())); 
//  DISPLAY '* 43*   WS-2-2B-T-FLD2 = (' WS-2-2B-T-FLD2 ')'
          logger.info("* 43*   WS-2-2B-T-FLD2 = ({})", new String(methodOut.getBTFld222())); 
//  DISPLAY '* 44*   WS-2-2B-T-FLD3 = (' WS-2-2B-T-FLD3 ')'
          logger.info("* 44*   WS-2-2B-T-FLD3 = ({})", new String(methodOut.getBTFld322())); 

// *
// * Src -> group; tgt -> group ; src bigger than tgt
// *
//  INITIALIZE WS-2-3A-S WS-2-3A-T
          methodOut.getAS23().initialize();
          methodOut.getAT23().initialize();
//  MOVE ALL 'ABCD' TO WS-2-3A-S-FLD1
          methodOut.setASFld123(CONSTANTS.LITERAL_ABCDABCDABCDABCDABCDABCDABCDABCD);
//  MOVE ALL 'ZYXW' TO WS-2-3A-S-FLD2
          methodOut.setASFld223(CONSTANTS.LITERAL_645286444);
//  MOVE WS-2-3A-S TO WS-2-3A-T ( WS-ONE : LENGTH OF WS-2-3A-T )
          methodOut.getAT23().replace(methodOut.getAS23().getCharArray(),0,methodOut.getAS23().length(),(methodIn.getOne()-1),AT23.getAT23FieldLength() /* replace,sourceIndex,sourceLen,targetIndex,targetLen */);

// *
//  DISPLAY '* 45* WS-2-3A-S        = (' WS-2-3A-S ')'
          logger.info("* 45* WS-2-3A-S        = ({})", methodOut.getAS23().toString()); 
//  DISPLAY '* 46*   WS-2-3A-S-FLD1 = (' WS-2-3A-S-FLD1 ')'
          logger.info("* 46*   WS-2-3A-S-FLD1 = ({})", new String(methodOut.getASFld123())); 
//  DISPLAY '* 47*   WS-2-3A-S-FLD2 = (' WS-2-3A-S-FLD2 ')'
          logger.info("* 47*   WS-2-3A-S-FLD2 = ({})", new String(methodOut.getASFld223())); 
//  DISPLAY '* 48* WS-2-3A-T        = (' WS-2-3A-T ')'
          logger.info("* 48* WS-2-3A-T        = ({})", methodOut.getAT23().toString()); 
//  DISPLAY '* 49*   WS-2-3A-T-FLD1 = (' WS-2-3A-T-FLD1 ')'
          logger.info("* 49*   WS-2-3A-T-FLD1 = ({})", new String(methodOut.getATFld123())); 
//  DISPLAY '* 50*   WS-2-3A-T-FLD2 = (' WS-2-3A-T-FLD2 ')'
          logger.info("* 50*   WS-2-3A-T-FLD2 = ({})", new String(methodOut.getATFld223())); 

// *
//  INITIALIZE WS-2-3A-S WS-2-3A-T
          methodOut.getAS23().initialize();
          methodOut.getAT23().initialize();
//  MOVE ALL 'ABCD' TO WS-2-3A-S-FLD1
          methodOut.setASFld123(CONSTANTS.LITERAL_ABCDABCDABCDABCDABCDABCDABCDABCD);
//  MOVE ALL 'ZYXW' TO WS-2-3A-S-FLD2
          methodOut.setASFld223(CONSTANTS.LITERAL_645286444);
      
      return methodOut;
      }
      /**
      * mainlineSplit2 
      *   This method is derived from 
  *   COBOL Paragraph - MAINLINE-SPLIT2 COBOL Cyclomatic complexity - 1
      * Input  :  

      * - aS23                           COBOL Name: WS-2-3A-S
      *
      * Output :  

      * - tLen2                          COBOL Name: WS-2-T-LEN
      * - aT23                           COBOL Name: WS-2-3A-T
      * - aS23                           COBOL Name: WS-2-3A-S
      * - aSFld123                       COBOL Name: WS-2-3A-S-FLD1
      * - aSFld223                       COBOL Name: WS-2-3A-S-FLD2
      * - aTFld123                       COBOL Name: WS-2-3A-T-FLD1
      * - aTFld223                       COBOL Name: WS-2-3A-T-FLD2
      * - bS23                           COBOL Name: WS-2-3B-S
      * - bT23                           COBOL Name: WS-2-3B-T
      * - bSFld123                       COBOL Name: WS-2-3B-S-FLD1
      * - bSFld223                       COBOL Name: WS-2-3B-S-FLD2
      * - bTFld323                       COBOL Name: WS-2-3B-T-FLD3
      * - bTFld123                       COBOL Name: WS-2-3B-T-FLD1
      * - bTFld223                       COBOL Name: WS-2-3B-T-FLD2
      * - aS24                           COBOL Name: WS-2-4A-S
      * - aT24                           COBOL Name: WS-2-4A-T
      * - aTFld124                       COBOL Name: WS-2-4A-T-FLD1
      * - aTFld224                       COBOL Name: WS-2-4A-T-FLD2
      * - bS24                           COBOL Name: WS-2-4B-S
      * - bT24                           COBOL Name: WS-2-4B-T
      * - bTFld324                       COBOL Name: WS-2-4B-T-FLD3
      *
      * @throws CFException
      */
      @Override
      public MainlineSplit2OutCtx mainlineSplit2(MainlineSplit2InCtx methodIn) throws Exception {
Refmod3Ctx programCtx = methodIn.getRefmod3Ctx();
MainlineSplit2OutCtx methodOut = methodIn.getMainlineSplit2OutCtx();
//  MOVE LENGTH OF WS-2-3A-T TO WS-2-T-LEN
          methodOut.setTLen2((short) AT23.getAT23FieldLength());
//  MOVE WS-2-3A-S TO WS-2-3A-T ( WS-ONE : WS-2-T-LEN )
          methodOut.getAT23().replace(methodOut.getAS23().getCharArray(),0,methodOut.getAS23().length(),(methodIn.getOne()-1),methodOut.getTLen2() /* replace,sourceIndex,sourceLen,targetIndex,targetLen */);

// *
//  DISPLAY '* 51* WS-2-3A-S        = (' WS-2-3A-S ')'
          logger.info("* 51* WS-2-3A-S        = ({})", methodOut.getAS23().toString()); 
//  DISPLAY '* 52*   WS-2-3A-S-FLD1 = (' WS-2-3A-S-FLD1 ')'
          logger.info("* 52*   WS-2-3A-S-FLD1 = ({})", new String(methodOut.getASFld123())); 
//  DISPLAY '* 53*   WS-2-3A-S-FLD2 = (' WS-2-3A-S-FLD2 ')'
          logger.info("* 53*   WS-2-3A-S-FLD2 = ({})", new String(methodOut.getASFld223())); 
//  DISPLAY '* 54* WS-2-3A-T        = (' WS-2-3A-T ')'
          logger.info("* 54* WS-2-3A-T        = ({})", methodOut.getAT23().toString()); 
//  DISPLAY '* 55*   WS-2-3A-T-FLD1 = (' WS-2-3A-T-FLD1 ')'
          logger.info("* 55*   WS-2-3A-T-FLD1 = ({})", new String(methodOut.getATFld123())); 
//  DISPLAY '* 56*   WS-2-3A-T-FLD2 = (' WS-2-3A-T-FLD2 ')'
          logger.info("* 56*   WS-2-3A-T-FLD2 = ({})", new String(methodOut.getATFld223())); 

// *
// * Src -> group; tgt -> group ; src smaller than tgt
// *
//  INITIALIZE WS-2-3B-S WS-2-3B-T
          methodOut.getBS23().initialize();
          methodOut.getBT23().initialize();
//  MOVE ALL 'ABCD' TO WS-2-3B-S-FLD1
          methodOut.setBSFld123(CONSTANTS.LITERAL_ABCDABCDABCDABCDABCDABCDABCDABCD);
//  MOVE ALL 'ZYXW' TO WS-2-3B-S-FLD2
          methodOut.setBSFld223(CONSTANTS.LITERAL_645286444);
//  MOVE ALL 'MNOP' TO WS-2-3B-T-FLD3
          methodOut.setBTFld323(CONSTANTS.LITERAL_MNOPMNOPMNOPMNOPMNOPMNOPMNOPMNOP);
//  MOVE WS-2-3B-S TO WS-2-3B-T ( WS-ONE : LENGTH OF WS-2-3B-T )
          methodOut.getBT23().replace(methodOut.getBS23().getCharArray(),0,methodOut.getBS23().length(),(methodIn.getOne()-1),BT23.getBT23FieldLength() /* replace,sourceIndex,sourceLen,targetIndex,targetLen */);

// *
//  DISPLAY '* 57* WS-2-3B-S        = (' WS-2-3B-S ')'
          logger.info("* 57* WS-2-3B-S        = ({})", methodOut.getBS23().toString()); 
//  DISPLAY '* 58*   WS-2-3B-S-FLD1 = (' WS-2-3B-S-FLD1 ')'
          logger.info("* 58*   WS-2-3B-S-FLD1 = ({})", new String(methodOut.getBSFld123())); 
//  DISPLAY '* 59*   WS-2-3B-S-FLD2 = (' WS-2-3B-S-FLD2 ')'
          logger.info("* 59*   WS-2-3B-S-FLD2 = ({})", new String(methodOut.getBSFld223())); 
//  DISPLAY '* 60* WS-2-3B-T        = (' WS-2-3B-T ')'
          logger.info("* 60* WS-2-3B-T        = ({})", methodOut.getBT23().toString()); 
//  DISPLAY '* 61*   WS-2-3B-T-FLD1 = (' WS-2-3B-T-FLD1 ')'
          logger.info("* 61*   WS-2-3B-T-FLD1 = ({})", new String(methodOut.getBTFld123())); 
//  DISPLAY '* 62*   WS-2-3B-T-FLD2 = (' WS-2-3B-T-FLD2 ')'
          logger.info("* 62*   WS-2-3B-T-FLD2 = ({})", new String(methodOut.getBTFld223())); 
//  DISPLAY '* 63*   WS-2-3B-T-FLD3 = (' WS-2-3B-T-FLD3 ')'
          logger.info("* 63*   WS-2-3B-T-FLD3 = ({})", new String(methodOut.getBTFld323())); 

// *
//  INITIALIZE WS-2-3B-S WS-2-3B-T
          methodOut.getBS23().initialize();
          methodOut.getBT23().initialize();
//  MOVE ALL 'ABCD' TO WS-2-3B-S-FLD1
          methodOut.setBSFld123(CONSTANTS.LITERAL_ABCDABCDABCDABCDABCDABCDABCDABCD);
//  MOVE ALL 'ZYXW' TO WS-2-3B-S-FLD2
          methodOut.setBSFld223(CONSTANTS.LITERAL_645286444);
//  MOVE ALL 'MNOP' TO WS-2-3B-T-FLD3
          methodOut.setBTFld323(CONSTANTS.LITERAL_MNOPMNOPMNOPMNOPMNOPMNOPMNOPMNOP);
//  MOVE LENGTH OF WS-2-3B-T TO WS-2-T-LEN
          methodOut.setTLen2((short) BT23.getBT23FieldLength());
//  MOVE WS-2-3B-S TO WS-2-3B-T ( WS-ONE : WS-2-T-LEN )
          methodOut.getBT23().replace(methodOut.getBS23().getCharArray(),0,methodOut.getBS23().length(),(methodIn.getOne()-1),methodOut.getTLen2() /* replace,sourceIndex,sourceLen,targetIndex,targetLen */);

// *
//  DISPLAY '* 64* WS-2-3B-S        = (' WS-2-3B-S ')'
          logger.info("* 64* WS-2-3B-S        = ({})", methodOut.getBS23().toString()); 
//  DISPLAY '* 65*   WS-2-3B-S-FLD1 = (' WS-2-3B-S-FLD1 ')'
          logger.info("* 65*   WS-2-3B-S-FLD1 = ({})", new String(methodOut.getBSFld123())); 
//  DISPLAY '* 66*   WS-2-3B-S-FLD2 = (' WS-2-3B-S-FLD2 ')'
          logger.info("* 66*   WS-2-3B-S-FLD2 = ({})", new String(methodOut.getBSFld223())); 
//  DISPLAY '* 67* WS-2-3B-T        = (' WS-2-3B-T ')'
          logger.info("* 67* WS-2-3B-T        = ({})", methodOut.getBT23().toString()); 
//  DISPLAY '* 68*   WS-2-3B-T-FLD1 = (' WS-2-3B-T-FLD1 ')'
          logger.info("* 68*   WS-2-3B-T-FLD1 = ({})", new String(methodOut.getBTFld123())); 
//  DISPLAY '* 69*   WS-2-3B-T-FLD2 = (' WS-2-3B-T-FLD2 ')'
          logger.info("* 69*   WS-2-3B-T-FLD2 = ({})", new String(methodOut.getBTFld223())); 
//  DISPLAY '* 70*   WS-2-3B-T-FLD3 = (' WS-2-3B-T-FLD3 ')'
          logger.info("* 70*   WS-2-3B-T-FLD3 = ({})", new String(methodOut.getBTFld323())); 

// *
// * Src -> string; tgt -> group ; src bigger than tgt
// *
//  INITIALIZE WS-2-4A-S WS-2-4A-T
          methodOut.setAS24(CONSTANTS.SPACE_70 /* Fill 70 Spaces*/);
          methodOut.getAT24().initialize();
          // MOVE ALL 'ABCD' TO WS-2-4A-S
          methodOut.setAS24(CONSTANTS.LITERAL_1222519919);
//  MOVE WS-2-4A-S TO WS-2-4A-T ( WS-ONE : LENGTH OF WS-2-4A-T )
          methodOut.getAT24().replace(methodOut.getAS24(),0,methodOut.getAS24().length,(methodIn.getOne()-1),AT24.getAT24FieldLength() /* replace,sourceIndex,sourceLen,targetIndex,targetLen */);

// *
//  DISPLAY '* 71* WS-2-4A-S        = (' WS-2-4A-S ')'
          logger.info("* 71* WS-2-4A-S        = ({})", new String(methodOut.getAS24())); 
//  DISPLAY '* 72* WS-2-4A-T        = (' WS-2-4A-T ')'
          logger.info("* 72* WS-2-4A-T        = ({})", methodOut.getAT24().toString()); 
//  DISPLAY '* 73*   WS-2-4A-T-FLD1 = (' WS-2-4A-T-FLD1 ')'
          logger.info("* 73*   WS-2-4A-T-FLD1 = ({})", new String(methodOut.getATFld124())); 
//  DISPLAY '* 74*   WS-2-4A-T-FLD2 = (' WS-2-4A-T-FLD2 ')'
          logger.info("* 74*   WS-2-4A-T-FLD2 = ({})", new String(methodOut.getATFld224())); 

// *
//  INITIALIZE WS-2-4A-S WS-2-4A-T
          methodOut.setAS24(CONSTANTS.SPACE_70 /* Fill 70 Spaces*/);
          methodOut.getAT24().initialize();
          // MOVE ALL 'ABCD' TO WS-2-4A-S
          methodOut.setAS24(CONSTANTS.LITERAL_1222519919);
//  MOVE LENGTH OF WS-2-4A-T TO WS-2-T-LEN
          methodOut.setTLen2((short) AT24.getAT24FieldLength());
//  MOVE WS-2-4A-S TO WS-2-4A-T ( WS-ONE : WS-2-T-LEN )
          methodOut.getAT24().replace(methodOut.getAS24(),0,methodOut.getAS24().length,(methodIn.getOne()-1),methodOut.getTLen2() /* replace,sourceIndex,sourceLen,targetIndex,targetLen */);

// *
//  DISPLAY '* 75* WS-2-4A-S        = (' WS-2-4A-S ')'
          logger.info("* 75* WS-2-4A-S        = ({})", new String(methodOut.getAS24())); 
//  DISPLAY '* 76* WS-2-4A-T        = (' WS-2-4A-T ')'
          logger.info("* 76* WS-2-4A-T        = ({})", methodOut.getAT24().toString()); 
//  DISPLAY '* 77*   WS-2-4A-T-FLD1 = (' WS-2-4A-T-FLD1 ')'
          logger.info("* 77*   WS-2-4A-T-FLD1 = ({})", new String(methodOut.getATFld124())); 
//  DISPLAY '* 78*   WS-2-4A-T-FLD2 = (' WS-2-4A-T-FLD2 ')'
          logger.info("* 78*   WS-2-4A-T-FLD2 = ({})", new String(methodOut.getATFld224())); 

// *
// * Src -> string; tgt -> group ; src smaller than tgt
// *
//  INITIALIZE WS-2-4B-S WS-2-4B-T
          methodOut.setBS24(CONSTANTS.SPACE_70 /* Fill 70 Spaces*/);
          methodOut.getBT24().initialize();
          // MOVE ALL 'ABCD' TO WS-2-4B-S
          methodOut.setBS24(CONSTANTS.LITERAL_1222519919);
//  MOVE ALL 'MNOP' TO WS-2-4B-T-FLD3
          methodOut.setBTFld324(CONSTANTS.LITERAL_MNOPMNOPMNOPMNOPMNOPMNOPMNOPMNOP);
      
      return methodOut;
      }
      /**
      * mainlineSplit3 
      *   This method is derived from 
  *   COBOL Paragraph - MAINLINE-SPLIT3 COBOL Cyclomatic complexity - 1
      * Input  :  

      * - bS24                           COBOL Name: WS-2-4B-S
      *
      * Output :  

      * - bT24                           COBOL Name: WS-2-4B-T
      * - bS24                           COBOL Name: WS-2-4B-S
      * - bTFld124                       COBOL Name: WS-2-4B-T-FLD1
      * - bTFld224                       COBOL Name: WS-2-4B-T-FLD2
      * - bTFld324                       COBOL Name: WS-2-4B-T-FLD3
      * - tLen2                          COBOL Name: WS-2-T-LEN
      * - aS21                           COBOL Name: WS-2-1A-S
      * - aT21                           COBOL Name: WS-2-1A-T
      * - aSFld121                       COBOL Name: WS-2-1A-S-FLD1
      * - aSFld221                       COBOL Name: WS-2-1A-S-FLD2
      * - sLen2                          COBOL Name: WS-2-S-LEN
      * - aTFld121                       COBOL Name: WS-2-1A-T-FLD1
      * - aTFld221                       COBOL Name: WS-2-1A-T-FLD2
      * - bS21                           COBOL Name: WS-2-1B-S
      * - bT21                           COBOL Name: WS-2-1B-T
      * - bSFld121                       COBOL Name: WS-2-1B-S-FLD1
      * - bSFld221                       COBOL Name: WS-2-1B-S-FLD2
      * - bTFld321                       COBOL Name: WS-2-1B-T-FLD3
      * - bTFld121                       COBOL Name: WS-2-1B-T-FLD1
      * - bTFld221                       COBOL Name: WS-2-1B-T-FLD2
      *
      * @throws CFException
      */
      @Override
      public MainlineSplit3OutCtx mainlineSplit3(MainlineSplit3InCtx methodIn) throws Exception {
Refmod3Ctx programCtx = methodIn.getRefmod3Ctx();
MainlineSplit3OutCtx methodOut = methodIn.getMainlineSplit3OutCtx();
//  MOVE WS-2-4B-S TO WS-2-4B-T ( WS-ONE : LENGTH OF WS-2-4B-T )
          methodOut.getBT24().replace(methodOut.getBS24(),0,methodOut.getBS24().length,(methodIn.getOne()-1),BT24.getBT24FieldLength() /* replace,sourceIndex,sourceLen,targetIndex,targetLen */);

// *
//  DISPLAY '* 79* WS-2-4B-S        = (' WS-2-4B-S ')'
          logger.info("* 79* WS-2-4B-S        = ({})", new String(methodOut.getBS24())); 
//  DISPLAY '* 80* WS-2-4B-T        = (' WS-2-4B-T ')'
          logger.info("* 80* WS-2-4B-T        = ({})", methodOut.getBT24().toString()); 
//  DISPLAY '* 81*   WS-2-4B-T-FLD1 = (' WS-2-4B-T-FLD1 ')'
          logger.info("* 81*   WS-2-4B-T-FLD1 = ({})", new String(methodOut.getBTFld124())); 
//  DISPLAY '* 82*   WS-2-4B-T-FLD2 = (' WS-2-4B-T-FLD2 ')'
          logger.info("* 82*   WS-2-4B-T-FLD2 = ({})", new String(methodOut.getBTFld224())); 
//  DISPLAY '* 83*   WS-2-4B-T-FLD3 = (' WS-2-4B-T-FLD3 ')'
          logger.info("* 83*   WS-2-4B-T-FLD3 = ({})", new String(methodOut.getBTFld324())); 

// *
//  INITIALIZE WS-2-4B-S WS-2-4B-T
          methodOut.setBS24(CONSTANTS.SPACE_70 /* Fill 70 Spaces*/);
          methodOut.getBT24().initialize();
          // MOVE ALL 'ABCD' TO WS-2-4B-S
          methodOut.setBS24(CONSTANTS.LITERAL_1222519919);
//  MOVE ALL 'MNOP' TO WS-2-4B-T-FLD3
          methodOut.setBTFld324(CONSTANTS.LITERAL_MNOPMNOPMNOPMNOPMNOPMNOPMNOPMNOP);
//  MOVE LENGTH OF WS-2-4B-T TO WS-2-T-LEN
          methodOut.setTLen2((short) BT24.getBT24FieldLength());
//  MOVE WS-2-4B-S TO WS-2-4B-T ( WS-ONE : WS-2-T-LEN )
          methodOut.getBT24().replace(methodOut.getBS24(),0,methodOut.getBS24().length,(methodIn.getOne()-1),methodOut.getTLen2() /* replace,sourceIndex,sourceLen,targetIndex,targetLen */);

// *
//  DISPLAY '* 84* WS-2-4B-S        = (' WS-2-4B-S ')'
          logger.info("* 84* WS-2-4B-S        = ({})", new String(methodOut.getBS24())); 
//  DISPLAY '* 85* WS-2-4B-T        = (' WS-2-4B-T ')'
          logger.info("* 85* WS-2-4B-T        = ({})", methodOut.getBT24().toString()); 
//  DISPLAY '* 86*   WS-2-4B-T-FLD1 = (' WS-2-4B-T-FLD1 ')'
          logger.info("* 86*   WS-2-4B-T-FLD1 = ({})", new String(methodOut.getBTFld124())); 
//  DISPLAY '* 87*   WS-2-4B-T-FLD2 = (' WS-2-4B-T-FLD2 ')'
          logger.info("* 87*   WS-2-4B-T-FLD2 = ({})", new String(methodOut.getBTFld224())); 
//  DISPLAY '* 88*   WS-2-4B-T-FLD3 = (' WS-2-4B-T-FLD3 ')'
          logger.info("* 88*   WS-2-4B-T-FLD3 = ({})", new String(methodOut.getBTFld324())); 

// *
// * Src -> group; tgt -> group ; src bigger than tgt
// *
//  INITIALIZE WS-2-1A-S WS-2-1A-T
          methodOut.getAS21().initialize();
          methodOut.getAT21().initialize();
//  MOVE ALL 'ABCD' TO WS-2-1A-S-FLD1
          methodOut.setASFld121(CONSTANTS.LITERAL_ABCDABCDABCDABCDABCDABCDABCDABCD);
//  MOVE ALL 'ZYXW' TO WS-2-1A-S-FLD2
          methodOut.setASFld221(CONSTANTS.LITERAL_645286444);
//  MOVE LENGTH OF WS-2-1A-S TO WS-2-S-LEN
          methodOut.setSLen2((short) AS21.getAS21FieldLength());
//  MOVE LENGTH OF WS-2-1A-T TO WS-2-T-LEN
          methodOut.setTLen2((short) AT21.getAT21FieldLength());
//  MOVE WS-2-1A-S ( WS-THREE : LENGTH OF WS-2-1A-S - 3) TO WS-2-1A-T ( WS-FIVE : LENGTH OF WS-2-1A-T - 5)
          methodOut.getAT21().replace(methodOut.getAS21(),(methodIn.getThree()-1),AS21.getAS21FieldLength() - 3,(methodIn.getFive()-1),AT21.getAT21FieldLength() - 5 /* replace,sourceIndex,sourceLen,targetIndex,targetLen */);

// *
//  DISPLAY '* 89* WS-2-1A-S        = (' WS-2-1A-S ')'
          logger.info("* 89* WS-2-1A-S        = ({})", methodOut.getAS21().toString()); 
//  DISPLAY '* 90*   WS-2-1A-S-FLD1 = (' WS-2-1A-S-FLD1 ')'
          logger.info("* 90*   WS-2-1A-S-FLD1 = ({})", new String(methodOut.getASFld121())); 
//  DISPLAY '* 91*   WS-2-1A-S-FLD2 = (' WS-2-1A-S-FLD2 ')'
          logger.info("* 91*   WS-2-1A-S-FLD2 = ({})", new String(methodOut.getASFld221())); 
//  DISPLAY '* 92* WS-2-1A-T        = (' WS-2-1A-T ')'
          logger.info("* 92* WS-2-1A-T        = ({})", methodOut.getAT21().toString()); 
//  DISPLAY '* 93*   WS-2-1A-T-FLD1 = (' WS-2-1A-T-FLD1 ')'
          logger.info("* 93*   WS-2-1A-T-FLD1 = ({})", new String(methodOut.getATFld121())); 
//  DISPLAY '* 94*   WS-2-1A-T-FLD2 = (' WS-2-1A-T-FLD2 ')'
          logger.info("* 94*   WS-2-1A-T-FLD2 = ({})", new String(methodOut.getATFld221())); 

// *
//  INITIALIZE WS-2-1A-S WS-2-1A-T
          methodOut.getAS21().initialize();
          methodOut.getAT21().initialize();
//  MOVE ALL 'ABCD' TO WS-2-1A-S-FLD1
          methodOut.setASFld121(CONSTANTS.LITERAL_ABCDABCDABCDABCDABCDABCDABCDABCD);
//  MOVE ALL 'ZYXW' TO WS-2-1A-S-FLD2
          methodOut.setASFld221(CONSTANTS.LITERAL_645286444);
//  MOVE LENGTH OF WS-2-1A-S TO WS-2-S-LEN
          methodOut.setSLen2((short) AS21.getAS21FieldLength());
//  MOVE LENGTH OF WS-2-1A-T TO WS-2-T-LEN
          methodOut.setTLen2((short) AT21.getAT21FieldLength());
//  MOVE WS-2-1A-S ( WS-THREE : WS-2-S-LEN - 3 ) TO WS-2-1A-T ( WS-FIVE : WS-2-T-LEN - 5)
          methodOut.getAT21().replace(methodOut.getAS21(),(methodIn.getThree()-1),methodOut.getSLen2() - 3,(methodIn.getFive()-1),methodOut.getTLen2() - 5 /* replace,sourceIndex,sourceLen,targetIndex,targetLen */);

// *
//  DISPLAY '* 95* WS-2-1A-S        = (' WS-2-1A-S ')'
          logger.info("* 95* WS-2-1A-S        = ({})", methodOut.getAS21().toString()); 
//  DISPLAY '* 96*   WS-2-1A-S-FLD1 = (' WS-2-1A-S-FLD1 ')'
          logger.info("* 96*   WS-2-1A-S-FLD1 = ({})", new String(methodOut.getASFld121())); 
//  DISPLAY '* 97*   WS-2-1A-S-FLD2 = (' WS-2-1A-S-FLD2 ')'
          logger.info("* 97*   WS-2-1A-S-FLD2 = ({})", new String(methodOut.getASFld221())); 
//  DISPLAY '* 98* WS-2-1A-T        = (' WS-2-1A-T ')'
          logger.info("* 98* WS-2-1A-T        = ({})", methodOut.getAT21().toString()); 
//  DISPLAY '* 99*   WS-2-1A-T-FLD1 = (' WS-2-1A-T-FLD1 ')'
          logger.info("* 99*   WS-2-1A-T-FLD1 = ({})", new String(methodOut.getATFld121())); 
//  DISPLAY '*100*   WS-2-1A-T-FLD2 = (' WS-2-1A-T-FLD2 ')'
          logger.info("*100*   WS-2-1A-T-FLD2 = ({})", new String(methodOut.getATFld221())); 

// *
// * Src -> group; tgt -> group ; src smaller than tgt
// *
//  INITIALIZE WS-2-1B-S WS-2-1B-T
          methodOut.getBS21().initialize();
          methodOut.getBT21().initialize();
//  MOVE ALL 'ABCD' TO WS-2-1B-S-FLD1
          methodOut.setBSFld121(CONSTANTS.LITERAL_ABCDABCDABCDABCDABCDABCDABCDABCD);
//  MOVE ALL 'ZYXW' TO WS-2-1B-S-FLD2
          methodOut.setBSFld221(CONSTANTS.LITERAL_645286444);
//  MOVE ALL 'MNOP' TO WS-2-1B-T-FLD3
          methodOut.setBTFld321(CONSTANTS.LITERAL_MNOPMNOPMNOPMNOPMNOPMNOPMNOPMNOP);
//  MOVE WS-2-1B-S ( WS-THREE : LENGTH OF WS-2-1B-S - 3 ) TO WS-2-1B-T ( WS-FIVE : LENGTH OF WS-2-1B-T - 5)
          methodOut.getBT21().replace(methodOut.getBS21(),(methodIn.getThree()-1),BS21.getBS21FieldLength() - 3,(methodIn.getFive()-1),BT21.getBT21FieldLength() - 5 /* replace,sourceIndex,sourceLen,targetIndex,targetLen */);

// *
//  DISPLAY '*101* WS-2-1B-S        = (' WS-2-1B-S ')'
          logger.info("*101* WS-2-1B-S        = ({})", methodOut.getBS21().toString()); 
//  DISPLAY '*102*   WS-2-1B-S-FLD1 = (' WS-2-1B-S-FLD1 ')'
          logger.info("*102*   WS-2-1B-S-FLD1 = ({})", new String(methodOut.getBSFld121())); 
//  DISPLAY '*103*   WS-2-1B-S-FLD2 = (' WS-2-1B-S-FLD2 ')'
          logger.info("*103*   WS-2-1B-S-FLD2 = ({})", new String(methodOut.getBSFld221())); 
//  DISPLAY '*104* WS-2-1B-T        = (' WS-2-1B-T ')'
          logger.info("*104* WS-2-1B-T        = ({})", methodOut.getBT21().toString()); 
//  DISPLAY '*105*   WS-2-1B-T-FLD1 = (' WS-2-1B-T-FLD1 ')'
          logger.info("*105*   WS-2-1B-T-FLD1 = ({})", new String(methodOut.getBTFld121())); 
//  DISPLAY '*106*   WS-2-1B-T-FLD2 = (' WS-2-1B-T-FLD2 ')'
          logger.info("*106*   WS-2-1B-T-FLD2 = ({})", new String(methodOut.getBTFld221())); 
      
      return methodOut;
      }
      /**
      * mainlineSplit4 
      *   This method is derived from 
  *   COBOL Paragraph - MAINLINE-SPLIT4 COBOL Cyclomatic complexity - 1
      * Input  :  

      * - bTFld321                       COBOL Name: WS-2-1B-T-FLD3
      *
      * Output :  

      * - bS21                           COBOL Name: WS-2-1B-S
      * - bT21                           COBOL Name: WS-2-1B-T
      * - bSFld121                       COBOL Name: WS-2-1B-S-FLD1
      * - bSFld221                       COBOL Name: WS-2-1B-S-FLD2
      * - bTFld321                       COBOL Name: WS-2-1B-T-FLD3
      * - sLen2                          COBOL Name: WS-2-S-LEN
      * - tLen2                          COBOL Name: WS-2-T-LEN
      * - bTFld121                       COBOL Name: WS-2-1B-T-FLD1
      * - bTFld221                       COBOL Name: WS-2-1B-T-FLD2
      * - aS22                           COBOL Name: WS-2-2A-S
      * - aT22                           COBOL Name: WS-2-2A-T
      * - aTFld122                       COBOL Name: WS-2-2A-T-FLD1
      * - aTFld222                       COBOL Name: WS-2-2A-T-FLD2
      * - bS22                           COBOL Name: WS-2-2B-S
      * - bT22                           COBOL Name: WS-2-2B-T
      * - bTFld322                       COBOL Name: WS-2-2B-T-FLD3
      * - bTFld122                       COBOL Name: WS-2-2B-T-FLD1
      * - bTFld222                       COBOL Name: WS-2-2B-T-FLD2
      *
      * @throws CFException
      */
      @Override
      public MainlineSplit4OutCtx mainlineSplit4(MainlineSplit4InCtx methodIn) throws Exception {
			// Declare local variables used in the method
			 final int A_S_22_LENGTH = 70;
			 final int B_S_22_LENGTH = 70;
			// End of variable declaration

Refmod3Ctx programCtx = methodIn.getRefmod3Ctx();
MainlineSplit4OutCtx methodOut = methodIn.getMainlineSplit4OutCtx();
//  DISPLAY '*107*   WS-2-1B-T-FLD3 = (' WS-2-1B-T-FLD3 ')'
          logger.info("*107*   WS-2-1B-T-FLD3 = ({})", new String(methodOut.getBTFld321())); 

// *
//  INITIALIZE WS-2-1B-S WS-2-1B-T
          methodOut.getBS21().initialize();
          methodOut.getBT21().initialize();
//  MOVE ALL 'ABCD' TO WS-2-1B-S-FLD1
          methodOut.setBSFld121(CONSTANTS.LITERAL_ABCDABCDABCDABCDABCDABCDABCDABCD);
//  MOVE ALL 'ZYXW' TO WS-2-1B-S-FLD2
          methodOut.setBSFld221(CONSTANTS.LITERAL_645286444);
//  MOVE ALL 'MNOP' TO WS-2-1B-T-FLD3
          methodOut.setBTFld321(CONSTANTS.LITERAL_MNOPMNOPMNOPMNOPMNOPMNOPMNOPMNOP);
//  MOVE LENGTH OF WS-2-1B-S TO WS-2-S-LEN
          methodOut.setSLen2((short) BS21.getBS21FieldLength());
//  MOVE LENGTH OF WS-2-1B-T TO WS-2-T-LEN
          methodOut.setTLen2((short) BT21.getBT21FieldLength());
//  MOVE WS-2-1B-S ( WS-THREE : WS-2-S-LEN - 3 ) TO WS-2-1B-T ( WS-FIVE : WS-2-T-LEN - 5)
          methodOut.getBT21().replace(methodOut.getBS21(),(methodIn.getThree()-1),methodOut.getSLen2() - 3,(methodIn.getFive()-1),methodOut.getTLen2() - 5 /* replace,sourceIndex,sourceLen,targetIndex,targetLen */);

// *
//  DISPLAY '*108* WS-2-1B-S        = (' WS-2-1B-S ')'
          logger.info("*108* WS-2-1B-S        = ({})", methodOut.getBS21().toString()); 
//  DISPLAY '*109*   WS-2-1B-S-FLD1 = (' WS-2-1B-S-FLD1 ')'
          logger.info("*109*   WS-2-1B-S-FLD1 = ({})", new String(methodOut.getBSFld121())); 
//  DISPLAY '*110*   WS-2-1B-S-FLD2 = (' WS-2-1B-S-FLD2 ')'
          logger.info("*110*   WS-2-1B-S-FLD2 = ({})", new String(methodOut.getBSFld221())); 
//  DISPLAY '*111* WS-2-1B-T        = (' WS-2-1B-T ')'
          logger.info("*111* WS-2-1B-T        = ({})", methodOut.getBT21().toString()); 
//  DISPLAY '*112*   WS-2-1B-T-FLD1 = (' WS-2-1B-T-FLD1 ')'
          logger.info("*112*   WS-2-1B-T-FLD1 = ({})", new String(methodOut.getBTFld121())); 
//  DISPLAY '*113*   WS-2-1B-T-FLD2 = (' WS-2-1B-T-FLD2 ')'
          logger.info("*113*   WS-2-1B-T-FLD2 = ({})", new String(methodOut.getBTFld221())); 
//  DISPLAY '*114*   WS-2-1B-T-FLD3 = (' WS-2-1B-T-FLD3 ')'
          logger.info("*114*   WS-2-1B-T-FLD3 = ({})", new String(methodOut.getBTFld321())); 

// *
// * Src -> string; tgt -> group ; src bigger than tgt
// *
//  INITIALIZE WS-2-2A-S WS-2-2A-T
          methodOut.setAS22(CONSTANTS.SPACE_70 /* Fill 70 Spaces*/);
          methodOut.getAT22().initialize();
          // MOVE ALL 'ABCD' TO WS-2-2A-S
          methodOut.setAS22(CONSTANTS.LITERAL_1222519919);
//  MOVE WS-2-2A-S ( WS-THREE : LENGTH OF WS-2-2A-S - 3 ) TO WS-2-2A-T ( WS-FIVE : LENGTH OF WS-2-2A-T - 5)
          methodOut.getAT22().replace(methodOut.getAS22(),(methodIn.getThree()-1)/* aS22 */ ,A_S_22_LENGTH - 3,(methodIn.getFive()-1),AT22.getAT22FieldLength() - 5 /* replace,startIndex,targetLen */);

// *
//  DISPLAY '*115* WS-2-2A-S        = (' WS-2-2A-S ')'
          logger.info("*115* WS-2-2A-S        = ({})", new String(methodOut.getAS22())); 
//  DISPLAY '*116* WS-2-2A-T        = (' WS-2-2A-T ')'
          logger.info("*116* WS-2-2A-T        = ({})", methodOut.getAT22().toString()); 
//  DISPLAY '*117*   WS-2-2A-T-FLD1 = (' WS-2-2A-T-FLD1 ')'
          logger.info("*117*   WS-2-2A-T-FLD1 = ({})", new String(methodOut.getATFld122())); 
//  DISPLAY '*118*   WS-2-2A-T-FLD2 = (' WS-2-2A-T-FLD2 ')'
          logger.info("*118*   WS-2-2A-T-FLD2 = ({})", new String(methodOut.getATFld222())); 

// *
//  INITIALIZE WS-2-2A-S WS-2-2A-T
          methodOut.setAS22(CONSTANTS.SPACE_70 /* Fill 70 Spaces*/);
          methodOut.getAT22().initialize();
          // MOVE ALL 'ABCD' TO WS-2-2A-S
          methodOut.setAS22(CONSTANTS.LITERAL_1222519919);
//  MOVE LENGTH OF WS-2-2A-S TO WS-2-S-LEN
          methodOut.setSLen2((short) A_S_22_LENGTH);
//  MOVE LENGTH OF WS-2-2A-T TO WS-2-T-LEN
          methodOut.setTLen2((short) AT22.getAT22FieldLength());
//  SUBTRACT 3 FROM WS-2-S-LEN
          methodOut.setSLen2( (short) (methodOut.getSLen2()-(short)3));
//  SUBTRACT 5 FROM WS-2-T-LEN
          methodOut.setTLen2( (short) (methodOut.getTLen2()-(short)5));
//  MOVE WS-2-2A-S ( WS-THREE : WS-2-S-LEN ) TO WS-2-2A-T ( WS-FIVE : WS-2-T-LEN )
          methodOut.getAT22().replace(methodOut.getAS22(),(methodIn.getThree()-1)/* aS22 */ ,methodOut.getSLen2(),(methodIn.getFive()-1),methodOut.getTLen2() /* replace,startIndex,targetLen */);

// *
//  DISPLAY '*119* WS-2-2A-S        = (' WS-2-2A-S ')'
          logger.info("*119* WS-2-2A-S        = ({})", new String(methodOut.getAS22())); 
//  DISPLAY '*120* WS-2-2A-T        = (' WS-2-2A-T ')'
          logger.info("*120* WS-2-2A-T        = ({})", methodOut.getAT22().toString()); 
//  DISPLAY '*121*   WS-2-2A-T-FLD1 = (' WS-2-2A-T-FLD1 ')'
          logger.info("*121*   WS-2-2A-T-FLD1 = ({})", new String(methodOut.getATFld122())); 
//  DISPLAY '*122*   WS-2-2A-T-FLD2 = (' WS-2-2A-T-FLD2 ')'
          logger.info("*122*   WS-2-2A-T-FLD2 = ({})", new String(methodOut.getATFld222())); 

// *
// * Src -> string; tgt -> group ; src smaller than tgt
// *
//  INITIALIZE WS-2-2B-S WS-2-2B-T
          methodOut.setBS22(CONSTANTS.SPACE_70 /* Fill 70 Spaces*/);
          methodOut.getBT22().initialize();
          // MOVE ALL 'ABCD' TO WS-2-2B-S
          methodOut.setBS22(CONSTANTS.LITERAL_1222519919);
//  MOVE ALL 'MNOP' TO WS-2-2B-T-FLD3
          methodOut.setBTFld322(CONSTANTS.LITERAL_MNOPMNOPMNOPMNOPMNOPMNOPMNOPMNOP);
//  MOVE WS-2-2B-S ( WS-THREE : LENGTH OF WS-2-2B-S - 3 ) TO WS-2-2B-T ( WS-FIVE : LENGTH OF WS-2-2B-T - 5)
          methodOut.getBT22().replace(methodOut.getBS22(),(methodIn.getThree()-1)/* bS22 */ ,B_S_22_LENGTH - 3,(methodIn.getFive()-1),BT22.getBT22FieldLength() - 5 /* replace,startIndex,targetLen */);

// *
//  DISPLAY '*123* WS-2-2B-S        = (' WS-2-2B-S ')'
          logger.info("*123* WS-2-2B-S        = ({})", new String(methodOut.getBS22())); 
//  DISPLAY '*124* WS-2-2B-T        = (' WS-2-2B-T ')'
          logger.info("*124* WS-2-2B-T        = ({})", methodOut.getBT22().toString()); 
//  DISPLAY '*125*   WS-2-2B-T-FLD1 = (' WS-2-2B-T-FLD1 ')'
          logger.info("*125*   WS-2-2B-T-FLD1 = ({})", new String(methodOut.getBTFld122())); 
//  DISPLAY '*126*   WS-2-2B-T-FLD2 = (' WS-2-2B-T-FLD2 ')'
          logger.info("*126*   WS-2-2B-T-FLD2 = ({})", new String(methodOut.getBTFld222())); 
//  DISPLAY '*127*   WS-2-2B-T-FLD3 = (' WS-2-2B-T-FLD3 ')'
          logger.info("*127*   WS-2-2B-T-FLD3 = ({})", new String(methodOut.getBTFld322())); 

// *
//  INITIALIZE WS-2-2B-S WS-2-2B-T
          methodOut.setBS22(CONSTANTS.SPACE_70 /* Fill 70 Spaces*/);
          methodOut.getBT22().initialize();
          // MOVE ALL 'ABCD' TO WS-2-2B-S
          methodOut.setBS22(CONSTANTS.LITERAL_1222519919);
//  MOVE ALL 'MNOP' TO WS-2-2B-T-FLD3
          methodOut.setBTFld322(CONSTANTS.LITERAL_MNOPMNOPMNOPMNOPMNOPMNOPMNOPMNOP);
//  MOVE LENGTH OF WS-2-2B-S TO WS-2-S-LEN
          methodOut.setSLen2((short) B_S_22_LENGTH);
//  MOVE LENGTH OF WS-2-2B-T TO WS-2-T-LEN
          methodOut.setTLen2((short) BT22.getBT22FieldLength());
//  SUBTRACT 3 FROM WS-2-S-LEN
          methodOut.setSLen2( (short) (methodOut.getSLen2()-(short)3));
//  SUBTRACT 5 FROM WS-2-T-LEN
          methodOut.setTLen2( (short) (methodOut.getTLen2()-(short)5));
//  MOVE WS-2-2B-S ( WS-THREE : WS-2-S-LEN ) TO WS-2-2B-T ( WS-FIVE : WS-2-T-LEN )
          methodOut.getBT22().replace(methodOut.getBS22(),(methodIn.getThree()-1)/* bS22 */ ,methodOut.getSLen2(),(methodIn.getFive()-1),methodOut.getTLen2() /* replace,startIndex,targetLen */);

// *
//  DISPLAY '*128* WS-2-2B-S        = (' WS-2-2B-S ')'
          logger.info("*128* WS-2-2B-S        = ({})", new String(methodOut.getBS22())); 
      
      return methodOut;
      }
      /**
      * mainlineSplit5 
      *   This method is derived from 
  *   COBOL Paragraph - MAINLINE-SPLIT5 COBOL Cyclomatic complexity - 1
      * Input  :  

      * - bT22                           COBOL Name: WS-2-2B-T
      * - bTFld122                       COBOL Name: WS-2-2B-T-FLD1
      * - bTFld222                       COBOL Name: WS-2-2B-T-FLD2
      * - bTFld322                       COBOL Name: WS-2-2B-T-FLD3
      *
      * Output :  

      * - aS23                           COBOL Name: WS-2-3A-S
      * - aT23                           COBOL Name: WS-2-3A-T
      * - aSFld123                       COBOL Name: WS-2-3A-S-FLD1
      * - aSFld223                       COBOL Name: WS-2-3A-S-FLD2
      * - aTFld123                       COBOL Name: WS-2-3A-T-FLD1
      * - aTFld223                       COBOL Name: WS-2-3A-T-FLD2
      * - tLen2                          COBOL Name: WS-2-T-LEN
      * - bS23                           COBOL Name: WS-2-3B-S
      * - bT23                           COBOL Name: WS-2-3B-T
      * - bSFld123                       COBOL Name: WS-2-3B-S-FLD1
      * - bSFld223                       COBOL Name: WS-2-3B-S-FLD2
      * - bTFld323                       COBOL Name: WS-2-3B-T-FLD3
      * - bTFld123                       COBOL Name: WS-2-3B-T-FLD1
      * - bTFld223                       COBOL Name: WS-2-3B-T-FLD2
      *
      * @throws CFException
      */
      @Override
      public MainlineSplit5OutCtx mainlineSplit5(MainlineSplit5InCtx methodIn) throws Exception {
Refmod3Ctx programCtx = methodIn.getRefmod3Ctx();
MainlineSplit5OutCtx methodOut = methodIn.getMainlineSplit5OutCtx();
//  DISPLAY '*129* WS-2-2B-T        = (' WS-2-2B-T ')'
          logger.info("*129* WS-2-2B-T        = ({})", methodIn.getBT22().toString()); 
//  DISPLAY '*130*   WS-2-2B-T-FLD1 = (' WS-2-2B-T-FLD1 ')'
          logger.info("*130*   WS-2-2B-T-FLD1 = ({})", new String(methodIn.getBTFld122())); 
//  DISPLAY '*131*   WS-2-2B-T-FLD2 = (' WS-2-2B-T-FLD2 ')'
          logger.info("*131*   WS-2-2B-T-FLD2 = ({})", new String(methodIn.getBTFld222())); 
//  DISPLAY '*132*   WS-2-2B-T-FLD3 = (' WS-2-2B-T-FLD3 ')'
          logger.info("*132*   WS-2-2B-T-FLD3 = ({})", new String(methodIn.getBTFld322())); 

// *
// * Src -> group; tgt -> group ; src bigger than tgt
// *
//  INITIALIZE WS-2-3A-S WS-2-3A-T
          methodOut.getAS23().initialize();
          methodOut.getAT23().initialize();
//  MOVE ALL 'ABCD' TO WS-2-3A-S-FLD1
          methodOut.setASFld123(CONSTANTS.LITERAL_ABCDABCDABCDABCDABCDABCDABCDABCD);
//  MOVE ALL 'ZYXW' TO WS-2-3A-S-FLD2
          methodOut.setASFld223(CONSTANTS.LITERAL_645286444);
//  MOVE WS-2-3A-S TO WS-2-3A-T ( WS-FIVE : LENGTH OF WS-2-3A-T - 5)
          methodOut.getAT23().replace(methodOut.getAS23().getCharArray(),0,methodOut.getAS23().length(),(methodIn.getFive()-1),AT23.getAT23FieldLength() - 5 /* replace,sourceIndex,sourceLen,targetIndex,targetLen */);

// *
//  DISPLAY '*133* WS-2-3A-S        = (' WS-2-3A-S ')'
          logger.info("*133* WS-2-3A-S        = ({})", methodOut.getAS23().toString()); 
//  DISPLAY '*134*   WS-2-3A-S-FLD1 = (' WS-2-3A-S-FLD1 ')'
          logger.info("*134*   WS-2-3A-S-FLD1 = ({})", new String(methodOut.getASFld123())); 
//  DISPLAY '*135*   WS-2-3A-S-FLD2 = (' WS-2-3A-S-FLD2 ')'
          logger.info("*135*   WS-2-3A-S-FLD2 = ({})", new String(methodOut.getASFld223())); 
//  DISPLAY '*136* WS-2-3A-T        = (' WS-2-3A-T ')'
          logger.info("*136* WS-2-3A-T        = ({})", methodOut.getAT23().toString()); 
//  DISPLAY '*137*   WS-2-3A-T-FLD1 = (' WS-2-3A-T-FLD1 ')'
          logger.info("*137*   WS-2-3A-T-FLD1 = ({})", new String(methodOut.getATFld123())); 
//  DISPLAY '*138*   WS-2-3A-T-FLD2 = (' WS-2-3A-T-FLD2 ')'
          logger.info("*138*   WS-2-3A-T-FLD2 = ({})", new String(methodOut.getATFld223())); 

// *
//  INITIALIZE WS-2-3A-S WS-2-3A-T
          methodOut.getAS23().initialize();
          methodOut.getAT23().initialize();
//  MOVE ALL 'ABCD' TO WS-2-3A-S-FLD1
          methodOut.setASFld123(CONSTANTS.LITERAL_ABCDABCDABCDABCDABCDABCDABCDABCD);
//  MOVE ALL 'ZYXW' TO WS-2-3A-S-FLD2
          methodOut.setASFld223(CONSTANTS.LITERAL_645286444);
//  MOVE LENGTH OF WS-2-3A-T TO WS-2-T-LEN
          methodOut.setTLen2((short) AT23.getAT23FieldLength());
//  SUBTRACT 5 FROM WS-2-T-LEN
          methodOut.setTLen2( (short) (methodOut.getTLen2()-(short)5));
//  MOVE WS-2-3A-S TO WS-2-3A-T ( WS-FIVE : WS-2-T-LEN )
          methodOut.getAT23().replace(methodOut.getAS23().getCharArray(),0,methodOut.getAS23().length(),(methodIn.getFive()-1),methodOut.getTLen2() /* replace,sourceIndex,sourceLen,targetIndex,targetLen */);

// *
//  DISPLAY '*139* WS-2-3A-S        = (' WS-2-3A-S ')'
          logger.info("*139* WS-2-3A-S        = ({})", methodOut.getAS23().toString()); 
//  DISPLAY '*140*   WS-2-3A-S-FLD1 = (' WS-2-3A-S-FLD1 ')'
          logger.info("*140*   WS-2-3A-S-FLD1 = ({})", new String(methodOut.getASFld123())); 
//  DISPLAY '*141*   WS-2-3A-S-FLD2 = (' WS-2-3A-S-FLD2 ')'
          logger.info("*141*   WS-2-3A-S-FLD2 = ({})", new String(methodOut.getASFld223())); 
//  DISPLAY '*142* WS-2-3A-T        = (' WS-2-3A-T ')'
          logger.info("*142* WS-2-3A-T        = ({})", methodOut.getAT23().toString()); 
//  DISPLAY '*143*   WS-2-3A-T-FLD1 = (' WS-2-3A-T-FLD1 ')'
          logger.info("*143*   WS-2-3A-T-FLD1 = ({})", new String(methodOut.getATFld123())); 
//  DISPLAY '*144*   WS-2-3A-T-FLD2 = (' WS-2-3A-T-FLD2 ')'
          logger.info("*144*   WS-2-3A-T-FLD2 = ({})", new String(methodOut.getATFld223())); 

// *
// * Src -> group; tgt -> group ; src smaller than tgt
// *
//  INITIALIZE WS-2-3B-S WS-2-3B-T
          methodOut.getBS23().initialize();
          methodOut.getBT23().initialize();
//  MOVE ALL 'ABCD' TO WS-2-3B-S-FLD1
          methodOut.setBSFld123(CONSTANTS.LITERAL_ABCDABCDABCDABCDABCDABCDABCDABCD);
//  MOVE ALL 'ZYXW' TO WS-2-3B-S-FLD2
          methodOut.setBSFld223(CONSTANTS.LITERAL_645286444);
//  MOVE ALL 'MNOP' TO WS-2-3B-T-FLD3
          methodOut.setBTFld323(CONSTANTS.LITERAL_MNOPMNOPMNOPMNOPMNOPMNOPMNOPMNOP);
//  MOVE WS-2-3B-S TO WS-2-3B-T ( WS-FIVE : LENGTH OF WS-2-3B-T - 5)
          methodOut.getBT23().replace(methodOut.getBS23().getCharArray(),0,methodOut.getBS23().length(),(methodIn.getFive()-1),BT23.getBT23FieldLength() - 5 /* replace,sourceIndex,sourceLen,targetIndex,targetLen */);

// *
//  DISPLAY '*145* WS-2-3B-S        = (' WS-2-3B-S ')'
          logger.info("*145* WS-2-3B-S        = ({})", methodOut.getBS23().toString()); 
//  DISPLAY '*146*   WS-2-3B-S-FLD1 = (' WS-2-3B-S-FLD1 ')'
          logger.info("*146*   WS-2-3B-S-FLD1 = ({})", new String(methodOut.getBSFld123())); 
//  DISPLAY '*147*   WS-2-3B-S-FLD2 = (' WS-2-3B-S-FLD2 ')'
          logger.info("*147*   WS-2-3B-S-FLD2 = ({})", new String(methodOut.getBSFld223())); 
//  DISPLAY '*148* WS-2-3B-T        = (' WS-2-3B-T ')'
          logger.info("*148* WS-2-3B-T        = ({})", methodOut.getBT23().toString()); 
//  DISPLAY '*149*   WS-2-3B-T-FLD1 = (' WS-2-3B-T-FLD1 ')'
          logger.info("*149*   WS-2-3B-T-FLD1 = ({})", new String(methodOut.getBTFld123())); 
//  DISPLAY '*150*   WS-2-3B-T-FLD2 = (' WS-2-3B-T-FLD2 ')'
          logger.info("*150*   WS-2-3B-T-FLD2 = ({})", new String(methodOut.getBTFld223())); 
//  DISPLAY '*151*   WS-2-3B-T-FLD3 = (' WS-2-3B-T-FLD3 ')'
          logger.info("*151*   WS-2-3B-T-FLD3 = ({})", new String(methodOut.getBTFld323())); 

// *
//  INITIALIZE WS-2-3B-S WS-2-3B-T
          methodOut.getBS23().initialize();
          methodOut.getBT23().initialize();
//  MOVE ALL 'ABCD' TO WS-2-3B-S-FLD1
          methodOut.setBSFld123(CONSTANTS.LITERAL_ABCDABCDABCDABCDABCDABCDABCDABCD);
//  MOVE ALL 'ZYXW' TO WS-2-3B-S-FLD2
          methodOut.setBSFld223(CONSTANTS.LITERAL_645286444);
//  MOVE ALL 'MNOP' TO WS-2-3B-T-FLD3
          methodOut.setBTFld323(CONSTANTS.LITERAL_MNOPMNOPMNOPMNOPMNOPMNOPMNOPMNOP);
//  MOVE LENGTH OF WS-2-3B-T TO WS-2-T-LEN
          methodOut.setTLen2((short) BT23.getBT23FieldLength());
//  SUBTRACT 5 FROM WS-2-T-LEN
          methodOut.setTLen2( (short) (methodOut.getTLen2()-(short)5));
//  MOVE WS-2-3B-S TO WS-2-3B-T ( WS-FIVE : WS-2-T-LEN )
          methodOut.getBT23().replace(methodOut.getBS23().getCharArray(),0,methodOut.getBS23().length(),(methodIn.getFive()-1),methodOut.getTLen2() /* replace,sourceIndex,sourceLen,targetIndex,targetLen */);

// *
//  DISPLAY '*152* WS-2-3B-S        = (' WS-2-3B-S ')'
          logger.info("*152* WS-2-3B-S        = ({})", methodOut.getBS23().toString()); 
//  DISPLAY '*153*   WS-2-3B-S-FLD1 = (' WS-2-3B-S-FLD1 ')'
          logger.info("*153*   WS-2-3B-S-FLD1 = ({})", new String(methodOut.getBSFld123())); 
//  DISPLAY '*154*   WS-2-3B-S-FLD2 = (' WS-2-3B-S-FLD2 ')'
          logger.info("*154*   WS-2-3B-S-FLD2 = ({})", new String(methodOut.getBSFld223())); 
//  DISPLAY '*155* WS-2-3B-T        = (' WS-2-3B-T ')'
          logger.info("*155* WS-2-3B-T        = ({})", methodOut.getBT23().toString()); 
//  DISPLAY '*156*   WS-2-3B-T-FLD1 = (' WS-2-3B-T-FLD1 ')'
          logger.info("*156*   WS-2-3B-T-FLD1 = ({})", new String(methodOut.getBTFld123())); 
//  DISPLAY '*157*   WS-2-3B-T-FLD2 = (' WS-2-3B-T-FLD2 ')'
          logger.info("*157*   WS-2-3B-T-FLD2 = ({})", new String(methodOut.getBTFld223())); 
      
      return methodOut;
      }
      /**
      * mainlineSplit6 
      *   This method is derived from 
  *   COBOL Paragraph - MAINLINE-SPLIT6 COBOL Cyclomatic complexity - 1
      * Input  :  

      * - bTFld323                       COBOL Name: WS-2-3B-T-FLD3
      * - aSGrp25                        COBOL Name: WS-2-5A-S-GRP
      *
      * Output :  

      * - aS24                           COBOL Name: WS-2-4A-S
      * - aT24                           COBOL Name: WS-2-4A-T
      * - aTFld124                       COBOL Name: WS-2-4A-T-FLD1
      * - aTFld224                       COBOL Name: WS-2-4A-T-FLD2
      * - tLen2                          COBOL Name: WS-2-T-LEN
      * - bS24                           COBOL Name: WS-2-4B-S
      * - bT24                           COBOL Name: WS-2-4B-T
      * - bTFld324                       COBOL Name: WS-2-4B-T-FLD3
      * - bTFld124                       COBOL Name: WS-2-4B-T-FLD1
      * - bTFld224                       COBOL Name: WS-2-4B-T-FLD2
      * - aS25                           COBOL Name: WS-2-5A-S
      * - aT25                           COBOL Name: WS-2-5A-T
      * - aSFld125                       COBOL Name: WS-2-5A-S-FLD1
      * - aSFld225                       COBOL Name: WS-2-5A-S-FLD2
      * - aTFld125                       COBOL Name: WS-2-5A-T-FLD1
      * - aTFld225                       COBOL Name: WS-2-5A-T-FLD2
      *
      * @throws CFException
      */
      @Override
      public MainlineSplit6OutCtx mainlineSplit6(MainlineSplit6InCtx methodIn) throws Exception {
Refmod3Ctx programCtx = methodIn.getRefmod3Ctx();
MainlineSplit6OutCtx methodOut = methodIn.getMainlineSplit6OutCtx();
//  DISPLAY '*158*   WS-2-3B-T-FLD3 = (' WS-2-3B-T-FLD3 ')'
          logger.info("*158*   WS-2-3B-T-FLD3 = ({})", new String(methodIn.getBTFld323())); 

// *
// * Src -> string; tgt -> group ; src bigger than tgt
// *
//  INITIALIZE WS-2-4A-S WS-2-4A-T
          methodOut.setAS24(CONSTANTS.SPACE_70 /* Fill 70 Spaces*/);
          methodOut.getAT24().initialize();
          // MOVE ALL 'ABCD' TO WS-2-4A-S
          methodOut.setAS24(CONSTANTS.LITERAL_1222519919);
//  MOVE WS-2-4A-S TO WS-2-4A-T ( WS-FIVE : LENGTH OF WS-2-4A-T - 5)
          methodOut.getAT24().replace(methodOut.getAS24(),0,methodOut.getAS24().length,(methodIn.getFive()-1),AT24.getAT24FieldLength() - 5 /* replace,sourceIndex,sourceLen,targetIndex,targetLen */);

// *
//  DISPLAY '*159* WS-2-4A-S        = (' WS-2-4A-S ')'
          logger.info("*159* WS-2-4A-S        = ({})", new String(methodOut.getAS24())); 
//  DISPLAY '*160* WS-2-4A-T        = (' WS-2-4A-T ')'
          logger.info("*160* WS-2-4A-T        = ({})", methodOut.getAT24().toString()); 
//  DISPLAY '*161*   WS-2-4A-T-FLD1 = (' WS-2-4A-T-FLD1 ')'
          logger.info("*161*   WS-2-4A-T-FLD1 = ({})", new String(methodOut.getATFld124())); 
//  DISPLAY '*162*   WS-2-4A-T-FLD2 = (' WS-2-4A-T-FLD2 ')'
          logger.info("*162*   WS-2-4A-T-FLD2 = ({})", new String(methodOut.getATFld224())); 

// *
//  INITIALIZE WS-2-4A-S WS-2-4A-T
          methodOut.setAS24(CONSTANTS.SPACE_70 /* Fill 70 Spaces*/);
          methodOut.getAT24().initialize();
          // MOVE ALL 'ABCD' TO WS-2-4A-S
          methodOut.setAS24(CONSTANTS.LITERAL_1222519919);
//  MOVE LENGTH OF WS-2-4A-T TO WS-2-T-LEN
          methodOut.setTLen2((short) AT24.getAT24FieldLength());
//  SUBTRACT 5 FROM WS-2-T-LEN
          methodOut.setTLen2( (short) (methodOut.getTLen2()-(short)5));
//  MOVE WS-2-4A-S TO WS-2-4A-T ( WS-FIVE : WS-2-T-LEN )
          methodOut.getAT24().replace(methodOut.getAS24(),0,methodOut.getAS24().length,(methodIn.getFive()-1),methodOut.getTLen2() /* replace,sourceIndex,sourceLen,targetIndex,targetLen */);

// *
//  DISPLAY '*163* WS-2-4A-S        = (' WS-2-4A-S ')'
          logger.info("*163* WS-2-4A-S        = ({})", new String(methodOut.getAS24())); 
//  DISPLAY '*164* WS-2-4A-T        = (' WS-2-4A-T ')'
          logger.info("*164* WS-2-4A-T        = ({})", methodOut.getAT24().toString()); 
//  DISPLAY '*165*   WS-2-4A-T-FLD1 = (' WS-2-4A-T-FLD1 ')'
          logger.info("*165*   WS-2-4A-T-FLD1 = ({})", new String(methodOut.getATFld124())); 
//  DISPLAY '*166*   WS-2-4A-T-FLD2 = (' WS-2-4A-T-FLD2 ')'
          logger.info("*166*   WS-2-4A-T-FLD2 = ({})", new String(methodOut.getATFld224())); 

// *
// * Src -> string; tgt -> group ; src smaller than tgt
// *
//  INITIALIZE WS-2-4B-S WS-2-4B-T
          methodOut.setBS24(CONSTANTS.SPACE_70 /* Fill 70 Spaces*/);
          methodOut.getBT24().initialize();
          // MOVE ALL 'ABCD' TO WS-2-4B-S
          methodOut.setBS24(CONSTANTS.LITERAL_1222519919);
//  MOVE ALL 'MNOP' TO WS-2-4B-T-FLD3
          methodOut.setBTFld324(CONSTANTS.LITERAL_MNOPMNOPMNOPMNOPMNOPMNOPMNOPMNOP);
//  MOVE WS-2-4B-S TO WS-2-4B-T ( WS-FIVE : LENGTH OF WS-2-4B-T - 5)
          methodOut.getBT24().replace(methodOut.getBS24(),0,methodOut.getBS24().length,(methodIn.getFive()-1),BT24.getBT24FieldLength() - 5 /* replace,sourceIndex,sourceLen,targetIndex,targetLen */);

// *
//  DISPLAY '*167* WS-2-4B-S        = (' WS-2-4B-S ')'
          logger.info("*167* WS-2-4B-S        = ({})", new String(methodOut.getBS24())); 
//  DISPLAY '*168* WS-2-4B-T        = (' WS-2-4B-T ')'
          logger.info("*168* WS-2-4B-T        = ({})", methodOut.getBT24().toString()); 
//  DISPLAY '*169*   WS-2-4B-T-FLD1 = (' WS-2-4B-T-FLD1 ')'
          logger.info("*169*   WS-2-4B-T-FLD1 = ({})", new String(methodOut.getBTFld124())); 
//  DISPLAY '*170*   WS-2-4B-T-FLD2 = (' WS-2-4B-T-FLD2 ')'
          logger.info("*170*   WS-2-4B-T-FLD2 = ({})", new String(methodOut.getBTFld224())); 
//  DISPLAY '*171*   WS-2-4B-T-FLD3 = (' WS-2-4B-T-FLD3 ')'
          logger.info("*171*   WS-2-4B-T-FLD3 = ({})", new String(methodOut.getBTFld324())); 

// *
//  INITIALIZE WS-2-4B-S WS-2-4B-T
          methodOut.setBS24(CONSTANTS.SPACE_70 /* Fill 70 Spaces*/);
          methodOut.getBT24().initialize();
          // MOVE ALL 'ABCD' TO WS-2-4B-S
          methodOut.setBS24(CONSTANTS.LITERAL_1222519919);
//  MOVE ALL 'MNOP' TO WS-2-4B-T-FLD3
          methodOut.setBTFld324(CONSTANTS.LITERAL_MNOPMNOPMNOPMNOPMNOPMNOPMNOPMNOP);
//  MOVE LENGTH OF WS-2-4B-T TO WS-2-T-LEN
          methodOut.setTLen2((short) BT24.getBT24FieldLength());
//  SUBTRACT 5 FROM WS-2-T-LEN
          methodOut.setTLen2( (short) (methodOut.getTLen2()-(short)5));
//  MOVE WS-2-4B-S TO WS-2-4B-T ( WS-FIVE : WS-2-T-LEN )
          methodOut.getBT24().replace(methodOut.getBS24(),0,methodOut.getBS24().length,(methodIn.getFive()-1),methodOut.getTLen2() /* replace,sourceIndex,sourceLen,targetIndex,targetLen */);

// *
//  DISPLAY '*172* WS-2-4B-S        = (' WS-2-4B-S ')'
          logger.info("*172* WS-2-4B-S        = ({})", new String(methodOut.getBS24())); 
//  DISPLAY '*173* WS-2-4B-T        = (' WS-2-4B-T ')'
          logger.info("*173* WS-2-4B-T        = ({})", methodOut.getBT24().toString()); 
//  DISPLAY '*174*   WS-2-4B-T-FLD1 = (' WS-2-4B-T-FLD1 ')'
          logger.info("*174*   WS-2-4B-T-FLD1 = ({})", new String(methodOut.getBTFld124())); 
//  DISPLAY '*175*   WS-2-4B-T-FLD2 = (' WS-2-4B-T-FLD2 ')'
          logger.info("*175*   WS-2-4B-T-FLD2 = ({})", new String(methodOut.getBTFld224())); 
//  DISPLAY '*176*   WS-2-4B-T-FLD3 = (' WS-2-4B-T-FLD3 ')'
          logger.info("*176*   WS-2-4B-T-FLD3 = ({})", new String(methodOut.getBTFld324())); 

// *
// * Src -> group; tgt -> group ; src bigger than tgt ; src offset 3
// *
//  INITIALIZE WS-2-5A-S WS-2-5A-T
          methodOut.getAS25().initialize();
          methodOut.getAT25().initialize();
//  MOVE ALL 'ABCD' TO WS-2-5A-S-FLD1
          methodOut.setASFld125(CONSTANTS.LITERAL_ABCDABCDABCDABCDABCDABCDABCDABCD);
//  MOVE ALL 'ZYXW' TO WS-2-5A-S-FLD2
          methodOut.setASFld225(CONSTANTS.LITERAL_645286444);
//  MOVE WS-2-5A-S ( WS-ONE : LENGTH OF WS-2-5A-S ) TO WS-2-5A-T ( WS-ONE : LENGTH OF WS-2-5A-T )
          methodOut.getAT25().replace(methodIn.getASGrp25()/*parent*/,3+methodIn.getOne() - 1/*fromOffset - (aT25) */,AS25.getAS25FieldLength()/*fromLen*/,0+methodIn.getOne() - 1/*toOffset - (aS25) */,AT25.getAT25FieldLength()/*toLen*/);

// *
//  DISPLAY '*177* WS-2-5A-S-GRP    = (' WS-2-5A-S-GRP ')'
          logger.info("*177* WS-2-5A-S-GRP    = ({})", methodIn.getASGrp25().toString()); 
//  DISPLAY '*178* WS-2-5A-S        = (' WS-2-5A-S ')'
          logger.info("*178* WS-2-5A-S        = ({})", methodOut.getAS25().toString()); 
//  DISPLAY '*179*   WS-2-5A-S-FLD1 = (' WS-2-5A-S-FLD1 ')'
          logger.info("*179*   WS-2-5A-S-FLD1 = ({})", new String(methodOut.getASFld125())); 
//  DISPLAY '*180*   WS-2-5A-S-FLD2 = (' WS-2-5A-S-FLD2 ')'
          logger.info("*180*   WS-2-5A-S-FLD2 = ({})", new String(methodOut.getASFld225())); 
//  DISPLAY '*181* WS-2-5A-T        = (' WS-2-5A-T ')'
          logger.info("*181* WS-2-5A-T        = ({})", methodOut.getAT25().toString()); 
//  DISPLAY '*182*   WS-2-5A-T-FLD1 = (' WS-2-5A-T-FLD1 ')'
          logger.info("*182*   WS-2-5A-T-FLD1 = ({})", new String(methodOut.getATFld125())); 
//  DISPLAY '*183*   WS-2-5A-T-FLD2 = (' WS-2-5A-T-FLD2 ')'
          logger.info("*183*   WS-2-5A-T-FLD2 = ({})", new String(methodOut.getATFld225())); 

// *
//  INITIALIZE WS-2-5A-S WS-2-5A-T
          methodOut.getAS25().initialize();
          methodOut.getAT25().initialize();
//  MOVE ALL 'ABCD' TO WS-2-5A-S-FLD1
          methodOut.setASFld125(CONSTANTS.LITERAL_ABCDABCDABCDABCDABCDABCDABCDABCD);
//  MOVE ALL 'ZYXW' TO WS-2-5A-S-FLD2
          methodOut.setASFld225(CONSTANTS.LITERAL_645286444);
      
      return methodOut;
      }
      /**
      * mainlineSplit7 
      *   This method is derived from 
  *   COBOL Paragraph - MAINLINE-SPLIT7 COBOL Cyclomatic complexity - 1
      * Input  :  

      * - aS25                           COBOL Name: WS-2-5A-S
      * - aSGrp25                        COBOL Name: WS-2-5A-S-GRP
      * - bSGrp25                        COBOL Name: WS-2-5B-S-GRP
      * - aSGrp26                        COBOL Name: WS-2-6A-S-GRP
      *
      * Output :  

      * - sLen2                          COBOL Name: WS-2-S-LEN
      * - tLen2                          COBOL Name: WS-2-T-LEN
      * - aT25                           COBOL Name: WS-2-5A-T
      * - aS25                           COBOL Name: WS-2-5A-S
      * - aSFld125                       COBOL Name: WS-2-5A-S-FLD1
      * - aSFld225                       COBOL Name: WS-2-5A-S-FLD2
      * - aTFld125                       COBOL Name: WS-2-5A-T-FLD1
      * - aTFld225                       COBOL Name: WS-2-5A-T-FLD2
      * - bS25                           COBOL Name: WS-2-5B-S
      * - bT25                           COBOL Name: WS-2-5B-T
      * - bSFld125                       COBOL Name: WS-2-5B-S-FLD1
      * - bSFld225                       COBOL Name: WS-2-5B-S-FLD2
      * - bTFld325                       COBOL Name: WS-2-5B-T-FLD3
      * - bTFld125                       COBOL Name: WS-2-5B-T-FLD1
      * - bTFld225                       COBOL Name: WS-2-5B-T-FLD2
      * - aS26                           COBOL Name: WS-2-6A-S
      * - aT26                           COBOL Name: WS-2-6A-T
      * - aTFld126                       COBOL Name: WS-2-6A-T-FLD1
      * - aTFld226                       COBOL Name: WS-2-6A-T-FLD2
      *
      * @throws CFException
      */
      @Override
      public MainlineSplit7OutCtx mainlineSplit7(MainlineSplit7InCtx methodIn) throws Exception {
			// Declare local variables used in the method
			 final int A_S_26_LENGTH = 70;
			// End of variable declaration

Refmod3Ctx programCtx = methodIn.getRefmod3Ctx();
MainlineSplit7OutCtx methodOut = methodIn.getMainlineSplit7OutCtx();
//  MOVE LENGTH OF WS-2-5A-S TO WS-2-S-LEN
          methodOut.setSLen2((short) AS25.getAS25FieldLength());
//  MOVE LENGTH OF WS-2-5A-T TO WS-2-T-LEN
          methodOut.setTLen2((short) AT25.getAT25FieldLength());
//  MOVE WS-2-5A-S ( WS-ONE : WS-2-S-LEN ) TO WS-2-5A-T ( WS-ONE : WS-2-T-LEN )
          methodOut.getAT25().replace(methodIn.getASGrp25()/*parent*/,3+methodIn.getOne() - 1/*fromOffset - (aT25) */,methodOut.getSLen2()/*fromLen*/,0+methodIn.getOne() - 1/*toOffset - (aS25) */,methodOut.getTLen2()/*toLen*/);

// *
//  DISPLAY '*184* WS-2-5A-S-GRP    = (' WS-2-5A-S-GRP ')'
          logger.info("*184* WS-2-5A-S-GRP    = ({})", methodIn.getASGrp25().toString()); 
//  DISPLAY '*185* WS-2-5A-S        = (' WS-2-5A-S ')'
          logger.info("*185* WS-2-5A-S        = ({})", methodOut.getAS25().toString()); 
//  DISPLAY '*186*   WS-2-5A-S-FLD1 = (' WS-2-5A-S-FLD1 ')'
          logger.info("*186*   WS-2-5A-S-FLD1 = ({})", new String(methodOut.getASFld125())); 
//  DISPLAY '*187*   WS-2-5A-S-FLD2 = (' WS-2-5A-S-FLD2 ')'
          logger.info("*187*   WS-2-5A-S-FLD2 = ({})", new String(methodOut.getASFld225())); 
//  DISPLAY '*188* WS-2-5A-T        = (' WS-2-5A-T ')'
          logger.info("*188* WS-2-5A-T        = ({})", methodOut.getAT25().toString()); 
//  DISPLAY '*189*   WS-2-5A-T-FLD1 = (' WS-2-5A-T-FLD1 ')'
          logger.info("*189*   WS-2-5A-T-FLD1 = ({})", new String(methodOut.getATFld125())); 
//  DISPLAY '*190*   WS-2-5A-T-FLD2 = (' WS-2-5A-T-FLD2 ')'
          logger.info("*190*   WS-2-5A-T-FLD2 = ({})", new String(methodOut.getATFld225())); 

// *
// * Src -> group; tgt -> group ; src smaller than tgt ;src offset 3
// *
//  INITIALIZE WS-2-5B-S WS-2-5B-T
          methodOut.getBS25().initialize();
          methodOut.getBT25().initialize();
//  MOVE ALL 'ABCD' TO WS-2-5B-S-FLD1
          methodOut.setBSFld125(CONSTANTS.LITERAL_ABCDABCDABCDABCDABCDABCDABCDABCD);
//  MOVE ALL 'ZYXW' TO WS-2-5B-S-FLD2
          methodOut.setBSFld225(CONSTANTS.LITERAL_645286444);
//  MOVE ALL 'MNOP' TO WS-2-5B-T-FLD3
          methodOut.setBTFld325(CONSTANTS.LITERAL_MNOPMNOPMNOPMNOPMNOPMNOPMNOPMNOP);
//  MOVE WS-2-5B-S ( WS-ONE : LENGTH OF WS-2-5B-S ) TO WS-2-5B-T ( WS-ONE : LENGTH OF WS-2-5B-T )
          methodOut.getBT25().replace(methodIn.getBSGrp25()/*parent*/,3+methodIn.getOne() - 1/*fromOffset - (bT25) */,BS25.getBS25FieldLength()/*fromLen*/,0+methodIn.getOne() - 1/*toOffset - (bS25) */,BT25.getBT25FieldLength()/*toLen*/);

// *
//  DISPLAY '*191* WS-2-5B-S-GRP    = (' WS-2-5B-S-GRP ')'
          logger.info("*191* WS-2-5B-S-GRP    = ({})", methodIn.getBSGrp25().toString()); 
//  DISPLAY '*192* WS-2-5B-S        = (' WS-2-5B-S ')'
          logger.info("*192* WS-2-5B-S        = ({})", methodOut.getBS25().toString()); 
//  DISPLAY '*193*   WS-2-5B-S-FLD1 = (' WS-2-5B-S-FLD1 ')'
          logger.info("*193*   WS-2-5B-S-FLD1 = ({})", new String(methodOut.getBSFld125())); 
//  DISPLAY '*194*   WS-2-5B-S-FLD2 = (' WS-2-5B-S-FLD2 ')'
          logger.info("*194*   WS-2-5B-S-FLD2 = ({})", new String(methodOut.getBSFld225())); 
//  DISPLAY '*195* WS-2-5B-T        = (' WS-2-5B-T ')'
          logger.info("*195* WS-2-5B-T        = ({})", methodOut.getBT25().toString()); 
//  DISPLAY '*196*   WS-2-5B-T-FLD1 = (' WS-2-5B-T-FLD1 ')'
          logger.info("*196*   WS-2-5B-T-FLD1 = ({})", new String(methodOut.getBTFld125())); 
//  DISPLAY '*197*   WS-2-5B-T-FLD2 = (' WS-2-5B-T-FLD2 ')'
          logger.info("*197*   WS-2-5B-T-FLD2 = ({})", new String(methodOut.getBTFld225())); 
//  DISPLAY '*198*   WS-2-5B-T-FLD3 = (' WS-2-5B-T-FLD3 ')'
          logger.info("*198*   WS-2-5B-T-FLD3 = ({})", new String(methodOut.getBTFld325())); 

// *
//  INITIALIZE WS-2-5B-S WS-2-5B-T
          methodOut.getBS25().initialize();
          methodOut.getBT25().initialize();
//  MOVE ALL 'ABCD' TO WS-2-5B-S-FLD1
          methodOut.setBSFld125(CONSTANTS.LITERAL_ABCDABCDABCDABCDABCDABCDABCDABCD);
//  MOVE ALL 'ZYXW' TO WS-2-5B-S-FLD2
          methodOut.setBSFld225(CONSTANTS.LITERAL_645286444);
//  MOVE ALL 'MNOP' TO WS-2-5B-T-FLD3
          methodOut.setBTFld325(CONSTANTS.LITERAL_MNOPMNOPMNOPMNOPMNOPMNOPMNOPMNOP);
//  MOVE LENGTH OF WS-2-5B-S TO WS-2-S-LEN
          methodOut.setSLen2((short) BS25.getBS25FieldLength());
//  MOVE LENGTH OF WS-2-6B-T TO WS-2-T-LEN
          methodOut.setTLen2((short) BT26.getBT26FieldLength());
//  MOVE WS-2-5B-S ( WS-ONE : WS-2-S-LEN ) TO WS-2-5B-T ( WS-ONE : WS-2-T-LEN )
          methodOut.getBT25().replace(methodIn.getBSGrp25()/*parent*/,3+methodIn.getOne() - 1/*fromOffset - (bT25) */,methodOut.getSLen2()/*fromLen*/,0+methodIn.getOne() - 1/*toOffset - (bS25) */,methodOut.getTLen2()/*toLen*/);

// *
//  DISPLAY '*199* WS-2-5B-S-GRP    = (' WS-2-5B-S-GRP ')'
          logger.info("*199* WS-2-5B-S-GRP    = ({})", methodIn.getBSGrp25().toString()); 
//  DISPLAY '*200* WS-2-5B-S        = (' WS-2-5B-S ')'
          logger.info("*200* WS-2-5B-S        = ({})", methodOut.getBS25().toString()); 
//  DISPLAY '*201*   WS-2-5B-S-FLD1 = (' WS-2-5B-S-FLD1 ')'
          logger.info("*201*   WS-2-5B-S-FLD1 = ({})", new String(methodOut.getBSFld125())); 
//  DISPLAY '*202*   WS-2-5B-S-FLD2 = (' WS-2-5B-S-FLD2 ')'
          logger.info("*202*   WS-2-5B-S-FLD2 = ({})", new String(methodOut.getBSFld225())); 
//  DISPLAY '*203* WS-2-5B-T        = (' WS-2-5B-T ')'
          logger.info("*203* WS-2-5B-T        = ({})", methodOut.getBT25().toString()); 
//  DISPLAY '*204*   WS-2-5B-T-FLD1 = (' WS-2-5B-T-FLD1 ')'
          logger.info("*204*   WS-2-5B-T-FLD1 = ({})", new String(methodOut.getBTFld125())); 
//  DISPLAY '*205*   WS-2-5B-T-FLD2 = (' WS-2-5B-T-FLD2 ')'
          logger.info("*205*   WS-2-5B-T-FLD2 = ({})", new String(methodOut.getBTFld225())); 
//  DISPLAY '*206*   WS-2-5B-T-FLD3 = (' WS-2-5B-T-FLD3 ')'
          logger.info("*206*   WS-2-5B-T-FLD3 = ({})", new String(methodOut.getBTFld325())); 

// *
// * Src -> string; tgt -> group ; src bigger than tgt ; srcoffset 3
// *
//  INITIALIZE WS-2-6A-S WS-2-6A-T
          methodOut.setAS26(CONSTANTS.SPACE_70 /* Fill 70 Spaces*/);
          methodOut.getAT26().initialize();
//  MOVE ALL 'ABCD' TO WS-2-6A-S
          methodOut.setAS26(CONSTANTS.LITERAL_1222519919);
//  MOVE WS-2-6A-S ( WS-ONE : LENGTH OF WS-2-6A-S ) TO WS-2-6A-T ( WS-ONE : LENGTH OF WS-2-6A-T )
          methodOut.getAT26().replace(methodIn.getASGrp26()/*parent*/,3+methodIn.getOne() - 1/*fromOffset - (aT26) */,A_S_26_LENGTH/*fromLen*/,0+methodIn.getOne() - 1/*toOffset - (aS26) */,AT26.getAT26FieldLength()/*toLen*/);

// *
//  DISPLAY '*207* WS-2-6A-S-GRP    = (' WS-2-6A-S-GRP ')'
          logger.info("*207* WS-2-6A-S-GRP    = ({})", methodIn.getASGrp26().toString()); 
//  DISPLAY '*208* WS-2-6A-S        = (' WS-2-6A-S ')'
          logger.info("*208* WS-2-6A-S        = ({})", new String(methodOut.getAS26())); 
//  DISPLAY '*209* WS-2-6A-T        = (' WS-2-6A-T ')'
          logger.info("*209* WS-2-6A-T        = ({})", methodOut.getAT26().toString()); 
//  DISPLAY '*210*   WS-2-6A-T-FLD1 = (' WS-2-6A-T-FLD1 ')'
          logger.info("*210*   WS-2-6A-T-FLD1 = ({})", new String(methodOut.getATFld126())); 
//  DISPLAY '*211*   WS-2-6A-T-FLD2 = (' WS-2-6A-T-FLD2 ')'
          logger.info("*211*   WS-2-6A-T-FLD2 = ({})", new String(methodOut.getATFld226())); 

// *
//  INITIALIZE WS-2-6A-S WS-2-6A-T
          methodOut.setAS26(CONSTANTS.SPACE_70 /* Fill 70 Spaces*/);
          methodOut.getAT26().initialize();
//  MOVE ALL 'ABCD' TO WS-2-6A-S
          methodOut.setAS26(CONSTANTS.LITERAL_1222519919);
//  MOVE LENGTH OF WS-2-6A-S TO WS-2-S-LEN
          methodOut.setSLen2((short) A_S_26_LENGTH);
//  MOVE LENGTH OF WS-2-6A-T TO WS-2-T-LEN
          methodOut.setTLen2((short) AT26.getAT26FieldLength());
//  MOVE WS-2-6A-S ( WS-ONE : WS-2-S-LEN ) TO WS-2-6A-T ( WS-ONE : WS-2-T-LEN )
          methodOut.getAT26().replace(methodIn.getASGrp26()/*parent*/,3+methodIn.getOne() - 1/*fromOffset - (aT26) */,methodOut.getSLen2()/*fromLen*/,0+methodIn.getOne() - 1/*toOffset - (aS26) */,methodOut.getTLen2()/*toLen*/);
      
      return methodOut;
      }
      /**
      * mainlineSplit8 
      *   This method is derived from 
  *   COBOL Paragraph - MAINLINE-SPLIT8 COBOL Cyclomatic complexity - 1
      * Input  :  

      * - aSGrp26                        COBOL Name: WS-2-6A-S-GRP
      * - aS26                           COBOL Name: WS-2-6A-S
      * - aT26                           COBOL Name: WS-2-6A-T
      * - aTFld126                       COBOL Name: WS-2-6A-T-FLD1
      * - aTFld226                       COBOL Name: WS-2-6A-T-FLD2
      * - bSGrp26                        COBOL Name: WS-2-6B-S-GRP
      * - aTGrp27                        COBOL Name: WS-2-7A-T-GRP
      *
      * Output :  

      * - bS26                           COBOL Name: WS-2-6B-S
      * - bT26                           COBOL Name: WS-2-6B-T
      * - bTFld326                       COBOL Name: WS-2-6B-T-FLD3
      * - bTFld126                       COBOL Name: WS-2-6B-T-FLD1
      * - bTFld226                       COBOL Name: WS-2-6B-T-FLD2
      * - sLen2                          COBOL Name: WS-2-S-LEN
      * - tLen2                          COBOL Name: WS-2-T-LEN
      * - aS27                           COBOL Name: WS-2-7A-S
      * - aT27                           COBOL Name: WS-2-7A-T
      * - aSFld127                       COBOL Name: WS-2-7A-S-FLD1
      * - aSFld227                       COBOL Name: WS-2-7A-S-FLD2
      * - aTFld127                       COBOL Name: WS-2-7A-T-FLD1
      * - aTFld227                       COBOL Name: WS-2-7A-T-FLD2
      *
      * @throws CFException
      */
      @Override
      public MainlineSplit8OutCtx mainlineSplit8(MainlineSplit8InCtx methodIn) throws Exception {
			// Declare local variables used in the method
			 final int B_S_26_LENGTH = 70;
			// End of variable declaration

Refmod3Ctx programCtx = methodIn.getRefmod3Ctx();
MainlineSplit8OutCtx methodOut = methodIn.getMainlineSplit8OutCtx();

// *
//  DISPLAY '*212* WS-2-6A-S-GRP    = (' WS-2-6A-S-GRP ')'
          logger.info("*212* WS-2-6A-S-GRP    = ({})", methodIn.getASGrp26().toString()); 
//  DISPLAY '*213* WS-2-6A-S        = (' WS-2-6A-S ')'
          logger.info("*213* WS-2-6A-S        = ({})", new String(methodIn.getAS26())); 
//  DISPLAY '*214* WS-2-6A-T        = (' WS-2-6A-T ')'
          logger.info("*214* WS-2-6A-T        = ({})", methodIn.getAT26().toString()); 
//  DISPLAY '*215*   WS-2-6A-T-FLD1 = (' WS-2-6A-T-FLD1 ')'
          logger.info("*215*   WS-2-6A-T-FLD1 = ({})", new String(methodIn.getATFld126())); 
//  DISPLAY '*216*   WS-2-6A-T-FLD2 = (' WS-2-6A-T-FLD2 ')'
          logger.info("*216*   WS-2-6A-T-FLD2 = ({})", new String(methodIn.getATFld226())); 

// *
// * Src -> string; tgt -> group ; src smaller than tgt; srcoffset 3
// *
//  INITIALIZE WS-2-6B-S WS-2-6B-T
          methodOut.setBS26(CONSTANTS.SPACE_70 /* Fill 70 Spaces*/);
          methodOut.getBT26().initialize();
//  MOVE ALL 'ABCD' TO WS-2-6B-S
          methodOut.setBS26(CONSTANTS.LITERAL_1222519919);
//  MOVE ALL 'MNOP' TO WS-2-6B-T-FLD3
          methodOut.setBTFld326(CONSTANTS.LITERAL_MNOPMNOPMNOPMNOPMNOPMNOPMNOPMNOP);
//  MOVE WS-2-6B-S ( WS-ONE : LENGTH OF WS-2-6B-S ) TO WS-2-6B-T ( WS-ONE : LENGTH OF WS-2-6B-T )
          methodOut.getBT26().replace(methodIn.getBSGrp26()/*parent*/,3+methodIn.getOne() - 1/*fromOffset - (bT26) */,B_S_26_LENGTH/*fromLen*/,0+methodIn.getOne() - 1/*toOffset - (bS26) */,BT26.getBT26FieldLength()/*toLen*/);

// *
//  DISPLAY '*217* WS-2-6B-S-GRP    = (' WS-2-6B-S-GRP ')'
          logger.info("*217* WS-2-6B-S-GRP    = ({})", methodIn.getBSGrp26().toString()); 
//  DISPLAY '*218* WS-2-6B-S        = (' WS-2-6B-S ')'
          logger.info("*218* WS-2-6B-S        = ({})", new String(methodOut.getBS26())); 
//  DISPLAY '*219* WS-2-6B-T        = (' WS-2-6B-T ')'
          logger.info("*219* WS-2-6B-T        = ({})", methodOut.getBT26().toString()); 
//  DISPLAY '*220*   WS-2-6B-T-FLD1 = (' WS-2-6B-T-FLD1 ')'
          logger.info("*220*   WS-2-6B-T-FLD1 = ({})", new String(methodOut.getBTFld126())); 
//  DISPLAY '*221*   WS-2-6B-T-FLD2 = (' WS-2-6B-T-FLD2 ')'
          logger.info("*221*   WS-2-6B-T-FLD2 = ({})", new String(methodOut.getBTFld226())); 
//  DISPLAY '*222*   WS-2-6B-T-FLD3 = (' WS-2-6B-T-FLD3 ')'
          logger.info("*222*   WS-2-6B-T-FLD3 = ({})", new String(methodOut.getBTFld326())); 

// *
//  INITIALIZE WS-2-6B-S WS-2-6B-T
          methodOut.setBS26(CONSTANTS.SPACE_70 /* Fill 70 Spaces*/);
          methodOut.getBT26().initialize();
//  MOVE ALL 'ABCD' TO WS-2-6B-S
          methodOut.setBS26(CONSTANTS.LITERAL_1222519919);
//  MOVE ALL 'MNOP' TO WS-2-6B-T-FLD3
          methodOut.setBTFld326(CONSTANTS.LITERAL_MNOPMNOPMNOPMNOPMNOPMNOPMNOPMNOP);
//  MOVE LENGTH OF WS-2-6B-S TO WS-2-S-LEN
          methodOut.setSLen2((short) B_S_26_LENGTH);
//  MOVE LENGTH OF WS-2-6B-T TO WS-2-T-LEN
          methodOut.setTLen2((short) BT26.getBT26FieldLength());
//  MOVE WS-2-6B-S ( WS-ONE : WS-2-S-LEN ) TO WS-2-6B-T ( WS-ONE : WS-2-T-LEN )
          methodOut.getBT26().replace(methodIn.getBSGrp26()/*parent*/,3+methodIn.getOne() - 1/*fromOffset - (bT26) */,methodOut.getSLen2()/*fromLen*/,0+methodIn.getOne() - 1/*toOffset - (bS26) */,methodOut.getTLen2()/*toLen*/);

// *
//  DISPLAY '*223* WS-2-6B-S-GRP    = (' WS-2-6B-S-GRP ')'
          logger.info("*223* WS-2-6B-S-GRP    = ({})", methodIn.getBSGrp26().toString()); 
//  DISPLAY '*224* WS-2-6B-S        = (' WS-2-6B-S ')'
          logger.info("*224* WS-2-6B-S        = ({})", new String(methodOut.getBS26())); 
//  DISPLAY '*225* WS-2-6B-T        = (' WS-2-6B-T ')'
          logger.info("*225* WS-2-6B-T        = ({})", methodOut.getBT26().toString()); 
//  DISPLAY '*226*   WS-2-6B-T-FLD1 = (' WS-2-6B-T-FLD1 ')'
          logger.info("*226*   WS-2-6B-T-FLD1 = ({})", new String(methodOut.getBTFld126())); 
//  DISPLAY '*227*   WS-2-6B-T-FLD2 = (' WS-2-6B-T-FLD2 ')'
          logger.info("*227*   WS-2-6B-T-FLD2 = ({})", new String(methodOut.getBTFld226())); 
//  DISPLAY '*228*   WS-2-6B-T-FLD3 = (' WS-2-6B-T-FLD3 ')'
          logger.info("*228*   WS-2-6B-T-FLD3 = ({})", new String(methodOut.getBTFld326())); 

// *
// * Src -> group; tgt -> group ; src bigger than tgt ; tgt offset 5
// *
//  INITIALIZE WS-2-7A-S WS-2-7A-T
          methodOut.getAS27().initialize();
          methodOut.getAT27().initialize();
//  MOVE ALL 'ABCD' TO WS-2-7A-S-FLD1
          methodOut.setASFld127(CONSTANTS.LITERAL_ABCDABCDABCDABCDABCDABCDABCDABCD);
//  MOVE ALL 'ZYXW' TO WS-2-7A-S-FLD2
          methodOut.setASFld227(CONSTANTS.LITERAL_645286444);
//  MOVE WS-2-7A-S ( WS-ONE : LENGTH OF WS-2-7A-S ) TO WS-2-7A-T ( WS-ONE : LENGTH OF WS-2-7A-T )
          methodOut.getAT27().replace(methodOut.getAS27(),(methodIn.getOne()-1),AS27.getAS27FieldLength(), (methodOut.getAT27().begin + (methodIn.getOne()-1)) ,AT27.getAT27FieldLength() /* replace,sourceIndex,sourceLen,targetIndex,targetLen */);

// *
//  DISPLAY '*229* WS-2-7A-S        = (' WS-2-7A-S ')'
          logger.info("*229* WS-2-7A-S        = ({})", methodOut.getAS27().toString()); 
//  DISPLAY '*230*   WS-2-7A-S-FLD1 = (' WS-2-7A-S-FLD1 ')'
          logger.info("*230*   WS-2-7A-S-FLD1 = ({})", new String(methodOut.getASFld127())); 
//  DISPLAY '*231*   WS-2-7A-S-FLD2 = (' WS-2-7A-S-FLD2 ')'
          logger.info("*231*   WS-2-7A-S-FLD2 = ({})", new String(methodOut.getASFld227())); 
//  DISPLAY '*232* WS-2-7A-T-GRP    = (' WS-2-7A-T-GRP ')'
          logger.info("*232* WS-2-7A-T-GRP    = ({})", methodOut.getATGrp27().toString()); 
//  DISPLAY '*233* WS-2-7A-T        = (' WS-2-7A-T ')'
          logger.info("*233* WS-2-7A-T        = ({})", methodOut.getAT27().toString()); 
//  DISPLAY '*234*   WS-2-7A-T-FLD1 = (' WS-2-7A-T-FLD1 ')'
          logger.info("*234*   WS-2-7A-T-FLD1 = ({})", new String(methodOut.getATFld127())); 
//  DISPLAY '*235*   WS-2-7A-T-FLD2 = (' WS-2-7A-T-FLD2 ')'
          logger.info("*235*   WS-2-7A-T-FLD2 = ({})", new String(methodOut.getATFld227())); 

// *
//  INITIALIZE WS-2-7A-S WS-2-7A-T
          methodOut.getAS27().initialize();
          methodOut.getAT27().initialize();
//  MOVE ALL 'ABCD' TO WS-2-7A-S-FLD1
          methodOut.setASFld127(CONSTANTS.LITERAL_ABCDABCDABCDABCDABCDABCDABCDABCD);
//  MOVE ALL 'ZYXW' TO WS-2-7A-S-FLD2
          methodOut.setASFld227(CONSTANTS.LITERAL_645286444);
//  MOVE LENGTH OF WS-2-7A-S TO WS-2-S-LEN
          methodOut.setSLen2((short) AS27.getAS27FieldLength());
//  MOVE LENGTH OF WS-2-7A-T TO WS-2-T-LEN
          methodOut.setTLen2((short) AT27.getAT27FieldLength());
//  MOVE WS-2-7A-S ( WS-ONE : WS-2-S-LEN ) TO WS-2-7A-T ( WS-ONE : WS-2-T-LEN )
          methodOut.getAT27().replace(methodOut.getAS27(),(methodIn.getOne()-1),methodOut.getSLen2(), (methodOut.getAT27().begin + (methodIn.getOne()-1)) ,methodOut.getTLen2() /* replace,sourceIndex,sourceLen,targetIndex,targetLen */);

// *
//  DISPLAY '*236* WS-2-7A-S        = (' WS-2-7A-S ')'
          logger.info("*236* WS-2-7A-S        = ({})", methodOut.getAS27().toString()); 
//  DISPLAY '*237*   WS-2-7A-S-FLD1 = (' WS-2-7A-S-FLD1 ')'
          logger.info("*237*   WS-2-7A-S-FLD1 = ({})", new String(methodOut.getASFld127())); 
//  DISPLAY '*238*   WS-2-7A-S-FLD2 = (' WS-2-7A-S-FLD2 ')'
          logger.info("*238*   WS-2-7A-S-FLD2 = ({})", new String(methodOut.getASFld227())); 
//  DISPLAY '*239* WS-2-7A-T-GRP    = (' WS-2-7A-T-GRP ')'
          logger.info("*239* WS-2-7A-T-GRP    = ({})", methodOut.getATGrp27().toString()); 
//  DISPLAY '*240* WS-2-7A-T        = (' WS-2-7A-T ')'
          logger.info("*240* WS-2-7A-T        = ({})", methodOut.getAT27().toString()); 
//  DISPLAY '*241*   WS-2-7A-T-FLD1 = (' WS-2-7A-T-FLD1 ')'
          logger.info("*241*   WS-2-7A-T-FLD1 = ({})", new String(methodOut.getATFld127())); 
//  DISPLAY '*242*   WS-2-7A-T-FLD2 = (' WS-2-7A-T-FLD2 ')'
          logger.info("*242*   WS-2-7A-T-FLD2 = ({})", new String(methodOut.getATFld227())); 
      
      return methodOut;
      }
      /**
      * mainlineSplit9 
      *   This method is derived from 
  *   COBOL Paragraph - MAINLINE-SPLIT9 COBOL Cyclomatic complexity - 1
      * Input  :  

      * - bTGrp27                        COBOL Name: WS-2-7B-T-GRP
      * - aTGrp28                        COBOL Name: WS-2-8A-T-GRP
      * - bTGrp28                        COBOL Name: WS-2-8B-T-GRP
      *
      * Output :  

      * - bS27                           COBOL Name: WS-2-7B-S
      * - bT27                           COBOL Name: WS-2-7B-T
      * - bSFld127                       COBOL Name: WS-2-7B-S-FLD1
      * - bSFld227                       COBOL Name: WS-2-7B-S-FLD2
      * - bTFld327                       COBOL Name: WS-2-7B-T-FLD3
      * - bTFld127                       COBOL Name: WS-2-7B-T-FLD1
      * - bTFld227                       COBOL Name: WS-2-7B-T-FLD2
      * - aS28                           COBOL Name: WS-2-8A-S
      * - aT28                           COBOL Name: WS-2-8A-T
      * - aTFld128                       COBOL Name: WS-2-8A-T-FLD1
      * - aTFld228                       COBOL Name: WS-2-8A-T-FLD2
      * - sLen2                          COBOL Name: WS-2-S-LEN
      * - tLen2                          COBOL Name: WS-2-T-LEN
      * - bS28                           COBOL Name: WS-2-8B-S
      * - bT28                           COBOL Name: WS-2-8B-T
      * - bTFld328                       COBOL Name: WS-2-8B-T-FLD3
      * - bTFld128                       COBOL Name: WS-2-8B-T-FLD1
      * - bTFld228                       COBOL Name: WS-2-8B-T-FLD2
      *
      * @throws CFException
      */
      @Override
      public MainlineSplit9OutCtx mainlineSplit9(MainlineSplit9InCtx methodIn) throws Exception {
			// Declare local variables used in the method
			 final int A_S_28_LENGTH = 70;
			 final int B_S_28_LENGTH = 70;
			// End of variable declaration

Refmod3Ctx programCtx = methodIn.getRefmod3Ctx();
MainlineSplit9OutCtx methodOut = methodIn.getMainlineSplit9OutCtx();

// *
// * Src -> group; tgt -> group ; src smaller than tgt ;tgt offset 5
// *
//  INITIALIZE WS-2-7B-S WS-2-7B-T
          methodOut.getBS27().initialize();
          methodOut.getBT27().initialize();
//  MOVE ALL 'ABCD' TO WS-2-7B-S-FLD1
          methodOut.setBSFld127(CONSTANTS.LITERAL_ABCDABCDABCDABCDABCDABCDABCDABCD);
//  MOVE ALL 'ZYXW' TO WS-2-7B-S-FLD2
          methodOut.setBSFld227(CONSTANTS.LITERAL_645286444);
//  MOVE ALL 'MNOP' TO WS-2-7B-T-FLD3
          methodOut.setBTFld327(CONSTANTS.LITERAL_MNOPMNOPMNOPMNOPMNOPMNOPMNOPMNOP);
//  MOVE WS-2-7B-S ( WS-ONE : LENGTH OF WS-2-7B-S ) TO WS-2-7B-T ( WS-ONE : LENGTH OF WS-2-7B-T )
          methodOut.getBT27().replace(methodOut.getBS27(),(methodIn.getOne()-1),BS27.getBS27FieldLength(), (methodOut.getBT27().begin + (methodIn.getOne()-1)) ,BT27.getBT27FieldLength() /* replace,sourceIndex,sourceLen,targetIndex,targetLen */);

// *
//  DISPLAY '*243* WS-2-7B-S        = (' WS-2-7B-S ')'
          logger.info("*243* WS-2-7B-S        = ({})", methodOut.getBS27().toString()); 
//  DISPLAY '*244*   WS-2-7B-S-FLD1 = (' WS-2-7B-S-FLD1 ')'
          logger.info("*244*   WS-2-7B-S-FLD1 = ({})", new String(methodOut.getBSFld127())); 
//  DISPLAY '*245*   WS-2-7B-S-FLD2 = (' WS-2-7B-S-FLD2 ')'
          logger.info("*245*   WS-2-7B-S-FLD2 = ({})", new String(methodOut.getBSFld227())); 
//  DISPLAY '*246* WS-2-7B-T-GRP    = (' WS-2-7B-T-GRP ')'
          logger.info("*246* WS-2-7B-T-GRP    = ({})", methodOut.getBTGrp27().toString()); 
//  DISPLAY '*247* WS-2-7B-T        = (' WS-2-7B-T ')'
          logger.info("*247* WS-2-7B-T        = ({})", methodOut.getBT27().toString()); 
//  DISPLAY '*248*   WS-2-7B-T-FLD1 = (' WS-2-7B-T-FLD1 ')'
          logger.info("*248*   WS-2-7B-T-FLD1 = ({})", new String(methodOut.getBTFld127())); 
//  DISPLAY '*249*   WS-2-7B-T-FLD2 = (' WS-2-7B-T-FLD2 ')'
          logger.info("*249*   WS-2-7B-T-FLD2 = ({})", new String(methodOut.getBTFld227())); 
//  DISPLAY '*250*   WS-2-7B-T-FLD3 = (' WS-2-7B-T-FLD3 ')'
          logger.info("*250*   WS-2-7B-T-FLD3 = ({})", new String(methodOut.getBTFld327())); 

// *
// * Src -> string; tgt -> group ; src bigger than tgt ; tgtoffset 5
// *
//  INITIALIZE WS-2-8A-S WS-2-8A-T
          methodOut.setAS28(CONSTANTS.SPACE_70 /* Fill 70 Spaces*/);
          methodOut.getAT28().initialize();
          // MOVE ALL 'ABCD' TO WS-2-8A-S
          methodOut.setAS28(CONSTANTS.LITERAL_1222519919);
//  MOVE WS-2-8A-S ( WS-ONE : LENGTH OF WS-2-8A-S ) TO WS-2-8A-T ( WS-ONE : LENGTH OF WS-2-8A-T )
          methodOut.getAT28().replace(methodOut.getAS28(),(methodIn.getOne()-1)/* aS28 */ ,A_S_28_LENGTH, (methodOut.getAT28().begin + (methodIn.getOne()-1)) /* aT28 */,AT28.getAT28FieldLength() /* replace,startIndex,targetLen */);

// *
//  DISPLAY '*251* WS-2-8A-S        = (' WS-2-8A-S ')'
          logger.info("*251* WS-2-8A-S        = ({})", new String(methodOut.getAS28())); 
//  DISPLAY '*252* WS-2-8A-T-GRP    = (' WS-2-8A-T-GRP ')'
          logger.info("*252* WS-2-8A-T-GRP    = ({})", methodOut.getATGrp28().toString()); 
//  DISPLAY '*253* WS-2-8A-T        = (' WS-2-8A-T ')'
          logger.info("*253* WS-2-8A-T        = ({})", methodOut.getAT28().toString()); 
//  DISPLAY '*254*   WS-2-8A-T-FLD1 = (' WS-2-8A-T-FLD1 ')'
          logger.info("*254*   WS-2-8A-T-FLD1 = ({})", new String(methodOut.getATFld128())); 
//  DISPLAY '*255*   WS-2-8A-T-FLD2 = (' WS-2-8A-T-FLD2 ')'
          logger.info("*255*   WS-2-8A-T-FLD2 = ({})", new String(methodOut.getATFld228())); 

// *
//  INITIALIZE WS-2-8A-S WS-2-8A-T
          methodOut.setAS28(CONSTANTS.SPACE_70 /* Fill 70 Spaces*/);
          methodOut.getAT28().initialize();
          // MOVE ALL 'ABCD' TO WS-2-8A-S
          methodOut.setAS28(CONSTANTS.LITERAL_1222519919);
//  MOVE LENGTH OF WS-2-8A-S TO WS-2-S-LEN
          methodOut.setSLen2((short) A_S_28_LENGTH);
//  MOVE LENGTH OF WS-2-8A-T TO WS-2-T-LEN
          methodOut.setTLen2((short) AT28.getAT28FieldLength());
//  MOVE WS-2-8A-S ( WS-ONE : WS-2-S-LEN ) TO WS-2-8A-T ( WS-ONE : WS-2-T-LEN )
          methodOut.getAT28().replace(methodOut.getAS28(),(methodIn.getOne()-1)/* aS28 */ ,methodOut.getSLen2(), (methodOut.getAT28().begin + (methodIn.getOne()-1)) /* aT28 */,methodOut.getTLen2() /* replace,startIndex,targetLen */);

// *
//  DISPLAY '*256* WS-2-8A-S        = (' WS-2-8A-S ')'
          logger.info("*256* WS-2-8A-S        = ({})", new String(methodOut.getAS28())); 
//  DISPLAY '*257* WS-2-8A-T-GRP    = (' WS-2-8A-T-GRP ')'
          logger.info("*257* WS-2-8A-T-GRP    = ({})", methodOut.getATGrp28().toString()); 
//  DISPLAY '*258* WS-2-8A-T        = (' WS-2-8A-T ')'
          logger.info("*258* WS-2-8A-T        = ({})", methodOut.getAT28().toString()); 
//  DISPLAY '*259*   WS-2-8A-T-FLD1 = (' WS-2-8A-T-FLD1 ')'
          logger.info("*259*   WS-2-8A-T-FLD1 = ({})", new String(methodOut.getATFld128())); 
//  DISPLAY '*260*   WS-2-8A-T-FLD2 = (' WS-2-8A-T-FLD2 ')'
          logger.info("*260*   WS-2-8A-T-FLD2 = ({})", new String(methodOut.getATFld228())); 

// *
// * Src -> string; tgt -> group ; src smaller than tgt; tgtoffset 5
// *
//  INITIALIZE WS-2-8B-S WS-2-8B-T
          methodOut.setBS28(CONSTANTS.SPACE_70 /* Fill 70 Spaces*/);
          methodOut.getBT28().initialize();
          // MOVE ALL 'ABCD' TO WS-2-8B-S
          methodOut.setBS28(CONSTANTS.LITERAL_1222519919);
//  MOVE ALL 'MNOP' TO WS-2-8B-T-FLD3
          methodOut.setBTFld328(CONSTANTS.LITERAL_MNOPMNOPMNOPMNOPMNOPMNOPMNOPMNOP);
//  MOVE WS-2-8B-S ( WS-ONE : LENGTH OF WS-2-8B-S ) TO WS-2-8B-T ( WS-ONE : LENGTH OF WS-2-8B-T )
          methodOut.getBT28().replace(methodOut.getBS28(),(methodIn.getOne()-1)/* bS28 */ ,B_S_28_LENGTH, (methodOut.getBT28().begin + (methodIn.getOne()-1)) /* bT28 */,BT28.getBT28FieldLength() /* replace,startIndex,targetLen */);

// *
//  DISPLAY '*261* WS-2-8B-S        = (' WS-2-8B-S ')'
          logger.info("*261* WS-2-8B-S        = ({})", new String(methodOut.getBS28())); 
//  DISPLAY '*262* WS-2-8B-T-GRP    = (' WS-2-8B-T-GRP ')'
          logger.info("*262* WS-2-8B-T-GRP    = ({})", methodOut.getBTGrp28().toString()); 
//  DISPLAY '*263* WS-2-8B-T        = (' WS-2-8B-T ')'
          logger.info("*263* WS-2-8B-T        = ({})", methodOut.getBT28().toString()); 
//  DISPLAY '*264*   WS-2-8B-T-FLD1 = (' WS-2-8B-T-FLD1 ')'
          logger.info("*264*   WS-2-8B-T-FLD1 = ({})", new String(methodOut.getBTFld128())); 
//  DISPLAY '*265*   WS-2-8B-T-FLD2 = (' WS-2-8B-T-FLD2 ')'
          logger.info("*265*   WS-2-8B-T-FLD2 = ({})", new String(methodOut.getBTFld228())); 
//  DISPLAY '*266*   WS-2-8B-T-FLD3 = (' WS-2-8B-T-FLD3 ')'
          logger.info("*266*   WS-2-8B-T-FLD3 = ({})", new String(methodOut.getBTFld328())); 

// *
//  INITIALIZE WS-2-8B-S WS-2-8B-T
          methodOut.setBS28(CONSTANTS.SPACE_70 /* Fill 70 Spaces*/);
          methodOut.getBT28().initialize();
          // MOVE ALL 'ABCD' TO WS-2-8B-S
          methodOut.setBS28(CONSTANTS.LITERAL_1222519919);
//  MOVE ALL 'MNOP' TO WS-2-8B-T-FLD3
          methodOut.setBTFld328(CONSTANTS.LITERAL_MNOPMNOPMNOPMNOPMNOPMNOPMNOPMNOP);
//  MOVE LENGTH OF WS-2-8B-S TO WS-2-S-LEN
          methodOut.setSLen2((short) B_S_28_LENGTH);
//  MOVE LENGTH OF WS-2-8B-T TO WS-2-T-LEN
          methodOut.setTLen2((short) BT28.getBT28FieldLength());
//  MOVE WS-2-8B-S ( WS-ONE : WS-2-S-LEN ) TO WS-2-8B-T ( WS-ONE : WS-2-T-LEN )
          methodOut.getBT28().replace(methodOut.getBS28(),(methodIn.getOne()-1)/* bS28 */ ,methodOut.getSLen2(), (methodOut.getBT28().begin + (methodIn.getOne()-1)) /* bT28 */,methodOut.getTLen2() /* replace,startIndex,targetLen */);

// *
//  DISPLAY '*267* WS-2-8B-S        = (' WS-2-8B-S ')'
          logger.info("*267* WS-2-8B-S        = ({})", new String(methodOut.getBS28())); 
//  DISPLAY '*268* WS-2-8B-T-GRP    = (' WS-2-8B-T-GRP ')'
          logger.info("*268* WS-2-8B-T-GRP    = ({})", methodOut.getBTGrp28().toString()); 
//  DISPLAY '*269* WS-2-8B-T        = (' WS-2-8B-T ')'
          logger.info("*269* WS-2-8B-T        = ({})", methodOut.getBT28().toString()); 
//  DISPLAY '*270*   WS-2-8B-T-FLD1 = (' WS-2-8B-T-FLD1 ')'
          logger.info("*270*   WS-2-8B-T-FLD1 = ({})", new String(methodOut.getBTFld128())); 
      
      return methodOut;
      }
      /**
      * mainlineSplit10 
      *   This method is derived from 
  *   COBOL Paragraph - MAINLINE-SPLIT10 COBOL Cyclomatic complexity - 1
      * Input  :  

      * - bTFld228                       COBOL Name: WS-2-8B-T-FLD2
      * - bTFld328                       COBOL Name: WS-2-8B-T-FLD3
      * - aSGrp29                        COBOL Name: WS-2-9A-S-GRP
      * - aTGrp29                        COBOL Name: WS-2-9A-T-GRP
      * - bSGrp29                        COBOL Name: WS-2-9B-S-GRP
      * - bTGrp29                        COBOL Name: WS-2-9B-T-GRP
      *
      * Output :  

      * - aS29                           COBOL Name: WS-2-9A-S
      * - aT29                           COBOL Name: WS-2-9A-T
      * - aSFld129                       COBOL Name: WS-2-9A-S-FLD1
      * - aSFld229                       COBOL Name: WS-2-9A-S-FLD2
      * - aTFld129                       COBOL Name: WS-2-9A-T-FLD1
      * - aTFld229                       COBOL Name: WS-2-9A-T-FLD2
      * - sLen2                          COBOL Name: WS-2-S-LEN
      * - tLen2                          COBOL Name: WS-2-T-LEN
      * - bS29                           COBOL Name: WS-2-9B-S
      * - bT29                           COBOL Name: WS-2-9B-T
      * - bSFld129                       COBOL Name: WS-2-9B-S-FLD1
      * - bSFld229                       COBOL Name: WS-2-9B-S-FLD2
      * - bTFld329                       COBOL Name: WS-2-9B-T-FLD3
      * - bTFld129                       COBOL Name: WS-2-9B-T-FLD1
      * - bTFld229                       COBOL Name: WS-2-9B-T-FLD2
      *
      * @throws CFException
      */
      @Override
      public MainlineSplit10OutCtx mainlineSplit10(MainlineSplit10InCtx methodIn) throws Exception {
Refmod3Ctx programCtx = methodIn.getRefmod3Ctx();
MainlineSplit10OutCtx methodOut = methodIn.getMainlineSplit10OutCtx();
//  DISPLAY '*271*   WS-2-8B-T-FLD2 = (' WS-2-8B-T-FLD2 ')'
          logger.info("*271*   WS-2-8B-T-FLD2 = ({})", new String(methodIn.getBTFld228())); 
//  DISPLAY '*272*   WS-2-8B-T-FLD3 = (' WS-2-8B-T-FLD3 ')'
          logger.info("*272*   WS-2-8B-T-FLD3 = ({})", new String(methodIn.getBTFld328())); 

// *
// * Src -> group; tgt -> group ; src bigger than tgt
// * source offset 3 ; target offset 5
// *
//  INITIALIZE WS-2-9A-S WS-2-9A-T
          methodOut.getAS29().initialize();
          methodOut.getAT29().initialize();
//  MOVE ALL 'ABCD' TO WS-2-9A-S-FLD1
          methodOut.setASFld129(CONSTANTS.LITERAL_ABCDABCDABCDABCDABCDABCDABCDABCD);
//  MOVE ALL 'ZYXW' TO WS-2-9A-S-FLD2
          methodOut.setASFld229(CONSTANTS.LITERAL_645286444);
//  MOVE WS-2-9A-S ( WS-ONE : LENGTH OF WS-2-9A-S ) TO WS-2-9A-T ( WS-ONE : LENGTH OF WS-2-9A-T )
          methodOut.getATGrp29().replace(methodIn.getASGrp29()/*parent*/,3+methodIn.getOne() - 1/*fromOffset - (aT29) */,AS29.getAS29FieldLength()/*fromLen*/,5+methodIn.getOne() - 1/*toOffset - (aS29) */,AT29.getAT29FieldLength()/*toLen*/);

// *
//  DISPLAY '*273* WS-2-9A-S-GRP    = (' WS-2-9A-S-GRP ')'
          logger.info("*273* WS-2-9A-S-GRP    = ({})", methodIn.getASGrp29().toString()); 
//  DISPLAY '*274* WS-2-9A-S        = (' WS-2-9A-S ')'
          logger.info("*274* WS-2-9A-S        = ({})", methodOut.getAS29().toString()); 
//  DISPLAY '*275*   WS-2-9A-S-FLD1 = (' WS-2-9A-S-FLD1 ')'
          logger.info("*275*   WS-2-9A-S-FLD1 = ({})", new String(methodOut.getASFld129())); 
//  DISPLAY '*276*   WS-2-9A-S-FLD2 = (' WS-2-9A-S-FLD2 ')'
          logger.info("*276*   WS-2-9A-S-FLD2 = ({})", new String(methodOut.getASFld229())); 
//  DISPLAY '*277* WS-2-9A-T-GRP    = (' WS-2-9A-T-GRP ')'
          logger.info("*277* WS-2-9A-T-GRP    = ({})", methodOut.getATGrp29().toString()); 
//  DISPLAY '*278* WS-2-9A-T        = (' WS-2-9A-T ')'
          logger.info("*278* WS-2-9A-T        = ({})", methodOut.getAT29().toString()); 
//  DISPLAY '*279*   WS-2-9A-T-FLD1 = (' WS-2-9A-T-FLD1 ')'
          logger.info("*279*   WS-2-9A-T-FLD1 = ({})", new String(methodOut.getATFld129())); 
//  DISPLAY '*280*   WS-2-9A-T-FLD2 = (' WS-2-9A-T-FLD2 ')'
          logger.info("*280*   WS-2-9A-T-FLD2 = ({})", new String(methodOut.getATFld229())); 

// *
//  INITIALIZE WS-2-9A-S WS-2-9A-T
          methodOut.getAS29().initialize();
          methodOut.getAT29().initialize();
//  MOVE ALL 'ABCD' TO WS-2-9A-S-FLD1
          methodOut.setASFld129(CONSTANTS.LITERAL_ABCDABCDABCDABCDABCDABCDABCDABCD);
//  MOVE ALL 'ZYXW' TO WS-2-9A-S-FLD2
          methodOut.setASFld229(CONSTANTS.LITERAL_645286444);
//  MOVE LENGTH OF WS-2-9A-S TO WS-2-S-LEN
          methodOut.setSLen2((short) AS29.getAS29FieldLength());
//  MOVE LENGTH OF WS-2-9A-T TO WS-2-T-LEN
          methodOut.setTLen2((short) AT29.getAT29FieldLength());
//  MOVE WS-2-9A-S ( WS-ONE : WS-2-S-LEN ) TO WS-2-9A-T ( WS-ONE : WS-2-T-LEN )
          methodOut.getATGrp29().replace(methodIn.getASGrp29()/*parent*/,3+methodIn.getOne() - 1/*fromOffset - (aT29) */,methodOut.getSLen2()/*fromLen*/,5+methodIn.getOne() - 1/*toOffset - (aS29) */,methodOut.getTLen2()/*toLen*/);

// *
//  DISPLAY '*281* WS-2-9A-S-GRP    = (' WS-2-9A-S-GRP ')'
          logger.info("*281* WS-2-9A-S-GRP    = ({})", methodIn.getASGrp29().toString()); 
//  DISPLAY '*282* WS-2-9A-S        = (' WS-2-9A-S ')'
          logger.info("*282* WS-2-9A-S        = ({})", methodOut.getAS29().toString()); 
//  DISPLAY '*283*   WS-2-9A-S-FLD1 = (' WS-2-9A-S-FLD1 ')'
          logger.info("*283*   WS-2-9A-S-FLD1 = ({})", new String(methodOut.getASFld129())); 
//  DISPLAY '*284*   WS-2-9A-S-FLD2 = (' WS-2-9A-S-FLD2 ')'
          logger.info("*284*   WS-2-9A-S-FLD2 = ({})", new String(methodOut.getASFld229())); 
//  DISPLAY '*285* WS-2-9A-T-GRP    = (' WS-2-9A-T-GRP ')'
          logger.info("*285* WS-2-9A-T-GRP    = ({})", methodOut.getATGrp29().toString()); 
//  DISPLAY '*286* WS-2-9A-T        = (' WS-2-9A-T ')'
          logger.info("*286* WS-2-9A-T        = ({})", methodOut.getAT29().toString()); 
//  DISPLAY '*287*   WS-2-9A-T-FLD1 = (' WS-2-9A-T-FLD1 ')'
          logger.info("*287*   WS-2-9A-T-FLD1 = ({})", new String(methodOut.getATFld129())); 
//  DISPLAY '*288*   WS-2-9A-T-FLD2 = (' WS-2-9A-T-FLD2 ')'
          logger.info("*288*   WS-2-9A-T-FLD2 = ({})", new String(methodOut.getATFld229())); 

// *
// * Src -> group; tgt -> group ; src smaller than tgt
// * source offset 3 ; target offset 5
// *
//  INITIALIZE WS-2-9B-S WS-2-9B-T
          methodOut.getBS29().initialize();
          methodOut.getBT29().initialize();
//  MOVE ALL 'ABCD' TO WS-2-9B-S-FLD1
          methodOut.setBSFld129(CONSTANTS.LITERAL_ABCDABCDABCDABCDABCDABCDABCDABCD);
//  MOVE ALL 'ZYXW' TO WS-2-9B-S-FLD2
          methodOut.setBSFld229(CONSTANTS.LITERAL_645286444);
//  MOVE ALL 'MNOP' TO WS-2-9B-T-FLD3
          methodOut.setBTFld329(CONSTANTS.LITERAL_MNOPMNOPMNOPMNOPMNOPMNOPMNOPMNOP);
//  MOVE WS-2-9B-S ( WS-ONE : LENGTH OF WS-2-9B-S ) TO WS-2-9B-T ( WS-ONE : LENGTH OF WS-2-9B-T )
          methodOut.getBTGrp29().replace(methodIn.getBSGrp29()/*parent*/,3+methodIn.getOne() - 1/*fromOffset - (bT29) */,BS29.getBS29FieldLength()/*fromLen*/,5+methodIn.getOne() - 1/*toOffset - (bS29) */,BT29.getBT29FieldLength()/*toLen*/);

// *
//  DISPLAY '*289* WS-2-9B-S-GRP    = (' WS-2-9B-S-GRP ')'
          logger.info("*289* WS-2-9B-S-GRP    = ({})", methodIn.getBSGrp29().toString()); 
//  DISPLAY '*290* WS-2-9B-S        = (' WS-2-9B-S ')'
          logger.info("*290* WS-2-9B-S        = ({})", methodOut.getBS29().toString()); 
//  DISPLAY '*291*   WS-2-9B-S-FLD1 = (' WS-2-9B-S-FLD1 ')'
          logger.info("*291*   WS-2-9B-S-FLD1 = ({})", new String(methodOut.getBSFld129())); 
//  DISPLAY '*292*   WS-2-9B-S-FLD2 = (' WS-2-9B-S-FLD2 ')'
          logger.info("*292*   WS-2-9B-S-FLD2 = ({})", new String(methodOut.getBSFld229())); 
//  DISPLAY '*293* WS-2-9B-T-GRP    = (' WS-2-9B-T-GRP ')'
          logger.info("*293* WS-2-9B-T-GRP    = ({})", methodOut.getBTGrp29().toString()); 
//  DISPLAY '*294* WS-2-9B-T        = (' WS-2-9B-T ')'
          logger.info("*294* WS-2-9B-T        = ({})", methodOut.getBT29().toString()); 
//  DISPLAY '*295*   WS-2-9B-T-FLD1 = (' WS-2-9B-T-FLD1 ')'
          logger.info("*295*   WS-2-9B-T-FLD1 = ({})", new String(methodOut.getBTFld129())); 
//  DISPLAY '*296*   WS-2-9B-T-FLD2 = (' WS-2-9B-T-FLD2 ')'
          logger.info("*296*   WS-2-9B-T-FLD2 = ({})", new String(methodOut.getBTFld229())); 
//  DISPLAY '*297*   WS-2-9B-T-FLD3 = (' WS-2-9B-T-FLD3 ')'
          logger.info("*297*   WS-2-9B-T-FLD3 = ({})", new String(methodOut.getBTFld329())); 

// *
//  INITIALIZE WS-2-9B-S WS-2-9B-T
          methodOut.getBS29().initialize();
          methodOut.getBT29().initialize();
//  MOVE ALL 'ABCD' TO WS-2-9B-S-FLD1
          methodOut.setBSFld129(CONSTANTS.LITERAL_ABCDABCDABCDABCDABCDABCDABCDABCD);
//  MOVE ALL 'ZYXW' TO WS-2-9B-S-FLD2
          methodOut.setBSFld229(CONSTANTS.LITERAL_645286444);
//  MOVE ALL 'MNOP' TO WS-2-9B-T-FLD3
          methodOut.setBTFld329(CONSTANTS.LITERAL_MNOPMNOPMNOPMNOPMNOPMNOPMNOPMNOP);
//  MOVE LENGTH OF WS-2-9B-S TO WS-2-S-LEN
          methodOut.setSLen2((short) BS29.getBS29FieldLength());
//  MOVE LENGTH OF WS-2-9B-T TO WS-2-T-LEN
          methodOut.setTLen2((short) BT29.getBT29FieldLength());
//  MOVE WS-2-9B-S ( WS-ONE : WS-2-S-LEN ) TO WS-2-9B-T ( WS-ONE : WS-2-T-LEN )
          methodOut.getBTGrp29().replace(methodIn.getBSGrp29()/*parent*/,3+methodIn.getOne() - 1/*fromOffset - (bT29) */,methodOut.getSLen2()/*fromLen*/,5+methodIn.getOne() - 1/*toOffset - (bS29) */,methodOut.getTLen2()/*toLen*/);

// *
//  DISPLAY '*298* WS-2-9B-S-GRP    = (' WS-2-9B-S-GRP ')'
          logger.info("*298* WS-2-9B-S-GRP    = ({})", methodIn.getBSGrp29().toString()); 
//  DISPLAY '*299* WS-2-9B-S        = (' WS-2-9B-S ')'
          logger.info("*299* WS-2-9B-S        = ({})", methodOut.getBS29().toString()); 
      
      return methodOut;
      }
      /**
      * mainlineSplit11 
      *   This method is derived from 
  *   COBOL Paragraph - MAINLINE-SPLIT11 COBOL Cyclomatic complexity - 1
      * Input  :  

      * - bSFld129                       COBOL Name: WS-2-9B-S-FLD1
      * - bSFld229                       COBOL Name: WS-2-9B-S-FLD2
      * - bTGrp29                        COBOL Name: WS-2-9B-T-GRP
      * - bT29                           COBOL Name: WS-2-9B-T
      * - bTFld129                       COBOL Name: WS-2-9B-T-FLD1
      * - bTFld229                       COBOL Name: WS-2-9B-T-FLD2
      * - bTFld329                       COBOL Name: WS-2-9B-T-FLD3
      * - aSGrp210                       COBOL Name: WS-2-10A-S-GRP
      * - aTGrp210                       COBOL Name: WS-2-10A-T-GRP
      * - bSGrp210                       COBOL Name: WS-2-10B-S-GRP
      * - bTGrp210                       COBOL Name: WS-2-10B-T-GRP
      *
      * Output :  

      * - aS210                          COBOL Name: WS-2-10A-S
      * - aT210                          COBOL Name: WS-2-10A-T
      * - aTFld1210                      COBOL Name: WS-2-10A-T-FLD1
      * - aTFld2210                      COBOL Name: WS-2-10A-T-FLD2
      * - sLen2                          COBOL Name: WS-2-S-LEN
      * - tLen2                          COBOL Name: WS-2-T-LEN
      * - bS210                          COBOL Name: WS-2-10B-S
      * - bT210                          COBOL Name: WS-2-10B-T
      * - bTFld3210                      COBOL Name: WS-2-10B-T-FLD3
      * - bTFld1210                      COBOL Name: WS-2-10B-T-FLD1
      * - bTFld2210                      COBOL Name: WS-2-10B-T-FLD2
      *
      * @throws CFException
      */
      @Override
      public MainlineSplit11OutCtx mainlineSplit11(MainlineSplit11InCtx methodIn) throws Exception {
			// Declare local variables used in the method
			 final int A_S_210_LENGTH = 70;
			 final int B_S_210_LENGTH = 70;
			// End of variable declaration

Refmod3Ctx programCtx = methodIn.getRefmod3Ctx();
MainlineSplit11OutCtx methodOut = methodIn.getMainlineSplit11OutCtx();
//  DISPLAY '*300*   WS-2-9B-S-FLD1 = (' WS-2-9B-S-FLD1 ')'
          logger.info("*300*   WS-2-9B-S-FLD1 = ({})", new String(methodIn.getBSFld129())); 
//  DISPLAY '*301*   WS-2-9B-S-FLD2 = (' WS-2-9B-S-FLD2 ')'
          logger.info("*301*   WS-2-9B-S-FLD2 = ({})", new String(methodIn.getBSFld229())); 
//  DISPLAY '*302* WS-2-9B-T-GRP    = (' WS-2-9B-T-GRP ')'
          logger.info("*302* WS-2-9B-T-GRP    = ({})", methodIn.getBTGrp29().toString()); 
//  DISPLAY '*303* WS-2-9B-T        = (' WS-2-9B-T ')'
          logger.info("*303* WS-2-9B-T        = ({})", methodIn.getBT29().toString()); 
//  DISPLAY '*304*   WS-2-9B-T-FLD1 = (' WS-2-9B-T-FLD1 ')'
          logger.info("*304*   WS-2-9B-T-FLD1 = ({})", new String(methodIn.getBTFld129())); 
//  DISPLAY '*305*   WS-2-9B-T-FLD2 = (' WS-2-9B-T-FLD2 ')'
          logger.info("*305*   WS-2-9B-T-FLD2 = ({})", new String(methodIn.getBTFld229())); 
//  DISPLAY '*306*   WS-2-9B-T-FLD3 = (' WS-2-9B-T-FLD3 ')'
          logger.info("*306*   WS-2-9B-T-FLD3 = ({})", new String(methodIn.getBTFld329())); 

// *
// * Src -> string; tgt -> group ; src bigger than tgt
// * source offset 3 ; target offset 5
// *
//  INITIALIZE WS-2-10A-S WS-2-10A-T
          methodOut.setAS210(CONSTANTS.SPACE_70 /* Fill 70 Spaces*/);
          methodOut.getAT210().initialize();
//  MOVE ALL 'ABCD' TO WS-2-10A-S
          methodOut.setAS210(CONSTANTS.LITERAL_1222519919);
//  MOVE WS-2-10A-S ( WS-ONE : LENGTH OF WS-2-10A-S ) TO WS-2-10A-T ( WS-ONE : LENGTH OF WS-2-10A-T )
          methodOut.getATGrp210().replace(methodIn.getASGrp210()/*parent*/,3+methodIn.getOne() - 1/*fromOffset - (aT210) */,A_S_210_LENGTH/*fromLen*/,5+methodIn.getOne() - 1/*toOffset - (aS210) */,AT210.getAT210FieldLength()/*toLen*/);

// *
//  DISPLAY '*307* WS-2-10A-S-GRP   = (' WS-2-10A-S-GRP ')'
          logger.info("*307* WS-2-10A-S-GRP   = ({})", methodIn.getASGrp210().toString()); 
//  DISPLAY '*308* WS-2-10A-S       = (' WS-2-10A-S ')'
          logger.info("*308* WS-2-10A-S       = ({})", new String(methodOut.getAS210())); 
//  DISPLAY '*309* WS-2-10A-T-GRP   = (' WS-2-10A-T-GRP ')'
          logger.info("*309* WS-2-10A-T-GRP   = ({})", methodOut.getATGrp210().toString()); 
//  DISPLAY '*310* WS-2-10A-T       = (' WS-2-10A-T ')'
          logger.info("*310* WS-2-10A-T       = ({})", methodOut.getAT210().toString()); 
//  DISPLAY '*311*   WS-2-10A-T-FLD1= (' WS-2-10A-T-FLD1 ')'
          logger.info("*311*   WS-2-10A-T-FLD1= ({})", new String(methodOut.getATFld1210())); 
//  DISPLAY '*312*   WS-2-10A-T-FLD2= (' WS-2-10A-T-FLD2 ')'
          logger.info("*312*   WS-2-10A-T-FLD2= ({})", new String(methodOut.getATFld2210())); 

// *
//  INITIALIZE WS-2-10A-S WS-2-10A-T
          methodOut.setAS210(CONSTANTS.SPACE_70 /* Fill 70 Spaces*/);
          methodOut.getAT210().initialize();
//  MOVE ALL 'ABCD' TO WS-2-10A-S
          methodOut.setAS210(CONSTANTS.LITERAL_1222519919);
//  MOVE LENGTH OF WS-2-10A-S TO WS-2-S-LEN
          methodOut.setSLen2((short) A_S_210_LENGTH);
//  MOVE LENGTH OF WS-2-10A-T TO WS-2-T-LEN
          methodOut.setTLen2((short) AT210.getAT210FieldLength());
//  MOVE WS-2-10A-S ( WS-ONE : WS-2-S-LEN ) TO WS-2-10A-T ( WS-ONE : WS-2-T-LEN )
          methodOut.getATGrp210().replace(methodIn.getASGrp210()/*parent*/,3+methodIn.getOne() - 1/*fromOffset - (aT210) */,methodOut.getSLen2()/*fromLen*/,5+methodIn.getOne() - 1/*toOffset - (aS210) */,methodOut.getTLen2()/*toLen*/);

// *
//  DISPLAY '*313* WS-2-10A-S-GRP   = (' WS-2-10A-S-GRP ')'
          logger.info("*313* WS-2-10A-S-GRP   = ({})", methodIn.getASGrp210().toString()); 
//  DISPLAY '*314* WS-2-10A-S       = (' WS-2-10A-S ')'
          logger.info("*314* WS-2-10A-S       = ({})", new String(methodOut.getAS210())); 
//  DISPLAY '*315* WS-2-10A-T-GRP   = (' WS-2-10A-T-GRP ')'
          logger.info("*315* WS-2-10A-T-GRP   = ({})", methodOut.getATGrp210().toString()); 
//  DISPLAY '*316* WS-2-10A-T       = (' WS-2-10A-T ')'
          logger.info("*316* WS-2-10A-T       = ({})", methodOut.getAT210().toString()); 
//  DISPLAY '*317*   WS-2-10A-T-FLD1= (' WS-2-10A-T-FLD1 ')'
          logger.info("*317*   WS-2-10A-T-FLD1= ({})", new String(methodOut.getATFld1210())); 
//  DISPLAY '*318*   WS-2-10A-T-FLD2= (' WS-2-10A-T-FLD2 ')'
          logger.info("*318*   WS-2-10A-T-FLD2= ({})", new String(methodOut.getATFld2210())); 

// *
// * Src -> string; tgt -> group ; src smaller than tgt
// * source offset 3 ; target offset 5
// *
//  INITIALIZE WS-2-10B-S WS-2-10B-T
          methodOut.setBS210(CONSTANTS.SPACE_70 /* Fill 70 Spaces*/);
          methodOut.getBT210().initialize();
//  MOVE ALL 'ABCD' TO WS-2-10B-S
          methodOut.setBS210(CONSTANTS.LITERAL_1222519919);
//  MOVE ALL 'MNOP' TO WS-2-10B-T-FLD3
          methodOut.setBTFld3210(CONSTANTS.LITERAL_MNOPMNOPMNOPMNOPMNOPMNOPMNOPMNOP);
//  MOVE WS-2-10B-S ( WS-ONE : LENGTH OF WS-2-10B-S ) TO WS-2-10B-T ( WS-ONE : LENGTH OF WS-2-10B-T )
          methodOut.getBTGrp210().replace(methodIn.getBSGrp210()/*parent*/,3+methodIn.getOne() - 1/*fromOffset - (bT210) */,B_S_210_LENGTH/*fromLen*/,5+methodIn.getOne() - 1/*toOffset - (bS210) */,BT210.getBT210FieldLength()/*toLen*/);

// *
//  DISPLAY '*319* WS-2-10B-S-GRP   = (' WS-2-10B-S-GRP ')'
          logger.info("*319* WS-2-10B-S-GRP   = ({})", methodIn.getBSGrp210().toString()); 
//  DISPLAY '*320* WS-2-10B-S       = (' WS-2-10B-S ')'
          logger.info("*320* WS-2-10B-S       = ({})", new String(methodOut.getBS210())); 
//  DISPLAY '*321* WS-2-10B-T-GRP   = (' WS-2-10B-T-GRP ')'
          logger.info("*321* WS-2-10B-T-GRP   = ({})", methodOut.getBTGrp210().toString()); 
//  DISPLAY '*322* WS-2-10B-T       = (' WS-2-10B-T ')'
          logger.info("*322* WS-2-10B-T       = ({})", methodOut.getBT210().toString()); 
//  DISPLAY '*323*   WS-2-10B-T-FLD1= (' WS-2-10B-T-FLD1 ')'
          logger.info("*323*   WS-2-10B-T-FLD1= ({})", new String(methodOut.getBTFld1210())); 
//  DISPLAY '*324*   WS-2-10B-T-FLD2= (' WS-2-10B-T-FLD2 ')'
          logger.info("*324*   WS-2-10B-T-FLD2= ({})", new String(methodOut.getBTFld2210())); 
//  DISPLAY '*325*   WS-2-10B-T-FLD3= (' WS-2-10B-T-FLD3 ')'
          logger.info("*325*   WS-2-10B-T-FLD3= ({})", new String(methodOut.getBTFld3210())); 

// *
//  INITIALIZE WS-2-10B-S WS-2-10B-T
          methodOut.setBS210(CONSTANTS.SPACE_70 /* Fill 70 Spaces*/);
          methodOut.getBT210().initialize();
//  MOVE ALL 'ABCD' TO WS-2-10B-S
          methodOut.setBS210(CONSTANTS.LITERAL_1222519919);
//  MOVE ALL 'MNOP' TO WS-2-10B-T-FLD3
          methodOut.setBTFld3210(CONSTANTS.LITERAL_MNOPMNOPMNOPMNOPMNOPMNOPMNOPMNOP);
//  MOVE LENGTH OF WS-2-10B-S TO WS-2-S-LEN
          methodOut.setSLen2((short) B_S_210_LENGTH);
//  MOVE LENGTH OF WS-2-10B-T TO WS-2-T-LEN
          methodOut.setTLen2((short) BT210.getBT210FieldLength());
//  MOVE WS-2-10B-S ( WS-ONE : WS-2-S-LEN ) TO WS-2-10B-T ( WS-ONE : WS-2-T-LEN )
          methodOut.getBTGrp210().replace(methodIn.getBSGrp210()/*parent*/,3+methodIn.getOne() - 1/*fromOffset - (bT210) */,methodOut.getSLen2()/*fromLen*/,5+methodIn.getOne() - 1/*toOffset - (bS210) */,methodOut.getTLen2()/*toLen*/);

// *
//  DISPLAY '*326* WS-2-10B-S-GRP   = (' WS-2-10B-S-GRP ')'
          logger.info("*326* WS-2-10B-S-GRP   = ({})", methodIn.getBSGrp210().toString()); 
//  DISPLAY '*327* WS-2-10B-S       = (' WS-2-10B-S ')'
          logger.info("*327* WS-2-10B-S       = ({})", new String(methodOut.getBS210())); 
//  DISPLAY '*328* WS-2-10B-T-GRP   = (' WS-2-10B-T-GRP ')'
          logger.info("*328* WS-2-10B-T-GRP   = ({})", methodOut.getBTGrp210().toString()); 
//  DISPLAY '*329* WS-2-10B-T       = (' WS-2-10B-T ')'
          logger.info("*329* WS-2-10B-T       = ({})", methodOut.getBT210().toString()); 
//  DISPLAY '*330*   WS-2-10B-T-FLD1= (' WS-2-10B-T-FLD1 ')'
          logger.info("*330*   WS-2-10B-T-FLD1= ({})", new String(methodOut.getBTFld1210())); 
//  DISPLAY '*331*   WS-2-10B-T-FLD2= (' WS-2-10B-T-FLD2 ')'
          logger.info("*331*   WS-2-10B-T-FLD2= ({})", new String(methodOut.getBTFld2210())); 
//  DISPLAY '*332*   WS-2-10B-T-FLD3= (' WS-2-10B-T-FLD3 ')'
          logger.info("*332*   WS-2-10B-T-FLD3= ({})", new String(methodOut.getBTFld3210())); 
      
      return methodOut;
      }
      /**
      * mainlineSplit12 
      *   This method is derived from 
  *   COBOL Paragraph - MAINLINE-SPLIT12 COBOL Cyclomatic complexity - 1
      * Input  :  

      * - aTGrp211                       COBOL Name: WS-2-11A-T-GRP
      * - bTGrp211                       COBOL Name: WS-2-11B-T-GRP
      *
      * Output :  

      * - aS211                          COBOL Name: WS-2-11A-S
      * - aT211                          COBOL Name: WS-2-11A-T
      * - aSFld1211                      COBOL Name: WS-2-11A-S-FLD1
      * - aSFld2211                      COBOL Name: WS-2-11A-S-FLD2
      * - aTFld1211                      COBOL Name: WS-2-11A-T-FLD1
      * - aTFld2211                      COBOL Name: WS-2-11A-T-FLD2
      * - tLen2                          COBOL Name: WS-2-T-LEN
      * - bS211                          COBOL Name: WS-2-11B-S
      * - bT211                          COBOL Name: WS-2-11B-T
      * - bSFld1211                      COBOL Name: WS-2-11B-S-FLD1
      * - bSFld2211                      COBOL Name: WS-2-11B-S-FLD2
      * - bTFld3211                      COBOL Name: WS-2-11B-T-FLD3
      * - bTFld1211                      COBOL Name: WS-2-11B-T-FLD1
      * - bTFld2211                      COBOL Name: WS-2-11B-T-FLD2
      * - aS212                          COBOL Name: WS-2-12A-S
      * - aT212                          COBOL Name: WS-2-12A-T
      *
      * @throws CFException
      */
      @Override
      public MainlineSplit12OutCtx mainlineSplit12(MainlineSplit12InCtx methodIn) throws Exception {
Refmod3Ctx programCtx = methodIn.getRefmod3Ctx();
MainlineSplit12OutCtx methodOut = methodIn.getMainlineSplit12OutCtx();

// * Src -> group; tgt -> group ; src bigger than tgt
// *    src not refmod;target offset 5
// *
//  INITIALIZE WS-2-11A-S WS-2-11A-T
          methodOut.getAS211().initialize();
          methodOut.getAT211().initialize();
//  MOVE ALL 'ABCD' TO WS-2-11A-S-FLD1
          methodOut.setASFld1211(CONSTANTS.LITERAL_ABCDABCDABCDABCDABCDABCDABCDABCD);
//  MOVE ALL 'ZYXW' TO WS-2-11A-S-FLD2
          methodOut.setASFld2211(CONSTANTS.LITERAL_645286444);
//  MOVE WS-2-11A-S TO WS-2-11A-T ( WS-ONE : LENGTH OF WS-2-11A-T )
          methodOut.getAT211().replace(methodOut.getAS211().getCharArray(),0,methodOut.getAS211().length(), (methodOut.getAT211().begin + (methodIn.getOne()-1)) ,AT211.getAT211FieldLength() /* replace,sourceIndex,sourceLen,targetIndex,targetLen */);

// *
//  DISPLAY '*333* WS-2-11A-S       = (' WS-2-11A-S ')'
          logger.info("*333* WS-2-11A-S       = ({})", methodOut.getAS211().toString()); 
//  DISPLAY '*334*   WS-2-11A-S-FLD1= (' WS-2-11A-S-FLD1 ')'
          logger.info("*334*   WS-2-11A-S-FLD1= ({})", new String(methodOut.getASFld1211())); 
//  DISPLAY '*335*   WS-2-11A-S-FLD2= (' WS-2-11A-S-FLD2 ')'
          logger.info("*335*   WS-2-11A-S-FLD2= ({})", new String(methodOut.getASFld2211())); 
//  DISPLAY '*336* WS-2-11A-T-GRP   = (' WS-2-11A-T-GRP ')'
          logger.info("*336* WS-2-11A-T-GRP   = ({})", methodOut.getATGrp211().toString()); 
//  DISPLAY '*337* WS-2-11A-T       = (' WS-2-11A-T ')'
          logger.info("*337* WS-2-11A-T       = ({})", methodOut.getAT211().toString()); 
//  DISPLAY '*338*   WS-2-11A-T-FLD1= (' WS-2-11A-T-FLD1 ')'
          logger.info("*338*   WS-2-11A-T-FLD1= ({})", new String(methodOut.getATFld1211())); 
//  DISPLAY '*339*   WS-2-11A-T-FLD2= (' WS-2-11A-T-FLD2 ')'
          logger.info("*339*   WS-2-11A-T-FLD2= ({})", new String(methodOut.getATFld2211())); 

// *
//  INITIALIZE WS-2-11A-S WS-2-11A-T
          methodOut.getAS211().initialize();
          methodOut.getAT211().initialize();
//  MOVE ALL 'ABCD' TO WS-2-11A-S-FLD1
          methodOut.setASFld1211(CONSTANTS.LITERAL_ABCDABCDABCDABCDABCDABCDABCDABCD);
//  MOVE ALL 'ZYXW' TO WS-2-11A-S-FLD2
          methodOut.setASFld2211(CONSTANTS.LITERAL_645286444);
//  MOVE LENGTH OF WS-2-11A-T TO WS-2-T-LEN
          methodOut.setTLen2((short) AT211.getAT211FieldLength());
//  MOVE WS-2-11A-S TO WS-2-11A-T ( WS-ONE : WS-2-T-LEN )
          methodOut.getAT211().replace(methodOut.getAS211().getCharArray(),0,methodOut.getAS211().length(), (methodOut.getAT211().begin + (methodIn.getOne()-1)) ,methodOut.getTLen2() /* replace,sourceIndex,sourceLen,targetIndex,targetLen */);

// *
//  DISPLAY '*340* WS-2-11A-S       = (' WS-2-11A-S ')'
          logger.info("*340* WS-2-11A-S       = ({})", methodOut.getAS211().toString()); 
//  DISPLAY '*341*   WS-2-11A-S-FLD1= (' WS-2-11A-S-FLD1 ')'
          logger.info("*341*   WS-2-11A-S-FLD1= ({})", new String(methodOut.getASFld1211())); 
//  DISPLAY '*342*   WS-2-11A-S-FLD2= (' WS-2-11A-S-FLD2 ')'
          logger.info("*342*   WS-2-11A-S-FLD2= ({})", new String(methodOut.getASFld2211())); 
//  DISPLAY '*343* WS-2-11A-T-GRP   = (' WS-2-11A-T-GRP ')'
          logger.info("*343* WS-2-11A-T-GRP   = ({})", methodOut.getATGrp211().toString()); 
//  DISPLAY '*344* WS-2-11A-T       = (' WS-2-11A-T ')'
          logger.info("*344* WS-2-11A-T       = ({})", methodOut.getAT211().toString()); 
//  DISPLAY '*345*   WS-2-11A-T-FLD1= (' WS-2-11A-T-FLD1 ')'
          logger.info("*345*   WS-2-11A-T-FLD1= ({})", new String(methodOut.getATFld1211())); 
//  DISPLAY '*346*   WS-2-11A-T-FLD2= (' WS-2-11A-T-FLD2 ')'
          logger.info("*346*   WS-2-11A-T-FLD2= ({})", new String(methodOut.getATFld2211())); 

// *
// * Src -> group; tgt -> group ; src smaller than tgt
// *    src not refmod;target offset 5
// *
//  INITIALIZE WS-2-11B-S WS-2-11B-T
          methodOut.getBS211().initialize();
          methodOut.getBT211().initialize();
//  MOVE ALL 'ABCD' TO WS-2-11B-S-FLD1
          methodOut.setBSFld1211(CONSTANTS.LITERAL_ABCDABCDABCDABCDABCDABCDABCDABCD);
//  MOVE ALL 'ZYXW' TO WS-2-11B-S-FLD2
          methodOut.setBSFld2211(CONSTANTS.LITERAL_645286444);
//  MOVE ALL 'MNOP' TO WS-2-11B-T-FLD3
          methodOut.setBTFld3211(CONSTANTS.LITERAL_MNOPMNOPMNOPMNOPMNOPMNOPMNOPMNOP);
//  MOVE WS-2-11B-S TO WS-2-11B-T ( WS-ONE : LENGTH OF WS-2-11B-T )
          methodOut.getBT211().replace(methodOut.getBS211().getCharArray(),0,methodOut.getBS211().length(), (methodOut.getBT211().begin + (methodIn.getOne()-1)) ,BT211.getBT211FieldLength() /* replace,sourceIndex,sourceLen,targetIndex,targetLen */);

// *
//  DISPLAY '*347* WS-2-11B-S       = (' WS-2-11B-S ')'
          logger.info("*347* WS-2-11B-S       = ({})", methodOut.getBS211().toString()); 
//  DISPLAY '*348*   WS-2-11B-S-FLD1= (' WS-2-11B-S-FLD1 ')'
          logger.info("*348*   WS-2-11B-S-FLD1= ({})", new String(methodOut.getBSFld1211())); 
//  DISPLAY '*349*   WS-2-11B-S-FLD2= (' WS-2-11B-S-FLD2 ')'
          logger.info("*349*   WS-2-11B-S-FLD2= ({})", new String(methodOut.getBSFld2211())); 
//  DISPLAY '*350* WS-2-11B-T-GRP   = (' WS-2-11B-T-GRP ')'
          logger.info("*350* WS-2-11B-T-GRP   = ({})", methodOut.getBTGrp211().toString()); 
//  DISPLAY '*351* WS-2-11B-T       = (' WS-2-11B-T ')'
          logger.info("*351* WS-2-11B-T       = ({})", methodOut.getBT211().toString()); 
//  DISPLAY '*352*   WS-2-11B-T-FLD1= (' WS-2-11B-T-FLD1 ')'
          logger.info("*352*   WS-2-11B-T-FLD1= ({})", new String(methodOut.getBTFld1211())); 
//  DISPLAY '*353*   WS-2-11B-T-FLD2= (' WS-2-11B-T-FLD2 ')'
          logger.info("*353*   WS-2-11B-T-FLD2= ({})", new String(methodOut.getBTFld2211())); 
//  DISPLAY '*354*   WS-2-11B-T-FLD3= (' WS-2-11B-T-FLD3 ')'
          logger.info("*354*   WS-2-11B-T-FLD3= ({})", new String(methodOut.getBTFld3211())); 

// *
//  INITIALIZE WS-2-11B-S WS-2-11B-T
          methodOut.getBS211().initialize();
          methodOut.getBT211().initialize();
//  MOVE ALL 'ABCD' TO WS-2-11B-S-FLD1
          methodOut.setBSFld1211(CONSTANTS.LITERAL_ABCDABCDABCDABCDABCDABCDABCDABCD);
//  MOVE ALL 'ZYXW' TO WS-2-11B-S-FLD2
          methodOut.setBSFld2211(CONSTANTS.LITERAL_645286444);
//  MOVE ALL 'MNOP' TO WS-2-11B-T-FLD3
          methodOut.setBTFld3211(CONSTANTS.LITERAL_MNOPMNOPMNOPMNOPMNOPMNOPMNOPMNOP);
//  MOVE LENGTH OF WS-2-11B-T TO WS-2-T-LEN
          methodOut.setTLen2((short) BT211.getBT211FieldLength());
//  MOVE WS-2-11B-S TO WS-2-11B-T ( WS-ONE : WS-2-T-LEN )
          methodOut.getBT211().replace(methodOut.getBS211().getCharArray(),0,methodOut.getBS211().length(), (methodOut.getBT211().begin + (methodIn.getOne()-1)) ,methodOut.getTLen2() /* replace,sourceIndex,sourceLen,targetIndex,targetLen */);

// *
//  DISPLAY '*355* WS-2-11B-S       = (' WS-2-11B-S ')'
          logger.info("*355* WS-2-11B-S       = ({})", methodOut.getBS211().toString()); 
//  DISPLAY '*356*   WS-2-11B-S-FLD1= (' WS-2-11B-S-FLD1 ')'
          logger.info("*356*   WS-2-11B-S-FLD1= ({})", new String(methodOut.getBSFld1211())); 
//  DISPLAY '*357*   WS-2-11B-S-FLD2= (' WS-2-11B-S-FLD2 ')'
          logger.info("*357*   WS-2-11B-S-FLD2= ({})", new String(methodOut.getBSFld2211())); 
//  DISPLAY '*358* WS-2-11B-T-GRP   = (' WS-2-11B-T-GRP ')'
          logger.info("*358* WS-2-11B-T-GRP   = ({})", methodOut.getBTGrp211().toString()); 
//  DISPLAY '*359* WS-2-11B-T       = (' WS-2-11B-T ')'
          logger.info("*359* WS-2-11B-T       = ({})", methodOut.getBT211().toString()); 
//  DISPLAY '*360*   WS-2-11B-T-FLD1= (' WS-2-11B-T-FLD1 ')'
          logger.info("*360*   WS-2-11B-T-FLD1= ({})", new String(methodOut.getBTFld1211())); 
//  DISPLAY '*361*   WS-2-11B-T-FLD2= (' WS-2-11B-T-FLD2 ')'
          logger.info("*361*   WS-2-11B-T-FLD2= ({})", new String(methodOut.getBTFld2211())); 
//  DISPLAY '*362*   WS-2-11B-T-FLD3= (' WS-2-11B-T-FLD3 ')'
          logger.info("*362*   WS-2-11B-T-FLD3= ({})", new String(methodOut.getBTFld3211())); 

// *
// * Src -> string; tgt -> group ; src bigger than tgt
// *    src not refmod;target offset 5
// *
//  INITIALIZE WS-2-12A-S WS-2-12A-T
          methodOut.setAS212(CONSTANTS.SPACE_70 /* Fill 70 Spaces*/);
          methodOut.getAT212().initialize();
      
      return methodOut;
      }
      /**
      * mainlineSplit13 
      *   This method is derived from 
  *   COBOL Paragraph - MAINLINE-SPLIT13 COBOL Cyclomatic complexity - 1
      * Input  :  

      * - aTGrp212                       COBOL Name: WS-2-12A-T-GRP
      * - bTGrp212                       COBOL Name: WS-2-12B-T-GRP
      * - aSGrp213                       COBOL Name: WS-2-13A-S-GRP
      * - aTGrp213                       COBOL Name: WS-2-13A-T-GRP
      *
      * Output :  

      * - aS212                          COBOL Name: WS-2-12A-S
      * - aT212                          COBOL Name: WS-2-12A-T
      * - aTFld1212                      COBOL Name: WS-2-12A-T-FLD1
      * - aTFld2212                      COBOL Name: WS-2-12A-T-FLD2
      * - tLen2                          COBOL Name: WS-2-T-LEN
      * - bS212                          COBOL Name: WS-2-12B-S
      * - bT212                          COBOL Name: WS-2-12B-T
      * - bTFld3212                      COBOL Name: WS-2-12B-T-FLD3
      * - bTFld1212                      COBOL Name: WS-2-12B-T-FLD1
      * - bTFld2212                      COBOL Name: WS-2-12B-T-FLD2
      * - aS213                          COBOL Name: WS-2-13A-S
      * - aT213                          COBOL Name: WS-2-13A-T
      * - aSFld1213                      COBOL Name: WS-2-13A-S-FLD1
      * - aSFld2213                      COBOL Name: WS-2-13A-S-FLD2
      * - aTFld1213                      COBOL Name: WS-2-13A-T-FLD1
      * - aTFld2213                      COBOL Name: WS-2-13A-T-FLD2
      * - sLen2                          COBOL Name: WS-2-S-LEN
      *
      * @throws CFException
      */
      @Override
      public MainlineSplit13OutCtx mainlineSplit13(MainlineSplit13InCtx methodIn) throws Exception {
Refmod3Ctx programCtx = methodIn.getRefmod3Ctx();
MainlineSplit13OutCtx methodOut = methodIn.getMainlineSplit13OutCtx();
          // MOVE ALL 'ABCD' TO WS-2-12A-S
          methodOut.setAS212(CONSTANTS.LITERAL_1222519919);
//  MOVE WS-2-12A-S TO WS-2-12A-T ( WS-ONE : LENGTH OF WS-2-12A-T )
          methodOut.getAT212().replace(methodOut.getAS212(),0,methodOut.getAS212().length, (methodOut.getAT212().begin + (methodIn.getOne()-1)) /* aT212 */,AT212.getAT212FieldLength() /* replace,sourceIndex,sourceLen,targetIndex,targetLen */);

// *
//  DISPLAY '*363* WS-2-12A-S       = (' WS-2-12A-S ')'
          logger.info("*363* WS-2-12A-S       = ({})", new String(methodOut.getAS212())); 
//  DISPLAY '*364* WS-2-12A-T-GRP   = (' WS-2-12A-T-GRP ')'
          logger.info("*364* WS-2-12A-T-GRP   = ({})", methodOut.getATGrp212().toString()); 
//  DISPLAY '*365* WS-2-12A-T       = (' WS-2-12A-T ')'
          logger.info("*365* WS-2-12A-T       = ({})", methodOut.getAT212().toString()); 
//  DISPLAY '*366*   WS-2-12A-T-FLD1= (' WS-2-12A-T-FLD1 ')'
          logger.info("*366*   WS-2-12A-T-FLD1= ({})", new String(methodOut.getATFld1212())); 
//  DISPLAY '*367*   WS-2-12A-T-FLD2= (' WS-2-12A-T-FLD2 ')'
          logger.info("*367*   WS-2-12A-T-FLD2= ({})", new String(methodOut.getATFld2212())); 

// *
// *
//  INITIALIZE WS-2-12A-S WS-2-12A-T
          methodOut.setAS212(CONSTANTS.SPACE_70 /* Fill 70 Spaces*/);
          methodOut.getAT212().initialize();
          // MOVE ALL 'ABCD' TO WS-2-12A-S
          methodOut.setAS212(CONSTANTS.LITERAL_1222519919);
//  MOVE LENGTH OF WS-2-12A-T TO WS-2-T-LEN
          methodOut.setTLen2((short) AT212.getAT212FieldLength());
//  MOVE WS-2-12A-S TO WS-2-12A-T ( WS-ONE : WS-2-T-LEN )
          methodOut.getAT212().replace(methodOut.getAS212(),0,methodOut.getAS212().length, (methodOut.getAT212().begin + (methodIn.getOne()-1)) /* aT212 */,methodOut.getTLen2() /* replace,sourceIndex,sourceLen,targetIndex,targetLen */);

// *
//  DISPLAY '*368* WS-2-12A-S       = (' WS-2-12A-S ')'
          logger.info("*368* WS-2-12A-S       = ({})", new String(methodOut.getAS212())); 
//  DISPLAY '*369* WS-2-12A-T-GRP   = (' WS-2-12A-T-GRP ')'
          logger.info("*369* WS-2-12A-T-GRP   = ({})", methodOut.getATGrp212().toString()); 
//  DISPLAY '*370* WS-2-12A-T       = (' WS-2-12A-T ')'
          logger.info("*370* WS-2-12A-T       = ({})", methodOut.getAT212().toString()); 
//  DISPLAY '*371*   WS-2-12A-T-FLD1= (' WS-2-12A-T-FLD1 ')'
          logger.info("*371*   WS-2-12A-T-FLD1= ({})", new String(methodOut.getATFld1212())); 
//  DISPLAY '*372*   WS-2-12A-T-FLD2= (' WS-2-12A-T-FLD2 ')'
          logger.info("*372*   WS-2-12A-T-FLD2= ({})", new String(methodOut.getATFld2212())); 

// *
// * Src -> string; tgt -> group ; src smaller than tgt
// *    src not refmod;target offset 5
// *
//  INITIALIZE WS-2-12B-S WS-2-12B-T
          methodOut.setBS212(CONSTANTS.SPACE_70 /* Fill 70 Spaces*/);
          methodOut.getBT212().initialize();
          // MOVE ALL 'ABCD' TO WS-2-12B-S
          methodOut.setBS212(CONSTANTS.LITERAL_1222519919);
//  MOVE ALL 'MNOP' TO WS-2-12B-T-FLD3
          methodOut.setBTFld3212(CONSTANTS.LITERAL_MNOPMNOPMNOPMNOPMNOPMNOPMNOPMNOP);
//  MOVE WS-2-12B-S TO WS-2-12B-T ( WS-ONE : LENGTH OF WS-2-12B-T )
          methodOut.getBT212().replace(methodOut.getBS212(),0,methodOut.getBS212().length, (methodOut.getBT212().begin + (methodIn.getOne()-1)) /* bT212 */,BT212.getBT212FieldLength() /* replace,sourceIndex,sourceLen,targetIndex,targetLen */);

// *
//  DISPLAY '*373* WS-2-12B-S       = (' WS-2-12B-S ')'
          logger.info("*373* WS-2-12B-S       = ({})", new String(methodOut.getBS212())); 
//  DISPLAY '*374* WS-2-12B-T-GRP   = (' WS-2-12B-T-GRP ')'
          logger.info("*374* WS-2-12B-T-GRP   = ({})", methodOut.getBTGrp212().toString()); 
//  DISPLAY '*375* WS-2-12B-T       = (' WS-2-12B-T ')'
          logger.info("*375* WS-2-12B-T       = ({})", methodOut.getBT212().toString()); 
//  DISPLAY '*376*   WS-2-12B-T-FLD1= (' WS-2-12B-T-FLD1 ')'
          logger.info("*376*   WS-2-12B-T-FLD1= ({})", new String(methodOut.getBTFld1212())); 
//  DISPLAY '*377*   WS-2-12B-T-FLD2= (' WS-2-12B-T-FLD2 ')'
          logger.info("*377*   WS-2-12B-T-FLD2= ({})", new String(methodOut.getBTFld2212())); 
//  DISPLAY '*378*   WS-2-12B-T-FLD3= (' WS-2-12B-T-FLD3 ')'
          logger.info("*378*   WS-2-12B-T-FLD3= ({})", new String(methodOut.getBTFld3212())); 

// *
// * Src -> group; tgt -> group ; src bigger than tgt
// *    src offset 3  ;target offset 5
// *
//  INITIALIZE WS-2-13A-S WS-2-13A-T
          methodOut.getAS213().initialize();
          methodOut.getAT213().initialize();
//  MOVE ALL 'ABCD' TO WS-2-13A-S-FLD1
          methodOut.setASFld1213(CONSTANTS.LITERAL_ABCDABCDABCDABCDABCDABCDABCDABCD);
//  MOVE ALL 'ZYXW' TO WS-2-13A-S-FLD2
          methodOut.setASFld2213(CONSTANTS.LITERAL_645286444);
//  MOVE WS-2-13A-S ( WS-THREE : LENGTH OF WS-2-13A-S - 3 ) TO WS-2-13A-T ( WS-FIVE : LENGTH OF WS-2-13A-T - 5)
          methodOut.getATGrp213().replace(methodIn.getASGrp213()/*parent*/,3+methodIn.getThree() - 1/*fromOffset - (aT213) */,AS213.getAS213FieldLength() - 3/*fromLen*/,5+methodIn.getFive() - 1/*toOffset - (aS213) */,AT213.getAT213FieldLength() - 5/*toLen*/);

// *
//  DISPLAY '*379* WS-2-13A-S-GRP   = (' WS-2-13A-S-GRP ')'
          logger.info("*379* WS-2-13A-S-GRP   = ({})", methodIn.getASGrp213().toString()); 
//  DISPLAY '*380* WS-2-13A-S       = (' WS-2-13A-S ')'
          logger.info("*380* WS-2-13A-S       = ({})", methodOut.getAS213().toString()); 
//  DISPLAY '*381*   WS-2-13A-S-FLD1= (' WS-2-13A-S-FLD1 ')'
          logger.info("*381*   WS-2-13A-S-FLD1= ({})", new String(methodOut.getASFld1213())); 
//  DISPLAY '*382*   WS-2-13A-S-FLD2= (' WS-2-13A-S-FLD2 ')'
          logger.info("*382*   WS-2-13A-S-FLD2= ({})", new String(methodOut.getASFld2213())); 
//  DISPLAY '*383* WS-2-13A-T-GRP   = (' WS-2-13A-T-GRP ')'
          logger.info("*383* WS-2-13A-T-GRP   = ({})", methodOut.getATGrp213().toString()); 
//  DISPLAY '*384* WS-2-13A-T       = (' WS-2-13A-T ')'
          logger.info("*384* WS-2-13A-T       = ({})", methodOut.getAT213().toString()); 
//  DISPLAY '*385*   WS-2-13A-T-FLD1= (' WS-2-13A-T-FLD1 ')'
          logger.info("*385*   WS-2-13A-T-FLD1= ({})", new String(methodOut.getATFld1213())); 
//  DISPLAY '*386*   WS-2-13A-T-FLD2= (' WS-2-13A-T-FLD2 ')'
          logger.info("*386*   WS-2-13A-T-FLD2= ({})", new String(methodOut.getATFld2213())); 

// *
//  INITIALIZE WS-2-13A-S WS-2-13A-T
          methodOut.getAS213().initialize();
          methodOut.getAT213().initialize();
//  MOVE ALL 'ABCD' TO WS-2-13A-S-FLD1
          methodOut.setASFld1213(CONSTANTS.LITERAL_ABCDABCDABCDABCDABCDABCDABCDABCD);
//  MOVE ALL 'ZYXW' TO WS-2-13A-S-FLD2
          methodOut.setASFld2213(CONSTANTS.LITERAL_645286444);
//  MOVE LENGTH OF WS-2-13A-S TO WS-2-S-LEN
          methodOut.setSLen2((short) AS213.getAS213FieldLength());
//  MOVE LENGTH OF WS-2-13A-T TO WS-2-T-LEN
          methodOut.setTLen2((short) AT213.getAT213FieldLength());
//  SUBTRACT 3 FROM WS-2-S-LEN
          methodOut.setSLen2( (short) (methodOut.getSLen2()-(short)3));
//  SUBTRACT 5 FROM WS-2-T-LEN
          methodOut.setTLen2( (short) (methodOut.getTLen2()-(short)5));
//  MOVE WS-2-13A-S ( WS-THREE : WS-2-S-LEN ) TO WS-2-13A-T ( WS-FIVE : WS-2-T-LEN )
          methodOut.getATGrp213().replace(methodIn.getASGrp213()/*parent*/,3+methodIn.getThree() - 1/*fromOffset - (aT213) */,methodOut.getSLen2()/*fromLen*/,5+methodIn.getFive() - 1/*toOffset - (aS213) */,methodOut.getTLen2()/*toLen*/);

// *
//  DISPLAY '*387* WS-2-13A-S-GRP   = (' WS-2-13A-S-GRP ')'
          logger.info("*387* WS-2-13A-S-GRP   = ({})", methodIn.getASGrp213().toString()); 
//  DISPLAY '*388* WS-2-13A-S       = (' WS-2-13A-S ')'
          logger.info("*388* WS-2-13A-S       = ({})", methodOut.getAS213().toString()); 
//  DISPLAY '*389*   WS-2-13A-S-FLD1= (' WS-2-13A-S-FLD1 ')'
          logger.info("*389*   WS-2-13A-S-FLD1= ({})", new String(methodOut.getASFld1213())); 
//  DISPLAY '*390*   WS-2-13A-S-FLD2= (' WS-2-13A-S-FLD2 ')'
          logger.info("*390*   WS-2-13A-S-FLD2= ({})", new String(methodOut.getASFld2213())); 
//  DISPLAY '*391* WS-2-13A-T-GRP   = (' WS-2-13A-T-GRP ')'
          logger.info("*391* WS-2-13A-T-GRP   = ({})", methodOut.getATGrp213().toString()); 
      
      return methodOut;
      }
      /**
      * mainlineSplit14 
      *   This method is derived from 
  *   COBOL Paragraph - MAINLINE-SPLIT14 COBOL Cyclomatic complexity - 1
      * Input  :  

      * - aT213                          COBOL Name: WS-2-13A-T
      * - aTFld1213                      COBOL Name: WS-2-13A-T-FLD1
      * - aTFld2213                      COBOL Name: WS-2-13A-T-FLD2
      * - bSGrp213                       COBOL Name: WS-2-13B-S-GRP
      * - bTGrp213                       COBOL Name: WS-2-13B-T-GRP
      * - aSGrp214                       COBOL Name: WS-2-14A-S-GRP
      * - aTGrp214                       COBOL Name: WS-2-14A-T-GRP
      *
      * Output :  

      * - bS213                          COBOL Name: WS-2-13B-S
      * - bT213                          COBOL Name: WS-2-13B-T
      * - bSFld1213                      COBOL Name: WS-2-13B-S-FLD1
      * - bSFld2213                      COBOL Name: WS-2-13B-S-FLD2
      * - bTFld3213                      COBOL Name: WS-2-13B-T-FLD3
      * - bTFld1213                      COBOL Name: WS-2-13B-T-FLD1
      * - bTFld2213                      COBOL Name: WS-2-13B-T-FLD2
      * - sLen2                          COBOL Name: WS-2-S-LEN
      * - tLen2                          COBOL Name: WS-2-T-LEN
      * - aS214                          COBOL Name: WS-2-14A-S
      * - aT214                          COBOL Name: WS-2-14A-T
      * - aTFld1214                      COBOL Name: WS-2-14A-T-FLD1
      * - aTFld2214                      COBOL Name: WS-2-14A-T-FLD2
      *
      * @throws CFException
      */
      @Override
      public MainlineSplit14OutCtx mainlineSplit14(MainlineSplit14InCtx methodIn) throws Exception {
			// Declare local variables used in the method
			 final int A_S_214_LENGTH = 70;
			// End of variable declaration

Refmod3Ctx programCtx = methodIn.getRefmod3Ctx();
MainlineSplit14OutCtx methodOut = methodIn.getMainlineSplit14OutCtx();
//  DISPLAY '*392* WS-2-13A-T       = (' WS-2-13A-T ')'
          logger.info("*392* WS-2-13A-T       = ({})", methodIn.getAT213().toString()); 
//  DISPLAY '*393*   WS-2-13A-T-FLD1= (' WS-2-13A-T-FLD1 ')'
          logger.info("*393*   WS-2-13A-T-FLD1= ({})", new String(methodIn.getATFld1213())); 
//  DISPLAY '*394*   WS-2-13A-T-FLD2= (' WS-2-13A-T-FLD2 ')'
          logger.info("*394*   WS-2-13A-T-FLD2= ({})", new String(methodIn.getATFld2213())); 

// *
// * Src -> group; tgt -> group ; src smaller than tgt
// *    src offset 3  ;target offset 5
// *
//  INITIALIZE WS-2-13B-S WS-2-13B-T
          methodOut.getBS213().initialize();
          methodOut.getBT213().initialize();
//  MOVE ALL 'ABCD' TO WS-2-13B-S-FLD1
          methodOut.setBSFld1213(CONSTANTS.LITERAL_ABCDABCDABCDABCDABCDABCDABCDABCD);
//  MOVE ALL 'ZYXW' TO WS-2-13B-S-FLD2
          methodOut.setBSFld2213(CONSTANTS.LITERAL_645286444);
//  MOVE ALL 'MNOP' TO WS-2-13B-T-FLD3
          methodOut.setBTFld3213(CONSTANTS.LITERAL_MNOPMNOPMNOPMNOPMNOPMNOPMNOPMNOP);
//  MOVE WS-2-13B-S ( WS-THREE : LENGTH OF WS-2-13B-S - 3 ) TO WS-2-13B-T ( WS-FIVE : LENGTH OF WS-2-13B-T - 5)
          methodOut.getBTGrp213().replace(methodIn.getBSGrp213()/*parent*/,3+methodIn.getThree() - 1/*fromOffset - (bT213) */,BS213.getBS213FieldLength() - 3/*fromLen*/,5+methodIn.getFive() - 1/*toOffset - (bS213) */,BT213.getBT213FieldLength() - 5/*toLen*/);

// *
//  DISPLAY '*395* WS-2-13B-S-GRP   = (' WS-2-13B-S-GRP ')'
          logger.info("*395* WS-2-13B-S-GRP   = ({})", methodIn.getBSGrp213().toString()); 
//  DISPLAY '*396* WS-2-13B-S       = (' WS-2-13B-S ')'
          logger.info("*396* WS-2-13B-S       = ({})", methodOut.getBS213().toString()); 
//  DISPLAY '*397*   WS-2-13B-S-FLD1= (' WS-2-13B-S-FLD1 ')'
          logger.info("*397*   WS-2-13B-S-FLD1= ({})", new String(methodOut.getBSFld1213())); 
//  DISPLAY '*398*   WS-2-13B-S-FLD2= (' WS-2-13B-S-FLD2 ')'
          logger.info("*398*   WS-2-13B-S-FLD2= ({})", new String(methodOut.getBSFld2213())); 
//  DISPLAY '*399* WS-2-13B-T-GRP   = (' WS-2-13B-T-GRP ')'
          logger.info("*399* WS-2-13B-T-GRP   = ({})", methodOut.getBTGrp213().toString()); 
//  DISPLAY '*400* WS-2-13B-T       = (' WS-2-13B-T ')'
          logger.info("*400* WS-2-13B-T       = ({})", methodOut.getBT213().toString()); 
//  DISPLAY '*401*   WS-2-13B-T-FLD1= (' WS-2-13B-T-FLD1 ')'
          logger.info("*401*   WS-2-13B-T-FLD1= ({})", new String(methodOut.getBTFld1213())); 
//  DISPLAY '*402*   WS-2-13B-T-FLD2= (' WS-2-13B-T-FLD2 ')'
          logger.info("*402*   WS-2-13B-T-FLD2= ({})", new String(methodOut.getBTFld2213())); 
//  DISPLAY '*403*   WS-2-13B-T-FLD3= (' WS-2-13B-T-FLD3 ')'
          logger.info("*403*   WS-2-13B-T-FLD3= ({})", new String(methodOut.getBTFld3213())); 

// *
//  INITIALIZE WS-2-13B-S WS-2-13B-T
          methodOut.getBS213().initialize();
          methodOut.getBT213().initialize();
//  MOVE ALL 'ABCD' TO WS-2-13B-S-FLD1
          methodOut.setBSFld1213(CONSTANTS.LITERAL_ABCDABCDABCDABCDABCDABCDABCDABCD);
//  MOVE ALL 'ZYXW' TO WS-2-13B-S-FLD2
          methodOut.setBSFld2213(CONSTANTS.LITERAL_645286444);
//  MOVE ALL 'MNOP' TO WS-2-13B-T-FLD3
          methodOut.setBTFld3213(CONSTANTS.LITERAL_MNOPMNOPMNOPMNOPMNOPMNOPMNOPMNOP);
//  MOVE LENGTH OF WS-2-13B-S TO WS-2-S-LEN
          methodOut.setSLen2((short) BS213.getBS213FieldLength());
//  MOVE LENGTH OF WS-2-13B-T TO WS-2-T-LEN
          methodOut.setTLen2((short) BT213.getBT213FieldLength());
//  SUBTRACT 3 FROM WS-2-S-LEN
          methodOut.setSLen2( (short) (methodOut.getSLen2()-(short)3));
//  SUBTRACT 5 FROM WS-2-T-LEN
          methodOut.setTLen2( (short) (methodOut.getTLen2()-(short)5));
//  MOVE WS-2-13B-S ( WS-THREE : WS-2-S-LEN ) TO WS-2-13B-T ( WS-FIVE : WS-2-T-LEN )
          methodOut.getBTGrp213().replace(methodIn.getBSGrp213()/*parent*/,3+methodIn.getThree() - 1/*fromOffset - (bT213) */,methodOut.getSLen2()/*fromLen*/,5+methodIn.getFive() - 1/*toOffset - (bS213) */,methodOut.getTLen2()/*toLen*/);

// *
//  DISPLAY '*404* WS-2-13B-S-GRP   = (' WS-2-13B-S-GRP ')'
          logger.info("*404* WS-2-13B-S-GRP   = ({})", methodIn.getBSGrp213().toString()); 
//  DISPLAY '*405* WS-2-13B-S       = (' WS-2-13B-S ')'
          logger.info("*405* WS-2-13B-S       = ({})", methodOut.getBS213().toString()); 
//  DISPLAY '*406*   WS-2-13B-S-FLD1= (' WS-2-13B-S-FLD1 ')'
          logger.info("*406*   WS-2-13B-S-FLD1= ({})", new String(methodOut.getBSFld1213())); 
//  DISPLAY '*407*   WS-2-13B-S-FLD2= (' WS-2-13B-S-FLD2 ')'
          logger.info("*407*   WS-2-13B-S-FLD2= ({})", new String(methodOut.getBSFld2213())); 
//  DISPLAY '*408* WS-2-13B-T-GRP   = (' WS-2-13B-T-GRP ')'
          logger.info("*408* WS-2-13B-T-GRP   = ({})", methodOut.getBTGrp213().toString()); 
//  DISPLAY '*409* WS-2-13B-T       = (' WS-2-13B-T ')'
          logger.info("*409* WS-2-13B-T       = ({})", methodOut.getBT213().toString()); 
//  DISPLAY '*410*   WS-2-13B-T-FLD1= (' WS-2-13B-T-FLD1 ')'
          logger.info("*410*   WS-2-13B-T-FLD1= ({})", new String(methodOut.getBTFld1213())); 
//  DISPLAY '*411*   WS-2-13B-T-FLD2= (' WS-2-13B-T-FLD2 ')'
          logger.info("*411*   WS-2-13B-T-FLD2= ({})", new String(methodOut.getBTFld2213())); 
//  DISPLAY '*412*   WS-2-13B-T-FLD3= (' WS-2-13B-T-FLD3 ')'
          logger.info("*412*   WS-2-13B-T-FLD3= ({})", new String(methodOut.getBTFld3213())); 

// *
// * Src -> string; tgt -> group ; src bigger than tgt
// *    src offset 3  ;target offset 5
// *
//  INITIALIZE WS-2-14A-S WS-2-14A-T
          methodOut.setAS214(CONSTANTS.SPACE_70 /* Fill 70 Spaces*/);
          methodOut.getAT214().initialize();
//  MOVE ALL 'ABCD' TO WS-2-14A-S
          methodOut.setAS214(CONSTANTS.LITERAL_1222519919);
//  MOVE WS-2-14A-S ( WS-THREE : LENGTH OF WS-2-14A-S - 3 ) TO WS-2-14A-T ( WS-FIVE : LENGTH OF WS-2-14A-T - 5)
          methodOut.getATGrp214().replace(methodIn.getASGrp214()/*parent*/,3+methodIn.getThree() - 1/*fromOffset - (aT214) */,A_S_214_LENGTH - 3/*fromLen*/,5+methodIn.getFive() - 1/*toOffset - (aS214) */,AT214.getAT214FieldLength() - 5/*toLen*/);

// *
//  DISPLAY '*413* WS-2-14A-S-GRP   = (' WS-2-14A-S-GRP ')'
          logger.info("*413* WS-2-14A-S-GRP   = ({})", methodIn.getASGrp214().toString()); 
//  DISPLAY '*414* WS-2-14A-S       = (' WS-2-14A-S ')'
          logger.info("*414* WS-2-14A-S       = ({})", new String(methodOut.getAS214())); 
//  DISPLAY '*415* WS-2-14A-T-GRP   = (' WS-2-14A-T-GRP ')'
          logger.info("*415* WS-2-14A-T-GRP   = ({})", methodOut.getATGrp214().toString()); 
//  DISPLAY '*416* WS-2-14A-T       = (' WS-2-14A-T ')'
          logger.info("*416* WS-2-14A-T       = ({})", methodOut.getAT214().toString()); 
//  DISPLAY '*417*   WS-2-14A-T-FLD1= (' WS-2-14A-T-FLD1 ')'
          logger.info("*417*   WS-2-14A-T-FLD1= ({})", new String(methodOut.getATFld1214())); 
//  DISPLAY '*418*   WS-2-14A-T-FLD2= (' WS-2-14A-T-FLD2 ')'
          logger.info("*418*   WS-2-14A-T-FLD2= ({})", new String(methodOut.getATFld2214())); 

// *
//  INITIALIZE WS-2-14A-S WS-2-14A-T
          methodOut.setAS214(CONSTANTS.SPACE_70 /* Fill 70 Spaces*/);
          methodOut.getAT214().initialize();
//  MOVE ALL 'ABCD' TO WS-2-14A-S
          methodOut.setAS214(CONSTANTS.LITERAL_1222519919);
//  MOVE LENGTH OF WS-2-14A-S TO WS-2-S-LEN
          methodOut.setSLen2((short) A_S_214_LENGTH);
//  MOVE LENGTH OF WS-2-14A-T TO WS-2-T-LEN
          methodOut.setTLen2((short) AT214.getAT214FieldLength());
//  SUBTRACT 3 FROM WS-2-S-LEN
          methodOut.setSLen2( (short) (methodOut.getSLen2()-(short)3));
//  SUBTRACT 5 FROM WS-2-T-LEN
          methodOut.setTLen2( (short) (methodOut.getTLen2()-(short)5));
//  MOVE WS-2-14A-S ( WS-THREE : WS-2-S-LEN ) TO WS-2-14A-T ( WS-FIVE : WS-2-T-LEN )
          methodOut.getATGrp214().replace(methodIn.getASGrp214()/*parent*/,3+methodIn.getThree() - 1/*fromOffset - (aT214) */,methodOut.getSLen2()/*fromLen*/,5+methodIn.getFive() - 1/*toOffset - (aS214) */,methodOut.getTLen2()/*toLen*/);
      
      return methodOut;
      }
      /**
      * mainlineSplit15 
      *   This method is derived from 
  *   COBOL Paragraph - MAINLINE-SPLIT15 COBOL Cyclomatic complexity - 1
      * Input  :  

      * - aSGrp214                       COBOL Name: WS-2-14A-S-GRP
      * - aS214                          COBOL Name: WS-2-14A-S
      * - aTGrp214                       COBOL Name: WS-2-14A-T-GRP
      * - aT214                          COBOL Name: WS-2-14A-T
      * - aTFld1214                      COBOL Name: WS-2-14A-T-FLD1
      * - aTFld2214                      COBOL Name: WS-2-14A-T-FLD2
      * - bSGrp214                       COBOL Name: WS-2-14B-S-GRP
      * - bTGrp214                       COBOL Name: WS-2-14B-T-GRP
      * - aSGrp215                       COBOL Name: WS-2-15A-S-GRP
      *
      * Output :  

      * - bS214                          COBOL Name: WS-2-14B-S
      * - bT214                          COBOL Name: WS-2-14B-T
      * - bTFld3214                      COBOL Name: WS-2-14B-T-FLD3
      * - bTFld1214                      COBOL Name: WS-2-14B-T-FLD1
      * - bTFld2214                      COBOL Name: WS-2-14B-T-FLD2
      * - sLen2                          COBOL Name: WS-2-S-LEN
      * - tLen2                          COBOL Name: WS-2-T-LEN
      * - aS215                          COBOL Name: WS-2-15A-S
      * - aT215                          COBOL Name: WS-2-15A-T
      * - aSFld1215                      COBOL Name: WS-2-15A-S-FLD1
      * - aSFld2215                      COBOL Name: WS-2-15A-S-FLD2
      * - aTFld1215                      COBOL Name: WS-2-15A-T-FLD1
      * - aTFld2215                      COBOL Name: WS-2-15A-T-FLD2
      *
      * @throws CFException
      */
      @Override
      public MainlineSplit15OutCtx mainlineSplit15(MainlineSplit15InCtx methodIn) throws Exception {
			// Declare local variables used in the method
			 final int B_S_214_LENGTH = 70;
			// End of variable declaration

Refmod3Ctx programCtx = methodIn.getRefmod3Ctx();
MainlineSplit15OutCtx methodOut = methodIn.getMainlineSplit15OutCtx();

// *
//  DISPLAY '*419* WS-2-14A-S-GRP   = (' WS-2-14A-S-GRP ')'
          logger.info("*419* WS-2-14A-S-GRP   = ({})", methodIn.getASGrp214().toString()); 
//  DISPLAY '*420* WS-2-14A-S       = (' WS-2-14A-S ')'
          logger.info("*420* WS-2-14A-S       = ({})", new String(methodIn.getAS214())); 
//  DISPLAY '*421* WS-2-14A-T-GRP   = (' WS-2-14A-T-GRP ')'
          logger.info("*421* WS-2-14A-T-GRP   = ({})", methodIn.getATGrp214().toString()); 
//  DISPLAY '*422* WS-2-14A-T       = (' WS-2-14A-T ')'
          logger.info("*422* WS-2-14A-T       = ({})", methodIn.getAT214().toString()); 
//  DISPLAY '*423*   WS-2-14A-T-FLD1= (' WS-2-14A-T-FLD1 ')'
          logger.info("*423*   WS-2-14A-T-FLD1= ({})", new String(methodIn.getATFld1214())); 
//  DISPLAY '*424*   WS-2-14A-T-FLD2= (' WS-2-14A-T-FLD2 ')'
          logger.info("*424*   WS-2-14A-T-FLD2= ({})", new String(methodIn.getATFld2214())); 

// *
// * Src -> string; tgt -> group ; src smaller than tgt
// *    src offset 3  ;target offset 5
// *
//  INITIALIZE WS-2-14B-S WS-2-14B-T
          methodOut.setBS214(CONSTANTS.SPACE_70 /* Fill 70 Spaces*/);
          methodOut.getBT214().initialize();
//  MOVE ALL 'ABCD' TO WS-2-14B-S
          methodOut.setBS214(CONSTANTS.LITERAL_1222519919);
//  MOVE ALL 'MNOP' TO WS-2-14B-T-FLD3
          methodOut.setBTFld3214(CONSTANTS.LITERAL_MNOPMNOPMNOPMNOPMNOPMNOPMNOPMNOP);
//  MOVE WS-2-14B-S ( WS-THREE : LENGTH OF WS-2-14B-S - 3 ) TO WS-2-14B-T ( WS-FIVE : LENGTH OF WS-2-14B-T - 5)
          methodOut.getBTGrp214().replace(methodIn.getBSGrp214()/*parent*/,3+methodIn.getThree() - 1/*fromOffset - (bT214) */,B_S_214_LENGTH - 3/*fromLen*/,5+methodIn.getFive() - 1/*toOffset - (bS214) */,BT214.getBT214FieldLength() - 5/*toLen*/);

// *
//  DISPLAY '*425* WS-2-14B-S-GRP   = (' WS-2-14B-S-GRP ')'
          logger.info("*425* WS-2-14B-S-GRP   = ({})", methodIn.getBSGrp214().toString()); 
//  DISPLAY '*426* WS-2-14B-S       = (' WS-2-14B-S ')'
          logger.info("*426* WS-2-14B-S       = ({})", new String(methodOut.getBS214())); 
//  DISPLAY '*427* WS-2-14B-T-GRP   = (' WS-2-14B-T-GRP ')'
          logger.info("*427* WS-2-14B-T-GRP   = ({})", methodOut.getBTGrp214().toString()); 
//  DISPLAY '*428* WS-2-14B-T       = (' WS-2-14B-T ')'
          logger.info("*428* WS-2-14B-T       = ({})", methodOut.getBT214().toString()); 
//  DISPLAY '*429*   WS-2-14B-T-FLD1= (' WS-2-14B-T-FLD1 ')'
          logger.info("*429*   WS-2-14B-T-FLD1= ({})", new String(methodOut.getBTFld1214())); 
//  DISPLAY '*430*   WS-2-14B-T-FLD2= (' WS-2-14B-T-FLD2 ')'
          logger.info("*430*   WS-2-14B-T-FLD2= ({})", new String(methodOut.getBTFld2214())); 
//  DISPLAY '*431*   WS-2-14B-T-FLD3= (' WS-2-14B-T-FLD3 ')'
          logger.info("*431*   WS-2-14B-T-FLD3= ({})", new String(methodOut.getBTFld3214())); 

// *
//  INITIALIZE WS-2-14B-S WS-2-14B-T
          methodOut.setBS214(CONSTANTS.SPACE_70 /* Fill 70 Spaces*/);
          methodOut.getBT214().initialize();
//  MOVE ALL 'ABCD' TO WS-2-14B-S
          methodOut.setBS214(CONSTANTS.LITERAL_1222519919);
//  MOVE ALL 'MNOP' TO WS-2-14B-T-FLD3
          methodOut.setBTFld3214(CONSTANTS.LITERAL_MNOPMNOPMNOPMNOPMNOPMNOPMNOPMNOP);
//  MOVE LENGTH OF WS-2-14B-S TO WS-2-S-LEN
          methodOut.setSLen2((short) B_S_214_LENGTH);
//  MOVE LENGTH OF WS-2-14B-T TO WS-2-T-LEN
          methodOut.setTLen2((short) BT214.getBT214FieldLength());
//  SUBTRACT 3 FROM WS-2-S-LEN
          methodOut.setSLen2( (short) (methodOut.getSLen2()-(short)3));
//  SUBTRACT 5 FROM WS-2-T-LEN
          methodOut.setTLen2( (short) (methodOut.getTLen2()-(short)5));
//  MOVE WS-2-14B-S ( WS-THREE : WS-2-S-LEN ) TO WS-2-14B-T ( WS-FIVE : WS-2-T-LEN )
          methodOut.getBTGrp214().replace(methodIn.getBSGrp214()/*parent*/,3+methodIn.getThree() - 1/*fromOffset - (bT214) */,methodOut.getSLen2()/*fromLen*/,5+methodIn.getFive() - 1/*toOffset - (bS214) */,methodOut.getTLen2()/*toLen*/);

// *
//  DISPLAY '*432* WS-2-14B-S-GRP   = (' WS-2-14B-S-GRP ')'
          logger.info("*432* WS-2-14B-S-GRP   = ({})", methodIn.getBSGrp214().toString()); 
//  DISPLAY '*433* WS-2-14B-S       = (' WS-2-14B-S ')'
          logger.info("*433* WS-2-14B-S       = ({})", new String(methodOut.getBS214())); 
//  DISPLAY '*434* WS-2-14B-T-GRP   = (' WS-2-14B-T-GRP ')'
          logger.info("*434* WS-2-14B-T-GRP   = ({})", methodOut.getBTGrp214().toString()); 
//  DISPLAY '*435* WS-2-14B-T       = (' WS-2-14B-T ')'
          logger.info("*435* WS-2-14B-T       = ({})", methodOut.getBT214().toString()); 
//  DISPLAY '*436*   WS-2-14B-T-FLD1= (' WS-2-14B-T-FLD1 ')'
          logger.info("*436*   WS-2-14B-T-FLD1= ({})", new String(methodOut.getBTFld1214())); 
//  DISPLAY '*437*   WS-2-14B-T-FLD2= (' WS-2-14B-T-FLD2 ')'
          logger.info("*437*   WS-2-14B-T-FLD2= ({})", new String(methodOut.getBTFld2214())); 
//  DISPLAY '*438*   WS-2-14B-T-FLD3= (' WS-2-14B-T-FLD3 ')'
          logger.info("*438*   WS-2-14B-T-FLD3= ({})", new String(methodOut.getBTFld3214())); 

// *
// * Src -> group; tgt -> group ; src bigger than tgt
// *    src offset 3  ;target offset 0
// *
//  INITIALIZE WS-2-15A-S WS-2-15A-T
          methodOut.getAS215().initialize();
          methodOut.getAT215().initialize();
//  MOVE ALL 'ABCD' TO WS-2-15A-S-FLD1
          methodOut.setASFld1215(CONSTANTS.LITERAL_ABCDABCDABCDABCDABCDABCDABCDABCD);
//  MOVE ALL 'ZYXW' TO WS-2-15A-S-FLD2
          methodOut.setASFld2215(CONSTANTS.LITERAL_645286444);
//  MOVE WS-2-15A-S ( WS-THREE : LENGTH OF WS-2-15A-S - 3 ) TO WS-2-15A-T ( WS-FIVE : LENGTH OF WS-2-15A-T - 5)
          methodOut.getAT215().replace(methodIn.getASGrp215()/*parent*/,3+methodIn.getThree() - 1/*fromOffset - (aT215) */,AS215.getAS215FieldLength() - 3/*fromLen*/,0+methodIn.getFive() - 1/*toOffset - (aS215) */,AT215.getAT215FieldLength() - 5/*toLen*/);

// *
//  DISPLAY '*439* WS-2-15A-S-GRP   = (' WS-2-15A-S-GRP ')'
          logger.info("*439* WS-2-15A-S-GRP   = ({})", methodIn.getASGrp215().toString()); 
//  DISPLAY '*440* WS-2-15A-S       = (' WS-2-15A-S ')'
          logger.info("*440* WS-2-15A-S       = ({})", methodOut.getAS215().toString()); 
//  DISPLAY '*441*   WS-2-15A-S-FLD1= (' WS-2-15A-S-FLD1 ')'
          logger.info("*441*   WS-2-15A-S-FLD1= ({})", new String(methodOut.getASFld1215())); 
//  DISPLAY '*442*   WS-2-15A-S-FLD2= (' WS-2-15A-S-FLD2 ')'
          logger.info("*442*   WS-2-15A-S-FLD2= ({})", new String(methodOut.getASFld2215())); 
//  DISPLAY '*443* WS-2-15A-T       = (' WS-2-15A-T ')'
          logger.info("*443* WS-2-15A-T       = ({})", methodOut.getAT215().toString()); 
//  DISPLAY '*444*   WS-2-15A-T-FLD1= (' WS-2-15A-T-FLD1 ')'
          logger.info("*444*   WS-2-15A-T-FLD1= ({})", new String(methodOut.getATFld1215())); 
//  DISPLAY '*445*   WS-2-15A-T-FLD2= (' WS-2-15A-T-FLD2 ')'
          logger.info("*445*   WS-2-15A-T-FLD2= ({})", new String(methodOut.getATFld2215())); 

// *
//  INITIALIZE WS-2-15A-S WS-2-15A-T
          methodOut.getAS215().initialize();
          methodOut.getAT215().initialize();
//  MOVE ALL 'ABCD' TO WS-2-15A-S-FLD1
          methodOut.setASFld1215(CONSTANTS.LITERAL_ABCDABCDABCDABCDABCDABCDABCDABCD);
//  MOVE ALL 'ZYXW' TO WS-2-15A-S-FLD2
          methodOut.setASFld2215(CONSTANTS.LITERAL_645286444);
//  MOVE LENGTH OF WS-2-15A-S TO WS-2-S-LEN
          methodOut.setSLen2((short) AS215.getAS215FieldLength());
//  MOVE LENGTH OF WS-2-15A-T TO WS-2-T-LEN
          methodOut.setTLen2((short) AT215.getAT215FieldLength());
//  SUBTRACT 3 FROM WS-2-S-LEN
          methodOut.setSLen2( (short) (methodOut.getSLen2()-(short)3));
//  SUBTRACT 5 FROM WS-2-T-LEN
          methodOut.setTLen2( (short) (methodOut.getTLen2()-(short)5));
//  MOVE WS-2-15A-S ( WS-THREE : WS-2-S-LEN ) TO WS-2-15A-T ( WS-FIVE : WS-2-T-LEN )
          methodOut.getAT215().replace(methodIn.getASGrp215()/*parent*/,3+methodIn.getThree() - 1/*fromOffset - (aT215) */,methodOut.getSLen2()/*fromLen*/,0+methodIn.getFive() - 1/*toOffset - (aS215) */,methodOut.getTLen2()/*toLen*/);
      
      return methodOut;
      }
      /**
      * mainlineSplit16 
      *   This method is derived from 
  *   COBOL Paragraph - MAINLINE-SPLIT16 COBOL Cyclomatic complexity - 1
      * Input  :  

      * - aSGrp215                       COBOL Name: WS-2-15A-S-GRP
      * - aS215                          COBOL Name: WS-2-15A-S
      * - aSFld1215                      COBOL Name: WS-2-15A-S-FLD1
      * - aSFld2215                      COBOL Name: WS-2-15A-S-FLD2
      * - aT215                          COBOL Name: WS-2-15A-T
      * - aTFld1215                      COBOL Name: WS-2-15A-T-FLD1
      * - aTFld2215                      COBOL Name: WS-2-15A-T-FLD2
      * - bSGrp215                       COBOL Name: WS-2-15B-S-GRP
      * - aSGrp216                       COBOL Name: WS-2-16A-S-GRP
      *
      * Output :  

      * - bS215                          COBOL Name: WS-2-15B-S
      * - bT215                          COBOL Name: WS-2-15B-T
      * - bSFld1215                      COBOL Name: WS-2-15B-S-FLD1
      * - bSFld2215                      COBOL Name: WS-2-15B-S-FLD2
      * - bTFld3215                      COBOL Name: WS-2-15B-T-FLD3
      * - bTFld1215                      COBOL Name: WS-2-15B-T-FLD1
      * - bTFld2215                      COBOL Name: WS-2-15B-T-FLD2
      * - sLen2                          COBOL Name: WS-2-S-LEN
      * - tLen2                          COBOL Name: WS-2-T-LEN
      * - aS216                          COBOL Name: WS-2-16A-S
      * - aT216                          COBOL Name: WS-2-16A-T
      * - aTFld1216                      COBOL Name: WS-2-16A-T-FLD1
      * - aTFld2216                      COBOL Name: WS-2-16A-T-FLD2
      *
      * @throws CFException
      */
      @Override
      public MainlineSplit16OutCtx mainlineSplit16(MainlineSplit16InCtx methodIn) throws Exception {
			// Declare local variables used in the method
			 final int A_S_216_LENGTH = 70;
			// End of variable declaration

Refmod3Ctx programCtx = methodIn.getRefmod3Ctx();
MainlineSplit16OutCtx methodOut = methodIn.getMainlineSplit16OutCtx();

// *
//  DISPLAY '*446* WS-2-15A-S-GRP   = (' WS-2-15A-S-GRP ')'
          logger.info("*446* WS-2-15A-S-GRP   = ({})", methodIn.getASGrp215().toString()); 
//  DISPLAY '*447* WS-2-15A-S       = (' WS-2-15A-S ')'
          logger.info("*447* WS-2-15A-S       = ({})", methodIn.getAS215().toString()); 
//  DISPLAY '*448*   WS-2-15A-S-FLD1= (' WS-2-15A-S-FLD1 ')'
          logger.info("*448*   WS-2-15A-S-FLD1= ({})", new String(methodIn.getASFld1215())); 
//  DISPLAY '*449*   WS-2-15A-S-FLD2= (' WS-2-15A-S-FLD2 ')'
          logger.info("*449*   WS-2-15A-S-FLD2= ({})", new String(methodIn.getASFld2215())); 
//  DISPLAY '*450* WS-2-15A-T       = (' WS-2-15A-T ')'
          logger.info("*450* WS-2-15A-T       = ({})", methodIn.getAT215().toString()); 
//  DISPLAY '*451*   WS-2-15A-T-FLD1= (' WS-2-15A-T-FLD1 ')'
          logger.info("*451*   WS-2-15A-T-FLD1= ({})", new String(methodIn.getATFld1215())); 
//  DISPLAY '*452*   WS-2-15A-T-FLD2= (' WS-2-15A-T-FLD2 ')'
          logger.info("*452*   WS-2-15A-T-FLD2= ({})", new String(methodIn.getATFld2215())); 

// *
// * Src -> group; tgt -> group ; src smaller than tgt
// *    src offset 3  ;target offset 0
// *
//  INITIALIZE WS-2-15B-S WS-2-15B-T
          methodOut.getBS215().initialize();
          methodOut.getBT215().initialize();
//  MOVE ALL 'ABCD' TO WS-2-15B-S-FLD1
          methodOut.setBSFld1215(CONSTANTS.LITERAL_ABCDABCDABCDABCDABCDABCDABCDABCD);
//  MOVE ALL 'ZYXW' TO WS-2-15B-S-FLD2
          methodOut.setBSFld2215(CONSTANTS.LITERAL_645286444);
//  MOVE ALL 'MNOP' TO WS-2-15B-T-FLD3
          methodOut.setBTFld3215(CONSTANTS.LITERAL_MNOPMNOPMNOPMNOPMNOPMNOPMNOPMNOP);
//  MOVE WS-2-15B-S ( WS-THREE : LENGTH OF WS-2-15B-S - 3 ) TO WS-2-15B-T ( WS-FIVE : LENGTH OF WS-2-15B-T - 5)
          methodOut.getBT215().replace(methodIn.getBSGrp215()/*parent*/,3+methodIn.getThree() - 1/*fromOffset - (bT215) */,BS215.getBS215FieldLength() - 3/*fromLen*/,0+methodIn.getFive() - 1/*toOffset - (bS215) */,BT215.getBT215FieldLength() - 5/*toLen*/);

// *
//  DISPLAY '*453* WS-2-15B-S-GRP   = (' WS-2-15B-S-GRP ')'
          logger.info("*453* WS-2-15B-S-GRP   = ({})", methodIn.getBSGrp215().toString()); 
//  DISPLAY '*454* WS-2-15B-S       = (' WS-2-15B-S ')'
          logger.info("*454* WS-2-15B-S       = ({})", methodOut.getBS215().toString()); 
//  DISPLAY '*455*   WS-2-15B-S-FLD1= (' WS-2-15B-S-FLD1 ')'
          logger.info("*455*   WS-2-15B-S-FLD1= ({})", new String(methodOut.getBSFld1215())); 
//  DISPLAY '*456*   WS-2-15B-S-FLD2= (' WS-2-15B-S-FLD2 ')'
          logger.info("*456*   WS-2-15B-S-FLD2= ({})", new String(methodOut.getBSFld2215())); 
//  DISPLAY '*457* WS-2-15B-T       = (' WS-2-15B-T ')'
          logger.info("*457* WS-2-15B-T       = ({})", methodOut.getBT215().toString()); 
//  DISPLAY '*458*   WS-2-15B-T-FLD1= (' WS-2-15B-T-FLD1 ')'
          logger.info("*458*   WS-2-15B-T-FLD1= ({})", new String(methodOut.getBTFld1215())); 
//  DISPLAY '*459*   WS-2-15B-T-FLD2= (' WS-2-15B-T-FLD2 ')'
          logger.info("*459*   WS-2-15B-T-FLD2= ({})", new String(methodOut.getBTFld2215())); 
//  DISPLAY '*460*   WS-2-15B-T-FLD3= (' WS-2-15B-T-FLD3 ')'
          logger.info("*460*   WS-2-15B-T-FLD3= ({})", new String(methodOut.getBTFld3215())); 

// *
//  INITIALIZE WS-2-15B-S WS-2-15B-T
          methodOut.getBS215().initialize();
          methodOut.getBT215().initialize();
//  MOVE ALL 'ABCD' TO WS-2-15B-S-FLD1
          methodOut.setBSFld1215(CONSTANTS.LITERAL_ABCDABCDABCDABCDABCDABCDABCDABCD);
//  MOVE ALL 'ZYXW' TO WS-2-15B-S-FLD2
          methodOut.setBSFld2215(CONSTANTS.LITERAL_645286444);
//  MOVE ALL 'MNOP' TO WS-2-15B-T-FLD3
          methodOut.setBTFld3215(CONSTANTS.LITERAL_MNOPMNOPMNOPMNOPMNOPMNOPMNOPMNOP);
//  MOVE LENGTH OF WS-2-15B-S TO WS-2-S-LEN
          methodOut.setSLen2((short) BS215.getBS215FieldLength());
//  MOVE LENGTH OF WS-2-15B-T TO WS-2-T-LEN
          methodOut.setTLen2((short) BT215.getBT215FieldLength());
//  SUBTRACT 3 FROM WS-2-S-LEN
          methodOut.setSLen2( (short) (methodOut.getSLen2()-(short)3));
//  SUBTRACT 5 FROM WS-2-T-LEN
          methodOut.setTLen2( (short) (methodOut.getTLen2()-(short)5));
//  MOVE WS-2-15B-S ( WS-THREE : WS-2-S-LEN ) TO WS-2-15B-T ( WS-FIVE : WS-2-T-LEN )
          methodOut.getBT215().replace(methodIn.getBSGrp215()/*parent*/,3+methodIn.getThree() - 1/*fromOffset - (bT215) */,methodOut.getSLen2()/*fromLen*/,0+methodIn.getFive() - 1/*toOffset - (bS215) */,methodOut.getTLen2()/*toLen*/);

// *
//  DISPLAY '*461* WS-2-15B-S-GRP   = (' WS-2-15B-S-GRP ')'
          logger.info("*461* WS-2-15B-S-GRP   = ({})", methodIn.getBSGrp215().toString()); 
//  DISPLAY '*462* WS-2-15B-S       = (' WS-2-15B-S ')'
          logger.info("*462* WS-2-15B-S       = ({})", methodOut.getBS215().toString()); 
//  DISPLAY '*463*   WS-2-15B-S-FLD1= (' WS-2-15B-S-FLD1 ')'
          logger.info("*463*   WS-2-15B-S-FLD1= ({})", new String(methodOut.getBSFld1215())); 
//  DISPLAY '*464*   WS-2-15B-S-FLD2= (' WS-2-15B-S-FLD2 ')'
          logger.info("*464*   WS-2-15B-S-FLD2= ({})", new String(methodOut.getBSFld2215())); 
//  DISPLAY '*465* WS-2-15B-T       = (' WS-2-15B-T ')'
          logger.info("*465* WS-2-15B-T       = ({})", methodOut.getBT215().toString()); 
//  DISPLAY '*466*   WS-2-15B-T-FLD1= (' WS-2-15B-T-FLD1 ')'
          logger.info("*466*   WS-2-15B-T-FLD1= ({})", new String(methodOut.getBTFld1215())); 
//  DISPLAY '*467*   WS-2-15B-T-FLD2= (' WS-2-15B-T-FLD2 ')'
          logger.info("*467*   WS-2-15B-T-FLD2= ({})", new String(methodOut.getBTFld2215())); 
//  DISPLAY '*468*   WS-2-15B-T-FLD3= (' WS-2-15B-T-FLD3 ')'
          logger.info("*468*   WS-2-15B-T-FLD3= ({})", new String(methodOut.getBTFld3215())); 

// *
// * Src -> string; tgt -> group ; src bigger than tgt
// *    src offset 3  ;target offset 0
// *
//  INITIALIZE WS-2-16A-S WS-2-16A-T
          methodOut.setAS216(CONSTANTS.SPACE_70 /* Fill 70 Spaces*/);
          methodOut.getAT216().initialize();
//  MOVE ALL 'ABCD' TO WS-2-16A-S
          methodOut.setAS216(CONSTANTS.LITERAL_1222519919);
//  MOVE WS-2-16A-S ( WS-THREE : LENGTH OF WS-2-16A-S - 3 ) TO WS-2-16A-T ( WS-FIVE : LENGTH OF WS-2-16A-T - 5)
          methodOut.getAT216().replace(methodIn.getASGrp216()/*parent*/,3+methodIn.getThree() - 1/*fromOffset - (aT216) */,A_S_216_LENGTH - 3/*fromLen*/,0+methodIn.getFive() - 1/*toOffset - (aS216) */,AT216.getAT216FieldLength() - 5/*toLen*/);

// *
//  DISPLAY '*469* WS-2-16A-S-GRP   = (' WS-2-16A-S-GRP ')'
          logger.info("*469* WS-2-16A-S-GRP   = ({})", methodIn.getASGrp216().toString()); 
//  DISPLAY '*470* WS-2-16A-S       = (' WS-2-16A-S ')'
          logger.info("*470* WS-2-16A-S       = ({})", new String(methodOut.getAS216())); 
//  DISPLAY '*471* WS-2-16A-T       = (' WS-2-16A-T ')'
          logger.info("*471* WS-2-16A-T       = ({})", methodOut.getAT216().toString()); 
//  DISPLAY '*472*   WS-2-16A-T-FLD1= (' WS-2-16A-T-FLD1 ')'
          logger.info("*472*   WS-2-16A-T-FLD1= ({})", new String(methodOut.getATFld1216())); 
//  DISPLAY '*473*   WS-2-16A-T-FLD2= (' WS-2-16A-T-FLD2 ')'
          logger.info("*473*   WS-2-16A-T-FLD2= ({})", new String(methodOut.getATFld2216())); 

// *
//  INITIALIZE WS-2-16A-S WS-2-16A-T
          methodOut.setAS216(CONSTANTS.SPACE_70 /* Fill 70 Spaces*/);
          methodOut.getAT216().initialize();
//  MOVE ALL 'ABCD' TO WS-2-16A-S
          methodOut.setAS216(CONSTANTS.LITERAL_1222519919);
//  MOVE LENGTH OF WS-2-16A-S TO WS-2-S-LEN
          methodOut.setSLen2((short) A_S_216_LENGTH);
//  MOVE LENGTH OF WS-2-16A-T TO WS-2-T-LEN
          methodOut.setTLen2((short) AT216.getAT216FieldLength());
//  SUBTRACT 3 FROM WS-2-S-LEN
          methodOut.setSLen2( (short) (methodOut.getSLen2()-(short)3));
//  SUBTRACT 5 FROM WS-2-T-LEN
          methodOut.setTLen2( (short) (methodOut.getTLen2()-(short)5));
      
      return methodOut;
      }
      /**
      * mainlineSplit17 
      *   This method is derived from 
  *   COBOL Paragraph - MAINLINE-SPLIT17 COBOL Cyclomatic complexity - 1
      * Input  :  

      * - aS216                          COBOL Name: WS-2-16A-S
      * - aSGrp216                       COBOL Name: WS-2-16A-S-GRP
      * - bSGrp216                       COBOL Name: WS-2-16B-S-GRP
      * - aTGrp217                       COBOL Name: WS-2-17A-T-GRP
      *
      * Output :  

      * - aT216                          COBOL Name: WS-2-16A-T
      * - aS216                          COBOL Name: WS-2-16A-S
      * - aTFld1216                      COBOL Name: WS-2-16A-T-FLD1
      * - aTFld2216                      COBOL Name: WS-2-16A-T-FLD2
      * - bS216                          COBOL Name: WS-2-16B-S
      * - bT216                          COBOL Name: WS-2-16B-T
      * - bTFld3216                      COBOL Name: WS-2-16B-T-FLD3
      * - bTFld1216                      COBOL Name: WS-2-16B-T-FLD1
      * - bTFld2216                      COBOL Name: WS-2-16B-T-FLD2
      * - sLen2                          COBOL Name: WS-2-S-LEN
      * - tLen2                          COBOL Name: WS-2-T-LEN
      * - aS217                          COBOL Name: WS-2-17A-S
      * - aT217                          COBOL Name: WS-2-17A-T
      * - aSFld1217                      COBOL Name: WS-2-17A-S-FLD1
      * - aSFld2217                      COBOL Name: WS-2-17A-S-FLD2
      * - aTFld1217                      COBOL Name: WS-2-17A-T-FLD1
      * - aTFld2217                      COBOL Name: WS-2-17A-T-FLD2
      *
      * @throws CFException
      */
      @Override
      public MainlineSplit17OutCtx mainlineSplit17(MainlineSplit17InCtx methodIn) throws Exception {
			// Declare local variables used in the method
			 final int B_S_216_LENGTH = 70;
			// End of variable declaration

Refmod3Ctx programCtx = methodIn.getRefmod3Ctx();
MainlineSplit17OutCtx methodOut = methodIn.getMainlineSplit17OutCtx();
//  MOVE WS-2-16A-S ( WS-THREE : WS-2-S-LEN ) TO WS-2-16A-T ( WS-FIVE : WS-2-T-LEN )
          methodOut.getAT216().replace(methodIn.getASGrp216()/*parent*/,3+methodIn.getThree() - 1/*fromOffset - (aT216) */,methodOut.getSLen2()/*fromLen*/,0+methodIn.getFive() - 1/*toOffset - (aS216) */,methodOut.getTLen2()/*toLen*/);

// *
//  DISPLAY '*474* WS-2-16A-S-GRP   = (' WS-2-16A-S-GRP ')'
          logger.info("*474* WS-2-16A-S-GRP   = ({})", methodIn.getASGrp216().toString()); 
//  DISPLAY '*475* WS-2-16A-S       = (' WS-2-16A-S ')'
          logger.info("*475* WS-2-16A-S       = ({})", new String(methodOut.getAS216())); 
//  DISPLAY '*476* WS-2-16A-T       = (' WS-2-16A-T ')'
          logger.info("*476* WS-2-16A-T       = ({})", methodOut.getAT216().toString()); 
//  DISPLAY '*477*   WS-2-16A-T-FLD1= (' WS-2-16A-T-FLD1 ')'
          logger.info("*477*   WS-2-16A-T-FLD1= ({})", new String(methodOut.getATFld1216())); 
//  DISPLAY '*478*   WS-2-16A-T-FLD2= (' WS-2-16A-T-FLD2 ')'
          logger.info("*478*   WS-2-16A-T-FLD2= ({})", new String(methodOut.getATFld2216())); 

// *
// * Src -> string; tgt -> group ; src smaller than tgt
// *    src offset 3  ;target offset 0
// *
//  INITIALIZE WS-2-16B-S WS-2-16B-T
          methodOut.setBS216(CONSTANTS.SPACE_70 /* Fill 70 Spaces*/);
          methodOut.getBT216().initialize();
//  MOVE ALL 'ABCD' TO WS-2-16B-S
          methodOut.setBS216(CONSTANTS.LITERAL_1222519919);
//  MOVE ALL 'MNOP' TO WS-2-16B-T-FLD3
          methodOut.setBTFld3216(CONSTANTS.LITERAL_MNOPMNOPMNOPMNOPMNOPMNOPMNOPMNOP);
//  MOVE WS-2-16B-S ( WS-THREE : LENGTH OF WS-2-16B-S - 3 ) TO WS-2-16B-T ( WS-FIVE : LENGTH OF WS-2-16B-T - 5)
          methodOut.getBT216().replace(methodIn.getBSGrp216()/*parent*/,3+methodIn.getThree() - 1/*fromOffset - (bT216) */,B_S_216_LENGTH - 3/*fromLen*/,0+methodIn.getFive() - 1/*toOffset - (bS216) */,BT216.getBT216FieldLength() - 5/*toLen*/);

// *
//  DISPLAY '*479* WS-2-16B-S-GRP   = (' WS-2-16B-S-GRP ')'
          logger.info("*479* WS-2-16B-S-GRP   = ({})", methodIn.getBSGrp216().toString()); 
//  DISPLAY '*480* WS-2-16B-S       = (' WS-2-16B-S ')'
          logger.info("*480* WS-2-16B-S       = ({})", new String(methodOut.getBS216())); 
//  DISPLAY '*481* WS-2-16B-T       = (' WS-2-16B-T ')'
          logger.info("*481* WS-2-16B-T       = ({})", methodOut.getBT216().toString()); 
//  DISPLAY '*482*   WS-2-16B-T-FLD1= (' WS-2-16B-T-FLD1 ')'
          logger.info("*482*   WS-2-16B-T-FLD1= ({})", new String(methodOut.getBTFld1216())); 
//  DISPLAY '*483*   WS-2-16B-T-FLD2= (' WS-2-16B-T-FLD2 ')'
          logger.info("*483*   WS-2-16B-T-FLD2= ({})", new String(methodOut.getBTFld2216())); 
//  DISPLAY '*484*   WS-2-16B-T-FLD3= (' WS-2-16B-T-FLD3 ')'
          logger.info("*484*   WS-2-16B-T-FLD3= ({})", new String(methodOut.getBTFld3216())); 

// *
//  INITIALIZE WS-2-16B-S WS-2-16B-T
          methodOut.setBS216(CONSTANTS.SPACE_70 /* Fill 70 Spaces*/);
          methodOut.getBT216().initialize();
//  MOVE ALL 'ABCD' TO WS-2-16B-S
          methodOut.setBS216(CONSTANTS.LITERAL_1222519919);
//  MOVE ALL 'MNOP' TO WS-2-16B-T-FLD3
          methodOut.setBTFld3216(CONSTANTS.LITERAL_MNOPMNOPMNOPMNOPMNOPMNOPMNOPMNOP);
//  MOVE LENGTH OF WS-2-16B-S TO WS-2-S-LEN
          methodOut.setSLen2((short) B_S_216_LENGTH);
//  MOVE LENGTH OF WS-2-16B-T TO WS-2-T-LEN
          methodOut.setTLen2((short) BT216.getBT216FieldLength());
//  SUBTRACT 3 FROM WS-2-S-LEN
          methodOut.setSLen2( (short) (methodOut.getSLen2()-(short)3));
//  SUBTRACT 5 FROM WS-2-T-LEN
          methodOut.setTLen2( (short) (methodOut.getTLen2()-(short)5));
//  MOVE WS-2-16B-S ( WS-THREE : WS-2-S-LEN ) TO WS-2-16B-T ( WS-FIVE : WS-2-T-LEN )
          methodOut.getBT216().replace(methodIn.getBSGrp216()/*parent*/,3+methodIn.getThree() - 1/*fromOffset - (bT216) */,methodOut.getSLen2()/*fromLen*/,0+methodIn.getFive() - 1/*toOffset - (bS216) */,methodOut.getTLen2()/*toLen*/);

// *
//  DISPLAY '*485* WS-2-16B-S-GRP   = (' WS-2-16B-S-GRP ')'
          logger.info("*485* WS-2-16B-S-GRP   = ({})", methodIn.getBSGrp216().toString()); 
//  DISPLAY '*486* WS-2-16B-S       = (' WS-2-16B-S ')'
          logger.info("*486* WS-2-16B-S       = ({})", new String(methodOut.getBS216())); 
//  DISPLAY '*487* WS-2-16B-T       = (' WS-2-16B-T ')'
          logger.info("*487* WS-2-16B-T       = ({})", methodOut.getBT216().toString()); 
//  DISPLAY '*488*   WS-2-16B-T-FLD1= (' WS-2-16B-T-FLD1 ')'
          logger.info("*488*   WS-2-16B-T-FLD1= ({})", new String(methodOut.getBTFld1216())); 
//  DISPLAY '*489*   WS-2-16B-T-FLD2= (' WS-2-16B-T-FLD2 ')'
          logger.info("*489*   WS-2-16B-T-FLD2= ({})", new String(methodOut.getBTFld2216())); 
//  DISPLAY '*490*   WS-2-16B-T-FLD3= (' WS-2-16B-T-FLD3 ')'
          logger.info("*490*   WS-2-16B-T-FLD3= ({})", new String(methodOut.getBTFld3216())); 

// *
// * Src -> group; tgt -> group ; src bigger than tgt
// *    src offset 0  ;target offset 5
// *
//  INITIALIZE WS-2-17A-S WS-2-17A-T
          methodOut.getAS217().initialize();
          methodOut.getAT217().initialize();
//  MOVE ALL 'ABCD' TO WS-2-17A-S-FLD1
          methodOut.setASFld1217(CONSTANTS.LITERAL_ABCDABCDABCDABCDABCDABCDABCDABCD);
//  MOVE ALL 'ZYXW' TO WS-2-17A-S-FLD2
          methodOut.setASFld2217(CONSTANTS.LITERAL_645286444);
//  MOVE WS-2-17A-S ( WS-THREE : LENGTH OF WS-2-17A-S - 3 ) TO WS-2-17A-T ( WS-FIVE : LENGTH OF WS-2-17A-T - 5)
          methodOut.getAT217().replace(methodOut.getAS217(),(methodIn.getThree()-1),AS217.getAS217FieldLength() - 3, (methodOut.getAT217().begin + (methodIn.getFive()-1)) ,AT217.getAT217FieldLength() - 5 /* replace,sourceIndex,sourceLen,targetIndex,targetLen */);

// *
//  DISPLAY '*491* WS-2-17A-S       = (' WS-2-17A-S ')'
          logger.info("*491* WS-2-17A-S       = ({})", methodOut.getAS217().toString()); 
//  DISPLAY '*492*   WS-2-17A-S-FLD1= (' WS-2-17A-S-FLD1 ')'
          logger.info("*492*   WS-2-17A-S-FLD1= ({})", new String(methodOut.getASFld1217())); 
//  DISPLAY '*493*   WS-2-17A-S-FLD2= (' WS-2-17A-S-FLD2 ')'
          logger.info("*493*   WS-2-17A-S-FLD2= ({})", new String(methodOut.getASFld2217())); 
//  DISPLAY '*494* WS-2-17A-T-GRP   = (' WS-2-17A-T-GRP ')'
          logger.info("*494* WS-2-17A-T-GRP   = ({})", methodOut.getATGrp217().toString()); 
//  DISPLAY '*495* WS-2-17A-T       = (' WS-2-17A-T ')'
          logger.info("*495* WS-2-17A-T       = ({})", methodOut.getAT217().toString()); 
//  DISPLAY '*496*   WS-2-17A-T-FLD1= (' WS-2-17A-T-FLD1 ')'
          logger.info("*496*   WS-2-17A-T-FLD1= ({})", new String(methodOut.getATFld1217())); 
//  DISPLAY '*497*   WS-2-17A-T-FLD2= (' WS-2-17A-T-FLD2 ')'
          logger.info("*497*   WS-2-17A-T-FLD2= ({})", new String(methodOut.getATFld2217())); 

// *
//  INITIALIZE WS-2-17A-S WS-2-17A-T
          methodOut.getAS217().initialize();
          methodOut.getAT217().initialize();
//  MOVE ALL 'ABCD' TO WS-2-17A-S-FLD1
          methodOut.setASFld1217(CONSTANTS.LITERAL_ABCDABCDABCDABCDABCDABCDABCDABCD);
//  MOVE ALL 'ZYXW' TO WS-2-17A-S-FLD2
          methodOut.setASFld2217(CONSTANTS.LITERAL_645286444);
//  MOVE LENGTH OF WS-2-17A-S TO WS-2-S-LEN
          methodOut.setSLen2((short) AS217.getAS217FieldLength());
//  MOVE LENGTH OF WS-2-17A-T TO WS-2-T-LEN
          methodOut.setTLen2((short) AT217.getAT217FieldLength());
//  SUBTRACT 3 FROM WS-2-S-LEN
          methodOut.setSLen2( (short) (methodOut.getSLen2()-(short)3));
//  SUBTRACT 5 FROM WS-2-T-LEN
          methodOut.setTLen2( (short) (methodOut.getTLen2()-(short)5));
//  MOVE WS-2-17A-S ( WS-THREE : WS-2-S-LEN ) TO WS-2-17A-T ( WS-FIVE : WS-2-T-LEN )
          methodOut.getAT217().replace(methodOut.getAS217(),(methodIn.getThree()-1),methodOut.getSLen2(), (methodOut.getAT217().begin + (methodIn.getFive()-1)) ,methodOut.getTLen2() /* replace,sourceIndex,sourceLen,targetIndex,targetLen */);

// *
//  DISPLAY '*498* WS-2-17A-S       = (' WS-2-17A-S ')'
          logger.info("*498* WS-2-17A-S       = ({})", methodOut.getAS217().toString()); 
//  DISPLAY '*499*   WS-2-17A-S-FLD1= (' WS-2-17A-S-FLD1 ')'
          logger.info("*499*   WS-2-17A-S-FLD1= ({})", new String(methodOut.getASFld1217())); 
      
      return methodOut;
      }
      /**
      * mainlineSplit18 
      *   This method is derived from 
  *   COBOL Paragraph - MAINLINE-SPLIT18 COBOL Cyclomatic complexity - 1
      * Input  :  

      * - aSFld2217                      COBOL Name: WS-2-17A-S-FLD2
      * - aTGrp217                       COBOL Name: WS-2-17A-T-GRP
      * - aT217                          COBOL Name: WS-2-17A-T
      * - aTFld1217                      COBOL Name: WS-2-17A-T-FLD1
      * - aTFld2217                      COBOL Name: WS-2-17A-T-FLD2
      * - bTGrp217                       COBOL Name: WS-2-17B-T-GRP
      * - aTGrp218                       COBOL Name: WS-2-18A-T-GRP
      *
      * Output :  

      * - bS217                          COBOL Name: WS-2-17B-S
      * - bT217                          COBOL Name: WS-2-17B-T
      * - bSFld1217                      COBOL Name: WS-2-17B-S-FLD1
      * - bSFld2217                      COBOL Name: WS-2-17B-S-FLD2
      * - bTFld3217                      COBOL Name: WS-2-17B-T-FLD3
      * - bTFld1217                      COBOL Name: WS-2-17B-T-FLD1
      * - bTFld2217                      COBOL Name: WS-2-17B-T-FLD2
      * - sLen2                          COBOL Name: WS-2-S-LEN
      * - tLen2                          COBOL Name: WS-2-T-LEN
      * - aS218                          COBOL Name: WS-2-18A-S
      * - aT218                          COBOL Name: WS-2-18A-T
      * - aTFld1218                      COBOL Name: WS-2-18A-T-FLD1
      * - aTFld2218                      COBOL Name: WS-2-18A-T-FLD2
      *
      * @throws CFException
      */
      @Override
      public MainlineSplit18OutCtx mainlineSplit18(MainlineSplit18InCtx methodIn) throws Exception {
			// Declare local variables used in the method
			 final int A_S_218_LENGTH = 70;
			// End of variable declaration

Refmod3Ctx programCtx = methodIn.getRefmod3Ctx();
MainlineSplit18OutCtx methodOut = methodIn.getMainlineSplit18OutCtx();
//  DISPLAY '*500*   WS-2-17A-S-FLD2= (' WS-2-17A-S-FLD2 ')'
          logger.info("*500*   WS-2-17A-S-FLD2= ({})", new String(methodIn.getASFld2217())); 
//  DISPLAY '*501* WS-2-17A-T-GRP   = (' WS-2-17A-T-GRP ')'
          logger.info("*501* WS-2-17A-T-GRP   = ({})", methodIn.getATGrp217().toString()); 
//  DISPLAY '*502* WS-2-17A-T       = (' WS-2-17A-T ')'
          logger.info("*502* WS-2-17A-T       = ({})", methodIn.getAT217().toString()); 
//  DISPLAY '*503*   WS-2-17A-T-FLD1= (' WS-2-17A-T-FLD1 ')'
          logger.info("*503*   WS-2-17A-T-FLD1= ({})", new String(methodIn.getATFld1217())); 
//  DISPLAY '*504*   WS-2-17A-T-FLD2= (' WS-2-17A-T-FLD2 ')'
          logger.info("*504*   WS-2-17A-T-FLD2= ({})", new String(methodIn.getATFld2217())); 

// *
// * Src -> group; tgt -> group ; src smaller than tgt
// *    src offset 0  ;target offset 5
// *
//  INITIALIZE WS-2-17B-S WS-2-17B-T
          methodOut.getBS217().initialize();
          methodOut.getBT217().initialize();
//  MOVE ALL 'ABCD' TO WS-2-17B-S-FLD1
          methodOut.setBSFld1217(CONSTANTS.LITERAL_ABCDABCDABCDABCDABCDABCDABCDABCD);
//  MOVE ALL 'ZYXW' TO WS-2-17B-S-FLD2
          methodOut.setBSFld2217(CONSTANTS.LITERAL_645286444);
//  MOVE ALL 'MNOP' TO WS-2-17B-T-FLD3
          methodOut.setBTFld3217(CONSTANTS.LITERAL_MNOPMNOPMNOPMNOPMNOPMNOPMNOPMNOP);
//  MOVE WS-2-17B-S ( WS-THREE : LENGTH OF WS-2-17B-S - 3 ) TO WS-2-17B-T ( WS-FIVE : LENGTH OF WS-2-17B-T - 5)
          methodOut.getBT217().replace(methodOut.getBS217(),(methodIn.getThree()-1),BS217.getBS217FieldLength() - 3, (methodOut.getBT217().begin + (methodIn.getFive()-1)) ,BT217.getBT217FieldLength() - 5 /* replace,sourceIndex,sourceLen,targetIndex,targetLen */);

// *
//  DISPLAY '*505* WS-2-17B-S       = (' WS-2-17B-S ')'
          logger.info("*505* WS-2-17B-S       = ({})", methodOut.getBS217().toString()); 
//  DISPLAY '*506*   WS-2-17B-S-FLD1= (' WS-2-17B-S-FLD1 ')'
          logger.info("*506*   WS-2-17B-S-FLD1= ({})", new String(methodOut.getBSFld1217())); 
//  DISPLAY '*507*   WS-2-17B-S-FLD2= (' WS-2-17B-S-FLD2 ')'
          logger.info("*507*   WS-2-17B-S-FLD2= ({})", new String(methodOut.getBSFld2217())); 
//  DISPLAY '*508* WS-2-17B-T-GRP   = (' WS-2-17B-T-GRP ')'
          logger.info("*508* WS-2-17B-T-GRP   = ({})", methodOut.getBTGrp217().toString()); 
//  DISPLAY '*509* WS-2-17B-T       = (' WS-2-17B-T ')'
          logger.info("*509* WS-2-17B-T       = ({})", methodOut.getBT217().toString()); 
//  DISPLAY '*510*   WS-2-17B-T-FLD1= (' WS-2-17B-T-FLD1 ')'
          logger.info("*510*   WS-2-17B-T-FLD1= ({})", new String(methodOut.getBTFld1217())); 
//  DISPLAY '*511*   WS-2-17B-T-FLD2= (' WS-2-17B-T-FLD2 ')'
          logger.info("*511*   WS-2-17B-T-FLD2= ({})", new String(methodOut.getBTFld2217())); 
//  DISPLAY '*512*   WS-2-17B-T-FLD3= (' WS-2-17B-T-FLD3 ')'
          logger.info("*512*   WS-2-17B-T-FLD3= ({})", new String(methodOut.getBTFld3217())); 

// *
//  INITIALIZE WS-2-17B-S WS-2-17B-T
          methodOut.getBS217().initialize();
          methodOut.getBT217().initialize();
//  MOVE ALL 'ABCD' TO WS-2-17B-S-FLD1
          methodOut.setBSFld1217(CONSTANTS.LITERAL_ABCDABCDABCDABCDABCDABCDABCDABCD);
//  MOVE ALL 'ZYXW' TO WS-2-17B-S-FLD2
          methodOut.setBSFld2217(CONSTANTS.LITERAL_645286444);
//  MOVE ALL 'MNOP' TO WS-2-17B-T-FLD3
          methodOut.setBTFld3217(CONSTANTS.LITERAL_MNOPMNOPMNOPMNOPMNOPMNOPMNOPMNOP);
//  MOVE LENGTH OF WS-2-17B-S TO WS-2-S-LEN
          methodOut.setSLen2((short) BS217.getBS217FieldLength());
//  MOVE LENGTH OF WS-2-17B-T TO WS-2-T-LEN
          methodOut.setTLen2((short) BT217.getBT217FieldLength());
//  SUBTRACT 3 FROM WS-2-S-LEN
          methodOut.setSLen2( (short) (methodOut.getSLen2()-(short)3));
//  SUBTRACT 5 FROM WS-2-T-LEN
          methodOut.setTLen2( (short) (methodOut.getTLen2()-(short)5));
//  MOVE WS-2-17B-S ( WS-THREE : WS-2-S-LEN ) TO WS-2-17B-T ( WS-FIVE : WS-2-T-LEN )
          methodOut.getBT217().replace(methodOut.getBS217(),(methodIn.getThree()-1),methodOut.getSLen2(), (methodOut.getBT217().begin + (methodIn.getFive()-1)) ,methodOut.getTLen2() /* replace,sourceIndex,sourceLen,targetIndex,targetLen */);

// *
//  DISPLAY '*513* WS-2-17B-S       = (' WS-2-17B-S ')'
          logger.info("*513* WS-2-17B-S       = ({})", methodOut.getBS217().toString()); 
//  DISPLAY '*514*   WS-2-17B-S-FLD1= (' WS-2-17B-S-FLD1 ')'
          logger.info("*514*   WS-2-17B-S-FLD1= ({})", new String(methodOut.getBSFld1217())); 
//  DISPLAY '*515*   WS-2-17B-S-FLD2= (' WS-2-17B-S-FLD2 ')'
          logger.info("*515*   WS-2-17B-S-FLD2= ({})", new String(methodOut.getBSFld2217())); 
//  DISPLAY '*516* WS-2-17B-T-GRP   = (' WS-2-17B-T-GRP ')'
          logger.info("*516* WS-2-17B-T-GRP   = ({})", methodOut.getBTGrp217().toString()); 
//  DISPLAY '*517* WS-2-17B-T       = (' WS-2-17B-T ')'
          logger.info("*517* WS-2-17B-T       = ({})", methodOut.getBT217().toString()); 
//  DISPLAY '*518*   WS-2-17B-T-FLD1= (' WS-2-17B-T-FLD1 ')'
          logger.info("*518*   WS-2-17B-T-FLD1= ({})", new String(methodOut.getBTFld1217())); 
//  DISPLAY '*519*   WS-2-17B-T-FLD2= (' WS-2-17B-T-FLD2 ')'
          logger.info("*519*   WS-2-17B-T-FLD2= ({})", new String(methodOut.getBTFld2217())); 
//  DISPLAY '*520*   WS-2-17B-T-FLD3= (' WS-2-17B-T-FLD3 ')'
          logger.info("*520*   WS-2-17B-T-FLD3= ({})", new String(methodOut.getBTFld3217())); 

// *
// * Src -> string; tgt -> group ; src bigger than tgt
// *    src offset 0  ;target offset 5
// *
//  INITIALIZE WS-2-18A-S WS-2-18A-T
          methodOut.setAS218(CONSTANTS.SPACE_70 /* Fill 70 Spaces*/);
          methodOut.getAT218().initialize();
          // MOVE ALL 'ABCD' TO WS-2-18A-S
          methodOut.setAS218(CONSTANTS.LITERAL_1222519919);
//  MOVE WS-2-18A-S ( WS-THREE : LENGTH OF WS-2-18A-S - 3 ) TO WS-2-18A-T ( WS-FIVE : LENGTH OF WS-2-18A-T - 5)
          methodOut.getAT218().replace(methodOut.getAS218(),(methodIn.getThree()-1)/* aS218 */ ,A_S_218_LENGTH - 3, (methodOut.getAT218().begin + (methodIn.getFive()-1)) /* aT218 */,AT218.getAT218FieldLength() - 5 /* replace,startIndex,targetLen */);

// *
//  DISPLAY '*521* WS-2-18A-S       = (' WS-2-18A-S ')'
          logger.info("*521* WS-2-18A-S       = ({})", new String(methodOut.getAS218())); 
//  DISPLAY '*522* WS-2-18A-T-GRP   = (' WS-2-18A-T-GRP ')'
          logger.info("*522* WS-2-18A-T-GRP   = ({})", methodOut.getATGrp218().toString()); 
//  DISPLAY '*523* WS-2-18A-T       = (' WS-2-18A-T ')'
          logger.info("*523* WS-2-18A-T       = ({})", methodOut.getAT218().toString()); 
//  DISPLAY '*524*   WS-2-18A-T-FLD1= (' WS-2-18A-T-FLD1 ')'
          logger.info("*524*   WS-2-18A-T-FLD1= ({})", new String(methodOut.getATFld1218())); 
//  DISPLAY '*525*   WS-2-18A-T-FLD2= (' WS-2-18A-T-FLD2 ')'
          logger.info("*525*   WS-2-18A-T-FLD2= ({})", new String(methodOut.getATFld2218())); 

// *
//  INITIALIZE WS-2-18A-S WS-2-18A-T
          methodOut.setAS218(CONSTANTS.SPACE_70 /* Fill 70 Spaces*/);
          methodOut.getAT218().initialize();
          // MOVE ALL 'ABCD' TO WS-2-18A-S
          methodOut.setAS218(CONSTANTS.LITERAL_1222519919);
//  MOVE LENGTH OF WS-2-18A-S TO WS-2-S-LEN
          methodOut.setSLen2((short) A_S_218_LENGTH);
//  MOVE LENGTH OF WS-2-18A-T TO WS-2-T-LEN
          methodOut.setTLen2((short) AT218.getAT218FieldLength());
//  SUBTRACT 3 FROM WS-2-S-LEN
          methodOut.setSLen2( (short) (methodOut.getSLen2()-(short)3));
//  SUBTRACT 5 FROM WS-2-T-LEN
          methodOut.setTLen2( (short) (methodOut.getTLen2()-(short)5));
//  MOVE WS-2-18A-S ( WS-THREE : WS-2-S-LEN ) TO WS-2-18A-T ( WS-FIVE : WS-2-T-LEN )
          methodOut.getAT218().replace(methodOut.getAS218(),(methodIn.getThree()-1)/* aS218 */ ,methodOut.getSLen2(), (methodOut.getAT218().begin + (methodIn.getFive()-1)) /* aT218 */,methodOut.getTLen2() /* replace,startIndex,targetLen */);

// *
//  DISPLAY '*526* WS-2-18A-S       = (' WS-2-18A-S ')'
          logger.info("*526* WS-2-18A-S       = ({})", new String(methodOut.getAS218())); 
      
      return methodOut;
      }
      /**
      * mainlineSplit19 
      *   This method is derived from 
  *   COBOL Paragraph - MAINLINE-SPLIT19 COBOL Cyclomatic complexity - 1
      * Input  :  

      * - aTGrp218                       COBOL Name: WS-2-18A-T-GRP
      * - aT218                          COBOL Name: WS-2-18A-T
      * - aTFld1218                      COBOL Name: WS-2-18A-T-FLD1
      * - aTFld2218                      COBOL Name: WS-2-18A-T-FLD2
      * - bTGrp218                       COBOL Name: WS-2-18B-T-GRP
      * - aTGrp219                       COBOL Name: WS-2-19A-T-GRP
      *
      * Output :  

      * - bS218                          COBOL Name: WS-2-18B-S
      * - bT218                          COBOL Name: WS-2-18B-T
      * - bTFld3218                      COBOL Name: WS-2-18B-T-FLD3
      * - bTFld1218                      COBOL Name: WS-2-18B-T-FLD1
      * - bTFld2218                      COBOL Name: WS-2-18B-T-FLD2
      * - sLen2                          COBOL Name: WS-2-S-LEN
      * - tLen2                          COBOL Name: WS-2-T-LEN
      * - aS219                          COBOL Name: WS-2-19A-S
      * - aT219                          COBOL Name: WS-2-19A-T
      * - aSFld1219                      COBOL Name: WS-2-19A-S-FLD1
      * - aSFld2219                      COBOL Name: WS-2-19A-S-FLD2
      * - aTFld1219                      COBOL Name: WS-2-19A-T-FLD1
      * - aTFld2219                      COBOL Name: WS-2-19A-T-FLD2
      *
      * @throws CFException
      */
      @Override
      public MainlineSplit19OutCtx mainlineSplit19(MainlineSplit19InCtx methodIn) throws Exception {
			// Declare local variables used in the method
			 final int B_S_218_LENGTH = 70;
			// End of variable declaration

Refmod3Ctx programCtx = methodIn.getRefmod3Ctx();
MainlineSplit19OutCtx methodOut = methodIn.getMainlineSplit19OutCtx();
//  DISPLAY '*527* WS-2-18A-T-GRP   = (' WS-2-18A-T-GRP ')'
          logger.info("*527* WS-2-18A-T-GRP   = ({})", methodIn.getATGrp218().toString()); 
//  DISPLAY '*528* WS-2-18A-T       = (' WS-2-18A-T ')'
          logger.info("*528* WS-2-18A-T       = ({})", methodIn.getAT218().toString()); 
//  DISPLAY '*529*   WS-2-18A-T-FLD1= (' WS-2-18A-T-FLD1 ')'
          logger.info("*529*   WS-2-18A-T-FLD1= ({})", new String(methodIn.getATFld1218())); 
//  DISPLAY '*530*   WS-2-18A-T-FLD2= (' WS-2-18A-T-FLD2 ')'
          logger.info("*530*   WS-2-18A-T-FLD2= ({})", new String(methodIn.getATFld2218())); 

// *
// * Src -> string; tgt -> group ; src smaller than tgt
// *    src offset 0  ;target offset 5
// *
//  INITIALIZE WS-2-18B-S WS-2-18B-T
          methodOut.setBS218(CONSTANTS.SPACE_70 /* Fill 70 Spaces*/);
          methodOut.getBT218().initialize();
          // MOVE ALL 'ABCD' TO WS-2-18B-S
          methodOut.setBS218(CONSTANTS.LITERAL_1222519919);
//  MOVE ALL 'MNOP' TO WS-2-18B-T-FLD3
          methodOut.setBTFld3218(CONSTANTS.LITERAL_MNOPMNOPMNOPMNOPMNOPMNOPMNOPMNOP);
//  MOVE WS-2-18B-S ( WS-THREE : LENGTH OF WS-2-18B-S - 3 ) TO WS-2-18B-T ( WS-FIVE : LENGTH OF WS-2-18B-T - 5)
          methodOut.getBT218().replace(methodOut.getBS218(),(methodIn.getThree()-1)/* bS218 */ ,B_S_218_LENGTH - 3, (methodOut.getBT218().begin + (methodIn.getFive()-1)) /* bT218 */,BT218.getBT218FieldLength() - 5 /* replace,startIndex,targetLen */);

// *
//  DISPLAY '*531* WS-2-18B-S       = (' WS-2-18B-S ')'
          logger.info("*531* WS-2-18B-S       = ({})", new String(methodOut.getBS218())); 
//  DISPLAY '*532* WS-2-18B-T-GRP   = (' WS-2-18B-T-GRP ')'
          logger.info("*532* WS-2-18B-T-GRP   = ({})", methodOut.getBTGrp218().toString()); 
//  DISPLAY '*533* WS-2-18B-T       = (' WS-2-18B-T ')'
          logger.info("*533* WS-2-18B-T       = ({})", methodOut.getBT218().toString()); 
//  DISPLAY '*534*   WS-2-18B-T-FLD1= (' WS-2-18B-T-FLD1 ')'
          logger.info("*534*   WS-2-18B-T-FLD1= ({})", new String(methodOut.getBTFld1218())); 
//  DISPLAY '*535*   WS-2-18B-T-FLD2= (' WS-2-18B-T-FLD2 ')'
          logger.info("*535*   WS-2-18B-T-FLD2= ({})", new String(methodOut.getBTFld2218())); 
//  DISPLAY '*536*   WS-2-18B-T-FLD3= (' WS-2-18B-T-FLD3 ')'
          logger.info("*536*   WS-2-18B-T-FLD3= ({})", new String(methodOut.getBTFld3218())); 

// *
//  INITIALIZE WS-2-18B-S WS-2-18B-T
          methodOut.setBS218(CONSTANTS.SPACE_70 /* Fill 70 Spaces*/);
          methodOut.getBT218().initialize();
          // MOVE ALL 'ABCD' TO WS-2-18B-S
          methodOut.setBS218(CONSTANTS.LITERAL_1222519919);
//  MOVE ALL 'MNOP' TO WS-2-18B-T-FLD3
          methodOut.setBTFld3218(CONSTANTS.LITERAL_MNOPMNOPMNOPMNOPMNOPMNOPMNOPMNOP);
//  MOVE LENGTH OF WS-2-18B-S TO WS-2-S-LEN
          methodOut.setSLen2((short) B_S_218_LENGTH);
//  MOVE LENGTH OF WS-2-18B-T TO WS-2-T-LEN
          methodOut.setTLen2((short) BT218.getBT218FieldLength());
//  SUBTRACT 3 FROM WS-2-S-LEN
          methodOut.setSLen2( (short) (methodOut.getSLen2()-(short)3));
//  SUBTRACT 5 FROM WS-2-T-LEN
          methodOut.setTLen2( (short) (methodOut.getTLen2()-(short)5));
//  MOVE WS-2-18B-S ( WS-THREE : WS-2-S-LEN ) TO WS-2-18B-T ( WS-FIVE : WS-2-T-LEN )
          methodOut.getBT218().replace(methodOut.getBS218(),(methodIn.getThree()-1)/* bS218 */ ,methodOut.getSLen2(), (methodOut.getBT218().begin + (methodIn.getFive()-1)) /* bT218 */,methodOut.getTLen2() /* replace,startIndex,targetLen */);

// *
//  DISPLAY '*537* WS-2-18B-S       = (' WS-2-18B-S ')'
          logger.info("*537* WS-2-18B-S       = ({})", new String(methodOut.getBS218())); 
//  DISPLAY '*538* WS-2-18B-T-GRP   = (' WS-2-18B-T-GRP ')'
          logger.info("*538* WS-2-18B-T-GRP   = ({})", methodOut.getBTGrp218().toString()); 
//  DISPLAY '*539* WS-2-18B-T       = (' WS-2-18B-T ')'
          logger.info("*539* WS-2-18B-T       = ({})", methodOut.getBT218().toString()); 
//  DISPLAY '*540*   WS-2-18B-T-FLD1= (' WS-2-18B-T-FLD1 ')'
          logger.info("*540*   WS-2-18B-T-FLD1= ({})", new String(methodOut.getBTFld1218())); 
//  DISPLAY '*541*   WS-2-18B-T-FLD2= (' WS-2-18B-T-FLD2 ')'
          logger.info("*541*   WS-2-18B-T-FLD2= ({})", new String(methodOut.getBTFld2218())); 
//  DISPLAY '*542*   WS-2-18B-T-FLD3= (' WS-2-18B-T-FLD3 ')'
          logger.info("*542*   WS-2-18B-T-FLD3= ({})", new String(methodOut.getBTFld3218())); 

// *
// * Src -> group; tgt -> group ; src bigger than tgt
// *    src not refmod;target offset 5
// *
//  INITIALIZE WS-2-19A-S WS-2-19A-T
          methodOut.getAS219().initialize();
          methodOut.getAT219().initialize();
//  MOVE ALL 'ABCD' TO WS-2-19A-S-FLD1
          methodOut.setASFld1219(CONSTANTS.LITERAL_ABCDABCDABCDABCDABCDABCDABCDABCD);
//  MOVE ALL 'ZYXW' TO WS-2-19A-S-FLD2
          methodOut.setASFld2219(CONSTANTS.LITERAL_645286444);
//  MOVE WS-2-19A-S TO WS-2-19A-T ( WS-FIVE : LENGTH OF WS-2-19A-T - 5)
          methodOut.getAT219().replace(methodOut.getAS219().getCharArray(),0,methodOut.getAS219().length(), (methodOut.getAT219().begin + (methodIn.getFive()-1)) ,AT219.getAT219FieldLength() - 5 /* replace,sourceIndex,sourceLen,targetIndex,targetLen */);

// *
//  DISPLAY '*543* WS-2-19A-S       = (' WS-2-19A-S ')'
          logger.info("*543* WS-2-19A-S       = ({})", methodOut.getAS219().toString()); 
//  DISPLAY '*544*   WS-2-19A-S-FLD1= (' WS-2-19A-S-FLD1 ')'
          logger.info("*544*   WS-2-19A-S-FLD1= ({})", new String(methodOut.getASFld1219())); 
//  DISPLAY '*545*   WS-2-19A-S-FLD2= (' WS-2-19A-S-FLD2 ')'
          logger.info("*545*   WS-2-19A-S-FLD2= ({})", new String(methodOut.getASFld2219())); 
//  DISPLAY '*546* WS-2-19A-T-GRP   = (' WS-2-19A-T-GRP ')'
          logger.info("*546* WS-2-19A-T-GRP   = ({})", methodOut.getATGrp219().toString()); 
//  DISPLAY '*547* WS-2-19A-T       = (' WS-2-19A-T ')'
          logger.info("*547* WS-2-19A-T       = ({})", methodOut.getAT219().toString()); 
//  DISPLAY '*548*   WS-2-19A-T-FLD1= (' WS-2-19A-T-FLD1 ')'
          logger.info("*548*   WS-2-19A-T-FLD1= ({})", new String(methodOut.getATFld1219())); 
//  DISPLAY '*549*   WS-2-19A-T-FLD2= (' WS-2-19A-T-FLD2 ')'
          logger.info("*549*   WS-2-19A-T-FLD2= ({})", new String(methodOut.getATFld2219())); 

// *
//  INITIALIZE WS-2-19A-S WS-2-19A-T
          methodOut.getAS219().initialize();
          methodOut.getAT219().initialize();
//  MOVE ALL 'ABCD' TO WS-2-19A-S-FLD1
          methodOut.setASFld1219(CONSTANTS.LITERAL_ABCDABCDABCDABCDABCDABCDABCDABCD);
//  MOVE ALL 'ZYXW' TO WS-2-19A-S-FLD2
          methodOut.setASFld2219(CONSTANTS.LITERAL_645286444);
//  MOVE LENGTH OF WS-2-19A-T TO WS-2-T-LEN
          methodOut.setTLen2((short) AT219.getAT219FieldLength());
//  SUBTRACT 5 FROM WS-2-T-LEN
          methodOut.setTLen2( (short) (methodOut.getTLen2()-(short)5));
//  MOVE WS-2-19A-S TO WS-2-19A-T ( WS-FIVE : WS-2-T-LEN )
          methodOut.getAT219().replace(methodOut.getAS219().getCharArray(),0,methodOut.getAS219().length(), (methodOut.getAT219().begin + (methodIn.getFive()-1)) ,methodOut.getTLen2() /* replace,sourceIndex,sourceLen,targetIndex,targetLen */);

// *
//  DISPLAY '*550* WS-2-19A-S       = (' WS-2-19A-S ')'
          logger.info("*550* WS-2-19A-S       = ({})", methodOut.getAS219().toString()); 
//  DISPLAY '*551*   WS-2-19A-S-FLD1= (' WS-2-19A-S-FLD1 ')'
          logger.info("*551*   WS-2-19A-S-FLD1= ({})", new String(methodOut.getASFld1219())); 
//  DISPLAY '*552*   WS-2-19A-S-FLD2= (' WS-2-19A-S-FLD2 ')'
          logger.info("*552*   WS-2-19A-S-FLD2= ({})", new String(methodOut.getASFld2219())); 
//  DISPLAY '*553* WS-2-19A-T-GRP   = (' WS-2-19A-T-GRP ')'
          logger.info("*553* WS-2-19A-T-GRP   = ({})", methodOut.getATGrp219().toString()); 
//  DISPLAY '*554* WS-2-19A-T       = (' WS-2-19A-T ')'
          logger.info("*554* WS-2-19A-T       = ({})", methodOut.getAT219().toString()); 
//  DISPLAY '*555*   WS-2-19A-T-FLD1= (' WS-2-19A-T-FLD1 ')'
          logger.info("*555*   WS-2-19A-T-FLD1= ({})", new String(methodOut.getATFld1219())); 
      
      return methodOut;
      }
      /**
      * mainlineSplit20 
      *   This method is derived from 
  *   COBOL Paragraph - MAINLINE-SPLIT20 COBOL Cyclomatic complexity - 1
      * Input  :  

      * - aTFld2219                      COBOL Name: WS-2-19A-T-FLD2
      * - bTGrp219                       COBOL Name: WS-2-19B-T-GRP
      * - aTGrp220                       COBOL Name: WS-2-20A-T-GRP
      *
      * Output :  

      * - bS219                          COBOL Name: WS-2-19B-S
      * - bT219                          COBOL Name: WS-2-19B-T
      * - bSFld1219                      COBOL Name: WS-2-19B-S-FLD1
      * - bSFld2219                      COBOL Name: WS-2-19B-S-FLD2
      * - bTFld3219                      COBOL Name: WS-2-19B-T-FLD3
      * - bTFld1219                      COBOL Name: WS-2-19B-T-FLD1
      * - bTFld2219                      COBOL Name: WS-2-19B-T-FLD2
      * - tLen2                          COBOL Name: WS-2-T-LEN
      * - aS220                          COBOL Name: WS-2-20A-S
      * - aT220                          COBOL Name: WS-2-20A-T
      * - aTFld1220                      COBOL Name: WS-2-20A-T-FLD1
      * - aTFld2220                      COBOL Name: WS-2-20A-T-FLD2
      * - bS220                          COBOL Name: WS-2-20B-S
      * - bT220                          COBOL Name: WS-2-20B-T
      * - bTFld3220                      COBOL Name: WS-2-20B-T-FLD3
      *
      * @throws CFException
      */
      @Override
      public MainlineSplit20OutCtx mainlineSplit20(MainlineSplit20InCtx methodIn) throws Exception {
Refmod3Ctx programCtx = methodIn.getRefmod3Ctx();
MainlineSplit20OutCtx methodOut = methodIn.getMainlineSplit20OutCtx();
//  DISPLAY '*556*   WS-2-19A-T-FLD2= (' WS-2-19A-T-FLD2 ')'
          logger.info("*556*   WS-2-19A-T-FLD2= ({})", new String(methodIn.getATFld2219())); 

// *
// * Src -> group; tgt -> group ; src smaller than tgt
// *    src not refmod;target offset 5
// *
//  INITIALIZE WS-2-19B-S WS-2-19B-T
          methodOut.getBS219().initialize();
          methodOut.getBT219().initialize();
//  MOVE ALL 'ABCD' TO WS-2-19B-S-FLD1
          methodOut.setBSFld1219(CONSTANTS.LITERAL_ABCDABCDABCDABCDABCDABCDABCDABCD);
//  MOVE ALL 'ZYXW' TO WS-2-19B-S-FLD2
          methodOut.setBSFld2219(CONSTANTS.LITERAL_645286444);
//  MOVE ALL 'MNOP' TO WS-2-19B-T-FLD3
          methodOut.setBTFld3219(CONSTANTS.LITERAL_MNOPMNOPMNOPMNOPMNOPMNOPMNOPMNOP);
//  MOVE WS-2-19B-S TO WS-2-19B-T ( WS-FIVE : LENGTH OF WS-2-19B-T - 5)
          methodOut.getBT219().replace(methodOut.getBS219().getCharArray(),0,methodOut.getBS219().length(), (methodOut.getBT219().begin + (methodIn.getFive()-1)) ,BT219.getBT219FieldLength() - 5 /* replace,sourceIndex,sourceLen,targetIndex,targetLen */);

// *
//  DISPLAY '*557* WS-2-19B-S       = (' WS-2-19B-S ')'
          logger.info("*557* WS-2-19B-S       = ({})", methodOut.getBS219().toString()); 
//  DISPLAY '*558*   WS-2-19B-S-FLD1= (' WS-2-19B-S-FLD1 ')'
          logger.info("*558*   WS-2-19B-S-FLD1= ({})", new String(methodOut.getBSFld1219())); 
//  DISPLAY '*559*   WS-2-19B-S-FLD2= (' WS-2-19B-S-FLD2 ')'
          logger.info("*559*   WS-2-19B-S-FLD2= ({})", new String(methodOut.getBSFld2219())); 
//  DISPLAY '*560* WS-2-19B-T-GRP   = (' WS-2-19B-T-GRP ')'
          logger.info("*560* WS-2-19B-T-GRP   = ({})", methodOut.getBTGrp219().toString()); 
//  DISPLAY '*561* WS-2-19B-T       = (' WS-2-19B-T ')'
          logger.info("*561* WS-2-19B-T       = ({})", methodOut.getBT219().toString()); 
//  DISPLAY '*562*   WS-2-19B-T-FLD1= (' WS-2-19B-T-FLD1 ')'
          logger.info("*562*   WS-2-19B-T-FLD1= ({})", new String(methodOut.getBTFld1219())); 
//  DISPLAY '*563*   WS-2-19B-T-FLD2= (' WS-2-19B-T-FLD2 ')'
          logger.info("*563*   WS-2-19B-T-FLD2= ({})", new String(methodOut.getBTFld2219())); 
//  DISPLAY '*564*   WS-2-19B-T-FLD3= (' WS-2-19B-T-FLD3 ')'
          logger.info("*564*   WS-2-19B-T-FLD3= ({})", new String(methodOut.getBTFld3219())); 

// *
//  INITIALIZE WS-2-19B-S WS-2-19B-T
          methodOut.getBS219().initialize();
          methodOut.getBT219().initialize();
//  MOVE ALL 'ABCD' TO WS-2-19B-S-FLD1
          methodOut.setBSFld1219(CONSTANTS.LITERAL_ABCDABCDABCDABCDABCDABCDABCDABCD);
//  MOVE ALL 'ZYXW' TO WS-2-19B-S-FLD2
          methodOut.setBSFld2219(CONSTANTS.LITERAL_645286444);
//  MOVE ALL 'MNOP' TO WS-2-19B-T-FLD3
          methodOut.setBTFld3219(CONSTANTS.LITERAL_MNOPMNOPMNOPMNOPMNOPMNOPMNOPMNOP);
//  MOVE LENGTH OF WS-2-19B-T TO WS-2-T-LEN
          methodOut.setTLen2((short) BT219.getBT219FieldLength());
//  SUBTRACT 5 FROM WS-2-T-LEN
          methodOut.setTLen2( (short) (methodOut.getTLen2()-(short)5));
//  MOVE WS-2-19B-S TO WS-2-19B-T ( WS-FIVE : WS-2-T-LEN )
          methodOut.getBT219().replace(methodOut.getBS219().getCharArray(),0,methodOut.getBS219().length(), (methodOut.getBT219().begin + (methodIn.getFive()-1)) ,methodOut.getTLen2() /* replace,sourceIndex,sourceLen,targetIndex,targetLen */);

// *
//  DISPLAY '*565* WS-2-19B-S       = (' WS-2-19B-S ')'
          logger.info("*565* WS-2-19B-S       = ({})", methodOut.getBS219().toString()); 
//  DISPLAY '*566*   WS-2-19B-S-FLD1= (' WS-2-19B-S-FLD1 ')'
          logger.info("*566*   WS-2-19B-S-FLD1= ({})", new String(methodOut.getBSFld1219())); 
//  DISPLAY '*567*   WS-2-19B-S-FLD2= (' WS-2-19B-S-FLD2 ')'
          logger.info("*567*   WS-2-19B-S-FLD2= ({})", new String(methodOut.getBSFld2219())); 
//  DISPLAY '*568* WS-2-19B-T-GRP   = (' WS-2-19B-T-GRP ')'
          logger.info("*568* WS-2-19B-T-GRP   = ({})", methodOut.getBTGrp219().toString()); 
//  DISPLAY '*569* WS-2-19B-T       = (' WS-2-19B-T ')'
          logger.info("*569* WS-2-19B-T       = ({})", methodOut.getBT219().toString()); 
//  DISPLAY '*570*   WS-2-19B-T-FLD1= (' WS-2-19B-T-FLD1 ')'
          logger.info("*570*   WS-2-19B-T-FLD1= ({})", new String(methodOut.getBTFld1219())); 
//  DISPLAY '*571*   WS-2-19B-T-FLD2= (' WS-2-19B-T-FLD2 ')'
          logger.info("*571*   WS-2-19B-T-FLD2= ({})", new String(methodOut.getBTFld2219())); 
//  DISPLAY '*572*   WS-2-19B-T-FLD3= (' WS-2-19B-T-FLD3 ')'
          logger.info("*572*   WS-2-19B-T-FLD3= ({})", new String(methodOut.getBTFld3219())); 

// *
// * Src -> string; tgt -> group ; src bigger than tgt
// *    src not refmod;target offset 5
// *
//  INITIALIZE WS-2-20A-S WS-2-20A-T
          methodOut.setAS220(CONSTANTS.SPACE_70 /* Fill 70 Spaces*/);
          methodOut.getAT220().initialize();
          // MOVE ALL 'ABCD' TO WS-2-20A-S
          methodOut.setAS220(CONSTANTS.LITERAL_1222519919);
//  MOVE WS-2-20A-S TO WS-2-20A-T ( WS-FIVE : LENGTH OF WS-2-20A-T - 5)
          methodOut.getAT220().replace(methodOut.getAS220(),0,methodOut.getAS220().length, (methodOut.getAT220().begin + (methodIn.getFive()-1)) /* aT220 */,AT220.getAT220FieldLength() - 5 /* replace,sourceIndex,sourceLen,targetIndex,targetLen */);

// *
//  DISPLAY '*573* WS-2-20A-S       = (' WS-2-20A-S ')'
          logger.info("*573* WS-2-20A-S       = ({})", new String(methodOut.getAS220())); 
//  DISPLAY '*574* WS-2-20A-T-GRP   = (' WS-2-20A-T-GRP ')'
          logger.info("*574* WS-2-20A-T-GRP   = ({})", methodOut.getATGrp220().toString()); 
//  DISPLAY '*575* WS-2-20A-T       = (' WS-2-20A-T ')'
          logger.info("*575* WS-2-20A-T       = ({})", methodOut.getAT220().toString()); 
//  DISPLAY '*576*   WS-2-20A-T-FLD1= (' WS-2-20A-T-FLD1 ')'
          logger.info("*576*   WS-2-20A-T-FLD1= ({})", new String(methodOut.getATFld1220())); 
//  DISPLAY '*577*   WS-2-20A-T-FLD2= (' WS-2-20A-T-FLD2 ')'
          logger.info("*577*   WS-2-20A-T-FLD2= ({})", new String(methodOut.getATFld2220())); 

// *
//  INITIALIZE WS-2-20A-S WS-2-20A-T
          methodOut.setAS220(CONSTANTS.SPACE_70 /* Fill 70 Spaces*/);
          methodOut.getAT220().initialize();
          // MOVE ALL 'ABCD' TO WS-2-20A-S
          methodOut.setAS220(CONSTANTS.LITERAL_1222519919);
//  MOVE LENGTH OF WS-2-20A-T TO WS-2-T-LEN
          methodOut.setTLen2((short) AT220.getAT220FieldLength());
//  SUBTRACT 5 FROM WS-2-T-LEN
          methodOut.setTLen2( (short) (methodOut.getTLen2()-(short)5));
//  MOVE WS-2-20A-S TO WS-2-20A-T ( WS-FIVE : WS-2-T-LEN )
          methodOut.getAT220().replace(methodOut.getAS220(),0,methodOut.getAS220().length, (methodOut.getAT220().begin + (methodIn.getFive()-1)) /* aT220 */,methodOut.getTLen2() /* replace,sourceIndex,sourceLen,targetIndex,targetLen */);

// *
//  DISPLAY '*578* WS-2-20A-S       = (' WS-2-20A-S ')'
          logger.info("*578* WS-2-20A-S       = ({})", new String(methodOut.getAS220())); 
//  DISPLAY '*579* WS-2-20A-T-GRP   = (' WS-2-20A-T-GRP ')'
          logger.info("*579* WS-2-20A-T-GRP   = ({})", methodOut.getATGrp220().toString()); 
//  DISPLAY '*580* WS-2-20A-T       = (' WS-2-20A-T ')'
          logger.info("*580* WS-2-20A-T       = ({})", methodOut.getAT220().toString()); 
//  DISPLAY '*581*   WS-2-20A-T-FLD1= (' WS-2-20A-T-FLD1 ')'
          logger.info("*581*   WS-2-20A-T-FLD1= ({})", new String(methodOut.getATFld1220())); 
//  DISPLAY '*582*   WS-2-20A-T-FLD2= (' WS-2-20A-T-FLD2 ')'
          logger.info("*582*   WS-2-20A-T-FLD2= ({})", new String(methodOut.getATFld2220())); 

// *
// * Src -> string; tgt -> group ; src smaller than tgt
// *    src not refmod;target offset 5
// *
//  INITIALIZE WS-2-20B-S WS-2-20B-T
          methodOut.setBS220(CONSTANTS.SPACE_70 /* Fill 70 Spaces*/);
          methodOut.getBT220().initialize();
          // MOVE ALL 'ABCD' TO WS-2-20B-S
          methodOut.setBS220(CONSTANTS.LITERAL_1222519919);
//  MOVE ALL 'MNOP' TO WS-2-20B-T-FLD3
          methodOut.setBTFld3220(CONSTANTS.LITERAL_MNOPMNOPMNOPMNOPMNOPMNOPMNOPMNOP);
//  MOVE WS-2-20B-S TO WS-2-20B-T ( WS-FIVE : LENGTH OF WS-2-20B-T - 5)
          methodOut.getBT220().replace(methodOut.getBS220(),0,methodOut.getBS220().length, (methodOut.getBT220().begin + (methodIn.getFive()-1)) /* bT220 */,BT220.getBT220FieldLength() - 5 /* replace,sourceIndex,sourceLen,targetIndex,targetLen */);
      
      return methodOut;
      }
      /**
      * mainlineSplit21 
      *   This method is derived from 
  *   COBOL Paragraph - MAINLINE-SPLIT21 COBOL Cyclomatic complexity - 1
      * Input  :  

      * - bS220                          COBOL Name: WS-2-20B-S
      * - bTGrp220                       COBOL Name: WS-2-20B-T-GRP
      * - bT220                          COBOL Name: WS-2-20B-T
      * - bTFld1220                      COBOL Name: WS-2-20B-T-FLD1
      * - bTFld2220                      COBOL Name: WS-2-20B-T-FLD2
      * - bTFld3220                      COBOL Name: WS-2-20B-T-FLD3
      *
      * Output :  

      * - bS220                          COBOL Name: WS-2-20B-S
      * - bT220                          COBOL Name: WS-2-20B-T
      * - bTFld3220                      COBOL Name: WS-2-20B-T-FLD3
      * - tLen2                          COBOL Name: WS-2-T-LEN
      * - wse21aS                        COBOL Name: WSE-2-1A-S
      * - wse21aT                        COBOL Name: WSE-2-1A-T
      * - wse21aSFld1                    COBOL Name: WSE-2-1A-S-FLD1
      * - wse21aSFld2                    COBOL Name: WSE-2-1A-S-FLD2
      * - wse21aTFld1                    COBOL Name: WSE-2-1A-T-FLD1
      * - wse21aTFld2                    COBOL Name: WSE-2-1A-T-FLD2
      * - wse21bS                        COBOL Name: WSE-2-1B-S
      * - wse21bT                        COBOL Name: WSE-2-1B-T
      * - wse21bSFld1                    COBOL Name: WSE-2-1B-S-FLD1
      * - wse21bSFld2                    COBOL Name: WSE-2-1B-S-FLD2
      * - wse21bTFld3                    COBOL Name: WSE-2-1B-T-FLD3
      * - wse21bTFld1                    COBOL Name: WSE-2-1B-T-FLD1
      * - wse21bTFld2                    COBOL Name: WSE-2-1B-T-FLD2
      * - wse22aS                        COBOL Name: WSE-2-2A-S
      * - wse22aT                        COBOL Name: WSE-2-2A-T
      * - wse22aTFld1                    COBOL Name: WSE-2-2A-T-FLD1
      * - wse22aTFld2                    COBOL Name: WSE-2-2A-T-FLD2
      * - wse22bS                        COBOL Name: WSE-2-2B-S
      * - wse22bT                        COBOL Name: WSE-2-2B-T
      * - wse22bTFld3                    COBOL Name: WSE-2-2B-T-FLD3
      *
      * @throws CFException
      */
      @Override
      public MainlineSplit21OutCtx mainlineSplit21(MainlineSplit21InCtx methodIn) throws Exception {
			// Declare local variables used in the method
			 final int WSE_22A_S_LENGTH = 60;
			 final int WSE_22B_S_LENGTH = 60;
			// End of variable declaration

Refmod3Ctx programCtx = methodIn.getRefmod3Ctx();
MainlineSplit21OutCtx methodOut = methodIn.getMainlineSplit21OutCtx();

// *
//  DISPLAY '*583* WS-2-20B-S       = (' WS-2-20B-S ')'
          logger.info("*583* WS-2-20B-S       = ({})", new String(methodOut.getBS220())); 
//  DISPLAY '*584* WS-2-20B-T-GRP   = (' WS-2-20B-T-GRP ')'
          logger.info("*584* WS-2-20B-T-GRP   = ({})", methodOut.getBTGrp220().toString()); 
//  DISPLAY '*585* WS-2-20B-T       = (' WS-2-20B-T ')'
          logger.info("*585* WS-2-20B-T       = ({})", methodOut.getBT220().toString()); 
//  DISPLAY '*586*   WS-2-20B-T-FLD1= (' WS-2-20B-T-FLD1 ')'
          logger.info("*586*   WS-2-20B-T-FLD1= ({})", new String(methodIn.getBTFld1220())); 
//  DISPLAY '*587*   WS-2-20B-T-FLD2= (' WS-2-20B-T-FLD2 ')'
          logger.info("*587*   WS-2-20B-T-FLD2= ({})", new String(methodIn.getBTFld2220())); 
//  DISPLAY '*588*   WS-2-20B-T-FLD3= (' WS-2-20B-T-FLD3 ')'
          logger.info("*588*   WS-2-20B-T-FLD3= ({})", new String(methodOut.getBTFld3220())); 

// *
//  INITIALIZE WS-2-20B-S WS-2-20B-T
          methodOut.setBS220(CONSTANTS.SPACE_70 /* Fill 70 Spaces*/);
          methodOut.getBT220().initialize();
          // MOVE ALL 'ABCD' TO WS-2-20B-S
          methodOut.setBS220(CONSTANTS.LITERAL_1222519919);
//  MOVE ALL 'MNOP' TO WS-2-20B-T-FLD3
          methodOut.setBTFld3220(CONSTANTS.LITERAL_MNOPMNOPMNOPMNOPMNOPMNOPMNOPMNOP);
//  MOVE LENGTH OF WS-2-20B-T TO WS-2-T-LEN
          methodOut.setTLen2((short) BT220.getBT220FieldLength());
//  SUBTRACT 5 FROM WS-2-T-LEN
          methodOut.setTLen2( (short) (methodOut.getTLen2()-(short)5));
//  MOVE WS-2-20B-S TO WS-2-20B-T ( WS-FIVE : WS-2-T-LEN )
          methodOut.getBT220().replace(methodOut.getBS220(),0,methodOut.getBS220().length, (methodOut.getBT220().begin + (methodIn.getFive()-1)) /* bT220 */,methodOut.getTLen2() /* replace,sourceIndex,sourceLen,targetIndex,targetLen */);

// *
//  DISPLAY '*589* WS-2-20B-S       = (' WS-2-20B-S ')'
          logger.info("*589* WS-2-20B-S       = ({})", new String(methodOut.getBS220())); 
//  DISPLAY '*590* WS-2-20B-T-GRP   = (' WS-2-20B-T-GRP ')'
          logger.info("*590* WS-2-20B-T-GRP   = ({})", methodOut.getBTGrp220().toString()); 
//  DISPLAY '*591* WS-2-20B-T       = (' WS-2-20B-T ')'
          logger.info("*591* WS-2-20B-T       = ({})", methodOut.getBT220().toString()); 
//  DISPLAY '*592*   WS-2-20B-T-FLD1= (' WS-2-20B-T-FLD1 ')'
          logger.info("*592*   WS-2-20B-T-FLD1= ({})", new String(methodIn.getBTFld1220())); 
//  DISPLAY '*593*   WS-2-20B-T-FLD2= (' WS-2-20B-T-FLD2 ')'
          logger.info("*593*   WS-2-20B-T-FLD2= ({})", new String(methodIn.getBTFld2220())); 
//  DISPLAY '*594*   WS-2-20B-T-FLD3= (' WS-2-20B-T-FLD3 ')'
          logger.info("*594*   WS-2-20B-T-FLD3= ({})", new String(methodOut.getBTFld3220())); 

// *
// * Below usecases are repeat of above one with equal src and tgt
// *
// * src -> group; tgt -> group ; src same size as tgt
// *
//  INITIALIZE WSE-2-1A-S WSE-2-1A-T
          methodOut.getWse21aS().initialize();
          methodOut.getWse21aT().initialize();
//  MOVE ALL 'ABCD' TO WSE-2-1A-S-FLD1
          methodOut.setWse21aSFld1(CONSTANTS.LITERAL_ABCDABCDABCDABCDABCDABCDABCDABCD);
//  MOVE ALL 'ZYXW' TO WSE-2-1A-S-FLD2
          methodOut.setWse21aSFld2(CONSTANTS.LITERAL_ZYXWZYXWZYXWZYXWZYXWZYXWZYXWZYXW);
//  MOVE WSE-2-1A-S ( WS-ONE : LENGTH OF WSE-2-1A-S ) TO WSE-2-1A-T ( WS-ONE : LENGTH OF WSE-2-1A-T )
          methodOut.getWse21aT().replace(methodOut.getWse21aS(),(methodIn.getOne()-1),Wse21aS.getWse21aSFieldLength(),(methodIn.getOne()-1),Wse21aT.getWse21aTFieldLength() /* replace,sourceIndex,sourceLen,targetIndex,targetLen */);

// *
//  DISPLAY '*595* WSE-2-1A-S        = (' WSE-2-1A-S ')'
          logger.info("*595* WSE-2-1A-S        = ({})", methodOut.getWse21aS().toString()); 
//  DISPLAY '*596*   WSE-2-1A-S-FLD1 = (' WSE-2-1A-S-FLD1 ')'
          logger.info("*596*   WSE-2-1A-S-FLD1 = ({})", new String(methodOut.getWse21aSFld1())); 
//  DISPLAY '*597*   WSE-2-1A-S-FLD2 = (' WSE-2-1A-S-FLD2 ')'
          logger.info("*597*   WSE-2-1A-S-FLD2 = ({})", new String(methodOut.getWse21aSFld2())); 
//  DISPLAY '*598* WSE-2-1A-T        = (' WSE-2-1A-T ')'
          logger.info("*598* WSE-2-1A-T        = ({})", methodOut.getWse21aT().toString()); 
//  DISPLAY '*599*   WSE-2-1A-T-FLD1 = (' WSE-2-1A-T-FLD1 ')'
          logger.info("*599*   WSE-2-1A-T-FLD1 = ({})", new String(methodOut.getWse21aTFld1())); 
//  DISPLAY '*600*   WSE-2-1A-T-FLD2 = (' WSE-2-1A-T-FLD2 ')'
          logger.info("*600*   WSE-2-1A-T-FLD2 = ({})", new String(methodOut.getWse21aTFld2())); 

// *
// * Src -> group; tgt -> group ; src same size as tgt
// *
//  INITIALIZE WSE-2-1B-S WSE-2-1B-T
          methodOut.getWse21bS().initialize();
          methodOut.getWse21bT().initialize();
//  MOVE ALL 'ABCD' TO WSE-2-1B-S-FLD1
          methodOut.setWse21bSFld1(CONSTANTS.LITERAL_ABCDABCDABCDABCDABCDABCDABCDABCD);
//  MOVE ALL 'ZYXW' TO WSE-2-1B-S-FLD2
          methodOut.setWse21bSFld2(CONSTANTS.LITERAL_ZYXWZYXWZYXWZYXWZYXWZYXWZYXWZYXW);
//  MOVE ALL 'MNOP' TO WSE-2-1B-T-FLD3
          methodOut.setWse21bTFld3(CONSTANTS.LITERAL_MNOPMNOPMNOPMNOPMNOPMNOPMNOPMNOP);
//  MOVE WSE-2-1B-S ( WS-ONE : LENGTH OF WSE-2-1B-S ) TO WSE-2-1B-T ( WS-ONE : LENGTH OF WSE-2-1B-T )
          methodOut.getWse21bT().replace(methodOut.getWse21bS(),(methodIn.getOne()-1),Wse21bS.getWse21bSFieldLength(),(methodIn.getOne()-1),Wse21bT.getWse21bTFieldLength() /* replace,sourceIndex,sourceLen,targetIndex,targetLen */);

// *
//  DISPLAY '*601* WSE-2-1B-S        = (' WSE-2-1B-S ')'
          logger.info("*601* WSE-2-1B-S        = ({})", methodOut.getWse21bS().toString()); 
//  DISPLAY '*602*   WSE-2-1B-S-FLD1 = (' WSE-2-1B-S-FLD1 ')'
          logger.info("*602*   WSE-2-1B-S-FLD1 = ({})", new String(methodOut.getWse21bSFld1())); 
//  DISPLAY '*603*   WSE-2-1B-S-FLD2 = (' WSE-2-1B-S-FLD2 ')'
          logger.info("*603*   WSE-2-1B-S-FLD2 = ({})", new String(methodOut.getWse21bSFld2())); 
//  DISPLAY '*604* WSE-2-1B-T        = (' WSE-2-1B-T ')'
          logger.info("*604* WSE-2-1B-T        = ({})", methodOut.getWse21bT().toString()); 
//  DISPLAY '*605*   WSE-2-1B-T-FLD1 = (' WSE-2-1B-T-FLD1 ')'
          logger.info("*605*   WSE-2-1B-T-FLD1 = ({})", new String(methodOut.getWse21bTFld1())); 
//  DISPLAY '*606*   WSE-2-1B-T-FLD2 = (' WSE-2-1B-T-FLD2 ')'
          logger.info("*606*   WSE-2-1B-T-FLD2 = ({})", new String(methodOut.getWse21bTFld2())); 
//  DISPLAY '*607*   WSE-2-1B-T-FLD3 = (' WSE-2-1B-T-FLD3 ')'
          logger.info("*607*   WSE-2-1B-T-FLD3 = ({})", new String(methodOut.getWse21bTFld3())); 

// *
// * Src -> string; tgt -> group ; src same size as tgt
// *
//  INITIALIZE WSE-2-2A-S WSE-2-2A-T
          methodOut.setWse22aS(CONSTANTS.SPACE_60 /* Fill 60 Spaces*/);
          methodOut.getWse22aT().initialize();
          // MOVE ALL 'ABCD' TO WSE-2-2A-S
          methodOut.setWse22aS(CONSTANTS.LITERAL_1122147122);
//  MOVE WSE-2-2A-S ( WS-ONE : LENGTH OF WSE-2-2A-S ) TO WSE-2-2A-T ( WS-ONE : LENGTH OF WSE-2-2A-T )
          methodOut.getWse22aT().replace(methodOut.getWse22aS(),(methodIn.getOne()-1)/* wse22aS */ ,WSE_22A_S_LENGTH,(methodIn.getOne()-1),Wse22aT.getWse22aTFieldLength() /* replace,startIndex,targetLen */);

// *
//  DISPLAY '*608* WSE-2-2A-S        = (' WSE-2-2A-S ')'
          logger.info("*608* WSE-2-2A-S        = ({})", new String(methodOut.getWse22aS())); 
//  DISPLAY '*609* WSE-2-2A-T        = (' WSE-2-2A-T ')'
          logger.info("*609* WSE-2-2A-T        = ({})", methodOut.getWse22aT().toString()); 
//  DISPLAY '*610*   WSE-2-2A-T-FLD1 = (' WSE-2-2A-T-FLD1 ')'
          logger.info("*610*   WSE-2-2A-T-FLD1 = ({})", new String(methodOut.getWse22aTFld1())); 
//  DISPLAY '*611*   WSE-2-2A-T-FLD2 = (' WSE-2-2A-T-FLD2 ')'
          logger.info("*611*   WSE-2-2A-T-FLD2 = ({})", new String(methodOut.getWse22aTFld2())); 

// *
// * Src -> string; tgt -> group ; src same size as tgt
// *
//  INITIALIZE WSE-2-2B-S WSE-2-2B-T
          methodOut.setWse22bS(CONSTANTS.SPACE_60 /* Fill 60 Spaces*/);
          methodOut.getWse22bT().initialize();
          // MOVE ALL 'ABCD' TO WSE-2-2B-S
          methodOut.setWse22bS(CONSTANTS.LITERAL_1122147122);
//  MOVE ALL 'MNOP' TO WSE-2-2B-T-FLD3
          methodOut.setWse22bTFld3(CONSTANTS.LITERAL_MNOPMNOPMNOPMNOPMNOPMNOPMNOPMNOP);
//  MOVE WSE-2-2B-S ( WS-ONE : LENGTH OF WSE-2-2B-S ) TO WSE-2-2B-T ( WS-ONE : LENGTH OF WSE-2-2B-T )
          methodOut.getWse22bT().replace(methodOut.getWse22bS(),(methodIn.getOne()-1)/* wse22bS */ ,WSE_22B_S_LENGTH,(methodIn.getOne()-1),Wse22bT.getWse22bTFieldLength() /* replace,startIndex,targetLen */);
      
      return methodOut;
      }
      /**
      * mainlineSplit22 
      *   This method is derived from 
  *   COBOL Paragraph - MAINLINE-SPLIT22 COBOL Cyclomatic complexity - 1
      * Input  :  

      * - wse22bS                        COBOL Name: WSE-2-2B-S
      * - wse22bT                        COBOL Name: WSE-2-2B-T
      * - wse22bTFld1                    COBOL Name: WSE-2-2B-T-FLD1
      * - wse22bTFld2                    COBOL Name: WSE-2-2B-T-FLD2
      * - wse22bTFld3                    COBOL Name: WSE-2-2B-T-FLD3
      *
      * Output :  

      * - wse23aS                        COBOL Name: WSE-2-3A-S
      * - wse23aT                        COBOL Name: WSE-2-3A-T
      * - wse23aSFld1                    COBOL Name: WSE-2-3A-S-FLD1
      * - wse23aSFld2                    COBOL Name: WSE-2-3A-S-FLD2
      * - wse23aTFld1                    COBOL Name: WSE-2-3A-T-FLD1
      * - wse23aTFld2                    COBOL Name: WSE-2-3A-T-FLD2
      * - wse23bS                        COBOL Name: WSE-2-3B-S
      * - wse23bT                        COBOL Name: WSE-2-3B-T
      * - wse23bSFld1                    COBOL Name: WSE-2-3B-S-FLD1
      * - wse23bSFld2                    COBOL Name: WSE-2-3B-S-FLD2
      * - wse23bTFld3                    COBOL Name: WSE-2-3B-T-FLD3
      * - wse23bTFld1                    COBOL Name: WSE-2-3B-T-FLD1
      * - wse23bTFld2                    COBOL Name: WSE-2-3B-T-FLD2
      * - wse24aS                        COBOL Name: WSE-2-4A-S
      * - wse24aT                        COBOL Name: WSE-2-4A-T
      * - wse24aTFld1                    COBOL Name: WSE-2-4A-T-FLD1
      * - wse24aTFld2                    COBOL Name: WSE-2-4A-T-FLD2
      * - wse24bS                        COBOL Name: WSE-2-4B-S
      * - wse24bT                        COBOL Name: WSE-2-4B-T
      * - wse24bTFld3                    COBOL Name: WSE-2-4B-T-FLD3
      * - wse24bTFld1                    COBOL Name: WSE-2-4B-T-FLD1
      * - wse24bTFld2                    COBOL Name: WSE-2-4B-T-FLD2
      * - wse21aS                        COBOL Name: WSE-2-1A-S
      * - wse21aT                        COBOL Name: WSE-2-1A-T
      * - wse21aSFld1                    COBOL Name: WSE-2-1A-S-FLD1
      * - wse21aSFld2                    COBOL Name: WSE-2-1A-S-FLD2
      *
      * @throws CFException
      */
      @Override
      public MainlineSplit22OutCtx mainlineSplit22(MainlineSplit22InCtx methodIn) throws Exception {
Refmod3Ctx programCtx = methodIn.getRefmod3Ctx();
MainlineSplit22OutCtx methodOut = methodIn.getMainlineSplit22OutCtx();

// *
//  DISPLAY '*612* WSE-2-2B-S        = (' WSE-2-2B-S ')'
          logger.info("*612* WSE-2-2B-S        = ({})", new String(methodIn.getWse22bS())); 
//  DISPLAY '*613* WSE-2-2B-T        = (' WSE-2-2B-T ')'
          logger.info("*613* WSE-2-2B-T        = ({})", methodIn.getWse22bT().toString()); 
//  DISPLAY '*614*   WSE-2-2B-T-FLD1 = (' WSE-2-2B-T-FLD1 ')'
          logger.info("*614*   WSE-2-2B-T-FLD1 = ({})", new String(methodIn.getWse22bTFld1())); 
//  DISPLAY '*615*   WSE-2-2B-T-FLD2 = (' WSE-2-2B-T-FLD2 ')'
          logger.info("*615*   WSE-2-2B-T-FLD2 = ({})", new String(methodIn.getWse22bTFld2())); 
//  DISPLAY '*616*   WSE-2-2B-T-FLD3 = (' WSE-2-2B-T-FLD3 ')'
          logger.info("*616*   WSE-2-2B-T-FLD3 = ({})", new String(methodIn.getWse22bTFld3())); 

// *
// * Src -> group; tgt -> group ; src same size as tgt
// *
//  INITIALIZE WSE-2-3A-S WSE-2-3A-T
          methodOut.getWse23aS().initialize();
          methodOut.getWse23aT().initialize();
//  MOVE ALL 'ABCD' TO WSE-2-3A-S-FLD1
          methodOut.setWse23aSFld1(CONSTANTS.LITERAL_ABCDABCDABCDABCDABCDABCDABCDABCD);
//  MOVE ALL 'ZYXW' TO WSE-2-3A-S-FLD2
          methodOut.setWse23aSFld2(CONSTANTS.LITERAL_ZYXWZYXWZYXWZYXWZYXWZYXWZYXWZYXW);
//  MOVE WSE-2-3A-S TO WSE-2-3A-T ( WS-ONE : LENGTH OF WSE-2-3A-T )
          methodOut.getWse23aT().replace(methodOut.getWse23aS().getCharArray(),0,methodOut.getWse23aS().length(),(methodIn.getOne()-1),Wse23aT.getWse23aTFieldLength() /* replace,sourceIndex,sourceLen,targetIndex,targetLen */);

// *
//  DISPLAY '*617* WSE-2-3A-S        = (' WSE-2-3A-S ')'
          logger.info("*617* WSE-2-3A-S        = ({})", methodOut.getWse23aS().toString()); 
//  DISPLAY '*618*   WSE-2-3A-S-FLD1 = (' WSE-2-3A-S-FLD1 ')'
          logger.info("*618*   WSE-2-3A-S-FLD1 = ({})", new String(methodOut.getWse23aSFld1())); 
//  DISPLAY '*619*   WSE-2-3A-S-FLD2 = (' WSE-2-3A-S-FLD2 ')'
          logger.info("*619*   WSE-2-3A-S-FLD2 = ({})", new String(methodOut.getWse23aSFld2())); 
//  DISPLAY '*620* WSE-2-3A-T        = (' WSE-2-3A-T ')'
          logger.info("*620* WSE-2-3A-T        = ({})", methodOut.getWse23aT().toString()); 
//  DISPLAY '*621*   WSE-2-3A-T-FLD1 = (' WSE-2-3A-T-FLD1 ')'
          logger.info("*621*   WSE-2-3A-T-FLD1 = ({})", new String(methodOut.getWse23aTFld1())); 
//  DISPLAY '*622*   WSE-2-3A-T-FLD2 = (' WSE-2-3A-T-FLD2 ')'
          logger.info("*622*   WSE-2-3A-T-FLD2 = ({})", new String(methodOut.getWse23aTFld2())); 

// *
// * Src -> group; tgt -> group ; src same size as tgt
// *
//  INITIALIZE WSE-2-3B-S WSE-2-3B-T
          methodOut.getWse23bS().initialize();
          methodOut.getWse23bT().initialize();
//  MOVE ALL 'ABCD' TO WSE-2-3B-S-FLD1
          methodOut.setWse23bSFld1(CONSTANTS.LITERAL_ABCDABCDABCDABCDABCDABCDABCDABCD);
//  MOVE ALL 'ZYXW' TO WSE-2-3B-S-FLD2
          methodOut.setWse23bSFld2(CONSTANTS.LITERAL_ZYXWZYXWZYXWZYXWZYXWZYXWZYXWZYXW);
//  MOVE ALL 'MNOP' TO WSE-2-3B-T-FLD3
          methodOut.setWse23bTFld3(CONSTANTS.LITERAL_MNOPMNOPMNOPMNOPMNOPMNOPMNOPMNOP);
//  MOVE WSE-2-3B-S TO WSE-2-3B-T ( WS-ONE : LENGTH OF WSE-2-3B-T )
          methodOut.getWse23bT().replace(methodOut.getWse23bS().getCharArray(),0,methodOut.getWse23bS().length(),(methodIn.getOne()-1),Wse23bT.getWse23bTFieldLength() /* replace,sourceIndex,sourceLen,targetIndex,targetLen */);

// *
//  DISPLAY '*623* WSE-2-3B-S        = (' WSE-2-3B-S ')'
          logger.info("*623* WSE-2-3B-S        = ({})", methodOut.getWse23bS().toString()); 
//  DISPLAY '*624*   WSE-2-3B-S-FLD1 = (' WSE-2-3B-S-FLD1 ')'
          logger.info("*624*   WSE-2-3B-S-FLD1 = ({})", new String(methodOut.getWse23bSFld1())); 
//  DISPLAY '*625*   WSE-2-3B-S-FLD2 = (' WSE-2-3B-S-FLD2 ')'
          logger.info("*625*   WSE-2-3B-S-FLD2 = ({})", new String(methodOut.getWse23bSFld2())); 
//  DISPLAY '*626* WSE-2-3B-T        = (' WSE-2-3B-T ')'
          logger.info("*626* WSE-2-3B-T        = ({})", methodOut.getWse23bT().toString()); 
//  DISPLAY '*627*   WSE-2-3B-T-FLD1 = (' WSE-2-3B-T-FLD1 ')'
          logger.info("*627*   WSE-2-3B-T-FLD1 = ({})", new String(methodOut.getWse23bTFld1())); 
//  DISPLAY '*628*   WSE-2-3B-T-FLD2 = (' WSE-2-3B-T-FLD2 ')'
          logger.info("*628*   WSE-2-3B-T-FLD2 = ({})", new String(methodOut.getWse23bTFld2())); 
//  DISPLAY '*629*   WSE-2-3B-T-FLD3 = (' WSE-2-3B-T-FLD3 ')'
          logger.info("*629*   WSE-2-3B-T-FLD3 = ({})", new String(methodOut.getWse23bTFld3())); 

// *
// * Src -> string; tgt -> group ; src same size as tgt
// *
//  INITIALIZE WSE-2-4A-S WSE-2-4A-T
          methodOut.setWse24aS(CONSTANTS.SPACE_60 /* Fill 60 Spaces*/);
          methodOut.getWse24aT().initialize();
          // MOVE ALL 'ABCD' TO WSE-2-4A-S
          methodOut.setWse24aS(CONSTANTS.LITERAL_1122147122);
//  MOVE WSE-2-4A-S TO WSE-2-4A-T ( WS-ONE : LENGTH OF WSE-2-4A-T )
          methodOut.getWse24aT().replace(methodOut.getWse24aS(),0,methodOut.getWse24aS().length,(methodIn.getOne()-1),Wse24aT.getWse24aTFieldLength() /* replace,sourceIndex,sourceLen,targetIndex,targetLen */);

// *
//  DISPLAY '*630* WSE-2-4A-S        = (' WSE-2-4A-S ')'
          logger.info("*630* WSE-2-4A-S        = ({})", new String(methodOut.getWse24aS())); 
//  DISPLAY '*631* WSE-2-4A-T        = (' WSE-2-4A-T ')'
          logger.info("*631* WSE-2-4A-T        = ({})", methodOut.getWse24aT().toString()); 
//  DISPLAY '*632*   WSE-2-4A-T-FLD1 = (' WSE-2-4A-T-FLD1 ')'
          logger.info("*632*   WSE-2-4A-T-FLD1 = ({})", new String(methodOut.getWse24aTFld1())); 
//  DISPLAY '*633*   WSE-2-4A-T-FLD2 = (' WSE-2-4A-T-FLD2 ')'
          logger.info("*633*   WSE-2-4A-T-FLD2 = ({})", new String(methodOut.getWse24aTFld2())); 

// *
// * Src -> string; tgt -> group ; src same size as tgt
// *
//  INITIALIZE WSE-2-4B-S WSE-2-4B-T
          methodOut.setWse24bS(CONSTANTS.SPACE_60 /* Fill 60 Spaces*/);
          methodOut.getWse24bT().initialize();
          // MOVE ALL 'ABCD' TO WSE-2-4B-S
          methodOut.setWse24bS(CONSTANTS.LITERAL_1122147122);
//  MOVE ALL 'MNOP' TO WSE-2-4B-T-FLD3
          methodOut.setWse24bTFld3(CONSTANTS.LITERAL_MNOPMNOPMNOPMNOPMNOPMNOPMNOPMNOP);
//  MOVE WSE-2-4B-S TO WSE-2-4B-T ( WS-ONE : LENGTH OF WSE-2-4B-T )
          methodOut.getWse24bT().replace(methodOut.getWse24bS(),0,methodOut.getWse24bS().length,(methodIn.getOne()-1),Wse24bT.getWse24bTFieldLength() /* replace,sourceIndex,sourceLen,targetIndex,targetLen */);

// *
//  DISPLAY '*634* WSE-2-4B-S        = (' WSE-2-4B-S ')'
          logger.info("*634* WSE-2-4B-S        = ({})", new String(methodOut.getWse24bS())); 
//  DISPLAY '*635* WSE-2-4B-T        = (' WSE-2-4B-T ')'
          logger.info("*635* WSE-2-4B-T        = ({})", methodOut.getWse24bT().toString()); 
//  DISPLAY '*636*   WSE-2-4B-T-FLD1 = (' WSE-2-4B-T-FLD1 ')'
          logger.info("*636*   WSE-2-4B-T-FLD1 = ({})", new String(methodOut.getWse24bTFld1())); 
//  DISPLAY '*637*   WSE-2-4B-T-FLD2 = (' WSE-2-4B-T-FLD2 ')'
          logger.info("*637*   WSE-2-4B-T-FLD2 = ({})", new String(methodOut.getWse24bTFld2())); 
//  DISPLAY '*638*   WSE-2-4B-T-FLD3 = (' WSE-2-4B-T-FLD3 ')'
          logger.info("*638*   WSE-2-4B-T-FLD3 = ({})", new String(methodOut.getWse24bTFld3())); 

// *
// * Src -> group; tgt -> group ; src same size as tgt
// *
//  INITIALIZE WSE-2-1A-S WSE-2-1A-T
          methodOut.getWse21aS().initialize();
          methodOut.getWse21aT().initialize();
//  MOVE ALL 'ABCD' TO WSE-2-1A-S-FLD1
          methodOut.setWse21aSFld1(CONSTANTS.LITERAL_ABCDABCDABCDABCDABCDABCDABCDABCD);
//  MOVE ALL 'ZYXW' TO WSE-2-1A-S-FLD2
          methodOut.setWse21aSFld2(CONSTANTS.LITERAL_ZYXWZYXWZYXWZYXWZYXWZYXWZYXWZYXW);
//  MOVE WSE-2-1A-S ( WS-THREE : LENGTH OF WSE-2-1A-S - 3 ) TO WSE-2-1A-T ( WS-FIVE : LENGTH OF WSE-2-1A-T - 5)
          methodOut.getWse21aT().replace(methodOut.getWse21aS(),(methodIn.getThree()-1),Wse21aS.getWse21aSFieldLength() - 3,(methodIn.getFive()-1),Wse21aT.getWse21aTFieldLength() - 5 /* replace,sourceIndex,sourceLen,targetIndex,targetLen */);

// *
//  DISPLAY '*639* WSE-2-1A-S        = (' WSE-2-1A-S ')'
          logger.info("*639* WSE-2-1A-S        = ({})", methodOut.getWse21aS().toString()); 
//  DISPLAY '*640*   WSE-2-1A-S-FLD1 = (' WSE-2-1A-S-FLD1 ')'
          logger.info("*640*   WSE-2-1A-S-FLD1 = ({})", new String(methodOut.getWse21aSFld1())); 
//  DISPLAY '*641*   WSE-2-1A-S-FLD2 = (' WSE-2-1A-S-FLD2 ')'
          logger.info("*641*   WSE-2-1A-S-FLD2 = ({})", new String(methodOut.getWse21aSFld2())); 
//  DISPLAY '*642* WSE-2-1A-T        = (' WSE-2-1A-T ')'
          logger.info("*642* WSE-2-1A-T        = ({})", methodOut.getWse21aT().toString()); 
      
      return methodOut;
      }
      /**
      * mainlineSplit23 
      *   This method is derived from 
  *   COBOL Paragraph - MAINLINE-SPLIT23 COBOL Cyclomatic complexity - 1
      * Input  :  

      * - wse21aTFld1                    COBOL Name: WSE-2-1A-T-FLD1
      * - wse21aTFld2                    COBOL Name: WSE-2-1A-T-FLD2
      *
      * Output :  

      * - wse21bS                        COBOL Name: WSE-2-1B-S
      * - wse21bT                        COBOL Name: WSE-2-1B-T
      * - wse21bSFld1                    COBOL Name: WSE-2-1B-S-FLD1
      * - wse21bSFld2                    COBOL Name: WSE-2-1B-S-FLD2
      * - wse21bTFld3                    COBOL Name: WSE-2-1B-T-FLD3
      * - wse21bTFld1                    COBOL Name: WSE-2-1B-T-FLD1
      * - wse21bTFld2                    COBOL Name: WSE-2-1B-T-FLD2
      * - wse22aS                        COBOL Name: WSE-2-2A-S
      * - wse22aT                        COBOL Name: WSE-2-2A-T
      * - wse22aTFld1                    COBOL Name: WSE-2-2A-T-FLD1
      * - wse22aTFld2                    COBOL Name: WSE-2-2A-T-FLD2
      * - wse22bS                        COBOL Name: WSE-2-2B-S
      * - wse22bT                        COBOL Name: WSE-2-2B-T
      * - wse22bTFld3                    COBOL Name: WSE-2-2B-T-FLD3
      * - wse22bTFld1                    COBOL Name: WSE-2-2B-T-FLD1
      * - wse22bTFld2                    COBOL Name: WSE-2-2B-T-FLD2
      * - wse23aS                        COBOL Name: WSE-2-3A-S
      * - wse23aT                        COBOL Name: WSE-2-3A-T
      * - wse23aSFld1                    COBOL Name: WSE-2-3A-S-FLD1
      * - wse23aSFld2                    COBOL Name: WSE-2-3A-S-FLD2
      * - wse23aTFld1                    COBOL Name: WSE-2-3A-T-FLD1
      * - wse23aTFld2                    COBOL Name: WSE-2-3A-T-FLD2
      * - wse23bS                        COBOL Name: WSE-2-3B-S
      * - wse23bT                        COBOL Name: WSE-2-3B-T
      * - wse23bSFld1                    COBOL Name: WSE-2-3B-S-FLD1
      * - wse23bSFld2                    COBOL Name: WSE-2-3B-S-FLD2
      * - wse23bTFld3                    COBOL Name: WSE-2-3B-T-FLD3
      * - wse23bTFld1                    COBOL Name: WSE-2-3B-T-FLD1
      * - wse23bTFld2                    COBOL Name: WSE-2-3B-T-FLD2
      *
      * @throws CFException
      */
      @Override
      public MainlineSplit23OutCtx mainlineSplit23(MainlineSplit23InCtx methodIn) throws Exception {
			// Declare local variables used in the method
			 final int WSE_22A_S_LENGTH = 60;
			 final int WSE_22B_S_LENGTH = 60;
			// End of variable declaration

Refmod3Ctx programCtx = methodIn.getRefmod3Ctx();
MainlineSplit23OutCtx methodOut = methodIn.getMainlineSplit23OutCtx();
//  DISPLAY '*643*   WSE-2-1A-T-FLD1 = (' WSE-2-1A-T-FLD1 ')'
          logger.info("*643*   WSE-2-1A-T-FLD1 = ({})", new String(methodIn.getWse21aTFld1())); 
//  DISPLAY '*644*   WSE-2-1A-T-FLD2 = (' WSE-2-1A-T-FLD2 ')'
          logger.info("*644*   WSE-2-1A-T-FLD2 = ({})", new String(methodIn.getWse21aTFld2())); 

// *
// * Src -> group; tgt -> group ; src same size as tgt
// *
//  INITIALIZE WSE-2-1B-S WSE-2-1B-T
          methodOut.getWse21bS().initialize();
          methodOut.getWse21bT().initialize();
//  MOVE ALL 'ABCD' TO WSE-2-1B-S-FLD1
          methodOut.setWse21bSFld1(CONSTANTS.LITERAL_ABCDABCDABCDABCDABCDABCDABCDABCD);
//  MOVE ALL 'ZYXW' TO WSE-2-1B-S-FLD2
          methodOut.setWse21bSFld2(CONSTANTS.LITERAL_ZYXWZYXWZYXWZYXWZYXWZYXWZYXWZYXW);
//  MOVE ALL 'MNOP' TO WSE-2-1B-T-FLD3
          methodOut.setWse21bTFld3(CONSTANTS.LITERAL_MNOPMNOPMNOPMNOPMNOPMNOPMNOPMNOP);
//  MOVE WSE-2-1B-S ( WS-THREE : LENGTH OF WSE-2-1B-S - 3 ) TO WSE-2-1B-T ( WS-FIVE : LENGTH OF WSE-2-1B-T - 5)
          methodOut.getWse21bT().replace(methodOut.getWse21bS(),(methodIn.getThree()-1),Wse21bS.getWse21bSFieldLength() - 3,(methodIn.getFive()-1),Wse21bT.getWse21bTFieldLength() - 5 /* replace,sourceIndex,sourceLen,targetIndex,targetLen */);

// *
//  DISPLAY '*645* WSE-2-1B-S        = (' WSE-2-1B-S ')'
          logger.info("*645* WSE-2-1B-S        = ({})", methodOut.getWse21bS().toString()); 
//  DISPLAY '*646*   WSE-2-1B-S-FLD1 = (' WSE-2-1B-S-FLD1 ')'
          logger.info("*646*   WSE-2-1B-S-FLD1 = ({})", new String(methodOut.getWse21bSFld1())); 
//  DISPLAY '*647*   WSE-2-1B-S-FLD2 = (' WSE-2-1B-S-FLD2 ')'
          logger.info("*647*   WSE-2-1B-S-FLD2 = ({})", new String(methodOut.getWse21bSFld2())); 
//  DISPLAY '*648* WSE-2-1B-T        = (' WSE-2-1B-T ')'
          logger.info("*648* WSE-2-1B-T        = ({})", methodOut.getWse21bT().toString()); 
//  DISPLAY '*649*   WSE-2-1B-T-FLD1 = (' WSE-2-1B-T-FLD1 ')'
          logger.info("*649*   WSE-2-1B-T-FLD1 = ({})", new String(methodOut.getWse21bTFld1())); 
//  DISPLAY '*650*   WSE-2-1B-T-FLD2 = (' WSE-2-1B-T-FLD2 ')'
          logger.info("*650*   WSE-2-1B-T-FLD2 = ({})", new String(methodOut.getWse21bTFld2())); 
//  DISPLAY '*651*   WSE-2-1B-T-FLD3 = (' WSE-2-1B-T-FLD3 ')'
          logger.info("*651*   WSE-2-1B-T-FLD3 = ({})", new String(methodOut.getWse21bTFld3())); 

// *
// * Src -> string; tgt -> group ; src same size as tgt
// *
//  INITIALIZE WSE-2-2A-S WSE-2-2A-T
          methodOut.setWse22aS(CONSTANTS.SPACE_60 /* Fill 60 Spaces*/);
          methodOut.getWse22aT().initialize();
          // MOVE ALL 'ABCD' TO WSE-2-2A-S
          methodOut.setWse22aS(CONSTANTS.LITERAL_1122147122);
//  MOVE WSE-2-2A-S ( WS-THREE : LENGTH OF WSE-2-2A-S - 3 ) TO WSE-2-2A-T ( WS-FIVE : LENGTH OF WSE-2-2A-T - 5)
          methodOut.getWse22aT().replace(methodOut.getWse22aS(),(methodIn.getThree()-1)/* wse22aS */ ,WSE_22A_S_LENGTH - 3,(methodIn.getFive()-1),Wse22aT.getWse22aTFieldLength() - 5 /* replace,startIndex,targetLen */);

// *
//  DISPLAY '*652* WSE-2-2A-S        = (' WSE-2-2A-S ')'
          logger.info("*652* WSE-2-2A-S        = ({})", new String(methodOut.getWse22aS())); 
//  DISPLAY '*653* WSE-2-2A-T        = (' WSE-2-2A-T ')'
          logger.info("*653* WSE-2-2A-T        = ({})", methodOut.getWse22aT().toString()); 
//  DISPLAY '*654*   WSE-2-2A-T-FLD1 = (' WSE-2-2A-T-FLD1 ')'
          logger.info("*654*   WSE-2-2A-T-FLD1 = ({})", new String(methodOut.getWse22aTFld1())); 
//  DISPLAY '*655*   WSE-2-2A-T-FLD2 = (' WSE-2-2A-T-FLD2 ')'
          logger.info("*655*   WSE-2-2A-T-FLD2 = ({})", new String(methodOut.getWse22aTFld2())); 

// *
// * Src -> string; tgt -> group ; src same size as tgt
// *
//  INITIALIZE WSE-2-2B-S WSE-2-2B-T
          methodOut.setWse22bS(CONSTANTS.SPACE_60 /* Fill 60 Spaces*/);
          methodOut.getWse22bT().initialize();
          // MOVE ALL 'ABCD' TO WSE-2-2B-S
          methodOut.setWse22bS(CONSTANTS.LITERAL_1122147122);
//  MOVE ALL 'MNOP' TO WSE-2-2B-T-FLD3
          methodOut.setWse22bTFld3(CONSTANTS.LITERAL_MNOPMNOPMNOPMNOPMNOPMNOPMNOPMNOP);
//  MOVE WSE-2-2B-S ( WS-THREE : LENGTH OF WSE-2-2B-S - 3 ) TO WSE-2-2B-T ( WS-FIVE : LENGTH OF WSE-2-2B-T - 5)
          methodOut.getWse22bT().replace(methodOut.getWse22bS(),(methodIn.getThree()-1)/* wse22bS */ ,WSE_22B_S_LENGTH - 3,(methodIn.getFive()-1),Wse22bT.getWse22bTFieldLength() - 5 /* replace,startIndex,targetLen */);

// *
//  DISPLAY '*656* WSE-2-2B-S        = (' WSE-2-2B-S ')'
          logger.info("*656* WSE-2-2B-S        = ({})", new String(methodOut.getWse22bS())); 
//  DISPLAY '*657* WSE-2-2B-T        = (' WSE-2-2B-T ')'
          logger.info("*657* WSE-2-2B-T        = ({})", methodOut.getWse22bT().toString()); 
//  DISPLAY '*658*   WSE-2-2B-T-FLD1 = (' WSE-2-2B-T-FLD1 ')'
          logger.info("*658*   WSE-2-2B-T-FLD1 = ({})", new String(methodOut.getWse22bTFld1())); 
//  DISPLAY '*659*   WSE-2-2B-T-FLD2 = (' WSE-2-2B-T-FLD2 ')'
          logger.info("*659*   WSE-2-2B-T-FLD2 = ({})", new String(methodOut.getWse22bTFld2())); 
//  DISPLAY '*660*   WSE-2-2B-T-FLD3 = (' WSE-2-2B-T-FLD3 ')'
          logger.info("*660*   WSE-2-2B-T-FLD3 = ({})", new String(methodOut.getWse22bTFld3())); 

// *
// * Src -> group; tgt -> group ; src same size as tgt
// *
//  INITIALIZE WSE-2-3A-S WSE-2-3A-T
          methodOut.getWse23aS().initialize();
          methodOut.getWse23aT().initialize();
//  MOVE ALL 'ABCD' TO WSE-2-3A-S-FLD1
          methodOut.setWse23aSFld1(CONSTANTS.LITERAL_ABCDABCDABCDABCDABCDABCDABCDABCD);
//  MOVE ALL 'ZYXW' TO WSE-2-3A-S-FLD2
          methodOut.setWse23aSFld2(CONSTANTS.LITERAL_ZYXWZYXWZYXWZYXWZYXWZYXWZYXWZYXW);
//  MOVE WSE-2-3A-S TO WSE-2-3A-T ( WS-FIVE : LENGTH OF WSE-2-3A-T - 5)
          methodOut.getWse23aT().replace(methodOut.getWse23aS().getCharArray(),0,methodOut.getWse23aS().length(),(methodIn.getFive()-1),Wse23aT.getWse23aTFieldLength() - 5 /* replace,sourceIndex,sourceLen,targetIndex,targetLen */);

// *
//  DISPLAY '*661* WSE-2-3A-S        = (' WSE-2-3A-S ')'
          logger.info("*661* WSE-2-3A-S        = ({})", methodOut.getWse23aS().toString()); 
//  DISPLAY '*662*   WSE-2-3A-S-FLD1 = (' WSE-2-3A-S-FLD1 ')'
          logger.info("*662*   WSE-2-3A-S-FLD1 = ({})", new String(methodOut.getWse23aSFld1())); 
//  DISPLAY '*663*   WSE-2-3A-S-FLD2 = (' WSE-2-3A-S-FLD2 ')'
          logger.info("*663*   WSE-2-3A-S-FLD2 = ({})", new String(methodOut.getWse23aSFld2())); 
//  DISPLAY '*664* WSE-2-3A-T        = (' WSE-2-3A-T ')'
          logger.info("*664* WSE-2-3A-T        = ({})", methodOut.getWse23aT().toString()); 
//  DISPLAY '*665*   WSE-2-3A-T-FLD1 = (' WSE-2-3A-T-FLD1 ')'
          logger.info("*665*   WSE-2-3A-T-FLD1 = ({})", new String(methodOut.getWse23aTFld1())); 
//  DISPLAY '*666*   WSE-2-3A-T-FLD2 = (' WSE-2-3A-T-FLD2 ')'
          logger.info("*666*   WSE-2-3A-T-FLD2 = ({})", new String(methodOut.getWse23aTFld2())); 

// *
// * Src -> group; tgt -> group ; src same size as tgt
// *
//  INITIALIZE WSE-2-3B-S WSE-2-3B-T
          methodOut.getWse23bS().initialize();
          methodOut.getWse23bT().initialize();
//  MOVE ALL 'ABCD' TO WSE-2-3B-S-FLD1
          methodOut.setWse23bSFld1(CONSTANTS.LITERAL_ABCDABCDABCDABCDABCDABCDABCDABCD);
//  MOVE ALL 'ZYXW' TO WSE-2-3B-S-FLD2
          methodOut.setWse23bSFld2(CONSTANTS.LITERAL_ZYXWZYXWZYXWZYXWZYXWZYXWZYXWZYXW);
//  MOVE ALL 'MNOP' TO WSE-2-3B-T-FLD3
          methodOut.setWse23bTFld3(CONSTANTS.LITERAL_MNOPMNOPMNOPMNOPMNOPMNOPMNOPMNOP);
//  MOVE WSE-2-3B-S TO WSE-2-3B-T ( WS-FIVE : LENGTH OF WSE-2-3B-T - 5)
          methodOut.getWse23bT().replace(methodOut.getWse23bS().getCharArray(),0,methodOut.getWse23bS().length(),(methodIn.getFive()-1),Wse23bT.getWse23bTFieldLength() - 5 /* replace,sourceIndex,sourceLen,targetIndex,targetLen */);

// *
//  DISPLAY '*667* WSE-2-3B-S        = (' WSE-2-3B-S ')'
          logger.info("*667* WSE-2-3B-S        = ({})", methodOut.getWse23bS().toString()); 
//  DISPLAY '*668*   WSE-2-3B-S-FLD1 = (' WSE-2-3B-S-FLD1 ')'
          logger.info("*668*   WSE-2-3B-S-FLD1 = ({})", new String(methodOut.getWse23bSFld1())); 
//  DISPLAY '*669*   WSE-2-3B-S-FLD2 = (' WSE-2-3B-S-FLD2 ')'
          logger.info("*669*   WSE-2-3B-S-FLD2 = ({})", new String(methodOut.getWse23bSFld2())); 
//  DISPLAY '*670* WSE-2-3B-T        = (' WSE-2-3B-T ')'
          logger.info("*670* WSE-2-3B-T        = ({})", methodOut.getWse23bT().toString()); 
//  DISPLAY '*671*   WSE-2-3B-T-FLD1 = (' WSE-2-3B-T-FLD1 ')'
          logger.info("*671*   WSE-2-3B-T-FLD1 = ({})", new String(methodOut.getWse23bTFld1())); 
//  DISPLAY '*672*   WSE-2-3B-T-FLD2 = (' WSE-2-3B-T-FLD2 ')'
          logger.info("*672*   WSE-2-3B-T-FLD2 = ({})", new String(methodOut.getWse23bTFld2())); 
      
      return methodOut;
      }
      /**
      * mainlineSplit24 
      *   This method is derived from 
  *   COBOL Paragraph - MAINLINE-SPLIT24 COBOL Cyclomatic complexity - 1
      * Input  :  

      * - wse23bTFld3                    COBOL Name: WSE-2-3B-T-FLD3
      * - wse25aSGrp                     COBOL Name: WSE-2-5A-S-GRP
      * - wse25bSGrp                     COBOL Name: WSE-2-5B-S-GRP
      * - wse26aSGrp                     COBOL Name: WSE-2-6A-S-GRP
      *
      * Output :  

      * - wse24aS                        COBOL Name: WSE-2-4A-S
      * - wse24aT                        COBOL Name: WSE-2-4A-T
      * - wse24aTFld1                    COBOL Name: WSE-2-4A-T-FLD1
      * - wse24aTFld2                    COBOL Name: WSE-2-4A-T-FLD2
      * - wse24bS                        COBOL Name: WSE-2-4B-S
      * - wse24bT                        COBOL Name: WSE-2-4B-T
      * - wse24bTFld3                    COBOL Name: WSE-2-4B-T-FLD3
      * - wse24bTFld1                    COBOL Name: WSE-2-4B-T-FLD1
      * - wse24bTFld2                    COBOL Name: WSE-2-4B-T-FLD2
      * - wse25aS                        COBOL Name: WSE-2-5A-S
      * - wse25aT                        COBOL Name: WSE-2-5A-T
      * - wse25aSFld1                    COBOL Name: WSE-2-5A-S-FLD1
      * - wse25aSFld2                    COBOL Name: WSE-2-5A-S-FLD2
      * - wse25aTFld1                    COBOL Name: WSE-2-5A-T-FLD1
      * - wse25aTFld2                    COBOL Name: WSE-2-5A-T-FLD2
      * - wse25bS                        COBOL Name: WSE-2-5B-S
      * - wse25bT                        COBOL Name: WSE-2-5B-T
      * - wse25bSFld1                    COBOL Name: WSE-2-5B-S-FLD1
      * - wse25bSFld2                    COBOL Name: WSE-2-5B-S-FLD2
      * - wse25bTFld3                    COBOL Name: WSE-2-5B-T-FLD3
      * - wse25bTFld1                    COBOL Name: WSE-2-5B-T-FLD1
      * - wse25bTFld2                    COBOL Name: WSE-2-5B-T-FLD2
      * - wse26aS                        COBOL Name: WSE-2-6A-S
      * - wse26aT                        COBOL Name: WSE-2-6A-T
      * - wse26aTFld1                    COBOL Name: WSE-2-6A-T-FLD1
      * - wse26aTFld2                    COBOL Name: WSE-2-6A-T-FLD2
      * - wse26bS                        COBOL Name: WSE-2-6B-S
      * - wse26bT                        COBOL Name: WSE-2-6B-T
      *
      * @throws CFException
      */
      @Override
      public MainlineSplit24OutCtx mainlineSplit24(MainlineSplit24InCtx methodIn) throws Exception {
			// Declare local variables used in the method
			 final int WSE_26A_S_LENGTH = 60;
			// End of variable declaration

Refmod3Ctx programCtx = methodIn.getRefmod3Ctx();
MainlineSplit24OutCtx methodOut = methodIn.getMainlineSplit24OutCtx();
//  DISPLAY '*673*   WSE-2-3B-T-FLD3 = (' WSE-2-3B-T-FLD3 ')'
          logger.info("*673*   WSE-2-3B-T-FLD3 = ({})", new String(methodIn.getWse23bTFld3())); 

// *
// * Src -> string; tgt -> group ; src same size as tgt
// *
//  INITIALIZE WSE-2-4A-S WSE-2-4A-T
          methodOut.setWse24aS(CONSTANTS.SPACE_60 /* Fill 60 Spaces*/);
          methodOut.getWse24aT().initialize();
          // MOVE ALL 'ABCD' TO WSE-2-4A-S
          methodOut.setWse24aS(CONSTANTS.LITERAL_1122147122);
//  MOVE WSE-2-4A-S TO WSE-2-4A-T ( WS-FIVE : LENGTH OF WSE-2-4A-T - 5)
          methodOut.getWse24aT().replace(methodOut.getWse24aS(),0,methodOut.getWse24aS().length,(methodIn.getFive()-1),Wse24aT.getWse24aTFieldLength() - 5 /* replace,sourceIndex,sourceLen,targetIndex,targetLen */);

// *
//  DISPLAY '*674* WSE-2-4A-S        = (' WSE-2-4A-S ')'
          logger.info("*674* WSE-2-4A-S        = ({})", new String(methodOut.getWse24aS())); 
//  DISPLAY '*675* WSE-2-4A-T        = (' WSE-2-4A-T ')'
          logger.info("*675* WSE-2-4A-T        = ({})", methodOut.getWse24aT().toString()); 
//  DISPLAY '*676*   WSE-2-4A-T-FLD1 = (' WSE-2-4A-T-FLD1 ')'
          logger.info("*676*   WSE-2-4A-T-FLD1 = ({})", new String(methodOut.getWse24aTFld1())); 
//  DISPLAY '*677*   WSE-2-4A-T-FLD2 = (' WSE-2-4A-T-FLD2 ')'
          logger.info("*677*   WSE-2-4A-T-FLD2 = ({})", new String(methodOut.getWse24aTFld2())); 

// *
// * Src -> string; tgt -> group ; src same size as tgt
// *
//  INITIALIZE WSE-2-4B-S WSE-2-4B-T
          methodOut.setWse24bS(CONSTANTS.SPACE_60 /* Fill 60 Spaces*/);
          methodOut.getWse24bT().initialize();
          // MOVE ALL 'ABCD' TO WSE-2-4B-S
          methodOut.setWse24bS(CONSTANTS.LITERAL_1122147122);
//  MOVE ALL 'MNOP' TO WSE-2-4B-T-FLD3
          methodOut.setWse24bTFld3(CONSTANTS.LITERAL_MNOPMNOPMNOPMNOPMNOPMNOPMNOPMNOP);
//  MOVE WSE-2-4B-S TO WSE-2-4B-T ( WS-FIVE : LENGTH OF WSE-2-4B-T - 5)
          methodOut.getWse24bT().replace(methodOut.getWse24bS(),0,methodOut.getWse24bS().length,(methodIn.getFive()-1),Wse24bT.getWse24bTFieldLength() - 5 /* replace,sourceIndex,sourceLen,targetIndex,targetLen */);

// *
//  DISPLAY '*678* WSE-2-4B-S        = (' WSE-2-4B-S ')'
          logger.info("*678* WSE-2-4B-S        = ({})", new String(methodOut.getWse24bS())); 
//  DISPLAY '*679* WSE-2-4B-T        = (' WSE-2-4B-T ')'
          logger.info("*679* WSE-2-4B-T        = ({})", methodOut.getWse24bT().toString()); 
//  DISPLAY '*680*   WSE-2-4B-T-FLD1 = (' WSE-2-4B-T-FLD1 ')'
          logger.info("*680*   WSE-2-4B-T-FLD1 = ({})", new String(methodOut.getWse24bTFld1())); 
//  DISPLAY '*681*   WSE-2-4B-T-FLD2 = (' WSE-2-4B-T-FLD2 ')'
          logger.info("*681*   WSE-2-4B-T-FLD2 = ({})", new String(methodOut.getWse24bTFld2())); 
//  DISPLAY '*682*   WSE-2-4B-T-FLD3 = (' WSE-2-4B-T-FLD3 ')'
          logger.info("*682*   WSE-2-4B-T-FLD3 = ({})", new String(methodOut.getWse24bTFld3())); 

// *
// * Src -> group; tgt -> group ; src same size as tgt ; src offset 3
// *
//  INITIALIZE WSE-2-5A-S WSE-2-5A-T
          methodOut.getWse25aS().initialize();
          methodOut.getWse25aT().initialize();
//  MOVE ALL 'ABCD' TO WSE-2-5A-S-FLD1
          methodOut.setWse25aSFld1(CONSTANTS.LITERAL_ABCDABCDABCDABCDABCDABCDABCDABCD);
//  MOVE ALL 'ZYXW' TO WSE-2-5A-S-FLD2
          methodOut.setWse25aSFld2(CONSTANTS.LITERAL_ZYXWZYXWZYXWZYXWZYXWZYXWZYXWZYXW);
//  MOVE WSE-2-5A-S ( WS-ONE : LENGTH OF WSE-2-5A-S ) TO WSE-2-5A-T ( WS-ONE : LENGTH OF WSE-2-5A-T )
          methodOut.getWse25aT().replace(methodIn.getWse25aSGrp()/*parent*/,3+methodIn.getOne() - 1/*fromOffset - (wse25aT) */,Wse25aS.getWse25aSFieldLength()/*fromLen*/,0+methodIn.getOne() - 1/*toOffset - (wse25aS) */,Wse25aT.getWse25aTFieldLength()/*toLen*/);

// *
//  DISPLAY '*683* WSE-2-5A-S-GRP    = (' WSE-2-5A-S-GRP ')'
          logger.info("*683* WSE-2-5A-S-GRP    = ({})", methodIn.getWse25aSGrp().toString()); 
//  DISPLAY '*684* WSE-2-5A-S        = (' WSE-2-5A-S ')'
          logger.info("*684* WSE-2-5A-S        = ({})", methodOut.getWse25aS().toString()); 
//  DISPLAY '*685*   WSE-2-5A-S-FLD1 = (' WSE-2-5A-S-FLD1 ')'
          logger.info("*685*   WSE-2-5A-S-FLD1 = ({})", new String(methodOut.getWse25aSFld1())); 
//  DISPLAY '*686*   WSE-2-5A-S-FLD2 = (' WSE-2-5A-S-FLD2 ')'
          logger.info("*686*   WSE-2-5A-S-FLD2 = ({})", new String(methodOut.getWse25aSFld2())); 
//  DISPLAY '*687* WSE-2-5A-T        = (' WSE-2-5A-T ')'
          logger.info("*687* WSE-2-5A-T        = ({})", methodOut.getWse25aT().toString()); 
//  DISPLAY '*688*   WSE-2-5A-T-FLD1 = (' WSE-2-5A-T-FLD1 ')'
          logger.info("*688*   WSE-2-5A-T-FLD1 = ({})", new String(methodOut.getWse25aTFld1())); 
//  DISPLAY '*689*   WSE-2-5A-T-FLD2 = (' WSE-2-5A-T-FLD2 ')'
          logger.info("*689*   WSE-2-5A-T-FLD2 = ({})", new String(methodOut.getWse25aTFld2())); 

// *
// * Src -> group; tgt -> group ; src same size as tgt ;src offset 3
// *
//  INITIALIZE WSE-2-5B-S WSE-2-5B-T
          methodOut.getWse25bS().initialize();
          methodOut.getWse25bT().initialize();
//  MOVE ALL 'ABCD' TO WSE-2-5B-S-FLD1
          methodOut.setWse25bSFld1(CONSTANTS.LITERAL_ABCDABCDABCDABCDABCDABCDABCDABCD);
//  MOVE ALL 'ZYXW' TO WSE-2-5B-S-FLD2
          methodOut.setWse25bSFld2(CONSTANTS.LITERAL_ZYXWZYXWZYXWZYXWZYXWZYXWZYXWZYXW);
//  MOVE ALL 'MNOP' TO WSE-2-5B-T-FLD3
          methodOut.setWse25bTFld3(CONSTANTS.LITERAL_MNOPMNOPMNOPMNOPMNOPMNOPMNOPMNOP);
//  MOVE WSE-2-5B-S ( WS-ONE : LENGTH OF WSE-2-5B-S ) TO WSE-2-5B-T ( WS-ONE : LENGTH OF WSE-2-5B-T )
          methodOut.getWse25bT().replace(methodIn.getWse25bSGrp()/*parent*/,3+methodIn.getOne() - 1/*fromOffset - (wse25bT) */,Wse25bS.getWse25bSFieldLength()/*fromLen*/,0+methodIn.getOne() - 1/*toOffset - (wse25bS) */,Wse25bT.getWse25bTFieldLength()/*toLen*/);

// *
//  DISPLAY '*690* WSE-2-5B-S-GRP    = (' WSE-2-5B-S-GRP ')'
          logger.info("*690* WSE-2-5B-S-GRP    = ({})", methodIn.getWse25bSGrp().toString()); 
//  DISPLAY '*691* WSE-2-5B-S        = (' WSE-2-5B-S ')'
          logger.info("*691* WSE-2-5B-S        = ({})", methodOut.getWse25bS().toString()); 
//  DISPLAY '*692*   WSE-2-5B-S-FLD1 = (' WSE-2-5B-S-FLD1 ')'
          logger.info("*692*   WSE-2-5B-S-FLD1 = ({})", new String(methodOut.getWse25bSFld1())); 
//  DISPLAY '*693*   WSE-2-5B-S-FLD2 = (' WSE-2-5B-S-FLD2 ')'
          logger.info("*693*   WSE-2-5B-S-FLD2 = ({})", new String(methodOut.getWse25bSFld2())); 
//  DISPLAY '*694* WSE-2-5B-T        = (' WSE-2-5B-T ')'
          logger.info("*694* WSE-2-5B-T        = ({})", methodOut.getWse25bT().toString()); 
//  DISPLAY '*695*   WSE-2-5B-T-FLD1 = (' WSE-2-5B-T-FLD1 ')'
          logger.info("*695*   WSE-2-5B-T-FLD1 = ({})", new String(methodOut.getWse25bTFld1())); 
//  DISPLAY '*696*   WSE-2-5B-T-FLD2 = (' WSE-2-5B-T-FLD2 ')'
          logger.info("*696*   WSE-2-5B-T-FLD2 = ({})", new String(methodOut.getWse25bTFld2())); 
//  DISPLAY '*697*   WSE-2-5B-T-FLD3 = (' WSE-2-5B-T-FLD3 ')'
          logger.info("*697*   WSE-2-5B-T-FLD3 = ({})", new String(methodOut.getWse25bTFld3())); 

// *
// * Src -> string; tgt -> group ; src same size as tgt ; srcoffset 3
// *
//  INITIALIZE WSE-2-6A-S WSE-2-6A-T
          methodOut.setWse26aS(CONSTANTS.SPACE_60 /* Fill 60 Spaces*/);
          methodOut.getWse26aT().initialize();
//  MOVE ALL 'ABCD' TO WSE-2-6A-S
          methodOut.setWse26aS(CONSTANTS.LITERAL_1122147122);
//  MOVE WSE-2-6A-S ( WS-ONE : LENGTH OF WSE-2-6A-S ) TO WSE-2-6A-T ( WS-ONE : LENGTH OF WSE-2-6A-T )
          methodOut.getWse26aT().replace(methodIn.getWse26aSGrp()/*parent*/,3+methodIn.getOne() - 1/*fromOffset - (wse26aT) */,WSE_26A_S_LENGTH/*fromLen*/,0+methodIn.getOne() - 1/*toOffset - (wse26aS) */,Wse26aT.getWse26aTFieldLength()/*toLen*/);

// *
//  DISPLAY '*698* WSE-2-6A-S-GRP    = (' WSE-2-6A-S-GRP ')'
          logger.info("*698* WSE-2-6A-S-GRP    = ({})", methodIn.getWse26aSGrp().toString()); 
//  DISPLAY '*699* WSE-2-6A-S        = (' WSE-2-6A-S ')'
          logger.info("*699* WSE-2-6A-S        = ({})", new String(methodOut.getWse26aS())); 
//  DISPLAY '*700* WSE-2-6A-T        = (' WSE-2-6A-T ')'
          logger.info("*700* WSE-2-6A-T        = ({})", methodOut.getWse26aT().toString()); 
//  DISPLAY '*701*   WSE-2-6A-T-FLD1 = (' WSE-2-6A-T-FLD1 ')'
          logger.info("*701*   WSE-2-6A-T-FLD1 = ({})", new String(methodOut.getWse26aTFld1())); 
//  DISPLAY '*702*   WSE-2-6A-T-FLD2 = (' WSE-2-6A-T-FLD2 ')'
          logger.info("*702*   WSE-2-6A-T-FLD2 = ({})", new String(methodOut.getWse26aTFld2())); 

// *
// * Src -> string; tgt -> group ; src same size as tgt; srcoffset 3
// *
//  INITIALIZE WSE-2-6B-S WSE-2-6B-T
          methodOut.setWse26bS(CONSTANTS.SPACE_60 /* Fill 60 Spaces*/);
          methodOut.getWse26bT().initialize();
//  MOVE ALL 'ABCD' TO WSE-2-6B-S
          methodOut.setWse26bS(CONSTANTS.LITERAL_1122147122);
      
      return methodOut;
      }
      /**
      * mainlineSplit25 
      *   This method is derived from 
  *   COBOL Paragraph - MAINLINE-SPLIT25 COBOL Cyclomatic complexity - 1
      * Input  :  

      * - wse26bS                        COBOL Name: WSE-2-6B-S
      * - wse26bSGrp                     COBOL Name: WSE-2-6B-S-GRP
      * - wse27aTGrp                     COBOL Name: WSE-2-7A-T-GRP
      * - wse27bTGrp                     COBOL Name: WSE-2-7B-T-GRP
      * - wse28aTGrp                     COBOL Name: WSE-2-8A-T-GRP
      * - wse28bTGrp                     COBOL Name: WSE-2-8B-T-GRP
      *
      * Output :  

      * - wse26bTFld3                    COBOL Name: WSE-2-6B-T-FLD3
      * - wse26bT                        COBOL Name: WSE-2-6B-T
      * - wse26bS                        COBOL Name: WSE-2-6B-S
      * - wse26bTFld1                    COBOL Name: WSE-2-6B-T-FLD1
      * - wse26bTFld2                    COBOL Name: WSE-2-6B-T-FLD2
      * - wse27aS                        COBOL Name: WSE-2-7A-S
      * - wse27aT                        COBOL Name: WSE-2-7A-T
      * - wse27aSFld1                    COBOL Name: WSE-2-7A-S-FLD1
      * - wse27aSFld2                    COBOL Name: WSE-2-7A-S-FLD2
      * - wse27aTFld1                    COBOL Name: WSE-2-7A-T-FLD1
      * - wse27aTFld2                    COBOL Name: WSE-2-7A-T-FLD2
      * - wse27bS                        COBOL Name: WSE-2-7B-S
      * - wse27bT                        COBOL Name: WSE-2-7B-T
      * - wse27bSFld1                    COBOL Name: WSE-2-7B-S-FLD1
      * - wse27bSFld2                    COBOL Name: WSE-2-7B-S-FLD2
      * - wse27bTFld3                    COBOL Name: WSE-2-7B-T-FLD3
      * - wse27bTFld1                    COBOL Name: WSE-2-7B-T-FLD1
      * - wse27bTFld2                    COBOL Name: WSE-2-7B-T-FLD2
      * - wse28aS                        COBOL Name: WSE-2-8A-S
      * - wse28aT                        COBOL Name: WSE-2-8A-T
      * - wse28aTFld1                    COBOL Name: WSE-2-8A-T-FLD1
      * - wse28aTFld2                    COBOL Name: WSE-2-8A-T-FLD2
      * - wse28bS                        COBOL Name: WSE-2-8B-S
      * - wse28bT                        COBOL Name: WSE-2-8B-T
      * - wse28bTFld3                    COBOL Name: WSE-2-8B-T-FLD3
      * - wse28bTFld1                    COBOL Name: WSE-2-8B-T-FLD1
      * - wse28bTFld2                    COBOL Name: WSE-2-8B-T-FLD2
      * - wse29aS                        COBOL Name: WSE-2-9A-S
      * - wse29aT                        COBOL Name: WSE-2-9A-T
      *
      * @throws CFException
      */
      @Override
      public MainlineSplit25OutCtx mainlineSplit25(MainlineSplit25InCtx methodIn) throws Exception {
			// Declare local variables used in the method
			 final int WSE_26B_S_LENGTH = 60;
			 final int WSE_28A_S_LENGTH = 60;
			 final int WSE_28B_S_LENGTH = 60;
			// End of variable declaration

Refmod3Ctx programCtx = methodIn.getRefmod3Ctx();
MainlineSplit25OutCtx methodOut = methodIn.getMainlineSplit25OutCtx();
//  MOVE ALL 'MNOP' TO WSE-2-6B-T-FLD3
          methodOut.setWse26bTFld3(CONSTANTS.LITERAL_MNOPMNOPMNOPMNOPMNOPMNOPMNOPMNOP);
//  MOVE WSE-2-6B-S ( WS-ONE : LENGTH OF WSE-2-6B-S ) TO WSE-2-6B-T ( WS-ONE : LENGTH OF WSE-2-6B-T )
          methodOut.getWse26bT().replace(methodIn.getWse26bSGrp()/*parent*/,3+methodIn.getOne() - 1/*fromOffset - (wse26bT) */,WSE_26B_S_LENGTH/*fromLen*/,0+methodIn.getOne() - 1/*toOffset - (wse26bS) */,Wse26bT.getWse26bTFieldLength()/*toLen*/);

// *
//  DISPLAY '*703* WSE-2-6B-S-GRP    = (' WSE-2-6B-S-GRP ')'
          logger.info("*703* WSE-2-6B-S-GRP    = ({})", methodIn.getWse26bSGrp().toString()); 
//  DISPLAY '*704* WSE-2-6B-S        = (' WSE-2-6B-S ')'
          logger.info("*704* WSE-2-6B-S        = ({})", new String(methodOut.getWse26bS())); 
//  DISPLAY '*705* WSE-2-6B-T        = (' WSE-2-6B-T ')'
          logger.info("*705* WSE-2-6B-T        = ({})", methodOut.getWse26bT().toString()); 
//  DISPLAY '*706*   WSE-2-6B-T-FLD1 = (' WSE-2-6B-T-FLD1 ')'
          logger.info("*706*   WSE-2-6B-T-FLD1 = ({})", new String(methodOut.getWse26bTFld1())); 
//  DISPLAY '*707*   WSE-2-6B-T-FLD2 = (' WSE-2-6B-T-FLD2 ')'
          logger.info("*707*   WSE-2-6B-T-FLD2 = ({})", new String(methodOut.getWse26bTFld2())); 
//  DISPLAY '*708*   WSE-2-6B-T-FLD3 = (' WSE-2-6B-T-FLD3 ')'
          logger.info("*708*   WSE-2-6B-T-FLD3 = ({})", new String(methodOut.getWse26bTFld3())); 

// *
// * Src -> group; tgt -> group ; src same size as tgt ; tgt offset 5
// *
//  INITIALIZE WSE-2-7A-S WSE-2-7A-T
          methodOut.getWse27aS().initialize();
          methodOut.getWse27aT().initialize();
//  MOVE ALL 'ABCD' TO WSE-2-7A-S-FLD1
          methodOut.setWse27aSFld1(CONSTANTS.LITERAL_ABCDABCDABCDABCDABCDABCDABCDABCD);
//  MOVE ALL 'ZYXW' TO WSE-2-7A-S-FLD2
          methodOut.setWse27aSFld2(CONSTANTS.LITERAL_ZYXWZYXWZYXWZYXWZYXWZYXWZYXWZYXW);
//  MOVE WSE-2-7A-S ( WS-ONE : LENGTH OF WSE-2-7A-S ) TO WSE-2-7A-T ( WS-ONE : LENGTH OF WSE-2-7A-T )
          methodOut.getWse27aT().replace(methodOut.getWse27aS(),(methodIn.getOne()-1),Wse27aS.getWse27aSFieldLength(), (methodOut.getWse27aT().begin + (methodIn.getOne()-1)) ,Wse27aT.getWse27aTFieldLength() /* replace,sourceIndex,sourceLen,targetIndex,targetLen */);

// *
//  DISPLAY '*709* WSE-2-7A-S        = (' WSE-2-7A-S ')'
          logger.info("*709* WSE-2-7A-S        = ({})", methodOut.getWse27aS().toString()); 
//  DISPLAY '*710*   WSE-2-7A-S-FLD1 = (' WSE-2-7A-S-FLD1 ')'
          logger.info("*710*   WSE-2-7A-S-FLD1 = ({})", new String(methodOut.getWse27aSFld1())); 
//  DISPLAY '*711*   WSE-2-7A-S-FLD2 = (' WSE-2-7A-S-FLD2 ')'
          logger.info("*711*   WSE-2-7A-S-FLD2 = ({})", new String(methodOut.getWse27aSFld2())); 
//  DISPLAY '*712* WSE-2-7A-T-GRP    = (' WSE-2-7A-T-GRP ')'
          logger.info("*712* WSE-2-7A-T-GRP    = ({})", methodOut.getWse27aTGrp().toString()); 
//  DISPLAY '*713* WSE-2-7A-T        = (' WSE-2-7A-T ')'
          logger.info("*713* WSE-2-7A-T        = ({})", methodOut.getWse27aT().toString()); 
//  DISPLAY '*714*   WSE-2-7A-T-FLD1 = (' WSE-2-7A-T-FLD1 ')'
          logger.info("*714*   WSE-2-7A-T-FLD1 = ({})", new String(methodOut.getWse27aTFld1())); 
//  DISPLAY '*715*   WSE-2-7A-T-FLD2 = (' WSE-2-7A-T-FLD2 ')'
          logger.info("*715*   WSE-2-7A-T-FLD2 = ({})", new String(methodOut.getWse27aTFld2())); 

// *
// * Src -> group; tgt -> group ; src same size as tgt ;tgt offset 5
// *
//  INITIALIZE WSE-2-7B-S WSE-2-7B-T
          methodOut.getWse27bS().initialize();
          methodOut.getWse27bT().initialize();
//  MOVE ALL 'ABCD' TO WSE-2-7B-S-FLD1
          methodOut.setWse27bSFld1(CONSTANTS.LITERAL_ABCDABCDABCDABCDABCDABCDABCDABCD);
//  MOVE ALL 'ZYXW' TO WSE-2-7B-S-FLD2
          methodOut.setWse27bSFld2(CONSTANTS.LITERAL_ZYXWZYXWZYXWZYXWZYXWZYXWZYXWZYXW);
//  MOVE ALL 'MNOP' TO WSE-2-7B-T-FLD3
          methodOut.setWse27bTFld3(CONSTANTS.LITERAL_MNOPMNOPMNOPMNOPMNOPMNOPMNOPMNOP);
//  MOVE WSE-2-7B-S ( WS-ONE : LENGTH OF WSE-2-7B-S ) TO WSE-2-7B-T ( WS-ONE : LENGTH OF WSE-2-7B-T )
          methodOut.getWse27bT().replace(methodOut.getWse27bS(),(methodIn.getOne()-1),Wse27bS.getWse27bSFieldLength(), (methodOut.getWse27bT().begin + (methodIn.getOne()-1)) ,Wse27bT.getWse27bTFieldLength() /* replace,sourceIndex,sourceLen,targetIndex,targetLen */);

// *
//  DISPLAY '*716* WSE-2-7B-S        = (' WSE-2-7B-S ')'
          logger.info("*716* WSE-2-7B-S        = ({})", methodOut.getWse27bS().toString()); 
//  DISPLAY '*717*   WSE-2-7B-S-FLD1 = (' WSE-2-7B-S-FLD1 ')'
          logger.info("*717*   WSE-2-7B-S-FLD1 = ({})", new String(methodOut.getWse27bSFld1())); 
//  DISPLAY '*718*   WSE-2-7B-S-FLD2 = (' WSE-2-7B-S-FLD2 ')'
          logger.info("*718*   WSE-2-7B-S-FLD2 = ({})", new String(methodOut.getWse27bSFld2())); 
//  DISPLAY '*719* WSE-2-7B-T-GRP    = (' WSE-2-7B-T-GRP ')'
          logger.info("*719* WSE-2-7B-T-GRP    = ({})", methodOut.getWse27bTGrp().toString()); 
//  DISPLAY '*720* WSE-2-7B-T        = (' WSE-2-7B-T ')'
          logger.info("*720* WSE-2-7B-T        = ({})", methodOut.getWse27bT().toString()); 
//  DISPLAY '*721*   WSE-2-7B-T-FLD1 = (' WSE-2-7B-T-FLD1 ')'
          logger.info("*721*   WSE-2-7B-T-FLD1 = ({})", new String(methodOut.getWse27bTFld1())); 
//  DISPLAY '*722*   WSE-2-7B-T-FLD2 = (' WSE-2-7B-T-FLD2 ')'
          logger.info("*722*   WSE-2-7B-T-FLD2 = ({})", new String(methodOut.getWse27bTFld2())); 
//  DISPLAY '*723*   WSE-2-7B-T-FLD3 = (' WSE-2-7B-T-FLD3 ')'
          logger.info("*723*   WSE-2-7B-T-FLD3 = ({})", new String(methodOut.getWse27bTFld3())); 

// *
// * Src -> string; tgt -> group ; src same size as tgt ; tgtoffset 5
// *
//  INITIALIZE WSE-2-8A-S WSE-2-8A-T
          methodOut.setWse28aS(CONSTANTS.SPACE_60 /* Fill 60 Spaces*/);
          methodOut.getWse28aT().initialize();
          // MOVE ALL 'ABCD' TO WSE-2-8A-S
          methodOut.setWse28aS(CONSTANTS.LITERAL_1122147122);
//  MOVE WSE-2-8A-S ( WS-ONE : LENGTH OF WSE-2-8A-S ) TO WSE-2-8A-T ( WS-ONE : LENGTH OF WSE-2-8A-T )
          methodOut.getWse28aT().replace(methodOut.getWse28aS(),(methodIn.getOne()-1)/* wse28aS */ ,WSE_28A_S_LENGTH, (methodOut.getWse28aT().begin + (methodIn.getOne()-1)) /* wse28aT */,Wse28aT.getWse28aTFieldLength() /* replace,startIndex,targetLen */);

// *
//  DISPLAY '*724* WSE-2-8A-S        = (' WSE-2-8A-S ')'
          logger.info("*724* WSE-2-8A-S        = ({})", new String(methodOut.getWse28aS())); 
//  DISPLAY '*725* WSE-2-8A-T-GRP    = (' WSE-2-8A-T-GRP ')'
          logger.info("*725* WSE-2-8A-T-GRP    = ({})", methodOut.getWse28aTGrp().toString()); 
//  DISPLAY '*726* WSE-2-8A-T        = (' WSE-2-8A-T ')'
          logger.info("*726* WSE-2-8A-T        = ({})", methodOut.getWse28aT().toString()); 
//  DISPLAY '*727*   WSE-2-8A-T-FLD1 = (' WSE-2-8A-T-FLD1 ')'
          logger.info("*727*   WSE-2-8A-T-FLD1 = ({})", new String(methodOut.getWse28aTFld1())); 
//  DISPLAY '*728*   WSE-2-8A-T-FLD2 = (' WSE-2-8A-T-FLD2 ')'
          logger.info("*728*   WSE-2-8A-T-FLD2 = ({})", new String(methodOut.getWse28aTFld2())); 

// *
// * Src -> string; tgt -> group ; src same size as tgt; tgtoffset 5
// *
//  INITIALIZE WSE-2-8B-S WSE-2-8B-T
          methodOut.setWse28bS(CONSTANTS.SPACE_60 /* Fill 60 Spaces*/);
          methodOut.getWse28bT().initialize();
          // MOVE ALL 'ABCD' TO WSE-2-8B-S
          methodOut.setWse28bS(CONSTANTS.LITERAL_1122147122);
//  MOVE ALL 'MNOP' TO WSE-2-8B-T-FLD3
          methodOut.setWse28bTFld3(CONSTANTS.LITERAL_MNOPMNOPMNOPMNOPMNOPMNOPMNOPMNOP);
//  MOVE WSE-2-8B-S ( WS-ONE : LENGTH OF WSE-2-8B-S ) TO WSE-2-8B-T ( WS-ONE : LENGTH OF WSE-2-8B-T )
          methodOut.getWse28bT().replace(methodOut.getWse28bS(),(methodIn.getOne()-1)/* wse28bS */ ,WSE_28B_S_LENGTH, (methodOut.getWse28bT().begin + (methodIn.getOne()-1)) /* wse28bT */,Wse28bT.getWse28bTFieldLength() /* replace,startIndex,targetLen */);

// *
//  DISPLAY '*729* WSE-2-8B-S        = (' WSE-2-8B-S ')'
          logger.info("*729* WSE-2-8B-S        = ({})", new String(methodOut.getWse28bS())); 
//  DISPLAY '*730* WSE-2-8B-T-GRP    = (' WSE-2-8B-T-GRP ')'
          logger.info("*730* WSE-2-8B-T-GRP    = ({})", methodOut.getWse28bTGrp().toString()); 
//  DISPLAY '*731* WSE-2-8B-T        = (' WSE-2-8B-T ')'
          logger.info("*731* WSE-2-8B-T        = ({})", methodOut.getWse28bT().toString()); 
//  DISPLAY '*732*   WSE-2-8B-T-FLD1 = (' WSE-2-8B-T-FLD1 ')'
          logger.info("*732*   WSE-2-8B-T-FLD1 = ({})", new String(methodOut.getWse28bTFld1())); 
//  DISPLAY '*733*   WSE-2-8B-T-FLD2 = (' WSE-2-8B-T-FLD2 ')'
          logger.info("*733*   WSE-2-8B-T-FLD2 = ({})", new String(methodOut.getWse28bTFld2())); 
//  DISPLAY '*734*   WSE-2-8B-T-FLD3 = (' WSE-2-8B-T-FLD3 ')'
          logger.info("*734*   WSE-2-8B-T-FLD3 = ({})", new String(methodOut.getWse28bTFld3())); 

// *
// * Src -> group; tgt -> group ; src same size as tgt
// * source offset 3 ; target offset 5
// *
//  INITIALIZE WSE-2-9A-S WSE-2-9A-T
          methodOut.getWse29aS().initialize();
          methodOut.getWse29aT().initialize();
      
      return methodOut;
      }
      /**
      * mainlineSplit26 
      *   This method is derived from 
  *   COBOL Paragraph - MAINLINE-SPLIT26 COBOL Cyclomatic complexity - 1
      * Input  :  

      * - wse29aS                        COBOL Name: WSE-2-9A-S
      * - wse29aSGrp                     COBOL Name: WSE-2-9A-S-GRP
      * - wse29aTGrp                     COBOL Name: WSE-2-9A-T-GRP
      * - wse29bSGrp                     COBOL Name: WSE-2-9B-S-GRP
      * - wse29bTGrp                     COBOL Name: WSE-2-9B-T-GRP
      * - wse210aSGrp                    COBOL Name: WSE-2-10A-S-GRP
      * - wse210aTGrp                    COBOL Name: WSE-2-10A-T-GRP
      * - wse210bSGrp                    COBOL Name: WSE-2-10B-S-GRP
      * - wse210bTGrp                    COBOL Name: WSE-2-10B-T-GRP
      *
      * Output :  

      * - wse29aSFld1                    COBOL Name: WSE-2-9A-S-FLD1
      * - wse29aSFld2                    COBOL Name: WSE-2-9A-S-FLD2
      * - wse29aT                        COBOL Name: WSE-2-9A-T
      * - wse29aS                        COBOL Name: WSE-2-9A-S
      * - wse29aTFld1                    COBOL Name: WSE-2-9A-T-FLD1
      * - wse29aTFld2                    COBOL Name: WSE-2-9A-T-FLD2
      * - wse29bS                        COBOL Name: WSE-2-9B-S
      * - wse29bT                        COBOL Name: WSE-2-9B-T
      * - wse29bSFld1                    COBOL Name: WSE-2-9B-S-FLD1
      * - wse29bSFld2                    COBOL Name: WSE-2-9B-S-FLD2
      * - wse29bTFld3                    COBOL Name: WSE-2-9B-T-FLD3
      * - wse29bTFld1                    COBOL Name: WSE-2-9B-T-FLD1
      * - wse29bTFld2                    COBOL Name: WSE-2-9B-T-FLD2
      * - wse210aS                       COBOL Name: WSE-2-10A-S
      * - wse210aT                       COBOL Name: WSE-2-10A-T
      * - wse210aTFld1                   COBOL Name: WSE-2-10A-T-FLD1
      * - wse210aTFld2                   COBOL Name: WSE-2-10A-T-FLD2
      * - wse210bS                       COBOL Name: WSE-2-10B-S
      * - wse210bT                       COBOL Name: WSE-2-10B-T
      * - wse210bTFld3                   COBOL Name: WSE-2-10B-T-FLD3
      * - wse210bTFld1                   COBOL Name: WSE-2-10B-T-FLD1
      * - wse210bTFld2                   COBOL Name: WSE-2-10B-T-FLD2
      * - wse211aS                       COBOL Name: WSE-2-11A-S
      * - wse211aT                       COBOL Name: WSE-2-11A-T
      * - wse211aSFld1                   COBOL Name: WSE-2-11A-S-FLD1
      * - wse211aSFld2                   COBOL Name: WSE-2-11A-S-FLD2
      *
      * @throws CFException
      */
      @Override
      public MainlineSplit26OutCtx mainlineSplit26(MainlineSplit26InCtx methodIn) throws Exception {
			// Declare local variables used in the method
			 final int WSE_210A_S_LENGTH = 60;
			 final int WSE_210B_S_LENGTH = 60;
			// End of variable declaration

Refmod3Ctx programCtx = methodIn.getRefmod3Ctx();
MainlineSplit26OutCtx methodOut = methodIn.getMainlineSplit26OutCtx();
//  MOVE ALL 'ABCD' TO WSE-2-9A-S-FLD1
          methodOut.setWse29aSFld1(CONSTANTS.LITERAL_ABCDABCDABCDABCDABCDABCDABCDABCD);
//  MOVE ALL 'ZYXW' TO WSE-2-9A-S-FLD2
          methodOut.setWse29aSFld2(CONSTANTS.LITERAL_ZYXWZYXWZYXWZYXWZYXWZYXWZYXWZYXW);
//  MOVE WSE-2-9A-S ( WS-ONE : LENGTH OF WSE-2-9A-S ) TO WSE-2-9A-T ( WS-ONE : LENGTH OF WSE-2-9A-T )
          methodOut.getWse29aTGrp().replace(methodIn.getWse29aSGrp()/*parent*/,3+methodIn.getOne() - 1/*fromOffset - (wse29aT) */,Wse29aS.getWse29aSFieldLength()/*fromLen*/,5+methodIn.getOne() - 1/*toOffset - (wse29aS) */,Wse29aT.getWse29aTFieldLength()/*toLen*/);

// *
//  DISPLAY '*735* WSE-2-9A-S-GRP    = (' WSE-2-9A-S-GRP ')'
          logger.info("*735* WSE-2-9A-S-GRP    = ({})", methodIn.getWse29aSGrp().toString()); 
//  DISPLAY '*736* WSE-2-9A-S        = (' WSE-2-9A-S ')'
          logger.info("*736* WSE-2-9A-S        = ({})", methodOut.getWse29aS().toString()); 
//  DISPLAY '*737*   WSE-2-9A-S-FLD1 = (' WSE-2-9A-S-FLD1 ')'
          logger.info("*737*   WSE-2-9A-S-FLD1 = ({})", new String(methodOut.getWse29aSFld1())); 
//  DISPLAY '*738*   WSE-2-9A-S-FLD2 = (' WSE-2-9A-S-FLD2 ')'
          logger.info("*738*   WSE-2-9A-S-FLD2 = ({})", new String(methodOut.getWse29aSFld2())); 
//  DISPLAY '*739* WSE-2-9A-T-GRP    = (' WSE-2-9A-T-GRP ')'
          logger.info("*739* WSE-2-9A-T-GRP    = ({})", methodOut.getWse29aTGrp().toString()); 
//  DISPLAY '*740* WSE-2-9A-T        = (' WSE-2-9A-T ')'
          logger.info("*740* WSE-2-9A-T        = ({})", methodOut.getWse29aT().toString()); 
//  DISPLAY '*741*   WSE-2-9A-T-FLD1 = (' WSE-2-9A-T-FLD1 ')'
          logger.info("*741*   WSE-2-9A-T-FLD1 = ({})", new String(methodOut.getWse29aTFld1())); 
//  DISPLAY '*742*   WSE-2-9A-T-FLD2 = (' WSE-2-9A-T-FLD2 ')'
          logger.info("*742*   WSE-2-9A-T-FLD2 = ({})", new String(methodOut.getWse29aTFld2())); 

// *
// * Src -> group; tgt -> group ; src same size as tgt
// * source offset 3 ; target offset 5
// *
//  INITIALIZE WSE-2-9B-S WSE-2-9B-T
          methodOut.getWse29bS().initialize();
          methodOut.getWse29bT().initialize();
//  MOVE ALL 'ABCD' TO WSE-2-9B-S-FLD1
          methodOut.setWse29bSFld1(CONSTANTS.LITERAL_ABCDABCDABCDABCDABCDABCDABCDABCD);
//  MOVE ALL 'ZYXW' TO WSE-2-9B-S-FLD2
          methodOut.setWse29bSFld2(CONSTANTS.LITERAL_ZYXWZYXWZYXWZYXWZYXWZYXWZYXWZYXW);
//  MOVE ALL 'MNOP' TO WSE-2-9B-T-FLD3
          methodOut.setWse29bTFld3(CONSTANTS.LITERAL_MNOPMNOPMNOPMNOPMNOPMNOPMNOPMNOP);
//  MOVE WSE-2-9B-S ( WS-ONE : LENGTH OF WSE-2-9B-S ) TO WSE-2-9B-T ( WS-ONE : LENGTH OF WSE-2-9B-T )
          methodOut.getWse29bTGrp().replace(methodIn.getWse29bSGrp()/*parent*/,3+methodIn.getOne() - 1/*fromOffset - (wse29bT) */,Wse29bS.getWse29bSFieldLength()/*fromLen*/,5+methodIn.getOne() - 1/*toOffset - (wse29bS) */,Wse29bT.getWse29bTFieldLength()/*toLen*/);

// *
//  DISPLAY '*743* WSE-2-9B-S-GRP    = (' WSE-2-9B-S-GRP ')'
          logger.info("*743* WSE-2-9B-S-GRP    = ({})", methodIn.getWse29bSGrp().toString()); 
//  DISPLAY '*744* WSE-2-9B-S        = (' WSE-2-9B-S ')'
          logger.info("*744* WSE-2-9B-S        = ({})", methodOut.getWse29bS().toString()); 
//  DISPLAY '*745*   WSE-2-9B-S-FLD1 = (' WSE-2-9B-S-FLD1 ')'
          logger.info("*745*   WSE-2-9B-S-FLD1 = ({})", new String(methodOut.getWse29bSFld1())); 
//  DISPLAY '*746*   WSE-2-9B-S-FLD2 = (' WSE-2-9B-S-FLD2 ')'
          logger.info("*746*   WSE-2-9B-S-FLD2 = ({})", new String(methodOut.getWse29bSFld2())); 
//  DISPLAY '*747* WSE-2-9B-T-GRP    = (' WSE-2-9B-T-GRP ')'
          logger.info("*747* WSE-2-9B-T-GRP    = ({})", methodOut.getWse29bTGrp().toString()); 
//  DISPLAY '*748* WSE-2-9B-T        = (' WSE-2-9B-T ')'
          logger.info("*748* WSE-2-9B-T        = ({})", methodOut.getWse29bT().toString()); 
//  DISPLAY '*749*   WSE-2-9B-T-FLD1 = (' WSE-2-9B-T-FLD1 ')'
          logger.info("*749*   WSE-2-9B-T-FLD1 = ({})", new String(methodOut.getWse29bTFld1())); 
//  DISPLAY '*750*   WSE-2-9B-T-FLD2 = (' WSE-2-9B-T-FLD2 ')'
          logger.info("*750*   WSE-2-9B-T-FLD2 = ({})", new String(methodOut.getWse29bTFld2())); 
//  DISPLAY '*751*   WSE-2-9B-T-FLD3 = (' WSE-2-9B-T-FLD3 ')'
          logger.info("*751*   WSE-2-9B-T-FLD3 = ({})", new String(methodOut.getWse29bTFld3())); 

// *
// * Src -> string; tgt -> group ; src same size as tgt
// * source offset 3 ; target offset 5
// *
//  INITIALIZE WSE-2-10A-S WSE-2-10A-T
          methodOut.setWse210aS(CONSTANTS.SPACE_60 /* Fill 60 Spaces*/);
          methodOut.getWse210aT().initialize();
//  MOVE ALL 'ABCD' TO WSE-2-10A-S
          methodOut.setWse210aS(CONSTANTS.LITERAL_1122147122);
//  MOVE WSE-2-10A-S ( WS-ONE : LENGTH OF WSE-2-10A-S ) TO WSE-2-10A-T ( WS-ONE : LENGTH OF WSE-2-10A-T )
          methodOut.getWse210aTGrp().replace(methodIn.getWse210aSGrp()/*parent*/,3+methodIn.getOne() - 1/*fromOffset - (wse210aT) */,WSE_210A_S_LENGTH/*fromLen*/,5+methodIn.getOne() - 1/*toOffset - (wse210aS) */,Wse210aT.getWse210aTFieldLength()/*toLen*/);

// *
//  DISPLAY '*752* WSE-2-10A-S-GRP   = (' WSE-2-10A-S-GRP ')'
          logger.info("*752* WSE-2-10A-S-GRP   = ({})", methodIn.getWse210aSGrp().toString()); 
//  DISPLAY '*753* WSE-2-10A-S       = (' WSE-2-10A-S ')'
          logger.info("*753* WSE-2-10A-S       = ({})", new String(methodOut.getWse210aS())); 
//  DISPLAY '*754* WSE-2-10A-T-GRP   = (' WSE-2-10A-T-GRP ')'
          logger.info("*754* WSE-2-10A-T-GRP   = ({})", methodOut.getWse210aTGrp().toString()); 
//  DISPLAY '*755* WSE-2-10A-T       = (' WSE-2-10A-T ')'
          logger.info("*755* WSE-2-10A-T       = ({})", methodOut.getWse210aT().toString()); 
//  DISPLAY '*756*   WSE-2-10A-T-FLD1= (' WSE-2-10A-T-FLD1 ')'
          logger.info("*756*   WSE-2-10A-T-FLD1= ({})", new String(methodOut.getWse210aTFld1())); 
//  DISPLAY '*757*   WSE-2-10A-T-FLD2= (' WSE-2-10A-T-FLD2 ')'
          logger.info("*757*   WSE-2-10A-T-FLD2= ({})", new String(methodOut.getWse210aTFld2())); 

// *
// * Src -> string; tgt -> group ; src same size as tgt
// * source offset 3 ; target offset 5
// *
//  INITIALIZE WSE-2-10B-S WSE-2-10B-T
          methodOut.setWse210bS(CONSTANTS.SPACE_60 /* Fill 60 Spaces*/);
          methodOut.getWse210bT().initialize();
//  MOVE ALL 'ABCD' TO WSE-2-10B-S
          methodOut.setWse210bS(CONSTANTS.LITERAL_1122147122);
//  MOVE ALL 'MNOP' TO WSE-2-10B-T-FLD3
          methodOut.setWse210bTFld3(CONSTANTS.LITERAL_MNOPMNOPMNOPMNOPMNOPMNOPMNOPMNOP);
//  MOVE WSE-2-10B-S ( WS-ONE : LENGTH OF WSE-2-10B-S ) TO WSE-2-10B-T ( WS-ONE : LENGTH OF WSE-2-10B-T )
          methodOut.getWse210bTGrp().replace(methodIn.getWse210bSGrp()/*parent*/,3+methodIn.getOne() - 1/*fromOffset - (wse210bT) */,WSE_210B_S_LENGTH/*fromLen*/,5+methodIn.getOne() - 1/*toOffset - (wse210bS) */,Wse210bT.getWse210bTFieldLength()/*toLen*/);

// *
//  DISPLAY '*758* WSE-2-10B-S-GRP   = (' WSE-2-10B-S-GRP ')'
          logger.info("*758* WSE-2-10B-S-GRP   = ({})", methodIn.getWse210bSGrp().toString()); 
//  DISPLAY '*759* WSE-2-10B-S       = (' WSE-2-10B-S ')'
          logger.info("*759* WSE-2-10B-S       = ({})", new String(methodOut.getWse210bS())); 
//  DISPLAY '*760* WSE-2-10B-T-GRP   = (' WSE-2-10B-T-GRP ')'
          logger.info("*760* WSE-2-10B-T-GRP   = ({})", methodOut.getWse210bTGrp().toString()); 
//  DISPLAY '*761* WSE-2-10B-T       = (' WSE-2-10B-T ')'
          logger.info("*761* WSE-2-10B-T       = ({})", methodOut.getWse210bT().toString()); 
//  DISPLAY '*762*   WSE-2-10B-T-FLD1= (' WSE-2-10B-T-FLD1 ')'
          logger.info("*762*   WSE-2-10B-T-FLD1= ({})", new String(methodOut.getWse210bTFld1())); 
//  DISPLAY '*763*   WSE-2-10B-T-FLD2= (' WSE-2-10B-T-FLD2 ')'
          logger.info("*763*   WSE-2-10B-T-FLD2= ({})", new String(methodOut.getWse210bTFld2())); 
//  DISPLAY '*764*   WSE-2-10B-T-FLD3= (' WSE-2-10B-T-FLD3 ')'
          logger.info("*764*   WSE-2-10B-T-FLD3= ({})", new String(methodOut.getWse210bTFld3())); 

// * Src -> group; tgt -> group ; src same size as tgt
// *    src not refmod;target offset 5
// *
//  INITIALIZE WSE-2-11A-S WSE-2-11A-T
          methodOut.getWse211aS().initialize();
          methodOut.getWse211aT().initialize();
//  MOVE ALL 'ABCD' TO WSE-2-11A-S-FLD1
          methodOut.setWse211aSFld1(CONSTANTS.LITERAL_ABCDABCDABCDABCDABCDABCDABCDABCD);
//  MOVE ALL 'ZYXW' TO WSE-2-11A-S-FLD2
          methodOut.setWse211aSFld2(CONSTANTS.LITERAL_ZYXWZYXWZYXWZYXWZYXWZYXWZYXWZYXW);
//  MOVE WSE-2-11A-S TO WSE-2-11A-T ( WS-ONE : LENGTH OF WSE-2-11A-T )
          methodOut.getWse211aT().replace(methodOut.getWse211aS().getCharArray(),0,methodOut.getWse211aS().length(), (methodOut.getWse211aT().begin + (methodIn.getOne()-1)) ,Wse211aT.getWse211aTFieldLength() /* replace,sourceIndex,sourceLen,targetIndex,targetLen */);

// *
//  DISPLAY '*765* WSE-2-11A-S       = (' WSE-2-11A-S ')'
          logger.info("*765* WSE-2-11A-S       = ({})", methodOut.getWse211aS().toString()); 
//  DISPLAY '*766*   WSE-2-11A-S-FLD1= (' WSE-2-11A-S-FLD1 ')'
          logger.info("*766*   WSE-2-11A-S-FLD1= ({})", new String(methodOut.getWse211aSFld1())); 
      
      return methodOut;
      }
      /**
      * mainlineSplit27 
      *   This method is derived from 
  *   COBOL Paragraph - MAINLINE-SPLIT27 COBOL Cyclomatic complexity - 1
      * Input  :  

      * - wse211aSFld2                   COBOL Name: WSE-2-11A-S-FLD2
      * - wse211aTGrp                    COBOL Name: WSE-2-11A-T-GRP
      * - wse211aT                       COBOL Name: WSE-2-11A-T
      * - wse211aTFld1                   COBOL Name: WSE-2-11A-T-FLD1
      * - wse211aTFld2                   COBOL Name: WSE-2-11A-T-FLD2
      * - wse211bTGrp                    COBOL Name: WSE-2-11B-T-GRP
      * - wse212aTGrp                    COBOL Name: WSE-2-12A-T-GRP
      * - wse212bTGrp                    COBOL Name: WSE-2-12B-T-GRP
      * - wse213aSGrp                    COBOL Name: WSE-2-13A-S-GRP
      * - wse213aTGrp                    COBOL Name: WSE-2-13A-T-GRP
      *
      * Output :  

      * - wse211bS                       COBOL Name: WSE-2-11B-S
      * - wse211bT                       COBOL Name: WSE-2-11B-T
      * - wse211bSFld1                   COBOL Name: WSE-2-11B-S-FLD1
      * - wse211bSFld2                   COBOL Name: WSE-2-11B-S-FLD2
      * - wse211bTFld3                   COBOL Name: WSE-2-11B-T-FLD3
      * - wse211bTFld1                   COBOL Name: WSE-2-11B-T-FLD1
      * - wse211bTFld2                   COBOL Name: WSE-2-11B-T-FLD2
      * - wse212aS                       COBOL Name: WSE-2-12A-S
      * - wse212aT                       COBOL Name: WSE-2-12A-T
      * - wse212aTFld1                   COBOL Name: WSE-2-12A-T-FLD1
      * - wse212aTFld2                   COBOL Name: WSE-2-12A-T-FLD2
      * - wse212bS                       COBOL Name: WSE-2-12B-S
      * - wse212bT                       COBOL Name: WSE-2-12B-T
      * - wse212bTFld3                   COBOL Name: WSE-2-12B-T-FLD3
      * - wse212bTFld1                   COBOL Name: WSE-2-12B-T-FLD1
      * - wse212bTFld2                   COBOL Name: WSE-2-12B-T-FLD2
      * - wse213aS                       COBOL Name: WSE-2-13A-S
      * - wse213aT                       COBOL Name: WSE-2-13A-T
      * - wse213aSFld1                   COBOL Name: WSE-2-13A-S-FLD1
      * - wse213aSFld2                   COBOL Name: WSE-2-13A-S-FLD2
      * - wse213aTFld1                   COBOL Name: WSE-2-13A-T-FLD1
      * - wse213aTFld2                   COBOL Name: WSE-2-13A-T-FLD2
      * - wse213bS                       COBOL Name: WSE-2-13B-S
      * - wse213bT                       COBOL Name: WSE-2-13B-T
      * - wse213bSFld1                   COBOL Name: WSE-2-13B-S-FLD1
      * - wse213bSFld2                   COBOL Name: WSE-2-13B-S-FLD2
      *
      * @throws CFException
      */
      @Override
      public MainlineSplit27OutCtx mainlineSplit27(MainlineSplit27InCtx methodIn) throws Exception {
Refmod3Ctx programCtx = methodIn.getRefmod3Ctx();
MainlineSplit27OutCtx methodOut = methodIn.getMainlineSplit27OutCtx();
//  DISPLAY '*767*   WSE-2-11A-S-FLD2= (' WSE-2-11A-S-FLD2 ')'
          logger.info("*767*   WSE-2-11A-S-FLD2= ({})", new String(methodIn.getWse211aSFld2())); 
//  DISPLAY '*768* WSE-2-11A-T-GRP   = (' WSE-2-11A-T-GRP ')'
          logger.info("*768* WSE-2-11A-T-GRP   = ({})", methodIn.getWse211aTGrp().toString()); 
//  DISPLAY '*769* WSE-2-11A-T       = (' WSE-2-11A-T ')'
          logger.info("*769* WSE-2-11A-T       = ({})", methodIn.getWse211aT().toString()); 
//  DISPLAY '*770*   WSE-2-11A-T-FLD1= (' WSE-2-11A-T-FLD1 ')'
          logger.info("*770*   WSE-2-11A-T-FLD1= ({})", new String(methodIn.getWse211aTFld1())); 
//  DISPLAY '*771*   WSE-2-11A-T-FLD2= (' WSE-2-11A-T-FLD2 ')'
          logger.info("*771*   WSE-2-11A-T-FLD2= ({})", new String(methodIn.getWse211aTFld2())); 

// *
// * Src -> group; tgt -> group ; src same size as tgt
// *    src not refmod;target offset 5
// *
//  INITIALIZE WSE-2-11B-S WSE-2-11B-T
          methodOut.getWse211bS().initialize();
          methodOut.getWse211bT().initialize();
//  MOVE ALL 'ABCD' TO WSE-2-11B-S-FLD1
          methodOut.setWse211bSFld1(CONSTANTS.LITERAL_ABCDABCDABCDABCDABCDABCDABCDABCD);
//  MOVE ALL 'ZYXW' TO WSE-2-11B-S-FLD2
          methodOut.setWse211bSFld2(CONSTANTS.LITERAL_ZYXWZYXWZYXWZYXWZYXWZYXWZYXWZYXW);
//  MOVE ALL 'MNOP' TO WSE-2-11B-T-FLD3
          methodOut.setWse211bTFld3(CONSTANTS.LITERAL_MNOPMNOPMNOPMNOPMNOPMNOPMNOPMNOP);
//  MOVE WSE-2-11B-S TO WSE-2-11B-T ( WS-ONE : LENGTH OF WSE-2-11B-T )
          methodOut.getWse211bT().replace(methodOut.getWse211bS().getCharArray(),0,methodOut.getWse211bS().length(), (methodOut.getWse211bT().begin + (methodIn.getOne()-1)) ,Wse211bT.getWse211bTFieldLength() /* replace,sourceIndex,sourceLen,targetIndex,targetLen */);

// *
//  DISPLAY '*772* WSE-2-11B-S       = (' WSE-2-11B-S ')'
          logger.info("*772* WSE-2-11B-S       = ({})", methodOut.getWse211bS().toString()); 
//  DISPLAY '*773*   WSE-2-11B-S-FLD1= (' WSE-2-11B-S-FLD1 ')'
          logger.info("*773*   WSE-2-11B-S-FLD1= ({})", new String(methodOut.getWse211bSFld1())); 
//  DISPLAY '*774*   WSE-2-11B-S-FLD2= (' WSE-2-11B-S-FLD2 ')'
          logger.info("*774*   WSE-2-11B-S-FLD2= ({})", new String(methodOut.getWse211bSFld2())); 
//  DISPLAY '*775* WSE-2-11B-T-GRP   = (' WSE-2-11B-T-GRP ')'
          logger.info("*775* WSE-2-11B-T-GRP   = ({})", methodOut.getWse211bTGrp().toString()); 
//  DISPLAY '*776* WSE-2-11B-T       = (' WSE-2-11B-T ')'
          logger.info("*776* WSE-2-11B-T       = ({})", methodOut.getWse211bT().toString()); 
//  DISPLAY '*777*   WSE-2-11B-T-FLD1= (' WSE-2-11B-T-FLD1 ')'
          logger.info("*777*   WSE-2-11B-T-FLD1= ({})", new String(methodOut.getWse211bTFld1())); 
//  DISPLAY '*778*   WSE-2-11B-T-FLD2= (' WSE-2-11B-T-FLD2 ')'
          logger.info("*778*   WSE-2-11B-T-FLD2= ({})", new String(methodOut.getWse211bTFld2())); 
//  DISPLAY '*779*   WSE-2-11B-T-FLD3= (' WSE-2-11B-T-FLD3 ')'
          logger.info("*779*   WSE-2-11B-T-FLD3= ({})", new String(methodOut.getWse211bTFld3())); 

// *
// * Src -> string; tgt -> group ; src same size as tgt
// *    src not refmod;target offset 5
// *
//  INITIALIZE WSE-2-12A-S WSE-2-12A-T
          methodOut.setWse212aS(CONSTANTS.SPACE_60 /* Fill 60 Spaces*/);
          methodOut.getWse212aT().initialize();
          // MOVE ALL 'ABCD' TO WSE-2-12A-S
          methodOut.setWse212aS(CONSTANTS.LITERAL_1122147122);
//  MOVE WSE-2-12A-S TO WSE-2-12A-T ( WS-ONE : LENGTH OF WSE-2-12A-T )
          methodOut.getWse212aT().replace(methodOut.getWse212aS(),0,methodOut.getWse212aS().length, (methodOut.getWse212aT().begin + (methodIn.getOne()-1)) /* wse212aT */,Wse212aT.getWse212aTFieldLength() /* replace,sourceIndex,sourceLen,targetIndex,targetLen */);

// *
//  DISPLAY '*780* WSE-2-12A-S       = (' WSE-2-12A-S ')'
          logger.info("*780* WSE-2-12A-S       = ({})", new String(methodOut.getWse212aS())); 
//  DISPLAY '*781* WSE-2-12A-T-GRP   = (' WSE-2-12A-T-GRP ')'
          logger.info("*781* WSE-2-12A-T-GRP   = ({})", methodOut.getWse212aTGrp().toString()); 
//  DISPLAY '*782* WSE-2-12A-T       = (' WSE-2-12A-T ')'
          logger.info("*782* WSE-2-12A-T       = ({})", methodOut.getWse212aT().toString()); 
//  DISPLAY '*783*   WSE-2-12A-T-FLD1= (' WSE-2-12A-T-FLD1 ')'
          logger.info("*783*   WSE-2-12A-T-FLD1= ({})", new String(methodOut.getWse212aTFld1())); 
//  DISPLAY '*784*   WSE-2-12A-T-FLD2= (' WSE-2-12A-T-FLD2 ')'
          logger.info("*784*   WSE-2-12A-T-FLD2= ({})", new String(methodOut.getWse212aTFld2())); 

// *
// * Src -> string; tgt -> group ; src same size as tgt
// *    src not refmod;target offset 5
// *
//  INITIALIZE WSE-2-12B-S WSE-2-12B-T
          methodOut.setWse212bS(CONSTANTS.SPACE_60 /* Fill 60 Spaces*/);
          methodOut.getWse212bT().initialize();
          // MOVE ALL 'ABCD' TO WSE-2-12B-S
          methodOut.setWse212bS(CONSTANTS.LITERAL_1122147122);
//  MOVE ALL 'MNOP' TO WSE-2-12B-T-FLD3
          methodOut.setWse212bTFld3(CONSTANTS.LITERAL_MNOPMNOPMNOPMNOPMNOPMNOPMNOPMNOP);
//  MOVE WSE-2-12B-S TO WSE-2-12B-T ( WS-ONE : LENGTH OF WSE-2-12B-T )
          methodOut.getWse212bT().replace(methodOut.getWse212bS(),0,methodOut.getWse212bS().length, (methodOut.getWse212bT().begin + (methodIn.getOne()-1)) /* wse212bT */,Wse212bT.getWse212bTFieldLength() /* replace,sourceIndex,sourceLen,targetIndex,targetLen */);

// *
//  DISPLAY '*785* WSE-2-12B-S       = (' WSE-2-12B-S ')'
          logger.info("*785* WSE-2-12B-S       = ({})", new String(methodOut.getWse212bS())); 
//  DISPLAY '*786* WSE-2-12B-T-GRP   = (' WSE-2-12B-T-GRP ')'
          logger.info("*786* WSE-2-12B-T-GRP   = ({})", methodOut.getWse212bTGrp().toString()); 
//  DISPLAY '*787* WSE-2-12B-T       = (' WSE-2-12B-T ')'
          logger.info("*787* WSE-2-12B-T       = ({})", methodOut.getWse212bT().toString()); 
//  DISPLAY '*788*   WSE-2-12B-T-FLD1= (' WSE-2-12B-T-FLD1 ')'
          logger.info("*788*   WSE-2-12B-T-FLD1= ({})", new String(methodOut.getWse212bTFld1())); 
//  DISPLAY '*789*   WSE-2-12B-T-FLD2= (' WSE-2-12B-T-FLD2 ')'
          logger.info("*789*   WSE-2-12B-T-FLD2= ({})", new String(methodOut.getWse212bTFld2())); 
//  DISPLAY '*790*   WSE-2-12B-T-FLD3= (' WSE-2-12B-T-FLD3 ')'
          logger.info("*790*   WSE-2-12B-T-FLD3= ({})", new String(methodOut.getWse212bTFld3())); 

// *
// * Src -> group; tgt -> group ; src same size as tgt
// *    src offset 3  ;target offset 5
// *
//  INITIALIZE WSE-2-13A-S WSE-2-13A-T
          methodOut.getWse213aS().initialize();
          methodOut.getWse213aT().initialize();
//  MOVE ALL 'ABCD' TO WSE-2-13A-S-FLD1
          methodOut.setWse213aSFld1(CONSTANTS.LITERAL_ABCDABCDABCDABCDABCDABCDABCDABCD);
//  MOVE ALL 'ZYXW' TO WSE-2-13A-S-FLD2
          methodOut.setWse213aSFld2(CONSTANTS.LITERAL_ZYXWZYXWZYXWZYXWZYXWZYXWZYXWZYXW);
//  MOVE WSE-2-13A-S ( WS-THREE : LENGTH OF WSE-2-13A-S - 3 ) TO WSE-2-13A-T ( WS-FIVE : LENGTH OF WSE-2-13A-T - 5)
          methodOut.getWse213aTGrp().replace(methodIn.getWse213aSGrp()/*parent*/,3+methodIn.getThree() - 1/*fromOffset - (wse213aT) */,Wse213aS.getWse213aSFieldLength() - 3/*fromLen*/,5+methodIn.getFive() - 1/*toOffset - (wse213aS) */,Wse213aT.getWse213aTFieldLength() - 5/*toLen*/);

// *
//  DISPLAY '*791* WSE-2-13A-S-GRP   = (' WSE-2-13A-S-GRP ')'
          logger.info("*791* WSE-2-13A-S-GRP   = ({})", methodIn.getWse213aSGrp().toString()); 
//  DISPLAY '*792* WSE-2-13A-S       = (' WSE-2-13A-S ')'
          logger.info("*792* WSE-2-13A-S       = ({})", methodOut.getWse213aS().toString()); 
//  DISPLAY '*793*   WSE-2-13A-S-FLD1= (' WSE-2-13A-S-FLD1 ')'
          logger.info("*793*   WSE-2-13A-S-FLD1= ({})", new String(methodOut.getWse213aSFld1())); 
//  DISPLAY '*794*   WSE-2-13A-S-FLD2= (' WSE-2-13A-S-FLD2 ')'
          logger.info("*794*   WSE-2-13A-S-FLD2= ({})", new String(methodOut.getWse213aSFld2())); 
//  DISPLAY '*795* WSE-2-13A-T-GRP   = (' WSE-2-13A-T-GRP ')'
          logger.info("*795* WSE-2-13A-T-GRP   = ({})", methodOut.getWse213aTGrp().toString()); 
//  DISPLAY '*796* WSE-2-13A-T       = (' WSE-2-13A-T ')'
          logger.info("*796* WSE-2-13A-T       = ({})", methodOut.getWse213aT().toString()); 
//  DISPLAY '*797*   WSE-2-13A-T-FLD1= (' WSE-2-13A-T-FLD1 ')'
          logger.info("*797*   WSE-2-13A-T-FLD1= ({})", new String(methodOut.getWse213aTFld1())); 
//  DISPLAY '*798*   WSE-2-13A-T-FLD2= (' WSE-2-13A-T-FLD2 ')'
          logger.info("*798*   WSE-2-13A-T-FLD2= ({})", new String(methodOut.getWse213aTFld2())); 

// *
// * Src -> group; tgt -> group ; src same size as tgt
// *    src offset 3  ;target offset 5
// *
//  INITIALIZE WSE-2-13B-S WSE-2-13B-T
          methodOut.getWse213bS().initialize();
          methodOut.getWse213bT().initialize();
//  MOVE ALL 'ABCD' TO WSE-2-13B-S-FLD1
          methodOut.setWse213bSFld1(CONSTANTS.LITERAL_ABCDABCDABCDABCDABCDABCDABCDABCD);
//  MOVE ALL 'ZYXW' TO WSE-2-13B-S-FLD2
          methodOut.setWse213bSFld2(CONSTANTS.LITERAL_ZYXWZYXWZYXWZYXWZYXWZYXWZYXWZYXW);
      
      return methodOut;
      }
      /**
      * mainlineSplit28 
      *   This method is derived from 
  *   COBOL Paragraph - MAINLINE-SPLIT28 COBOL Cyclomatic complexity - 1
      * Input  :  

      * - wse213bS                       COBOL Name: WSE-2-13B-S
      * - wse213bSGrp                    COBOL Name: WSE-2-13B-S-GRP
      * - wse213bTGrp                    COBOL Name: WSE-2-13B-T-GRP
      * - wse214aSGrp                    COBOL Name: WSE-2-14A-S-GRP
      * - wse214aTGrp                    COBOL Name: WSE-2-14A-T-GRP
      * - wse214bSGrp                    COBOL Name: WSE-2-14B-S-GRP
      * - wse214bTGrp                    COBOL Name: WSE-2-14B-T-GRP
      * - wse215aSGrp                    COBOL Name: WSE-2-15A-S-GRP
      * - wse215bSGrp                    COBOL Name: WSE-2-15B-S-GRP
      *
      * Output :  

      * - wse213bTFld3                   COBOL Name: WSE-2-13B-T-FLD3
      * - wse213bT                       COBOL Name: WSE-2-13B-T
      * - wse213bS                       COBOL Name: WSE-2-13B-S
      * - wse213bSFld1                   COBOL Name: WSE-2-13B-S-FLD1
      * - wse213bSFld2                   COBOL Name: WSE-2-13B-S-FLD2
      * - wse213bTFld1                   COBOL Name: WSE-2-13B-T-FLD1
      * - wse213bTFld2                   COBOL Name: WSE-2-13B-T-FLD2
      * - wse214aS                       COBOL Name: WSE-2-14A-S
      * - wse214aT                       COBOL Name: WSE-2-14A-T
      * - wse214aTFld1                   COBOL Name: WSE-2-14A-T-FLD1
      * - wse214aTFld2                   COBOL Name: WSE-2-14A-T-FLD2
      * - wse214bS                       COBOL Name: WSE-2-14B-S
      * - wse214bT                       COBOL Name: WSE-2-14B-T
      * - wse214bTFld3                   COBOL Name: WSE-2-14B-T-FLD3
      * - wse214bTFld1                   COBOL Name: WSE-2-14B-T-FLD1
      * - wse214bTFld2                   COBOL Name: WSE-2-14B-T-FLD2
      * - wse215aS                       COBOL Name: WSE-2-15A-S
      * - wse215aT                       COBOL Name: WSE-2-15A-T
      * - wse215aSFld1                   COBOL Name: WSE-2-15A-S-FLD1
      * - wse215aSFld2                   COBOL Name: WSE-2-15A-S-FLD2
      * - wse215aTFld1                   COBOL Name: WSE-2-15A-T-FLD1
      * - wse215aTFld2                   COBOL Name: WSE-2-15A-T-FLD2
      * - wse215bS                       COBOL Name: WSE-2-15B-S
      * - wse215bT                       COBOL Name: WSE-2-15B-T
      * - wse215bSFld1                   COBOL Name: WSE-2-15B-S-FLD1
      * - wse215bSFld2                   COBOL Name: WSE-2-15B-S-FLD2
      * - wse215bTFld3                   COBOL Name: WSE-2-15B-T-FLD3
      *
      * @throws CFException
      */
      @Override
      public MainlineSplit28OutCtx mainlineSplit28(MainlineSplit28InCtx methodIn) throws Exception {
			// Declare local variables used in the method
			 final int WSE_214A_S_LENGTH = 60;
			 final int WSE_214B_S_LENGTH = 60;
			// End of variable declaration

Refmod3Ctx programCtx = methodIn.getRefmod3Ctx();
MainlineSplit28OutCtx methodOut = methodIn.getMainlineSplit28OutCtx();
//  MOVE ALL 'MNOP' TO WSE-2-13B-T-FLD3
          methodOut.setWse213bTFld3(CONSTANTS.LITERAL_MNOPMNOPMNOPMNOPMNOPMNOPMNOPMNOP);
//  MOVE WSE-2-13B-S ( WS-THREE : LENGTH OF WSE-2-13B-S - 3 ) TO WSE-2-13B-T ( WS-FIVE : LENGTH OF WSE-2-13B-T - 5)
          methodOut.getWse213bTGrp().replace(methodIn.getWse213bSGrp()/*parent*/,3+methodIn.getThree() - 1/*fromOffset - (wse213bT) */,Wse213bS.getWse213bSFieldLength() - 3/*fromLen*/,5+methodIn.getFive() - 1/*toOffset - (wse213bS) */,Wse213bT.getWse213bTFieldLength() - 5/*toLen*/);

// *
//  DISPLAY '*799* WSE-2-13B-S-GRP   = (' WSE-2-13B-S-GRP ')'
          logger.info("*799* WSE-2-13B-S-GRP   = ({})", methodIn.getWse213bSGrp().toString()); 
//  DISPLAY '*800* WSE-2-13B-S       = (' WSE-2-13B-S ')'
          logger.info("*800* WSE-2-13B-S       = ({})", methodOut.getWse213bS().toString()); 
//  DISPLAY '*801*   WSE-2-13B-S-FLD1= (' WSE-2-13B-S-FLD1 ')'
          logger.info("*801*   WSE-2-13B-S-FLD1= ({})", new String(methodOut.getWse213bSFld1())); 
//  DISPLAY '*802*   WSE-2-13B-S-FLD2= (' WSE-2-13B-S-FLD2 ')'
          logger.info("*802*   WSE-2-13B-S-FLD2= ({})", new String(methodOut.getWse213bSFld2())); 
//  DISPLAY '*803* WSE-2-13B-T-GRP   = (' WSE-2-13B-T-GRP ')'
          logger.info("*803* WSE-2-13B-T-GRP   = ({})", methodOut.getWse213bTGrp().toString()); 
//  DISPLAY '*804* WSE-2-13B-T       = (' WSE-2-13B-T ')'
          logger.info("*804* WSE-2-13B-T       = ({})", methodOut.getWse213bT().toString()); 
//  DISPLAY '*805*   WSE-2-13B-T-FLD1= (' WSE-2-13B-T-FLD1 ')'
          logger.info("*805*   WSE-2-13B-T-FLD1= ({})", new String(methodOut.getWse213bTFld1())); 
//  DISPLAY '*806*   WSE-2-13B-T-FLD2= (' WSE-2-13B-T-FLD2 ')'
          logger.info("*806*   WSE-2-13B-T-FLD2= ({})", new String(methodOut.getWse213bTFld2())); 
//  DISPLAY '*807*   WSE-2-13B-T-FLD3= (' WSE-2-13B-T-FLD3 ')'
          logger.info("*807*   WSE-2-13B-T-FLD3= ({})", new String(methodOut.getWse213bTFld3())); 

// *
// * Src -> string; tgt -> group ; src same size as tgt
// *    src offset 3  ;target offset 5
// *
//  INITIALIZE WSE-2-14A-S WSE-2-14A-T
          methodOut.setWse214aS(CONSTANTS.SPACE_60 /* Fill 60 Spaces*/);
          methodOut.getWse214aT().initialize();
//  MOVE ALL 'ABCD' TO WSE-2-14A-S
          methodOut.setWse214aS(CONSTANTS.LITERAL_1122147122);
//  MOVE WSE-2-14A-S ( WS-THREE : LENGTH OF WSE-2-14A-S - 3 ) TO WSE-2-14A-T ( WS-FIVE : LENGTH OF WSE-2-14A-T - 5)
          methodOut.getWse214aTGrp().replace(methodIn.getWse214aSGrp()/*parent*/,3+methodIn.getThree() - 1/*fromOffset - (wse214aT) */,WSE_214A_S_LENGTH - 3/*fromLen*/,5+methodIn.getFive() - 1/*toOffset - (wse214aS) */,Wse214aT.getWse214aTFieldLength() - 5/*toLen*/);

// *
//  DISPLAY '*808* WSE-2-14A-S-GRP   = (' WSE-2-14A-S-GRP ')'
          logger.info("*808* WSE-2-14A-S-GRP   = ({})", methodIn.getWse214aSGrp().toString()); 
//  DISPLAY '*809* WSE-2-14A-S       = (' WSE-2-14A-S ')'
          logger.info("*809* WSE-2-14A-S       = ({})", new String(methodOut.getWse214aS())); 
//  DISPLAY '*810* WSE-2-14A-T-GRP   = (' WSE-2-14A-T-GRP ')'
          logger.info("*810* WSE-2-14A-T-GRP   = ({})", methodOut.getWse214aTGrp().toString()); 
//  DISPLAY '*811* WSE-2-14A-T       = (' WSE-2-14A-T ')'
          logger.info("*811* WSE-2-14A-T       = ({})", methodOut.getWse214aT().toString()); 
//  DISPLAY '*812*   WSE-2-14A-T-FLD1= (' WSE-2-14A-T-FLD1 ')'
          logger.info("*812*   WSE-2-14A-T-FLD1= ({})", new String(methodOut.getWse214aTFld1())); 
//  DISPLAY '*813*   WSE-2-14A-T-FLD2= (' WSE-2-14A-T-FLD2 ')'
          logger.info("*813*   WSE-2-14A-T-FLD2= ({})", new String(methodOut.getWse214aTFld2())); 

// *
// * Src -> string; tgt -> group ; src same size as tgt
// *    src offset 3  ;target offset 5
// *
//  INITIALIZE WSE-2-14B-S WSE-2-14B-T
          methodOut.setWse214bS(CONSTANTS.SPACE_60 /* Fill 60 Spaces*/);
          methodOut.getWse214bT().initialize();
//  MOVE ALL 'ABCD' TO WSE-2-14B-S
          methodOut.setWse214bS(CONSTANTS.LITERAL_1122147122);
//  MOVE ALL 'MNOP' TO WSE-2-14B-T-FLD3
          methodOut.setWse214bTFld3(CONSTANTS.LITERAL_MNOPMNOPMNOPMNOPMNOPMNOPMNOPMNOP);
//  MOVE WSE-2-14B-S ( WS-THREE : LENGTH OF WSE-2-14B-S - 3 ) TO WSE-2-14B-T ( WS-FIVE : LENGTH OF WSE-2-14B-T - 5)
          methodOut.getWse214bTGrp().replace(methodIn.getWse214bSGrp()/*parent*/,3+methodIn.getThree() - 1/*fromOffset - (wse214bT) */,WSE_214B_S_LENGTH - 3/*fromLen*/,5+methodIn.getFive() - 1/*toOffset - (wse214bS) */,Wse214bT.getWse214bTFieldLength() - 5/*toLen*/);

// *
//  DISPLAY '*814* WSE-2-14B-S-GRP   = (' WSE-2-14B-S-GRP ')'
          logger.info("*814* WSE-2-14B-S-GRP   = ({})", methodIn.getWse214bSGrp().toString()); 
//  DISPLAY '*815* WSE-2-14B-S       = (' WSE-2-14B-S ')'
          logger.info("*815* WSE-2-14B-S       = ({})", new String(methodOut.getWse214bS())); 
//  DISPLAY '*816* WSE-2-14B-T-GRP   = (' WSE-2-14B-T-GRP ')'
          logger.info("*816* WSE-2-14B-T-GRP   = ({})", methodOut.getWse214bTGrp().toString()); 
//  DISPLAY '*817* WSE-2-14B-T       = (' WSE-2-14B-T ')'
          logger.info("*817* WSE-2-14B-T       = ({})", methodOut.getWse214bT().toString()); 
//  DISPLAY '*818*   WSE-2-14B-T-FLD1= (' WSE-2-14B-T-FLD1 ')'
          logger.info("*818*   WSE-2-14B-T-FLD1= ({})", new String(methodOut.getWse214bTFld1())); 
//  DISPLAY '*819*   WSE-2-14B-T-FLD2= (' WSE-2-14B-T-FLD2 ')'
          logger.info("*819*   WSE-2-14B-T-FLD2= ({})", new String(methodOut.getWse214bTFld2())); 
//  DISPLAY '*820*   WSE-2-14B-T-FLD3= (' WSE-2-14B-T-FLD3 ')'
          logger.info("*820*   WSE-2-14B-T-FLD3= ({})", new String(methodOut.getWse214bTFld3())); 

// *
// * Src -> group; tgt -> group ; src same size as tgt
// *    src offset 3  ;target offset 0
// *
//  INITIALIZE WSE-2-15A-S WSE-2-15A-T
          methodOut.getWse215aS().initialize();
          methodOut.getWse215aT().initialize();
//  MOVE ALL 'ABCD' TO WSE-2-15A-S-FLD1
          methodOut.setWse215aSFld1(CONSTANTS.LITERAL_ABCDABCDABCDABCDABCDABCDABCDABCD);
//  MOVE ALL 'ZYXW' TO WSE-2-15A-S-FLD2
          methodOut.setWse215aSFld2(CONSTANTS.LITERAL_ZYXWZYXWZYXWZYXWZYXWZYXWZYXWZYXW);
//  MOVE WSE-2-15A-S ( WS-THREE : LENGTH OF WSE-2-15A-S - 3 ) TO WSE-2-15A-T ( WS-FIVE : LENGTH OF WSE-2-15A-T - 5)
          methodOut.getWse215aT().replace(methodIn.getWse215aSGrp()/*parent*/,3+methodIn.getThree() - 1/*fromOffset - (wse215aT) */,Wse215aS.getWse215aSFieldLength() - 3/*fromLen*/,0+methodIn.getFive() - 1/*toOffset - (wse215aS) */,Wse215aT.getWse215aTFieldLength() - 5/*toLen*/);

// *
//  DISPLAY '*821* WSE-2-15A-S-GRP   = (' WSE-2-15A-S-GRP ')'
          logger.info("*821* WSE-2-15A-S-GRP   = ({})", methodIn.getWse215aSGrp().toString()); 
//  DISPLAY '*822* WSE-2-15A-S       = (' WSE-2-15A-S ')'
          logger.info("*822* WSE-2-15A-S       = ({})", methodOut.getWse215aS().toString()); 
//  DISPLAY '*823*   WSE-2-15A-S-FLD1= (' WSE-2-15A-S-FLD1 ')'
          logger.info("*823*   WSE-2-15A-S-FLD1= ({})", new String(methodOut.getWse215aSFld1())); 
//  DISPLAY '*824*   WSE-2-15A-S-FLD2= (' WSE-2-15A-S-FLD2 ')'
          logger.info("*824*   WSE-2-15A-S-FLD2= ({})", new String(methodOut.getWse215aSFld2())); 
//  DISPLAY '*825* WSE-2-15A-T       = (' WSE-2-15A-T ')'
          logger.info("*825* WSE-2-15A-T       = ({})", methodOut.getWse215aT().toString()); 
//  DISPLAY '*826*   WSE-2-15A-T-FLD1= (' WSE-2-15A-T-FLD1 ')'
          logger.info("*826*   WSE-2-15A-T-FLD1= ({})", new String(methodOut.getWse215aTFld1())); 
//  DISPLAY '*827*   WSE-2-15A-T-FLD2= (' WSE-2-15A-T-FLD2 ')'
          logger.info("*827*   WSE-2-15A-T-FLD2= ({})", new String(methodOut.getWse215aTFld2())); 

// *
// * Src -> group; tgt -> group ; src same size as tgt
// *    src offset 3  ;target offset 0
// *
//  INITIALIZE WSE-2-15B-S WSE-2-15B-T
          methodOut.getWse215bS().initialize();
          methodOut.getWse215bT().initialize();
//  MOVE ALL 'ABCD' TO WSE-2-15B-S-FLD1
          methodOut.setWse215bSFld1(CONSTANTS.LITERAL_ABCDABCDABCDABCDABCDABCDABCDABCD);
//  MOVE ALL 'ZYXW' TO WSE-2-15B-S-FLD2
          methodOut.setWse215bSFld2(CONSTANTS.LITERAL_ZYXWZYXWZYXWZYXWZYXWZYXWZYXWZYXW);
//  MOVE ALL 'MNOP' TO WSE-2-15B-T-FLD3
          methodOut.setWse215bTFld3(CONSTANTS.LITERAL_MNOPMNOPMNOPMNOPMNOPMNOPMNOPMNOP);
//  MOVE WSE-2-15B-S ( WS-THREE : LENGTH OF WSE-2-15B-S - 3 ) TO WSE-2-15B-T ( WS-FIVE : LENGTH OF WSE-2-15B-T - 5)
          methodOut.getWse215bT().replace(methodIn.getWse215bSGrp()/*parent*/,3+methodIn.getThree() - 1/*fromOffset - (wse215bT) */,Wse215bS.getWse215bSFieldLength() - 3/*fromLen*/,0+methodIn.getFive() - 1/*toOffset - (wse215bS) */,Wse215bT.getWse215bTFieldLength() - 5/*toLen*/);

// *
//  DISPLAY '*828* WSE-2-15B-S-GRP   = (' WSE-2-15B-S-GRP ')'
          logger.info("*828* WSE-2-15B-S-GRP   = ({})", methodIn.getWse215bSGrp().toString()); 
//  DISPLAY '*829* WSE-2-15B-S       = (' WSE-2-15B-S ')'
          logger.info("*829* WSE-2-15B-S       = ({})", methodOut.getWse215bS().toString()); 
//  DISPLAY '*830*   WSE-2-15B-S-FLD1= (' WSE-2-15B-S-FLD1 ')'
          logger.info("*830*   WSE-2-15B-S-FLD1= ({})", new String(methodOut.getWse215bSFld1())); 
//  DISPLAY '*831*   WSE-2-15B-S-FLD2= (' WSE-2-15B-S-FLD2 ')'
          logger.info("*831*   WSE-2-15B-S-FLD2= ({})", new String(methodOut.getWse215bSFld2())); 
      
      return methodOut;
      }
      /**
      * mainlineSplit29 
      *   This method is derived from 
  *   COBOL Paragraph - MAINLINE-SPLIT29 COBOL Cyclomatic complexity - 1
      * Input  :  

      * - wse215bT                       COBOL Name: WSE-2-15B-T
      * - wse215bTFld1                   COBOL Name: WSE-2-15B-T-FLD1
      * - wse215bTFld2                   COBOL Name: WSE-2-15B-T-FLD2
      * - wse215bTFld3                   COBOL Name: WSE-2-15B-T-FLD3
      * - wse216aSGrp                    COBOL Name: WSE-2-16A-S-GRP
      * - wse216bSGrp                    COBOL Name: WSE-2-16B-S-GRP
      * - wse217aTGrp                    COBOL Name: WSE-2-17A-T-GRP
      * - wse217bTGrp                    COBOL Name: WSE-2-17B-T-GRP
      * - wse218aTGrp                    COBOL Name: WSE-2-18A-T-GRP
      *
      * Output :  

      * - wse216aS                       COBOL Name: WSE-2-16A-S
      * - wse216aT                       COBOL Name: WSE-2-16A-T
      * - wse216aTFld1                   COBOL Name: WSE-2-16A-T-FLD1
      * - wse216aTFld2                   COBOL Name: WSE-2-16A-T-FLD2
      * - wse216bS                       COBOL Name: WSE-2-16B-S
      * - wse216bT                       COBOL Name: WSE-2-16B-T
      * - wse216bTFld3                   COBOL Name: WSE-2-16B-T-FLD3
      * - wse216bTFld1                   COBOL Name: WSE-2-16B-T-FLD1
      * - wse216bTFld2                   COBOL Name: WSE-2-16B-T-FLD2
      * - wse217aS                       COBOL Name: WSE-2-17A-S
      * - wse217aT                       COBOL Name: WSE-2-17A-T
      * - wse217aSFld1                   COBOL Name: WSE-2-17A-S-FLD1
      * - wse217aSFld2                   COBOL Name: WSE-2-17A-S-FLD2
      * - wse217aTFld1                   COBOL Name: WSE-2-17A-T-FLD1
      * - wse217aTFld2                   COBOL Name: WSE-2-17A-T-FLD2
      * - wse217bS                       COBOL Name: WSE-2-17B-S
      * - wse217bT                       COBOL Name: WSE-2-17B-T
      * - wse217bSFld1                   COBOL Name: WSE-2-17B-S-FLD1
      * - wse217bSFld2                   COBOL Name: WSE-2-17B-S-FLD2
      * - wse217bTFld3                   COBOL Name: WSE-2-17B-T-FLD3
      * - wse217bTFld1                   COBOL Name: WSE-2-17B-T-FLD1
      * - wse217bTFld2                   COBOL Name: WSE-2-17B-T-FLD2
      * - wse218aS                       COBOL Name: WSE-2-18A-S
      * - wse218aT                       COBOL Name: WSE-2-18A-T
      *
      * @throws CFException
      */
      @Override
      public MainlineSplit29OutCtx mainlineSplit29(MainlineSplit29InCtx methodIn) throws Exception {
			// Declare local variables used in the method
			 final int WSE_216A_S_LENGTH = 60;
			 final int WSE_216B_S_LENGTH = 60;
			 final int WSE_218A_S_LENGTH = 60;
			// End of variable declaration

Refmod3Ctx programCtx = methodIn.getRefmod3Ctx();
MainlineSplit29OutCtx methodOut = methodIn.getMainlineSplit29OutCtx();
//  DISPLAY '*832* WSE-2-15B-T       = (' WSE-2-15B-T ')'
          logger.info("*832* WSE-2-15B-T       = ({})", methodIn.getWse215bT().toString()); 
//  DISPLAY '*833*   WSE-2-15B-T-FLD1= (' WSE-2-15B-T-FLD1 ')'
          logger.info("*833*   WSE-2-15B-T-FLD1= ({})", new String(methodIn.getWse215bTFld1())); 
//  DISPLAY '*834*   WSE-2-15B-T-FLD2= (' WSE-2-15B-T-FLD2 ')'
          logger.info("*834*   WSE-2-15B-T-FLD2= ({})", new String(methodIn.getWse215bTFld2())); 
//  DISPLAY '*835*   WSE-2-15B-T-FLD3= (' WSE-2-15B-T-FLD3 ')'
          logger.info("*835*   WSE-2-15B-T-FLD3= ({})", new String(methodIn.getWse215bTFld3())); 

// *
// * Src -> string; tgt -> group ; src same size as tgt
// *    src offset 3  ;target offset 0
// *
//  INITIALIZE WSE-2-16A-S WSE-2-16A-T
          methodOut.setWse216aS(CONSTANTS.SPACE_60 /* Fill 60 Spaces*/);
          methodOut.getWse216aT().initialize();
//  MOVE ALL 'ABCD' TO WSE-2-16A-S
          methodOut.setWse216aS(CONSTANTS.LITERAL_1122147122);
//  MOVE WSE-2-16A-S ( WS-THREE : LENGTH OF WSE-2-16A-S - 3 ) TO WSE-2-16A-T ( WS-FIVE : LENGTH OF WSE-2-16A-T - 5)
          methodOut.getWse216aT().replace(methodIn.getWse216aSGrp()/*parent*/,3+methodIn.getThree() - 1/*fromOffset - (wse216aT) */,WSE_216A_S_LENGTH - 3/*fromLen*/,0+methodIn.getFive() - 1/*toOffset - (wse216aS) */,Wse216aT.getWse216aTFieldLength() - 5/*toLen*/);

// *
//  DISPLAY '*836* WSE-2-16A-S-GRP   = (' WSE-2-16A-S-GRP ')'
          logger.info("*836* WSE-2-16A-S-GRP   = ({})", methodIn.getWse216aSGrp().toString()); 
//  DISPLAY '*837* WSE-2-16A-S       = (' WSE-2-16A-S ')'
          logger.info("*837* WSE-2-16A-S       = ({})", new String(methodOut.getWse216aS())); 
//  DISPLAY '*838* WSE-2-16A-T       = (' WSE-2-16A-T ')'
          logger.info("*838* WSE-2-16A-T       = ({})", methodOut.getWse216aT().toString()); 
//  DISPLAY '*839*   WSE-2-16A-T-FLD1= (' WSE-2-16A-T-FLD1 ')'
          logger.info("*839*   WSE-2-16A-T-FLD1= ({})", new String(methodOut.getWse216aTFld1())); 
//  DISPLAY '*840*   WSE-2-16A-T-FLD2= (' WSE-2-16A-T-FLD2 ')'
          logger.info("*840*   WSE-2-16A-T-FLD2= ({})", new String(methodOut.getWse216aTFld2())); 

// *
// * Src -> string; tgt -> group ; src same size as tgt
// *    src offset 3  ;target offset 0
// *
//  INITIALIZE WSE-2-16B-S WSE-2-16B-T
          methodOut.setWse216bS(CONSTANTS.SPACE_60 /* Fill 60 Spaces*/);
          methodOut.getWse216bT().initialize();
//  MOVE ALL 'ABCD' TO WSE-2-16B-S
          methodOut.setWse216bS(CONSTANTS.LITERAL_1122147122);
//  MOVE ALL 'MNOP' TO WSE-2-16B-T-FLD3
          methodOut.setWse216bTFld3(CONSTANTS.LITERAL_MNOPMNOPMNOPMNOPMNOPMNOPMNOPMNOP);
//  MOVE WSE-2-16B-S ( WS-THREE : LENGTH OF WSE-2-16B-S - 3 ) TO WSE-2-16B-T ( WS-FIVE : LENGTH OF WSE-2-16B-T - 5)
          methodOut.getWse216bT().replace(methodIn.getWse216bSGrp()/*parent*/,3+methodIn.getThree() - 1/*fromOffset - (wse216bT) */,WSE_216B_S_LENGTH - 3/*fromLen*/,0+methodIn.getFive() - 1/*toOffset - (wse216bS) */,Wse216bT.getWse216bTFieldLength() - 5/*toLen*/);

// *
//  DISPLAY '*841* WSE-2-16B-S-GRP   = (' WSE-2-16B-S-GRP ')'
          logger.info("*841* WSE-2-16B-S-GRP   = ({})", methodIn.getWse216bSGrp().toString()); 
//  DISPLAY '*842* WSE-2-16B-S       = (' WSE-2-16B-S ')'
          logger.info("*842* WSE-2-16B-S       = ({})", new String(methodOut.getWse216bS())); 
//  DISPLAY '*843* WSE-2-16B-T       = (' WSE-2-16B-T ')'
          logger.info("*843* WSE-2-16B-T       = ({})", methodOut.getWse216bT().toString()); 
//  DISPLAY '*844*   WSE-2-16B-T-FLD1= (' WSE-2-16B-T-FLD1 ')'
          logger.info("*844*   WSE-2-16B-T-FLD1= ({})", new String(methodOut.getWse216bTFld1())); 
//  DISPLAY '*845*   WSE-2-16B-T-FLD2= (' WSE-2-16B-T-FLD2 ')'
          logger.info("*845*   WSE-2-16B-T-FLD2= ({})", new String(methodOut.getWse216bTFld2())); 
//  DISPLAY '*846*   WSE-2-16B-T-FLD3= (' WSE-2-16B-T-FLD3 ')'
          logger.info("*846*   WSE-2-16B-T-FLD3= ({})", new String(methodOut.getWse216bTFld3())); 

// *
// * Src -> group; tgt -> group ; src same size as tgt
// *    src offset 0  ;target offset 5
// *
//  INITIALIZE WSE-2-17A-S WSE-2-17A-T
          methodOut.getWse217aS().initialize();
          methodOut.getWse217aT().initialize();
//  MOVE ALL 'ABCD' TO WSE-2-17A-S-FLD1
          methodOut.setWse217aSFld1(CONSTANTS.LITERAL_ABCDABCDABCDABCDABCDABCDABCDABCD);
//  MOVE ALL 'ZYXW' TO WSE-2-17A-S-FLD2
          methodOut.setWse217aSFld2(CONSTANTS.LITERAL_ZYXWZYXWZYXWZYXWZYXWZYXWZYXWZYXW);
//  MOVE WSE-2-17A-S ( WS-THREE : LENGTH OF WSE-2-17A-S - 3 ) TO WSE-2-17A-T ( WS-FIVE : LENGTH OF WSE-2-17A-T - 5)
          methodOut.getWse217aT().replace(methodOut.getWse217aS(),(methodIn.getThree()-1),Wse217aS.getWse217aSFieldLength() - 3, (methodOut.getWse217aT().begin + (methodIn.getFive()-1)) ,Wse217aT.getWse217aTFieldLength() - 5 /* replace,sourceIndex,sourceLen,targetIndex,targetLen */);

// *
//  DISPLAY '*847* WSE-2-17A-S       = (' WSE-2-17A-S ')'
          logger.info("*847* WSE-2-17A-S       = ({})", methodOut.getWse217aS().toString()); 
//  DISPLAY '*848*   WSE-2-17A-S-FLD1= (' WSE-2-17A-S-FLD1 ')'
          logger.info("*848*   WSE-2-17A-S-FLD1= ({})", new String(methodOut.getWse217aSFld1())); 
//  DISPLAY '*849*   WSE-2-17A-S-FLD2= (' WSE-2-17A-S-FLD2 ')'
          logger.info("*849*   WSE-2-17A-S-FLD2= ({})", new String(methodOut.getWse217aSFld2())); 
//  DISPLAY '*850* WSE-2-17A-T-GRP   = (' WSE-2-17A-T-GRP ')'
          logger.info("*850* WSE-2-17A-T-GRP   = ({})", methodOut.getWse217aTGrp().toString()); 
//  DISPLAY '*851* WSE-2-17A-T       = (' WSE-2-17A-T ')'
          logger.info("*851* WSE-2-17A-T       = ({})", methodOut.getWse217aT().toString()); 
//  DISPLAY '*852*   WSE-2-17A-T-FLD1= (' WSE-2-17A-T-FLD1 ')'
          logger.info("*852*   WSE-2-17A-T-FLD1= ({})", new String(methodOut.getWse217aTFld1())); 
//  DISPLAY '*853*   WSE-2-17A-T-FLD2= (' WSE-2-17A-T-FLD2 ')'
          logger.info("*853*   WSE-2-17A-T-FLD2= ({})", new String(methodOut.getWse217aTFld2())); 

// *
// * Src -> group; tgt -> group ; src same size as tgt
// *    src offset 0  ;target offset 5
// *
//  INITIALIZE WSE-2-17B-S WSE-2-17B-T
          methodOut.getWse217bS().initialize();
          methodOut.getWse217bT().initialize();
//  MOVE ALL 'ABCD' TO WSE-2-17B-S-FLD1
          methodOut.setWse217bSFld1(CONSTANTS.LITERAL_ABCDABCDABCDABCDABCDABCDABCDABCD);
//  MOVE ALL 'ZYXW' TO WSE-2-17B-S-FLD2
          methodOut.setWse217bSFld2(CONSTANTS.LITERAL_ZYXWZYXWZYXWZYXWZYXWZYXWZYXWZYXW);
//  MOVE ALL 'MNOP' TO WSE-2-17B-T-FLD3
          methodOut.setWse217bTFld3(CONSTANTS.LITERAL_MNOPMNOPMNOPMNOPMNOPMNOPMNOPMNOP);
//  MOVE WSE-2-17B-S ( WS-THREE : LENGTH OF WSE-2-17B-S - 3 ) TO WSE-2-17B-T ( WS-FIVE : LENGTH OF WSE-2-17B-T - 5)
          methodOut.getWse217bT().replace(methodOut.getWse217bS(),(methodIn.getThree()-1),Wse217bS.getWse217bSFieldLength() - 3, (methodOut.getWse217bT().begin + (methodIn.getFive()-1)) ,Wse217bT.getWse217bTFieldLength() - 5 /* replace,sourceIndex,sourceLen,targetIndex,targetLen */);

// *
//  DISPLAY '*854* WSE-2-17B-S       = (' WSE-2-17B-S ')'
          logger.info("*854* WSE-2-17B-S       = ({})", methodOut.getWse217bS().toString()); 
//  DISPLAY '*855*   WSE-2-17B-S-FLD1= (' WSE-2-17B-S-FLD1 ')'
          logger.info("*855*   WSE-2-17B-S-FLD1= ({})", new String(methodOut.getWse217bSFld1())); 
//  DISPLAY '*856*   WSE-2-17B-S-FLD2= (' WSE-2-17B-S-FLD2 ')'
          logger.info("*856*   WSE-2-17B-S-FLD2= ({})", new String(methodOut.getWse217bSFld2())); 
//  DISPLAY '*857* WSE-2-17B-T-GRP   = (' WSE-2-17B-T-GRP ')'
          logger.info("*857* WSE-2-17B-T-GRP   = ({})", methodOut.getWse217bTGrp().toString()); 
//  DISPLAY '*858* WSE-2-17B-T       = (' WSE-2-17B-T ')'
          logger.info("*858* WSE-2-17B-T       = ({})", methodOut.getWse217bT().toString()); 
//  DISPLAY '*859*   WSE-2-17B-T-FLD1= (' WSE-2-17B-T-FLD1 ')'
          logger.info("*859*   WSE-2-17B-T-FLD1= ({})", new String(methodOut.getWse217bTFld1())); 
//  DISPLAY '*860*   WSE-2-17B-T-FLD2= (' WSE-2-17B-T-FLD2 ')'
          logger.info("*860*   WSE-2-17B-T-FLD2= ({})", new String(methodOut.getWse217bTFld2())); 
//  DISPLAY '*861*   WSE-2-17B-T-FLD3= (' WSE-2-17B-T-FLD3 ')'
          logger.info("*861*   WSE-2-17B-T-FLD3= ({})", new String(methodOut.getWse217bTFld3())); 

// *
// * Src -> string; tgt -> group ; src same size as tgt
// *    src offset 0  ;target offset 5
// *
//  INITIALIZE WSE-2-18A-S WSE-2-18A-T
          methodOut.setWse218aS(CONSTANTS.SPACE_60 /* Fill 60 Spaces*/);
          methodOut.getWse218aT().initialize();
          // MOVE ALL 'ABCD' TO WSE-2-18A-S
          methodOut.setWse218aS(CONSTANTS.LITERAL_1122147122);
//  MOVE WSE-2-18A-S ( WS-THREE : LENGTH OF WSE-2-18A-S - 3 ) TO WSE-2-18A-T ( WS-FIVE : LENGTH OF WSE-2-18A-T - 5)
          methodOut.getWse218aT().replace(methodOut.getWse218aS(),(methodIn.getThree()-1)/* wse218aS */ ,WSE_218A_S_LENGTH - 3, (methodOut.getWse218aT().begin + (methodIn.getFive()-1)) /* wse218aT */,Wse218aT.getWse218aTFieldLength() - 5 /* replace,startIndex,targetLen */);

// *
//  DISPLAY '*862* WSE-2-18A-S       = (' WSE-2-18A-S ')'
          logger.info("*862* WSE-2-18A-S       = ({})", new String(methodOut.getWse218aS())); 
//  DISPLAY '*863* WSE-2-18A-T-GRP   = (' WSE-2-18A-T-GRP ')'
          logger.info("*863* WSE-2-18A-T-GRP   = ({})", methodOut.getWse218aTGrp().toString()); 
      
      return methodOut;
      }
      /**
      * mainlineSplit30 
      *   This method is derived from 
  *   COBOL Paragraph - MAINLINE-SPLIT30 COBOL Cyclomatic complexity - 1
      * Input  :  

      * - wse218aT                       COBOL Name: WSE-2-18A-T
      * - wse218aTFld1                   COBOL Name: WSE-2-18A-T-FLD1
      * - wse218aTFld2                   COBOL Name: WSE-2-18A-T-FLD2
      * - wse218bTGrp                    COBOL Name: WSE-2-18B-T-GRP
      * - wse219aTGrp                    COBOL Name: WSE-2-19A-T-GRP
      * - wse219bTGrp                    COBOL Name: WSE-2-19B-T-GRP
      * - wse220aTGrp                    COBOL Name: WSE-2-20A-T-GRP
      * - wse220bTGrp                    COBOL Name: WSE-2-20B-T-GRP
      *
      * Output :  

      * - wse218bS                       COBOL Name: WSE-2-18B-S
      * - wse218bT                       COBOL Name: WSE-2-18B-T
      * - wse218bTFld3                   COBOL Name: WSE-2-18B-T-FLD3
      * - wse218bTFld1                   COBOL Name: WSE-2-18B-T-FLD1
      * - wse218bTFld2                   COBOL Name: WSE-2-18B-T-FLD2
      * - wse219aS                       COBOL Name: WSE-2-19A-S
      * - wse219aT                       COBOL Name: WSE-2-19A-T
      * - wse219aSFld1                   COBOL Name: WSE-2-19A-S-FLD1
      * - wse219aSFld2                   COBOL Name: WSE-2-19A-S-FLD2
      * - wse219aTFld1                   COBOL Name: WSE-2-19A-T-FLD1
      * - wse219aTFld2                   COBOL Name: WSE-2-19A-T-FLD2
      * - wse219bS                       COBOL Name: WSE-2-19B-S
      * - wse219bT                       COBOL Name: WSE-2-19B-T
      * - wse219bSFld1                   COBOL Name: WSE-2-19B-S-FLD1
      * - wse219bSFld2                   COBOL Name: WSE-2-19B-S-FLD2
      * - wse219bTFld3                   COBOL Name: WSE-2-19B-T-FLD3
      * - wse219bTFld1                   COBOL Name: WSE-2-19B-T-FLD1
      * - wse219bTFld2                   COBOL Name: WSE-2-19B-T-FLD2
      * - wse220aS                       COBOL Name: WSE-2-20A-S
      * - wse220aT                       COBOL Name: WSE-2-20A-T
      * - wse220aTFld1                   COBOL Name: WSE-2-20A-T-FLD1
      * - wse220aTFld2                   COBOL Name: WSE-2-20A-T-FLD2
      * - wse220bS                       COBOL Name: WSE-2-20B-S
      * - wse220bT                       COBOL Name: WSE-2-20B-T
      * - wse220bTFld3                   COBOL Name: WSE-2-20B-T-FLD3
      *
      * @throws CFException
      */
      @Override
      public MainlineSplit30OutCtx mainlineSplit30(MainlineSplit30InCtx methodIn) throws Exception {
			// Declare local variables used in the method
			 final int WSE_218B_S_LENGTH = 60;
			// End of variable declaration

Refmod3Ctx programCtx = methodIn.getRefmod3Ctx();
MainlineSplit30OutCtx methodOut = methodIn.getMainlineSplit30OutCtx();
//  DISPLAY '*864* WSE-2-18A-T       = (' WSE-2-18A-T ')'
          logger.info("*864* WSE-2-18A-T       = ({})", methodIn.getWse218aT().toString()); 
//  DISPLAY '*865*   WSE-2-18A-T-FLD1= (' WSE-2-18A-T-FLD1 ')'
          logger.info("*865*   WSE-2-18A-T-FLD1= ({})", new String(methodIn.getWse218aTFld1())); 
//  DISPLAY '*866*   WSE-2-18A-T-FLD2= (' WSE-2-18A-T-FLD2 ')'
          logger.info("*866*   WSE-2-18A-T-FLD2= ({})", new String(methodIn.getWse218aTFld2())); 

// *
// * Src -> string; tgt -> group ; src same size as tgt
// *    src offset 0  ;target offset 5
// *
//  INITIALIZE WSE-2-18B-S WSE-2-18B-T
          methodOut.setWse218bS(CONSTANTS.SPACE_60 /* Fill 60 Spaces*/);
          methodOut.getWse218bT().initialize();
          // MOVE ALL 'ABCD' TO WSE-2-18B-S
          methodOut.setWse218bS(CONSTANTS.LITERAL_1122147122);
//  MOVE ALL 'MNOP' TO WSE-2-18B-T-FLD3
          methodOut.setWse218bTFld3(CONSTANTS.LITERAL_MNOPMNOPMNOPMNOPMNOPMNOPMNOPMNOP);
//  MOVE WSE-2-18B-S ( WS-THREE : LENGTH OF WSE-2-18B-S - 3 ) TO WSE-2-18B-T ( WS-FIVE : LENGTH OF WSE-2-18B-T - 5)
          methodOut.getWse218bT().replace(methodOut.getWse218bS(),(methodIn.getThree()-1)/* wse218bS */ ,WSE_218B_S_LENGTH - 3, (methodOut.getWse218bT().begin + (methodIn.getFive()-1)) /* wse218bT */,Wse218bT.getWse218bTFieldLength() - 5 /* replace,startIndex,targetLen */);

// *
//  DISPLAY '*867* WSE-2-18B-S       = (' WSE-2-18B-S ')'
          logger.info("*867* WSE-2-18B-S       = ({})", new String(methodOut.getWse218bS())); 
//  DISPLAY '*868* WSE-2-18B-T-GRP   = (' WSE-2-18B-T-GRP ')'
          logger.info("*868* WSE-2-18B-T-GRP   = ({})", methodOut.getWse218bTGrp().toString()); 
//  DISPLAY '*869* WSE-2-18B-T       = (' WSE-2-18B-T ')'
          logger.info("*869* WSE-2-18B-T       = ({})", methodOut.getWse218bT().toString()); 
//  DISPLAY '*870*   WSE-2-18B-T-FLD1= (' WSE-2-18B-T-FLD1 ')'
          logger.info("*870*   WSE-2-18B-T-FLD1= ({})", new String(methodOut.getWse218bTFld1())); 
//  DISPLAY '*871*   WSE-2-18B-T-FLD2= (' WSE-2-18B-T-FLD2 ')'
          logger.info("*871*   WSE-2-18B-T-FLD2= ({})", new String(methodOut.getWse218bTFld2())); 
//  DISPLAY '*872*   WSE-2-18B-T-FLD3= (' WSE-2-18B-T-FLD3 ')'
          logger.info("*872*   WSE-2-18B-T-FLD3= ({})", new String(methodOut.getWse218bTFld3())); 

// *
// * Src -> group; tgt -> group ; src same size as tgt
// *    src not refmod;target offset 5
// *
//  INITIALIZE WSE-2-19A-S WSE-2-19A-T
          methodOut.getWse219aS().initialize();
          methodOut.getWse219aT().initialize();
//  MOVE ALL 'ABCD' TO WSE-2-19A-S-FLD1
          methodOut.setWse219aSFld1(CONSTANTS.LITERAL_ABCDABCDABCDABCDABCDABCDABCDABCD);
//  MOVE ALL 'ZYXW' TO WSE-2-19A-S-FLD2
          methodOut.setWse219aSFld2(CONSTANTS.LITERAL_ZYXWZYXWZYXWZYXWZYXWZYXWZYXWZYXW);
//  MOVE WSE-2-19A-S TO WSE-2-19A-T ( WS-FIVE : LENGTH OF WSE-2-19A-T - 5)
          methodOut.getWse219aT().replace(methodOut.getWse219aS().getCharArray(),0,methodOut.getWse219aS().length(), (methodOut.getWse219aT().begin + (methodIn.getFive()-1)) ,Wse219aT.getWse219aTFieldLength() - 5 /* replace,sourceIndex,sourceLen,targetIndex,targetLen */);

// *
//  DISPLAY '*873* WSE-2-19A-S       = (' WSE-2-19A-S ')'
          logger.info("*873* WSE-2-19A-S       = ({})", methodOut.getWse219aS().toString()); 
//  DISPLAY '*874*   WSE-2-19A-S-FLD1= (' WSE-2-19A-S-FLD1 ')'
          logger.info("*874*   WSE-2-19A-S-FLD1= ({})", new String(methodOut.getWse219aSFld1())); 
//  DISPLAY '*875*   WSE-2-19A-S-FLD2= (' WSE-2-19A-S-FLD2 ')'
          logger.info("*875*   WSE-2-19A-S-FLD2= ({})", new String(methodOut.getWse219aSFld2())); 
//  DISPLAY '*876* WSE-2-19A-T-GRP   = (' WSE-2-19A-T-GRP ')'
          logger.info("*876* WSE-2-19A-T-GRP   = ({})", methodOut.getWse219aTGrp().toString()); 
//  DISPLAY '*877* WSE-2-19A-T       = (' WSE-2-19A-T ')'
          logger.info("*877* WSE-2-19A-T       = ({})", methodOut.getWse219aT().toString()); 
//  DISPLAY '*878*   WSE-2-19A-T-FLD1= (' WSE-2-19A-T-FLD1 ')'
          logger.info("*878*   WSE-2-19A-T-FLD1= ({})", new String(methodOut.getWse219aTFld1())); 
//  DISPLAY '*879*   WSE-2-19A-T-FLD2= (' WSE-2-19A-T-FLD2 ')'
          logger.info("*879*   WSE-2-19A-T-FLD2= ({})", new String(methodOut.getWse219aTFld2())); 

// * Src -> group; tgt -> group ; src same size as tgt
// *    src not refmod;target offset 5
// *
//  INITIALIZE WSE-2-19B-S WSE-2-19B-T
          methodOut.getWse219bS().initialize();
          methodOut.getWse219bT().initialize();
//  MOVE ALL 'ABCD' TO WSE-2-19B-S-FLD1
          methodOut.setWse219bSFld1(CONSTANTS.LITERAL_ABCDABCDABCDABCDABCDABCDABCDABCD);
//  MOVE ALL 'ZYXW' TO WSE-2-19B-S-FLD2
          methodOut.setWse219bSFld2(CONSTANTS.LITERAL_ZYXWZYXWZYXWZYXWZYXWZYXWZYXWZYXW);
//  MOVE ALL 'MNOP' TO WSE-2-19B-T-FLD3
          methodOut.setWse219bTFld3(CONSTANTS.LITERAL_MNOPMNOPMNOPMNOPMNOPMNOPMNOPMNOP);
//  MOVE WSE-2-19B-S TO WSE-2-19B-T ( WS-FIVE : LENGTH OF WSE-2-19B-T - 5)
          methodOut.getWse219bT().replace(methodOut.getWse219bS().getCharArray(),0,methodOut.getWse219bS().length(), (methodOut.getWse219bT().begin + (methodIn.getFive()-1)) ,Wse219bT.getWse219bTFieldLength() - 5 /* replace,sourceIndex,sourceLen,targetIndex,targetLen */);

// *
//  DISPLAY '*880* WSE-2-19B-S       = (' WSE-2-19B-S ')'
          logger.info("*880* WSE-2-19B-S       = ({})", methodOut.getWse219bS().toString()); 
//  DISPLAY '*881*   WSE-2-19B-S-FLD1= (' WSE-2-19B-S-FLD1 ')'
          logger.info("*881*   WSE-2-19B-S-FLD1= ({})", new String(methodOut.getWse219bSFld1())); 
//  DISPLAY '*882*   WSE-2-19B-S-FLD2= (' WSE-2-19B-S-FLD2 ')'
          logger.info("*882*   WSE-2-19B-S-FLD2= ({})", new String(methodOut.getWse219bSFld2())); 
//  DISPLAY '*883* WSE-2-19B-T-GRP   = (' WSE-2-19B-T-GRP ')'
          logger.info("*883* WSE-2-19B-T-GRP   = ({})", methodOut.getWse219bTGrp().toString()); 
//  DISPLAY '*884* WSE-2-19B-T       = (' WSE-2-19B-T ')'
          logger.info("*884* WSE-2-19B-T       = ({})", methodOut.getWse219bT().toString()); 
//  DISPLAY '*885*   WSE-2-19B-T-FLD1= (' WSE-2-19B-T-FLD1 ')'
          logger.info("*885*   WSE-2-19B-T-FLD1= ({})", new String(methodOut.getWse219bTFld1())); 
//  DISPLAY '*886*   WSE-2-19B-T-FLD2= (' WSE-2-19B-T-FLD2 ')'
          logger.info("*886*   WSE-2-19B-T-FLD2= ({})", new String(methodOut.getWse219bTFld2())); 
//  DISPLAY '*887*   WSE-2-19B-T-FLD3= (' WSE-2-19B-T-FLD3 ')'
          logger.info("*887*   WSE-2-19B-T-FLD3= ({})", new String(methodOut.getWse219bTFld3())); 

// *
// * Src -> string; tgt -> group ; src same size as tgt
// *    src not refmod;target offset 5
// *
//  INITIALIZE WSE-2-20A-S WSE-2-20A-T
          methodOut.setWse220aS(CONSTANTS.SPACE_60 /* Fill 60 Spaces*/);
          methodOut.getWse220aT().initialize();
          // MOVE ALL 'ABCD' TO WSE-2-20A-S
          methodOut.setWse220aS(CONSTANTS.LITERAL_1122147122);
//  MOVE WSE-2-20A-S TO WSE-2-20A-T ( WS-FIVE : LENGTH OF WSE-2-20A-T - 5)
          methodOut.getWse220aT().replace(methodOut.getWse220aS(),0,methodOut.getWse220aS().length, (methodOut.getWse220aT().begin + (methodIn.getFive()-1)) /* wse220aT */,Wse220aT.getWse220aTFieldLength() - 5 /* replace,sourceIndex,sourceLen,targetIndex,targetLen */);

// *
//  DISPLAY '*888* WSE-2-20A-S       = (' WSE-2-20A-S ')'
          logger.info("*888* WSE-2-20A-S       = ({})", new String(methodOut.getWse220aS())); 
//  DISPLAY '*889* WSE-2-20A-T-GRP   = (' WSE-2-20A-T-GRP ')'
          logger.info("*889* WSE-2-20A-T-GRP   = ({})", methodOut.getWse220aTGrp().toString()); 
//  DISPLAY '*890* WSE-2-20A-T       = (' WSE-2-20A-T ')'
          logger.info("*890* WSE-2-20A-T       = ({})", methodOut.getWse220aT().toString()); 
//  DISPLAY '*891*   WSE-2-20A-T-FLD1= (' WSE-2-20A-T-FLD1 ')'
          logger.info("*891*   WSE-2-20A-T-FLD1= ({})", new String(methodOut.getWse220aTFld1())); 
//  DISPLAY '*892*   WSE-2-20A-T-FLD2= (' WSE-2-20A-T-FLD2 ')'
          logger.info("*892*   WSE-2-20A-T-FLD2= ({})", new String(methodOut.getWse220aTFld2())); 

// *
// * Src -> string; tgt -> group ; src same size as tgt
// *    src not refmod;target offset 5
// *
//  INITIALIZE WSE-2-20B-S WSE-2-20B-T
          methodOut.setWse220bS(CONSTANTS.SPACE_60 /* Fill 60 Spaces*/);
          methodOut.getWse220bT().initialize();
          // MOVE ALL 'ABCD' TO WSE-2-20B-S
          methodOut.setWse220bS(CONSTANTS.LITERAL_1122147122);
//  MOVE ALL 'MNOP' TO WSE-2-20B-T-FLD3
          methodOut.setWse220bTFld3(CONSTANTS.LITERAL_MNOPMNOPMNOPMNOPMNOPMNOPMNOPMNOP);
//  MOVE WSE-2-20B-S TO WSE-2-20B-T ( WS-FIVE : LENGTH OF WSE-2-20B-T - 5)
          methodOut.getWse220bT().replace(methodOut.getWse220bS(),0,methodOut.getWse220bS().length, (methodOut.getWse220bT().begin + (methodIn.getFive()-1)) /* wse220bT */,Wse220bT.getWse220bTFieldLength() - 5 /* replace,sourceIndex,sourceLen,targetIndex,targetLen */);

// *
//  DISPLAY '*893* WSE-2-20B-S       = (' WSE-2-20B-S ')'
          logger.info("*893* WSE-2-20B-S       = ({})", new String(methodOut.getWse220bS())); 
//  DISPLAY '*894* WSE-2-20B-T-GRP   = (' WSE-2-20B-T-GRP ')'
          logger.info("*894* WSE-2-20B-T-GRP   = ({})", methodOut.getWse220bTGrp().toString()); 
      
      return methodOut;
      }
      /**
      * mainlineSplit31 
      *   This method is derived from 
  *   COBOL Paragraph - MAINLINE-SPLIT31 COBOL Cyclomatic complexity - 1
      * Input  :  

      * - wse220bT                       COBOL Name: WSE-2-20B-T
      * - wse220bTFld1                   COBOL Name: WSE-2-20B-T-FLD1
      * - wse220bTFld2                   COBOL Name: WSE-2-20B-T-FLD2
      * - wse220bTFld3                   COBOL Name: WSE-2-20B-T-FLD3
      * - wse220cSGrp                    COBOL Name: WSE-2-20C-S-GRP
      * - dplJulianDate                  COBOL Name: DPL-JULIAN-DATE
      *
      * Output :  

      * - wse220cS                       COBOL Name: WSE-2-20C-S
      * - wse220cT                       COBOL Name: WSE-2-20C-T
      * - wse220cSFld1                   COBOL Name: WSE-2-20C-S-FLD1
      * - wse220cSFld2                   COBOL Name: WSE-2-20C-S-FLD2
      * - wse220cSFld3                   COBOL Name: WSE-2-20C-S-FLD3
      * - adRptDate7Juln                 COBOL Name: AD-RPT-DATE7-JULN
      * - dplJulianDate                  COBOL Name: DPL-JULIAN-DATE
      * - var1                           COBOL Name: WS-VAR1
      *
      * @throws CFException
      */
      @Override
      public MainlineSplit31OutCtx mainlineSplit31(MainlineSplit31InCtx methodIn) throws Exception {
Refmod3Ctx programCtx = methodIn.getRefmod3Ctx();
MainlineSplit31OutCtx methodOut = methodIn.getMainlineSplit31OutCtx();
//  DISPLAY '*895* WSE-2-20B-T       = (' WSE-2-20B-T ')'
          logger.info("*895* WSE-2-20B-T       = ({})", methodIn.getWse220bT().toString()); 
//  DISPLAY '*896*   WSE-2-20B-T-FLD1= (' WSE-2-20B-T-FLD1 ')'
          logger.info("*896*   WSE-2-20B-T-FLD1= ({})", new String(methodIn.getWse220bTFld1())); 
//  DISPLAY '*897*   WSE-2-20B-T-FLD2= (' WSE-2-20B-T-FLD2 ')'
          logger.info("*897*   WSE-2-20B-T-FLD2= ({})", new String(methodIn.getWse220bTFld2())); 
//  DISPLAY '*898*   WSE-2-20B-T-FLD3= (' WSE-2-20B-T-FLD3 ')'
          logger.info("*898*   WSE-2-20B-T-FLD3= ({})", new String(methodIn.getWse220bTFld3())); 

// *
// * Src -> string; tgt -> group ; src same size as tgt
// *    src offset 5  ;
// *
//  INITIALIZE WSE-2-20C-S WSE-2-20C-T
          methodOut.getWse220cS().initialize();
          methodOut.setWse220cT(CONSTANTS.SPACE_60 /* Fill 60 Spaces*/);
//  MOVE ALL 'ABCD' TO WSE-2-20C-S-FLD1
          methodOut.setWse220cSFld1(CONSTANTS.LITERAL_ABCDABCDABCD);
//  MOVE ALL 'MNOP' TO WSE-2-20C-S-FLD2
          methodOut.setWse220cSFld2(CONSTANTS.LITERAL_MNOPMNOPMNOPMNOPMNOP);
//  MOVE ALL 'VXYZ' TO WSE-2-20C-S-FLD3
          methodOut.setWse220cSFld3(CONSTANTS.LITERAL_VXYZVXYZVXYZVXYZVXYZVXYZVXYZVXYZ);
//  MOVE WSE-2-20C-S ( WS-ONE : LENGTH OF WSE-2-20C-S ) TO WSE-2-20C-T
          methodOut.setWse220cT(substring(methodOut.getWse220cS().toCharArray(),(methodIn.getOne()-1), (Wse220cS.getWse220cSFieldLength() + (methodIn.getOne() - 1)) ));

// *
//  DISPLAY '*899* WSE-2-20C-S-GRP   = (' WSE-2-20C-S-GRP ')'
          logger.info("*899* WSE-2-20C-S-GRP   = ({})", methodIn.getWse220cSGrp().toString()); 
//  DISPLAY '*900* WSE-2-20C-S       = (' WSE-2-20C-S ')'
          logger.info("*900* WSE-2-20C-S       = ({})", methodOut.getWse220cS().toString()); 
//  DISPLAY '*901*   WSE-2-20C-S-FLD1= (' WSE-2-20C-S-FLD1 ')'
          logger.info("*901*   WSE-2-20C-S-FLD1= ({})", new String(methodOut.getWse220cSFld1())); 
//  DISPLAY '*902*   WSE-2-20C-S-FLD2= (' WSE-2-20C-S-FLD2 ')'
          logger.info("*902*   WSE-2-20C-S-FLD2= ({})", new String(methodOut.getWse220cSFld2())); 
//  DISPLAY '*903*   WSE-2-20C-S-FLD3= (' WSE-2-20C-S-FLD3 ')'
          logger.info("*903*   WSE-2-20C-S-FLD3= ({})", new String(methodOut.getWse220cSFld3())); 
//  DISPLAY '*904* WSE-2-20C-T       = (' WSE-2-20C-T ')'
          logger.info("*904* WSE-2-20C-T       = ({})", new String(methodOut.getWse220cT())); 

// *
          // MOVE DPL-JULIAN-DATE TO AD-RPT-DATE7-JULN (3 : 5)
          methodOut.setAdRptDate7Juln(replace(methodOut.getAdRptDate7JulnString(),methodOut.getDplJulianDateString(),2,7));
//  DISPLAY '*905* AD-RPT-DATE7-JULN = (' AD-RPT-DATE7-JULN ')'
          logger.info("*905* AD-RPT-DATE7-JULN = ({})", String.valueOf(methodOut.getAdRptDate7Juln())); 

// *
          // MOVE SPACES TO WS-VAR1
          methodOut.setVar1(CONSTANTS.SPACE_50);
//  IF WS-VAR1 (43 : 1) NOT EQUAL SPACES
          if (methodOut.getVar1()[42] != ' ') { 
//  DISPLAY '*906* WS-VAR1 NOT SPACE  : ' WS-VAR1
              logger.info("*906* WS-VAR1 NOT SPACE  : {}", new String(methodOut.getVar1())); 
          }
//  ELSE
          else { 
//  DISPLAY '*907* WS-VAR1 IS  SPACE  : ' WS-VAR1
              logger.info("*907* WS-VAR1 IS  SPACE  : {}", new String(methodOut.getVar1())); 
          }
//  STOP RUN
          throw Terminate.TERMINATE;
      
      }
  
  
  
  
  
  
  
  
  }
