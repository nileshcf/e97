package com.cloudframe.app.dto.dphpctsq;

/**
 * The class GdOrdToken24 is used to handle fields declared in it
 *
 * @author CloudFrame Inc. created on 2025-03-25 at 08:30. using version 5.0.0.231
 */
import com.cloudframe.app.data.Field;
import com.cloudframe.app.dto.serialize.dphpctsq.*;
import com.cloudframe.app.exception.CFException;

public class GdOrdToken24 extends GdOrdToken24Serialized {

  private short gdOrdToken24L;

  private char[] gdOrdToken24T = Field.fillLowValue(515);

  /** Constructor for GdOrdToken24 */
  public GdOrdToken24() {
    // TO-DO auto generated code
  }

  /**
   * Constructor for GdOrdToken24. sets the parent value to the parent
   *
   * @param parent
   * @param begin
   */
  public GdOrdToken24(Field parent, int begin) {
    setParent(parent, begin);
  }

  /**
   * Returns the value of gdOrdToken24L
   *
   * @return gdOrdToken24L
   */
  public short getGdOrdToken24L() throws CFException {
    if (isGdOrdToken24LModified()) {
      gdOrdToken24L = refreshGdOrdToken24L();
    }
    return gdOrdToken24L;
  }

  /**
   * Update GdOrdToken24L with the passed value Corresponding COBOL Variable is GD-ORD-TOKEN-24-L
   *
   * @param number
   */
  public void setGdOrdToken24L(short number) {
    // Truncate if the number is beyond +/- Max range
    gdOrdToken24L = checkGdOrdToken24LMaxLimit(number);
    serializeGdOrdToken24L(gdOrdToken24L);
  }

  public void setGdOrdToken24L(int number) {
    number =
        checkGdOrdToken24LMaxLimit((short) number); // Truncate if value is beyond +/- Max range
    setGdOrdToken24L((short) number);
  }

  public void setGdOrdToken24L(long number) {
    number =
        checkGdOrdToken24LMaxLimit((short) number); // Truncate if value is beyond +/- Max range
    setGdOrdToken24L((short) number);
  }

  /**
   * Returns the value of gdOrdToken24T
   *
   * @return gdOrdToken24T
   */
  public char[] getGdOrdToken24T() throws CFException {
    if (isGdOrdToken24TModified()) {
      gdOrdToken24T = refreshGdOrdToken24T();
    }
    return gdOrdToken24T;
  }

  /**
   * set variable gdOrdToken24T Corresponding COBOL Variable is GD-ORD-TOKEN-24-T
   *
   * @param value
   */
  public void setGdOrdToken24T(char[] value) {
    gdOrdToken24T = checkGdOrdToken24TConstraints(value);
    serializeGdOrdToken24T(gdOrdToken24T);
  }

  /**
   * Update GdOrdToken24T with a char[] from an offset and length
   *
   * @param value
   */
  public void setGdOrdToken24T(char[] source, int sourceIndex) {
    replace(source, sourceIndex, source.length, beginGdOrdToken24T, gdOrdToken24T.length);
  }

  public void setGdOrdToken24T(char[] source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginGdOrdToken24T, gdOrdToken24T.length);
  }

  /**
   * Update GdOrdToken24T with a char[] from an offset and length to an offset and length
   *
   * @param value
   */
  public void setGdOrdToken24T(
      char[] source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginGdOrdToken24T + targetIndex, targetLen);
  }

  /**
   * Update GdOrdToken24T with another Field
   *
   * @param value
   */
  public void setGdOrdToken24T(Field source) {
    replace(source, 0, source.length(), beginGdOrdToken24T, GD_ORD_TOKEN_24_T_LEN);
  }

  /**
   * Update GdOrdToken24T with another Field from an offset and length
   *
   * @param value
   */
  public void setGdOrdToken24T(Field source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginGdOrdToken24T, GD_ORD_TOKEN_24_T_LEN);
  }

  /**
   * Update GdOrdToken24T with another Field from an offset and length to an offset and length
   *
   * @param value
   */
  public void setGdOrdToken24T(
      Field source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginGdOrdToken24T + targetIndex, targetLen);
  }

  public static int getGdOrdToken24FieldLength() {
    return GD_ORD_TOKEN_24_LENGTH;
  }
}
