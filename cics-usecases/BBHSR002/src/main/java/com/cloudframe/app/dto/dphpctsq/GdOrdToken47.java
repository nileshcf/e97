package com.cloudframe.app.dto.dphpctsq;

/**
 * The class GdOrdToken47 is used to handle fields declared in it
 *
 * @author CloudFrame Inc. created on 2025-03-25 at 08:30. using version 5.0.0.231
 */
import com.cloudframe.app.data.Field;
import com.cloudframe.app.dto.serialize.dphpctsq.*;
import com.cloudframe.app.exception.CFException;

public class GdOrdToken47 extends GdOrdToken47Serialized {

  private short gdOrdToken47L;

  private char[] gdOrdToken47T = Field.fillLowValue(515);

  /** Constructor for GdOrdToken47 */
  public GdOrdToken47() {
    // TO-DO auto generated code
  }

  /**
   * Constructor for GdOrdToken47. sets the parent value to the parent
   *
   * @param parent
   * @param begin
   */
  public GdOrdToken47(Field parent, int begin) {
    setParent(parent, begin);
  }

  /**
   * Returns the value of gdOrdToken47L
   *
   * @return gdOrdToken47L
   */
  public short getGdOrdToken47L() throws CFException {
    if (isGdOrdToken47LModified()) {
      gdOrdToken47L = refreshGdOrdToken47L();
    }
    return gdOrdToken47L;
  }

  /**
   * Update GdOrdToken47L with the passed value Corresponding COBOL Variable is GD-ORD-TOKEN-47-L
   *
   * @param number
   */
  public void setGdOrdToken47L(short number) {
    // Truncate if the number is beyond +/- Max range
    gdOrdToken47L = checkGdOrdToken47LMaxLimit(number);
    serializeGdOrdToken47L(gdOrdToken47L);
  }

  public void setGdOrdToken47L(int number) {
    number =
        checkGdOrdToken47LMaxLimit((short) number); // Truncate if value is beyond +/- Max range
    setGdOrdToken47L((short) number);
  }

  public void setGdOrdToken47L(long number) {
    number =
        checkGdOrdToken47LMaxLimit((short) number); // Truncate if value is beyond +/- Max range
    setGdOrdToken47L((short) number);
  }

  /**
   * Returns the value of gdOrdToken47T
   *
   * @return gdOrdToken47T
   */
  public char[] getGdOrdToken47T() throws CFException {
    if (isGdOrdToken47TModified()) {
      gdOrdToken47T = refreshGdOrdToken47T();
    }
    return gdOrdToken47T;
  }

  /**
   * set variable gdOrdToken47T Corresponding COBOL Variable is GD-ORD-TOKEN-47-T
   *
   * @param value
   */
  public void setGdOrdToken47T(char[] value) {
    gdOrdToken47T = checkGdOrdToken47TConstraints(value);
    serializeGdOrdToken47T(gdOrdToken47T);
  }

  /**
   * Update GdOrdToken47T with a char[] from an offset and length
   *
   * @param value
   */
  public void setGdOrdToken47T(char[] source, int sourceIndex) {
    replace(source, sourceIndex, source.length, beginGdOrdToken47T, gdOrdToken47T.length);
  }

  public void setGdOrdToken47T(char[] source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginGdOrdToken47T, gdOrdToken47T.length);
  }

  /**
   * Update GdOrdToken47T with a char[] from an offset and length to an offset and length
   *
   * @param value
   */
  public void setGdOrdToken47T(
      char[] source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginGdOrdToken47T + targetIndex, targetLen);
  }

  /**
   * Update GdOrdToken47T with another Field
   *
   * @param value
   */
  public void setGdOrdToken47T(Field source) {
    replace(source, 0, source.length(), beginGdOrdToken47T, GD_ORD_TOKEN_47_T_LEN);
  }

  /**
   * Update GdOrdToken47T with another Field from an offset and length
   *
   * @param value
   */
  public void setGdOrdToken47T(Field source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginGdOrdToken47T, GD_ORD_TOKEN_47_T_LEN);
  }

  /**
   * Update GdOrdToken47T with another Field from an offset and length to an offset and length
   *
   * @param value
   */
  public void setGdOrdToken47T(
      Field source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginGdOrdToken47T + targetIndex, targetLen);
  }

  public static int getGdOrdToken47FieldLength() {
    return GD_ORD_TOKEN_47_LENGTH;
  }
}
