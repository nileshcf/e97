package com.cloudframe.app.dto.bbhsr002;

/**
 * The class HsrReqContractMessage is used to handle fields declared in it
 *
 * @author CloudFrame Inc. created on 2025-03-25 at 08:29. using version 5.0.0.231
 */
import com.cloudframe.app.data.Field;
import com.cloudframe.app.dto.serialize.bbhsr002.*;
import com.cloudframe.app.exception.CFException;

public class HsrReqContractMessage extends HsrReqContractMessageSerialized {

  private char[] hsrReqContractRtnCd = Field.fillLowValue(3);

  /** Constructor for HsrReqContractMessage */
  public HsrReqContractMessage() {
    // TO-DO auto generated code
  }

  /**
   * Constructor for HsrReqContractMessage. sets the parent value to the parent
   *
   * @param parent
   * @param begin
   */
  public HsrReqContractMessage(Field parent, int begin) {
    setParent(parent, begin);
  }

  /**
   * Returns the value of hsrReqContractRtnCd
   *
   * @return hsrReqContractRtnCd
   */
  public char[] getHsrReqContractRtnCd() throws CFException {
    if (isHsrReqContractRtnCdModified()) {
      hsrReqContractRtnCd = refreshHsrReqContractRtnCd();
    }
    return hsrReqContractRtnCd;
  }

  /**
   * set variable hsrReqContractRtnCd Corresponding COBOL Variable is HSR-REQ-CONTRACT-RTN-CD
   *
   * @param value
   */
  public void setHsrReqContractRtnCd(char[] value) {
    hsrReqContractRtnCd = checkHsrReqContractRtnCdConstraints(value);
    serializeHsrReqContractRtnCd(hsrReqContractRtnCd);
  }

  /**
   * Update HsrReqContractRtnCd with a char[] from an offset and length
   *
   * @param value
   */
  public void setHsrReqContractRtnCd(char[] source, int sourceIndex) {
    replace(
        source, sourceIndex, source.length, beginHsrReqContractRtnCd, hsrReqContractRtnCd.length);
  }

  public void setHsrReqContractRtnCd(char[] source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginHsrReqContractRtnCd, hsrReqContractRtnCd.length);
  }

  /**
   * Update HsrReqContractRtnCd with a char[] from an offset and length to an offset and length
   *
   * @param value
   */
  public void setHsrReqContractRtnCd(
      char[] source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginHsrReqContractRtnCd + targetIndex, targetLen);
  }

  /**
   * Update HsrReqContractRtnCd with another Field
   *
   * @param value
   */
  public void setHsrReqContractRtnCd(Field source) {
    replace(source, 0, source.length(), beginHsrReqContractRtnCd, HSR_REQ_CONTRACT_RTN_CD_LEN);
  }

  /**
   * Update HsrReqContractRtnCd with another Field from an offset and length
   *
   * @param value
   */
  public void setHsrReqContractRtnCd(Field source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginHsrReqContractRtnCd, HSR_REQ_CONTRACT_RTN_CD_LEN);
  }

  /**
   * Update HsrReqContractRtnCd with another Field from an offset and length to an offset and length
   *
   * @param value
   */
  public void setHsrReqContractRtnCd(
      Field source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginHsrReqContractRtnCd + targetIndex, targetLen);
  }

  char[] hsrReqContractSuccess88Value = "000".toCharArray();
  /**
   * Test condition "000" for isHsrReqContractSuccess()
   *
   * @return Returns true if isHsrReqContractSuccess() is "000"
   */
  public boolean isHsrReqContractSuccess() throws CFException {
    return (compareChars(getHsrReqContractRtnCd(), hsrReqContractSuccess88Value) == 0);
  }

  /** set values "000" */
  public void setHsrReqContractSuccessTrue() {
    setHsrReqContractRtnCd(hsrReqContractSuccess88Value);
  }

  char[] hsrReqInvalidFnCall88Value = "CE1".toCharArray();
  /**
   * Test condition "CE1" for isHsrReqInvalidFnCall()
   *
   * @return Returns true if isHsrReqInvalidFnCall() is "CE1"
   */
  public boolean isHsrReqInvalidFnCall() throws CFException {
    return (compareChars(getHsrReqContractRtnCd(), hsrReqInvalidFnCall88Value) == 0);
  }

  /** set values "CE1" */
  public void setHsrReqInvalidFnCallTrue() {
    setHsrReqContractRtnCd(hsrReqInvalidFnCall88Value);
  }

  char[] hsrReqInvalidCaller88Value = "CE2".toCharArray();
  /**
   * Test condition "CE2" for isHsrReqInvalidCaller()
   *
   * @return Returns true if isHsrReqInvalidCaller() is "CE2"
   */
  public boolean isHsrReqInvalidCaller() throws CFException {
    return (compareChars(getHsrReqContractRtnCd(), hsrReqInvalidCaller88Value) == 0);
  }

  /** set values "CE2" */
  public void setHsrReqInvalidCallerTrue() {
    setHsrReqContractRtnCd(hsrReqInvalidCaller88Value);
  }

  char[] hsrReqInvalidRequestParms88Value = "CE3".toCharArray();
  /**
   * Test condition "CE3" for isHsrReqInvalidRequestParms()
   *
   * @return Returns true if isHsrReqInvalidRequestParms() is "CE3"
   */
  public boolean isHsrReqInvalidRequestParms() throws CFException {
    return (compareChars(getHsrReqContractRtnCd(), hsrReqInvalidRequestParms88Value) == 0);
  }

  /** set values "CE3" */
  public void setHsrReqInvalidRequestParmsTrue() {
    setHsrReqContractRtnCd(hsrReqInvalidRequestParms88Value);
  }

  char[] hsrReqInvalidCommonAreaSw88Value = "CE5".toCharArray();
  /**
   * Test condition "CE5" for isHsrReqInvalidCommonAreaSw()
   *
   * @return Returns true if isHsrReqInvalidCommonAreaSw() is "CE5"
   */
  public boolean isHsrReqInvalidCommonAreaSw() throws CFException {
    return (compareChars(getHsrReqContractRtnCd(), hsrReqInvalidCommonAreaSw88Value) == 0);
  }

  /** set values "CE5" */
  public void setHsrReqInvalidCommonAreaSwTrue() {
    setHsrReqContractRtnCd(hsrReqInvalidCommonAreaSw88Value);
  }

  char[] hsrReqContrctFailCFuncRc88Value = "CE4".toCharArray();
  /**
   * Test condition "CE4" for isHsrReqContrctFailCFuncRc()
   *
   * @return Returns true if isHsrReqContrctFailCFuncRc() is "CE4"
   */
  public boolean isHsrReqContrctFailCFuncRc() throws CFException {
    return (compareChars(getHsrReqContractRtnCd(), hsrReqContrctFailCFuncRc88Value) == 0);
  }

  /** set values "CE4" */
  public void setHsrReqContrctFailCFuncRcTrue() {
    setHsrReqContractRtnCd(hsrReqContrctFailCFuncRc88Value);
  }

  public static int getHsrReqContractMessageFieldLength() {
    return HSR_REQ_CONTRACT_MESSAGE_LENGTH;
  }
}
