package com.cloudframe.app.business.impl;
/*
 *00***************************************************************
 *00   licensed materials - property of united health group       *
 *00***************************************************************
 *10***************************************************************
 *10  program name       :  d5427tli.                             *
 *10***************************************************************
 *10  business function  :  fetch the slotting table number       *
 *10                        from the tli db2 table.               *
 *10                                                              *
 *10  designed by        :  n/a.                                  *
 *10  programmed by      :  kopal.                                *
 *10  date coded         :  oct 2010.                             *
 *10  frequency used     :  on-request.                           *
 *10  type               :  online.                               *
 *10***************************************************************
 *20***************************************************************
 *20  major program process:                                      *
 *20                                                              *
 *20  the purpose of new module is to query the tli               *
 *20    table to fetch the  slotting table number                 *
 *30***************************************************************
 *30  program change log:                                         *
 *30                                                              *
 *30  pr #       date               level#                        *
 *30  -----      -----              -------                       *
 *30  kopal      10/08/2010         sprf#4-33120. initial build.  *
 *30***************************************************************
 *30 tables and access types:                                     *
 *30                                                              *
 *30  name          type           access                         *
 *30  --------      ----           -------                        *
 *30 srvc_asgn      db2            read                           *
 *30***************************************************************
 *40***************************************************************
 *40 called modules                                               *
 *40 --------------                                               *
 *40 program            function            type                  *
 *40 -------            -------             ----                  *
 *40 none                 n/a                n/a                  *
 *40***************************************************************
 *50***************************************************************
 *50 return codes                                                 *
 *50 ------------                                                 *
 *50 sql codes for the db2 operation.                             *
 *50                                                              *
 *50   copybook   description                                     *
 *50   ----       --------------------------------------------- - *
 *50   vysqlcds   sql codes for the db2 operation.                *
 *60***************************************************************
 *60 files used                                                   *
 *60 ----------                                                   *
 *60 filename                mode              description        *
 *60 --------                ----              -----------        *
 *60 n/a                     n/a               n/a                *
 *60***************************************************************
 */

import com.cloudframe.app.business.D5427tli;
import com.cloudframe.app.common.CONSTANTS;
import com.cloudframe.app.common.CommonProcess;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.dto.ProgramContext;
import com.cloudframe.app.dto.d5427tli.*;
import com.cloudframe.app.dto.d5427tli.D5427tliCtx;
import com.cloudframe.app.dto.d5427tli.D5427tliCtx.*;
import com.cloudframe.app.dto.d5427tli.DsmCallArea;
import com.cloudframe.app.dto.d5427tli.TliDsmArea;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.repository.D5427tliRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("d5427tli")
public class D5427tliImpl extends CommonProcess implements D5427tli {

  Logger logger = LoggerFactory.getLogger(D5427tliImpl.class);

  @Value("${D5427TLI.dbQualifier:}")
  private String dbQualifier;

  @Autowired
  @Qualifier("d5427tliRepository")
  D5427tliRepository d5427tliRepository;

