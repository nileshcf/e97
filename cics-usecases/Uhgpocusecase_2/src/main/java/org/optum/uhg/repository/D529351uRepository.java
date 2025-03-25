package org.optum.uhg.repository;

import java.sql.ResultSet;
import org.optum.uhg.dto.d529351u.*;

public interface D529351uRepository {
  /**
   * This method will handle the sql operations for a open query.
   *
   * @parm workArea
   * @parm sqlca
   * @parm dclfeSpiPlnVar
   * @return
   */
  public ResultSet openCsplnvD529351u(WorkArea workArea, Sqlca sqlca, DclfeSpiPlnVar dclfeSpiPlnVar)
      throws Exception;

  /**
   * This method will handle the sql operations for a multi-fetch query.
   *
   * @parm hvHostVariablesCsplnv
   * @parm sqlca
   */
  public void fetchCsplnvD529351u(
      ResultSet csplnvResultSet, HvHostVariablesCsplnv hvHostVariablesCsplnv, Sqlca sqlca)
      throws Exception;

  /**
   * This method will handle the sql operations for a close query.
   *
   * @parm sqlca
   */
  public void closeCsplnvD529351u(ResultSet csplnvResultSet, Sqlca sqlca) throws Exception;

  /**
   * This method will handle the sql operations for a open query.
   *
   * @parm dclfeSpiRuleFrToSvc
   * @parm sqlca
   * @return
   */
  public ResultSet openCsfrtoD529351u(DclfeSpiRuleFrToSvc dclfeSpiRuleFrToSvc, Sqlca sqlca)
      throws Exception;

  /**
   * This method will handle the sql operations for a multi-fetch query.
   *
   * @parm hvHostVariablesCsfrto
   * @parm sqlca
   */
  public void fetchCsfrtoD529351u(
      ResultSet csfrtoResultSet, HvHostVariablesCsfrto hvHostVariablesCsfrto, Sqlca sqlca)
      throws Exception;

  /**
   * This method will handle the sql operations for a close query.
   *
   * @parm sqlca
   */
  public void closeCsfrtoD529351u(ResultSet csfrtoResultSet, Sqlca sqlca) throws Exception;

  /**
   * This method will handle the sql operations for a open query.
   *
   * @parm sqlca
   * @parm dclfeSpiRuleProvTyp
   * @return
   */
  public ResultSet openCsptypD529351u(Sqlca sqlca, DclfeSpiRuleProvTyp dclfeSpiRuleProvTyp)
      throws Exception;

  /**
   * This method will handle the sql operations for a fetch query.
   *
   * @parm sqlca
   * @parm dclfeSpiRuleProvTyp
   */
  public void fetchCsptypD529351u(
      ResultSet csptypResultSet, Sqlca sqlca, DclfeSpiRuleProvTyp dclfeSpiRuleProvTyp)
      throws Exception;

  /**
   * This method will handle the sql operations for a close query.
   *
   * @parm sqlca
   */
  public void closeCsptypD529351u(ResultSet csptypResultSet, Sqlca sqlca) throws Exception;

  /**
   * This method will handle the sql operations for a open query.
   *
   * @parm lstIcdKey
   * @parm testVariables
   * @parm sqlca
   * @parm dclfeSpiRuleIcd
   * @return
   */
  public ResultSet openCsicdD529351u(
      LstIcdKey lstIcdKey,
      TestVariables testVariables,
      Sqlca sqlca,
      DclfeSpiRuleIcd dclfeSpiRuleIcd)
      throws Exception;

  /**
   * This method will handle the sql operations for a multi-fetch query.
   *
   * @parm sqlca
   * @parm hvHostVariablesCsicdo
   */
  public void fetchCsicdD529351u(
      ResultSet csicdResultSet, Sqlca sqlca, HvHostVariablesCsicdo hvHostVariablesCsicdo)
      throws Exception;

  /**
   * This method will handle the sql operations for a close query.
   *
   * @parm sqlca
   */
  public void closeCsicdD529351u(ResultSet csicdResultSet, Sqlca sqlca) throws Exception;

  /**
   * This method will handle the sql operations for a open query.
   *
   * @parm dclfeSpiRuleFrCondPos
   * @parm sqlca
   * @return
   */
  public ResultSet openCsfcndD529351u(DclfeSpiRuleFrCondPos dclfeSpiRuleFrCondPos, Sqlca sqlca)
      throws Exception;

