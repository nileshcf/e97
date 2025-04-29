package com.optum.uhg.app.repository;

import com.cloudframe.app.data.Field;
import com.optum.uhg.app.dto.d5427dt1.*;
import java.sql.ResultSet;

public interface D5427dt1Repository {
  /**
   * This method will handle the sql operations for a update query.
   *
   * @parm dcladjdClmsfRef
   * @parm sqlca
   */
  public void selectAdjdClmsfRef(DcladjdClmsfRef dcladjdClmsfRef, Sqlca sqlca) throws Exception;

  /**
   * This method will handle the sql operations for a open query.
   *
   * @parm hostVariables
   * @parm sqlca
   * @parm dcladjdClmhstDenormRef
   * @return
   */
  public ResultSet openCsrInitFil2D5427dt1(
      HostVariables hostVariables, Sqlca sqlca, DcladjdClmhstDenormRef dcladjdClmhstDenormRef)
      throws Exception;

  /**
   * This method will handle the sql operations for a multi-fetch query.
   *
   * @parm work
   * @parm hvaClmHistArray
   * @parm sqlca
   */
  public void fetchCsrInitFil2D5427dt1(
      ResultSet csrInitFil2ResultSet, Work work, HvaClmHistArray hvaClmHistArray, Sqlca sqlca)
      throws Exception;

  /**
   * This method will handle the sql operations for a close query.
   *
   * @parm sqlca
   */
  public void closeCsrInitFil2D5427dt1(ResultSet csrInitFil2ResultSet, Sqlca sqlca)
      throws Exception;

  /**
   * This method will handle the sql operations for a open query.
   *
   * @parm hostVariables
   * @parm sqlca
   * @parm dcladjdClmhstDenormRef
   * @return
   */
  public ResultSet openCsrNextFil2D5427dt1(
      HostVariables hostVariables, Sqlca sqlca, DcladjdClmhstDenormRef dcladjdClmhstDenormRef)
      throws Exception;

  /**
   * This method will handle the sql operations for a multi-fetch query.
   *
   * @parm work
   * @parm hvaClmHistArray
   * @parm sqlca
   */
  public void fetchCsrNextFil2D5427dt1(
      ResultSet csrNextFil2ResultSet, Work work, HvaClmHistArray hvaClmHistArray, Sqlca sqlca)
      throws Exception;

  /**
   * This method will handle the sql operations for a close query.
   *
   * @parm sqlca
   */
  public void closeCsrNextFil2D5427dt1(ResultSet csrNextFil2ResultSet, Sqlca sqlca)
      throws Exception;

  /**
   * This method will handle the sql operations for a open query.
   *
   * @parm queryTextArea
   * @parm sqlca
   */
  public void prepare(QueryTextArea queryTextArea, Sqlca sqlca) throws Exception;

  /**
   * This method will handle the sql operations for a open query.
   *
   * @parm sqlca
   * @parm dcladjdClmhstDenormRef
   * @return
   */
  public ResultSet openCsrInitFullD5427dt1(
      Sqlca sqlca, DcladjdClmhstDenormRef dcladjdClmhstDenormRef) throws Exception;

  /**
   * This method will handle the sql operations for a multi-fetch query.
   *
   * @parm work
   * @parm hvaClmHistArray
   * @parm sqlca
   */
  public void fetchCsrInitFullD5427dt1(
      ResultSet csrInitFullResultSet, Work work, HvaClmHistArray hvaClmHistArray, Sqlca sqlca)
      throws Exception;

  /**
   * This method will handle the sql operations for a close query.
   *
   * @parm sqlca
   */
  public void closeCsrInitFullD5427dt1(ResultSet csrInitFullResultSet, Sqlca sqlca)
      throws Exception;

