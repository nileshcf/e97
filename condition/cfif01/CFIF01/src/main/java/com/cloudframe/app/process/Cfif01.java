  package com.cloudframe.app.process;
  /* 
*---------------------------------------------
* cfm004a - driver program to validate  all the
*           cobol verbs.
*               for each verb.
*---------------------------------------------
*/
  
  import org.springframework.web.bind.annotation.GetMapping;
  import org.slf4j.Logger;
  import org.slf4j.LoggerFactory;
  import com.cloudframe.app.exception.CFException;
  import org.springframework.stereotype.Component;
  import org.springframework.web.bind.annotation.RestController;
  import com.cloudframe.app.data.Field;
  import com.cloudframe.app.cfif01.dto.Init;
  import java.math.BigDecimal;
  import java.math.RoundingMode;
  import com.cloudframe.app.utility.CFUtil;
  import com.cloudframe.app.exception.Terminate;
  import com.cloudframe.app.cfif01.dto.*;
  import com.cloudframe.app.cfif01.dto.X9;
  import com.cloudframe.app.cfif01.dto.Higher;
  import com.cloudframe.app.cfif01.dto.Gp004300PinBlckFrmtCdGroup;
  import com.cloudframe.app.cfif01.dto.DelayUsageTotBp2Bp3Group;
  import com.cloudframe.app.cfif01.dto.DataTable;
  import com.cloudframe.app.cfif01.dto.Work;
  import com.cloudframe.app.common.CONSTANTS;
  
  @Component("cfif01")
  
  public class Cfif01 extends CommonProcess {
  
  Logger logger = LoggerFactory.getLogger(Cfif01.class);
  
  private X9 x9 = new X9() ;
  private Higher higher = new Higher() ;
  private Gp004300PinBlckFrmtCdGroup gp004300PinBlckFrmtCdGroup = new Gp004300PinBlckFrmtCdGroup() ;
  private DelayUsageTotBp2Bp3Group delayUsageTotBp2Bp3Group = new DelayUsageTotBp2Bp3Group() ;
  private DataTable dataTable = new DataTable() ;
  private Work work = new Work() ;
  
  
  
  
  
  
  int dtIndx;
  
  
  
      /**
      * process 
      * Input  : None 

      * Output :  

      * - cisoutWorkRec                  COBOL Name: CISOUT-WORK-REC
      * - parmTyperun                    COBOL Name: PARM-TYPERUN
      * - parmRao                        COBOL Name: PARM-RAO
      * - parmState                      COBOL Name: PARM-STATE
      * - x4                             COBOL Name: WS-X-4
      * - x3                             COBOL Name: WS-X-3
      * - batchId                        COBOL Name: WS-BATCH-ID
      * - oinGeoCd                       COBOL Name: OIN-GEO-CD
      * - tranCode                       COBOL Name: WS-TRAN-CODE
      * - cond                           COBOL Name: WS-COND
      * - dispNum                        COBOL Name: WS-DISP-NUM
      * - char1                          COBOL Name: WS-CHAR1
      * - from                           COBOL Name: WS-FROM
      * - wS1                            COBOL Name: WS-1
      * - wS2                            COBOL Name: WS-2
      * - x9                             COBOL Name: WS-9-X
      * - wS9                            COBOL Name: WS-9
      * - wS88                           COBOL Name: WS-88
      *
      * @throws CFException
      */
      @Override
      public int process() throws Exception {
       initVars();
			// Declare local variables used in the method
			char[] cisoutWorkRec = null;
			char[] parmState = null;
			char[] x4 = null;
			char[] x3 = null;
			char[] batchId = null;
			char[] tranCode = null;
			char[] cond = null;
			char[] wS1 = null;
			char[] wS2 = null;
			int oinGeoCd = 0;
			int wS9 = 0;
			Init init = higher.getInit();
			short dispNum = 0;
			// End of variable declaration

       try {
       setCodePage("1047");

// *
          // MOVE LOW-VALUES TO CISOUT-WORK-REC
          work.setCisoutWorkRec(CONSTANTS.LOW_VALUE_1703015707);
          cisoutWorkRec = work.getCisoutWorkRec();
//  IF CISOUT-WORK-REC = ALL X'00'
          if (			( checkLowValue(cisoutWorkRec) ) ) { 
//  DISPLAY '*36* SUCCESS - ALL LOW-VALUE CHECK'
              logger.info("*36* SUCCESS - ALL LOW-VALUE CHECK"); 
          }
  
//  ELSE
          else { 
//  DISPLAY '*35* FAILURE - ALL LOW-VALUE CHECK'
              logger.info("*35* FAILURE - ALL LOW-VALUE CHECK"); 
          }

// *
          // MOVE 'VBOR' TO PARM-TYPERUN
          //  LITERAL_VBOR = 'VBOR'
          work.setParmTyperun(CONSTANTS.LITERAL_VBOR);
          // MOVE '099' TO PARM-RAO
          //  LITERAL_099 = '099'
          work.setParmRao(CONSTANTS.LITERAL_099);
          // MOVE 'XO' TO PARM-STATE
          //  LITERAL_XO = 'XO'
          work.setParmState(CONSTANTS.LITERAL_XO);
          parmState = work.getParmState();
//  IF ( ( ( PARM-TYPERUN = 'VZOR' ) OR ( PARM-TYPERUN (1 : 3) = 'VZR' ) OR ( PARM-TYPERUN = 'VBOR' ) OR ( PARM-TYPERUN (1 : 3) = 'VBR' ) OR ( PARM-TYPERUN = 'VWOR' ) OR ( PARM-TYPERUN (1 : 3) = 'VWR' )) AND ( PARM-RAO = ( '091' OR '092' OR '095' OR '096' OR '097' OR '098' OR '099' )) AND ( PARM-RAO = ( '091' OR '092' OR '093' OR '094' OR '095' OR '096' OR '097' OR '098' OR '099' )) AND ( PARM-STATE = ( 'VA' OR 'VB' OR 'VC' OR 'VD' OR 'VE' OR 'VF' OR 'VG' OR 'VH' OR 'VI' OR 'VJ' OR 'VK' OR 'VL' OR 'VM' OR 'VN' OR 'VO' OR 'VP' OR 'VQ' OR 'VR' OR 'VS' OR 'VT' OR 'VU' OR 'VV' OR 'VW' OR 'VX' OR 'VY' OR 'XA' OR 'XB' OR 'XC' OR 'XD' OR 'XE' OR 'XF' OR 'XG' OR 'XH' OR 'XI' OR 'XJ' OR 'XK' OR 'XL' OR 'XM' OR 'XN' OR 'XO' OR 'XP' OR 'XQ' OR 'XR' OR 'XS' OR 'XT' OR 'XU' OR 'XV' OR 'XW' OR 'XX' OR 'XY' OR 'XZ' OR 'ZA' OR 'ZB' OR 'ZC' OR 'ZD' OR 'ZE' OR 'ZF' OR 'ZG' OR 'ZH' OR 'ZI' OR 'ZJ' OR 'ZK' OR 'ZL' OR 'ZM' OR 'ZN' OR 'ZO' OR 'ZP' OR 'ZQ' OR 'ZR' OR 'ZS' OR 'ZT' OR 'ZU' OR 'ZV' OR 'ZW' OR 'ZX' OR 'ZY' OR 'ZZ' OR 'KA' OR 'KB' OR 'KC' OR 'KD' OR 'KE' OR 'KF' OR 'KG' OR 'KH' OR 'KI' OR 'KJ' OR 'KK' OR 'KL' OR 'KM' OR 'KN' OR 'KO' OR 'KP' OR 'KQ' OR 'KR' OR 'KS' OR 'KT' OR 'KU' OR 'KV' OR 'KW' OR 'KX' OR 'KY' OR 'KZ' OR 'PL' OR 'UA' OR 'UB' OR 'UC' OR 'UD' OR 'UE' OR 'UF' OR 'UG' OR 'UH' OR 'UI' OR 'UJ' OR 'UK' OR 'UL' OR 'UM' OR 'UN' OR 'UO' OR 'UP' OR 'UQ' OR 'UR' OR 'US' OR 'UT' OR 'UU' OR 'UV' OR 'UW' OR 'UX' OR 'UY' OR 'UZ' OR 'U5' OR 'RA' OR 'VZ' OR 'V5' OR 'WB' OR 'WC' OR 'WD' OR 'WU' OR 'WW' OR 'WX' OR 'WF' OR 'WG' OR 'WH' OR 'WI' OR 'WL' OR 'WK' OR 'WN' OR 'WO' OR 'WP' OR 'WQ' OR 'WS' OR 'WV' OR 'WY' OR 'WZ' OR 'WK' OR 'WT' OR 'WL' OR 'WM' OR 'AB' OR 'AD' ))) THEN
//  LITERAL_AD = 'AD'
          if ((((((compareChars(work.getParmTyperun(),CONSTANTS.LITERAL_VZOR) == 0)) || ((Field.compareChar(work.getParmTyperun() , CONSTANTS.LITERAL_VZR , ( 0 /*start*/ ), 3 /*left len*/ , 3 /*right len*/))) || ((compareChars(work.getParmTyperun(),CONSTANTS.LITERAL_VBOR) == 0)) || ((Field.compareChar(work.getParmTyperun() , CONSTANTS.LITERAL_VBR , ( 0 /*start*/ ), 3 /*left len*/ , 3 /*right len*/))) || ((compareChars(work.getParmTyperun(),CONSTANTS.LITERAL_VWOR) == 0)) || ((Field.compareChar(work.getParmTyperun() , CONSTANTS.LITERAL_VWR , ( 0 /*start*/ ), 3 /*left len*/ , 3 /*right len*/))))) && ((((		compareChars(work.getParmRao(),CONSTANTS.LITERAL_091) == 0  || 		compareChars(work.getParmRao(),CONSTANTS.LITERAL_092) == 0  || 		compareChars(work.getParmRao(),CONSTANTS.LITERAL_095) == 0  || 		compareChars(work.getParmRao(),CONSTANTS.LITERAL_096) == 0  || 		compareChars(work.getParmRao(),CONSTANTS.LITERAL_097) == 0  || 		compareChars(work.getParmRao(),CONSTANTS.LITERAL_098) == 0  || 		compareChars(work.getParmRao(),CONSTANTS.LITERAL_099) == 0 )))) && ((((		compareChars(work.getParmRao(),CONSTANTS.LITERAL_091) == 0  || 		compareChars(work.getParmRao(),CONSTANTS.LITERAL_092) == 0  || 		compareChars(work.getParmRao(),CONSTANTS.LITERAL_093) == 0  || 		compareChars(work.getParmRao(),CONSTANTS.LITERAL_094) == 0  || 		compareChars(work.getParmRao(),CONSTANTS.LITERAL_095) == 0  || 		compareChars(work.getParmRao(),CONSTANTS.LITERAL_096) == 0  || 		compareChars(work.getParmRao(),CONSTANTS.LITERAL_097) == 0  || 		compareChars(work.getParmRao(),CONSTANTS.LITERAL_098) == 0  || 		compareChars(work.getParmRao(),CONSTANTS.LITERAL_099) == 0 )))) && ((((compareChars(parmState,CONSTANTS.LITERAL_VA) == 0 || compareChars(parmState,CONSTANTS.LITERAL_VB) == 0 || compareChars(parmState,CONSTANTS.LITERAL_VC) == 0 || compareChars(parmState,CONSTANTS.LITERAL_VD) == 0 || compareChars(parmState,CONSTANTS.LITERAL_VE) == 0 || compareChars(parmState,CONSTANTS.LITERAL_VF) == 0 || compareChars(parmState,CONSTANTS.LITERAL_VG) == 0 || compareChars(parmState,CONSTANTS.LITERAL_VH) == 0 || compareChars(parmState,CONSTANTS.LITERAL_VI) == 0 || compareChars(parmState,CONSTANTS.LITERAL_VJ) == 0 || compareChars(parmState,CONSTANTS.LITERAL_VK) == 0 || compareChars(parmState,CONSTANTS.LITERAL_VL) == 0 || compareChars(parmState,CONSTANTS.LITERAL_VM) == 0 || compareChars(parmState,CONSTANTS.LITERAL_VN) == 0 || compareChars(parmState,CONSTANTS.LITERAL_VO) == 0 || compareChars(parmState,CONSTANTS.LITERAL_VP) == 0 || compareChars(parmState,CONSTANTS.LITERAL_VQ) == 0 || compareChars(parmState,CONSTANTS.LITERAL_VR) == 0 || compareChars(parmState,CONSTANTS.LITERAL_VS) == 0 || compareChars(parmState,CONSTANTS.LITERAL_VT) == 0 || compareChars(parmState,CONSTANTS.LITERAL_VU) == 0 || compareChars(parmState,CONSTANTS.LITERAL_VV) == 0 || compareChars(parmState,CONSTANTS.LITERAL_VW) == 0 || compareChars(parmState,CONSTANTS.LITERAL_VX) == 0 || compareChars(parmState,CONSTANTS.LITERAL_VY) == 0 || compareChars(parmState,CONSTANTS.LITERAL_XA) == 0 || compareChars(parmState,CONSTANTS.LITERAL_XB) == 0 || compareChars(parmState,CONSTANTS.LITERAL_XC) == 0 || compareChars(parmState,CONSTANTS.LITERAL_XD) == 0 || compareChars(parmState,CONSTANTS.LITERAL_XE) == 0 || compareChars(parmState,CONSTANTS.LITERAL_XF) == 0 || compareChars(parmState,CONSTANTS.LITERAL_XG) == 0 || compareChars(parmState,CONSTANTS.LITERAL_XH) == 0 || compareChars(parmState,CONSTANTS.LITERAL_XI) == 0 || compareChars(parmState,CONSTANTS.LITERAL_XJ) == 0 || compareChars(parmState,CONSTANTS.LITERAL_XK) == 0 || compareChars(parmState,CONSTANTS.LITERAL_XL) == 0 || compareChars(parmState,CONSTANTS.LITERAL_XM) == 0 || compareChars(parmState,CONSTANTS.LITERAL_XN) == 0 || compareChars(parmState,CONSTANTS.LITERAL_XO) == 0 || compareChars(parmState,CONSTANTS.LITERAL_XP) == 0 || compareChars(parmState,CONSTANTS.LITERAL_XQ) == 0 || compareChars(parmState,CONSTANTS.LITERAL_XR) == 0 || compareChars(parmState,CONSTANTS.LITERAL_XS) == 0 || compareChars(parmState,CONSTANTS.LITERAL_XT) == 0 || compareChars(parmState,CONSTANTS.LITERAL_XU) == 0 || compareChars(parmState,CONSTANTS.LITERAL_XV) == 0 || compareChars(parmState,CONSTANTS.LITERAL_XW) == 0 || compareChars(parmState,CONSTANTS.LITERAL_XX) == 0 || compareChars(parmState,CONSTANTS.LITERAL_XY) == 0 || compareChars(parmState,CONSTANTS.LITERAL_XZ) == 0 || compareChars(parmState,CONSTANTS.LITERAL_ZA) == 0 || compareChars(parmState,CONSTANTS.LITERAL_ZB) == 0 || compareChars(parmState,CONSTANTS.LITERAL_ZC) == 0 || compareChars(parmState,CONSTANTS.LITERAL_ZD) == 0 || compareChars(parmState,CONSTANTS.LITERAL_ZE) == 0 || compareChars(parmState,CONSTANTS.LITERAL_ZF) == 0 || compareChars(parmState,CONSTANTS.LITERAL_ZG) == 0 || compareChars(parmState,CONSTANTS.LITERAL_ZH) == 0 || compareChars(parmState,CONSTANTS.LITERAL_ZI) == 0 || compareChars(parmState,CONSTANTS.LITERAL_ZJ) == 0 || compareChars(parmState,CONSTANTS.LITERAL_ZK) == 0 || compareChars(parmState,CONSTANTS.LITERAL_ZL) == 0 || compareChars(parmState,CONSTANTS.LITERAL_ZM) == 0 || compareChars(parmState,CONSTANTS.LITERAL_ZN) == 0 || compareChars(parmState,CONSTANTS.LITERAL_ZO) == 0 || compareChars(parmState,CONSTANTS.LITERAL_ZP) == 0 || compareChars(parmState,CONSTANTS.LITERAL_ZQ) == 0 || compareChars(parmState,CONSTANTS.LITERAL_ZR) == 0 || compareChars(parmState,CONSTANTS.LITERAL_ZS) == 0 || compareChars(parmState,CONSTANTS.LITERAL_ZT) == 0 || compareChars(parmState,CONSTANTS.LITERAL_ZU) == 0 || compareChars(parmState,CONSTANTS.LITERAL_ZV) == 0 || compareChars(parmState,CONSTANTS.LITERAL_ZW) == 0 || compareChars(parmState,CONSTANTS.LITERAL_ZX) == 0 || compareChars(parmState,CONSTANTS.LITERAL_ZY) == 0 || compareChars(parmState,CONSTANTS.LITERAL_ZZ) == 0 || compareChars(parmState,CONSTANTS.LITERAL_KA) == 0 || compareChars(parmState,CONSTANTS.LITERAL_KB) == 0 || compareChars(parmState,CONSTANTS.LITERAL_KC) == 0 || compareChars(parmState,CONSTANTS.LITERAL_KD) == 0 || compareChars(parmState,CONSTANTS.LITERAL_KE) == 0 || compareChars(parmState,CONSTANTS.LITERAL_KF) == 0 || compareChars(parmState,CONSTANTS.LITERAL_KG) == 0 || compareChars(parmState,CONSTANTS.LITERAL_KH) == 0 || compareChars(parmState,CONSTANTS.LITERAL_KI) == 0 || compareChars(parmState,CONSTANTS.LITERAL_KJ) == 0 || compareChars(parmState,CONSTANTS.LITERAL_KK) == 0 || compareChars(parmState,CONSTANTS.LITERAL_KL) == 0 || compareChars(parmState,CONSTANTS.LITERAL_KM) == 0 || compareChars(parmState,CONSTANTS.LITERAL_KN) == 0 || compareChars(parmState,CONSTANTS.LITERAL_KO) == 0 || compareChars(parmState,CONSTANTS.LITERAL_KP) == 0 || compareChars(parmState,CONSTANTS.LITERAL_KQ) == 0 || compareChars(parmState,CONSTANTS.LITERAL_KR) == 0 || compareChars(parmState,CONSTANTS.LITERAL_KS) == 0 || compareChars(parmState,CONSTANTS.LITERAL_KT) == 0 || compareChars(parmState,CONSTANTS.LITERAL_KU) == 0 || compareChars(parmState,CONSTANTS.LITERAL_KV) == 0 || compareChars(parmState,CONSTANTS.LITERAL_KW) == 0 || compareChars(parmState,CONSTANTS.LITERAL_KX) == 0 || compareChars(parmState,CONSTANTS.LITERAL_KY) == 0 || compareChars(parmState,CONSTANTS.LITERAL_KZ) == 0 || compareChars(parmState,CONSTANTS.LITERAL_PL) == 0 || compareChars(parmState,CONSTANTS.LITERAL_UA) == 0 || compareChars(parmState,CONSTANTS.LITERAL_UB) == 0 || compareChars(parmState,CONSTANTS.LITERAL_UC) == 0 || compareChars(parmState,CONSTANTS.LITERAL_UD) == 0 || compareChars(parmState,CONSTANTS.LITERAL_UE) == 0 || compareChars(parmState,CONSTANTS.LITERAL_UF) == 0 || compareChars(parmState,CONSTANTS.LITERAL_UG) == 0 || compareChars(parmState,CONSTANTS.LITERAL_UH) == 0 || compareChars(parmState,CONSTANTS.LITERAL_UI) == 0 || compareChars(parmState,CONSTANTS.LITERAL_UJ) == 0 || compareChars(parmState,CONSTANTS.LITERAL_UK) == 0 || compareChars(parmState,CONSTANTS.LITERAL_UL) == 0 || compareChars(parmState,CONSTANTS.LITERAL_UM) == 0 || compareChars(parmState,CONSTANTS.LITERAL_UN) == 0 || compareChars(parmState,CONSTANTS.LITERAL_UO) == 0 || compareChars(parmState,CONSTANTS.LITERAL_UP) == 0 || compareChars(parmState,CONSTANTS.LITERAL_UQ) == 0 || compareChars(parmState,CONSTANTS.LITERAL_UR) == 0 || compareChars(parmState,CONSTANTS.LITERAL_US) == 0 || compareChars(parmState,CONSTANTS.LITERAL_UT) == 0 || compareChars(parmState,CONSTANTS.LITERAL_UU) == 0 || compareChars(parmState,CONSTANTS.LITERAL_UV) == 0 || compareChars(parmState,CONSTANTS.LITERAL_UW) == 0 || compareChars(parmState,CONSTANTS.LITERAL_UX) == 0 || compareChars(parmState,CONSTANTS.LITERAL_UY) == 0 || compareChars(parmState,CONSTANTS.LITERAL_UZ) == 0 || compareChars(parmState,CONSTANTS.LITERAL_U5) == 0 || compareChars(parmState,CONSTANTS.LITERAL_RA) == 0 || compareChars(parmState,CONSTANTS.LITERAL_VZ) == 0 || compareChars(parmState,CONSTANTS.LITERAL_V5) == 0 || compareChars(parmState,CONSTANTS.LITERAL_WB) == 0 || compareChars(parmState,CONSTANTS.LITERAL_WC) == 0 || compareChars(parmState,CONSTANTS.LITERAL_WD) == 0 || compareChars(parmState,CONSTANTS.LITERAL_WU) == 0 || compareChars(parmState,CONSTANTS.LITERAL_WW) == 0 || compareChars(parmState,CONSTANTS.LITERAL_WX) == 0 || compareChars(parmState,CONSTANTS.LITERAL_WF) == 0 || compareChars(parmState,CONSTANTS.LITERAL_WG) == 0 || compareChars(parmState,CONSTANTS.LITERAL_WH) == 0 || compareChars(parmState,CONSTANTS.LITERAL_WI) == 0 || compareChars(parmState,CONSTANTS.LITERAL_WL) == 0 || compareChars(parmState,CONSTANTS.LITERAL_WK) == 0 || compareChars(parmState,CONSTANTS.LITERAL_WN) == 0 || compareChars(parmState,CONSTANTS.LITERAL_WO) == 0 || compareChars(parmState,CONSTANTS.LITERAL_WP) == 0 || compareChars(parmState,CONSTANTS.LITERAL_WQ) == 0 || compareChars(parmState,CONSTANTS.LITERAL_WS) == 0 || compareChars(parmState,CONSTANTS.LITERAL_WV) == 0 || compareChars(parmState,CONSTANTS.LITERAL_WY) == 0 || compareChars(parmState,CONSTANTS.LITERAL_WZ) == 0 || compareChars(parmState,CONSTANTS.LITERAL_WK) == 0 || compareChars(parmState,CONSTANTS.LITERAL_WT) == 0 || compareChars(parmState,CONSTANTS.LITERAL_WL) == 0 || compareChars(parmState,CONSTANTS.LITERAL_WM) == 0 || compareChars(parmState,CONSTANTS.LITERAL_AB) == 0 || compareChars(parmState,CONSTANTS.LITERAL_AD) == 0)))))) { 
//  DISPLAY 'IF SUCCESS'
              logger.info("IF SUCCESS"); 
          }
  

// *
          // MOVE 'ABC ' TO WS-X-4
          //  LITERAL_ABC_B_ = 'ABC '
          work.setX4(CONSTANTS.LITERAL_ABC_B_);
          // MOVE 'ABC' TO WS-X-3
          //  LITERAL_ABC = 'ABC'
          work.setX3(CONSTANTS.LITERAL_ABC);
          x4 = work.getX4();
          x3 = work.getX3();
//  IF WS-X-4 = WS-X-3 THEN
          if (		compareChars(x4,x3) == 0 ) { 
//  DISPLAY '034 UNEQUAL COMPARE WORKED '
              logger.info("034 UNEQUAL COMPARE WORKED "); 
          }
  
//  ELSE
          else { 
//  DISPLAY '034 UNEQUAL COMPARE FAILED '
              logger.info("034 UNEQUAL COMPARE FAILED "); 
          }
          // MOVE 'ABCX' TO WS-X-4
          //  LITERAL_ABCX = 'ABCX'
          work.setX4(CONSTANTS.LITERAL_ABCX);
          // MOVE 'ABC' TO WS-X-3
          //  LITERAL_ABC = 'ABC'
          work.setX3(CONSTANTS.LITERAL_ABC);
          x4 = work.getX4();
          x3 = work.getX3();
//  IF WS-X-4 = WS-X-3 THEN
          if (		compareChars(x4,x3) == 0 ) { 
//  DISPLAY '033 UNEQUAL COMPARE FAILED '
              logger.info("033 UNEQUAL COMPARE FAILED "); 
          }
  
//  ELSE
          else { 
//  DISPLAY '033 UNEQUAL COMPARE WORKED '
              logger.info("033 UNEQUAL COMPARE WORKED "); 
          }

// *
          // MOVE '032' TO WS-BATCH-ID
          //  LITERAL_032 = '032'
          work.setBatchId(CONSTANTS.LITERAL_032);
          batchId = work.getBatchId();
//  IF WS-BATCH-ID = ( '014' ) OR ( '015' OR '016' ) OR ( '030' OR '031' OR '032' OR '033 ' OR '034' ) OR ( '035' OR '036' OR '037' OR '038 ' OR '039' ) OR ( '046' OR '047' ) THEN
//  LITERAL_047 = '047'
          if (		compareChars(batchId,CONSTANTS.LITERAL_014) == 0  || (		compareChars(batchId,CONSTANTS.LITERAL_015) == 0  || 		compareChars(batchId,CONSTANTS.LITERAL_016) == 0 ) || (		compareChars(batchId,CONSTANTS.LITERAL_030) == 0  || 		compareChars(batchId,CONSTANTS.LITERAL_031) == 0  || 		compareChars(batchId,CONSTANTS.LITERAL_032) == 0  || compareChars(batchId,CONSTANTS.LITERAL_033_B_) == 0 || 		compareChars(batchId,CONSTANTS.LITERAL_034) == 0 ) || (		compareChars(batchId,CONSTANTS.LITERAL_035) == 0  || 		compareChars(batchId,CONSTANTS.LITERAL_036) == 0  || 		compareChars(batchId,CONSTANTS.LITERAL_037) == 0  || compareChars(batchId,CONSTANTS.LITERAL_038_B_) == 0 || 		compareChars(batchId,CONSTANTS.LITERAL_039) == 0 ) || (		compareChars(batchId,CONSTANTS.LITERAL_046) == 0  || 		compareChars(batchId,CONSTANTS.LITERAL_047) == 0 )) { 
//  DISPLAY '84. WS-BATCH-ID = ''032''  TRUE '
              logger.info("84. WS-BATCH-ID = \'032\'  TRUE "); 
          }
  
//  ELSE
          else { 
//  DISPLAY '84. WS-BATCH-ID != ''032''  BUG  '
              logger.info("84. WS-BATCH-ID != \'032\'  BUG  "); 
          }

// *
//  MOVE 123 TO OIN-GEO-CD
          work.setOinGeoCd(123);
//  IF ( OIN-GEO-CD = ZEROS OR OIN-GEO-CD = 1007) THEN
          if ((	( work.getOinGeoCd() == 0 ) || 	( work.getOinGeoCd() == 1007 ))) { 
//  DISPLAY '83. OIN-GEO-CD = ZERO OR 1007  BUG   '
              logger.info("83. OIN-GEO-CD = ZERO OR 1007  BUG   "); 
          }
//  ELSE
          else { 
//  DISPLAY '83. OIN-GEO-CD != ZERO OR 1007  TRUE  '
              logger.info("83. OIN-GEO-CD != ZERO OR 1007  TRUE  "); 
          }

// *
//  MOVE 1007 TO OIN-GEO-CD
          work.setOinGeoCd(1007);
//  IF ( OIN-GEO-CD = ZEROS OR OIN-GEO-CD = 1007) THEN
          if ((	( work.getOinGeoCd() == 0 ) || 	( work.getOinGeoCd() == 1007 ))) { 
//  DISPLAY '82. OIN-GEO-CD = ZERO OR 1007  TRUE  '
              logger.info("82. OIN-GEO-CD = ZERO OR 1007  TRUE  "); 
          }
//  ELSE
          else { 
//  DISPLAY '82. OIN-GEO-CD != ZERO OR 1007  BUG   '
              logger.info("82. OIN-GEO-CD != ZERO OR 1007  BUG   "); 
          }

// *
//  MOVE ZERO TO OIN-GEO-CD
          work.setOinGeoCd(0);
//  IF ( OIN-GEO-CD = ZEROS OR OIN-GEO-CD = 1007) THEN
          if ((	( work.getOinGeoCd() == 0 ) || 	( work.getOinGeoCd() == 1007 ))) { 
//  DISPLAY '81. OIN-GEO-CD = ZERO OR 1007  TRUE  '
              logger.info("81. OIN-GEO-CD = ZERO OR 1007  TRUE  "); 
          }
//  ELSE
          else { 
//  DISPLAY '81. OIN-GEO-CD != ZERO OR 1007  BUG   '
              logger.info("81. OIN-GEO-CD != ZERO OR 1007  BUG   "); 
          }

// *
          // MOVE '5732' TO WS-TRAN-CODE
          //  LITERAL_5732 = '5732'
          work.setTranCode(CONSTANTS.LITERAL_5732);
          tranCode = work.getTranCode();
//  IF WS-TRAN-CODE = ( '21BB' ) OR ( '4054' ) OR ( '5022' OR '5522' ) OR ( '5232' OR '5732' ) THEN
//  LITERAL_5732 = '5732'
          if (compareChars(tranCode,CONSTANTS.LITERAL_21BB) == 0 || 		compareChars(tranCode,CONSTANTS.LITERAL_4054) == 0  || (		compareChars(tranCode,CONSTANTS.LITERAL_5022) == 0  || 		compareChars(tranCode,CONSTANTS.LITERAL_5522) == 0 ) || (		compareChars(tranCode,CONSTANTS.LITERAL_5232) == 0  || 		compareChars(tranCode,CONSTANTS.LITERAL_5732) == 0 )) { 
//  DISPLAY '80. TRANCODE = 5732 - TRUE '
              logger.info("80. TRANCODE = 5732 - TRUE "); 
          }
  
//  ELSE
          else { 
//  DISPLAY '80. TRANCODE != 5732 - BUG '
              logger.info("80. TRANCODE != 5732 - BUG "); 
          }

// *
          // MOVE 'ORANGE' TO WS-COND
          //  LITERAL_ORANGE = 'ORANGE'
          work.setCond(CONSTANTS.LITERAL_ORANGE);
//  IF NOT FRUIT THEN
          if (!(work.isFruit()) ) { 
//  DISPLAY '79.  VEGGIE  ' WS-COND
              logger.info("79.  VEGGIE  {}", new String(work.getCond())); 
          }
//  ELSE
          else { 
//  DISPLAY '79.  FRUIT   ' WS-COND
              logger.info("79.  FRUIT   {}", new String(work.getCond())); 
          }

// *
          // MOVE 'BANANA' TO WS-COND
          //  LITERAL_BANANA = 'BANANA'
          work.setCond(CONSTANTS.LITERAL_BANANA);
//  IF NOT FRUIT THEN
          if (!(work.isFruit()) ) { 
//  DISPLAY '78.  VEGGIE  ' WS-COND
              logger.info("78.  VEGGIE  {}", new String(work.getCond())); 
          }
//  ELSE
          else { 
//  DISPLAY '78.  FRUIT   ' WS-COND
              logger.info("78.  FRUIT   {}", new String(work.getCond())); 
          }

// *
          // MOVE 'APPLE ' TO WS-COND
          //  LITERAL_APPLE_B_ = 'APPLE '
          work.setCond(CONSTANTS.LITERAL_APPLE_B_);
//  IF NOT FRUIT THEN
          if (!(work.isFruit()) ) { 
//  DISPLAY '77.  VEGGIE  ' WS-COND
              logger.info("77.  VEGGIE  {}", new String(work.getCond())); 
          }
//  ELSE
          else { 
//  DISPLAY '77.  FRUIT   ' WS-COND
              logger.info("77.  FRUIT   {}", new String(work.getCond())); 
          }

// *
          // MOVE 'TOMATO' TO WS-COND
          //  LITERAL_TOMATO = 'TOMATO'
          work.setCond(CONSTANTS.LITERAL_TOMATO);
//  IF NOT FRUIT THEN
          if (!(work.isFruit()) ) { 
//  DISPLAY '76.  VEGGIE  ' WS-COND
              logger.info("76.  VEGGIE  {}", new String(work.getCond())); 
          }
//  ELSE
          else { 
//  DISPLAY '76.  FRUIT   ' WS-COND
              logger.info("76.  FRUIT   {}", new String(work.getCond())); 
          }

// *
          // MOVE 'BEANS ' TO WS-COND
          //  LITERAL_BEANS_B_ = 'BEANS '
          work.setCond(CONSTANTS.LITERAL_BEANS_B_);
//  IF NOT FRUIT THEN
          if (!(work.isFruit()) ) { 
//  DISPLAY '75.  VEGGIE  ' WS-COND
              logger.info("75.  VEGGIE  {}", new String(work.getCond())); 
          }
//  ELSE
          else { 
//  DISPLAY '75.  FRUIT   ' WS-COND
              logger.info("75.  FRUIT   {}", new String(work.getCond())); 
          }

// *
          // MOVE 'CARROT' TO WS-COND
          //  LITERAL_CARROT = 'CARROT'
          work.setCond(CONSTANTS.LITERAL_CARROT);
//  IF NOT FRUIT THEN
          if (!(work.isFruit()) ) { 
//  DISPLAY '74.  VEGGIE  ' WS-COND
              logger.info("74.  VEGGIE  {}", new String(work.getCond())); 
          }
//  ELSE
          else { 
//  DISPLAY '74.  FRUIT   ' WS-COND
              logger.info("74.  FRUIT   {}", new String(work.getCond())); 
          }

// *
          // MOVE 'ORANGE' TO WS-COND
          //  LITERAL_ORANGE = 'ORANGE'
          work.setCond(CONSTANTS.LITERAL_ORANGE);
          cond = work.getCond();
//  IF WS-COND = ( 'ORANGE' OR 'BANANA' OR 'APPLE' ) THEN
          if ((compareChars(cond,CONSTANTS.LITERAL_ORANGE) == 0 || compareChars(cond,CONSTANTS.LITERAL_BANANA) == 0 || compareChars(cond,CONSTANTS.LITERAL_APPLE_B_) == 0)) { 
//  DISPLAY '73.  FRUIT   ' WS-COND
              logger.info("73.  FRUIT   {}", new String(work.getCond())); 
          }
  
//  ELSE
          else { 
//  DISPLAY '73.  VEGGIE  ' WS-COND
              logger.info("73.  VEGGIE  {}", new String(work.getCond())); 
          }

// *
          // MOVE 'BANANA' TO WS-COND
          //  LITERAL_BANANA = 'BANANA'
          work.setCond(CONSTANTS.LITERAL_BANANA);
          cond = work.getCond();
//  IF WS-COND = ( 'ORANGE' OR 'BANANA' OR 'APPLE' ) THEN
          if ((compareChars(cond,CONSTANTS.LITERAL_ORANGE) == 0 || compareChars(cond,CONSTANTS.LITERAL_BANANA) == 0 || compareChars(cond,CONSTANTS.LITERAL_APPLE_B_) == 0)) { 
//  DISPLAY '72.  FRUIT   ' WS-COND
              logger.info("72.  FRUIT   {}", new String(work.getCond())); 
          }
  
//  ELSE
          else { 
//  DISPLAY '72.  VEGGIE  ' WS-COND
              logger.info("72.  VEGGIE  {}", new String(work.getCond())); 
          }

// *
          // MOVE 'APPLE ' TO WS-COND
          //  LITERAL_APPLE_B_ = 'APPLE '
          work.setCond(CONSTANTS.LITERAL_APPLE_B_);
          cond = work.getCond();
//  IF WS-COND = ( 'ORANGE' OR 'BANANA' OR 'APPLE' ) THEN
          if ((compareChars(cond,CONSTANTS.LITERAL_ORANGE) == 0 || compareChars(cond,CONSTANTS.LITERAL_BANANA) == 0 || compareChars(cond,CONSTANTS.LITERAL_APPLE_B_) == 0)) { 
//  DISPLAY '71.  FRUIT   ' WS-COND
              logger.info("71.  FRUIT   {}", new String(work.getCond())); 
          }
  
//  ELSE
          else { 
//  DISPLAY '71.  VEGGIE  ' WS-COND
              logger.info("71.  VEGGIE  {}", new String(work.getCond())); 
          }

// *
          // MOVE 'TOMATO' TO WS-COND
          //  LITERAL_TOMATO = 'TOMATO'
          work.setCond(CONSTANTS.LITERAL_TOMATO);
          cond = work.getCond();
//  IF WS-COND = ( 'ORANGE' OR 'BANANA' OR 'APPLE' ) THEN
          if ((compareChars(cond,CONSTANTS.LITERAL_ORANGE) == 0 || compareChars(cond,CONSTANTS.LITERAL_BANANA) == 0 || compareChars(cond,CONSTANTS.LITERAL_APPLE_B_) == 0)) { 
//  DISPLAY '70.  FRUIT   ' WS-COND
              logger.info("70.  FRUIT   {}", new String(work.getCond())); 
          }
  
//  ELSE
          else { 
//  DISPLAY '70.  VEGGIE  ' WS-COND
              logger.info("70.  VEGGIE  {}", new String(work.getCond())); 
          }

// *
          // MOVE 'BEANS ' TO WS-COND
          //  LITERAL_BEANS_B_ = 'BEANS '
          work.setCond(CONSTANTS.LITERAL_BEANS_B_);
          cond = work.getCond();
//  IF WS-COND = ( 'ORANGE' OR 'BANANA' OR 'APPLE' ) THEN
          if ((compareChars(cond,CONSTANTS.LITERAL_ORANGE) == 0 || compareChars(cond,CONSTANTS.LITERAL_BANANA) == 0 || compareChars(cond,CONSTANTS.LITERAL_APPLE_B_) == 0)) { 
//  DISPLAY '69.  FRUIT   ' WS-COND
              logger.info("69.  FRUIT   {}", new String(work.getCond())); 
          }
  
//  ELSE
          else { 
//  DISPLAY '69.  VEGGIE  ' WS-COND
              logger.info("69.  VEGGIE  {}", new String(work.getCond())); 
          }

// *
          // MOVE 'CARROT' TO WS-COND
          //  LITERAL_CARROT = 'CARROT'
          work.setCond(CONSTANTS.LITERAL_CARROT);
          cond = work.getCond();
//  IF WS-COND = ( 'ORANGE' OR 'BANANA' OR 'APPLE' ) THEN
          if ((compareChars(cond,CONSTANTS.LITERAL_ORANGE) == 0 || compareChars(cond,CONSTANTS.LITERAL_BANANA) == 0 || compareChars(cond,CONSTANTS.LITERAL_APPLE_B_) == 0)) { 
//  DISPLAY '68.  FRUIT   ' WS-COND
              logger.info("68.  FRUIT   {}", new String(work.getCond())); 
          }
  
//  ELSE
          else { 
//  DISPLAY '68.  VEGGIE  ' WS-COND
              logger.info("68.  VEGGIE  {}", new String(work.getCond())); 
          }

// *
//  MOVE 101 TO WS-DISP-NUM
          init.setDispNum(101);
  
//  MOVE 'X' TO WS-CHAR1
//  LITERAL_X = 'X', LITERAL_X = "X"
          init.setChar1(CONSTANTS.LITERAL_X);
  
          dispNum = init.getDispNum();
          init = higher.getInit();
//  IF NOT WS-88-CHAR AND WS-DISP-NUM < 111 THEN
          if (!(init.isChar88())  && 	( dispNum < 111 ) ) { 
//  DISPLAY '67. THIS SHOULD BE DISPLAYED '
              logger.info("67. THIS SHOULD BE DISPLAYED "); 
          }
  
//  ELSE
          else { 
//  DISPLAY '67. THIS SHOULD NOT BE DISPLAYED '
              logger.info("67. THIS SHOULD NOT BE DISPLAYED "); 
          }

// *
//  MOVE 101 TO WS-DISP-NUM
          init.setDispNum(101);
  
//  MOVE 'A' TO WS-CHAR1
//  LITERAL_A = 'A'
          init.setChar1(CONSTANTS.LITERAL_A);
  
          dispNum = init.getDispNum();
          init = higher.getInit();
//  IF WS-88-CHAR AND WS-DISP-NUM < 111 THEN
          if ( init.isChar88()   && 	( dispNum < 111 ) ) { 
//  DISPLAY '66. THIS SHOULD BE DISPLAYED '
              logger.info("66. THIS SHOULD BE DISPLAYED "); 
          }
  
//  ELSE
          else { 
//  DISPLAY '66. THIS SHOULD NOT BE DISPLAYED '
              logger.info("66. THIS SHOULD NOT BE DISPLAYED "); 
          }
//  MOVE 'B' TO WS-CHAR1
//  LITERAL_B = 'B'
          init.setChar1(CONSTANTS.LITERAL_B);
  
          dispNum = init.getDispNum();
          init = higher.getInit();
//  IF WS-88-CHAR AND WS-DISP-NUM < 111 THEN
          if ( init.isChar88()   && 	( dispNum < 111 ) ) { 
//  DISPLAY '65. THIS SHOULD BE DISPLAYED '
              logger.info("65. THIS SHOULD BE DISPLAYED "); 
          }
  
//  ELSE
          else { 
//  DISPLAY '65. THIS SHOULD NOT BE DISPLAYED '
              logger.info("65. THIS SHOULD NOT BE DISPLAYED "); 
          }
//  MOVE 'C' TO WS-CHAR1
//  LITERAL_C = 'C'
          init.setChar1(CONSTANTS.LITERAL_C);
  
          dispNum = init.getDispNum();
          init = higher.getInit();
//  IF WS-88-CHAR AND WS-DISP-NUM < 111 THEN
          if ( init.isChar88()   && 	( dispNum < 111 ) ) { 
//  DISPLAY '64. THIS SHOULD BE DISPLAYED '
              logger.info("64. THIS SHOULD BE DISPLAYED "); 
          }
  
//  ELSE
          else { 
//  DISPLAY '64. THIS SHOULD NOT BE DISPLAYED '
              logger.info("64. THIS SHOULD NOT BE DISPLAYED "); 
          }

// *
//  MOVE 222 TO WS-DISP-NUM
          init.setDispNum(222);
  
//  MOVE 'A' TO WS-CHAR1
//  LITERAL_A = 'A'
          init.setChar1(CONSTANTS.LITERAL_A);
  
          dispNum = init.getDispNum();
          init = higher.getInit();
//  IF WS-88-CHAR AND WS-DISP-NUM < 111 THEN
          if ( init.isChar88()   && 	( dispNum < 111 ) ) { 
//  DISPLAY '63. THIS SHOULD NOT BE DISPLAYED '
              logger.info("63. THIS SHOULD NOT BE DISPLAYED "); 
          }
  
//  ELSE
          else { 
//  DISPLAY '63. THIS SHOULD BE DISPLAYED '
              logger.info("63. THIS SHOULD BE DISPLAYED "); 
          }
//  MOVE 'B' TO WS-CHAR1
//  LITERAL_B = 'B'
          init.setChar1(CONSTANTS.LITERAL_B);
  
          dispNum = init.getDispNum();
          init = higher.getInit();
//  IF WS-88-CHAR AND WS-DISP-NUM < 111 THEN
          if ( init.isChar88()   && 	( dispNum < 111 ) ) { 
//  DISPLAY '62. THIS SHOULD NOT BE DISPLAYED '
              logger.info("62. THIS SHOULD NOT BE DISPLAYED "); 
          }
  
//  ELSE
          else { 
//  DISPLAY '62. THIS SHOULD BE DISPLAYED '
              logger.info("62. THIS SHOULD BE DISPLAYED "); 
          }
//  MOVE 'C' TO WS-CHAR1
//  LITERAL_C = 'C'
          init.setChar1(CONSTANTS.LITERAL_C);
  
          dispNum = init.getDispNum();
          init = higher.getInit();
//  IF WS-88-CHAR AND WS-DISP-NUM < 111 THEN
          if ( init.isChar88()   && 	( dispNum < 111 ) ) { 
//  DISPLAY '61. THIS SHOULD NOT BE DISPLAYED '
              logger.info("61. THIS SHOULD NOT BE DISPLAYED "); 
          }
  
//  ELSE
          else { 
//  DISPLAY '61. THIS SHOULD BE DISPLAYED '
              logger.info("61. THIS SHOULD BE DISPLAYED "); 
          }

// *
          // MOVE 0.44 TO WS-FROM
          work.setFrom(BigDecimal.valueOf(0.44).setScale(2,RoundingMode.DOWN));
          // MOVE WS-FROM TO WS-1 WS-2
          //  FORMAT_1714102869 = "9999999.9999", FORMAT_1106209862 = "9,999,999.999"
          work.setWS1(CFUtil.cobolNumberFormatter(CONSTANTS.FORMAT_1714102869,work.getFrom().toPlainString().toCharArray()));
          work.setWS2(CFUtil.cobolNumberFormatter(CONSTANTS.FORMAT_1106209862,work.getFrom().toPlainString().toCharArray()));
          wS1 = work.getWS1();
//  IF WS-1 > 0 THEN
          if (compareChars(wS1,CONSTANTS.LITERAL_0_B11_) > 0) { 
//  DISPLAY '60. 0.44 > 0 '
              logger.info("60. 0.44 > 0 "); 
          }
  
//  ELSE
          else { 
//  DISPLAY '59. 0.44 < 0 '
              logger.info("59. 0.44 < 0 "); 
          }
          wS2 = work.getWS2();
//  IF WS-2 > 0 THEN
          if (compareChars(wS2,CONSTANTS.LITERAL_0_B12_) > 0) { 
//  DISPLAY '58. 0.44 > 0 '
              logger.info("58. 0.44 > 0 "); 
          }
  
//  ELSE
          else { 
//  DISPLAY '57. 0.44 < 0 '
              logger.info("57. 0.44 < 0 "); 
          }
          // MOVE 0.44 TO WS-FROM
          work.setFrom(BigDecimal.valueOf(0.44).setScale(2,RoundingMode.DOWN));
          // MOVE WS-FROM TO WS-1 WS-2
          //  FORMAT_1714102869 = "9999999.9999", FORMAT_1106209862 = "9,999,999.999"
          work.setWS1(CFUtil.cobolNumberFormatter(CONSTANTS.FORMAT_1714102869,work.getFrom().toPlainString().toCharArray()));
          work.setWS2(CFUtil.cobolNumberFormatter(CONSTANTS.FORMAT_1106209862,work.getFrom().toPlainString().toCharArray()));
          wS1 = work.getWS1();
//  IF WS-1 > 1 THEN
          if (compareChars(wS1,CONSTANTS.LITERAL_1_B11_) > 0) { 
//  DISPLAY '56. 0.44 > 1 '
              logger.info("56. 0.44 > 1 "); 
          }
  
//  ELSE
          else { 
//  DISPLAY '55. 0.44 < 1 '
              logger.info("55. 0.44 < 1 "); 
          }
          wS2 = work.getWS2();
//  IF WS-2 > 1 THEN
          if (compareChars(wS2,CONSTANTS.LITERAL_1_B12_) > 0) { 
//  DISPLAY '54. 0.44 > 1 '
              logger.info("54. 0.44 > 1 "); 
          }
  
//  ELSE
          else { 
//  DISPLAY '53. 0.44 < 1 '
              logger.info("53. 0.44 < 1 "); 
          }
          // MOVE 1234567.12 TO WS-FROM
          work.setFrom(BigDecimal.valueOf(1234567.12).setScale(2,RoundingMode.DOWN));
          // MOVE WS-FROM TO WS-1 WS-2
          //  FORMAT_1714102869 = "9999999.9999", FORMAT_1106209862 = "9,999,999.999"
          work.setWS1(CFUtil.cobolNumberFormatter(CONSTANTS.FORMAT_1714102869,work.getFrom().toPlainString().toCharArray()));
          work.setWS2(CFUtil.cobolNumberFormatter(CONSTANTS.FORMAT_1106209862,work.getFrom().toPlainString().toCharArray()));
          wS1 = work.getWS1();
//  IF WS-1 > 9 THEN
          if (compareChars(wS1,CONSTANTS.LITERAL_9_B11_) > 0) { 
//  DISPLAY '52. 1234567.12 > 9 '
              logger.info("52. 1234567.12 > 9 "); 
          }
  
//  ELSE
          else { 
//  DISPLAY '51. 1234567.12 < 9 '
              logger.info("51. 1234567.12 < 9 "); 
          }
          wS2 = work.getWS2();
//  IF WS-2 > 9 THEN
          if (compareChars(wS2,CONSTANTS.LITERAL_9_B12_) > 0) { 
//  DISPLAY '50. 1234567.12 > 9 '
              logger.info("50. 1234567.12 > 9 "); 
          }
  
//  ELSE
          else { 
//  DISPLAY '49. 1234567.12 < 9 '
              logger.info("49. 1234567.12 < 9 "); 
          }
          // MOVE 8234567.12 TO WS-FROM
          work.setFrom(BigDecimal.valueOf(8234567.12).setScale(2,RoundingMode.DOWN));
          // MOVE WS-FROM TO WS-1 WS-2
          //  FORMAT_1714102869 = "9999999.9999", FORMAT_1106209862 = "9,999,999.999"
          work.setWS1(CFUtil.cobolNumberFormatter(CONSTANTS.FORMAT_1714102869,work.getFrom().toPlainString().toCharArray()));
          work.setWS2(CFUtil.cobolNumberFormatter(CONSTANTS.FORMAT_1106209862,work.getFrom().toPlainString().toCharArray()));
          wS1 = work.getWS1();
//  IF WS-1 > 97 THEN
          if (compareChars(wS1,CONSTANTS.LITERAL_97_B10_) > 0) { 
//  DISPLAY '48. 8234567.12 > 97'
              logger.info("48. 8234567.12 > 97"); 
          }
  
//  ELSE
          else { 
//  DISPLAY '47. 8234567.12 < 97'
              logger.info("47. 8234567.12 < 97"); 
          }
          wS2 = work.getWS2();
//  IF WS-2 > 97 THEN
          if (compareChars(wS2,CONSTANTS.LITERAL_97_B11_) > 0) { 
//  DISPLAY '46. 8234567.12 > 97'
              logger.info("46. 8234567.12 > 97"); 
          }
  
//  ELSE
          else { 
//  DISPLAY '45. 8234567.12 < 97'
              logger.info("45. 8234567.12 < 97"); 
          }
          // MOVE 7234567.12 TO WS-FROM
          work.setFrom(BigDecimal.valueOf(7234567.12).setScale(2,RoundingMode.DOWN));
          // MOVE WS-FROM TO WS-1 WS-2
          //  FORMAT_1714102869 = "9999999.9999", FORMAT_1106209862 = "9,999,999.999"
          work.setWS1(CFUtil.cobolNumberFormatter(CONSTANTS.FORMAT_1714102869,work.getFrom().toPlainString().toCharArray()));
          work.setWS2(CFUtil.cobolNumberFormatter(CONSTANTS.FORMAT_1106209862,work.getFrom().toPlainString().toCharArray()));
          wS1 = work.getWS1();
//  IF WS-1 > 61 THEN
          if (compareChars(wS1,CONSTANTS.LITERAL_61_B10_) > 0) { 
//  DISPLAY '44. 7234567.12 > 61'
              logger.info("44. 7234567.12 > 61"); 
          }
  
//  ELSE
          else { 
//  DISPLAY '43. 7234567.12 < 61'
              logger.info("43. 7234567.12 < 61"); 
          }
          wS2 = work.getWS2();
//  IF WS-2 > 61 THEN
          if (compareChars(wS2,CONSTANTS.LITERAL_61_B11_) > 0) { 
//  DISPLAY '42. 7234567.12 > 61'
              logger.info("42. 7234567.12 > 61"); 
          }
  
//  ELSE
          else { 
//  DISPLAY '41. 7234567.12 < 61'
              logger.info("41. 7234567.12 < 61"); 
          }
          // MOVE 0.0 TO WS-FROM
          work.setFrom(BigDecimal.valueOf(0.0).setScale(2,RoundingMode.DOWN));
          // MOVE WS-FROM TO WS-1 WS-2
          //  FORMAT_1714102869 = "9999999.9999", FORMAT_1106209862 = "9,999,999.999"
          work.setWS1(CFUtil.cobolNumberFormatter(CONSTANTS.FORMAT_1714102869,work.getFrom().toPlainString().toCharArray()));
          work.setWS2(CFUtil.cobolNumberFormatter(CONSTANTS.FORMAT_1106209862,work.getFrom().toPlainString().toCharArray()));
          wS1 = work.getWS1();
//  IF WS-1 > 0 THEN
          if (compareChars(wS1,CONSTANTS.LITERAL_0_B11_) > 0) { 
//  DISPLAY '40. 0.00 > 0 '
              logger.info("40. 0.00 > 0 "); 
          }
  
//  ELSE
          else { 
//  DISPLAY '39. 0.00 < 0 '
              logger.info("39. 0.00 < 0 "); 
          }
          wS2 = work.getWS2();
//  IF WS-2 > 0 THEN
          if (compareChars(wS2,CONSTANTS.LITERAL_0_B12_) > 0) { 
//  DISPLAY '38. 0.00 > 0 '
              logger.info("38. 0.00 > 0 "); 
          }
  
//  ELSE
          else { 
//  DISPLAY '37. 0.00 < 0 '
              logger.info("37. 0.00 < 0 "); 
          }

// *
//  MOVE SPACES TO WS-9-X
          x9.setString(CONSTANTS.SPACE_2);
          wS9 = x9.getWS9();
//  IF WS-9 = 0 THEN
          if (	( wS9 == 0 )) { 
//  DISPLAY '36.TRUE  - MOVED SPACES BUT COMPARED 2 0 '
              logger.info("36.TRUE  - MOVED SPACES BUT COMPARED 2 0 "); 
          }
  
//  ELSE
          else { 
//  DISPLAY '35.FALSE - MOVED SPACES BUT COMPARED 2 0 '
              logger.info("35.FALSE - MOVED SPACES BUT COMPARED 2 0 "); 
          }
//  IF WS-ZERO THEN
          if ( x9.isZero()  ) { 
//  DISPLAY '34.TRUE  88  - MOVED SPACES BUT COMPARED 2 0'
              logger.info("34.TRUE  88  - MOVED SPACES BUT COMPARED 2 0"); 
          }
//  ELSE
          else { 
//  DISPLAY '33.FALSE 88 - MOVED SPACES BUT COMPARED 2 0'
              logger.info("33.FALSE 88 - MOVED SPACES BUT COMPARED 2 0"); 
          }
          // MOVE LOW-VALUE TO WS-9-X
          x9.setString(CONSTANTS.LOW_VALUE_1703015893);
          wS9 = x9.getWS9();
//  IF WS-9 = 0 THEN
          if (	( wS9 == 0 )) { 
//  DISPLAY '32.TRUE  - MOVED LOWVAL BUT COMPARED 2 0 '
              logger.info("32.TRUE  - MOVED LOWVAL BUT COMPARED 2 0 "); 
          }
  
//  ELSE
          else { 
//  DISPLAY '31.FALSE - MOVED LOWVAL BUT COMPARED 2 0 '
              logger.info("31.FALSE - MOVED LOWVAL BUT COMPARED 2 0 "); 
          }
//  IF WS-ZERO THEN
          if ( x9.isZero()  ) { 
//  DISPLAY '30.TRUE  88  - MOVED LOWVAL BUT COMPARED 2 0'
              logger.info("30.TRUE  88  - MOVED LOWVAL BUT COMPARED 2 0"); 
          }
//  ELSE
          else { 
//  DISPLAY '29.FALSE 88 - MOVED LOWVAL BUT COMPARED 2 0'
              logger.info("29.FALSE 88 - MOVED LOWVAL BUT COMPARED 2 0"); 
          }
          // MOVE 'XX' TO WS-9-X
          //  LITERAL_XX = 'XX'
          x9.setString(CONSTANTS.LITERAL_XX);
//  PERFORM PROCESS-1
          process1();/*PROCESS-1*/
       } catch(Exception e) {
            handleErrorCode(e);
            throw e;
       }
      
       return getRc(); // Exit with return code
      // end of process method
      }
      /**
      * testConditions 
      *   This method is derived from 
  *   COBOL Paragraph - TEST-CONDITIONS COBOL Cyclomatic complexity - 1
      * Input  : None 

      * Output :  

      * - delayCustIdNo                  COBOL Name: DELAY-CUST-ID-NO
      * - billku00CustIdNo               COBOL Name: BILLKU00-CUST-ID-NO
      * - delayMtn                       COBOL Name: DELAY-MTN
      * - billku00Mtn                    COBOL Name: BILLKU00-MTN
      * - delayMeasCd                    COBOL Name: DELAY-MEAS-CD
      * - delayBillPeriod                COBOL Name: DELAY-BILL-PERIOD
      * - delaydatEofSw                  COBOL Name: DELAYDAT-EOF-SW
      * - readDelaydatSw                 COBOL Name: WS-READ-DELAYDAT-SW
      * - dtIndx                         COBOL Name: DT-INDX
      * - dataHmAirQtyDec                COBOL Name: DATA-HM-AIR-QTY-DEC
      * - delayUsageTotBp2Bp3Dec         COBOL Name: WS-DELAY-USAGE-TOT-BP2-BP3-DEC
      *
      * @throws CFException
      */
      private void testConditions() throws Exception {
//  MOVE 70001 TO DELAY-CUST-ID-NO
          work.setDelayCustIdNo(70001);
//  MOVE 70001 TO BILLKU00-CUST-ID-NO
          work.setBillku00CustIdNo(70001);
          // MOVE 'NPATLN1234' TO DELAY-MTN
          //  LITERAL_NPATLN1234 = 'NPATLN1234'
          work.setDelayMtn(CONSTANTS.LITERAL_NPATLN1234);
          // MOVE 'NPATLN1234' TO BILLKU00-MTN
          //  LITERAL_NPATLN1234 = 'NPATLN1234'
          work.setBillku00Mtn(CONSTANTS.LITERAL_NPATLN1234);
          // MOVE 'MB' TO DELAY-MEAS-CD
          //  LITERAL_MB = 'MB'
          work.setDelayMeasCd(CONSTANTS.LITERAL_MB);
//  SET DELAY-BILL-PERIOD2 TO TRUE
          work.setDelayBillPeriod2True(); 
          
//  PERFORM TEST-IF-PARA THROUGH TEST-IF-PARA-EXIT
          testIfPara();/*TEST-IF-PARA*/

// *
//  SET DELAYDAT-EOF TO TRUE
          work.setDelaydatEofTrue(); 
          
//  SET STOP-READ-DELAYDAT TO TRUE
          work.setStopReadDelaydatTrue(); 
          
//  SET DT-INDX TO 2
          dtIndx = 2; 
          
//  MOVE 654321123 TO DATA-HM-AIR-QTY-DEC ( DT-INDX )
          dataTable.getDataTableArray(dtIndx - 1).setDataHmAirQtyDec(BigDecimal.valueOf(654321123));
//  MOVE 654321123 TO WS-DELAY-USAGE-TOT-BP2-BP3-DEC
          delayUsageTotBp2Bp3Group.setDelayUsageTotBp2Bp3Dec(BigDecimal.valueOf(654321123));

// *
          // MOVE 'KB' TO DELAY-MEAS-CD
          //  LITERAL_KB = 'KB'
          work.setDelayMeasCd(CONSTANTS.LITERAL_KB);
//  PERFORM TEST-IF-PARA THROUGH TEST-IF-PARA-EXIT
          testIfPara();/*TEST-IF-PARA*/

// *
          // MOVE 'MB' TO DELAY-MEAS-CD
          //  LITERAL_MB = 'MB'
          work.setDelayMeasCd(CONSTANTS.LITERAL_MB);
//  SET DELAY-BILL-PERIOD3 TO TRUE
          work.setDelayBillPeriod3True(); 
          
//  PERFORM TEST-IF-PARA THROUGH TEST-IF-PARA-EXIT
          testIfPara();/*TEST-IF-PARA*/

// *
          // MOVE 'KB' TO DELAY-MEAS-CD
          //  LITERAL_KB = 'KB'
          work.setDelayMeasCd(CONSTANTS.LITERAL_KB);
//  PERFORM TEST-IF-PARA THROUGH TEST-IF-PARA-EXIT
          testIfPara();/*TEST-IF-PARA*/

// *
          // MOVE 'NPATLN1235' TO DELAY-MTN
          //  LITERAL_NPATLN1235 = 'NPATLN1235'
          work.setDelayMtn(CONSTANTS.LITERAL_NPATLN1235);
//  PERFORM TEST-IF-PARA THROUGH TEST-IF-PARA-EXIT
          testIfPara();/*TEST-IF-PARA*/

// *
          // MOVE 'NPATLN1231' TO DELAY-MTN
          //  LITERAL_NPATLN1231 = 'NPATLN1231'
          work.setDelayMtn(CONSTANTS.LITERAL_NPATLN1231);
//  PERFORM TEST-IF-PARA THROUGH TEST-IF-PARA-EXIT
          testIfPara();/*TEST-IF-PARA*/

// *
//  MOVE 70005 TO DELAY-CUST-ID-NO
          work.setDelayCustIdNo(70005);
//  PERFORM TEST-IF-PARA THROUGH TEST-IF-PARA-EXIT
          testIfPara();/*TEST-IF-PARA*/

// *
//  MOVE 69000 TO DELAY-CUST-ID-NO
          work.setDelayCustIdNo(69000);
//  PERFORM TEST-IF-PARA THROUGH TEST-IF-PARA-EXIT
          testIfPara();/*TEST-IF-PARA*/
          ;
      
      }
      /**
      * testIfPara 
      *   This method is derived from 
  *   COBOL Paragraph - TEST-IF-PARA COBOL Cyclomatic complexity - 18
      * Input  :  

      * - delayCustIdNo                  COBOL Name: DELAY-CUST-ID-NO
      * - billku00CustIdNo               COBOL Name: BILLKU00-CUST-ID-NO
      * - delayMtn                       COBOL Name: DELAY-MTN
      * - billku00Mtn                    COBOL Name: BILLKU00-MTN
      * - delayBillPeriod                COBOL Name: DELAY-BILL-PERIOD
      * - delayMeasCd                    COBOL Name: DELAY-MEAS-CD
      * - delaydatEofSw                  COBOL Name: DELAYDAT-EOF-SW
      * - readDelaydatSw                 COBOL Name: WS-READ-DELAYDAT-SW
      * - dataHmAirQtyDec                COBOL Name: DATA-HM-AIR-QTY-DEC
      * - delayUsageTotBp2Bp3Dec         COBOL Name: WS-DELAY-USAGE-TOT-BP2-BP3-DEC
      * - dtIndx                         COBOL Name: DT-INDX
      *
      * Output : None 

      * @throws CFException
      */
      private void testIfPara() throws Exception {
			// Declare local variables used in the method
			char[] delayMeasCd = null;
			char[] delayMtn = null;
			char[] billku00Mtn = null;
			int delayCustIdNo = 0;
			int billku00CustIdNo = 0;
			BigDecimal delayUsageTotBp2Bp3Dec = BigDecimal.ZERO;
			// End of variable declaration


// *
          delayCustIdNo = work.getDelayCustIdNo();
          billku00CustIdNo = work.getBillku00CustIdNo();
//  IF DELAY-CUST-ID-NO = BILLKU00-CUST-ID-NO
          if (	( delayCustIdNo == billku00CustIdNo )) { 
              delayMtn = work.getDelayMtn();
              billku00Mtn = work.getBillku00Mtn();
//  IF DELAY-MTN = BILLKU00-MTN
              if (		compareChars(delayMtn,billku00Mtn) == 0 ) { 
//  IF DELAY-BILL-PERIOD2
                  if ( work.isDelayBillPeriod2()  ) { 
                      delayMeasCd = work.getDelayMeasCd();
//  IF DELAY-MEAS-CD NOT = 'KB'
//  LITERAL_KB = 'KB'
                      if (compareChars(delayMeasCd,CONSTANTS.LITERAL_KB) != 0) { 
//  DISPLAY '21. CUST ID = BILLK CUST ID '
                          logger.info("21. CUST ID = BILLK CUST ID "); 
//  DISPLAY '20. DELAY MTN = BILLK MTN   '
                          logger.info("20. DELAY MTN = BILLK MTN   "); 
//  DISPLAY '19. BILL-PERIOD 2           '
                          logger.info("19. BILL-PERIOD 2           "); 
//  DISPLAY '18. MEAS-CD = KB            '
                          logger.info("18. MEAS-CD = KB            "); 
                      }
  
//  ELSE
                      else { 
//  DISPLAY '17. CUST ID = BILLK CUST ID '
                          logger.info("17. CUST ID = BILLK CUST ID "); 
//  DISPLAY '16. DELAY MTN = BILLK MTN   '
                          logger.info("16. DELAY MTN = BILLK MTN   "); 
//  DISPLAY '15. BILL-PERIOD 2           '
                          logger.info("15. BILL-PERIOD 2           "); 
//  DISPLAY '14. MEAS-CD NOT = KB        '
                          logger.info("14. MEAS-CD NOT = KB        "); 
                      }
                  }
//  ELSE
                  else { 
//  IF DELAY-BILL-PERIOD3
                      if ( work.isDelayBillPeriod3()  ) { 
                          delayMeasCd = work.getDelayMeasCd();
//  IF DELAY-MEAS-CD NOT = 'KB'
//  LITERAL_KB = 'KB'
                          if (compareChars(delayMeasCd,CONSTANTS.LITERAL_KB) != 0) { 
//  DISPLAY '13. CUST ID = BILLK CUST ID '
                              logger.info("13. CUST ID = BILLK CUST ID "); 
//  DISPLAY '12. DELAY MTN = BILLK MTN   '
                              logger.info("12. DELAY MTN = BILLK MTN   "); 
//  DISPLAY '11. BILL-PERIOD 3           '
                              logger.info("11. BILL-PERIOD 3           "); 
//  DISPLAY '10. MEAS-CD NOT KB          '
                              logger.info("10. MEAS-CD NOT KB          "); 
                          }
  
                      }
                  }
//  DISPLAY 'DONE WITH FIRST IF '
                  logger.info("DONE WITH FIRST IF "); 
              }
  
//  ELSE
              else { 
                  delayMtn = work.getDelayMtn();
                  billku00Mtn = work.getBillku00Mtn();
//  IF DELAY-MTN > BILLKU00-MTN
                  if (		compareChars(delayMtn,billku00Mtn) > 0 ) { 
//  DISPLAY '9. DELAY MTN > BILLK MTN   '
                      logger.info("9. DELAY MTN > BILLK MTN   "); 
                  }
  
//  ELSE
                  else { 
                      delayMtn = work.getDelayMtn();
                      billku00Mtn = work.getBillku00Mtn();
//  IF DELAY-MTN < BILLKU00-MTN
                      if (		compareChars(delayMtn,billku00Mtn) < 0 ) { 
//  DISPLAY '8. DELAY MTN < BILLK MTN   '
                          logger.info("8. DELAY MTN < BILLK MTN   "); 
                      }
  
                  }
              }
          }
  
//  ELSE
          else { 
              delayCustIdNo = work.getDelayCustIdNo();
              billku00CustIdNo = work.getBillku00CustIdNo();
//  IF DELAY-CUST-ID-NO > BILLKU00-CUST-ID-NO
              if (	( delayCustIdNo > billku00CustIdNo )) { 
//  DISPLAY '7. CUST ID > BILLK CUST ID '
                  logger.info("7. CUST ID > BILLK CUST ID "); 
              }
  
//  ELSE
              else { 
                  delayCustIdNo = work.getDelayCustIdNo();
                  billku00CustIdNo = work.getBillku00CustIdNo();
//  IF DELAY-CUST-ID-NO < BILLKU00-CUST-ID-NO
                  if (	( delayCustIdNo < billku00CustIdNo )) { 
//  DISPLAY '6.  CUST ID > BILLK CUST ID '
                      logger.info("6.  CUST ID > BILLK CUST ID "); 
                  }
  
              }
          }
//  IF DELAYDAT-EOF
          if ( work.isDelaydatEof()  ) { 
              delayMtn = work.getDelayMtn();
              delayCustIdNo = work.getDelayCustIdNo();
              billku00CustIdNo = work.getBillku00CustIdNo();
              billku00Mtn = work.getBillku00Mtn();
//  IF DELAY-CUST-ID-NO = BILLKU00-CUST-ID-NO AND DELAY-MTN = BILLKU00-MTN
              if (	( delayCustIdNo == billku00CustIdNo ) && 		compareChars(delayMtn,billku00Mtn) == 0 ) { 
//  DISPLAY '5.  CUST ID = BILLK CUST ID '
                  logger.info("5.  CUST ID = BILLK CUST ID "); 
//  DISPLAY '4.  DELAY MTN = BILLK MTN   '
                  logger.info("4.  DELAY MTN = BILLK MTN   "); 
//  DISPLAY '3.  DELAY DATA EOF '
                  logger.info("3.  DELAY DATA EOF "); 
              }
  
          }
//  IF STOP-READ-DELAYDAT
          if ( work.isStopReadDelaydat()  ) { 
//  DISPLAY '2. STOP READ DELAY DAT '
              logger.info("2. STOP READ DELAY DAT "); 
//  IF DATA-HM-AIR-QTY-DEC ( DT-INDX ) = WS-DELAY-USAGE-TOT-BP2-BP3-DEC
              if (			( dataTable.getDataTableArray(dtIndx - 1).getDataHmAirQtyDec().compareTo(delayUsageTotBp2Bp3Group.getDelayUsageTotBp2Bp3Dec()) == 0) ) { 
//  DISPLAY '1. DATA HM AIR QTY = USAGE TOTAL '
                  logger.info("1. DATA HM AIR QTY = USAGE TOTAL "); 
              }
          }
          ;
      
      }
      /**
      * process1 
      *   This method is derived from 
  *   COBOL Paragraph - PROCESS-1 COBOL Cyclomatic complexity - 1
      * Input  :  

      * - wS9                            COBOL Name: WS-9
      * - wS88                           COBOL Name: WS-88
      * - currentMonth                   COBOL Name: WS-CURRENT-MONTH
      * - higher                         COBOL Name: WS-HIGHER
      * - wmbcsCsCharacter               COBOL Name: WMBCS-CS-CHARACTER
      * - wmbcsShiftInPc                 COBOL Name: WMBCS-SHIFT-IN-PC
      * - wmbcsShiftOutPc                COBOL Name: WMBCS-SHIFT-OUT-PC
      *
      * Output :  

      * - monthRange                     COBOL Name: WS-MONTH-RANGE
      * - currentMonth                   COBOL Name: WS-CURRENT-MONTH
      * - tempMktgCd                     COBOL Name: WS-TEMP-MKTG-CD
      * - revoDnsCd                      COBOL Name: REVO-DNS-CD
      * - charWs                         COBOL Name: WS-CHAR
      * - char2                          COBOL Name: WS-CHAR2
      * - dispNum                        COBOL Name: WS-DISP-NUM
      * - array                          COBOL Name: WS-ARRAY
      * - higher                         COBOL Name: WS-HIGHER
      * - gp004300PinBlckFrmt            COBOL Name: GP004300-PIN-BLCK-FRMT
      *
      * @throws CFException
      */
      private void process1() throws Exception {
			// Declare local variables used in the method
			int wS9 = 0;
			Init init = higher.getInit();
			char[] gp004300PinBlckFrmt = null;
			char[] wmbcsCsCharacter = null;
			char[] wmbcsShiftOutPc = null;
			// End of variable declaration

          wS9 = x9.getWS9();
//  IF WS-9 = 0 THEN
          if (	( wS9 == 0 )) { 
//  DISPLAY '28.TRUE  - MOVED JUNK   BUT COMPARED 2 0 '
              logger.info("28.TRUE  - MOVED JUNK   BUT COMPARED 2 0 "); 
          }
  
//  ELSE
          else { 
//  DISPLAY '27.FALSE - MOVED JUNK   BUT COMPARED 2 0 '
              logger.info("27.FALSE - MOVED JUNK   BUT COMPARED 2 0 "); 
          }
//  IF WS-ZERO THEN
          if ( x9.isZero()  ) { 
//  DISPLAY '26.TRUE 88   - MOVED JUNK   BUT COMPARED 2 0'
              logger.info("26.TRUE 88   - MOVED JUNK   BUT COMPARED 2 0"); 
          }
//  ELSE
          else { 
//  DISPLAY '25. FALSE 88 - MOVED JUNK   BUT COMPARED TO 0'
              logger.info("25. FALSE 88 - MOVED JUNK   BUT COMPARED TO 0"); 
          }

// *
//  MOVE WS-CURRENT-MONTH TO WS-MONTH-RANGE
          work.setMonthRange(String.valueOf(work.getCurrentMonthString()).toCharArray());
//  IF WITHIN-RANGE THEN
          if ( work.isWithinRange()  ) { 
//  DISPLAY '24. MONTH IS WITHIN RANGE '
              logger.info("24. MONTH IS WITHIN RANGE "); 
          }
//  ELSE
          else { 
//  DISPLAY '23. MONTH RANGE CHECK FAILED ... '
              logger.info("23. MONTH RANGE CHECK FAILED ... "); 
          }
//  PERFORM TEST-CONDITIONS THRU TEST-CONDITIONS-EXIT
          testConditions();/*TEST-CONDITIONS*/
          if (this.isProgramEnded()) {
              return ;
          }

// *
//  MOVE 3 TO WS-TEMP-MKTG-CD
          work.setTempMktgCd(3);
//  MOVE WS-TEMP-MKTG-CD TO REVO-DNS-CD ( WS-TEMP-MKTG-CD : 1)
          work.setRevoDnsCd(replace(work.getRevoDnsCd(),String.valueOf(CFUtil.pad(1,String.valueOf(work.getTempMktgCd()),"0",CFUtil.LEFT_PAD)).toCharArray(),(work.getTempMktgCd()-1), (work.getTempMktgCd() + 0) ));
//  DISPLAY '22. REVO DNS CODE ' REVO-DNS-CD
          logger.info("22. REVO DNS CODE {}", new String(work.getRevoDnsCd())); 

// *
//  SET WS-88-CHAR-B WS-88-CHAR2-C TO TRUE
          higher.getInit().setCharB88True(); 
          
          higher.getInit().setChar2C88True(); 
          
//  MOVE 1 TO WS-DISP-NUM
          init.setDispNum(1);
  
//  MOVE WS-HIGHER TO WS-ARRAY
          higher.getArray().initialize();

// *
//  MOVE SPACES TO GP004300-PIN-BLCK-FRMT
          gp004300PinBlckFrmtCdGroup.setGp004300PinBlckFrmt(CONSTANTS.SPACE_2);
          gp004300PinBlckFrmt = gp004300PinBlckFrmtCdGroup.getGp004300PinBlckFrmt();
//  IF GP004300-PIN-BLCK-FRMT (1 : 1) = ' '
          if (gp004300PinBlckFrmt[0] == ' ') { 
//  DISPLAY '85. SPACE CHECK PASSED '
              logger.info("85. SPACE CHECK PASSED "); 
          }
  
          wmbcsCsCharacter = work.getWmbcsCsCharacter();
          wmbcsShiftOutPc = work.getWmbcsShiftOutPc();
//  EVALUATE TRUE
          if  (isHexInRange(wmbcsCsCharacter,CONSTANTS.LITERAL_1337859676) /* class condition with Hex value */) { 
//  DISPLAY '*  8 *   DBCS CHAR'
              logger.info("*  8 *   DBCS CHAR"); 
          }
          else if  (        ( allSpaces(wmbcsCsCharacter)   )) { 
//  DISPLAY '*  9 *   SPACE CHAR'
              logger.info("*  9 *   SPACE CHAR"); 
          }
          else if  (		compareChars(wmbcsCsCharacter,work.getWmbcsShiftInPc()) == 0 ) { 
//  DISPLAY '* 10 *   SHIFT-IN CHAR'
              logger.info("* 10 *   SHIFT-IN CHAR"); 
          }
          else if  (		compareChars(wmbcsCsCharacter,wmbcsShiftOutPc) == 0 ) { 
//  DISPLAY '* 11 *   SHIFT-OUT CHAR'
              logger.info("* 11 *   SHIFT-OUT CHAR"); 
          }
          else   { 
//  DISPLAY '* 12 *   OTHER CHAR'
              logger.info("* 12 *   OTHER CHAR"); 
          }
  

// *

// *

// *
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
  
  
  
  
  
  
  }
