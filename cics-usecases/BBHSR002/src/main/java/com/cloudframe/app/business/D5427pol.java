package com.cloudframe.app.business;

import com.cloudframe.app.data.Field;
import com.cloudframe.app.dto.ProgramContext;
import com.cloudframe.app.dto.d5427pol.D5427polCtx;
import com.cloudframe.app.dto.d5427pol.D5427polCtx.CloseCursorInCtx;
import com.cloudframe.app.dto.d5427pol.D5427polCtx.CloseCursorOutCtx;
import com.cloudframe.app.dto.d5427pol.D5427polCtx.CloseFamCursorInCtx;
import com.cloudframe.app.dto.d5427pol.D5427polCtx.CloseFamCursorOutCtx;
import com.cloudframe.app.dto.d5427pol.D5427polCtx.CloseIndvCursorInCtx;
import com.cloudframe.app.dto.d5427pol.D5427polCtx.CloseIndvCursorOutCtx;
import com.cloudframe.app.dto.d5427pol.D5427polCtx.CloseOopCopayCursorInCtx;
import com.cloudframe.app.dto.d5427pol.D5427polCtx.CloseOopCopayCursorOutCtx;
import com.cloudframe.app.dto.d5427pol.D5427polCtx.ClosePolbenlvlCursorInCtx;
import com.cloudframe.app.dto.d5427pol.D5427polCtx.ClosePolbenlvlCursorOutCtx;
import com.cloudframe.app.dto.d5427pol.D5427polCtx.ClosePolfamdedCursorInCtx;
import com.cloudframe.app.dto.d5427pol.D5427polCtx.ClosePolfamdedCursorOutCtx;
import com.cloudframe.app.dto.d5427pol.D5427polCtx.ClosePolinddedCursorInCtx;
import com.cloudframe.app.dto.d5427pol.D5427polCtx.ClosePolinddedCursorOutCtx;
import com.cloudframe.app.dto.d5427pol.D5427polCtx.CloseTherapyCursorInCtx;
import com.cloudframe.app.dto.d5427pol.D5427polCtx.CloseTherapyCursorOutCtx;
import com.cloudframe.app.dto.d5427pol.D5427polCtx.DerivePlanReferralInCtx;
import com.cloudframe.app.dto.d5427pol.D5427polCtx.DerivePlanReferralOutCtx;
import com.cloudframe.app.dto.d5427pol.D5427polCtx.FetchCursorInCtx;
import com.cloudframe.app.dto.d5427pol.D5427polCtx.FetchCursorOutCtx;
import com.cloudframe.app.dto.d5427pol.D5427polCtx.FetchFamCursorInCtx;
import com.cloudframe.app.dto.d5427pol.D5427polCtx.FetchFamCursorOutCtx;
import com.cloudframe.app.dto.d5427pol.D5427polCtx.FetchIndvCursorInCtx;
import com.cloudframe.app.dto.d5427pol.D5427polCtx.FetchIndvCursorOutCtx;
import com.cloudframe.app.dto.d5427pol.D5427polCtx.FetchOopCopayCursorInCtx;
import com.cloudframe.app.dto.d5427pol.D5427polCtx.FetchOopCopayCursorOutCtx;
import com.cloudframe.app.dto.d5427pol.D5427polCtx.FetchPolbenlvlCursorInCtx;
import com.cloudframe.app.dto.d5427pol.D5427polCtx.FetchPolbenlvlCursorOutCtx;
import com.cloudframe.app.dto.d5427pol.D5427polCtx.FetchPolfamdedCursorInCtx;
import com.cloudframe.app.dto.d5427pol.D5427polCtx.FetchPolfamdedCursorOutCtx;
import com.cloudframe.app.dto.d5427pol.D5427polCtx.FetchPolinddedCursorInCtx;
import com.cloudframe.app.dto.d5427pol.D5427polCtx.FetchPolinddedCursorOutCtx;
import com.cloudframe.app.dto.d5427pol.D5427polCtx.FetchTherapyCursorInCtx;
import com.cloudframe.app.dto.d5427pol.D5427polCtx.FetchTherapyCursorOutCtx;
import com.cloudframe.app.dto.d5427pol.D5427polCtx.FunCd2PolplnXrefInCtx;
import com.cloudframe.app.dto.d5427pol.D5427polCtx.FunCd2PolplnXrefOutCtx;
import com.cloudframe.app.dto.d5427pol.D5427polCtx.FunCd5PolhdrTherReadInCtx;
import com.cloudframe.app.dto.d5427pol.D5427polCtx.FunCd5PolhdrTherReadOutCtx;
import com.cloudframe.app.dto.d5427pol.D5427polCtx.FunCd8PolplnXrefInCtx;
import com.cloudframe.app.dto.d5427pol.D5427polCtx.FunCd8PolplnXrefOutCtx;
import com.cloudframe.app.dto.d5427pol.D5427polCtx.FunCd9PolPhytherReadInCtx;
import com.cloudframe.app.dto.d5427pol.D5427polCtx.FunCd9PolPhytherReadOutCtx;
import com.cloudframe.app.dto.d5427pol.D5427polCtx.FuncCd10MmiReadInCtx;
import com.cloudframe.app.dto.d5427pol.D5427polCtx.FuncCd10MmiReadOutCtx;
import com.cloudframe.app.dto.d5427pol.D5427polCtx.FuncCd10MxiReadInCtx;
import com.cloudframe.app.dto.d5427pol.D5427polCtx.FuncCd10MxiReadOutCtx;
import com.cloudframe.app.dto.d5427pol.D5427polCtx.FuncCd11ReadMxiInCtx;
import com.cloudframe.app.dto.d5427pol.D5427polCtx.FuncCd11ReadMxiOutCtx;
import com.cloudframe.app.dto.d5427pol.D5427polCtx.FuncCd1PolplnMxiReadInCtx;
import com.cloudframe.app.dto.d5427pol.D5427polCtx.FuncCd1PolplnMxiReadOutCtx;
import com.cloudframe.app.dto.d5427pol.D5427polCtx.FuncCd2GetMmiInCtx;
import com.cloudframe.app.dto.d5427pol.D5427polCtx.FuncCd2GetMmiOutCtx;
import com.cloudframe.app.dto.d5427pol.D5427polCtx.FuncCd3MxiReadInCtx;
import com.cloudframe.app.dto.d5427pol.D5427polCtx.FuncCd3MxiReadOutCtx;
import com.cloudframe.app.dto.d5427pol.D5427polCtx.FuncCd3PolhdrMmiReadInCtx;
import com.cloudframe.app.dto.d5427pol.D5427polCtx.FuncCd3PolhdrMmiReadOutCtx;
import com.cloudframe.app.dto.d5427pol.D5427polCtx.FuncCd3PolsviMmiReadInCtx;
import com.cloudframe.app.dto.d5427pol.D5427polCtx.FuncCd3PolsviMmiReadOutCtx;
import com.cloudframe.app.dto.d5427pol.D5427polCtx.FuncCd4MxiReadInCtx;
import com.cloudframe.app.dto.d5427pol.D5427polCtx.FuncCd4MxiReadOutCtx;
import com.cloudframe.app.dto.d5427pol.D5427polCtx.FuncCd4OopCopayRetInCtx;
import com.cloudframe.app.dto.d5427pol.D5427polCtx.FuncCd4OopCopayRetOutCtx;
import com.cloudframe.app.dto.d5427pol.D5427polCtx.FuncCd4PolbenlvlReadInCtx;
import com.cloudframe.app.dto.d5427pol.D5427polCtx.FuncCd4PolbenlvlReadOutCtx;
import com.cloudframe.app.dto.d5427pol.D5427polCtx.FuncCd4PolfamdedReadInCtx;
import com.cloudframe.app.dto.d5427pol.D5427polCtx.FuncCd4PolfamdedReadOutCtx;
import com.cloudframe.app.dto.d5427pol.D5427polCtx.FuncCd4PolhdrReadInCtx;
import com.cloudframe.app.dto.d5427pol.D5427polCtx.FuncCd4PolhdrReadOutCtx;
import com.cloudframe.app.dto.d5427pol.D5427polCtx.FuncCd4PolindvdedReadInCtx;
import com.cloudframe.app.dto.d5427pol.D5427polCtx.FuncCd4PolindvdedReadOutCtx;
import com.cloudframe.app.dto.d5427pol.D5427polCtx.FuncCd4PopulateRetSplit2InCtx;
import com.cloudframe.app.dto.d5427pol.D5427polCtx.FuncCd4PopulateRetSplit2OutCtx;
import com.cloudframe.app.dto.d5427pol.D5427polCtx.FuncCd4PopulateRetSplit3InCtx;
import com.cloudframe.app.dto.d5427pol.D5427polCtx.FuncCd4PopulateRetSplit3OutCtx;
import com.cloudframe.app.dto.d5427pol.D5427polCtx.FuncCd4PopulateRetSplit4InCtx;
import com.cloudframe.app.dto.d5427pol.D5427polCtx.FuncCd4PopulateRetSplit4OutCtx;
import com.cloudframe.app.dto.d5427pol.D5427polCtx.FuncCd6ReadFamInCtx;
import com.cloudframe.app.dto.d5427pol.D5427polCtx.FuncCd6ReadFamOutCtx;
import com.cloudframe.app.dto.d5427pol.D5427polCtx.FuncCd6ReadIndInCtx;
import com.cloudframe.app.dto.d5427pol.D5427polCtx.FuncCd6ReadIndOutCtx;
import com.cloudframe.app.dto.d5427pol.D5427polCtx.FuncCd6ReadMmiInCtx;
import com.cloudframe.app.dto.d5427pol.D5427polCtx.FuncCd6ReadMmiOutCtx;
import com.cloudframe.app.dto.d5427pol.D5427polCtx.FuncCd6ReadMxiInCtx;
import com.cloudframe.app.dto.d5427pol.D5427polCtx.FuncCd6ReadMxiOutCtx;
import com.cloudframe.app.dto.d5427pol.D5427polCtx.FuncCd7SearchPolInCtx;
import com.cloudframe.app.dto.d5427pol.D5427polCtx.FuncCd7SearchPolOutCtx;
import com.cloudframe.app.dto.d5427pol.D5427polCtx.FuncCd8GetMmiInCtx;
import com.cloudframe.app.dto.d5427pol.D5427polCtx.FuncCd8GetMmiOutCtx;
import com.cloudframe.app.dto.d5427pol.D5427polCtx.GetMmiRecordInCtx;
import com.cloudframe.app.dto.d5427pol.D5427polCtx.GetMmiRecordOutCtx;
import com.cloudframe.app.dto.d5427pol.D5427polCtx.GetStdMmiDataInCtx;
import com.cloudframe.app.dto.d5427pol.D5427polCtx.GetStdMmiDataOutCtx;
import com.cloudframe.app.dto.d5427pol.D5427polCtx.GetStdMxiDataInCtx;
import com.cloudframe.app.dto.d5427pol.D5427polCtx.GetStdMxiDataOutCtx;
import com.cloudframe.app.dto.d5427pol.D5427polCtx.GetStdMxiLatestSectInCtx;
import com.cloudframe.app.dto.d5427pol.D5427polCtx.GetStdMxiLatestSectOutCtx;
import com.cloudframe.app.dto.d5427pol.D5427polCtx.InitializeInCtx;
import com.cloudframe.app.dto.d5427pol.D5427polCtx.InitializeOutCtx;
import com.cloudframe.app.dto.d5427pol.D5427polCtx.MainlineInCtx;
import com.cloudframe.app.dto.d5427pol.D5427polCtx.MainlineOutCtx;
import com.cloudframe.app.dto.d5427pol.D5427polCtx.MovesForErrorLogInCtx;
import com.cloudframe.app.dto.d5427pol.D5427polCtx.MovesForErrorLogOutCtx;
import com.cloudframe.app.dto.d5427pol.D5427polCtx.OpenCursorInCtx;
import com.cloudframe.app.dto.d5427pol.D5427polCtx.OpenCursorOutCtx;
import com.cloudframe.app.dto.d5427pol.D5427polCtx.OpenFamCursorInCtx;
import com.cloudframe.app.dto.d5427pol.D5427polCtx.OpenFamCursorOutCtx;
import com.cloudframe.app.dto.d5427pol.D5427polCtx.OpenIndvCursorInCtx;
import com.cloudframe.app.dto.d5427pol.D5427polCtx.OpenIndvCursorOutCtx;
import com.cloudframe.app.dto.d5427pol.D5427polCtx.OpenOopCopayCursorInCtx;
import com.cloudframe.app.dto.d5427pol.D5427polCtx.OpenOopCopayCursorOutCtx;
import com.cloudframe.app.dto.d5427pol.D5427polCtx.OpenPolbenlvlCursorInCtx;
import com.cloudframe.app.dto.d5427pol.D5427polCtx.OpenPolbenlvlCursorOutCtx;
import com.cloudframe.app.dto.d5427pol.D5427polCtx.OpenPolfamdedCursorInCtx;
import com.cloudframe.app.dto.d5427pol.D5427polCtx.OpenPolfamdedCursorOutCtx;
import com.cloudframe.app.dto.d5427pol.D5427polCtx.OpenPolinddedCursorInCtx;
import com.cloudframe.app.dto.d5427pol.D5427polCtx.OpenPolinddedCursorOutCtx;
import com.cloudframe.app.dto.d5427pol.D5427polCtx.OpenTherapyCursorInCtx;
import com.cloudframe.app.dto.d5427pol.D5427polCtx.OpenTherapyCursorOutCtx;
import com.cloudframe.app.dto.d5427pol.D5427polCtx.PopulateCd5PolhdrTherSplit5InCtx;
import com.cloudframe.app.dto.d5427pol.D5427polCtx.PopulateCd5PolhdrTherSplit5OutCtx;
import com.cloudframe.app.dto.d5427pol.D5427polCtx.PopulateCd5PolhdrTherSplit6InCtx;
import com.cloudframe.app.dto.d5427pol.D5427polCtx.PopulateCd5PolhdrTherSplit6OutCtx;
import com.cloudframe.app.dto.d5427pol.D5427polCtx.PopulateMmiRet12200InCtx;
import com.cloudframe.app.dto.d5427pol.D5427polCtx.PopulateMmiRet12200OutCtx;
import com.cloudframe.app.dto.d5427pol.D5427polCtx.PopulateMmiRet4200InCtx;
import com.cloudframe.app.dto.d5427pol.D5427polCtx.PopulateMmiRet4200OutCtx;
import com.cloudframe.app.dto.d5427pol.D5427polCtx.PopulateMmiRet8320InCtx;
import com.cloudframe.app.dto.d5427pol.D5427polCtx.PopulateMmiRet8320OutCtx;
import com.cloudframe.app.dto.d5427pol.D5427polCtx.PopulateMmiRet8410InCtx;
import com.cloudframe.app.dto.d5427pol.D5427polCtx.PopulateMmiRet8410OutCtx;
import com.cloudframe.app.dto.d5427pol.D5427polCtx.PopulateMmiRetInCtx;
import com.cloudframe.app.dto.d5427pol.D5427polCtx.PopulateMmiRetOutCtx;
import com.cloudframe.app.dto.d5427pol.D5427polCtx.PopulateMmisviRetSplit0InCtx;
import com.cloudframe.app.dto.d5427pol.D5427polCtx.PopulateMmisviRetSplit0OutCtx;
import com.cloudframe.app.dto.d5427pol.D5427polCtx.PopulateMmisviRetSplit1InCtx;
import com.cloudframe.app.dto.d5427pol.D5427polCtx.PopulateMmisviRetSplit1OutCtx;
import com.cloudframe.app.dto.d5427pol.D5427polCtx.PopulateMxiRet8310InCtx;
import com.cloudframe.app.dto.d5427pol.D5427polCtx.PopulateMxiRet8310OutCtx;
import com.cloudframe.app.dto.d5427pol.D5427polCtx.PopulateMxiRetInCtx;
import com.cloudframe.app.dto.d5427pol.D5427polCtx.PopulateMxiRetOutCtx;
import com.cloudframe.app.dto.d5427pol.D5427polCtx.PopulatePolPlnClssInCtx;
import com.cloudframe.app.dto.d5427pol.D5427polCtx.PopulatePolPlnClssOutCtx;
import com.cloudframe.app.dto.d5427pol.D5427polCtx.PopulateReqDataInCtx;
import com.cloudframe.app.dto.d5427pol.D5427polCtx.PopulateReqDataOutCtx;
import com.cloudframe.app.dto.d5427pol.D5427polCtx.PopulateRetPol4DacmInCtx;
import com.cloudframe.app.dto.d5427pol.D5427polCtx.PopulateRetPol4DacmOutCtx;
import com.cloudframe.app.dto.d5427pol.D5427polCtx.PopulateRetPol4DblvInCtx;
import com.cloudframe.app.dto.d5427pol.D5427polCtx.PopulateRetPol4DblvOutCtx;
import com.cloudframe.app.dto.d5427pol.D5427polCtx.PopulateRetPol4DfdeInCtx;
import com.cloudframe.app.dto.d5427pol.D5427polCtx.PopulateRetPol4DfdeOutCtx;
import com.cloudframe.app.dto.d5427pol.D5427polCtx.PopulateRetPol4DideInCtx;
import com.cloudframe.app.dto.d5427pol.D5427polCtx.PopulateRetPol4DideOutCtx;
import com.cloudframe.app.dto.d5427pol.D5427polCtx.PopulateRetPol6DataInCtx;
import com.cloudframe.app.dto.d5427pol.D5427polCtx.PopulateRetPol6DataOutCtx;
import com.cloudframe.app.dto.d5427pol.D5427polCtx.PopulateRetPol9ThrpyInCtx;
import com.cloudframe.app.dto.d5427pol.D5427polCtx.PopulateRetPol9ThrpyOutCtx;
import com.cloudframe.app.dto.d5427pol.D5427polCtx.PopulateStdPolPlnClsInCtx;
import com.cloudframe.app.dto.d5427pol.D5427polCtx.PopulateStdPolPlnClsOutCtx;
import com.cloudframe.app.dto.d5427pol.D5427polCtx.RcprctySelect1InCtx;
import com.cloudframe.app.dto.d5427pol.D5427polCtx.RcprctySelect1OutCtx;
import com.cloudframe.app.dto.d5427pol.D5427polCtx.RcprctySelect8500InCtx;
import com.cloudframe.app.dto.d5427pol.D5427polCtx.RcprctySelect8500OutCtx;
import com.cloudframe.app.dto.d5427pol.D5427polCtx.RcprctySelectInCtx;
import com.cloudframe.app.dto.d5427pol.D5427polCtx.RcprctySelectOutCtx;
import com.cloudframe.app.dto.d5427pol.D5427polCtx.SqlErrorProcessInCtx;
import com.cloudframe.app.dto.d5427pol.D5427polCtx.SqlErrorProcessOutCtx;

