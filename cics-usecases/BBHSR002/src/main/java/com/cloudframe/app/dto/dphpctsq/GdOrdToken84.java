package com.cloudframe.app.dto.dphpctsq;

/**
 * The class GdOrdToken84 is used to handle fields declared in it
 *
 * @author CloudFrame Inc. created on 2025-03-25 at 08:30. using version 5.0.0.231
 */
import com.cloudframe.app.data.Field;
import com.cloudframe.app.dto.serialize.dphpctsq.*;
import com.cloudframe.app.exception.CFException;

public class GdOrdToken84 extends GdOrdToken84Serialized {

  private short gdOrdToken84L;

  private char[] gdOrdToken84T = Field.fillLowValue(515);

  /** Constructor for GdOrdToken84 */
  public GdOrdToken84() {
    // TO-DO auto generated code
  }

  /**
   * Constructor for GdOrdToken84. sets the parent value to the parent
   *
   * @param parent
   * @param begin
   */
  public GdOrdToken84(Field parent, int begin) {
    setParent(parent, begin);
  }

  /**
   * Returns the value of gdOrdToken84L
   *
   * @return gdOrdToken84L
   */
  public short getGdOrdToken84L() throws CFException {
    if (isGdOrdToken84LModified()) {
      gdOrdToken84L = refreshGdOrdToken84L();
    }
    return gdOrdToken84L;
  }

  /**
   * Update GdOrdToken84L with the passed value Corresponding COBOL Variable is GD-ORD-TOKEN-84-L
   *
   * @param number
   */
  public void setGdOrdToken84L(short number) {
    // Truncate if the number is beyond +/- Max range
    gdOrdToken84L = checkGdOrdToken84LMaxLimit(number);
    serializeGdOrdToken84L(gdOrdToken84L);
  }

  public void setGdOrdToken84L(int number) {
    number =
        checkGdOrdToken84LMaxLimit((short) number); // Truncate if value is beyond +/- Max range
    setGdOrdToken84L((short) number);
  }

  public void setGdOrdToken84L(long number) {
    number =
        checkGdOrdToken84LMaxLimit((short) number); // Truncate if value is beyond +/- Max range
    setGdOrdToken84L((short) number);
  }

  /**
   * Returns the value of gdOrdToken84T
   *
   * @return gdOrdToken84T
   */
  public char[] getGdOrdToken84T() throws CFException {
    if (isGdOrdToken84TModified()) {
      gdOrdToken84T = refreshGdOrdToken84T();
    }
    return gdOrdToken84T;
  }

  /**
   * set variable gdOrdToken84T Corresponding COBOL Variable is GD-ORD-TOKEN-84-T
   *
   * @param value
   */
  public void setGdOrdToken84T(char[] value) {
    gdOrdToken84T = checkGdOrdToken84TConstraints(value);
    serializeGdOrdToken84T(gdOrdToken84T);
  }

  /**
   * Update GdOrdToken84T with a char[] from an offset and length
   *
   * @param value
   */
  public void setGdOrdToken84T(char[] source, int sourceIndex) {
    replace(source, sourceIndex, source.length, beginGdOrdToken84T, gdOrdToken84T.length);
  }

  public void setGdOrdToken84T(char[] source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginGdOrdToken84T, gdOrdToken84T.length);
  }

  /**
   * Update GdOrdToken84T with a char[] from an offset and length to an offset and length
   *
   * @param value
   */
  public void setGdOrdToken84T(
      char[] source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginGdOrdToken84T + targetIndex, targetLen);
  }

  /**
   * Update GdOrdToken84T with another Field
   *
   * @param value
   */
  public void setGdOrdToken84T(Field source) {
    replace(source, 0, source.length(), beginGdOrdToken84T, GD_ORD_TOKEN_84_T_LEN);
  }

  /**
   * Update GdOrdToken84T with another Field from an offset and length
   *
   * @param value
   */
  public void setGdOrdToken84T(Field source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginGdOrdToken84T, GD_ORD_TOKEN_84_T_LEN);
  }

  /**
   * Update GdOrdToken84T with another Field from an offset and length to an offset and length
   *
   * @param value
   */
  public void setGdOrdToken84T(
      Field source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginGdOrdToken84T + targetIndex, targetLen);
  }

  public static int getGdOrdToken84FieldLength() {
    return GD_ORD_TOKEN_84_LENGTH;
  }
}
