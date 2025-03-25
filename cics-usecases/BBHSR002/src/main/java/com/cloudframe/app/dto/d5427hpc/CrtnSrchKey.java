package com.cloudframe.app.dto.d5427hpc;

/**
 * The class CrtnSrchKey is used to handle fields declared in it
 *
 * @author CloudFrame Inc. created on 2025-03-25 at 08:29. using version 5.0.0.231
 */
import com.cloudframe.app.data.Field;
import com.cloudframe.app.dto.serialize.d5427hpc.*;
import com.cloudframe.app.exception.CFException;

public class CrtnSrchKey extends CrtnSrchKeySerialized {

  private CrtnSrchKeyPartial crtnSrchKeyPartial = new CrtnSrchKeyPartial();

  private char[] crtnKeyCode = Field.fillLowValue(2);

  /** Constructor for CrtnSrchKey */
  public CrtnSrchKey() {
    // TO-DO auto generated code
  }

  /**
   * Constructor for CrtnSrchKey. sets the parent value to the parent
   *
   * @param parent
   * @param begin
   */
  public CrtnSrchKey(Field parent, int begin) {
    setParent(parent, begin);
  }

  @Override
  public void setParent(Field parent, int begin) {
    super.setParent(parent, begin);
    crtnSrchKeyPartial.setParent(this, getStartOffset() + 0);
  }

  /**
   * Returns the value of crtnSrchKeyPartial
   *
   * @return crtnSrchKeyPartial
   */
  public CrtnSrchKeyPartial getCrtnSrchKeyPartial() {
    return crtnSrchKeyPartial;
  }
  /**
   * Update CrtnSrchKeyPartial with the passed value Corresponding COBOL Variable is
   * CRTN-SRCH-KEY-PARTIAL
   *
   * @param value
   */
  public void setCrtnSrchKeyPartial(char[] value) {
    crtnSrchKeyPartial.setString(value);
  }

  /**
   * Update CrtnSrchKeyPartial with a String from an offset and length
   *
   * @param value
   */
  public void setCrtnSrchKeyPartial(char[] source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, crtnSrchKeyPartial.begin, crtnSrchKeyPartial.length());
  }

  /**
   * Update CrtnSrchKeyPartial with a String from an offset and length to an offset and length
   *
   * @param value
   */
  public void setCrtnSrchKeyPartial(
      char[] source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, crtnSrchKeyPartial.begin + targetIndex, targetLen);
  }

  /**
   * Update CrtnSrchKeyPartial with another Field
   *
   * @param value
   */
  public void setCrtnSrchKeyPartial(Field source) {
    replace(source, 0, source.length(), crtnSrchKeyPartial.begin, crtnSrchKeyPartial.length());
  }

  /**
   * Update CrtnSrchKeyPartial with another Field from an offset and length
   *
   * @param value
   */
  public void setCrtnSrchKeyPartial(Field source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, crtnSrchKeyPartial.begin, crtnSrchKeyPartial.length());
  }

  /**
   * Update CrtnSrchKeyPartial with another Field from an offset and length to an offset and length
   *
   * @param value
   */
  public void setCrtnSrchKeyPartial(
      Field source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, crtnSrchKeyPartial.begin + targetIndex, targetLen);
  }
  /**
   * Returns the value of crtnKeyCode
   *
   * @return crtnKeyCode
   */
  public char[] getCrtnKeyCode() throws CFException {
    if (isCrtnKeyCodeModified()) {
      crtnKeyCode = refreshCrtnKeyCode();
    }
    return crtnKeyCode;
  }

  /**
   * set variable crtnKeyCode Corresponding COBOL Variable is CRTN-KEY-CODE
   *
   * @param value
   */
  public void setCrtnKeyCode(char[] value) {
    crtnKeyCode = checkCrtnKeyCodeConstraints(value);
    serializeCrtnKeyCode(crtnKeyCode);
  }

  /**
   * Update CrtnKeyCode with a char[] from an offset and length
   *
   * @param value
   */
  public void setCrtnKeyCode(char[] source, int sourceIndex) {
    replace(source, sourceIndex, source.length, beginCrtnKeyCode, crtnKeyCode.length);
  }

  public void setCrtnKeyCode(char[] source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginCrtnKeyCode, crtnKeyCode.length);
  }

  /**
   * Update CrtnKeyCode with a char[] from an offset and length to an offset and length
   *
   * @param value
   */
  public void setCrtnKeyCode(
      char[] source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginCrtnKeyCode + targetIndex, targetLen);
  }

  /**
   * Update CrtnKeyCode with another Field
   *
   * @param value
   */
  public void setCrtnKeyCode(Field source) {
    replace(source, 0, source.length(), beginCrtnKeyCode, CRTN_KEY_CODE_LEN);
  }

  /**
   * Update CrtnKeyCode with another Field from an offset and length
   *
   * @param value
   */
  public void setCrtnKeyCode(Field source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginCrtnKeyCode, CRTN_KEY_CODE_LEN);
  }

  /**
   * Update CrtnKeyCode with another Field from an offset and length to an offset and length
   *
   * @param value
   */
  public void setCrtnKeyCode(
      Field source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginCrtnKeyCode + targetIndex, targetLen);
  }

  public static int getCrtnSrchKeyFieldLength() {
    return CRTN_SRCH_KEY_LENGTH;
  }
}
