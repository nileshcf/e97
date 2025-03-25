package com.cloudframe.app.business.impl;
/* The comment section is too large,
 * hence added at the end of the java code
 * please scroll all the way to the bottom to see complete comments
 */

import com.cloudframe.app.business.D5427pol;
import com.cloudframe.app.common.CONSTANTS;
import com.cloudframe.app.common.CommonProcess;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.dto.ProgramContext;
import com.cloudframe.app.dto.d5427pol.*;
import com.cloudframe.app.dto.d5427pol.D5427polCtx;
import com.cloudframe.app.dto.d5427pol.D5427polCtx.*;
import com.cloudframe.app.dto.d5427pol.DsmCallArea;
import com.cloudframe.app.dto.d5427pol.DsmDataArea;
import com.cloudframe.app.dto.d5427pol.DsmRet10Area;
import com.cloudframe.app.dto.d5427pol.DsmRet12Area;
import com.cloudframe.app.dto.d5427pol.DsmRet1Area;
import com.cloudframe.app.dto.d5427pol.DsmRet2Area;
import com.cloudframe.app.dto.d5427pol.DsmRet3Area;
import com.cloudframe.app.dto.d5427pol.DsmRet4Area;
import com.cloudframe.app.dto.d5427pol.DsmRet5Area;
import com.cloudframe.app.dto.d5427pol.DsmRet6Area;
import com.cloudframe.app.dto.d5427pol.DsmRet7Area;
import com.cloudframe.app.dto.d5427pol.DsmRet8Area;
import com.cloudframe.app.dto.d5427pol.DsmRet9Area;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.repository.D5427polRepository;
import com.cloudframe.app.utility.CFUtil;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("d5427pol")
public class D5427polImpl extends CommonProcess implements D5427pol {

  Logger logger = LoggerFactory.getLogger(D5427polImpl.class);

  @Value("${D5427POL.dbQualifier:}")
  private String dbQualifier;

  @Autowired
  @Qualifier("d5427polRepository")
  D5427polRepository d5427polRepository;

  @Override
  public int setParameter(
      D5427polCtx programCtx,
      String dsmCallArea,
      String dsmDataArea,
      String dsmRet1Area,
      String dsmRet2Area,
      String dsmRet3Area,
      String dsmRet4Area,
      String dsmRet5Area,
      String dsmRet6Area,
      String dsmRet7Area,
      String dsmRet8Area,
      String dsmRet9Area,
      String dsmRet10Area,
      String dsmRet12Area)
      throws Exception {
    if (dsmCallArea != null)
      programCtx
          .getDsmCallArea()
          .setString(
              com.cloudframe.app.data.Field.getParm(dsmCallArea),
              new String(CONSTANTS.EBCDIC_ENCODING));
    if (dsmDataArea != null)
      programCtx
          .getDsmDataArea()
          .setString(
              com.cloudframe.app.data.Field.getParm(dsmDataArea),
              new String(CONSTANTS.EBCDIC_ENCODING));
    if (dsmRet1Area != null)
      programCtx
          .getDsmRet1Area()
          .setString(
              com.cloudframe.app.data.Field.getParm(dsmRet1Area),
              new String(CONSTANTS.EBCDIC_ENCODING));
    if (dsmRet2Area != null)
      programCtx
          .getDsmRet2Area()
          .setString(
              com.cloudframe.app.data.Field.getParm(dsmRet2Area),
              new String(CONSTANTS.EBCDIC_ENCODING));
    if (dsmRet3Area != null)
      programCtx
          .getDsmRet3Area()
          .setString(
              com.cloudframe.app.data.Field.getParm(dsmRet3Area),
              new String(CONSTANTS.EBCDIC_ENCODING));
    if (dsmRet4Area != null)
      programCtx
          .getDsmRet4Area()
          .setString(
              com.cloudframe.app.data.Field.getParm(dsmRet4Area),
              new String(CONSTANTS.EBCDIC_ENCODING));
    if (dsmRet5Area != null)
      programCtx
          .getDsmRet5Area()
          .setString(
              com.cloudframe.app.data.Field.getParm(dsmRet5Area),
              new String(CONSTANTS.EBCDIC_ENCODING));
    if (dsmRet6Area != null)
      programCtx
          .getDsmRet6Area()
          .setString(
              com.cloudframe.app.data.Field.getParm(dsmRet6Area),
              new String(CONSTANTS.EBCDIC_ENCODING));
    if (dsmRet7Area != null)
      programCtx
          .getDsmRet7Area()
          .setString(
              com.cloudframe.app.data.Field.getParm(dsmRet7Area),
              new String(CONSTANTS.EBCDIC_ENCODING));
    if (dsmRet8Area != null)
      programCtx
          .getDsmRet8Area()
          .setString(
              com.cloudframe.app.data.Field.getParm(dsmRet8Area),
              new String(CONSTANTS.EBCDIC_ENCODING));
    if (dsmRet9Area != null)
      programCtx
          .getDsmRet9Area()
          .setString(
              com.cloudframe.app.data.Field.getParm(dsmRet9Area),
              new String(CONSTANTS.EBCDIC_ENCODING));
    if (dsmRet10Area != null)
      programCtx
          .getDsmRet10Area()
          .setString(
              com.cloudframe.app.data.Field.getParm(dsmRet10Area),
              new String(CONSTANTS.EBCDIC_ENCODING));
    if (dsmRet12Area != null)
      programCtx
          .getDsmRet12Area()
          .setString(
              com.cloudframe.app.data.Field.getParm(dsmRet12Area),
              new String(CONSTANTS.EBCDIC_ENCODING));
    setInitDone(false);
    process(programCtx);
    return programCtx.getRc();
  }
  /**
   * process Input : None
   *
   * <p>Output : None
   *
   * @throws CFException
   */
  public int process(D5427polCtx programCtx) throws Exception {
    try {
      setCodePage("1047");
      // Reset program ended flag
      programCtx.setProgramEnded(false);
      db2Base.reset("D5427POL", dbQualifier, true /*use Dynamic SQL*/);
      // Added variable to get the output context in place.
      ProcessInCtx methodIn = programCtx.getProcessInCtx();
      //  cobolCode::PERFORM 0000-MAINLINE
      mainline(programCtx.getMainlineInCtx()); /*0000-MAINLINE SECTION*/
      if (programCtx.isProgramEnded()) {
        return programCtx.getRc();
      }
    } catch (Exception e) {
      handleErrorCode(e);
      throw e;
    } finally {
      handleDbAtEnd(db2Base);
    }

    return programCtx.getRc(); // Exit with return code
    // end of process method
  }
  /**
   * mainline This method is derived from COBOL Paragraph - 0000-MAINLINE SECTION COBOL Cyclomatic
   * complexity - 15 Input :
   *
   * <p>- dsmReturnCode COBOL Name: DSM-RETURN-CODE - polReqClngProg COBOL Name: POL-REQ-CLNG-PROG -
   * dsmPgmName COBOL Name: WS-DSM-PGM-NAME
   *
   * <p>Output :
   *
   * <p>- dsmErrClngPgmName COBOL Name: DSM-ERR-CLNG-PGM-NAME - polReqClngProg COBOL Name:
   * POL-REQ-CLNG-PROG - dsmErrPgmName COBOL Name: DSM-ERR-PGM-NAME - dsmPgmName COBOL Name:
   * WS-DSM-PGM-NAME - dsmRet10Area COBOL Name: DSM-RET10-AREA - dsmRet12Area COBOL Name:
   * DSM-RET12-AREA
   *
   * @throws CFException
   */
  @Override
  public MainlineOutCtx mainline(MainlineInCtx methodIn) throws Exception {
    // Added variable to get the program context in place.
    D5427polCtx programCtx = methodIn.getD5427polCtx();
    // Added variable to get the output context in place.
    MainlineOutCtx methodOut = methodIn.getMainlineOutCtx();
    //  cobolCode::PERFORM 1000-INITIALIZE
    initialize(programCtx.getInitializeInCtx()); /*1000-INITIALIZE SECTION*/
    if (programCtx.isProgramEnded()) {
      return methodOut;
    }
    //  cobolCode::IF DSM-EDIT-ERROR
    if (methodIn.isDsmEditError()) {
      //  cobolCode::MOVE POL-REQ-CLNG-PROG TO DSM-ERR-CLNG-PGM-NAME
      methodOut.setDsmErrClngPgmName(methodOut.getPolReqClngProg());
      //  cobolCode::MOVE WS-DSM-PGM-NAME TO DSM-ERR-PGM-NAME
      methodOut.setDsmErrPgmName(methodOut.getDsmPgmName());
    }
    //  cobolCode::ELSE
    else {
      //  cobolCode::EVALUATE DSM-FUNC-CD
      switch (methodIn.getDsmFuncCd()) {
        case 1:
          //  cobolCode::PERFORM 2000-FUNC-CD1-POLPLN-MXI-READ
          funcCd1PolplnMxiRead(
              programCtx.getFuncCd1PolplnMxiReadInCtx()); /*2000-FUNC-CD1-POLPLN-MXI-READ SECTION*/
          if (programCtx.isProgramEnded()) {
            return methodOut;
          }
          break;
        case 2:
          //  cobolCode::PERFORM 1300-GET-STD-MXI-DATA
          getStdMxiData(programCtx.getGetStdMxiDataInCtx()); /*1300-GET-STD-MXI-DATA SECTION*/
          if (programCtx.isProgramEnded()) {
            return methodOut;
          }

          // *               Perform 3000-fun-cd2-polpln-arng
          //  cobolCode::PERFORM 3300-FUN-CD2-POLPLN-XREF
          funCd2PolplnXref(
              programCtx.getFunCd2PolplnXrefInCtx()); /*3300-FUN-CD2-POLPLN-XREF SECTION*/
          if (programCtx.isProgramEnded()) {
            return methodOut;
          }
          //  cobolCode::PERFORM 3060-RCPRCTY-SELECT THRU 3060-EXIT
          rcprctySelect(programCtx.getRcprctySelectInCtx()); /*3060-RCPRCTY-SELECT SECTION*/
          if (programCtx.isProgramEnded()) {
            return methodOut;
          }
          break;
        case 3:
          //  cobolCode::PERFORM 1300-GET-STD-MXI-DATA
          getStdMxiData(programCtx.getGetStdMxiDataInCtx()); /*1300-GET-STD-MXI-DATA SECTION*/
          if (programCtx.isProgramEnded()) {
            return methodOut;
          }
          //  cobolCode::PERFORM 4000-FUNC-CD3-MXI-READ
          funcCd3MxiRead(programCtx.getFuncCd3MxiReadInCtx()); /*4000-FUNC-CD3-MXI-READ SECTION*/
          if (programCtx.isProgramEnded()) {
            return methodOut;
          }
          break;
        case 4:
          //  cobolCode::PERFORM 1300-GET-STD-MXI-DATA
          getStdMxiData(programCtx.getGetStdMxiDataInCtx()); /*1300-GET-STD-MXI-DATA SECTION*/
          if (programCtx.isProgramEnded()) {
            return methodOut;
          }
          //  cobolCode::PERFORM 5000-FUNC-CD4-MXI-READ
          funcCd4MxiRead(programCtx.getFuncCd4MxiReadInCtx()); /*5000-FUNC-CD4-MXI-READ SECTION*/
          if (programCtx.isProgramEnded()) {
            return methodOut;
          }
          //  cobolCode::PERFORM 5500-FUNC-CD4-POLBENLVL-READ
          funcCd4PolbenlvlRead(
              programCtx.getFuncCd4PolbenlvlReadInCtx()); /*5500-FUNC-CD4-POLBENLVL-READ SECTION*/
          if (programCtx.isProgramEnded()) {
            return methodOut;
          }
          //  cobolCode::PERFORM 5600-FUNC-CD4-POLFAMDED-READ
          funcCd4PolfamdedRead(
              programCtx.getFuncCd4PolfamdedReadInCtx()); /*5600-FUNC-CD4-POLFAMDED-READ SECTION*/
          if (programCtx.isProgramEnded()) {
            return methodOut;
          }
          //  cobolCode::PERFORM 5700-FUNC-CD4-POLINDVDED-READ
          funcCd4PolindvdedRead(
              programCtx.getFuncCd4PolindvdedReadInCtx()); /*5700-FUNC-CD4-POLINDVDED-READ SECTION*/
          if (programCtx.isProgramEnded()) {
            return methodOut;
          }
          break;
        case 5:
          //  cobolCode::PERFORM 1300-GET-STD-MXI-DATA
          getStdMxiData(programCtx.getGetStdMxiDataInCtx()); /*1300-GET-STD-MXI-DATA SECTION*/
          if (programCtx.isProgramEnded()) {
            return methodOut;
          }
          //  cobolCode::PERFORM 6000-FUN-CD5-POLHDR-THER-READ
          funCd5PolhdrTherRead(
              programCtx.getFunCd5PolhdrTherReadInCtx()); /*6000-FUN-CD5-POLHDR-THER-READ SECTION*/
          if (programCtx.isProgramEnded()) {
            return methodOut;
          }
          break;
        case 6:
          //  cobolCode::PERFORM 7000-FUNC-CD6-READ-MXI
          funcCd6ReadMxi(programCtx.getFuncCd6ReadMxiInCtx()); /*7000-FUNC-CD6-READ-MXI SECTION*/
          if (programCtx.isProgramEnded()) {
            return methodOut;
          }
          //  cobolCode::PERFORM 7200-FUNC-CD6-READ-FAM
          funcCd6ReadFam(programCtx.getFuncCd6ReadFamInCtx()); /*7200-FUNC-CD6-READ-FAM SECTION*/
          if (programCtx.isProgramEnded()) {
            return methodOut;
          }
          //  cobolCode::PERFORM 7300-FUNC-CD6-READ-IND
          funcCd6ReadInd(programCtx.getFuncCd6ReadIndInCtx()); /*7300-FUNC-CD6-READ-IND SECTION*/
          if (programCtx.isProgramEnded()) {
            return methodOut;
          }
          break;
        case 7:
          //  cobolCode::PERFORM 7500-FUNC-CD7-SEARCH-POL
          funcCd7SearchPol(
              programCtx.getFuncCd7SearchPolInCtx()); /*7500-FUNC-CD7-SEARCH-POL SECTION*/
          if (programCtx.isProgramEnded()) {
            return methodOut;
          }
          break;
        case 8:

          // ***        When 9
          //  cobolCode::PERFORM 1300-GET-STD-MXI-DATA
          getStdMxiData(programCtx.getGetStdMxiDataInCtx()); /*1300-GET-STD-MXI-DATA SECTION*/
          if (programCtx.isProgramEnded()) {
            return methodOut;
          }
          //  cobolCode::PERFORM 8300-FUN-CD8-POLPLN-XREF
          funCd8PolplnXref(
              programCtx.getFunCd8PolplnXrefInCtx()); /*8300-FUN-CD8-POLPLN-XREF SECTION*/
          if (programCtx.isProgramEnded()) {
            return methodOut;
          }
          //  cobolCode::PERFORM 8500-RCPRCTY-SELECT THRU 8500-EXIT
          rcprctySelect8500(programCtx.getRcprctySelect8500InCtx()); /*8500-RCPRCTY-SELECT SECTION*/
          if (programCtx.isProgramEnded()) {
            return methodOut;
          }
          //  cobolCode::PERFORM 8510-RCPRCTY-SELECT1 THRU 8510-EXIT
          rcprctySelect1(programCtx.getRcprctySelect1InCtx()); /*8510-RCPRCTY-SELECT1 SECTION*/
          if (programCtx.isProgramEnded()) {
            return methodOut;
          }
          //  cobolCode::PERFORM 8600-DERIVE-PLAN-REFERRAL THRU 8600-EXIT
          derivePlanReferral(
              programCtx.getDerivePlanReferralInCtx()); /*8600-DERIVE-PLAN-REFERRAL SECTION*/
          if (programCtx.isProgramEnded()) {
            return methodOut;
          }
          break;
        case 9:
          //  cobolCode::PERFORM 2000-FUNC-CD1-POLPLN-MXI-READ
          funcCd1PolplnMxiRead(
              programCtx.getFuncCd1PolplnMxiReadInCtx()); /*2000-FUNC-CD1-POLPLN-MXI-READ SECTION*/
          if (programCtx.isProgramEnded()) {
            return methodOut;
          }
          //  cobolCode::PERFORM 9000-FUN-CD9-POL-PHYTHER-READ
          funCd9PolPhytherRead(
              programCtx.getFunCd9PolPhytherReadInCtx()); /*9000-FUN-CD9-POL-PHYTHER-READ SECTION*/
          if (programCtx.isProgramEnded()) {
            return methodOut;
          }
          break;
        case 10:
          //  cobolCode::INITIALIZE DSM-RET10-AREA
          methodOut.getDsmRet10Area().initialize();
          //  cobolCode::PERFORM 1300-GET-STD-MXI-DATA THRU 1300-EXIT
          getStdMxiData(programCtx.getGetStdMxiDataInCtx()); /*1300-GET-STD-MXI-DATA SECTION*/
          if (programCtx.isProgramEnded()) {
            return methodOut;
          }
          //  cobolCode::PERFORM 10000-FUNC-CD10-MXI-READ THRU 10000-EXIT
          funcCd10MxiRead(
              programCtx.getFuncCd10MxiReadInCtx()); /*10000-FUNC-CD10-MXI-READ SECTION*/
          if (programCtx.isProgramEnded()) {
            return methodOut;
          }
          break;
        case 11:
          //  cobolCode::PERFORM 11000-FUNC-CD11-READ-MXI THRU 11000-EXIT
          funcCd11ReadMxi(
              programCtx.getFuncCd11ReadMxiInCtx()); /*11000-FUNC-CD11-READ-MXI SECTION*/
          if (programCtx.isProgramEnded()) {
            return methodOut;
          }
          break;
        case 12:
          //  cobolCode::INITIALIZE DSM-RET12-AREA
          methodOut.getDsmRet12Area().initialize();
          //  cobolCode::PERFORM 1300-GET-STD-MXI-DATA THRU 1300-EXIT
          getStdMxiData(programCtx.getGetStdMxiDataInCtx()); /*1300-GET-STD-MXI-DATA SECTION*/
          if (programCtx.isProgramEnded()) {
            return methodOut;
          }
          //  cobolCode::PERFORM 12000-GET-STD-MMI-DATA THRU 12000-EXIT
          getStdMmiData(programCtx.getGetStdMmiDataInCtx()); /*12000-GET-STD-MMI-DATA SECTION*/
          if (programCtx.isProgramEnded()) {
            return methodOut;
          }
          break;
      }
    }
    //  cobolCode::GOBACK
    setNotLogged(false); // no need to log, it is a normal termination
    programCtx.setProgramEnded(true);
    return methodOut;
  }
  /**
   * initialize This method is derived from COBOL Paragraph - 1000-INITIALIZE SECTION COBOL
   * Cyclomatic complexity - 35 Input :
   *
   * <p>- dsmFuncCd COBOL Name: DSM-FUNC-CD - polReqCovTypCd COBOL Name: POL-REQ-COV-TYP-CD -
   * polReqMxiPolNbr COBOL Name: POL-REQ-MXI-POL-NBR - polReqMxiPlnNbr COBOL Name:
   * POL-REQ-MXI-PLN-NBR - polReqMxiClssNbr COBOL Name: POL-REQ-MXI-CLSS-NBR - polReqEffDt COBOL
   * Name: POL-REQ-EFF-DT - polReqCancDt COBOL Name: POL-REQ-CANC-DT
   *
   * <p>Output :
   *
   * <p>- dclcustPolPlnXref COBOL Name: DCLCUST-POL-PLN-XREF - dclcustPlnPpoArng COBOL Name:
   * DCLCUST-PLN-PPO-ARNG - dclpolPlnMstr COBOL Name: DCLPOL-PLN-MSTR - dclpolPlnMstrBenLvl COBOL
   * Name: DCLPOL-PLN-MSTR-BEN-LVL - dclpolPlnMstrFamDed COBOL Name: DCLPOL-PLN-MSTR-FAM-DED -
   * dclpolPlnMstrIndvDed COBOL Name: DCLPOL-PLN-MSTR-INDV-DED - dclpolPlnMstrPpoArng COBOL Name:
   * DCLPOL-PLN-MSTR-PPO-ARNG - dclntwkRcprctyDtl COBOL Name: DCLNTWK-RCPRCTY-DTL - dclpolPlnDenorm
   * COBOL Name: DCLPOL-PLN-DENORM - dsmLogArea COBOL Name: DSM-LOG-AREA - dsmReturnCode COBOL Name:
   * DSM-RETURN-CODE - dsmRet1Area COBOL Name: DSM-RET1-AREA - dsmRet2Area COBOL Name: DSM-RET2-AREA
   * - dsmRet3Area COBOL Name: DSM-RET3-AREA - dsmRet4Area COBOL Name: DSM-RET4-AREA - dsmRet5Area
   * COBOL Name: DSM-RET5-AREA - dsmRet6Area COBOL Name: DSM-RET6-AREA - dsmRet7Area COBOL Name:
   * DSM-RET7-AREA - dsmRet8Area COBOL Name: DSM-RET8-AREA - dsmSqlErrorLevel COBOL Name:
   * DSM-SQL-ERROR-LEVEL - dsmEditErrorValueTxt COBOL Name: DSM-EDIT-ERROR-VALUE-TXT - dsmFuncCd
   * COBOL Name: DSM-FUNC-CD - dsmEditErrorField COBOL Name: DSM-EDIT-ERROR-FIELD - polReqCovTypCd
   * COBOL Name: POL-REQ-COV-TYP-CD - polReqMxiPolNbr COBOL Name: POL-REQ-MXI-POL-NBR -
   * polReqMxiPlnNbr COBOL Name: POL-REQ-MXI-PLN-NBR - polReqEffDt COBOL Name: POL-REQ-EFF-DT -
   * polReqCancDt COBOL Name: POL-REQ-CANC-DT
   *
   * @throws CFException
   */
  @Override
  public InitializeOutCtx initialize(InitializeInCtx methodIn) throws Exception {

    // *81***************************************************************
    // *81 1000-Initialize                                              *
    // *81 business function:  initialization section                   *
    // *81***************************************************************
    // *82***************************************************************
    // *82 1000-initialize                                              *
    // *82 1. initializes all the dclgen and working storage fields.    *
    // *82    and validate the request data                             *
    // *82***************************************************************
    // Added variable to get the program context in place.
    D5427polCtx programCtx = methodIn.getD5427polCtx();
    // Added variable to get the output context in place.
    InitializeOutCtx methodOut = methodIn.getInitializeOutCtx();
    //  cobolCode::INITIALIZE DCLCUST-POL-PLN-XREF DCLCUST-PLN-PPO-ARNG DCLPOL-PLN-MSTR
    // DCLPOL-PLN-MSTR-BEN-LVL DCLPOL-PLN-MSTR-FAM-DED DCLPOL-PLN-MSTR-INDV-DED
    // DCLPOL-PLN-MSTR-PPO-ARNG DCLNTWK-RCPRCTY-DTL DCLPOL-PLN-DENORM DSM-LOG-AREA DSM-RETURN-CODE
    // DSM-RET1-AREA DSM-RET2-AREA DSM-RET3-AREA DSM-RET4-AREA DSM-RET5-AREA DSM-RET6-AREA
    // DSM-RET7-AREA DSM-RET8-AREA
    methodOut.getDclcustPolPlnXref().initialize();
    methodOut.getDclcustPlnPpoArng().initialize();
    methodOut.getDclpolPlnMstr().initialize();
    methodOut.getDclpolPlnMstrBenLvl().initialize();
    methodOut.getDclpolPlnMstrFamDed().initialize();
    methodOut.getDclpolPlnMstrIndvDed().initialize();
    methodOut.getDclpolPlnMstrPpoArng().initialize();
    methodOut.getDclntwkRcprctyDtl().initialize();
    methodOut.getDclpolPlnDenorm().initialize();
    methodOut.getDsmLogArea().initialize();
    methodOut.setDsmReturnCode(0);
    methodOut.getDsmRet1Area().initialize();
    methodOut.getDsmRet2Area().initialize();
    methodOut.getDsmRet3Area().initialize();
    methodOut.getDsmRet4Area().initialize();
    methodOut.getDsmRet5Area().initialize();
    methodOut.getDsmRet6Area().initialize();
    methodOut.getDsmRet7Area().initialize();
    methodOut.getDsmRet8Area().initialize();

    // ***             Dsm-ret9-area.

    // *    If dsm-func-cd = 1 or 2 or 3 or 4 or 5 or 6
    // ***  if dsm-func-cd = 1 or 2 or 3 or 4 or 5 or 6 or 7 or 9

    // ***                              Or 14
    // ***a79220                 or 9 or 14
    // ***b77822                 or 9 or 14 or 10
    // *b77822                   or 9 or 14 or 10 or 11
    //  cobolCode::SET DSM-NO-ERROR TO TRUE
    methodOut.setDsmNoErrorTrue();

    //  cobolCode::IF DSM-FUNC-CD = 1 OR 2 OR 3 OR 4 OR 5 OR 6 OR 7 OR 8 OR 9 OR 14 OR 10 OR 11 OR
    // 12
    //  cobolCode::ELSE
    if ((methodOut.getDsmFuncCd() != 1)
        && (methodOut.getDsmFuncCd() != 2)
        && (methodOut.getDsmFuncCd() != 3)
        && (methodOut.getDsmFuncCd() != 4)
        && (methodOut.getDsmFuncCd() != 5)
        && (methodOut.getDsmFuncCd() != 6)
        && (methodOut.getDsmFuncCd() != 7)
        && (methodOut.getDsmFuncCd() != 8)
        && (methodOut.getDsmFuncCd() != 9)
        && (methodOut.getDsmFuncCd() != 14)
        && (methodOut.getDsmFuncCd() != 10)
        && (methodOut.getDsmFuncCd() != 11)
        && (methodOut.getDsmFuncCd() != 12)) {
      //  cobolCode::SET DSM-EDIT-ERROR TO TRUE
      methodOut.setDsmEditErrorTrue();

      //  cobolCode::SET DSM-PROCESS-ERROR TO TRUE
      methodOut.setDsmProcessErrorTrue();

      //  cobolCode::MOVE DSM-FUNC-CD TO DSM-EDIT-ERROR-VALUE-TXT
      methodOut
          .getDsmEditErrorValueTxt()
          .setString(String.valueOf(methodOut.getDsmFuncCdString()).toCharArray());
      //  cobolCode::MOVE 'DSM-FUNC-CD' TO DSM-EDIT-ERROR-FIELD
      methodOut.setDsmEditErrorField(CONSTANTS.LITERAL_DSM_MN2_FUNCCD_B19_);
    }
    //  cobolCode::IF ( POL-REQ-COV-TYP-CD = SPACES OR LOW-VALUES OR HIGH-VALUES OR ZEROS)
    if (((allSpaces(methodOut.getPolReqCovTypCd()))
        || (checkLowValue(methodOut.getPolReqCovTypCd()))
        || (isHighValue(methodOut.getPolReqCovTypCd()))
        || (allZeros(methodOut.getPolReqCovTypCd())) /*  ==  zeros*/)) {
      //  cobolCode::SET DSM-EDIT-ERROR TO TRUE
      methodOut.setDsmEditErrorTrue();

      //  cobolCode::MOVE 'POL-REQ-COV-TYP-CD' TO DSM-EDIT-ERROR-FIELD
      methodOut.setDsmEditErrorField(CONSTANTS.LITERAL_POL_MN4_REQCOVTYPCD_B12_);
      //  cobolCode::MOVE POL-REQ-COV-TYP-CD TO DSM-EDIT-ERROR-VALUE-TXT
      methodOut.getDsmEditErrorValueTxt().setString(methodOut.getPolReqCovTypCd());
      // cobolCode::GO TO 1000-EXIT
      return methodOut;
      // cobolCodeEnds::GO TO 1000-EXIT
    }
    //  cobolCode::IF ( POL-REQ-MXI-POL-NBR = SPACES OR LOW-VALUES OR HIGH-VALUES OR ZEROS)
    if (((allSpaces(methodOut.getPolReqMxiPolNbr()))
        || (checkLowValue(methodOut.getPolReqMxiPolNbr()))
        || (isHighValue(methodOut.getPolReqMxiPolNbr()))
        || (allZeros(methodOut.getPolReqMxiPolNbr())) /*  ==  zeros*/)) {
      //  cobolCode::SET DSM-EDIT-ERROR TO TRUE
      methodOut.setDsmEditErrorTrue();

      //  cobolCode::MOVE 'POL-REQ-MXI-POL-NBR' TO DSM-EDIT-ERROR-FIELD
      methodOut.setDsmEditErrorField(CONSTANTS.LITERAL_POL_MN4_REQMXIPOLNBR_B11_);
      //  cobolCode::MOVE POL-REQ-MXI-POL-NBR TO DSM-EDIT-ERROR-VALUE-TXT
      methodOut.getDsmEditErrorValueTxt().setString(methodOut.getPolReqMxiPolNbr());
      // cobolCode::GO TO 1000-EXIT
      return methodOut;
      // cobolCodeEnds::GO TO 1000-EXIT
    }
    //  cobolCode::IF ( POL-REQ-MXI-PLN-NBR = ZEROS) OR ( POL-REQ-MXI-PLN-NBR IS NOT NUMERIC)
    if (((methodOut.getPolReqMxiPlnNbr() == 0))
        || (!(methodIn.getPolReqArea().polReqMxiPlnNbrIsNumeric()))) {
      //  cobolCode::SET DSM-EDIT-ERROR TO TRUE
      methodOut.setDsmEditErrorTrue();

      //  cobolCode::MOVE 'POL-REQ-MXI-PLN-NBR' TO DSM-EDIT-ERROR-FIELD
      methodOut.setDsmEditErrorField(CONSTANTS.LITERAL_POL_MN4_REQMXIPLNNBR_B11_);
      //  cobolCode::MOVE POL-REQ-MXI-PLN-NBR TO DSM-EDIT-ERROR-VALUE-TXT
      methodOut
          .getDsmEditErrorValueTxt()
          .setString(String.valueOf(methodOut.getPolReqMxiPlnNbrString()).toCharArray());
      // cobolCode::GO TO 1000-EXIT
      return methodOut;
      // cobolCodeEnds::GO TO 1000-EXIT
    }
    //  cobolCode::IF ( POL-REQ-MXI-CLSS-NBR IS NOT NUMERIC)
    if ((!(methodIn.getPolReqArea().polReqMxiClssNbrIsNumeric()))) {
      //  cobolCode::SET DSM-EDIT-ERROR TO TRUE
      methodOut.setDsmEditErrorTrue();

      //  cobolCode::MOVE 'POL-REQ-MXI-PLN-NBR' TO DSM-EDIT-ERROR-FIELD
      methodOut.setDsmEditErrorField(CONSTANTS.LITERAL_POL_MN4_REQMXIPLNNBR_B11_);
      //  cobolCode::MOVE POL-REQ-MXI-PLN-NBR TO DSM-EDIT-ERROR-VALUE-TXT
      methodOut
          .getDsmEditErrorValueTxt()
          .setString(String.valueOf(methodOut.getPolReqMxiPlnNbrString()).toCharArray());
      // cobolCode::GO TO 1000-EXIT
      return methodOut;
      // cobolCodeEnds::GO TO 1000-EXIT
    }
    //  cobolCode::IF ( POL-REQ-EFF-DT = SPACES OR LOW-VALUES OR HIGH-VALUES OR ZEROS)
    if (((allSpaces(methodOut.getPolReqEffDt()))
        || (checkLowValue(methodOut.getPolReqEffDt()))
        || (isHighValue(methodOut.getPolReqEffDt()))
        || (allZeros(methodOut.getPolReqEffDt())) /*  ==  zeros*/)) {
      //  cobolCode::SET DSM-EDIT-ERROR TO TRUE
      methodOut.setDsmEditErrorTrue();

      //  cobolCode::MOVE 'POL-REQ-EFF-DT' TO DSM-EDIT-ERROR-FIELD
      methodOut.setDsmEditErrorField(CONSTANTS.LITERAL_POL_MN3_REQEFFDT_B16_);
      //  cobolCode::MOVE POL-REQ-EFF-DT TO DSM-EDIT-ERROR-VALUE-TXT
      methodOut.getDsmEditErrorValueTxt().setString(methodOut.getPolReqEffDt());
      // cobolCode::GO TO 1000-EXIT
      return methodOut;
      // cobolCodeEnds::GO TO 1000-EXIT
    }
    //  cobolCode::IF ( POL-REQ-CANC-DT = SPACES OR LOW-VALUES OR HIGH-VALUES OR ZEROS)
    if (((allSpaces(methodOut.getPolReqCancDt()))
        || (checkLowValue(methodOut.getPolReqCancDt()))
        || (isHighValue(methodOut.getPolReqCancDt()))
        || (allZeros(methodOut.getPolReqCancDt())) /*  ==  zeros*/)) {
      //  cobolCode::SET DSM-EDIT-ERROR TO TRUE
      methodOut.setDsmEditErrorTrue();

      //  cobolCode::MOVE 'POL-REQ-CANC-DT' TO DSM-EDIT-ERROR-FIELD
      methodOut.setDsmEditErrorField(CONSTANTS.LITERAL_POL_MN3_REQCANCDT_B15_);
      //  cobolCode::MOVE POL-REQ-CANC-DT TO DSM-EDIT-ERROR-VALUE-TXT
      methodOut.getDsmEditErrorValueTxt().setString(methodOut.getPolReqCancDt());
      // cobolCode::GO TO 1000-EXIT
      return methodOut;
      // cobolCodeEnds::GO TO 1000-EXIT
    }

    // *=============================================================
    // * Dsm-func '14'
    // *  - retrieves latest mxi got policy/plsn
    // *  - populates eff/canc dates in request
    // *  - changes dsm-func to '04'
    // *  - process continues
    // *---------------------
    //  cobolCode::EVALUATE DSM-FUNC-CD
    switch (methodOut.getDsmFuncCd()) {
      case 14:
        //  cobolCode::PERFORM 1301-GET-STD-MXI-LATEST-SECT
        getStdMxiLatestSect(
            programCtx.getGetStdMxiLatestSectInCtx()); /*1301-GET-STD-MXI-LATEST-SECT SECTION*/
        break;
      default:;
    }

    return methodOut;
  }
  /**
   * populateReqData This method is derived from COBOL Paragraph - 1200-POPULATE-REQ-DATA SECTION
   * COBOL Cyclomatic complexity - 1 Input :
   *
   * <p>- polReqMxiPolNbr COBOL Name: POL-REQ-MXI-POL-NBR - polReqMxiPlnNbr COBOL Name:
   * POL-REQ-MXI-PLN-NBR - polReqMxiClssNbr COBOL Name: POL-REQ-MXI-CLSS-NBR - polReqEffDt COBOL
   * Name: POL-REQ-EFF-DT - polReqCancDt COBOL Name: POL-REQ-CANC-DT - polReqCovTypCd COBOL Name:
   * POL-REQ-COV-TYP-CD
   *
   * <p>Output :
   *
   * <p>- xrfPolNbr COBOL Name: XRF-POL-NBR - ppoPolNbr COBOL Name: PPO-POL-NBR - polReqMxiPolNbr
   * COBOL Name: POL-REQ-MXI-POL-NBR - xrfPlnNbr COBOL Name: XRF-PLN-NBR - ppoPlnNbr COBOL Name:
   * PPO-PLN-NBR - polReqMxiPlnNbr COBOL Name: POL-REQ-MXI-PLN-NBR - xrfClssNbr COBOL Name:
   * XRF-CLSS-NBR - ppoClssNbr COBOL Name: PPO-CLSS-NBR - polReqMxiClssNbr COBOL Name:
   * POL-REQ-MXI-CLSS-NBR - xrfEffDt COBOL Name: XRF-EFF-DT - polReqEffDt COBOL Name: POL-REQ-EFF-DT
   * - xrfCancDt COBOL Name: XRF-CANC-DT - polReqCancDt COBOL Name: POL-REQ-CANC-DT - xrfCovTypCd
   * COBOL Name: XRF-COV-TYP-CD - ppoCovTypCd COBOL Name: PPO-COV-TYP-CD - mmiCovTypCd COBOL Name:
   * MMI-COV-TYP-CD - dacmCovTypCd COBOL Name: DACM-COV-TYP-CD - dblvCovTypCd COBOL Name:
   * DBLV-COV-TYP-CD - dfdeCovTypCd COBOL Name: DFDE-COV-TYP-CD - dparCovTypCd COBOL Name:
   * DPAR-COV-TYP-CD - dideCovTypCd COBOL Name: DIDE-COV-TYP-CD - polReqCovTypCd COBOL Name:
   * POL-REQ-COV-TYP-CD
   *
   * @throws CFException
   */
  @Override
  public PopulateReqDataOutCtx populateReqData(PopulateReqDataInCtx methodIn) throws Exception {

    // *81***************************************************************
    // *81 1200-Populate-req-data                                       *
    // *81 business function:  populate the req data to dclgen fields   *
    // *81***************************************************************
    // *82***************************************************************
    // *82 1200-populate-req-data                                       *
    // *82 1. populate the req data to the dclgen fields                *
    // *82***************************************************************
    // Added variable to get the program context in place.
    D5427polCtx programCtx = methodIn.getD5427polCtx();
    // Added variable to get the output context in place.
    PopulateReqDataOutCtx methodOut = methodIn.getPopulateReqDataOutCtx();
    //  cobolCode::MOVE POL-REQ-MXI-POL-NBR TO XRF-POL-NBR PPO-POL-NBR
    methodOut.setXrfPolNbr(methodOut.getPolReqMxiPolNbr());
    methodOut.setPpoPolNbr(methodOut.getPolReqMxiPolNbr());
    //  cobolCode::MOVE POL-REQ-MXI-PLN-NBR TO XRF-PLN-NBR PPO-PLN-NBR
    methodOut.setXrfPlnNbr(String.valueOf(methodOut.getPolReqMxiPlnNbrString()).toCharArray());
    methodOut.setPpoPlnNbr(String.valueOf(methodOut.getPolReqMxiPlnNbrString()).toCharArray());
    //  cobolCode::MOVE POL-REQ-MXI-CLSS-NBR TO XRF-CLSS-NBR PPO-CLSS-NBR
    methodOut.setXrfClssNbr(String.valueOf(methodOut.getPolReqMxiClssNbrString()).toCharArray());
    methodOut.setPpoClssNbr(String.valueOf(methodOut.getPolReqMxiClssNbrString()).toCharArray());
    //  cobolCode::MOVE POL-REQ-EFF-DT TO XRF-EFF-DT
    methodOut.setXrfEffDt(methodOut.getPolReqEffDt());
    //  cobolCode::MOVE POL-REQ-CANC-DT TO XRF-CANC-DT
    methodOut.setXrfCancDt(methodOut.getPolReqCancDt());
    //  cobolCode::MOVE POL-REQ-COV-TYP-CD TO XRF-COV-TYP-CD PPO-COV-TYP-CD MMI-COV-TYP-CD
    // DACM-COV-TYP-CD DBLV-COV-TYP-CD DFDE-COV-TYP-CD DPAR-COV-TYP-CD DIDE-COV-TYP-CD
    methodOut.setXrfCovTypCd(methodOut.getPolReqCovTypCd());
    methodOut.setPpoCovTypCd(methodOut.getPolReqCovTypCd());
    methodOut.setMmiCovTypCd(methodOut.getPolReqCovTypCd());
    methodOut.setDacmCovTypCd(methodOut.getPolReqCovTypCd());
    methodOut.setDblvCovTypCd(methodOut.getPolReqCovTypCd());
    methodOut.setDfdeCovTypCd(methodOut.getPolReqCovTypCd());
    methodOut.setDparCovTypCd(methodOut.getPolReqCovTypCd());
    methodOut.setDideCovTypCd(methodOut.getPolReqCovTypCd());

    return methodOut;
  }
  /**
   * getStdMxiData This method is derived from COBOL Paragraph - 1300-GET-STD-MXI-DATA SECTION COBOL
   * Cyclomatic complexity - 5 Input :
   *
   * <p>- sqlcode COBOL Name: SQLCODE
   *
   * <p>Output :
   *
   * <p>- sqlcode_Ws COBOL Name: WS-SQLCODE - dsmSqlcode COBOL Name: DSM-SQLCODE - sqlcode COBOL
   * Name: SQLCODE - dsmReturnCode COBOL Name: DSM-RETURN-CODE - dsmErrTblAction COBOL Name:
   * DSM-ERR-TBL-ACTION - dsmErrTblName COBOL Name: DSM-ERR-TBL-NAME - dsmErrSectnName COBOL Name:
   * DSM-ERR-SECTN-NAME - dsmErrPgmName COBOL Name: DSM-ERR-PGM-NAME
   *
   * @throws CFException
   */
  @Override
  public GetStdMxiDataOutCtx getStdMxiData(GetStdMxiDataInCtx methodIn) throws Exception {

    // *81***************************************************************
    // *81 1300-Get-std-mxi-data                                        *
    // *81 business function:  fetch standard policy,plan and class from*
    // *81                     mxi table cust_pol_pln_xref              *
    // *81***************************************************************
    // *82***************************************************************
    // *82 1300-get-std-mxi-data                                        *
    // *82 1. fetch the standard key fields from mxi to query mmi table *
    // *82***************************************************************
    // Added variable to get the program context in place.
    D5427polCtx programCtx = methodIn.getD5427polCtx();
    // Added variable to get the output context in place.
    GetStdMxiDataOutCtx methodOut = methodIn.getGetStdMxiDataOutCtx();
    //  cobolCode::PERFORM 1200-POPULATE-REQ-DATA
    populateReqData(programCtx.getPopulateReqDataInCtx()); /*1200-POPULATE-REQ-DATA SECTION*/
    if (programCtx.isProgramEnded()) {
      return methodOut;
    }
    //  cobolCode::SELECT STD_PLN_POL_NBR , STD_PLN_PLN_NBR , STD_PLN_CLSS_NBR , MML_COV_SET_NBR
    // FROM CUST_POL_PLN_XREF WHERE COV_TYP_CD = ? AND POL_NBR = ? AND PLN_NBR = ? AND CLSS_NBR = ?
    // AND ( ( EFF_DT <= ? AND CANC_DT >= ? ) OR ( EFF_DT <= ? AND CANC_DT >= ? ) ) ORDER BY EFF_DT
    // ASC FETCH FIRST 1 ROWS ONLY
    d5427polRepository.selectCustPolPlnXref(
        programCtx.getSqlca(), methodOut.getDclcustPolPlnXref());
    //  cobolCode::MOVE SQLCODE TO WS-SQLCODE DSM-SQLCODE
    methodOut.setSqlcode_Ws(methodOut.getSqlcode());
    methodOut.setDsmSqlcode(methodOut.getSqlcode());
    //  cobolCode::EVALUATE TRUE
    if ((methodOut.isSqlcodeOk()) || (methodOut.isSqlcodeNotFound())) {
      //  cobolCode::PERFORM 1310-POPULATE-POL-PLN-CLSS
      populatePolPlnClss(
          programCtx.getPopulatePolPlnClssInCtx()); /*1310-POPULATE-POL-PLN-CLSS SECTION*/
      if (programCtx.isProgramEnded()) {
        return methodOut;
      }
    } else {
      //  cobolCode::SET DSM-DB2-ERROR TO TRUE
      methodOut.setDsmDb2ErrorTrue();

      //  cobolCode::MOVE 'SELECT' TO DSM-ERR-TBL-ACTION
      methodOut.setDsmErrTblAction(CONSTANTS.LITERAL_SELECT_B4_);
      //  cobolCode::MOVE 'CUST_POL_PLN_XREF' TO DSM-ERR-TBL-NAME
      methodOut.setDsmErrTblName(CONSTANTS.LITERAL_CUST_POL_PLN_XREF_B8_);
      //  cobolCode::MOVE '1300-GET-STD-MXI-DATA' TO DSM-ERR-SECTN-NAME
      methodOut.setDsmErrSectnName(CONSTANTS.LITERAL_2119532411);
      //  cobolCode::MOVE 'D5427POL' TO DSM-ERR-PGM-NAME
      //  LITERAL_D5427POL = 'D5427POL'
      methodOut.setDsmErrPgmName(CONSTANTS.LITERAL_D5427POL);
      //  cobolCode::PERFORM 7777-MOVES-FOR-ERROR-LOG
      movesForErrorLog(programCtx.getMovesForErrorLogInCtx()); /*7777-MOVES-FOR-ERROR-LOG SECTION*/
      if (programCtx.isProgramEnded()) {
        return methodOut;
      }
    }

    return methodOut;
  }
  /**
   * getStdMxiLatestSect This method is derived from COBOL Paragraph - 1301-GET-STD-MXI-LATEST-SECT
   * SECTION COBOL Cyclomatic complexity - 4 Input :
   *
   * <p>- polReqCovTypCd COBOL Name: POL-REQ-COV-TYP-CD - polReqMxiPolNbr COBOL Name:
   * POL-REQ-MXI-POL-NBR - polReqMxiPlnNbr COBOL Name: POL-REQ-MXI-PLN-NBR - polReqMxiClssNbr COBOL
   * Name: POL-REQ-MXI-CLSS-NBR - sqlcode COBOL Name: SQLCODE - xrfEffDt COBOL Name: XRF-EFF-DT -
   * xrfCancDt COBOL Name: XRF-CANC-DT
   *
   * <p>Output :
   *
   * <p>- xrfCovTypCd COBOL Name: XRF-COV-TYP-CD - polReqCovTypCd COBOL Name: POL-REQ-COV-TYP-CD -
   * xrfPolNbr COBOL Name: XRF-POL-NBR - polReqMxiPolNbr COBOL Name: POL-REQ-MXI-POL-NBR - xrfPlnNbr
   * COBOL Name: XRF-PLN-NBR - polReqMxiPlnNbr COBOL Name: POL-REQ-MXI-PLN-NBR - xrfClssNbr COBOL
   * Name: XRF-CLSS-NBR - polReqMxiClssNbr COBOL Name: POL-REQ-MXI-CLSS-NBR - sqlcode_Ws COBOL Name:
   * WS-SQLCODE - dsmSqlcode COBOL Name: DSM-SQLCODE - sqlcode COBOL Name: SQLCODE - polReqEffDt
   * COBOL Name: POL-REQ-EFF-DT - xrfEffDt COBOL Name: XRF-EFF-DT - polReqCancDt COBOL Name:
   * POL-REQ-CANC-DT - xrfCancDt COBOL Name: XRF-CANC-DT - dsmFuncCd COBOL Name: DSM-FUNC-CD
   *
   * @throws CFException
   */
  @Override
  public GetStdMxiLatestSectOutCtx getStdMxiLatestSect(GetStdMxiLatestSectInCtx methodIn)
      throws Exception {

    // *81***************************************************************
    // *81 1301-Get-std-mxi-latest-sect                                 *
    // *81 business function:  fetch latest eff/canc dates              *
    // *81                     for pol/pln/cls from cust_pol_pln_xref   *
    // *81***************************************************************
    // *82***************************************************************
    // *82 1301-get-std-mxi-latest-sect                                 *
    // *82 1. fetch the eff/canc dates from mxi                         *
    // *82 2. populate policy date range in request area                *
    // *82 3. change dsm-func to '4'                                    *
    // *82***************************************************************
    // Added variable to get the program context in place.
    D5427polCtx programCtx = methodIn.getD5427polCtx();
    // Added variable to get the output context in place.
    GetStdMxiLatestSectOutCtx methodOut = methodIn.getGetStdMxiLatestSectOutCtx();
    //  cobolCode::MOVE POL-REQ-COV-TYP-CD TO XRF-COV-TYP-CD
    methodOut.setXrfCovTypCd(methodOut.getPolReqCovTypCd());
    //  cobolCode::MOVE POL-REQ-MXI-POL-NBR TO XRF-POL-NBR
    methodOut.setXrfPolNbr(methodOut.getPolReqMxiPolNbr());
    //  cobolCode::MOVE POL-REQ-MXI-PLN-NBR TO XRF-PLN-NBR
    methodOut.setXrfPlnNbr(String.valueOf(methodOut.getPolReqMxiPlnNbrString()).toCharArray());
    //  cobolCode::MOVE POL-REQ-MXI-CLSS-NBR TO XRF-CLSS-NBR
    methodOut.setXrfClssNbr(String.valueOf(methodOut.getPolReqMxiClssNbrString()).toCharArray());
    //  cobolCode::SELECT EFF_DT , CANC_DT FROM CUST_POL_PLN_XREF WHERE COV_TYP_CD = ? AND POL_NBR =
    // ? AND PLN_NBR = ? AND CLSS_NBR = ? AND EFF_DT <= DATE ( CURRENT TIMESTAMP ) ORDER BY EFF_DT
    // DESC FETCH FIRST 1 ROWS ONLY
    d5427polRepository.selectCustPolPlnXref1(
        programCtx.getSqlca(), methodOut.getDclcustPolPlnXref());
    //  cobolCode::MOVE SQLCODE TO WS-SQLCODE DSM-SQLCODE
    methodOut.setSqlcode_Ws(methodOut.getSqlcode());
    methodOut.setDsmSqlcode(methodOut.getSqlcode());
    //  cobolCode::EVALUATE TRUE
    if (methodOut.isSqlcodeOk()) {
      //  cobolCode::MOVE XRF-EFF-DT TO POL-REQ-EFF-DT
      methodOut.setPolReqEffDt(methodOut.getXrfEffDt());
      //  cobolCode::MOVE XRF-CANC-DT TO POL-REQ-CANC-DT
      methodOut.setPolReqCancDt(methodOut.getXrfCancDt());
    } else {;
    }
    methodOut.setDsmFuncCd(4);

    return methodOut;
  }
  /**
   * populatePolPlnClss This method is derived from COBOL Paragraph - 1310-POPULATE-POL-PLN-CLSS
   * SECTION COBOL Cyclomatic complexity - 3 Input :
   *
   * <p>- sqlcode_Ws COBOL Name: WS-SQLCODE - xrfStdPlnPolNbr COBOL Name: XRF-STD-PLN-POL-NBR -
   * xrfStdPlnPlnNbr COBOL Name: XRF-STD-PLN-PLN-NBR - xrfStdPlnClssNbr COBOL Name:
   * XRF-STD-PLN-CLSS-NBR - xrfMmlCovSetNbr COBOL Name: XRF-MML-COV-SET-NBR - xrfPolNbr COBOL Name:
   * XRF-POL-NBR - xrfPlnNbr COBOL Name: XRF-PLN-NBR - xrfClssNbr COBOL Name: XRF-CLSS-NBR
   *
   * <p>Output :
   *
   * <p>- mmiPolNbr COBOL Name: MMI-POL-NBR - dblvPolNbr COBOL Name: DBLV-POL-NBR - dfdePolNbr COBOL
   * Name: DFDE-POL-NBR - dparPolNbr COBOL Name: DPAR-POL-NBR - didePolNbr COBOL Name: DIDE-POL-NBR
   * - dacmPolNbr COBOL Name: DACM-POL-NBR - xrfStdPlnPolNbr COBOL Name: XRF-STD-PLN-POL-NBR -
   * mmiPlnNbr COBOL Name: MMI-PLN-NBR - dblvPlnNbr COBOL Name: DBLV-PLN-NBR - dfdePlnNbr COBOL
   * Name: DFDE-PLN-NBR - dparPlnNbr COBOL Name: DPAR-PLN-NBR - didePlnNbr COBOL Name: DIDE-PLN-NBR
   * - dacmPlnNbr COBOL Name: DACM-PLN-NBR - xrfStdPlnPlnNbr COBOL Name: XRF-STD-PLN-PLN-NBR -
   * mmiClssNbr COBOL Name: MMI-CLSS-NBR - dblvClssNbr COBOL Name: DBLV-CLSS-NBR - dfdeClssNbr COBOL
   * Name: DFDE-CLSS-NBR - dparClssNbr COBOL Name: DPAR-CLSS-NBR - dideClssNbr COBOL Name:
   * DIDE-CLSS-NBR - dacmClssNbr COBOL Name: DACM-CLSS-NBR - xrfStdPlnClssNbr COBOL Name:
   * XRF-STD-PLN-CLSS-NBR - pol4MmlCovSetNbr COBOL Name: POL4-MML-COV-SET-NBR - xrfMmlCovSetNbr
   * COBOL Name: XRF-MML-COV-SET-NBR - xrfPolNbr COBOL Name: XRF-POL-NBR - xrfPlnNbr COBOL Name:
   * XRF-PLN-NBR - xrfClssNbr COBOL Name: XRF-CLSS-NBR
   *
   * @throws CFException
   */
  @Override
  public PopulatePolPlnClssOutCtx populatePolPlnClss(PopulatePolPlnClssInCtx methodIn)
      throws Exception {

    // *81***************************************************************
    // *81 1310-Populate-pol-pln-clss                                   *
    // *81 business function:                                           *
    // *81 populate the return area                                     *
    // *81***************************************************************
    // *82***************************************************************
    // *82 1310-populate-pol-pln-clss                                   *
    // *82 populate the return area                                     *
    // *82***************************************************************
    // Added variable to get the program context in place.
    D5427polCtx programCtx = methodIn.getD5427polCtx();
    // Added variable to get the output context in place.
    PopulatePolPlnClssOutCtx methodOut = methodIn.getPopulatePolPlnClssOutCtx();
    //  cobolCode::IF WS-SQLCODE-OK
    if (methodIn.isSqlcodeOk()) {
      //  cobolCode::MOVE XRF-STD-PLN-POL-NBR TO MMI-POL-NBR DBLV-POL-NBR DFDE-POL-NBR DPAR-POL-NBR
      // DIDE-POL-NBR DACM-POL-NBR
      methodOut.setMmiPolNbr(methodOut.getXrfStdPlnPolNbr());
      methodOut.setDblvPolNbr(methodOut.getXrfStdPlnPolNbr());
      methodOut.setDfdePolNbr(methodOut.getXrfStdPlnPolNbr());
      methodOut.setDparPolNbr(methodOut.getXrfStdPlnPolNbr());
      methodOut.setDidePolNbr(methodOut.getXrfStdPlnPolNbr());
      methodOut.setDacmPolNbr(methodOut.getXrfStdPlnPolNbr());
      //  cobolCode::MOVE XRF-STD-PLN-PLN-NBR TO MMI-PLN-NBR DBLV-PLN-NBR DFDE-PLN-NBR DPAR-PLN-NBR
      // DIDE-PLN-NBR DACM-PLN-NBR
      methodOut.setMmiPlnNbr(methodOut.getXrfStdPlnPlnNbr());
      methodOut.setDblvPlnNbr(methodOut.getXrfStdPlnPlnNbr());
      methodOut.setDfdePlnNbr(methodOut.getXrfStdPlnPlnNbr());
      methodOut.setDparPlnNbr(methodOut.getXrfStdPlnPlnNbr());
      methodOut.setDidePlnNbr(methodOut.getXrfStdPlnPlnNbr());
      methodOut.setDacmPlnNbr(methodOut.getXrfStdPlnPlnNbr());
      //  cobolCode::MOVE XRF-STD-PLN-CLSS-NBR TO MMI-CLSS-NBR DBLV-CLSS-NBR DFDE-CLSS-NBR
      // DPAR-CLSS-NBR DIDE-CLSS-NBR DACM-CLSS-NBR
      methodOut.setMmiClssNbr(methodOut.getXrfStdPlnClssNbr());
      methodOut.setDblvClssNbr(methodOut.getXrfStdPlnClssNbr());
      methodOut.setDfdeClssNbr(methodOut.getXrfStdPlnClssNbr());
      methodOut.setDparClssNbr(methodOut.getXrfStdPlnClssNbr());
      methodOut.setDideClssNbr(methodOut.getXrfStdPlnClssNbr());
      methodOut.setDacmClssNbr(methodOut.getXrfStdPlnClssNbr());
      //  cobolCode::MOVE XRF-MML-COV-SET-NBR TO POL4-MML-COV-SET-NBR
      methodOut.setPol4MmlCovSetNbr(methodOut.getXrfMmlCovSetNbr());
    }
    //  cobolCode::ELSE
    else {
      //  cobolCode::IF WS-SQLCODE-NOT-FOUND
      if (methodIn.isSqlcodeNotFound()) {
        //  cobolCode::MOVE XRF-POL-NBR TO MMI-POL-NBR DBLV-POL-NBR DFDE-POL-NBR DPAR-POL-NBR
        // DIDE-POL-NBR DACM-POL-NBR
        methodOut.setMmiPolNbr(methodOut.getXrfPolNbr());
        methodOut.setDblvPolNbr(methodOut.getXrfPolNbr());
        methodOut.setDfdePolNbr(methodOut.getXrfPolNbr());
        methodOut.setDparPolNbr(methodOut.getXrfPolNbr());
        methodOut.setDidePolNbr(methodOut.getXrfPolNbr());
        methodOut.setDacmPolNbr(methodOut.getXrfPolNbr());
        //  cobolCode::MOVE XRF-PLN-NBR TO MMI-PLN-NBR DBLV-PLN-NBR DFDE-PLN-NBR DPAR-PLN-NBR
        // DIDE-PLN-NBR DACM-PLN-NBR
        methodOut.setMmiPlnNbr(methodOut.getXrfPlnNbr());
        methodOut.setDblvPlnNbr(methodOut.getXrfPlnNbr());
        methodOut.setDfdePlnNbr(methodOut.getXrfPlnNbr());
        methodOut.setDparPlnNbr(methodOut.getXrfPlnNbr());
        methodOut.setDidePlnNbr(methodOut.getXrfPlnNbr());
        methodOut.setDacmPlnNbr(methodOut.getXrfPlnNbr());
        //  cobolCode::MOVE XRF-CLSS-NBR TO MMI-CLSS-NBR DBLV-CLSS-NBR DFDE-CLSS-NBR DPAR-CLSS-NBR
        // DIDE-CLSS-NBR DACM-CLSS-NBR
        methodOut.setMmiClssNbr(methodOut.getXrfClssNbr());
        methodOut.setDblvClssNbr(methodOut.getXrfClssNbr());
        methodOut.setDfdeClssNbr(methodOut.getXrfClssNbr());
        methodOut.setDparClssNbr(methodOut.getXrfClssNbr());
        methodOut.setDideClssNbr(methodOut.getXrfClssNbr());
        methodOut.setDacmClssNbr(methodOut.getXrfClssNbr());
      }
    }

    return methodOut;
  }
  /**
   * funcCd1PolplnMxiRead This method is derived from COBOL Paragraph -
   * 2000-FUNC-CD1-POLPLN-MXI-READ SECTION COBOL Cyclomatic complexity - 3 Input :
   *
   * <p>- sqlcode_Ws COBOL Name: WS-SQLCODE
   *
   * <p>Output : None
   *
   * @throws CFException
   */
  @Override
  public FuncCd1PolplnMxiReadOutCtx funcCd1PolplnMxiRead(FuncCd1PolplnMxiReadInCtx methodIn)
      throws Exception {

    // *81***************************************************************
    // *81 2000-Func-cd1-polpln-mxi-read                                *
    // *81                                                              *
    // *81 business function:populate the return parameterts by the ret-*
    // *81 rived records from the table                                 *
    // *81***************************************************************
    // *82***************************************************************
    // *82 2000-func-cd1-polpln-mxi-read                                *
    // *82 1.read the table cust_pol_pln_xref and populate the fields   *
    // *82   of pol_pln_mstr table                                      *
    // *82***************************************************************
    // Added variable to get the program context in place.
    D5427polCtx programCtx = methodIn.getD5427polCtx();
    // Added variable to get the output context in place.
    FuncCd1PolplnMxiReadOutCtx methodOut = methodIn.getFuncCd1PolplnMxiReadOutCtx();
    //  cobolCode::PERFORM 2010-OPEN-CURSOR
    openCursor(programCtx.getOpenCursorInCtx()); /*2010-OPEN-CURSOR SECTION*/
    if (programCtx.isProgramEnded()) {
      return methodOut;
    }
    //  cobolCode::IF WS-SQLCODE-OK
    if (methodIn.isSqlcodeOk()) {
      //  cobolCode::PERFORM 2020-FETCH-CURSOR
      fetchCursor(programCtx.getFetchCursorInCtx()); /*2020-FETCH-CURSOR SECTION*/
      if (programCtx.isProgramEnded()) {
        return methodOut;
      }
    }
    //  cobolCode::IF WS-SQLCODE-NOT-FOUND
    if (methodIn.isSqlcodeNotFound()) {
      //  cobolCode::PERFORM 2030-CLOSE-CURSOR
      closeCursor(programCtx.getCloseCursorInCtx()); /*2030-CLOSE-CURSOR SECTION*/
      if (programCtx.isProgramEnded()) {
        return methodOut;
      }
    }
    //  cobolCode::PERFORM 2040-GET-MMI-RECORD
    getMmiRecord(programCtx.getGetMmiRecordInCtx()); /*2040-GET-MMI-RECORD SECTION*/
    if (programCtx.isProgramEnded()) {
      return methodOut;
    }

    return methodOut;
  }
  /**
   * openCursor This method is derived from COBOL Paragraph - 2010-OPEN-CURSOR SECTION COBOL
   * Cyclomatic complexity - 4 Input :
   *
   * <p>- sqlcode COBOL Name: SQLCODE
   *
   * <p>Output :
   *
   * <p>- sqlcode_Ws COBOL Name: WS-SQLCODE - dsmSqlcode COBOL Name: DSM-SQLCODE - sqlcode COBOL
   * Name: SQLCODE - dsmReturnCode COBOL Name: DSM-RETURN-CODE - dsmErrTblAction COBOL Name:
   * DSM-ERR-TBL-ACTION - dsmErrTblName COBOL Name: DSM-ERR-TBL-NAME - dsmErrSectnName COBOL Name:
   * DSM-ERR-SECTN-NAME - dsmErrPgmName COBOL Name: DSM-ERR-PGM-NAME
   *
   * @throws CFException
   */
  @Override
  public OpenCursorOutCtx openCursor(OpenCursorInCtx methodIn) throws Exception {

    // *81***************************************************************
    // *81 2010-Open-cursor                                             *
    // *81 business function: open the cursor                           *
    // *81***************************************************************
    // *82***************************************************************
    // *82 2010-open-cursor                                             *
    // *82 1. open  the cursor cur-mxi-csr                              *
    // *82***************************************************************
    // Added variable to get the program context in place.
    D5427polCtx programCtx = methodIn.getD5427polCtx();
    // Added variable to get the output context in place.
    OpenCursorOutCtx methodOut = methodIn.getOpenCursorOutCtx();
    //  cobolCode::PERFORM 1200-POPULATE-REQ-DATA
    populateReqData(programCtx.getPopulateReqDataInCtx()); /*1200-POPULATE-REQ-DATA SECTION*/
    if (programCtx.isProgramEnded()) {
      return methodOut;
    }
    //  cobolCode::SELECT STD_PLN_POL_NBR , STD_PLN_PLN_NBR , STD_PLN_CLSS_NBR , EFF_DT , CANC_DT
    // FROM CUST_POL_PLN_XREF WHERE COV_TYP_CD = ? AND POL_NBR = ? AND PLN_NBR = ? AND CLSS_NBR = ?
    // AND ( ( EFF_DT <= ? AND CANC_DT >= ? ) OR ( EFF_DT <= ? AND CANC_DT >= ? ) ) ORDER BY EFF_DT
    // ASC FETCH FIRST 2 ROWS ONLY
    programCtx.setCurMxiCsrResultSet(
        d5427polRepository.openCurMxiCsrD5427pol(
            programCtx.getSqlca(), methodIn.getDclcustPolPlnXref()));
    //  cobolCode::MOVE SQLCODE TO WS-SQLCODE DSM-SQLCODE
    methodOut.setSqlcode_Ws(methodOut.getSqlcode());
    methodOut.setDsmSqlcode(methodOut.getSqlcode());
    //  cobolCode::EVALUATE TRUE
    if (methodOut.isSqlcodeOk()) {;
    } else {
      //  cobolCode::SET DSM-DB2-ERROR TO TRUE
      methodOut.setDsmDb2ErrorTrue();

      //  cobolCode::MOVE 'OPEN' TO DSM-ERR-TBL-ACTION
      methodOut.setDsmErrTblAction(CONSTANTS.LITERAL_OPEN_B6_);
      //  cobolCode::MOVE 'CUST_POL_PLN_XREF' TO DSM-ERR-TBL-NAME
      methodOut.setDsmErrTblName(CONSTANTS.LITERAL_CUST_POL_PLN_XREF_B8_);
      //  cobolCode::MOVE '2010-OPEN-CURSOR' TO DSM-ERR-SECTN-NAME
      methodOut.setDsmErrSectnName(CONSTANTS.LITERAL_558492375);
      //  cobolCode::MOVE 'D5427POL' TO DSM-ERR-PGM-NAME
      //  LITERAL_D5427POL = 'D5427POL'
      methodOut.setDsmErrPgmName(CONSTANTS.LITERAL_D5427POL);
      //  cobolCode::PERFORM 7777-MOVES-FOR-ERROR-LOG
      movesForErrorLog(programCtx.getMovesForErrorLogInCtx()); /*7777-MOVES-FOR-ERROR-LOG SECTION*/
      if (programCtx.isProgramEnded()) {
        return methodOut;
      }
    }

    return methodOut;
  }
  /**
   * fetchCursor This method is derived from COBOL Paragraph - 2020-FETCH-CURSOR SECTION COBOL
   * Cyclomatic complexity - 9 Input :
   *
   * <p>- sqlcode_Ws COBOL Name: WS-SQLCODE - sqlcode COBOL Name: SQLCODE - covEndDt COBOL Name:
   * WS-COV-END-DT
   *
   * <p>Output :
   *
   * <p>- mxiFirstTime COBOL Name: WS-MXI-FIRST-TIME - lineSub COBOL Name: WS-LINE-SUB - sqlcode_Ws
   * COBOL Name: WS-SQLCODE - dsmSqlcode COBOL Name: DSM-SQLCODE - sqlcode COBOL Name: SQLCODE -
   * pol1RetCovEndDate COBOL Name: POL1-RET-COV-END-DATE - covEndDt COBOL Name: WS-COV-END-DT -
   * dsmReturnCode COBOL Name: DSM-RETURN-CODE - dsmErrTblAction COBOL Name: DSM-ERR-TBL-ACTION -
   * dsmErrTblName COBOL Name: DSM-ERR-TBL-NAME - dsmErrSectnName COBOL Name: DSM-ERR-SECTN-NAME -
   * dsmErrPgmName COBOL Name: DSM-ERR-PGM-NAME
   *
   * @throws CFException
   */
  @Override
  public FetchCursorOutCtx fetchCursor(FetchCursorInCtx methodIn) throws Exception {

    // *81***************************************************************
    // *81 2020-Fetch-cursor                                            *
    // *81 business function: fetches the record                        *
    // *81***************************************************************
    // *82***************************************************************
    // *82 2020-fetch-cursor cur-mxi-csr                                *
    // *82 1. fetch the records using cursor cur-mxi-csr                *
    // *82***************************************************************
    // Added variable to get the program context in place.
    D5427polCtx programCtx = methodIn.getD5427polCtx();
    // Added variable to get the output context in place.
    FetchCursorOutCtx methodOut = methodIn.getFetchCursorOutCtx();
    //  LITERAL_Y = 'Y'
    methodOut.setMxiFirstTime(CONSTANTS.LITERAL_Y);
    //  cobolCode::PERFORM VARYING WS-LINE-SUB FROM +1 BY +1 UNTIL WS-SQLCODE-NOT-FOUND
    for (methodOut.setLineSub(1);
        (!(methodIn.isSqlcodeNotFound()));
        methodOut.setLineSub(methodOut.getLineSub() + 1)) {
      //  cobolCode::FETCH CUR-MXI-CSR INTO ? , ? , ? , ? , ?
      d5427polRepository.fetchCurMxiCsrD5427pol(
          programCtx.getCurMxiCsrResultSet(),
          programCtx.getSqlca(),
          methodOut.getDclcustPolPlnXref());
      //  cobolCode::MOVE SQLCODE TO WS-SQLCODE DSM-SQLCODE
      methodOut.setSqlcode_Ws(methodOut.getSqlcode());
      methodOut.setDsmSqlcode(methodOut.getSqlcode());
      //  cobolCode::EVALUATE TRUE
      if (methodOut.isSqlcodeOk()) {
        //  cobolCode::SET MXI-FIRST-TIME-NO TO TRUE
        methodOut.setMxiFirstTimeNoTrue();

        //  cobolCode::PERFORM 2050-POPULATE-STD-POL-PLN-CLS
        populateStdPolPlnCls(
            programCtx.getPopulateStdPolPlnClsInCtx()); /*2050-POPULATE-STD-POL-PLN-CLS SECTION*/
        if (programCtx.isProgramEnded()) {
          return methodOut;
        }
      } else if (methodIn.isSqlcodeNotFound()) {
        //  cobolCode::IF MXI-FIRST-TIME-YES
        if (methodOut.isMxiFirstTimeYes()) {
          //  cobolCode::PERFORM 2050-POPULATE-STD-POL-PLN-CLS
          populateStdPolPlnCls(
              programCtx.getPopulateStdPolPlnClsInCtx()); /*2050-POPULATE-STD-POL-PLN-CLS SECTION*/
          if (programCtx.isProgramEnded()) {
            return methodOut;
          }
        }
        //  cobolCode::ELSE
        else {
          //  cobolCode::IF WS-LINE-SUB > 2
          if ((methodOut.getLineSub() > 2)) {
            //  cobolCode::MOVE WS-COV-END-DT (1) TO POL1-RET-COV-END-DATE
            methodOut.setPol1RetCovEndDate(methodOut.getCovEndDt(0));
          }
        }
      } else {
        //  cobolCode::SET DSM-DB2-ERROR TO TRUE
        methodOut.setDsmDb2ErrorTrue();

        //  cobolCode::MOVE 'FETCH' TO DSM-ERR-TBL-ACTION
        methodOut.setDsmErrTblAction(CONSTANTS.LITERAL_FETCH_B5_);
        //  cobolCode::MOVE 'CUST_POL_PLN_XREF' TO DSM-ERR-TBL-NAME
        methodOut.setDsmErrTblName(CONSTANTS.LITERAL_CUST_POL_PLN_XREF_B8_);
        //  cobolCode::MOVE '2020-FETCH-CURSOR' TO DSM-ERR-SECTN-NAME
        methodOut.setDsmErrSectnName(CONSTANTS.LITERAL_1797121734);
        //  cobolCode::MOVE 'D5427POL' TO DSM-ERR-PGM-NAME
        //  LITERAL_D5427POL = 'D5427POL'
        methodOut.setDsmErrPgmName(CONSTANTS.LITERAL_D5427POL);
        //  cobolCode::PERFORM 7777-MOVES-FOR-ERROR-LOG
        movesForErrorLog(
            programCtx.getMovesForErrorLogInCtx()); /*7777-MOVES-FOR-ERROR-LOG SECTION*/
        if (programCtx.isProgramEnded()) {
          return methodOut;
        }
      }
    }

    return methodOut;
  }
  /**
   * closeCursor This method is derived from COBOL Paragraph - 2030-CLOSE-CURSOR SECTION COBOL
   * Cyclomatic complexity - 4 Input :
   *
   * <p>- sqlcode COBOL Name: SQLCODE
   *
   * <p>Output :
   *
   * <p>- sqlcode_Ws COBOL Name: WS-SQLCODE - dsmSqlcode COBOL Name: DSM-SQLCODE - sqlcode COBOL
   * Name: SQLCODE - dsmReturnCode COBOL Name: DSM-RETURN-CODE - dsmErrTblAction COBOL Name:
   * DSM-ERR-TBL-ACTION - dsmErrTblName COBOL Name: DSM-ERR-TBL-NAME - dsmErrSectnName COBOL Name:
   * DSM-ERR-SECTN-NAME - dsmErrPgmName COBOL Name: DSM-ERR-PGM-NAME
   *
   * @throws CFException
   */
  @Override
  public CloseCursorOutCtx closeCursor(CloseCursorInCtx methodIn) throws Exception {

    // *81***************************************************************
    // *81 2030-Close-cursor                                            *
    // *81 business function: close the cursor                          *
    // *81***************************************************************
    // *82***************************************************************
    // *82 2030-close-cursor                                            *
    // *82 1. close the cursor cur-mxi-csr                              *
    // *82***************************************************************
    // Added variable to get the program context in place.
    D5427polCtx programCtx = methodIn.getD5427polCtx();
    // Added variable to get the output context in place.
    CloseCursorOutCtx methodOut = methodIn.getCloseCursorOutCtx();
    //  cobolCode::CLOSE CUR-MXI-CSR
    d5427polRepository.closeCurMxiCsrD5427pol(
        programCtx.getCurMxiCsrResultSet(), programCtx.getSqlca());
    //  cobolCode::MOVE SQLCODE TO WS-SQLCODE DSM-SQLCODE
    methodOut.setSqlcode_Ws(methodOut.getSqlcode());
    methodOut.setDsmSqlcode(methodOut.getSqlcode());
    //  cobolCode::EVALUATE TRUE
    if (methodOut.isSqlcodeOk()) {;
    } else {
      //  cobolCode::SET DSM-DB2-ERROR TO TRUE
      methodOut.setDsmDb2ErrorTrue();

      //  cobolCode::MOVE 'CLOSE' TO DSM-ERR-TBL-ACTION
      methodOut.setDsmErrTblAction(CONSTANTS.LITERAL_CLOSE_B5_);
      //  cobolCode::MOVE 'CUST_POL_PLN_XREF' TO DSM-ERR-TBL-NAME
      methodOut.setDsmErrTblName(CONSTANTS.LITERAL_CUST_POL_PLN_XREF_B8_);
      //  cobolCode::MOVE '2030-CLOSE-CURSOR' TO DSM-ERR-SECTN-NAME
      methodOut.setDsmErrSectnName(CONSTANTS.LITERAL_223543229);
      //  cobolCode::MOVE 'D5427POL' TO DSM-ERR-PGM-NAME
      //  LITERAL_D5427POL = 'D5427POL'
      methodOut.setDsmErrPgmName(CONSTANTS.LITERAL_D5427POL);
      //  cobolCode::PERFORM 7777-MOVES-FOR-ERROR-LOG
      movesForErrorLog(programCtx.getMovesForErrorLogInCtx()); /*7777-MOVES-FOR-ERROR-LOG SECTION*/
      if (programCtx.isProgramEnded()) {
        return methodOut;
      }
    }

    return methodOut;
  }
  /**
   * getMmiRecord This method is derived from COBOL Paragraph - 2040-GET-MMI-RECORD SECTION COBOL
   * Cyclomatic complexity - 5 Input :
   *
   * <p>- stdPolNbr COBOL Name: WS-STD-POL-NBR - stdPlnNbr COBOL Name: WS-STD-PLN-NBR - stdClssNbr
   * COBOL Name: WS-STD-CLSS-NBR - polReqCovTypCd COBOL Name: POL-REQ-COV-TYP-CD - sqlcode COBOL
   * Name: SQLCODE - mmiEffDt COBOL Name: MMI-EFF-DT - mmiPolTypCd COBOL Name: MMI-POL-TYP-CD -
   * mmiVarPrdFct COBOL Name: MMI-VAR-PRD-FCT
   *
   * <p>Output :
   *
   * <p>- mmiPolNbr COBOL Name: MMI-POL-NBR - stdPolNbr COBOL Name: WS-STD-POL-NBR - mmiPlnNbr COBOL
   * Name: MMI-PLN-NBR - stdPlnNbr COBOL Name: WS-STD-PLN-NBR - mmiClssNbr COBOL Name: MMI-CLSS-NBR
   * - stdClssNbr COBOL Name: WS-STD-CLSS-NBR - mmiCovTypCd COBOL Name: MMI-COV-TYP-CD -
   * polReqCovTypCd COBOL Name: POL-REQ-COV-TYP-CD - sqlcode_Ws COBOL Name: WS-SQLCODE - dsmSqlcode
   * COBOL Name: DSM-SQLCODE - sqlcode COBOL Name: SQLCODE - pol1RetPolEffDate COBOL Name:
   * POL1-RET-POL-EFF-DATE - mmiEffDt COBOL Name: MMI-EFF-DT - pol1RetPolicyType COBOL Name:
   * POL1-RET-POLICY-TYPE - mmiPolTypCd COBOL Name: MMI-POL-TYP-CD - pol1RetVarPer COBOL Name:
   * POL1-RET-VAR-PER - mmiVarPrdFct COBOL Name: MMI-VAR-PRD-FCT - dsmReturnCode COBOL Name:
   * DSM-RETURN-CODE - dsmErrTblAction COBOL Name: DSM-ERR-TBL-ACTION - dsmErrTblName COBOL Name:
   * DSM-ERR-TBL-NAME - dsmErrSectnName COBOL Name: DSM-ERR-SECTN-NAME - dsmErrPgmName COBOL Name:
   * DSM-ERR-PGM-NAME
   *
   * @throws CFException
   */
  @Override
  public GetMmiRecordOutCtx getMmiRecord(GetMmiRecordInCtx methodIn) throws Exception {

    // *81***************************************************************
    // *81 2040-Get-mmi-record                                          *
    // *81                                                              *
    // *81 business function: retrived the records from the table       *
    // *81***************************************************************
    // *82***************************************************************
    // *82 2040-get-mmi-record                                          *
    // *82 1. select the records from pol_pln_mstr table                *
    // *82***************************************************************
    // Added variable to get the program context in place.
    D5427polCtx programCtx = methodIn.getD5427polCtx();
    // Added variable to get the output context in place.
    GetMmiRecordOutCtx methodOut = methodIn.getGetMmiRecordOutCtx();
    //  cobolCode::MOVE WS-STD-POL-NBR (1) TO MMI-POL-NBR
    methodOut.setMmiPolNbr(methodOut.getStdPolNbr(0));
    //  cobolCode::MOVE WS-STD-PLN-NBR (1) TO MMI-PLN-NBR
    methodOut.setMmiPlnNbr(methodOut.getStdPlnNbr(0));
    //  cobolCode::MOVE WS-STD-CLSS-NBR (1) TO MMI-CLSS-NBR
    methodOut.setMmiClssNbr(methodOut.getStdClssNbr(0));
    //  cobolCode::MOVE POL-REQ-COV-TYP-CD TO MMI-COV-TYP-CD
    methodOut.setMmiCovTypCd(methodOut.getPolReqCovTypCd());
    //  cobolCode::SELECT POL_TYP_CD , EFF_DT , VAR_PRD_FCT FROM POL_PLN_MSTR WHERE POL_NBR = ? AND
    // PLN_NBR = ? AND CLSS_NBR = ? AND COV_TYP_CD = ?
    d5427polRepository.selectPolPlnMstr(methodOut.getDclpolPlnMstr(), programCtx.getSqlca());
    //  cobolCode::MOVE SQLCODE TO WS-SQLCODE DSM-SQLCODE
    methodOut.setSqlcode_Ws(methodOut.getSqlcode());
    methodOut.setDsmSqlcode(methodOut.getSqlcode());
    //  cobolCode::EVALUATE TRUE
    if (methodOut.isSqlcodeOk()) {

      // ***P37064           if pol-req-getmain-creator = 'f5683h51'
      // ***p37064             and  ws-mxi-eff-date-db2 > mmi-eff-dt
      // ***p37064        move ws-mxi-eff-date-db2 to pol1-ret-pol-eff-date
      // ***p37064           else

      // ***P37064           end-if
      //  cobolCode::MOVE MMI-EFF-DT TO POL1-RET-POL-EFF-DATE
      methodOut.setPol1RetPolEffDate(methodOut.getMmiEffDt());
      //  cobolCode::MOVE MMI-POL-TYP-CD TO POL1-RET-POLICY-TYPE
      methodOut.setPol1RetPolicyType(methodOut.getMmiPolTypCd());
      //  cobolCode::MOVE MMI-VAR-PRD-FCT TO POL1-RET-VAR-PER
      methodOut.setPol1RetVarPer(
          String.valueOf(
                  CFUtil.pad(4, String.valueOf(methodOut.getMmiVarPrdFct()), "0", CFUtil.LEFT_PAD))
              .toCharArray());
    } else if (methodOut.isSqlcodeNotFound()) {
      //  cobolCode::SET DSM-ENTRY-NOT-FND-INQ TO TRUE
      methodOut.setDsmEntryNotFndInqTrue();

      //  cobolCode::MOVE 'SELECT' TO DSM-ERR-TBL-ACTION
      methodOut.setDsmErrTblAction(CONSTANTS.LITERAL_SELECT_B4_);
      //  cobolCode::MOVE 'POL_PLN_MSTR' TO DSM-ERR-TBL-NAME
      methodOut.setDsmErrTblName(CONSTANTS.LITERAL_POL_PLN_MSTR_B13_);
      //  cobolCode::MOVE '2040-GET-MMI-RECORD' TO DSM-ERR-SECTN-NAME
      methodOut.setDsmErrSectnName(CONSTANTS.LITERAL_1262958207);
      //  cobolCode::MOVE 'D5427POL' TO DSM-ERR-PGM-NAME
      //  LITERAL_D5427POL = 'D5427POL'
      methodOut.setDsmErrPgmName(CONSTANTS.LITERAL_D5427POL);
      //  cobolCode::PERFORM 7777-MOVES-FOR-ERROR-LOG
      movesForErrorLog(programCtx.getMovesForErrorLogInCtx()); /*7777-MOVES-FOR-ERROR-LOG SECTION*/
      if (programCtx.isProgramEnded()) {
        return methodOut;
      }
    } else {
      //  cobolCode::SET DSM-DB2-ERROR TO TRUE
      methodOut.setDsmDb2ErrorTrue();

      //  cobolCode::MOVE 'SELECT' TO DSM-ERR-TBL-ACTION
      methodOut.setDsmErrTblAction(CONSTANTS.LITERAL_SELECT_B4_);
      //  cobolCode::MOVE 'POL_PLN_MSTR' TO DSM-ERR-TBL-NAME
      methodOut.setDsmErrTblName(CONSTANTS.LITERAL_POL_PLN_MSTR_B13_);
      //  cobolCode::MOVE '2040-GET-MMI-RECORD' TO DSM-ERR-SECTN-NAME
      methodOut.setDsmErrSectnName(CONSTANTS.LITERAL_1262958207);
      //  cobolCode::MOVE 'D5427POL' TO DSM-ERR-PGM-NAME
      //  LITERAL_D5427POL = 'D5427POL'
      methodOut.setDsmErrPgmName(CONSTANTS.LITERAL_D5427POL);
      //  cobolCode::PERFORM 7777-MOVES-FOR-ERROR-LOG
      movesForErrorLog(programCtx.getMovesForErrorLogInCtx()); /*7777-MOVES-FOR-ERROR-LOG SECTION*/
      if (programCtx.isProgramEnded()) {
        return methodOut;
      }
    }

    return methodOut;
  }
  /**
   * populateStdPolPlnCls This method is derived from COBOL Paragraph -
   * 2050-POPULATE-STD-POL-PLN-CLS SECTION COBOL Cyclomatic complexity - 3 Input :
   *
   * <p>- sqlcode_Ws COBOL Name: WS-SQLCODE - xrfStdPlnPolNbr COBOL Name: XRF-STD-PLN-POL-NBR -
   * xrfStdPlnPlnNbr COBOL Name: XRF-STD-PLN-PLN-NBR - xrfStdPlnClssNbr COBOL Name:
   * XRF-STD-PLN-CLSS-NBR - xrfCancDt COBOL Name: XRF-CANC-DT - polReqMxiPolNbr COBOL Name:
   * POL-REQ-MXI-POL-NBR - polReqMxiPlnNbr COBOL Name: POL-REQ-MXI-PLN-NBR - polReqMxiClssNbr COBOL
   * Name: POL-REQ-MXI-CLSS-NBR
   *
   * <p>Output :
   *
   * <p>- stdPolNbr COBOL Name: WS-STD-POL-NBR - xrfStdPlnPolNbr COBOL Name: XRF-STD-PLN-POL-NBR -
   * stdPlnNbr COBOL Name: WS-STD-PLN-NBR - xrfStdPlnPlnNbr COBOL Name: XRF-STD-PLN-PLN-NBR -
   * stdClssNbr COBOL Name: WS-STD-CLSS-NBR - xrfStdPlnClssNbr COBOL Name: XRF-STD-PLN-CLSS-NBR -
   * covEndDt COBOL Name: WS-COV-END-DT - xrfCancDt COBOL Name: XRF-CANC-DT - polReqMxiPolNbr COBOL
   * Name: POL-REQ-MXI-POL-NBR - polReqMxiPlnNbr COBOL Name: POL-REQ-MXI-PLN-NBR - polReqMxiClssNbr
   * COBOL Name: POL-REQ-MXI-CLSS-NBR
   *
   * @throws CFException
   */
  @Override
  public PopulateStdPolPlnClsOutCtx populateStdPolPlnCls(PopulateStdPolPlnClsInCtx methodIn)
      throws Exception {

    // *81***************************************************************
    // *81 2050-Populate-std-pol-pln-cls                                *
    // *81 business function: populate the return area                  *
    // *81***************************************************************
    // *82***************************************************************
    // *82 2050-populate-std-pol-pln-cls                                *
    // *82 1. populate the return area                                  *
    // *82***************************************************************
    // Added variable to get the program context in place.
    D5427polCtx programCtx = methodIn.getD5427polCtx();
    // Added variable to get the output context in place.
    PopulateStdPolPlnClsOutCtx methodOut = methodIn.getPopulateStdPolPlnClsOutCtx();
    //  cobolCode::IF WS-SQLCODE-OK
    if (methodIn.isSqlcodeOk()) {
      //  cobolCode::MOVE XRF-STD-PLN-POL-NBR TO WS-STD-POL-NBR ( WS-LINE-SUB )
      methodOut.setStdPolNbr(methodIn.getLineSub() - 1, methodOut.getXrfStdPlnPolNbr());
      //  cobolCode::MOVE XRF-STD-PLN-PLN-NBR TO WS-STD-PLN-NBR ( WS-LINE-SUB )
      methodOut.setStdPlnNbr(methodIn.getLineSub() - 1, methodOut.getXrfStdPlnPlnNbr());
      //  cobolCode::MOVE XRF-STD-PLN-CLSS-NBR TO WS-STD-CLSS-NBR ( WS-LINE-SUB )
      methodOut.setStdClssNbr(methodIn.getLineSub() - 1, methodOut.getXrfStdPlnClssNbr());
      //  cobolCode::MOVE XRF-CANC-DT TO WS-COV-END-DT ( WS-LINE-SUB )
      methodOut.setCovEndDt(methodIn.getLineSub() - 1, methodOut.getXrfCancDt());
    }

    // ***P37064         move xrf-eff-dt            to
    // ***p37064                              ws-mxi-eff-date-db2
    //  cobolCode::ELSE
    else {
      //  cobolCode::IF WS-SQLCODE-NOT-FOUND
      if (methodIn.isSqlcodeNotFound()) {
        //  cobolCode::MOVE POL-REQ-MXI-POL-NBR TO WS-STD-POL-NBR ( WS-LINE-SUB )
        methodOut.setStdPolNbr(methodIn.getLineSub() - 1, methodOut.getPolReqMxiPolNbr());
        //  cobolCode::MOVE POL-REQ-MXI-PLN-NBR TO WS-STD-PLN-NBR ( WS-LINE-SUB )
        methodOut.setStdPlnNbr(
            methodIn.getLineSub() - 1,
            String.valueOf(methodOut.getPolReqMxiPlnNbrString()).toCharArray());
        //  cobolCode::MOVE POL-REQ-MXI-CLSS-NBR TO WS-STD-CLSS-NBR ( WS-LINE-SUB )
        methodOut.setStdClssNbr(
            methodIn.getLineSub() - 1,
            String.valueOf(methodOut.getPolReqMxiClssNbrString()).toCharArray());
      }
    }

    return methodOut;
  }
  /**
   * rcprctySelect This method is derived from COBOL Paragraph - 3060-RCPRCTY-SELECT SECTION COBOL
   * Cyclomatic complexity - 5 Input :
   *
   * <p>- sqlcode COBOL Name: SQLCODE - dtlPrefCd COBOL Name: DTL-PREF-CD
   *
   * <p>Output :
   *
   * <p>- sqlcode_Ws COBOL Name: WS-SQLCODE - dsmSqlcode COBOL Name: DSM-SQLCODE - sqlcode COBOL
   * Name: SQLCODE - pol2RetPrefNtwkCd COBOL Name: POL2-RET-PREF-NTWK-CD - dtlPrefCd COBOL Name:
   * DTL-PREF-CD - dsmReturnCode COBOL Name: DSM-RETURN-CODE - dsmErrTblAction COBOL Name:
   * DSM-ERR-TBL-ACTION - dsmErrTblName COBOL Name: DSM-ERR-TBL-NAME - dsmErrSectnName COBOL Name:
   * DSM-ERR-SECTN-NAME - dsmErrPgmName COBOL Name: DSM-ERR-PGM-NAME
   *
   * @throws CFException
   */
  @Override
  public RcprctySelectOutCtx rcprctySelect(RcprctySelectInCtx methodIn) throws Exception {
    // Added variable to get the program context in place.
    D5427polCtx programCtx = methodIn.getD5427polCtx();
    // Added variable to get the output context in place.
    RcprctySelectOutCtx methodOut = methodIn.getRcprctySelectOutCtx();
    //  cobolCode::SELECT PREF_CD FROM NTWK_RCPRCTY_DTL A WHERE RCPRCTY_TBL_ID = ? AND PREF_CD > ' '
    // FETCH FIRST 1 ROWS ONLY
    d5427polRepository.selectNtwkRcprctyDtl(
        methodIn.getDclpolPlnMstr(), methodOut.getDclntwkRcprctyDtl(), programCtx.getSqlca());
    //  cobolCode::MOVE SQLCODE TO WS-SQLCODE DSM-SQLCODE
    methodOut.setSqlcode_Ws(methodOut.getSqlcode());
    methodOut.setDsmSqlcode(methodOut.getSqlcode());
    //  cobolCode::EVALUATE TRUE
    if (methodOut.isSqlcodeOk()) {
      //  cobolCode::MOVE DTL-PREF-CD TO POL2-RET-PREF-NTWK-CD
      methodOut.setPol2RetPrefNtwkCd(methodOut.getDtlPrefCd());
    } else if (methodOut.isSqlcodeNotFound()) {
      //  cobolCode::MOVE SPACE TO POL2-RET-PREF-NTWK-CD
      methodOut.setPol2RetPrefNtwkCd(CONSTANTS.SPACE);
    } else {
      //  cobolCode::SET DSM-DB2-ERROR TO TRUE
      methodOut.setDsmDb2ErrorTrue();

      //  cobolCode::MOVE 'FETCH' TO DSM-ERR-TBL-ACTION
      methodOut.setDsmErrTblAction(CONSTANTS.LITERAL_FETCH_B5_);
      //  cobolCode::MOVE 'CUR-RCPRCTY-CSR' TO DSM-ERR-TBL-NAME
      methodOut.setDsmErrTblName(CONSTANTS.LITERAL_CUR_MN2_RCPRCTYCSR_B10_);
      //  cobolCode::MOVE '3060-FETCH-CUR-RCPRCTY-CSR' TO DSM-ERR-SECTN-NAME
      methodOut.setDsmErrSectnName(CONSTANTS.LITERAL_1184126668);
      //  cobolCode::MOVE 'D5427POL' TO DSM-ERR-PGM-NAME
      //  LITERAL_D5427POL = 'D5427POL'
      methodOut.setDsmErrPgmName(CONSTANTS.LITERAL_D5427POL);
      //  cobolCode::PERFORM 7777-MOVES-FOR-ERROR-LOG
      movesForErrorLog(programCtx.getMovesForErrorLogInCtx()); /*7777-MOVES-FOR-ERROR-LOG SECTION*/
      if (programCtx.isProgramEnded()) {
        return methodOut;
      }
    }

    return methodOut;
  }
  /**
   * funCd2PolplnXref This method is derived from COBOL Paragraph - 3300-FUN-CD2-POLPLN-XREF SECTION
   * COBOL Cyclomatic complexity - 5 Input :
   *
   * <p>- sqlcode COBOL Name: SQLCODE
   *
   * <p>Output :
   *
   * <p>- sqlcode_Ws COBOL Name: WS-SQLCODE - dsmSqlcode COBOL Name: DSM-SQLCODE - sqlcode COBOL
   * Name: SQLCODE - dsmReturnCode COBOL Name: DSM-RETURN-CODE - dsmErrTblAction COBOL Name:
   * DSM-ERR-TBL-ACTION - dsmErrTblName COBOL Name: DSM-ERR-TBL-NAME - dsmErrSectnName COBOL Name:
   * DSM-ERR-SECTN-NAME - dsmErrPgmName COBOL Name: DSM-ERR-PGM-NAME
   *
   * @throws CFException
   */
  @Override
  public FunCd2PolplnXrefOutCtx funCd2PolplnXref(FunCd2PolplnXrefInCtx methodIn) throws Exception {

    // *    Move sqlcode to ws-sqlcode
    // *                    dsm-sqlcode.
    // *    evaluate true
    // *        when ws-sqlcode-ok
    // *             continue
    // *        when other
    // *            set dsm-db2-error               to true
    // *            move 'close'                    to dsm-err-tbl-action
    // *            move 'pol_pln_mstr_ppo_arng'    to dsm-err-tbl-name
    // *            move '3130-close-csr'           to dsm-err-sectn-name
    // *            move 'd5427pol'                 to dsm-err-pgm-name
    // *            perform 7777-moves-for-error-log
    // *    end-evaluate.
    // *3130-exit.
    // *     exit.
    // *81***************************************************************
    // *81 3300-fun-cd2-polpln-xref.                                    *
    // *81                                                              *
    // *81 business function: retrive the records from the table        *
    // *81***************************************************************
    // *82***************************************************************
    // *82 3300-fun-cd2-polpln-xref.                                    *
    // *82 1. read the records from the cust_pol_pln_xref table         *
    // *82***************************************************************
    // Added variable to get the program context in place.
    D5427polCtx programCtx = methodIn.getD5427polCtx();
    // Added variable to get the output context in place.
    FunCd2PolplnXrefOutCtx methodOut = methodIn.getFunCd2PolplnXrefOutCtx();
    //  cobolCode::SELECT MNNRP_CD , MNNRP_PCT , UH_PREM_DESG_CD , PRORT_EVNT , PRDCT_PLN_CLSS_CD ,
    // PLN_DED_PRORT_IND , EFF_DT , CANC_DT FROM CUST_POL_PLN_XREF WHERE POL_NBR = ? AND COV_TYP_CD
    // = ? AND PLN_NBR = ? AND CLSS_NBR = ? AND ( ( EFF_DT <= ? AND CANC_DT >= ? ) OR ( EFF_DT <= ?
    // AND CANC_DT >= ? ) ) ORDER BY EFF_DT FETCH FIRST 1 ROWS ONLY
    d5427polRepository.selectCustPolPlnXref2(
        programCtx.getSqlca(), methodOut.getDclcustPolPlnXref());
    //  cobolCode::MOVE SQLCODE TO WS-SQLCODE DSM-SQLCODE
    methodOut.setSqlcode_Ws(methodOut.getSqlcode());
    methodOut.setDsmSqlcode(methodOut.getSqlcode());
    //  cobolCode::EVALUATE TRUE
    if (methodOut.isSqlcodeOk()) {
      //  cobolCode::PERFORM 3310-POPULATE-MXI-RET
      populateMxiRet(programCtx.getPopulateMxiRetInCtx()); /*3310-POPULATE-MXI-RET SECTION*/
      if (programCtx.isProgramEnded()) {
        return methodOut;
      }
      //  cobolCode::PERFORM 3400-FUNC-CD2-GET-MMI
      funcCd2GetMmi(programCtx.getFuncCd2GetMmiInCtx()); /*3400-FUNC-CD2-GET-MMI SECTION*/
      if (programCtx.isProgramEnded()) {
        return methodOut;
      }
    } else if (methodOut.isSqlcodeNotFound()) {
      //  cobolCode::PERFORM 3400-FUNC-CD2-GET-MMI
      funcCd2GetMmi(programCtx.getFuncCd2GetMmiInCtx()); /*3400-FUNC-CD2-GET-MMI SECTION*/
      if (programCtx.isProgramEnded()) {
        return methodOut;
      }
    } else {
      //  cobolCode::SET DSM-DB2-ERROR TO TRUE
      methodOut.setDsmDb2ErrorTrue();

      //  cobolCode::MOVE 'SELECT' TO DSM-ERR-TBL-ACTION
      methodOut.setDsmErrTblAction(CONSTANTS.LITERAL_SELECT_B4_);
      //  cobolCode::MOVE 'CUST_POL_PLN_XREF' TO DSM-ERR-TBL-NAME
      methodOut.setDsmErrTblName(CONSTANTS.LITERAL_CUST_POL_PLN_XREF_B8_);
      //  cobolCode::MOVE '3300-FUN-CD2-POLPLN-XREF' TO DSM-ERR-SECTN-NAME
      methodOut.setDsmErrSectnName(CONSTANTS.LITERAL_893401836);
      //  cobolCode::MOVE 'D5427POL' TO DSM-ERR-PGM-NAME
      //  LITERAL_D5427POL = 'D5427POL'
      methodOut.setDsmErrPgmName(CONSTANTS.LITERAL_D5427POL);
      //  cobolCode::PERFORM 7777-MOVES-FOR-ERROR-LOG
      movesForErrorLog(programCtx.getMovesForErrorLogInCtx()); /*7777-MOVES-FOR-ERROR-LOG SECTION*/
      if (programCtx.isProgramEnded()) {
        return methodOut;
      }
    }

    return methodOut;
  }
  /**
   * populateMxiRet This method is derived from COBOL Paragraph - 3310-POPULATE-MXI-RET SECTION
   * COBOL Cyclomatic complexity - 7 Input :
   *
   * <p>- xrfPrdctPlnClssCd COBOL Name: XRF-PRDCT-PLN-CLSS-CD - xrfPrortEvnt COBOL Name:
   * XRF-PRORT-EVNT - xrfPlnDedPrortInd COBOL Name: XRF-PLN-DED-PRORT-IND - xrfUhPremDesgCd COBOL
   * Name: XRF-UH-PREM-DESG-CD - xrfMnnrpCd COBOL Name: XRF-MNNRP-CD - xrfMnnrpPct COBOL Name:
   * XRF-MNNRP-PCT - xrfEffDt COBOL Name: XRF-EFF-DT - mxiEffDate COBOL Name: WS-MXI-EFF-DATE -
   * xrfCancDt COBOL Name: XRF-CANC-DT - mxiEndDate COBOL Name: WS-MXI-END-DATE
   *
   * <p>Output :
   *
   * <p>- pol2RetProductInd COBOL Name: POL2-RET-PRODUCT-IND - xrfPrdctPlnClssCd COBOL Name:
   * XRF-PRDCT-PLN-CLSS-CD - pol2RetProrationEvent COBOL Name: POL2-RET-PRORATION-EVENT -
   * xrfPrortEvnt COBOL Name: XRF-PRORT-EVNT - pol2RetProrationInd COBOL Name:
   * POL2-RET-PRORATION-IND - xrfPlnDedPrortInd COBOL Name: XRF-PLN-DED-PRORT-IND -
   * pol2RetUhPremDesgCd COBOL Name: POL2-RET-UH-PREM-DESG-CD - xrfUhPremDesgCd COBOL Name:
   * XRF-UH-PREM-DESG-CD - pol2RetMnnrpInd COBOL Name: POL2-RET-MNNRP-IND - xrfMnnrpCd COBOL Name:
   * XRF-MNNRP-CD - pol2RetMnnrpPct COBOL Name: POL2-RET-MNNRP-PCT - xrfMnnrpPct COBOL Name:
   * XRF-MNNRP-PCT - mxiEffDateCc COBOL Name: WS-MXI-EFF-DATE-CC - xrfEffDt COBOL Name: XRF-EFF-DT -
   * mxiEffDateYy COBOL Name: WS-MXI-EFF-DATE-YY - mxiEffDateMm COBOL Name: WS-MXI-EFF-DATE-MM -
   * mxiEffDateDd COBOL Name: WS-MXI-EFF-DATE-DD - pol2RetMxiEffDate COBOL Name:
   * POL2-RET-MXI-EFF-DATE - mxiEffDate COBOL Name: WS-MXI-EFF-DATE - mxiEndDateCc COBOL Name:
   * WS-MXI-END-DATE-CC - xrfCancDt COBOL Name: XRF-CANC-DT - mxiEndDateYy COBOL Name:
   * WS-MXI-END-DATE-YY - mxiEndDateMm COBOL Name: WS-MXI-END-DATE-MM - mxiEndDateDd COBOL Name:
   * WS-MXI-END-DATE-DD - pol2RetMxiEndDate COBOL Name: POL2-RET-MXI-END-DATE - mxiEndDate COBOL
   * Name: WS-MXI-END-DATE
   *
   * @throws CFException
   */
  @Override
  public PopulateMxiRetOutCtx populateMxiRet(PopulateMxiRetInCtx methodIn) throws Exception {

    // *81***************************************************************
    // *81 3310-Populate-mxi-ret.                                       *
    // *81 business function: populate the return fields                *
    // *81***************************************************************
    // *82***************************************************************
    // *82 3310-populate-mxi-ret                                        *
    // *82                                                              *
    // *82 1.populate the return fields                                 *
    // *82***************************************************************
    // Added variable to get the program context in place.
    D5427polCtx programCtx = methodIn.getD5427polCtx();
    // Added variable to get the output context in place.
    PopulateMxiRetOutCtx methodOut = methodIn.getPopulateMxiRetOutCtx();
    //  cobolCode::MOVE XRF-PRDCT-PLN-CLSS-CD TO POL2-RET-PRODUCT-IND
    methodOut.setPol2RetProductInd(methodOut.getXrfPrdctPlnClssCd());
    //  cobolCode::MOVE XRF-PRORT-EVNT TO POL2-RET-PRORATION-EVENT
    methodOut.setPol2RetProrationEvent(methodOut.getXrfPrortEvnt());
    //  cobolCode::MOVE XRF-PLN-DED-PRORT-IND TO POL2-RET-PRORATION-IND
    methodOut.setPol2RetProrationInd(methodOut.getXrfPlnDedPrortInd());
    //  cobolCode::IF XRF-UH-PREM-DESG-CD NOT = ( LOW-VALUES AND SPACES)
    if ((!(checkLowValue(methodOut.getXrfUhPremDesgCd()))
        && (!allSpaces(methodOut.getXrfUhPremDesgCd())))) {
      //  cobolCode::IF XRF-UH-PREM-DESG-CD = 'N'
      //  LITERAL_N = 'N'
      if (compareChars(methodOut.getXrfUhPremDesgCd(), CONSTANTS.LITERAL_N) == 0) {
        //  cobolCode::MOVE SPACES TO POL2-RET-UH-PREM-DESG-CD
        methodOut.setPol2RetUhPremDesgCd(CONSTANTS.SPACE);
      }
      //  cobolCode::ELSE
      else {
        //  cobolCode::MOVE XRF-UH-PREM-DESG-CD TO POL2-RET-UH-PREM-DESG-CD
        methodOut.setPol2RetUhPremDesgCd(methodOut.getXrfUhPremDesgCd());
      }
    }
    //  cobolCode::IF XRF-MNNRP-CD NOT = SPACES
    if ((!allSpaces(methodOut.getXrfMnnrpCd()))) {
      //  cobolCode::MOVE XRF-MNNRP-CD TO POL2-RET-MNNRP-IND
      methodOut.setPol2RetMnnrpInd(methodOut.getXrfMnnrpCd());
    }
    //  cobolCode::IF XRF-MNNRP-PCT NUMERIC
    if (methodIn.getDclcustPolPlnXref().xrfMnnrpPctIsNumeric()) {
      //  cobolCode::IF XRF-MNNRP-PCT NOT = ZEROS
      if ((methodOut.getXrfMnnrpPct() != 0)) {
        //  cobolCode::MOVE XRF-MNNRP-PCT TO POL2-RET-MNNRP-PCT
        methodOut.setPol2RetMnnrpPct(methodOut.getXrfMnnrpPct());
      }
    }
    //  cobolCode::MOVE XRF-EFF-DT (1 : 2) TO WS-MXI-EFF-DATE-CC
    methodOut.setMxiEffDateCc(CFUtil.getInt(substring(methodOut.getXrfEffDt(), 0, 2)));
    //  cobolCode::MOVE XRF-EFF-DT (3 : 2) TO WS-MXI-EFF-DATE-YY
    methodOut.setMxiEffDateYy(CFUtil.getInt(substring(methodOut.getXrfEffDt(), 2, 4)));
    //  cobolCode::MOVE XRF-EFF-DT (6 : 2) TO WS-MXI-EFF-DATE-MM
    methodOut.setMxiEffDateMm(CFUtil.getInt(substring(methodOut.getXrfEffDt(), 5, 7)));
    //  cobolCode::MOVE XRF-EFF-DT (9 : 2) TO WS-MXI-EFF-DATE-DD
    methodOut.setMxiEffDateDd(CFUtil.getInt(substring(methodOut.getXrfEffDt(), 8, 10)));
    methodOut.setPol2RetMxiEffDate(methodOut.getMxiEffDate().toCharArray());
    //  cobolCode::MOVE XRF-CANC-DT (1 : 2) TO WS-MXI-END-DATE-CC
    methodOut.setMxiEndDateCc(CFUtil.getInt(substring(methodOut.getXrfCancDt(), 0, 2)));
    //  cobolCode::MOVE XRF-CANC-DT (3 : 2) TO WS-MXI-END-DATE-YY
    methodOut.setMxiEndDateYy(CFUtil.getInt(substring(methodOut.getXrfCancDt(), 2, 4)));
    //  cobolCode::MOVE XRF-CANC-DT (6 : 2) TO WS-MXI-END-DATE-MM
    methodOut.setMxiEndDateMm(CFUtil.getInt(substring(methodOut.getXrfCancDt(), 5, 7)));
    //  cobolCode::MOVE XRF-CANC-DT (9 : 2) TO WS-MXI-END-DATE-DD
    methodOut.setMxiEndDateDd(CFUtil.getInt(substring(methodOut.getXrfCancDt(), 8, 10)));
    methodOut.setPol2RetMxiEndDate(methodOut.getMxiEndDate().toCharArray());

    return methodOut;
  }
  /**
   * funcCd2GetMmi This method is derived from COBOL Paragraph - 3400-FUNC-CD2-GET-MMI SECTION COBOL
   * Cyclomatic complexity - 5 Input :
   *
   * <p>- sqlcode COBOL Name: SQLCODE
   *
   * <p>Output :
   *
   * <p>- sqlcode_Ws COBOL Name: WS-SQLCODE - dsmSqlcode COBOL Name: DSM-SQLCODE - sqlcode COBOL
   * Name: SQLCODE - dsmReturnCode COBOL Name: DSM-RETURN-CODE - dsmErrTblAction COBOL Name:
   * DSM-ERR-TBL-ACTION - dsmErrTblName COBOL Name: DSM-ERR-TBL-NAME - dsmErrSectnName COBOL Name:
   * DSM-ERR-SECTN-NAME - dsmErrPgmName COBOL Name: DSM-ERR-PGM-NAME
   *
   * @throws CFException
   */
  @Override
  public FuncCd2GetMmiOutCtx funcCd2GetMmi(FuncCd2GetMmiInCtx methodIn) throws Exception {

    // *81***************************************************************
    // *81 3400-Func-cd2-get-mmi.                                       *
    // *81 business function: read the records from table               *
    // *81 main processing.                                             *
    // *81***************************************************************
    // *82***************************************************************
    // *82 3400-func-cd2-get-mmi                                        *
    // *82                                                              *
    // *82 1. read records from pol_pln_mstr for given policy/plan if   *
    // *82    record not found in cust_pol_pln_xref table               *
    // *82***************************************************************
    // Added variable to get the program context in place.
    D5427polCtx programCtx = methodIn.getD5427polCtx();
    // Added variable to get the output context in place.
    FuncCd2GetMmiOutCtx methodOut = methodIn.getFuncCd2GetMmiOutCtx();
    //  cobolCode::SELECT MNRP_CD , MNRP_PCT , NON_EMBD_DED_CD , UHP_CD , PRORT_EVNT_TYP_CD ,
    // MBR_NTWK_KEY_MTCH_CD , LFTM_MAX_AMT , TIER_1_LFTM_MAX_AMT , OOP_COMB_NBR_CD ,
    // PSY_LFTM_CNFM_MAX_AMT , PSY_LFTM_NON_CNFM_MAX_AMT , PSY_LFTM_COMB_PRSC_MAX_AMT ,
    // PSY_CYR_CNFM_MAX_AMT , PSY_CYR_NON_CNFM_MAX_AMT , PSY_CYR_COMB_PRSC_MAX_AMT , DSES_ST_TBL_NBR
    // , HI_DED_PLN_CD , PRORT_INTRVL_FREQ_CD , RCPRCTY_TBL_ID , OOP_MAX_COV_CD FROM POL_PLN_MSTR
    // WHERE POL_NBR = ? AND PLN_NBR = ? AND CLSS_NBR = ? AND COV_TYP_CD = ?
    d5427polRepository.selectPolPlnMstr1(methodOut.getDclpolPlnMstr(), programCtx.getSqlca());
    //  cobolCode::MOVE SQLCODE TO WS-SQLCODE DSM-SQLCODE
    methodOut.setSqlcode_Ws(methodOut.getSqlcode());
    methodOut.setDsmSqlcode(methodOut.getSqlcode());
    //  cobolCode::EVALUATE TRUE
    if (methodOut.isSqlcodeOk()) {
      //  cobolCode::PERFORM 3410-POPULATE-MMI-RET
      populateMmiRet(programCtx.getPopulateMmiRetInCtx()); /*3410-POPULATE-MMI-RET SECTION*/
      if (programCtx.isProgramEnded()) {
        return methodOut;
      }
    } else if (methodOut.isSqlcodeNotFound()) {
      //  cobolCode::SET DSM-ENTRY-NOT-FND-INQ TO TRUE
      methodOut.setDsmEntryNotFndInqTrue();

      //  cobolCode::MOVE 'SELECT' TO DSM-ERR-TBL-ACTION
      methodOut.setDsmErrTblAction(CONSTANTS.LITERAL_SELECT_B4_);
      //  cobolCode::MOVE 'POL_PLN_MSTR' TO DSM-ERR-TBL-NAME
      methodOut.setDsmErrTblName(CONSTANTS.LITERAL_POL_PLN_MSTR_B13_);
      //  cobolCode::MOVE '3400-FUNC-CD2-GET-MMI' TO DSM-ERR-SECTN-NAME
      methodOut.setDsmErrSectnName(CONSTANTS.LITERAL_1599704775);
      //  cobolCode::MOVE 'D5427POL' TO DSM-ERR-PGM-NAME
      //  LITERAL_D5427POL = 'D5427POL'
      methodOut.setDsmErrPgmName(CONSTANTS.LITERAL_D5427POL);
      //  cobolCode::PERFORM 7777-MOVES-FOR-ERROR-LOG
      movesForErrorLog(programCtx.getMovesForErrorLogInCtx()); /*7777-MOVES-FOR-ERROR-LOG SECTION*/
      if (programCtx.isProgramEnded()) {
        return methodOut;
      }
    } else {
      //  cobolCode::SET DSM-DB2-ERROR TO TRUE
      methodOut.setDsmDb2ErrorTrue();

      //  cobolCode::MOVE 'SELECT' TO DSM-ERR-TBL-ACTION
      methodOut.setDsmErrTblAction(CONSTANTS.LITERAL_SELECT_B4_);
      //  cobolCode::MOVE 'POL_PLN_MSTR' TO DSM-ERR-TBL-NAME
      methodOut.setDsmErrTblName(CONSTANTS.LITERAL_POL_PLN_MSTR_B13_);
      //  cobolCode::MOVE 'D5427POL' TO DSM-ERR-PGM-NAME
      //  LITERAL_D5427POL = 'D5427POL'
      methodOut.setDsmErrPgmName(CONSTANTS.LITERAL_D5427POL);
      //  cobolCode::PERFORM 7777-MOVES-FOR-ERROR-LOG
      movesForErrorLog(programCtx.getMovesForErrorLogInCtx()); /*7777-MOVES-FOR-ERROR-LOG SECTION*/
      if (programCtx.isProgramEnded()) {
        return methodOut;
      }
    }

    return methodOut;
  }
  /**
   * populateMmiRet This method is derived from COBOL Paragraph - 3410-POPULATE-MMI-RET SECTION
   * COBOL Cyclomatic complexity - 13 Input :
   *
   * <p>- xrfPrortEvnt COBOL Name: XRF-PRORT-EVNT - mmiPrortEvntTypCd COBOL Name:
   * MMI-PRORT-EVNT-TYP-CD - xrfUhPremDesgCd COBOL Name: XRF-UH-PREM-DESG-CD - mmiUhpCd COBOL Name:
   * MMI-UHP-CD - xrfMnnrpCd COBOL Name: XRF-MNNRP-CD - mmiMnrpCd COBOL Name: MMI-MNRP-CD -
   * xrfMnnrpPct COBOL Name: XRF-MNNRP-PCT - mmiMnrpPct COBOL Name: MMI-MNRP-PCT - xrfPlnDedPrortInd
   * COBOL Name: XRF-PLN-DED-PRORT-IND - mmiPrortIntrvlFreqCd COBOL Name: MMI-PRORT-INTRVL-FREQ-CD -
   * mmiNonEmbdDedCd COBOL Name: MMI-NON-EMBD-DED-CD - mmiLftmMaxAmt COBOL Name: MMI-LFTM-MAX-AMT -
   * mmiTier1LftmMaxAmt COBOL Name: MMI-TIER-1-LFTM-MAX-AMT - mmiOopCombNbrCd COBOL Name:
   * MMI-OOP-COMB-NBR-CD - mmiPsyLftmCnfmMaxAmt COBOL Name: MMI-PSY-LFTM-CNFM-MAX-AMT -
   * mmiPsyLftmNonCnfmMaxAmt COBOL Name: MMI-PSY-LFTM-NON-CNFM-MAX-AMT - mmiPsyLftmCombPrscMaxAmt
   * COBOL Name: MMI-PSY-LFTM-COMB-PRSC-MAX-AMT - mmiPsyCyrCnfmMaxAmt COBOL Name:
   * MMI-PSY-CYR-CNFM-MAX-AMT - mmiPsyCyrNonCnfmMaxAmt COBOL Name: MMI-PSY-CYR-NON-CNFM-MAX-AMT -
   * mmiPsyCyrCombPrscMaxAmt COBOL Name: MMI-PSY-CYR-COMB-PRSC-MAX-AMT - mmiMbrNtwkKeyMtchCd COBOL
   * Name: MMI-MBR-NTWK-KEY-MTCH-CD - mmiDsesStTblNbr COBOL Name: MMI-DSES-ST-TBL-NBR -
   * mmiHiDedPlnCd COBOL Name: MMI-HI-DED-PLN-CD - mmiOopMaxCovCd COBOL Name: MMI-OOP-MAX-COV-CD
   *
   * <p>Output :
   *
   * <p>- pol2RetProrationEvent COBOL Name: POL2-RET-PRORATION-EVENT - mmiPrortEvntTypCd COBOL Name:
   * MMI-PRORT-EVNT-TYP-CD - pol2RetUhPremDesgCd COBOL Name: POL2-RET-UH-PREM-DESG-CD - mmiUhpCd
   * COBOL Name: MMI-UHP-CD - pol2RetMnnrpInd COBOL Name: POL2-RET-MNNRP-IND - mmiMnrpCd COBOL Name:
   * MMI-MNRP-CD - pol2RetMnnrpPct COBOL Name: POL2-RET-MNNRP-PCT - mmiMnrpPct COBOL Name:
   * MMI-MNRP-PCT - pol2RetProrationInd COBOL Name: POL2-RET-PRORATION-IND - mmiPrortIntrvlFreqCd
   * COBOL Name: MMI-PRORT-INTRVL-FREQ-CD - pol2RetNonEmb COBOL Name: POL2-RET-NON-EMB -
   * mmiNonEmbdDedCd COBOL Name: MMI-NON-EMBD-DED-CD - pol2RetLftmMaxAmt COBOL Name:
   * POL2-RET-LFTM-MAX-AMT - mmiLftmMaxAmt COBOL Name: MMI-LFTM-MAX-AMT - pol2RetTier1LftmMaxAmt
   * COBOL Name: POL2-RET-TIER-1-LFTM-MAX-AMT - mmiTier1LftmMaxAmt COBOL Name:
   * MMI-TIER-1-LFTM-MAX-AMT - pol2RetDualOopNbrInd COBOL Name: POL2-RET-DUAL-OOP-NBR-IND -
   * mmiOopCombNbrCd COBOL Name: MMI-OOP-COMB-NBR-CD - pol2RetPsyLftmCnfmMaxAmt COBOL Name:
   * POL2-RET-PSY-LFTM-CNFM-MAX-AMT - mmiPsyLftmCnfmMaxAmt COBOL Name: MMI-PSY-LFTM-CNFM-MAX-AMT -
   * pol2PsyLftmNonCnfmMaxAmt COBOL Name: POL2-PSY-LFTM-NON-CNFM-MAX-AMT - mmiPsyLftmNonCnfmMaxAmt
   * COBOL Name: MMI-PSY-LFTM-NON-CNFM-MAX-AMT - pol2PsyLftmCombPrscMxAmt COBOL Name:
   * POL2-PSY-LFTM-COMB-PRSC-MX-AMT - mmiPsyLftmCombPrscMaxAmt COBOL Name:
   * MMI-PSY-LFTM-COMB-PRSC-MAX-AMT - pol2RetPsyCyrCnfmMaxAmt COBOL Name:
   * POL2-RET-PSY-CYR-CNFM-MAX-AMT - mmiPsyCyrCnfmMaxAmt COBOL Name: MMI-PSY-CYR-CNFM-MAX-AMT -
   * pol2PsyCyrNonCnfmMaxAmt COBOL Name: POL2-PSY-CYR-NON-CNFM-MAX-AMT - mmiPsyCyrNonCnfmMaxAmt
   * COBOL Name: MMI-PSY-CYR-NON-CNFM-MAX-AMT - pol2PsyCyrCombPrscMaxAmt COBOL Name:
   * POL2-PSY-CYR-COMB-PRSC-MAX-AMT - mmiPsyCyrCombPrscMaxAmt COBOL Name:
   * MMI-PSY-CYR-COMB-PRSC-MAX-AMT - pol2RetMbrNtwkKeyMtchCd COBOL Name:
   * POL2-RET-MBR-NTWK-KEY-MTCH-CD - mmiMbrNtwkKeyMtchCd COBOL Name: MMI-MBR-NTWK-KEY-MTCH-CD -
   * pol2RetDsesStTblNbr COBOL Name: POL2-RET-DSES-ST-TBL-NBR - mmiDsesStTblNbr COBOL Name:
   * MMI-DSES-ST-TBL-NBR - pol2RetPlnAttr COBOL Name: POL2-RET-PLN-ATTR - mmiHiDedPlnCd COBOL Name:
   * MMI-HI-DED-PLN-CD - pol2RetOopMaxCovCd COBOL Name: POL2-RET-OOP-MAX-COV-CD - mmiOopMaxCovCd
   * COBOL Name: MMI-OOP-MAX-COV-CD
   *
   * @throws CFException
   */
  @Override
  public PopulateMmiRetOutCtx populateMmiRet(PopulateMmiRetInCtx methodIn) throws Exception {

    // *82***************************************************************
    // *82 3410-Populate-mmi-ret                                        *
    // *82 1. polpulate the mmi return fields                           *
    // *82***************************************************************
    // Added variable to get the program context in place.
    D5427polCtx programCtx = methodIn.getD5427polCtx();
    // Added variable to get the output context in place.
    PopulateMmiRetOutCtx methodOut = methodIn.getPopulateMmiRetOutCtx();
    //  cobolCode::IF XRF-PRORT-EVNT = SPACES OR LOW-VALUES OR '-'
    if ((allSpaces(methodIn.getXrfPrortEvnt()))
        || (checkLowValue(methodIn.getXrfPrortEvnt()))
        || methodIn.getXrfPrortEvnt()[0] == '-') {
      //  cobolCode::MOVE MMI-PRORT-EVNT-TYP-CD TO POL2-RET-PRORATION-EVENT
      methodOut.setPol2RetProrationEvent(methodOut.getMmiPrortEvntTypCd());
    }
    //  cobolCode::IF XRF-UH-PREM-DESG-CD = SPACES OR LOW-VALUES
    if ((allSpaces(methodIn.getXrfUhPremDesgCd()))
        || (checkLowValue(methodIn.getXrfUhPremDesgCd()))) {
      //  cobolCode::MOVE MMI-UHP-CD TO POL2-RET-UH-PREM-DESG-CD
      methodOut.setPol2RetUhPremDesgCd(methodOut.getMmiUhpCd());
    }
    //  cobolCode::IF XRF-MNNRP-CD = SPACES OR LOW-VALUES
    if ((allSpaces(methodIn.getXrfMnnrpCd())) || (checkLowValue(methodIn.getXrfMnnrpCd()))) {
      //  cobolCode::MOVE MMI-MNRP-CD TO POL2-RET-MNNRP-IND
      methodOut.setPol2RetMnnrpInd(methodOut.getMmiMnrpCd());
    }
    //  cobolCode::IF XRF-MNNRP-PCT NOT NUMERIC OR XRF-MNNRP-PCT = ZEROS
    if (!(methodIn.getDclcustPolPlnXref().xrfMnnrpPctIsNumeric())
        || (methodIn.getXrfMnnrpPct() == 0)) {
      //  cobolCode::MOVE MMI-MNRP-PCT TO POL2-RET-MNNRP-PCT
      methodOut.setPol2RetMnnrpPct(methodOut.getMmiMnrpPct());
    }
    //  cobolCode::IF XRF-PLN-DED-PRORT-IND = SPACES OR LOW-VALUES OR '-'
    if ((allSpaces(methodIn.getXrfPlnDedPrortInd()))
        || (checkLowValue(methodIn.getXrfPlnDedPrortInd()))
        || methodIn.getXrfPlnDedPrortInd()[0] == '-') {
      //  cobolCode::MOVE MMI-PRORT-INTRVL-FREQ-CD TO POL2-RET-PRORATION-IND
      methodOut.setPol2RetProrationInd(methodOut.getMmiPrortIntrvlFreqCd());
    }
    //  cobolCode::MOVE MMI-NON-EMBD-DED-CD TO POL2-RET-NON-EMB
    methodOut.setPol2RetNonEmb(methodOut.getMmiNonEmbdDedCd());
    methodOut.setPol2RetLftmMaxAmt(methodOut.getMmiLftmMaxAmt());
    methodOut.setPol2RetTier1LftmMaxAmt(methodOut.getMmiTier1LftmMaxAmt());
    //  cobolCode::MOVE MMI-OOP-COMB-NBR-CD TO POL2-RET-DUAL-OOP-NBR-IND
    methodOut.setPol2RetDualOopNbrInd(methodOut.getMmiOopCombNbrCd());
    methodOut.setPol2RetPsyLftmCnfmMaxAmt(methodOut.getMmiPsyLftmCnfmMaxAmt());
    methodOut.setPol2PsyLftmNonCnfmMaxAmt(methodOut.getMmiPsyLftmNonCnfmMaxAmt());
    methodOut.setPol2PsyLftmCombPrscMxAmt(methodOut.getMmiPsyLftmCombPrscMaxAmt());
    methodOut.setPol2RetPsyCyrCnfmMaxAmt(methodOut.getMmiPsyCyrCnfmMaxAmt());
    methodOut.setPol2PsyCyrNonCnfmMaxAmt(methodOut.getMmiPsyCyrNonCnfmMaxAmt());
    methodOut.setPol2PsyCyrCombPrscMaxAmt(methodOut.getMmiPsyCyrCombPrscMaxAmt());
    //  cobolCode::MOVE MMI-MBR-NTWK-KEY-MTCH-CD TO POL2-RET-MBR-NTWK-KEY-MTCH-CD
    methodOut.setPol2RetMbrNtwkKeyMtchCd(methodOut.getMmiMbrNtwkKeyMtchCd());
    //  cobolCode::MOVE MMI-DSES-ST-TBL-NBR TO POL2-RET-DSES-ST-TBL-NBR
    methodOut.setPol2RetDsesStTblNbr(methodOut.getMmiDsesStTblNbr());
    //  cobolCode::MOVE MMI-HI-DED-PLN-CD TO POL2-RET-PLN-ATTR
    methodOut.setPol2RetPlnAttr(methodOut.getMmiHiDedPlnCd());

    // *** - Oop maximum indicator for func-cd "02"

    // *    If mmi-grp-tbl-cd = '01' or '02' or '03'
    // *        move mmi-grp-tbl-cd to ws-grp-tbl-cd
    // *        move mmi-grp-tbl-nbr
    // *        move space
    // *             to pol2-ret-group-table-num.
    // *    end-if.
    //  cobolCode::MOVE MMI-OOP-MAX-COV-CD TO POL2-RET-OOP-MAX-COV-CD
    methodOut.setPol2RetOopMaxCovCd(methodOut.getMmiOopMaxCovCd());

    return methodOut;
  }
  /**
   * funcCd3MxiRead This method is derived from COBOL Paragraph - 4000-FUNC-CD3-MXI-READ SECTION
   * COBOL Cyclomatic complexity - 5 Input :
   *
   * <p>- sqlcode COBOL Name: SQLCODE - mmiPolNbr COBOL Name: MMI-POL-NBR - mmiPlnNbr COBOL Name:
   * MMI-PLN-NBR - xrfObligId COBOL Name: XRF-OBLIG-ID - xrfShrArngCd COBOL Name: XRF-SHR-ARNG-CD -
   * xrfEvdBasDialgInd COBOL Name: XRF-EVD-BAS-DIALG-IND - xrfCoreMedPrrAuthCd COBOL Name:
   * XRF-CORE-MED-PRR-AUTH-CD
   *
   * <p>Output :
   *
   * <p>- sqlcode_Ws COBOL Name: WS-SQLCODE - dsmSqlcode COBOL Name: DSM-SQLCODE - sqlcode COBOL
   * Name: SQLCODE - pol3StdPolNbr COBOL Name: POL3-STD-POL-NBR - mmiPolNbr COBOL Name: MMI-POL-NBR
   * - pol3StdPlnNbr COBOL Name: POL3-STD-PLN-NBR - mmiPlnNbr COBOL Name: MMI-PLN-NBR -
   * pol3RetObligId COBOL Name: POL3-RET-OBLIG-ID - xrfObligId COBOL Name: XRF-OBLIG-ID -
   * pol3RetShrArngCd COBOL Name: POL3-RET-SHR-ARNG-CD - xrfShrArngCd COBOL Name: XRF-SHR-ARNG-CD -
   * pol3EvdBasDialgInd COBOL Name: POL3-EVD-BAS-DIALG-IND - xrfEvdBasDialgInd COBOL Name:
   * XRF-EVD-BAS-DIALG-IND - pol3CoreMedPrrAuthCd COBOL Name: POL3-CORE-MED-PRR-AUTH-CD -
   * xrfCoreMedPrrAuthCd COBOL Name: XRF-CORE-MED-PRR-AUTH-CD - dsmReturnCode COBOL Name:
   * DSM-RETURN-CODE - dsmErrTblAction COBOL Name: DSM-ERR-TBL-ACTION - dsmErrTblName COBOL Name:
   * DSM-ERR-TBL-NAME - dsmErrSectnName COBOL Name: DSM-ERR-SECTN-NAME - dsmErrPgmName COBOL Name:
   * DSM-ERR-PGM-NAME
   *
   * @throws CFException
   */
  @Override
  public FuncCd3MxiReadOutCtx funcCd3MxiRead(FuncCd3MxiReadInCtx methodIn) throws Exception {

    // *81 4000-Func-cd3-mxi-read                                       *
    // *81 business function: retrieve the records from the table       *
    // *81***************************************************************
    // *82***************************************************************
    // *82 4000-func-cd3-mxi-read                                       *
    // *82 1. read the records from thee  table                         *
    // *82***************************************************************
    // Added variable to get the program context in place.
    D5427polCtx programCtx = methodIn.getD5427polCtx();
    // Added variable to get the output context in place.
    FuncCd3MxiReadOutCtx methodOut = methodIn.getFuncCd3MxiReadOutCtx();
    //  cobolCode::SELECT OBLIG_ID , SHR_ARNG_CD , EVD_BAS_DIALG_IND , CORE_MED_PRR_AUTH_CD FROM
    // CUST_POL_PLN_XREF WHERE POL_NBR = ? AND COV_TYP_CD = ? AND PLN_NBR = ? AND CLSS_NBR = ? AND (
    // ( EFF_DT <= ? AND CANC_DT >= ? ) OR ( EFF_DT <= ? AND CANC_DT >= ? ) ) ORDER BY EFF_DT ASC
    // FETCH FIRST 1 ROW ONLY
    d5427polRepository.selectCustPolPlnXref3(
        programCtx.getSqlca(), methodOut.getDclcustPolPlnXref());
    //  cobolCode::MOVE SQLCODE TO WS-SQLCODE DSM-SQLCODE
    methodOut.setSqlcode_Ws(methodOut.getSqlcode());
    methodOut.setDsmSqlcode(methodOut.getSqlcode());
    //  cobolCode::EVALUATE TRUE
    if (methodOut.isSqlcodeOk()) {
      //  cobolCode::MOVE MMI-POL-NBR TO POL3-STD-POL-NBR
      methodOut.setPol3StdPolNbr(methodOut.getMmiPolNbr());
      methodOut.setPol3StdPlnNbr(padLeftZeros(4, methodOut.getMmiPlnNbr(), false));
      //  cobolCode::MOVE XRF-OBLIG-ID TO POL3-RET-OBLIG-ID
      methodOut.setPol3RetObligId(methodOut.getXrfObligId());
      //  cobolCode::MOVE XRF-SHR-ARNG-CD TO POL3-RET-SHR-ARNG-CD
      methodOut.setPol3RetShrArngCd(methodOut.getXrfShrArngCd());
      //  cobolCode::MOVE XRF-EVD-BAS-DIALG-IND TO POL3-EVD-BAS-DIALG-IND
      methodOut.setPol3EvdBasDialgInd(methodOut.getXrfEvdBasDialgInd());
      //  cobolCode::MOVE XRF-CORE-MED-PRR-AUTH-CD TO POL3-CORE-MED-PRR-AUTH-CD
      methodOut.setPol3CoreMedPrrAuthCd(methodOut.getXrfCoreMedPrrAuthCd());
      //  cobolCode::PERFORM 4010-FUNC-CD3-POLSVI-MMI-READ
      funcCd3PolsviMmiRead(
          programCtx.getFuncCd3PolsviMmiReadInCtx()); /*4010-FUNC-CD3-POLSVI-MMI-READ SECTION*/
      if (programCtx.isProgramEnded()) {
        return methodOut;
      }
    } else if (methodOut.isSqlcodeNotFound()) {
      //  cobolCode::MOVE MMI-POL-NBR TO POL3-STD-POL-NBR
      methodOut.setPol3StdPolNbr(methodOut.getMmiPolNbr());
      methodOut.setPol3StdPlnNbr(padLeftZeros(4, methodOut.getMmiPlnNbr(), false));
      //  cobolCode::PERFORM 4010-FUNC-CD3-POLSVI-MMI-READ
      funcCd3PolsviMmiRead(
          programCtx.getFuncCd3PolsviMmiReadInCtx()); /*4010-FUNC-CD3-POLSVI-MMI-READ SECTION*/
      if (programCtx.isProgramEnded()) {
        return methodOut;
      }
    } else {
      //  cobolCode::SET DSM-DB2-ERROR TO TRUE
      methodOut.setDsmDb2ErrorTrue();

      //  cobolCode::MOVE 'SELECT' TO DSM-ERR-TBL-ACTION
      methodOut.setDsmErrTblAction(CONSTANTS.LITERAL_SELECT_B4_);
      //  cobolCode::MOVE 'CUST_PLN_PPO_ARNG' TO DSM-ERR-TBL-NAME
      methodOut.setDsmErrTblName(CONSTANTS.LITERAL_CUST_PLN_PPO_ARNG_B8_);
      //  cobolCode::MOVE '4000-FUNC-CD3-MXI-READ' TO DSM-ERR-SECTN-NAME
      methodOut.setDsmErrSectnName(CONSTANTS.LITERAL_2123341800);
      //  cobolCode::MOVE 'D5427POL' TO DSM-ERR-PGM-NAME
      //  LITERAL_D5427POL = 'D5427POL'
      methodOut.setDsmErrPgmName(CONSTANTS.LITERAL_D5427POL);
      //  cobolCode::PERFORM 7777-MOVES-FOR-ERROR-LOG
      movesForErrorLog(programCtx.getMovesForErrorLogInCtx()); /*7777-MOVES-FOR-ERROR-LOG SECTION*/
      if (programCtx.isProgramEnded()) {
        return methodOut;
      }
    }

    return methodOut;
  }
  /**
   * funcCd3PolsviMmiRead This method is derived from COBOL Paragraph -
   * 4010-FUNC-CD3-POLSVI-MMI-READ SECTION COBOL Cyclomatic complexity - 5 Input :
   *
   * <p>- sqlcode COBOL Name: SQLCODE
   *
   * <p>Output :
   *
   * <p>- sqlcode_Ws COBOL Name: WS-SQLCODE - dsmSqlcode COBOL Name: DSM-SQLCODE - sqlcode COBOL
   * Name: SQLCODE - dsmReturnCode COBOL Name: DSM-RETURN-CODE - dsmErrTblAction COBOL Name:
   * DSM-ERR-TBL-ACTION - dsmErrTblName COBOL Name: DSM-ERR-TBL-NAME - dsmErrSectnName COBOL Name:
   * DSM-ERR-SECTN-NAME - dsmErrPgmName COBOL Name: DSM-ERR-PGM-NAME
   *
   * @throws CFException
   */
  @Override
  public FuncCd3PolsviMmiReadOutCtx funcCd3PolsviMmiRead(FuncCd3PolsviMmiReadInCtx methodIn)
      throws Exception {

    // *81***************************************************************
    // *81 4010-Func-cd3-polsvi-mmi-read                                *
    // *81 business function:read the table to retrive the records      *
    // *81***************************************************************
    // *82***************************************************************
    // *82 4010-func-cd3-polsvi-mmi-read                                *
    // *82 1. fetch records from pol_pln_mstr for given policy/plan,if  *
    // *82    record is not found in the cust_pol_pln_xref              *
    // *82***************************************************************
    // Added variable to get the program context in place.
    D5427polCtx programCtx = methodIn.getD5427polCtx();
    // Added variable to get the output context in place.
    FuncCd3PolsviMmiReadOutCtx methodOut = methodIn.getFuncCd3PolsviMmiReadOutCtx();
    //  cobolCode::SELECT T3.POL_NBR , T3.PLN_NBR , T3.CLSS_NBR , T3.COV_TYP_CD , MAX (
    // T1.NEW_OLD_SRVC_IND ) , MAX ( T1.OBLIG_ID ) , MAX ( T1.SHR_ARNG_CD ) , MAX ( T1.FUND_TYP_CD )
    // , MAX ( T1.PRDCT_KEY_CD ) , MAX ( T1.MBR_PRDCT_TYP_CD ) , MAX ( T1.NTFY_CRDC_EP_IND ) , MAX (
    // T1.ONC_POL_PRTCP_CD ) , MAX ( T1.EVD_BAS_DIALG_IND ) , MAX ( T1.REL_SRVC_IND ) , MAX (
    // T1.CORE_MED_PRR_AUTH_CD ) , MAX ( T1.BHV_HLTH_VEND_CD ) , MAX ( T2.GEN_TST_POL_PRTCP_CD ) ,
    // MAX ( T2.SEC_OPIN_VEND_CD ) , MAX ( CASE SVI_TBL_ORDR_NBR WHEN 1 THEN SVI_TBL_NBR END ) AS
    // SLOT_001 , MAX ( CASE SVI_TBL_ORDR_NBR WHEN 1 THEN SVI_EFF_DT END ) AS EFF_001 , MAX ( CASE
    // SVI_TBL_ORDR_NBR WHEN 1 THEN SVI_CANC_DT END ) AS CANC_001 , MAX ( CASE SVI_TBL_ORDR_NBR WHEN
    // 2 THEN SVI_TBL_NBR END ) AS SLOT_002 , MAX ( CASE SVI_TBL_ORDR_NBR WHEN 2 THEN SVI_EFF_DT END
    // ) AS EFF_002 , MAX ( CASE SVI_TBL_ORDR_NBR WHEN 2 THEN SVI_CANC_DT END ) AS CANC_002 , MAX (
    // CASE SVI_TBL_ORDR_NBR WHEN 3 THEN SVI_TBL_NBR END ) AS SLOT_003 , MAX ( CASE SVI_TBL_ORDR_NBR
    // WHEN 3 THEN SVI_EFF_DT END ) AS EFF_003 , MAX ( CASE SVI_TBL_ORDR_NBR WHEN 3 THEN SVI_CANC_DT
    // END ) AS CANC_003 , MAX ( CASE SVI_TBL_ORDR_NBR WHEN 4 THEN SVI_TBL_NBR END ) AS SLOT_004 ,
    // MAX ( CASE SVI_TBL_ORDR_NBR WHEN 4 THEN SVI_EFF_DT END ) AS EFF_004 , MAX ( CASE
    // SVI_TBL_ORDR_NBR WHEN 4 THEN SVI_CANC_DT END ) AS CANC_004 , MAX ( CASE SVI_TBL_ORDR_NBR WHEN
    // 5 THEN SVI_TBL_NBR END ) AS SLOT_005 , MAX ( CASE SVI_TBL_ORDR_NBR WHEN 5 THEN SVI_EFF_DT END
    // ) AS EFF_005 , MAX ( CASE SVI_TBL_ORDR_NBR WHEN 5 THEN SVI_CANC_DT END ) AS CANC_005 , MAX (
    // CASE SVI_TBL_ORDR_NBR WHEN 6 THEN SVI_TBL_NBR END ) AS SLOT_006 , MAX ( CASE SVI_TBL_ORDR_NBR
    // WHEN 6 THEN SVI_EFF_DT END ) AS EFF_006 , MAX ( CASE SVI_TBL_ORDR_NBR WHEN 6 THEN SVI_CANC_DT
    // END ) AS CANC_006 , MAX ( CASE SVI_TBL_ORDR_NBR WHEN 7 THEN SVI_TBL_NBR END ) AS SLOT_007 ,
    // MAX ( CASE SVI_TBL_ORDR_NBR WHEN 7 THEN SVI_EFF_DT END ) AS EFF_007 , MAX ( CASE
    // SVI_TBL_ORDR_NBR WHEN 7 THEN SVI_CANC_DT END ) AS CANC_007 , MAX ( CASE SVI_TBL_ORDR_NBR WHEN
    // 8 THEN SVI_TBL_NBR END ) AS SLOT_008 , MAX ( CASE SVI_TBL_ORDR_NBR WHEN 8 THEN SVI_EFF_DT END
    // ) AS EFF_008 , MAX ( CASE SVI_TBL_ORDR_NBR WHEN 8 THEN SVI_CANC_DT END ) AS CANC_008 , MAX (
    // CASE SVI_TBL_ORDR_NBR WHEN 9 THEN SVI_TBL_NBR END ) AS SLOT_009 , MAX ( CASE SVI_TBL_ORDR_NBR
    // WHEN 9 THEN SVI_EFF_DT END ) AS EFF_009 , MAX ( CASE SVI_TBL_ORDR_NBR WHEN 9 THEN SVI_CANC_DT
    // END ) AS CANC_009 , MAX ( CASE SVI_TBL_ORDR_NBR WHEN 10 THEN SVI_TBL_NBR END ) AS SLOT_010 ,
    // MAX ( CASE SVI_TBL_ORDR_NBR WHEN 10 THEN SVI_EFF_DT END ) AS EFF_010 , MAX ( CASE
    // SVI_TBL_ORDR_NBR WHEN 10 THEN SVI_CANC_DT END ) AS CANC_010 , MAX ( CASE SVI_TBL_ORDR_NBR
    // WHEN 11 THEN SVI_TBL_NBR END ) AS SLOT_011 , MAX ( CASE SVI_TBL_ORDR_NBR WHEN 11 THEN
    // SVI_EFF_DT END ) AS EFF_011 , MAX ( CASE SVI_TBL_ORDR_NBR WHEN 11 THEN SVI_CANC_DT END ) AS
    // CANC_011 , MAX ( CASE SVI_TBL_ORDR_NBR WHEN 12 THEN SVI_TBL_NBR END ) AS SLOT_012 , MAX (
    // CASE SVI_TBL_ORDR_NBR WHEN 12 THEN SVI_EFF_DT END ) AS EFF_012 , MAX ( CASE SVI_TBL_ORDR_NBR
    // WHEN 12 THEN SVI_CANC_DT END ) AS CANC_012 , MAX ( CASE SVI_TBL_ORDR_NBR WHEN 13 THEN
    // SVI_TBL_NBR END ) AS SLOT_013 , MAX ( CASE SVI_TBL_ORDR_NBR WHEN 13 THEN SVI_EFF_DT END ) AS
    // EFF_013 , MAX ( CASE SVI_TBL_ORDR_NBR WHEN 13 THEN SVI_CANC_DT END ) AS CANC_013 , MAX ( CASE
    // SVI_TBL_ORDR_NBR WHEN 14 THEN SVI_TBL_NBR END ) AS SLOT_014 , MAX ( CASE SVI_TBL_ORDR_NBR
    // WHEN 14 THEN SVI_EFF_DT END ) AS EFF_014 , MAX ( CASE SVI_TBL_ORDR_NBR WHEN 14 THEN
    // SVI_CANC_DT END ) AS CANC_014 , MAX ( CASE SVI_TBL_ORDR_NBR WHEN 15 THEN SVI_TBL_NBR END ) AS
    // SLOT_015 , MAX ( CASE SVI_TBL_ORDR_NBR WHEN 16 THEN SVI_TBL_NBR END ) AS SLOT_016 , MAX (
    // CASE SVI_TBL_ORDR_NBR WHEN 17 THEN SVI_TBL_NBR END ) AS SLOT_017 , MAX ( CASE
    // SVI_TBL_ORDR_NBR WHEN 18 THEN SVI_TBL_NBR END ) AS SLOT_018 , MAX ( CASE SVI_TBL_ORDR_NBR
    // WHEN 19 THEN SVI_TBL_NBR END ) AS SLOT_019 , MAX ( CASE SVI_TBL_ORDR_NBR WHEN 20 THEN
    // SVI_TBL_NBR END ) AS SLOT_020 FROM POL_PLN_MSTR T1 , POL_PLN_MSTR_ADDTL_INFO T2 ,
    // POL_PLN_MSTR_SVI_INFO T3 WHERE T3.POL_NBR = ? AND T3.PLN_NBR = ? AND T3.CLSS_NBR = ? AND
    // T3.COV_TYP_CD = ? AND T1.POL_NBR = ? AND T1.PLN_NBR = ? AND T1.CLSS_NBR = ? AND T1.COV_TYP_CD
    // = ? AND T2.POL_NBR = ? AND T2.PLN_NBR = ? AND T2.CLSS_NBR = ? AND T2.COV_TYP_CD = ? GROUP BY
    // T3.POL_NBR , T3.PLN_NBR , T3.CLSS_NBR , T3.COV_TYP_CD WITH UR
    d5427polRepository.selectPolPlnMstr2(
        methodOut.getDclpolPlnMstrAddtlInfo(),
        methodOut.getDclpolPlnMstrSviInfo(),
        methodOut.getDclpolPlnMstr(),
        programCtx.getSqlca(),
        methodOut.getSviTablesData());
    //  cobolCode::MOVE SQLCODE TO WS-SQLCODE DSM-SQLCODE
    methodOut.setSqlcode_Ws(methodOut.getSqlcode());
    methodOut.setDsmSqlcode(methodOut.getSqlcode());
    //  cobolCode::EVALUATE TRUE
    if (methodOut.isSqlcodeOk()) {
      //  cobolCode::PERFORM 4020-POPULATE-MMISVI-RET
      populateMmisviRet(programCtx); /*4020-POPULATE-MMISVI-RET SECTION*/
      if (programCtx.isProgramEnded()) {
        return methodOut;
      }
    } else if (methodOut.isSqlcodeNotFound()) {
      //  cobolCode::PERFORM 4100-FUNC-CD3-POLHDR-MMI-READ
      funcCd3PolhdrMmiRead(
          programCtx.getFuncCd3PolhdrMmiReadInCtx()); /*4100-FUNC-CD3-POLHDR-MMI-READ SECTION*/
      if (programCtx.isProgramEnded()) {
        return methodOut;
      }
    } else {
      //  cobolCode::SET DSM-DB2-ERROR TO TRUE
      methodOut.setDsmDb2ErrorTrue();

      //  cobolCode::MOVE 'SELECT' TO DSM-ERR-TBL-ACTION
      methodOut.setDsmErrTblAction(CONSTANTS.LITERAL_SELECT_B4_);
      //  cobolCode::MOVE 'POL_PLN_MSTR' TO DSM-ERR-TBL-NAME
      methodOut.setDsmErrTblName(CONSTANTS.LITERAL_POL_PLN_MSTR_B13_);
      //  cobolCode::MOVE '4010-FUNC-CD3-POLSVI-MMI-READ' TO DSM-ERR-SECTN-NAME
      methodOut.setDsmErrSectnName(CONSTANTS.LITERAL_109373508);
      //  cobolCode::MOVE 'D5427POL' TO DSM-ERR-PGM-NAME
      //  LITERAL_D5427POL = 'D5427POL'
      methodOut.setDsmErrPgmName(CONSTANTS.LITERAL_D5427POL);
      //  cobolCode::PERFORM 7777-MOVES-FOR-ERROR-LOG
      movesForErrorLog(programCtx.getMovesForErrorLogInCtx()); /*7777-MOVES-FOR-ERROR-LOG SECTION*/
      if (programCtx.isProgramEnded()) {
        return methodOut;
      }
    }

    return methodOut;
  }
  /**
   * populateMmisviRet This method is derived from COBOL Paragraph - 4020-POPULATE-MMISVI-RET
   * SECTION COBOL Cyclomatic complexity - 16 Input : None
   *
   * <p>Output : None
   *
   * @throws CFException
   */
  @Override
  public void populateMmisviRet(D5427polCtx programCtx) throws Exception {

    // *81***************************************************************
    // *81 4020-Populate-mmisvi-ret                                     *
    // *81 business function: populate the mmi return fields            *
    // *81***************************************************************
    // *82***************************************************************
    // *82 4020-populate-mmisvi-ret                                     *
    // *82 1. populate the mmi return fields                            *
    // *82***************************************************************
    //  cobolCode::PERFORM 4020-POPULATE-MMISVI-RET-SPLIT0
    populateMmisviRetSplit0(
        programCtx.getPopulateMmisviRetSplit0InCtx()); /*4020-POPULATE-MMISVI-RET-SPLIT0*/
    //  cobolCode::PERFORM 4020-POPULATE-MMISVI-RET-SPLIT1
    populateMmisviRetSplit1(
        programCtx.getPopulateMmisviRetSplit1InCtx()); /*4020-POPULATE-MMISVI-RET-SPLIT1*/
  }
  /**
   * populateMmisviRetSplit0 This method is derived from COBOL Paragraph -
   * 4020-POPULATE-MMISVI-RET-SPLIT0 COBOL Cyclomatic complexity - 1 Input :
   *
   * <p>- xrfObligId COBOL Name: XRF-OBLIG-ID - mmiObligId COBOL Name: MMI-OBLIG-ID - xrfShrArngCd
   * COBOL Name: XRF-SHR-ARNG-CD - mmiShrArngCd COBOL Name: MMI-SHR-ARNG-CD - mmiNewOldSrvcInd COBOL
   * Name: MMI-NEW-OLD-SRVC-IND - slot001 COBOL Name: WS-SLOT-001 - eff001 COBOL Name: WS-EFF-001 -
   * canc001 COBOL Name: WS-CANC-001 - slot002 COBOL Name: WS-SLOT-002 - eff002 COBOL Name:
   * WS-EFF-002 - canc002 COBOL Name: WS-CANC-002 - slot003 COBOL Name: WS-SLOT-003 - eff003 COBOL
   * Name: WS-EFF-003 - canc003 COBOL Name: WS-CANC-003 - slot004 COBOL Name: WS-SLOT-004 - eff004
   * COBOL Name: WS-EFF-004 - canc004 COBOL Name: WS-CANC-004 - slot005 COBOL Name: WS-SLOT-005 -
   * eff005 COBOL Name: WS-EFF-005 - canc005 COBOL Name: WS-CANC-005 - slot006 COBOL Name:
   * WS-SLOT-006 - eff006 COBOL Name: WS-EFF-006 - canc006 COBOL Name: WS-CANC-006 - slot007 COBOL
   * Name: WS-SLOT-007 - eff007 COBOL Name: WS-EFF-007 - canc007 COBOL Name: WS-CANC-007 - slot008
   * COBOL Name: WS-SLOT-008 - eff008 COBOL Name: WS-EFF-008 - canc008 COBOL Name: WS-CANC-008 -
   * slot009 COBOL Name: WS-SLOT-009 - eff009 COBOL Name: WS-EFF-009 - canc009 COBOL Name:
   * WS-CANC-009 - slot010 COBOL Name: WS-SLOT-010 - eff010 COBOL Name: WS-EFF-010 - canc010 COBOL
   * Name: WS-CANC-010 - slot011 COBOL Name: WS-SLOT-011 - eff011 COBOL Name: WS-EFF-011 - canc011
   * COBOL Name: WS-CANC-011 - slot012 COBOL Name: WS-SLOT-012 - eff012 COBOL Name: WS-EFF-012 -
   * canc012 COBOL Name: WS-CANC-012 - slot013 COBOL Name: WS-SLOT-013 - eff013 COBOL Name:
   * WS-EFF-013 - canc013 COBOL Name: WS-CANC-013 - slot014 COBOL Name: WS-SLOT-014 - eff014 COBOL
   * Name: WS-EFF-014 - canc014 COBOL Name: WS-CANC-014 - slot015 COBOL Name: WS-SLOT-015 - slot016
   * COBOL Name: WS-SLOT-016 - slot017 COBOL Name: WS-SLOT-017 - slot018 COBOL Name: WS-SLOT-018 -
   * slot019 COBOL Name: WS-SLOT-019 - slot020 COBOL Name: WS-SLOT-020
   *
   * <p>Output :
   *
   * <p>- pol3RetObligId COBOL Name: POL3-RET-OBLIG-ID - mmiObligId COBOL Name: MMI-OBLIG-ID -
   * pol3RetShrArngCd COBOL Name: POL3-RET-SHR-ARNG-CD - mmiShrArngCd COBOL Name: MMI-SHR-ARNG-CD -
   * pol3RetNewOldSrvcInd COBOL Name: POL3-RET-NEW-OLD-SRVC-IND - mmiNewOldSrvcInd COBOL Name:
   * MMI-NEW-OLD-SRVC-IND - pol3RetSlot001 COBOL Name: POL3-RET-SLOT-001 - slot001 COBOL Name:
   * WS-SLOT-001 - pol3RetEff001 COBOL Name: POL3-RET-EFF-001 - eff001 COBOL Name: WS-EFF-001 -
   * pol3RetCanc001 COBOL Name: POL3-RET-CANC-001 - canc001 COBOL Name: WS-CANC-001 - pol3RetSlot002
   * COBOL Name: POL3-RET-SLOT-002 - slot002 COBOL Name: WS-SLOT-002 - pol3RetEff002 COBOL Name:
   * POL3-RET-EFF-002 - eff002 COBOL Name: WS-EFF-002 - pol3RetCanc002 COBOL Name: POL3-RET-CANC-002
   * - canc002 COBOL Name: WS-CANC-002 - pol3RetSlot003 COBOL Name: POL3-RET-SLOT-003 - slot003
   * COBOL Name: WS-SLOT-003 - pol3RetEff003 COBOL Name: POL3-RET-EFF-003 - eff003 COBOL Name:
   * WS-EFF-003 - pol3RetCanc003 COBOL Name: POL3-RET-CANC-003 - canc003 COBOL Name: WS-CANC-003 -
   * pol3RetSlot004 COBOL Name: POL3-RET-SLOT-004 - slot004 COBOL Name: WS-SLOT-004 - pol3RetEff004
   * COBOL Name: POL3-RET-EFF-004 - eff004 COBOL Name: WS-EFF-004 - pol3RetCanc004 COBOL Name:
   * POL3-RET-CANC-004 - canc004 COBOL Name: WS-CANC-004 - pol3RetSlot005 COBOL Name:
   * POL3-RET-SLOT-005 - slot005 COBOL Name: WS-SLOT-005 - pol3RetEff005 COBOL Name:
   * POL3-RET-EFF-005 - eff005 COBOL Name: WS-EFF-005 - pol3RetCanc005 COBOL Name: POL3-RET-CANC-005
   * - canc005 COBOL Name: WS-CANC-005 - pol3RetSlot006 COBOL Name: POL3-RET-SLOT-006 - slot006
   * COBOL Name: WS-SLOT-006 - pol3RetEff006 COBOL Name: POL3-RET-EFF-006 - eff006 COBOL Name:
   * WS-EFF-006 - pol3RetCanc006 COBOL Name: POL3-RET-CANC-006 - canc006 COBOL Name: WS-CANC-006 -
   * pol3RetSlot007 COBOL Name: POL3-RET-SLOT-007 - slot007 COBOL Name: WS-SLOT-007 - pol3RetEff007
   * COBOL Name: POL3-RET-EFF-007 - eff007 COBOL Name: WS-EFF-007 - pol3RetCanc007 COBOL Name:
   * POL3-RET-CANC-007 - canc007 COBOL Name: WS-CANC-007 - pol3RetSlot008 COBOL Name:
   * POL3-RET-SLOT-008 - slot008 COBOL Name: WS-SLOT-008 - pol3RetEff008 COBOL Name:
   * POL3-RET-EFF-008 - eff008 COBOL Name: WS-EFF-008 - pol3RetCanc008 COBOL Name: POL3-RET-CANC-008
   * - canc008 COBOL Name: WS-CANC-008 - pol3RetSlot009 COBOL Name: POL3-RET-SLOT-009 - slot009
   * COBOL Name: WS-SLOT-009 - pol3RetEff009 COBOL Name: POL3-RET-EFF-009 - eff009 COBOL Name:
   * WS-EFF-009 - pol3RetCanc009 COBOL Name: POL3-RET-CANC-009 - canc009 COBOL Name: WS-CANC-009 -
   * pol3RetSlot010 COBOL Name: POL3-RET-SLOT-010 - slot010 COBOL Name: WS-SLOT-010 - pol3RetEff010
   * COBOL Name: POL3-RET-EFF-010 - eff010 COBOL Name: WS-EFF-010 - pol3RetCanc010 COBOL Name:
   * POL3-RET-CANC-010 - canc010 COBOL Name: WS-CANC-010 - pol3RetSlot011 COBOL Name:
   * POL3-RET-SLOT-011 - slot011 COBOL Name: WS-SLOT-011 - pol3RetEff011 COBOL Name:
   * POL3-RET-EFF-011 - eff011 COBOL Name: WS-EFF-011 - pol3RetCanc011 COBOL Name: POL3-RET-CANC-011
   * - canc011 COBOL Name: WS-CANC-011 - pol3RetSlot012 COBOL Name: POL3-RET-SLOT-012 - slot012
   * COBOL Name: WS-SLOT-012 - pol3RetEff012 COBOL Name: POL3-RET-EFF-012 - eff012 COBOL Name:
   * WS-EFF-012 - pol3RetCanc012 COBOL Name: POL3-RET-CANC-012 - canc012 COBOL Name: WS-CANC-012 -
   * pol3RetSlot013 COBOL Name: POL3-RET-SLOT-013 - slot013 COBOL Name: WS-SLOT-013 - pol3RetEff013
   * COBOL Name: POL3-RET-EFF-013 - eff013 COBOL Name: WS-EFF-013 - pol3RetCanc013 COBOL Name:
   * POL3-RET-CANC-013 - canc013 COBOL Name: WS-CANC-013 - pol3RetSlot014 COBOL Name:
   * POL3-RET-SLOT-014 - slot014 COBOL Name: WS-SLOT-014 - pol3RetEff014 COBOL Name:
   * POL3-RET-EFF-014 - eff014 COBOL Name: WS-EFF-014 - pol3RetCanc014 COBOL Name: POL3-RET-CANC-014
   * - canc014 COBOL Name: WS-CANC-014 - pol3RetSviTblPriNbr COBOL Name: POL3-RET-SVI-TBL-PRI-NBR -
   * slot015 COBOL Name: WS-SLOT-015 - pol3RetSlotTblId COBOL Name: POL3-RET-SLOT-TBL-ID - slot016
   * COBOL Name: WS-SLOT-016 - pol3RetSviTblTerNbr COBOL Name: POL3-RET-SVI-TBL-TER-NBR - slot017
   * COBOL Name: WS-SLOT-017 - pol3RetSlot018 COBOL Name: POL3-RET-SLOT-018 - slot018 COBOL Name:
   * WS-SLOT-018 - pol3RetSlot019 COBOL Name: POL3-RET-SLOT-019 - slot019 COBOL Name: WS-SLOT-019 -
   * pol3RetSlot020 COBOL Name: POL3-RET-SLOT-020 - slot020 COBOL Name: WS-SLOT-020
   *
   * @throws CFException
   */
  @Override
  public PopulateMmisviRetSplit0OutCtx populateMmisviRetSplit0(
      PopulateMmisviRetSplit0InCtx methodIn) throws Exception {
    // Added variable to get the program context in place.
    D5427polCtx programCtx = methodIn.getD5427polCtx();
    // Added variable to get the output context in place.
    PopulateMmisviRetSplit0OutCtx methodOut = methodIn.getPopulateMmisviRetSplit0OutCtx();
    //  cobolCode::IF XRF-OBLIG-ID = SPACES OR LOW-VALUES OR HIGH-VALUES
    if ((allSpaces(methodIn.getXrfObligId()))
        || (checkLowValue(methodIn.getXrfObligId()))
        || (isHighValue(methodIn.getXrfObligId()))) {
      //  cobolCode::IF MMI-OBLIG-ID = SPACES OR LOW-VALUES OR HIGH-VALUES
      if ((allSpaces(methodOut.getMmiObligId()))
          || (checkLowValue(methodOut.getMmiObligId()))
          || (isHighValue(methodOut.getMmiObligId()))) {
        //  cobolCode::MOVE SPACES TO POL3-RET-OBLIG-ID
        methodOut.setPol3RetObligId(CONSTANTS.SPACE_2);
      }
      //  cobolCode::ELSE
      else {
        //  cobolCode::MOVE MMI-OBLIG-ID TO POL3-RET-OBLIG-ID
        methodOut.setPol3RetObligId(methodOut.getMmiObligId());
      }
    }
    //  cobolCode::IF XRF-SHR-ARNG-CD = SPACES OR LOW-VALUES OR HIGH-VALUES
    if ((allSpaces(methodIn.getXrfShrArngCd()))
        || (checkLowValue(methodIn.getXrfShrArngCd()))
        || (isHighValue(methodIn.getXrfShrArngCd()))) {
      //  cobolCode::IF MMI-SHR-ARNG-CD = SPACES OR LOW-VALUES OR HIGH-VALUES
      if ((allSpaces(methodOut.getMmiShrArngCd()))
          || (checkLowValue(methodOut.getMmiShrArngCd()))
          || (isHighValue(methodOut.getMmiShrArngCd()))) {
        //  cobolCode::MOVE SPACES TO POL3-RET-SHR-ARNG-CD
        methodOut.setPol3RetShrArngCd(CONSTANTS.SPACE_2);
      }
      //  cobolCode::ELSE
      else {
        //  cobolCode::MOVE MMI-SHR-ARNG-CD TO POL3-RET-SHR-ARNG-CD
        methodOut.setPol3RetShrArngCd(methodOut.getMmiShrArngCd());
      }
    }
    //  cobolCode::MOVE MMI-NEW-OLD-SRVC-IND TO POL3-RET-NEW-OLD-SRVC-IND
    methodOut.setPol3RetNewOldSrvcInd(methodOut.getMmiNewOldSrvcInd());
    //  cobolCode::MOVE WS-SLOT-001 TO POL3-RET-SLOT-001
    methodOut.setPol3RetSlot001(methodOut.getSlot001());
    //  cobolCode::MOVE WS-EFF-001 TO POL3-RET-EFF-001
    methodOut.setPol3RetEff001(methodOut.getEff001());
    //  cobolCode::MOVE WS-CANC-001 TO POL3-RET-CANC-001
    methodOut.setPol3RetCanc001(methodOut.getCanc001());
    //  cobolCode::MOVE WS-SLOT-002 TO POL3-RET-SLOT-002
    methodOut.setPol3RetSlot002(methodOut.getSlot002());
    //  cobolCode::MOVE WS-EFF-002 TO POL3-RET-EFF-002
    methodOut.setPol3RetEff002(methodOut.getEff002());
    //  cobolCode::MOVE WS-CANC-002 TO POL3-RET-CANC-002
    methodOut.setPol3RetCanc002(methodOut.getCanc002());
    //  cobolCode::MOVE WS-SLOT-003 TO POL3-RET-SLOT-003
    methodOut.setPol3RetSlot003(methodOut.getSlot003());
    //  cobolCode::MOVE WS-EFF-003 TO POL3-RET-EFF-003
    methodOut.setPol3RetEff003(methodOut.getEff003());
    //  cobolCode::MOVE WS-CANC-003 TO POL3-RET-CANC-003
    methodOut.setPol3RetCanc003(methodOut.getCanc003());
    //  cobolCode::MOVE WS-SLOT-004 TO POL3-RET-SLOT-004
    methodOut.setPol3RetSlot004(methodOut.getSlot004());
    //  cobolCode::MOVE WS-EFF-004 TO POL3-RET-EFF-004
    methodOut.setPol3RetEff004(methodOut.getEff004());
    //  cobolCode::MOVE WS-CANC-004 TO POL3-RET-CANC-004
    methodOut.setPol3RetCanc004(methodOut.getCanc004());
    //  cobolCode::MOVE WS-SLOT-005 TO POL3-RET-SLOT-005
    methodOut.setPol3RetSlot005(methodOut.getSlot005());
    //  cobolCode::MOVE WS-EFF-005 TO POL3-RET-EFF-005
    methodOut.setPol3RetEff005(methodOut.getEff005());
    //  cobolCode::MOVE WS-CANC-005 TO POL3-RET-CANC-005
    methodOut.setPol3RetCanc005(methodOut.getCanc005());
    //  cobolCode::MOVE WS-SLOT-006 TO POL3-RET-SLOT-006
    methodOut.setPol3RetSlot006(methodOut.getSlot006());
    //  cobolCode::MOVE WS-EFF-006 TO POL3-RET-EFF-006
    methodOut.setPol3RetEff006(methodOut.getEff006());
    //  cobolCode::MOVE WS-CANC-006 TO POL3-RET-CANC-006
    methodOut.setPol3RetCanc006(methodOut.getCanc006());
    //  cobolCode::MOVE WS-SLOT-007 TO POL3-RET-SLOT-007
    methodOut.setPol3RetSlot007(methodOut.getSlot007());
    //  cobolCode::MOVE WS-EFF-007 TO POL3-RET-EFF-007
    methodOut.setPol3RetEff007(methodOut.getEff007());
    //  cobolCode::MOVE WS-CANC-007 TO POL3-RET-CANC-007
    methodOut.setPol3RetCanc007(methodOut.getCanc007());
    //  cobolCode::MOVE WS-SLOT-008 TO POL3-RET-SLOT-008
    methodOut.setPol3RetSlot008(methodOut.getSlot008());
    //  cobolCode::MOVE WS-EFF-008 TO POL3-RET-EFF-008
    methodOut.setPol3RetEff008(methodOut.getEff008());
    //  cobolCode::MOVE WS-CANC-008 TO POL3-RET-CANC-008
    methodOut.setPol3RetCanc008(methodOut.getCanc008());
    //  cobolCode::MOVE WS-SLOT-009 TO POL3-RET-SLOT-009
    methodOut.setPol3RetSlot009(methodOut.getSlot009());
    //  cobolCode::MOVE WS-EFF-009 TO POL3-RET-EFF-009
    methodOut.setPol3RetEff009(methodOut.getEff009());
    //  cobolCode::MOVE WS-CANC-009 TO POL3-RET-CANC-009
    methodOut.setPol3RetCanc009(methodOut.getCanc009());
    //  cobolCode::MOVE WS-SLOT-010 TO POL3-RET-SLOT-010
    methodOut.setPol3RetSlot010(methodOut.getSlot010());
    //  cobolCode::MOVE WS-EFF-010 TO POL3-RET-EFF-010
    methodOut.setPol3RetEff010(methodOut.getEff010());
    //  cobolCode::MOVE WS-CANC-010 TO POL3-RET-CANC-010
    methodOut.setPol3RetCanc010(methodOut.getCanc010());
    //  cobolCode::MOVE WS-SLOT-011 TO POL3-RET-SLOT-011
    methodOut.setPol3RetSlot011(methodOut.getSlot011());
    //  cobolCode::MOVE WS-EFF-011 TO POL3-RET-EFF-011
    methodOut.setPol3RetEff011(methodOut.getEff011());
    //  cobolCode::MOVE WS-CANC-011 TO POL3-RET-CANC-011
    methodOut.setPol3RetCanc011(methodOut.getCanc011());
    //  cobolCode::MOVE WS-SLOT-012 TO POL3-RET-SLOT-012
    methodOut.setPol3RetSlot012(methodOut.getSlot012());
    //  cobolCode::MOVE WS-EFF-012 TO POL3-RET-EFF-012
    methodOut.setPol3RetEff012(methodOut.getEff012());
    //  cobolCode::MOVE WS-CANC-012 TO POL3-RET-CANC-012
    methodOut.setPol3RetCanc012(methodOut.getCanc012());
    //  cobolCode::MOVE WS-SLOT-013 TO POL3-RET-SLOT-013
    methodOut.setPol3RetSlot013(methodOut.getSlot013());
    //  cobolCode::MOVE WS-EFF-013 TO POL3-RET-EFF-013
    methodOut.setPol3RetEff013(methodOut.getEff013());
    //  cobolCode::MOVE WS-CANC-013 TO POL3-RET-CANC-013
    methodOut.setPol3RetCanc013(methodOut.getCanc013());
    //  cobolCode::MOVE WS-SLOT-014 TO POL3-RET-SLOT-014
    methodOut.setPol3RetSlot014(methodOut.getSlot014());
    //  cobolCode::MOVE WS-EFF-014 TO POL3-RET-EFF-014
    methodOut.setPol3RetEff014(methodOut.getEff014());
    //  cobolCode::MOVE WS-CANC-014 TO POL3-RET-CANC-014
    methodOut.setPol3RetCanc014(methodOut.getCanc014());
    //  cobolCode::MOVE WS-SLOT-015 TO POL3-RET-SVI-TBL-PRI-NBR
    methodOut.setPol3RetSviTblPriNbr(methodOut.getSlot015());
    //  cobolCode::MOVE WS-SLOT-016 TO POL3-RET-SLOT-TBL-ID
    methodOut.setPol3RetSlotTblId(methodOut.getSlot016());
    //  cobolCode::MOVE WS-SLOT-017 TO POL3-RET-SVI-TBL-TER-NBR
    methodOut.setPol3RetSviTblTerNbr(methodOut.getSlot017());
    //  cobolCode::MOVE WS-SLOT-018 TO POL3-RET-SLOT-018
    methodOut.setPol3RetSlot018(methodOut.getSlot018());
    //  cobolCode::MOVE WS-SLOT-019 TO POL3-RET-SLOT-019
    methodOut.setPol3RetSlot019(methodOut.getSlot019());
    //  cobolCode::MOVE WS-SLOT-020 TO POL3-RET-SLOT-020
    methodOut.setPol3RetSlot020(methodOut.getSlot020());

    return methodOut;
  }
  /**
   * populateMmisviRetSplit1 This method is derived from COBOL Paragraph -
   * 4020-POPULATE-MMISVI-RET-SPLIT1 COBOL Cyclomatic complexity - 1 Input :
   *
   * <p>- mmiFundTypCd COBOL Name: MMI-FUND-TYP-CD - mmiPrdctKeyCd COBOL Name: MMI-PRDCT-KEY-CD -
   * mmiMbrPrdctTypCd COBOL Name: MMI-MBR-PRDCT-TYP-CD - mmiNtfyCrdcEpInd COBOL Name:
   * MMI-NTFY-CRDC-EP-IND - mmiOncPolPrtcpCd COBOL Name: MMI-ONC-POL-PRTCP-CD - mmaGenTstPolPrtcpCd
   * COBOL Name: MMA-GEN-TST-POL-PRTCP-CD - mmaSecOpinVendCd COBOL Name: MMA-SEC-OPIN-VEND-CD -
   * pol3EvdBasDialgInd COBOL Name: POL3-EVD-BAS-DIALG-IND - mmiEvdBasDialgInd COBOL Name:
   * MMI-EVD-BAS-DIALG-IND - mmiRelSrvcInd COBOL Name: MMI-REL-SRVC-IND - pol3CoreMedPrrAuthCd COBOL
   * Name: POL3-CORE-MED-PRR-AUTH-CD - mmiCoreMedPrrAuthCd COBOL Name: MMI-CORE-MED-PRR-AUTH-CD -
   * mmiBhvHlthVendCd COBOL Name: MMI-BHV-HLTH-VEND-CD
   *
   * <p>Output :
   *
   * <p>- pol3RetFundTypCd COBOL Name: POL3-RET-FUND-TYP-CD - mmiFundTypCd COBOL Name:
   * MMI-FUND-TYP-CD - pol3RetPrdctKeyCd COBOL Name: POL3-RET-PRDCT-KEY-CD - mmiPrdctKeyCd COBOL
   * Name: MMI-PRDCT-KEY-CD - pol3RetMbrPrdctTypCd COBOL Name: POL3-RET-MBR-PRDCT-TYP-CD -
   * mmiMbrPrdctTypCd COBOL Name: MMI-MBR-PRDCT-TYP-CD - pol3NtfyCrdcEpInd COBOL Name:
   * POL3-NTFY-CRDC-EP-IND - mmiNtfyCrdcEpInd COBOL Name: MMI-NTFY-CRDC-EP-IND - pol3OncPolPrtcpCd
   * COBOL Name: POL3-ONC-POL-PRTCP-CD - mmiOncPolPrtcpCd COBOL Name: MMI-ONC-POL-PRTCP-CD -
   * pol3GenPolPrtcpCd COBOL Name: POL3-GEN-POL-PRTCP-CD - mmaGenTstPolPrtcpCd COBOL Name:
   * MMA-GEN-TST-POL-PRTCP-CD - pol3SecOpinVendCd COBOL Name: POL3-SEC-OPIN-VEND-CD -
   * mmaSecOpinVendCd COBOL Name: MMA-SEC-OPIN-VEND-CD - pol3EvdBasDialgInd COBOL Name:
   * POL3-EVD-BAS-DIALG-IND - mmiEvdBasDialgInd COBOL Name: MMI-EVD-BAS-DIALG-IND - pol3RelSrvcInd
   * COBOL Name: POL3-REL-SRVC-IND - mmiRelSrvcInd COBOL Name: MMI-REL-SRVC-IND -
   * pol3CoreMedPrrAuthCd COBOL Name: POL3-CORE-MED-PRR-AUTH-CD - mmiCoreMedPrrAuthCd COBOL Name:
   * MMI-CORE-MED-PRR-AUTH-CD - pol3RetBhvHlthVendCd COBOL Name: POL3-RET-BHV-HLTH-VEND-CD -
   * mmiBhvHlthVendCd COBOL Name: MMI-BHV-HLTH-VEND-CD
   *
   * @throws CFException
   */
  @Override
  public PopulateMmisviRetSplit1OutCtx populateMmisviRetSplit1(
      PopulateMmisviRetSplit1InCtx methodIn) throws Exception {
    // Added variable to get the program context in place.
    D5427polCtx programCtx = methodIn.getD5427polCtx();
    // Added variable to get the output context in place.
    PopulateMmisviRetSplit1OutCtx methodOut = methodIn.getPopulateMmisviRetSplit1OutCtx();
    //  cobolCode::MOVE MMI-FUND-TYP-CD TO POL3-RET-FUND-TYP-CD
    methodOut.setPol3RetFundTypCd(methodOut.getMmiFundTypCd());
    //  cobolCode::MOVE MMI-PRDCT-KEY-CD TO POL3-RET-PRDCT-KEY-CD
    methodOut.setPol3RetPrdctKeyCd(methodOut.getMmiPrdctKeyCd());
    //  cobolCode::MOVE MMI-MBR-PRDCT-TYP-CD TO POL3-RET-MBR-PRDCT-TYP-CD
    methodOut.setPol3RetMbrPrdctTypCd(methodOut.getMmiMbrPrdctTypCd());
    //  cobolCode::MOVE MMI-NTFY-CRDC-EP-IND TO POL3-NTFY-CRDC-EP-IND
    methodOut.setPol3NtfyCrdcEpInd(methodOut.getMmiNtfyCrdcEpInd());
    //  cobolCode::MOVE MMI-ONC-POL-PRTCP-CD TO POL3-ONC-POL-PRTCP-CD
    methodOut.setPol3OncPolPrtcpCd(methodOut.getMmiOncPolPrtcpCd());
    //  cobolCode::MOVE MMA-GEN-TST-POL-PRTCP-CD TO POL3-GEN-POL-PRTCP-CD
    methodOut.setPol3GenPolPrtcpCd(methodOut.getMmaGenTstPolPrtcpCd());
    //  cobolCode::MOVE MMA-SEC-OPIN-VEND-CD TO POL3-SEC-OPIN-VEND-CD
    methodOut.setPol3SecOpinVendCd(methodOut.getMmaSecOpinVendCd());
    //  cobolCode::IF POL3-EVD-BAS-DIALG-IND > SPACE
    //  cobolCode::ELSE
    if ((isLessOrEqualSpaces(methodOut.getPol3EvdBasDialgInd()))) {
      //  cobolCode::MOVE MMI-EVD-BAS-DIALG-IND TO POL3-EVD-BAS-DIALG-IND
      methodOut.setPol3EvdBasDialgInd(methodOut.getMmiEvdBasDialgInd());
    }
    //  cobolCode::MOVE MMI-REL-SRVC-IND TO POL3-REL-SRVC-IND
    methodOut.setPol3RelSrvcInd(methodOut.getMmiRelSrvcInd());
    //  cobolCode::IF POL3-CORE-MED-PRR-AUTH-CD > SPACE
    //  cobolCode::ELSE
    if ((isLessOrEqualSpaces(methodOut.getPol3CoreMedPrrAuthCd()))) {
      //  cobolCode::IF MMI-CORE-MED-PRR-AUTH-CD > SPACE
      if ((isGreaterThanSpaces(methodOut.getMmiCoreMedPrrAuthCd()))) {
        //  cobolCode::MOVE MMI-CORE-MED-PRR-AUTH-CD TO POL3-CORE-MED-PRR-AUTH-CD
        methodOut.setPol3CoreMedPrrAuthCd(methodOut.getMmiCoreMedPrrAuthCd());
      }
      //  cobolCode::ELSE
      else {
        //  cobolCode::MOVE SPACE TO POL3-CORE-MED-PRR-AUTH-CD
        methodOut.setPol3CoreMedPrrAuthCd(CONSTANTS.SPACE);
      }
    }
    //  cobolCode::MOVE MMI-BHV-HLTH-VEND-CD TO POL3-RET-BHV-HLTH-VEND-CD
    methodOut.setPol3RetBhvHlthVendCd(methodOut.getMmiBhvHlthVendCd());

    return methodOut;
  }
  /**
   * funcCd3PolhdrMmiRead This method is derived from COBOL Paragraph -
   * 4100-FUNC-CD3-POLHDR-MMI-READ SECTION COBOL Cyclomatic complexity - 5 Input :
   *
   * <p>- sqlcode COBOL Name: SQLCODE
   *
   * <p>Output :
   *
   * <p>- sqlcode_Ws COBOL Name: WS-SQLCODE - dsmSqlcode COBOL Name: DSM-SQLCODE - sqlcode COBOL
   * Name: SQLCODE - dsmReturnCode COBOL Name: DSM-RETURN-CODE - dsmErrTblAction COBOL Name:
   * DSM-ERR-TBL-ACTION - dsmErrTblName COBOL Name: DSM-ERR-TBL-NAME - dsmErrSectnName COBOL Name:
   * DSM-ERR-SECTN-NAME - dsmErrPgmName COBOL Name: DSM-ERR-PGM-NAME
   *
   * @throws CFException
   */
  @Override
  public FuncCd3PolhdrMmiReadOutCtx funcCd3PolhdrMmiRead(FuncCd3PolhdrMmiReadInCtx methodIn)
      throws Exception {

    // *81***************************************************************
    // *81 4100-Func-cd3-polhdr-mmi-read                                *
    // *81 business function:read the table to retrive the records      *
    // *81***************************************************************
    // *82***************************************************************
    // *82 4100-func-cd3-polhdr-mmi-read                                *
    // *82 1. fetch records from pol_pln_mstr for given policy/plan,if  *
    // *82    record is not found in the cust_pol_pln_xref              *
    // *82***************************************************************
    // Added variable to get the program context in place.
    D5427polCtx programCtx = methodIn.getD5427polCtx();
    // Added variable to get the output context in place.
    FuncCd3PolhdrMmiReadOutCtx methodOut = methodIn.getFuncCd3PolhdrMmiReadOutCtx();
    //  cobolCode::SELECT T1.NEW_OLD_SRVC_IND , T1.OBLIG_ID , T1.SHR_ARNG_CD , T1.FUND_TYP_CD ,
    // T1.PRDCT_KEY_CD , T1.MBR_PRDCT_TYP_CD , T1.NTFY_CRDC_EP_IND , T1.ONC_POL_PRTCP_CD ,
    // T1.EVD_BAS_DIALG_IND , T1.REL_SRVC_IND , T1.CORE_MED_PRR_AUTH_CD , T2.GEN_TST_POL_PRTCP_CD ,
    // T2.SEC_OPIN_VEND_CD FROM POL_PLN_MSTR T1 , POL_PLN_MSTR_ADDTL_INFO T2 WHERE T1.POL_NBR = ?
    // AND T1.PLN_NBR = ? AND T1.CLSS_NBR = ? AND T1.COV_TYP_CD = ? AND T1.POL_NBR = T2.POL_NBR AND
    // T1.PLN_NBR = T2.PLN_NBR AND T1.CLSS_NBR = T2.CLSS_NBR AND T1.COV_TYP_CD = T2.COV_TYP_CD
    d5427polRepository.selectPolPlnMstr3(
        methodOut.getDclpolPlnMstrAddtlInfo(), methodOut.getDclpolPlnMstr(), programCtx.getSqlca());
    //  cobolCode::MOVE SQLCODE TO WS-SQLCODE DSM-SQLCODE
    methodOut.setSqlcode_Ws(methodOut.getSqlcode());
    methodOut.setDsmSqlcode(methodOut.getSqlcode());
    //  cobolCode::EVALUATE TRUE
    if (methodOut.isSqlcodeOk()) {
      //  cobolCode::PERFORM 4200-POPULATE-MMI-RET
      populateMmiRet4200(programCtx.getPopulateMmiRet4200InCtx()); /*4200-POPULATE-MMI-RET SECTION*/
      if (programCtx.isProgramEnded()) {
        return methodOut;
      }
    } else if (methodOut.isSqlcodeNotFound()) {
      //  cobolCode::SET DSM-ENTRY-NOT-FND-INQ TO TRUE
      methodOut.setDsmEntryNotFndInqTrue();

      //  cobolCode::MOVE 'SELECT' TO DSM-ERR-TBL-ACTION
      methodOut.setDsmErrTblAction(CONSTANTS.LITERAL_SELECT_B4_);
      //  cobolCode::MOVE 'POL_PLN_MSTR' TO DSM-ERR-TBL-NAME
      methodOut.setDsmErrTblName(CONSTANTS.LITERAL_POL_PLN_MSTR_B13_);
      //  cobolCode::MOVE '4100-FUNC-CD3-POLHDR-MMI-READ' TO DSM-ERR-SECTN-NAME
      methodOut.setDsmErrSectnName(CONSTANTS.LITERAL_2001888950);
      //  cobolCode::MOVE 'D5427POL' TO DSM-ERR-PGM-NAME
      //  LITERAL_D5427POL = 'D5427POL'
      methodOut.setDsmErrPgmName(CONSTANTS.LITERAL_D5427POL);
      //  cobolCode::PERFORM 7777-MOVES-FOR-ERROR-LOG
      movesForErrorLog(programCtx.getMovesForErrorLogInCtx()); /*7777-MOVES-FOR-ERROR-LOG SECTION*/
      if (programCtx.isProgramEnded()) {
        return methodOut;
      }
    } else {
      //  cobolCode::SET DSM-DB2-ERROR TO TRUE
      methodOut.setDsmDb2ErrorTrue();

      //  cobolCode::MOVE 'SELECT' TO DSM-ERR-TBL-ACTION
      methodOut.setDsmErrTblAction(CONSTANTS.LITERAL_SELECT_B4_);
      //  cobolCode::MOVE 'POL_PLN_MSTR' TO DSM-ERR-TBL-NAME
      methodOut.setDsmErrTblName(CONSTANTS.LITERAL_POL_PLN_MSTR_B13_);
      //  cobolCode::MOVE '4100-FUNC-CD3-POLHDR-MMI-READ' TO DSM-ERR-SECTN-NAME
      methodOut.setDsmErrSectnName(CONSTANTS.LITERAL_2001888950);
      //  cobolCode::MOVE 'D5427POL' TO DSM-ERR-PGM-NAME
      //  LITERAL_D5427POL = 'D5427POL'
      methodOut.setDsmErrPgmName(CONSTANTS.LITERAL_D5427POL);
      //  cobolCode::PERFORM 7777-MOVES-FOR-ERROR-LOG
      movesForErrorLog(programCtx.getMovesForErrorLogInCtx()); /*7777-MOVES-FOR-ERROR-LOG SECTION*/
      if (programCtx.isProgramEnded()) {
        return methodOut;
      }
    }

    return methodOut;
  }
  /**
   * populateMmiRet4200 This method is derived from COBOL Paragraph - 4200-POPULATE-MMI-RET SECTION
   * COBOL Cyclomatic complexity - 16 Input :
   *
   * <p>- xrfObligId COBOL Name: XRF-OBLIG-ID - mmiObligId COBOL Name: MMI-OBLIG-ID - xrfShrArngCd
   * COBOL Name: XRF-SHR-ARNG-CD - mmiShrArngCd COBOL Name: MMI-SHR-ARNG-CD - mmiNewOldSrvcInd COBOL
   * Name: MMI-NEW-OLD-SRVC-IND - mmiFundTypCd COBOL Name: MMI-FUND-TYP-CD - mmiPrdctKeyCd COBOL
   * Name: MMI-PRDCT-KEY-CD - mmiMbrPrdctTypCd COBOL Name: MMI-MBR-PRDCT-TYP-CD - mmiNtfyCrdcEpInd
   * COBOL Name: MMI-NTFY-CRDC-EP-IND - mmiOncPolPrtcpCd COBOL Name: MMI-ONC-POL-PRTCP-CD -
   * mmaGenTstPolPrtcpCd COBOL Name: MMA-GEN-TST-POL-PRTCP-CD - mmaSecOpinVendCd COBOL Name:
   * MMA-SEC-OPIN-VEND-CD - pol3EvdBasDialgInd COBOL Name: POL3-EVD-BAS-DIALG-IND -
   * mmiEvdBasDialgInd COBOL Name: MMI-EVD-BAS-DIALG-IND - mmiRelSrvcInd COBOL Name:
   * MMI-REL-SRVC-IND - pol3CoreMedPrrAuthCd COBOL Name: POL3-CORE-MED-PRR-AUTH-CD -
   * mmiCoreMedPrrAuthCd COBOL Name: MMI-CORE-MED-PRR-AUTH-CD
   *
   * <p>Output :
   *
   * <p>- pol3RetObligId COBOL Name: POL3-RET-OBLIG-ID - mmiObligId COBOL Name: MMI-OBLIG-ID -
   * pol3RetShrArngCd COBOL Name: POL3-RET-SHR-ARNG-CD - mmiShrArngCd COBOL Name: MMI-SHR-ARNG-CD -
   * pol3RetNewOldSrvcInd COBOL Name: POL3-RET-NEW-OLD-SRVC-IND - mmiNewOldSrvcInd COBOL Name:
   * MMI-NEW-OLD-SRVC-IND - pol3RetSviTblPriNbr COBOL Name: POL3-RET-SVI-TBL-PRI-NBR -
   * pol3RetSlotTblId COBOL Name: POL3-RET-SLOT-TBL-ID - pol3RetSviTblTerNbr COBOL Name:
   * POL3-RET-SVI-TBL-TER-NBR - pol3RetFundTypCd COBOL Name: POL3-RET-FUND-TYP-CD - mmiFundTypCd
   * COBOL Name: MMI-FUND-TYP-CD - pol3RetPrdctKeyCd COBOL Name: POL3-RET-PRDCT-KEY-CD -
   * mmiPrdctKeyCd COBOL Name: MMI-PRDCT-KEY-CD - pol3RetMbrPrdctTypCd COBOL Name:
   * POL3-RET-MBR-PRDCT-TYP-CD - mmiMbrPrdctTypCd COBOL Name: MMI-MBR-PRDCT-TYP-CD -
   * pol3NtfyCrdcEpInd COBOL Name: POL3-NTFY-CRDC-EP-IND - mmiNtfyCrdcEpInd COBOL Name:
   * MMI-NTFY-CRDC-EP-IND - pol3OncPolPrtcpCd COBOL Name: POL3-ONC-POL-PRTCP-CD - mmiOncPolPrtcpCd
   * COBOL Name: MMI-ONC-POL-PRTCP-CD - pol3GenPolPrtcpCd COBOL Name: POL3-GEN-POL-PRTCP-CD -
   * mmaGenTstPolPrtcpCd COBOL Name: MMA-GEN-TST-POL-PRTCP-CD - pol3SecOpinVendCd COBOL Name:
   * POL3-SEC-OPIN-VEND-CD - mmaSecOpinVendCd COBOL Name: MMA-SEC-OPIN-VEND-CD - pol3EvdBasDialgInd
   * COBOL Name: POL3-EVD-BAS-DIALG-IND - mmiEvdBasDialgInd COBOL Name: MMI-EVD-BAS-DIALG-IND -
   * pol3RelSrvcInd COBOL Name: POL3-REL-SRVC-IND - mmiRelSrvcInd COBOL Name: MMI-REL-SRVC-IND -
   * pol3CoreMedPrrAuthCd COBOL Name: POL3-CORE-MED-PRR-AUTH-CD - mmiCoreMedPrrAuthCd COBOL Name:
   * MMI-CORE-MED-PRR-AUTH-CD
   *
   * @throws CFException
   */
  @Override
  public PopulateMmiRet4200OutCtx populateMmiRet4200(PopulateMmiRet4200InCtx methodIn)
      throws Exception {

    // *81***************************************************************
    // *81 4200-Populate-mmi-ret                                        *
    // *81 business function: populate the mmi return fields            *
    // *81***************************************************************
    // *82***************************************************************
    // *82 4200-populate-mmi-ret                                        *
    // *82 1. populate the mmi return fields                            *
    // *82***************************************************************
    // Added variable to get the program context in place.
    D5427polCtx programCtx = methodIn.getD5427polCtx();
    // Added variable to get the output context in place.
    PopulateMmiRet4200OutCtx methodOut = methodIn.getPopulateMmiRet4200OutCtx();
    //  cobolCode::IF XRF-OBLIG-ID = SPACES OR LOW-VALUES OR HIGH-VALUES
    if ((allSpaces(methodIn.getXrfObligId()))
        || (checkLowValue(methodIn.getXrfObligId()))
        || (isHighValue(methodIn.getXrfObligId()))) {
      //  cobolCode::IF MMI-OBLIG-ID = SPACES OR LOW-VALUES OR HIGH-VALUES
      if ((allSpaces(methodOut.getMmiObligId()))
          || (checkLowValue(methodOut.getMmiObligId()))
          || (isHighValue(methodOut.getMmiObligId()))) {
        //  cobolCode::MOVE SPACES TO POL3-RET-OBLIG-ID
        methodOut.setPol3RetObligId(CONSTANTS.SPACE_2);
      }
      //  cobolCode::ELSE
      else {
        //  cobolCode::MOVE MMI-OBLIG-ID TO POL3-RET-OBLIG-ID
        methodOut.setPol3RetObligId(methodOut.getMmiObligId());
      }
    }
    //  cobolCode::IF XRF-SHR-ARNG-CD = SPACES OR LOW-VALUES OR HIGH-VALUES
    if ((allSpaces(methodIn.getXrfShrArngCd()))
        || (checkLowValue(methodIn.getXrfShrArngCd()))
        || (isHighValue(methodIn.getXrfShrArngCd()))) {
      //  cobolCode::IF MMI-SHR-ARNG-CD = SPACES OR LOW-VALUES OR HIGH-VALUES
      if ((allSpaces(methodOut.getMmiShrArngCd()))
          || (checkLowValue(methodOut.getMmiShrArngCd()))
          || (isHighValue(methodOut.getMmiShrArngCd()))) {
        //  cobolCode::MOVE SPACES TO POL3-RET-SHR-ARNG-CD
        methodOut.setPol3RetShrArngCd(CONSTANTS.SPACE_2);
      }
      //  cobolCode::ELSE
      else {
        //  cobolCode::MOVE MMI-SHR-ARNG-CD TO POL3-RET-SHR-ARNG-CD
        methodOut.setPol3RetShrArngCd(methodOut.getMmiShrArngCd());
      }
    }
    //  cobolCode::MOVE MMI-NEW-OLD-SRVC-IND TO POL3-RET-NEW-OLD-SRVC-IND
    methodOut.setPol3RetNewOldSrvcInd(methodOut.getMmiNewOldSrvcInd());
    //  cobolCode::MOVE SPACES TO POL3-RET-SVI-TBL-PRI-NBR POL3-RET-SLOT-TBL-ID
    // POL3-RET-SVI-TBL-TER-NBR
    methodOut.setPol3RetSviTblPriNbr(CONSTANTS.SPACE_6);
    methodOut.setPol3RetSlotTblId(CONSTANTS.SPACE_6);
    methodOut.setPol3RetSviTblTerNbr(CONSTANTS.SPACE_6);
    //  cobolCode::MOVE MMI-FUND-TYP-CD TO POL3-RET-FUND-TYP-CD
    methodOut.setPol3RetFundTypCd(methodOut.getMmiFundTypCd());
    //  cobolCode::MOVE MMI-PRDCT-KEY-CD TO POL3-RET-PRDCT-KEY-CD
    methodOut.setPol3RetPrdctKeyCd(methodOut.getMmiPrdctKeyCd());
    //  cobolCode::MOVE MMI-MBR-PRDCT-TYP-CD TO POL3-RET-MBR-PRDCT-TYP-CD
    methodOut.setPol3RetMbrPrdctTypCd(methodOut.getMmiMbrPrdctTypCd());
    //  cobolCode::MOVE MMI-NTFY-CRDC-EP-IND TO POL3-NTFY-CRDC-EP-IND
    methodOut.setPol3NtfyCrdcEpInd(methodOut.getMmiNtfyCrdcEpInd());
    //  cobolCode::MOVE MMI-ONC-POL-PRTCP-CD TO POL3-ONC-POL-PRTCP-CD
    methodOut.setPol3OncPolPrtcpCd(methodOut.getMmiOncPolPrtcpCd());
    //  cobolCode::MOVE MMA-GEN-TST-POL-PRTCP-CD TO POL3-GEN-POL-PRTCP-CD
    methodOut.setPol3GenPolPrtcpCd(methodOut.getMmaGenTstPolPrtcpCd());
    //  cobolCode::MOVE MMA-SEC-OPIN-VEND-CD TO POL3-SEC-OPIN-VEND-CD
    methodOut.setPol3SecOpinVendCd(methodOut.getMmaSecOpinVendCd());
    //  cobolCode::IF POL3-EVD-BAS-DIALG-IND > SPACE
    //  cobolCode::ELSE
    if ((isLessOrEqualSpaces(methodOut.getPol3EvdBasDialgInd()))) {
      //  cobolCode::MOVE MMI-EVD-BAS-DIALG-IND TO POL3-EVD-BAS-DIALG-IND
      methodOut.setPol3EvdBasDialgInd(methodOut.getMmiEvdBasDialgInd());
    }
    //  cobolCode::MOVE MMI-REL-SRVC-IND TO POL3-REL-SRVC-IND
    methodOut.setPol3RelSrvcInd(methodOut.getMmiRelSrvcInd());
    //  cobolCode::IF POL3-CORE-MED-PRR-AUTH-CD > SPACE
    //  cobolCode::ELSE
    if ((isLessOrEqualSpaces(methodOut.getPol3CoreMedPrrAuthCd()))) {
      //  cobolCode::IF MMI-CORE-MED-PRR-AUTH-CD > SPACE
      if ((isGreaterThanSpaces(methodOut.getMmiCoreMedPrrAuthCd()))) {
        //  cobolCode::MOVE MMI-CORE-MED-PRR-AUTH-CD TO POL3-CORE-MED-PRR-AUTH-CD
        methodOut.setPol3CoreMedPrrAuthCd(methodOut.getMmiCoreMedPrrAuthCd());
      }
      //  cobolCode::ELSE
      else {
        //  cobolCode::MOVE SPACE TO POL3-CORE-MED-PRR-AUTH-CD
        methodOut.setPol3CoreMedPrrAuthCd(CONSTANTS.SPACE);
      }
    }

    return methodOut;
  }
  /**
   * funcCd4MxiRead This method is derived from COBOL Paragraph - 5000-FUNC-CD4-MXI-READ SECTION
   * COBOL Cyclomatic complexity - 5 Input :
   *
   * <p>- sqlcode COBOL Name: SQLCODE - xrfObligId COBOL Name: XRF-OBLIG-ID - xrfShrArngCd COBOL
   * Name: XRF-SHR-ARNG-CD - xrfIplnTypCd COBOL Name: XRF-IPLN-TYP-CD
   *
   * <p>Output :
   *
   * <p>- sqlcode_Ws COBOL Name: WS-SQLCODE - dsmSqlcode COBOL Name: DSM-SQLCODE - sqlcode COBOL
   * Name: SQLCODE - pol4ObligId COBOL Name: POL4-OBLIG-ID - xrfObligId COBOL Name: XRF-OBLIG-ID -
   * pol4ShrArngCd COBOL Name: POL4-SHR-ARNG-CD - xrfShrArngCd COBOL Name: XRF-SHR-ARNG-CD -
   * pol4IplnTypCd COBOL Name: POL4-IPLN-TYP-CD - xrfIplnTypCd COBOL Name: XRF-IPLN-TYP-CD -
   * dsmReturnCode COBOL Name: DSM-RETURN-CODE - dsmErrTblAction COBOL Name: DSM-ERR-TBL-ACTION -
   * dsmErrTblName COBOL Name: DSM-ERR-TBL-NAME - dsmErrSectnName COBOL Name: DSM-ERR-SECTN-NAME -
   * dsmErrPgmName COBOL Name: DSM-ERR-PGM-NAME
   *
   * @throws CFException
   */
  @Override
  public FuncCd4MxiReadOutCtx funcCd4MxiRead(FuncCd4MxiReadInCtx methodIn) throws Exception {

    // *81***************************************************************
    // *81
    // *81 Business function: retrieve the records from the table       *
    // *81***************************************************************
    // *82***************************************************************
    // *82 5000-func-cd4-mxi-read                                       *
    // *82 1. read the records from the table                           *
    // *82***************************************************************
    // Added variable to get the program context in place.
    D5427polCtx programCtx = methodIn.getD5427polCtx();
    // Added variable to get the output context in place.
    FuncCd4MxiReadOutCtx methodOut = methodIn.getFuncCd4MxiReadOutCtx();
    //  cobolCode::SELECT OBLIG_ID , SHR_ARNG_CD , IPLN_TYP_CD , CAP_XCLS_IND , EMERGENT_WRP_IND
    // FROM CUST_POL_PLN_XREF WHERE POL_NBR = ? AND COV_TYP_CD = ? AND PLN_NBR = ? AND CLSS_NBR = ?
    // AND ( ( EFF_DT <= ? AND CANC_DT >= ? ) OR ( EFF_DT <= ? AND CANC_DT >= ? ) ) ORDER BY EFF_DT
    // ASC FETCH FIRST 1 ROW ONLY
    d5427polRepository.selectCustPolPlnXref4(
        programCtx.getSqlca(), methodOut.getDclcustPolPlnXref());
    //  cobolCode::MOVE SQLCODE TO WS-SQLCODE DSM-SQLCODE
    methodOut.setSqlcode_Ws(methodOut.getSqlcode());
    methodOut.setDsmSqlcode(methodOut.getSqlcode());
    //  cobolCode::EVALUATE TRUE
    if (methodOut.isSqlcodeOk()) {
      //  cobolCode::MOVE XRF-OBLIG-ID TO POL4-OBLIG-ID
      methodOut.setPol4ObligId(methodOut.getXrfObligId());
      //  cobolCode::MOVE XRF-SHR-ARNG-CD TO POL4-SHR-ARNG-CD
      methodOut.setPol4ShrArngCd(methodOut.getXrfShrArngCd());
      //  cobolCode::MOVE XRF-IPLN-TYP-CD TO POL4-IPLN-TYP-CD
      methodOut.setPol4IplnTypCd(methodOut.getXrfIplnTypCd());
      //  cobolCode::PERFORM 5100-FUNC-CD4-POLHDR-READ
      funcCd4PolhdrRead(
          programCtx.getFuncCd4PolhdrReadInCtx()); /*5100-FUNC-CD4-POLHDR-READ SECTION*/
      if (programCtx.isProgramEnded()) {
        return methodOut;
      }
    } else if (methodOut.isSqlcodeNotFound()) {
      //  cobolCode::PERFORM 5100-FUNC-CD4-POLHDR-READ
      funcCd4PolhdrRead(
          programCtx.getFuncCd4PolhdrReadInCtx()); /*5100-FUNC-CD4-POLHDR-READ SECTION*/
      if (programCtx.isProgramEnded()) {
        return methodOut;
      }
    } else {
      //  cobolCode::SET DSM-DB2-ERROR TO TRUE
      methodOut.setDsmDb2ErrorTrue();

      //  cobolCode::MOVE 'SELECT' TO DSM-ERR-TBL-ACTION
      methodOut.setDsmErrTblAction(CONSTANTS.LITERAL_SELECT_B4_);
      //  cobolCode::MOVE 'CUST_POL_PLN_XREF' TO DSM-ERR-TBL-NAME
      methodOut.setDsmErrTblName(CONSTANTS.LITERAL_CUST_POL_PLN_XREF_B8_);
      //  cobolCode::MOVE '5000-FUNC-CD4-MXI-READ' TO DSM-ERR-SECTN-NAME
      methodOut.setDsmErrSectnName(CONSTANTS.LITERAL_798619882);
      //  cobolCode::MOVE 'D5427POL' TO DSM-ERR-PGM-NAME
      //  LITERAL_D5427POL = 'D5427POL'
      methodOut.setDsmErrPgmName(CONSTANTS.LITERAL_D5427POL);
      //  cobolCode::PERFORM 7777-MOVES-FOR-ERROR-LOG
      movesForErrorLog(programCtx.getMovesForErrorLogInCtx()); /*7777-MOVES-FOR-ERROR-LOG SECTION*/
      if (programCtx.isProgramEnded()) {
        return methodOut;
      }
    }

    return methodOut;
  }
  /**
   * funcCd4PolhdrRead This method is derived from COBOL Paragraph - 5100-FUNC-CD4-POLHDR-READ
   * SECTION COBOL Cyclomatic complexity - 5 Input :
   *
   * <p>- sqlcode COBOL Name: SQLCODE
   *
   * <p>Output :
   *
   * <p>- sqlcode_Ws COBOL Name: WS-SQLCODE - dsmSqlcode COBOL Name: DSM-SQLCODE - sqlcode COBOL
   * Name: SQLCODE - dsmReturnCode COBOL Name: DSM-RETURN-CODE - dsmErrTblAction COBOL Name:
   * DSM-ERR-TBL-ACTION - dsmErrTblName COBOL Name: DSM-ERR-TBL-NAME - dsmErrSectnName COBOL Name:
   * DSM-ERR-SECTN-NAME - dsmErrPgmName COBOL Name: DSM-ERR-PGM-NAME
   *
   * @throws CFException
   */
  @Override
  public FuncCd4PolhdrReadOutCtx funcCd4PolhdrRead(FuncCd4PolhdrReadInCtx methodIn)
      throws Exception {

    // *81***************************************************************
    // *81 5100-Func-cd4-polhdr-read.                                   *
    // *81 business function: read the table to fetch the records       *
    // *81***************************************************************
    // *82***************************************************************
    // *82 5100-func-cd4-polhdr-read.                                   *
    // *82 1. fetch records from pol_pln_mstr for given policy/plan,if  *
    // *82***************************************************************
    // Added variable to get the program context in place.
    D5427polCtx programCtx = methodIn.getD5427polCtx();
    // Added variable to get the output context in place.
    FuncCd4PolhdrReadOutCtx methodOut = methodIn.getFuncCd4PolhdrReadOutCtx();
    //  cobolCode::SELECT T1.COMB_PRSC_DED_PRI_CD , T1.COMB_PRSC_DED_QUAL_CD ,
    // T1.COMB_PRSC_DED_SEC_CD , T1.COMB_PRSC_DED_TIR_CD , T1.CONTR_ST_CD , T1.COPAY_AMT ,
    // T1.FAM_NEW_COINS_AMT , T1.NEW_COINS_AMT , T1.NEW_COINS_COMB_PRSC_CD , T1.NEW_COINS_PRD_CD ,
    // T1.NEW_COINS_SAL_FAM_MULT_FCT , T1.NEW_COINS_SAL_FAM_TYP_CD , T1.NEW_COINS_SAL_INDV_TYP_CD ,
    // T1.NON_EMBD_DED_CD , T1.NTWK_PCP_COPAY_AMT , T1.OBLIG_ID , T1.OOP_COMB_FAM_AMT ,
    // T1.OOP_COMB_INDV_AMT , T1.OOP_COMB_PRSC_CD , T1.PCP_COPAY_CD , T1.PCP_SPEC_COINS_IND ,
    // T1.RCPRCTY_TBL_ID , T1.SHR_ARNG_CD , T1.SRVC_CD_N_SET_IND , T1.SRVC_CD_P_SET_IND ,
    // T1.SRVC_CD_T_SET_IND , T1.SRVC_CD_A_SET_IND , T1.SRVC_CD_B_SET_IND , T1.SRVC_CD_C_SET_IND ,
    // T1.SRVC_CD_D_SET_IND , T1.SRVC_CD_E_SET_IND , T1.SRVC_CD_F_SET_IND , T1.SRVC_CD_G_SET_IND ,
    // T1.SRVC_CD_H_SET_IND , T1.SRVC_CD_I_SET_IND , T1.SRVC_CD_J_SET_IND , T1.SRVC_CD_K_SET_IND ,
    // T1.SRVC_CD_L_SET_IND , T1.SRVC_CD_M_SET_IND , T1.SRVC_CD_O_SET_IND , T1.SRVC_CD_Q_SET_IND ,
    // T1.SRVC_CD_R_SET_IND , T1.SRVC_CD_S_SET_IND , T1.SRVC_CD_U_SET_IND , T1.SRVC_CD_V_SET_IND ,
    // T1.SRVC_CD_W_SET_IND , T1.SRVC_CD_X_SET_IND , T1.SRVC_CD_Y_SET_IND , T1.SRVC_CD_Z_SET_IND ,
    // T1.TIER_1_COPAY_AMT , T1.TIER_1_FAM_NEW_COINS_AMT , T1.TIER_1_NEW_COINS_AMT ,
    // T1.TIER_1_URGNT_CARE_AMT , T1.URGNT_CARE_AMT , T1.FAM_TXT_SWAP_CD , T1.FAM_MBR_CNT ,
    // T1.COPAY_VAR_ID , T1.XTRA_TERR_ST_MAND_IND , T1.TIER_LBL_IND , T1.SPCL_PROC_3_CD ,
    // T1.IPLAN_TYP_CD , T1.OOP_IN_NTWK_EE_PLS_1_AMT , T1.OOP_IN_NTWK_EE_SPO_AMT ,
    // T1.OOP_IN_NTWK_EE_CHRG_AMT , T1.OOP_COMB_EE_PLS_1_AMT , T1.OOP_COMB_EE_SPO_AMT ,
    // T1.OOP_COMB_EE_CHRG_AMT , T1.COINS_COPAY_CD , T1.COPAY_MAX_ANNL_AMT , T1.BHV_HLTH_VEND_CD ,
    // T1.CPTN_XCLS_IND , T1.PRDCT_KEY_CD , T1.RSN_CUSTY_PRD_CD , T1.DFLT_CHRG_PCT ,
    // T1.FACL_SHR_SV_CD , T1.PHYSN_SHR_SV_CD , T1.NEW_COINS_ACCUM_CD , T1.ALLNC_CD , T1.FUND_TYP_CD
    // , T1.PRDCT_CD_ID , T1.EMERGENT_WRP_IND , T1.OOP_MAX_COV_CD , T1.SPCL_PROC_6_CD ,
    // T1.SPCL_PROC_1_CD , T1.SPCL_PROC_2_CD , T1.SPCL_PROC_4_CD , T1.SPCL_PROC_5_CD ,
    // T1.SPCL_PROC_7_CD , T1.SPCL_PROC_8_CD , T1.SPCL_PROC_9_CD , T1.SPCL_PROC_10_CD ,
    // T1.NON_EMBD_COPAY_CD , T1.NON_EMBD_CORE_OOP_CD , T1.NON_EMBD_NEW_COINS_CD ,
    // T1.NON_EMBD_CORE_DED_CD , T1.XAPPLY_OOP_CD , T1.XAPPLY_COPAY_CD , T1.INDV_OOP_CD ,
    // T1.INDV_PRD_CD , T1.INDV_SALRY_TYP_CD , T1.FAM_SALRY_TYP_CD , T1.FAM_MULT_PCT ,
    // T1.LMT_SRVC_CD , T2.NPT_RULE_PKG_ID , T2.RHAB_COMB_PT_LMT_CD , T2.RHAB_COMB_OT_LMT_CD ,
    // T2.RHAB_COMB_ST_LMT_CD , T2.RHAB_COMB_SM_LMT_CD , T2.RHAB_COMB_CI_LMT_CD ,
    // T2.RHAB_COMB_CT_LMT_CD , T2.RHAB_COMB_CR_LMT_CD , T2.RHAB_COMB_PR_LMT_CD ,
    // T2.RHAB_COMB_MT_LMT_CD , T2.HAB_COMB_PT_LMT_CD , T2.HAB_COMB_OT_LMT_CD ,
    // T2.HAB_COMB_ST_LMT_CD , T2.HAB_COMB_SM_LMT_CD , T2.HAB_COMB_CI_LMT_CD , T2.HAB_COMB_CT_LMT_CD
    // , T2.HAB_COMB_MT_LMT_CD , T2.UGI_IND , T2.LGI_IND , T2.EXD_IND , T1.OOP_COMB_NBR_CD FROM
    // POL_PLN_MSTR T1 , POL_PLN_MSTR_ADDTL_INFO T2 WHERE T1.COV_TYP_CD = ? AND T1.POL_NBR = ? AND
    // T1.PLN_NBR = ? AND T1.CLSS_NBR = ? AND T1.POL_NBR = T2.POL_NBR AND T1.PLN_NBR = T2.PLN_NBR
    // AND T1.CLSS_NBR = T2.CLSS_NBR AND T1.COV_TYP_CD = T2.COV_TYP_CD
    d5427polRepository.selectPolPlnMstr4(
        methodOut.getDclpolPlnMstrAddtlInfo(), methodOut.getDclpolPlnMstr(), programCtx.getSqlca());
    //  cobolCode::MOVE SQLCODE TO WS-SQLCODE DSM-SQLCODE
    methodOut.setSqlcode_Ws(methodOut.getSqlcode());
    methodOut.setDsmSqlcode(methodOut.getSqlcode());
    //  cobolCode::EVALUATE TRUE
    if (methodOut.isSqlcodeOk()) {

      // *             Perform 5200-get-tenth-prdct-cd thru exit-5200
      //  cobolCode::PERFORM 5410-FUNC-CD4-POPULATE-RET
      funcCd4PopulateRet(programCtx); /*5410-FUNC-CD4-POPULATE-RET SECTION*/
      if (programCtx.isProgramEnded()) {
        return methodOut;
      }
      //  cobolCode::PERFORM 5800-FUNC-CD4-OOP-COPAY-RET
      funcCd4OopCopayRet(
          programCtx.getFuncCd4OopCopayRetInCtx()); /*5800-FUNC-CD4-OOP-COPAY-RET SECTION*/
      if (programCtx.isProgramEnded()) {
        return methodOut;
      }
    } else if (methodOut.isSqlcodeNotFound()) {
      //  cobolCode::SET DSM-ENTRY-NOT-FND-INQ TO TRUE
      methodOut.setDsmEntryNotFndInqTrue();

      //  cobolCode::MOVE 'SELECT' TO DSM-ERR-TBL-ACTION
      methodOut.setDsmErrTblAction(CONSTANTS.LITERAL_SELECT_B4_);
      //  cobolCode::MOVE 'POL_PLN_MSTR' TO DSM-ERR-TBL-NAME
      methodOut.setDsmErrTblName(CONSTANTS.LITERAL_POL_PLN_MSTR_B13_);
      //  cobolCode::MOVE '5100-FUNC-CD4-POLHDR-READ' TO DSM-ERR-SECTN-NAME
      methodOut.setDsmErrSectnName(CONSTANTS.LITERAL_1498436008);
      //  cobolCode::MOVE 'D5427POL' TO DSM-ERR-PGM-NAME
      //  LITERAL_D5427POL = 'D5427POL'
      methodOut.setDsmErrPgmName(CONSTANTS.LITERAL_D5427POL);
      //  cobolCode::PERFORM 7777-MOVES-FOR-ERROR-LOG
      movesForErrorLog(programCtx.getMovesForErrorLogInCtx()); /*7777-MOVES-FOR-ERROR-LOG SECTION*/
      if (programCtx.isProgramEnded()) {
        return methodOut;
      }
    } else {
      //  cobolCode::SET DSM-DB2-ERROR TO TRUE
      methodOut.setDsmDb2ErrorTrue();

      //  cobolCode::MOVE 'SELECT' TO DSM-ERR-TBL-ACTION
      methodOut.setDsmErrTblAction(CONSTANTS.LITERAL_SELECT_B4_);
      //  cobolCode::MOVE 'POL_PLN_MSTR' TO DSM-ERR-TBL-NAME
      methodOut.setDsmErrTblName(CONSTANTS.LITERAL_POL_PLN_MSTR_B13_);
      //  cobolCode::MOVE '5100-FUNC-CD4-POLHDR-READ' TO DSM-ERR-SECTN-NAME
      methodOut.setDsmErrSectnName(CONSTANTS.LITERAL_1498436008);
      //  cobolCode::MOVE 'D5427POL' TO DSM-ERR-PGM-NAME
      //  LITERAL_D5427POL = 'D5427POL'
      methodOut.setDsmErrPgmName(CONSTANTS.LITERAL_D5427POL);
      //  cobolCode::PERFORM 7777-MOVES-FOR-ERROR-LOG
      movesForErrorLog(programCtx.getMovesForErrorLogInCtx()); /*7777-MOVES-FOR-ERROR-LOG SECTION*/
      if (programCtx.isProgramEnded()) {
        return methodOut;
      }
    }

    return methodOut;
  }
  /**
   * funcCd4PopulateRet This method is derived from COBOL Paragraph - 5410-FUNC-CD4-POPULATE-RET
   * SECTION COBOL Cyclomatic complexity - 21 Input : None
   *
   * <p>Output : None
   *
   * @throws CFException
   */
  @Override
  public void funcCd4PopulateRet(D5427polCtx programCtx) throws Exception {

    // *    Evaluate true
    // *        when ws-sqlcode-ok
    // *        when ws-sqlcode-not-found
    // *             continue
    // *        when other
    // *             set dsm-db2-error              to true
    // *             move 'select'                  to dsm-err-tbl-action
    // *             move 'pol_pln_mstr_ppo_arng'
    // *                                            to dsm-err-tbl-name
    // *             move '5200-get-tenth-prdct-cd'
    // *                                            to dsm-err-sectn-name
    // *             move 'd5427pol'                to dsm-err-pgm-name
    // *             perform 7777-moves-for-error-log
    // *    end-evaluate.
    // *exit-5200.
    // *    exit.
    // *
    // *81***************************************************************
    // *81 5410-func-cd4-populate-ret.                                  *
    // *81 business function: populate the return data                  *
    // *81***************************************************************
    // *82***************************************************************
    // *82 5410-func-cd4-populate-ret.                                  *
    // *82 1. populate the return data for func code '4'                *
    // *82***************************************************************
    //  cobolCode::PERFORM 5410-FUNC-CD4-POPULATE-RET-SPLIT2
    funcCd4PopulateRetSplit2(
        programCtx.getFuncCd4PopulateRetSplit2InCtx()); /*5410-FUNC-CD4-POPULATE-RET-SPLIT2*/
    //  cobolCode::PERFORM 5410-FUNC-CD4-POPULATE-RET-SPLIT3
    funcCd4PopulateRetSplit3(
        programCtx.getFuncCd4PopulateRetSplit3InCtx()); /*5410-FUNC-CD4-POPULATE-RET-SPLIT3*/
    //  cobolCode::PERFORM 5410-FUNC-CD4-POPULATE-RET-SPLIT4
    funcCd4PopulateRetSplit4(
        programCtx.getFuncCd4PopulateRetSplit4InCtx()); /*5410-FUNC-CD4-POPULATE-RET-SPLIT4*/
  }
  /**
   * funcCd4PopulateRetSplit2 This method is derived from COBOL Paragraph -
   * 5410-FUNC-CD4-POPULATE-RET-SPLIT2 COBOL Cyclomatic complexity - 1 Input :
   *
   * <p>- mmiPolNbr COBOL Name: MMI-POL-NBR - mmiPlnNbr COBOL Name: MMI-PLN-NBR - mmiClssNbr COBOL
   * Name: MMI-CLSS-NBR - xrfObligId COBOL Name: XRF-OBLIG-ID - mmiObligId COBOL Name: MMI-OBLIG-ID
   * - xrfShrArngCd COBOL Name: XRF-SHR-ARNG-CD - mmiShrArngCd COBOL Name: MMI-SHR-ARNG-CD -
   * xrfIplnTypCd COBOL Name: XRF-IPLN-TYP-CD - mmiIplanTypCd COBOL Name: MMI-IPLAN-TYP-CD -
   * mmiCombPrscDedPriCd COBOL Name: MMI-COMB-PRSC-DED-PRI-CD - mmiCombPrscDedQualCd COBOL Name:
   * MMI-COMB-PRSC-DED-QUAL-CD - mmiCombPrscDedSecCd COBOL Name: MMI-COMB-PRSC-DED-SEC-CD -
   * mmiCombPrscDedTirCd COBOL Name: MMI-COMB-PRSC-DED-TIR-CD - mmiContrStCd COBOL Name:
   * MMI-CONTR-ST-CD - mmiCopayAmt COBOL Name: MMI-COPAY-AMT - mmiFamNewCoinsAmt COBOL Name:
   * MMI-FAM-NEW-COINS-AMT - mmiNewCoinsAmt COBOL Name: MMI-NEW-COINS-AMT - mmiNewCoinsCombPrscCd
   * COBOL Name: MMI-NEW-COINS-COMB-PRSC-CD - mmiNewCoinsPrdCd COBOL Name: MMI-NEW-COINS-PRD-CD -
   * mmiNewCoinsSalFamMultFct COBOL Name: MMI-NEW-COINS-SAL-FAM-MULT-FCT - mmiNewCoinsSalFamTypCd
   * COBOL Name: MMI-NEW-COINS-SAL-FAM-TYP-CD - mmiNewCoinsSalIndvTypCd COBOL Name:
   * MMI-NEW-COINS-SAL-INDV-TYP-CD - mmiNonEmbdDedCd COBOL Name: MMI-NON-EMBD-DED-CD -
   * mmiNtwkPcpCopayAmt COBOL Name: MMI-NTWK-PCP-COPAY-AMT - mmiOopCombFamAmt COBOL Name:
   * MMI-OOP-COMB-FAM-AMT - mmiOopCombIndvAmt COBOL Name: MMI-OOP-COMB-INDV-AMT - mmiOopCombPrscCd
   * COBOL Name: MMI-OOP-COMB-PRSC-CD - mmiPcpCopayCd COBOL Name: MMI-PCP-COPAY-CD -
   * mmiPcpSpecCoinsInd COBOL Name: MMI-PCP-SPEC-COINS-IND - mmiRcprctyTblId COBOL Name:
   * MMI-RCPRCTY-TBL-ID - mmiSrvcCdNSetInd COBOL Name: MMI-SRVC-CD-N-SET-IND - mmiSrvcCdPSetInd
   * COBOL Name: MMI-SRVC-CD-P-SET-IND - mmiSrvcCdTSetInd COBOL Name: MMI-SRVC-CD-T-SET-IND -
   * mmiSrvcCdASetInd COBOL Name: MMI-SRVC-CD-A-SET-IND - mmiSrvcCdBSetInd COBOL Name:
   * MMI-SRVC-CD-B-SET-IND - mmiSrvcCdCSetInd COBOL Name: MMI-SRVC-CD-C-SET-IND - mmiSrvcCdDSetInd
   * COBOL Name: MMI-SRVC-CD-D-SET-IND - mmiSrvcCdESetInd COBOL Name: MMI-SRVC-CD-E-SET-IND -
   * mmiSrvcCdFSetInd COBOL Name: MMI-SRVC-CD-F-SET-IND - mmiSrvcCdGSetInd COBOL Name:
   * MMI-SRVC-CD-G-SET-IND - mmiSrvcCdHSetInd COBOL Name: MMI-SRVC-CD-H-SET-IND - mmiSrvcCdISetInd
   * COBOL Name: MMI-SRVC-CD-I-SET-IND - mmiSrvcCdJSetInd COBOL Name: MMI-SRVC-CD-J-SET-IND -
   * mmiSrvcCdKSetInd COBOL Name: MMI-SRVC-CD-K-SET-IND - mmiSrvcCdLSetInd COBOL Name:
   * MMI-SRVC-CD-L-SET-IND - mmiSrvcCdMSetInd COBOL Name: MMI-SRVC-CD-M-SET-IND - mmiSrvcCdOSetInd
   * COBOL Name: MMI-SRVC-CD-O-SET-IND - mmiSrvcCdQSetInd COBOL Name: MMI-SRVC-CD-Q-SET-IND -
   * mmiSrvcCdRSetInd COBOL Name: MMI-SRVC-CD-R-SET-IND - mmiSrvcCdSSetInd COBOL Name:
   * MMI-SRVC-CD-S-SET-IND - mmiSrvcCdUSetInd COBOL Name: MMI-SRVC-CD-U-SET-IND - mmiSrvcCdVSetInd
   * COBOL Name: MMI-SRVC-CD-V-SET-IND - mmiSrvcCdWSetInd COBOL Name: MMI-SRVC-CD-W-SET-IND -
   * mmiSrvcCdXSetInd COBOL Name: MMI-SRVC-CD-X-SET-IND
   *
   * <p>Output :
   *
   * <p>- pol4StdPolNbr COBOL Name: POL4-STD-POL-NBR - mmiPolNbr COBOL Name: MMI-POL-NBR -
   * pol4StdPlnNbr COBOL Name: POL4-STD-PLN-NBR - mmiPlnNbr COBOL Name: MMI-PLN-NBR - pol4StdClssNbr
   * COBOL Name: POL4-STD-CLSS-NBR - mmiClssNbr COBOL Name: MMI-CLSS-NBR - pol4ObligId COBOL Name:
   * POL4-OBLIG-ID - mmiObligId COBOL Name: MMI-OBLIG-ID - pol4ShrArngCd COBOL Name:
   * POL4-SHR-ARNG-CD - mmiShrArngCd COBOL Name: MMI-SHR-ARNG-CD - pol4IplnTypCd COBOL Name:
   * POL4-IPLN-TYP-CD - mmiIplanTypCd COBOL Name: MMI-IPLAN-TYP-CD - pol4CombPrscDedPriCd COBOL
   * Name: POL4-COMB-PRSC-DED-PRI-CD - mmiCombPrscDedPriCd COBOL Name: MMI-COMB-PRSC-DED-PRI-CD -
   * pol4CombPrscDedQualCd COBOL Name: POL4-COMB-PRSC-DED-QUAL-CD - mmiCombPrscDedQualCd COBOL Name:
   * MMI-COMB-PRSC-DED-QUAL-CD - pol4CombPrscDedSecCd COBOL Name: POL4-COMB-PRSC-DED-SEC-CD -
   * mmiCombPrscDedSecCd COBOL Name: MMI-COMB-PRSC-DED-SEC-CD - pol4CombPrscDedTirCd COBOL Name:
   * POL4-COMB-PRSC-DED-TIR-CD - mmiCombPrscDedTirCd COBOL Name: MMI-COMB-PRSC-DED-TIR-CD -
   * pol4ContrStCd COBOL Name: POL4-CONTR-ST-CD - mmiContrStCd COBOL Name: MMI-CONTR-ST-CD -
   * pol4CopayAmt COBOL Name: POL4-COPAY-AMT - mmiCopayAmt COBOL Name: MMI-COPAY-AMT -
   * pol4FamNewCoinsAmt COBOL Name: POL4-FAM-NEW-COINS-AMT - mmiFamNewCoinsAmt COBOL Name:
   * MMI-FAM-NEW-COINS-AMT - pol4NewCoinsAmt COBOL Name: POL4-NEW-COINS-AMT - mmiNewCoinsAmt COBOL
   * Name: MMI-NEW-COINS-AMT - pol4NewCoinsCombPrscCd COBOL Name: POL4-NEW-COINS-COMB-PRSC-CD -
   * mmiNewCoinsCombPrscCd COBOL Name: MMI-NEW-COINS-COMB-PRSC-CD - pol4NewCoinsPrdCd COBOL Name:
   * POL4-NEW-COINS-PRD-CD - mmiNewCoinsPrdCd COBOL Name: MMI-NEW-COINS-PRD-CD -
   * pol4NcinsSlryFamMultFct COBOL Name: POL4-NCINS-SLRY-FAM-MULT-FCT - mmiNewCoinsSalFamMultFct
   * COBOL Name: MMI-NEW-COINS-SAL-FAM-MULT-FCT - pol4NcinsSlryFamTypCd COBOL Name:
   * POL4-NCINS-SLRY-FAM-TYP-CD - mmiNewCoinsSalFamTypCd COBOL Name: MMI-NEW-COINS-SAL-FAM-TYP-CD -
   * pol4NcinsSlryIndvTypCd COBOL Name: POL4-NCINS-SLRY-INDV-TYP-CD - mmiNewCoinsSalIndvTypCd COBOL
   * Name: MMI-NEW-COINS-SAL-INDV-TYP-CD - pol4NonEmbdDedCd COBOL Name: POL4-NON-EMBD-DED-CD -
   * mmiNonEmbdDedCd COBOL Name: MMI-NON-EMBD-DED-CD - pol4NtwkPcpCopayAmt COBOL Name:
   * POL4-NTWK-PCP-COPAY-AMT - mmiNtwkPcpCopayAmt COBOL Name: MMI-NTWK-PCP-COPAY-AMT -
   * pol4OopCombFamAmt COBOL Name: POL4-OOP-COMB-FAM-AMT - mmiOopCombFamAmt COBOL Name:
   * MMI-OOP-COMB-FAM-AMT - pol4OopCombIndvAmt COBOL Name: POL4-OOP-COMB-INDV-AMT -
   * mmiOopCombIndvAmt COBOL Name: MMI-OOP-COMB-INDV-AMT - pol4OopCombPrscCd COBOL Name:
   * POL4-OOP-COMB-PRSC-CD - mmiOopCombPrscCd COBOL Name: MMI-OOP-COMB-PRSC-CD - pol4PcpCopayCd
   * COBOL Name: POL4-PCP-COPAY-CD - mmiPcpCopayCd COBOL Name: MMI-PCP-COPAY-CD -
   * pol4PcpSpecCoinsInd COBOL Name: POL4-PCP-SPEC-COINS-IND - mmiPcpSpecCoinsInd COBOL Name:
   * MMI-PCP-SPEC-COINS-IND - pol4RcprctyTblId COBOL Name: POL4-RCPRCTY-TBL-ID - mmiRcprctyTblId
   * COBOL Name: MMI-RCPRCTY-TBL-ID - pol4RetSrvcCdNSetInd COBOL Name: POL4-RET-SRVC-CD-N-SET-IND -
   * mmiSrvcCdNSetInd COBOL Name: MMI-SRVC-CD-N-SET-IND - pol4RetSrvcCdPSetInd COBOL Name:
   * POL4-RET-SRVC-CD-P-SET-IND - mmiSrvcCdPSetInd COBOL Name: MMI-SRVC-CD-P-SET-IND -
   * pol4RetSrvcCdTSetInd COBOL Name: POL4-RET-SRVC-CD-T-SET-IND - mmiSrvcCdTSetInd COBOL Name:
   * MMI-SRVC-CD-T-SET-IND - pol4RetSrvcCdASetInd COBOL Name: POL4-RET-SRVC-CD-A-SET-IND -
   * mmiSrvcCdASetInd COBOL Name: MMI-SRVC-CD-A-SET-IND - pol4RetSrvcCdBSetInd COBOL Name:
   * POL4-RET-SRVC-CD-B-SET-IND - mmiSrvcCdBSetInd COBOL Name: MMI-SRVC-CD-B-SET-IND -
   * pol4RetSrvcCdCSetInd COBOL Name: POL4-RET-SRVC-CD-C-SET-IND - mmiSrvcCdCSetInd COBOL Name:
   * MMI-SRVC-CD-C-SET-IND - pol4RetSrvcCdDSetInd COBOL Name: POL4-RET-SRVC-CD-D-SET-IND -
   * mmiSrvcCdDSetInd COBOL Name: MMI-SRVC-CD-D-SET-IND - pol4RetSrvcCdESetInd COBOL Name:
   * POL4-RET-SRVC-CD-E-SET-IND - mmiSrvcCdESetInd COBOL Name: MMI-SRVC-CD-E-SET-IND -
   * pol4RetSrvcCdFSetInd COBOL Name: POL4-RET-SRVC-CD-F-SET-IND - mmiSrvcCdFSetInd COBOL Name:
   * MMI-SRVC-CD-F-SET-IND - pol4RetSrvcCdGSetInd COBOL Name: POL4-RET-SRVC-CD-G-SET-IND -
   * mmiSrvcCdGSetInd COBOL Name: MMI-SRVC-CD-G-SET-IND - pol4RetSrvcCdHSetInd COBOL Name:
   * POL4-RET-SRVC-CD-H-SET-IND - mmiSrvcCdHSetInd COBOL Name: MMI-SRVC-CD-H-SET-IND -
   * pol4RetSrvcCdISetInd COBOL Name: POL4-RET-SRVC-CD-I-SET-IND - mmiSrvcCdISetInd COBOL Name:
   * MMI-SRVC-CD-I-SET-IND - pol4RetSrvcCdJSetInd COBOL Name: POL4-RET-SRVC-CD-J-SET-IND -
   * mmiSrvcCdJSetInd COBOL Name: MMI-SRVC-CD-J-SET-IND - pol4RetSrvcCdKSetInd COBOL Name:
   * POL4-RET-SRVC-CD-K-SET-IND - mmiSrvcCdKSetInd COBOL Name: MMI-SRVC-CD-K-SET-IND -
   * pol4RetSrvcCdLSetInd COBOL Name: POL4-RET-SRVC-CD-L-SET-IND - mmiSrvcCdLSetInd COBOL Name:
   * MMI-SRVC-CD-L-SET-IND - pol4RetSrvcCdMSetInd COBOL Name: POL4-RET-SRVC-CD-M-SET-IND -
   * mmiSrvcCdMSetInd COBOL Name: MMI-SRVC-CD-M-SET-IND - pol4RetSrvcCdOSetInd COBOL Name:
   * POL4-RET-SRVC-CD-O-SET-IND - mmiSrvcCdOSetInd COBOL Name: MMI-SRVC-CD-O-SET-IND -
   * pol4RetSrvcCdQSetInd COBOL Name: POL4-RET-SRVC-CD-Q-SET-IND - mmiSrvcCdQSetInd COBOL Name:
   * MMI-SRVC-CD-Q-SET-IND - pol4RetSrvcCdRSetInd COBOL Name: POL4-RET-SRVC-CD-R-SET-IND -
   * mmiSrvcCdRSetInd COBOL Name: MMI-SRVC-CD-R-SET-IND - pol4RetSrvcCdSSetInd COBOL Name:
   * POL4-RET-SRVC-CD-S-SET-IND - mmiSrvcCdSSetInd COBOL Name: MMI-SRVC-CD-S-SET-IND -
   * pol4RetSrvcCdUSetInd COBOL Name: POL4-RET-SRVC-CD-U-SET-IND - mmiSrvcCdUSetInd COBOL Name:
   * MMI-SRVC-CD-U-SET-IND - pol4RetSrvcCdVSetInd COBOL Name: POL4-RET-SRVC-CD-V-SET-IND -
   * mmiSrvcCdVSetInd COBOL Name: MMI-SRVC-CD-V-SET-IND - pol4RetSrvcCdWSetInd COBOL Name:
   * POL4-RET-SRVC-CD-W-SET-IND - mmiSrvcCdWSetInd COBOL Name: MMI-SRVC-CD-W-SET-IND -
   * pol4RetSrvcCdXSetInd COBOL Name: POL4-RET-SRVC-CD-X-SET-IND - mmiSrvcCdXSetInd COBOL Name:
   * MMI-SRVC-CD-X-SET-IND
   *
   * @throws CFException
   */
  @Override
  public FuncCd4PopulateRetSplit2OutCtx funcCd4PopulateRetSplit2(
      FuncCd4PopulateRetSplit2InCtx methodIn) throws Exception {
    // Added variable to get the program context in place.
    D5427polCtx programCtx = methodIn.getD5427polCtx();
    // Added variable to get the output context in place.
    FuncCd4PopulateRetSplit2OutCtx methodOut = methodIn.getFuncCd4PopulateRetSplit2OutCtx();
    //  cobolCode::MOVE MMI-POL-NBR TO POL4-STD-POL-NBR
    methodOut.setPol4StdPolNbr(methodOut.getMmiPolNbr());
    methodOut.setPol4StdPlnNbr(padLeftZeros(4, methodOut.getMmiPlnNbr(), false));
    methodOut.setPol4StdClssNbr(padLeftZeros(4, methodOut.getMmiClssNbr(), false));
    //  cobolCode::IF XRF-OBLIG-ID = SPACES OR LOW-VALUES OR HIGH-VALUES
    if ((allSpaces(methodIn.getXrfObligId()))
        || (checkLowValue(methodIn.getXrfObligId()))
        || (isHighValue(methodIn.getXrfObligId()))) {
      //  cobolCode::IF MMI-OBLIG-ID = SPACES OR LOW-VALUES OR HIGH-VALUES
      if ((allSpaces(methodOut.getMmiObligId()))
          || (checkLowValue(methodOut.getMmiObligId()))
          || (isHighValue(methodOut.getMmiObligId()))) {
        //  cobolCode::MOVE SPACES TO POL4-OBLIG-ID
        methodOut.setPol4ObligId(CONSTANTS.SPACE_2);
      }
      //  cobolCode::ELSE
      else {
        //  cobolCode::MOVE MMI-OBLIG-ID TO POL4-OBLIG-ID
        methodOut.setPol4ObligId(methodOut.getMmiObligId());
      }
    }
    //  cobolCode::IF XRF-SHR-ARNG-CD = SPACES OR LOW-VALUES OR HIGH-VALUES
    if ((allSpaces(methodIn.getXrfShrArngCd()))
        || (checkLowValue(methodIn.getXrfShrArngCd()))
        || (isHighValue(methodIn.getXrfShrArngCd()))) {
      //  cobolCode::IF MMI-SHR-ARNG-CD = SPACES OR LOW-VALUES OR HIGH-VALUES
      if ((allSpaces(methodOut.getMmiShrArngCd()))
          || (checkLowValue(methodOut.getMmiShrArngCd()))
          || (isHighValue(methodOut.getMmiShrArngCd()))) {
        //  cobolCode::MOVE SPACES TO POL4-SHR-ARNG-CD
        methodOut.setPol4ShrArngCd(CONSTANTS.SPACE_2);
      }
      //  cobolCode::ELSE
      else {
        //  cobolCode::MOVE MMI-SHR-ARNG-CD TO POL4-SHR-ARNG-CD
        methodOut.setPol4ShrArngCd(methodOut.getMmiShrArngCd());
      }
    }
    //  cobolCode::IF XRF-IPLN-TYP-CD = SPACES OR LOW-VALUES OR HIGH-VALUES
    if ((allSpaces(methodIn.getXrfIplnTypCd()))
        || (checkLowValue(methodIn.getXrfIplnTypCd()))
        || (isHighValue(methodIn.getXrfIplnTypCd()))) {
      //  cobolCode::IF MMI-IPLAN-TYP-CD = SPACES OR LOW-VALUES OR HIGH-VALUES
      if ((allSpaces(methodOut.getMmiIplanTypCd()))
          || (checkLowValue(methodOut.getMmiIplanTypCd()))
          || (isHighValue(methodOut.getMmiIplanTypCd()))) {
        //  cobolCode::MOVE SPACES TO POL4-IPLN-TYP-CD
        methodOut.setPol4IplnTypCd(CONSTANTS.SPACE);
      }
      //  cobolCode::ELSE
      else {
        //  cobolCode::MOVE MMI-IPLAN-TYP-CD TO POL4-IPLN-TYP-CD
        methodOut.setPol4IplnTypCd(methodOut.getMmiIplanTypCd());
      }
    }
    //  cobolCode::MOVE MMI-COMB-PRSC-DED-PRI-CD TO POL4-COMB-PRSC-DED-PRI-CD
    methodOut.setPol4CombPrscDedPriCd(methodOut.getMmiCombPrscDedPriCd());
    //  cobolCode::MOVE MMI-COMB-PRSC-DED-QUAL-CD TO POL4-COMB-PRSC-DED-QUAL-CD
    methodOut.setPol4CombPrscDedQualCd(methodOut.getMmiCombPrscDedQualCd());
    //  cobolCode::MOVE MMI-COMB-PRSC-DED-SEC-CD TO POL4-COMB-PRSC-DED-SEC-CD
    methodOut.setPol4CombPrscDedSecCd(methodOut.getMmiCombPrscDedSecCd());
    //  cobolCode::MOVE MMI-COMB-PRSC-DED-TIR-CD TO POL4-COMB-PRSC-DED-TIR-CD
    methodOut.setPol4CombPrscDedTirCd(methodOut.getMmiCombPrscDedTirCd());
    //  cobolCode::MOVE MMI-CONTR-ST-CD TO POL4-CONTR-ST-CD
    methodOut.setPol4ContrStCd(methodOut.getMmiContrStCd());
    //  cobolCode::MOVE MMI-COPAY-AMT TO POL4-COPAY-AMT
    methodOut.setPol4CopayAmt(methodOut.getMmiCopayAmt());
    methodOut.setPol4FamNewCoinsAmt(methodOut.getMmiFamNewCoinsAmt());
    methodOut.setPol4NewCoinsAmt(methodOut.getMmiNewCoinsAmt());
    //  cobolCode::MOVE MMI-NEW-COINS-COMB-PRSC-CD TO POL4-NEW-COINS-COMB-PRSC-CD
    methodOut.setPol4NewCoinsCombPrscCd(methodOut.getMmiNewCoinsCombPrscCd());
    //  cobolCode::MOVE MMI-NEW-COINS-PRD-CD TO POL4-NEW-COINS-PRD-CD
    methodOut.setPol4NewCoinsPrdCd(padLeftZeros(1, methodOut.getMmiNewCoinsPrdCd(), true));
    //  cobolCode::MOVE MMI-NEW-COINS-SAL-FAM-MULT-FCT TO POL4-NCINS-SLRY-FAM-MULT-FCT
    methodOut.setPol4NcinsSlryFamMultFct(methodOut.getMmiNewCoinsSalFamMultFct());
    //  cobolCode::MOVE MMI-NEW-COINS-SAL-FAM-TYP-CD TO POL4-NCINS-SLRY-FAM-TYP-CD
    methodOut.setPol4NcinsSlryFamTypCd(methodOut.getMmiNewCoinsSalFamTypCd());
    //  cobolCode::MOVE MMI-NEW-COINS-SAL-INDV-TYP-CD TO POL4-NCINS-SLRY-INDV-TYP-CD
    methodOut.setPol4NcinsSlryIndvTypCd(methodOut.getMmiNewCoinsSalIndvTypCd());
    //  cobolCode::MOVE MMI-NON-EMBD-DED-CD TO POL4-NON-EMBD-DED-CD
    methodOut.setPol4NonEmbdDedCd(methodOut.getMmiNonEmbdDedCd());
    //  cobolCode::MOVE MMI-NTWK-PCP-COPAY-AMT TO POL4-NTWK-PCP-COPAY-AMT
    methodOut.setPol4NtwkPcpCopayAmt(methodOut.getMmiNtwkPcpCopayAmt());

    // ***  Move mmi-slot-tbl-id    to   pol4-slot-tbl-id.
    //  cobolCode::MOVE MMI-OOP-COMB-FAM-AMT TO POL4-OOP-COMB-FAM-AMT
    methodOut.setPol4OopCombFamAmt(methodOut.getMmiOopCombFamAmt());
    //  cobolCode::MOVE MMI-OOP-COMB-INDV-AMT TO POL4-OOP-COMB-INDV-AMT
    methodOut.setPol4OopCombIndvAmt(methodOut.getMmiOopCombIndvAmt());
    //  cobolCode::MOVE MMI-OOP-COMB-PRSC-CD TO POL4-OOP-COMB-PRSC-CD
    methodOut.setPol4OopCombPrscCd(methodOut.getMmiOopCombPrscCd());
    //  cobolCode::MOVE MMI-PCP-COPAY-CD TO POL4-PCP-COPAY-CD
    methodOut.setPol4PcpCopayCd(methodOut.getMmiPcpCopayCd());
    //  cobolCode::MOVE MMI-PCP-SPEC-COINS-IND TO POL4-PCP-SPEC-COINS-IND
    methodOut.setPol4PcpSpecCoinsInd(methodOut.getMmiPcpSpecCoinsInd());
    //  cobolCode::MOVE MMI-RCPRCTY-TBL-ID TO POL4-RCPRCTY-TBL-ID
    methodOut.setPol4RcprctyTblId(methodOut.getMmiRcprctyTblId());
    //  cobolCode::MOVE MMI-SRVC-CD-N-SET-IND TO POL4-RET-SRVC-CD-N-SET-IND
    methodOut.setPol4RetSrvcCdNSetInd(methodOut.getMmiSrvcCdNSetInd());
    //  cobolCode::MOVE MMI-SRVC-CD-P-SET-IND TO POL4-RET-SRVC-CD-P-SET-IND
    methodOut.setPol4RetSrvcCdPSetInd(methodOut.getMmiSrvcCdPSetInd());
    //  cobolCode::MOVE MMI-SRVC-CD-T-SET-IND TO POL4-RET-SRVC-CD-T-SET-IND
    methodOut.setPol4RetSrvcCdTSetInd(methodOut.getMmiSrvcCdTSetInd());
    //  cobolCode::MOVE MMI-SRVC-CD-A-SET-IND TO POL4-RET-SRVC-CD-A-SET-IND
    methodOut.setPol4RetSrvcCdASetInd(methodOut.getMmiSrvcCdASetInd());
    //  cobolCode::MOVE MMI-SRVC-CD-B-SET-IND TO POL4-RET-SRVC-CD-B-SET-IND
    methodOut.setPol4RetSrvcCdBSetInd(methodOut.getMmiSrvcCdBSetInd());
    //  cobolCode::MOVE MMI-SRVC-CD-C-SET-IND TO POL4-RET-SRVC-CD-C-SET-IND
    methodOut.setPol4RetSrvcCdCSetInd(methodOut.getMmiSrvcCdCSetInd());
    //  cobolCode::MOVE MMI-SRVC-CD-D-SET-IND TO POL4-RET-SRVC-CD-D-SET-IND
    methodOut.setPol4RetSrvcCdDSetInd(methodOut.getMmiSrvcCdDSetInd());
    //  cobolCode::MOVE MMI-SRVC-CD-E-SET-IND TO POL4-RET-SRVC-CD-E-SET-IND
    methodOut.setPol4RetSrvcCdESetInd(methodOut.getMmiSrvcCdESetInd());
    //  cobolCode::MOVE MMI-SRVC-CD-F-SET-IND TO POL4-RET-SRVC-CD-F-SET-IND
    methodOut.setPol4RetSrvcCdFSetInd(methodOut.getMmiSrvcCdFSetInd());
    //  cobolCode::MOVE MMI-SRVC-CD-G-SET-IND TO POL4-RET-SRVC-CD-G-SET-IND
    methodOut.setPol4RetSrvcCdGSetInd(methodOut.getMmiSrvcCdGSetInd());
    //  cobolCode::MOVE MMI-SRVC-CD-H-SET-IND TO POL4-RET-SRVC-CD-H-SET-IND
    methodOut.setPol4RetSrvcCdHSetInd(methodOut.getMmiSrvcCdHSetInd());
    //  cobolCode::MOVE MMI-SRVC-CD-I-SET-IND TO POL4-RET-SRVC-CD-I-SET-IND
    methodOut.setPol4RetSrvcCdISetInd(methodOut.getMmiSrvcCdISetInd());
    //  cobolCode::MOVE MMI-SRVC-CD-J-SET-IND TO POL4-RET-SRVC-CD-J-SET-IND
    methodOut.setPol4RetSrvcCdJSetInd(methodOut.getMmiSrvcCdJSetInd());
    //  cobolCode::MOVE MMI-SRVC-CD-K-SET-IND TO POL4-RET-SRVC-CD-K-SET-IND
    methodOut.setPol4RetSrvcCdKSetInd(methodOut.getMmiSrvcCdKSetInd());
    //  cobolCode::MOVE MMI-SRVC-CD-L-SET-IND TO POL4-RET-SRVC-CD-L-SET-IND
    methodOut.setPol4RetSrvcCdLSetInd(methodOut.getMmiSrvcCdLSetInd());
    //  cobolCode::MOVE MMI-SRVC-CD-M-SET-IND TO POL4-RET-SRVC-CD-M-SET-IND
    methodOut.setPol4RetSrvcCdMSetInd(methodOut.getMmiSrvcCdMSetInd());
    //  cobolCode::MOVE MMI-SRVC-CD-O-SET-IND TO POL4-RET-SRVC-CD-O-SET-IND
    methodOut.setPol4RetSrvcCdOSetInd(methodOut.getMmiSrvcCdOSetInd());
    //  cobolCode::MOVE MMI-SRVC-CD-Q-SET-IND TO POL4-RET-SRVC-CD-Q-SET-IND
    methodOut.setPol4RetSrvcCdQSetInd(methodOut.getMmiSrvcCdQSetInd());
    //  cobolCode::MOVE MMI-SRVC-CD-R-SET-IND TO POL4-RET-SRVC-CD-R-SET-IND
    methodOut.setPol4RetSrvcCdRSetInd(methodOut.getMmiSrvcCdRSetInd());
    //  cobolCode::MOVE MMI-SRVC-CD-S-SET-IND TO POL4-RET-SRVC-CD-S-SET-IND
    methodOut.setPol4RetSrvcCdSSetInd(methodOut.getMmiSrvcCdSSetInd());
    //  cobolCode::MOVE MMI-SRVC-CD-U-SET-IND TO POL4-RET-SRVC-CD-U-SET-IND
    methodOut.setPol4RetSrvcCdUSetInd(methodOut.getMmiSrvcCdUSetInd());
    //  cobolCode::MOVE MMI-SRVC-CD-V-SET-IND TO POL4-RET-SRVC-CD-V-SET-IND
    methodOut.setPol4RetSrvcCdVSetInd(methodOut.getMmiSrvcCdVSetInd());
    //  cobolCode::MOVE MMI-SRVC-CD-W-SET-IND TO POL4-RET-SRVC-CD-W-SET-IND
    methodOut.setPol4RetSrvcCdWSetInd(methodOut.getMmiSrvcCdWSetInd());
    //  cobolCode::MOVE MMI-SRVC-CD-X-SET-IND TO POL4-RET-SRVC-CD-X-SET-IND
    methodOut.setPol4RetSrvcCdXSetInd(methodOut.getMmiSrvcCdXSetInd());

    return methodOut;
  }
  /**
   * funcCd4PopulateRetSplit3 This method is derived from COBOL Paragraph -
   * 5410-FUNC-CD4-POPULATE-RET-SPLIT3 COBOL Cyclomatic complexity - 1 Input :
   *
   * <p>- mmiSrvcCdYSetInd COBOL Name: MMI-SRVC-CD-Y-SET-IND - mmiSrvcCdZSetInd COBOL Name:
   * MMI-SRVC-CD-Z-SET-IND - mmiTier1CopayAmt COBOL Name: MMI-TIER-1-COPAY-AMT -
   * mmiTier1FamNewCoinsAmt COBOL Name: MMI-TIER-1-FAM-NEW-COINS-AMT - mmiTier1NewCoinsAmt COBOL
   * Name: MMI-TIER-1-NEW-COINS-AMT - mmiTier1UrgntCareAmt COBOL Name: MMI-TIER-1-URGNT-CARE-AMT -
   * mmiUrgntCareAmt COBOL Name: MMI-URGNT-CARE-AMT - mmiFamTxtSwapCd COBOL Name:
   * MMI-FAM-TXT-SWAP-CD - mmiFamMbrCnt COBOL Name: MMI-FAM-MBR-CNT - mmiCopayVarId COBOL Name:
   * MMI-COPAY-VAR-ID - mmiXtraTerrStMandInd COBOL Name: MMI-XTRA-TERR-ST-MAND-IND - mmiTierLblInd
   * COBOL Name: MMI-TIER-LBL-IND - mmiSpclProc3Cd COBOL Name: MMI-SPCL-PROC-3-CD -
   * mmiOopInNtwkEePls1Amt COBOL Name: MMI-OOP-IN-NTWK-EE-PLS-1-AMT - mmiOopInNtwkEeSpoAmt COBOL
   * Name: MMI-OOP-IN-NTWK-EE-SPO-AMT - mmiOopInNtwkEeChrgAmt COBOL Name:
   * MMI-OOP-IN-NTWK-EE-CHRG-AMT - mmiOopCombEePls1Amt COBOL Name: MMI-OOP-COMB-EE-PLS-1-AMT -
   * mmiOopCombEeSpoAmt COBOL Name: MMI-OOP-COMB-EE-SPO-AMT - mmiOopCombEeChrgAmt COBOL Name:
   * MMI-OOP-COMB-EE-CHRG-AMT - mmiDfltChrgPct COBOL Name: MMI-DFLT-CHRG-PCT - mmiNewCoinsAccumCd
   * COBOL Name: MMI-NEW-COINS-ACCUM-CD - mmiCoinsCopayCd COBOL Name: MMI-COINS-COPAY-CD -
   * mmiCopayMaxAnnlAmt COBOL Name: MMI-COPAY-MAX-ANNL-AMT - xrfCapXclsInd COBOL Name:
   * XRF-CAP-XCLS-IND - mmiCptnXclsInd COBOL Name: MMI-CPTN-XCLS-IND - mmiPrdctKeyCd COBOL Name:
   * MMI-PRDCT-KEY-CD - mmiRsnCustyPrdCd COBOL Name: MMI-RSN-CUSTY-PRD-CD - mmiFaclShrSvCd COBOL
   * Name: MMI-FACL-SHR-SV-CD - mmiPhysnShrSvCd COBOL Name: MMI-PHYSN-SHR-SV-CD - mmiRcprctyTblId
   * COBOL Name: MMI-RCPRCTY-TBL-ID - mmiBhvHlthVendCd COBOL Name: MMI-BHV-HLTH-VEND-CD - mmiAllncCd
   * COBOL Name: MMI-ALLNC-CD - mmiFundTypCd COBOL Name: MMI-FUND-TYP-CD - mmiPrdctCdId COBOL Name:
   * MMI-PRDCT-CD-ID - xrfEmergentWrpInd COBOL Name: XRF-EMERGENT-WRP-IND - mmiEmergentWrpInd COBOL
   * Name: MMI-EMERGENT-WRP-IND - mmiOopMaxCovCd COBOL Name: MMI-OOP-MAX-COV-CD - mmiSpclProc6Cd
   * COBOL Name: MMI-SPCL-PROC-6-CD - mmiSpclProc1Cd COBOL Name: MMI-SPCL-PROC-1-CD - mmiSpclProc2Cd
   * COBOL Name: MMI-SPCL-PROC-2-CD - mmiSpclProc4Cd COBOL Name: MMI-SPCL-PROC-4-CD - mmiSpclProc5Cd
   * COBOL Name: MMI-SPCL-PROC-5-CD - mmiSpclProc7Cd COBOL Name: MMI-SPCL-PROC-7-CD - mmiSpclProc8Cd
   * COBOL Name: MMI-SPCL-PROC-8-CD - mmiSpclProc9Cd COBOL Name: MMI-SPCL-PROC-9-CD -
   * mmiSpclProc10Cd COBOL Name: MMI-SPCL-PROC-10-CD - mmiNonEmbdCopayCd COBOL Name:
   * MMI-NON-EMBD-COPAY-CD - mmiNonEmbdCoreOopCd COBOL Name: MMI-NON-EMBD-CORE-OOP-CD -
   * mmiNonEmbdNewCoinsCd COBOL Name: MMI-NON-EMBD-NEW-COINS-CD - mmiNonEmbdCoreDedCd COBOL Name:
   * MMI-NON-EMBD-CORE-DED-CD - mmiXapplyCopayCd COBOL Name: MMI-XAPPLY-COPAY-CD - mmiXapplyOopCd
   * COBOL Name: MMI-XAPPLY-OOP-CD - mmiIndvOopCd COBOL Name: MMI-INDV-OOP-CD - mmiIndvPrdCd COBOL
   * Name: MMI-INDV-PRD-CD
   *
   * <p>Output :
   *
   * <p>- pol4RetSrvcCdYSetInd COBOL Name: POL4-RET-SRVC-CD-Y-SET-IND - mmiSrvcCdYSetInd COBOL Name:
   * MMI-SRVC-CD-Y-SET-IND - pol4RetSrvcCdZSetInd COBOL Name: POL4-RET-SRVC-CD-Z-SET-IND -
   * mmiSrvcCdZSetInd COBOL Name: MMI-SRVC-CD-Z-SET-IND - pol4Tier1CopayAmt COBOL Name:
   * POL4-TIER-1-COPAY-AMT - mmiTier1CopayAmt COBOL Name: MMI-TIER-1-COPAY-AMT -
   * pol4Tier1FamNewCoinsAmt COBOL Name: POL4-TIER-1-FAM-NEW-COINS-AMT - mmiTier1FamNewCoinsAmt
   * COBOL Name: MMI-TIER-1-FAM-NEW-COINS-AMT - pol4Tier1NewCoinsAmt COBOL Name:
   * POL4-TIER-1-NEW-COINS-AMT - mmiTier1NewCoinsAmt COBOL Name: MMI-TIER-1-NEW-COINS-AMT -
   * pol4Tier1UrgntCareAmt COBOL Name: POL4-TIER-1-URGNT-CARE-AMT - mmiTier1UrgntCareAmt COBOL Name:
   * MMI-TIER-1-URGNT-CARE-AMT - pol4UrgntCareAmt COBOL Name: POL4-URGNT-CARE-AMT - mmiUrgntCareAmt
   * COBOL Name: MMI-URGNT-CARE-AMT - pol4FamTxtSwapCd COBOL Name: POL4-FAM-TXT-SWAP-CD -
   * mmiFamTxtSwapCd COBOL Name: MMI-FAM-TXT-SWAP-CD - pol4FamMbrCnt COBOL Name: POL4-FAM-MBR-CNT -
   * mmiFamMbrCnt COBOL Name: MMI-FAM-MBR-CNT - pol4CopayVarId COBOL Name: POL4-COPAY-VAR-ID -
   * mmiCopayVarId COBOL Name: MMI-COPAY-VAR-ID - pol4XtraTerrStMandInd COBOL Name:
   * POL4-XTRA-TERR-ST-MAND-IND - mmiXtraTerrStMandInd COBOL Name: MMI-XTRA-TERR-ST-MAND-IND -
   * pol4TierLabelInd COBOL Name: POL4-TIER-LABEL-IND - mmiTierLblInd COBOL Name: MMI-TIER-LBL-IND -
   * pol4DedSpecialProcessCd COBOL Name: POL4-DED-SPECIAL-PROCESS-CD - mmiSpclProc3Cd COBOL Name:
   * MMI-SPCL-PROC-3-CD - pol4OopInNtwkEePls1Amt COBOL Name: POL4-OOP-IN-NTWK-EE-PLS-1-AMT -
   * mmiOopInNtwkEePls1Amt COBOL Name: MMI-OOP-IN-NTWK-EE-PLS-1-AMT - pol4OopInNtwkEeSpoAmt COBOL
   * Name: POL4-OOP-IN-NTWK-EE-SPO-AMT - mmiOopInNtwkEeSpoAmt COBOL Name: MMI-OOP-IN-NTWK-EE-SPO-AMT
   * - pol4OopInNtwkEeChrgAmt COBOL Name: POL4-OOP-IN-NTWK-EE-CHRG-AMT - mmiOopInNtwkEeChrgAmt COBOL
   * Name: MMI-OOP-IN-NTWK-EE-CHRG-AMT - pol4OopCombEePls1Amt COBOL Name: POL4-OOP-COMB-EE-PLS-1-AMT
   * - mmiOopCombEePls1Amt COBOL Name: MMI-OOP-COMB-EE-PLS-1-AMT - pol4OopCombEeSpoAmt COBOL Name:
   * POL4-OOP-COMB-EE-SPO-AMT - mmiOopCombEeSpoAmt COBOL Name: MMI-OOP-COMB-EE-SPO-AMT -
   * pol4OopCombEeChrgAmt COBOL Name: POL4-OOP-COMB-EE-CHRG-AMT - mmiOopCombEeChrgAmt COBOL Name:
   * MMI-OOP-COMB-EE-CHRG-AMT - dfltChgPct COBOL Name: WS-DFLT-CHG-PCT - mmiDfltChrgPct COBOL Name:
   * MMI-DFLT-CHRG-PCT - pol4DefaultRCPercent COBOL Name: POL4-DEFAULT-R-C-PERCENT -
   * pol4IndNewCoinsMaxInd COBOL Name: POL4-IND-NEW-COINS-MAX-IND - mmiNewCoinsAccumCd COBOL Name:
   * MMI-NEW-COINS-ACCUM-CD - pol4CoinsCopayApplyInd COBOL Name: POL4-COINS-COPAY-APPLY-IND -
   * mmiCoinsCopayCd COBOL Name: MMI-COINS-COPAY-CD - pol4CopayMaxAmt COBOL Name: POL4-COPAY-MAX-AMT
   * - mmiCopayMaxAnnlAmt COBOL Name: MMI-COPAY-MAX-ANNL-AMT - pol4CapitationExclInd COBOL Name:
   * POL4-CAPITATION-EXCL-IND - xrfCapXclsInd COBOL Name: XRF-CAP-XCLS-IND - mmiCptnXclsInd COBOL
   * Name: MMI-CPTN-XCLS-IND - pol4IndemnityInd COBOL Name: POL4-INDEMNITY-IND - mmiPrdctKeyCd COBOL
   * Name: MMI-PRDCT-KEY-CD - pol4AnnualRCInd COBOL Name: POL4-ANNUAL-R-C-IND - mmiRsnCustyPrdCd
   * COBOL Name: MMI-RSN-CUSTY-PRD-CD - pol4FacSharedSavInd COBOL Name: POL4-FAC-SHARED-SAV-IND -
   * mmiFaclShrSvCd COBOL Name: MMI-FACL-SHR-SV-CD - pol4PhysSharedSavInd COBOL Name:
   * POL4-PHYS-SHARED-SAV-IND - mmiPhysnShrSvCd COBOL Name: MMI-PHYSN-SHR-SV-CD - pol4TciTableNumber
   * COBOL Name: POL4-TCI-TABLE-NUMBER - mmiRcprctyTblId COBOL Name: MMI-RCPRCTY-TBL-ID -
   * pol4OhbsProductCd COBOL Name: POL4-OHBS-PRODUCT-CD - mmiBhvHlthVendCd COBOL Name:
   * MMI-BHV-HLTH-VEND-CD - pol4AllncCd COBOL Name: POL4-ALLNC-CD - mmiAllncCd COBOL Name:
   * MMI-ALLNC-CD - pol4FundTypCd COBOL Name: POL4-FUND-TYP-CD - mmiFundTypCd COBOL Name:
   * MMI-FUND-TYP-CD - pol4PrdctCdId COBOL Name: POL4-PRDCT-CD-ID - mmiPrdctCdId COBOL Name:
   * MMI-PRDCT-CD-ID - pol4EmergentWrapInd COBOL Name: POL4-EMERGENT-WRAP-IND - xrfEmergentWrpInd
   * COBOL Name: XRF-EMERGENT-WRP-IND - mmiEmergentWrpInd COBOL Name: MMI-EMERGENT-WRP-IND -
   * pol4RetOopMaxCovCd COBOL Name: POL4-RET-OOP-MAX-COV-CD - mmiOopMaxCovCd COBOL Name:
   * MMI-OOP-MAX-COV-CD - pol4SpecialProcessCd6 COBOL Name: POL4-SPECIAL-PROCESS-CD-6 -
   * mmiSpclProc6Cd COBOL Name: MMI-SPCL-PROC-6-CD - pol4SpecialProcessCd1 COBOL Name:
   * POL4-SPECIAL-PROCESS-CD-1 - mmiSpclProc1Cd COBOL Name: MMI-SPCL-PROC-1-CD -
   * pol4SpecialProcessCd2 COBOL Name: POL4-SPECIAL-PROCESS-CD-2 - mmiSpclProc2Cd COBOL Name:
   * MMI-SPCL-PROC-2-CD - pol4SpecialProcessCd4 COBOL Name: POL4-SPECIAL-PROCESS-CD-4 -
   * mmiSpclProc4Cd COBOL Name: MMI-SPCL-PROC-4-CD - pol4SpecialProcessCd5 COBOL Name:
   * POL4-SPECIAL-PROCESS-CD-5 - mmiSpclProc5Cd COBOL Name: MMI-SPCL-PROC-5-CD -
   * pol4SpecialProcessCd7 COBOL Name: POL4-SPECIAL-PROCESS-CD-7 - mmiSpclProc7Cd COBOL Name:
   * MMI-SPCL-PROC-7-CD - pol4SpecialProcessCd8 COBOL Name: POL4-SPECIAL-PROCESS-CD-8 -
   * mmiSpclProc8Cd COBOL Name: MMI-SPCL-PROC-8-CD - pol4SpecialProcessCd9 COBOL Name:
   * POL4-SPECIAL-PROCESS-CD-9 - mmiSpclProc9Cd COBOL Name: MMI-SPCL-PROC-9-CD -
   * pol4SpecialProcessCd10 COBOL Name: POL4-SPECIAL-PROCESS-CD-10 - mmiSpclProc10Cd COBOL Name:
   * MMI-SPCL-PROC-10-CD - pol4NonEmbMaxCopay COBOL Name: POL4-NON-EMB-MAX-COPAY - mmiNonEmbdCopayCd
   * COBOL Name: MMI-NON-EMBD-COPAY-CD - pol4NonEmbMaxOop COBOL Name: POL4-NON-EMB-MAX-OOP -
   * mmiNonEmbdCoreOopCd COBOL Name: MMI-NON-EMBD-CORE-OOP-CD - pol4NonEmbMaxCore COBOL Name:
   * POL4-NON-EMB-MAX-CORE - mmiNonEmbdNewCoinsCd COBOL Name: MMI-NON-EMBD-NEW-COINS-CD -
   * pol4NonEmbMaxDed COBOL Name: POL4-NON-EMB-MAX-DED - mmiNonEmbdCoreDedCd COBOL Name:
   * MMI-NON-EMBD-CORE-DED-CD - pol4CrossApplyCopayInd COBOL Name: POL4-CROSS-APPLY-COPAY-IND -
   * mmiXapplyCopayCd COBOL Name: MMI-XAPPLY-COPAY-CD - pol4CrossApplyCoreInd COBOL Name:
   * POL4-CROSS-APPLY-CORE-IND - mmiXapplyOopCd COBOL Name: MMI-XAPPLY-OOP-CD - pol4IndCoreMaxInd
   * COBOL Name: POL4-IND-CORE-MAX-IND - mmiIndvOopCd COBOL Name: MMI-INDV-OOP-CD - pol4IndCoreMaxPd
   * COBOL Name: POL4-IND-CORE-MAX-PD - mmiIndvPrdCd COBOL Name: MMI-INDV-PRD-CD
   *
   * @throws CFException
   */
  @Override
  public FuncCd4PopulateRetSplit3OutCtx funcCd4PopulateRetSplit3(
      FuncCd4PopulateRetSplit3InCtx methodIn) throws Exception {
    // Added variable to get the program context in place.
    D5427polCtx programCtx = methodIn.getD5427polCtx();
    // Added variable to get the output context in place.
    FuncCd4PopulateRetSplit3OutCtx methodOut = methodIn.getFuncCd4PopulateRetSplit3OutCtx();
    //  cobolCode::MOVE MMI-SRVC-CD-Y-SET-IND TO POL4-RET-SRVC-CD-Y-SET-IND
    methodOut.setPol4RetSrvcCdYSetInd(methodOut.getMmiSrvcCdYSetInd());
    //  cobolCode::MOVE MMI-SRVC-CD-Z-SET-IND TO POL4-RET-SRVC-CD-Z-SET-IND
    methodOut.setPol4RetSrvcCdZSetInd(methodOut.getMmiSrvcCdZSetInd());

    // ***  Move mmi-svi-tbl-pri-nbr    to pol4-svi-tbl-pri-nbr.
    //  cobolCode::MOVE MMI-TIER-1-COPAY-AMT TO POL4-TIER-1-COPAY-AMT
    methodOut.setPol4Tier1CopayAmt(methodOut.getMmiTier1CopayAmt());
    //  cobolCode::MOVE MMI-TIER-1-FAM-NEW-COINS-AMT TO POL4-TIER-1-FAM-NEW-COINS-AMT
    methodOut.setPol4Tier1FamNewCoinsAmt(methodOut.getMmiTier1FamNewCoinsAmt());
    //  cobolCode::MOVE MMI-TIER-1-NEW-COINS-AMT TO POL4-TIER-1-NEW-COINS-AMT
    methodOut.setPol4Tier1NewCoinsAmt(methodOut.getMmiTier1NewCoinsAmt());
    //  cobolCode::MOVE MMI-TIER-1-URGNT-CARE-AMT TO POL4-TIER-1-URGNT-CARE-AMT
    methodOut.setPol4Tier1UrgntCareAmt(methodOut.getMmiTier1UrgntCareAmt());
    //  cobolCode::MOVE MMI-URGNT-CARE-AMT TO POL4-URGNT-CARE-AMT
    methodOut.setPol4UrgntCareAmt(methodOut.getMmiUrgntCareAmt());
    //  cobolCode::MOVE MMI-FAM-TXT-SWAP-CD TO POL4-FAM-TXT-SWAP-CD
    methodOut.setPol4FamTxtSwapCd(methodOut.getMmiFamTxtSwapCd());
    //  cobolCode::MOVE MMI-FAM-MBR-CNT TO POL4-FAM-MBR-CNT
    methodOut.setPol4FamMbrCnt(methodOut.getMmiFamMbrCnt());
    //  cobolCode::MOVE MMI-COPAY-VAR-ID TO POL4-COPAY-VAR-ID
    methodOut.setPol4CopayVarId(methodOut.getMmiCopayVarId());
    //  cobolCode::MOVE MMI-XTRA-TERR-ST-MAND-IND TO POL4-XTRA-TERR-ST-MAND-IND
    methodOut.setPol4XtraTerrStMandInd(methodOut.getMmiXtraTerrStMandInd());
    //  cobolCode::MOVE MMI-TIER-LBL-IND TO POL4-TIER-LABEL-IND
    methodOut.setPol4TierLabelInd(methodOut.getMmiTierLblInd());
    //  cobolCode::MOVE MMI-SPCL-PROC-3-CD TO POL4-DED-SPECIAL-PROCESS-CD
    methodOut.setPol4DedSpecialProcessCd(methodOut.getMmiSpclProc3Cd());
    //  cobolCode::MOVE MMI-OOP-IN-NTWK-EE-PLS-1-AMT TO POL4-OOP-IN-NTWK-EE-PLS-1-AMT
    methodOut.setPol4OopInNtwkEePls1Amt(methodOut.getMmiOopInNtwkEePls1Amt());
    //  cobolCode::MOVE MMI-OOP-IN-NTWK-EE-SPO-AMT TO POL4-OOP-IN-NTWK-EE-SPO-AMT
    methodOut.setPol4OopInNtwkEeSpoAmt(methodOut.getMmiOopInNtwkEeSpoAmt());
    //  cobolCode::MOVE MMI-OOP-IN-NTWK-EE-CHRG-AMT TO POL4-OOP-IN-NTWK-EE-CHRG-AMT
    methodOut.setPol4OopInNtwkEeChrgAmt(methodOut.getMmiOopInNtwkEeChrgAmt());
    //  cobolCode::MOVE MMI-OOP-COMB-EE-PLS-1-AMT TO POL4-OOP-COMB-EE-PLS-1-AMT
    methodOut.setPol4OopCombEePls1Amt(methodOut.getMmiOopCombEePls1Amt());
    //  cobolCode::MOVE MMI-OOP-COMB-EE-SPO-AMT TO POL4-OOP-COMB-EE-SPO-AMT
    methodOut.setPol4OopCombEeSpoAmt(methodOut.getMmiOopCombEeSpoAmt());
    //  cobolCode::MOVE MMI-OOP-COMB-EE-CHRG-AMT TO POL4-OOP-COMB-EE-CHRG-AMT
    methodOut.setPol4OopCombEeChrgAmt(methodOut.getMmiOopCombEeChrgAmt());
    //  cobolCode::MOVE MMI-DFLT-CHRG-PCT TO WS-DFLT-CHG-PCT
    methodOut.setDfltChgPct(methodOut.getMmiDfltChrgPct().intValue());
    //  cobolCode::MOVE WS-DFLT-CHG-PCT TO POL4-DEFAULT-R-C-PERCENT
    methodOut.setPol4DefaultRCPercent(
        String.valueOf(methodOut.getDfltChgPctString()).toCharArray());
    //  cobolCode::MOVE MMI-NEW-COINS-ACCUM-CD TO POL4-IND-NEW-COINS-MAX-IND
    methodOut.setPol4IndNewCoinsMaxInd(methodOut.getMmiNewCoinsAccumCd());
    //  cobolCode::MOVE MMI-COINS-COPAY-CD TO POL4-COINS-COPAY-APPLY-IND
    methodOut.setPol4CoinsCopayApplyInd(methodOut.getMmiCoinsCopayCd());
    //  cobolCode::MOVE MMI-COPAY-MAX-ANNL-AMT TO POL4-COPAY-MAX-AMT
    methodOut.setPol4CopayMaxAmt(methodOut.getMmiCopayMaxAnnlAmt());
    //  cobolCode::IF XRF-CAP-XCLS-IND > SPACES
    if ((isGreaterThanSpaces(methodOut.getXrfCapXclsInd()))) {
      //  cobolCode::MOVE XRF-CAP-XCLS-IND TO POL4-CAPITATION-EXCL-IND
      methodOut.setPol4CapitationExclInd(methodOut.getXrfCapXclsInd());
    }
    //  cobolCode::ELSE
    else {
      //  cobolCode::MOVE MMI-CPTN-XCLS-IND TO POL4-CAPITATION-EXCL-IND
      methodOut.setPol4CapitationExclInd(methodOut.getMmiCptnXclsInd());
    }
    //  cobolCode::MOVE MMI-PRDCT-KEY-CD TO POL4-INDEMNITY-IND
    methodOut.setPol4IndemnityInd(methodOut.getMmiPrdctKeyCd());
    //  cobolCode::MOVE MMI-RSN-CUSTY-PRD-CD TO POL4-ANNUAL-R-C-IND
    methodOut.setPol4AnnualRCInd(methodOut.getMmiRsnCustyPrdCd());
    //  cobolCode::MOVE MMI-FACL-SHR-SV-CD TO POL4-FAC-SHARED-SAV-IND
    methodOut.setPol4FacSharedSavInd(methodOut.getMmiFaclShrSvCd());
    //  cobolCode::MOVE MMI-PHYSN-SHR-SV-CD TO POL4-PHYS-SHARED-SAV-IND
    methodOut.setPol4PhysSharedSavInd(methodOut.getMmiPhysnShrSvCd());
    //  cobolCode::MOVE MMI-RCPRCTY-TBL-ID TO POL4-TCI-TABLE-NUMBER
    methodOut.setPol4TciTableNumber(methodOut.getMmiRcprctyTblId());
    //  cobolCode::MOVE MMI-BHV-HLTH-VEND-CD TO POL4-OHBS-PRODUCT-CD
    methodOut.setPol4OhbsProductCd(methodOut.getMmiBhvHlthVendCd());

    // *    Move dpar-prdct-cd(1:1)    to pol4-ohbs-product-cd.
    // ***--> plan feature movement
    // ***57589a     move mmi-pln-ftur-cd     to   pol4-plan-features.
    // ***--> funding arrangement and product key movement
    //  cobolCode::MOVE MMI-ALLNC-CD TO POL4-ALLNC-CD
    methodOut.setPol4AllncCd(methodOut.getMmiAllncCd());
    //  cobolCode::MOVE MMI-FUND-TYP-CD TO POL4-FUND-TYP-CD
    methodOut.setPol4FundTypCd(methodOut.getMmiFundTypCd());
    //  cobolCode::MOVE MMI-PRDCT-CD-ID TO POL4-PRDCT-CD-ID
    methodOut.setPol4PrdctCdId(methodOut.getMmiPrdctCdId());

    // *** - If er indicator on mxi is greater than space (that means
    // ***   valued with "y" or "n") then pol4-emergent-wrap-ind would be
    // ***   sourced from mxi otherwise would be sourced from mmi.
    //  cobolCode::IF XRF-EMERGENT-WRP-IND > SPACES
    if ((isGreaterThanSpaces(methodOut.getXrfEmergentWrpInd()))) {
      //  cobolCode::MOVE XRF-EMERGENT-WRP-IND TO POL4-EMERGENT-WRAP-IND
      methodOut.setPol4EmergentWrapInd(methodOut.getXrfEmergentWrpInd());
    }
    //  cobolCode::ELSE
    else {
      //  cobolCode::MOVE MMI-EMERGENT-WRP-IND TO POL4-EMERGENT-WRAP-IND
      methodOut.setPol4EmergentWrapInd(methodOut.getMmiEmergentWrpInd());
    }

    // *** - Oop maximum indicator for func-cd "04"

    // *** -"Spec proc codes", mmi page 1, position 06
    //  cobolCode::MOVE MMI-OOP-MAX-COV-CD TO POL4-RET-OOP-MAX-COV-CD
    methodOut.setPol4RetOopMaxCovCd(methodOut.getMmiOopMaxCovCd());
    //  cobolCode::MOVE MMI-SPCL-PROC-6-CD TO POL4-SPECIAL-PROCESS-CD-6
    methodOut.setPol4SpecialProcessCd6(methodOut.getMmiSpclProc6Cd());
    //  cobolCode::MOVE MMI-SPCL-PROC-1-CD TO POL4-SPECIAL-PROCESS-CD-1
    methodOut.setPol4SpecialProcessCd1(methodOut.getMmiSpclProc1Cd());
    //  cobolCode::MOVE MMI-SPCL-PROC-2-CD TO POL4-SPECIAL-PROCESS-CD-2
    methodOut.setPol4SpecialProcessCd2(methodOut.getMmiSpclProc2Cd());
    //  cobolCode::MOVE MMI-SPCL-PROC-4-CD TO POL4-SPECIAL-PROCESS-CD-4
    methodOut.setPol4SpecialProcessCd4(methodOut.getMmiSpclProc4Cd());
    //  cobolCode::MOVE MMI-SPCL-PROC-5-CD TO POL4-SPECIAL-PROCESS-CD-5
    methodOut.setPol4SpecialProcessCd5(methodOut.getMmiSpclProc5Cd());
    //  cobolCode::MOVE MMI-SPCL-PROC-7-CD TO POL4-SPECIAL-PROCESS-CD-7
    methodOut.setPol4SpecialProcessCd7(methodOut.getMmiSpclProc7Cd());
    //  cobolCode::MOVE MMI-SPCL-PROC-8-CD TO POL4-SPECIAL-PROCESS-CD-8
    methodOut.setPol4SpecialProcessCd8(methodOut.getMmiSpclProc8Cd());
    //  cobolCode::MOVE MMI-SPCL-PROC-9-CD TO POL4-SPECIAL-PROCESS-CD-9
    methodOut.setPol4SpecialProcessCd9(methodOut.getMmiSpclProc9Cd());
    //  cobolCode::MOVE MMI-SPCL-PROC-10-CD TO POL4-SPECIAL-PROCESS-CD-10
    methodOut.setPol4SpecialProcessCd10(methodOut.getMmiSpclProc10Cd());
    //  cobolCode::MOVE MMI-NON-EMBD-COPAY-CD TO POL4-NON-EMB-MAX-COPAY
    methodOut.setPol4NonEmbMaxCopay(methodOut.getMmiNonEmbdCopayCd());
    //  cobolCode::MOVE MMI-NON-EMBD-CORE-OOP-CD TO POL4-NON-EMB-MAX-OOP
    methodOut.setPol4NonEmbMaxOop(methodOut.getMmiNonEmbdCoreOopCd());
    //  cobolCode::MOVE MMI-NON-EMBD-NEW-COINS-CD TO POL4-NON-EMB-MAX-CORE
    methodOut.setPol4NonEmbMaxCore(methodOut.getMmiNonEmbdNewCoinsCd());
    //  cobolCode::MOVE MMI-NON-EMBD-CORE-DED-CD TO POL4-NON-EMB-MAX-DED
    methodOut.setPol4NonEmbMaxDed(methodOut.getMmiNonEmbdCoreDedCd());
    //  cobolCode::MOVE MMI-XAPPLY-COPAY-CD TO POL4-CROSS-APPLY-COPAY-IND
    methodOut.setPol4CrossApplyCopayInd(methodOut.getMmiXapplyCopayCd());
    //  cobolCode::MOVE MMI-XAPPLY-OOP-CD TO POL4-CROSS-APPLY-CORE-IND
    methodOut.setPol4CrossApplyCoreInd(methodOut.getMmiXapplyOopCd());
    //  cobolCode::MOVE MMI-INDV-OOP-CD TO POL4-IND-CORE-MAX-IND
    methodOut.setPol4IndCoreMaxInd(methodOut.getMmiIndvOopCd());
    //  cobolCode::MOVE MMI-INDV-PRD-CD TO POL4-IND-CORE-MAX-PD
    methodOut.setPol4IndCoreMaxPd(methodOut.getMmiIndvPrdCd());

    return methodOut;
  }
  /**
   * funcCd4PopulateRetSplit4 This method is derived from COBOL Paragraph -
   * 5410-FUNC-CD4-POPULATE-RET-SPLIT4 COBOL Cyclomatic complexity - 1 Input :
   *
   * <p>- mmiIndvSalryTypCd COBOL Name: MMI-INDV-SALRY-TYP-CD - mmiFamSalryTypCd COBOL Name:
   * MMI-FAM-SALRY-TYP-CD - mmiFamMultPct COBOL Name: MMI-FAM-MULT-PCT - mmiLmtSrvcCd COBOL Name:
   * MMI-LMT-SRVC-CD - mmaNptRulePkgId COBOL Name: MMA-NPT-RULE-PKG-ID - mmaRhabCombPtLmtCd COBOL
   * Name: MMA-RHAB-COMB-PT-LMT-CD - mmaRhabCombOtLmtCd COBOL Name: MMA-RHAB-COMB-OT-LMT-CD -
   * mmaRhabCombStLmtCd COBOL Name: MMA-RHAB-COMB-ST-LMT-CD - mmaRhabCombSmLmtCd COBOL Name:
   * MMA-RHAB-COMB-SM-LMT-CD - mmaRhabCombCiLmtCd COBOL Name: MMA-RHAB-COMB-CI-LMT-CD -
   * mmaRhabCombCtLmtCd COBOL Name: MMA-RHAB-COMB-CT-LMT-CD - mmaRhabCombCrLmtCd COBOL Name:
   * MMA-RHAB-COMB-CR-LMT-CD - mmaRhabCombPrLmtCd COBOL Name: MMA-RHAB-COMB-PR-LMT-CD -
   * mmaRhabCombMtLmtCd COBOL Name: MMA-RHAB-COMB-MT-LMT-CD - mmaHabCombPtLmtCd COBOL Name:
   * MMA-HAB-COMB-PT-LMT-CD - mmaHabCombOtLmtCd COBOL Name: MMA-HAB-COMB-OT-LMT-CD -
   * mmaHabCombStLmtCd COBOL Name: MMA-HAB-COMB-ST-LMT-CD - mmaHabCombSmLmtCd COBOL Name:
   * MMA-HAB-COMB-SM-LMT-CD - mmaHabCombCiLmtCd COBOL Name: MMA-HAB-COMB-CI-LMT-CD -
   * mmaHabCombCtLmtCd COBOL Name: MMA-HAB-COMB-CT-LMT-CD - mmaHabCombMtLmtCd COBOL Name:
   * MMA-HAB-COMB-MT-LMT-CD - mmaUgiInd COBOL Name: MMA-UGI-IND - mmaLgiInd COBOL Name: MMA-LGI-IND
   * - mmaExdInd COBOL Name: MMA-EXD-IND - mmiOopCombNbrCd COBOL Name: MMI-OOP-COMB-NBR-CD
   *
   * <p>Output :
   *
   * <p>- pol4CoreSlryIndvTypCd COBOL Name: POL4-CORE-SLRY-INDV-TYP-CD - mmiIndvSalryTypCd COBOL
   * Name: MMI-INDV-SALRY-TYP-CD - pol4CoreSlryFamTypCd COBOL Name: POL4-CORE-SLRY-FAM-TYP-CD -
   * mmiFamSalryTypCd COBOL Name: MMI-FAM-SALRY-TYP-CD - pol4CoreSlryFamMultFct COBOL Name:
   * POL4-CORE-SLRY-FAM-MULT-FCT - mmiFamMultPct COBOL Name: MMI-FAM-MULT-PCT - pol4RetLmtSrvcCd
   * COBOL Name: POL4-RET-LMT-SRVC-CD - mmiLmtSrvcCd COBOL Name: MMI-LMT-SRVC-CD - pol4NptRulePkgId
   * COBOL Name: POL4-NPT-RULE-PKG-ID - mmaNptRulePkgId COBOL Name: MMA-NPT-RULE-PKG-ID -
   * pol4RetRhabCombPtLmtCd COBOL Name: POL4-RET-RHAB-COMB-PT-LMT-CD - mmaRhabCombPtLmtCd COBOL
   * Name: MMA-RHAB-COMB-PT-LMT-CD - pol4RetRhabCombOtLmtCd COBOL Name: POL4-RET-RHAB-COMB-OT-LMT-CD
   * - mmaRhabCombOtLmtCd COBOL Name: MMA-RHAB-COMB-OT-LMT-CD - pol4RetRhabCombStLmtCd COBOL Name:
   * POL4-RET-RHAB-COMB-ST-LMT-CD - mmaRhabCombStLmtCd COBOL Name: MMA-RHAB-COMB-ST-LMT-CD -
   * pol4RetRhabCombSmLmtCd COBOL Name: POL4-RET-RHAB-COMB-SM-LMT-CD - mmaRhabCombSmLmtCd COBOL
   * Name: MMA-RHAB-COMB-SM-LMT-CD - pol4RetRhabCombCiLmtCd COBOL Name: POL4-RET-RHAB-COMB-CI-LMT-CD
   * - mmaRhabCombCiLmtCd COBOL Name: MMA-RHAB-COMB-CI-LMT-CD - pol4RetRhabCombCtLmtCd COBOL Name:
   * POL4-RET-RHAB-COMB-CT-LMT-CD - mmaRhabCombCtLmtCd COBOL Name: MMA-RHAB-COMB-CT-LMT-CD -
   * pol4RetRhabCombCrLmtCd COBOL Name: POL4-RET-RHAB-COMB-CR-LMT-CD - mmaRhabCombCrLmtCd COBOL
   * Name: MMA-RHAB-COMB-CR-LMT-CD - pol4RetRhabCombPrLmtCd COBOL Name: POL4-RET-RHAB-COMB-PR-LMT-CD
   * - mmaRhabCombPrLmtCd COBOL Name: MMA-RHAB-COMB-PR-LMT-CD - pol4RetRhabCombMtLmtCd COBOL Name:
   * POL4-RET-RHAB-COMB-MT-LMT-CD - mmaRhabCombMtLmtCd COBOL Name: MMA-RHAB-COMB-MT-LMT-CD -
   * pol4RetHabCombPtLmtCd COBOL Name: POL4-RET-HAB-COMB-PT-LMT-CD - mmaHabCombPtLmtCd COBOL Name:
   * MMA-HAB-COMB-PT-LMT-CD - pol4RetHabCombOtLmtCd COBOL Name: POL4-RET-HAB-COMB-OT-LMT-CD -
   * mmaHabCombOtLmtCd COBOL Name: MMA-HAB-COMB-OT-LMT-CD - pol4RetHabCombStLmtCd COBOL Name:
   * POL4-RET-HAB-COMB-ST-LMT-CD - mmaHabCombStLmtCd COBOL Name: MMA-HAB-COMB-ST-LMT-CD -
   * pol4RetHabCombSmLmtCd COBOL Name: POL4-RET-HAB-COMB-SM-LMT-CD - mmaHabCombSmLmtCd COBOL Name:
   * MMA-HAB-COMB-SM-LMT-CD - pol4RetHabCombCiLmtCd COBOL Name: POL4-RET-HAB-COMB-CI-LMT-CD -
   * mmaHabCombCiLmtCd COBOL Name: MMA-HAB-COMB-CI-LMT-CD - pol4RetHabCombCtLmtCd COBOL Name:
   * POL4-RET-HAB-COMB-CT-LMT-CD - mmaHabCombCtLmtCd COBOL Name: MMA-HAB-COMB-CT-LMT-CD -
   * pol4RetHabCombMtLmtCd COBOL Name: POL4-RET-HAB-COMB-MT-LMT-CD - mmaHabCombMtLmtCd COBOL Name:
   * MMA-HAB-COMB-MT-LMT-CD - pol4RetUgiInd COBOL Name: POL4-RET-UGI-IND - mmaUgiInd COBOL Name:
   * MMA-UGI-IND - pol4RetLgiInd COBOL Name: POL4-RET-LGI-IND - mmaLgiInd COBOL Name: MMA-LGI-IND -
   * pol4RetExdInd COBOL Name: POL4-RET-EXD-IND - mmaExdInd COBOL Name: MMA-EXD-IND -
   * pol4RetDualOopNbrInd COBOL Name: POL4-RET-DUAL-OOP-NBR-IND - mmiOopCombNbrCd COBOL Name:
   * MMI-OOP-COMB-NBR-CD
   *
   * @throws CFException
   */
  @Override
  public FuncCd4PopulateRetSplit4OutCtx funcCd4PopulateRetSplit4(
      FuncCd4PopulateRetSplit4InCtx methodIn) throws Exception {
    // Added variable to get the program context in place.
    D5427polCtx programCtx = methodIn.getD5427polCtx();
    // Added variable to get the output context in place.
    FuncCd4PopulateRetSplit4OutCtx methodOut = methodIn.getFuncCd4PopulateRetSplit4OutCtx();
    //  cobolCode::MOVE MMI-INDV-SALRY-TYP-CD TO POL4-CORE-SLRY-INDV-TYP-CD
    methodOut.setPol4CoreSlryIndvTypCd(methodOut.getMmiIndvSalryTypCd());
    //  cobolCode::MOVE MMI-FAM-SALRY-TYP-CD TO POL4-CORE-SLRY-FAM-TYP-CD
    methodOut.setPol4CoreSlryFamTypCd(methodOut.getMmiFamSalryTypCd());
    //  cobolCode::MOVE MMI-FAM-MULT-PCT TO POL4-CORE-SLRY-FAM-MULT-FCT
    methodOut.setPol4CoreSlryFamMultFct(methodOut.getMmiFamMultPct());
    //  cobolCode::MOVE MMI-LMT-SRVC-CD TO POL4-RET-LMT-SRVC-CD
    methodOut.setPol4RetLmtSrvcCd(methodOut.getMmiLmtSrvcCd());
    //  cobolCode::MOVE MMA-NPT-RULE-PKG-ID TO POL4-NPT-RULE-PKG-ID
    methodOut.setPol4NptRulePkgId(methodOut.getMmaNptRulePkgId());
    //  cobolCode::MOVE MMA-RHAB-COMB-PT-LMT-CD TO POL4-RET-RHAB-COMB-PT-LMT-CD
    methodOut.setPol4RetRhabCombPtLmtCd(methodOut.getMmaRhabCombPtLmtCd());
    //  cobolCode::MOVE MMA-RHAB-COMB-OT-LMT-CD TO POL4-RET-RHAB-COMB-OT-LMT-CD
    methodOut.setPol4RetRhabCombOtLmtCd(methodOut.getMmaRhabCombOtLmtCd());
    //  cobolCode::MOVE MMA-RHAB-COMB-ST-LMT-CD TO POL4-RET-RHAB-COMB-ST-LMT-CD
    methodOut.setPol4RetRhabCombStLmtCd(methodOut.getMmaRhabCombStLmtCd());
    //  cobolCode::MOVE MMA-RHAB-COMB-SM-LMT-CD TO POL4-RET-RHAB-COMB-SM-LMT-CD
    methodOut.setPol4RetRhabCombSmLmtCd(methodOut.getMmaRhabCombSmLmtCd());
    //  cobolCode::MOVE MMA-RHAB-COMB-CI-LMT-CD TO POL4-RET-RHAB-COMB-CI-LMT-CD
    methodOut.setPol4RetRhabCombCiLmtCd(methodOut.getMmaRhabCombCiLmtCd());
    //  cobolCode::MOVE MMA-RHAB-COMB-CT-LMT-CD TO POL4-RET-RHAB-COMB-CT-LMT-CD
    methodOut.setPol4RetRhabCombCtLmtCd(methodOut.getMmaRhabCombCtLmtCd());
    //  cobolCode::MOVE MMA-RHAB-COMB-CR-LMT-CD TO POL4-RET-RHAB-COMB-CR-LMT-CD
    methodOut.setPol4RetRhabCombCrLmtCd(methodOut.getMmaRhabCombCrLmtCd());
    //  cobolCode::MOVE MMA-RHAB-COMB-PR-LMT-CD TO POL4-RET-RHAB-COMB-PR-LMT-CD
    methodOut.setPol4RetRhabCombPrLmtCd(methodOut.getMmaRhabCombPrLmtCd());
    //  cobolCode::MOVE MMA-RHAB-COMB-MT-LMT-CD TO POL4-RET-RHAB-COMB-MT-LMT-CD
    methodOut.setPol4RetRhabCombMtLmtCd(methodOut.getMmaRhabCombMtLmtCd());
    //  cobolCode::MOVE MMA-HAB-COMB-PT-LMT-CD TO POL4-RET-HAB-COMB-PT-LMT-CD
    methodOut.setPol4RetHabCombPtLmtCd(methodOut.getMmaHabCombPtLmtCd());
    //  cobolCode::MOVE MMA-HAB-COMB-OT-LMT-CD TO POL4-RET-HAB-COMB-OT-LMT-CD
    methodOut.setPol4RetHabCombOtLmtCd(methodOut.getMmaHabCombOtLmtCd());
    //  cobolCode::MOVE MMA-HAB-COMB-ST-LMT-CD TO POL4-RET-HAB-COMB-ST-LMT-CD
    methodOut.setPol4RetHabCombStLmtCd(methodOut.getMmaHabCombStLmtCd());
    //  cobolCode::MOVE MMA-HAB-COMB-SM-LMT-CD TO POL4-RET-HAB-COMB-SM-LMT-CD
    methodOut.setPol4RetHabCombSmLmtCd(methodOut.getMmaHabCombSmLmtCd());
    //  cobolCode::MOVE MMA-HAB-COMB-CI-LMT-CD TO POL4-RET-HAB-COMB-CI-LMT-CD
    methodOut.setPol4RetHabCombCiLmtCd(methodOut.getMmaHabCombCiLmtCd());
    //  cobolCode::MOVE MMA-HAB-COMB-CT-LMT-CD TO POL4-RET-HAB-COMB-CT-LMT-CD
    methodOut.setPol4RetHabCombCtLmtCd(methodOut.getMmaHabCombCtLmtCd());
    //  cobolCode::MOVE MMA-HAB-COMB-MT-LMT-CD TO POL4-RET-HAB-COMB-MT-LMT-CD
    methodOut.setPol4RetHabCombMtLmtCd(methodOut.getMmaHabCombMtLmtCd());
    //  cobolCode::MOVE MMA-UGI-IND TO POL4-RET-UGI-IND
    methodOut.setPol4RetUgiInd(methodOut.getMmaUgiInd());
    //  cobolCode::MOVE MMA-LGI-IND TO POL4-RET-LGI-IND
    methodOut.setPol4RetLgiInd(methodOut.getMmaLgiInd());
    //  cobolCode::MOVE MMA-EXD-IND TO POL4-RET-EXD-IND
    methodOut.setPol4RetExdInd(methodOut.getMmaExdInd());
    //  cobolCode::MOVE MMI-OOP-COMB-NBR-CD TO POL4-RET-DUAL-OOP-NBR-IND
    methodOut.setPol4RetDualOopNbrInd(methodOut.getMmiOopCombNbrCd());

    return methodOut;
  }
  /**
   * funcCd4PolbenlvlRead This method is derived from COBOL Paragraph - 5500-FUNC-CD4-POLBENLVL-READ
   * SECTION COBOL Cyclomatic complexity - 2 Input :
   *
   * <p>- sqlcode_Ws COBOL Name: WS-SQLCODE
   *
   * <p>Output : None
   *
   * @throws CFException
   */
  @Override
  public FuncCd4PolbenlvlReadOutCtx funcCd4PolbenlvlRead(FuncCd4PolbenlvlReadInCtx methodIn)
      throws Exception {

    // *81***************************************************************
    // *81 5500-Func-cd4-polbenlvl-read.                                *
    // *81 business function: read benifit level mmi table              *
    // *81***************************************************************
    // *82***************************************************************
    // *82 5500-func-cd4-polbenlvl-read.                                *
    // *82 fetch records from pol_pln_mstr_ben_lvl for given policy/plan*
    // *82***************************************************************
    // Added variable to get the program context in place.
    D5427polCtx programCtx = methodIn.getD5427polCtx();
    // Added variable to get the output context in place.
    FuncCd4PolbenlvlReadOutCtx methodOut = methodIn.getFuncCd4PolbenlvlReadOutCtx();
    //  cobolCode::PERFORM 5510-OPEN-POLBENLVL-CURSOR
    openPolbenlvlCursor(
        programCtx.getOpenPolbenlvlCursorInCtx()); /*5510-OPEN-POLBENLVL-CURSOR SECTION*/
    if (programCtx.isProgramEnded()) {
      return methodOut;
    }
    //  cobolCode::IF WS-SQLCODE-OK
    if (methodIn.isSqlcodeOk()) {
      //  cobolCode::PERFORM 5520-FETCH-POLBENLVL-CURSOR
      fetchPolbenlvlCursor(
          programCtx.getFetchPolbenlvlCursorInCtx()); /*5520-FETCH-POLBENLVL-CURSOR SECTION*/
      if (programCtx.isProgramEnded()) {
        return methodOut;
      }
    }
    //  cobolCode::PERFORM 5530-CLOSE-POLBENLVL-CURSOR
    closePolbenlvlCursor(
        programCtx.getClosePolbenlvlCursorInCtx()); /*5530-CLOSE-POLBENLVL-CURSOR SECTION*/
    if (programCtx.isProgramEnded()) {
      return methodOut;
    }

    return methodOut;
  }
  /**
   * openPolbenlvlCursor This method is derived from COBOL Paragraph - 5510-OPEN-POLBENLVL-CURSOR
   * SECTION COBOL Cyclomatic complexity - 4 Input :
   *
   * <p>- sqlcode COBOL Name: SQLCODE
   *
   * <p>Output :
   *
   * <p>- sqlcode_Ws COBOL Name: WS-SQLCODE - dsmSqlcode COBOL Name: DSM-SQLCODE - sqlcode COBOL
   * Name: SQLCODE - dsmReturnCode COBOL Name: DSM-RETURN-CODE - dsmErrTblAction COBOL Name:
   * DSM-ERR-TBL-ACTION - dsmErrTblName COBOL Name: DSM-ERR-TBL-NAME - dsmErrSectnName COBOL Name:
   * DSM-ERR-SECTN-NAME - dsmErrPgmName COBOL Name: DSM-ERR-PGM-NAME
   *
   * @throws CFException
   */
  @Override
  public OpenPolbenlvlCursorOutCtx openPolbenlvlCursor(OpenPolbenlvlCursorInCtx methodIn)
      throws Exception {

    // *81***************************************************************
    // *81 5510-Open-polbenlvl-cursor                                   *
    // *81 business function: open the cursor                           *
    // *81***************************************************************
    // *82***************************************************************
    // *82 5510-open-polbenlvl-cursor                                   *
    // *82 1. open cursor cur-ben-lvl                                   *
    // *82***************************************************************
    // Added variable to get the program context in place.
    D5427polCtx programCtx = methodIn.getD5427polCtx();
    // Added variable to get the output context in place.
    OpenPolbenlvlCursorOutCtx methodOut = methodIn.getOpenPolbenlvlCursorOutCtx();
    //  cobolCode::SELECT BEN_LVL_TYP_CD , BAS_PCT_OVRLAY_CD , INCNT_PNTLY_BAS_CD ,
    // INCNT_PNTLY_BAS_PCT , INCNT_PNTLY_MED_CD , INCNT_PNTLY_MED_PCT , OVERLAY_PCT_CD , DED_DESC_CD
    // FROM POL_PLN_MSTR_BEN_LVL WHERE COV_TYP_CD = ? AND POL_NBR = ? AND PLN_NBR = ? AND CLSS_NBR =
    // ? FOR FETCH ONLY
    programCtx.setCurBenLvlResultSet(
        d5427polRepository.openCurBenLvlD5427pol(
            programCtx.getSqlca(), methodIn.getDclpolPlnMstrBenLvl()));
    //  cobolCode::MOVE SQLCODE TO WS-SQLCODE DSM-SQLCODE
    methodOut.setSqlcode_Ws(methodOut.getSqlcode());
    methodOut.setDsmSqlcode(methodOut.getSqlcode());
    //  cobolCode::EVALUATE TRUE
    if (methodOut.isSqlcodeOk()) {;
    } else {
      //  cobolCode::SET DSM-DB2-ERROR TO TRUE
      methodOut.setDsmDb2ErrorTrue();

      //  cobolCode::MOVE 'OPEN' TO DSM-ERR-TBL-ACTION
      methodOut.setDsmErrTblAction(CONSTANTS.LITERAL_OPEN_B6_);
      //  cobolCode::MOVE 'POL_PLN_MSTR_BEN_LVL' TO DSM-ERR-TBL-NAME
      methodOut.setDsmErrTblName(CONSTANTS.LITERAL_POL_PLN_MSTR_BEN_LVL_B5_);
      //  cobolCode::MOVE '5510-OPEN-POLBENLVL-CURSOR' TO DSM-ERR-SECTN-NAME
      methodOut.setDsmErrSectnName(CONSTANTS.LITERAL_449514612);
      //  cobolCode::MOVE 'D5427POL' TO DSM-ERR-PGM-NAME
      //  LITERAL_D5427POL = 'D5427POL'
      methodOut.setDsmErrPgmName(CONSTANTS.LITERAL_D5427POL);
      //  cobolCode::PERFORM 7777-MOVES-FOR-ERROR-LOG
      movesForErrorLog(programCtx.getMovesForErrorLogInCtx()); /*7777-MOVES-FOR-ERROR-LOG SECTION*/
      if (programCtx.isProgramEnded()) {
        return methodOut;
      }
    }

    return methodOut;
  }
  /**
   * fetchPolbenlvlCursor This method is derived from COBOL Paragraph - 5520-FETCH-POLBENLVL-CURSOR
   * SECTION COBOL Cyclomatic complexity - 7 Input :
   *
   * <p>- sqlcode_Ws COBOL Name: WS-SQLCODE - sqlcode COBOL Name: SQLCODE
   *
   * <p>Output :
   *
   * <p>- lineSub COBOL Name: WS-LINE-SUB - sqlcode_Ws COBOL Name: WS-SQLCODE - dsmSqlcode COBOL
   * Name: DSM-SQLCODE - sqlcode COBOL Name: SQLCODE - dsmReturnCode COBOL Name: DSM-RETURN-CODE -
   * dsmErrTblAction COBOL Name: DSM-ERR-TBL-ACTION - dsmErrTblName COBOL Name: DSM-ERR-TBL-NAME -
   * dsmErrSectnName COBOL Name: DSM-ERR-SECTN-NAME - dsmErrPgmName COBOL Name: DSM-ERR-PGM-NAME
   *
   * @throws CFException
   */
  @Override
  public FetchPolbenlvlCursorOutCtx fetchPolbenlvlCursor(FetchPolbenlvlCursorInCtx methodIn)
      throws Exception {

    // *81***************************************************************
    // *81 5520-Fetch-polbenlvl-cursor                                  *
    // *81 business function: fetch the records                         *
    // *81***************************************************************
    // *82***************************************************************
    // *82 5520-fetch-poldblv-cursor.                                   *
    // *82 1. fetch records using cursor cur-ben-lvl                    *
    // *82***************************************************************
    // Added variable to get the program context in place.
    D5427polCtx programCtx = methodIn.getD5427polCtx();
    // Added variable to get the output context in place.
    FetchPolbenlvlCursorOutCtx methodOut = methodIn.getFetchPolbenlvlCursorOutCtx();
    methodOut.setLineSub(1);
    //  cobolCode::PERFORM UNTIL WS-SQLCODE-NOT-FOUND
    while ((!(methodIn.isSqlcodeNotFound()))) {
      //  cobolCode::FETCH CUR-BEN-LVL INTO ? , ? , ? , ? , ? , ? , ? , ?
      d5427polRepository.fetchCurBenLvlD5427pol(
          programCtx.getCurBenLvlResultSet(),
          programCtx.getSqlca(),
          methodOut.getDclpolPlnMstrBenLvl());
      //  cobolCode::MOVE SQLCODE TO WS-SQLCODE DSM-SQLCODE
      methodOut.setSqlcode_Ws(methodOut.getSqlcode());
      methodOut.setDsmSqlcode(methodOut.getSqlcode());
      //  cobolCode::EVALUATE TRUE
      if (methodOut.isSqlcodeOk()) {
        //  cobolCode::IF WS-LINE-SUB > 6
        if ((methodOut.getLineSub() > 6)) {
          //  cobolCode::SET DSM-DB2-ERROR TO TRUE
          methodOut.setDsmDb2ErrorTrue();

          //  cobolCode::MOVE 'TBL OVRFLO' TO DSM-ERR-TBL-ACTION
          //  LITERAL_TBL_B_OVRFLO = 'TBL OVRFLO'
          methodOut.setDsmErrTblAction(CONSTANTS.LITERAL_TBL_B_OVRFLO);
          //  cobolCode::MOVE 'POL_PLN_MSTR_BEN_LVL' TO DSM-ERR-TBL-NAME
          methodOut.setDsmErrTblName(CONSTANTS.LITERAL_POL_PLN_MSTR_BEN_LVL_B5_);
          //  cobolCode::MOVE '5520-FETCH-POLBENLVL-CURSOR' TO DSM-ERR-SECTN-NAME
          methodOut.setDsmErrSectnName(CONSTANTS.LITERAL_660324705);
          //  cobolCode::MOVE 'D5427POL' TO DSM-ERR-PGM-NAME
          //  LITERAL_D5427POL = 'D5427POL'
          methodOut.setDsmErrPgmName(CONSTANTS.LITERAL_D5427POL);
          //  cobolCode::PERFORM 7777-MOVES-FOR-ERROR-LOG
          movesForErrorLog(
              programCtx.getMovesForErrorLogInCtx()); /*7777-MOVES-FOR-ERROR-LOG SECTION*/
          if (programCtx.isProgramEnded()) {
            return methodOut;
          }
        }
        //  cobolCode::PERFORM 5540-POPULATE-RET-POL4-DBLV
        populateRetPol4Dblv(
            programCtx.getPopulateRetPol4DblvInCtx()); /*5540-POPULATE-RET-POL4-DBLV SECTION*/
        if (programCtx.isProgramEnded()) {
          return methodOut;
        }
        //  cobolCode::ADD 1 TO WS-LINE-SUB
        methodOut.setLineSub(methodOut.getLineSub() + 1);
      } else if (methodIn.isSqlcodeNotFound()) {;
      } else {
        //  cobolCode::SET DSM-DB2-ERROR TO TRUE
        methodOut.setDsmDb2ErrorTrue();

        //  cobolCode::MOVE 'FETCH' TO DSM-ERR-TBL-ACTION
        methodOut.setDsmErrTblAction(CONSTANTS.LITERAL_FETCH_B5_);
        //  cobolCode::MOVE 'POL_PLN_MSTR_BEN_LVL' TO DSM-ERR-TBL-NAME
        methodOut.setDsmErrTblName(CONSTANTS.LITERAL_POL_PLN_MSTR_BEN_LVL_B5_);
        //  cobolCode::MOVE '5520-FETCH-POLBENLVL-CURSOR' TO DSM-ERR-SECTN-NAME
        methodOut.setDsmErrSectnName(CONSTANTS.LITERAL_660324705);
        //  cobolCode::MOVE 'D5427POL' TO DSM-ERR-PGM-NAME
        //  LITERAL_D5427POL = 'D5427POL'
        methodOut.setDsmErrPgmName(CONSTANTS.LITERAL_D5427POL);
        //  cobolCode::PERFORM 7777-MOVES-FOR-ERROR-LOG
        movesForErrorLog(
            programCtx.getMovesForErrorLogInCtx()); /*7777-MOVES-FOR-ERROR-LOG SECTION*/
        if (programCtx.isProgramEnded()) {
          return methodOut;
        }
      }
    }

    return methodOut;
  }
  /**
   * closePolbenlvlCursor This method is derived from COBOL Paragraph - 5530-CLOSE-POLBENLVL-CURSOR
   * SECTION COBOL Cyclomatic complexity - 4 Input :
   *
   * <p>- sqlcode COBOL Name: SQLCODE
   *
   * <p>Output :
   *
   * <p>- sqlcode_Ws COBOL Name: WS-SQLCODE - dsmSqlcode COBOL Name: DSM-SQLCODE - sqlcode COBOL
   * Name: SQLCODE - dsmReturnCode COBOL Name: DSM-RETURN-CODE - dsmErrTblAction COBOL Name:
   * DSM-ERR-TBL-ACTION - dsmErrTblName COBOL Name: DSM-ERR-TBL-NAME - dsmErrSectnName COBOL Name:
   * DSM-ERR-SECTN-NAME - dsmErrPgmName COBOL Name: DSM-ERR-PGM-NAME
   *
   * @throws CFException
   */
  @Override
  public ClosePolbenlvlCursorOutCtx closePolbenlvlCursor(ClosePolbenlvlCursorInCtx methodIn)
      throws Exception {

    // *81***************************************************************
    // *81 5530-Close-polbenlvl-cursor.                                 *
    // *81 business function: close the cursor                          *
    // *81***************************************************************
    // *82***************************************************************
    // *82 5530-close-polbenlvl-cursor.                                 *
    // *82 1.close cursor cur-ben-lvl                                   *
    // *82***************************************************************
    // Added variable to get the program context in place.
    D5427polCtx programCtx = methodIn.getD5427polCtx();
    // Added variable to get the output context in place.
    ClosePolbenlvlCursorOutCtx methodOut = methodIn.getClosePolbenlvlCursorOutCtx();
    //  cobolCode::CLOSE CUR-BEN-LVL
    d5427polRepository.closeCurBenLvlD5427pol(
        programCtx.getCurBenLvlResultSet(), programCtx.getSqlca());
    //  cobolCode::MOVE SQLCODE TO WS-SQLCODE DSM-SQLCODE
    methodOut.setSqlcode_Ws(methodOut.getSqlcode());
    methodOut.setDsmSqlcode(methodOut.getSqlcode());
    //  cobolCode::EVALUATE TRUE
    if (methodOut.isSqlcodeOk()) {;
    } else {
      //  cobolCode::SET DSM-DB2-ERROR TO TRUE
      methodOut.setDsmDb2ErrorTrue();

      //  cobolCode::MOVE 'CLOSE' TO DSM-ERR-TBL-ACTION
      methodOut.setDsmErrTblAction(CONSTANTS.LITERAL_CLOSE_B5_);
      //  cobolCode::MOVE 'POL_PLN_MSTR_BEN_LVL' TO DSM-ERR-TBL-NAME
      methodOut.setDsmErrTblName(CONSTANTS.LITERAL_POL_PLN_MSTR_BEN_LVL_B5_);
      //  cobolCode::MOVE '5530-CLOSE-POLBENLVL-CURSOR' TO DSM-ERR-SECTN-NAME
      methodOut.setDsmErrSectnName(CONSTANTS.LITERAL_1613977628);
      //  cobolCode::MOVE 'D5427POL' TO DSM-ERR-PGM-NAME
      //  LITERAL_D5427POL = 'D5427POL'
      methodOut.setDsmErrPgmName(CONSTANTS.LITERAL_D5427POL);
      //  cobolCode::PERFORM 7777-MOVES-FOR-ERROR-LOG
      movesForErrorLog(programCtx.getMovesForErrorLogInCtx()); /*7777-MOVES-FOR-ERROR-LOG SECTION*/
      if (programCtx.isProgramEnded()) {
        return methodOut;
      }
    }

    return methodOut;
  }
  /**
   * populateRetPol4Dblv This method is derived from COBOL Paragraph - 5540-POPULATE-RET-POL4-DBLV
   * SECTION COBOL Cyclomatic complexity - 1 Input :
   *
   * <p>- dblvBenLvlTypCd COBOL Name: DBLV-BEN-LVL-TYP-CD - dblvBasPctOvrlayCd COBOL Name:
   * DBLV-BAS-PCT-OVRLAY-CD - dblvIncntPntlyBasCd COBOL Name: DBLV-INCNT-PNTLY-BAS-CD -
   * dblvIncntPntlyBasPct COBOL Name: DBLV-INCNT-PNTLY-BAS-PCT - dblvIncntPntlyMedCd COBOL Name:
   * DBLV-INCNT-PNTLY-MED-CD - dblvIncntPntlyMedPct COBOL Name: DBLV-INCNT-PNTLY-MED-PCT -
   * dblvOverlayPctCd COBOL Name: DBLV-OVERLAY-PCT-CD - dblvDedDescCd COBOL Name: DBLV-DED-DESC-CD
   *
   * <p>Output :
   *
   * <p>- pol4DblvBenLvlTypCd COBOL Name: POL4-DBLV-BEN-LVL-TYP-CD - dblvBenLvlTypCd COBOL Name:
   * DBLV-BEN-LVL-TYP-CD - pol4DblvBasPctOvrlayCd COBOL Name: POL4-DBLV-BAS-PCT-OVRLAY-CD -
   * dblvBasPctOvrlayCd COBOL Name: DBLV-BAS-PCT-OVRLAY-CD - pol4DblvIncntPntlyBasCd COBOL Name:
   * POL4-DBLV-INCNT-PNTLY-BAS-CD - dblvIncntPntlyBasCd COBOL Name: DBLV-INCNT-PNTLY-BAS-CD -
   * pol4DblvIncntPntlyBasPct COBOL Name: POL4-DBLV-INCNT-PNTLY-BAS-PCT - dblvIncntPntlyBasPct COBOL
   * Name: DBLV-INCNT-PNTLY-BAS-PCT - pol4DblvIncntPntlyMedCd COBOL Name:
   * POL4-DBLV-INCNT-PNTLY-MED-CD - dblvIncntPntlyMedCd COBOL Name: DBLV-INCNT-PNTLY-MED-CD -
   * pol4DblvIncntPntlyMedPct COBOL Name: POL4-DBLV-INCNT-PNTLY-MED-PCT - dblvIncntPntlyMedPct COBOL
   * Name: DBLV-INCNT-PNTLY-MED-PCT - pol4DblvOverlayPctCd COBOL Name: POL4-DBLV-OVERLAY-PCT-CD -
   * dblvOverlayPctCd COBOL Name: DBLV-OVERLAY-PCT-CD - pol4DblvDedDescCd COBOL Name:
   * POL4-DBLV-DED-DESC-CD - dblvDedDescCd COBOL Name: DBLV-DED-DESC-CD
   *
   * @throws CFException
   */
  @Override
  public PopulateRetPol4DblvOutCtx populateRetPol4Dblv(PopulateRetPol4DblvInCtx methodIn)
      throws Exception {

    // *81***************************************************************
    // *81 5540-Populate-ret-pol4-dblv.                                 *
    // *81 business function: fetch the records                         *
    // *81***************************************************************
    // *82***************************************************************
    // *82 5540-populate-return-cd4.                                    *
    // *82 1. populate the return codes                                 *
    // *82***************************************************************
    // Added variable to get the program context in place.
    D5427polCtx programCtx = methodIn.getD5427polCtx();
    // Added variable to get the output context in place.
    PopulateRetPol4DblvOutCtx methodOut = methodIn.getPopulateRetPol4DblvOutCtx();
    //  cobolCode::MOVE DBLV-BEN-LVL-TYP-CD TO POL4-DBLV-BEN-LVL-TYP-CD ( WS-LINE-SUB )
    methodOut.setPol4DblvBenLvlTypCd(methodIn.getLineSub() - 1, methodOut.getDblvBenLvlTypCd());
    //  cobolCode::MOVE DBLV-BAS-PCT-OVRLAY-CD TO POL4-DBLV-BAS-PCT-OVRLAY-CD ( WS-LINE-SUB )
    methodOut.setPol4DblvBasPctOvrlayCd(
        methodIn.getLineSub() - 1, methodOut.getDblvBasPctOvrlayCd());
    //  cobolCode::MOVE DBLV-INCNT-PNTLY-BAS-CD TO POL4-DBLV-INCNT-PNTLY-BAS-CD ( WS-LINE-SUB )
    methodOut.setPol4DblvIncntPntlyBasCd(
        methodIn.getLineSub() - 1, methodOut.getDblvIncntPntlyBasCd());
    //  cobolCode::MOVE DBLV-INCNT-PNTLY-BAS-PCT TO POL4-DBLV-INCNT-PNTLY-BAS-PCT ( WS-LINE-SUB )
    methodOut.setPol4DblvIncntPntlyBasPct(
        methodIn.getLineSub() - 1, methodOut.getDblvIncntPntlyBasPct());
    //  cobolCode::MOVE DBLV-INCNT-PNTLY-MED-CD TO POL4-DBLV-INCNT-PNTLY-MED-CD ( WS-LINE-SUB )
    methodOut.setPol4DblvIncntPntlyMedCd(
        methodIn.getLineSub() - 1, methodOut.getDblvIncntPntlyMedCd());
    //  cobolCode::MOVE DBLV-INCNT-PNTLY-MED-PCT TO POL4-DBLV-INCNT-PNTLY-MED-PCT ( WS-LINE-SUB )
    methodOut.setPol4DblvIncntPntlyMedPct(
        methodIn.getLineSub() - 1, methodOut.getDblvIncntPntlyMedPct());
    //  cobolCode::MOVE DBLV-OVERLAY-PCT-CD TO POL4-DBLV-OVERLAY-PCT-CD ( WS-LINE-SUB )
    methodOut.setPol4DblvOverlayPctCd(methodIn.getLineSub() - 1, methodOut.getDblvOverlayPctCd());
    //  cobolCode::MOVE DBLV-DED-DESC-CD TO POL4-DBLV-DED-DESC-CD ( WS-LINE-SUB )
    methodOut.setPol4DblvDedDescCd(methodIn.getLineSub() - 1, methodOut.getDblvDedDescCd());

    return methodOut;
  }
  /**
   * funcCd4PolfamdedRead This method is derived from COBOL Paragraph - 5600-FUNC-CD4-POLFAMDED-READ
   * SECTION COBOL Cyclomatic complexity - 2 Input :
   *
   * <p>- sqlcode_Ws COBOL Name: WS-SQLCODE
   *
   * <p>Output : None
   *
   * @throws CFException
   */
  @Override
  public FuncCd4PolfamdedReadOutCtx funcCd4PolfamdedRead(FuncCd4PolfamdedReadInCtx methodIn)
      throws Exception {

    // *81***************************************************************
    // *81 5600-Func-cd4-polfamded-read.                                *
    // *81 business function: read the table                            *
    // *81***************************************************************
    // *82***************************************************************
    // *82 5600-func-cd4-polfamded-read.                                *
    // *82 fetch records from pol_pln_mstr_fam_ded for given policy/plan*
    // *82***************************************************************
    // Added variable to get the program context in place.
    D5427polCtx programCtx = methodIn.getD5427polCtx();
    // Added variable to get the output context in place.
    FuncCd4PolfamdedReadOutCtx methodOut = methodIn.getFuncCd4PolfamdedReadOutCtx();
    //  cobolCode::PERFORM 5610-OPEN-POLFAMDED-CURSOR
    openPolfamdedCursor(
        programCtx.getOpenPolfamdedCursorInCtx()); /*5610-OPEN-POLFAMDED-CURSOR SECTION*/
    if (programCtx.isProgramEnded()) {
      return methodOut;
    }
    //  cobolCode::IF WS-SQLCODE-OK
    if (methodIn.isSqlcodeOk()) {
      //  cobolCode::PERFORM 5620-FETCH-POLFAMDED-CURSOR
      fetchPolfamdedCursor(
          programCtx.getFetchPolfamdedCursorInCtx()); /*5620-FETCH-POLFAMDED-CURSOR SECTION*/
      if (programCtx.isProgramEnded()) {
        return methodOut;
      }
    }
    //  cobolCode::PERFORM 5630-CLOSE-POLFAMDED-CURSOR
    closePolfamdedCursor(
        programCtx.getClosePolfamdedCursorInCtx()); /*5630-CLOSE-POLFAMDED-CURSOR SECTION*/
    if (programCtx.isProgramEnded()) {
      return methodOut;
    }

    return methodOut;
  }
  /**
   * openPolfamdedCursor This method is derived from COBOL Paragraph - 5610-OPEN-POLFAMDED-CURSOR
   * SECTION COBOL Cyclomatic complexity - 4 Input :
   *
   * <p>- sqlcode COBOL Name: SQLCODE
   *
   * <p>Output :
   *
   * <p>- sqlcode_Ws COBOL Name: WS-SQLCODE - dsmSqlcode COBOL Name: DSM-SQLCODE - sqlcode COBOL
   * Name: SQLCODE - dsmReturnCode COBOL Name: DSM-RETURN-CODE - dsmErrTblAction COBOL Name:
   * DSM-ERR-TBL-ACTION - dsmErrTblName COBOL Name: DSM-ERR-TBL-NAME - dsmErrSectnName COBOL Name:
   * DSM-ERR-SECTN-NAME - dsmErrPgmName COBOL Name: DSM-ERR-PGM-NAME
   *
   * @throws CFException
   */
  @Override
  public OpenPolfamdedCursorOutCtx openPolfamdedCursor(OpenPolfamdedCursorInCtx methodIn)
      throws Exception {

    // *81***************************************************************
    // *81 5610-Open-polfamded-cursor                                   *
    // *81 business function: open the cursor                           *
    // *81***************************************************************
    // *82***************************************************************
    // *82 5610-open-polfamded-cursor                                   *
    // *82 1. open cursor cur-fam-ded                                   *
    // *82***************************************************************
    // Added variable to get the program context in place.
    D5427polCtx programCtx = methodIn.getD5427polCtx();
    // Added variable to get the output context in place.
    OpenPolfamdedCursorOutCtx methodOut = methodIn.getOpenPolfamdedCursorOutCtx();
    //  cobolCode::SELECT SEQ_NBR , DED_AMT , DED_CARO_CD , DED_CD , DED_MBR_DESC , DED_MULT_FCT ,
    // DED_MULT_SALRY_PCT , OOP_MULT_FCT , DED_EE_PLS_1_AMT , DED_EE_SPO_AMT , DED_EE_CHRG_AMT FROM
    // POL_PLN_MSTR_FAM_DED WHERE COV_TYP_CD = ? AND POL_NBR = ? AND PLN_NBR = ? AND CLSS_NBR = ?
    // FOR FETCH ONLY
    programCtx.setCurFamDedResultSet(
        d5427polRepository.openCurFamDedD5427pol(
            methodIn.getDclpolPlnMstrFamDed(), programCtx.getSqlca()));
    //  cobolCode::MOVE SQLCODE TO WS-SQLCODE DSM-SQLCODE
    methodOut.setSqlcode_Ws(methodOut.getSqlcode());
    methodOut.setDsmSqlcode(methodOut.getSqlcode());
    //  cobolCode::EVALUATE TRUE
    if (methodOut.isSqlcodeOk()) {;
    } else {
      //  cobolCode::SET DSM-DB2-ERROR TO TRUE
      methodOut.setDsmDb2ErrorTrue();

      //  cobolCode::MOVE 'OPEN' TO DSM-ERR-TBL-ACTION
      methodOut.setDsmErrTblAction(CONSTANTS.LITERAL_OPEN_B6_);
      //  cobolCode::MOVE 'POL_PLN_MSTR_FAM_DED' TO DSM-ERR-TBL-NAME
      methodOut.setDsmErrTblName(CONSTANTS.LITERAL_POL_PLN_MSTR_FAM_DED_B5_);
      //  cobolCode::MOVE '5610-OPEN-POLFAMDED-CURSOR' TO DSM-ERR-SECTN-NAME
      methodOut.setDsmErrSectnName(CONSTANTS.LITERAL_571732901);
      //  cobolCode::MOVE 'D5427POL' TO DSM-ERR-PGM-NAME
      //  LITERAL_D5427POL = 'D5427POL'
      methodOut.setDsmErrPgmName(CONSTANTS.LITERAL_D5427POL);
      //  cobolCode::PERFORM 7777-MOVES-FOR-ERROR-LOG
      movesForErrorLog(programCtx.getMovesForErrorLogInCtx()); /*7777-MOVES-FOR-ERROR-LOG SECTION*/
      if (programCtx.isProgramEnded()) {
        return methodOut;
      }
    }

    return methodOut;
  }
  /**
   * fetchPolfamdedCursor This method is derived from COBOL Paragraph - 5620-FETCH-POLFAMDED-CURSOR
   * SECTION COBOL Cyclomatic complexity - 7 Input :
   *
   * <p>- sqlcode_Ws COBOL Name: WS-SQLCODE - sqlcode COBOL Name: SQLCODE
   *
   * <p>Output :
   *
   * <p>- lineSub COBOL Name: WS-LINE-SUB - sqlcode_Ws COBOL Name: WS-SQLCODE - dsmSqlcode COBOL
   * Name: DSM-SQLCODE - sqlcode COBOL Name: SQLCODE - dsmReturnCode COBOL Name: DSM-RETURN-CODE -
   * dsmErrTblAction COBOL Name: DSM-ERR-TBL-ACTION - dsmErrTblName COBOL Name: DSM-ERR-TBL-NAME -
   * dsmErrSectnName COBOL Name: DSM-ERR-SECTN-NAME - dsmErrPgmName COBOL Name: DSM-ERR-PGM-NAME
   *
   * @throws CFException
   */
  @Override
  public FetchPolfamdedCursorOutCtx fetchPolfamdedCursor(FetchPolfamdedCursorInCtx methodIn)
      throws Exception {

    // *82 1. Fetch records from cursor cur-fam-ded                     *
    // *82***************************************************************
    // Added variable to get the program context in place.
    D5427polCtx programCtx = methodIn.getD5427polCtx();
    // Added variable to get the output context in place.
    FetchPolfamdedCursorOutCtx methodOut = methodIn.getFetchPolfamdedCursorOutCtx();
    methodOut.setLineSub(1);
    //  cobolCode::PERFORM UNTIL WS-SQLCODE-NOT-FOUND
    while ((!(methodIn.isSqlcodeNotFound()))) {
      //  cobolCode::FETCH CUR-FAM-DED INTO ? , ? , ? , ? , ? , ? , ? , ? , ? , ? , ?
      d5427polRepository.fetchCurFamDedD5427pol(
          programCtx.getCurFamDedResultSet(),
          methodOut.getDclpolPlnMstrFamDed(),
          programCtx.getSqlca());
      //  cobolCode::MOVE SQLCODE TO WS-SQLCODE DSM-SQLCODE
      methodOut.setSqlcode_Ws(methodOut.getSqlcode());
      methodOut.setDsmSqlcode(methodOut.getSqlcode());
      //  cobolCode::EVALUATE TRUE
      if (methodOut.isSqlcodeOk()) {
        //  cobolCode::IF WS-LINE-SUB > 4
        if ((methodOut.getLineSub() > 4)) {
          //  cobolCode::SET DSM-DB2-ERROR TO TRUE
          methodOut.setDsmDb2ErrorTrue();

          //  cobolCode::MOVE 'TBL OVRFLO' TO DSM-ERR-TBL-ACTION
          //  LITERAL_TBL_B_OVRFLO = 'TBL OVRFLO'
          methodOut.setDsmErrTblAction(CONSTANTS.LITERAL_TBL_B_OVRFLO);
          //  cobolCode::MOVE 'POL_PLN_MSTR_FAM_DED' TO DSM-ERR-TBL-NAME
          methodOut.setDsmErrTblName(CONSTANTS.LITERAL_POL_PLN_MSTR_FAM_DED_B5_);
          //  cobolCode::MOVE '5620-FETCH-POLFAMDED-CURSOR' TO DSM-ERR-SECTN-NAME
          methodOut.setDsmErrSectnName(CONSTANTS.LITERAL_1639456186);
          //  cobolCode::MOVE 'D5427POL' TO DSM-ERR-PGM-NAME
          //  LITERAL_D5427POL = 'D5427POL'
          methodOut.setDsmErrPgmName(CONSTANTS.LITERAL_D5427POL);
          //  cobolCode::PERFORM 7777-MOVES-FOR-ERROR-LOG
          movesForErrorLog(
              programCtx.getMovesForErrorLogInCtx()); /*7777-MOVES-FOR-ERROR-LOG SECTION*/
          if (programCtx.isProgramEnded()) {
            return methodOut;
          }
        }
        //  cobolCode::PERFORM 5640-POPULATE-RET-POL4-DFDE
        populateRetPol4Dfde(
            programCtx.getPopulateRetPol4DfdeInCtx()); /*5640-POPULATE-RET-POL4-DFDE SECTION*/
        if (programCtx.isProgramEnded()) {
          return methodOut;
        }
        //  cobolCode::ADD 1 TO WS-LINE-SUB
        methodOut.setLineSub(methodOut.getLineSub() + 1);
      } else if (methodIn.isSqlcodeNotFound()) {;
      } else {
        //  cobolCode::SET DSM-DB2-ERROR TO TRUE
        methodOut.setDsmDb2ErrorTrue();

        //  cobolCode::MOVE 'FETCH' TO DSM-ERR-TBL-ACTION
        methodOut.setDsmErrTblAction(CONSTANTS.LITERAL_FETCH_B5_);
        //  cobolCode::MOVE 'POL_PLN_MSTR_FAM_DED' TO DSM-ERR-TBL-NAME
        methodOut.setDsmErrTblName(CONSTANTS.LITERAL_POL_PLN_MSTR_FAM_DED_B5_);
        //  cobolCode::MOVE '5620-FETCH-POLFAMDED-CURSOR' TO DSM-ERR-SECTN-NAME
        methodOut.setDsmErrSectnName(CONSTANTS.LITERAL_1639456186);
        //  cobolCode::MOVE 'D5427POL' TO DSM-ERR-PGM-NAME
        //  LITERAL_D5427POL = 'D5427POL'
        methodOut.setDsmErrPgmName(CONSTANTS.LITERAL_D5427POL);
        //  cobolCode::PERFORM 7777-MOVES-FOR-ERROR-LOG
        movesForErrorLog(
            programCtx.getMovesForErrorLogInCtx()); /*7777-MOVES-FOR-ERROR-LOG SECTION*/
        if (programCtx.isProgramEnded()) {
          return methodOut;
        }
      }
    }

    return methodOut;
  }
  /**
   * closePolfamdedCursor This method is derived from COBOL Paragraph - 5630-CLOSE-POLFAMDED-CURSOR
   * SECTION COBOL Cyclomatic complexity - 4 Input :
   *
   * <p>- sqlcode COBOL Name: SQLCODE
   *
   * <p>Output :
   *
   * <p>- sqlcode_Ws COBOL Name: WS-SQLCODE - dsmSqlcode COBOL Name: DSM-SQLCODE - sqlcode COBOL
   * Name: SQLCODE - dsmReturnCode COBOL Name: DSM-RETURN-CODE - dsmErrTblAction COBOL Name:
   * DSM-ERR-TBL-ACTION - dsmErrTblName COBOL Name: DSM-ERR-TBL-NAME - dsmErrSectnName COBOL Name:
   * DSM-ERR-SECTN-NAME - dsmErrPgmName COBOL Name: DSM-ERR-PGM-NAME
   *
   * @throws CFException
   */
  @Override
  public ClosePolfamdedCursorOutCtx closePolfamdedCursor(ClosePolfamdedCursorInCtx methodIn)
      throws Exception {

    // *82***************************************************************
    // *82 5630-Close-polfamded-cursor.                                 *
    // *82 1.close cursor cur-fam-ded                                   *
    // *82***************************************************************
    // Added variable to get the program context in place.
    D5427polCtx programCtx = methodIn.getD5427polCtx();
    // Added variable to get the output context in place.
    ClosePolfamdedCursorOutCtx methodOut = methodIn.getClosePolfamdedCursorOutCtx();
    //  cobolCode::CLOSE CUR-FAM-DED
    d5427polRepository.closeCurFamDedD5427pol(
        programCtx.getCurFamDedResultSet(), programCtx.getSqlca());
    //  cobolCode::MOVE SQLCODE TO WS-SQLCODE DSM-SQLCODE
    methodOut.setSqlcode_Ws(methodOut.getSqlcode());
    methodOut.setDsmSqlcode(methodOut.getSqlcode());
    //  cobolCode::EVALUATE TRUE
    if (methodOut.isSqlcodeOk()) {;
    } else {
      //  cobolCode::SET DSM-DB2-ERROR TO TRUE
      methodOut.setDsmDb2ErrorTrue();

      //  cobolCode::MOVE 'CLOSE' TO DSM-ERR-TBL-ACTION
      methodOut.setDsmErrTblAction(CONSTANTS.LITERAL_CLOSE_B5_);
      //  cobolCode::MOVE 'POL_PLN_MSTR_FAM_DED' TO DSM-ERR-TBL-NAME
      methodOut.setDsmErrTblName(CONSTANTS.LITERAL_POL_PLN_MSTR_FAM_DED_B5_);
      //  cobolCode::MOVE '5630-CLOSE-POLFAMDED-CURSOR' TO DSM-ERR-SECTN-NAME
      methodOut.setDsmErrSectnName(CONSTANTS.LITERAL_381208777);
      //  cobolCode::MOVE 'D5427POL' TO DSM-ERR-PGM-NAME
      //  LITERAL_D5427POL = 'D5427POL'
      methodOut.setDsmErrPgmName(CONSTANTS.LITERAL_D5427POL);
      //  cobolCode::PERFORM 7777-MOVES-FOR-ERROR-LOG
      movesForErrorLog(programCtx.getMovesForErrorLogInCtx()); /*7777-MOVES-FOR-ERROR-LOG SECTION*/
      if (programCtx.isProgramEnded()) {
        return methodOut;
      }
    }

    return methodOut;
  }
  /**
   * populateRetPol4Dfde This method is derived from COBOL Paragraph - 5640-POPULATE-RET-POL4-DFDE
   * SECTION COBOL Cyclomatic complexity - 1 Input :
   *
   * <p>- dfdeSeqNbr COBOL Name: DFDE-SEQ-NBR - dfdeDedAmt COBOL Name: DFDE-DED-AMT - dfdeDedCaroCd
   * COBOL Name: DFDE-DED-CARO-CD - dfdeDedCd COBOL Name: DFDE-DED-CD - dfdeDedMbrDesc COBOL Name:
   * DFDE-DED-MBR-DESC - dfdeDedMultFct COBOL Name: DFDE-DED-MULT-FCT - dfdeDedMultSalryPct COBOL
   * Name: DFDE-DED-MULT-SALRY-PCT - dfdeOopMultFct COBOL Name: DFDE-OOP-MULT-FCT - dfdeDedEePls1Amt
   * COBOL Name: DFDE-DED-EE-PLS-1-AMT - dfdeDedEeSpoAmt COBOL Name: DFDE-DED-EE-SPO-AMT -
   * dfdeDedEeChrgAmt COBOL Name: DFDE-DED-EE-CHRG-AMT
   *
   * <p>Output :
   *
   * <p>- pol4DfdeSeqNbr COBOL Name: POL4-DFDE-SEQ-NBR - dfdeSeqNbr COBOL Name: DFDE-SEQ-NBR -
   * pol4DfdeDedAmt COBOL Name: POL4-DFDE-DED-AMT - dfdeDedAmt COBOL Name: DFDE-DED-AMT -
   * pol4DfdeDedCaroCd COBOL Name: POL4-DFDE-DED-CARO-CD - dfdeDedCaroCd COBOL Name:
   * DFDE-DED-CARO-CD - pol4DfdeDedCd COBOL Name: POL4-DFDE-DED-CD - dfdeDedCd COBOL Name:
   * DFDE-DED-CD - pol4DfdeDedMbrDesc COBOL Name: POL4-DFDE-DED-MBR-DESC - dfdeDedMbrDesc COBOL
   * Name: DFDE-DED-MBR-DESC - pol4DfdeDedMultFct COBOL Name: POL4-DFDE-DED-MULT-FCT -
   * dfdeDedMultFct COBOL Name: DFDE-DED-MULT-FCT - pol4DfdeDedMultSalryPct COBOL Name:
   * POL4-DFDE-DED-MULT-SALRY-PCT - dfdeDedMultSalryPct COBOL Name: DFDE-DED-MULT-SALRY-PCT -
   * pol4DfdeOopMultFct COBOL Name: POL4-DFDE-OOP-MULT-FCT - dfdeOopMultFct COBOL Name:
   * DFDE-OOP-MULT-FCT - pol4DedEePls1Amt COBOL Name: POL4-DED-EE-PLS-1-AMT - dfdeDedEePls1Amt COBOL
   * Name: DFDE-DED-EE-PLS-1-AMT - pol4DedEeSpoAmt COBOL Name: POL4-DED-EE-SPO-AMT - dfdeDedEeSpoAmt
   * COBOL Name: DFDE-DED-EE-SPO-AMT - pol4DedEeChrgAmt COBOL Name: POL4-DED-EE-CHRG-AMT -
   * dfdeDedEeChrgAmt COBOL Name: DFDE-DED-EE-CHRG-AMT
   *
   * @throws CFException
   */
  @Override
  public PopulateRetPol4DfdeOutCtx populateRetPol4Dfde(PopulateRetPol4DfdeInCtx methodIn)
      throws Exception {

    // *81***************************************************************
    // *81 5640-Populate-ret-pol4-dfde.                                 *
    // *81 business function: populate the return data                  *
    // *81***************************************************************
    // *82***************************************************************
    // *82 5640-populate-ret-pol4-dfde.                                 *
    // *82 1. populate the return data                                  *
    // *82***************************************************************
    // Added variable to get the program context in place.
    D5427polCtx programCtx = methodIn.getD5427polCtx();
    // Added variable to get the output context in place.
    PopulateRetPol4DfdeOutCtx methodOut = methodIn.getPopulateRetPol4DfdeOutCtx();
    //  cobolCode::MOVE DFDE-SEQ-NBR TO POL4-DFDE-SEQ-NBR ( WS-LINE-SUB )
    methodOut.setPol4DfdeSeqNbr(methodIn.getLineSub() - 1, methodOut.getDfdeSeqNbr());
    //  cobolCode::MOVE DFDE-DED-AMT TO POL4-DFDE-DED-AMT ( WS-LINE-SUB )
    methodOut.setPol4DfdeDedAmt(methodIn.getLineSub() - 1, methodOut.getDfdeDedAmt());
    //  cobolCode::MOVE DFDE-DED-CARO-CD TO POL4-DFDE-DED-CARO-CD ( WS-LINE-SUB )
    methodOut.setPol4DfdeDedCaroCd(
        methodIn.getLineSub() - 1, padLeftZeros(1, methodOut.getDfdeDedCaroCd(), false));
    //  cobolCode::MOVE DFDE-DED-CD TO POL4-DFDE-DED-CD ( WS-LINE-SUB )
    methodOut.setPol4DfdeDedCd(
        methodIn.getLineSub() - 1, padLeftZeros(1, methodOut.getDfdeDedCd(), false));
    //  cobolCode::MOVE DFDE-DED-MBR-DESC TO POL4-DFDE-DED-MBR-DESC ( WS-LINE-SUB )
    methodOut.setPol4DfdeDedMbrDesc(methodIn.getLineSub() - 1, methodOut.getDfdeDedMbrDesc());
    //  cobolCode::MOVE DFDE-DED-MULT-FCT TO POL4-DFDE-DED-MULT-FCT ( WS-LINE-SUB )
    methodOut.setPol4DfdeDedMultFct(methodIn.getLineSub() - 1, methodOut.getDfdeDedMultFct());
    //  cobolCode::MOVE DFDE-DED-MULT-SALRY-PCT TO POL4-DFDE-DED-MULT-SALRY-PCT ( WS-LINE-SUB )
    methodOut.setPol4DfdeDedMultSalryPct(
        methodIn.getLineSub() - 1, methodOut.getDfdeDedMultSalryPct());
    //  cobolCode::MOVE DFDE-OOP-MULT-FCT TO POL4-DFDE-OOP-MULT-FCT ( WS-LINE-SUB )
    methodOut.setPol4DfdeOopMultFct(methodIn.getLineSub() - 1, methodOut.getDfdeOopMultFct());
    //  cobolCode::MOVE DFDE-DED-EE-PLS-1-AMT TO POL4-DED-EE-PLS-1-AMT ( WS-LINE-SUB )
    methodOut.setPol4DedEePls1Amt(methodIn.getLineSub() - 1, methodOut.getDfdeDedEePls1Amt());
    //  cobolCode::MOVE DFDE-DED-EE-SPO-AMT TO POL4-DED-EE-SPO-AMT ( WS-LINE-SUB )
    methodOut.setPol4DedEeSpoAmt(methodIn.getLineSub() - 1, methodOut.getDfdeDedEeSpoAmt());
    //  cobolCode::MOVE DFDE-DED-EE-CHRG-AMT TO POL4-DED-EE-CHRG-AMT ( WS-LINE-SUB )
    methodOut.setPol4DedEeChrgAmt(methodIn.getLineSub() - 1, methodOut.getDfdeDedEeChrgAmt());

    return methodOut;
  }
  /**
   * funcCd4PolindvdedRead This method is derived from COBOL Paragraph -
   * 5700-FUNC-CD4-POLINDVDED-READ SECTION COBOL Cyclomatic complexity - 2 Input :
   *
   * <p>- sqlcode_Ws COBOL Name: WS-SQLCODE
   *
   * <p>Output : None
   *
   * @throws CFException
   */
  @Override
  public FuncCd4PolindvdedReadOutCtx funcCd4PolindvdedRead(FuncCd4PolindvdedReadInCtx methodIn)
      throws Exception {

    // *81***************************************************************
    // *81 5700-Func-cd4-polindvded-read.                               *
    // *81 business function: retrieve the records from the table       *
    // *81***************************************************************
    // *82***************************************************************
    // *82 5700-func-cd4-polindvded-read.                               *
    // *821.read the records from pol_pln_mstr_indv_ded table           *
    // *82***************************************************************
    // Added variable to get the program context in place.
    D5427polCtx programCtx = methodIn.getD5427polCtx();
    // Added variable to get the output context in place.
    FuncCd4PolindvdedReadOutCtx methodOut = methodIn.getFuncCd4PolindvdedReadOutCtx();
    //  cobolCode::PERFORM 5710-OPEN-POLINDDED-CURSOR
    openPolinddedCursor(
        programCtx.getOpenPolinddedCursorInCtx()); /*5710-OPEN-POLINDDED-CURSOR SECTION*/
    if (programCtx.isProgramEnded()) {
      return methodOut;
    }
    //  cobolCode::IF WS-SQLCODE-OK
    if (methodIn.isSqlcodeOk()) {
      //  cobolCode::PERFORM 5720-FETCH-POLINDDED-CURSOR
      fetchPolinddedCursor(
          programCtx.getFetchPolinddedCursorInCtx()); /*5720-FETCH-POLINDDED-CURSOR SECTION*/
      if (programCtx.isProgramEnded()) {
        return methodOut;
      }
    }
    //  cobolCode::PERFORM 5730-CLOSE-POLINDDED-CURSOR
    closePolinddedCursor(
        programCtx.getClosePolinddedCursorInCtx()); /*5730-CLOSE-POLINDDED-CURSOR SECTION*/
    if (programCtx.isProgramEnded()) {
      return methodOut;
    }

    return methodOut;
  }
  /**
   * openPolinddedCursor This method is derived from COBOL Paragraph - 5710-OPEN-POLINDDED-CURSOR
   * SECTION COBOL Cyclomatic complexity - 4 Input :
   *
   * <p>- sqlcode COBOL Name: SQLCODE
   *
   * <p>Output :
   *
   * <p>- sqlcode_Ws COBOL Name: WS-SQLCODE - dsmSqlcode COBOL Name: DSM-SQLCODE - sqlcode COBOL
   * Name: SQLCODE - dsmReturnCode COBOL Name: DSM-RETURN-CODE - dsmErrTblAction COBOL Name:
   * DSM-ERR-TBL-ACTION - dsmErrTblName COBOL Name: DSM-ERR-TBL-NAME - dsmErrSectnName COBOL Name:
   * DSM-ERR-SECTN-NAME - dsmErrPgmName COBOL Name: DSM-ERR-PGM-NAME
   *
   * @throws CFException
   */
  @Override
  public OpenPolinddedCursorOutCtx openPolinddedCursor(OpenPolinddedCursorInCtx methodIn)
      throws Exception {

    // *81***************************************************************
    // *81 5710-Open-polindded-cursor                                   *
    // *81 business function: open the cursor                           *
    // *81***************************************************************
    // *82***************************************************************
    // *82 5710-open-polindded-cursor                                   *
    // *82 1. open cursor cur-ind-ded                                   *
    // *82***************************************************************
    // Added variable to get the program context in place.
    D5427polCtx programCtx = methodIn.getD5427polCtx();
    // Added variable to get the output context in place.
    OpenPolinddedCursorOutCtx methodOut = methodIn.getOpenPolinddedCursorOutCtx();
    //  cobolCode::SELECT SEQ_NBR , DED_AMT , DED_CD , DED_NTWK_TYP_CD , DED_SRVC_DESC , DED_FREQ_CD
    // FROM POL_PLN_MSTR_INDV_DED WHERE COV_TYP_CD = ? AND POL_NBR = ? AND PLN_NBR = ? AND CLSS_NBR
    // = ? FOR FETCH ONLY
    programCtx.setCurIndDedResultSet(
        d5427polRepository.openCurIndDedD5427pol(
            programCtx.getSqlca(), methodIn.getDclpolPlnMstrIndvDed()));
    //  cobolCode::MOVE SQLCODE TO WS-SQLCODE DSM-SQLCODE
    methodOut.setSqlcode_Ws(methodOut.getSqlcode());
    methodOut.setDsmSqlcode(methodOut.getSqlcode());
    //  cobolCode::EVALUATE TRUE
    if (methodOut.isSqlcodeOk()) {;
    } else {
      //  cobolCode::SET DSM-DB2-ERROR TO TRUE
      methodOut.setDsmDb2ErrorTrue();

      //  cobolCode::MOVE 'OPEN' TO DSM-ERR-TBL-ACTION
      methodOut.setDsmErrTblAction(CONSTANTS.LITERAL_OPEN_B6_);
      //  cobolCode::MOVE 'POL_PLN_MSTR_FAM_DED' TO DSM-ERR-TBL-NAME
      methodOut.setDsmErrTblName(CONSTANTS.LITERAL_POL_PLN_MSTR_FAM_DED_B5_);
      //  cobolCode::MOVE '5710-OPEN-POLINDDED-CURSOR' TO DSM-ERR-SECTN-NAME
      methodOut.setDsmErrSectnName(CONSTANTS.LITERAL_1910035927);
      //  cobolCode::MOVE 'D5427POL' TO DSM-ERR-PGM-NAME
      //  LITERAL_D5427POL = 'D5427POL'
      methodOut.setDsmErrPgmName(CONSTANTS.LITERAL_D5427POL);
      //  cobolCode::PERFORM 7777-MOVES-FOR-ERROR-LOG
      movesForErrorLog(programCtx.getMovesForErrorLogInCtx()); /*7777-MOVES-FOR-ERROR-LOG SECTION*/
      if (programCtx.isProgramEnded()) {
        return methodOut;
      }
    }

    return methodOut;
  }
  /**
   * fetchPolinddedCursor This method is derived from COBOL Paragraph - 5720-FETCH-POLINDDED-CURSOR
   * SECTION COBOL Cyclomatic complexity - 7 Input :
   *
   * <p>- sqlcode_Ws COBOL Name: WS-SQLCODE - sqlcode COBOL Name: SQLCODE
   *
   * <p>Output :
   *
   * <p>- lineSub COBOL Name: WS-LINE-SUB - sqlcode_Ws COBOL Name: WS-SQLCODE - dsmSqlcode COBOL
   * Name: DSM-SQLCODE - sqlcode COBOL Name: SQLCODE - dsmReturnCode COBOL Name: DSM-RETURN-CODE -
   * dsmErrTblAction COBOL Name: DSM-ERR-TBL-ACTION - dsmErrTblName COBOL Name: DSM-ERR-TBL-NAME -
   * dsmErrSectnName COBOL Name: DSM-ERR-SECTN-NAME - dsmErrPgmName COBOL Name: DSM-ERR-PGM-NAME
   *
   * @throws CFException
   */
  @Override
  public FetchPolinddedCursorOutCtx fetchPolinddedCursor(FetchPolinddedCursorInCtx methodIn)
      throws Exception {

    // *82***************************************************************
    // Added variable to get the program context in place.
    D5427polCtx programCtx = methodIn.getD5427polCtx();
    // Added variable to get the output context in place.
    FetchPolinddedCursorOutCtx methodOut = methodIn.getFetchPolinddedCursorOutCtx();
    methodOut.setLineSub(1);
    //  cobolCode::PERFORM UNTIL WS-SQLCODE-NOT-FOUND
    while ((!(methodIn.isSqlcodeNotFound()))) {
      //  cobolCode::FETCH CUR-IND-DED INTO ? , ? , ? , ? , ? , ?
      d5427polRepository.fetchCurIndDedD5427pol(
          programCtx.getCurIndDedResultSet(),
          programCtx.getSqlca(),
          methodOut.getDclpolPlnMstrIndvDed());
      //  cobolCode::MOVE SQLCODE TO WS-SQLCODE DSM-SQLCODE
      methodOut.setSqlcode_Ws(methodOut.getSqlcode());
      methodOut.setDsmSqlcode(methodOut.getSqlcode());
      //  cobolCode::EVALUATE TRUE
      if (methodOut.isSqlcodeOk()) {
        //  cobolCode::IF WS-LINE-SUB > 6
        if ((methodOut.getLineSub() > 6)) {
          //  cobolCode::SET DSM-DB2-ERROR TO TRUE
          methodOut.setDsmDb2ErrorTrue();

          //  cobolCode::MOVE 'TBL OVRFLO' TO DSM-ERR-TBL-ACTION
          //  LITERAL_TBL_B_OVRFLO = 'TBL OVRFLO'
          methodOut.setDsmErrTblAction(CONSTANTS.LITERAL_TBL_B_OVRFLO);
          //  cobolCode::MOVE 'POL_PLN_MSTR_INDV_DED' TO DSM-ERR-TBL-NAME
          methodOut.setDsmErrTblName(CONSTANTS.LITERAL_POL_PLN_MSTR_INDV_DED_B4_);
          //  cobolCode::MOVE '5720-FETCH-POLINDDED-CURSOR' TO DSM-ERR-SECTN-NAME
          methodOut.setDsmErrSectnName(CONSTANTS.LITERAL_1989346830);
          //  cobolCode::MOVE 'D5427POL' TO DSM-ERR-PGM-NAME
          //  LITERAL_D5427POL = 'D5427POL'
          methodOut.setDsmErrPgmName(CONSTANTS.LITERAL_D5427POL);
          //  cobolCode::PERFORM 7777-MOVES-FOR-ERROR-LOG
          movesForErrorLog(
              programCtx.getMovesForErrorLogInCtx()); /*7777-MOVES-FOR-ERROR-LOG SECTION*/
          if (programCtx.isProgramEnded()) {
            return methodOut;
          }
        }
        //  cobolCode::PERFORM 5740-POPULATE-RET-POL4-DIDE
        populateRetPol4Dide(
            programCtx.getPopulateRetPol4DideInCtx()); /*5740-POPULATE-RET-POL4-DIDE SECTION*/
        if (programCtx.isProgramEnded()) {
          return methodOut;
        }
        //  cobolCode::ADD 1 TO WS-LINE-SUB
        methodOut.setLineSub(methodOut.getLineSub() + 1);
      } else if (methodIn.isSqlcodeNotFound()) {;
      } else {
        //  cobolCode::SET DSM-DB2-ERROR TO TRUE
        methodOut.setDsmDb2ErrorTrue();

        //  cobolCode::MOVE 'FETCH' TO DSM-ERR-TBL-ACTION
        methodOut.setDsmErrTblAction(CONSTANTS.LITERAL_FETCH_B5_);
        //  cobolCode::MOVE 'POL_PLN_MSTR_INDV_DED' TO DSM-ERR-TBL-NAME
        methodOut.setDsmErrTblName(CONSTANTS.LITERAL_POL_PLN_MSTR_INDV_DED_B4_);
        //  cobolCode::MOVE '5720-FETCH-POLINDDED-CURSOR' TO DSM-ERR-SECTN-NAME
        methodOut.setDsmErrSectnName(CONSTANTS.LITERAL_1989346830);
        //  cobolCode::MOVE 'D5427POL' TO DSM-ERR-PGM-NAME
        //  LITERAL_D5427POL = 'D5427POL'
        methodOut.setDsmErrPgmName(CONSTANTS.LITERAL_D5427POL);
        //  cobolCode::PERFORM 7777-MOVES-FOR-ERROR-LOG
        movesForErrorLog(
            programCtx.getMovesForErrorLogInCtx()); /*7777-MOVES-FOR-ERROR-LOG SECTION*/
        if (programCtx.isProgramEnded()) {
          return methodOut;
        }
      }
    }

    return methodOut;
  }
  /**
   * closePolinddedCursor This method is derived from COBOL Paragraph - 5730-CLOSE-POLINDDED-CURSOR
   * SECTION COBOL Cyclomatic complexity - 4 Input :
   *
   * <p>- sqlcode COBOL Name: SQLCODE
   *
   * <p>Output :
   *
   * <p>- sqlcode_Ws COBOL Name: WS-SQLCODE - dsmSqlcode COBOL Name: DSM-SQLCODE - sqlcode COBOL
   * Name: SQLCODE - dsmReturnCode COBOL Name: DSM-RETURN-CODE - dsmErrTblAction COBOL Name:
   * DSM-ERR-TBL-ACTION - dsmErrTblName COBOL Name: DSM-ERR-TBL-NAME - dsmErrSectnName COBOL Name:
   * DSM-ERR-SECTN-NAME - dsmErrPgmName COBOL Name: DSM-ERR-PGM-NAME
   *
   * @throws CFException
   */
  @Override
  public ClosePolinddedCursorOutCtx closePolinddedCursor(ClosePolinddedCursorInCtx methodIn)
      throws Exception {

    // *81***************************************************************
    // *81 5730-Close-polindded-cursor.                                 *
    // *81 business function: close the cursor                          *
    // *81***************************************************************
    // *82***************************************************************
    // *82 5730-close-polindded-cursor.                                 *
    // *82 1.close cursor cur-ind-ded                                   *
    // *82***************************************************************
    // Added variable to get the program context in place.
    D5427polCtx programCtx = methodIn.getD5427polCtx();
    // Added variable to get the output context in place.
    ClosePolinddedCursorOutCtx methodOut = methodIn.getClosePolinddedCursorOutCtx();
    //  cobolCode::CLOSE CUR-IND-DED
    d5427polRepository.closeCurIndDedD5427pol(
        programCtx.getCurIndDedResultSet(), programCtx.getSqlca());
    //  cobolCode::MOVE SQLCODE TO WS-SQLCODE DSM-SQLCODE
    methodOut.setSqlcode_Ws(methodOut.getSqlcode());
    methodOut.setDsmSqlcode(methodOut.getSqlcode());
    //  cobolCode::EVALUATE TRUE
    if (methodOut.isSqlcodeOk()) {;
    } else {
      //  cobolCode::SET DSM-DB2-ERROR TO TRUE
      methodOut.setDsmDb2ErrorTrue();

      //  cobolCode::MOVE 'CLOSE' TO DSM-ERR-TBL-ACTION
      methodOut.setDsmErrTblAction(CONSTANTS.LITERAL_CLOSE_B5_);
      //  cobolCode::MOVE 'POL_PLN_MSTR_INDV_DED' TO DSM-ERR-TBL-NAME
      methodOut.setDsmErrTblName(CONSTANTS.LITERAL_POL_PLN_MSTR_INDV_DED_B4_);
      //  cobolCode::MOVE '5730-CLOSE-POLINDDED-CURSOR' TO DSM-ERR-SECTN-NAME
      methodOut.setDsmErrSectnName(CONSTANTS.LITERAL_31318133);
      //  cobolCode::MOVE 'D5427POL' TO DSM-ERR-PGM-NAME
      //  LITERAL_D5427POL = 'D5427POL'
      methodOut.setDsmErrPgmName(CONSTANTS.LITERAL_D5427POL);
      //  cobolCode::PERFORM 7777-MOVES-FOR-ERROR-LOG
      movesForErrorLog(programCtx.getMovesForErrorLogInCtx()); /*7777-MOVES-FOR-ERROR-LOG SECTION*/
      if (programCtx.isProgramEnded()) {
        return methodOut;
      }
    }

    return methodOut;
  }
  /**
   * populateRetPol4Dide This method is derived from COBOL Paragraph - 5740-POPULATE-RET-POL4-DIDE
   * SECTION COBOL Cyclomatic complexity - 1 Input :
   *
   * <p>- dideSeqNbr COBOL Name: DIDE-SEQ-NBR - dideDedAmt COBOL Name: DIDE-DED-AMT - dideDedCd
   * COBOL Name: DIDE-DED-CD - dideDedNtwkTypCd COBOL Name: DIDE-DED-NTWK-TYP-CD - dideDedSrvcDesc
   * COBOL Name: DIDE-DED-SRVC-DESC - dideDedFreqCd COBOL Name: DIDE-DED-FREQ-CD
   *
   * <p>Output :
   *
   * <p>- pol4DideSeqNbr COBOL Name: POL4-DIDE-SEQ-NBR - dideSeqNbr COBOL Name: DIDE-SEQ-NBR -
   * pol4DideDedAmt COBOL Name: POL4-DIDE-DED-AMT - dideDedAmt COBOL Name: DIDE-DED-AMT -
   * pol4DideDedCd COBOL Name: POL4-DIDE-DED-CD - dideDedCd COBOL Name: DIDE-DED-CD -
   * pol4DideDedNtwkTypCd COBOL Name: POL4-DIDE-DED-NTWK-TYP-CD - dideDedNtwkTypCd COBOL Name:
   * DIDE-DED-NTWK-TYP-CD - pol4DideDedSrvcDesc COBOL Name: POL4-DIDE-DED-SRVC-DESC -
   * dideDedSrvcDesc COBOL Name: DIDE-DED-SRVC-DESC - pol4DideDedFreqCd COBOL Name:
   * POL4-DIDE-DED-FREQ-CD - dideDedFreqCd COBOL Name: DIDE-DED-FREQ-CD
   *
   * @throws CFException
   */
  @Override
  public PopulateRetPol4DideOutCtx populateRetPol4Dide(PopulateRetPol4DideInCtx methodIn)
      throws Exception {

    // *81***************************************************************
    // *81 5740-Populate-ret-pol4-dide.                                 *
    // *81 business function: populate the return data                  *
    // *81***************************************************************
    // *82***************************************************************
    // *82 5740-populate-ret-pol4-dide.                                 *
    // *82 1. populate the return data                                  *
    // *82***************************************************************
    // Added variable to get the program context in place.
    D5427polCtx programCtx = methodIn.getD5427polCtx();
    // Added variable to get the output context in place.
    PopulateRetPol4DideOutCtx methodOut = methodIn.getPopulateRetPol4DideOutCtx();
    //  cobolCode::MOVE DIDE-SEQ-NBR TO POL4-DIDE-SEQ-NBR ( WS-LINE-SUB )
    methodOut.setPol4DideSeqNbr(methodIn.getLineSub() - 1, methodOut.getDideSeqNbr());
    //  cobolCode::MOVE DIDE-DED-AMT TO POL4-DIDE-DED-AMT ( WS-LINE-SUB )
    methodOut.setPol4DideDedAmt(methodIn.getLineSub() - 1, methodOut.getDideDedAmt());
    //  cobolCode::MOVE DIDE-DED-CD TO POL4-DIDE-DED-CD ( WS-LINE-SUB )
    methodOut.setPol4DideDedCd(
        methodIn.getLineSub() - 1, padLeftZeros(1, methodOut.getDideDedCd(), false));
    //  cobolCode::MOVE DIDE-DED-NTWK-TYP-CD TO POL4-DIDE-DED-NTWK-TYP-CD ( WS-LINE-SUB )
    methodOut.setPol4DideDedNtwkTypCd(methodIn.getLineSub() - 1, methodOut.getDideDedNtwkTypCd());
    //  cobolCode::MOVE DIDE-DED-SRVC-DESC TO POL4-DIDE-DED-SRVC-DESC ( WS-LINE-SUB )
    methodOut.setPol4DideDedSrvcDesc(methodIn.getLineSub() - 1, methodOut.getDideDedSrvcDesc());
    //  cobolCode::MOVE DIDE-DED-FREQ-CD TO POL4-DIDE-DED-FREQ-CD ( WS-LINE-SUB )
    methodOut.setPol4DideDedFreqCd(methodIn.getLineSub() - 1, methodOut.getDideDedFreqCd());

    return methodOut;
  }
  /**
   * funcCd4OopCopayRet This method is derived from COBOL Paragraph - 5800-FUNC-CD4-OOP-COPAY-RET
   * SECTION COBOL Cyclomatic complexity - 2 Input :
   *
   * <p>- sqlcode_Ws COBOL Name: WS-SQLCODE
   *
   * <p>Output : None
   *
   * @throws CFException
   */
  @Override
  public FuncCd4OopCopayRetOutCtx funcCd4OopCopayRet(FuncCd4OopCopayRetInCtx methodIn)
      throws Exception {

    // *81***************************************************************
    // *81 5800-Func-cd4-oop-copay-ret.                                 *
    // *81 business function: retrieve the records from the table       *
    // *81***************************************************************
    // *82***************************************************************
    // *82 5800-func-cd4-oop-copay-ret.                                 *
    // *821.read the records from pol_pln_accum_rule table              *
    // *82***************************************************************
    // Added variable to get the program context in place.
    D5427polCtx programCtx = methodIn.getD5427polCtx();
    // Added variable to get the output context in place.
    FuncCd4OopCopayRetOutCtx methodOut = methodIn.getFuncCd4OopCopayRetOutCtx();
    //  cobolCode::PERFORM 5810-OPEN-OOP-COPAY-CURSOR
    openOopCopayCursor(
        programCtx.getOpenOopCopayCursorInCtx()); /*5810-OPEN-OOP-COPAY-CURSOR SECTION*/
    if (programCtx.isProgramEnded()) {
      return methodOut;
    }
    //  cobolCode::IF WS-SQLCODE-OK
    if (methodIn.isSqlcodeOk()) {
      //  cobolCode::PERFORM 5820-FETCH-OOP-COPAY-CURSOR
      fetchOopCopayCursor(
          programCtx.getFetchOopCopayCursorInCtx()); /*5820-FETCH-OOP-COPAY-CURSOR SECTION*/
      if (programCtx.isProgramEnded()) {
        return methodOut;
      }
    }
    //  cobolCode::PERFORM 5830-CLOSE-OOP-COPAY-CURSOR
    closeOopCopayCursor(
        programCtx.getCloseOopCopayCursorInCtx()); /*5830-CLOSE-OOP-COPAY-CURSOR SECTION*/
    if (programCtx.isProgramEnded()) {
      return methodOut;
    }

    return methodOut;
  }
  /**
   * openOopCopayCursor This method is derived from COBOL Paragraph - 5810-OPEN-OOP-COPAY-CURSOR
   * SECTION COBOL Cyclomatic complexity - 4 Input :
   *
   * <p>- sqlcode COBOL Name: SQLCODE
   *
   * <p>Output :
   *
   * <p>- sqlcode_Ws COBOL Name: WS-SQLCODE - dsmSqlcode COBOL Name: DSM-SQLCODE - sqlcode COBOL
   * Name: SQLCODE - dsmReturnCode COBOL Name: DSM-RETURN-CODE - dsmErrTblAction COBOL Name:
   * DSM-ERR-TBL-ACTION - dsmErrTblName COBOL Name: DSM-ERR-TBL-NAME - dsmErrSectnName COBOL Name:
   * DSM-ERR-SECTN-NAME - dsmErrPgmName COBOL Name: DSM-ERR-PGM-NAME
   *
   * @throws CFException
   */
  @Override
  public OpenOopCopayCursorOutCtx openOopCopayCursor(OpenOopCopayCursorInCtx methodIn)
      throws Exception {

    // *81***************************************************************
    // *81 5810-Open-oop-copay-cursor                                   *
    // *81 business function: open the cursor                           *
    // *81***************************************************************
    // *82***************************************************************
    // *82 5810-open-oop-copay-cursor                                   *
    // *82 1. open cursor cur-copay-oop-csr                             *
    // *82***************************************************************
    // Added variable to get the program context in place.
    D5427polCtx programCtx = methodIn.getD5427polCtx();
    // Added variable to get the output context in place.
    OpenOopCopayCursorOutCtx methodOut = methodIn.getOpenOopCopayCursorOutCtx();
    //  cobolCode::SELECT ACCUM_RULE_TYP_CD , ACCUM_BEN_TYP_CD , INDV_OOP_AMT , FAM_OOP_AMT ,
    // INDV_MAX_AMT , FAM_MAX_AMT , EE_PLS_1_AMT , EE_PLS_SP_AMT , EE_PLS_CH_AMT FROM
    // POL_PLN_ACCUM_RULE WHERE POL_NBR = ? AND PLN_NBR = ? AND CLSS_NBR = ? AND COV_TYP_CD = ? FOR
    // FETCH ONLY
    programCtx.setCurCopayOopCsrResultSet(
        d5427polRepository.openCurCopayOopCsrD5427pol(
            programCtx.getSqlca(), methodIn.getDclpolPlnAccumRule()));
    //  cobolCode::MOVE SQLCODE TO WS-SQLCODE DSM-SQLCODE
    methodOut.setSqlcode_Ws(methodOut.getSqlcode());
    methodOut.setDsmSqlcode(methodOut.getSqlcode());
    //  cobolCode::EVALUATE TRUE
    if (methodOut.isSqlcodeOk()) {;
    } else {
      //  cobolCode::SET DSM-DB2-ERROR TO TRUE
      methodOut.setDsmDb2ErrorTrue();

      //  cobolCode::MOVE 'OPEN' TO DSM-ERR-TBL-ACTION
      methodOut.setDsmErrTblAction(CONSTANTS.LITERAL_OPEN_B6_);
      //  cobolCode::MOVE 'POL_PLN_ACCUM_RULE' TO DSM-ERR-TBL-NAME
      methodOut.setDsmErrTblName(CONSTANTS.LITERAL_POL_PLN_ACCUM_RULE_B7_);
      //  cobolCode::MOVE '5810-OPEN-OOP-COPAY-CURSOR' TO DSM-ERR-SECTN-NAME
      methodOut.setDsmErrSectnName(CONSTANTS.LITERAL_905196740);
      //  cobolCode::MOVE 'D5427POL' TO DSM-ERR-PGM-NAME
      //  LITERAL_D5427POL = 'D5427POL'
      methodOut.setDsmErrPgmName(CONSTANTS.LITERAL_D5427POL);
      //  cobolCode::PERFORM 7777-MOVES-FOR-ERROR-LOG
      movesForErrorLog(programCtx.getMovesForErrorLogInCtx()); /*7777-MOVES-FOR-ERROR-LOG SECTION*/
      if (programCtx.isProgramEnded()) {
        return methodOut;
      }
    }

    return methodOut;
  }
  /**
   * fetchOopCopayCursor This method is derived from COBOL Paragraph - 5820-FETCH-OOP-COPAY-CURSOR
   * SECTION COBOL Cyclomatic complexity - 6 Input :
   *
   * <p>- sqlcode_Ws COBOL Name: WS-SQLCODE - sqlcode COBOL Name: SQLCODE
   *
   * <p>Output :
   *
   * <p>- sqlcode_Ws COBOL Name: WS-SQLCODE - dsmSqlcode COBOL Name: DSM-SQLCODE - sqlcode COBOL
   * Name: SQLCODE - dsmReturnCode COBOL Name: DSM-RETURN-CODE - dsmErrTblAction COBOL Name:
   * DSM-ERR-TBL-ACTION - dsmErrTblName COBOL Name: DSM-ERR-TBL-NAME - dsmErrSectnName COBOL Name:
   * DSM-ERR-SECTN-NAME - dsmErrPgmName COBOL Name: DSM-ERR-PGM-NAME
   *
   * @throws CFException
   */
  @Override
  public FetchOopCopayCursorOutCtx fetchOopCopayCursor(FetchOopCopayCursorInCtx methodIn)
      throws Exception {

    // *81***************************************************************
    // *81 5820-Fetch-oop-copay-cursor.                                 *
    // *81 business function: fetch the records from the table          *
    // *81***************************************************************
    // *82***************************************************************
    // *82 5820-fetch-oop-copay-cursor.                                 *
    // *82 1. fetch records from cursor cur-copay-oop-csr               *
    // *82***************************************************************
    // Added variable to get the program context in place.
    D5427polCtx programCtx = methodIn.getD5427polCtx();
    // Added variable to get the output context in place.
    FetchOopCopayCursorOutCtx methodOut = methodIn.getFetchOopCopayCursorOutCtx();
    //  cobolCode::PERFORM UNTIL WS-SQLCODE-NOT-FOUND
    while ((!(methodIn.isSqlcodeNotFound()))) {
      //  cobolCode::FETCH CUR-COPAY-OOP-CSR INTO ? , ? , ? , ? , ? , ? , ? , ? , ?
      d5427polRepository.fetchCurCopayOopCsrD5427pol(
          programCtx.getCurCopayOopCsrResultSet(),
          programCtx.getSqlca(),
          methodOut.getDclpolPlnAccumRule());
      //  cobolCode::MOVE SQLCODE TO WS-SQLCODE DSM-SQLCODE
      methodOut.setSqlcode_Ws(methodOut.getSqlcode());
      methodOut.setDsmSqlcode(methodOut.getSqlcode());
      //  cobolCode::EVALUATE TRUE
      if (methodOut.isSqlcodeOk()) {
        //  cobolCode::PERFORM 5840-POPULATE-RET-POL4-DACM
        populateRetPol4Dacm(
            programCtx.getPopulateRetPol4DacmInCtx()); /*5840-POPULATE-RET-POL4-DACM SECTION*/
        if (programCtx.isProgramEnded()) {
          return methodOut;
        }
      } else if (methodIn.isSqlcodeNotFound()) {;
      } else {
        //  cobolCode::SET DSM-DB2-ERROR TO TRUE
        methodOut.setDsmDb2ErrorTrue();

        //  cobolCode::MOVE 'FETCH' TO DSM-ERR-TBL-ACTION
        methodOut.setDsmErrTblAction(CONSTANTS.LITERAL_FETCH_B5_);
        //  cobolCode::MOVE 'POL_PLN_ACCUM_RULE' TO DSM-ERR-TBL-NAME
        methodOut.setDsmErrTblName(CONSTANTS.LITERAL_POL_PLN_ACCUM_RULE_B7_);
        //  cobolCode::MOVE '5820-FETCH-OOP-COPAY-CURSOR' TO DSM-ERR-SECTN-NAME
        methodOut.setDsmErrSectnName(CONSTANTS.LITERAL_613707389);
        //  cobolCode::MOVE 'D5427POL' TO DSM-ERR-PGM-NAME
        //  LITERAL_D5427POL = 'D5427POL'
        methodOut.setDsmErrPgmName(CONSTANTS.LITERAL_D5427POL);
        //  cobolCode::PERFORM 7777-MOVES-FOR-ERROR-LOG
        movesForErrorLog(
            programCtx.getMovesForErrorLogInCtx()); /*7777-MOVES-FOR-ERROR-LOG SECTION*/
        if (programCtx.isProgramEnded()) {
          return methodOut;
        }
      }
    }

    return methodOut;
  }
  /**
   * closeOopCopayCursor This method is derived from COBOL Paragraph - 5830-CLOSE-OOP-COPAY-CURSOR
   * SECTION COBOL Cyclomatic complexity - 4 Input :
   *
   * <p>- sqlcode COBOL Name: SQLCODE
   *
   * <p>Output :
   *
   * <p>- sqlcode_Ws COBOL Name: WS-SQLCODE - dsmSqlcode COBOL Name: DSM-SQLCODE - sqlcode COBOL
   * Name: SQLCODE - dsmReturnCode COBOL Name: DSM-RETURN-CODE - dsmErrTblAction COBOL Name:
   * DSM-ERR-TBL-ACTION - dsmErrTblName COBOL Name: DSM-ERR-TBL-NAME - dsmErrSectnName COBOL Name:
   * DSM-ERR-SECTN-NAME - dsmErrPgmName COBOL Name: DSM-ERR-PGM-NAME
   *
   * @throws CFException
   */
  @Override
  public CloseOopCopayCursorOutCtx closeOopCopayCursor(CloseOopCopayCursorInCtx methodIn)
      throws Exception {

    // *81***************************************************************
    // *81 5830-Close-oop-copay-cursor.                                 *
    // *81 business function: close the cursor                          *
    // *81***************************************************************
    // *82***************************************************************
    // *82 5830-close-oop-copay-cursor.                                 *
    // *82 1.close cursor cur-copay-oop-csr                             *
    // *82***************************************************************
    // Added variable to get the program context in place.
    D5427polCtx programCtx = methodIn.getD5427polCtx();
    // Added variable to get the output context in place.
    CloseOopCopayCursorOutCtx methodOut = methodIn.getCloseOopCopayCursorOutCtx();
    //  cobolCode::CLOSE CUR-COPAY-OOP-CSR
    d5427polRepository.closeCurCopayOopCsrD5427pol(
        programCtx.getCurCopayOopCsrResultSet(), programCtx.getSqlca());
    //  cobolCode::MOVE SQLCODE TO WS-SQLCODE DSM-SQLCODE
    methodOut.setSqlcode_Ws(methodOut.getSqlcode());
    methodOut.setDsmSqlcode(methodOut.getSqlcode());
    //  cobolCode::EVALUATE TRUE
    if (methodOut.isSqlcodeOk()) {;
    } else {
      //  cobolCode::SET DSM-DB2-ERROR TO TRUE
      methodOut.setDsmDb2ErrorTrue();

      //  cobolCode::MOVE 'CLOSE' TO DSM-ERR-TBL-ACTION
      methodOut.setDsmErrTblAction(CONSTANTS.LITERAL_CLOSE_B5_);
      //  cobolCode::MOVE 'POL_PLN_ACCUM_RULE' TO DSM-ERR-TBL-NAME
      methodOut.setDsmErrTblName(CONSTANTS.LITERAL_POL_PLN_ACCUM_RULE_B7_);
      //  cobolCode::MOVE '5830-CLOSE-OOP-COPAY-CURSOR' TO DSM-ERR-SECTN-NAME
      methodOut.setDsmErrSectnName(CONSTANTS.LITERAL_1406957574);
      //  cobolCode::MOVE 'D5427POL' TO DSM-ERR-PGM-NAME
      //  LITERAL_D5427POL = 'D5427POL'
      methodOut.setDsmErrPgmName(CONSTANTS.LITERAL_D5427POL);
      //  cobolCode::PERFORM 7777-MOVES-FOR-ERROR-LOG
      movesForErrorLog(programCtx.getMovesForErrorLogInCtx()); /*7777-MOVES-FOR-ERROR-LOG SECTION*/
      if (programCtx.isProgramEnded()) {
        return methodOut;
      }
    }

    return methodOut;
  }
  /**
   * populateRetPol4Dacm This method is derived from COBOL Paragraph - 5840-POPULATE-RET-POL4-DACM
   * SECTION COBOL Cyclomatic complexity - 9 Input :
   *
   * <p>- dacmAccumRuleTypCd COBOL Name: DACM-ACCUM-RULE-TYP-CD - dacmAccumBenTypCd COBOL Name:
   * DACM-ACCUM-BEN-TYP-CD - dacmIndvMaxAmt COBOL Name: DACM-INDV-MAX-AMT - dacmFamMaxAmt COBOL
   * Name: DACM-FAM-MAX-AMT - dacmIndvOopAmt COBOL Name: DACM-INDV-OOP-AMT - dacmFamOopAmt COBOL
   * Name: DACM-FAM-OOP-AMT - dacmEePls1Amt COBOL Name: DACM-EE-PLS-1-AMT - dacmEePlsSpAmt COBOL
   * Name: DACM-EE-PLS-SP-AMT - dacmEePlsChAmt COBOL Name: DACM-EE-PLS-CH-AMT
   *
   * <p>Output :
   *
   * <p>- pol4CopayIndMaxInn COBOL Name: POL4-COPAY-IND-MAX-INN - dacmIndvMaxAmt COBOL Name:
   * DACM-INDV-MAX-AMT - pol4CopayFamMaxInn COBOL Name: POL4-COPAY-FAM-MAX-INN - dacmFamMaxAmt COBOL
   * Name: DACM-FAM-MAX-AMT - pol4CopayIndMaxOon COBOL Name: POL4-COPAY-IND-MAX-OON -
   * pol4CopayFamMaxOon COBOL Name: POL4-COPAY-FAM-MAX-OON - pol4CopayIndMaxT1 COBOL Name:
   * POL4-COPAY-IND-MAX-T1 - pol4CopayFamMaxT1 COBOL Name: POL4-COPAY-FAM-MAX-T1 - pol4InnIndCoreAmt
   * COBOL Name: POL4-INN-IND-CORE-AMT - dacmIndvOopAmt COBOL Name: DACM-INDV-OOP-AMT -
   * pol4InnFamCoreAmt COBOL Name: POL4-INN-FAM-CORE-AMT - dacmFamOopAmt COBOL Name:
   * DACM-FAM-OOP-AMT - pol4CoreInNtwkEePls1Amt COBOL Name: POL4-CORE-IN-NTWK-EE-PLS1-AMT -
   * dacmEePls1Amt COBOL Name: DACM-EE-PLS-1-AMT - pol4CoreInNtwkEeSpoAmt COBOL Name:
   * POL4-CORE-IN-NTWK-EE-SPO-AMT - dacmEePlsSpAmt COBOL Name: DACM-EE-PLS-SP-AMT -
   * pol4CoreInNtwkEeChrgAmt COBOL Name: POL4-CORE-IN-NTWK-EE-CHRG-AMT - dacmEePlsChAmt COBOL Name:
   * DACM-EE-PLS-CH-AMT - pol4OonIndCoreAmt COBOL Name: POL4-OON-IND-CORE-AMT - pol4OonFamCoreAmt
   * COBOL Name: POL4-OON-FAM-CORE-AMT - pol4CoreCombEePls1Amt COBOL Name:
   * POL4-CORE-COMB-EE-PLS-1-AMT - pol4CoreCombEeSpoAmt COBOL Name: POL4-CORE-COMB-EE-SPO-AMT -
   * pol4CoreCombEeChrgAmt COBOL Name: POL4-CORE-COMB-EE-CHRG-AMT - pol4T1IndCoreAmt COBOL Name:
   * POL4-T1-IND-CORE-AMT - pol4T1FamCoreAmt COBOL Name: POL4-T1-FAM-CORE-AMT
   *
   * @throws CFException
   */
  @Override
  public PopulateRetPol4DacmOutCtx populateRetPol4Dacm(PopulateRetPol4DacmInCtx methodIn)
      throws Exception {

    // *82***************************************************************
    // *82 5840-Populate-ret-pol4-dacm.                                 *
    // *82 1. populate the return data                                  *
    // *82***************************************************************

    // ***67896M     if dacm-accum-rule-typ-cd = 'copay'
    // Added variable to get the program context in place.
    D5427polCtx programCtx = methodIn.getD5427polCtx();
    // Added variable to get the output context in place.
    PopulateRetPol4DacmOutCtx methodOut = methodIn.getPopulateRetPol4DacmOutCtx();
    //  cobolCode::IF DACM-ACCUM-RULE-TYP-CD = 'CPAY'
    //  LITERAL_CPAY = 'CPAY'
    if (compareChars(methodIn.getDacmAccumRuleTypCd(), CONSTANTS.LITERAL_CPAY) == 0) {
      //  cobolCode::IF DACM-ACCUM-BEN-TYP-CD = 'I'
      //  LITERAL_I = 'I'
      if (compareChars(methodIn.getDacmAccumBenTypCd(), CONSTANTS.LITERAL_I) == 0) {
        //  cobolCode::MOVE DACM-INDV-MAX-AMT TO POL4-COPAY-IND-MAX-INN
        methodOut.setPol4CopayIndMaxInn(methodOut.getDacmIndvMaxAmt());
        //  cobolCode::MOVE DACM-FAM-MAX-AMT TO POL4-COPAY-FAM-MAX-INN
        methodOut.setPol4CopayFamMaxInn(methodOut.getDacmFamMaxAmt());
      }
      //  cobolCode::IF DACM-ACCUM-BEN-TYP-CD = 'O'
      //  LITERAL_O = 'O'
      if (compareChars(methodIn.getDacmAccumBenTypCd(), CONSTANTS.LITERAL_O) == 0) {
        //  cobolCode::MOVE DACM-INDV-MAX-AMT TO POL4-COPAY-IND-MAX-OON
        methodOut.setPol4CopayIndMaxOon(methodOut.getDacmIndvMaxAmt());
        //  cobolCode::MOVE DACM-FAM-MAX-AMT TO POL4-COPAY-FAM-MAX-OON
        methodOut.setPol4CopayFamMaxOon(methodOut.getDacmFamMaxAmt());
      }
      //  cobolCode::IF DACM-ACCUM-BEN-TYP-CD = 'T'
      //  LITERAL_T = 'T'
      if (compareChars(methodIn.getDacmAccumBenTypCd(), CONSTANTS.LITERAL_T) == 0) {
        //  cobolCode::MOVE DACM-INDV-MAX-AMT TO POL4-COPAY-IND-MAX-T1
        methodOut.setPol4CopayIndMaxT1(methodOut.getDacmIndvMaxAmt());
        //  cobolCode::MOVE DACM-FAM-MAX-AMT TO POL4-COPAY-FAM-MAX-T1
        methodOut.setPol4CopayFamMaxT1(methodOut.getDacmFamMaxAmt());
      }
    }
    //  cobolCode::IF DACM-ACCUM-RULE-TYP-CD = 'COOP'
    //  LITERAL_COOP = 'COOP'
    if (compareChars(methodIn.getDacmAccumRuleTypCd(), CONSTANTS.LITERAL_COOP) == 0) {
      //  cobolCode::IF DACM-ACCUM-BEN-TYP-CD = 'I'
      //  LITERAL_I = 'I'
      if (compareChars(methodIn.getDacmAccumBenTypCd(), CONSTANTS.LITERAL_I) == 0) {
        //  cobolCode::MOVE DACM-INDV-OOP-AMT TO POL4-INN-IND-CORE-AMT
        methodOut.setPol4InnIndCoreAmt(methodOut.getDacmIndvOopAmt());
        //  cobolCode::MOVE DACM-FAM-OOP-AMT TO POL4-INN-FAM-CORE-AMT
        methodOut.setPol4InnFamCoreAmt(methodOut.getDacmFamOopAmt());
        //  cobolCode::MOVE DACM-EE-PLS-1-AMT TO POL4-CORE-IN-NTWK-EE-PLS1-AMT
        methodOut.setPol4CoreInNtwkEePls1Amt(methodOut.getDacmEePls1Amt().intValue());
        //  cobolCode::MOVE DACM-EE-PLS-SP-AMT TO POL4-CORE-IN-NTWK-EE-SPO-AMT
        methodOut.setPol4CoreInNtwkEeSpoAmt(methodOut.getDacmEePlsSpAmt().intValue());
        //  cobolCode::MOVE DACM-EE-PLS-CH-AMT TO POL4-CORE-IN-NTWK-EE-CHRG-AMT
        methodOut.setPol4CoreInNtwkEeChrgAmt(methodOut.getDacmEePlsChAmt().intValue());
      }
      //  cobolCode::IF DACM-ACCUM-BEN-TYP-CD = 'O'
      //  LITERAL_O = 'O'
      if (compareChars(methodIn.getDacmAccumBenTypCd(), CONSTANTS.LITERAL_O) == 0) {
        //  cobolCode::MOVE DACM-INDV-OOP-AMT TO POL4-OON-IND-CORE-AMT
        methodOut.setPol4OonIndCoreAmt(methodOut.getDacmIndvOopAmt());
        //  cobolCode::MOVE DACM-FAM-OOP-AMT TO POL4-OON-FAM-CORE-AMT
        methodOut.setPol4OonFamCoreAmt(methodOut.getDacmFamOopAmt());
        //  cobolCode::MOVE DACM-EE-PLS-1-AMT TO POL4-CORE-COMB-EE-PLS-1-AMT
        methodOut.setPol4CoreCombEePls1Amt(methodOut.getDacmEePls1Amt().intValue());
        //  cobolCode::MOVE DACM-EE-PLS-SP-AMT TO POL4-CORE-COMB-EE-SPO-AMT
        methodOut.setPol4CoreCombEeSpoAmt(methodOut.getDacmEePlsSpAmt().intValue());
        //  cobolCode::MOVE DACM-EE-PLS-CH-AMT TO POL4-CORE-COMB-EE-CHRG-AMT
        methodOut.setPol4CoreCombEeChrgAmt(methodOut.getDacmEePlsChAmt().intValue());
      }
      //  cobolCode::IF DACM-ACCUM-BEN-TYP-CD = 'T'
      //  LITERAL_T = 'T'
      if (compareChars(methodIn.getDacmAccumBenTypCd(), CONSTANTS.LITERAL_T) == 0) {
        //  cobolCode::MOVE DACM-INDV-OOP-AMT TO POL4-T1-IND-CORE-AMT
        methodOut.setPol4T1IndCoreAmt(methodOut.getDacmIndvOopAmt());
        //  cobolCode::MOVE DACM-FAM-OOP-AMT TO POL4-T1-FAM-CORE-AMT
        methodOut.setPol4T1FamCoreAmt(methodOut.getDacmFamOopAmt());
      }
    }

    return methodOut;
  }
  /**
   * funCd5PolhdrTherRead This method is derived from COBOL Paragraph -
   * 6000-FUN-CD5-POLHDR-THER-READ SECTION COBOL Cyclomatic complexity - 5 Input :
   *
   * <p>- sqlcode COBOL Name: SQLCODE
   *
   * <p>Output :
   *
   * <p>- sqlcode_Ws COBOL Name: WS-SQLCODE - dsmSqlcode COBOL Name: DSM-SQLCODE - sqlcode COBOL
   * Name: SQLCODE - dsmReturnCode COBOL Name: DSM-RETURN-CODE - dsmErrTblAction COBOL Name:
   * DSM-ERR-TBL-ACTION - dsmErrTblName COBOL Name: DSM-ERR-TBL-NAME - dsmErrSectnName COBOL Name:
   * DSM-ERR-SECTN-NAME - dsmErrPgmName COBOL Name: DSM-ERR-PGM-NAME
   *
   * @throws CFException
   */
  @Override
  public FunCd5PolhdrTherReadOutCtx funCd5PolhdrTherRead(FunCd5PolhdrTherReadInCtx methodIn)
      throws Exception {

    // *81***************************************************************
    // *81 6000-Fun-cd5-polhdr-ther-read.                               *
    // *81 business function: retrieve the records from the table       *
    // *81***************************************************************
    // *82***************************************************************
    // *82 6000-fun-cd5-polhdr-ther-read.                               *
    // *82 1. therapy information from pol_pln_mstr                     *
    // *82***************************************************************
    // Added variable to get the program context in place.
    D5427polCtx programCtx = methodIn.getD5427polCtx();
    // Added variable to get the output context in place.
    FunCd5PolhdrTherReadOutCtx methodOut = methodIn.getFunCd5PolhdrTherReadOutCtx();
    //  cobolCode::SELECT BEN_MAX_COMB_PRI_CD , BEN_MAX_COMB_PRI_CNT , BEN_MAX_COMB_SEC_CD ,
    // BEN_MAX_COMB_SEC_CNT , BEN_MAX_CRDC_REHAB_PRI_CD , BEN_MAX_CRDC_REHAB_PRI_CNT ,
    // BEN_MAX_CRDC_REHAB_SEC_CD , BEN_MAX_CRDC_REHAB_SEC_CNT , BEN_MAX_OCP_TRPY_PRI_CD ,
    // BEN_MAX_OCP_TRPY_PRI_CNT , BEN_MAX_OCP_TRPY_SEC_CD , BEN_MAX_OCP_TRPY_SEC_CNT ,
    // BEN_MAX_PH_OC_SPCH_PRI_CD , BEN_MAX_PH_OC_SPCH_PRI_CNT , BEN_MAX_PH_OC_SPCH_SEC_CD ,
    // BEN_MAX_PH_OC_SPCH_SEC_CNT , BEN_MAX_PH_OC_TRPY_PRI_CD , BEN_MAX_PH_OC_TRPY_PRI_CNT ,
    // BEN_MAX_PH_OC_TRPY_SEC_CD , BEN_MAX_PH_OC_TRPY_SEC_CNT , BEN_MAX_PHYS_TRPY_PRI_CD ,
    // BEN_MAX_PHYS_TRPY_PRI_CNT , BEN_MAX_PHYS_TRPY_SEC_CD , BEN_MAX_PHYS_TRPY_SEC_CNT ,
    // BEN_MAX_SPCH_TRPY_PRI_CD , BEN_MAX_SPCH_TRPY_PRI_CNT , BEN_MAX_SPCH_TRPY_SEC_CD ,
    // BEN_MAX_SPCH_TRPY_SEC_CNT , BEN_MAX_SPNE_MNIP_PRI_CD , BEN_MAX_SPNE_MNIP_PRI_CNT ,
    // BEN_MAX_SPNE_MNIP_SEC_CD , BEN_MAX_SPNE_MNIP_SEC_CNT , PHYS_MEDCN_PRD_CD , SRVC_CD_N_SET_IND
    // , SRVC_CD_P_SET_IND , SRVC_CD_T_SET_IND , MCR_CD , BEN_MAX_AURAL_CI_PRI_CD ,
    // BEN_MAX_AURAL_CI_PRI_CNT , BEN_MAX_AURAL_CI_SEC_CD , BEN_MAX_AURAL_CI_SEC_CNT ,
    // BEN_MAX_COG_TRPY_PRI_CD , BEN_MAX_COG_TRPY_PRI_CNT , BEN_MAX_COG_TRPY_SEC_CD ,
    // BEN_MAX_COG_TRPY_SEC_CNT , BEN_MAX_COG_TRPY_EXCL_CD , BEN_MAX_EHB_SPNE_RHAB_CNT ,
    // BEN_MAX_EHB_SPNE_HAB_CNT , BEN_MAX_EHB_PT_RHAB_CNT , BEN_MAX_EHB_PT_HAB_CNT ,
    // BEN_MAX_EHB_SPCH_RHAB_CNT , BEN_MAX_EHB_SPCH_HAB_CNT , BEN_MAX_EHB_CRDC_RHAB_CNT ,
    // BEN_MAX_EHB_OT_RHAB_CNT , BEN_MAX_EHB_OT_HAB_CNT , BEN_MAX_EHB_PLMRY_RHAB_CNT ,
    // BEN_MAX_EHB_AURAL_RHAB_CNT , BEN_MAX_EHB_AURAL_HAB_CNT , BEN_MAX_EHB_COG_RHAB_CNT ,
    // BEN_MAX_EHB_COG_HAB_CNT , BEN_MAX_EHB_POST_RHAB_CNT , BEN_MAX_EHB_POST_HAB_CNT ,
    // BEN_MAX_EHB_PTOT_RHAB_CNT , BEN_MAX_EHB_PTOT_HAB_CNT , BEN_MAX_EHB_RHAB_RMRK_CD ,
    // BEN_MAX_EHB_POSM_RHAB_CNT , BEN_MAX_EHB_POSM_HAB_CNT , BEN_MAX_EHB_HAB_RMRK_CD ,
    // BEN_PHYS_MEDCN_PRD_CD , RHAB_COMB_PT_LMT_CD , RHAB_COMB_OT_LMT_CD , RHAB_COMB_ST_LMT_CD ,
    // RHAB_COMB_SM_LMT_CD , RHAB_COMB_CI_LMT_CD , RHAB_COMB_CT_LMT_CD , RHAB_COMB_CR_LMT_CD ,
    // RHAB_COMB_PR_LMT_CD , RHAB_COMB_MT_LMT_CD , HAB_COMB_PT_LMT_CD , HAB_COMB_OT_LMT_CD ,
    // HAB_COMB_ST_LMT_CD , HAB_COMB_SM_LMT_CD , HAB_COMB_CI_LMT_CD , HAB_COMB_CT_LMT_CD ,
    // HAB_COMB_MT_LMT_CD FROM POL_PLN_MSTR T1 , POL_PLN_MSTR_ADDTL_INFO T2 WHERE T1.COV_TYP_CD = ?
    // AND T1.POL_NBR = ? AND T1.PLN_NBR = ? AND T1.CLSS_NBR = ? AND T1.COV_TYP_CD = T2.COV_TYP_CD
    // AND T1.POL_NBR = T2.POL_NBR AND T1.PLN_NBR = T2.PLN_NBR AND T1.CLSS_NBR = T2.CLSS_NBR
    d5427polRepository.selectPolPlnMstr5(
        methodOut.getDclpolPlnMstrAddtlInfo(), methodOut.getDclpolPlnMstr(), programCtx.getSqlca());
    //  cobolCode::MOVE SQLCODE TO WS-SQLCODE DSM-SQLCODE
    methodOut.setSqlcode_Ws(methodOut.getSqlcode());
    methodOut.setDsmSqlcode(methodOut.getSqlcode());
    //  cobolCode::EVALUATE TRUE
    if (methodOut.isSqlcodeOk()) {
      //  cobolCode::PERFORM 6100-POPULATE-CD5-POLHDR-THER
      populateCd5PolhdrTher(programCtx); /*6100-POPULATE-CD5-POLHDR-THER SECTION*/
      if (programCtx.isProgramEnded()) {
        return methodOut;
      }
    } else if (methodOut.isSqlcodeNotFound()) {
      //  cobolCode::SET DSM-ENTRY-NOT-FND-INQ TO TRUE
      methodOut.setDsmEntryNotFndInqTrue();

      //  cobolCode::MOVE 'SELECT' TO DSM-ERR-TBL-ACTION
      methodOut.setDsmErrTblAction(CONSTANTS.LITERAL_SELECT_B4_);
      //  cobolCode::MOVE 'POL_PLN_MSTR' TO DSM-ERR-TBL-NAME
      methodOut.setDsmErrTblName(CONSTANTS.LITERAL_POL_PLN_MSTR_B13_);
      //  cobolCode::MOVE '6000-FUN-CD5-POLHDR-THER-READ' TO DSM-ERR-SECTN-NAME
      methodOut.setDsmErrSectnName(CONSTANTS.LITERAL_1758377544);
      //  cobolCode::MOVE 'D5427POL' TO DSM-ERR-PGM-NAME
      //  LITERAL_D5427POL = 'D5427POL'
      methodOut.setDsmErrPgmName(CONSTANTS.LITERAL_D5427POL);
      //  cobolCode::PERFORM 7777-MOVES-FOR-ERROR-LOG
      movesForErrorLog(programCtx.getMovesForErrorLogInCtx()); /*7777-MOVES-FOR-ERROR-LOG SECTION*/
      if (programCtx.isProgramEnded()) {
        return methodOut;
      }
    } else {
      //  cobolCode::SET DSM-DB2-ERROR TO TRUE
      methodOut.setDsmDb2ErrorTrue();

      //  cobolCode::MOVE 'SELECT' TO DSM-ERR-TBL-ACTION
      methodOut.setDsmErrTblAction(CONSTANTS.LITERAL_SELECT_B4_);
      //  cobolCode::MOVE 'POL_PLN_MSTR' TO DSM-ERR-TBL-NAME
      methodOut.setDsmErrTblName(CONSTANTS.LITERAL_POL_PLN_MSTR_B13_);
      //  cobolCode::MOVE '6000-FUN-CD5-POLHDR-THER-READ' TO DSM-ERR-SECTN-NAME
      methodOut.setDsmErrSectnName(CONSTANTS.LITERAL_1758377544);
      //  cobolCode::MOVE 'D5427POL' TO DSM-ERR-PGM-NAME
      //  LITERAL_D5427POL = 'D5427POL'
      methodOut.setDsmErrPgmName(CONSTANTS.LITERAL_D5427POL);
      //  cobolCode::PERFORM 7777-MOVES-FOR-ERROR-LOG
      movesForErrorLog(programCtx.getMovesForErrorLogInCtx()); /*7777-MOVES-FOR-ERROR-LOG SECTION*/
      if (programCtx.isProgramEnded()) {
        return methodOut;
      }
    }

    return methodOut;
  }
  /**
   * populateCd5PolhdrTher This method is derived from COBOL Paragraph -
   * 6100-POPULATE-CD5-POLHDR-THER SECTION COBOL Cyclomatic complexity - 1 Input : None
   *
   * <p>Output : None
   *
   * @throws CFException
   */
  @Override
  public void populateCd5PolhdrTher(D5427polCtx programCtx) throws Exception {

    // *81***************************************************************
    // *82***************************************************************
    // *82 6100-Populate-cd5-polhdr-ther.                               *
    // *82 1. populate the return data - therapy information            *
    // *82***************************************************************
    //  cobolCode::PERFORM 6100-POPULATE-CD5-POLHDR-THER-SPLIT5
    populateCd5PolhdrTherSplit5(
        programCtx.getPopulateCd5PolhdrTherSplit5InCtx()); /*6100-POPULATE-CD5-POLHDR-THER-SPLIT5*/
    //  cobolCode::PERFORM 6100-POPULATE-CD5-POLHDR-THER-SPLIT6
    populateCd5PolhdrTherSplit6(
        programCtx.getPopulateCd5PolhdrTherSplit6InCtx()); /*6100-POPULATE-CD5-POLHDR-THER-SPLIT6*/
  }
  /**
   * populateCd5PolhdrTherSplit5 This method is derived from COBOL Paragraph -
   * 6100-POPULATE-CD5-POLHDR-THER-SPLIT5 COBOL Cyclomatic complexity - 1 Input :
   *
   * <p>- mmiBenMaxCombPriCd COBOL Name: MMI-BEN-MAX-COMB-PRI-CD - mmiBenMaxCombPriCnt COBOL Name:
   * MMI-BEN-MAX-COMB-PRI-CNT - mmiBenMaxCombSecCd COBOL Name: MMI-BEN-MAX-COMB-SEC-CD -
   * mmiBenMaxCombSecCnt COBOL Name: MMI-BEN-MAX-COMB-SEC-CNT - mmiBenMaxCrdcRehabPriCd COBOL Name:
   * MMI-BEN-MAX-CRDC-REHAB-PRI-CD - mmiBenMaxCrdcRehabPriCnt COBOL Name:
   * MMI-BEN-MAX-CRDC-REHAB-PRI-CNT - mmiBenMaxCrdcRehabSecCd COBOL Name:
   * MMI-BEN-MAX-CRDC-REHAB-SEC-CD - mmiBenMaxCrdcRehabSecCnt COBOL Name:
   * MMI-BEN-MAX-CRDC-REHAB-SEC-CNT - mmiBenMaxOcpTrpyPriCd COBOL Name: MMI-BEN-MAX-OCP-TRPY-PRI-CD
   * - mmiBenMaxOcpTrpyPriCnt COBOL Name: MMI-BEN-MAX-OCP-TRPY-PRI-CNT - mmiBenMaxOcpTrpySecCd COBOL
   * Name: MMI-BEN-MAX-OCP-TRPY-SEC-CD - mmiBenMaxOcpTrpySecCnt COBOL Name:
   * MMI-BEN-MAX-OCP-TRPY-SEC-CNT - mmiBenMaxPhOcSpchPriCd COBOL Name: MMI-BEN-MAX-PH-OC-SPCH-PRI-CD
   * - mmiBenMaxPhOcSpchPriCnt COBOL Name: MMI-BEN-MAX-PH-OC-SPCH-PRI-CNT - mmiBenMaxPhOcSpchSecCd
   * COBOL Name: MMI-BEN-MAX-PH-OC-SPCH-SEC-CD - mmiBenMaxPhOcSpchSecCnt COBOL Name:
   * MMI-BEN-MAX-PH-OC-SPCH-SEC-CNT - mmiBenMaxPhOcTrpyPriCd COBOL Name:
   * MMI-BEN-MAX-PH-OC-TRPY-PRI-CD - mmiBenMaxPhOcTrpyPriCnt COBOL Name:
   * MMI-BEN-MAX-PH-OC-TRPY-PRI-CNT - mmiBenMaxPhOcTrpySecCd COBOL Name:
   * MMI-BEN-MAX-PH-OC-TRPY-SEC-CD - mmiBenMaxPhOcTrpySecCnt COBOL Name:
   * MMI-BEN-MAX-PH-OC-TRPY-SEC-CNT - mmiBenMaxPhysTrpyPriCd COBOL Name:
   * MMI-BEN-MAX-PHYS-TRPY-PRI-CD - mmiBenMaxPhysTrpyPriCnt COBOL Name:
   * MMI-BEN-MAX-PHYS-TRPY-PRI-CNT - mmiBenMaxPhysTrpySecCd COBOL Name: MMI-BEN-MAX-PHYS-TRPY-SEC-CD
   * - mmiBenMaxPhysTrpySecCnt COBOL Name: MMI-BEN-MAX-PHYS-TRPY-SEC-CNT - mmiBenMaxSpchTrpyPriCd
   * COBOL Name: MMI-BEN-MAX-SPCH-TRPY-PRI-CD - mmiBenMaxSpchTrpyPriCnt COBOL Name:
   * MMI-BEN-MAX-SPCH-TRPY-PRI-CNT - mmiBenMaxSpchTrpySecCd COBOL Name: MMI-BEN-MAX-SPCH-TRPY-SEC-CD
   * - mmiBenMaxSpchTrpySecCnt COBOL Name: MMI-BEN-MAX-SPCH-TRPY-SEC-CNT - mmiBenMaxSpneMnipPriCd
   * COBOL Name: MMI-BEN-MAX-SPNE-MNIP-PRI-CD - mmiBenMaxSpneMnipPriCnt COBOL Name:
   * MMI-BEN-MAX-SPNE-MNIP-PRI-CNT - mmiBenMaxSpneMnipSecCd COBOL Name: MMI-BEN-MAX-SPNE-MNIP-SEC-CD
   * - mmiBenMaxSpneMnipSecCnt COBOL Name: MMI-BEN-MAX-SPNE-MNIP-SEC-CNT - mmiPhysMedcnPrdCd COBOL
   * Name: MMI-PHYS-MEDCN-PRD-CD - mmiSrvcCdNSetInd COBOL Name: MMI-SRVC-CD-N-SET-IND -
   * mmiSrvcCdPSetInd COBOL Name: MMI-SRVC-CD-P-SET-IND - mmiSrvcCdTSetInd COBOL Name:
   * MMI-SRVC-CD-T-SET-IND - mmiMcrCd COBOL Name: MMI-MCR-CD - mmiBenMaxAuralCiPriCd COBOL Name:
   * MMI-BEN-MAX-AURAL-CI-PRI-CD - mmiBenMaxAuralCiPriCnt COBOL Name: MMI-BEN-MAX-AURAL-CI-PRI-CNT -
   * mmiBenMaxAuralCiSecCd COBOL Name: MMI-BEN-MAX-AURAL-CI-SEC-CD - mmiBenMaxAuralCiSecCnt COBOL
   * Name: MMI-BEN-MAX-AURAL-CI-SEC-CNT - mmiBenMaxCogTrpyPriCd COBOL Name:
   * MMI-BEN-MAX-COG-TRPY-PRI-CD - mmiBenMaxCogTrpyPriCnt COBOL Name: MMI-BEN-MAX-COG-TRPY-PRI-CNT -
   * mmiBenMaxCogTrpySecCd COBOL Name: MMI-BEN-MAX-COG-TRPY-SEC-CD - mmiBenMaxCogTrpySecCnt COBOL
   * Name: MMI-BEN-MAX-COG-TRPY-SEC-CNT - mmiBenMaxCogTrpyExclCd COBOL Name:
   * MMI-BEN-MAX-COG-TRPY-EXCL-CD - mmiBenMaxEhbSpneRhabCnt COBOL Name:
   * MMI-BEN-MAX-EHB-SPNE-RHAB-CNT - mmiBenMaxEhbSpneHabCnt COBOL Name: MMI-BEN-MAX-EHB-SPNE-HAB-CNT
   * - mmiBenMaxEhbPtRhabCnt COBOL Name: MMI-BEN-MAX-EHB-PT-RHAB-CNT - mmiBenMaxEhbPtHabCnt COBOL
   * Name: MMI-BEN-MAX-EHB-PT-HAB-CNT - mmiBenMaxEhbSpchRhabCnt COBOL Name:
   * MMI-BEN-MAX-EHB-SPCH-RHAB-CNT
   *
   * <p>Output :
   *
   * <p>- pol5BenMaxCombPriCd COBOL Name: POL5-BEN-MAX-COMB-PRI-CD - mmiBenMaxCombPriCd COBOL Name:
   * MMI-BEN-MAX-COMB-PRI-CD - pol5BenMaxCombPriCnt COBOL Name: POL5-BEN-MAX-COMB-PRI-CNT -
   * mmiBenMaxCombPriCnt COBOL Name: MMI-BEN-MAX-COMB-PRI-CNT - pol5BenMaxCombSecCd COBOL Name:
   * POL5-BEN-MAX-COMB-SEC-CD - mmiBenMaxCombSecCd COBOL Name: MMI-BEN-MAX-COMB-SEC-CD -
   * pol5BenMaxCombSecCnt COBOL Name: POL5-BEN-MAX-COMB-SEC-CNT - mmiBenMaxCombSecCnt COBOL Name:
   * MMI-BEN-MAX-COMB-SEC-CNT - pol5CrdcRehabPriCd COBOL Name: POL5-CRDC-REHAB-PRI-CD -
   * mmiBenMaxCrdcRehabPriCd COBOL Name: MMI-BEN-MAX-CRDC-REHAB-PRI-CD - pol5CrdcRehabPriCnt COBOL
   * Name: POL5-CRDC-REHAB-PRI-CNT - mmiBenMaxCrdcRehabPriCnt COBOL Name:
   * MMI-BEN-MAX-CRDC-REHAB-PRI-CNT - pol5CrdcRehabSecCd COBOL Name: POL5-CRDC-REHAB-SEC-CD -
   * mmiBenMaxCrdcRehabSecCd COBOL Name: MMI-BEN-MAX-CRDC-REHAB-SEC-CD - pol5CrdcRehabSecCnt COBOL
   * Name: POL5-CRDC-REHAB-SEC-CNT - mmiBenMaxCrdcRehabSecCnt COBOL Name:
   * MMI-BEN-MAX-CRDC-REHAB-SEC-CNT - pol5OcpTrpyPriCd COBOL Name: POL5-OCP-TRPY-PRI-CD -
   * mmiBenMaxOcpTrpyPriCd COBOL Name: MMI-BEN-MAX-OCP-TRPY-PRI-CD - pol5OcpTrpyPriCnt COBOL Name:
   * POL5-OCP-TRPY-PRI-CNT - mmiBenMaxOcpTrpyPriCnt COBOL Name: MMI-BEN-MAX-OCP-TRPY-PRI-CNT -
   * pol5OcpTrpySecCd COBOL Name: POL5-OCP-TRPY-SEC-CD - mmiBenMaxOcpTrpySecCd COBOL Name:
   * MMI-BEN-MAX-OCP-TRPY-SEC-CD - pol5OcpTrpySecCnt COBOL Name: POL5-OCP-TRPY-SEC-CNT -
   * mmiBenMaxOcpTrpySecCnt COBOL Name: MMI-BEN-MAX-OCP-TRPY-SEC-CNT - pol5PhyOcpSpchPriCd COBOL
   * Name: POL5-PHY-OCP-SPCH-PRI-CD - mmiBenMaxPhOcSpchPriCd COBOL Name:
   * MMI-BEN-MAX-PH-OC-SPCH-PRI-CD - pol5PhyOcpSpchPriCnt COBOL Name: POL5-PHY-OCP-SPCH-PRI-CNT -
   * mmiBenMaxPhOcSpchPriCnt COBOL Name: MMI-BEN-MAX-PH-OC-SPCH-PRI-CNT - pol5PhyOcpSpchSecCd COBOL
   * Name: POL5-PHY-OCP-SPCH-SEC-CD - mmiBenMaxPhOcSpchSecCd COBOL Name:
   * MMI-BEN-MAX-PH-OC-SPCH-SEC-CD - pol5PhyOcpSpchSecCnt COBOL Name: POL5-PHY-OCP-SPCH-SEC-CNT -
   * mmiBenMaxPhOcSpchSecCnt COBOL Name: MMI-BEN-MAX-PH-OC-SPCH-SEC-CNT - pol5PhyOcpTrpyPriCd COBOL
   * Name: POL5-PHY-OCP-TRPY-PRI-CD - mmiBenMaxPhOcTrpyPriCd COBOL Name:
   * MMI-BEN-MAX-PH-OC-TRPY-PRI-CD - pol5PhyOcpTrpyPriCnt COBOL Name: POL5-PHY-OCP-TRPY-PRI-CNT -
   * mmiBenMaxPhOcTrpyPriCnt COBOL Name: MMI-BEN-MAX-PH-OC-TRPY-PRI-CNT - pol5PhyOcpTrpySecCd COBOL
   * Name: POL5-PHY-OCP-TRPY-SEC-CD - mmiBenMaxPhOcTrpySecCd COBOL Name:
   * MMI-BEN-MAX-PH-OC-TRPY-SEC-CD - pol5PhyOcpTrpySecCnt COBOL Name: POL5-PHY-OCP-TRPY-SEC-CNT -
   * mmiBenMaxPhOcTrpySecCnt COBOL Name: MMI-BEN-MAX-PH-OC-TRPY-SEC-CNT - pol5PhysTrpyPriCd COBOL
   * Name: POL5-PHYS-TRPY-PRI-CD - mmiBenMaxPhysTrpyPriCd COBOL Name: MMI-BEN-MAX-PHYS-TRPY-PRI-CD -
   * pol5PhysTrpyPriCnt COBOL Name: POL5-PHYS-TRPY-PRI-CNT - mmiBenMaxPhysTrpyPriCnt COBOL Name:
   * MMI-BEN-MAX-PHYS-TRPY-PRI-CNT - pol5PhysTrpySecCd COBOL Name: POL5-PHYS-TRPY-SEC-CD -
   * mmiBenMaxPhysTrpySecCd COBOL Name: MMI-BEN-MAX-PHYS-TRPY-SEC-CD - pol5PhysTrpySecCnt COBOL
   * Name: POL5-PHYS-TRPY-SEC-CNT - mmiBenMaxPhysTrpySecCnt COBOL Name:
   * MMI-BEN-MAX-PHYS-TRPY-SEC-CNT - pol5SpchTrpyPriCd COBOL Name: POL5-SPCH-TRPY-PRI-CD -
   * mmiBenMaxSpchTrpyPriCd COBOL Name: MMI-BEN-MAX-SPCH-TRPY-PRI-CD - pol5SpchTrpyPriCnt COBOL
   * Name: POL5-SPCH-TRPY-PRI-CNT - mmiBenMaxSpchTrpyPriCnt COBOL Name:
   * MMI-BEN-MAX-SPCH-TRPY-PRI-CNT - pol5SpchTrpySecCd COBOL Name: POL5-SPCH-TRPY-SEC-CD -
   * mmiBenMaxSpchTrpySecCd COBOL Name: MMI-BEN-MAX-SPCH-TRPY-SEC-CD - pol5SpchTrpySecCnt COBOL
   * Name: POL5-SPCH-TRPY-SEC-CNT - mmiBenMaxSpchTrpySecCnt COBOL Name:
   * MMI-BEN-MAX-SPCH-TRPY-SEC-CNT - pol5SpineManipPriCd COBOL Name: POL5-SPINE-MANIP-PRI-CD -
   * mmiBenMaxSpneMnipPriCd COBOL Name: MMI-BEN-MAX-SPNE-MNIP-PRI-CD - pol5SpineManipPriCnt COBOL
   * Name: POL5-SPINE-MANIP-PRI-CNT - mmiBenMaxSpneMnipPriCnt COBOL Name:
   * MMI-BEN-MAX-SPNE-MNIP-PRI-CNT - pol5SpineManipSecCd COBOL Name: POL5-SPINE-MANIP-SEC-CD -
   * mmiBenMaxSpneMnipSecCd COBOL Name: MMI-BEN-MAX-SPNE-MNIP-SEC-CD - pol5SpineManipSecCnt COBOL
   * Name: POL5-SPINE-MANIP-SEC-CNT - mmiBenMaxSpneMnipSecCnt COBOL Name:
   * MMI-BEN-MAX-SPNE-MNIP-SEC-CNT - pol5PhysMedcnPrdCd COBOL Name: POL5-PHYS-MEDCN-PRD-CD -
   * mmiPhysMedcnPrdCd COBOL Name: MMI-PHYS-MEDCN-PRD-CD - pol5SrvcCdNSetInd COBOL Name:
   * POL5-SRVC-CD-N-SET-IND - mmiSrvcCdNSetInd COBOL Name: MMI-SRVC-CD-N-SET-IND - pol5SrvcCdPSetInd
   * COBOL Name: POL5-SRVC-CD-P-SET-IND - mmiSrvcCdPSetInd COBOL Name: MMI-SRVC-CD-P-SET-IND -
   * pol5SrvcCdTSetInd COBOL Name: POL5-SRVC-CD-T-SET-IND - mmiSrvcCdTSetInd COBOL Name:
   * MMI-SRVC-CD-T-SET-IND - pol5McrInd COBOL Name: POL5-MCR-IND - mmiMcrCd COBOL Name: MMI-MCR-CD -
   * pol5BenMaxAuralCiPriCd COBOL Name: POL5-BEN-MAX-AURAL-CI-PRI-CD - mmiBenMaxAuralCiPriCd COBOL
   * Name: MMI-BEN-MAX-AURAL-CI-PRI-CD - pol5BenMaxAuralCiPriCnt COBOL Name:
   * POL5-BEN-MAX-AURAL-CI-PRI-CNT - mmiBenMaxAuralCiPriCnt COBOL Name: MMI-BEN-MAX-AURAL-CI-PRI-CNT
   * - pol5BenMaxAuralCiSecCd COBOL Name: POL5-BEN-MAX-AURAL-CI-SEC-CD - mmiBenMaxAuralCiSecCd COBOL
   * Name: MMI-BEN-MAX-AURAL-CI-SEC-CD - pol5BenMaxAuralCiSecCnt COBOL Name:
   * POL5-BEN-MAX-AURAL-CI-SEC-CNT - mmiBenMaxAuralCiSecCnt COBOL Name: MMI-BEN-MAX-AURAL-CI-SEC-CNT
   * - pol5BenMaxCogTrpyPriCd COBOL Name: POL5-BEN-MAX-COG-TRPY-PRI-CD - mmiBenMaxCogTrpyPriCd COBOL
   * Name: MMI-BEN-MAX-COG-TRPY-PRI-CD - pol5BenMaxCogTrpyPriCnt COBOL Name:
   * POL5-BEN-MAX-COG-TRPY-PRI-CNT - mmiBenMaxCogTrpyPriCnt COBOL Name: MMI-BEN-MAX-COG-TRPY-PRI-CNT
   * - pol5BenMaxCogTrpySecCd COBOL Name: POL5-BEN-MAX-COG-TRPY-SEC-CD - mmiBenMaxCogTrpySecCd COBOL
   * Name: MMI-BEN-MAX-COG-TRPY-SEC-CD - pol5BenMaxCogTrpySecCnt COBOL Name:
   * POL5-BEN-MAX-COG-TRPY-SEC-CNT - mmiBenMaxCogTrpySecCnt COBOL Name: MMI-BEN-MAX-COG-TRPY-SEC-CNT
   * - pol5BenMaxCogTrpyExclCd COBOL Name: POL5-BEN-MAX-COG-TRPY-EXCL-CD - mmiBenMaxCogTrpyExclCd
   * COBOL Name: MMI-BEN-MAX-COG-TRPY-EXCL-CD - pol5BenMaxEhbSpneRhabCnt COBOL Name:
   * POL5-BEN-MAX-EHB-SPNE-RHAB-CNT - mmiBenMaxEhbSpneRhabCnt COBOL Name:
   * MMI-BEN-MAX-EHB-SPNE-RHAB-CNT - pol5BenMaxEhbSpneHabCnt COBOL Name:
   * POL5-BEN-MAX-EHB-SPNE-HAB-CNT - mmiBenMaxEhbSpneHabCnt COBOL Name: MMI-BEN-MAX-EHB-SPNE-HAB-CNT
   * - pol5BenMaxEhbPtRhabCnt COBOL Name: POL5-BEN-MAX-EHB-PT-RHAB-CNT - mmiBenMaxEhbPtRhabCnt COBOL
   * Name: MMI-BEN-MAX-EHB-PT-RHAB-CNT - pol5BenMaxEhbPtHabCnt COBOL Name:
   * POL5-BEN-MAX-EHB-PT-HAB-CNT - mmiBenMaxEhbPtHabCnt COBOL Name: MMI-BEN-MAX-EHB-PT-HAB-CNT -
   * pol5BenMaxEhbSpchRhabCnt COBOL Name: POL5-BEN-MAX-EHB-SPCH-RHAB-CNT - mmiBenMaxEhbSpchRhabCnt
   * COBOL Name: MMI-BEN-MAX-EHB-SPCH-RHAB-CNT
   *
   * @throws CFException
   */
  @Override
  public PopulateCd5PolhdrTherSplit5OutCtx populateCd5PolhdrTherSplit5(
      PopulateCd5PolhdrTherSplit5InCtx methodIn) throws Exception {
    // Added variable to get the program context in place.
    D5427polCtx programCtx = methodIn.getD5427polCtx();
    // Added variable to get the output context in place.
    PopulateCd5PolhdrTherSplit5OutCtx methodOut = methodIn.getPopulateCd5PolhdrTherSplit5OutCtx();
    //  cobolCode::MOVE MMI-BEN-MAX-COMB-PRI-CD TO POL5-BEN-MAX-COMB-PRI-CD
    methodOut.setPol5BenMaxCombPriCd(methodOut.getMmiBenMaxCombPriCd());
    //  cobolCode::MOVE MMI-BEN-MAX-COMB-PRI-CNT TO POL5-BEN-MAX-COMB-PRI-CNT
    methodOut.setPol5BenMaxCombPriCnt(methodOut.getMmiBenMaxCombPriCnt());
    //  cobolCode::MOVE MMI-BEN-MAX-COMB-SEC-CD TO POL5-BEN-MAX-COMB-SEC-CD
    methodOut.setPol5BenMaxCombSecCd(methodOut.getMmiBenMaxCombSecCd());
    //  cobolCode::MOVE MMI-BEN-MAX-COMB-SEC-CNT TO POL5-BEN-MAX-COMB-SEC-CNT
    methodOut.setPol5BenMaxCombSecCnt(methodOut.getMmiBenMaxCombSecCnt());
    //  cobolCode::MOVE MMI-BEN-MAX-CRDC-REHAB-PRI-CD TO POL5-CRDC-REHAB-PRI-CD
    methodOut.setPol5CrdcRehabPriCd(methodOut.getMmiBenMaxCrdcRehabPriCd());
    //  cobolCode::MOVE MMI-BEN-MAX-CRDC-REHAB-PRI-CNT TO POL5-CRDC-REHAB-PRI-CNT
    methodOut.setPol5CrdcRehabPriCnt(methodOut.getMmiBenMaxCrdcRehabPriCnt());
    //  cobolCode::MOVE MMI-BEN-MAX-CRDC-REHAB-SEC-CD TO POL5-CRDC-REHAB-SEC-CD
    methodOut.setPol5CrdcRehabSecCd(methodOut.getMmiBenMaxCrdcRehabSecCd());
    //  cobolCode::MOVE MMI-BEN-MAX-CRDC-REHAB-SEC-CNT TO POL5-CRDC-REHAB-SEC-CNT
    methodOut.setPol5CrdcRehabSecCnt(methodOut.getMmiBenMaxCrdcRehabSecCnt());
    //  cobolCode::MOVE MMI-BEN-MAX-OCP-TRPY-PRI-CD TO POL5-OCP-TRPY-PRI-CD
    methodOut.setPol5OcpTrpyPriCd(methodOut.getMmiBenMaxOcpTrpyPriCd());
    //  cobolCode::MOVE MMI-BEN-MAX-OCP-TRPY-PRI-CNT TO POL5-OCP-TRPY-PRI-CNT
    methodOut.setPol5OcpTrpyPriCnt(methodOut.getMmiBenMaxOcpTrpyPriCnt());
    //  cobolCode::MOVE MMI-BEN-MAX-OCP-TRPY-SEC-CD TO POL5-OCP-TRPY-SEC-CD
    methodOut.setPol5OcpTrpySecCd(methodOut.getMmiBenMaxOcpTrpySecCd());
    //  cobolCode::MOVE MMI-BEN-MAX-OCP-TRPY-SEC-CNT TO POL5-OCP-TRPY-SEC-CNT
    methodOut.setPol5OcpTrpySecCnt(methodOut.getMmiBenMaxOcpTrpySecCnt());
    //  cobolCode::MOVE MMI-BEN-MAX-PH-OC-SPCH-PRI-CD TO POL5-PHY-OCP-SPCH-PRI-CD
    methodOut.setPol5PhyOcpSpchPriCd(methodOut.getMmiBenMaxPhOcSpchPriCd());
    //  cobolCode::MOVE MMI-BEN-MAX-PH-OC-SPCH-PRI-CNT TO POL5-PHY-OCP-SPCH-PRI-CNT
    methodOut.setPol5PhyOcpSpchPriCnt(methodOut.getMmiBenMaxPhOcSpchPriCnt());
    //  cobolCode::MOVE MMI-BEN-MAX-PH-OC-SPCH-SEC-CD TO POL5-PHY-OCP-SPCH-SEC-CD
    methodOut.setPol5PhyOcpSpchSecCd(methodOut.getMmiBenMaxPhOcSpchSecCd());
    //  cobolCode::MOVE MMI-BEN-MAX-PH-OC-SPCH-SEC-CNT TO POL5-PHY-OCP-SPCH-SEC-CNT
    methodOut.setPol5PhyOcpSpchSecCnt(methodOut.getMmiBenMaxPhOcSpchSecCnt());
    //  cobolCode::MOVE MMI-BEN-MAX-PH-OC-TRPY-PRI-CD TO POL5-PHY-OCP-TRPY-PRI-CD
    methodOut.setPol5PhyOcpTrpyPriCd(methodOut.getMmiBenMaxPhOcTrpyPriCd());
    //  cobolCode::MOVE MMI-BEN-MAX-PH-OC-TRPY-PRI-CNT TO POL5-PHY-OCP-TRPY-PRI-CNT
    methodOut.setPol5PhyOcpTrpyPriCnt(methodOut.getMmiBenMaxPhOcTrpyPriCnt());
    //  cobolCode::MOVE MMI-BEN-MAX-PH-OC-TRPY-SEC-CD TO POL5-PHY-OCP-TRPY-SEC-CD
    methodOut.setPol5PhyOcpTrpySecCd(methodOut.getMmiBenMaxPhOcTrpySecCd());
    //  cobolCode::MOVE MMI-BEN-MAX-PH-OC-TRPY-SEC-CNT TO POL5-PHY-OCP-TRPY-SEC-CNT
    methodOut.setPol5PhyOcpTrpySecCnt(methodOut.getMmiBenMaxPhOcTrpySecCnt());
    //  cobolCode::MOVE MMI-BEN-MAX-PHYS-TRPY-PRI-CD TO POL5-PHYS-TRPY-PRI-CD
    methodOut.setPol5PhysTrpyPriCd(methodOut.getMmiBenMaxPhysTrpyPriCd());
    //  cobolCode::MOVE MMI-BEN-MAX-PHYS-TRPY-PRI-CNT TO POL5-PHYS-TRPY-PRI-CNT
    methodOut.setPol5PhysTrpyPriCnt(methodOut.getMmiBenMaxPhysTrpyPriCnt());
    //  cobolCode::MOVE MMI-BEN-MAX-PHYS-TRPY-SEC-CD TO POL5-PHYS-TRPY-SEC-CD
    methodOut.setPol5PhysTrpySecCd(methodOut.getMmiBenMaxPhysTrpySecCd());
    //  cobolCode::MOVE MMI-BEN-MAX-PHYS-TRPY-SEC-CNT TO POL5-PHYS-TRPY-SEC-CNT
    methodOut.setPol5PhysTrpySecCnt(methodOut.getMmiBenMaxPhysTrpySecCnt());
    //  cobolCode::MOVE MMI-BEN-MAX-SPCH-TRPY-PRI-CD TO POL5-SPCH-TRPY-PRI-CD
    methodOut.setPol5SpchTrpyPriCd(methodOut.getMmiBenMaxSpchTrpyPriCd());
    //  cobolCode::MOVE MMI-BEN-MAX-SPCH-TRPY-PRI-CNT TO POL5-SPCH-TRPY-PRI-CNT
    methodOut.setPol5SpchTrpyPriCnt(methodOut.getMmiBenMaxSpchTrpyPriCnt());
    //  cobolCode::MOVE MMI-BEN-MAX-SPCH-TRPY-SEC-CD TO POL5-SPCH-TRPY-SEC-CD
    methodOut.setPol5SpchTrpySecCd(methodOut.getMmiBenMaxSpchTrpySecCd());
    //  cobolCode::MOVE MMI-BEN-MAX-SPCH-TRPY-SEC-CNT TO POL5-SPCH-TRPY-SEC-CNT
    methodOut.setPol5SpchTrpySecCnt(methodOut.getMmiBenMaxSpchTrpySecCnt());
    //  cobolCode::MOVE MMI-BEN-MAX-SPNE-MNIP-PRI-CD TO POL5-SPINE-MANIP-PRI-CD
    methodOut.setPol5SpineManipPriCd(methodOut.getMmiBenMaxSpneMnipPriCd());
    //  cobolCode::MOVE MMI-BEN-MAX-SPNE-MNIP-PRI-CNT TO POL5-SPINE-MANIP-PRI-CNT
    methodOut.setPol5SpineManipPriCnt(methodOut.getMmiBenMaxSpneMnipPriCnt());
    //  cobolCode::MOVE MMI-BEN-MAX-SPNE-MNIP-SEC-CD TO POL5-SPINE-MANIP-SEC-CD
    methodOut.setPol5SpineManipSecCd(methodOut.getMmiBenMaxSpneMnipSecCd());
    //  cobolCode::MOVE MMI-BEN-MAX-SPNE-MNIP-SEC-CNT TO POL5-SPINE-MANIP-SEC-CNT
    methodOut.setPol5SpineManipSecCnt(methodOut.getMmiBenMaxSpneMnipSecCnt());
    //  cobolCode::MOVE MMI-PHYS-MEDCN-PRD-CD TO POL5-PHYS-MEDCN-PRD-CD
    methodOut.setPol5PhysMedcnPrdCd(methodOut.getMmiPhysMedcnPrdCd());
    //  cobolCode::MOVE MMI-SRVC-CD-N-SET-IND TO POL5-SRVC-CD-N-SET-IND
    methodOut.setPol5SrvcCdNSetInd(methodOut.getMmiSrvcCdNSetInd());
    //  cobolCode::MOVE MMI-SRVC-CD-P-SET-IND TO POL5-SRVC-CD-P-SET-IND
    methodOut.setPol5SrvcCdPSetInd(methodOut.getMmiSrvcCdPSetInd());
    //  cobolCode::MOVE MMI-SRVC-CD-T-SET-IND TO POL5-SRVC-CD-T-SET-IND
    methodOut.setPol5SrvcCdTSetInd(methodOut.getMmiSrvcCdTSetInd());
    //  cobolCode::MOVE MMI-MCR-CD TO POL5-MCR-IND
    methodOut.setPol5McrInd(methodOut.getMmiMcrCd());
    //  cobolCode::MOVE MMI-BEN-MAX-AURAL-CI-PRI-CD TO POL5-BEN-MAX-AURAL-CI-PRI-CD
    methodOut.setPol5BenMaxAuralCiPriCd(methodOut.getMmiBenMaxAuralCiPriCd());
    //  cobolCode::MOVE MMI-BEN-MAX-AURAL-CI-PRI-CNT TO POL5-BEN-MAX-AURAL-CI-PRI-CNT
    methodOut.setPol5BenMaxAuralCiPriCnt(methodOut.getMmiBenMaxAuralCiPriCnt());
    //  cobolCode::MOVE MMI-BEN-MAX-AURAL-CI-SEC-CD TO POL5-BEN-MAX-AURAL-CI-SEC-CD
    methodOut.setPol5BenMaxAuralCiSecCd(methodOut.getMmiBenMaxAuralCiSecCd());
    //  cobolCode::MOVE MMI-BEN-MAX-AURAL-CI-SEC-CNT TO POL5-BEN-MAX-AURAL-CI-SEC-CNT
    methodOut.setPol5BenMaxAuralCiSecCnt(methodOut.getMmiBenMaxAuralCiSecCnt());
    //  cobolCode::MOVE MMI-BEN-MAX-COG-TRPY-PRI-CD TO POL5-BEN-MAX-COG-TRPY-PRI-CD
    methodOut.setPol5BenMaxCogTrpyPriCd(methodOut.getMmiBenMaxCogTrpyPriCd());
    //  cobolCode::MOVE MMI-BEN-MAX-COG-TRPY-PRI-CNT TO POL5-BEN-MAX-COG-TRPY-PRI-CNT
    methodOut.setPol5BenMaxCogTrpyPriCnt(methodOut.getMmiBenMaxCogTrpyPriCnt());
    //  cobolCode::MOVE MMI-BEN-MAX-COG-TRPY-SEC-CD TO POL5-BEN-MAX-COG-TRPY-SEC-CD
    methodOut.setPol5BenMaxCogTrpySecCd(methodOut.getMmiBenMaxCogTrpySecCd());
    //  cobolCode::MOVE MMI-BEN-MAX-COG-TRPY-SEC-CNT TO POL5-BEN-MAX-COG-TRPY-SEC-CNT
    methodOut.setPol5BenMaxCogTrpySecCnt(methodOut.getMmiBenMaxCogTrpySecCnt());
    //  cobolCode::MOVE MMI-BEN-MAX-COG-TRPY-EXCL-CD TO POL5-BEN-MAX-COG-TRPY-EXCL-CD
    methodOut.setPol5BenMaxCogTrpyExclCd(methodOut.getMmiBenMaxCogTrpyExclCd());
    //  cobolCode::MOVE MMI-BEN-MAX-EHB-SPNE-RHAB-CNT TO POL5-BEN-MAX-EHB-SPNE-RHAB-CNT
    methodOut.setPol5BenMaxEhbSpneRhabCnt(methodOut.getMmiBenMaxEhbSpneRhabCnt());
    //  cobolCode::MOVE MMI-BEN-MAX-EHB-SPNE-HAB-CNT TO POL5-BEN-MAX-EHB-SPNE-HAB-CNT
    methodOut.setPol5BenMaxEhbSpneHabCnt(methodOut.getMmiBenMaxEhbSpneHabCnt());
    //  cobolCode::MOVE MMI-BEN-MAX-EHB-PT-RHAB-CNT TO POL5-BEN-MAX-EHB-PT-RHAB-CNT
    methodOut.setPol5BenMaxEhbPtRhabCnt(methodOut.getMmiBenMaxEhbPtRhabCnt());
    //  cobolCode::MOVE MMI-BEN-MAX-EHB-PT-HAB-CNT TO POL5-BEN-MAX-EHB-PT-HAB-CNT
    methodOut.setPol5BenMaxEhbPtHabCnt(methodOut.getMmiBenMaxEhbPtHabCnt());
    //  cobolCode::MOVE MMI-BEN-MAX-EHB-SPCH-RHAB-CNT TO POL5-BEN-MAX-EHB-SPCH-RHAB-CNT
    methodOut.setPol5BenMaxEhbSpchRhabCnt(methodOut.getMmiBenMaxEhbSpchRhabCnt());

    return methodOut;
  }
  /**
   * populateCd5PolhdrTherSplit6 This method is derived from COBOL Paragraph -
   * 6100-POPULATE-CD5-POLHDR-THER-SPLIT6 COBOL Cyclomatic complexity - 1 Input :
   *
   * <p>- mmiBenMaxEhbSpchHabCnt COBOL Name: MMI-BEN-MAX-EHB-SPCH-HAB-CNT - mmiBenMaxEhbCrdcRhabCnt
   * COBOL Name: MMI-BEN-MAX-EHB-CRDC-RHAB-CNT - mmiBenMaxEhbOtRhabCnt COBOL Name:
   * MMI-BEN-MAX-EHB-OT-RHAB-CNT - mmiBenMaxEhbOtHabCnt COBOL Name: MMI-BEN-MAX-EHB-OT-HAB-CNT -
   * mmiBenMaxEhbPlmryRhabCnt COBOL Name: MMI-BEN-MAX-EHB-PLMRY-RHAB-CNT - mmiBenMaxEhbAuralRhabCnt
   * COBOL Name: MMI-BEN-MAX-EHB-AURAL-RHAB-CNT - mmiBenMaxEhbAuralHabCnt COBOL Name:
   * MMI-BEN-MAX-EHB-AURAL-HAB-CNT - mmiBenMaxEhbCogRhabCnt COBOL Name: MMI-BEN-MAX-EHB-COG-RHAB-CNT
   * - mmiBenMaxEhbCogHabCnt COBOL Name: MMI-BEN-MAX-EHB-COG-HAB-CNT - mmiBenMaxEhbPostRhabCnt COBOL
   * Name: MMI-BEN-MAX-EHB-POST-RHAB-CNT - mmiBenMaxEhbPostHabCnt COBOL Name:
   * MMI-BEN-MAX-EHB-POST-HAB-CNT - mmiBenMaxEhbPtotRhabCnt COBOL Name:
   * MMI-BEN-MAX-EHB-PTOT-RHAB-CNT - mmiBenMaxEhbPtotHabCnt COBOL Name: MMI-BEN-MAX-EHB-PTOT-HAB-CNT
   * - mmiBenMaxEhbRhabRmrkCd COBOL Name: MMI-BEN-MAX-EHB-RHAB-RMRK-CD - mmiBenMaxEhbPosmRhabCnt
   * COBOL Name: MMI-BEN-MAX-EHB-POSM-RHAB-CNT - mmiBenMaxEhbPosmHabCnt COBOL Name:
   * MMI-BEN-MAX-EHB-POSM-HAB-CNT - mmiBenMaxEhbHabRmrkCd COBOL Name: MMI-BEN-MAX-EHB-HAB-RMRK-CD -
   * mmiBenPhysMedcnPrdCd COBOL Name: MMI-BEN-PHYS-MEDCN-PRD-CD - mmaRhabCombPtLmtCd COBOL Name:
   * MMA-RHAB-COMB-PT-LMT-CD - mmaRhabCombOtLmtCd COBOL Name: MMA-RHAB-COMB-OT-LMT-CD -
   * mmaRhabCombStLmtCd COBOL Name: MMA-RHAB-COMB-ST-LMT-CD - mmaRhabCombSmLmtCd COBOL Name:
   * MMA-RHAB-COMB-SM-LMT-CD - mmaRhabCombCiLmtCd COBOL Name: MMA-RHAB-COMB-CI-LMT-CD -
   * mmaRhabCombCtLmtCd COBOL Name: MMA-RHAB-COMB-CT-LMT-CD - mmaRhabCombCrLmtCd COBOL Name:
   * MMA-RHAB-COMB-CR-LMT-CD - mmaRhabCombPrLmtCd COBOL Name: MMA-RHAB-COMB-PR-LMT-CD -
   * mmaRhabCombMtLmtCd COBOL Name: MMA-RHAB-COMB-MT-LMT-CD - mmaHabCombPtLmtCd COBOL Name:
   * MMA-HAB-COMB-PT-LMT-CD - mmaHabCombOtLmtCd COBOL Name: MMA-HAB-COMB-OT-LMT-CD -
   * mmaHabCombStLmtCd COBOL Name: MMA-HAB-COMB-ST-LMT-CD - mmaHabCombSmLmtCd COBOL Name:
   * MMA-HAB-COMB-SM-LMT-CD - mmaHabCombCiLmtCd COBOL Name: MMA-HAB-COMB-CI-LMT-CD -
   * mmaHabCombCtLmtCd COBOL Name: MMA-HAB-COMB-CT-LMT-CD - mmaHabCombMtLmtCd COBOL Name:
   * MMA-HAB-COMB-MT-LMT-CD
   *
   * <p>Output :
   *
   * <p>- pol5BenMaxEhbSpchHabCnt COBOL Name: POL5-BEN-MAX-EHB-SPCH-HAB-CNT - mmiBenMaxEhbSpchHabCnt
   * COBOL Name: MMI-BEN-MAX-EHB-SPCH-HAB-CNT - pol5BenMaxEhbCrdcRhabCnt COBOL Name:
   * POL5-BEN-MAX-EHB-CRDC-RHAB-CNT - mmiBenMaxEhbCrdcRhabCnt COBOL Name:
   * MMI-BEN-MAX-EHB-CRDC-RHAB-CNT - pol5BenMaxEhbOtRhabCnt COBOL Name: POL5-BEN-MAX-EHB-OT-RHAB-CNT
   * - mmiBenMaxEhbOtRhabCnt COBOL Name: MMI-BEN-MAX-EHB-OT-RHAB-CNT - pol5BenMaxEhbOtHabCnt COBOL
   * Name: POL5-BEN-MAX-EHB-OT-HAB-CNT - mmiBenMaxEhbOtHabCnt COBOL Name: MMI-BEN-MAX-EHB-OT-HAB-CNT
   * - pol5BenMaxEhbPlmryRhabCn COBOL Name: POL5-BEN-MAX-EHB-PLMRY-RHAB-CN -
   * mmiBenMaxEhbPlmryRhabCnt COBOL Name: MMI-BEN-MAX-EHB-PLMRY-RHAB-CNT - pol5BenMaxEhbAuralRhabCn
   * COBOL Name: POL5-BEN-MAX-EHB-AURAL-RHAB-CN - mmiBenMaxEhbAuralRhabCnt COBOL Name:
   * MMI-BEN-MAX-EHB-AURAL-RHAB-CNT - pol5BenMaxEhbAuralHabCnt COBOL Name:
   * POL5-BEN-MAX-EHB-AURAL-HAB-CNT - mmiBenMaxEhbAuralHabCnt COBOL Name:
   * MMI-BEN-MAX-EHB-AURAL-HAB-CNT - pol5BenMaxEhbCogRhabCnt COBOL Name:
   * POL5-BEN-MAX-EHB-COG-RHAB-CNT - mmiBenMaxEhbCogRhabCnt COBOL Name: MMI-BEN-MAX-EHB-COG-RHAB-CNT
   * - pol5BenMaxEhbCogHabCnt COBOL Name: POL5-BEN-MAX-EHB-COG-HAB-CNT - mmiBenMaxEhbCogHabCnt COBOL
   * Name: MMI-BEN-MAX-EHB-COG-HAB-CNT - pol5BenMaxEhbPostRhabCnt COBOL Name:
   * POL5-BEN-MAX-EHB-POST-RHAB-CNT - mmiBenMaxEhbPostRhabCnt COBOL Name:
   * MMI-BEN-MAX-EHB-POST-RHAB-CNT - pol5BenMaxEhbPostHabCnt COBOL Name:
   * POL5-BEN-MAX-EHB-POST-HAB-CNT - mmiBenMaxEhbPostHabCnt COBOL Name: MMI-BEN-MAX-EHB-POST-HAB-CNT
   * - pol5BenMaxEhbPtotRhabCnt COBOL Name: POL5-BEN-MAX-EHB-PTOT-RHAB-CNT - mmiBenMaxEhbPtotRhabCnt
   * COBOL Name: MMI-BEN-MAX-EHB-PTOT-RHAB-CNT - pol5BenMaxEhbPtotHabCnt COBOL Name:
   * POL5-BEN-MAX-EHB-PTOT-HAB-CNT - mmiBenMaxEhbPtotHabCnt COBOL Name: MMI-BEN-MAX-EHB-PTOT-HAB-CNT
   * - pol5BenMaxEhbRhabRmrkCd COBOL Name: POL5-BEN-MAX-EHB-RHAB-RMRK-CD - mmiBenMaxEhbRhabRmrkCd
   * COBOL Name: MMI-BEN-MAX-EHB-RHAB-RMRK-CD - pol5BenMaxEhbPosmRhabCnt COBOL Name:
   * POL5-BEN-MAX-EHB-POSM-RHAB-CNT - mmiBenMaxEhbPosmRhabCnt COBOL Name:
   * MMI-BEN-MAX-EHB-POSM-RHAB-CNT - pol5BenMaxEhbPosmHabCnt COBOL Name:
   * POL5-BEN-MAX-EHB-POSM-HAB-CNT - mmiBenMaxEhbPosmHabCnt COBOL Name: MMI-BEN-MAX-EHB-POSM-HAB-CNT
   * - pol5BenMaxEhbHabRmrkCd COBOL Name: POL5-BEN-MAX-EHB-HAB-RMRK-CD - mmiBenMaxEhbHabRmrkCd COBOL
   * Name: MMI-BEN-MAX-EHB-HAB-RMRK-CD - pol5BenPhysMedcnPrdCd COBOL Name:
   * POL5-BEN-PHYS-MEDCN-PRD-CD - mmiBenPhysMedcnPrdCd COBOL Name: MMI-BEN-PHYS-MEDCN-PRD-CD -
   * pol5RetRhabCombPtLmtCd COBOL Name: POL5-RET-RHAB-COMB-PT-LMT-CD - mmaRhabCombPtLmtCd COBOL
   * Name: MMA-RHAB-COMB-PT-LMT-CD - pol5RetRhabCombOtLmtCd COBOL Name: POL5-RET-RHAB-COMB-OT-LMT-CD
   * - mmaRhabCombOtLmtCd COBOL Name: MMA-RHAB-COMB-OT-LMT-CD - pol5RetRhabCombStLmtCd COBOL Name:
   * POL5-RET-RHAB-COMB-ST-LMT-CD - mmaRhabCombStLmtCd COBOL Name: MMA-RHAB-COMB-ST-LMT-CD -
   * pol5RetRhabCombSmLmtCd COBOL Name: POL5-RET-RHAB-COMB-SM-LMT-CD - mmaRhabCombSmLmtCd COBOL
   * Name: MMA-RHAB-COMB-SM-LMT-CD - pol5RetRhabCombCiLmtCd COBOL Name: POL5-RET-RHAB-COMB-CI-LMT-CD
   * - mmaRhabCombCiLmtCd COBOL Name: MMA-RHAB-COMB-CI-LMT-CD - pol5RetRhabCombCtLmtCd COBOL Name:
   * POL5-RET-RHAB-COMB-CT-LMT-CD - mmaRhabCombCtLmtCd COBOL Name: MMA-RHAB-COMB-CT-LMT-CD -
   * pol5RetRhabCombCrLmtCd COBOL Name: POL5-RET-RHAB-COMB-CR-LMT-CD - mmaRhabCombCrLmtCd COBOL
   * Name: MMA-RHAB-COMB-CR-LMT-CD - pol5RetRhabCombPrLmtCd COBOL Name: POL5-RET-RHAB-COMB-PR-LMT-CD
   * - mmaRhabCombPrLmtCd COBOL Name: MMA-RHAB-COMB-PR-LMT-CD - pol5RetRhabCombMtLmtCd COBOL Name:
   * POL5-RET-RHAB-COMB-MT-LMT-CD - mmaRhabCombMtLmtCd COBOL Name: MMA-RHAB-COMB-MT-LMT-CD -
   * pol5RetHabCombPtLmtCd COBOL Name: POL5-RET-HAB-COMB-PT-LMT-CD - mmaHabCombPtLmtCd COBOL Name:
   * MMA-HAB-COMB-PT-LMT-CD - pol5RetHabCombOtLmtCd COBOL Name: POL5-RET-HAB-COMB-OT-LMT-CD -
   * mmaHabCombOtLmtCd COBOL Name: MMA-HAB-COMB-OT-LMT-CD - pol5RetHabCombStLmtCd COBOL Name:
   * POL5-RET-HAB-COMB-ST-LMT-CD - mmaHabCombStLmtCd COBOL Name: MMA-HAB-COMB-ST-LMT-CD -
   * pol5RetHabCombSmLmtCd COBOL Name: POL5-RET-HAB-COMB-SM-LMT-CD - mmaHabCombSmLmtCd COBOL Name:
   * MMA-HAB-COMB-SM-LMT-CD - pol5RetHabCombCiLmtCd COBOL Name: POL5-RET-HAB-COMB-CI-LMT-CD -
   * mmaHabCombCiLmtCd COBOL Name: MMA-HAB-COMB-CI-LMT-CD - pol5RetHabCombCtLmtCd COBOL Name:
   * POL5-RET-HAB-COMB-CT-LMT-CD - mmaHabCombCtLmtCd COBOL Name: MMA-HAB-COMB-CT-LMT-CD -
   * pol5RetHabCombMtLmtCd COBOL Name: POL5-RET-HAB-COMB-MT-LMT-CD - mmaHabCombMtLmtCd COBOL Name:
   * MMA-HAB-COMB-MT-LMT-CD
   *
   * @throws CFException
   */
  @Override
  public PopulateCd5PolhdrTherSplit6OutCtx populateCd5PolhdrTherSplit6(
      PopulateCd5PolhdrTherSplit6InCtx methodIn) throws Exception {
    // Added variable to get the program context in place.
    D5427polCtx programCtx = methodIn.getD5427polCtx();
    // Added variable to get the output context in place.
    PopulateCd5PolhdrTherSplit6OutCtx methodOut = methodIn.getPopulateCd5PolhdrTherSplit6OutCtx();
    //  cobolCode::MOVE MMI-BEN-MAX-EHB-SPCH-HAB-CNT TO POL5-BEN-MAX-EHB-SPCH-HAB-CNT
    methodOut.setPol5BenMaxEhbSpchHabCnt(methodOut.getMmiBenMaxEhbSpchHabCnt());
    //  cobolCode::MOVE MMI-BEN-MAX-EHB-CRDC-RHAB-CNT TO POL5-BEN-MAX-EHB-CRDC-RHAB-CNT
    methodOut.setPol5BenMaxEhbCrdcRhabCnt(methodOut.getMmiBenMaxEhbCrdcRhabCnt());
    //  cobolCode::MOVE MMI-BEN-MAX-EHB-OT-RHAB-CNT TO POL5-BEN-MAX-EHB-OT-RHAB-CNT
    methodOut.setPol5BenMaxEhbOtRhabCnt(methodOut.getMmiBenMaxEhbOtRhabCnt());
    //  cobolCode::MOVE MMI-BEN-MAX-EHB-OT-HAB-CNT TO POL5-BEN-MAX-EHB-OT-HAB-CNT
    methodOut.setPol5BenMaxEhbOtHabCnt(methodOut.getMmiBenMaxEhbOtHabCnt());
    //  cobolCode::MOVE MMI-BEN-MAX-EHB-PLMRY-RHAB-CNT TO POL5-BEN-MAX-EHB-PLMRY-RHAB-CN
    methodOut.setPol5BenMaxEhbPlmryRhabCn(methodOut.getMmiBenMaxEhbPlmryRhabCnt());
    //  cobolCode::MOVE MMI-BEN-MAX-EHB-AURAL-RHAB-CNT TO POL5-BEN-MAX-EHB-AURAL-RHAB-CN
    methodOut.setPol5BenMaxEhbAuralRhabCn(methodOut.getMmiBenMaxEhbAuralRhabCnt());
    //  cobolCode::MOVE MMI-BEN-MAX-EHB-AURAL-HAB-CNT TO POL5-BEN-MAX-EHB-AURAL-HAB-CNT
    methodOut.setPol5BenMaxEhbAuralHabCnt(methodOut.getMmiBenMaxEhbAuralHabCnt());
    //  cobolCode::MOVE MMI-BEN-MAX-EHB-COG-RHAB-CNT TO POL5-BEN-MAX-EHB-COG-RHAB-CNT
    methodOut.setPol5BenMaxEhbCogRhabCnt(methodOut.getMmiBenMaxEhbCogRhabCnt());
    //  cobolCode::MOVE MMI-BEN-MAX-EHB-COG-HAB-CNT TO POL5-BEN-MAX-EHB-COG-HAB-CNT
    methodOut.setPol5BenMaxEhbCogHabCnt(methodOut.getMmiBenMaxEhbCogHabCnt());
    //  cobolCode::MOVE MMI-BEN-MAX-EHB-POST-RHAB-CNT TO POL5-BEN-MAX-EHB-POST-RHAB-CNT
    methodOut.setPol5BenMaxEhbPostRhabCnt(methodOut.getMmiBenMaxEhbPostRhabCnt());
    //  cobolCode::MOVE MMI-BEN-MAX-EHB-POST-HAB-CNT TO POL5-BEN-MAX-EHB-POST-HAB-CNT
    methodOut.setPol5BenMaxEhbPostHabCnt(methodOut.getMmiBenMaxEhbPostHabCnt());
    //  cobolCode::MOVE MMI-BEN-MAX-EHB-PTOT-RHAB-CNT TO POL5-BEN-MAX-EHB-PTOT-RHAB-CNT
    methodOut.setPol5BenMaxEhbPtotRhabCnt(methodOut.getMmiBenMaxEhbPtotRhabCnt());
    //  cobolCode::MOVE MMI-BEN-MAX-EHB-PTOT-HAB-CNT TO POL5-BEN-MAX-EHB-PTOT-HAB-CNT
    methodOut.setPol5BenMaxEhbPtotHabCnt(methodOut.getMmiBenMaxEhbPtotHabCnt());
    //  cobolCode::MOVE MMI-BEN-MAX-EHB-RHAB-RMRK-CD TO POL5-BEN-MAX-EHB-RHAB-RMRK-CD
    methodOut.setPol5BenMaxEhbRhabRmrkCd(methodOut.getMmiBenMaxEhbRhabRmrkCd());
    //  cobolCode::MOVE MMI-BEN-MAX-EHB-POSM-RHAB-CNT TO POL5-BEN-MAX-EHB-POSM-RHAB-CNT
    methodOut.setPol5BenMaxEhbPosmRhabCnt(methodOut.getMmiBenMaxEhbPosmRhabCnt());
    //  cobolCode::MOVE MMI-BEN-MAX-EHB-POSM-HAB-CNT TO POL5-BEN-MAX-EHB-POSM-HAB-CNT
    methodOut.setPol5BenMaxEhbPosmHabCnt(methodOut.getMmiBenMaxEhbPosmHabCnt());
    //  cobolCode::MOVE MMI-BEN-MAX-EHB-HAB-RMRK-CD TO POL5-BEN-MAX-EHB-HAB-RMRK-CD
    methodOut.setPol5BenMaxEhbHabRmrkCd(methodOut.getMmiBenMaxEhbHabRmrkCd());
    //  cobolCode::MOVE MMI-BEN-PHYS-MEDCN-PRD-CD TO POL5-BEN-PHYS-MEDCN-PRD-CD
    methodOut.setPol5BenPhysMedcnPrdCd(methodOut.getMmiBenPhysMedcnPrdCd());
    //  cobolCode::MOVE MMA-RHAB-COMB-PT-LMT-CD TO POL5-RET-RHAB-COMB-PT-LMT-CD
    methodOut.setPol5RetRhabCombPtLmtCd(methodOut.getMmaRhabCombPtLmtCd());
    //  cobolCode::MOVE MMA-RHAB-COMB-OT-LMT-CD TO POL5-RET-RHAB-COMB-OT-LMT-CD
    methodOut.setPol5RetRhabCombOtLmtCd(methodOut.getMmaRhabCombOtLmtCd());
    //  cobolCode::MOVE MMA-RHAB-COMB-ST-LMT-CD TO POL5-RET-RHAB-COMB-ST-LMT-CD
    methodOut.setPol5RetRhabCombStLmtCd(methodOut.getMmaRhabCombStLmtCd());
    //  cobolCode::MOVE MMA-RHAB-COMB-SM-LMT-CD TO POL5-RET-RHAB-COMB-SM-LMT-CD
    methodOut.setPol5RetRhabCombSmLmtCd(methodOut.getMmaRhabCombSmLmtCd());
    //  cobolCode::MOVE MMA-RHAB-COMB-CI-LMT-CD TO POL5-RET-RHAB-COMB-CI-LMT-CD
    methodOut.setPol5RetRhabCombCiLmtCd(methodOut.getMmaRhabCombCiLmtCd());
    //  cobolCode::MOVE MMA-RHAB-COMB-CT-LMT-CD TO POL5-RET-RHAB-COMB-CT-LMT-CD
    methodOut.setPol5RetRhabCombCtLmtCd(methodOut.getMmaRhabCombCtLmtCd());
    //  cobolCode::MOVE MMA-RHAB-COMB-CR-LMT-CD TO POL5-RET-RHAB-COMB-CR-LMT-CD
    methodOut.setPol5RetRhabCombCrLmtCd(methodOut.getMmaRhabCombCrLmtCd());
    //  cobolCode::MOVE MMA-RHAB-COMB-PR-LMT-CD TO POL5-RET-RHAB-COMB-PR-LMT-CD
    methodOut.setPol5RetRhabCombPrLmtCd(methodOut.getMmaRhabCombPrLmtCd());
    //  cobolCode::MOVE MMA-RHAB-COMB-MT-LMT-CD TO POL5-RET-RHAB-COMB-MT-LMT-CD
    methodOut.setPol5RetRhabCombMtLmtCd(methodOut.getMmaRhabCombMtLmtCd());
    //  cobolCode::MOVE MMA-HAB-COMB-PT-LMT-CD TO POL5-RET-HAB-COMB-PT-LMT-CD
    methodOut.setPol5RetHabCombPtLmtCd(methodOut.getMmaHabCombPtLmtCd());
    //  cobolCode::MOVE MMA-HAB-COMB-OT-LMT-CD TO POL5-RET-HAB-COMB-OT-LMT-CD
    methodOut.setPol5RetHabCombOtLmtCd(methodOut.getMmaHabCombOtLmtCd());
    //  cobolCode::MOVE MMA-HAB-COMB-ST-LMT-CD TO POL5-RET-HAB-COMB-ST-LMT-CD
    methodOut.setPol5RetHabCombStLmtCd(methodOut.getMmaHabCombStLmtCd());
    //  cobolCode::MOVE MMA-HAB-COMB-SM-LMT-CD TO POL5-RET-HAB-COMB-SM-LMT-CD
    methodOut.setPol5RetHabCombSmLmtCd(methodOut.getMmaHabCombSmLmtCd());
    //  cobolCode::MOVE MMA-HAB-COMB-CI-LMT-CD TO POL5-RET-HAB-COMB-CI-LMT-CD
    methodOut.setPol5RetHabCombCiLmtCd(methodOut.getMmaHabCombCiLmtCd());
    //  cobolCode::MOVE MMA-HAB-COMB-CT-LMT-CD TO POL5-RET-HAB-COMB-CT-LMT-CD
    methodOut.setPol5RetHabCombCtLmtCd(methodOut.getMmaHabCombCtLmtCd());
    //  cobolCode::MOVE MMA-HAB-COMB-MT-LMT-CD TO POL5-RET-HAB-COMB-MT-LMT-CD
    methodOut.setPol5RetHabCombMtLmtCd(methodOut.getMmaHabCombMtLmtCd());

    return methodOut;
  }
  /**
   * funcCd6ReadMxi This method is derived from COBOL Paragraph - 7000-FUNC-CD6-READ-MXI SECTION
   * COBOL Cyclomatic complexity - 6 Input :
   *
   * <p>- polReqMxiPolNbr COBOL Name: POL-REQ-MXI-POL-NBR - polReqMxiPlnNbr COBOL Name:
   * POL-REQ-MXI-PLN-NBR - polReqMxiClssNbr COBOL Name: POL-REQ-MXI-CLSS-NBR - polReqEffDt COBOL
   * Name: POL-REQ-EFF-DT - polReqCancDt COBOL Name: POL-REQ-CANC-DT - polReqCovTypCd COBOL Name:
   * POL-REQ-COV-TYP-CD - sqlcode COBOL Name: SQLCODE - xrfPayLoc1Nbr COBOL Name: XRF-PAY-LOC-1-NBR
   * - xrfStdPlnPolNbr COBOL Name: XRF-STD-PLN-POL-NBR - xrfStdPlnPlnNbr COBOL Name:
   * XRF-STD-PLN-PLN-NBR - xrfMmlCovSetNbr COBOL Name: XRF-MML-COV-SET-NBR - xrfStdPlnClssNbr COBOL
   * Name: XRF-STD-PLN-CLSS-NBR - xrfLmtSrvcCd COBOL Name: XRF-LMT-SRVC-CD
   *
   * <p>Output :
   *
   * <p>- xrfPolNbr COBOL Name: XRF-POL-NBR - polReqMxiPolNbr COBOL Name: POL-REQ-MXI-POL-NBR -
   * xrfPlnNbr COBOL Name: XRF-PLN-NBR - polReqMxiPlnNbr COBOL Name: POL-REQ-MXI-PLN-NBR -
   * xrfClssNbr COBOL Name: XRF-CLSS-NBR - polReqMxiClssNbr COBOL Name: POL-REQ-MXI-CLSS-NBR -
   * xrfEffDt COBOL Name: XRF-EFF-DT - polReqEffDt COBOL Name: POL-REQ-EFF-DT - xrfCancDt COBOL
   * Name: XRF-CANC-DT - polReqCancDt COBOL Name: POL-REQ-CANC-DT - xrfCovTypCd COBOL Name:
   * XRF-COV-TYP-CD - polReqCovTypCd COBOL Name: POL-REQ-COV-TYP-CD - sqlcode_Ws COBOL Name:
   * WS-SQLCODE - dsmSqlcode COBOL Name: DSM-SQLCODE - sqlcode COBOL Name: SQLCODE - dideCovTypCd
   * COBOL Name: DIDE-COV-TYP-CD - dfdeCovTypCd COBOL Name: DFDE-COV-TYP-CD - pol6RetPayLocCd COBOL
   * Name: POL6-RET-PAY-LOC-CD - xrfPayLoc1Nbr COBOL Name: XRF-PAY-LOC-1-NBR - pol6RetStdPolNbr
   * COBOL Name: POL6-RET-STD-POL-NBR - mmiPolNbr COBOL Name: MMI-POL-NBR - didePolNbr COBOL Name:
   * DIDE-POL-NBR - dfdePolNbr COBOL Name: DFDE-POL-NBR - xrfStdPlnPolNbr COBOL Name:
   * XRF-STD-PLN-POL-NBR - pol6RetStdPlnNbr COBOL Name: POL6-RET-STD-PLN-NBR - mmiPlnNbr COBOL Name:
   * MMI-PLN-NBR - didePlnNbr COBOL Name: DIDE-PLN-NBR - dfdePlnNbr COBOL Name: DFDE-PLN-NBR -
   * xrfStdPlnPlnNbr COBOL Name: XRF-STD-PLN-PLN-NBR - pol6MmlCovSetNbr COBOL Name:
   * POL6-MML-COV-SET-NBR - xrfMmlCovSetNbr COBOL Name: XRF-MML-COV-SET-NBR - pol6RetStdClssNbr
   * COBOL Name: POL6-RET-STD-CLSS-NBR - mmiClssNbr COBOL Name: MMI-CLSS-NBR - dideClssNbr COBOL
   * Name: DIDE-CLSS-NBR - dfdeClssNbr COBOL Name: DFDE-CLSS-NBR - xrfStdPlnClssNbr COBOL Name:
   * XRF-STD-PLN-CLSS-NBR - pol6RetXrfLmtSrvcCd COBOL Name: POL6-RET-XRF-LMT-SRVC-CD - xrfLmtSrvcCd
   * COBOL Name: XRF-LMT-SRVC-CD - dsmReturnCode COBOL Name: DSM-RETURN-CODE - dsmErrTblAction COBOL
   * Name: DSM-ERR-TBL-ACTION - dsmErrTblName COBOL Name: DSM-ERR-TBL-NAME - dsmErrSectnName COBOL
   * Name: DSM-ERR-SECTN-NAME - dsmErrPgmName COBOL Name: DSM-ERR-PGM-NAME
   *
   * @throws CFException
   */
  @Override
  public FuncCd6ReadMxiOutCtx funcCd6ReadMxi(FuncCd6ReadMxiInCtx methodIn) throws Exception {

    // *81***************************************************************
    // *81 7000-Func-cd6-read-mxi                                       *
    // *81 business function:read the records from the table            *
    // *81***************************************************************
    // *82***************************************************************
    // *82 7000-func-cd6-read-mxi                                       *
    // *82 1. read the pay location code from the table                 *
    // *82***************************************************************
    // Added variable to get the program context in place.
    D5427polCtx programCtx = methodIn.getD5427polCtx();
    // Added variable to get the output context in place.
    FuncCd6ReadMxiOutCtx methodOut = methodIn.getFuncCd6ReadMxiOutCtx();
    //  cobolCode::MOVE POL-REQ-MXI-POL-NBR TO XRF-POL-NBR
    methodOut.setXrfPolNbr(methodOut.getPolReqMxiPolNbr());
    //  cobolCode::MOVE POL-REQ-MXI-PLN-NBR TO XRF-PLN-NBR
    methodOut.setXrfPlnNbr(String.valueOf(methodOut.getPolReqMxiPlnNbrString()).toCharArray());
    //  cobolCode::MOVE POL-REQ-MXI-CLSS-NBR TO XRF-CLSS-NBR
    methodOut.setXrfClssNbr(String.valueOf(methodOut.getPolReqMxiClssNbrString()).toCharArray());
    //  cobolCode::MOVE POL-REQ-EFF-DT TO XRF-EFF-DT
    methodOut.setXrfEffDt(methodOut.getPolReqEffDt());
    //  cobolCode::MOVE POL-REQ-CANC-DT TO XRF-CANC-DT
    methodOut.setXrfCancDt(methodOut.getPolReqCancDt());
    //  cobolCode::MOVE POL-REQ-COV-TYP-CD TO XRF-COV-TYP-CD
    methodOut.setXrfCovTypCd(methodOut.getPolReqCovTypCd());
    //  cobolCode::SELECT PAY_LOC_1_NBR , STD_PLN_POL_NBR , STD_PLN_PLN_NBR , STD_PLN_CLSS_NBR ,
    // MML_COV_SET_NBR , LMT_SRVC_CD FROM CUST_POL_PLN_XREF WHERE POL_NBR = ? AND COV_TYP_CD = ? AND
    // PLN_NBR = ? AND CLSS_NBR = ? AND ( ( EFF_DT <= ? AND CANC_DT >= ? ) OR ( EFF_DT <= ? AND
    // CANC_DT >= ? ) ) ORDER BY EFF_DT ASC FETCH FIRST 1 ROWS ONLY
    d5427polRepository.selectCustPolPlnXref5(
        programCtx.getSqlca(), methodOut.getDclcustPolPlnXref());
    //  cobolCode::MOVE SQLCODE TO WS-SQLCODE DSM-SQLCODE
    methodOut.setSqlcode_Ws(methodOut.getSqlcode());
    methodOut.setDsmSqlcode(methodOut.getSqlcode());
    //  cobolCode::EVALUATE TRUE
    if (methodOut.isSqlcodeOk()) {
      //  cobolCode::MOVE POL-REQ-COV-TYP-CD TO DIDE-COV-TYP-CD DFDE-COV-TYP-CD
      methodOut.setDideCovTypCd(methodOut.getPolReqCovTypCd());
      methodOut.setDfdeCovTypCd(methodOut.getPolReqCovTypCd());
      //  cobolCode::MOVE XRF-PAY-LOC-1-NBR TO POL6-RET-PAY-LOC-CD
      methodOut.setPol6RetPayLocCd(methodOut.getXrfPayLoc1Nbr());
      //  cobolCode::MOVE XRF-STD-PLN-POL-NBR TO POL6-RET-STD-POL-NBR MMI-POL-NBR DIDE-POL-NBR
      // DFDE-POL-NBR
      methodOut.setPol6RetStdPolNbr(methodOut.getXrfStdPlnPolNbr());
      methodOut.setMmiPolNbr(methodOut.getXrfStdPlnPolNbr());
      methodOut.setDidePolNbr(methodOut.getXrfStdPlnPolNbr());
      methodOut.setDfdePolNbr(methodOut.getXrfStdPlnPolNbr());
      //  cobolCode::MOVE XRF-STD-PLN-PLN-NBR TO POL6-RET-STD-PLN-NBR MMI-PLN-NBR DIDE-PLN-NBR
      // DFDE-PLN-NBR
      methodOut.setPol6RetStdPlnNbr(padLeftZeros(4, methodOut.getXrfStdPlnPlnNbr(), false));
      methodOut.setMmiPlnNbr(methodOut.getXrfStdPlnPlnNbr());
      methodOut.setDidePlnNbr(methodOut.getXrfStdPlnPlnNbr());
      methodOut.setDfdePlnNbr(methodOut.getXrfStdPlnPlnNbr());
      //  cobolCode::MOVE XRF-MML-COV-SET-NBR TO POL6-MML-COV-SET-NBR
      methodOut.setPol6MmlCovSetNbr(methodOut.getXrfMmlCovSetNbr());
      //  cobolCode::MOVE XRF-STD-PLN-CLSS-NBR TO POL6-RET-STD-CLSS-NBR MMI-CLSS-NBR DIDE-CLSS-NBR
      // DFDE-CLSS-NBR
      methodOut.setPol6RetStdClssNbr(padLeftZeros(4, methodOut.getXrfStdPlnClssNbr(), false));
      methodOut.setMmiClssNbr(methodOut.getXrfStdPlnClssNbr());
      methodOut.setDideClssNbr(methodOut.getXrfStdPlnClssNbr());
      methodOut.setDfdeClssNbr(methodOut.getXrfStdPlnClssNbr());
      //  cobolCode::MOVE XRF-LMT-SRVC-CD TO POL6-RET-XRF-LMT-SRVC-CD
      methodOut.setPol6RetXrfLmtSrvcCd(methodOut.getXrfLmtSrvcCd());
      //  cobolCode::IF XRF-PAY-LOC-1-NBR > SPACES
      if ((isGreaterThanSpaces(methodOut.getXrfPayLoc1Nbr()))) {
        //  cobolCode::PERFORM 7100-FUNC-CD6-READ-MMI
        funcCd6ReadMmi(programCtx.getFuncCd6ReadMmiInCtx()); /*7100-FUNC-CD6-READ-MMI SECTION*/
        if (programCtx.isProgramEnded()) {
          return methodOut;
        }
      }
    } else if (methodOut.isSqlcodeNotFound()) {
      //  cobolCode::MOVE POL-REQ-COV-TYP-CD TO DIDE-COV-TYP-CD DFDE-COV-TYP-CD
      methodOut.setDideCovTypCd(methodOut.getPolReqCovTypCd());
      methodOut.setDfdeCovTypCd(methodOut.getPolReqCovTypCd());
      //  cobolCode::MOVE POL-REQ-MXI-POL-NBR TO POL6-RET-STD-POL-NBR MMI-POL-NBR DIDE-POL-NBR
      // DFDE-POL-NBR
      methodOut.setPol6RetStdPolNbr(methodOut.getPolReqMxiPolNbr());
      methodOut.setMmiPolNbr(methodOut.getPolReqMxiPolNbr());
      methodOut.setDidePolNbr(methodOut.getPolReqMxiPolNbr());
      methodOut.setDfdePolNbr(methodOut.getPolReqMxiPolNbr());
      //  cobolCode::MOVE POL-REQ-MXI-PLN-NBR TO POL6-RET-STD-PLN-NBR MMI-PLN-NBR DIDE-PLN-NBR
      // DFDE-PLN-NBR
      methodOut.setPol6RetStdPlnNbr(methodOut.getPolReqMxiPlnNbr());
      methodOut.setMmiPlnNbr(String.valueOf(methodOut.getPolReqMxiPlnNbrString()).toCharArray());
      methodOut.setDidePlnNbr(String.valueOf(methodOut.getPolReqMxiPlnNbrString()).toCharArray());
      methodOut.setDfdePlnNbr(String.valueOf(methodOut.getPolReqMxiPlnNbrString()).toCharArray());
      //  cobolCode::MOVE POL-REQ-MXI-CLSS-NBR TO POL6-RET-STD-CLSS-NBR MMI-CLSS-NBR DIDE-CLSS-NBR
      // DFDE-CLSS-NBR
      methodOut.setPol6RetStdClssNbr(methodOut.getPolReqMxiClssNbr());
      methodOut.setMmiClssNbr(String.valueOf(methodOut.getPolReqMxiClssNbrString()).toCharArray());
      methodOut.setDideClssNbr(String.valueOf(methodOut.getPolReqMxiClssNbrString()).toCharArray());
      methodOut.setDfdeClssNbr(String.valueOf(methodOut.getPolReqMxiClssNbrString()).toCharArray());
      //  cobolCode::PERFORM 7100-FUNC-CD6-READ-MMI
      funcCd6ReadMmi(programCtx.getFuncCd6ReadMmiInCtx()); /*7100-FUNC-CD6-READ-MMI SECTION*/
      if (programCtx.isProgramEnded()) {
        return methodOut;
      }
    } else {
      //  cobolCode::SET DSM-DB2-ERROR TO TRUE
      methodOut.setDsmDb2ErrorTrue();

      //  cobolCode::MOVE 'SELECT' TO DSM-ERR-TBL-ACTION
      methodOut.setDsmErrTblAction(CONSTANTS.LITERAL_SELECT_B4_);
      //  cobolCode::MOVE 'CUST_POL_PLN_XREF' TO DSM-ERR-TBL-NAME
      methodOut.setDsmErrTblName(CONSTANTS.LITERAL_CUST_POL_PLN_XREF_B8_);
      //  cobolCode::MOVE '7000-FUNC-CD6-READ-MXI' TO DSM-ERR-SECTN-NAME
      methodOut.setDsmErrSectnName(CONSTANTS.LITERAL_1149360916);
      //  cobolCode::MOVE 'D5427POL' TO DSM-ERR-PGM-NAME
      //  LITERAL_D5427POL = 'D5427POL'
      methodOut.setDsmErrPgmName(CONSTANTS.LITERAL_D5427POL);
      //  cobolCode::PERFORM 7777-MOVES-FOR-ERROR-LOG
      movesForErrorLog(programCtx.getMovesForErrorLogInCtx()); /*7777-MOVES-FOR-ERROR-LOG SECTION*/
      if (programCtx.isProgramEnded()) {
        return methodOut;
      }
    }

    return methodOut;
  }
  /**
   * funcCd6ReadMmi This method is derived from COBOL Paragraph - 7100-FUNC-CD6-READ-MMI SECTION
   * COBOL Cyclomatic complexity - 5 Input :
   *
   * <p>- polReqCovTypCd COBOL Name: POL-REQ-COV-TYP-CD - sqlcode COBOL Name: SQLCODE
   *
   * <p>Output :
   *
   * <p>- mmiCovTypCd COBOL Name: MMI-COV-TYP-CD - polReqCovTypCd COBOL Name: POL-REQ-COV-TYP-CD -
   * sqlcode_Ws COBOL Name: WS-SQLCODE - dsmSqlcode COBOL Name: DSM-SQLCODE - sqlcode COBOL Name:
   * SQLCODE - dsmReturnCode COBOL Name: DSM-RETURN-CODE - dsmErrTblAction COBOL Name:
   * DSM-ERR-TBL-ACTION - dsmErrTblName COBOL Name: DSM-ERR-TBL-NAME - dsmErrSectnName COBOL Name:
   * DSM-ERR-SECTN-NAME - dsmErrPgmName COBOL Name: DSM-ERR-PGM-NAME
   *
   * @throws CFException
   */
  @Override
  public FuncCd6ReadMmiOutCtx funcCd6ReadMmi(FuncCd6ReadMmiInCtx methodIn) throws Exception {

    // *82***************************************************************
    // Added variable to get the program context in place.
    D5427polCtx programCtx = methodIn.getD5427polCtx();
    // Added variable to get the output context in place.
    FuncCd6ReadMmiOutCtx methodOut = methodIn.getFuncCd6ReadMmiOutCtx();
    //  cobolCode::MOVE POL-REQ-COV-TYP-CD TO MMI-COV-TYP-CD
    methodOut.setMmiCovTypCd(methodOut.getPolReqCovTypCd());
    //  cobolCode::SELECT SRVC_CATGY_TBL_ID , LFTM_MAX_AMT , NEW_COINS_PRD_CD ,
    // NEW_COINS_SAL_INDV_TYP_CD , NEW_COINS_AMT , PAY_LOC_CD , PCP_SPEC_COINS_IND ,
    // SRVC_CD_N_SET_IND , SRVC_CD_P_SET_IND , SRVC_CD_T_SET_IND , BEN_MAX_COMB_PRI_CD ,
    // BEN_MAX_SPNE_MNIP_PRI_CD , BEN_MAX_PHYS_TRPY_PRI_CD , BEN_MAX_PH_OC_TRPY_PRI_CD ,
    // BEN_MAX_SPCH_TRPY_PRI_CD , BEN_MAX_OCP_TRPY_PRI_CD , BEN_MAX_PH_OC_SPCH_PRI_CD ,
    // BEN_MAX_CRDC_REHAB_PRI_CD FROM POL_PLN_MSTR WHERE COV_TYP_CD = ? AND POL_NBR = ? AND PLN_NBR
    // = ? AND CLSS_NBR = ?
    d5427polRepository.selectPolPlnMstr6(methodOut.getDclpolPlnMstr(), programCtx.getSqlca());
    //  cobolCode::MOVE SQLCODE TO WS-SQLCODE DSM-SQLCODE
    methodOut.setSqlcode_Ws(methodOut.getSqlcode());
    methodOut.setDsmSqlcode(methodOut.getSqlcode());
    //  cobolCode::EVALUATE TRUE
    if (methodOut.isSqlcodeOk()) {
      //  cobolCode::PERFORM 7110-POPULATE-RET-POL6-DATA
      populateRetPol6Data(
          programCtx.getPopulateRetPol6DataInCtx()); /*7110-POPULATE-RET-POL6-DATA SECTION*/
      if (programCtx.isProgramEnded()) {
        return methodOut;
      }
    } else if (methodOut.isSqlcodeNotFound()) {
      //  cobolCode::SET DSM-ENTRY-NOT-FND-INQ TO TRUE
      methodOut.setDsmEntryNotFndInqTrue();

      //  cobolCode::MOVE 'SELECT' TO DSM-ERR-TBL-ACTION
      methodOut.setDsmErrTblAction(CONSTANTS.LITERAL_SELECT_B4_);
      //  cobolCode::MOVE 'POL_PLN_MSTR' TO DSM-ERR-TBL-NAME
      methodOut.setDsmErrTblName(CONSTANTS.LITERAL_POL_PLN_MSTR_B13_);
      //  cobolCode::MOVE '7100-FUNC-CD6-READ-MMI' TO DSM-ERR-SECTN-NAME
      methodOut.setDsmErrSectnName(CONSTANTS.LITERAL_472930368);
      //  cobolCode::MOVE 'D5427POL' TO DSM-ERR-PGM-NAME
      //  LITERAL_D5427POL = 'D5427POL'
      methodOut.setDsmErrPgmName(CONSTANTS.LITERAL_D5427POL);
      //  cobolCode::PERFORM 7777-MOVES-FOR-ERROR-LOG
      movesForErrorLog(programCtx.getMovesForErrorLogInCtx()); /*7777-MOVES-FOR-ERROR-LOG SECTION*/
      if (programCtx.isProgramEnded()) {
        return methodOut;
      }
    } else {
      //  cobolCode::SET DSM-DB2-ERROR TO TRUE
      methodOut.setDsmDb2ErrorTrue();

      //  cobolCode::MOVE 'SELECT' TO DSM-ERR-TBL-ACTION
      methodOut.setDsmErrTblAction(CONSTANTS.LITERAL_SELECT_B4_);
      //  cobolCode::MOVE 'POL_PLN_MSTR' TO DSM-ERR-TBL-NAME
      methodOut.setDsmErrTblName(CONSTANTS.LITERAL_POL_PLN_MSTR_B13_);
      //  cobolCode::MOVE '7100-FUNC-CD6-READ-MMI' TO DSM-ERR-SECTN-NAME
      methodOut.setDsmErrSectnName(CONSTANTS.LITERAL_472930368);
      //  cobolCode::MOVE 'D5427POL' TO DSM-ERR-PGM-NAME
      //  LITERAL_D5427POL = 'D5427POL'
      methodOut.setDsmErrPgmName(CONSTANTS.LITERAL_D5427POL);
      //  cobolCode::PERFORM 7777-MOVES-FOR-ERROR-LOG
      movesForErrorLog(programCtx.getMovesForErrorLogInCtx()); /*7777-MOVES-FOR-ERROR-LOG SECTION*/
      if (programCtx.isProgramEnded()) {
        return methodOut;
      }
    }

    return methodOut;
  }
  /**
   * populateRetPol6Data This method is derived from COBOL Paragraph - 7110-POPULATE-RET-POL6-DATA
   * SECTION COBOL Cyclomatic complexity - 7 Input :
   *
   * <p>- xrfPayLoc1Nbr COBOL Name: XRF-PAY-LOC-1-NBR - mmiPayLocCd COBOL Name: MMI-PAY-LOC-CD -
   * mmiSrvcCatgyTblId COBOL Name: MMI-SRVC-CATGY-TBL-ID - mmiLftmMaxAmt COBOL Name:
   * MMI-LFTM-MAX-AMT - mmiNewCoinsPrdCd COBOL Name: MMI-NEW-COINS-PRD-CD - mmiNewCoinsSalIndvTypCd
   * COBOL Name: MMI-NEW-COINS-SAL-INDV-TYP-CD - mmiNewCoinsAmt COBOL Name: MMI-NEW-COINS-AMT -
   * mmiPcpSpecCoinsInd COBOL Name: MMI-PCP-SPEC-COINS-IND - mmiSrvcCdNSetInd COBOL Name:
   * MMI-SRVC-CD-N-SET-IND - mmiSrvcCdPSetInd COBOL Name: MMI-SRVC-CD-P-SET-IND - mmiSrvcCdTSetInd
   * COBOL Name: MMI-SRVC-CD-T-SET-IND - mmiBenMaxCombPriCd COBOL Name: MMI-BEN-MAX-COMB-PRI-CD -
   * mmiBenMaxSpneMnipPriCd COBOL Name: MMI-BEN-MAX-SPNE-MNIP-PRI-CD - mmiBenMaxPhysTrpyPriCd COBOL
   * Name: MMI-BEN-MAX-PHYS-TRPY-PRI-CD - mmiBenMaxPhOcTrpyPriCd COBOL Name:
   * MMI-BEN-MAX-PH-OC-TRPY-PRI-CD - mmiBenMaxSpchTrpyPriCd COBOL Name: MMI-BEN-MAX-SPCH-TRPY-PRI-CD
   * - mmiBenMaxOcpTrpyPriCd COBOL Name: MMI-BEN-MAX-OCP-TRPY-PRI-CD - mmiBenMaxPhOcSpchPriCd COBOL
   * Name: MMI-BEN-MAX-PH-OC-SPCH-PRI-CD - mmiBenMaxCrdcRehabPriCd COBOL Name:
   * MMI-BEN-MAX-CRDC-REHAB-PRI-CD
   *
   * <p>Output :
   *
   * <p>- pol6RetPayLocCd COBOL Name: POL6-RET-PAY-LOC-CD - mmiPayLocCd COBOL Name: MMI-PAY-LOC-CD -
   * pol6RetSrvCatTableId COBOL Name: POL6-RET-SRV-CAT-TABLE-ID - mmiSrvcCatgyTblId COBOL Name:
   * MMI-SRVC-CATGY-TBL-ID - pol6RetLftMaxAmt COBOL Name: POL6-RET-LFT-MAX-AMT - mmiLftmMaxAmt COBOL
   * Name: MMI-LFTM-MAX-AMT - pol6RetNewCoinsPd COBOL Name: POL6-RET-NEW-COINS-PD - mmiNewCoinsPrdCd
   * COBOL Name: MMI-NEW-COINS-PRD-CD - pol6RetNewCoinsSalItype COBOL Name:
   * POL6-RET-NEW-COINS-SAL-ITYPE - mmiNewCoinsSalIndvTypCd COBOL Name:
   * MMI-NEW-COINS-SAL-INDV-TYP-CD - pol6RetNewCoinsAmt COBOL Name: POL6-RET-NEW-COINS-AMT -
   * mmiNewCoinsAmt COBOL Name: MMI-NEW-COINS-AMT - pol6RetSrvcCdNSetInd COBOL Name:
   * POL6-RET-SRVC-CD-N-SET-IND - mmiPcpSpecCoinsInd COBOL Name: MMI-PCP-SPEC-COINS-IND -
   * mmiSrvcCdNSetInd COBOL Name: MMI-SRVC-CD-N-SET-IND - pol6RetSrvcCdPSetInd COBOL Name:
   * POL6-RET-SRVC-CD-P-SET-IND - mmiSrvcCdPSetInd COBOL Name: MMI-SRVC-CD-P-SET-IND -
   * pol6RetSrvcCdTSetInd COBOL Name: POL6-RET-SRVC-CD-T-SET-IND - mmiSrvcCdTSetInd COBOL Name:
   * MMI-SRVC-CD-T-SET-IND - pol6BenMaxCombPriCd COBOL Name: POL6-BEN-MAX-COMB-PRI-CD -
   * mmiBenMaxCombPriCd COBOL Name: MMI-BEN-MAX-COMB-PRI-CD - pol6SpineManipPriCd COBOL Name:
   * POL6-SPINE-MANIP-PRI-CD - mmiBenMaxSpneMnipPriCd COBOL Name: MMI-BEN-MAX-SPNE-MNIP-PRI-CD -
   * pol6PhysTrpyPriCd COBOL Name: POL6-PHYS-TRPY-PRI-CD - mmiBenMaxPhysTrpyPriCd COBOL Name:
   * MMI-BEN-MAX-PHYS-TRPY-PRI-CD - pol6PhyOcpTrpyPriCd COBOL Name: POL6-PHY-OCP-TRPY-PRI-CD -
   * mmiBenMaxPhOcTrpyPriCd COBOL Name: MMI-BEN-MAX-PH-OC-TRPY-PRI-CD - pol6SpchTrpyPriCd COBOL
   * Name: POL6-SPCH-TRPY-PRI-CD - mmiBenMaxSpchTrpyPriCd COBOL Name: MMI-BEN-MAX-SPCH-TRPY-PRI-CD -
   * pol6OcpTrpyPriCd COBOL Name: POL6-OCP-TRPY-PRI-CD - mmiBenMaxOcpTrpyPriCd COBOL Name:
   * MMI-BEN-MAX-OCP-TRPY-PRI-CD - pol6PhyOcpSpchPriCd COBOL Name: POL6-PHY-OCP-SPCH-PRI-CD -
   * mmiBenMaxPhOcSpchPriCd COBOL Name: MMI-BEN-MAX-PH-OC-SPCH-PRI-CD - pol6CrdcRehabPriCd COBOL
   * Name: POL6-CRDC-REHAB-PRI-CD - mmiBenMaxCrdcRehabPriCd COBOL Name:
   * MMI-BEN-MAX-CRDC-REHAB-PRI-CD
   *
   * @throws CFException
   */
  @Override
  public PopulateRetPol6DataOutCtx populateRetPol6Data(PopulateRetPol6DataInCtx methodIn)
      throws Exception {

    // *81***************************************************************
    // *81 7110-Populate-ret-pol6-data                                  *
    // *81 business function:popualte the return data                   *
    // *81***************************************************************
    // *82***************************************************************
    // *82 7110-populate-ret-pol6-data                                  *
    // *82 1. populate the return data                                  *
    // *82***************************************************************
    // Added variable to get the program context in place.
    D5427polCtx programCtx = methodIn.getD5427polCtx();
    // Added variable to get the output context in place.
    PopulateRetPol6DataOutCtx methodOut = methodIn.getPopulateRetPol6DataOutCtx();
    //  cobolCode::IF XRF-PAY-LOC-1-NBR = SPACES OR LOW-VALUES OR HIGH-VALUES
    if ((allSpaces(methodIn.getXrfPayLoc1Nbr()))
        || (checkLowValue(methodIn.getXrfPayLoc1Nbr()))
        || (isHighValue(methodIn.getXrfPayLoc1Nbr()))) {
      //  cobolCode::IF MMI-PAY-LOC-CD = SPACES OR LOW-VALUES OR HIGH-VALUES
      if ((allSpaces(methodOut.getMmiPayLocCd()))
          || (checkLowValue(methodOut.getMmiPayLocCd()))
          || (isHighValue(methodOut.getMmiPayLocCd()))) {
        //  cobolCode::MOVE SPACES TO POL6-RET-PAY-LOC-CD
        methodOut.setPol6RetPayLocCd(CONSTANTS.SPACE_3);
      }
      //  cobolCode::ELSE
      else {
        //  cobolCode::MOVE MMI-PAY-LOC-CD TO POL6-RET-PAY-LOC-CD
        methodOut.setPol6RetPayLocCd(methodOut.getMmiPayLocCd());
      }
    }
    //  cobolCode::MOVE MMI-SRVC-CATGY-TBL-ID TO POL6-RET-SRV-CAT-TABLE-ID
    methodOut.setPol6RetSrvCatTableId(methodOut.getMmiSrvcCatgyTblId());
    methodOut.setPol6RetLftMaxAmt(methodOut.getMmiLftmMaxAmt());
    methodOut.setPol6RetNewCoinsPd(padLeftZeros(1, methodOut.getMmiNewCoinsPrdCd(), false));
    //  cobolCode::MOVE MMI-NEW-COINS-SAL-INDV-TYP-CD TO POL6-RET-NEW-COINS-SAL-ITYPE
    methodOut.setPol6RetNewCoinsSalItype(methodOut.getMmiNewCoinsSalIndvTypCd());
    methodOut.setPol6RetNewCoinsAmt(methodOut.getMmiNewCoinsAmt());
    //  cobolCode::MOVE MMI-PCP-SPEC-COINS-IND TO POL6-RET-SRVC-CD-N-SET-IND
    methodOut.setPol6RetSrvcCdNSetInd(methodOut.getMmiPcpSpecCoinsInd());
    //  cobolCode::MOVE MMI-SRVC-CD-N-SET-IND TO POL6-RET-SRVC-CD-N-SET-IND
    methodOut.setPol6RetSrvcCdNSetInd(methodOut.getMmiSrvcCdNSetInd());
    //  cobolCode::MOVE MMI-SRVC-CD-P-SET-IND TO POL6-RET-SRVC-CD-P-SET-IND
    methodOut.setPol6RetSrvcCdPSetInd(methodOut.getMmiSrvcCdPSetInd());
    //  cobolCode::MOVE MMI-SRVC-CD-T-SET-IND TO POL6-RET-SRVC-CD-T-SET-IND
    methodOut.setPol6RetSrvcCdTSetInd(methodOut.getMmiSrvcCdTSetInd());
    //  cobolCode::MOVE MMI-BEN-MAX-COMB-PRI-CD TO POL6-BEN-MAX-COMB-PRI-CD
    methodOut.setPol6BenMaxCombPriCd(methodOut.getMmiBenMaxCombPriCd());
    //  cobolCode::MOVE MMI-BEN-MAX-SPNE-MNIP-PRI-CD TO POL6-SPINE-MANIP-PRI-CD
    methodOut.setPol6SpineManipPriCd(methodOut.getMmiBenMaxSpneMnipPriCd());
    //  cobolCode::MOVE MMI-BEN-MAX-PHYS-TRPY-PRI-CD TO POL6-PHYS-TRPY-PRI-CD
    methodOut.setPol6PhysTrpyPriCd(methodOut.getMmiBenMaxPhysTrpyPriCd());
    //  cobolCode::MOVE MMI-BEN-MAX-PH-OC-TRPY-PRI-CD TO POL6-PHY-OCP-TRPY-PRI-CD
    methodOut.setPol6PhyOcpTrpyPriCd(methodOut.getMmiBenMaxPhOcTrpyPriCd());
    //  cobolCode::MOVE MMI-BEN-MAX-SPCH-TRPY-PRI-CD TO POL6-SPCH-TRPY-PRI-CD
    methodOut.setPol6SpchTrpyPriCd(methodOut.getMmiBenMaxSpchTrpyPriCd());
    //  cobolCode::MOVE MMI-BEN-MAX-OCP-TRPY-PRI-CD TO POL6-OCP-TRPY-PRI-CD
    methodOut.setPol6OcpTrpyPriCd(methodOut.getMmiBenMaxOcpTrpyPriCd());
    //  cobolCode::MOVE MMI-BEN-MAX-PH-OC-SPCH-PRI-CD TO POL6-PHY-OCP-SPCH-PRI-CD
    methodOut.setPol6PhyOcpSpchPriCd(methodOut.getMmiBenMaxPhOcSpchPriCd());
    //  cobolCode::MOVE MMI-BEN-MAX-CRDC-REHAB-PRI-CD TO POL6-CRDC-REHAB-PRI-CD
    methodOut.setPol6CrdcRehabPriCd(methodOut.getMmiBenMaxCrdcRehabPriCd());

    return methodOut;
  }
  /**
   * funcCd6ReadFam This method is derived from COBOL Paragraph - 7200-FUNC-CD6-READ-FAM SECTION
   * COBOL Cyclomatic complexity - 2 Input :
   *
   * <p>- sqlcode_Ws COBOL Name: WS-SQLCODE
   *
   * <p>Output : None
   *
   * @throws CFException
   */
  @Override
  public FuncCd6ReadFamOutCtx funcCd6ReadFam(FuncCd6ReadFamInCtx methodIn) throws Exception {

    // *81***************************************************************
    // *81 7200-Func-cd6-read-fam                                       *
    // *81 business function: read the table to retrieve the records    *
    // *81***************************************************************
    // *82***************************************************************
    // *82 7200-func-cd6-read-fam                                       *
    // *82 1. fetch records from pol_pln_mstr_fam_ded table             *
    // *82***************************************************************
    // Added variable to get the program context in place.
    D5427polCtx programCtx = methodIn.getD5427polCtx();
    // Added variable to get the output context in place.
    FuncCd6ReadFamOutCtx methodOut = methodIn.getFuncCd6ReadFamOutCtx();
    //  cobolCode::PERFORM 7210-OPEN-FAM-CURSOR
    openFamCursor(programCtx.getOpenFamCursorInCtx()); /*7210-OPEN-FAM-CURSOR SECTION*/
    if (programCtx.isProgramEnded()) {
      return methodOut;
    }
    //  cobolCode::IF WS-SQLCODE-OK
    if (methodIn.isSqlcodeOk()) {
      //  cobolCode::PERFORM 7220-FETCH-FAM-CURSOR
      fetchFamCursor(programCtx.getFetchFamCursorInCtx()); /*7220-FETCH-FAM-CURSOR SECTION*/
      if (programCtx.isProgramEnded()) {
        return methodOut;
      }
    }
    //  cobolCode::PERFORM 7230-CLOSE-FAM-CURSOR
    closeFamCursor(programCtx.getCloseFamCursorInCtx()); /*7230-CLOSE-FAM-CURSOR SECTION*/
    if (programCtx.isProgramEnded()) {
      return methodOut;
    }

    return methodOut;
  }
  /**
   * openFamCursor This method is derived from COBOL Paragraph - 7210-OPEN-FAM-CURSOR SECTION COBOL
   * Cyclomatic complexity - 4 Input :
   *
   * <p>- sqlcode COBOL Name: SQLCODE
   *
   * <p>Output :
   *
   * <p>- sqlcode_Ws COBOL Name: WS-SQLCODE - dsmSqlcode COBOL Name: DSM-SQLCODE - sqlcode COBOL
   * Name: SQLCODE - dsmReturnCode COBOL Name: DSM-RETURN-CODE - dsmErrTblAction COBOL Name:
   * DSM-ERR-TBL-ACTION - dsmErrTblName COBOL Name: DSM-ERR-TBL-NAME - dsmErrSectnName COBOL Name:
   * DSM-ERR-SECTN-NAME - dsmErrPgmName COBOL Name: DSM-ERR-PGM-NAME
   *
   * @throws CFException
   */
  @Override
  public OpenFamCursorOutCtx openFamCursor(OpenFamCursorInCtx methodIn) throws Exception {

    // *81***************************************************************
    // *81 7210-Open-fam-cursor                                         *
    // *81 business function: open the cursor                           *
    // *81***************************************************************
    // *82***************************************************************
    // *82 7210-open-fam-cursor                                         *
    // *82 1. opens the cursor cur-fam-ded-csr                          *
    // *82***************************************************************
    // Added variable to get the program context in place.
    D5427polCtx programCtx = methodIn.getD5427polCtx();
    // Added variable to get the output context in place.
    OpenFamCursorOutCtx methodOut = methodIn.getOpenFamCursorOutCtx();
    //  cobolCode::SELECT DED_CARO_CD , DED_MBR_DESC FROM POL_PLN_MSTR_FAM_DED WHERE POL_NBR = ? AND
    // PLN_NBR = ? AND CLSS_NBR = ? AND COV_TYP_CD = ? FOR FETCH ONLY
    programCtx.setCurFamDedCsrResultSet(
        d5427polRepository.openCurFamDedCsrD5427pol(
            methodIn.getDclpolPlnMstrFamDed(), programCtx.getSqlca()));
    //  cobolCode::MOVE SQLCODE TO WS-SQLCODE DSM-SQLCODE
    methodOut.setSqlcode_Ws(methodOut.getSqlcode());
    methodOut.setDsmSqlcode(methodOut.getSqlcode());
    //  cobolCode::EVALUATE TRUE
    if (methodOut.isSqlcodeOk()) {;
    } else {
      //  cobolCode::SET DSM-DB2-ERROR TO TRUE
      methodOut.setDsmDb2ErrorTrue();

      //  cobolCode::MOVE 'OPEN' TO DSM-ERR-TBL-ACTION
      methodOut.setDsmErrTblAction(CONSTANTS.LITERAL_OPEN_B6_);
      //  cobolCode::MOVE 'POL_PLN_MSTR_FAM_DED' TO DSM-ERR-TBL-NAME
      methodOut.setDsmErrTblName(CONSTANTS.LITERAL_POL_PLN_MSTR_FAM_DED_B5_);
      //  cobolCode::MOVE '7210-OPEN-FAM-CURSOR' TO DSM-ERR-SECTN-NAME
      methodOut.setDsmErrSectnName(CONSTANTS.LITERAL_1629715007);
      //  cobolCode::MOVE 'D5427POL' TO DSM-ERR-PGM-NAME
      //  LITERAL_D5427POL = 'D5427POL'
      methodOut.setDsmErrPgmName(CONSTANTS.LITERAL_D5427POL);
      //  cobolCode::PERFORM 7777-MOVES-FOR-ERROR-LOG
      movesForErrorLog(programCtx.getMovesForErrorLogInCtx()); /*7777-MOVES-FOR-ERROR-LOG SECTION*/
      if (programCtx.isProgramEnded()) {
        return methodOut;
      }
    }

    return methodOut;
  }
  /**
   * fetchFamCursor This method is derived from COBOL Paragraph - 7220-FETCH-FAM-CURSOR SECTION
   * COBOL Cyclomatic complexity - 7 Input :
   *
   * <p>- sqlcode_Ws COBOL Name: WS-SQLCODE - sqlcode COBOL Name: SQLCODE - dfdeDedCaroCd COBOL
   * Name: DFDE-DED-CARO-CD - dfdeDedMbrDesc COBOL Name: DFDE-DED-MBR-DESC
   *
   * <p>Output :
   *
   * <p>- mxiFirstTime COBOL Name: WS-MXI-FIRST-TIME - lineSub COBOL Name: WS-LINE-SUB - sqlcode_Ws
   * COBOL Name: WS-SQLCODE - dsmSqlcode COBOL Name: DSM-SQLCODE - sqlcode COBOL Name: SQLCODE -
   * dsmReturnCode COBOL Name: DSM-RETURN-CODE - dsmErrTblAction COBOL Name: DSM-ERR-TBL-ACTION -
   * dsmErrTblName COBOL Name: DSM-ERR-TBL-NAME - dsmErrSectnName COBOL Name: DSM-ERR-SECTN-NAME -
   * dsmErrPgmName COBOL Name: DSM-ERR-PGM-NAME - pol6RetFamDedCaroCd COBOL Name:
   * POL6-RET-FAM-DED-CARO-CD - dfdeDedCaroCd COBOL Name: DFDE-DED-CARO-CD - pol6RetFamDedDesc COBOL
   * Name: POL6-RET-FAM-DED-DESC - dfdeDedMbrDesc COBOL Name: DFDE-DED-MBR-DESC
   *
   * @throws CFException
   */
  @Override
  public FetchFamCursorOutCtx fetchFamCursor(FetchFamCursorInCtx methodIn) throws Exception {

    // *81 7220-Fetch-fam-cursor                                        *
    // *81 business function: fetch records thru cursor                 *
    // *81***************************************************************
    // *82***************************************************************
    // *82 7220-fetch-fam-cursor                                        *
    // *82 1. fetch record from family deductible policy plan table     *
    // *82***************************************************************
    // Added variable to get the program context in place.
    D5427polCtx programCtx = methodIn.getD5427polCtx();
    // Added variable to get the output context in place.
    FetchFamCursorOutCtx methodOut = methodIn.getFetchFamCursorOutCtx();
    //  LITERAL_Y = 'Y'
    methodOut.setMxiFirstTime(CONSTANTS.LITERAL_Y);
    methodOut.setLineSub(1);
    //  cobolCode::PERFORM UNTIL WS-SQLCODE-NOT-FOUND
    while ((!(methodIn.isSqlcodeNotFound()))) {
      //  cobolCode::FETCH CUR-FAM-DED-CSR INTO ? , ?
      d5427polRepository.fetchCurFamDedCsrD5427pol(
          programCtx.getCurFamDedCsrResultSet(),
          methodOut.getDclpolPlnMstrFamDed(),
          programCtx.getSqlca());
      //  cobolCode::MOVE SQLCODE TO WS-SQLCODE DSM-SQLCODE
      methodOut.setSqlcode_Ws(methodOut.getSqlcode());
      methodOut.setDsmSqlcode(methodOut.getSqlcode());
      //  cobolCode::EVALUATE TRUE
      if (methodOut.isSqlcodeOk()) {
        //  cobolCode::SET MXI-FIRST-TIME-NO TO TRUE
        methodOut.setMxiFirstTimeNoTrue();

        //  cobolCode::IF WS-LINE-SUB > 4
        if ((methodOut.getLineSub() > 4)) {
          //  cobolCode::SET DSM-DB2-ERROR TO TRUE
          methodOut.setDsmDb2ErrorTrue();

          //  cobolCode::MOVE 'TBL OVRFLO' TO DSM-ERR-TBL-ACTION
          //  LITERAL_TBL_B_OVRFLO = 'TBL OVRFLO'
          methodOut.setDsmErrTblAction(CONSTANTS.LITERAL_TBL_B_OVRFLO);
          //  cobolCode::MOVE 'POL_PLN_MSTR_FAM_DED' TO DSM-ERR-TBL-NAME
          methodOut.setDsmErrTblName(CONSTANTS.LITERAL_POL_PLN_MSTR_FAM_DED_B5_);
          //  cobolCode::MOVE '7220-FETCH-FAM-CURSOR' TO DSM-ERR-SECTN-NAME
          methodOut.setDsmErrSectnName(CONSTANTS.LITERAL_1265502408);
          //  cobolCode::MOVE 'D5427POL' TO DSM-ERR-PGM-NAME
          //  LITERAL_D5427POL = 'D5427POL'
          methodOut.setDsmErrPgmName(CONSTANTS.LITERAL_D5427POL);
          //  cobolCode::PERFORM 7777-MOVES-FOR-ERROR-LOG
          movesForErrorLog(
              programCtx.getMovesForErrorLogInCtx()); /*7777-MOVES-FOR-ERROR-LOG SECTION*/
          if (programCtx.isProgramEnded()) {
            return methodOut;
          }
        }
        //  cobolCode::MOVE DFDE-DED-CARO-CD TO POL6-RET-FAM-DED-CARO-CD ( WS-LINE-SUB )
        methodOut.setPol6RetFamDedCaroCd(methodOut.getLineSub() - 1, methodOut.getDfdeDedCaroCd());
        //  cobolCode::MOVE DFDE-DED-MBR-DESC TO POL6-RET-FAM-DED-DESC ( WS-LINE-SUB )
        methodOut.setPol6RetFamDedDesc(methodOut.getLineSub() - 1, methodOut.getDfdeDedMbrDesc());
        //  cobolCode::ADD 1 TO WS-LINE-SUB
        methodOut.setLineSub(methodOut.getLineSub() + 1);
      } else if (methodIn.isSqlcodeNotFound()) {;
      } else {
        //  cobolCode::SET DSM-DB2-ERROR TO TRUE
        methodOut.setDsmDb2ErrorTrue();

        //  cobolCode::MOVE 'FETCH' TO DSM-ERR-TBL-ACTION
        methodOut.setDsmErrTblAction(CONSTANTS.LITERAL_FETCH_B5_);
        //  cobolCode::MOVE 'POL_PLN_MSTR_FAM_DED' TO DSM-ERR-TBL-NAME
        methodOut.setDsmErrTblName(CONSTANTS.LITERAL_POL_PLN_MSTR_FAM_DED_B5_);
        //  cobolCode::MOVE '7220-FETCH-FAM-CURSOR' TO DSM-ERR-SECTN-NAME
        methodOut.setDsmErrSectnName(CONSTANTS.LITERAL_1265502408);
        //  cobolCode::MOVE 'D5427POL' TO DSM-ERR-PGM-NAME
        //  LITERAL_D5427POL = 'D5427POL'
        methodOut.setDsmErrPgmName(CONSTANTS.LITERAL_D5427POL);
        //  cobolCode::PERFORM 7777-MOVES-FOR-ERROR-LOG
        movesForErrorLog(
            programCtx.getMovesForErrorLogInCtx()); /*7777-MOVES-FOR-ERROR-LOG SECTION*/
        if (programCtx.isProgramEnded()) {
          return methodOut;
        }
      }
    }

    return methodOut;
  }
  /**
   * closeFamCursor This method is derived from COBOL Paragraph - 7230-CLOSE-FAM-CURSOR SECTION
   * COBOL Cyclomatic complexity - 4 Input :
   *
   * <p>- sqlcode COBOL Name: SQLCODE
   *
   * <p>Output :
   *
   * <p>- sqlcode_Ws COBOL Name: WS-SQLCODE - dsmSqlcode COBOL Name: DSM-SQLCODE - sqlcode COBOL
   * Name: SQLCODE - dsmReturnCode COBOL Name: DSM-RETURN-CODE - dsmErrTblAction COBOL Name:
   * DSM-ERR-TBL-ACTION - dsmErrTblName COBOL Name: DSM-ERR-TBL-NAME - dsmErrSectnName COBOL Name:
   * DSM-ERR-SECTN-NAME - dsmErrPgmName COBOL Name: DSM-ERR-PGM-NAME
   *
   * @throws CFException
   */
  @Override
  public CloseFamCursorOutCtx closeFamCursor(CloseFamCursorInCtx methodIn) throws Exception {

    // *81 7230-Close-fam-cursor                                        *
    // *81 business function: close the cursor                          *
    // *81***************************************************************
    // *82***************************************************************
    // *82 7230-close-fam-cursor                                        *
    // *82 1. close the cursor cur-fam-ded-csr                          *
    // *82***************************************************************
    // Added variable to get the program context in place.
    D5427polCtx programCtx = methodIn.getD5427polCtx();
    // Added variable to get the output context in place.
    CloseFamCursorOutCtx methodOut = methodIn.getCloseFamCursorOutCtx();
    //  cobolCode::CLOSE CUR-FAM-DED-CSR
    d5427polRepository.closeCurFamDedCsrD5427pol(
        programCtx.getCurFamDedCsrResultSet(), programCtx.getSqlca());
    //  cobolCode::MOVE SQLCODE TO WS-SQLCODE DSM-SQLCODE
    methodOut.setSqlcode_Ws(methodOut.getSqlcode());
    methodOut.setDsmSqlcode(methodOut.getSqlcode());
    //  cobolCode::EVALUATE TRUE
    if (methodOut.isSqlcodeOk()) {;
    } else {
      //  cobolCode::SET DSM-DB2-ERROR TO TRUE
      methodOut.setDsmDb2ErrorTrue();

      //  cobolCode::MOVE 'CLOSE' TO DSM-ERR-TBL-ACTION
      methodOut.setDsmErrTblAction(CONSTANTS.LITERAL_CLOSE_B5_);
      //  cobolCode::MOVE 'POL_PLN_MSTR_FAM_DED' TO DSM-ERR-TBL-NAME
      methodOut.setDsmErrTblName(CONSTANTS.LITERAL_POL_PLN_MSTR_FAM_DED_B5_);
      //  cobolCode::MOVE '7230-CLOSE-FAM-CURSOR' TO DSM-ERR-SECTN-NAME
      methodOut.setDsmErrSectnName(CONSTANTS.LITERAL_755162555);
      //  cobolCode::MOVE 'D5427POL' TO DSM-ERR-PGM-NAME
      //  LITERAL_D5427POL = 'D5427POL'
      methodOut.setDsmErrPgmName(CONSTANTS.LITERAL_D5427POL);
      //  cobolCode::PERFORM 7777-MOVES-FOR-ERROR-LOG
      movesForErrorLog(programCtx.getMovesForErrorLogInCtx()); /*7777-MOVES-FOR-ERROR-LOG SECTION*/
      if (programCtx.isProgramEnded()) {
        return methodOut;
      }
    }

    return methodOut;
  }
  /**
   * funcCd6ReadInd This method is derived from COBOL Paragraph - 7300-FUNC-CD6-READ-IND SECTION
   * COBOL Cyclomatic complexity - 2 Input :
   *
   * <p>- sqlcode_Ws COBOL Name: WS-SQLCODE
   *
   * <p>Output : None
   *
   * @throws CFException
   */
  @Override
  public FuncCd6ReadIndOutCtx funcCd6ReadInd(FuncCd6ReadIndInCtx methodIn) throws Exception {

    // *81***************************************************************
    // *81 7300-Func-cd6-read-ind                                       *
    // *81 business function: read the individual ded mmi table         *
    // *81***************************************************************
    // *82***************************************************************
    // *82 7300-func-cd6-read-ind                                       *
    // *82 1. fetch the records from individual ded mmi table           *
    // *82***************************************************************
    // Added variable to get the program context in place.
    D5427polCtx programCtx = methodIn.getD5427polCtx();
    // Added variable to get the output context in place.
    FuncCd6ReadIndOutCtx methodOut = methodIn.getFuncCd6ReadIndOutCtx();
    //  cobolCode::PERFORM 7310-OPEN-INDV-CURSOR
    openIndvCursor(programCtx.getOpenIndvCursorInCtx()); /*7310-OPEN-INDV-CURSOR SECTION*/
    if (programCtx.isProgramEnded()) {
      return methodOut;
    }
    //  cobolCode::IF WS-SQLCODE-OK
    if (methodIn.isSqlcodeOk()) {
      //  cobolCode::PERFORM 7320-FETCH-INDV-CURSOR
      fetchIndvCursor(programCtx.getFetchIndvCursorInCtx()); /*7320-FETCH-INDV-CURSOR SECTION*/
      if (programCtx.isProgramEnded()) {
        return methodOut;
      }
    }
    //  cobolCode::PERFORM 7330-CLOSE-INDV-CURSOR
    closeIndvCursor(programCtx.getCloseIndvCursorInCtx()); /*7330-CLOSE-INDV-CURSOR SECTION*/
    if (programCtx.isProgramEnded()) {
      return methodOut;
    }

    return methodOut;
  }
  /**
   * openIndvCursor This method is derived from COBOL Paragraph - 7310-OPEN-INDV-CURSOR SECTION
   * COBOL Cyclomatic complexity - 4 Input :
   *
   * <p>- sqlcode COBOL Name: SQLCODE
   *
   * <p>Output :
   *
   * <p>- sqlcode_Ws COBOL Name: WS-SQLCODE - dsmSqlcode COBOL Name: DSM-SQLCODE - sqlcode COBOL
   * Name: SQLCODE - dsmReturnCode COBOL Name: DSM-RETURN-CODE - dsmErrTblAction COBOL Name:
   * DSM-ERR-TBL-ACTION - dsmErrTblName COBOL Name: DSM-ERR-TBL-NAME - dsmErrSectnName COBOL Name:
   * DSM-ERR-SECTN-NAME - dsmErrPgmName COBOL Name: DSM-ERR-PGM-NAME
   *
   * @throws CFException
   */
  @Override
  public OpenIndvCursorOutCtx openIndvCursor(OpenIndvCursorInCtx methodIn) throws Exception {

    // *81***************************************************************
    // *81 7310-Open-indv-cursor                                        *
    // *81 business function: open the cursor                           *
    // *81***************************************************************
    // *82***************************************************************
    // *82 7310-open-indv-cursor                                        *
    // *82 1. opens the cursor  cur-ind-ded-csr                         *
    // *82***************************************************************
    // Added variable to get the program context in place.
    D5427polCtx programCtx = methodIn.getD5427polCtx();
    // Added variable to get the output context in place.
    OpenIndvCursorOutCtx methodOut = methodIn.getOpenIndvCursorOutCtx();
    //  cobolCode::SELECT DED_SRVC_DESC , DED_NTWK_TYP_CD , DED_CARO_CD FROM POL_PLN_MSTR_INDV_DED
    // WHERE COV_TYP_CD = ? AND POL_NBR = ? AND PLN_NBR = ? AND CLSS_NBR = ? FOR FETCH ONLY
    programCtx.setCurIndDedCsrResultSet(
        d5427polRepository.openCurIndDedCsrD5427pol(
            programCtx.getSqlca(), methodIn.getDclpolPlnMstrIndvDed()));
    //  cobolCode::MOVE SQLCODE TO WS-SQLCODE DSM-SQLCODE
    methodOut.setSqlcode_Ws(methodOut.getSqlcode());
    methodOut.setDsmSqlcode(methodOut.getSqlcode());
    //  cobolCode::EVALUATE TRUE
    if (methodOut.isSqlcodeOk()) {;
    } else {
      //  cobolCode::SET DSM-DB2-ERROR TO TRUE
      methodOut.setDsmDb2ErrorTrue();

      //  cobolCode::MOVE 'OPEN' TO DSM-ERR-TBL-ACTION
      methodOut.setDsmErrTblAction(CONSTANTS.LITERAL_OPEN_B6_);
      //  cobolCode::MOVE 'POL_PLN_MSTR_INDV_DED' TO DSM-ERR-TBL-NAME
      methodOut.setDsmErrTblName(CONSTANTS.LITERAL_POL_PLN_MSTR_INDV_DED_B4_);
      //  cobolCode::MOVE '7310-OPEN-INDV-CURSOR' TO DSM-ERR-SECTN-NAME
      methodOut.setDsmErrSectnName(CONSTANTS.LITERAL_1464376667);
      //  cobolCode::MOVE 'D5427POL' TO DSM-ERR-PGM-NAME
      //  LITERAL_D5427POL = 'D5427POL'
      methodOut.setDsmErrPgmName(CONSTANTS.LITERAL_D5427POL);
      //  cobolCode::PERFORM 7777-MOVES-FOR-ERROR-LOG
      movesForErrorLog(programCtx.getMovesForErrorLogInCtx()); /*7777-MOVES-FOR-ERROR-LOG SECTION*/
      if (programCtx.isProgramEnded()) {
        return methodOut;
      }
    }

    return methodOut;
  }
  /**
   * fetchIndvCursor This method is derived from COBOL Paragraph - 7320-FETCH-INDV-CURSOR SECTION
   * COBOL Cyclomatic complexity - 7 Input :
   *
   * <p>- sqlcode_Ws COBOL Name: WS-SQLCODE - sqlcode COBOL Name: SQLCODE - dideDedSrvcDesc COBOL
   * Name: DIDE-DED-SRVC-DESC - dideDedNtwkTypCd COBOL Name: DIDE-DED-NTWK-TYP-CD - dideDedCaroCd
   * COBOL Name: DIDE-DED-CARO-CD
   *
   * <p>Output :
   *
   * <p>- mxiFirstTime COBOL Name: WS-MXI-FIRST-TIME - lineSub COBOL Name: WS-LINE-SUB - sqlcode_Ws
   * COBOL Name: WS-SQLCODE - dsmSqlcode COBOL Name: DSM-SQLCODE - sqlcode COBOL Name: SQLCODE -
   * dsmReturnCode COBOL Name: DSM-RETURN-CODE - dsmErrTblAction COBOL Name: DSM-ERR-TBL-ACTION -
   * dsmErrTblName COBOL Name: DSM-ERR-TBL-NAME - dsmErrSectnName COBOL Name: DSM-ERR-SECTN-NAME -
   * dsmErrPgmName COBOL Name: DSM-ERR-PGM-NAME - pol6RetIndDedDesc COBOL Name:
   * POL6-RET-IND-DED-DESC - dideDedSrvcDesc COBOL Name: DIDE-DED-SRVC-DESC - pol6RetIndDedNetTyp
   * COBOL Name: POL6-RET-IND-DED-NET-TYP - dideDedNtwkTypCd COBOL Name: DIDE-DED-NTWK-TYP-CD -
   * pol6RetIndvDedCaroCd COBOL Name: POL6-RET-INDV-DED-CARO-CD - dideDedCaroCd COBOL Name:
   * DIDE-DED-CARO-CD
   *
   * @throws CFException
   */
  @Override
  public FetchIndvCursorOutCtx fetchIndvCursor(FetchIndvCursorInCtx methodIn) throws Exception {

    // *81***************************************************************
    // *81 7320-Fetch-indv-cursor                                       *
    // *81 business function: fetch the record from the table           *
    // *81***************************************************************
    // *82***************************************************************
    // *82 7620-fetch-indv-cursor                                       *
    // *82 1. fetch records from the individual deductible policy plan  *
    // *82    table                                                     *
    // *82***************************************************************
    // Added variable to get the program context in place.
    D5427polCtx programCtx = methodIn.getD5427polCtx();
    // Added variable to get the output context in place.
    FetchIndvCursorOutCtx methodOut = methodIn.getFetchIndvCursorOutCtx();
    //  LITERAL_Y = 'Y'
    methodOut.setMxiFirstTime(CONSTANTS.LITERAL_Y);
    methodOut.setLineSub(1);
    //  cobolCode::PERFORM UNTIL WS-SQLCODE-NOT-FOUND
    while ((!(methodIn.isSqlcodeNotFound()))) {
      //  cobolCode::FETCH CUR-IND-DED-CSR INTO ? , ? , ?
      d5427polRepository.fetchCurIndDedCsrD5427pol(
          programCtx.getCurIndDedCsrResultSet(),
          programCtx.getSqlca(),
          methodOut.getDclpolPlnMstrIndvDed());
      //  cobolCode::MOVE SQLCODE TO WS-SQLCODE DSM-SQLCODE
      methodOut.setSqlcode_Ws(methodOut.getSqlcode());
      methodOut.setDsmSqlcode(methodOut.getSqlcode());
      //  cobolCode::EVALUATE TRUE
      if (methodOut.isSqlcodeOk()) {
        //  cobolCode::SET MXI-FIRST-TIME-NO TO TRUE
        methodOut.setMxiFirstTimeNoTrue();

        //  cobolCode::IF WS-LINE-SUB > 6
        if ((methodOut.getLineSub() > 6)) {
          //  cobolCode::SET DSM-DB2-ERROR TO TRUE
          methodOut.setDsmDb2ErrorTrue();

          //  cobolCode::MOVE 'TBL OVRFLO' TO DSM-ERR-TBL-ACTION
          //  LITERAL_TBL_B_OVRFLO = 'TBL OVRFLO'
          methodOut.setDsmErrTblAction(CONSTANTS.LITERAL_TBL_B_OVRFLO);
          //  cobolCode::MOVE 'POL_PLN_MSTR_INDV_DED' TO DSM-ERR-TBL-NAME
          methodOut.setDsmErrTblName(CONSTANTS.LITERAL_POL_PLN_MSTR_INDV_DED_B4_);
          //  cobolCode::MOVE '7320-FETCH-INDV-CURSOR' TO DSM-ERR-SECTN-NAME
          methodOut.setDsmErrSectnName(CONSTANTS.LITERAL_691407034);
          //  cobolCode::MOVE 'D5427POL' TO DSM-ERR-PGM-NAME
          //  LITERAL_D5427POL = 'D5427POL'
          methodOut.setDsmErrPgmName(CONSTANTS.LITERAL_D5427POL);
          //  cobolCode::PERFORM 7777-MOVES-FOR-ERROR-LOG
          movesForErrorLog(
              programCtx.getMovesForErrorLogInCtx()); /*7777-MOVES-FOR-ERROR-LOG SECTION*/
          if (programCtx.isProgramEnded()) {
            return methodOut;
          }
        }
        //  cobolCode::MOVE DIDE-DED-SRVC-DESC TO POL6-RET-IND-DED-DESC ( WS-LINE-SUB )
        methodOut.setPol6RetIndDedDesc(methodOut.getLineSub() - 1, methodOut.getDideDedSrvcDesc());
        //  cobolCode::MOVE DIDE-DED-NTWK-TYP-CD TO POL6-RET-IND-DED-NET-TYP ( WS-LINE-SUB )
        methodOut.setPol6RetIndDedNetTyp(
            methodOut.getLineSub() - 1, methodOut.getDideDedNtwkTypCd());
        //  cobolCode::MOVE DIDE-DED-CARO-CD TO POL6-RET-INDV-DED-CARO-CD ( WS-LINE-SUB )
        methodOut.setPol6RetIndvDedCaroCd(methodOut.getLineSub() - 1, methodOut.getDideDedCaroCd());
        //  cobolCode::ADD 1 TO WS-LINE-SUB
        methodOut.setLineSub(methodOut.getLineSub() + 1);
      } else if (methodIn.isSqlcodeNotFound()) {;
      } else {
        //  cobolCode::SET DSM-DB2-ERROR TO TRUE
        methodOut.setDsmDb2ErrorTrue();

        //  cobolCode::MOVE 'FETCH' TO DSM-ERR-TBL-ACTION
        methodOut.setDsmErrTblAction(CONSTANTS.LITERAL_FETCH_B5_);
        //  cobolCode::MOVE 'POL_PLN_MSTR_INDV_DED' TO DSM-ERR-TBL-NAME
        methodOut.setDsmErrTblName(CONSTANTS.LITERAL_POL_PLN_MSTR_INDV_DED_B4_);
        //  cobolCode::MOVE '7320-FETCH-INDV-CURSOR' TO DSM-ERR-SECTN-NAME
        methodOut.setDsmErrSectnName(CONSTANTS.LITERAL_691407034);
        //  cobolCode::MOVE 'D5427POL' TO DSM-ERR-PGM-NAME
        //  LITERAL_D5427POL = 'D5427POL'
        methodOut.setDsmErrPgmName(CONSTANTS.LITERAL_D5427POL);
        //  cobolCode::PERFORM 7777-MOVES-FOR-ERROR-LOG
        movesForErrorLog(
            programCtx.getMovesForErrorLogInCtx()); /*7777-MOVES-FOR-ERROR-LOG SECTION*/
        if (programCtx.isProgramEnded()) {
          return methodOut;
        }
      }
    }

    return methodOut;
  }
  /**
   * closeIndvCursor This method is derived from COBOL Paragraph - 7330-CLOSE-INDV-CURSOR SECTION
   * COBOL Cyclomatic complexity - 4 Input :
   *
   * <p>- sqlcode COBOL Name: SQLCODE
   *
   * <p>Output :
   *
   * <p>- sqlcode_Ws COBOL Name: WS-SQLCODE - dsmSqlcode COBOL Name: DSM-SQLCODE - sqlcode COBOL
   * Name: SQLCODE - dsmReturnCode COBOL Name: DSM-RETURN-CODE - dsmErrTblAction COBOL Name:
   * DSM-ERR-TBL-ACTION - dsmErrTblName COBOL Name: DSM-ERR-TBL-NAME - dsmErrSectnName COBOL Name:
   * DSM-ERR-SECTN-NAME - dsmErrPgmName COBOL Name: DSM-ERR-PGM-NAME
   *
   * @throws CFException
   */
  @Override
  public CloseIndvCursorOutCtx closeIndvCursor(CloseIndvCursorInCtx methodIn) throws Exception {

    // *81***************************************************************
    // *81 7330-Close-indv-cursor                                       *
    // *81 business function: close the cursor                          *
    // *81***************************************************************
    // *82***************************************************************
    // *82 7330-close-indv-cursor                                       *
    // *82 1. close the cursor cur-ind-ded-csr                          *
    // *82***************************************************************
    // Added variable to get the program context in place.
    D5427polCtx programCtx = methodIn.getD5427polCtx();
    // Added variable to get the output context in place.
    CloseIndvCursorOutCtx methodOut = methodIn.getCloseIndvCursorOutCtx();
    //  cobolCode::CLOSE CUR-IND-DED-CSR
    d5427polRepository.closeCurIndDedCsrD5427pol(
        programCtx.getCurIndDedCsrResultSet(), programCtx.getSqlca());
    //  cobolCode::MOVE SQLCODE TO WS-SQLCODE DSM-SQLCODE
    methodOut.setSqlcode_Ws(methodOut.getSqlcode());
    methodOut.setDsmSqlcode(methodOut.getSqlcode());
    //  cobolCode::EVALUATE TRUE
    if (methodOut.isSqlcodeOk()) {;
    } else {
      //  cobolCode::SET DSM-DB2-ERROR TO TRUE
      methodOut.setDsmDb2ErrorTrue();

      //  cobolCode::MOVE 'CLOSE' TO DSM-ERR-TBL-ACTION
      methodOut.setDsmErrTblAction(CONSTANTS.LITERAL_CLOSE_B5_);
      //  cobolCode::MOVE 'POL_PLN_MSTR_INDV_DED' TO DSM-ERR-TBL-NAME
      methodOut.setDsmErrTblName(CONSTANTS.LITERAL_POL_PLN_MSTR_INDV_DED_B4_);
      //  cobolCode::MOVE '7330-CLOSE-INDV-CURSOR' TO DSM-ERR-SECTN-NAME
      methodOut.setDsmErrSectnName(CONSTANTS.LITERAL_1582895299);
      //  cobolCode::MOVE 'D5427POL' TO DSM-ERR-PGM-NAME
      //  LITERAL_D5427POL = 'D5427POL'
      methodOut.setDsmErrPgmName(CONSTANTS.LITERAL_D5427POL);
      //  cobolCode::PERFORM 7777-MOVES-FOR-ERROR-LOG
      movesForErrorLog(programCtx.getMovesForErrorLogInCtx()); /*7777-MOVES-FOR-ERROR-LOG SECTION*/
      if (programCtx.isProgramEnded()) {
        return methodOut;
      }
    }

    return methodOut;
  }
  /**
   * funCd8PolplnXref This method is derived from COBOL Paragraph - 8300-FUN-CD8-POLPLN-XREF SECTION
   * COBOL Cyclomatic complexity - 5 Input :
   *
   * <p>- sqlcode COBOL Name: SQLCODE
   *
   * <p>Output :
   *
   * <p>- sqlcode_Ws COBOL Name: WS-SQLCODE - dsmSqlcode COBOL Name: DSM-SQLCODE - sqlcode COBOL
   * Name: SQLCODE - dsmReturnCode COBOL Name: DSM-RETURN-CODE - dsmErrTblAction COBOL Name:
   * DSM-ERR-TBL-ACTION - dsmErrTblName COBOL Name: DSM-ERR-TBL-NAME - dsmErrSectnName COBOL Name:
   * DSM-ERR-SECTN-NAME - dsmErrPgmName COBOL Name: DSM-ERR-PGM-NAME
   *
   * @throws CFException
   */
  @Override
  public FunCd8PolplnXrefOutCtx funCd8PolplnXref(FunCd8PolplnXrefInCtx methodIn) throws Exception {

    // *81***************************************************************
    // *82***************************************************************
    // *82 8300-Fun-cd8-polpln-xref.                                    *
    // *82 1. read the records from the cust_pol_pln_xref table         *
    // *82                                                              *
    // *82 called : 0000-mainline                                       *
    // *82 calls  : 8310-populate-mxi-ret                               *
    // *82        : 8400-func-cd8-get-mmi                               *
    // *82***************************************************************
    // Added variable to get the program context in place.
    D5427polCtx programCtx = methodIn.getD5427polCtx();
    // Added variable to get the output context in place.
    FunCd8PolplnXrefOutCtx methodOut = methodIn.getFunCd8PolplnXrefOutCtx();
    //  cobolCode::SELECT MNNRP_CD , MNNRP_PCT , UH_PREM_DESG_CD , PRORT_EVNT , PRDCT_PLN_CLSS_CD ,
    // PLN_DED_PRORT_IND , EFF_DT , CANC_DT , OBLIG_ID , SHR_ARNG_CD FROM CUST_POL_PLN_XREF WHERE
    // POL_NBR = ? AND COV_TYP_CD = ? AND PLN_NBR = ? AND CLSS_NBR = ? AND ( ( EFF_DT <= ? AND
    // CANC_DT >= ? ) OR ( EFF_DT <= ? AND CANC_DT >= ? ) ) ORDER BY EFF_DT FETCH FIRST 1 ROWS ONLY
    d5427polRepository.selectCustPolPlnXref6(
        programCtx.getSqlca(), methodOut.getDclcustPolPlnXref());
    //  cobolCode::MOVE SQLCODE TO WS-SQLCODE DSM-SQLCODE
    methodOut.setSqlcode_Ws(methodOut.getSqlcode());
    methodOut.setDsmSqlcode(methodOut.getSqlcode());
    //  cobolCode::EVALUATE TRUE
    if (methodOut.isSqlcodeOk()) {
      //  cobolCode::PERFORM 8310-POPULATE-MXI-RET
      populateMxiRet8310(programCtx.getPopulateMxiRet8310InCtx()); /*8310-POPULATE-MXI-RET SECTION*/
      if (programCtx.isProgramEnded()) {
        return methodOut;
      }
      //  cobolCode::PERFORM 8320-POPULATE-MMI-RET THRU 8320-EXIT
      populateMmiRet8320(programCtx.getPopulateMmiRet8320InCtx()); /*8320-POPULATE-MMI-RET SECTION*/
      if (programCtx.isProgramEnded()) {
        return methodOut;
      }
      //  cobolCode::PERFORM 8400-FUNC-CD8-GET-MMI
      funcCd8GetMmi(programCtx.getFuncCd8GetMmiInCtx()); /*8400-FUNC-CD8-GET-MMI SECTION*/
      if (programCtx.isProgramEnded()) {
        return methodOut;
      }
    } else if (methodOut.isSqlcodeNotFound()) {
      //  cobolCode::PERFORM 8320-POPULATE-MMI-RET THRU 8320-EXIT
      populateMmiRet8320(programCtx.getPopulateMmiRet8320InCtx()); /*8320-POPULATE-MMI-RET SECTION*/
      if (programCtx.isProgramEnded()) {
        return methodOut;
      }
      //  cobolCode::PERFORM 8400-FUNC-CD8-GET-MMI
      funcCd8GetMmi(programCtx.getFuncCd8GetMmiInCtx()); /*8400-FUNC-CD8-GET-MMI SECTION*/
      if (programCtx.isProgramEnded()) {
        return methodOut;
      }
    } else {
      //  cobolCode::SET DSM-DB2-ERROR TO TRUE
      methodOut.setDsmDb2ErrorTrue();

      //  cobolCode::MOVE 'SELECT' TO DSM-ERR-TBL-ACTION
      methodOut.setDsmErrTblAction(CONSTANTS.LITERAL_SELECT_B4_);
      //  cobolCode::MOVE 'CUST_POL_PLN_XREF' TO DSM-ERR-TBL-NAME
      methodOut.setDsmErrTblName(CONSTANTS.LITERAL_CUST_POL_PLN_XREF_B8_);
      //  cobolCode::MOVE '8300-FUN-CD8-POLPLN-XREF' TO DSM-ERR-SECTN-NAME
      methodOut.setDsmErrSectnName(CONSTANTS.LITERAL_1257972461);
      //  cobolCode::MOVE 'D5427POL' TO DSM-ERR-PGM-NAME
      //  LITERAL_D5427POL = 'D5427POL'
      methodOut.setDsmErrPgmName(CONSTANTS.LITERAL_D5427POL);
      //  cobolCode::PERFORM 7777-MOVES-FOR-ERROR-LOG
      movesForErrorLog(programCtx.getMovesForErrorLogInCtx()); /*7777-MOVES-FOR-ERROR-LOG SECTION*/
      if (programCtx.isProgramEnded()) {
        return methodOut;
      }
    }

    return methodOut;
  }
  /**
   * populateMxiRet8310 This method is derived from COBOL Paragraph - 8310-POPULATE-MXI-RET SECTION
   * COBOL Cyclomatic complexity - 7 Input :
   *
   * <p>- xrfPrdctPlnClssCd COBOL Name: XRF-PRDCT-PLN-CLSS-CD - xrfPrortEvnt COBOL Name:
   * XRF-PRORT-EVNT - xrfPlnDedPrortInd COBOL Name: XRF-PLN-DED-PRORT-IND - xrfUhPremDesgCd COBOL
   * Name: XRF-UH-PREM-DESG-CD - xrfMnnrpCd COBOL Name: XRF-MNNRP-CD - xrfMnnrpPct COBOL Name:
   * XRF-MNNRP-PCT - xrfEffDt COBOL Name: XRF-EFF-DT - mxiEffDate COBOL Name: WS-MXI-EFF-DATE -
   * xrfCancDt COBOL Name: XRF-CANC-DT - mxiEndDate COBOL Name: WS-MXI-END-DATE
   *
   * <p>Output :
   *
   * <p>- pol8RetProductInd COBOL Name: POL8-RET-PRODUCT-IND - xrfPrdctPlnClssCd COBOL Name:
   * XRF-PRDCT-PLN-CLSS-CD - pol8RetProrationEvent COBOL Name: POL8-RET-PRORATION-EVENT -
   * xrfPrortEvnt COBOL Name: XRF-PRORT-EVNT - pol8RetProrationInd COBOL Name:
   * POL8-RET-PRORATION-IND - xrfPlnDedPrortInd COBOL Name: XRF-PLN-DED-PRORT-IND -
   * pol8RetUhPremDesgCd COBOL Name: POL8-RET-UH-PREM-DESG-CD - xrfUhPremDesgCd COBOL Name:
   * XRF-UH-PREM-DESG-CD - pol8RetMnnrpInd COBOL Name: POL8-RET-MNNRP-IND - xrfMnnrpCd COBOL Name:
   * XRF-MNNRP-CD - pol8RetMnnrpPct COBOL Name: POL8-RET-MNNRP-PCT - xrfMnnrpPct COBOL Name:
   * XRF-MNNRP-PCT - mxiEffDateCc COBOL Name: WS-MXI-EFF-DATE-CC - xrfEffDt COBOL Name: XRF-EFF-DT -
   * mxiEffDateYy COBOL Name: WS-MXI-EFF-DATE-YY - mxiEffDateMm COBOL Name: WS-MXI-EFF-DATE-MM -
   * mxiEffDateDd COBOL Name: WS-MXI-EFF-DATE-DD - pol8RetMxiEffDate COBOL Name:
   * POL8-RET-MXI-EFF-DATE - mxiEffDate COBOL Name: WS-MXI-EFF-DATE - mxiEndDateCc COBOL Name:
   * WS-MXI-END-DATE-CC - xrfCancDt COBOL Name: XRF-CANC-DT - mxiEndDateYy COBOL Name:
   * WS-MXI-END-DATE-YY - mxiEndDateMm COBOL Name: WS-MXI-END-DATE-MM - mxiEndDateDd COBOL Name:
   * WS-MXI-END-DATE-DD - pol8RetMxiEndDate COBOL Name: POL8-RET-MXI-END-DATE - mxiEndDate COBOL
   * Name: WS-MXI-END-DATE
   *
   * @throws CFException
   */
  @Override
  public PopulateMxiRet8310OutCtx populateMxiRet8310(PopulateMxiRet8310InCtx methodIn)
      throws Exception {

    // *81***************************************************************
    // *81 8310-Populate-mxi-ret.                                       *
    // *81 business function: populate the return fields                *
    // *81***************************************************************
    // *82***************************************************************
    // *82 8310-populate-mxi-ret                                        *
    // *82                                                              *
    // *82 1.populate the return fields                                 *
    // *82***************************************************************
    // Added variable to get the program context in place.
    D5427polCtx programCtx = methodIn.getD5427polCtx();
    // Added variable to get the output context in place.
    PopulateMxiRet8310OutCtx methodOut = methodIn.getPopulateMxiRet8310OutCtx();
    //  cobolCode::MOVE XRF-PRDCT-PLN-CLSS-CD TO POL8-RET-PRODUCT-IND
    methodOut.setPol8RetProductInd(methodOut.getXrfPrdctPlnClssCd());
    //  cobolCode::MOVE XRF-PRORT-EVNT TO POL8-RET-PRORATION-EVENT
    methodOut.setPol8RetProrationEvent(methodOut.getXrfPrortEvnt());
    //  cobolCode::MOVE XRF-PLN-DED-PRORT-IND TO POL8-RET-PRORATION-IND
    methodOut.setPol8RetProrationInd(methodOut.getXrfPlnDedPrortInd());
    //  cobolCode::IF XRF-UH-PREM-DESG-CD NOT = ( LOW-VALUES AND SPACES)
    if ((!(checkLowValue(methodOut.getXrfUhPremDesgCd()))
        && (!allSpaces(methodOut.getXrfUhPremDesgCd())))) {
      //  cobolCode::IF XRF-UH-PREM-DESG-CD = 'N'
      //  LITERAL_N = 'N'
      if (compareChars(methodOut.getXrfUhPremDesgCd(), CONSTANTS.LITERAL_N) == 0) {
        //  cobolCode::MOVE SPACES TO POL8-RET-UH-PREM-DESG-CD
        methodOut.setPol8RetUhPremDesgCd(CONSTANTS.SPACE);
      }
      //  cobolCode::ELSE
      else {
        //  cobolCode::MOVE XRF-UH-PREM-DESG-CD TO POL8-RET-UH-PREM-DESG-CD
        methodOut.setPol8RetUhPremDesgCd(methodOut.getXrfUhPremDesgCd());
      }
    }
    //  cobolCode::IF XRF-MNNRP-CD NOT = SPACES
    if ((!allSpaces(methodOut.getXrfMnnrpCd()))) {
      //  cobolCode::MOVE XRF-MNNRP-CD TO POL8-RET-MNNRP-IND
      methodOut.setPol8RetMnnrpInd(methodOut.getXrfMnnrpCd());
    }
    //  cobolCode::IF XRF-MNNRP-PCT NUMERIC
    if (methodIn.getDclcustPolPlnXref().xrfMnnrpPctIsNumeric()) {
      //  cobolCode::IF XRF-MNNRP-PCT NOT = ZEROS
      if ((methodOut.getXrfMnnrpPct() != 0)) {
        //  cobolCode::MOVE XRF-MNNRP-PCT TO POL8-RET-MNNRP-PCT
        methodOut.setPol8RetMnnrpPct(methodOut.getXrfMnnrpPct());
      }
    }
    //  cobolCode::MOVE XRF-EFF-DT (1 : 2) TO WS-MXI-EFF-DATE-CC
    methodOut.setMxiEffDateCc(CFUtil.getInt(substring(methodOut.getXrfEffDt(), 0, 2)));
    //  cobolCode::MOVE XRF-EFF-DT (3 : 2) TO WS-MXI-EFF-DATE-YY
    methodOut.setMxiEffDateYy(CFUtil.getInt(substring(methodOut.getXrfEffDt(), 2, 4)));
    //  cobolCode::MOVE XRF-EFF-DT (6 : 2) TO WS-MXI-EFF-DATE-MM
    methodOut.setMxiEffDateMm(CFUtil.getInt(substring(methodOut.getXrfEffDt(), 5, 7)));
    //  cobolCode::MOVE XRF-EFF-DT (9 : 2) TO WS-MXI-EFF-DATE-DD
    methodOut.setMxiEffDateDd(CFUtil.getInt(substring(methodOut.getXrfEffDt(), 8, 10)));
    methodOut.setPol8RetMxiEffDate(methodOut.getMxiEffDate().toCharArray());
    //  cobolCode::MOVE XRF-CANC-DT (1 : 2) TO WS-MXI-END-DATE-CC
    methodOut.setMxiEndDateCc(CFUtil.getInt(substring(methodOut.getXrfCancDt(), 0, 2)));
    //  cobolCode::MOVE XRF-CANC-DT (3 : 2) TO WS-MXI-END-DATE-YY
    methodOut.setMxiEndDateYy(CFUtil.getInt(substring(methodOut.getXrfCancDt(), 2, 4)));
    //  cobolCode::MOVE XRF-CANC-DT (6 : 2) TO WS-MXI-END-DATE-MM
    methodOut.setMxiEndDateMm(CFUtil.getInt(substring(methodOut.getXrfCancDt(), 5, 7)));
    //  cobolCode::MOVE XRF-CANC-DT (9 : 2) TO WS-MXI-END-DATE-DD
    methodOut.setMxiEndDateDd(CFUtil.getInt(substring(methodOut.getXrfCancDt(), 8, 10)));
    methodOut.setPol8RetMxiEndDate(methodOut.getMxiEndDate().toCharArray());

    return methodOut;
  }
  /**
   * populateMmiRet8320 This method is derived from COBOL Paragraph - 8320-POPULATE-MMI-RET SECTION
   * COBOL Cyclomatic complexity - 1 Input :
   *
   * <p>- mmiPolNbr COBOL Name: MMI-POL-NBR - mmiPlnNbr COBOL Name: MMI-PLN-NBR - mmiClssNbr COBOL
   * Name: MMI-CLSS-NBR - mmiCovTypCd COBOL Name: MMI-COV-TYP-CD
   *
   * <p>Output :
   *
   * <p>- pol8RetPolicyKey COBOL Name: POL8-RET-POLICY-KEY - mmiPolNbr COBOL Name: MMI-POL-NBR -
   * pol8RetPlanKey COBOL Name: POL8-RET-PLAN-KEY - mmiPlnNbr COBOL Name: MMI-PLN-NBR -
   * pol8RetClassKey COBOL Name: POL8-RET-CLASS-KEY - mmiClssNbr COBOL Name: MMI-CLSS-NBR -
   * pol8RetCovTypKey COBOL Name: POL8-RET-COV-TYP-KEY - mmiCovTypCd COBOL Name: MMI-COV-TYP-CD
   *
   * @throws CFException
   */
  @Override
  public PopulateMmiRet8320OutCtx populateMmiRet8320(PopulateMmiRet8320InCtx methodIn)
      throws Exception {

    // *81***************************************************************
    // *81 8320-Populate-mmi-ret.                                       *
    // *81 business function: populate the return fields                *
    // *81***************************************************************
    // *82***************************************************************
    // *82 8320-populate-mmi-ret                                        *
    // *82                                                              *
    // *82 1.populate the return fields for plan feature query          *
    // *82***************************************************************
    // Added variable to get the program context in place.
    D5427polCtx programCtx = methodIn.getD5427polCtx();
    // Added variable to get the output context in place.
    PopulateMmiRet8320OutCtx methodOut = methodIn.getPopulateMmiRet8320OutCtx();
    //  cobolCode::MOVE MMI-POL-NBR TO POL8-RET-POLICY-KEY
    methodOut.setPol8RetPolicyKey(methodOut.getMmiPolNbr());
    //  cobolCode::MOVE MMI-PLN-NBR TO POL8-RET-PLAN-KEY
    methodOut.setPol8RetPlanKey(methodOut.getMmiPlnNbr());
    //  cobolCode::MOVE MMI-CLSS-NBR TO POL8-RET-CLASS-KEY
    methodOut.setPol8RetClassKey(methodOut.getMmiClssNbr());
    //  cobolCode::MOVE MMI-COV-TYP-CD TO POL8-RET-COV-TYP-KEY
    methodOut.setPol8RetCovTypKey(methodOut.getMmiCovTypCd());

    return methodOut;
  }
  /**
   * funcCd8GetMmi This method is derived from COBOL Paragraph - 8400-FUNC-CD8-GET-MMI SECTION COBOL
   * Cyclomatic complexity - 5 Input :
   *
   * <p>- sqlcode COBOL Name: SQLCODE
   *
   * <p>Output :
   *
   * <p>- sqlcode_Ws COBOL Name: WS-SQLCODE - dsmSqlcode COBOL Name: DSM-SQLCODE - sqlcode COBOL
   * Name: SQLCODE - dsmReturnCode COBOL Name: DSM-RETURN-CODE - dsmErrTblAction COBOL Name:
   * DSM-ERR-TBL-ACTION - dsmErrTblName COBOL Name: DSM-ERR-TBL-NAME - dsmErrSectnName COBOL Name:
   * DSM-ERR-SECTN-NAME - dsmErrPgmName COBOL Name: DSM-ERR-PGM-NAME
   *
   * @throws CFException
   */
  @Override
  public FuncCd8GetMmiOutCtx funcCd8GetMmi(FuncCd8GetMmiInCtx methodIn) throws Exception {

    // *81***************************************************************
    // *81 8400-Func-cd8-get-mmi.                                       *
    // *81 business function: read the records from table               *
    // *81 main processing.                                             *
    // *81***************************************************************
    // *82***************************************************************
    // *82 8400-func-cd8-get-mmi                                        *
    // *82                                                              *
    // *82 1. read records from pol_pln_mstr for given policy/plan if   *
    // *82    record not found in cust_pol_pln_xref table               *
    // *82***************************************************************
    // Added variable to get the program context in place.
    D5427polCtx programCtx = methodIn.getD5427polCtx();
    // Added variable to get the output context in place.
    FuncCd8GetMmiOutCtx methodOut = methodIn.getFuncCd8GetMmiOutCtx();
    //  cobolCode::SELECT MNRP_CD , MNRP_PCT , NON_EMBD_DED_CD , UHP_CD , PRORT_EVNT_TYP_CD ,
    // MBR_NTWK_KEY_MTCH_CD , LFTM_MAX_AMT , TIER_1_LFTM_MAX_AMT , OOP_COMB_NBR_CD ,
    // PSY_LFTM_CNFM_MAX_AMT , PSY_LFTM_NON_CNFM_MAX_AMT , PSY_LFTM_COMB_PRSC_MAX_AMT ,
    // PSY_CYR_CNFM_MAX_AMT , PSY_CYR_NON_CNFM_MAX_AMT , PSY_CYR_COMB_PRSC_MAX_AMT , DSES_ST_TBL_NBR
    // , HI_DED_PLN_CD , PRORT_INTRVL_FREQ_CD , RCPRCTY_TBL_ID , OOP_MAX_COV_CD , PLN_FTUR_IND ,
    // OON_LFTM_MAX_AMT , POL.OBLIG_ID , SHR_ARNG_CD , NHP_NTWK_FLEX_IND , NPT_RULE_PKG_ID ,
    // POL.PRDCT_KEY_CD , PREF_LAB_NTWK_IND , CONTR_ST_CD , FUND_TYP_CD , FACL_SHR_SV_CD ,
    // PHYSN_SHR_SV_CD , PHRM_CPN_IND , DESG_DIAG_PROV_CD , MED_CPN_CD FROM POL_PLN_MSTR POL ,
    // POL_PLN_MSTR_ADDTL_INFO POLA WHERE POL.POL_NBR = ? AND POL.PLN_NBR = ? AND POL.CLSS_NBR = ?
    // AND POL.COV_TYP_CD = ? AND POLA.POL_NBR = POL.POL_NBR AND POLA.PLN_NBR = POL.PLN_NBR AND
    // POLA.CLSS_NBR = POL.CLSS_NBR AND POLA.COV_TYP_CD = POL.COV_TYP_CD
    d5427polRepository.selectPolPlnMstr7(
        methodOut.getDclpolPlnMstrAddtlInfo(), methodOut.getDclpolPlnMstr(), programCtx.getSqlca());
    //  cobolCode::MOVE SQLCODE TO WS-SQLCODE DSM-SQLCODE
    methodOut.setSqlcode_Ws(methodOut.getSqlcode());
    methodOut.setDsmSqlcode(methodOut.getSqlcode());
    //  cobolCode::EVALUATE TRUE
    if (methodOut.isSqlcodeOk()) {
      //  cobolCode::PERFORM 8410-POPULATE-MMI-RET
      populateMmiRet8410(programCtx.getPopulateMmiRet8410InCtx()); /*8410-POPULATE-MMI-RET SECTION*/
      if (programCtx.isProgramEnded()) {
        return methodOut;
      }
    } else if (methodOut.isSqlcodeNotFound()) {
      //  cobolCode::SET DSM-ENTRY-NOT-FND-INQ TO TRUE
      methodOut.setDsmEntryNotFndInqTrue();

      //  cobolCode::MOVE 'SELECT' TO DSM-ERR-TBL-ACTION
      methodOut.setDsmErrTblAction(CONSTANTS.LITERAL_SELECT_B4_);
      //  cobolCode::MOVE 'POL_PLN_MSTR' TO DSM-ERR-TBL-NAME
      methodOut.setDsmErrTblName(CONSTANTS.LITERAL_POL_PLN_MSTR_B13_);
      //  cobolCode::MOVE '8400-FUNC-CD8-GET-MMI' TO DSM-ERR-SECTN-NAME
      methodOut.setDsmErrSectnName(CONSTANTS.LITERAL_1611384708);
      //  cobolCode::MOVE 'D5427POL' TO DSM-ERR-PGM-NAME
      //  LITERAL_D5427POL = 'D5427POL'
      methodOut.setDsmErrPgmName(CONSTANTS.LITERAL_D5427POL);
      //  cobolCode::PERFORM 7777-MOVES-FOR-ERROR-LOG
      movesForErrorLog(programCtx.getMovesForErrorLogInCtx()); /*7777-MOVES-FOR-ERROR-LOG SECTION*/
      if (programCtx.isProgramEnded()) {
        return methodOut;
      }
    } else {
      //  cobolCode::SET DSM-DB2-ERROR TO TRUE
      methodOut.setDsmDb2ErrorTrue();

      //  cobolCode::MOVE 'SELECT' TO DSM-ERR-TBL-ACTION
      methodOut.setDsmErrTblAction(CONSTANTS.LITERAL_SELECT_B4_);
      //  cobolCode::MOVE 'POL_PLN_MSTR' TO DSM-ERR-TBL-NAME
      methodOut.setDsmErrTblName(CONSTANTS.LITERAL_POL_PLN_MSTR_B13_);
      //  cobolCode::MOVE 'D5427POL' TO DSM-ERR-PGM-NAME
      //  LITERAL_D5427POL = 'D5427POL'
      methodOut.setDsmErrPgmName(CONSTANTS.LITERAL_D5427POL);
      //  cobolCode::PERFORM 7777-MOVES-FOR-ERROR-LOG
      movesForErrorLog(programCtx.getMovesForErrorLogInCtx()); /*7777-MOVES-FOR-ERROR-LOG SECTION*/
      if (programCtx.isProgramEnded()) {
        return methodOut;
      }
    }

    return methodOut;
  }
  /**
   * populateMmiRet8410 This method is derived from COBOL Paragraph - 8410-POPULATE-MMI-RET SECTION
   * COBOL Cyclomatic complexity - 35 Input :
   *
   * <p>- xrfPrortEvnt COBOL Name: XRF-PRORT-EVNT - mmiPrortEvntTypCd COBOL Name:
   * MMI-PRORT-EVNT-TYP-CD - xrfUhPremDesgCd COBOL Name: XRF-UH-PREM-DESG-CD - mmiUhpCd COBOL Name:
   * MMI-UHP-CD - xrfMnnrpCd COBOL Name: XRF-MNNRP-CD - mmiMnrpCd COBOL Name: MMI-MNRP-CD -
   * xrfMnnrpPct COBOL Name: XRF-MNNRP-PCT - mmiMnrpPct COBOL Name: MMI-MNRP-PCT - xrfPlnDedPrortInd
   * COBOL Name: XRF-PLN-DED-PRORT-IND - mmiPrortIntrvlFreqCd COBOL Name: MMI-PRORT-INTRVL-FREQ-CD -
   * mmiNonEmbdDedCd COBOL Name: MMI-NON-EMBD-DED-CD - mmiLftmMaxAmt COBOL Name: MMI-LFTM-MAX-AMT -
   * mmiTier1LftmMaxAmt COBOL Name: MMI-TIER-1-LFTM-MAX-AMT - mmiOopCombNbrCd COBOL Name:
   * MMI-OOP-COMB-NBR-CD - mmiPsyLftmCnfmMaxAmt COBOL Name: MMI-PSY-LFTM-CNFM-MAX-AMT -
   * mmiPsyLftmNonCnfmMaxAmt COBOL Name: MMI-PSY-LFTM-NON-CNFM-MAX-AMT - mmiPsyLftmCombPrscMaxAmt
   * COBOL Name: MMI-PSY-LFTM-COMB-PRSC-MAX-AMT - mmiPsyCyrCnfmMaxAmt COBOL Name:
   * MMI-PSY-CYR-CNFM-MAX-AMT - mmiPsyCyrNonCnfmMaxAmt COBOL Name: MMI-PSY-CYR-NON-CNFM-MAX-AMT -
   * mmiPsyCyrCombPrscMaxAmt COBOL Name: MMI-PSY-CYR-COMB-PRSC-MAX-AMT - mmiMbrNtwkKeyMtchCd COBOL
   * Name: MMI-MBR-NTWK-KEY-MTCH-CD - mmiDsesStTblNbr COBOL Name: MMI-DSES-ST-TBL-NBR -
   * mmiHiDedPlnCd COBOL Name: MMI-HI-DED-PLN-CD - mmiContrStCd COBOL Name: MMI-CONTR-ST-CD -
   * mmaPhrmCpnInd COBOL Name: MMA-PHRM-CPN-IND - mmaMedCpnCd COBOL Name: MMA-MED-CPN-CD -
   * mmiFundTypCd COBOL Name: MMI-FUND-TYP-CD - mmiOopMaxCovCd COBOL Name: MMI-OOP-MAX-COV-CD -
   * mmiPlnFturInd COBOL Name: MMI-PLN-FTUR-IND - mmiRcprctyTblId COBOL Name: MMI-RCPRCTY-TBL-ID -
   * mmiOonLftmMaxAmt COBOL Name: MMI-OON-LFTM-MAX-AMT - xrfObligId COBOL Name: XRF-OBLIG-ID -
   * mmiObligId COBOL Name: MMI-OBLIG-ID - mmaNhpNtwkFlexInd COBOL Name: MMA-NHP-NTWK-FLEX-IND -
   * mmaNptRulePkgId COBOL Name: MMA-NPT-RULE-PKG-ID - mmiPrdctKeyCd COBOL Name: MMI-PRDCT-KEY-CD -
   * mmaPrefLabNtwkInd COBOL Name: MMA-PREF-LAB-NTWK-IND - mmaDesgDiagProvCd COBOL Name:
   * MMA-DESG-DIAG-PROV-CD - mmiFaclShrSvCd COBOL Name: MMI-FACL-SHR-SV-CD - mmiPhysnShrSvCd COBOL
   * Name: MMI-PHYSN-SHR-SV-CD
   *
   * <p>Output :
   *
   * <p>- pol8RetProrationEvent COBOL Name: POL8-RET-PRORATION-EVENT - mmiPrortEvntTypCd COBOL Name:
   * MMI-PRORT-EVNT-TYP-CD - pol8RetUhPremDesgCd COBOL Name: POL8-RET-UH-PREM-DESG-CD - mmiUhpCd
   * COBOL Name: MMI-UHP-CD - pol8RetMnnrpInd COBOL Name: POL8-RET-MNNRP-IND - mmiMnrpCd COBOL Name:
   * MMI-MNRP-CD - pol8RetMnnrpPct COBOL Name: POL8-RET-MNNRP-PCT - mmiMnrpPct COBOL Name:
   * MMI-MNRP-PCT - pol8RetProrationInd COBOL Name: POL8-RET-PRORATION-IND - mmiPrortIntrvlFreqCd
   * COBOL Name: MMI-PRORT-INTRVL-FREQ-CD - pol8RetNonEmb COBOL Name: POL8-RET-NON-EMB -
   * mmiNonEmbdDedCd COBOL Name: MMI-NON-EMBD-DED-CD - pol8RetLftmMaxAmt COBOL Name:
   * POL8-RET-LFTM-MAX-AMT - mmiLftmMaxAmt COBOL Name: MMI-LFTM-MAX-AMT - pol8RetTier1LftmMaxAmt
   * COBOL Name: POL8-RET-TIER-1-LFTM-MAX-AMT - mmiTier1LftmMaxAmt COBOL Name:
   * MMI-TIER-1-LFTM-MAX-AMT - pol8RetDualOopNbrInd COBOL Name: POL8-RET-DUAL-OOP-NBR-IND -
   * mmiOopCombNbrCd COBOL Name: MMI-OOP-COMB-NBR-CD - pol8RetPsyLftmCnfmMaxAmt COBOL Name:
   * POL8-RET-PSY-LFTM-CNFM-MAX-AMT - mmiPsyLftmCnfmMaxAmt COBOL Name: MMI-PSY-LFTM-CNFM-MAX-AMT -
   * pol8PsyLftmNonCnfmMaxAmt COBOL Name: POL8-PSY-LFTM-NON-CNFM-MAX-AMT - mmiPsyLftmNonCnfmMaxAmt
   * COBOL Name: MMI-PSY-LFTM-NON-CNFM-MAX-AMT - pol8PsyLftmCombPrscMxAmt COBOL Name:
   * POL8-PSY-LFTM-COMB-PRSC-MX-AMT - mmiPsyLftmCombPrscMaxAmt COBOL Name:
   * MMI-PSY-LFTM-COMB-PRSC-MAX-AMT - pol8RetPsyCyrCnfmMaxAmt COBOL Name:
   * POL8-RET-PSY-CYR-CNFM-MAX-AMT - mmiPsyCyrCnfmMaxAmt COBOL Name: MMI-PSY-CYR-CNFM-MAX-AMT -
   * pol8PsyCyrNonCnfmMaxAmt COBOL Name: POL8-PSY-CYR-NON-CNFM-MAX-AMT - mmiPsyCyrNonCnfmMaxAmt
   * COBOL Name: MMI-PSY-CYR-NON-CNFM-MAX-AMT - pol8PsyCyrCombPrscMaxAmt COBOL Name:
   * POL8-PSY-CYR-COMB-PRSC-MAX-AMT - mmiPsyCyrCombPrscMaxAmt COBOL Name:
   * MMI-PSY-CYR-COMB-PRSC-MAX-AMT - pol8RetMbrNtwkKeyMtchCd COBOL Name:
   * POL8-RET-MBR-NTWK-KEY-MTCH-CD - mmiMbrNtwkKeyMtchCd COBOL Name: MMI-MBR-NTWK-KEY-MTCH-CD -
   * pol8RetDsesStTblNbr COBOL Name: POL8-RET-DSES-ST-TBL-NBR - mmiDsesStTblNbr COBOL Name:
   * MMI-DSES-ST-TBL-NBR - pol8RetPlnAttr COBOL Name: POL8-RET-PLN-ATTR - mmiHiDedPlnCd COBOL Name:
   * MMI-HI-DED-PLN-CD - pol8RetContractState COBOL Name: POL8-RET-CONTRACT-STATE - mmiContrStCd
   * COBOL Name: MMI-CONTR-ST-CD - pol8RetPhrmCpnInd COBOL Name: POL8-RET-PHRM-CPN-IND -
   * mmaPhrmCpnInd COBOL Name: MMA-PHRM-CPN-IND - pol8RetMedCpnCd COBOL Name: POL8-RET-MED-CPN-CD -
   * mmaMedCpnCd COBOL Name: MMA-MED-CPN-CD - pol8RetFundTypCd COBOL Name: POL8-RET-FUND-TYP-CD -
   * mmiFundTypCd COBOL Name: MMI-FUND-TYP-CD - pol8RetOopMaxCovCd COBOL Name:
   * POL8-RET-OOP-MAX-COV-CD - mmiOopMaxCovCd COBOL Name: MMI-OOP-MAX-COV-CD - pol8RetPlnFturInd
   * COBOL Name: POL8-RET-PLN-FTUR-IND - mmiPlnFturInd COBOL Name: MMI-PLN-FTUR-IND -
   * pol8RetTciTableNumber COBOL Name: POL8-RET-TCI-TABLE-NUMBER - mmiRcprctyTblId COBOL Name:
   * MMI-RCPRCTY-TBL-ID - pol8RetOonLftmMaxAmt COBOL Name: POL8-RET-OON-LFTM-MAX-AMT -
   * mmiOonLftmMaxAmt COBOL Name: MMI-OON-LFTM-MAX-AMT - obligId COBOL Name: WS-OBLIG-ID -
   * mmiObligId COBOL Name: MMI-OBLIG-ID - xrfObligId COBOL Name: XRF-OBLIG-ID - pol8NhpNtwkFlexInd
   * COBOL Name: POL8-NHP-NTWK-FLEX-IND - mmaNhpNtwkFlexInd COBOL Name: MMA-NHP-NTWK-FLEX-IND -
   * pol8NptRulePkgId COBOL Name: POL8-NPT-RULE-PKG-ID - mmaNptRulePkgId COBOL Name:
   * MMA-NPT-RULE-PKG-ID - pol8RetProductCd COBOL Name: POL8-RET-PRODUCT-CD - topsPrdctCdSw COBOL
   * Name: WS-TOPS-PRDCT-CD-SW - mmiPrdctKeyCd COBOL Name: MMI-PRDCT-KEY-CD - pol8PrefLabNtwkInd
   * COBOL Name: POL8-PREF-LAB-NTWK-IND - mmaPrefLabNtwkInd COBOL Name: MMA-PREF-LAB-NTWK-IND -
   * pol8DesgDiagProvCd COBOL Name: POL8-DESG-DIAG-PROV-CD - mmaDesgDiagProvCd COBOL Name:
   * MMA-DESG-DIAG-PROV-CD - pol8RetFaclShrSvCd COBOL Name: POL8-RET-FACL-SHR-SV-CD - mmiFaclShrSvCd
   * COBOL Name: MMI-FACL-SHR-SV-CD - pol8RetPhysnShrSvCd COBOL Name: POL8-RET-PHYSN-SHR-SV-CD -
   * mmiPhysnShrSvCd COBOL Name: MMI-PHYSN-SHR-SV-CD
   *
   * @throws CFException
   */
  @Override
  public PopulateMmiRet8410OutCtx populateMmiRet8410(PopulateMmiRet8410InCtx methodIn)
      throws Exception {

    // *82***************************************************************
    // Added variable to get the program context in place.
    D5427polCtx programCtx = methodIn.getD5427polCtx();
    // Added variable to get the output context in place.
    PopulateMmiRet8410OutCtx methodOut = methodIn.getPopulateMmiRet8410OutCtx();
    //  cobolCode::IF XRF-PRORT-EVNT = SPACES OR LOW-VALUES OR '-'
    if ((allSpaces(methodIn.getXrfPrortEvnt()))
        || (checkLowValue(methodIn.getXrfPrortEvnt()))
        || methodIn.getXrfPrortEvnt()[0] == '-') {
      //  cobolCode::MOVE MMI-PRORT-EVNT-TYP-CD TO POL8-RET-PRORATION-EVENT
      methodOut.setPol8RetProrationEvent(methodOut.getMmiPrortEvntTypCd());
    }
    //  cobolCode::IF XRF-UH-PREM-DESG-CD = SPACES OR LOW-VALUES
    if ((allSpaces(methodIn.getXrfUhPremDesgCd()))
        || (checkLowValue(methodIn.getXrfUhPremDesgCd()))) {
      //  cobolCode::IF MMI-UHP-CD NOT = ZEROES
      if (!(allZeros(methodOut.getMmiUhpCd())) /*  !=  zeros*/) {
        //  cobolCode::MOVE MMI-UHP-CD TO POL8-RET-UH-PREM-DESG-CD
        methodOut.setPol8RetUhPremDesgCd(methodOut.getMmiUhpCd());
      }
    }
    //  cobolCode::IF XRF-MNNRP-CD = SPACES OR LOW-VALUES
    if ((allSpaces(methodIn.getXrfMnnrpCd())) || (checkLowValue(methodIn.getXrfMnnrpCd()))) {
      //  cobolCode::MOVE MMI-MNRP-CD TO POL8-RET-MNNRP-IND
      methodOut.setPol8RetMnnrpInd(methodOut.getMmiMnrpCd());
    }
    //  cobolCode::IF XRF-MNNRP-PCT NOT NUMERIC OR XRF-MNNRP-PCT = ZEROS
    if (!(methodIn.getDclcustPolPlnXref().xrfMnnrpPctIsNumeric())
        || (methodIn.getXrfMnnrpPct() == 0)) {
      //  cobolCode::MOVE MMI-MNRP-PCT TO POL8-RET-MNNRP-PCT
      methodOut.setPol8RetMnnrpPct(methodOut.getMmiMnrpPct());
    }
    //  cobolCode::IF XRF-PLN-DED-PRORT-IND = SPACES OR LOW-VALUES OR '-'
    if ((allSpaces(methodIn.getXrfPlnDedPrortInd()))
        || (checkLowValue(methodIn.getXrfPlnDedPrortInd()))
        || methodIn.getXrfPlnDedPrortInd()[0] == '-') {
      //  cobolCode::MOVE MMI-PRORT-INTRVL-FREQ-CD TO POL8-RET-PRORATION-IND
      methodOut.setPol8RetProrationInd(methodOut.getMmiPrortIntrvlFreqCd());
    }
    //  cobolCode::MOVE MMI-NON-EMBD-DED-CD TO POL8-RET-NON-EMB
    methodOut.setPol8RetNonEmb(methodOut.getMmiNonEmbdDedCd());
    methodOut.setPol8RetLftmMaxAmt(methodOut.getMmiLftmMaxAmt());
    methodOut.setPol8RetTier1LftmMaxAmt(methodOut.getMmiTier1LftmMaxAmt());
    //  cobolCode::MOVE MMI-OOP-COMB-NBR-CD TO POL8-RET-DUAL-OOP-NBR-IND
    methodOut.setPol8RetDualOopNbrInd(methodOut.getMmiOopCombNbrCd());
    methodOut.setPol8RetPsyLftmCnfmMaxAmt(methodOut.getMmiPsyLftmCnfmMaxAmt());
    methodOut.setPol8PsyLftmNonCnfmMaxAmt(methodOut.getMmiPsyLftmNonCnfmMaxAmt());
    methodOut.setPol8PsyLftmCombPrscMxAmt(methodOut.getMmiPsyLftmCombPrscMaxAmt());
    methodOut.setPol8RetPsyCyrCnfmMaxAmt(methodOut.getMmiPsyCyrCnfmMaxAmt());
    methodOut.setPol8PsyCyrNonCnfmMaxAmt(methodOut.getMmiPsyCyrNonCnfmMaxAmt());
    methodOut.setPol8PsyCyrCombPrscMaxAmt(methodOut.getMmiPsyCyrCombPrscMaxAmt());
    //  cobolCode::MOVE MMI-MBR-NTWK-KEY-MTCH-CD TO POL8-RET-MBR-NTWK-KEY-MTCH-CD
    methodOut.setPol8RetMbrNtwkKeyMtchCd(methodOut.getMmiMbrNtwkKeyMtchCd());
    //  cobolCode::MOVE MMI-DSES-ST-TBL-NBR TO POL8-RET-DSES-ST-TBL-NBR
    methodOut.setPol8RetDsesStTblNbr(methodOut.getMmiDsesStTblNbr());
    //  cobolCode::MOVE MMI-HI-DED-PLN-CD TO POL8-RET-PLN-ATTR
    methodOut.setPol8RetPlnAttr(methodOut.getMmiHiDedPlnCd());
    //  cobolCode::MOVE MMI-CONTR-ST-CD TO POL8-RET-CONTRACT-STATE
    methodOut.setPol8RetContractState(methodOut.getMmiContrStCd());
    //  cobolCode::MOVE MMA-PHRM-CPN-IND TO POL8-RET-PHRM-CPN-IND
    methodOut.setPol8RetPhrmCpnInd(methodOut.getMmaPhrmCpnInd());
    //  cobolCode::MOVE MMA-MED-CPN-CD TO POL8-RET-MED-CPN-CD
    methodOut.setPol8RetMedCpnCd(methodOut.getMmaMedCpnCd());
    //  cobolCode::MOVE MMI-FUND-TYP-CD TO POL8-RET-FUND-TYP-CD
    methodOut.setPol8RetFundTypCd(methodOut.getMmiFundTypCd());

    // *** Oop maximum indicator for func-cd "08"
    //  cobolCode::MOVE MMI-OOP-MAX-COV-CD TO POL8-RET-OOP-MAX-COV-CD
    methodOut.setPol8RetOopMaxCovCd(methodOut.getMmiOopMaxCovCd());
    //  cobolCode::MOVE MMI-PLN-FTUR-IND TO POL8-RET-PLN-FTUR-IND
    methodOut.setPol8RetPlnFturInd(methodOut.getMmiPlnFturInd());
    //  cobolCode::MOVE MMI-RCPRCTY-TBL-ID TO POL8-RET-TCI-TABLE-NUMBER
    methodOut.setPol8RetTciTableNumber(methodOut.getMmiRcprctyTblId());

    // *** Oon lifetime maximum amount

    // *** Oon lifetime maximum amount
    methodOut.setPol8RetOonLftmMaxAmt(methodOut.getMmiOonLftmMaxAmt());
    //  cobolCode::IF XRF-OBLIG-ID = SPACES OR LOW-VALUES OR HIGH-VALUES
    if ((allSpaces(methodOut.getXrfObligId()))
        || (checkLowValue(methodOut.getXrfObligId()))
        || (isHighValue(methodOut.getXrfObligId()))) {
      //  cobolCode::IF MMI-OBLIG-ID = SPACES OR LOW-VALUES OR HIGH-VALUES
      if ((allSpaces(methodOut.getMmiObligId()))
          || (checkLowValue(methodOut.getMmiObligId()))
          || (isHighValue(methodOut.getMmiObligId()))) {
        //  cobolCode::MOVE SPACES TO WS-OBLIG-ID
        methodOut.setObligId(CONSTANTS.SPACE_2);
      }
      //  cobolCode::ELSE
      else {
        //  cobolCode::MOVE MMI-OBLIG-ID TO WS-OBLIG-ID
        methodOut.setObligId(methodOut.getMmiObligId());
      }
    }
    //  cobolCode::ELSE
    else {
      //  cobolCode::MOVE XRF-OBLIG-ID TO WS-OBLIG-ID
      methodOut.setObligId(methodOut.getXrfObligId());
    }
    //  cobolCode::IF MMA-NHP-NTWK-FLEX-IND = SPACES OR LOW-VALUE OR HIGH-VALUE
    if ((allSpaces(methodOut.getMmaNhpNtwkFlexInd()))
        || (checkLowValue(methodOut.getMmaNhpNtwkFlexInd()))
        || (isHighValue(methodOut.getMmaNhpNtwkFlexInd()))) {
      //  cobolCode::MOVE SPACE TO POL8-NHP-NTWK-FLEX-IND
      methodOut.setPol8NhpNtwkFlexInd(CONSTANTS.SPACE);
    }
    //  cobolCode::ELSE
    else {
      //  cobolCode::MOVE MMA-NHP-NTWK-FLEX-IND TO POL8-NHP-NTWK-FLEX-IND
      methodOut.setPol8NhpNtwkFlexInd(methodOut.getMmaNhpNtwkFlexInd());
    }
    //  cobolCode::IF MMA-NPT-RULE-PKG-ID = SPACES OR LOW-VALUE OR HIGH-VALUE
    if ((allSpaces(methodOut.getMmaNptRulePkgId()))
        || (checkLowValue(methodOut.getMmaNptRulePkgId()))
        || (isHighValue(methodOut.getMmaNptRulePkgId()))) {
      //  cobolCode::MOVE SPACES TO POL8-NPT-RULE-PKG-ID
      methodOut.setPol8NptRulePkgId(CONSTANTS.SPACE_6);
    }
    //  cobolCode::ELSE
    else {
      //  cobolCode::MOVE MMA-NPT-RULE-PKG-ID TO POL8-NPT-RULE-PKG-ID
      methodOut.setPol8NptRulePkgId(methodOut.getMmaNptRulePkgId());
    }
    //  cobolCode::IF MMI-PRDCT-KEY-CD = SPACES OR LOW-VALUE OR HIGH-VALUE
    if ((allSpaces(methodOut.getMmiPrdctKeyCd()))
        || (checkLowValue(methodOut.getMmiPrdctKeyCd()))
        || (isHighValue(methodOut.getMmiPrdctKeyCd()))) {
      //  cobolCode::MOVE SPACE TO POL8-RET-PRODUCT-CD
      methodOut.setPol8RetProductCd(CONSTANTS.SPACE_3);
    }
    //  cobolCode::ELSE
    else {
      //  cobolCode::SET TOPS-PRDCT-CD-PRESENT TO TRUE
      methodOut.setTopsPrdctCdPresentTrue();

      //  cobolCode::MOVE MMI-PRDCT-KEY-CD TO POL8-RET-PRODUCT-CD
      methodOut.setPol8RetProductCd(methodOut.getMmiPrdctKeyCd());
    }
    //  cobolCode::IF MMA-PREF-LAB-NTWK-IND = SPACES OR LOW-VALUE OR HIGH-VALUE
    if ((allSpaces(methodOut.getMmaPrefLabNtwkInd()))
        || (checkLowValue(methodOut.getMmaPrefLabNtwkInd()))
        || (isHighValue(methodOut.getMmaPrefLabNtwkInd()))) {
      //  cobolCode::MOVE SPACES TO POL8-PREF-LAB-NTWK-IND
      methodOut.setPol8PrefLabNtwkInd(CONSTANTS.SPACE_6);
    }
    //  cobolCode::ELSE
    else {
      //  cobolCode::MOVE MMA-PREF-LAB-NTWK-IND TO POL8-PREF-LAB-NTWK-IND
      methodOut.setPol8PrefLabNtwkInd(methodOut.getMmaPrefLabNtwkInd());
    }
    //  cobolCode::IF MMA-DESG-DIAG-PROV-CD = SPACES OR LOW-VALUE OR HIGH-VALUE
    if ((allSpaces(methodOut.getMmaDesgDiagProvCd()))
        || (checkLowValue(methodOut.getMmaDesgDiagProvCd()))
        || (isHighValue(methodOut.getMmaDesgDiagProvCd()))) {
      //  cobolCode::MOVE SPACES TO POL8-DESG-DIAG-PROV-CD
      methodOut.setPol8DesgDiagProvCd(CONSTANTS.SPACE);
    }
    //  cobolCode::ELSE
    else {
      //  cobolCode::MOVE MMA-DESG-DIAG-PROV-CD TO POL8-DESG-DIAG-PROV-CD
      methodOut.setPol8DesgDiagProvCd(methodOut.getMmaDesgDiagProvCd());
    }
    //  cobolCode::MOVE MMI-FACL-SHR-SV-CD TO POL8-RET-FACL-SHR-SV-CD
    methodOut.setPol8RetFaclShrSvCd(methodOut.getMmiFaclShrSvCd());
    //  cobolCode::MOVE MMI-PHYSN-SHR-SV-CD TO POL8-RET-PHYSN-SHR-SV-CD
    methodOut.setPol8RetPhysnShrSvCd(methodOut.getMmiPhysnShrSvCd());

    return methodOut;
  }
  /**
   * rcprctySelect8500 This method is derived from COBOL Paragraph - 8500-RCPRCTY-SELECT SECTION
   * COBOL Cyclomatic complexity - 13 Input :
   *
   * <p>- sqlcode COBOL Name: SQLCODE - dtlPrefCd COBOL Name: DTL-PREF-CD - dtlRvrsTierInd COBOL
   * Name: DTL-RVRS-TIER-IND
   *
   * <p>Output :
   *
   * <p>- sqlcode_Ws COBOL Name: WS-SQLCODE - dsmSqlcode COBOL Name: DSM-SQLCODE - sqlcode COBOL
   * Name: SQLCODE - pol8RetPrefNtwkCd COBOL Name: POL8-RET-PREF-NTWK-CD - dtlPrefCd COBOL Name:
   * DTL-PREF-CD - pol8RetReverseTieredInd COBOL Name: POL8-RET-REVERSE-TIERED-IND - dsmReturnCode
   * COBOL Name: DSM-RETURN-CODE - dsmErrTblAction COBOL Name: DSM-ERR-TBL-ACTION - dsmErrTblName
   * COBOL Name: DSM-ERR-TBL-NAME - dsmErrSectnName COBOL Name: DSM-ERR-SECTN-NAME - dsmErrPgmName
   * COBOL Name: DSM-ERR-PGM-NAME - dtlRvrsTierInd COBOL Name: DTL-RVRS-TIER-IND -
   * pol8RetContrBaseTierCd COBOL Name: POL8-RET-CONTR-BASE-TIER-CD
   *
   * @throws CFException
   */
  @Override
  public RcprctySelect8500OutCtx rcprctySelect8500(RcprctySelect8500InCtx methodIn)
      throws Exception {

    // *82***************************************************************
    // Added variable to get the program context in place.
    D5427polCtx programCtx = methodIn.getD5427polCtx();
    // Added variable to get the output context in place.
    RcprctySelect8500OutCtx methodOut = methodIn.getRcprctySelect8500OutCtx();
    //  cobolCode::SELECT PREF_CD FROM NTWK_RCPRCTY_DTL A WHERE RCPRCTY_TBL_ID = ? AND PREF_CD > ' '
    // FETCH FIRST 1 ROWS ONLY
    d5427polRepository.selectNtwkRcprctyDtl1(
        methodIn.getDclpolPlnMstr(), methodOut.getDclntwkRcprctyDtl(), programCtx.getSqlca());
    //  cobolCode::MOVE SQLCODE TO WS-SQLCODE DSM-SQLCODE
    methodOut.setSqlcode_Ws(methodOut.getSqlcode());
    methodOut.setDsmSqlcode(methodOut.getSqlcode());
    //  cobolCode::EVALUATE TRUE
    if (methodOut.isSqlcodeOk()) {
      //  cobolCode::MOVE DTL-PREF-CD TO POL8-RET-PREF-NTWK-CD
      methodOut.setPol8RetPrefNtwkCd(methodOut.getDtlPrefCd());
    } else if (methodOut.isSqlcodeNotFound()) {
      //  cobolCode::MOVE SPACE TO POL8-RET-PREF-NTWK-CD
      methodOut.setPol8RetPrefNtwkCd(CONSTANTS.SPACE);
      //  cobolCode::MOVE 'N' TO POL8-RET-REVERSE-TIERED-IND
      //  LITERAL_N = 'N'
      methodOut.setPol8RetReverseTieredInd(CONSTANTS.LITERAL_N);
      // cobolCode::GO TO 8500-EXIT
      return methodOut;
      // cobolCodeEnds::GO TO 8500-EXIT
    } else {
      //  cobolCode::SET DSM-DB2-ERROR TO TRUE
      methodOut.setDsmDb2ErrorTrue();

      //  cobolCode::MOVE 'FETCH' TO DSM-ERR-TBL-ACTION
      methodOut.setDsmErrTblAction(CONSTANTS.LITERAL_FETCH_B5_);
      //  cobolCode::MOVE 'CUR-RCPRCTY-CSR' TO DSM-ERR-TBL-NAME
      methodOut.setDsmErrTblName(CONSTANTS.LITERAL_CUR_MN2_RCPRCTYCSR_B10_);
      //  cobolCode::MOVE '8500-FETCH-CUR-RCPRCTY-CSR' TO DSM-ERR-SECTN-NAME
      methodOut.setDsmErrSectnName(CONSTANTS.LITERAL_2023718362);
      //  cobolCode::MOVE 'D5427POL' TO DSM-ERR-PGM-NAME
      //  LITERAL_D5427POL = 'D5427POL'
      methodOut.setDsmErrPgmName(CONSTANTS.LITERAL_D5427POL);
      //  cobolCode::PERFORM 7777-MOVES-FOR-ERROR-LOG
      movesForErrorLog(programCtx.getMovesForErrorLogInCtx()); /*7777-MOVES-FOR-ERROR-LOG SECTION*/
      if (programCtx.isProgramEnded()) {
        return methodOut;
      }
      // cobolCode::GO TO 8500-EXIT
      return methodOut;
      // cobolCodeEnds::GO TO 8500-EXIT
    }
    //  cobolCode::SELECT PREF_CD , RVRS_TIER_IND FROM NTWK_RCPRCTY_DTL A WHERE RCPRCTY_TBL_ID = ?
    // AND PREF_CD > ' ' AND RVRS_TIER_IND = 'Y' FETCH FIRST 1 ROWS ONLY
    d5427polRepository.selectNtwkRcprctyDtl2(
        methodIn.getDclpolPlnMstr(), methodOut.getDclntwkRcprctyDtl(), programCtx.getSqlca());
    //  cobolCode::MOVE SQLCODE TO WS-SQLCODE DSM-SQLCODE
    methodOut.setSqlcode_Ws(methodOut.getSqlcode());
    methodOut.setDsmSqlcode(methodOut.getSqlcode());
    //  cobolCode::EVALUATE TRUE
    if (methodOut.isSqlcodeOk()) {
      //  cobolCode::MOVE DTL-PREF-CD TO POL8-RET-PREF-NTWK-CD
      methodOut.setPol8RetPrefNtwkCd(methodOut.getDtlPrefCd());
      //  cobolCode::MOVE DTL-RVRS-TIER-IND TO POL8-RET-REVERSE-TIERED-IND
      methodOut.setPol8RetReverseTieredInd(methodOut.getDtlRvrsTierInd());
    } else if (methodOut.isSqlcodeNotFound()) {
      //  cobolCode::MOVE 'N' TO POL8-RET-REVERSE-TIERED-IND
      //  LITERAL_N = 'N'
      methodOut.setPol8RetReverseTieredInd(CONSTANTS.LITERAL_N);
    } else {
      //  cobolCode::SET DSM-DB2-ERROR TO TRUE
      methodOut.setDsmDb2ErrorTrue();

      //  cobolCode::MOVE 'FETCH' TO DSM-ERR-TBL-ACTION
      methodOut.setDsmErrTblAction(CONSTANTS.LITERAL_FETCH_B5_);
      //  cobolCode::MOVE 'CUR-RCPRCTY-CSR' TO DSM-ERR-TBL-NAME
      methodOut.setDsmErrTblName(CONSTANTS.LITERAL_CUR_MN2_RCPRCTYCSR_B10_);
      //  cobolCode::MOVE '8500-FETCH-CUR-RCPRCTY-CSR' TO DSM-ERR-SECTN-NAME
      methodOut.setDsmErrSectnName(CONSTANTS.LITERAL_2023718362);
      //  cobolCode::MOVE 'D5427POL' TO DSM-ERR-PGM-NAME
      //  LITERAL_D5427POL = 'D5427POL'
      methodOut.setDsmErrPgmName(CONSTANTS.LITERAL_D5427POL);
      //  cobolCode::PERFORM 7777-MOVES-FOR-ERROR-LOG
      movesForErrorLog(programCtx.getMovesForErrorLogInCtx()); /*7777-MOVES-FOR-ERROR-LOG SECTION*/
      if (programCtx.isProgramEnded()) {
        return methodOut;
      }
    }
    //  cobolCode::SELECT PREF_CD FROM NTWK_RCPRCTY_DTL A WHERE RCPRCTY_TBL_ID = ? AND PREF_CD IN (
    // 'P' , 'M' , 'T' , 'X' ) FETCH FIRST 1 ROWS ONLY
    d5427polRepository.selectNtwkRcprctyDtl3(
        methodIn.getDclpolPlnMstr(), methodOut.getDclntwkRcprctyDtl(), programCtx.getSqlca());
    //  cobolCode::MOVE SQLCODE TO WS-SQLCODE DSM-SQLCODE
    methodOut.setSqlcode_Ws(methodOut.getSqlcode());
    methodOut.setDsmSqlcode(methodOut.getSqlcode());
    //  cobolCode::EVALUATE TRUE
    if (methodOut.isSqlcodeOk()) {
      //  cobolCode::MOVE DTL-PREF-CD TO POL8-RET-CONTR-BASE-TIER-CD
      methodOut.setPol8RetContrBaseTierCd(methodOut.getDtlPrefCd());
    } else if (methodOut.isSqlcodeNotFound()) {
      //  cobolCode::MOVE SPACE TO POL8-RET-CONTR-BASE-TIER-CD
      methodOut.setPol8RetContrBaseTierCd(CONSTANTS.SPACE);
    } else {
      //  cobolCode::SET DSM-DB2-ERROR TO TRUE
      methodOut.setDsmDb2ErrorTrue();

      //  cobolCode::MOVE 'FETCH' TO DSM-ERR-TBL-ACTION
      methodOut.setDsmErrTblAction(CONSTANTS.LITERAL_FETCH_B5_);
      //  cobolCode::MOVE 'CUR-RCPRCTY-CSR' TO DSM-ERR-TBL-NAME
      methodOut.setDsmErrTblName(CONSTANTS.LITERAL_CUR_MN2_RCPRCTYCSR_B10_);
      //  cobolCode::MOVE '8500-FETCH-CUR-RCPRCTY-CSR' TO DSM-ERR-SECTN-NAME
      methodOut.setDsmErrSectnName(CONSTANTS.LITERAL_2023718362);
      //  cobolCode::MOVE 'D5427POL' TO DSM-ERR-PGM-NAME
      //  LITERAL_D5427POL = 'D5427POL'
      methodOut.setDsmErrPgmName(CONSTANTS.LITERAL_D5427POL);
      //  cobolCode::PERFORM 7777-MOVES-FOR-ERROR-LOG
      movesForErrorLog(programCtx.getMovesForErrorLogInCtx()); /*7777-MOVES-FOR-ERROR-LOG SECTION*/
      if (programCtx.isProgramEnded()) {
        return methodOut;
      }
    }

    return methodOut;
  }
  /**
   * rcprctySelect1 This method is derived from COBOL Paragraph - 8510-RCPRCTY-SELECT1 SECTION COBOL
   * Cyclomatic complexity - 6 Input :
   *
   * <p>- topsPrdctCdSw COBOL Name: WS-TOPS-PRDCT-CD-SW - sqlcode COBOL Name: SQLCODE - dtlMktTypCd
   * COBOL Name: DTL-MKT-TYP-CD
   *
   * <p>Output :
   *
   * <p>- pol8RetMktTypCd COBOL Name: POL8-RET-MKT-TYP-CD - sqlcode_Ws COBOL Name: WS-SQLCODE -
   * dsmSqlcode COBOL Name: DSM-SQLCODE - sqlcode COBOL Name: SQLCODE - dtlMktTypCd COBOL Name:
   * DTL-MKT-TYP-CD - pol8RetProductCd COBOL Name: POL8-RET-PRODUCT-CD - dsmReturnCode COBOL Name:
   * DSM-RETURN-CODE - dsmErrTblAction COBOL Name: DSM-ERR-TBL-ACTION - dsmErrTblName COBOL Name:
   * DSM-ERR-TBL-NAME - dsmErrSectnName COBOL Name: DSM-ERR-SECTN-NAME - dsmErrPgmName COBOL Name:
   * DSM-ERR-PGM-NAME
   *
   * @throws CFException
   */
  @Override
  public RcprctySelect1OutCtx rcprctySelect1(RcprctySelect1InCtx methodIn) throws Exception {

    // *82 1. Select the data from ntwk_rcprcty_dtl                     *
    // *82 2. if sqlcode is okay then move the retrieved data else      *
    // *82    move spaces in return fields                              *
    // *82                                                              *
    // *82 called : 0000-mainline                                       *
    // *82 calls  : 7777-moves-for-error-log                            *
    // *82***************************************************************
    // Added variable to get the program context in place.
    D5427polCtx programCtx = methodIn.getD5427polCtx();
    // Added variable to get the output context in place.
    RcprctySelect1OutCtx methodOut = methodIn.getRcprctySelect1OutCtx();
    //  cobolCode::IF TOPS-PRDCT-CD-PRESENT
    //  cobolCode::ELSE
    if (!(methodIn.isTopsPrdctCdPresent())) {
      //  cobolCode::MOVE SPACES TO POL8-RET-MKT-TYP-CD
      methodOut.setPol8RetMktTypCd(CONSTANTS.SPACE_2);
      // cobolCode::GO TO 8510-EXIT
      return methodOut;
      // cobolCodeEnds::GO TO 8510-EXIT
    }
    //  cobolCode::SELECT MKT_TYP_CD FROM NTWK_RCPRCTY_DTL WHERE RCPRCTY_TBL_ID = ? FETCH FIRST 1
    // ROWS ONLY
    d5427polRepository.selectNtwkRcprctyDtl4(
        methodIn.getDclpolPlnMstr(), methodOut.getDclntwkRcprctyDtl(), programCtx.getSqlca());
    //  cobolCode::MOVE SQLCODE TO WS-SQLCODE DSM-SQLCODE
    methodOut.setSqlcode_Ws(methodOut.getSqlcode());
    methodOut.setDsmSqlcode(methodOut.getSqlcode());
    //  cobolCode::EVALUATE TRUE
    if (methodOut.isSqlcodeOk()) {

      // *A39965     move dtl-prdct-cd      to pol8-ret-product-cd
      //  cobolCode::MOVE DTL-MKT-TYP-CD TO POL8-RET-MKT-TYP-CD
      methodOut.setPol8RetMktTypCd(methodOut.getDtlMktTypCd());
    } else if (methodOut.isSqlcodeNotFound()) {
      //  cobolCode::MOVE SPACE TO POL8-RET-PRODUCT-CD
      methodOut.setPol8RetProductCd(CONSTANTS.SPACE_3);
      //  cobolCode::MOVE SPACE TO POL8-RET-MKT-TYP-CD
      methodOut.setPol8RetMktTypCd(CONSTANTS.SPACE_2);
    } else {
      //  cobolCode::SET DSM-DB2-ERROR TO TRUE
      methodOut.setDsmDb2ErrorTrue();

      //  cobolCode::MOVE 'FETCH' TO DSM-ERR-TBL-ACTION
      methodOut.setDsmErrTblAction(CONSTANTS.LITERAL_FETCH_B5_);
      //  cobolCode::MOVE 'CUR-RCPRCTY-CSR' TO DSM-ERR-TBL-NAME
      methodOut.setDsmErrTblName(CONSTANTS.LITERAL_CUR_MN2_RCPRCTYCSR_B10_);
      //  cobolCode::MOVE '8510-FETCH-CUR-RCPRCTY-CSR' TO DSM-ERR-SECTN-NAME
      methodOut.setDsmErrSectnName(CONSTANTS.LITERAL_87572007);
      //  cobolCode::MOVE 'D5427POL' TO DSM-ERR-PGM-NAME
      //  LITERAL_D5427POL = 'D5427POL'
      methodOut.setDsmErrPgmName(CONSTANTS.LITERAL_D5427POL);
      //  cobolCode::PERFORM 7777-MOVES-FOR-ERROR-LOG
      movesForErrorLog(programCtx.getMovesForErrorLogInCtx()); /*7777-MOVES-FOR-ERROR-LOG SECTION*/
      if (programCtx.isProgramEnded()) {
        return methodOut;
      }
    }

    return methodOut;
  }
  /**
   * derivePlanReferral This method is derived from COBOL Paragraph - 8600-DERIVE-PLAN-REFERRAL
   * SECTION COBOL Cyclomatic complexity - 10 Input :
   *
   * <p>- obligId COBOL Name: WS-OBLIG-ID - sqlcode COBOL Name: SQLCODE
   *
   * <p>Output :
   *
   * <p>- pol8RetReferralInd COBOL Name: POL8-RET-REFERRAL-IND - sqlcode_Ws COBOL Name: WS-SQLCODE -
   * dsmSqlcode COBOL Name: DSM-SQLCODE - sqlcode COBOL Name: SQLCODE - dsmReturnCode COBOL Name:
   * DSM-RETURN-CODE - dsmErrTblAction COBOL Name: DSM-ERR-TBL-ACTION - dsmErrTblName COBOL Name:
   * DSM-ERR-TBL-NAME - dsmErrSectnName COBOL Name: DSM-ERR-SECTN-NAME - dsmErrPgmName COBOL Name:
   * DSM-ERR-PGM-NAME
   *
   * @throws CFException
   */
  @Override
  public DerivePlanReferralOutCtx derivePlanReferral(DerivePlanReferralInCtx methodIn)
      throws Exception {

    // *82***************************************************************
    // *82 8600-Derive-plan-referral                                    *
    // *82 1. select the data from ntwk_rcprcty_dtl                     *
    // *82 2. if sqlcode is okay then derive the edi plan referral      *
    // *82    indicator field                                           *
    // *82                                                              *
    // *82 called : 0000-mainline                                       *
    // *82 calls  : 7777-moves-for-error-log                            *
    // *82***************************************************************
    // Added variable to get the program context in place.
    D5427polCtx programCtx = methodIn.getD5427polCtx();
    // Added variable to get the output context in place.
    DerivePlanReferralOutCtx methodOut = methodIn.getDerivePlanReferralOutCtx();
    //  cobolCode::MOVE 'N' TO POL8-RET-REFERRAL-IND
    //  LITERAL_N = 'N'
    methodOut.setPol8RetReferralInd(CONSTANTS.LITERAL_N);
    //  cobolCode::IF WS-OBLIG-ID = '04'
    //  LITERAL_04 = '04'
    if (compareChars(methodIn.getObligId(), CONSTANTS.LITERAL_04) == 0) {
      //  cobolCode::SELECT MKT_TYP_CD FROM NTWK_RCPRCTY_DTL WHERE RCPRCTY_TBL_ID = ? AND MKT_TYP_CD
      // IN ( '23' ) FETCH FIRST 1 ROWS ONLY
      d5427polRepository.selectNtwkRcprctyDtl5(
          methodIn.getDclpolPlnMstr(), methodOut.getDclntwkRcprctyDtl(), programCtx.getSqlca());
      //  cobolCode::MOVE SQLCODE TO WS-SQLCODE DSM-SQLCODE
      methodOut.setSqlcode_Ws(methodOut.getSqlcode());
      methodOut.setDsmSqlcode(methodOut.getSqlcode());
      //  cobolCode::EVALUATE TRUE
      if (methodOut.isSqlcodeOk()) {
        //  cobolCode::MOVE 'Y' TO POL8-RET-REFERRAL-IND
        //  LITERAL_Y = 'Y'
        methodOut.setPol8RetReferralInd(CONSTANTS.LITERAL_Y);
      } else if (methodOut.isSqlcodeNotFound()) {
        //  cobolCode::MOVE 'N' TO POL8-RET-REFERRAL-IND
        //  LITERAL_N = 'N'
        methodOut.setPol8RetReferralInd(CONSTANTS.LITERAL_N);
      } else {
        //  cobolCode::SET DSM-DB2-ERROR TO TRUE
        methodOut.setDsmDb2ErrorTrue();

        //  cobolCode::MOVE 'SELECT' TO DSM-ERR-TBL-ACTION
        methodOut.setDsmErrTblAction(CONSTANTS.LITERAL_SELECT_B4_);
        //  cobolCode::MOVE 'NTWK_RCPRCTY_DTL' TO DSM-ERR-TBL-NAME
        methodOut.setDsmErrTblName(CONSTANTS.LITERAL_NTWK_RCPRCTY_DTL_B9_);
        //  cobolCode::MOVE '8600-DERIVE-PLAN-REFERRAL' TO DSM-ERR-SECTN-NAME
        methodOut.setDsmErrSectnName(CONSTANTS.LITERAL_1805702826);
        //  cobolCode::MOVE 'D5427POL' TO DSM-ERR-PGM-NAME
        //  LITERAL_D5427POL = 'D5427POL'
        methodOut.setDsmErrPgmName(CONSTANTS.LITERAL_D5427POL);
        //  cobolCode::PERFORM 7777-MOVES-FOR-ERROR-LOG
        movesForErrorLog(
            programCtx.getMovesForErrorLogInCtx()); /*7777-MOVES-FOR-ERROR-LOG SECTION*/
        if (programCtx.isProgramEnded()) {
          return methodOut;
        }
        ;
      }
    }
    //  cobolCode::ELSE
    else {
      //  cobolCode::SELECT MKT_TYP_CD FROM NTWK_RCPRCTY_DTL WHERE RCPRCTY_TBL_ID = ? AND MKT_TYP_CD
      // IN ( '15' , '37' , '69' , '71' , '72' , '73' , '74' , '75' , '89' , '90' , '91' , '92' )
      // FETCH FIRST 1 ROWS ONLY
      d5427polRepository.selectNtwkRcprctyDtl6(
          methodIn.getDclpolPlnMstr(), methodOut.getDclntwkRcprctyDtl(), programCtx.getSqlca());
      //  cobolCode::MOVE SQLCODE TO WS-SQLCODE DSM-SQLCODE
      methodOut.setSqlcode_Ws(methodOut.getSqlcode());
      methodOut.setDsmSqlcode(methodOut.getSqlcode());
      //  cobolCode::EVALUATE TRUE
      if (methodOut.isSqlcodeOk()) {
        //  cobolCode::MOVE 'Y' TO POL8-RET-REFERRAL-IND
        //  LITERAL_Y = 'Y'
        methodOut.setPol8RetReferralInd(CONSTANTS.LITERAL_Y);
      } else if (methodOut.isSqlcodeNotFound()) {
        //  cobolCode::MOVE 'N' TO POL8-RET-REFERRAL-IND
        //  LITERAL_N = 'N'
        methodOut.setPol8RetReferralInd(CONSTANTS.LITERAL_N);
      } else {
        //  cobolCode::SET DSM-DB2-ERROR TO TRUE
        methodOut.setDsmDb2ErrorTrue();

        //  cobolCode::MOVE 'SELECT' TO DSM-ERR-TBL-ACTION
        methodOut.setDsmErrTblAction(CONSTANTS.LITERAL_SELECT_B4_);
        //  cobolCode::MOVE 'NTWK_RCPRCTY_DTL' TO DSM-ERR-TBL-NAME
        methodOut.setDsmErrTblName(CONSTANTS.LITERAL_NTWK_RCPRCTY_DTL_B9_);
        //  cobolCode::MOVE '8600-DERIVE-PLAN-REFERRAL' TO DSM-ERR-SECTN-NAME
        methodOut.setDsmErrSectnName(CONSTANTS.LITERAL_1805702826);
        //  cobolCode::MOVE 'D5427POL' TO DSM-ERR-PGM-NAME
        //  LITERAL_D5427POL = 'D5427POL'
        methodOut.setDsmErrPgmName(CONSTANTS.LITERAL_D5427POL);
        //  cobolCode::PERFORM 7777-MOVES-FOR-ERROR-LOG
        movesForErrorLog(
            programCtx.getMovesForErrorLogInCtx()); /*7777-MOVES-FOR-ERROR-LOG SECTION*/
        if (programCtx.isProgramEnded()) {
          return methodOut;
        }
        ;
      }
    }

    return methodOut;
  }
  /**
   * funCd9PolPhytherRead This method is derived from COBOL Paragraph -
   * 9000-FUN-CD9-POL-PHYTHER-READ SECTION COBOL Cyclomatic complexity - 2 Input :
   *
   * <p>- sqlcode_Ws COBOL Name: WS-SQLCODE
   *
   * <p>Output : None
   *
   * @throws CFException
   */
  @Override
  public FunCd9PolPhytherReadOutCtx funCd9PolPhytherRead(FunCd9PolPhytherReadInCtx methodIn)
      throws Exception {

    // *81***************************************************************
    // *81 9000-Fun-cd9-pol-phyther-read                                *
    // *81 business function: read physical therapies limits            *
    // *81                    and combinations                          *
    // *81***************************************************************
    // *82***************************************************************
    // *82 9000-fun-cd9-pol-phyther-read                                *
    // *82 1. select the data from pol_pln_mstr_phys_medcn joined       *
    // *82    with pol_pln_mstr_addtl_info and pol_pln_mstr             *
    // *82 2. if sqlcode is okay then create a physical therapy array   *
    // *82    for given policy and plan                                 *
    // *82                                                              *
    // *82 called : 0000-mainline                                       *
    // *82 calls  : 7777-moves-for-error-log                            *
    // *82***************************************************************
    // Added variable to get the program context in place.
    D5427polCtx programCtx = methodIn.getD5427polCtx();
    // Added variable to get the output context in place.
    FunCd9PolPhytherReadOutCtx methodOut = methodIn.getFunCd9PolPhytherReadOutCtx();
    //  cobolCode::PERFORM 9010-OPEN-THERAPY-CURSOR
    openTherapyCursor(programCtx.getOpenTherapyCursorInCtx()); /*9010-OPEN-THERAPY-CURSOR SECTION*/
    if (programCtx.isProgramEnded()) {
      return methodOut;
    }
    //  cobolCode::IF WS-SQLCODE-OK
    if (methodIn.isSqlcodeOk()) {
      //  cobolCode::PERFORM 9020-FETCH-THERAPY-CURSOR
      fetchTherapyCursor(
          programCtx.getFetchTherapyCursorInCtx()); /*9020-FETCH-THERAPY-CURSOR SECTION*/
      if (programCtx.isProgramEnded()) {
        return methodOut;
      }
    }
    //  cobolCode::PERFORM 9030-CLOSE-THERAPY-CURSOR
    closeTherapyCursor(
        programCtx.getCloseTherapyCursorInCtx()); /*9030-CLOSE-THERAPY-CURSOR SECTION*/
    if (programCtx.isProgramEnded()) {
      return methodOut;
    }

    return methodOut;
  }
  /**
   * openTherapyCursor This method is derived from COBOL Paragraph - 9010-OPEN-THERAPY-CURSOR
   * SECTION COBOL Cyclomatic complexity - 4 Input :
   *
   * <p>- sqlcode COBOL Name: SQLCODE
   *
   * <p>Output :
   *
   * <p>- sqlcode_Ws COBOL Name: WS-SQLCODE - dsmSqlcode COBOL Name: DSM-SQLCODE - sqlcode COBOL
   * Name: SQLCODE - dsmReturnCode COBOL Name: DSM-RETURN-CODE - dsmErrTblAction COBOL Name:
   * DSM-ERR-TBL-ACTION - dsmErrTblName COBOL Name: DSM-ERR-TBL-NAME - dsmErrSectnName COBOL Name:
   * DSM-ERR-SECTN-NAME - dsmErrPgmName COBOL Name: DSM-ERR-PGM-NAME
   *
   * @throws CFException
   */
  @Override
  public OpenTherapyCursorOutCtx openTherapyCursor(OpenTherapyCursorInCtx methodIn)
      throws Exception {

    // *81 Business function: open the cursor                           *
    // *81***************************************************************
    // *82***************************************************************
    // *82 9010-open-therapy-cursor                                     *
    // *82 1. open cursor therapy-csr                                   *
    // *82***************************************************************
    // Added variable to get the program context in place.
    D5427polCtx programCtx = methodIn.getD5427polCtx();
    // Added variable to get the output context in place.
    OpenTherapyCursorOutCtx methodOut = methodIn.getOpenTherapyCursorOutCtx();
    //  cobolCode::SELECT TRPY_TYP_CD , TRPY_CTGY_CD , TRPY_BEN_LMT_PAR_CNT , NTWK_STS_PAR_CD ,
    // TRPY_BEN_LMT_NPAR_CNT , NTWK_STS_NPAR_CD FROM POL_PLN_MSTR T1 , POL_PLN_MSTR_ADDTL_INFO T2 ,
    // POL_PLN_MSTR_PHYS_MEDCN T3 WHERE T1.COV_TYP_CD = ? AND T1.POL_NBR = ? AND T1.PLN_NBR = ? AND
    // T1.CLSS_NBR = ? AND T1.COV_TYP_CD = T2.COV_TYP_CD AND T1.POL_NBR = T2.POL_NBR AND T1.PLN_NBR
    // = T2.PLN_NBR AND T1.CLSS_NBR = T2.CLSS_NBR AND T1.COV_TYP_CD = T3.COV_TYP_CD AND T1.POL_NBR =
    // T3.POL_NBR AND T1.PLN_NBR = T3.PLN_NBR AND T1.CLSS_NBR = T3.CLSS_NBR FOR FETCH ONLY
    programCtx.setTherapyCsrResultSet(
        d5427polRepository.openTherapyCsrD5427pol(
            methodIn.getDclpolPlnMstr(), programCtx.getSqlca()));
    //  cobolCode::MOVE SQLCODE TO WS-SQLCODE DSM-SQLCODE
    methodOut.setSqlcode_Ws(methodOut.getSqlcode());
    methodOut.setDsmSqlcode(methodOut.getSqlcode());
    //  cobolCode::EVALUATE TRUE
    if (methodOut.isSqlcodeOk()) {;
    } else {
      //  cobolCode::SET DSM-DB2-ERROR TO TRUE
      methodOut.setDsmDb2ErrorTrue();

      //  cobolCode::MOVE 'OPEN' TO DSM-ERR-TBL-ACTION
      methodOut.setDsmErrTblAction(CONSTANTS.LITERAL_OPEN_B6_);
      //  cobolCode::MOVE 'POL_PLN_MSTR_PHYS_MEDCN' TO DSM-ERR-TBL-NAME
      methodOut.setDsmErrTblName(CONSTANTS.LITERAL_POL_PLN_MSTR_PHYS_MEDCN_B2_);
      //  cobolCode::MOVE '9010-OPEN-THERAPY-CURSOR' TO DSM-ERR-SECTN-NAME
      methodOut.setDsmErrSectnName(CONSTANTS.LITERAL_2033932954);
      //  cobolCode::MOVE 'D5427POL' TO DSM-ERR-PGM-NAME
      //  LITERAL_D5427POL = 'D5427POL'
      methodOut.setDsmErrPgmName(CONSTANTS.LITERAL_D5427POL);
      //  cobolCode::PERFORM 7777-MOVES-FOR-ERROR-LOG
      movesForErrorLog(programCtx.getMovesForErrorLogInCtx()); /*7777-MOVES-FOR-ERROR-LOG SECTION*/
      if (programCtx.isProgramEnded()) {
        return methodOut;
      }
    }

    return methodOut;
  }
  /**
   * fetchTherapyCursor This method is derived from COBOL Paragraph - 9020-FETCH-THERAPY-CURSOR
   * SECTION COBOL Cyclomatic complexity - 6 Input :
   *
   * <p>- sqlcode_Ws COBOL Name: WS-SQLCODE - sqlcode COBOL Name: SQLCODE
   *
   * <p>Output :
   *
   * <p>- lineSub COBOL Name: WS-LINE-SUB - sqlcode_Ws COBOL Name: WS-SQLCODE - dsmSqlcode COBOL
   * Name: DSM-SQLCODE - sqlcode COBOL Name: SQLCODE - dsmReturnCode COBOL Name: DSM-RETURN-CODE -
   * dsmErrTblAction COBOL Name: DSM-ERR-TBL-ACTION - dsmErrTblName COBOL Name: DSM-ERR-TBL-NAME -
   * dsmErrSectnName COBOL Name: DSM-ERR-SECTN-NAME - dsmErrPgmName COBOL Name: DSM-ERR-PGM-NAME
   *
   * @throws CFException
   */
  @Override
  public FetchTherapyCursorOutCtx fetchTherapyCursor(FetchTherapyCursorInCtx methodIn)
      throws Exception {

    // *81***************************************************************
    // *81 9020-Fetch-therapy-cursor                                    *
    // *81 business function: fetch the records from the table          *
    // *81***************************************************************
    // *82***************************************************************
    // *82 9020-fetch-therapy-cursor                                    *
    // *82 1. fetch records from cursor therapy-csr                     *
    // *82***************************************************************
    // Added variable to get the program context in place.
    D5427polCtx programCtx = methodIn.getD5427polCtx();
    // Added variable to get the output context in place.
    FetchTherapyCursorOutCtx methodOut = methodIn.getFetchTherapyCursorOutCtx();
    methodOut.setLineSub(1);
    //  cobolCode::PERFORM UNTIL WS-SQLCODE-NOT-FOUND
    while ((!(methodIn.isSqlcodeNotFound()))) {
      //  cobolCode::FETCH THERAPY-CSR INTO ? , ? , ? , ? , ? , ?
      d5427polRepository.fetchTherapyCsrD5427pol(
          programCtx.getTherapyCsrResultSet(),
          programCtx.getSqlca(),
          methodOut.getDclpolPlnMstrPhysMedcn());
      //  cobolCode::MOVE SQLCODE TO WS-SQLCODE DSM-SQLCODE
      methodOut.setSqlcode_Ws(methodOut.getSqlcode());
      methodOut.setDsmSqlcode(methodOut.getSqlcode());
      //  cobolCode::EVALUATE TRUE
      if (methodOut.isSqlcodeOk()) {
        //  cobolCode::PERFORM 9040-POPULATE-RET-POL9-THRPY
        populateRetPol9Thrpy(
            programCtx.getPopulateRetPol9ThrpyInCtx()); /*9040-POPULATE-RET-POL9-THRPY SECTION*/
        if (programCtx.isProgramEnded()) {
          return methodOut;
        }
        //  cobolCode::ADD 1 TO WS-LINE-SUB
        methodOut.setLineSub(methodOut.getLineSub() + 1);
      } else if (methodIn.isSqlcodeNotFound()) {;
      } else {
        //  cobolCode::SET DSM-DB2-ERROR TO TRUE
        methodOut.setDsmDb2ErrorTrue();

        //  cobolCode::MOVE 'FETCH' TO DSM-ERR-TBL-ACTION
        methodOut.setDsmErrTblAction(CONSTANTS.LITERAL_FETCH_B5_);
        //  cobolCode::MOVE 'POL_PLN_MSTR_PHYS_MEDCN' TO DSM-ERR-TBL-NAME
        methodOut.setDsmErrTblName(CONSTANTS.LITERAL_POL_PLN_MSTR_PHYS_MEDCN_B2_);
        //  cobolCode::MOVE '9020-FETCH-THERAPY-CURSOR' TO DSM-ERR-SECTN-NAME
        methodOut.setDsmErrSectnName(CONSTANTS.LITERAL_1560213883);
        //  cobolCode::MOVE 'D5427POL' TO DSM-ERR-PGM-NAME
        //  LITERAL_D5427POL = 'D5427POL'
        methodOut.setDsmErrPgmName(CONSTANTS.LITERAL_D5427POL);
        //  cobolCode::PERFORM 7777-MOVES-FOR-ERROR-LOG
        movesForErrorLog(
            programCtx.getMovesForErrorLogInCtx()); /*7777-MOVES-FOR-ERROR-LOG SECTION*/
        if (programCtx.isProgramEnded()) {
          return methodOut;
        }
      }
    }

    return methodOut;
  }
  /**
   * closeTherapyCursor This method is derived from COBOL Paragraph - 9030-CLOSE-THERAPY-CURSOR
   * SECTION COBOL Cyclomatic complexity - 4 Input :
   *
   * <p>- sqlcode COBOL Name: SQLCODE
   *
   * <p>Output :
   *
   * <p>- sqlcode_Ws COBOL Name: WS-SQLCODE - dsmSqlcode COBOL Name: DSM-SQLCODE - sqlcode COBOL
   * Name: SQLCODE - dsmReturnCode COBOL Name: DSM-RETURN-CODE - dsmErrTblAction COBOL Name:
   * DSM-ERR-TBL-ACTION - dsmErrTblName COBOL Name: DSM-ERR-TBL-NAME - dsmErrSectnName COBOL Name:
   * DSM-ERR-SECTN-NAME - dsmErrPgmName COBOL Name: DSM-ERR-PGM-NAME
   *
   * @throws CFException
   */
  @Override
  public CloseTherapyCursorOutCtx closeTherapyCursor(CloseTherapyCursorInCtx methodIn)
      throws Exception {

    // *81***************************************************************
    // *81 9030-Close-therapy-cursor                                    *
    // *81 business function: close the cursor                          *
    // *81***************************************************************
    // *82***************************************************************
    // *82 9030-close-therapy-cursor                                    *
    // *82 1.close cursor therapy-csr                                   *
    // *82***************************************************************
    // Added variable to get the program context in place.
    D5427polCtx programCtx = methodIn.getD5427polCtx();
    // Added variable to get the output context in place.
    CloseTherapyCursorOutCtx methodOut = methodIn.getCloseTherapyCursorOutCtx();
    //  cobolCode::CLOSE THERAPY-CSR
    d5427polRepository.closeTherapyCsrD5427pol(
        programCtx.getTherapyCsrResultSet(), programCtx.getSqlca());
    //  cobolCode::MOVE SQLCODE TO WS-SQLCODE DSM-SQLCODE
    methodOut.setSqlcode_Ws(methodOut.getSqlcode());
    methodOut.setDsmSqlcode(methodOut.getSqlcode());
    //  cobolCode::EVALUATE TRUE
    if (methodOut.isSqlcodeOk()) {;
    } else {
      //  cobolCode::SET DSM-DB2-ERROR TO TRUE
      methodOut.setDsmDb2ErrorTrue();

      //  cobolCode::MOVE 'CLOSE' TO DSM-ERR-TBL-ACTION
      methodOut.setDsmErrTblAction(CONSTANTS.LITERAL_CLOSE_B5_);
      //  cobolCode::MOVE 'POL_PLN_MSTR_PHYS_MEDCN' TO DSM-ERR-TBL-NAME
      methodOut.setDsmErrTblName(CONSTANTS.LITERAL_POL_PLN_MSTR_PHYS_MEDCN_B2_);
      //  cobolCode::MOVE '9030-CLOSE-THERAPY-CURSOR' TO DSM-ERR-SECTN-NAME
      methodOut.setDsmErrSectnName(CONSTANTS.LITERAL_460451080);
      //  cobolCode::MOVE 'D5427POL' TO DSM-ERR-PGM-NAME
      //  LITERAL_D5427POL = 'D5427POL'
      methodOut.setDsmErrPgmName(CONSTANTS.LITERAL_D5427POL);
      //  cobolCode::PERFORM 7777-MOVES-FOR-ERROR-LOG
      movesForErrorLog(programCtx.getMovesForErrorLogInCtx()); /*7777-MOVES-FOR-ERROR-LOG SECTION*/
      if (programCtx.isProgramEnded()) {
        return methodOut;
      }
    }

    return methodOut;
  }
  /**
   * populateRetPol9Thrpy This method is derived from COBOL Paragraph - 9040-POPULATE-RET-POL9-THRPY
   * SECTION COBOL Cyclomatic complexity - 1 Input :
   *
   * <p>- dcpmTrpyTypCd COBOL Name: DCPM-TRPY-TYP-CD - dcpmTrpyCtgyCd COBOL Name: DCPM-TRPY-CTGY-CD
   * - dcpmTrpyBenLmtParCnt COBOL Name: DCPM-TRPY-BEN-LMT-PAR-CNT - dcpmNtwkStsParCd COBOL Name:
   * DCPM-NTWK-STS-PAR-CD - dcpmTrpyBenLmtNparCnt COBOL Name: DCPM-TRPY-BEN-LMT-NPAR-CNT -
   * dcpmNtwkStsNparCd COBOL Name: DCPM-NTWK-STS-NPAR-CD - pol9CombHabRehabCnt COBOL Name:
   * POL9-COMB-HAB-REHAB-CNT
   *
   * <p>Output :
   *
   * <p>- pol9RetTrpyTypCd COBOL Name: POL9-RET-TRPY-TYP-CD - dcpmTrpyTypCd COBOL Name:
   * DCPM-TRPY-TYP-CD - pol9RetTrpyCtgyCd COBOL Name: POL9-RET-TRPY-CTGY-CD - dcpmTrpyCtgyCd COBOL
   * Name: DCPM-TRPY-CTGY-CD - pol9RetTrpyBenLmtParCnt COBOL Name: POL9-RET-TRPY-BEN-LMT-PAR-CNT -
   * dcpmTrpyBenLmtParCnt COBOL Name: DCPM-TRPY-BEN-LMT-PAR-CNT - pol9RetNtwkStsParCd COBOL Name:
   * POL9-RET-NTWK-STS-PAR-CD - dcpmNtwkStsParCd COBOL Name: DCPM-NTWK-STS-PAR-CD -
   * pol9RetTrpyBenLmtNparCnt COBOL Name: POL9-RET-TRPY-BEN-LMT-NPAR-CNT - dcpmTrpyBenLmtNparCnt
   * COBOL Name: DCPM-TRPY-BEN-LMT-NPAR-CNT - pol9RetNtwkStsNparCd COBOL Name:
   * POL9-RET-NTWK-STS-NPAR-CD - dcpmNtwkStsNparCd COBOL Name: DCPM-NTWK-STS-NPAR-CD -
   * pol9CombHabRehabCnt COBOL Name: POL9-COMB-HAB-REHAB-CNT
   *
   * @throws CFException
   */
  @Override
  public PopulateRetPol9ThrpyOutCtx populateRetPol9Thrpy(PopulateRetPol9ThrpyInCtx methodIn)
      throws Exception {

    // *81***************************************************************
    // *81 9040-Populate-ret-pol9-thrpy                                 *
    // *81 business function: populate the return data                  *
    // *81***************************************************************
    // *82***************************************************************
    // *82 9040-populate-ret-pol9-thrpy                                 *
    // *82 1. populate the return data                                  *
    // *82***************************************************************
    // Added variable to get the program context in place.
    D5427polCtx programCtx = methodIn.getD5427polCtx();
    // Added variable to get the output context in place.
    PopulateRetPol9ThrpyOutCtx methodOut = methodIn.getPopulateRetPol9ThrpyOutCtx();
    //  cobolCode::MOVE DCPM-TRPY-TYP-CD TO POL9-RET-TRPY-TYP-CD ( WS-LINE-SUB )
    methodOut.setPol9RetTrpyTypCd(
        methodIn.getLineSub() - 1, pad(3, methodOut.getDcpmTrpyTypCd(), SPACE_CHAR, RIGHT_PAD));
    //  cobolCode::MOVE DCPM-TRPY-CTGY-CD TO POL9-RET-TRPY-CTGY-CD ( WS-LINE-SUB )
    methodOut.setPol9RetTrpyCtgyCd(
        methodIn.getLineSub() - 1, pad(3, methodOut.getDcpmTrpyCtgyCd(), SPACE_CHAR, RIGHT_PAD));
    //  cobolCode::MOVE DCPM-TRPY-BEN-LMT-PAR-CNT TO POL9-RET-TRPY-BEN-LMT-PAR-CNT ( WS-LINE-SUB )
    methodOut.setPol9RetTrpyBenLmtParCnt(
        methodIn.getLineSub() - 1, methodOut.getDcpmTrpyBenLmtParCnt());
    //  cobolCode::MOVE DCPM-NTWK-STS-PAR-CD TO POL9-RET-NTWK-STS-PAR-CD ( WS-LINE-SUB )
    methodOut.setPol9RetNtwkStsParCd(
        methodIn.getLineSub() - 1, pad(3, methodOut.getDcpmNtwkStsParCd(), SPACE_CHAR, RIGHT_PAD));
    //  cobolCode::MOVE DCPM-TRPY-BEN-LMT-NPAR-CNT TO POL9-RET-TRPY-BEN-LMT-NPAR-CNT ( WS-LINE-SUB )
    methodOut.setPol9RetTrpyBenLmtNparCnt(
        methodIn.getLineSub() - 1, methodOut.getDcpmTrpyBenLmtNparCnt());
    //  cobolCode::MOVE DCPM-NTWK-STS-NPAR-CD TO POL9-RET-NTWK-STS-NPAR-CD ( WS-LINE-SUB )
    methodOut.setPol9RetNtwkStsNparCd(
        methodIn.getLineSub() - 1, pad(3, methodOut.getDcpmNtwkStsNparCd(), SPACE_CHAR, RIGHT_PAD));
    //  cobolCode::ADD +1 TO POL9-COMB-HAB-REHAB-CNT
    methodOut.setPol9CombHabRehabCnt(methodOut.getPol9CombHabRehabCnt() + 1);

    return methodOut;
  }
  /**
   * funcCd7SearchPol This method is derived from COBOL Paragraph - 7500-FUNC-CD7-SEARCH-POL SECTION
   * COBOL Cyclomatic complexity - 5 Input :
   *
   * <p>- polReqMxiPolNbr COBOL Name: POL-REQ-MXI-POL-NBR - sqlcode COBOL Name: SQLCODE
   *
   * <p>Output :
   *
   * <p>- policyNbr COBOL Name: WS-POLICY-NBR - polReqMxiPolNbr COBOL Name: POL-REQ-MXI-POL-NBR -
   * pol7RetPolPresentInd COBOL Name: POL7-RET-POL-PRESENT-IND - policyInd COBOL Name: WS-POLICY-IND
   * - sqlcode_Ws COBOL Name: WS-SQLCODE - dsmSqlcode COBOL Name: DSM-SQLCODE - sqlcode COBOL Name:
   * SQLCODE - dsmReturnCode COBOL Name: DSM-RETURN-CODE - dsmErrTblAction COBOL Name:
   * DSM-ERR-TBL-ACTION - dsmErrTblName COBOL Name: DSM-ERR-TBL-NAME - dsmErrSectnName COBOL Name:
   * DSM-ERR-SECTN-NAME - dsmErrPgmName COBOL Name: DSM-ERR-PGM-NAME
   *
   * @throws CFException
   */
  @Override
  public FuncCd7SearchPolOutCtx funcCd7SearchPol(FuncCd7SearchPolInCtx methodIn) throws Exception {

    // *81***************************************************************
    // *81 7500-Func-cd7-search-pol                                     *
    // *81 business function: serve the call by the tops only direct    *
    // *81                    keyed policy screen (m529350u).           *
    // *81                    search policy in cust_pol_pln_xref table  *
    // *81                    and then in pol_pln_mstr.                 *
    // *81***************************************************************
    // *82***************************************************************
    // *82 7500-func-cd7-search-pol                                     *
    // *82 1. close the cursor cur-ind-ded-csr                          *
    // *82***************************************************************
    // Added variable to get the program context in place.
    D5427polCtx programCtx = methodIn.getD5427polCtx();
    // Added variable to get the output context in place.
    FuncCd7SearchPolOutCtx methodOut = methodIn.getFuncCd7SearchPolOutCtx();
    //  cobolCode::MOVE POL-REQ-MXI-POL-NBR TO WS-POLICY-NBR
    methodOut.setPolicyNbr(methodOut.getPolReqMxiPolNbr());
    //  cobolCode::MOVE 'N' TO POL7-RET-POL-PRESENT-IND WS-POLICY-IND
    //  LITERAL_N = 'N'
    methodOut.setPol7RetPolPresentInd(CONSTANTS.LITERAL_N);
    methodOut.setPolicyInd(CONSTANTS.LITERAL_N);
    //  cobolCode::SELECT 'Y' FROM POL_PLN_DENORM WHERE ( POL_NBR = ? ) FETCH FIRST ROW ONLY
    d5427polRepository.selectPolPlnDenorm(methodOut.getWorkVariables(), programCtx.getSqlca());
    //  cobolCode::MOVE SQLCODE TO WS-SQLCODE DSM-SQLCODE
    methodOut.setSqlcode_Ws(methodOut.getSqlcode());
    methodOut.setDsmSqlcode(methodOut.getSqlcode());
    //  cobolCode::EVALUATE TRUE
    if (methodOut.isSqlcodeOk()) {

      // *             If ws-policy-count > +0
      // *               move ws-policy-nbr to pol3-std-pol-nbr
      // *               set mxi-policy-found to true
      // *             else
      // *               set mxi-policy-not-found to true
      // *             end-if
      //  cobolCode::MOVE WS-POLICY-IND TO POL7-RET-POL-PRESENT-IND
      methodOut.setPol7RetPolPresentInd(methodOut.getPolicyInd());
    } else if (methodOut.isSqlcodeFetchEnd()) {
      //  cobolCode::MOVE 'N' TO POL7-RET-POL-PRESENT-IND
      //  LITERAL_N = 'N'
      methodOut.setPol7RetPolPresentInd(CONSTANTS.LITERAL_N);
    } else {
      //  cobolCode::SET DSM-DB2-ERROR TO TRUE
      methodOut.setDsmDb2ErrorTrue();

      //  cobolCode::MOVE 'SELECT' TO DSM-ERR-TBL-ACTION
      methodOut.setDsmErrTblAction(CONSTANTS.LITERAL_SELECT_B4_);

      // *             Move 'cust_pol_pln_xref '      to dsm-err-tbl-name
      //  cobolCode::MOVE 'POL_PLN_DENORM ' TO DSM-ERR-TBL-NAME
      methodOut.setDsmErrTblName(CONSTANTS.LITERAL_POL_PLN_DENORM_B11_);
      //  cobolCode::MOVE '7500-FUNC-CD7-SEARCH-POL' TO DSM-ERR-SECTN-NAME
      methodOut.setDsmErrSectnName(CONSTANTS.LITERAL_1133646553);
      //  cobolCode::MOVE 'D5427POL' TO DSM-ERR-PGM-NAME
      //  LITERAL_D5427POL = 'D5427POL'
      methodOut.setDsmErrPgmName(CONSTANTS.LITERAL_D5427POL);
      //  cobolCode::PERFORM 7777-MOVES-FOR-ERROR-LOG
      movesForErrorLog(programCtx.getMovesForErrorLogInCtx()); /*7777-MOVES-FOR-ERROR-LOG SECTION*/
      if (programCtx.isProgramEnded()) {
        return methodOut;
      }
    }

    return methodOut;
  }
  /**
   * funcCd10MxiRead This method is derived from COBOL Paragraph - 10000-FUNC-CD10-MXI-READ SECTION
   * COBOL Cyclomatic complexity - 5 Input :
   *
   * <p>- sqlcode COBOL Name: SQLCODE - mmiPolNbr COBOL Name: MMI-POL-NBR - mmiPlnNbr COBOL Name:
   * MMI-PLN-NBR - xrfLglEntyCd COBOL Name: XRF-LGL-ENTY-CD
   *
   * <p>Output :
   *
   * <p>- sqlcode_Ws COBOL Name: WS-SQLCODE - dsmSqlcode COBOL Name: DSM-SQLCODE - sqlcode COBOL
   * Name: SQLCODE - pol10StdPolNbr COBOL Name: POL10-STD-POL-NBR - mmiPolNbr COBOL Name:
   * MMI-POL-NBR - pol10StdPlnNbr COBOL Name: POL10-STD-PLN-NBR - mmiPlnNbr COBOL Name: MMI-PLN-NBR
   * - pol10RetLglEntyCd COBOL Name: POL10-RET-LGL-ENTY-CD - xrfLglEntyCd COBOL Name:
   * XRF-LGL-ENTY-CD - pol3StdPolNbr COBOL Name: POL3-STD-POL-NBR - pol3StdPlnNbr COBOL Name:
   * POL3-STD-PLN-NBR - dsmReturnCode COBOL Name: DSM-RETURN-CODE - dsmErrTblAction COBOL Name:
   * DSM-ERR-TBL-ACTION - dsmErrTblName COBOL Name: DSM-ERR-TBL-NAME - dsmErrSectnName COBOL Name:
   * DSM-ERR-SECTN-NAME - dsmErrPgmName COBOL Name: DSM-ERR-PGM-NAME
   *
   * @throws CFException
   */
  @Override
  public FuncCd10MxiReadOutCtx funcCd10MxiRead(FuncCd10MxiReadInCtx methodIn) throws Exception {

    // *81***************************************************************
    // *82***************************************************************
    // *82 10000-Func-cd10-mxi-read                                     *
    // *82 1. read the records from the xrf table                       *
    // *82***************************************************************
    // Added variable to get the program context in place.
    D5427polCtx programCtx = methodIn.getD5427polCtx();
    // Added variable to get the output context in place.
    FuncCd10MxiReadOutCtx methodOut = methodIn.getFuncCd10MxiReadOutCtx();
    //  cobolCode::SELECT LGL_ENTY_CD FROM CUST_POL_PLN_XREF WHERE POL_NBR = ? AND COV_TYP_CD = ?
    // AND PLN_NBR = ? AND CLSS_NBR = ? AND ( ( EFF_DT <= ? AND CANC_DT >= ? ) OR ( EFF_DT <= ? AND
    // CANC_DT >= ? ) ) ORDER BY EFF_DT ASC FETCH FIRST 1 ROW ONLY
    d5427polRepository.selectCustPolPlnXref7(
        programCtx.getSqlca(), methodOut.getDclcustPolPlnXref());
    //  cobolCode::MOVE SQLCODE TO WS-SQLCODE DSM-SQLCODE
    methodOut.setSqlcode_Ws(methodOut.getSqlcode());
    methodOut.setDsmSqlcode(methodOut.getSqlcode());
    //  cobolCode::EVALUATE TRUE
    if (methodOut.isSqlcodeOk()) {
      //  cobolCode::MOVE MMI-POL-NBR TO POL10-STD-POL-NBR
      methodOut.setPol10StdPolNbr(methodOut.getMmiPolNbr());
      methodOut.setPol10StdPlnNbr(padLeftZeros(4, methodOut.getMmiPlnNbr(), false));
      //  cobolCode::MOVE XRF-LGL-ENTY-CD TO POL10-RET-LGL-ENTY-CD
      methodOut.setPol10RetLglEntyCd(methodOut.getXrfLglEntyCd());
      //  cobolCode::PERFORM 10100-FUNC-CD10-MMI-READ THRU 10100-EXIT
      funcCd10MmiRead(programCtx.getFuncCd10MmiReadInCtx()); /*10100-FUNC-CD10-MMI-READ SECTION*/
      if (programCtx.isProgramEnded()) {
        return methodOut;
      }
    } else if (methodOut.isSqlcodeNotFound()) {
      //  cobolCode::MOVE MMI-POL-NBR TO POL3-STD-POL-NBR
      methodOut.setPol3StdPolNbr(methodOut.getMmiPolNbr());
      methodOut.setPol3StdPlnNbr(padLeftZeros(4, methodOut.getMmiPlnNbr(), false));
      //  cobolCode::PERFORM 10100-FUNC-CD10-MMI-READ THRU 10100-EXIT
      funcCd10MmiRead(programCtx.getFuncCd10MmiReadInCtx()); /*10100-FUNC-CD10-MMI-READ SECTION*/
      if (programCtx.isProgramEnded()) {
        return methodOut;
      }
    } else {
      //  cobolCode::SET DSM-DB2-ERROR TO TRUE
      methodOut.setDsmDb2ErrorTrue();

      //  cobolCode::MOVE 'SELECT' TO DSM-ERR-TBL-ACTION
      methodOut.setDsmErrTblAction(CONSTANTS.LITERAL_SELECT_B4_);
      //  cobolCode::MOVE 'CUST_POL_PLN_XREF' TO DSM-ERR-TBL-NAME
      methodOut.setDsmErrTblName(CONSTANTS.LITERAL_CUST_POL_PLN_XREF_B8_);
      //  cobolCode::MOVE '10000-FUNC-CD10-MXI-READ' TO DSM-ERR-SECTN-NAME
      methodOut.setDsmErrSectnName(CONSTANTS.LITERAL_2019584933);
      //  cobolCode::MOVE 'D5427POL' TO DSM-ERR-PGM-NAME
      //  LITERAL_D5427POL = 'D5427POL'
      methodOut.setDsmErrPgmName(CONSTANTS.LITERAL_D5427POL);
      //  cobolCode::PERFORM 7777-MOVES-FOR-ERROR-LOG
      movesForErrorLog(programCtx.getMovesForErrorLogInCtx()); /*7777-MOVES-FOR-ERROR-LOG SECTION*/
      if (programCtx.isProgramEnded()) {
        return methodOut;
      }
    }

    return methodOut;
  }
  /**
   * funcCd10MmiRead This method is derived from COBOL Paragraph - 10100-FUNC-CD10-MMI-READ SECTION
   * COBOL Cyclomatic complexity - 5 Input :
   *
   * <p>- sqlcode COBOL Name: SQLCODE - mmiFundTypCd COBOL Name: MMI-FUND-TYP-CD - mmaRiskClsCd
   * COBOL Name: MMA-RISK-CLS-CD
   *
   * <p>Output :
   *
   * <p>- sqlcode_Ws COBOL Name: WS-SQLCODE - dsmSqlcode COBOL Name: DSM-SQLCODE - sqlcode COBOL
   * Name: SQLCODE - pol10RetFundTypCd COBOL Name: POL10-RET-FUND-TYP-CD - mmiFundTypCd COBOL Name:
   * MMI-FUND-TYP-CD - pol10RetRiskClsCd COBOL Name: POL10-RET-RISK-CLS-CD - mmaRiskClsCd COBOL
   * Name: MMA-RISK-CLS-CD - dsmReturnCode COBOL Name: DSM-RETURN-CODE - dsmErrTblAction COBOL Name:
   * DSM-ERR-TBL-ACTION - dsmErrTblName COBOL Name: DSM-ERR-TBL-NAME - dsmErrSectnName COBOL Name:
   * DSM-ERR-SECTN-NAME - dsmErrPgmName COBOL Name: DSM-ERR-PGM-NAME
   *
   * @throws CFException
   */
  @Override
  public FuncCd10MmiReadOutCtx funcCd10MmiRead(FuncCd10MmiReadInCtx methodIn) throws Exception {

    // *81***************************************************************
    // *81 10100-Func-cd10-mmi-read                                     *
    // *81 business function:read the table to retrive the records      *
    // *81***************************************************************
    // *82***************************************************************
    // *82 10100-func-cd10-mmi-read                                     *
    // *82 1. fetch records from pol_pln_mstr for given policy/plan     *
    // *82***************************************************************
    // Added variable to get the program context in place.
    D5427polCtx programCtx = methodIn.getD5427polCtx();
    // Added variable to get the output context in place.
    FuncCd10MmiReadOutCtx methodOut = methodIn.getFuncCd10MmiReadOutCtx();
    //  cobolCode::SELECT T1.FUND_TYP_CD , T2.RISK_CLS_CD FROM POL_PLN_MSTR T1 ,
    // POL_PLN_MSTR_ADDTL_INFO T2 WHERE T1.POL_NBR = ? AND T1.PLN_NBR = ? AND T1.CLSS_NBR = ? AND
    // T1.COV_TYP_CD = ? AND T1.POL_NBR = T2.POL_NBR AND T1.PLN_NBR = T2.PLN_NBR AND T1.CLSS_NBR =
    // T2.CLSS_NBR AND T1.COV_TYP_CD = T2.COV_TYP_CD
    d5427polRepository.selectPolPlnMstr8(
        methodOut.getDclpolPlnMstrAddtlInfo(), methodOut.getDclpolPlnMstr(), programCtx.getSqlca());
    //  cobolCode::MOVE SQLCODE TO WS-SQLCODE DSM-SQLCODE
    methodOut.setSqlcode_Ws(methodOut.getSqlcode());
    methodOut.setDsmSqlcode(methodOut.getSqlcode());
    //  cobolCode::EVALUATE TRUE
    if (methodOut.isSqlcodeOk()) {
      //  cobolCode::MOVE MMI-FUND-TYP-CD TO POL10-RET-FUND-TYP-CD
      methodOut.setPol10RetFundTypCd(methodOut.getMmiFundTypCd());
      //  cobolCode::MOVE MMA-RISK-CLS-CD TO POL10-RET-RISK-CLS-CD
      methodOut.setPol10RetRiskClsCd(methodOut.getMmaRiskClsCd());
    } else if (methodOut.isSqlcodeNotFound()) {
      //  cobolCode::SET DSM-ENTRY-NOT-FND-INQ TO TRUE
      methodOut.setDsmEntryNotFndInqTrue();

      //  cobolCode::MOVE 'SELECT' TO DSM-ERR-TBL-ACTION
      methodOut.setDsmErrTblAction(CONSTANTS.LITERAL_SELECT_B4_);
      //  cobolCode::MOVE 'POL_PLN_MSTR' TO DSM-ERR-TBL-NAME
      methodOut.setDsmErrTblName(CONSTANTS.LITERAL_POL_PLN_MSTR_B13_);
      //  cobolCode::MOVE '10100-FUNC-CD10-MMI-READ' TO DSM-ERR-SECTN-NAME
      methodOut.setDsmErrSectnName(CONSTANTS.LITERAL_1825400569);
      //  cobolCode::MOVE 'D5427POL' TO DSM-ERR-PGM-NAME
      //  LITERAL_D5427POL = 'D5427POL'
      methodOut.setDsmErrPgmName(CONSTANTS.LITERAL_D5427POL);
      //  cobolCode::PERFORM 7777-MOVES-FOR-ERROR-LOG
      movesForErrorLog(programCtx.getMovesForErrorLogInCtx()); /*7777-MOVES-FOR-ERROR-LOG SECTION*/
      if (programCtx.isProgramEnded()) {
        return methodOut;
      }
    } else {
      //  cobolCode::SET DSM-DB2-ERROR TO TRUE
      methodOut.setDsmDb2ErrorTrue();

      //  cobolCode::MOVE 'SELECT' TO DSM-ERR-TBL-ACTION
      methodOut.setDsmErrTblAction(CONSTANTS.LITERAL_SELECT_B4_);
      //  cobolCode::MOVE 'POL_PLN_MSTR' TO DSM-ERR-TBL-NAME
      methodOut.setDsmErrTblName(CONSTANTS.LITERAL_POL_PLN_MSTR_B13_);
      //  cobolCode::MOVE '10100-FUNC-CD10-MMI-READ' TO DSM-ERR-SECTN-NAME
      methodOut.setDsmErrSectnName(CONSTANTS.LITERAL_1825400569);
      //  cobolCode::MOVE 'D5427POL' TO DSM-ERR-PGM-NAME
      //  LITERAL_D5427POL = 'D5427POL'
      methodOut.setDsmErrPgmName(CONSTANTS.LITERAL_D5427POL);
      //  cobolCode::PERFORM 7777-MOVES-FOR-ERROR-LOG
      movesForErrorLog(programCtx.getMovesForErrorLogInCtx()); /*7777-MOVES-FOR-ERROR-LOG SECTION*/
      if (programCtx.isProgramEnded()) {
        return methodOut;
      }
    }

    return methodOut;
  }
  /**
   * funcCd11ReadMxi This method is derived from COBOL Paragraph - 11000-FUNC-CD11-READ-MXI SECTION
   * COBOL Cyclomatic complexity - 5 Input :
   *
   * <p>- polReqMxiPolNbr COBOL Name: POL-REQ-MXI-POL-NBR - polReqMxiPlnNbr COBOL Name:
   * POL-REQ-MXI-PLN-NBR - polReqMxiClssNbr COBOL Name: POL-REQ-MXI-CLSS-NBR - polReqEffDt COBOL
   * Name: POL-REQ-EFF-DT - polReqCancDt COBOL Name: POL-REQ-CANC-DT - polReqCovTypCd COBOL Name:
   * POL-REQ-COV-TYP-CD - sqlcode COBOL Name: SQLCODE - xrfPayLoc1Nbr COBOL Name: XRF-PAY-LOC-1-NBR
   * - xrfPayLoc2Nbr COBOL Name: XRF-PAY-LOC-2-NBR
   *
   * <p>Output :
   *
   * <p>- xrfPolNbr COBOL Name: XRF-POL-NBR - polReqMxiPolNbr COBOL Name: POL-REQ-MXI-POL-NBR -
   * xrfPlnNbr COBOL Name: XRF-PLN-NBR - polReqMxiPlnNbr COBOL Name: POL-REQ-MXI-PLN-NBR -
   * xrfClssNbr COBOL Name: XRF-CLSS-NBR - polReqMxiClssNbr COBOL Name: POL-REQ-MXI-CLSS-NBR -
   * xrfEffDt COBOL Name: XRF-EFF-DT - polReqEffDt COBOL Name: POL-REQ-EFF-DT - xrfCancDt COBOL
   * Name: XRF-CANC-DT - polReqCancDt COBOL Name: POL-REQ-CANC-DT - xrfCovTypCd COBOL Name:
   * XRF-COV-TYP-CD - polReqCovTypCd COBOL Name: POL-REQ-COV-TYP-CD - sqlcode_Ws COBOL Name:
   * WS-SQLCODE - dsmSqlcode COBOL Name: DSM-SQLCODE - sqlcode COBOL Name: SQLCODE - pol6RetPayLocCd
   * COBOL Name: POL6-RET-PAY-LOC-CD - xrfPayLoc1Nbr COBOL Name: XRF-PAY-LOC-1-NBR -
   * pol6RetPayLocCd2 COBOL Name: POL6-RET-PAY-LOC-CD2 - xrfPayLoc2Nbr COBOL Name: XRF-PAY-LOC-2-NBR
   * - pol6RetStdPolNbr COBOL Name: POL6-RET-STD-POL-NBR - dsmReturnCode COBOL Name: DSM-RETURN-CODE
   * - dsmErrTblAction COBOL Name: DSM-ERR-TBL-ACTION - dsmErrTblName COBOL Name: DSM-ERR-TBL-NAME -
   * dsmErrSectnName COBOL Name: DSM-ERR-SECTN-NAME - dsmErrPgmName COBOL Name: DSM-ERR-PGM-NAME
   *
   * @throws CFException
   */
  @Override
  public FuncCd11ReadMxiOutCtx funcCd11ReadMxi(FuncCd11ReadMxiInCtx methodIn) throws Exception {

    // *81***************************************************************
    // *81 11000-Func-cd11-read-mxi                                     *
    // *81 business function:read the records from the table            *
    // *81***************************************************************
    // *82***************************************************************
    // *82 11000-func-cd11-read-mxi                                     *
    // *82 1. read the pay location code from the table                 *
    // *82***************************************************************
    // Added variable to get the program context in place.
    D5427polCtx programCtx = methodIn.getD5427polCtx();
    // Added variable to get the output context in place.
    FuncCd11ReadMxiOutCtx methodOut = methodIn.getFuncCd11ReadMxiOutCtx();
    //  cobolCode::MOVE POL-REQ-MXI-POL-NBR TO XRF-POL-NBR
    methodOut.setXrfPolNbr(methodOut.getPolReqMxiPolNbr());
    //  cobolCode::MOVE POL-REQ-MXI-PLN-NBR TO XRF-PLN-NBR
    methodOut.setXrfPlnNbr(String.valueOf(methodOut.getPolReqMxiPlnNbrString()).toCharArray());
    //  cobolCode::MOVE POL-REQ-MXI-CLSS-NBR TO XRF-CLSS-NBR
    methodOut.setXrfClssNbr(String.valueOf(methodOut.getPolReqMxiClssNbrString()).toCharArray());
    //  cobolCode::MOVE POL-REQ-EFF-DT TO XRF-EFF-DT
    methodOut.setXrfEffDt(methodOut.getPolReqEffDt());
    //  cobolCode::MOVE POL-REQ-CANC-DT TO XRF-CANC-DT
    methodOut.setXrfCancDt(methodOut.getPolReqCancDt());
    //  cobolCode::MOVE POL-REQ-COV-TYP-CD TO XRF-COV-TYP-CD
    methodOut.setXrfCovTypCd(methodOut.getPolReqCovTypCd());
    //  cobolCode::SELECT PAY_LOC_1_NBR , PAY_LOC_2_NBR , STD_PLN_PLN_NBR , STD_PLN_CLSS_NBR FROM
    // CUST_POL_PLN_XREF WHERE POL_NBR = ? AND COV_TYP_CD = ? AND PLN_NBR = ? AND CLSS_NBR = ? AND (
    // ( EFF_DT <= ? AND CANC_DT >= ? ) OR ( EFF_DT <= ? AND CANC_DT >= ? ) ) ORDER BY EFF_DT ASC
    // FETCH FIRST 1 ROWS ONLY
    d5427polRepository.selectCustPolPlnXref8(
        programCtx.getSqlca(), methodOut.getDclcustPolPlnXref());
    //  cobolCode::MOVE SQLCODE TO WS-SQLCODE DSM-SQLCODE
    methodOut.setSqlcode_Ws(methodOut.getSqlcode());
    methodOut.setDsmSqlcode(methodOut.getSqlcode());
    //  cobolCode::EVALUATE TRUE
    if (methodOut.isSqlcodeOk()) {
      //  cobolCode::MOVE XRF-PAY-LOC-1-NBR TO POL6-RET-PAY-LOC-CD
      methodOut.setPol6RetPayLocCd(methodOut.getXrfPayLoc1Nbr());
      //  cobolCode::MOVE XRF-PAY-LOC-2-NBR TO POL6-RET-PAY-LOC-CD2
      methodOut.setPol6RetPayLocCd2(methodOut.getXrfPayLoc2Nbr());
    } else if (methodOut.isSqlcodeNotFound()) {
      //  cobolCode::MOVE POL-REQ-MXI-POL-NBR TO POL6-RET-STD-POL-NBR
      methodOut.setPol6RetStdPolNbr(methodOut.getPolReqMxiPolNbr());
    } else {
      //  cobolCode::SET DSM-DB2-ERROR TO TRUE
      methodOut.setDsmDb2ErrorTrue();

      //  cobolCode::MOVE 'SELECT' TO DSM-ERR-TBL-ACTION
      methodOut.setDsmErrTblAction(CONSTANTS.LITERAL_SELECT_B4_);
      //  cobolCode::MOVE 'CUST_POL_PLN_XREF' TO DSM-ERR-TBL-NAME
      methodOut.setDsmErrTblName(CONSTANTS.LITERAL_CUST_POL_PLN_XREF_B8_);
      //  cobolCode::MOVE '7000-FUNC-CD6-READ-MXI' TO DSM-ERR-SECTN-NAME
      methodOut.setDsmErrSectnName(CONSTANTS.LITERAL_1149360916);
      //  cobolCode::MOVE 'D5427POL' TO DSM-ERR-PGM-NAME
      //  LITERAL_D5427POL = 'D5427POL'
      methodOut.setDsmErrPgmName(CONSTANTS.LITERAL_D5427POL);
      //  cobolCode::PERFORM 7777-MOVES-FOR-ERROR-LOG
      movesForErrorLog(programCtx.getMovesForErrorLogInCtx()); /*7777-MOVES-FOR-ERROR-LOG SECTION*/
      if (programCtx.isProgramEnded()) {
        return methodOut;
      }
    }

    return methodOut;
  }
  /**
   * getStdMmiData This method is derived from COBOL Paragraph - 12000-GET-STD-MMI-DATA SECTION
   * COBOL Cyclomatic complexity - 5 Input :
   *
   * <p>- sqlcode COBOL Name: SQLCODE - mmiPolNbr COBOL Name: MMI-POL-NBR - mmiPlnNbr COBOL Name:
   * MMI-PLN-NBR
   *
   * <p>Output :
   *
   * <p>- sqlcode_Ws COBOL Name: WS-SQLCODE - dsmSqlcode COBOL Name: DSM-SQLCODE - sqlcode COBOL
   * Name: SQLCODE - pol12StdPolNbr COBOL Name: POL12-STD-POL-NBR - mmiPolNbr COBOL Name:
   * MMI-POL-NBR - pol12StdPlnNbr COBOL Name: POL12-STD-PLN-NBR - mmiPlnNbr COBOL Name: MMI-PLN-NBR
   * - dsmReturnCode COBOL Name: DSM-RETURN-CODE - dsmErrTblAction COBOL Name: DSM-ERR-TBL-ACTION -
   * dsmErrTblName COBOL Name: DSM-ERR-TBL-NAME - dsmErrSectnName COBOL Name: DSM-ERR-SECTN-NAME -
   * dsmErrPgmName COBOL Name: DSM-ERR-PGM-NAME
   *
   * @throws CFException
   */
  @Override
  public GetStdMmiDataOutCtx getStdMmiData(GetStdMmiDataInCtx methodIn) throws Exception {

    // *81***************************************************************
    // *81 12000-Get-std-mmi-data                                       *
    // *81 business function:read the table to retrive the records      *
    // *81***************************************************************
    // *82***************************************************************
    // *82 12000-get-std-mmi-data                                       *
    // *82 1. fetch records from pol_pln_mstr,pol_pln_mstr_addtl_info   *
    // *82    for given policy/plan                                     *
    // *82***************************************************************
    // Added variable to get the program context in place.
    D5427polCtx programCtx = methodIn.getD5427polCtx();
    // Added variable to get the output context in place.
    GetStdMmiDataOutCtx methodOut = methodIn.getGetStdMmiDataOutCtx();
    //  cobolCode::SELECT T1.EVD_BAS_DIALG_IND , T1.NTFY_CRDC_EP_IND , T1.ONC_POL_PRTCP_CD ,
    // T1.SITE_SRVC_PRTCP_CD , T1.CONTR_ST_CD , T1.FUND_TYP_CD , T1.ERISA_IND , T2.SITE_CARE_PROC_CD
    // , T2.GEN_TST_POL_PRTCP_CD , T2.SPCL_RX_IND FROM POL_PLN_MSTR T1 , POL_PLN_MSTR_ADDTL_INFO T2
    // WHERE T1.POL_NBR = ? AND T1.PLN_NBR = ? AND T1.CLSS_NBR = ? AND T1.COV_TYP_CD = ? AND
    // T1.POL_NBR = T2.POL_NBR AND T1.PLN_NBR = T2.PLN_NBR AND T1.CLSS_NBR = T2.CLSS_NBR AND
    // T1.COV_TYP_CD = T2.COV_TYP_CD
    d5427polRepository.selectPolPlnMstr9(
        methodOut.getDclpolPlnMstrAddtlInfo(), methodOut.getDclpolPlnMstr(), programCtx.getSqlca());
    //  cobolCode::MOVE SQLCODE TO WS-SQLCODE DSM-SQLCODE
    methodOut.setSqlcode_Ws(methodOut.getSqlcode());
    methodOut.setDsmSqlcode(methodOut.getSqlcode());
    //  cobolCode::EVALUATE TRUE
    if (methodOut.isSqlcodeOk()) {
      //  cobolCode::MOVE MMI-POL-NBR TO POL12-STD-POL-NBR
      methodOut.setPol12StdPolNbr(methodOut.getMmiPolNbr());
      methodOut.setPol12StdPlnNbr(padLeftZeros(4, methodOut.getMmiPlnNbr(), false));
      //  cobolCode::PERFORM 12200-POPULATE-MMI-RET THRU 12200-EXIT
      populateMmiRet12200(
          programCtx.getPopulateMmiRet12200InCtx()); /*12200-POPULATE-MMI-RET SECTION*/
      if (programCtx.isProgramEnded()) {
        return methodOut;
      }
    } else if (methodOut.isSqlcodeNotFound()) {
      //  cobolCode::SET DSM-ENTRY-NOT-FND-INQ TO TRUE
      methodOut.setDsmEntryNotFndInqTrue();

      //  cobolCode::MOVE 'SELECT' TO DSM-ERR-TBL-ACTION
      methodOut.setDsmErrTblAction(CONSTANTS.LITERAL_SELECT_B4_);
      //  cobolCode::MOVE 'POL_PLN_MSTR' TO DSM-ERR-TBL-NAME
      methodOut.setDsmErrTblName(CONSTANTS.LITERAL_POL_PLN_MSTR_B13_);
      //  cobolCode::MOVE '12000-GET-STD-MMI-DATA' TO DSM-ERR-SECTN-NAME
      methodOut.setDsmErrSectnName(CONSTANTS.LITERAL_425687603);
      //  cobolCode::MOVE 'D5427POL' TO DSM-ERR-PGM-NAME
      //  LITERAL_D5427POL = 'D5427POL'
      methodOut.setDsmErrPgmName(CONSTANTS.LITERAL_D5427POL);
      //  cobolCode::PERFORM 7777-MOVES-FOR-ERROR-LOG
      movesForErrorLog(programCtx.getMovesForErrorLogInCtx()); /*7777-MOVES-FOR-ERROR-LOG SECTION*/
      if (programCtx.isProgramEnded()) {
        return methodOut;
      }
    } else {
      //  cobolCode::SET DSM-DB2-ERROR TO TRUE
      methodOut.setDsmDb2ErrorTrue();

      //  cobolCode::MOVE 'SELECT' TO DSM-ERR-TBL-ACTION
      methodOut.setDsmErrTblAction(CONSTANTS.LITERAL_SELECT_B4_);
      //  cobolCode::MOVE 'POL_PLN_MSTR' TO DSM-ERR-TBL-NAME
      methodOut.setDsmErrTblName(CONSTANTS.LITERAL_POL_PLN_MSTR_B13_);
      //  cobolCode::MOVE '12000-GET-STD-MMI-DATA' TO DSM-ERR-SECTN-NAME
      methodOut.setDsmErrSectnName(CONSTANTS.LITERAL_425687603);
      //  cobolCode::MOVE 'D5427POL' TO DSM-ERR-PGM-NAME
      //  LITERAL_D5427POL = 'D5427POL'
      methodOut.setDsmErrPgmName(CONSTANTS.LITERAL_D5427POL);
      //  cobolCode::PERFORM 7777-MOVES-FOR-ERROR-LOG
      movesForErrorLog(programCtx.getMovesForErrorLogInCtx()); /*7777-MOVES-FOR-ERROR-LOG SECTION*/
      if (programCtx.isProgramEnded()) {
        return methodOut;
      }
    }

    return methodOut;
  }
  /**
   * populateMmiRet12200 This method is derived from COBOL Paragraph - 12200-POPULATE-MMI-RET
   * SECTION COBOL Cyclomatic complexity - 1 Input :
   *
   * <p>- mmiEvdBasDialgInd COBOL Name: MMI-EVD-BAS-DIALG-IND - mmiNtfyCrdcEpInd COBOL Name:
   * MMI-NTFY-CRDC-EP-IND - mmiOncPolPrtcpCd COBOL Name: MMI-ONC-POL-PRTCP-CD - mmiSiteSrvcPrtcpCd
   * COBOL Name: MMI-SITE-SRVC-PRTCP-CD - mmiContrStCd COBOL Name: MMI-CONTR-ST-CD - mmiFundTypCd
   * COBOL Name: MMI-FUND-TYP-CD - mmiErisaInd COBOL Name: MMI-ERISA-IND - mmaSiteCareProcCd COBOL
   * Name: MMA-SITE-CARE-PROC-CD - mmaGenTstPolPrtcpCd COBOL Name: MMA-GEN-TST-POL-PRTCP-CD -
   * mmaSpclRxInd COBOL Name: MMA-SPCL-RX-IND
   *
   * <p>Output :
   *
   * <p>- pol12RetEvdBasDialgInd COBOL Name: POL12-RET-EVD-BAS-DIALG-IND - mmiEvdBasDialgInd COBOL
   * Name: MMI-EVD-BAS-DIALG-IND - pol12RetNtfyCrdcEpInd COBOL Name: POL12-RET-NTFY-CRDC-EP-IND -
   * mmiNtfyCrdcEpInd COBOL Name: MMI-NTFY-CRDC-EP-IND - pol12RetOncPolPrtcpCd COBOL Name:
   * POL12-RET-ONC-POL-PRTCP-CD - mmiOncPolPrtcpCd COBOL Name: MMI-ONC-POL-PRTCP-CD -
   * pol12RetSiteSrvcPrtcpCd COBOL Name: POL12-RET-SITE-SRVC-PRTCP-CD - mmiSiteSrvcPrtcpCd COBOL
   * Name: MMI-SITE-SRVC-PRTCP-CD - pol12RetContrStCd COBOL Name: POL12-RET-CONTR-ST-CD -
   * mmiContrStCd COBOL Name: MMI-CONTR-ST-CD - pol12RetFundTypCd COBOL Name: POL12-RET-FUND-TYP-CD
   * - mmiFundTypCd COBOL Name: MMI-FUND-TYP-CD - pol12RetErisaInd COBOL Name: POL12-RET-ERISA-IND -
   * mmiErisaInd COBOL Name: MMI-ERISA-IND - pol12RetSiteCareProcCd COBOL Name:
   * POL12-RET-SITE-CARE-PROC-CD - mmaSiteCareProcCd COBOL Name: MMA-SITE-CARE-PROC-CD -
   * pol12RetGenTstPolPrtcpCd COBOL Name: POL12-RET-GEN-TST-POL-PRTCP-CD - mmaGenTstPolPrtcpCd COBOL
   * Name: MMA-GEN-TST-POL-PRTCP-CD - pol12RetSpclRxInd COBOL Name: POL12-RET-SPCL-RX-IND -
   * mmaSpclRxInd COBOL Name: MMA-SPCL-RX-IND
   *
   * @throws CFException
   */
  @Override
  public PopulateMmiRet12200OutCtx populateMmiRet12200(PopulateMmiRet12200InCtx methodIn)
      throws Exception {

    // *81***************************************************************
    // *81 12200-Populate-mmi-ret                                       *
    // *81 business function: populate the mmi return fields            *
    // *81***************************************************************
    // *82***************************************************************
    // *82 12200-populate-mmi-ret                                       *
    // *82 1. populate the mmi return fields                            *
    // *82***************************************************************
    // Added variable to get the program context in place.
    D5427polCtx programCtx = methodIn.getD5427polCtx();
    // Added variable to get the output context in place.
    PopulateMmiRet12200OutCtx methodOut = methodIn.getPopulateMmiRet12200OutCtx();
    //  cobolCode::MOVE MMI-EVD-BAS-DIALG-IND TO POL12-RET-EVD-BAS-DIALG-IND
    methodOut.setPol12RetEvdBasDialgInd(methodOut.getMmiEvdBasDialgInd());
    //  cobolCode::MOVE MMI-NTFY-CRDC-EP-IND TO POL12-RET-NTFY-CRDC-EP-IND
    methodOut.setPol12RetNtfyCrdcEpInd(methodOut.getMmiNtfyCrdcEpInd());
    //  cobolCode::MOVE MMI-ONC-POL-PRTCP-CD TO POL12-RET-ONC-POL-PRTCP-CD
    methodOut.setPol12RetOncPolPrtcpCd(methodOut.getMmiOncPolPrtcpCd());
    //  cobolCode::MOVE MMI-SITE-SRVC-PRTCP-CD TO POL12-RET-SITE-SRVC-PRTCP-CD
    methodOut.setPol12RetSiteSrvcPrtcpCd(methodOut.getMmiSiteSrvcPrtcpCd());
    //  cobolCode::MOVE MMI-CONTR-ST-CD TO POL12-RET-CONTR-ST-CD
    methodOut.setPol12RetContrStCd(methodOut.getMmiContrStCd());
    //  cobolCode::MOVE MMI-FUND-TYP-CD TO POL12-RET-FUND-TYP-CD
    methodOut.setPol12RetFundTypCd(methodOut.getMmiFundTypCd());
    //  cobolCode::MOVE MMI-ERISA-IND TO POL12-RET-ERISA-IND
    methodOut.setPol12RetErisaInd(methodOut.getMmiErisaInd());
    //  cobolCode::MOVE MMA-SITE-CARE-PROC-CD TO POL12-RET-SITE-CARE-PROC-CD
    methodOut.setPol12RetSiteCareProcCd(methodOut.getMmaSiteCareProcCd());
    //  cobolCode::MOVE MMA-GEN-TST-POL-PRTCP-CD TO POL12-RET-GEN-TST-POL-PRTCP-CD
    methodOut.setPol12RetGenTstPolPrtcpCd(methodOut.getMmaGenTstPolPrtcpCd());
    //  cobolCode::MOVE MMA-SPCL-RX-IND TO POL12-RET-SPCL-RX-IND
    methodOut.setPol12RetSpclRxInd(methodOut.getMmaSpclRxInd());

    return methodOut;
  }
  /**
   * movesForErrorLog This method is derived from COBOL Paragraph - 7777-MOVES-FOR-ERROR-LOG SECTION
   * COBOL Cyclomatic complexity - 1 Input :
   *
   * <p>- polReqClngProg COBOL Name: POL-REQ-CLNG-PROG - dsmPgmName COBOL Name: WS-DSM-PGM-NAME
   *
   * <p>Output :
   *
   * <p>- dsmErrClngPgmName COBOL Name: DSM-ERR-CLNG-PGM-NAME - polReqClngProg COBOL Name:
   * POL-REQ-CLNG-PROG - dsmErrPgmName COBOL Name: DSM-ERR-PGM-NAME - dsmPgmName COBOL Name:
   * WS-DSM-PGM-NAME
   *
   * @throws CFException
   */
  @Override
  public MovesForErrorLogOutCtx movesForErrorLog(MovesForErrorLogInCtx methodIn) throws Exception {

    // *81***************************************************************
    // *81 7777-Moves-for-error-log                                     *
    // *81 1. populate fields in vypolara for error logging             *
    // *81 2. evaluate on sqlcode and then goback to calling pgm        *
    // *81***************************************************************
    // Added variable to get the program context in place.
    D5427polCtx programCtx = methodIn.getD5427polCtx();
    // Added variable to get the output context in place.
    MovesForErrorLogOutCtx methodOut = methodIn.getMovesForErrorLogOutCtx();
    //  cobolCode::MOVE POL-REQ-CLNG-PROG TO DSM-ERR-CLNG-PGM-NAME
    methodOut.setDsmErrClngPgmName(methodOut.getPolReqClngProg());
    //  cobolCode::MOVE WS-DSM-PGM-NAME TO DSM-ERR-PGM-NAME
    methodOut.setDsmErrPgmName(methodOut.getDsmPgmName());
    //  cobolCode::PERFORM 9999-SQL-ERROR-PROCESS
    sqlErrorProcess(programCtx.getSqlErrorProcessInCtx()); /*9999-SQL-ERROR-PROCESS SECTION*/
    if (programCtx.isProgramEnded()) {
      return methodOut;
    }

    return methodOut;
  }
  /**
   * sqlErrorProcess This method is derived from COBOL Paragraph - 9999-SQL-ERROR-PROCESS SECTION
   * COBOL Cyclomatic complexity - 18 Input :
   *
   * <p>- sqlcode COBOL Name: SQLCODE
   *
   * <p>Output :
   *
   * <p>- dsmSqlcode COBOL Name: DSM-SQLCODE - sqlcode COBOL Name: SQLCODE - dsmErrTxt COBOL Name:
   * DSM-ERR-TXT - dsmSqlErrorLevel COBOL Name: DSM-SQL-ERROR-LEVEL
   *
   * @throws CFException
   */
  @Override
  public SqlErrorProcessOutCtx sqlErrorProcess(SqlErrorProcessInCtx methodIn) throws Exception {

    // *            Kumar   clean-up warning messages.                  *
    // *                   >added an if condition to check sqlcode when *
    // *                    it is zero.also moved evaluate sqlcode      *
    // *                    statement within else part to check the sql *
    // *                    return code other than zero and goback      *
    // *                    statement to terminate the execution of the *
    // *                    program whenever sqlcode is not zero.       *
    // *                   >there is no changes in the functionalities  *
    // *                    of this copybook.                           *
    // *                   >this copybook has been changed to remove the*
    // *                    warning message code igyop3093-w.           *
    // ******************************************************************
    // Added variable to get the program context in place.
    D5427polCtx programCtx = methodIn.getD5427polCtx();
    // Added variable to get the output context in place.
    SqlErrorProcessOutCtx methodOut = methodIn.getSqlErrorProcessOutCtx();
    //  cobolCode::MOVE SQLCODE TO DSM-SQLCODE
    methodOut.setDsmSqlcode(methodOut.getSqlcode());
    //  cobolCode::IF SQLCODE = +000
    //  cobolCode::ELSE
    if ((methodOut.getSqlcode() != 0)) {

      // ***  Evaluate sqlcode
      //  cobolCode::EVALUATE SQLCODE
      switch (methodOut.getSqlcode()) {
        case +100:
          //  cobolCode::MOVE '+100: RECORD NOT FOUND ' TO DSM-ERR-TXT
          methodOut.setDsmErrTxt(CONSTANTS.LITERAL_1685312042);
          //  cobolCode::SET DSM-NOTFOUND-ERROR TO TRUE
          methodOut.setDsmNotfoundErrorTrue();

          break;
        case -180:
          //  cobolCode::MOVE '-180: DATE/TIME/TIMESTAMP INVALID ' TO DSM-ERR-TXT
          methodOut.setDsmErrTxt(CONSTANTS.LITERAL_1336588646);
          //  cobolCode::SET DSM-VALUE-ERROR TO TRUE
          methodOut.setDsmValueErrorTrue();

          break;
        case -501:
          //  cobolCode::MOVE '-501: CURSOR NOT OPEN FOR FETCH ' TO DSM-ERR-TXT
          methodOut.setDsmErrTxt(CONSTANTS.LITERAL_859286545);
          //  cobolCode::SET DSM-PROCESS-ERROR TO TRUE
          methodOut.setDsmProcessErrorTrue();

          break;
        case -502:
          //  cobolCode::MOVE '-502: CURSOR ALREADY OPEN ' TO DSM-ERR-TXT
          methodOut.setDsmErrTxt(CONSTANTS.LITERAL_980244056);
          //  cobolCode::SET DSM-PROCESS-ERROR TO TRUE
          methodOut.setDsmProcessErrorTrue();

          break;
        case -803:
          //  cobolCode::MOVE '-803: DUP INSERT, KEY ALREADY EXIST' TO DSM-ERR-TXT
          //  LITERAL_1968872792 = '-803: DUP INSERT, KEY ALREADY EXIST'
          methodOut.setDsmErrTxt(CONSTANTS.LITERAL_1968872792);
          //  cobolCode::SET DSM-DUPLICATE-ERROR TO TRUE
          methodOut.setDsmDuplicateErrorTrue();

          break;
        case -805:
          //  cobolCode::MOVE '-805: DBRM/PACKG NOT FND,REBIND RQD' TO DSM-ERR-TXT
          //  LITERAL_1471723776 = '-805: DBRM/PACKG NOT FND,REBIND RQD'
          methodOut.setDsmErrTxt(CONSTANTS.LITERAL_1471723776);
          //  cobolCode::SET DSM-PACKAGE-ERROR TO TRUE
          methodOut.setDsmPackageErrorTrue();

          break;
        case -904:
          //  cobolCode::MOVE '-904: RESOURCE UNAVAILABLE ' TO DSM-ERR-TXT
          methodOut.setDsmErrTxt(CONSTANTS.LITERAL_385706472);
          //  cobolCode::SET DSM-SYSTEM-ERROR TO TRUE
          methodOut.setDsmSystemErrorTrue();

          break;
        case -911:
          //  cobolCode::MOVE '-911: DEADLOCK OR TIMEOUT OCCURED ' TO DSM-ERR-TXT
          methodOut.setDsmErrTxt(CONSTANTS.LITERAL_1620162762);
          //  cobolCode::SET DSM-SYSTEM-ERROR TO TRUE
          methodOut.setDsmSystemErrorTrue();

          break;
        case -922:
          //  cobolCode::MOVE '-922: CONNECTION NOT ESTABLISHED ' TO DSM-ERR-TXT
          methodOut.setDsmErrTxt(CONSTANTS.LITERAL_807482241);
          //  cobolCode::SET DSM-SYSTEM-ERROR TO TRUE
          methodOut.setDsmSystemErrorTrue();

          break;
        case -923:
          //  cobolCode::MOVE '-923: CONNECTION NOT ESTABLISHED ' TO DSM-ERR-TXT
          methodOut.setDsmErrTxt(CONSTANTS.LITERAL_1303808128);
          //  cobolCode::SET DSM-SYSTEM-ERROR TO TRUE
          methodOut.setDsmSystemErrorTrue();

          break;
        case -927:
          //  cobolCode::MOVE '-927: DB2 CONN NOT ESTABLISHED ' TO DSM-ERR-TXT
          methodOut.setDsmErrTxt(CONSTANTS.LITERAL_1659151422);
          //  cobolCode::SET DSM-SYSTEM-ERROR TO TRUE
          methodOut.setDsmSystemErrorTrue();

          break;
        default:
          //  cobolCode::MOVE 'SEE SQLCODE AND ERROR AREA FOR INFO' TO DSM-ERR-TXT
          //  LITERAL_228553855 = 'SEE SQLCODE AND ERROR AREA FOR INFO'
          methodOut.setDsmErrTxt(CONSTANTS.LITERAL_228553855);
          //  cobolCode::SET DSM-UNDEFINED-ERROR TO TRUE
          methodOut.setDsmUndefinedErrorTrue();
      }

      // ***  End-evaluate.
      //  cobolCode::GOBACK
      setNotLogged(false); // no need to log, it is a normal termination
      programCtx.setProgramEnded(true);
      return methodOut;
    }

    return methodOut;
  }

  public int call(ProgramContext ctx, Object[] params) throws Exception {
    D5427polCtx programCtx = (D5427polCtx) ctx;

    int len = params.length;
    if (len > 0 && params[0] != null) programCtx.getDsmCallArea().set((Field) params[0]);
    if (len > 1 && params[1] != null) programCtx.getDsmDataArea().set((Field) params[1]);
    if (len > 2 && params[2] != null) programCtx.getDsmRet1Area().set((Field) params[2]);
    if (len > 3 && params[3] != null) programCtx.getDsmRet2Area().set((Field) params[3]);
    if (len > 4 && params[4] != null) programCtx.getDsmRet3Area().set((Field) params[4]);
    if (len > 5 && params[5] != null) programCtx.getDsmRet4Area().set((Field) params[5]);
    if (len > 6 && params[6] != null) programCtx.getDsmRet5Area().set((Field) params[6]);
    if (len > 7 && params[7] != null) programCtx.getDsmRet6Area().set((Field) params[7]);
    if (len > 8 && params[8] != null) programCtx.getDsmRet7Area().set((Field) params[8]);
    if (len > 9 && params[9] != null) programCtx.getDsmRet8Area().set((Field) params[9]);
    if (len > 10 && params[10] != null) programCtx.getDsmRet9Area().set((Field) params[10]);
    if (len > 11 && params[11] != null) programCtx.getDsmRet10Area().set((Field) params[11]);
    if (len > 12 && params[12] != null) programCtx.getDsmRet12Area().set((Field) params[12]);
    // invoke the process and return rc
    return process(programCtx);
  }

  public int call(ProgramContext ctx, Field... parameters) throws Exception {
    D5427polCtx programCtx = (D5427polCtx) ctx;
    for (int index = 0; index < parameters.length; index++) {
      switch (index) {
        case 0:
          if (parameters[index] != null) {
            if (parameters[index] instanceof DsmCallArea) {
              programCtx.setDsmCallArea((DsmCallArea) parameters[index]);
            } else {
              programCtx.getDsmCallArea().set(parameters[index]);
            }
          }

          break;
        case 1:
          if (parameters[index] != null) {
            if (parameters[index] instanceof DsmDataArea) {
              programCtx.setDsmDataArea((DsmDataArea) parameters[index]);
            } else {
              programCtx.getDsmDataArea().set(parameters[index]);
            }
          }

          break;
        case 2:
          if (parameters[index] != null) {
            if (parameters[index] instanceof DsmRet1Area) {
              programCtx.setDsmRet1Area((DsmRet1Area) parameters[index]);
            } else {
              programCtx.getDsmRet1Area().set(parameters[index]);
            }
          }

          break;
        case 3:
          if (parameters[index] != null) {
            if (parameters[index] instanceof DsmRet2Area) {
              programCtx.setDsmRet2Area((DsmRet2Area) parameters[index]);
            } else {
              programCtx.getDsmRet2Area().set(parameters[index]);
            }
          }

          break;
        case 4:
          if (parameters[index] != null) {
            if (parameters[index] instanceof DsmRet3Area) {
              programCtx.setDsmRet3Area((DsmRet3Area) parameters[index]);
            } else {
              programCtx.getDsmRet3Area().set(parameters[index]);
            }
          }

          break;
        case 5:
          if (parameters[index] != null) {
            if (parameters[index] instanceof DsmRet4Area) {
              programCtx.setDsmRet4Area((DsmRet4Area) parameters[index]);
            } else {
              programCtx.getDsmRet4Area().set(parameters[index]);
            }
          }

          break;
        case 6:
          if (parameters[index] != null) {
            if (parameters[index] instanceof DsmRet5Area) {
              programCtx.setDsmRet5Area((DsmRet5Area) parameters[index]);
            } else {
              programCtx.getDsmRet5Area().set(parameters[index]);
            }
          }

          break;
        case 7:
          if (parameters[index] != null) {
            if (parameters[index] instanceof DsmRet6Area) {
              programCtx.setDsmRet6Area((DsmRet6Area) parameters[index]);
            } else {
              programCtx.getDsmRet6Area().set(parameters[index]);
            }
          }

          break;
        case 8:
          if (parameters[index] != null) {
            if (parameters[index] instanceof DsmRet7Area) {
              programCtx.setDsmRet7Area((DsmRet7Area) parameters[index]);
            } else {
              programCtx.getDsmRet7Area().set(parameters[index]);
            }
          }

          break;
        case 9:
          if (parameters[index] != null) {
            if (parameters[index] instanceof DsmRet8Area) {
              programCtx.setDsmRet8Area((DsmRet8Area) parameters[index]);
            } else {
              programCtx.getDsmRet8Area().set(parameters[index]);
            }
          }

          break;
        case 10:
          if (parameters[index] != null) {
            if (parameters[index] instanceof DsmRet9Area) {
              programCtx.setDsmRet9Area((DsmRet9Area) parameters[index]);
            } else {
              programCtx.getDsmRet9Area().set(parameters[index]);
            }
          }

          break;
        case 11:
          if (parameters[index] != null) {
            if (parameters[index] instanceof DsmRet10Area) {
              programCtx.setDsmRet10Area((DsmRet10Area) parameters[index]);
            } else {
              programCtx.getDsmRet10Area().set(parameters[index]);
            }
          }

          break;
        case 12:
          if (parameters[index] != null) {
            if (parameters[index] instanceof DsmRet12Area) {
              programCtx.setDsmRet12Area((DsmRet12Area) parameters[index]);
            } else {
              programCtx.getDsmRet12Area().set(parameters[index]);
            }
          }

          break;
      }
    }
    return process(programCtx);
  }
}
  /*
   *============================================================*<<<<
   * note: for 2014 q3 - alm #1167                              *<<<<
   *       =======================                              *<<<<
   * this dsm will use a cobparm containing the non-standard    *<<<<
   * specification of dynam (instead of non-dynam)              *<<<<
   * this is specifically done to support calls from the prime  *<<<<
   * program m534236a where the dsm will be running under the   *<<<<
   * ims batch controller (dfsrcc00).                           *<<<<
   * when running under ims db2 programs must be compiled       *<<<<
   * with the dynam option.                                     *<<<<
   * ---------------------------------------------------------- *<<<<
   * be sure to include the cobparm dynam in future maintenance *<<<<
   * ---------------------------------------------------------- *<<<<
   *============================================================*<<<<
   *00***************************************************************
   *00    licensed materials - property of united health group      *
   *00                                                              *
   *00 s m e   r e v i e w e d - comments have been reviewed by sme *
   *00                                                              *
   *00***************************************************************
   *10***************************************************************
   *10  program name       :  d5427pol.                             *
   *10  business function  :  db2 data service module.              *
   *10  designed by        :  anuj                                  *
   *10  programmed by      :  anuj.                                 *
   *10  date coded         :  rel q4-10.                            *
   *10  type               :  online.                               *
   *10***************************************************************
   *20***************************************************************
   *20  major program process:                                      *
   *20 1.                                                           *
   *20  this module is called by the broker module  which pass the  *
   *20  details regarding the mmi policy,plan,start and end dates   *
   *20  of the coverage by querying the mxi table.                  *
   *20 2.                                                           *
   *20  this db2 pol obtains  the db2 data (read/write/delete) on   *
   *20  the basis of the func-cd received from the application      *
   *20  program for mmi tables                                      *
   *20***************************************************************
   *30***************************************************************
   *30  program change log:                                         *
   *30                                                              *
   *30  pr #       date        level#                               *
   *30  -----      -----       -------                              *
   *30             q4-10       sprf#4-33120.                        *
   *30 anuj        q4-10       sprf#4-33120 initial build.          *
   *30 anuj        q4-10       defect #13560 - remove reading tci   *
   *30                         to continue with mmi read when mxi   *
   *30                         record not found.                    *
   *30                         handle not found for mmi child tables*
   *30 varshi      q4-10       defect #14638 - corrected a field in *
   *30                         query (psy_cyr_comb_prsc_max_amt) in *
   *30                         3400-func-cd2-get-mmi section.       *
   *30 sreeja      q4-10       defect #15746 fix                    *
   *30 sreeja      q4-10       defect #15746 fix - field changed    *
   *30                         from xrf- to pol- to  avoid confusion*
   *30                         for the cov-typ-cd field             *
   *30 sreeja      q4-10       fix for maint hpsd #  99658          *
   *30 mtrzaska    q1-11       4-33827 cdb core processing -        *
   *30                         added more columns to be retrieved   *
   *30                         from pol_pln_mstr table for func 4.  *
   *30 niranjan    q2-11       hpsd# 111137 - missing cov_typ_cd in *
   *30                         where clause ofcursor cur-fam-ded-csr*
   *30                         and section 3400-func-cd2-get.       *
   *30 m trzaska   2011-07-12  hpsm ticket pm10014705               *
   *30                         added logic for myuhc prod issue to  *
   *30                         resolve definity functionality not   *
   *30                         carried forward from 270/271 4010 to *
   *30                         5010 processing.                     *
   *30 m hartwell  q3-12       added new fields                     *
   *30 m trzaska   q3-12       defect #1561    - modified code to   *
   *30                         process new col new_coins_accum_cd   *
   *30                         on policy table, also add psv_1_cd.  *
   *30 m hartwell  q4-12       sprf 4-48088c removed all reciprocity*
   *30                         processing. changed sourcing of      *
   *30                         pref-ntwk-cd from mmi and mxi tables *
   *30                         to ntwk_rcprcty_dtl table            *
   *30 m hartwell  q1-13       pm fix 10092376 uncommented move     *
   *30                         mmi-rcprcty-tbl-id to                *
   *30                         pol4-tci-table-number                *
   *30 pravesh     q1-14       sprf 4-57589 tiered benefit plan     *
   *30 kumar                   enhancements - added new field i.e.  *
   *30                         plan_features                        *
   *30 pravesh     q1-14       sprf 4-58912 navigate enhancements   *
   *30 kumar                   - added fund_typ_cd, and allnc_cd    *
   *30                         for func cd 4                        *
   *30 pravesh     q1-14       sprf 4-60541 remediation of 271 resp.*
   *30 kumar                   - added new field -reverse tiered ind*
   *30                         for func-cd 9 with new interface copy*
   *30 gaurav      q1-14       alm #1189 defect fix                 *
   *30 bhatnagar               enabled call from m529350u.          *
   *30                         added function code-7 for mmi/mxi    *
   *30                         policy search.                       *
   *30 pravesh     q1-14       alm - 2838,use interface copybook    *
   *30 kumar                   vypolrt8 instead of vypolrt9         *
   *30 gaurav      q1-14       changed return to tops only direct   *
   *30 bhatnagar               keyed allowed policy screen(m529350u)*
   *30 pravesh k.  q1-14       alm - 3064, sprf 4-58724             *
   *30                         added new interface copybook vypolrt7*
   *30 2014-02-27 mcgarry        q3 2014 release                    *
   *30              sprf # 400061708 - bls member eligibility       *
   *30              - added add'l fields for func-cd '03'           *
   *30                -- pol3-ret-fund-typ-cd                       *
   *30                -- pol3-ret-prdct-key-cd                      *
   *30                -- pol3-ret-mbr-prdct-typ-cd                  *
   *30                                                              *
   *30 2014-06-06 - mcgarry - q3 2014 release.                      *
   *30              sprf # 400061708 member eligibility id cards    *
   *30              alm # 1167 - added commentary & explanation     *
   *30              for cobparm dynam requirement for ims batch     *
   *30              - no actual code changes -                      *
   *30                                                              *
   *30 relq414 mcgarry - sprf #4-64985 case effective garage charter*
   *30                    - field added to func-cd '4' response :   *
   *30                      -- pol4-prdct-cd-id sourced from        *
   *30                      sourced from :                          *
   *30                      -- pol_pln_mstr.prdct_cd_id             *
   *30 relq414 pravesh - sprf #4-65143 emergent wrap                *
   *30         kumar      - field added to func-cd '4' response :   *
   *30                      -- pol4-emergent-wrap-ind sourced from  *
   *30                         cust_pol_pln_xref & pol_pln_mstr     *
   *30                      if er on mxi is not space then ind would*
   *30                      be valued from cust_pol_pln_xref else   *
   *30                      would be valued from pol_pln_mstr table.*
   *30 relq414 pravesh   sprf# 4-65909 empire hcr changes for moop  *
   *30         kumar      - added empire moop field oop_max_cov_cd  *
   *30                      for func-cd 02,04 & func-cd 08.         *
   *30                    - added spcl_proc_6_cd in func-cd 04      *
   *30                      return area for the brand new value("2")*
   *30                      to indicate whether it's a grandfather  *
   *30                      plan or not.                            *
   *30 shalinder k q2-15  -    sos 13-2681 changes to get mxi start *
   *30                         and end date from table and pass back*
   *30                         to the calling module                *
   *30 relq315 jesse     sprf# 4-70293                              *
   *30         howe            changes made for accessing plan      *
   *30                         features table information           *
   *30 relq315 marina    sprf# 4-67896                              *
   *30         myaskovsky      changes made for accessing           *
   *30                         pol_pln_accum_rule table and         *
   *30                         additional information from          *
   *30                         pol_pln_mstr table                   *
   *30 relq315 marina    sprf# 4-67896 alm# 6330                    *
   *30         myaskovsky  change to check for literal 'cpay' in    *
   *30                     dclgen field dacm-accum-rule-typ-cd      *
   *30 relq415 pravesh   sprf 4-67896 - prj-18468 cr-22922          *
   *30         kumar       added new field oon lifetime maximum for *
   *30                     func-cd 08.                              *
   *30 relq116 marina    sprf 4-68160 - prj-45311                   *
   *30         myaskovsky  urgent care place of service             *
   *30            added new field(svi_tbl_ter_nbr) func-cd 03       *
   *30 relq116 mcgarry   sprf 4-70839 -  prj20674n                  *
   *30                     case effective                           *
   *30                   new fields - func-cd 03                    *
   *30                   -- pol3-ntfy-crdc-ep-ind                   *
   *30                   -- pol3-onc-pol-prtcp-cd                   *
   *30                   -- pol3-evd-bas-dialg-ind                  *
   *30                   -- pol3-core-med-prr-auth-cd               *
   *30 relq116 mcgarry   sprf 4-70839 -  prj20674n                  *
   *30                     case effective - alm #2739               *
   *30                   correction - func-cd 03                    *
   *30                   -- pol3-ntfy-crdc-ep-ind                   *
   *30                   -- pol3-onc-pol-prtcp-cd                   *
   *30                   -- pol3-evd-bas-dialg-ind                  *
   *30                   -- pol3-core-med-prr-auth-cd               *
   *30 relq116 mcgarry   sprf 4-70839 -  prj20674n                  *
   *30                     case effective - alm #2739               *
   *30                   correction - func-cd 03                    *
   *30                   -- pol3-rel-srvc-ind                       *
   *30 relq116 mcgarry   sprf 4-70839 -  prj20674n                  *
   *30                     case effective - alm #2741               *
   *30                   add pol_pln_mstr.core_med_prr_auth_cd      *
   *30                     source for pol3-core-med-prr-auth-cd     *
   *30 relq116 marina    q1 2016 maint pm ticket #pm10337064        *
   *30         myaskovsky added to move mxi effective date to       *
   *30                    mmi effective date for func-cd 01         *
   *30 relq116 mike      q1 2016 maint pm ticket #pm10340200        *
   *30         trzaska    added sources of fam sal typ, ind sal typ,*
   *30                    fam multi. plus ee+1, ee+sp, ee+ch core   *
   *30                    amounts for both inn and oon for a total  *
   *30                    of nine new fields to satisfy % of salary *
   *30                    for core oop.                             *
   *30 03/15/16 mcgarry   q1-16  alm #8588 pm ticket #pm10348762    *
   *30                    added new function to retrieve latest mxi *
   *30                    dsm-func '14' - same as '04' except       *
   *30                     - latest mxi is retrieved                *
   *30                     - eff/canc dates from mxi added to request
   *30 relq316 marina    sprf prj70895 remediation of 271 (unet)    *
   *30         myaskovsky                                           *
   *30                   added new fields for func-cd 04, 05, and 06*
   *30                   pol4-ret-lmt-srvc-cd                       *
   *30                   pol5-mcr-ind                               *
   *30                   pol6-ret-xrf-lmt-srvc-cd                   *
   *30 2016-08-17 mcgarry        release q4 2016 prj 58434         **
   *30                           added new fields                  **
   *30 2016-09-08 mike trzaska   release q4 2016 prj 72394-aco sold**
   *30                           added new query to get specific   **
   *30                           contract based tiering cd and     **
   *30                           uhp ind.                          **
   *30 2016-09-19 mike trzaska   defect alm 2086 - returned pol,   **
   *30                           pln, class, cov-typ-cd not return **
   *30                           from func8 when mxi not found.    **
   *30                           needed for when calling module    **
   *30                           checks for plan features after    **
   *30                           return from this module.          **
   *30 2016-11-08 mike trzaska   release q1 2017 prj 72377 -       **
   *30                           edi referral indicator.           **
   *30                           add logic to func 08 to derive    **
   *30                           new plan level referral indicator.**
   *30 2017-02-06 marina         release q2 2017 prj73361  -       **
   *30            myaskovsky     oop max plan year display issue   **
   *30                           remove changes for pm10337064     **
   *30                           to get mmi record for ben period  **
   *30 2017-04-24 marina         release q3 2017 prj58739n -        *
   *30            myaskovsky     genetic testing prior auth         *
   *30                           new field  - func-cd 03            *
   *30                           -- pol3-gen-pol-prtcp-cd           *
   *30 2017-06-12 marina         release q3 2017 prj58739n -        *
   *30            myaskovsky     alm # 743                          *
   *30 2017-08-25 - mcgarry       - q4-17, prj24679 -
   *30                              se region capital requests
   *30                              added new field for
   *30                              pol8-nhp-ntwk-flex-ind
   *30 2018-03-13 - subhash       - q2-18, prj139965 -              *
   *30              chandra         site of care - added new fields *
   *30                              for pol8-ret-product-cd and     *
   *30                              pol8-ret-mkt-typ-cd from        *
   *30                              ntwk_rcprcty_dtl table          *
   *30 2018-04-04 - subhash       - q2-18, prj139965 -              *
   *30              chandra         alm defect #1197                *
   *30                                                              *
   *30 2018-03-29 - marina        - m6-18, prj124284 - tiering rules*
   *30              myaskovsky      engine integration on unet      *
   *30                              added new fields for            *
   *30                              pol4-npt-rule-pkg-id and        *
   *30                              pol8-npt-rule-pkg-id            *
   *30 2019-03-14 - marina        - m4-19, prb0417627- tiering rules*
   *30              myaskovsky      added logic to supress value 0  *
   *30                              in uhpd indicator               *
   *30 2019-05-07 - marina myaskovsky  prj172375 added pln-ind      *
   *30              for use in defining benefit sets for            *
   *30              preferred lab network                           *
   *30 2019-05-30 marina         release m8 2019 prj161406 -        *
   *30            myaskovsky     global request-2nd opinion vendor  *
   *30                           new field  - func-cd 03            *
   *30                           -- pol3-sec-opin-vend-cd           *
   *30 2019-06-25 - marina myaskovsky prj179220 musculoskeletal     *
   *30                                plan management               *
   *30 2020-01-02 - marina        - m02-20 prj199068 wa oon         *
   *30              myaskovsky    adding contract state to func-cd 8*
   *30 2020-04-02 - marina myaskovsky  covid-19 changes             *
   *30 2020-06-13 - raj s        prj206574 adding shared savings ind*
   *30                            from pol_pln_mstr table           *
   *30 2020-08-14 - raj s        prj268782 cire edit rule routing   *
   *30                       adding bhv cd and caus cd              *
   *30 2020-08-14 - marina        - m08-20 prj207393                *
   *30              myaskovsky    adding 17 svi tables              *
   *30 2020-10-10 - ankita        - m10-20 prj208152                *
   *30              agarwal       adding new func cd 10             *
   *30 2020-09-23 - marina myaskovsky - prj202568 adding rx coupon  *
   *30                                  indicator func-cd 8         *
   *30 2021-01-25 - marina myaskovsky  prj272209 added tier_rsn_cd  *
   *30              for use in defining benefit sets for dpp        *
   *30 rel21m08 venu yadav - mdtr-2021-0620-1a-tops- changes include*
   *30                       sql redesign of select statement for   *
   *30                       performance in 4010-func-cd3-polsvi-mmi*
   *30                       read para.                             *
   *30 rel22m01 raj s      - prj277822             - changes include*
   *30                       sql to get payloc-2                    *
   *30 rel22m01 raj s      - prj277822 - changes ot include dsm     *
   *30                       func cd 11 on valuation                *
   *30 rel22m02 palash d   - prj175661                              *
   *30                       fetch pa,ebr,ebc,onc,sos,health        *
   *30                       plan state,funding arrngmnt ,soc,gen,  *
   *30                       srx fields from pol_pln_mstr and       *
   *30                       pol_pln_mstr_addtl_info tables and     *
   *30                       populating emccqrcm copybook.          *
   *30                       called by m529345f and m529345a        *
   *30 rel22m12 palash d   - prj175661 enterprise workflow router   *
   *30                       fetch erisa_ind from db2 table         *
   *30                       pol_pln_mstr                           *
   *30 rel23m04 marina     - prj296934                              *
   *30          myaskovsky   adding new medical coupon ind          *
   *30 rel23m5 marina m    - prj297801 upper lower gi               *
   *30 rel24m05 amit       - prb1429860 get qualcomm set id - fetch *
   *30          kumar        mml_cov_set_nbr from cust_pol_pln_xref *
   *30 rel24m08 marina     - prj41447 added dual-oop-nbr-ind to     *
   *30          myaskovsky   fnc-cd 4                               *
   *30***************************************************************
   *40***************************************************************
   *40  external called programs:                                   *
   *40                                                              *
   *40  name          description              call/link/xctl/start *
   *40  ----          -----------              -------------------- *
   *40                                                              *
   *40***************************************************************
   *50***************************************************************
   *50  return codes:                                               *
   *50                                                              *
   *50  code                 description                            *
   *50  ---------------      ------------------------------------   *
   *50                                                              *
   *50***************************************************************
   *60***************************************************************
   *60  database used:                                              *
   *60                                                              *
   *60  database                    description                     *
   *60  ---------                   ------------                    *
   *60  cust_pol_pln                mxi policy and plan header      *
   *60  cust_pol_pln_arng           mxi policy and plan ppo         *
   *60  cust_pol_pln_xref           mxi policy and plan xref        *
   *60  pol_pln_mstr                db2 database for policy plan    *
   *60                              master file                     *
   *60  pol_pln_mstr_ben_lvl        db2 database for policy plan    *
   *60                              master benefit level table      *
   *60  pol_pln_mstr_fam_ded        db2 database for policy plan    *
   *60                              master family deductible table  *
   *60  pol_pln_mstr_indv_ded       db2 database for policy plan    *
   *60                              master individual deductible    *
   *60  pol_pln_mstr_ppo_arng       db2 database for policy plan    *
   *60                              master ppo arrangement table    *
   *60                                                              *
   *60***************************************************************
   *70***************************************************************
   *70***************************************************************
   *70  tables and access types:                                    *
   *70                                                              *
   *70  name                          type           access         *
   *70  --------------                ----           -------        *
   *70  cust_pol_pln                  db2            read           *
   *70  cust_pol_pln_arng             db2            read           *
   *70  cust_pol_pln_xref             db2            read           *
   *70  pol_pln_mstr                  db2            read           *
   *70  pol_pln_mstr_ben_lvl          db2            read           *
   *70  pol_pln_mstr_fam_ded          db2            read           *
   *70  pol_pln_mstr_indv_ded         db2            read           *
   *70  pol_pln_mstr_ppo_arng         db2            read           *
   *70                                                              *
   *70***************************************************************
   */
