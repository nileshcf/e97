package com.optum.uhg.app.rest.o529351u;

/**
 * The class XrfUpdLog is used to handle fields declared in it
 *
 * @author CloudFrame Inc. created on 2025-04-28 at 19:32.
 */
import com.cloudframe.app.exception.CFException;
import com.fasterxml.jackson.annotation.JsonIgnore;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class XrfUpdLog {

  protected Logger logger = LoggerFactory.getLogger(XrfUpdLog.class);

  /*  Child Field declaration */
  private int xrfUpdDate;

  private int xrfUpdTime;

  /*  End of Field declaration */
  /**
   * Returns the value of xrfUpdDate
   *
   * @return xrfUpdDate
   */
  public int getXrfUpdDate() {
    return xrfUpdDate;
  }

  /**
   * Updates XrfUpdDate with the value
   *
   * @param number
   */
  public void setXrfUpdDate(int number) {
    xrfUpdDate = number;
  }

  /**
   * Returns the value of xrfUpdTime
   *
   * @return xrfUpdTime
   */
  public int getXrfUpdTime() {
    return xrfUpdTime;
  }

  /**
   * Updates XrfUpdTime with the value
   *
   * @param number
   */
  public void setXrfUpdTime(int number) {
    xrfUpdTime = number;
  }

  @JsonIgnore
  public void setXrfUpdLog(com.optum.uhg.app.dto.o529351u.XrfUpdLog xrfUpdLog) throws CFException {
    xrfUpdLog.setXrfUpdDate(xrfUpdDate);
    xrfUpdLog.setXrfUpdTime(xrfUpdTime);
  }

  @JsonIgnore
  public void populateFrom(com.optum.uhg.app.dto.o529351u.XrfUpdLog xrfUpdLog) throws CFException {
    setXrfUpdDate(xrfUpdLog.getXrfUpdDate());
    setXrfUpdTime(xrfUpdLog.getXrfUpdTime());
  }
}
