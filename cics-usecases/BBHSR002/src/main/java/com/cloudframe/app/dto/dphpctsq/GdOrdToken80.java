package com.cloudframe.app.dto.dphpctsq;

/**
 * The class GdOrdToken80 is used to handle fields declared in it
 *
 * @author CloudFrame Inc. created on 2025-03-25 at 08:30. using version 5.0.0.231
 */
import com.cloudframe.app.data.Field;
import com.cloudframe.app.dto.serialize.dphpctsq.*;
import com.cloudframe.app.exception.CFException;

public class GdOrdToken80 extends GdOrdToken80Serialized {

  private short gdOrdToken80L;

  private char[] gdOrdToken80T = Field.fillLowValue(515);

  /** Constructor for GdOrdToken80 */
  public GdOrdToken80() {
    // TO-DO auto generated code
  }

  /**
   * Constructor for GdOrdToken80. sets the parent value to the parent
   *
   * @param parent
   * @param begin
   */
  public GdOrdToken80(Field parent, int begin) {
    setParent(parent, begin);
  }

  /**
   * Returns the value of gdOrdToken80L
   *
   * @return gdOrdToken80L
   */
  public short getGdOrdToken80L() throws CFException {
    if (isGdOrdToken80LModified()) {
      gdOrdToken80L = refreshGdOrdToken80L();
    }
    return gdOrdToken80L;
  }

  /**
   * Update GdOrdToken80L with the passed value Corresponding COBOL Variable is GD-ORD-TOKEN-80-L
   *
   * @param number
   */
  public void setGdOrdToken80L(short number) {
    // Truncate if the number is beyond +/- Max range
    gdOrdToken80L = checkGdOrdToken80LMaxLimit(number);
    serializeGdOrdToken80L(gdOrdToken80L);
  }

  public void setGdOrdToken80L(int number) {
    number =
        checkGdOrdToken80LMaxLimit((short) number); // Truncate if value is beyond +/- Max range
    setGdOrdToken80L((short) number);
  }

  public void setGdOrdToken80L(long number) {
    number =
        checkGdOrdToken80LMaxLimit((short) number); // Truncate if value is beyond +/- Max range
    setGdOrdToken80L((short) number);
  }

  /**
   * Returns the value of gdOrdToken80T
   *
   * @return gdOrdToken80T
   */
  public char[] getGdOrdToken80T() throws CFException {
    if (isGdOrdToken80TModified()) {
      gdOrdToken80T = refreshGdOrdToken80T();
    }
    return gdOrdToken80T;
  }

  /**
   * set variable gdOrdToken80T Corresponding COBOL Variable is GD-ORD-TOKEN-80-T
   *
   * @param value
   */
  public void setGdOrdToken80T(char[] value) {
    gdOrdToken80T = checkGdOrdToken80TConstraints(value);
    serializeGdOrdToken80T(gdOrdToken80T);
  }

  /**
   * Update GdOrdToken80T with a char[] from an offset and length
   *
   * @param value
   */
  public void setGdOrdToken80T(char[] source, int sourceIndex) {
    replace(source, sourceIndex, source.length, beginGdOrdToken80T, gdOrdToken80T.length);
  }

  public void setGdOrdToken80T(char[] source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginGdOrdToken80T, gdOrdToken80T.length);
  }

  /**
   * Update GdOrdToken80T with a char[] from an offset and length to an offset and length
   *
   * @param value
   */
  public void setGdOrdToken80T(
      char[] source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginGdOrdToken80T + targetIndex, targetLen);
  }

  /**
   * Update GdOrdToken80T with another Field
   *
   * @param value
   */
  public void setGdOrdToken80T(Field source) {
    replace(source, 0, source.length(), beginGdOrdToken80T, GD_ORD_TOKEN_80_T_LEN);
  }

  /**
   * Update GdOrdToken80T with another Field from an offset and length
   *
   * @param value
   */
  public void setGdOrdToken80T(Field source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginGdOrdToken80T, GD_ORD_TOKEN_80_T_LEN);
  }

  /**
   * Update GdOrdToken80T with another Field from an offset and length to an offset and length
   *
   * @param value
   */
  public void setGdOrdToken80T(
      Field source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginGdOrdToken80T + targetIndex, targetLen);
  }

  public static int getGdOrdToken80FieldLength() {
    return GD_ORD_TOKEN_80_LENGTH;
  }
}
