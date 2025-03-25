package com.cloudframe.app.dto.dphpctsq;

/**
 * The class GdOrdToken29 is used to handle fields declared in it
 *
 * @author CloudFrame Inc. created on 2025-03-25 at 08:30. using version 5.0.0.231
 */
import com.cloudframe.app.data.Field;
import com.cloudframe.app.dto.serialize.dphpctsq.*;
import com.cloudframe.app.exception.CFException;

public class GdOrdToken29 extends GdOrdToken29Serialized {

  private short gdOrdToken29L;

  private char[] gdOrdToken29T = Field.fillLowValue(515);

  /** Constructor for GdOrdToken29 */
  public GdOrdToken29() {
    // TO-DO auto generated code
  }

  /**
   * Constructor for GdOrdToken29. sets the parent value to the parent
   *
   * @param parent
   * @param begin
   */
  public GdOrdToken29(Field parent, int begin) {
    setParent(parent, begin);
  }

  /**
   * Returns the value of gdOrdToken29L
   *
   * @return gdOrdToken29L
   */
  public short getGdOrdToken29L() throws CFException {
    if (isGdOrdToken29LModified()) {
      gdOrdToken29L = refreshGdOrdToken29L();
    }
    return gdOrdToken29L;
  }

  /**
   * Update GdOrdToken29L with the passed value Corresponding COBOL Variable is GD-ORD-TOKEN-29-L
   *
   * @param number
   */
  public void setGdOrdToken29L(short number) {
    // Truncate if the number is beyond +/- Max range
    gdOrdToken29L = checkGdOrdToken29LMaxLimit(number);
    serializeGdOrdToken29L(gdOrdToken29L);
  }

  public void setGdOrdToken29L(int number) {
    number =
        checkGdOrdToken29LMaxLimit((short) number); // Truncate if value is beyond +/- Max range
    setGdOrdToken29L((short) number);
  }

  public void setGdOrdToken29L(long number) {
    number =
        checkGdOrdToken29LMaxLimit((short) number); // Truncate if value is beyond +/- Max range
    setGdOrdToken29L((short) number);
  }

  /**
   * Returns the value of gdOrdToken29T
   *
   * @return gdOrdToken29T
   */
  public char[] getGdOrdToken29T() throws CFException {
    if (isGdOrdToken29TModified()) {
      gdOrdToken29T = refreshGdOrdToken29T();
    }
    return gdOrdToken29T;
  }

  /**
   * set variable gdOrdToken29T Corresponding COBOL Variable is GD-ORD-TOKEN-29-T
   *
   * @param value
   */
  public void setGdOrdToken29T(char[] value) {
    gdOrdToken29T = checkGdOrdToken29TConstraints(value);
    serializeGdOrdToken29T(gdOrdToken29T);
  }

  /**
   * Update GdOrdToken29T with a char[] from an offset and length
   *
   * @param value
   */
  public void setGdOrdToken29T(char[] source, int sourceIndex) {
    replace(source, sourceIndex, source.length, beginGdOrdToken29T, gdOrdToken29T.length);
  }

  public void setGdOrdToken29T(char[] source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginGdOrdToken29T, gdOrdToken29T.length);
  }

  /**
   * Update GdOrdToken29T with a char[] from an offset and length to an offset and length
   *
   * @param value
   */
  public void setGdOrdToken29T(
      char[] source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginGdOrdToken29T + targetIndex, targetLen);
  }

  /**
   * Update GdOrdToken29T with another Field
   *
   * @param value
   */
  public void setGdOrdToken29T(Field source) {
    replace(source, 0, source.length(), beginGdOrdToken29T, GD_ORD_TOKEN_29_T_LEN);
  }

  /**
   * Update GdOrdToken29T with another Field from an offset and length
   *
   * @param value
   */
  public void setGdOrdToken29T(Field source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginGdOrdToken29T, GD_ORD_TOKEN_29_T_LEN);
  }

  /**
   * Update GdOrdToken29T with another Field from an offset and length to an offset and length
   *
   * @param value
   */
  public void setGdOrdToken29T(
      Field source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginGdOrdToken29T + targetIndex, targetLen);
  }

  public static int getGdOrdToken29FieldLength() {
    return GD_ORD_TOKEN_29_LENGTH;
  }
}
