package com.cloudframe.app.rest.c5427hpc;

/**
 * The class CrtnSrchKey is used to handle fields declared in it
 *
 * @author CloudFrame Inc. created on 2025-03-25 at 08:29.
 */
import com.cloudframe.app.exception.CFException;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class CrtnSrchKey {
  protected Logger logger = LoggerFactory.getLogger(CrtnSrchKey.class);

  /*  Child Field declaration */
  @JsonProperty("crtnSrchKeyPartial")
  private CrtnSrchKeyPartial crtnSrchKeyPartial = new CrtnSrchKeyPartial();

  private String crtnKeyCode = "";
  /*  End of Field declaration */

  /**
   * Returns the value of crtnSrchKeyPartial
   *
   * @return crtnSrchKeyPartial
   */
  public CrtnSrchKeyPartial getCrtnSrchKeyPartial() {
    return crtnSrchKeyPartial;
  }
  // *** setGroup.txt starts
  /**
   * Update CrtnSrchKeyPartial with the passed value
   *
   * @param value
   */
  @JsonIgnore
  public void setCrtnSrchKeyPartial(com.cloudframe.app.dto.c5427hpc.CrtnSrchKeyPartial value)
      throws CFException {
    crtnSrchKeyPartial.populateFrom(value);
  }

  /**
   * Update CrtnSrchKeyPartial with the passed value
   *
   * @param value
   */
  public void setCrtnSrchKeyPartial(CrtnSrchKeyPartial value) {
    crtnSrchKeyPartial = value;
  }
  // *** setGroup.txt ends
  /**
   * Returns the value of crtnKeyCode
   *
   * @return crtnKeyCode
   */
  public String getCrtnKeyCode() {
    return crtnKeyCode;
  }

  /**
   * set variable crtnKeyCode
   *
   * @param value
   */
  public void setCrtnKeyCode(String value) {
    crtnKeyCode = value.trim();
  }

  @JsonIgnore
  public void setCrtnSrchKey(com.cloudframe.app.dto.c5427hpc.CrtnSrchKey crtnSrchKey)
      throws CFException {
    crtnSrchKeyPartial.setCrtnSrchKeyPartial(crtnSrchKey.getCrtnSrchKeyPartial());
    if (crtnKeyCode != null && !crtnKeyCode.isEmpty()) {
      crtnSrchKey.setCrtnKeyCode(crtnKeyCode.toCharArray());
    }
  }

  @JsonIgnore
  public void populateFrom(com.cloudframe.app.dto.c5427hpc.CrtnSrchKey crtnSrchKey)
      throws CFException {
    crtnSrchKeyPartial.populateFrom(crtnSrchKey.getCrtnSrchKeyPartial());
    setCrtnKeyCode(String.valueOf(crtnSrchKey.getCrtnKeyCode()));
  }
}
