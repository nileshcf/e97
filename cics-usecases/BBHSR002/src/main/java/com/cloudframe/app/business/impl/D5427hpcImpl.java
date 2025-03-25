package com.cloudframe.app.business.impl;
/*
 *00***************************************************************
 *00    licensed materials - property of united health group      *
 *00                                                              *
 *00 s m e   r e v i e w e d - comments have been reviewed by sme *
 *00                                                              *
 *00***************************************************************
 *10***************************************************************
 *10  program name       :  d5427hpc.                             *
 *10  business function  :  hpc db2 data service module.          *
 *10  designed by        :  n/a.                                  *
 *10  programmed by      :  sarala                                *
 *10  date coded         :  rel q4-10.                            *
 *10  type               :  online - called thru onlines.         *
 *20***************************************************************
 *20  major program process:                                      *
 *20                                                              *
 *20  this db2 dsm receives a request to be processed against db2 *
 *20  table hipaa_proc_cd.                                        *
 *20                                                              *
 *20  the program is function code driven. the function code value*
 *20  is received from the calling program along with the required*
 *20  key fields. based on the func code dsm will perform inquiry *
 *20  on hipaa_proc_cd table to fetch hippa codes.                *
 *20                                                              *
 *20  function code 1 - generic request where the value of hipaa  *
 *20  code will be 30 or spaces.                                  *
 *20  function code 2 - explicit request,hipaa code and any group *
 *20  related values.                                             *
 *20***************************************************************
 *30***************************************************************
 *30  program change log:                                         *
 *30                                                              *
 *30   release  sprf    programmer  description                   *
 *30   -------  ------  ----------  ----------------------------  *
 *30   relq410  4-33120  sarala     new program                   *
 *30   relq410  4-33120  varshi     fix for defect #10525         *
 *30                                to handle invalid hipaa codes *
 *30                                that are not in 5010 version  *
 *30   relq312  wo52524  m. trzaska work order 52524 - romoved    *
 *30                                validation on hipaa-ver-nbr   *
 *30                                field to allow for new value  *
 *30                                of 'a' coming in on request.  *
 *30                                increased limition of hipaa   *
 *30                                codes returned from 26 to 99. *
 *30   relq317  prj112969 gandharvi - 270/271 data quality -      *
 *30                      tandon      discrepancies               *
 *30                                                              *
 *30   rel1907        manikanta    mdtr-2019-0514-1a-tops to use  *
 *30                  srikakulapu  d5427hpc for performance       *
 *30                  & ramcharan  benefits of hipaa_proc_cd      *
 *30                               loaded into memory.            *
 *30   rel23m5  marina    prj287759 - transparency - cons price   *
 *30            myaskovsky            transparency tool(cptt)     *
 *30***************************************************************
 *40***************************************************************
 *40  external called programs:                                   *
 *40                                                              *
 *40  name          description              call/link/xctl/start *
 *40  ----          -----------              -------------------- *
 *40   n/a             n/a                          n/a           *
 *40***************************************************************
 *50***************************************************************
 *50  return codes:                                               *
 *50                                                              *
 *50 sql codes for the db2 operation.                             *
 *50                                                              *
 *50   copybook   description                                     *
 *50   ----       --------------------------------------------- - *
 *50   vysqlcds   sql codes for the db2 operation.                *
 *50                                                              *
 *50***************************************************************
 *60***************************************************************
 *60  tables and access types:                                    *
 *60                                                              *
 *60  name                          type           access         *
 *60  --------------                ----           -------        *
 *60  hipaa_proc_cd                 db2            read           *
 *60***************************************************************
 */

import com.cloudframe.app.business.*;
import com.cloudframe.app.business.C5427hpc;
import com.cloudframe.app.business.D5427hpc;
import com.cloudframe.app.common.CONSTANTS;
import com.cloudframe.app.common.CommonProcess;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.dto.ProgramContext;
import com.cloudframe.app.dto.d5427hpc.*;
import com.cloudframe.app.dto.d5427hpc.D5427hpcCtx;
import com.cloudframe.app.dto.d5427hpc.D5427hpcCtx.*;
import com.cloudframe.app.dto.d5427hpc.DsmCallArea;
import com.cloudframe.app.dto.d5427hpc.HpcDataArea;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.repository.D5427hpcRepository;
import com.cloudframe.app.service.*;
import com.cloudframe.app.utility.CFUtil;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("d5427hpc")
public class D5427hpcImpl extends CommonProcess implements D5427hpc {

  Logger logger = LoggerFactory.getLogger(D5427hpcImpl.class);

  @Value("${D5427HPC.dbQualifier:}")
  private String dbQualifier;

  @Autowired
  @Qualifier("c5427hpc")
  C5427hpc c5427hpc;

  @Autowired
  @Qualifier("d5427hpcRepository")
  D5427hpcRepository d5427hpcRepository;

