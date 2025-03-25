package com.cloudframe.app.dto.dphpctsq;

/**
 * The class GdOrdToken5 is used to handle fields declared in it
 *
 * @author CloudFrame Inc. created on 2025-03-25 at 08:30. using version 5.0.0.231
 */
import com.cloudframe.app.data.Field;
import com.cloudframe.app.dto.serialize.dphpctsq.*;
import com.cloudframe.app.exception.CFException;

public class GdOrdToken5 extends GdOrdToken5Serialized {

  private short gdOrdToken5L;

  private char[] gdOrdToken5T = Field.fillLowValue(515);

  /** Constructor for GdOrdToken5 */
  public GdOrdToken5() {
    // TO-DO auto generated code
  }

  /**
   * Constructor for GdOrdToken5. sets the parent value to the parent
   *
   * @param parent
   * @param begin
   */
  public GdOrdToken5(Field parent, int begin) {
    setParent(parent, begin);
  }

  /**
   * Returns the value of gdOrdToken5L
   *
   * @return gdOrdToken5L
   */
  public short getGdOrdToken5L() throws CFException {
    if (isGdOrdToken5LModified()) {
      gdOrdToken5L = refreshGdOrdToken5L();
    }
    return gdOrdToken5L;
  }

  /**
   * Update GdOrdToken5L with the passed value Corresponding COBOL Variable is GD-ORD-TOKEN-5-L
   *
   * @param number
   */
  public void setGdOrdToken5L(short number) {
    // Truncate if the number is beyond +/- Max range
    gdOrdToken5L = checkGdOrdToken5LMaxLimit(number);
    serializeGdOrdToken5L(gdOrdToken5L);
  }

  public void setGdOrdToken5L(int number) {
    number = checkGdOrdToken5LMaxLimit((short) number); // Truncate if value is beyond +/- Max range
    setGdOrdToken5L((short) number);
  }

  public void setGdOrdToken5L(long number) {
    number = checkGdOrdToken5LMaxLimit((short) number); // Truncate if value is beyond +/- Max range
    setGdOrdToken5L((short) number);
  }

  /**
   * Returns the value of gdOrdToken5T
   *
   * @return gdOrdToken5T
   */
  public char[] getGdOrdToken5T() throws CFException {
    if (isGdOrdToken5TModified()) {
      gdOrdToken5T = refreshGdOrdToken5T();
    }
    return gdOrdToken5T;
  }

  /**
   * set variable gdOrdToken5T Corresponding COBOL Variable is GD-ORD-TOKEN-5-T
   *
   * @param value
   */
  public void setGdOrdToken5T(char[] value) {
    gdOrdToken5T = checkGdOrdToken5TConstraints(value);
    serializeGdOrdToken5T(gdOrdToken5T);
  }

  /**
   * Update GdOrdToken5T with a char[] from an offset and length
   *
   * @param value
   */
  public void setGdOrdToken5T(char[] source, int sourceIndex) {
    replace(source, sourceIndex, source.length, beginGdOrdToken5T, gdOrdToken5T.length);
  }

  public void setGdOrdToken5T(char[] source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginGdOrdToken5T, gdOrdToken5T.length);
  }

  /**
   * Update GdOrdToken5T with a char[] from an offset and length to an offset and length
   *
   * @param value
   */
  public void setGdOrdToken5T(
      char[] source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginGdOrdToken5T + targetIndex, targetLen);
  }

  /**
   * Update GdOrdToken5T with another Field
   *
   * @param value
   */
  public void setGdOrdToken5T(Field source) {
    replace(source, 0, source.length(), beginGdOrdToken5T, GD_ORD_TOKEN_5_T_LEN);
  }

  /**
   * Update GdOrdToken5T with another Field from an offset and length
   *
   * @param value
   */
  public void setGdOrdToken5T(Field source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginGdOrdToken5T, GD_ORD_TOKEN_5_T_LEN);
  }

  /**
   * Update GdOrdToken5T with another Field from an offset and length to an offset and length
   *
   * @param value
   */
  public void setGdOrdToken5T(
      Field source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginGdOrdToken5T + targetIndex, targetLen);
  }

  public static int getGdOrdToken5FieldLength() {
    return GD_ORD_TOKEN_5_LENGTH;
  }
}
