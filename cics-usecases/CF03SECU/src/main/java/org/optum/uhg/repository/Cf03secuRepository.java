package org.optum.uhg.repository;

import org.optum.uhg.dto.cf03secu.*;

public interface Cf03secuRepository {
  /**
   * This method will handle the sql operations for a update query.
   *
   * @parm sqlca
   * @parm dcltbdemsec
   */
  public void selectTbdemsec(Sqlca sqlca, Dcltbdemsec dcltbdemsec) throws Exception;
}