  /**
   * This method will handle the sql operations for a open query.
   *
   * @parm hostVariables
   * @parm sqlca
   * @parm dcladjdClmhstDenormRef
   * @return
   */
  public ResultSet openCsrInitFiltD5427dt1(
      HostVariables hostVariables, Sqlca sqlca, DcladjdClmhstDenormRef dcladjdClmhstDenormRef)
      throws Exception;

  /**
   * This method will handle the sql operations for a multi-fetch query.
   *
   * @parm work
   * @parm hvaClmHistArray
   * @parm sqlca
   */
  public void fetchCsrInitFiltD5427dt1(
      ResultSet csrInitFiltResultSet, Work work, HvaClmHistArray hvaClmHistArray, Sqlca sqlca)
      throws Exception;

  /**
   * This method will handle the sql operations for a close query.
   *
   * @parm sqlca
   */
  public void closeCsrInitFiltD5427dt1(ResultSet csrInitFiltResultSet, Sqlca sqlca)
      throws Exception;

  /**
   * This method will handle the sql operations for a open query.
   *
   * @parm sqlca
   * @parm dcladjdClmhstDenormRef
   * @return
   */
  public ResultSet openCsrNextFullD5427dt1(
      Sqlca sqlca, DcladjdClmhstDenormRef dcladjdClmhstDenormRef) throws Exception;

  /**
   * This method will handle the sql operations for a multi-fetch query.
   *
   * @parm work
   * @parm hvaClmHistArray
   * @parm sqlca
   */
  public void fetchCsrNextFullD5427dt1(
      ResultSet csrNextFullResultSet, Work work, HvaClmHistArray hvaClmHistArray, Sqlca sqlca)
      throws Exception;

  /**
   * This method will handle the sql operations for a close query.
   *
   * @parm sqlca
   */
  public void closeCsrNextFullD5427dt1(ResultSet csrNextFullResultSet, Sqlca sqlca)
      throws Exception;

  /**
   * This method will handle the sql operations for a open query.
   *
   * @parm hostVariables
   * @parm sqlca
   * @parm dcladjdClmhstDenormRef
   * @return
   */
  public ResultSet openCsrNextFiltD5427dt1(
      HostVariables hostVariables, Sqlca sqlca, DcladjdClmhstDenormRef dcladjdClmhstDenormRef)
      throws Exception;

  /**
   * This method will handle the sql operations for a multi-fetch query.
   *
   * @parm work
   * @parm hvaClmHistArray
   * @parm sqlca
   */
  public void fetchCsrNextFiltD5427dt1(
      ResultSet csrNextFiltResultSet, Work work, HvaClmHistArray hvaClmHistArray, Sqlca sqlca)
      throws Exception;

  /**
   * This method will handle the sql operations for a close query.
   *
   * @parm sqlca
   */
  public void closeCsrNextFiltD5427dt1(ResultSet csrNextFiltResultSet, Sqlca sqlca)
      throws Exception;

  /**
   * This method will handle the sql operations for a open query.
   *
   * @parm hostVariables
   * @parm sqlca
   * @parm dcladjdClmhstDenormRef
   * @return
   */
  public ResultSet openCsrInitFil3D5427dt1(
      HostVariables hostVariables, Sqlca sqlca, DcladjdClmhstDenormRef dcladjdClmhstDenormRef)
      throws Exception;

  /**
   * This method will handle the sql operations for a multi-fetch query.
   *
   * @parm work
   * @parm hvaClmHistArray
   * @parm sqlca
   */
  public void fetchCsrInitFil3D5427dt1(
      ResultSet csrInitFil3ResultSet, Work work, HvaClmHistArray hvaClmHistArray, Sqlca sqlca)
      throws Exception;

  /**
   * This method will handle the sql operations for a close query.
   *
   * @parm sqlca
   */
  public void closeCsrInitFil3D5427dt1(ResultSet csrInitFil3ResultSet, Sqlca sqlca)
      throws Exception;

