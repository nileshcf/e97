package org.optum.uhg.business;

import com.cloudframe.app.data.Field;
import com.cloudframe.app.dto.ProgramContext;
import org.optum.uhg.dto.d529351u.D529351uCtx;
import org.optum.uhg.dto.d529351u.D529351uCtx.CloseCombCsrInCtx;
import org.optum.uhg.dto.d529351u.D529351uCtx.CloseCombCsrOutCtx;
import org.optum.uhg.dto.d529351u.D529351uCtx.CloseCsr2285InCtx;
import org.optum.uhg.dto.d529351u.D529351uCtx.CloseCsr2285OutCtx;
import org.optum.uhg.dto.d529351u.D529351uCtx.CloseCsr2385InCtx;
import org.optum.uhg.dto.d529351u.D529351uCtx.CloseCsr2385OutCtx;
import org.optum.uhg.dto.d529351u.D529351uCtx.CloseCsr2485InCtx;
import org.optum.uhg.dto.d529351u.D529351uCtx.CloseCsr2485OutCtx;
import org.optum.uhg.dto.d529351u.D529351uCtx.CloseCsr2585InCtx;
import org.optum.uhg.dto.d529351u.D529351uCtx.CloseCsr2585OutCtx;
import org.optum.uhg.dto.d529351u.D529351uCtx.CloseCsr3260InCtx;
import org.optum.uhg.dto.d529351u.D529351uCtx.CloseCsr3260OutCtx;
import org.optum.uhg.dto.d529351u.D529351uCtx.CloseCsrInCtx;
import org.optum.uhg.dto.d529351u.D529351uCtx.CloseCsrOutCtx;
import org.optum.uhg.dto.d529351u.D529351uCtx.CloseSvcMainCsrInCtx;
import org.optum.uhg.dto.d529351u.D529351uCtx.CloseSvcMainCsrOutCtx;
import org.optum.uhg.dto.d529351u.D529351uCtx.FetchCombInCtx;
import org.optum.uhg.dto.d529351u.D529351uCtx.FetchCombOutCtx;
import org.optum.uhg.dto.d529351u.D529351uCtx.FetchCsfcndInCtx;
import org.optum.uhg.dto.d529351u.D529351uCtx.FetchCsfcndOutCtx;
import org.optum.uhg.dto.d529351u.D529351uCtx.FetchCsfrtoInCtx;
import org.optum.uhg.dto.d529351u.D529351uCtx.FetchCsfrtoOutCtx;
import org.optum.uhg.dto.d529351u.D529351uCtx.FetchCsicd3250InCtx;
import org.optum.uhg.dto.d529351u.D529351uCtx.FetchCsicd3250OutCtx;
import org.optum.uhg.dto.d529351u.D529351uCtx.FetchCsicdInCtx;
import org.optum.uhg.dto.d529351u.D529351uCtx.FetchCsicdOutCtx;
import org.optum.uhg.dto.d529351u.D529351uCtx.FetchCsplnvInCtx;
import org.optum.uhg.dto.d529351u.D529351uCtx.FetchCsplnvOutCtx;
import org.optum.uhg.dto.d529351u.D529351uCtx.FetchCsptypInCtx;
import org.optum.uhg.dto.d529351u.D529351uCtx.FetchCsptypOutCtx;
import org.optum.uhg.dto.d529351u.D529351uCtx.FetchSvcMainCsrInCtx;
import org.optum.uhg.dto.d529351u.D529351uCtx.FetchSvcMainCsrOutCtx;
import org.optum.uhg.dto.d529351u.D529351uCtx.InitializeInCtx;
import org.optum.uhg.dto.d529351u.D529351uCtx.InitializeOutCtx;
import org.optum.uhg.dto.d529351u.D529351uCtx.MoveCauseTableInCtx;
import org.optum.uhg.dto.d529351u.D529351uCtx.MoveCauseTableOutCtx;
import org.optum.uhg.dto.d529351u.D529351uCtx.MoveCflgTableInCtx;
import org.optum.uhg.dto.d529351u.D529351uCtx.MoveCflgTableOutCtx;
import org.optum.uhg.dto.d529351u.D529351uCtx.MoveCsfcndInCtx;
import org.optum.uhg.dto.d529351u.D529351uCtx.MoveCsfcndOutCtx;
import org.optum.uhg.dto.d529351u.D529351uCtx.MoveCsptypInCtx;
import org.optum.uhg.dto.d529351u.D529351uCtx.MoveCsptypOutCtx;
import org.optum.uhg.dto.d529351u.D529351uCtx.MoveIpaTableInCtx;
import org.optum.uhg.dto.d529351u.D529351uCtx.MoveIpaTableOutCtx;
import org.optum.uhg.dto.d529351u.D529351uCtx.MoveSvcKeyCsrInCtx;
import org.optum.uhg.dto.d529351u.D529351uCtx.MoveSvcKeyCsrOutCtx;
import org.optum.uhg.dto.d529351u.D529351uCtx.OpenCombCursorInCtx;
import org.optum.uhg.dto.d529351u.D529351uCtx.OpenCombCursorOutCtx;
import org.optum.uhg.dto.d529351u.D529351uCtx.OpenCsfcndCursorInCtx;
import org.optum.uhg.dto.d529351u.D529351uCtx.OpenCsfcndCursorOutCtx;
import org.optum.uhg.dto.d529351u.D529351uCtx.OpenCsfrtoCursorInCtx;
import org.optum.uhg.dto.d529351u.D529351uCtx.OpenCsfrtoCursorOutCtx;
import org.optum.uhg.dto.d529351u.D529351uCtx.OpenCsicdCursor3200InCtx;
import org.optum.uhg.dto.d529351u.D529351uCtx.OpenCsicdCursor3200OutCtx;
import org.optum.uhg.dto.d529351u.D529351uCtx.OpenCsicdCursorInCtx;
import org.optum.uhg.dto.d529351u.D529351uCtx.OpenCsicdCursorOutCtx;
import org.optum.uhg.dto.d529351u.D529351uCtx.OpenCsplnvCursorInCtx;
import org.optum.uhg.dto.d529351u.D529351uCtx.OpenCsplnvCursorOutCtx;
import org.optum.uhg.dto.d529351u.D529351uCtx.OpenCsptypCursorInCtx;
import org.optum.uhg.dto.d529351u.D529351uCtx.OpenCsptypCursorOutCtx;
import org.optum.uhg.dto.d529351u.D529351uCtx.OpenSvcMainCsrInCtx;
import org.optum.uhg.dto.d529351u.D529351uCtx.OpenSvcMainCsrOutCtx;
import org.optum.uhg.dto.d529351u.D529351uCtx.ProcessFuncCd1InCtx;
import org.optum.uhg.dto.d529351u.D529351uCtx.ProcessFuncCd1OutCtx;
import org.optum.uhg.dto.d529351u.D529351uCtx.ProcessFuncCd2Split0InCtx;
import org.optum.uhg.dto.d529351u.D529351uCtx.ProcessFuncCd2Split0OutCtx;
import org.optum.uhg.dto.d529351u.D529351uCtx.ProcessFuncCd2Split1InCtx;
import org.optum.uhg.dto.d529351u.D529351uCtx.ProcessFuncCd2Split1OutCtx;
import org.optum.uhg.dto.d529351u.D529351uCtx.ProcessFuncCd3InCtx;
import org.optum.uhg.dto.d529351u.D529351uCtx.ProcessFuncCd3OutCtx;
import org.optum.uhg.dto.d529351u.D529351uCtx.ProcessingInCtx;
import org.optum.uhg.dto.d529351u.D529351uCtx.ProcessingOutCtx;
import org.optum.uhg.dto.d529351u.D529351uCtx.SelectCauseTableInCtx;
import org.optum.uhg.dto.d529351u.D529351uCtx.SelectCauseTableOutCtx;
import org.optum.uhg.dto.d529351u.D529351uCtx.SelectIpaTableInCtx;
import org.optum.uhg.dto.d529351u.D529351uCtx.SelectIpaTableOutCtx;

