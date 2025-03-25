package com.cloudframe.app.dto.dphpctsq;

/**
 * The class GdOrdToken11 is used to handle fields declared in it
 *
 * @author CloudFrame Inc. created on 2025-03-25 at 08:30. using version 5.0.0.231
 */
import com.cloudframe.app.data.Field;
import com.cloudframe.app.dto.serialize.dphpctsq.*;
import com.cloudframe.app.exception.CFException;

public class GdOrdToken11 extends GdOrdToken11Serialized {

  private short gdOrdToken11L;

  private char[] gdOrdToken11T = Field.fillLowValue(515);

  /** Constructor for GdOrdToken11 */
  public GdOrdToken11() {
    // TO-DO auto generated code
  }

  /**
   * Constructor for GdOrdToken11. sets the parent value to the parent
   *
   * @param parent
   * @param begin
   */
  public GdOrdToken11(Field parent, int begin) {
    setParent(parent, begin);
  }

  /**
   * Returns the value of gdOrdToken11L
   *
   * @return gdOrdToken11L
   */
  public short getGdOrdToken11L() throws CFException {
    if (isGdOrdToken11LModified()) {
      gdOrdToken11L = refreshGdOrdToken11L();
    }
    return gdOrdToken11L;
  }

  /**
   * Update GdOrdToken11L with the passed value Corresponding COBOL Variable is GD-ORD-TOKEN-11-L
   *
   * @param number
   */
  public void setGdOrdToken11L(short number) {
    // Truncate if the number is beyond +/- Max range
    gdOrdToken11L = checkGdOrdToken11LMaxLimit(number);
    serializeGdOrdToken11L(gdOrdToken11L);
  }

  public void setGdOrdToken11L(int number) {
    number =
        checkGdOrdToken11LMaxLimit((short) number); // Truncate if value is beyond +/- Max range
    setGdOrdToken11L((short) number);
  }

  public void setGdOrdToken11L(long number) {
    number =
        checkGdOrdToken11LMaxLimit((short) number); // Truncate if value is beyond +/- Max range
    setGdOrdToken11L((short) number);
  }

  /**
   * Returns the value of gdOrdToken11T
   *
   * @return gdOrdToken11T
   */
  public char[] getGdOrdToken11T() throws CFException {
    if (isGdOrdToken11TModified()) {
      gdOrdToken11T = refreshGdOrdToken11T();
    }
    return gdOrdToken11T;
  }

  /**
   * set variable gdOrdToken11T Corresponding COBOL Variable is GD-ORD-TOKEN-11-T
   *
   * @param value
   */
  public void setGdOrdToken11T(char[] value) {
    gdOrdToken11T = checkGdOrdToken11TConstraints(value);
    serializeGdOrdToken11T(gdOrdToken11T);
  }

  /**
   * Update GdOrdToken11T with a char[] from an offset and length
   *
   * @param value
   */
  public void setGdOrdToken11T(char[] source, int sourceIndex) {
    replace(source, sourceIndex, source.length, beginGdOrdToken11T, gdOrdToken11T.length);
  }

  public void setGdOrdToken11T(char[] source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginGdOrdToken11T, gdOrdToken11T.length);
  }

  /**
   * Update GdOrdToken11T with a char[] from an offset and length to an offset and length
   *
   * @param value
   */
  public void setGdOrdToken11T(
      char[] source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginGdOrdToken11T + targetIndex, targetLen);
  }

  /**
   * Update GdOrdToken11T with another Field
   *
   * @param value
   */
  public void setGdOrdToken11T(Field source) {
    replace(source, 0, source.length(), beginGdOrdToken11T, GD_ORD_TOKEN_11_T_LEN);
  }

  /**
   * Update GdOrdToken11T with another Field from an offset and length
   *
   * @param value
   */
  public void setGdOrdToken11T(Field source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginGdOrdToken11T, GD_ORD_TOKEN_11_T_LEN);
  }

  /**
   * Update GdOrdToken11T with another Field from an offset and length to an offset and length
   *
   * @param value
   */
  public void setGdOrdToken11T(
      Field source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginGdOrdToken11T + targetIndex, targetLen);
  }

  public static int getGdOrdToken11FieldLength() {
    return GD_ORD_TOKEN_11_LENGTH;
  }
}
