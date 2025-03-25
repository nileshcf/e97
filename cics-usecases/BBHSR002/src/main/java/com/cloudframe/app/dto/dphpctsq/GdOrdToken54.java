package com.cloudframe.app.dto.dphpctsq;

/**
 * The class GdOrdToken54 is used to handle fields declared in it
 *
 * @author CloudFrame Inc. created on 2025-03-25 at 08:30. using version 5.0.0.231
 */
import com.cloudframe.app.data.Field;
import com.cloudframe.app.dto.serialize.dphpctsq.*;
import com.cloudframe.app.exception.CFException;

public class GdOrdToken54 extends GdOrdToken54Serialized {

  private short gdOrdToken54L;

  private char[] gdOrdToken54T = Field.fillLowValue(515);

  /** Constructor for GdOrdToken54 */
  public GdOrdToken54() {
    // TO-DO auto generated code
  }

  /**
   * Constructor for GdOrdToken54. sets the parent value to the parent
   *
   * @param parent
   * @param begin
   */
  public GdOrdToken54(Field parent, int begin) {
    setParent(parent, begin);
  }

  /**
   * Returns the value of gdOrdToken54L
   *
   * @return gdOrdToken54L
   */
  public short getGdOrdToken54L() throws CFException {
    if (isGdOrdToken54LModified()) {
      gdOrdToken54L = refreshGdOrdToken54L();
    }
    return gdOrdToken54L;
  }

  /**
   * Update GdOrdToken54L with the passed value Corresponding COBOL Variable is GD-ORD-TOKEN-54-L
   *
   * @param number
   */
  public void setGdOrdToken54L(short number) {
    // Truncate if the number is beyond +/- Max range
    gdOrdToken54L = checkGdOrdToken54LMaxLimit(number);
    serializeGdOrdToken54L(gdOrdToken54L);
  }

  public void setGdOrdToken54L(int number) {
    number =
        checkGdOrdToken54LMaxLimit((short) number); // Truncate if value is beyond +/- Max range
    setGdOrdToken54L((short) number);
  }

  public void setGdOrdToken54L(long number) {
    number =
        checkGdOrdToken54LMaxLimit((short) number); // Truncate if value is beyond +/- Max range
    setGdOrdToken54L((short) number);
  }

  /**
   * Returns the value of gdOrdToken54T
   *
   * @return gdOrdToken54T
   */
  public char[] getGdOrdToken54T() throws CFException {
    if (isGdOrdToken54TModified()) {
      gdOrdToken54T = refreshGdOrdToken54T();
    }
    return gdOrdToken54T;
  }

  /**
   * set variable gdOrdToken54T Corresponding COBOL Variable is GD-ORD-TOKEN-54-T
   *
   * @param value
   */
  public void setGdOrdToken54T(char[] value) {
    gdOrdToken54T = checkGdOrdToken54TConstraints(value);
    serializeGdOrdToken54T(gdOrdToken54T);
  }

  /**
   * Update GdOrdToken54T with a char[] from an offset and length
   *
   * @param value
   */
  public void setGdOrdToken54T(char[] source, int sourceIndex) {
    replace(source, sourceIndex, source.length, beginGdOrdToken54T, gdOrdToken54T.length);
  }

  public void setGdOrdToken54T(char[] source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginGdOrdToken54T, gdOrdToken54T.length);
  }

  /**
   * Update GdOrdToken54T with a char[] from an offset and length to an offset and length
   *
   * @param value
   */
  public void setGdOrdToken54T(
      char[] source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginGdOrdToken54T + targetIndex, targetLen);
  }

  /**
   * Update GdOrdToken54T with another Field
   *
   * @param value
   */
  public void setGdOrdToken54T(Field source) {
    replace(source, 0, source.length(), beginGdOrdToken54T, GD_ORD_TOKEN_54_T_LEN);
  }

  /**
   * Update GdOrdToken54T with another Field from an offset and length
   *
   * @param value
   */
  public void setGdOrdToken54T(Field source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginGdOrdToken54T, GD_ORD_TOKEN_54_T_LEN);
  }

  /**
   * Update GdOrdToken54T with another Field from an offset and length to an offset and length
   *
   * @param value
   */
  public void setGdOrdToken54T(
      Field source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginGdOrdToken54T + targetIndex, targetLen);
  }

  public static int getGdOrdToken54FieldLength() {
    return GD_ORD_TOKEN_54_LENGTH;
  }
}
