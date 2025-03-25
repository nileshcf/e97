package com.cloudframe.app.business;

import com.cloudframe.app.data.Field;
import com.cloudframe.app.dto.ProgramContext;
import com.cloudframe.app.dto.d5427bhi.D5427bhiCtx;
import com.cloudframe.app.dto.d5427bhi.D5427bhiCtx.AddRecordInCtx;
import com.cloudframe.app.dto.d5427bhi.D5427bhiCtx.AddRecordOutCtx;
import com.cloudframe.app.dto.d5427bhi.D5427bhiCtx.BhiCloseCursorInCtx;
import com.cloudframe.app.dto.d5427bhi.D5427bhiCtx.BhiCloseCursorOutCtx;
import com.cloudframe.app.dto.d5427bhi.D5427bhiCtx.BhiFetchCursorInCtx;
import com.cloudframe.app.dto.d5427bhi.D5427bhiCtx.BhiFetchCursorOutCtx;
import com.cloudframe.app.dto.d5427bhi.D5427bhiCtx.BhiOpenCursorInCtx;
import com.cloudframe.app.dto.d5427bhi.D5427bhiCtx.BhiOpenCursorOutCtx;
import com.cloudframe.app.dto.d5427bhi.D5427bhiCtx.CheckAfInCtx;
import com.cloudframe.app.dto.d5427bhi.D5427bhiCtx.CheckAfOutCtx;
import com.cloudframe.app.dto.d5427bhi.D5427bhiCtx.CheckDuplicateRowInCtx;
import com.cloudframe.app.dto.d5427bhi.D5427bhiCtx.CheckDuplicateRowOutCtx;
import com.cloudframe.app.dto.d5427bhi.D5427bhiCtx.CheckNetIdConflictInCtx;
import com.cloudframe.app.dto.d5427bhi.D5427bhiCtx.CheckNetIdConflictOutCtx;
import com.cloudframe.app.dto.d5427bhi.D5427bhiCtx.CheckOverlapDatesInCtx;
import com.cloudframe.app.dto.d5427bhi.D5427bhiCtx.CheckOverlapDatesOutCtx;
import com.cloudframe.app.dto.d5427bhi.D5427bhiCtx.CloseCsrAllInCtx;
import com.cloudframe.app.dto.d5427bhi.D5427bhiCtx.CloseCsrAllOutCtx;
import com.cloudframe.app.dto.d5427bhi.D5427bhiCtx.CloseCsrSlotTblInCtx;
import com.cloudframe.app.dto.d5427bhi.D5427bhiCtx.CloseCsrSlotTblOutCtx;
import com.cloudframe.app.dto.d5427bhi.D5427bhiCtx.Continue5350InCtx;
import com.cloudframe.app.dto.d5427bhi.D5427bhiCtx.Continue5350OutCtx;
import com.cloudframe.app.dto.d5427bhi.D5427bhiCtx.DetermineStartingRowInCtx;
import com.cloudframe.app.dto.d5427bhi.D5427bhiCtx.DetermineStartingRowOutCtx;
import com.cloudframe.app.dto.d5427bhi.D5427bhiCtx.FetchCsrSlotTblData4200AInCtx;
import com.cloudframe.app.dto.d5427bhi.D5427bhiCtx.FetchCsrSlotTblData4200AOutCtx;
import com.cloudframe.app.dto.d5427bhi.D5427bhiCtx.FetchCsrSlotTblDataInCtx;
import com.cloudframe.app.dto.d5427bhi.D5427bhiCtx.FetchCsrSlotTblDataOutCtx;
import com.cloudframe.app.dto.d5427bhi.D5427bhiCtx.FetchCursorAllData4600AInCtx;
import com.cloudframe.app.dto.d5427bhi.D5427bhiCtx.FetchCursorAllData4600AOutCtx;
import com.cloudframe.app.dto.d5427bhi.D5427bhiCtx.FetchCursorAllDataInCtx;
import com.cloudframe.app.dto.d5427bhi.D5427bhiCtx.FetchCursorAllDataOutCtx;
import com.cloudframe.app.dto.d5427bhi.D5427bhiCtx.GetBhiRecordInCtx;
import com.cloudframe.app.dto.d5427bhi.D5427bhiCtx.GetBhiRecordOutCtx;
import com.cloudframe.app.dto.d5427bhi.D5427bhiCtx.InactivateRecordInCtx;
import com.cloudframe.app.dto.d5427bhi.D5427bhiCtx.InactivateRecordOutCtx;
import com.cloudframe.app.dto.d5427bhi.D5427bhiCtx.InitializeInCtx;
import com.cloudframe.app.dto.d5427bhi.D5427bhiCtx.InitializeOutCtx;
import com.cloudframe.app.dto.d5427bhi.D5427bhiCtx.MainlineInCtx;
import com.cloudframe.app.dto.d5427bhi.D5427bhiCtx.MainlineOutCtx;
import com.cloudframe.app.dto.d5427bhi.D5427bhiCtx.MoveDataIntoTableInCtx;
import com.cloudframe.app.dto.d5427bhi.D5427bhiCtx.MoveDataIntoTableOutCtx;
import com.cloudframe.app.dto.d5427bhi.D5427bhiCtx.MoveReqToReturnInCtx;
import com.cloudframe.app.dto.d5427bhi.D5427bhiCtx.MoveReqToReturnOutCtx;
import com.cloudframe.app.dto.d5427bhi.D5427bhiCtx.MoveRowToDclgenInCtx;
import com.cloudframe.app.dto.d5427bhi.D5427bhiCtx.MoveRowToDclgenOutCtx;
import com.cloudframe.app.dto.d5427bhi.D5427bhiCtx.MovesForErrorLogInCtx;
import com.cloudframe.app.dto.d5427bhi.D5427bhiCtx.MovesForErrorLogOutCtx;
import com.cloudframe.app.dto.d5427bhi.D5427bhiCtx.OpenCsrAllInCtx;
import com.cloudframe.app.dto.d5427bhi.D5427bhiCtx.OpenCsrAllOutCtx;
import com.cloudframe.app.dto.d5427bhi.D5427bhiCtx.OpenCsrSlotTblInCtx;
import com.cloudframe.app.dto.d5427bhi.D5427bhiCtx.OpenCsrSlotTblOutCtx;
import com.cloudframe.app.dto.d5427bhi.D5427bhiCtx.PopulateReturnFields4800InCtx;
import com.cloudframe.app.dto.d5427bhi.D5427bhiCtx.PopulateReturnFields4800OutCtx;
import com.cloudframe.app.dto.d5427bhi.D5427bhiCtx.PopulateReturnFieldsInCtx;
import com.cloudframe.app.dto.d5427bhi.D5427bhiCtx.PopulateReturnFieldsOutCtx;
import com.cloudframe.app.dto.d5427bhi.D5427bhiCtx.ProcessScreenBrowseInCtx;
import com.cloudframe.app.dto.d5427bhi.D5427bhiCtx.ProcessScreenBrowseOutCtx;
import com.cloudframe.app.dto.d5427bhi.D5427bhiCtx.ProcessScreenRequestInCtx;
import com.cloudframe.app.dto.d5427bhi.D5427bhiCtx.ProcessScreenRequestOutCtx;
import com.cloudframe.app.dto.d5427bhi.D5427bhiCtx.ProcessScreenUpdateInCtx;
import com.cloudframe.app.dto.d5427bhi.D5427bhiCtx.ProcessScreenUpdateOutCtx;
import com.cloudframe.app.dto.d5427bhi.D5427bhiCtx.RequestFieldValidationInCtx;
import com.cloudframe.app.dto.d5427bhi.D5427bhiCtx.RequestFieldValidationOutCtx;
import com.cloudframe.app.dto.d5427bhi.D5427bhiCtx.SqlErrorProcessInCtx;
import com.cloudframe.app.dto.d5427bhi.D5427bhiCtx.SqlErrorProcessOutCtx;
import com.cloudframe.app.dto.d5427bhi.D5427bhiCtx.UpdateRecordInCtx;
import com.cloudframe.app.dto.d5427bhi.D5427bhiCtx.UpdateRecordOutCtx;
import com.cloudframe.app.dto.d5427bhi.D5427bhiCtx.ValidateHipaaSrvcCdInCtx;
import com.cloudframe.app.dto.d5427bhi.D5427bhiCtx.ValidateHipaaSrvcCdOutCtx;
import com.cloudframe.app.dto.d5427bhi.D5427bhiCtx.ValidateInactReqInCtx;
import com.cloudframe.app.dto.d5427bhi.D5427bhiCtx.ValidateInactReqOutCtx;
import com.cloudframe.app.dto.d5427bhi.D5427bhiCtx.ValidateReqFieldsInCtx;
import com.cloudframe.app.dto.d5427bhi.D5427bhiCtx.ValidateReqFieldsOutCtx;
import com.cloudframe.app.dto.d5427bhi.D5427bhiCtx.ValidateServiceCdInCtx;
import com.cloudframe.app.dto.d5427bhi.D5427bhiCtx.ValidateServiceCdOutCtx;
import com.cloudframe.app.dto.d5427bhi.D5427bhiCtx.ValidateTableIdInCtx;
import com.cloudframe.app.dto.d5427bhi.D5427bhiCtx.ValidateTableIdOutCtx;

