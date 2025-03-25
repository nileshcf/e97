package com.cloudframe.app.rest.c5427hpc;

/**
 * The class CrtnSrchReturnArea is used to handle fields declared in it
 *
 * @author CloudFrame Inc. created on 2025-03-25 at 08:29.
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
  private String crtnHipaaCd = "";
  private String crtnHipaaGrpCd = "";
  private String crtnGrnrcRqstCd = "";
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
   * Returns the value of crtnHipaaGrpCd
   *
   * @return crtnHipaaGrpCd
   */
  public String getCrtnHipaaGrpCd() {
    return crtnHipaaGrpCd;
  }

  /**
   * set variable crtnHipaaGrpCd
   *
   * @param value
   */
  public void setCrtnHipaaGrpCd(String value) {
    crtnHipaaGrpCd = value.trim();
  }
  /**
   * Returns the value of crtnGrnrcRqstCd
   *
   * @return crtnGrnrcRqstCd
   */
  public String getCrtnGrnrcRqstCd() {
    return crtnGrnrcRqstCd;
  }

  /**
   * set variable crtnGrnrcRqstCd
   *
   * @param value
   */
  public void setCrtnGrnrcRqstCd(String value) {
    crtnGrnrcRqstCd = value.trim();
  }

  @JsonIgnore
  public void setCrtnSrchReturnArea(
      com.cloudframe.app.dto.c5427hpc.CrtnSrchReturnArea crtnSrchReturnArea) throws CFException {
    crtnSrchReturnArea.setCrtnSqlcode(crtnSqlcode);
    if (crtnSrchFoundSw != null && !crtnSrchFoundSw.isEmpty()) {
      crtnSrchReturnArea.setCrtnSrchFoundSw(crtnSrchFoundSw.toCharArray());
    }
    if (crtnHipaaCd != null && !crtnHipaaCd.isEmpty()) {
      crtnSrchReturnArea.setCrtnHipaaCd(crtnHipaaCd.toCharArray());
    }
    if (crtnHipaaGrpCd != null && !crtnHipaaGrpCd.isEmpty()) {
      crtnSrchReturnArea.setCrtnHipaaGrpCd(crtnHipaaGrpCd.toCharArray());
    }
    if (crtnGrnrcRqstCd != null && !crtnGrnrcRqstCd.isEmpty()) {
      crtnSrchReturnArea.setCrtnGrnrcRqstCd(crtnGrnrcRqstCd.toCharArray());
    }
  }

  @JsonIgnore
  public void populateFrom(com.cloudframe.app.dto.c5427hpc.CrtnSrchReturnArea crtnSrchReturnArea)
      throws CFException {
    setCrtnSqlcode(crtnSrchReturnArea.getCrtnSqlcode());
    setCrtnSrchFoundSw(String.valueOf(crtnSrchReturnArea.getCrtnSrchFoundSw()));
    setCrtnHipaaCd(String.valueOf(crtnSrchReturnArea.getCrtnHipaaCd()));
    setCrtnHipaaGrpCd(String.valueOf(crtnSrchReturnArea.getCrtnHipaaGrpCd()));
    setCrtnGrnrcRqstCd(String.valueOf(crtnSrchReturnArea.getCrtnGrnrcRqstCd()));
  }
}
