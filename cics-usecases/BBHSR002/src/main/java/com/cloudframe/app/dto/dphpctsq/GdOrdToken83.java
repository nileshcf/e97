package com.cloudframe.app.dto.dphpctsq;

/**
 * The class GdOrdToken83 is used to handle fields declared in it
 *
 * @author CloudFrame Inc. created on 2025-03-25 at 08:30. using version 5.0.0.231
 */
import com.cloudframe.app.data.Field;
import com.cloudframe.app.dto.serialize.dphpctsq.*;
import com.cloudframe.app.exception.CFException;

public class GdOrdToken83 extends GdOrdToken83Serialized {

  private short gdOrdToken83L;

  private char[] gdOrdToken83T = Field.fillLowValue(515);

  /** Constructor for GdOrdToken83 */
  public GdOrdToken83() {
    // TO-DO auto generated code
  }

  /**
   * Constructor for GdOrdToken83. sets the parent value to the parent
   *
   * @param parent
   * @param begin
   */
  public GdOrdToken83(Field parent, int begin) {
    setParent(parent, begin);
  }

  /**
   * Returns the value of gdOrdToken83L
   *
   * @return gdOrdToken83L
   */
  public short getGdOrdToken83L() throws CFException {
    if (isGdOrdToken83LModified()) {
      gdOrdToken83L = refreshGdOrdToken83L();
    }
    return gdOrdToken83L;
  }

  /**
   * Update GdOrdToken83L with the passed value Corresponding COBOL Variable is GD-ORD-TOKEN-83-L
   *
   * @param number
   */
  public void setGdOrdToken83L(short number) {
    // Truncate if the number is beyond +/- Max range
    gdOrdToken83L = checkGdOrdToken83LMaxLimit(number);
    serializeGdOrdToken83L(gdOrdToken83L);
  }

  public void setGdOrdToken83L(int number) {
    number =
        checkGdOrdToken83LMaxLimit((short) number); // Truncate if value is beyond +/- Max range
    setGdOrdToken83L((short) number);
  }

  public void setGdOrdToken83L(long number) {
    number =
        checkGdOrdToken83LMaxLimit((short) number); // Truncate if value is beyond +/- Max range
    setGdOrdToken83L((short) number);
  }

  /**
   * Returns the value of gdOrdToken83T
   *
   * @return gdOrdToken83T
   */
  public char[] getGdOrdToken83T() throws CFException {
    if (isGdOrdToken83TModified()) {
      gdOrdToken83T = refreshGdOrdToken83T();
    }
    return gdOrdToken83T;
  }

  /**
   * set variable gdOrdToken83T Corresponding COBOL Variable is GD-ORD-TOKEN-83-T
   *
   * @param value
   */
  public void setGdOrdToken83T(char[] value) {
    gdOrdToken83T = checkGdOrdToken83TConstraints(value);
    serializeGdOrdToken83T(gdOrdToken83T);
  }

  /**
   * Update GdOrdToken83T with a char[] from an offset and length
   *
   * @param value
   */
  public void setGdOrdToken83T(char[] source, int sourceIndex) {
    replace(source, sourceIndex, source.length, beginGdOrdToken83T, gdOrdToken83T.length);
  }

  public void setGdOrdToken83T(char[] source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginGdOrdToken83T, gdOrdToken83T.length);
  }

  /**
   * Update GdOrdToken83T with a char[] from an offset and length to an offset and length
   *
   * @param value
   */
  public void setGdOrdToken83T(
      char[] source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginGdOrdToken83T + targetIndex, targetLen);
  }

  /**
   * Update GdOrdToken83T with another Field
   *
   * @param value
   */
  public void setGdOrdToken83T(Field source) {
    replace(source, 0, source.length(), beginGdOrdToken83T, GD_ORD_TOKEN_83_T_LEN);
  }

  /**
   * Update GdOrdToken83T with another Field from an offset and length
   *
   * @param value
   */
  public void setGdOrdToken83T(Field source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginGdOrdToken83T, GD_ORD_TOKEN_83_T_LEN);
  }

  /**
   * Update GdOrdToken83T with another Field from an offset and length to an offset and length
   *
   * @param value
   */
  public void setGdOrdToken83T(
      Field source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginGdOrdToken83T + targetIndex, targetLen);
  }

  public static int getGdOrdToken83FieldLength() {
    return GD_ORD_TOKEN_83_LENGTH;
  }
}
