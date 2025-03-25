package com.cloudframe.app.dto.dphpctsq;

/**
 * The class GdOrdToken76 is used to handle fields declared in it
 *
 * @author CloudFrame Inc. created on 2025-03-25 at 08:30. using version 5.0.0.231
 */
import com.cloudframe.app.data.Field;
import com.cloudframe.app.dto.serialize.dphpctsq.*;
import com.cloudframe.app.exception.CFException;

public class GdOrdToken76 extends GdOrdToken76Serialized {

  private short gdOrdToken76L;

  private char[] gdOrdToken76T = Field.fillLowValue(515);

  /** Constructor for GdOrdToken76 */
  public GdOrdToken76() {
    // TO-DO auto generated code
  }

  /**
   * Constructor for GdOrdToken76. sets the parent value to the parent
   *
   * @param parent
   * @param begin
   */
  public GdOrdToken76(Field parent, int begin) {
    setParent(parent, begin);
  }

  /**
   * Returns the value of gdOrdToken76L
   *
   * @return gdOrdToken76L
   */
  public short getGdOrdToken76L() throws CFException {
    if (isGdOrdToken76LModified()) {
      gdOrdToken76L = refreshGdOrdToken76L();
    }
    return gdOrdToken76L;
  }

  /**
   * Update GdOrdToken76L with the passed value Corresponding COBOL Variable is GD-ORD-TOKEN-76-L
   *
   * @param number
   */
  public void setGdOrdToken76L(short number) {
    // Truncate if the number is beyond +/- Max range
    gdOrdToken76L = checkGdOrdToken76LMaxLimit(number);
    serializeGdOrdToken76L(gdOrdToken76L);
  }

  public void setGdOrdToken76L(int number) {
    number =
        checkGdOrdToken76LMaxLimit((short) number); // Truncate if value is beyond +/- Max range
    setGdOrdToken76L((short) number);
  }

  public void setGdOrdToken76L(long number) {
    number =
        checkGdOrdToken76LMaxLimit((short) number); // Truncate if value is beyond +/- Max range
    setGdOrdToken76L((short) number);
  }

  /**
   * Returns the value of gdOrdToken76T
   *
   * @return gdOrdToken76T
   */
  public char[] getGdOrdToken76T() throws CFException {
    if (isGdOrdToken76TModified()) {
      gdOrdToken76T = refreshGdOrdToken76T();
    }
    return gdOrdToken76T;
  }

  /**
   * set variable gdOrdToken76T Corresponding COBOL Variable is GD-ORD-TOKEN-76-T
   *
   * @param value
   */
  public void setGdOrdToken76T(char[] value) {
    gdOrdToken76T = checkGdOrdToken76TConstraints(value);
    serializeGdOrdToken76T(gdOrdToken76T);
  }

  /**
   * Update GdOrdToken76T with a char[] from an offset and length
   *
   * @param value
   */
  public void setGdOrdToken76T(char[] source, int sourceIndex) {
    replace(source, sourceIndex, source.length, beginGdOrdToken76T, gdOrdToken76T.length);
  }

  public void setGdOrdToken76T(char[] source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginGdOrdToken76T, gdOrdToken76T.length);
  }

  /**
   * Update GdOrdToken76T with a char[] from an offset and length to an offset and length
   *
   * @param value
   */
  public void setGdOrdToken76T(
      char[] source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginGdOrdToken76T + targetIndex, targetLen);
  }

  /**
   * Update GdOrdToken76T with another Field
   *
   * @param value
   */
  public void setGdOrdToken76T(Field source) {
    replace(source, 0, source.length(), beginGdOrdToken76T, GD_ORD_TOKEN_76_T_LEN);
  }

  /**
   * Update GdOrdToken76T with another Field from an offset and length
   *
   * @param value
   */
  public void setGdOrdToken76T(Field source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginGdOrdToken76T, GD_ORD_TOKEN_76_T_LEN);
  }

  /**
   * Update GdOrdToken76T with another Field from an offset and length to an offset and length
   *
   * @param value
   */
  public void setGdOrdToken76T(
      Field source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginGdOrdToken76T + targetIndex, targetLen);
  }

  public static int getGdOrdToken76FieldLength() {
    return GD_ORD_TOKEN_76_LENGTH;
  }
}