public interface D529351u {
  /**
   * This method is derived from Cobol Paragraph -
   *
   * @return return code of program
   */
  public int setParameter(D529351uCtx programCtx, String parm, String parm2) throws Exception;

  /**
   * This method is derived from Cobol Paragraph - PROCESS
   *
   * @return Return Code of the this class
   */
  public int process(D529351uCtx programCtx) throws Exception;

  /** This method is derived from Cobol Paragraph - 0000-MAIN-LINE SECTION */
  public void mainLine(D529351uCtx programCtx) throws Exception;

  /** This method is derived from Cobol Paragraph - 0000-EXIT */
  public void exit(D529351uCtx programCtx) throws Exception;

  /**
   * This method is derived from Cobol Paragraph - 1000-INITIALIZE SECTION
   *
   * @return
   */
  public InitializeOutCtx initialize(InitializeInCtx methodIn) throws Exception;

  /**
   * This method is derived from Cobol Paragraph - 2000-PROCESSING SECTION
   *
   * @return
   */
  public ProcessingOutCtx processing(ProcessingInCtx methodIn) throws Exception;

  /**
   * This method is derived from Cobol Paragraph - 2100-PROCESS-FUNC-CD-1 SECTION
   *
   * @return
   */
  public ProcessFuncCd1OutCtx processFuncCd1(ProcessFuncCd1InCtx methodIn) throws Exception;

