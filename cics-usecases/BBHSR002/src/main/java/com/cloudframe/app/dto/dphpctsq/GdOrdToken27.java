package com.cloudframe.app.dto.dphpctsq;

/**
 * The class GdOrdToken27 is used to handle fields declared in it
 *
 * @author CloudFrame Inc. created on 2025-03-25 at 08:30. using version 5.0.0.231
 */
import com.cloudframe.app.data.Field;
import com.cloudframe.app.dto.serialize.dphpctsq.*;
import com.cloudframe.app.exception.CFException;

public class GdOrdToken27 extends GdOrdToken27Serialized {

  private short gdOrdToken27L;

  private char[] gdOrdToken27T = Field.fillLowValue(515);

  /** Constructor for GdOrdToken27 */
  public GdOrdToken27() {
    // TO-DO auto generated code
  }

  /**
   * Constructor for GdOrdToken27. sets the parent value to the parent
   *
   * @param parent
   * @param begin
   */
  public GdOrdToken27(Field parent, int begin) {
    setParent(parent, begin);
  }

  /**
   * Returns the value of gdOrdToken27L
   *
   * @return gdOrdToken27L
   */
  public short getGdOrdToken27L() throws CFException {
    if (isGdOrdToken27LModified()) {
      gdOrdToken27L = refreshGdOrdToken27L();
    }
    return gdOrdToken27L;
  }

  /**
   * Update GdOrdToken27L with the passed value Corresponding COBOL Variable is GD-ORD-TOKEN-27-L
   *
   * @param number
   */
  public void setGdOrdToken27L(short number) {
    // Truncate if the number is beyond +/- Max range
    gdOrdToken27L = checkGdOrdToken27LMaxLimit(number);
    serializeGdOrdToken27L(gdOrdToken27L);
  }

  public void setGdOrdToken27L(int number) {
    number =
        checkGdOrdToken27LMaxLimit((short) number); // Truncate if value is beyond +/- Max range
    setGdOrdToken27L((short) number);
  }

  public void setGdOrdToken27L(long number) {
    number =
        checkGdOrdToken27LMaxLimit((short) number); // Truncate if value is beyond +/- Max range
    setGdOrdToken27L((short) number);
  }

  /**
   * Returns the value of gdOrdToken27T
   *
   * @return gdOrdToken27T
   */
  public char[] getGdOrdToken27T() throws CFException {
    if (isGdOrdToken27TModified()) {
      gdOrdToken27T = refreshGdOrdToken27T();
    }
    return gdOrdToken27T;
  }

  /**
   * set variable gdOrdToken27T Corresponding COBOL Variable is GD-ORD-TOKEN-27-T
   *
   * @param value
   */
  public void setGdOrdToken27T(char[] value) {
    gdOrdToken27T = checkGdOrdToken27TConstraints(value);
    serializeGdOrdToken27T(gdOrdToken27T);
  }

  /**
   * Update GdOrdToken27T with a char[] from an offset and length
   *
   * @param value
   */
  public void setGdOrdToken27T(char[] source, int sourceIndex) {
    replace(source, sourceIndex, source.length, beginGdOrdToken27T, gdOrdToken27T.length);
  }

  public void setGdOrdToken27T(char[] source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginGdOrdToken27T, gdOrdToken27T.length);
  }

  /**
   * Update GdOrdToken27T with a char[] from an offset and length to an offset and length
   *
   * @param value
   */
  public void setGdOrdToken27T(
      char[] source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginGdOrdToken27T + targetIndex, targetLen);
  }

  /**
   * Update GdOrdToken27T with another Field
   *
   * @param value
   */
  public void setGdOrdToken27T(Field source) {
    replace(source, 0, source.length(), beginGdOrdToken27T, GD_ORD_TOKEN_27_T_LEN);
  }

  /**
   * Update GdOrdToken27T with another Field from an offset and length
   *
   * @param value
   */
  public void setGdOrdToken27T(Field source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginGdOrdToken27T, GD_ORD_TOKEN_27_T_LEN);
  }

  /**
   * Update GdOrdToken27T with another Field from an offset and length to an offset and length
   *
   * @param value
   */
  public void setGdOrdToken27T(
      Field source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginGdOrdToken27T + targetIndex, targetLen);
  }

  public static int getGdOrdToken27FieldLength() {
    return GD_ORD_TOKEN_27_LENGTH;
  }
}
