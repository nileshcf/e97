package com.cloudframe.app.repository;

import com.cloudframe.app.dto.d5427scn.*;

public interface D5427scnRepository {
  /**
   * This method will handle the sql operations for a update query.
   *
   * @parm sqlca
   * @parm dclsrvcCdTransTbl
   */
  public void selectSrvcCdTransTbl(Sqlca sqlca, DclsrvcCdTransTbl dclsrvcCdTransTbl)
      throws Exception;
}