  /**
   * This method will handle the sql operations for a open query.
   *
   * @parm hostVariables
   * @parm sqlca
   * @parm dcladjdClmhstDenormRef
   * @return
   */
  public ResultSet openCsrNextFil3D5427dt1(
      HostVariables hostVariables, Sqlca sqlca, DcladjdClmhstDenormRef dcladjdClmhstDenormRef)
      throws Exception;

  /**
   * This method will handle the sql operations for a multi-fetch query.
   *
   * @parm work
   * @parm hvaClmHistArray
   * @parm sqlca
   */
  public void fetchCsrNextFil3D5427dt1(
      ResultSet csrNextFil3ResultSet, Work work, HvaClmHistArray hvaClmHistArray, Sqlca sqlca)
      throws Exception;

  /**
   * This method will handle the sql operations for a close query.
   *
   * @parm sqlca
   */
  public void closeCsrNextFil3D5427dt1(ResultSet csrNextFil3ResultSet, Sqlca sqlca)
      throws Exception;

  /**
   * This method will handle the sql operations for a open query.
   *
   * @parm hostVariables
   * @parm sqlca
   * @parm dcladjdClmhstDenormRef
   * @return
   */
  public ResultSet openCsrInitFil4D5427dt1(
      HostVariables hostVariables, Sqlca sqlca, DcladjdClmhstDenormRef dcladjdClmhstDenormRef)
      throws Exception;

  /**
   * This method will handle the sql operations for a multi-fetch query.
   *
   * @parm work
   * @parm hvaClmHistArray
   * @parm sqlca
   */
  public void fetchCsrInitFil4D5427dt1(
      ResultSet csrInitFil4ResultSet, Work work, HvaClmHistArray hvaClmHistArray, Sqlca sqlca)
      throws Exception;

  /**
   * This method will handle the sql operations for a close query.
   *
   * @parm sqlca
   */
  public void closeCsrInitFil4D5427dt1(ResultSet csrInitFil4ResultSet, Sqlca sqlca)
      throws Exception;

  /**
   * This method will handle the sql operations for a open query.
   *
   * @parm hostVariables
   * @parm sqlca
   * @parm dcladjdClmhstDenormRef
   * @return
   */
  public ResultSet openCsrNextFil4D5427dt1(
      HostVariables hostVariables, Sqlca sqlca, DcladjdClmhstDenormRef dcladjdClmhstDenormRef)
      throws Exception;

  /**
   * This method will handle the sql operations for a multi-fetch query.
   *
   * @parm work
   * @parm hvaClmHistArray
   * @parm sqlca
   */
  public void fetchCsrNextFil4D5427dt1(
      ResultSet csrNextFil4ResultSet, Work work, HvaClmHistArray hvaClmHistArray, Sqlca sqlca)
      throws Exception;

  /**
   * This method will handle the sql operations for a close query.
   *
   * @parm sqlca
   */
  public void closeCsrNextFil4D5427dt1(ResultSet csrNextFil4ResultSet, Sqlca sqlca)
      throws Exception;

  /**
   * This method will handle the sql operations for a open query.
   *
   * @parm hostVariables
   * @parm sqlca
   * @parm dcladjdClmhstDenormRef
   * @return
   */
  public ResultSet openCsrInitFil5D5427dt1(
      HostVariables hostVariables, Sqlca sqlca, DcladjdClmhstDenormRef dcladjdClmhstDenormRef)
      throws Exception;

  /**
   * This method will handle the sql operations for a multi-fetch query.
   *
   * @parm work
   * @parm hvaClmHistArray
   * @parm sqlca
   */
  public void fetchCsrInitFil5D5427dt1(
      ResultSet csrInitFil5ResultSet, Work work, HvaClmHistArray hvaClmHistArray, Sqlca sqlca)
      throws Exception;

  /**
   * This method will handle the sql operations for a close query.
   *
   * @parm sqlca
   */
  public void closeCsrInitFil5D5427dt1(ResultSet csrInitFil5ResultSet, Sqlca sqlca)
      throws Exception;

