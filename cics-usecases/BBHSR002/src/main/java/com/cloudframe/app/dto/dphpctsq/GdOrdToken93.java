package com.cloudframe.app.dto.dphpctsq;

/**
 * The class GdOrdToken93 is used to handle fields declared in it
 *
 * @author CloudFrame Inc. created on 2025-03-25 at 08:30. using version 5.0.0.231
 */
import com.cloudframe.app.data.Field;
import com.cloudframe.app.dto.serialize.dphpctsq.*;
import com.cloudframe.app.exception.CFException;

public class GdOrdToken93 extends GdOrdToken93Serialized {

  private short gdOrdToken93L;

  private char[] gdOrdToken93T = Field.fillLowValue(515);

  /** Constructor for GdOrdToken93 */
  public GdOrdToken93() {
    // TO-DO auto generated code
  }

  /**
   * Constructor for GdOrdToken93. sets the parent value to the parent
   *
   * @param parent
   * @param begin
   */
  public GdOrdToken93(Field parent, int begin) {
    setParent(parent, begin);
  }

  /**
   * Returns the value of gdOrdToken93L
   *
   * @return gdOrdToken93L
   */
  public short getGdOrdToken93L() throws CFException {
    if (isGdOrdToken93LModified()) {
      gdOrdToken93L = refreshGdOrdToken93L();
    }
    return gdOrdToken93L;
  }

  /**
   * Update GdOrdToken93L with the passed value Corresponding COBOL Variable is GD-ORD-TOKEN-93-L
   *
   * @param number
   */
  public void setGdOrdToken93L(short number) {
    // Truncate if the number is beyond +/- Max range
    gdOrdToken93L = checkGdOrdToken93LMaxLimit(number);
    serializeGdOrdToken93L(gdOrdToken93L);
  }

  public void setGdOrdToken93L(int number) {
    number =
        checkGdOrdToken93LMaxLimit((short) number); // Truncate if value is beyond +/- Max range
    setGdOrdToken93L((short) number);
  }

  public void setGdOrdToken93L(long number) {
    number =
        checkGdOrdToken93LMaxLimit((short) number); // Truncate if value is beyond +/- Max range
    setGdOrdToken93L((short) number);
  }

  /**
   * Returns the value of gdOrdToken93T
   *
   * @return gdOrdToken93T
   */
  public char[] getGdOrdToken93T() throws CFException {
    if (isGdOrdToken93TModified()) {
      gdOrdToken93T = refreshGdOrdToken93T();
    }
    return gdOrdToken93T;
  }

  /**
   * set variable gdOrdToken93T Corresponding COBOL Variable is GD-ORD-TOKEN-93-T
   *
   * @param value
   */
  public void setGdOrdToken93T(char[] value) {
    gdOrdToken93T = checkGdOrdToken93TConstraints(value);
    serializeGdOrdToken93T(gdOrdToken93T);
  }

  /**
   * Update GdOrdToken93T with a char[] from an offset and length
   *
   * @param value
   */
  public void setGdOrdToken93T(char[] source, int sourceIndex) {
    replace(source, sourceIndex, source.length, beginGdOrdToken93T, gdOrdToken93T.length);
  }

  public void setGdOrdToken93T(char[] source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginGdOrdToken93T, gdOrdToken93T.length);
  }

  /**
   * Update GdOrdToken93T with a char[] from an offset and length to an offset and length
   *
   * @param value
   */
  public void setGdOrdToken93T(
      char[] source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginGdOrdToken93T + targetIndex, targetLen);
  }

  /**
   * Update GdOrdToken93T with another Field
   *
   * @param value
   */
  public void setGdOrdToken93T(Field source) {
    replace(source, 0, source.length(), beginGdOrdToken93T, GD_ORD_TOKEN_93_T_LEN);
  }

  /**
   * Update GdOrdToken93T with another Field from an offset and length
   *
   * @param value
   */
  public void setGdOrdToken93T(Field source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginGdOrdToken93T, GD_ORD_TOKEN_93_T_LEN);
  }

  /**
   * Update GdOrdToken93T with another Field from an offset and length to an offset and length
   *
   * @param value
   */
  public void setGdOrdToken93T(
      Field source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginGdOrdToken93T + targetIndex, targetLen);
  }

  public static int getGdOrdToken93FieldLength() {
    return GD_ORD_TOKEN_93_LENGTH;
  }
}
