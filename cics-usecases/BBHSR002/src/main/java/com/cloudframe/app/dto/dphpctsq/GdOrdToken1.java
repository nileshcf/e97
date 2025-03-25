package com.cloudframe.app.dto.dphpctsq;

/**
 * The class GdOrdToken1 is used to handle fields declared in it
 *
 * @author CloudFrame Inc. created on 2025-03-25 at 08:30. using version 5.0.0.231
 */
import com.cloudframe.app.data.Field;
import com.cloudframe.app.dto.serialize.dphpctsq.*;
import com.cloudframe.app.exception.CFException;

public class GdOrdToken1 extends GdOrdToken1Serialized {

  private short gdOrdToken1L;

  private char[] gdOrdToken1T = Field.fillLowValue(515);

  /** Constructor for GdOrdToken1 */
  public GdOrdToken1() {
    // TO-DO auto generated code
  }

  /**
   * Constructor for GdOrdToken1. sets the parent value to the parent
   *
   * @param parent
   * @param begin
   */
  public GdOrdToken1(Field parent, int begin) {
    setParent(parent, begin);
  }

  /**
   * Returns the value of gdOrdToken1L
   *
   * @return gdOrdToken1L
   */
  public short getGdOrdToken1L() throws CFException {
    if (isGdOrdToken1LModified()) {
      gdOrdToken1L = refreshGdOrdToken1L();
    }
    return gdOrdToken1L;
  }

  /**
   * Update GdOrdToken1L with the passed value Corresponding COBOL Variable is GD-ORD-TOKEN-1-L
   *
   * @param number
   */
  public void setGdOrdToken1L(short number) {
    // Truncate if the number is beyond +/- Max range
    gdOrdToken1L = checkGdOrdToken1LMaxLimit(number);
    serializeGdOrdToken1L(gdOrdToken1L);
  }

  public void setGdOrdToken1L(int number) {
    number = checkGdOrdToken1LMaxLimit((short) number); // Truncate if value is beyond +/- Max range
    setGdOrdToken1L((short) number);
  }

  public void setGdOrdToken1L(long number) {
    number = checkGdOrdToken1LMaxLimit((short) number); // Truncate if value is beyond +/- Max range
    setGdOrdToken1L((short) number);
  }

  /**
   * Returns the value of gdOrdToken1T
   *
   * @return gdOrdToken1T
   */
  public char[] getGdOrdToken1T() throws CFException {
    if (isGdOrdToken1TModified()) {
      gdOrdToken1T = refreshGdOrdToken1T();
    }
    return gdOrdToken1T;
  }

  /**
   * set variable gdOrdToken1T Corresponding COBOL Variable is GD-ORD-TOKEN-1-T
   *
   * @param value
   */
  public void setGdOrdToken1T(char[] value) {
    gdOrdToken1T = checkGdOrdToken1TConstraints(value);
    serializeGdOrdToken1T(gdOrdToken1T);
  }

  /**
   * Update GdOrdToken1T with a char[] from an offset and length
   *
   * @param value
   */
  public void setGdOrdToken1T(char[] source, int sourceIndex) {
    replace(source, sourceIndex, source.length, beginGdOrdToken1T, gdOrdToken1T.length);
  }

  public void setGdOrdToken1T(char[] source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginGdOrdToken1T, gdOrdToken1T.length);
  }

  /**
   * Update GdOrdToken1T with a char[] from an offset and length to an offset and length
   *
   * @param value
   */
  public void setGdOrdToken1T(
      char[] source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginGdOrdToken1T + targetIndex, targetLen);
  }

  /**
   * Update GdOrdToken1T with another Field
   *
   * @param value
   */
  public void setGdOrdToken1T(Field source) {
    replace(source, 0, source.length(), beginGdOrdToken1T, GD_ORD_TOKEN_1_T_LEN);
  }

  /**
   * Update GdOrdToken1T with another Field from an offset and length
   *
   * @param value
   */
  public void setGdOrdToken1T(Field source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginGdOrdToken1T, GD_ORD_TOKEN_1_T_LEN);
  }

  /**
   * Update GdOrdToken1T with another Field from an offset and length to an offset and length
   *
   * @param value
   */
  public void setGdOrdToken1T(
      Field source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginGdOrdToken1T + targetIndex, targetLen);
  }

  public static int getGdOrdToken1FieldLength() {
    return GD_ORD_TOKEN_1_LENGTH;
  }
}
