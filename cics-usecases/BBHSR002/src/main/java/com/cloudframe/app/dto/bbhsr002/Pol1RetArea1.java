package com.cloudframe.app.dto.bbhsr002;

/**
 * The class Pol1RetArea1 is used to handle fields declared in it
 *
 * @author CloudFrame Inc. created on 2025-03-25 at 08:29. using version 5.0.0.231
 */
import com.cloudframe.app.common.CONSTANTS;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.dto.serialize.bbhsr002.*;
import com.cloudframe.app.exception.CFException;

public class Pol1RetArea1 extends Pol1RetArea1Serialized {

  private char[] pol1RetPolEffDate = Field.fillLowValue(10);

  private char[] pol1RetCovEndDate = Field.fillLowValue(10);

  private char[] pol1RetPolicyType = Field.fillLowValue(2);

  private char[] pol1RetVarPer = Field.fillLowValue(4);

  /** Constructor for Pol1RetArea1 */
  public Pol1RetArea1() {
    // TO-DO auto generated code
  }

  /**
   * Constructor for Pol1RetArea1. sets the parent value to the parent
   *
   * @param parent
   * @param begin
   */
  public Pol1RetArea1(Field parent, int begin) {
    setParent(parent, begin);
  }

  /**
   * Returns the value of pol1RetPolEffDate
   *
   * @return pol1RetPolEffDate
   */
  public char[] getPol1RetPolEffDate() throws CFException {
    if (isPol1RetPolEffDateModified()) {
      pol1RetPolEffDate = refreshPol1RetPolEffDate();
    }
    return pol1RetPolEffDate;
  }

  /**
   * set variable pol1RetPolEffDate Corresponding COBOL Variable is POL1-RET-POL-EFF-DATE
   *
   * @param value
   */
  public void setPol1RetPolEffDate(char[] value) {
    pol1RetPolEffDate = checkPol1RetPolEffDateConstraints(value);
    serializePol1RetPolEffDate(pol1RetPolEffDate);
  }

  /**
   * Update Pol1RetPolEffDate with a char[] from an offset and length
   *
   * @param value
   */
  public void setPol1RetPolEffDate(char[] source, int sourceIndex) {
    replace(source, sourceIndex, source.length, beginPol1RetPolEffDate, pol1RetPolEffDate.length);
  }

