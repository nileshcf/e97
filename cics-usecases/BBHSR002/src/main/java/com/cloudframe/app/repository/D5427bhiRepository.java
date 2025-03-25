package com.cloudframe.app.repository;

import com.cloudframe.app.dto.d5427bhi.*;
import java.sql.ResultSet;

public interface D5427bhiRepository {
  /**
   * This method will handle the sql operations for a open query.
   *
   * @parm sqlca
   * @parm dclbenHipaaSrvc
   * @return
   */
  public ResultSet openHipaaSrvcCsrD5427bhi(Sqlca sqlca, DclbenHipaaSrvc dclbenHipaaSrvc)
      throws Exception;

  /**
   * This method will handle the sql operations for a fetch query.
   *
   * @parm dclbenHipaaSrvcDtls
   * @parm sqlca
   * @parm dclbenHipaaSrvc
   * @parm work
   */
  public void fetchHipaaSrvcCsrD5427bhi(
      ResultSet hipaaSrvcCsrResultSet,
      DclbenHipaaSrvcDtls dclbenHipaaSrvcDtls,
      Sqlca sqlca,
      DclbenHipaaSrvc dclbenHipaaSrvc,
      Work work)
      throws Exception;

  /**
   * This method will handle the sql operations for a close query.
   *
   * @parm sqlca
   */
  public void closeHipaaSrvcCsrD5427bhi(ResultSet hipaaSrvcCsrResultSet, Sqlca sqlca)
      throws Exception;

  /**
   * This method will handle the sql operations for a open query.
   *
   * @parm sqlca
   * @parm dclbenHipaaSrvc
   * @return
   */
  public ResultSet openCursorSlotTableD5427bhi(Sqlca sqlca, DclbenHipaaSrvc dclbenHipaaSrvc)
      throws Exception;

  /**
   * This method will handle the sql operations for a fetch query.
   *
   * @parm sqlca
   * @parm dclbenHipaaSrvc
   */
  public void fetchCursorSlotTableD5427bhi(
      ResultSet cursorSlotTableResultSet, Sqlca sqlca, DclbenHipaaSrvc dclbenHipaaSrvc)
      throws Exception;

  /**
   * This method will handle the sql operations for a fetch query.
   *
   * @parm sqlca
   * @parm dclbenHipaaSrvc
   */
  public void fetchCursorSlotTable1D5427bhi(
      ResultSet cursorSlotTableResultSet, Sqlca sqlca, DclbenHipaaSrvc dclbenHipaaSrvc)
      throws Exception;

  /**
   * This method will handle the sql operations for a close query.
   *
   * @parm sqlca
   */
  public void closeCursorSlotTableD5427bhi(ResultSet cursorSlotTableResultSet, Sqlca sqlca)
      throws Exception;

  /**
   * This method will handle the sql operations for a open query.
   *
   * @parm sqlca
   * @return
   */
  public ResultSet openCursorAllD5427bhi(Sqlca sqlca) throws Exception;

  /**
   * This method will handle the sql operations for a fetch query.
   *
   * @parm sqlca
   * @parm dclbenHipaaSrvc
   */
  public void fetchCursorAllD5427bhi(
      ResultSet cursorAllResultSet, Sqlca sqlca, DclbenHipaaSrvc dclbenHipaaSrvc) throws Exception;

  /**
   * This method will handle the sql operations for a fetch query.
   *
   * @parm sqlca
   * @parm dclbenHipaaSrvc
   */
  public void fetchCursorAll1D5427bhi(
      ResultSet cursorAllResultSet, Sqlca sqlca, DclbenHipaaSrvc dclbenHipaaSrvc) throws Exception;

  /**
   * This method will handle the sql operations for a close query.
   *
   * @parm sqlca
   */
  public void closeCursorAllD5427bhi(ResultSet cursorAllResultSet, Sqlca sqlca) throws Exception;

  /**
   * This method will handle the sql operations for a update query.
   *
   * @parm sqlca
   * @parm dclbenHipaaSrvc
   */
  public void selectBenHipaaSrvc(Sqlca sqlca, DclbenHipaaSrvc dclbenHipaaSrvc) throws Exception;

  /**
   * This method will handle the sql operations for a update query.
   *
   * @parm sqlca
   * @parm dclbenHipaaSrvc
   */
  public void updateBenHipaaSrvc(Sqlca sqlca, DclbenHipaaSrvc dclbenHipaaSrvc) throws Exception;

  /**
   * This method will handle the sql operations for a update query.
   *
   * @parm sqlca
   * @parm dclslotTbl
   * @parm variables
   */
  public void selectSlotTbl(Sqlca sqlca, DclslotTbl dclslotTbl, Variables variables)
      throws Exception;

  /**
   * This method will handle the sql operations for a update query.
   *
   * @parm sqlca
   * @parm dclbenHipaaSrvc
   * @parm variables
   */
  public void selectSrvcCdTransTbl(
      Sqlca sqlca, DclbenHipaaSrvc dclbenHipaaSrvc, Variables variables) throws Exception;

