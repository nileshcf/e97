package com.cloudframe.app.repository;

import com.cloudframe.app.dto.d5427pol.*;
import java.sql.ResultSet;

public interface D5427polRepository {
  /**
   * This method will handle the sql operations for a update query.
   *
   * @parm sqlca
   * @parm dclcustPolPlnXref
   */
  public void selectCustPolPlnXref(Sqlca sqlca, DclcustPolPlnXref dclcustPolPlnXref)
      throws Exception;

  /**
   * This method will handle the sql operations for a update query.
   *
   * @parm sqlca
   * @parm dclcustPolPlnXref
   */
  public void selectCustPolPlnXref1(Sqlca sqlca, DclcustPolPlnXref dclcustPolPlnXref)
      throws Exception;

  /**
   * This method will handle the sql operations for a open query.
   *
   * @parm sqlca
   * @parm dclcustPolPlnXref
   * @return
   */
  public ResultSet openCurMxiCsrD5427pol(Sqlca sqlca, DclcustPolPlnXref dclcustPolPlnXref)
      throws Exception;

  /**
   * This method will handle the sql operations for a fetch query.
   *
   * @parm sqlca
   * @parm dclcustPolPlnXref
   */
  public void fetchCurMxiCsrD5427pol(
      ResultSet curMxiCsrResultSet, Sqlca sqlca, DclcustPolPlnXref dclcustPolPlnXref)
      throws Exception;

  /**
   * This method will handle the sql operations for a close query.
   *
   * @parm sqlca
   */
  public void closeCurMxiCsrD5427pol(ResultSet curMxiCsrResultSet, Sqlca sqlca) throws Exception;

  /**
   * This method will handle the sql operations for a update query.
   *
   * @parm dclpolPlnMstr
   * @parm sqlca
   */
  public void selectPolPlnMstr(DclpolPlnMstr dclpolPlnMstr, Sqlca sqlca) throws Exception;

  /**
   * This method will handle the sql operations for a update query.
   *
   * @parm dclpolPlnMstr
   * @parm dclntwkRcprctyDtl
   * @parm sqlca
   */
  public void selectNtwkRcprctyDtl(
      DclpolPlnMstr dclpolPlnMstr, DclntwkRcprctyDtl dclntwkRcprctyDtl, Sqlca sqlca)
      throws Exception;

  /**
   * This method will handle the sql operations for a update query.
   *
   * @parm sqlca
   * @parm dclcustPolPlnXref
   */
  public void selectCustPolPlnXref2(Sqlca sqlca, DclcustPolPlnXref dclcustPolPlnXref)
      throws Exception;

  /**
   * This method will handle the sql operations for a update query.
   *
   * @parm dclpolPlnMstr
   * @parm sqlca
   */
  public void selectPolPlnMstr1(DclpolPlnMstr dclpolPlnMstr, Sqlca sqlca) throws Exception;

  /**
   * This method will handle the sql operations for a update query.
   *
   * @parm sqlca
   * @parm dclcustPolPlnXref
   */
  public void selectCustPolPlnXref3(Sqlca sqlca, DclcustPolPlnXref dclcustPolPlnXref)
      throws Exception;

  /**
   * This method will handle the sql operations for a update query.
   *
   * @parm dclpolPlnMstrAddtlInfo
   * @parm dclpolPlnMstrSviInfo
   * @parm dclpolPlnMstr
   * @parm sqlca
   * @parm sviTablesData
   */
  public void selectPolPlnMstr2(
      DclpolPlnMstrAddtlInfo dclpolPlnMstrAddtlInfo,
      DclpolPlnMstrSviInfo dclpolPlnMstrSviInfo,
      DclpolPlnMstr dclpolPlnMstr,
      Sqlca sqlca,
      SviTablesData sviTablesData)
      throws Exception;

  /**
   * This method will handle the sql operations for a update query.
   *
   * @parm dclpolPlnMstrAddtlInfo
   * @parm dclpolPlnMstr
   * @parm sqlca
   */
  public void selectPolPlnMstr3(
      DclpolPlnMstrAddtlInfo dclpolPlnMstrAddtlInfo, DclpolPlnMstr dclpolPlnMstr, Sqlca sqlca)
      throws Exception;

