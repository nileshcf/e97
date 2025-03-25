package com.cloudframe.app.dto.dphpctsq;

/**
 * The class GdOrdToken50 is used to handle fields declared in it
 *
 * @author CloudFrame Inc. created on 2025-03-25 at 08:30. using version 5.0.0.231
 */
import com.cloudframe.app.data.Field;
import com.cloudframe.app.dto.serialize.dphpctsq.*;
import com.cloudframe.app.exception.CFException;

public class GdOrdToken50 extends GdOrdToken50Serialized {

  private short gdOrdToken50L;

  private char[] gdOrdToken50T = Field.fillLowValue(515);

  /** Constructor for GdOrdToken50 */
  public GdOrdToken50() {
    // TO-DO auto generated code
  }

  /**
   * Constructor for GdOrdToken50. sets the parent value to the parent
   *
   * @param parent
   * @param begin
   */
  public GdOrdToken50(Field parent, int begin) {
    setParent(parent, begin);
  }

  /**
   * Returns the value of gdOrdToken50L
   *
   * @return gdOrdToken50L
   */
  public short getGdOrdToken50L() throws CFException {
    if (isGdOrdToken50LModified()) {
      gdOrdToken50L = refreshGdOrdToken50L();
    }
    return gdOrdToken50L;
  }

  /**
   * Update GdOrdToken50L with the passed value Corresponding COBOL Variable is GD-ORD-TOKEN-50-L
   *
   * @param number
   */
  public void setGdOrdToken50L(short number) {
    // Truncate if the number is beyond +/- Max range
    gdOrdToken50L = checkGdOrdToken50LMaxLimit(number);
    serializeGdOrdToken50L(gdOrdToken50L);
  }

  public void setGdOrdToken50L(int number) {
    number =
        checkGdOrdToken50LMaxLimit((short) number); // Truncate if value is beyond +/- Max range
    setGdOrdToken50L((short) number);
  }

  public void setGdOrdToken50L(long number) {
    number =
        checkGdOrdToken50LMaxLimit((short) number); // Truncate if value is beyond +/- Max range
    setGdOrdToken50L((short) number);
  }

  /**
   * Returns the value of gdOrdToken50T
   *
   * @return gdOrdToken50T
   */
  public char[] getGdOrdToken50T() throws CFException {
    if (isGdOrdToken50TModified()) {
      gdOrdToken50T = refreshGdOrdToken50T();
    }
    return gdOrdToken50T;
  }

  /**
   * set variable gdOrdToken50T Corresponding COBOL Variable is GD-ORD-TOKEN-50-T
   *
   * @param value
   */
  public void setGdOrdToken50T(char[] value) {
    gdOrdToken50T = checkGdOrdToken50TConstraints(value);
    serializeGdOrdToken50T(gdOrdToken50T);
  }

  /**
   * Update GdOrdToken50T with a char[] from an offset and length
   *
   * @param value
   */
  public void setGdOrdToken50T(char[] source, int sourceIndex) {
    replace(source, sourceIndex, source.length, beginGdOrdToken50T, gdOrdToken50T.length);
  }

  public void setGdOrdToken50T(char[] source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginGdOrdToken50T, gdOrdToken50T.length);
  }

  /**
   * Update GdOrdToken50T with a char[] from an offset and length to an offset and length
   *
   * @param value
   */
  public void setGdOrdToken50T(
      char[] source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginGdOrdToken50T + targetIndex, targetLen);
  }

  /**
   * Update GdOrdToken50T with another Field
   *
   * @param value
   */
  public void setGdOrdToken50T(Field source) {
    replace(source, 0, source.length(), beginGdOrdToken50T, GD_ORD_TOKEN_50_T_LEN);
  }

  /**
   * Update GdOrdToken50T with another Field from an offset and length
   *
   * @param value
   */
  public void setGdOrdToken50T(Field source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginGdOrdToken50T, GD_ORD_TOKEN_50_T_LEN);
  }

  /**
   * Update GdOrdToken50T with another Field from an offset and length to an offset and length
   *
   * @param value
   */
  public void setGdOrdToken50T(
      Field source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginGdOrdToken50T + targetIndex, targetLen);
  }

  public static int getGdOrdToken50FieldLength() {
    return GD_ORD_TOKEN_50_LENGTH;
  }
}
