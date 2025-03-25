package com.cloudframe.app.rest.c5427bhi;

/**
 * The class CrtnSrchKey is used to handle fields declared in it
 *
 * @author CloudFrame Inc. created on 2025-03-25 at 08:32.
 */
import com.cloudframe.app.exception.CFException;
import com.fasterxml.jackson.annotation.JsonIgnore;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class CrtnSrchKey {
  protected Logger logger = LoggerFactory.getLogger(CrtnSrchKey.class);

  /*  Child Field declaration */
  private String crtnSlotTblId = "";
  private String crtnHipaaCd = "";
  private String crtnHipaaVerNbr = "";
  private String crtnStsCd = "";
  /*  End of Field declaration */

  /**
   * Returns the value of crtnSlotTblId
   *
   * @return crtnSlotTblId
   */
  public String getCrtnSlotTblId() {
    return crtnSlotTblId;
  }

  /**
   * set variable crtnSlotTblId
   *
   * @param value
   */
  public void setCrtnSlotTblId(String value) {
    crtnSlotTblId = value.trim();
  }
  /**
   * Returns the value of crtnHipaaCd
   *
   * @return crtnHipaaCd
   */
  public String getCrtnHipaaCd() {
    return crtnHipaaCd;
  }

  /**
   * set variable crtnHipaaCd
   *
   * @param value
   */
  public void setCrtnHipaaCd(String value) {
    crtnHipaaCd = value.trim();
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
  /**
   * Returns the value of crtnStsCd
   *
   * @return crtnStsCd
   */
  public String getCrtnStsCd() {
    return crtnStsCd;
  }

  /**
   * set variable crtnStsCd
   *
   * @param value
   */
  public void setCrtnStsCd(String value) {
    crtnStsCd = value.trim();
  }

  @JsonIgnore
  public void setCrtnSrchKey(com.cloudframe.app.dto.c5427bhi.CrtnSrchKey crtnSrchKey)
      throws CFException {
    if (crtnSlotTblId != null && !crtnSlotTblId.isEmpty()) {
      crtnSrchKey.setCrtnSlotTblId(crtnSlotTblId.toCharArray());
    }
    if (crtnHipaaCd != null && !crtnHipaaCd.isEmpty()) {
      crtnSrchKey.setCrtnHipaaCd(crtnHipaaCd.toCharArray());
    }
    if (crtnHipaaVerNbr != null && !crtnHipaaVerNbr.isEmpty()) {
      crtnSrchKey.setCrtnHipaaVerNbr(crtnHipaaVerNbr.toCharArray());
    }
    if (crtnStsCd != null && !crtnStsCd.isEmpty()) {
      crtnSrchKey.setCrtnStsCd(crtnStsCd.toCharArray());
    }
  }

  @JsonIgnore
  public void populateFrom(com.cloudframe.app.dto.c5427bhi.CrtnSrchKey crtnSrchKey)
      throws CFException {
    setCrtnSlotTblId(String.valueOf(crtnSrchKey.getCrtnSlotTblId()));
    setCrtnHipaaCd(String.valueOf(crtnSrchKey.getCrtnHipaaCd()));
    setCrtnHipaaVerNbr(String.valueOf(crtnSrchKey.getCrtnHipaaVerNbr()));
    setCrtnStsCd(String.valueOf(crtnSrchKey.getCrtnStsCd()));
  }
}
