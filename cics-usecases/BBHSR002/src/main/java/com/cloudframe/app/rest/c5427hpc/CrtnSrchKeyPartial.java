package com.cloudframe.app.rest.c5427hpc;

/**
 * The class CrtnSrchKeyPartial is used to handle fields declared in it
 *
 * @author CloudFrame Inc. created on 2025-03-25 at 08:29.
 */
import com.cloudframe.app.exception.CFException;
import com.fasterxml.jackson.annotation.JsonIgnore;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class CrtnSrchKeyPartial {
  protected Logger logger = LoggerFactory.getLogger(CrtnSrchKeyPartial.class);

  /*  Child Field declaration */
  private int crtnQueryTyp;
  private String crtnHipaaVerNbr = "";
  /*  End of Field declaration */

  /**
   * Returns the value of crtnQueryTyp
   *
   * @return crtnQueryTyp
   */
  public int getCrtnQueryTyp() {
    return crtnQueryTyp;
  }

  /**
   * Updates CrtnQueryTyp with the value
   *
   * @param number
   */
  public void setCrtnQueryTyp(int number) {
    crtnQueryTyp = number;
  }
  /**
   * Returns the value of crtnHipaaVerNbr
   *
   * @return crtnHipaaVerNbr
   */
  public String getCrtnHipaaVerNbr() {
    return crtnHipaaVerNbr;
  }

  /**
   * set variable crtnHipaaVerNbr
   *
   * @param value
   */
  public void setCrtnHipaaVerNbr(String value) {
    crtnHipaaVerNbr = value.trim();
  }

  @JsonIgnore
  public void setCrtnSrchKeyPartial(
      com.cloudframe.app.dto.c5427hpc.CrtnSrchKeyPartial crtnSrchKeyPartial) throws CFException {
    crtnSrchKeyPartial.setCrtnQueryTyp(crtnQueryTyp);
    if (crtnHipaaVerNbr != null && !crtnHipaaVerNbr.isEmpty()) {
      crtnSrchKeyPartial.setCrtnHipaaVerNbr(crtnHipaaVerNbr.toCharArray());
    }
  }

  @JsonIgnore
  public void populateFrom(com.cloudframe.app.dto.c5427hpc.CrtnSrchKeyPartial crtnSrchKeyPartial)
      throws CFException {
    setCrtnQueryTyp(crtnSrchKeyPartial.getCrtnQueryTyp());
    setCrtnHipaaVerNbr(String.valueOf(crtnSrchKeyPartial.getCrtnHipaaVerNbr()));
  }
}
