package com.cloudframe.app.dto.dphpctsq;

/**
 * The class GdOrdToken32 is used to handle fields declared in it
 *
 * @author CloudFrame Inc. created on 2025-03-25 at 08:30. using version 5.0.0.231
 */
import com.cloudframe.app.data.Field;
import com.cloudframe.app.dto.serialize.dphpctsq.*;
import com.cloudframe.app.exception.CFException;

public class GdOrdToken32 extends GdOrdToken32Serialized {

  private short gdOrdToken32L;

  private char[] gdOrdToken32T = Field.fillLowValue(515);

  /** Constructor for GdOrdToken32 */
  public GdOrdToken32() {
    // TO-DO auto generated code
  }

  /**
   * Constructor for GdOrdToken32. sets the parent value to the parent
   *
   * @param parent
   * @param begin
   */
  public GdOrdToken32(Field parent, int begin) {
    setParent(parent, begin);
  }

  /**
   * Returns the value of gdOrdToken32L
   *
   * @return gdOrdToken32L
   */
  public short getGdOrdToken32L() throws CFException {
    if (isGdOrdToken32LModified()) {
      gdOrdToken32L = refreshGdOrdToken32L();
    }
    return gdOrdToken32L;
  }

  /**
   * Update GdOrdToken32L with the passed value Corresponding COBOL Variable is GD-ORD-TOKEN-32-L
   *
   * @param number
   */
  public void setGdOrdToken32L(short number) {
    // Truncate if the number is beyond +/- Max range
    gdOrdToken32L = checkGdOrdToken32LMaxLimit(number);
    serializeGdOrdToken32L(gdOrdToken32L);
  }

  public void setGdOrdToken32L(int number) {
    number =
        checkGdOrdToken32LMaxLimit((short) number); // Truncate if value is beyond +/- Max range
    setGdOrdToken32L((short) number);
  }

  public void setGdOrdToken32L(long number) {
    number =
        checkGdOrdToken32LMaxLimit((short) number); // Truncate if value is beyond +/- Max range
    setGdOrdToken32L((short) number);
  }

  /**
   * Returns the value of gdOrdToken32T
   *
   * @return gdOrdToken32T
   */
  public char[] getGdOrdToken32T() throws CFException {
    if (isGdOrdToken32TModified()) {
      gdOrdToken32T = refreshGdOrdToken32T();
    }
    return gdOrdToken32T;
  }

  /**
   * set variable gdOrdToken32T Corresponding COBOL Variable is GD-ORD-TOKEN-32-T
   *
   * @param value
   */
  public void setGdOrdToken32T(char[] value) {
    gdOrdToken32T = checkGdOrdToken32TConstraints(value);
    serializeGdOrdToken32T(gdOrdToken32T);
  }

  /**
   * Update GdOrdToken32T with a char[] from an offset and length
   *
   * @param value
   */
  public void setGdOrdToken32T(char[] source, int sourceIndex) {
    replace(source, sourceIndex, source.length, beginGdOrdToken32T, gdOrdToken32T.length);
  }

  public void setGdOrdToken32T(char[] source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginGdOrdToken32T, gdOrdToken32T.length);
  }

  /**
   * Update GdOrdToken32T with a char[] from an offset and length to an offset and length
   *
   * @param value
   */
  public void setGdOrdToken32T(
      char[] source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginGdOrdToken32T + targetIndex, targetLen);
  }

  /**
   * Update GdOrdToken32T with another Field
   *
   * @param value
   */
  public void setGdOrdToken32T(Field source) {
    replace(source, 0, source.length(), beginGdOrdToken32T, GD_ORD_TOKEN_32_T_LEN);
  }

  /**
   * Update GdOrdToken32T with another Field from an offset and length
   *
   * @param value
   */
  public void setGdOrdToken32T(Field source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginGdOrdToken32T, GD_ORD_TOKEN_32_T_LEN);
  }

  /**
   * Update GdOrdToken32T with another Field from an offset and length to an offset and length
   *
   * @param value
   */
  public void setGdOrdToken32T(
      Field source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginGdOrdToken32T + targetIndex, targetLen);
  }

  public static int getGdOrdToken32FieldLength() {
    return GD_ORD_TOKEN_32_LENGTH;
  }
}
