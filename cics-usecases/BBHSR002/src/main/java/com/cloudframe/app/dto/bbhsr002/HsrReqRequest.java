package com.cloudframe.app.dto.bbhsr002;

/**
 * The class HsrReqRequest is used to handle fields declared in it
 *
 * @author CloudFrame Inc. created on 2025-03-25 at 08:29. using version 5.0.0.231
 */
import com.cloudframe.app.data.Field;
import com.cloudframe.app.dto.serialize.bbhsr002.*;
import com.cloudframe.app.exception.CFException;

public class HsrReqRequest extends HsrReqRequestSerialized {

  private char[] hsrReqCovTypCd = Field.fillLowValue(1);

  private char[] hsrReqMxiPolicy = Field.fillLowValue(6);

  private int hsrReqMxiPlan;

  private int hsrReqMxiClass;

  private char[] hsrReqHipaaServTypCd = Field.fillLowValue(2);

  private long hsrReqEffDate;

  private long hsrReqCancelDate;

  private char[] hsrReqVersionNo = Field.fillLowValue(1);

  private char[] hsrReqBnReqStartDt = Field.fillLowValue(8);

  /** Constructor for HsrReqRequest */
  public HsrReqRequest() {
    // TO-DO auto generated code
  }

  /**
   * Constructor for HsrReqRequest. sets the parent value to the parent
   *
   * @param parent
   * @param begin
   */
  public HsrReqRequest(Field parent, int begin) {
    setParent(parent, begin);
  }

  /**
   * Returns the value of hsrReqCovTypCd
   *
   * @return hsrReqCovTypCd
   */
  public char[] getHsrReqCovTypCd() throws CFException {
    if (isHsrReqCovTypCdModified()) {
      hsrReqCovTypCd = refreshHsrReqCovTypCd();
    }
    return hsrReqCovTypCd;
  }

  /**
   * set variable hsrReqCovTypCd Corresponding COBOL Variable is HSR-REQ-COV-TYP-CD
   *
   * @param value
   */
  public void setHsrReqCovTypCd(char[] value) {
    hsrReqCovTypCd = checkHsrReqCovTypCdConstraints(value);
    serializeHsrReqCovTypCd(hsrReqCovTypCd);
  }

  /**
   * Update HsrReqCovTypCd with a char[] from an offset and length
   *
   * @param value
   */
  public void setHsrReqCovTypCd(char[] source, int sourceIndex) {
    replace(source, sourceIndex, source.length, beginHsrReqCovTypCd, hsrReqCovTypCd.length);
  }

