package com.cloudframe.app.dto.dphpctsq;

/**
 * The class GdOrdToken48 is used to handle fields declared in it
 *
 * @author CloudFrame Inc. created on 2025-03-25 at 08:30. using version 5.0.0.231
 */
import com.cloudframe.app.data.Field;
import com.cloudframe.app.dto.serialize.dphpctsq.*;
import com.cloudframe.app.exception.CFException;

public class GdOrdToken48 extends GdOrdToken48Serialized {

  private short gdOrdToken48L;

  private char[] gdOrdToken48T = Field.fillLowValue(515);

  /** Constructor for GdOrdToken48 */
  public GdOrdToken48() {
    // TO-DO auto generated code
  }

  /**
   * Constructor for GdOrdToken48. sets the parent value to the parent
   *
   * @param parent
   * @param begin
   */
  public GdOrdToken48(Field parent, int begin) {
    setParent(parent, begin);
  }

  /**
   * Returns the value of gdOrdToken48L
   *
   * @return gdOrdToken48L
   */
  public short getGdOrdToken48L() throws CFException {
    if (isGdOrdToken48LModified()) {
      gdOrdToken48L = refreshGdOrdToken48L();
    }
    return gdOrdToken48L;
  }

  /**
   * Update GdOrdToken48L with the passed value Corresponding COBOL Variable is GD-ORD-TOKEN-48-L
   *
   * @param number
   */
  public void setGdOrdToken48L(short number) {
    // Truncate if the number is beyond +/- Max range
    gdOrdToken48L = checkGdOrdToken48LMaxLimit(number);
    serializeGdOrdToken48L(gdOrdToken48L);
  }

  public void setGdOrdToken48L(int number) {
    number =
        checkGdOrdToken48LMaxLimit((short) number); // Truncate if value is beyond +/- Max range
    setGdOrdToken48L((short) number);
  }

  public void setGdOrdToken48L(long number) {
    number =
        checkGdOrdToken48LMaxLimit((short) number); // Truncate if value is beyond +/- Max range
    setGdOrdToken48L((short) number);
  }

  /**
   * Returns the value of gdOrdToken48T
   *
   * @return gdOrdToken48T
   */
  public char[] getGdOrdToken48T() throws CFException {
    if (isGdOrdToken48TModified()) {
      gdOrdToken48T = refreshGdOrdToken48T();
    }
    return gdOrdToken48T;
  }

  /**
   * set variable gdOrdToken48T Corresponding COBOL Variable is GD-ORD-TOKEN-48-T
   *
   * @param value
   */
  public void setGdOrdToken48T(char[] value) {
    gdOrdToken48T = checkGdOrdToken48TConstraints(value);
    serializeGdOrdToken48T(gdOrdToken48T);
  }

  /**
   * Update GdOrdToken48T with a char[] from an offset and length
   *
   * @param value
   */
  public void setGdOrdToken48T(char[] source, int sourceIndex) {
    replace(source, sourceIndex, source.length, beginGdOrdToken48T, gdOrdToken48T.length);
  }

  public void setGdOrdToken48T(char[] source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginGdOrdToken48T, gdOrdToken48T.length);
  }

  /**
   * Update GdOrdToken48T with a char[] from an offset and length to an offset and length
   *
   * @param value
   */
  public void setGdOrdToken48T(
      char[] source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginGdOrdToken48T + targetIndex, targetLen);
  }

  /**
   * Update GdOrdToken48T with another Field
   *
   * @param value
   */
  public void setGdOrdToken48T(Field source) {
    replace(source, 0, source.length(), beginGdOrdToken48T, GD_ORD_TOKEN_48_T_LEN);
  }

  /**
   * Update GdOrdToken48T with another Field from an offset and length
   *
   * @param value
   */
  public void setGdOrdToken48T(Field source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginGdOrdToken48T, GD_ORD_TOKEN_48_T_LEN);
  }

  /**
   * Update GdOrdToken48T with another Field from an offset and length to an offset and length
   *
   * @param value
   */
  public void setGdOrdToken48T(
      Field source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginGdOrdToken48T + targetIndex, targetLen);
  }

  public static int getGdOrdToken48FieldLength() {
    return GD_ORD_TOKEN_48_LENGTH;
  }
}
