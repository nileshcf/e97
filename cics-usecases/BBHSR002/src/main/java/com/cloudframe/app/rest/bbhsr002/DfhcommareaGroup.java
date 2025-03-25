package com.cloudframe.app.rest.bbhsr002;

/**
 * The class DfhcommareaGroup is used to handle fields declared in it
 *
 * @author CloudFrame Inc. created on 2025-03-25 at 08:29.
 */
import com.cloudframe.app.exception.CFException;
import com.fasterxml.jackson.annotation.JsonIgnore;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class DfhcommareaGroup {
  protected Logger logger = LoggerFactory.getLogger(DfhcommareaGroup.class);

  /*  Child Field declaration */
  private String dfhcommarea = "";
  /*  End of Field declaration */

  /**
   * Returns the value of dfhcommarea
   *
   * @return dfhcommarea
   */
  public String getDfhcommarea() {
    return dfhcommarea;
  }

  /**
   * set variable dfhcommarea
   *
   * @param value
   */
  public void setDfhcommarea(String value) {
    dfhcommarea = value.trim();
  }

  @JsonIgnore
  public void setDfhcommareaGroup(com.cloudframe.app.dto.bbhsr002.DfhcommareaGroup dfhcommareaGroup)
      throws CFException {
    if (dfhcommarea != null && !dfhcommarea.isEmpty()) {
      dfhcommareaGroup.setDfhcommarea(dfhcommarea.toCharArray());
    }
  }

  @JsonIgnore
  public void populateFrom(com.cloudframe.app.dto.bbhsr002.DfhcommareaGroup dfhcommareaGroup)
      throws CFException {
    setDfhcommarea(String.valueOf(dfhcommareaGroup.getDfhcommarea()));
  }
}
