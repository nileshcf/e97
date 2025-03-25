package com.cloudframe.app.dto.bbhsr002;

/**
 * The class HsrReqFunctionCall is used to handle fields declared in it
 *
 * @author CloudFrame Inc. created on 2025-03-25 at 08:29. using version 5.0.0.231
 */
import com.cloudframe.app.data.Field;
import com.cloudframe.app.dto.serialize.bbhsr002.*;
import com.cloudframe.app.exception.CFException;

public class HsrReqFunctionCall extends HsrReqFunctionCallSerialized {

  private char[] hsrReqRequestType = Field.fillLowValue(12);

  private char[] hsrReqVersion = Field.fillLowValue(3);

  private char[] hsrReqCreator = Field.fillLowValue(8);

  /** Constructor for HsrReqFunctionCall */
  public HsrReqFunctionCall() {
    // TO-DO auto generated code
  }

  /**
   * Constructor for HsrReqFunctionCall. sets the parent value to the parent
   *
   * @param parent
   * @param begin
   */
  public HsrReqFunctionCall(Field parent, int begin) {
    setParent(parent, begin);
  }

  /**
   * Returns the value of hsrReqRequestType
   *
   * @return hsrReqRequestType
   */
  public char[] getHsrReqRequestType() throws CFException {
    if (isHsrReqRequestTypeModified()) {
      hsrReqRequestType = refreshHsrReqRequestType();
    }
    return hsrReqRequestType;
  }

  /**
   * set variable hsrReqRequestType Corresponding COBOL Variable is HSR-REQ-REQUEST-TYPE
   *
   * @param value
   */
  public void setHsrReqRequestType(char[] value) {
    hsrReqRequestType = checkHsrReqRequestTypeConstraints(value);
    serializeHsrReqRequestType(hsrReqRequestType);
  }

  /**
   * Update HsrReqRequestType with a char[] from an offset and length
   *
   * @param value
   */
  public void setHsrReqRequestType(char[] source, int sourceIndex) {
    replace(source, sourceIndex, source.length, beginHsrReqRequestType, hsrReqRequestType.length);
  }

