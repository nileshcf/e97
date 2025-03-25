package com.cloudframe.app.dto.bbhsr002;

/**
 * The class ReqRequestParmsRedef is used to handle fields declared in it
 *
 * @author CloudFrame Inc. created on 2025-03-25 at 08:29. using version 5.0.0.231
 */
import com.cloudframe.app.data.Field;
import com.cloudframe.app.dto.serialize.bbhsr002.*;
import com.cloudframe.app.exception.CFException;

public class ReqRequestParmsRedef extends ReqRequestParmsRedefSerialized {

  private char[] reqRequestParms146 = Field.fillLowValue(146);

  private char[] reqRequestParms147149 = Field.fillLowValue(3);

  private char[] reqRequestParms150 = Field.fillLowValue(1);

  /** Constructor for ReqRequestParmsRedef */
  public ReqRequestParmsRedef() {
    // TO-DO auto generated code
  }

  /**
   * Constructor for ReqRequestParmsRedef. sets the parent value to the parent
   *
   * @param parent
   * @param begin
   */
  public ReqRequestParmsRedef(Field parent, int begin) {
    setParent(parent, begin);
  }

  /**
   * Returns the value of reqRequestParms146
   *
   * @return reqRequestParms146
   */
  public char[] getReqRequestParms146() throws CFException {
    if (isReqRequestParms146Modified()) {
      reqRequestParms146 = refreshReqRequestParms146();
    }
    return reqRequestParms146;
  }

  /**
   * set variable reqRequestParms146 Corresponding COBOL Variable is REQ-REQUEST-PARMS-146
   *
   * @param value
   */
  public void setReqRequestParms146(char[] value) {
    reqRequestParms146 = checkReqRequestParms146Constraints(value);
    serializeReqRequestParms146(reqRequestParms146);
  }

  /**
   * Update ReqRequestParms146 with a char[] from an offset and length
   *
   * @param value
   */
  public void setReqRequestParms146(char[] source, int sourceIndex) {
    replace(source, sourceIndex, source.length, beginReqRequestParms146, reqRequestParms146.length);
  }

