package com.cloudframe.app.dto.c5427bhi;

/**
 * The class CrtnRequestData is used to handle fields declared in it
 *
 * @author CloudFrame Inc. created on 2025-03-25 at 08:32. using version 5.0.0.231
 */
import com.cloudframe.app.data.Field;
import com.cloudframe.app.dto.serialize.c5427bhi.*;
import com.cloudframe.app.exception.CFException;

public class CrtnRequestData extends CrtnRequestDataSerialized {

  private char[] crtnReqHipaaVerNbr = Field.fillLowValue(1);

  private char[] crtnReqEffDt = Field.fillLowValue(10);

  private char[] crtnReqCancDt = Field.fillLowValue(10);

  private char[] crtnReqStsCd = Field.fillLowValue(1);

  /** Constructor for CrtnRequestData */
  public CrtnRequestData() {
    // TO-DO auto generated code
  }

  /**
   * Constructor for CrtnRequestData. sets the parent value to the parent
   *
   * @param parent
   * @param begin
   */
  public CrtnRequestData(Field parent, int begin) {
    setParent(parent, begin);
  }

  /**
   * Returns the value of crtnReqHipaaVerNbr
   *
   * @return crtnReqHipaaVerNbr
   */
  public char[] getCrtnReqHipaaVerNbr() throws CFException {
    if (isCrtnReqHipaaVerNbrModified()) {
      crtnReqHipaaVerNbr = refreshCrtnReqHipaaVerNbr();
    }
    return crtnReqHipaaVerNbr;
  }

  /**
   * set variable crtnReqHipaaVerNbr Corresponding COBOL Variable is CRTN-REQ-HIPAA-VER-NBR
   *
   * @param value
   */
  public void setCrtnReqHipaaVerNbr(char[] value) {
    crtnReqHipaaVerNbr = checkCrtnReqHipaaVerNbrConstraints(value);
    serializeCrtnReqHipaaVerNbr(crtnReqHipaaVerNbr);
  }

  /**
   * Update CrtnReqHipaaVerNbr with a char[] from an offset and length
   *
   * @param value
   */
  public void setCrtnReqHipaaVerNbr(char[] source, int sourceIndex) {
    replace(source, sourceIndex, source.length, beginCrtnReqHipaaVerNbr, crtnReqHipaaVerNbr.length);
  }

