package com.cloudframe.app.dto.dphpctsq;

/**
 * The class GdOrdToken16 is used to handle fields declared in it
 *
 * @author CloudFrame Inc. created on 2025-03-25 at 08:30. using version 5.0.0.231
 */
import com.cloudframe.app.data.Field;
import com.cloudframe.app.dto.serialize.dphpctsq.*;
import com.cloudframe.app.exception.CFException;

public class GdOrdToken16 extends GdOrdToken16Serialized {

  private short gdOrdToken16L;

  private char[] gdOrdToken16T = Field.fillLowValue(515);

  /** Constructor for GdOrdToken16 */
  public GdOrdToken16() {
    // TO-DO auto generated code
  }

  /**
   * Constructor for GdOrdToken16. sets the parent value to the parent
   *
   * @param parent
   * @param begin
   */
  public GdOrdToken16(Field parent, int begin) {
    setParent(parent, begin);
  }

  /**
   * Returns the value of gdOrdToken16L
   *
   * @return gdOrdToken16L
   */
  public short getGdOrdToken16L() throws CFException {
    if (isGdOrdToken16LModified()) {
      gdOrdToken16L = refreshGdOrdToken16L();
    }
    return gdOrdToken16L;
  }

  /**
   * Update GdOrdToken16L with the passed value Corresponding COBOL Variable is GD-ORD-TOKEN-16-L
   *
   * @param number
   */
  public void setGdOrdToken16L(short number) {
    // Truncate if the number is beyond +/- Max range
    gdOrdToken16L = checkGdOrdToken16LMaxLimit(number);
    serializeGdOrdToken16L(gdOrdToken16L);
  }

  public void setGdOrdToken16L(int number) {
    number =
        checkGdOrdToken16LMaxLimit((short) number); // Truncate if value is beyond +/- Max range
    setGdOrdToken16L((short) number);
  }

  public void setGdOrdToken16L(long number) {
    number =
        checkGdOrdToken16LMaxLimit((short) number); // Truncate if value is beyond +/- Max range
    setGdOrdToken16L((short) number);
  }

  /**
   * Returns the value of gdOrdToken16T
   *
   * @return gdOrdToken16T
   */
  public char[] getGdOrdToken16T() throws CFException {
    if (isGdOrdToken16TModified()) {
      gdOrdToken16T = refreshGdOrdToken16T();
    }
    return gdOrdToken16T;
  }

  /**
   * set variable gdOrdToken16T Corresponding COBOL Variable is GD-ORD-TOKEN-16-T
   *
   * @param value
   */
  public void setGdOrdToken16T(char[] value) {
    gdOrdToken16T = checkGdOrdToken16TConstraints(value);
    serializeGdOrdToken16T(gdOrdToken16T);
  }

  /**
   * Update GdOrdToken16T with a char[] from an offset and length
   *
   * @param value
   */
  public void setGdOrdToken16T(char[] source, int sourceIndex) {
    replace(source, sourceIndex, source.length, beginGdOrdToken16T, gdOrdToken16T.length);
  }

  public void setGdOrdToken16T(char[] source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginGdOrdToken16T, gdOrdToken16T.length);
  }

  /**
   * Update GdOrdToken16T with a char[] from an offset and length to an offset and length
   *
   * @param value
   */
  public void setGdOrdToken16T(
      char[] source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginGdOrdToken16T + targetIndex, targetLen);
  }

  /**
   * Update GdOrdToken16T with another Field
   *
   * @param value
   */
  public void setGdOrdToken16T(Field source) {
    replace(source, 0, source.length(), beginGdOrdToken16T, GD_ORD_TOKEN_16_T_LEN);
  }

  /**
   * Update GdOrdToken16T with another Field from an offset and length
   *
   * @param value
   */
  public void setGdOrdToken16T(Field source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginGdOrdToken16T, GD_ORD_TOKEN_16_T_LEN);
  }

  /**
   * Update GdOrdToken16T with another Field from an offset and length to an offset and length
   *
   * @param value
   */
  public void setGdOrdToken16T(
      Field source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginGdOrdToken16T + targetIndex, targetLen);
  }

  public static int getGdOrdToken16FieldLength() {
    return GD_ORD_TOKEN_16_LENGTH;
  }
}
