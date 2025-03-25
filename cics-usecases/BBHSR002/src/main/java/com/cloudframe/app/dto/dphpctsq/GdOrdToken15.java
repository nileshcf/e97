package com.cloudframe.app.dto.dphpctsq;

/**
 * The class GdOrdToken15 is used to handle fields declared in it
 *
 * @author CloudFrame Inc. created on 2025-03-25 at 08:30. using version 5.0.0.231
 */
import com.cloudframe.app.data.Field;
import com.cloudframe.app.dto.serialize.dphpctsq.*;
import com.cloudframe.app.exception.CFException;

public class GdOrdToken15 extends GdOrdToken15Serialized {

  private short gdOrdToken15L;

  private char[] gdOrdToken15T = Field.fillLowValue(515);

  /** Constructor for GdOrdToken15 */
  public GdOrdToken15() {
    // TO-DO auto generated code
  }

  /**
   * Constructor for GdOrdToken15. sets the parent value to the parent
   *
   * @param parent
   * @param begin
   */
  public GdOrdToken15(Field parent, int begin) {
    setParent(parent, begin);
  }

  /**
   * Returns the value of gdOrdToken15L
   *
   * @return gdOrdToken15L
   */
  public short getGdOrdToken15L() throws CFException {
    if (isGdOrdToken15LModified()) {
      gdOrdToken15L = refreshGdOrdToken15L();
    }
    return gdOrdToken15L;
  }

  /**
   * Update GdOrdToken15L with the passed value Corresponding COBOL Variable is GD-ORD-TOKEN-15-L
   *
   * @param number
   */
  public void setGdOrdToken15L(short number) {
    // Truncate if the number is beyond +/- Max range
    gdOrdToken15L = checkGdOrdToken15LMaxLimit(number);
    serializeGdOrdToken15L(gdOrdToken15L);
  }

  public void setGdOrdToken15L(int number) {
    number =
        checkGdOrdToken15LMaxLimit((short) number); // Truncate if value is beyond +/- Max range
    setGdOrdToken15L((short) number);
  }

  public void setGdOrdToken15L(long number) {
    number =
        checkGdOrdToken15LMaxLimit((short) number); // Truncate if value is beyond +/- Max range
    setGdOrdToken15L((short) number);
  }

  /**
   * Returns the value of gdOrdToken15T
   *
   * @return gdOrdToken15T
   */
  public char[] getGdOrdToken15T() throws CFException {
    if (isGdOrdToken15TModified()) {
      gdOrdToken15T = refreshGdOrdToken15T();
    }
    return gdOrdToken15T;
  }

  /**
   * set variable gdOrdToken15T Corresponding COBOL Variable is GD-ORD-TOKEN-15-T
   *
   * @param value
   */
  public void setGdOrdToken15T(char[] value) {
    gdOrdToken15T = checkGdOrdToken15TConstraints(value);
    serializeGdOrdToken15T(gdOrdToken15T);
  }

  /**
   * Update GdOrdToken15T with a char[] from an offset and length
   *
   * @param value
   */
  public void setGdOrdToken15T(char[] source, int sourceIndex) {
    replace(source, sourceIndex, source.length, beginGdOrdToken15T, gdOrdToken15T.length);
  }

  public void setGdOrdToken15T(char[] source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginGdOrdToken15T, gdOrdToken15T.length);
  }

  /**
   * Update GdOrdToken15T with a char[] from an offset and length to an offset and length
   *
   * @param value
   */
  public void setGdOrdToken15T(
      char[] source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginGdOrdToken15T + targetIndex, targetLen);
  }

  /**
   * Update GdOrdToken15T with another Field
   *
   * @param value
   */
  public void setGdOrdToken15T(Field source) {
    replace(source, 0, source.length(), beginGdOrdToken15T, GD_ORD_TOKEN_15_T_LEN);
  }

  /**
   * Update GdOrdToken15T with another Field from an offset and length
   *
   * @param value
   */
  public void setGdOrdToken15T(Field source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginGdOrdToken15T, GD_ORD_TOKEN_15_T_LEN);
  }

  /**
   * Update GdOrdToken15T with another Field from an offset and length to an offset and length
   *
   * @param value
   */
  public void setGdOrdToken15T(
      Field source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginGdOrdToken15T + targetIndex, targetLen);
  }

  public static int getGdOrdToken15FieldLength() {
    return GD_ORD_TOKEN_15_LENGTH;
  }
}
