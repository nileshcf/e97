package com.cloudframe.app.business.impl;
/*
 *00***************************************************************
 *00  licensed materials - property of united health group        *
 *00***************************************************************
 *10***************************************************************
 *10  program name      : d5427bhi                                *
 *10  business function : db2 io module for ben_hipaa_srvc table  *
 *10  designed by       : sai geetha                              *
 *10  programmed by     : sai geetha                              *
 *10  date coded        : sept 2010                               *
 *10  frequency used    : on-request                              *
 *10  type              : online                                  *
 *10***************************************************************
 *20***************************************************************
 *20  major program process:                                      *
 *20                                                              *
 *20  this db2 dsm receives a request to be processed against db2 *
 *20  table ben_hipaa_srvc.                                       *
 *20                                                              *
 *20  the program is function code driven. the function code value*
 *20  is received from the calling program along with the required*
 *20  key fields. based on the func code dsm will perform inquiry *
 *20  or update or insert on ben_hipaa_srvc table.                *
 *20                                                              *
 *20***************************************************************
 *30***************************************************************
 *30  program change log                                          *
 *30***************************************************************
 *30  release  sprf    programmer  description                    *
 *30  -------  ------  ----------  ----------------------------   *
 *30  relq410  #33120  sai geetha  new program                    *
 *30                                                              *
 *30  relq410  #33120  jeya.s      qc#10117 - bhi fetch issue     *
 *30  relq315  #69709  teresa manalo to add new org type          *
 *30  relq315  #69709  m.myaskovsky  to add new org type for      *
 *30                                 func-cd 1                    *
 *30  relq416 prj58434 p.dziedzic    prj58434 hab/rehab visit lim;*
 *30                                 allow a second 'af' row on   *
 *30                                 the ben_hipaa_srvc table for *
 *30                                 post-cochlear (ci) therapy.  *
 *30                                 first is speech therapy (st).*
 *30  relq416 prj58434 p.dziedzic    prj58434 hab/rehab visit lim;*
 *30                                 alm #5733 - include service  *
 *30                                 code field in check for dupes*
 *30                                 in 5340-check-duplicate-row. *
 *30 rel1909          ramcharan    mdtr-2019-0706-1a-tops to use  *
 *30                  & manikanta  d5427bhi for performance       *
 *30                  srikakulapu  benefits of ben_hipaa_srvc     *
 *30                               loaded into memory.            *
 *30 2022-09-10 - marina       - m09-22 prj287759 transparency 500*
 *30              myaskovsky     shoppable services - coins price *
 *30                             transpcy tool (cptt)             *
 *30 2022-09-10 - raj s        - m09-22 de616081 defect fix to    *
 *30                             update rows for hcan01           *
 *30 rel0223          vivek        prb1355848 - to fix asra abends*
 *30                  dahiya       in d5427bhi program            *
 *30 rel0523 marina     prj287759 - change to allow enter hipaa cd*
 *30         myaskovsky         with various pos for default table*
 *30 rel0923 marina     prj287759 - changed join criteria         *
 *30         myaskovsky                                           *
 *30 commented out for cache redesign                             *
 *30 rel23m9 vivek dahiya prb1415287 uncomment code commented     *
 *30                      with tag ***tst to re-introduce         *
 *30                      cache -  vivek dahiya                   *
 *30***************************************************************
 *40***************************************************************
 *40  called modules                                              *
 *40  --------------                                              *
 *40  program           function            type                  *
 *40  -------           -------             ----                  *
 *40  none                n/a                n/a                  *
 *40                                                              *
 *40***************************************************************
 *50***************************************************************
 *50  return codes                                                *
 *50  ------------                                                *
 *50  sql codes for the db2 operation.                            *
 *50                                                              *
 *50  copybook   description                                      *
 *50  --------   -----------------------------------------------  *
 *50  vysqlcds   sql codes for the db2 operation.                 *
 *50***************************************************************
 *60***************************************************************
 *60  files used                                                  *
 *60  ----------                                                  *
 *60  filename               mode              description        *
 *60  --------               ----              -----------        *
 *60  n/a                    n/a               n/a                *
 *60***************************************************************
 *70***************************************************************
 *70  tables and access types                                     *
 *70  -----------------------                                     *
 *70  name                    type    access                      *
 *70  ----                    ----    ------                      *
 *70  ben_hipaa_srvc          db2     inquiry,update and insert   *
 *70***************************************************************
 */

import com.cloudframe.app.business.*;
import com.cloudframe.app.business.C5427bhi;
import com.cloudframe.app.business.D5427bhi;
import com.cloudframe.app.common.CONSTANTS;
import com.cloudframe.app.common.CommonProcess;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.dto.ProgramContext;
import com.cloudframe.app.dto.d5427bhi.*;
import com.cloudframe.app.dto.d5427bhi.BhiDataArea01;
import com.cloudframe.app.dto.d5427bhi.D5427bhiCtx;
import com.cloudframe.app.dto.d5427bhi.D5427bhiCtx.*;
import com.cloudframe.app.dto.d5427bhi.DfhcommareaGroup;
import com.cloudframe.app.dto.d5427bhi.DsmBhiCallArea;
import com.cloudframe.app.dto.d5427bhi.DsmCallArea;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.repository.D5427bhiRepository;
import com.cloudframe.app.service.*;
import com.cloudframe.app.utility.CFUtil;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("d5427bhi")
public class D5427bhiImpl extends CommonProcess implements D5427bhi {

  Logger logger = LoggerFactory.getLogger(D5427bhiImpl.class);

  @Value("${D5427BHI.dbQualifier:}")
  private String dbQualifier;

  @Autowired
  @Qualifier("c5427bhi")
  C5427bhi c5427bhi;

  @Autowired
  @Qualifier("d5427bhiRepository")
  D5427bhiRepository d5427bhiRepository;