public interface D5427pol {
  /**
   * This method is derived from Cobol Paragraph -
   *
   * @return return code of program
   */
  public int setParameter(
      D5427polCtx programCtx,
      String parm,
      String parm2,
      String parm3,
      String parm4,
      String parm5,
      String parm6,
      String parm7,
      String parm8,
      String parm9,
      String parm10,
      String parm11,
      String parm12,
      String parm13)
      throws Exception;

  /**
   * This method is derived from Cobol Paragraph - PROCESS
   *
   * @return Return Code of the this class
   */
  public int process(D5427polCtx programCtx) throws Exception;

  /**
   * This method is derived from Cobol Paragraph - 0000-MAINLINE SECTION
   *
   * @return
   */
  public MainlineOutCtx mainline(MainlineInCtx methodIn) throws Exception;

  /**
   * This method is derived from Cobol Paragraph - 1000-INITIALIZE SECTION
   *
   * @return
   */
  public InitializeOutCtx initialize(InitializeInCtx methodIn) throws Exception;

  /**
   * This method is derived from Cobol Paragraph - 1200-POPULATE-REQ-DATA SECTION
   *
   * @return
   */
  public PopulateReqDataOutCtx populateReqData(PopulateReqDataInCtx methodIn) throws Exception;

  /**
   * This method is derived from Cobol Paragraph - 1300-GET-STD-MXI-DATA SECTION
   *
   * @return
   */
  public GetStdMxiDataOutCtx getStdMxiData(GetStdMxiDataInCtx methodIn) throws Exception;

