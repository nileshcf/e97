package com.cloudframe.app.dto.bbhsr002;

/**
 * The class HsrRetFunctionMessage is used to handle fields declared in it
 *
 * @author CloudFrame Inc. created on 2025-03-25 at 08:29. using version 5.0.0.231
 */
import com.cloudframe.app.common.CONSTANTS;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.dto.serialize.bbhsr002.*;
import com.cloudframe.app.exception.CFException;

public class HsrRetFunctionMessage extends HsrRetFunctionMessageSerialized {

  private char[] hsrRetFunctionRtnCd = Field.fillLowValue(3);

  /** Constructor for HsrRetFunctionMessage */
  public HsrRetFunctionMessage() {
    // TO-DO auto generated code
  }

  /**
   * Constructor for HsrRetFunctionMessage. sets the parent value to the parent
   *
   * @param parent
   * @param begin
   */
  public HsrRetFunctionMessage(Field parent, int begin) {
    setParent(parent, begin);
  }

  /**
   * Returns the value of hsrRetFunctionRtnCd
   *
   * @return hsrRetFunctionRtnCd
   */
  public char[] getHsrRetFunctionRtnCd() throws CFException {
    if (isHsrRetFunctionRtnCdModified()) {
      hsrRetFunctionRtnCd = refreshHsrRetFunctionRtnCd();
    }
    return hsrRetFunctionRtnCd;
  }

  /**
   * set variable hsrRetFunctionRtnCd Corresponding COBOL Variable is HSR-RET-FUNCTION-RTN-CD
   *
   * @param value
   */
  public void setHsrRetFunctionRtnCd(char[] value) {
    hsrRetFunctionRtnCd = checkHsrRetFunctionRtnCdConstraints(value);
    serializeHsrRetFunctionRtnCd(hsrRetFunctionRtnCd);
  }

  /**
   * Update HsrRetFunctionRtnCd with a char[] from an offset and length
   *
   * @param value
   */
  public void setHsrRetFunctionRtnCd(char[] source, int sourceIndex) {
    replace(
        source, sourceIndex, source.length, beginHsrRetFunctionRtnCd, hsrRetFunctionRtnCd.length);
  }

  public void setHsrRetFunctionRtnCd(char[] source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginHsrRetFunctionRtnCd, hsrRetFunctionRtnCd.length);
  }

  /**
   * Update HsrRetFunctionRtnCd with a char[] from an offset and length to an offset and length
   *
   * @param value
   */
  public void setHsrRetFunctionRtnCd(
      char[] source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginHsrRetFunctionRtnCd + targetIndex, targetLen);
  }

  /**
   * Update HsrRetFunctionRtnCd with another Field
   *
   * @param value
   */
  public void setHsrRetFunctionRtnCd(Field source) {
    replace(source, 0, source.length(), beginHsrRetFunctionRtnCd, HSR_RET_FUNCTION_RTN_CD_LEN);
  }

  /**
   * Update HsrRetFunctionRtnCd with another Field from an offset and length
   *
   * @param value
   */
  public void setHsrRetFunctionRtnCd(Field source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginHsrRetFunctionRtnCd, HSR_RET_FUNCTION_RTN_CD_LEN);
  }

  /**
   * Update HsrRetFunctionRtnCd with another Field from an offset and length to an offset and length
   *
   * @param value
   */
  public void setHsrRetFunctionRtnCd(
      Field source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginHsrRetFunctionRtnCd + targetIndex, targetLen);
  }

  char[] hsrRetFunctionSuccess88Value = "000".toCharArray();
  /**
   * Test condition "000" for isHsrRetFunctionSuccess()
   *
   * @return Returns true if isHsrRetFunctionSuccess() is "000"
   */
  public boolean isHsrRetFunctionSuccess() throws CFException {
    return (compareChars(getHsrRetFunctionRtnCd(), hsrRetFunctionSuccess88Value) == 0);
  }

  /** set values "000" */
  public void setHsrRetFunctionSuccessTrue() {
    setHsrRetFunctionRtnCd(hsrRetFunctionSuccess88Value);
  }

  char[] hsrRetFunctionError88Value = "FE1".toCharArray();
  /**
   * Test condition "FE1" for isHsrRetFunctionError()
   *
   * @return Returns true if isHsrRetFunctionError() is "FE1"
   */
  public boolean isHsrRetFunctionError() throws CFException {
    return (compareChars(getHsrRetFunctionRtnCd(), hsrRetFunctionError88Value) == 0);
  }

  /** set values "FE1" */
  public void setHsrRetFunctionErrorTrue() {
    setHsrRetFunctionRtnCd(hsrRetFunctionError88Value);
  }

  /**
   * initializes HsrRetFunctionMessage String fields defaults to Spaces short/int/long defaults to
   * zero BigDecimal defaults to BigDecimal.ZERO
   */
  public void initialize() {
    setHsrRetFunctionRtnCd(CONSTANTS.SPACE_3);
  }

  public static int getHsrRetFunctionMessageFieldLength() {
    return HSR_RET_FUNCTION_MESSAGE_LENGTH;
  }
}