  public void setPol1RetPolEffDate(char[] source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginPol1RetPolEffDate, pol1RetPolEffDate.length);
  }

  /**
   * Update Pol1RetPolEffDate with a char[] from an offset and length to an offset and length
   *
   * @param value
   */
  public void setPol1RetPolEffDate(
      char[] source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginPol1RetPolEffDate + targetIndex, targetLen);
  }

  /**
   * Update Pol1RetPolEffDate with another Field
   *
   * @param value
   */
  public void setPol1RetPolEffDate(Field source) {
    replace(source, 0, source.length(), beginPol1RetPolEffDate, POL_1_RET_POL_EFF_DATE_LEN);
  }

  /**
   * Update Pol1RetPolEffDate with another Field from an offset and length
   *
   * @param value
   */
  public void setPol1RetPolEffDate(Field source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginPol1RetPolEffDate, POL_1_RET_POL_EFF_DATE_LEN);
  }

  /**
   * Update Pol1RetPolEffDate with another Field from an offset and length to an offset and length
   *
   * @param value
   */
  public void setPol1RetPolEffDate(
      Field source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginPol1RetPolEffDate + targetIndex, targetLen);
  }
  /**
   * Returns the value of pol1RetCovEndDate
   *
   * @return pol1RetCovEndDate
   */
  public char[] getPol1RetCovEndDate() throws CFException {
    if (isPol1RetCovEndDateModified()) {
      pol1RetCovEndDate = refreshPol1RetCovEndDate();
    }
    return pol1RetCovEndDate;
  }

  /**
   * set variable pol1RetCovEndDate Corresponding COBOL Variable is POL1-RET-COV-END-DATE
   *
   * @param value
   */
  public void setPol1RetCovEndDate(char[] value) {
    pol1RetCovEndDate = checkPol1RetCovEndDateConstraints(value);
    serializePol1RetCovEndDate(pol1RetCovEndDate);
  }

  /**
   * Update Pol1RetCovEndDate with a char[] from an offset and length
   *
   * @param value
   */
  public void setPol1RetCovEndDate(char[] source, int sourceIndex) {
    replace(source, sourceIndex, source.length, beginPol1RetCovEndDate, pol1RetCovEndDate.length);
  }

  public void setPol1RetCovEndDate(char[] source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginPol1RetCovEndDate, pol1RetCovEndDate.length);
  }

  /**
   * Update Pol1RetCovEndDate with a char[] from an offset and length to an offset and length
   *
   * @param value
   */
  public void setPol1RetCovEndDate(
      char[] source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginPol1RetCovEndDate + targetIndex, targetLen);
  }

  /**
   * Update Pol1RetCovEndDate with another Field
   *
   * @param value
   */
  public void setPol1RetCovEndDate(Field source) {
    replace(source, 0, source.length(), beginPol1RetCovEndDate, POL_1_RET_COV_END_DATE_LEN);
  }

  /**
   * Update Pol1RetCovEndDate with another Field from an offset and length
   *
   * @param value
   */
  public void setPol1RetCovEndDate(Field source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginPol1RetCovEndDate, POL_1_RET_COV_END_DATE_LEN);
  }

  /**
   * Update Pol1RetCovEndDate with another Field from an offset and length to an offset and length
   *
   * @param value
   */
  public void setPol1RetCovEndDate(
      Field source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginPol1RetCovEndDate + targetIndex, targetLen);
  }
  /**
   * Returns the value of pol1RetPolicyType
   *
   * @return pol1RetPolicyType
   */
  public char[] getPol1RetPolicyType() throws CFException {
    if (isPol1RetPolicyTypeModified()) {
      pol1RetPolicyType = refreshPol1RetPolicyType();
    }
    return pol1RetPolicyType;
  }

  /**
   * set variable pol1RetPolicyType Corresponding COBOL Variable is POL1-RET-POLICY-TYPE
   *
   * @param value
   */
  public void setPol1RetPolicyType(char[] value) {
    pol1RetPolicyType = checkPol1RetPolicyTypeConstraints(value);
    serializePol1RetPolicyType(pol1RetPolicyType);
  }

  /**
   * Update Pol1RetPolicyType with a char[] from an offset and length
   *
   * @param value
   */
  public void setPol1RetPolicyType(char[] source, int sourceIndex) {
    replace(source, sourceIndex, source.length, beginPol1RetPolicyType, pol1RetPolicyType.length);
  }

  public void setPol1RetPolicyType(char[] source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginPol1RetPolicyType, pol1RetPolicyType.length);
  }

  /**
   * Update Pol1RetPolicyType with a char[] from an offset and length to an offset and length
   *
   * @param value
   */
  public void setPol1RetPolicyType(
      char[] source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginPol1RetPolicyType + targetIndex, targetLen);
  }

  /**
   * Update Pol1RetPolicyType with another Field
   *
   * @param value
   */
  public void setPol1RetPolicyType(Field source) {
    replace(source, 0, source.length(), beginPol1RetPolicyType, POL_1_RET_POLICY_TYPE_LEN);
  }

  /**
   * Update Pol1RetPolicyType with another Field from an offset and length
   *
   * @param value
   */
  public void setPol1RetPolicyType(Field source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginPol1RetPolicyType, POL_1_RET_POLICY_TYPE_LEN);
  }

  /**
   * Update Pol1RetPolicyType with another Field from an offset and length to an offset and length
   *
   * @param value
   */
  public void setPol1RetPolicyType(
      Field source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginPol1RetPolicyType + targetIndex, targetLen);
  }
  /**
   * Returns the value of pol1RetVarPer
   *
   * @return pol1RetVarPer
   */
  public char[] getPol1RetVarPer() throws CFException {
    if (isPol1RetVarPerModified()) {
      pol1RetVarPer = refreshPol1RetVarPer();
    }
    return pol1RetVarPer;
  }

  /**
   * set variable pol1RetVarPer Corresponding COBOL Variable is POL1-RET-VAR-PER
   *
   * @param value
   */
  public void setPol1RetVarPer(char[] value) {
    pol1RetVarPer = checkPol1RetVarPerConstraints(value);
    serializePol1RetVarPer(pol1RetVarPer);
  }

  /**
   * Update Pol1RetVarPer with a char[] from an offset and length
   *
   * @param value
   */
  public void setPol1RetVarPer(char[] source, int sourceIndex) {
    replace(source, sourceIndex, source.length, beginPol1RetVarPer, pol1RetVarPer.length);
  }

  public void setPol1RetVarPer(char[] source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginPol1RetVarPer, pol1RetVarPer.length);
  }

  /**
   * Update Pol1RetVarPer with a char[] from an offset and length to an offset and length
   *
   * @param value
   */
  public void setPol1RetVarPer(
      char[] source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginPol1RetVarPer + targetIndex, targetLen);
  }

  /**
   * Update Pol1RetVarPer with another Field
   *
   * @param value
   */
  public void setPol1RetVarPer(Field source) {
    replace(source, 0, source.length(), beginPol1RetVarPer, POL_1_RET_VAR_PER_LEN);
  }

  /**
   * Update Pol1RetVarPer with another Field from an offset and length
   *
   * @param value
   */
  public void setPol1RetVarPer(Field source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginPol1RetVarPer, POL_1_RET_VAR_PER_LEN);
  }

  /**
   * Update Pol1RetVarPer with another Field from an offset and length to an offset and length
   *
   * @param value
   */
  public void setPol1RetVarPer(
      Field source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginPol1RetVarPer + targetIndex, targetLen);
  }

  /**
   * initializes Pol1RetArea1 String fields defaults to Spaces short/int/long defaults to zero
   * BigDecimal defaults to BigDecimal.ZERO
   */
  public void initialize() {
    setPol1RetPolEffDate(CONSTANTS.SPACE_10);
    setPol1RetCovEndDate(CONSTANTS.SPACE_10);
    setPol1RetPolicyType(CONSTANTS.SPACE_2);
    setPol1RetVarPer(CONSTANTS.SPACE_4);
  }

  public static int getPol1RetArea1FieldLength() {
    return POL_1_RET_AREA_1_LENGTH;
  }
}