public interface D5427bhi {
  /**
   * This method is derived from Cobol Paragraph -
   *
   * @return return code of program
   */
  public int setParameter(
      D5427bhiCtx programCtx, String parm, String parm2, String parm3, String parm4)
      throws Exception;

  /**
   * This method is derived from Cobol Paragraph - PROCESS
   *
   * @return Return Code of the this class
   */
  public int process(D5427bhiCtx programCtx) throws Exception;

  /**
   * This method is derived from Cobol Paragraph - 0000-MAINLINE SECTION
   *
   * @return
   */
  public MainlineOutCtx mainline(MainlineInCtx methodIn) throws Exception;

  /** This method is derived from Cobol Paragraph - 0000-EXIT */
  public void exit(D5427bhiCtx programCtx) throws Exception;

  /**
   * This method is derived from Cobol Paragraph - 1000-INITIALIZE SECTION
   *
   * @return
   */
  public InitializeOutCtx initialize(InitializeInCtx methodIn) throws Exception;

  /**
   * This method is derived from Cobol Paragraph - 1500-REQUEST-FIELD-VALIDATION SECTION
   *
   * @return
   */
  public RequestFieldValidationOutCtx requestFieldValidation(RequestFieldValidationInCtx methodIn)
      throws Exception;

  /**
   * This method is derived from Cobol Paragraph - 1600-VALIDATE-REQ-FIELDS SECTION
   *
   * @return
   */
  public ValidateReqFieldsOutCtx validateReqFields(ValidateReqFieldsInCtx methodIn)
      throws Exception;

