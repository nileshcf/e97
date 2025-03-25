package com.cloudframe.app.dto.c5427hpc;

/**
 * The class CrtnSrchKeyPartial is used to handle fields declared in it
 *
 * @author CloudFrame Inc. created on 2025-03-25 at 08:29. using version 5.0.0.231
 */
import com.cloudframe.app.data.Field;
import com.cloudframe.app.dto.serialize.c5427hpc.*;
import com.cloudframe.app.exception.CFException;

public class CrtnSrchKeyPartial extends CrtnSrchKeyPartialSerialized {

  private int crtnQueryTyp;

  private char[] crtnHipaaVerNbr = Field.fillLowValue(1);

  /** Constructor for CrtnSrchKeyPartial */
  public CrtnSrchKeyPartial() {
    // TO-DO auto generated code
  }

  /**
   * Constructor for CrtnSrchKeyPartial. sets the parent value to the parent
   *
   * @param parent
   * @param begin
   */
  public CrtnSrchKeyPartial(Field parent, int begin) {
    setParent(parent, begin);
  }

  /**
   * Returns the value of crtnQueryTyp
   *
   * @return crtnQueryTyp
   */
  public int getCrtnQueryTyp() throws CFException {
    if (isCrtnQueryTypModified()) {
      crtnQueryTyp = refreshCrtnQueryTyp();
    }
    return crtnQueryTyp;
  }

  /**
   * Update CrtnQueryTyp with the passed value Corresponding COBOL Variable is CRTN-QUERY-TYP
   *
   * @param number
   */
  public void setCrtnQueryTyp(int number) {
    // Truncate if the number is beyond +/- Max range
    crtnQueryTyp = checkCrtnQueryTypMaxLimit(number);
    serializeCrtnQueryTyp(crtnQueryTyp);
  }

  public void setCrtnQueryTyp(long number) {
    number = checkCrtnQueryTypMaxLimit(number); // Truncate if value is beyond +/- Max range
    setCrtnQueryTyp((int) number);
  }

  /**
   * Returns the value of crtnHipaaVerNbr
   *
   * @return crtnHipaaVerNbr
   */
  public char[] getCrtnHipaaVerNbr() throws CFException {
    if (isCrtnHipaaVerNbrModified()) {
      crtnHipaaVerNbr = refreshCrtnHipaaVerNbr();
    }
    return crtnHipaaVerNbr;
  }

  /**
   * set variable crtnHipaaVerNbr Corresponding COBOL Variable is CRTN-HIPAA-VER-NBR
   *
   * @param value
   */
  public void setCrtnHipaaVerNbr(char[] value) {
    crtnHipaaVerNbr = checkCrtnHipaaVerNbrConstraints(value);
    serializeCrtnHipaaVerNbr(crtnHipaaVerNbr);
  }

  /**
   * Update CrtnHipaaVerNbr with a char[] from an offset and length
   *
   * @param value
   */
  public void setCrtnHipaaVerNbr(char[] source, int sourceIndex) {
    replace(source, sourceIndex, source.length, beginCrtnHipaaVerNbr, crtnHipaaVerNbr.length);
  }

  public void setCrtnHipaaVerNbr(char[] source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginCrtnHipaaVerNbr, crtnHipaaVerNbr.length);
  }

  /**
   * Update CrtnHipaaVerNbr with a char[] from an offset and length to an offset and length
   *
   * @param value
   */
  public void setCrtnHipaaVerNbr(
      char[] source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginCrtnHipaaVerNbr + targetIndex, targetLen);
  }

  /**
   * Update CrtnHipaaVerNbr with another Field
   *
   * @param value
   */
  public void setCrtnHipaaVerNbr(Field source) {
    replace(source, 0, source.length(), beginCrtnHipaaVerNbr, CRTN_HIPAA_VER_NBR_LEN);
  }

  /**
   * Update CrtnHipaaVerNbr with another Field from an offset and length
   *
   * @param value
   */
  public void setCrtnHipaaVerNbr(Field source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginCrtnHipaaVerNbr, CRTN_HIPAA_VER_NBR_LEN);
  }

  /**
   * Update CrtnHipaaVerNbr with another Field from an offset and length to an offset and length
   *
   * @param value
   */
  public void setCrtnHipaaVerNbr(
      Field source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginCrtnHipaaVerNbr + targetIndex, targetLen);
  }

  public static int getCrtnSrchKeyPartialFieldLength() {
    return CRTN_SRCH_KEY_PARTIAL_LENGTH;
  }
}
