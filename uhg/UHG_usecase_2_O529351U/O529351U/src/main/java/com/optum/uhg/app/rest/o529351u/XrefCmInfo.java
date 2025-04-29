package com.optum.uhg.app.rest.o529351u;

/**
 * The class XrefCmInfo is used to handle fields declared in it
 *
 * @author CloudFrame Inc. created on 2025-04-28 at 19:32.
 */
import com.cloudframe.app.exception.CFException;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class XrefCmInfo {

  protected Logger logger = LoggerFactory.getLogger(XrefCmInfo.class);

  /*  Child Field declaration */
  @JsonProperty("xrfCmInfo")
  private XrfCmInfo xrfCmInfo = new XrfCmInfo();

  /*  End of Field declaration */
  /**
   * Returns the value of xrfCmInfo
   *
   * @return xrfCmInfo
   */
  public XrfCmInfo getXrfCmInfo() {
    return xrfCmInfo;
  }

  // *** setGroup.txt starts
  /**
   * Update XrfCmInfo with the passed value
   *
   * @param value
   */
  @JsonIgnore
  public void setXrfCmInfo(com.optum.uhg.app.dto.o529351u.XrfCmInfo value) throws CFException {
    xrfCmInfo.populateFrom(value);
  }

  /**
   * Update XrfCmInfo with the passed value
   *
   * @param value
   */
  public void setXrfCmInfo(XrfCmInfo value) {
    xrfCmInfo = value;
  }

  // *** setGroup.txt ends
  @JsonIgnore
  public void setXrefCmInfo(com.optum.uhg.app.dto.o529351u.XrefCmInfo xrefCmInfo)
      throws CFException {
    xrfCmInfo.setXrfCmInfo(xrefCmInfo.getXrfCmInfo());
  }

  @JsonIgnore
  public void populateFrom(com.optum.uhg.app.dto.o529351u.XrefCmInfo xrefCmInfo)
      throws CFException {
    xrfCmInfo.populateFrom(xrefCmInfo.getXrfCmInfo());
  }
}
