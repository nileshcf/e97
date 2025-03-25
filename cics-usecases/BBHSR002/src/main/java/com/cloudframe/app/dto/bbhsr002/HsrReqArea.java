package com.cloudframe.app.dto.bbhsr002;

/**
 * The class HsrReqArea is used to handle fields declared in it
 *
 * @author CloudFrame Inc. created on 2025-03-25 at 08:29. using version 5.0.0.231
 */
import com.cloudframe.app.data.Field;
import com.cloudframe.app.dto.serialize.bbhsr002.*;
import com.cloudframe.app.exception.CFException;

public class HsrReqArea extends HsrReqAreaSerialized {

  private HsrReqFunctionCall hsrReqFunctionCall = new HsrReqFunctionCall();
  private HsrReqGetmainIdentifier hsrReqGetmainIdentifier = new HsrReqGetmainIdentifier();

  private char[] hsrReqCommonAreaSw = Field.fillLowValue(1);
  private HsrReqContractMessage hsrReqContractMessage = new HsrReqContractMessage();
  private HsrReqRequest hsrReqRequest = new HsrReqRequest();

  /** Constructor for HsrReqArea */
  public HsrReqArea() {
    // TO-DO auto generated code
  }

  /**
   * Constructor for HsrReqArea. sets the parent value to the parent
   *
   * @param parent
   * @param begin
   */
  public HsrReqArea(Field parent, int begin) {
    setParent(parent, begin);
  }

  @Override
  public void setParent(Field parent, int begin) {
    super.setParent(parent, begin);
    hsrReqFunctionCall.setParent(this, getStartOffset() + 0);
    hsrReqGetmainIdentifier.setParent(this, getStartOffset() + 23);
    hsrReqContractMessage.setParent(this, getStartOffset() + 40);
    hsrReqRequest.setParent(this, getStartOffset() + 43);
  }

  /**
   * Returns the value of hsrReqFunctionCall
   *
   * @return hsrReqFunctionCall
   */
  public HsrReqFunctionCall getHsrReqFunctionCall() {
    return hsrReqFunctionCall;
  }
  /**
   * Update HsrReqFunctionCall with the passed value Corresponding COBOL Variable is
   * HSR-REQ-FUNCTION-CALL
   *
   * @param value
   */
  public void setHsrReqFunctionCall(char[] value) {
    hsrReqFunctionCall.setString(value);
  }