  /**
   * This method will handle the sql operations for a open query.
   *
   * @parm hostVariables
   * @parm sqlca
   * @parm dcladjdClmhstDenormRef
   * @return
   */
  public ResultSet openCsrNextFil5D5427dt1(
      HostVariables hostVariables, Sqlca sqlca, DcladjdClmhstDenormRef dcladjdClmhstDenormRef)
      throws Exception;

  /**
   * This method will handle the sql operations for a multi-fetch query.
   *
   * @parm work
   * @parm hvaClmHistArray
   * @parm sqlca
   */
  public void fetchCsrNextFil5D5427dt1(
      ResultSet csrNextFil5ResultSet, Work work, HvaClmHistArray hvaClmHistArray, Sqlca sqlca)
      throws Exception;

  /**
   * This method will handle the sql operations for a close query.
   *
   * @parm sqlca
   */
  public void closeCsrNextFil5D5427dt1(ResultSet csrNextFil5ResultSet, Sqlca sqlca)
      throws Exception;

  /**
   * This method will handle the sql operations for a open query.
   *
   * @parm hostVariables
   * @parm sqlca
   * @parm dcladjdClmhstDenormRef
   * @return
   */
  public ResultSet openCsrInitFil6D5427dt1(
      HostVariables hostVariables, Sqlca sqlca, DcladjdClmhstDenormRef dcladjdClmhstDenormRef)
      throws Exception;

  /**
   * This method will handle the sql operations for a multi-fetch query.
   *
   * @parm work
   * @parm hvaClmHistArray
   * @parm sqlca
   */
  public void fetchCsrInitFil6D5427dt1(
      ResultSet csrInitFil6ResultSet, Work work, HvaClmHistArray hvaClmHistArray, Sqlca sqlca)
      throws Exception;

  /**
   * This method will handle the sql operations for a close query.
   *
   * @parm sqlca
   */
  public void closeCsrInitFil6D5427dt1(ResultSet csrInitFil6ResultSet, Sqlca sqlca)
      throws Exception;

  /**
   * This method will handle the sql operations for a open query.
   *
   * @parm hostVariables
   * @parm sqlca
   * @parm dcladjdClmhstDenormRef
   * @return
   */
  public ResultSet openCsrNextFil6D5427dt1(
      HostVariables hostVariables, Sqlca sqlca, DcladjdClmhstDenormRef dcladjdClmhstDenormRef)
      throws Exception;

  /**
   * This method will handle the sql operations for a multi-fetch query.
   *
   * @parm work
   * @parm hvaClmHistArray
   * @parm sqlca
   */
  public void fetchCsrNextFil6D5427dt1(
      ResultSet csrNextFil6ResultSet, Work work, HvaClmHistArray hvaClmHistArray, Sqlca sqlca)
      throws Exception;

  /**
   * This method will handle the sql operations for a close query.
   *
   * @parm sqlca
   */
  public void closeCsrNextFil6D5427dt1(ResultSet csrNextFil6ResultSet, Sqlca sqlca)
      throws Exception;

  /**
   * This method will handle the sql operations for a open query.
   *
   * @parm sqlca
   * @return
   */
  public ResultSet openDt1DynCursorD5427dt1(Field sqlda, Sqlca sqlca) throws Exception;

  /**
   * This method will handle the sql operations for a multi-fetch query.
   *
   * @parm work
   * @parm hvaClmHistArray
   * @parm sqlca
   */
  public void fetchDt1DynCursorD5427dt1(
      ResultSet dt1DynCursorResultSet, Work work, HvaClmHistArray hvaClmHistArray, Sqlca sqlca)
      throws Exception;

  /**
   * This method will handle the sql operations for a close query.
   *
   * @parm sqlca
   */
  public void closeDt1DynCursorD5427dt1(ResultSet dt1DynCursorResultSet, Sqlca sqlca)
      throws Exception;
}
