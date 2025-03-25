package com.cloudframe.app.dto.dphpctsq;

/**
 * The class GdOrdToken67 is used to handle fields declared in it
 *
 * @author CloudFrame Inc. created on 2025-03-25 at 08:30. using version 5.0.0.231
 */
import com.cloudframe.app.data.Field;
import com.cloudframe.app.dto.serialize.dphpctsq.*;
import com.cloudframe.app.exception.CFException;

public class GdOrdToken67 extends GdOrdToken67Serialized {

  private short gdOrdToken67L;

  private char[] gdOrdToken67T = Field.fillLowValue(515);

  /** Constructor for GdOrdToken67 */
  public GdOrdToken67() {
    // TO-DO auto generated code
  }

  /**
   * Constructor for GdOrdToken67. sets the parent value to the parent
   *
   * @param parent
   * @param begin
   */
  public GdOrdToken67(Field parent, int begin) {
    setParent(parent, begin);
  }

  /**
   * Returns the value of gdOrdToken67L
   *
   * @return gdOrdToken67L
   */
  public short getGdOrdToken67L() throws CFException {
    if (isGdOrdToken67LModified()) {
      gdOrdToken67L = refreshGdOrdToken67L();
    }
    return gdOrdToken67L;
  }

  /**
   * Update GdOrdToken67L with the passed value Corresponding COBOL Variable is GD-ORD-TOKEN-67-L
   *
   * @param number
   */
  public void setGdOrdToken67L(short number) {
    // Truncate if the number is beyond +/- Max range
    gdOrdToken67L = checkGdOrdToken67LMaxLimit(number);
    serializeGdOrdToken67L(gdOrdToken67L);
  }

  public void setGdOrdToken67L(int number) {
    number =
        checkGdOrdToken67LMaxLimit((short) number); // Truncate if value is beyond +/- Max range
    setGdOrdToken67L((short) number);
  }

  public void setGdOrdToken67L(long number) {
    number =
        checkGdOrdToken67LMaxLimit((short) number); // Truncate if value is beyond +/- Max range
    setGdOrdToken67L((short) number);
  }

  /**
   * Returns the value of gdOrdToken67T
   *
   * @return gdOrdToken67T
   */
  public char[] getGdOrdToken67T() throws CFException {
    if (isGdOrdToken67TModified()) {
      gdOrdToken67T = refreshGdOrdToken67T();
    }
    return gdOrdToken67T;
  }

  /**
   * set variable gdOrdToken67T Corresponding COBOL Variable is GD-ORD-TOKEN-67-T
   *
   * @param value
   */
  public void setGdOrdToken67T(char[] value) {
    gdOrdToken67T = checkGdOrdToken67TConstraints(value);
    serializeGdOrdToken67T(gdOrdToken67T);
  }

  /**
   * Update GdOrdToken67T with a char[] from an offset and length
   *
   * @param value
   */
  public void setGdOrdToken67T(char[] source, int sourceIndex) {
    replace(source, sourceIndex, source.length, beginGdOrdToken67T, gdOrdToken67T.length);
  }

  public void setGdOrdToken67T(char[] source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginGdOrdToken67T, gdOrdToken67T.length);
  }

  /**
   * Update GdOrdToken67T with a char[] from an offset and length to an offset and length
   *
   * @param value
   */
  public void setGdOrdToken67T(
      char[] source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginGdOrdToken67T + targetIndex, targetLen);
  }

  /**
   * Update GdOrdToken67T with another Field
   *
   * @param value
   */
  public void setGdOrdToken67T(Field source) {
    replace(source, 0, source.length(), beginGdOrdToken67T, GD_ORD_TOKEN_67_T_LEN);
  }

  /**
   * Update GdOrdToken67T with another Field from an offset and length
   *
   * @param value
   */
  public void setGdOrdToken67T(Field source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginGdOrdToken67T, GD_ORD_TOKEN_67_T_LEN);
  }

  /**
   * Update GdOrdToken67T with another Field from an offset and length to an offset and length
   *
   * @param value
   */
  public void setGdOrdToken67T(
      Field source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginGdOrdToken67T + targetIndex, targetLen);
  }

  public static int getGdOrdToken67FieldLength() {
    return GD_ORD_TOKEN_67_LENGTH;
  }
}
