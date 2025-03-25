package com.cloudframe.app.repository;

import com.cloudframe.app.dto.dphpctsq.*;
import java.sql.ResultSet;

public interface DphpctsqRepository {
  /**
   * This method will handle the sql operations for a open query.
   *
   * @parm sqlca
   * @return
   */
  public ResultSet openC1Dphpctsq(Sqlca sqlca) throws Exception;

  /**
   * This method will handle the sql operations for a multi-fetch query.
   *
   * @parm hostVarArrayArea
   * @parm sqlca
   */
  public void fetchC1Dphpctsq(ResultSet c1ResultSet, HostVarArrayArea hostVarArrayArea, Sqlca sqlca)
      throws Exception;
}