  /**
   * This method will handle the sql operations for a update query.
   *
   * @parm sqlca
   * @parm dclcustPolPlnXref
   */
  public void selectCustPolPlnXref4(Sqlca sqlca, DclcustPolPlnXref dclcustPolPlnXref)
      throws Exception;

  /**
   * This method will handle the sql operations for a update query.
   *
   * @parm dclpolPlnMstrAddtlInfo
   * @parm dclpolPlnMstr
   * @parm sqlca
   */
  public void selectPolPlnMstr4(
      DclpolPlnMstrAddtlInfo dclpolPlnMstrAddtlInfo, DclpolPlnMstr dclpolPlnMstr, Sqlca sqlca)
      throws Exception;

  /**
   * This method will handle the sql operations for a open query.
   *
   * @parm sqlca
   * @parm dclpolPlnMstrBenLvl
   * @return
   */
  public ResultSet openCurBenLvlD5427pol(Sqlca sqlca, DclpolPlnMstrBenLvl dclpolPlnMstrBenLvl)
      throws Exception;

  /**
   * This method will handle the sql operations for a fetch query.
   *
   * @parm sqlca
   * @parm dclpolPlnMstrBenLvl
   */
  public void fetchCurBenLvlD5427pol(
      ResultSet curBenLvlResultSet, Sqlca sqlca, DclpolPlnMstrBenLvl dclpolPlnMstrBenLvl)
      throws Exception;

  /**
   * This method will handle the sql operations for a close query.
   *
   * @parm sqlca
   */
  public void closeCurBenLvlD5427pol(ResultSet curBenLvlResultSet, Sqlca sqlca) throws Exception;

  /**
   * This method will handle the sql operations for a open query.
   *
   * @parm dclpolPlnMstrFamDed
   * @parm sqlca
   * @return
   */
  public ResultSet openCurFamDedD5427pol(DclpolPlnMstrFamDed dclpolPlnMstrFamDed, Sqlca sqlca)
      throws Exception;

  /**
   * This method will handle the sql operations for a fetch query.
   *
   * @parm dclpolPlnMstrFamDed
   * @parm sqlca
   */
  public void fetchCurFamDedD5427pol(
      ResultSet curFamDedResultSet, DclpolPlnMstrFamDed dclpolPlnMstrFamDed, Sqlca sqlca)
      throws Exception;

  /**
   * This method will handle the sql operations for a close query.
   *
   * @parm sqlca
   */
  public void closeCurFamDedD5427pol(ResultSet curFamDedResultSet, Sqlca sqlca) throws Exception;

  /**
   * This method will handle the sql operations for a open query.
   *
   * @parm sqlca
   * @parm dclpolPlnMstrIndvDed
   * @return
   */
  public ResultSet openCurIndDedD5427pol(Sqlca sqlca, DclpolPlnMstrIndvDed dclpolPlnMstrIndvDed)
      throws Exception;

  /**
   * This method will handle the sql operations for a fetch query.
   *
   * @parm sqlca
   * @parm dclpolPlnMstrIndvDed
   */
  public void fetchCurIndDedD5427pol(
      ResultSet curIndDedResultSet, Sqlca sqlca, DclpolPlnMstrIndvDed dclpolPlnMstrIndvDed)
      throws Exception;

  /**
   * This method will handle the sql operations for a close query.
   *
   * @parm sqlca
   */
  public void closeCurIndDedD5427pol(ResultSet curIndDedResultSet, Sqlca sqlca) throws Exception;

  /**
   * This method will handle the sql operations for a open query.
   *
   * @parm sqlca
   * @parm dclpolPlnAccumRule
   * @return
   */
  public ResultSet openCurCopayOopCsrD5427pol(Sqlca sqlca, DclpolPlnAccumRule dclpolPlnAccumRule)
      throws Exception;

  /**
   * This method will handle the sql operations for a fetch query.
   *
   * @parm sqlca
   * @parm dclpolPlnAccumRule
   */
  public void fetchCurCopayOopCsrD5427pol(
      ResultSet curCopayOopCsrResultSet, Sqlca sqlca, DclpolPlnAccumRule dclpolPlnAccumRule)
      throws Exception;

  /**
   * This method will handle the sql operations for a close query.
   *
   * @parm sqlca
   */
  public void closeCurCopayOopCsrD5427pol(ResultSet curCopayOopCsrResultSet, Sqlca sqlca)
      throws Exception;

