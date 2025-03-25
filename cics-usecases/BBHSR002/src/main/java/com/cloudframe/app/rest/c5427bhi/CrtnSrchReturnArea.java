package com.cloudframe.app.rest.c5427bhi;

/**
 * The class CrtnSrchReturnArea is used to handle fields declared in it
 *
 * @author CloudFrame Inc. created on 2025-03-25 at 08:32.
 */
import com.cloudframe.app.exception.CFException;
import com.fasterxml.jackson.annotation.JsonIgnore;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class CrtnSrchReturnArea {
  protected Logger logger = LoggerFactory.getLogger(CrtnSrchReturnArea.class);

  /*  Child Field declaration */
  private int crtnSqlcode;
  private String crtnSrchFoundSw = "";
  private String crtnNtwkTypCd = "";
  private String crtnEffDt = "";
  private String crtnCancDt = "";
  private String crtnSrvcCd = "";
  private String crtnPlOfSrvcCd = "";
  private String crtnCausCd = "";
  private String crtnBenLvlCd = "";
  private String crtnInNtwkClssCd = "";
  private String crtnTier1NtwkClssCd = "";
  private String crtnProcCdRngBegnVal = "";
  private String crtnProcCdRngEndVal = "";
  private String crtnProcCdRngTypVal = "";
  private String crtnProvOrgTypCd = "";
  private String crtnHipaaCommtTxt = "";
  /*  End of Field declaration */

  /**
   * Returns the value of crtnSqlcode
   *
   * @return crtnSqlcode
   */
  public int getCrtnSqlcode() {
    return crtnSqlcode;
  }

  /**
   * Updates CrtnSqlcode with the value
   *
   * @param number
   */
  public void setCrtnSqlcode(int number) {
    crtnSqlcode = number;
  }
  /**
   * Returns the value of crtnSrchFoundSw
   *
   * @return crtnSrchFoundSw
   */
  public String getCrtnSrchFoundSw() {
    return crtnSrchFoundSw;
  }

  /**
   * set variable crtnSrchFoundSw
   *
   * @param value
   */
  public void setCrtnSrchFoundSw(String value) {
    crtnSrchFoundSw = value.trim();
  }
  /**
   * Returns the value of crtnNtwkTypCd
   *
   * @return crtnNtwkTypCd
   */
  public String getCrtnNtwkTypCd() {
    return crtnNtwkTypCd;
  }

  /**
   * set variable crtnNtwkTypCd
   *
   * @param value
   */
  public void setCrtnNtwkTypCd(String value) {
    crtnNtwkTypCd = value.trim();
  }
  /**
   * Returns the value of crtnEffDt
   *
   * @return crtnEffDt
   */
  public String getCrtnEffDt() {
    return crtnEffDt;
  }

  /**
   * set variable crtnEffDt
   *
   * @param value
   */
  public void setCrtnEffDt(String value) {
    crtnEffDt = value.trim();
  }
  /**
   * Returns the value of crtnCancDt
   *
   * @return crtnCancDt
   */
  public String getCrtnCancDt() {
    return crtnCancDt;
  }

  /**
   * set variable crtnCancDt
   *
   * @param value
   */
  public void setCrtnCancDt(String value) {
    crtnCancDt = value.trim();
  }
  /**
   * Returns the value of crtnSrvcCd
   *
   * @return crtnSrvcCd
   */
  public String getCrtnSrvcCd() {
    return crtnSrvcCd;
  }

  /**
   * set variable crtnSrvcCd
   *
   * @param value
   */
  public void setCrtnSrvcCd(String value) {
    crtnSrvcCd = value.trim();
  }
  /**
   * Returns the value of crtnPlOfSrvcCd
   *
   * @return crtnPlOfSrvcCd
   */
  public String getCrtnPlOfSrvcCd() {
    return crtnPlOfSrvcCd;
  }

  /**
   * set variable crtnPlOfSrvcCd
   *
   * @param value
   */
  public void setCrtnPlOfSrvcCd(String value) {
    crtnPlOfSrvcCd = value.trim();
  }
  /**
   * Returns the value of crtnCausCd
   *
   * @return crtnCausCd
   */
  public String getCrtnCausCd() {
    return crtnCausCd;
  }

  /**
   * set variable crtnCausCd
   *
   * @param value
   */
  public void setCrtnCausCd(String value) {
    crtnCausCd = value.trim();
  }
  /**
   * Returns the value of crtnBenLvlCd
   *
   * @return crtnBenLvlCd
   */
  public String getCrtnBenLvlCd() {
    return crtnBenLvlCd;
  }

  /**
   * set variable crtnBenLvlCd
   *
   * @param value
   */
  public void setCrtnBenLvlCd(String value) {
    crtnBenLvlCd = value.trim();
  }
  /**
   * Returns the value of crtnInNtwkClssCd
   *
   * @return crtnInNtwkClssCd
   */
  public String getCrtnInNtwkClssCd() {
    return crtnInNtwkClssCd;
  }

  /**
   * set variable crtnInNtwkClssCd
   *
   * @param value
   */
  public void setCrtnInNtwkClssCd(String value) {
    crtnInNtwkClssCd = value.trim();
  }
  /**
   * Returns the value of crtnTier1NtwkClssCd
   *
   * @return crtnTier1NtwkClssCd
   */
  public String getCrtnTier1NtwkClssCd() {
    return crtnTier1NtwkClssCd;
  }

  /**
   * set variable crtnTier1NtwkClssCd
   *
   * @param value
   */
  public void setCrtnTier1NtwkClssCd(String value) {
    crtnTier1NtwkClssCd = value.trim();
  }
  /**
   * Returns the value of crtnProcCdRngBegnVal
   *
   * @return crtnProcCdRngBegnVal
   */
  public String getCrtnProcCdRngBegnVal() {
    return crtnProcCdRngBegnVal;
  }

  /**
   * set variable crtnProcCdRngBegnVal
   *
   * @param value
   */
  public void setCrtnProcCdRngBegnVal(String value) {
    crtnProcCdRngBegnVal = value.trim();
  }
  /**
   * Returns the value of crtnProcCdRngEndVal
   *
   * @return crtnProcCdRngEndVal
   */
  public String getCrtnProcCdRngEndVal() {
    return crtnProcCdRngEndVal;
  }

  /**
   * set variable crtnProcCdRngEndVal
   *
   * @param value
   */
  public void setCrtnProcCdRngEndVal(String value) {
    crtnProcCdRngEndVal = value.trim();
  }
  /**
   * Returns the value of crtnProcCdRngTypVal
   *
   * @return crtnProcCdRngTypVal
   */
  public String getCrtnProcCdRngTypVal() {
    return crtnProcCdRngTypVal;
  }

  /**
   * set variable crtnProcCdRngTypVal
   *
   * @param value
   */
  public void setCrtnProcCdRngTypVal(String value) {
    crtnProcCdRngTypVal = value.trim();
  }
  /**
   * Returns the value of crtnProvOrgTypCd
   *
   * @return crtnProvOrgTypCd
   */
  public String getCrtnProvOrgTypCd() {
    return crtnProvOrgTypCd;
  }

  /**
   * set variable crtnProvOrgTypCd
   *
   * @param value
   */
  public void setCrtnProvOrgTypCd(String value) {
    crtnProvOrgTypCd = value.trim();
  }
  /**
   * Returns the value of crtnHipaaCommtTxt
   *
   * @return crtnHipaaCommtTxt
   */
  public String getCrtnHipaaCommtTxt() {
    return crtnHipaaCommtTxt;
  }

  /**
   * set variable crtnHipaaCommtTxt
   *
   * @param value
   */
  public void setCrtnHipaaCommtTxt(String value) {
    crtnHipaaCommtTxt = value.trim();
  }

  @JsonIgnore
  public void setCrtnSrchReturnArea(
      com.cloudframe.app.dto.c5427bhi.CrtnSrchReturnArea crtnSrchReturnArea) throws CFException {
    crtnSrchReturnArea.setCrtnSqlcode(crtnSqlcode);
    if (crtnSrchFoundSw != null && !crtnSrchFoundSw.isEmpty()) {
      crtnSrchReturnArea.setCrtnSrchFoundSw(crtnSrchFoundSw.toCharArray());
    }
    if (crtnNtwkTypCd != null && !crtnNtwkTypCd.isEmpty()) {
      crtnSrchReturnArea.setCrtnNtwkTypCd(crtnNtwkTypCd.toCharArray());
    }
    if (crtnEffDt != null && !crtnEffDt.isEmpty()) {
      crtnSrchReturnArea.setCrtnEffDt(crtnEffDt.toCharArray());
    }
    if (crtnCancDt != null && !crtnCancDt.isEmpty()) {
      crtnSrchReturnArea.setCrtnCancDt(crtnCancDt.toCharArray());
    }
    if (crtnSrvcCd != null && !crtnSrvcCd.isEmpty()) {
      crtnSrchReturnArea.setCrtnSrvcCd(crtnSrvcCd.toCharArray());
    }
    if (crtnPlOfSrvcCd != null && !crtnPlOfSrvcCd.isEmpty()) {
      crtnSrchReturnArea.setCrtnPlOfSrvcCd(crtnPlOfSrvcCd.toCharArray());
    }
    if (crtnCausCd != null && !crtnCausCd.isEmpty()) {
      crtnSrchReturnArea.setCrtnCausCd(crtnCausCd.toCharArray());
    }
    if (crtnBenLvlCd != null && !crtnBenLvlCd.isEmpty()) {
      crtnSrchReturnArea.setCrtnBenLvlCd(crtnBenLvlCd.toCharArray());
    }
    if (crtnInNtwkClssCd != null && !crtnInNtwkClssCd.isEmpty()) {
      crtnSrchReturnArea.setCrtnInNtwkClssCd(crtnInNtwkClssCd.toCharArray());
    }
    if (crtnTier1NtwkClssCd != null && !crtnTier1NtwkClssCd.isEmpty()) {
      crtnSrchReturnArea.setCrtnTier1NtwkClssCd(crtnTier1NtwkClssCd.toCharArray());
    }
    if (crtnProcCdRngBegnVal != null && !crtnProcCdRngBegnVal.isEmpty()) {
      crtnSrchReturnArea.setCrtnProcCdRngBegnVal(crtnProcCdRngBegnVal.toCharArray());
    }
    if (crtnProcCdRngEndVal != null && !crtnProcCdRngEndVal.isEmpty()) {
      crtnSrchReturnArea.setCrtnProcCdRngEndVal(crtnProcCdRngEndVal.toCharArray());
    }
    if (crtnProcCdRngTypVal != null && !crtnProcCdRngTypVal.isEmpty()) {
      crtnSrchReturnArea.setCrtnProcCdRngTypVal(crtnProcCdRngTypVal.toCharArray());
    }
    if (crtnProvOrgTypCd != null && !crtnProvOrgTypCd.isEmpty()) {
      crtnSrchReturnArea.setCrtnProvOrgTypCd(crtnProvOrgTypCd.toCharArray());
    }
    if (crtnHipaaCommtTxt != null && !crtnHipaaCommtTxt.isEmpty()) {
      crtnSrchReturnArea.setCrtnHipaaCommtTxt(crtnHipaaCommtTxt.toCharArray());
    }
  }

  @JsonIgnore
  public void populateFrom(com.cloudframe.app.dto.c5427bhi.CrtnSrchReturnArea crtnSrchReturnArea)
      throws CFException {
    setCrtnSqlcode(crtnSrchReturnArea.getCrtnSqlcode());
    setCrtnSrchFoundSw(String.valueOf(crtnSrchReturnArea.getCrtnSrchFoundSw()));
    setCrtnNtwkTypCd(String.valueOf(crtnSrchReturnArea.getCrtnNtwkTypCd()));
    setCrtnEffDt(String.valueOf(crtnSrchReturnArea.getCrtnEffDt()));
    setCrtnCancDt(String.valueOf(crtnSrchReturnArea.getCrtnCancDt()));
    setCrtnSrvcCd(String.valueOf(crtnSrchReturnArea.getCrtnSrvcCd()));
    setCrtnPlOfSrvcCd(String.valueOf(crtnSrchReturnArea.getCrtnPlOfSrvcCd()));
    setCrtnCausCd(String.valueOf(crtnSrchReturnArea.getCrtnCausCd()));
    setCrtnBenLvlCd(String.valueOf(crtnSrchReturnArea.getCrtnBenLvlCd()));
    setCrtnInNtwkClssCd(String.valueOf(crtnSrchReturnArea.getCrtnInNtwkClssCd()));
    setCrtnTier1NtwkClssCd(String.valueOf(crtnSrchReturnArea.getCrtnTier1NtwkClssCd()));
    setCrtnProcCdRngBegnVal(String.valueOf(crtnSrchReturnArea.getCrtnProcCdRngBegnVal()));
    setCrtnProcCdRngEndVal(String.valueOf(crtnSrchReturnArea.getCrtnProcCdRngEndVal()));
    setCrtnProcCdRngTypVal(String.valueOf(crtnSrchReturnArea.getCrtnProcCdRngTypVal()));
    setCrtnProvOrgTypCd(String.valueOf(crtnSrchReturnArea.getCrtnProvOrgTypCd()));
    setCrtnHipaaCommtTxt(String.valueOf(crtnSrchReturnArea.getCrtnHipaaCommtTxt()));
  }
}
