package com.cloudframe.app.dto.dphpctsq;

/**
 * The class GdOrdToken65 is used to handle fields declared in it
 *
 * @author CloudFrame Inc. created on 2025-03-25 at 08:30. using version 5.0.0.231
 */
import com.cloudframe.app.data.Field;
import com.cloudframe.app.dto.serialize.dphpctsq.*;
import com.cloudframe.app.exception.CFException;

public class GdOrdToken65 extends GdOrdToken65Serialized {

  private short gdOrdToken65L;

  private char[] gdOrdToken65T = Field.fillLowValue(515);

  /** Constructor for GdOrdToken65 */
  public GdOrdToken65() {
    // TO-DO auto generated code
  }

  /**
   * Constructor for GdOrdToken65. sets the parent value to the parent
   *
   * @param parent
   * @param begin
   */
  public GdOrdToken65(Field parent, int begin) {
    setParent(parent, begin);
  }

  /**
   * Returns the value of gdOrdToken65L
   *
   * @return gdOrdToken65L
   */
  public short getGdOrdToken65L() throws CFException {
    if (isGdOrdToken65LModified()) {
      gdOrdToken65L = refreshGdOrdToken65L();
    }
    return gdOrdToken65L;
  }

  /**
   * Update GdOrdToken65L with the passed value Corresponding COBOL Variable is GD-ORD-TOKEN-65-L
   *
   * @param number
   */
  public void setGdOrdToken65L(short number) {
    // Truncate if the number is beyond +/- Max range
    gdOrdToken65L = checkGdOrdToken65LMaxLimit(number);
    serializeGdOrdToken65L(gdOrdToken65L);
  }

  public void setGdOrdToken65L(int number) {
    number =
        checkGdOrdToken65LMaxLimit((short) number); // Truncate if value is beyond +/- Max range
    setGdOrdToken65L((short) number);
  }

  public void setGdOrdToken65L(long number) {
    number =
        checkGdOrdToken65LMaxLimit((short) number); // Truncate if value is beyond +/- Max range
    setGdOrdToken65L((short) number);
  }

  /**
   * Returns the value of gdOrdToken65T
   *
   * @return gdOrdToken65T
   */
  public char[] getGdOrdToken65T() throws CFException {
    if (isGdOrdToken65TModified()) {
      gdOrdToken65T = refreshGdOrdToken65T();
    }
    return gdOrdToken65T;
  }

  /**
   * set variable gdOrdToken65T Corresponding COBOL Variable is GD-ORD-TOKEN-65-T
   *
   * @param value
   */
  public void setGdOrdToken65T(char[] value) {
    gdOrdToken65T = checkGdOrdToken65TConstraints(value);
    serializeGdOrdToken65T(gdOrdToken65T);
  }

  /**
   * Update GdOrdToken65T with a char[] from an offset and length
   *
   * @param value
   */
  public void setGdOrdToken65T(char[] source, int sourceIndex) {
    replace(source, sourceIndex, source.length, beginGdOrdToken65T, gdOrdToken65T.length);
  }

  public void setGdOrdToken65T(char[] source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginGdOrdToken65T, gdOrdToken65T.length);
  }

  /**
   * Update GdOrdToken65T with a char[] from an offset and length to an offset and length
   *
   * @param value
   */
  public void setGdOrdToken65T(
      char[] source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginGdOrdToken65T + targetIndex, targetLen);
  }

  /**
   * Update GdOrdToken65T with another Field
   *
   * @param value
   */
  public void setGdOrdToken65T(Field source) {
    replace(source, 0, source.length(), beginGdOrdToken65T, GD_ORD_TOKEN_65_T_LEN);
  }

  /**
   * Update GdOrdToken65T with another Field from an offset and length
   *
   * @param value
   */
  public void setGdOrdToken65T(Field source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginGdOrdToken65T, GD_ORD_TOKEN_65_T_LEN);
  }

  /**
   * Update GdOrdToken65T with another Field from an offset and length to an offset and length
   *
   * @param value
   */
  public void setGdOrdToken65T(
      Field source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginGdOrdToken65T + targetIndex, targetLen);
  }

  public static int getGdOrdToken65FieldLength() {
    return GD_ORD_TOKEN_65_LENGTH;
  }
}