  public void setReqRequestParms146(char[] source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginReqRequestParms146, reqRequestParms146.length);
  }

  /**
   * Update ReqRequestParms146 with a char[] from an offset and length to an offset and length
   *
   * @param value
   */
  public void setReqRequestParms146(
      char[] source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginReqRequestParms146 + targetIndex, targetLen);
  }

  /**
   * Update ReqRequestParms146 with another Field
   *
   * @param value
   */
  public void setReqRequestParms146(Field source) {
    replace(source, 0, source.length(), beginReqRequestParms146, REQ_REQUEST_PARMS_146_LEN);
  }

  /**
   * Update ReqRequestParms146 with another Field from an offset and length
   *
   * @param value
   */
  public void setReqRequestParms146(Field source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginReqRequestParms146, REQ_REQUEST_PARMS_146_LEN);
  }

  /**
   * Update ReqRequestParms146 with another Field from an offset and length to an offset and length
   *
   * @param value
   */
  public void setReqRequestParms146(
      Field source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginReqRequestParms146 + targetIndex, targetLen);
  }
  /**
   * Returns the value of reqRequestParms147149
   *
   * @return reqRequestParms147149
   */
  public char[] getReqRequestParms147149() throws CFException {
    if (isReqRequestParms147149Modified()) {
      reqRequestParms147149 = refreshReqRequestParms147149();
    }
    return reqRequestParms147149;
  }

  /**
   * set variable reqRequestParms147149 Corresponding COBOL Variable is REQ-REQUEST-PARMS-147-149
   *
   * @param value
   */
  public void setReqRequestParms147149(char[] value) {
    reqRequestParms147149 = checkReqRequestParms147149Constraints(value);
    serializeReqRequestParms147149(reqRequestParms147149);
  }

  /**
   * Update ReqRequestParms147149 with a char[] from an offset and length
   *
   * @param value
   */
  public void setReqRequestParms147149(char[] source, int sourceIndex) {
    replace(
        source,
        sourceIndex,
        source.length,
        beginReqRequestParms147149,
        reqRequestParms147149.length);
  }

  public void setReqRequestParms147149(char[] source, int sourceIndex, int sourceLen) {
    replace(
        source, sourceIndex, sourceLen, beginReqRequestParms147149, reqRequestParms147149.length);
  }

  /**
   * Update ReqRequestParms147149 with a char[] from an offset and length to an offset and length
   *
   * @param value
   */
  public void setReqRequestParms147149(
      char[] source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginReqRequestParms147149 + targetIndex, targetLen);
  }

  /**
   * Update ReqRequestParms147149 with another Field
   *
   * @param value
   */
  public void setReqRequestParms147149(Field source) {
    replace(source, 0, source.length(), beginReqRequestParms147149, REQ_REQUEST_PARMS_147149_LEN);
  }

  /**
   * Update ReqRequestParms147149 with another Field from an offset and length
   *
   * @param value
   */
  public void setReqRequestParms147149(Field source, int sourceIndex, int sourceLen) {
    replace(
        source, sourceIndex, sourceLen, beginReqRequestParms147149, REQ_REQUEST_PARMS_147149_LEN);
  }

  /**
   * Update ReqRequestParms147149 with another Field from an offset and length to an offset and
   * length
   *
   * @param value
   */
  public void setReqRequestParms147149(
      Field source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginReqRequestParms147149 + targetIndex, targetLen);
  }

  char[] largeViewChars88Value = "~L~".toCharArray();
  /**
   * Test condition "~L~" for isLargeViewChars()
   *
   * @return Returns true if isLargeViewChars() is "~L~"
   */
  public boolean isLargeViewChars() throws CFException {
    return (compareChars(getReqRequestParms147149(), largeViewChars88Value) == 0);
  }

  /** set values "~L~" */
  public void setLargeViewCharsTrue() {
    setReqRequestParms147149(largeViewChars88Value);
  }
  /**
   * Returns the value of reqRequestParms150
   *
   * @return reqRequestParms150
   */
  public char[] getReqRequestParms150() throws CFException {
    if (isReqRequestParms150Modified()) {
      reqRequestParms150 = refreshReqRequestParms150();
    }
    return reqRequestParms150;
  }

  /**
   * set variable reqRequestParms150 Corresponding COBOL Variable is REQ-REQUEST-PARMS-150
   *
   * @param value
   */
  public void setReqRequestParms150(char[] value) {
    reqRequestParms150 = checkReqRequestParms150Constraints(value);
    serializeReqRequestParms150(reqRequestParms150);
  }

  /**
   * Update ReqRequestParms150 with a char[] from an offset and length
   *
   * @param value
   */
  public void setReqRequestParms150(char[] source, int sourceIndex) {
    replace(source, sourceIndex, source.length, beginReqRequestParms150, reqRequestParms150.length);
  }

  public void setReqRequestParms150(char[] source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginReqRequestParms150, reqRequestParms150.length);
  }

  /**
   * Update ReqRequestParms150 with a char[] from an offset and length to an offset and length
   *
   * @param value
   */
  public void setReqRequestParms150(
      char[] source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginReqRequestParms150 + targetIndex, targetLen);
  }

  /**
   * Update ReqRequestParms150 with another Field
   *
   * @param value
   */
  public void setReqRequestParms150(Field source) {
    replace(source, 0, source.length(), beginReqRequestParms150, REQ_REQUEST_PARMS_150_LEN);
  }

  /**
   * Update ReqRequestParms150 with another Field from an offset and length
   *
   * @param value
   */
  public void setReqRequestParms150(Field source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginReqRequestParms150, REQ_REQUEST_PARMS_150_LEN);
  }

  /**
   * Update ReqRequestParms150 with another Field from an offset and length to an offset and length
   *
   * @param value
   */
  public void setReqRequestParms150(
      Field source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginReqRequestParms150 + targetIndex, targetLen);
  }

  char[] reqEnvironDevel88Value = "D".toCharArray();
  /**
   * Test condition "D" for isReqEnvironDevel()
   *
   * @return Returns true if isReqEnvironDevel() is "D"
   */
  public boolean isReqEnvironDevel() throws CFException {
    return (compareChars(getReqRequestParms150(), reqEnvironDevel88Value) == 0);
  }

  /** set values "D" */
  public void setReqEnvironDevelTrue() {
    setReqRequestParms150(reqEnvironDevel88Value);
  }

  char[] reqEnvironInteg88Value = "I".toCharArray();
  /**
   * Test condition "I" for isReqEnvironInteg()
   *
   * @return Returns true if isReqEnvironInteg() is "I"
   */
  public boolean isReqEnvironInteg() throws CFException {
    return (compareChars(getReqRequestParms150(), reqEnvironInteg88Value) == 0);
  }

  /** set values "I" */
  public void setReqEnvironIntegTrue() {
    setReqRequestParms150(reqEnvironInteg88Value);
  }

  char[] reqEnvironSystest88Value = "S".toCharArray();
  /**
   * Test condition "S" for isReqEnvironSystest()
   *
   * @return Returns true if isReqEnvironSystest() is "S"
   */
  public boolean isReqEnvironSystest() throws CFException {
    return (compareChars(getReqRequestParms150(), reqEnvironSystest88Value) == 0);
  }

  /** set values "S" */
  public void setReqEnvironSystestTrue() {
    setReqRequestParms150(reqEnvironSystest88Value);
  }

  char[] reqEnvironProd88Value = "P".toCharArray();
  /**
   * Test condition "P" for isReqEnvironProd()
   *
   * @return Returns true if isReqEnvironProd() is "P"
   */
  public boolean isReqEnvironProd() throws CFException {
    return (compareChars(getReqRequestParms150(), reqEnvironProd88Value) == 0);
  }

  /** set values "P" */
  public void setReqEnvironProdTrue() {
    setReqRequestParms150(reqEnvironProd88Value);
  }

  char[] reqEnvironTest88Value = "T".toCharArray();
  /**
   * Test condition "T" for isReqEnvironTest()
   *
   * @return Returns true if isReqEnvironTest() is "T"
   */
  public boolean isReqEnvironTest() throws CFException {
    return (compareChars(getReqRequestParms150(), reqEnvironTest88Value) == 0);
  }

  /** set values "T" */
  public void setReqEnvironTestTrue() {
    setReqRequestParms150(reqEnvironTest88Value);
  }

  public static int getReqRequestParmsRedefFieldLength() {
    return REQ_REQUEST_PARMS_REDEF_LENGTH;
  }
}