  /**
   * This method is derived from Cobol Paragraph - 2000-GET-BHI-RECORD SECTION
   *
   * @return
   */
  public GetBhiRecordOutCtx getBhiRecord(GetBhiRecordInCtx methodIn) throws Exception;

  /**
   * This method is derived from Cobol Paragraph - 2100-BHI-OPEN-CURSOR SECTION
   *
   * @return
   */
  public BhiOpenCursorOutCtx bhiOpenCursor(BhiOpenCursorInCtx methodIn) throws Exception;

  /**
   * This method is derived from Cobol Paragraph - 2200-BHI-FETCH-CURSOR SECTION
   *
   * @return
   */
  public BhiFetchCursorOutCtx bhiFetchCursor(BhiFetchCursorInCtx methodIn) throws Exception;

  /**
   * This method is derived from Cobol Paragraph - 2300-BHI-CLOSE-CURSOR SECTION
   *
   * @return
   */
  public BhiCloseCursorOutCtx bhiCloseCursor(BhiCloseCursorInCtx methodIn) throws Exception;

  /**
   * This method is derived from Cobol Paragraph - 3000-PROCESS-SCREEN-REQUEST SECTION
   *
   * @return
   */
  public ProcessScreenRequestOutCtx processScreenRequest(ProcessScreenRequestInCtx methodIn)
      throws Exception;

  /**
   * This method is derived from Cobol Paragraph - 4000-PROCESS-SCREEN-BROWSE SECTION
   *
   * @return
   */
  public ProcessScreenBrowseOutCtx processScreenBrowse(ProcessScreenBrowseInCtx methodIn)
      throws Exception;