  /**
   * This method is derived from Cobol Paragraph - 1301-GET-STD-MXI-LATEST-SECT SECTION
   *
   * @return
   */
  public GetStdMxiLatestSectOutCtx getStdMxiLatestSect(GetStdMxiLatestSectInCtx methodIn)
      throws Exception;

  /**
   * This method is derived from Cobol Paragraph - 1310-POPULATE-POL-PLN-CLSS SECTION
   *
   * @return
   */
  public PopulatePolPlnClssOutCtx populatePolPlnClss(PopulatePolPlnClssInCtx methodIn)
      throws Exception;

  /**
   * This method is derived from Cobol Paragraph - 2000-FUNC-CD1-POLPLN-MXI-READ SECTION
   *
   * @return
   */
  public FuncCd1PolplnMxiReadOutCtx funcCd1PolplnMxiRead(FuncCd1PolplnMxiReadInCtx methodIn)
      throws Exception;

  /**
   * This method is derived from Cobol Paragraph - 2010-OPEN-CURSOR SECTION
   *
   * @return
   */
  public OpenCursorOutCtx openCursor(OpenCursorInCtx methodIn) throws Exception;

  /**
   * This method is derived from Cobol Paragraph - 2020-FETCH-CURSOR SECTION
   *
   * @return
   */
  public FetchCursorOutCtx fetchCursor(FetchCursorInCtx methodIn) throws Exception;