  @Override
  public int setParameter(D5427hpcCtx programCtx, String dsmCallArea, String hpcDataArea)
      throws Exception {
    if (dsmCallArea != null)
      programCtx
          .getDsmCallArea()
          .setString(
              com.cloudframe.app.data.Field.getParm(dsmCallArea),
              new String(CONSTANTS.EBCDIC_ENCODING));
    if (hpcDataArea != null)
      programCtx
          .getHpcDataArea()
          .setString(
              com.cloudframe.app.data.Field.getParm(hpcDataArea),
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
  public int process(D5427hpcCtx programCtx) throws Exception {
    try {
      setCodePage("1047");
      // Reset program ended flag
      programCtx.setProgramEnded(false);
      db2Base.reset("D5427HPC", dbQualifier, true /*use Dynamic SQL*/);
      // Added variable to get the output context in place.
      ProcessInCtx methodIn = programCtx.getProcessInCtx();
      //  cobolCode::PERFORM 0000-MAIN-LINE
      mainLine(programCtx.getMainLineInCtx()); /*0000-MAIN-LINE SECTION*/
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
   * mainLine This method is derived from COBOL Paragraph - 0000-MAIN-LINE SECTION COBOL Cyclomatic
   * complexity - 7 Input :
   *
   * <p>- dsmReturnCode COBOL Name: DSM-RETURN-CODE - hipaaCodeListAddress COBOL Name:
   * HIPAA-CODE-LIST-ADDRESS - dsmFuncCd COBOL Name: DSM-FUNC-CD
   *
   * <p>Output :
   *
   * <p>- hipaaCodeList COBOL Name: HIPAA-CODE-LIST - dsmReturnCode COBOL Name: DSM-RETURN-CODE -
   * dsmSqlErrorLevel COBOL Name: DSM-SQL-ERROR-LEVEL - dsmEditErrorValueTxt COBOL Name:
   * DSM-EDIT-ERROR-VALUE-TXT - dsmFuncCd COBOL Name: DSM-FUNC-CD - dsmEditErrorField COBOL Name:
   * DSM-EDIT-ERROR-FIELD
   *
   * @throws CFException
   */
  @Override
  public MainLineOutCtx mainLine(MainLineInCtx methodIn) throws Exception {
    // Added variable to get the program context in place.
    D5427hpcCtx programCtx = methodIn.getD5427hpcCtx();
    // Added variable to get the output context in place.
    MainLineOutCtx methodOut = methodIn.getMainLineOutCtx();
    //  cobolCode::PERFORM 1000-INITIALIZE
    initialize(programCtx); /*1000-INITIALIZE SECTION*/
    if (programCtx.isProgramEnded()) {
      return methodOut;
    }
    //  cobolCode::IF DSM-EDIT-ERROR
    //  cobolCode::ELSE
    if (!(methodOut.isDsmEditError())) {
      //  cobolCode::EVALUATE DSM-FUNC-CD
      switch (methodOut.getDsmFuncCd()) {
        case 1:
          //  cobolCode::PERFORM 2000-PROCESS-GENERIC
          processGeneric(programCtx.getProcessGenericInCtx()); /*2000-PROCESS-GENERIC SECTION*/
          if (programCtx.isProgramEnded()) {
            return methodOut;
          }
          break;
        case 2:
          //  cobolCode::PERFORM 3000-PROCESS-EXPLICIT
          processExplicit(programCtx.getProcessExplicitInCtx()); /*3000-PROCESS-EXPLICIT SECTION*/
          if (programCtx.isProgramEnded()) {
            return methodOut;
          }
          break;
        case 3:
          //  cobolCode::IF HIPAA-CODE-LIST-ADDRESS NOT = NULLS
          //  LITERAL_NULLS = NULLS
          if (compareChars(
                  pad(5, String.valueOf(methodIn.getHipaaCodeListAddress()), "0", CFUtil.LEFT_PAD),
                  CONSTANTS.LITERAL_NULLS)
              != 0) {
            //  cobolCode::SET ADDRESS OF HIPAA-CODE-LIST TO HIPAA-CODE-LIST-ADDRESS
            methodOut.getHipaaCodeList().set(getObject(methodIn.getHipaaCodeListAddress()));

            //  cobolCode::PERFORM 3001-PROCESS-EXPLICIT-LIST
            processExplicitList(
                programCtx.getProcessExplicitListInCtx()); /*3001-PROCESS-EXPLICIT-LIST SECTION*/
            if (programCtx.isProgramEnded()) {
              return methodOut;
            }
          }
          //  cobolCode::ELSE
          else {
            //  cobolCode::SET DSM-EDIT-ERROR TO TRUE
            methodOut.setDsmEditErrorTrue();

            //  cobolCode::SET DSM-PROCESS-ERROR TO TRUE
            methodOut.setDsmProcessErrorTrue();

            //  cobolCode::MOVE DSM-FUNC-CD TO DSM-EDIT-ERROR-VALUE-TXT
            methodOut
                .getDsmEditErrorValueTxt()
                .setString(String.valueOf(methodOut.getDsmFuncCdString()).toCharArray());
            //  cobolCode::MOVE 'HIPAA-CD LIST NOT FOUND' TO DSM-EDIT-ERROR-FIELD
            methodOut.setDsmEditErrorField(CONSTANTS.LITERAL_HIPAA_MN_CD_B10_LISTNOTFOUND);
            // cobolCode::GO TO 0000-EXIT
            exit(programCtx);
            return methodOut;
            // cobolCodeEnds::GO TO 0000-EXIT
          }
          break;
        case 4:
          //  cobolCode::PERFORM 5000-PROCESS-ALL-HIPAA
          processAllHipaa(programCtx.getProcessAllHipaaInCtx()); /*5000-PROCESS-ALL-HIPAA SECTION*/
          if (programCtx.isProgramEnded()) {
            return methodOut;
          }
          break;
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
  public void exit(D5427hpcCtx programCtx) throws Exception {
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
   * <p>- dclhipaaProcCd COBOL Name: DCLHIPAA-PROC-CD - dsmLogArea COBOL Name: DSM-LOG-AREA -
   * dsmReturnCode COBOL Name: DSM-RETURN-CODE - hpcRetArea COBOL Name: HPC-RET-AREA - lneSub COBOL
   * Name: WS-LNE-SUB - explicitReqSw COBOL Name: WS-EXPLICIT-REQ-SW
   *
   * @throws CFException
   */
  @Override
  public InitializeOutCtx initialize(D5427hpcCtx programCtx) throws Exception {

    // *81***************************************************************
    // *81 1000-Initialize                                              *
    // *81                                                              *
    // *81 business function:                                           *
    // *81 initialization .                                             *
    // *81***************************************************************
    // *82***************************************************************
    // *82 1000-initialize-para                                         *
    // *82                                                              *
    // *82 1. initialize all dclgen and working storage fields          *
    // *82 2. perform request field validation                          *
    // *82***************************************************************
    // Added variable to get the output context in place.
    InitializeOutCtx methodOut = programCtx.getInitializeOutCtx();
    //  cobolCode::INITIALIZE DCLHIPAA-PROC-CD DSM-LOG-AREA DSM-RETURN-CODE HPC-RET-AREA
    methodOut.getDclhipaaProcCd().initialize();
    methodOut.getDsmLogArea().initialize();
    methodOut.setDsmReturnCode(0);
    methodOut.getHpcRetArea().initialize();
    //  cobolCode::MOVE ZEROS TO WS-LNE-SUB
    methodOut.setLneSub(0);
    //  cobolCode::SET WS-NOT-EXPLICIT-REQ TO TRUE
    methodOut.setNotExplicitReqTrue();

    //  cobolCode::PERFORM 1500-REQUEST-FIELD-VALIDATION
    requestFieldValidation(
        programCtx.getRequestFieldValidationInCtx()); /*1500-REQUEST-FIELD-VALIDATION SECTION*/

    return methodOut;
  }
  /**
   * requestFieldValidation This method is derived from COBOL Paragraph -
   * 1500-REQUEST-FIELD-VALIDATION SECTION COBOL Cyclomatic complexity - 8 Input :
   *
   * <p>- dsmFuncCd COBOL Name: DSM-FUNC-CD - hpcReqHipaaCd COBOL Name: HPC-REQ-HIPAA-CD
   *
   * <p>Output :
   *
   * <p>- dsmReturnCode COBOL Name: DSM-RETURN-CODE - dsmSqlErrorLevel COBOL Name:
   * DSM-SQL-ERROR-LEVEL - dsmEditErrorValueTxt COBOL Name: DSM-EDIT-ERROR-VALUE-TXT - dsmFuncCd
   * COBOL Name: DSM-FUNC-CD - dsmEditErrorField COBOL Name: DSM-EDIT-ERROR-FIELD - hpcReqHipaaCd
   * COBOL Name: HPC-REQ-HIPAA-CD
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
    // *82 1.validating request fields for both the function codes.     *
    // *82***************************************************************

    // *    If dsm-func-cd = 01 or 02
    // *    if dsm-func-cd = 01 or 02 or 03
    // Added variable to get the program context in place.
    D5427hpcCtx programCtx = methodIn.getD5427hpcCtx();
    // Added variable to get the output context in place.
    RequestFieldValidationOutCtx methodOut = methodIn.getRequestFieldValidationOutCtx();
    //  cobolCode::IF DSM-FUNC-CD = 01 OR 02 OR 03 OR 04
    //  cobolCode::ELSE
    if ((methodOut.getDsmFuncCd() != 1)
        && (methodOut.getDsmFuncCd() != 2)
        && (methodOut.getDsmFuncCd() != 3)
        && (methodOut.getDsmFuncCd() != 4)) {
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
      // cobolCode::GO TO 1500-EXIT
      return methodOut;
      // cobolCodeEnds::GO TO 1500-EXIT
    }

    // ***  If hpc-req-hipaa-cd  = zeros or spaces or low-values or
    //  cobolCode::IF HPC-REQ-HIPAA-CD = SPACES OR LOW-VALUES OR HIGH-VALUES
    if ((allSpaces(methodOut.getHpcReqHipaaCd()))
        || (checkLowValue(methodOut.getHpcReqHipaaCd()))
        || (isHighValue(methodOut.getHpcReqHipaaCd()))) {
      //  cobolCode::SET DSM-EDIT-ERROR TO TRUE
      methodOut.setDsmEditErrorTrue();

      //  cobolCode::MOVE 'HPC-REQ-HIPAA-CD ' TO DSM-EDIT-ERROR-FIELD
      methodOut.setDsmEditErrorField(CONSTANTS.LITERAL_HPC_MN3_REQHIPAACD_B14_);
      //  cobolCode::MOVE HPC-REQ-HIPAA-CD TO DSM-EDIT-ERROR-VALUE-TXT
      methodOut.getDsmEditErrorValueTxt().setString(methodOut.getHpcReqHipaaCd());
      // cobolCode::GO TO 1500-EXIT
      return methodOut;
      // cobolCodeEnds::GO TO 1500-EXIT
    }

    return methodOut;
  }
  /**
   * processGeneric This method is derived from COBOL Paragraph - 2000-PROCESS-GENERIC SECTION COBOL
   * Cyclomatic complexity - 4 Input :
   *
   * <p>- sqlcode_Ws COBOL Name: WS-SQLCODE
   *
   * <p>Output :
   *
   * <p>- hpcRetCodeMoreSw COBOL Name: HPC-RET-CODE-MORE-SW
   *
   * @throws CFException
   */
  @Override
  public ProcessGenericOutCtx processGeneric(ProcessGenericInCtx methodIn) throws Exception {

    // *81***************************************************************
    // *81 2000-Process-generic-section                                 *
    // *81                                                              *
    // *81 business function:                                           *
    // *81 perform hipaa_generic_csr processing                         *
    // *81***************************************************************
    // *82***************************************************************
    // *82                                                              *
    // *82 2000-process-generic                                         *
    // *82 1.used to get the hipaa proc codes and the generic           *
    // *82   request code for generic request.                          *
    // *82                                                              *
    // *82***************************************************************
    // Added variable to get the program context in place.
    D5427hpcCtx programCtx = methodIn.getD5427hpcCtx();
    // Added variable to get the output context in place.
    ProcessGenericOutCtx methodOut = methodIn.getProcessGenericOutCtx();
    //  cobolCode::PERFORM 2100-OPEN-GENERIC-CURSOR
    openGenericCursor(programCtx.getOpenGenericCursorInCtx()); /*2100-OPEN-GENERIC-CURSOR SECTION*/
    if (programCtx.isProgramEnded()) {
      return methodOut;
    }
    //  cobolCode::IF WS-SQLCODE-OK
    if (methodIn.isSqlcodeOk()) {
      //  cobolCode::SET HPC-RET-NO-MORE-ROWS TO TRUE
      methodOut.setHpcRetNoMoreRowsTrue();

      //  cobolCode::PERFORM 2200-FETCH-GENERIC-CURSOR
      fetchGenericCursor(
          programCtx.getFetchGenericCursorInCtx()); /*2200-FETCH-GENERIC-CURSOR SECTION*/
      if (programCtx.isProgramEnded()) {
        return methodOut;
      }
    }
    //  cobolCode::IF WS-SQLCODE-OK OR WS-SQLCODE-FETCH-END
    if (methodIn.isSqlcodeOk() || methodIn.isSqlcodeFetchEnd()) {
      //  cobolCode::PERFORM 2300-CLOSE-GENERIC-CURSOR
      closeGenericCursor(
          programCtx.getCloseGenericCursorInCtx()); /*2300-CLOSE-GENERIC-CURSOR SECTION*/
      if (programCtx.isProgramEnded()) {
        return methodOut;
      }
    }

    return methodOut;
  }
  /**
   * openGenericCursor This method is derived from COBOL Paragraph - 2100-OPEN-GENERIC-CURSOR
   * SECTION COBOL Cyclomatic complexity - 8 Input :
   *
   * <p>- hpcReqHipaaVerNbr COBOL Name: HPC-REQ-HIPAA-VER-NBR - dsmFuncCd COBOL Name: DSM-FUNC-CD -
   * crtnSrchFoundSw COBOL Name: CRTN-SRCH-FOUND-SW - sqlcode COBOL Name: SQLCODE
   *
   * <p>Output :
   *
   * <p>- hipaaVerNbr COBOL Name: HIPAA-VER-NBR - hpcReqHipaaVerNbr COBOL Name:
   * HPC-REQ-HIPAA-VER-NBR - hipaaFetchSw COBOL Name: WS-HIPAA-FETCH-SW - crtnHipaaVerNbr COBOL
   * Name: CRTN-HIPAA-VER-NBR - crtnCallType COBOL Name: CRTN-CALL-TYPE - crtnFunction COBOL Name:
   * CRTN-FUNCTION - rc COBOL Name: RETURN-CODE - returnCode COBOL Name: WS-RETURN-CODE -
   * dsmReturnCode COBOL Name: DSM-RETURN-CODE - dsmSqlErrorLevel COBOL Name: DSM-SQL-ERROR-LEVEL -
   * dsmEditErrorValueTxt COBOL Name: DSM-EDIT-ERROR-VALUE-TXT - dsmFuncCd COBOL Name: DSM-FUNC-CD -
   * dsmEditErrorField COBOL Name: DSM-EDIT-ERROR-FIELD - sqlcode_Ws COBOL Name: WS-SQLCODE -
   * dsmSqlcode COBOL Name: DSM-SQLCODE - sqlcode COBOL Name: SQLCODE - dsmErrTblAction COBOL Name:
   * DSM-ERR-TBL-ACTION - dsmErrTblName COBOL Name: DSM-ERR-TBL-NAME - dsmErrSectnName COBOL Name:
   * DSM-ERR-SECTN-NAME
   *
   * @throws CFException
   */
  @Override
  public OpenGenericCursorOutCtx openGenericCursor(OpenGenericCursorInCtx methodIn)
      throws Exception {

    // *81***************************************************************
    // *81 2100-Open-generic-cursor                                     *
    // *81                                                              *
    // *81 business function:                                           *
    // *81 open table hipaa_proc_cd - hipaa_generic_csr                 *
    // *81***************************************************************
    // *82***************************************************************
    // *82 2100-open-generic-cursor                                     *
    // *82                                                              *
    // *82 1) open the cursor to get the details from the hipaa proc    *
    // *82    code table for generic request.                           *
    // *82                                                              *
    // *82***************************************************************
    // Added variable to get the program context in place.
    D5427hpcCtx programCtx = methodIn.getD5427hpcCtx();
    // Added variable to get the output context in place.
    OpenGenericCursorOutCtx methodOut = methodIn.getOpenGenericCursorOutCtx();
    //  cobolCode::MOVE HPC-REQ-HIPAA-VER-NBR TO HIPAA-VER-NBR
    methodOut.setHipaaVerNbr(methodOut.getHpcReqHipaaVerNbr());
    //  cobolCode::SET HIPAA-FETCH-END-NO TO TRUE
    methodOut.setHipaaFetchEndNoTrue();

    //  cobolCode::MOVE HIPAA-VER-NBR TO CRTN-HIPAA-VER-NBR
    methodOut.setCrtnHipaaVerNbr(methodOut.getHipaaVerNbr());
    //  cobolCode::SET CRTN-GENERIC-CSR TO TRUE
    methodOut.setCrtnGenericCsrTrue();

    //  cobolCode::SET CRTN-FUNCTION-IS-OPEN TO TRUE
    methodOut.setCrtnFunctionIsOpenTrue();

    //  cobolCode::CALL C5427HPC USING DFHEIBLK, CACHE-COMM-AREA
    try {
      programCtx.setRc(
          c5427hpc.call(
              programCtx.getGlobalCtx().getContext("C5427HPC"),
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
        // cobolCode::GO TO 0000-EXIT
        exit(programCtx);
        return methodOut;
        // cobolCodeEnds::GO TO 0000-EXIT

    }
    //  cobolCode::IF NOT CRTN-SRCH-FOUND-SW-IS-OVERFLOW
    if (!(methodIn.isCrtnSrchFoundSwIsOverflow())) {
      // cobolCode::GO TO 2100-EXIT
      return methodOut;
      // cobolCodeEnds::GO TO 2100-EXIT
    }
    //  cobolCode::SELECT HIPAA_CD , GRNRC_RQST_CD FROM HIPAA_PROC_CD WHERE HIPAA_VER_NBR = ? AND
    // GRNRC_RQST_CD IN ( 'S' , 'G' ) ORDER BY HIPAA_CD FOR FETCH ONLY
    programCtx.setHipaaGenericCsrResultSet(
        d5427hpcRepository.openHipaaGenericCsrD5427hpc(
            programCtx.getSqlca(), methodIn.getDclhipaaProcCd()));
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
      //  cobolCode::MOVE 'HIPAA_PROC_CD' TO DSM-ERR-TBL-NAME
      methodOut.setDsmErrTblName(CONSTANTS.LITERAL_HIPAA_PROC_CD_B12_);
      //  cobolCode::MOVE '2100-OPEN-GENERIC-CURSOR' TO DSM-ERR-SECTN-NAME
      methodOut.setDsmErrSectnName(CONSTANTS.LITERAL_1495827039);
      //  cobolCode::PERFORM 7777-MOVES-FOR-ERROR-LOG
      movesForErrorLog(programCtx.getMovesForErrorLogInCtx()); /*7777-MOVES-FOR-ERROR-LOG SECTION*/
      if (programCtx.isProgramEnded()) {
        return methodOut;
      }
    }

    return methodOut;
  }
  /**
   * fetchGenericCursor This method is derived from COBOL Paragraph - 2200-FETCH-GENERIC-CURSOR
   * SECTION COBOL Cyclomatic complexity - 14 Input :
   *
   * <p>- lneSub COBOL Name: WS-LNE-SUB - sqlcode_Ws COBOL Name: WS-SQLCODE - crtnSrchFoundSw COBOL
   * Name: CRTN-SRCH-FOUND-SW - dsmFuncCd COBOL Name: DSM-FUNC-CD - crtnHipaaCd COBOL Name:
   * CRTN-HIPAA-CD - crtnGrnrcRqstCd COBOL Name: CRTN-GRNRC-RQST-CD
   *
   * <p>Output :
   *
   * <p>- lneSub COBOL Name: WS-LNE-SUB - crtnFunction COBOL Name: CRTN-FUNCTION - rc COBOL Name:
   * RETURN-CODE - returnCode COBOL Name: WS-RETURN-CODE - dsmReturnCode COBOL Name: DSM-RETURN-CODE
   * - dsmSqlErrorLevel COBOL Name: DSM-SQL-ERROR-LEVEL - dsmEditErrorValueTxt COBOL Name:
   * DSM-EDIT-ERROR-VALUE-TXT - dsmFuncCd COBOL Name: DSM-FUNC-CD - dsmEditErrorField COBOL Name:
   * DSM-EDIT-ERROR-FIELD - sqlcode COBOL Name: SQLCODE - hipaaCd COBOL Name: HIPAA-CD - crtnHipaaCd
   * COBOL Name: CRTN-HIPAA-CD - grnrcRqstCd COBOL Name: GRNRC-RQST-CD - crtnGrnrcRqstCd COBOL Name:
   * CRTN-GRNRC-RQST-CD - sqlcode_Ws COBOL Name: WS-SQLCODE - dsmSqlcode COBOL Name: DSM-SQLCODE -
   * hpcRetHipaaCd COBOL Name: HPC-RET-HIPAA-CD - hpcRetGrnrcRqstCd COBOL Name:
   * HPC-RET-GRNRC-RQST-CD - hpcRetCnt COBOL Name: HPC-RET-CNT - dsmErrTblAction COBOL Name:
   * DSM-ERR-TBL-ACTION - dsmErrTblName COBOL Name: DSM-ERR-TBL-NAME - dsmErrSectnName COBOL Name:
   * DSM-ERR-SECTN-NAME
   *
   * @throws CFException
   */
  @Override
  public FetchGenericCursorOutCtx fetchGenericCursor(FetchGenericCursorInCtx methodIn)
      throws Exception {

    // *81***************************************************************
    // *81 2200-Fetch-generic-cursor section.                           *
    // *81                                                              *
    // *81 business function:                                           *
    // *81 fetch table hipaa_proc_cd - hipaa_generic_csr                *
    // *81***************************************************************
    // *82***************************************************************
    // *82 2200-fetch-generic-cursor section.                           *
    // *82                                                              *
    // *82 1. fetch all records from the hipaa_generic_csr cursor       *
    // *82***************************************************************
    // Added variable to get the program context in place.
    D5427hpcCtx programCtx = methodIn.getD5427hpcCtx();
    // Added variable to get the output context in place.
    FetchGenericCursorOutCtx methodOut = methodIn.getFetchGenericCursorOutCtx();
    //  cobolCode::PERFORM VARYING WS-LNE-SUB FROM +1 BY +1 UNTIL WS-LNE-SUB > 300 OR
    // WS-SQLCODE-FETCH-END
    for (methodOut.setLneSub(1);
        ((methodOut.getLneSub() <= 300) && !(methodIn.isSqlcodeFetchEnd()));
        methodOut.setLneSub(methodOut.getLneSub() + 1)) {

      // *            Until ws-lne-sub > 26 or ws-sqlcode-fetch-end
      // ***          until ws-lne-sub > 99 or ws-sqlcode-fetch-end
      //  cobolCode::IF NOT CRTN-SRCH-FOUND-SW-IS-OVERFLOW
      if (!(methodIn.isCrtnSrchFoundSwIsOverflow())) {
        //  cobolCode::SET CRTN-FUNCTION-IS-FETCH TO TRUE
        methodOut.setCrtnFunctionIsFetchTrue();

        //  cobolCode::CALL C5427HPC USING DFHEIBLK, CACHE-COMM-AREA
        try {
          programCtx.setRc(
              c5427hpc.call(
                  programCtx.getGlobalCtx().getContext("C5427HPC"),
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
            //  cobolCode::MOVE 'GENERIC FETCH TO CACHE MODULE' TO DSM-EDIT-ERROR-FIELD
            methodOut.setDsmEditErrorField(CONSTANTS.LITERAL_GENERIC_B5_FETCHTOCACHEMODULE);
            // cobolCode::GO TO 0000-EXIT
            exit(programCtx);
            return methodOut;
            // cobolCodeEnds::GO TO 0000-EXIT

        }
        //  cobolCode::EVALUATE TRUE
        if (methodIn.isCrtnSrchFoundSwIsYes()) {
          methodOut.setSqlcode(0);
          //  cobolCode::MOVE CRTN-HIPAA-CD TO HIPAA-CD
          methodOut.setHipaaCd(methodOut.getCrtnHipaaCd());
          //  cobolCode::MOVE CRTN-GRNRC-RQST-CD TO GRNRC-RQST-CD
          methodOut.setGrnrcRqstCd(methodOut.getCrtnGrnrcRqstCd());
        } else {
          methodOut.setSqlcode(100);
        }
      }
      //  cobolCode::ELSE
      else {
        //  cobolCode::FETCH HIPAA_GENERIC_CSR INTO ? , ?
        d5427hpcRepository.fetchHipaaGenericCsrD5427hpc(
            programCtx.getHipaaGenericCsrResultSet(),
            programCtx.getSqlca(),
            methodOut.getDclhipaaProcCd());
      }
      //  cobolCode::MOVE SQLCODE TO WS-SQLCODE DSM-SQLCODE
      methodOut.setSqlcode_Ws(methodOut.getSqlcode());
      methodOut.setDsmSqlcode(methodOut.getSqlcode());
      //  cobolCode::EVALUATE TRUE
      if (methodOut.isSqlcodeOk()) {

        // *                 If ws-lne-sub > 25
        // *                    set hpc-ret-code-more-rows to true
        // *                 else
        //  cobolCode::MOVE HIPAA-CD TO HPC-RET-HIPAA-CD ( WS-LNE-SUB )
        methodOut.setHpcRetHipaaCd(methodOut.getLneSub() - 1, methodOut.getHipaaCd());
        //  cobolCode::MOVE GRNRC-RQST-CD TO HPC-RET-GRNRC-RQST-CD ( WS-LNE-SUB )
        methodOut.setHpcRetGrnrcRqstCd(methodOut.getLneSub() - 1, methodOut.getGrnrcRqstCd());
        //  cobolCode::MOVE WS-LNE-SUB TO HPC-RET-CNT
        methodOut.setHpcRetCnt(methodOut.getLneSub());
      } else if (methodIn.isSqlcodeFetchEnd()) {
        //  cobolCode::IF HPC-RET-CNT = 0
        if ((methodOut.getHpcRetCnt() == 0)) {
          //  cobolCode::SET DSM-ENTRY-NOT-FND-INQ TO TRUE
          methodOut.setDsmEntryNotFndInqTrue();
        }
      } else {
        //  cobolCode::SET DSM-DB2-ERROR TO TRUE
        methodOut.setDsmDb2ErrorTrue();

        //  cobolCode::MOVE 'FETCH' TO DSM-ERR-TBL-ACTION
        methodOut.setDsmErrTblAction(CONSTANTS.LITERAL_FETCH_B5_);
        //  cobolCode::MOVE 'HIPAA_PROC_CD' TO DSM-ERR-TBL-NAME
        methodOut.setDsmErrTblName(CONSTANTS.LITERAL_HIPAA_PROC_CD_B12_);
        //  cobolCode::MOVE '2200-FETCH-GENERIC-CURSOR' TO DSM-ERR-SECTN-NAME
        methodOut.setDsmErrSectnName(CONSTANTS.LITERAL_1686698804);
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
   * closeGenericCursor This method is derived from COBOL Paragraph - 2300-CLOSE-GENERIC-CURSOR
   * SECTION COBOL Cyclomatic complexity - 5 Input :
   *
   * <p>- crtnSrchFoundSw COBOL Name: CRTN-SRCH-FOUND-SW
   *
   * <p>Output :
   *
   * <p>- sqlcode COBOL Name: SQLCODE - sqlcode_Ws COBOL Name: WS-SQLCODE - dsmSqlcode COBOL Name:
   * DSM-SQLCODE - dsmReturnCode COBOL Name: DSM-RETURN-CODE - dsmErrTblAction COBOL Name:
   * DSM-ERR-TBL-ACTION - dsmErrTblName COBOL Name: DSM-ERR-TBL-NAME - dsmErrSectnName COBOL Name:
   * DSM-ERR-SECTN-NAME
   *
   * @throws CFException
   */
  @Override
  public CloseGenericCursorOutCtx closeGenericCursor(CloseGenericCursorInCtx methodIn)
      throws Exception {

    // *81***************************************************************
    // *81 2300-Close-generic-cursor.                                   *
    // *81                                                              *
    // *81 business function:                                           *
    // *81 close table hipaa_proc_cd - hipaa_generic_csr                *
    // *81***************************************************************
    // *82***************************************************************
    // *82 2300-close-generic-cursor.                                   *
    // *82                                                              *
    // *82 1. close the cursor for hipaa_proc_cd table for generic req  *
    // *82***************************************************************
    // Added variable to get the program context in place.
    D5427hpcCtx programCtx = methodIn.getD5427hpcCtx();
    // Added variable to get the output context in place.
    CloseGenericCursorOutCtx methodOut = methodIn.getCloseGenericCursorOutCtx();
    //  cobolCode::IF CRTN-SRCH-FOUND-SW-IS-OVERFLOW
    if (methodIn.isCrtnSrchFoundSwIsOverflow()) {
      //  cobolCode::CLOSE HIPAA_GENERIC_CSR
      d5427hpcRepository.closeHipaaGenericCsrD5427hpc(
          programCtx.getHipaaGenericCsrResultSet(), programCtx.getSqlca());
    }
    //  cobolCode::ELSE
    else {
      methodOut.setSqlcode(0);
    }
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
      //  cobolCode::MOVE 'HIPAA_PROC_CD' TO DSM-ERR-TBL-NAME
      methodOut.setDsmErrTblName(CONSTANTS.LITERAL_HIPAA_PROC_CD_B12_);
      //  cobolCode::MOVE '2300-CLOSE-GENERIC-CURSOR' TO DSM-ERR-SECTN-NAME
      methodOut.setDsmErrSectnName(CONSTANTS.LITERAL_751832211);
      //  cobolCode::PERFORM 7777-MOVES-FOR-ERROR-LOG
      movesForErrorLog(programCtx.getMovesForErrorLogInCtx()); /*7777-MOVES-FOR-ERROR-LOG SECTION*/
      if (programCtx.isProgramEnded()) {
        return methodOut;
      }
    }

    return methodOut;
  }
  /**
   * processExplicit This method is derived from COBOL Paragraph - 3000-PROCESS-EXPLICIT SECTION
   * COBOL Cyclomatic complexity - 4 Input :
   *
   * <p>- sqlcode_Ws COBOL Name: WS-SQLCODE
   *
   * <p>Output :
   *
   * <p>- hipaaFetchSw COBOL Name: WS-HIPAA-FETCH-SW - hpcRetCodeMoreSw COBOL Name:
   * HPC-RET-CODE-MORE-SW
   *
   * @throws CFException
   */
  @Override
  public ProcessExplicitOutCtx processExplicit(ProcessExplicitInCtx methodIn) throws Exception {

    // *81***************************************************************
    // *81 3000-Process-explicit                                        *
    // *81                                                              *
    // *81 business function:to get the hipaa proc codes for explicit   *
    // *81                   and group level request                    *
    // *81***************************************************************
    // *82***************************************************************
    // *82 1. check  whether the request is group level or explicit     *
    // *82    by comparing the hipaa service code recieved with the     *
    // *82    group explicit and group level request.                   *
    // *82 2. based on the sqlcode perform the rest of the processing   *
    // *82 3. if no rows have been retrieved from the hipaa_proc_cd for *
    // *82    hipaa_cd, perform the 4000-explicit-data section          *
    // *82***************************************************************
    // Added variable to get the program context in place.
    D5427hpcCtx programCtx = methodIn.getD5427hpcCtx();
    // Added variable to get the output context in place.
    ProcessExplicitOutCtx methodOut = methodIn.getProcessExplicitOutCtx();
    //  cobolCode::SET HIPAA-FETCH-END-NO TO TRUE
    methodOut.setHipaaFetchEndNoTrue();

    //  cobolCode::PERFORM 3100-OPEN-GROUP-CURSOR
    openGroupCursor(programCtx.getOpenGroupCursorInCtx()); /*3100-OPEN-GROUP-CURSOR SECTION*/
    if (programCtx.isProgramEnded()) {
      return methodOut;
    }
    //  cobolCode::IF WS-SQLCODE-OK
    if (methodIn.isSqlcodeOk()) {
      //  cobolCode::SET HPC-RET-NO-MORE-ROWS TO TRUE
      methodOut.setHpcRetNoMoreRowsTrue();

      //  cobolCode::PERFORM 3200-FETCH-GROUP-CURSOR
      fetchGroupCursor(programCtx.getFetchGroupCursorInCtx()); /*3200-FETCH-GROUP-CURSOR SECTION*/
      if (programCtx.isProgramEnded()) {
        return methodOut;
      }
    }
    //  cobolCode::IF WS-SQLCODE-OK OR WS-SQLCODE-FETCH-END
    if (methodIn.isSqlcodeOk() || methodIn.isSqlcodeFetchEnd()) {
      //  cobolCode::PERFORM 3300-CLOSE-GROUP-CURSOR
      closeGroupCursor(programCtx.getCloseGroupCursorInCtx()); /*3300-CLOSE-GROUP-CURSOR SECTION*/
      if (programCtx.isProgramEnded()) {
        return methodOut;
      }
    }

    return methodOut;
  }
  /**
   * openGroupCursor This method is derived from COBOL Paragraph - 3100-OPEN-GROUP-CURSOR SECTION
   * COBOL Cyclomatic complexity - 8 Input :
   *
   * <p>- hpcReqHipaaCd COBOL Name: HPC-REQ-HIPAA-CD - hpcReqHipaaVerNbr COBOL Name:
   * HPC-REQ-HIPAA-VER-NBR - dsmFuncCd COBOL Name: DSM-FUNC-CD - crtnSrchFoundSw COBOL Name:
   * CRTN-SRCH-FOUND-SW - sqlcode COBOL Name: SQLCODE
   *
   * <p>Output :
   *
   * <p>- hipaaGrpCd COBOL Name: HIPAA-GRP-CD - hpcReqHipaaCd COBOL Name: HPC-REQ-HIPAA-CD -
   * hipaaVerNbr COBOL Name: HIPAA-VER-NBR - hpcReqHipaaVerNbr COBOL Name: HPC-REQ-HIPAA-VER-NBR -
   * crtnHipaaVerNbr COBOL Name: CRTN-HIPAA-VER-NBR - crtnKeyCode COBOL Name: CRTN-KEY-CODE -
   * crtnCallType COBOL Name: CRTN-CALL-TYPE - crtnFunction COBOL Name: CRTN-FUNCTION - rc COBOL
   * Name: RETURN-CODE - returnCode COBOL Name: WS-RETURN-CODE - dsmReturnCode COBOL Name:
   * DSM-RETURN-CODE - dsmSqlErrorLevel COBOL Name: DSM-SQL-ERROR-LEVEL - dsmEditErrorValueTxt COBOL
   * Name: DSM-EDIT-ERROR-VALUE-TXT - dsmFuncCd COBOL Name: DSM-FUNC-CD - dsmEditErrorField COBOL
   * Name: DSM-EDIT-ERROR-FIELD - sqlcode_Ws COBOL Name: WS-SQLCODE - dsmSqlcode COBOL Name:
   * DSM-SQLCODE - sqlcode COBOL Name: SQLCODE - dsmErrTblAction COBOL Name: DSM-ERR-TBL-ACTION -
   * dsmErrTblName COBOL Name: DSM-ERR-TBL-NAME - dsmErrSectnName COBOL Name: DSM-ERR-SECTN-NAME
   *
   * @throws CFException
   */
  @Override
  public OpenGroupCursorOutCtx openGroupCursor(OpenGroupCursorInCtx methodIn) throws Exception {

    // *81                                                              *
    // *81 Business function:                                           *
    // *81 open hipaa_proc_cd table - hipaa_group_csr                   *
    // *81***************************************************************
    // *82***************************************************************
    // *82 3100-open-group-cursor section.                              *
    // *82                                                              *
    // *82 1. open cursor for hipaa_proc_cd                             *
    // *82                                                              *
    // *82***************************************************************
    // Added variable to get the program context in place.
    D5427hpcCtx programCtx = methodIn.getD5427hpcCtx();
    // Added variable to get the output context in place.
    OpenGroupCursorOutCtx methodOut = methodIn.getOpenGroupCursorOutCtx();
    //  cobolCode::MOVE HPC-REQ-HIPAA-CD TO HIPAA-GRP-CD
    methodOut.setHipaaGrpCd(methodOut.getHpcReqHipaaCd());
    //  cobolCode::MOVE HPC-REQ-HIPAA-VER-NBR TO HIPAA-VER-NBR
    methodOut.setHipaaVerNbr(methodOut.getHpcReqHipaaVerNbr());
    //  cobolCode::MOVE HIPAA-VER-NBR TO CRTN-HIPAA-VER-NBR
    methodOut.setCrtnHipaaVerNbr(methodOut.getHipaaVerNbr());
    //  cobolCode::MOVE HIPAA-GRP-CD TO CRTN-KEY-CODE
    methodOut.setCrtnKeyCode(methodOut.getHipaaGrpCd());
    //  cobolCode::SET CRTN-GROUP-CSR TO TRUE
    methodOut.setCrtnGroupCsrTrue();

    //  cobolCode::SET CRTN-FUNCTION-IS-OPEN TO TRUE
    methodOut.setCrtnFunctionIsOpenTrue();

    //  cobolCode::CALL C5427HPC USING DFHEIBLK, CACHE-COMM-AREA
    try {
      programCtx.setRc(
          c5427hpc.call(
              programCtx.getGlobalCtx().getContext("C5427HPC"),
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
        //  cobolCode::MOVE 'GROUP CALL TO CACHE MODULE' TO DSM-EDIT-ERROR-FIELD
        methodOut.setDsmEditErrorField(CONSTANTS.LITERAL_GROUP_B8_CALLTOCACHEMODULE);
        // cobolCode::GO TO 0000-EXIT
        exit(programCtx);
        return methodOut;
        // cobolCodeEnds::GO TO 0000-EXIT

    }
    //  cobolCode::IF NOT CRTN-SRCH-FOUND-SW-IS-OVERFLOW
    if (!(methodIn.isCrtnSrchFoundSwIsOverflow())) {
      // cobolCode::GO TO 3100-EXIT
      return methodOut;
      // cobolCodeEnds::GO TO 3100-EXIT
    }
    //  cobolCode::SELECT HIPAA_CD FROM HIPAA_PROC_CD WHERE HIPAA_GRP_CD = ? AND HIPAA_VER_NBR = ?
    // ORDER BY HIPAA_CD FOR FETCH ONLY
    programCtx.setHipaaGroupCsrResultSet(
        d5427hpcRepository.openHipaaGroupCsrD5427hpc(
            programCtx.getSqlca(), methodIn.getDclhipaaProcCd()));
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
      //  cobolCode::MOVE 'HIPAA_PROC_CD' TO DSM-ERR-TBL-NAME
      methodOut.setDsmErrTblName(CONSTANTS.LITERAL_HIPAA_PROC_CD_B12_);
      //  cobolCode::MOVE '3100-OPEN-GROUP-CURSOR' TO DSM-ERR-SECTN-NAME
      methodOut.setDsmErrSectnName(CONSTANTS.LITERAL_1126727112);
      //  cobolCode::PERFORM 7777-MOVES-FOR-ERROR-LOG
      movesForErrorLog(programCtx.getMovesForErrorLogInCtx()); /*7777-MOVES-FOR-ERROR-LOG SECTION*/
      if (programCtx.isProgramEnded()) {
        return methodOut;
      }
    }

    return methodOut;
  }
  /**
   * fetchGroupCursor This method is derived from COBOL Paragraph - 3200-FETCH-GROUP-CURSOR SECTION
   * COBOL Cyclomatic complexity - 15 Input :
   *
   * <p>- lneSub COBOL Name: WS-LNE-SUB - sqlcode_Ws COBOL Name: WS-SQLCODE - explicitReqSw COBOL
   * Name: WS-EXPLICIT-REQ-SW - crtnSrchFoundSw COBOL Name: CRTN-SRCH-FOUND-SW - dsmFuncCd COBOL
   * Name: DSM-FUNC-CD - crtnHipaaCd COBOL Name: CRTN-HIPAA-CD
   *
   * <p>Output :
   *
   * <p>- lneSub COBOL Name: WS-LNE-SUB - crtnFunction COBOL Name: CRTN-FUNCTION - rc COBOL Name:
   * RETURN-CODE - returnCode COBOL Name: WS-RETURN-CODE - dsmReturnCode COBOL Name: DSM-RETURN-CODE
   * - dsmSqlErrorLevel COBOL Name: DSM-SQL-ERROR-LEVEL - dsmEditErrorValueTxt COBOL Name:
   * DSM-EDIT-ERROR-VALUE-TXT - dsmFuncCd COBOL Name: DSM-FUNC-CD - dsmEditErrorField COBOL Name:
   * DSM-EDIT-ERROR-FIELD - sqlcode COBOL Name: SQLCODE - hipaaCd COBOL Name: HIPAA-CD - crtnHipaaCd
   * COBOL Name: CRTN-HIPAA-CD - sqlcode_Ws COBOL Name: WS-SQLCODE - dsmSqlcode COBOL Name:
   * DSM-SQLCODE - hpcRetHipaaCd COBOL Name: HPC-RET-HIPAA-CD - hpcRetCnt COBOL Name: HPC-RET-CNT -
   * explicitReqSw COBOL Name: WS-EXPLICIT-REQ-SW - dsmErrTblAction COBOL Name: DSM-ERR-TBL-ACTION -
   * dsmErrTblName COBOL Name: DSM-ERR-TBL-NAME - dsmErrSectnName COBOL Name: DSM-ERR-SECTN-NAME
   *
   * @throws CFException
   */
  @Override
  public FetchGroupCursorOutCtx fetchGroupCursor(FetchGroupCursorInCtx methodIn) throws Exception {

    // *81***************************************************************
    // *81 3200-Fetch-group-cursor section.                             *
    // *81                                                              *
    // *81 business function:                                           *
    // *81 fetch hipaa_proc_cd table - hipaa_group_csr                  *
    // *81***************************************************************
    // *82***************************************************************
    // *82 3200-fetch-group-cursor section.                             *
    // *82                                                              *
    // *82 1. fetch the data for the hipaa_group_csr cursor             *
    // *82 2. if no hipaa codes haev been retrived via hipaa_group_csr  *
    // *82    perform explicit request to check if the hipaa code is    *
    // *82    present in the hipaa_proc_cd table                        *
    // *82***************************************************************
    // Added variable to get the program context in place.
    D5427hpcCtx programCtx = methodIn.getD5427hpcCtx();
    // Added variable to get the output context in place.
    FetchGroupCursorOutCtx methodOut = methodIn.getFetchGroupCursorOutCtx();
    //  cobolCode::PERFORM VARYING WS-LNE-SUB FROM +1 BY +1 UNTIL WS-LNE-SUB > 300 OR
    // WS-SQLCODE-FETCH-END OR WS-EXPLICIT-REQ
    for (methodOut.setLneSub(1);
        ((methodOut.getLneSub() <= 300)
            && !(methodIn.isSqlcodeFetchEnd())
            && !(methodOut.isExplicitReq()));
        methodOut.setLneSub(methodOut.getLneSub() + 1)) {

      // *            Until ws-lne-sub > 26 or ws-sqlcode-fetch-end
      // ***          until ws-lne-sub > 99 or ws-sqlcode-fetch-end
      //  cobolCode::IF NOT CRTN-SRCH-FOUND-SW-IS-OVERFLOW
      if (!(methodIn.isCrtnSrchFoundSwIsOverflow())) {
        //  cobolCode::SET CRTN-FUNCTION-IS-FETCH TO TRUE
        methodOut.setCrtnFunctionIsFetchTrue();

        //  cobolCode::CALL C5427HPC USING DFHEIBLK, CACHE-COMM-AREA
        try {
          programCtx.setRc(
              c5427hpc.call(
                  programCtx.getGlobalCtx().getContext("C5427HPC"),
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
            //  cobolCode::MOVE 'GENERIC FETCH TO CACHE MODULE' TO DSM-EDIT-ERROR-FIELD
            methodOut.setDsmEditErrorField(CONSTANTS.LITERAL_GENERIC_B5_FETCHTOCACHEMODULE);
            // cobolCode::GO TO 0000-EXIT
            exit(programCtx);
            return methodOut;
            // cobolCodeEnds::GO TO 0000-EXIT

        }
        //  cobolCode::EVALUATE TRUE
        if (methodIn.isCrtnSrchFoundSwIsYes()) {
          methodOut.setSqlcode(0);
          //  cobolCode::MOVE CRTN-HIPAA-CD TO HIPAA-CD
          methodOut.setHipaaCd(methodOut.getCrtnHipaaCd());
        } else {
          methodOut.setSqlcode(100);
        }
      }
      //  cobolCode::ELSE
      else {
        //  cobolCode::FETCH HIPAA_GROUP_CSR INTO ?
        d5427hpcRepository.fetchHipaaGroupCsrD5427hpc(
            programCtx.getHipaaGroupCsrResultSet(),
            programCtx.getSqlca(),
            methodOut.getDclhipaaProcCd());
      }
      //  cobolCode::MOVE SQLCODE TO WS-SQLCODE DSM-SQLCODE
      methodOut.setSqlcode_Ws(methodOut.getSqlcode());
      methodOut.setDsmSqlcode(methodOut.getSqlcode());
      //  cobolCode::EVALUATE TRUE
      if (methodOut.isSqlcodeOk()) {

        // *                  If ws-lne-sub > 25
        // *                     set hpc-ret-code-more-rows to true
        // *                  else
        //  cobolCode::MOVE HIPAA-CD TO HPC-RET-HIPAA-CD ( WS-LNE-SUB )
        methodOut.setHpcRetHipaaCd(methodOut.getLneSub() - 1, methodOut.getHipaaCd());
        //  cobolCode::MOVE WS-LNE-SUB TO HPC-RET-CNT
        methodOut.setHpcRetCnt(methodOut.getLneSub());
      } else if (methodIn.isSqlcodeFetchEnd()) {
        //  cobolCode::IF HPC-RET-CNT = 0
        if ((methodOut.getHpcRetCnt() == 0)) {
          //  cobolCode::SET WS-EXPLICIT-REQ TO TRUE
          methodOut.setExplicitReqTrue();

          //  cobolCode::PERFORM 4000-EXPLICIT-DATA
          explicitData(programCtx.getExplicitDataInCtx()); /*4000-EXPLICIT-DATA SECTION*/
          if (programCtx.isProgramEnded()) {
            return methodOut;
          }
        }
      } else {
        //  cobolCode::SET DSM-DB2-ERROR TO TRUE
        methodOut.setDsmDb2ErrorTrue();

        //  cobolCode::MOVE 'FETCH' TO DSM-ERR-TBL-ACTION
        methodOut.setDsmErrTblAction(CONSTANTS.LITERAL_FETCH_B5_);
        //  cobolCode::MOVE 'HIPAA_PROC_CD' TO DSM-ERR-TBL-NAME
        methodOut.setDsmErrTblName(CONSTANTS.LITERAL_HIPAA_PROC_CD_B12_);
        //  cobolCode::MOVE '3200-FETCH-GROUP-CURSOR' TO DSM-ERR-SECTN-NAME
        methodOut.setDsmErrSectnName(CONSTANTS.LITERAL_721521691);
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
   * closeGroupCursor This method is derived from COBOL Paragraph - 3300-CLOSE-GROUP-CURSOR SECTION
   * COBOL Cyclomatic complexity - 5 Input :
   *
   * <p>- crtnSrchFoundSw COBOL Name: CRTN-SRCH-FOUND-SW
   *
   * <p>Output :
   *
   * <p>- sqlcode COBOL Name: SQLCODE - sqlcode_Ws COBOL Name: WS-SQLCODE - dsmSqlcode COBOL Name:
   * DSM-SQLCODE - dsmReturnCode COBOL Name: DSM-RETURN-CODE - dsmErrTblAction COBOL Name:
   * DSM-ERR-TBL-ACTION - dsmErrTblName COBOL Name: DSM-ERR-TBL-NAME - dsmErrSectnName COBOL Name:
   * DSM-ERR-SECTN-NAME
   *
   * @throws CFException
   */
  @Override
  public CloseGroupCursorOutCtx closeGroupCursor(CloseGroupCursorInCtx methodIn) throws Exception {

    // *81***************************************************************
    // *81 3300-Close-group-cursor                                      *
    // *81                                                              *
    // *81 business function:                                           *
    // *81 close hipaa_proc_cd table - hipaa_group_csr                  *
    // *81***************************************************************
    // *82***************************************************************
    // *82 3300-close-group-cursor                                      *
    // *82                                                              *
    // *82 1. used to close cursor for hipaa_proc_cd table for group    *
    // *82    request                                                   *
    // *82                                                              *
    // *82***************************************************************
    // Added variable to get the program context in place.
    D5427hpcCtx programCtx = methodIn.getD5427hpcCtx();
    // Added variable to get the output context in place.
    CloseGroupCursorOutCtx methodOut = methodIn.getCloseGroupCursorOutCtx();
    //  cobolCode::IF CRTN-SRCH-FOUND-SW-IS-OVERFLOW
    if (methodIn.isCrtnSrchFoundSwIsOverflow()) {
      //  cobolCode::CLOSE HIPAA_GROUP_CSR
      d5427hpcRepository.closeHipaaGroupCsrD5427hpc(
          programCtx.getHipaaGroupCsrResultSet(), programCtx.getSqlca());
    }
    //  cobolCode::ELSE
    else {
      methodOut.setSqlcode(0);
    }
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
      //  cobolCode::MOVE 'HIPAA_PROC_CD' TO DSM-ERR-TBL-NAME
      methodOut.setDsmErrTblName(CONSTANTS.LITERAL_HIPAA_PROC_CD_B12_);
      //  cobolCode::MOVE '3300-CLOSE-GROUP-CURSOR' TO DSM-ERR-SECTN-NAME
      methodOut.setDsmErrSectnName(CONSTANTS.LITERAL_213344902);
      //  cobolCode::PERFORM 7777-MOVES-FOR-ERROR-LOG
      movesForErrorLog(programCtx.getMovesForErrorLogInCtx()); /*7777-MOVES-FOR-ERROR-LOG SECTION*/
      if (programCtx.isProgramEnded()) {
        return methodOut;
      }
    }

    return methodOut;
  }
  /**
   * explicitData This method is derived from COBOL Paragraph - 4000-EXPLICIT-DATA SECTION COBOL
   * Cyclomatic complexity - 11 Input :
   *
   * <p>- hpcReqHipaaCd COBOL Name: HPC-REQ-HIPAA-CD - hpcReqHipaaVerNbr COBOL Name:
   * HPC-REQ-HIPAA-VER-NBR - dsmFuncCd COBOL Name: DSM-FUNC-CD - crtnSrchFoundSw COBOL Name:
   * CRTN-SRCH-FOUND-SW - crtnHipaaCd COBOL Name: CRTN-HIPAA-CD - hpcRetCnt COBOL Name: HPC-RET-CNT
   * - explicitReqSw COBOL Name: WS-EXPLICIT-REQ-SW
   *
   * <p>Output :
   *
   * <p>- hipaaCd COBOL Name: HIPAA-CD - hpcReqHipaaCd COBOL Name: HPC-REQ-HIPAA-CD - hipaaVerNbr
   * COBOL Name: HIPAA-VER-NBR - hpcReqHipaaVerNbr COBOL Name: HPC-REQ-HIPAA-VER-NBR -
   * crtnHipaaVerNbr COBOL Name: CRTN-HIPAA-VER-NBR - crtnKeyCode COBOL Name: CRTN-KEY-CODE -
   * crtnCallType COBOL Name: CRTN-CALL-TYPE - rc COBOL Name: RETURN-CODE - returnCode COBOL Name:
   * WS-RETURN-CODE - dsmReturnCode COBOL Name: DSM-RETURN-CODE - dsmSqlErrorLevel COBOL Name:
   * DSM-SQL-ERROR-LEVEL - dsmEditErrorValueTxt COBOL Name: DSM-EDIT-ERROR-VALUE-TXT - dsmFuncCd
   * COBOL Name: DSM-FUNC-CD - dsmEditErrorField COBOL Name: DSM-EDIT-ERROR-FIELD - sqlcode COBOL
   * Name: SQLCODE - crtnHipaaCd COBOL Name: CRTN-HIPAA-CD - sqlcode_Ws COBOL Name: WS-SQLCODE -
   * dsmSqlcode COBOL Name: DSM-SQLCODE - hpcRetCnt COBOL Name: HPC-RET-CNT - hpcRetHipaaCd COBOL
   * Name: HPC-RET-HIPAA-CD - dsmErrTblAction COBOL Name: DSM-ERR-TBL-ACTION - dsmErrTblName COBOL
   * Name: DSM-ERR-TBL-NAME - dsmErrSectnName COBOL Name: DSM-ERR-SECTN-NAME
   *
   * @throws CFException
   */
  @Override
  public ExplicitDataOutCtx explicitData(ExplicitDataInCtx methodIn) throws Exception {

    // *81***************************************************************
    // *81 4000-Explicit-data section.                                  *
    // *81                                                              *
    // *81 business function:                                           *
    // *81 process explicit data to retrieve hipaa code                 *
    // *81***************************************************************
    // *82***************************************************************
    // *82                                                              *
    // *82 1. used to retrieve hipaa code from the hipaa proc code      *
    // *82    table.the hipaa group code is moved to the hipaa-cd field *
    // *82    to check if this is present in the table or not.          *
    // *82                                                              *
    // *82***************************************************************
    // Added variable to get the program context in place.
    D5427hpcCtx programCtx = methodIn.getD5427hpcCtx();
    // Added variable to get the output context in place.
    ExplicitDataOutCtx methodOut = methodIn.getExplicitDataOutCtx();
    //  cobolCode::MOVE HPC-REQ-HIPAA-CD TO HIPAA-CD
    methodOut.setHipaaCd(methodOut.getHpcReqHipaaCd());
    //  cobolCode::MOVE HPC-REQ-HIPAA-VER-NBR TO HIPAA-VER-NBR
    methodOut.setHipaaVerNbr(methodOut.getHpcReqHipaaVerNbr());
    //  cobolCode::MOVE HIPAA-VER-NBR TO CRTN-HIPAA-VER-NBR
    methodOut.setCrtnHipaaVerNbr(methodOut.getHipaaVerNbr());
    //  cobolCode::MOVE HIPAA-CD TO CRTN-KEY-CODE
    methodOut.setCrtnKeyCode(methodOut.getHipaaCd());
    //  cobolCode::SET CRTN-SELECT TO TRUE
    methodOut.setCrtnSelectTrue();

    //  cobolCode::CALL C5427HPC USING DFHEIBLK, CACHE-COMM-AREA
    try {
      programCtx.setRc(
          c5427hpc.call(
              programCtx.getGlobalCtx().getContext("C5427HPC"),
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
        //  cobolCode::MOVE 'SELECT CALL TO CACHE MODULE' TO DSM-EDIT-ERROR-FIELD
        methodOut.setDsmEditErrorField(CONSTANTS.LITERAL_SELECT_B7_CALLTOCACHEMODULE);
        // cobolCode::GO TO 0000-EXIT
        exit(programCtx);
        return methodOut;
        // cobolCodeEnds::GO TO 0000-EXIT

    }
    //  cobolCode::IF CRTN-SRCH-FOUND-SW-IS-OVERFLOW
    if (methodIn.isCrtnSrchFoundSwIsOverflow()) {
      //  cobolCode::SELECT HIPAA_CD FROM HIPAA_PROC_CD WHERE HIPAA_CD = ? AND HIPAA_VER_NBR = ?
      d5427hpcRepository.selectHipaaProcCd(programCtx.getSqlca(), methodOut.getDclhipaaProcCd());
    }
    //  cobolCode::ELSE
    else {
      //  cobolCode::EVALUATE TRUE
      if (methodIn.isCrtnSrchFoundSwIsYes()) {
        methodOut.setSqlcode(0);
        //  cobolCode::MOVE CRTN-HIPAA-CD TO HIPAA-CD
        methodOut.setHipaaCd(methodOut.getCrtnHipaaCd());
      } else {
        methodOut.setSqlcode(100);
      }
    }
    //  cobolCode::MOVE SQLCODE TO WS-SQLCODE DSM-SQLCODE
    methodOut.setSqlcode_Ws(methodOut.getSqlcode());
    methodOut.setDsmSqlcode(methodOut.getSqlcode());
    //  cobolCode::EVALUATE TRUE
    if (methodOut.isSqlcodeOk()) {
      //  cobolCode::ADD 1 TO HPC-RET-CNT
      methodOut.setHpcRetCnt(methodOut.getHpcRetCnt() + 1);
      //  cobolCode::MOVE HIPAA-CD TO HPC-RET-HIPAA-CD ( HPC-RET-CNT )
      methodOut.setHpcRetHipaaCd(methodOut.getHpcRetCnt() - 1, methodOut.getHipaaCd());
    } else if (methodOut.isSqlcodeFetchEnd() && methodIn.isExplicitReq()) {
      //  cobolCode::MOVE ZERO TO HPC-RET-CNT
      methodOut.setHpcRetCnt(0);
      //  cobolCode::SET DSM-ENTRY-NOT-FND-INQ TO TRUE
      methodOut.setDsmEntryNotFndInqTrue();

    } else {
      //  cobolCode::SET DSM-DB2-ERROR TO TRUE
      methodOut.setDsmDb2ErrorTrue();

      //  cobolCode::MOVE 'SELECT' TO DSM-ERR-TBL-ACTION
      methodOut.setDsmErrTblAction(CONSTANTS.LITERAL_SELECT_B4_);
      //  cobolCode::MOVE 'HIPAA_PROC_CD' TO DSM-ERR-TBL-NAME
      methodOut.setDsmErrTblName(CONSTANTS.LITERAL_HIPAA_PROC_CD_B12_);
      //  cobolCode::MOVE '4000-EXPLICIT-DATA' TO DSM-ERR-SECTN-NAME
      methodOut.setDsmErrSectnName(CONSTANTS.LITERAL_862885394);
      //  cobolCode::PERFORM 7777-MOVES-FOR-ERROR-LOG
      movesForErrorLog(programCtx.getMovesForErrorLogInCtx()); /*7777-MOVES-FOR-ERROR-LOG SECTION*/
      if (programCtx.isProgramEnded()) {
        return methodOut;
      }
    }

    return methodOut;
  }
  /**
   * processExplicitList This method is derived from COBOL Paragraph - 3001-PROCESS-EXPLICIT-LIST
   * SECTION COBOL Cyclomatic complexity - 4 Input :
   *
   * <p>- sqlcode_Ws COBOL Name: WS-SQLCODE
   *
   * <p>Output :
   *
   * <p>- hipaaFetchSw COBOL Name: WS-HIPAA-FETCH-SW - hpcRetCodeMoreSw COBOL Name:
   * HPC-RET-CODE-MORE-SW
   *
   * @throws CFException
   */
  @Override
  public ProcessExplicitListOutCtx processExplicitList(ProcessExplicitListInCtx methodIn)
      throws Exception {

    // *81***************************************************************
    // *81 3001-Process-explicit-list                                   *
    // *81                                                              *
    // *81 business function:to get the hipaa proc codes for explicit   *
    // *81                   list of hipaa codes                        *
    // *81***************************************************************
    // *82***************************************************************
    // *82 1. query hipaa_proc_cd table for the list of hipaa codes     *
    // *82    received in the request                                   *
    // *82 2. based on the sqlcode perform the rest of the processing   *
    // *82 3. if no rows have been retrieved from the hipaa_proc_cd for *
    // *82    any of the hipaa_cd, set appropriate error message        *
    // *82***************************************************************
    // Added variable to get the program context in place.
    D5427hpcCtx programCtx = methodIn.getD5427hpcCtx();
    // Added variable to get the output context in place.
    ProcessExplicitListOutCtx methodOut = methodIn.getProcessExplicitListOutCtx();
    //  cobolCode::SET HIPAA-FETCH-END-NO TO TRUE
    methodOut.setHipaaFetchEndNoTrue();

    //  cobolCode::PERFORM 3101-OPEN-LIST-CURSOR
    openListCursor(programCtx.getOpenListCursorInCtx()); /*3101-OPEN-LIST-CURSOR SECTION*/
    if (programCtx.isProgramEnded()) {
      return methodOut;
    }
    //  cobolCode::IF WS-SQLCODE-OK
    if (methodIn.isSqlcodeOk()) {
      //  cobolCode::SET HPC-RET-NO-MORE-ROWS TO TRUE
      methodOut.setHpcRetNoMoreRowsTrue();

      //  cobolCode::PERFORM 3201-FETCH-LIST-CURSOR
      fetchListCursor(programCtx.getFetchListCursorInCtx()); /*3201-FETCH-LIST-CURSOR SECTION*/
      if (programCtx.isProgramEnded()) {
        return methodOut;
      }
    }
    //  cobolCode::IF WS-SQLCODE-OK OR WS-SQLCODE-FETCH-END
    if (methodIn.isSqlcodeOk() || methodIn.isSqlcodeFetchEnd()) {
      //  cobolCode::PERFORM 3301-CLOSE-LIST-CURSOR
      closeListCursor(programCtx.getCloseListCursorInCtx()); /*3301-CLOSE-LIST-CURSOR SECTION*/
      if (programCtx.isProgramEnded()) {
        return methodOut;
      }
    }

    return methodOut;
  }
  /**
   * openListCursor This method is derived from COBOL Paragraph - 3101-OPEN-LIST-CURSOR SECTION
   * COBOL Cyclomatic complexity - 17 Input :
   *
   * <p>- hpcReqHipaaVerNbr COBOL Name: HPC-REQ-HIPAA-VER-NBR - hpcReqHipaaCd COBOL Name:
   * HPC-REQ-HIPAA-CD - hipaaCodeItem COBOL Name: HIPAA-CODE-ITEM - dsmFuncCd COBOL Name:
   * DSM-FUNC-CD - crtnSrchFoundSw COBOL Name: CRTN-SRCH-FOUND-SW
   *
   * <p>Output :
   *
   * <p>- hipaaVerNbr COBOL Name: HIPAA-VER-NBR - hpcReqHipaaVerNbr COBOL Name:
   * HPC-REQ-HIPAA-VER-NBR - hvHipaaCodeList COBOL Name: HV-HIPAA-CODE-LIST - hvHipaaCodeItem1 COBOL
   * Name: HV-HIPAA-CODE-ITEM-1 - hpcReqHipaaCd COBOL Name: HPC-REQ-HIPAA-CD - hvHipaaCodeItem2
   * COBOL Name: HV-HIPAA-CODE-ITEM-2 - hipaaCodeItem COBOL Name: HIPAA-CODE-ITEM - hvHipaaCodeItem3
   * COBOL Name: HV-HIPAA-CODE-ITEM-3 - hvHipaaCodeItem4 COBOL Name: HV-HIPAA-CODE-ITEM-4 -
   * hvHipaaCodeItem5 COBOL Name: HV-HIPAA-CODE-ITEM-5 - hvHipaaCodeItem6 COBOL Name:
   * HV-HIPAA-CODE-ITEM-6 - hvHipaaCodeItem7 COBOL Name: HV-HIPAA-CODE-ITEM-7 - hvHipaaCodeItem8
   * COBOL Name: HV-HIPAA-CODE-ITEM-8 - hvHipaaCodeItem9 COBOL Name: HV-HIPAA-CODE-ITEM-9 -
   * hvHipaaCodeItem10 COBOL Name: HV-HIPAA-CODE-ITEM-10 - crtnSrchCd COBOL Name: CRTN-SRCH-CD -
   * crtnHipaaVerNbr COBOL Name: CRTN-HIPAA-VER-NBR - crtnCallType COBOL Name: CRTN-CALL-TYPE -
   * crtnFunction COBOL Name: CRTN-FUNCTION - rc COBOL Name: RETURN-CODE - returnCode COBOL Name:
   * WS-RETURN-CODE - dsmReturnCode COBOL Name: DSM-RETURN-CODE - dsmSqlErrorLevel COBOL Name:
   * DSM-SQL-ERROR-LEVEL - dsmEditErrorValueTxt COBOL Name: DSM-EDIT-ERROR-VALUE-TXT - dsmFuncCd
   * COBOL Name: DSM-FUNC-CD - dsmEditErrorField COBOL Name: DSM-EDIT-ERROR-FIELD - sqlcode COBOL
   * Name: SQLCODE - sqlcode_Ws COBOL Name: WS-SQLCODE - dsmSqlcode COBOL Name: DSM-SQLCODE -
   * dsmErrTblAction COBOL Name: DSM-ERR-TBL-ACTION - dsmErrTblName COBOL Name: DSM-ERR-TBL-NAME -
   * dsmErrSectnName COBOL Name: DSM-ERR-SECTN-NAME
   *
   * @throws CFException
   */
  @Override
  public OpenListCursorOutCtx openListCursor(OpenListCursorInCtx methodIn) throws Exception {

    // *81***************************************************************
    // *81 3101-Open-list-cursor section.                               *
    // *81                                                              *
    // *81 business function:                                           *
    // *81 open hipaa_proc_cd table - hipaa_list_csr                    *
    // *81***************************************************************
    // *82***************************************************************
    // *82 3101-open-list-cursor section.                               *
    // *82                                                              *
    // *82 1. open cursor for hipaa_proc_cd                             *
    // *82                                                              *
    // *82***************************************************************
    // Added variable to get the program context in place.
    D5427hpcCtx programCtx = methodIn.getD5427hpcCtx();
    // Added variable to get the output context in place.
    OpenListCursorOutCtx methodOut = methodIn.getOpenListCursorOutCtx();
    //  cobolCode::MOVE HPC-REQ-HIPAA-VER-NBR TO HIPAA-VER-NBR
    methodOut.setHipaaVerNbr(methodOut.getHpcReqHipaaVerNbr());
    //  cobolCode::MOVE SPACES TO HV-HIPAA-CODE-LIST
    methodOut.getHvHipaaCodeList().setString(CONSTANTS.SPACE_20);
    //  cobolCode::MOVE HPC-REQ-HIPAA-CD TO HV-HIPAA-CODE-ITEM-1
    methodOut.setHvHipaaCodeItem1(methodOut.getHpcReqHipaaCd());
    //  cobolCode::IF HIPAA-CODE-ITEM (1) > SPACE
    if ((isGreaterThanSpaces(methodOut.getHipaaCodeItem(0)))) {
      //  cobolCode::MOVE HIPAA-CODE-ITEM (1) TO HV-HIPAA-CODE-ITEM-2
      methodOut.setHvHipaaCodeItem2(methodOut.getHipaaCodeItem(0));
    }
    //  cobolCode::IF HIPAA-CODE-ITEM (2) > SPACE
    if ((isGreaterThanSpaces(methodOut.getHipaaCodeItem(1)))) {
      //  cobolCode::MOVE HIPAA-CODE-ITEM (2) TO HV-HIPAA-CODE-ITEM-3
      methodOut.setHvHipaaCodeItem3(methodOut.getHipaaCodeItem(1));
    }
    //  cobolCode::IF HIPAA-CODE-ITEM (3) > SPACE
    if ((isGreaterThanSpaces(methodOut.getHipaaCodeItem(2)))) {
      //  cobolCode::MOVE HIPAA-CODE-ITEM (3) TO HV-HIPAA-CODE-ITEM-4
      methodOut.setHvHipaaCodeItem4(methodOut.getHipaaCodeItem(2));
    }
    //  cobolCode::IF HIPAA-CODE-ITEM (4) > SPACE
    if ((isGreaterThanSpaces(methodOut.getHipaaCodeItem(3)))) {
      //  cobolCode::MOVE HIPAA-CODE-ITEM (4) TO HV-HIPAA-CODE-ITEM-5
      methodOut.setHvHipaaCodeItem5(methodOut.getHipaaCodeItem(3));
    }
    //  cobolCode::IF HIPAA-CODE-ITEM (5) > SPACE
    if ((isGreaterThanSpaces(methodOut.getHipaaCodeItem(4)))) {
      //  cobolCode::MOVE HIPAA-CODE-ITEM (5) TO HV-HIPAA-CODE-ITEM-6
      methodOut.setHvHipaaCodeItem6(methodOut.getHipaaCodeItem(4));
    }
    //  cobolCode::IF HIPAA-CODE-ITEM (6) > SPACE
    if ((isGreaterThanSpaces(methodOut.getHipaaCodeItem(5)))) {
      //  cobolCode::MOVE HIPAA-CODE-ITEM (6) TO HV-HIPAA-CODE-ITEM-7
      methodOut.setHvHipaaCodeItem7(methodOut.getHipaaCodeItem(5));
    }
    //  cobolCode::IF HIPAA-CODE-ITEM (7) > SPACE
    if ((isGreaterThanSpaces(methodOut.getHipaaCodeItem(6)))) {
      //  cobolCode::MOVE HIPAA-CODE-ITEM (7) TO HV-HIPAA-CODE-ITEM-8
      methodOut.setHvHipaaCodeItem8(methodOut.getHipaaCodeItem(6));
    }
    //  cobolCode::IF HIPAA-CODE-ITEM (8) > SPACE
    if ((isGreaterThanSpaces(methodOut.getHipaaCodeItem(7)))) {
      //  cobolCode::MOVE HIPAA-CODE-ITEM (8) TO HV-HIPAA-CODE-ITEM-9
      methodOut.setHvHipaaCodeItem9(methodOut.getHipaaCodeItem(7));
    }
    //  cobolCode::IF HIPAA-CODE-ITEM (9) > SPACE
    if ((isGreaterThanSpaces(methodOut.getHipaaCodeItem(8)))) {
      //  cobolCode::MOVE HIPAA-CODE-ITEM (9) TO HV-HIPAA-CODE-ITEM-10
      methodOut.setHvHipaaCodeItem10(methodOut.getHipaaCodeItem(8));
    }
    //  cobolCode::MOVE HV-HIPAA-CODE-ITEM-1 TO CRTN-SRCH-CD (1)
    methodOut.setCrtnSrchCd(0, methodOut.getHvHipaaCodeItem1());
    //  cobolCode::MOVE HV-HIPAA-CODE-ITEM-2 TO CRTN-SRCH-CD (2)
    methodOut.setCrtnSrchCd(1, methodOut.getHvHipaaCodeItem2());
    //  cobolCode::MOVE HV-HIPAA-CODE-ITEM-3 TO CRTN-SRCH-CD (3)
    methodOut.setCrtnSrchCd(2, methodOut.getHvHipaaCodeItem3());
    //  cobolCode::MOVE HV-HIPAA-CODE-ITEM-4 TO CRTN-SRCH-CD (4)
    methodOut.setCrtnSrchCd(3, methodOut.getHvHipaaCodeItem4());
    //  cobolCode::MOVE HV-HIPAA-CODE-ITEM-5 TO CRTN-SRCH-CD (5)
    methodOut.setCrtnSrchCd(4, methodOut.getHvHipaaCodeItem5());
    //  cobolCode::MOVE HV-HIPAA-CODE-ITEM-6 TO CRTN-SRCH-CD (6)
    methodOut.setCrtnSrchCd(5, methodOut.getHvHipaaCodeItem6());
    //  cobolCode::MOVE HV-HIPAA-CODE-ITEM-7 TO CRTN-SRCH-CD (7)
    methodOut.setCrtnSrchCd(6, methodOut.getHvHipaaCodeItem7());
    //  cobolCode::MOVE HV-HIPAA-CODE-ITEM-8 TO CRTN-SRCH-CD (8)
    methodOut.setCrtnSrchCd(7, methodOut.getHvHipaaCodeItem8());
    //  cobolCode::MOVE HV-HIPAA-CODE-ITEM-9 TO CRTN-SRCH-CD (9)
    methodOut.setCrtnSrchCd(8, methodOut.getHvHipaaCodeItem9());
    //  cobolCode::MOVE HV-HIPAA-CODE-ITEM-10 TO CRTN-SRCH-CD (10)
    methodOut.setCrtnSrchCd(9, methodOut.getHvHipaaCodeItem10());
    //  cobolCode::MOVE HIPAA-VER-NBR TO CRTN-HIPAA-VER-NBR
    methodOut.setCrtnHipaaVerNbr(methodOut.getHipaaVerNbr());
    //  cobolCode::SET CRTN-LIST-CSR TO TRUE
    methodOut.setCrtnListCsrTrue();

    //  cobolCode::SET CRTN-FUNCTION-IS-OPEN TO TRUE
    methodOut.setCrtnFunctionIsOpenTrue();

    //  cobolCode::CALL C5427HPC USING DFHEIBLK, CACHE-COMM-AREA
    try {
      programCtx.setRc(
          c5427hpc.call(
              programCtx.getGlobalCtx().getContext("C5427HPC"),
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
        //  cobolCode::MOVE 'LIST CALL TO CACHE MODULE' TO DSM-EDIT-ERROR-FIELD
        methodOut.setDsmEditErrorField(CONSTANTS.LITERAL_LIST_B9_CALLTOCACHEMODULE);
        // cobolCode::GO TO 0000-EXIT
        exit(programCtx);
        return methodOut;
        // cobolCodeEnds::GO TO 0000-EXIT

    }
    //  cobolCode::IF NOT CRTN-SRCH-FOUND-SW-IS-OVERFLOW
    if (!(methodIn.isCrtnSrchFoundSwIsOverflow())) {
      //  cobolCode::MOVE +0 TO SQLCODE, WS-SQLCODE , DSM-SQLCODE
      methodOut.setSqlcode(0);
      methodOut.setSqlcode_Ws(0);
      methodOut.setDsmSqlcode(0);
      // cobolCode::GO TO 3101-EXIT
      return methodOut;
      // cobolCodeEnds::GO TO 3101-EXIT
    }
    //  cobolCode::WITH HIPAA_CD_LIST ( HIPAA_CD_ITEM ) AS ( SELECT ? FROM SYSIBM.SYSDUMMY1 WHERE ?
    // > ' ' UNION SELECT ? FROM SYSIBM.SYSDUMMY1 WHERE ? > ' ' UNION SELECT ? FROM SYSIBM.SYSDUMMY1
    // WHERE ? > ' ' UNION SELECT ? FROM SYSIBM.SYSDUMMY1 WHERE ? > ' ' UNION SELECT ? FROM
    // SYSIBM.SYSDUMMY1 WHERE ? > ' ' UNION SELECT ? FROM SYSIBM.SYSDUMMY1 WHERE ? > ' ' UNION
    // SELECT ? FROM SYSIBM.SYSDUMMY1 WHERE ? > ' ' UNION SELECT ? FROM SYSIBM.SYSDUMMY1 WHERE ? > '
    // ' UNION SELECT ? FROM SYSIBM.SYSDUMMY1 WHERE ? > ' ' UNION SELECT ? FROM SYSIBM.SYSDUMMY1
    // WHERE ? > ' ' ) SELECT DISTINCT ( HPC.HIPAA_CD ) , HPC.GRNRC_RQST_CD FROM HIPAA_CD_LIST ,
    // HIPAA_PROC_CD HPC WHERE HPC.HIPAA_VER_NBR = ? AND ( ( HIPAA_CD_ITEM = HPC.HIPAA_GRP_CD OR ( (
    // HIPAA_CD_ITEM = HPC.HIPAA_CD ) AND NOT EXISTS ( SELECT 1 FROM HIPAA_PROC_CD HP2 WHERE
    // HPC.HIPAA_CD = HP2.HIPAA_GRP_CD FETCH FIRST 1 ROWS ONLY ) ) ) OR ( GRNRC_RQST_CD IN ( 'S' ,
    // 'G' ) AND ( SELECT 1 FROM HIPAA_CD_LIST WHERE HIPAA_CD_ITEM = '30' FETCH FIRST 1 ROWS ONLY )
    // = 1 ) ) ORDER BY HIPAA_CD FOR FETCH ONLY
    programCtx.setHipaaListCsrResultSet(
        d5427hpcRepository.openHipaaListCsrD5427hpc(
            programCtx.getSqlca(), methodOut.getHvHipaaCodeList(), methodIn.getDclhipaaProcCd()));
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
      //  cobolCode::MOVE 'HIPAA_PROC_CD' TO DSM-ERR-TBL-NAME
      methodOut.setDsmErrTblName(CONSTANTS.LITERAL_HIPAA_PROC_CD_B12_);
      //  cobolCode::MOVE '3101-OPEN-LIST-CURSOR' TO DSM-ERR-SECTN-NAME
      methodOut.setDsmErrSectnName(CONSTANTS.LITERAL_946093104);
      //  cobolCode::PERFORM 7777-MOVES-FOR-ERROR-LOG
      movesForErrorLog(programCtx.getMovesForErrorLogInCtx()); /*7777-MOVES-FOR-ERROR-LOG SECTION*/
      if (programCtx.isProgramEnded()) {
        return methodOut;
      }
    }

    return methodOut;
  }
  /**
   * fetchListCursor This method is derived from COBOL Paragraph - 3201-FETCH-LIST-CURSOR SECTION
   * COBOL Cyclomatic complexity - 14 Input :
   *
   * <p>- lneSub COBOL Name: WS-LNE-SUB - sqlcode_Ws COBOL Name: WS-SQLCODE - crtnSrchFoundSw COBOL
   * Name: CRTN-SRCH-FOUND-SW - dsmFuncCd COBOL Name: DSM-FUNC-CD - crtnHipaaCd COBOL Name:
   * CRTN-HIPAA-CD - crtnGrnrcRqstCd COBOL Name: CRTN-GRNRC-RQST-CD
   *
   * <p>Output :
   *
   * <p>- lneSub COBOL Name: WS-LNE-SUB - crtnFunction COBOL Name: CRTN-FUNCTION - rc COBOL Name:
   * RETURN-CODE - returnCode COBOL Name: WS-RETURN-CODE - dsmReturnCode COBOL Name: DSM-RETURN-CODE
   * - dsmSqlErrorLevel COBOL Name: DSM-SQL-ERROR-LEVEL - dsmEditErrorValueTxt COBOL Name:
   * DSM-EDIT-ERROR-VALUE-TXT - dsmFuncCd COBOL Name: DSM-FUNC-CD - dsmEditErrorField COBOL Name:
   * DSM-EDIT-ERROR-FIELD - sqlcode COBOL Name: SQLCODE - hipaaCd COBOL Name: HIPAA-CD - crtnHipaaCd
   * COBOL Name: CRTN-HIPAA-CD - grnrcRqstCd COBOL Name: GRNRC-RQST-CD - crtnGrnrcRqstCd COBOL Name:
   * CRTN-GRNRC-RQST-CD - sqlcode_Ws COBOL Name: WS-SQLCODE - dsmSqlcode COBOL Name: DSM-SQLCODE -
   * hpcRetHipaaCd COBOL Name: HPC-RET-HIPAA-CD - hpcRetGrnrcRqstCd COBOL Name:
   * HPC-RET-GRNRC-RQST-CD - hpcRetCnt COBOL Name: HPC-RET-CNT - dsmErrTblAction COBOL Name:
   * DSM-ERR-TBL-ACTION - dsmErrTblName COBOL Name: DSM-ERR-TBL-NAME - dsmErrSectnName COBOL Name:
   * DSM-ERR-SECTN-NAME
   *
   * @throws CFException
   */
  @Override
  public FetchListCursorOutCtx fetchListCursor(FetchListCursorInCtx methodIn) throws Exception {

    // *81***************************************************************
    // *81 3201-Fetch-list-cursor section.                              *
    // *81                                                              *
    // *81 business function:                                           *
    // *81 fetch hipaa_proc_cd table - hipaa_list_csr                   *
    // *81***************************************************************
    // *82***************************************************************
    // *82 3201-fetch-list-cursor section.                              *
    // *82                                                              *
    // *82 1. fetch the data for the hipaa_list_csr cursor              *
    // *82***************************************************************
    // Added variable to get the program context in place.
    D5427hpcCtx programCtx = methodIn.getD5427hpcCtx();
    // Added variable to get the output context in place.
    FetchListCursorOutCtx methodOut = methodIn.getFetchListCursorOutCtx();
    //  cobolCode::PERFORM VARYING WS-LNE-SUB FROM +1 BY +1 UNTIL WS-LNE-SUB > 300 OR
    // WS-SQLCODE-FETCH-END
    for (methodOut.setLneSub(1);
        ((methodOut.getLneSub() <= 300) && !(methodIn.isSqlcodeFetchEnd()));
        methodOut.setLneSub(methodOut.getLneSub() + 1)) {

      // ***          Until ws-lne-sub > 99 or ws-sqlcode-fetch-end
      //  cobolCode::IF NOT CRTN-SRCH-FOUND-SW-IS-OVERFLOW
      if (!(methodIn.isCrtnSrchFoundSwIsOverflow())) {
        //  cobolCode::SET CRTN-FUNCTION-IS-FETCH TO TRUE
        methodOut.setCrtnFunctionIsFetchTrue();

        //  cobolCode::CALL C5427HPC USING DFHEIBLK, CACHE-COMM-AREA
        try {
          programCtx.setRc(
              c5427hpc.call(
                  programCtx.getGlobalCtx().getContext("C5427HPC"),
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
            //  cobolCode::MOVE 'LIST FETCH TO CACHE MODULE' TO DSM-EDIT-ERROR-FIELD
            methodOut.setDsmEditErrorField(CONSTANTS.LITERAL_LIST_B8_FETCHTOCACHEMODULE);
            // cobolCode::GO TO 0000-EXIT
            exit(programCtx);
            return methodOut;
            // cobolCodeEnds::GO TO 0000-EXIT

        }
        //  cobolCode::EVALUATE TRUE
        if (methodIn.isCrtnSrchFoundSwIsYes()) {
          methodOut.setSqlcode(0);
          //  cobolCode::MOVE CRTN-HIPAA-CD TO HIPAA-CD
          methodOut.setHipaaCd(methodOut.getCrtnHipaaCd());
          //  cobolCode::MOVE CRTN-GRNRC-RQST-CD TO GRNRC-RQST-CD
          methodOut.setGrnrcRqstCd(methodOut.getCrtnGrnrcRqstCd());
        } else {
          methodOut.setSqlcode(100);
        }
      }
      //  cobolCode::ELSE
      else {
        //  cobolCode::FETCH HIPAA_LIST_CSR INTO ? , ?
        d5427hpcRepository.fetchHipaaListCsrD5427hpc(
            programCtx.getHipaaListCsrResultSet(),
            programCtx.getSqlca(),
            methodOut.getDclhipaaProcCd());
      }
      //  cobolCode::MOVE SQLCODE TO WS-SQLCODE DSM-SQLCODE
      methodOut.setSqlcode_Ws(methodOut.getSqlcode());
      methodOut.setDsmSqlcode(methodOut.getSqlcode());
      //  cobolCode::EVALUATE TRUE
      if (methodOut.isSqlcodeOk()) {
        //  cobolCode::MOVE HIPAA-CD TO HPC-RET-HIPAA-CD ( WS-LNE-SUB )
        methodOut.setHpcRetHipaaCd(methodOut.getLneSub() - 1, methodOut.getHipaaCd());
        //  cobolCode::MOVE GRNRC-RQST-CD TO HPC-RET-GRNRC-RQST-CD ( WS-LNE-SUB )
        methodOut.setHpcRetGrnrcRqstCd(methodOut.getLneSub() - 1, methodOut.getGrnrcRqstCd());
        //  cobolCode::MOVE WS-LNE-SUB TO HPC-RET-CNT
        methodOut.setHpcRetCnt(methodOut.getLneSub());
      } else if (methodIn.isSqlcodeFetchEnd()) {
        //  cobolCode::IF HPC-RET-CNT = 0
        if ((methodOut.getHpcRetCnt() == 0)) {
          //  cobolCode::SET DSM-ENTRY-NOT-FND-INQ TO TRUE
          methodOut.setDsmEntryNotFndInqTrue();
        }
      } else {
        //  cobolCode::SET DSM-DB2-ERROR TO TRUE
        methodOut.setDsmDb2ErrorTrue();

        //  cobolCode::MOVE 'FETCH' TO DSM-ERR-TBL-ACTION
        methodOut.setDsmErrTblAction(CONSTANTS.LITERAL_FETCH_B5_);
        //  cobolCode::MOVE 'HIPAA_PROC_CD' TO DSM-ERR-TBL-NAME
        methodOut.setDsmErrTblName(CONSTANTS.LITERAL_HIPAA_PROC_CD_B12_);
        //  cobolCode::MOVE '3201-FETCH-LIST-CURSOR' TO DSM-ERR-SECTN-NAME
        methodOut.setDsmErrSectnName(CONSTANTS.LITERAL_652525595);
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
   * closeListCursor This method is derived from COBOL Paragraph - 3301-CLOSE-LIST-CURSOR SECTION
   * COBOL Cyclomatic complexity - 5 Input :
   *
   * <p>- crtnSrchFoundSw COBOL Name: CRTN-SRCH-FOUND-SW
   *
   * <p>Output :
   *
   * <p>- sqlcode COBOL Name: SQLCODE - sqlcode_Ws COBOL Name: WS-SQLCODE - dsmSqlcode COBOL Name:
   * DSM-SQLCODE - dsmReturnCode COBOL Name: DSM-RETURN-CODE - dsmErrTblAction COBOL Name:
   * DSM-ERR-TBL-ACTION - dsmErrTblName COBOL Name: DSM-ERR-TBL-NAME - dsmErrSectnName COBOL Name:
   * DSM-ERR-SECTN-NAME
   *
   * @throws CFException
   */
  @Override
  public CloseListCursorOutCtx closeListCursor(CloseListCursorInCtx methodIn) throws Exception {

    // *81***************************************************************
    // *81 3301-Close-list-cursor                                       *
    // *81                                                              *
    // *81 business function:                                           *
    // *81 close hipaa_proc_cd table - hipaa_list_csr                   *
    // *81***************************************************************
    // *82***************************************************************
    // *82 3301-close-list-cursor                                       *
    // *82                                                              *
    // *82 1. used to close cursor for hipaa_proc_cd table for list     *
    // *82    request                                                   *
    // *82                                                              *
    // *82***************************************************************
    // Added variable to get the program context in place.
    D5427hpcCtx programCtx = methodIn.getD5427hpcCtx();
    // Added variable to get the output context in place.
    CloseListCursorOutCtx methodOut = methodIn.getCloseListCursorOutCtx();
    //  cobolCode::IF CRTN-SRCH-FOUND-SW-IS-OVERFLOW
    if (methodIn.isCrtnSrchFoundSwIsOverflow()) {
      //  cobolCode::CLOSE HIPAA_LIST_CSR
      d5427hpcRepository.closeHipaaListCsrD5427hpc(
          programCtx.getHipaaListCsrResultSet(), programCtx.getSqlca());
    }
    //  cobolCode::ELSE
    else {
      methodOut.setSqlcode(0);
    }
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
      //  cobolCode::MOVE 'HIPAA_PROC_CD' TO DSM-ERR-TBL-NAME
      methodOut.setDsmErrTblName(CONSTANTS.LITERAL_HIPAA_PROC_CD_B12_);
      //  cobolCode::MOVE '3301-CLOSE-LIST-CURSOR' TO DSM-ERR-SECTN-NAME
      methodOut.setDsmErrSectnName(CONSTANTS.LITERAL_1587392188);
      //  cobolCode::PERFORM 7777-MOVES-FOR-ERROR-LOG
      movesForErrorLog(programCtx.getMovesForErrorLogInCtx()); /*7777-MOVES-FOR-ERROR-LOG SECTION*/
      if (programCtx.isProgramEnded()) {
        return methodOut;
      }
    }

    return methodOut;
  }
  /**
   * processAllHipaa This method is derived from COBOL Paragraph - 5000-PROCESS-ALL-HIPAA SECTION
   * COBOL Cyclomatic complexity - 4 Input :
   *
   * <p>- sqlcode_Ws COBOL Name: WS-SQLCODE
   *
   * <p>Output :
   *
   * <p>- hpcRetCodeMoreSw COBOL Name: HPC-RET-CODE-MORE-SW
   *
   * @throws CFException
   */
  @Override
  public ProcessAllHipaaOutCtx processAllHipaa(ProcessAllHipaaInCtx methodIn) throws Exception {

    // *81***************************************************************
    // *81 5000-Process-all-hipaa                                       *
    // *81                                                              *
    // *81 business function:                                           *
    // *81 perform hipaa_all_csr     processing                         *
    // *81***************************************************************
    // *82***************************************************************
    // *82                                                              *
    // *82 5000-process-all-hipaa                                       *
    // *82 1.used to get the hipaa proc codes                           *
    // *82   request code for all hipaa codes.                          *
    // *82                                                              *
    // *82***************************************************************
    // Added variable to get the program context in place.
    D5427hpcCtx programCtx = methodIn.getD5427hpcCtx();
    // Added variable to get the output context in place.
    ProcessAllHipaaOutCtx methodOut = methodIn.getProcessAllHipaaOutCtx();
    //  cobolCode::PERFORM 5100-OPEN-HIPAA-ALL-CSR
    openHipaaAllCsr(programCtx.getOpenHipaaAllCsrInCtx()); /*5100-OPEN-HIPAA-ALL-CSR SECTION*/
    if (programCtx.isProgramEnded()) {
      return methodOut;
    }
    //  cobolCode::IF WS-SQLCODE-OK
    if (methodIn.isSqlcodeOk()) {
      //  cobolCode::SET HPC-RET-NO-MORE-ROWS TO TRUE
      methodOut.setHpcRetNoMoreRowsTrue();

      //  cobolCode::PERFORM 5200-FETCH-HIPAA-ALL-CSR
      fetchHipaaAllCsr(programCtx.getFetchHipaaAllCsrInCtx()); /*5200-FETCH-HIPAA-ALL-CSR SECTION*/
      if (programCtx.isProgramEnded()) {
        return methodOut;
      }
    }
    //  cobolCode::IF WS-SQLCODE-OK OR WS-SQLCODE-FETCH-END
    if (methodIn.isSqlcodeOk() || methodIn.isSqlcodeFetchEnd()) {
      //  cobolCode::PERFORM 5300-CLOSE-HIPAA-ALL-CSR
      closeHipaaAllCsr(programCtx.getCloseHipaaAllCsrInCtx()); /*5300-CLOSE-HIPAA-ALL-CSR SECTION*/
      if (programCtx.isProgramEnded()) {
        return methodOut;
      }
    }

    return methodOut;
  }
  /**
   * openHipaaAllCsr This method is derived from COBOL Paragraph - 5100-OPEN-HIPAA-ALL-CSR SECTION
   * COBOL Cyclomatic complexity - 4 Input :
   *
   * <p>- hpcReqHipaaVerNbr COBOL Name: HPC-REQ-HIPAA-VER-NBR - sqlcode COBOL Name: SQLCODE
   *
   * <p>Output :
   *
   * <p>- hipaaVerNbr COBOL Name: HIPAA-VER-NBR - hpcReqHipaaVerNbr COBOL Name:
   * HPC-REQ-HIPAA-VER-NBR - hipaaFetchSw COBOL Name: WS-HIPAA-FETCH-SW - sqlcode_Ws COBOL Name:
   * WS-SQLCODE - dsmSqlcode COBOL Name: DSM-SQLCODE - sqlcode COBOL Name: SQLCODE - dsmReturnCode
   * COBOL Name: DSM-RETURN-CODE - dsmErrTblAction COBOL Name: DSM-ERR-TBL-ACTION - dsmErrTblName
   * COBOL Name: DSM-ERR-TBL-NAME - dsmErrSectnName COBOL Name: DSM-ERR-SECTN-NAME
   *
   * @throws CFException
   */
  @Override
  public OpenHipaaAllCsrOutCtx openHipaaAllCsr(OpenHipaaAllCsrInCtx methodIn) throws Exception {

    // *81***************************************************************
    // *81 5100-Open-hipaa-all-csr                                      *
    // *81                                                              *
    // *81 business function:                                           *
    // *81 open table hipaa_proc_cd - hipaa_all_csr                     *
    // *81***************************************************************
    // *82***************************************************************
    // *82 5100-open-hipaa-all-csr                                      *
    // *82                                                              *
    // *82 1) open the cursor to get the details from the hipaa proc    *
    // *82    code table for generic request.                           *
    // *82                                                              *
    // *82***************************************************************
    // Added variable to get the program context in place.
    D5427hpcCtx programCtx = methodIn.getD5427hpcCtx();
    // Added variable to get the output context in place.
    OpenHipaaAllCsrOutCtx methodOut = methodIn.getOpenHipaaAllCsrOutCtx();
    //  cobolCode::MOVE HPC-REQ-HIPAA-VER-NBR TO HIPAA-VER-NBR
    methodOut.setHipaaVerNbr(methodOut.getHpcReqHipaaVerNbr());
    //  cobolCode::SET HIPAA-FETCH-END-NO TO TRUE
    methodOut.setHipaaFetchEndNoTrue();

    //  cobolCode::SELECT HIPAA_CD FROM HIPAA_PROC_CD WHERE HIPAA_VER_NBR = ? ORDER BY HIPAA_CD FOR
    // FETCH ONLY
    programCtx.setHipaaAllCsrResultSet(
        d5427hpcRepository.openHipaaAllCsrD5427hpc(
            programCtx.getSqlca(), methodIn.getDclhipaaProcCd()));
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
      //  cobolCode::MOVE 'HIPAA_PROC_CD' TO DSM-ERR-TBL-NAME
      methodOut.setDsmErrTblName(CONSTANTS.LITERAL_HIPAA_PROC_CD_B12_);
      //  cobolCode::MOVE '5100-OPEN-HIPAA-ALL-CSR' TO DSM-ERR-SECTN-NAME
      methodOut.setDsmErrSectnName(CONSTANTS.LITERAL_551100614);
      //  cobolCode::PERFORM 7777-MOVES-FOR-ERROR-LOG
      movesForErrorLog(programCtx.getMovesForErrorLogInCtx()); /*7777-MOVES-FOR-ERROR-LOG SECTION*/
      if (programCtx.isProgramEnded()) {
        return methodOut;
      }
    }

    return methodOut;
  }
  /**
   * fetchHipaaAllCsr This method is derived from COBOL Paragraph - 5200-FETCH-HIPAA-ALL-CSR SECTION
   * COBOL Cyclomatic complexity - 9 Input :
   *
   * <p>- lneSub COBOL Name: WS-LNE-SUB - sqlcode_Ws COBOL Name: WS-SQLCODE - sqlcode COBOL Name:
   * SQLCODE - hipaaCd COBOL Name: HIPAA-CD
   *
   * <p>Output :
   *
   * <p>- lneSub COBOL Name: WS-LNE-SUB - sqlcode_Ws COBOL Name: WS-SQLCODE - dsmSqlcode COBOL Name:
   * DSM-SQLCODE - sqlcode COBOL Name: SQLCODE - hpcRetHipaaCd COBOL Name: HPC-RET-HIPAA-CD -
   * hipaaCd COBOL Name: HIPAA-CD - hpcRetCnt COBOL Name: HPC-RET-CNT - dsmReturnCode COBOL Name:
   * DSM-RETURN-CODE - dsmErrTblAction COBOL Name: DSM-ERR-TBL-ACTION - dsmErrTblName COBOL Name:
   * DSM-ERR-TBL-NAME - dsmErrSectnName COBOL Name: DSM-ERR-SECTN-NAME
   *
   * @throws CFException
   */
  @Override
  public FetchHipaaAllCsrOutCtx fetchHipaaAllCsr(FetchHipaaAllCsrInCtx methodIn) throws Exception {

    // *81***************************************************************
    // *81 5200-Fetch-hipaa-all-csr  section.                           *
    // *81                                                              *
    // *81 business function:                                           *
    // *81 fetch table hipaa_proc_cd - hipaa_all_csr                    *
    // *81***************************************************************
    // *82***************************************************************
    // *82 5200-fetch-hipaa-all-csr  section.                           *
    // *82                                                              *
    // *82 1. fetch all records from the hipaa_all_csr     cursor       *
    // *82***************************************************************
    // Added variable to get the program context in place.
    D5427hpcCtx programCtx = methodIn.getD5427hpcCtx();
    // Added variable to get the output context in place.
    FetchHipaaAllCsrOutCtx methodOut = methodIn.getFetchHipaaAllCsrOutCtx();
    //  cobolCode::PERFORM VARYING WS-LNE-SUB FROM +1 BY +1 UNTIL WS-LNE-SUB > 300 OR
    // WS-SQLCODE-FETCH-END
    for (methodOut.setLneSub(1);
        ((methodOut.getLneSub() <= 300) && !(methodIn.isSqlcodeFetchEnd()));
        methodOut.setLneSub(methodOut.getLneSub() + 1)) {
      //  cobolCode::FETCH HIPAA_ALL_CSR INTO ?
      d5427hpcRepository.fetchHipaaAllCsrD5427hpc(
          programCtx.getHipaaAllCsrResultSet(),
          programCtx.getSqlca(),
          methodOut.getDclhipaaProcCd());
      //  cobolCode::MOVE SQLCODE TO WS-SQLCODE DSM-SQLCODE
      methodOut.setSqlcode_Ws(methodOut.getSqlcode());
      methodOut.setDsmSqlcode(methodOut.getSqlcode());
      //  cobolCode::EVALUATE TRUE
      if (methodOut.isSqlcodeOk()) {
        //  cobolCode::MOVE HIPAA-CD TO HPC-RET-HIPAA-CD ( WS-LNE-SUB )
        methodOut.setHpcRetHipaaCd(methodOut.getLneSub() - 1, methodOut.getHipaaCd());
        //  cobolCode::MOVE WS-LNE-SUB TO HPC-RET-CNT
        methodOut.setHpcRetCnt(methodOut.getLneSub());
      } else if (methodIn.isSqlcodeFetchEnd()) {
        //  cobolCode::IF HPC-RET-CNT = 0
        if ((methodOut.getHpcRetCnt() == 0)) {
          //  cobolCode::SET DSM-ENTRY-NOT-FND-INQ TO TRUE
          methodOut.setDsmEntryNotFndInqTrue();
        }
      } else {
        //  cobolCode::SET DSM-DB2-ERROR TO TRUE
        methodOut.setDsmDb2ErrorTrue();

        //  cobolCode::MOVE 'FETCH' TO DSM-ERR-TBL-ACTION
        methodOut.setDsmErrTblAction(CONSTANTS.LITERAL_FETCH_B5_);
        //  cobolCode::MOVE 'HIPAA_PROC_CD' TO DSM-ERR-TBL-NAME
        methodOut.setDsmErrTblName(CONSTANTS.LITERAL_HIPAA_PROC_CD_B12_);
        //  cobolCode::MOVE '5200-FETCH-HIPAA-ALL-CSR' TO DSM-ERR-SECTN-NAME
        methodOut.setDsmErrSectnName(CONSTANTS.LITERAL_725585813);
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
   * closeHipaaAllCsr This method is derived from COBOL Paragraph - 5300-CLOSE-HIPAA-ALL-CSR SECTION
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
  public CloseHipaaAllCsrOutCtx closeHipaaAllCsr(CloseHipaaAllCsrInCtx methodIn) throws Exception {

    // *81***************************************************************
    // *81 5300-Close-hipaa-all-csr                                     *
    // *81                                                              *
    // *81 business function:                                           *
    // *81 close table hipaa_proc_cd - hipaa_all_csr                    *
    // *81***************************************************************
    // *82***************************************************************
    // *82 5300-close-hipaa-all-csr                                     *
    // *82                                                              *
    // *82 1. close the cursor for hipaa_proc_cd table for all hipaa req*
    // *82***************************************************************
    // Added variable to get the program context in place.
    D5427hpcCtx programCtx = methodIn.getD5427hpcCtx();
    // Added variable to get the output context in place.
    CloseHipaaAllCsrOutCtx methodOut = methodIn.getCloseHipaaAllCsrOutCtx();
    //  cobolCode::CLOSE HIPAA_ALL_CSR
    d5427hpcRepository.closeHipaaAllCsrD5427hpc(
        programCtx.getHipaaAllCsrResultSet(), programCtx.getSqlca());
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
      //  cobolCode::MOVE 'HIPAA_PROC_CD' TO DSM-ERR-TBL-NAME
      methodOut.setDsmErrTblName(CONSTANTS.LITERAL_HIPAA_PROC_CD_B12_);
      //  cobolCode::MOVE '5300-CLOSE-HIPAA-ALL-CSR' TO DSM-ERR-SECTN-NAME
      methodOut.setDsmErrSectnName(CONSTANTS.LITERAL_209280780);
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
   * <p>- hpcReqClngProg COBOL Name: HPC-REQ-CLNG-PROG - dsmPgmName COBOL Name: WS-DSM-PGM-NAME
   *
   * <p>Output :
   *
   * <p>- dsmErrClngPgmName COBOL Name: DSM-ERR-CLNG-PGM-NAME - hpcReqClngProg COBOL Name:
   * HPC-REQ-CLNG-PROG - dsmErrPgmName COBOL Name: DSM-ERR-PGM-NAME - dsmPgmName COBOL Name:
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
    D5427hpcCtx programCtx = methodIn.getD5427hpcCtx();
    // Added variable to get the output context in place.
    MovesForErrorLogOutCtx methodOut = methodIn.getMovesForErrorLogOutCtx();
    //  cobolCode::MOVE HPC-REQ-CLNG-PROG TO DSM-ERR-CLNG-PGM-NAME
    methodOut.setDsmErrClngPgmName(methodOut.getHpcReqClngProg());
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
    D5427hpcCtx programCtx = methodIn.getD5427hpcCtx();
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
    D5427hpcCtx programCtx = (D5427hpcCtx) ctx;

    int len = params.length;
    if (len > 1 && params[1] != null)
      if (params[1] instanceof Field)
        programCtx.getWork().setDfhcommarea(((Field) params[1]).toCharArray());
      else programCtx.getWork().setDfhcommarea((char[]) params[1]);
    if (len > 2 && params[2] != null) programCtx.getDsmCallArea().set((Field) params[2]);
    if (len > 3 && params[3] != null) programCtx.getHpcDataArea().set((Field) params[3]);
    if (len > 4 && params[4] != null)
      programCtx.getHipaaCodeListAddressGroup().setHipaaCodeListAddress((int) params[4]);
    // invoke the process
    int returnCode = process(programCtx);
    // set the computed value to params back
    params[1] = programCtx.getWork().getDfhcommarea();
    params[4] = programCtx.getHipaaCodeListAddressGroup().getHipaaCodeListAddress();
    return returnCode;
  }

  public int call(ProgramContext ctx, Field... parameters) throws Exception {
    D5427hpcCtx programCtx = (D5427hpcCtx) ctx;
    for (int index = 0; index < parameters.length; index++) {
      switch (index) {
        case 1:
          if (parameters[index] != null) {
            programCtx.getWork().setDfhcommarea(parameters[index].toCharArray());
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
            if (parameters[index] instanceof HpcDataArea) {
              programCtx.setHpcDataArea((HpcDataArea) parameters[index]);
            } else {
              programCtx.getHpcDataArea().set(parameters[index]);
            }
          }

          break;
        case 4:
          if (parameters[index] != null) {
            programCtx
                .getHipaaCodeListAddressGroup()
                .setHipaaCodeListAddress(parameters[index].getInt());
          }

          break;
      }
    }
    return process(programCtx);
  }

  public void setFromC5427hpc(D5427hpcCtx programCtx, Object[] params) {
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