  @Override
  public int setParameter(
      D5427bhiCtx programCtx,
      String dfhcommareaGroup,
      String dsmCallArea,
      String dsmBhiCallArea,
      String bhiDataArea01)
      throws Exception {
    if (dfhcommareaGroup != null)
      programCtx
          .getDfhcommareaGroup()
          .setString(
              com.cloudframe.app.data.Field.getParm(dfhcommareaGroup),
              new String(CONSTANTS.EBCDIC_ENCODING));
    if (dsmCallArea != null)
      programCtx
          .getDsmCallArea()
          .setString(
              com.cloudframe.app.data.Field.getParm(dsmCallArea),
              new String(CONSTANTS.EBCDIC_ENCODING));
    if (dsmBhiCallArea != null)
      programCtx
          .getDsmBhiCallArea()
          .setString(
              com.cloudframe.app.data.Field.getParm(dsmBhiCallArea),
              new String(CONSTANTS.EBCDIC_ENCODING));
    if (bhiDataArea01 != null)
      programCtx
          .getBhiDataArea01()
          .setString(
              com.cloudframe.app.data.Field.getParm(bhiDataArea01),
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
  public int process(D5427bhiCtx programCtx) throws Exception {
    try {
      setCodePage("1047");
      // Reset program ended flag
      programCtx.setProgramEnded(false);
      db2Base.reset("D5427BHI", dbQualifier, true /*use Dynamic SQL*/);
      // Added variable to get the output context in place.
      ProcessInCtx methodIn = programCtx.getProcessInCtx();
      //  cobolCode::PERFORM 0000-MAINLINE
      mainline(programCtx.getMainlineInCtx()); /*0000-MAINLINE SECTION*/
      if (programCtx.isProgramEnded()) {
        return programCtx.getRc();
      }
      exit(programCtx); /*0000-EXIT*/
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
   * complexity - 5 Input :
   *
   * <p>- dsmReturnCode COBOL Name: DSM-RETURN-CODE - dsmFuncCd COBOL Name: DSM-FUNC-CD
   *
   * <p>Output :
   *
   * <p>- dsmReturnCode COBOL Name: DSM-RETURN-CODE - dsmSqlErrorLevel COBOL Name:
   * DSM-SQL-ERROR-LEVEL - dsmEditErrorValueTxt COBOL Name: DSM-EDIT-ERROR-VALUE-TXT - dsmFuncCd
   * COBOL Name: DSM-FUNC-CD - dsmEditErrorField COBOL Name: DSM-EDIT-ERROR-FIELD
   *
   * @throws CFException
   */
  @Override
  public MainlineOutCtx mainline(MainlineInCtx methodIn) throws Exception {
    // Added variable to get the program context in place.
    D5427bhiCtx programCtx = methodIn.getD5427bhiCtx();
    // Added variable to get the output context in place.
    MainlineOutCtx methodOut = methodIn.getMainlineOutCtx();
    //  cobolCode::PERFORM 1000-INITIALIZE
    initialize(programCtx.getInitializeInCtx()); /*1000-INITIALIZE SECTION*/
    if (programCtx.isProgramEnded()) {
      return methodOut;
    }
    //  cobolCode::IF DSM-EDIT-ERROR
    if (methodOut.isDsmEditError()) {
      // cobolCode::GO TO 0000-EXIT
      exit(programCtx);
      return methodOut;
      // cobolCodeEnds::GO TO 0000-EXIT
    }
    //  cobolCode::ELSE
    else {
      //  cobolCode::EVALUATE DSM-FUNC-CD
      switch (methodOut.getDsmFuncCd()) {
        case 1:
          //  cobolCode::PERFORM 2000-GET-BHI-RECORD
          getBhiRecord(programCtx.getGetBhiRecordInCtx()); /*2000-GET-BHI-RECORD SECTION*/
          if (programCtx.isProgramEnded()) {
            return methodOut;
          }
          break;
        case 2:
          //  cobolCode::PERFORM 3000-PROCESS-SCREEN-REQUEST
          processScreenRequest(
              programCtx.getProcessScreenRequestInCtx()); /*3000-PROCESS-SCREEN-REQUEST SECTION*/
          if (programCtx.isProgramEnded()) {
            return methodOut;
          }
          break;
        default:
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
    }

    return methodOut;
  }
  /**
   * exit This method is derived from COBOL Paragraph - 0000-EXIT COBOL Cyclomatic complexity - 3
   * Input : None
   *
   * <p>Output : None
   *
   * @throws CFException
   */
  @Override
  public void exit(D5427bhiCtx programCtx) throws Exception {
    //  cobolCode::GOBACK
    setNotLogged(false); // no need to log, it is a normal termination
    programCtx.setProgramEnded(true);
    return;
  }
  /**
   * initialize This method is derived from COBOL Paragraph - 1000-INITIALIZE SECTION COBOL
   * Cyclomatic complexity - 5 Input :
   *
   * <p>- dsmFuncCd COBOL Name: DSM-FUNC-CD
   *
   * <p>Output :
   *
   * <p>- dsmReturnCode COBOL Name: DSM-RETURN-CODE - dsmSqlErrorLevel COBOL Name:
   * DSM-SQL-ERROR-LEVEL - dsmEditErrorValueTxt COBOL Name: DSM-EDIT-ERROR-VALUE-TXT - dsmFuncCd
   * COBOL Name: DSM-FUNC-CD - dsmEditErrorField COBOL Name: DSM-EDIT-ERROR-FIELD - dclbenHipaaSrvc
   * COBOL Name: DCLBEN-HIPAA-SRVC - dbhiFirstTime COBOL Name: WS-DBHI-FIRST-TIME - bhiRetReasonCode
   * COBOL Name: BHI-RET-REASON-CODE - bhiReturnArea COBOL Name: BHI-RETURN-AREA
   *
   * @throws CFException
   */
  @Override
  public InitializeOutCtx initialize(InitializeInCtx methodIn) throws Exception {

    // *81***************************************************************
    // *81 1000-Initialize                                              *
    // *81 business function   : initialization para                    *
    // *81***************************************************************
    // *82***************************************************************
    // *82 1000-initialize                                              *
    // *82 1. initialize all dclgen and working storage fields          *
    // *82 2. validate the request parameters for each function code    *
    // *82***************************************************************
    // Added variable to get the program context in place.
    D5427bhiCtx programCtx = methodIn.getD5427bhiCtx();
    // Added variable to get the output context in place.
    InitializeOutCtx methodOut = methodIn.getInitializeOutCtx();
    //  cobolCode::INITIALIZE DSM-RETURN-CODE
    methodOut.setDsmReturnCode(0);
    //  cobolCode::IF DSM-FUNC-CD = 01 OR DSM-FUNC-CD = 02
    //  cobolCode::ELSE
    if ((methodOut.getDsmFuncCd() != 1) && (methodOut.getDsmFuncCd() != 2)) {
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
      // cobolCode::GO TO 1000-EXIT
      return methodOut;
      // cobolCodeEnds::GO TO 1000-EXIT
    }
    //  cobolCode::IF DSM-FUNC-CD = 01
    if ((methodOut.getDsmFuncCd() == 1)) {
      //  cobolCode::INITIALIZE DCLBEN-HIPAA-SRVC
      methodOut.getDclbenHipaaSrvc().initialize();
      //  cobolCode::SET DBHI-FIRST-TIME-YES TO TRUE
      methodOut.setDbhiFirstTimeYesTrue();

      //  cobolCode::PERFORM 1500-REQUEST-FIELD-VALIDATION
      requestFieldValidation(
          programCtx.getRequestFieldValidationInCtx()); /*1500-REQUEST-FIELD-VALIDATION SECTION*/
    }
    //  cobolCode::IF DSM-FUNC-CD = 02
    if ((methodOut.getDsmFuncCd() == 2)) {
      //  cobolCode::PERFORM 1600-VALIDATE-REQ-FIELDS
      validateReqFields(
          programCtx.getValidateReqFieldsInCtx()); /*1600-VALIDATE-REQ-FIELDS SECTION*/
      //  cobolCode::SET BHI-NO-ERRORS TO TRUE
      methodOut.setBhiNoErrorsTrue();

      //  cobolCode::INITIALIZE BHI-RETURN-AREA
      methodOut.getBhiReturnArea().initialize();
    }

    return methodOut;
  }
  /**
   * requestFieldValidation This method is derived from COBOL Paragraph -
   * 1500-REQUEST-FIELD-VALIDATION SECTION COBOL Cyclomatic complexity - 17 Input :
   *
   * <p>- bhiReqHipaaCode COBOL Name: BHI-REQ-HIPAA-CODE - bhiReqSlotTable COBOL Name:
   * BHI-REQ-SLOT-TABLE - bhiReqEffectDate COBOL Name: BHI-REQ-EFFECT-DATE - bhiReqCancelDate COBOL
   * Name: BHI-REQ-CANCEL-DATE
   *
   * <p>Output :
   *
   * <p>- dsmReturnCode COBOL Name: DSM-RETURN-CODE - dsmEditErrorField COBOL Name:
   * DSM-EDIT-ERROR-FIELD - dsmEditErrorValueTxt COBOL Name: DSM-EDIT-ERROR-VALUE-TXT -
   * bhiReqHipaaCode COBOL Name: BHI-REQ-HIPAA-CODE - bhiReqSlotTable COBOL Name: BHI-REQ-SLOT-TABLE
   * - bhiReqEffectDate COBOL Name: BHI-REQ-EFFECT-DATE - bhiReqCancelDate COBOL Name:
   * BHI-REQ-CANCEL-DATE
   *
   * @throws CFException
   */
  @Override
  public RequestFieldValidationOutCtx requestFieldValidation(RequestFieldValidationInCtx methodIn)
      throws Exception {

    // *81***************************************************************
    // *81 1500-Request-field-validation                                *
    // *81                                                              *
    // *81 business function:                                           *
    // *81 validating all the request fields.                           *
    // *81***************************************************************
    // *82***************************************************************
    // *82 1500-request-field-validation                                *
    // *82 validate the request parameters and set dsm-edit-error in    *
    // *82 case of any invalid data.                                    *
    // *82***************************************************************
    // Added variable to get the program context in place.
    D5427bhiCtx programCtx = methodIn.getD5427bhiCtx();
    // Added variable to get the output context in place.
    RequestFieldValidationOutCtx methodOut = methodIn.getRequestFieldValidationOutCtx();
    //  cobolCode::IF BHI-REQ-HIPAA-CODE = SPACES OR ZEROES OR LOW-VALUES OR HIGH-VALUES
    if ((allSpaces(methodOut.getBhiReqHipaaCode()))
        || (allZeros(methodOut.getBhiReqHipaaCode())) /*  ==  zeros*/
        || (checkLowValue(methodOut.getBhiReqHipaaCode()))
        || (isHighValue(methodOut.getBhiReqHipaaCode()))) {
      //  cobolCode::SET DSM-EDIT-ERROR TO TRUE
      methodOut.setDsmEditErrorTrue();

      //  cobolCode::MOVE 'BHI-REQ-HIPAA-CODE ' TO DSM-EDIT-ERROR-FIELD
      methodOut.setDsmEditErrorField(CONSTANTS.LITERAL_BHI_MN3_REQHIPAACODE_B12_);
      //  cobolCode::MOVE BHI-REQ-HIPAA-CODE TO DSM-EDIT-ERROR-VALUE-TXT
      methodOut.getDsmEditErrorValueTxt().setString(methodOut.getBhiReqHipaaCode());
      // cobolCode::GO TO 1500-EXIT
      return methodOut;
      // cobolCodeEnds::GO TO 1500-EXIT
    }
    //  cobolCode::IF BHI-REQ-SLOT-TABLE = SPACES OR ZEROES OR LOW-VALUES OR HIGH-VALUES
    if ((allSpaces(methodOut.getBhiReqSlotTable()))
        || (allZeros(methodOut.getBhiReqSlotTable())) /*  ==  zeros*/
        || (checkLowValue(methodOut.getBhiReqSlotTable()))
        || (isHighValue(methodOut.getBhiReqSlotTable()))) {
      //  cobolCode::SET DSM-EDIT-ERROR TO TRUE
      methodOut.setDsmEditErrorTrue();

      //  cobolCode::MOVE 'BHI-REQ-SLOT-TABLE ' TO DSM-EDIT-ERROR-FIELD
      methodOut.setDsmEditErrorField(CONSTANTS.LITERAL_BHI_MN3_REQSLOTTABLE_B12_);
      //  cobolCode::MOVE BHI-REQ-SLOT-TABLE TO DSM-EDIT-ERROR-VALUE-TXT
      methodOut.getDsmEditErrorValueTxt().setString(methodOut.getBhiReqSlotTable());
      // cobolCode::GO TO 1500-EXIT
      return methodOut;
      // cobolCodeEnds::GO TO 1500-EXIT
    }
    //  cobolCode::IF BHI-REQ-EFFECT-DATE = SPACES OR ZEROES OR LOW-VALUES OR HIGH-VALUES
    if ((allSpaces(methodOut.getBhiReqEffectDate()))
        || (allZeros(methodOut.getBhiReqEffectDate())) /*  ==  zeros*/
        || (checkLowValue(methodOut.getBhiReqEffectDate()))
        || (isHighValue(methodOut.getBhiReqEffectDate()))) {
      //  cobolCode::SET DSM-EDIT-ERROR TO TRUE
      methodOut.setDsmEditErrorTrue();

      //  cobolCode::MOVE 'BHI-REQ-EFFECT-DATE' TO DSM-EDIT-ERROR-FIELD
      methodOut.setDsmEditErrorField(CONSTANTS.LITERAL_BHI_MN3_REQEFFECTDATE_B11_);
      //  cobolCode::MOVE BHI-REQ-EFFECT-DATE TO DSM-EDIT-ERROR-VALUE-TXT
      methodOut.getDsmEditErrorValueTxt().setString(methodOut.getBhiReqEffectDate());
      // cobolCode::GO TO 1500-EXIT
      return methodOut;
      // cobolCodeEnds::GO TO 1500-EXIT
    }
    //  cobolCode::IF BHI-REQ-CANCEL-DATE = SPACES OR ZEROES OR LOW-VALUES OR HIGH-VALUES
    if ((allSpaces(methodOut.getBhiReqCancelDate()))
        || (allZeros(methodOut.getBhiReqCancelDate())) /*  ==  zeros*/
        || (checkLowValue(methodOut.getBhiReqCancelDate()))
        || (isHighValue(methodOut.getBhiReqCancelDate()))) {
      //  cobolCode::SET DSM-EDIT-ERROR TO TRUE
      methodOut.setDsmEditErrorTrue();

      //  cobolCode::MOVE 'BHI-REQ-CANCEL-DATE' TO DSM-EDIT-ERROR-FIELD
      methodOut.setDsmEditErrorField(CONSTANTS.LITERAL_BHI_MN3_REQCANCELDATE_B11_);
      //  cobolCode::MOVE BHI-REQ-CANCEL-DATE TO DSM-EDIT-ERROR-VALUE-TXT
      methodOut.getDsmEditErrorValueTxt().setString(methodOut.getBhiReqCancelDate());
      // cobolCode::GO TO 1500-EXIT
      return methodOut;
      // cobolCodeEnds::GO TO 1500-EXIT
    }

    return methodOut;
  }
  /**
   * validateReqFields This method is derived from COBOL Paragraph - 1600-VALIDATE-REQ-FIELDS
   * SECTION COBOL Cyclomatic complexity - 33 Input :
   *
   * <p>- bhiReqType COBOL Name: BHI-REQ-TYPE - bhiReqNum COBOL Name: BHI-REQ-NUM - bhiReqFiltTbl
   * COBOL Name: BHI-REQ-FILT-TBL - bhiReqFiltStsCd COBOL Name: BHI-REQ-FILT-STS-CD -
   * bhiBrowseTypeSw COBOL Name: BHI-BROWSE-TYPE-SW - sub COBOL Name: WS-SUB - bhiReqRowAct COBOL
   * Name: BHI-REQ-ROW-ACT - bhiReqRowSlotTblId COBOL Name: BHI-REQ-ROW-SLOT-TBL-ID -
   * bhiReqRowHipaaVerNbr COBOL Name: BHI-REQ-ROW-HIPAA-VER-NBR - bhiReqRowHipaaCd COBOL Name:
   * BHI-REQ-ROW-HIPAA-CD - bhiReqRowNetId COBOL Name: BHI-REQ-ROW-NET-ID - bhiReqRowEffDate COBOL
   * Name: BHI-REQ-ROW-EFF-DATE - bhiReqRowCancDt COBOL Name: BHI-REQ-ROW-CANC-DT
   *
   * <p>Output :
   *
   * <p>- dsmReturnCode COBOL Name: DSM-RETURN-CODE - bhiRetReasonCode COBOL Name:
   * BHI-RET-REASON-CODE - dsmEditErrorField COBOL Name: DSM-EDIT-ERROR-FIELD - dsmEditErrorValueTxt
   * COBOL Name: DSM-EDIT-ERROR-VALUE-TXT - bhiReqType COBOL Name: BHI-REQ-TYPE - bhiReqNum COBOL
   * Name: BHI-REQ-NUM - bhiBrowseTypeSw COBOL Name: BHI-BROWSE-TYPE-SW - actIndSwitch COBOL Name:
   * WS-ACT-IND-SWITCH - sub COBOL Name: WS-SUB - bhiReqRowSlotTblId COBOL Name:
   * BHI-REQ-ROW-SLOT-TBL-ID - bhiReqRowHipaaVerNbr COBOL Name: BHI-REQ-ROW-HIPAA-VER-NBR -
   * bhiReqRowHipaaCd COBOL Name: BHI-REQ-ROW-HIPAA-CD - bhiReqRowNetId COBOL Name:
   * BHI-REQ-ROW-NET-ID - bhiReqRowEffDate COBOL Name: BHI-REQ-ROW-EFF-DATE - bhiReqRowCancDt COBOL
   * Name: BHI-REQ-ROW-CANC-DT
   *
   * @throws CFException
   */
  @Override
  public ValidateReqFieldsOutCtx validateReqFields(ValidateReqFieldsInCtx methodIn)
      throws Exception {

    // *81***************************************************************
    // *81 1600-Validate-req-fields                                     *
    // *81                                                              *
    // *81 business function: validate the request fields received from *
    // *81                    the application program.                  *
    // *81***************************************************************
    // *82***************************************************************
    // *82 1600-validate-req-fields                                     *
    // *82 request fields validation for func-cd-2                      *
    // *82 validate the following request fields received from the appl-*
    // *82 -ication program.                                            *
    // *82***************************************************************
    // Added variable to get the program context in place.
    D5427bhiCtx programCtx = methodIn.getD5427bhiCtx();
    // Added variable to get the output context in place.
    ValidateReqFieldsOutCtx methodOut = methodIn.getValidateReqFieldsOutCtx();
    //  cobolCode::IF BHI-VALID-REQ
    //  cobolCode::ELSE
    if (!(methodIn.isBhiValidReq())) {
      //  cobolCode::SET DSM-EDIT-ERROR TO TRUE
      methodOut.setDsmEditErrorTrue();

      //  cobolCode::SET BHI-INVALID-REQ-TYPE TO TRUE
      methodOut.setBhiInvalidReqTypeTrue();

      //  cobolCode::MOVE 'BHI-REQ-TYPE ' TO DSM-EDIT-ERROR-FIELD
      methodOut.setDsmEditErrorField(CONSTANTS.LITERAL_BHI_MN2_REQTYPE_B18_);
      //  cobolCode::MOVE BHI-REQ-TYPE TO DSM-EDIT-ERROR-VALUE-TXT
      methodOut.getDsmEditErrorValueTxt().setString(methodOut.getBhiReqType());
      // cobolCode::GO TO 1600-EXIT
      return methodOut;
      // cobolCodeEnds::GO TO 1600-EXIT
    }
    //  cobolCode::IF BHI-REQ-NUM = ZEROS
    if ((methodOut.getBhiReqNum() == 0)) {
      //  cobolCode::SET DSM-EDIT-ERROR TO TRUE
      methodOut.setDsmEditErrorTrue();

      //  cobolCode::SET BHI-INVALID-REQ-TYPE TO TRUE
      methodOut.setBhiInvalidReqTypeTrue();

      //  cobolCode::MOVE 'BHI-REQ-NUM  ' TO DSM-EDIT-ERROR-FIELD
      methodOut.setDsmEditErrorField(CONSTANTS.LITERAL_BHI_MN2_REQNUM_B19_);
      //  cobolCode::MOVE BHI-REQ-NUM TO DSM-EDIT-ERROR-VALUE-TXT
      methodOut
          .getDsmEditErrorValueTxt()
          .setString(
              String.valueOf(
                      CFUtil.pad(2, String.valueOf(methodOut.getBhiReqNum()), "0", CFUtil.LEFT_PAD))
                  .toCharArray());
      // cobolCode::GO TO 1600-EXIT
      return methodOut;
      // cobolCodeEnds::GO TO 1600-EXIT
    }
    //  cobolCode::IF BHI-REQ-FILT-TBL = LOW-VALUES OR HIGH-VALUES
    if ((checkLowValue(methodIn.getBhiReqFiltTbl()))
        || (isHighValue(methodIn.getBhiReqFiltTbl()))) {
      //  cobolCode::SET DSM-EDIT-ERROR TO TRUE
      methodOut.setDsmEditErrorTrue();

      //  cobolCode::SET BHI-INVALID-REQ-TYPE TO TRUE
      methodOut.setBhiInvalidReqTypeTrue();

      //  cobolCode::MOVE 'BHI-REQ-NUM  ' TO DSM-EDIT-ERROR-FIELD
      methodOut.setDsmEditErrorField(CONSTANTS.LITERAL_BHI_MN2_REQNUM_B19_);
      //  cobolCode::MOVE BHI-REQ-NUM TO DSM-EDIT-ERROR-VALUE-TXT
      methodOut
          .getDsmEditErrorValueTxt()
          .setString(
              String.valueOf(
                      CFUtil.pad(2, String.valueOf(methodOut.getBhiReqNum()), "0", CFUtil.LEFT_PAD))
                  .toCharArray());
      // cobolCode::GO TO 1600-EXIT
      return methodOut;
      // cobolCodeEnds::GO TO 1600-EXIT
    }
    //  cobolCode::IF BHI-REQ-FILT-STS-CD = LOW-VALUES OR HIGH-VALUES
    if ((checkLowValue(methodIn.getBhiReqFiltStsCd()))
        || (isHighValue(methodIn.getBhiReqFiltStsCd()))) {
      //  cobolCode::SET DSM-EDIT-ERROR TO TRUE
      methodOut.setDsmEditErrorTrue();

      //  cobolCode::SET BHI-INVALID-REQ-TYPE TO TRUE
      methodOut.setBhiInvalidReqTypeTrue();

      //  cobolCode::MOVE 'BHI-REQ-NUM  ' TO DSM-EDIT-ERROR-FIELD
      methodOut.setDsmEditErrorField(CONSTANTS.LITERAL_BHI_MN2_REQNUM_B19_);
      //  cobolCode::MOVE BHI-REQ-NUM TO DSM-EDIT-ERROR-VALUE-TXT
      methodOut
          .getDsmEditErrorValueTxt()
          .setString(
              String.valueOf(
                      CFUtil.pad(2, String.valueOf(methodOut.getBhiReqNum()), "0", CFUtil.LEFT_PAD))
                  .toCharArray());
      // cobolCode::GO TO 1600-EXIT
      return methodOut;
      // cobolCodeEnds::GO TO 1600-EXIT
    }
    //  cobolCode::IF BHI-SCREEN-BROWSE
    if (methodOut.isBhiScreenBrowse()) {
      //  cobolCode::IF NOT VALID-BROWSE-TYPE
      if (!(methodIn.isValidBrowseType())) {
        //  cobolCode::SET DSM-EDIT-ERROR TO TRUE
        methodOut.setDsmEditErrorTrue();

        //  cobolCode::SET BHI-INVALID-REQ-TYPE TO TRUE
        methodOut.setBhiInvalidReqTypeTrue();

        //  cobolCode::MOVE 'BHI-BROWSE-TYPE-SW ' TO DSM-EDIT-ERROR-FIELD
        methodOut.setDsmEditErrorField(CONSTANTS.LITERAL_BHI_MN3_BROWSETYPESW_B12_);
        //  cobolCode::MOVE BHI-BROWSE-TYPE-SW TO DSM-EDIT-ERROR-VALUE-TXT
        methodOut.getDsmEditErrorValueTxt().setString(methodOut.getBhiBrowseTypeSw());
        // cobolCode::GO TO 1600-EXIT
        return methodOut;
        // cobolCodeEnds::GO TO 1600-EXIT
      }
    }
    //  cobolCode::IF BHI-SCREEN-UPDATE
    //  cobolCode::ELSE
    if (!(methodOut.isBhiScreenUpdate())) {
      // cobolCode::GO TO 1600-EXIT
      return methodOut;
      // cobolCodeEnds::GO TO 1600-EXIT
    }
    //  cobolCode::SET ACT-NOT-FOUND TO TRUE
    methodOut.setActNotFoundTrue();

    //  cobolCode::PERFORM VARYING WS-SUB FROM 1 BY 1 UNTIL WS-SUB > 15 OR ACT-FOUND
    for (methodOut.setSub(1);
        ((methodOut.getSub() <= 15) && !(methodOut.isActFound()));
        methodOut.setSub(methodOut.getSub() + 1)) {
      //  cobolCode::IF BHI-REQ-ROW-ACT ( WS-SUB ) = SPACES
      //  cobolCode::ELSE
      if ((!allSpaces(methodIn.getBhiReqRowAct(methodOut.getSub() - 1)))) {
        //  cobolCode::SET ACT-FOUND TO TRUE
        methodOut.setActFoundTrue();

        //  cobolCode::IF BHI-REQ-ROW-SLOT-TBL-ID ( WS-SUB ) = SPACES OR LOW-VALUES OR HIGH-VALUES
        if ((allSpaces(methodOut.getBhiReqRowSlotTblId(methodOut.getSub() - 1)))
            || (checkLowValue(methodOut.getBhiReqRowSlotTblId(methodOut.getSub() - 1)))
            || (isHighValue(methodOut.getBhiReqRowSlotTblId(methodOut.getSub() - 1)))) {
          //  cobolCode::SET DSM-EDIT-ERROR TO TRUE
          methodOut.setDsmEditErrorTrue();

          //  cobolCode::SET BHI-INVALID-REQ-TYPE TO TRUE
          methodOut.setBhiInvalidReqTypeTrue();

          //  cobolCode::MOVE 'BHI-REQ-ROW-SLOT-TBL-ID' TO DSM-EDIT-ERROR-FIELD
          methodOut.setDsmEditErrorField(CONSTANTS.LITERAL_BHI_MN5_REQROWSLOTTBLID_B7_);
          //  cobolCode::MOVE BHI-REQ-ROW-SLOT-TBL-ID ( WS-SUB ) TO DSM-EDIT-ERROR-VALUE-TXT
          methodOut
              .getDsmEditErrorValueTxt()
              .setString(
                  pad(
                      21,
                      methodOut.getBhiReqRowSlotTblId(methodOut.getSub() - 1),
                      SPACE_CHAR,
                      RIGHT_PAD));
          // cobolCode::GO TO 1600-EXIT
          return methodOut;
          // cobolCodeEnds::GO TO 1600-EXIT
        }
        //  cobolCode::IF BHI-REQ-ROW-HIPAA-VER-NBR ( WS-SUB ) = SPACES OR LOW-VALUES OR HIGH-VALUES
        if ((allSpaces(methodOut.getBhiReqRowHipaaVerNbr(methodOut.getSub() - 1)))
            || (checkLowValue(methodOut.getBhiReqRowHipaaVerNbr(methodOut.getSub() - 1)))
            || (isHighValue(methodOut.getBhiReqRowHipaaVerNbr(methodOut.getSub() - 1)))) {
          //  cobolCode::SET DSM-EDIT-ERROR TO TRUE
          methodOut.setDsmEditErrorTrue();

          //  cobolCode::SET BHI-INVALID-REQ-TYPE TO TRUE
          methodOut.setBhiInvalidReqTypeTrue();

          //  cobolCode::MOVE 'BHI-REQ-ROW-HIPAA-VER-NBR ' TO DSM-EDIT-ERROR-FIELD
          methodOut.setDsmEditErrorField(CONSTANTS.LITERAL_BHI_MN5_REQROWHIPAAVERNBR_B5_);
          //  cobolCode::MOVE BHI-REQ-ROW-HIPAA-VER-NBR ( WS-SUB ) TO DSM-EDIT-ERROR-VALUE-TXT
          methodOut
              .getDsmEditErrorValueTxt()
              .setString(
                  pad(
                      21,
                      methodOut.getBhiReqRowHipaaVerNbr(methodOut.getSub() - 1),
                      SPACE_CHAR,
                      RIGHT_PAD));
          // cobolCode::GO TO 1600-EXIT
          return methodOut;
          // cobolCodeEnds::GO TO 1600-EXIT
        }
        //  cobolCode::IF BHI-REQ-ROW-HIPAA-CD ( WS-SUB ) = SPACES OR LOW-VALUES OR HIGH-VALUES
        if ((allSpaces(methodOut.getBhiReqRowHipaaCd(methodOut.getSub() - 1)))
            || (checkLowValue(methodOut.getBhiReqRowHipaaCd(methodOut.getSub() - 1)))
            || (isHighValue(methodOut.getBhiReqRowHipaaCd(methodOut.getSub() - 1)))) {
          //  cobolCode::SET DSM-EDIT-ERROR TO TRUE
          methodOut.setDsmEditErrorTrue();

          //  cobolCode::SET BHI-INVALID-REQ-TYPE TO TRUE
          methodOut.setBhiInvalidReqTypeTrue();

          //  cobolCode::MOVE 'BHI-REQ-ROW-HIPAA-CD ' TO DSM-EDIT-ERROR-FIELD
          methodOut.setDsmEditErrorField(CONSTANTS.LITERAL_BHI_MN4_REQROWHIPAACD_B10_);
          //  cobolCode::MOVE BHI-REQ-ROW-HIPAA-CD ( WS-SUB ) TO DSM-EDIT-ERROR-VALUE-TXT
          methodOut
              .getDsmEditErrorValueTxt()
              .setString(
                  pad(
                      21,
                      methodOut.getBhiReqRowHipaaCd(methodOut.getSub() - 1),
                      SPACE_CHAR,
                      RIGHT_PAD));
          // cobolCode::GO TO 1600-EXIT
          return methodOut;
          // cobolCodeEnds::GO TO 1600-EXIT
        }
        //  cobolCode::IF BHI-REQ-ROW-NET-ID ( WS-SUB ) = SPACES OR LOW-VALUES OR HIGH-VALUES
        if ((allSpaces(methodOut.getBhiReqRowNetId(methodOut.getSub() - 1)))
            || (checkLowValue(methodOut.getBhiReqRowNetId(methodOut.getSub() - 1)))
            || (isHighValue(methodOut.getBhiReqRowNetId(methodOut.getSub() - 1)))) {
          //  cobolCode::SET DSM-EDIT-ERROR TO TRUE
          methodOut.setDsmEditErrorTrue();

          //  cobolCode::SET BHI-INVALID-REQ-TYPE TO TRUE
          methodOut.setBhiInvalidReqTypeTrue();

          //  cobolCode::MOVE 'BHI-REQ-ROW-NET-ID  ' TO DSM-EDIT-ERROR-FIELD
          methodOut.setDsmEditErrorField(CONSTANTS.LITERAL_BHI_MN4_REQROWNETID_B12_);
          //  cobolCode::MOVE BHI-REQ-ROW-NET-ID ( WS-SUB ) TO DSM-EDIT-ERROR-VALUE-TXT
          methodOut
              .getDsmEditErrorValueTxt()
              .setString(
                  pad(
                      21,
                      methodOut.getBhiReqRowNetId(methodOut.getSub() - 1),
                      SPACE_CHAR,
                      RIGHT_PAD));
          // cobolCode::GO TO 1600-EXIT
          return methodOut;
          // cobolCodeEnds::GO TO 1600-EXIT
        }
        //  cobolCode::IF BHI-REQ-ROW-EFF-DATE ( WS-SUB ) = SPACES OR LOW-VALUES OR HIGH-VALUES
        if ((allSpaces(methodOut.getBhiReqRowEffDate(methodOut.getSub() - 1)))
            || (checkLowValue(methodOut.getBhiReqRowEffDate(methodOut.getSub() - 1)))
            || (isHighValue(methodOut.getBhiReqRowEffDate(methodOut.getSub() - 1)))) {
          //  cobolCode::SET DSM-EDIT-ERROR TO TRUE
          methodOut.setDsmEditErrorTrue();

          //  cobolCode::SET BHI-INVALID-REQ-TYPE TO TRUE
          methodOut.setBhiInvalidReqTypeTrue();

          //  cobolCode::MOVE 'BHI-REQ-ROW-EFF-DATE ' TO DSM-EDIT-ERROR-FIELD
          methodOut.setDsmEditErrorField(CONSTANTS.LITERAL_BHI_MN4_REQROWEFFDATE_B10_);
          //  cobolCode::MOVE BHI-REQ-ROW-EFF-DATE ( WS-SUB ) TO DSM-EDIT-ERROR-VALUE-TXT
          methodOut
              .getDsmEditErrorValueTxt()
              .setString(
                  pad(
                      21,
                      methodOut.getBhiReqRowEffDate(methodOut.getSub() - 1),
                      SPACE_CHAR,
                      RIGHT_PAD));
          // cobolCode::GO TO 1600-EXIT
          return methodOut;
          // cobolCodeEnds::GO TO 1600-EXIT
        }
        //  cobolCode::IF BHI-REQ-ROW-CANC-DT ( WS-SUB ) = SPACES OR LOW-VALUES OR HIGH-VALUES
        if ((allSpaces(methodOut.getBhiReqRowCancDt(methodOut.getSub() - 1)))
            || (checkLowValue(methodOut.getBhiReqRowCancDt(methodOut.getSub() - 1)))
            || (isHighValue(methodOut.getBhiReqRowCancDt(methodOut.getSub() - 1)))) {
          //  cobolCode::SET DSM-EDIT-ERROR TO TRUE
          methodOut.setDsmEditErrorTrue();

          //  cobolCode::SET BHI-INVALID-REQ-TYPE TO TRUE
          methodOut.setBhiInvalidReqTypeTrue();

          //  cobolCode::MOVE 'BHI-REQ-ROW-CANC-DT  ' TO DSM-EDIT-ERROR-FIELD
          methodOut.setDsmEditErrorField(CONSTANTS.LITERAL_BHI_MN4_REQROWCANCDT_B11_);
          //  cobolCode::MOVE BHI-REQ-ROW-CANC-DT ( WS-SUB ) TO DSM-EDIT-ERROR-VALUE-TXT
          methodOut
              .getDsmEditErrorValueTxt()
              .setString(
                  pad(
                      21,
                      methodOut.getBhiReqRowCancDt(methodOut.getSub() - 1),
                      SPACE_CHAR,
                      RIGHT_PAD));
          // cobolCode::GO TO 1600-EXIT
          return methodOut;
          // cobolCodeEnds::GO TO 1600-EXIT
        }
      }
    }
    //  cobolCode::IF ACT-NOT-FOUND
    if (methodOut.isActNotFound()) {
      //  cobolCode::SET DSM-EDIT-ERROR TO TRUE
      methodOut.setDsmEditErrorTrue();

      //  cobolCode::SET BHI-INVALID-REQ-TYPE TO TRUE
      methodOut.setBhiInvalidReqTypeTrue();

      //  cobolCode::MOVE 'BHI-REQ-ROW-ACT ' TO DSM-EDIT-ERROR-FIELD
      methodOut.setDsmEditErrorField(CONSTANTS.LITERAL_BHI_MN3_REQROWACT_B15_);
      //  cobolCode::MOVE SPACES TO DSM-EDIT-ERROR-VALUE-TXT
      methodOut.getDsmEditErrorValueTxt().setString(CONSTANTS.SPACE_21);
    }

    return methodOut;
  }
  /**
   * getBhiRecord This method is derived from COBOL Paragraph - 2000-GET-BHI-RECORD SECTION COBOL
   * Cyclomatic complexity - 6 Input :
   *
   * <p>- sqlcode_Ws COBOL Name: WS-SQLCODE
   *
   * <p>Output :
   *
   * <p>- bhiRetBhiCnt COBOL Name: BHI-RET-BHI-CNT - endOfCsrSw COBOL Name: WS-END-OF-CSR-SW
   *
   * @throws CFException
   */
  @Override
  public GetBhiRecordOutCtx getBhiRecord(GetBhiRecordInCtx methodIn) throws Exception {

    // *81 2000-Get-bhi-record.                                         *
    // *81                                                              *
    // *81 business function:                                           *
    // *81 perform hipaa_srvc_csr processing                            *
    // *81***************************************************************
    // *82***************************************************************
    // *82 2000-get-bhi-record                                          *
    // *82 performs the dsm request to return the benifit hipaa info.   *
    // *82***************************************************************
    // Added variable to get the program context in place.
    D5427bhiCtx programCtx = methodIn.getD5427bhiCtx();
    // Added variable to get the output context in place.
    GetBhiRecordOutCtx methodOut = methodIn.getGetBhiRecordOutCtx();
    //  cobolCode::PERFORM 2100-BHI-OPEN-CURSOR
    bhiOpenCursor(programCtx.getBhiOpenCursorInCtx()); /*2100-BHI-OPEN-CURSOR SECTION*/
    if (programCtx.isProgramEnded()) {
      return methodOut;
    }
    //  cobolCode::IF WS-SQLCODE-OK
    if (methodIn.isSqlcodeOk()) {
      //  cobolCode::MOVE ZEROS TO BHI-RET-BHI-CNT
      methodOut.setBhiRetBhiCnt(0);
      //  LITERAL_N = 'N'
      methodOut.setEndOfCsrSw(CONSTANTS.LITERAL_N);
      //  cobolCode::PERFORM 2200-BHI-FETCH-CURSOR UNTIL END-OF-CSR OR BHI-RET-BHI-CNT > 12
      while (!(methodOut.isEndOfCsr()) && (methodOut.getBhiRetBhiCnt() <= 12)) {
        if (programCtx.getDoNotSkipBhiFetchCursor()) {
          bhiFetchCursor(programCtx.getBhiFetchCursorInCtx());
        } else {
          programCtx.setDoNotSkipBhiFetchCursor(true);
        } /*2200-BHI-FETCH-CURSOR SECTION*/
        if (programCtx.isProgramEnded()) {
          return methodOut;
        }
      }
    }

    // ****      Until end-of-csr or bhi-ret-bhi-cnt > 4
    //  cobolCode::IF WS-SQLCODE-OK OR WS-SQLCODE-NOT-FOUND
    if (methodIn.isSqlcodeOk() || methodIn.isSqlcodeNotFound()) {
      //  cobolCode::PERFORM 2300-BHI-CLOSE-CURSOR
      bhiCloseCursor(programCtx.getBhiCloseCursorInCtx()); /*2300-BHI-CLOSE-CURSOR SECTION*/
      if (programCtx.isProgramEnded()) {
        return methodOut;
      }
    }

    return methodOut;
  }
  /**
   * bhiOpenCursor This method is derived from COBOL Paragraph - 2100-BHI-OPEN-CURSOR SECTION COBOL
   * Cyclomatic complexity - 7 Input :
   *
   * <p>- stsActive COBOL Name: WS-STS-ACTIVE - bhiReqSlotTable COBOL Name: BHI-REQ-SLOT-TABLE -
   * bhiReqHipaaVerNbr COBOL Name: BHI-REQ-HIPAA-VER-NBR - bhiReqHipaaCode COBOL Name:
   * BHI-REQ-HIPAA-CODE - bhiReqEffectDate COBOL Name: BHI-REQ-EFFECT-DATE - bhiReqCancelDate COBOL
   * Name: BHI-REQ-CANCEL-DATE - dsmFuncCd COBOL Name: DSM-FUNC-CD - crtnSrchFoundSw COBOL Name:
   * CRTN-SRCH-FOUND-SW
   *
   * <p>Output :
   *
   * <p>- dbhsStsCd COBOL Name: DBHS-STS-CD - crtnStsCd COBOL Name: CRTN-STS-CD - stsActive COBOL
   * Name: WS-STS-ACTIVE - dbhsSlotTblId COBOL Name: DBHS-SLOT-TBL-ID - crtnSlotTblId COBOL Name:
   * CRTN-SLOT-TBL-ID - bhiReqSlotTable COBOL Name: BHI-REQ-SLOT-TABLE - dbhsHipaaVerNbr COBOL Name:
   * DBHS-HIPAA-VER-NBR - crtnHipaaVerNbr COBOL Name: CRTN-HIPAA-VER-NBR - bhiReqHipaaVerNbr COBOL
   * Name: BHI-REQ-HIPAA-VER-NBR - dbhsHipaaCd COBOL Name: DBHS-HIPAA-CD - crtnHipaaCd COBOL Name:
   * CRTN-HIPAA-CD - bhiReqHipaaCode COBOL Name: BHI-REQ-HIPAA-CODE - dbhsEffDt COBOL Name:
   * DBHS-EFF-DT - crtnReqEffDt COBOL Name: CRTN-REQ-EFF-DT - bhiReqEffectDate COBOL Name:
   * BHI-REQ-EFFECT-DATE - dbhsCancDt COBOL Name: DBHS-CANC-DT - crtnReqCancDt COBOL Name:
   * CRTN-REQ-CANC-DT - bhiReqCancelDate COBOL Name: BHI-REQ-CANCEL-DATE - crtnFunction COBOL Name:
   * CRTN-FUNCTION - rc COBOL Name: RETURN-CODE - returnCode COBOL Name: WS-RETURN-CODE -
   * dsmReturnCode COBOL Name: DSM-RETURN-CODE - dsmSqlErrorLevel COBOL Name: DSM-SQL-ERROR-LEVEL -
   * dsmEditErrorValueTxt COBOL Name: DSM-EDIT-ERROR-VALUE-TXT - dsmFuncCd COBOL Name: DSM-FUNC-CD -
   * dsmEditErrorField COBOL Name: DSM-EDIT-ERROR-FIELD - sqlcode COBOL Name: SQLCODE - sqlcode_Ws
   * COBOL Name: WS-SQLCODE - dsmSqlcode COBOL Name: DSM-SQLCODE - dsmErrTblName COBOL Name:
   * DSM-ERR-TBL-NAME - dsmErrSectnName COBOL Name: DSM-ERR-SECTN-NAME - dsmErrTblAction COBOL Name:
   * DSM-ERR-TBL-ACTION
   *
   * @throws CFException
   */
  @Override
  public BhiOpenCursorOutCtx bhiOpenCursor(BhiOpenCursorInCtx methodIn) throws Exception {

    // *81***************************************************************
    // *81 2100-Bhi-open-cursor                                         *
    // *81                                                              *
    // *81 business function:                                           *
    // *81 open cursor hipaa_srvc_csr                                   *
    // *81***************************************************************
    // *82***************************************************************
    // *82 2100-bhi-open-cursor                                         *
    // *82 1) open hipaa_srvc_csr cursor                                *
    // *82***************************************************************
    // Added variable to get the program context in place.
    D5427bhiCtx programCtx = methodIn.getD5427bhiCtx();
    // Added variable to get the output context in place.
    BhiOpenCursorOutCtx methodOut = methodIn.getBhiOpenCursorOutCtx();
    //  cobolCode::MOVE WS-STS-ACTIVE TO DBHS-STS-CD , CRTN-STS-CD
    methodOut.setDbhsStsCd(methodOut.getStsActive());
    methodOut.setCrtnStsCd(methodOut.getStsActive());
    //  cobolCode::MOVE BHI-REQ-SLOT-TABLE TO DBHS-SLOT-TBL-ID , CRTN-SLOT-TBL-ID
    methodOut.setDbhsSlotTblId(methodOut.getBhiReqSlotTable());
    methodOut.setCrtnSlotTblId(methodOut.getBhiReqSlotTable());
    //  cobolCode::MOVE BHI-REQ-HIPAA-VER-NBR TO DBHS-HIPAA-VER-NBR , CRTN-HIPAA-VER-NBR
    methodOut.setDbhsHipaaVerNbr(methodOut.getBhiReqHipaaVerNbr());
    methodOut.setCrtnHipaaVerNbr(methodOut.getBhiReqHipaaVerNbr());
    //  cobolCode::MOVE BHI-REQ-HIPAA-CODE TO DBHS-HIPAA-CD , CRTN-HIPAA-CD
    methodOut.setDbhsHipaaCd(methodOut.getBhiReqHipaaCode());
    methodOut.setCrtnHipaaCd(methodOut.getBhiReqHipaaCode());
    //  cobolCode::MOVE BHI-REQ-EFFECT-DATE TO DBHS-EFF-DT , CRTN-REQ-EFF-DT
    methodOut.setDbhsEffDt(methodOut.getBhiReqEffectDate());
    methodOut.setCrtnReqEffDt(methodOut.getBhiReqEffectDate());
    //  cobolCode::MOVE BHI-REQ-CANCEL-DATE TO DBHS-CANC-DT , CRTN-REQ-CANC-DT
    methodOut.setDbhsCancDt(methodOut.getBhiReqCancelDate());
    methodOut.setCrtnReqCancDt(methodOut.getBhiReqCancelDate());
    //  cobolCode::SET CRTN-FUNCTION-IS-OPEN TO TRUE
    methodOut.setCrtnFunctionIsOpenTrue();

    // ******************************************************************
    // *****Below code comented out for cache redesign ******************
    // ******************************************************************
    //  cobolCode::CALL C5427BHI USING DFHEIBLK, CACHE-COMM-AREA
    try {

      // ******************************************************************
      // *****Below code comented out for cache redesign ******************
      // ******************************************************************
      programCtx.setRc(
          c5427bhi.call(
              programCtx.getGlobalCtx().getContext("C5427BHI"),
              programCtx.getCicsSession(),
              methodOut.getCacheCommArea()));
    } catch (Exception e1) {
      //  LITERAL_EX = 'EX'
      methodOut.setReturnCode(CONSTANTS.LITERAL_EX);
    }
    //  cobolCode::EVALUATE WS-RETURN-CODE
    switch (new String(methodOut.getReturnCode())) {
      case "EX":
        //  cobolCode::SET DSM-EDIT-ERROR TO TRUE
        methodOut.setDsmEditErrorTrue();

        //  cobolCode::SET DSM-PROCESS-ERROR TO TRUE
        methodOut.setDsmProcessErrorTrue();

        //  cobolCode::MOVE DSM-FUNC-CD TO DSM-EDIT-ERROR-VALUE-TXT
        methodOut
            .getDsmEditErrorValueTxt()
            .setString(String.valueOf(methodOut.getDsmFuncCdString()).toCharArray());
        //  cobolCode::MOVE 'GENERIC CALL TO CACHE MODULE' TO DSM-EDIT-ERROR-FIELD
        methodOut.setDsmEditErrorField(CONSTANTS.LITERAL_GENERIC_B6_CALLTOCACHEMODULE);
        // cobolCode::GO TO 2000-EXIT
        return methodOut;
        // cobolCodeEnds::GO TO 2000-EXIT

    }
    //  cobolCode::IF NOT CRTN-SRCH-FOUND-SW-IS-OVERFLOW
    if (!(methodIn.isCrtnSrchFoundSwIsOverflow())) {
      methodOut.setSqlcode(0);
    }
    //  cobolCode::ELSE
    else {
      //  cobolCode::SELECT SRVC_CD , A.PL_OF_SRVC_CD , A.CAUS_CD , A.BEN_LVL_CD , A.NTWK_TYP_CD ,
      // A.IN_NTWK_CLSS_CD , A.TIER1_NTWK_CLSS_CD , A.PROC_CD_RNG_BEGN_VAL , A.PROC_CD_RNG_END_VAL ,
      // A.PROC_CD_RNG_TYP_VAL , A.PROV_ORG_TYP_CD , COALESCE ( B.HIPAA_COMMT_TXT , ' ' ) FROM
      // BEN_HIPAA_SRVC A LEFT OUTER JOIN BEN_HIPAA_SRVC_DTLS B ON A.HIPAA_CD = B.HIPAA_CD AND
      // A.SLOT_TBL_ID = B.SLOT_TBL_ID AND A.HIPAA_VER_NBR = B.HIPAA_VER_NBR AND A.NTWK_TYP_CD =
      // B.NTWK_TYP_CD AND A.EFF_DT = B.EFF_DT AND A.CANC_DT = B.CANC_DT AND A.CREAT_DTTM =
      // B.CREAT_DTTM AND A.STS_CD = B.STS_CD WHERE A.HIPAA_CD = ? AND A.SLOT_TBL_ID = ? AND
      // A.HIPAA_VER_NBR = ? AND ( ( A.EFF_DT <= ? AND A.CANC_DT >= ? ) OR ( A.EFF_DT <= ? AND
      // A.CANC_DT >= ? ) ) AND A.STS_CD = ?
      programCtx.setHipaaSrvcCsrResultSet(
          d5427bhiRepository.openHipaaSrvcCsrD5427bhi(
              programCtx.getSqlca(), methodIn.getDclbenHipaaSrvc()));
    }

    // *    End-exec.
    //  cobolCode::MOVE SQLCODE TO WS-SQLCODE DSM-SQLCODE
    methodOut.setSqlcode_Ws(methodOut.getSqlcode());
    methodOut.setDsmSqlcode(methodOut.getSqlcode());
    //  cobolCode::EVALUATE TRUE
    if (methodOut.isSqlcodeOk()) {;
    } else {
      //  cobolCode::SET DSM-DB2-ERROR TO TRUE
      methodOut.setDsmDb2ErrorTrue();

      //  cobolCode::MOVE 'HIPAA_SRVC_CSR' TO DSM-ERR-TBL-NAME
      methodOut.setDsmErrTblName(CONSTANTS.LITERAL_HIPAA_SRVC_CSR_B11_);
      //  cobolCode::MOVE '2100-BHI-OPEN-CURSOR' TO DSM-ERR-SECTN-NAME
      methodOut.setDsmErrSectnName(CONSTANTS.LITERAL_1400190399);
      //  cobolCode::MOVE 'OPEN' TO DSM-ERR-TBL-ACTION
      methodOut.setDsmErrTblAction(CONSTANTS.LITERAL_OPEN_B6_);
      //  cobolCode::PERFORM 7777-MOVES-FOR-ERROR-LOG
      movesForErrorLog(programCtx.getMovesForErrorLogInCtx()); /*7777-MOVES-FOR-ERROR-LOG SECTION*/
      if (programCtx.isProgramEnded()) {
        return methodOut;
      }
    }

    return methodOut;
  }
  /**
   * bhiFetchCursor This method is derived from COBOL Paragraph - 2200-BHI-FETCH-CURSOR SECTION
   * COBOL Cyclomatic complexity - 11 Input :
   *
   * <p>- crtnSrchFoundSw COBOL Name: CRTN-SRCH-FOUND-SW - dsmFuncCd COBOL Name: DSM-FUNC-CD -
   * crtnSrvcCd COBOL Name: CRTN-SRVC-CD - crtnPlOfSrvcCd COBOL Name: CRTN-PL-OF-SRVC-CD -
   * crtnCausCd COBOL Name: CRTN-CAUS-CD - crtnBenLvlCd COBOL Name: CRTN-BEN-LVL-CD - crtnNtwkTypCd
   * COBOL Name: CRTN-NTWK-TYP-CD - crtnInNtwkClssCd COBOL Name: CRTN-IN-NTWK-CLSS-CD -
   * crtnTier1NtwkClssCd COBOL Name: CRTN-TIER1-NTWK-CLSS-CD - crtnProcCdRngBegnVal COBOL Name:
   * CRTN-PROC-CD-RNG-BEGN-VAL - crtnProcCdRngEndVal COBOL Name: CRTN-PROC-CD-RNG-END-VAL -
   * crtnProcCdRngTypVal COBOL Name: CRTN-PROC-CD-RNG-TYP-VAL - crtnProvOrgTypCd COBOL Name:
   * CRTN-PROV-ORG-TYP-CD - crtnHipaaCommtTxt COBOL Name: CRTN-HIPAA-COMMT-TXT - bhiRetBhiCnt COBOL
   * Name: BHI-RET-BHI-CNT - bhiReqHipaaCode COBOL Name: BHI-REQ-HIPAA-CODE - bhiReqSlotTable COBOL
   * Name: BHI-REQ-SLOT-TABLE
   *
   * <p>Output :
   *
   * <p>- crtnFunction COBOL Name: CRTN-FUNCTION - rc COBOL Name: RETURN-CODE - returnCode COBOL
   * Name: WS-RETURN-CODE - dsmReturnCode COBOL Name: DSM-RETURN-CODE - dsmSqlErrorLevel COBOL Name:
   * DSM-SQL-ERROR-LEVEL - dsmEditErrorValueTxt COBOL Name: DSM-EDIT-ERROR-VALUE-TXT - dsmFuncCd
   * COBOL Name: DSM-FUNC-CD - dsmEditErrorField COBOL Name: DSM-EDIT-ERROR-FIELD - sqlcode COBOL
   * Name: SQLCODE - dbhsSrvcCd COBOL Name: DBHS-SRVC-CD - crtnSrvcCd COBOL Name: CRTN-SRVC-CD -
   * dbhsPlOfSrvcCd COBOL Name: DBHS-PL-OF-SRVC-CD - crtnPlOfSrvcCd COBOL Name: CRTN-PL-OF-SRVC-CD -
   * dbhsCausCd COBOL Name: DBHS-CAUS-CD - crtnCausCd COBOL Name: CRTN-CAUS-CD - dbhsBenLvlCd COBOL
   * Name: DBHS-BEN-LVL-CD - crtnBenLvlCd COBOL Name: CRTN-BEN-LVL-CD - dbhsNtwkTypCd COBOL Name:
   * DBHS-NTWK-TYP-CD - crtnNtwkTypCd COBOL Name: CRTN-NTWK-TYP-CD - dbhsInNtwkClssCd COBOL Name:
   * DBHS-IN-NTWK-CLSS-CD - crtnInNtwkClssCd COBOL Name: CRTN-IN-NTWK-CLSS-CD - dbhsTier1NtwkClssCd
   * COBOL Name: DBHS-TIER1-NTWK-CLSS-CD - crtnTier1NtwkClssCd COBOL Name: CRTN-TIER1-NTWK-CLSS-CD -
   * dbhsProcCdRngBegnVal COBOL Name: DBHS-PROC-CD-RNG-BEGN-VAL - crtnProcCdRngBegnVal COBOL Name:
   * CRTN-PROC-CD-RNG-BEGN-VAL - dbhsProcCdRngEndVal COBOL Name: DBHS-PROC-CD-RNG-END-VAL -
   * crtnProcCdRngEndVal COBOL Name: CRTN-PROC-CD-RNG-END-VAL - dbhsProcCdRngTypVal COBOL Name:
   * DBHS-PROC-CD-RNG-TYP-VAL - crtnProcCdRngTypVal COBOL Name: CRTN-PROC-CD-RNG-TYP-VAL -
   * dbhsProvOrgTypCd COBOL Name: DBHS-PROV-ORG-TYP-CD - crtnProvOrgTypCd COBOL Name:
   * CRTN-PROV-ORG-TYP-CD - dbhsdHipaaCommtTxtText COBOL Name: DBHSD-HIPAA-COMMT-TXT-TEXT -
   * crtnHipaaCommtTxt COBOL Name: CRTN-HIPAA-COMMT-TXT - dclbenHipaaSrvcDtls COBOL Name:
   * DCLBEN-HIPAA-SRVC-DTLS - sqlcode_Ws COBOL Name: WS-SQLCODE - dsmSqlcode COBOL Name: DSM-SQLCODE
   * - dbhiFirstTime COBOL Name: WS-DBHI-FIRST-TIME - bhiRetBhiCnt COBOL Name: BHI-RET-BHI-CNT -
   * bhiRetHipaaCode COBOL Name: BHI-RET-HIPAA-CODE - bhiReqHipaaCode COBOL Name: BHI-REQ-HIPAA-CODE
   * - bhiRetSlotTblId COBOL Name: BHI-RET-SLOT-TBL-ID - bhiReqSlotTable COBOL Name:
   * BHI-REQ-SLOT-TABLE - bhiRetSrvcCode COBOL Name: BHI-RET-SRVC-CODE - bhiRetPlOfSrvcCd COBOL
   * Name: BHI-RET-PL-OF-SRVC-CD - bhiRetCausCd COBOL Name: BHI-RET-CAUS-CD - bhiRetBenLvlCd COBOL
   * Name: BHI-RET-BEN-LVL-CD - bhiRetNetInd COBOL Name: BHI-RET-NET-IND - bhiRetInNtwkClssCd COBOL
   * Name: BHI-RET-IN-NTWK-CLSS-CD - bhiRetTier1NtwkClssCd COBOL Name: BHI-RET-TIER1-NTWK-CLSS-CD -
   * bhiRetProcRangeFrom COBOL Name: BHI-RET-PROC-RANGE-FROM - bhiRetProcRangeTo COBOL Name:
   * BHI-RET-PROC-RANGE-TO - bhiRetRowProcType COBOL Name: BHI-RET-ROW-PROC-TYPE -
   * bhiRetProvOrgTypCd COBOL Name: BHI-RET-PROV-ORG-TYP-CD - dbhsdHipaaCommtTxtLen COBOL Name:
   * DBHSD-HIPAA-COMMT-TXT-LEN - bhiRetHipaaCommtTxtLen COBOL Name: BHI-RET-HIPAA-COMMT-TXT-LEN -
   * bhiRetHipaaCommtTxt COBOL Name: BHI-RET-HIPAA-COMMT-TXT - endOfCsrSw COBOL Name:
   * WS-END-OF-CSR-SW - dsmErrTblName COBOL Name: DSM-ERR-TBL-NAME - dsmErrSectnName COBOL Name:
   * DSM-ERR-SECTN-NAME - dsmErrTblAction COBOL Name: DSM-ERR-TBL-ACTION
   *
   * @throws CFException
   */
  @Override
  public BhiFetchCursorOutCtx bhiFetchCursor(BhiFetchCursorInCtx methodIn) throws Exception {

    // *81***************************************************************
    // *81 2200-Bhi-fetch-cursor                                        *
    // *81                                                              *
    // *81 business function:                                           *
    // *81 fetch hipaa_srvc_csr cursor                                  *
    // *81***************************************************************
    // *82***************************************************************
    // *82 2200-bhi-fetch-cursor                                        *
    // *82                                                              *
    // *82 fetch all records from the hipaa_srvc_csr cursor             *
    // *82                                                              *
    // *82***************************************************************

    // ******************************************************************
    // *****Below code comented out for cache redesign ******************
    // ******************************************************************
    // Added variable to get the program context in place.
    D5427bhiCtx programCtx = methodIn.getD5427bhiCtx();
    // Added variable to get the output context in place.
    BhiFetchCursorOutCtx methodOut = methodIn.getBhiFetchCursorOutCtx();
    //  cobolCode::IF NOT CRTN-SRCH-FOUND-SW-IS-OVERFLOW
    if (!(methodIn.isCrtnSrchFoundSwIsOverflow())) {
      //  cobolCode::SET CRTN-FUNCTION-IS-FETCH TO TRUE
      methodOut.setCrtnFunctionIsFetchTrue();

      //  cobolCode::CALL C5427BHI USING DFHEIBLK, CACHE-COMM-AREA
      try {
        programCtx.setRc(
            c5427bhi.call(
                programCtx.getGlobalCtx().getContext("C5427BHI"),
                programCtx.getCicsSession(),
                methodOut.getCacheCommArea()));
      } catch (Exception e1) {
        //  LITERAL_EX = 'EX'
        methodOut.setReturnCode(CONSTANTS.LITERAL_EX);
      }
      //  cobolCode::EVALUATE WS-RETURN-CODE
      switch (new String(methodOut.getReturnCode())) {
        case "EX":
          //  cobolCode::SET DSM-EDIT-ERROR TO TRUE
          methodOut.setDsmEditErrorTrue();

          //  cobolCode::SET DSM-PROCESS-ERROR TO TRUE
          methodOut.setDsmProcessErrorTrue();

          //  cobolCode::MOVE DSM-FUNC-CD TO DSM-EDIT-ERROR-VALUE-TXT
          methodOut
              .getDsmEditErrorValueTxt()
              .setString(String.valueOf(methodOut.getDsmFuncCdString()).toCharArray());
          //  cobolCode::MOVE 'FETCH FROM CACHE MODULE' TO DSM-EDIT-ERROR-FIELD
          methodOut.setDsmEditErrorField(CONSTANTS.LITERAL_FETCH_B10_FROMCACHEMODULE);
          // cobolCode::GO TO 2000-EXIT
          return methodOut;
          // cobolCodeEnds::GO TO 2000-EXIT

      }
      //  cobolCode::EVALUATE TRUE
      if (methodIn.isCrtnSrchFoundSwIsYes()) {
        methodOut.setSqlcode(0);
        //  cobolCode::MOVE CRTN-SRVC-CD TO DBHS-SRVC-CD
        methodOut.setDbhsSrvcCd(methodOut.getCrtnSrvcCd());
        //  cobolCode::MOVE CRTN-PL-OF-SRVC-CD TO DBHS-PL-OF-SRVC-CD
        methodOut.setDbhsPlOfSrvcCd(methodOut.getCrtnPlOfSrvcCd());
        //  cobolCode::MOVE CRTN-CAUS-CD TO DBHS-CAUS-CD
        methodOut.setDbhsCausCd(methodOut.getCrtnCausCd());
        //  cobolCode::MOVE CRTN-BEN-LVL-CD TO DBHS-BEN-LVL-CD
        methodOut.setDbhsBenLvlCd(methodOut.getCrtnBenLvlCd());
        //  cobolCode::MOVE CRTN-NTWK-TYP-CD TO DBHS-NTWK-TYP-CD
        methodOut.setDbhsNtwkTypCd(methodOut.getCrtnNtwkTypCd());
        //  cobolCode::MOVE CRTN-IN-NTWK-CLSS-CD TO DBHS-IN-NTWK-CLSS-CD
        methodOut.setDbhsInNtwkClssCd(methodOut.getCrtnInNtwkClssCd());
        //  cobolCode::MOVE CRTN-TIER1-NTWK-CLSS-CD TO DBHS-TIER1-NTWK-CLSS-CD
        methodOut.setDbhsTier1NtwkClssCd(methodOut.getCrtnTier1NtwkClssCd());
        //  cobolCode::MOVE CRTN-PROC-CD-RNG-BEGN-VAL TO DBHS-PROC-CD-RNG-BEGN-VAL
        methodOut.setDbhsProcCdRngBegnVal(methodOut.getCrtnProcCdRngBegnVal());
        //  cobolCode::MOVE CRTN-PROC-CD-RNG-END-VAL TO DBHS-PROC-CD-RNG-END-VAL
        methodOut.setDbhsProcCdRngEndVal(methodOut.getCrtnProcCdRngEndVal());
        //  cobolCode::MOVE CRTN-PROC-CD-RNG-TYP-VAL TO DBHS-PROC-CD-RNG-TYP-VAL
        methodOut.setDbhsProcCdRngTypVal(methodOut.getCrtnProcCdRngTypVal());
        //  cobolCode::MOVE CRTN-PROV-ORG-TYP-CD TO DBHS-PROV-ORG-TYP-CD
        methodOut.setDbhsProvOrgTypCd(methodOut.getCrtnProvOrgTypCd());
        //  cobolCode::MOVE CRTN-HIPAA-COMMT-TXT TO DBHSD-HIPAA-COMMT-TXT-TEXT
        methodOut.setDbhsdHipaaCommtTxtText(methodOut.getCrtnHipaaCommtTxt());
      } else {
        methodOut.setSqlcode(100);
      }
    }
    //  cobolCode::ELSE
    else {
      //  cobolCode::INITIALIZE DCLBEN-HIPAA-SRVC-DTLS
      methodOut.getDclbenHipaaSrvcDtls().initialize();
      //  cobolCode::FETCH HIPAA_SRVC_CSR INTO ? , ? , ? , ? , ? , ? , ? , ? , ? , ? , ? , ?
      d5427bhiRepository.fetchHipaaSrvcCsrD5427bhi(
          programCtx.getHipaaSrvcCsrResultSet(),
          methodOut.getDclbenHipaaSrvcDtls(),
          programCtx.getSqlca(),
          methodOut.getDclbenHipaaSrvc(),
          methodOut.getWork());
    }
    //  cobolCode::MOVE SQLCODE TO WS-SQLCODE DSM-SQLCODE
    methodOut.setSqlcode_Ws(methodOut.getSqlcode());
    methodOut.setDsmSqlcode(methodOut.getSqlcode());
    //  cobolCode::EVALUATE TRUE
    if (methodOut.isSqlcodeOk()) {
      //  cobolCode::SET DBHI-FIRST-TIME-NO TO TRUE
      methodOut.setDbhiFirstTimeNoTrue();

      //  cobolCode::ADD 1 TO BHI-RET-BHI-CNT
      methodOut.setBhiRetBhiCnt(methodOut.getBhiRetBhiCnt() + 1);
      //  cobolCode::MOVE BHI-REQ-HIPAA-CODE TO BHI-RET-HIPAA-CODE ( BHI-RET-BHI-CNT )
      methodOut.setBhiRetHipaaCode(methodOut.getBhiRetBhiCnt() - 1, methodOut.getBhiReqHipaaCode());
      //  cobolCode::MOVE BHI-REQ-SLOT-TABLE TO BHI-RET-SLOT-TBL-ID ( BHI-RET-BHI-CNT )
      methodOut.setBhiRetSlotTblId(methodOut.getBhiRetBhiCnt() - 1, methodOut.getBhiReqSlotTable());
      //  cobolCode::MOVE DBHS-SRVC-CD TO BHI-RET-SRVC-CODE ( BHI-RET-BHI-CNT )
      methodOut.setBhiRetSrvcCode(methodOut.getBhiRetBhiCnt() - 1, methodOut.getDbhsSrvcCd());
      //  cobolCode::MOVE DBHS-PL-OF-SRVC-CD TO BHI-RET-PL-OF-SRVC-CD ( BHI-RET-BHI-CNT )
      methodOut.setBhiRetPlOfSrvcCd(methodOut.getBhiRetBhiCnt() - 1, methodOut.getDbhsPlOfSrvcCd());
      //  cobolCode::MOVE DBHS-CAUS-CD TO BHI-RET-CAUS-CD ( BHI-RET-BHI-CNT )
      methodOut.setBhiRetCausCd(methodOut.getBhiRetBhiCnt() - 1, methodOut.getDbhsCausCd());
      //  cobolCode::MOVE DBHS-BEN-LVL-CD TO BHI-RET-BEN-LVL-CD ( BHI-RET-BHI-CNT )
      methodOut.setBhiRetBenLvlCd(methodOut.getBhiRetBhiCnt() - 1, methodOut.getDbhsBenLvlCd());
      //  cobolCode::MOVE DBHS-NTWK-TYP-CD TO BHI-RET-NET-IND ( BHI-RET-BHI-CNT )
      methodOut.setBhiRetNetInd(methodOut.getBhiRetBhiCnt() - 1, methodOut.getDbhsNtwkTypCd());
      //  cobolCode::MOVE DBHS-IN-NTWK-CLSS-CD TO BHI-RET-IN-NTWK-CLSS-CD ( BHI-RET-BHI-CNT )
      methodOut.setBhiRetInNtwkClssCd(
          methodOut.getBhiRetBhiCnt() - 1, methodOut.getDbhsInNtwkClssCd());
      //  cobolCode::MOVE DBHS-TIER1-NTWK-CLSS-CD TO BHI-RET-TIER1-NTWK-CLSS-CD ( BHI-RET-BHI-CNT )
      methodOut.setBhiRetTier1NtwkClssCd(
          methodOut.getBhiRetBhiCnt() - 1, methodOut.getDbhsTier1NtwkClssCd());
      //  cobolCode::MOVE DBHS-PROC-CD-RNG-BEGN-VAL TO BHI-RET-PROC-RANGE-FROM ( BHI-RET-BHI-CNT )
      methodOut.setBhiRetProcRangeFrom(
          methodOut.getBhiRetBhiCnt() - 1, methodOut.getDbhsProcCdRngBegnVal());
      //  cobolCode::MOVE DBHS-PROC-CD-RNG-END-VAL TO BHI-RET-PROC-RANGE-TO ( BHI-RET-BHI-CNT )
      methodOut.setBhiRetProcRangeTo(
          methodOut.getBhiRetBhiCnt() - 1, methodOut.getDbhsProcCdRngEndVal());
      //  cobolCode::MOVE DBHS-PROC-CD-RNG-TYP-VAL TO BHI-RET-ROW-PROC-TYPE ( BHI-RET-BHI-CNT )
      methodOut.setBhiRetRowProcType(
          methodOut.getBhiRetBhiCnt() - 1, methodOut.getDbhsProcCdRngTypVal());
      //  cobolCode::MOVE DBHS-PROV-ORG-TYP-CD TO BHI-RET-PROV-ORG-TYP-CD ( BHI-RET-BHI-CNT )
      methodOut.setBhiRetProvOrgTypCd(
          methodOut.getBhiRetBhiCnt() - 1, methodOut.getDbhsProvOrgTypCd());
      //  cobolCode::MOVE DBHSD-HIPAA-COMMT-TXT-LEN TO BHI-RET-HIPAA-COMMT-TXT-LEN ( BHI-RET-BHI-CNT
      // )
      methodOut.setBhiRetHipaaCommtTxtLen(
          methodOut.getBhiRetBhiCnt() - 1, methodOut.getDbhsdHipaaCommtTxtLen());
      //  cobolCode::MOVE DBHSD-HIPAA-COMMT-TXT-TEXT TO BHI-RET-HIPAA-COMMT-TXT ( BHI-RET-BHI-CNT )
      methodOut.setBhiRetHipaaCommtTxt(
          methodOut.getBhiRetBhiCnt() - 1, methodOut.getDbhsdHipaaCommtTxtText());
    } else if (methodOut.isSqlcodeNotFound()) {
      //  cobolCode::SET END-OF-CSR TO TRUE
      methodOut.setEndOfCsrTrue();

      // *             If dbhi-first-time-no
      //  cobolCode::IF DBHI-FIRST-TIME-YES
      if (methodOut.isDbhiFirstTimeYes()) {
        //  cobolCode::SET DSM-ENTRY-NOT-FND-INQ TO TRUE
        methodOut.setDsmEntryNotFndInqTrue();
      }
    } else {
      //  cobolCode::SET DSM-DB2-ERROR TO TRUE
      methodOut.setDsmDb2ErrorTrue();

      //  cobolCode::MOVE 'HIPAA_SRVC_CSR' TO DSM-ERR-TBL-NAME
      methodOut.setDsmErrTblName(CONSTANTS.LITERAL_HIPAA_SRVC_CSR_B11_);
      //  cobolCode::MOVE '2200-BHI-FETCH-CURSOR' TO DSM-ERR-SECTN-NAME
      methodOut.setDsmErrSectnName(CONSTANTS.LITERAL_111275328);
      //  cobolCode::MOVE 'FETCH' TO DSM-ERR-TBL-ACTION
      methodOut.setDsmErrTblAction(CONSTANTS.LITERAL_FETCH_B5_);
      //  cobolCode::PERFORM 7777-MOVES-FOR-ERROR-LOG
      movesForErrorLog(programCtx.getMovesForErrorLogInCtx()); /*7777-MOVES-FOR-ERROR-LOG SECTION*/
      if (programCtx.isProgramEnded()) {
        return methodOut;
      }
    }

    return methodOut;
  }
  /**
   * bhiCloseCursor This method is derived from COBOL Paragraph - 2300-BHI-CLOSE-CURSOR SECTION
   * COBOL Cyclomatic complexity - 5 Input :
   *
   * <p>- crtnSrchFoundSw COBOL Name: CRTN-SRCH-FOUND-SW
   *
   * <p>Output :
   *
   * <p>- sqlcode COBOL Name: SQLCODE - sqlcode_Ws COBOL Name: WS-SQLCODE - dsmSqlcode COBOL Name:
   * DSM-SQLCODE - dsmReturnCode COBOL Name: DSM-RETURN-CODE - dsmErrTblName COBOL Name:
   * DSM-ERR-TBL-NAME - dsmErrSectnName COBOL Name: DSM-ERR-SECTN-NAME - dsmErrTblAction COBOL Name:
   * DSM-ERR-TBL-ACTION
   *
   * @throws CFException
   */
  @Override
  public BhiCloseCursorOutCtx bhiCloseCursor(BhiCloseCursorInCtx methodIn) throws Exception {

    // *81***************************************************************
    // *81 2300-Bhi-close-cursor                                        *
    // *81                                                              *
    // *81 business function:                                           *
    // *81 close hipaa_srvc_csr cursor                                  *
    // *81***************************************************************
    // *82***************************************************************
    // *82 2300-bhi-close-cursor                                        *
    // *82                                                              *
    // *82 1. used to close cursor for hipaa_srvc_csr                   *
    // *82***************************************************************

    // ******************************************************************
    // *****Below code comented out for cache redesign ******************
    // ******************************************************************
    // Added variable to get the program context in place.
    D5427bhiCtx programCtx = methodIn.getD5427bhiCtx();
    // Added variable to get the output context in place.
    BhiCloseCursorOutCtx methodOut = methodIn.getBhiCloseCursorOutCtx();
    //  cobolCode::IF NOT CRTN-SRCH-FOUND-SW-IS-OVERFLOW
    if (!(methodIn.isCrtnSrchFoundSwIsOverflow())) {
      methodOut.setSqlcode(0);
    }
    //  cobolCode::ELSE
    else {
      //  cobolCode::CLOSE HIPAA_SRVC_CSR
      d5427bhiRepository.closeHipaaSrvcCsrD5427bhi(
          programCtx.getHipaaSrvcCsrResultSet(), programCtx.getSqlca());
    }

    // *    End-exec.
    //  cobolCode::MOVE SQLCODE TO WS-SQLCODE DSM-SQLCODE
    methodOut.setSqlcode_Ws(methodOut.getSqlcode());
    methodOut.setDsmSqlcode(methodOut.getSqlcode());
    //  cobolCode::EVALUATE TRUE
    if (methodOut.isSqlcodeOk()) {;
    } else {
      //  cobolCode::SET DSM-DB2-ERROR TO TRUE
      methodOut.setDsmDb2ErrorTrue();

      //  cobolCode::MOVE 'HIPAA_SRVC_CSR' TO DSM-ERR-TBL-NAME
      methodOut.setDsmErrTblName(CONSTANTS.LITERAL_HIPAA_SRVC_CSR_B11_);
      //  cobolCode::MOVE '2300-BHI-CLOSE-CURSOR' TO DSM-ERR-SECTN-NAME
      methodOut.setDsmErrSectnName(CONSTANTS.LITERAL_16225055);
      //  cobolCode::MOVE 'CLOSE' TO DSM-ERR-TBL-ACTION
      methodOut.setDsmErrTblAction(CONSTANTS.LITERAL_CLOSE_B5_);
      //  cobolCode::PERFORM 7777-MOVES-FOR-ERROR-LOG
      movesForErrorLog(programCtx.getMovesForErrorLogInCtx()); /*7777-MOVES-FOR-ERROR-LOG SECTION*/
      if (programCtx.isProgramEnded()) {
        return methodOut;
      }
    }

    return methodOut;
  }
  /**
   * processScreenRequest This method is derived from COBOL Paragraph - 3000-PROCESS-SCREEN-REQUEST
   * SECTION COBOL Cyclomatic complexity - 8 Input :
   *
   * <p>- bhiReqType COBOL Name: BHI-REQ-TYPE - sub COBOL Name: WS-SUB - bhiReqRowAct COBOL Name:
   * BHI-REQ-ROW-ACT
   *
   * <p>Output :
   *
   * <p>- sub COBOL Name: WS-SUB
   *
   * @throws CFException
   */
  @Override
  public ProcessScreenRequestOutCtx processScreenRequest(ProcessScreenRequestInCtx methodIn)
      throws Exception {

    // *81***************************************************************
    // *81 3000-Process-screen-request                                  *
    // *81                                                              *
    // *81 business function: perform bhi screen process request        *
    // *81***************************************************************
    // *82***************************************************************
    // *82 3000-process-screen-request                                  *
    // *82                                                              *
    // *82 process screen requests - browse, validation and update.     *
    // *82***************************************************************
    // Added variable to get the program context in place.
    D5427bhiCtx programCtx = methodIn.getD5427bhiCtx();
    // Added variable to get the output context in place.
    ProcessScreenRequestOutCtx methodOut = methodIn.getProcessScreenRequestOutCtx();
    //  cobolCode::EVALUATE TRUE
    if (methodIn.isBhiScreenBrowse()) {
      //  cobolCode::PERFORM 4000-PROCESS-SCREEN-BROWSE
      processScreenBrowse(
          programCtx.getProcessScreenBrowseInCtx()); /*4000-PROCESS-SCREEN-BROWSE SECTION*/
      if (programCtx.isProgramEnded()) {
        return methodOut;
      }
    } else if (methodIn.isBhiScreenValidate()) {
      //  cobolCode::PERFORM VARYING WS-SUB FROM 1 BY 1 UNTIL WS-SUB > 15
      for (methodOut.setSub(1);
          ((methodOut.getSub() <= 15));
          methodOut.setSub(methodOut.getSub() + 1)) {
        //  cobolCode::IF BHI-REQ-ROW-ACT ( WS-SUB ) = 'A' OR 'U'
        if (methodIn.getBhiReqRowAct(methodOut.getSub() - 1)[0] == 'A'
            || methodIn.getBhiReqRowAct(methodOut.getSub() - 1)[0] == 'U') {
          //  cobolCode::PERFORM 5800-MOVE-ROW-TO-DCLGEN
          moveRowToDclgen(programCtx.getMoveRowToDclgenInCtx()); /*5800-MOVE-ROW-TO-DCLGEN SECTION*/
          if (programCtx.isProgramEnded()) {
            return methodOut;
          }
          //  cobolCode::PERFORM 5300-VALIDATE-ADD-UPDATE-REQ
          validateAddUpdateReq(programCtx); /*5300-VALIDATE-ADD-UPDATE-REQ SECTION*/
          if (programCtx.isProgramEnded()) {
            return methodOut;
          }
        }
      }
    } else if (methodIn.isBhiScreenUpdate()) {
      //  cobolCode::PERFORM 5000-PROCESS-SCREEN-UPDATE
      processScreenUpdate(
          programCtx.getProcessScreenUpdateInCtx()); /*5000-PROCESS-SCREEN-UPDATE SECTION*/
      if (programCtx.isProgramEnded()) {
        return methodOut;
      }
    }

    return methodOut;
  }
  /**
   * processScreenBrowse This method is derived from COBOL Paragraph - 4000-PROCESS-SCREEN-BROWSE
   * SECTION COBOL Cyclomatic complexity - 34 Input :
   *
   * <p>- bhiReqFiltTbl COBOL Name: BHI-REQ-FILT-TBL - sqlcode_Ws COBOL Name: WS-SQLCODE -
   * bhiBrowseTypeSw COBOL Name: BHI-BROWSE-TYPE-SW - bhiRetReasonCode COBOL Name:
   * BHI-RET-REASON-CODE - startingRowNbr COBOL Name: WS-STARTING-ROW-NBR - rowSub COBOL Name:
   * WS-ROW-SUB - rowCount COBOL Name: WS-ROW-COUNT - bhiReqFiltStsCd COBOL Name:
   * BHI-REQ-FILT-STS-CD - bhiStsCd COBOL Name: WS-BHI-STS-CD
   *
   * <p>Output :
   *
   * <p>- sub COBOL Name: WS-SUB - endOfCsrSw COBOL Name: WS-END-OF-CSR-SW - retAreaLimit COBOL
   * Name: WS-RET-AREA-LIMIT - rowSub COBOL Name: WS-ROW-SUB - bhiNumOccurs COBOL Name:
   * BHI-NUM-OCCURS - bhiRetReasonCode COBOL Name: BHI-RET-REASON-CODE - startingRowNbr COBOL Name:
   * WS-STARTING-ROW-NBR
   *
   * @throws CFException
   */
  @Override
  public ProcessScreenBrowseOutCtx processScreenBrowse(ProcessScreenBrowseInCtx methodIn)
      throws Exception {

    // *81***************************************************************
    // *81 4000-Process-screen-browse                                   *
    // *81 business function:                                           *
    // *81 initial/forward/backward inquiry on bhi screen               *
    // *81***************************************************************
    // *82***************************************************************
    // *82 4000-process-screen-browse                                   *
    // *82 1.cursor-slot-table cursor is processed when a request       *
    // *82   is made with the slot table id (bhi,xxxxxx,).              *
    // *82                                                              *
    // *82 2.cursor-all cursor is processed when a request is made      *
    // *82   without the control line parameters(bhi,,)                 *
    // *82                                                              *
    // *82***************************************************************
    // Added variable to get the program context in place.
    D5427bhiCtx programCtx = methodIn.getD5427bhiCtx();
    // Added variable to get the output context in place.
    ProcessScreenBrowseOutCtx methodOut = methodIn.getProcessScreenBrowseOutCtx();
    //  cobolCode::IF BHI-REQ-FILT-TBL > SPACES
    if ((isGreaterThanSpaces(methodIn.getBhiReqFiltTbl()))) {
      //  cobolCode::PERFORM 4100-OPEN-CSR-SLOT-TBL
      openCsrSlotTbl(programCtx.getOpenCsrSlotTblInCtx()); /*4100-OPEN-CSR-SLOT-TBL SECTION*/
      if (programCtx.isProgramEnded()) {
        return methodOut;
      }
      //  cobolCode::IF WS-SQLCODE-OK
      if (methodIn.isSqlcodeOk()) {
        //  cobolCode::EVALUATE TRUE
        if (methodIn.isInitReqBhi()) {
          //  cobolCode::MOVE 1 TO WS-SUB
          methodOut.setSub(1);
          //  LITERAL_N = 'N'
          methodOut.setEndOfCsrSw(CONSTANTS.LITERAL_N);
          //  LITERAL_N = 'N'
          methodOut.setRetAreaLimit(CONSTANTS.LITERAL_N);
          //  cobolCode::PERFORM 4200-FETCH-CSR-SLOT-TBL-DATA UNTIL END-OF-CSR OR RET-AREA-FULL
          while (!(methodOut.isEndOfCsr()) && !(methodOut.isRetAreaFull())) {
            fetchCsrSlotTblData(
                programCtx.getFetchCsrSlotTblDataInCtx()); /*4200-FETCH-CSR-SLOT-TBL-DATA SECTION*/
            if (programCtx.isProgramEnded()) {
              return methodOut;
            }
          }
        } else if ((methodIn.isBrowseForward()) || (methodIn.isBrowseBack())) {
          //  cobolCode::MOVE ZEROS TO WS-SUB
          methodOut.setSub(0);
          //  LITERAL_N = 'N'
          methodOut.setEndOfCsrSw(CONSTANTS.LITERAL_N);
          //  LITERAL_N = 'N'
          methodOut.setRetAreaLimit(CONSTANTS.LITERAL_N);
          //  cobolCode::PERFORM 4200A-FETCH-CSR-SLOT-TBL-DATA UNTIL END-OF-CSR
          while (!(methodOut.isEndOfCsr())) {
            fetchCsrSlotTblData4200A(
                programCtx
                    .getFetchCsrSlotTblData4200AInCtx()); /*4200A-FETCH-CSR-SLOT-TBL-DATA SECTION*/
            if (programCtx.isProgramEnded()) {
              return methodOut;
            }
          }
          //  cobolCode::IF BHI-NO-ERRORS OR BHI-NO-ERRS-MORE-ROWS
          if (methodIn.isBhiNoErrors() || methodOut.isBhiNoErrsMoreRows()) {
            //  cobolCode::PERFORM 4750-DETERMINE-STARTING-ROW
            determineStartingRow(
                programCtx.getDetermineStartingRowInCtx()); /*4750-DETERMINE-STARTING-ROW SECTION*/
            if (programCtx.isProgramEnded()) {
              return methodOut;
            }
            //  cobolCode::MOVE 1 TO WS-SUB
            methodOut.setSub(1);
            //  cobolCode::PERFORM 4800-POPULATE-RETURN-FIELDS VARYING WS-ROW-SUB FROM
            // WS-STARTING-ROW-NBR BY 1 UNTIL RET-AREA-FULL OR WS-ROW-SUB > WS-ROW-COUNT
            for (methodOut.setRowSub(methodOut.getStartingRowNbr());
                !(methodOut.isRetAreaFull()) && (methodOut.getRowSub() <= methodIn.getRowCount());
                methodOut.setRowSub(methodOut.getRowSub() + 1)) {
              populateReturnFields4800(
                  programCtx
                      .getPopulateReturnFields4800InCtx()); /*4800-POPULATE-RETURN-FIELDS SECTION*/
              if (programCtx.isProgramEnded()) {
                return methodOut;
              }
            }
          }
        }
        //  cobolCode::IF RET-AREA-FULL
        if (methodOut.isRetAreaFull()) {
          //  cobolCode::MOVE 15 TO BHI-NUM-OCCURS
          methodOut.setBhiNumOccurs(15);
          //  cobolCode::SET BHI-NO-ERRS-MORE-ROWS TO TRUE
          methodOut.setBhiNoErrsMoreRowsTrue();

        }
        //  cobolCode::ELSE
        else {
          //  cobolCode::MOVE WS-SUB TO BHI-NUM-OCCURS
          methodOut.setBhiNumOccurs(methodOut.getSub());
          //  cobolCode::SUBTRACT 1 FROM BHI-NUM-OCCURS
          methodOut.setBhiNumOccurs((short) (methodOut.getBhiNumOccurs() - (short) 1));
        }
      }
      //  cobolCode::IF WS-SQLCODE-OK OR WS-SQLCODE-NOT-FOUND
      if (methodIn.isSqlcodeOk() || methodIn.isSqlcodeNotFound()) {
        //  cobolCode::PERFORM 4400-CLOSE-CSR-SLOT-TBL
        closeCsrSlotTbl(programCtx.getCloseCsrSlotTblInCtx()); /*4400-CLOSE-CSR-SLOT-TBL SECTION*/
        if (programCtx.isProgramEnded()) {
          return methodOut;
        }
      }
    }
    //  cobolCode::ELSE
    else {
      //  cobolCode::PERFORM 4500-OPEN-CSR-ALL
      openCsrAll(programCtx.getOpenCsrAllInCtx()); /*4500-OPEN-CSR-ALL SECTION*/
      if (programCtx.isProgramEnded()) {
        return methodOut;
      }
      //  cobolCode::IF WS-SQLCODE-OK
      if (methodIn.isSqlcodeOk()) {
        //  cobolCode::EVALUATE TRUE
        if (methodIn.isInitReqBhi()) {
          //  cobolCode::MOVE 1 TO WS-SUB
          methodOut.setSub(1);
          //  LITERAL_N = 'N'
          methodOut.setEndOfCsrSw(CONSTANTS.LITERAL_N);
          //  LITERAL_N = 'N'
          methodOut.setRetAreaLimit(CONSTANTS.LITERAL_N);
          //  cobolCode::PERFORM 4600-FETCH-CURSOR-ALL-DATA UNTIL END-OF-CSR OR RET-AREA-FULL
          while (!(methodOut.isEndOfCsr()) && !(methodOut.isRetAreaFull())) {
            fetchCursorAllData(
                programCtx.getFetchCursorAllDataInCtx()); /*4600-FETCH-CURSOR-ALL-DATA SECTION*/
            if (programCtx.isProgramEnded()) {
              return methodOut;
            }
          }
        } else if ((methodIn.isBrowseForward()) || (methodIn.isBrowseBack())) {
          //  cobolCode::MOVE ZEROS TO WS-SUB
          methodOut.setSub(0);
          //  LITERAL_N = 'N'
          methodOut.setEndOfCsrSw(CONSTANTS.LITERAL_N);
          //  cobolCode::PERFORM 4600A-FETCH-CURSOR-ALL-DATA UNTIL END-OF-CSR
          while (!(methodOut.isEndOfCsr())) {
            fetchCursorAllData4600A(
                programCtx
                    .getFetchCursorAllData4600AInCtx()); /*4600A-FETCH-CURSOR-ALL-DATA SECTION*/
            if (programCtx.isProgramEnded()) {
              return methodOut;
            }
          }
          //  cobolCode::IF BHI-NO-ERRORS OR BHI-NO-ERRS-MORE-ROWS
          if (methodIn.isBhiNoErrors() || methodOut.isBhiNoErrsMoreRows()) {

            // *                      Perform 4750-determine-starting-row
            //  cobolCode::MOVE 1 TO WS-STARTING-ROW-NBR
            methodOut.setStartingRowNbr(1);
            //  cobolCode::MOVE 1 TO WS-SUB
            methodOut.setSub(1);
            //  cobolCode::PERFORM VARYING WS-ROW-SUB FROM WS-STARTING-ROW-NBR BY 1 UNTIL
            // RET-AREA-FULL OR WS-ROW-SUB > WS-ROW-COUNT
            for (methodOut.setRowSub(methodOut.getStartingRowNbr());
                (!(methodOut.isRetAreaFull()) && (methodOut.getRowSub() <= methodIn.getRowCount()));
                methodOut.setRowSub(methodOut.getRowSub() + 1)) {
              //  cobolCode::IF BHI-REQ-FILT-STS-CD > SPACES
              if ((isGreaterThanSpaces(methodIn.getBhiReqFiltStsCd()))) {
                //  cobolCode::IF BHI-REQ-FILT-STS-CD = WS-BHI-STS-CD ( WS-ROW-SUB )
                if (compareChars(
                        methodIn.getBhiReqFiltStsCd(),
                        methodIn.getBhiStsCd(methodOut.getRowSub() - 1))
                    == 0) {
                  //  cobolCode::PERFORM 4800-POPULATE-RETURN-FIELDS
                  populateReturnFields4800(
                      programCtx
                          .getPopulateReturnFields4800InCtx()); /*4800-POPULATE-RETURN-FIELDS SECTION*/
                  if (programCtx.isProgramEnded()) {
                    return methodOut;
                  }
                }
              }
              //  cobolCode::ELSE
              else {
                //  cobolCode::PERFORM 4800-POPULATE-RETURN-FIELDS
                populateReturnFields4800(
                    programCtx
                        .getPopulateReturnFields4800InCtx()); /*4800-POPULATE-RETURN-FIELDS SECTION*/
                if (programCtx.isProgramEnded()) {
                  return methodOut;
                }
              }
            }
          }
        }
        //  cobolCode::IF RET-AREA-FULL
        if (methodOut.isRetAreaFull()) {
          //  cobolCode::MOVE 15 TO BHI-NUM-OCCURS
          methodOut.setBhiNumOccurs(15);
          //  cobolCode::SET BHI-NO-ERRS-MORE-ROWS TO TRUE
          methodOut.setBhiNoErrsMoreRowsTrue();

        }
        //  cobolCode::ELSE
        else {
          //  cobolCode::MOVE WS-SUB TO BHI-NUM-OCCURS
          methodOut.setBhiNumOccurs(methodOut.getSub());
          //  cobolCode::SUBTRACT 1 FROM BHI-NUM-OCCURS
          methodOut.setBhiNumOccurs((short) (methodOut.getBhiNumOccurs() - (short) 1));
        }
      }
      //  cobolCode::IF WS-SQLCODE-OK OR WS-SQLCODE-NOT-FOUND
      if (methodIn.isSqlcodeOk() || methodIn.isSqlcodeNotFound()) {
        //  cobolCode::PERFORM 4900-CLOSE-CSR-ALL
        closeCsrAll(programCtx.getCloseCsrAllInCtx()); /*4900-CLOSE-CSR-ALL SECTION*/
        if (programCtx.isProgramEnded()) {
          return methodOut;
        }
      }
    }

    return methodOut;
  }
  /**
   * openCsrSlotTbl This method is derived from COBOL Paragraph - 4100-OPEN-CSR-SLOT-TBL SECTION
   * COBOL Cyclomatic complexity - 4 Input :
   *
   * <p>- bhiReqFiltTbl COBOL Name: BHI-REQ-FILT-TBL - sqlcode COBOL Name: SQLCODE
   *
   * <p>Output :
   *
   * <p>- dbhsSlotTblId COBOL Name: DBHS-SLOT-TBL-ID - bhiReqFiltTbl COBOL Name: BHI-REQ-FILT-TBL -
   * sqlcode_Ws COBOL Name: WS-SQLCODE - dsmSqlcode COBOL Name: DSM-SQLCODE - sqlcode COBOL Name:
   * SQLCODE - dsmReturnCode COBOL Name: DSM-RETURN-CODE - bhiRetReasonCode COBOL Name:
   * BHI-RET-REASON-CODE - bhiDb2RetCode COBOL Name: BHI-DB2-RET-CODE - bhiDb2Table COBOL Name:
   * BHI-DB2-TABLE - bhiDb2ParaNm COBOL Name: BHI-DB2-PARA-NM - bhiDb2Action COBOL Name:
   * BHI-DB2-ACTION
   *
   * @throws CFException
   */
  @Override
  public OpenCsrSlotTblOutCtx openCsrSlotTbl(OpenCsrSlotTblInCtx methodIn) throws Exception {

    // *81***************************************************************
    // *81 4100-Open-csr-slot-tbl                                       *
    // *81                                                              *
    // *81 business function: open cursor-slot-table                    *
    // *81                                                              *
    // *81***************************************************************
    // *82***************************************************************
    // *82 4100-open-csr-slot-tbl                                       *
    // *82                                                              *
    // *82 open cursor-slot-table                                       *
    // *82***************************************************************
    // Added variable to get the program context in place.
    D5427bhiCtx programCtx = methodIn.getD5427bhiCtx();
    // Added variable to get the output context in place.
    OpenCsrSlotTblOutCtx methodOut = methodIn.getOpenCsrSlotTblOutCtx();
    //  cobolCode::MOVE BHI-REQ-FILT-TBL TO DBHS-SLOT-TBL-ID
    methodOut.setDbhsSlotTblId(methodOut.getBhiReqFiltTbl());
    //  cobolCode::SELECT SLOT_TBL_ID , SRVC_CD , EFF_DT , PL_OF_SRVC_CD , CAUS_CD , BEN_LVL_CD ,
    // NTWK_TYP_CD , PROC_CD_RNG_BEGN_VAL , PROC_CD_RNG_END_VAL , PROC_CD_RNG_TYP_VAL ,
    // HIPAA_VER_NBR , HIPAA_CD , IN_NTWK_CLSS_CD , TIER1_NTWK_CLSS_CD , CANC_DT , LST_UPDT_DTTM ,
    // LST_UPDT_USER_ID , STS_CD , PROV_ORG_TYP_CD FROM BEN_HIPAA_SRVC WHERE SLOT_TBL_ID = ? ORDER
    // BY HIPAA_VER_NBR ASC , SLOT_TBL_ID ASC , HIPAA_CD ASC , SRVC_CD ASC , NTWK_TYP_CD ASC ,
    // PROV_ORG_TYP_CD ASC , STS_CD ASC , EFF_DT DESC , LST_UPDT_DTTM DESC
    programCtx.setCursorSlotTableResultSet(
        d5427bhiRepository.openCursorSlotTableD5427bhi(
            programCtx.getSqlca(), methodIn.getDclbenHipaaSrvc()));
    //  cobolCode::MOVE SQLCODE TO WS-SQLCODE DSM-SQLCODE
    methodOut.setSqlcode_Ws(methodOut.getSqlcode());
    methodOut.setDsmSqlcode(methodOut.getSqlcode());
    //  cobolCode::EVALUATE TRUE
    if (methodOut.isSqlcodeOk()) {;
    } else {
      //  cobolCode::SET DSM-DB2-ERROR TO TRUE
      methodOut.setDsmDb2ErrorTrue();

      //  cobolCode::SET BHI-DB2-OPEN-ERROR TO TRUE
      methodOut.setBhiDb2OpenErrorTrue();

      //  FORMAT261490060 = "-ZZZZZZ999"
      methodOut.setBhiDb2RetCode(
          CFUtil.cobolNumberFormatter(
              CONSTANTS.FORMAT261490060, String.valueOf(methodOut.getSqlcode()).toCharArray()));
      //  cobolCode::MOVE 'BEN_HIPAA_SRVC' TO BHI-DB2-TABLE
      methodOut.setBhiDb2Table(CONSTANTS.LITERAL_BEN_HIPAA_SRVC_B16_);
      //  cobolCode::MOVE '4100-OPEN-CSR-SLOT-TBL' TO BHI-DB2-PARA-NM
      methodOut.setBhiDb2ParaNm(CONSTANTS.LITERAL_4100_MN4_OPENCSRSLOTTBL_B8_);
      //  cobolCode::MOVE 'OPEN' TO BHI-DB2-ACTION
      methodOut.setBhiDb2Action(CONSTANTS.LITERAL_OPEN_B4_);
      //  cobolCode::PERFORM 7777-MOVES-FOR-ERROR-LOG
      movesForErrorLog(programCtx.getMovesForErrorLogInCtx()); /*7777-MOVES-FOR-ERROR-LOG SECTION*/
      if (programCtx.isProgramEnded()) {
        return methodOut;
      }
    }

    return methodOut;
  }
  /**
   * fetchCsrSlotTblData This method is derived from COBOL Paragraph - 4200-FETCH-CSR-SLOT-TBL-DATA
   * SECTION COBOL Cyclomatic complexity - 8 Input :
   *
   * <p>- sqlcode COBOL Name: SQLCODE - sub COBOL Name: WS-SUB - bhiReqFiltStsCd COBOL Name:
   * BHI-REQ-FILT-STS-CD - dbhsStsCd COBOL Name: DBHS-STS-CD
   *
   * <p>Output :
   *
   * <p>- sqlcode_Ws COBOL Name: WS-SQLCODE - dsmSqlcode COBOL Name: DSM-SQLCODE - sqlcode COBOL
   * Name: SQLCODE - retAreaLimit COBOL Name: WS-RET-AREA-LIMIT - endOfCsrSw COBOL Name:
   * WS-END-OF-CSR-SW - dsmReturnCode COBOL Name: DSM-RETURN-CODE - bhiRetReasonCode COBOL Name:
   * BHI-RET-REASON-CODE - bhiDb2RetCode COBOL Name: BHI-DB2-RET-CODE - bhiDb2Table COBOL Name:
   * BHI-DB2-TABLE - bhiDb2ParaNm COBOL Name: BHI-DB2-PARA-NM - bhiDb2Action COBOL Name:
   * BHI-DB2-ACTION
   *
   * @throws CFException
   */
  @Override
  public FetchCsrSlotTblDataOutCtx fetchCsrSlotTblData(FetchCsrSlotTblDataInCtx methodIn)
      throws Exception {

    // *81***************************************************************
    // *81 4200-Fetch-csr-slot-tbl-data                                 *
    // *81                                                              *
    // *81 business function: fetch data from slot table                *
    // *81                                                              *
    // *81***************************************************************
    // *82***************************************************************
    // *82 4200-fetch-csr-slot-tbl-data                                 *
    // *82                                                              *
    // *82 1. fetch the data using the csr - cursor-slot-table from the *
    // *82    ben_hipaa_srvc table for browse screen process.           *
    // *82***************************************************************
    // Added variable to get the program context in place.
    D5427bhiCtx programCtx = methodIn.getD5427bhiCtx();
    // Added variable to get the output context in place.
    FetchCsrSlotTblDataOutCtx methodOut = methodIn.getFetchCsrSlotTblDataOutCtx();
    //  cobolCode::FETCH CURSOR-SLOT-TABLE INTO ? , ? , ? , ? , ? , ? , ? , ? , ? , ? , ? , ? , ? ,
    // ? , ? , ? , ? , ? , ?
    d5427bhiRepository.fetchCursorSlotTableD5427bhi(
        programCtx.getCursorSlotTableResultSet(),
        programCtx.getSqlca(),
        methodOut.getDclbenHipaaSrvc());
    //  cobolCode::MOVE SQLCODE TO WS-SQLCODE DSM-SQLCODE
    methodOut.setSqlcode_Ws(methodOut.getSqlcode());
    methodOut.setDsmSqlcode(methodOut.getSqlcode());
    //  cobolCode::EVALUATE TRUE
    if (methodOut.isSqlcodeOk()) {
      //  cobolCode::IF WS-SUB = 16
      if ((methodIn.getSub() == 16)) {
        //  cobolCode::SET RET-AREA-FULL TO TRUE
        methodOut.setRetAreaFullTrue();

      }
      //  cobolCode::ELSE
      else {
        //  cobolCode::IF BHI-REQ-FILT-STS-CD = SPACES
        if ((allSpaces(methodIn.getBhiReqFiltStsCd()))) {
          //  cobolCode::PERFORM 4300-POPULATE-RETURN-FIELDS
          populateReturnFields(
              programCtx.getPopulateReturnFieldsInCtx()); /*4300-POPULATE-RETURN-FIELDS SECTION*/
          if (programCtx.isProgramEnded()) {
            return methodOut;
          }
        }
        //  cobolCode::ELSE
        else {
          //  cobolCode::IF BHI-REQ-FILT-STS-CD = DBHS-STS-CD
          if (compareChars(methodIn.getBhiReqFiltStsCd(), methodIn.getDbhsStsCd()) == 0) {
            //  cobolCode::PERFORM 4300-POPULATE-RETURN-FIELDS
            populateReturnFields(
                programCtx.getPopulateReturnFieldsInCtx()); /*4300-POPULATE-RETURN-FIELDS SECTION*/
            if (programCtx.isProgramEnded()) {
              return methodOut;
            }
          }
        }
      }
    } else if (methodOut.isSqlcodeNotFound()) {
      //  cobolCode::SET END-OF-CSR TO TRUE
      methodOut.setEndOfCsrTrue();

    } else {
      //  cobolCode::SET DSM-DB2-ERROR TO TRUE
      methodOut.setDsmDb2ErrorTrue();

      //  cobolCode::SET BHI-DB2-FETCH-ERROR TO TRUE
      methodOut.setBhiDb2FetchErrorTrue();

      //  FORMAT261490060 = "-ZZZZZZ999"
      methodOut.setBhiDb2RetCode(
          CFUtil.cobolNumberFormatter(
              CONSTANTS.FORMAT261490060, String.valueOf(methodOut.getSqlcode()).toCharArray()));
      //  cobolCode::MOVE 'BEN_HIPAA_SRVC' TO BHI-DB2-TABLE
      methodOut.setBhiDb2Table(CONSTANTS.LITERAL_BEN_HIPAA_SRVC_B16_);
      //  cobolCode::MOVE '4200-FETCH-CSR-SLOT-TBL-DATA' TO BHI-DB2-PARA-NM
      methodOut.setBhiDb2ParaNm(CONSTANTS.LITERAL_4200_MN5_FETCHCSRSLOTTBLDATA_B2_);
      //  cobolCode::MOVE 'FETCH' TO BHI-DB2-ACTION
      methodOut.setBhiDb2Action(CONSTANTS.LITERAL_FETCH_B3_);
      //  cobolCode::PERFORM 7777-MOVES-FOR-ERROR-LOG
      movesForErrorLog(programCtx.getMovesForErrorLogInCtx()); /*7777-MOVES-FOR-ERROR-LOG SECTION*/
      if (programCtx.isProgramEnded()) {
        return methodOut;
      }
    }

    return methodOut;
  }
  /**
   * fetchCsrSlotTblData4200A This method is derived from COBOL Paragraph -
   * 4200A-FETCH-CSR-SLOT-TBL-DATA SECTION COBOL Cyclomatic complexity - 7 Input :
   *
   * <p>- sqlcode COBOL Name: SQLCODE - bhiReqFiltStsCd COBOL Name: BHI-REQ-FILT-STS-CD - dbhsStsCd
   * COBOL Name: DBHS-STS-CD - sub COBOL Name: WS-SUB
   *
   * <p>Output :
   *
   * <p>- sqlcode_Ws COBOL Name: WS-SQLCODE - dsmSqlcode COBOL Name: DSM-SQLCODE - sqlcode COBOL
   * Name: SQLCODE - endOfCsrSw COBOL Name: WS-END-OF-CSR-SW - rowCount COBOL Name: WS-ROW-COUNT -
   * sub COBOL Name: WS-SUB - dsmReturnCode COBOL Name: DSM-RETURN-CODE - bhiRetReasonCode COBOL
   * Name: BHI-RET-REASON-CODE - bhiDb2RetCode COBOL Name: BHI-DB2-RET-CODE - bhiDb2Table COBOL
   * Name: BHI-DB2-TABLE - bhiDb2ParaNm COBOL Name: BHI-DB2-PARA-NM - bhiDb2Action COBOL Name:
   * BHI-DB2-ACTION
   *
   * @throws CFException
   */
  @Override
  public FetchCsrSlotTblData4200AOutCtx fetchCsrSlotTblData4200A(
      FetchCsrSlotTblData4200AInCtx methodIn) throws Exception {

    // *81***************************************************************
    // *81 4200A-fetch-csr-slot-tbl-data                                *
    // *81                                                              *
    // *81 business function: fetch data from slot table                *
    // *81                                                              *
    // *81***************************************************************
    // *82***************************************************************
    // *82 4200a-fetch-csr-slot-tbl-data                                *
    // *82                                                              *
    // *82 1. fetch the data using the csr - cursor-slot-table from the *
    // *82    ben_hipaa_srvc table for browse screen process.           *
    // *82***************************************************************
    // Added variable to get the program context in place.
    D5427bhiCtx programCtx = methodIn.getD5427bhiCtx();
    // Added variable to get the output context in place.
    FetchCsrSlotTblData4200AOutCtx methodOut = methodIn.getFetchCsrSlotTblData4200AOutCtx();
    //  cobolCode::FETCH CURSOR-SLOT-TABLE INTO ? , ? , ? , ? , ? , ? , ? , ? , ? , ? , ? , ? , ? ,
    // ? , ? , ? , ? , ? , ?
    d5427bhiRepository.fetchCursorSlotTable1D5427bhi(
        programCtx.getCursorSlotTableResultSet(),
        programCtx.getSqlca(),
        methodOut.getDclbenHipaaSrvc());
    //  cobolCode::MOVE SQLCODE TO WS-SQLCODE DSM-SQLCODE
    methodOut.setSqlcode_Ws(methodOut.getSqlcode());
    methodOut.setDsmSqlcode(methodOut.getSqlcode());
    //  cobolCode::EVALUATE TRUE
    if (methodOut.isSqlcodeOk()) {
      //  cobolCode::IF BHI-REQ-FILT-STS-CD > SPACES
      if ((isGreaterThanSpaces(methodIn.getBhiReqFiltStsCd()))) {
        //  cobolCode::IF BHI-REQ-FILT-STS-CD = DBHS-STS-CD
        if (compareChars(methodIn.getBhiReqFiltStsCd(), methodIn.getDbhsStsCd()) == 0) {
          //  cobolCode::PERFORM 4700-MOVE-DATA-INTO-TABLE
          moveDataIntoTable(
              programCtx.getMoveDataIntoTableInCtx()); /*4700-MOVE-DATA-INTO-TABLE SECTION*/
          if (programCtx.isProgramEnded()) {
            return methodOut;
          }
        }
      }
      //  cobolCode::ELSE
      else {
        //  cobolCode::PERFORM 4700-MOVE-DATA-INTO-TABLE
        moveDataIntoTable(
            programCtx.getMoveDataIntoTableInCtx()); /*4700-MOVE-DATA-INTO-TABLE SECTION*/
        if (programCtx.isProgramEnded()) {
          return methodOut;
        }
      }
    } else if (methodOut.isSqlcodeNotFound()) {
      //  cobolCode::SET END-OF-CSR TO TRUE
      methodOut.setEndOfCsrTrue();

      methodOut.setRowCount(methodOut.getSub());
    } else {
      //  cobolCode::SET DSM-DB2-ERROR TO TRUE
      methodOut.setDsmDb2ErrorTrue();

      //  cobolCode::SET BHI-DB2-FETCH-ERROR TO TRUE
      methodOut.setBhiDb2FetchErrorTrue();

      //  FORMAT261490060 = "-ZZZZZZ999"
      methodOut.setBhiDb2RetCode(
          CFUtil.cobolNumberFormatter(
              CONSTANTS.FORMAT261490060, String.valueOf(methodOut.getSqlcode()).toCharArray()));
      //  cobolCode::MOVE 'BEN_HIPAA_SRVC' TO BHI-DB2-TABLE
      methodOut.setBhiDb2Table(CONSTANTS.LITERAL_BEN_HIPAA_SRVC_B16_);
      //  cobolCode::MOVE '4200A-FETCH-CSR-SLOT-TBL-DATA' TO BHI-DB2-PARA-NM
      methodOut.setBhiDb2ParaNm(CONSTANTS.LITERAL_4200A_MN5_FETCHCSRSLOTTBLDATA_B_);
      //  cobolCode::MOVE 'FETCH' TO BHI-DB2-ACTION
      methodOut.setBhiDb2Action(CONSTANTS.LITERAL_FETCH_B3_);
      //  cobolCode::PERFORM 7777-MOVES-FOR-ERROR-LOG
      movesForErrorLog(programCtx.getMovesForErrorLogInCtx()); /*7777-MOVES-FOR-ERROR-LOG SECTION*/
      if (programCtx.isProgramEnded()) {
        return methodOut;
      }
    }

    return methodOut;
  }
  /**
   * populateReturnFields This method is derived from COBOL Paragraph - 4300-POPULATE-RETURN-FIELDS
   * SECTION COBOL Cyclomatic complexity - 1 Input :
   *
   * <p>- dbhsSlotTblId COBOL Name: DBHS-SLOT-TBL-ID - dbhsSrvcCd COBOL Name: DBHS-SRVC-CD -
   * dbhsEffDt COBOL Name: DBHS-EFF-DT - dbhsPlOfSrvcCd COBOL Name: DBHS-PL-OF-SRVC-CD - dbhsCausCd
   * COBOL Name: DBHS-CAUS-CD - dbhsBenLvlCd COBOL Name: DBHS-BEN-LVL-CD - dbhsNtwkTypCd COBOL Name:
   * DBHS-NTWK-TYP-CD - dbhsProcCdRngBegnVal COBOL Name: DBHS-PROC-CD-RNG-BEGN-VAL -
   * dbhsProcCdRngEndVal COBOL Name: DBHS-PROC-CD-RNG-END-VAL - dbhsProcCdRngTypVal COBOL Name:
   * DBHS-PROC-CD-RNG-TYP-VAL - dbhsHipaaVerNbr COBOL Name: DBHS-HIPAA-VER-NBR - dbhsHipaaCd COBOL
   * Name: DBHS-HIPAA-CD - dbhsInNtwkClssCd COBOL Name: DBHS-IN-NTWK-CLSS-CD - dbhsTier1NtwkClssCd
   * COBOL Name: DBHS-TIER1-NTWK-CLSS-CD - dbhsCancDt COBOL Name: DBHS-CANC-DT - dbhsLstUpdtDttm
   * COBOL Name: DBHS-LST-UPDT-DTTM - dbhsLstUpdtUserId COBOL Name: DBHS-LST-UPDT-USER-ID -
   * dbhsStsCd COBOL Name: DBHS-STS-CD - dbhsProvOrgTypCd COBOL Name: DBHS-PROV-ORG-TYP-CD - sub
   * COBOL Name: WS-SUB
   *
   * <p>Output :
   *
   * <p>- bhiRowSlotTblId COBOL Name: BHI-ROW-SLOT-TBL-ID - dbhsSlotTblId COBOL Name:
   * DBHS-SLOT-TBL-ID - bhiRowSrvcCd COBOL Name: BHI-ROW-SRVC-CD - dbhsSrvcCd COBOL Name:
   * DBHS-SRVC-CD - bhiRowEffDate COBOL Name: BHI-ROW-EFF-DATE - dbhsEffDt COBOL Name: DBHS-EFF-DT -
   * bhiRowPlofsrvcCd COBOL Name: BHI-ROW-PLOFSRVC-CD - dbhsPlOfSrvcCd COBOL Name:
   * DBHS-PL-OF-SRVC-CD - bhiRowCausCd COBOL Name: BHI-ROW-CAUS-CD - dbhsCausCd COBOL Name:
   * DBHS-CAUS-CD - bhiRowBenLvlCd COBOL Name: BHI-ROW-BEN-LVL-CD - dbhsBenLvlCd COBOL Name:
   * DBHS-BEN-LVL-CD - bhiRowNetId COBOL Name: BHI-ROW-NET-ID - dbhsNtwkTypCd COBOL Name:
   * DBHS-NTWK-TYP-CD - bhiRowProcFrom COBOL Name: BHI-ROW-PROC-FROM - dbhsProcCdRngBegnVal COBOL
   * Name: DBHS-PROC-CD-RNG-BEGN-VAL - bhiRowProcTo COBOL Name: BHI-ROW-PROC-TO -
   * dbhsProcCdRngEndVal COBOL Name: DBHS-PROC-CD-RNG-END-VAL - bhiRowProcType COBOL Name:
   * BHI-ROW-PROC-TYPE - dbhsProcCdRngTypVal COBOL Name: DBHS-PROC-CD-RNG-TYP-VAL -
   * bhiRowHipaaVerNbr COBOL Name: BHI-ROW-HIPAA-VER-NBR - dbhsHipaaVerNbr COBOL Name:
   * DBHS-HIPAA-VER-NBR - bhiRowHipaaCd COBOL Name: BHI-ROW-HIPAA-CD - dbhsHipaaCd COBOL Name:
   * DBHS-HIPAA-CD - bhiRowInn COBOL Name: BHI-ROW-INN - dbhsInNtwkClssCd COBOL Name:
   * DBHS-IN-NTWK-CLSS-CD - bhiRowTier COBOL Name: BHI-ROW-TIER - dbhsTier1NtwkClssCd COBOL Name:
   * DBHS-TIER1-NTWK-CLSS-CD - bhiRowCancDt COBOL Name: BHI-ROW-CANC-DT - dbhsCancDt COBOL Name:
   * DBHS-CANC-DT - bhiRowLstupdDttm COBOL Name: BHI-ROW-LSTUPD-DTTM - dbhsLstUpdtDttm COBOL Name:
   * DBHS-LST-UPDT-DTTM - bhiRowLstupdUsrid COBOL Name: BHI-ROW-LSTUPD-USRID - dbhsLstUpdtUserId
   * COBOL Name: DBHS-LST-UPDT-USER-ID - bhiRowStsCd COBOL Name: BHI-ROW-STS-CD - dbhsStsCd COBOL
   * Name: DBHS-STS-CD - bhiRowProvOrgTypCd COBOL Name: BHI-ROW-PROV-ORG-TYP-CD - dbhsProvOrgTypCd
   * COBOL Name: DBHS-PROV-ORG-TYP-CD - sub COBOL Name: WS-SUB
   *
   * @throws CFException
   */
  @Override
  public PopulateReturnFieldsOutCtx populateReturnFields(PopulateReturnFieldsInCtx methodIn)
      throws Exception {

    // *81***************************************************************
    // *81 4300-Populate-return-fields                                  *
    // *81                                                              *
    // *81 business function: populate the return field values          *
    // *81                                                              *
    // *81***************************************************************
    // *82***************************************************************
    // *82 4300-populate-return-fields                                  *
    // *82                                                              *
    // *82 the return field values are populated from the dclgen variable
    // *82 values                                                       *
    // *82                                                              *
    // *82***************************************************************
    // Added variable to get the program context in place.
    D5427bhiCtx programCtx = methodIn.getD5427bhiCtx();
    // Added variable to get the output context in place.
    PopulateReturnFieldsOutCtx methodOut = methodIn.getPopulateReturnFieldsOutCtx();
    //  cobolCode::MOVE DBHS-SLOT-TBL-ID TO BHI-ROW-SLOT-TBL-ID ( WS-SUB )
    methodOut.setBhiRowSlotTblId(methodOut.getSub() - 1, methodOut.getDbhsSlotTblId());
    //  cobolCode::MOVE DBHS-SRVC-CD TO BHI-ROW-SRVC-CD ( WS-SUB )
    methodOut.setBhiRowSrvcCd(methodOut.getSub() - 1, methodOut.getDbhsSrvcCd());
    //  cobolCode::MOVE DBHS-EFF-DT TO BHI-ROW-EFF-DATE ( WS-SUB )
    methodOut.setBhiRowEffDate(methodOut.getSub() - 1, methodOut.getDbhsEffDt());
    //  cobolCode::MOVE DBHS-PL-OF-SRVC-CD TO BHI-ROW-PLOFSRVC-CD ( WS-SUB )
    methodOut.setBhiRowPlofsrvcCd(methodOut.getSub() - 1, methodOut.getDbhsPlOfSrvcCd());
    //  cobolCode::MOVE DBHS-CAUS-CD TO BHI-ROW-CAUS-CD ( WS-SUB )
    methodOut.setBhiRowCausCd(methodOut.getSub() - 1, methodOut.getDbhsCausCd());
    //  cobolCode::MOVE DBHS-BEN-LVL-CD TO BHI-ROW-BEN-LVL-CD ( WS-SUB )
    methodOut.setBhiRowBenLvlCd(methodOut.getSub() - 1, methodOut.getDbhsBenLvlCd());
    //  cobolCode::MOVE DBHS-NTWK-TYP-CD TO BHI-ROW-NET-ID ( WS-SUB )
    methodOut.setBhiRowNetId(methodOut.getSub() - 1, methodOut.getDbhsNtwkTypCd());
    //  cobolCode::MOVE DBHS-PROC-CD-RNG-BEGN-VAL TO BHI-ROW-PROC-FROM ( WS-SUB )
    methodOut.setBhiRowProcFrom(methodOut.getSub() - 1, methodOut.getDbhsProcCdRngBegnVal());
    //  cobolCode::MOVE DBHS-PROC-CD-RNG-END-VAL TO BHI-ROW-PROC-TO ( WS-SUB )
    methodOut.setBhiRowProcTo(methodOut.getSub() - 1, methodOut.getDbhsProcCdRngEndVal());
    //  cobolCode::MOVE DBHS-PROC-CD-RNG-TYP-VAL TO BHI-ROW-PROC-TYPE ( WS-SUB )
    methodOut.setBhiRowProcType(methodOut.getSub() - 1, methodOut.getDbhsProcCdRngTypVal());
    //  cobolCode::MOVE DBHS-HIPAA-VER-NBR TO BHI-ROW-HIPAA-VER-NBR ( WS-SUB )
    methodOut.setBhiRowHipaaVerNbr(methodOut.getSub() - 1, methodOut.getDbhsHipaaVerNbr());
    //  cobolCode::MOVE DBHS-HIPAA-CD TO BHI-ROW-HIPAA-CD ( WS-SUB )
    methodOut.setBhiRowHipaaCd(methodOut.getSub() - 1, methodOut.getDbhsHipaaCd());
    //  cobolCode::MOVE DBHS-IN-NTWK-CLSS-CD TO BHI-ROW-INN ( WS-SUB )
    methodOut.setBhiRowInn(methodOut.getSub() - 1, methodOut.getDbhsInNtwkClssCd());
    //  cobolCode::MOVE DBHS-TIER1-NTWK-CLSS-CD TO BHI-ROW-TIER ( WS-SUB )
    methodOut.setBhiRowTier(methodOut.getSub() - 1, methodOut.getDbhsTier1NtwkClssCd());
    //  cobolCode::MOVE DBHS-CANC-DT TO BHI-ROW-CANC-DT ( WS-SUB )
    methodOut.setBhiRowCancDt(methodOut.getSub() - 1, methodOut.getDbhsCancDt());
    //  cobolCode::MOVE DBHS-LST-UPDT-DTTM TO BHI-ROW-LSTUPD-DTTM ( WS-SUB )
    methodOut.setBhiRowLstupdDttm(methodOut.getSub() - 1, methodOut.getDbhsLstUpdtDttm());
    //  cobolCode::MOVE DBHS-LST-UPDT-USER-ID TO BHI-ROW-LSTUPD-USRID ( WS-SUB )
    methodOut.setBhiRowLstupdUsrid(methodOut.getSub() - 1, methodOut.getDbhsLstUpdtUserId());
    //  cobolCode::MOVE DBHS-STS-CD TO BHI-ROW-STS-CD ( WS-SUB )
    methodOut.setBhiRowStsCd(methodOut.getSub() - 1, methodOut.getDbhsStsCd());
    //  cobolCode::MOVE DBHS-PROV-ORG-TYP-CD TO BHI-ROW-PROV-ORG-TYP-CD ( WS-SUB )
    methodOut.setBhiRowProvOrgTypCd(methodOut.getSub() - 1, methodOut.getDbhsProvOrgTypCd());
    //  cobolCode::ADD 1 TO WS-SUB
    methodOut.setSub(methodOut.getSub() + 1);

    return methodOut;
  }
  /**
   * closeCsrSlotTbl This method is derived from COBOL Paragraph - 4400-CLOSE-CSR-SLOT-TBL SECTION
   * COBOL Cyclomatic complexity - 4 Input :
   *
   * <p>- sqlcode COBOL Name: SQLCODE
   *
   * <p>Output :
   *
   * <p>- sqlcode_Ws COBOL Name: WS-SQLCODE - dsmSqlcode COBOL Name: DSM-SQLCODE - sqlcode COBOL
   * Name: SQLCODE - dsmReturnCode COBOL Name: DSM-RETURN-CODE - bhiRetReasonCode COBOL Name:
   * BHI-RET-REASON-CODE - bhiDb2RetCode COBOL Name: BHI-DB2-RET-CODE - bhiDb2Table COBOL Name:
   * BHI-DB2-TABLE - bhiDb2ParaNm COBOL Name: BHI-DB2-PARA-NM - bhiDb2Action COBOL Name:
   * BHI-DB2-ACTION
   *
   * @throws CFException
   */
  @Override
  public CloseCsrSlotTblOutCtx closeCsrSlotTbl(CloseCsrSlotTblInCtx methodIn) throws Exception {

    // *81***************************************************************
    // *81 4400-Close-csr-slot-tbl                                      *
    // *81                                                              *
    // *81 business function: close cursor-slot-table                   *
    // *81                                                              *
    // *81***************************************************************
    // *82***************************************************************
    // *82 4400-close-csr-slot-tbl                                      *
    // *82                                                              *
    // *82 close cursor-slot-table                                      *
    // *82***************************************************************
    // Added variable to get the program context in place.
    D5427bhiCtx programCtx = methodIn.getD5427bhiCtx();
    // Added variable to get the output context in place.
    CloseCsrSlotTblOutCtx methodOut = methodIn.getCloseCsrSlotTblOutCtx();
    //  cobolCode::CLOSE CURSOR-SLOT-TABLE
    d5427bhiRepository.closeCursorSlotTableD5427bhi(
        programCtx.getCursorSlotTableResultSet(), programCtx.getSqlca());
    //  cobolCode::MOVE SQLCODE TO WS-SQLCODE DSM-SQLCODE
    methodOut.setSqlcode_Ws(methodOut.getSqlcode());
    methodOut.setDsmSqlcode(methodOut.getSqlcode());
    //  cobolCode::EVALUATE TRUE
    if (methodOut.isSqlcodeOk()) {;
    } else {
      //  cobolCode::SET DSM-DB2-ERROR TO TRUE
      methodOut.setDsmDb2ErrorTrue();

      //  cobolCode::SET BHI-DB2-CLOSE-ERROR TO TRUE
      methodOut.setBhiDb2CloseErrorTrue();

      //  FORMAT261490060 = "-ZZZZZZ999"
      methodOut.setBhiDb2RetCode(
          CFUtil.cobolNumberFormatter(
              CONSTANTS.FORMAT261490060, String.valueOf(methodOut.getSqlcode()).toCharArray()));
      //  cobolCode::MOVE 'BEN_HIPAA_SRVC' TO BHI-DB2-TABLE
      methodOut.setBhiDb2Table(CONSTANTS.LITERAL_BEN_HIPAA_SRVC_B16_);
      //  cobolCode::MOVE '4400-CLOSE-CSR-SLOT-TBL' TO BHI-DB2-PARA-NM
      methodOut.setBhiDb2ParaNm(CONSTANTS.LITERAL_4400_MN4_CLOSECSRSLOTTBL_B7_);
      //  cobolCode::MOVE 'CLOSE' TO BHI-DB2-ACTION
      methodOut.setBhiDb2Action(CONSTANTS.LITERAL_CLOSE_B3_);
      //  cobolCode::PERFORM 7777-MOVES-FOR-ERROR-LOG
      movesForErrorLog(programCtx.getMovesForErrorLogInCtx()); /*7777-MOVES-FOR-ERROR-LOG SECTION*/
      if (programCtx.isProgramEnded()) {
        return methodOut;
      }
    }

    return methodOut;
  }
  /**
   * openCsrAll This method is derived from COBOL Paragraph - 4500-OPEN-CSR-ALL SECTION COBOL
   * Cyclomatic complexity - 4 Input :
   *
   * <p>- sqlcode COBOL Name: SQLCODE
   *
   * <p>Output :
   *
   * <p>- sqlcode_Ws COBOL Name: WS-SQLCODE - dsmSqlcode COBOL Name: DSM-SQLCODE - sqlcode COBOL
   * Name: SQLCODE - dsmReturnCode COBOL Name: DSM-RETURN-CODE - bhiRetReasonCode COBOL Name:
   * BHI-RET-REASON-CODE - bhiDb2RetCode COBOL Name: BHI-DB2-RET-CODE - bhiDb2Table COBOL Name:
   * BHI-DB2-TABLE - bhiDb2ParaNm COBOL Name: BHI-DB2-PARA-NM - bhiDb2Action COBOL Name:
   * BHI-DB2-ACTION
   *
   * @throws CFException
   */
  @Override
  public OpenCsrAllOutCtx openCsrAll(OpenCsrAllInCtx methodIn) throws Exception {

    // *82                                                              *
    // *82 Open cursor-all                                              *
    // *82***************************************************************
    // Added variable to get the program context in place.
    D5427bhiCtx programCtx = methodIn.getD5427bhiCtx();
    // Added variable to get the output context in place.
    OpenCsrAllOutCtx methodOut = methodIn.getOpenCsrAllOutCtx();
    //  cobolCode::SELECT SLOT_TBL_ID , SRVC_CD , EFF_DT , PL_OF_SRVC_CD , CAUS_CD , BEN_LVL_CD ,
    // NTWK_TYP_CD , PROC_CD_RNG_BEGN_VAL , PROC_CD_RNG_END_VAL , PROC_CD_RNG_TYP_VAL ,
    // HIPAA_VER_NBR , HIPAA_CD , IN_NTWK_CLSS_CD , TIER1_NTWK_CLSS_CD , CANC_DT , LST_UPDT_DTTM ,
    // LST_UPDT_USER_ID , STS_CD , PROV_ORG_TYP_CD FROM BEN_HIPAA_SRVC ORDER BY HIPAA_VER_NBR ASC ,
    // SLOT_TBL_ID ASC , HIPAA_CD ASC , SRVC_CD ASC , NTWK_TYP_CD ASC , PROV_ORG_TYP_CD ASC , STS_CD
    // ASC , EFF_DT DESC , LST_UPDT_DTTM DESC
    programCtx.setCursorAllResultSet(
        d5427bhiRepository.openCursorAllD5427bhi(programCtx.getSqlca()));
    //  cobolCode::MOVE SQLCODE TO WS-SQLCODE DSM-SQLCODE
    methodOut.setSqlcode_Ws(methodOut.getSqlcode());
    methodOut.setDsmSqlcode(methodOut.getSqlcode());
    //  cobolCode::EVALUATE TRUE
    if (methodOut.isSqlcodeOk()) {;
    } else {
      //  cobolCode::SET DSM-DB2-ERROR TO TRUE
      methodOut.setDsmDb2ErrorTrue();

      //  cobolCode::SET BHI-DB2-OPEN-ERROR TO TRUE
      methodOut.setBhiDb2OpenErrorTrue();

      //  FORMAT261490060 = "-ZZZZZZ999"
      methodOut.setBhiDb2RetCode(
          CFUtil.cobolNumberFormatter(
              CONSTANTS.FORMAT261490060, String.valueOf(methodOut.getSqlcode()).toCharArray()));
      //  cobolCode::MOVE 'BEN_HIPAA_SRVC' TO BHI-DB2-TABLE
      methodOut.setBhiDb2Table(CONSTANTS.LITERAL_BEN_HIPAA_SRVC_B16_);
      //  cobolCode::MOVE '4500-OPEN-CSR-ALL' TO BHI-DB2-PARA-NM
      methodOut.setBhiDb2ParaNm(CONSTANTS.LITERAL_4500_MN3_OPENCSRALL_B13_);
      //  cobolCode::MOVE 'OPEN' TO BHI-DB2-ACTION
      methodOut.setBhiDb2Action(CONSTANTS.LITERAL_OPEN_B4_);
      //  cobolCode::PERFORM 7777-MOVES-FOR-ERROR-LOG
      movesForErrorLog(programCtx.getMovesForErrorLogInCtx()); /*7777-MOVES-FOR-ERROR-LOG SECTION*/
      if (programCtx.isProgramEnded()) {
        return methodOut;
      }
    }

    return methodOut;
  }
  /**
   * fetchCursorAllData This method is derived from COBOL Paragraph - 4600-FETCH-CURSOR-ALL-DATA
   * SECTION COBOL Cyclomatic complexity - 8 Input :
   *
   * <p>- sqlcode COBOL Name: SQLCODE - sub COBOL Name: WS-SUB - bhiReqFiltStsCd COBOL Name:
   * BHI-REQ-FILT-STS-CD - dbhsStsCd COBOL Name: DBHS-STS-CD
   *
   * <p>Output :
   *
   * <p>- sqlcode_Ws COBOL Name: WS-SQLCODE - dsmSqlcode COBOL Name: DSM-SQLCODE - sqlcode COBOL
   * Name: SQLCODE - retAreaLimit COBOL Name: WS-RET-AREA-LIMIT - endOfCsrSw COBOL Name:
   * WS-END-OF-CSR-SW - bhiRetReasonCode COBOL Name: BHI-RET-REASON-CODE - dsmReturnCode COBOL Name:
   * DSM-RETURN-CODE - bhiDb2RetCode COBOL Name: BHI-DB2-RET-CODE - bhiDb2Table COBOL Name:
   * BHI-DB2-TABLE - bhiDb2ParaNm COBOL Name: BHI-DB2-PARA-NM - bhiDb2Action COBOL Name:
   * BHI-DB2-ACTION
   *
   * @throws CFException
   */
  @Override
  public FetchCursorAllDataOutCtx fetchCursorAllData(FetchCursorAllDataInCtx methodIn)
      throws Exception {

    // *81***************************************************************
    // *81 4600-Fetch-cursor-all-data                                   *
    // *81                                                              *
    // *81 business function: fetch all fields data from table          *
    // *81                                                              *
    // *81***************************************************************
    // *82***************************************************************
    // *82 4600-fetch-cursor-all-data                                   *
    // *82                                                              *
    // *82 fetch the data from the table using the cursor-all cursor    *
    // *82 and process based on the sqlcode                             *
    // *82***************************************************************
    // Added variable to get the program context in place.
    D5427bhiCtx programCtx = methodIn.getD5427bhiCtx();
    // Added variable to get the output context in place.
    FetchCursorAllDataOutCtx methodOut = methodIn.getFetchCursorAllDataOutCtx();
    //  cobolCode::FETCH CURSOR-ALL INTO ? , ? , ? , ? , ? , ? , ? , ? , ? , ? , ? , ? , ? , ? , ? ,
    // ? , ? , ? , ?
    d5427bhiRepository.fetchCursorAllD5427bhi(
        programCtx.getCursorAllResultSet(), programCtx.getSqlca(), methodOut.getDclbenHipaaSrvc());
    //  cobolCode::MOVE SQLCODE TO WS-SQLCODE DSM-SQLCODE
    methodOut.setSqlcode_Ws(methodOut.getSqlcode());
    methodOut.setDsmSqlcode(methodOut.getSqlcode());
    //  cobolCode::EVALUATE TRUE
    if (methodOut.isSqlcodeOk()) {
      //  cobolCode::IF WS-SUB = 16
      if ((methodIn.getSub() == 16)) {
        //  cobolCode::SET RET-AREA-FULL TO TRUE
        methodOut.setRetAreaFullTrue();

      }
      //  cobolCode::ELSE
      else {
        //  cobolCode::IF BHI-REQ-FILT-STS-CD = SPACES
        if ((allSpaces(methodIn.getBhiReqFiltStsCd()))) {
          //  cobolCode::PERFORM 4300-POPULATE-RETURN-FIELDS
          populateReturnFields(
              programCtx.getPopulateReturnFieldsInCtx()); /*4300-POPULATE-RETURN-FIELDS SECTION*/
          if (programCtx.isProgramEnded()) {
            return methodOut;
          }
        }
        //  cobolCode::ELSE
        else {
          //  cobolCode::IF BHI-REQ-FILT-STS-CD = DBHS-STS-CD
          if (compareChars(methodIn.getBhiReqFiltStsCd(), methodIn.getDbhsStsCd()) == 0) {
            //  cobolCode::PERFORM 4300-POPULATE-RETURN-FIELDS
            populateReturnFields(
                programCtx.getPopulateReturnFieldsInCtx()); /*4300-POPULATE-RETURN-FIELDS SECTION*/
            if (programCtx.isProgramEnded()) {
              return methodOut;
            }
          }
        }
      }
    } else if (methodOut.isSqlcodeNotFound()) {
      //  cobolCode::SET END-OF-CSR TO TRUE
      methodOut.setEndOfCsrTrue();

    } else {
      //  cobolCode::SET BHI-DB2-FETCH-ERROR TO TRUE
      methodOut.setBhiDb2FetchErrorTrue();

      //  cobolCode::SET DSM-DB2-ERROR TO TRUE
      methodOut.setDsmDb2ErrorTrue();

      //  FORMAT261490060 = "-ZZZZZZ999"
      methodOut.setBhiDb2RetCode(
          CFUtil.cobolNumberFormatter(
              CONSTANTS.FORMAT261490060, String.valueOf(methodOut.getSqlcode()).toCharArray()));
      //  cobolCode::MOVE 'BEN_HIPAA_SRVC' TO BHI-DB2-TABLE
      methodOut.setBhiDb2Table(CONSTANTS.LITERAL_BEN_HIPAA_SRVC_B16_);
      //  cobolCode::MOVE '4600-FETCH-CURSOR-ALL-DATA' TO BHI-DB2-PARA-NM
      methodOut.setBhiDb2ParaNm(CONSTANTS.LITERAL_4600_MN4_FETCHCURSORALLDATA_B4_);
      //  cobolCode::MOVE 'FETCH' TO BHI-DB2-ACTION
      methodOut.setBhiDb2Action(CONSTANTS.LITERAL_FETCH_B3_);
      //  cobolCode::PERFORM 7777-MOVES-FOR-ERROR-LOG
      movesForErrorLog(programCtx.getMovesForErrorLogInCtx()); /*7777-MOVES-FOR-ERROR-LOG SECTION*/
      if (programCtx.isProgramEnded()) {
        return methodOut;
      }
    }

    return methodOut;
  }
  /**
   * fetchCursorAllData4600A This method is derived from COBOL Paragraph -
   * 4600A-FETCH-CURSOR-ALL-DATA SECTION COBOL Cyclomatic complexity - 29 Input :
   *
   * <p>- sqlcode COBOL Name: SQLCODE - bhiReqFiltStsCd COBOL Name: BHI-REQ-FILT-STS-CD - dbhsStsCd
   * COBOL Name: DBHS-STS-CD - bhiBrowseTypeSw COBOL Name: BHI-BROWSE-TYPE-SW - bhiReqSlotTblId
   * COBOL Name: BHI-REQ-SLOT-TBL-ID - bhiSlotTblId COBOL Name: WS-BHI-SLOT-TBL-ID - bhiReqHipaaCd
   * COBOL Name: BHI-REQ-HIPAA-CD - bhiHipaaCd COBOL Name: WS-BHI-HIPAA-CD - bhiReqHipaaVerNbr COBOL
   * Name: BHI-REQ-HIPAA-VER-NBR - bhiHipaaVerNbr COBOL Name: WS-BHI-HIPAA-VER-NBR - bhiReqNetId
   * COBOL Name: BHI-REQ-NET-ID - bhiNetId COBOL Name: WS-BHI-NET-ID - bhiReqEffDate COBOL Name:
   * BHI-REQ-EFF-DATE - bhiEffDate COBOL Name: WS-BHI-EFF-DATE - bhiReqCancDate COBOL Name:
   * BHI-REQ-CANC-DATE - bhiCancDate COBOL Name: WS-BHI-CANC-DATE - bhiReqLstupdDttm COBOL Name:
   * BHI-REQ-LSTUPD-DTTM - bhiLstupdDttm COBOL Name: WS-BHI-LSTUPD-DTTM - sub COBOL Name: WS-SUB -
   * bhiDataArea COBOL Name: WS-BHI-DATA-AREA
   *
   * <p>Output :
   *
   * <p>- sqlcode_Ws COBOL Name: WS-SQLCODE - dsmSqlcode COBOL Name: DSM-SQLCODE - sqlcode COBOL
   * Name: SQLCODE - endOfCsrSw COBOL Name: WS-END-OF-CSR-SW - rowCount COBOL Name: WS-ROW-COUNT -
   * sub COBOL Name: WS-SUB - bhiDataArea COBOL Name: WS-BHI-DATA-AREA - bhiRetReasonCode COBOL
   * Name: BHI-RET-REASON-CODE - dsmReturnCode COBOL Name: DSM-RETURN-CODE - bhiDb2RetCode COBOL
   * Name: BHI-DB2-RET-CODE - bhiDb2Table COBOL Name: BHI-DB2-TABLE - bhiDb2ParaNm COBOL Name:
   * BHI-DB2-PARA-NM - bhiDb2Action COBOL Name: BHI-DB2-ACTION
   *
   * @throws CFException
   */
  @Override
  public FetchCursorAllData4600AOutCtx fetchCursorAllData4600A(
      FetchCursorAllData4600AInCtx methodIn) throws Exception {

    // *81***************************************************************
    // *81 4600A-fetch-cursor-all-data                                  *
    // *81                                                              *
    // *81 business function: fetch all fields data from table          *
    // *81                                                              *
    // *81***************************************************************
    // *82***************************************************************
    // *82 4600a-fetch-cursor-all-data                                  *
    // *82                                                              *
    // *82 fetch the data from the table using the cursor-all cursor    *
    // *82 and process based on the sqlcode                             *
    // *82***************************************************************
    // Added variable to get the program context in place.
    D5427bhiCtx programCtx = methodIn.getD5427bhiCtx();
    // Added variable to get the output context in place.
    FetchCursorAllData4600AOutCtx methodOut = methodIn.getFetchCursorAllData4600AOutCtx();
    //  cobolCode::FETCH CURSOR-ALL INTO ? , ? , ? , ? , ? , ? , ? , ? , ? , ? , ? , ? , ? , ? , ? ,
    // ? , ? , ? , ?
    d5427bhiRepository.fetchCursorAll1D5427bhi(
        programCtx.getCursorAllResultSet(), programCtx.getSqlca(), methodOut.getDclbenHipaaSrvc());
    //  cobolCode::MOVE SQLCODE TO WS-SQLCODE DSM-SQLCODE
    methodOut.setSqlcode_Ws(methodOut.getSqlcode());
    methodOut.setDsmSqlcode(methodOut.getSqlcode());
    //  cobolCode::EVALUATE TRUE
    if (methodOut.isSqlcodeOk()) {
      //  cobolCode::IF BHI-REQ-FILT-STS-CD > SPACES
      if ((isGreaterThanSpaces(methodIn.getBhiReqFiltStsCd()))) {
        //  cobolCode::IF BHI-REQ-FILT-STS-CD = DBHS-STS-CD
        if (compareChars(methodIn.getBhiReqFiltStsCd(), methodIn.getDbhsStsCd()) == 0) {
          //  cobolCode::PERFORM 4700-MOVE-DATA-INTO-TABLE
          moveDataIntoTable(
              programCtx.getMoveDataIntoTableInCtx()); /*4700-MOVE-DATA-INTO-TABLE SECTION*/
          if (programCtx.isProgramEnded()) {
            return methodOut;
          }
        }
        //  cobolCode::ELSE
        else {
          // cobolCode::GO TO 4600A-EXIT
          return methodOut;
          // cobolCodeEnds::GO TO 4600A-EXIT
        }
      }
      //  cobolCode::ELSE
      else {
        //  cobolCode::PERFORM 4700-MOVE-DATA-INTO-TABLE
        moveDataIntoTable(
            programCtx.getMoveDataIntoTableInCtx()); /*4700-MOVE-DATA-INTO-TABLE SECTION*/
        if (programCtx.isProgramEnded()) {
          return methodOut;
        }
      }
      //  cobolCode::IF BROWSE-BACK
      if (methodIn.isBrowseBack()) {
        //  cobolCode::IF BHI-REQ-SLOT-TBL-ID = WS-BHI-SLOT-TBL-ID ( WS-SUB ) AND BHI-REQ-HIPAA-CD =
        // WS-BHI-HIPAA-CD ( WS-SUB ) AND BHI-REQ-HIPAA-VER-NBR = WS-BHI-HIPAA-VER-NBR ( WS-SUB )
        // AND BHI-REQ-NET-ID = WS-BHI-NET-ID ( WS-SUB ) AND BHI-REQ-EFF-DATE = WS-BHI-EFF-DATE (
        // WS-SUB ) AND BHI-REQ-CANC-DATE = WS-BHI-CANC-DATE ( WS-SUB ) AND BHI-REQ-LSTUPD-DTTM =
        // WS-BHI-LSTUPD-DTTM ( WS-SUB )
        if (compareChars(
                    methodIn.getBhiReqSlotTblId(), methodIn.getBhiSlotTblId(methodOut.getSub() - 1))
                == 0
            && compareChars(
                    methodIn.getBhiReqHipaaCd(), methodIn.getBhiHipaaCd(methodOut.getSub() - 1))
                == 0
            && compareChars(
                    methodIn.getBhiReqHipaaVerNbr(),
                    methodIn.getBhiHipaaVerNbr(methodOut.getSub() - 1))
                == 0
            && compareChars(methodIn.getBhiReqNetId(), methodIn.getBhiNetId(methodOut.getSub() - 1))
                == 0
            && compareChars(
                    methodIn.getBhiReqEffDate(), methodIn.getBhiEffDate(methodOut.getSub() - 1))
                == 0
            && compareChars(
                    methodIn.getBhiReqCancDate(), methodIn.getBhiCancDate(methodOut.getSub() - 1))
                == 0
            && compareChars(
                    methodIn.getBhiReqLstupdDttm(),
                    methodIn.getBhiLstupdDttm(methodOut.getSub() - 1))
                == 0) {
          //  cobolCode::IF WS-SUB >= 15
          if ((methodOut.getSub() >= 15)) {
            //  cobolCode::SET END-OF-CSR TO TRUE
            methodOut.setEndOfCsrTrue();

            methodOut.setRowCount(methodOut.getSub());
          }
          //  cobolCode::ELSE
          else {
            methodOut.setRowCount(methodOut.getSub());
          }
        }
        //  cobolCode::ELSE
        else {
          //  cobolCode::IF WS-SUB = 15
          if ((methodOut.getSub() == 15)) {
            //  cobolCode::IF WS-ROW-COUNT > 0
            if ((methodOut.getRowCount() > 0)) {

              // * We already matched. were just building 15 rows
              //  cobolCode::SET END-OF-CSR TO TRUE
              methodOut.setEndOfCsrTrue();

              methodOut.setRowCount(methodOut.getSub());
              // cobolCode::GO TO 4600A-EXIT
              return methodOut;
              // cobolCodeEnds::GO TO 4600A-EXIT
            }

            // * No match yet. move n to n-1. freeup 15th. retain latest 14.
            //  cobolCode::PERFORM VARYING WS-SUB FROM 1 BY +1 UNTIL WS-SUB > 14
            for (methodOut.setSub(1);
                ((methodOut.getSub() <= 14));
                methodOut.setSub(methodOut.getSub() + 1)) {
              //  cobolCode::MOVE WS-BHI-DATA-AREA ( WS-SUB + 1) TO WS-BHI-DATA-AREA ( WS-SUB )
              methodOut.setBhiDataArea(
                  methodOut.getSub() - 1,
                  methodOut.getBhiDataArea(methodOut.getSub() + 1 - 1).toCharArray());
            }
            //  cobolCode::MOVE 14 TO WS-SUB
            methodOut.setSub(14);
          }
        }
      }
      //  cobolCode::IF BROWSE-FORWARD
      if (methodIn.isBrowseForward()) {
        //  cobolCode::IF BHI-REQ-SLOT-TBL-ID = WS-BHI-SLOT-TBL-ID (1) AND BHI-REQ-HIPAA-CD =
        // WS-BHI-HIPAA-CD (1) AND BHI-REQ-HIPAA-VER-NBR = WS-BHI-HIPAA-VER-NBR (1) AND
        // BHI-REQ-NET-ID = WS-BHI-NET-ID (1) AND BHI-REQ-EFF-DATE = WS-BHI-EFF-DATE (1) AND
        // BHI-REQ-CANC-DATE = WS-BHI-CANC-DATE (1) AND BHI-REQ-LSTUPD-DTTM = WS-BHI-LSTUPD-DTTM (1)
        if (compareChars(methodIn.getBhiReqSlotTblId(), methodIn.getBhiSlotTblId(0)) == 0
            && compareChars(methodIn.getBhiReqHipaaCd(), methodIn.getBhiHipaaCd(0)) == 0
            && compareChars(methodIn.getBhiReqHipaaVerNbr(), methodIn.getBhiHipaaVerNbr(0)) == 0
            && compareChars(methodIn.getBhiReqNetId(), methodIn.getBhiNetId(0)) == 0
            && compareChars(methodIn.getBhiReqEffDate(), methodIn.getBhiEffDate(0)) == 0
            && compareChars(methodIn.getBhiReqCancDate(), methodIn.getBhiCancDate(0)) == 0
            && compareChars(methodIn.getBhiReqLstupdDttm(), methodIn.getBhiLstupdDttm(0)) == 0) {
          //  cobolCode::IF WS-SUB = 15
          if ((methodOut.getSub() == 15)) {
            //  cobolCode::SET END-OF-CSR TO TRUE
            methodOut.setEndOfCsrTrue();

            methodOut.setRowCount(methodOut.getSub());
          }
        }
        //  cobolCode::ELSE
        else {
          //  cobolCode::MOVE 0 TO WS-SUB
          methodOut.setSub(0);
        }
      }
    } else if (methodOut.isSqlcodeNotFound()) {
      //  cobolCode::SET END-OF-CSR TO TRUE
      methodOut.setEndOfCsrTrue();

      methodOut.setRowCount(methodOut.getSub());
    } else {
      //  cobolCode::SET BHI-DB2-FETCH-ERROR TO TRUE
      methodOut.setBhiDb2FetchErrorTrue();

      //  cobolCode::SET DSM-DB2-ERROR TO TRUE
      methodOut.setDsmDb2ErrorTrue();

      //  FORMAT261490060 = "-ZZZZZZ999"
      methodOut.setBhiDb2RetCode(
          CFUtil.cobolNumberFormatter(
              CONSTANTS.FORMAT261490060, String.valueOf(methodOut.getSqlcode()).toCharArray()));
      //  cobolCode::MOVE 'BEN_HIPAA_SRVC' TO BHI-DB2-TABLE
      methodOut.setBhiDb2Table(CONSTANTS.LITERAL_BEN_HIPAA_SRVC_B16_);
      //  cobolCode::MOVE '4600A-FETCH-CURSOR-ALL-DATA' TO BHI-DB2-PARA-NM
      methodOut.setBhiDb2ParaNm(CONSTANTS.LITERAL_4600A_MN4_FETCHCURSORALLDATA_B3_);
      //  cobolCode::MOVE 'FETCH' TO BHI-DB2-ACTION
      methodOut.setBhiDb2Action(CONSTANTS.LITERAL_FETCH_B3_);
      //  cobolCode::PERFORM 7777-MOVES-FOR-ERROR-LOG
      movesForErrorLog(programCtx.getMovesForErrorLogInCtx()); /*7777-MOVES-FOR-ERROR-LOG SECTION*/
      if (programCtx.isProgramEnded()) {
        return methodOut;
      }
    }

    return methodOut;
  }
  /**
   * moveDataIntoTable This method is derived from COBOL Paragraph - 4700-MOVE-DATA-INTO-TABLE
   * SECTION COBOL Cyclomatic complexity - 1 Input :
   *
   * <p>- sub COBOL Name: WS-SUB - dbhsSlotTblId COBOL Name: DBHS-SLOT-TBL-ID - dbhsSrvcCd COBOL
   * Name: DBHS-SRVC-CD - dbhsEffDt COBOL Name: DBHS-EFF-DT - dbhsPlOfSrvcCd COBOL Name:
   * DBHS-PL-OF-SRVC-CD - dbhsCausCd COBOL Name: DBHS-CAUS-CD - dbhsBenLvlCd COBOL Name:
   * DBHS-BEN-LVL-CD - dbhsNtwkTypCd COBOL Name: DBHS-NTWK-TYP-CD - dbhsProcCdRngBegnVal COBOL Name:
   * DBHS-PROC-CD-RNG-BEGN-VAL - dbhsProcCdRngEndVal COBOL Name: DBHS-PROC-CD-RNG-END-VAL -
   * dbhsProcCdRngTypVal COBOL Name: DBHS-PROC-CD-RNG-TYP-VAL - dbhsHipaaVerNbr COBOL Name:
   * DBHS-HIPAA-VER-NBR - dbhsHipaaCd COBOL Name: DBHS-HIPAA-CD - dbhsInNtwkClssCd COBOL Name:
   * DBHS-IN-NTWK-CLSS-CD - dbhsTier1NtwkClssCd COBOL Name: DBHS-TIER1-NTWK-CLSS-CD - dbhsCancDt
   * COBOL Name: DBHS-CANC-DT - dbhsLstUpdtDttm COBOL Name: DBHS-LST-UPDT-DTTM - dbhsLstUpdtUserId
   * COBOL Name: DBHS-LST-UPDT-USER-ID - dbhsStsCd COBOL Name: DBHS-STS-CD - dbhsProvOrgTypCd COBOL
   * Name: DBHS-PROV-ORG-TYP-CD
   *
   * <p>Output :
   *
   * <p>- sub COBOL Name: WS-SUB - bhiSlotTblId COBOL Name: WS-BHI-SLOT-TBL-ID - dbhsSlotTblId COBOL
   * Name: DBHS-SLOT-TBL-ID - bhiSrvcCd COBOL Name: WS-BHI-SRVC-CD - dbhsSrvcCd COBOL Name:
   * DBHS-SRVC-CD - bhiEffDate COBOL Name: WS-BHI-EFF-DATE - dbhsEffDt COBOL Name: DBHS-EFF-DT -
   * bhiPlofsrvcCd COBOL Name: WS-BHI-PLOFSRVC-CD - dbhsPlOfSrvcCd COBOL Name: DBHS-PL-OF-SRVC-CD -
   * bhiCausCd COBOL Name: WS-BHI-CAUS-CD - dbhsCausCd COBOL Name: DBHS-CAUS-CD - bhiBenLvlCd COBOL
   * Name: WS-BHI-BEN-LVL-CD - dbhsBenLvlCd COBOL Name: DBHS-BEN-LVL-CD - bhiNetId COBOL Name:
   * WS-BHI-NET-ID - dbhsNtwkTypCd COBOL Name: DBHS-NTWK-TYP-CD - bhiProcFrom COBOL Name:
   * WS-BHI-PROC-FROM - dbhsProcCdRngBegnVal COBOL Name: DBHS-PROC-CD-RNG-BEGN-VAL - bhiProcTo COBOL
   * Name: WS-BHI-PROC-TO - dbhsProcCdRngEndVal COBOL Name: DBHS-PROC-CD-RNG-END-VAL - bhiProcType
   * COBOL Name: WS-BHI-PROC-TYPE - dbhsProcCdRngTypVal COBOL Name: DBHS-PROC-CD-RNG-TYP-VAL -
   * bhiHipaaVerNbr COBOL Name: WS-BHI-HIPAA-VER-NBR - dbhsHipaaVerNbr COBOL Name:
   * DBHS-HIPAA-VER-NBR - bhiHipaaCd COBOL Name: WS-BHI-HIPAA-CD - dbhsHipaaCd COBOL Name:
   * DBHS-HIPAA-CD - bhiInn COBOL Name: WS-BHI-INN - dbhsInNtwkClssCd COBOL Name:
   * DBHS-IN-NTWK-CLSS-CD - bhiTier COBOL Name: WS-BHI-TIER - dbhsTier1NtwkClssCd COBOL Name:
   * DBHS-TIER1-NTWK-CLSS-CD - bhiCancDate COBOL Name: WS-BHI-CANC-DATE - dbhsCancDt COBOL Name:
   * DBHS-CANC-DT - bhiLstupdDttm COBOL Name: WS-BHI-LSTUPD-DTTM - dbhsLstUpdtDttm COBOL Name:
   * DBHS-LST-UPDT-DTTM - bhiLstupdUsrid COBOL Name: WS-BHI-LSTUPD-USRID - dbhsLstUpdtUserId COBOL
   * Name: DBHS-LST-UPDT-USER-ID - bhiStsCd COBOL Name: WS-BHI-STS-CD - dbhsStsCd COBOL Name:
   * DBHS-STS-CD - bhiProvOrgTypCd COBOL Name: WS-BHI-PROV-ORG-TYP-CD - dbhsProvOrgTypCd COBOL Name:
   * DBHS-PROV-ORG-TYP-CD
   *
   * @throws CFException
   */
  @Override
  public MoveDataIntoTableOutCtx moveDataIntoTable(MoveDataIntoTableInCtx methodIn)
      throws Exception {

    // *81***************************************************************
    // *81 4700-Move-data-into-table                                    *
    // *81                                                              *
    // *81 business function: move data into table                      *
    // *81***************************************************************
    // *82***************************************************************
    // *82 4700-move-data-into-table                                    *
    // *82                                                              *
    // *82 move the data fetched from cursor-all cursor into the        *
    // *82 working storage variables                                    *
    // *82***************************************************************
    // Added variable to get the program context in place.
    D5427bhiCtx programCtx = methodIn.getD5427bhiCtx();
    // Added variable to get the output context in place.
    MoveDataIntoTableOutCtx methodOut = methodIn.getMoveDataIntoTableOutCtx();
    //  cobolCode::ADD 1 TO WS-SUB
    methodOut.setSub(methodOut.getSub() + 1);
    //  cobolCode::MOVE DBHS-SLOT-TBL-ID TO WS-BHI-SLOT-TBL-ID ( WS-SUB )
    methodOut.setBhiSlotTblId(methodOut.getSub() - 1, methodOut.getDbhsSlotTblId());
    //  cobolCode::MOVE DBHS-SRVC-CD TO WS-BHI-SRVC-CD ( WS-SUB )
    methodOut.setBhiSrvcCd(methodOut.getSub() - 1, methodOut.getDbhsSrvcCd());
    //  cobolCode::MOVE DBHS-EFF-DT TO WS-BHI-EFF-DATE ( WS-SUB )
    methodOut.setBhiEffDate(methodOut.getSub() - 1, methodOut.getDbhsEffDt());
    //  cobolCode::MOVE DBHS-PL-OF-SRVC-CD TO WS-BHI-PLOFSRVC-CD ( WS-SUB )
    methodOut.setBhiPlofsrvcCd(methodOut.getSub() - 1, methodOut.getDbhsPlOfSrvcCd());
    //  cobolCode::MOVE DBHS-CAUS-CD TO WS-BHI-CAUS-CD ( WS-SUB )
    methodOut.setBhiCausCd(methodOut.getSub() - 1, methodOut.getDbhsCausCd());
    //  cobolCode::MOVE DBHS-BEN-LVL-CD TO WS-BHI-BEN-LVL-CD ( WS-SUB )
    methodOut.setBhiBenLvlCd(methodOut.getSub() - 1, methodOut.getDbhsBenLvlCd());
    //  cobolCode::MOVE DBHS-NTWK-TYP-CD TO WS-BHI-NET-ID ( WS-SUB )
    methodOut.setBhiNetId(methodOut.getSub() - 1, methodOut.getDbhsNtwkTypCd());
    //  cobolCode::MOVE DBHS-PROC-CD-RNG-BEGN-VAL TO WS-BHI-PROC-FROM ( WS-SUB )
    methodOut.setBhiProcFrom(methodOut.getSub() - 1, methodOut.getDbhsProcCdRngBegnVal());
    //  cobolCode::MOVE DBHS-PROC-CD-RNG-END-VAL TO WS-BHI-PROC-TO ( WS-SUB )
    methodOut.setBhiProcTo(methodOut.getSub() - 1, methodOut.getDbhsProcCdRngEndVal());
    //  cobolCode::MOVE DBHS-PROC-CD-RNG-TYP-VAL TO WS-BHI-PROC-TYPE ( WS-SUB )
    methodOut.setBhiProcType(methodOut.getSub() - 1, methodOut.getDbhsProcCdRngTypVal());
    //  cobolCode::MOVE DBHS-HIPAA-VER-NBR TO WS-BHI-HIPAA-VER-NBR ( WS-SUB )
    methodOut.setBhiHipaaVerNbr(methodOut.getSub() - 1, methodOut.getDbhsHipaaVerNbr());
    //  cobolCode::MOVE DBHS-HIPAA-CD TO WS-BHI-HIPAA-CD ( WS-SUB )
    methodOut.setBhiHipaaCd(methodOut.getSub() - 1, methodOut.getDbhsHipaaCd());
    //  cobolCode::MOVE DBHS-IN-NTWK-CLSS-CD TO WS-BHI-INN ( WS-SUB )
    methodOut.setBhiInn(methodOut.getSub() - 1, methodOut.getDbhsInNtwkClssCd());
    //  cobolCode::MOVE DBHS-TIER1-NTWK-CLSS-CD TO WS-BHI-TIER ( WS-SUB )
    methodOut.setBhiTier(methodOut.getSub() - 1, methodOut.getDbhsTier1NtwkClssCd());
    //  cobolCode::MOVE DBHS-CANC-DT TO WS-BHI-CANC-DATE ( WS-SUB )
    methodOut.setBhiCancDate(methodOut.getSub() - 1, methodOut.getDbhsCancDt());
    //  cobolCode::MOVE DBHS-LST-UPDT-DTTM TO WS-BHI-LSTUPD-DTTM ( WS-SUB )
    methodOut.setBhiLstupdDttm(methodOut.getSub() - 1, methodOut.getDbhsLstUpdtDttm());
    //  cobolCode::MOVE DBHS-LST-UPDT-USER-ID TO WS-BHI-LSTUPD-USRID ( WS-SUB )
    methodOut.setBhiLstupdUsrid(methodOut.getSub() - 1, methodOut.getDbhsLstUpdtUserId());
    //  cobolCode::MOVE DBHS-STS-CD TO WS-BHI-STS-CD ( WS-SUB )
    methodOut.setBhiStsCd(methodOut.getSub() - 1, methodOut.getDbhsStsCd());
    //  cobolCode::MOVE DBHS-PROV-ORG-TYP-CD TO WS-BHI-PROV-ORG-TYP-CD ( WS-SUB )
    methodOut.setBhiProvOrgTypCd(methodOut.getSub() - 1, methodOut.getDbhsProvOrgTypCd());

    return methodOut;
  }
  /**
   * determineStartingRow This method is derived from COBOL Paragraph - 4750-DETERMINE-STARTING-ROW
   * SECTION COBOL Cyclomatic complexity - 14 Input :
   *
   * <p>- bhiBrowseTypeSw COBOL Name: BHI-BROWSE-TYPE-SW - rowSub COBOL Name: WS-ROW-SUB - rowCount
   * COBOL Name: WS-ROW-COUNT - bhiReqSlotTblId COBOL Name: BHI-REQ-SLOT-TBL-ID - bhiSlotTblId COBOL
   * Name: WS-BHI-SLOT-TBL-ID - bhiReqHipaaCd COBOL Name: BHI-REQ-HIPAA-CD - bhiHipaaCd COBOL Name:
   * WS-BHI-HIPAA-CD - bhiReqHipaaVerNbr COBOL Name: BHI-REQ-HIPAA-VER-NBR - bhiHipaaVerNbr COBOL
   * Name: WS-BHI-HIPAA-VER-NBR - bhiReqNetId COBOL Name: BHI-REQ-NET-ID - bhiNetId COBOL Name:
   * WS-BHI-NET-ID - bhiReqEffDate COBOL Name: BHI-REQ-EFF-DATE - bhiEffDate COBOL Name:
   * WS-BHI-EFF-DATE - bhiReqCancDate COBOL Name: BHI-REQ-CANC-DATE - bhiCancDate COBOL Name:
   * WS-BHI-CANC-DATE - bhiReqLstupdDttm COBOL Name: BHI-REQ-LSTUPD-DTTM - bhiLstupdDttm COBOL Name:
   * WS-BHI-LSTUPD-DTTM
   *
   * <p>Output :
   *
   * <p>- startingRowNbr COBOL Name: WS-STARTING-ROW-NBR - rowSub COBOL Name: WS-ROW-SUB
   *
   * @throws CFException
   */
  @Override
  public DetermineStartingRowOutCtx determineStartingRow(DetermineStartingRowInCtx methodIn)
      throws Exception {

    // *81***************************************************************
    // *81 4750-Determine-starting-row                                  *
    // *81                                                              *
    // *81 business function:                                           *
    // *81 populate the  return area with row data                      *
    // *81***************************************************************
    // *82***************************************************************
    // *82 4750-determine-starting-row                                  *
    // *82                                                              *
    // *82 this section locates the starting row to send data based on  *
    // *82 request parameters.                                          *
    // *82***************************************************************
    // Added variable to get the program context in place.
    D5427bhiCtx programCtx = methodIn.getD5427bhiCtx();
    // Added variable to get the output context in place.
    DetermineStartingRowOutCtx methodOut = methodIn.getDetermineStartingRowOutCtx();
    //  cobolCode::MOVE 1 TO WS-STARTING-ROW-NBR
    methodOut.setStartingRowNbr(1);
    //  cobolCode::IF INIT-REQ-BHI
    if (methodIn.isInitReqBhi()) {
      //  cobolCode::MOVE 1 TO WS-STARTING-ROW-NBR
      methodOut.setStartingRowNbr(1);
    }
    //  cobolCode::ELSE
    else {
      //  cobolCode::PERFORM VARYING WS-ROW-SUB FROM 1 BY 1 UNTIL WS-ROW-SUB > WS-ROW-COUNT OR
      // WS-STARTING-ROW-NBR > 1
      for (methodOut.setRowSub(1);
          ((methodOut.getRowSub() <= methodIn.getRowCount())
              && (methodOut.getStartingRowNbr() <= 1));
          methodOut.setRowSub(methodOut.getRowSub() + 1)) {
        //  cobolCode::IF BHI-REQ-SLOT-TBL-ID = WS-BHI-SLOT-TBL-ID ( WS-ROW-SUB ) AND
        // BHI-REQ-HIPAA-CD = WS-BHI-HIPAA-CD ( WS-ROW-SUB ) AND BHI-REQ-HIPAA-VER-NBR =
        // WS-BHI-HIPAA-VER-NBR ( WS-ROW-SUB ) AND BHI-REQ-NET-ID = WS-BHI-NET-ID ( WS-ROW-SUB ) AND
        // BHI-REQ-EFF-DATE = WS-BHI-EFF-DATE ( WS-ROW-SUB ) AND BHI-REQ-CANC-DATE =
        // WS-BHI-CANC-DATE ( WS-ROW-SUB ) AND BHI-REQ-LSTUPD-DTTM = WS-BHI-LSTUPD-DTTM ( WS-ROW-SUB
        // )
        if (compareChars(
                    methodIn.getBhiReqSlotTblId(),
                    methodIn.getBhiSlotTblId(methodOut.getRowSub() - 1))
                == 0
            && compareChars(
                    methodIn.getBhiReqHipaaCd(), methodIn.getBhiHipaaCd(methodOut.getRowSub() - 1))
                == 0
            && compareChars(
                    methodIn.getBhiReqHipaaVerNbr(),
                    methodIn.getBhiHipaaVerNbr(methodOut.getRowSub() - 1))
                == 0
            && compareChars(
                    methodIn.getBhiReqNetId(), methodIn.getBhiNetId(methodOut.getRowSub() - 1))
                == 0
            && compareChars(
                    methodIn.getBhiReqEffDate(), methodIn.getBhiEffDate(methodOut.getRowSub() - 1))
                == 0
            && compareChars(
                    methodIn.getBhiReqCancDate(),
                    methodIn.getBhiCancDate(methodOut.getRowSub() - 1))
                == 0
            && compareChars(
                    methodIn.getBhiReqLstupdDttm(),
                    methodIn.getBhiLstupdDttm(methodOut.getRowSub() - 1))
                == 0) {
          methodOut.setStartingRowNbr(methodOut.getRowSub());
        }
      }

      // *       If browse-forward
      // *          add 1          to ws-starting-row-nbr
      // *       end-if
      //  cobolCode::IF BROWSE-BACK
      if (methodIn.isBrowseBack()) {
        //  cobolCode::SUBTRACT 14 FROM WS-STARTING-ROW-NBR
        methodOut.setStartingRowNbr(methodOut.getStartingRowNbr() - 14);
        //  cobolCode::IF WS-STARTING-ROW-NBR < 1
        if ((methodOut.getStartingRowNbr() < 1)) {
          //  cobolCode::MOVE 1 TO WS-STARTING-ROW-NBR
          methodOut.setStartingRowNbr(1);
        }
      }
    }

    return methodOut;
  }
  /**
   * populateReturnFields4800 This method is derived from COBOL Paragraph -
   * 4800-POPULATE-RETURN-FIELDS SECTION COBOL Cyclomatic complexity - 2 Input :
   *
   * <p>- bhiSlotTblId COBOL Name: WS-BHI-SLOT-TBL-ID - bhiSrvcCd COBOL Name: WS-BHI-SRVC-CD -
   * bhiEffDate COBOL Name: WS-BHI-EFF-DATE - bhiPlofsrvcCd COBOL Name: WS-BHI-PLOFSRVC-CD -
   * bhiCausCd COBOL Name: WS-BHI-CAUS-CD - bhiBenLvlCd COBOL Name: WS-BHI-BEN-LVL-CD - bhiNetId
   * COBOL Name: WS-BHI-NET-ID - bhiProcFrom COBOL Name: WS-BHI-PROC-FROM - bhiProcTo COBOL Name:
   * WS-BHI-PROC-TO - bhiProcType COBOL Name: WS-BHI-PROC-TYPE - bhiHipaaVerNbr COBOL Name:
   * WS-BHI-HIPAA-VER-NBR - bhiHipaaCd COBOL Name: WS-BHI-HIPAA-CD - bhiInn COBOL Name: WS-BHI-INN -
   * bhiTier COBOL Name: WS-BHI-TIER - bhiCancDate COBOL Name: WS-BHI-CANC-DATE - bhiLstupdDttm
   * COBOL Name: WS-BHI-LSTUPD-DTTM - bhiLstupdUsrid COBOL Name: WS-BHI-LSTUPD-USRID - bhiStsCd
   * COBOL Name: WS-BHI-STS-CD - bhiProvOrgTypCd COBOL Name: WS-BHI-PROV-ORG-TYP-CD - sub COBOL
   * Name: WS-SUB
   *
   * <p>Output :
   *
   * <p>- bhiRowSlotTblId COBOL Name: BHI-ROW-SLOT-TBL-ID - bhiSlotTblId COBOL Name:
   * WS-BHI-SLOT-TBL-ID - bhiRowSrvcCd COBOL Name: BHI-ROW-SRVC-CD - bhiSrvcCd COBOL Name:
   * WS-BHI-SRVC-CD - bhiRowEffDate COBOL Name: BHI-ROW-EFF-DATE - bhiEffDate COBOL Name:
   * WS-BHI-EFF-DATE - bhiRowPlofsrvcCd COBOL Name: BHI-ROW-PLOFSRVC-CD - bhiPlofsrvcCd COBOL Name:
   * WS-BHI-PLOFSRVC-CD - bhiRowCausCd COBOL Name: BHI-ROW-CAUS-CD - bhiCausCd COBOL Name:
   * WS-BHI-CAUS-CD - bhiRowBenLvlCd COBOL Name: BHI-ROW-BEN-LVL-CD - bhiBenLvlCd COBOL Name:
   * WS-BHI-BEN-LVL-CD - bhiRowNetId COBOL Name: BHI-ROW-NET-ID - bhiNetId COBOL Name: WS-BHI-NET-ID
   * - bhiRowProcFrom COBOL Name: BHI-ROW-PROC-FROM - bhiProcFrom COBOL Name: WS-BHI-PROC-FROM -
   * bhiRowProcTo COBOL Name: BHI-ROW-PROC-TO - bhiProcTo COBOL Name: WS-BHI-PROC-TO -
   * bhiRowProcType COBOL Name: BHI-ROW-PROC-TYPE - bhiProcType COBOL Name: WS-BHI-PROC-TYPE -
   * bhiRowHipaaVerNbr COBOL Name: BHI-ROW-HIPAA-VER-NBR - bhiHipaaVerNbr COBOL Name:
   * WS-BHI-HIPAA-VER-NBR - bhiRowHipaaCd COBOL Name: BHI-ROW-HIPAA-CD - bhiHipaaCd COBOL Name:
   * WS-BHI-HIPAA-CD - bhiRowInn COBOL Name: BHI-ROW-INN - bhiInn COBOL Name: WS-BHI-INN -
   * bhiRowTier COBOL Name: BHI-ROW-TIER - bhiTier COBOL Name: WS-BHI-TIER - bhiRowCancDt COBOL
   * Name: BHI-ROW-CANC-DT - bhiCancDate COBOL Name: WS-BHI-CANC-DATE - bhiRowLstupdDttm COBOL Name:
   * BHI-ROW-LSTUPD-DTTM - bhiLstupdDttm COBOL Name: WS-BHI-LSTUPD-DTTM - bhiRowLstupdUsrid COBOL
   * Name: BHI-ROW-LSTUPD-USRID - bhiLstupdUsrid COBOL Name: WS-BHI-LSTUPD-USRID - bhiRowStsCd COBOL
   * Name: BHI-ROW-STS-CD - bhiStsCd COBOL Name: WS-BHI-STS-CD - bhiRowProvOrgTypCd COBOL Name:
   * BHI-ROW-PROV-ORG-TYP-CD - bhiProvOrgTypCd COBOL Name: WS-BHI-PROV-ORG-TYP-CD - sub COBOL Name:
   * WS-SUB - retAreaLimit COBOL Name: WS-RET-AREA-LIMIT
   *
   * @throws CFException
   */
  @Override
  public PopulateReturnFields4800OutCtx populateReturnFields4800(
      PopulateReturnFields4800InCtx methodIn) throws Exception {

    // *81***************************************************************
    // *81 4800-Populate-return-fields                                  *
    // *81                                                              *
    // *81 business function: populating the return field values        *
    // *81                                                              *
    // *81***************************************************************
    // *82***************************************************************
    // *82 4800-populate-return-fields                                  *
    // *82                                                              *
    // *82 populating the return field values from ws variable          *
    // *82                                                              *
    // *82***************************************************************
    // Added variable to get the program context in place.
    D5427bhiCtx programCtx = methodIn.getD5427bhiCtx();
    // Added variable to get the output context in place.
    PopulateReturnFields4800OutCtx methodOut = methodIn.getPopulateReturnFields4800OutCtx();
    //  cobolCode::MOVE WS-BHI-SLOT-TBL-ID ( WS-ROW-SUB ) TO BHI-ROW-SLOT-TBL-ID ( WS-SUB )
    methodOut.setBhiRowSlotTblId(
        methodOut.getSub() - 1, methodOut.getBhiSlotTblId(methodIn.getRowSub() - 1));
    //  cobolCode::MOVE WS-BHI-SRVC-CD ( WS-ROW-SUB ) TO BHI-ROW-SRVC-CD ( WS-SUB )
    methodOut.setBhiRowSrvcCd(
        methodOut.getSub() - 1, methodOut.getBhiSrvcCd(methodIn.getRowSub() - 1));
    //  cobolCode::MOVE WS-BHI-EFF-DATE ( WS-ROW-SUB ) TO BHI-ROW-EFF-DATE ( WS-SUB )
    methodOut.setBhiRowEffDate(
        methodOut.getSub() - 1, methodOut.getBhiEffDate(methodIn.getRowSub() - 1));
    //  cobolCode::MOVE WS-BHI-PLOFSRVC-CD ( WS-ROW-SUB ) TO BHI-ROW-PLOFSRVC-CD ( WS-SUB )
    methodOut.setBhiRowPlofsrvcCd(
        methodOut.getSub() - 1, methodOut.getBhiPlofsrvcCd(methodIn.getRowSub() - 1));
    //  cobolCode::MOVE WS-BHI-CAUS-CD ( WS-ROW-SUB ) TO BHI-ROW-CAUS-CD ( WS-SUB )
    methodOut.setBhiRowCausCd(
        methodOut.getSub() - 1, methodOut.getBhiCausCd(methodIn.getRowSub() - 1));
    //  cobolCode::MOVE WS-BHI-BEN-LVL-CD ( WS-ROW-SUB ) TO BHI-ROW-BEN-LVL-CD ( WS-SUB )
    methodOut.setBhiRowBenLvlCd(
        methodOut.getSub() - 1, methodOut.getBhiBenLvlCd(methodIn.getRowSub() - 1));
    //  cobolCode::MOVE WS-BHI-NET-ID ( WS-ROW-SUB ) TO BHI-ROW-NET-ID ( WS-SUB )
    methodOut.setBhiRowNetId(
        methodOut.getSub() - 1, methodOut.getBhiNetId(methodIn.getRowSub() - 1));
    //  cobolCode::MOVE WS-BHI-PROC-FROM ( WS-ROW-SUB ) TO BHI-ROW-PROC-FROM ( WS-SUB )
    methodOut.setBhiRowProcFrom(
        methodOut.getSub() - 1, methodOut.getBhiProcFrom(methodIn.getRowSub() - 1));
    //  cobolCode::MOVE WS-BHI-PROC-TO ( WS-ROW-SUB ) TO BHI-ROW-PROC-TO ( WS-SUB )
    methodOut.setBhiRowProcTo(
        methodOut.getSub() - 1, methodOut.getBhiProcTo(methodIn.getRowSub() - 1));
    //  cobolCode::MOVE WS-BHI-PROC-TYPE ( WS-ROW-SUB ) TO BHI-ROW-PROC-TYPE ( WS-SUB )
    methodOut.setBhiRowProcType(
        methodOut.getSub() - 1, methodOut.getBhiProcType(methodIn.getRowSub() - 1));
    //  cobolCode::MOVE WS-BHI-HIPAA-VER-NBR ( WS-ROW-SUB ) TO BHI-ROW-HIPAA-VER-NBR ( WS-SUB )
    methodOut.setBhiRowHipaaVerNbr(
        methodOut.getSub() - 1, methodOut.getBhiHipaaVerNbr(methodIn.getRowSub() - 1));
    //  cobolCode::MOVE WS-BHI-HIPAA-CD ( WS-ROW-SUB ) TO BHI-ROW-HIPAA-CD ( WS-SUB )
    methodOut.setBhiRowHipaaCd(
        methodOut.getSub() - 1, methodOut.getBhiHipaaCd(methodIn.getRowSub() - 1));
    //  cobolCode::MOVE WS-BHI-INN ( WS-ROW-SUB ) TO BHI-ROW-INN ( WS-SUB )
    methodOut.setBhiRowInn(methodOut.getSub() - 1, methodOut.getBhiInn(methodIn.getRowSub() - 1));
    //  cobolCode::MOVE WS-BHI-TIER ( WS-ROW-SUB ) TO BHI-ROW-TIER ( WS-SUB )
    methodOut.setBhiRowTier(methodOut.getSub() - 1, methodOut.getBhiTier(methodIn.getRowSub() - 1));
    //  cobolCode::MOVE WS-BHI-CANC-DATE ( WS-ROW-SUB ) TO BHI-ROW-CANC-DT ( WS-SUB )
    methodOut.setBhiRowCancDt(
        methodOut.getSub() - 1, methodOut.getBhiCancDate(methodIn.getRowSub() - 1));
    //  cobolCode::MOVE WS-BHI-LSTUPD-DTTM ( WS-ROW-SUB ) TO BHI-ROW-LSTUPD-DTTM ( WS-SUB )
    methodOut.setBhiRowLstupdDttm(
        methodOut.getSub() - 1, methodOut.getBhiLstupdDttm(methodIn.getRowSub() - 1));
    //  cobolCode::MOVE WS-BHI-LSTUPD-USRID ( WS-ROW-SUB ) TO BHI-ROW-LSTUPD-USRID ( WS-SUB )
    methodOut.setBhiRowLstupdUsrid(
        methodOut.getSub() - 1, methodOut.getBhiLstupdUsrid(methodIn.getRowSub() - 1));
    //  cobolCode::MOVE WS-BHI-STS-CD ( WS-ROW-SUB ) TO BHI-ROW-STS-CD ( WS-SUB )
    methodOut.setBhiRowStsCd(
        methodOut.getSub() - 1, methodOut.getBhiStsCd(methodIn.getRowSub() - 1));
    //  cobolCode::MOVE WS-BHI-PROV-ORG-TYP-CD ( WS-ROW-SUB ) TO BHI-ROW-PROV-ORG-TYP-CD ( WS-SUB )
    methodOut.setBhiRowProvOrgTypCd(
        methodOut.getSub() - 1, methodOut.getBhiProvOrgTypCd(methodIn.getRowSub() - 1));
    //  cobolCode::ADD 1 TO WS-SUB
    methodOut.setSub(methodOut.getSub() + 1);
    //  cobolCode::IF WS-SUB = 16
    if ((methodOut.getSub() == 16)) {
      //  cobolCode::SET RET-AREA-FULL TO TRUE
      methodOut.setRetAreaFullTrue();
    }

    return methodOut;
  }
  /**
   * closeCsrAll This method is derived from COBOL Paragraph - 4900-CLOSE-CSR-ALL SECTION COBOL
   * Cyclomatic complexity - 4 Input :
   *
   * <p>- sqlcode COBOL Name: SQLCODE
   *
   * <p>Output :
   *
   * <p>- sqlcode_Ws COBOL Name: WS-SQLCODE - dsmSqlcode COBOL Name: DSM-SQLCODE - sqlcode COBOL
   * Name: SQLCODE - dsmReturnCode COBOL Name: DSM-RETURN-CODE - bhiRetReasonCode COBOL Name:
   * BHI-RET-REASON-CODE - bhiDb2RetCode COBOL Name: BHI-DB2-RET-CODE - bhiDb2Table COBOL Name:
   * BHI-DB2-TABLE - bhiDb2ParaNm COBOL Name: BHI-DB2-PARA-NM - bhiDb2Action COBOL Name:
   * BHI-DB2-ACTION
   *
   * @throws CFException
   */
  @Override
  public CloseCsrAllOutCtx closeCsrAll(CloseCsrAllInCtx methodIn) throws Exception {

    // *81***************************************************************
    // *81 4900-Close-csr-all                                           *
    // *81                                                              *
    // *81 business function: close cursor-all                          *
    // *81                                                              *
    // *81***************************************************************
    // *82***************************************************************
    // *82 4900-close-csr-all                                           *
    // *82                                                              *
    // *82 close cursor-all                                             *
    // *82***************************************************************
    // Added variable to get the program context in place.
    D5427bhiCtx programCtx = methodIn.getD5427bhiCtx();
    // Added variable to get the output context in place.
    CloseCsrAllOutCtx methodOut = methodIn.getCloseCsrAllOutCtx();
    //  cobolCode::CLOSE CURSOR-ALL
    d5427bhiRepository.closeCursorAllD5427bhi(
        programCtx.getCursorAllResultSet(), programCtx.getSqlca());
    //  cobolCode::MOVE SQLCODE TO WS-SQLCODE DSM-SQLCODE
    methodOut.setSqlcode_Ws(methodOut.getSqlcode());
    methodOut.setDsmSqlcode(methodOut.getSqlcode());
    //  cobolCode::EVALUATE TRUE
    if (methodOut.isSqlcodeOk()) {;
    } else {
      //  cobolCode::SET DSM-DB2-ERROR TO TRUE
      methodOut.setDsmDb2ErrorTrue();

      //  cobolCode::SET BHI-DB2-CLOSE-ERROR TO TRUE
      methodOut.setBhiDb2CloseErrorTrue();

      //  FORMAT261490060 = "-ZZZZZZ999"
      methodOut.setBhiDb2RetCode(
          CFUtil.cobolNumberFormatter(
              CONSTANTS.FORMAT261490060, String.valueOf(methodOut.getSqlcode()).toCharArray()));
      //  cobolCode::MOVE 'BEN_HIPAA_SRVC' TO BHI-DB2-TABLE
      methodOut.setBhiDb2Table(CONSTANTS.LITERAL_BEN_HIPAA_SRVC_B16_);
      //  cobolCode::MOVE '4900-CLOSE-CSR-ALL' TO BHI-DB2-PARA-NM
      methodOut.setBhiDb2ParaNm(CONSTANTS.LITERAL_4900_MN3_CLOSECSRALL_B12_);
      //  cobolCode::MOVE 'CLOSE' TO BHI-DB2-ACTION
      methodOut.setBhiDb2Action(CONSTANTS.LITERAL_CLOSE_B3_);
      //  cobolCode::PERFORM 7777-MOVES-FOR-ERROR-LOG
      movesForErrorLog(programCtx.getMovesForErrorLogInCtx()); /*7777-MOVES-FOR-ERROR-LOG SECTION*/
      if (programCtx.isProgramEnded()) {
        return methodOut;
      }
    }

    return methodOut;
  }
  /**
   * processScreenUpdate This method is derived from COBOL Paragraph - 5000-PROCESS-SCREEN-UPDATE
   * SECTION COBOL Cyclomatic complexity - 9 Input :
   *
   * <p>- sub COBOL Name: WS-SUB - bhiRetReasonCode COBOL Name: BHI-RET-REASON-CODE
   *
   * <p>Output :
   *
   * <p>- sub COBOL Name: WS-SUB - retryCnt COBOL Name: WS-RETRY-CNT
   *
   * @throws CFException
   */
  @Override
  public ProcessScreenUpdateOutCtx processScreenUpdate(ProcessScreenUpdateInCtx methodIn)
      throws Exception {

    // *81***************************************************************
    // *81 5000-Process-screen-update                                   *
    // *81                                                              *
    // *81 business function: update the screen with new field values   *
    // *81                                                              *
    // *81                                                              *
    // *81***************************************************************
    // *82***************************************************************
    // *82 5000-process-screen-update                                   *
    // *82                                                              *
    // *82 perform the add/update/inactivate based on the action.       *
    // *82***************************************************************
    // Added variable to get the program context in place.
    D5427bhiCtx programCtx = methodIn.getD5427bhiCtx();
    // Added variable to get the output context in place.
    ProcessScreenUpdateOutCtx methodOut = methodIn.getProcessScreenUpdateOutCtx();
    //  cobolCode::PERFORM VARYING WS-SUB FROM 1 BY 1 UNTIL WS-SUB > 15
    for (methodOut.setSub(1);
        ((methodOut.getSub() <= 15));
        methodOut.setSub(methodOut.getSub() + 1)) {
      //  cobolCode::MOVE ZEROS TO WS-RETRY-CNT
      methodOut.setRetryCnt(0);
      //  cobolCode::EVALUATE BHI-REQ-ROW-ACT ( WS-SUB )
      switch (new String(methodIn.getBhiReqRowAct(methodOut.getSub() - 1))) {
        case "I":
          //  cobolCode::PERFORM 5800-MOVE-ROW-TO-DCLGEN
          moveRowToDclgen(programCtx.getMoveRowToDclgenInCtx()); /*5800-MOVE-ROW-TO-DCLGEN SECTION*/
          if (programCtx.isProgramEnded()) {
            return methodOut;
          }
          //  cobolCode::PERFORM 5100-VALIDATE-INACT-REQ
          programCtx.setLoopValidateInactReq(true);
          while (programCtx.getLoopValidateInactReq()) {
            validateInactReq(programCtx.getValidateInactReqInCtx());
            if (programCtx.isProgramEnded()) return methodOut;
          } /*5100-VALIDATE-INACT-REQ SECTION*/
          if (programCtx.isProgramEnded()) {
            return methodOut;
          }
          //  cobolCode::IF BHI-NO-ERRORS
          if (methodIn.isBhiNoErrors()) {
            //  cobolCode::PERFORM 5200-INACTIVATE-RECORD
            programCtx.setLoopInactivateRecord(true);
            while (programCtx.getLoopInactivateRecord()) {
              inactivateRecord(programCtx.getInactivateRecordInCtx());
              if (programCtx.isProgramEnded()) return methodOut;
            } /*5200-INACTIVATE-RECORD SECTION*/
            if (programCtx.isProgramEnded()) {
              return methodOut;
            }
          }
          break;
        case "A":
          //  cobolCode::PERFORM 5800-MOVE-ROW-TO-DCLGEN
          moveRowToDclgen(programCtx.getMoveRowToDclgenInCtx()); /*5800-MOVE-ROW-TO-DCLGEN SECTION*/
          if (programCtx.isProgramEnded()) {
            return methodOut;
          }
          //  cobolCode::PERFORM 5300-VALIDATE-ADD-UPDATE-REQ
          validateAddUpdateReq(programCtx); /*5300-VALIDATE-ADD-UPDATE-REQ SECTION*/
          if (programCtx.isProgramEnded()) {
            return methodOut;
          }
          //  cobolCode::IF BHI-NO-ERRORS
          if (methodIn.isBhiNoErrors()) {
            //  cobolCode::PERFORM 5400-ADD-RECORD
            programCtx.setLoopAddRecord(true);
            while (programCtx.getLoopAddRecord()) {
              addRecord(programCtx.getAddRecordInCtx());
              if (programCtx.isProgramEnded()) return methodOut;
            } /*5400-ADD-RECORD SECTION*/
            if (programCtx.isProgramEnded()) {
              return methodOut;
            }
          }
          break;
        case "U":
          //  cobolCode::PERFORM 5800-MOVE-ROW-TO-DCLGEN
          moveRowToDclgen(programCtx.getMoveRowToDclgenInCtx()); /*5800-MOVE-ROW-TO-DCLGEN SECTION*/
          if (programCtx.isProgramEnded()) {
            return methodOut;
          }
          //  cobolCode::PERFORM 5300-VALIDATE-ADD-UPDATE-REQ
          validateAddUpdateReq(programCtx); /*5300-VALIDATE-ADD-UPDATE-REQ SECTION*/
          if (programCtx.isProgramEnded()) {
            return methodOut;
          }
          //  cobolCode::IF BHI-NO-ERRORS
          if (methodIn.isBhiNoErrors()) {
            //  cobolCode::PERFORM 5500-UPDATE-RECORD
            programCtx.setLoopUpdateRecord(true);
            while (programCtx.getLoopUpdateRecord()) {
              updateRecord(programCtx.getUpdateRecordInCtx());
              if (programCtx.isProgramEnded()) return methodOut;
            } /*5500-UPDATE-RECORD SECTION*/
            if (programCtx.isProgramEnded()) {
              return methodOut;
            }
          }
          break;
      }
    }

    return methodOut;
  }
  /**
   * validateInactReq This method is derived from COBOL Paragraph - 5100-VALIDATE-INACT-REQ SECTION
   * COBOL Cyclomatic complexity - 10 Input :
   *
   * <p>- stsActive COBOL Name: WS-STS-ACTIVE - sqlcode COBOL Name: SQLCODE - retryCnt COBOL Name:
   * WS-RETRY-CNT
   *
   * <p>Output :
   *
   * <p>- dbhsStsCd COBOL Name: DBHS-STS-CD - stsActive COBOL Name: WS-STS-ACTIVE - sqlcode_Ws COBOL
   * Name: WS-SQLCODE - dsmSqlcode COBOL Name: DSM-SQLCODE - sqlcode COBOL Name: SQLCODE -
   * dsmReturnCode COBOL Name: DSM-RETURN-CODE - bhiRetReasonCode COBOL Name: BHI-RET-REASON-CODE -
   * bhiRowReturnCd COBOL Name: BHI-ROW-RETURN-CD - bhiDb2Table COBOL Name: BHI-DB2-TABLE -
   * bhiDb2Action COBOL Name: BHI-DB2-ACTION - bhiDb2ParaNm COBOL Name: BHI-DB2-PARA-NM - retryCnt
   * COBOL Name: WS-RETRY-CNT
   *
   * @throws CFException
   */
  @Override
  public ValidateInactReqOutCtx validateInactReq(ValidateInactReqInCtx methodIn) throws Exception {

    // *81***************************************************************
    // *81 5100-Validate-inact-req                                      *
    // *81                                                              *
    // *81 business function: validating inactive requests              *
    // *81***************************************************************
    // *82***************************************************************
    // *82 5100-validate-inact-req                                      *
    // *82                                                              *
    // *82 validate the inactive request of each row and update.        *
    // *82***************************************************************

    // *Verifying if the existing row is active to perform inactivate
    // *function.
    // Added variable to get the program context in place.
    D5427bhiCtx programCtx = methodIn.getD5427bhiCtx();
    programCtx.setLoopValidateInactReq(false);
    // Added variable to get the output context in place.
    ValidateInactReqOutCtx methodOut = methodIn.getValidateInactReqOutCtx();
    //  cobolCode::MOVE WS-STS-ACTIVE TO DBHS-STS-CD
    methodOut.setDbhsStsCd(methodOut.getStsActive());
    //  cobolCode::SELECT STS_CD FROM BEN_HIPAA_SRVC WHERE SLOT_TBL_ID = ? AND STS_CD = ? AND
    // HIPAA_CD = ? AND EFF_DT = ? AND HIPAA_VER_NBR = ? AND NTWK_TYP_CD = ? AND EFF_DT = ? AND
    // CANC_DT = ?
    d5427bhiRepository.selectBenHipaaSrvc(programCtx.getSqlca(), methodOut.getDclbenHipaaSrvc());
    //  cobolCode::MOVE SQLCODE TO WS-SQLCODE DSM-SQLCODE
    methodOut.setSqlcode_Ws(methodOut.getSqlcode());
    methodOut.setDsmSqlcode(methodOut.getSqlcode());
    //  cobolCode::EVALUATE TRUE
    if (methodOut.isSqlcodeOk() || methodOut.isSqlcodeMultRows()) {
      //  cobolCode::IF DBHS-STS-CD = 'A'
      //  LITERAL_A = 'A'
      //  cobolCode::ELSE
      if (methodOut.getDbhsStsCd()[0] != 'A') {
        //  cobolCode::SET DSM-DB2-ERROR TO TRUE
        methodOut.setDsmDb2ErrorTrue();

        //  cobolCode::SET BHI-INV-ROW-ERROR TO TRUE
        methodOut.setBhiInvRowErrorTrue();

        //  cobolCode::SET BHI-ROW-NOT-ACTIVE ( WS-SUB ) TO TRUE
        methodOut.setBhiRowNotActiveTrue(methodIn.getSub() - 1);

        //  cobolCode::MOVE 'BEN_HIPAA_SRVC' TO BHI-DB2-TABLE
        methodOut.setBhiDb2Table(CONSTANTS.LITERAL_BEN_HIPAA_SRVC_B16_);
        //  cobolCode::MOVE 'SELECT' TO BHI-DB2-ACTION
        methodOut.setBhiDb2Action(CONSTANTS.LITERAL_SELECT_B2_);
        //  cobolCode::MOVE '5100-VALIDATE-INACT-REQ1' TO BHI-DB2-PARA-NM
        methodOut.setBhiDb2ParaNm(CONSTANTS.LITERAL_5100_MN3_VALIDATEINACTREQ1_B6_);
        //  cobolCode::PERFORM 7777-MOVES-FOR-ERROR-LOG
        movesForErrorLog(
            programCtx.getMovesForErrorLogInCtx()); /*7777-MOVES-FOR-ERROR-LOG SECTION*/
        if (programCtx.isProgramEnded()) {
          return methodOut;
        }
      }
    } else if (methodOut.isSqlcodeNotFound()) {
      //  cobolCode::SET DSM-DB2-ERROR TO TRUE
      methodOut.setDsmDb2ErrorTrue();

      //  cobolCode::SET BHI-INV-ROW-ERROR TO TRUE
      methodOut.setBhiInvRowErrorTrue();

      //  cobolCode::SET BHI-ROW-NOT-FOUND ( WS-SUB ) TO TRUE
      methodOut.setBhiRowNotFoundTrue(methodIn.getSub() - 1);

      //  cobolCode::MOVE 'BEN_HIPAA_SRVC' TO BHI-DB2-TABLE
      methodOut.setBhiDb2Table(CONSTANTS.LITERAL_BEN_HIPAA_SRVC_B16_);
      //  cobolCode::MOVE 'SELECT' TO BHI-DB2-ACTION
      methodOut.setBhiDb2Action(CONSTANTS.LITERAL_SELECT_B2_);
      //  cobolCode::MOVE '5100-VALIDATE-INACT-REQ2' TO BHI-DB2-PARA-NM
      methodOut.setBhiDb2ParaNm(CONSTANTS.LITERAL_5100_MN3_VALIDATEINACTREQ2_B6_);
      //  cobolCode::PERFORM 7777-MOVES-FOR-ERROR-LOG
      movesForErrorLog(programCtx.getMovesForErrorLogInCtx()); /*7777-MOVES-FOR-ERROR-LOG SECTION*/
      if (programCtx.isProgramEnded()) {
        return methodOut;
      }
    } else if (methodOut.isSqlcodeDeadlockNorb() || methodOut.isSqlcodeTimeOut()) {
      //  cobolCode::ADD 1 TO WS-RETRY-CNT
      methodOut.setRetryCnt(methodOut.getRetryCnt() + 1);
      //  cobolCode::IF WS-RETRY-CNT < 4
      if ((methodOut.getRetryCnt() < 4)) {
        // cobolCode::GO TO 5100-VALIDATE-INACT-REQ
        programCtx.setLoopValidateInactReq(true);
        return methodOut;
        // cobolCodeEnds::GO TO 5100-VALIDATE-INACT-REQ
      }
      //  cobolCode::ELSE
      else {
        //  cobolCode::SET DSM-DB2-ERROR TO TRUE
        methodOut.setDsmDb2ErrorTrue();

        //  cobolCode::SET BHI-INV-ROW-ERROR TO TRUE
        methodOut.setBhiInvRowErrorTrue();

        //  cobolCode::SET BHI-ROW-DEADLOCK ( WS-SUB ) TO TRUE
        methodOut.setBhiRowDeadlockTrue(methodIn.getSub() - 1);

        //  cobolCode::MOVE 'BEN_HIPAA_SRVC' TO BHI-DB2-TABLE
        methodOut.setBhiDb2Table(CONSTANTS.LITERAL_BEN_HIPAA_SRVC_B16_);
        //  cobolCode::MOVE 'SELECT' TO BHI-DB2-ACTION
        methodOut.setBhiDb2Action(CONSTANTS.LITERAL_SELECT_B2_);
        //  cobolCode::MOVE '5100-VALIDATE-INACT-REQ3' TO BHI-DB2-PARA-NM
        methodOut.setBhiDb2ParaNm(CONSTANTS.LITERAL_5100_MN3_VALIDATEINACTREQ3_B6_);
        //  cobolCode::PERFORM 7777-MOVES-FOR-ERROR-LOG
        movesForErrorLog(
            programCtx.getMovesForErrorLogInCtx()); /*7777-MOVES-FOR-ERROR-LOG SECTION*/
        if (programCtx.isProgramEnded()) {
          return methodOut;
        }
      }
    } else {
      //  cobolCode::SET DSM-DB2-ERROR TO TRUE
      methodOut.setDsmDb2ErrorTrue();

      //  cobolCode::SET BHI-GENERAL-DB2-ERROR TO TRUE
      methodOut.setBhiGeneralDb2ErrorTrue();

      //  cobolCode::SET BHI-ROW-DB2-ERR ( WS-SUB ) TO TRUE
      methodOut.setBhiRowDb2ErrTrue(methodIn.getSub() - 1);

      //  cobolCode::MOVE 'BEN_HIPAA_SRVC' TO BHI-DB2-TABLE
      methodOut.setBhiDb2Table(CONSTANTS.LITERAL_BEN_HIPAA_SRVC_B16_);
      //  cobolCode::MOVE 'SELECT' TO BHI-DB2-ACTION
      methodOut.setBhiDb2Action(CONSTANTS.LITERAL_SELECT_B2_);
      //  cobolCode::MOVE '5100-VALIDATE-INACT-REQ4' TO BHI-DB2-PARA-NM
      methodOut.setBhiDb2ParaNm(CONSTANTS.LITERAL_5100_MN3_VALIDATEINACTREQ4_B6_);
      //  cobolCode::PERFORM 7777-MOVES-FOR-ERROR-LOG
      movesForErrorLog(programCtx.getMovesForErrorLogInCtx()); /*7777-MOVES-FOR-ERROR-LOG SECTION*/
      if (programCtx.isProgramEnded()) {
        return methodOut;
      }
    }

    return methodOut;
  }
  /**
   * inactivateRecord This method is derived from COBOL Paragraph - 5200-INACTIVATE-RECORD SECTION
   * COBOL Cyclomatic complexity - 9 Input :
   *
   * <p>- bhiReqRowLstupdUsrid COBOL Name: BHI-REQ-ROW-LSTUPD-USRID - sqlcode COBOL Name: SQLCODE -
   * dbhsLstUpdtDttm COBOL Name: DBHS-LST-UPDT-DTTM - retryCnt COBOL Name: WS-RETRY-CNT
   *
   * <p>Output :
   *
   * <p>- dbhsStsCd COBOL Name: DBHS-STS-CD - dbhsLstUpdtUserId COBOL Name: DBHS-LST-UPDT-USER-ID -
   * bhiReqRowLstupdUsrid COBOL Name: BHI-REQ-ROW-LSTUPD-USRID - sqlcode_Ws COBOL Name: WS-SQLCODE -
   * dsmSqlcode COBOL Name: DSM-SQLCODE - sqlcode COBOL Name: SQLCODE - bhiRowLstupdDttm COBOL Name:
   * BHI-ROW-LSTUPD-DTTM - dbhsLstUpdtDttm COBOL Name: DBHS-LST-UPDT-DTTM - bhiRowStsCd COBOL Name:
   * BHI-ROW-STS-CD - retryCnt COBOL Name: WS-RETRY-CNT - dsmReturnCode COBOL Name: DSM-RETURN-CODE
   * - bhiRetReasonCode COBOL Name: BHI-RET-REASON-CODE - bhiRowReturnCd COBOL Name:
   * BHI-ROW-RETURN-CD - bhiDb2Table COBOL Name: BHI-DB2-TABLE - bhiDb2Action COBOL Name:
   * BHI-DB2-ACTION - bhiDb2ParaNm COBOL Name: BHI-DB2-PARA-NM
   *
   * @throws CFException
   */
  @Override
  public InactivateRecordOutCtx inactivateRecord(InactivateRecordInCtx methodIn) throws Exception {

    // *82***************************************************************
    // *82 5200-Inactivate-record                                       *
    // *82 performs the process to inactivate a record                  *
    // *82***************************************************************
    // Added variable to get the program context in place.
    D5427bhiCtx programCtx = methodIn.getD5427bhiCtx();
    programCtx.setLoopInactivateRecord(false);
    // Added variable to get the output context in place.
    InactivateRecordOutCtx methodOut = methodIn.getInactivateRecordOutCtx();
    //  cobolCode::MOVE 'I' TO DBHS-STS-CD
    //  LITERAL_I = 'I'
    methodOut.setDbhsStsCd(CONSTANTS.LITERAL_I);
    //  cobolCode::MOVE BHI-REQ-ROW-LSTUPD-USRID ( WS-SUB ) TO DBHS-LST-UPDT-USER-ID
    methodOut.setDbhsLstUpdtUserId(
        pad(9, methodOut.getBhiReqRowLstupdUsrid(methodIn.getSub() - 1), SPACE_CHAR, RIGHT_PAD));
    //  cobolCode::SELECT CURRENT_TIMESTAMP FROM SYSIBM.SYSDUMMY1

    /** ***** SET :DBHS-LST-UPDT-DTTM = CURRENT_TIMESTAMP */
    methodOut.setSqlcode(0);
    methodOut.setDbhsLstUpdtDttm(db2Base.getCurrentTimestamp());
    //  cobolCode::UPDATE BEN_HIPAA_SRVC SET STS_CD = ? , LST_UPDT_DTTM = ? , LST_UPDT_USER_ID = ?
    // WHERE SLOT_TBL_ID = ? AND HIPAA_VER_NBR = ? AND HIPAA_CD = ? AND NTWK_TYP_CD = ? AND EFF_DT =
    // ? AND CANC_DT = ?
    d5427bhiRepository.updateBenHipaaSrvc(programCtx.getSqlca(), methodOut.getDclbenHipaaSrvc());
    //  cobolCode::MOVE SQLCODE TO WS-SQLCODE DSM-SQLCODE
    methodOut.setSqlcode_Ws(methodOut.getSqlcode());
    methodOut.setDsmSqlcode(methodOut.getSqlcode());
    //  cobolCode::EVALUATE TRUE
    if (methodOut.isSqlcodeOk()) {
      //  cobolCode::PERFORM 5900-MOVE-REQ-TO-RETURN
      moveReqToReturn(programCtx.getMoveReqToReturnInCtx()); /*5900-MOVE-REQ-TO-RETURN SECTION*/
      if (programCtx.isProgramEnded()) {
        return methodOut;
      }
      //  cobolCode::MOVE DBHS-LST-UPDT-DTTM TO BHI-ROW-LSTUPD-DTTM ( WS-SUB )
      methodOut.setBhiRowLstupdDttm(methodIn.getSub() - 1, methodOut.getDbhsLstUpdtDttm());
      //  cobolCode::MOVE 'I' TO BHI-ROW-STS-CD ( WS-SUB )
      //  LITERAL_I = 'I'
      methodOut.setBhiRowStsCd(methodIn.getSub() - 1, CONSTANTS.LITERAL_I);
    } else if (methodOut.isSqlcodeDeadlockNorb() || methodOut.isSqlcodeTimeOut()) {
      //  cobolCode::ADD 1 TO WS-RETRY-CNT
      methodOut.setRetryCnt(methodOut.getRetryCnt() + 1);
      //  cobolCode::IF WS-RETRY-CNT < 4
      if ((methodOut.getRetryCnt() < 4)) {
        // cobolCode::GO TO 5200-INACTIVATE-RECORD
        programCtx.setLoopInactivateRecord(true);
        return methodOut;
        // cobolCodeEnds::GO TO 5200-INACTIVATE-RECORD
      }
      //  cobolCode::ELSE
      else {
        //  cobolCode::SET DSM-DB2-ERROR TO TRUE
        methodOut.setDsmDb2ErrorTrue();

        //  cobolCode::SET BHI-INV-ROW-ERROR TO TRUE
        methodOut.setBhiInvRowErrorTrue();

        //  cobolCode::SET BHI-ROW-DEADLOCK ( WS-SUB ) TO TRUE
        methodOut.setBhiRowDeadlockTrue(methodIn.getSub() - 1);

        //  cobolCode::MOVE 'BEN_HIPAA_SRVC' TO BHI-DB2-TABLE
        methodOut.setBhiDb2Table(CONSTANTS.LITERAL_BEN_HIPAA_SRVC_B16_);
        //  cobolCode::MOVE 'UPDATE' TO BHI-DB2-ACTION
        methodOut.setBhiDb2Action(CONSTANTS.LITERAL_UPDATE_B2_);
        //  cobolCode::MOVE '5200-INACTIVATE-RECORD1' TO BHI-DB2-PARA-NM
        methodOut.setBhiDb2ParaNm(CONSTANTS.LITERAL_5200_MN2_INACTIVATERECORD1_B7_);
        //  cobolCode::PERFORM 7777-MOVES-FOR-ERROR-LOG
        movesForErrorLog(
            programCtx.getMovesForErrorLogInCtx()); /*7777-MOVES-FOR-ERROR-LOG SECTION*/
        if (programCtx.isProgramEnded()) {
          return methodOut;
        }
      }
    } else if (methodOut.isSqlcodeInvalidDate()) {
      //  cobolCode::SET DSM-DB2-ERROR TO TRUE
      methodOut.setDsmDb2ErrorTrue();

      //  cobolCode::SET BHI-INV-ROW-ERROR TO TRUE
      methodOut.setBhiInvRowErrorTrue();

      //  cobolCode::SET BHI-ROW-BAD-DATE ( WS-SUB ) TO TRUE
      methodOut.setBhiRowBadDateTrue(methodIn.getSub() - 1);

      //  cobolCode::MOVE 'BEN_HIPAA_SRVC' TO BHI-DB2-TABLE
      methodOut.setBhiDb2Table(CONSTANTS.LITERAL_BEN_HIPAA_SRVC_B16_);
      //  cobolCode::MOVE 'SELECT' TO BHI-DB2-ACTION
      methodOut.setBhiDb2Action(CONSTANTS.LITERAL_SELECT_B2_);
      //  cobolCode::MOVE '5200-INACTIVATE-RECORD2' TO BHI-DB2-PARA-NM
      methodOut.setBhiDb2ParaNm(CONSTANTS.LITERAL_5200_MN2_INACTIVATERECORD2_B7_);
      //  cobolCode::PERFORM 7777-MOVES-FOR-ERROR-LOG
      movesForErrorLog(programCtx.getMovesForErrorLogInCtx()); /*7777-MOVES-FOR-ERROR-LOG SECTION*/
      if (programCtx.isProgramEnded()) {
        return methodOut;
      }
    } else {
      //  cobolCode::SET DSM-DB2-ERROR TO TRUE
      methodOut.setDsmDb2ErrorTrue();

      //  cobolCode::SET BHI-INV-ROW-ERROR TO TRUE
      methodOut.setBhiInvRowErrorTrue();

      //  cobolCode::SET BHI-ROW-DB2-ERR ( WS-SUB ) TO TRUE
      methodOut.setBhiRowDb2ErrTrue(methodIn.getSub() - 1);

      //  cobolCode::MOVE 'BEN_HIPAA_SRVC' TO BHI-DB2-TABLE
      methodOut.setBhiDb2Table(CONSTANTS.LITERAL_BEN_HIPAA_SRVC_B16_);
      //  cobolCode::MOVE 'UPDATE' TO BHI-DB2-ACTION
      methodOut.setBhiDb2Action(CONSTANTS.LITERAL_UPDATE_B2_);
      //  cobolCode::MOVE '5200-INACTIVATE-RECORD3' TO BHI-DB2-PARA-NM
      methodOut.setBhiDb2ParaNm(CONSTANTS.LITERAL_5200_MN2_INACTIVATERECORD3_B7_);
      //  cobolCode::PERFORM 7777-MOVES-FOR-ERROR-LOG
      movesForErrorLog(programCtx.getMovesForErrorLogInCtx()); /*7777-MOVES-FOR-ERROR-LOG SECTION*/
      if (programCtx.isProgramEnded()) {
        return methodOut;
      }
    }

    return methodOut;
  }
  /**
   * validateAddUpdateReq This method is derived from COBOL Paragraph - 5300-VALIDATE-ADD-UPDATE-REQ
   * SECTION COBOL Cyclomatic complexity - 1 Input : None
   *
   * <p>Output : None
   *
   * @throws CFException
   */
  @Override
  public void validateAddUpdateReq(D5427bhiCtx programCtx) throws Exception {

    // *81***************************************************************
    // *81 5300-Validate-add-update-req                                 *
    // *81 business function: validating the updated fields values      *
    // *81                                                              *
    // *81***************************************************************
    // *82***************************************************************
    // *82 5300-validate-add-update-req                                 *
    // *82                                                              *
    // *82 validations of table id, service code, hipaa service code,   *
    // *82 duplicate and overlap checks are performed when an existing  *
    // *82 row is being updated with new values.                        *
    // *82                                                              *
    // *82***************************************************************
    //  cobolCode::PERFORM 5310-VALIDATE-TABLE-ID
    validateTableId(programCtx.getValidateTableIdInCtx()); /*5310-VALIDATE-TABLE-ID SECTION*/
    if (programCtx.isProgramEnded()) {
      return;
    }
    //  cobolCode::PERFORM 5320-VALIDATE-SERVICE-CD
    validateServiceCd(programCtx.getValidateServiceCdInCtx()); /*5320-VALIDATE-SERVICE-CD SECTION*/
    if (programCtx.isProgramEnded()) {
      return;
    }
    //  cobolCode::PERFORM 5330-VALIDATE-HIPAA-SRVC-CD
    validateHipaaSrvcCd(
        programCtx.getValidateHipaaSrvcCdInCtx()); /*5330-VALIDATE-HIPAA-SRVC-CD SECTION*/
    if (programCtx.isProgramEnded()) {
      return;
    }
    //  cobolCode::PERFORM 5340-CHECK-DUPLICATE-ROW
    checkDuplicateRow(programCtx.getCheckDuplicateRowInCtx()); /*5340-CHECK-DUPLICATE-ROW SECTION*/
    if (programCtx.isProgramEnded()) {
      return;
    }
    //  cobolCode::PERFORM 5350-CHECK-OVERLAP-DATES
    programCtx.setDoNotSkipCheckAf(true);
    checkOverlapDates(programCtx.getCheckOverlapDatesInCtx()); /*5350-CHECK-OVERLAP-DATES SECTION*/
    if (programCtx.isProgramEnded()) {
      return;
    }
    if (programCtx.getDoNotSkipCheckAf()) {
      checkAf(programCtx.getCheckAfInCtx());
    } else {
      programCtx.setDoNotSkipCheckAf(true);
    } /*5350-CHECK-AF*/
    if (programCtx.isProgramEnded()) {
      return;
    }
    continue5350(programCtx.getContinue5350InCtx()); /*5350-CONTINUE*/
    if (programCtx.isProgramEnded()) {
      return;
    }
    //  cobolCode::PERFORM 5360-CHECK-NET-ID-CONFLICT
    checkNetIdConflict(
        programCtx.getCheckNetIdConflictInCtx()); /*5360-CHECK-NET-ID-CONFLICT SECTION*/
    if (programCtx.isProgramEnded()) {
      return;
    }
  }
  /**
   * validateTableId This method is derived from COBOL Paragraph - 5310-VALIDATE-TABLE-ID SECTION
   * COBOL Cyclomatic complexity - 8 Input :
   *
   * <p>- bhiReqSlotTable COBOL Name: BHI-REQ-SLOT-TABLE - sqlcode COBOL Name: SQLCODE
   *
   * <p>Output :
   *
   * <p>- hcaTables COBOL Name: WS-HCA-TABLES - bhiReqSlotTable COBOL Name: BHI-REQ-SLOT-TABLE -
   * hdrSlotTblId COBOL Name: HDR-SLOT-TBL-ID - sqlcode_Ws COBOL Name: WS-SQLCODE - dsmSqlcode COBOL
   * Name: DSM-SQLCODE - sqlcode COBOL Name: SQLCODE - dsmReturnCode COBOL Name: DSM-RETURN-CODE -
   * bhiRetReasonCode COBOL Name: BHI-RET-REASON-CODE - bhiRowReturnCd COBOL Name: BHI-ROW-RETURN-CD
   * - bhiDb2Table COBOL Name: BHI-DB2-TABLE - bhiDb2Action COBOL Name: BHI-DB2-ACTION -
   * bhiDb2ParaNm COBOL Name: BHI-DB2-PARA-NM
   *
   * @throws CFException
   */
  @Override
  public ValidateTableIdOutCtx validateTableId(ValidateTableIdInCtx methodIn) throws Exception {

    // *82 Validating the table-id if it is present in the slot table   *
    // *82                                                              *
    // *82***************************************************************

    // * Need not validate the table-id in the slot table if the table
    // * id is 'pse001'.
    // Added variable to get the program context in place.
    D5427bhiCtx programCtx = methodIn.getD5427bhiCtx();
    // Added variable to get the output context in place.
    ValidateTableIdOutCtx methodOut = methodIn.getValidateTableIdOutCtx();
    //  cobolCode::MOVE BHI-REQ-SLOT-TABLE TO WS-HCA-TABLES
    methodOut.setHcaTables(methodOut.getBhiReqSlotTable());
    //  cobolCode::IF BHI-REQ-SLOT-TABLE = 'PSE001' OR HCA-TABLES
    //  LITERAL_PSE001 = 'PSE001'
    //  cobolCode::ELSE
    if (compareChars(methodOut.getBhiReqSlotTable(), CONSTANTS.LITERAL_PSE001) != 0
        && !(methodOut.isHcaTables1())) {
      //  cobolCode::MOVE BHI-REQ-SLOT-TABLE TO HDR-SLOT-TBL-ID
      methodOut.setHdrSlotTblId(methodOut.getBhiReqSlotTable());
      //  cobolCode::SELECT 'Y' FROM SLOT_TBL WHERE SLOT_TBL_ID = ?
      d5427bhiRepository.selectSlotTbl(
          programCtx.getSqlca(), methodIn.getDclslotTbl(), methodOut.getVariables());
      //  cobolCode::MOVE SQLCODE TO WS-SQLCODE DSM-SQLCODE
      methodOut.setSqlcode_Ws(methodOut.getSqlcode());
      methodOut.setDsmSqlcode(methodOut.getSqlcode());
      //  cobolCode::EVALUATE TRUE
      if (methodOut.isSqlcodeOk() || methodOut.isSqlcodeMultRows()) {;
      } else if (methodOut.isSqlcodeNotFound()) {
        //  cobolCode::SET DSM-DB2-ERROR TO TRUE
        methodOut.setDsmDb2ErrorTrue();

        //  cobolCode::SET BHI-INV-ROW-ERROR TO TRUE
        methodOut.setBhiInvRowErrorTrue();

        //  cobolCode::SET BHI-ROW-NOT-ADD-TBL-NOT-DEF ( WS-SUB ) TO TRUE
        methodOut.setBhiRowNotAddTblNotDefTrue(methodIn.getSub() - 1);

        //  cobolCode::MOVE 'SLOT_TBL' TO BHI-DB2-TABLE
        methodOut.setBhiDb2Table(CONSTANTS.LITERAL_SLOT_TBL_B22_);
        //  cobolCode::MOVE 'SELECT' TO BHI-DB2-ACTION
        methodOut.setBhiDb2Action(CONSTANTS.LITERAL_SELECT_B2_);
        //  cobolCode::MOVE '5310-VALIDATE-TABLE-ID1' TO BHI-DB2-PARA-NM
        methodOut.setBhiDb2ParaNm(CONSTANTS.LITERAL_5310_MN3_VALIDATETABLEID1_B7_);
        //  cobolCode::PERFORM 7777-MOVES-FOR-ERROR-LOG
        movesForErrorLog(
            programCtx.getMovesForErrorLogInCtx()); /*7777-MOVES-FOR-ERROR-LOG SECTION*/
        if (programCtx.isProgramEnded()) {
          return methodOut;
        }
      } else {
        //  cobolCode::SET DSM-DB2-ERROR TO TRUE
        methodOut.setDsmDb2ErrorTrue();

        //  cobolCode::SET BHI-INV-ROW-ERROR TO TRUE
        methodOut.setBhiInvRowErrorTrue();

        //  cobolCode::SET BHI-ROW-DB2-ERR ( WS-SUB ) TO TRUE
        methodOut.setBhiRowDb2ErrTrue(methodIn.getSub() - 1);

        //  cobolCode::MOVE 'SLOT_TBL' TO BHI-DB2-TABLE
        methodOut.setBhiDb2Table(CONSTANTS.LITERAL_SLOT_TBL_B22_);
        //  cobolCode::MOVE 'SELECT' TO BHI-DB2-ACTION
        methodOut.setBhiDb2Action(CONSTANTS.LITERAL_SELECT_B2_);
        //  cobolCode::MOVE '5310-VALIDATE-TABLE-ID2' TO BHI-DB2-PARA-NM
        methodOut.setBhiDb2ParaNm(CONSTANTS.LITERAL_5310_MN3_VALIDATETABLEID2_B7_);
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
   * validateServiceCd This method is derived from COBOL Paragraph - 5320-VALIDATE-SERVICE-CD
   * SECTION COBOL Cyclomatic complexity - 6 Input :
   *
   * <p>- sqlcode COBOL Name: SQLCODE
   *
   * <p>Output :
   *
   * <p>- sqlcode_Ws COBOL Name: WS-SQLCODE - dsmSqlcode COBOL Name: DSM-SQLCODE - sqlcode COBOL
   * Name: SQLCODE - dsmReturnCode COBOL Name: DSM-RETURN-CODE - bhiRetReasonCode COBOL Name:
   * BHI-RET-REASON-CODE - bhiRowReturnCd COBOL Name: BHI-ROW-RETURN-CD - bhiDb2Table COBOL Name:
   * BHI-DB2-TABLE - bhiDb2Action COBOL Name: BHI-DB2-ACTION - bhiDb2ParaNm COBOL Name:
   * BHI-DB2-PARA-NM
   *
   * @throws CFException
   */
  @Override
  public ValidateServiceCdOutCtx validateServiceCd(ValidateServiceCdInCtx methodIn)
      throws Exception {

    // *81 Business function: validating the service code               *
    // *81                                                              *
    // *81***************************************************************
    // *82***************************************************************
    // *82 5320-validate-service-cd                                     *
    // *82                                                              *
    // *82 validating the service code in the service code transaction  *
    // *82 table                                                        *
    // *82                                                              *
    // *82***************************************************************
    // Added variable to get the program context in place.
    D5427bhiCtx programCtx = methodIn.getD5427bhiCtx();
    // Added variable to get the output context in place.
    ValidateServiceCdOutCtx methodOut = methodIn.getValidateServiceCdOutCtx();
    //  cobolCode::SELECT 'Y' FROM SRVC_CD_TRANS_TBL WHERE SRVC_CD = ?
    d5427bhiRepository.selectSrvcCdTransTbl(
        programCtx.getSqlca(), methodIn.getDclbenHipaaSrvc(), methodOut.getVariables());
    //  cobolCode::MOVE SQLCODE TO WS-SQLCODE DSM-SQLCODE
    methodOut.setSqlcode_Ws(methodOut.getSqlcode());
    methodOut.setDsmSqlcode(methodOut.getSqlcode());
    //  cobolCode::EVALUATE TRUE
    if (methodOut.isSqlcodeOk() || methodOut.isSqlcodeMultRows()) {;
    } else if (methodOut.isSqlcodeNotFound()) {
      //  cobolCode::SET DSM-DB2-ERROR TO TRUE
      methodOut.setDsmDb2ErrorTrue();

      //  cobolCode::SET BHI-INV-ROW-ERROR TO TRUE
      methodOut.setBhiInvRowErrorTrue();

      //  cobolCode::SET BHI-ROW-NOT-ADD-SRVC-NOT-DEF ( WS-SUB ) TO TRUE
      methodOut.setBhiRowNotAddSrvcNotDefTrue(methodIn.getSub() - 1);

      //  cobolCode::MOVE 'SRVC_CD_TRANS_TBL' TO BHI-DB2-TABLE
      methodOut.setBhiDb2Table(CONSTANTS.LITERAL_SRVC_CD_TRANS_TBL_B13_);
      //  cobolCode::MOVE 'SELECT' TO BHI-DB2-ACTION
      methodOut.setBhiDb2Action(CONSTANTS.LITERAL_SELECT_B2_);
      //  cobolCode::MOVE '5320-VALIDATE-SERVICE-CD1' TO BHI-DB2-PARA-NM
      methodOut.setBhiDb2ParaNm(CONSTANTS.LITERAL_5320_MN3_VALIDATESERVICECD1_B5_);
      //  cobolCode::PERFORM 7777-MOVES-FOR-ERROR-LOG
      movesForErrorLog(programCtx.getMovesForErrorLogInCtx()); /*7777-MOVES-FOR-ERROR-LOG SECTION*/
      if (programCtx.isProgramEnded()) {
        return methodOut;
      }
    } else {
      //  cobolCode::SET DSM-DB2-ERROR TO TRUE
      methodOut.setDsmDb2ErrorTrue();

      //  cobolCode::SET BHI-INV-ROW-ERROR TO TRUE
      methodOut.setBhiInvRowErrorTrue();

      //  cobolCode::SET BHI-ROW-DB2-ERR ( WS-SUB ) TO TRUE
      methodOut.setBhiRowDb2ErrTrue(methodIn.getSub() - 1);

      //  cobolCode::MOVE 'SRVC_CD_TRANS_TBL' TO BHI-DB2-TABLE
      methodOut.setBhiDb2Table(CONSTANTS.LITERAL_SRVC_CD_TRANS_TBL_B13_);
      //  cobolCode::MOVE 'SELECT' TO BHI-DB2-ACTION
      methodOut.setBhiDb2Action(CONSTANTS.LITERAL_SELECT_B2_);
      //  cobolCode::MOVE '5320-VALIDATE-SERVICE-CD2' TO BHI-DB2-PARA-NM
      methodOut.setBhiDb2ParaNm(CONSTANTS.LITERAL_5320_MN3_VALIDATESERVICECD2_B5_);
      //  cobolCode::PERFORM 7777-MOVES-FOR-ERROR-LOG
      movesForErrorLog(programCtx.getMovesForErrorLogInCtx()); /*7777-MOVES-FOR-ERROR-LOG SECTION*/
      if (programCtx.isProgramEnded()) {
        return methodOut;
      }
    }

    return methodOut;
  }
  /**
   * validateHipaaSrvcCd This method is derived from COBOL Paragraph - 5330-VALIDATE-HIPAA-SRVC-CD
   * SECTION COBOL Cyclomatic complexity - 6 Input :
   *
   * <p>- sqlcode COBOL Name: SQLCODE
   *
   * <p>Output :
   *
   * <p>- sqlcode_Ws COBOL Name: WS-SQLCODE - dsmSqlcode COBOL Name: DSM-SQLCODE - sqlcode COBOL
   * Name: SQLCODE - dsmReturnCode COBOL Name: DSM-RETURN-CODE - bhiRetReasonCode COBOL Name:
   * BHI-RET-REASON-CODE - bhiRowReturnCd COBOL Name: BHI-ROW-RETURN-CD - bhiDb2Table COBOL Name:
   * BHI-DB2-TABLE - bhiDb2Action COBOL Name: BHI-DB2-ACTION - bhiDb2ParaNm COBOL Name:
   * BHI-DB2-PARA-NM
   *
   * @throws CFException
   */
  @Override
  public ValidateHipaaSrvcCdOutCtx validateHipaaSrvcCd(ValidateHipaaSrvcCdInCtx methodIn)
      throws Exception {

    // *81***************************************************************
    // *82***************************************************************
    // *82 5330-Validate-hipaa-srvc-cd                                  *
    // *82                                                              *
    // *82 validating the hipaa service code in hipaa proc code table   *
    // *82 with hipaa version number 5.                                 *
    // *82                                                              *
    // *82***************************************************************
    // Added variable to get the program context in place.
    D5427bhiCtx programCtx = methodIn.getD5427bhiCtx();
    // Added variable to get the output context in place.
    ValidateHipaaSrvcCdOutCtx methodOut = methodIn.getValidateHipaaSrvcCdOutCtx();
    //  cobolCode::SELECT 'Y' FROM HIPAA_PROC_CD WHERE HIPAA_CD = ? AND HIPAA_VER_NBR = ?
    d5427bhiRepository.selectHipaaProcCd(
        programCtx.getSqlca(), methodIn.getDclbenHipaaSrvc(), methodOut.getVariables());
    //  cobolCode::MOVE SQLCODE TO WS-SQLCODE DSM-SQLCODE
    methodOut.setSqlcode_Ws(methodOut.getSqlcode());
    methodOut.setDsmSqlcode(methodOut.getSqlcode());
    //  cobolCode::EVALUATE TRUE
    if (methodOut.isSqlcodeOk() || methodOut.isSqlcodeMultRows()) {;
    } else if (methodOut.isSqlcodeNotFound()) {
      //  cobolCode::SET DSM-DB2-ERROR TO TRUE
      methodOut.setDsmDb2ErrorTrue();

      //  cobolCode::SET BHI-INV-ROW-ERROR TO TRUE
      methodOut.setBhiInvRowErrorTrue();

      //  cobolCode::SET BHI-ROW-NOT-ADD-HIPAA-NOT-DEF ( WS-SUB ) TO TRUE
      methodOut.setBhiRowNotAddHipaaNotDefTrue(methodIn.getSub() - 1);

      //  cobolCode::MOVE 'HIPAA_PROC_CD' TO BHI-DB2-TABLE
      methodOut.setBhiDb2Table(CONSTANTS.LITERAL_HIPAA_PROC_CD_B17_);
      //  cobolCode::MOVE 'SELECT' TO BHI-DB2-ACTION
      methodOut.setBhiDb2Action(CONSTANTS.LITERAL_SELECT_B2_);
      //  cobolCode::MOVE '5330-VALIDATE-HIPAA-SRVC-CD1' TO BHI-DB2-PARA-NM
      methodOut.setBhiDb2ParaNm(CONSTANTS.LITERAL_5330_MN4_VALIDATEHIPAASRVCCD1_B2_);
      //  cobolCode::PERFORM 7777-MOVES-FOR-ERROR-LOG
      movesForErrorLog(programCtx.getMovesForErrorLogInCtx()); /*7777-MOVES-FOR-ERROR-LOG SECTION*/
      if (programCtx.isProgramEnded()) {
        return methodOut;
      }
    } else {
      //  cobolCode::SET DSM-DB2-ERROR TO TRUE
      methodOut.setDsmDb2ErrorTrue();

      //  cobolCode::SET BHI-INV-ROW-ERROR TO TRUE
      methodOut.setBhiInvRowErrorTrue();

      //  cobolCode::SET BHI-ROW-DB2-ERR ( WS-SUB ) TO TRUE
      methodOut.setBhiRowDb2ErrTrue(methodIn.getSub() - 1);

      //  cobolCode::MOVE 'HIPAA_PROC_CD' TO BHI-DB2-TABLE
      methodOut.setBhiDb2Table(CONSTANTS.LITERAL_HIPAA_PROC_CD_B17_);
      //  cobolCode::MOVE 'SELECT' TO BHI-DB2-ACTION
      methodOut.setBhiDb2Action(CONSTANTS.LITERAL_SELECT_B2_);
      //  cobolCode::MOVE '5330-VALIDATE-HIPAA-SRVC-CD2' TO BHI-DB2-PARA-NM
      methodOut.setBhiDb2ParaNm(CONSTANTS.LITERAL_5330_MN4_VALIDATEHIPAASRVCCD2_B2_);
      //  cobolCode::PERFORM 7777-MOVES-FOR-ERROR-LOG
      movesForErrorLog(programCtx.getMovesForErrorLogInCtx()); /*7777-MOVES-FOR-ERROR-LOG SECTION*/
      if (programCtx.isProgramEnded()) {
        return methodOut;
      }
    }

    return methodOut;
  }
  /**
   * checkDuplicateRow This method is derived from COBOL Paragraph - 5340-CHECK-DUPLICATE-ROW
   * SECTION COBOL Cyclomatic complexity - 10 Input :
   *
   * <p>- bhiReqRowAct COBOL Name: BHI-REQ-ROW-ACT - sub COBOL Name: WS-SUB - stsActive COBOL Name:
   * WS-STS-ACTIVE - dbhsSlotTblId COBOL Name: DBHS-SLOT-TBL-ID - sqlcode COBOL Name: SQLCODE
   *
   * <p>Output :
   *
   * <p>- dbhsStsCd COBOL Name: DBHS-STS-CD - stsActive COBOL Name: WS-STS-ACTIVE - hcaTables COBOL
   * Name: WS-HCA-TABLES - dbhsSlotTblId COBOL Name: DBHS-SLOT-TBL-ID - sqlcode_Ws COBOL Name:
   * WS-SQLCODE - dsmSqlcode COBOL Name: DSM-SQLCODE - sqlcode COBOL Name: SQLCODE - dsmReturnCode
   * COBOL Name: DSM-RETURN-CODE - bhiRetReasonCode COBOL Name: BHI-RET-REASON-CODE - bhiRowReturnCd
   * COBOL Name: BHI-ROW-RETURN-CD - bhiDb2Table COBOL Name: BHI-DB2-TABLE - bhiDb2Action COBOL
   * Name: BHI-DB2-ACTION - bhiDb2ParaNm COBOL Name: BHI-DB2-PARA-NM
   *
   * @throws CFException
   */
  @Override
  public CheckDuplicateRowOutCtx checkDuplicateRow(CheckDuplicateRowInCtx methodIn)
      throws Exception {

    // *81                                                              *
    // *81***************************************************************
    // *82***************************************************************
    // *82 5340-Check-duplicate-row                                     *
    // *82                                                              *
    // *82 verifying if the key fields - table id, hipaa code, hipaa    *
    // *82 version number, network indicator, effective and cancellation*
    // *82 date and status indicator are duplicated in the table.       *
    // *82                                                              *
    // *82***************************************************************
    // Added variable to get the program context in place.
    D5427bhiCtx programCtx = methodIn.getD5427bhiCtx();
    // Added variable to get the output context in place.
    CheckDuplicateRowOutCtx methodOut = methodIn.getCheckDuplicateRowOutCtx();
    //  cobolCode::IF BHI-REQ-ROW-ACT ( WS-SUB ) = 'A'
    //  LITERAL_A = 'A'
    if (methodIn.getBhiReqRowAct(methodIn.getSub() - 1)[0] == 'A') {
      //  cobolCode::MOVE WS-STS-ACTIVE TO DBHS-STS-CD
      methodOut.setDbhsStsCd(methodOut.getStsActive());
      //  cobolCode::MOVE DBHS-SLOT-TBL-ID TO WS-HCA-TABLES
      methodOut.setHcaTables(methodOut.getDbhsSlotTblId());
      //  cobolCode::IF HCA-TABLES
      if (methodOut.isHcaTables1()) {
        //  cobolCode::SELECT 'Y' FROM BEN_HIPAA_SRVC WHERE SLOT_TBL_ID = ? AND HIPAA_CD = ? AND
        // HIPAA_VER_NBR = ? AND NTWK_TYP_CD = ? AND SRVC_CD = ? AND EFF_DT = ? AND PL_OF_SRVC_CD =
        // ? AND CANC_DT = ? AND STS_CD = ?
        d5427bhiRepository.selectBenHipaaSrvc1(
            programCtx.getSqlca(), methodIn.getDclbenHipaaSrvc(), methodOut.getVariables());
      }
      //  cobolCode::ELSE
      else {
        //  cobolCode::SELECT 'Y' FROM BEN_HIPAA_SRVC WHERE SLOT_TBL_ID = ? AND HIPAA_CD = ? AND
        // HIPAA_VER_NBR = ? AND NTWK_TYP_CD = ? AND SRVC_CD = ? AND EFF_DT = ? AND CANC_DT = ? AND
        // STS_CD = ?
        d5427bhiRepository.selectBenHipaaSrvc2(
            programCtx.getSqlca(), methodIn.getDclbenHipaaSrvc(), methodOut.getVariables());
      }
      //  cobolCode::MOVE SQLCODE TO WS-SQLCODE DSM-SQLCODE
      methodOut.setSqlcode_Ws(methodOut.getSqlcode());
      methodOut.setDsmSqlcode(methodOut.getSqlcode());
      //  cobolCode::EVALUATE TRUE
      if (methodOut.isSqlcodeOk() || methodOut.isSqlcodeMultRows()) {
        //  cobolCode::SET DSM-DB2-ERROR TO TRUE
        methodOut.setDsmDb2ErrorTrue();

        //  cobolCode::SET BHI-INV-ROW-ERROR TO TRUE
        methodOut.setBhiInvRowErrorTrue();

        //  cobolCode::SET BHI-ROW-ALREADY-EXIST ( WS-SUB ) TO TRUE
        methodOut.setBhiRowAlreadyExistTrue(methodIn.getSub() - 1);

        //  cobolCode::MOVE 'BEN_HIPAA_SRVC' TO BHI-DB2-TABLE
        methodOut.setBhiDb2Table(CONSTANTS.LITERAL_BEN_HIPAA_SRVC_B16_);
        //  cobolCode::MOVE 'SELECT' TO BHI-DB2-ACTION
        methodOut.setBhiDb2Action(CONSTANTS.LITERAL_SELECT_B2_);
        //  cobolCode::MOVE '5340-CHECK-DUPLICATE-ROW1' TO BHI-DB2-PARA-NM
        methodOut.setBhiDb2ParaNm(CONSTANTS.LITERAL_5340_MN3_CHECKDUPLICATEROW1_B5_);
        //  cobolCode::PERFORM 7777-MOVES-FOR-ERROR-LOG
        movesForErrorLog(
            programCtx.getMovesForErrorLogInCtx()); /*7777-MOVES-FOR-ERROR-LOG SECTION*/
        if (programCtx.isProgramEnded()) {
          return methodOut;
        }
      } else if (methodOut.isSqlcodeNotFound()) {;
      } else if (methodOut.isSqlcodeInvalidDate()) {
        //  cobolCode::SET DSM-DB2-ERROR TO TRUE
        methodOut.setDsmDb2ErrorTrue();

        //  cobolCode::SET BHI-INV-ROW-ERROR TO TRUE
        methodOut.setBhiInvRowErrorTrue();

        //  cobolCode::SET BHI-ROW-BAD-DATE ( WS-SUB ) TO TRUE
        methodOut.setBhiRowBadDateTrue(methodIn.getSub() - 1);

        //  cobolCode::MOVE 'BEN_HIPAA_SRVC' TO BHI-DB2-TABLE
        methodOut.setBhiDb2Table(CONSTANTS.LITERAL_BEN_HIPAA_SRVC_B16_);
        //  cobolCode::MOVE 'SELECT' TO BHI-DB2-ACTION
        methodOut.setBhiDb2Action(CONSTANTS.LITERAL_SELECT_B2_);
        //  cobolCode::MOVE '5340-CHECK-DUPLICATE-ROW2' TO BHI-DB2-PARA-NM
        methodOut.setBhiDb2ParaNm(CONSTANTS.LITERAL_5340_MN3_CHECKDUPLICATEROW2_B5_);
        //  cobolCode::PERFORM 7777-MOVES-FOR-ERROR-LOG
        movesForErrorLog(
            programCtx.getMovesForErrorLogInCtx()); /*7777-MOVES-FOR-ERROR-LOG SECTION*/
        if (programCtx.isProgramEnded()) {
          return methodOut;
        }
      } else {
        //  cobolCode::SET DSM-DB2-ERROR TO TRUE
        methodOut.setDsmDb2ErrorTrue();

        //  cobolCode::SET BHI-INV-ROW-ERROR TO TRUE
        methodOut.setBhiInvRowErrorTrue();

        //  cobolCode::SET BHI-ROW-DB2-ERR ( WS-SUB ) TO TRUE
        methodOut.setBhiRowDb2ErrTrue(methodIn.getSub() - 1);

        //  cobolCode::MOVE 'BEN_HIPAA_SRVC' TO BHI-DB2-TABLE
        methodOut.setBhiDb2Table(CONSTANTS.LITERAL_BEN_HIPAA_SRVC_B16_);
        //  cobolCode::MOVE 'SELECT' TO BHI-DB2-ACTION
        methodOut.setBhiDb2Action(CONSTANTS.LITERAL_SELECT_B2_);
        //  cobolCode::MOVE '5340-CHECK-DUPLICATE-ROW3' TO BHI-DB2-PARA-NM
        methodOut.setBhiDb2ParaNm(CONSTANTS.LITERAL_5340_MN3_CHECKDUPLICATEROW3_B5_);
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
   * checkOverlapDates This method is derived from COBOL Paragraph - 5350-CHECK-OVERLAP-DATES
   * SECTION COBOL Cyclomatic complexity - 9 Input :
   *
   * <p>- stsActive COBOL Name: WS-STS-ACTIVE - bhiReqRowHipaaCd COBOL Name: BHI-REQ-ROW-HIPAA-CD -
   * sub COBOL Name: WS-SUB - bhiReqRowSlotTblId COBOL Name: BHI-REQ-ROW-SLOT-TBL-ID - bhiReqRowAct
   * COBOL Name: BHI-REQ-ROW-ACT
   *
   * <p>Output :
   *
   * <p>- dbhsStsCd COBOL Name: DBHS-STS-CD - stsActive COBOL Name: WS-STS-ACTIVE - hcaTables COBOL
   * Name: WS-HCA-TABLES - bhiReqRowSlotTblId COBOL Name: BHI-REQ-ROW-SLOT-TBL-ID
   *
   * @throws CFException
   */
  @Override
  public CheckOverlapDatesOutCtx checkOverlapDates(CheckOverlapDatesInCtx methodIn)
      throws Exception {

    // *81***************************************************************
    // *81 5350-Check-overlap-dates                                     *
    // *81 business function: verifying the overlap dates               *
    // *81                                                              *
    // *81***************************************************************
    // *82***************************************************************
    // *82 5350-check-overlap-dates                                     *
    // *82                                                              *
    // *82 verifying if the new effective date or cancellation date lays*
    // *82 between the effective date and cancellation date of an       *
    // *82 existing active row.                                         *
    // *82                                                              *
    // *82***************************************************************
    // Added variable to get the program context in place.
    D5427bhiCtx programCtx = methodIn.getD5427bhiCtx();
    // Added variable to get the output context in place.
    CheckOverlapDatesOutCtx methodOut = methodIn.getCheckOverlapDatesOutCtx();
    //  cobolCode::MOVE WS-STS-ACTIVE TO DBHS-STS-CD
    methodOut.setDbhsStsCd(methodOut.getStsActive());

    // *For update('u') - need to skip the current record (i.e.the record
    // *which is being updated) and verify the overlap dates among the
    // *key. if we dont skip, overlap will occur with the current record
    // *itself.
    //  cobolCode::IF BHI-REQ-ROW-HIPAA-CD ( WS-SUB ) = 'AF'
    //  LITERAL_AF = 'AF'
    if (compareChars(methodIn.getBhiReqRowHipaaCd(methodIn.getSub() - 1), CONSTANTS.LITERAL_AF)
        == 0) {
      // cobolCode::GO TO 5350-CHECK-AF
      return methodOut;
      // cobolCodeEnds::GO TO 5350-CHECK-AF
    }
    //  cobolCode::MOVE BHI-REQ-ROW-SLOT-TBL-ID ( WS-SUB ) TO WS-HCA-TABLES
    methodOut.setHcaTables(methodOut.getBhiReqRowSlotTblId(methodIn.getSub() - 1));
    //  cobolCode::IF HCA-TABLES
    if (methodOut.isHcaTables1()) {
      //  cobolCode::IF BHI-REQ-ROW-ACT ( WS-SUB ) = 'A'
      //  LITERAL_A = 'A'
      if (methodIn.getBhiReqRowAct(methodIn.getSub() - 1)[0] == 'A') {
        //  cobolCode::SELECT 'Y' FROM BEN_HIPAA_SRVC WHERE SLOT_TBL_ID = ? AND HIPAA_CD = ? AND
        // HIPAA_VER_NBR = ? AND NTWK_TYP_CD = ? AND STS_CD = ? AND PL_OF_SRVC_CD = ? AND ( ( EFF_DT
        // <= ? AND CANC_DT >= ? ) OR ( EFF_DT <= ? AND CANC_DT >= ? ) OR ( EFF_DT >= ? AND CANC_DT
        // <= ? ) )
        d5427bhiRepository.selectBenHipaaSrvc3(
            programCtx.getSqlca(), methodIn.getDclbenHipaaSrvc(), methodOut.getVariables());
      }
      //  cobolCode::ELSE
      else {
        //  cobolCode::SELECT 'Y' FROM BEN_HIPAA_SRVC WHERE SLOT_TBL_ID = ? AND HIPAA_CD = ? AND
        // HIPAA_VER_NBR = ? AND NTWK_TYP_CD = ? AND STS_CD = ? AND PL_OF_SRVC_CD = ? AND EFF_DT <>
        // ? AND ( ( EFF_DT >= ? AND EFF_DT <= ? ) OR ( CANC_DT >= ? AND CANC_DT <= ? ) )
        d5427bhiRepository.selectBenHipaaSrvc4(
            programCtx.getSqlca(), methodIn.getDclbenHipaaSrvc(), methodOut.getVariables());
      }
    }
    //  cobolCode::ELSE
    else {
      //  cobolCode::IF BHI-REQ-ROW-ACT ( WS-SUB ) = 'A'
      //  LITERAL_A = 'A'
      if (methodIn.getBhiReqRowAct(methodIn.getSub() - 1)[0] == 'A') {
        //  cobolCode::SELECT 'Y' FROM BEN_HIPAA_SRVC WHERE SLOT_TBL_ID = ? AND HIPAA_CD = ? AND
        // HIPAA_VER_NBR = ? AND NTWK_TYP_CD = ? AND STS_CD = ? AND ( ( EFF_DT <= ? AND CANC_DT >= ?
        // ) OR ( EFF_DT <= ? AND CANC_DT >= ? ) OR ( EFF_DT >= ? AND CANC_DT <= ? ) )
        d5427bhiRepository.selectBenHipaaSrvc5(
            programCtx.getSqlca(), methodIn.getDclbenHipaaSrvc(), methodOut.getVariables());
      }
      //  cobolCode::ELSE
      else {
        //  cobolCode::SELECT 'Y' FROM BEN_HIPAA_SRVC WHERE SLOT_TBL_ID = ? AND HIPAA_CD = ? AND
        // HIPAA_VER_NBR = ? AND NTWK_TYP_CD = ? AND STS_CD = ? AND EFF_DT <> ? AND ( ( EFF_DT >= ?
        // AND EFF_DT <= ? ) OR ( CANC_DT >= ? AND CANC_DT <= ? ) )
        d5427bhiRepository.selectBenHipaaSrvc6(
            programCtx.getSqlca(), methodIn.getDclbenHipaaSrvc(), methodOut.getVariables());
      }
    }
    // cobolCode::GO TO 5350-CONTINUE
    programCtx.setDoNotSkipCheckAf(false);
    return methodOut;
    // cobolCodeEnds::GO TO 5350-CONTINUE

  }
  /**
   * checkAf This method is derived from COBOL Paragraph - 5350-CHECK-AF COBOL Cyclomatic complexity
   * - 8 Input :
   *
   * <p>- bhiReqRowSlotTblId COBOL Name: BHI-REQ-ROW-SLOT-TBL-ID - bhiReqRowAct COBOL Name:
   * BHI-REQ-ROW-ACT - sub COBOL Name: WS-SUB
   *
   * <p>Output :
   *
   * <p>- hcaTables COBOL Name: WS-HCA-TABLES - bhiReqRowSlotTblId COBOL Name:
   * BHI-REQ-ROW-SLOT-TBL-ID
   *
   * @throws CFException
   */
  @Override
  public CheckAfOutCtx checkAf(CheckAfInCtx methodIn) throws Exception {
    // Added variable to get the program context in place.
    D5427bhiCtx programCtx = methodIn.getD5427bhiCtx();
    // Added variable to get the output context in place.
    CheckAfOutCtx methodOut = methodIn.getCheckAfOutCtx();
    //  cobolCode::MOVE BHI-REQ-ROW-SLOT-TBL-ID ( WS-SUB ) TO WS-HCA-TABLES
    methodOut.setHcaTables(methodOut.getBhiReqRowSlotTblId(methodIn.getSub() - 1));
    //  cobolCode::IF HCA-TABLES
    if (methodOut.isHcaTables1()) {
      //  cobolCode::IF BHI-REQ-ROW-ACT ( WS-SUB ) = 'A'
      //  LITERAL_A = 'A'
      if (methodIn.getBhiReqRowAct(methodIn.getSub() - 1)[0] == 'A') {
        //  cobolCode::SELECT 'Y' FROM BEN_HIPAA_SRVC WHERE SLOT_TBL_ID = ? AND HIPAA_CD = ? AND
        // HIPAA_VER_NBR = ? AND NTWK_TYP_CD = ? AND STS_CD = ? AND PL_OF_SRVC_CD = ? AND SRVC_CD =
        // ? AND ( ( EFF_DT <= ? AND CANC_DT >= ? ) OR ( EFF_DT <= ? AND CANC_DT >= ? ) OR ( EFF_DT
        // >= ? AND CANC_DT <= ? ) )
        d5427bhiRepository.selectBenHipaaSrvc7(
            programCtx.getSqlca(), methodIn.getDclbenHipaaSrvc(), methodOut.getVariables());
      }
      //  cobolCode::ELSE
      else {
        //  cobolCode::SELECT 'Y' FROM BEN_HIPAA_SRVC WHERE SLOT_TBL_ID = ? AND HIPAA_CD = ? AND
        // HIPAA_VER_NBR = ? AND NTWK_TYP_CD = ? AND STS_CD = ? AND PL_OF_SRVC_CD = ? AND SRVC_CD =
        // ? AND EFF_DT <> ? AND ( ( EFF_DT >= ? AND EFF_DT <= ? ) OR ( CANC_DT >= ? AND CANC_DT <=
        // ? ) )
        d5427bhiRepository.selectBenHipaaSrvc8(
            programCtx.getSqlca(), methodIn.getDclbenHipaaSrvc(), methodOut.getVariables());
      }
    }
    //  cobolCode::ELSE
    else {
      //  cobolCode::IF BHI-REQ-ROW-ACT ( WS-SUB ) = 'A'
      //  LITERAL_A = 'A'
      if (methodIn.getBhiReqRowAct(methodIn.getSub() - 1)[0] == 'A') {
        //  cobolCode::SELECT 'Y' FROM BEN_HIPAA_SRVC WHERE SLOT_TBL_ID = ? AND HIPAA_CD = ? AND
        // HIPAA_VER_NBR = ? AND NTWK_TYP_CD = ? AND STS_CD = ? AND SRVC_CD = ? AND ( ( EFF_DT <= ?
        // AND CANC_DT >= ? ) OR ( EFF_DT <= ? AND CANC_DT >= ? ) OR ( EFF_DT >= ? AND CANC_DT <= ?
        // ) )
        d5427bhiRepository.selectBenHipaaSrvc9(
            programCtx.getSqlca(), methodIn.getDclbenHipaaSrvc(), methodOut.getVariables());
      }
      //  cobolCode::ELSE
      else {
        //  cobolCode::SELECT 'Y' FROM BEN_HIPAA_SRVC WHERE SLOT_TBL_ID = ? AND HIPAA_CD = ? AND
        // HIPAA_VER_NBR = ? AND NTWK_TYP_CD = ? AND STS_CD = ? AND SRVC_CD = ? AND EFF_DT <> ? AND
        // ( ( EFF_DT >= ? AND EFF_DT <= ? ) OR ( CANC_DT >= ? AND CANC_DT <= ? ) )
        d5427bhiRepository.selectBenHipaaSrvc10(
            programCtx.getSqlca(), methodIn.getDclbenHipaaSrvc(), methodOut.getVariables());
      }
    }

    return methodOut;
  }
  /**
   * continue5350 This method is derived from COBOL Paragraph - 5350-CONTINUE COBOL Cyclomatic
   * complexity - 5 Input :
   *
   * <p>- sqlcode COBOL Name: SQLCODE
   *
   * <p>Output :
   *
   * <p>- sqlcode_Ws COBOL Name: WS-SQLCODE - dsmSqlcode COBOL Name: DSM-SQLCODE - sqlcode COBOL
   * Name: SQLCODE - dsmReturnCode COBOL Name: DSM-RETURN-CODE - bhiRetReasonCode COBOL Name:
   * BHI-RET-REASON-CODE - bhiRowReturnCd COBOL Name: BHI-ROW-RETURN-CD - bhiDb2Table COBOL Name:
   * BHI-DB2-TABLE - bhiDb2Action COBOL Name: BHI-DB2-ACTION - bhiDb2ParaNm COBOL Name:
   * BHI-DB2-PARA-NM
   *
   * @throws CFException
   */
  @Override
  public Continue5350OutCtx continue5350(Continue5350InCtx methodIn) throws Exception {
    // Added variable to get the program context in place.
    D5427bhiCtx programCtx = methodIn.getD5427bhiCtx();
    // Added variable to get the output context in place.
    Continue5350OutCtx methodOut = methodIn.getContinue5350OutCtx();
    //  cobolCode::MOVE SQLCODE TO WS-SQLCODE DSM-SQLCODE
    methodOut.setSqlcode_Ws(methodOut.getSqlcode());
    methodOut.setDsmSqlcode(methodOut.getSqlcode());
    //  cobolCode::EVALUATE TRUE
    if (methodOut.isSqlcodeOk() || methodOut.isSqlcodeMultRows()) {
      //  cobolCode::SET DSM-DB2-ERROR TO TRUE
      methodOut.setDsmDb2ErrorTrue();

      //  cobolCode::SET BHI-INV-ROW-ERROR TO TRUE
      methodOut.setBhiInvRowErrorTrue();

      //  cobolCode::SET BHI-ROW-DATES-OVERLAP ( WS-SUB ) TO TRUE
      methodOut.setBhiRowDatesOverlapTrue(methodIn.getSub() - 1);

      //  cobolCode::MOVE 'BEN_HIPAA_SRVC' TO BHI-DB2-TABLE
      methodOut.setBhiDb2Table(CONSTANTS.LITERAL_BEN_HIPAA_SRVC_B16_);
      //  cobolCode::MOVE 'SELECT' TO BHI-DB2-ACTION
      methodOut.setBhiDb2Action(CONSTANTS.LITERAL_SELECT_B2_);
      //  cobolCode::MOVE '5350-CHECK-OVERLAP-DATES1' TO BHI-DB2-PARA-NM
      methodOut.setBhiDb2ParaNm(CONSTANTS.LITERAL_5350_MN3_CHECKOVERLAPDATES1_B5_);
      //  cobolCode::PERFORM 7777-MOVES-FOR-ERROR-LOG
      movesForErrorLog(programCtx.getMovesForErrorLogInCtx()); /*7777-MOVES-FOR-ERROR-LOG SECTION*/
      if (programCtx.isProgramEnded()) {
        return methodOut;
      }
    } else if (methodOut.isSqlcodeNotFound()) {;
    } else {
      //  cobolCode::SET DSM-DB2-ERROR TO TRUE
      methodOut.setDsmDb2ErrorTrue();

      //  cobolCode::SET BHI-INV-ROW-ERROR TO TRUE
      methodOut.setBhiInvRowErrorTrue();

      //  cobolCode::SET BHI-ROW-DB2-ERR ( WS-SUB ) TO TRUE
      methodOut.setBhiRowDb2ErrTrue(methodIn.getSub() - 1);

      //  cobolCode::MOVE 'BEN_HIPAA_SRVC' TO BHI-DB2-TABLE
      methodOut.setBhiDb2Table(CONSTANTS.LITERAL_BEN_HIPAA_SRVC_B16_);
      //  cobolCode::MOVE 'SELECT' TO BHI-DB2-ACTION
      methodOut.setBhiDb2Action(CONSTANTS.LITERAL_SELECT_B2_);
      //  cobolCode::MOVE '5350-CHECK-OVERLAP-DATES2' TO BHI-DB2-PARA-NM
      methodOut.setBhiDb2ParaNm(CONSTANTS.LITERAL_5350_MN3_CHECKOVERLAPDATES2_B5_);
      //  cobolCode::PERFORM 7777-MOVES-FOR-ERROR-LOG
      movesForErrorLog(programCtx.getMovesForErrorLogInCtx()); /*7777-MOVES-FOR-ERROR-LOG SECTION*/
      if (programCtx.isProgramEnded()) {
        return methodOut;
      }
    }

    return methodOut;
  }
  /**
   * checkNetIdConflict This method is derived from COBOL Paragraph - 5360-CHECK-NET-ID-CONFLICT
   * SECTION COBOL Cyclomatic complexity - 11 Input :
   *
   * <p>- stsActive COBOL Name: WS-STS-ACTIVE - dbhsNtwkTypCd COBOL Name: DBHS-NTWK-TYP-CD - sqlcode
   * COBOL Name: SQLCODE
   *
   * <p>Output :
   *
   * <p>- dbhsStsCd COBOL Name: DBHS-STS-CD - stsActive COBOL Name: WS-STS-ACTIVE - sqlcode_Ws COBOL
   * Name: WS-SQLCODE - dsmSqlcode COBOL Name: DSM-SQLCODE - sqlcode COBOL Name: SQLCODE -
   * dsmReturnCode COBOL Name: DSM-RETURN-CODE - bhiRetReasonCode COBOL Name: BHI-RET-REASON-CODE -
   * bhiRowReturnCd COBOL Name: BHI-ROW-RETURN-CD - bhiDb2Table COBOL Name: BHI-DB2-TABLE -
   * bhiDb2Action COBOL Name: BHI-DB2-ACTION - bhiDb2ParaNm COBOL Name: BHI-DB2-PARA-NM
   *
   * @throws CFException
   */
  @Override
  public CheckNetIdConflictOutCtx checkNetIdConflict(CheckNetIdConflictInCtx methodIn)
      throws Exception {

    // *81***************************************************************
    // *81 5360-Check-net-id-conflict                                   *
    // *81 business function: verifying the net indicator conflict      *
    // *81                                                              *
    // *81***************************************************************
    // *82***************************************************************
    // *82 5360-check-net-id-conflict                                   *
    // *82                                                              *
    // *82 verifying the net indicator if it has conflict with other    *
    // *82 record among the same key in case of i/o with b.             *
    // *82                                                              *
    // *82***************************************************************
    // Added variable to get the program context in place.
    D5427bhiCtx programCtx = methodIn.getD5427bhiCtx();
    // Added variable to get the output context in place.
    CheckNetIdConflictOutCtx methodOut = methodIn.getCheckNetIdConflictOutCtx();
    //  cobolCode::MOVE WS-STS-ACTIVE TO DBHS-STS-CD
    methodOut.setDbhsStsCd(methodOut.getStsActive());

    // *Verifying if the key fields are duplicated in the table.
    //  cobolCode::IF DBHS-NTWK-TYP-CD = 'I' OR 'O'
    //  LITERAL_O = 'O'
    if (compareChars(methodIn.getDbhsNtwkTypCd(), CONSTANTS.LITERAL_I) == 0
        || compareChars(methodIn.getDbhsNtwkTypCd(), CONSTANTS.LITERAL_O) == 0) {
      //  cobolCode::SELECT 'Y' FROM BEN_HIPAA_SRVC WHERE SLOT_TBL_ID = ? AND HIPAA_CD = ? AND
      // HIPAA_VER_NBR = ? AND NTWK_TYP_CD = ? AND EFF_DT = ? AND CANC_DT = ? AND STS_CD = ?
      d5427bhiRepository.selectBenHipaaSrvc11(
          programCtx.getSqlca(), methodIn.getDclbenHipaaSrvc(), methodOut.getVariables());
    }
    //  cobolCode::ELSE
    else {
      //  cobolCode::IF DBHS-NTWK-TYP-CD = 'B'
      //  LITERAL_B = 'B'
      if (compareChars(methodIn.getDbhsNtwkTypCd(), CONSTANTS.LITERAL_B) == 0) {
        //  cobolCode::SELECT 'Y' FROM BEN_HIPAA_SRVC WHERE SLOT_TBL_ID = ? AND HIPAA_CD = ? AND
        // HIPAA_VER_NBR = ? AND NTWK_TYP_CD IN ( 'I' , 'O' ) AND EFF_DT = ? AND CANC_DT = ? AND
        // STS_CD = ?
        d5427bhiRepository.selectBenHipaaSrvc12(
            programCtx.getSqlca(), methodIn.getDclbenHipaaSrvc(), methodOut.getVariables());
      }
      //  cobolCode::ELSE
      else {
        // cobolCode::GO TO 5360-EXIT
        return methodOut;
        // cobolCodeEnds::GO TO 5360-EXIT
      }
    }
    //  cobolCode::MOVE SQLCODE TO WS-SQLCODE DSM-SQLCODE
    methodOut.setSqlcode_Ws(methodOut.getSqlcode());
    methodOut.setDsmSqlcode(methodOut.getSqlcode());
    //  cobolCode::EVALUATE TRUE
    if (methodOut.isSqlcodeOk() || methodOut.isSqlcodeMultRows()) {
      //  cobolCode::SET DSM-DB2-ERROR TO TRUE
      methodOut.setDsmDb2ErrorTrue();

      //  cobolCode::SET BHI-INV-ROW-ERROR TO TRUE
      methodOut.setBhiInvRowErrorTrue();

      //  cobolCode::SET BHI-ROW-NET-IND-CONFL ( WS-SUB ) TO TRUE
      methodOut.setBhiRowNetIndConflTrue(methodIn.getSub() - 1);

      //  cobolCode::MOVE 'BEN_HIPAA_SRVC' TO BHI-DB2-TABLE
      methodOut.setBhiDb2Table(CONSTANTS.LITERAL_BEN_HIPAA_SRVC_B16_);
      //  cobolCode::MOVE 'SELECT' TO BHI-DB2-ACTION
      methodOut.setBhiDb2Action(CONSTANTS.LITERAL_SELECT_B2_);
      //  cobolCode::MOVE '5360-CHECK-NET-ID-CONFLICT1' TO BHI-DB2-PARA-NM
      methodOut.setBhiDb2ParaNm(CONSTANTS.LITERAL_5360_MN4_CHECKNETIDCONFLICT1_B3_);
      //  cobolCode::PERFORM 7777-MOVES-FOR-ERROR-LOG
      movesForErrorLog(programCtx.getMovesForErrorLogInCtx()); /*7777-MOVES-FOR-ERROR-LOG SECTION*/
      if (programCtx.isProgramEnded()) {
        return methodOut;
      }
    } else if (methodOut.isSqlcodeNotFound()) {;
    } else if (methodOut.isSqlcodeInvalidDate()) {
      //  cobolCode::SET DSM-DB2-ERROR TO TRUE
      methodOut.setDsmDb2ErrorTrue();

      //  cobolCode::SET BHI-INV-ROW-ERROR TO TRUE
      methodOut.setBhiInvRowErrorTrue();

      //  cobolCode::SET BHI-ROW-BAD-DATE ( WS-SUB ) TO TRUE
      methodOut.setBhiRowBadDateTrue(methodIn.getSub() - 1);

      //  cobolCode::MOVE 'BEN_HIPAA_SRVC' TO BHI-DB2-TABLE
      methodOut.setBhiDb2Table(CONSTANTS.LITERAL_BEN_HIPAA_SRVC_B16_);
      //  cobolCode::MOVE 'SELECT' TO BHI-DB2-ACTION
      methodOut.setBhiDb2Action(CONSTANTS.LITERAL_SELECT_B2_);
      //  cobolCode::MOVE '5360-CHECK-NET-ID-CONFLICT2' TO BHI-DB2-PARA-NM
      methodOut.setBhiDb2ParaNm(CONSTANTS.LITERAL_5360_MN4_CHECKNETIDCONFLICT2_B3_);
      //  cobolCode::PERFORM 7777-MOVES-FOR-ERROR-LOG
      movesForErrorLog(programCtx.getMovesForErrorLogInCtx()); /*7777-MOVES-FOR-ERROR-LOG SECTION*/
      if (programCtx.isProgramEnded()) {
        return methodOut;
      }
    } else {
      //  cobolCode::SET DSM-DB2-ERROR TO TRUE
      methodOut.setDsmDb2ErrorTrue();

      //  cobolCode::SET BHI-INV-ROW-ERROR TO TRUE
      methodOut.setBhiInvRowErrorTrue();

      //  cobolCode::SET BHI-ROW-DB2-ERR ( WS-SUB ) TO TRUE
      methodOut.setBhiRowDb2ErrTrue(methodIn.getSub() - 1);

      //  cobolCode::MOVE 'BEN_HIPAA_SRVC' TO BHI-DB2-TABLE
      methodOut.setBhiDb2Table(CONSTANTS.LITERAL_BEN_HIPAA_SRVC_B16_);
      //  cobolCode::MOVE 'SELECT' TO BHI-DB2-ACTION
      methodOut.setBhiDb2Action(CONSTANTS.LITERAL_SELECT_B2_);
      //  cobolCode::MOVE '5360-CHECK-NET-ID-CONFLICT3' TO BHI-DB2-PARA-NM
      methodOut.setBhiDb2ParaNm(CONSTANTS.LITERAL_5360_MN4_CHECKNETIDCONFLICT3_B3_);
      //  cobolCode::PERFORM 7777-MOVES-FOR-ERROR-LOG
      movesForErrorLog(programCtx.getMovesForErrorLogInCtx()); /*7777-MOVES-FOR-ERROR-LOG SECTION*/
      if (programCtx.isProgramEnded()) {
        return methodOut;
      }
    }

    return methodOut;
  }
  /**
   * addRecord This method is derived from COBOL Paragraph - 5400-ADD-RECORD SECTION COBOL
   * Cyclomatic complexity - 9 Input :
   *
   * <p>- sqlcode COBOL Name: SQLCODE - dbhsLstUpdtDttm COBOL Name: DBHS-LST-UPDT-DTTM - retryCnt
   * COBOL Name: WS-RETRY-CNT
   *
   * <p>Output :
   *
   * <p>- sqlcode_Ws COBOL Name: WS-SQLCODE - dsmSqlcode COBOL Name: DSM-SQLCODE - sqlcode COBOL
   * Name: SQLCODE - bhiRowLstupdDttm COBOL Name: BHI-ROW-LSTUPD-DTTM - dbhsLstUpdtDttm COBOL Name:
   * DBHS-LST-UPDT-DTTM - retryCnt COBOL Name: WS-RETRY-CNT - dsmReturnCode COBOL Name:
   * DSM-RETURN-CODE - bhiRetReasonCode COBOL Name: BHI-RET-REASON-CODE - bhiRowReturnCd COBOL Name:
   * BHI-ROW-RETURN-CD - bhiDb2Table COBOL Name: BHI-DB2-TABLE - bhiDb2Action COBOL Name:
   * BHI-DB2-ACTION - bhiDb2ParaNm COBOL Name: BHI-DB2-PARA-NM
   *
   * @throws CFException
   */
  @Override
  public AddRecordOutCtx addRecord(AddRecordInCtx methodIn) throws Exception {

    // *81***************************************************************
    // *81 5400-Add-record                                              *
    // *81                                                              *
    // *81 business function: adding a new record when the control line *
    // *81                    is bhu and action indicator is 'a'        *
    // *81                                                              *
    // *81***************************************************************
    // *82***************************************************************
    // *82 5400-add-record                                              *
    // *82                                                              *
    // *82 adding a new row of record after validation successful       *
    // *82                                                              *
    // *82***************************************************************
    // Added variable to get the program context in place.
    D5427bhiCtx programCtx = methodIn.getD5427bhiCtx();
    programCtx.setLoopAddRecord(false);
    // Added variable to get the output context in place.
    AddRecordOutCtx methodOut = methodIn.getAddRecordOutCtx();
    //  cobolCode::SELECT CURRENT_TIMESTAMP FROM SYSIBM.SYSDUMMY1

    /** ***** SET :DBHS-LST-UPDT-DTTM = CURRENT_TIMESTAMP */
    methodOut.setSqlcode(0);
    methodOut.setDbhsLstUpdtDttm(db2Base.getCurrentTimestamp());
    //  cobolCode::INSERT INTO BEN_HIPAA_SRVC ( SLOT_TBL_ID , EFF_DT , CREAT_DTTM , SRVC_CD ,
    // PL_OF_SRVC_CD , CAUS_CD , BEN_LVL_CD , NTWK_TYP_CD , PROC_CD_RNG_BEGN_VAL ,
    // PROC_CD_RNG_END_VAL , PROC_CD_RNG_TYP_VAL , HIPAA_CD , IN_NTWK_CLSS_CD , TIER1_NTWK_CLSS_CD ,
    // CANC_DT , LST_UPDT_DTTM , LST_UPDT_USER_ID , STS_CD , PROV_ORG_TYP_CD ) VALUES ( ? , ? , ? ,
    // ? , ? , ? , ? , ? , ? , ? , ? , ? , ? , ? , ? , ? , ? , ? , ? )
    d5427bhiRepository.insertBenHipaaSrvc(programCtx.getSqlca(), methodOut.getDclbenHipaaSrvc());
    //  cobolCode::MOVE SQLCODE TO WS-SQLCODE DSM-SQLCODE
    methodOut.setSqlcode_Ws(methodOut.getSqlcode());
    methodOut.setDsmSqlcode(methodOut.getSqlcode());
    //  cobolCode::EVALUATE TRUE
    if (methodOut.isSqlcodeOk()) {
      //  cobolCode::PERFORM 5900-MOVE-REQ-TO-RETURN
      moveReqToReturn(programCtx.getMoveReqToReturnInCtx()); /*5900-MOVE-REQ-TO-RETURN SECTION*/
      if (programCtx.isProgramEnded()) {
        return methodOut;
      }
      //  cobolCode::MOVE DBHS-LST-UPDT-DTTM TO BHI-ROW-LSTUPD-DTTM ( WS-SUB )
      methodOut.setBhiRowLstupdDttm(methodIn.getSub() - 1, methodOut.getDbhsLstUpdtDttm());
    } else if (methodOut.isSqlcodeDeadlockNorb() || methodOut.isSqlcodeTimeOut()) {
      //  cobolCode::ADD 1 TO WS-RETRY-CNT
      methodOut.setRetryCnt(methodOut.getRetryCnt() + 1);
      //  cobolCode::IF WS-RETRY-CNT < 4
      if ((methodOut.getRetryCnt() < 4)) {
        // cobolCode::GO TO 5400-ADD-RECORD
        programCtx.setLoopAddRecord(true);
        return methodOut;
        // cobolCodeEnds::GO TO 5400-ADD-RECORD
      }
      //  cobolCode::ELSE
      else {
        //  cobolCode::SET DSM-DB2-ERROR TO TRUE
        methodOut.setDsmDb2ErrorTrue();

        //  cobolCode::SET BHI-INV-ROW-ERROR TO TRUE
        methodOut.setBhiInvRowErrorTrue();

        //  cobolCode::SET BHI-ROW-DEADLOCK ( WS-SUB ) TO TRUE
        methodOut.setBhiRowDeadlockTrue(methodIn.getSub() - 1);

        //  cobolCode::MOVE 'BEN_HIPAA_SRVC' TO BHI-DB2-TABLE
        methodOut.setBhiDb2Table(CONSTANTS.LITERAL_BEN_HIPAA_SRVC_B16_);
        //  cobolCode::MOVE 'INSERT' TO BHI-DB2-ACTION
        methodOut.setBhiDb2Action(CONSTANTS.LITERAL_INSERT_B2_);
        //  cobolCode::MOVE '5400-ADD-RECORD1' TO BHI-DB2-PARA-NM
        methodOut.setBhiDb2ParaNm(CONSTANTS.LITERAL_5400_MN2_ADDRECORD1_B14_);
        //  cobolCode::PERFORM 7777-MOVES-FOR-ERROR-LOG
        movesForErrorLog(
            programCtx.getMovesForErrorLogInCtx()); /*7777-MOVES-FOR-ERROR-LOG SECTION*/
        if (programCtx.isProgramEnded()) {
          return methodOut;
        }
      }
    } else if (methodOut.isSqlcodeDupViolation()) {
      //  cobolCode::SET DSM-DB2-ERROR TO TRUE
      methodOut.setDsmDb2ErrorTrue();

      //  cobolCode::SET BHI-INV-ROW-ERROR TO TRUE
      methodOut.setBhiInvRowErrorTrue();

      //  cobolCode::SET BHI-ROW-ALREADY-EXIST ( WS-SUB ) TO TRUE
      methodOut.setBhiRowAlreadyExistTrue(methodIn.getSub() - 1);

      //  cobolCode::MOVE 'BEN_HIPAA_SRVC' TO BHI-DB2-TABLE
      methodOut.setBhiDb2Table(CONSTANTS.LITERAL_BEN_HIPAA_SRVC_B16_);
      //  cobolCode::MOVE 'INSERT' TO BHI-DB2-ACTION
      methodOut.setBhiDb2Action(CONSTANTS.LITERAL_INSERT_B2_);
      //  cobolCode::MOVE '5400-ADD-RECORD2' TO BHI-DB2-PARA-NM
      methodOut.setBhiDb2ParaNm(CONSTANTS.LITERAL_5400_MN2_ADDRECORD2_B14_);
      //  cobolCode::PERFORM 7777-MOVES-FOR-ERROR-LOG
      movesForErrorLog(programCtx.getMovesForErrorLogInCtx()); /*7777-MOVES-FOR-ERROR-LOG SECTION*/
      if (programCtx.isProgramEnded()) {
        return methodOut;
      }
    } else {
      //  cobolCode::SET DSM-DB2-ERROR TO TRUE
      methodOut.setDsmDb2ErrorTrue();

      //  cobolCode::SET BHI-INV-ROW-ERROR TO TRUE
      methodOut.setBhiInvRowErrorTrue();

      //  cobolCode::SET BHI-ROW-DB2-ERR ( WS-SUB ) TO TRUE
      methodOut.setBhiRowDb2ErrTrue(methodIn.getSub() - 1);

      //  cobolCode::MOVE 'BEN_HIPAA_SRVC' TO BHI-DB2-TABLE
      methodOut.setBhiDb2Table(CONSTANTS.LITERAL_BEN_HIPAA_SRVC_B16_);
      //  cobolCode::MOVE 'INSERT' TO BHI-DB2-ACTION
      methodOut.setBhiDb2Action(CONSTANTS.LITERAL_INSERT_B2_);
      //  cobolCode::MOVE '5400-ADD-RECORD3' TO BHI-DB2-PARA-NM
      methodOut.setBhiDb2ParaNm(CONSTANTS.LITERAL_5400_MN2_ADDRECORD3_B14_);
      //  cobolCode::PERFORM 7777-MOVES-FOR-ERROR-LOG
      movesForErrorLog(programCtx.getMovesForErrorLogInCtx()); /*7777-MOVES-FOR-ERROR-LOG SECTION*/
      if (programCtx.isProgramEnded()) {
        return methodOut;
      }
    }

    return methodOut;
  }
  /**
   * updateRecord This method is derived from COBOL Paragraph - 5500-UPDATE-RECORD SECTION COBOL
   * Cyclomatic complexity - 9 Input :
   *
   * <p>- stsActive COBOL Name: WS-STS-ACTIVE - sqlcode COBOL Name: SQLCODE - dbhsLstUpdtDttm COBOL
   * Name: DBHS-LST-UPDT-DTTM - retryCnt COBOL Name: WS-RETRY-CNT
   *
   * <p>Output :
   *
   * <p>- dbhsStsCd COBOL Name: DBHS-STS-CD - stsActive COBOL Name: WS-STS-ACTIVE - sqlcode_Ws COBOL
   * Name: WS-SQLCODE - dsmSqlcode COBOL Name: DSM-SQLCODE - sqlcode COBOL Name: SQLCODE -
   * bhiRowLstupdDttm COBOL Name: BHI-ROW-LSTUPD-DTTM - dbhsLstUpdtDttm COBOL Name:
   * DBHS-LST-UPDT-DTTM - retryCnt COBOL Name: WS-RETRY-CNT - dsmReturnCode COBOL Name:
   * DSM-RETURN-CODE - bhiRetReasonCode COBOL Name: BHI-RET-REASON-CODE - bhiRowReturnCd COBOL Name:
   * BHI-ROW-RETURN-CD - bhiDb2Table COBOL Name: BHI-DB2-TABLE - bhiDb2Action COBOL Name:
   * BHI-DB2-ACTION - bhiDb2ParaNm COBOL Name: BHI-DB2-PARA-NM
   *
   * @throws CFException
   */
  @Override
  public UpdateRecordOutCtx updateRecord(UpdateRecordInCtx methodIn) throws Exception {

    // *81***************************************************************
    // *81 5500-Update-record                                           *
    // *81                                                              *
    // *81 business function: updating the record when the control line *
    // *81                    is bhu and action indicator is 'u'        *
    // *81                                                              *
    // *81***************************************************************
    // *82***************************************************************
    // *82 5500-update-record                                           *
    // *82                                                              *
    // *82 update the ben_hipaa_srvc table based on the key fields      *
    // *82***************************************************************
    // Added variable to get the program context in place.
    D5427bhiCtx programCtx = methodIn.getD5427bhiCtx();
    programCtx.setLoopUpdateRecord(false);
    // Added variable to get the output context in place.
    UpdateRecordOutCtx methodOut = methodIn.getUpdateRecordOutCtx();
    //  cobolCode::MOVE WS-STS-ACTIVE TO DBHS-STS-CD
    methodOut.setDbhsStsCd(methodOut.getStsActive());
    //  cobolCode::SELECT CURRENT_TIMESTAMP FROM SYSIBM.SYSDUMMY1

    /** ***** SET :DBHS-LST-UPDT-DTTM = CURRENT_TIMESTAMP */
    methodOut.setSqlcode(0);
    methodOut.setDbhsLstUpdtDttm(db2Base.getCurrentTimestamp());
    //  cobolCode::UPDATE BEN_HIPAA_SRVC SET SRVC_CD = ? , PL_OF_SRVC_CD = ? , CAUS_CD = ? ,
    // BEN_LVL_CD = ? , PROC_CD_RNG_BEGN_VAL = ? , PROC_CD_RNG_END_VAL = ? , PROC_CD_RNG_TYP_VAL = ?
    // , IN_NTWK_CLSS_CD = ? , TIER1_NTWK_CLSS_CD = ? , PROV_ORG_TYP_CD = ? , CANC_DT = ? ,
    // LST_UPDT_DTTM = ? , LST_UPDT_USER_ID = ? WHERE SLOT_TBL_ID = ? AND HIPAA_VER_NBR = ? AND
    // HIPAA_CD = ? AND NTWK_TYP_CD = ? AND STS_CD = ? AND EFF_DT = ?
    d5427bhiRepository.updateBenHipaaSrvc1(programCtx.getSqlca(), methodOut.getDclbenHipaaSrvc());
    //  cobolCode::MOVE SQLCODE TO WS-SQLCODE DSM-SQLCODE
    methodOut.setSqlcode_Ws(methodOut.getSqlcode());
    methodOut.setDsmSqlcode(methodOut.getSqlcode());
    //  cobolCode::EVALUATE TRUE
    if (methodOut.isSqlcodeOk()) {
      //  cobolCode::PERFORM 5900-MOVE-REQ-TO-RETURN
      moveReqToReturn(programCtx.getMoveReqToReturnInCtx()); /*5900-MOVE-REQ-TO-RETURN SECTION*/
      if (programCtx.isProgramEnded()) {
        return methodOut;
      }
      //  cobolCode::MOVE DBHS-LST-UPDT-DTTM TO BHI-ROW-LSTUPD-DTTM ( WS-SUB )
      methodOut.setBhiRowLstupdDttm(methodIn.getSub() - 1, methodOut.getDbhsLstUpdtDttm());
    } else if (methodOut.isSqlcodeDeadlockNorb() || methodOut.isSqlcodeTimeOut()) {
      //  cobolCode::ADD 1 TO WS-RETRY-CNT
      methodOut.setRetryCnt(methodOut.getRetryCnt() + 1);
      //  cobolCode::IF WS-RETRY-CNT < 4
      if ((methodOut.getRetryCnt() < 4)) {
        // cobolCode::GO TO 5500-UPDATE-RECORD
        programCtx.setLoopUpdateRecord(true);
        return methodOut;
        // cobolCodeEnds::GO TO 5500-UPDATE-RECORD
      }
      //  cobolCode::ELSE
      else {
        //  cobolCode::SET DSM-DB2-ERROR TO TRUE
        methodOut.setDsmDb2ErrorTrue();

        //  cobolCode::SET BHI-INV-ROW-ERROR TO TRUE
        methodOut.setBhiInvRowErrorTrue();

        //  cobolCode::SET BHI-ROW-DEADLOCK ( WS-SUB ) TO TRUE
        methodOut.setBhiRowDeadlockTrue(methodIn.getSub() - 1);

        //  cobolCode::MOVE 'BEN_HIPAA_SRVC' TO BHI-DB2-TABLE
        methodOut.setBhiDb2Table(CONSTANTS.LITERAL_BEN_HIPAA_SRVC_B16_);
        //  cobolCode::MOVE 'UPDATE' TO BHI-DB2-ACTION
        methodOut.setBhiDb2Action(CONSTANTS.LITERAL_UPDATE_B2_);
        //  cobolCode::MOVE '5500-UPDATE-RECORD1' TO BHI-DB2-PARA-NM
        methodOut.setBhiDb2ParaNm(CONSTANTS.LITERAL_5500_MN2_UPDATERECORD1_B11_);
        //  cobolCode::PERFORM 7777-MOVES-FOR-ERROR-LOG
        movesForErrorLog(
            programCtx.getMovesForErrorLogInCtx()); /*7777-MOVES-FOR-ERROR-LOG SECTION*/
        if (programCtx.isProgramEnded()) {
          return methodOut;
        }
      }
    } else if (methodOut.isSqlcodeInvalidDate()) {
      //  cobolCode::SET DSM-DB2-ERROR TO TRUE
      methodOut.setDsmDb2ErrorTrue();

      //  cobolCode::SET BHI-INV-ROW-ERROR TO TRUE
      methodOut.setBhiInvRowErrorTrue();

      //  cobolCode::SET BHI-ROW-BAD-DATE ( WS-SUB ) TO TRUE
      methodOut.setBhiRowBadDateTrue(methodIn.getSub() - 1);

      //  cobolCode::MOVE 'BEN_HIPAA_SRVC' TO BHI-DB2-TABLE
      methodOut.setBhiDb2Table(CONSTANTS.LITERAL_BEN_HIPAA_SRVC_B16_);
      //  cobolCode::MOVE 'SELECT' TO BHI-DB2-ACTION
      methodOut.setBhiDb2Action(CONSTANTS.LITERAL_SELECT_B2_);
      //  cobolCode::MOVE '5500-UPDATE-RECORD2' TO BHI-DB2-PARA-NM
      methodOut.setBhiDb2ParaNm(CONSTANTS.LITERAL_5500_MN2_UPDATERECORD2_B11_);
      //  cobolCode::PERFORM 7777-MOVES-FOR-ERROR-LOG
      movesForErrorLog(programCtx.getMovesForErrorLogInCtx()); /*7777-MOVES-FOR-ERROR-LOG SECTION*/
      if (programCtx.isProgramEnded()) {
        return methodOut;
      }
    } else {
      //  cobolCode::SET DSM-DB2-ERROR TO TRUE
      methodOut.setDsmDb2ErrorTrue();

      //  cobolCode::SET BHI-INV-ROW-ERROR TO TRUE
      methodOut.setBhiInvRowErrorTrue();

      //  cobolCode::SET BHI-ROW-DB2-ERR ( WS-SUB ) TO TRUE
      methodOut.setBhiRowDb2ErrTrue(methodIn.getSub() - 1);

      //  cobolCode::MOVE 'BEN_HIPAA_SRVC' TO BHI-DB2-TABLE
      methodOut.setBhiDb2Table(CONSTANTS.LITERAL_BEN_HIPAA_SRVC_B16_);
      //  cobolCode::MOVE 'UPDATE' TO BHI-DB2-ACTION
      methodOut.setBhiDb2Action(CONSTANTS.LITERAL_UPDATE_B2_);
      //  cobolCode::MOVE '5500-UPDATE-RECORD3' TO BHI-DB2-PARA-NM
      methodOut.setBhiDb2ParaNm(CONSTANTS.LITERAL_5500_MN2_UPDATERECORD3_B11_);
      //  cobolCode::PERFORM 7777-MOVES-FOR-ERROR-LOG
      movesForErrorLog(programCtx.getMovesForErrorLogInCtx()); /*7777-MOVES-FOR-ERROR-LOG SECTION*/
      if (programCtx.isProgramEnded()) {
        return methodOut;
      }
    }

    return methodOut;
  }
  /**
   * moveRowToDclgen This method is derived from COBOL Paragraph - 5800-MOVE-ROW-TO-DCLGEN SECTION
   * COBOL Cyclomatic complexity - 1 Input :
   *
   * <p>- bhiReqRowSlotTblId COBOL Name: BHI-REQ-ROW-SLOT-TBL-ID - bhiReqRowHipaaVerNbr COBOL Name:
   * BHI-REQ-ROW-HIPAA-VER-NBR - bhiReqRowHipaaCd COBOL Name: BHI-REQ-ROW-HIPAA-CD - bhiReqRowNetId
   * COBOL Name: BHI-REQ-ROW-NET-ID - bhiReqRowEffDate COBOL Name: BHI-REQ-ROW-EFF-DATE -
   * bhiReqRowCancDt COBOL Name: BHI-REQ-ROW-CANC-DT - bhiReqRowSrvcCd COBOL Name:
   * BHI-REQ-ROW-SRVC-CD - bhiReqRowPlofsrvcCd COBOL Name: BHI-REQ-ROW-PLOFSRVC-CD - bhiReqRowCausCd
   * COBOL Name: BHI-REQ-ROW-CAUS-CD - bhiReqRowBenLvlCd COBOL Name: BHI-REQ-ROW-BEN-LVL-CD -
   * bhiReqRowProcFrom COBOL Name: BHI-REQ-ROW-PROC-FROM - bhiReqRowProcTo COBOL Name:
   * BHI-REQ-ROW-PROC-TO - bhiReqRowProcType COBOL Name: BHI-REQ-ROW-PROC-TYPE - bhiReqRowInn COBOL
   * Name: BHI-REQ-ROW-INN - bhiReqRowTier COBOL Name: BHI-REQ-ROW-TIER - bhiReqRowLstupdUsrid COBOL
   * Name: BHI-REQ-ROW-LSTUPD-USRID - bhiReqRowStsCd COBOL Name: BHI-REQ-ROW-STS-CD -
   * bhiReqRowProvOrgTypCd COBOL Name: BHI-REQ-ROW-PROV-ORG-TYP-CD
   *
   * <p>Output :
   *
   * <p>- dbhsSlotTblId COBOL Name: DBHS-SLOT-TBL-ID - bhiReqSlotTable COBOL Name:
   * BHI-REQ-SLOT-TABLE - bhiReqRowSlotTblId COBOL Name: BHI-REQ-ROW-SLOT-TBL-ID - dbhsHipaaVerNbr
   * COBOL Name: DBHS-HIPAA-VER-NBR - bhiReqRowHipaaVerNbr COBOL Name: BHI-REQ-ROW-HIPAA-VER-NBR -
   * dbhsHipaaCd COBOL Name: DBHS-HIPAA-CD - bhiReqRowHipaaCd COBOL Name: BHI-REQ-ROW-HIPAA-CD -
   * dbhsNtwkTypCd COBOL Name: DBHS-NTWK-TYP-CD - bhiReqRowNetId COBOL Name: BHI-REQ-ROW-NET-ID -
   * dbhsEffDt COBOL Name: DBHS-EFF-DT - bhiReqRowEffDate COBOL Name: BHI-REQ-ROW-EFF-DATE -
   * dbhsCancDt COBOL Name: DBHS-CANC-DT - bhiReqRowCancDt COBOL Name: BHI-REQ-ROW-CANC-DT -
   * dbhsSrvcCd COBOL Name: DBHS-SRVC-CD - bhiReqRowSrvcCd COBOL Name: BHI-REQ-ROW-SRVC-CD -
   * dbhsPlOfSrvcCd COBOL Name: DBHS-PL-OF-SRVC-CD - bhiReqRowPlofsrvcCd COBOL Name:
   * BHI-REQ-ROW-PLOFSRVC-CD - dbhsCausCd COBOL Name: DBHS-CAUS-CD - bhiReqRowCausCd COBOL Name:
   * BHI-REQ-ROW-CAUS-CD - dbhsBenLvlCd COBOL Name: DBHS-BEN-LVL-CD - bhiReqRowBenLvlCd COBOL Name:
   * BHI-REQ-ROW-BEN-LVL-CD - dbhsProcCdRngBegnVal COBOL Name: DBHS-PROC-CD-RNG-BEGN-VAL -
   * bhiReqRowProcFrom COBOL Name: BHI-REQ-ROW-PROC-FROM - dbhsProcCdRngEndVal COBOL Name:
   * DBHS-PROC-CD-RNG-END-VAL - bhiReqRowProcTo COBOL Name: BHI-REQ-ROW-PROC-TO -
   * dbhsProcCdRngTypVal COBOL Name: DBHS-PROC-CD-RNG-TYP-VAL - bhiReqRowProcType COBOL Name:
   * BHI-REQ-ROW-PROC-TYPE - dbhsInNtwkClssCd COBOL Name: DBHS-IN-NTWK-CLSS-CD - bhiReqRowInn COBOL
   * Name: BHI-REQ-ROW-INN - dbhsTier1NtwkClssCd COBOL Name: DBHS-TIER1-NTWK-CLSS-CD - bhiReqRowTier
   * COBOL Name: BHI-REQ-ROW-TIER - dbhsLstUpdtUserId COBOL Name: DBHS-LST-UPDT-USER-ID -
   * bhiReqRowLstupdUsrid COBOL Name: BHI-REQ-ROW-LSTUPD-USRID - dbhsStsCd COBOL Name: DBHS-STS-CD -
   * bhiReqRowStsCd COBOL Name: BHI-REQ-ROW-STS-CD - dbhsProvOrgTypCd COBOL Name:
   * DBHS-PROV-ORG-TYP-CD - bhiReqRowProvOrgTypCd COBOL Name: BHI-REQ-ROW-PROV-ORG-TYP-CD
   *
   * @throws CFException
   */
  @Override
  public MoveRowToDclgenOutCtx moveRowToDclgen(MoveRowToDclgenInCtx methodIn) throws Exception {

    // *81***************************************************************
    // *81 5800-Move-row-to-dclgen                                      *
    // *81                                                              *
    // *81 business function: moving the row values to dclgen variables *
    // *81                                                              *
    // *81***************************************************************
    // *82***************************************************************
    // *82 5800-move-row-to-dclgen                                      *
    // *82                                                              *
    // *82 move the row field values to dclgen variables for processing *
    // *82***************************************************************
    // Added variable to get the program context in place.
    D5427bhiCtx programCtx = methodIn.getD5427bhiCtx();
    // Added variable to get the output context in place.
    MoveRowToDclgenOutCtx methodOut = methodIn.getMoveRowToDclgenOutCtx();
    //  cobolCode::MOVE BHI-REQ-ROW-SLOT-TBL-ID ( WS-SUB ) TO DBHS-SLOT-TBL-ID BHI-REQ-SLOT-TABLE
    methodOut.setDbhsSlotTblId(methodOut.getBhiReqRowSlotTblId(methodIn.getSub() - 1));
    methodOut.setBhiReqSlotTable(methodOut.getBhiReqRowSlotTblId(methodIn.getSub() - 1));
    //  cobolCode::MOVE BHI-REQ-ROW-HIPAA-VER-NBR ( WS-SUB ) TO DBHS-HIPAA-VER-NBR
    methodOut.setDbhsHipaaVerNbr(methodOut.getBhiReqRowHipaaVerNbr(methodIn.getSub() - 1));
    //  cobolCode::MOVE BHI-REQ-ROW-HIPAA-CD ( WS-SUB ) TO DBHS-HIPAA-CD
    methodOut.setDbhsHipaaCd(methodOut.getBhiReqRowHipaaCd(methodIn.getSub() - 1));
    //  cobolCode::MOVE BHI-REQ-ROW-NET-ID ( WS-SUB ) TO DBHS-NTWK-TYP-CD
    methodOut.setDbhsNtwkTypCd(methodOut.getBhiReqRowNetId(methodIn.getSub() - 1));
    //  cobolCode::MOVE BHI-REQ-ROW-EFF-DATE ( WS-SUB ) TO DBHS-EFF-DT
    methodOut.setDbhsEffDt(methodOut.getBhiReqRowEffDate(methodIn.getSub() - 1));
    //  cobolCode::MOVE BHI-REQ-ROW-CANC-DT ( WS-SUB ) TO DBHS-CANC-DT
    methodOut.setDbhsCancDt(methodOut.getBhiReqRowCancDt(methodIn.getSub() - 1));
    //  cobolCode::MOVE BHI-REQ-ROW-SRVC-CD ( WS-SUB ) TO DBHS-SRVC-CD
    methodOut.setDbhsSrvcCd(methodOut.getBhiReqRowSrvcCd(methodIn.getSub() - 1));
    //  cobolCode::MOVE BHI-REQ-ROW-PLOFSRVC-CD ( WS-SUB ) TO DBHS-PL-OF-SRVC-CD
    methodOut.setDbhsPlOfSrvcCd(methodOut.getBhiReqRowPlofsrvcCd(methodIn.getSub() - 1));
    //  cobolCode::MOVE BHI-REQ-ROW-CAUS-CD ( WS-SUB ) TO DBHS-CAUS-CD
    methodOut.setDbhsCausCd(methodOut.getBhiReqRowCausCd(methodIn.getSub() - 1));
    //  cobolCode::MOVE BHI-REQ-ROW-BEN-LVL-CD ( WS-SUB ) TO DBHS-BEN-LVL-CD
    methodOut.setDbhsBenLvlCd(methodOut.getBhiReqRowBenLvlCd(methodIn.getSub() - 1));
    //  cobolCode::MOVE BHI-REQ-ROW-PROC-FROM ( WS-SUB ) TO DBHS-PROC-CD-RNG-BEGN-VAL
    methodOut.setDbhsProcCdRngBegnVal(methodOut.getBhiReqRowProcFrom(methodIn.getSub() - 1));
    //  cobolCode::MOVE BHI-REQ-ROW-PROC-TO ( WS-SUB ) TO DBHS-PROC-CD-RNG-END-VAL
    methodOut.setDbhsProcCdRngEndVal(methodOut.getBhiReqRowProcTo(methodIn.getSub() - 1));
    //  cobolCode::MOVE BHI-REQ-ROW-PROC-TYPE ( WS-SUB ) TO DBHS-PROC-CD-RNG-TYP-VAL
    methodOut.setDbhsProcCdRngTypVal(methodOut.getBhiReqRowProcType(methodIn.getSub() - 1));
    //  cobolCode::MOVE BHI-REQ-ROW-INN ( WS-SUB ) TO DBHS-IN-NTWK-CLSS-CD
    methodOut.setDbhsInNtwkClssCd(methodOut.getBhiReqRowInn(methodIn.getSub() - 1));
    //  cobolCode::MOVE BHI-REQ-ROW-TIER ( WS-SUB ) TO DBHS-TIER1-NTWK-CLSS-CD
    methodOut.setDbhsTier1NtwkClssCd(methodOut.getBhiReqRowTier(methodIn.getSub() - 1));
    //  cobolCode::MOVE BHI-REQ-ROW-LSTUPD-USRID ( WS-SUB ) TO DBHS-LST-UPDT-USER-ID
    methodOut.setDbhsLstUpdtUserId(
        pad(9, methodOut.getBhiReqRowLstupdUsrid(methodIn.getSub() - 1), SPACE_CHAR, RIGHT_PAD));
    //  cobolCode::MOVE BHI-REQ-ROW-STS-CD ( WS-SUB ) TO DBHS-STS-CD
    methodOut.setDbhsStsCd(methodOut.getBhiReqRowStsCd(methodIn.getSub() - 1));
    //  cobolCode::MOVE BHI-REQ-ROW-PROV-ORG-TYP-CD ( WS-SUB ) TO DBHS-PROV-ORG-TYP-CD
    methodOut.setDbhsProvOrgTypCd(methodOut.getBhiReqRowProvOrgTypCd(methodIn.getSub() - 1));

    return methodOut;
  }
  /**
   * moveReqToReturn This method is derived from COBOL Paragraph - 5900-MOVE-REQ-TO-RETURN SECTION
   * COBOL Cyclomatic complexity - 1 Input :
   *
   * <p>- bhiReqRowSlotTblId COBOL Name: BHI-REQ-ROW-SLOT-TBL-ID - bhiReqRowHipaaVerNbr COBOL Name:
   * BHI-REQ-ROW-HIPAA-VER-NBR - bhiReqRowHipaaCd COBOL Name: BHI-REQ-ROW-HIPAA-CD - bhiReqRowNetId
   * COBOL Name: BHI-REQ-ROW-NET-ID - bhiReqRowEffDate COBOL Name: BHI-REQ-ROW-EFF-DATE -
   * bhiReqRowCancDt COBOL Name: BHI-REQ-ROW-CANC-DT - bhiReqRowSrvcCd COBOL Name:
   * BHI-REQ-ROW-SRVC-CD - bhiReqRowPlofsrvcCd COBOL Name: BHI-REQ-ROW-PLOFSRVC-CD - bhiReqRowCausCd
   * COBOL Name: BHI-REQ-ROW-CAUS-CD - bhiReqRowBenLvlCd COBOL Name: BHI-REQ-ROW-BEN-LVL-CD -
   * bhiReqRowProcFrom COBOL Name: BHI-REQ-ROW-PROC-FROM - bhiReqRowProcTo COBOL Name:
   * BHI-REQ-ROW-PROC-TO - bhiReqRowProcType COBOL Name: BHI-REQ-ROW-PROC-TYPE - bhiReqRowInn COBOL
   * Name: BHI-REQ-ROW-INN - bhiReqRowTier COBOL Name: BHI-REQ-ROW-TIER - bhiReqRowLstupdUsrid COBOL
   * Name: BHI-REQ-ROW-LSTUPD-USRID - bhiReqRowStsCd COBOL Name: BHI-REQ-ROW-STS-CD -
   * bhiReqRowProvOrgTypCd COBOL Name: BHI-REQ-ROW-PROV-ORG-TYP-CD
   *
   * <p>Output :
   *
   * <p>- bhiRowSlotTblId COBOL Name: BHI-ROW-SLOT-TBL-ID - bhiReqRowSlotTblId COBOL Name:
   * BHI-REQ-ROW-SLOT-TBL-ID - bhiRowHipaaVerNbr COBOL Name: BHI-ROW-HIPAA-VER-NBR -
   * bhiReqRowHipaaVerNbr COBOL Name: BHI-REQ-ROW-HIPAA-VER-NBR - bhiRowHipaaCd COBOL Name:
   * BHI-ROW-HIPAA-CD - bhiReqRowHipaaCd COBOL Name: BHI-REQ-ROW-HIPAA-CD - bhiRowNetId COBOL Name:
   * BHI-ROW-NET-ID - bhiReqRowNetId COBOL Name: BHI-REQ-ROW-NET-ID - bhiRowEffDate COBOL Name:
   * BHI-ROW-EFF-DATE - bhiReqRowEffDate COBOL Name: BHI-REQ-ROW-EFF-DATE - bhiRowCancDt COBOL Name:
   * BHI-ROW-CANC-DT - bhiReqRowCancDt COBOL Name: BHI-REQ-ROW-CANC-DT - bhiRowSrvcCd COBOL Name:
   * BHI-ROW-SRVC-CD - bhiReqRowSrvcCd COBOL Name: BHI-REQ-ROW-SRVC-CD - bhiRowPlofsrvcCd COBOL
   * Name: BHI-ROW-PLOFSRVC-CD - bhiReqRowPlofsrvcCd COBOL Name: BHI-REQ-ROW-PLOFSRVC-CD -
   * bhiRowCausCd COBOL Name: BHI-ROW-CAUS-CD - bhiReqRowCausCd COBOL Name: BHI-REQ-ROW-CAUS-CD -
   * bhiRowBenLvlCd COBOL Name: BHI-ROW-BEN-LVL-CD - bhiReqRowBenLvlCd COBOL Name:
   * BHI-REQ-ROW-BEN-LVL-CD - bhiRowProcFrom COBOL Name: BHI-ROW-PROC-FROM - bhiReqRowProcFrom COBOL
   * Name: BHI-REQ-ROW-PROC-FROM - bhiRowProcTo COBOL Name: BHI-ROW-PROC-TO - bhiReqRowProcTo COBOL
   * Name: BHI-REQ-ROW-PROC-TO - bhiRowProcType COBOL Name: BHI-ROW-PROC-TYPE - bhiReqRowProcType
   * COBOL Name: BHI-REQ-ROW-PROC-TYPE - bhiRowInn COBOL Name: BHI-ROW-INN - bhiReqRowInn COBOL
   * Name: BHI-REQ-ROW-INN - bhiRowTier COBOL Name: BHI-ROW-TIER - bhiReqRowTier COBOL Name:
   * BHI-REQ-ROW-TIER - bhiRowLstupdUsrid COBOL Name: BHI-ROW-LSTUPD-USRID - bhiReqRowLstupdUsrid
   * COBOL Name: BHI-REQ-ROW-LSTUPD-USRID - bhiRowStsCd COBOL Name: BHI-ROW-STS-CD - bhiReqRowStsCd
   * COBOL Name: BHI-REQ-ROW-STS-CD - bhiRowProvOrgTypCd COBOL Name: BHI-ROW-PROV-ORG-TYP-CD -
   * bhiReqRowProvOrgTypCd COBOL Name: BHI-REQ-ROW-PROV-ORG-TYP-CD
   *
   * @throws CFException
   */
  @Override
  public MoveReqToReturnOutCtx moveReqToReturn(MoveReqToReturnInCtx methodIn) throws Exception {

    // *81***************************************************************
    // *81 5900-Move-req-to-return                                      *
    // *81                                                              *
    // *81 business function: populating the return field variables     *
    // *81                                                              *
    // *81***************************************************************
    // *82***************************************************************
    // *82 5900-move-req-to-return                                      *
    // *82                                                              *
    // *82 populating the return field variables from request variables *
    // *82                                                              *
    // *82***************************************************************
    // Added variable to get the program context in place.
    D5427bhiCtx programCtx = methodIn.getD5427bhiCtx();
    // Added variable to get the output context in place.
    MoveReqToReturnOutCtx methodOut = methodIn.getMoveReqToReturnOutCtx();
    //  cobolCode::MOVE BHI-REQ-ROW-SLOT-TBL-ID ( WS-SUB ) TO BHI-ROW-SLOT-TBL-ID ( WS-SUB )
    methodOut.setBhiRowSlotTblId(
        methodIn.getSub() - 1, methodOut.getBhiReqRowSlotTblId(methodIn.getSub() - 1));
    //  cobolCode::MOVE BHI-REQ-ROW-HIPAA-VER-NBR ( WS-SUB ) TO BHI-ROW-HIPAA-VER-NBR ( WS-SUB )
    methodOut.setBhiRowHipaaVerNbr(
        methodIn.getSub() - 1, methodOut.getBhiReqRowHipaaVerNbr(methodIn.getSub() - 1));
    //  cobolCode::MOVE BHI-REQ-ROW-HIPAA-CD ( WS-SUB ) TO BHI-ROW-HIPAA-CD ( WS-SUB )
    methodOut.setBhiRowHipaaCd(
        methodIn.getSub() - 1, methodOut.getBhiReqRowHipaaCd(methodIn.getSub() - 1));
    //  cobolCode::MOVE BHI-REQ-ROW-NET-ID ( WS-SUB ) TO BHI-ROW-NET-ID ( WS-SUB )
    methodOut.setBhiRowNetId(
        methodIn.getSub() - 1, methodOut.getBhiReqRowNetId(methodIn.getSub() - 1));
    //  cobolCode::MOVE BHI-REQ-ROW-EFF-DATE ( WS-SUB ) TO BHI-ROW-EFF-DATE ( WS-SUB )
    methodOut.setBhiRowEffDate(
        methodIn.getSub() - 1, methodOut.getBhiReqRowEffDate(methodIn.getSub() - 1));
    //  cobolCode::MOVE BHI-REQ-ROW-CANC-DT ( WS-SUB ) TO BHI-ROW-CANC-DT ( WS-SUB )
    methodOut.setBhiRowCancDt(
        methodIn.getSub() - 1, methodOut.getBhiReqRowCancDt(methodIn.getSub() - 1));
    //  cobolCode::MOVE BHI-REQ-ROW-SRVC-CD ( WS-SUB ) TO BHI-ROW-SRVC-CD ( WS-SUB )
    methodOut.setBhiRowSrvcCd(
        methodIn.getSub() - 1, methodOut.getBhiReqRowSrvcCd(methodIn.getSub() - 1));
    //  cobolCode::MOVE BHI-REQ-ROW-PLOFSRVC-CD ( WS-SUB ) TO BHI-ROW-PLOFSRVC-CD ( WS-SUB )
    methodOut.setBhiRowPlofsrvcCd(
        methodIn.getSub() - 1, methodOut.getBhiReqRowPlofsrvcCd(methodIn.getSub() - 1));
    //  cobolCode::MOVE BHI-REQ-ROW-CAUS-CD ( WS-SUB ) TO BHI-ROW-CAUS-CD ( WS-SUB )
    methodOut.setBhiRowCausCd(
        methodIn.getSub() - 1, methodOut.getBhiReqRowCausCd(methodIn.getSub() - 1));
    //  cobolCode::MOVE BHI-REQ-ROW-BEN-LVL-CD ( WS-SUB ) TO BHI-ROW-BEN-LVL-CD ( WS-SUB )
    methodOut.setBhiRowBenLvlCd(
        methodIn.getSub() - 1, methodOut.getBhiReqRowBenLvlCd(methodIn.getSub() - 1));
    //  cobolCode::MOVE BHI-REQ-ROW-PROC-FROM ( WS-SUB ) TO BHI-ROW-PROC-FROM ( WS-SUB )
    methodOut.setBhiRowProcFrom(
        methodIn.getSub() - 1, methodOut.getBhiReqRowProcFrom(methodIn.getSub() - 1));
    //  cobolCode::MOVE BHI-REQ-ROW-PROC-TO ( WS-SUB ) TO BHI-ROW-PROC-TO ( WS-SUB )
    methodOut.setBhiRowProcTo(
        methodIn.getSub() - 1, methodOut.getBhiReqRowProcTo(methodIn.getSub() - 1));
    //  cobolCode::MOVE BHI-REQ-ROW-PROC-TYPE ( WS-SUB ) TO BHI-ROW-PROC-TYPE ( WS-SUB )
    methodOut.setBhiRowProcType(
        methodIn.getSub() - 1, methodOut.getBhiReqRowProcType(methodIn.getSub() - 1));
    //  cobolCode::MOVE BHI-REQ-ROW-INN ( WS-SUB ) TO BHI-ROW-INN ( WS-SUB )
    methodOut.setBhiRowInn(methodIn.getSub() - 1, methodOut.getBhiReqRowInn(methodIn.getSub() - 1));
    //  cobolCode::MOVE BHI-REQ-ROW-TIER ( WS-SUB ) TO BHI-ROW-TIER ( WS-SUB )
    methodOut.setBhiRowTier(
        methodIn.getSub() - 1, methodOut.getBhiReqRowTier(methodIn.getSub() - 1));
    //  cobolCode::MOVE BHI-REQ-ROW-LSTUPD-USRID ( WS-SUB ) TO BHI-ROW-LSTUPD-USRID ( WS-SUB )
    methodOut.setBhiRowLstupdUsrid(
        methodIn.getSub() - 1, methodOut.getBhiReqRowLstupdUsrid(methodIn.getSub() - 1));
    //  cobolCode::MOVE BHI-REQ-ROW-STS-CD ( WS-SUB ) TO BHI-ROW-STS-CD ( WS-SUB )
    methodOut.setBhiRowStsCd(
        methodIn.getSub() - 1, methodOut.getBhiReqRowStsCd(methodIn.getSub() - 1));
    //  cobolCode::MOVE BHI-REQ-ROW-PROV-ORG-TYP-CD ( WS-SUB ) TO BHI-ROW-PROV-ORG-TYP-CD ( WS-SUB )
    methodOut.setBhiRowProvOrgTypCd(
        methodIn.getSub() - 1, methodOut.getBhiReqRowProvOrgTypCd(methodIn.getSub() - 1));

    return methodOut;
  }
  /**
   * movesForErrorLog This method is derived from COBOL Paragraph - 7777-MOVES-FOR-ERROR-LOG SECTION
   * COBOL Cyclomatic complexity - 1 Input :
   *
   * <p>- bhiCallingProgram COBOL Name: BHI-CALLING-PROGRAM - dsmPgmName COBOL Name: WS-DSM-PGM-NAME
   *
   * <p>Output :
   *
   * <p>- dsmErrClngPgmName COBOL Name: DSM-ERR-CLNG-PGM-NAME - bhiCallingProgram COBOL Name:
   * BHI-CALLING-PROGRAM - dsmErrPgmName COBOL Name: DSM-ERR-PGM-NAME - dsmPgmName COBOL Name:
   * WS-DSM-PGM-NAME
   *
   * @throws CFException
   */
  @Override
  public MovesForErrorLogOutCtx movesForErrorLog(MovesForErrorLogInCtx methodIn) throws Exception {

    // *81***************************************************************
    // *81 7777-Moves-for-error-log                                     *
    // *81                                                              *
    // *81 business function:                                           *
    // *81 populate data for error logging                              *
    // *81***************************************************************
    // *82***************************************************************
    // *82 7777-moves-for-error-log                                     *
    // *82                                                              *
    // *82 1. populate fields in vydsmara for error logging             *
    // *82 2. evaluate on sqlcode and then goback to calling pgm        *
    // *82                                                              *
    // *82***************************************************************
    // Added variable to get the program context in place.
    D5427bhiCtx programCtx = methodIn.getD5427bhiCtx();
    // Added variable to get the output context in place.
    MovesForErrorLogOutCtx methodOut = methodIn.getMovesForErrorLogOutCtx();
    //  cobolCode::MOVE BHI-CALLING-PROGRAM TO DSM-ERR-CLNG-PGM-NAME
    methodOut.setDsmErrClngPgmName(methodOut.getBhiCallingProgram());
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

    // ******************************************************************
    // *                    Change history log                          *
    // *                    ==================                          *
    // * release    name    description                                 *
    // * -------    ----    -----------                                 *
    // * relq1-12   rohit  >hpsm # pm10027476 tops modernization        *
    // *            kumar   clean-up warning messages.                  *
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
    D5427bhiCtx programCtx = methodIn.getD5427bhiCtx();
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
    D5427bhiCtx programCtx = (D5427bhiCtx) ctx;

    int len = params.length;
    if (len > 1 && params[1] != null) programCtx.getDfhcommareaGroup().set((Field) params[1]);
    if (len > 2 && params[2] != null) programCtx.getDsmCallArea().set((Field) params[2]);
    if (len > 3 && params[3] != null) programCtx.getDsmBhiCallArea().set((Field) params[3]);
    if (len > 4 && params[4] != null) programCtx.getBhiDataArea01().set((Field) params[4]);
    // invoke the process and return rc
    return process(programCtx);
  }

  public int call(ProgramContext ctx, Field... parameters) throws Exception {
    D5427bhiCtx programCtx = (D5427bhiCtx) ctx;
    for (int index = 0; index < parameters.length; index++) {
      switch (index) {
        case 1:
          if (parameters[index] != null) {
            if (parameters[index] instanceof DfhcommareaGroup) {
              programCtx.setDfhcommareaGroup((DfhcommareaGroup) parameters[index]);
            } else {
              programCtx.getDfhcommareaGroup().set(parameters[index]);
            }
          }

          break;
        case 2:
          if (parameters[index] != null) {
            if (parameters[index] instanceof DsmCallArea) {
              programCtx.setDsmCallArea((DsmCallArea) parameters[index]);
            } else {
              programCtx.getDsmCallArea().set(parameters[index]);
            }
          }

          break;
        case 3:
          if (parameters[index] != null) {
            if (parameters[index] instanceof DsmBhiCallArea) {
              programCtx.setDsmBhiCallArea((DsmBhiCallArea) parameters[index]);
            } else {
              programCtx.getDsmBhiCallArea().set(parameters[index]);
            }
          }

          break;
        case 4:
          if (parameters[index] != null) {
            if (parameters[index] instanceof BhiDataArea01) {
              programCtx.setBhiDataArea01((BhiDataArea01) parameters[index]);
            } else {
              programCtx.getBhiDataArea01().set(parameters[index]);
            }
          }

          break;
      }
    }
    return process(programCtx);
  }

  public void setFromC5427bhi(D5427bhiCtx programCtx, Object[] params) {
    int len = params.length;
    if (len > 0)
      if (params[0] instanceof Field)
        programCtx.getCicsSession().setString(((Field) params[0]).toCharArray());
      else programCtx.getCicsSession().setString((char[]) params[0]);
    if (len > 1)
      if (params[1] instanceof Field)
        programCtx.getCacheCommArea().setString(((Field) params[1]).toCharArray());
      else programCtx.getCacheCommArea().setString((char[]) params[1]);
  }
}
