package com.cloudframe.app.dto.dphpctsq;

/**
 * The class GdOrdToken40 is used to handle fields declared in it
 *
 * @author CloudFrame Inc. created on 2025-03-25 at 08:30. using version 5.0.0.231
 */
import com.cloudframe.app.data.Field;
import com.cloudframe.app.dto.serialize.dphpctsq.*;
import com.cloudframe.app.exception.CFException;

public class GdOrdToken40 extends GdOrdToken40Serialized {

  private short gdOrdToken40L;

  private char[] gdOrdToken40T = Field.fillLowValue(515);

  /** Constructor for GdOrdToken40 */
  public GdOrdToken40() {
    // TO-DO auto generated code
  }

  /**
   * Constructor for GdOrdToken40. sets the parent value to the parent
   *
   * @param parent
   * @param begin
   */
  public GdOrdToken40(Field parent, int begin) {
    setParent(parent, begin);
  }

  /**
   * Returns the value of gdOrdToken40L
   *
   * @return gdOrdToken40L
   */
  public short getGdOrdToken40L() throws CFException {
    if (isGdOrdToken40LModified()) {
      gdOrdToken40L = refreshGdOrdToken40L();
    }
    return gdOrdToken40L;
  }

  /**
   * Update GdOrdToken40L with the passed value Corresponding COBOL Variable is GD-ORD-TOKEN-40-L
   *
   * @param number
   */
  public void setGdOrdToken40L(short number) {
    // Truncate if the number is beyond +/- Max range
    gdOrdToken40L = checkGdOrdToken40LMaxLimit(number);
    serializeGdOrdToken40L(gdOrdToken40L);
  }

  public void setGdOrdToken40L(int number) {
    number =
        checkGdOrdToken40LMaxLimit((short) number); // Truncate if value is beyond +/- Max range
    setGdOrdToken40L((short) number);
  }

  public void setGdOrdToken40L(long number) {
    number =
        checkGdOrdToken40LMaxLimit((short) number); // Truncate if value is beyond +/- Max range
    setGdOrdToken40L((short) number);
  }

  /**
   * Returns the value of gdOrdToken40T
   *
   * @return gdOrdToken40T
   */
  public char[] getGdOrdToken40T() throws CFException {
    if (isGdOrdToken40TModified()) {
      gdOrdToken40T = refreshGdOrdToken40T();
    }
    return gdOrdToken40T;
  }

  /**
   * set variable gdOrdToken40T Corresponding COBOL Variable is GD-ORD-TOKEN-40-T
   *
   * @param value
   */
  public void setGdOrdToken40T(char[] value) {
    gdOrdToken40T = checkGdOrdToken40TConstraints(value);
    serializeGdOrdToken40T(gdOrdToken40T);
  }

  /**
   * Update GdOrdToken40T with a char[] from an offset and length
   *
   * @param value
   */
  public void setGdOrdToken40T(char[] source, int sourceIndex) {
    replace(source, sourceIndex, source.length, beginGdOrdToken40T, gdOrdToken40T.length);
  }

  public void setGdOrdToken40T(char[] source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginGdOrdToken40T, gdOrdToken40T.length);
  }

  /**
   * Update GdOrdToken40T with a char[] from an offset and length to an offset and length
   *
   * @param value
   */
  public void setGdOrdToken40T(
      char[] source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginGdOrdToken40T + targetIndex, targetLen);
  }

  /**
   * Update GdOrdToken40T with another Field
   *
   * @param value
   */
  public void setGdOrdToken40T(Field source) {
    replace(source, 0, source.length(), beginGdOrdToken40T, GD_ORD_TOKEN_40_T_LEN);
  }

  /**
   * Update GdOrdToken40T with another Field from an offset and length
   *
   * @param value
   */
  public void setGdOrdToken40T(Field source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginGdOrdToken40T, GD_ORD_TOKEN_40_T_LEN);
  }

  /**
   * Update GdOrdToken40T with another Field from an offset and length to an offset and length
   *
   * @param value
   */
  public void setGdOrdToken40T(
      Field source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginGdOrdToken40T + targetIndex, targetLen);
  }

  public static int getGdOrdToken40FieldLength() {
    return GD_ORD_TOKEN_40_LENGTH;
  }
}