  /**
   * This method will handle the sql operations for a update query.
   *
   * @parm sqlca
   * @parm dclbenHipaaSrvc
   * @parm variables
   */
  public void selectHipaaProcCd(Sqlca sqlca, DclbenHipaaSrvc dclbenHipaaSrvc, Variables variables)
      throws Exception;

  /**
   * This method will handle the sql operations for a update query.
   *
   * @parm sqlca
   * @parm dclbenHipaaSrvc
   * @parm variables
   */
  public void selectBenHipaaSrvc1(Sqlca sqlca, DclbenHipaaSrvc dclbenHipaaSrvc, Variables variables)
      throws Exception;

  /**
   * This method will handle the sql operations for a update query.
   *
   * @parm sqlca
   * @parm dclbenHipaaSrvc
   * @parm variables
   */
  public void selectBenHipaaSrvc2(Sqlca sqlca, DclbenHipaaSrvc dclbenHipaaSrvc, Variables variables)
      throws Exception;

  /**
   * This method will handle the sql operations for a update query.
   *
   * @parm sqlca
   * @parm dclbenHipaaSrvc
   * @parm variables
   */
  public void selectBenHipaaSrvc3(Sqlca sqlca, DclbenHipaaSrvc dclbenHipaaSrvc, Variables variables)
      throws Exception;

  /**
   * This method will handle the sql operations for a update query.
   *
   * @parm sqlca
   * @parm dclbenHipaaSrvc
   * @parm variables
   */
  public void selectBenHipaaSrvc4(Sqlca sqlca, DclbenHipaaSrvc dclbenHipaaSrvc, Variables variables)
      throws Exception;

  /**
   * This method will handle the sql operations for a update query.
   *
   * @parm sqlca
   * @parm dclbenHipaaSrvc
   * @parm variables
   */
  public void selectBenHipaaSrvc5(Sqlca sqlca, DclbenHipaaSrvc dclbenHipaaSrvc, Variables variables)
      throws Exception;

  /**
   * This method will handle the sql operations for a update query.
   *
   * @parm sqlca
   * @parm dclbenHipaaSrvc
   * @parm variables
   */
  public void selectBenHipaaSrvc6(Sqlca sqlca, DclbenHipaaSrvc dclbenHipaaSrvc, Variables variables)
      throws Exception;

  /**
   * This method will handle the sql operations for a update query.
   *
   * @parm sqlca
   * @parm dclbenHipaaSrvc
   * @parm variables
   */
  public void selectBenHipaaSrvc7(Sqlca sqlca, DclbenHipaaSrvc dclbenHipaaSrvc, Variables variables)
      throws Exception;

  /**
   * This method will handle the sql operations for a update query.
   *
   * @parm sqlca
   * @parm dclbenHipaaSrvc
   * @parm variables
   */
  public void selectBenHipaaSrvc8(Sqlca sqlca, DclbenHipaaSrvc dclbenHipaaSrvc, Variables variables)
      throws Exception;

  /**
   * This method will handle the sql operations for a update query.
   *
   * @parm sqlca
   * @parm dclbenHipaaSrvc
   * @parm variables
   */
  public void selectBenHipaaSrvc9(Sqlca sqlca, DclbenHipaaSrvc dclbenHipaaSrvc, Variables variables)
      throws Exception;

  /**
   * This method will handle the sql operations for a update query.
   *
   * @parm sqlca
   * @parm dclbenHipaaSrvc
   * @parm variables
   */
  public void selectBenHipaaSrvc10(
      Sqlca sqlca, DclbenHipaaSrvc dclbenHipaaSrvc, Variables variables) throws Exception;

  /**
   * This method will handle the sql operations for a update query.
   *
   * @parm sqlca
   * @parm dclbenHipaaSrvc
   * @parm variables
   */
  public void selectBenHipaaSrvc11(
      Sqlca sqlca, DclbenHipaaSrvc dclbenHipaaSrvc, Variables variables) throws Exception;

  /**
   * This method will handle the sql operations for a update query.
   *
   * @parm sqlca
   * @parm dclbenHipaaSrvc
   * @parm variables
   */
  public void selectBenHipaaSrvc12(
      Sqlca sqlca, DclbenHipaaSrvc dclbenHipaaSrvc, Variables variables) throws Exception;

  /**
   * This method will handle the sql operations for a update query.
   *
   * @parm sqlca
   * @parm dclbenHipaaSrvc
   */
  public void insertBenHipaaSrvc(Sqlca sqlca, DclbenHipaaSrvc dclbenHipaaSrvc) throws Exception;

  /**
   * This method will handle the sql operations for a update query.
   *
   * @parm sqlca
   * @parm dclbenHipaaSrvc
   */
  public void updateBenHipaaSrvc1(Sqlca sqlca, DclbenHipaaSrvc dclbenHipaaSrvc) throws Exception;
}