  public void setHsrReqCovTypCd(char[] source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginHsrReqCovTypCd, hsrReqCovTypCd.length);
  }

  /**
   * Update HsrReqCovTypCd with a char[] from an offset and length to an offset and length
   *
   * @param value
   */
  public void setHsrReqCovTypCd(
      char[] source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginHsrReqCovTypCd + targetIndex, targetLen);
  }

  /**
   * Update HsrReqCovTypCd with another Field
   *
   * @param value
   */
  public void setHsrReqCovTypCd(Field source) {
    replace(source, 0, source.length(), beginHsrReqCovTypCd, HSR_REQ_COV_TYP_CD_LEN);
  }

  /**
   * Update HsrReqCovTypCd with another Field from an offset and length
   *
   * @param value
   */
  public void setHsrReqCovTypCd(Field source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginHsrReqCovTypCd, HSR_REQ_COV_TYP_CD_LEN);
  }

  /**
   * Update HsrReqCovTypCd with another Field from an offset and length to an offset and length
   *
   * @param value
   */
  public void setHsrReqCovTypCd(
      Field source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginHsrReqCovTypCd + targetIndex, targetLen);
  }
  /**
   * Returns the value of hsrReqMxiPolicy
   *
   * @return hsrReqMxiPolicy
   */
  public char[] getHsrReqMxiPolicy() throws CFException {
    if (isHsrReqMxiPolicyModified()) {
      hsrReqMxiPolicy = refreshHsrReqMxiPolicy();
    }
    return hsrReqMxiPolicy;
  }

  /**
   * set variable hsrReqMxiPolicy Corresponding COBOL Variable is HSR-REQ-MXI-POLICY
   *
   * @param value
   */
  public void setHsrReqMxiPolicy(char[] value) {
    hsrReqMxiPolicy = checkHsrReqMxiPolicyConstraints(value);
    serializeHsrReqMxiPolicy(hsrReqMxiPolicy);
  }

  /**
   * Update HsrReqMxiPolicy with a char[] from an offset and length
   *
   * @param value
   */
  public void setHsrReqMxiPolicy(char[] source, int sourceIndex) {
    replace(source, sourceIndex, source.length, beginHsrReqMxiPolicy, hsrReqMxiPolicy.length);
  }

  public void setHsrReqMxiPolicy(char[] source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginHsrReqMxiPolicy, hsrReqMxiPolicy.length);
  }

  /**
   * Update HsrReqMxiPolicy with a char[] from an offset and length to an offset and length
   *
   * @param value
   */
  public void setHsrReqMxiPolicy(
      char[] source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginHsrReqMxiPolicy + targetIndex, targetLen);
  }

  /**
   * Update HsrReqMxiPolicy with another Field
   *
   * @param value
   */
  public void setHsrReqMxiPolicy(Field source) {
    replace(source, 0, source.length(), beginHsrReqMxiPolicy, HSR_REQ_MXI_POLICY_LEN);
  }

  /**
   * Update HsrReqMxiPolicy with another Field from an offset and length
   *
   * @param value
   */
  public void setHsrReqMxiPolicy(Field source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginHsrReqMxiPolicy, HSR_REQ_MXI_POLICY_LEN);
  }

  /**
   * Update HsrReqMxiPolicy with another Field from an offset and length to an offset and length
   *
   * @param value
   */
  public void setHsrReqMxiPolicy(
      Field source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginHsrReqMxiPolicy + targetIndex, targetLen);
  }
  /**
   * Returns the value of hsrReqMxiPlan
   *
   * @return hsrReqMxiPlan
   */
  public int getHsrReqMxiPlan() throws CFException {
    if (isHsrReqMxiPlanModified()) {
      hsrReqMxiPlan = refreshHsrReqMxiPlan();
    }
    return hsrReqMxiPlan;
  }

  /**
   * Update HsrReqMxiPlan with the passed value Corresponding COBOL Variable is HSR-REQ-MXI-PLAN
   *
   * @param number
   */
  public void setHsrReqMxiPlan(int number) {
    // Truncate if the number is beyond +/- Max range
    hsrReqMxiPlan = checkHsrReqMxiPlanMaxLimit(number);
    serializeHsrReqMxiPlan(hsrReqMxiPlan);
  }

  public void setHsrReqMxiPlan(long number) {
    number = checkHsrReqMxiPlanMaxLimit(number); // Truncate if value is beyond +/- Max range
    setHsrReqMxiPlan((int) number);
  }

  /**
   * Update HsrReqMxiPlan with the passed value
   *
   * @param value (String or char[])
   */
  public void setHsrReqMxiPlan(char[] value) throws CFException {
    hsrReqMxiPlan = serializeHsrReqMxiPlan(value);
  }
  /**
   * Update HsrReqMxiPlan with the passed value
   *
   * @param value (String or char[])
   */
  public void setHsrReqMxiPlanString(char[] value) throws CFException {
    setHsrReqMxiPlan(value);
  }
  /**
   * Returns the value of hsrReqMxiClass
   *
   * @return hsrReqMxiClass
   */
  public int getHsrReqMxiClass() throws CFException {
    if (isHsrReqMxiClassModified()) {
      hsrReqMxiClass = refreshHsrReqMxiClass();
    }
    return hsrReqMxiClass;
  }

  /**
   * Update HsrReqMxiClass with the passed value Corresponding COBOL Variable is HSR-REQ-MXI-CLASS
   *
   * @param number
   */
  public void setHsrReqMxiClass(int number) {
    // Truncate if the number is beyond +/- Max range
    hsrReqMxiClass = checkHsrReqMxiClassMaxLimit(number);
    serializeHsrReqMxiClass(hsrReqMxiClass);
  }

  public void setHsrReqMxiClass(long number) {
    number = checkHsrReqMxiClassMaxLimit(number); // Truncate if value is beyond +/- Max range
    setHsrReqMxiClass((int) number);
  }

  /**
   * Update HsrReqMxiClass with the passed value
   *
   * @param value (String or char[])
   */
  public void setHsrReqMxiClass(char[] value) throws CFException {
    hsrReqMxiClass = serializeHsrReqMxiClass(value);
  }
  /**
   * Update HsrReqMxiClass with the passed value
   *
   * @param value (String or char[])
   */
  public void setHsrReqMxiClassString(char[] value) throws CFException {
    setHsrReqMxiClass(value);
  }
  /**
   * Returns the value of hsrReqHipaaServTypCd
   *
   * @return hsrReqHipaaServTypCd
   */
  public char[] getHsrReqHipaaServTypCd() throws CFException {
    if (isHsrReqHipaaServTypCdModified()) {
      hsrReqHipaaServTypCd = refreshHsrReqHipaaServTypCd();
    }
    return hsrReqHipaaServTypCd;
  }

  /**
   * set variable hsrReqHipaaServTypCd Corresponding COBOL Variable is HSR-REQ-HIPAA-SERV-TYP-CD
   *
   * @param value
   */
  public void setHsrReqHipaaServTypCd(char[] value) {
    hsrReqHipaaServTypCd = checkHsrReqHipaaServTypCdConstraints(value);
    serializeHsrReqHipaaServTypCd(hsrReqHipaaServTypCd);
  }

  /**
   * Update HsrReqHipaaServTypCd with a char[] from an offset and length
   *
   * @param value
   */
  public void setHsrReqHipaaServTypCd(char[] source, int sourceIndex) {
    replace(
        source, sourceIndex, source.length, beginHsrReqHipaaServTypCd, hsrReqHipaaServTypCd.length);
  }

  public void setHsrReqHipaaServTypCd(char[] source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginHsrReqHipaaServTypCd, hsrReqHipaaServTypCd.length);
  }

  /**
   * Update HsrReqHipaaServTypCd with a char[] from an offset and length to an offset and length
   *
   * @param value
   */
  public void setHsrReqHipaaServTypCd(
      char[] source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginHsrReqHipaaServTypCd + targetIndex, targetLen);
  }

  /**
   * Update HsrReqHipaaServTypCd with another Field
   *
   * @param value
   */
  public void setHsrReqHipaaServTypCd(Field source) {
    replace(source, 0, source.length(), beginHsrReqHipaaServTypCd, HSR_REQ_HIPAA_SERV_TYP_CD_LEN);
  }

  /**
   * Update HsrReqHipaaServTypCd with another Field from an offset and length
   *
   * @param value
   */
  public void setHsrReqHipaaServTypCd(Field source, int sourceIndex, int sourceLen) {
    replace(
        source, sourceIndex, sourceLen, beginHsrReqHipaaServTypCd, HSR_REQ_HIPAA_SERV_TYP_CD_LEN);
  }

  /**
   * Update HsrReqHipaaServTypCd with another Field from an offset and length to an offset and
   * length
   *
   * @param value
   */
  public void setHsrReqHipaaServTypCd(
      Field source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginHsrReqHipaaServTypCd + targetIndex, targetLen);
  }
  /**
   * Returns the value of hsrReqEffDate
   *
   * @return hsrReqEffDate
   */
  public long getHsrReqEffDate() throws CFException {
    if (isHsrReqEffDateModified()) {
      hsrReqEffDate = refreshHsrReqEffDate();
    }
    return hsrReqEffDate;
  }

  /**
   * Update HsrReqEffDate with the passed value Corresponding COBOL Variable is HSR-REQ-EFF-DATE
   *
   * @param number
   */
  public void setHsrReqEffDate(long number) {
    // Truncate if the number is beyond +/- Max range
    hsrReqEffDate = checkHsrReqEffDateMaxLimit(number);
    serializeHsrReqEffDate(hsrReqEffDate);
  }

  /**
   * Update HsrReqEffDate with the passed value
   *
   * @param value (String or char[])
   */
  public void setHsrReqEffDate(char[] value) throws CFException {
    hsrReqEffDate = serializeHsrReqEffDate(value);
  }
  /**
   * Update HsrReqEffDate with the passed value
   *
   * @param value (String or char[])
   */
  public void setHsrReqEffDateString(char[] value) throws CFException {
    setHsrReqEffDate(value);
  }
  /**
   * Returns the value of hsrReqCancelDate
   *
   * @return hsrReqCancelDate
   */
  public long getHsrReqCancelDate() throws CFException {
    if (isHsrReqCancelDateModified()) {
      hsrReqCancelDate = refreshHsrReqCancelDate();
    }
    return hsrReqCancelDate;
  }

  /**
   * Update HsrReqCancelDate with the passed value Corresponding COBOL Variable is
   * HSR-REQ-CANCEL-DATE
   *
   * @param number
   */
  public void setHsrReqCancelDate(long number) {
    // Truncate if the number is beyond +/- Max range
    hsrReqCancelDate = checkHsrReqCancelDateMaxLimit(number);
    serializeHsrReqCancelDate(hsrReqCancelDate);
  }

  /**
   * Update HsrReqCancelDate with the passed value
   *
   * @param value (String or char[])
   */
  public void setHsrReqCancelDate(char[] value) throws CFException {
    hsrReqCancelDate = serializeHsrReqCancelDate(value);
  }
  /**
   * Update HsrReqCancelDate with the passed value
   *
   * @param value (String or char[])
   */
  public void setHsrReqCancelDateString(char[] value) throws CFException {
    setHsrReqCancelDate(value);
  }
  /**
   * Returns the value of hsrReqVersionNo
   *
   * @return hsrReqVersionNo
   */
  public char[] getHsrReqVersionNo() throws CFException {
    if (isHsrReqVersionNoModified()) {
      hsrReqVersionNo = refreshHsrReqVersionNo();
    }
    return hsrReqVersionNo;
  }

  /**
   * set variable hsrReqVersionNo Corresponding COBOL Variable is HSR-REQ-VERSION-NO
   *
   * @param value
   */
  public void setHsrReqVersionNo(char[] value) {
    hsrReqVersionNo = checkHsrReqVersionNoConstraints(value);
    serializeHsrReqVersionNo(hsrReqVersionNo);
  }

  /**
   * Update HsrReqVersionNo with a char[] from an offset and length
   *
   * @param value
   */
  public void setHsrReqVersionNo(char[] source, int sourceIndex) {
    replace(source, sourceIndex, source.length, beginHsrReqVersionNo, hsrReqVersionNo.length);
  }

  public void setHsrReqVersionNo(char[] source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginHsrReqVersionNo, hsrReqVersionNo.length);
  }

  /**
   * Update HsrReqVersionNo with a char[] from an offset and length to an offset and length
   *
   * @param value
   */
  public void setHsrReqVersionNo(
      char[] source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginHsrReqVersionNo + targetIndex, targetLen);
  }

  /**
   * Update HsrReqVersionNo with another Field
   *
   * @param value
   */
  public void setHsrReqVersionNo(Field source) {
    replace(source, 0, source.length(), beginHsrReqVersionNo, HSR_REQ_VERSION_NO_LEN);
  }

  /**
   * Update HsrReqVersionNo with another Field from an offset and length
   *
   * @param value
   */
  public void setHsrReqVersionNo(Field source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginHsrReqVersionNo, HSR_REQ_VERSION_NO_LEN);
  }

  /**
   * Update HsrReqVersionNo with another Field from an offset and length to an offset and length
   *
   * @param value
   */
  public void setHsrReqVersionNo(
      Field source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginHsrReqVersionNo + targetIndex, targetLen);
  }
  /**
   * Returns the value of hsrReqBnReqStartDt
   *
   * @return hsrReqBnReqStartDt
   */
  public char[] getHsrReqBnReqStartDt() throws CFException {
    if (isHsrReqBnReqStartDtModified()) {
      hsrReqBnReqStartDt = refreshHsrReqBnReqStartDt();
    }
    return hsrReqBnReqStartDt;
  }

  /**
   * set variable hsrReqBnReqStartDt Corresponding COBOL Variable is HSR-REQ-BN-REQ-START-DT
   *
   * @param value
   */
  public void setHsrReqBnReqStartDt(char[] value) {
    hsrReqBnReqStartDt = checkHsrReqBnReqStartDtConstraints(value);
    serializeHsrReqBnReqStartDt(hsrReqBnReqStartDt);
  }

  /**
   * Update HsrReqBnReqStartDt with a char[] from an offset and length
   *
   * @param value
   */
  public void setHsrReqBnReqStartDt(char[] source, int sourceIndex) {
    replace(source, sourceIndex, source.length, beginHsrReqBnReqStartDt, hsrReqBnReqStartDt.length);
  }

  public void setHsrReqBnReqStartDt(char[] source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginHsrReqBnReqStartDt, hsrReqBnReqStartDt.length);
  }

  /**
   * Update HsrReqBnReqStartDt with a char[] from an offset and length to an offset and length
   *
   * @param value
   */
  public void setHsrReqBnReqStartDt(
      char[] source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginHsrReqBnReqStartDt + targetIndex, targetLen);
  }

  /**
   * Update HsrReqBnReqStartDt with another Field
   *
   * @param value
   */
  public void setHsrReqBnReqStartDt(Field source) {
    replace(source, 0, source.length(), beginHsrReqBnReqStartDt, HSR_REQ_BN_REQ_START_DT_LEN);
  }

  /**
   * Update HsrReqBnReqStartDt with another Field from an offset and length
   *
   * @param value
   */
  public void setHsrReqBnReqStartDt(Field source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginHsrReqBnReqStartDt, HSR_REQ_BN_REQ_START_DT_LEN);
  }

  /**
   * Update HsrReqBnReqStartDt with another Field from an offset and length to an offset and length
   *
   * @param value
   */
  public void setHsrReqBnReqStartDt(
      Field source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginHsrReqBnReqStartDt + targetIndex, targetLen);
  }

  public static int getHsrReqRequestFieldLength() {
    return HSR_REQ_REQUEST_LENGTH;
  }
}
