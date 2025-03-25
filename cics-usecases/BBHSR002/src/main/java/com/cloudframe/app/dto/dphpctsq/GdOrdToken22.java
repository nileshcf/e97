package com.cloudframe.app.dto.dphpctsq;

/**
 * The class GdOrdToken22 is used to handle fields declared in it
 *
 * @author CloudFrame Inc. created on 2025-03-25 at 08:30. using version 5.0.0.231
 */
import com.cloudframe.app.data.Field;
import com.cloudframe.app.dto.serialize.dphpctsq.*;
import com.cloudframe.app.exception.CFException;

public class GdOrdToken22 extends GdOrdToken22Serialized {

  private short gdOrdToken22L;

  private char[] gdOrdToken22T = Field.fillLowValue(515);

  /** Constructor for GdOrdToken22 */
  public GdOrdToken22() {
    // TO-DO auto generated code
  }

  /**
   * Constructor for GdOrdToken22. sets the parent value to the parent
   *
   * @param parent
   * @param begin
   */
  public GdOrdToken22(Field parent, int begin) {
    setParent(parent, begin);
  }

  /**
   * Returns the value of gdOrdToken22L
   *
   * @return gdOrdToken22L
   */
  public short getGdOrdToken22L() throws CFException {
    if (isGdOrdToken22LModified()) {
      gdOrdToken22L = refreshGdOrdToken22L();
    }
    return gdOrdToken22L;
  }

  /**
   * Update GdOrdToken22L with the passed value Corresponding COBOL Variable is GD-ORD-TOKEN-22-L
   *
   * @param number
   */
  public void setGdOrdToken22L(short number) {
    // Truncate if the number is beyond +/- Max range
    gdOrdToken22L = checkGdOrdToken22LMaxLimit(number);
    serializeGdOrdToken22L(gdOrdToken22L);
  }

  public void setGdOrdToken22L(int number) {
    number =
        checkGdOrdToken22LMaxLimit((short) number); // Truncate if value is beyond +/- Max range
    setGdOrdToken22L((short) number);
  }

  public void setGdOrdToken22L(long number) {
    number =
        checkGdOrdToken22LMaxLimit((short) number); // Truncate if value is beyond +/- Max range
    setGdOrdToken22L((short) number);
  }

  /**
   * Returns the value of gdOrdToken22T
   *
   * @return gdOrdToken22T
   */
  public char[] getGdOrdToken22T() throws CFException {
    if (isGdOrdToken22TModified()) {
      gdOrdToken22T = refreshGdOrdToken22T();
    }
    return gdOrdToken22T;
  }

  /**
   * set variable gdOrdToken22T Corresponding COBOL Variable is GD-ORD-TOKEN-22-T
   *
   * @param value
   */
  public void setGdOrdToken22T(char[] value) {
    gdOrdToken22T = checkGdOrdToken22TConstraints(value);
    serializeGdOrdToken22T(gdOrdToken22T);
  }

  /**
   * Update GdOrdToken22T with a char[] from an offset and length
   *
   * @param value
   */
  public void setGdOrdToken22T(char[] source, int sourceIndex) {
    replace(source, sourceIndex, source.length, beginGdOrdToken22T, gdOrdToken22T.length);
  }

  public void setGdOrdToken22T(char[] source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginGdOrdToken22T, gdOrdToken22T.length);
  }

  /**
   * Update GdOrdToken22T with a char[] from an offset and length to an offset and length
   *
   * @param value
   */
  public void setGdOrdToken22T(
      char[] source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginGdOrdToken22T + targetIndex, targetLen);
  }

  /**
   * Update GdOrdToken22T with another Field
   *
   * @param value
   */
  public void setGdOrdToken22T(Field source) {
    replace(source, 0, source.length(), beginGdOrdToken22T, GD_ORD_TOKEN_22_T_LEN);
  }

  /**
   * Update GdOrdToken22T with another Field from an offset and length
   *
   * @param value
   */
  public void setGdOrdToken22T(Field source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginGdOrdToken22T, GD_ORD_TOKEN_22_T_LEN);
  }

  /**
   * Update GdOrdToken22T with another Field from an offset and length to an offset and length
   *
   * @param value
   */
  public void setGdOrdToken22T(
      Field source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginGdOrdToken22T + targetIndex, targetLen);
  }

  public static int getGdOrdToken22FieldLength() {
    return GD_ORD_TOKEN_22_LENGTH;
  }
}
