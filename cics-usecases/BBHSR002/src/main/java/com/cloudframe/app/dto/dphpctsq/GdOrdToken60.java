package com.cloudframe.app.dto.dphpctsq;

/**
 * The class GdOrdToken60 is used to handle fields declared in it
 *
 * @author CloudFrame Inc. created on 2025-03-25 at 08:30. using version 5.0.0.231
 */
import com.cloudframe.app.data.Field;
import com.cloudframe.app.dto.serialize.dphpctsq.*;
import com.cloudframe.app.exception.CFException;

public class GdOrdToken60 extends GdOrdToken60Serialized {

  private short gdOrdToken60L;

  private char[] gdOrdToken60T = Field.fillLowValue(515);

  /** Constructor for GdOrdToken60 */
  public GdOrdToken60() {
    // TO-DO auto generated code
  }

  /**
   * Constructor for GdOrdToken60. sets the parent value to the parent
   *
   * @param parent
   * @param begin
   */
  public GdOrdToken60(Field parent, int begin) {
    setParent(parent, begin);
  }

  /**
   * Returns the value of gdOrdToken60L
   *
   * @return gdOrdToken60L
   */
  public short getGdOrdToken60L() throws CFException {
    if (isGdOrdToken60LModified()) {
      gdOrdToken60L = refreshGdOrdToken60L();
    }
    return gdOrdToken60L;
  }

  /**
   * Update GdOrdToken60L with the passed value Corresponding COBOL Variable is GD-ORD-TOKEN-60-L
   *
   * @param number
   */
  public void setGdOrdToken60L(short number) {
    // Truncate if the number is beyond +/- Max range
    gdOrdToken60L = checkGdOrdToken60LMaxLimit(number);
    serializeGdOrdToken60L(gdOrdToken60L);
  }

  public void setGdOrdToken60L(int number) {
    number =
        checkGdOrdToken60LMaxLimit((short) number); // Truncate if value is beyond +/- Max range
    setGdOrdToken60L((short) number);
  }

  public void setGdOrdToken60L(long number) {
    number =
        checkGdOrdToken60LMaxLimit((short) number); // Truncate if value is beyond +/- Max range
    setGdOrdToken60L((short) number);
  }

  /**
   * Returns the value of gdOrdToken60T
   *
   * @return gdOrdToken60T
   */
  public char[] getGdOrdToken60T() throws CFException {
    if (isGdOrdToken60TModified()) {
      gdOrdToken60T = refreshGdOrdToken60T();
    }
    return gdOrdToken60T;
  }

  /**
   * set variable gdOrdToken60T Corresponding COBOL Variable is GD-ORD-TOKEN-60-T
   *
   * @param value
   */
  public void setGdOrdToken60T(char[] value) {
    gdOrdToken60T = checkGdOrdToken60TConstraints(value);
    serializeGdOrdToken60T(gdOrdToken60T);
  }

  /**
   * Update GdOrdToken60T with a char[] from an offset and length
   *
   * @param value
   */
  public void setGdOrdToken60T(char[] source, int sourceIndex) {
    replace(source, sourceIndex, source.length, beginGdOrdToken60T, gdOrdToken60T.length);
  }

  public void setGdOrdToken60T(char[] source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginGdOrdToken60T, gdOrdToken60T.length);
  }

  /**
   * Update GdOrdToken60T with a char[] from an offset and length to an offset and length
   *
   * @param value
   */
  public void setGdOrdToken60T(
      char[] source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginGdOrdToken60T + targetIndex, targetLen);
  }

  /**
   * Update GdOrdToken60T with another Field
   *
   * @param value
   */
  public void setGdOrdToken60T(Field source) {
    replace(source, 0, source.length(), beginGdOrdToken60T, GD_ORD_TOKEN_60_T_LEN);
  }

  /**
   * Update GdOrdToken60T with another Field from an offset and length
   *
   * @param value
   */
  public void setGdOrdToken60T(Field source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginGdOrdToken60T, GD_ORD_TOKEN_60_T_LEN);
  }

  /**
   * Update GdOrdToken60T with another Field from an offset and length to an offset and length
   *
   * @param value
   */
  public void setGdOrdToken60T(
      Field source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginGdOrdToken60T + targetIndex, targetLen);
  }

  public static int getGdOrdToken60FieldLength() {
    return GD_ORD_TOKEN_60_LENGTH;
  }
}