  /**
   * This method will handle the sql operations for a update query.
   *
   * @parm dclpolPlnMstrAddtlInfo
   * @parm dclpolPlnMstr
   * @parm sqlca
   */
  public void selectPolPlnMstr5(
      DclpolPlnMstrAddtlInfo dclpolPlnMstrAddtlInfo, DclpolPlnMstr dclpolPlnMstr, Sqlca sqlca)
      throws Exception;

  /**
   * This method will handle the sql operations for a update query.
   *
   * @parm sqlca
   * @parm dclcustPolPlnXref
   */
  public void selectCustPolPlnXref5(Sqlca sqlca, DclcustPolPlnXref dclcustPolPlnXref)
      throws Exception;

  /**
   * This method will handle the sql operations for a update query.
   *
   * @parm dclpolPlnMstr
   * @parm sqlca
   */
  public void selectPolPlnMstr6(DclpolPlnMstr dclpolPlnMstr, Sqlca sqlca) throws Exception;

  /**
   * This method will handle the sql operations for a open query.
   *
   * @parm dclpolPlnMstrFamDed
   * @parm sqlca
   * @return
   */
  public ResultSet openCurFamDedCsrD5427pol(DclpolPlnMstrFamDed dclpolPlnMstrFamDed, Sqlca sqlca)
      throws Exception;

  /**
   * This method will handle the sql operations for a fetch query.
   *
   * @parm dclpolPlnMstrFamDed
   * @parm sqlca
   */
  public void fetchCurFamDedCsrD5427pol(
      ResultSet curFamDedCsrResultSet, DclpolPlnMstrFamDed dclpolPlnMstrFamDed, Sqlca sqlca)
      throws Exception;

  /**
   * This method will handle the sql operations for a close query.
   *
   * @parm sqlca
   */
  public void closeCurFamDedCsrD5427pol(ResultSet curFamDedCsrResultSet, Sqlca sqlca)
      throws Exception;

  /**
   * This method will handle the sql operations for a open query.
   *
   * @parm sqlca
   * @parm dclpolPlnMstrIndvDed
   * @return
   */
  public ResultSet openCurIndDedCsrD5427pol(Sqlca sqlca, DclpolPlnMstrIndvDed dclpolPlnMstrIndvDed)
      throws Exception;

  /**
   * This method will handle the sql operations for a fetch query.
   *
   * @parm sqlca
   * @parm dclpolPlnMstrIndvDed
   */
  public void fetchCurIndDedCsrD5427pol(
      ResultSet curIndDedCsrResultSet, Sqlca sqlca, DclpolPlnMstrIndvDed dclpolPlnMstrIndvDed)
      throws Exception;

  /**
   * This method will handle the sql operations for a close query.
   *
   * @parm sqlca
   */
  public void closeCurIndDedCsrD5427pol(ResultSet curIndDedCsrResultSet, Sqlca sqlca)
      throws Exception;

  /**
   * This method will handle the sql operations for a update query.
   *
   * @parm sqlca
   * @parm dclcustPolPlnXref
   */
  public void selectCustPolPlnXref6(Sqlca sqlca, DclcustPolPlnXref dclcustPolPlnXref)
      throws Exception;

  /**
   * This method will handle the sql operations for a update query.
   *
   * @parm dclpolPlnMstrAddtlInfo
   * @parm dclpolPlnMstr
   * @parm sqlca
   */
  public void selectPolPlnMstr7(
      DclpolPlnMstrAddtlInfo dclpolPlnMstrAddtlInfo, DclpolPlnMstr dclpolPlnMstr, Sqlca sqlca)
      throws Exception;

  /**
   * This method will handle the sql operations for a update query.
   *
   * @parm dclpolPlnMstr
   * @parm dclntwkRcprctyDtl
   * @parm sqlca
   */
  public void selectNtwkRcprctyDtl1(
      DclpolPlnMstr dclpolPlnMstr, DclntwkRcprctyDtl dclntwkRcprctyDtl, Sqlca sqlca)
      throws Exception;

  /**
   * This method will handle the sql operations for a update query.
   *
   * @parm dclpolPlnMstr
   * @parm dclntwkRcprctyDtl
   * @parm sqlca
   */
  public void selectNtwkRcprctyDtl2(
      DclpolPlnMstr dclpolPlnMstr, DclntwkRcprctyDtl dclntwkRcprctyDtl, Sqlca sqlca)
      throws Exception;

