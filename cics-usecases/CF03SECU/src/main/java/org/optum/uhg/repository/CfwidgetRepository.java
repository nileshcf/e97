package org.optum.uhg.repository;

import java.sql.ResultSet;
import org.optum.uhg.dto.cfwidget.*;

public interface CfwidgetRepository {
  /**
   * This method will handle the sql operations for a open query.
   *
   * @parm work
   * @parm sqlca
   * @return
   */
  public ResultSet openWidgetcurCfwidget(Work work, Sqlca sqlca) throws Exception;

  /**
   * This method will handle the sql operations for a close query.
   *
   * @parm sqlca
   */
  public void closeWidgetcurCfwidget(ResultSet widgetcurResultSet, Sqlca sqlca) throws Exception;

  /**
   * This method will handle the sql operations for a fetch query.
   *
   * @parm tbxmlwgt
   * @parm sqlca
   */
  public void fetchWidgetcurCfwidget(ResultSet widgetcurResultSet, Tbxmlwgt tbxmlwgt, Sqlca sqlca)
      throws Exception;
}