  /**
   * This method is derived from Cobol Paragraph - 2030-CLOSE-CURSOR SECTION
   *
   * @return
   */
  public CloseCursorOutCtx closeCursor(CloseCursorInCtx methodIn) throws Exception;

  /**
   * This method is derived from Cobol Paragraph - 2040-GET-MMI-RECORD SECTION
   *
   * @return
   */
  public GetMmiRecordOutCtx getMmiRecord(GetMmiRecordInCtx methodIn) throws Exception;

  /**
   * This method is derived from Cobol Paragraph - 2050-POPULATE-STD-POL-PLN-CLS SECTION
   *
   * @return
   */
  public PopulateStdPolPlnClsOutCtx populateStdPolPlnCls(PopulateStdPolPlnClsInCtx methodIn)
      throws Exception;

  /**
   * This method is derived from Cobol Paragraph - 3060-RCPRCTY-SELECT SECTION
   *
   * @return
   */
  public RcprctySelectOutCtx rcprctySelect(RcprctySelectInCtx methodIn) throws Exception;

  /**
   * This method is derived from Cobol Paragraph - 3300-FUN-CD2-POLPLN-XREF SECTION
   *
   * @return
   */
  public FunCd2PolplnXrefOutCtx funCd2PolplnXref(FunCd2PolplnXrefInCtx methodIn) throws Exception;

