package com.cloudframe.app.dto.dphpctsq;

/**
 * The class GdOrdToken28 is used to handle fields declared in it
 *
 * @author CloudFrame Inc. created on 2025-03-25 at 08:30. using version 5.0.0.231
 */
import com.cloudframe.app.data.Field;
import com.cloudframe.app.dto.serialize.dphpctsq.*;
import com.cloudframe.app.exception.CFException;

public class GdOrdToken28 extends GdOrdToken28Serialized {

  private short gdOrdToken28L;

  private char[] gdOrdToken28T = Field.fillLowValue(515);

  /** Constructor for GdOrdToken28 */
  public GdOrdToken28() {
    // TO-DO auto generated code
  }

  /**
   * Constructor for GdOrdToken28. sets the parent value to the parent
   *
   * @param parent
   * @param begin
   */
  public GdOrdToken28(Field parent, int begin) {
    setParent(parent, begin);
  }

  /**
   * Returns the value of gdOrdToken28L
   *
   * @return gdOrdToken28L
   */
  public short getGdOrdToken28L() throws CFException {
    if (isGdOrdToken28LModified()) {
      gdOrdToken28L = refreshGdOrdToken28L();
    }
    return gdOrdToken28L;
  }

  /**
   * Update GdOrdToken28L with the passed value Corresponding COBOL Variable is GD-ORD-TOKEN-28-L
   *
   * @param number
   */
  public void setGdOrdToken28L(short number) {
    // Truncate if the number is beyond +/- Max range
    gdOrdToken28L = checkGdOrdToken28LMaxLimit(number);
    serializeGdOrdToken28L(gdOrdToken28L);
  }

  public void setGdOrdToken28L(int number) {
    number =
        checkGdOrdToken28LMaxLimit((short) number); // Truncate if value is beyond +/- Max range
    setGdOrdToken28L((short) number);
  }

  public void setGdOrdToken28L(long number) {
    number =
        checkGdOrdToken28LMaxLimit((short) number); // Truncate if value is beyond +/- Max range
    setGdOrdToken28L((short) number);
  }

  /**
   * Returns the value of gdOrdToken28T
   *
   * @return gdOrdToken28T
   */
  public char[] getGdOrdToken28T() throws CFException {
    if (isGdOrdToken28TModified()) {
      gdOrdToken28T = refreshGdOrdToken28T();
    }
    return gdOrdToken28T;
  }

  /**
   * set variable gdOrdToken28T Corresponding COBOL Variable is GD-ORD-TOKEN-28-T
   *
   * @param value
   */
  public void setGdOrdToken28T(char[] value) {
    gdOrdToken28T = checkGdOrdToken28TConstraints(value);
    serializeGdOrdToken28T(gdOrdToken28T);
  }

  /**
   * Update GdOrdToken28T with a char[] from an offset and length
   *
   * @param value
   */
  public void setGdOrdToken28T(char[] source, int sourceIndex) {
    replace(source, sourceIndex, source.length, beginGdOrdToken28T, gdOrdToken28T.length);
  }

  public void setGdOrdToken28T(char[] source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginGdOrdToken28T, gdOrdToken28T.length);
  }

  /**
   * Update GdOrdToken28T with a char[] from an offset and length to an offset and length
   *
   * @param value
   */
  public void setGdOrdToken28T(
      char[] source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginGdOrdToken28T + targetIndex, targetLen);
  }

  /**
   * Update GdOrdToken28T with another Field
   *
   * @param value
   */
  public void setGdOrdToken28T(Field source) {
    replace(source, 0, source.length(), beginGdOrdToken28T, GD_ORD_TOKEN_28_T_LEN);
  }

  /**
   * Update GdOrdToken28T with another Field from an offset and length
   *
   * @param value
   */
  public void setGdOrdToken28T(Field source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginGdOrdToken28T, GD_ORD_TOKEN_28_T_LEN);
  }

  /**
   * Update GdOrdToken28T with another Field from an offset and length to an offset and length
   *
   * @param value
   */
  public void setGdOrdToken28T(
      Field source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginGdOrdToken28T + targetIndex, targetLen);
  }

  public static int getGdOrdToken28FieldLength() {
    return GD_ORD_TOKEN_28_LENGTH;
  }
}
