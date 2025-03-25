package com.cloudframe.app.dto.dphpctsq;

/**
 * The class GdOrdToken20 is used to handle fields declared in it
 *
 * @author CloudFrame Inc. created on 2025-03-25 at 08:30. using version 5.0.0.231
 */
import com.cloudframe.app.data.Field;
import com.cloudframe.app.dto.serialize.dphpctsq.*;
import com.cloudframe.app.exception.CFException;

public class GdOrdToken20 extends GdOrdToken20Serialized {

  private short gdOrdToken20L;

  private char[] gdOrdToken20T = Field.fillLowValue(515);

  /** Constructor for GdOrdToken20 */
  public GdOrdToken20() {
    // TO-DO auto generated code
  }

  /**
   * Constructor for GdOrdToken20. sets the parent value to the parent
   *
   * @param parent
   * @param begin
   */
  public GdOrdToken20(Field parent, int begin) {
    setParent(parent, begin);
  }

  /**
   * Returns the value of gdOrdToken20L
   *
   * @return gdOrdToken20L
   */
  public short getGdOrdToken20L() throws CFException {
    if (isGdOrdToken20LModified()) {
      gdOrdToken20L = refreshGdOrdToken20L();
    }
    return gdOrdToken20L;
  }

  /**
   * Update GdOrdToken20L with the passed value Corresponding COBOL Variable is GD-ORD-TOKEN-20-L
   *
   * @param number
   */
  public void setGdOrdToken20L(short number) {
    // Truncate if the number is beyond +/- Max range
    gdOrdToken20L = checkGdOrdToken20LMaxLimit(number);
    serializeGdOrdToken20L(gdOrdToken20L);
  }

  public void setGdOrdToken20L(int number) {
    number =
        checkGdOrdToken20LMaxLimit((short) number); // Truncate if value is beyond +/- Max range
    setGdOrdToken20L((short) number);
  }

  public void setGdOrdToken20L(long number) {
    number =
        checkGdOrdToken20LMaxLimit((short) number); // Truncate if value is beyond +/- Max range
    setGdOrdToken20L((short) number);
  }

  /**
   * Returns the value of gdOrdToken20T
   *
   * @return gdOrdToken20T
   */
  public char[] getGdOrdToken20T() throws CFException {
    if (isGdOrdToken20TModified()) {
      gdOrdToken20T = refreshGdOrdToken20T();
    }
    return gdOrdToken20T;
  }

  /**
   * set variable gdOrdToken20T Corresponding COBOL Variable is GD-ORD-TOKEN-20-T
   *
   * @param value
   */
  public void setGdOrdToken20T(char[] value) {
    gdOrdToken20T = checkGdOrdToken20TConstraints(value);
    serializeGdOrdToken20T(gdOrdToken20T);
  }

  /**
   * Update GdOrdToken20T with a char[] from an offset and length
   *
   * @param value
   */
  public void setGdOrdToken20T(char[] source, int sourceIndex) {
    replace(source, sourceIndex, source.length, beginGdOrdToken20T, gdOrdToken20T.length);
  }

  public void setGdOrdToken20T(char[] source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginGdOrdToken20T, gdOrdToken20T.length);
  }

  /**
   * Update GdOrdToken20T with a char[] from an offset and length to an offset and length
   *
   * @param value
   */
  public void setGdOrdToken20T(
      char[] source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginGdOrdToken20T + targetIndex, targetLen);
  }

  /**
   * Update GdOrdToken20T with another Field
   *
   * @param value
   */
  public void setGdOrdToken20T(Field source) {
    replace(source, 0, source.length(), beginGdOrdToken20T, GD_ORD_TOKEN_20_T_LEN);
  }

  /**
   * Update GdOrdToken20T with another Field from an offset and length
   *
   * @param value
   */
  public void setGdOrdToken20T(Field source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginGdOrdToken20T, GD_ORD_TOKEN_20_T_LEN);
  }

  /**
   * Update GdOrdToken20T with another Field from an offset and length to an offset and length
   *
   * @param value
   */
  public void setGdOrdToken20T(
      Field source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginGdOrdToken20T + targetIndex, targetLen);
  }

  public static int getGdOrdToken20FieldLength() {
    return GD_ORD_TOKEN_20_LENGTH;
  }
}