  /**
   * This method is derived from Cobol Paragraph - 4100-OPEN-CSR-SLOT-TBL SECTION
   *
   * @return
   */
  public OpenCsrSlotTblOutCtx openCsrSlotTbl(OpenCsrSlotTblInCtx methodIn) throws Exception;

  /**
   * This method is derived from Cobol Paragraph - 4200-FETCH-CSR-SLOT-TBL-DATA SECTION
   *
   * @return
   */
  public FetchCsrSlotTblDataOutCtx fetchCsrSlotTblData(FetchCsrSlotTblDataInCtx methodIn)
      throws Exception;

  /**
   * This method is derived from Cobol Paragraph - 4200A-FETCH-CSR-SLOT-TBL-DATA SECTION
   *
   * @return
   */
  public FetchCsrSlotTblData4200AOutCtx fetchCsrSlotTblData4200A(
      FetchCsrSlotTblData4200AInCtx methodIn) throws Exception;

  /**
   * This method is derived from Cobol Paragraph - 4300-POPULATE-RETURN-FIELDS SECTION
   *
   * @return
   */
  public PopulateReturnFieldsOutCtx populateReturnFields(PopulateReturnFieldsInCtx methodIn)
      throws Exception;

  /**
   * This method is derived from Cobol Paragraph - 4400-CLOSE-CSR-SLOT-TBL SECTION
   *
   * @return
   */
  public CloseCsrSlotTblOutCtx closeCsrSlotTbl(CloseCsrSlotTblInCtx methodIn) throws Exception;

  /**
   * This method is derived from Cobol Paragraph - 4500-OPEN-CSR-ALL SECTION
   *
   * @return
   */
  public OpenCsrAllOutCtx openCsrAll(OpenCsrAllInCtx methodIn) throws Exception;

  /**
   * This method is derived from Cobol Paragraph - 4600-FETCH-CURSOR-ALL-DATA SECTION
   *
   * @return
   */
  public FetchCursorAllDataOutCtx fetchCursorAllData(FetchCursorAllDataInCtx methodIn)
      throws Exception;

  /**
   * This method is derived from Cobol Paragraph - 4600A-FETCH-CURSOR-ALL-DATA SECTION
   *
   * @return
   */
  public FetchCursorAllData4600AOutCtx fetchCursorAllData4600A(
      FetchCursorAllData4600AInCtx methodIn) throws Exception;

  /**
   * This method is derived from Cobol Paragraph - 4700-MOVE-DATA-INTO-TABLE SECTION
   *
   * @return
   */
  public MoveDataIntoTableOutCtx moveDataIntoTable(MoveDataIntoTableInCtx methodIn)
      throws Exception;

  /**
   * This method is derived from Cobol Paragraph - 4750-DETERMINE-STARTING-ROW SECTION
   *
   * @return
   */
  public DetermineStartingRowOutCtx determineStartingRow(DetermineStartingRowInCtx methodIn)
      throws Exception;

  /**
   * This method is derived from Cobol Paragraph - 4800-POPULATE-RETURN-FIELDS SECTION
   *
   * @return
   */
  public PopulateReturnFields4800OutCtx populateReturnFields4800(
      PopulateReturnFields4800InCtx methodIn) throws Exception;

  /**
   * This method is derived from Cobol Paragraph - 4900-CLOSE-CSR-ALL SECTION
   *
   * @return
   */
  public CloseCsrAllOutCtx closeCsrAll(CloseCsrAllInCtx methodIn) throws Exception;

  /**
   * This method is derived from Cobol Paragraph - 5000-PROCESS-SCREEN-UPDATE SECTION
   *
   * @return
   */
  public ProcessScreenUpdateOutCtx processScreenUpdate(ProcessScreenUpdateInCtx methodIn)
      throws Exception;

  /**
   * This method is derived from Cobol Paragraph - 5100-VALIDATE-INACT-REQ SECTION
   *
   * @return
   */
  public ValidateInactReqOutCtx validateInactReq(ValidateInactReqInCtx methodIn) throws Exception;

  /**
   * This method is derived from Cobol Paragraph - 5200-INACTIVATE-RECORD SECTION
   *
   * @return
   */
  public InactivateRecordOutCtx inactivateRecord(InactivateRecordInCtx methodIn) throws Exception;

