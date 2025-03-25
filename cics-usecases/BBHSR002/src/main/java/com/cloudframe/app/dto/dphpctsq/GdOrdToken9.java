package com.cloudframe.app.dto.dphpctsq;

/**
 * The class GdOrdToken9 is used to handle fields declared in it
 *
 * @author CloudFrame Inc. created on 2025-03-25 at 08:30. using version 5.0.0.231
 */
import com.cloudframe.app.data.Field;
import com.cloudframe.app.dto.serialize.dphpctsq.*;
import com.cloudframe.app.exception.CFException;

public class GdOrdToken9 extends GdOrdToken9Serialized {

  private short gdOrdToken9L;

  private char[] gdOrdToken9T = Field.fillLowValue(515);

  /** Constructor for GdOrdToken9 */
  public GdOrdToken9() {
    // TO-DO auto generated code
  }

  /**
   * Constructor for GdOrdToken9. sets the parent value to the parent
   *
   * @param parent
   * @param begin
   */
  public GdOrdToken9(Field parent, int begin) {
    setParent(parent, begin);
  }

  /**
   * Returns the value of gdOrdToken9L
   *
   * @return gdOrdToken9L
   */
  public short getGdOrdToken9L() throws CFException {
    if (isGdOrdToken9LModified()) {
      gdOrdToken9L = refreshGdOrdToken9L();
    }
    return gdOrdToken9L;
  }

  /**
   * Update GdOrdToken9L with the passed value Corresponding COBOL Variable is GD-ORD-TOKEN-9-L
   *
   * @param number
   */
  public void setGdOrdToken9L(short number) {
    // Truncate if the number is beyond +/- Max range
    gdOrdToken9L = checkGdOrdToken9LMaxLimit(number);
    serializeGdOrdToken9L(gdOrdToken9L);
  }

  public void setGdOrdToken9L(int number) {
    number = checkGdOrdToken9LMaxLimit((short) number); // Truncate if value is beyond +/- Max range
    setGdOrdToken9L((short) number);
  }

  public void setGdOrdToken9L(long number) {
    number = checkGdOrdToken9LMaxLimit((short) number); // Truncate if value is beyond +/- Max range
    setGdOrdToken9L((short) number);
  }

  /**
   * Returns the value of gdOrdToken9T
   *
   * @return gdOrdToken9T
   */
  public char[] getGdOrdToken9T() throws CFException {
    if (isGdOrdToken9TModified()) {
      gdOrdToken9T = refreshGdOrdToken9T();
    }
    return gdOrdToken9T;
  }

  /**
   * set variable gdOrdToken9T Corresponding COBOL Variable is GD-ORD-TOKEN-9-T
   *
   * @param value
   */
  public void setGdOrdToken9T(char[] value) {
    gdOrdToken9T = checkGdOrdToken9TConstraints(value);
    serializeGdOrdToken9T(gdOrdToken9T);
  }

  /**
   * Update GdOrdToken9T with a char[] from an offset and length
   *
   * @param value
   */
  public void setGdOrdToken9T(char[] source, int sourceIndex) {
    replace(source, sourceIndex, source.length, beginGdOrdToken9T, gdOrdToken9T.length);
  }

  public void setGdOrdToken9T(char[] source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginGdOrdToken9T, gdOrdToken9T.length);
  }

  /**
   * Update GdOrdToken9T with a char[] from an offset and length to an offset and length
   *
   * @param value
   */
  public void setGdOrdToken9T(
      char[] source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginGdOrdToken9T + targetIndex, targetLen);
  }

  /**
   * Update GdOrdToken9T with another Field
   *
   * @param value
   */
  public void setGdOrdToken9T(Field source) {
    replace(source, 0, source.length(), beginGdOrdToken9T, GD_ORD_TOKEN_9_T_LEN);
  }

  /**
   * Update GdOrdToken9T with another Field from an offset and length
   *
   * @param value
   */
  public void setGdOrdToken9T(Field source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginGdOrdToken9T, GD_ORD_TOKEN_9_T_LEN);
  }

  /**
   * Update GdOrdToken9T with another Field from an offset and length to an offset and length
   *
   * @param value
   */
  public void setGdOrdToken9T(
      Field source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginGdOrdToken9T + targetIndex, targetLen);
  }

  public static int getGdOrdToken9FieldLength() {
    return GD_ORD_TOKEN_9_LENGTH;
  }
}
