package com.cloudframe.app.rest.c5427bhi;

/**
 * The class Dfhcommarea is used to handle fields declared in it
 *
 * @author CloudFrame Inc. created on 2025-03-25 at 08:32.
 */
import com.cloudframe.app.exception.CFException;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Dfhcommarea {
  protected Logger logger = LoggerFactory.getLogger(Dfhcommarea.class);

  /*  Child Field declaration */
  @JsonProperty("crtnSrchKey")
  private CrtnSrchKey crtnSrchKey = new CrtnSrchKey();

  @JsonProperty("crtnRequestData")
  private CrtnRequestData crtnRequestData = new CrtnRequestData();

  private String crtnFunction = "";

  @JsonProperty("crtnSrchReturnArea")
  private CrtnSrchReturnArea crtnSrchReturnArea = new CrtnSrchReturnArea();
  /*  End of Field declaration */

  /**
   * Returns the value of crtnSrchKey
   *
   * @return crtnSrchKey
   */
  public CrtnSrchKey getCrtnSrchKey() {
    return crtnSrchKey;
  }
  // *** setGroup.txt starts
  /**
   * Update CrtnSrchKey with the passed value
   *
   * @param value
   */
  @JsonIgnore
  public void setCrtnSrchKey(com.cloudframe.app.dto.c5427bhi.CrtnSrchKey value) throws CFException {
    crtnSrchKey.populateFrom(value);
  }

  /**
   * Update CrtnSrchKey with the passed value
   *
   * @param value
   */
  public void setCrtnSrchKey(CrtnSrchKey value) {
    crtnSrchKey = value;
  }
  // *** setGroup.txt ends
  /**
   * Returns the value of crtnRequestData
   *
   * @return crtnRequestData
   */
  public CrtnRequestData getCrtnRequestData() {
    return crtnRequestData;
  }
  // *** setGroup.txt starts
  /**
   * Update CrtnRequestData with the passed value
   *
   * @param value
   */
  @JsonIgnore
  public void setCrtnRequestData(com.cloudframe.app.dto.c5427bhi.CrtnRequestData value)
      throws CFException {
    crtnRequestData.populateFrom(value);
  }

  /**
   * Update CrtnRequestData with the passed value
   *
   * @param value
   */
  public void setCrtnRequestData(CrtnRequestData value) {
    crtnRequestData = value;
  }
  // *** setGroup.txt ends
  /**
   * Returns the value of crtnFunction
   *
   * @return crtnFunction
   */
  public String getCrtnFunction() {
    return crtnFunction;
  }

  /**
   * set variable crtnFunction
   *
   * @param value
   */
  public void setCrtnFunction(String value) {
    crtnFunction = value.trim();
  }
  /**
   * Returns the value of crtnSrchReturnArea
   *
   * @return crtnSrchReturnArea
   */
  public CrtnSrchReturnArea getCrtnSrchReturnArea() {
    return crtnSrchReturnArea;
  }
  // *** setGroup.txt starts
  /**
   * Update CrtnSrchReturnArea with the passed value
   *
   * @param value
   */
  @JsonIgnore
  public void setCrtnSrchReturnArea(com.cloudframe.app.dto.c5427bhi.CrtnSrchReturnArea value)
      throws CFException {
    crtnSrchReturnArea.populateFrom(value);
  }

  /**
   * Update CrtnSrchReturnArea with the passed value
   *
   * @param value
   */
  public void setCrtnSrchReturnArea(CrtnSrchReturnArea value) {
    crtnSrchReturnArea = value;
  }
  // *** setGroup.txt ends
  @JsonIgnore
  public void setDfhcommarea(com.cloudframe.app.dto.c5427bhi.Dfhcommarea dfhcommarea)
      throws CFException {
    crtnSrchKey.setCrtnSrchKey(dfhcommarea.getCrtnSrchKey());
    crtnRequestData.setCrtnRequestData(dfhcommarea.getCrtnRequestData());
    if (crtnFunction != null && !crtnFunction.isEmpty()) {
      dfhcommarea.setCrtnFunction(crtnFunction.toCharArray());
    }
    crtnSrchReturnArea.setCrtnSrchReturnArea(dfhcommarea.getCrtnSrchReturnArea());
  }

  @JsonIgnore
  public void populateFrom(com.cloudframe.app.dto.c5427bhi.Dfhcommarea dfhcommarea)
      throws CFException {
    crtnSrchKey.populateFrom(dfhcommarea.getCrtnSrchKey());
    crtnRequestData.populateFrom(dfhcommarea.getCrtnRequestData());
    setCrtnFunction(String.valueOf(dfhcommarea.getCrtnFunction()));
    crtnSrchReturnArea.populateFrom(dfhcommarea.getCrtnSrchReturnArea());
  }
}
