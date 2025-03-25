package com.cloudframe.app.dto.dphpctsq;

/**
 * The class GdOrdToken39 is used to handle fields declared in it
 *
 * @author CloudFrame Inc. created on 2025-03-25 at 08:30. using version 5.0.0.231
 */
import com.cloudframe.app.data.Field;
import com.cloudframe.app.dto.serialize.dphpctsq.*;
import com.cloudframe.app.exception.CFException;

public class GdOrdToken39 extends GdOrdToken39Serialized {

  private short gdOrdToken39L;

  private char[] gdOrdToken39T = Field.fillLowValue(515);

  /** Constructor for GdOrdToken39 */
  public GdOrdToken39() {
    // TO-DO auto generated code
  }

  /**
   * Constructor for GdOrdToken39. sets the parent value to the parent
   *
   * @param parent
   * @param begin
   */
  public GdOrdToken39(Field parent, int begin) {
    setParent(parent, begin);
  }

  /**
   * Returns the value of gdOrdToken39L
   *
   * @return gdOrdToken39L
   */
  public short getGdOrdToken39L() throws CFException {
    if (isGdOrdToken39LModified()) {
      gdOrdToken39L = refreshGdOrdToken39L();
    }
    return gdOrdToken39L;
  }

  /**
   * Update GdOrdToken39L with the passed value Corresponding COBOL Variable is GD-ORD-TOKEN-39-L
   *
   * @param number
   */
  public void setGdOrdToken39L(short number) {
    // Truncate if the number is beyond +/- Max range
    gdOrdToken39L = checkGdOrdToken39LMaxLimit(number);
    serializeGdOrdToken39L(gdOrdToken39L);
  }

  public void setGdOrdToken39L(int number) {
    number =
        checkGdOrdToken39LMaxLimit((short) number); // Truncate if value is beyond +/- Max range
    setGdOrdToken39L((short) number);
  }

  public void setGdOrdToken39L(long number) {
    number =
        checkGdOrdToken39LMaxLimit((short) number); // Truncate if value is beyond +/- Max range
    setGdOrdToken39L((short) number);
  }

  /**
   * Returns the value of gdOrdToken39T
   *
   * @return gdOrdToken39T
   */
  public char[] getGdOrdToken39T() throws CFException {
    if (isGdOrdToken39TModified()) {
      gdOrdToken39T = refreshGdOrdToken39T();
    }
    return gdOrdToken39T;
  }

  /**
   * set variable gdOrdToken39T Corresponding COBOL Variable is GD-ORD-TOKEN-39-T
   *
   * @param value
   */
  public void setGdOrdToken39T(char[] value) {
    gdOrdToken39T = checkGdOrdToken39TConstraints(value);
    serializeGdOrdToken39T(gdOrdToken39T);
  }

  /**
   * Update GdOrdToken39T with a char[] from an offset and length
   *
   * @param value
   */
  public void setGdOrdToken39T(char[] source, int sourceIndex) {
    replace(source, sourceIndex, source.length, beginGdOrdToken39T, gdOrdToken39T.length);
  }

  public void setGdOrdToken39T(char[] source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginGdOrdToken39T, gdOrdToken39T.length);
  }

  /**
   * Update GdOrdToken39T with a char[] from an offset and length to an offset and length
   *
   * @param value
   */
  public void setGdOrdToken39T(
      char[] source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginGdOrdToken39T + targetIndex, targetLen);
  }

  /**
   * Update GdOrdToken39T with another Field
   *
   * @param value
   */
  public void setGdOrdToken39T(Field source) {
    replace(source, 0, source.length(), beginGdOrdToken39T, GD_ORD_TOKEN_39_T_LEN);
  }

  /**
   * Update GdOrdToken39T with another Field from an offset and length
   *
   * @param value
   */
  public void setGdOrdToken39T(Field source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginGdOrdToken39T, GD_ORD_TOKEN_39_T_LEN);
  }

  /**
   * Update GdOrdToken39T with another Field from an offset and length to an offset and length
   *
   * @param value
   */
  public void setGdOrdToken39T(
      Field source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginGdOrdToken39T + targetIndex, targetLen);
  }

  public static int getGdOrdToken39FieldLength() {
    return GD_ORD_TOKEN_39_LENGTH;
  }
}
