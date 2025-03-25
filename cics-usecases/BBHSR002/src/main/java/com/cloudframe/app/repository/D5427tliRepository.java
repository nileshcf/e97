package com.cloudframe.app.repository;

import com.cloudframe.app.dto.d5427tli.*;
import java.sql.ResultSet;

public interface D5427tliRepository {
  /**
   * This method will handle the sql operations for a open query.
   *
   * @parm sqlca
   * @parm dclsrvcAsgn
   * @return
   */
  public ResultSet openPolPlanCsrD5427tli(Sqlca sqlca, DclsrvcAsgn dclsrvcAsgn) throws Exception;

  /**
   * This method will handle the sql operations for a fetch query.
   *
   * @parm sqlca
   * @parm dclsrvcAsgn
   */
  public void fetchPolPlanCsrD5427tli(
      ResultSet polPlanCsrResultSet, Sqlca sqlca, DclsrvcAsgn dclsrvcAsgn) throws Exception;

  /**
   * This method will handle the sql operations for a close query.
   *
   * @parm sqlca
   */
  public void closePolPlanCsrD5427tli(ResultSet polPlanCsrResultSet, Sqlca sqlca) throws Exception;

  /**
   * This method will handle the sql operations for a open query.
   *
   * @parm sqlca
   * @parm dclsrvcAsgn
   * @return
   */
  public ResultSet openSaOiCsrD5427tli(Sqlca sqlca, DclsrvcAsgn dclsrvcAsgn) throws Exception;

  /**
   * This method will handle the sql operations for a fetch query.
   *
   * @parm sqlca
   * @parm dclsrvcAsgn
   */
  public void fetchSaOiCsrD5427tli(ResultSet saOiCsrResultSet, Sqlca sqlca, DclsrvcAsgn dclsrvcAsgn)
      throws Exception;

  /**
   * This method will handle the sql operations for a close query.
   *
   * @parm sqlca
   */
  public void closeSaOiCsrD5427tli(ResultSet saOiCsrResultSet, Sqlca sqlca) throws Exception;
}