  /** This method is derived from Cobol Paragraph - 5300-VALIDATE-ADD-UPDATE-REQ SECTION */
  public void validateAddUpdateReq(D5427bhiCtx programCtx) throws Exception;

  /**
   * This method is derived from Cobol Paragraph - 5310-VALIDATE-TABLE-ID SECTION
   *
   * @return
   */
  public ValidateTableIdOutCtx validateTableId(ValidateTableIdInCtx methodIn) throws Exception;

  /**
   * This method is derived from Cobol Paragraph - 5320-VALIDATE-SERVICE-CD SECTION
   *
   * @return
   */
  public ValidateServiceCdOutCtx validateServiceCd(ValidateServiceCdInCtx methodIn)
      throws Exception;

  /**
   * This method is derived from Cobol Paragraph - 5330-VALIDATE-HIPAA-SRVC-CD SECTION
   *
   * @return
   */
  public ValidateHipaaSrvcCdOutCtx validateHipaaSrvcCd(ValidateHipaaSrvcCdInCtx methodIn)
      throws Exception;

  /**
   * This method is derived from Cobol Paragraph - 5340-CHECK-DUPLICATE-ROW SECTION
   *
   * @return
   */
  public CheckDuplicateRowOutCtx checkDuplicateRow(CheckDuplicateRowInCtx methodIn)
      throws Exception;

  /**
   * This method is derived from Cobol Paragraph - 5350-CHECK-OVERLAP-DATES SECTION
   *
   * @return
   */
  public CheckOverlapDatesOutCtx checkOverlapDates(CheckOverlapDatesInCtx methodIn)
      throws Exception;

  /**
   * This method is derived from Cobol Paragraph - 5350-CHECK-AF
   *
   * @return
   */
  public CheckAfOutCtx checkAf(CheckAfInCtx methodIn) throws Exception;

  /**
   * This method is derived from Cobol Paragraph - 5350-CONTINUE
   *
   * @return
   */
  public Continue5350OutCtx continue5350(Continue5350InCtx methodIn) throws Exception;

  /**
   * This method is derived from Cobol Paragraph - 5360-CHECK-NET-ID-CONFLICT SECTION
   *
   * @return
   */
  public CheckNetIdConflictOutCtx checkNetIdConflict(CheckNetIdConflictInCtx methodIn)
      throws Exception;

  /**
   * This method is derived from Cobol Paragraph - 5400-ADD-RECORD SECTION
   *
   * @return
   */
  public AddRecordOutCtx addRecord(AddRecordInCtx methodIn) throws Exception;

  /**
   * This method is derived from Cobol Paragraph - 5500-UPDATE-RECORD SECTION
   *
   * @return
   */
  public UpdateRecordOutCtx updateRecord(UpdateRecordInCtx methodIn) throws Exception;

  /**
   * This method is derived from Cobol Paragraph - 5800-MOVE-ROW-TO-DCLGEN SECTION
   *
   * @return
   */
  public MoveRowToDclgenOutCtx moveRowToDclgen(MoveRowToDclgenInCtx methodIn) throws Exception;

  /**
   * This method is derived from Cobol Paragraph - 5900-MOVE-REQ-TO-RETURN SECTION
   *
   * @return
   */
  public MoveReqToReturnOutCtx moveReqToReturn(MoveReqToReturnInCtx methodIn) throws Exception;

  /**
   * This method is derived from Cobol Paragraph - 7777-MOVES-FOR-ERROR-LOG SECTION
   *
   * @return
   */
  public MovesForErrorLogOutCtx movesForErrorLog(MovesForErrorLogInCtx methodIn) throws Exception;

  /**
   * This method is derived from Cobol Paragraph - 9999-SQL-ERROR-PROCESS SECTION
   *
   * @return
   */
  public SqlErrorProcessOutCtx sqlErrorProcess(SqlErrorProcessInCtx methodIn) throws Exception;

  /**
   * This will invoke the program given parameters from the caller program.
   *
   * @return return code of the program
   */
  public int call(ProgramContext programCtx, Object[] parameters) throws Exception;

  /**
   * This will invoke the program given Field parameters from the caller program.
   *
   * @return return code of the program
   */
  public int call(ProgramContext programCtx, Field... parameters) throws Exception;
}