  @Override
  public int setParameter(D5427tliCtx programCtx, String dsmCallArea, String tliDsmArea)
      throws Exception {
    if (dsmCallArea != null)
      programCtx
          .getDsmCallArea()
          .setString(
              com.cloudframe.app.data.Field.getParm(dsmCallArea),
              new String(CONSTANTS.EBCDIC_ENCODING));
    if (tliDsmArea != null)
      programCtx
          .getTliDsmArea()
          .setString(
              com.cloudframe.app.data.Field.getParm(tliDsmArea),
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
  public int process(D5427tliCtx programCtx) throws Exception {
    try {
      setCodePage("1047");
      // Reset program ended flag
      programCtx.setProgramEnded(false);
      db2Base.reset("D5427TLI", dbQualifier, true /*use Dynamic SQL*/);
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
   * complexity - 2 Input :
   *
   * <p>- dsmReturnCode COBOL Name: DSM-RETURN-CODE - tliReqClngProg COBOL Name: TLI-REQ-CLNG-PROG -
   * dsmPgmName COBOL Name: WS-DSM-PGM-NAME
   *
   * <p>Output :
   *
   * <p>- dsmErrClngPgmName COBOL Name: DSM-ERR-CLNG-PGM-NAME - tliReqClngProg COBOL Name:
   * TLI-REQ-CLNG-PROG - dsmErrPgmName COBOL Name: DSM-ERR-PGM-NAME - dsmPgmName COBOL Name:
   * WS-DSM-PGM-NAME - dsmReturnCode COBOL Name: DSM-RETURN-CODE
   *
   * @throws CFException
   */
  @Override
  public MainlineOutCtx mainline(MainlineInCtx methodIn) throws Exception {
    // Added variable to get the program context in place.
    D5427tliCtx programCtx = methodIn.getD5427tliCtx();
    // Added variable to get the output context in place.
    MainlineOutCtx methodOut = methodIn.getMainlineOutCtx();
    //  cobolCode::PERFORM 1000-INITIALIZE
    initialize(programCtx); /*1000-INITIALIZE SECTION*/
    if (programCtx.isProgramEnded()) {
      return methodOut;
    }
    //  cobolCode::IF DSM-EDIT-ERROR
    if (methodIn.isDsmEditError()) {
      //  cobolCode::MOVE TLI-REQ-CLNG-PROG TO DSM-ERR-CLNG-PGM-NAME
      methodOut.setDsmErrClngPgmName(methodOut.getTliReqClngProg());
      //  cobolCode::MOVE WS-DSM-PGM-NAME TO DSM-ERR-PGM-NAME
      methodOut.setDsmErrPgmName(methodOut.getDsmPgmName());
    }
    //  cobolCode::ELSE
    else {
      //  cobolCode::INITIALIZE DSM-RETURN-CODE
      methodOut.setDsmReturnCode(0);
      //  cobolCode::PERFORM 2000-PROCESS-POL-PLAN-TLI
      processPolPlanTli(
          programCtx.getProcessPolPlanTliInCtx()); /*2000-PROCESS-POL-PLAN-TLI SECTION*/
      if (programCtx.isProgramEnded()) {
        return methodOut;
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
  public void exit(D5427tliCtx programCtx) throws Exception {
    //  cobolCode::GOBACK
    setNotLogged(false); // no need to log, it is a normal termination
    programCtx.setProgramEnded(true);
    return;
  }
  /**
   * initialize This method is derived from COBOL Paragraph - 1000-INITIALIZE SECTION COBOL
   * Cyclomatic complexity - 1 Input : None
   *
   * <p>Output :
   *
   * <p>- dclsrvcAsgn COBOL Name: DCLSRVC-ASGN - tliRetArea COBOL Name: TLI-RET-AREA - dsmLogArea
   * COBOL Name: DSM-LOG-AREA - slotIdFnd COBOL Name: SLOT-ID-FND
   *
   * @throws CFException
   */
  @Override
  public InitializeOutCtx initialize(D5427tliCtx programCtx) throws Exception {

    // *81***************************************************************
    // *81 1000-Initialize section.                                     *
    // *81 business function:                                           *
    // *81 initialization para.                                         *
    // *81***************************************************************
    // *82***************************************************************
    // *82 1000-initialize section.                                     *
    // *82 1. initialize all dclgen and working storage fields          *
    // *82 2. call the section for validation of request fields         *
    // *82***************************************************************
    // Added variable to get the output context in place.
    InitializeOutCtx methodOut = programCtx.getInitializeOutCtx();
    //  cobolCode::INITIALIZE DCLSRVC-ASGN
    methodOut.getDclsrvcAsgn().initialize();
    //  cobolCode::INITIALIZE TLI-RET-AREA
    methodOut.getTliRetArea().initialize();
    //  cobolCode::INITIALIZE DSM-LOG-AREA
    methodOut.getDsmLogArea().initialize();
    //  cobolCode::PERFORM 1500-REQUEST-FIELD-VALIDATION
    requestFieldValidation(
        programCtx.getRequestFieldValidationInCtx()); /*1500-REQUEST-FIELD-VALIDATION SECTION*/
    //  cobolCode::SET TLI-TABLE-NOT-FOUND TO TRUE
    methodOut.setTliTableNotFoundTrue();

    return methodOut;
  }
  /**
   * requestFieldValidation This method is derived from COBOL Paragraph -
   * 1500-REQUEST-FIELD-VALIDATION SECTION COBOL Cyclomatic complexity - 18 Input :
   *
   * <p>- dsmFuncCd COBOL Name: DSM-FUNC-CD - tliReqStartDt COBOL Name: TLI-REQ-START-DT -
   * tliReqPolNbr COBOL Name: TLI-REQ-POL-NBR - tliReqObligId COBOL Name: TLI-REQ-OBLIG-ID -
   * tliReqPlnNbr COBOL Name: TLI-REQ-PLN-NBR - tliReqShrArngCd COBOL Name: TLI-REQ-SHR-ARNG-CD
   *
   * <p>Output :
   *
   * <p>- dsmReturnCode COBOL Name: DSM-RETURN-CODE - dsmSqlErrorLevel COBOL Name:
   * DSM-SQL-ERROR-LEVEL - dsmEditErrorField COBOL Name: DSM-EDIT-ERROR-FIELD - dsmEditErrorValueTxt
   * COBOL Name: DSM-EDIT-ERROR-VALUE-TXT - dsmFuncCd COBOL Name: DSM-FUNC-CD - tliReqStartDt COBOL
   * Name: TLI-REQ-START-DT - tliReqPolNbr COBOL Name: TLI-REQ-POL-NBR - tliReqPlnNbr COBOL Name:
   * TLI-REQ-PLN-NBR - tliReqShrArngCd COBOL Name: TLI-REQ-SHR-ARNG-CD
   *
   * @throws CFException
   */
  @Override
  public RequestFieldValidationOutCtx requestFieldValidation(RequestFieldValidationInCtx methodIn)
      throws Exception {

    // *81***************************************************************
    // *81 1500-Request-field-validation section.                       *
    // *81 business function:                                           *
    // *81 validating all the request fields.                           *
    // *81***************************************************************
    // *82***************************************************************
    // *82 1500-request-field-validation section.                       *
    // *82 1.validate each request fields                               *
    // *82***************************************************************
    // Added variable to get the program context in place.
    D5427tliCtx programCtx = methodIn.getD5427tliCtx();
    // Added variable to get the output context in place.
    RequestFieldValidationOutCtx methodOut = methodIn.getRequestFieldValidationOutCtx();
    //  cobolCode::IF DSM-FUNC-CD = 1
    //  cobolCode::ELSE
    if ((methodOut.getDsmFuncCd() != 1)) {
      //  cobolCode::SET DSM-EDIT-ERROR TO TRUE
      methodOut.setDsmEditErrorTrue();

      //  cobolCode::SET DSM-PROCESS-ERROR TO TRUE
      methodOut.setDsmProcessErrorTrue();

      //  cobolCode::MOVE 'DSM-FUNC-CD' TO DSM-EDIT-ERROR-FIELD
      methodOut.setDsmEditErrorField(CONSTANTS.LITERAL_DSM_MN2_FUNCCD_B19_);
      //  cobolCode::MOVE DSM-FUNC-CD TO DSM-EDIT-ERROR-VALUE-TXT
      methodOut
          .getDsmEditErrorValueTxt()
          .setString(String.valueOf(methodOut.getDsmFuncCdString()).toCharArray());
      // cobolCode::GO TO 1500-EXIT
      return methodOut;
      // cobolCodeEnds::GO TO 1500-EXIT
    }
    //  cobolCode::IF TLI-REQ-START-DT = SPACES OR ZEROES OR LOW-VALUES OR HIGH-VALUES
    if ((allSpaces(methodOut.getTliReqStartDt()))
        || (allZeros(methodOut.getTliReqStartDt())) /*  ==  zeros*/
        || (checkLowValue(methodOut.getTliReqStartDt()))
        || (isHighValue(methodOut.getTliReqStartDt()))) {
      //  cobolCode::SET DSM-EDIT-ERROR TO TRUE
      methodOut.setDsmEditErrorTrue();

      //  cobolCode::MOVE 'TLI-REQ-START-DT' TO DSM-EDIT-ERROR-FIELD
      methodOut.setDsmEditErrorField(CONSTANTS.LITERAL_TLI_MN3_REQSTARTDT_B14_);
      //  cobolCode::MOVE TLI-REQ-START-DT TO DSM-EDIT-ERROR-VALUE-TXT
      methodOut.getDsmEditErrorValueTxt().setString(methodOut.getTliReqStartDt());
      // cobolCode::GO TO 1500-EXIT
      return methodOut;
      // cobolCodeEnds::GO TO 1500-EXIT
    }
    //  cobolCode::IF TLI-REQ-POL-NBR = SPACES OR ZEROES OR LOW-VALUES OR HIGH-VALUES
    if ((allSpaces(methodOut.getTliReqPolNbr()))
        || (allZeros(methodOut.getTliReqPolNbr())) /*  ==  zeros*/
        || (checkLowValue(methodOut.getTliReqPolNbr()))
        || (isHighValue(methodOut.getTliReqPolNbr()))) {
      //  cobolCode::IF TLI-REQ-OBLIG-ID = SPACES OR ZEROES OR LOW-VALUES OR HIGH-VALUES
      if ((allSpaces(methodIn.getTliReqObligId()))
          || (allZeros(methodIn.getTliReqObligId())) /*  ==  zeros*/
          || (checkLowValue(methodIn.getTliReqObligId()))
          || (isHighValue(methodIn.getTliReqObligId()))) {
        //  cobolCode::SET DSM-EDIT-ERROR TO TRUE
        methodOut.setDsmEditErrorTrue();

        //  cobolCode::MOVE 'POL-NBR/OBLIG-ID' TO DSM-EDIT-ERROR-FIELD
        methodOut.setDsmEditErrorField(CONSTANTS.LITERAL_POL_MN2_NBR_SL_OBLIGID_B14_);
        //  cobolCode::MOVE TLI-REQ-POL-NBR TO DSM-EDIT-ERROR-VALUE-TXT
        methodOut.getDsmEditErrorValueTxt().setString(methodOut.getTliReqPolNbr());
        // cobolCode::GO TO 1500-EXIT
        return methodOut;
        // cobolCodeEnds::GO TO 1500-EXIT
      }
    }
    //  cobolCode::IF TLI-REQ-PLN-NBR = LOW-VALUES OR HIGH-VALUES
    if ((checkLowValue(methodOut.getTliReqPlnNbr()))
        || (isHighValue(methodOut.getTliReqPlnNbr()))) {
      //  cobolCode::MOVE SPACES TO TLI-REQ-PLN-NBR
      methodOut.setTliReqPlnNbr(CONSTANTS.SPACE_4);
    }
    //  cobolCode::IF TLI-REQ-SHR-ARNG-CD = LOW-VALUES OR HIGH-VALUES
    if ((checkLowValue(methodOut.getTliReqShrArngCd()))
        || (isHighValue(methodOut.getTliReqShrArngCd()))) {
      //  cobolCode::MOVE SPACES TO TLI-REQ-SHR-ARNG-CD
      methodOut.setTliReqShrArngCd(CONSTANTS.SPACE_2);
    }

    return methodOut;
  }
  /**
   * moveReqToDclgen This method is derived from COBOL Paragraph - 1600-MOVE-REQ-TO-DCLGEN SECTION
   * COBOL Cyclomatic complexity - 1 Input :
   *
   * <p>- tliReqPolNbr COBOL Name: TLI-REQ-POL-NBR - tliReqPlnNbr COBOL Name: TLI-REQ-PLN-NBR -
   * tliReqObligId COBOL Name: TLI-REQ-OBLIG-ID - tliReqShrArngCd COBOL Name: TLI-REQ-SHR-ARNG-CD -
   * tliReqStartDt COBOL Name: TLI-REQ-START-DT
   *
   * <p>Output :
   *
   * <p>- hdrPolNbr COBOL Name: HDR-POL-NBR - tliReqPolNbr COBOL Name: TLI-REQ-POL-NBR - hdrPlnNbr
   * COBOL Name: HDR-PLN-NBR - tliReqPlnNbr COBOL Name: TLI-REQ-PLN-NBR - hdrObligId COBOL Name:
   * HDR-OBLIG-ID - tliReqObligId COBOL Name: TLI-REQ-OBLIG-ID - hdrShrArngCd COBOL Name:
   * HDR-SHR-ARNG-CD - tliReqShrArngCd COBOL Name: TLI-REQ-SHR-ARNG-CD - hdrProcDt COBOL Name:
   * HDR-PROC-DT - hdrCancDt COBOL Name: HDR-CANC-DT - tliReqStartDt COBOL Name: TLI-REQ-START-DT
   *
   * @throws CFException
   */
  @Override
  public MoveReqToDclgenOutCtx moveReqToDclgen(MoveReqToDclgenInCtx methodIn) throws Exception {

    // *81***************************************************************
    // *81 1600-Move-req-to-dclgen section.                             *
    // *81 business function:                                           *
    // *81 populate the dclgen fields                                   *
    // *81***************************************************************
    // *81 1600-move-req-to-dclgen section.                             *
    // *81 1.populate the dclgen variables from the request copybook    *
    // *81***************************************************************
    // Added variable to get the program context in place.
    D5427tliCtx programCtx = methodIn.getD5427tliCtx();
    // Added variable to get the output context in place.
    MoveReqToDclgenOutCtx methodOut = methodIn.getMoveReqToDclgenOutCtx();
    //  cobolCode::MOVE TLI-REQ-POL-NBR TO HDR-POL-NBR
    methodOut.setHdrPolNbr(methodOut.getTliReqPolNbr());
    //  cobolCode::MOVE TLI-REQ-PLN-NBR TO HDR-PLN-NBR
    methodOut.setHdrPlnNbr(methodOut.getTliReqPlnNbr());
    //  cobolCode::MOVE TLI-REQ-OBLIG-ID TO HDR-OBLIG-ID
    methodOut.setHdrObligId(methodOut.getTliReqObligId());
    //  cobolCode::MOVE TLI-REQ-SHR-ARNG-CD TO HDR-SHR-ARNG-CD
    methodOut.setHdrShrArngCd(methodOut.getTliReqShrArngCd());
    //  cobolCode::MOVE TLI-REQ-START-DT TO HDR-PROC-DT HDR-CANC-DT
    methodOut.setHdrProcDt(methodOut.getTliReqStartDt());
    methodOut.setHdrCancDt(methodOut.getTliReqStartDt());

    return methodOut;
  }
  /**
   * processPolPlanTli This method is derived from COBOL Paragraph - 2000-PROCESS-POL-PLAN-TLI
   * SECTION COBOL Cyclomatic complexity - 7 Input :
   *
   * <p>- sqlcode_Ws COBOL Name: WS-SQLCODE - slotIdFnd COBOL Name: SLOT-ID-FND
   *
   * <p>Output : None
   *
   * @throws CFException
   */
  @Override
  public ProcessPolPlanTliOutCtx processPolPlanTli(ProcessPolPlanTliInCtx methodIn)
      throws Exception {

    // *81***************************************************************
    // *81 2000-Process-pol-plan-tli section.                           *
    // *81                                                              *
    // *81 business function:                                           *
    // *81 perform pol_plan_csr processing                              *
    // *81***************************************************************
    // *82***************************************************************
    // *82 2000-process-pol-plan-tli                                    *
    // *82 1. process the pol_plan_csr cursor (policy & plan used)      *
    // *82 2. if slot id is not found then go on to process the next    *
    // *82    cursor to check on basis of shared arrangement & obligor id
    // *82***************************************************************
    // Added variable to get the program context in place.
    D5427tliCtx programCtx = methodIn.getD5427tliCtx();
    // Added variable to get the output context in place.
    ProcessPolPlanTliOutCtx methodOut = methodIn.getProcessPolPlanTliOutCtx();
    //  cobolCode::PERFORM 2100-OPEN-POL-PLAN-CSR
    openPolPlanCsr(programCtx.getOpenPolPlanCsrInCtx()); /*2100-OPEN-POL-PLAN-CSR SECTION*/
    if (programCtx.isProgramEnded()) {
      return methodOut;
    }
    //  cobolCode::IF WS-SQLCODE-OK
    if (methodIn.isSqlcodeOk()) {
      //  cobolCode::PERFORM 2200-FETCH-POL-PLAN-CSR UNTIL TLI-TABLE-FOUND OR WS-SQLCODE-NOT-FOUND
      while (!(methodIn.isTliTableFound()) && !(methodIn.isSqlcodeNotFound())) {
        fetchPolPlanCsr(programCtx.getFetchPolPlanCsrInCtx()); /*2200-FETCH-POL-PLAN-CSR SECTION*/
        if (programCtx.isProgramEnded()) {
          return methodOut;
        }
      }
    }
    //  cobolCode::IF WS-SQLCODE-OK OR WS-SQLCODE-NOT-FOUND
    if (methodIn.isSqlcodeOk() || methodIn.isSqlcodeNotFound()) {
      //  cobolCode::PERFORM 2300-CLOSE-POL-PLAN-CSR
      closePolPlanCsr(programCtx.getClosePolPlanCsrInCtx()); /*2300-CLOSE-POL-PLAN-CSR SECTION*/
      if (programCtx.isProgramEnded()) {
        return methodOut;
      }
    }
    //  cobolCode::IF TLI-TABLE-NOT-FOUND
    if (methodIn.isTliTableNotFound()) {
      //  cobolCode::PERFORM 3000-PROCESS-SA-OI-TLI
      processSaOiTli(programCtx.getProcessSaOiTliInCtx()); /*3000-PROCESS-SA-OI-TLI SECTION*/
      if (programCtx.isProgramEnded()) {
        return methodOut;
      }
    }

    return methodOut;
  }
  /**
   * openPolPlanCsr This method is derived from COBOL Paragraph - 2100-OPEN-POL-PLAN-CSR SECTION
   * COBOL Cyclomatic complexity - 4 Input :
   *
   * <p>- sqlcode COBOL Name: SQLCODE
   *
   * <p>Output :
   *
   * <p>- sqlcode_Ws COBOL Name: WS-SQLCODE - dsmSqlcode COBOL Name: DSM-SQLCODE - sqlcode COBOL
   * Name: SQLCODE - dsmReturnCode COBOL Name: DSM-RETURN-CODE - dsmErrTblAction COBOL Name:
   * DSM-ERR-TBL-ACTION - dsmErrTblName COBOL Name: DSM-ERR-TBL-NAME - dsmErrSectnName COBOL Name:
   * DSM-ERR-SECTN-NAME
   *
   * @throws CFException
   */
  @Override
  public OpenPolPlanCsrOutCtx openPolPlanCsr(OpenPolPlanCsrInCtx methodIn) throws Exception {

    // *81***************************************************************
    // *81 2100-Open-pol-plan-csr section.                              *
    // *81                                                              *
    // *81 business function:                                           *
    // *81 opens pol_plan_csr                                           *
    // *82***************************************************************
    // *82 2100-open-pol-plan-csr section.                              *
    // *82 1. populate the dclgen fields required for pol_plan_csr      *
    // *82    processing                                                *
    // *82 2. open the cursor pol_plan_csr                              *
    // *81***************************************************************
    // Added variable to get the program context in place.
    D5427tliCtx programCtx = methodIn.getD5427tliCtx();
    // Added variable to get the output context in place.
    OpenPolPlanCsrOutCtx methodOut = methodIn.getOpenPolPlanCsrOutCtx();
    //  cobolCode::PERFORM 1600-MOVE-REQ-TO-DCLGEN
    moveReqToDclgen(programCtx.getMoveReqToDclgenInCtx()); /*1600-MOVE-REQ-TO-DCLGEN SECTION*/
    if (programCtx.isProgramEnded()) {
      return methodOut;
    }
    //  cobolCode::SELECT SLOT_TBL_ID FROM SRVC_ASGN WHERE RUL_LVL_TYP_ID = 'P' AND POL_NBR = ? AND
    // ( PLN_NBR = ? OR PLN_NBR = '  ' ) AND PROC_DT <= ? AND CANC_DT >= ? AND ROW_STS_CD = 'A'
    // ORDER BY PLN_NBR DESC FETCH FIRST 1 ROW ONLY
    programCtx.setPolPlanCsrResultSet(
        d5427tliRepository.openPolPlanCsrD5427tli(
            programCtx.getSqlca(), methodIn.getDclsrvcAsgn()));
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
      //  cobolCode::MOVE 'SRVC_ASGN' TO DSM-ERR-TBL-NAME
      methodOut.setDsmErrTblName(CONSTANTS.LITERAL_SRVC_ASGN_B16_);
      //  cobolCode::MOVE '2100-OPEN-POL-PLAN-CSR' TO DSM-ERR-SECTN-NAME
      methodOut.setDsmErrSectnName(CONSTANTS.LITERAL_1636665837);
      //  cobolCode::PERFORM 7777-MOVES-FOR-ERROR-LOG
      movesForErrorLog(programCtx.getMovesForErrorLogInCtx()); /*7777-MOVES-FOR-ERROR-LOG SECTION*/
      if (programCtx.isProgramEnded()) {
        return methodOut;
      }
    }

    return methodOut;
  }
  /**
   * fetchPolPlanCsr This method is derived from COBOL Paragraph - 2200-FETCH-POL-PLAN-CSR SECTION
   * COBOL Cyclomatic complexity - 5 Input :
   *
   * <p>- sqlcode COBOL Name: SQLCODE - hdrSlotTblId COBOL Name: HDR-SLOT-TBL-ID
   *
   * <p>Output :
   *
   * <p>- sqlcode_Ws COBOL Name: WS-SQLCODE - dsmSqlcode COBOL Name: DSM-SQLCODE - sqlcode COBOL
   * Name: SQLCODE - tliRetSlotTblId COBOL Name: TLI-RET-SLOT-TBL-ID - hdrSlotTblId COBOL Name:
   * HDR-SLOT-TBL-ID - slotIdFnd COBOL Name: SLOT-ID-FND - dsmReturnCode COBOL Name: DSM-RETURN-CODE
   * - dsmErrTblAction COBOL Name: DSM-ERR-TBL-ACTION - dsmErrTblName COBOL Name: DSM-ERR-TBL-NAME -
   * dsmErrSectnName COBOL Name: DSM-ERR-SECTN-NAME
   *
   * @throws CFException
   */
  @Override
  public FetchPolPlanCsrOutCtx fetchPolPlanCsr(FetchPolPlanCsrInCtx methodIn) throws Exception {

    // *81***************************************************************
    // *81 2200-Fetch-pol-plan-csr section.                             *
    // *81                                                              *
    // *81 business function:                                           *
    // *81 fetch pol_plan_csr                                           *
    // *82***************************************************************
    // *82 2200-fetch-pol-plan-csr section.                             *
    // *82 1.perform fetch of pol_plan_csr                              *
    // *82 2.if a record is fetched from the table set the flag         *
    // *82   tli-table-found to true                                    *
    // *81***************************************************************
    // Added variable to get the program context in place.
    D5427tliCtx programCtx = methodIn.getD5427tliCtx();
    // Added variable to get the output context in place.
    FetchPolPlanCsrOutCtx methodOut = methodIn.getFetchPolPlanCsrOutCtx();
    //  cobolCode::FETCH POL_PLAN_CSR INTO ?
    d5427tliRepository.fetchPolPlanCsrD5427tli(
        programCtx.getPolPlanCsrResultSet(), programCtx.getSqlca(), methodOut.getDclsrvcAsgn());
    //  cobolCode::MOVE SQLCODE TO WS-SQLCODE DSM-SQLCODE
    methodOut.setSqlcode_Ws(methodOut.getSqlcode());
    methodOut.setDsmSqlcode(methodOut.getSqlcode());
    //  cobolCode::EVALUATE TRUE
    if (methodOut.isSqlcodeOk()) {
      //  cobolCode::MOVE HDR-SLOT-TBL-ID TO TLI-RET-SLOT-TBL-ID
      methodOut.setTliRetSlotTblId(methodOut.getHdrSlotTblId());
      //  cobolCode::SET TLI-TABLE-FOUND TO TRUE
      methodOut.setTliTableFoundTrue();

    } else if (methodOut.isSqlcodeNotFound()) {;
    } else {
      //  cobolCode::SET DSM-DB2-ERROR TO TRUE
      methodOut.setDsmDb2ErrorTrue();

      //  cobolCode::MOVE 'FETCH' TO DSM-ERR-TBL-ACTION
      methodOut.setDsmErrTblAction(CONSTANTS.LITERAL_FETCH_B5_);
      //  cobolCode::MOVE 'SRVC_ASGN' TO DSM-ERR-TBL-NAME
      methodOut.setDsmErrTblName(CONSTANTS.LITERAL_SRVC_ASGN_B16_);
      //  cobolCode::MOVE '2200-FETCH-POL-PLAN-CSR' TO DSM-ERR-SECTN-NAME
      methodOut.setDsmErrSectnName(CONSTANTS.LITERAL_1504433022);
      //  cobolCode::PERFORM 7777-MOVES-FOR-ERROR-LOG
      movesForErrorLog(programCtx.getMovesForErrorLogInCtx()); /*7777-MOVES-FOR-ERROR-LOG SECTION*/
      if (programCtx.isProgramEnded()) {
        return methodOut;
      }
    }

    return methodOut;
  }
  /**
   * closePolPlanCsr This method is derived from COBOL Paragraph - 2300-CLOSE-POL-PLAN-CSR SECTION
   * COBOL Cyclomatic complexity - 4 Input :
   *
   * <p>- sqlcode COBOL Name: SQLCODE
   *
   * <p>Output :
   *
   * <p>- sqlcode_Ws COBOL Name: WS-SQLCODE - dsmSqlcode COBOL Name: DSM-SQLCODE - sqlcode COBOL
   * Name: SQLCODE - dsmReturnCode COBOL Name: DSM-RETURN-CODE - dsmErrTblAction COBOL Name:
   * DSM-ERR-TBL-ACTION - dsmErrTblName COBOL Name: DSM-ERR-TBL-NAME - dsmErrSectnName COBOL Name:
   * DSM-ERR-SECTN-NAME
   *
   * @throws CFException
   */
  @Override
  public ClosePolPlanCsrOutCtx closePolPlanCsr(ClosePolPlanCsrInCtx methodIn) throws Exception {

    // *81***************************************************************
    // *81 2300-Close-pol-plan-csr section.                             *
    // *81                                                              *
    // *81 business function:                                           *
    // *81 close pol_plan_csr                                           *
    // *82***************************************************************
    // *82 2300-close-pol-plan-csr section.                             *
    // *82 1.perform close of pol_plan_csr                              *
    // *81***************************************************************
    // Added variable to get the program context in place.
    D5427tliCtx programCtx = methodIn.getD5427tliCtx();
    // Added variable to get the output context in place.
    ClosePolPlanCsrOutCtx methodOut = methodIn.getClosePolPlanCsrOutCtx();
    //  cobolCode::CLOSE POL_PLAN_CSR
    d5427tliRepository.closePolPlanCsrD5427tli(
        programCtx.getPolPlanCsrResultSet(), programCtx.getSqlca());
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
      //  cobolCode::MOVE 'SRVC_ASGN' TO DSM-ERR-TBL-NAME
      methodOut.setDsmErrTblName(CONSTANTS.LITERAL_SRVC_ASGN_B16_);
      //  cobolCode::MOVE '2300-CLOSE-POL-PLAN-CSR' TO DSM-ERR-SECTN-NAME
      methodOut.setDsmErrSectnName(CONSTANTS.LITERAL_1855667681);
      //  cobolCode::PERFORM 7777-MOVES-FOR-ERROR-LOG
      movesForErrorLog(programCtx.getMovesForErrorLogInCtx()); /*7777-MOVES-FOR-ERROR-LOG SECTION*/
      if (programCtx.isProgramEnded()) {
        return methodOut;
      }
    }

    return methodOut;
  }
  /**
   * processSaOiTli This method is derived from COBOL Paragraph - 3000-PROCESS-SA-OI-TLI SECTION
   * COBOL Cyclomatic complexity - 6 Input :
   *
   * <p>- sqlcode_Ws COBOL Name: WS-SQLCODE - slotIdFnd COBOL Name: SLOT-ID-FND
   *
   * <p>Output : None
   *
   * @throws CFException
   */
  @Override
  public ProcessSaOiTliOutCtx processSaOiTli(ProcessSaOiTliInCtx methodIn) throws Exception {

    // *81 Business function:                                           *
    // *81 perform sa_oi_csr processing                                 *
    // *81***************************************************************
    // *82***************************************************************
    // *82 3000-process-sa-oi-tli section.                              *
    // *82 1. process the sa_oi_csr cursor                              *
    // *83 2. if slot id is not found then move spaces to slot table id *
    // *83    and set dsm-entry-not-fnd-inq to true                     *
    // *82***************************************************************
    // Added variable to get the program context in place.
    D5427tliCtx programCtx = methodIn.getD5427tliCtx();
    // Added variable to get the output context in place.
    ProcessSaOiTliOutCtx methodOut = methodIn.getProcessSaOiTliOutCtx();
    //  cobolCode::PERFORM 3100-OPEN-SA-OI-CSR
    openSaOiCsr(programCtx.getOpenSaOiCsrInCtx()); /*3100-OPEN-SA-OI-CSR SECTION*/
    if (programCtx.isProgramEnded()) {
      return methodOut;
    }
    //  cobolCode::IF WS-SQLCODE-OK
    if (methodIn.isSqlcodeOk()) {
      //  cobolCode::PERFORM 3200-FETCH-SA-OI-CSR UNTIL TLI-TABLE-FOUND OR WS-SQLCODE-NOT-FOUND
      while (!(methodIn.isTliTableFound()) && !(methodIn.isSqlcodeNotFound())) {
        fetchSaOiCsr(programCtx.getFetchSaOiCsrInCtx()); /*3200-FETCH-SA-OI-CSR SECTION*/
        if (programCtx.isProgramEnded()) {
          return methodOut;
        }
      }
    }
    //  cobolCode::IF WS-SQLCODE-OK OR WS-SQLCODE-NOT-FOUND
    if (methodIn.isSqlcodeOk() || methodIn.isSqlcodeNotFound()) {
      //  cobolCode::PERFORM 3300-CLOSE-SA-OI-CSR
      closeSaOiCsr(programCtx.getCloseSaOiCsrInCtx()); /*3300-CLOSE-SA-OI-CSR SECTION*/
      if (programCtx.isProgramEnded()) {
        return methodOut;
      }
    }

    return methodOut;
  }
  /**
   * openSaOiCsr This method is derived from COBOL Paragraph - 3100-OPEN-SA-OI-CSR SECTION COBOL
   * Cyclomatic complexity - 4 Input :
   *
   * <p>- sqlcode COBOL Name: SQLCODE
   *
   * <p>Output :
   *
   * <p>- sqlcode_Ws COBOL Name: WS-SQLCODE - dsmSqlcode COBOL Name: DSM-SQLCODE - sqlcode COBOL
   * Name: SQLCODE - dsmReturnCode COBOL Name: DSM-RETURN-CODE - dsmErrTblAction COBOL Name:
   * DSM-ERR-TBL-ACTION - dsmErrTblName COBOL Name: DSM-ERR-TBL-NAME - dsmErrSectnName COBOL Name:
   * DSM-ERR-SECTN-NAME
   *
   * @throws CFException
   */
  @Override
  public OpenSaOiCsrOutCtx openSaOiCsr(OpenSaOiCsrInCtx methodIn) throws Exception {

    // *81***************************************************************
    // *81 3100-Open-sa-oi-csr section.                                 *
    // *81 ------------------------                                     *
    // *81 business function:                                           *
    // *81 opens the cursor to fetch the data from tli table using shared
    // *81 arrangement and obligor id                                   *
    // *81***************************************************************
    // *82***************************************************************
    // *82 1.open sa_oi_csr cursor.                                     *
    // *82***************************************************************
    // Added variable to get the program context in place.
    D5427tliCtx programCtx = methodIn.getD5427tliCtx();
    // Added variable to get the output context in place.
    OpenSaOiCsrOutCtx methodOut = methodIn.getOpenSaOiCsrOutCtx();
    //  cobolCode::SELECT SLOT_TBL_ID FROM SRVC_ASGN WHERE RUL_LVL_TYP_ID = 'O' AND OBLIG_ID = ? AND
    // ( SHR_ARNG_CD = ? OR SHR_ARNG_CD = '  ' ) AND PROC_DT <= ? AND CANC_DT >= ? AND ROW_STS_CD =
    // 'A' ORDER BY SHR_ARNG_CD DESC FETCH FIRST 1 ROW ONLY
    programCtx.setSaOiCsrResultSet(
        d5427tliRepository.openSaOiCsrD5427tli(programCtx.getSqlca(), methodIn.getDclsrvcAsgn()));
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
      //  cobolCode::MOVE 'SRVC_ASGN' TO DSM-ERR-TBL-NAME
      methodOut.setDsmErrTblName(CONSTANTS.LITERAL_SRVC_ASGN_B16_);
      //  cobolCode::MOVE '3100-OPEN-SA-OI-CSR' TO DSM-ERR-SECTN-NAME
      methodOut.setDsmErrSectnName(CONSTANTS.LITERAL_1235046778);
      //  cobolCode::PERFORM 7777-MOVES-FOR-ERROR-LOG
      movesForErrorLog(programCtx.getMovesForErrorLogInCtx()); /*7777-MOVES-FOR-ERROR-LOG SECTION*/
      if (programCtx.isProgramEnded()) {
        return methodOut;
      }
    }

    return methodOut;
  }
  /**
   * fetchSaOiCsr This method is derived from COBOL Paragraph - 3200-FETCH-SA-OI-CSR SECTION COBOL
   * Cyclomatic complexity - 5 Input :
   *
   * <p>- sqlcode COBOL Name: SQLCODE - hdrSlotTblId COBOL Name: HDR-SLOT-TBL-ID
   *
   * <p>Output :
   *
   * <p>- sqlcode_Ws COBOL Name: WS-SQLCODE - dsmSqlcode COBOL Name: DSM-SQLCODE - sqlcode COBOL
   * Name: SQLCODE - tliRetSlotTblId COBOL Name: TLI-RET-SLOT-TBL-ID - hdrSlotTblId COBOL Name:
   * HDR-SLOT-TBL-ID - slotIdFnd COBOL Name: SLOT-ID-FND - dsmReturnCode COBOL Name: DSM-RETURN-CODE
   * - dsmErrTblAction COBOL Name: DSM-ERR-TBL-ACTION - dsmErrTblName COBOL Name: DSM-ERR-TBL-NAME -
   * dsmErrSectnName COBOL Name: DSM-ERR-SECTN-NAME
   *
   * @throws CFException
   */
  @Override
  public FetchSaOiCsrOutCtx fetchSaOiCsr(FetchSaOiCsrInCtx methodIn) throws Exception {

    // *81 ************************************************************ *
    // *82 3200-Fetch-sa-oi-csr section.                                *
    // *82 1.perform fetch of sa_oi_csr                                 *
    // *82 2.if a record is fetched then set the flag tli-table-found to
    // *82   true                                                       *
    // *82***************************************************************
    // Added variable to get the program context in place.
    D5427tliCtx programCtx = methodIn.getD5427tliCtx();
    // Added variable to get the output context in place.
    FetchSaOiCsrOutCtx methodOut = methodIn.getFetchSaOiCsrOutCtx();
    //  cobolCode::FETCH SA_OI_CSR INTO ?
    d5427tliRepository.fetchSaOiCsrD5427tli(
        programCtx.getSaOiCsrResultSet(), programCtx.getSqlca(), methodOut.getDclsrvcAsgn());
    //  cobolCode::MOVE SQLCODE TO WS-SQLCODE DSM-SQLCODE
    methodOut.setSqlcode_Ws(methodOut.getSqlcode());
    methodOut.setDsmSqlcode(methodOut.getSqlcode());
    //  cobolCode::EVALUATE TRUE
    if (methodOut.isSqlcodeOk()) {
      //  cobolCode::MOVE HDR-SLOT-TBL-ID TO TLI-RET-SLOT-TBL-ID
      methodOut.setTliRetSlotTblId(methodOut.getHdrSlotTblId());
      //  cobolCode::SET TLI-TABLE-FOUND TO TRUE
      methodOut.setTliTableFoundTrue();

    } else if (methodOut.isSqlcodeNotFound()) {
      //  cobolCode::MOVE SPACES TO TLI-RET-SLOT-TBL-ID
      methodOut.setTliRetSlotTblId(CONSTANTS.SPACE_6);
      //  cobolCode::SET DSM-ENTRY-NOT-FND-INQ TO TRUE
      methodOut.setDsmEntryNotFndInqTrue();

    } else {
      //  cobolCode::SET DSM-DB2-ERROR TO TRUE
      methodOut.setDsmDb2ErrorTrue();

      //  cobolCode::MOVE 'FETCH' TO DSM-ERR-TBL-ACTION
      methodOut.setDsmErrTblAction(CONSTANTS.LITERAL_FETCH_B5_);
      //  cobolCode::MOVE 'SRVC_ASGN' TO DSM-ERR-TBL-NAME
      methodOut.setDsmErrTblName(CONSTANTS.LITERAL_SRVC_ASGN_B16_);
      //  cobolCode::MOVE '3200-FETCH-SA-OI-CSR' TO DSM-ERR-SECTN-NAME
      methodOut.setDsmErrSectnName(CONSTANTS.LITERAL_1549311501);
      //  cobolCode::PERFORM 7777-MOVES-FOR-ERROR-LOG
      movesForErrorLog(programCtx.getMovesForErrorLogInCtx()); /*7777-MOVES-FOR-ERROR-LOG SECTION*/
      if (programCtx.isProgramEnded()) {
        return methodOut;
      }
    }

    return methodOut;
  }
  /**
   * closeSaOiCsr This method is derived from COBOL Paragraph - 3300-CLOSE-SA-OI-CSR SECTION COBOL
   * Cyclomatic complexity - 4 Input :
   *
   * <p>- sqlcode COBOL Name: SQLCODE
   *
   * <p>Output :
   *
   * <p>- sqlcode_Ws COBOL Name: WS-SQLCODE - dsmSqlcode COBOL Name: DSM-SQLCODE - sqlcode COBOL
   * Name: SQLCODE - dsmReturnCode COBOL Name: DSM-RETURN-CODE - dsmErrTblAction COBOL Name:
   * DSM-ERR-TBL-ACTION - dsmErrTblName COBOL Name: DSM-ERR-TBL-NAME - dsmErrSectnName COBOL Name:
   * DSM-ERR-SECTN-NAME
   *
   * @throws CFException
   */
  @Override
  public CloseSaOiCsrOutCtx closeSaOiCsr(CloseSaOiCsrInCtx methodIn) throws Exception {

    // *81***************************************************************
    // *81 3300-Close-sa-oi-csr section.                                *
    // *81 ------------------------                                     *
    // *81 business function:                                           *
    // *81 closes the cursor used for fetching the data from            *
    // *81                        tli    table                          *
    // *82***************************************************************
    // *82 3300-close-sa-oi-csr section.                                *
    // *82 1.perform close of sa_oi_csr                                 *
    // *82 **************************************************************
    // Added variable to get the program context in place.
    D5427tliCtx programCtx = methodIn.getD5427tliCtx();
    // Added variable to get the output context in place.
    CloseSaOiCsrOutCtx methodOut = methodIn.getCloseSaOiCsrOutCtx();
    //  cobolCode::CLOSE SA_OI_CSR
    d5427tliRepository.closeSaOiCsrD5427tli(
        programCtx.getSaOiCsrResultSet(), programCtx.getSqlca());
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
      //  cobolCode::MOVE 'SRVC_ASGN' TO DSM-ERR-TBL-NAME
      methodOut.setDsmErrTblName(CONSTANTS.LITERAL_SRVC_ASGN_B16_);
      //  cobolCode::MOVE '3300-CLOSE-SA-OI-CSR' TO DSM-ERR-SECTN-NAME
      methodOut.setDsmErrSectnName(CONSTANTS.LITERAL_614444908);
      //  cobolCode::PERFORM 7777-MOVES-FOR-ERROR-LOG
      movesForErrorLog(programCtx.getMovesForErrorLogInCtx()); /*7777-MOVES-FOR-ERROR-LOG SECTION*/
      if (programCtx.isProgramEnded()) {
        return methodOut;
      }
    }

    return methodOut;
  }
  /**
   * movesForErrorLog This method is derived from COBOL Paragraph - 7777-MOVES-FOR-ERROR-LOG SECTION
   * COBOL Cyclomatic complexity - 1 Input :
   *
   * <p>- tliReqClngProg COBOL Name: TLI-REQ-CLNG-PROG - dsmPgmName COBOL Name: WS-DSM-PGM-NAME
   *
   * <p>Output :
   *
   * <p>- dsmErrClngPgmName COBOL Name: DSM-ERR-CLNG-PGM-NAME - tliReqClngProg COBOL Name:
   * TLI-REQ-CLNG-PROG - dsmErrPgmName COBOL Name: DSM-ERR-PGM-NAME - dsmPgmName COBOL Name:
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
    D5427tliCtx programCtx = methodIn.getD5427tliCtx();
    // Added variable to get the output context in place.
    MovesForErrorLogOutCtx methodOut = methodIn.getMovesForErrorLogOutCtx();
    //  cobolCode::MOVE TLI-REQ-CLNG-PROG TO DSM-ERR-CLNG-PGM-NAME
    methodOut.setDsmErrClngPgmName(methodOut.getTliReqClngProg());
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
    D5427tliCtx programCtx = methodIn.getD5427tliCtx();
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
    D5427tliCtx programCtx = (D5427tliCtx) ctx;

    int len = params.length;
    if (len > 0 && params[0] != null) programCtx.getDsmCallArea().set((Field) params[0]);
    if (len > 1 && params[1] != null) programCtx.getTliDsmArea().set((Field) params[1]);
    // invoke the process and return rc
    return process(programCtx);
  }

  public int call(ProgramContext ctx, Field... parameters) throws Exception {
    D5427tliCtx programCtx = (D5427tliCtx) ctx;
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
            if (parameters[index] instanceof TliDsmArea) {
              programCtx.setTliDsmArea((TliDsmArea) parameters[index]);
            } else {
              programCtx.getTliDsmArea().set(parameters[index]);
            }
          }

          break;
      }
    }
    return process(programCtx);
  }
}
