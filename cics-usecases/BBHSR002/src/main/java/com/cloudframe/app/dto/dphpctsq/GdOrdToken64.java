package com.cloudframe.app.dto.dphpctsq;

/**
 * The class GdOrdToken64 is used to handle fields declared in it
 *
 * @author CloudFrame Inc. created on 2025-03-25 at 08:30. using version 5.0.0.231
 */
import com.cloudframe.app.data.Field;
import com.cloudframe.app.dto.serialize.dphpctsq.*;
import com.cloudframe.app.exception.CFException;

public class GdOrdToken64 extends GdOrdToken64Serialized {

  private short gdOrdToken64L;

  private char[] gdOrdToken64T = Field.fillLowValue(515);

  /** Constructor for GdOrdToken64 */
  public GdOrdToken64() {
    // TO-DO auto generated code
  }

  /**
   * Constructor for GdOrdToken64. sets the parent value to the parent
   *
   * @param parent
   * @param begin
   */
  public GdOrdToken64(Field parent, int begin) {
    setParent(parent, begin);
  }

  /**
   * Returns the value of gdOrdToken64L
   *
   * @return gdOrdToken64L
   */
  public short getGdOrdToken64L() throws CFException {
    if (isGdOrdToken64LModified()) {
      gdOrdToken64L = refreshGdOrdToken64L();
    }
    return gdOrdToken64L;
  }

  /**
   * Update GdOrdToken64L with the passed value Corresponding COBOL Variable is GD-ORD-TOKEN-64-L
   *
   * @param number
   */
  public void setGdOrdToken64L(short number) {
    // Truncate if the number is beyond +/- Max range
    gdOrdToken64L = checkGdOrdToken64LMaxLimit(number);
    serializeGdOrdToken64L(gdOrdToken64L);
  }

  public void setGdOrdToken64L(int number) {
    number =
        checkGdOrdToken64LMaxLimit((short) number); // Truncate if value is beyond +/- Max range
    setGdOrdToken64L((short) number);
  }

  public void setGdOrdToken64L(long number) {
    number =
        checkGdOrdToken64LMaxLimit((short) number); // Truncate if value is beyond +/- Max range
    setGdOrdToken64L((short) number);
  }

  /**
   * Returns the value of gdOrdToken64T
   *
   * @return gdOrdToken64T
   */
  public char[] getGdOrdToken64T() throws CFException {
    if (isGdOrdToken64TModified()) {
      gdOrdToken64T = refreshGdOrdToken64T();
    }
    return gdOrdToken64T;
  }

  /**
   * set variable gdOrdToken64T Corresponding COBOL Variable is GD-ORD-TOKEN-64-T
   *
   * @param value
   */
  public void setGdOrdToken64T(char[] value) {
    gdOrdToken64T = checkGdOrdToken64TConstraints(value);
    serializeGdOrdToken64T(gdOrdToken64T);
  }

  /**
   * Update GdOrdToken64T with a char[] from an offset and length
   *
   * @param value
   */
  public void setGdOrdToken64T(char[] source, int sourceIndex) {
    replace(source, sourceIndex, source.length, beginGdOrdToken64T, gdOrdToken64T.length);
  }

  public void setGdOrdToken64T(char[] source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginGdOrdToken64T, gdOrdToken64T.length);
  }

  /**
   * Update GdOrdToken64T with a char[] from an offset and length to an offset and length
   *
   * @param value
   */
  public void setGdOrdToken64T(
      char[] source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginGdOrdToken64T + targetIndex, targetLen);
  }

  /**
   * Update GdOrdToken64T with another Field
   *
   * @param value
   */
  public void setGdOrdToken64T(Field source) {
    replace(source, 0, source.length(), beginGdOrdToken64T, GD_ORD_TOKEN_64_T_LEN);
  }

  /**
   * Update GdOrdToken64T with another Field from an offset and length
   *
   * @param value
   */
  public void setGdOrdToken64T(Field source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginGdOrdToken64T, GD_ORD_TOKEN_64_T_LEN);
  }

  /**
   * Update GdOrdToken64T with another Field from an offset and length to an offset and length
   *
   * @param value
   */
  public void setGdOrdToken64T(
      Field source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginGdOrdToken64T + targetIndex, targetLen);
  }

  public static int getGdOrdToken64FieldLength() {
    return GD_ORD_TOKEN_64_LENGTH;
  }
}
