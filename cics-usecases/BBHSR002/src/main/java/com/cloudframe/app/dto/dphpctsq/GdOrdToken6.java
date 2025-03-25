package com.cloudframe.app.dto.dphpctsq;

/**
 * The class GdOrdToken6 is used to handle fields declared in it
 *
 * @author CloudFrame Inc. created on 2025-03-25 at 08:30. using version 5.0.0.231
 */
import com.cloudframe.app.data.Field;
import com.cloudframe.app.dto.serialize.dphpctsq.*;
import com.cloudframe.app.exception.CFException;

public class GdOrdToken6 extends GdOrdToken6Serialized {

  private short gdOrdToken6L;

  private char[] gdOrdToken6T = Field.fillLowValue(515);

  /** Constructor for GdOrdToken6 */
  public GdOrdToken6() {
    // TO-DO auto generated code
  }

  /**
   * Constructor for GdOrdToken6. sets the parent value to the parent
   *
   * @param parent
   * @param begin
   */
  public GdOrdToken6(Field parent, int begin) {
    setParent(parent, begin);
  }

  /**
   * Returns the value of gdOrdToken6L
   *
   * @return gdOrdToken6L
   */
  public short getGdOrdToken6L() throws CFException {
    if (isGdOrdToken6LModified()) {
      gdOrdToken6L = refreshGdOrdToken6L();
    }
    return gdOrdToken6L;
  }

  /**
   * Update GdOrdToken6L with the passed value Corresponding COBOL Variable is GD-ORD-TOKEN-6-L
   *
   * @param number
   */
  public void setGdOrdToken6L(short number) {
    // Truncate if the number is beyond +/- Max range
    gdOrdToken6L = checkGdOrdToken6LMaxLimit(number);
    serializeGdOrdToken6L(gdOrdToken6L);
  }

  public void setGdOrdToken6L(int number) {
    number = checkGdOrdToken6LMaxLimit((short) number); // Truncate if value is beyond +/- Max range
    setGdOrdToken6L((short) number);
  }

  public void setGdOrdToken6L(long number) {
    number = checkGdOrdToken6LMaxLimit((short) number); // Truncate if value is beyond +/- Max range
    setGdOrdToken6L((short) number);
  }

  /**
   * Returns the value of gdOrdToken6T
   *
   * @return gdOrdToken6T
   */
  public char[] getGdOrdToken6T() throws CFException {
    if (isGdOrdToken6TModified()) {
      gdOrdToken6T = refreshGdOrdToken6T();
    }
    return gdOrdToken6T;
  }

  /**
   * set variable gdOrdToken6T Corresponding COBOL Variable is GD-ORD-TOKEN-6-T
   *
   * @param value
   */
  public void setGdOrdToken6T(char[] value) {
    gdOrdToken6T = checkGdOrdToken6TConstraints(value);
    serializeGdOrdToken6T(gdOrdToken6T);
  }

  /**
   * Update GdOrdToken6T with a char[] from an offset and length
   *
   * @param value
   */
  public void setGdOrdToken6T(char[] source, int sourceIndex) {
    replace(source, sourceIndex, source.length, beginGdOrdToken6T, gdOrdToken6T.length);
  }

  public void setGdOrdToken6T(char[] source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginGdOrdToken6T, gdOrdToken6T.length);
  }

  /**
   * Update GdOrdToken6T with a char[] from an offset and length to an offset and length
   *
   * @param value
   */
  public void setGdOrdToken6T(
      char[] source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginGdOrdToken6T + targetIndex, targetLen);
  }

  /**
   * Update GdOrdToken6T with another Field
   *
   * @param value
   */
  public void setGdOrdToken6T(Field source) {
    replace(source, 0, source.length(), beginGdOrdToken6T, GD_ORD_TOKEN_6_T_LEN);
  }

  /**
   * Update GdOrdToken6T with another Field from an offset and length
   *
   * @param value
   */
  public void setGdOrdToken6T(Field source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginGdOrdToken6T, GD_ORD_TOKEN_6_T_LEN);
  }

  /**
   * Update GdOrdToken6T with another Field from an offset and length to an offset and length
   *
   * @param value
   */
  public void setGdOrdToken6T(
      Field source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginGdOrdToken6T + targetIndex, targetLen);
  }

  public static int getGdOrdToken6FieldLength() {
    return GD_ORD_TOKEN_6_LENGTH;
  }
}