  /**
   * This method is derived from Cobol Paragraph - 2150-OPEN-CSPLNV-CURSOR SECTION
   *
   * @return
   */
  public OpenCsplnvCursorOutCtx openCsplnvCursor(OpenCsplnvCursorInCtx methodIn) throws Exception;

  /**
   * This method is derived from Cobol Paragraph - 2180-FETCH-CSPLNV SECTION
   *
   * @return
   */
  public FetchCsplnvOutCtx fetchCsplnv(FetchCsplnvInCtx methodIn) throws Exception;

  /**
   * This method is derived from Cobol Paragraph - 2185-CLOSE-CSR SECTION
   *
   * @return
   */
  public CloseCsrOutCtx closeCsr(CloseCsrInCtx methodIn) throws Exception;

  /** This method is derived from Cobol Paragraph - 2200-PROCESS-FUNC-CD-2 SECTION */
  public void processFuncCd2(D529351uCtx programCtx) throws Exception;

  /**
   * This method is derived from Cobol Paragraph - 2200-PROCESS-FUNC-CD-2-SPLIT0
   *
   * @return
   */
  public ProcessFuncCd2Split0OutCtx processFuncCd2Split0(ProcessFuncCd2Split0InCtx methodIn)
      throws Exception;

  /**
   * This method is derived from Cobol Paragraph - 2200-PROCESS-FUNC-CD-2-SPLIT1
   *
   * @return
   */
  public ProcessFuncCd2Split1OutCtx processFuncCd2Split1(ProcessFuncCd2Split1InCtx methodIn)
      throws Exception;

  /**
   * This method is derived from Cobol Paragraph - 2250-OPEN-CSFRTO-CURSOR SECTION
   *
   * @return
   */
  public OpenCsfrtoCursorOutCtx openCsfrtoCursor(OpenCsfrtoCursorInCtx methodIn) throws Exception;

  /**
   * This method is derived from Cobol Paragraph - 2280-FETCH-CSFRTO SECTION
   *
   * @return
   */
  public FetchCsfrtoOutCtx fetchCsfrto(FetchCsfrtoInCtx methodIn) throws Exception;

  /**
   * This method is derived from Cobol Paragraph - 2285-CLOSE-CSR SECTION
   *
   * @return
   */
  public CloseCsr2285OutCtx closeCsr2285(CloseCsr2285InCtx methodIn) throws Exception;

  /**
   * This method is derived from Cobol Paragraph - 2350-OPEN-CSPTYP-CURSOR SECTION
   *
   * @return
   */
  public OpenCsptypCursorOutCtx openCsptypCursor(OpenCsptypCursorInCtx methodIn) throws Exception;

  /**
   * This method is derived from Cobol Paragraph - 2380-FETCH-CSPTYP SECTION
   *
   * @return
   */
  public FetchCsptypOutCtx fetchCsptyp(FetchCsptypInCtx methodIn) throws Exception;

  /**
   * This method is derived from Cobol Paragraph - 2385-CLOSE-CSR SECTION
   *
   * @return
   */
  public CloseCsr2385OutCtx closeCsr2385(CloseCsr2385InCtx methodIn) throws Exception;

  /**
   * This method is derived from Cobol Paragraph - 2450-OPEN-CSICD-CURSOR SECTION
   *
   * @return
   */
  public OpenCsicdCursorOutCtx openCsicdCursor(OpenCsicdCursorInCtx methodIn) throws Exception;

  /**
   * This method is derived from Cobol Paragraph - 2480-FETCH-CSICD SECTION
   *
   * @return
   */
  public FetchCsicdOutCtx fetchCsicd(FetchCsicdInCtx methodIn) throws Exception;

  /**
   * This method is derived from Cobol Paragraph - 2485-CLOSE-CSR SECTION
   *
   * @return
   */
  public CloseCsr2485OutCtx closeCsr2485(CloseCsr2485InCtx methodIn) throws Exception;

  /**
   * This method is derived from Cobol Paragraph - 2550-OPEN-CSFCND-CURSOR SECTION
   *
   * @return
   */
  public OpenCsfcndCursorOutCtx openCsfcndCursor(OpenCsfcndCursorInCtx methodIn) throws Exception;

  /**
   * This method is derived from Cobol Paragraph - 2580-FETCH-CSFCND SECTION
   *
   * @return
   */
  public FetchCsfcndOutCtx fetchCsfcnd(FetchCsfcndInCtx methodIn) throws Exception;

  /**
   * This method is derived from Cobol Paragraph - 2585-CLOSE-CSR SECTION
   *
   * @return
   */
  public CloseCsr2585OutCtx closeCsr2585(CloseCsr2585InCtx methodIn) throws Exception;

  /**
   * This method is derived from Cobol Paragraph - 2650-SELECT-CAUSE-TABLE SECTION
   *
   * @return
   */
  public SelectCauseTableOutCtx selectCauseTable(SelectCauseTableInCtx methodIn) throws Exception;

