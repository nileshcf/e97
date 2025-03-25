package com.cloudframe.app.service.impl;
/* The comment section is too large,
 * hence added at the end of the java code
 * please scroll all the way to the bottom to see complete comments
 */

import com.cloudframe.app.business.*;
import com.cloudframe.app.business.D5427bhi;
import com.cloudframe.app.business.D5427hpc;
import com.cloudframe.app.business.D5427pol;
import com.cloudframe.app.business.D5427scn;
import com.cloudframe.app.business.D5427tli;
import com.cloudframe.app.cics.TransactionManager;
import com.cloudframe.app.common.CONSTANTS;
import com.cloudframe.app.common.CommonProcess;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.dto.ProgramContext;
import com.cloudframe.app.dto.bbhsr002.*;
import com.cloudframe.app.dto.bbhsr002.Bbhsr002Ctx;
import com.cloudframe.app.dto.bbhsr002.Bbhsr002Ctx.*;
import com.cloudframe.app.dto.bbhsr002.DfhcommareaGroup;
import com.cloudframe.app.dto.bbhsr002.FoundnMsgCallerArea;
import com.cloudframe.app.dto.bbhsr002.HsrRequestArea;
import com.cloudframe.app.dto.bbhsr002.HsrReturnArea;
import com.cloudframe.app.dto.bbhsr002.ReqHsrHipaaList;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.service.*;
import com.cloudframe.app.service.Bbhsr002;
import com.cloudframe.app.utility.CFUtil;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component("bbhsr002")
public class Bbhsr002Impl extends CommonProcess implements Bbhsr002 {

  Logger logger = LoggerFactory.getLogger(Bbhsr002Impl.class);

  @Autowired
  @Qualifier("d5427hpc")
  D5427hpc d5427hpc;

  @Autowired
  @Qualifier("d5427pol")
  D5427pol d5427pol;

  @Autowired
  @Qualifier("d5427bhi")
  D5427bhi d5427bhi;

  @Autowired
  @Qualifier("d5427scn")
  D5427scn d5427scn;

  @Autowired
  @Qualifier("d5427tli")
  D5427tli d5427tli;

  private Object[] parametersObj = null;

  /**
   * process Input : None
   *
   * <p>Output : None
   *
   * @throws CFException
   */
  public int process(Bbhsr002Ctx programCtx) throws Exception {
    try {
      setCodePage("1047");
      // Reset program ended flag
      programCtx.setProgramEnded(false);
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
    }

    return programCtx.getRc(); // Exit with return code
    // end of process method
  }
  /**
   * mainline This method is derived from COBOL Paragraph - 0000-MAINLINE SECTION COBOL Cyclomatic
   * complexity - 8 Input :
   *
   * <p>- reqReturnCode COBOL Name: REQ-RETURN-CODE - hsrReqContractRtnCd COBOL Name:
   * HSR-REQ-CONTRACT-RTN-CD - bhiReqSlotTable COBOL Name: BHI-REQ-SLOT-TABLE - empTables COBOL
   * Name: WS-EMP-TABLES - hsrReqCreator COBOL Name: HSR-REQ-CREATOR - ehbBhiAfBothInd COBOL Name:
   * EHB-BHI-AF-BOTH-IND
   *
   * <p>Output :
   *
   * <p>- reqReturnCode COBOL Name: REQ-RETURN-CODE - reqExplanationCode COBOL Name:
   * REQ-EXPLANATION-CODE - hcaTables COBOL Name: WS-HCA-TABLES - bhiReqSlotTable COBOL Name:
   * BHI-REQ-SLOT-TABLE
   *
   * @throws CFException
   */
  @Override
  public MainlineOutCtx mainline(MainlineInCtx methodIn) throws Exception {

    // ******************************************************************
    // *81 0000-Mainline                                                *
    // *81                                                              *
    // *81 business function :                                          *
    // *81 this paragraph controls all logic performed in this program  *
    // ******************************************************************
    // *82 0000-mainline                                                *
    // *82                                                              *
    // *82 1. initialize all output fields                              *
    // *82 2. validate the input fields                                 *
    // *82 3. if no error, performs hsr processing                      *
    // *82                                                              *
    // *82 called by: n/a                                               *
    // *82 calls    : 1.1000-initialization.                            *
    // *82            2.2000-validate-input-area.                       *
    // *82            3.2100-get-storage.                               *
    // *82            4.3000-hsr-processing.                            *
    // *82                                                              *
    // ******************************************************************
    // Added variable to get the program context in place.
    Bbhsr002Ctx programCtx = methodIn.getBbhsr002Ctx();
    // Added variable to get the output context in place.
    MainlineOutCtx methodOut = methodIn.getMainlineOutCtx();
    //  cobolCode::DISPLAY '0000-MAINLINE'
    logger.info("0000-MAINLINE");
    //  cobolCode::PERFORM 1000-INITIALIZATION
    initialization(programCtx.getInitializationInCtx()); /*1000-INITIALIZATION SECTION*/
    if (programCtx.isProgramEnded()) {
      return methodOut;
    }
    //  cobolCode::IF REQ-NOT-OK OF F5957REQ-INPUT
    if (methodIn.isReqNotOk()) {
      // cobolCode::GO TO 0000-EXIT
      exit(programCtx);
      return methodOut;
      // cobolCodeEnds::GO TO 0000-EXIT
    }
    //  cobolCode::PERFORM 2000-VALIDATE-INPUT-AREA
    validateInputArea(programCtx.getValidateInputAreaInCtx()); /*2000-VALIDATE-INPUT-AREA SECTION*/
    if (programCtx.isProgramEnded()) {
      return methodOut;
    }

    // *    Validate the request area fields
    //  cobolCode::IF HSR-REQ-INVALID-REQUEST-PARMS
    if (methodIn.isHsrReqInvalidRequestParms()) {
      //  cobolCode::SET REQ-FAIL OF F5957REQ-INPUT TO TRUE
      methodOut.setReqFailTrue();

      //  cobolCode::SET REQ-SEE-VIEW-FOR-MORE-INFO OF F5957REQ-INPUT TO TRUE
      methodOut.setReqSeeViewForMoreInfoTrue();

      // cobolCode::GO TO 0000-EXIT
      exit(programCtx);
      return methodOut;
      // cobolCodeEnds::GO TO 0000-EXIT
    }
    //  cobolCode::PERFORM 2100-GET-STORAGE
    getStorage(programCtx.getGetStorageInCtx()); /*2100-GET-STORAGE SECTION*/
    if (programCtx.isProgramEnded()) {
      return methodOut;
    }

    // * Acquire storage for hsr return area

    // * Process each hipaa code
    //  cobolCode::PERFORM 3000-HSR-PROCESSING
    hsrProcessing(programCtx.getHsrProcessingInCtx()); /*3000-HSR-PROCESSING SECTION*/
    if (programCtx.isProgramEnded()) {
      return methodOut;
    }
    //  cobolCode::MOVE BHI-REQ-SLOT-TABLE TO WS-HCA-TABLES
    methodOut.setHcaTables(methodOut.getBhiReqSlotTable());
    //  cobolCode::IF HCA-TABLES OR EMP-TABLES OR BHI-REQ-SLOT-TABLE = 'PSE001'
    //  LITERAL_PSE001 = 'PSE001'
    if (methodOut.isHcaTables1()
        || methodIn.isEmpTables1()
        || compareChars(methodOut.getBhiReqSlotTable(), CONSTANTS.LITERAL_PSE001) == 0) {
      //  cobolCode::PERFORM 8000-CREATE-POS-SECT
      createPosSect(programCtx.getCreatePosSectInCtx()); /*8000-CREATE-POS-SECT SECTION*/
      if (programCtx.isProgramEnded()) {
        return methodOut;
      }
    }
    //  cobolCode::ELSE
    else {

      // *===============================================================
      // * Only create the qualified af-ci/st segmemts for bn7 view
      // * --------------------------------------------------------
      //  cobolCode::IF HSR-REQ-CREATOR = 'V5427BN7'
      //  LITERAL_V5427BN7 = 'V5427BN7'
      if (compareChars(methodIn.getHsrReqCreator(), CONSTANTS.LITERAL_V5427BN7) == 0) {
        //  cobolCode::IF EHB-BHI-AF-BOTH-YES
        if (methodIn.isEhbBhiAfBothYes()) {
          //  cobolCode::PERFORM 7000-CREATE-AF-HIPAA-SECT
          createAfHipaaSect(
              programCtx.getCreateAfHipaaSectInCtx()); /*7000-CREATE-AF-HIPAA-SECT SECTION*/
          if (programCtx.isProgramEnded()) {
            return methodOut;
          }
        }
      }
    }

    return methodOut;
  }
  /**
   * exit This method is derived from COBOL Paragraph - 0000-EXIT COBOL Cyclomatic complexity - 2
   * Input : None
   *
   * <p>Output : None
   *
   * @throws CFException
   */
  @Override
  public void exit(Bbhsr002Ctx programCtx) throws Exception {

    // *===============================================================
    //  cobolCode::PERFORM 9999-TERMINATION
    termination(programCtx.getTerminationInCtx()); /*9999-TERMINATION SECTION*/

    // ***  Exit.

    // *82                                                              *
    // *82 Called by: 0000-mainline                                     *
    // *82 calls    : 1. acquire-data-area-9961.                        *
    // *82            2. set-fma-err-tbl-9000.                          *
    // *82                                                              *
    // ******************************************************************

    // *    Aquire storage for foundation message area
    //  cobolCode::GOBACK
    setNotLogged(false); // no need to log, it is a normal termination
    programCtx.setProgramEnded(true);
    return;
  }
  /**
   * initialization This method is derived from COBOL Paragraph - 1000-INITIALIZATION SECTION COBOL
   * Cyclomatic complexity - 2 Input :
   *
   * <p>- adaAcqDataArea COBOL Name: ADA-ACQ-DATA-AREA - reqHsrHipaaList COBOL Name:
   * WS-REQ-HSR-HIPAA-LIST - reqAddress1Ptr COBOL Name: REQ-ADDRESS-1-PTR - hsrRequestArea COBOL
   * Name: HSR-REQUEST-AREA
   *
   * <p>Output :
   *
   * <p>- wvAdaFlength COBOL Name: WV-ADA-FLENGTH - foundnMsgCallerArea COBOL Name:
   * FOUNDN-MSG-CALLER-AREA - cicsDfhrespCode COBOL Name: CICS-DFHRESP-CODE - reqAddress4Ptr COBOL
   * Name: REQ-ADDRESS-4-PTR - reqAddress4Length COBOL Name: REQ-ADDRESS-4-LENGTH - reqAddress1Ptr
   * COBOL Name: REQ-ADDRESS-1-PTR - reqAddress1Length COBOL Name: REQ-ADDRESS-1-LENGTH -
   * reqReturnCode COBOL Name: REQ-RETURN-CODE - reqExplanationCode COBOL Name: REQ-EXPLANATION-CODE
   * - hsrReqContractRtnCd COBOL Name: HSR-REQ-CONTRACT-RTN-CD - fmaFixedArea COBOL Name:
   * FMA-FIXED-AREA - fmaIpType1 COBOL Name: FMA-IP-TYPE-1 - fmaIpType2 COBOL Name: FMA-IP-TYPE-2 -
   * fmaIpTypeAlpha2 COBOL Name: FMA-IP-TYPE-ALPHA-2 - fmaIpErrCode1 COBOL Name: FMA-IP-ERR-CODE-1 -
   * hpcReqstRetArea COBOL Name: HPC-REQST-RET-AREA - dsmPolRequestBlock COBOL Name:
   * DSM-POL-REQUEST-BLOCK - dsmPolRet1Block COBOL Name: DSM-POL-RET1-BLOCK - dsmPolRet2Block COBOL
   * Name: DSM-POL-RET2-BLOCK - dsmPolRet3Block COBOL Name: DSM-POL-RET3-BLOCK - dsmPolRet4Block
   * COBOL Name: DSM-POL-RET4-BLOCK - dsmPolRet5Block COBOL Name: DSM-POL-RET5-BLOCK -
   * dsmPolRet6Block COBOL Name: DSM-POL-RET6-BLOCK - dsmPolRet7Block COBOL Name: DSM-POL-RET7-BLOCK
   * - dsmPolRet8Block COBOL Name: DSM-POL-RET8-BLOCK - tliReqRetArea COBOL Name: TLI-REQ-RET-AREA -
   * bhiReqRetArea COBOL Name: BHI-REQ-RET-AREA - scnReqstRetArea COBOL Name: SCN-REQST-RET-AREA
   *
   * @throws CFException
   */
  @Override
  public InitializationOutCtx initialization(InitializationInCtx methodIn) throws Exception {
    // Added variable to get the program context in place.
    Bbhsr002Ctx programCtx = methodIn.getBbhsr002Ctx();
    // Added variable to get the output context in place.
    InitializationOutCtx methodOut = methodIn.getInitializationOutCtx();
    //  cobolCode::MOVE LENGTH OF FOUNDN-MSG-CALLER-AREA TO WV-ADA-FLENGTH
    methodOut.setWvAdaFlength(FoundnMsgCallerArea.getFoundnMsgCallerAreaFieldLength());
    //  cobolCode::PERFORM ACQUIRE-DATA-AREA-9961
    acquireDataArea9961(
        programCtx.getAcquireDataArea9961InCtx()); /*ACQUIRE-DATA-AREA-9961 SECTION*/
    //  cobolCode::SET ADDRESS OF FOUNDN-MSG-CALLER-AREA TO ADDRESS OF ADA-ACQ-DATA-AREA
    methodOut.getFoundnMsgCallerArea().set(methodIn.getAdaAcqDataAreaGroup());

    //  cobolCode::INITIALIZE FOUNDN-MSG-CALLER-AREA
    methodOut.getFoundnMsgCallerArea().initialize();

    // *EXEC CICS GET CONTAINER('F5957REQ')
    // *     CHANNEL('BN1-BBHSR002')
    // *     SET (ADDRESS OF F5957REQ-INPUT)
    // *     FLENGTH(LENGTH OF F5957REQ-INPUT)
    // *     RESP (CICS-DFHRESP-CODE)
    // *END-EXEC
    //  cobolCode::GET CONTAINER('F5957REQ') CHANNEL('BN1-BBHSR002') SET (ADDRESS OF F5957REQ-INPUT)
    // FLENGTH(FUNCTION~LENGTH~F5957REQ-INPUT) RESP (CICS-DFHRESP-CODE)

    // *EXEC CICS GET CONTAINER('F5957REQ')
    // *     CHANNEL('BN1-BBHSR002')
    // *     SET (ADDRESS OF F5957REQ-INPUT)
    // *     FLENGTH(LENGTH OF F5957REQ-INPUT)
    // *     RESP (CICS-DFHRESP-CODE)
    // *END-EXEC
    // get data from a container
    if (programCtx
        .getGlobalCtx()
        .containerExists(String.valueOf(CONSTANTS.LITERAL_F5957REQ).trim())) {
      methodIn
          .getF5957reqInput()
          .setString(
              programCtx
                  .getGlobalCtx()
                  .fetchContainer(String.valueOf(CONSTANTS.LITERAL_F5957REQ).trim()));
    } else {
    }
    //  cobolCode::MOVE EIBRESP TO CICS-DFHRESP-CODE
    methodOut.setCicsDfhrespCode(programCtx.getCicsSession().getEibresp());

    // *EXEC CICS GET CONTAINER('HSR-REQUEST-BLOCK')
    // *     SET (ADDRESS OF HSR-REQUEST-AREA)
    // *     FLENGTH(LENGTH OF HSR-REQUEST-AREA)
    // *     CHANNEL('BN1-BBHSR002')
    // *     RESP (CICS-DFHRESP-CODE)
    // *END-EXEC
    //  cobolCode::GET CONTAINER('HSR-REQUEST-BLOCK') SET (ADDRESS OF HSR-REQUEST-AREA)
    // FLENGTH(FUNCTION~LENGTH~HSR-REQUEST-AREA) CHANNEL('BN1-BBHSR002') RESP (CICS-DFHRESP-CODE)

    // *EXEC CICS GET CONTAINER('HSR-REQUEST-BLOCK')
    // *     SET (ADDRESS OF HSR-REQUEST-AREA)
    // *     FLENGTH(LENGTH OF HSR-REQUEST-AREA)
    // *     CHANNEL('BN1-BBHSR002')
    // *     RESP (CICS-DFHRESP-CODE)
    // *END-EXEC
    // get data from a container
    if (programCtx
        .getGlobalCtx()
        .containerExists(String.valueOf(CONSTANTS.LITERAL_HSR_MN2_REQUESTBLOCK).trim())) {
      methodIn
          .getHsrRequestArea()
          .setString(
              programCtx
                  .getGlobalCtx()
                  .fetchContainer(String.valueOf(CONSTANTS.LITERAL_HSR_MN2_REQUESTBLOCK).trim()));
    } else {
    }
    //  cobolCode::MOVE EIBRESP TO CICS-DFHRESP-CODE
    methodOut.setCicsDfhrespCode(programCtx.getCicsSession().getEibresp());

    // *EXEC CICS GET CONTAINER('BN7-REQ-HIPAA-CD-LIST')
    // *     CHANNEL('BN1-BBHSR002')
    // *     SET (ADDRESS OF WS-REQ-HSR-HIPAA-LIST)
    // *     FLENGTH(LENGTH OF WS-REQ-HSR-HIPAA-LIST)
    // *     RESP (CICS-DFHRESP-CODE)
    // *END-EXEC
    //  cobolCode::GET CONTAINER('BN7-REQ-HIPAA-CD-LIST') CHANNEL('BN1-BBHSR002') SET (ADDRESS OF
    // WS-REQ-HSR-HIPAA-LIST) FLENGTH(FUNCTION~LENGTH~WS-REQ-HSR-HIPAA-LIST) RESP
    // (CICS-DFHRESP-CODE)

    // *EXEC CICS GET CONTAINER('BN7-REQ-HIPAA-CD-LIST')
    // *     CHANNEL('BN1-BBHSR002')
    // *     SET (ADDRESS OF WS-REQ-HSR-HIPAA-LIST)
    // *     FLENGTH(LENGTH OF WS-REQ-HSR-HIPAA-LIST)
    // *     RESP (CICS-DFHRESP-CODE)
    // *END-EXEC
    // get data from a container
    if (programCtx
        .getGlobalCtx()
        .containerExists(String.valueOf(CONSTANTS.LITERAL_BN7_MN4_REQHIPAACDLIST).trim())) {
      methodIn
          .getReqHsrHipaaList()
          .setString(
              programCtx
                  .getGlobalCtx()
                  .fetchContainer(String.valueOf(CONSTANTS.LITERAL_BN7_MN4_REQHIPAACDLIST).trim()));
    } else {
    }
    //  cobolCode::MOVE EIBRESP TO CICS-DFHRESP-CODE
    methodOut.setCicsDfhrespCode(programCtx.getCicsSession().getEibresp());
    //  cobolCode::SET REQ-ADDRESS-4-PTR TO ADDRESS OF WS-REQ-HSR-HIPAA-LIST
    methodOut.setReqAddress4Ptr(setObject(methodIn.getReqHsrHipaaList()));

    //  cobolCode::MOVE LENGTH OF WS-REQ-HSR-HIPAA-LIST TO REQ-ADDRESS-4-LENGTH
    methodOut.setReqAddress4Length((short) ReqHsrHipaaList.getReqHsrHipaaListFieldLength());
    //  cobolCode::IF REQ-ADDRESS-1-PTR OF F5957REQ-INPUT NOT = NULLS
    //  LITERAL_NULLS = NULLS
    if (compareChars(
            pad(5, String.valueOf(methodOut.getReqAddress1Ptr()), "0", CFUtil.LEFT_PAD),
            CONSTANTS.LITERAL_NULLS)
        != 0) {
      //  cobolCode::SET REQ-ADDRESS-1-PTR OF F5957REQ-INPUT TO ADDRESS OF HSR-REQUEST-AREA
      methodOut.setReqAddress1Ptr(setObject(methodIn.getHsrRequestArea()));

      //  cobolCode::MOVE LENGTH OF HSR-REQUEST-AREA TO REQ-ADDRESS-1-LENGTH
      methodOut.setReqAddress1Length((short) HsrRequestArea.getHsrRequestAreaFieldLength());
    }

    // ***     Set address of hsr-request-area to
    // ***                    req-address-1-ptr of f5957req-input
    //  cobolCode::ELSE
    else {
      //  cobolCode::SET REQ-FAIL OF F5957REQ-INPUT TO TRUE
      methodOut.setReqFailTrue();

      //  cobolCode::SET REQ-PARM-ADDRESSES-ERROR OF F5957REQ-INPUT TO TRUE
      methodOut.setReqParmAddressesErrorTrue();

      //  cobolCode::SET HSR-REQ-CONTRCT-FAIL-C-FUNC-RC TO TRUE
      methodOut.setHsrReqContrctFailCFuncRcTrue();

      //  cobolCode::INITIALIZE FMA-FIXED-AREA
      methodOut.getFmaFixedArea().initialize();
      //  cobolCode::SET FMA-TYPE-IS-NUMERIC-1 TO TRUE
      methodOut.setFmaTypeIsNumeric1True();

      //  cobolCode::SET FMA-TYPE-IS-ALPHA-2 TO TRUE
      methodOut.setFmaTypeIsAlpha2True();

      //  LITERAL_1000 = '1000'
      methodOut.setFmaIpTypeAlpha2(CONSTANTS.LITERAL_1000);
      //  cobolCode::MOVE 1 TO FMA-IP-ERR-CODE-1
      //  LITERAL_1 = 1
      methodOut.setFmaIpErrCode1(1);
      //  cobolCode::PERFORM SET-FMA-ERR-TBL-9000
      setFmaErrTbl9000(programCtx.getSetFmaErrTbl9000InCtx()); /*SET-FMA-ERR-TBL-9000 SECTION*/
      // cobolCode::GO TO 1000-EXIT
      return methodOut;
      // cobolCodeEnds::GO TO 1000-EXIT
    }
    //  cobolCode::INITIALIZE HPC-REQST-RET-AREA DSM-POL-REQUEST-BLOCK DSM-POL-RET1-BLOCK
    // DSM-POL-RET2-BLOCK DSM-POL-RET3-BLOCK DSM-POL-RET4-BLOCK DSM-POL-RET5-BLOCK
    // DSM-POL-RET6-BLOCK DSM-POL-RET7-BLOCK DSM-POL-RET8-BLOCK TLI-REQ-RET-AREA BHI-REQ-RET-AREA
    // SCN-REQST-RET-AREA
    methodOut.getHpcReqstRetArea().initialize();
    methodOut.getDsmPolRequestBlock().initialize();
    methodOut.getDsmPolRet1Block().initialize();
    methodOut.getDsmPolRet2Block().initialize();
    methodOut.getDsmPolRet3Block().initialize();
    methodOut.getDsmPolRet4Block().initialize();
    methodOut.getDsmPolRet5Block().initialize();
    methodOut.getDsmPolRet6Block().initialize();
    methodOut.getDsmPolRet7Block().initialize();
    methodOut.getDsmPolRet8Block().initialize();
    methodOut.getTliReqRetArea().initialize();
    methodOut.getBhiReqRetArea().initialize();
    methodOut.getScnReqstRetArea().initialize();

    return methodOut;
  }
  /**
   * validateInputArea This method is derived from COBOL Paragraph - 2000-VALIDATE-INPUT-AREA
   * SECTION COBOL Cyclomatic complexity - 1088 Input :
   *
   * <p>- hsrReqCovTypCd COBOL Name: HSR-REQ-COV-TYP-CD - hsrReqMxiPolicy COBOL Name:
   * HSR-REQ-MXI-POLICY - hsrReqMxiPlan COBOL Name: HSR-REQ-MXI-PLAN - hsrReqMxiClass COBOL Name:
   * HSR-REQ-MXI-CLASS - hsrReqHipaaServTypCd COBOL Name: HSR-REQ-HIPAA-SERV-TYP-CD - hsrReqEffDate
   * COBOL Name: HSR-REQ-EFF-DATE - hsrReqCancelDate COBOL Name: HSR-REQ-CANCEL-DATE
   *
   * <p>Output :
   *
   * <p>- hsrReqContractRtnCd COBOL Name: HSR-REQ-CONTRACT-RTN-CD - fmaFixedArea COBOL Name:
   * FMA-FIXED-AREA - fmaIpType1 COBOL Name: FMA-IP-TYPE-1 - fmaIpType2 COBOL Name: FMA-IP-TYPE-2 -
   * fmaIpTypeAlpha2 COBOL Name: FMA-IP-TYPE-ALPHA-2 - fmaIpErrCode1 COBOL Name: FMA-IP-ERR-CODE-1 -
   * hcaPolicySets COBOL Name: WS-HCA-POLICY-SETS - empPolicySets COBOL Name: WS-EMP-POLICY-SETS
   *
   * @throws CFException
   */
  @Override
  public ValidateInputAreaOutCtx validateInputArea(ValidateInputAreaInCtx methodIn)
      throws Exception {

    // ******************************************************************
    // *81 2000-Validate-input-area                                     *
    // *81                                                              *
    // *81 business function :                                          *
    // *81 validates all input fields, if not valid invalid parms error *
    // *81 is set                                                       *
    // ******************************************************************
    // *82 2000-validate-input-area                                     *
    // *82                                                              *
    // *82 1. validates all input fields                                *
    // *82                                                              *
    // *82 called by: 1000-initialization.                              *
    // *82 calls    : set-fma-err-tbl-9000.                             *
    // *82                                                              *
    // ******************************************************************
    // Added variable to get the program context in place.
    Bbhsr002Ctx programCtx = methodIn.getBbhsr002Ctx();
    // Added variable to get the output context in place.
    ValidateInputAreaOutCtx methodOut = methodIn.getValidateInputAreaOutCtx();
    //  cobolCode::SET HSR-REQ-CONTRACT-SUCCESS TO TRUE
    methodOut.setHsrReqContractSuccessTrue();

    //  cobolCode::IF HSR-REQ-COV-TYP-CD = SPACES OR LOW-VALUES OR HIGH-VALUES
    if ((allSpaces(methodIn.getHsrReqCovTypCd()))
        || (checkLowValue(methodIn.getHsrReqCovTypCd()))
        || (isHighValue(methodIn.getHsrReqCovTypCd()))) {
      //  cobolCode::SET HSR-REQ-INVALID-REQUEST-PARMS TO TRUE
      methodOut.setHsrReqInvalidRequestParmsTrue();

      //  cobolCode::INITIALIZE FMA-FIXED-AREA
      methodOut.getFmaFixedArea().initialize();
      //  cobolCode::SET FMA-TYPE-IS-NUMERIC-1 TO TRUE
      methodOut.setFmaTypeIsNumeric1True();

      //  cobolCode::SET FMA-TYPE-IS-ALPHA-2 TO TRUE
      methodOut.setFmaTypeIsAlpha2True();

      //  LITERAL_2000 = '2000'
      methodOut.setFmaIpTypeAlpha2(CONSTANTS.LITERAL_2000);
      //  cobolCode::MOVE 2 TO FMA-IP-ERR-CODE-1
      methodOut.setFmaIpErrCode1(2);
      //  cobolCode::PERFORM SET-FMA-ERR-TBL-9000
      setFmaErrTbl9000(programCtx.getSetFmaErrTbl9000InCtx()); /*SET-FMA-ERR-TBL-9000 SECTION*/
      // cobolCode::GO TO 2000-EXIT
      return methodOut;
      // cobolCodeEnds::GO TO 2000-EXIT
    }
    //  cobolCode::IF HSR-REQ-MXI-POLICY = SPACES OR LOW-VALUES OR HIGH-VALUES
    if ((allSpaces(methodIn.getHsrReqMxiPolicy()))
        || (checkLowValue(methodIn.getHsrReqMxiPolicy()))
        || (isHighValue(methodIn.getHsrReqMxiPolicy()))) {
      //  cobolCode::SET HSR-REQ-INVALID-REQUEST-PARMS TO TRUE
      methodOut.setHsrReqInvalidRequestParmsTrue();

      //  cobolCode::INITIALIZE FMA-FIXED-AREA
      methodOut.getFmaFixedArea().initialize();
      //  cobolCode::SET FMA-TYPE-IS-NUMERIC-1 TO TRUE
      methodOut.setFmaTypeIsNumeric1True();

      //  cobolCode::SET FMA-TYPE-IS-ALPHA-2 TO TRUE
      methodOut.setFmaTypeIsAlpha2True();

      //  LITERAL_2000 = '2000'
      methodOut.setFmaIpTypeAlpha2(CONSTANTS.LITERAL_2000);
      //  cobolCode::MOVE 3 TO FMA-IP-ERR-CODE-1
      methodOut.setFmaIpErrCode1(3);
      //  cobolCode::PERFORM SET-FMA-ERR-TBL-9000
      setFmaErrTbl9000(programCtx.getSetFmaErrTbl9000InCtx()); /*SET-FMA-ERR-TBL-9000 SECTION*/
      // cobolCode::GO TO 2000-EXIT
      return methodOut;
      // cobolCodeEnds::GO TO 2000-EXIT
    }
    //  cobolCode::IF HSR-REQ-MXI-PLAN = ZEROS OR LOW-VALUES OR HIGH-VALUES OR HSR-REQ-MXI-PLAN NOT
    // NUMERIC
    if ((methodIn.getHsrReqMxiPlan() == 0)
        || (checkLowValue(methodIn.getHsrReqMxiPlanString()))
        || (isHighValue(methodIn.getHsrReqMxiPlanString()))
        || !(methodIn.getHsrReqRequest().hsrReqMxiPlanIsNumeric())) {
      //  cobolCode::SET HSR-REQ-INVALID-REQUEST-PARMS TO TRUE
      methodOut.setHsrReqInvalidRequestParmsTrue();

      //  cobolCode::INITIALIZE FMA-FIXED-AREA
      methodOut.getFmaFixedArea().initialize();
      //  cobolCode::SET FMA-TYPE-IS-NUMERIC-1 TO TRUE
      methodOut.setFmaTypeIsNumeric1True();

      //  cobolCode::SET FMA-TYPE-IS-ALPHA-2 TO TRUE
      methodOut.setFmaTypeIsAlpha2True();

      //  LITERAL_2000 = '2000'
      methodOut.setFmaIpTypeAlpha2(CONSTANTS.LITERAL_2000);
      //  cobolCode::MOVE 4 TO FMA-IP-ERR-CODE-1
      methodOut.setFmaIpErrCode1(4);
      //  cobolCode::PERFORM SET-FMA-ERR-TBL-9000
      setFmaErrTbl9000(programCtx.getSetFmaErrTbl9000InCtx()); /*SET-FMA-ERR-TBL-9000 SECTION*/
      // cobolCode::GO TO 2000-EXIT
      return methodOut;
      // cobolCodeEnds::GO TO 2000-EXIT
    }
    //  cobolCode::IF HSR-REQ-MXI-CLASS = LOW-VALUES OR HIGH-VALUES OR HSR-REQ-MXI-CLASS NOT NUMERIC
    if ((checkLowValue(methodIn.getHsrReqMxiClassString()))
        || (isHighValue(methodIn.getHsrReqMxiClassString()))
        || !(methodIn.getHsrReqRequest().hsrReqMxiClassIsNumeric())) {
      //  cobolCode::SET HSR-REQ-INVALID-REQUEST-PARMS TO TRUE
      methodOut.setHsrReqInvalidRequestParmsTrue();

      //  cobolCode::INITIALIZE FMA-FIXED-AREA
      methodOut.getFmaFixedArea().initialize();
      //  cobolCode::SET FMA-TYPE-IS-NUMERIC-1 TO TRUE
      methodOut.setFmaTypeIsNumeric1True();

      //  cobolCode::SET FMA-TYPE-IS-ALPHA-2 TO TRUE
      methodOut.setFmaTypeIsAlpha2True();

      //  LITERAL_2000 = '2000'
      methodOut.setFmaIpTypeAlpha2(CONSTANTS.LITERAL_2000);
      //  cobolCode::MOVE 5 TO FMA-IP-ERR-CODE-1
      methodOut.setFmaIpErrCode1(5);
      //  cobolCode::PERFORM SET-FMA-ERR-TBL-9000
      setFmaErrTbl9000(programCtx.getSetFmaErrTbl9000InCtx()); /*SET-FMA-ERR-TBL-9000 SECTION*/
      // cobolCode::GO TO 2000-EXIT
      return methodOut;
      // cobolCodeEnds::GO TO 2000-EXIT
    }
    //  cobolCode::IF HSR-REQ-HIPAA-SERV-TYP-CD = LOW-VALUES OR HIGH-VALUES
    if ((checkLowValue(methodIn.getHsrReqHipaaServTypCd()))
        || (isHighValue(methodIn.getHsrReqHipaaServTypCd()))) {
      //  cobolCode::SET HSR-REQ-INVALID-REQUEST-PARMS TO TRUE
      methodOut.setHsrReqInvalidRequestParmsTrue();

      //  cobolCode::INITIALIZE FMA-FIXED-AREA
      methodOut.getFmaFixedArea().initialize();
      //  cobolCode::SET FMA-TYPE-IS-NUMERIC-1 TO TRUE
      methodOut.setFmaTypeIsNumeric1True();

      //  cobolCode::SET FMA-TYPE-IS-ALPHA-2 TO TRUE
      methodOut.setFmaTypeIsAlpha2True();

      //  LITERAL_2000 = '2000'
      methodOut.setFmaIpTypeAlpha2(CONSTANTS.LITERAL_2000);
      //  cobolCode::MOVE 6 TO FMA-IP-ERR-CODE-1
      methodOut.setFmaIpErrCode1(6);
      //  cobolCode::PERFORM SET-FMA-ERR-TBL-9000
      setFmaErrTbl9000(programCtx.getSetFmaErrTbl9000InCtx()); /*SET-FMA-ERR-TBL-9000 SECTION*/
      // cobolCode::GO TO 2000-EXIT
      return methodOut;
      // cobolCodeEnds::GO TO 2000-EXIT
    }
    //  cobolCode::IF HSR-REQ-EFF-DATE = ZEROS OR LOW-VALUES OR HIGH-VALUES OR HSR-REQ-EFF-DATE NOT
    // NUMERIC
    if ((methodIn.getHsrReqEffDate() == 0)
        || (checkLowValue(methodIn.getHsrReqEffDateString()))
        || (isHighValue(methodIn.getHsrReqEffDateString()))
        || !(methodIn.getHsrReqRequest().hsrReqEffDateIsNumeric())) {
      //  cobolCode::SET HSR-REQ-INVALID-REQUEST-PARMS TO TRUE
      methodOut.setHsrReqInvalidRequestParmsTrue();

      //  cobolCode::INITIALIZE FMA-FIXED-AREA
      methodOut.getFmaFixedArea().initialize();
      //  cobolCode::SET FMA-TYPE-IS-NUMERIC-1 TO TRUE
      methodOut.setFmaTypeIsNumeric1True();

      //  cobolCode::SET FMA-TYPE-IS-ALPHA-2 TO TRUE
      methodOut.setFmaTypeIsAlpha2True();

      //  LITERAL_2000 = '2000'
      methodOut.setFmaIpTypeAlpha2(CONSTANTS.LITERAL_2000);
      //  cobolCode::MOVE 7 TO FMA-IP-ERR-CODE-1
      methodOut.setFmaIpErrCode1(7);
      //  cobolCode::PERFORM SET-FMA-ERR-TBL-9000
      setFmaErrTbl9000(programCtx.getSetFmaErrTbl9000InCtx()); /*SET-FMA-ERR-TBL-9000 SECTION*/
      // cobolCode::GO TO 2000-EXIT
      return methodOut;
      // cobolCodeEnds::GO TO 2000-EXIT
    }
    //  cobolCode::IF HSR-REQ-CANCEL-DATE = ZEROS OR LOW-VALUES OR HIGH-VALUES OR
    // HSR-REQ-CANCEL-DATE NOT NUMERIC
    if ((methodIn.getHsrReqCancelDate() == 0)
        || (checkLowValue(methodIn.getHsrReqCancelDateString()))
        || (isHighValue(methodIn.getHsrReqCancelDateString()))
        || !(methodIn.getHsrReqRequest().hsrReqCancelDateIsNumeric())) {
      //  cobolCode::SET HSR-REQ-INVALID-REQUEST-PARMS TO TRUE
      methodOut.setHsrReqInvalidRequestParmsTrue();

      //  cobolCode::INITIALIZE FMA-FIXED-AREA
      methodOut.getFmaFixedArea().initialize();
      //  cobolCode::SET FMA-TYPE-IS-NUMERIC-1 TO TRUE
      methodOut.setFmaTypeIsNumeric1True();

      //  cobolCode::SET FMA-TYPE-IS-ALPHA-2 TO TRUE
      methodOut.setFmaTypeIsAlpha2True();

      //  LITERAL_2000 = '2000'
      methodOut.setFmaIpTypeAlpha2(CONSTANTS.LITERAL_2000);
      //  cobolCode::MOVE 8 TO FMA-IP-ERR-CODE-1
      methodOut.setFmaIpErrCode1(8);
      //  cobolCode::PERFORM SET-FMA-ERR-TBL-9000
      setFmaErrTbl9000(programCtx.getSetFmaErrTbl9000InCtx()); /*SET-FMA-ERR-TBL-9000 SECTION*/
      // cobolCode::GO TO 2000-EXIT
      return methodOut;
      // cobolCodeEnds::GO TO 2000-EXIT
    }

    // *******************   Hca policies   ****************
    //  cobolCode::IF HSR-REQ-MXI-POLICY = '730152'
    //  LITERAL_730152 = '730152'
    if (compareChars(methodIn.getHsrReqMxiPolicy(), CONSTANTS.LITERAL_730152) == 0) {
      //  cobolCode::IF HSR-REQ-MXI-PLAN = '0027' OR '0028' OR '0059' OR '0060'
      //  LITERAL_0060 = '0060'
      if (compareChars(methodIn.getHsrReqRequest().getHsrReqMxiPlanString(), CONSTANTS.LITERAL_0027)
              == 0
          || compareChars(
                  methodIn.getHsrReqRequest().getHsrReqMxiPlanString(), CONSTANTS.LITERAL_0028)
              == 0
          || compareChars(
                  methodIn.getHsrReqRequest().getHsrReqMxiPlanString(), CONSTANTS.LITERAL_0059)
              == 0
          || compareChars(
                  methodIn.getHsrReqRequest().getHsrReqMxiPlanString(), CONSTANTS.LITERAL_0060)
              == 0) {
        //  cobolCode::SET SET-21 TO TRUE
        methodOut.setSet21True();
      }
      //  cobolCode::IF HSR-REQ-MXI-PLAN = '0029' OR '0030' OR '0061' OR '0062'
      //  LITERAL_0062 = '0062'
      if (compareChars(methodIn.getHsrReqRequest().getHsrReqMxiPlanString(), CONSTANTS.LITERAL_0029)
              == 0
          || compareChars(
                  methodIn.getHsrReqRequest().getHsrReqMxiPlanString(), CONSTANTS.LITERAL_0030)
              == 0
          || compareChars(
                  methodIn.getHsrReqRequest().getHsrReqMxiPlanString(), CONSTANTS.LITERAL_0061)
              == 0
          || compareChars(
                  methodIn.getHsrReqRequest().getHsrReqMxiPlanString(), CONSTANTS.LITERAL_0062)
              == 0) {
        //  cobolCode::SET SET-22 TO TRUE
        methodOut.setSet22True();
      }
      //  cobolCode::IF HSR-REQ-MXI-PLAN = '0031' OR '0032' OR '0063' OR '0064'
      //  LITERAL_0064 = '0064'
      if (compareChars(methodIn.getHsrReqRequest().getHsrReqMxiPlanString(), CONSTANTS.LITERAL_0031)
              == 0
          || compareChars(
                  methodIn.getHsrReqRequest().getHsrReqMxiPlanString(), CONSTANTS.LITERAL_0032)
              == 0
          || compareChars(
                  methodIn.getHsrReqRequest().getHsrReqMxiPlanString(), CONSTANTS.LITERAL_0063)
              == 0
          || compareChars(
                  methodIn.getHsrReqRequest().getHsrReqMxiPlanString(), CONSTANTS.LITERAL_0064)
              == 0) {
        //  cobolCode::SET SET-23 TO TRUE
        methodOut.setSet23True();
      }
      //  cobolCode::IF HSR-REQ-MXI-PLAN = '0039' OR '0040'
      //  LITERAL_0040 = '0040'
      if (compareChars(methodIn.getHsrReqRequest().getHsrReqMxiPlanString(), CONSTANTS.LITERAL_0039)
              == 0
          || compareChars(
                  methodIn.getHsrReqRequest().getHsrReqMxiPlanString(), CONSTANTS.LITERAL_0040)
              == 0) {
        //  cobolCode::SET SET-27 TO TRUE
        methodOut.setSet27True();
      }
      //  cobolCode::IF HSR-REQ-MXI-PLAN = '0041' OR '0042'
      //  LITERAL_0042 = '0042'
      if (compareChars(methodIn.getHsrReqRequest().getHsrReqMxiPlanString(), CONSTANTS.LITERAL_0041)
              == 0
          || compareChars(
                  methodIn.getHsrReqRequest().getHsrReqMxiPlanString(), CONSTANTS.LITERAL_0042)
              == 0) {
        //  cobolCode::SET SET-28 TO TRUE
        methodOut.setSet28True();
      }
      //  cobolCode::IF HSR-REQ-MXI-PLAN = '0045' OR '0046'
      //  LITERAL_0046 = '0046'
      if (compareChars(methodIn.getHsrReqRequest().getHsrReqMxiPlanString(), CONSTANTS.LITERAL_0045)
              == 0
          || compareChars(
                  methodIn.getHsrReqRequest().getHsrReqMxiPlanString(), CONSTANTS.LITERAL_0046)
              == 0) {
        //  cobolCode::SET SET-30 TO TRUE
        methodOut.setSet30True();
      }
      //  cobolCode::IF HSR-REQ-MXI-PLAN = '0047' OR '0048'
      //  LITERAL_0048 = '0048'
      if (compareChars(methodIn.getHsrReqRequest().getHsrReqMxiPlanString(), CONSTANTS.LITERAL_0047)
              == 0
          || compareChars(
                  methodIn.getHsrReqRequest().getHsrReqMxiPlanString(), CONSTANTS.LITERAL_0048)
              == 0) {
        //  cobolCode::SET SET-31 TO TRUE
        methodOut.setSet31True();
      }
      //  cobolCode::IF HSR-REQ-MXI-PLAN = '0049' OR '0050'
      //  LITERAL_0050 = '0050'
      if (compareChars(methodIn.getHsrReqRequest().getHsrReqMxiPlanString(), CONSTANTS.LITERAL_0049)
              == 0
          || compareChars(
                  methodIn.getHsrReqRequest().getHsrReqMxiPlanString(), CONSTANTS.LITERAL_0050)
              == 0) {
        //  cobolCode::SET SET-32 TO TRUE
        methodOut.setSet32True();
      }
      //  cobolCode::IF HSR-REQ-MXI-PLAN = '0051' OR '0052'
      //  LITERAL_0052 = '0052'
      if (compareChars(methodIn.getHsrReqRequest().getHsrReqMxiPlanString(), CONSTANTS.LITERAL_0051)
              == 0
          || compareChars(
                  methodIn.getHsrReqRequest().getHsrReqMxiPlanString(), CONSTANTS.LITERAL_0052)
              == 0) {
        //  cobolCode::SET SET-33 TO TRUE
        methodOut.setSet33True();
      }
      //  cobolCode::IF HSR-REQ-MXI-PLAN = '0053' OR '0054'
      //  LITERAL_0054 = '0054'
      if (compareChars(methodIn.getHsrReqRequest().getHsrReqMxiPlanString(), CONSTANTS.LITERAL_0053)
              == 0
          || compareChars(
                  methodIn.getHsrReqRequest().getHsrReqMxiPlanString(), CONSTANTS.LITERAL_0054)
              == 0) {
        //  cobolCode::SET SET-34 TO TRUE
        methodOut.setSet34True();
      }
      //  cobolCode::IF HSR-REQ-MXI-PLAN = '0055' OR '0056'
      //  LITERAL_0056 = '0056'
      if (compareChars(methodIn.getHsrReqRequest().getHsrReqMxiPlanString(), CONSTANTS.LITERAL_0055)
              == 0
          || compareChars(
                  methodIn.getHsrReqRequest().getHsrReqMxiPlanString(), CONSTANTS.LITERAL_0056)
              == 0) {
        //  cobolCode::SET SET-35 TO TRUE
        methodOut.setSet35True();
      }
      //  cobolCode::IF HSR-REQ-MXI-PLAN = '0057' OR '0058'
      //  LITERAL_0058 = '0058'
      if (compareChars(methodIn.getHsrReqRequest().getHsrReqMxiPlanString(), CONSTANTS.LITERAL_0057)
              == 0
          || compareChars(
                  methodIn.getHsrReqRequest().getHsrReqMxiPlanString(), CONSTANTS.LITERAL_0058)
              == 0) {
        //  cobolCode::SET SET-36 TO TRUE
        methodOut.setSet36True();
      }
      //  cobolCode::IF HSR-REQ-MXI-PLAN = '0065' OR '0066'
      //  LITERAL_0066 = '0066'
      if (compareChars(methodIn.getHsrReqRequest().getHsrReqMxiPlanString(), CONSTANTS.LITERAL_0065)
              == 0
          || compareChars(
                  methodIn.getHsrReqRequest().getHsrReqMxiPlanString(), CONSTANTS.LITERAL_0066)
              == 0) {
        //  cobolCode::SET SET-37 TO TRUE
        methodOut.setSet37True();
      }
      //  cobolCode::IF HSR-REQ-MXI-PLAN = '0067' OR '0068'
      //  LITERAL_0068 = '0068'
      if (compareChars(methodIn.getHsrReqRequest().getHsrReqMxiPlanString(), CONSTANTS.LITERAL_0067)
              == 0
          || compareChars(
                  methodIn.getHsrReqRequest().getHsrReqMxiPlanString(), CONSTANTS.LITERAL_0068)
              == 0) {
        //  cobolCode::SET SET-38 TO TRUE
        methodOut.setSet38True();
      }
      //  cobolCode::IF HSR-REQ-MXI-PLAN = '0069' OR '0070'
      //  LITERAL_0070 = '0070'
      if (compareChars(methodIn.getHsrReqRequest().getHsrReqMxiPlanString(), CONSTANTS.LITERAL_0069)
              == 0
          || compareChars(
                  methodIn.getHsrReqRequest().getHsrReqMxiPlanString(), CONSTANTS.LITERAL_0070)
              == 0) {
        //  cobolCode::SET SET-39 TO TRUE
        methodOut.setSet39True();
      }
      //  cobolCode::IF HSR-REQ-MXI-PLAN = '0071' OR '0072'
      //  LITERAL_0072 = '0072'
      if (compareChars(methodIn.getHsrReqRequest().getHsrReqMxiPlanString(), CONSTANTS.LITERAL_0071)
              == 0
          || compareChars(
                  methodIn.getHsrReqRequest().getHsrReqMxiPlanString(), CONSTANTS.LITERAL_0072)
              == 0) {
        //  cobolCode::SET SET-40 TO TRUE
        methodOut.setSet40True();
      }
      //  cobolCode::IF HSR-REQ-MXI-PLAN = '0073' OR '0074'
      //  LITERAL_0074 = '0074'
      if (compareChars(methodIn.getHsrReqRequest().getHsrReqMxiPlanString(), CONSTANTS.LITERAL_0073)
              == 0
          || compareChars(
                  methodIn.getHsrReqRequest().getHsrReqMxiPlanString(), CONSTANTS.LITERAL_0074)
              == 0) {
        //  cobolCode::SET SET-41 TO TRUE
        methodOut.setSet41True();
      }
      //  cobolCode::IF HSR-REQ-MXI-PLAN = '0075' OR '0076'
      //  LITERAL_0076 = '0076'
      if (compareChars(methodIn.getHsrReqRequest().getHsrReqMxiPlanString(), CONSTANTS.LITERAL_0075)
              == 0
          || compareChars(
                  methodIn.getHsrReqRequest().getHsrReqMxiPlanString(), CONSTANTS.LITERAL_0076)
              == 0) {
        //  cobolCode::SET SET-42 TO TRUE
        methodOut.setSet42True();
      }
      //  cobolCode::IF HSR-REQ-MXI-PLAN = '0083' OR '0084' OR '0087' OR '0088'
      //  LITERAL_0088 = '0088'
      if (compareChars(methodIn.getHsrReqRequest().getHsrReqMxiPlanString(), CONSTANTS.LITERAL_0083)
              == 0
          || compareChars(
                  methodIn.getHsrReqRequest().getHsrReqMxiPlanString(), CONSTANTS.LITERAL_0084)
              == 0
          || compareChars(
                  methodIn.getHsrReqRequest().getHsrReqMxiPlanString(), CONSTANTS.LITERAL_0087)
              == 0
          || compareChars(
                  methodIn.getHsrReqRequest().getHsrReqMxiPlanString(), CONSTANTS.LITERAL_0088)
              == 0) {
        //  cobolCode::SET SET-43 TO TRUE
        methodOut.setSet43True();
      }
      //  cobolCode::IF HSR-REQ-MXI-PLAN = '0085' OR '0086' OR '0089' OR '0090'
      //  LITERAL_0090 = '0090'
      if (compareChars(methodIn.getHsrReqRequest().getHsrReqMxiPlanString(), CONSTANTS.LITERAL_0085)
              == 0
          || compareChars(
                  methodIn.getHsrReqRequest().getHsrReqMxiPlanString(), CONSTANTS.LITERAL_0086)
              == 0
          || compareChars(
                  methodIn.getHsrReqRequest().getHsrReqMxiPlanString(), CONSTANTS.LITERAL_0089)
              == 0
          || compareChars(
                  methodIn.getHsrReqRequest().getHsrReqMxiPlanString(), CONSTANTS.LITERAL_0090)
              == 0) {
        //  cobolCode::SET SET-44 TO TRUE
        methodOut.setSet44True();
      }
      //  cobolCode::IF HSR-REQ-MXI-PLAN = '0091' OR '0092' OR '0095' OR '0096'
      //  LITERAL_0096 = '0096'
      if (compareChars(methodIn.getHsrReqRequest().getHsrReqMxiPlanString(), CONSTANTS.LITERAL_0091)
              == 0
          || compareChars(
                  methodIn.getHsrReqRequest().getHsrReqMxiPlanString(), CONSTANTS.LITERAL_0092)
              == 0
          || compareChars(
                  methodIn.getHsrReqRequest().getHsrReqMxiPlanString(), CONSTANTS.LITERAL_0095)
              == 0
          || compareChars(
                  methodIn.getHsrReqRequest().getHsrReqMxiPlanString(), CONSTANTS.LITERAL_0096)
              == 0) {
        //  cobolCode::SET SET-45 TO TRUE
        methodOut.setSet45True();
      }
      //  cobolCode::IF HSR-REQ-MXI-PLAN = '0093' OR '0094' OR '0097' OR '0098'
      //  LITERAL_0098 = '0098'
      if (compareChars(methodIn.getHsrReqRequest().getHsrReqMxiPlanString(), CONSTANTS.LITERAL_0093)
              == 0
          || compareChars(
                  methodIn.getHsrReqRequest().getHsrReqMxiPlanString(), CONSTANTS.LITERAL_0094)
              == 0
          || compareChars(
                  methodIn.getHsrReqRequest().getHsrReqMxiPlanString(), CONSTANTS.LITERAL_0097)
              == 0
          || compareChars(
                  methodIn.getHsrReqRequest().getHsrReqMxiPlanString(), CONSTANTS.LITERAL_0098)
              == 0) {
        //  cobolCode::SET SET-46 TO TRUE
        methodOut.setSet46True();
      }
      //  cobolCode::IF HSR-REQ-MXI-PLAN = '0077' OR '0078'
      //  LITERAL_0078 = '0078'
      if (compareChars(methodIn.getHsrReqRequest().getHsrReqMxiPlanString(), CONSTANTS.LITERAL_0077)
              == 0
          || compareChars(
                  methodIn.getHsrReqRequest().getHsrReqMxiPlanString(), CONSTANTS.LITERAL_0078)
              == 0) {
        //  cobolCode::SET SET-47 TO TRUE
        methodOut.setSet47True();
      }
      //  cobolCode::IF HSR-REQ-MXI-PLAN = '0079' OR '0080'
      //  LITERAL_0080 = '0080'
      if (compareChars(methodIn.getHsrReqRequest().getHsrReqMxiPlanString(), CONSTANTS.LITERAL_0079)
              == 0
          || compareChars(
                  methodIn.getHsrReqRequest().getHsrReqMxiPlanString(), CONSTANTS.LITERAL_0080)
              == 0) {
        //  cobolCode::SET SET-48 TO TRUE
        methodOut.setSet48True();
      }
      //  cobolCode::IF HSR-REQ-MXI-PLAN = '0081' OR '0082'
      //  LITERAL_0082 = '0082'
      if (compareChars(methodIn.getHsrReqRequest().getHsrReqMxiPlanString(), CONSTANTS.LITERAL_0081)
              == 0
          || compareChars(
                  methodIn.getHsrReqRequest().getHsrReqMxiPlanString(), CONSTANTS.LITERAL_0082)
              == 0) {
        //  cobolCode::SET SET-49 TO TRUE
        methodOut.setSet49True();
      }
      //  cobolCode::IF HSR-REQ-MXI-PLAN = '0099' OR '0100'
      //  LITERAL_0100 = '0100'
      if (compareChars(methodIn.getHsrReqRequest().getHsrReqMxiPlanString(), CONSTANTS.LITERAL_0099)
              == 0
          || compareChars(
                  methodIn.getHsrReqRequest().getHsrReqMxiPlanString(), CONSTANTS.LITERAL_0100)
              == 0) {
        //  cobolCode::SET SET-50 TO TRUE
        methodOut.setSet50True();
      }
      //  cobolCode::IF HSR-REQ-MXI-PLAN = '0101' OR '0102'
      //  LITERAL_0102 = '0102'
      if (compareChars(methodIn.getHsrReqRequest().getHsrReqMxiPlanString(), CONSTANTS.LITERAL_0101)
              == 0
          || compareChars(
                  methodIn.getHsrReqRequest().getHsrReqMxiPlanString(), CONSTANTS.LITERAL_0102)
              == 0) {
        //  cobolCode::SET SET-51 TO TRUE
        methodOut.setSet51True();
      }
      //  cobolCode::IF HSR-REQ-MXI-PLAN = '0103' OR '0104'
      //  LITERAL_0104 = '0104'
      if (compareChars(methodIn.getHsrReqRequest().getHsrReqMxiPlanString(), CONSTANTS.LITERAL_0103)
              == 0
          || compareChars(
                  methodIn.getHsrReqRequest().getHsrReqMxiPlanString(), CONSTANTS.LITERAL_0104)
              == 0) {
        //  cobolCode::SET SET-52 TO TRUE
        methodOut.setSet52True();
      }
      //  cobolCode::IF HSR-REQ-MXI-PLAN = '0105' OR '0106'
      //  LITERAL_0106 = '0106'
      if (compareChars(methodIn.getHsrReqRequest().getHsrReqMxiPlanString(), CONSTANTS.LITERAL_0105)
              == 0
          || compareChars(
                  methodIn.getHsrReqRequest().getHsrReqMxiPlanString(), CONSTANTS.LITERAL_0106)
              == 0) {
        //  cobolCode::SET SET-53 TO TRUE
        methodOut.setSet53True();
      }
    }

    // *****************  Empire policies  *****************
    //  cobolCode::IF HSR-REQ-MXI-POLICY = '030500'
    //  LITERAL_030500 = '030500'
    if (compareChars(methodIn.getHsrReqMxiPolicy(), CONSTANTS.LITERAL_030500) == 0) {
      //  cobolCode::IF HSR-REQ-MXI-PLAN = '0200' OR '0217' OR '0230' OR '0246' OR '0257' OR '0407'
      // OR '0603'
      //  LITERAL_0603 = '0603'
      if (compareChars(methodIn.getHsrReqRequest().getHsrReqMxiPlanString(), CONSTANTS.LITERAL_0200)
              == 0
          || compareChars(
                  methodIn.getHsrReqRequest().getHsrReqMxiPlanString(), CONSTANTS.LITERAL_0217)
              == 0
          || compareChars(
                  methodIn.getHsrReqRequest().getHsrReqMxiPlanString(), CONSTANTS.LITERAL_0230)
              == 0
          || compareChars(
                  methodIn.getHsrReqRequest().getHsrReqMxiPlanString(), CONSTANTS.LITERAL_0246)
              == 0
          || compareChars(
                  methodIn.getHsrReqRequest().getHsrReqMxiPlanString(), CONSTANTS.LITERAL_0257)
              == 0
          || compareChars(
                  methodIn.getHsrReqRequest().getHsrReqMxiPlanString(), CONSTANTS.LITERAL_0407)
              == 0
          || compareChars(
                  methodIn.getHsrReqRequest().getHsrReqMxiPlanString(), CONSTANTS.LITERAL_0603)
              == 0) {
        //  cobolCode::SET EMP-SET-01 TO TRUE
        methodOut.setEmpSet01True();
      }
      //  cobolCode::IF HSR-REQ-MXI-PLAN = '0209' OR '0239' OR '0397'
      //  LITERAL_0397 = '0397'
      if (compareChars(methodIn.getHsrReqRequest().getHsrReqMxiPlanString(), CONSTANTS.LITERAL_0209)
              == 0
          || compareChars(
                  methodIn.getHsrReqRequest().getHsrReqMxiPlanString(), CONSTANTS.LITERAL_0239)
              == 0
          || compareChars(
                  methodIn.getHsrReqRequest().getHsrReqMxiPlanString(), CONSTANTS.LITERAL_0397)
              == 0) {
        //  cobolCode::SET EMP-SET-03 TO TRUE
        methodOut.setEmpSet03True();
      }
      //  cobolCode::IF HSR-REQ-MXI-PLAN = '0203' OR '0220' OR '0233' OR '0258' OR '0403' OR '0602'
      //  LITERAL_0602 = '0602'
      if (compareChars(methodIn.getHsrReqRequest().getHsrReqMxiPlanString(), CONSTANTS.LITERAL_0203)
              == 0
          || compareChars(
                  methodIn.getHsrReqRequest().getHsrReqMxiPlanString(), CONSTANTS.LITERAL_0220)
              == 0
          || compareChars(
                  methodIn.getHsrReqRequest().getHsrReqMxiPlanString(), CONSTANTS.LITERAL_0233)
              == 0
          || compareChars(
                  methodIn.getHsrReqRequest().getHsrReqMxiPlanString(), CONSTANTS.LITERAL_0258)
              == 0
          || compareChars(
                  methodIn.getHsrReqRequest().getHsrReqMxiPlanString(), CONSTANTS.LITERAL_0403)
              == 0
          || compareChars(
                  methodIn.getHsrReqRequest().getHsrReqMxiPlanString(), CONSTANTS.LITERAL_0602)
              == 0) {
        //  cobolCode::SET EMP-SET-04 TO TRUE
        methodOut.setEmpSet04True();
      }
      //  cobolCode::IF HSR-REQ-MXI-PLAN = '0201' OR '0218' OR '0231' OR '0392' OR '0597' OR '0601'
      //  LITERAL_0601 = '0601'
      if (compareChars(methodIn.getHsrReqRequest().getHsrReqMxiPlanString(), CONSTANTS.LITERAL_0201)
              == 0
          || compareChars(
                  methodIn.getHsrReqRequest().getHsrReqMxiPlanString(), CONSTANTS.LITERAL_0218)
              == 0
          || compareChars(
                  methodIn.getHsrReqRequest().getHsrReqMxiPlanString(), CONSTANTS.LITERAL_0231)
              == 0
          || compareChars(
                  methodIn.getHsrReqRequest().getHsrReqMxiPlanString(), CONSTANTS.LITERAL_0392)
              == 0
          || compareChars(
                  methodIn.getHsrReqRequest().getHsrReqMxiPlanString(), CONSTANTS.LITERAL_0597)
              == 0
          || compareChars(
                  methodIn.getHsrReqRequest().getHsrReqMxiPlanString(), CONSTANTS.LITERAL_0601)
              == 0) {
        //  cobolCode::SET EMP-SET-05 TO TRUE
        methodOut.setEmpSet05True();
      }
      //  cobolCode::IF HSR-REQ-MXI-PLAN = '0204' OR '0205' OR '0206' OR '0215' OR '0219' OR '0224'
      // OR '0225' OR '0226' OR '0227' OR '0234' OR '0235' OR '0236' OR '0250' OR '0251' OR '0256'
      // OR '0260' OR '0261' OR '0325' OR '0326' OR '0377' OR '0390' OR '0391' OR '0401' OR '0598'
      // OR '0600'
      //  LITERAL_0600 = '0600'
      if (compareChars(methodIn.getHsrReqRequest().getHsrReqMxiPlanString(), CONSTANTS.LITERAL_0204)
              == 0
          || compareChars(
                  methodIn.getHsrReqRequest().getHsrReqMxiPlanString(), CONSTANTS.LITERAL_0205)
              == 0
          || compareChars(
                  methodIn.getHsrReqRequest().getHsrReqMxiPlanString(), CONSTANTS.LITERAL_0206)
              == 0
          || compareChars(
                  methodIn.getHsrReqRequest().getHsrReqMxiPlanString(), CONSTANTS.LITERAL_0215)
              == 0
          || compareChars(
                  methodIn.getHsrReqRequest().getHsrReqMxiPlanString(), CONSTANTS.LITERAL_0219)
              == 0
          || compareChars(
                  methodIn.getHsrReqRequest().getHsrReqMxiPlanString(), CONSTANTS.LITERAL_0224)
              == 0
          || compareChars(
                  methodIn.getHsrReqRequest().getHsrReqMxiPlanString(), CONSTANTS.LITERAL_0225)
              == 0
          || compareChars(
                  methodIn.getHsrReqRequest().getHsrReqMxiPlanString(), CONSTANTS.LITERAL_0226)
              == 0
          || compareChars(
                  methodIn.getHsrReqRequest().getHsrReqMxiPlanString(), CONSTANTS.LITERAL_0227)
              == 0
          || compareChars(
                  methodIn.getHsrReqRequest().getHsrReqMxiPlanString(), CONSTANTS.LITERAL_0234)
              == 0
          || compareChars(
                  methodIn.getHsrReqRequest().getHsrReqMxiPlanString(), CONSTANTS.LITERAL_0235)
              == 0
          || compareChars(
                  methodIn.getHsrReqRequest().getHsrReqMxiPlanString(), CONSTANTS.LITERAL_0236)
              == 0
          || compareChars(
                  methodIn.getHsrReqRequest().getHsrReqMxiPlanString(), CONSTANTS.LITERAL_0250)
              == 0
          || compareChars(
                  methodIn.getHsrReqRequest().getHsrReqMxiPlanString(), CONSTANTS.LITERAL_0251)
              == 0
          || compareChars(
                  methodIn.getHsrReqRequest().getHsrReqMxiPlanString(), CONSTANTS.LITERAL_0256)
              == 0
          || compareChars(
                  methodIn.getHsrReqRequest().getHsrReqMxiPlanString(), CONSTANTS.LITERAL_0260)
              == 0
          || compareChars(
                  methodIn.getHsrReqRequest().getHsrReqMxiPlanString(), CONSTANTS.LITERAL_0261)
              == 0
          || compareChars(
                  methodIn.getHsrReqRequest().getHsrReqMxiPlanString(), CONSTANTS.LITERAL_0325)
              == 0
          || compareChars(
                  methodIn.getHsrReqRequest().getHsrReqMxiPlanString(), CONSTANTS.LITERAL_0326)
              == 0
          || compareChars(
                  methodIn.getHsrReqRequest().getHsrReqMxiPlanString(), CONSTANTS.LITERAL_0377)
              == 0
          || compareChars(
                  methodIn.getHsrReqRequest().getHsrReqMxiPlanString(), CONSTANTS.LITERAL_0390)
              == 0
          || compareChars(
                  methodIn.getHsrReqRequest().getHsrReqMxiPlanString(), CONSTANTS.LITERAL_0391)
              == 0
          || compareChars(
                  methodIn.getHsrReqRequest().getHsrReqMxiPlanString(), CONSTANTS.LITERAL_0401)
              == 0
          || compareChars(
                  methodIn.getHsrReqRequest().getHsrReqMxiPlanString(), CONSTANTS.LITERAL_0598)
              == 0
          || compareChars(
                  methodIn.getHsrReqRequest().getHsrReqMxiPlanString(), CONSTANTS.LITERAL_0600)
              == 0) {
        //  cobolCode::SET EMP-SET-06 TO TRUE
        methodOut.setEmpSet06True();
      }
      //  cobolCode::IF HSR-REQ-MXI-PLAN = '0207' OR '0237' OR '0396'
      //  LITERAL_0396 = '0396'
      if (compareChars(methodIn.getHsrReqRequest().getHsrReqMxiPlanString(), CONSTANTS.LITERAL_0207)
              == 0
          || compareChars(
                  methodIn.getHsrReqRequest().getHsrReqMxiPlanString(), CONSTANTS.LITERAL_0237)
              == 0
          || compareChars(
                  methodIn.getHsrReqRequest().getHsrReqMxiPlanString(), CONSTANTS.LITERAL_0396)
              == 0) {
        //  cobolCode::SET EMP-SET-07 TO TRUE
        methodOut.setEmpSet07True();
      }
      //  cobolCode::IF HSR-REQ-MXI-PLAN = '0202' OR '0232' OR '0259' OR '0393'
      //  LITERAL_0393 = '0393'
      if (compareChars(methodIn.getHsrReqRequest().getHsrReqMxiPlanString(), CONSTANTS.LITERAL_0202)
              == 0
          || compareChars(
                  methodIn.getHsrReqRequest().getHsrReqMxiPlanString(), CONSTANTS.LITERAL_0232)
              == 0
          || compareChars(
                  methodIn.getHsrReqRequest().getHsrReqMxiPlanString(), CONSTANTS.LITERAL_0259)
              == 0
          || compareChars(
                  methodIn.getHsrReqRequest().getHsrReqMxiPlanString(), CONSTANTS.LITERAL_0393)
              == 0) {
        //  cobolCode::SET EMP-SET-08 TO TRUE
        methodOut.setEmpSet08True();
      }
      //  cobolCode::IF HSR-REQ-MXI-PLAN = '0208' OR '0238' OR '0413'
      //  LITERAL_0413 = '0413'
      if (compareChars(methodIn.getHsrReqRequest().getHsrReqMxiPlanString(), CONSTANTS.LITERAL_0208)
              == 0
          || compareChars(
                  methodIn.getHsrReqRequest().getHsrReqMxiPlanString(), CONSTANTS.LITERAL_0238)
              == 0
          || compareChars(
                  methodIn.getHsrReqRequest().getHsrReqMxiPlanString(), CONSTANTS.LITERAL_0413)
              == 0) {
        //  cobolCode::SET EMP-SET-09 TO TRUE
        methodOut.setEmpSet09True();
      }
      //  cobolCode::IF HSR-REQ-MXI-PLAN = '0212' OR '0214' OR '0216' OR '0222' OR '0228' OR '0242'
      // OR '0244' OR '0245' OR '0248'
      //  LITERAL_0248 = '0248'
      if (compareChars(methodIn.getHsrReqRequest().getHsrReqMxiPlanString(), CONSTANTS.LITERAL_0212)
              == 0
          || compareChars(
                  methodIn.getHsrReqRequest().getHsrReqMxiPlanString(), CONSTANTS.LITERAL_0214)
              == 0
          || compareChars(
                  methodIn.getHsrReqRequest().getHsrReqMxiPlanString(), CONSTANTS.LITERAL_0216)
              == 0
          || compareChars(
                  methodIn.getHsrReqRequest().getHsrReqMxiPlanString(), CONSTANTS.LITERAL_0222)
              == 0
          || compareChars(
                  methodIn.getHsrReqRequest().getHsrReqMxiPlanString(), CONSTANTS.LITERAL_0228)
              == 0
          || compareChars(
                  methodIn.getHsrReqRequest().getHsrReqMxiPlanString(), CONSTANTS.LITERAL_0242)
              == 0
          || compareChars(
                  methodIn.getHsrReqRequest().getHsrReqMxiPlanString(), CONSTANTS.LITERAL_0244)
              == 0
          || compareChars(
                  methodIn.getHsrReqRequest().getHsrReqMxiPlanString(), CONSTANTS.LITERAL_0245)
              == 0
          || compareChars(
                  methodIn.getHsrReqRequest().getHsrReqMxiPlanString(), CONSTANTS.LITERAL_0248)
              == 0) {
        //  cobolCode::SET EMP-SET-10 TO TRUE
        methodOut.setEmpSet10True();
      }
      //  cobolCode::IF HSR-REQ-MXI-PLAN = '0210' OR '0240' OR '0394'
      //  LITERAL_0394 = '0394'
      if (compareChars(methodIn.getHsrReqRequest().getHsrReqMxiPlanString(), CONSTANTS.LITERAL_0210)
              == 0
          || compareChars(
                  methodIn.getHsrReqRequest().getHsrReqMxiPlanString(), CONSTANTS.LITERAL_0240)
              == 0
          || compareChars(
                  methodIn.getHsrReqRequest().getHsrReqMxiPlanString(), CONSTANTS.LITERAL_0394)
              == 0) {
        //  cobolCode::SET EMP-SET-12 TO TRUE
        methodOut.setEmpSet12True();
      }
      //  cobolCode::IF HSR-REQ-MXI-PLAN = '0252' OR '0253' OR '0255' OR '0262' OR '0284' OR '0285'
      // OR '0286' OR '0287' OR '0288' OR '0289' OR '0290' OR '0291' OR '0292' OR '0293' OR '0294'
      // OR '0295' OR '0296' OR '0297' OR '0298' OR '0299' OR '0300' OR '0301' OR '0302' OR '0303'
      // OR '0304' OR '0305' OR '0306' OR '0327' OR '0328' OR '0339' OR '0340' OR '0341' OR '0342'
      // OR '0343' OR '0344' OR '0345' OR '0346' OR '0347' OR '0348' OR '0349' OR '0350' OR '0351'
      // OR '0352' OR '0353' OR '0399' OR '0400' OR '0550' OR '0551' OR '0552' OR '0553' OR '0554'
      // OR '0555' OR '0556' OR '0557' OR '0558' OR '0559' OR '0560' OR '0561' OR '0562' OR '0563'
      // OR '0564' OR '0565' OR '0566' OR '0567' OR '0568' OR '0569' OR '0570' OR '0571' OR '0572'
      // OR '0573' OR '0574' OR '0575' OR '0576' OR '0577' OR '0578' OR '0579' OR '0580' OR '0581'
      // OR '0582' OR '0583' OR '0584' OR '0585' OR '0586' OR '0587' OR '0588' OR '0590' OR '0591'
      // OR '0592' OR '0593' OR '0594'
      //  LITERAL_0594 = '0594'
      if (compareChars(methodIn.getHsrReqRequest().getHsrReqMxiPlanString(), CONSTANTS.LITERAL_0252)
              == 0
          || compareChars(
                  methodIn.getHsrReqRequest().getHsrReqMxiPlanString(), CONSTANTS.LITERAL_0253)
              == 0
          || compareChars(
                  methodIn.getHsrReqRequest().getHsrReqMxiPlanString(), CONSTANTS.LITERAL_0255)
              == 0
          || compareChars(
                  methodIn.getHsrReqRequest().getHsrReqMxiPlanString(), CONSTANTS.LITERAL_0262)
              == 0
          || compareChars(
                  methodIn.getHsrReqRequest().getHsrReqMxiPlanString(), CONSTANTS.LITERAL_0284)
              == 0
          || compareChars(
                  methodIn.getHsrReqRequest().getHsrReqMxiPlanString(), CONSTANTS.LITERAL_0285)
              == 0
          || compareChars(
                  methodIn.getHsrReqRequest().getHsrReqMxiPlanString(), CONSTANTS.LITERAL_0286)
              == 0
          || compareChars(
                  methodIn.getHsrReqRequest().getHsrReqMxiPlanString(), CONSTANTS.LITERAL_0287)
              == 0
          || compareChars(
                  methodIn.getHsrReqRequest().getHsrReqMxiPlanString(), CONSTANTS.LITERAL_0288)
              == 0
          || compareChars(
                  methodIn.getHsrReqRequest().getHsrReqMxiPlanString(), CONSTANTS.LITERAL_0289)
              == 0
          || compareChars(
                  methodIn.getHsrReqRequest().getHsrReqMxiPlanString(), CONSTANTS.LITERAL_0290)
              == 0
          || compareChars(
                  methodIn.getHsrReqRequest().getHsrReqMxiPlanString(), CONSTANTS.LITERAL_0291)
              == 0
          || compareChars(
                  methodIn.getHsrReqRequest().getHsrReqMxiPlanString(), CONSTANTS.LITERAL_0292)
              == 0
          || compareChars(
                  methodIn.getHsrReqRequest().getHsrReqMxiPlanString(), CONSTANTS.LITERAL_0293)
              == 0
          || compareChars(
                  methodIn.getHsrReqRequest().getHsrReqMxiPlanString(), CONSTANTS.LITERAL_0294)
              == 0
          || compareChars(
                  methodIn.getHsrReqRequest().getHsrReqMxiPlanString(), CONSTANTS.LITERAL_0295)
              == 0
          || compareChars(
                  methodIn.getHsrReqRequest().getHsrReqMxiPlanString(), CONSTANTS.LITERAL_0296)
              == 0
          || compareChars(
                  methodIn.getHsrReqRequest().getHsrReqMxiPlanString(), CONSTANTS.LITERAL_0297)
              == 0
          || compareChars(
                  methodIn.getHsrReqRequest().getHsrReqMxiPlanString(), CONSTANTS.LITERAL_0298)
              == 0
          || compareChars(
                  methodIn.getHsrReqRequest().getHsrReqMxiPlanString(), CONSTANTS.LITERAL_0299)
              == 0
          || compareChars(
                  methodIn.getHsrReqRequest().getHsrReqMxiPlanString(), CONSTANTS.LITERAL_0300)
              == 0
          || compareChars(
                  methodIn.getHsrReqRequest().getHsrReqMxiPlanString(), CONSTANTS.LITERAL_0301)
              == 0
          || compareChars(
                  methodIn.getHsrReqRequest().getHsrReqMxiPlanString(), CONSTANTS.LITERAL_0302)
              == 0
          || compareChars(
                  methodIn.getHsrReqRequest().getHsrReqMxiPlanString(), CONSTANTS.LITERAL_0303)
              == 0
          || compareChars(
                  methodIn.getHsrReqRequest().getHsrReqMxiPlanString(), CONSTANTS.LITERAL_0304)
              == 0
          || compareChars(
                  methodIn.getHsrReqRequest().getHsrReqMxiPlanString(), CONSTANTS.LITERAL_0305)
              == 0
          || compareChars(
                  methodIn.getHsrReqRequest().getHsrReqMxiPlanString(), CONSTANTS.LITERAL_0306)
              == 0
          || compareChars(
                  methodIn.getHsrReqRequest().getHsrReqMxiPlanString(), CONSTANTS.LITERAL_0327)
              == 0
          || compareChars(
                  methodIn.getHsrReqRequest().getHsrReqMxiPlanString(), CONSTANTS.LITERAL_0328)
              == 0
          || compareChars(
                  methodIn.getHsrReqRequest().getHsrReqMxiPlanString(), CONSTANTS.LITERAL_0339)
              == 0
          || compareChars(
                  methodIn.getHsrReqRequest().getHsrReqMxiPlanString(), CONSTANTS.LITERAL_0340)
              == 0
          || compareChars(
                  methodIn.getHsrReqRequest().getHsrReqMxiPlanString(), CONSTANTS.LITERAL_0341)
              == 0
          || compareChars(
                  methodIn.getHsrReqRequest().getHsrReqMxiPlanString(), CONSTANTS.LITERAL_0342)
              == 0
          || compareChars(
                  methodIn.getHsrReqRequest().getHsrReqMxiPlanString(), CONSTANTS.LITERAL_0343)
              == 0
          || compareChars(
                  methodIn.getHsrReqRequest().getHsrReqMxiPlanString(), CONSTANTS.LITERAL_0344)
              == 0
          || compareChars(
                  methodIn.getHsrReqRequest().getHsrReqMxiPlanString(), CONSTANTS.LITERAL_0345)
              == 0
          || compareChars(
                  methodIn.getHsrReqRequest().getHsrReqMxiPlanString(), CONSTANTS.LITERAL_0346)
              == 0
          || compareChars(
                  methodIn.getHsrReqRequest().getHsrReqMxiPlanString(), CONSTANTS.LITERAL_0347)
              == 0
          || compareChars(
                  methodIn.getHsrReqRequest().getHsrReqMxiPlanString(), CONSTANTS.LITERAL_0348)
              == 0
          || compareChars(
                  methodIn.getHsrReqRequest().getHsrReqMxiPlanString(), CONSTANTS.LITERAL_0349)
              == 0
          || compareChars(
                  methodIn.getHsrReqRequest().getHsrReqMxiPlanString(), CONSTANTS.LITERAL_0350)
              == 0
          || compareChars(
                  methodIn.getHsrReqRequest().getHsrReqMxiPlanString(), CONSTANTS.LITERAL_0351)
              == 0
          || compareChars(
                  methodIn.getHsrReqRequest().getHsrReqMxiPlanString(), CONSTANTS.LITERAL_0352)
              == 0
          || compareChars(
                  methodIn.getHsrReqRequest().getHsrReqMxiPlanString(), CONSTANTS.LITERAL_0353)
              == 0
          || compareChars(
                  methodIn.getHsrReqRequest().getHsrReqMxiPlanString(), CONSTANTS.LITERAL_0399)
              == 0
          || compareChars(
                  methodIn.getHsrReqRequest().getHsrReqMxiPlanString(), CONSTANTS.LITERAL_0400)
              == 0
          || compareChars(
                  methodIn.getHsrReqRequest().getHsrReqMxiPlanString(), CONSTANTS.LITERAL_0550)
              == 0
          || compareChars(
                  methodIn.getHsrReqRequest().getHsrReqMxiPlanString(), CONSTANTS.LITERAL_0551)
              == 0
          || compareChars(
                  methodIn.getHsrReqRequest().getHsrReqMxiPlanString(), CONSTANTS.LITERAL_0552)
              == 0
          || compareChars(
                  methodIn.getHsrReqRequest().getHsrReqMxiPlanString(), CONSTANTS.LITERAL_0553)
              == 0
          || compareChars(
                  methodIn.getHsrReqRequest().getHsrReqMxiPlanString(), CONSTANTS.LITERAL_0554)
              == 0
          || compareChars(
                  methodIn.getHsrReqRequest().getHsrReqMxiPlanString(), CONSTANTS.LITERAL_0555)
              == 0
          || compareChars(
                  methodIn.getHsrReqRequest().getHsrReqMxiPlanString(), CONSTANTS.LITERAL_0556)
              == 0
          || compareChars(
                  methodIn.getHsrReqRequest().getHsrReqMxiPlanString(), CONSTANTS.LITERAL_0557)
              == 0
          || compareChars(
                  methodIn.getHsrReqRequest().getHsrReqMxiPlanString(), CONSTANTS.LITERAL_0558)
              == 0
          || compareChars(
                  methodIn.getHsrReqRequest().getHsrReqMxiPlanString(), CONSTANTS.LITERAL_0559)
              == 0
          || compareChars(
                  methodIn.getHsrReqRequest().getHsrReqMxiPlanString(), CONSTANTS.LITERAL_0560)
              == 0
          || compareChars(
                  methodIn.getHsrReqRequest().getHsrReqMxiPlanString(), CONSTANTS.LITERAL_0561)
              == 0
          || compareChars(
                  methodIn.getHsrReqRequest().getHsrReqMxiPlanString(), CONSTANTS.LITERAL_0562)
              == 0
          || compareChars(
                  methodIn.getHsrReqRequest().getHsrReqMxiPlanString(), CONSTANTS.LITERAL_0563)
              == 0
          || compareChars(
                  methodIn.getHsrReqRequest().getHsrReqMxiPlanString(), CONSTANTS.LITERAL_0564)
              == 0
          || compareChars(
                  methodIn.getHsrReqRequest().getHsrReqMxiPlanString(), CONSTANTS.LITERAL_0565)
              == 0
          || compareChars(
                  methodIn.getHsrReqRequest().getHsrReqMxiPlanString(), CONSTANTS.LITERAL_0566)
              == 0
          || compareChars(
                  methodIn.getHsrReqRequest().getHsrReqMxiPlanString(), CONSTANTS.LITERAL_0567)
              == 0
          || compareChars(
                  methodIn.getHsrReqRequest().getHsrReqMxiPlanString(), CONSTANTS.LITERAL_0568)
              == 0
          || compareChars(
                  methodIn.getHsrReqRequest().getHsrReqMxiPlanString(), CONSTANTS.LITERAL_0569)
              == 0
          || compareChars(
                  methodIn.getHsrReqRequest().getHsrReqMxiPlanString(), CONSTANTS.LITERAL_0570)
              == 0
          || compareChars(
                  methodIn.getHsrReqRequest().getHsrReqMxiPlanString(), CONSTANTS.LITERAL_0571)
              == 0
          || compareChars(
                  methodIn.getHsrReqRequest().getHsrReqMxiPlanString(), CONSTANTS.LITERAL_0572)
              == 0
          || compareChars(
                  methodIn.getHsrReqRequest().getHsrReqMxiPlanString(), CONSTANTS.LITERAL_0573)
              == 0
          || compareChars(
                  methodIn.getHsrReqRequest().getHsrReqMxiPlanString(), CONSTANTS.LITERAL_0574)
              == 0
          || compareChars(
                  methodIn.getHsrReqRequest().getHsrReqMxiPlanString(), CONSTANTS.LITERAL_0575)
              == 0
          || compareChars(
                  methodIn.getHsrReqRequest().getHsrReqMxiPlanString(), CONSTANTS.LITERAL_0576)
              == 0
          || compareChars(
                  methodIn.getHsrReqRequest().getHsrReqMxiPlanString(), CONSTANTS.LITERAL_0577)
              == 0
          || compareChars(
                  methodIn.getHsrReqRequest().getHsrReqMxiPlanString(), CONSTANTS.LITERAL_0578)
              == 0
          || compareChars(
                  methodIn.getHsrReqRequest().getHsrReqMxiPlanString(), CONSTANTS.LITERAL_0579)
              == 0
          || compareChars(
                  methodIn.getHsrReqRequest().getHsrReqMxiPlanString(), CONSTANTS.LITERAL_0580)
              == 0
          || compareChars(
                  methodIn.getHsrReqRequest().getHsrReqMxiPlanString(), CONSTANTS.LITERAL_0581)
              == 0
          || compareChars(
                  methodIn.getHsrReqRequest().getHsrReqMxiPlanString(), CONSTANTS.LITERAL_0582)
              == 0
          || compareChars(
                  methodIn.getHsrReqRequest().getHsrReqMxiPlanString(), CONSTANTS.LITERAL_0583)
              == 0
          || compareChars(
                  methodIn.getHsrReqRequest().getHsrReqMxiPlanString(), CONSTANTS.LITERAL_0584)
              == 0
          || compareChars(
                  methodIn.getHsrReqRequest().getHsrReqMxiPlanString(), CONSTANTS.LITERAL_0585)
              == 0
          || compareChars(
                  methodIn.getHsrReqRequest().getHsrReqMxiPlanString(), CONSTANTS.LITERAL_0586)
              == 0
          || compareChars(
                  methodIn.getHsrReqRequest().getHsrReqMxiPlanString(), CONSTANTS.LITERAL_0587)
              == 0
          || compareChars(
                  methodIn.getHsrReqRequest().getHsrReqMxiPlanString(), CONSTANTS.LITERAL_0588)
              == 0
          || compareChars(
                  methodIn.getHsrReqRequest().getHsrReqMxiPlanString(), CONSTANTS.LITERAL_0590)
              == 0
          || compareChars(
                  methodIn.getHsrReqRequest().getHsrReqMxiPlanString(), CONSTANTS.LITERAL_0591)
              == 0
          || compareChars(
                  methodIn.getHsrReqRequest().getHsrReqMxiPlanString(), CONSTANTS.LITERAL_0592)
              == 0
          || compareChars(
                  methodIn.getHsrReqRequest().getHsrReqMxiPlanString(), CONSTANTS.LITERAL_0593)
              == 0
          || compareChars(
                  methodIn.getHsrReqRequest().getHsrReqMxiPlanString(), CONSTANTS.LITERAL_0594)
              == 0) {
        //  cobolCode::SET EMP-SET-13 TO TRUE
        methodOut.setEmpSet13True();
      }
      //  cobolCode::IF HSR-REQ-MXI-PLAN = '0264' OR '0267' OR '0270' OR '0273' OR '0276' OR '0279'
      // OR '0282' OR '0329' OR '0331' OR '0333' OR '0335' OR '0337' OR '0411' OR '0605'
      //  LITERAL_0605 = '0605'
      if (compareChars(methodIn.getHsrReqRequest().getHsrReqMxiPlanString(), CONSTANTS.LITERAL_0264)
              == 0
          || compareChars(
                  methodIn.getHsrReqRequest().getHsrReqMxiPlanString(), CONSTANTS.LITERAL_0267)
              == 0
          || compareChars(
                  methodIn.getHsrReqRequest().getHsrReqMxiPlanString(), CONSTANTS.LITERAL_0270)
              == 0
          || compareChars(
                  methodIn.getHsrReqRequest().getHsrReqMxiPlanString(), CONSTANTS.LITERAL_0273)
              == 0
          || compareChars(
                  methodIn.getHsrReqRequest().getHsrReqMxiPlanString(), CONSTANTS.LITERAL_0276)
              == 0
          || compareChars(
                  methodIn.getHsrReqRequest().getHsrReqMxiPlanString(), CONSTANTS.LITERAL_0279)
              == 0
          || compareChars(
                  methodIn.getHsrReqRequest().getHsrReqMxiPlanString(), CONSTANTS.LITERAL_0282)
              == 0
          || compareChars(
                  methodIn.getHsrReqRequest().getHsrReqMxiPlanString(), CONSTANTS.LITERAL_0329)
              == 0
          || compareChars(
                  methodIn.getHsrReqRequest().getHsrReqMxiPlanString(), CONSTANTS.LITERAL_0331)
              == 0
          || compareChars(
                  methodIn.getHsrReqRequest().getHsrReqMxiPlanString(), CONSTANTS.LITERAL_0333)
              == 0
          || compareChars(
                  methodIn.getHsrReqRequest().getHsrReqMxiPlanString(), CONSTANTS.LITERAL_0335)
              == 0
          || compareChars(
                  methodIn.getHsrReqRequest().getHsrReqMxiPlanString(), CONSTANTS.LITERAL_0337)
              == 0
          || compareChars(
                  methodIn.getHsrReqRequest().getHsrReqMxiPlanString(), CONSTANTS.LITERAL_0411)
              == 0
          || compareChars(
                  methodIn.getHsrReqRequest().getHsrReqMxiPlanString(), CONSTANTS.LITERAL_0605)
              == 0) {
        //  cobolCode::SET EMP-SET-14 TO TRUE
        methodOut.setEmpSet14True();
      }
      //  cobolCode::IF HSR-REQ-MXI-PLAN = '0211' OR '0213' OR '0241' OR '0243'
      //  LITERAL_0243 = '0243'
      if (compareChars(methodIn.getHsrReqRequest().getHsrReqMxiPlanString(), CONSTANTS.LITERAL_0211)
              == 0
          || compareChars(
                  methodIn.getHsrReqRequest().getHsrReqMxiPlanString(), CONSTANTS.LITERAL_0213)
              == 0
          || compareChars(
                  methodIn.getHsrReqRequest().getHsrReqMxiPlanString(), CONSTANTS.LITERAL_0241)
              == 0
          || compareChars(
                  methodIn.getHsrReqRequest().getHsrReqMxiPlanString(), CONSTANTS.LITERAL_0243)
              == 0) {
        //  cobolCode::SET EMP-SET-15 TO TRUE
        methodOut.setEmpSet15True();
      }
      //  cobolCode::IF HSR-REQ-MXI-PLAN = '0221' OR '0229' OR '0247' OR '0254' OR '0357' OR '0358'
      // OR '0359' OR '0360' OR '0404'
      //  LITERAL_0404 = '0404'
      if (compareChars(methodIn.getHsrReqRequest().getHsrReqMxiPlanString(), CONSTANTS.LITERAL_0221)
              == 0
          || compareChars(
                  methodIn.getHsrReqRequest().getHsrReqMxiPlanString(), CONSTANTS.LITERAL_0229)
              == 0
          || compareChars(
                  methodIn.getHsrReqRequest().getHsrReqMxiPlanString(), CONSTANTS.LITERAL_0247)
              == 0
          || compareChars(
                  methodIn.getHsrReqRequest().getHsrReqMxiPlanString(), CONSTANTS.LITERAL_0254)
              == 0
          || compareChars(
                  methodIn.getHsrReqRequest().getHsrReqMxiPlanString(), CONSTANTS.LITERAL_0357)
              == 0
          || compareChars(
                  methodIn.getHsrReqRequest().getHsrReqMxiPlanString(), CONSTANTS.LITERAL_0358)
              == 0
          || compareChars(
                  methodIn.getHsrReqRequest().getHsrReqMxiPlanString(), CONSTANTS.LITERAL_0359)
              == 0
          || compareChars(
                  methodIn.getHsrReqRequest().getHsrReqMxiPlanString(), CONSTANTS.LITERAL_0360)
              == 0
          || compareChars(
                  methodIn.getHsrReqRequest().getHsrReqMxiPlanString(), CONSTANTS.LITERAL_0404)
              == 0) {
        //  cobolCode::SET EMP-SET-16 TO TRUE
        methodOut.setEmpSet16True();
      }
      //  cobolCode::IF HSR-REQ-MXI-PLAN = '0223' OR '0249' OR '0410'
      //  LITERAL_0410 = '0410'
      if (compareChars(methodIn.getHsrReqRequest().getHsrReqMxiPlanString(), CONSTANTS.LITERAL_0223)
              == 0
          || compareChars(
                  methodIn.getHsrReqRequest().getHsrReqMxiPlanString(), CONSTANTS.LITERAL_0249)
              == 0
          || compareChars(
                  methodIn.getHsrReqRequest().getHsrReqMxiPlanString(), CONSTANTS.LITERAL_0410)
              == 0) {
        //  cobolCode::SET EMP-SET-17 TO TRUE
        methodOut.setEmpSet17True();
      }
      //  cobolCode::IF HSR-REQ-MXI-PLAN = '0307' OR '0313' OR '0315' OR '0316' OR '0322' OR '0408'
      // OR '0604'
      //  LITERAL_0604 = '0604'
      if (compareChars(methodIn.getHsrReqRequest().getHsrReqMxiPlanString(), CONSTANTS.LITERAL_0307)
              == 0
          || compareChars(
                  methodIn.getHsrReqRequest().getHsrReqMxiPlanString(), CONSTANTS.LITERAL_0313)
              == 0
          || compareChars(
                  methodIn.getHsrReqRequest().getHsrReqMxiPlanString(), CONSTANTS.LITERAL_0315)
              == 0
          || compareChars(
                  methodIn.getHsrReqRequest().getHsrReqMxiPlanString(), CONSTANTS.LITERAL_0316)
              == 0
          || compareChars(
                  methodIn.getHsrReqRequest().getHsrReqMxiPlanString(), CONSTANTS.LITERAL_0322)
              == 0
          || compareChars(
                  methodIn.getHsrReqRequest().getHsrReqMxiPlanString(), CONSTANTS.LITERAL_0408)
              == 0
          || compareChars(
                  methodIn.getHsrReqRequest().getHsrReqMxiPlanString(), CONSTANTS.LITERAL_0604)
              == 0) {
        //  cobolCode::SET EMP-SET-18 TO TRUE
        methodOut.setEmpSet18True();
      }
      //  cobolCode::IF HSR-REQ-MXI-PLAN = '0310' OR '0311' OR '0312' OR '0314' OR '0319' OR '0320'
      // OR '0321' OR '0406'
      //  LITERAL_0406 = '0406'
      if (compareChars(methodIn.getHsrReqRequest().getHsrReqMxiPlanString(), CONSTANTS.LITERAL_0310)
              == 0
          || compareChars(
                  methodIn.getHsrReqRequest().getHsrReqMxiPlanString(), CONSTANTS.LITERAL_0311)
              == 0
          || compareChars(
                  methodIn.getHsrReqRequest().getHsrReqMxiPlanString(), CONSTANTS.LITERAL_0312)
              == 0
          || compareChars(
                  methodIn.getHsrReqRequest().getHsrReqMxiPlanString(), CONSTANTS.LITERAL_0314)
              == 0
          || compareChars(
                  methodIn.getHsrReqRequest().getHsrReqMxiPlanString(), CONSTANTS.LITERAL_0319)
              == 0
          || compareChars(
                  methodIn.getHsrReqRequest().getHsrReqMxiPlanString(), CONSTANTS.LITERAL_0320)
              == 0
          || compareChars(
                  methodIn.getHsrReqRequest().getHsrReqMxiPlanString(), CONSTANTS.LITERAL_0321)
              == 0
          || compareChars(
                  methodIn.getHsrReqRequest().getHsrReqMxiPlanString(), CONSTANTS.LITERAL_0406)
              == 0) {
        //  cobolCode::SET EMP-SET-19 TO TRUE
        methodOut.setEmpSet19True();
      }
      //  cobolCode::IF HSR-REQ-MXI-PLAN = '0308' OR '0317' OR '0395'
      //  LITERAL_0395 = '0395'
      if (compareChars(methodIn.getHsrReqRequest().getHsrReqMxiPlanString(), CONSTANTS.LITERAL_0308)
              == 0
          || compareChars(
                  methodIn.getHsrReqRequest().getHsrReqMxiPlanString(), CONSTANTS.LITERAL_0317)
              == 0
          || compareChars(
                  methodIn.getHsrReqRequest().getHsrReqMxiPlanString(), CONSTANTS.LITERAL_0395)
              == 0) {
        //  cobolCode::SET EMP-SET-20 TO TRUE
        methodOut.setEmpSet20True();
      }
      //  cobolCode::IF HSR-REQ-MXI-PLAN = '0309' OR '0318'
      //  LITERAL_0318 = '0318'
      if (compareChars(methodIn.getHsrReqRequest().getHsrReqMxiPlanString(), CONSTANTS.LITERAL_0309)
              == 0
          || compareChars(
                  methodIn.getHsrReqRequest().getHsrReqMxiPlanString(), CONSTANTS.LITERAL_0318)
              == 0) {
        //  cobolCode::SET EMP-SET-21 TO TRUE
        methodOut.setEmpSet21True();
      }
      //  cobolCode::IF HSR-REQ-MXI-PLAN = '0323' OR '0324' OR '0405' OR '0709'
      //  LITERAL_0709 = '0709'
      if (compareChars(methodIn.getHsrReqRequest().getHsrReqMxiPlanString(), CONSTANTS.LITERAL_0323)
              == 0
          || compareChars(
                  methodIn.getHsrReqRequest().getHsrReqMxiPlanString(), CONSTANTS.LITERAL_0324)
              == 0
          || compareChars(
                  methodIn.getHsrReqRequest().getHsrReqMxiPlanString(), CONSTANTS.LITERAL_0405)
              == 0
          || compareChars(
                  methodIn.getHsrReqRequest().getHsrReqMxiPlanString(), CONSTANTS.LITERAL_0709)
              == 0) {
        //  cobolCode::SET EMP-SET-22 TO TRUE
        methodOut.setEmpSet22True();
      }
      //  cobolCode::IF HSR-REQ-MXI-PLAN = '1200' OR '1217' OR '1230' OR '1246' OR '1257'
      //  LITERAL_1257 = '1257'
      if (compareChars(methodIn.getHsrReqRequest().getHsrReqMxiPlanString(), CONSTANTS.LITERAL_1200)
              == 0
          || compareChars(
                  methodIn.getHsrReqRequest().getHsrReqMxiPlanString(), CONSTANTS.LITERAL_1217)
              == 0
          || compareChars(
                  methodIn.getHsrReqRequest().getHsrReqMxiPlanString(), CONSTANTS.LITERAL_1230)
              == 0
          || compareChars(
                  methodIn.getHsrReqRequest().getHsrReqMxiPlanString(), CONSTANTS.LITERAL_1246)
              == 0
          || compareChars(
                  methodIn.getHsrReqRequest().getHsrReqMxiPlanString(), CONSTANTS.LITERAL_1257)
              == 0) {
        //  cobolCode::SET EMP-SET-23 TO TRUE
        methodOut.setEmpSet23True();
      }
      //  cobolCode::IF HSR-REQ-MXI-PLAN = '1209' OR '1239'
      //  LITERAL_1239 = '1239'
      if (compareChars(methodIn.getHsrReqRequest().getHsrReqMxiPlanString(), CONSTANTS.LITERAL_1209)
              == 0
          || compareChars(
                  methodIn.getHsrReqRequest().getHsrReqMxiPlanString(), CONSTANTS.LITERAL_1239)
              == 0) {
        //  cobolCode::SET EMP-SET-27 TO TRUE
        methodOut.setEmpSet27True();
      }
      //  cobolCode::IF HSR-REQ-MXI-PLAN = '1203' OR '1220' OR '1233' OR '1258'
      //  LITERAL_1258 = '1258'
      if (compareChars(methodIn.getHsrReqRequest().getHsrReqMxiPlanString(), CONSTANTS.LITERAL_1203)
              == 0
          || compareChars(
                  methodIn.getHsrReqRequest().getHsrReqMxiPlanString(), CONSTANTS.LITERAL_1220)
              == 0
          || compareChars(
                  methodIn.getHsrReqRequest().getHsrReqMxiPlanString(), CONSTANTS.LITERAL_1233)
              == 0
          || compareChars(
                  methodIn.getHsrReqRequest().getHsrReqMxiPlanString(), CONSTANTS.LITERAL_1258)
              == 0) {
        //  cobolCode::SET EMP-SET-28 TO TRUE
        methodOut.setEmpSet28True();
      }
      //  cobolCode::IF HSR-REQ-MXI-PLAN = '1201' OR '1218' OR '1231' OR '1597'
      //  LITERAL_1597 = '1597'
      if (compareChars(methodIn.getHsrReqRequest().getHsrReqMxiPlanString(), CONSTANTS.LITERAL_1201)
              == 0
          || compareChars(
                  methodIn.getHsrReqRequest().getHsrReqMxiPlanString(), CONSTANTS.LITERAL_1218)
              == 0
          || compareChars(
                  methodIn.getHsrReqRequest().getHsrReqMxiPlanString(), CONSTANTS.LITERAL_1231)
              == 0
          || compareChars(
                  methodIn.getHsrReqRequest().getHsrReqMxiPlanString(), CONSTANTS.LITERAL_1597)
              == 0) {
        //  cobolCode::SET EMP-SET-29 TO TRUE
        methodOut.setEmpSet29True();
      }
      //  cobolCode::IF HSR-REQ-MXI-PLAN = '1204' OR '1205' OR '1206' OR '1215' OR '1219' OR '1224'
      // OR '1225' OR '1226' OR '1227' OR '1234' OR '1235' OR '1236' OR '1250' OR '1251' OR '1256'
      // OR '1260' OR '1261' OR '1325' OR '1326' OR '1377' OR '1598'
      //  LITERAL_1598 = '1598'
      if (compareChars(methodIn.getHsrReqRequest().getHsrReqMxiPlanString(), CONSTANTS.LITERAL_1204)
              == 0
          || compareChars(
                  methodIn.getHsrReqRequest().getHsrReqMxiPlanString(), CONSTANTS.LITERAL_1205)
              == 0
          || compareChars(
                  methodIn.getHsrReqRequest().getHsrReqMxiPlanString(), CONSTANTS.LITERAL_1206)
              == 0
          || compareChars(
                  methodIn.getHsrReqRequest().getHsrReqMxiPlanString(), CONSTANTS.LITERAL_1215)
              == 0
          || compareChars(
                  methodIn.getHsrReqRequest().getHsrReqMxiPlanString(), CONSTANTS.LITERAL_1219)
              == 0
          || compareChars(
                  methodIn.getHsrReqRequest().getHsrReqMxiPlanString(), CONSTANTS.LITERAL_1224)
              == 0
          || compareChars(
                  methodIn.getHsrReqRequest().getHsrReqMxiPlanString(), CONSTANTS.LITERAL_1225)
              == 0
          || compareChars(
                  methodIn.getHsrReqRequest().getHsrReqMxiPlanString(), CONSTANTS.LITERAL_1226)
              == 0
          || compareChars(
                  methodIn.getHsrReqRequest().getHsrReqMxiPlanString(), CONSTANTS.LITERAL_1227)
              == 0
          || compareChars(
                  methodIn.getHsrReqRequest().getHsrReqMxiPlanString(), CONSTANTS.LITERAL_1234)
              == 0
          || compareChars(
                  methodIn.getHsrReqRequest().getHsrReqMxiPlanString(), CONSTANTS.LITERAL_1235)
              == 0
          || compareChars(
                  methodIn.getHsrReqRequest().getHsrReqMxiPlanString(), CONSTANTS.LITERAL_1236)
              == 0
          || compareChars(
                  methodIn.getHsrReqRequest().getHsrReqMxiPlanString(), CONSTANTS.LITERAL_1250)
              == 0
          || compareChars(
                  methodIn.getHsrReqRequest().getHsrReqMxiPlanString(), CONSTANTS.LITERAL_1251)
              == 0
          || compareChars(
                  methodIn.getHsrReqRequest().getHsrReqMxiPlanString(), CONSTANTS.LITERAL_1256)
              == 0
          || compareChars(
                  methodIn.getHsrReqRequest().getHsrReqMxiPlanString(), CONSTANTS.LITERAL_1260)
              == 0
          || compareChars(
                  methodIn.getHsrReqRequest().getHsrReqMxiPlanString(), CONSTANTS.LITERAL_1261)
              == 0
          || compareChars(
                  methodIn.getHsrReqRequest().getHsrReqMxiPlanString(), CONSTANTS.LITERAL_1325)
              == 0
          || compareChars(
                  methodIn.getHsrReqRequest().getHsrReqMxiPlanString(), CONSTANTS.LITERAL_1326)
              == 0
          || compareChars(
                  methodIn.getHsrReqRequest().getHsrReqMxiPlanString(), CONSTANTS.LITERAL_1377)
              == 0
          || compareChars(
                  methodIn.getHsrReqRequest().getHsrReqMxiPlanString(), CONSTANTS.LITERAL_1598)
              == 0) {
        //  cobolCode::SET EMP-SET-30 TO TRUE
        methodOut.setEmpSet30True();
      }
      //  cobolCode::IF HSR-REQ-MXI-PLAN = '1207' OR '1237'
      //  LITERAL_1237 = '1237'
      if (compareChars(methodIn.getHsrReqRequest().getHsrReqMxiPlanString(), CONSTANTS.LITERAL_1207)
              == 0
          || compareChars(
                  methodIn.getHsrReqRequest().getHsrReqMxiPlanString(), CONSTANTS.LITERAL_1237)
              == 0) {
        //  cobolCode::SET EMP-SET-31 TO TRUE
        methodOut.setEmpSet31True();
      }
      //  cobolCode::IF HSR-REQ-MXI-PLAN = '1202' OR '1232' OR '1259'
      //  LITERAL_1259 = '1259'
      if (compareChars(methodIn.getHsrReqRequest().getHsrReqMxiPlanString(), CONSTANTS.LITERAL_1202)
              == 0
          || compareChars(
                  methodIn.getHsrReqRequest().getHsrReqMxiPlanString(), CONSTANTS.LITERAL_1232)
              == 0
          || compareChars(
                  methodIn.getHsrReqRequest().getHsrReqMxiPlanString(), CONSTANTS.LITERAL_1259)
              == 0) {
        //  cobolCode::SET EMP-SET-32 TO TRUE
        methodOut.setEmpSet32True();
      }
      //  cobolCode::IF HSR-REQ-MXI-PLAN = '1208' OR '1238'
      //  LITERAL_1238 = '1238'
      if (compareChars(methodIn.getHsrReqRequest().getHsrReqMxiPlanString(), CONSTANTS.LITERAL_1208)
              == 0
          || compareChars(
                  methodIn.getHsrReqRequest().getHsrReqMxiPlanString(), CONSTANTS.LITERAL_1238)
              == 0) {
        //  cobolCode::SET EMP-SET-33 TO TRUE
        methodOut.setEmpSet33True();
      }
      //  cobolCode::IF HSR-REQ-MXI-PLAN = '1212' OR '1214' OR '1216' OR '1222' OR '1228' OR '1242'
      // OR '1244' OR '1245' OR '1248'
      //  LITERAL_1248 = '1248'
      if (compareChars(methodIn.getHsrReqRequest().getHsrReqMxiPlanString(), CONSTANTS.LITERAL_1212)
              == 0
          || compareChars(
                  methodIn.getHsrReqRequest().getHsrReqMxiPlanString(), CONSTANTS.LITERAL_1214)
              == 0
          || compareChars(
                  methodIn.getHsrReqRequest().getHsrReqMxiPlanString(), CONSTANTS.LITERAL_1216)
              == 0
          || compareChars(
                  methodIn.getHsrReqRequest().getHsrReqMxiPlanString(), CONSTANTS.LITERAL_1222)
              == 0
          || compareChars(
                  methodIn.getHsrReqRequest().getHsrReqMxiPlanString(), CONSTANTS.LITERAL_1228)
              == 0
          || compareChars(
                  methodIn.getHsrReqRequest().getHsrReqMxiPlanString(), CONSTANTS.LITERAL_1242)
              == 0
          || compareChars(
                  methodIn.getHsrReqRequest().getHsrReqMxiPlanString(), CONSTANTS.LITERAL_1244)
              == 0
          || compareChars(
                  methodIn.getHsrReqRequest().getHsrReqMxiPlanString(), CONSTANTS.LITERAL_1245)
              == 0
          || compareChars(
                  methodIn.getHsrReqRequest().getHsrReqMxiPlanString(), CONSTANTS.LITERAL_1248)
              == 0) {
        //  cobolCode::SET EMP-SET-34 TO TRUE
        methodOut.setEmpSet34True();
      }
      //  cobolCode::IF HSR-REQ-MXI-PLAN = '1210' OR '1240'
      //  LITERAL_1240 = '1240'
      if (compareChars(methodIn.getHsrReqRequest().getHsrReqMxiPlanString(), CONSTANTS.LITERAL_1210)
              == 0
          || compareChars(
                  methodIn.getHsrReqRequest().getHsrReqMxiPlanString(), CONSTANTS.LITERAL_1240)
              == 0) {
        //  cobolCode::SET EMP-SET-35 TO TRUE
        methodOut.setEmpSet35True();
      }
      //  cobolCode::IF HSR-REQ-MXI-PLAN = '1252' OR '1253' OR '1255' OR '1262' OR '1284' OR '1285'
      // OR '1286' OR '1287' OR '1288' OR '1289' OR '1290' OR '1291' OR '1292' OR '1293' OR '1294'
      // OR '1295' OR '1296' OR '1297' OR '1298' OR '1299' OR '1300' OR '1301' OR '1302' OR '1303'
      // OR '1304' OR '1305' OR '1306' OR '1327' OR '1328' OR '1339' OR '1340' OR '1341' OR '1342'
      // OR '1343' OR '1344' OR '1345' OR '1346' OR '1347' OR '1348' OR '1349' OR '1350' OR '1351'
      // OR '1352' OR '1353' OR '1550' OR '1551' OR '1552' OR '1553' OR '1554' OR '1555' OR '1556'
      // OR '1557' OR '1558' OR '1559' OR '1560' OR '1561' OR '1562' OR '1563' OR '1564' OR '1565'
      // OR '1566' OR '1567' OR '1568' OR '1569' OR '1570' OR '1571' OR '1572' OR '1573' OR '1574'
      // OR '1575' OR '1576' OR '1577' OR '1578' OR '1579' OR '1580' OR '1581' OR '1582' OR '1583'
      // OR '1584' OR '1585' OR '1586' OR '1587' OR '1588' OR '1590' OR '1591' OR '1592'
      //  LITERAL_1592 = '1592'
      if (compareChars(methodIn.getHsrReqRequest().getHsrReqMxiPlanString(), CONSTANTS.LITERAL_1252)
              == 0
          || compareChars(
                  methodIn.getHsrReqRequest().getHsrReqMxiPlanString(), CONSTANTS.LITERAL_1253)
              == 0
          || compareChars(
                  methodIn.getHsrReqRequest().getHsrReqMxiPlanString(), CONSTANTS.LITERAL_1255)
              == 0
          || compareChars(
                  methodIn.getHsrReqRequest().getHsrReqMxiPlanString(), CONSTANTS.LITERAL_1262)
              == 0
          || compareChars(
                  methodIn.getHsrReqRequest().getHsrReqMxiPlanString(), CONSTANTS.LITERAL_1284)
              == 0
          || compareChars(
                  methodIn.getHsrReqRequest().getHsrReqMxiPlanString(), CONSTANTS.LITERAL_1285)
              == 0
          || compareChars(
                  methodIn.getHsrReqRequest().getHsrReqMxiPlanString(), CONSTANTS.LITERAL_1286)
              == 0
          || compareChars(
                  methodIn.getHsrReqRequest().getHsrReqMxiPlanString(), CONSTANTS.LITERAL_1287)
              == 0
          || compareChars(
                  methodIn.getHsrReqRequest().getHsrReqMxiPlanString(), CONSTANTS.LITERAL_1288)
              == 0
          || compareChars(
                  methodIn.getHsrReqRequest().getHsrReqMxiPlanString(), CONSTANTS.LITERAL_1289)
              == 0
          || compareChars(
                  methodIn.getHsrReqRequest().getHsrReqMxiPlanString(), CONSTANTS.LITERAL_1290)
              == 0
          || compareChars(
                  methodIn.getHsrReqRequest().getHsrReqMxiPlanString(), CONSTANTS.LITERAL_1291)
              == 0
          || compareChars(
                  methodIn.getHsrReqRequest().getHsrReqMxiPlanString(), CONSTANTS.LITERAL_1292)
              == 0
          || compareChars(
                  methodIn.getHsrReqRequest().getHsrReqMxiPlanString(), CONSTANTS.LITERAL_1293)
              == 0
          || compareChars(
                  methodIn.getHsrReqRequest().getHsrReqMxiPlanString(), CONSTANTS.LITERAL_1294)
              == 0
          || compareChars(
                  methodIn.getHsrReqRequest().getHsrReqMxiPlanString(), CONSTANTS.LITERAL_1295)
              == 0
          || compareChars(
                  methodIn.getHsrReqRequest().getHsrReqMxiPlanString(), CONSTANTS.LITERAL_1296)
              == 0
          || compareChars(
                  methodIn.getHsrReqRequest().getHsrReqMxiPlanString(), CONSTANTS.LITERAL_1297)
              == 0
          || compareChars(
                  methodIn.getHsrReqRequest().getHsrReqMxiPlanString(), CONSTANTS.LITERAL_1298)
              == 0
          || compareChars(
                  methodIn.getHsrReqRequest().getHsrReqMxiPlanString(), CONSTANTS.LITERAL_1299)
              == 0
          || compareChars(
                  methodIn.getHsrReqRequest().getHsrReqMxiPlanString(), CONSTANTS.LITERAL_1300)
              == 0
          || compareChars(
                  methodIn.getHsrReqRequest().getHsrReqMxiPlanString(), CONSTANTS.LITERAL_1301)
              == 0
          || compareChars(
                  methodIn.getHsrReqRequest().getHsrReqMxiPlanString(), CONSTANTS.LITERAL_1302)
              == 0
          || compareChars(
                  methodIn.getHsrReqRequest().getHsrReqMxiPlanString(), CONSTANTS.LITERAL_1303)
              == 0
          || compareChars(
                  methodIn.getHsrReqRequest().getHsrReqMxiPlanString(), CONSTANTS.LITERAL_1304)
              == 0
          || compareChars(
                  methodIn.getHsrReqRequest().getHsrReqMxiPlanString(), CONSTANTS.LITERAL_1305)
              == 0
          || compareChars(
                  methodIn.getHsrReqRequest().getHsrReqMxiPlanString(), CONSTANTS.LITERAL_1306)
              == 0
          || compareChars(
                  methodIn.getHsrReqRequest().getHsrReqMxiPlanString(), CONSTANTS.LITERAL_1327)
              == 0
          || compareChars(
                  methodIn.getHsrReqRequest().getHsrReqMxiPlanString(), CONSTANTS.LITERAL_1328)
              == 0
          || compareChars(
                  methodIn.getHsrReqRequest().getHsrReqMxiPlanString(), CONSTANTS.LITERAL_1339)
              == 0
          || compareChars(
                  methodIn.getHsrReqRequest().getHsrReqMxiPlanString(), CONSTANTS.LITERAL_1340)
              == 0
          || compareChars(
                  methodIn.getHsrReqRequest().getHsrReqMxiPlanString(), CONSTANTS.LITERAL_1341)
              == 0
          || compareChars(
                  methodIn.getHsrReqRequest().getHsrReqMxiPlanString(), CONSTANTS.LITERAL_1342)
              == 0
          || compareChars(
                  methodIn.getHsrReqRequest().getHsrReqMxiPlanString(), CONSTANTS.LITERAL_1343)
              == 0
          || compareChars(
                  methodIn.getHsrReqRequest().getHsrReqMxiPlanString(), CONSTANTS.LITERAL_1344)
              == 0
          || compareChars(
                  methodIn.getHsrReqRequest().getHsrReqMxiPlanString(), CONSTANTS.LITERAL_1345)
              == 0
          || compareChars(
                  methodIn.getHsrReqRequest().getHsrReqMxiPlanString(), CONSTANTS.LITERAL_1346)
              == 0
          || compareChars(
                  methodIn.getHsrReqRequest().getHsrReqMxiPlanString(), CONSTANTS.LITERAL_1347)
              == 0
          || compareChars(
                  methodIn.getHsrReqRequest().getHsrReqMxiPlanString(), CONSTANTS.LITERAL_1348)
              == 0
          || compareChars(
                  methodIn.getHsrReqRequest().getHsrReqMxiPlanString(), CONSTANTS.LITERAL_1349)
              == 0
          || compareChars(
                  methodIn.getHsrReqRequest().getHsrReqMxiPlanString(), CONSTANTS.LITERAL_1350)
              == 0
          || compareChars(
                  methodIn.getHsrReqRequest().getHsrReqMxiPlanString(), CONSTANTS.LITERAL_1351)
              == 0
          || compareChars(
                  methodIn.getHsrReqRequest().getHsrReqMxiPlanString(), CONSTANTS.LITERAL_1352)
              == 0
          || compareChars(
                  methodIn.getHsrReqRequest().getHsrReqMxiPlanString(), CONSTANTS.LITERAL_1353)
              == 0
          || compareChars(
                  methodIn.getHsrReqRequest().getHsrReqMxiPlanString(), CONSTANTS.LITERAL_1550)
              == 0
          || compareChars(
                  methodIn.getHsrReqRequest().getHsrReqMxiPlanString(), CONSTANTS.LITERAL_1551)
              == 0
          || compareChars(
                  methodIn.getHsrReqRequest().getHsrReqMxiPlanString(), CONSTANTS.LITERAL_1552)
              == 0
          || compareChars(
                  methodIn.getHsrReqRequest().getHsrReqMxiPlanString(), CONSTANTS.LITERAL_1553)
              == 0
          || compareChars(
                  methodIn.getHsrReqRequest().getHsrReqMxiPlanString(), CONSTANTS.LITERAL_1554)
              == 0
          || compareChars(
                  methodIn.getHsrReqRequest().getHsrReqMxiPlanString(), CONSTANTS.LITERAL_1555)
              == 0
          || compareChars(
                  methodIn.getHsrReqRequest().getHsrReqMxiPlanString(), CONSTANTS.LITERAL_1556)
              == 0
          || compareChars(
                  methodIn.getHsrReqRequest().getHsrReqMxiPlanString(), CONSTANTS.LITERAL_1557)
              == 0
          || compareChars(
                  methodIn.getHsrReqRequest().getHsrReqMxiPlanString(), CONSTANTS.LITERAL_1558)
              == 0
          || compareChars(
                  methodIn.getHsrReqRequest().getHsrReqMxiPlanString(), CONSTANTS.LITERAL_1559)
              == 0
          || compareChars(
                  methodIn.getHsrReqRequest().getHsrReqMxiPlanString(), CONSTANTS.LITERAL_1560)
              == 0
          || compareChars(
                  methodIn.getHsrReqRequest().getHsrReqMxiPlanString(), CONSTANTS.LITERAL_1561)
              == 0
          || compareChars(
                  methodIn.getHsrReqRequest().getHsrReqMxiPlanString(), CONSTANTS.LITERAL_1562)
              == 0
          || compareChars(
                  methodIn.getHsrReqRequest().getHsrReqMxiPlanString(), CONSTANTS.LITERAL_1563)
              == 0
          || compareChars(
                  methodIn.getHsrReqRequest().getHsrReqMxiPlanString(), CONSTANTS.LITERAL_1564)
              == 0
          || compareChars(
                  methodIn.getHsrReqRequest().getHsrReqMxiPlanString(), CONSTANTS.LITERAL_1565)
              == 0
          || compareChars(
                  methodIn.getHsrReqRequest().getHsrReqMxiPlanString(), CONSTANTS.LITERAL_1566)
              == 0
          || compareChars(
                  methodIn.getHsrReqRequest().getHsrReqMxiPlanString(), CONSTANTS.LITERAL_1567)
              == 0
          || compareChars(
                  methodIn.getHsrReqRequest().getHsrReqMxiPlanString(), CONSTANTS.LITERAL_1568)
              == 0
          || compareChars(
                  methodIn.getHsrReqRequest().getHsrReqMxiPlanString(), CONSTANTS.LITERAL_1569)
              == 0
          || compareChars(
                  methodIn.getHsrReqRequest().getHsrReqMxiPlanString(), CONSTANTS.LITERAL_1570)
              == 0
          || compareChars(
                  methodIn.getHsrReqRequest().getHsrReqMxiPlanString(), CONSTANTS.LITERAL_1571)
              == 0
          || compareChars(
                  methodIn.getHsrReqRequest().getHsrReqMxiPlanString(), CONSTANTS.LITERAL_1572)
              == 0
          || compareChars(
                  methodIn.getHsrReqRequest().getHsrReqMxiPlanString(), CONSTANTS.LITERAL_1573)
              == 0
          || compareChars(
                  methodIn.getHsrReqRequest().getHsrReqMxiPlanString(), CONSTANTS.LITERAL_1574)
              == 0
          || compareChars(
                  methodIn.getHsrReqRequest().getHsrReqMxiPlanString(), CONSTANTS.LITERAL_1575)
              == 0
          || compareChars(
                  methodIn.getHsrReqRequest().getHsrReqMxiPlanString(), CONSTANTS.LITERAL_1576)
              == 0
          || compareChars(
                  methodIn.getHsrReqRequest().getHsrReqMxiPlanString(), CONSTANTS.LITERAL_1577)
              == 0
          || compareChars(
                  methodIn.getHsrReqRequest().getHsrReqMxiPlanString(), CONSTANTS.LITERAL_1578)
              == 0
          || compareChars(
                  methodIn.getHsrReqRequest().getHsrReqMxiPlanString(), CONSTANTS.LITERAL_1579)
              == 0
          || compareChars(
                  methodIn.getHsrReqRequest().getHsrReqMxiPlanString(), CONSTANTS.LITERAL_1580)
              == 0
          || compareChars(
                  methodIn.getHsrReqRequest().getHsrReqMxiPlanString(), CONSTANTS.LITERAL_1581)
              == 0
          || compareChars(
                  methodIn.getHsrReqRequest().getHsrReqMxiPlanString(), CONSTANTS.LITERAL_1582)
              == 0
          || compareChars(
                  methodIn.getHsrReqRequest().getHsrReqMxiPlanString(), CONSTANTS.LITERAL_1583)
              == 0
          || compareChars(
                  methodIn.getHsrReqRequest().getHsrReqMxiPlanString(), CONSTANTS.LITERAL_1584)
              == 0
          || compareChars(
                  methodIn.getHsrReqRequest().getHsrReqMxiPlanString(), CONSTANTS.LITERAL_1585)
              == 0
          || compareChars(
                  methodIn.getHsrReqRequest().getHsrReqMxiPlanString(), CONSTANTS.LITERAL_1586)
              == 0
          || compareChars(
                  methodIn.getHsrReqRequest().getHsrReqMxiPlanString(), CONSTANTS.LITERAL_1587)
              == 0
          || compareChars(
                  methodIn.getHsrReqRequest().getHsrReqMxiPlanString(), CONSTANTS.LITERAL_1588)
              == 0
          || compareChars(
                  methodIn.getHsrReqRequest().getHsrReqMxiPlanString(), CONSTANTS.LITERAL_1590)
              == 0
          || compareChars(
                  methodIn.getHsrReqRequest().getHsrReqMxiPlanString(), CONSTANTS.LITERAL_1591)
              == 0
          || compareChars(
                  methodIn.getHsrReqRequest().getHsrReqMxiPlanString(), CONSTANTS.LITERAL_1592)
              == 0) {
        //  cobolCode::SET EMP-SET-36 TO TRUE
        methodOut.setEmpSet36True();
      }
      //  cobolCode::IF HSR-REQ-MXI-PLAN = '2252' OR '2253' OR '2255' OR '2262' OR '2284' OR '2285'
      // OR '2286' OR '2287' OR '2288' OR '2289' OR '2290' OR '2291' OR '2292' OR '2293' OR '2294'
      // OR '2295' OR '2296' OR '2297' OR '2298' OR '2299' OR '2300' OR '2301' OR '2302' OR '2303'
      // OR '2304' OR '2305' OR '2306' OR '2327' OR '2328' OR '2339' OR '2340' OR '2341' OR '2342'
      // OR '2343' OR '2344' OR '2345' OR '2346' OR '2347' OR '2348' OR '2349' OR '2350' OR '2351'
      // OR '2352' OR '2353' OR '2550' OR '2551' OR '2552' OR '2553' OR '2554' OR '2555' OR '2556'
      // OR '2557' OR '2558' OR '2559' OR '2560' OR '2561' OR '2562' OR '2563' OR '2564' OR '2565'
      // OR '2566' OR '2567' OR '2568' OR '2569' OR '2570' OR '2571' OR '2572' OR '2573' OR '2574'
      // OR '2575' OR '2576' OR '2577' OR '2578' OR '2579' OR '2580' OR '2581' OR '2582' OR '2583'
      // OR '2584' OR '2585' OR '2586' OR '2587' OR '2588' OR '2590' OR '2591' OR '2592'
      //  LITERAL_2592 = '2592'
      if (compareChars(methodIn.getHsrReqRequest().getHsrReqMxiPlanString(), CONSTANTS.LITERAL_2252)
              == 0
          || compareChars(
                  methodIn.getHsrReqRequest().getHsrReqMxiPlanString(), CONSTANTS.LITERAL_2253)
              == 0
          || compareChars(
                  methodIn.getHsrReqRequest().getHsrReqMxiPlanString(), CONSTANTS.LITERAL_2255)
              == 0
          || compareChars(
                  methodIn.getHsrReqRequest().getHsrReqMxiPlanString(), CONSTANTS.LITERAL_2262)
              == 0
          || compareChars(
                  methodIn.getHsrReqRequest().getHsrReqMxiPlanString(), CONSTANTS.LITERAL_2284)
              == 0
          || compareChars(
                  methodIn.getHsrReqRequest().getHsrReqMxiPlanString(), CONSTANTS.LITERAL_2285)
              == 0
          || compareChars(
                  methodIn.getHsrReqRequest().getHsrReqMxiPlanString(), CONSTANTS.LITERAL_2286)
              == 0
          || compareChars(
                  methodIn.getHsrReqRequest().getHsrReqMxiPlanString(), CONSTANTS.LITERAL_2287)
              == 0
          || compareChars(
                  methodIn.getHsrReqRequest().getHsrReqMxiPlanString(), CONSTANTS.LITERAL_2288)
              == 0
          || compareChars(
                  methodIn.getHsrReqRequest().getHsrReqMxiPlanString(), CONSTANTS.LITERAL_2289)
              == 0
          || compareChars(
                  methodIn.getHsrReqRequest().getHsrReqMxiPlanString(), CONSTANTS.LITERAL_2290)
              == 0
          || compareChars(
                  methodIn.getHsrReqRequest().getHsrReqMxiPlanString(), CONSTANTS.LITERAL_2291)
              == 0
          || compareChars(
                  methodIn.getHsrReqRequest().getHsrReqMxiPlanString(), CONSTANTS.LITERAL_2292)
              == 0
          || compareChars(
                  methodIn.getHsrReqRequest().getHsrReqMxiPlanString(), CONSTANTS.LITERAL_2293)
              == 0
          || compareChars(
                  methodIn.getHsrReqRequest().getHsrReqMxiPlanString(), CONSTANTS.LITERAL_2294)
              == 0
          || compareChars(
                  methodIn.getHsrReqRequest().getHsrReqMxiPlanString(), CONSTANTS.LITERAL_2295)
              == 0
          || compareChars(
                  methodIn.getHsrReqRequest().getHsrReqMxiPlanString(), CONSTANTS.LITERAL_2296)
              == 0
          || compareChars(
                  methodIn.getHsrReqRequest().getHsrReqMxiPlanString(), CONSTANTS.LITERAL_2297)
              == 0
          || compareChars(
                  methodIn.getHsrReqRequest().getHsrReqMxiPlanString(), CONSTANTS.LITERAL_2298)
              == 0
          || compareChars(
                  methodIn.getHsrReqRequest().getHsrReqMxiPlanString(), CONSTANTS.LITERAL_2299)
              == 0
          || compareChars(
                  methodIn.getHsrReqRequest().getHsrReqMxiPlanString(), CONSTANTS.LITERAL_2300)
              == 0
          || compareChars(
                  methodIn.getHsrReqRequest().getHsrReqMxiPlanString(), CONSTANTS.LITERAL_2301)
              == 0
          || compareChars(
                  methodIn.getHsrReqRequest().getHsrReqMxiPlanString(), CONSTANTS.LITERAL_2302)
              == 0
          || compareChars(
                  methodIn.getHsrReqRequest().getHsrReqMxiPlanString(), CONSTANTS.LITERAL_2303)
              == 0
          || compareChars(
                  methodIn.getHsrReqRequest().getHsrReqMxiPlanString(), CONSTANTS.LITERAL_2304)
              == 0
          || compareChars(
                  methodIn.getHsrReqRequest().getHsrReqMxiPlanString(), CONSTANTS.LITERAL_2305)
              == 0
          || compareChars(
                  methodIn.getHsrReqRequest().getHsrReqMxiPlanString(), CONSTANTS.LITERAL_2306)
              == 0
          || compareChars(
                  methodIn.getHsrReqRequest().getHsrReqMxiPlanString(), CONSTANTS.LITERAL_2327)
              == 0
          || compareChars(
                  methodIn.getHsrReqRequest().getHsrReqMxiPlanString(), CONSTANTS.LITERAL_2328)
              == 0
          || compareChars(
                  methodIn.getHsrReqRequest().getHsrReqMxiPlanString(), CONSTANTS.LITERAL_2339)
              == 0
          || compareChars(
                  methodIn.getHsrReqRequest().getHsrReqMxiPlanString(), CONSTANTS.LITERAL_2340)
              == 0
          || compareChars(
                  methodIn.getHsrReqRequest().getHsrReqMxiPlanString(), CONSTANTS.LITERAL_2341)
              == 0
          || compareChars(
                  methodIn.getHsrReqRequest().getHsrReqMxiPlanString(), CONSTANTS.LITERAL_2342)
              == 0
          || compareChars(
                  methodIn.getHsrReqRequest().getHsrReqMxiPlanString(), CONSTANTS.LITERAL_2343)
              == 0
          || compareChars(
                  methodIn.getHsrReqRequest().getHsrReqMxiPlanString(), CONSTANTS.LITERAL_2344)
              == 0
          || compareChars(
                  methodIn.getHsrReqRequest().getHsrReqMxiPlanString(), CONSTANTS.LITERAL_2345)
              == 0
          || compareChars(
                  methodIn.getHsrReqRequest().getHsrReqMxiPlanString(), CONSTANTS.LITERAL_2346)
              == 0
          || compareChars(
                  methodIn.getHsrReqRequest().getHsrReqMxiPlanString(), CONSTANTS.LITERAL_2347)
              == 0
          || compareChars(
                  methodIn.getHsrReqRequest().getHsrReqMxiPlanString(), CONSTANTS.LITERAL_2348)
              == 0
          || compareChars(
                  methodIn.getHsrReqRequest().getHsrReqMxiPlanString(), CONSTANTS.LITERAL_2349)
              == 0
          || compareChars(
                  methodIn.getHsrReqRequest().getHsrReqMxiPlanString(), CONSTANTS.LITERAL_2350)
              == 0
          || compareChars(
                  methodIn.getHsrReqRequest().getHsrReqMxiPlanString(), CONSTANTS.LITERAL_2351)
              == 0
          || compareChars(
                  methodIn.getHsrReqRequest().getHsrReqMxiPlanString(), CONSTANTS.LITERAL_2352)
              == 0
          || compareChars(
                  methodIn.getHsrReqRequest().getHsrReqMxiPlanString(), CONSTANTS.LITERAL_2353)
              == 0
          || compareChars(
                  methodIn.getHsrReqRequest().getHsrReqMxiPlanString(), CONSTANTS.LITERAL_2550)
              == 0
          || compareChars(
                  methodIn.getHsrReqRequest().getHsrReqMxiPlanString(), CONSTANTS.LITERAL_2551)
              == 0
          || compareChars(
                  methodIn.getHsrReqRequest().getHsrReqMxiPlanString(), CONSTANTS.LITERAL_2552)
              == 0
          || compareChars(
                  methodIn.getHsrReqRequest().getHsrReqMxiPlanString(), CONSTANTS.LITERAL_2553)
              == 0
          || compareChars(
                  methodIn.getHsrReqRequest().getHsrReqMxiPlanString(), CONSTANTS.LITERAL_2554)
              == 0
          || compareChars(
                  methodIn.getHsrReqRequest().getHsrReqMxiPlanString(), CONSTANTS.LITERAL_2555)
              == 0
          || compareChars(
                  methodIn.getHsrReqRequest().getHsrReqMxiPlanString(), CONSTANTS.LITERAL_2556)
              == 0
          || compareChars(
                  methodIn.getHsrReqRequest().getHsrReqMxiPlanString(), CONSTANTS.LITERAL_2557)
              == 0
          || compareChars(
                  methodIn.getHsrReqRequest().getHsrReqMxiPlanString(), CONSTANTS.LITERAL_2558)
              == 0
          || compareChars(
                  methodIn.getHsrReqRequest().getHsrReqMxiPlanString(), CONSTANTS.LITERAL_2559)
              == 0
          || compareChars(
                  methodIn.getHsrReqRequest().getHsrReqMxiPlanString(), CONSTANTS.LITERAL_2560)
              == 0
          || compareChars(
                  methodIn.getHsrReqRequest().getHsrReqMxiPlanString(), CONSTANTS.LITERAL_2561)
              == 0
          || compareChars(
                  methodIn.getHsrReqRequest().getHsrReqMxiPlanString(), CONSTANTS.LITERAL_2562)
              == 0
          || compareChars(
                  methodIn.getHsrReqRequest().getHsrReqMxiPlanString(), CONSTANTS.LITERAL_2563)
              == 0
          || compareChars(
                  methodIn.getHsrReqRequest().getHsrReqMxiPlanString(), CONSTANTS.LITERAL_2564)
              == 0
          || compareChars(
                  methodIn.getHsrReqRequest().getHsrReqMxiPlanString(), CONSTANTS.LITERAL_2565)
              == 0
          || compareChars(
                  methodIn.getHsrReqRequest().getHsrReqMxiPlanString(), CONSTANTS.LITERAL_2566)
              == 0
          || compareChars(
                  methodIn.getHsrReqRequest().getHsrReqMxiPlanString(), CONSTANTS.LITERAL_2567)
              == 0
          || compareChars(
                  methodIn.getHsrReqRequest().getHsrReqMxiPlanString(), CONSTANTS.LITERAL_2568)
              == 0
          || compareChars(
                  methodIn.getHsrReqRequest().getHsrReqMxiPlanString(), CONSTANTS.LITERAL_2569)
              == 0
          || compareChars(
                  methodIn.getHsrReqRequest().getHsrReqMxiPlanString(), CONSTANTS.LITERAL_2570)
              == 0
          || compareChars(
                  methodIn.getHsrReqRequest().getHsrReqMxiPlanString(), CONSTANTS.LITERAL_2571)
              == 0
          || compareChars(
                  methodIn.getHsrReqRequest().getHsrReqMxiPlanString(), CONSTANTS.LITERAL_2572)
              == 0
          || compareChars(
                  methodIn.getHsrReqRequest().getHsrReqMxiPlanString(), CONSTANTS.LITERAL_2573)
              == 0
          || compareChars(
                  methodIn.getHsrReqRequest().getHsrReqMxiPlanString(), CONSTANTS.LITERAL_2574)
              == 0
          || compareChars(
                  methodIn.getHsrReqRequest().getHsrReqMxiPlanString(), CONSTANTS.LITERAL_2575)
              == 0
          || compareChars(
                  methodIn.getHsrReqRequest().getHsrReqMxiPlanString(), CONSTANTS.LITERAL_2576)
              == 0
          || compareChars(
                  methodIn.getHsrReqRequest().getHsrReqMxiPlanString(), CONSTANTS.LITERAL_2577)
              == 0
          || compareChars(
                  methodIn.getHsrReqRequest().getHsrReqMxiPlanString(), CONSTANTS.LITERAL_2578)
              == 0
          || compareChars(
                  methodIn.getHsrReqRequest().getHsrReqMxiPlanString(), CONSTANTS.LITERAL_2579)
              == 0
          || compareChars(
                  methodIn.getHsrReqRequest().getHsrReqMxiPlanString(), CONSTANTS.LITERAL_2580)
              == 0
          || compareChars(
                  methodIn.getHsrReqRequest().getHsrReqMxiPlanString(), CONSTANTS.LITERAL_2581)
              == 0
          || compareChars(
                  methodIn.getHsrReqRequest().getHsrReqMxiPlanString(), CONSTANTS.LITERAL_2582)
              == 0
          || compareChars(
                  methodIn.getHsrReqRequest().getHsrReqMxiPlanString(), CONSTANTS.LITERAL_2583)
              == 0
          || compareChars(
                  methodIn.getHsrReqRequest().getHsrReqMxiPlanString(), CONSTANTS.LITERAL_2584)
              == 0
          || compareChars(
                  methodIn.getHsrReqRequest().getHsrReqMxiPlanString(), CONSTANTS.LITERAL_2585)
              == 0
          || compareChars(
                  methodIn.getHsrReqRequest().getHsrReqMxiPlanString(), CONSTANTS.LITERAL_2586)
              == 0
          || compareChars(
                  methodIn.getHsrReqRequest().getHsrReqMxiPlanString(), CONSTANTS.LITERAL_2587)
              == 0
          || compareChars(
                  methodIn.getHsrReqRequest().getHsrReqMxiPlanString(), CONSTANTS.LITERAL_2588)
              == 0
          || compareChars(
                  methodIn.getHsrReqRequest().getHsrReqMxiPlanString(), CONSTANTS.LITERAL_2590)
              == 0
          || compareChars(
                  methodIn.getHsrReqRequest().getHsrReqMxiPlanString(), CONSTANTS.LITERAL_2591)
              == 0
          || compareChars(
                  methodIn.getHsrReqRequest().getHsrReqMxiPlanString(), CONSTANTS.LITERAL_2592)
              == 0) {
        //  cobolCode::SET EMP-SET-37 TO TRUE
        methodOut.setEmpSet37True();
      }
      //  cobolCode::IF HSR-REQ-MXI-PLAN = '3252' OR '3253' OR '3255' OR '3262' OR '3284' OR '3285'
      // OR '3286' OR '3287' OR '3288' OR '3289' OR '3290' OR '3291' OR '3292' OR '3293' OR '3294'
      // OR '3295' OR '3296' OR '3297' OR '3298' OR '3299' OR '3300' OR '3301' OR '3302' OR '3303'
      // OR '3304' OR '3305' OR '3306' OR '3327' OR '3328' OR '3339' OR '3340' OR '3341' OR '3342'
      // OR '3343' OR '3344' OR '3345' OR '3346' OR '3347' OR '3348' OR '3349' OR '3350' OR '3351'
      // OR '3352' OR '3353' OR '3550' OR '3551' OR '3552' OR '3553' OR '3554' OR '3555' OR '3556'
      // OR '3557' OR '3558' OR '3559' OR '3560' OR '3561' OR '3562' OR '3563' OR '3564' OR '3565'
      // OR '3566' OR '3567' OR '3568' OR '3569' OR '3570' OR '3571' OR '3572' OR '3573' OR '3574'
      // OR '3575' OR '3576' OR '3577' OR '3578' OR '3579' OR '3580' OR '3581' OR '3582' OR '3583'
      // OR '3584' OR '3585' OR '3586' OR '3587' OR '3588' OR '3590' OR '3591' OR '3592'
      //  LITERAL_3592 = '3592'
      if (compareChars(methodIn.getHsrReqRequest().getHsrReqMxiPlanString(), CONSTANTS.LITERAL_3252)
              == 0
          || compareChars(
                  methodIn.getHsrReqRequest().getHsrReqMxiPlanString(), CONSTANTS.LITERAL_3253)
              == 0
          || compareChars(
                  methodIn.getHsrReqRequest().getHsrReqMxiPlanString(), CONSTANTS.LITERAL_3255)
              == 0
          || compareChars(
                  methodIn.getHsrReqRequest().getHsrReqMxiPlanString(), CONSTANTS.LITERAL_3262)
              == 0
          || compareChars(
                  methodIn.getHsrReqRequest().getHsrReqMxiPlanString(), CONSTANTS.LITERAL_3284)
              == 0
          || compareChars(
                  methodIn.getHsrReqRequest().getHsrReqMxiPlanString(), CONSTANTS.LITERAL_3285)
              == 0
          || compareChars(
                  methodIn.getHsrReqRequest().getHsrReqMxiPlanString(), CONSTANTS.LITERAL_3286)
              == 0
          || compareChars(
                  methodIn.getHsrReqRequest().getHsrReqMxiPlanString(), CONSTANTS.LITERAL_3287)
              == 0
          || compareChars(
                  methodIn.getHsrReqRequest().getHsrReqMxiPlanString(), CONSTANTS.LITERAL_3288)
              == 0
          || compareChars(
                  methodIn.getHsrReqRequest().getHsrReqMxiPlanString(), CONSTANTS.LITERAL_3289)
              == 0
          || compareChars(
                  methodIn.getHsrReqRequest().getHsrReqMxiPlanString(), CONSTANTS.LITERAL_3290)
              == 0
          || compareChars(
                  methodIn.getHsrReqRequest().getHsrReqMxiPlanString(), CONSTANTS.LITERAL_3291)
              == 0
          || compareChars(
                  methodIn.getHsrReqRequest().getHsrReqMxiPlanString(), CONSTANTS.LITERAL_3292)
              == 0
          || compareChars(
                  methodIn.getHsrReqRequest().getHsrReqMxiPlanString(), CONSTANTS.LITERAL_3293)
              == 0
          || compareChars(
                  methodIn.getHsrReqRequest().getHsrReqMxiPlanString(), CONSTANTS.LITERAL_3294)
              == 0
          || compareChars(
                  methodIn.getHsrReqRequest().getHsrReqMxiPlanString(), CONSTANTS.LITERAL_3295)
              == 0
          || compareChars(
                  methodIn.getHsrReqRequest().getHsrReqMxiPlanString(), CONSTANTS.LITERAL_3296)
              == 0
          || compareChars(
                  methodIn.getHsrReqRequest().getHsrReqMxiPlanString(), CONSTANTS.LITERAL_3297)
              == 0
          || compareChars(
                  methodIn.getHsrReqRequest().getHsrReqMxiPlanString(), CONSTANTS.LITERAL_3298)
              == 0
          || compareChars(
                  methodIn.getHsrReqRequest().getHsrReqMxiPlanString(), CONSTANTS.LITERAL_3299)
              == 0
          || compareChars(
                  methodIn.getHsrReqRequest().getHsrReqMxiPlanString(), CONSTANTS.LITERAL_3300)
              == 0
          || compareChars(
                  methodIn.getHsrReqRequest().getHsrReqMxiPlanString(), CONSTANTS.LITERAL_3301)
              == 0
          || compareChars(
                  methodIn.getHsrReqRequest().getHsrReqMxiPlanString(), CONSTANTS.LITERAL_3302)
              == 0
          || compareChars(
                  methodIn.getHsrReqRequest().getHsrReqMxiPlanString(), CONSTANTS.LITERAL_3303)
              == 0
          || compareChars(
                  methodIn.getHsrReqRequest().getHsrReqMxiPlanString(), CONSTANTS.LITERAL_3304)
              == 0
          || compareChars(
                  methodIn.getHsrReqRequest().getHsrReqMxiPlanString(), CONSTANTS.LITERAL_3305)
              == 0
          || compareChars(
                  methodIn.getHsrReqRequest().getHsrReqMxiPlanString(), CONSTANTS.LITERAL_3306)
              == 0
          || compareChars(
                  methodIn.getHsrReqRequest().getHsrReqMxiPlanString(), CONSTANTS.LITERAL_3327)
              == 0
          || compareChars(
                  methodIn.getHsrReqRequest().getHsrReqMxiPlanString(), CONSTANTS.LITERAL_3328)
              == 0
          || compareChars(
                  methodIn.getHsrReqRequest().getHsrReqMxiPlanString(), CONSTANTS.LITERAL_3339)
              == 0
          || compareChars(
                  methodIn.getHsrReqRequest().getHsrReqMxiPlanString(), CONSTANTS.LITERAL_3340)
              == 0
          || compareChars(
                  methodIn.getHsrReqRequest().getHsrReqMxiPlanString(), CONSTANTS.LITERAL_3341)
              == 0
          || compareChars(
                  methodIn.getHsrReqRequest().getHsrReqMxiPlanString(), CONSTANTS.LITERAL_3342)
              == 0
          || compareChars(
                  methodIn.getHsrReqRequest().getHsrReqMxiPlanString(), CONSTANTS.LITERAL_3343)
              == 0
          || compareChars(
                  methodIn.getHsrReqRequest().getHsrReqMxiPlanString(), CONSTANTS.LITERAL_3344)
              == 0
          || compareChars(
                  methodIn.getHsrReqRequest().getHsrReqMxiPlanString(), CONSTANTS.LITERAL_3345)
              == 0
          || compareChars(
                  methodIn.getHsrReqRequest().getHsrReqMxiPlanString(), CONSTANTS.LITERAL_3346)
              == 0
          || compareChars(
                  methodIn.getHsrReqRequest().getHsrReqMxiPlanString(), CONSTANTS.LITERAL_3347)
              == 0
          || compareChars(
                  methodIn.getHsrReqRequest().getHsrReqMxiPlanString(), CONSTANTS.LITERAL_3348)
              == 0
          || compareChars(
                  methodIn.getHsrReqRequest().getHsrReqMxiPlanString(), CONSTANTS.LITERAL_3349)
              == 0
          || compareChars(
                  methodIn.getHsrReqRequest().getHsrReqMxiPlanString(), CONSTANTS.LITERAL_3350)
              == 0
          || compareChars(
                  methodIn.getHsrReqRequest().getHsrReqMxiPlanString(), CONSTANTS.LITERAL_3351)
              == 0
          || compareChars(
                  methodIn.getHsrReqRequest().getHsrReqMxiPlanString(), CONSTANTS.LITERAL_3352)
              == 0
          || compareChars(
                  methodIn.getHsrReqRequest().getHsrReqMxiPlanString(), CONSTANTS.LITERAL_3353)
              == 0
          || compareChars(
                  methodIn.getHsrReqRequest().getHsrReqMxiPlanString(), CONSTANTS.LITERAL_3550)
              == 0
          || compareChars(
                  methodIn.getHsrReqRequest().getHsrReqMxiPlanString(), CONSTANTS.LITERAL_3551)
              == 0
          || compareChars(
                  methodIn.getHsrReqRequest().getHsrReqMxiPlanString(), CONSTANTS.LITERAL_3552)
              == 0
          || compareChars(
                  methodIn.getHsrReqRequest().getHsrReqMxiPlanString(), CONSTANTS.LITERAL_3553)
              == 0
          || compareChars(
                  methodIn.getHsrReqRequest().getHsrReqMxiPlanString(), CONSTANTS.LITERAL_3554)
              == 0
          || compareChars(
                  methodIn.getHsrReqRequest().getHsrReqMxiPlanString(), CONSTANTS.LITERAL_3555)
              == 0
          || compareChars(
                  methodIn.getHsrReqRequest().getHsrReqMxiPlanString(), CONSTANTS.LITERAL_3556)
              == 0
          || compareChars(
                  methodIn.getHsrReqRequest().getHsrReqMxiPlanString(), CONSTANTS.LITERAL_3557)
              == 0
          || compareChars(
                  methodIn.getHsrReqRequest().getHsrReqMxiPlanString(), CONSTANTS.LITERAL_3558)
              == 0
          || compareChars(
                  methodIn.getHsrReqRequest().getHsrReqMxiPlanString(), CONSTANTS.LITERAL_3559)
              == 0
          || compareChars(
                  methodIn.getHsrReqRequest().getHsrReqMxiPlanString(), CONSTANTS.LITERAL_3560)
              == 0
          || compareChars(
                  methodIn.getHsrReqRequest().getHsrReqMxiPlanString(), CONSTANTS.LITERAL_3561)
              == 0
          || compareChars(
                  methodIn.getHsrReqRequest().getHsrReqMxiPlanString(), CONSTANTS.LITERAL_3562)
              == 0
          || compareChars(
                  methodIn.getHsrReqRequest().getHsrReqMxiPlanString(), CONSTANTS.LITERAL_3563)
              == 0
          || compareChars(
                  methodIn.getHsrReqRequest().getHsrReqMxiPlanString(), CONSTANTS.LITERAL_3564)
              == 0
          || compareChars(
                  methodIn.getHsrReqRequest().getHsrReqMxiPlanString(), CONSTANTS.LITERAL_3565)
              == 0
          || compareChars(
                  methodIn.getHsrReqRequest().getHsrReqMxiPlanString(), CONSTANTS.LITERAL_3566)
              == 0
          || compareChars(
                  methodIn.getHsrReqRequest().getHsrReqMxiPlanString(), CONSTANTS.LITERAL_3567)
              == 0
          || compareChars(
                  methodIn.getHsrReqRequest().getHsrReqMxiPlanString(), CONSTANTS.LITERAL_3568)
              == 0
          || compareChars(
                  methodIn.getHsrReqRequest().getHsrReqMxiPlanString(), CONSTANTS.LITERAL_3569)
              == 0
          || compareChars(
                  methodIn.getHsrReqRequest().getHsrReqMxiPlanString(), CONSTANTS.LITERAL_3570)
              == 0
          || compareChars(
                  methodIn.getHsrReqRequest().getHsrReqMxiPlanString(), CONSTANTS.LITERAL_3571)
              == 0
          || compareChars(
                  methodIn.getHsrReqRequest().getHsrReqMxiPlanString(), CONSTANTS.LITERAL_3572)
              == 0
          || compareChars(
                  methodIn.getHsrReqRequest().getHsrReqMxiPlanString(), CONSTANTS.LITERAL_3573)
              == 0
          || compareChars(
                  methodIn.getHsrReqRequest().getHsrReqMxiPlanString(), CONSTANTS.LITERAL_3574)
              == 0
          || compareChars(
                  methodIn.getHsrReqRequest().getHsrReqMxiPlanString(), CONSTANTS.LITERAL_3575)
              == 0
          || compareChars(
                  methodIn.getHsrReqRequest().getHsrReqMxiPlanString(), CONSTANTS.LITERAL_3576)
              == 0
          || compareChars(
                  methodIn.getHsrReqRequest().getHsrReqMxiPlanString(), CONSTANTS.LITERAL_3577)
              == 0
          || compareChars(
                  methodIn.getHsrReqRequest().getHsrReqMxiPlanString(), CONSTANTS.LITERAL_3578)
              == 0
          || compareChars(
                  methodIn.getHsrReqRequest().getHsrReqMxiPlanString(), CONSTANTS.LITERAL_3579)
              == 0
          || compareChars(
                  methodIn.getHsrReqRequest().getHsrReqMxiPlanString(), CONSTANTS.LITERAL_3580)
              == 0
          || compareChars(
                  methodIn.getHsrReqRequest().getHsrReqMxiPlanString(), CONSTANTS.LITERAL_3581)
              == 0
          || compareChars(
                  methodIn.getHsrReqRequest().getHsrReqMxiPlanString(), CONSTANTS.LITERAL_3582)
              == 0
          || compareChars(
                  methodIn.getHsrReqRequest().getHsrReqMxiPlanString(), CONSTANTS.LITERAL_3583)
              == 0
          || compareChars(
                  methodIn.getHsrReqRequest().getHsrReqMxiPlanString(), CONSTANTS.LITERAL_3584)
              == 0
          || compareChars(
                  methodIn.getHsrReqRequest().getHsrReqMxiPlanString(), CONSTANTS.LITERAL_3585)
              == 0
          || compareChars(
                  methodIn.getHsrReqRequest().getHsrReqMxiPlanString(), CONSTANTS.LITERAL_3586)
              == 0
          || compareChars(
                  methodIn.getHsrReqRequest().getHsrReqMxiPlanString(), CONSTANTS.LITERAL_3587)
              == 0
          || compareChars(
                  methodIn.getHsrReqRequest().getHsrReqMxiPlanString(), CONSTANTS.LITERAL_3588)
              == 0
          || compareChars(
                  methodIn.getHsrReqRequest().getHsrReqMxiPlanString(), CONSTANTS.LITERAL_3590)
              == 0
          || compareChars(
                  methodIn.getHsrReqRequest().getHsrReqMxiPlanString(), CONSTANTS.LITERAL_3591)
              == 0
          || compareChars(
                  methodIn.getHsrReqRequest().getHsrReqMxiPlanString(), CONSTANTS.LITERAL_3592)
              == 0) {
        //  cobolCode::SET EMP-SET-38 TO TRUE
        methodOut.setEmpSet38True();
      }
      //  cobolCode::IF HSR-REQ-MXI-PLAN = '1264' OR '1267' OR '1270' OR '1273' OR '1276' OR '1279'
      // OR '1282' OR '1329' OR '1331' OR '1333' OR '1335' OR '1337' OR '1605'
      //  LITERAL_1605 = '1605'
      if (compareChars(methodIn.getHsrReqRequest().getHsrReqMxiPlanString(), CONSTANTS.LITERAL_1264)
              == 0
          || compareChars(
                  methodIn.getHsrReqRequest().getHsrReqMxiPlanString(), CONSTANTS.LITERAL_1267)
              == 0
          || compareChars(
                  methodIn.getHsrReqRequest().getHsrReqMxiPlanString(), CONSTANTS.LITERAL_1270)
              == 0
          || compareChars(
                  methodIn.getHsrReqRequest().getHsrReqMxiPlanString(), CONSTANTS.LITERAL_1273)
              == 0
          || compareChars(
                  methodIn.getHsrReqRequest().getHsrReqMxiPlanString(), CONSTANTS.LITERAL_1276)
              == 0
          || compareChars(
                  methodIn.getHsrReqRequest().getHsrReqMxiPlanString(), CONSTANTS.LITERAL_1279)
              == 0
          || compareChars(
                  methodIn.getHsrReqRequest().getHsrReqMxiPlanString(), CONSTANTS.LITERAL_1282)
              == 0
          || compareChars(
                  methodIn.getHsrReqRequest().getHsrReqMxiPlanString(), CONSTANTS.LITERAL_1329)
              == 0
          || compareChars(
                  methodIn.getHsrReqRequest().getHsrReqMxiPlanString(), CONSTANTS.LITERAL_1331)
              == 0
          || compareChars(
                  methodIn.getHsrReqRequest().getHsrReqMxiPlanString(), CONSTANTS.LITERAL_1333)
              == 0
          || compareChars(
                  methodIn.getHsrReqRequest().getHsrReqMxiPlanString(), CONSTANTS.LITERAL_1335)
              == 0
          || compareChars(
                  methodIn.getHsrReqRequest().getHsrReqMxiPlanString(), CONSTANTS.LITERAL_1337)
              == 0
          || compareChars(
                  methodIn.getHsrReqRequest().getHsrReqMxiPlanString(), CONSTANTS.LITERAL_1605)
              == 0) {
        //  cobolCode::SET EMP-SET-39 TO TRUE
        methodOut.setEmpSet39True();
      }
      //  cobolCode::IF HSR-REQ-MXI-PLAN = '2264' OR '2267' OR '2270' OR '2273' OR '2276' OR '2279'
      // OR '2282' OR '2329' OR '2331' OR '2333' OR '2335' OR '2337' OR '2605'
      //  LITERAL_2605 = '2605'
      if (compareChars(methodIn.getHsrReqRequest().getHsrReqMxiPlanString(), CONSTANTS.LITERAL_2264)
              == 0
          || compareChars(
                  methodIn.getHsrReqRequest().getHsrReqMxiPlanString(), CONSTANTS.LITERAL_2267)
              == 0
          || compareChars(
                  methodIn.getHsrReqRequest().getHsrReqMxiPlanString(), CONSTANTS.LITERAL_2270)
              == 0
          || compareChars(
                  methodIn.getHsrReqRequest().getHsrReqMxiPlanString(), CONSTANTS.LITERAL_2273)
              == 0
          || compareChars(
                  methodIn.getHsrReqRequest().getHsrReqMxiPlanString(), CONSTANTS.LITERAL_2276)
              == 0
          || compareChars(
                  methodIn.getHsrReqRequest().getHsrReqMxiPlanString(), CONSTANTS.LITERAL_2279)
              == 0
          || compareChars(
                  methodIn.getHsrReqRequest().getHsrReqMxiPlanString(), CONSTANTS.LITERAL_2282)
              == 0
          || compareChars(
                  methodIn.getHsrReqRequest().getHsrReqMxiPlanString(), CONSTANTS.LITERAL_2329)
              == 0
          || compareChars(
                  methodIn.getHsrReqRequest().getHsrReqMxiPlanString(), CONSTANTS.LITERAL_2331)
              == 0
          || compareChars(
                  methodIn.getHsrReqRequest().getHsrReqMxiPlanString(), CONSTANTS.LITERAL_2333)
              == 0
          || compareChars(
                  methodIn.getHsrReqRequest().getHsrReqMxiPlanString(), CONSTANTS.LITERAL_2335)
              == 0
          || compareChars(
                  methodIn.getHsrReqRequest().getHsrReqMxiPlanString(), CONSTANTS.LITERAL_2337)
              == 0
          || compareChars(
                  methodIn.getHsrReqRequest().getHsrReqMxiPlanString(), CONSTANTS.LITERAL_2605)
              == 0) {
        //  cobolCode::SET EMP-SET-40 TO TRUE
        methodOut.setEmpSet40True();
      }
      //  cobolCode::IF HSR-REQ-MXI-PLAN = '3264' OR '3267' OR '3270' OR '3273' OR '3276' OR '3279'
      // OR '3282' OR '3329' OR '3331' OR '3333' OR '3335' OR '3337' OR '3605'
      //  LITERAL_3605 = '3605'
      if (compareChars(methodIn.getHsrReqRequest().getHsrReqMxiPlanString(), CONSTANTS.LITERAL_3264)
              == 0
          || compareChars(
                  methodIn.getHsrReqRequest().getHsrReqMxiPlanString(), CONSTANTS.LITERAL_3267)
              == 0
          || compareChars(
                  methodIn.getHsrReqRequest().getHsrReqMxiPlanString(), CONSTANTS.LITERAL_3270)
              == 0
          || compareChars(
                  methodIn.getHsrReqRequest().getHsrReqMxiPlanString(), CONSTANTS.LITERAL_3273)
              == 0
          || compareChars(
                  methodIn.getHsrReqRequest().getHsrReqMxiPlanString(), CONSTANTS.LITERAL_3276)
              == 0
          || compareChars(
                  methodIn.getHsrReqRequest().getHsrReqMxiPlanString(), CONSTANTS.LITERAL_3279)
              == 0
          || compareChars(
                  methodIn.getHsrReqRequest().getHsrReqMxiPlanString(), CONSTANTS.LITERAL_3282)
              == 0
          || compareChars(
                  methodIn.getHsrReqRequest().getHsrReqMxiPlanString(), CONSTANTS.LITERAL_3329)
              == 0
          || compareChars(
                  methodIn.getHsrReqRequest().getHsrReqMxiPlanString(), CONSTANTS.LITERAL_3331)
              == 0
          || compareChars(
                  methodIn.getHsrReqRequest().getHsrReqMxiPlanString(), CONSTANTS.LITERAL_3333)
              == 0
          || compareChars(
                  methodIn.getHsrReqRequest().getHsrReqMxiPlanString(), CONSTANTS.LITERAL_3335)
              == 0
          || compareChars(
                  methodIn.getHsrReqRequest().getHsrReqMxiPlanString(), CONSTANTS.LITERAL_3337)
              == 0
          || compareChars(
                  methodIn.getHsrReqRequest().getHsrReqMxiPlanString(), CONSTANTS.LITERAL_3605)
              == 0) {
        //  cobolCode::SET EMP-SET-41 TO TRUE
        methodOut.setEmpSet41True();
      }
      //  cobolCode::IF HSR-REQ-MXI-PLAN = '1211' OR '1213' OR '1241' OR '1243'
      //  LITERAL_1243 = '1243'
      if (compareChars(methodIn.getHsrReqRequest().getHsrReqMxiPlanString(), CONSTANTS.LITERAL_1211)
              == 0
          || compareChars(
                  methodIn.getHsrReqRequest().getHsrReqMxiPlanString(), CONSTANTS.LITERAL_1213)
              == 0
          || compareChars(
                  methodIn.getHsrReqRequest().getHsrReqMxiPlanString(), CONSTANTS.LITERAL_1241)
              == 0
          || compareChars(
                  methodIn.getHsrReqRequest().getHsrReqMxiPlanString(), CONSTANTS.LITERAL_1243)
              == 0) {
        //  cobolCode::SET EMP-SET-42 TO TRUE
        methodOut.setEmpSet42True();
      }
      //  cobolCode::IF HSR-REQ-MXI-PLAN = '1221' OR '1229' OR '1247' OR '1254' OR '1357' OR '1358'
      // OR '1359' OR '1360'
      //  LITERAL_1360 = '1360'
      if (compareChars(methodIn.getHsrReqRequest().getHsrReqMxiPlanString(), CONSTANTS.LITERAL_1221)
              == 0
          || compareChars(
                  methodIn.getHsrReqRequest().getHsrReqMxiPlanString(), CONSTANTS.LITERAL_1229)
              == 0
          || compareChars(
                  methodIn.getHsrReqRequest().getHsrReqMxiPlanString(), CONSTANTS.LITERAL_1247)
              == 0
          || compareChars(
                  methodIn.getHsrReqRequest().getHsrReqMxiPlanString(), CONSTANTS.LITERAL_1254)
              == 0
          || compareChars(
                  methodIn.getHsrReqRequest().getHsrReqMxiPlanString(), CONSTANTS.LITERAL_1357)
              == 0
          || compareChars(
                  methodIn.getHsrReqRequest().getHsrReqMxiPlanString(), CONSTANTS.LITERAL_1358)
              == 0
          || compareChars(
                  methodIn.getHsrReqRequest().getHsrReqMxiPlanString(), CONSTANTS.LITERAL_1359)
              == 0
          || compareChars(
                  methodIn.getHsrReqRequest().getHsrReqMxiPlanString(), CONSTANTS.LITERAL_1360)
              == 0) {
        //  cobolCode::SET EMP-SET-43 TO TRUE
        methodOut.setEmpSet43True();
      }
      //  cobolCode::IF HSR-REQ-MXI-PLAN = '1307' OR '1313' OR '1315' OR '1316' OR '1322'
      //  LITERAL_1322 = '1322'
      if (compareChars(methodIn.getHsrReqRequest().getHsrReqMxiPlanString(), CONSTANTS.LITERAL_1307)
              == 0
          || compareChars(
                  methodIn.getHsrReqRequest().getHsrReqMxiPlanString(), CONSTANTS.LITERAL_1313)
              == 0
          || compareChars(
                  methodIn.getHsrReqRequest().getHsrReqMxiPlanString(), CONSTANTS.LITERAL_1315)
              == 0
          || compareChars(
                  methodIn.getHsrReqRequest().getHsrReqMxiPlanString(), CONSTANTS.LITERAL_1316)
              == 0
          || compareChars(
                  methodIn.getHsrReqRequest().getHsrReqMxiPlanString(), CONSTANTS.LITERAL_1322)
              == 0) {
        //  cobolCode::SET EMP-SET-44 TO TRUE
        methodOut.setEmpSet44True();
      }
      //  cobolCode::IF HSR-REQ-MXI-PLAN = '1310' OR '1311' OR '1312' OR '1314' OR '1319' OR '1320'
      // OR '1321'
      //  LITERAL_1321 = '1321'
      if (compareChars(methodIn.getHsrReqRequest().getHsrReqMxiPlanString(), CONSTANTS.LITERAL_1310)
              == 0
          || compareChars(
                  methodIn.getHsrReqRequest().getHsrReqMxiPlanString(), CONSTANTS.LITERAL_1311)
              == 0
          || compareChars(
                  methodIn.getHsrReqRequest().getHsrReqMxiPlanString(), CONSTANTS.LITERAL_1312)
              == 0
          || compareChars(
                  methodIn.getHsrReqRequest().getHsrReqMxiPlanString(), CONSTANTS.LITERAL_1314)
              == 0
          || compareChars(
                  methodIn.getHsrReqRequest().getHsrReqMxiPlanString(), CONSTANTS.LITERAL_1319)
              == 0
          || compareChars(
                  methodIn.getHsrReqRequest().getHsrReqMxiPlanString(), CONSTANTS.LITERAL_1320)
              == 0
          || compareChars(
                  methodIn.getHsrReqRequest().getHsrReqMxiPlanString(), CONSTANTS.LITERAL_1321)
              == 0) {
        //  cobolCode::SET EMP-SET-45 TO TRUE
        methodOut.setEmpSet45True();
      }
      //  cobolCode::IF HSR-REQ-MXI-PLAN = '1308' OR '1317'
      //  LITERAL_1317 = '1317'
      if (compareChars(methodIn.getHsrReqRequest().getHsrReqMxiPlanString(), CONSTANTS.LITERAL_1308)
              == 0
          || compareChars(
                  methodIn.getHsrReqRequest().getHsrReqMxiPlanString(), CONSTANTS.LITERAL_1317)
              == 0) {
        //  cobolCode::SET EMP-SET-46 TO TRUE
        methodOut.setEmpSet46True();
      }
      //  cobolCode::IF HSR-REQ-MXI-PLAN = '1309' OR '1318'
      //  LITERAL_1318 = '1318'
      if (compareChars(methodIn.getHsrReqRequest().getHsrReqMxiPlanString(), CONSTANTS.LITERAL_1309)
              == 0
          || compareChars(
                  methodIn.getHsrReqRequest().getHsrReqMxiPlanString(), CONSTANTS.LITERAL_1318)
              == 0) {
        //  cobolCode::SET EMP-SET-47 TO TRUE
        methodOut.setEmpSet47True();
      }
      //  cobolCode::IF HSR-REQ-MXI-PLAN = '1323' OR '1324'
      //  LITERAL_1324 = '1324'
      if (compareChars(methodIn.getHsrReqRequest().getHsrReqMxiPlanString(), CONSTANTS.LITERAL_1323)
              == 0
          || compareChars(
                  methodIn.getHsrReqRequest().getHsrReqMxiPlanString(), CONSTANTS.LITERAL_1324)
              == 0) {
        //  cobolCode::SET EMP-SET-48 TO TRUE
        methodOut.setEmpSet48True();
      }
      //  cobolCode::IF HSR-REQ-MXI-PLAN = '0354' OR '0355' OR '0356' OR '0380' OR '0381' OR '0402'
      // OR '0599'
      //  LITERAL_0599 = '0599'
      if (compareChars(methodIn.getHsrReqRequest().getHsrReqMxiPlanString(), CONSTANTS.LITERAL_0354)
              == 0
          || compareChars(
                  methodIn.getHsrReqRequest().getHsrReqMxiPlanString(), CONSTANTS.LITERAL_0355)
              == 0
          || compareChars(
                  methodIn.getHsrReqRequest().getHsrReqMxiPlanString(), CONSTANTS.LITERAL_0356)
              == 0
          || compareChars(
                  methodIn.getHsrReqRequest().getHsrReqMxiPlanString(), CONSTANTS.LITERAL_0380)
              == 0
          || compareChars(
                  methodIn.getHsrReqRequest().getHsrReqMxiPlanString(), CONSTANTS.LITERAL_0381)
              == 0
          || compareChars(
                  methodIn.getHsrReqRequest().getHsrReqMxiPlanString(), CONSTANTS.LITERAL_0402)
              == 0
          || compareChars(
                  methodIn.getHsrReqRequest().getHsrReqMxiPlanString(), CONSTANTS.LITERAL_0599)
              == 0) {
        //  cobolCode::SET EMP-SET-49 TO TRUE
        methodOut.setEmpSet49True();
      }
      //  cobolCode::IF HSR-REQ-MXI-PLAN = '1354' OR '1355' OR '1356' OR '1380' OR '1381' OR '1599'
      //  LITERAL_1599 = '1599'
      if (compareChars(methodIn.getHsrReqRequest().getHsrReqMxiPlanString(), CONSTANTS.LITERAL_1354)
              == 0
          || compareChars(
                  methodIn.getHsrReqRequest().getHsrReqMxiPlanString(), CONSTANTS.LITERAL_1355)
              == 0
          || compareChars(
                  methodIn.getHsrReqRequest().getHsrReqMxiPlanString(), CONSTANTS.LITERAL_1356)
              == 0
          || compareChars(
                  methodIn.getHsrReqRequest().getHsrReqMxiPlanString(), CONSTANTS.LITERAL_1380)
              == 0
          || compareChars(
                  methodIn.getHsrReqRequest().getHsrReqMxiPlanString(), CONSTANTS.LITERAL_1381)
              == 0
          || compareChars(
                  methodIn.getHsrReqRequest().getHsrReqMxiPlanString(), CONSTANTS.LITERAL_1599)
              == 0) {
        //  cobolCode::SET EMP-SET-50 TO TRUE
        methodOut.setEmpSet50True();
      }
      //  cobolCode::IF HSR-REQ-MXI-PLAN = '0361' OR '0362' OR '0363' OR '0364' OR '0409'
      //  LITERAL_0409 = '0409'
      if (compareChars(methodIn.getHsrReqRequest().getHsrReqMxiPlanString(), CONSTANTS.LITERAL_0361)
              == 0
          || compareChars(
                  methodIn.getHsrReqRequest().getHsrReqMxiPlanString(), CONSTANTS.LITERAL_0362)
              == 0
          || compareChars(
                  methodIn.getHsrReqRequest().getHsrReqMxiPlanString(), CONSTANTS.LITERAL_0363)
              == 0
          || compareChars(
                  methodIn.getHsrReqRequest().getHsrReqMxiPlanString(), CONSTANTS.LITERAL_0364)
              == 0
          || compareChars(
                  methodIn.getHsrReqRequest().getHsrReqMxiPlanString(), CONSTANTS.LITERAL_0409)
              == 0) {
        //  cobolCode::SET EMP-SET-51 TO TRUE
        methodOut.setEmpSet51True();
      }
      //  cobolCode::IF HSR-REQ-MXI-PLAN = '1361' OR '1362' OR '1363' OR '1364'
      //  LITERAL_1364 = '1364'
      if (compareChars(methodIn.getHsrReqRequest().getHsrReqMxiPlanString(), CONSTANTS.LITERAL_1361)
              == 0
          || compareChars(
                  methodIn.getHsrReqRequest().getHsrReqMxiPlanString(), CONSTANTS.LITERAL_1362)
              == 0
          || compareChars(
                  methodIn.getHsrReqRequest().getHsrReqMxiPlanString(), CONSTANTS.LITERAL_1363)
              == 0
          || compareChars(
                  methodIn.getHsrReqRequest().getHsrReqMxiPlanString(), CONSTANTS.LITERAL_1364)
              == 0) {
        //  cobolCode::SET EMP-SET-52 TO TRUE
        methodOut.setEmpSet52True();
      }
      //  cobolCode::IF HSR-REQ-MXI-PLAN = '3365' OR '3366' OR '3367' OR '3368' OR '3369' OR '3370'
      // OR '3371' OR '3372' OR '3373' OR '3374' OR '3375' OR '3376' OR '3606'
      //  LITERAL_3606 = '3606'
      if (compareChars(methodIn.getHsrReqRequest().getHsrReqMxiPlanString(), CONSTANTS.LITERAL_3365)
              == 0
          || compareChars(
                  methodIn.getHsrReqRequest().getHsrReqMxiPlanString(), CONSTANTS.LITERAL_3366)
              == 0
          || compareChars(
                  methodIn.getHsrReqRequest().getHsrReqMxiPlanString(), CONSTANTS.LITERAL_3367)
              == 0
          || compareChars(
                  methodIn.getHsrReqRequest().getHsrReqMxiPlanString(), CONSTANTS.LITERAL_3368)
              == 0
          || compareChars(
                  methodIn.getHsrReqRequest().getHsrReqMxiPlanString(), CONSTANTS.LITERAL_3369)
              == 0
          || compareChars(
                  methodIn.getHsrReqRequest().getHsrReqMxiPlanString(), CONSTANTS.LITERAL_3370)
              == 0
          || compareChars(
                  methodIn.getHsrReqRequest().getHsrReqMxiPlanString(), CONSTANTS.LITERAL_3371)
              == 0
          || compareChars(
                  methodIn.getHsrReqRequest().getHsrReqMxiPlanString(), CONSTANTS.LITERAL_3372)
              == 0
          || compareChars(
                  methodIn.getHsrReqRequest().getHsrReqMxiPlanString(), CONSTANTS.LITERAL_3373)
              == 0
          || compareChars(
                  methodIn.getHsrReqRequest().getHsrReqMxiPlanString(), CONSTANTS.LITERAL_3374)
              == 0
          || compareChars(
                  methodIn.getHsrReqRequest().getHsrReqMxiPlanString(), CONSTANTS.LITERAL_3375)
              == 0
          || compareChars(
                  methodIn.getHsrReqRequest().getHsrReqMxiPlanString(), CONSTANTS.LITERAL_3376)
              == 0
          || compareChars(
                  methodIn.getHsrReqRequest().getHsrReqMxiPlanString(), CONSTANTS.LITERAL_3606)
              == 0) {
        //  cobolCode::SET EMP-SET-81 TO TRUE
        methodOut.setEmpSet81True();
      }
      //  cobolCode::IF HSR-REQ-MXI-PLAN = '1365' OR '1366' OR '1367' OR '1368' OR '1369' OR '1370'
      // OR '1371' OR '1372' OR '1373' OR '1374' OR '1375' OR '1376' OR '1606'
      //  LITERAL_1606 = '1606'
      if (compareChars(methodIn.getHsrReqRequest().getHsrReqMxiPlanString(), CONSTANTS.LITERAL_1365)
              == 0
          || compareChars(
                  methodIn.getHsrReqRequest().getHsrReqMxiPlanString(), CONSTANTS.LITERAL_1366)
              == 0
          || compareChars(
                  methodIn.getHsrReqRequest().getHsrReqMxiPlanString(), CONSTANTS.LITERAL_1367)
              == 0
          || compareChars(
                  methodIn.getHsrReqRequest().getHsrReqMxiPlanString(), CONSTANTS.LITERAL_1368)
              == 0
          || compareChars(
                  methodIn.getHsrReqRequest().getHsrReqMxiPlanString(), CONSTANTS.LITERAL_1369)
              == 0
          || compareChars(
                  methodIn.getHsrReqRequest().getHsrReqMxiPlanString(), CONSTANTS.LITERAL_1370)
              == 0
          || compareChars(
                  methodIn.getHsrReqRequest().getHsrReqMxiPlanString(), CONSTANTS.LITERAL_1371)
              == 0
          || compareChars(
                  methodIn.getHsrReqRequest().getHsrReqMxiPlanString(), CONSTANTS.LITERAL_1372)
              == 0
          || compareChars(
                  methodIn.getHsrReqRequest().getHsrReqMxiPlanString(), CONSTANTS.LITERAL_1373)
              == 0
          || compareChars(
                  methodIn.getHsrReqRequest().getHsrReqMxiPlanString(), CONSTANTS.LITERAL_1374)
              == 0
          || compareChars(
                  methodIn.getHsrReqRequest().getHsrReqMxiPlanString(), CONSTANTS.LITERAL_1375)
              == 0
          || compareChars(
                  methodIn.getHsrReqRequest().getHsrReqMxiPlanString(), CONSTANTS.LITERAL_1376)
              == 0
          || compareChars(
                  methodIn.getHsrReqRequest().getHsrReqMxiPlanString(), CONSTANTS.LITERAL_1606)
              == 0) {
        //  cobolCode::SET EMP-SET-82 TO TRUE
        methodOut.setEmpSet82True();
      }
      //  cobolCode::IF HSR-REQ-MXI-PLAN = '2365' OR '2366' OR '2367' OR '2368' OR '2369' OR '2370'
      // OR '2371' OR '2372' OR '2373' OR '2374' OR '2375' OR '2376' OR '2606'
      //  LITERAL_2606 = '2606'
      if (compareChars(methodIn.getHsrReqRequest().getHsrReqMxiPlanString(), CONSTANTS.LITERAL_2365)
              == 0
          || compareChars(
                  methodIn.getHsrReqRequest().getHsrReqMxiPlanString(), CONSTANTS.LITERAL_2366)
              == 0
          || compareChars(
                  methodIn.getHsrReqRequest().getHsrReqMxiPlanString(), CONSTANTS.LITERAL_2367)
              == 0
          || compareChars(
                  methodIn.getHsrReqRequest().getHsrReqMxiPlanString(), CONSTANTS.LITERAL_2368)
              == 0
          || compareChars(
                  methodIn.getHsrReqRequest().getHsrReqMxiPlanString(), CONSTANTS.LITERAL_2369)
              == 0
          || compareChars(
                  methodIn.getHsrReqRequest().getHsrReqMxiPlanString(), CONSTANTS.LITERAL_2370)
              == 0
          || compareChars(
                  methodIn.getHsrReqRequest().getHsrReqMxiPlanString(), CONSTANTS.LITERAL_2371)
              == 0
          || compareChars(
                  methodIn.getHsrReqRequest().getHsrReqMxiPlanString(), CONSTANTS.LITERAL_2372)
              == 0
          || compareChars(
                  methodIn.getHsrReqRequest().getHsrReqMxiPlanString(), CONSTANTS.LITERAL_2373)
              == 0
          || compareChars(
                  methodIn.getHsrReqRequest().getHsrReqMxiPlanString(), CONSTANTS.LITERAL_2374)
              == 0
          || compareChars(
                  methodIn.getHsrReqRequest().getHsrReqMxiPlanString(), CONSTANTS.LITERAL_2375)
              == 0
          || compareChars(
                  methodIn.getHsrReqRequest().getHsrReqMxiPlanString(), CONSTANTS.LITERAL_2376)
              == 0
          || compareChars(
                  methodIn.getHsrReqRequest().getHsrReqMxiPlanString(), CONSTANTS.LITERAL_2606)
              == 0) {
        //  cobolCode::SET EMP-SET-83 TO TRUE
        methodOut.setEmpSet83True();
      }
      //  cobolCode::IF HSR-REQ-MXI-PLAN = '0365' OR '0366' OR '0367' OR '0368' OR '0369' OR '0370'
      // OR '0371' OR '0372' OR '0373' OR '0374' OR '0375' OR '0376' OR '0412' OR '0606'
      //  LITERAL_0606 = '0606'
      if (compareChars(methodIn.getHsrReqRequest().getHsrReqMxiPlanString(), CONSTANTS.LITERAL_0365)
              == 0
          || compareChars(
                  methodIn.getHsrReqRequest().getHsrReqMxiPlanString(), CONSTANTS.LITERAL_0366)
              == 0
          || compareChars(
                  methodIn.getHsrReqRequest().getHsrReqMxiPlanString(), CONSTANTS.LITERAL_0367)
              == 0
          || compareChars(
                  methodIn.getHsrReqRequest().getHsrReqMxiPlanString(), CONSTANTS.LITERAL_0368)
              == 0
          || compareChars(
                  methodIn.getHsrReqRequest().getHsrReqMxiPlanString(), CONSTANTS.LITERAL_0369)
              == 0
          || compareChars(
                  methodIn.getHsrReqRequest().getHsrReqMxiPlanString(), CONSTANTS.LITERAL_0370)
              == 0
          || compareChars(
                  methodIn.getHsrReqRequest().getHsrReqMxiPlanString(), CONSTANTS.LITERAL_0371)
              == 0
          || compareChars(
                  methodIn.getHsrReqRequest().getHsrReqMxiPlanString(), CONSTANTS.LITERAL_0372)
              == 0
          || compareChars(
                  methodIn.getHsrReqRequest().getHsrReqMxiPlanString(), CONSTANTS.LITERAL_0373)
              == 0
          || compareChars(
                  methodIn.getHsrReqRequest().getHsrReqMxiPlanString(), CONSTANTS.LITERAL_0374)
              == 0
          || compareChars(
                  methodIn.getHsrReqRequest().getHsrReqMxiPlanString(), CONSTANTS.LITERAL_0375)
              == 0
          || compareChars(
                  methodIn.getHsrReqRequest().getHsrReqMxiPlanString(), CONSTANTS.LITERAL_0376)
              == 0
          || compareChars(
                  methodIn.getHsrReqRequest().getHsrReqMxiPlanString(), CONSTANTS.LITERAL_0412)
              == 0
          || compareChars(
                  methodIn.getHsrReqRequest().getHsrReqMxiPlanString(), CONSTANTS.LITERAL_0606)
              == 0) {
        //  cobolCode::SET EMP-SET-84 TO TRUE
        methodOut.setEmpSet84True();
      }
      //  cobolCode::IF HSR-REQ-MXI-PLAN = '0378' OR '0379'
      //  LITERAL_0379 = '0379'
      if (compareChars(methodIn.getHsrReqRequest().getHsrReqMxiPlanString(), CONSTANTS.LITERAL_0378)
              == 0
          || compareChars(
                  methodIn.getHsrReqRequest().getHsrReqMxiPlanString(), CONSTANTS.LITERAL_0379)
              == 0) {
        //  cobolCode::SET EMP-SET-87 TO TRUE
        methodOut.setEmpSet87True();
      }
      //  cobolCode::IF HSR-REQ-MXI-PLAN = '0382' OR '0383' OR '0398'
      //  LITERAL_0398 = '0398'
      if (compareChars(methodIn.getHsrReqRequest().getHsrReqMxiPlanString(), CONSTANTS.LITERAL_0382)
              == 0
          || compareChars(
                  methodIn.getHsrReqRequest().getHsrReqMxiPlanString(), CONSTANTS.LITERAL_0383)
              == 0
          || compareChars(
                  methodIn.getHsrReqRequest().getHsrReqMxiPlanString(), CONSTANTS.LITERAL_0398)
              == 0) {
        //  cobolCode::SET EMP-SET-144 TO TRUE
        methodOut.setEmpSet144True();
      }
      //  cobolCode::IF HSR-REQ-MXI-PLAN = '1382' OR '1383'
      //  LITERAL_1383 = '1383'
      if (compareChars(methodIn.getHsrReqRequest().getHsrReqMxiPlanString(), CONSTANTS.LITERAL_1382)
              == 0
          || compareChars(
                  methodIn.getHsrReqRequest().getHsrReqMxiPlanString(), CONSTANTS.LITERAL_1383)
              == 0) {
        //  cobolCode::SET EMP-SET-145 TO TRUE
        methodOut.setEmpSet145True();
      }
      //  cobolCode::IF HSR-REQ-MXI-PLAN = '0414' OR '0415' OR '0416' OR '4001' OR '4002'
      //  LITERAL_4002 = '4002'
      if (compareChars(methodIn.getHsrReqRequest().getHsrReqMxiPlanString(), CONSTANTS.LITERAL_0414)
              == 0
          || compareChars(
                  methodIn.getHsrReqRequest().getHsrReqMxiPlanString(), CONSTANTS.LITERAL_0415)
              == 0
          || compareChars(
                  methodIn.getHsrReqRequest().getHsrReqMxiPlanString(), CONSTANTS.LITERAL_0416)
              == 0
          || compareChars(
                  methodIn.getHsrReqRequest().getHsrReqMxiPlanString(), CONSTANTS.LITERAL_4001)
              == 0
          || compareChars(
                  methodIn.getHsrReqRequest().getHsrReqMxiPlanString(), CONSTANTS.LITERAL_4002)
              == 0) {
        //  cobolCode::SET EMP-SET-148 TO TRUE
        methodOut.setEmpSet148True();
      }
      //  cobolCode::IF HSR-REQ-MXI-PLAN = '1414' OR '1415' OR '4201'
      //  LITERAL_4201 = '4201'
      if (compareChars(methodIn.getHsrReqRequest().getHsrReqMxiPlanString(), CONSTANTS.LITERAL_1414)
              == 0
          || compareChars(
                  methodIn.getHsrReqRequest().getHsrReqMxiPlanString(), CONSTANTS.LITERAL_1415)
              == 0
          || compareChars(
                  methodIn.getHsrReqRequest().getHsrReqMxiPlanString(), CONSTANTS.LITERAL_4201)
              == 0) {
        //  cobolCode::SET EMP-SET-149 TO TRUE
        methodOut.setEmpSet149True();
      }
      //  cobolCode::IF HSR-REQ-MXI-PLAN = '0417' OR '0418' OR '0419'
      //  LITERAL_0419 = '0419'
      if (compareChars(methodIn.getHsrReqRequest().getHsrReqMxiPlanString(), CONSTANTS.LITERAL_0417)
              == 0
          || compareChars(
                  methodIn.getHsrReqRequest().getHsrReqMxiPlanString(), CONSTANTS.LITERAL_0418)
              == 0
          || compareChars(
                  methodIn.getHsrReqRequest().getHsrReqMxiPlanString(), CONSTANTS.LITERAL_0419)
              == 0) {
        //  cobolCode::SET EMP-SET-153 TO TRUE
        methodOut.setEmpSet153True();
      }
      //  cobolCode::IF HSR-REQ-MXI-PLAN = '1417' OR '1418'
      //  LITERAL_1418 = '1418'
      if (compareChars(methodIn.getHsrReqRequest().getHsrReqMxiPlanString(), CONSTANTS.LITERAL_1417)
              == 0
          || compareChars(
                  methodIn.getHsrReqRequest().getHsrReqMxiPlanString(), CONSTANTS.LITERAL_1418)
              == 0) {
        //  cobolCode::SET EMP-SET-154 TO TRUE
        methodOut.setEmpSet154True();
      }
      //  cobolCode::IF HSR-REQ-MXI-PLAN = '0607' OR '0612' OR '0668'
      //  LITERAL_0668 = '0668'
      if (compareChars(methodIn.getHsrReqRequest().getHsrReqMxiPlanString(), CONSTANTS.LITERAL_0607)
              == 0
          || compareChars(
                  methodIn.getHsrReqRequest().getHsrReqMxiPlanString(), CONSTANTS.LITERAL_0612)
              == 0
          || compareChars(
                  methodIn.getHsrReqRequest().getHsrReqMxiPlanString(), CONSTANTS.LITERAL_0668)
              == 0) {
        //  cobolCode::SET EMP-SET-157 TO TRUE
        methodOut.setEmpSet157True();
      }
      //  cobolCode::IF HSR-REQ-MXI-PLAN = '1607' OR '1612'
      //  LITERAL_1612 = '1612'
      if (compareChars(methodIn.getHsrReqRequest().getHsrReqMxiPlanString(), CONSTANTS.LITERAL_1607)
              == 0
          || compareChars(
                  methodIn.getHsrReqRequest().getHsrReqMxiPlanString(), CONSTANTS.LITERAL_1612)
              == 0) {
        //  cobolCode::SET EMP-SET-158 TO TRUE
        methodOut.setEmpSet158True();
      }
      //  cobolCode::IF HSR-REQ-MXI-PLAN = '0608' OR '0662' OR '0678'
      //  LITERAL_0678 = '0678'
      if (compareChars(methodIn.getHsrReqRequest().getHsrReqMxiPlanString(), CONSTANTS.LITERAL_0608)
              == 0
          || compareChars(
                  methodIn.getHsrReqRequest().getHsrReqMxiPlanString(), CONSTANTS.LITERAL_0662)
              == 0
          || compareChars(
                  methodIn.getHsrReqRequest().getHsrReqMxiPlanString(), CONSTANTS.LITERAL_0678)
              == 0) {
        //  cobolCode::SET EMP-SET-159 TO TRUE
        methodOut.setEmpSet159True();
      }
      //  cobolCode::IF HSR-REQ-MXI-PLAN = '1608' OR '1662'
      //  LITERAL_1662 = '1662'
      if (compareChars(methodIn.getHsrReqRequest().getHsrReqMxiPlanString(), CONSTANTS.LITERAL_1608)
              == 0
          || compareChars(
                  methodIn.getHsrReqRequest().getHsrReqMxiPlanString(), CONSTANTS.LITERAL_1662)
              == 0) {
        //  cobolCode::SET EMP-SET-160 TO TRUE
        methodOut.setEmpSet160True();
      }
      //  cobolCode::IF HSR-REQ-MXI-PLAN = '0609' OR '0613' OR '0614' OR '0616' OR '0663' OR '0665'
      // OR '0670' OR '0671' OR '0672' OR '0673' OR '0677'
      //  LITERAL_0677 = '0677'
      if (compareChars(methodIn.getHsrReqRequest().getHsrReqMxiPlanString(), CONSTANTS.LITERAL_0609)
              == 0
          || compareChars(
                  methodIn.getHsrReqRequest().getHsrReqMxiPlanString(), CONSTANTS.LITERAL_0613)
              == 0
          || compareChars(
                  methodIn.getHsrReqRequest().getHsrReqMxiPlanString(), CONSTANTS.LITERAL_0614)
              == 0
          || compareChars(
                  methodIn.getHsrReqRequest().getHsrReqMxiPlanString(), CONSTANTS.LITERAL_0616)
              == 0
          || compareChars(
                  methodIn.getHsrReqRequest().getHsrReqMxiPlanString(), CONSTANTS.LITERAL_0663)
              == 0
          || compareChars(
                  methodIn.getHsrReqRequest().getHsrReqMxiPlanString(), CONSTANTS.LITERAL_0665)
              == 0
          || compareChars(
                  methodIn.getHsrReqRequest().getHsrReqMxiPlanString(), CONSTANTS.LITERAL_0670)
              == 0
          || compareChars(
                  methodIn.getHsrReqRequest().getHsrReqMxiPlanString(), CONSTANTS.LITERAL_0671)
              == 0
          || compareChars(
                  methodIn.getHsrReqRequest().getHsrReqMxiPlanString(), CONSTANTS.LITERAL_0672)
              == 0
          || compareChars(
                  methodIn.getHsrReqRequest().getHsrReqMxiPlanString(), CONSTANTS.LITERAL_0673)
              == 0
          || compareChars(
                  methodIn.getHsrReqRequest().getHsrReqMxiPlanString(), CONSTANTS.LITERAL_0677)
              == 0) {
        //  cobolCode::SET EMP-SET-161 TO TRUE
        methodOut.setEmpSet161True();
      }
      //  cobolCode::IF HSR-REQ-MXI-PLAN = '1609' OR '1613' OR '1614' OR '1663' OR '1670' OR '1671'
      // OR '1672' OR '1673'
      //  LITERAL_1673 = '1673'
      if (compareChars(methodIn.getHsrReqRequest().getHsrReqMxiPlanString(), CONSTANTS.LITERAL_1609)
              == 0
          || compareChars(
                  methodIn.getHsrReqRequest().getHsrReqMxiPlanString(), CONSTANTS.LITERAL_1613)
              == 0
          || compareChars(
                  methodIn.getHsrReqRequest().getHsrReqMxiPlanString(), CONSTANTS.LITERAL_1614)
              == 0
          || compareChars(
                  methodIn.getHsrReqRequest().getHsrReqMxiPlanString(), CONSTANTS.LITERAL_1663)
              == 0
          || compareChars(
                  methodIn.getHsrReqRequest().getHsrReqMxiPlanString(), CONSTANTS.LITERAL_1670)
              == 0
          || compareChars(
                  methodIn.getHsrReqRequest().getHsrReqMxiPlanString(), CONSTANTS.LITERAL_1671)
              == 0
          || compareChars(
                  methodIn.getHsrReqRequest().getHsrReqMxiPlanString(), CONSTANTS.LITERAL_1672)
              == 0
          || compareChars(
                  methodIn.getHsrReqRequest().getHsrReqMxiPlanString(), CONSTANTS.LITERAL_1673)
              == 0) {
        //  cobolCode::SET EMP-SET-162 TO TRUE
        methodOut.setEmpSet162True();
      }
      //  cobolCode::IF HSR-REQ-MXI-PLAN = '0610' OR '0667' OR '0676'
      //  LITERAL_0676 = '0676'
      if (compareChars(methodIn.getHsrReqRequest().getHsrReqMxiPlanString(), CONSTANTS.LITERAL_0610)
              == 0
          || compareChars(
                  methodIn.getHsrReqRequest().getHsrReqMxiPlanString(), CONSTANTS.LITERAL_0667)
              == 0
          || compareChars(
                  methodIn.getHsrReqRequest().getHsrReqMxiPlanString(), CONSTANTS.LITERAL_0676)
              == 0) {
        //  cobolCode::SET EMP-SET-163 TO TRUE
        methodOut.setEmpSet163True();
      }
      //  cobolCode::IF HSR-REQ-MXI-PLAN = '1610'
      //  LITERAL_1610 = '1610'
      if (compareChars(methodIn.getHsrReqRequest().getHsrReqMxiPlanString(), CONSTANTS.LITERAL_1610)
          == 0) {
        //  cobolCode::SET EMP-SET-164 TO TRUE
        methodOut.setEmpSet164True();
      }
      //  cobolCode::IF HSR-REQ-MXI-PLAN = '0611' OR '0615' OR '0669'
      //  LITERAL_0669 = '0669'
      if (compareChars(methodIn.getHsrReqRequest().getHsrReqMxiPlanString(), CONSTANTS.LITERAL_0611)
              == 0
          || compareChars(
                  methodIn.getHsrReqRequest().getHsrReqMxiPlanString(), CONSTANTS.LITERAL_0615)
              == 0
          || compareChars(
                  methodIn.getHsrReqRequest().getHsrReqMxiPlanString(), CONSTANTS.LITERAL_0669)
              == 0) {
        //  cobolCode::SET EMP-SET-165 TO TRUE
        methodOut.setEmpSet165True();
      }
      //  cobolCode::IF HSR-REQ-MXI-PLAN = '1611' OR '1615'
      //  LITERAL_1615 = '1615'
      if (compareChars(methodIn.getHsrReqRequest().getHsrReqMxiPlanString(), CONSTANTS.LITERAL_1611)
              == 0
          || compareChars(
                  methodIn.getHsrReqRequest().getHsrReqMxiPlanString(), CONSTANTS.LITERAL_1615)
              == 0) {
        //  cobolCode::SET EMP-SET-166 TO TRUE
        methodOut.setEmpSet166True();
      }
      //  cobolCode::IF HSR-REQ-MXI-PLAN = '0618' OR '0619' OR '0620' OR '0621' OR '0622' OR '0623'
      // OR '0624' OR '0625' OR '0626' OR '0627' OR '0628' OR '0629' OR '0630' OR '0631' OR '0632'
      // OR '0633' OR '0634' OR '0635' OR '0636' OR '0637' OR '0638' OR '0639' OR '0640' OR '0641'
      // OR '0642' OR '0643' OR '0644' OR '0645' OR '0646' OR '0647' OR '0648' OR '0649' OR '0650'
      // OR '0651' OR '0652' OR '0653' OR '0654' OR '0655' OR '0656' OR '0657' OR '0658' OR '0659'
      // OR '0660' OR '0661' OR '0674' OR '0675'
      //  LITERAL_0675 = '0675'
      if (compareChars(methodIn.getHsrReqRequest().getHsrReqMxiPlanString(), CONSTANTS.LITERAL_0618)
              == 0
          || compareChars(
                  methodIn.getHsrReqRequest().getHsrReqMxiPlanString(), CONSTANTS.LITERAL_0619)
              == 0
          || compareChars(
                  methodIn.getHsrReqRequest().getHsrReqMxiPlanString(), CONSTANTS.LITERAL_0620)
              == 0
          || compareChars(
                  methodIn.getHsrReqRequest().getHsrReqMxiPlanString(), CONSTANTS.LITERAL_0621)
              == 0
          || compareChars(
                  methodIn.getHsrReqRequest().getHsrReqMxiPlanString(), CONSTANTS.LITERAL_0622)
              == 0
          || compareChars(
                  methodIn.getHsrReqRequest().getHsrReqMxiPlanString(), CONSTANTS.LITERAL_0623)
              == 0
          || compareChars(
                  methodIn.getHsrReqRequest().getHsrReqMxiPlanString(), CONSTANTS.LITERAL_0624)
              == 0
          || compareChars(
                  methodIn.getHsrReqRequest().getHsrReqMxiPlanString(), CONSTANTS.LITERAL_0625)
              == 0
          || compareChars(
                  methodIn.getHsrReqRequest().getHsrReqMxiPlanString(), CONSTANTS.LITERAL_0626)
              == 0
          || compareChars(
                  methodIn.getHsrReqRequest().getHsrReqMxiPlanString(), CONSTANTS.LITERAL_0627)
              == 0
          || compareChars(
                  methodIn.getHsrReqRequest().getHsrReqMxiPlanString(), CONSTANTS.LITERAL_0628)
              == 0
          || compareChars(
                  methodIn.getHsrReqRequest().getHsrReqMxiPlanString(), CONSTANTS.LITERAL_0629)
              == 0
          || compareChars(
                  methodIn.getHsrReqRequest().getHsrReqMxiPlanString(), CONSTANTS.LITERAL_0630)
              == 0
          || compareChars(
                  methodIn.getHsrReqRequest().getHsrReqMxiPlanString(), CONSTANTS.LITERAL_0631)
              == 0
          || compareChars(
                  methodIn.getHsrReqRequest().getHsrReqMxiPlanString(), CONSTANTS.LITERAL_0632)
              == 0
          || compareChars(
                  methodIn.getHsrReqRequest().getHsrReqMxiPlanString(), CONSTANTS.LITERAL_0633)
              == 0
          || compareChars(
                  methodIn.getHsrReqRequest().getHsrReqMxiPlanString(), CONSTANTS.LITERAL_0634)
              == 0
          || compareChars(
                  methodIn.getHsrReqRequest().getHsrReqMxiPlanString(), CONSTANTS.LITERAL_0635)
              == 0
          || compareChars(
                  methodIn.getHsrReqRequest().getHsrReqMxiPlanString(), CONSTANTS.LITERAL_0636)
              == 0
          || compareChars(
                  methodIn.getHsrReqRequest().getHsrReqMxiPlanString(), CONSTANTS.LITERAL_0637)
              == 0
          || compareChars(
                  methodIn.getHsrReqRequest().getHsrReqMxiPlanString(), CONSTANTS.LITERAL_0638)
              == 0
          || compareChars(
                  methodIn.getHsrReqRequest().getHsrReqMxiPlanString(), CONSTANTS.LITERAL_0639)
              == 0
          || compareChars(
                  methodIn.getHsrReqRequest().getHsrReqMxiPlanString(), CONSTANTS.LITERAL_0640)
              == 0
          || compareChars(
                  methodIn.getHsrReqRequest().getHsrReqMxiPlanString(), CONSTANTS.LITERAL_0641)
              == 0
          || compareChars(
                  methodIn.getHsrReqRequest().getHsrReqMxiPlanString(), CONSTANTS.LITERAL_0642)
              == 0
          || compareChars(
                  methodIn.getHsrReqRequest().getHsrReqMxiPlanString(), CONSTANTS.LITERAL_0643)
              == 0
          || compareChars(
                  methodIn.getHsrReqRequest().getHsrReqMxiPlanString(), CONSTANTS.LITERAL_0644)
              == 0
          || compareChars(
                  methodIn.getHsrReqRequest().getHsrReqMxiPlanString(), CONSTANTS.LITERAL_0645)
              == 0
          || compareChars(
                  methodIn.getHsrReqRequest().getHsrReqMxiPlanString(), CONSTANTS.LITERAL_0646)
              == 0
          || compareChars(
                  methodIn.getHsrReqRequest().getHsrReqMxiPlanString(), CONSTANTS.LITERAL_0647)
              == 0
          || compareChars(
                  methodIn.getHsrReqRequest().getHsrReqMxiPlanString(), CONSTANTS.LITERAL_0648)
              == 0
          || compareChars(
                  methodIn.getHsrReqRequest().getHsrReqMxiPlanString(), CONSTANTS.LITERAL_0649)
              == 0
          || compareChars(
                  methodIn.getHsrReqRequest().getHsrReqMxiPlanString(), CONSTANTS.LITERAL_0650)
              == 0
          || compareChars(
                  methodIn.getHsrReqRequest().getHsrReqMxiPlanString(), CONSTANTS.LITERAL_0651)
              == 0
          || compareChars(
                  methodIn.getHsrReqRequest().getHsrReqMxiPlanString(), CONSTANTS.LITERAL_0652)
              == 0
          || compareChars(
                  methodIn.getHsrReqRequest().getHsrReqMxiPlanString(), CONSTANTS.LITERAL_0653)
              == 0
          || compareChars(
                  methodIn.getHsrReqRequest().getHsrReqMxiPlanString(), CONSTANTS.LITERAL_0654)
              == 0
          || compareChars(
                  methodIn.getHsrReqRequest().getHsrReqMxiPlanString(), CONSTANTS.LITERAL_0655)
              == 0
          || compareChars(
                  methodIn.getHsrReqRequest().getHsrReqMxiPlanString(), CONSTANTS.LITERAL_0656)
              == 0
          || compareChars(
                  methodIn.getHsrReqRequest().getHsrReqMxiPlanString(), CONSTANTS.LITERAL_0657)
              == 0
          || compareChars(
                  methodIn.getHsrReqRequest().getHsrReqMxiPlanString(), CONSTANTS.LITERAL_0658)
              == 0
          || compareChars(
                  methodIn.getHsrReqRequest().getHsrReqMxiPlanString(), CONSTANTS.LITERAL_0659)
              == 0
          || compareChars(
                  methodIn.getHsrReqRequest().getHsrReqMxiPlanString(), CONSTANTS.LITERAL_0660)
              == 0
          || compareChars(
                  methodIn.getHsrReqRequest().getHsrReqMxiPlanString(), CONSTANTS.LITERAL_0661)
              == 0
          || compareChars(
                  methodIn.getHsrReqRequest().getHsrReqMxiPlanString(), CONSTANTS.LITERAL_0674)
              == 0
          || compareChars(
                  methodIn.getHsrReqRequest().getHsrReqMxiPlanString(), CONSTANTS.LITERAL_0675)
              == 0) {
        //  cobolCode::SET EMP-SET-167 TO TRUE
        methodOut.setEmpSet167True();
      }
      //  cobolCode::IF HSR-REQ-MXI-PLAN = '1618' OR '1619' OR '1620' OR '1621' OR '1622' OR '1623'
      // OR '1624' OR '1625' OR '1626' OR '1627' OR '1628' OR '1629' OR '1630' OR '1631' OR '1632'
      // OR '1633' OR '1634' OR '1635' OR '1636' OR '1637' OR '1638' OR '1639' OR '1640' OR '1641'
      // OR '1642' OR '1643' OR '1644' OR '1645' OR '1646' OR '1647' OR '1648' OR '1649' OR '1650'
      // OR '1651' OR '1652' OR '1653' OR '1654' OR '1655' OR '1656' OR '1657' OR '1658' OR '1659'
      // OR '1674' OR '1675'
      //  LITERAL_1675 = '1675'
      if (compareChars(methodIn.getHsrReqRequest().getHsrReqMxiPlanString(), CONSTANTS.LITERAL_1618)
              == 0
          || compareChars(
                  methodIn.getHsrReqRequest().getHsrReqMxiPlanString(), CONSTANTS.LITERAL_1619)
              == 0
          || compareChars(
                  methodIn.getHsrReqRequest().getHsrReqMxiPlanString(), CONSTANTS.LITERAL_1620)
              == 0
          || compareChars(
                  methodIn.getHsrReqRequest().getHsrReqMxiPlanString(), CONSTANTS.LITERAL_1621)
              == 0
          || compareChars(
                  methodIn.getHsrReqRequest().getHsrReqMxiPlanString(), CONSTANTS.LITERAL_1622)
              == 0
          || compareChars(
                  methodIn.getHsrReqRequest().getHsrReqMxiPlanString(), CONSTANTS.LITERAL_1623)
              == 0
          || compareChars(
                  methodIn.getHsrReqRequest().getHsrReqMxiPlanString(), CONSTANTS.LITERAL_1624)
              == 0
          || compareChars(
                  methodIn.getHsrReqRequest().getHsrReqMxiPlanString(), CONSTANTS.LITERAL_1625)
              == 0
          || compareChars(
                  methodIn.getHsrReqRequest().getHsrReqMxiPlanString(), CONSTANTS.LITERAL_1626)
              == 0
          || compareChars(
                  methodIn.getHsrReqRequest().getHsrReqMxiPlanString(), CONSTANTS.LITERAL_1627)
              == 0
          || compareChars(
                  methodIn.getHsrReqRequest().getHsrReqMxiPlanString(), CONSTANTS.LITERAL_1628)
              == 0
          || compareChars(
                  methodIn.getHsrReqRequest().getHsrReqMxiPlanString(), CONSTANTS.LITERAL_1629)
              == 0
          || compareChars(
                  methodIn.getHsrReqRequest().getHsrReqMxiPlanString(), CONSTANTS.LITERAL_1630)
              == 0
          || compareChars(
                  methodIn.getHsrReqRequest().getHsrReqMxiPlanString(), CONSTANTS.LITERAL_1631)
              == 0
          || compareChars(
                  methodIn.getHsrReqRequest().getHsrReqMxiPlanString(), CONSTANTS.LITERAL_1632)
              == 0
          || compareChars(
                  methodIn.getHsrReqRequest().getHsrReqMxiPlanString(), CONSTANTS.LITERAL_1633)
              == 0
          || compareChars(
                  methodIn.getHsrReqRequest().getHsrReqMxiPlanString(), CONSTANTS.LITERAL_1634)
              == 0
          || compareChars(
                  methodIn.getHsrReqRequest().getHsrReqMxiPlanString(), CONSTANTS.LITERAL_1635)
              == 0
          || compareChars(
                  methodIn.getHsrReqRequest().getHsrReqMxiPlanString(), CONSTANTS.LITERAL_1636)
              == 0
          || compareChars(
                  methodIn.getHsrReqRequest().getHsrReqMxiPlanString(), CONSTANTS.LITERAL_1637)
              == 0
          || compareChars(
                  methodIn.getHsrReqRequest().getHsrReqMxiPlanString(), CONSTANTS.LITERAL_1638)
              == 0
          || compareChars(
                  methodIn.getHsrReqRequest().getHsrReqMxiPlanString(), CONSTANTS.LITERAL_1639)
              == 0
          || compareChars(
                  methodIn.getHsrReqRequest().getHsrReqMxiPlanString(), CONSTANTS.LITERAL_1640)
              == 0
          || compareChars(
                  methodIn.getHsrReqRequest().getHsrReqMxiPlanString(), CONSTANTS.LITERAL_1641)
              == 0
          || compareChars(
                  methodIn.getHsrReqRequest().getHsrReqMxiPlanString(), CONSTANTS.LITERAL_1642)
              == 0
          || compareChars(
                  methodIn.getHsrReqRequest().getHsrReqMxiPlanString(), CONSTANTS.LITERAL_1643)
              == 0
          || compareChars(
                  methodIn.getHsrReqRequest().getHsrReqMxiPlanString(), CONSTANTS.LITERAL_1644)
              == 0
          || compareChars(
                  methodIn.getHsrReqRequest().getHsrReqMxiPlanString(), CONSTANTS.LITERAL_1645)
              == 0
          || compareChars(
                  methodIn.getHsrReqRequest().getHsrReqMxiPlanString(), CONSTANTS.LITERAL_1646)
              == 0
          || compareChars(
                  methodIn.getHsrReqRequest().getHsrReqMxiPlanString(), CONSTANTS.LITERAL_1647)
              == 0
          || compareChars(
                  methodIn.getHsrReqRequest().getHsrReqMxiPlanString(), CONSTANTS.LITERAL_1648)
              == 0
          || compareChars(
                  methodIn.getHsrReqRequest().getHsrReqMxiPlanString(), CONSTANTS.LITERAL_1649)
              == 0
          || compareChars(
                  methodIn.getHsrReqRequest().getHsrReqMxiPlanString(), CONSTANTS.LITERAL_1650)
              == 0
          || compareChars(
                  methodIn.getHsrReqRequest().getHsrReqMxiPlanString(), CONSTANTS.LITERAL_1651)
              == 0
          || compareChars(
                  methodIn.getHsrReqRequest().getHsrReqMxiPlanString(), CONSTANTS.LITERAL_1652)
              == 0
          || compareChars(
                  methodIn.getHsrReqRequest().getHsrReqMxiPlanString(), CONSTANTS.LITERAL_1653)
              == 0
          || compareChars(
                  methodIn.getHsrReqRequest().getHsrReqMxiPlanString(), CONSTANTS.LITERAL_1654)
              == 0
          || compareChars(
                  methodIn.getHsrReqRequest().getHsrReqMxiPlanString(), CONSTANTS.LITERAL_1655)
              == 0
          || compareChars(
                  methodIn.getHsrReqRequest().getHsrReqMxiPlanString(), CONSTANTS.LITERAL_1656)
              == 0
          || compareChars(
                  methodIn.getHsrReqRequest().getHsrReqMxiPlanString(), CONSTANTS.LITERAL_1657)
              == 0
          || compareChars(
                  methodIn.getHsrReqRequest().getHsrReqMxiPlanString(), CONSTANTS.LITERAL_1658)
              == 0
          || compareChars(
                  methodIn.getHsrReqRequest().getHsrReqMxiPlanString(), CONSTANTS.LITERAL_1659)
              == 0
          || compareChars(
                  methodIn.getHsrReqRequest().getHsrReqMxiPlanString(), CONSTANTS.LITERAL_1674)
              == 0
          || compareChars(
                  methodIn.getHsrReqRequest().getHsrReqMxiPlanString(), CONSTANTS.LITERAL_1675)
              == 0) {
        //  cobolCode::SET EMP-SET-168 TO TRUE
        methodOut.setEmpSet168True();
      }
      //  cobolCode::IF HSR-REQ-MXI-PLAN = '2618' OR '2619' OR '2620' OR '2621' OR '2622' OR '2623'
      // OR '2624' OR '2625' OR '2626' OR '2627' OR '2628' OR '2629' OR '2630' OR '2631' OR '2632'
      // OR '2633' OR '2634' OR '2635' OR '2636' OR '2637' OR '2638' OR '2639' OR '2640' OR '2641'
      // OR '2642' OR '2643' OR '2644' OR '2645' OR '2646' OR '2647' OR '2648' OR '2649' OR '2650'
      // OR '2651' OR '2652' OR '2653' OR '2654' OR '2655' OR '2656' OR '2657' OR '2658' OR '2659'
      // OR '2674' OR '2675'
      //  LITERAL_2675 = '2675'
      if (compareChars(methodIn.getHsrReqRequest().getHsrReqMxiPlanString(), CONSTANTS.LITERAL_2618)
              == 0
          || compareChars(
                  methodIn.getHsrReqRequest().getHsrReqMxiPlanString(), CONSTANTS.LITERAL_2619)
              == 0
          || compareChars(
                  methodIn.getHsrReqRequest().getHsrReqMxiPlanString(), CONSTANTS.LITERAL_2620)
              == 0
          || compareChars(
                  methodIn.getHsrReqRequest().getHsrReqMxiPlanString(), CONSTANTS.LITERAL_2621)
              == 0
          || compareChars(
                  methodIn.getHsrReqRequest().getHsrReqMxiPlanString(), CONSTANTS.LITERAL_2622)
              == 0
          || compareChars(
                  methodIn.getHsrReqRequest().getHsrReqMxiPlanString(), CONSTANTS.LITERAL_2623)
              == 0
          || compareChars(
                  methodIn.getHsrReqRequest().getHsrReqMxiPlanString(), CONSTANTS.LITERAL_2624)
              == 0
          || compareChars(
                  methodIn.getHsrReqRequest().getHsrReqMxiPlanString(), CONSTANTS.LITERAL_2625)
              == 0
          || compareChars(
                  methodIn.getHsrReqRequest().getHsrReqMxiPlanString(), CONSTANTS.LITERAL_2626)
              == 0
          || compareChars(
                  methodIn.getHsrReqRequest().getHsrReqMxiPlanString(), CONSTANTS.LITERAL_2627)
              == 0
          || compareChars(
                  methodIn.getHsrReqRequest().getHsrReqMxiPlanString(), CONSTANTS.LITERAL_2628)
              == 0
          || compareChars(
                  methodIn.getHsrReqRequest().getHsrReqMxiPlanString(), CONSTANTS.LITERAL_2629)
              == 0
          || compareChars(
                  methodIn.getHsrReqRequest().getHsrReqMxiPlanString(), CONSTANTS.LITERAL_2630)
              == 0
          || compareChars(
                  methodIn.getHsrReqRequest().getHsrReqMxiPlanString(), CONSTANTS.LITERAL_2631)
              == 0
          || compareChars(
                  methodIn.getHsrReqRequest().getHsrReqMxiPlanString(), CONSTANTS.LITERAL_2632)
              == 0
          || compareChars(
                  methodIn.getHsrReqRequest().getHsrReqMxiPlanString(), CONSTANTS.LITERAL_2633)
              == 0
          || compareChars(
                  methodIn.getHsrReqRequest().getHsrReqMxiPlanString(), CONSTANTS.LITERAL_2634)
              == 0
          || compareChars(
                  methodIn.getHsrReqRequest().getHsrReqMxiPlanString(), CONSTANTS.LITERAL_2635)
              == 0
          || compareChars(
                  methodIn.getHsrReqRequest().getHsrReqMxiPlanString(), CONSTANTS.LITERAL_2636)
              == 0
          || compareChars(
                  methodIn.getHsrReqRequest().getHsrReqMxiPlanString(), CONSTANTS.LITERAL_2637)
              == 0
          || compareChars(
                  methodIn.getHsrReqRequest().getHsrReqMxiPlanString(), CONSTANTS.LITERAL_2638)
              == 0
          || compareChars(
                  methodIn.getHsrReqRequest().getHsrReqMxiPlanString(), CONSTANTS.LITERAL_2639)
              == 0
          || compareChars(
                  methodIn.getHsrReqRequest().getHsrReqMxiPlanString(), CONSTANTS.LITERAL_2640)
              == 0
          || compareChars(
                  methodIn.getHsrReqRequest().getHsrReqMxiPlanString(), CONSTANTS.LITERAL_2641)
              == 0
          || compareChars(
                  methodIn.getHsrReqRequest().getHsrReqMxiPlanString(), CONSTANTS.LITERAL_2642)
              == 0
          || compareChars(
                  methodIn.getHsrReqRequest().getHsrReqMxiPlanString(), CONSTANTS.LITERAL_2643)
              == 0
          || compareChars(
                  methodIn.getHsrReqRequest().getHsrReqMxiPlanString(), CONSTANTS.LITERAL_2644)
              == 0
          || compareChars(
                  methodIn.getHsrReqRequest().getHsrReqMxiPlanString(), CONSTANTS.LITERAL_2645)
              == 0
          || compareChars(
                  methodIn.getHsrReqRequest().getHsrReqMxiPlanString(), CONSTANTS.LITERAL_2646)
              == 0
          || compareChars(
                  methodIn.getHsrReqRequest().getHsrReqMxiPlanString(), CONSTANTS.LITERAL_2647)
              == 0
          || compareChars(
                  methodIn.getHsrReqRequest().getHsrReqMxiPlanString(), CONSTANTS.LITERAL_2648)
              == 0
          || compareChars(
                  methodIn.getHsrReqRequest().getHsrReqMxiPlanString(), CONSTANTS.LITERAL_2649)
              == 0
          || compareChars(
                  methodIn.getHsrReqRequest().getHsrReqMxiPlanString(), CONSTANTS.LITERAL_2650)
              == 0
          || compareChars(
                  methodIn.getHsrReqRequest().getHsrReqMxiPlanString(), CONSTANTS.LITERAL_2651)
              == 0
          || compareChars(
                  methodIn.getHsrReqRequest().getHsrReqMxiPlanString(), CONSTANTS.LITERAL_2652)
              == 0
          || compareChars(
                  methodIn.getHsrReqRequest().getHsrReqMxiPlanString(), CONSTANTS.LITERAL_2653)
              == 0
          || compareChars(
                  methodIn.getHsrReqRequest().getHsrReqMxiPlanString(), CONSTANTS.LITERAL_2654)
              == 0
          || compareChars(
                  methodIn.getHsrReqRequest().getHsrReqMxiPlanString(), CONSTANTS.LITERAL_2655)
              == 0
          || compareChars(
                  methodIn.getHsrReqRequest().getHsrReqMxiPlanString(), CONSTANTS.LITERAL_2656)
              == 0
          || compareChars(
                  methodIn.getHsrReqRequest().getHsrReqMxiPlanString(), CONSTANTS.LITERAL_2657)
              == 0
          || compareChars(
                  methodIn.getHsrReqRequest().getHsrReqMxiPlanString(), CONSTANTS.LITERAL_2658)
              == 0
          || compareChars(
                  methodIn.getHsrReqRequest().getHsrReqMxiPlanString(), CONSTANTS.LITERAL_2659)
              == 0
          || compareChars(
                  methodIn.getHsrReqRequest().getHsrReqMxiPlanString(), CONSTANTS.LITERAL_2674)
              == 0
          || compareChars(
                  methodIn.getHsrReqRequest().getHsrReqMxiPlanString(), CONSTANTS.LITERAL_2675)
              == 0) {
        //  cobolCode::SET EMP-SET-169 TO TRUE
        methodOut.setEmpSet169True();
      }
      //  cobolCode::IF HSR-REQ-MXI-PLAN = '3618' OR '3619' OR '3620' OR '3621' OR '3622' OR '3623'
      // OR '3624' OR '3625' OR '3626' OR '3627' OR '3628' OR '3629' OR '3630' OR '3631' OR '3632'
      // OR '3633' OR '3634' OR '3635' OR '3636' OR '3637' OR '3638' OR '3639' OR '3640' OR '3641'
      // OR '3642' OR '3643' OR '3644' OR '3645' OR '3646' OR '3647' OR '3648' OR '3649' OR '3650'
      // OR '3651' OR '3652' OR '3653' OR '3654' OR '3655' OR '3656' OR '3657' OR '3658' OR '3659'
      // OR '3674' OR '3675'
      //  LITERAL_3675 = '3675'
      if (compareChars(methodIn.getHsrReqRequest().getHsrReqMxiPlanString(), CONSTANTS.LITERAL_3618)
              == 0
          || compareChars(
                  methodIn.getHsrReqRequest().getHsrReqMxiPlanString(), CONSTANTS.LITERAL_3619)
              == 0
          || compareChars(
                  methodIn.getHsrReqRequest().getHsrReqMxiPlanString(), CONSTANTS.LITERAL_3620)
              == 0
          || compareChars(
                  methodIn.getHsrReqRequest().getHsrReqMxiPlanString(), CONSTANTS.LITERAL_3621)
              == 0
          || compareChars(
                  methodIn.getHsrReqRequest().getHsrReqMxiPlanString(), CONSTANTS.LITERAL_3622)
              == 0
          || compareChars(
                  methodIn.getHsrReqRequest().getHsrReqMxiPlanString(), CONSTANTS.LITERAL_3623)
              == 0
          || compareChars(
                  methodIn.getHsrReqRequest().getHsrReqMxiPlanString(), CONSTANTS.LITERAL_3624)
              == 0
          || compareChars(
                  methodIn.getHsrReqRequest().getHsrReqMxiPlanString(), CONSTANTS.LITERAL_3625)
              == 0
          || compareChars(
                  methodIn.getHsrReqRequest().getHsrReqMxiPlanString(), CONSTANTS.LITERAL_3626)
              == 0
          || compareChars(
                  methodIn.getHsrReqRequest().getHsrReqMxiPlanString(), CONSTANTS.LITERAL_3627)
              == 0
          || compareChars(
                  methodIn.getHsrReqRequest().getHsrReqMxiPlanString(), CONSTANTS.LITERAL_3628)
              == 0
          || compareChars(
                  methodIn.getHsrReqRequest().getHsrReqMxiPlanString(), CONSTANTS.LITERAL_3629)
              == 0
          || compareChars(
                  methodIn.getHsrReqRequest().getHsrReqMxiPlanString(), CONSTANTS.LITERAL_3630)
              == 0
          || compareChars(
                  methodIn.getHsrReqRequest().getHsrReqMxiPlanString(), CONSTANTS.LITERAL_3631)
              == 0
          || compareChars(
                  methodIn.getHsrReqRequest().getHsrReqMxiPlanString(), CONSTANTS.LITERAL_3632)
              == 0
          || compareChars(
                  methodIn.getHsrReqRequest().getHsrReqMxiPlanString(), CONSTANTS.LITERAL_3633)
              == 0
          || compareChars(
                  methodIn.getHsrReqRequest().getHsrReqMxiPlanString(), CONSTANTS.LITERAL_3634)
              == 0
          || compareChars(
                  methodIn.getHsrReqRequest().getHsrReqMxiPlanString(), CONSTANTS.LITERAL_3635)
              == 0
          || compareChars(
                  methodIn.getHsrReqRequest().getHsrReqMxiPlanString(), CONSTANTS.LITERAL_3636)
              == 0
          || compareChars(
                  methodIn.getHsrReqRequest().getHsrReqMxiPlanString(), CONSTANTS.LITERAL_3637)
              == 0
          || compareChars(
                  methodIn.getHsrReqRequest().getHsrReqMxiPlanString(), CONSTANTS.LITERAL_3638)
              == 0
          || compareChars(
                  methodIn.getHsrReqRequest().getHsrReqMxiPlanString(), CONSTANTS.LITERAL_3639)
              == 0
          || compareChars(
                  methodIn.getHsrReqRequest().getHsrReqMxiPlanString(), CONSTANTS.LITERAL_3640)
              == 0
          || compareChars(
                  methodIn.getHsrReqRequest().getHsrReqMxiPlanString(), CONSTANTS.LITERAL_3641)
              == 0
          || compareChars(
                  methodIn.getHsrReqRequest().getHsrReqMxiPlanString(), CONSTANTS.LITERAL_3642)
              == 0
          || compareChars(
                  methodIn.getHsrReqRequest().getHsrReqMxiPlanString(), CONSTANTS.LITERAL_3643)
              == 0
          || compareChars(
                  methodIn.getHsrReqRequest().getHsrReqMxiPlanString(), CONSTANTS.LITERAL_3644)
              == 0
          || compareChars(
                  methodIn.getHsrReqRequest().getHsrReqMxiPlanString(), CONSTANTS.LITERAL_3645)
              == 0
          || compareChars(
                  methodIn.getHsrReqRequest().getHsrReqMxiPlanString(), CONSTANTS.LITERAL_3646)
              == 0
          || compareChars(
                  methodIn.getHsrReqRequest().getHsrReqMxiPlanString(), CONSTANTS.LITERAL_3647)
              == 0
          || compareChars(
                  methodIn.getHsrReqRequest().getHsrReqMxiPlanString(), CONSTANTS.LITERAL_3648)
              == 0
          || compareChars(
                  methodIn.getHsrReqRequest().getHsrReqMxiPlanString(), CONSTANTS.LITERAL_3649)
              == 0
          || compareChars(
                  methodIn.getHsrReqRequest().getHsrReqMxiPlanString(), CONSTANTS.LITERAL_3650)
              == 0
          || compareChars(
                  methodIn.getHsrReqRequest().getHsrReqMxiPlanString(), CONSTANTS.LITERAL_3651)
              == 0
          || compareChars(
                  methodIn.getHsrReqRequest().getHsrReqMxiPlanString(), CONSTANTS.LITERAL_3652)
              == 0
          || compareChars(
                  methodIn.getHsrReqRequest().getHsrReqMxiPlanString(), CONSTANTS.LITERAL_3653)
              == 0
          || compareChars(
                  methodIn.getHsrReqRequest().getHsrReqMxiPlanString(), CONSTANTS.LITERAL_3654)
              == 0
          || compareChars(
                  methodIn.getHsrReqRequest().getHsrReqMxiPlanString(), CONSTANTS.LITERAL_3655)
              == 0
          || compareChars(
                  methodIn.getHsrReqRequest().getHsrReqMxiPlanString(), CONSTANTS.LITERAL_3656)
              == 0
          || compareChars(
                  methodIn.getHsrReqRequest().getHsrReqMxiPlanString(), CONSTANTS.LITERAL_3657)
              == 0
          || compareChars(
                  methodIn.getHsrReqRequest().getHsrReqMxiPlanString(), CONSTANTS.LITERAL_3658)
              == 0
          || compareChars(
                  methodIn.getHsrReqRequest().getHsrReqMxiPlanString(), CONSTANTS.LITERAL_3659)
              == 0
          || compareChars(
                  methodIn.getHsrReqRequest().getHsrReqMxiPlanString(), CONSTANTS.LITERAL_3674)
              == 0
          || compareChars(
                  methodIn.getHsrReqRequest().getHsrReqMxiPlanString(), CONSTANTS.LITERAL_3675)
              == 0) {
        //  cobolCode::SET EMP-SET-170 TO TRUE
        methodOut.setEmpSet170True();
      }
      //  cobolCode::IF HSR-REQ-MXI-PLAN = '0664'
      //  LITERAL_0664 = '0664'
      if (compareChars(methodIn.getHsrReqRequest().getHsrReqMxiPlanString(), CONSTANTS.LITERAL_0664)
          == 0) {
        //  cobolCode::SET EMP-SET-171 TO TRUE
        methodOut.setEmpSet171True();
      }
      //  cobolCode::IF HSR-REQ-MXI-PLAN = '1664'
      //  LITERAL_1664 = '1664'
      if (compareChars(methodIn.getHsrReqRequest().getHsrReqMxiPlanString(), CONSTANTS.LITERAL_1664)
          == 0) {
        //  cobolCode::SET EMP-SET-172 TO TRUE
        methodOut.setEmpSet172True();
      }
      //  cobolCode::IF HSR-REQ-MXI-PLAN = '0679'
      //  LITERAL_0679 = '0679'
      if (compareChars(methodIn.getHsrReqRequest().getHsrReqMxiPlanString(), CONSTANTS.LITERAL_0679)
          == 0) {
        //  cobolCode::SET EMP-SET-195 TO TRUE
        methodOut.setEmpSet195True();
      }
      //  cobolCode::IF HSR-REQ-MXI-PLAN = '1679'
      //  LITERAL_1679 = '1679'
      if (compareChars(methodIn.getHsrReqRequest().getHsrReqMxiPlanString(), CONSTANTS.LITERAL_1679)
          == 0) {
        //  cobolCode::SET EMP-SET-196 TO TRUE
        methodOut.setEmpSet196True();
      }
      //  cobolCode::IF HSR-REQ-MXI-PLAN = '2679'
      //  LITERAL_2679 = '2679'
      if (compareChars(methodIn.getHsrReqRequest().getHsrReqMxiPlanString(), CONSTANTS.LITERAL_2679)
          == 0) {
        //  cobolCode::SET EMP-SET-197 TO TRUE
        methodOut.setEmpSet197True();
      }
      //  cobolCode::IF HSR-REQ-MXI-PLAN = '3679'
      //  LITERAL_3679 = '3679'
      if (compareChars(methodIn.getHsrReqRequest().getHsrReqMxiPlanString(), CONSTANTS.LITERAL_3679)
          == 0) {
        //  cobolCode::SET EMP-SET-198 TO TRUE
        methodOut.setEmpSet198True();
      }
      //  cobolCode::IF HSR-REQ-MXI-PLAN = '0680'
      //  LITERAL_0680 = '0680'
      if (compareChars(methodIn.getHsrReqRequest().getHsrReqMxiPlanString(), CONSTANTS.LITERAL_0680)
          == 0) {
        //  cobolCode::SET EMP-SET-199 TO TRUE
        methodOut.setEmpSet199True();
      }
      //  cobolCode::IF HSR-REQ-MXI-PLAN = '1680'
      //  LITERAL_1680 = '1680'
      if (compareChars(methodIn.getHsrReqRequest().getHsrReqMxiPlanString(), CONSTANTS.LITERAL_1680)
          == 0) {
        //  cobolCode::SET EMP-SET-200 TO TRUE
        methodOut.setEmpSet200True();
      }
      //  cobolCode::IF HSR-REQ-MXI-PLAN = '2680'
      //  LITERAL_2680 = '2680'
      if (compareChars(methodIn.getHsrReqRequest().getHsrReqMxiPlanString(), CONSTANTS.LITERAL_2680)
          == 0) {
        //  cobolCode::SET EMP-SET-201 TO TRUE
        methodOut.setEmpSet201True();
      }
      //  cobolCode::IF HSR-REQ-MXI-PLAN = '3680'
      //  LITERAL_3680 = '3680'
      if (compareChars(methodIn.getHsrReqRequest().getHsrReqMxiPlanString(), CONSTANTS.LITERAL_3680)
          == 0) {
        //  cobolCode::SET EMP-SET-202 TO TRUE
        methodOut.setEmpSet202True();
      }
      //  cobolCode::IF HSR-REQ-MXI-PLAN = '0681' OR '0682'
      //  LITERAL_0682 = '0682'
      if (compareChars(methodIn.getHsrReqRequest().getHsrReqMxiPlanString(), CONSTANTS.LITERAL_0681)
              == 0
          || compareChars(
                  methodIn.getHsrReqRequest().getHsrReqMxiPlanString(), CONSTANTS.LITERAL_0682)
              == 0) {
        //  cobolCode::SET EMP-SET-203 TO TRUE
        methodOut.setEmpSet203True();
      }
      //  cobolCode::IF HSR-REQ-MXI-PLAN = '1681' OR '1682'
      //  LITERAL_1682 = '1682'
      if (compareChars(methodIn.getHsrReqRequest().getHsrReqMxiPlanString(), CONSTANTS.LITERAL_1681)
              == 0
          || compareChars(
                  methodIn.getHsrReqRequest().getHsrReqMxiPlanString(), CONSTANTS.LITERAL_1682)
              == 0) {
        //  cobolCode::SET EMP-SET-204 TO TRUE
        methodOut.setEmpSet204True();
      }
      //  cobolCode::IF HSR-REQ-MXI-PLAN = '2681' OR '2682'
      //  LITERAL_2682 = '2682'
      if (compareChars(methodIn.getHsrReqRequest().getHsrReqMxiPlanString(), CONSTANTS.LITERAL_2681)
              == 0
          || compareChars(
                  methodIn.getHsrReqRequest().getHsrReqMxiPlanString(), CONSTANTS.LITERAL_2682)
              == 0) {
        //  cobolCode::SET EMP-SET-205 TO TRUE
        methodOut.setEmpSet205True();
      }
      //  cobolCode::IF HSR-REQ-MXI-PLAN = '3681' OR '3682'
      //  LITERAL_3682 = '3682'
      if (compareChars(methodIn.getHsrReqRequest().getHsrReqMxiPlanString(), CONSTANTS.LITERAL_3681)
              == 0
          || compareChars(
                  methodIn.getHsrReqRequest().getHsrReqMxiPlanString(), CONSTANTS.LITERAL_3682)
              == 0) {
        //  cobolCode::SET EMP-SET-206 TO TRUE
        methodOut.setEmpSet206True();
      }
      //  cobolCode::IF HSR-REQ-MXI-PLAN = '0683' OR '0684'
      //  LITERAL_0684 = '0684'
      if (compareChars(methodIn.getHsrReqRequest().getHsrReqMxiPlanString(), CONSTANTS.LITERAL_0683)
              == 0
          || compareChars(
                  methodIn.getHsrReqRequest().getHsrReqMxiPlanString(), CONSTANTS.LITERAL_0684)
              == 0) {
        //  cobolCode::SET EMP-SET-211 TO TRUE
        methodOut.setEmpSet211True();
      }
      //  cobolCode::IF HSR-REQ-MXI-PLAN = '1683' OR '1684'
      //  LITERAL_1684 = '1684'
      if (compareChars(methodIn.getHsrReqRequest().getHsrReqMxiPlanString(), CONSTANTS.LITERAL_1683)
              == 0
          || compareChars(
                  methodIn.getHsrReqRequest().getHsrReqMxiPlanString(), CONSTANTS.LITERAL_1684)
              == 0) {
        //  cobolCode::SET EMP-SET-212 TO TRUE
        methodOut.setEmpSet212True();
      }
      //  cobolCode::IF HSR-REQ-MXI-PLAN = '2683' OR '2684'
      //  LITERAL_2684 = '2684'
      if (compareChars(methodIn.getHsrReqRequest().getHsrReqMxiPlanString(), CONSTANTS.LITERAL_2683)
              == 0
          || compareChars(
                  methodIn.getHsrReqRequest().getHsrReqMxiPlanString(), CONSTANTS.LITERAL_2684)
              == 0) {
        //  cobolCode::SET EMP-SET-213 TO TRUE
        methodOut.setEmpSet213True();
      }
      //  cobolCode::IF HSR-REQ-MXI-PLAN = '3683' OR '3684'
      //  LITERAL_3684 = '3684'
      if (compareChars(methodIn.getHsrReqRequest().getHsrReqMxiPlanString(), CONSTANTS.LITERAL_3683)
              == 0
          || compareChars(
                  methodIn.getHsrReqRequest().getHsrReqMxiPlanString(), CONSTANTS.LITERAL_3684)
              == 0) {
        //  cobolCode::SET EMP-SET-214 TO TRUE
        methodOut.setEmpSet214True();
      }
      //  cobolCode::IF HSR-REQ-MXI-PLAN = '0685' OR '0686' OR '0689'
      //  LITERAL_0689 = '0689'
      if (compareChars(methodIn.getHsrReqRequest().getHsrReqMxiPlanString(), CONSTANTS.LITERAL_0685)
              == 0
          || compareChars(
                  methodIn.getHsrReqRequest().getHsrReqMxiPlanString(), CONSTANTS.LITERAL_0686)
              == 0
          || compareChars(
                  methodIn.getHsrReqRequest().getHsrReqMxiPlanString(), CONSTANTS.LITERAL_0689)
              == 0) {
        //  cobolCode::SET EMP-SET-247 TO TRUE
        methodOut.setEmpSet247True();
      }
      //  cobolCode::IF HSR-REQ-MXI-PLAN = '1685' OR '1686' OR '1689'
      //  LITERAL_1689 = '1689'
      if (compareChars(methodIn.getHsrReqRequest().getHsrReqMxiPlanString(), CONSTANTS.LITERAL_1685)
              == 0
          || compareChars(
                  methodIn.getHsrReqRequest().getHsrReqMxiPlanString(), CONSTANTS.LITERAL_1686)
              == 0
          || compareChars(
                  methodIn.getHsrReqRequest().getHsrReqMxiPlanString(), CONSTANTS.LITERAL_1689)
              == 0) {
        //  cobolCode::SET EMP-SET-248 TO TRUE
        methodOut.setEmpSet248True();
      }
      //  cobolCode::IF HSR-REQ-MXI-PLAN = '0687' OR '0688' OR '0690' OR '0692'
      //  LITERAL_0692 = '0692'
      if (compareChars(methodIn.getHsrReqRequest().getHsrReqMxiPlanString(), CONSTANTS.LITERAL_0687)
              == 0
          || compareChars(
                  methodIn.getHsrReqRequest().getHsrReqMxiPlanString(), CONSTANTS.LITERAL_0688)
              == 0
          || compareChars(
                  methodIn.getHsrReqRequest().getHsrReqMxiPlanString(), CONSTANTS.LITERAL_0690)
              == 0
          || compareChars(
                  methodIn.getHsrReqRequest().getHsrReqMxiPlanString(), CONSTANTS.LITERAL_0692)
              == 0) {
        //  cobolCode::SET EMP-SET-249 TO TRUE
        methodOut.setEmpSet249True();
      }
      //  cobolCode::IF HSR-REQ-MXI-PLAN = '1687' OR '1688' OR '1690'
      //  LITERAL_1690 = '1690'
      if (compareChars(methodIn.getHsrReqRequest().getHsrReqMxiPlanString(), CONSTANTS.LITERAL_1687)
              == 0
          || compareChars(
                  methodIn.getHsrReqRequest().getHsrReqMxiPlanString(), CONSTANTS.LITERAL_1688)
              == 0
          || compareChars(
                  methodIn.getHsrReqRequest().getHsrReqMxiPlanString(), CONSTANTS.LITERAL_1690)
              == 0) {
        //  cobolCode::SET EMP-SET-250 TO TRUE
        methodOut.setEmpSet250True();
      }
      //  cobolCode::IF HSR-REQ-MXI-PLAN = '0691'
      //  LITERAL_0691 = '0691'
      if (compareChars(methodIn.getHsrReqRequest().getHsrReqMxiPlanString(), CONSTANTS.LITERAL_0691)
          == 0) {
        //  cobolCode::SET EMP-SET-251 TO TRUE
        methodOut.setEmpSet251True();
      }
      //  cobolCode::IF HSR-REQ-MXI-PLAN = '0693'
      //  LITERAL_0693 = '0693'
      if (compareChars(methodIn.getHsrReqRequest().getHsrReqMxiPlanString(), CONSTANTS.LITERAL_0693)
          == 0) {
        //  cobolCode::SET EMP-SET-259 TO TRUE
        methodOut.setEmpSet259True();
      }
      //  cobolCode::IF HSR-REQ-MXI-PLAN = '1693'
      //  LITERAL_1693 = '1693'
      if (compareChars(methodIn.getHsrReqRequest().getHsrReqMxiPlanString(), CONSTANTS.LITERAL_1693)
          == 0) {
        //  cobolCode::SET EMP-SET-260 TO TRUE
        methodOut.setEmpSet260True();
      }
      //  cobolCode::IF HSR-REQ-MXI-PLAN = '0694'
      //  LITERAL_0694 = '0694'
      if (compareChars(methodIn.getHsrReqRequest().getHsrReqMxiPlanString(), CONSTANTS.LITERAL_0694)
          == 0) {
        //  cobolCode::SET EMP-SET-261 TO TRUE
        methodOut.setEmpSet261True();
      }
      //  cobolCode::IF HSR-REQ-MXI-PLAN = '1694'
      //  LITERAL_1694 = '1694'
      if (compareChars(methodIn.getHsrReqRequest().getHsrReqMxiPlanString(), CONSTANTS.LITERAL_1694)
          == 0) {
        //  cobolCode::SET EMP-SET-262 TO TRUE
        methodOut.setEmpSet262True();
      }
      //  cobolCode::IF HSR-REQ-MXI-PLAN = '0695'
      //  LITERAL_0695 = '0695'
      if (compareChars(methodIn.getHsrReqRequest().getHsrReqMxiPlanString(), CONSTANTS.LITERAL_0695)
          == 0) {
        //  cobolCode::SET EMP-SET-263 TO TRUE
        methodOut.setEmpSet263True();
      }
      //  cobolCode::IF HSR-REQ-MXI-PLAN = '1695'
      //  LITERAL_1695 = '1695'
      if (compareChars(methodIn.getHsrReqRequest().getHsrReqMxiPlanString(), CONSTANTS.LITERAL_1695)
          == 0) {
        //  cobolCode::SET EMP-SET-264 TO TRUE
        methodOut.setEmpSet264True();
      }
      //  cobolCode::IF HSR-REQ-MXI-PLAN = '0696'
      //  LITERAL_0696 = '0696'
      if (compareChars(methodIn.getHsrReqRequest().getHsrReqMxiPlanString(), CONSTANTS.LITERAL_0696)
          == 0) {
        //  cobolCode::SET EMP-SET-265 TO TRUE
        methodOut.setEmpSet265True();
      }
      //  cobolCode::IF HSR-REQ-MXI-PLAN = '1696'
      //  LITERAL_1696 = '1696'
      if (compareChars(methodIn.getHsrReqRequest().getHsrReqMxiPlanString(), CONSTANTS.LITERAL_1696)
          == 0) {
        //  cobolCode::SET EMP-SET-266 TO TRUE
        methodOut.setEmpSet266True();
      }
      //  cobolCode::IF HSR-REQ-MXI-PLAN = '0697'
      //  LITERAL_0697 = '0697'
      if (compareChars(methodIn.getHsrReqRequest().getHsrReqMxiPlanString(), CONSTANTS.LITERAL_0697)
          == 0) {
        //  cobolCode::SET EMP-SET-267 TO TRUE
        methodOut.setEmpSet267True();
      }
      //  cobolCode::IF HSR-REQ-MXI-PLAN = '1697'
      //  LITERAL_1697 = '1697'
      if (compareChars(methodIn.getHsrReqRequest().getHsrReqMxiPlanString(), CONSTANTS.LITERAL_1697)
          == 0) {
        //  cobolCode::SET EMP-SET-268 TO TRUE
        methodOut.setEmpSet268True();
      }
      //  cobolCode::IF HSR-REQ-MXI-PLAN = '0698'
      //  LITERAL_0698 = '0698'
      if (compareChars(methodIn.getHsrReqRequest().getHsrReqMxiPlanString(), CONSTANTS.LITERAL_0698)
          == 0) {
        //  cobolCode::SET EMP-SET-269 TO TRUE
        methodOut.setEmpSet269True();
      }
      //  cobolCode::IF HSR-REQ-MXI-PLAN = '1698'
      //  LITERAL_1698 = '1698'
      if (compareChars(methodIn.getHsrReqRequest().getHsrReqMxiPlanString(), CONSTANTS.LITERAL_1698)
          == 0) {
        //  cobolCode::SET EMP-SET-270 TO TRUE
        methodOut.setEmpSet270True();
      }
      //  cobolCode::IF HSR-REQ-MXI-PLAN = '0699'
      //  LITERAL_0699 = '0699'
      if (compareChars(methodIn.getHsrReqRequest().getHsrReqMxiPlanString(), CONSTANTS.LITERAL_0699)
          == 0) {
        //  cobolCode::SET EMP-SET-298 TO TRUE
        methodOut.setEmpSet298True();
      }
      //  cobolCode::IF HSR-REQ-MXI-PLAN = '1699'
      //  LITERAL_1699 = '1699'
      if (compareChars(methodIn.getHsrReqRequest().getHsrReqMxiPlanString(), CONSTANTS.LITERAL_1699)
          == 0) {
        //  cobolCode::SET EMP-SET-299 TO TRUE
        methodOut.setEmpSet299True();
      }
      //  cobolCode::IF HSR-REQ-MXI-PLAN = '0700'
      //  LITERAL_0700 = '0700'
      if (compareChars(methodIn.getHsrReqRequest().getHsrReqMxiPlanString(), CONSTANTS.LITERAL_0700)
          == 0) {
        //  cobolCode::SET EMP-SET-300 TO TRUE
        methodOut.setEmpSet300True();
      }
      //  cobolCode::IF HSR-REQ-MXI-PLAN = '1700'
      //  LITERAL_1700 = '1700'
      if (compareChars(methodIn.getHsrReqRequest().getHsrReqMxiPlanString(), CONSTANTS.LITERAL_1700)
          == 0) {
        //  cobolCode::SET EMP-SET-301 TO TRUE
        methodOut.setEmpSet301True();
      }
      //  cobolCode::IF HSR-REQ-MXI-PLAN = '0701'
      //  LITERAL_0701 = '0701'
      if (compareChars(methodIn.getHsrReqRequest().getHsrReqMxiPlanString(), CONSTANTS.LITERAL_0701)
          == 0) {
        //  cobolCode::SET EMP-SET-302 TO TRUE
        methodOut.setEmpSet302True();
      }
      //  cobolCode::IF HSR-REQ-MXI-PLAN = '1701'
      //  LITERAL_1701 = '1701'
      if (compareChars(methodIn.getHsrReqRequest().getHsrReqMxiPlanString(), CONSTANTS.LITERAL_1701)
          == 0) {
        //  cobolCode::SET EMP-SET-303 TO TRUE
        methodOut.setEmpSet303True();
      }
      //  cobolCode::IF HSR-REQ-MXI-PLAN = '0702'
      //  LITERAL_0702 = '0702'
      if (compareChars(methodIn.getHsrReqRequest().getHsrReqMxiPlanString(), CONSTANTS.LITERAL_0702)
          == 0) {
        //  cobolCode::SET EMP-SET-304 TO TRUE
        methodOut.setEmpSet304True();
      }
      //  cobolCode::IF HSR-REQ-MXI-PLAN = '1702'
      //  LITERAL_1702 = '1702'
      if (compareChars(methodIn.getHsrReqRequest().getHsrReqMxiPlanString(), CONSTANTS.LITERAL_1702)
          == 0) {
        //  cobolCode::SET EMP-SET-305 TO TRUE
        methodOut.setEmpSet305True();
      }
      //  cobolCode::IF HSR-REQ-MXI-PLAN = '0703'
      //  LITERAL_0703 = '0703'
      if (compareChars(methodIn.getHsrReqRequest().getHsrReqMxiPlanString(), CONSTANTS.LITERAL_0703)
          == 0) {
        //  cobolCode::SET EMP-SET-306 TO TRUE
        methodOut.setEmpSet306True();
      }
      //  cobolCode::IF HSR-REQ-MXI-PLAN = '1703'
      //  LITERAL_1703 = '1703'
      if (compareChars(methodIn.getHsrReqRequest().getHsrReqMxiPlanString(), CONSTANTS.LITERAL_1703)
          == 0) {
        //  cobolCode::SET EMP-SET-307 TO TRUE
        methodOut.setEmpSet307True();
      }
      //  cobolCode::IF HSR-REQ-MXI-PLAN = '0704'
      //  LITERAL_0704 = '0704'
      if (compareChars(methodIn.getHsrReqRequest().getHsrReqMxiPlanString(), CONSTANTS.LITERAL_0704)
          == 0) {
        //  cobolCode::SET EMP-SET-308 TO TRUE
        methodOut.setEmpSet308True();
      }
      //  cobolCode::IF HSR-REQ-MXI-PLAN = '0705'
      //  LITERAL_0705 = '0705'
      if (compareChars(methodIn.getHsrReqRequest().getHsrReqMxiPlanString(), CONSTANTS.LITERAL_0705)
          == 0) {
        //  cobolCode::SET EMP-SET-309 TO TRUE
        methodOut.setEmpSet309True();
      }
      //  cobolCode::IF HSR-REQ-MXI-PLAN = '0706'
      //  LITERAL_0706 = '0706'
      if (compareChars(methodIn.getHsrReqRequest().getHsrReqMxiPlanString(), CONSTANTS.LITERAL_0706)
          == 0) {
        //  cobolCode::SET EMP-SET-310 TO TRUE
        methodOut.setEmpSet310True();
      }
      //  cobolCode::IF HSR-REQ-MXI-PLAN = '0707'
      //  LITERAL_0707 = '0707'
      if (compareChars(methodIn.getHsrReqRequest().getHsrReqMxiPlanString(), CONSTANTS.LITERAL_0707)
          == 0) {
        //  cobolCode::SET EMP-SET-311 TO TRUE
        methodOut.setEmpSet311True();
      }
      //  cobolCode::IF HSR-REQ-MXI-PLAN = '0708'
      //  LITERAL_0708 = '0708'
      if (compareChars(methodIn.getHsrReqRequest().getHsrReqMxiPlanString(), CONSTANTS.LITERAL_0708)
          == 0) {
        //  cobolCode::SET EMP-SET-312 TO TRUE
        methodOut.setEmpSet312True();
      }
      //  cobolCode::IF HSR-REQ-MXI-PLAN = '4300'
      //  LITERAL_4300 = '4300'
      if (compareChars(methodIn.getHsrReqRequest().getHsrReqMxiPlanString(), CONSTANTS.LITERAL_4300)
          == 0) {
        //  cobolCode::SET EMP-SET-328 TO TRUE
        methodOut.setEmpSet328True();
      }
      //  cobolCode::IF HSR-REQ-MXI-PLAN = '4500'
      //  LITERAL_4500 = '4500'
      if (compareChars(methodIn.getHsrReqRequest().getHsrReqMxiPlanString(), CONSTANTS.LITERAL_4500)
          == 0) {
        //  cobolCode::SET EMP-SET-329 TO TRUE
        methodOut.setEmpSet329True();
      }
      //  cobolCode::IF HSR-REQ-MXI-PLAN = '4301'
      //  LITERAL_4301 = '4301'
      if (compareChars(methodIn.getHsrReqRequest().getHsrReqMxiPlanString(), CONSTANTS.LITERAL_4301)
          == 0) {
        //  cobolCode::SET EMP-SET-330 TO TRUE
        methodOut.setEmpSet330True();
      }
      //  cobolCode::IF HSR-REQ-MXI-PLAN = '4501'
      //  LITERAL_4501 = '4501'
      if (compareChars(methodIn.getHsrReqRequest().getHsrReqMxiPlanString(), CONSTANTS.LITERAL_4501)
          == 0) {
        //  cobolCode::SET EMP-SET-331 TO TRUE
        methodOut.setEmpSet331True();
      }
      //  cobolCode::IF HSR-REQ-MXI-PLAN = '8400' OR '8401' OR '8402'
      //  LITERAL_8402 = '8402'
      if (compareChars(methodIn.getHsrReqRequest().getHsrReqMxiPlanString(), CONSTANTS.LITERAL_8400)
              == 0
          || compareChars(
                  methodIn.getHsrReqRequest().getHsrReqMxiPlanString(), CONSTANTS.LITERAL_8401)
              == 0
          || compareChars(
                  methodIn.getHsrReqRequest().getHsrReqMxiPlanString(), CONSTANTS.LITERAL_8402)
              == 0) {
        //  cobolCode::SET EMP-SET-338 TO TRUE
        methodOut.setEmpSet338True();
      }
      //  cobolCode::IF HSR-REQ-MXI-PLAN = '8500' OR '8501'
      //  LITERAL_8501 = '8501'
      if (compareChars(methodIn.getHsrReqRequest().getHsrReqMxiPlanString(), CONSTANTS.LITERAL_8500)
              == 0
          || compareChars(
                  methodIn.getHsrReqRequest().getHsrReqMxiPlanString(), CONSTANTS.LITERAL_8501)
              == 0) {
        //  cobolCode::SET EMP-SET-339 TO TRUE
        methodOut.setEmpSet339True();
      }
      //  cobolCode::IF HSR-REQ-MXI-PLAN = '8406' OR '8409'
      //  LITERAL_8409 = '8409'
      if (compareChars(methodIn.getHsrReqRequest().getHsrReqMxiPlanString(), CONSTANTS.LITERAL_8406)
              == 0
          || compareChars(
                  methodIn.getHsrReqRequest().getHsrReqMxiPlanString(), CONSTANTS.LITERAL_8409)
              == 0) {
        //  cobolCode::SET EMP-SET-340 TO TRUE
        methodOut.setEmpSet340True();
      }
      //  cobolCode::IF HSR-REQ-MXI-PLAN = '8506' OR '8509'
      //  LITERAL_8509 = '8509'
      if (compareChars(methodIn.getHsrReqRequest().getHsrReqMxiPlanString(), CONSTANTS.LITERAL_8506)
              == 0
          || compareChars(
                  methodIn.getHsrReqRequest().getHsrReqMxiPlanString(), CONSTANTS.LITERAL_8509)
              == 0) {
        //  cobolCode::SET EMP-SET-341 TO TRUE
        methodOut.setEmpSet341True();
      }
      //  cobolCode::IF HSR-REQ-MXI-PLAN = '8410'
      //  LITERAL_8410 = '8410'
      if (compareChars(methodIn.getHsrReqRequest().getHsrReqMxiPlanString(), CONSTANTS.LITERAL_8410)
          == 0) {
        //  cobolCode::SET EMP-SET-342 TO TRUE
        methodOut.setEmpSet342True();
      }
      //  cobolCode::IF HSR-REQ-MXI-PLAN = '8510'
      //  LITERAL_8510 = '8510'
      if (compareChars(methodIn.getHsrReqRequest().getHsrReqMxiPlanString(), CONSTANTS.LITERAL_8510)
          == 0) {
        //  cobolCode::SET EMP-SET-343 TO TRUE
        methodOut.setEmpSet343True();
      }
      //  cobolCode::IF HSR-REQ-MXI-PLAN = '8411' OR '8412'
      //  LITERAL_8412 = '8412'
      if (compareChars(methodIn.getHsrReqRequest().getHsrReqMxiPlanString(), CONSTANTS.LITERAL_8411)
              == 0
          || compareChars(
                  methodIn.getHsrReqRequest().getHsrReqMxiPlanString(), CONSTANTS.LITERAL_8412)
              == 0) {
        //  cobolCode::SET EMP-SET-344 TO TRUE
        methodOut.setEmpSet344True();
      }
      //  cobolCode::IF HSR-REQ-MXI-PLAN = '8511'
      //  LITERAL_8511 = '8511'
      if (compareChars(methodIn.getHsrReqRequest().getHsrReqMxiPlanString(), CONSTANTS.LITERAL_8511)
          == 0) {
        //  cobolCode::SET EMP-SET-345 TO TRUE
        methodOut.setEmpSet345True();
      }
    }

    return methodOut;
  }
  /**
   * getStorage This method is derived from COBOL Paragraph - 2100-GET-STORAGE SECTION COBOL
   * Cyclomatic complexity - 1 Input :
   *
   * <p>- adaAcqDataArea COBOL Name: ADA-ACQ-DATA-AREA - panValet COBOL Name: PAN-VALET
   *
   * <p>Output :
   *
   * <p>- wvAdaFlength COBOL Name: WV-ADA-FLENGTH - hsrReturnArea COBOL Name: HSR-RETURN-AREA -
   * hsrRetGetmainCreator COBOL Name: HSR-RET-GETMAIN-CREATOR - panValet COBOL Name: PAN-VALET -
   * hsrRetGetmainCopybook COBOL Name: HSR-RET-GETMAIN-COPYBOOK
   *
   * @throws CFException
   */
  @Override
  public GetStorageOutCtx getStorage(GetStorageInCtx methodIn) throws Exception {

    // *81***************************************************************
    // *81 2100-Get-storage                                             *
    // *81--------------------------------------------------------------*
    // *81 business function:acquire storage for hsr-return-data        *
    // *81                                                              *
    // *81***************************************************************
    // *82***************************************************************
    // *82 called by : 0000-main-line                                   *
    // *82                                                              *
    // *82 calls     : acquire-data-area-9961                           *
    // *82***************************************************************

    // *    Acquire storage for hsr return area
    // Added variable to get the program context in place.
    Bbhsr002Ctx programCtx = methodIn.getBbhsr002Ctx();
    // Added variable to get the output context in place.
    GetStorageOutCtx methodOut = methodIn.getGetStorageOutCtx();
    //  cobolCode::MOVE LENGTH OF HSR-RETURN-AREA TO WV-ADA-FLENGTH
    methodOut.setWvAdaFlength(HsrReturnArea.getHsrReturnAreaFieldLength());
    //  cobolCode::PERFORM ACQUIRE-DATA-AREA-9961
    acquireDataArea9961(
        programCtx.getAcquireDataArea9961InCtx()); /*ACQUIRE-DATA-AREA-9961 SECTION*/
    //  cobolCode::SET ADDRESS OF HSR-RETURN-AREA TO ADDRESS OF ADA-ACQ-DATA-AREA
    methodOut.getHsrReturnArea().set(methodIn.getAdaAcqDataAreaGroup());

    //  cobolCode::INITIALIZE HSR-RETURN-AREA
    methodOut.getHsrReturnArea().initialize();
    //  cobolCode::MOVE PAN-VALET TO HSR-RET-GETMAIN-CREATOR
    methodOut.setHsrRetGetmainCreator(methodOut.getPanValet());
    //  cobolCode::SET HSR-RET-GETMAIN-VYHSRRET TO TRUE
    methodOut.setHsrRetGetmainVyhsrretTrue();

    return methodOut;
  }
  /**
   * hsrProcessing This method is derived from COBOL Paragraph - 3000-HSR-PROCESSING SECTION COBOL
   * Cyclomatic complexity - 3 Input :
   *
   * <p>- hsrReqContractRtnCd COBOL Name: HSR-REQ-CONTRACT-RTN-CD
   *
   * <p>Output : None
   *
   * @throws CFException
   */
  @Override
  public void hsrProcessing(HsrProcessingInCtx methodIn) throws Exception {

    // *82 Calls     : 3100-load-hipaa-codes                            *
    // *82           : 3200-get-policy-info.                            *
    // *82           : 3300-determine-n-o-svc-ind.                      *
    // *82                                                              *
    // *82***************************************************************
    // Added variable to get the program context in place.
    Bbhsr002Ctx programCtx = methodIn.getBbhsr002Ctx();
    //  cobolCode::PERFORM 3100-LOAD-HIPAA-CODES
    loadHipaaCodes(programCtx.getLoadHipaaCodesInCtx()); /*3100-LOAD-HIPAA-CODES SECTION*/
    //  cobolCode::IF HSR-REQ-CONTRCT-FAIL-C-FUNC-RC
    if (methodIn.isHsrReqContrctFailCFuncRc()) {
      // cobolCode::GO TO 3000-EXIT
      return;
      // cobolCodeEnds::GO TO 3000-EXIT
    }
    //  cobolCode::PERFORM 3200-GET-POLICY-INFO
    getPolicyInfo(programCtx.getGetPolicyInfoInCtx()); /*3200-GET-POLICY-INFO SECTION*/
    //  cobolCode::IF HSR-REQ-CONTRCT-FAIL-C-FUNC-RC
    if (methodIn.isHsrReqContrctFailCFuncRc()) {
      // cobolCode::GO TO 3000-EXIT
      return;
      // cobolCodeEnds::GO TO 3000-EXIT
    }
    //  cobolCode::PERFORM 3300-DETERMINE-N-O-SVC-IND
    determineNOSvcInd(
        programCtx.getDetermineNOSvcIndInCtx()); /*3300-DETERMINE-N-O-SVC-IND SECTION*/
  }
  /**
   * loadHipaaCodes This method is derived from COBOL Paragraph - 3100-LOAD-HIPAA-CODES SECTION
   * COBOL Cyclomatic complexity - 24 Input :
   *
   * <p>- hsrReqHipaaServTypCd COBOL Name: HSR-REQ-HIPAA-SERV-TYP-CD - hsrReqVersionNo COBOL Name:
   * HSR-REQ-VERSION-NO - versionNo COBOL Name: WS-VERSION-NO - panValet COBOL Name: PAN-VALET -
   * reqAddress4Ptr COBOL Name: REQ-ADDRESS-4-PTR - reqAddress4Length COBOL Name:
   * REQ-ADDRESS-4-LENGTH - sub1 COBOL Name: WS-SUB1 - reqHipaaCdItem COBOL Name:
   * WS-REQ-HIPAA-CD-ITEM - dsmReturnCode COBOL Name: DSM-RETURN-CODE - dsmSqlcode COBOL Name:
   * DSM-SQLCODE - dsmErrSectnName COBOL Name: DSM-ERR-SECTN-NAME - hpcRetCnt COBOL Name:
   * HPC-RET-CNT - hpcRetHipaaCd COBOL Name: HPC-RET-HIPAA-CD - hpcRetGrnrcRqstCd COBOL Name:
   * HPC-RET-GRNRC-RQST-CD
   *
   * <p>Output :
   *
   * <p>- hpcReqHipaaCd COBOL Name: HPC-REQ-HIPAA-CD - hsrReqHipaaServTypCd COBOL Name:
   * HSR-REQ-HIPAA-SERV-TYP-CD - hpcReqHipaaVerNbr COBOL Name: HPC-REQ-HIPAA-VER-NBR - versionNo
   * COBOL Name: WS-VERSION-NO - hsrReqVersionNo COBOL Name: HSR-REQ-VERSION-NO - hpcReqClngProg
   * COBOL Name: HPC-REQ-CLNG-PROG - panValet COBOL Name: PAN-VALET - dsmFuncCd COBOL Name:
   * DSM-FUNC-CD - hipaaCd47PresentSw COBOL Name: WS-HIPAA-CD-47-PRESENT-SW - hipaaCd30PresentSw
   * COBOL Name: WS-HIPAA-CD-30-PRESENT-SW - sub1 COBOL Name: WS-SUB1 - rc COBOL Name: RETURN-CODE -
   * reqReturnCode COBOL Name: REQ-RETURN-CODE - reqExplanationCode COBOL Name: REQ-EXPLANATION-CODE
   * - hsrReqContractRtnCd COBOL Name: HSR-REQ-CONTRACT-RTN-CD - fmaFixedArea COBOL Name:
   * FMA-FIXED-AREA - fmaIpType1 COBOL Name: FMA-IP-TYPE-1 - fmaIpTypeNumeric1 COBOL Name:
   * FMA-IP-TYPE-NUMERIC-1 - dsmSqlcode COBOL Name: DSM-SQLCODE - fmaIpTypeAlpha1 COBOL Name:
   * FMA-IP-TYPE-ALPHA-1 - fmaIpTypeAlpha2 COBOL Name: FMA-IP-TYPE-ALPHA-2 - dsmErrSectnName COBOL
   * Name: DSM-ERR-SECTN-NAME - fmaIpErrCode1 COBOL Name: FMA-IP-ERR-CODE-1 - hipaaCodeUsedSub COBOL
   * Name: HIPAA-CODE-USED-SUB - hipaaCd47Sw COBOL Name: WS-HIPAA-CD-47-SW - hipaaCd COBOL Name:
   * WS-HIPAA-CD - hpcRetHipaaCd COBOL Name: HPC-RET-HIPAA-CD - hsrRetGrnrcReqCd COBOL Name:
   * HSR-RET-GRNRC-REQ-CD - hpcRetGrnrcRqstCd COBOL Name: HPC-RET-GRNRC-RQST-CD - hpcRetCnt COBOL
   * Name: HPC-RET-CNT - hipaaCount COBOL Name: WS-HIPAA-COUNT - hsrRetHipaaCnt COBOL Name:
   * HSR-RET-HIPAA-CNT
   *
   * @throws CFException
   */
  @Override
  public LoadHipaaCodesOutCtx loadHipaaCodes(LoadHipaaCodesInCtx methodIn) throws Exception {

    // *81***************************************************************
    // *81 3100-Load-hipaa-codes                                        *
    // *81                                                              *
    // *81 business function: calls the d5427hpc dsm to retrieve the    *
    // *81 hipaa codes                                                  *
    // *81***************************************************************
    // *82 3100-load-hipaa-codes                                        *
    // *82 1.calls the dsm to retrive hipaa codes                       *
    // *82                                                              *
    // *82 called by :3000-hsr-processing                               *
    // *82 calls     :set-fma-err-tbl-9000                              *
    // *82***************************************************************
    // Added variable to get the program context in place.
    Bbhsr002Ctx programCtx = methodIn.getBbhsr002Ctx();
    // Added variable to get the output context in place.
    LoadHipaaCodesOutCtx methodOut = methodIn.getLoadHipaaCodesOutCtx();
    //  cobolCode::MOVE HSR-REQ-HIPAA-SERV-TYP-CD TO HPC-REQ-HIPAA-CD
    methodOut.setHpcReqHipaaCd(methodOut.getHsrReqHipaaServTypCd());
    //  cobolCode::IF HSR-REQ-VERSION-NO = SPACES
    if ((allSpaces(methodOut.getHsrReqVersionNo()))) {
      //  cobolCode::MOVE WS-VERSION-NO TO HPC-REQ-HIPAA-VER-NBR
      methodOut.setHpcReqHipaaVerNbr(methodOut.getVersionNo());
    }
    //  cobolCode::ELSE
    else {
      //  cobolCode::MOVE HSR-REQ-VERSION-NO TO HPC-REQ-HIPAA-VER-NBR
      methodOut.setHpcReqHipaaVerNbr(methodOut.getHsrReqVersionNo());
    }
    //  cobolCode::MOVE PAN-VALET TO HPC-REQ-CLNG-PROG
    methodOut.setHpcReqClngProg(methodOut.getPanValet());
    //  cobolCode::IF HPC-REQ-HIPAA-CD = '30' OR SPACE
    if (compareChars(methodOut.getHpcReqHipaaCd(), CONSTANTS.LITERAL_30) == 0
        || (allSpaces(methodOut.getHpcReqHipaaCd()))) {

      // *    For generic hipaa code

      // *    For generic hipaa code
      methodOut.setDsmFuncCd(1);
    }
    //  cobolCode::ELSE
    else {

      // *    For explicit hipaa code

      // *    For explicit hipaa code
      methodOut.setDsmFuncCd(2);
    }
    //  cobolCode::IF HPC-REQ-HIPAA-CD = '00' OR SPACE
    if (compareChars(methodOut.getHpcReqHipaaCd(), CONSTANTS.LITERAL_00) == 0
        || (allSpaces(methodOut.getHpcReqHipaaCd()))) {

      // *    For all hipaa codes

      // *    For all hipaa codes
      methodOut.setDsmFuncCd(4);
    }
    //  cobolCode::IF HSR-REQ-HIPAA-SERV-TYP-CD = '47'
    //  LITERAL_47 = '47'
    if (compareChars(methodOut.getHsrReqHipaaServTypCd(), CONSTANTS.LITERAL_47) == 0) {
      //  cobolCode::SET WS-HIPAA-47-PRESENT TO TRUE
      methodOut.setHipaa47PresentTrue();

    }
    //  cobolCode::ELSE
    else {
      //  cobolCode::SET WS-HIPAA-47-NOT-PRESENT TO TRUE
      methodOut.setHipaa47NotPresentTrue();
    }
    //  cobolCode::IF HSR-REQ-HIPAA-SERV-TYP-CD = '30'
    //  LITERAL_30 = '30'
    if (compareChars(methodOut.getHsrReqHipaaServTypCd(), CONSTANTS.LITERAL_30) == 0) {
      //  cobolCode::SET WS-HIPAA-30-PRESENT TO TRUE
      methodOut.setHipaa30PresentTrue();

    }
    //  cobolCode::ELSE
    else {
      //  cobolCode::SET WS-HIPAA-30-NOT-PRESENT TO TRUE
      methodOut.setHipaa30NotPresentTrue();
    }
    //  cobolCode::IF NOT ( REQ-ADDRESS-4-PTR OF F5957REQ-INPUT = NULLS ) AND REQ-ADDRESS-4-LENGTH >
    // ZERO
    if ((compareChars(
                pad(5, String.valueOf(methodOut.getReqAddress4Ptr()), "0", CFUtil.LEFT_PAD),
                CONSTANTS.LITERAL_NULLS)
            != 0)
        && (methodIn.getReqAddress4Length() > 0)) {

      // *Vdahiy    set address of ws-req-hsr-hipaa-list to
      // *vdahiy                   req-address-4-ptr
      // *  this is now already set from container..

      // **** Check if request has an explicit hipaa code '47'
      //  cobolCode::PERFORM VARYING WS-SUB1 FROM 1 BY 1 UNTIL WS-SUB1 > 9
      for (methodOut.setSub1(1);
          ((methodOut.getSub1() <= 9));
          methodOut.setSub1(methodOut.getSub1() + 1)) {
        //  cobolCode::IF ( WS-REQ-HIPAA-CD-ITEM ( WS-SUB1 ) = '47' )
        //  LITERAL_47 = '47'
        if ((compareChars(methodIn.getReqHipaaCdItem(methodOut.getSub1() - 1), CONSTANTS.LITERAL_47)
            == 0)) {
          //  cobolCode::SET WS-HIPAA-47-PRESENT TO TRUE
          methodOut.setHipaa47PresentTrue();
        }

        // **** Check if request has a generic hipaa code '30'
        //  cobolCode::IF ( WS-REQ-HIPAA-CD-ITEM ( WS-SUB1 ) = '30' )
        //  LITERAL_30 = '30'
        if ((compareChars(methodIn.getReqHipaaCdItem(methodOut.getSub1() - 1), CONSTANTS.LITERAL_30)
            == 0)) {
          //  cobolCode::SET WS-HIPAA-30-PRESENT TO TRUE
          methodOut.setHipaa30PresentTrue();
        }
      }
      methodOut.setDsmFuncCd(3);
      //  cobolCode::CALL WS-D5427HPC USING DFHEIBLK DFHCOMMAREA DSM-CALL-AREA , HPC-REQST-RET-AREA
      // , REQ-ADDRESS-4-PTR END-CALL
      parametersObj =
          new Object[] {
            programCtx.getCicsSession(),
            methodOut.getDfhcommarea(),
            methodOut.getDsmCallArea(),
            methodOut.getHpcReqstRetArea(),
            methodOut.getReqAddress4Ptr()
          };
      programCtx.setRc(
          d5427hpc.call(programCtx.getGlobalCtx().getContext("D5427HPC"), parametersObj));
      setFromD5427hpc(programCtx, parametersObj);
    }
    //  cobolCode::ELSE
    else {
      //  cobolCode::CALL WS-D5427HPC USING DFHEIBLK DFHCOMMAREA DSM-CALL-AREA , HPC-REQST-RET-AREA
      // , OMITTED_1 END-CALL
      programCtx.setRc(
          d5427hpc.call(
              programCtx.getGlobalCtx().getContext("D5427HPC"),
              programCtx.getCicsSession(),
              methodOut.getDfhcommareaGroup(),
              methodOut.getDsmCallArea(),
              methodOut.getHpcReqstRetArea(),
              (Field) null));
    }
    //  cobolCode::IF DSM-NO-ERROR
    //  cobolCode::ELSE
    if (!(methodIn.isDsmNoError())) {
      //  cobolCode::IF DSM-ENTRY-NOT-FND-INQ
      if (methodIn.isDsmEntryNotFndInq()) {
        //  cobolCode::SET REQ-FAIL OF F5957REQ-INPUT TO TRUE
        methodOut.setReqFailTrue();

        //  cobolCode::SET REQ-INVALID-PARMS OF F5957REQ-INPUT TO TRUE
        methodOut.setReqInvalidParmsTrue();

        //  cobolCode::SET HSR-REQ-CONTRCT-FAIL-C-FUNC-RC TO TRUE
        methodOut.setHsrReqContrctFailCFuncRcTrue();

        //  cobolCode::INITIALIZE FMA-FIXED-AREA
        methodOut.getFmaFixedArea().initialize();
        //  cobolCode::SET FMA-TYPE-IS-NUMERIC-1 TO TRUE
        methodOut.setFmaTypeIsNumeric1True();

        //  cobolCode::IF NOT DSM-EDIT-ERROR
        if (!(methodIn.isDsmEditError())) {
          //  cobolCode::MOVE DSM-SQLCODE TO FMA-IP-TYPE-NUMERIC-1
          methodOut.setFmaIpTypeNumeric1(methodOut.getDsmSqlcode());
        }
        //  cobolCode::MOVE 'DHPC' TO FMA-IP-TYPE-ALPHA-1
        //  LITERAL_DHPC = 'DHPC'
        methodOut.setFmaIpTypeAlpha1(CONSTANTS.LITERAL_DHPC);
        //  cobolCode::MOVE DSM-ERR-SECTN-NAME TO FMA-IP-TYPE-ALPHA-2
        methodOut.setFmaIpTypeAlpha2(methodOut.getDsmErrSectnName());
        //  cobolCode::MOVE 15 TO FMA-IP-ERR-CODE-1
        methodOut.setFmaIpErrCode1(15);
        //  cobolCode::PERFORM SET-FMA-ERR-TBL-9000
        setFmaErrTbl9000(programCtx.getSetFmaErrTbl9000InCtx()); /*SET-FMA-ERR-TBL-9000 SECTION*/
        // cobolCode::GO TO 3100-EXIT
        return methodOut;
        // cobolCodeEnds::GO TO 3100-EXIT
      }
      //  cobolCode::ELSE
      else {
        //  cobolCode::SET REQ-FAIL OF F5957REQ-INPUT TO TRUE
        methodOut.setReqFailTrue();

        //  cobolCode::SET REQ-PARM-ADDRESSES-ERROR OF F5957REQ-INPUT TO TRUE
        methodOut.setReqParmAddressesErrorTrue();

        //  cobolCode::SET HSR-REQ-CONTRCT-FAIL-C-FUNC-RC TO TRUE
        methodOut.setHsrReqContrctFailCFuncRcTrue();

        //  cobolCode::INITIALIZE FMA-FIXED-AREA
        methodOut.getFmaFixedArea().initialize();
        //  cobolCode::SET FMA-TYPE-IS-NUMERIC-1 TO TRUE
        methodOut.setFmaTypeIsNumeric1True();

        //  cobolCode::IF NOT DSM-EDIT-ERROR
        if (!(methodIn.isDsmEditError())) {
          //  cobolCode::MOVE DSM-SQLCODE TO FMA-IP-TYPE-NUMERIC-1
          methodOut.setFmaIpTypeNumeric1(methodOut.getDsmSqlcode());
        }
        //  cobolCode::MOVE 'DHPC' TO FMA-IP-TYPE-ALPHA-1
        //  LITERAL_DHPC = 'DHPC'
        methodOut.setFmaIpTypeAlpha1(CONSTANTS.LITERAL_DHPC);
        //  cobolCode::MOVE DSM-ERR-SECTN-NAME TO FMA-IP-TYPE-ALPHA-2
        methodOut.setFmaIpTypeAlpha2(methodOut.getDsmErrSectnName());
        //  cobolCode::MOVE 9 TO FMA-IP-ERR-CODE-1
        methodOut.setFmaIpErrCode1(9);
        //  cobolCode::PERFORM SET-FMA-ERR-TBL-9000
        setFmaErrTbl9000(programCtx.getSetFmaErrTbl9000InCtx()); /*SET-FMA-ERR-TBL-9000 SECTION*/
        // cobolCode::GO TO 3100-EXIT
        return methodOut;
        // cobolCodeEnds::GO TO 3100-EXIT
      }
    }

    // *Hipaa service code 47-hospital is not returned when returning the
    // *group level as the information will be provided under hipaa codes
    // *48-hospital inpatient and 50-hospital outpatient
    //  cobolCode::MOVE ZEROS TO HIPAA-CODE-USED-SUB
    methodOut.setHipaaCodeUsedSub(0);
    //  cobolCode::SET HIPAA-CD-47-NOT-SKIPPED TO TRUE
    methodOut.setHipaaCd47NotSkippedTrue();

    //  cobolCode::PERFORM VARYING WS-SUB1 FROM 1 BY 1 UNTIL WS-SUB1 > HPC-RET-CNT
    for (methodOut.setSub1(1);
        ((methodOut.getSub1() <= methodOut.getHpcRetCnt()));
        methodOut.setSub1(methodOut.getSub1() + 1)) {
      //  cobolCode::IF HPC-RET-HIPAA-CD ( WS-SUB1 ) = '47' AND WS-HIPAA-47-PRESENT AND
      // WS-HIPAA-30-NOT-PRESENT
      //  LITERAL_47 = '47'
      if (compareChars(methodOut.getHpcRetHipaaCd(methodOut.getSub1() - 1), CONSTANTS.LITERAL_47)
              == 0
          && methodOut.isHipaa47Present()
          && methodOut.isHipaa30NotPresent()) {
        //  cobolCode::SET HIPAA-CD-47-SKIPPED TO TRUE
        methodOut.setHipaaCd47SkippedTrue();

      }
      //  cobolCode::ELSE
      else {
        //  cobolCode::ADD +1 TO HIPAA-CODE-USED-SUB
        methodOut.setHipaaCodeUsedSub(methodOut.getHipaaCodeUsedSub() + 1);
        //  cobolCode::MOVE HPC-RET-HIPAA-CD ( WS-SUB1 ) TO WS-HIPAA-CD ( HIPAA-CODE-USED-SUB )
        methodOut.setHipaaCd(
            methodOut.getHipaaCodeUsedSub() - 1,
            methodOut.getHpcRetHipaaCd(methodOut.getSub1() - 1));
        //  cobolCode::MOVE HPC-RET-GRNRC-RQST-CD ( WS-SUB1 ) TO HSR-RET-GRNRC-REQ-CD (
        // HIPAA-CODE-USED-SUB )
        methodOut.setHsrRetGrnrcReqCd(
            methodOut.getHipaaCodeUsedSub() - 1,
            methodOut.getHpcRetGrnrcRqstCd(methodOut.getSub1() - 1));
      }
    }
    //  cobolCode::IF HIPAA-CD-47-SKIPPED
    if (methodOut.isHipaaCd47Skipped()) {
      //  cobolCode::SUBTRACT 1 FROM HPC-RET-CNT
      methodOut.setHpcRetCnt(Math.abs(methodOut.getHpcRetCnt() - 1));
    }
    //  cobolCode::MOVE HPC-RET-CNT TO WS-HIPAA-COUNT HSR-RET-HIPAA-CNT
    methodOut.setHipaaCount(methodOut.getHpcRetCnt());
    methodOut.setHsrRetHipaaCnt(methodOut.getHpcRetCnt());

    return methodOut;
  }
  /**
   * getPolicyInfo This method is derived from COBOL Paragraph - 3200-GET-POLICY-INFO SECTION COBOL
   * Cyclomatic complexity - 5 Input :
   *
   * <p>- hsrReqCovTypCd COBOL Name: HSR-REQ-COV-TYP-CD - hsrReqMxiPolicy COBOL Name:
   * HSR-REQ-MXI-POLICY - hsrReqMxiPlan COBOL Name: HSR-REQ-MXI-PLAN - hsrReqMxiClass COBOL Name:
   * HSR-REQ-MXI-CLASS - hsrReqEffDate COBOL Name: HSR-REQ-EFF-DATE - hsrReqCancelDate COBOL Name:
   * HSR-REQ-CANCEL-DATE - panValet COBOL Name: PAN-VALET - dsmReturnCode COBOL Name:
   * DSM-RETURN-CODE - dsmSqlcode COBOL Name: DSM-SQLCODE - dsmErrSectnName COBOL Name:
   * DSM-ERR-SECTN-NAME - polRetNewOldSrvcInd COBOL Name: POL-RET-NEW-OLD-SRVC-IND
   *
   * <p>Output :
   *
   * <p>- polReqCovTypCd COBOL Name: POL-REQ-COV-TYP-CD - polReqMxiPolNbr COBOL Name:
   * POL-REQ-MXI-POL-NBR - hsrReqMxiPolicy COBOL Name: HSR-REQ-MXI-POLICY - polReqMxiPlnNbr COBOL
   * Name: POL-REQ-MXI-PLN-NBR - hsrReqMxiPlan COBOL Name: HSR-REQ-MXI-PLAN - polReqMxiClssNbr COBOL
   * Name: POL-REQ-MXI-CLSS-NBR - hsrReqMxiClass COBOL Name: HSR-REQ-MXI-CLASS - dsmDt COBOL Name:
   * WS-DSM-DT - dsmDtCc COBOL Name: WS-DSM-DT-CC - hsrReqEffDate COBOL Name: HSR-REQ-EFF-DATE -
   * dsmDtYy COBOL Name: WS-DSM-DT-YY - dsmDtMm COBOL Name: WS-DSM-DT-MM - dsmDtDd COBOL Name:
   * WS-DSM-DT-DD - polReqEffDt COBOL Name: POL-REQ-EFF-DT - hsrReqCancelDate COBOL Name:
   * HSR-REQ-CANCEL-DATE - polReqCancDt COBOL Name: POL-REQ-CANC-DT - polReqClngProg COBOL Name:
   * POL-REQ-CLNG-PROG - panValet COBOL Name: PAN-VALET - dsmFuncCd COBOL Name: DSM-FUNC-CD - rc
   * COBOL Name: RETURN-CODE - reqReturnCode COBOL Name: REQ-RETURN-CODE - reqExplanationCode COBOL
   * Name: REQ-EXPLANATION-CODE - hsrReqContractRtnCd COBOL Name: HSR-REQ-CONTRACT-RTN-CD -
   * fmaFixedArea COBOL Name: FMA-FIXED-AREA - fmaIpType1 COBOL Name: FMA-IP-TYPE-1 -
   * fmaIpTypeNumeric1 COBOL Name: FMA-IP-TYPE-NUMERIC-1 - dsmSqlcode COBOL Name: DSM-SQLCODE -
   * fmaIpTypeAlpha1 COBOL Name: FMA-IP-TYPE-ALPHA-1 - fmaIpTypeAlpha2 COBOL Name:
   * FMA-IP-TYPE-ALPHA-2 - dsmErrSectnName COBOL Name: DSM-ERR-SECTN-NAME - fmaIpErrCode1 COBOL
   * Name: FMA-IP-ERR-CODE-1 - hsrRetNOSvcInd COBOL Name: HSR-RET-N-O-SVC-IND - polRetNewOldSrvcInd
   * COBOL Name: POL-RET-NEW-OLD-SRVC-IND
   *
   * @throws CFException
   */
  @Override
  public GetPolicyInfoOutCtx getPolicyInfo(GetPolicyInfoInCtx methodIn) throws Exception {

    // *82   Ind, slot id, obligor id and share arrangement             *
    // *82                                                              *
    // *82 called by :3000-hsr-processing                               *
    // *82 calls     :set-fma-err-tbl-9000                              *
    // *82***************************************************************
    // Added variable to get the program context in place.
    Bbhsr002Ctx programCtx = methodIn.getBbhsr002Ctx();
    // Added variable to get the output context in place.
    GetPolicyInfoOutCtx methodOut = methodIn.getGetPolicyInfoOutCtx();
    //  cobolCode::IF HSR-REQ-COV-TYP-CD = 'M'
    //  LITERAL_M = 'M'
    if (compareChars(methodIn.getHsrReqCovTypCd(), CONSTANTS.LITERAL_M) == 0) {
      //  LITERAL_1 = '1'
      methodOut.setPolReqCovTypCd(CONSTANTS.LITERAL_1);
    }
    //  cobolCode::MOVE HSR-REQ-MXI-POLICY TO POL-REQ-MXI-POL-NBR
    methodOut.setPolReqMxiPolNbr(methodOut.getHsrReqMxiPolicy());
    //  cobolCode::MOVE HSR-REQ-MXI-PLAN TO POL-REQ-MXI-PLN-NBR
    methodOut.setPolReqMxiPlnNbr(methodOut.getHsrReqMxiPlan());
    //  cobolCode::MOVE HSR-REQ-MXI-CLASS TO POL-REQ-MXI-CLSS-NBR
    methodOut.setPolReqMxiClssNbr(methodOut.getHsrReqMxiClass());
    //  cobolCode::INITIALIZE WS-DSM-DT
    methodOut.getDsmDt().initialize();
    //  cobolCode::MOVE HSR-REQ-EFF-DATE (1 : 2) TO WS-DSM-DT-CC
    methodOut.setDsmDtCc(CFUtil.getInt(substring(methodOut.getHsrReqEffDateString(), 0, 2)));
    //  cobolCode::MOVE HSR-REQ-EFF-DATE (3 : 2) TO WS-DSM-DT-YY
    methodOut.setDsmDtYy(CFUtil.getInt(substring(methodOut.getHsrReqEffDateString(), 2, 4)));
    //  cobolCode::MOVE HSR-REQ-EFF-DATE (5 : 2) TO WS-DSM-DT-MM
    methodOut.setDsmDtMm(CFUtil.getInt(substring(methodOut.getHsrReqEffDateString(), 4, 6)));
    //  cobolCode::MOVE HSR-REQ-EFF-DATE (7 : 2) TO WS-DSM-DT-DD
    methodOut.setDsmDtDd(CFUtil.getInt(substring(methodOut.getHsrReqEffDateString(), 6, 8)));
    methodOut.setPolReqEffDt(methodOut.getDsmDt().toCharArray());
    //  cobolCode::INITIALIZE WS-DSM-DT
    methodOut.getDsmDt().initialize();
    //  cobolCode::MOVE HSR-REQ-CANCEL-DATE (1 : 2) TO WS-DSM-DT-CC
    methodOut.setDsmDtCc(CFUtil.getInt(substring(methodOut.getHsrReqCancelDateString(), 0, 2)));
    //  cobolCode::MOVE HSR-REQ-CANCEL-DATE (3 : 2) TO WS-DSM-DT-YY
    methodOut.setDsmDtYy(CFUtil.getInt(substring(methodOut.getHsrReqCancelDateString(), 2, 4)));
    //  cobolCode::MOVE HSR-REQ-CANCEL-DATE (5 : 2) TO WS-DSM-DT-MM
    methodOut.setDsmDtMm(CFUtil.getInt(substring(methodOut.getHsrReqCancelDateString(), 4, 6)));
    //  cobolCode::MOVE HSR-REQ-CANCEL-DATE (7 : 2) TO WS-DSM-DT-DD
    methodOut.setDsmDtDd(CFUtil.getInt(substring(methodOut.getHsrReqCancelDateString(), 6, 8)));
    methodOut.setPolReqCancDt(methodOut.getDsmDt().toCharArray());
    //  cobolCode::MOVE PAN-VALET TO POL-REQ-CLNG-PROG
    methodOut.setPolReqClngProg(methodOut.getPanValet());
    methodOut.setDsmFuncCd(3);
    //  cobolCode::CALL WS-D5427POL USING DSM-CALL-AREA DSM-POL-REQUEST-BLOCK DSM-POL-RET1-BLOCK
    // DSM-POL-RET2-BLOCK DSM-POL-RET3-BLOCK DSM-POL-RET4-BLOCK DSM-POL-RET5-BLOCK
    // DSM-POL-RET6-BLOCK DSM-POL-RET7-BLOCK DSM-POL-RET8-BLOCK
    programCtx.setRc(
        d5427pol.call(
            programCtx.getGlobalCtx().getContext("D5427POL"),
            methodOut.getDsmCallArea(),
            methodOut.getDsmPolRequestBlock(),
            methodOut.getDsmPolRet1Block(),
            methodOut.getDsmPolRet2Block(),
            methodOut.getDsmPolRet3Block(),
            methodOut.getDsmPolRet4Block(),
            methodOut.getDsmPolRet5Block(),
            methodOut.getDsmPolRet6Block(),
            methodOut.getDsmPolRet7Block(),
            methodOut.getDsmPolRet8Block()));

    // ***                              Dsm-pol-ret9-block.
    //  cobolCode::IF DSM-NO-ERROR
    //  cobolCode::ELSE
    if (!(methodIn.isDsmNoError())) {
      //  cobolCode::SET REQ-FAIL OF F5957REQ-INPUT TO TRUE
      methodOut.setReqFailTrue();

      //  cobolCode::SET REQ-PARM-ADDRESSES-ERROR OF F5957REQ-INPUT TO TRUE
      methodOut.setReqParmAddressesErrorTrue();

      //  cobolCode::SET HSR-REQ-CONTRCT-FAIL-C-FUNC-RC TO TRUE
      methodOut.setHsrReqContrctFailCFuncRcTrue();

      //  cobolCode::INITIALIZE FMA-FIXED-AREA
      methodOut.getFmaFixedArea().initialize();
      //  cobolCode::SET FMA-TYPE-IS-NUMERIC-1 TO TRUE
      methodOut.setFmaTypeIsNumeric1True();

      //  cobolCode::IF NOT DSM-EDIT-ERROR
      if (!(methodIn.isDsmEditError())) {
        //  cobolCode::MOVE DSM-SQLCODE TO FMA-IP-TYPE-NUMERIC-1
        methodOut.setFmaIpTypeNumeric1(methodOut.getDsmSqlcode());
      }
      //  cobolCode::MOVE 'DPOL' TO FMA-IP-TYPE-ALPHA-1
      //  LITERAL_DPOL = 'DPOL'
      methodOut.setFmaIpTypeAlpha1(CONSTANTS.LITERAL_DPOL);
      //  cobolCode::MOVE DSM-ERR-SECTN-NAME TO FMA-IP-TYPE-ALPHA-2
      methodOut.setFmaIpTypeAlpha2(methodOut.getDsmErrSectnName());
      //  cobolCode::IF DSM-ENTRY-NOT-FND-INQ
      if (methodIn.isDsmEntryNotFndInq()) {
        //  cobolCode::MOVE 20 TO FMA-IP-ERR-CODE-1
        methodOut.setFmaIpErrCode1(20);
      }
      //  cobolCode::ELSE
      else {
        //  cobolCode::MOVE 10 TO FMA-IP-ERR-CODE-1
        methodOut.setFmaIpErrCode1(10);
      }
      //  cobolCode::PERFORM SET-FMA-ERR-TBL-9000
      setFmaErrTbl9000(programCtx.getSetFmaErrTbl9000InCtx()); /*SET-FMA-ERR-TBL-9000 SECTION*/
      // cobolCode::GO TO 3200-EXIT
      return methodOut;
      // cobolCodeEnds::GO TO 3200-EXIT
    }
    //  cobolCode::MOVE POL-RET-NEW-OLD-SRVC-IND TO HSR-RET-N-O-SVC-IND
    methodOut.setHsrRetNOSvcInd(methodOut.getPolRetNewOldSrvcInd());

    return methodOut;
  }
  /**
   * determineNOSvcInd This method is derived from COBOL Paragraph - 3300-DETERMINE-N-O-SVC-IND
   * SECTION COBOL Cyclomatic complexity - 8 Input :
   *
   * <p>- hsrRetNOSvcInd COBOL Name: HSR-RET-N-O-SVC-IND - hsrReqContractRtnCd COBOL Name:
   * HSR-REQ-CONTRACT-RTN-CD
   *
   * <p>Output :
   *
   * <p>- bhiRowFndSw COBOL Name: WS-BHI-ROW-FND-SW - tliTableSw COBOL Name: WS-TLI-TABLE-SW -
   * methodSw COBOL Name: METHOD-SW - reqReturnCode COBOL Name: REQ-RETURN-CODE - reqExplanationCode
   * COBOL Name: REQ-EXPLANATION-CODE - hsrReqContractRtnCd COBOL Name: HSR-REQ-CONTRACT-RTN-CD -
   * fmaFixedArea COBOL Name: FMA-FIXED-AREA - fmaIpType1 COBOL Name: FMA-IP-TYPE-1 - fmaIpType2
   * COBOL Name: FMA-IP-TYPE-2 - fmaIpTypeAlpha2 COBOL Name: FMA-IP-TYPE-ALPHA-2 - fmaIpErrCode1
   * COBOL Name: FMA-IP-ERR-CODE-1
   *
   * @throws CFException
   */
  @Override
  public DetermineNOSvcIndOutCtx determineNOSvcInd(DetermineNOSvcIndInCtx methodIn)
      throws Exception {

    // *81***************************************************************
    // *81 3300-Determine-n-o-svc-ind                                   *
    // *81                                                              *
    // *81 business function: performs new, combined and old method     *
    // *81                    based on n/o service indicator            *
    // *81***************************************************************
    // *82 3300-determine-n-o-svc-ind                                   *
    // *82 1.performs new, combined and old method based on n/o service *
    // *82   indicator.                                                 *
    // *82                                                              *
    // *82 called by :3000-hsr-processing                               *
    // *82 calls     :3400-process-new-svc-method                       *
    // *82            3500-process-comb-svc-method                      *
    // *82            3600-process-old-svc-method                       *
    // *82            set-fma-err-tbl-9000                              *
    // *82***************************************************************
    // Added variable to get the program context in place.
    Bbhsr002Ctx programCtx = methodIn.getBbhsr002Ctx();
    // Added variable to get the output context in place.
    DetermineNOSvcIndOutCtx methodOut = methodIn.getDetermineNOSvcIndOutCtx();
    //  cobolCode::SET WS-BHI-ROW-FOUND TO TRUE
    methodOut.setBhiRowFoundTrue();

    //  cobolCode::SET WS-TLI-TABLE-FOUND TO TRUE
    methodOut.setTliTableFoundTrue();

    //  cobolCode::EVALUATE TRUE
    if (compareChars(methodIn.getHsrRetNOSvcInd(), CONSTANTS.LITERAL_N) == 0) {
      //  cobolCode::SET NEW-METHOD TO TRUE
      methodOut.setNewMethodTrue();

      //  cobolCode::PERFORM 3400-PROCESS-NEW-SVC-METHOD
      processNewSvcMethod(
          programCtx.getProcessNewSvcMethodInCtx()); /*3400-PROCESS-NEW-SVC-METHOD SECTION*/
      //  cobolCode::IF HSR-REQ-CONTRCT-FAIL-C-FUNC-RC
      if (methodOut.isHsrReqContrctFailCFuncRc()) {
        // cobolCode::GO TO 3300-EXIT
        return methodOut;
        // cobolCodeEnds::GO TO 3300-EXIT
      }
    } else if (compareChars(methodIn.getHsrRetNOSvcInd(), CONSTANTS.LITERAL_U) == 0) {
      //  cobolCode::SET U-METHOD TO TRUE
      methodOut.setUMethodTrue();

      //  cobolCode::PERFORM 3500-PROCESS-COMB-SVC-METHOD
      processCombSvcMethod(
          programCtx.getProcessCombSvcMethodInCtx()); /*3500-PROCESS-COMB-SVC-METHOD SECTION*/
      //  cobolCode::IF HSR-REQ-CONTRCT-FAIL-C-FUNC-RC
      if (methodOut.isHsrReqContrctFailCFuncRc()) {
        // cobolCode::GO TO 3300-EXIT
        return methodOut;
        // cobolCodeEnds::GO TO 3300-EXIT
      }
    } else if (compareChars(methodIn.getHsrRetNOSvcInd(), CONSTANTS.LITERAL_O) == 0) {
      //  cobolCode::SET OLD-METHOD TO TRUE
      methodOut.setOldMethodTrue();

      //  cobolCode::PERFORM 3600-PROCESS-OLD-SVC-METHOD
      processOldSvcMethod(
          programCtx.getProcessOldSvcMethodInCtx()); /*3600-PROCESS-OLD-SVC-METHOD SECTION*/
      //  cobolCode::IF HSR-REQ-CONTRCT-FAIL-C-FUNC-RC
      if (methodOut.isHsrReqContrctFailCFuncRc()) {
        // cobolCode::GO TO 3300-EXIT
        return methodOut;
        // cobolCodeEnds::GO TO 3300-EXIT
      }
    } else {
      //  cobolCode::SET REQ-FAIL OF F5957REQ-INPUT TO TRUE
      methodOut.setReqFailTrue();

      //  cobolCode::SET REQ-SEE-VIEW-FOR-MORE-INFO OF F5957REQ-INPUT TO TRUE
      methodOut.setReqSeeViewForMoreInfoTrue();

      //  cobolCode::SET HSR-REQ-CONTRCT-FAIL-C-FUNC-RC TO TRUE
      methodOut.setHsrReqContrctFailCFuncRcTrue();

      //  cobolCode::INITIALIZE FMA-FIXED-AREA
      methodOut.getFmaFixedArea().initialize();
      //  cobolCode::SET FMA-TYPE-IS-NUMERIC-1 TO TRUE
      methodOut.setFmaTypeIsNumeric1True();

      //  cobolCode::SET FMA-TYPE-IS-ALPHA-2 TO TRUE
      methodOut.setFmaTypeIsAlpha2True();

      //  LITERAL_3300 = '3300'
      methodOut.setFmaIpTypeAlpha2(CONSTANTS.LITERAL_3300);
      //  cobolCode::MOVE 11 TO FMA-IP-ERR-CODE-1
      methodOut.setFmaIpErrCode1(11);
      //  cobolCode::PERFORM SET-FMA-ERR-TBL-9000
      setFmaErrTbl9000(programCtx.getSetFmaErrTbl9000InCtx()); /*SET-FMA-ERR-TBL-9000 SECTION*/
      // cobolCode::GO TO 3300-EXIT
      return methodOut;
      // cobolCodeEnds::GO TO 3300-EXIT
    }

    return methodOut;
  }
  /**
   * processNewSvcMethod This method is derived from COBOL Paragraph - 3400-PROCESS-NEW-SVC-METHOD
   * SECTION COBOL Cyclomatic complexity - 24 Input :
   *
   * <p>- hpaSub COBOL Name: WS-HPA-SUB - hipaaCount COBOL Name: WS-HIPAA-COUNT - dFlag COBOL Name:
   * WS-D-FLAG - iFlag COBOL Name: WS-I-FLAG - oFlag COBOL Name: WS-O-FLAG - polRetSviTblPriNbr
   * COBOL Name: POL-RET-SVI-TBL-PRI-NBR - hsrReqContractRtnCd COBOL Name: HSR-REQ-CONTRACT-RTN-CD -
   * bhiRetBhiCnt COBOL Name: BHI-RET-BHI-CNT - bhiCnt COBOL Name: WS-BHI-CNT - bhiRowFndSw COBOL
   * Name: WS-BHI-ROW-FND-SW - sub2 COBOL Name: WS-SUB2 - bhiSub COBOL Name: BHI-SUB - tliTableSw
   * COBOL Name: WS-TLI-TABLE-SW - tliRetSlotTblId COBOL Name: TLI-RET-SLOT-TBL-ID
   *
   * <p>Output :
   *
   * <p>- hpaSub COBOL Name: WS-HPA-SUB - bhiReqSlotTable COBOL Name: BHI-REQ-SLOT-TABLE -
   * polRetSviTblPriNbr COBOL Name: POL-RET-SVI-TBL-PRI-NBR - bhiCnt COBOL Name: WS-BHI-CNT -
   * bhiSub01 COBOL Name: WS-BHI-SUB - bhiSub COBOL Name: BHI-SUB - sub2 COBOL Name: WS-SUB2 -
   * tliRetSlotTblId COBOL Name: TLI-RET-SLOT-TBL-ID - hsrRetNetCnt COBOL Name: HSR-RET-NET-CNT
   *
   * @throws CFException
   */
  @Override
  public ProcessNewSvcMethodOutCtx processNewSvcMethod(ProcessNewSvcMethodInCtx methodIn)
      throws Exception {

    // *81***************************************************************
    // *81 3400-Process-new-svc-method                                  *
    // *81                                                              *
    // *81 business function: performs the new method process           *
    // *81 if mmi's sv1 slot id is spaces then it will search using     *
    // *81 tli slot id for the hippa service code. if sv1 slot id is    *
    // *81 not spaces then for each hipaa service code search for bhi   *
    // *81 records using sv1 slot id (populated from mmi).              *
    // *81                                                              *
    // *81***************************************************************
    // *82 3400-process-new-svc-method                                  *
    // *82 1.business function: performs the new method process         *
    // *82                                                              *
    // *82 called by :3300-determine-n-o-svc-ind                        *
    // *82 calls     :3700-set-flags                                    *
    // *82           :3800-set-cov-ind                                  *
    // *82            4000-get-hipaa-benefits                           *
    // *82            4100-move-bhi-fields                              *
    // *82            5000-get-svc-cd-nbr                               *
    // *82            6000-tli-process                                  *
    // *82***************************************************************
    // Added variable to get the program context in place.
    Bbhsr002Ctx programCtx = methodIn.getBbhsr002Ctx();
    // Added variable to get the output context in place.
    ProcessNewSvcMethodOutCtx methodOut = methodIn.getProcessNewSvcMethodOutCtx();
    //  cobolCode::PERFORM VARYING WS-HPA-SUB FROM 1 BY 1 UNTIL WS-HPA-SUB > WS-HIPAA-COUNT
    for (methodOut.setHpaSub(1);
        ((methodOut.getHpaSub() <= methodIn.getHipaaCount()));
        methodOut.setHpaSub(methodOut.getHpaSub() + 1)) {
      //  cobolCode::PERFORM 3700-SET-FLAGS
      setFlags(programCtx.getSetFlagsInCtx()); /*3700-SET-FLAGS SECTION*/
      //  cobolCode::PERFORM 3900-READ-NEW-SVI-TABLES
      readNewSviTables(programCtx.getReadNewSviTablesInCtx()); /*3900-READ-NEW-SVI-TABLES SECTION*/
      //  cobolCode::IF WS-D-FLAG-NO OR WS-I-FLAG-NO OR WS-O-FLAG-NO
      if (methodIn.isDFlagNo() || methodIn.isIFlagNo() || methodIn.isOFlagNo()) {
        //  cobolCode::IF POL-RET-SVI-TBL-PRI-NBR > SPACES
        if ((isGreaterThanSpaces(methodOut.getPolRetSviTblPriNbr()))) {
          //  cobolCode::MOVE POL-RET-SVI-TBL-PRI-NBR TO BHI-REQ-SLOT-TABLE
          methodOut.setBhiReqSlotTable(methodOut.getPolRetSviTblPriNbr());
          //  cobolCode::PERFORM 4000-GET-HIPAA-BENEFITS
          getHipaaBenefits(
              programCtx.getGetHipaaBenefitsInCtx()); /*4000-GET-HIPAA-BENEFITS SECTION*/
          //  cobolCode::IF HSR-REQ-CONTRCT-FAIL-C-FUNC-RC
          if (methodIn.isHsrReqContrctFailCFuncRc()) {
            // cobolCode::GO TO 3400-EXIT
            return methodOut;
            // cobolCodeEnds::GO TO 3400-EXIT
          }
          //  cobolCode::IF BHI-RET-BHI-CNT = 0
          //  cobolCode::ELSE
          if ((methodIn.getBhiRetBhiCnt() != 0)) {
            //  cobolCode::ADD BHI-RET-BHI-CNT TO WS-BHI-CNT
            methodOut.setBhiCnt(methodOut.getBhiCnt() + methodIn.getBhiRetBhiCnt());
          }
          //  cobolCode::IF WS-BHI-ROW-FOUND
          if (methodIn.isBhiRowFound()) {
            //  cobolCode::MOVE 1 TO WS-BHI-SUB
            //  LITERAL_1 = 1
            methodOut.setBhiSub01(1);
            //  cobolCode::PERFORM VARYING BHI-SUB FROM WS-SUB2 BY 1 UNTIL BHI-SUB > WS-BHI-CNT
            for (methodOut.setBhiSub(methodOut.getSub2());
                ((methodOut.getBhiSub() <= methodOut.getBhiCnt()));
                methodOut.setBhiSub(methodOut.getBhiSub() + 1)) {
              //  cobolCode::PERFORM 4100-MOVE-BHI-FIELDS
              moveBhiFields(programCtx.getMoveBhiFieldsInCtx()); /*4100-MOVE-BHI-FIELDS SECTION*/
              //  cobolCode::PERFORM 5000-GET-SVC-CD-NBR
              getSvcCdNbr(programCtx.getGetSvcCdNbrInCtx()); /*5000-GET-SVC-CD-NBR SECTION*/
              //  cobolCode::ADD +1 TO WS-BHI-SUB
              methodOut.setBhiSub01(methodOut.getBhiSub01() + 1);
              //  cobolCode::IF HSR-REQ-CONTRCT-FAIL-C-FUNC-RC
              if (methodIn.isHsrReqContrctFailCFuncRc()) {
                // cobolCode::GO TO 3400-EXIT
                return methodOut;
                // cobolCodeEnds::GO TO 3400-EXIT
              }
            }
            //  cobolCode::ADD BHI-RET-BHI-CNT TO WS-SUB2
            methodOut.setSub2(methodOut.getSub2() + methodIn.getBhiRetBhiCnt());
          }
        }
      }
      //  cobolCode::IF WS-D-FLAG-NO OR WS-I-FLAG-NO OR WS-O-FLAG-NO
      if (methodIn.isDFlagNo() || methodIn.isIFlagNo() || methodIn.isOFlagNo()) {
        //  cobolCode::PERFORM 6000-TLI-PROCESS
        tliProcess(programCtx.getTliProcessInCtx()); /*6000-TLI-PROCESS SECTION*/
        //  cobolCode::IF HSR-REQ-CONTRCT-FAIL-C-FUNC-RC
        if (methodIn.isHsrReqContrctFailCFuncRc()) {
          // cobolCode::GO TO 3400-EXIT
          return methodOut;
          // cobolCodeEnds::GO TO 3400-EXIT
        }
        //  cobolCode::IF WS-TLI-TABLE-FOUND
        if (methodIn.isTliTableFound()) {
          //  cobolCode::MOVE TLI-RET-SLOT-TBL-ID TO BHI-REQ-SLOT-TABLE
          methodOut.setBhiReqSlotTable(methodOut.getTliRetSlotTblId());
          //  cobolCode::PERFORM 4000-GET-HIPAA-BENEFITS
          getHipaaBenefits(
              programCtx.getGetHipaaBenefitsInCtx()); /*4000-GET-HIPAA-BENEFITS SECTION*/
          //  cobolCode::IF HSR-REQ-CONTRCT-FAIL-C-FUNC-RC
          if (methodIn.isHsrReqContrctFailCFuncRc()) {
            // cobolCode::GO TO 3400-EXIT
            return methodOut;
            // cobolCodeEnds::GO TO 3400-EXIT
          }
          //  cobolCode::IF BHI-RET-BHI-CNT = 0
          //  cobolCode::ELSE
          if ((methodIn.getBhiRetBhiCnt() != 0)) {
            //  cobolCode::ADD BHI-RET-BHI-CNT TO WS-BHI-CNT
            methodOut.setBhiCnt(methodOut.getBhiCnt() + methodIn.getBhiRetBhiCnt());
          }
          //  cobolCode::IF WS-BHI-ROW-FOUND
          if (methodIn.isBhiRowFound()) {
            //  cobolCode::MOVE 1 TO WS-BHI-SUB
            //  LITERAL_1 = 1
            methodOut.setBhiSub01(1);
            //  cobolCode::PERFORM VARYING BHI-SUB FROM WS-SUB2 BY 1 UNTIL BHI-SUB > WS-BHI-CNT
            for (methodOut.setBhiSub(methodOut.getSub2());
                ((methodOut.getBhiSub() <= methodOut.getBhiCnt()));
                methodOut.setBhiSub(methodOut.getBhiSub() + 1)) {
              //  cobolCode::PERFORM 4100-MOVE-BHI-FIELDS
              moveBhiFields(programCtx.getMoveBhiFieldsInCtx()); /*4100-MOVE-BHI-FIELDS SECTION*/
              //  cobolCode::PERFORM 5000-GET-SVC-CD-NBR
              getSvcCdNbr(programCtx.getGetSvcCdNbrInCtx()); /*5000-GET-SVC-CD-NBR SECTION*/
              //  cobolCode::ADD +1 TO WS-BHI-SUB
              methodOut.setBhiSub01(methodOut.getBhiSub01() + 1);
              //  cobolCode::IF HSR-REQ-CONTRCT-FAIL-C-FUNC-RC
              if (methodIn.isHsrReqContrctFailCFuncRc()) {
                // cobolCode::GO TO 3400-EXIT
                return methodOut;
                // cobolCodeEnds::GO TO 3400-EXIT
              }
            }
          }
        }
      }
      //  cobolCode::MOVE WS-BHI-CNT TO HSR-RET-NET-CNT ( WS-HPA-SUB )
      methodOut.setHsrRetNetCnt(methodOut.getHpaSub() - 1, methodOut.getBhiCnt());
      //  cobolCode::PERFORM 3800-SET-COV-IND
      setCovInd(programCtx.getSetCovIndInCtx()); /*3800-SET-COV-IND SECTION*/
    }

    return methodOut;
  }
  /**
   * processCombSvcMethod This method is derived from COBOL Paragraph - 3500-PROCESS-COMB-SVC-METHOD
   * SECTION COBOL Cyclomatic complexity - 236 Input :
   *
   * <p>- hpaSub COBOL Name: WS-HPA-SUB - hipaaCount COBOL Name: WS-HIPAA-COUNT - dFlag COBOL Name:
   * WS-D-FLAG - iFlag COBOL Name: WS-I-FLAG - oFlag COBOL Name: WS-O-FLAG - polRetSviTblPriNbr
   * COBOL Name: POL-RET-SVI-TBL-PRI-NBR - hsrReqContractRtnCd COBOL Name: HSR-REQ-CONTRACT-RTN-CD -
   * bhiRetBhiCnt COBOL Name: BHI-RET-BHI-CNT - bhiCnt COBOL Name: WS-BHI-CNT - bhiRowFndSw COBOL
   * Name: WS-BHI-ROW-FND-SW - sub2 COBOL Name: WS-SUB2 - bhiSub COBOL Name: BHI-SUB -
   * polRetSlotTblId COBOL Name: POL-RET-SLOT-TBL-ID - polRetSviTblTerNbr COBOL Name:
   * POL-RET-SVI-TBL-TER-NBR - polRetSlot018 COBOL Name: POL-RET-SLOT-018 - polRetSlot019 COBOL
   * Name: POL-RET-SLOT-019 - polRetSlot020 COBOL Name: POL-RET-SLOT-020 - hcaPolicySets COBOL Name:
   * WS-HCA-POLICY-SETS - empPolicySets COBOL Name: WS-EMP-POLICY-SETS
   *
   * <p>Output :
   *
   * <p>- hpaSub COBOL Name: WS-HPA-SUB - bhiReqSlotTable COBOL Name: BHI-REQ-SLOT-TABLE -
   * polRetSviTblPriNbr COBOL Name: POL-RET-SVI-TBL-PRI-NBR - bhiCnt COBOL Name: WS-BHI-CNT -
   * bhiSub01 COBOL Name: WS-BHI-SUB - bhiSub COBOL Name: BHI-SUB - sub2 COBOL Name: WS-SUB2 -
   * polRetSlotTblId COBOL Name: POL-RET-SLOT-TBL-ID - polRetSviTblTerNbr COBOL Name:
   * POL-RET-SVI-TBL-TER-NBR - polRetSlot018 COBOL Name: POL-RET-SLOT-018 - polRetSlot019 COBOL
   * Name: POL-RET-SLOT-019 - polRetSlot020 COBOL Name: POL-RET-SLOT-020 - hsrRetNetCnt COBOL Name:
   * HSR-RET-NET-CNT
   *
   * @throws CFException
   */
  @Override
  public ProcessCombSvcMethodOutCtx processCombSvcMethod(ProcessCombSvcMethodInCtx methodIn)
      throws Exception {

    // *81 For each hipaa service code first it will search for bhi     *
    // *81 records using sv1 slot id (populated from mmi). if sv1 slot  *
    // *81 id is spaces then it will search using sv2 slot id for the   *
    // *81 same hippa service code. if sv2 slot id is spaces then it    *
    // *81 will search using default table pse001.                      *
    // *81                                                              *
    // *81***************************************************************
    // *82 3500-process-comb-svc-method                                 *
    // *82 1.performs the combined method process                       *
    // *82                                                              *
    // *82 called by :3300-determine-n-o-svc-ind                        *
    // *82 calls     :3700-set-flags                                    *
    // *82            3800-set-cov-ind                                  *
    // *82            4000-get-hipaa-benefits                           *
    // *82            4100-move-bhi-fields                              *
    // *82            5000-get-svc-cd-nbr                               *
    // *82***************************************************************
    // Added variable to get the program context in place.
    Bbhsr002Ctx programCtx = methodIn.getBbhsr002Ctx();
    // Added variable to get the output context in place.
    ProcessCombSvcMethodOutCtx methodOut = methodIn.getProcessCombSvcMethodOutCtx();
    //  cobolCode::PERFORM VARYING WS-HPA-SUB FROM 1 BY 1 UNTIL WS-HPA-SUB > WS-HIPAA-COUNT
    for (methodOut.setHpaSub(1);
        ((methodOut.getHpaSub() <= methodIn.getHipaaCount()));
        methodOut.setHpaSub(methodOut.getHpaSub() + 1)) {
      //  cobolCode::PERFORM 3700-SET-FLAGS
      setFlags(programCtx.getSetFlagsInCtx()); /*3700-SET-FLAGS SECTION*/
      //  cobolCode::PERFORM 3900-READ-NEW-SVI-TABLES
      readNewSviTables(programCtx.getReadNewSviTablesInCtx()); /*3900-READ-NEW-SVI-TABLES SECTION*/
      //  cobolCode::IF WS-D-FLAG-NO OR WS-I-FLAG-NO OR WS-O-FLAG-NO
      if (methodIn.isDFlagNo() || methodIn.isIFlagNo() || methodIn.isOFlagNo()) {
        //  cobolCode::IF POL-RET-SVI-TBL-PRI-NBR > SPACES
        if ((isGreaterThanSpaces(methodOut.getPolRetSviTblPriNbr()))) {
          //  cobolCode::MOVE POL-RET-SVI-TBL-PRI-NBR TO BHI-REQ-SLOT-TABLE
          methodOut.setBhiReqSlotTable(methodOut.getPolRetSviTblPriNbr());
          //  cobolCode::PERFORM 4000-GET-HIPAA-BENEFITS
          getHipaaBenefits(
              programCtx.getGetHipaaBenefitsInCtx()); /*4000-GET-HIPAA-BENEFITS SECTION*/
          //  cobolCode::IF HSR-REQ-CONTRCT-FAIL-C-FUNC-RC
          if (methodIn.isHsrReqContrctFailCFuncRc()) {
            // cobolCode::GO TO 3500-EXIT
            return methodOut;
            // cobolCodeEnds::GO TO 3500-EXIT
          }
          //  cobolCode::IF BHI-RET-BHI-CNT = 0
          //  cobolCode::ELSE
          if ((methodIn.getBhiRetBhiCnt() != 0)) {
            //  cobolCode::ADD BHI-RET-BHI-CNT TO WS-BHI-CNT
            methodOut.setBhiCnt(methodOut.getBhiCnt() + methodIn.getBhiRetBhiCnt());
          }
          //  cobolCode::IF WS-BHI-ROW-FOUND
          if (methodIn.isBhiRowFound()) {
            //  cobolCode::MOVE 1 TO WS-BHI-SUB
            //  LITERAL_1 = 1
            methodOut.setBhiSub01(1);
            //  cobolCode::PERFORM VARYING BHI-SUB FROM WS-SUB2 BY 1 UNTIL BHI-SUB > WS-BHI-CNT
            for (methodOut.setBhiSub(methodOut.getSub2());
                ((methodOut.getBhiSub() <= methodOut.getBhiCnt()));
                methodOut.setBhiSub(methodOut.getBhiSub() + 1)) {
              //  cobolCode::PERFORM 4100-MOVE-BHI-FIELDS
              moveBhiFields(programCtx.getMoveBhiFieldsInCtx()); /*4100-MOVE-BHI-FIELDS SECTION*/
              //  cobolCode::PERFORM 5000-GET-SVC-CD-NBR
              getSvcCdNbr(programCtx.getGetSvcCdNbrInCtx()); /*5000-GET-SVC-CD-NBR SECTION*/
              //  cobolCode::ADD +1 TO WS-BHI-SUB
              methodOut.setBhiSub01(methodOut.getBhiSub01() + 1);
              //  cobolCode::IF HSR-REQ-CONTRCT-FAIL-C-FUNC-RC
              if (methodIn.isHsrReqContrctFailCFuncRc()) {
                // cobolCode::GO TO 3500-EXIT
                return methodOut;
                // cobolCodeEnds::GO TO 3500-EXIT
              }
            }
            //  cobolCode::ADD BHI-RET-BHI-CNT TO WS-SUB2
            methodOut.setSub2(methodOut.getSub2() + methodIn.getBhiRetBhiCnt());
          }
        }
      }
      //  cobolCode::IF WS-D-FLAG-NO OR WS-I-FLAG-NO OR WS-O-FLAG-NO
      if (methodIn.isDFlagNo() || methodIn.isIFlagNo() || methodIn.isOFlagNo()) {
        //  cobolCode::IF POL-RET-SLOT-TBL-ID > SPACES
        if ((isGreaterThanSpaces(methodOut.getPolRetSlotTblId()))) {
          //  cobolCode::MOVE POL-RET-SLOT-TBL-ID TO BHI-REQ-SLOT-TABLE
          methodOut.setBhiReqSlotTable(methodOut.getPolRetSlotTblId());
          //  cobolCode::PERFORM 4000-GET-HIPAA-BENEFITS
          getHipaaBenefits(
              programCtx.getGetHipaaBenefitsInCtx()); /*4000-GET-HIPAA-BENEFITS SECTION*/
          //  cobolCode::IF HSR-REQ-CONTRCT-FAIL-C-FUNC-RC
          if (methodIn.isHsrReqContrctFailCFuncRc()) {
            // cobolCode::GO TO 3500-EXIT
            return methodOut;
            // cobolCodeEnds::GO TO 3500-EXIT
          }
          //  cobolCode::IF BHI-RET-BHI-CNT = 0
          //  cobolCode::ELSE
          if ((methodIn.getBhiRetBhiCnt() != 0)) {
            //  cobolCode::ADD BHI-RET-BHI-CNT TO WS-BHI-CNT
            methodOut.setBhiCnt(methodOut.getBhiCnt() + methodIn.getBhiRetBhiCnt());
          }
          //  cobolCode::IF WS-BHI-ROW-FOUND
          if (methodIn.isBhiRowFound()) {
            //  cobolCode::MOVE 1 TO WS-BHI-SUB
            //  LITERAL_1 = 1
            methodOut.setBhiSub01(1);
            //  cobolCode::PERFORM VARYING BHI-SUB FROM WS-SUB2 BY 1 UNTIL BHI-SUB > WS-BHI-CNT
            for (methodOut.setBhiSub(methodOut.getSub2());
                ((methodOut.getBhiSub() <= methodOut.getBhiCnt()));
                methodOut.setBhiSub(methodOut.getBhiSub() + 1)) {
              //  cobolCode::PERFORM 4100-MOVE-BHI-FIELDS
              moveBhiFields(programCtx.getMoveBhiFieldsInCtx()); /*4100-MOVE-BHI-FIELDS SECTION*/
              //  cobolCode::PERFORM 5000-GET-SVC-CD-NBR
              getSvcCdNbr(programCtx.getGetSvcCdNbrInCtx()); /*5000-GET-SVC-CD-NBR SECTION*/
              //  cobolCode::ADD +1 TO WS-BHI-SUB
              methodOut.setBhiSub01(methodOut.getBhiSub01() + 1);
              //  cobolCode::IF HSR-REQ-CONTRCT-FAIL-C-FUNC-RC
              if (methodIn.isHsrReqContrctFailCFuncRc()) {
                // cobolCode::GO TO 3500-EXIT
                return methodOut;
                // cobolCodeEnds::GO TO 3500-EXIT
              }
            }
            //  cobolCode::ADD BHI-RET-BHI-CNT TO WS-SUB2
            methodOut.setSub2(methodOut.getSub2() + methodIn.getBhiRetBhiCnt());
          }
        }
      }
      //  cobolCode::IF WS-D-FLAG-NO OR WS-I-FLAG-NO OR WS-O-FLAG-NO
      if (methodIn.isDFlagNo() || methodIn.isIFlagNo() || methodIn.isOFlagNo()) {
        //  cobolCode::IF POL-RET-SVI-TBL-TER-NBR > SPACES
        if ((isGreaterThanSpaces(methodOut.getPolRetSviTblTerNbr()))) {
          //  cobolCode::MOVE POL-RET-SVI-TBL-TER-NBR TO BHI-REQ-SLOT-TABLE
          methodOut.setBhiReqSlotTable(methodOut.getPolRetSviTblTerNbr());
          //  cobolCode::PERFORM 4000-GET-HIPAA-BENEFITS
          getHipaaBenefits(
              programCtx.getGetHipaaBenefitsInCtx()); /*4000-GET-HIPAA-BENEFITS SECTION*/
          //  cobolCode::IF HSR-REQ-CONTRCT-FAIL-C-FUNC-RC
          if (methodIn.isHsrReqContrctFailCFuncRc()) {
            // cobolCode::GO TO 3500-EXIT
            return methodOut;
            // cobolCodeEnds::GO TO 3500-EXIT
          }
          //  cobolCode::IF BHI-RET-BHI-CNT = 0
          //  cobolCode::ELSE
          if ((methodIn.getBhiRetBhiCnt() != 0)) {
            //  cobolCode::ADD BHI-RET-BHI-CNT TO WS-BHI-CNT
            methodOut.setBhiCnt(methodOut.getBhiCnt() + methodIn.getBhiRetBhiCnt());
          }
          //  cobolCode::IF WS-BHI-ROW-FOUND
          if (methodIn.isBhiRowFound()) {
            //  cobolCode::MOVE 1 TO WS-BHI-SUB
            //  LITERAL_1 = 1
            methodOut.setBhiSub01(1);
            //  cobolCode::PERFORM VARYING BHI-SUB FROM WS-SUB2 BY 1 UNTIL BHI-SUB > WS-BHI-CNT
            for (methodOut.setBhiSub(methodOut.getSub2());
                ((methodOut.getBhiSub() <= methodOut.getBhiCnt()));
                methodOut.setBhiSub(methodOut.getBhiSub() + 1)) {
              //  cobolCode::PERFORM 4100-MOVE-BHI-FIELDS
              moveBhiFields(programCtx.getMoveBhiFieldsInCtx()); /*4100-MOVE-BHI-FIELDS SECTION*/
              //  cobolCode::PERFORM 5000-GET-SVC-CD-NBR
              getSvcCdNbr(programCtx.getGetSvcCdNbrInCtx()); /*5000-GET-SVC-CD-NBR SECTION*/
              //  cobolCode::ADD +1 TO WS-BHI-SUB
              methodOut.setBhiSub01(methodOut.getBhiSub01() + 1);
              //  cobolCode::IF HSR-REQ-CONTRCT-FAIL-C-FUNC-RC
              if (methodIn.isHsrReqContrctFailCFuncRc()) {
                // cobolCode::GO TO 3500-EXIT
                return methodOut;
                // cobolCodeEnds::GO TO 3500-EXIT
              }
            }
            //  cobolCode::ADD BHI-RET-BHI-CNT TO WS-SUB2
            methodOut.setSub2(methodOut.getSub2() + methodIn.getBhiRetBhiCnt());
          }
        }
      }
      //  cobolCode::IF WS-D-FLAG-NO OR WS-I-FLAG-NO OR WS-O-FLAG-NO
      if (methodIn.isDFlagNo() || methodIn.isIFlagNo() || methodIn.isOFlagNo()) {
        //  cobolCode::IF POL-RET-SLOT-018 > SPACES
        if ((isGreaterThanSpaces(methodOut.getPolRetSlot018()))) {
          //  cobolCode::MOVE POL-RET-SLOT-018 TO BHI-REQ-SLOT-TABLE
          methodOut.setBhiReqSlotTable(methodOut.getPolRetSlot018());
          //  cobolCode::PERFORM 4000-GET-HIPAA-BENEFITS
          getHipaaBenefits(
              programCtx.getGetHipaaBenefitsInCtx()); /*4000-GET-HIPAA-BENEFITS SECTION*/
          //  cobolCode::IF HSR-REQ-CONTRCT-FAIL-C-FUNC-RC
          if (methodIn.isHsrReqContrctFailCFuncRc()) {
            // cobolCode::GO TO 3500-EXIT
            return methodOut;
            // cobolCodeEnds::GO TO 3500-EXIT
          }
          //  cobolCode::IF BHI-RET-BHI-CNT = 0
          //  cobolCode::ELSE
          if ((methodIn.getBhiRetBhiCnt() != 0)) {
            //  cobolCode::ADD BHI-RET-BHI-CNT TO WS-BHI-CNT
            methodOut.setBhiCnt(methodOut.getBhiCnt() + methodIn.getBhiRetBhiCnt());
          }
          //  cobolCode::IF WS-BHI-ROW-FOUND
          if (methodIn.isBhiRowFound()) {
            //  cobolCode::MOVE 1 TO WS-BHI-SUB
            //  LITERAL_1 = 1
            methodOut.setBhiSub01(1);
            //  cobolCode::PERFORM VARYING BHI-SUB FROM WS-SUB2 BY 1 UNTIL BHI-SUB > WS-BHI-CNT
            for (methodOut.setBhiSub(methodOut.getSub2());
                ((methodOut.getBhiSub() <= methodOut.getBhiCnt()));
                methodOut.setBhiSub(methodOut.getBhiSub() + 1)) {
              //  cobolCode::PERFORM 4100-MOVE-BHI-FIELDS
              moveBhiFields(programCtx.getMoveBhiFieldsInCtx()); /*4100-MOVE-BHI-FIELDS SECTION*/
              //  cobolCode::PERFORM 5000-GET-SVC-CD-NBR
              getSvcCdNbr(programCtx.getGetSvcCdNbrInCtx()); /*5000-GET-SVC-CD-NBR SECTION*/
              //  cobolCode::ADD +1 TO WS-BHI-SUB
              methodOut.setBhiSub01(methodOut.getBhiSub01() + 1);
              //  cobolCode::IF HSR-REQ-CONTRCT-FAIL-C-FUNC-RC
              if (methodIn.isHsrReqContrctFailCFuncRc()) {
                // cobolCode::GO TO 3500-EXIT
                return methodOut;
                // cobolCodeEnds::GO TO 3500-EXIT
              }
            }
            //  cobolCode::ADD BHI-RET-BHI-CNT TO WS-SUB2
            methodOut.setSub2(methodOut.getSub2() + methodIn.getBhiRetBhiCnt());
          }
        }
      }
      //  cobolCode::IF WS-D-FLAG-NO OR WS-I-FLAG-NO OR WS-O-FLAG-NO
      if (methodIn.isDFlagNo() || methodIn.isIFlagNo() || methodIn.isOFlagNo()) {
        //  cobolCode::IF POL-RET-SLOT-019 > SPACES
        if ((isGreaterThanSpaces(methodOut.getPolRetSlot019()))) {
          //  cobolCode::MOVE POL-RET-SLOT-019 TO BHI-REQ-SLOT-TABLE
          methodOut.setBhiReqSlotTable(methodOut.getPolRetSlot019());
          //  cobolCode::PERFORM 4000-GET-HIPAA-BENEFITS
          getHipaaBenefits(
              programCtx.getGetHipaaBenefitsInCtx()); /*4000-GET-HIPAA-BENEFITS SECTION*/
          //  cobolCode::IF HSR-REQ-CONTRCT-FAIL-C-FUNC-RC
          if (methodIn.isHsrReqContrctFailCFuncRc()) {
            // cobolCode::GO TO 3500-EXIT
            return methodOut;
            // cobolCodeEnds::GO TO 3500-EXIT
          }
          //  cobolCode::IF BHI-RET-BHI-CNT = 0
          //  cobolCode::ELSE
          if ((methodIn.getBhiRetBhiCnt() != 0)) {
            //  cobolCode::ADD BHI-RET-BHI-CNT TO WS-BHI-CNT
            methodOut.setBhiCnt(methodOut.getBhiCnt() + methodIn.getBhiRetBhiCnt());
          }
          //  cobolCode::IF WS-BHI-ROW-FOUND
          if (methodIn.isBhiRowFound()) {
            //  cobolCode::MOVE 1 TO WS-BHI-SUB
            //  LITERAL_1 = 1
            methodOut.setBhiSub01(1);
            //  cobolCode::PERFORM VARYING BHI-SUB FROM WS-SUB2 BY 1 UNTIL BHI-SUB > WS-BHI-CNT
            for (methodOut.setBhiSub(methodOut.getSub2());
                ((methodOut.getBhiSub() <= methodOut.getBhiCnt()));
                methodOut.setBhiSub(methodOut.getBhiSub() + 1)) {
              //  cobolCode::PERFORM 4100-MOVE-BHI-FIELDS
              moveBhiFields(programCtx.getMoveBhiFieldsInCtx()); /*4100-MOVE-BHI-FIELDS SECTION*/
              //  cobolCode::PERFORM 5000-GET-SVC-CD-NBR
              getSvcCdNbr(programCtx.getGetSvcCdNbrInCtx()); /*5000-GET-SVC-CD-NBR SECTION*/
              //  cobolCode::ADD +1 TO WS-BHI-SUB
              methodOut.setBhiSub01(methodOut.getBhiSub01() + 1);
              //  cobolCode::IF HSR-REQ-CONTRCT-FAIL-C-FUNC-RC
              if (methodIn.isHsrReqContrctFailCFuncRc()) {
                // cobolCode::GO TO 3500-EXIT
                return methodOut;
                // cobolCodeEnds::GO TO 3500-EXIT
              }
            }
            //  cobolCode::ADD BHI-RET-BHI-CNT TO WS-SUB2
            methodOut.setSub2(methodOut.getSub2() + methodIn.getBhiRetBhiCnt());
          }
        }
      }
      //  cobolCode::IF WS-D-FLAG-NO OR WS-I-FLAG-NO OR WS-O-FLAG-NO
      if (methodIn.isDFlagNo() || methodIn.isIFlagNo() || methodIn.isOFlagNo()) {
        //  cobolCode::IF POL-RET-SLOT-020 > SPACES
        if ((isGreaterThanSpaces(methodOut.getPolRetSlot020()))) {
          //  cobolCode::MOVE POL-RET-SLOT-020 TO BHI-REQ-SLOT-TABLE
          methodOut.setBhiReqSlotTable(methodOut.getPolRetSlot020());
          //  cobolCode::PERFORM 4000-GET-HIPAA-BENEFITS
          getHipaaBenefits(
              programCtx.getGetHipaaBenefitsInCtx()); /*4000-GET-HIPAA-BENEFITS SECTION*/
          //  cobolCode::IF HSR-REQ-CONTRCT-FAIL-C-FUNC-RC
          if (methodIn.isHsrReqContrctFailCFuncRc()) {
            // cobolCode::GO TO 3500-EXIT
            return methodOut;
            // cobolCodeEnds::GO TO 3500-EXIT
          }
          //  cobolCode::IF BHI-RET-BHI-CNT = 0
          //  cobolCode::ELSE
          if ((methodIn.getBhiRetBhiCnt() != 0)) {
            //  cobolCode::ADD BHI-RET-BHI-CNT TO WS-BHI-CNT
            methodOut.setBhiCnt(methodOut.getBhiCnt() + methodIn.getBhiRetBhiCnt());
          }
          //  cobolCode::IF WS-BHI-ROW-FOUND
          if (methodIn.isBhiRowFound()) {
            //  cobolCode::MOVE 1 TO WS-BHI-SUB
            //  LITERAL_1 = 1
            methodOut.setBhiSub01(1);
            //  cobolCode::PERFORM VARYING BHI-SUB FROM WS-SUB2 BY 1 UNTIL BHI-SUB > WS-BHI-CNT
            for (methodOut.setBhiSub(methodOut.getSub2());
                ((methodOut.getBhiSub() <= methodOut.getBhiCnt()));
                methodOut.setBhiSub(methodOut.getBhiSub() + 1)) {
              //  cobolCode::PERFORM 4100-MOVE-BHI-FIELDS
              moveBhiFields(programCtx.getMoveBhiFieldsInCtx()); /*4100-MOVE-BHI-FIELDS SECTION*/
              //  cobolCode::PERFORM 5000-GET-SVC-CD-NBR
              getSvcCdNbr(programCtx.getGetSvcCdNbrInCtx()); /*5000-GET-SVC-CD-NBR SECTION*/
              //  cobolCode::ADD +1 TO WS-BHI-SUB
              methodOut.setBhiSub01(methodOut.getBhiSub01() + 1);
              //  cobolCode::IF HSR-REQ-CONTRCT-FAIL-C-FUNC-RC
              if (methodIn.isHsrReqContrctFailCFuncRc()) {
                // cobolCode::GO TO 3500-EXIT
                return methodOut;
                // cobolCodeEnds::GO TO 3500-EXIT
              }
            }
            //  cobolCode::ADD BHI-RET-BHI-CNT TO WS-SUB2
            methodOut.setSub2(methodOut.getSub2() + methodIn.getBhiRetBhiCnt());
          }
        }
      }
      //  cobolCode::IF WS-D-FLAG-NO OR WS-I-FLAG-NO OR WS-O-FLAG-NO
      if (methodIn.isDFlagNo() || methodIn.isIFlagNo() || methodIn.isOFlagNo()) {
        //  cobolCode::EVALUATE TRUE
        if (methodIn.isSet21()) {
          //  cobolCode::MOVE 'HCAN01' TO BHI-REQ-SLOT-TABLE
          //  LITERAL_HCAN01 = 'HCAN01'
          methodOut.setBhiReqSlotTable(CONSTANTS.LITERAL_HCAN01);
        } else if (methodIn.isSet22()) {
          //  cobolCode::MOVE 'HCAN02' TO BHI-REQ-SLOT-TABLE
          //  LITERAL_HCAN02 = 'HCAN02'
          methodOut.setBhiReqSlotTable(CONSTANTS.LITERAL_HCAN02);
        } else if (methodIn.isSet23()) {
          //  cobolCode::MOVE 'HCAN03' TO BHI-REQ-SLOT-TABLE
          //  LITERAL_HCAN03 = 'HCAN03'
          methodOut.setBhiReqSlotTable(CONSTANTS.LITERAL_HCAN03);
        } else if (methodIn.isSet27()) {
          //  cobolCode::MOVE 'HCAN04' TO BHI-REQ-SLOT-TABLE
          //  LITERAL_HCAN04 = 'HCAN04'
          methodOut.setBhiReqSlotTable(CONSTANTS.LITERAL_HCAN04);
        } else if (methodIn.isSet28()) {
          //  cobolCode::MOVE 'HCAN05' TO BHI-REQ-SLOT-TABLE
          //  LITERAL_HCAN05 = 'HCAN05'
          methodOut.setBhiReqSlotTable(CONSTANTS.LITERAL_HCAN05);
        } else if (methodIn.isSet30()) {
          //  cobolCode::MOVE 'HCAN06' TO BHI-REQ-SLOT-TABLE
          //  LITERAL_HCAN06 = 'HCAN06'
          methodOut.setBhiReqSlotTable(CONSTANTS.LITERAL_HCAN06);
        } else if (methodIn.isSet31()) {
          //  cobolCode::MOVE 'HCAN07' TO BHI-REQ-SLOT-TABLE
          //  LITERAL_HCAN07 = 'HCAN07'
          methodOut.setBhiReqSlotTable(CONSTANTS.LITERAL_HCAN07);
        } else if (methodIn.isSet32()) {
          //  cobolCode::MOVE 'HCAN08' TO BHI-REQ-SLOT-TABLE
          //  LITERAL_HCAN08 = 'HCAN08'
          methodOut.setBhiReqSlotTable(CONSTANTS.LITERAL_HCAN08);
        } else if (methodIn.isSet33()) {
          //  cobolCode::MOVE 'HCAN09' TO BHI-REQ-SLOT-TABLE
          //  LITERAL_HCAN09 = 'HCAN09'
          methodOut.setBhiReqSlotTable(CONSTANTS.LITERAL_HCAN09);
        } else if (methodIn.isSet34()) {
          //  cobolCode::MOVE 'HCAN10' TO BHI-REQ-SLOT-TABLE
          //  LITERAL_HCAN10 = 'HCAN10'
          methodOut.setBhiReqSlotTable(CONSTANTS.LITERAL_HCAN10);
        } else if (methodIn.isSet35()) {
          //  cobolCode::MOVE 'HCAN11' TO BHI-REQ-SLOT-TABLE
          //  LITERAL_HCAN11 = 'HCAN11'
          methodOut.setBhiReqSlotTable(CONSTANTS.LITERAL_HCAN11);
        } else if (methodIn.isSet36()) {
          //  cobolCode::MOVE 'HCAN12' TO BHI-REQ-SLOT-TABLE
          //  LITERAL_HCAN12 = 'HCAN12'
          methodOut.setBhiReqSlotTable(CONSTANTS.LITERAL_HCAN12);
        } else if (methodIn.isSet37()) {
          //  cobolCode::MOVE 'HCAN13' TO BHI-REQ-SLOT-TABLE
          //  LITERAL_HCAN13 = 'HCAN13'
          methodOut.setBhiReqSlotTable(CONSTANTS.LITERAL_HCAN13);
        } else if (methodIn.isSet38()) {
          //  cobolCode::MOVE 'HCAN14' TO BHI-REQ-SLOT-TABLE
          //  LITERAL_HCAN14 = 'HCAN14'
          methodOut.setBhiReqSlotTable(CONSTANTS.LITERAL_HCAN14);
        } else if (methodIn.isSet39()) {
          //  cobolCode::MOVE 'HCAN15' TO BHI-REQ-SLOT-TABLE
          //  LITERAL_HCAN15 = 'HCAN15'
          methodOut.setBhiReqSlotTable(CONSTANTS.LITERAL_HCAN15);
        } else if (methodIn.isSet40()) {
          //  cobolCode::MOVE 'HCAN16' TO BHI-REQ-SLOT-TABLE
          //  LITERAL_HCAN16 = 'HCAN16'
          methodOut.setBhiReqSlotTable(CONSTANTS.LITERAL_HCAN16);
        } else if (methodIn.isSet41()) {
          //  cobolCode::MOVE 'HCAN17' TO BHI-REQ-SLOT-TABLE
          //  LITERAL_HCAN17 = 'HCAN17'
          methodOut.setBhiReqSlotTable(CONSTANTS.LITERAL_HCAN17);
        } else if (methodIn.isSet42()) {
          //  cobolCode::MOVE 'HCAN18' TO BHI-REQ-SLOT-TABLE
          //  LITERAL_HCAN18 = 'HCAN18'
          methodOut.setBhiReqSlotTable(CONSTANTS.LITERAL_HCAN18);
        } else if (methodIn.isSet43()) {
          //  cobolCode::MOVE 'HCAN19' TO BHI-REQ-SLOT-TABLE
          //  LITERAL_HCAN19 = 'HCAN19'
          methodOut.setBhiReqSlotTable(CONSTANTS.LITERAL_HCAN19);
        } else if (methodIn.isSet44()) {
          //  cobolCode::MOVE 'HCAN20' TO BHI-REQ-SLOT-TABLE
          //  LITERAL_HCAN20 = 'HCAN20'
          methodOut.setBhiReqSlotTable(CONSTANTS.LITERAL_HCAN20);
        } else if (methodIn.isSet45()) {
          //  cobolCode::MOVE 'HCAN21' TO BHI-REQ-SLOT-TABLE
          //  LITERAL_HCAN21 = 'HCAN21'
          methodOut.setBhiReqSlotTable(CONSTANTS.LITERAL_HCAN21);
        } else if (methodIn.isSet46()) {
          //  cobolCode::MOVE 'HCAN22' TO BHI-REQ-SLOT-TABLE
          //  LITERAL_HCAN22 = 'HCAN22'
          methodOut.setBhiReqSlotTable(CONSTANTS.LITERAL_HCAN22);
        } else if (methodIn.isSet47()) {
          //  cobolCode::MOVE 'HCAN23' TO BHI-REQ-SLOT-TABLE
          //  LITERAL_HCAN23 = 'HCAN23'
          methodOut.setBhiReqSlotTable(CONSTANTS.LITERAL_HCAN23);
        } else if (methodIn.isSet48()) {
          //  cobolCode::MOVE 'HCAN24' TO BHI-REQ-SLOT-TABLE
          //  LITERAL_HCAN24 = 'HCAN24'
          methodOut.setBhiReqSlotTable(CONSTANTS.LITERAL_HCAN24);
        } else if (methodIn.isSet49()) {
          //  cobolCode::MOVE 'HCAN25' TO BHI-REQ-SLOT-TABLE
          //  LITERAL_HCAN25 = 'HCAN25'
          methodOut.setBhiReqSlotTable(CONSTANTS.LITERAL_HCAN25);
        } else if (methodIn.isSet50()) {
          //  cobolCode::MOVE 'HCAN26' TO BHI-REQ-SLOT-TABLE
          //  LITERAL_HCAN26 = 'HCAN26'
          methodOut.setBhiReqSlotTable(CONSTANTS.LITERAL_HCAN26);
        } else if (methodIn.isSet51()) {
          //  cobolCode::MOVE 'HCAN27' TO BHI-REQ-SLOT-TABLE
          //  LITERAL_HCAN27 = 'HCAN27'
          methodOut.setBhiReqSlotTable(CONSTANTS.LITERAL_HCAN27);
        } else if (methodIn.isSet52()) {
          //  cobolCode::MOVE 'HCAN28' TO BHI-REQ-SLOT-TABLE
          //  LITERAL_HCAN28 = 'HCAN28'
          methodOut.setBhiReqSlotTable(CONSTANTS.LITERAL_HCAN28);
        } else if (methodIn.isSet53()) {
          //  cobolCode::MOVE 'HCAN29' TO BHI-REQ-SLOT-TABLE
          //  LITERAL_HCAN29 = 'HCAN29'
          methodOut.setBhiReqSlotTable(CONSTANTS.LITERAL_HCAN29);
        } else if (methodIn.isEmpSet01()) {
          //  cobolCode::MOVE 'EMP001' TO BHI-REQ-SLOT-TABLE
          //  LITERAL_EMP001 = 'EMP001'
          methodOut.setBhiReqSlotTable(CONSTANTS.LITERAL_EMP001);
        } else if (methodIn.isEmpSet03()) {
          //  cobolCode::MOVE 'EMP002' TO BHI-REQ-SLOT-TABLE
          //  LITERAL_EMP002 = 'EMP002'
          methodOut.setBhiReqSlotTable(CONSTANTS.LITERAL_EMP002);
        } else if (methodIn.isEmpSet04()) {
          //  cobolCode::MOVE 'EMP003' TO BHI-REQ-SLOT-TABLE
          //  LITERAL_EMP003 = 'EMP003'
          methodOut.setBhiReqSlotTable(CONSTANTS.LITERAL_EMP003);
        } else if (methodIn.isEmpSet05()) {
          //  cobolCode::MOVE 'EMP004' TO BHI-REQ-SLOT-TABLE
          //  LITERAL_EMP004 = 'EMP004'
          methodOut.setBhiReqSlotTable(CONSTANTS.LITERAL_EMP004);
        } else if (methodIn.isEmpSet06()) {
          //  cobolCode::MOVE 'EMP005' TO BHI-REQ-SLOT-TABLE
          //  LITERAL_EMP005 = 'EMP005'
          methodOut.setBhiReqSlotTable(CONSTANTS.LITERAL_EMP005);
        } else if (methodIn.isEmpSet07()) {
          //  cobolCode::MOVE 'EMP006' TO BHI-REQ-SLOT-TABLE
          //  LITERAL_EMP006 = 'EMP006'
          methodOut.setBhiReqSlotTable(CONSTANTS.LITERAL_EMP006);
        } else if (methodIn.isEmpSet08()) {
          //  cobolCode::MOVE 'EMP007' TO BHI-REQ-SLOT-TABLE
          //  LITERAL_EMP007 = 'EMP007'
          methodOut.setBhiReqSlotTable(CONSTANTS.LITERAL_EMP007);
        } else if (methodIn.isEmpSet09()) {
          //  cobolCode::MOVE 'EMP008' TO BHI-REQ-SLOT-TABLE
          //  LITERAL_EMP008 = 'EMP008'
          methodOut.setBhiReqSlotTable(CONSTANTS.LITERAL_EMP008);
        } else if (methodIn.isEmpSet10()) {
          //  cobolCode::MOVE 'EMP009' TO BHI-REQ-SLOT-TABLE
          //  LITERAL_EMP009 = 'EMP009'
          methodOut.setBhiReqSlotTable(CONSTANTS.LITERAL_EMP009);
        } else if (methodIn.isEmpSet12()) {
          //  cobolCode::MOVE 'EMP010' TO BHI-REQ-SLOT-TABLE
          //  LITERAL_EMP010 = 'EMP010'
          methodOut.setBhiReqSlotTable(CONSTANTS.LITERAL_EMP010);
        } else if (methodIn.isEmpSet13()) {
          //  cobolCode::MOVE 'EMP011' TO BHI-REQ-SLOT-TABLE
          //  LITERAL_EMP011 = 'EMP011'
          methodOut.setBhiReqSlotTable(CONSTANTS.LITERAL_EMP011);
        } else if (methodIn.isEmpSet14()) {
          //  cobolCode::MOVE 'EMP012' TO BHI-REQ-SLOT-TABLE
          //  LITERAL_EMP012 = 'EMP012'
          methodOut.setBhiReqSlotTable(CONSTANTS.LITERAL_EMP012);
        } else if (methodIn.isEmpSet15()) {
          //  cobolCode::MOVE 'EMP013' TO BHI-REQ-SLOT-TABLE
          //  LITERAL_EMP013 = 'EMP013'
          methodOut.setBhiReqSlotTable(CONSTANTS.LITERAL_EMP013);
        } else if (methodIn.isEmpSet16()) {
          //  cobolCode::MOVE 'EMP014' TO BHI-REQ-SLOT-TABLE
          //  LITERAL_EMP014 = 'EMP014'
          methodOut.setBhiReqSlotTable(CONSTANTS.LITERAL_EMP014);
        } else if (methodIn.isEmpSet17()) {
          //  cobolCode::MOVE 'EMP015' TO BHI-REQ-SLOT-TABLE
          //  LITERAL_EMP015 = 'EMP015'
          methodOut.setBhiReqSlotTable(CONSTANTS.LITERAL_EMP015);
        } else if (methodIn.isEmpSet18()) {
          //  cobolCode::MOVE 'EMP016' TO BHI-REQ-SLOT-TABLE
          //  LITERAL_EMP016 = 'EMP016'
          methodOut.setBhiReqSlotTable(CONSTANTS.LITERAL_EMP016);
        } else if (methodIn.isEmpSet19()) {
          //  cobolCode::MOVE 'EMP017' TO BHI-REQ-SLOT-TABLE
          //  LITERAL_EMP017 = 'EMP017'
          methodOut.setBhiReqSlotTable(CONSTANTS.LITERAL_EMP017);
        } else if (methodIn.isEmpSet20()) {
          //  cobolCode::MOVE 'EMP018' TO BHI-REQ-SLOT-TABLE
          //  LITERAL_EMP018 = 'EMP018'
          methodOut.setBhiReqSlotTable(CONSTANTS.LITERAL_EMP018);
        } else if (methodIn.isEmpSet21()) {
          //  cobolCode::MOVE 'EMP019' TO BHI-REQ-SLOT-TABLE
          //  LITERAL_EMP019 = 'EMP019'
          methodOut.setBhiReqSlotTable(CONSTANTS.LITERAL_EMP019);
        } else if (methodIn.isEmpSet22()) {
          //  cobolCode::MOVE 'EMP020' TO BHI-REQ-SLOT-TABLE
          //  LITERAL_EMP020 = 'EMP020'
          methodOut.setBhiReqSlotTable(CONSTANTS.LITERAL_EMP020);
        } else if (methodIn.isEmpSet23()) {
          //  cobolCode::MOVE 'EMP021' TO BHI-REQ-SLOT-TABLE
          //  LITERAL_EMP021 = 'EMP021'
          methodOut.setBhiReqSlotTable(CONSTANTS.LITERAL_EMP021);
        } else if (methodIn.isEmpSet27()) {
          //  cobolCode::MOVE 'EMP022' TO BHI-REQ-SLOT-TABLE
          //  LITERAL_EMP022 = 'EMP022'
          methodOut.setBhiReqSlotTable(CONSTANTS.LITERAL_EMP022);
        } else if (methodIn.isEmpSet28()) {
          //  cobolCode::MOVE 'EMP023' TO BHI-REQ-SLOT-TABLE
          //  LITERAL_EMP023 = 'EMP023'
          methodOut.setBhiReqSlotTable(CONSTANTS.LITERAL_EMP023);
        } else if (methodIn.isEmpSet29()) {
          //  cobolCode::MOVE 'EMP024' TO BHI-REQ-SLOT-TABLE
          //  LITERAL_EMP024 = 'EMP024'
          methodOut.setBhiReqSlotTable(CONSTANTS.LITERAL_EMP024);
        } else if (methodIn.isEmpSet30()) {
          //  cobolCode::MOVE 'EMP025' TO BHI-REQ-SLOT-TABLE
          //  LITERAL_EMP025 = 'EMP025'
          methodOut.setBhiReqSlotTable(CONSTANTS.LITERAL_EMP025);
        } else if (methodIn.isEmpSet31()) {
          //  cobolCode::MOVE 'EMP026' TO BHI-REQ-SLOT-TABLE
          //  LITERAL_EMP026 = 'EMP026'
          methodOut.setBhiReqSlotTable(CONSTANTS.LITERAL_EMP026);
        } else if (methodIn.isEmpSet32()) {
          //  cobolCode::MOVE 'EMP027' TO BHI-REQ-SLOT-TABLE
          //  LITERAL_EMP027 = 'EMP027'
          methodOut.setBhiReqSlotTable(CONSTANTS.LITERAL_EMP027);
        } else if (methodIn.isEmpSet33()) {
          //  cobolCode::MOVE 'EMP028' TO BHI-REQ-SLOT-TABLE
          //  LITERAL_EMP028 = 'EMP028'
          methodOut.setBhiReqSlotTable(CONSTANTS.LITERAL_EMP028);
        } else if (methodIn.isEmpSet34()) {
          //  cobolCode::MOVE 'EMP029' TO BHI-REQ-SLOT-TABLE
          //  LITERAL_EMP029 = 'EMP029'
          methodOut.setBhiReqSlotTable(CONSTANTS.LITERAL_EMP029);
        } else if (methodIn.isEmpSet35()) {
          //  cobolCode::MOVE 'EMP030' TO BHI-REQ-SLOT-TABLE
          //  LITERAL_EMP030 = 'EMP030'
          methodOut.setBhiReqSlotTable(CONSTANTS.LITERAL_EMP030);
        } else if (methodIn.isEmpSet36()) {
          //  cobolCode::MOVE 'EMP031' TO BHI-REQ-SLOT-TABLE
          //  LITERAL_EMP031 = 'EMP031'
          methodOut.setBhiReqSlotTable(CONSTANTS.LITERAL_EMP031);
        } else if (methodIn.isEmpSet37()) {
          //  cobolCode::MOVE 'EMP032' TO BHI-REQ-SLOT-TABLE
          //  LITERAL_EMP032 = 'EMP032'
          methodOut.setBhiReqSlotTable(CONSTANTS.LITERAL_EMP032);
        } else if (methodIn.isEmpSet38()) {
          //  cobolCode::MOVE 'EMP033' TO BHI-REQ-SLOT-TABLE
          //  LITERAL_EMP033 = 'EMP033'
          methodOut.setBhiReqSlotTable(CONSTANTS.LITERAL_EMP033);
        } else if (methodIn.isEmpSet39()) {
          //  cobolCode::MOVE 'EMP034' TO BHI-REQ-SLOT-TABLE
          //  LITERAL_EMP034 = 'EMP034'
          methodOut.setBhiReqSlotTable(CONSTANTS.LITERAL_EMP034);
        } else if (methodIn.isEmpSet40()) {
          //  cobolCode::MOVE 'EMP035' TO BHI-REQ-SLOT-TABLE
          //  LITERAL_EMP035 = 'EMP035'
          methodOut.setBhiReqSlotTable(CONSTANTS.LITERAL_EMP035);
        } else if (methodIn.isEmpSet41()) {
          //  cobolCode::MOVE 'EMP036' TO BHI-REQ-SLOT-TABLE
          //  LITERAL_EMP036 = 'EMP036'
          methodOut.setBhiReqSlotTable(CONSTANTS.LITERAL_EMP036);
        } else if (methodIn.isEmpSet42()) {
          //  cobolCode::MOVE 'EMP037' TO BHI-REQ-SLOT-TABLE
          //  LITERAL_EMP037 = 'EMP037'
          methodOut.setBhiReqSlotTable(CONSTANTS.LITERAL_EMP037);
        } else if (methodIn.isEmpSet43()) {
          //  cobolCode::MOVE 'EMP038' TO BHI-REQ-SLOT-TABLE
          //  LITERAL_EMP038 = 'EMP038'
          methodOut.setBhiReqSlotTable(CONSTANTS.LITERAL_EMP038);
        } else if (methodIn.isEmpSet44()) {
          //  cobolCode::MOVE 'EMP039' TO BHI-REQ-SLOT-TABLE
          //  LITERAL_EMP039 = 'EMP039'
          methodOut.setBhiReqSlotTable(CONSTANTS.LITERAL_EMP039);
        } else if (methodIn.isEmpSet45()) {
          //  cobolCode::MOVE 'EMP040' TO BHI-REQ-SLOT-TABLE
          //  LITERAL_EMP040 = 'EMP040'
          methodOut.setBhiReqSlotTable(CONSTANTS.LITERAL_EMP040);
        } else if (methodIn.isEmpSet46()) {
          //  cobolCode::MOVE 'EMP041' TO BHI-REQ-SLOT-TABLE
          //  LITERAL_EMP041 = 'EMP041'
          methodOut.setBhiReqSlotTable(CONSTANTS.LITERAL_EMP041);
        } else if (methodIn.isEmpSet47()) {
          //  cobolCode::MOVE 'EMP042' TO BHI-REQ-SLOT-TABLE
          //  LITERAL_EMP042 = 'EMP042'
          methodOut.setBhiReqSlotTable(CONSTANTS.LITERAL_EMP042);
        } else if (methodIn.isEmpSet48()) {
          //  cobolCode::MOVE 'EMP043' TO BHI-REQ-SLOT-TABLE
          //  LITERAL_EMP043 = 'EMP043'
          methodOut.setBhiReqSlotTable(CONSTANTS.LITERAL_EMP043);
        } else if (methodIn.isEmpSet49()) {
          //  cobolCode::MOVE 'EMP044' TO BHI-REQ-SLOT-TABLE
          //  LITERAL_EMP044 = 'EMP044'
          methodOut.setBhiReqSlotTable(CONSTANTS.LITERAL_EMP044);
        } else if (methodIn.isEmpSet50()) {
          //  cobolCode::MOVE 'EMP045' TO BHI-REQ-SLOT-TABLE
          //  LITERAL_EMP045 = 'EMP045'
          methodOut.setBhiReqSlotTable(CONSTANTS.LITERAL_EMP045);
        } else if (methodIn.isEmpSet51()) {
          //  cobolCode::MOVE 'EMP046' TO BHI-REQ-SLOT-TABLE
          //  LITERAL_EMP046 = 'EMP046'
          methodOut.setBhiReqSlotTable(CONSTANTS.LITERAL_EMP046);
        } else if (methodIn.isEmpSet52()) {
          //  cobolCode::MOVE 'EMP047' TO BHI-REQ-SLOT-TABLE
          //  LITERAL_EMP047 = 'EMP047'
          methodOut.setBhiReqSlotTable(CONSTANTS.LITERAL_EMP047);
        } else if (methodIn.isEmpSet81()) {
          //  cobolCode::MOVE 'EMP048' TO BHI-REQ-SLOT-TABLE
          //  LITERAL_EMP048 = 'EMP048'
          methodOut.setBhiReqSlotTable(CONSTANTS.LITERAL_EMP048);
        } else if (methodIn.isEmpSet82()) {
          //  cobolCode::MOVE 'EMP049' TO BHI-REQ-SLOT-TABLE
          //  LITERAL_EMP049 = 'EMP049'
          methodOut.setBhiReqSlotTable(CONSTANTS.LITERAL_EMP049);
        } else if (methodIn.isEmpSet83()) {
          //  cobolCode::MOVE 'EMP050' TO BHI-REQ-SLOT-TABLE
          //  LITERAL_EMP050 = 'EMP050'
          methodOut.setBhiReqSlotTable(CONSTANTS.LITERAL_EMP050);
        } else if (methodIn.isEmpSet84()) {
          //  cobolCode::MOVE 'EMP051' TO BHI-REQ-SLOT-TABLE
          //  LITERAL_EMP051 = 'EMP051'
          methodOut.setBhiReqSlotTable(CONSTANTS.LITERAL_EMP051);
        } else if (methodIn.isEmpSet87()) {
          //  cobolCode::MOVE 'EMP052' TO BHI-REQ-SLOT-TABLE
          //  LITERAL_EMP052 = 'EMP052'
          methodOut.setBhiReqSlotTable(CONSTANTS.LITERAL_EMP052);
        } else if (methodIn.isEmpSet144()) {
          //  cobolCode::MOVE 'EMP053' TO BHI-REQ-SLOT-TABLE
          //  LITERAL_EMP053 = 'EMP053'
          methodOut.setBhiReqSlotTable(CONSTANTS.LITERAL_EMP053);
        } else if (methodIn.isEmpSet145()) {
          //  cobolCode::MOVE 'EMP054' TO BHI-REQ-SLOT-TABLE
          //  LITERAL_EMP054 = 'EMP054'
          methodOut.setBhiReqSlotTable(CONSTANTS.LITERAL_EMP054);
        } else if (methodIn.isEmpSet148()) {
          //  cobolCode::MOVE 'EMP055' TO BHI-REQ-SLOT-TABLE
          //  LITERAL_EMP055 = 'EMP055'
          methodOut.setBhiReqSlotTable(CONSTANTS.LITERAL_EMP055);
        } else if (methodIn.isEmpSet149()) {
          //  cobolCode::MOVE 'EMP056' TO BHI-REQ-SLOT-TABLE
          //  LITERAL_EMP056 = 'EMP056'
          methodOut.setBhiReqSlotTable(CONSTANTS.LITERAL_EMP056);
        } else if (methodIn.isEmpSet153()) {
          //  cobolCode::MOVE 'EMP057' TO BHI-REQ-SLOT-TABLE
          //  LITERAL_EMP057 = 'EMP057'
          methodOut.setBhiReqSlotTable(CONSTANTS.LITERAL_EMP057);
        } else if (methodIn.isEmpSet154()) {
          //  cobolCode::MOVE 'EMP058' TO BHI-REQ-SLOT-TABLE
          //  LITERAL_EMP058 = 'EMP058'
          methodOut.setBhiReqSlotTable(CONSTANTS.LITERAL_EMP058);
        } else if (methodIn.isEmpSet157()) {
          //  cobolCode::MOVE 'EMP059' TO BHI-REQ-SLOT-TABLE
          //  LITERAL_EMP059 = 'EMP059'
          methodOut.setBhiReqSlotTable(CONSTANTS.LITERAL_EMP059);
        } else if (methodIn.isEmpSet158()) {
          //  cobolCode::MOVE 'EMP060' TO BHI-REQ-SLOT-TABLE
          //  LITERAL_EMP060 = 'EMP060'
          methodOut.setBhiReqSlotTable(CONSTANTS.LITERAL_EMP060);
        } else if (methodIn.isEmpSet159()) {
          //  cobolCode::MOVE 'EMP061' TO BHI-REQ-SLOT-TABLE
          //  LITERAL_EMP061 = 'EMP061'
          methodOut.setBhiReqSlotTable(CONSTANTS.LITERAL_EMP061);
        } else if (methodIn.isEmpSet160()) {
          //  cobolCode::MOVE 'EMP062' TO BHI-REQ-SLOT-TABLE
          //  LITERAL_EMP062 = 'EMP062'
          methodOut.setBhiReqSlotTable(CONSTANTS.LITERAL_EMP062);
        } else if (methodIn.isEmpSet161()) {
          //  cobolCode::MOVE 'EMP063' TO BHI-REQ-SLOT-TABLE
          //  LITERAL_EMP063 = 'EMP063'
          methodOut.setBhiReqSlotTable(CONSTANTS.LITERAL_EMP063);
        } else if (methodIn.isEmpSet162()) {
          //  cobolCode::MOVE 'EMP064' TO BHI-REQ-SLOT-TABLE
          //  LITERAL_EMP064 = 'EMP064'
          methodOut.setBhiReqSlotTable(CONSTANTS.LITERAL_EMP064);
        } else if (methodIn.isEmpSet163()) {
          //  cobolCode::MOVE 'EMP065' TO BHI-REQ-SLOT-TABLE
          //  LITERAL_EMP065 = 'EMP065'
          methodOut.setBhiReqSlotTable(CONSTANTS.LITERAL_EMP065);
        } else if (methodIn.isEmpSet164()) {
          //  cobolCode::MOVE 'EMP066' TO BHI-REQ-SLOT-TABLE
          //  LITERAL_EMP066 = 'EMP066'
          methodOut.setBhiReqSlotTable(CONSTANTS.LITERAL_EMP066);
        } else if (methodIn.isEmpSet165()) {
          //  cobolCode::MOVE 'EMP067' TO BHI-REQ-SLOT-TABLE
          //  LITERAL_EMP067 = 'EMP067'
          methodOut.setBhiReqSlotTable(CONSTANTS.LITERAL_EMP067);
        } else if (methodIn.isEmpSet166()) {
          //  cobolCode::MOVE 'EMP068' TO BHI-REQ-SLOT-TABLE
          //  LITERAL_EMP068 = 'EMP068'
          methodOut.setBhiReqSlotTable(CONSTANTS.LITERAL_EMP068);
        } else if (methodIn.isEmpSet167()) {
          //  cobolCode::MOVE 'EMP069' TO BHI-REQ-SLOT-TABLE
          //  LITERAL_EMP069 = 'EMP069'
          methodOut.setBhiReqSlotTable(CONSTANTS.LITERAL_EMP069);
        } else if (methodIn.isEmpSet168()) {
          //  cobolCode::MOVE 'EMP070' TO BHI-REQ-SLOT-TABLE
          //  LITERAL_EMP070 = 'EMP070'
          methodOut.setBhiReqSlotTable(CONSTANTS.LITERAL_EMP070);
        } else if (methodIn.isEmpSet169()) {
          //  cobolCode::MOVE 'EMP071' TO BHI-REQ-SLOT-TABLE
          //  LITERAL_EMP071 = 'EMP071'
          methodOut.setBhiReqSlotTable(CONSTANTS.LITERAL_EMP071);
        } else if (methodIn.isEmpSet170()) {
          //  cobolCode::MOVE 'EMP072' TO BHI-REQ-SLOT-TABLE
          //  LITERAL_EMP072 = 'EMP072'
          methodOut.setBhiReqSlotTable(CONSTANTS.LITERAL_EMP072);
        } else if (methodIn.isEmpSet171()) {
          //  cobolCode::MOVE 'EMP073' TO BHI-REQ-SLOT-TABLE
          //  LITERAL_EMP073 = 'EMP073'
          methodOut.setBhiReqSlotTable(CONSTANTS.LITERAL_EMP073);
        } else if (methodIn.isEmpSet172()) {
          //  cobolCode::MOVE 'EMP074' TO BHI-REQ-SLOT-TABLE
          //  LITERAL_EMP074 = 'EMP074'
          methodOut.setBhiReqSlotTable(CONSTANTS.LITERAL_EMP074);
        } else if (methodIn.isEmpSet195()) {
          //  cobolCode::MOVE 'EMP075' TO BHI-REQ-SLOT-TABLE
          //  LITERAL_EMP075 = 'EMP075'
          methodOut.setBhiReqSlotTable(CONSTANTS.LITERAL_EMP075);
        } else if (methodIn.isEmpSet196()) {
          //  cobolCode::MOVE 'EMP076' TO BHI-REQ-SLOT-TABLE
          //  LITERAL_EMP076 = 'EMP076'
          methodOut.setBhiReqSlotTable(CONSTANTS.LITERAL_EMP076);
        } else if (methodIn.isEmpSet197()) {
          //  cobolCode::MOVE 'EMP077' TO BHI-REQ-SLOT-TABLE
          //  LITERAL_EMP077 = 'EMP077'
          methodOut.setBhiReqSlotTable(CONSTANTS.LITERAL_EMP077);
        } else if (methodIn.isEmpSet198()) {
          //  cobolCode::MOVE 'EMP078' TO BHI-REQ-SLOT-TABLE
          //  LITERAL_EMP078 = 'EMP078'
          methodOut.setBhiReqSlotTable(CONSTANTS.LITERAL_EMP078);
        } else if (methodIn.isEmpSet199()) {
          //  cobolCode::MOVE 'EMP079' TO BHI-REQ-SLOT-TABLE
          //  LITERAL_EMP079 = 'EMP079'
          methodOut.setBhiReqSlotTable(CONSTANTS.LITERAL_EMP079);
        } else if (methodIn.isEmpSet200()) {
          //  cobolCode::MOVE 'EMP080' TO BHI-REQ-SLOT-TABLE
          //  LITERAL_EMP080 = 'EMP080'
          methodOut.setBhiReqSlotTable(CONSTANTS.LITERAL_EMP080);
        } else if (methodIn.isEmpSet201()) {
          //  cobolCode::MOVE 'EMP081' TO BHI-REQ-SLOT-TABLE
          //  LITERAL_EMP081 = 'EMP081'
          methodOut.setBhiReqSlotTable(CONSTANTS.LITERAL_EMP081);
        } else if (methodIn.isEmpSet202()) {
          //  cobolCode::MOVE 'EMP082' TO BHI-REQ-SLOT-TABLE
          //  LITERAL_EMP082 = 'EMP082'
          methodOut.setBhiReqSlotTable(CONSTANTS.LITERAL_EMP082);
        } else if (methodIn.isEmpSet203()) {
          //  cobolCode::MOVE 'EMP083' TO BHI-REQ-SLOT-TABLE
          //  LITERAL_EMP083 = 'EMP083'
          methodOut.setBhiReqSlotTable(CONSTANTS.LITERAL_EMP083);
        } else if (methodIn.isEmpSet204()) {
          //  cobolCode::MOVE 'EMP084' TO BHI-REQ-SLOT-TABLE
          //  LITERAL_EMP084 = 'EMP084'
          methodOut.setBhiReqSlotTable(CONSTANTS.LITERAL_EMP084);
        } else if (methodIn.isEmpSet205()) {
          //  cobolCode::MOVE 'EMP085' TO BHI-REQ-SLOT-TABLE
          //  LITERAL_EMP085 = 'EMP085'
          methodOut.setBhiReqSlotTable(CONSTANTS.LITERAL_EMP085);
        } else if (methodIn.isEmpSet206()) {
          //  cobolCode::MOVE 'EMP086' TO BHI-REQ-SLOT-TABLE
          //  LITERAL_EMP086 = 'EMP086'
          methodOut.setBhiReqSlotTable(CONSTANTS.LITERAL_EMP086);
        } else if (methodIn.isEmpSet211()) {
          //  cobolCode::MOVE 'EMP087' TO BHI-REQ-SLOT-TABLE
          //  LITERAL_EMP087 = 'EMP087'
          methodOut.setBhiReqSlotTable(CONSTANTS.LITERAL_EMP087);
        } else if (methodIn.isEmpSet212()) {
          //  cobolCode::MOVE 'EMP088' TO BHI-REQ-SLOT-TABLE
          //  LITERAL_EMP088 = 'EMP088'
          methodOut.setBhiReqSlotTable(CONSTANTS.LITERAL_EMP088);
        } else if (methodIn.isEmpSet213()) {
          //  cobolCode::MOVE 'EMP089' TO BHI-REQ-SLOT-TABLE
          //  LITERAL_EMP089 = 'EMP089'
          methodOut.setBhiReqSlotTable(CONSTANTS.LITERAL_EMP089);
        } else if (methodIn.isEmpSet214()) {
          //  cobolCode::MOVE 'EMP090' TO BHI-REQ-SLOT-TABLE
          //  LITERAL_EMP090 = 'EMP090'
          methodOut.setBhiReqSlotTable(CONSTANTS.LITERAL_EMP090);
        } else if (methodIn.isEmpSet247()) {
          //  cobolCode::MOVE 'EMP091' TO BHI-REQ-SLOT-TABLE
          //  LITERAL_EMP091 = 'EMP091'
          methodOut.setBhiReqSlotTable(CONSTANTS.LITERAL_EMP091);
        } else if (methodIn.isEmpSet248()) {
          //  cobolCode::MOVE 'EMP092' TO BHI-REQ-SLOT-TABLE
          //  LITERAL_EMP092 = 'EMP092'
          methodOut.setBhiReqSlotTable(CONSTANTS.LITERAL_EMP092);
        } else if (methodIn.isEmpSet249()) {
          //  cobolCode::MOVE 'EMP093' TO BHI-REQ-SLOT-TABLE
          //  LITERAL_EMP093 = 'EMP093'
          methodOut.setBhiReqSlotTable(CONSTANTS.LITERAL_EMP093);
        } else if (methodIn.isEmpSet250()) {
          //  cobolCode::MOVE 'EMP094' TO BHI-REQ-SLOT-TABLE
          //  LITERAL_EMP094 = 'EMP094'
          methodOut.setBhiReqSlotTable(CONSTANTS.LITERAL_EMP094);
        } else if (methodIn.isEmpSet251()) {
          //  cobolCode::MOVE 'EMP095' TO BHI-REQ-SLOT-TABLE
          //  LITERAL_EMP095 = 'EMP095'
          methodOut.setBhiReqSlotTable(CONSTANTS.LITERAL_EMP095);
        } else if (methodIn.isEmpSet259()) {
          //  cobolCode::MOVE 'EMP096' TO BHI-REQ-SLOT-TABLE
          //  LITERAL_EMP096 = 'EMP096'
          methodOut.setBhiReqSlotTable(CONSTANTS.LITERAL_EMP096);
        } else if (methodIn.isEmpSet260()) {
          //  cobolCode::MOVE 'EMP097' TO BHI-REQ-SLOT-TABLE
          //  LITERAL_EMP097 = 'EMP097'
          methodOut.setBhiReqSlotTable(CONSTANTS.LITERAL_EMP097);
        } else if (methodIn.isEmpSet261()) {
          //  cobolCode::MOVE 'EMP098' TO BHI-REQ-SLOT-TABLE
          //  LITERAL_EMP098 = 'EMP098'
          methodOut.setBhiReqSlotTable(CONSTANTS.LITERAL_EMP098);
        } else if (methodIn.isEmpSet262()) {
          //  cobolCode::MOVE 'EMP099' TO BHI-REQ-SLOT-TABLE
          //  LITERAL_EMP099 = 'EMP099'
          methodOut.setBhiReqSlotTable(CONSTANTS.LITERAL_EMP099);
        } else if (methodIn.isEmpSet263()) {
          //  cobolCode::MOVE 'EMP100' TO BHI-REQ-SLOT-TABLE
          //  LITERAL_EMP100 = 'EMP100'
          methodOut.setBhiReqSlotTable(CONSTANTS.LITERAL_EMP100);
        } else if (methodIn.isEmpSet264()) {
          //  cobolCode::MOVE 'EMP101' TO BHI-REQ-SLOT-TABLE
          //  LITERAL_EMP101 = 'EMP101'
          methodOut.setBhiReqSlotTable(CONSTANTS.LITERAL_EMP101);
        } else if (methodIn.isEmpSet265()) {
          //  cobolCode::MOVE 'EMP102' TO BHI-REQ-SLOT-TABLE
          //  LITERAL_EMP102 = 'EMP102'
          methodOut.setBhiReqSlotTable(CONSTANTS.LITERAL_EMP102);
        } else if (methodIn.isEmpSet266()) {
          //  cobolCode::MOVE 'EMP103' TO BHI-REQ-SLOT-TABLE
          //  LITERAL_EMP103 = 'EMP103'
          methodOut.setBhiReqSlotTable(CONSTANTS.LITERAL_EMP103);
        } else if (methodIn.isEmpSet267()) {
          //  cobolCode::MOVE 'EMP104' TO BHI-REQ-SLOT-TABLE
          //  LITERAL_EMP104 = 'EMP104'
          methodOut.setBhiReqSlotTable(CONSTANTS.LITERAL_EMP104);
        } else if (methodIn.isEmpSet268()) {
          //  cobolCode::MOVE 'EMP105' TO BHI-REQ-SLOT-TABLE
          //  LITERAL_EMP105 = 'EMP105'
          methodOut.setBhiReqSlotTable(CONSTANTS.LITERAL_EMP105);
        } else if (methodIn.isEmpSet269()) {
          //  cobolCode::MOVE 'EMP106' TO BHI-REQ-SLOT-TABLE
          //  LITERAL_EMP106 = 'EMP106'
          methodOut.setBhiReqSlotTable(CONSTANTS.LITERAL_EMP106);
        } else if (methodIn.isEmpSet270()) {
          //  cobolCode::MOVE 'EMP107' TO BHI-REQ-SLOT-TABLE
          //  LITERAL_EMP107 = 'EMP107'
          methodOut.setBhiReqSlotTable(CONSTANTS.LITERAL_EMP107);
        } else if (methodIn.isEmpSet298()) {
          //  cobolCode::MOVE 'EMP108' TO BHI-REQ-SLOT-TABLE
          //  LITERAL_EMP108 = 'EMP108'
          methodOut.setBhiReqSlotTable(CONSTANTS.LITERAL_EMP108);
        } else if (methodIn.isEmpSet299()) {
          //  cobolCode::MOVE 'EMP109' TO BHI-REQ-SLOT-TABLE
          //  LITERAL_EMP109 = 'EMP109'
          methodOut.setBhiReqSlotTable(CONSTANTS.LITERAL_EMP109);
        } else if (methodIn.isEmpSet300()) {
          //  cobolCode::MOVE 'EMP110' TO BHI-REQ-SLOT-TABLE
          //  LITERAL_EMP110 = 'EMP110'
          methodOut.setBhiReqSlotTable(CONSTANTS.LITERAL_EMP110);
        } else if (methodIn.isEmpSet301()) {
          //  cobolCode::MOVE 'EMP111' TO BHI-REQ-SLOT-TABLE
          //  LITERAL_EMP111 = 'EMP111'
          methodOut.setBhiReqSlotTable(CONSTANTS.LITERAL_EMP111);
        } else if (methodIn.isEmpSet302()) {
          //  cobolCode::MOVE 'EMP112' TO BHI-REQ-SLOT-TABLE
          //  LITERAL_EMP112 = 'EMP112'
          methodOut.setBhiReqSlotTable(CONSTANTS.LITERAL_EMP112);
        } else if (methodIn.isEmpSet303()) {
          //  cobolCode::MOVE 'EMP113' TO BHI-REQ-SLOT-TABLE
          //  LITERAL_EMP113 = 'EMP113'
          methodOut.setBhiReqSlotTable(CONSTANTS.LITERAL_EMP113);
        } else if (methodIn.isEmpSet304()) {
          //  cobolCode::MOVE 'EMP114' TO BHI-REQ-SLOT-TABLE
          //  LITERAL_EMP114 = 'EMP114'
          methodOut.setBhiReqSlotTable(CONSTANTS.LITERAL_EMP114);
        } else if (methodIn.isEmpSet305()) {
          //  cobolCode::MOVE 'EMP115' TO BHI-REQ-SLOT-TABLE
          //  LITERAL_EMP115 = 'EMP115'
          methodOut.setBhiReqSlotTable(CONSTANTS.LITERAL_EMP115);
        } else if (methodIn.isEmpSet306()) {
          //  cobolCode::MOVE 'EMP116' TO BHI-REQ-SLOT-TABLE
          //  LITERAL_EMP116 = 'EMP116'
          methodOut.setBhiReqSlotTable(CONSTANTS.LITERAL_EMP116);
        } else if (methodIn.isEmpSet307()) {
          //  cobolCode::MOVE 'EMP117' TO BHI-REQ-SLOT-TABLE
          //  LITERAL_EMP117 = 'EMP117'
          methodOut.setBhiReqSlotTable(CONSTANTS.LITERAL_EMP117);
        } else if (methodIn.isEmpSet308()) {
          //  cobolCode::MOVE 'EMP118' TO BHI-REQ-SLOT-TABLE
          //  LITERAL_EMP118 = 'EMP118'
          methodOut.setBhiReqSlotTable(CONSTANTS.LITERAL_EMP118);
        } else if (methodIn.isEmpSet309()) {
          //  cobolCode::MOVE 'EMP119' TO BHI-REQ-SLOT-TABLE
          //  LITERAL_EMP119 = 'EMP119'
          methodOut.setBhiReqSlotTable(CONSTANTS.LITERAL_EMP119);
        } else if (methodIn.isEmpSet310()) {
          //  cobolCode::MOVE 'EMP120' TO BHI-REQ-SLOT-TABLE
          //  LITERAL_EMP120 = 'EMP120'
          methodOut.setBhiReqSlotTable(CONSTANTS.LITERAL_EMP120);
        } else if (methodIn.isEmpSet311()) {
          //  cobolCode::MOVE 'EMP121' TO BHI-REQ-SLOT-TABLE
          //  LITERAL_EMP121 = 'EMP121'
          methodOut.setBhiReqSlotTable(CONSTANTS.LITERAL_EMP121);
        } else if (methodIn.isEmpSet312()) {
          //  cobolCode::MOVE 'EMP122' TO BHI-REQ-SLOT-TABLE
          //  LITERAL_EMP122 = 'EMP122'
          methodOut.setBhiReqSlotTable(CONSTANTS.LITERAL_EMP122);
        } else if (methodIn.isEmpSet328()) {
          //  cobolCode::MOVE 'EMP123' TO BHI-REQ-SLOT-TABLE
          //  LITERAL_EMP123 = 'EMP123'
          methodOut.setBhiReqSlotTable(CONSTANTS.LITERAL_EMP123);
        } else if (methodIn.isEmpSet329()) {
          //  cobolCode::MOVE 'EMP124' TO BHI-REQ-SLOT-TABLE
          //  LITERAL_EMP124 = 'EMP124'
          methodOut.setBhiReqSlotTable(CONSTANTS.LITERAL_EMP124);
        } else if (methodIn.isEmpSet330()) {
          //  cobolCode::MOVE 'EMP125' TO BHI-REQ-SLOT-TABLE
          //  LITERAL_EMP125 = 'EMP125'
          methodOut.setBhiReqSlotTable(CONSTANTS.LITERAL_EMP125);
        } else if (methodIn.isEmpSet331()) {
          //  cobolCode::MOVE 'EMP126' TO BHI-REQ-SLOT-TABLE
          //  LITERAL_EMP126 = 'EMP126'
          methodOut.setBhiReqSlotTable(CONSTANTS.LITERAL_EMP126);
        } else if (methodIn.isEmpSet338()) {
          //  cobolCode::MOVE 'EMP127' TO BHI-REQ-SLOT-TABLE
          //  LITERAL_EMP127 = 'EMP127'
          methodOut.setBhiReqSlotTable(CONSTANTS.LITERAL_EMP127);
        } else if (methodIn.isEmpSet339()) {
          //  cobolCode::MOVE 'EMP128' TO BHI-REQ-SLOT-TABLE
          //  LITERAL_EMP128 = 'EMP128'
          methodOut.setBhiReqSlotTable(CONSTANTS.LITERAL_EMP128);
        } else if (methodIn.isEmpSet340()) {
          //  cobolCode::MOVE 'EMP129' TO BHI-REQ-SLOT-TABLE
          //  LITERAL_EMP129 = 'EMP129'
          methodOut.setBhiReqSlotTable(CONSTANTS.LITERAL_EMP129);
        } else if (methodIn.isEmpSet341()) {
          //  cobolCode::MOVE 'EMP130' TO BHI-REQ-SLOT-TABLE
          //  LITERAL_EMP130 = 'EMP130'
          methodOut.setBhiReqSlotTable(CONSTANTS.LITERAL_EMP130);
        } else if (methodIn.isEmpSet342()) {
          //  cobolCode::MOVE 'EMP131' TO BHI-REQ-SLOT-TABLE
          //  LITERAL_EMP131 = 'EMP131'
          methodOut.setBhiReqSlotTable(CONSTANTS.LITERAL_EMP131);
        } else if (methodIn.isEmpSet343()) {
          //  cobolCode::MOVE 'EMP132' TO BHI-REQ-SLOT-TABLE
          //  LITERAL_EMP132 = 'EMP132'
          methodOut.setBhiReqSlotTable(CONSTANTS.LITERAL_EMP132);
        } else if (methodIn.isEmpSet344()) {
          //  cobolCode::MOVE 'EMP133' TO BHI-REQ-SLOT-TABLE
          //  LITERAL_EMP133 = 'EMP133'
          methodOut.setBhiReqSlotTable(CONSTANTS.LITERAL_EMP133);
        } else if (methodIn.isEmpSet345()) {
          //  cobolCode::MOVE 'EMP134' TO BHI-REQ-SLOT-TABLE
          //  LITERAL_EMP134 = 'EMP134'
          methodOut.setBhiReqSlotTable(CONSTANTS.LITERAL_EMP134);
        } else {
          //  cobolCode::MOVE 'PSE001' TO BHI-REQ-SLOT-TABLE
          //  LITERAL_PSE001 = 'PSE001'
          methodOut.setBhiReqSlotTable(CONSTANTS.LITERAL_PSE001);
        }
        //  cobolCode::PERFORM 4000-GET-HIPAA-BENEFITS
        getHipaaBenefits(programCtx.getGetHipaaBenefitsInCtx()); /*4000-GET-HIPAA-BENEFITS SECTION*/
        //  cobolCode::IF HSR-REQ-CONTRCT-FAIL-C-FUNC-RC
        if (methodIn.isHsrReqContrctFailCFuncRc()) {
          // cobolCode::GO TO 3500-EXIT
          return methodOut;
          // cobolCodeEnds::GO TO 3500-EXIT
        }
        //  cobolCode::IF BHI-RET-BHI-CNT = 0
        //  cobolCode::ELSE
        if ((methodIn.getBhiRetBhiCnt() != 0)) {
          //  cobolCode::ADD BHI-RET-BHI-CNT TO WS-BHI-CNT
          methodOut.setBhiCnt(methodOut.getBhiCnt() + methodIn.getBhiRetBhiCnt());
        }
        //  cobolCode::IF WS-BHI-ROW-FOUND
        if (methodIn.isBhiRowFound()) {
          //  cobolCode::MOVE 1 TO WS-BHI-SUB
          //  LITERAL_1 = 1
          methodOut.setBhiSub01(1);
          //  cobolCode::PERFORM VARYING BHI-SUB FROM WS-SUB2 BY 1 UNTIL BHI-SUB > WS-BHI-CNT
          for (methodOut.setBhiSub(methodOut.getSub2());
              ((methodOut.getBhiSub() <= methodOut.getBhiCnt()));
              methodOut.setBhiSub(methodOut.getBhiSub() + 1)) {
            //  cobolCode::PERFORM 4100-MOVE-BHI-FIELDS
            moveBhiFields(programCtx.getMoveBhiFieldsInCtx()); /*4100-MOVE-BHI-FIELDS SECTION*/
            //  cobolCode::PERFORM 5000-GET-SVC-CD-NBR
            getSvcCdNbr(programCtx.getGetSvcCdNbrInCtx()); /*5000-GET-SVC-CD-NBR SECTION*/
            //  cobolCode::ADD +1 TO WS-BHI-SUB
            methodOut.setBhiSub01(methodOut.getBhiSub01() + 1);
            //  cobolCode::IF HSR-REQ-CONTRCT-FAIL-C-FUNC-RC
            if (methodIn.isHsrReqContrctFailCFuncRc()) {
              // cobolCode::GO TO 3500-EXIT
              return methodOut;
              // cobolCodeEnds::GO TO 3500-EXIT
            }
          }
        }
      }
      //  cobolCode::MOVE WS-BHI-CNT TO HSR-RET-NET-CNT ( WS-HPA-SUB )
      methodOut.setHsrRetNetCnt(methodOut.getHpaSub() - 1, methodOut.getBhiCnt());
      //  cobolCode::PERFORM 3800-SET-COV-IND
      setCovInd(programCtx.getSetCovIndInCtx()); /*3800-SET-COV-IND SECTION*/
    }

    return methodOut;
  }
  /**
   * processOldSvcMethod This method is derived from COBOL Paragraph - 3600-PROCESS-OLD-SVC-METHOD
   * SECTION COBOL Cyclomatic complexity - 172 Input :
   *
   * <p>- hpaSub COBOL Name: WS-HPA-SUB - hipaaCount COBOL Name: WS-HIPAA-COUNT - hcaPolicySets
   * COBOL Name: WS-HCA-POLICY-SETS - empPolicySets COBOL Name: WS-EMP-POLICY-SETS -
   * hsrReqContractRtnCd COBOL Name: HSR-REQ-CONTRACT-RTN-CD - bhiRetBhiCnt COBOL Name:
   * BHI-RET-BHI-CNT - bhiRowFndSw COBOL Name: WS-BHI-ROW-FND-SW - bhiSub COBOL Name: BHI-SUB
   *
   * <p>Output :
   *
   * <p>- hpaSub COBOL Name: WS-HPA-SUB - bhiReqSlotTable COBOL Name: BHI-REQ-SLOT-TABLE - bhiCnt
   * COBOL Name: WS-BHI-CNT - bhiRetBhiCnt COBOL Name: BHI-RET-BHI-CNT - bhiSub01 COBOL Name:
   * WS-BHI-SUB - bhiSub COBOL Name: BHI-SUB - hsrRetNetCnt COBOL Name: HSR-RET-NET-CNT
   *
   * @throws CFException
   */
  @Override
  public ProcessOldSvcMethodOutCtx processOldSvcMethod(ProcessOldSvcMethodInCtx methodIn)
      throws Exception {

    // *82***************************************************************
    // Added variable to get the program context in place.
    Bbhsr002Ctx programCtx = methodIn.getBbhsr002Ctx();
    // Added variable to get the output context in place.
    ProcessOldSvcMethodOutCtx methodOut = methodIn.getProcessOldSvcMethodOutCtx();
    //  cobolCode::PERFORM VARYING WS-HPA-SUB FROM 1 BY 1 UNTIL WS-HPA-SUB > WS-HIPAA-COUNT
    for (methodOut.setHpaSub(1);
        ((methodOut.getHpaSub() <= methodIn.getHipaaCount()));
        methodOut.setHpaSub(methodOut.getHpaSub() + 1)) {
      //  cobolCode::PERFORM 3700-SET-FLAGS
      setFlags(programCtx.getSetFlagsInCtx()); /*3700-SET-FLAGS SECTION*/
      //  cobolCode::EVALUATE TRUE
      if (methodIn.isSet21()) {
        //  cobolCode::MOVE 'HCAN01' TO BHI-REQ-SLOT-TABLE
        //  LITERAL_HCAN01 = 'HCAN01'
        methodOut.setBhiReqSlotTable(CONSTANTS.LITERAL_HCAN01);
      } else if (methodIn.isSet22()) {
        //  cobolCode::MOVE 'HCAN02' TO BHI-REQ-SLOT-TABLE
        //  LITERAL_HCAN02 = 'HCAN02'
        methodOut.setBhiReqSlotTable(CONSTANTS.LITERAL_HCAN02);
      } else if (methodIn.isSet23()) {
        //  cobolCode::MOVE 'HCAN03' TO BHI-REQ-SLOT-TABLE
        //  LITERAL_HCAN03 = 'HCAN03'
        methodOut.setBhiReqSlotTable(CONSTANTS.LITERAL_HCAN03);
      } else if (methodIn.isSet27()) {
        //  cobolCode::MOVE 'HCAN04' TO BHI-REQ-SLOT-TABLE
        //  LITERAL_HCAN04 = 'HCAN04'
        methodOut.setBhiReqSlotTable(CONSTANTS.LITERAL_HCAN04);
      } else if (methodIn.isSet28()) {
        //  cobolCode::MOVE 'HCAN05' TO BHI-REQ-SLOT-TABLE
        //  LITERAL_HCAN05 = 'HCAN05'
        methodOut.setBhiReqSlotTable(CONSTANTS.LITERAL_HCAN05);
      } else if (methodIn.isSet30()) {
        //  cobolCode::MOVE 'HCAN06' TO BHI-REQ-SLOT-TABLE
        //  LITERAL_HCAN06 = 'HCAN06'
        methodOut.setBhiReqSlotTable(CONSTANTS.LITERAL_HCAN06);
      } else if (methodIn.isSet31()) {
        //  cobolCode::MOVE 'HCAN07' TO BHI-REQ-SLOT-TABLE
        //  LITERAL_HCAN07 = 'HCAN07'
        methodOut.setBhiReqSlotTable(CONSTANTS.LITERAL_HCAN07);
      } else if (methodIn.isSet32()) {
        //  cobolCode::MOVE 'HCAN08' TO BHI-REQ-SLOT-TABLE
        //  LITERAL_HCAN08 = 'HCAN08'
        methodOut.setBhiReqSlotTable(CONSTANTS.LITERAL_HCAN08);
      } else if (methodIn.isSet33()) {
        //  cobolCode::MOVE 'HCAN09' TO BHI-REQ-SLOT-TABLE
        //  LITERAL_HCAN09 = 'HCAN09'
        methodOut.setBhiReqSlotTable(CONSTANTS.LITERAL_HCAN09);
      } else if (methodIn.isSet34()) {
        //  cobolCode::MOVE 'HCAN10' TO BHI-REQ-SLOT-TABLE
        //  LITERAL_HCAN10 = 'HCAN10'
        methodOut.setBhiReqSlotTable(CONSTANTS.LITERAL_HCAN10);
      } else if (methodIn.isSet35()) {
        //  cobolCode::MOVE 'HCAN11' TO BHI-REQ-SLOT-TABLE
        //  LITERAL_HCAN11 = 'HCAN11'
        methodOut.setBhiReqSlotTable(CONSTANTS.LITERAL_HCAN11);
      } else if (methodIn.isSet36()) {
        //  cobolCode::MOVE 'HCAN12' TO BHI-REQ-SLOT-TABLE
        //  LITERAL_HCAN12 = 'HCAN12'
        methodOut.setBhiReqSlotTable(CONSTANTS.LITERAL_HCAN12);
      } else if (methodIn.isSet37()) {
        //  cobolCode::MOVE 'HCAN13' TO BHI-REQ-SLOT-TABLE
        //  LITERAL_HCAN13 = 'HCAN13'
        methodOut.setBhiReqSlotTable(CONSTANTS.LITERAL_HCAN13);
      } else if (methodIn.isSet38()) {
        //  cobolCode::MOVE 'HCAN14' TO BHI-REQ-SLOT-TABLE
        //  LITERAL_HCAN14 = 'HCAN14'
        methodOut.setBhiReqSlotTable(CONSTANTS.LITERAL_HCAN14);
      } else if (methodIn.isSet39()) {
        //  cobolCode::MOVE 'HCAN15' TO BHI-REQ-SLOT-TABLE
        //  LITERAL_HCAN15 = 'HCAN15'
        methodOut.setBhiReqSlotTable(CONSTANTS.LITERAL_HCAN15);
      } else if (methodIn.isSet40()) {
        //  cobolCode::MOVE 'HCAN16' TO BHI-REQ-SLOT-TABLE
        //  LITERAL_HCAN16 = 'HCAN16'
        methodOut.setBhiReqSlotTable(CONSTANTS.LITERAL_HCAN16);
      } else if (methodIn.isSet41()) {
        //  cobolCode::MOVE 'HCAN17' TO BHI-REQ-SLOT-TABLE
        //  LITERAL_HCAN17 = 'HCAN17'
        methodOut.setBhiReqSlotTable(CONSTANTS.LITERAL_HCAN17);
      } else if (methodIn.isSet42()) {
        //  cobolCode::MOVE 'HCAN18' TO BHI-REQ-SLOT-TABLE
        //  LITERAL_HCAN18 = 'HCAN18'
        methodOut.setBhiReqSlotTable(CONSTANTS.LITERAL_HCAN18);
      } else if (methodIn.isSet43()) {
        //  cobolCode::MOVE 'HCAN19' TO BHI-REQ-SLOT-TABLE
        //  LITERAL_HCAN19 = 'HCAN19'
        methodOut.setBhiReqSlotTable(CONSTANTS.LITERAL_HCAN19);
      } else if (methodIn.isSet44()) {
        //  cobolCode::MOVE 'HCAN20' TO BHI-REQ-SLOT-TABLE
        //  LITERAL_HCAN20 = 'HCAN20'
        methodOut.setBhiReqSlotTable(CONSTANTS.LITERAL_HCAN20);
      } else if (methodIn.isSet45()) {
        //  cobolCode::MOVE 'HCAN21' TO BHI-REQ-SLOT-TABLE
        //  LITERAL_HCAN21 = 'HCAN21'
        methodOut.setBhiReqSlotTable(CONSTANTS.LITERAL_HCAN21);
      } else if (methodIn.isSet46()) {
        //  cobolCode::MOVE 'HCAN22' TO BHI-REQ-SLOT-TABLE
        //  LITERAL_HCAN22 = 'HCAN22'
        methodOut.setBhiReqSlotTable(CONSTANTS.LITERAL_HCAN22);
      } else if (methodIn.isSet47()) {
        //  cobolCode::MOVE 'HCAN23' TO BHI-REQ-SLOT-TABLE
        //  LITERAL_HCAN23 = 'HCAN23'
        methodOut.setBhiReqSlotTable(CONSTANTS.LITERAL_HCAN23);
      } else if (methodIn.isSet48()) {
        //  cobolCode::MOVE 'HCAN24' TO BHI-REQ-SLOT-TABLE
        //  LITERAL_HCAN24 = 'HCAN24'
        methodOut.setBhiReqSlotTable(CONSTANTS.LITERAL_HCAN24);
      } else if (methodIn.isSet49()) {
        //  cobolCode::MOVE 'HCAN25' TO BHI-REQ-SLOT-TABLE
        //  LITERAL_HCAN25 = 'HCAN25'
        methodOut.setBhiReqSlotTable(CONSTANTS.LITERAL_HCAN25);
      } else if (methodIn.isSet50()) {
        //  cobolCode::MOVE 'HCAN26' TO BHI-REQ-SLOT-TABLE
        //  LITERAL_HCAN26 = 'HCAN26'
        methodOut.setBhiReqSlotTable(CONSTANTS.LITERAL_HCAN26);
      } else if (methodIn.isSet51()) {
        //  cobolCode::MOVE 'HCAN27' TO BHI-REQ-SLOT-TABLE
        //  LITERAL_HCAN27 = 'HCAN27'
        methodOut.setBhiReqSlotTable(CONSTANTS.LITERAL_HCAN27);
      } else if (methodIn.isSet52()) {
        //  cobolCode::MOVE 'HCAN28' TO BHI-REQ-SLOT-TABLE
        //  LITERAL_HCAN28 = 'HCAN28'
        methodOut.setBhiReqSlotTable(CONSTANTS.LITERAL_HCAN28);
      } else if (methodIn.isSet53()) {
        //  cobolCode::MOVE 'HCAN29' TO BHI-REQ-SLOT-TABLE
        //  LITERAL_HCAN29 = 'HCAN29'
        methodOut.setBhiReqSlotTable(CONSTANTS.LITERAL_HCAN29);
      } else if (methodIn.isEmpSet01()) {
        //  cobolCode::MOVE 'EMP001' TO BHI-REQ-SLOT-TABLE
        //  LITERAL_EMP001 = 'EMP001'
        methodOut.setBhiReqSlotTable(CONSTANTS.LITERAL_EMP001);
      } else if (methodIn.isEmpSet03()) {
        //  cobolCode::MOVE 'EMP002' TO BHI-REQ-SLOT-TABLE
        //  LITERAL_EMP002 = 'EMP002'
        methodOut.setBhiReqSlotTable(CONSTANTS.LITERAL_EMP002);
      } else if (methodIn.isEmpSet04()) {
        //  cobolCode::MOVE 'EMP003' TO BHI-REQ-SLOT-TABLE
        //  LITERAL_EMP003 = 'EMP003'
        methodOut.setBhiReqSlotTable(CONSTANTS.LITERAL_EMP003);
      } else if (methodIn.isEmpSet05()) {
        //  cobolCode::MOVE 'EMP004' TO BHI-REQ-SLOT-TABLE
        //  LITERAL_EMP004 = 'EMP004'
        methodOut.setBhiReqSlotTable(CONSTANTS.LITERAL_EMP004);
      } else if (methodIn.isEmpSet06()) {
        //  cobolCode::MOVE 'EMP005' TO BHI-REQ-SLOT-TABLE
        //  LITERAL_EMP005 = 'EMP005'
        methodOut.setBhiReqSlotTable(CONSTANTS.LITERAL_EMP005);
      } else if (methodIn.isEmpSet07()) {
        //  cobolCode::MOVE 'EMP006' TO BHI-REQ-SLOT-TABLE
        //  LITERAL_EMP006 = 'EMP006'
        methodOut.setBhiReqSlotTable(CONSTANTS.LITERAL_EMP006);
      } else if (methodIn.isEmpSet08()) {
        //  cobolCode::MOVE 'EMP007' TO BHI-REQ-SLOT-TABLE
        //  LITERAL_EMP007 = 'EMP007'
        methodOut.setBhiReqSlotTable(CONSTANTS.LITERAL_EMP007);
      } else if (methodIn.isEmpSet09()) {
        //  cobolCode::MOVE 'EMP008' TO BHI-REQ-SLOT-TABLE
        //  LITERAL_EMP008 = 'EMP008'
        methodOut.setBhiReqSlotTable(CONSTANTS.LITERAL_EMP008);
      } else if (methodIn.isEmpSet10()) {
        //  cobolCode::MOVE 'EMP009' TO BHI-REQ-SLOT-TABLE
        //  LITERAL_EMP009 = 'EMP009'
        methodOut.setBhiReqSlotTable(CONSTANTS.LITERAL_EMP009);
      } else if (methodIn.isEmpSet12()) {
        //  cobolCode::MOVE 'EMP010' TO BHI-REQ-SLOT-TABLE
        //  LITERAL_EMP010 = 'EMP010'
        methodOut.setBhiReqSlotTable(CONSTANTS.LITERAL_EMP010);
      } else if (methodIn.isEmpSet13()) {
        //  cobolCode::MOVE 'EMP011' TO BHI-REQ-SLOT-TABLE
        //  LITERAL_EMP011 = 'EMP011'
        methodOut.setBhiReqSlotTable(CONSTANTS.LITERAL_EMP011);
      } else if (methodIn.isEmpSet14()) {
        //  cobolCode::MOVE 'EMP012' TO BHI-REQ-SLOT-TABLE
        //  LITERAL_EMP012 = 'EMP012'
        methodOut.setBhiReqSlotTable(CONSTANTS.LITERAL_EMP012);
      } else if (methodIn.isEmpSet15()) {
        //  cobolCode::MOVE 'EMP013' TO BHI-REQ-SLOT-TABLE
        //  LITERAL_EMP013 = 'EMP013'
        methodOut.setBhiReqSlotTable(CONSTANTS.LITERAL_EMP013);
      } else if (methodIn.isEmpSet16()) {
        //  cobolCode::MOVE 'EMP014' TO BHI-REQ-SLOT-TABLE
        //  LITERAL_EMP014 = 'EMP014'
        methodOut.setBhiReqSlotTable(CONSTANTS.LITERAL_EMP014);
      } else if (methodIn.isEmpSet17()) {
        //  cobolCode::MOVE 'EMP015' TO BHI-REQ-SLOT-TABLE
        //  LITERAL_EMP015 = 'EMP015'
        methodOut.setBhiReqSlotTable(CONSTANTS.LITERAL_EMP015);
      } else if (methodIn.isEmpSet18()) {
        //  cobolCode::MOVE 'EMP016' TO BHI-REQ-SLOT-TABLE
        //  LITERAL_EMP016 = 'EMP016'
        methodOut.setBhiReqSlotTable(CONSTANTS.LITERAL_EMP016);
      } else if (methodIn.isEmpSet19()) {
        //  cobolCode::MOVE 'EMP017' TO BHI-REQ-SLOT-TABLE
        //  LITERAL_EMP017 = 'EMP017'
        methodOut.setBhiReqSlotTable(CONSTANTS.LITERAL_EMP017);
      } else if (methodIn.isEmpSet20()) {
        //  cobolCode::MOVE 'EMP018' TO BHI-REQ-SLOT-TABLE
        //  LITERAL_EMP018 = 'EMP018'
        methodOut.setBhiReqSlotTable(CONSTANTS.LITERAL_EMP018);
      } else if (methodIn.isEmpSet21()) {
        //  cobolCode::MOVE 'EMP019' TO BHI-REQ-SLOT-TABLE
        //  LITERAL_EMP019 = 'EMP019'
        methodOut.setBhiReqSlotTable(CONSTANTS.LITERAL_EMP019);
      } else if (methodIn.isEmpSet22()) {
        //  cobolCode::MOVE 'EMP020' TO BHI-REQ-SLOT-TABLE
        //  LITERAL_EMP020 = 'EMP020'
        methodOut.setBhiReqSlotTable(CONSTANTS.LITERAL_EMP020);
      } else if (methodIn.isEmpSet23()) {
        //  cobolCode::MOVE 'EMP021' TO BHI-REQ-SLOT-TABLE
        //  LITERAL_EMP021 = 'EMP021'
        methodOut.setBhiReqSlotTable(CONSTANTS.LITERAL_EMP021);
      } else if (methodIn.isEmpSet27()) {
        //  cobolCode::MOVE 'EMP022' TO BHI-REQ-SLOT-TABLE
        //  LITERAL_EMP022 = 'EMP022'
        methodOut.setBhiReqSlotTable(CONSTANTS.LITERAL_EMP022);
      } else if (methodIn.isEmpSet28()) {
        //  cobolCode::MOVE 'EMP023' TO BHI-REQ-SLOT-TABLE
        //  LITERAL_EMP023 = 'EMP023'
        methodOut.setBhiReqSlotTable(CONSTANTS.LITERAL_EMP023);
      } else if (methodIn.isEmpSet29()) {
        //  cobolCode::MOVE 'EMP024' TO BHI-REQ-SLOT-TABLE
        //  LITERAL_EMP024 = 'EMP024'
        methodOut.setBhiReqSlotTable(CONSTANTS.LITERAL_EMP024);
      } else if (methodIn.isEmpSet30()) {
        //  cobolCode::MOVE 'EMP025' TO BHI-REQ-SLOT-TABLE
        //  LITERAL_EMP025 = 'EMP025'
        methodOut.setBhiReqSlotTable(CONSTANTS.LITERAL_EMP025);
      } else if (methodIn.isEmpSet31()) {
        //  cobolCode::MOVE 'EMP026' TO BHI-REQ-SLOT-TABLE
        //  LITERAL_EMP026 = 'EMP026'
        methodOut.setBhiReqSlotTable(CONSTANTS.LITERAL_EMP026);
      } else if (methodIn.isEmpSet32()) {
        //  cobolCode::MOVE 'EMP027' TO BHI-REQ-SLOT-TABLE
        //  LITERAL_EMP027 = 'EMP027'
        methodOut.setBhiReqSlotTable(CONSTANTS.LITERAL_EMP027);
      } else if (methodIn.isEmpSet33()) {
        //  cobolCode::MOVE 'EMP028' TO BHI-REQ-SLOT-TABLE
        //  LITERAL_EMP028 = 'EMP028'
        methodOut.setBhiReqSlotTable(CONSTANTS.LITERAL_EMP028);
      } else if (methodIn.isEmpSet34()) {
        //  cobolCode::MOVE 'EMP029' TO BHI-REQ-SLOT-TABLE
        //  LITERAL_EMP029 = 'EMP029'
        methodOut.setBhiReqSlotTable(CONSTANTS.LITERAL_EMP029);
      } else if (methodIn.isEmpSet35()) {
        //  cobolCode::MOVE 'EMP030' TO BHI-REQ-SLOT-TABLE
        //  LITERAL_EMP030 = 'EMP030'
        methodOut.setBhiReqSlotTable(CONSTANTS.LITERAL_EMP030);
      } else if (methodIn.isEmpSet36()) {
        //  cobolCode::MOVE 'EMP031' TO BHI-REQ-SLOT-TABLE
        //  LITERAL_EMP031 = 'EMP031'
        methodOut.setBhiReqSlotTable(CONSTANTS.LITERAL_EMP031);
      } else if (methodIn.isEmpSet37()) {
        //  cobolCode::MOVE 'EMP032' TO BHI-REQ-SLOT-TABLE
        //  LITERAL_EMP032 = 'EMP032'
        methodOut.setBhiReqSlotTable(CONSTANTS.LITERAL_EMP032);
      } else if (methodIn.isEmpSet38()) {
        //  cobolCode::MOVE 'EMP033' TO BHI-REQ-SLOT-TABLE
        //  LITERAL_EMP033 = 'EMP033'
        methodOut.setBhiReqSlotTable(CONSTANTS.LITERAL_EMP033);
      } else if (methodIn.isEmpSet39()) {
        //  cobolCode::MOVE 'EMP034' TO BHI-REQ-SLOT-TABLE
        //  LITERAL_EMP034 = 'EMP034'
        methodOut.setBhiReqSlotTable(CONSTANTS.LITERAL_EMP034);
      } else if (methodIn.isEmpSet40()) {
        //  cobolCode::MOVE 'EMP035' TO BHI-REQ-SLOT-TABLE
        //  LITERAL_EMP035 = 'EMP035'
        methodOut.setBhiReqSlotTable(CONSTANTS.LITERAL_EMP035);
      } else if (methodIn.isEmpSet41()) {
        //  cobolCode::MOVE 'EMP036' TO BHI-REQ-SLOT-TABLE
        //  LITERAL_EMP036 = 'EMP036'
        methodOut.setBhiReqSlotTable(CONSTANTS.LITERAL_EMP036);
      } else if (methodIn.isEmpSet42()) {
        //  cobolCode::MOVE 'EMP037' TO BHI-REQ-SLOT-TABLE
        //  LITERAL_EMP037 = 'EMP037'
        methodOut.setBhiReqSlotTable(CONSTANTS.LITERAL_EMP037);
      } else if (methodIn.isEmpSet43()) {
        //  cobolCode::MOVE 'EMP038' TO BHI-REQ-SLOT-TABLE
        //  LITERAL_EMP038 = 'EMP038'
        methodOut.setBhiReqSlotTable(CONSTANTS.LITERAL_EMP038);
      } else if (methodIn.isEmpSet44()) {
        //  cobolCode::MOVE 'EMP039' TO BHI-REQ-SLOT-TABLE
        //  LITERAL_EMP039 = 'EMP039'
        methodOut.setBhiReqSlotTable(CONSTANTS.LITERAL_EMP039);
      } else if (methodIn.isEmpSet45()) {
        //  cobolCode::MOVE 'EMP040' TO BHI-REQ-SLOT-TABLE
        //  LITERAL_EMP040 = 'EMP040'
        methodOut.setBhiReqSlotTable(CONSTANTS.LITERAL_EMP040);
      } else if (methodIn.isEmpSet46()) {
        //  cobolCode::MOVE 'EMP041' TO BHI-REQ-SLOT-TABLE
        //  LITERAL_EMP041 = 'EMP041'
        methodOut.setBhiReqSlotTable(CONSTANTS.LITERAL_EMP041);
      } else if (methodIn.isEmpSet47()) {
        //  cobolCode::MOVE 'EMP042' TO BHI-REQ-SLOT-TABLE
        //  LITERAL_EMP042 = 'EMP042'
        methodOut.setBhiReqSlotTable(CONSTANTS.LITERAL_EMP042);
      } else if (methodIn.isEmpSet48()) {
        //  cobolCode::MOVE 'EMP043' TO BHI-REQ-SLOT-TABLE
        //  LITERAL_EMP043 = 'EMP043'
        methodOut.setBhiReqSlotTable(CONSTANTS.LITERAL_EMP043);
      } else if (methodIn.isEmpSet49()) {
        //  cobolCode::MOVE 'EMP044' TO BHI-REQ-SLOT-TABLE
        //  LITERAL_EMP044 = 'EMP044'
        methodOut.setBhiReqSlotTable(CONSTANTS.LITERAL_EMP044);
      } else if (methodIn.isEmpSet50()) {
        //  cobolCode::MOVE 'EMP045' TO BHI-REQ-SLOT-TABLE
        //  LITERAL_EMP045 = 'EMP045'
        methodOut.setBhiReqSlotTable(CONSTANTS.LITERAL_EMP045);
      } else if (methodIn.isEmpSet51()) {
        //  cobolCode::MOVE 'EMP046' TO BHI-REQ-SLOT-TABLE
        //  LITERAL_EMP046 = 'EMP046'
        methodOut.setBhiReqSlotTable(CONSTANTS.LITERAL_EMP046);
      } else if (methodIn.isEmpSet52()) {
        //  cobolCode::MOVE 'EMP047' TO BHI-REQ-SLOT-TABLE
        //  LITERAL_EMP047 = 'EMP047'
        methodOut.setBhiReqSlotTable(CONSTANTS.LITERAL_EMP047);
      } else if (methodIn.isEmpSet81()) {
        //  cobolCode::MOVE 'EMP048' TO BHI-REQ-SLOT-TABLE
        //  LITERAL_EMP048 = 'EMP048'
        methodOut.setBhiReqSlotTable(CONSTANTS.LITERAL_EMP048);
      } else if (methodIn.isEmpSet82()) {
        //  cobolCode::MOVE 'EMP049' TO BHI-REQ-SLOT-TABLE
        //  LITERAL_EMP049 = 'EMP049'
        methodOut.setBhiReqSlotTable(CONSTANTS.LITERAL_EMP049);
      } else if (methodIn.isEmpSet83()) {
        //  cobolCode::MOVE 'EMP050' TO BHI-REQ-SLOT-TABLE
        //  LITERAL_EMP050 = 'EMP050'
        methodOut.setBhiReqSlotTable(CONSTANTS.LITERAL_EMP050);
      } else if (methodIn.isEmpSet84()) {
        //  cobolCode::MOVE 'EMP051' TO BHI-REQ-SLOT-TABLE
        //  LITERAL_EMP051 = 'EMP051'
        methodOut.setBhiReqSlotTable(CONSTANTS.LITERAL_EMP051);
      } else if (methodIn.isEmpSet87()) {
        //  cobolCode::MOVE 'EMP052' TO BHI-REQ-SLOT-TABLE
        //  LITERAL_EMP052 = 'EMP052'
        methodOut.setBhiReqSlotTable(CONSTANTS.LITERAL_EMP052);
      } else if (methodIn.isEmpSet144()) {
        //  cobolCode::MOVE 'EMP053' TO BHI-REQ-SLOT-TABLE
        //  LITERAL_EMP053 = 'EMP053'
        methodOut.setBhiReqSlotTable(CONSTANTS.LITERAL_EMP053);
      } else if (methodIn.isEmpSet145()) {
        //  cobolCode::MOVE 'EMP054' TO BHI-REQ-SLOT-TABLE
        //  LITERAL_EMP054 = 'EMP054'
        methodOut.setBhiReqSlotTable(CONSTANTS.LITERAL_EMP054);
      } else if (methodIn.isEmpSet148()) {
        //  cobolCode::MOVE 'EMP055' TO BHI-REQ-SLOT-TABLE
        //  LITERAL_EMP055 = 'EMP055'
        methodOut.setBhiReqSlotTable(CONSTANTS.LITERAL_EMP055);
      } else if (methodIn.isEmpSet149()) {
        //  cobolCode::MOVE 'EMP056' TO BHI-REQ-SLOT-TABLE
        //  LITERAL_EMP056 = 'EMP056'
        methodOut.setBhiReqSlotTable(CONSTANTS.LITERAL_EMP056);
      } else if (methodIn.isEmpSet153()) {
        //  cobolCode::MOVE 'EMP057' TO BHI-REQ-SLOT-TABLE
        //  LITERAL_EMP057 = 'EMP057'
        methodOut.setBhiReqSlotTable(CONSTANTS.LITERAL_EMP057);
      } else if (methodIn.isEmpSet154()) {
        //  cobolCode::MOVE 'EMP058' TO BHI-REQ-SLOT-TABLE
        //  LITERAL_EMP058 = 'EMP058'
        methodOut.setBhiReqSlotTable(CONSTANTS.LITERAL_EMP058);
      } else if (methodIn.isEmpSet157()) {
        //  cobolCode::MOVE 'EMP059' TO BHI-REQ-SLOT-TABLE
        //  LITERAL_EMP059 = 'EMP059'
        methodOut.setBhiReqSlotTable(CONSTANTS.LITERAL_EMP059);
      } else if (methodIn.isEmpSet158()) {
        //  cobolCode::MOVE 'EMP060' TO BHI-REQ-SLOT-TABLE
        //  LITERAL_EMP060 = 'EMP060'
        methodOut.setBhiReqSlotTable(CONSTANTS.LITERAL_EMP060);
      } else if (methodIn.isEmpSet159()) {
        //  cobolCode::MOVE 'EMP061' TO BHI-REQ-SLOT-TABLE
        //  LITERAL_EMP061 = 'EMP061'
        methodOut.setBhiReqSlotTable(CONSTANTS.LITERAL_EMP061);
      } else if (methodIn.isEmpSet160()) {
        //  cobolCode::MOVE 'EMP062' TO BHI-REQ-SLOT-TABLE
        //  LITERAL_EMP062 = 'EMP062'
        methodOut.setBhiReqSlotTable(CONSTANTS.LITERAL_EMP062);
      } else if (methodIn.isEmpSet161()) {
        //  cobolCode::MOVE 'EMP063' TO BHI-REQ-SLOT-TABLE
        //  LITERAL_EMP063 = 'EMP063'
        methodOut.setBhiReqSlotTable(CONSTANTS.LITERAL_EMP063);
      } else if (methodIn.isEmpSet162()) {
        //  cobolCode::MOVE 'EMP064' TO BHI-REQ-SLOT-TABLE
        //  LITERAL_EMP064 = 'EMP064'
        methodOut.setBhiReqSlotTable(CONSTANTS.LITERAL_EMP064);
      } else if (methodIn.isEmpSet163()) {
        //  cobolCode::MOVE 'EMP065' TO BHI-REQ-SLOT-TABLE
        //  LITERAL_EMP065 = 'EMP065'
        methodOut.setBhiReqSlotTable(CONSTANTS.LITERAL_EMP065);
      } else if (methodIn.isEmpSet164()) {
        //  cobolCode::MOVE 'EMP066' TO BHI-REQ-SLOT-TABLE
        //  LITERAL_EMP066 = 'EMP066'
        methodOut.setBhiReqSlotTable(CONSTANTS.LITERAL_EMP066);
      } else if (methodIn.isEmpSet165()) {
        //  cobolCode::MOVE 'EMP067' TO BHI-REQ-SLOT-TABLE
        //  LITERAL_EMP067 = 'EMP067'
        methodOut.setBhiReqSlotTable(CONSTANTS.LITERAL_EMP067);
      } else if (methodIn.isEmpSet166()) {
        //  cobolCode::MOVE 'EMP068' TO BHI-REQ-SLOT-TABLE
        //  LITERAL_EMP068 = 'EMP068'
        methodOut.setBhiReqSlotTable(CONSTANTS.LITERAL_EMP068);
      } else if (methodIn.isEmpSet167()) {
        //  cobolCode::MOVE 'EMP069' TO BHI-REQ-SLOT-TABLE
        //  LITERAL_EMP069 = 'EMP069'
        methodOut.setBhiReqSlotTable(CONSTANTS.LITERAL_EMP069);
      } else if (methodIn.isEmpSet168()) {
        //  cobolCode::MOVE 'EMP070' TO BHI-REQ-SLOT-TABLE
        //  LITERAL_EMP070 = 'EMP070'
        methodOut.setBhiReqSlotTable(CONSTANTS.LITERAL_EMP070);
      } else if (methodIn.isEmpSet169()) {
        //  cobolCode::MOVE 'EMP071' TO BHI-REQ-SLOT-TABLE
        //  LITERAL_EMP071 = 'EMP071'
        methodOut.setBhiReqSlotTable(CONSTANTS.LITERAL_EMP071);
      } else if (methodIn.isEmpSet170()) {
        //  cobolCode::MOVE 'EMP072' TO BHI-REQ-SLOT-TABLE
        //  LITERAL_EMP072 = 'EMP072'
        methodOut.setBhiReqSlotTable(CONSTANTS.LITERAL_EMP072);
      } else if (methodIn.isEmpSet171()) {
        //  cobolCode::MOVE 'EMP073' TO BHI-REQ-SLOT-TABLE
        //  LITERAL_EMP073 = 'EMP073'
        methodOut.setBhiReqSlotTable(CONSTANTS.LITERAL_EMP073);
      } else if (methodIn.isEmpSet172()) {
        //  cobolCode::MOVE 'EMP074' TO BHI-REQ-SLOT-TABLE
        //  LITERAL_EMP074 = 'EMP074'
        methodOut.setBhiReqSlotTable(CONSTANTS.LITERAL_EMP074);
      } else if (methodIn.isEmpSet195()) {
        //  cobolCode::MOVE 'EMP075' TO BHI-REQ-SLOT-TABLE
        //  LITERAL_EMP075 = 'EMP075'
        methodOut.setBhiReqSlotTable(CONSTANTS.LITERAL_EMP075);
      } else if (methodIn.isEmpSet196()) {
        //  cobolCode::MOVE 'EMP076' TO BHI-REQ-SLOT-TABLE
        //  LITERAL_EMP076 = 'EMP076'
        methodOut.setBhiReqSlotTable(CONSTANTS.LITERAL_EMP076);
      } else if (methodIn.isEmpSet197()) {
        //  cobolCode::MOVE 'EMP077' TO BHI-REQ-SLOT-TABLE
        //  LITERAL_EMP077 = 'EMP077'
        methodOut.setBhiReqSlotTable(CONSTANTS.LITERAL_EMP077);
      } else if (methodIn.isEmpSet198()) {
        //  cobolCode::MOVE 'EMP078' TO BHI-REQ-SLOT-TABLE
        //  LITERAL_EMP078 = 'EMP078'
        methodOut.setBhiReqSlotTable(CONSTANTS.LITERAL_EMP078);
      } else if (methodIn.isEmpSet199()) {
        //  cobolCode::MOVE 'EMP079' TO BHI-REQ-SLOT-TABLE
        //  LITERAL_EMP079 = 'EMP079'
        methodOut.setBhiReqSlotTable(CONSTANTS.LITERAL_EMP079);
      } else if (methodIn.isEmpSet200()) {
        //  cobolCode::MOVE 'EMP080' TO BHI-REQ-SLOT-TABLE
        //  LITERAL_EMP080 = 'EMP080'
        methodOut.setBhiReqSlotTable(CONSTANTS.LITERAL_EMP080);
      } else if (methodIn.isEmpSet201()) {
        //  cobolCode::MOVE 'EMP081' TO BHI-REQ-SLOT-TABLE
        //  LITERAL_EMP081 = 'EMP081'
        methodOut.setBhiReqSlotTable(CONSTANTS.LITERAL_EMP081);
      } else if (methodIn.isEmpSet202()) {
        //  cobolCode::MOVE 'EMP082' TO BHI-REQ-SLOT-TABLE
        //  LITERAL_EMP082 = 'EMP082'
        methodOut.setBhiReqSlotTable(CONSTANTS.LITERAL_EMP082);
      } else if (methodIn.isEmpSet203()) {
        //  cobolCode::MOVE 'EMP083' TO BHI-REQ-SLOT-TABLE
        //  LITERAL_EMP083 = 'EMP083'
        methodOut.setBhiReqSlotTable(CONSTANTS.LITERAL_EMP083);
      } else if (methodIn.isEmpSet204()) {
        //  cobolCode::MOVE 'EMP084' TO BHI-REQ-SLOT-TABLE
        //  LITERAL_EMP084 = 'EMP084'
        methodOut.setBhiReqSlotTable(CONSTANTS.LITERAL_EMP084);
      } else if (methodIn.isEmpSet205()) {
        //  cobolCode::MOVE 'EMP085' TO BHI-REQ-SLOT-TABLE
        //  LITERAL_EMP085 = 'EMP085'
        methodOut.setBhiReqSlotTable(CONSTANTS.LITERAL_EMP085);
      } else if (methodIn.isEmpSet206()) {
        //  cobolCode::MOVE 'EMP086' TO BHI-REQ-SLOT-TABLE
        //  LITERAL_EMP086 = 'EMP086'
        methodOut.setBhiReqSlotTable(CONSTANTS.LITERAL_EMP086);
      } else if (methodIn.isEmpSet211()) {
        //  cobolCode::MOVE 'EMP087' TO BHI-REQ-SLOT-TABLE
        //  LITERAL_EMP087 = 'EMP087'
        methodOut.setBhiReqSlotTable(CONSTANTS.LITERAL_EMP087);
      } else if (methodIn.isEmpSet212()) {
        //  cobolCode::MOVE 'EMP088' TO BHI-REQ-SLOT-TABLE
        //  LITERAL_EMP088 = 'EMP088'
        methodOut.setBhiReqSlotTable(CONSTANTS.LITERAL_EMP088);
      } else if (methodIn.isEmpSet213()) {
        //  cobolCode::MOVE 'EMP089' TO BHI-REQ-SLOT-TABLE
        //  LITERAL_EMP089 = 'EMP089'
        methodOut.setBhiReqSlotTable(CONSTANTS.LITERAL_EMP089);
      } else if (methodIn.isEmpSet214()) {
        //  cobolCode::MOVE 'EMP090' TO BHI-REQ-SLOT-TABLE
        //  LITERAL_EMP090 = 'EMP090'
        methodOut.setBhiReqSlotTable(CONSTANTS.LITERAL_EMP090);
      } else if (methodIn.isEmpSet247()) {
        //  cobolCode::MOVE 'EMP091' TO BHI-REQ-SLOT-TABLE
        //  LITERAL_EMP091 = 'EMP091'
        methodOut.setBhiReqSlotTable(CONSTANTS.LITERAL_EMP091);
      } else if (methodIn.isEmpSet248()) {
        //  cobolCode::MOVE 'EMP092' TO BHI-REQ-SLOT-TABLE
        //  LITERAL_EMP092 = 'EMP092'
        methodOut.setBhiReqSlotTable(CONSTANTS.LITERAL_EMP092);
      } else if (methodIn.isEmpSet249()) {
        //  cobolCode::MOVE 'EMP093' TO BHI-REQ-SLOT-TABLE
        //  LITERAL_EMP093 = 'EMP093'
        methodOut.setBhiReqSlotTable(CONSTANTS.LITERAL_EMP093);
      } else if (methodIn.isEmpSet250()) {
        //  cobolCode::MOVE 'EMP094' TO BHI-REQ-SLOT-TABLE
        //  LITERAL_EMP094 = 'EMP094'
        methodOut.setBhiReqSlotTable(CONSTANTS.LITERAL_EMP094);
      } else if (methodIn.isEmpSet251()) {
        //  cobolCode::MOVE 'EMP095' TO BHI-REQ-SLOT-TABLE
        //  LITERAL_EMP095 = 'EMP095'
        methodOut.setBhiReqSlotTable(CONSTANTS.LITERAL_EMP095);
      } else if (methodIn.isEmpSet259()) {
        //  cobolCode::MOVE 'EMP096' TO BHI-REQ-SLOT-TABLE
        //  LITERAL_EMP096 = 'EMP096'
        methodOut.setBhiReqSlotTable(CONSTANTS.LITERAL_EMP096);
      } else if (methodIn.isEmpSet260()) {
        //  cobolCode::MOVE 'EMP097' TO BHI-REQ-SLOT-TABLE
        //  LITERAL_EMP097 = 'EMP097'
        methodOut.setBhiReqSlotTable(CONSTANTS.LITERAL_EMP097);
      } else if (methodIn.isEmpSet261()) {
        //  cobolCode::MOVE 'EMP098' TO BHI-REQ-SLOT-TABLE
        //  LITERAL_EMP098 = 'EMP098'
        methodOut.setBhiReqSlotTable(CONSTANTS.LITERAL_EMP098);
      } else if (methodIn.isEmpSet262()) {
        //  cobolCode::MOVE 'EMP099' TO BHI-REQ-SLOT-TABLE
        //  LITERAL_EMP099 = 'EMP099'
        methodOut.setBhiReqSlotTable(CONSTANTS.LITERAL_EMP099);
      } else if (methodIn.isEmpSet263()) {
        //  cobolCode::MOVE 'EMP100' TO BHI-REQ-SLOT-TABLE
        //  LITERAL_EMP100 = 'EMP100'
        methodOut.setBhiReqSlotTable(CONSTANTS.LITERAL_EMP100);
      } else if (methodIn.isEmpSet264()) {
        //  cobolCode::MOVE 'EMP101' TO BHI-REQ-SLOT-TABLE
        //  LITERAL_EMP101 = 'EMP101'
        methodOut.setBhiReqSlotTable(CONSTANTS.LITERAL_EMP101);
      } else if (methodIn.isEmpSet265()) {
        //  cobolCode::MOVE 'EMP102' TO BHI-REQ-SLOT-TABLE
        //  LITERAL_EMP102 = 'EMP102'
        methodOut.setBhiReqSlotTable(CONSTANTS.LITERAL_EMP102);
      } else if (methodIn.isEmpSet266()) {
        //  cobolCode::MOVE 'EMP103' TO BHI-REQ-SLOT-TABLE
        //  LITERAL_EMP103 = 'EMP103'
        methodOut.setBhiReqSlotTable(CONSTANTS.LITERAL_EMP103);
      } else if (methodIn.isEmpSet267()) {
        //  cobolCode::MOVE 'EMP104' TO BHI-REQ-SLOT-TABLE
        //  LITERAL_EMP104 = 'EMP104'
        methodOut.setBhiReqSlotTable(CONSTANTS.LITERAL_EMP104);
      } else if (methodIn.isEmpSet268()) {
        //  cobolCode::MOVE 'EMP105' TO BHI-REQ-SLOT-TABLE
        //  LITERAL_EMP105 = 'EMP105'
        methodOut.setBhiReqSlotTable(CONSTANTS.LITERAL_EMP105);
      } else if (methodIn.isEmpSet269()) {
        //  cobolCode::MOVE 'EMP106' TO BHI-REQ-SLOT-TABLE
        //  LITERAL_EMP106 = 'EMP106'
        methodOut.setBhiReqSlotTable(CONSTANTS.LITERAL_EMP106);
      } else if (methodIn.isEmpSet270()) {
        //  cobolCode::MOVE 'EMP107' TO BHI-REQ-SLOT-TABLE
        //  LITERAL_EMP107 = 'EMP107'
        methodOut.setBhiReqSlotTable(CONSTANTS.LITERAL_EMP107);
      } else if (methodIn.isEmpSet298()) {
        //  cobolCode::MOVE 'EMP108' TO BHI-REQ-SLOT-TABLE
        //  LITERAL_EMP108 = 'EMP108'
        methodOut.setBhiReqSlotTable(CONSTANTS.LITERAL_EMP108);
      } else if (methodIn.isEmpSet299()) {
        //  cobolCode::MOVE 'EMP109' TO BHI-REQ-SLOT-TABLE
        //  LITERAL_EMP109 = 'EMP109'
        methodOut.setBhiReqSlotTable(CONSTANTS.LITERAL_EMP109);
      } else if (methodIn.isEmpSet300()) {
        //  cobolCode::MOVE 'EMP110' TO BHI-REQ-SLOT-TABLE
        //  LITERAL_EMP110 = 'EMP110'
        methodOut.setBhiReqSlotTable(CONSTANTS.LITERAL_EMP110);
      } else if (methodIn.isEmpSet301()) {
        //  cobolCode::MOVE 'EMP111' TO BHI-REQ-SLOT-TABLE
        //  LITERAL_EMP111 = 'EMP111'
        methodOut.setBhiReqSlotTable(CONSTANTS.LITERAL_EMP111);
      } else if (methodIn.isEmpSet302()) {
        //  cobolCode::MOVE 'EMP112' TO BHI-REQ-SLOT-TABLE
        //  LITERAL_EMP112 = 'EMP112'
        methodOut.setBhiReqSlotTable(CONSTANTS.LITERAL_EMP112);
      } else if (methodIn.isEmpSet303()) {
        //  cobolCode::MOVE 'EMP113' TO BHI-REQ-SLOT-TABLE
        //  LITERAL_EMP113 = 'EMP113'
        methodOut.setBhiReqSlotTable(CONSTANTS.LITERAL_EMP113);
      } else if (methodIn.isEmpSet304()) {
        //  cobolCode::MOVE 'EMP114' TO BHI-REQ-SLOT-TABLE
        //  LITERAL_EMP114 = 'EMP114'
        methodOut.setBhiReqSlotTable(CONSTANTS.LITERAL_EMP114);
      } else if (methodIn.isEmpSet305()) {
        //  cobolCode::MOVE 'EMP115' TO BHI-REQ-SLOT-TABLE
        //  LITERAL_EMP115 = 'EMP115'
        methodOut.setBhiReqSlotTable(CONSTANTS.LITERAL_EMP115);
      } else if (methodIn.isEmpSet306()) {
        //  cobolCode::MOVE 'EMP116' TO BHI-REQ-SLOT-TABLE
        //  LITERAL_EMP116 = 'EMP116'
        methodOut.setBhiReqSlotTable(CONSTANTS.LITERAL_EMP116);
      } else if (methodIn.isEmpSet307()) {
        //  cobolCode::MOVE 'EMP117' TO BHI-REQ-SLOT-TABLE
        //  LITERAL_EMP117 = 'EMP117'
        methodOut.setBhiReqSlotTable(CONSTANTS.LITERAL_EMP117);
      } else if (methodIn.isEmpSet308()) {
        //  cobolCode::MOVE 'EMP118' TO BHI-REQ-SLOT-TABLE
        //  LITERAL_EMP118 = 'EMP118'
        methodOut.setBhiReqSlotTable(CONSTANTS.LITERAL_EMP118);
      } else if (methodIn.isEmpSet309()) {
        //  cobolCode::MOVE 'EMP119' TO BHI-REQ-SLOT-TABLE
        //  LITERAL_EMP119 = 'EMP119'
        methodOut.setBhiReqSlotTable(CONSTANTS.LITERAL_EMP119);
      } else if (methodIn.isEmpSet310()) {
        //  cobolCode::MOVE 'EMP120' TO BHI-REQ-SLOT-TABLE
        //  LITERAL_EMP120 = 'EMP120'
        methodOut.setBhiReqSlotTable(CONSTANTS.LITERAL_EMP120);
      } else if (methodIn.isEmpSet311()) {
        //  cobolCode::MOVE 'EMP121' TO BHI-REQ-SLOT-TABLE
        //  LITERAL_EMP121 = 'EMP121'
        methodOut.setBhiReqSlotTable(CONSTANTS.LITERAL_EMP121);
      } else if (methodIn.isEmpSet312()) {
        //  cobolCode::MOVE 'EMP122' TO BHI-REQ-SLOT-TABLE
        //  LITERAL_EMP122 = 'EMP122'
        methodOut.setBhiReqSlotTable(CONSTANTS.LITERAL_EMP122);
      } else if (methodIn.isEmpSet328()) {
        //  cobolCode::MOVE 'EMP123' TO BHI-REQ-SLOT-TABLE
        //  LITERAL_EMP123 = 'EMP123'
        methodOut.setBhiReqSlotTable(CONSTANTS.LITERAL_EMP123);
      } else if (methodIn.isEmpSet329()) {
        //  cobolCode::MOVE 'EMP124' TO BHI-REQ-SLOT-TABLE
        //  LITERAL_EMP124 = 'EMP124'
        methodOut.setBhiReqSlotTable(CONSTANTS.LITERAL_EMP124);
      } else if (methodIn.isEmpSet330()) {
        //  cobolCode::MOVE 'EMP125' TO BHI-REQ-SLOT-TABLE
        //  LITERAL_EMP125 = 'EMP125'
        methodOut.setBhiReqSlotTable(CONSTANTS.LITERAL_EMP125);
      } else if (methodIn.isEmpSet331()) {
        //  cobolCode::MOVE 'EMP126' TO BHI-REQ-SLOT-TABLE
        //  LITERAL_EMP126 = 'EMP126'
        methodOut.setBhiReqSlotTable(CONSTANTS.LITERAL_EMP126);
      } else if (methodIn.isEmpSet338()) {
        //  cobolCode::MOVE 'EMP127' TO BHI-REQ-SLOT-TABLE
        //  LITERAL_EMP127 = 'EMP127'
        methodOut.setBhiReqSlotTable(CONSTANTS.LITERAL_EMP127);
      } else if (methodIn.isEmpSet339()) {
        //  cobolCode::MOVE 'EMP128' TO BHI-REQ-SLOT-TABLE
        //  LITERAL_EMP128 = 'EMP128'
        methodOut.setBhiReqSlotTable(CONSTANTS.LITERAL_EMP128);
      } else if (methodIn.isEmpSet340()) {
        //  cobolCode::MOVE 'EMP129' TO BHI-REQ-SLOT-TABLE
        //  LITERAL_EMP129 = 'EMP129'
        methodOut.setBhiReqSlotTable(CONSTANTS.LITERAL_EMP129);
      } else if (methodIn.isEmpSet341()) {
        //  cobolCode::MOVE 'EMP130' TO BHI-REQ-SLOT-TABLE
        //  LITERAL_EMP130 = 'EMP130'
        methodOut.setBhiReqSlotTable(CONSTANTS.LITERAL_EMP130);
      } else if (methodIn.isEmpSet342()) {
        //  cobolCode::MOVE 'EMP131' TO BHI-REQ-SLOT-TABLE
        //  LITERAL_EMP131 = 'EMP131'
        methodOut.setBhiReqSlotTable(CONSTANTS.LITERAL_EMP131);
      } else if (methodIn.isEmpSet343()) {
        //  cobolCode::MOVE 'EMP132' TO BHI-REQ-SLOT-TABLE
        //  LITERAL_EMP132 = 'EMP132'
        methodOut.setBhiReqSlotTable(CONSTANTS.LITERAL_EMP132);
      } else if (methodIn.isEmpSet344()) {
        //  cobolCode::MOVE 'EMP133' TO BHI-REQ-SLOT-TABLE
        //  LITERAL_EMP133 = 'EMP133'
        methodOut.setBhiReqSlotTable(CONSTANTS.LITERAL_EMP133);
      } else if (methodIn.isEmpSet345()) {
        //  cobolCode::MOVE 'EMP134' TO BHI-REQ-SLOT-TABLE
        //  LITERAL_EMP134 = 'EMP134'
        methodOut.setBhiReqSlotTable(CONSTANTS.LITERAL_EMP134);
      } else {
        //  cobolCode::MOVE 'PSE001' TO BHI-REQ-SLOT-TABLE
        //  LITERAL_PSE001 = 'PSE001'
        methodOut.setBhiReqSlotTable(CONSTANTS.LITERAL_PSE001);
      }
      //  cobolCode::PERFORM 4000-GET-HIPAA-BENEFITS
      getHipaaBenefits(programCtx.getGetHipaaBenefitsInCtx()); /*4000-GET-HIPAA-BENEFITS SECTION*/
      //  cobolCode::IF HSR-REQ-CONTRCT-FAIL-C-FUNC-RC
      if (methodIn.isHsrReqContrctFailCFuncRc()) {
        // cobolCode::GO TO 3600-EXIT
        return methodOut;
        // cobolCodeEnds::GO TO 3600-EXIT
      }
      //  cobolCode::MOVE BHI-RET-BHI-CNT TO WS-BHI-CNT
      methodOut.setBhiCnt(methodOut.getBhiRetBhiCnt());
      //  cobolCode::IF WS-BHI-ROW-FOUND
      if (methodIn.isBhiRowFound()) {
        //  cobolCode::MOVE 1 TO WS-BHI-SUB
        //  LITERAL_1 = 1
        methodOut.setBhiSub01(1);
        //  cobolCode::PERFORM VARYING BHI-SUB FROM 1 BY 1 UNTIL BHI-SUB > WS-BHI-CNT
        for (methodOut.setBhiSub(1);
            ((methodOut.getBhiSub() <= methodOut.getBhiCnt()));
            methodOut.setBhiSub(methodOut.getBhiSub() + 1)) {
          //  cobolCode::PERFORM 4100-MOVE-BHI-FIELDS
          moveBhiFields(programCtx.getMoveBhiFieldsInCtx()); /*4100-MOVE-BHI-FIELDS SECTION*/
          //  cobolCode::PERFORM 5000-GET-SVC-CD-NBR
          getSvcCdNbr(programCtx.getGetSvcCdNbrInCtx()); /*5000-GET-SVC-CD-NBR SECTION*/
          //  cobolCode::ADD +1 TO WS-BHI-SUB
          methodOut.setBhiSub01(methodOut.getBhiSub01() + 1);
          //  cobolCode::IF HSR-REQ-CONTRCT-FAIL-C-FUNC-RC
          if (methodIn.isHsrReqContrctFailCFuncRc()) {
            // cobolCode::GO TO 3600-EXIT
            return methodOut;
            // cobolCodeEnds::GO TO 3600-EXIT
          }
        }
      }
      //  cobolCode::MOVE WS-BHI-CNT TO HSR-RET-NET-CNT ( WS-HPA-SUB )
      methodOut.setHsrRetNetCnt(methodOut.getHpaSub() - 1, methodOut.getBhiCnt());
      //  cobolCode::PERFORM 3800-SET-COV-IND
      setCovInd(programCtx.getSetCovIndInCtx()); /*3800-SET-COV-IND SECTION*/
    }

    return methodOut;
  }
  /**
   * setFlags This method is derived from COBOL Paragraph - 3700-SET-FLAGS SECTION COBOL Cyclomatic
   * complexity - 1 Input : None
   *
   * <p>Output :
   *
   * <p>- sub2 COBOL Name: WS-SUB2 - bhiCnt COBOL Name: WS-BHI-CNT - dFlag COBOL Name: WS-D-FLAG -
   * iFlag COBOL Name: WS-I-FLAG - oFlag COBOL Name: WS-O-FLAG - bFlag COBOL Name: WS-B-FLAG -
   * hsrRetT1CovIndicator COBOL Name: HSR-RET-T1-COV-INDICATOR - hsrRetInnCovIndicator COBOL Name:
   * HSR-RET-INN-COV-INDICATOR - hsrRetOonCovIndicator COBOL Name: HSR-RET-OON-COV-INDICATOR
   *
   * @throws CFException
   */
  @Override
  public SetFlagsOutCtx setFlags(SetFlagsInCtx methodIn) throws Exception {

    // *81***************************************************************
    // *81 3700-Set-flags                                               *
    // *81                                                              *
    // *81 business function: initializes the flag fields               *
    // *81                                                              *
    // *81***************************************************************
    // *82 3700-set-flags                                               *
    // *82 1.performs the old method process                            *
    // *82                                                              *
    // *82 called by :3400-process-new-svc-method                       *
    // *82            3500-process-comb-svc-method                      *
    // *82            3600-process-old-svc-method                       *
    // *82 calls     :n/a                                               *
    // *82***************************************************************
    // Added variable to get the program context in place.
    Bbhsr002Ctx programCtx = methodIn.getBbhsr002Ctx();
    // Added variable to get the output context in place.
    SetFlagsOutCtx methodOut = methodIn.getSetFlagsOutCtx();
    //  cobolCode::MOVE +1 TO WS-SUB2
    methodOut.setSub2(1);
    //  cobolCode::MOVE ZERO TO WS-BHI-CNT
    methodOut.setBhiCnt(0);
    //  cobolCode::SET WS-D-FLAG-NO TO TRUE
    methodOut.setDFlagNoTrue();

    //  cobolCode::SET WS-I-FLAG-NO TO TRUE
    methodOut.setIFlagNoTrue();

    //  cobolCode::SET WS-O-FLAG-NO TO TRUE
    methodOut.setOFlagNoTrue();

    //  cobolCode::SET WS-B-FLAG-NO TO TRUE
    methodOut.setBFlagNoTrue();

    //  cobolCode::MOVE 'N' TO HSR-RET-T1-COV-INDICATOR ( WS-HPA-SUB )
    //  LITERAL_N = 'N'
    methodOut.setHsrRetT1CovIndicator(methodIn.getHpaSub() - 1, CONSTANTS.LITERAL_N);
    //  cobolCode::MOVE 'N' TO HSR-RET-INN-COV-INDICATOR ( WS-HPA-SUB )
    //  LITERAL_N = 'N'
    methodOut.setHsrRetInnCovIndicator(methodIn.getHpaSub() - 1, CONSTANTS.LITERAL_N);
    //  cobolCode::MOVE 'N' TO HSR-RET-OON-COV-INDICATOR ( WS-HPA-SUB )
    //  LITERAL_N = 'N'
    methodOut.setHsrRetOonCovIndicator(methodIn.getHpaSub() - 1, CONSTANTS.LITERAL_N);

    return methodOut;
  }
  /**
   * setCovInd This method is derived from COBOL Paragraph - 3800-SET-COV-IND SECTION COBOL
   * Cyclomatic complexity - 4 Input :
   *
   * <p>- dFlag COBOL Name: WS-D-FLAG - iFlag COBOL Name: WS-I-FLAG - oFlag COBOL Name: WS-O-FLAG -
   * hipaaCd COBOL Name: WS-HIPAA-CD
   *
   * <p>Output :
   *
   * <p>- hsrRetHipaaCd COBOL Name: HSR-RET-HIPAA-CD - hipaaCd COBOL Name: WS-HIPAA-CD -
   * hsrRetT1CovIndicator COBOL Name: HSR-RET-T1-COV-INDICATOR - hsrRetInnCovIndicator COBOL Name:
   * HSR-RET-INN-COV-INDICATOR - hsrRetOonCovIndicator COBOL Name: HSR-RET-OON-COV-INDICATOR -
   * hsrRetNetCnt COBOL Name: HSR-RET-NET-CNT
   *
   * @throws CFException
   */
  @Override
  public SetCovIndOutCtx setCovInd(SetCovIndInCtx methodIn) throws Exception {

    // *81                                                              *
    // *81***************************************************************
    // *82 3800-Set-cov-ind                                             *
    // *82 1.performs the old method process                            *
    // *82                                                              *
    // *82 called by :3400-process-new-svc-method                       *
    // *82            3500-process-comb-svc-method                      *
    // *82            3600-process-old-svc-method                       *
    // *82 calls     :n/a                                               *
    // *82***************************************************************
    // Added variable to get the program context in place.
    Bbhsr002Ctx programCtx = methodIn.getBbhsr002Ctx();
    // Added variable to get the output context in place.
    SetCovIndOutCtx methodOut = methodIn.getSetCovIndOutCtx();
    //  cobolCode::IF WS-D-FLAG-NO AND WS-I-FLAG-NO AND WS-O-FLAG-NO
    if (methodIn.isDFlagNo() && methodIn.isIFlagNo() && methodIn.isOFlagNo()) {
      //  cobolCode::MOVE WS-HIPAA-CD ( WS-HPA-SUB ) TO HSR-RET-HIPAA-CD ( WS-HPA-SUB )
      methodOut.setHsrRetHipaaCd(
          methodIn.getHpaSub() - 1, methodOut.getHipaaCd(methodIn.getHpaSub() - 1));
      //  cobolCode::MOVE 'E' TO HSR-RET-T1-COV-INDICATOR ( WS-HPA-SUB )
      //  LITERAL_E = 'E'
      methodOut.setHsrRetT1CovIndicator(methodIn.getHpaSub() - 1, CONSTANTS.LITERAL_E);
      //  cobolCode::MOVE 'E' TO HSR-RET-INN-COV-INDICATOR ( WS-HPA-SUB )
      //  LITERAL_E = 'E'
      methodOut.setHsrRetInnCovIndicator(methodIn.getHpaSub() - 1, CONSTANTS.LITERAL_E);
      //  cobolCode::MOVE 'E' TO HSR-RET-OON-COV-INDICATOR ( WS-HPA-SUB )
      //  LITERAL_E = 'E'
      methodOut.setHsrRetOonCovIndicator(methodIn.getHpaSub() - 1, CONSTANTS.LITERAL_E);
      //  cobolCode::MOVE 1 TO HSR-RET-NET-CNT ( WS-HPA-SUB )
      //  LITERAL_1 = 1
      methodOut.setHsrRetNetCnt(methodIn.getHpaSub() - 1, 1);
    }

    return methodOut;
  }
  /**
   * readNewSviTables This method is derived from COBOL Paragraph - 3900-READ-NEW-SVI-TABLES SECTION
   * COBOL Cyclomatic complexity - 165 Input :
   *
   * <p>- hsrReqBnReqStartDt COBOL Name: HSR-REQ-BN-REQ-START-DT - polRetSlot001 COBOL Name:
   * POL-RET-SLOT-001 - polRetEff001 COBOL Name: POL-RET-EFF-001 - dsmDt COBOL Name: WS-DSM-DT -
   * polRetCanc001 COBOL Name: POL-RET-CANC-001 - hsrReqContractRtnCd COBOL Name:
   * HSR-REQ-CONTRACT-RTN-CD - bhiRetBhiCnt COBOL Name: BHI-RET-BHI-CNT - bhiRowFndSw COBOL Name:
   * WS-BHI-ROW-FND-SW - bhiSub COBOL Name: BHI-SUB - dFlag COBOL Name: WS-D-FLAG - iFlag COBOL
   * Name: WS-I-FLAG - oFlag COBOL Name: WS-O-FLAG - polRetSlot002 COBOL Name: POL-RET-SLOT-002 -
   * polRetEff002 COBOL Name: POL-RET-EFF-002 - polRetCanc002 COBOL Name: POL-RET-CANC-002 -
   * polRetSlot003 COBOL Name: POL-RET-SLOT-003 - polRetEff003 COBOL Name: POL-RET-EFF-003 -
   * polRetCanc003 COBOL Name: POL-RET-CANC-003 - polRetSlot004 COBOL Name: POL-RET-SLOT-004 -
   * polRetEff004 COBOL Name: POL-RET-EFF-004 - polRetCanc004 COBOL Name: POL-RET-CANC-004 -
   * polRetSlot005 COBOL Name: POL-RET-SLOT-005 - polRetEff005 COBOL Name: POL-RET-EFF-005 -
   * polRetCanc005 COBOL Name: POL-RET-CANC-005 - polRetSlot006 COBOL Name: POL-RET-SLOT-006 -
   * polRetEff006 COBOL Name: POL-RET-EFF-006 - polRetCanc006 COBOL Name: POL-RET-CANC-006 -
   * polRetSlot007 COBOL Name: POL-RET-SLOT-007 - polRetEff007 COBOL Name: POL-RET-EFF-007 -
   * polRetCanc007 COBOL Name: POL-RET-CANC-007 - polRetSlot008 COBOL Name: POL-RET-SLOT-008 -
   * polRetEff008 COBOL Name: POL-RET-EFF-008 - polRetCanc008 COBOL Name: POL-RET-CANC-008 -
   * polRetSlot009 COBOL Name: POL-RET-SLOT-009 - polRetEff009 COBOL Name: POL-RET-EFF-009 -
   * polRetCanc009 COBOL Name: POL-RET-CANC-009 - polRetSlot010 COBOL Name: POL-RET-SLOT-010 -
   * polRetEff010 COBOL Name: POL-RET-EFF-010 - polRetCanc010 COBOL Name: POL-RET-CANC-010 -
   * polRetSlot011 COBOL Name: POL-RET-SLOT-011 - polRetEff011 COBOL Name: POL-RET-EFF-011 -
   * polRetCanc011 COBOL Name: POL-RET-CANC-011 - polRetSlot012 COBOL Name: POL-RET-SLOT-012 -
   * polRetEff012 COBOL Name: POL-RET-EFF-012 - polRetCanc012 COBOL Name: POL-RET-CANC-012 -
   * polRetSlot013 COBOL Name: POL-RET-SLOT-013 - polRetEff013 COBOL Name: POL-RET-EFF-013 -
   * polRetCanc013 COBOL Name: POL-RET-CANC-013 - polRetSlot014 COBOL Name: POL-RET-SLOT-014 -
   * polRetEff014 COBOL Name: POL-RET-EFF-014 - polRetCanc014 COBOL Name: POL-RET-CANC-014
   *
   * <p>Output :
   *
   * <p>- dsmDtCc COBOL Name: WS-DSM-DT-CC - hsrReqBnReqStartDt COBOL Name: HSR-REQ-BN-REQ-START-DT
   * - dsmDtYy COBOL Name: WS-DSM-DT-YY - dsmDtMm COBOL Name: WS-DSM-DT-MM - dsmDtDd COBOL Name:
   * WS-DSM-DT-DD - bhiReqSlotTable COBOL Name: BHI-REQ-SLOT-TABLE - polRetSlot001 COBOL Name:
   * POL-RET-SLOT-001 - bhiCnt COBOL Name: WS-BHI-CNT - sub2 COBOL Name: WS-SUB2 - bhiRetBhiCnt
   * COBOL Name: BHI-RET-BHI-CNT - bhiSub01 COBOL Name: WS-BHI-SUB - bhiSub COBOL Name: BHI-SUB -
   * polRetSlot002 COBOL Name: POL-RET-SLOT-002 - polRetSlot003 COBOL Name: POL-RET-SLOT-003 -
   * polRetSlot004 COBOL Name: POL-RET-SLOT-004 - polRetSlot005 COBOL Name: POL-RET-SLOT-005 -
   * polRetSlot006 COBOL Name: POL-RET-SLOT-006 - polRetSlot007 COBOL Name: POL-RET-SLOT-007 -
   * polRetSlot008 COBOL Name: POL-RET-SLOT-008 - polRetSlot009 COBOL Name: POL-RET-SLOT-009 -
   * polRetSlot010 COBOL Name: POL-RET-SLOT-010 - polRetSlot011 COBOL Name: POL-RET-SLOT-011 -
   * polRetSlot012 COBOL Name: POL-RET-SLOT-012 - polRetSlot013 COBOL Name: POL-RET-SLOT-013 -
   * polRetSlot014 COBOL Name: POL-RET-SLOT-014
   *
   * @throws CFException
   */
  @Override
  public ReadNewSviTablesOutCtx readNewSviTables(ReadNewSviTablesInCtx methodIn) throws Exception {

    // *81***************************************************************
    // *81 3900-Read-new-svi-tables                                     *
    // *81                                                              *
    // *81 business function: performs througth all new svi tables      *
    // *81 if any of the dated svi tables is not spaces then for each   *
    // *81 hipaa service code search for bhi using svi slot id from     *
    // *81 page 5                                                       *
    // *81***************************************************************
    // *82 3900-read-new-svi-tables                                     *
    // *82 1.performs for all methods                                   *
    // *82                                                              *
    // *82 called by :3300-determine-n-o-svc-ind                        *
    // *82 calls     :3700-set-flags                                    *
    // *82            3800-set-cov-ind                                  *
    // *82            4000-get-hipaa-benefits                           *
    // *82            4100-move-bhi-fields                              *
    // *82            5000-get-svc-cd-nbr                               *
    // *82***************************************************************
    // Added variable to get the program context in place.
    Bbhsr002Ctx programCtx = methodIn.getBbhsr002Ctx();
    // Added variable to get the output context in place.
    ReadNewSviTablesOutCtx methodOut = methodIn.getReadNewSviTablesOutCtx();
    //  cobolCode::MOVE HSR-REQ-BN-REQ-START-DT (1 : 2) TO WS-DSM-DT-CC
    methodOut.setDsmDtCc(CFUtil.getInt(substring(methodOut.getHsrReqBnReqStartDt(), 0, 2)));
    //  cobolCode::MOVE HSR-REQ-BN-REQ-START-DT (3 : 2) TO WS-DSM-DT-YY
    methodOut.setDsmDtYy(CFUtil.getInt(substring(methodOut.getHsrReqBnReqStartDt(), 2, 4)));
    //  cobolCode::MOVE HSR-REQ-BN-REQ-START-DT (5 : 2) TO WS-DSM-DT-MM
    methodOut.setDsmDtMm(CFUtil.getInt(substring(methodOut.getHsrReqBnReqStartDt(), 4, 6)));
    //  cobolCode::MOVE HSR-REQ-BN-REQ-START-DT (7 : 2) TO WS-DSM-DT-DD
    methodOut.setDsmDtDd(CFUtil.getInt(substring(methodOut.getHsrReqBnReqStartDt(), 6, 8)));
    //  cobolCode::IF POL-RET-SLOT-001 > SPACES AND POL-RET-EFF-001 <= WS-DSM-DT AND
    // POL-RET-CANC-001 >= WS-DSM-DT
    if ((isGreaterThanSpaces(methodOut.getPolRetSlot001()))
        && compareChars(methodIn.getPolRetEff001(), methodIn.getDsmDt()) <= 0
        && compareChars(methodIn.getPolRetCanc001(), methodIn.getDsmDt()) >= 0) {
      //  cobolCode::MOVE POL-RET-SLOT-001 TO BHI-REQ-SLOT-TABLE
      methodOut.setBhiReqSlotTable(methodOut.getPolRetSlot001());
      //  cobolCode::PERFORM 4000-GET-HIPAA-BENEFITS
      getHipaaBenefits(programCtx.getGetHipaaBenefitsInCtx()); /*4000-GET-HIPAA-BENEFITS SECTION*/
      //  cobolCode::IF HSR-REQ-CONTRCT-FAIL-C-FUNC-RC
      if (methodIn.isHsrReqContrctFailCFuncRc()) {
        // cobolCode::GO TO 3900-EXIT
        return methodOut;
        // cobolCodeEnds::GO TO 3900-EXIT
      }
      //  cobolCode::MOVE BHI-RET-BHI-CNT TO WS-BHI-CNT WS-SUB2
      methodOut.setBhiCnt(methodOut.getBhiRetBhiCnt());
      methodOut.setSub2(methodOut.getBhiRetBhiCnt());
      //  cobolCode::ADD +1 TO WS-SUB2
      methodOut.setSub2(methodOut.getSub2() + 1);
      //  cobolCode::IF WS-BHI-ROW-FOUND
      if (methodIn.isBhiRowFound()) {
        //  cobolCode::MOVE 1 TO WS-BHI-SUB
        //  LITERAL_1 = 1
        methodOut.setBhiSub01(1);
        //  cobolCode::PERFORM VARYING BHI-SUB FROM 1 BY 1 UNTIL BHI-SUB > WS-BHI-CNT
        for (methodOut.setBhiSub(1);
            ((methodOut.getBhiSub() <= methodOut.getBhiCnt()));
            methodOut.setBhiSub(methodOut.getBhiSub() + 1)) {
          //  cobolCode::PERFORM 4100-MOVE-BHI-FIELDS
          moveBhiFields(programCtx.getMoveBhiFieldsInCtx()); /*4100-MOVE-BHI-FIELDS SECTION*/
          //  cobolCode::PERFORM 5000-GET-SVC-CD-NBR
          getSvcCdNbr(programCtx.getGetSvcCdNbrInCtx()); /*5000-GET-SVC-CD-NBR SECTION*/
          //  cobolCode::ADD +1 TO WS-BHI-SUB
          methodOut.setBhiSub01(methodOut.getBhiSub01() + 1);
          //  cobolCode::IF HSR-REQ-CONTRCT-FAIL-C-FUNC-RC
          if (methodIn.isHsrReqContrctFailCFuncRc()) {
            // cobolCode::GO TO 3900-EXIT
            return methodOut;
            // cobolCodeEnds::GO TO 3900-EXIT
          }
        }
      }
    }
    //  cobolCode::IF WS-D-FLAG-NO OR WS-I-FLAG-NO OR WS-O-FLAG-NO
    if (methodIn.isDFlagNo() || methodIn.isIFlagNo() || methodIn.isOFlagNo()) {
      //  cobolCode::IF POL-RET-SLOT-002 > SPACES AND POL-RET-EFF-002 <= WS-DSM-DT AND
      // POL-RET-CANC-002 >= WS-DSM-DT
      if ((isGreaterThanSpaces(methodOut.getPolRetSlot002()))
          && compareChars(methodIn.getPolRetEff002(), methodIn.getDsmDt()) <= 0
          && compareChars(methodIn.getPolRetCanc002(), methodIn.getDsmDt()) >= 0) {
        //  cobolCode::MOVE POL-RET-SLOT-002 TO BHI-REQ-SLOT-TABLE
        methodOut.setBhiReqSlotTable(methodOut.getPolRetSlot002());
        //  cobolCode::PERFORM 4000-GET-HIPAA-BENEFITS
        getHipaaBenefits(programCtx.getGetHipaaBenefitsInCtx()); /*4000-GET-HIPAA-BENEFITS SECTION*/
        //  cobolCode::IF HSR-REQ-CONTRCT-FAIL-C-FUNC-RC
        if (methodIn.isHsrReqContrctFailCFuncRc()) {
          // cobolCode::GO TO 3900-EXIT
          return methodOut;
          // cobolCodeEnds::GO TO 3900-EXIT
        }
        //  cobolCode::IF BHI-RET-BHI-CNT = 0
        //  cobolCode::ELSE
        if ((methodOut.getBhiRetBhiCnt() != 0)) {
          //  cobolCode::ADD BHI-RET-BHI-CNT TO WS-BHI-CNT
          methodOut.setBhiCnt(methodOut.getBhiCnt() + methodOut.getBhiRetBhiCnt());
        }
        //  cobolCode::IF WS-BHI-ROW-FOUND
        if (methodIn.isBhiRowFound()) {
          //  cobolCode::MOVE 1 TO WS-BHI-SUB
          //  LITERAL_1 = 1
          methodOut.setBhiSub01(1);
          //  cobolCode::PERFORM VARYING BHI-SUB FROM WS-SUB2 BY 1 UNTIL BHI-SUB > WS-BHI-CNT
          for (methodOut.setBhiSub(methodOut.getSub2());
              ((methodOut.getBhiSub() <= methodOut.getBhiCnt()));
              methodOut.setBhiSub(methodOut.getBhiSub() + 1)) {
            //  cobolCode::PERFORM 4100-MOVE-BHI-FIELDS
            moveBhiFields(programCtx.getMoveBhiFieldsInCtx()); /*4100-MOVE-BHI-FIELDS SECTION*/
            //  cobolCode::PERFORM 5000-GET-SVC-CD-NBR
            getSvcCdNbr(programCtx.getGetSvcCdNbrInCtx()); /*5000-GET-SVC-CD-NBR SECTION*/
            //  cobolCode::ADD +1 TO WS-BHI-SUB
            methodOut.setBhiSub01(methodOut.getBhiSub01() + 1);
            //  cobolCode::IF HSR-REQ-CONTRCT-FAIL-C-FUNC-RC
            if (methodIn.isHsrReqContrctFailCFuncRc()) {
              // cobolCode::GO TO 3900-EXIT
              return methodOut;
              // cobolCodeEnds::GO TO 3900-EXIT
            }
          }
          //  cobolCode::ADD BHI-RET-BHI-CNT TO WS-SUB2
          methodOut.setSub2(methodOut.getSub2() + methodOut.getBhiRetBhiCnt());
        }
      }
    }
    //  cobolCode::IF WS-D-FLAG-NO OR WS-I-FLAG-NO OR WS-O-FLAG-NO
    if (methodIn.isDFlagNo() || methodIn.isIFlagNo() || methodIn.isOFlagNo()) {
      //  cobolCode::IF POL-RET-SLOT-003 > SPACES AND POL-RET-EFF-003 <= WS-DSM-DT AND
      // POL-RET-CANC-003 >= WS-DSM-DT
      if ((isGreaterThanSpaces(methodOut.getPolRetSlot003()))
          && compareChars(methodIn.getPolRetEff003(), methodIn.getDsmDt()) <= 0
          && compareChars(methodIn.getPolRetCanc003(), methodIn.getDsmDt()) >= 0) {
        //  cobolCode::MOVE POL-RET-SLOT-003 TO BHI-REQ-SLOT-TABLE
        methodOut.setBhiReqSlotTable(methodOut.getPolRetSlot003());
        //  cobolCode::PERFORM 4000-GET-HIPAA-BENEFITS
        getHipaaBenefits(programCtx.getGetHipaaBenefitsInCtx()); /*4000-GET-HIPAA-BENEFITS SECTION*/
        //  cobolCode::IF HSR-REQ-CONTRCT-FAIL-C-FUNC-RC
        if (methodIn.isHsrReqContrctFailCFuncRc()) {
          // cobolCode::GO TO 3900-EXIT
          return methodOut;
          // cobolCodeEnds::GO TO 3900-EXIT
        }
        //  cobolCode::IF BHI-RET-BHI-CNT = 0
        //  cobolCode::ELSE
        if ((methodOut.getBhiRetBhiCnt() != 0)) {
          //  cobolCode::ADD BHI-RET-BHI-CNT TO WS-BHI-CNT
          methodOut.setBhiCnt(methodOut.getBhiCnt() + methodOut.getBhiRetBhiCnt());
        }
        //  cobolCode::IF WS-BHI-ROW-FOUND
        if (methodIn.isBhiRowFound()) {
          //  cobolCode::MOVE 1 TO WS-BHI-SUB
          //  LITERAL_1 = 1
          methodOut.setBhiSub01(1);
          //  cobolCode::PERFORM VARYING BHI-SUB FROM WS-SUB2 BY 1 UNTIL BHI-SUB > WS-BHI-CNT
          for (methodOut.setBhiSub(methodOut.getSub2());
              ((methodOut.getBhiSub() <= methodOut.getBhiCnt()));
              methodOut.setBhiSub(methodOut.getBhiSub() + 1)) {
            //  cobolCode::PERFORM 4100-MOVE-BHI-FIELDS
            moveBhiFields(programCtx.getMoveBhiFieldsInCtx()); /*4100-MOVE-BHI-FIELDS SECTION*/
            //  cobolCode::PERFORM 5000-GET-SVC-CD-NBR
            getSvcCdNbr(programCtx.getGetSvcCdNbrInCtx()); /*5000-GET-SVC-CD-NBR SECTION*/
            //  cobolCode::ADD +1 TO WS-BHI-SUB
            methodOut.setBhiSub01(methodOut.getBhiSub01() + 1);
            //  cobolCode::IF HSR-REQ-CONTRCT-FAIL-C-FUNC-RC
            if (methodIn.isHsrReqContrctFailCFuncRc()) {
              // cobolCode::GO TO 3900-EXIT
              return methodOut;
              // cobolCodeEnds::GO TO 3900-EXIT
            }
          }
          //  cobolCode::ADD BHI-RET-BHI-CNT TO WS-SUB2
          methodOut.setSub2(methodOut.getSub2() + methodOut.getBhiRetBhiCnt());
        }
      }
    }
    //  cobolCode::IF WS-D-FLAG-NO OR WS-I-FLAG-NO OR WS-O-FLAG-NO
    if (methodIn.isDFlagNo() || methodIn.isIFlagNo() || methodIn.isOFlagNo()) {
      //  cobolCode::IF POL-RET-SLOT-004 > SPACES AND POL-RET-EFF-004 <= WS-DSM-DT AND
      // POL-RET-CANC-004 >= WS-DSM-DT
      if ((isGreaterThanSpaces(methodOut.getPolRetSlot004()))
          && compareChars(methodIn.getPolRetEff004(), methodIn.getDsmDt()) <= 0
          && compareChars(methodIn.getPolRetCanc004(), methodIn.getDsmDt()) >= 0) {
        //  cobolCode::MOVE POL-RET-SLOT-004 TO BHI-REQ-SLOT-TABLE
        methodOut.setBhiReqSlotTable(methodOut.getPolRetSlot004());
        //  cobolCode::PERFORM 4000-GET-HIPAA-BENEFITS
        getHipaaBenefits(programCtx.getGetHipaaBenefitsInCtx()); /*4000-GET-HIPAA-BENEFITS SECTION*/
        //  cobolCode::IF HSR-REQ-CONTRCT-FAIL-C-FUNC-RC
        if (methodIn.isHsrReqContrctFailCFuncRc()) {
          // cobolCode::GO TO 3900-EXIT
          return methodOut;
          // cobolCodeEnds::GO TO 3900-EXIT
        }
        //  cobolCode::IF BHI-RET-BHI-CNT = 0
        //  cobolCode::ELSE
        if ((methodOut.getBhiRetBhiCnt() != 0)) {
          //  cobolCode::ADD BHI-RET-BHI-CNT TO WS-BHI-CNT
          methodOut.setBhiCnt(methodOut.getBhiCnt() + methodOut.getBhiRetBhiCnt());
        }
        //  cobolCode::IF WS-BHI-ROW-FOUND
        if (methodIn.isBhiRowFound()) {
          //  cobolCode::MOVE 1 TO WS-BHI-SUB
          //  LITERAL_1 = 1
          methodOut.setBhiSub01(1);
          //  cobolCode::PERFORM VARYING BHI-SUB FROM WS-SUB2 BY 1 UNTIL BHI-SUB > WS-BHI-CNT
          for (methodOut.setBhiSub(methodOut.getSub2());
              ((methodOut.getBhiSub() <= methodOut.getBhiCnt()));
              methodOut.setBhiSub(methodOut.getBhiSub() + 1)) {
            //  cobolCode::PERFORM 4100-MOVE-BHI-FIELDS
            moveBhiFields(programCtx.getMoveBhiFieldsInCtx()); /*4100-MOVE-BHI-FIELDS SECTION*/
            //  cobolCode::PERFORM 5000-GET-SVC-CD-NBR
            getSvcCdNbr(programCtx.getGetSvcCdNbrInCtx()); /*5000-GET-SVC-CD-NBR SECTION*/
            //  cobolCode::ADD +1 TO WS-BHI-SUB
            methodOut.setBhiSub01(methodOut.getBhiSub01() + 1);
            //  cobolCode::IF HSR-REQ-CONTRCT-FAIL-C-FUNC-RC
            if (methodIn.isHsrReqContrctFailCFuncRc()) {
              // cobolCode::GO TO 3900-EXIT
              return methodOut;
              // cobolCodeEnds::GO TO 3900-EXIT
            }
          }
          //  cobolCode::ADD BHI-RET-BHI-CNT TO WS-SUB2
          methodOut.setSub2(methodOut.getSub2() + methodOut.getBhiRetBhiCnt());
        }
      }
    }
    //  cobolCode::IF WS-D-FLAG-NO OR WS-I-FLAG-NO OR WS-O-FLAG-NO
    if (methodIn.isDFlagNo() || methodIn.isIFlagNo() || methodIn.isOFlagNo()) {
      //  cobolCode::IF POL-RET-SLOT-005 > SPACES AND POL-RET-EFF-005 <= WS-DSM-DT AND
      // POL-RET-CANC-005 >= WS-DSM-DT
      if ((isGreaterThanSpaces(methodOut.getPolRetSlot005()))
          && compareChars(methodIn.getPolRetEff005(), methodIn.getDsmDt()) <= 0
          && compareChars(methodIn.getPolRetCanc005(), methodIn.getDsmDt()) >= 0) {
        //  cobolCode::MOVE POL-RET-SLOT-005 TO BHI-REQ-SLOT-TABLE
        methodOut.setBhiReqSlotTable(methodOut.getPolRetSlot005());
        //  cobolCode::PERFORM 4000-GET-HIPAA-BENEFITS
        getHipaaBenefits(programCtx.getGetHipaaBenefitsInCtx()); /*4000-GET-HIPAA-BENEFITS SECTION*/
        //  cobolCode::IF HSR-REQ-CONTRCT-FAIL-C-FUNC-RC
        if (methodIn.isHsrReqContrctFailCFuncRc()) {
          // cobolCode::GO TO 3900-EXIT
          return methodOut;
          // cobolCodeEnds::GO TO 3900-EXIT
        }
        //  cobolCode::IF BHI-RET-BHI-CNT = 0
        //  cobolCode::ELSE
        if ((methodOut.getBhiRetBhiCnt() != 0)) {
          //  cobolCode::ADD BHI-RET-BHI-CNT TO WS-BHI-CNT
          methodOut.setBhiCnt(methodOut.getBhiCnt() + methodOut.getBhiRetBhiCnt());
        }
        //  cobolCode::IF WS-BHI-ROW-FOUND
        if (methodIn.isBhiRowFound()) {
          //  cobolCode::MOVE 1 TO WS-BHI-SUB
          //  LITERAL_1 = 1
          methodOut.setBhiSub01(1);
          //  cobolCode::PERFORM VARYING BHI-SUB FROM WS-SUB2 BY 1 UNTIL BHI-SUB > WS-BHI-CNT
          for (methodOut.setBhiSub(methodOut.getSub2());
              ((methodOut.getBhiSub() <= methodOut.getBhiCnt()));
              methodOut.setBhiSub(methodOut.getBhiSub() + 1)) {
            //  cobolCode::PERFORM 4100-MOVE-BHI-FIELDS
            moveBhiFields(programCtx.getMoveBhiFieldsInCtx()); /*4100-MOVE-BHI-FIELDS SECTION*/
            //  cobolCode::PERFORM 5000-GET-SVC-CD-NBR
            getSvcCdNbr(programCtx.getGetSvcCdNbrInCtx()); /*5000-GET-SVC-CD-NBR SECTION*/
            //  cobolCode::ADD +1 TO WS-BHI-SUB
            methodOut.setBhiSub01(methodOut.getBhiSub01() + 1);
            //  cobolCode::IF HSR-REQ-CONTRCT-FAIL-C-FUNC-RC
            if (methodIn.isHsrReqContrctFailCFuncRc()) {
              // cobolCode::GO TO 3900-EXIT
              return methodOut;
              // cobolCodeEnds::GO TO 3900-EXIT
            }
          }
          //  cobolCode::ADD BHI-RET-BHI-CNT TO WS-SUB2
          methodOut.setSub2(methodOut.getSub2() + methodOut.getBhiRetBhiCnt());
        }
      }
    }
    //  cobolCode::IF WS-D-FLAG-NO OR WS-I-FLAG-NO OR WS-O-FLAG-NO
    if (methodIn.isDFlagNo() || methodIn.isIFlagNo() || methodIn.isOFlagNo()) {
      //  cobolCode::IF POL-RET-SLOT-006 > SPACES AND POL-RET-EFF-006 <= WS-DSM-DT AND
      // POL-RET-CANC-006 >= WS-DSM-DT
      if ((isGreaterThanSpaces(methodOut.getPolRetSlot006()))
          && compareChars(methodIn.getPolRetEff006(), methodIn.getDsmDt()) <= 0
          && compareChars(methodIn.getPolRetCanc006(), methodIn.getDsmDt()) >= 0) {
        //  cobolCode::MOVE POL-RET-SLOT-006 TO BHI-REQ-SLOT-TABLE
        methodOut.setBhiReqSlotTable(methodOut.getPolRetSlot006());
        //  cobolCode::PERFORM 4000-GET-HIPAA-BENEFITS
        getHipaaBenefits(programCtx.getGetHipaaBenefitsInCtx()); /*4000-GET-HIPAA-BENEFITS SECTION*/
        //  cobolCode::IF HSR-REQ-CONTRCT-FAIL-C-FUNC-RC
        if (methodIn.isHsrReqContrctFailCFuncRc()) {
          // cobolCode::GO TO 3900-EXIT
          return methodOut;
          // cobolCodeEnds::GO TO 3900-EXIT
        }
        //  cobolCode::IF BHI-RET-BHI-CNT = 0
        //  cobolCode::ELSE
        if ((methodOut.getBhiRetBhiCnt() != 0)) {
          //  cobolCode::ADD BHI-RET-BHI-CNT TO WS-BHI-CNT
          methodOut.setBhiCnt(methodOut.getBhiCnt() + methodOut.getBhiRetBhiCnt());
        }
        //  cobolCode::IF WS-BHI-ROW-FOUND
        if (methodIn.isBhiRowFound()) {
          //  cobolCode::MOVE 1 TO WS-BHI-SUB
          //  LITERAL_1 = 1
          methodOut.setBhiSub01(1);
          //  cobolCode::PERFORM VARYING BHI-SUB FROM WS-SUB2 BY 1 UNTIL BHI-SUB > WS-BHI-CNT
          for (methodOut.setBhiSub(methodOut.getSub2());
              ((methodOut.getBhiSub() <= methodOut.getBhiCnt()));
              methodOut.setBhiSub(methodOut.getBhiSub() + 1)) {
            //  cobolCode::PERFORM 4100-MOVE-BHI-FIELDS
            moveBhiFields(programCtx.getMoveBhiFieldsInCtx()); /*4100-MOVE-BHI-FIELDS SECTION*/
            //  cobolCode::PERFORM 5000-GET-SVC-CD-NBR
            getSvcCdNbr(programCtx.getGetSvcCdNbrInCtx()); /*5000-GET-SVC-CD-NBR SECTION*/
            //  cobolCode::ADD +1 TO WS-BHI-SUB
            methodOut.setBhiSub01(methodOut.getBhiSub01() + 1);
            //  cobolCode::IF HSR-REQ-CONTRCT-FAIL-C-FUNC-RC
            if (methodIn.isHsrReqContrctFailCFuncRc()) {
              // cobolCode::GO TO 3900-EXIT
              return methodOut;
              // cobolCodeEnds::GO TO 3900-EXIT
            }
          }
          //  cobolCode::ADD BHI-RET-BHI-CNT TO WS-SUB2
          methodOut.setSub2(methodOut.getSub2() + methodOut.getBhiRetBhiCnt());
        }
      }
    }
    //  cobolCode::IF WS-D-FLAG-NO OR WS-I-FLAG-NO OR WS-O-FLAG-NO
    if (methodIn.isDFlagNo() || methodIn.isIFlagNo() || methodIn.isOFlagNo()) {
      //  cobolCode::IF POL-RET-SLOT-007 > SPACES AND POL-RET-EFF-007 <= WS-DSM-DT AND
      // POL-RET-CANC-007 >= WS-DSM-DT
      if ((isGreaterThanSpaces(methodOut.getPolRetSlot007()))
          && compareChars(methodIn.getPolRetEff007(), methodIn.getDsmDt()) <= 0
          && compareChars(methodIn.getPolRetCanc007(), methodIn.getDsmDt()) >= 0) {
        //  cobolCode::MOVE POL-RET-SLOT-007 TO BHI-REQ-SLOT-TABLE
        methodOut.setBhiReqSlotTable(methodOut.getPolRetSlot007());
        //  cobolCode::PERFORM 4000-GET-HIPAA-BENEFITS
        getHipaaBenefits(programCtx.getGetHipaaBenefitsInCtx()); /*4000-GET-HIPAA-BENEFITS SECTION*/
        //  cobolCode::IF HSR-REQ-CONTRCT-FAIL-C-FUNC-RC
        if (methodIn.isHsrReqContrctFailCFuncRc()) {
          // cobolCode::GO TO 3900-EXIT
          return methodOut;
          // cobolCodeEnds::GO TO 3900-EXIT
        }
        //  cobolCode::IF BHI-RET-BHI-CNT = 0
        //  cobolCode::ELSE
        if ((methodOut.getBhiRetBhiCnt() != 0)) {
          //  cobolCode::ADD BHI-RET-BHI-CNT TO WS-BHI-CNT
          methodOut.setBhiCnt(methodOut.getBhiCnt() + methodOut.getBhiRetBhiCnt());
        }
        //  cobolCode::IF WS-BHI-ROW-FOUND
        if (methodIn.isBhiRowFound()) {
          //  cobolCode::MOVE 1 TO WS-BHI-SUB
          //  LITERAL_1 = 1
          methodOut.setBhiSub01(1);
          //  cobolCode::PERFORM VARYING BHI-SUB FROM WS-SUB2 BY 1 UNTIL BHI-SUB > WS-BHI-CNT
          for (methodOut.setBhiSub(methodOut.getSub2());
              ((methodOut.getBhiSub() <= methodOut.getBhiCnt()));
              methodOut.setBhiSub(methodOut.getBhiSub() + 1)) {
            //  cobolCode::PERFORM 4100-MOVE-BHI-FIELDS
            moveBhiFields(programCtx.getMoveBhiFieldsInCtx()); /*4100-MOVE-BHI-FIELDS SECTION*/
            //  cobolCode::PERFORM 5000-GET-SVC-CD-NBR
            getSvcCdNbr(programCtx.getGetSvcCdNbrInCtx()); /*5000-GET-SVC-CD-NBR SECTION*/
            //  cobolCode::ADD +1 TO WS-BHI-SUB
            methodOut.setBhiSub01(methodOut.getBhiSub01() + 1);
            //  cobolCode::IF HSR-REQ-CONTRCT-FAIL-C-FUNC-RC
            if (methodIn.isHsrReqContrctFailCFuncRc()) {
              // cobolCode::GO TO 3900-EXIT
              return methodOut;
              // cobolCodeEnds::GO TO 3900-EXIT
            }
          }
          //  cobolCode::ADD BHI-RET-BHI-CNT TO WS-SUB2
          methodOut.setSub2(methodOut.getSub2() + methodOut.getBhiRetBhiCnt());
        }
      }
    }
    //  cobolCode::IF WS-D-FLAG-NO OR WS-I-FLAG-NO OR WS-O-FLAG-NO
    if (methodIn.isDFlagNo() || methodIn.isIFlagNo() || methodIn.isOFlagNo()) {
      //  cobolCode::IF POL-RET-SLOT-008 > SPACES AND POL-RET-EFF-008 <= WS-DSM-DT AND
      // POL-RET-CANC-008 >= WS-DSM-DT
      if ((isGreaterThanSpaces(methodOut.getPolRetSlot008()))
          && compareChars(methodIn.getPolRetEff008(), methodIn.getDsmDt()) <= 0
          && compareChars(methodIn.getPolRetCanc008(), methodIn.getDsmDt()) >= 0) {
        //  cobolCode::MOVE POL-RET-SLOT-008 TO BHI-REQ-SLOT-TABLE
        methodOut.setBhiReqSlotTable(methodOut.getPolRetSlot008());
        //  cobolCode::PERFORM 4000-GET-HIPAA-BENEFITS
        getHipaaBenefits(programCtx.getGetHipaaBenefitsInCtx()); /*4000-GET-HIPAA-BENEFITS SECTION*/
        //  cobolCode::IF HSR-REQ-CONTRCT-FAIL-C-FUNC-RC
        if (methodIn.isHsrReqContrctFailCFuncRc()) {
          // cobolCode::GO TO 3900-EXIT
          return methodOut;
          // cobolCodeEnds::GO TO 3900-EXIT
        }
        //  cobolCode::IF BHI-RET-BHI-CNT = 0
        //  cobolCode::ELSE
        if ((methodOut.getBhiRetBhiCnt() != 0)) {
          //  cobolCode::ADD BHI-RET-BHI-CNT TO WS-BHI-CNT
          methodOut.setBhiCnt(methodOut.getBhiCnt() + methodOut.getBhiRetBhiCnt());
        }
        //  cobolCode::IF WS-BHI-ROW-FOUND
        if (methodIn.isBhiRowFound()) {
          //  cobolCode::MOVE 1 TO WS-BHI-SUB
          //  LITERAL_1 = 1
          methodOut.setBhiSub01(1);
          //  cobolCode::PERFORM VARYING BHI-SUB FROM WS-SUB2 BY 1 UNTIL BHI-SUB > WS-BHI-CNT
          for (methodOut.setBhiSub(methodOut.getSub2());
              ((methodOut.getBhiSub() <= methodOut.getBhiCnt()));
              methodOut.setBhiSub(methodOut.getBhiSub() + 1)) {
            //  cobolCode::PERFORM 4100-MOVE-BHI-FIELDS
            moveBhiFields(programCtx.getMoveBhiFieldsInCtx()); /*4100-MOVE-BHI-FIELDS SECTION*/
            //  cobolCode::PERFORM 5000-GET-SVC-CD-NBR
            getSvcCdNbr(programCtx.getGetSvcCdNbrInCtx()); /*5000-GET-SVC-CD-NBR SECTION*/
            //  cobolCode::ADD +1 TO WS-BHI-SUB
            methodOut.setBhiSub01(methodOut.getBhiSub01() + 1);
            //  cobolCode::IF HSR-REQ-CONTRCT-FAIL-C-FUNC-RC
            if (methodIn.isHsrReqContrctFailCFuncRc()) {
              // cobolCode::GO TO 3900-EXIT
              return methodOut;
              // cobolCodeEnds::GO TO 3900-EXIT
            }
          }
          //  cobolCode::ADD BHI-RET-BHI-CNT TO WS-SUB2
          methodOut.setSub2(methodOut.getSub2() + methodOut.getBhiRetBhiCnt());
        }
      }
    }
    //  cobolCode::IF WS-D-FLAG-NO OR WS-I-FLAG-NO OR WS-O-FLAG-NO
    if (methodIn.isDFlagNo() || methodIn.isIFlagNo() || methodIn.isOFlagNo()) {
      //  cobolCode::IF POL-RET-SLOT-009 > SPACES AND POL-RET-EFF-009 <= WS-DSM-DT AND
      // POL-RET-CANC-009 >= WS-DSM-DT
      if ((isGreaterThanSpaces(methodOut.getPolRetSlot009()))
          && compareChars(methodIn.getPolRetEff009(), methodIn.getDsmDt()) <= 0
          && compareChars(methodIn.getPolRetCanc009(), methodIn.getDsmDt()) >= 0) {
        //  cobolCode::MOVE POL-RET-SLOT-009 TO BHI-REQ-SLOT-TABLE
        methodOut.setBhiReqSlotTable(methodOut.getPolRetSlot009());
        //  cobolCode::PERFORM 4000-GET-HIPAA-BENEFITS
        getHipaaBenefits(programCtx.getGetHipaaBenefitsInCtx()); /*4000-GET-HIPAA-BENEFITS SECTION*/
        //  cobolCode::IF HSR-REQ-CONTRCT-FAIL-C-FUNC-RC
        if (methodIn.isHsrReqContrctFailCFuncRc()) {
          // cobolCode::GO TO 3900-EXIT
          return methodOut;
          // cobolCodeEnds::GO TO 3900-EXIT
        }
        //  cobolCode::IF BHI-RET-BHI-CNT = 0
        //  cobolCode::ELSE
        if ((methodOut.getBhiRetBhiCnt() != 0)) {
          //  cobolCode::ADD BHI-RET-BHI-CNT TO WS-BHI-CNT
          methodOut.setBhiCnt(methodOut.getBhiCnt() + methodOut.getBhiRetBhiCnt());
        }
        //  cobolCode::IF WS-BHI-ROW-FOUND
        if (methodIn.isBhiRowFound()) {
          //  cobolCode::MOVE 1 TO WS-BHI-SUB
          //  LITERAL_1 = 1
          methodOut.setBhiSub01(1);
          //  cobolCode::PERFORM VARYING BHI-SUB FROM WS-SUB2 BY 1 UNTIL BHI-SUB > WS-BHI-CNT
          for (methodOut.setBhiSub(methodOut.getSub2());
              ((methodOut.getBhiSub() <= methodOut.getBhiCnt()));
              methodOut.setBhiSub(methodOut.getBhiSub() + 1)) {
            //  cobolCode::PERFORM 4100-MOVE-BHI-FIELDS
            moveBhiFields(programCtx.getMoveBhiFieldsInCtx()); /*4100-MOVE-BHI-FIELDS SECTION*/
            //  cobolCode::PERFORM 5000-GET-SVC-CD-NBR
            getSvcCdNbr(programCtx.getGetSvcCdNbrInCtx()); /*5000-GET-SVC-CD-NBR SECTION*/
            //  cobolCode::ADD +1 TO WS-BHI-SUB
            methodOut.setBhiSub01(methodOut.getBhiSub01() + 1);
            //  cobolCode::IF HSR-REQ-CONTRCT-FAIL-C-FUNC-RC
            if (methodIn.isHsrReqContrctFailCFuncRc()) {
              // cobolCode::GO TO 3900-EXIT
              return methodOut;
              // cobolCodeEnds::GO TO 3900-EXIT
            }
          }
          //  cobolCode::ADD BHI-RET-BHI-CNT TO WS-SUB2
          methodOut.setSub2(methodOut.getSub2() + methodOut.getBhiRetBhiCnt());
        }
      }
    }
    //  cobolCode::IF WS-D-FLAG-NO OR WS-I-FLAG-NO OR WS-O-FLAG-NO
    if (methodIn.isDFlagNo() || methodIn.isIFlagNo() || methodIn.isOFlagNo()) {
      //  cobolCode::IF POL-RET-SLOT-010 > SPACES AND POL-RET-EFF-010 <= WS-DSM-DT AND
      // POL-RET-CANC-010 >= WS-DSM-DT
      if ((isGreaterThanSpaces(methodOut.getPolRetSlot010()))
          && compareChars(methodIn.getPolRetEff010(), methodIn.getDsmDt()) <= 0
          && compareChars(methodIn.getPolRetCanc010(), methodIn.getDsmDt()) >= 0) {
        //  cobolCode::MOVE POL-RET-SLOT-010 TO BHI-REQ-SLOT-TABLE
        methodOut.setBhiReqSlotTable(methodOut.getPolRetSlot010());
        //  cobolCode::PERFORM 4000-GET-HIPAA-BENEFITS
        getHipaaBenefits(programCtx.getGetHipaaBenefitsInCtx()); /*4000-GET-HIPAA-BENEFITS SECTION*/
        //  cobolCode::IF HSR-REQ-CONTRCT-FAIL-C-FUNC-RC
        if (methodIn.isHsrReqContrctFailCFuncRc()) {
          // cobolCode::GO TO 3900-EXIT
          return methodOut;
          // cobolCodeEnds::GO TO 3900-EXIT
        }
        //  cobolCode::IF BHI-RET-BHI-CNT = 0
        //  cobolCode::ELSE
        if ((methodOut.getBhiRetBhiCnt() != 0)) {
          //  cobolCode::ADD BHI-RET-BHI-CNT TO WS-BHI-CNT
          methodOut.setBhiCnt(methodOut.getBhiCnt() + methodOut.getBhiRetBhiCnt());
        }
        //  cobolCode::IF WS-BHI-ROW-FOUND
        if (methodIn.isBhiRowFound()) {
          //  cobolCode::MOVE 1 TO WS-BHI-SUB
          //  LITERAL_1 = 1
          methodOut.setBhiSub01(1);
          //  cobolCode::PERFORM VARYING BHI-SUB FROM WS-SUB2 BY 1 UNTIL BHI-SUB > WS-BHI-CNT
          for (methodOut.setBhiSub(methodOut.getSub2());
              ((methodOut.getBhiSub() <= methodOut.getBhiCnt()));
              methodOut.setBhiSub(methodOut.getBhiSub() + 1)) {
            //  cobolCode::PERFORM 4100-MOVE-BHI-FIELDS
            moveBhiFields(programCtx.getMoveBhiFieldsInCtx()); /*4100-MOVE-BHI-FIELDS SECTION*/
            //  cobolCode::PERFORM 5000-GET-SVC-CD-NBR
            getSvcCdNbr(programCtx.getGetSvcCdNbrInCtx()); /*5000-GET-SVC-CD-NBR SECTION*/
            //  cobolCode::ADD +1 TO WS-BHI-SUB
            methodOut.setBhiSub01(methodOut.getBhiSub01() + 1);
            //  cobolCode::IF HSR-REQ-CONTRCT-FAIL-C-FUNC-RC
            if (methodIn.isHsrReqContrctFailCFuncRc()) {
              // cobolCode::GO TO 3900-EXIT
              return methodOut;
              // cobolCodeEnds::GO TO 3900-EXIT
            }
          }
          //  cobolCode::ADD BHI-RET-BHI-CNT TO WS-SUB2
          methodOut.setSub2(methodOut.getSub2() + methodOut.getBhiRetBhiCnt());
        }
      }
    }
    //  cobolCode::IF WS-D-FLAG-NO OR WS-I-FLAG-NO OR WS-O-FLAG-NO
    if (methodIn.isDFlagNo() || methodIn.isIFlagNo() || methodIn.isOFlagNo()) {
      //  cobolCode::IF POL-RET-SLOT-011 > SPACES AND POL-RET-EFF-011 <= WS-DSM-DT AND
      // POL-RET-CANC-011 >= WS-DSM-DT
      if ((isGreaterThanSpaces(methodOut.getPolRetSlot011()))
          && compareChars(methodIn.getPolRetEff011(), methodIn.getDsmDt()) <= 0
          && compareChars(methodIn.getPolRetCanc011(), methodIn.getDsmDt()) >= 0) {
        //  cobolCode::MOVE POL-RET-SLOT-011 TO BHI-REQ-SLOT-TABLE
        methodOut.setBhiReqSlotTable(methodOut.getPolRetSlot011());
        //  cobolCode::PERFORM 4000-GET-HIPAA-BENEFITS
        getHipaaBenefits(programCtx.getGetHipaaBenefitsInCtx()); /*4000-GET-HIPAA-BENEFITS SECTION*/
        //  cobolCode::IF HSR-REQ-CONTRCT-FAIL-C-FUNC-RC
        if (methodIn.isHsrReqContrctFailCFuncRc()) {
          // cobolCode::GO TO 3900-EXIT
          return methodOut;
          // cobolCodeEnds::GO TO 3900-EXIT
        }
        //  cobolCode::IF BHI-RET-BHI-CNT = 0
        //  cobolCode::ELSE
        if ((methodOut.getBhiRetBhiCnt() != 0)) {
          //  cobolCode::ADD BHI-RET-BHI-CNT TO WS-BHI-CNT
          methodOut.setBhiCnt(methodOut.getBhiCnt() + methodOut.getBhiRetBhiCnt());
        }
        //  cobolCode::IF WS-BHI-ROW-FOUND
        if (methodIn.isBhiRowFound()) {
          //  cobolCode::MOVE 1 TO WS-BHI-SUB
          //  LITERAL_1 = 1
          methodOut.setBhiSub01(1);
          //  cobolCode::PERFORM VARYING BHI-SUB FROM WS-SUB2 BY 1 UNTIL BHI-SUB > WS-BHI-CNT
          for (methodOut.setBhiSub(methodOut.getSub2());
              ((methodOut.getBhiSub() <= methodOut.getBhiCnt()));
              methodOut.setBhiSub(methodOut.getBhiSub() + 1)) {
            //  cobolCode::PERFORM 4100-MOVE-BHI-FIELDS
            moveBhiFields(programCtx.getMoveBhiFieldsInCtx()); /*4100-MOVE-BHI-FIELDS SECTION*/
            //  cobolCode::PERFORM 5000-GET-SVC-CD-NBR
            getSvcCdNbr(programCtx.getGetSvcCdNbrInCtx()); /*5000-GET-SVC-CD-NBR SECTION*/
            //  cobolCode::ADD +1 TO WS-BHI-SUB
            methodOut.setBhiSub01(methodOut.getBhiSub01() + 1);
            //  cobolCode::IF HSR-REQ-CONTRCT-FAIL-C-FUNC-RC
            if (methodIn.isHsrReqContrctFailCFuncRc()) {
              // cobolCode::GO TO 3900-EXIT
              return methodOut;
              // cobolCodeEnds::GO TO 3900-EXIT
            }
          }
          //  cobolCode::ADD BHI-RET-BHI-CNT TO WS-SUB2
          methodOut.setSub2(methodOut.getSub2() + methodOut.getBhiRetBhiCnt());
        }
      }
    }
    //  cobolCode::IF WS-D-FLAG-NO OR WS-I-FLAG-NO OR WS-O-FLAG-NO
    if (methodIn.isDFlagNo() || methodIn.isIFlagNo() || methodIn.isOFlagNo()) {
      //  cobolCode::IF POL-RET-SLOT-012 > SPACES AND POL-RET-EFF-012 <= WS-DSM-DT AND
      // POL-RET-CANC-012 >= WS-DSM-DT
      if ((isGreaterThanSpaces(methodOut.getPolRetSlot012()))
          && compareChars(methodIn.getPolRetEff012(), methodIn.getDsmDt()) <= 0
          && compareChars(methodIn.getPolRetCanc012(), methodIn.getDsmDt()) >= 0) {
        //  cobolCode::MOVE POL-RET-SLOT-012 TO BHI-REQ-SLOT-TABLE
        methodOut.setBhiReqSlotTable(methodOut.getPolRetSlot012());
        //  cobolCode::PERFORM 4000-GET-HIPAA-BENEFITS
        getHipaaBenefits(programCtx.getGetHipaaBenefitsInCtx()); /*4000-GET-HIPAA-BENEFITS SECTION*/
        //  cobolCode::IF HSR-REQ-CONTRCT-FAIL-C-FUNC-RC
        if (methodIn.isHsrReqContrctFailCFuncRc()) {
          // cobolCode::GO TO 3900-EXIT
          return methodOut;
          // cobolCodeEnds::GO TO 3900-EXIT
        }
        //  cobolCode::IF BHI-RET-BHI-CNT = 0
        //  cobolCode::ELSE
        if ((methodOut.getBhiRetBhiCnt() != 0)) {
          //  cobolCode::ADD BHI-RET-BHI-CNT TO WS-BHI-CNT
          methodOut.setBhiCnt(methodOut.getBhiCnt() + methodOut.getBhiRetBhiCnt());
        }
        //  cobolCode::IF WS-BHI-ROW-FOUND
        if (methodIn.isBhiRowFound()) {
          //  cobolCode::MOVE 1 TO WS-BHI-SUB
          //  LITERAL_1 = 1
          methodOut.setBhiSub01(1);
          //  cobolCode::PERFORM VARYING BHI-SUB FROM WS-SUB2 BY 1 UNTIL BHI-SUB > WS-BHI-CNT
          for (methodOut.setBhiSub(methodOut.getSub2());
              ((methodOut.getBhiSub() <= methodOut.getBhiCnt()));
              methodOut.setBhiSub(methodOut.getBhiSub() + 1)) {
            //  cobolCode::PERFORM 4100-MOVE-BHI-FIELDS
            moveBhiFields(programCtx.getMoveBhiFieldsInCtx()); /*4100-MOVE-BHI-FIELDS SECTION*/
            //  cobolCode::PERFORM 5000-GET-SVC-CD-NBR
            getSvcCdNbr(programCtx.getGetSvcCdNbrInCtx()); /*5000-GET-SVC-CD-NBR SECTION*/
            //  cobolCode::ADD +1 TO WS-BHI-SUB
            methodOut.setBhiSub01(methodOut.getBhiSub01() + 1);
            //  cobolCode::IF HSR-REQ-CONTRCT-FAIL-C-FUNC-RC
            if (methodIn.isHsrReqContrctFailCFuncRc()) {
              // cobolCode::GO TO 3900-EXIT
              return methodOut;
              // cobolCodeEnds::GO TO 3900-EXIT
            }
          }
          //  cobolCode::ADD BHI-RET-BHI-CNT TO WS-SUB2
          methodOut.setSub2(methodOut.getSub2() + methodOut.getBhiRetBhiCnt());
        }
      }
    }
    //  cobolCode::IF WS-D-FLAG-NO OR WS-I-FLAG-NO OR WS-O-FLAG-NO
    if (methodIn.isDFlagNo() || methodIn.isIFlagNo() || methodIn.isOFlagNo()) {
      //  cobolCode::IF POL-RET-SLOT-013 > SPACES AND POL-RET-EFF-013 <= WS-DSM-DT AND
      // POL-RET-CANC-013 >= WS-DSM-DT
      if ((isGreaterThanSpaces(methodOut.getPolRetSlot013()))
          && compareChars(methodIn.getPolRetEff013(), methodIn.getDsmDt()) <= 0
          && compareChars(methodIn.getPolRetCanc013(), methodIn.getDsmDt()) >= 0) {
        //  cobolCode::MOVE POL-RET-SLOT-013 TO BHI-REQ-SLOT-TABLE
        methodOut.setBhiReqSlotTable(methodOut.getPolRetSlot013());
        //  cobolCode::PERFORM 4000-GET-HIPAA-BENEFITS
        getHipaaBenefits(programCtx.getGetHipaaBenefitsInCtx()); /*4000-GET-HIPAA-BENEFITS SECTION*/
        //  cobolCode::IF HSR-REQ-CONTRCT-FAIL-C-FUNC-RC
        if (methodIn.isHsrReqContrctFailCFuncRc()) {
          // cobolCode::GO TO 3900-EXIT
          return methodOut;
          // cobolCodeEnds::GO TO 3900-EXIT
        }
        //  cobolCode::IF BHI-RET-BHI-CNT = 0
        //  cobolCode::ELSE
        if ((methodOut.getBhiRetBhiCnt() != 0)) {
          //  cobolCode::ADD BHI-RET-BHI-CNT TO WS-BHI-CNT
          methodOut.setBhiCnt(methodOut.getBhiCnt() + methodOut.getBhiRetBhiCnt());
        }
        //  cobolCode::IF WS-BHI-ROW-FOUND
        if (methodIn.isBhiRowFound()) {
          //  cobolCode::MOVE 1 TO WS-BHI-SUB
          //  LITERAL_1 = 1
          methodOut.setBhiSub01(1);
          //  cobolCode::PERFORM VARYING BHI-SUB FROM WS-SUB2 BY 1 UNTIL BHI-SUB > WS-BHI-CNT
          for (methodOut.setBhiSub(methodOut.getSub2());
              ((methodOut.getBhiSub() <= methodOut.getBhiCnt()));
              methodOut.setBhiSub(methodOut.getBhiSub() + 1)) {
            //  cobolCode::PERFORM 4100-MOVE-BHI-FIELDS
            moveBhiFields(programCtx.getMoveBhiFieldsInCtx()); /*4100-MOVE-BHI-FIELDS SECTION*/
            //  cobolCode::PERFORM 5000-GET-SVC-CD-NBR
            getSvcCdNbr(programCtx.getGetSvcCdNbrInCtx()); /*5000-GET-SVC-CD-NBR SECTION*/
            //  cobolCode::ADD +1 TO WS-BHI-SUB
            methodOut.setBhiSub01(methodOut.getBhiSub01() + 1);
            //  cobolCode::IF HSR-REQ-CONTRCT-FAIL-C-FUNC-RC
            if (methodIn.isHsrReqContrctFailCFuncRc()) {
              // cobolCode::GO TO 3900-EXIT
              return methodOut;
              // cobolCodeEnds::GO TO 3900-EXIT
            }
          }
          //  cobolCode::ADD BHI-RET-BHI-CNT TO WS-SUB2
          methodOut.setSub2(methodOut.getSub2() + methodOut.getBhiRetBhiCnt());
        }
      }
    }
    //  cobolCode::IF WS-D-FLAG-NO OR WS-I-FLAG-NO OR WS-O-FLAG-NO
    if (methodIn.isDFlagNo() || methodIn.isIFlagNo() || methodIn.isOFlagNo()) {
      //  cobolCode::IF POL-RET-SLOT-014 > SPACES AND POL-RET-EFF-014 <= WS-DSM-DT AND
      // POL-RET-CANC-014 >= WS-DSM-DT
      if ((isGreaterThanSpaces(methodOut.getPolRetSlot014()))
          && compareChars(methodIn.getPolRetEff014(), methodIn.getDsmDt()) <= 0
          && compareChars(methodIn.getPolRetCanc014(), methodIn.getDsmDt()) >= 0) {
        //  cobolCode::MOVE POL-RET-SLOT-014 TO BHI-REQ-SLOT-TABLE
        methodOut.setBhiReqSlotTable(methodOut.getPolRetSlot014());
        //  cobolCode::PERFORM 4000-GET-HIPAA-BENEFITS
        getHipaaBenefits(programCtx.getGetHipaaBenefitsInCtx()); /*4000-GET-HIPAA-BENEFITS SECTION*/
        //  cobolCode::IF HSR-REQ-CONTRCT-FAIL-C-FUNC-RC
        if (methodIn.isHsrReqContrctFailCFuncRc()) {
          // cobolCode::GO TO 3900-EXIT
          return methodOut;
          // cobolCodeEnds::GO TO 3900-EXIT
        }
        //  cobolCode::IF BHI-RET-BHI-CNT = 0
        //  cobolCode::ELSE
        if ((methodOut.getBhiRetBhiCnt() != 0)) {
          //  cobolCode::ADD BHI-RET-BHI-CNT TO WS-BHI-CNT
          methodOut.setBhiCnt(methodOut.getBhiCnt() + methodOut.getBhiRetBhiCnt());
        }
        //  cobolCode::IF WS-BHI-ROW-FOUND
        if (methodIn.isBhiRowFound()) {
          //  cobolCode::MOVE 1 TO WS-BHI-SUB
          //  LITERAL_1 = 1
          methodOut.setBhiSub01(1);
          //  cobolCode::PERFORM VARYING BHI-SUB FROM WS-SUB2 BY 1 UNTIL BHI-SUB > WS-BHI-CNT
          for (methodOut.setBhiSub(methodOut.getSub2());
              ((methodOut.getBhiSub() <= methodOut.getBhiCnt()));
              methodOut.setBhiSub(methodOut.getBhiSub() + 1)) {
            //  cobolCode::PERFORM 4100-MOVE-BHI-FIELDS
            moveBhiFields(programCtx.getMoveBhiFieldsInCtx()); /*4100-MOVE-BHI-FIELDS SECTION*/
            //  cobolCode::PERFORM 5000-GET-SVC-CD-NBR
            getSvcCdNbr(programCtx.getGetSvcCdNbrInCtx()); /*5000-GET-SVC-CD-NBR SECTION*/
            //  cobolCode::ADD +1 TO WS-BHI-SUB
            methodOut.setBhiSub01(methodOut.getBhiSub01() + 1);
            //  cobolCode::IF HSR-REQ-CONTRCT-FAIL-C-FUNC-RC
            if (methodIn.isHsrReqContrctFailCFuncRc()) {
              // cobolCode::GO TO 3900-EXIT
              return methodOut;
              // cobolCodeEnds::GO TO 3900-EXIT
            }
          }
          //  cobolCode::ADD BHI-RET-BHI-CNT TO WS-SUB2
          methodOut.setSub2(methodOut.getSub2() + methodOut.getBhiRetBhiCnt());
        }
      }
    }

    return methodOut;
  }
  /**
   * getHipaaBenefits This method is derived from COBOL Paragraph - 4000-GET-HIPAA-BENEFITS SECTION
   * COBOL Cyclomatic complexity - 4 Input :
   *
   * <p>- hipaaCd COBOL Name: WS-HIPAA-CD - versionNo COBOL Name: WS-VERSION-NO - hsrReqEffDate
   * COBOL Name: HSR-REQ-EFF-DATE - hsrReqCancelDate COBOL Name: HSR-REQ-CANCEL-DATE - dsmReturnCode
   * COBOL Name: DSM-RETURN-CODE - dsmSqlcode COBOL Name: DSM-SQLCODE - dsmErrSectnName COBOL Name:
   * DSM-ERR-SECTN-NAME
   *
   * <p>Output :
   *
   * <p>- bhiReqHipaaCode COBOL Name: BHI-REQ-HIPAA-CODE - hipaaCd COBOL Name: WS-HIPAA-CD -
   * bhiReqHipaaVerNbr COBOL Name: BHI-REQ-HIPAA-VER-NBR - versionNo COBOL Name: WS-VERSION-NO -
   * dsmDt COBOL Name: WS-DSM-DT - dsmDtCc COBOL Name: WS-DSM-DT-CC - hsrReqEffDate COBOL Name:
   * HSR-REQ-EFF-DATE - dsmDtYy COBOL Name: WS-DSM-DT-YY - dsmDtMm COBOL Name: WS-DSM-DT-MM -
   * dsmDtDd COBOL Name: WS-DSM-DT-DD - bhiReqEffectDate COBOL Name: BHI-REQ-EFFECT-DATE -
   * hsrReqCancelDate COBOL Name: HSR-REQ-CANCEL-DATE - bhiReqCancelDate COBOL Name:
   * BHI-REQ-CANCEL-DATE - bhiRetArea COBOL Name: BHI-RET-AREA - dsmFuncCd COBOL Name: DSM-FUNC-CD -
   * rc COBOL Name: RETURN-CODE - bhiRowFndSw COBOL Name: WS-BHI-ROW-FND-SW - posCnt COBOL Name:
   * WS-POS-CNT - reqReturnCode COBOL Name: REQ-RETURN-CODE - reqExplanationCode COBOL Name:
   * REQ-EXPLANATION-CODE - hsrReqContractRtnCd COBOL Name: HSR-REQ-CONTRACT-RTN-CD - fmaFixedArea
   * COBOL Name: FMA-FIXED-AREA - fmaIpType1 COBOL Name: FMA-IP-TYPE-1 - fmaIpTypeNumeric1 COBOL
   * Name: FMA-IP-TYPE-NUMERIC-1 - dsmSqlcode COBOL Name: DSM-SQLCODE - fmaIpTypeAlpha1 COBOL Name:
   * FMA-IP-TYPE-ALPHA-1 - fmaIpTypeAlpha2 COBOL Name: FMA-IP-TYPE-ALPHA-2 - dsmErrSectnName COBOL
   * Name: DSM-ERR-SECTN-NAME - fmaIpErrCode1 COBOL Name: FMA-IP-ERR-CODE-1
   *
   * @throws CFException
   */
  @Override
  public GetHipaaBenefitsOutCtx getHipaaBenefits(GetHipaaBenefitsInCtx methodIn) throws Exception {

    // *81***************************************************************
    // *81 4000-Get-hipaa-benefits                                      *
    // *81                                                              *
    // *81 business function: calls the d5427bhi dsm to retrieve bhi    *
    // *81 data                                                         *
    // *81***************************************************************
    // *82 4000-get-hipaa-benefits                                      *
    // *82 1.business function: calls the dsm to retrive bhi data       *
    // *82                                                              *
    // *82 called by :3400-process-new-svc-method                       *
    // *82            3500-process-comb-svc-method                      *
    // *82            3600-process-old-svc-method                       *
    // *82            4001-check-hippa-cd-af                            *
    // *82 calls     :set-fma-err-tbl-9000                              *
    // *82***************************************************************
    // Added variable to get the program context in place.
    Bbhsr002Ctx programCtx = methodIn.getBbhsr002Ctx();
    // Added variable to get the output context in place.
    GetHipaaBenefitsOutCtx methodOut = methodIn.getGetHipaaBenefitsOutCtx();
    //  cobolCode::MOVE WS-HIPAA-CD ( WS-HPA-SUB ) TO BHI-REQ-HIPAA-CODE
    methodOut.setBhiReqHipaaCode(methodOut.getHipaaCd(methodIn.getHpaSub() - 1));
    //  cobolCode::MOVE WS-VERSION-NO TO BHI-REQ-HIPAA-VER-NBR
    methodOut.setBhiReqHipaaVerNbr(methodOut.getVersionNo());
    //  cobolCode::INITIALIZE WS-DSM-DT
    methodOut.getDsmDt().initialize();
    //  cobolCode::MOVE HSR-REQ-EFF-DATE (1 : 2) TO WS-DSM-DT-CC
    methodOut.setDsmDtCc(CFUtil.getInt(substring(methodOut.getHsrReqEffDateString(), 0, 2)));
    //  cobolCode::MOVE HSR-REQ-EFF-DATE (3 : 2) TO WS-DSM-DT-YY
    methodOut.setDsmDtYy(CFUtil.getInt(substring(methodOut.getHsrReqEffDateString(), 2, 4)));
    //  cobolCode::MOVE HSR-REQ-EFF-DATE (5 : 2) TO WS-DSM-DT-MM
    methodOut.setDsmDtMm(CFUtil.getInt(substring(methodOut.getHsrReqEffDateString(), 4, 6)));
    //  cobolCode::MOVE HSR-REQ-EFF-DATE (7 : 2) TO WS-DSM-DT-DD
    methodOut.setDsmDtDd(CFUtil.getInt(substring(methodOut.getHsrReqEffDateString(), 6, 8)));
    methodOut.setBhiReqEffectDate(methodOut.getDsmDt().toCharArray());
    //  cobolCode::INITIALIZE WS-DSM-DT
    methodOut.getDsmDt().initialize();
    //  cobolCode::MOVE HSR-REQ-CANCEL-DATE (1 : 2) TO WS-DSM-DT-CC
    methodOut.setDsmDtCc(CFUtil.getInt(substring(methodOut.getHsrReqCancelDateString(), 0, 2)));
    //  cobolCode::MOVE HSR-REQ-CANCEL-DATE (3 : 2) TO WS-DSM-DT-YY
    methodOut.setDsmDtYy(CFUtil.getInt(substring(methodOut.getHsrReqCancelDateString(), 2, 4)));
    //  cobolCode::MOVE HSR-REQ-CANCEL-DATE (5 : 2) TO WS-DSM-DT-MM
    methodOut.setDsmDtMm(CFUtil.getInt(substring(methodOut.getHsrReqCancelDateString(), 4, 6)));
    //  cobolCode::MOVE HSR-REQ-CANCEL-DATE (7 : 2) TO WS-DSM-DT-DD
    methodOut.setDsmDtDd(CFUtil.getInt(substring(methodOut.getHsrReqCancelDateString(), 6, 8)));
    methodOut.setBhiReqCancelDate(methodOut.getDsmDt().toCharArray());
    //  cobolCode::INITIALIZE BHI-RET-AREA
    methodOut.getBhiRetArea().initialize();
    methodOut.setDsmFuncCd(1);
    //  cobolCode::CALL WS-D5427BHI USING DFHEIBLK DFHCOMMAREA DSM-CALL-AREA BHI-REQ-RET-AREA
    // BHI-DATA-AREA
    programCtx.setRc(
        d5427bhi.call(
            programCtx.getGlobalCtx().getContext("D5427BHI"),
            programCtx.getCicsSession(),
            methodOut.getDfhcommareaGroup(),
            methodOut.getDsmCallArea(),
            methodOut.getBhiReqRetArea(),
            methodOut.getBhiDataArea()));
    //  cobolCode::IF DSM-NO-ERROR
    if (methodIn.isDsmNoError()) {
      //  cobolCode::SET WS-BHI-ROW-FOUND TO TRUE
      methodOut.setBhiRowFoundTrue();

      //  cobolCode::INITIALIZE WS-POS-CNT
      methodOut.setPosCnt(0);
    }
    //  cobolCode::ELSE
    else {
      //  cobolCode::IF DSM-ENTRY-NOT-FND-INQ
      if (methodIn.isDsmEntryNotFndInq()) {
        //  cobolCode::SET WS-BHI-ROW-NOT-FOUND TO TRUE
        methodOut.setBhiRowNotFoundTrue();

      }
      //  cobolCode::ELSE
      else {
        //  cobolCode::SET REQ-FAIL OF F5957REQ-INPUT TO TRUE
        methodOut.setReqFailTrue();

        //  cobolCode::SET REQ-PARM-ADDRESSES-ERROR OF F5957REQ-INPUT TO TRUE
        methodOut.setReqParmAddressesErrorTrue();

        //  cobolCode::SET HSR-REQ-CONTRCT-FAIL-C-FUNC-RC TO TRUE
        methodOut.setHsrReqContrctFailCFuncRcTrue();

        //  cobolCode::INITIALIZE FMA-FIXED-AREA
        methodOut.getFmaFixedArea().initialize();
        //  cobolCode::SET FMA-TYPE-IS-NUMERIC-1 TO TRUE
        methodOut.setFmaTypeIsNumeric1True();

        //  cobolCode::IF NOT DSM-EDIT-ERROR
        if (!(methodIn.isDsmEditError())) {
          //  cobolCode::MOVE DSM-SQLCODE TO FMA-IP-TYPE-NUMERIC-1
          methodOut.setFmaIpTypeNumeric1(methodOut.getDsmSqlcode());
        }
        //  cobolCode::MOVE 'DBHI' TO FMA-IP-TYPE-ALPHA-1
        //  LITERAL_DBHI = 'DBHI'
        methodOut.setFmaIpTypeAlpha1(CONSTANTS.LITERAL_DBHI);
        //  cobolCode::MOVE DSM-ERR-SECTN-NAME TO FMA-IP-TYPE-ALPHA-2
        methodOut.setFmaIpTypeAlpha2(methodOut.getDsmErrSectnName());
        //  cobolCode::MOVE 12 TO FMA-IP-ERR-CODE-1
        methodOut.setFmaIpErrCode1(12);
        //  cobolCode::PERFORM SET-FMA-ERR-TBL-9000
        setFmaErrTbl9000(programCtx.getSetFmaErrTbl9000InCtx()); /*SET-FMA-ERR-TBL-9000 SECTION*/
      }
    }
    //  cobolCode::PERFORM 4001-CHECK-HIPPA-CD-AF
    checkHippaCdAf(programCtx.getCheckHippaCdAfInCtx()); /*4001-CHECK-HIPPA-CD-AF SECTION*/

    return methodOut;
  }
  /**
   * checkHippaCdAf This method is derived from COBOL Paragraph - 4001-CHECK-HIPPA-CD-AF SECTION
   * COBOL Cyclomatic complexity - 12 Input :
   *
   * <p>- ehbBhiSub COBOL Name: EHB-BHI-SUB - bhiRetBhiCnt COBOL Name: BHI-RET-BHI-CNT -
   * bhiRetHipaaCode COBOL Name: BHI-RET-HIPAA-CODE - bhiRetSrvcCode COBOL Name: BHI-RET-SRVC-CODE -
   * hsrReqCreator COBOL Name: HSR-REQ-CREATOR - ehbBhiSub2 COBOL Name: EHB-BHI-SUB2 - bhiRetBhiData
   * COBOL Name: BHI-RET-BHI-DATA
   *
   * <p>Output :
   *
   * <p>- ehbBhiAf91000Ind COBOL Name: EHB-BHI-AF-91000-IND - ehbBhiAf92507Ind COBOL Name:
   * EHB-BHI-AF-92507-IND - ehbBhiSub COBOL Name: EHB-BHI-SUB - ehbBhiSub2 COBOL Name: EHB-BHI-SUB2
   * - bhiRetBhiData COBOL Name: BHI-RET-BHI-DATA - bhiRetBhiCnt COBOL Name: BHI-RET-BHI-CNT
   *
   * @throws CFException
   */
  @Override
  public CheckHippaCdAfOutCtx checkHippaCdAf(CheckHippaCdAfInCtx methodIn) throws Exception {

    // *81***************************************************************
    // *81 4001-Check-hippa-cd-af section                               *
    // *81                                                              *
    // *81 business function:                                           *
    // *81 for hipaa-code 'af' set flags for 91000 and 92507 srvc codes *
    // *81***************************************************************
    // *82 4001-check-hippa-cd-af section                               *
    // *82 1.when hipaa-cd 'af' set flags for 91000 and 92507 srvc codes
    // *82 and save the slot numbers for each
    // *82 called by : 4000-get-hipaa-benefits                          *
    // *82 calls     : none                                             *
    // *82                                                              *
    // *82***************************************************************
    // Added variable to get the program context in place.
    Bbhsr002Ctx programCtx = methodIn.getBbhsr002Ctx();
    // Added variable to get the output context in place.
    CheckHippaCdAfOutCtx methodOut = methodIn.getCheckHippaCdAfOutCtx();
    //  cobolCode::SET EHB-BHI-AF-91000-NO TO TRUE
    methodOut.setEhbBhiAf91000NoTrue();

    //  cobolCode::SET EHB-BHI-AF-92507-NO TO TRUE
    methodOut.setEhbBhiAf92507NoTrue();

    //  cobolCode::PERFORM WITH TEST BEFORE VARYING EHB-BHI-SUB FROM 1 BY +1 UNTIL EHB-BHI-SUB >
    // BHI-RET-BHI-CNT
    for (methodOut.setEhbBhiSub(1);
        ((methodOut.getEhbBhiSub() <= methodOut.getBhiRetBhiCnt()));
        methodOut.setEhbBhiSub(methodOut.getEhbBhiSub() + 1)) {
      //  cobolCode::IF BHI-RET-HIPAA-CODE ( EHB-BHI-SUB ) = 'AF'
      //  LITERAL_AF = 'AF'
      if (compareChars(
              methodIn.getBhiRetHipaaCode(methodOut.getEhbBhiSub() - 1), CONSTANTS.LITERAL_AF)
          == 0) {
        //  cobolCode::IF BHI-RET-SRVC-CODE ( EHB-BHI-SUB ) = '91000 ' OR BHI-RET-SRVC-CODE (
        // EHB-BHI-SUB ) = ' 91000'
        //  LITERAL_B_91000 = ' 91000'
        if (compareChars(
                    methodIn.getBhiRetSrvcCode(methodOut.getEhbBhiSub() - 1),
                    CONSTANTS.LITERAL_91000_B_)
                == 0
            || compareChars(
                    methodIn.getBhiRetSrvcCode(methodOut.getEhbBhiSub() - 1),
                    CONSTANTS.LITERAL_B_91000)
                == 0) {

          // *==============================================================
          // * Remove af-ci (91000) from bhi return if not v5427bn7
          // *--------------------------------------------------------------
          //  cobolCode::IF NOT ( HSR-REQ-CREATOR = 'V5427BN7' )
          //  LITERAL_V5427BN7 = 'V5427BN7'
          if ((compareChars(methodIn.getHsrReqCreator(), CONSTANTS.LITERAL_V5427BN7) != 0)) {
            //  cobolCode::PERFORM WITH TEST BEFORE VARYING EHB-BHI-SUB2 FROM EHB-BHI-SUB BY 1 UNTIL
            // EHB-BHI-SUB2 > BHI-RET-BHI-CNT
            for (methodOut.setEhbBhiSub2(methodOut.getEhbBhiSub());
                ((methodOut.getEhbBhiSub2() <= methodOut.getBhiRetBhiCnt()));
                methodOut.setEhbBhiSub2(methodOut.getEhbBhiSub2() + 1)) {
              //  cobolCode::IF EHB-BHI-SUB2 < BHI-RET-BHI-CNT
              if ((methodOut.getEhbBhiSub2() < methodOut.getBhiRetBhiCnt())) {
                //  cobolCode::MOVE BHI-RET-BHI-DATA ( EHB-BHI-SUB2 + 1) TO BHI-RET-BHI-DATA (
                // EHB-BHI-SUB2 )
                methodOut.setBhiRetBhiData(
                    methodOut.getEhbBhiSub2() - 1,
                    methodOut.getBhiRetBhiData(methodOut.getEhbBhiSub2() + 1 - 1).toCharArray());
                //  cobolCode::MOVE SPACE TO BHI-RET-BHI-DATA ( EHB-BHI-SUB2 + 1)
                methodOut.setBhiRetBhiData(methodOut.getEhbBhiSub2() + 1 - 1, CONSTANTS.SPACE_337);
              }
              //  cobolCode::ELSE
              else {
                //  cobolCode::MOVE SPACE TO BHI-RET-BHI-DATA ( EHB-BHI-SUB2 )
                methodOut.setBhiRetBhiData(methodOut.getEhbBhiSub2() - 1, CONSTANTS.SPACE_337);
              }
            }
            //  cobolCode::SUBTRACT +1 FROM BHI-RET-BHI-CNT
            methodOut.setBhiRetBhiCnt(Math.abs(methodOut.getBhiRetBhiCnt() - 1));
          }
          //  cobolCode::ELSE
          else {
            //  cobolCode::SET EHB-BHI-AF-91000-YES TO TRUE
            methodOut.setEhbBhiAf91000YesTrue();
          }
        }

        // *==============================================================
        //  cobolCode::IF BHI-RET-SRVC-CODE ( EHB-BHI-SUB ) = '92507 ' OR BHI-RET-SRVC-CODE (
        // EHB-BHI-SUB ) = ' 92507'
        //  LITERAL_B_92507 = ' 92507'
        if (compareChars(
                    methodIn.getBhiRetSrvcCode(methodOut.getEhbBhiSub() - 1),
                    CONSTANTS.LITERAL_92507_B_)
                == 0
            || compareChars(
                    methodIn.getBhiRetSrvcCode(methodOut.getEhbBhiSub() - 1),
                    CONSTANTS.LITERAL_B_92507)
                == 0) {
          //  cobolCode::SET EHB-BHI-AF-92507-YES TO TRUE
          methodOut.setEhbBhiAf92507YesTrue();
        }
      }
    }

    return methodOut;
  }
  /**
   * moveBhiFields This method is derived from COBOL Paragraph - 4100-MOVE-BHI-FIELDS SECTION COBOL
   * Cyclomatic complexity - 30 Input :
   *
   * <p>- ehbBhiAf91000Ind COBOL Name: EHB-BHI-AF-91000-IND - ehbBhiAf92507Ind COBOL Name:
   * EHB-BHI-AF-92507-IND - bhiRetNetInd COBOL Name: BHI-RET-NET-IND - bhiSub01 COBOL Name:
   * WS-BHI-SUB - dFlag COBOL Name: WS-D-FLAG - posCnt COBOL Name: WS-POS-CNT - bhiRetBhiCnt COBOL
   * Name: BHI-RET-BHI-CNT - iFlag COBOL Name: WS-I-FLAG - oFlag COBOL Name: WS-O-FLAG - bFlag COBOL
   * Name: WS-B-FLAG - bhiSub COBOL Name: BHI-SUB - bhiCnt COBOL Name: WS-BHI-CNT - sub2 COBOL Name:
   * WS-SUB2 - bhiRetHipaaCode COBOL Name: BHI-RET-HIPAA-CODE - bhiRetSrvcCode COBOL Name:
   * BHI-RET-SRVC-CODE - hsrRetHipaaCdMod COBOL Name: HSR-RET-HIPAA-CD-MOD - hpaSub COBOL Name:
   * WS-HPA-SUB - bhiRetHipaaCommtTxt COBOL Name: BHI-RET-HIPAA-COMMT-TXT - bhiRetSlotTblId COBOL
   * Name: BHI-RET-SLOT-TBL-ID - bhiRetPlOfSrvcCd COBOL Name: BHI-RET-PL-OF-SRVC-CD - bhiRetCausCd
   * COBOL Name: BHI-RET-CAUS-CD - bhiRetBenLvlCd COBOL Name: BHI-RET-BEN-LVL-CD -
   * bhiRetInNtwkClssCd COBOL Name: BHI-RET-IN-NTWK-CLSS-CD - bhiRetTier1NtwkClssCd COBOL Name:
   * BHI-RET-TIER1-NTWK-CLSS-CD - bhiRetProcRangeFrom COBOL Name: BHI-RET-PROC-RANGE-FROM -
   * bhiRetProcRangeTo COBOL Name: BHI-RET-PROC-RANGE-TO - bhiRetRowProcType COBOL Name:
   * BHI-RET-ROW-PROC-TYPE - bhiRetProvOrgTypCd COBOL Name: BHI-RET-PROV-ORG-TYP-CD
   *
   * <p>Output :
   *
   * <p>- ehbBhiAfBothInd COBOL Name: EHB-BHI-AF-BOTH-IND - ehbBhiAf91000Ind COBOL Name:
   * EHB-BHI-AF-91000-IND - ehbBhiAf92507Ind COBOL Name: EHB-BHI-AF-92507-IND - posCnt COBOL Name:
   * WS-POS-CNT - dFlag COBOL Name: WS-D-FLAG - hsrRetT1CovIndicator COBOL Name:
   * HSR-RET-T1-COV-INDICATOR - iFlag COBOL Name: WS-I-FLAG - hsrRetInnCovIndicator COBOL Name:
   * HSR-RET-INN-COV-INDICATOR - oFlag COBOL Name: WS-O-FLAG - hsrRetOonCovIndicator COBOL Name:
   * HSR-RET-OON-COV-INDICATOR - bFlag COBOL Name: WS-B-FLAG - bhiSub COBOL Name: BHI-SUB - bhiCnt
   * COBOL Name: WS-BHI-CNT - sub2 COBOL Name: WS-SUB2 - hsrRetHipaaCd COBOL Name: HSR-RET-HIPAA-CD
   * - bhiRetHipaaCode COBOL Name: BHI-RET-HIPAA-CODE - hsrRetHipaaCdMod COBOL Name:
   * HSR-RET-HIPAA-CD-MOD - hsrRetHipaaCommtTxt COBOL Name: HSR-RET-HIPAA-COMMT-TXT -
   * bhiRetHipaaCommtTxt COBOL Name: BHI-RET-HIPAA-COMMT-TXT - hsrRetSlotTblId COBOL Name:
   * HSR-RET-SLOT-TBL-ID - bhiRetSlotTblId COBOL Name: BHI-RET-SLOT-TBL-ID - hsrRetSrvcCd COBOL
   * Name: HSR-RET-SRVC-CD - srvcCd COBOL Name: WS-SRVC-CD - bhiRetSrvcCode COBOL Name:
   * BHI-RET-SRVC-CODE - hsrRetPlOfSrvcCd COBOL Name: HSR-RET-PL-OF-SRVC-CD - bhiRetPlOfSrvcCd COBOL
   * Name: BHI-RET-PL-OF-SRVC-CD - hsrRetCausCd COBOL Name: HSR-RET-CAUS-CD - bhiRetCausCd COBOL
   * Name: BHI-RET-CAUS-CD - hsrRetBenLvlCd COBOL Name: HSR-RET-BEN-LVL-CD - bhiRetBenLvlCd COBOL
   * Name: BHI-RET-BEN-LVL-CD - hsrRetNetInd COBOL Name: HSR-RET-NET-IND - bhiRetNetInd COBOL Name:
   * BHI-RET-NET-IND - hsrRetInNtwkClssCd COBOL Name: HSR-RET-IN-NTWK-CLSS-CD - bhiRetInNtwkClssCd
   * COBOL Name: BHI-RET-IN-NTWK-CLSS-CD - hsrRetT1NtwkClssCd COBOL Name: HSR-RET-T1-NTWK-CLSS-CD -
   * bhiRetTier1NtwkClssCd COBOL Name: BHI-RET-TIER1-NTWK-CLSS-CD - hsrRetProcRangeFrom COBOL Name:
   * HSR-RET-PROC-RANGE-FROM - bhiRetProcRangeFrom COBOL Name: BHI-RET-PROC-RANGE-FROM -
   * hsrRetProcRangeTo COBOL Name: HSR-RET-PROC-RANGE-TO - bhiRetProcRangeTo COBOL Name:
   * BHI-RET-PROC-RANGE-TO - hsrRetProcCdType COBOL Name: HSR-RET-PROC-CD-TYPE - bhiRetRowProcType
   * COBOL Name: BHI-RET-ROW-PROC-TYPE - hsrRetProvOrgTypCd COBOL Name: HSR-RET-PROV-ORG-TYP-CD -
   * bhiRetProvOrgTypCd COBOL Name: BHI-RET-PROV-ORG-TYP-CD
   *
   * @throws CFException
   */
  @Override
  public MoveBhiFieldsOutCtx moveBhiFields(MoveBhiFieldsInCtx methodIn) throws Exception {

    // *81***************************************************************
    // *81 4100-Move-bhi-fields                                         *
    // *81                                                              *
    // *81 business function: move the bhi dta to return fields         *
    // *81                                                              *
    // *81***************************************************************
    // *82 4100-move-bhi-fields                                         *
    // *82 1.business function: move the bhi dta to return fields       *
    // *82                                                              *
    // *82 called by :3400-process-new-svc-method                       *
    // *82            3500-process-comb-svc-method                      *
    // *82            3600-process-old-svc-method                       *
    // *82 calls     :n/a                                               *
    // *82***************************************************************

    // *==============================================================
    // * For 'af' with borh 91000 and 92507
    // *  - allow another pass for the second entry
    // * ------------------------------------------
    // Added variable to get the program context in place.
    Bbhsr002Ctx programCtx = methodIn.getBbhsr002Ctx();
    // Added variable to get the output context in place.
    MoveBhiFieldsOutCtx methodOut = methodIn.getMoveBhiFieldsOutCtx();
    //  cobolCode::IF EHB-BHI-AF-91000-YES AND EHB-BHI-AF-92507-YES
    if (methodIn.isEhbBhiAf91000Yes() && methodIn.isEhbBhiAf92507Yes()) {
      //  cobolCode::SET EHB-BHI-AF-BOTH-YES TO TRUE
      methodOut.setEhbBhiAfBothYesTrue();

      //  cobolCode::SET EHB-BHI-AF-91000-NO TO TRUE
      methodOut.setEhbBhiAf91000NoTrue();

      //  cobolCode::SET EHB-BHI-AF-92507-NO TO TRUE
      methodOut.setEhbBhiAf92507NoTrue();

      ;
    }
    //  cobolCode::ELSE
    else {
      //  cobolCode::EVALUATE TRUE
      if ((methodOut.getBhiRetNetInd(methodIn.getBhiSub01() - 1)[0] == 'D' && methodIn.isDFlagNo())
          || (methodOut.getBhiRetNetInd(methodIn.getBhiSub01() - 1)[0] == 'D'
              && methodOut.isDFlagYes()
              && (methodOut.getPosCnt() < methodIn.getBhiRetBhiCnt()))) {
        //  cobolCode::ADD +1 TO WS-POS-CNT
        methodOut.setPosCnt(methodOut.getPosCnt() + 1);
        //  cobolCode::SET WS-D-FLAG-YES TO TRUE
        methodOut.setDFlagYesTrue();

        //  cobolCode::MOVE SPACES TO HSR-RET-T1-COV-INDICATOR ( WS-HPA-SUB )
        methodOut.setHsrRetT1CovIndicator(methodIn.getHpaSub() - 1, CONSTANTS.SPACE);
        ;
      } else if ((methodOut.getBhiRetNetInd(methodIn.getBhiSub01() - 1)[0] == 'I'
              && methodIn.isIFlagNo())
          || (methodOut.getBhiRetNetInd(methodIn.getBhiSub01() - 1)[0] == 'I'
              && methodOut.isIFlagYes()
              && (methodOut.getPosCnt() < methodIn.getBhiRetBhiCnt()))) {
        //  cobolCode::ADD +1 TO WS-POS-CNT
        methodOut.setPosCnt(methodOut.getPosCnt() + 1);
        //  cobolCode::SET WS-I-FLAG-YES TO TRUE
        methodOut.setIFlagYesTrue();

        //  cobolCode::MOVE SPACES TO HSR-RET-T1-COV-INDICATOR ( WS-HPA-SUB )
        methodOut.setHsrRetT1CovIndicator(methodIn.getHpaSub() - 1, CONSTANTS.SPACE);
        //  cobolCode::MOVE SPACES TO HSR-RET-INN-COV-INDICATOR ( WS-HPA-SUB )
        methodOut.setHsrRetInnCovIndicator(methodIn.getHpaSub() - 1, CONSTANTS.SPACE);
        ;
      } else if ((methodOut.getBhiRetNetInd(methodIn.getBhiSub01() - 1)[0] == 'O'
              && methodIn.isOFlagNo())
          || (methodOut.getBhiRetNetInd(methodIn.getBhiSub01() - 1)[0] == 'O'
              && methodOut.isOFlagYes()
              && (methodOut.getPosCnt() < methodIn.getBhiRetBhiCnt()))) {
        //  cobolCode::ADD +1 TO WS-POS-CNT
        methodOut.setPosCnt(methodOut.getPosCnt() + 1);
        //  cobolCode::SET WS-O-FLAG-YES TO TRUE
        methodOut.setOFlagYesTrue();

        //  cobolCode::MOVE SPACES TO HSR-RET-OON-COV-INDICATOR ( WS-HPA-SUB )
        methodOut.setHsrRetOonCovIndicator(methodIn.getHpaSub() - 1, CONSTANTS.SPACE);
        ;
      } else if ((methodOut.getBhiRetNetInd(methodIn.getBhiSub01() - 1)[0] == 'B'
              && methodIn.isBFlagNo())
          || (methodOut.getBhiRetNetInd(methodIn.getBhiSub01() - 1)[0] == 'B'
              && methodOut.isBFlagYes()
              && (methodOut.getPosCnt() < methodIn.getBhiRetBhiCnt()))) {
        //  cobolCode::ADD +1 TO WS-POS-CNT
        methodOut.setPosCnt(methodOut.getPosCnt() + 1);
        //  cobolCode::SET WS-B-FLAG-YES TO TRUE
        methodOut.setBFlagYesTrue();

        //  cobolCode::SET WS-I-FLAG-YES TO TRUE
        methodOut.setIFlagYesTrue();

        //  cobolCode::SET WS-O-FLAG-YES TO TRUE
        methodOut.setOFlagYesTrue();

        ;
      } else {
        //  cobolCode::SUBTRACT 1 FROM BHI-SUB
        methodOut.setBhiSub(methodOut.getBhiSub() - 1);
        //  cobolCode::SUBTRACT 1 FROM WS-BHI-CNT
        methodOut.setBhiCnt(Math.abs(methodOut.getBhiCnt() - 1));
        //  cobolCode::SUBTRACT 1 FROM WS-SUB2
        methodOut.setSub2(methodOut.getSub2() - 1);
        // cobolCode::GO TO 4100-EXIT
        return methodOut;
        // cobolCodeEnds::GO TO 4100-EXIT
      }
    }

    // *==============================================================
    //  cobolCode::MOVE BHI-RET-HIPAA-CODE ( WS-BHI-SUB ) TO HSR-RET-HIPAA-CD ( WS-HPA-SUB )
    methodOut.setHsrRetHipaaCd(
        methodIn.getHpaSub() - 1, methodOut.getBhiRetHipaaCode(methodIn.getBhiSub01() - 1));

    // *===========================================================
    // * Set hipaa-cd-mod for 'af' service codes 91000 & 92507
    // * -----------------------------------------------------
    //  cobolCode::IF BHI-RET-HIPAA-CODE ( WS-BHI-SUB ) = 'AF' AND BHI-RET-SRVC-CODE ( WS-BHI-SUB )
    // = '91000' AND HSR-RET-HIPAA-CD-MOD ( WS-HPA-SUB ) = SPACE
    if (compareChars(methodOut.getBhiRetHipaaCode(methodIn.getBhiSub01() - 1), CONSTANTS.LITERAL_AF)
            == 0
        && compareChars(
                methodOut.getBhiRetSrvcCode(methodIn.getBhiSub01() - 1), CONSTANTS.LITERAL_91000_B_)
            == 0
        && (allSpaces(methodOut.getHsrRetHipaaCdMod(methodIn.getHpaSub() - 1)))) {
      //  cobolCode::MOVE 'CI' TO HSR-RET-HIPAA-CD-MOD ( WS-HPA-SUB )
      //  LITERAL_CI = 'CI'
      methodOut.setHsrRetHipaaCdMod(methodIn.getHpaSub() - 1, CONSTANTS.LITERAL_CI);
    }
    //  cobolCode::IF BHI-RET-HIPAA-CODE ( WS-BHI-SUB ) = 'AF' AND BHI-RET-SRVC-CODE ( WS-BHI-SUB )
    // = '92507' AND HSR-RET-HIPAA-CD-MOD ( WS-HPA-SUB ) = SPACE
    if (compareChars(methodOut.getBhiRetHipaaCode(methodIn.getBhiSub01() - 1), CONSTANTS.LITERAL_AF)
            == 0
        && compareChars(
                methodOut.getBhiRetSrvcCode(methodIn.getBhiSub01() - 1), CONSTANTS.LITERAL_92507_B_)
            == 0
        && (allSpaces(methodOut.getHsrRetHipaaCdMod(methodIn.getHpaSub() - 1)))) {
      //  cobolCode::MOVE 'ST' TO HSR-RET-HIPAA-CD-MOD ( WS-HPA-SUB )
      //  LITERAL_ST = 'ST'
      methodOut.setHsrRetHipaaCdMod(methodIn.getHpaSub() - 1, CONSTANTS.LITERAL_ST);
    }

    // *===========================================================
    //  cobolCode::MOVE BHI-RET-HIPAA-COMMT-TXT ( WS-BHI-SUB ) TO HSR-RET-HIPAA-COMMT-TXT (
    // WS-HPA-SUB , BHI-SUB )
    methodOut.setHsrRetHipaaCommtTxt(
        methodIn.getHpaSub() - 1,
        methodOut.getBhiSub() - 1,
        methodOut.getBhiRetHipaaCommtTxt(methodIn.getBhiSub01() - 1));
    //  cobolCode::MOVE BHI-RET-SLOT-TBL-ID ( WS-BHI-SUB ) TO HSR-RET-SLOT-TBL-ID ( WS-HPA-SUB ,
    // BHI-SUB )
    methodOut.setHsrRetSlotTblId(
        methodIn.getHpaSub() - 1,
        methodOut.getBhiSub() - 1,
        methodOut.getBhiRetSlotTblId(methodIn.getBhiSub01() - 1));
    //  cobolCode::MOVE BHI-RET-SRVC-CODE ( WS-BHI-SUB ) TO HSR-RET-SRVC-CD ( WS-HPA-SUB , BHI-SUB )
    // WS-SRVC-CD
    methodOut.setHsrRetSrvcCd(
        methodIn.getHpaSub() - 1,
        methodOut.getBhiSub() - 1,
        methodOut.getBhiRetSrvcCode(methodIn.getBhiSub01() - 1));
    methodOut.setSrvcCd(methodOut.getBhiRetSrvcCode(methodIn.getBhiSub01() - 1));
    //  cobolCode::MOVE BHI-RET-PL-OF-SRVC-CD ( WS-BHI-SUB ) TO HSR-RET-PL-OF-SRVC-CD ( WS-HPA-SUB ,
    // BHI-SUB )
    methodOut.setHsrRetPlOfSrvcCd(
        methodIn.getHpaSub() - 1,
        methodOut.getBhiSub() - 1,
        methodOut.getBhiRetPlOfSrvcCd(methodIn.getBhiSub01() - 1));
    //  cobolCode::MOVE BHI-RET-CAUS-CD ( WS-BHI-SUB ) TO HSR-RET-CAUS-CD ( WS-HPA-SUB , BHI-SUB )
    methodOut.setHsrRetCausCd(
        methodIn.getHpaSub() - 1,
        methodOut.getBhiSub() - 1,
        methodOut.getBhiRetCausCd(methodIn.getBhiSub01() - 1));
    //  cobolCode::MOVE BHI-RET-BEN-LVL-CD ( WS-BHI-SUB ) TO HSR-RET-BEN-LVL-CD ( WS-HPA-SUB ,
    // BHI-SUB )
    methodOut.setHsrRetBenLvlCd(
        methodIn.getHpaSub() - 1,
        methodOut.getBhiSub() - 1,
        methodOut.getBhiRetBenLvlCd(methodIn.getBhiSub01() - 1));
    //  cobolCode::MOVE BHI-RET-NET-IND ( WS-BHI-SUB ) TO HSR-RET-NET-IND ( WS-HPA-SUB , BHI-SUB )
    methodOut.setHsrRetNetInd(
        methodIn.getHpaSub() - 1,
        methodOut.getBhiSub() - 1,
        methodOut.getBhiRetNetInd(methodIn.getBhiSub01() - 1));
    //  cobolCode::MOVE BHI-RET-IN-NTWK-CLSS-CD ( WS-BHI-SUB ) TO HSR-RET-IN-NTWK-CLSS-CD (
    // WS-HPA-SUB , BHI-SUB )
    methodOut.setHsrRetInNtwkClssCd(
        methodIn.getHpaSub() - 1,
        methodOut.getBhiSub() - 1,
        methodOut.getBhiRetInNtwkClssCd(methodIn.getBhiSub01() - 1));
    //  cobolCode::MOVE BHI-RET-TIER1-NTWK-CLSS-CD ( WS-BHI-SUB ) TO HSR-RET-T1-NTWK-CLSS-CD (
    // WS-HPA-SUB , BHI-SUB )
    methodOut.setHsrRetT1NtwkClssCd(
        methodIn.getHpaSub() - 1,
        methodOut.getBhiSub() - 1,
        methodOut.getBhiRetTier1NtwkClssCd(methodIn.getBhiSub01() - 1));
    //  cobolCode::MOVE BHI-RET-PROC-RANGE-FROM ( WS-BHI-SUB ) TO HSR-RET-PROC-RANGE-FROM (
    // WS-HPA-SUB , BHI-SUB )
    methodOut.setHsrRetProcRangeFrom(
        methodIn.getHpaSub() - 1,
        methodOut.getBhiSub() - 1,
        methodOut.getBhiRetProcRangeFrom(methodIn.getBhiSub01() - 1));
    //  cobolCode::MOVE BHI-RET-PROC-RANGE-TO ( WS-BHI-SUB ) TO HSR-RET-PROC-RANGE-TO ( WS-HPA-SUB ,
    // BHI-SUB )
    methodOut.setHsrRetProcRangeTo(
        methodIn.getHpaSub() - 1,
        methodOut.getBhiSub() - 1,
        methodOut.getBhiRetProcRangeTo(methodIn.getBhiSub01() - 1));
    //  cobolCode::MOVE BHI-RET-ROW-PROC-TYPE ( WS-BHI-SUB ) TO HSR-RET-PROC-CD-TYPE ( WS-HPA-SUB ,
    // BHI-SUB )
    methodOut.setHsrRetProcCdType(
        methodIn.getHpaSub() - 1,
        methodOut.getBhiSub() - 1,
        methodOut.getBhiRetRowProcType(methodIn.getBhiSub01() - 1));
    //  cobolCode::MOVE BHI-RET-PROV-ORG-TYP-CD ( WS-BHI-SUB ) TO HSR-RET-PROV-ORG-TYP-CD (
    // WS-HPA-SUB , BHI-SUB )
    methodOut.setHsrRetProvOrgTypCd(
        methodIn.getHpaSub() - 1,
        methodOut.getBhiSub() - 1,
        methodOut.getBhiRetProvOrgTypCd(methodIn.getBhiSub01() - 1));

    return methodOut;
  }
  /**
   * getSvcCdNbr This method is derived from COBOL Paragraph - 5000-GET-SVC-CD-NBR SECTION COBOL
   * Cyclomatic complexity - 4 Input :
   *
   * <p>- srvcCd COBOL Name: WS-SRVC-CD - hsrReqEffDate COBOL Name: HSR-REQ-EFF-DATE -
   * hsrReqCancelDate COBOL Name: HSR-REQ-CANCEL-DATE - panValet COBOL Name: PAN-VALET -
   * dsmReturnCode COBOL Name: DSM-RETURN-CODE - scnRetSrvcCdNbr COBOL Name: SCN-RET-SRVC-CD-NBR -
   * dsmSqlcode COBOL Name: DSM-SQLCODE - dsmErrSectnName COBOL Name: DSM-ERR-SECTN-NAME
   *
   * <p>Output :
   *
   * <p>- scnReqSrvcCd COBOL Name: SCN-REQ-SRVC-CD - srvcCd COBOL Name: WS-SRVC-CD - dsmDt COBOL
   * Name: WS-DSM-DT - dsmDtCc COBOL Name: WS-DSM-DT-CC - hsrReqEffDate COBOL Name: HSR-REQ-EFF-DATE
   * - dsmDtYy COBOL Name: WS-DSM-DT-YY - dsmDtMm COBOL Name: WS-DSM-DT-MM - dsmDtDd COBOL Name:
   * WS-DSM-DT-DD - scnReqEffDt COBOL Name: SCN-REQ-EFF-DT - hsrReqCancelDate COBOL Name:
   * HSR-REQ-CANCEL-DATE - scnReqCancDt COBOL Name: SCN-REQ-CANC-DT - scnReqClngProg COBOL Name:
   * SCN-REQ-CLNG-PROG - panValet COBOL Name: PAN-VALET - dsmFuncCd COBOL Name: DSM-FUNC-CD - rc
   * COBOL Name: RETURN-CODE - hsrRetSrvcCdNbr COBOL Name: HSR-RET-SRVC-CD-NBR - scnRetSrvcCdNbr
   * COBOL Name: SCN-RET-SRVC-CD-NBR - reqReturnCode COBOL Name: REQ-RETURN-CODE -
   * reqExplanationCode COBOL Name: REQ-EXPLANATION-CODE - hsrReqContractRtnCd COBOL Name:
   * HSR-REQ-CONTRACT-RTN-CD - fmaFixedArea COBOL Name: FMA-FIXED-AREA - fmaIpType1 COBOL Name:
   * FMA-IP-TYPE-1 - fmaIpTypeNumeric1 COBOL Name: FMA-IP-TYPE-NUMERIC-1 - dsmSqlcode COBOL Name:
   * DSM-SQLCODE - fmaIpTypeAlpha1 COBOL Name: FMA-IP-TYPE-ALPHA-1 - fmaIpTypeAlpha2 COBOL Name:
   * FMA-IP-TYPE-ALPHA-2 - dsmErrSectnName COBOL Name: DSM-ERR-SECTN-NAME - fmaIpErrCode1 COBOL
   * Name: FMA-IP-ERR-CODE-1
   *
   * @throws CFException
   */
  @Override
  public GetSvcCdNbrOutCtx getSvcCdNbr(GetSvcCdNbrInCtx methodIn) throws Exception {

    // *81***************************************************************
    // *81 5000-Get-svc-cd-nbr                                          *
    // *81                                                              *
    // *81 business function: calls the dsm to retrieve service code    *
    // *81 number                                                       *
    // *81                                                              *
    // *81***************************************************************
    // *82 5000-get-svc-cd-nbr                                          *
    // *82 1.business function: calls the dsm to retrieve service code  *
    // *82                      number                                  *
    // *82 called by :3400-process-new-svc-method                       *
    // *82            3500-process-comb-svc-method                      *
    // *82            3600-process-old-svc-method                       *
    // *82 calls     :set-fma-err-tbl-9000                              *
    // *82***************************************************************
    // Added variable to get the program context in place.
    Bbhsr002Ctx programCtx = methodIn.getBbhsr002Ctx();
    // Added variable to get the output context in place.
    GetSvcCdNbrOutCtx methodOut = methodIn.getGetSvcCdNbrOutCtx();
    //  cobolCode::MOVE WS-SRVC-CD TO SCN-REQ-SRVC-CD
    methodOut.setScnReqSrvcCd(methodOut.getSrvcCd());
    //  cobolCode::INITIALIZE WS-DSM-DT
    methodOut.getDsmDt().initialize();
    //  cobolCode::MOVE HSR-REQ-EFF-DATE (1 : 2) TO WS-DSM-DT-CC
    methodOut.setDsmDtCc(CFUtil.getInt(substring(methodOut.getHsrReqEffDateString(), 0, 2)));
    //  cobolCode::MOVE HSR-REQ-EFF-DATE (3 : 2) TO WS-DSM-DT-YY
    methodOut.setDsmDtYy(CFUtil.getInt(substring(methodOut.getHsrReqEffDateString(), 2, 4)));
    //  cobolCode::MOVE HSR-REQ-EFF-DATE (5 : 2) TO WS-DSM-DT-MM
    methodOut.setDsmDtMm(CFUtil.getInt(substring(methodOut.getHsrReqEffDateString(), 4, 6)));
    //  cobolCode::MOVE HSR-REQ-EFF-DATE (7 : 2) TO WS-DSM-DT-DD
    methodOut.setDsmDtDd(CFUtil.getInt(substring(methodOut.getHsrReqEffDateString(), 6, 8)));
    methodOut.setScnReqEffDt(methodOut.getDsmDt().toCharArray());
    //  cobolCode::INITIALIZE WS-DSM-DT
    methodOut.getDsmDt().initialize();
    //  cobolCode::MOVE HSR-REQ-CANCEL-DATE (1 : 2) TO WS-DSM-DT-CC
    methodOut.setDsmDtCc(CFUtil.getInt(substring(methodOut.getHsrReqCancelDateString(), 0, 2)));
    //  cobolCode::MOVE HSR-REQ-CANCEL-DATE (3 : 2) TO WS-DSM-DT-YY
    methodOut.setDsmDtYy(CFUtil.getInt(substring(methodOut.getHsrReqCancelDateString(), 2, 4)));
    //  cobolCode::MOVE HSR-REQ-CANCEL-DATE (5 : 2) TO WS-DSM-DT-MM
    methodOut.setDsmDtMm(CFUtil.getInt(substring(methodOut.getHsrReqCancelDateString(), 4, 6)));
    //  cobolCode::MOVE HSR-REQ-CANCEL-DATE (7 : 2) TO WS-DSM-DT-DD
    methodOut.setDsmDtDd(CFUtil.getInt(substring(methodOut.getHsrReqCancelDateString(), 6, 8)));
    methodOut.setScnReqCancDt(methodOut.getDsmDt().toCharArray());
    //  cobolCode::MOVE PAN-VALET TO SCN-REQ-CLNG-PROG
    methodOut.setScnReqClngProg(methodOut.getPanValet());
    methodOut.setDsmFuncCd(1);
    //  cobolCode::CALL WS-D5427SCN USING DFHEIBLK DFHCOMMAREA DSM-CALL-AREA SCN-REQST-RET-AREA
    programCtx.setRc(
        d5427scn.call(
            programCtx.getGlobalCtx().getContext("D5427SCN"),
            programCtx.getCicsSession(),
            methodOut.getDfhcommareaGroup(),
            methodOut.getDsmCallArea(),
            methodOut.getScnReqstRetArea()));
    //  cobolCode::IF DSM-NO-ERROR OR DSM-ENTRY-NOT-FND-INQ
    if (methodIn.isDsmNoError() || methodIn.isDsmEntryNotFndInq()) {
      //  cobolCode::MOVE SCN-RET-SRVC-CD-NBR TO HSR-RET-SRVC-CD-NBR ( WS-HPA-SUB , BHI-SUB )
      methodOut.setHsrRetSrvcCdNbr(
          methodIn.getHpaSub() - 1, methodIn.getBhiSub() - 1, methodOut.getScnRetSrvcCdNbr());
    }
    //  cobolCode::ELSE
    else {
      //  cobolCode::SET REQ-FAIL OF F5957REQ-INPUT TO TRUE
      methodOut.setReqFailTrue();

      //  cobolCode::SET REQ-PARM-ADDRESSES-ERROR OF F5957REQ-INPUT TO TRUE
      methodOut.setReqParmAddressesErrorTrue();

      //  cobolCode::SET HSR-REQ-CONTRCT-FAIL-C-FUNC-RC TO TRUE
      methodOut.setHsrReqContrctFailCFuncRcTrue();

      //  cobolCode::INITIALIZE FMA-FIXED-AREA
      methodOut.getFmaFixedArea().initialize();
      //  cobolCode::SET FMA-TYPE-IS-NUMERIC-1 TO TRUE
      methodOut.setFmaTypeIsNumeric1True();

      //  cobolCode::IF NOT DSM-EDIT-ERROR
      if (!(methodIn.isDsmEditError())) {
        //  cobolCode::MOVE DSM-SQLCODE TO FMA-IP-TYPE-NUMERIC-1
        methodOut.setFmaIpTypeNumeric1(methodOut.getDsmSqlcode());
      }
      //  cobolCode::MOVE 'DSCN' TO FMA-IP-TYPE-ALPHA-1
      //  LITERAL_DSCN = 'DSCN'
      methodOut.setFmaIpTypeAlpha1(CONSTANTS.LITERAL_DSCN);
      //  cobolCode::MOVE DSM-ERR-SECTN-NAME TO FMA-IP-TYPE-ALPHA-2
      methodOut.setFmaIpTypeAlpha2(methodOut.getDsmErrSectnName());
      //  cobolCode::MOVE 13 TO FMA-IP-ERR-CODE-1
      methodOut.setFmaIpErrCode1(13);
      //  cobolCode::PERFORM SET-FMA-ERR-TBL-9000
      setFmaErrTbl9000(programCtx.getSetFmaErrTbl9000InCtx()); /*SET-FMA-ERR-TBL-9000 SECTION*/
    }

    return methodOut;
  }
  /**
   * tliProcess This method is derived from COBOL Paragraph - 6000-TLI-PROCESS SECTION COBOL
   * Cyclomatic complexity - 4 Input :
   *
   * <p>- polStdPolNbr COBOL Name: POL-STD-POL-NBR - polStdPlnNbr COBOL Name: POL-STD-PLN-NBR -
   * polRetObligId COBOL Name: POL-RET-OBLIG-ID - polRetShrArngCd COBOL Name: POL-RET-SHR-ARNG-CD -
   * hsrReqEffDate COBOL Name: HSR-REQ-EFF-DATE - panValet COBOL Name: PAN-VALET - dsmReturnCode
   * COBOL Name: DSM-RETURN-CODE - dsmSqlcode COBOL Name: DSM-SQLCODE - dsmErrSectnName COBOL Name:
   * DSM-ERR-SECTN-NAME
   *
   * <p>Output :
   *
   * <p>- tliReqPolNbr COBOL Name: TLI-REQ-POL-NBR - polStdPolNbr COBOL Name: POL-STD-POL-NBR -
   * tliReqPlnNbr COBOL Name: TLI-REQ-PLN-NBR - polStdPlnNbr COBOL Name: POL-STD-PLN-NBR -
   * tliReqObligId COBOL Name: TLI-REQ-OBLIG-ID - polRetObligId COBOL Name: POL-RET-OBLIG-ID -
   * tliReqShrArngCd COBOL Name: TLI-REQ-SHR-ARNG-CD - polRetShrArngCd COBOL Name:
   * POL-RET-SHR-ARNG-CD - dsmDt COBOL Name: WS-DSM-DT - dsmDtCc COBOL Name: WS-DSM-DT-CC -
   * hsrReqEffDate COBOL Name: HSR-REQ-EFF-DATE - dsmDtYy COBOL Name: WS-DSM-DT-YY - dsmDtMm COBOL
   * Name: WS-DSM-DT-MM - dsmDtDd COBOL Name: WS-DSM-DT-DD - tliReqStartDt COBOL Name:
   * TLI-REQ-START-DT - tliReqClngProg COBOL Name: TLI-REQ-CLNG-PROG - panValet COBOL Name:
   * PAN-VALET - dsmFuncCd COBOL Name: DSM-FUNC-CD - rc COBOL Name: RETURN-CODE - tliTableSw COBOL
   * Name: WS-TLI-TABLE-SW - reqReturnCode COBOL Name: REQ-RETURN-CODE - reqExplanationCode COBOL
   * Name: REQ-EXPLANATION-CODE - hsrReqContractRtnCd COBOL Name: HSR-REQ-CONTRACT-RTN-CD -
   * fmaFixedArea COBOL Name: FMA-FIXED-AREA - fmaIpType1 COBOL Name: FMA-IP-TYPE-1 -
   * fmaIpTypeNumeric1 COBOL Name: FMA-IP-TYPE-NUMERIC-1 - dsmSqlcode COBOL Name: DSM-SQLCODE -
   * fmaIpTypeAlpha1 COBOL Name: FMA-IP-TYPE-ALPHA-1 - fmaIpTypeAlpha2 COBOL Name:
   * FMA-IP-TYPE-ALPHA-2 - dsmErrSectnName COBOL Name: DSM-ERR-SECTN-NAME - fmaIpErrCode1 COBOL
   * Name: FMA-IP-ERR-CODE-1
   *
   * @throws CFException
   */
  @Override
  public TliProcessOutCtx tliProcess(TliProcessInCtx methodIn) throws Exception {

    // *81***************************************************************
    // *81 6000-Tli-process                                             *
    // *81                                                              *
    // *81 business function: calls the dsm to retrieve tli slot id     *
    // *81                                                              *
    // *81***************************************************************
    // *82 6000-tli-process                                             *
    // *82 1.business function: calls the dsm to retrieve tli slot id   *
    // *82                                                              *
    // *82 called by :3400-process-new-svc-method                       *
    // *82            3500-process-comb-svc-method                      *
    // *82            3600-process-old-svc-method                       *
    // *82 calls     :set-fma-err-tbl-9000                              *
    // *82***************************************************************
    // Added variable to get the program context in place.
    Bbhsr002Ctx programCtx = methodIn.getBbhsr002Ctx();
    // Added variable to get the output context in place.
    TliProcessOutCtx methodOut = methodIn.getTliProcessOutCtx();
    //  cobolCode::MOVE POL-STD-POL-NBR TO TLI-REQ-POL-NBR
    methodOut.setTliReqPolNbr(methodOut.getPolStdPolNbr());
    //  cobolCode::MOVE POL-STD-PLN-NBR TO TLI-REQ-PLN-NBR
    methodOut.setTliReqPlnNbr(String.valueOf(methodOut.getPolStdPlnNbrString()).toCharArray());
    //  cobolCode::MOVE POL-RET-OBLIG-ID TO TLI-REQ-OBLIG-ID
    methodOut.setTliReqObligId(methodOut.getPolRetObligId());
    //  cobolCode::MOVE POL-RET-SHR-ARNG-CD TO TLI-REQ-SHR-ARNG-CD
    methodOut.setTliReqShrArngCd(methodOut.getPolRetShrArngCd());
    //  cobolCode::INITIALIZE WS-DSM-DT
    methodOut.getDsmDt().initialize();
    //  cobolCode::MOVE HSR-REQ-EFF-DATE (1 : 2) TO WS-DSM-DT-CC
    methodOut.setDsmDtCc(CFUtil.getInt(substring(methodOut.getHsrReqEffDateString(), 0, 2)));
    //  cobolCode::MOVE HSR-REQ-EFF-DATE (3 : 2) TO WS-DSM-DT-YY
    methodOut.setDsmDtYy(CFUtil.getInt(substring(methodOut.getHsrReqEffDateString(), 2, 4)));
    //  cobolCode::MOVE HSR-REQ-EFF-DATE (5 : 2) TO WS-DSM-DT-MM
    methodOut.setDsmDtMm(CFUtil.getInt(substring(methodOut.getHsrReqEffDateString(), 4, 6)));
    //  cobolCode::MOVE HSR-REQ-EFF-DATE (7 : 2) TO WS-DSM-DT-DD
    methodOut.setDsmDtDd(CFUtil.getInt(substring(methodOut.getHsrReqEffDateString(), 6, 8)));
    methodOut.setTliReqStartDt(methodOut.getDsmDt().toCharArray());
    //  cobolCode::MOVE PAN-VALET TO TLI-REQ-CLNG-PROG
    methodOut.setTliReqClngProg(methodOut.getPanValet());
    methodOut.setDsmFuncCd(1);
    //  cobolCode::CALL WS-D5427TLI USING DSM-CALL-AREA TLI-REQ-RET-AREA
    programCtx.setRc(
        d5427tli.call(
            programCtx.getGlobalCtx().getContext("D5427TLI"),
            methodOut.getDsmCallArea(),
            methodOut.getTliReqRetArea()));
    //  cobolCode::IF DSM-NO-ERROR
    if (methodIn.isDsmNoError()) {
      //  cobolCode::SET WS-TLI-TABLE-FOUND TO TRUE
      methodOut.setTliTableFoundTrue();

    }
    //  cobolCode::ELSE
    else {
      //  cobolCode::IF DSM-ENTRY-NOT-FND-INQ
      if (methodIn.isDsmEntryNotFndInq()) {
        //  cobolCode::SET WS-TLI-TABLE-NOT-FOUND TO TRUE
        methodOut.setTliTableNotFoundTrue();

      }
      //  cobolCode::ELSE
      else {
        //  cobolCode::SET REQ-FAIL OF F5957REQ-INPUT TO TRUE
        methodOut.setReqFailTrue();

        //  cobolCode::SET REQ-PARM-ADDRESSES-ERROR OF F5957REQ-INPUT TO TRUE
        methodOut.setReqParmAddressesErrorTrue();

        //  cobolCode::SET HSR-REQ-CONTRCT-FAIL-C-FUNC-RC TO TRUE
        methodOut.setHsrReqContrctFailCFuncRcTrue();

        //  cobolCode::INITIALIZE FMA-FIXED-AREA
        methodOut.getFmaFixedArea().initialize();
        //  cobolCode::SET FMA-TYPE-IS-NUMERIC-1 TO TRUE
        methodOut.setFmaTypeIsNumeric1True();

        //  cobolCode::IF NOT DSM-EDIT-ERROR
        if (!(methodIn.isDsmEditError())) {
          //  cobolCode::MOVE DSM-SQLCODE TO FMA-IP-TYPE-NUMERIC-1
          methodOut.setFmaIpTypeNumeric1(methodOut.getDsmSqlcode());
        }
        //  cobolCode::MOVE 'DTLI' TO FMA-IP-TYPE-ALPHA-1
        //  LITERAL_DTLI = 'DTLI'
        methodOut.setFmaIpTypeAlpha1(CONSTANTS.LITERAL_DTLI);
        //  cobolCode::MOVE DSM-ERR-SECTN-NAME TO FMA-IP-TYPE-ALPHA-2
        methodOut.setFmaIpTypeAlpha2(methodOut.getDsmErrSectnName());
        //  cobolCode::MOVE 14 TO FMA-IP-ERR-CODE-1
        methodOut.setFmaIpErrCode1(14);
        //  cobolCode::PERFORM SET-FMA-ERR-TBL-9000
        setFmaErrTbl9000(programCtx.getSetFmaErrTbl9000InCtx()); /*SET-FMA-ERR-TBL-9000 SECTION*/
      }
    }

    return methodOut;
  }
  /**
   * createAfHipaaSect This method is derived from COBOL Paragraph - 7000-CREATE-AF-HIPAA-SECT
   * SECTION COBOL Cyclomatic complexity - 16 Input :
   *
   * <p>- hsrRetHipaaCnt COBOL Name: HSR-RET-HIPAA-CNT - hsrRetHipaaCd COBOL Name: HSR-RET-HIPAA-CD
   * - ehbHpaSub COBOL Name: EHB-HPA-SUB - hsrRetBhiInfo COBOL Name: HSR-RET-BHI-INFO - ehbBhiSub
   * COBOL Name: EHB-BHI-SUB
   *
   * <p>Output :
   *
   * <p>- hsrRetHipaaCnt COBOL Name: HSR-RET-HIPAA-CNT - ehbHpaSub COBOL Name: EHB-HPA-SUB -
   * hsrRetBhiInfo COBOL Name: HSR-RET-BHI-INFO - hsrRetNetCnt COBOL Name: HSR-RET-NET-CNT -
   * ehbBhiSub COBOL Name: EHB-BHI-SUB - hsrRetSrvcCd COBOL Name: HSR-RET-SRVC-CD - hsrRetHipaaCdMod
   * COBOL Name: HSR-RET-HIPAA-CD-MOD - hsrRetNetInfo COBOL Name: HSR-RET-NET-INFO
   *
   * @throws CFException
   */
  @Override
  public CreateAfHipaaSectOutCtx createAfHipaaSect(CreateAfHipaaSectInCtx methodIn)
      throws Exception {

    // *81***************************************************************
    // *81 7000-Create-af-hipaa-sect       section                      *
    // *81                                                              *
    // *81 business function:                                           *
    // *81 for hipaa-code 'af' create additional return hipaa entry     *
    // *81***************************************************************
    // *82 7000-create-af-hipaa-sect       section                      *
    // *82 1.when hipaa-cd 'af' set flags for 91000 and 92507 srvc codes*
    // *82 create separate 'af' entries for each srvc-cd                *
    // *82 called by : 0000-mainline                                    *
    // *82 calls     : none                                             *
    // *82                                                              *
    // *82***************************************************************

    // * Add new entry slot

    // * Move all entries after 'af' up a slot
    // Added variable to get the program context in place.
    Bbhsr002Ctx programCtx = methodIn.getBbhsr002Ctx();
    // Added variable to get the output context in place.
    CreateAfHipaaSectOutCtx methodOut = methodIn.getCreateAfHipaaSectOutCtx();
    //  cobolCode::ADD +1 TO HSR-RET-HIPAA-CNT
    methodOut.setHsrRetHipaaCnt(methodOut.getHsrRetHipaaCnt() + 1);
    //  cobolCode::PERFORM WITH TEST BEFORE VARYING EHB-HPA-SUB FROM HSR-RET-HIPAA-CNT BY -1 UNTIL
    // HSR-RET-HIPAA-CD ( EHB-HPA-SUB ) = 'AF' OR EHB-HPA-SUB = 1
    for (methodOut.setEhbHpaSub(methodOut.getHsrRetHipaaCnt());
        (compareChars(methodIn.getHsrRetHipaaCd(methodOut.getEhbHpaSub() - 1), CONSTANTS.LITERAL_AF)
                != 0
            && (methodOut.getEhbHpaSub() != 1));
        methodOut.setEhbHpaSub(methodOut.getEhbHpaSub() + -1)) {
      //  cobolCode::MOVE HSR-RET-BHI-INFO ( EHB-HPA-SUB - 1) TO HSR-RET-BHI-INFO ( EHB-HPA-SUB )
      methodOut.setHsrRetBhiInfo(
          methodOut.getEhbHpaSub() - 1,
          methodOut.getHsrRetBhiInfo(methodOut.getEhbHpaSub() - 1 - 1).toCharArray());
    }

    // * Ehb-hpa-sub points to 'af' entry
    // * remove '92507' bhi details from 1st 'af' slot
    // * first 'af' will be '91000' - 'ci'
    //  cobolCode::PERFORM WITH TEST BEFORE VARYING EHB-BHI-SUB FROM 1 BY +1 UNTIL EHB-BHI-SUB >
    // HSR-RET-NET-CNT ( EHB-HPA-SUB )
    for (methodOut.setEhbBhiSub(1);
        ((methodOut.getEhbBhiSub() <= methodOut.getHsrRetNetCnt(methodOut.getEhbHpaSub() - 1)));
        methodOut.setEhbBhiSub(methodOut.getEhbBhiSub() + 1)) {
      //  cobolCode::IF HSR-RET-SRVC-CD ( EHB-HPA-SUB , EHB-BHI-SUB ) = '92507' OR HSR-RET-SRVC-CD (
      // EHB-HPA-SUB , EHB-BHI-SUB ) = ' 92507'
      //  LITERAL_B_92507 = ' 92507'
      if (compareChars(
                  methodOut.getHsrRetSrvcCd(
                      methodOut.getEhbHpaSub() - 1, methodOut.getEhbBhiSub() - 1),
                  CONSTANTS.LITERAL_92507_B_)
              == 0
          || compareChars(
                  methodOut.getHsrRetSrvcCd(
                      methodOut.getEhbHpaSub() - 1, methodOut.getEhbBhiSub() - 1),
                  CONSTANTS.LITERAL_B_92507)
              == 0) {
        //  cobolCode::MOVE 'CI' TO HSR-RET-HIPAA-CD-MOD ( EHB-HPA-SUB )
        //  LITERAL_CI = 'CI'
        methodOut.setHsrRetHipaaCdMod(methodOut.getEhbHpaSub() - 1, CONSTANTS.LITERAL_CI);
        //  cobolCode::PERFORM WITH TEST BEFORE UNTIL EHB-BHI-SUB > HSR-RET-NET-CNT ( EHB-HPA-SUB )
        while (((methodOut.getEhbBhiSub()
            <= methodOut.getHsrRetNetCnt(methodOut.getEhbHpaSub() - 1)))) {
          //  cobolCode::IF EHB-BHI-SUB = 4
          if ((methodOut.getEhbBhiSub() == 4)) {
            //  cobolCode::INITIALIZE HSR-RET-NET-INFO ( EHB-HPA-SUB , EHB-BHI-SUB )
            methodOut
                .getHsrRetNetInfo(methodOut.getEhbHpaSub() - 1, methodOut.getEhbBhiSub() - 1)
                .initialize();
          }
          //  cobolCode::ELSE
          else {
            //  cobolCode::MOVE HSR-RET-NET-INFO ( EHB-HPA-SUB , EHB-BHI-SUB + 1) TO
            // HSR-RET-NET-INFO ( EHB-HPA-SUB , EHB-BHI-SUB )
            methodOut.setHsrRetNetInfo(
                methodOut.getEhbHpaSub() - 1,
                methodOut.getEhbBhiSub() - 1,
                methodOut
                    .getHsrRetNetInfo(
                        methodOut.getEhbHpaSub() - 1, methodOut.getEhbBhiSub() + 1 - 1)
                    .toCharArray());
            //  cobolCode::ADD +1 TO EHB-BHI-SUB
            methodOut.setEhbBhiSub((short) (methodOut.getEhbBhiSub() + (short) 1));
          }
        }
        //  cobolCode::SUBTRACT 1 FROM HSR-RET-NET-CNT ( EHB-HPA-SUB )
        methodOut.setHsrRetNetCnt(
            methodOut.getEhbHpaSub() - 1,
            Math.abs(methodOut.getHsrRetNetCnt(methodOut.getEhbHpaSub() - 1) - 1));
      }
    }
    //  cobolCode::ADD 1 TO EHB-HPA-SUB
    methodOut.setEhbHpaSub((short) (methodOut.getEhbHpaSub() + (short) 1));

    // * Remove '91000' bhi details from 2nd 'af' slot
    // * 2nd   'af' will be '92507' - 'st'
    //  cobolCode::PERFORM WITH TEST BEFORE VARYING EHB-BHI-SUB FROM 1 BY +1 UNTIL EHB-BHI-SUB >
    // HSR-RET-NET-CNT ( EHB-HPA-SUB )
    for (methodOut.setEhbBhiSub(1);
        ((methodOut.getEhbBhiSub() <= methodOut.getHsrRetNetCnt(methodOut.getEhbHpaSub() - 1)));
        methodOut.setEhbBhiSub(methodOut.getEhbBhiSub() + 1)) {
      //  cobolCode::IF HSR-RET-SRVC-CD ( EHB-HPA-SUB , EHB-BHI-SUB ) = '91000' OR HSR-RET-SRVC-CD (
      // EHB-HPA-SUB , EHB-BHI-SUB ) = ' 91000'
      //  LITERAL_B_91000 = ' 91000'
      if (compareChars(
                  methodOut.getHsrRetSrvcCd(
                      methodOut.getEhbHpaSub() - 1, methodOut.getEhbBhiSub() - 1),
                  CONSTANTS.LITERAL_91000_B_)
              == 0
          || compareChars(
                  methodOut.getHsrRetSrvcCd(
                      methodOut.getEhbHpaSub() - 1, methodOut.getEhbBhiSub() - 1),
                  CONSTANTS.LITERAL_B_91000)
              == 0) {
        //  cobolCode::MOVE 'ST' TO HSR-RET-HIPAA-CD-MOD ( EHB-HPA-SUB )
        //  LITERAL_ST = 'ST'
        methodOut.setHsrRetHipaaCdMod(methodOut.getEhbHpaSub() - 1, CONSTANTS.LITERAL_ST);
        //  cobolCode::PERFORM WITH TEST BEFORE UNTIL EHB-BHI-SUB > HSR-RET-NET-CNT ( EHB-HPA-SUB )
        while (((methodOut.getEhbBhiSub()
            <= methodOut.getHsrRetNetCnt(methodOut.getEhbHpaSub() - 1)))) {
          //  cobolCode::IF EHB-BHI-SUB = 4
          if ((methodOut.getEhbBhiSub() == 4)) {
            //  cobolCode::INITIALIZE HSR-RET-NET-INFO ( EHB-HPA-SUB , EHB-BHI-SUB )
            methodOut
                .getHsrRetNetInfo(methodOut.getEhbHpaSub() - 1, methodOut.getEhbBhiSub() - 1)
                .initialize();
          }
          //  cobolCode::ELSE
          else {
            //  cobolCode::MOVE HSR-RET-NET-INFO ( EHB-HPA-SUB , EHB-BHI-SUB + 1) TO
            // HSR-RET-NET-INFO ( EHB-HPA-SUB , EHB-BHI-SUB )
            methodOut.setHsrRetNetInfo(
                methodOut.getEhbHpaSub() - 1,
                methodOut.getEhbBhiSub() - 1,
                methodOut
                    .getHsrRetNetInfo(
                        methodOut.getEhbHpaSub() - 1, methodOut.getEhbBhiSub() + 1 - 1)
                    .toCharArray());
            //  cobolCode::ADD +1 TO EHB-BHI-SUB
            methodOut.setEhbBhiSub((short) (methodOut.getEhbBhiSub() + (short) 1));
          }
        }
        //  cobolCode::SUBTRACT 1 FROM HSR-RET-NET-CNT ( EHB-HPA-SUB )
        methodOut.setHsrRetNetCnt(
            methodOut.getEhbHpaSub() - 1,
            Math.abs(methodOut.getHsrRetNetCnt(methodOut.getEhbHpaSub() - 1) - 1));
      }
    }

    return methodOut;
  }
  /**
   * createPosSect This method is derived from COBOL Paragraph - 8000-CREATE-POS-SECT SECTION COBOL
   * Cyclomatic complexity - 15 Input :
   *
   * <p>- posSub COBOL Name: POS-SUB - hsrRetHipaaCnt COBOL Name: HSR-RET-HIPAA-CNT - posSub1 COBOL
   * Name: POS-SUB1 - hsrRetNetCnt COBOL Name: HSR-RET-NET-CNT - hsrRetPlOfSrvcCd COBOL Name:
   * HSR-RET-PL-OF-SRVC-CD - hsrRetBhiInfo COBOL Name: HSR-RET-BHI-INFO - bhiSub COBOL Name: BHI-SUB
   *
   * <p>Output :
   *
   * <p>- posHipaaSub COBOL Name: POS-HIPAA-SUB - posBhiCnt COBOL Name: WS-POS-BHI-CNT - posSub
   * COBOL Name: POS-SUB - allRowCreatedSw COBOL Name: WS-ALL-ROW-CREATED-SW - posSub1 COBOL Name:
   * POS-SUB1 - posBhiInfo COBOL Name: WS-POS-BHI-INFO - hsrRetBhiInfo COBOL Name: HSR-RET-BHI-INFO
   * - hsrRetHipaaCd COBOL Name: HSR-RET-HIPAA-CD - posHipaaCd COBOL Name: WS-POS-HIPAA-CD -
   * hsrRetHipaaCdMod COBOL Name: HSR-RET-HIPAA-CD-MOD - posHipaaCdMod COBOL Name:
   * WS-POS-HIPAA-CD-MOD - hsrRetGrnrcReqCd COBOL Name: HSR-RET-GRNRC-REQ-CD - posGrnrcReqCd COBOL
   * Name: WS-POS-GRNRC-REQ-CD - hsrRetInnCovIndicator COBOL Name: HSR-RET-INN-COV-INDICATOR -
   * posInnCovIndicator COBOL Name: WS-POS-INN-COV-INDICATOR - hsrRetT1CovIndicator COBOL Name:
   * HSR-RET-T1-COV-INDICATOR - posT1CovIndicator COBOL Name: WS-POS-T1-COV-INDICATOR -
   * hsrRetOonCovIndicator COBOL Name: HSR-RET-OON-COV-INDICATOR - posOonCovIndicator COBOL Name:
   * WS-POS-OON-COV-INDICATOR - posNetCnt COBOL Name: WS-POS-NET-CNT - hsrRetSlotTblId COBOL Name:
   * HSR-RET-SLOT-TBL-ID - posSlotTblId COBOL Name: WS-POS-SLOT-TBL-ID - hsrRetSrvcCd COBOL Name:
   * HSR-RET-SRVC-CD - posSrvcCd COBOL Name: WS-POS-SRVC-CD - posPlOfSrvcCd COBOL Name:
   * WS-POS-PL-OF-SRVC-CD - hsrRetPlOfSrvcCd COBOL Name: HSR-RET-PL-OF-SRVC-CD - hsrRetCausCd COBOL
   * Name: HSR-RET-CAUS-CD - posCausCd COBOL Name: WS-POS-CAUS-CD - hsrRetBenLvlCd COBOL Name:
   * HSR-RET-BEN-LVL-CD - posBenLvlCd COBOL Name: WS-POS-BEN-LVL-CD - hsrRetNetInd COBOL Name:
   * HSR-RET-NET-IND - posNetInd COBOL Name: WS-POS-NET-IND - hsrRetInNtwkClssCd COBOL Name:
   * HSR-RET-IN-NTWK-CLSS-CD - posInNtwkClssCd COBOL Name: WS-POS-IN-NTWK-CLSS-CD -
   * hsrRetT1NtwkClssCd COBOL Name: HSR-RET-T1-NTWK-CLSS-CD - posT1NtwkClssCd COBOL Name:
   * WS-POS-T1-NTWK-CLSS-CD - hsrRetSrvcCdNbr COBOL Name: HSR-RET-SRVC-CD-NBR - posSrvcCdNbr COBOL
   * Name: WS-POS-SRVC-CD-NBR - hsrRetProcRangeFrom COBOL Name: HSR-RET-PROC-RANGE-FROM -
   * posProcRangeFrom COBOL Name: WS-POS-PROC-RANGE-FROM - hsrRetProcRangeTo COBOL Name:
   * HSR-RET-PROC-RANGE-TO - posProcRangeTo COBOL Name: WS-POS-PROC-RANGE-TO - hsrRetProcCdType
   * COBOL Name: HSR-RET-PROC-CD-TYPE - posProcCdType COBOL Name: WS-POS-PROC-CD-TYPE -
   * hsrRetProvOrgTypCd COBOL Name: HSR-RET-PROV-ORG-TYP-CD - posProvOrgTypCd COBOL Name:
   * WS-POS-PROV-ORG-TYP-CD - hsrRetHipaaCommtTxt COBOL Name: HSR-RET-HIPAA-COMMT-TXT -
   * hipaaCommtTxt COBOL Name: WS-HIPAA-COMMT-TXT - bhiSub COBOL Name: BHI-SUB - hsrRetHipaaCnt
   * COBOL Name: HSR-RET-HIPAA-CNT
   *
   * @throws CFException
   */
  @Override
  public CreatePosSectOutCtx createPosSect(CreatePosSectInCtx methodIn) throws Exception {

    // *81 8000-Create-pos-sect            section                      *
    // *81                                                              *
    // *81 business function:                                           *
    // *81 for the same hipaa code with different place of service      *
    // *81 create additional return hipaa entry                         *
    // *81***************************************************************
    // *82 8000-create-pos-sect            section                      *
    // *82 1.for additional pos create separate entry                   *
    // *82 called by : 0000-mainline                                    *
    // *82 calls     : none                                             *
    // *82                                                              *
    // *82***************************************************************
    // Added variable to get the program context in place.
    Bbhsr002Ctx programCtx = methodIn.getBbhsr002Ctx();
    // Added variable to get the output context in place.
    CreatePosSectOutCtx methodOut = methodIn.getCreatePosSectOutCtx();
    //  cobolCode::INITIALIZE POS-HIPAA-SUB WS-POS-BHI-CNT
    methodOut.setPosHipaaSub(0);
    methodOut.setPosBhiCnt(0);
    //  cobolCode::PERFORM VARYING POS-SUB FROM 1 BY 1 UNTIL POS-SUB > HSR-RET-HIPAA-CNT
    for (methodOut.setPosSub(1);
        ((methodOut.getPosSub() <= methodOut.getHsrRetHipaaCnt()));
        methodOut.setPosSub(methodOut.getPosSub() + 1)) {
      //  cobolCode::INITIALIZE WS-ALL-ROW-CREATED-SW
      methodOut.setAllRowCreatedSw(CONSTANTS.SPACE_6 /* Fill 6 Spaces*/);
      //  cobolCode::PERFORM VARYING POS-SUB1 FROM 1 BY 1 UNTIL POS-SUB1 > HSR-RET-NET-CNT ( POS-SUB
      // ) OR ALL-ROW-CREATED
      for (methodOut.setPosSub1(1);
          ((methodOut.getPosSub1() <= methodIn.getHsrRetNetCnt(methodOut.getPosSub() - 1))
              && !(methodOut.isAllRowCreated()));
          methodOut.setPosSub1(methodOut.getPosSub1() + 1)) {
        //  cobolCode::IF HSR-RET-PL-OF-SRVC-CD ( POS-SUB , 1) = SPACES
        if ((allSpaces(methodOut.getHsrRetPlOfSrvcCd(methodOut.getPosSub() - 1, 0)))) {
          //  cobolCode::ADD +1 TO POS-HIPAA-SUB WS-POS-BHI-CNT
          methodOut.setPosHipaaSub(methodOut.getPosHipaaSub() + 1);
          methodOut.setPosBhiCnt(methodOut.getPosBhiCnt() + 1);
          //  cobolCode::MOVE HSR-RET-BHI-INFO ( POS-SUB ) TO WS-POS-BHI-INFO ( POS-HIPAA-SUB )
          methodOut.setPosBhiInfo(
              methodOut.getPosHipaaSub() - 1,
              methodOut.getHsrRetBhiInfo(methodOut.getPosSub() - 1).toCharArray());
          //  cobolCode::SET ALL-ROW-CREATED TO TRUE
          methodOut.setAllRowCreatedTrue();

        }
        //  cobolCode::ELSE
        else {
          //  cobolCode::ADD +1 TO POS-HIPAA-SUB WS-POS-BHI-CNT
          methodOut.setPosHipaaSub(methodOut.getPosHipaaSub() + 1);
          methodOut.setPosBhiCnt(methodOut.getPosBhiCnt() + 1);
          //  cobolCode::MOVE HSR-RET-HIPAA-CD ( POS-SUB ) TO WS-POS-HIPAA-CD ( POS-HIPAA-SUB )
          methodOut.setPosHipaaCd(
              methodOut.getPosHipaaSub() - 1,
              methodOut.getHsrRetHipaaCd(methodOut.getPosSub() - 1));
          //  cobolCode::MOVE HSR-RET-HIPAA-CD-MOD ( POS-SUB ) TO WS-POS-HIPAA-CD-MOD (
          // POS-HIPAA-SUB )
          methodOut.setPosHipaaCdMod(
              methodOut.getPosHipaaSub() - 1,
              methodOut.getHsrRetHipaaCdMod(methodOut.getPosSub() - 1));
          //  cobolCode::MOVE HSR-RET-GRNRC-REQ-CD ( POS-SUB ) TO WS-POS-GRNRC-REQ-CD (
          // POS-HIPAA-SUB )
          methodOut.setPosGrnrcReqCd(
              methodOut.getPosHipaaSub() - 1,
              methodOut.getHsrRetGrnrcReqCd(methodOut.getPosSub() - 1));
          //  cobolCode::MOVE HSR-RET-INN-COV-INDICATOR ( POS-SUB ) TO WS-POS-INN-COV-INDICATOR (
          // POS-HIPAA-SUB )
          methodOut.setPosInnCovIndicator(
              methodOut.getPosHipaaSub() - 1,
              methodOut.getHsrRetInnCovIndicator(methodOut.getPosSub() - 1));
          //  cobolCode::MOVE HSR-RET-T1-COV-INDICATOR ( POS-SUB ) TO WS-POS-T1-COV-INDICATOR (
          // POS-HIPAA-SUB )
          methodOut.setPosT1CovIndicator(
              methodOut.getPosHipaaSub() - 1,
              methodOut.getHsrRetT1CovIndicator(methodOut.getPosSub() - 1));
          //  cobolCode::MOVE HSR-RET-OON-COV-INDICATOR ( POS-SUB ) TO WS-POS-OON-COV-INDICATOR (
          // POS-HIPAA-SUB )
          methodOut.setPosOonCovIndicator(
              methodOut.getPosHipaaSub() - 1,
              methodOut.getHsrRetOonCovIndicator(methodOut.getPosSub() - 1));
          //  cobolCode::MOVE 1 TO WS-POS-NET-CNT ( POS-HIPAA-SUB )
          //  LITERAL_1 = 1
          methodOut.setPosNetCnt(methodOut.getPosHipaaSub() - 1, 1);
          //  cobolCode::MOVE HSR-RET-SLOT-TBL-ID ( POS-SUB , POS-SUB1 ) TO WS-POS-SLOT-TBL-ID (
          // POS-HIPAA-SUB , 1)
          methodOut.setPosSlotTblId(
              methodOut.getPosHipaaSub() - 1,
              0,
              methodOut.getHsrRetSlotTblId(methodOut.getPosSub() - 1, methodOut.getPosSub1() - 1));
          //  cobolCode::MOVE HSR-RET-SRVC-CD ( POS-SUB , POS-SUB1 ) TO WS-POS-SRVC-CD (
          // POS-HIPAA-SUB , 1)
          methodOut.setPosSrvcCd(
              methodOut.getPosHipaaSub() - 1,
              0,
              methodOut.getHsrRetSrvcCd(methodOut.getPosSub() - 1, methodOut.getPosSub1() - 1));
          //  cobolCode::MOVE HSR-RET-PL-OF-SRVC-CD ( POS-SUB , POS-SUB1 ) TO WS-POS-PL-OF-SRVC-CD (
          // POS-HIPAA-SUB , 1)
          methodOut.setPosPlOfSrvcCd(
              methodOut.getPosHipaaSub() - 1,
              0,
              methodOut.getHsrRetPlOfSrvcCd(methodOut.getPosSub() - 1, methodOut.getPosSub1() - 1));
          //  cobolCode::MOVE HSR-RET-CAUS-CD ( POS-SUB , POS-SUB1 ) TO WS-POS-CAUS-CD (
          // POS-HIPAA-SUB , 1)
          methodOut.setPosCausCd(
              methodOut.getPosHipaaSub() - 1,
              0,
              methodOut.getHsrRetCausCd(methodOut.getPosSub() - 1, methodOut.getPosSub1() - 1));
          //  cobolCode::MOVE HSR-RET-BEN-LVL-CD ( POS-SUB , POS-SUB1 ) TO WS-POS-BEN-LVL-CD (
          // POS-HIPAA-SUB , 1)
          methodOut.setPosBenLvlCd(
              methodOut.getPosHipaaSub() - 1,
              0,
              methodOut.getHsrRetBenLvlCd(methodOut.getPosSub() - 1, methodOut.getPosSub1() - 1));
          //  cobolCode::MOVE HSR-RET-NET-IND ( POS-SUB , POS-SUB1 ) TO WS-POS-NET-IND (
          // POS-HIPAA-SUB , 1)
          methodOut.setPosNetInd(
              methodOut.getPosHipaaSub() - 1,
              0,
              methodOut.getHsrRetNetInd(methodOut.getPosSub() - 1, methodOut.getPosSub1() - 1));
          //  cobolCode::MOVE HSR-RET-IN-NTWK-CLSS-CD ( POS-SUB , POS-SUB1 ) TO
          // WS-POS-IN-NTWK-CLSS-CD ( POS-HIPAA-SUB , 1)
          methodOut.setPosInNtwkClssCd(
              methodOut.getPosHipaaSub() - 1,
              0,
              methodOut.getHsrRetInNtwkClssCd(
                  methodOut.getPosSub() - 1, methodOut.getPosSub1() - 1));
          //  cobolCode::MOVE HSR-RET-T1-NTWK-CLSS-CD ( POS-SUB , POS-SUB1 ) TO
          // WS-POS-T1-NTWK-CLSS-CD ( POS-HIPAA-SUB , 1)
          methodOut.setPosT1NtwkClssCd(
              methodOut.getPosHipaaSub() - 1,
              0,
              methodOut.getHsrRetT1NtwkClssCd(
                  methodOut.getPosSub() - 1, methodOut.getPosSub1() - 1));
          //  cobolCode::MOVE HSR-RET-SRVC-CD-NBR ( POS-SUB , POS-SUB1 ) TO WS-POS-SRVC-CD-NBR (
          // POS-HIPAA-SUB , 1)
          methodOut.setPosSrvcCdNbr(
              methodOut.getPosHipaaSub() - 1,
              0,
              methodOut.getHsrRetSrvcCdNbr(methodOut.getPosSub() - 1, methodOut.getPosSub1() - 1));
          //  cobolCode::MOVE HSR-RET-PROC-RANGE-FROM ( POS-SUB , POS-SUB1 ) TO
          // WS-POS-PROC-RANGE-FROM ( POS-HIPAA-SUB , 1)
          methodOut.setPosProcRangeFrom(
              methodOut.getPosHipaaSub() - 1,
              0,
              methodOut.getHsrRetProcRangeFrom(
                  methodOut.getPosSub() - 1, methodOut.getPosSub1() - 1));
          //  cobolCode::MOVE HSR-RET-PROC-RANGE-TO ( POS-SUB , POS-SUB1 ) TO WS-POS-PROC-RANGE-TO (
          // POS-HIPAA-SUB , 1)
          methodOut.setPosProcRangeTo(
              methodOut.getPosHipaaSub() - 1,
              0,
              methodOut.getHsrRetProcRangeTo(
                  methodOut.getPosSub() - 1, methodOut.getPosSub1() - 1));
          //  cobolCode::MOVE HSR-RET-PROC-CD-TYPE ( POS-SUB , POS-SUB1 ) TO WS-POS-PROC-CD-TYPE (
          // POS-HIPAA-SUB , 1)
          methodOut.setPosProcCdType(
              methodOut.getPosHipaaSub() - 1,
              0,
              methodOut.getHsrRetProcCdType(methodOut.getPosSub() - 1, methodOut.getPosSub1() - 1));
          //  cobolCode::MOVE HSR-RET-PROV-ORG-TYP-CD ( POS-SUB , POS-SUB1 ) TO
          // WS-POS-PROV-ORG-TYP-CD ( POS-HIPAA-SUB , 1)
          methodOut.setPosProvOrgTypCd(
              methodOut.getPosHipaaSub() - 1,
              0,
              methodOut.getHsrRetProvOrgTypCd(
                  methodOut.getPosSub() - 1, methodOut.getPosSub1() - 1));
          //  cobolCode::MOVE HSR-RET-HIPAA-COMMT-TXT ( POS-SUB , POS-SUB1 ) TO WS-HIPAA-COMMT-TXT (
          // POS-HIPAA-SUB , 1)
          methodOut.setHipaaCommtTxt(
              methodOut.getPosHipaaSub() - 1,
              0,
              methodOut.getHsrRetHipaaCommtTxt(
                  methodOut.getPosSub() - 1, methodOut.getPosSub1() - 1));
        }
      }
    }
    //  cobolCode::PERFORM VARYING BHI-SUB FROM 1 BY 1 UNTIL BHI-SUB > 300
    for (methodOut.setBhiSub(1);
        ((methodOut.getBhiSub() <= 300));
        methodOut.setBhiSub(methodOut.getBhiSub() + 1)) {
      //  cobolCode::INITIALIZE HSR-RET-BHI-INFO ( BHI-SUB )
      methodOut.getHsrRetBhiInfo(methodOut.getBhiSub() - 1).initialize();
    }
    //  cobolCode::INITIALIZE HSR-RET-HIPAA-CNT
    methodOut.setHsrRetHipaaCnt(0);
    //  cobolCode::PERFORM VARYING POS-HIPAA-SUB FROM 1 BY 1 UNTIL POS-HIPAA-SUB > WS-POS-BHI-CNT
    for (methodOut.setPosHipaaSub(1);
        ((methodOut.getPosHipaaSub() <= methodOut.getPosBhiCnt()));
        methodOut.setPosHipaaSub(methodOut.getPosHipaaSub() + 1)) {
      //  cobolCode::ADD +1 TO HSR-RET-HIPAA-CNT
      methodOut.setHsrRetHipaaCnt(methodOut.getHsrRetHipaaCnt() + 1);
      //  cobolCode::MOVE WS-POS-BHI-INFO ( POS-HIPAA-SUB ) TO HSR-RET-BHI-INFO ( POS-HIPAA-SUB )
      methodOut.setHsrRetBhiInfo(
          methodOut.getPosHipaaSub() - 1,
          methodOut.getPosBhiInfo(methodOut.getPosHipaaSub() - 1).toCharArray());
      //  cobolCode::IF HSR-RET-HIPAA-CD ( POS-HIPAA-SUB ) = 'AF' AND HSR-RET-SRVC-CD (
      // POS-HIPAA-SUB , 1) = '92507'
      if (compareChars(
                  methodOut.getHsrRetHipaaCd(methodOut.getPosHipaaSub() - 1), CONSTANTS.LITERAL_AF)
              == 0
          && compareChars(
                  methodOut.getHsrRetSrvcCd(methodOut.getPosHipaaSub() - 1, 0),
                  CONSTANTS.LITERAL_92507_B_)
              == 0) {
        //  cobolCode::MOVE 'ST' TO HSR-RET-HIPAA-CD-MOD ( POS-HIPAA-SUB )
        //  LITERAL_ST = 'ST'
        methodOut.setHsrRetHipaaCdMod(methodOut.getPosHipaaSub() - 1, CONSTANTS.LITERAL_ST);
      }
      //  cobolCode::IF HSR-RET-HIPAA-CD ( POS-HIPAA-SUB ) = 'AF' AND HSR-RET-SRVC-CD (
      // POS-HIPAA-SUB , 1) = '91000'
      if (compareChars(
                  methodOut.getHsrRetHipaaCd(methodOut.getPosHipaaSub() - 1), CONSTANTS.LITERAL_AF)
              == 0
          && compareChars(
                  methodOut.getHsrRetSrvcCd(methodOut.getPosHipaaSub() - 1, 0),
                  CONSTANTS.LITERAL_91000_B_)
              == 0) {
        //  cobolCode::MOVE 'CI' TO HSR-RET-HIPAA-CD-MOD ( POS-HIPAA-SUB )
        //  LITERAL_CI = 'CI'
        methodOut.setHsrRetHipaaCdMod(methodOut.getPosHipaaSub() - 1, CONSTANTS.LITERAL_CI);
      }
    }

    return methodOut;
  }
  /**
   * termination This method is derived from COBOL Paragraph - 9999-TERMINATION SECTION COBOL
   * Cyclomatic complexity - 7 Input :
   *
   * <p>- reqReturnCode COBOL Name: REQ-RETURN-CODE - hsrReturnArea COBOL Name: HSR-RETURN-AREA -
   * foundnMsgCallerArea COBOL Name: FOUNDN-MSG-CALLER-AREA
   *
   * <p>Output :
   *
   * <p>- reqAddress2Length COBOL Name: REQ-ADDRESS-2-LENGTH - reqAddress2Ptr COBOL Name:
   * REQ-ADDRESS-2-PTR - cicsDfhrespCode COBOL Name: CICS-DFHRESP-CODE - adaAcqDataArea COBOL Name:
   * ADA-ACQ-DATA-AREA - foundnMsgCallerArea COBOL Name: FOUNDN-MSG-CALLER-AREA - reqAddress3Ptr
   * COBOL Name: REQ-ADDRESS-3-PTR - reqAddress3Length COBOL Name: REQ-ADDRESS-3-LENGTH -
   * fmaTypeAlpha1 COBOL Name: FMA-TYPE-ALPHA-1 - hsrReturnArea COBOL Name: HSR-RETURN-AREA
   *
   * @throws CFException
   */
  @Override
  public TerminationOutCtx termination(TerminationInCtx methodIn) throws Exception {

    // ******************************************************************
    // *81 9999-Termination                                             *
    // ******************************************************************
    // *81                                                              *
    // *81 freemain is done for all the storage area that is acquired   *
    // *81 thru getmain.linkage area is populated with calculated values*
    // *81                                                              *
    // ******************************************************************
    // *82 1. release storage area                                      *
    // *82 2. populate linkage area                                     *
    // *82                                                              *
    // *82 called by: 0000-exit                                         *
    // *82 calls    : 1. free-data-area-9962                            *
    // *82                                                              *
    // ******************************************************************
    // Added variable to get the program context in place.
    Bbhsr002Ctx programCtx = methodIn.getBbhsr002Ctx();
    // Added variable to get the output context in place.
    TerminationOutCtx methodOut = methodIn.getTerminationOutCtx();
    //  cobolCode::DISPLAY '9999-TERMINATION'
    logger.info("9999-TERMINATION");
    //  cobolCode::IF REQ-OK OF F5957REQ-INPUT
    if (methodIn.isReqOk()) {
      //  cobolCode::IF ADDRESS OF HSR-RETURN-AREA NOT = NULLS
      //  LITERAL_NULLS = NULLS
      if (compareChars(methodOut.getHsrReturnArea(), CONSTANTS.LITERAL_NULLS) != 0) {
        //  cobolCode::MOVE LENGTH OF HSR-RETURN-AREA TO REQ-ADDRESS-2-LENGTH OF F5957REQ-INPUT
        methodOut.setReqAddress2Length((short) HsrReturnArea.getHsrReturnAreaFieldLength());
        //  cobolCode::SET REQ-ADDRESS-2-PTR OF F5957REQ-INPUT TO ADDRESS OF HSR-RETURN-AREA
        methodOut.setReqAddress2Ptr(setObject(methodOut.getHsrReturnArea()));

        // *EXEC CICS PUT CONTAINER('HSR-RETURN-AREA')
        // *     FROM(HSR-RETURN-AREA)
        // *     FLENGTH(LENGTH OF HSR-RETURN-AREA)
        // *     CHANNEL('BN1-BBHSR002')
        // *     RESP (CICS-DFHRESP-CODE)
        // *END-EXEC
        //  cobolCode::PUT CONTAINER('HSR-RETURN-AREA') FROM(HSR-RETURN-AREA)
        // FLENGTH(FUNCTION~LENGTH~HSR-RETURN-AREA) CHANNEL('BN1-BBHSR002') RESP (CICS-DFHRESP-CODE)

        // *EXEC CICS PUT CONTAINER('HSR-RETURN-AREA')
        // *     FROM(HSR-RETURN-AREA)
        // *     FLENGTH(LENGTH OF HSR-RETURN-AREA)
        // *     CHANNEL('BN1-BBHSR002')
        // *     RESP (CICS-DFHRESP-CODE)
        // *END-EXEC
        // write data to a container
        programCtx
            .getGlobalCtx()
            .addContainer(
                String.valueOf(CONSTANTS.LITERAL_HSR_MN2_RETURNAREA).trim(),
                methodOut.getHsrReturnArea().toCharArray());

        methodOut.setCicsDfhrespCode(programCtx.getCicsSession().getEibresp());

        //  cobolCode::MOVE EIBRESP TO CICS-DFHRESP-CODE
        methodOut.setCicsDfhrespCode(programCtx.getCicsSession().getEibresp());
      }
      //  cobolCode::IF ADDRESS OF FOUNDN-MSG-CALLER-AREA NOT = NULLS
      //  LITERAL_NULLS = NULLS
      if (compareChars(methodOut.getFoundnMsgCallerArea(), CONSTANTS.LITERAL_NULLS) != 0) {
        //  cobolCode::SET ADDRESS OF ADA-ACQ-DATA-AREA TO ADDRESS OF FOUNDN-MSG-CALLER-AREA
        methodIn.getAdaAcqDataAreaGroup().set(methodOut.getFoundnMsgCallerArea());

        //  cobolCode::PERFORM FREE-DATA-AREA-9962
        freeDataArea9962(programCtx.getFreeDataArea9962InCtx()); /*FREE-DATA-AREA-9962 SECTION*/
        //  cobolCode::SET ADDRESS OF FOUNDN-MSG-CALLER-AREA TO NULL
        methodOut.getFoundnMsgCallerArea().set(getMvsControlBlk());

        //  cobolCode::SET REQ-ADDRESS-3-PTR OF F5957REQ-INPUT TO NULL
        methodOut.setReqAddress3Ptr(0);

        //  cobolCode::MOVE ZERO TO REQ-ADDRESS-3-LENGTH OF F5957REQ-INPUT
        methodOut.setReqAddress3Length((short) 0);
      }
    }
    //  cobolCode::ELSE
    else {
      //  cobolCode::IF ADDRESS OF FOUNDN-MSG-CALLER-AREA NOT = NULLS
      //  LITERAL_NULLS = NULLS
      if (compareChars(methodOut.getFoundnMsgCallerArea(), CONSTANTS.LITERAL_NULLS) != 0) {
        //  cobolCode::IF FMA-TYPE-ALPHA-1 (1) = SPACES
        if ((allSpaces(methodOut.getFmaTypeAlpha1(0)))) {
          //  cobolCode::MOVE 'BHSR' TO FMA-TYPE-ALPHA-1 (1)
          //  LITERAL_BHSR = 'BHSR'
          methodOut.setFmaTypeAlpha1(0, CONSTANTS.LITERAL_BHSR);
        }
        //  cobolCode::MOVE LENGTH OF FOUNDN-MSG-CALLER-AREA TO REQ-ADDRESS-3-LENGTH OF
        // F5957REQ-INPUT
        methodOut.setReqAddress3Length(
            (short) FoundnMsgCallerArea.getFoundnMsgCallerAreaFieldLength());
        //  cobolCode::SET REQ-ADDRESS-3-PTR OF F5957REQ-INPUT TO ADDRESS OF FOUNDN-MSG-CALLER-AREA
        methodOut.setReqAddress3Ptr(setObject(methodOut.getFoundnMsgCallerArea()));

        // *EXEC CICS PUT CONTAINER('FMA-OF-CALLEE')
        // *     FROM(FOUNDN-MSG-CALLER-AREA)
        // *     FLENGTH(LENGTH OF FOUNDN-MSG-CALLER-AREA)
        // *     CHANNEL('BN1-BBHSR002')
        // *     RESP (CICS-DFHRESP-CODE)
        // *END-EXEC
        //  cobolCode::PUT CONTAINER('FMA-OF-CALLEE') FROM(FOUNDN-MSG-CALLER-AREA)
        // FLENGTH(FUNCTION~LENGTH~FOUNDN-MSG-CALLER-AREA) CHANNEL('BN1-BBHSR002') RESP
        // (CICS-DFHRESP-CODE)

        // *EXEC CICS PUT CONTAINER('FMA-OF-CALLEE')
        // *     FROM(FOUNDN-MSG-CALLER-AREA)
        // *     FLENGTH(LENGTH OF FOUNDN-MSG-CALLER-AREA)
        // *     CHANNEL('BN1-BBHSR002')
        // *     RESP (CICS-DFHRESP-CODE)
        // *END-EXEC
        // write data to a container
        programCtx
            .getGlobalCtx()
            .addContainer(
                String.valueOf(CONSTANTS.LITERAL_FMA_MN2_OFCALLEE).trim(),
                methodOut.getFoundnMsgCallerArea().toCharArray());

        methodOut.setCicsDfhrespCode(programCtx.getCicsSession().getEibresp());

        //  cobolCode::MOVE EIBRESP TO CICS-DFHRESP-CODE
        methodOut.setCicsDfhrespCode(programCtx.getCicsSession().getEibresp());
      }
      //  cobolCode::IF ADDRESS OF HSR-RETURN-AREA NOT = NULL
      //  LITERAL_NULL = NULL
      if (compareChars(methodOut.getHsrReturnArea(), CONSTANTS.LITERAL_NULL) != 0) {
        //  cobolCode::SET ADDRESS OF ADA-ACQ-DATA-AREA TO ADDRESS OF HSR-RETURN-AREA
        methodIn.getAdaAcqDataAreaGroup().set(methodOut.getHsrReturnArea());

        //  cobolCode::PERFORM FREE-DATA-AREA-9962
        freeDataArea9962(programCtx.getFreeDataArea9962InCtx()); /*FREE-DATA-AREA-9962 SECTION*/
        //  cobolCode::SET ADDRESS OF HSR-RETURN-AREA TO NULL
        methodOut.getHsrReturnArea().set(getMvsControlBlk());
      }
    }

    // *EXEC CICS PUT CONTAINER('F5957REQ')
    // *     FROM(F5957REQ-INPUT)
    // *     FLENGTH(LENGTH OF F5957REQ-INPUT)
    // *     CHANNEL('BN1-BBHSR002')
    // *     RESP (CICS-DFHRESP-CODE)
    // *END-EXEC.
    //  cobolCode::PUT CONTAINER('F5957REQ') FROM(F5957REQ-INPUT)
    // FLENGTH(FUNCTION~LENGTH~F5957REQ-INPUT) CHANNEL('BN1-BBHSR002') RESP (CICS-DFHRESP-CODE)

    // *EXEC CICS PUT CONTAINER('F5957REQ')
    // *     FROM(F5957REQ-INPUT)
    // *     FLENGTH(LENGTH OF F5957REQ-INPUT)
    // *     CHANNEL('BN1-BBHSR002')
    // *     RESP (CICS-DFHRESP-CODE)
    // *END-EXEC.
    // write data to a container
    programCtx
        .getGlobalCtx()
        .addContainer(
            String.valueOf(CONSTANTS.LITERAL_F5957REQ).trim(),
            methodIn.getF5957reqInput().toCharArray());

    methodOut.setCicsDfhrespCode(programCtx.getCicsSession().getEibresp());

    //  cobolCode::MOVE EIBRESP TO CICS-DFHRESP-CODE
    methodOut.setCicsDfhrespCode(programCtx.getCicsSession().getEibresp());

    return methodOut;
  }
  /**
   * setFmaErrTbl9000 This method is derived from COBOL Paragraph - SET-FMA-ERR-TBL-9000 SECTION
   * COBOL Cyclomatic complexity - 6 Input :
   *
   * <p>- fmaSubscript COBOL Name: FMA-SUBSCRIPT - fmaErrCode1 COBOL Name: FMA-ERR-CODE-1 -
   * fmaIpErrCode1 COBOL Name: FMA-IP-ERR-CODE-1 - fmaIpType1 COBOL Name: FMA-IP-TYPE-1 -
   * fmaIpTypeNumeric1 COBOL Name: FMA-IP-TYPE-NUMERIC-1 - fmaIpTypeDollars1 COBOL Name:
   * FMA-IP-TYPE-DOLLARS-1 - fmaIpTypeAlpha1 COBOL Name: FMA-IP-TYPE-ALPHA-1 - fmaIpErrCode2 COBOL
   * Name: FMA-IP-ERR-CODE-2 - fmaIpType2 COBOL Name: FMA-IP-TYPE-2 - fmaIpTypeNumeric2 COBOL Name:
   * FMA-IP-TYPE-NUMERIC-2 - fmaIpTypeDollars2 COBOL Name: FMA-IP-TYPE-DOLLARS-2 - fmaIpTypeAlpha2
   * COBOL Name: FMA-IP-TYPE-ALPHA-2 - fmaIpEntry COBOL Name: FMA-IP-ENTRY - fmaEntry COBOL Name:
   * FMA-ENTRY
   *
   * <p>Output :
   *
   * <p>- fmaEntryTableOccurs COBOL Name: FMA-ENTRY-TABLE-OCCURS - fmaDoneSw COBOL Name: FMA-DONE-SW
   * - fmaSubscript COBOL Name: FMA-SUBSCRIPT - fmaErrCode1 COBOL Name: FMA-ERR-CODE-1 -
   * fmaIpErrCode1 COBOL Name: FMA-IP-ERR-CODE-1 - fmaType1 COBOL Name: FMA-TYPE-1 - fmaIpType1
   * COBOL Name: FMA-IP-TYPE-1 - fmaTypeNumeric1 COBOL Name: FMA-TYPE-NUMERIC-1 - fmaIpTypeNumeric1
   * COBOL Name: FMA-IP-TYPE-NUMERIC-1 - fmaTypeDollars1 COBOL Name: FMA-TYPE-DOLLARS-1 -
   * fmaIpTypeDollars1 COBOL Name: FMA-IP-TYPE-DOLLARS-1 - fmaTypeAlpha1 COBOL Name:
   * FMA-TYPE-ALPHA-1 - fmaIpTypeAlpha1 COBOL Name: FMA-IP-TYPE-ALPHA-1 - fmaErrCode2 COBOL Name:
   * FMA-ERR-CODE-2 - fmaIpErrCode2 COBOL Name: FMA-IP-ERR-CODE-2 - fmaType2 COBOL Name: FMA-TYPE-2
   * - fmaIpType2 COBOL Name: FMA-IP-TYPE-2 - fmaTypeNumeric2 COBOL Name: FMA-TYPE-NUMERIC-2 -
   * fmaIpTypeNumeric2 COBOL Name: FMA-IP-TYPE-NUMERIC-2 - fmaTypeDollars2 COBOL Name:
   * FMA-TYPE-DOLLARS-2 - fmaIpTypeDollars2 COBOL Name: FMA-IP-TYPE-DOLLARS-2 - fmaTypeAlpha2 COBOL
   * Name: FMA-TYPE-ALPHA-2 - fmaIpTypeAlpha2 COBOL Name: FMA-IP-TYPE-ALPHA-2
   *
   * @throws CFException
   */
  @Override
  public SetFmaErrTbl9000OutCtx setFmaErrTbl9000(SetFmaErrTbl9000InCtx methodIn) throws Exception {

    // **  Routine will move input error codes to appropriate
    // **  locations in the fma-entry-table.
    // **  associated copylibs are vydeffma and vyfmatma
    // **
    // Added variable to get the program context in place.
    Bbhsr002Ctx programCtx = methodIn.getBbhsr002Ctx();
    // Added variable to get the output context in place.
    SetFmaErrTbl9000OutCtx methodOut = methodIn.getSetFmaErrTbl9000OutCtx();
    //  cobolCode::COMPUTE FMA-ENTRY-TABLE-OCCURS = FUNCTION~LENGTH FMA-ENTRY-TABLE /
    // FUNCTION~LENGTH FMA-ENTRY
    methodOut.setFmaEntryTableOccurs(
        (short) (FmaEntryTable.getFmaEntryTableFieldLength() / FmaEntry.getFmaEntryFieldLength()));
    //  cobolCode::SET FMA-NOT-DONE TO TRUE
    methodOut.setFmaNotDoneTrue();

    //  cobolCode::PERFORM VARYING FMA-SUBSCRIPT FROM 1 BY 1 UNTIL FMA-DONE OR FMA-SUBSCRIPT GREATER
    // FMA-ENTRY-TABLE-OCCURS
    for (methodOut.setFmaSubscript(1);
        (!(methodOut.isFmaDone())
            && (methodOut.getFmaSubscript() <= methodOut.getFmaEntryTableOccurs()));
        methodOut.setFmaSubscript(methodOut.getFmaSubscript() + 1)) {

      // **  Find first empty entry, move in info and turn on switch
      // **  to stop loop.
      //  cobolCode::IF FMA-ERR-CODE-1 ( FMA-SUBSCRIPT ) EQUAL ZEROES
      if ((methodOut.getFmaErrCode1(methodOut.getFmaSubscript() - 1) == 0)) {
        //  cobolCode::SET FMA-DONE TO TRUE
        methodOut.setFmaDoneTrue();

        //  cobolCode::MOVE FMA-IP-ERR-CODE-1 TO FMA-ERR-CODE-1 ( FMA-SUBSCRIPT )
        methodOut.setFmaErrCode1(methodOut.getFmaSubscript() - 1, methodOut.getFmaIpErrCode1());
        //  cobolCode::MOVE FMA-IP-TYPE-1 TO FMA-TYPE-1 ( FMA-SUBSCRIPT )
        methodOut.setFmaType1(methodOut.getFmaSubscript() - 1, methodOut.getFmaIpType1());
        //  cobolCode::MOVE FMA-IP-TYPE-NUMERIC-1 TO FMA-TYPE-NUMERIC-1 ( FMA-SUBSCRIPT )
        methodOut.setFmaTypeNumeric1(
            methodOut.getFmaSubscript() - 1, methodOut.getFmaIpTypeNumeric1());
        //  cobolCode::MOVE FMA-IP-TYPE-DOLLARS-1 TO FMA-TYPE-DOLLARS-1 ( FMA-SUBSCRIPT )
        methodOut.setFmaTypeDollars1(
            methodOut.getFmaSubscript() - 1, methodOut.getFmaIpTypeDollars1());
        //  cobolCode::MOVE FMA-IP-TYPE-ALPHA-1 TO FMA-TYPE-ALPHA-1 ( FMA-SUBSCRIPT )
        methodOut.setFmaTypeAlpha1(methodOut.getFmaSubscript() - 1, methodOut.getFmaIpTypeAlpha1());
        //  cobolCode::MOVE FMA-IP-ERR-CODE-2 TO FMA-ERR-CODE-2 ( FMA-SUBSCRIPT )
        methodOut.setFmaErrCode2(methodOut.getFmaSubscript() - 1, methodOut.getFmaIpErrCode2());

        // **  Move second error code occurances
        //  cobolCode::MOVE FMA-IP-TYPE-2 TO FMA-TYPE-2 ( FMA-SUBSCRIPT )
        methodOut.setFmaType2(methodOut.getFmaSubscript() - 1, methodOut.getFmaIpType2());
        //  cobolCode::MOVE FMA-IP-TYPE-NUMERIC-2 TO FMA-TYPE-NUMERIC-2 ( FMA-SUBSCRIPT )
        methodOut.setFmaTypeNumeric2(
            methodOut.getFmaSubscript() - 1, methodOut.getFmaIpTypeNumeric2());
        //  cobolCode::MOVE FMA-IP-TYPE-DOLLARS-2 TO FMA-TYPE-DOLLARS-2 ( FMA-SUBSCRIPT )
        methodOut.setFmaTypeDollars2(
            methodOut.getFmaSubscript() - 1, methodOut.getFmaIpTypeDollars2());
        //  cobolCode::MOVE FMA-IP-TYPE-ALPHA-2 TO FMA-TYPE-ALPHA-2 ( FMA-SUBSCRIPT )
        methodOut.setFmaTypeAlpha2(methodOut.getFmaSubscript() - 1, methodOut.getFmaIpTypeAlpha2());
      }

      // *        If fma-ip-err-code-1 =
      // *                  fma-err-code-1 (fma-subscript)
      // *            set fma-done to true
      // *        end-if
      //  cobolCode::IF FMA-IP-ENTRY = FMA-ENTRY ( FMA-SUBSCRIPT )
      if (compareChars(
              methodIn.getFmaIpEntry(), methodIn.getFmaEntry(methodOut.getFmaSubscript() - 1))
          == 0) {
        //  cobolCode::SET FMA-DONE TO TRUE
        methodOut.setFmaDoneTrue();
      }
    }

    return methodOut;
  }
  /**
   * acquireDataArea9961 This method is derived from COBOL Paragraph - ACQUIRE-DATA-AREA-9961
   * SECTION COBOL Cyclomatic complexity - 1 Input : None
   *
   * <p>Output : None
   *
   * @throws CFException
   */
  @Override
  public void acquireDataArea9961(AcquireDataArea9961InCtx methodIn) throws Exception {

    // *****************************************************************
    // *  This section calls getmain function in cics to aquire the    *
    // *  memory required for running transaction.                     *
    // *****************************************************************

    // *EXEC CICS GETMAIN
    // *          SET     (ADDRESS OF ADA-ACQ-DATA-AREA)
    // *          FLENGTH (WV-ADA-FLENGTH)
    // *          INITIMG (WV-LOW-VALUES)
    // *END-EXEC.
    // Added variable to get the program context in place.
    Bbhsr002Ctx programCtx = methodIn.getBbhsr002Ctx();
    //  cobolCode::GETMAIN SET (ADDRESS OF ADA-ACQ-DATA-AREA) FLENGTH (WV-ADA-FLENGTH) INITIMG
    // (WV-LOW-VALUES)
    // getmain
    methodIn
        .getAdaAcqDataAreaGroup()
        .set(
            getObject(
                TransactionManager.getMain(
                    programCtx.getCicsSession(), methodIn.getWvAdaFlength(), false)));
  }
  /**
   * freeDataArea9962 This method is derived from COBOL Paragraph - FREE-DATA-AREA-9962 SECTION
   * COBOL Cyclomatic complexity - 2 Input :
   *
   * <p>- adaAcqDataArea COBOL Name: ADA-ACQ-DATA-AREA
   *
   * <p>Output : None
   *
   * @throws CFException
   */
  @Override
  public void freeDataArea9962(FreeDataArea9962InCtx methodIn) throws Exception {

    // *****************************************************************
    // *30  Release    name            description                     *
    // *30  rel1003    rajesh s        hpsd <78,716> - new copybook    *
    // *****************************************************************
    // *** vyadafre - this is 1 of 3 copybooks that are interdependant.*
    // ***                                                             *
    // ***        1 - working storage copybook    "vyadaws2"           *
    // ***        2 - linkage section copybook    "vyadals1"           *
    // ***        3 - procedure division copybook "vyadafre"           *
    // ***                                                             *
    // *** contains section that is performed to release main          *
    // *** storage area using above the 16mb line storage.             *
    // ****************************************************************
    // *  this section calls freemain function in cics to release the *
    // *  memory aquired for running the transaction.                 *
    // ****************************************************************
    // Added variable to get the program context in place.
    Bbhsr002Ctx programCtx = methodIn.getBbhsr002Ctx();
    //  cobolCode::IF ADDRESS OF ADA-ACQ-DATA-AREA NOT = NULLS
    //  LITERAL_NULLS = NULLS
    if (compareChars(methodIn.getAdaAcqDataArea(), CONSTANTS.LITERAL_NULLS) != 0) {
      //  cobolCode::FREEMAIN DATA (ADA-ACQ-DATA-AREA)
      // freemain
      TransactionManager.freeMain(programCtx.getCicsSession(), methodIn.getAdaAcqDataAreaGroup());
    }
  }

  public int call(ProgramContext ctx, Object[] params) throws Exception {
    Bbhsr002Ctx programCtx = (Bbhsr002Ctx) ctx;

    int len = params.length;
    if (len > 1 && params[1] != null) programCtx.getDfhcommareaGroup().set((Field) params[1]);
    // invoke the process and return rc
    return process(programCtx);
  }

  public int call(ProgramContext ctx, Field... parameters) throws Exception {
    Bbhsr002Ctx programCtx = (Bbhsr002Ctx) ctx;
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
      }
    }
    return process(programCtx);
  }

  public void setFromD5427hpc(Bbhsr002Ctx programCtx, Object[] params) {
    int len = params.length;
    if (len > 0)
      if (params[0] instanceof Field)
        programCtx.getCicsSession().setString(((Field) params[0]).toCharArray());
      else programCtx.getCicsSession().setString((char[]) params[0]);
    if (len > 1)
      if (params[1] instanceof Field)
        programCtx.getDfhcommareaGroup().setString(((Field) params[1]).toCharArray());
      else programCtx.getDfhcommareaGroup().setString((char[]) params[1]);
    if (len > 2)
      if (params[2] instanceof Field)
        programCtx.getDsmCallArea().setString(((Field) params[2]).toCharArray());
      else programCtx.getDsmCallArea().setString((char[]) params[2]);
    if (len > 3)
      if (params[3] instanceof Field)
        programCtx.getHpcReqstRetArea().setString(((Field) params[3]).toCharArray());
      else programCtx.getHpcReqstRetArea().setString((char[]) params[3]);
  }

  public void setFromD5427pol(Bbhsr002Ctx programCtx, Object[] params) {
    int len = params.length;
    if (len > 0)
      if (params[0] instanceof Field)
        programCtx.getDsmCallArea().setString(((Field) params[0]).toCharArray());
      else programCtx.getDsmCallArea().setString((char[]) params[0]);
    if (len > 1)
      if (params[1] instanceof Field)
        programCtx.getDsmPolRequestBlock().setString(((Field) params[1]).toCharArray());
      else programCtx.getDsmPolRequestBlock().setString((char[]) params[1]);
    if (len > 2)
      if (params[2] instanceof Field)
        programCtx.getDsmPolRet1Block().setString(((Field) params[2]).toCharArray());
      else programCtx.getDsmPolRet1Block().setString((char[]) params[2]);
    if (len > 3)
      if (params[3] instanceof Field)
        programCtx.getDsmPolRet2Block().setString(((Field) params[3]).toCharArray());
      else programCtx.getDsmPolRet2Block().setString((char[]) params[3]);
    if (len > 4)
      if (params[4] instanceof Field)
        programCtx.getDsmPolRet3Block().setString(((Field) params[4]).toCharArray());
      else programCtx.getDsmPolRet3Block().setString((char[]) params[4]);
    if (len > 5)
      if (params[5] instanceof Field)
        programCtx.getDsmPolRet4Block().setString(((Field) params[5]).toCharArray());
      else programCtx.getDsmPolRet4Block().setString((char[]) params[5]);
    if (len > 6)
      if (params[6] instanceof Field)
        programCtx.getDsmPolRet5Block().setString(((Field) params[6]).toCharArray());
      else programCtx.getDsmPolRet5Block().setString((char[]) params[6]);
    if (len > 7)
      if (params[7] instanceof Field)
        programCtx.getDsmPolRet6Block().setString(((Field) params[7]).toCharArray());
      else programCtx.getDsmPolRet6Block().setString((char[]) params[7]);
    if (len > 8)
      if (params[8] instanceof Field)
        programCtx.getDsmPolRet7Block().setString(((Field) params[8]).toCharArray());
      else programCtx.getDsmPolRet7Block().setString((char[]) params[8]);
    if (len > 9)
      if (params[9] instanceof Field)
        programCtx.getDsmPolRet8Block().setString(((Field) params[9]).toCharArray());
      else programCtx.getDsmPolRet8Block().setString((char[]) params[9]);
  }

  public void setFromD5427bhi(Bbhsr002Ctx programCtx, Object[] params) {
    int len = params.length;
    if (len > 0)
      if (params[0] instanceof Field)
        programCtx.getCicsSession().setString(((Field) params[0]).toCharArray());
      else programCtx.getCicsSession().setString((char[]) params[0]);
    if (len > 1)
      if (params[1] instanceof Field)
        programCtx.getDfhcommareaGroup().setString(((Field) params[1]).toCharArray());
      else programCtx.getDfhcommareaGroup().setString((char[]) params[1]);
    if (len > 2)
      if (params[2] instanceof Field)
        programCtx.getDsmCallArea().setString(((Field) params[2]).toCharArray());
      else programCtx.getDsmCallArea().setString((char[]) params[2]);
    if (len > 3)
      if (params[3] instanceof Field)
        programCtx.getBhiReqRetArea().setString(((Field) params[3]).toCharArray());
      else programCtx.getBhiReqRetArea().setString((char[]) params[3]);
    if (len > 4)
      if (params[4] instanceof Field)
        programCtx.getBhiDataArea().setString(((Field) params[4]).toCharArray());
      else programCtx.getBhiDataArea().setString((char[]) params[4]);
  }

  public void setFromD5427scn(Bbhsr002Ctx programCtx, Object[] params) {
    int len = params.length;
    if (len > 0)
      if (params[0] instanceof Field)
        programCtx.getCicsSession().setString(((Field) params[0]).toCharArray());
      else programCtx.getCicsSession().setString((char[]) params[0]);
    if (len > 1)
      if (params[1] instanceof Field)
        programCtx.getDfhcommareaGroup().setString(((Field) params[1]).toCharArray());
      else programCtx.getDfhcommareaGroup().setString((char[]) params[1]);
    if (len > 2)
      if (params[2] instanceof Field)
        programCtx.getDsmCallArea().setString(((Field) params[2]).toCharArray());
      else programCtx.getDsmCallArea().setString((char[]) params[2]);
    if (len > 3)
      if (params[3] instanceof Field)
        programCtx.getScnReqstRetArea().setString(((Field) params[3]).toCharArray());
      else programCtx.getScnReqstRetArea().setString((char[]) params[3]);
  }

  public void setFromD5427tli(Bbhsr002Ctx programCtx, Object[] params) {
    int len = params.length;
    if (len > 0)
      if (params[0] instanceof Field)
        programCtx.getDsmCallArea().setString(((Field) params[0]).toCharArray());
      else programCtx.getDsmCallArea().setString((char[]) params[0]);
    if (len > 1)
      if (params[1] instanceof Field)
        programCtx.getTliReqRetArea().setString(((Field) params[1]).toCharArray());
      else programCtx.getTliReqRetArea().setString((char[]) params[1]);
  }
}
  /*
   *00***************************************************************
   *00    licensed materials - property of united health group      *
   *00                                                              *
   *00 s m e   r e v i e w e d - comments have been reviewed by sme *
   *00                                                              *
   *00***************************************************************
   *10***************************************************************
   *10  program name       :  bbhsr002.                             *
   *10  business function  :  business service broker module to read*
   *10                        the bhi table.                        *
   *10  programmed by      :  marina myaskovsky.                    *
   *10  date coded         :  rel m5-23.                            *
   *10  type               :  online                                *
   *10***************************************************************
   *20***************************************************************
   *20  major program process:                                      *
   *20                                                              *
   *20  this broker module will query the benfit hipaa service codes*
   *20  from the hipaa proc code table and then reads the bhi table.*
   *20                                                              *
   *20***************************************************************
   *30***************************************************************
   *30  program change log:                                         *
   *30                                                              *
   *30  release  sprf    pgmer     comments                         *
   *30  -------  ------  --------  -------------------------------  *
   *30  relq410  #33120  varshi    initial version.                 *
   *30  relq410  #33120  varshi    fix for qc # 5426                *
   *30                             added review comments            *
   *30  relq410  #33120  varshi    fix for qc # 5543                *
   *30                             returning proc dates             *
   *30  relq410  #33120  varshi    fix for qc # 5595                *
   *30                             fix increment logic for bhi count*
   *30  relq410  #33120  varshi    fix for qc # 6381 - hipaa code   *
   *30                             is not returning                 *
   *30  relq410  #33120  jalaj     maureen's comments               *
   *30  relq410  #33120  varshi    fix for qc # 6950 - moving zeros *
   *30                             to ws-bhi-cnt                    *
   *30  relq410  #33120  varshi    incorporating review comments    *
   *30  relq410  #33120  varshi    fix for qc # 10525 - to handle   *
   *30                             invalid hipaa codes (not in 5010)*
   *30  relq410  #33120  sreeja    fix for qc # 11741 - to pass the *
   *30                             hipaa version nbr to d5427bhi    *
   *30  relq410  #33120  sreeja    fix for qc # 10525 to set the    *
   *30                   madhavan  foundation return/exp codes for  *
   *30                             invalid hipaa code               *
   *30  rel11q2  #105768 kushal s  hpsd no # 105768                 *
   *30                             fix for storage violation due to *
   *30                             foundation-message-area overlay  *
   *30 07/12/11  hpsm    m trzaska hpsm ticket pm10014705           *
   *30                             regen for prod fix requiring mod *
   *30                             to d5427pol and vypolrt4.        *
   *30 06/11/12  wo52524 m trzaska work order 52524 - added logic   *
   *30                             to handle version no on request  *
   *30                             to bn3 to provide specific hipaa *
   *30                             code groupings to consuming app. *
   *30 relq114   #60541 pravesh k. sprf 4-60541,remediation of 271  *
   *30                             -added new interface copybook i.e.
   *30                              vypolrt9 for d5427pol processing*
   *30 relq114   #60541 pravesh k. alm- 2838, use interface copybook*
   *30                              vypolrt8 instead of vypolrt9    *
   *30 relq114   #58724 pravesh k. alm- 3064, sprf - 58724 added new*
   *30                              interface copybook vypolrt7     *
   *30 relq315   #69709 m.myaskovsky designated virtual clinic      *
   *30                              network.                        *
   *30 relq116   #68160 m.myaskovsky urgent care place of service   *
   *30                              prj-45311                       *
   *30 relq416 prj58434 mcgarry     allow2  occurences for 'af'     *
   *30                                with srvc-cd 91000, 92507     *
   *30 relq416 prj58434 mcgarry     alm #2556 - correct slotting    *
   *30                            - logic from initial release is   *
   *30                              replaced with this defect fix.  *
   *30                              some initial release statements *
   *30                              are removed to avoid confusion. *
   *30 rel1701 prj58434 mcgarry prj58434 cr084732                   *
   *30                          - for hipaa-cd 'af' -               *
   *30                          populate hipaa-cd-mod for 'st'/'ci' *
   *30                          when either 91000 or 92507 exists   *
   *30 emer1701 prj58434 mcgarry    - inc1977817 -                  *
   *30                              omit return of af/ci data       *
   *30                              unless caller is v5427bn7       *
   *30 rel17q3 prj112969 gandharvi - prj112969 admin simp - 270/271 *
   *30                   tandon      data quality discrepancies     *
   *30                                                              *
   *30 rel1906          manikanta    mdtr-2019-0507-1a-tops to use  *
   *30                  srikakulapu  d5427scn for performance       *
   *30                               benefits of srvc_cd_trans_tbl  *
   *30                               loaded into memory.            *
   *30 rel1907          manikanta    mdtr-2019-0514-1a-tops to use  *
   *30                  srikakulapu  d5427hpc for performance       *
   *30                  & ramcharan  benefits of hipaa_proc_cd      *
   *30                               loaded into memory.            *
   *30 rel1909          ramcharan    mdtr-2019-0706-1a-tops to use  *
   *30                  & manikanta  d5427bhi for performance       *
   *30                  srikakulapu  benefits of ben_hipaa_srvc     *
   *30                               loaded into memory.            *
   *30 rel20m9          marina       prj207393 adding svi tables    *
   *30                  myaskovsky   to slot hipaa codes bhi entries*
   *30 rel20m10         marina       prj207393 adding svi-d - svi-f *
   *30                  myaskovsky   to slot hipaa codes bhi entries*
   *30                                                              *
   *30 rel21m07         venu yadav   prb0995432-adding exception    *
   *30                               error code,when record not     *
   *30                               found in policy master table   *
   *30                               (pol_pln_mstr)                 *
   *30 2022-07-26 - marina       - m09-22 prj287759 transparency 500*
   *30              myaskovsky     shoppable services - coins price *
   *30                             transpcy tool (cptt)             *
   *30 2022-12-20 - marina       - m01-23 prj287759 transparency 500*
   *30              myaskovsky     shoppable services - added three *
   *30                             more bhi tables                  *
   *30 2023-04-03 - marina       - m08-23 prj287759 transparency    *
   *30              myaskovsky     tool (cptt)  - clone of bbhsr001 *
   *30 2023-08-25 - marina            - prj287759 transparency -    *
   *30              myaskovsky     changed occur for ws-pos-net-info*
   *30 2023-10-11 - marina            - prj287759 transparency -    *
   *30              myaskovsky     changed to send a cont for wrong *
   *30              myaskovsky     hipaa code                       *
   *30***************************************************************
   *40***************************************************************
   *40  external called programs:                                   *
   *40                                                              *
   *40  name          description              call/link/xctl/start *
   *40  ----          -----------              -------------------- *
   *40  d5427hpc     dsm to get hipaa codes    call                 *
   *40  d5427pol     dsm to get policy data    call                 *
   *40  d5427bhi     dsm to get bhi data       call                 *
   *40  d5427tli     dsm to get tli slot id    call                 *
   *40  d5427scn     dsm to get service code   call                 *
   *40               number                    call                 *
   *40                                                              *
   *40***************************************************************
   *50***************************************************************
   *50  return codes:                                               *
   *50                                                              *
   *50  code                 description                            *
   *50  ---------------      ------------------------------------   *
   *50  1                 address pointer req-address-1-ptr is nulls*
   *50  2 to 8, 11        invalid parms                             *
   *50  9                 d5427hpc dsm error                        *
   *50  10                d5427pol dsm error                        *
   *50  12                d5427bhi dsm error                        *
   *50  13                d5427scn dsm error                        *
   *50  14                d5427tli dsm error                        *
   *50  15                invalid hipaa code                        *
   *50                                                              *
   *50***************************************************************
   *60***************************************************************
   *60  database used:                                              *
   *60                                                              *
   *60  database                    description                     *
   *60  ---------                   ------------                    *
   *70   n/a                          n/a                           *
   *60***************************************************************
   *70***************************************************************
   *70  tables and access types:                                    *
   *70                                                              *
   *70  name                          type           access         *
   *70  --------------                ----           -------        *
   *70   n/a                          n/a                           *
   *70***************************************************************
   */