  /**
   * This method is derived from Cobol Paragraph - 3310-POPULATE-MXI-RET SECTION
   *
   * @return
   */
  public PopulateMxiRetOutCtx populateMxiRet(PopulateMxiRetInCtx methodIn) throws Exception;

  /**
   * This method is derived from Cobol Paragraph - 3400-FUNC-CD2-GET-MMI SECTION
   *
   * @return
   */
  public FuncCd2GetMmiOutCtx funcCd2GetMmi(FuncCd2GetMmiInCtx methodIn) throws Exception;

  /**
   * This method is derived from Cobol Paragraph - 3410-POPULATE-MMI-RET SECTION
   *
   * @return
   */
  public PopulateMmiRetOutCtx populateMmiRet(PopulateMmiRetInCtx methodIn) throws Exception;

  /**
   * This method is derived from Cobol Paragraph - 4000-FUNC-CD3-MXI-READ SECTION
   *
   * @return
   */
  public FuncCd3MxiReadOutCtx funcCd3MxiRead(FuncCd3MxiReadInCtx methodIn) throws Exception;

  /**
   * This method is derived from Cobol Paragraph - 4010-FUNC-CD3-POLSVI-MMI-READ SECTION
   *
   * @return
   */
  public FuncCd3PolsviMmiReadOutCtx funcCd3PolsviMmiRead(FuncCd3PolsviMmiReadInCtx methodIn)
      throws Exception;

  /** This method is derived from Cobol Paragraph - 4020-POPULATE-MMISVI-RET SECTION */
  public void populateMmisviRet(D5427polCtx programCtx) throws Exception;

  /**
   * This method is derived from Cobol Paragraph - 4020-POPULATE-MMISVI-RET-SPLIT0
   *
   * @return
   */
  public PopulateMmisviRetSplit0OutCtx populateMmisviRetSplit0(
      PopulateMmisviRetSplit0InCtx methodIn) throws Exception;

  /**
   * This method is derived from Cobol Paragraph - 4020-POPULATE-MMISVI-RET-SPLIT1
   *
   * @return
   */
  public PopulateMmisviRetSplit1OutCtx populateMmisviRetSplit1(
      PopulateMmisviRetSplit1InCtx methodIn) throws Exception;

  /**
   * This method is derived from Cobol Paragraph - 4100-FUNC-CD3-POLHDR-MMI-READ SECTION
   *
   * @return
   */
  public FuncCd3PolhdrMmiReadOutCtx funcCd3PolhdrMmiRead(FuncCd3PolhdrMmiReadInCtx methodIn)
      throws Exception;

  /**
   * This method is derived from Cobol Paragraph - 4200-POPULATE-MMI-RET SECTION
   *
   * @return
   */
  public PopulateMmiRet4200OutCtx populateMmiRet4200(PopulateMmiRet4200InCtx methodIn)
      throws Exception;

  /**
   * This method is derived from Cobol Paragraph - 5000-FUNC-CD4-MXI-READ SECTION
   *
   * @return
   */
  public FuncCd4MxiReadOutCtx funcCd4MxiRead(FuncCd4MxiReadInCtx methodIn) throws Exception;

  /**
   * This method is derived from Cobol Paragraph - 5100-FUNC-CD4-POLHDR-READ SECTION
   *
   * @return
   */
  public FuncCd4PolhdrReadOutCtx funcCd4PolhdrRead(FuncCd4PolhdrReadInCtx methodIn)
      throws Exception;

  /** This method is derived from Cobol Paragraph - 5410-FUNC-CD4-POPULATE-RET SECTION */
  public void funcCd4PopulateRet(D5427polCtx programCtx) throws Exception;

  /**
   * This method is derived from Cobol Paragraph - 5410-FUNC-CD4-POPULATE-RET-SPLIT2
   *
   * @return
   */
  public FuncCd4PopulateRetSplit2OutCtx funcCd4PopulateRetSplit2(
      FuncCd4PopulateRetSplit2InCtx methodIn) throws Exception;