  /**
   * This method will handle the sql operations for a fetch query.
   *
   * @parm dclfeSpiRuleFrCondPos
   * @parm sqlca
   */
  public void fetchCsfcndD529351u(
      ResultSet csfcndResultSet, DclfeSpiRuleFrCondPos dclfeSpiRuleFrCondPos, Sqlca sqlca)
      throws Exception;

  /**
   * This method will handle the sql operations for a close query.
   *
   * @parm sqlca
   */
  public void closeCsfcndD529351u(ResultSet csfcndResultSet, Sqlca sqlca) throws Exception;

  /**
   * This method will handle the sql operations for a update query.
   *
   * @parm dclfeSpiRuleCaus
   * @parm sqlca
   */
  public void selectFeSpiRuleCaus(DclfeSpiRuleCaus dclfeSpiRuleCaus, Sqlca sqlca) throws Exception;

  /**
   * This method will handle the sql operations for a update query.
   *
   * @parm dclfeSpiRuleIpa
   * @parm sqlca
   */
  public void selectFeSpiRuleIpa(DclfeSpiRuleIpa dclfeSpiRuleIpa, Sqlca sqlca) throws Exception;

  /**
   * This method will handle the sql operations for a open query.
   *
   * @parm dclfeSpiRuleFrToSvc
   * @parm sqlca
   * @return
   */
  public ResultSet openSvcMainCsrD529351u(DclfeSpiRuleFrToSvc dclfeSpiRuleFrToSvc, Sqlca sqlca)
      throws Exception;

  /**
   * This method will handle the sql operations for a multi-fetch query.
   *
   * @parm sqlca
   * @parm hvHostVariablesSvcmain
   */
  public void fetchSvcMainCsrD529351u(
      ResultSet svcMainCsrResultSet, Sqlca sqlca, HvHostVariablesSvcmain hvHostVariablesSvcmain)
      throws Exception;

  /**
   * This method will handle the sql operations for a close query.
   *
   * @parm sqlca
   */
  public void closeSvcMainCsrD529351u(ResultSet svcMainCsrResultSet, Sqlca sqlca) throws Exception;

  /**
   * This method will handle the sql operations for a open query.
   *
   * @parm dclfeSpiRuleCpeFlg
   * @parm testVariables
   * @parm dclfeSpiRuleCaus
   * @parm dclfeSpiRuleFrCondPos
   * @parm dclfeSpiRuleIpa
   * @parm sqlca
   * @parm dclfeSpiRuleProvTyp
   * @return
   */
  public ResultSet openCombCurD529351u(
      DclfeSpiRuleCpeFlg dclfeSpiRuleCpeFlg,
      TestVariables testVariables,
      DclfeSpiRuleCaus dclfeSpiRuleCaus,
      DclfeSpiRuleFrCondPos dclfeSpiRuleFrCondPos,
      DclfeSpiRuleIpa dclfeSpiRuleIpa,
      Sqlca sqlca,
      DclfeSpiRuleProvTyp dclfeSpiRuleProvTyp)
      throws Exception;

  /**
   * This method will handle the sql operations for a multi-fetch query.
   *
   * @parm sqlca
   * @parm hvHostVariablesCombcr
   */
  public void fetchCombCurD529351u(
      ResultSet combCurResultSet, Sqlca sqlca, HvHostVariablesCombcr hvHostVariablesCombcr)
      throws Exception;

  /**
   * This method will handle the sql operations for a close query.
   *
   * @parm sqlca
   */
  public void closeCombCurD529351u(ResultSet combCurResultSet, Sqlca sqlca) throws Exception;

  /**
   * This method will handle the sql operations for a open query.
   *
   * @parm lstIcdKey
   * @parm testVariables
   * @parm sqlca
   * @parm dclfeSpiRuleIcd
   * @return
   */
  public ResultSet openCsicdFirst9999SpiD529351u(
      LstIcdKey lstIcdKey,
      TestVariables testVariables,
      Sqlca sqlca,
      DclfeSpiRuleIcd dclfeSpiRuleIcd)
      throws Exception;

  /**
   * This method will handle the sql operations for a multi-fetch query.
   *
   * @parm sqlca
   * @parm hvHostVariablesCsicdo
   */
  public void fetchCsicdFirst9999SpiD529351u(
      ResultSet csicdFirst9999SpiResultSet,
      Sqlca sqlca,
      HvHostVariablesCsicdo hvHostVariablesCsicdo)
      throws Exception;

  /**
   * This method will handle the sql operations for a close query.
   *
   * @parm sqlca
   */
  public void closeCsicdFirst9999SpiD529351u(ResultSet csicdFirst9999SpiResultSet, Sqlca sqlca)
      throws Exception;
}
