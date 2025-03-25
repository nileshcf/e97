package com.cloudframe.app.dto.dphpctsq;

/**
 * The class GdOrdToken61 is used to handle fields declared in it
 *
 * @author CloudFrame Inc. created on 2025-03-25 at 08:30. using version 5.0.0.231
 */
import com.cloudframe.app.data.Field;
import com.cloudframe.app.dto.serialize.dphpctsq.*;
import com.cloudframe.app.exception.CFException;

public class GdOrdToken61 extends GdOrdToken61Serialized {

  private short gdOrdToken61L;

  private char[] gdOrdToken61T = Field.fillLowValue(515);

  /** Constructor for GdOrdToken61 */
  public GdOrdToken61() {
    // TO-DO auto generated code
  }

  /**
   * Constructor for GdOrdToken61. sets the parent value to the parent
   *
   * @param parent
   * @param begin
   */
  public GdOrdToken61(Field parent, int begin) {
    setParent(parent, begin);
  }

  /**
   * Returns the value of gdOrdToken61L
   *
   * @return gdOrdToken61L
   */
  public short getGdOrdToken61L() throws CFException {
    if (isGdOrdToken61LModified()) {
      gdOrdToken61L = refreshGdOrdToken61L();
    }
    return gdOrdToken61L;
  }

  /**
   * Update GdOrdToken61L with the passed value Corresponding COBOL Variable is GD-ORD-TOKEN-61-L
   *
   * @param number
   */
  public void setGdOrdToken61L(short number) {
    // Truncate if the number is beyond +/- Max range
    gdOrdToken61L = checkGdOrdToken61LMaxLimit(number);
    serializeGdOrdToken61L(gdOrdToken61L);
  }

  public void setGdOrdToken61L(int number) {
    number =
        checkGdOrdToken61LMaxLimit((short) number); // Truncate if value is beyond +/- Max range
    setGdOrdToken61L((short) number);
  }

  public void setGdOrdToken61L(long number) {
    number =
        checkGdOrdToken61LMaxLimit((short) number); // Truncate if value is beyond +/- Max range
    setGdOrdToken61L((short) number);
  }

  /**
   * Returns the value of gdOrdToken61T
   *
   * @return gdOrdToken61T
   */
  public char[] getGdOrdToken61T() throws CFException {
    if (isGdOrdToken61TModified()) {
      gdOrdToken61T = refreshGdOrdToken61T();
    }
    return gdOrdToken61T;
  }

  /**
   * set variable gdOrdToken61T Corresponding COBOL Variable is GD-ORD-TOKEN-61-T
   *
   * @param value
   */
  public void setGdOrdToken61T(char[] value) {
    gdOrdToken61T = checkGdOrdToken61TConstraints(value);
    serializeGdOrdToken61T(gdOrdToken61T);
  }

  /**
   * Update GdOrdToken61T with a char[] from an offset and length
   *
   * @param value
   */
  public void setGdOrdToken61T(char[] source, int sourceIndex) {
    replace(source, sourceIndex, source.length, beginGdOrdToken61T, gdOrdToken61T.length);
  }

  public void setGdOrdToken61T(char[] source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginGdOrdToken61T, gdOrdToken61T.length);
  }

  /**
   * Update GdOrdToken61T with a char[] from an offset and length to an offset and length
   *
   * @param value
   */
  public void setGdOrdToken61T(
      char[] source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginGdOrdToken61T + targetIndex, targetLen);
  }

  /**
   * Update GdOrdToken61T with another Field
   *
   * @param value
   */
  public void setGdOrdToken61T(Field source) {
    replace(source, 0, source.length(), beginGdOrdToken61T, GD_ORD_TOKEN_61_T_LEN);
  }

  /**
   * Update GdOrdToken61T with another Field from an offset and length
   *
   * @param value
   */
  public void setGdOrdToken61T(Field source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginGdOrdToken61T, GD_ORD_TOKEN_61_T_LEN);
  }

  /**
   * Update GdOrdToken61T with another Field from an offset and length to an offset and length
   *
   * @param value
   */
  public void setGdOrdToken61T(
      Field source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginGdOrdToken61T + targetIndex, targetLen);
  }

  public static int getGdOrdToken61FieldLength() {
    return GD_ORD_TOKEN_61_LENGTH;
  }
}