  /**
   * This method is derived from Cobol Paragraph - 5410-FUNC-CD4-POPULATE-RET-SPLIT3
   *
   * @return
   */
  public FuncCd4PopulateRetSplit3OutCtx funcCd4PopulateRetSplit3(
      FuncCd4PopulateRetSplit3InCtx methodIn) throws Exception;

  /**
   * This method is derived from Cobol Paragraph - 5410-FUNC-CD4-POPULATE-RET-SPLIT4
   *
   * @return
   */
  public FuncCd4PopulateRetSplit4OutCtx funcCd4PopulateRetSplit4(
      FuncCd4PopulateRetSplit4InCtx methodIn) throws Exception;

  /**
   * This method is derived from Cobol Paragraph - 5500-FUNC-CD4-POLBENLVL-READ SECTION
   *
   * @return
   */
  public FuncCd4PolbenlvlReadOutCtx funcCd4PolbenlvlRead(FuncCd4PolbenlvlReadInCtx methodIn)
      throws Exception;

  /**
   * This method is derived from Cobol Paragraph - 5510-OPEN-POLBENLVL-CURSOR SECTION
   *
   * @return
   */
  public OpenPolbenlvlCursorOutCtx openPolbenlvlCursor(OpenPolbenlvlCursorInCtx methodIn)
      throws Exception;

  /**
   * This method is derived from Cobol Paragraph - 5520-FETCH-POLBENLVL-CURSOR SECTION
   *
   * @return
   */
  public FetchPolbenlvlCursorOutCtx fetchPolbenlvlCursor(FetchPolbenlvlCursorInCtx methodIn)
      throws Exception;

  /**
   * This method is derived from Cobol Paragraph - 5530-CLOSE-POLBENLVL-CURSOR SECTION
   *
   * @return
   */
  public ClosePolbenlvlCursorOutCtx closePolbenlvlCursor(ClosePolbenlvlCursorInCtx methodIn)
      throws Exception;

  /**
   * This method is derived from Cobol Paragraph - 5540-POPULATE-RET-POL4-DBLV SECTION
   *
   * @return
   */
  public PopulateRetPol4DblvOutCtx populateRetPol4Dblv(PopulateRetPol4DblvInCtx methodIn)
      throws Exception;

  /**
   * This method is derived from Cobol Paragraph - 5600-FUNC-CD4-POLFAMDED-READ SECTION
   *
   * @return
   */
  public FuncCd4PolfamdedReadOutCtx funcCd4PolfamdedRead(FuncCd4PolfamdedReadInCtx methodIn)
      throws Exception;

  /**
   * This method is derived from Cobol Paragraph - 5610-OPEN-POLFAMDED-CURSOR SECTION
   *
   * @return
   */
  public OpenPolfamdedCursorOutCtx openPolfamdedCursor(OpenPolfamdedCursorInCtx methodIn)
      throws Exception;

  /**
   * This method is derived from Cobol Paragraph - 5620-FETCH-POLFAMDED-CURSOR SECTION
   *
   * @return
   */
  public FetchPolfamdedCursorOutCtx fetchPolfamdedCursor(FetchPolfamdedCursorInCtx methodIn)
      throws Exception;

  /**
   * This method is derived from Cobol Paragraph - 5630-CLOSE-POLFAMDED-CURSOR SECTION
   *
   * @return
   */
  public ClosePolfamdedCursorOutCtx closePolfamdedCursor(ClosePolfamdedCursorInCtx methodIn)
      throws Exception;

  /**
   * This method is derived from Cobol Paragraph - 5640-POPULATE-RET-POL4-DFDE SECTION
   *
   * @return
   */
  public PopulateRetPol4DfdeOutCtx populateRetPol4Dfde(PopulateRetPol4DfdeInCtx methodIn)
      throws Exception;

  /**
   * This method is derived from Cobol Paragraph - 5700-FUNC-CD4-POLINDVDED-READ SECTION
   *
   * @return
   */
  public FuncCd4PolindvdedReadOutCtx funcCd4PolindvdedRead(FuncCd4PolindvdedReadInCtx methodIn)
      throws Exception;

  /**
   * This method is derived from Cobol Paragraph - 5710-OPEN-POLINDDED-CURSOR SECTION
   *
   * @return
   */
  public OpenPolinddedCursorOutCtx openPolinddedCursor(OpenPolinddedCursorInCtx methodIn)
      throws Exception;

  /**
   * This method is derived from Cobol Paragraph - 5720-FETCH-POLINDDED-CURSOR SECTION
   *
   * @return
   */
  public FetchPolinddedCursorOutCtx fetchPolinddedCursor(FetchPolinddedCursorInCtx methodIn)
      throws Exception;

  /**
   * This method is derived from Cobol Paragraph - 5730-CLOSE-POLINDDED-CURSOR SECTION
   *
   * @return
   */
  public ClosePolinddedCursorOutCtx closePolinddedCursor(ClosePolinddedCursorInCtx methodIn)
      throws Exception;

  /**
   * This method is derived from Cobol Paragraph - 5740-POPULATE-RET-POL4-DIDE SECTION
   *
   * @return
   */
  public PopulateRetPol4DideOutCtx populateRetPol4Dide(PopulateRetPol4DideInCtx methodIn)
      throws Exception;

