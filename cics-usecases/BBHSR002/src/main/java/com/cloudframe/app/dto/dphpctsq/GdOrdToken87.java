package com.cloudframe.app.dto.dphpctsq;

/**
 * The class GdOrdToken87 is used to handle fields declared in it
 *
 * @author CloudFrame Inc. created on 2025-03-25 at 08:30. using version 5.0.0.231
 */
import com.cloudframe.app.data.Field;
import com.cloudframe.app.dto.serialize.dphpctsq.*;
import com.cloudframe.app.exception.CFException;

public class GdOrdToken87 extends GdOrdToken87Serialized {

  private short gdOrdToken87L;

  private char[] gdOrdToken87T = Field.fillLowValue(515);

  /** Constructor for GdOrdToken87 */
  public GdOrdToken87() {
    // TO-DO auto generated code
  }

  /**
   * Constructor for GdOrdToken87. sets the parent value to the parent
   *
   * @param parent
   * @param begin
   */
  public GdOrdToken87(Field parent, int begin) {
    setParent(parent, begin);
  }

  /**
   * Returns the value of gdOrdToken87L
   *
   * @return gdOrdToken87L
   */
  public short getGdOrdToken87L() throws CFException {
    if (isGdOrdToken87LModified()) {
      gdOrdToken87L = refreshGdOrdToken87L();
    }
    return gdOrdToken87L;
  }

  /**
   * Update GdOrdToken87L with the passed value Corresponding COBOL Variable is GD-ORD-TOKEN-87-L
   *
   * @param number
   */
  public void setGdOrdToken87L(short number) {
    // Truncate if the number is beyond +/- Max range
    gdOrdToken87L = checkGdOrdToken87LMaxLimit(number);
    serializeGdOrdToken87L(gdOrdToken87L);
  }

  public void setGdOrdToken87L(int number) {
    number =
        checkGdOrdToken87LMaxLimit((short) number); // Truncate if value is beyond +/- Max range
    setGdOrdToken87L((short) number);
  }

  public void setGdOrdToken87L(long number) {
    number =
        checkGdOrdToken87LMaxLimit((short) number); // Truncate if value is beyond +/- Max range
    setGdOrdToken87L((short) number);
  }

  /**
   * Returns the value of gdOrdToken87T
   *
   * @return gdOrdToken87T
   */
  public char[] getGdOrdToken87T() throws CFException {
    if (isGdOrdToken87TModified()) {
      gdOrdToken87T = refreshGdOrdToken87T();
    }
    return gdOrdToken87T;
  }

  /**
   * set variable gdOrdToken87T Corresponding COBOL Variable is GD-ORD-TOKEN-87-T
   *
   * @param value
   */
  public void setGdOrdToken87T(char[] value) {
    gdOrdToken87T = checkGdOrdToken87TConstraints(value);
    serializeGdOrdToken87T(gdOrdToken87T);
  }

  /**
   * Update GdOrdToken87T with a char[] from an offset and length
   *
   * @param value
   */
  public void setGdOrdToken87T(char[] source, int sourceIndex) {
    replace(source, sourceIndex, source.length, beginGdOrdToken87T, gdOrdToken87T.length);
  }

  public void setGdOrdToken87T(char[] source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginGdOrdToken87T, gdOrdToken87T.length);
  }

  /**
   * Update GdOrdToken87T with a char[] from an offset and length to an offset and length
   *
   * @param value
   */
  public void setGdOrdToken87T(
      char[] source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginGdOrdToken87T + targetIndex, targetLen);
  }

  /**
   * Update GdOrdToken87T with another Field
   *
   * @param value
   */
  public void setGdOrdToken87T(Field source) {
    replace(source, 0, source.length(), beginGdOrdToken87T, GD_ORD_TOKEN_87_T_LEN);
  }

  /**
   * Update GdOrdToken87T with another Field from an offset and length
   *
   * @param value
   */
  public void setGdOrdToken87T(Field source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginGdOrdToken87T, GD_ORD_TOKEN_87_T_LEN);
  }

  /**
   * Update GdOrdToken87T with another Field from an offset and length to an offset and length
   *
   * @param value
   */
  public void setGdOrdToken87T(
      Field source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginGdOrdToken87T + targetIndex, targetLen);
  }

  public static int getGdOrdToken87FieldLength() {
    return GD_ORD_TOKEN_87_LENGTH;
  }
}
