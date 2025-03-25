package com.cloudframe.app.rest.c5427bhi;

/**
 * The class CrtnRequestData is used to handle fields declared in it
 *
 * @author CloudFrame Inc. created on 2025-03-25 at 08:32.
 */
import com.cloudframe.app.exception.CFException;
import com.fasterxml.jackson.annotation.JsonIgnore;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class CrtnRequestData {
  protected Logger logger = LoggerFactory.getLogger(CrtnRequestData.class);

  /*  Child Field declaration */
  private String crtnReqHipaaVerNbr = "";
  private String crtnReqEffDt = "";
  private String crtnReqCancDt = "";
  private String crtnReqStsCd = "";
  /*  End of Field declaration */

  /**
   * Returns the value of crtnReqHipaaVerNbr
   *
   * @return crtnReqHipaaVerNbr
   */
  public String getCrtnReqHipaaVerNbr() {
    return crtnReqHipaaVerNbr;
  }

  /**
   * set variable crtnReqHipaaVerNbr
   *
   * @param value
   */
  public void setCrtnReqHipaaVerNbr(String value) {
    crtnReqHipaaVerNbr = value.trim();
  }
  /**
   * Returns the value of crtnReqEffDt
   *
   * @return crtnReqEffDt
   */
  public String getCrtnReqEffDt() {
    return crtnReqEffDt;
  }

  /**
   * set variable crtnReqEffDt
   *
   * @param value
   */
  public void setCrtnReqEffDt(String value) {
    crtnReqEffDt = value.trim();
  }
  /**
   * Returns the value of crtnReqCancDt
   *
   * @return crtnReqCancDt
   */
  public String getCrtnReqCancDt() {
    return crtnReqCancDt;
  }

  /**
   * set variable crtnReqCancDt
   *
   * @param value
   */
  public void setCrtnReqCancDt(String value) {
    crtnReqCancDt = value.trim();
  }
  /**
   * Returns the value of crtnReqStsCd
   *
   * @return crtnReqStsCd
   */
  public String getCrtnReqStsCd() {
    return crtnReqStsCd;
  }

  /**
   * set variable crtnReqStsCd
   *
   * @param value
   */
  public void setCrtnReqStsCd(String value) {
    crtnReqStsCd = value.trim();
  }

  @JsonIgnore
  public void setCrtnRequestData(com.cloudframe.app.dto.c5427bhi.CrtnRequestData crtnRequestData)
      throws CFException {
    if (crtnReqHipaaVerNbr != null && !crtnReqHipaaVerNbr.isEmpty()) {
      crtnRequestData.setCrtnReqHipaaVerNbr(crtnReqHipaaVerNbr.toCharArray());
    }
    if (crtnReqEffDt != null && !crtnReqEffDt.isEmpty()) {
      crtnRequestData.setCrtnReqEffDt(crtnReqEffDt.toCharArray());
    }
    if (crtnReqCancDt != null && !crtnReqCancDt.isEmpty()) {
      crtnRequestData.setCrtnReqCancDt(crtnReqCancDt.toCharArray());
    }
    if (crtnReqStsCd != null && !crtnReqStsCd.isEmpty()) {
      crtnRequestData.setCrtnReqStsCd(crtnReqStsCd.toCharArray());
    }
  }

  @JsonIgnore
  public void populateFrom(com.cloudframe.app.dto.c5427bhi.CrtnRequestData crtnRequestData)
      throws CFException {
    setCrtnReqHipaaVerNbr(String.valueOf(crtnRequestData.getCrtnReqHipaaVerNbr()));
    setCrtnReqEffDt(String.valueOf(crtnRequestData.getCrtnReqEffDt()));
    setCrtnReqCancDt(String.valueOf(crtnRequestData.getCrtnReqCancDt()));
    setCrtnReqStsCd(String.valueOf(crtnRequestData.getCrtnReqStsCd()));
  }
}