  /**
   * This method is derived from Cobol Paragraph - 2750-SELECT-IPA-TABLE SECTION
   *
   * @return
   */
  public SelectIpaTableOutCtx selectIpaTable(SelectIpaTableInCtx methodIn) throws Exception;

  /**
   * This method is derived from Cobol Paragraph - 2218-OPEN-SVC-MAIN-CSR SECTION
   *
   * @return
   */
  public OpenSvcMainCsrOutCtx openSvcMainCsr(OpenSvcMainCsrInCtx methodIn) throws Exception;

  /**
   * This method is derived from Cobol Paragraph - 2318-FETCH-SVC-MAIN-CSR SECTION
   *
   * @return
   */
  public FetchSvcMainCsrOutCtx fetchSvcMainCsr(FetchSvcMainCsrInCtx methodIn) throws Exception;

  /** This method is derived from Cobol Paragraph - 2418-MOVE-SVC-MAIN-CSR SECTION */
  public void moveSvcMainCsr(D529351uCtx programCtx) throws Exception;

  /**
   * This method is derived from Cobol Paragraph - 2618-MOVE-SVC-KEY-CSR SECTION
   *
   * @return
   */
  public MoveSvcKeyCsrOutCtx moveSvcKeyCsr(MoveSvcKeyCsrInCtx methodIn) throws Exception;

  /**
   * This method is derived from Cobol Paragraph - 2518-CLOSE-SVC-MAIN-CSR SECTION
   *
   * @return
   */
  public CloseSvcMainCsrOutCtx closeSvcMainCsr(CloseSvcMainCsrInCtx methodIn) throws Exception;

  /**
   * This method is derived from Cobol Paragraph - 2351-OPEN-COMB-CURSOR SECTION
   *
   * @return
   */
  public OpenCombCursorOutCtx openCombCursor(OpenCombCursorInCtx methodIn) throws Exception;

  /**
   * This method is derived from Cobol Paragraph - 2352-FETCH-COMB SECTION
   *
   * @return
   */
  public FetchCombOutCtx fetchComb(FetchCombInCtx methodIn) throws Exception;

  /**
   * This method is derived from Cobol Paragraph - 2353-CLOSE-COMB-CSR SECTION
   *
   * @return
   */
  public CloseCombCsrOutCtx closeCombCsr(CloseCombCsrInCtx methodIn) throws Exception;

  /**
   * This method is derived from Cobol Paragraph - 2653-MOVE-CAUSE-TABLE SECTION
   *
   * @return
   */
  public MoveCauseTableOutCtx moveCauseTable(MoveCauseTableInCtx methodIn) throws Exception;

  /**
   * This method is derived from Cobol Paragraph - 2654-MOVE-IPA-TABLE SECTION
   *
   * @return
   */
  public MoveIpaTableOutCtx moveIpaTable(MoveIpaTableInCtx methodIn) throws Exception;

  /**
   * This method is derived from Cobol Paragraph - 2655-MOVE-CSPTYP SECTION
   *
   * @return
   */
  public MoveCsptypOutCtx moveCsptyp(MoveCsptypInCtx methodIn) throws Exception;

  /**
   * This method is derived from Cobol Paragraph - 2656-MOVE-CSFCND SECTION
   *
   * @return
   */
  public MoveCsfcndOutCtx moveCsfcnd(MoveCsfcndInCtx methodIn) throws Exception;

  /**
   * This method is derived from Cobol Paragraph - 2657-MOVE-CFLG-TABLE SECTION
   *
   * @return
   */
  public MoveCflgTableOutCtx moveCflgTable(MoveCflgTableInCtx methodIn) throws Exception;

  /**
   * This method is derived from Cobol Paragraph - 3100-PROCESS-FUNC-CD-3 SECTION
   *
   * @return
   */
  public ProcessFuncCd3OutCtx processFuncCd3(ProcessFuncCd3InCtx methodIn) throws Exception;

  /**
   * This method is derived from Cobol Paragraph - 3200-OPEN-CSICD-CURSOR SECTION
   *
   * @return
   */
  public OpenCsicdCursor3200OutCtx openCsicdCursor3200(OpenCsicdCursor3200InCtx methodIn)
      throws Exception;

  /**
   * This method is derived from Cobol Paragraph - 3250-FETCH-CSICD SECTION
   *
   * @return
   */
  public FetchCsicd3250OutCtx fetchCsicd3250(FetchCsicd3250InCtx methodIn) throws Exception;

  /**
   * This method is derived from Cobol Paragraph - 3260-CLOSE-CSR SECTION
   *
   * @return
   */
  public CloseCsr3260OutCtx closeCsr3260(CloseCsr3260InCtx methodIn) throws Exception;

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