  /**
   * This method is derived from Cobol Paragraph - 5800-FUNC-CD4-OOP-COPAY-RET SECTION
   *
   * @return
   */
  public FuncCd4OopCopayRetOutCtx funcCd4OopCopayRet(FuncCd4OopCopayRetInCtx methodIn)
      throws Exception;

  /**
   * This method is derived from Cobol Paragraph - 5810-OPEN-OOP-COPAY-CURSOR SECTION
   *
   * @return
   */
  public OpenOopCopayCursorOutCtx openOopCopayCursor(OpenOopCopayCursorInCtx methodIn)
      throws Exception;

  /**
   * This method is derived from Cobol Paragraph - 5820-FETCH-OOP-COPAY-CURSOR SECTION
   *
   * @return
   */
  public FetchOopCopayCursorOutCtx fetchOopCopayCursor(FetchOopCopayCursorInCtx methodIn)
      throws Exception;

  /**
   * This method is derived from Cobol Paragraph - 5830-CLOSE-OOP-COPAY-CURSOR SECTION
   *
   * @return
   */
  public CloseOopCopayCursorOutCtx closeOopCopayCursor(CloseOopCopayCursorInCtx methodIn)
      throws Exception;

  /**
   * This method is derived from Cobol Paragraph - 5840-POPULATE-RET-POL4-DACM SECTION
   *
   * @return
   */
  public PopulateRetPol4DacmOutCtx populateRetPol4Dacm(PopulateRetPol4DacmInCtx methodIn)
      throws Exception;

  /**
   * This method is derived from Cobol Paragraph - 6000-FUN-CD5-POLHDR-THER-READ SECTION
   *
   * @return
   */
  public FunCd5PolhdrTherReadOutCtx funCd5PolhdrTherRead(FunCd5PolhdrTherReadInCtx methodIn)
      throws Exception;

  /** This method is derived from Cobol Paragraph - 6100-POPULATE-CD5-POLHDR-THER SECTION */
  public void populateCd5PolhdrTher(D5427polCtx programCtx) throws Exception;

  /**
   * This method is derived from Cobol Paragraph - 6100-POPULATE-CD5-POLHDR-THER-SPLIT5
   *
   * @return
   */
  public PopulateCd5PolhdrTherSplit5OutCtx populateCd5PolhdrTherSplit5(
      PopulateCd5PolhdrTherSplit5InCtx methodIn) throws Exception;

  /**
   * This method is derived from Cobol Paragraph - 6100-POPULATE-CD5-POLHDR-THER-SPLIT6
   *
   * @return
   */
  public PopulateCd5PolhdrTherSplit6OutCtx populateCd5PolhdrTherSplit6(
      PopulateCd5PolhdrTherSplit6InCtx methodIn) throws Exception;

  /**
   * This method is derived from Cobol Paragraph - 7000-FUNC-CD6-READ-MXI SECTION
   *
   * @return
   */
  public FuncCd6ReadMxiOutCtx funcCd6ReadMxi(FuncCd6ReadMxiInCtx methodIn) throws Exception;

  /**
   * This method is derived from Cobol Paragraph - 7100-FUNC-CD6-READ-MMI SECTION
   *
   * @return
   */
  public FuncCd6ReadMmiOutCtx funcCd6ReadMmi(FuncCd6ReadMmiInCtx methodIn) throws Exception;

  /**
   * This method is derived from Cobol Paragraph - 7110-POPULATE-RET-POL6-DATA SECTION
   *
   * @return
   */
  public PopulateRetPol6DataOutCtx populateRetPol6Data(PopulateRetPol6DataInCtx methodIn)
      throws Exception;

  /**
   * This method is derived from Cobol Paragraph - 7200-FUNC-CD6-READ-FAM SECTION
   *
   * @return
   */
  public FuncCd6ReadFamOutCtx funcCd6ReadFam(FuncCd6ReadFamInCtx methodIn) throws Exception;

  /**
   * This method is derived from Cobol Paragraph - 7210-OPEN-FAM-CURSOR SECTION
   *
   * @return
   */
  public OpenFamCursorOutCtx openFamCursor(OpenFamCursorInCtx methodIn) throws Exception;

  /**
   * This method is derived from Cobol Paragraph - 7220-FETCH-FAM-CURSOR SECTION
   *
   * @return
   */
  public FetchFamCursorOutCtx fetchFamCursor(FetchFamCursorInCtx methodIn) throws Exception;

  /**
   * This method is derived from Cobol Paragraph - 7230-CLOSE-FAM-CURSOR SECTION
   *
   * @return
   */
  public CloseFamCursorOutCtx closeFamCursor(CloseFamCursorInCtx methodIn) throws Exception;

  /**
   * This method is derived from Cobol Paragraph - 7300-FUNC-CD6-READ-IND SECTION
   *
   * @return
   */
  public FuncCd6ReadIndOutCtx funcCd6ReadInd(FuncCd6ReadIndInCtx methodIn) throws Exception;

  /**
   * This method is derived from Cobol Paragraph - 7310-OPEN-INDV-CURSOR SECTION
   *
   * @return
   */
  public OpenIndvCursorOutCtx openIndvCursor(OpenIndvCursorInCtx methodIn) throws Exception;

  /**
   * This method is derived from Cobol Paragraph - 7320-FETCH-INDV-CURSOR SECTION
   *
   * @return
   */
  public FetchIndvCursorOutCtx fetchIndvCursor(FetchIndvCursorInCtx methodIn) throws Exception;

  /**
   * This method is derived from Cobol Paragraph - 7330-CLOSE-INDV-CURSOR SECTION
   *
   * @return
   */
  public CloseIndvCursorOutCtx closeIndvCursor(CloseIndvCursorInCtx methodIn) throws Exception;

