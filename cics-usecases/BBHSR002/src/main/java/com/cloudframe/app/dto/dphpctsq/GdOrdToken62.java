package com.cloudframe.app.dto.dphpctsq;

/**
 * The class GdOrdToken62 is used to handle fields declared in it
 *
 * @author CloudFrame Inc. created on 2025-03-25 at 08:30. using version 5.0.0.231
 */
import com.cloudframe.app.data.Field;
import com.cloudframe.app.dto.serialize.dphpctsq.*;
import com.cloudframe.app.exception.CFException;

public class GdOrdToken62 extends GdOrdToken62Serialized {

  private short gdOrdToken62L;

  private char[] gdOrdToken62T = Field.fillLowValue(515);

  /** Constructor for GdOrdToken62 */
  public GdOrdToken62() {
    // TO-DO auto generated code
  }

  /**
   * Constructor for GdOrdToken62. sets the parent value to the parent
   *
   * @param parent
   * @param begin
   */
  public GdOrdToken62(Field parent, int begin) {
    setParent(parent, begin);
  }

  /**
   * Returns the value of gdOrdToken62L
   *
   * @return gdOrdToken62L
   */
  public short getGdOrdToken62L() throws CFException {
    if (isGdOrdToken62LModified()) {
      gdOrdToken62L = refreshGdOrdToken62L();
    }
    return gdOrdToken62L;
  }

  /**
   * Update GdOrdToken62L with the passed value Corresponding COBOL Variable is GD-ORD-TOKEN-62-L
   *
   * @param number
   */
  public void setGdOrdToken62L(short number) {
    // Truncate if the number is beyond +/- Max range
    gdOrdToken62L = checkGdOrdToken62LMaxLimit(number);
    serializeGdOrdToken62L(gdOrdToken62L);
  }

  public void setGdOrdToken62L(int number) {
    number =
        checkGdOrdToken62LMaxLimit((short) number); // Truncate if value is beyond +/- Max range
    setGdOrdToken62L((short) number);
  }

  public void setGdOrdToken62L(long number) {
    number =
        checkGdOrdToken62LMaxLimit((short) number); // Truncate if value is beyond +/- Max range
    setGdOrdToken62L((short) number);
  }

  /**
   * Returns the value of gdOrdToken62T
   *
   * @return gdOrdToken62T
   */
  public char[] getGdOrdToken62T() throws CFException {
    if (isGdOrdToken62TModified()) {
      gdOrdToken62T = refreshGdOrdToken62T();
    }
    return gdOrdToken62T;
  }

  /**
   * set variable gdOrdToken62T Corresponding COBOL Variable is GD-ORD-TOKEN-62-T
   *
   * @param value
   */
  public void setGdOrdToken62T(char[] value) {
    gdOrdToken62T = checkGdOrdToken62TConstraints(value);
    serializeGdOrdToken62T(gdOrdToken62T);
  }

  /**
   * Update GdOrdToken62T with a char[] from an offset and length
   *
   * @param value
   */
  public void setGdOrdToken62T(char[] source, int sourceIndex) {
    replace(source, sourceIndex, source.length, beginGdOrdToken62T, gdOrdToken62T.length);
  }

  public void setGdOrdToken62T(char[] source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginGdOrdToken62T, gdOrdToken62T.length);
  }

  /**
   * Update GdOrdToken62T with a char[] from an offset and length to an offset and length
   *
   * @param value
   */
  public void setGdOrdToken62T(
      char[] source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginGdOrdToken62T + targetIndex, targetLen);
  }

  /**
   * Update GdOrdToken62T with another Field
   *
   * @param value
   */
  public void setGdOrdToken62T(Field source) {
    replace(source, 0, source.length(), beginGdOrdToken62T, GD_ORD_TOKEN_62_T_LEN);
  }

  /**
   * Update GdOrdToken62T with another Field from an offset and length
   *
   * @param value
   */
  public void setGdOrdToken62T(Field source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginGdOrdToken62T, GD_ORD_TOKEN_62_T_LEN);
  }

  /**
   * Update GdOrdToken62T with another Field from an offset and length to an offset and length
   *
   * @param value
   */
  public void setGdOrdToken62T(
      Field source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginGdOrdToken62T + targetIndex, targetLen);
  }

  public static int getGdOrdToken62FieldLength() {
    return GD_ORD_TOKEN_62_LENGTH;
  }
}
