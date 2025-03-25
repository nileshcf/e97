package com.cloudframe.app.dto.dphpctsq;

/**
 * The class GdOrdToken3 is used to handle fields declared in it
 *
 * @author CloudFrame Inc. created on 2025-03-25 at 08:30. using version 5.0.0.231
 */
import com.cloudframe.app.data.Field;
import com.cloudframe.app.dto.serialize.dphpctsq.*;
import com.cloudframe.app.exception.CFException;

public class GdOrdToken3 extends GdOrdToken3Serialized {

  private short gdOrdToken3L;

  private char[] gdOrdToken3T = Field.fillLowValue(515);

  /** Constructor for GdOrdToken3 */
  public GdOrdToken3() {
    // TO-DO auto generated code
  }

  /**
   * Constructor for GdOrdToken3. sets the parent value to the parent
   *
   * @param parent
   * @param begin
   */
  public GdOrdToken3(Field parent, int begin) {
    setParent(parent, begin);
  }

  /**
   * Returns the value of gdOrdToken3L
   *
   * @return gdOrdToken3L
   */
  public short getGdOrdToken3L() throws CFException {
    if (isGdOrdToken3LModified()) {
      gdOrdToken3L = refreshGdOrdToken3L();
    }
    return gdOrdToken3L;
  }

  /**
   * Update GdOrdToken3L with the passed value Corresponding COBOL Variable is GD-ORD-TOKEN-3-L
   *
   * @param number
   */
  public void setGdOrdToken3L(short number) {
    // Truncate if the number is beyond +/- Max range
    gdOrdToken3L = checkGdOrdToken3LMaxLimit(number);
    serializeGdOrdToken3L(gdOrdToken3L);
  }

  public void setGdOrdToken3L(int number) {
    number = checkGdOrdToken3LMaxLimit((short) number); // Truncate if value is beyond +/- Max range
    setGdOrdToken3L((short) number);
  }

  public void setGdOrdToken3L(long number) {
    number = checkGdOrdToken3LMaxLimit((short) number); // Truncate if value is beyond +/- Max range
    setGdOrdToken3L((short) number);
  }

  /**
   * Returns the value of gdOrdToken3T
   *
   * @return gdOrdToken3T
   */
  public char[] getGdOrdToken3T() throws CFException {
    if (isGdOrdToken3TModified()) {
      gdOrdToken3T = refreshGdOrdToken3T();
    }
    return gdOrdToken3T;
  }

  /**
   * set variable gdOrdToken3T Corresponding COBOL Variable is GD-ORD-TOKEN-3-T
   *
   * @param value
   */
  public void setGdOrdToken3T(char[] value) {
    gdOrdToken3T = checkGdOrdToken3TConstraints(value);
    serializeGdOrdToken3T(gdOrdToken3T);
  }

  /**
   * Update GdOrdToken3T with a char[] from an offset and length
   *
   * @param value
   */
  public void setGdOrdToken3T(char[] source, int sourceIndex) {
    replace(source, sourceIndex, source.length, beginGdOrdToken3T, gdOrdToken3T.length);
  }

  public void setGdOrdToken3T(char[] source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginGdOrdToken3T, gdOrdToken3T.length);
  }

  /**
   * Update GdOrdToken3T with a char[] from an offset and length to an offset and length
   *
   * @param value
   */
  public void setGdOrdToken3T(
      char[] source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginGdOrdToken3T + targetIndex, targetLen);
  }

  /**
   * Update GdOrdToken3T with another Field
   *
   * @param value
   */
  public void setGdOrdToken3T(Field source) {
    replace(source, 0, source.length(), beginGdOrdToken3T, GD_ORD_TOKEN_3_T_LEN);
  }

  /**
   * Update GdOrdToken3T with another Field from an offset and length
   *
   * @param value
   */
  public void setGdOrdToken3T(Field source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginGdOrdToken3T, GD_ORD_TOKEN_3_T_LEN);
  }

  /**
   * Update GdOrdToken3T with another Field from an offset and length to an offset and length
   *
   * @param value
   */
  public void setGdOrdToken3T(
      Field source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginGdOrdToken3T + targetIndex, targetLen);
  }

  public static int getGdOrdToken3FieldLength() {
    return GD_ORD_TOKEN_3_LENGTH;
  }
}