  public void setHsrReqRequestType(char[] source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginHsrReqRequestType, hsrReqRequestType.length);
  }

  /**
   * Update HsrReqRequestType with a char[] from an offset and length to an offset and length
   *
   * @param value
   */
  public void setHsrReqRequestType(
      char[] source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginHsrReqRequestType + targetIndex, targetLen);
  }

  /**
   * Update HsrReqRequestType with another Field
   *
   * @param value
   */
  public void setHsrReqRequestType(Field source) {
    replace(source, 0, source.length(), beginHsrReqRequestType, HSR_REQ_REQUEST_TYPE_LEN);
  }

  /**
   * Update HsrReqRequestType with another Field from an offset and length
   *
   * @param value
   */
  public void setHsrReqRequestType(Field source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginHsrReqRequestType, HSR_REQ_REQUEST_TYPE_LEN);
  }

  /**
   * Update HsrReqRequestType with another Field from an offset and length to an offset and length
   *
   * @param value
   */
  public void setHsrReqRequestType(
      Field source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginHsrReqRequestType + targetIndex, targetLen);
  }

  char[] hsrReqGetBhiInfo88Value = "GETBHIINF   ".toCharArray();
  /**
   * Test condition "GETBHIINF" for isHsrReqGetBhiInfo()
   *
   * @return Returns true if isHsrReqGetBhiInfo() is "GETBHIINF"
   */
  public boolean isHsrReqGetBhiInfo() throws CFException {
    return (compareChars(getHsrReqRequestType(), hsrReqGetBhiInfo88Value) == 0);
  }

  /** set values "GETBHIINF" */
  public void setHsrReqGetBhiInfoTrue() {
    setHsrReqRequestType(hsrReqGetBhiInfo88Value);
  }
  /**
   * Returns the value of hsrReqVersion
   *
   * @return hsrReqVersion
   */
  public char[] getHsrReqVersion() throws CFException {
    if (isHsrReqVersionModified()) {
      hsrReqVersion = refreshHsrReqVersion();
    }
    return hsrReqVersion;
  }

  /**
   * set variable hsrReqVersion Corresponding COBOL Variable is HSR-REQ-VERSION
   *
   * @param value
   */
  public void setHsrReqVersion(char[] value) {
    hsrReqVersion = checkHsrReqVersionConstraints(value);
    serializeHsrReqVersion(hsrReqVersion);
  }

  /**
   * Update HsrReqVersion with a char[] from an offset and length
   *
   * @param value
   */
  public void setHsrReqVersion(char[] source, int sourceIndex) {
    replace(source, sourceIndex, source.length, beginHsrReqVersion, hsrReqVersion.length);
  }

  public void setHsrReqVersion(char[] source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginHsrReqVersion, hsrReqVersion.length);
  }

  /**
   * Update HsrReqVersion with a char[] from an offset and length to an offset and length
   *
   * @param value
   */
  public void setHsrReqVersion(
      char[] source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginHsrReqVersion + targetIndex, targetLen);
  }

  /**
   * Update HsrReqVersion with another Field
   *
   * @param value
   */
  public void setHsrReqVersion(Field source) {
    replace(source, 0, source.length(), beginHsrReqVersion, HSR_REQ_VERSION_LEN);
  }

  /**
   * Update HsrReqVersion with another Field from an offset and length
   *
   * @param value
   */
  public void setHsrReqVersion(Field source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginHsrReqVersion, HSR_REQ_VERSION_LEN);
  }

  /**
   * Update HsrReqVersion with another Field from an offset and length to an offset and length
   *
   * @param value
   */
  public void setHsrReqVersion(
      Field source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginHsrReqVersion + targetIndex, targetLen);
  }
  /**
   * Returns the value of hsrReqCreator
   *
   * @return hsrReqCreator
   */
  public char[] getHsrReqCreator() throws CFException {
    if (isHsrReqCreatorModified()) {
      hsrReqCreator = refreshHsrReqCreator();
    }
    return hsrReqCreator;
  }

  /**
   * set variable hsrReqCreator Corresponding COBOL Variable is HSR-REQ-CREATOR
   *
   * @param value
   */
  public void setHsrReqCreator(char[] value) {
    hsrReqCreator = checkHsrReqCreatorConstraints(value);
    serializeHsrReqCreator(hsrReqCreator);
  }

  /**
   * Update HsrReqCreator with a char[] from an offset and length
   *
   * @param value
   */
  public void setHsrReqCreator(char[] source, int sourceIndex) {
    replace(source, sourceIndex, source.length, beginHsrReqCreator, hsrReqCreator.length);
  }

  public void setHsrReqCreator(char[] source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginHsrReqCreator, hsrReqCreator.length);
  }

  /**
   * Update HsrReqCreator with a char[] from an offset and length to an offset and length
   *
   * @param value
   */
  public void setHsrReqCreator(
      char[] source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginHsrReqCreator + targetIndex, targetLen);
  }

  /**
   * Update HsrReqCreator with another Field
   *
   * @param value
   */
  public void setHsrReqCreator(Field source) {
    replace(source, 0, source.length(), beginHsrReqCreator, HSR_REQ_CREATOR_LEN);
  }

  /**
   * Update HsrReqCreator with another Field from an offset and length
   *
   * @param value
   */
  public void setHsrReqCreator(Field source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginHsrReqCreator, HSR_REQ_CREATOR_LEN);
  }

  /**
   * Update HsrReqCreator with another Field from an offset and length to an offset and length
   *
   * @param value
   */
  public void setHsrReqCreator(
      Field source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginHsrReqCreator + targetIndex, targetLen);
  }

  public static int getHsrReqFunctionCallFieldLength() {
    return HSR_REQ_FUNCTION_CALL_LENGTH;
  }
}