  /**
   * Update HsrReqFunctionCall with a String from an offset and length
   *
   * @param value
   */
  public void setHsrReqFunctionCall(char[] source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, hsrReqFunctionCall.begin, hsrReqFunctionCall.length());
  }

  /**
   * Update HsrReqFunctionCall with a String from an offset and length to an offset and length
   *
   * @param value
   */
  public void setHsrReqFunctionCall(
      char[] source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, hsrReqFunctionCall.begin + targetIndex, targetLen);
  }

  /**
   * Update HsrReqFunctionCall with another Field
   *
   * @param value
   */
  public void setHsrReqFunctionCall(Field source) {
    replace(source, 0, source.length(), hsrReqFunctionCall.begin, hsrReqFunctionCall.length());
  }

  /**
   * Update HsrReqFunctionCall with another Field from an offset and length
   *
   * @param value
   */
  public void setHsrReqFunctionCall(Field source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, hsrReqFunctionCall.begin, hsrReqFunctionCall.length());
  }

  /**
   * Update HsrReqFunctionCall with another Field from an offset and length to an offset and length
   *
   * @param value
   */
  public void setHsrReqFunctionCall(
      Field source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, hsrReqFunctionCall.begin + targetIndex, targetLen);
  }
  /**
   * Returns the value of hsrReqGetmainIdentifier
   *
   * @return hsrReqGetmainIdentifier
   */
  public HsrReqGetmainIdentifier getHsrReqGetmainIdentifier() {
    return hsrReqGetmainIdentifier;
  }
  /**
   * Update HsrReqGetmainIdentifier with the passed value Corresponding COBOL Variable is
   * HSR-REQ-GETMAIN-IDENTIFIER
   *
   * @param value
   */
  public void setHsrReqGetmainIdentifier(char[] value) {
    hsrReqGetmainIdentifier.setString(value);
  }

  /**
   * Update HsrReqGetmainIdentifier with a String from an offset and length
   *
   * @param value
   */
  public void setHsrReqGetmainIdentifier(char[] source, int sourceIndex, int sourceLen) {
    replace(
        source,
        sourceIndex,
        sourceLen,
        hsrReqGetmainIdentifier.begin,
        hsrReqGetmainIdentifier.length());
  }

  /**
   * Update HsrReqGetmainIdentifier with a String from an offset and length to an offset and length
   *
   * @param value
   */
  public void setHsrReqGetmainIdentifier(
      char[] source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, hsrReqGetmainIdentifier.begin + targetIndex, targetLen);
  }

  /**
   * Update HsrReqGetmainIdentifier with another Field
   *
   * @param value
   */
  public void setHsrReqGetmainIdentifier(Field source) {
    replace(
        source,
        0,
        source.length(),
        hsrReqGetmainIdentifier.begin,
        hsrReqGetmainIdentifier.length());
  }

  /**
   * Update HsrReqGetmainIdentifier with another Field from an offset and length
   *
   * @param value
   */
  public void setHsrReqGetmainIdentifier(Field source, int sourceIndex, int sourceLen) {
    replace(
        source,
        sourceIndex,
        sourceLen,
        hsrReqGetmainIdentifier.begin,
        hsrReqGetmainIdentifier.length());
  }

  /**
   * Update HsrReqGetmainIdentifier with another Field from an offset and length to an offset and
   * length
   *
   * @param value
   */
  public void setHsrReqGetmainIdentifier(
      Field source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, hsrReqGetmainIdentifier.begin + targetIndex, targetLen);
  }
  /**
   * Returns the value of hsrReqCommonAreaSw
   *
   * @return hsrReqCommonAreaSw
   */
  public char[] getHsrReqCommonAreaSw() throws CFException {
    if (isHsrReqCommonAreaSwModified()) {
      hsrReqCommonAreaSw = refreshHsrReqCommonAreaSw();
    }
    return hsrReqCommonAreaSw;
  }

  /**
   * set variable hsrReqCommonAreaSw Corresponding COBOL Variable is HSR-REQ-COMMON-AREA-SW
   *
   * @param value
   */
  public void setHsrReqCommonAreaSw(char[] value) {
    hsrReqCommonAreaSw = checkHsrReqCommonAreaSwConstraints(value);
    serializeHsrReqCommonAreaSw(hsrReqCommonAreaSw);
  }

  /**
   * Update HsrReqCommonAreaSw with a char[] from an offset and length
   *
   * @param value
   */
  public void setHsrReqCommonAreaSw(char[] source, int sourceIndex) {
    replace(source, sourceIndex, source.length, beginHsrReqCommonAreaSw, hsrReqCommonAreaSw.length);
  }

  public void setHsrReqCommonAreaSw(char[] source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginHsrReqCommonAreaSw, hsrReqCommonAreaSw.length);
  }

  /**
   * Update HsrReqCommonAreaSw with a char[] from an offset and length to an offset and length
   *
   * @param value
   */
  public void setHsrReqCommonAreaSw(
      char[] source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginHsrReqCommonAreaSw + targetIndex, targetLen);
  }

  /**
   * Update HsrReqCommonAreaSw with another Field
   *
   * @param value
   */
  public void setHsrReqCommonAreaSw(Field source) {
    replace(source, 0, source.length(), beginHsrReqCommonAreaSw, HSR_REQ_COMMON_AREA_SW_LEN);
  }

  /**
   * Update HsrReqCommonAreaSw with another Field from an offset and length
   *
   * @param value
   */
  public void setHsrReqCommonAreaSw(Field source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginHsrReqCommonAreaSw, HSR_REQ_COMMON_AREA_SW_LEN);
  }

  /**
   * Update HsrReqCommonAreaSw with another Field from an offset and length to an offset and length
   *
   * @param value
   */
  public void setHsrReqCommonAreaSw(
      Field source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginHsrReqCommonAreaSw + targetIndex, targetLen);
  }

  char[] hsrReqCommonAreaTwa88Value = "T".toCharArray();
  /**
   * Test condition "T" for isHsrReqCommonAreaTwa()
   *
   * @return Returns true if isHsrReqCommonAreaTwa() is "T"
   */
  public boolean isHsrReqCommonAreaTwa() throws CFException {
    return (compareChars(getHsrReqCommonAreaSw(), hsrReqCommonAreaTwa88Value) == 0);
  }

  /** set values "T" */
  public void setHsrReqCommonAreaTwaTrue() {
    setHsrReqCommonAreaSw(hsrReqCommonAreaTwa88Value);
  }

  char[] hsrReqCommonAreaCci88Value = "F".toCharArray();
  /**
   * Test condition "F" for isHsrReqCommonAreaCci()
   *
   * @return Returns true if isHsrReqCommonAreaCci() is "F"
   */
  public boolean isHsrReqCommonAreaCci() throws CFException {
    return (compareChars(getHsrReqCommonAreaSw(), hsrReqCommonAreaCci88Value) == 0);
  }

  /** set values "F" */
  public void setHsrReqCommonAreaCciTrue() {
    setHsrReqCommonAreaSw(hsrReqCommonAreaCci88Value);
  }

  char[] hsrReqCommonAreaNone88Value = "N".toCharArray();
  /**
   * Test condition "N" for isHsrReqCommonAreaNone()
   *
   * @return Returns true if isHsrReqCommonAreaNone() is "N"
   */
  public boolean isHsrReqCommonAreaNone() throws CFException {
    return (compareChars(getHsrReqCommonAreaSw(), hsrReqCommonAreaNone88Value) == 0);
  }

  /** set values "N" */
  public void setHsrReqCommonAreaNoneTrue() {
    setHsrReqCommonAreaSw(hsrReqCommonAreaNone88Value);
  }
  /**
   * Returns the value of hsrReqContractMessage
   *
   * @return hsrReqContractMessage
   */
  public HsrReqContractMessage getHsrReqContractMessage() {
    return hsrReqContractMessage;
  }
  /**
   * Update HsrReqContractMessage with the passed value Corresponding COBOL Variable is
   * HSR-REQ-CONTRACT-MESSAGE
   *
   * @param value
   */
  public void setHsrReqContractMessage(char[] value) {
    hsrReqContractMessage.setString(value);
  }

  /**
   * Update HsrReqContractMessage with a String from an offset and length
   *
   * @param value
   */
  public void setHsrReqContractMessage(char[] source, int sourceIndex, int sourceLen) {
    replace(
        source,
        sourceIndex,
        sourceLen,
        hsrReqContractMessage.begin,
        hsrReqContractMessage.length());
  }

  /**
   * Update HsrReqContractMessage with a String from an offset and length to an offset and length
   *
   * @param value
   */
  public void setHsrReqContractMessage(
      char[] source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, hsrReqContractMessage.begin + targetIndex, targetLen);
  }

  /**
   * Update HsrReqContractMessage with another Field
   *
   * @param value
   */
  public void setHsrReqContractMessage(Field source) {
    replace(
        source, 0, source.length(), hsrReqContractMessage.begin, hsrReqContractMessage.length());
  }

  /**
   * Update HsrReqContractMessage with another Field from an offset and length
   *
   * @param value
   */
  public void setHsrReqContractMessage(Field source, int sourceIndex, int sourceLen) {
    replace(
        source,
        sourceIndex,
        sourceLen,
        hsrReqContractMessage.begin,
        hsrReqContractMessage.length());
  }

  /**
   * Update HsrReqContractMessage with another Field from an offset and length to an offset and
   * length
   *
   * @param value
   */
  public void setHsrReqContractMessage(
      Field source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, hsrReqContractMessage.begin + targetIndex, targetLen);
  }
  /**
   * Returns the value of hsrReqRequest
   *
   * @return hsrReqRequest
   */
  public HsrReqRequest getHsrReqRequest() {
    return hsrReqRequest;
  }
  /**
   * Update HsrReqRequest with the passed value Corresponding COBOL Variable is HSR-REQ-REQUEST
   *
   * @param value
   */
  public void setHsrReqRequest(char[] value) {
    hsrReqRequest.setString(value);
  }

  /**
   * Update HsrReqRequest with a String from an offset and length
   *
   * @param value
   */
  public void setHsrReqRequest(char[] source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, hsrReqRequest.begin, hsrReqRequest.length());
  }

  /**
   * Update HsrReqRequest with a String from an offset and length to an offset and length
   *
   * @param value
   */
  public void setHsrReqRequest(
      char[] source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, hsrReqRequest.begin + targetIndex, targetLen);
  }

  /**
   * Update HsrReqRequest with another Field
   *
   * @param value
   */
  public void setHsrReqRequest(Field source) {
    replace(source, 0, source.length(), hsrReqRequest.begin, hsrReqRequest.length());
  }

  /**
   * Update HsrReqRequest with another Field from an offset and length
   *
   * @param value
   */
  public void setHsrReqRequest(Field source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, hsrReqRequest.begin, hsrReqRequest.length());
  }

  /**
   * Update HsrReqRequest with another Field from an offset and length to an offset and length
   *
   * @param value
   */
  public void setHsrReqRequest(
      Field source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, hsrReqRequest.begin + targetIndex, targetLen);
  }

  public static int getHsrReqAreaFieldLength() {
    return HSR_REQ_AREA_LENGTH;
  }
}
