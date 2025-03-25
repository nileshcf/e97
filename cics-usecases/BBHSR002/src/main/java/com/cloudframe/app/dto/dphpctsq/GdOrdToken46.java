package com.cloudframe.app.dto.dphpctsq;

/**
 * The class GdOrdToken46 is used to handle fields declared in it
 *
 * @author CloudFrame Inc. created on 2025-03-25 at 08:30. using version 5.0.0.231
 */
import com.cloudframe.app.data.Field;
import com.cloudframe.app.dto.serialize.dphpctsq.*;
import com.cloudframe.app.exception.CFException;

public class GdOrdToken46 extends GdOrdToken46Serialized {

  private short gdOrdToken46L;

  private char[] gdOrdToken46T = Field.fillLowValue(515);

  /** Constructor for GdOrdToken46 */
  public GdOrdToken46() {
    // TO-DO auto generated code
  }

  /**
   * Constructor for GdOrdToken46. sets the parent value to the parent
   *
   * @param parent
   * @param begin
   */
  public GdOrdToken46(Field parent, int begin) {
    setParent(parent, begin);
  }

  /**
   * Returns the value of gdOrdToken46L
   *
   * @return gdOrdToken46L
   */
  public short getGdOrdToken46L() throws CFException {
    if (isGdOrdToken46LModified()) {
      gdOrdToken46L = refreshGdOrdToken46L();
    }
    return gdOrdToken46L;
  }

  /**
   * Update GdOrdToken46L with the passed value Corresponding COBOL Variable is GD-ORD-TOKEN-46-L
   *
   * @param number
   */
  public void setGdOrdToken46L(short number) {
    // Truncate if the number is beyond +/- Max range
    gdOrdToken46L = checkGdOrdToken46LMaxLimit(number);
    serializeGdOrdToken46L(gdOrdToken46L);
  }

  public void setGdOrdToken46L(int number) {
    number =
        checkGdOrdToken46LMaxLimit((short) number); // Truncate if value is beyond +/- Max range
    setGdOrdToken46L((short) number);
  }

  public void setGdOrdToken46L(long number) {
    number =
        checkGdOrdToken46LMaxLimit((short) number); // Truncate if value is beyond +/- Max range
    setGdOrdToken46L((short) number);
  }

  /**
   * Returns the value of gdOrdToken46T
   *
   * @return gdOrdToken46T
   */
  public char[] getGdOrdToken46T() throws CFException {
    if (isGdOrdToken46TModified()) {
      gdOrdToken46T = refreshGdOrdToken46T();
    }
    return gdOrdToken46T;
  }

  /**
   * set variable gdOrdToken46T Corresponding COBOL Variable is GD-ORD-TOKEN-46-T
   *
   * @param value
   */
  public void setGdOrdToken46T(char[] value) {
    gdOrdToken46T = checkGdOrdToken46TConstraints(value);
    serializeGdOrdToken46T(gdOrdToken46T);
  }

  /**
   * Update GdOrdToken46T with a char[] from an offset and length
   *
   * @param value
   */
  public void setGdOrdToken46T(char[] source, int sourceIndex) {
    replace(source, sourceIndex, source.length, beginGdOrdToken46T, gdOrdToken46T.length);
  }

  public void setGdOrdToken46T(char[] source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginGdOrdToken46T, gdOrdToken46T.length);
  }

  /**
   * Update GdOrdToken46T with a char[] from an offset and length to an offset and length
   *
   * @param value
   */
  public void setGdOrdToken46T(
      char[] source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginGdOrdToken46T + targetIndex, targetLen);
  }

  /**
   * Update GdOrdToken46T with another Field
   *
   * @param value
   */
  public void setGdOrdToken46T(Field source) {
    replace(source, 0, source.length(), beginGdOrdToken46T, GD_ORD_TOKEN_46_T_LEN);
  }

  /**
   * Update GdOrdToken46T with another Field from an offset and length
   *
   * @param value
   */
  public void setGdOrdToken46T(Field source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginGdOrdToken46T, GD_ORD_TOKEN_46_T_LEN);
  }

  /**
   * Update GdOrdToken46T with another Field from an offset and length to an offset and length
   *
   * @param value
   */
  public void setGdOrdToken46T(
      Field source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginGdOrdToken46T + targetIndex, targetLen);
  }

  public static int getGdOrdToken46FieldLength() {
    return GD_ORD_TOKEN_46_LENGTH;
  }
}