  /**
   * This method is derived from Cobol Paragraph - 8300-FUN-CD8-POLPLN-XREF SECTION
   *
   * @return
   */
  public FunCd8PolplnXrefOutCtx funCd8PolplnXref(FunCd8PolplnXrefInCtx methodIn) throws Exception;

  /**
   * This method is derived from Cobol Paragraph - 8310-POPULATE-MXI-RET SECTION
   *
   * @return
   */
  public PopulateMxiRet8310OutCtx populateMxiRet8310(PopulateMxiRet8310InCtx methodIn)
      throws Exception;

  /**
   * This method is derived from Cobol Paragraph - 8320-POPULATE-MMI-RET SECTION
   *
   * @return
   */
  public PopulateMmiRet8320OutCtx populateMmiRet8320(PopulateMmiRet8320InCtx methodIn)
      throws Exception;

  /**
   * This method is derived from Cobol Paragraph - 8400-FUNC-CD8-GET-MMI SECTION
   *
   * @return
   */
  public FuncCd8GetMmiOutCtx funcCd8GetMmi(FuncCd8GetMmiInCtx methodIn) throws Exception;

  /**
   * This method is derived from Cobol Paragraph - 8410-POPULATE-MMI-RET SECTION
   *
   * @return
   */
  public PopulateMmiRet8410OutCtx populateMmiRet8410(PopulateMmiRet8410InCtx methodIn)
      throws Exception;

  /**
   * This method is derived from Cobol Paragraph - 8500-RCPRCTY-SELECT SECTION
   *
   * @return
   */
  public RcprctySelect8500OutCtx rcprctySelect8500(RcprctySelect8500InCtx methodIn)
      throws Exception;

  /**
   * This method is derived from Cobol Paragraph - 8510-RCPRCTY-SELECT1 SECTION
   *
   * @return
   */
  public RcprctySelect1OutCtx rcprctySelect1(RcprctySelect1InCtx methodIn) throws Exception;

  /**
   * This method is derived from Cobol Paragraph - 8600-DERIVE-PLAN-REFERRAL SECTION
   *
   * @return
   */
  public DerivePlanReferralOutCtx derivePlanReferral(DerivePlanReferralInCtx methodIn)
      throws Exception;

  /**
   * This method is derived from Cobol Paragraph - 9000-FUN-CD9-POL-PHYTHER-READ SECTION
   *
   * @return
   */
  public FunCd9PolPhytherReadOutCtx funCd9PolPhytherRead(FunCd9PolPhytherReadInCtx methodIn)
      throws Exception;

  /**
   * This method is derived from Cobol Paragraph - 9010-OPEN-THERAPY-CURSOR SECTION
   *
   * @return
   */
  public OpenTherapyCursorOutCtx openTherapyCursor(OpenTherapyCursorInCtx methodIn)
      throws Exception;

  /**
   * This method is derived from Cobol Paragraph - 9020-FETCH-THERAPY-CURSOR SECTION
   *
   * @return
   */
  public FetchTherapyCursorOutCtx fetchTherapyCursor(FetchTherapyCursorInCtx methodIn)
      throws Exception;

  /**
   * This method is derived from Cobol Paragraph - 9030-CLOSE-THERAPY-CURSOR SECTION
   *
   * @return
   */
  public CloseTherapyCursorOutCtx closeTherapyCursor(CloseTherapyCursorInCtx methodIn)
      throws Exception;

  /**
   * This method is derived from Cobol Paragraph - 9040-POPULATE-RET-POL9-THRPY SECTION
   *
   * @return
   */
  public PopulateRetPol9ThrpyOutCtx populateRetPol9Thrpy(PopulateRetPol9ThrpyInCtx methodIn)
      throws Exception;

  /**
   * This method is derived from Cobol Paragraph - 7500-FUNC-CD7-SEARCH-POL SECTION
   *
   * @return
   */
  public FuncCd7SearchPolOutCtx funcCd7SearchPol(FuncCd7SearchPolInCtx methodIn) throws Exception;

  /**
   * This method is derived from Cobol Paragraph - 10000-FUNC-CD10-MXI-READ SECTION
   *
   * @return
   */
  public FuncCd10MxiReadOutCtx funcCd10MxiRead(FuncCd10MxiReadInCtx methodIn) throws Exception;

  /**
   * This method is derived from Cobol Paragraph - 10100-FUNC-CD10-MMI-READ SECTION
   *
   * @return
   */
  public FuncCd10MmiReadOutCtx funcCd10MmiRead(FuncCd10MmiReadInCtx methodIn) throws Exception;

  /**
   * This method is derived from Cobol Paragraph - 11000-FUNC-CD11-READ-MXI SECTION
   *
   * @return
   */
  public FuncCd11ReadMxiOutCtx funcCd11ReadMxi(FuncCd11ReadMxiInCtx methodIn) throws Exception;

  /**
   * This method is derived from Cobol Paragraph - 12000-GET-STD-MMI-DATA SECTION
   *
   * @return
   */
  public GetStdMmiDataOutCtx getStdMmiData(GetStdMmiDataInCtx methodIn) throws Exception;

  /**
   * This method is derived from Cobol Paragraph - 12200-POPULATE-MMI-RET SECTION
   *
   * @return
   */
  public PopulateMmiRet12200OutCtx populateMmiRet12200(PopulateMmiRet12200InCtx methodIn)
      throws Exception;

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