  public void setCrtnReqHipaaVerNbr(char[] source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginCrtnReqHipaaVerNbr, crtnReqHipaaVerNbr.length);
  }

  /**
   * Update CrtnReqHipaaVerNbr with a char[] from an offset and length to an offset and length
   *
   * @param value
   */
  public void setCrtnReqHipaaVerNbr(
      char[] source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginCrtnReqHipaaVerNbr + targetIndex, targetLen);
  }

  /**
   * Update CrtnReqHipaaVerNbr with another Field
   *
   * @param value
   */
  public void setCrtnReqHipaaVerNbr(Field source) {
    replace(source, 0, source.length(), beginCrtnReqHipaaVerNbr, CRTN_REQ_HIPAA_VER_NBR_LEN);
  }

  /**
   * Update CrtnReqHipaaVerNbr with another Field from an offset and length
   *
   * @param value
   */
  public void setCrtnReqHipaaVerNbr(Field source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginCrtnReqHipaaVerNbr, CRTN_REQ_HIPAA_VER_NBR_LEN);
  }

  /**
   * Update CrtnReqHipaaVerNbr with another Field from an offset and length to an offset and length
   *
   * @param value
   */
  public void setCrtnReqHipaaVerNbr(
      Field source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginCrtnReqHipaaVerNbr + targetIndex, targetLen);
  }
  /**
   * Returns the value of crtnReqEffDt
   *
   * @return crtnReqEffDt
   */
  public char[] getCrtnReqEffDt() throws CFException {
    if (isCrtnReqEffDtModified()) {
      crtnReqEffDt = refreshCrtnReqEffDt();
    }
    return crtnReqEffDt;
  }

  /**
   * set variable crtnReqEffDt Corresponding COBOL Variable is CRTN-REQ-EFF-DT
   *
   * @param value
   */
  public void setCrtnReqEffDt(char[] value) {
    crtnReqEffDt = checkCrtnReqEffDtConstraints(value);
    serializeCrtnReqEffDt(crtnReqEffDt);
  }

  /**
   * Update CrtnReqEffDt with a char[] from an offset and length
   *
   * @param value
   */
  public void setCrtnReqEffDt(char[] source, int sourceIndex) {
    replace(source, sourceIndex, source.length, beginCrtnReqEffDt, crtnReqEffDt.length);
  }

  public void setCrtnReqEffDt(char[] source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginCrtnReqEffDt, crtnReqEffDt.length);
  }

  /**
   * Update CrtnReqEffDt with a char[] from an offset and length to an offset and length
   *
   * @param value
   */
  public void setCrtnReqEffDt(
      char[] source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginCrtnReqEffDt + targetIndex, targetLen);
  }

  /**
   * Update CrtnReqEffDt with another Field
   *
   * @param value
   */
  public void setCrtnReqEffDt(Field source) {
    replace(source, 0, source.length(), beginCrtnReqEffDt, CRTN_REQ_EFF_DT_LEN);
  }

  /**
   * Update CrtnReqEffDt with another Field from an offset and length
   *
   * @param value
   */
  public void setCrtnReqEffDt(Field source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginCrtnReqEffDt, CRTN_REQ_EFF_DT_LEN);
  }

  /**
   * Update CrtnReqEffDt with another Field from an offset and length to an offset and length
   *
   * @param value
   */
  public void setCrtnReqEffDt(
      Field source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginCrtnReqEffDt + targetIndex, targetLen);
  }
  /**
   * Returns the value of crtnReqCancDt
   *
   * @return crtnReqCancDt
   */
  public char[] getCrtnReqCancDt() throws CFException {
    if (isCrtnReqCancDtModified()) {
      crtnReqCancDt = refreshCrtnReqCancDt();
    }
    return crtnReqCancDt;
  }

  /**
   * set variable crtnReqCancDt Corresponding COBOL Variable is CRTN-REQ-CANC-DT
   *
   * @param value
   */
  public void setCrtnReqCancDt(char[] value) {
    crtnReqCancDt = checkCrtnReqCancDtConstraints(value);
    serializeCrtnReqCancDt(crtnReqCancDt);
  }

  /**
   * Update CrtnReqCancDt with a char[] from an offset and length
   *
   * @param value
   */
  public void setCrtnReqCancDt(char[] source, int sourceIndex) {
    replace(source, sourceIndex, source.length, beginCrtnReqCancDt, crtnReqCancDt.length);
  }

  public void setCrtnReqCancDt(char[] source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginCrtnReqCancDt, crtnReqCancDt.length);
  }

  /**
   * Update CrtnReqCancDt with a char[] from an offset and length to an offset and length
   *
   * @param value
   */
  public void setCrtnReqCancDt(
      char[] source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginCrtnReqCancDt + targetIndex, targetLen);
  }

  /**
   * Update CrtnReqCancDt with another Field
   *
   * @param value
   */
  public void setCrtnReqCancDt(Field source) {
    replace(source, 0, source.length(), beginCrtnReqCancDt, CRTN_REQ_CANC_DT_LEN);
  }

  /**
   * Update CrtnReqCancDt with another Field from an offset and length
   *
   * @param value
   */
  public void setCrtnReqCancDt(Field source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginCrtnReqCancDt, CRTN_REQ_CANC_DT_LEN);
  }

  /**
   * Update CrtnReqCancDt with another Field from an offset and length to an offset and length
   *
   * @param value
   */
  public void setCrtnReqCancDt(
      Field source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginCrtnReqCancDt + targetIndex, targetLen);
  }
  /**
   * Returns the value of crtnReqStsCd
   *
   * @return crtnReqStsCd
   */
  public char[] getCrtnReqStsCd() throws CFException {
    if (isCrtnReqStsCdModified()) {
      crtnReqStsCd = refreshCrtnReqStsCd();
    }
    return crtnReqStsCd;
  }

  /**
   * set variable crtnReqStsCd Corresponding COBOL Variable is CRTN-REQ-STS-CD
   *
   * @param value
   */
  public void setCrtnReqStsCd(char[] value) {
    crtnReqStsCd = checkCrtnReqStsCdConstraints(value);
    serializeCrtnReqStsCd(crtnReqStsCd);
  }

  /**
   * Update CrtnReqStsCd with a char[] from an offset and length
   *
   * @param value
   */
  public void setCrtnReqStsCd(char[] source, int sourceIndex) {
    replace(source, sourceIndex, source.length, beginCrtnReqStsCd, crtnReqStsCd.length);
  }

  public void setCrtnReqStsCd(char[] source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginCrtnReqStsCd, crtnReqStsCd.length);
  }

  /**
   * Update CrtnReqStsCd with a char[] from an offset and length to an offset and length
   *
   * @param value
   */
  public void setCrtnReqStsCd(
      char[] source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginCrtnReqStsCd + targetIndex, targetLen);
  }

  /**
   * Update CrtnReqStsCd with another Field
   *
   * @param value
   */
  public void setCrtnReqStsCd(Field source) {
    replace(source, 0, source.length(), beginCrtnReqStsCd, CRTN_REQ_STS_CD_LEN);
  }

  /**
   * Update CrtnReqStsCd with another Field from an offset and length
   *
   * @param value
   */
  public void setCrtnReqStsCd(Field source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginCrtnReqStsCd, CRTN_REQ_STS_CD_LEN);
  }

  /**
   * Update CrtnReqStsCd with another Field from an offset and length to an offset and length
   *
   * @param value
   */
  public void setCrtnReqStsCd(
      Field source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginCrtnReqStsCd + targetIndex, targetLen);
  }

  public static int getCrtnRequestDataFieldLength() {
    return CRTN_REQUEST_DATA_LENGTH;
  }
}
