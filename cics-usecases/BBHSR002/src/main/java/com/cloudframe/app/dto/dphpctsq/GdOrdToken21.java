package com.cloudframe.app.dto.dphpctsq;

/**
 * The class GdOrdToken21 is used to handle fields declared in it
 *
 * @author CloudFrame Inc. created on 2025-03-25 at 08:30. using version 5.0.0.231
 */
import com.cloudframe.app.data.Field;
import com.cloudframe.app.dto.serialize.dphpctsq.*;
import com.cloudframe.app.exception.CFException;

public class GdOrdToken21 extends GdOrdToken21Serialized {

  private short gdOrdToken21L;

  private char[] gdOrdToken21T = Field.fillLowValue(515);

  /** Constructor for GdOrdToken21 */
  public GdOrdToken21() {
    // TO-DO auto generated code
  }

  /**
   * Constructor for GdOrdToken21. sets the parent value to the parent
   *
   * @param parent
   * @param begin
   */
  public GdOrdToken21(Field parent, int begin) {
    setParent(parent, begin);
  }

  /**
   * Returns the value of gdOrdToken21L
   *
   * @return gdOrdToken21L
   */
  public short getGdOrdToken21L() throws CFException {
    if (isGdOrdToken21LModified()) {
      gdOrdToken21L = refreshGdOrdToken21L();
    }
    return gdOrdToken21L;
  }

  /**
   * Update GdOrdToken21L with the passed value Corresponding COBOL Variable is GD-ORD-TOKEN-21-L
   *
   * @param number
   */
  public void setGdOrdToken21L(short number) {
    // Truncate if the number is beyond +/- Max range
    gdOrdToken21L = checkGdOrdToken21LMaxLimit(number);
    serializeGdOrdToken21L(gdOrdToken21L);
  }

  public void setGdOrdToken21L(int number) {
    number =
        checkGdOrdToken21LMaxLimit((short) number); // Truncate if value is beyond +/- Max range
    setGdOrdToken21L((short) number);
  }

  public void setGdOrdToken21L(long number) {
    number =
        checkGdOrdToken21LMaxLimit((short) number); // Truncate if value is beyond +/- Max range
    setGdOrdToken21L((short) number);
  }

  /**
   * Returns the value of gdOrdToken21T
   *
   * @return gdOrdToken21T
   */
  public char[] getGdOrdToken21T() throws CFException {
    if (isGdOrdToken21TModified()) {
      gdOrdToken21T = refreshGdOrdToken21T();
    }
    return gdOrdToken21T;
  }

  /**
   * set variable gdOrdToken21T Corresponding COBOL Variable is GD-ORD-TOKEN-21-T
   *
   * @param value
   */
  public void setGdOrdToken21T(char[] value) {
    gdOrdToken21T = checkGdOrdToken21TConstraints(value);
    serializeGdOrdToken21T(gdOrdToken21T);
  }

  /**
   * Update GdOrdToken21T with a char[] from an offset and length
   *
   * @param value
   */
  public void setGdOrdToken21T(char[] source, int sourceIndex) {
    replace(source, sourceIndex, source.length, beginGdOrdToken21T, gdOrdToken21T.length);
  }

  public void setGdOrdToken21T(char[] source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginGdOrdToken21T, gdOrdToken21T.length);
  }

  /**
   * Update GdOrdToken21T with a char[] from an offset and length to an offset and length
   *
   * @param value
   */
  public void setGdOrdToken21T(
      char[] source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginGdOrdToken21T + targetIndex, targetLen);
  }

  /**
   * Update GdOrdToken21T with another Field
   *
   * @param value
   */
  public void setGdOrdToken21T(Field source) {
    replace(source, 0, source.length(), beginGdOrdToken21T, GD_ORD_TOKEN_21_T_LEN);
  }

  /**
   * Update GdOrdToken21T with another Field from an offset and length
   *
   * @param value
   */
  public void setGdOrdToken21T(Field source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginGdOrdToken21T, GD_ORD_TOKEN_21_T_LEN);
  }

  /**
   * Update GdOrdToken21T with another Field from an offset and length to an offset and length
   *
   * @param value
   */
  public void setGdOrdToken21T(
      Field source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginGdOrdToken21T + targetIndex, targetLen);
  }

  public static int getGdOrdToken21FieldLength() {
    return GD_ORD_TOKEN_21_LENGTH;
  }
}
