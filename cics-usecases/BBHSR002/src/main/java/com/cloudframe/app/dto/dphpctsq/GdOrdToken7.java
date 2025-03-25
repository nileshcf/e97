package com.cloudframe.app.dto.dphpctsq;

/**
 * The class GdOrdToken7 is used to handle fields declared in it
 *
 * @author CloudFrame Inc. created on 2025-03-25 at 08:30. using version 5.0.0.231
 */
import com.cloudframe.app.data.Field;
import com.cloudframe.app.dto.serialize.dphpctsq.*;
import com.cloudframe.app.exception.CFException;

public class GdOrdToken7 extends GdOrdToken7Serialized {

  private short gdOrdToken7L;

  private char[] gdOrdToken7T = Field.fillLowValue(515);

  /** Constructor for GdOrdToken7 */
  public GdOrdToken7() {
    // TO-DO auto generated code
  }

  /**
   * Constructor for GdOrdToken7. sets the parent value to the parent
   *
   * @param parent
   * @param begin
   */
  public GdOrdToken7(Field parent, int begin) {
    setParent(parent, begin);
  }

  /**
   * Returns the value of gdOrdToken7L
   *
   * @return gdOrdToken7L
   */
  public short getGdOrdToken7L() throws CFException {
    if (isGdOrdToken7LModified()) {
      gdOrdToken7L = refreshGdOrdToken7L();
    }
    return gdOrdToken7L;
  }

  /**
   * Update GdOrdToken7L with the passed value Corresponding COBOL Variable is GD-ORD-TOKEN-7-L
   *
   * @param number
   */
  public void setGdOrdToken7L(short number) {
    // Truncate if the number is beyond +/- Max range
    gdOrdToken7L = checkGdOrdToken7LMaxLimit(number);
    serializeGdOrdToken7L(gdOrdToken7L);
  }

  public void setGdOrdToken7L(int number) {
    number = checkGdOrdToken7LMaxLimit((short) number); // Truncate if value is beyond +/- Max range
    setGdOrdToken7L((short) number);
  }

  public void setGdOrdToken7L(long number) {
    number = checkGdOrdToken7LMaxLimit((short) number); // Truncate if value is beyond +/- Max range
    setGdOrdToken7L((short) number);
  }

  /**
   * Returns the value of gdOrdToken7T
   *
   * @return gdOrdToken7T
   */
  public char[] getGdOrdToken7T() throws CFException {
    if (isGdOrdToken7TModified()) {
      gdOrdToken7T = refreshGdOrdToken7T();
    }
    return gdOrdToken7T;
  }

  /**
   * set variable gdOrdToken7T Corresponding COBOL Variable is GD-ORD-TOKEN-7-T
   *
   * @param value
   */
  public void setGdOrdToken7T(char[] value) {
    gdOrdToken7T = checkGdOrdToken7TConstraints(value);
    serializeGdOrdToken7T(gdOrdToken7T);
  }

  /**
   * Update GdOrdToken7T with a char[] from an offset and length
   *
   * @param value
   */
  public void setGdOrdToken7T(char[] source, int sourceIndex) {
    replace(source, sourceIndex, source.length, beginGdOrdToken7T, gdOrdToken7T.length);
  }

  public void setGdOrdToken7T(char[] source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginGdOrdToken7T, gdOrdToken7T.length);
  }

  /**
   * Update GdOrdToken7T with a char[] from an offset and length to an offset and length
   *
   * @param value
   */
  public void setGdOrdToken7T(
      char[] source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginGdOrdToken7T + targetIndex, targetLen);
  }

  /**
   * Update GdOrdToken7T with another Field
   *
   * @param value
   */
  public void setGdOrdToken7T(Field source) {
    replace(source, 0, source.length(), beginGdOrdToken7T, GD_ORD_TOKEN_7_T_LEN);
  }

  /**
   * Update GdOrdToken7T with another Field from an offset and length
   *
   * @param value
   */
  public void setGdOrdToken7T(Field source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginGdOrdToken7T, GD_ORD_TOKEN_7_T_LEN);
  }

  /**
   * Update GdOrdToken7T with another Field from an offset and length to an offset and length
   *
   * @param value
   */
  public void setGdOrdToken7T(
      Field source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginGdOrdToken7T + targetIndex, targetLen);
  }

  public static int getGdOrdToken7FieldLength() {
    return GD_ORD_TOKEN_7_LENGTH;
  }
}
