package com.cloudframe.app.dto.dphpctsq;

/**
 * The class GdOrdToken63 is used to handle fields declared in it
 *
 * @author CloudFrame Inc. created on 2025-03-25 at 08:30. using version 5.0.0.231
 */
import com.cloudframe.app.data.Field;
import com.cloudframe.app.dto.serialize.dphpctsq.*;
import com.cloudframe.app.exception.CFException;

public class GdOrdToken63 extends GdOrdToken63Serialized {

  private short gdOrdToken63L;

  private char[] gdOrdToken63T = Field.fillLowValue(515);

  /** Constructor for GdOrdToken63 */
  public GdOrdToken63() {
    // TO-DO auto generated code
  }

  /**
   * Constructor for GdOrdToken63. sets the parent value to the parent
   *
   * @param parent
   * @param begin
   */
  public GdOrdToken63(Field parent, int begin) {
    setParent(parent, begin);
  }

  /**
   * Returns the value of gdOrdToken63L
   *
   * @return gdOrdToken63L
   */
  public short getGdOrdToken63L() throws CFException {
    if (isGdOrdToken63LModified()) {
      gdOrdToken63L = refreshGdOrdToken63L();
    }
    return gdOrdToken63L;
  }

  /**
   * Update GdOrdToken63L with the passed value Corresponding COBOL Variable is GD-ORD-TOKEN-63-L
   *
   * @param number
   */
  public void setGdOrdToken63L(short number) {
    // Truncate if the number is beyond +/- Max range
    gdOrdToken63L = checkGdOrdToken63LMaxLimit(number);
    serializeGdOrdToken63L(gdOrdToken63L);
  }

  public void setGdOrdToken63L(int number) {
    number =
        checkGdOrdToken63LMaxLimit((short) number); // Truncate if value is beyond +/- Max range
    setGdOrdToken63L((short) number);
  }

  public void setGdOrdToken63L(long number) {
    number =
        checkGdOrdToken63LMaxLimit((short) number); // Truncate if value is beyond +/- Max range
    setGdOrdToken63L((short) number);
  }

  /**
   * Returns the value of gdOrdToken63T
   *
   * @return gdOrdToken63T
   */
  public char[] getGdOrdToken63T() throws CFException {
    if (isGdOrdToken63TModified()) {
      gdOrdToken63T = refreshGdOrdToken63T();
    }
    return gdOrdToken63T;
  }

  /**
   * set variable gdOrdToken63T Corresponding COBOL Variable is GD-ORD-TOKEN-63-T
   *
   * @param value
   */
  public void setGdOrdToken63T(char[] value) {
    gdOrdToken63T = checkGdOrdToken63TConstraints(value);
    serializeGdOrdToken63T(gdOrdToken63T);
  }

  /**
   * Update GdOrdToken63T with a char[] from an offset and length
   *
   * @param value
   */
  public void setGdOrdToken63T(char[] source, int sourceIndex) {
    replace(source, sourceIndex, source.length, beginGdOrdToken63T, gdOrdToken63T.length);
  }

  public void setGdOrdToken63T(char[] source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginGdOrdToken63T, gdOrdToken63T.length);
  }

  /**
   * Update GdOrdToken63T with a char[] from an offset and length to an offset and length
   *
   * @param value
   */
  public void setGdOrdToken63T(
      char[] source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginGdOrdToken63T + targetIndex, targetLen);
  }

  /**
   * Update GdOrdToken63T with another Field
   *
   * @param value
   */
  public void setGdOrdToken63T(Field source) {
    replace(source, 0, source.length(), beginGdOrdToken63T, GD_ORD_TOKEN_63_T_LEN);
  }

  /**
   * Update GdOrdToken63T with another Field from an offset and length
   *
   * @param value
   */
  public void setGdOrdToken63T(Field source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginGdOrdToken63T, GD_ORD_TOKEN_63_T_LEN);
  }

  /**
   * Update GdOrdToken63T with another Field from an offset and length to an offset and length
   *
   * @param value
   */
  public void setGdOrdToken63T(
      Field source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginGdOrdToken63T + targetIndex, targetLen);
  }

  public static int getGdOrdToken63FieldLength() {
    return GD_ORD_TOKEN_63_LENGTH;
  }
}