  /**
   * This method will handle the sql operations for a update query.
   *
   * @parm dclpolPlnMstr
   * @parm dclntwkRcprctyDtl
   * @parm sqlca
   */
  public void selectNtwkRcprctyDtl3(
      DclpolPlnMstr dclpolPlnMstr, DclntwkRcprctyDtl dclntwkRcprctyDtl, Sqlca sqlca)
      throws Exception;

  /**
   * This method will handle the sql operations for a update query.
   *
   * @parm dclpolPlnMstr
   * @parm dclntwkRcprctyDtl
   * @parm sqlca
   */
  public void selectNtwkRcprctyDtl4(
      DclpolPlnMstr dclpolPlnMstr, DclntwkRcprctyDtl dclntwkRcprctyDtl, Sqlca sqlca)
      throws Exception;

  /**
   * This method will handle the sql operations for a update query.
   *
   * @parm dclpolPlnMstr
   * @parm dclntwkRcprctyDtl
   * @parm sqlca
   */
  public void selectNtwkRcprctyDtl5(
      DclpolPlnMstr dclpolPlnMstr, DclntwkRcprctyDtl dclntwkRcprctyDtl, Sqlca sqlca)
      throws Exception;

  /**
   * This method will handle the sql operations for a update query.
   *
   * @parm dclpolPlnMstr
   * @parm dclntwkRcprctyDtl
   * @parm sqlca
   */
  public void selectNtwkRcprctyDtl6(
      DclpolPlnMstr dclpolPlnMstr, DclntwkRcprctyDtl dclntwkRcprctyDtl, Sqlca sqlca)
      throws Exception;

  /**
   * This method will handle the sql operations for a open query.
   *
   * @parm dclpolPlnMstr
   * @parm sqlca
   * @return
   */
  public ResultSet openTherapyCsrD5427pol(DclpolPlnMstr dclpolPlnMstr, Sqlca sqlca)
      throws Exception;

  /**
   * This method will handle the sql operations for a fetch query.
   *
   * @parm sqlca
   * @parm dclpolPlnMstrPhysMedcn
   */
  public void fetchTherapyCsrD5427pol(
      ResultSet therapyCsrResultSet, Sqlca sqlca, DclpolPlnMstrPhysMedcn dclpolPlnMstrPhysMedcn)
      throws Exception;

  /**
   * This method will handle the sql operations for a close query.
   *
   * @parm sqlca
   */
  public void closeTherapyCsrD5427pol(ResultSet therapyCsrResultSet, Sqlca sqlca) throws Exception;

  /**
   * This method will handle the sql operations for a update query.
   *
   * @parm workVariables
   * @parm sqlca
   */
  public void selectPolPlnDenorm(WorkVariables workVariables, Sqlca sqlca) throws Exception;

  /**
   * This method will handle the sql operations for a update query.
   *
   * @parm sqlca
   * @parm dclcustPolPlnXref
   */
  public void selectCustPolPlnXref7(Sqlca sqlca, DclcustPolPlnXref dclcustPolPlnXref)
      throws Exception;

  /**
   * This method will handle the sql operations for a update query.
   *
   * @parm dclpolPlnMstrAddtlInfo
   * @parm dclpolPlnMstr
   * @parm sqlca
   */
  public void selectPolPlnMstr8(
      DclpolPlnMstrAddtlInfo dclpolPlnMstrAddtlInfo, DclpolPlnMstr dclpolPlnMstr, Sqlca sqlca)
      throws Exception;

  /**
   * This method will handle the sql operations for a update query.
   *
   * @parm sqlca
   * @parm dclcustPolPlnXref
   */
  public void selectCustPolPlnXref8(Sqlca sqlca, DclcustPolPlnXref dclcustPolPlnXref)
      throws Exception;

  /**
   * This method will handle the sql operations for a update query.
   *
   * @parm dclpolPlnMstrAddtlInfo
   * @parm dclpolPlnMstr
   * @parm sqlca
   */
  public void selectPolPlnMstr9(
      DclpolPlnMstrAddtlInfo dclpolPlnMstrAddtlInfo, DclpolPlnMstr dclpolPlnMstr, Sqlca sqlca)
      throws Exception;
}
