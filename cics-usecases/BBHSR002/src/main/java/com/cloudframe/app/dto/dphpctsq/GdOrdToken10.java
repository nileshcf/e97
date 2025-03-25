package com.cloudframe.app.dto.dphpctsq;

/**
 * The class GdOrdToken10 is used to handle fields declared in it
 *
 * @author CloudFrame Inc. created on 2025-03-25 at 08:30. using version 5.0.0.231
 */
import com.cloudframe.app.data.Field;
import com.cloudframe.app.dto.serialize.dphpctsq.*;
import com.cloudframe.app.exception.CFException;

public class GdOrdToken10 extends GdOrdToken10Serialized {

  private short gdOrdToken10L;

  private char[] gdOrdToken10T = Field.fillLowValue(515);

  /** Constructor for GdOrdToken10 */
  public GdOrdToken10() {
    // TO-DO auto generated code
  }

  /**
   * Constructor for GdOrdToken10. sets the parent value to the parent
   *
   * @param parent
   * @param begin
   */
  public GdOrdToken10(Field parent, int begin) {
    setParent(parent, begin);
  }

  /**
   * Returns the value of gdOrdToken10L
   *
   * @return gdOrdToken10L
   */
  public short getGdOrdToken10L() throws CFException {
    if (isGdOrdToken10LModified()) {
      gdOrdToken10L = refreshGdOrdToken10L();
    }
    return gdOrdToken10L;
  }

  /**
   * Update GdOrdToken10L with the passed value Corresponding COBOL Variable is GD-ORD-TOKEN-10-L
   *
   * @param number
   */
  public void setGdOrdToken10L(short number) {
    // Truncate if the number is beyond +/- Max range
    gdOrdToken10L = checkGdOrdToken10LMaxLimit(number);
    serializeGdOrdToken10L(gdOrdToken10L);
  }

  public void setGdOrdToken10L(int number) {
    number =
        checkGdOrdToken10LMaxLimit((short) number); // Truncate if value is beyond +/- Max range
    setGdOrdToken10L((short) number);
  }

  public void setGdOrdToken10L(long number) {
    number =
        checkGdOrdToken10LMaxLimit((short) number); // Truncate if value is beyond +/- Max range
    setGdOrdToken10L((short) number);
  }

  /**
   * Returns the value of gdOrdToken10T
   *
   * @return gdOrdToken10T
   */
  public char[] getGdOrdToken10T() throws CFException {
    if (isGdOrdToken10TModified()) {
      gdOrdToken10T = refreshGdOrdToken10T();
    }
    return gdOrdToken10T;
  }

  /**
   * set variable gdOrdToken10T Corresponding COBOL Variable is GD-ORD-TOKEN-10-T
   *
   * @param value
   */
  public void setGdOrdToken10T(char[] value) {
    gdOrdToken10T = checkGdOrdToken10TConstraints(value);
    serializeGdOrdToken10T(gdOrdToken10T);
  }

  /**
   * Update GdOrdToken10T with a char[] from an offset and length
   *
   * @param value
   */
  public void setGdOrdToken10T(char[] source, int sourceIndex) {
    replace(source, sourceIndex, source.length, beginGdOrdToken10T, gdOrdToken10T.length);
  }

  public void setGdOrdToken10T(char[] source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginGdOrdToken10T, gdOrdToken10T.length);
  }

  /**
   * Update GdOrdToken10T with a char[] from an offset and length to an offset and length
   *
   * @param value
   */
  public void setGdOrdToken10T(
      char[] source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginGdOrdToken10T + targetIndex, targetLen);
  }

  /**
   * Update GdOrdToken10T with another Field
   *
   * @param value
   */
  public void setGdOrdToken10T(Field source) {
    replace(source, 0, source.length(), beginGdOrdToken10T, GD_ORD_TOKEN_10_T_LEN);
  }

  /**
   * Update GdOrdToken10T with another Field from an offset and length
   *
   * @param value
   */
  public void setGdOrdToken10T(Field source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginGdOrdToken10T, GD_ORD_TOKEN_10_T_LEN);
  }

  /**
   * Update GdOrdToken10T with another Field from an offset and length to an offset and length
   *
   * @param value
   */
  public void setGdOrdToken10T(
      Field source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginGdOrdToken10T + targetIndex, targetLen);
  }

  public static int getGdOrdToken10FieldLength() {
    return GD_ORD_TOKEN_10_LENGTH;
  }
}
