package com.cloudframe.app.repository;

import com.cloudframe.app.dto.d5427hpc.*;
import java.sql.ResultSet;

public interface D5427hpcRepository {
  /**
   * This method will handle the sql operations for a open query.
   *
   * @parm sqlca
   * @parm dclhipaaProcCd
   * @return
   */
  public ResultSet openHipaaGenericCsrD5427hpc(Sqlca sqlca, DclhipaaProcCd dclhipaaProcCd)
      throws Exception;

  /**
   * This method will handle the sql operations for a fetch query.
   *
   * @parm sqlca
   * @parm dclhipaaProcCd
   */
  public void fetchHipaaGenericCsrD5427hpc(
      ResultSet hipaaGenericCsrResultSet, Sqlca sqlca, DclhipaaProcCd dclhipaaProcCd)
      throws Exception;

  /**
   * This method will handle the sql operations for a close query.
   *
   * @parm sqlca
   */
  public void closeHipaaGenericCsrD5427hpc(ResultSet hipaaGenericCsrResultSet, Sqlca sqlca)
      throws Exception;

  /**
   * This method will handle the sql operations for a open query.
   *
   * @parm sqlca
   * @parm dclhipaaProcCd
   * @return
   */
  public ResultSet openHipaaGroupCsrD5427hpc(Sqlca sqlca, DclhipaaProcCd dclhipaaProcCd)
      throws Exception;

  /**
   * This method will handle the sql operations for a fetch query.
   *
   * @parm sqlca
   * @parm dclhipaaProcCd
   */
  public void fetchHipaaGroupCsrD5427hpc(
      ResultSet hipaaGroupCsrResultSet, Sqlca sqlca, DclhipaaProcCd dclhipaaProcCd)
      throws Exception;

  /**
   * This method will handle the sql operations for a close query.
   *
   * @parm sqlca
   */
  public void closeHipaaGroupCsrD5427hpc(ResultSet hipaaGroupCsrResultSet, Sqlca sqlca)
      throws Exception;

  /**
   * This method will handle the sql operations for a update query.
   *
   * @parm sqlca
   * @parm dclhipaaProcCd
   */
  public void selectHipaaProcCd(Sqlca sqlca, DclhipaaProcCd dclhipaaProcCd) throws Exception;

  /**
   * This method will handle the sql operations for a open query.
   *
   * @parm sqlca
   * @parm hvHipaaCodeList
   * @parm dclhipaaProcCd
   * @return
   */
  public ResultSet openHipaaListCsrD5427hpc(
      Sqlca sqlca, HvHipaaCodeList hvHipaaCodeList, DclhipaaProcCd dclhipaaProcCd) throws Exception;

  /**
   * This method will handle the sql operations for a fetch query.
   *
   * @parm sqlca
   * @parm dclhipaaProcCd
   */
  public void fetchHipaaListCsrD5427hpc(
      ResultSet hipaaListCsrResultSet, Sqlca sqlca, DclhipaaProcCd dclhipaaProcCd) throws Exception;

  /**
   * This method will handle the sql operations for a close query.
   *
   * @parm sqlca
   */
  public void closeHipaaListCsrD5427hpc(ResultSet hipaaListCsrResultSet, Sqlca sqlca)
      throws Exception;

  /**
   * This method will handle the sql operations for a open query.
   *
   * @parm sqlca
   * @parm dclhipaaProcCd
   * @return
   */
  public ResultSet openHipaaAllCsrD5427hpc(Sqlca sqlca, DclhipaaProcCd dclhipaaProcCd)
      throws Exception;

  /**
   * This method will handle the sql operations for a fetch query.
   *
   * @parm sqlca
   * @parm dclhipaaProcCd
   */
  public void fetchHipaaAllCsrD5427hpc(
      ResultSet hipaaAllCsrResultSet, Sqlca sqlca, DclhipaaProcCd dclhipaaProcCd) throws Exception;

  /**
   * This method will handle the sql operations for a close query.
   *
   * @parm sqlca
   */
  public void closeHipaaAllCsrD5427hpc(ResultSet hipaaAllCsrResultSet, Sqlca sqlca)
      throws Exception;
}
