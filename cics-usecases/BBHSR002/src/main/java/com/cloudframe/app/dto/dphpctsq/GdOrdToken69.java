package com.cloudframe.app.dto.dphpctsq;

/**
 * The class GdOrdToken69 is used to handle fields declared in it
 *
 * @author CloudFrame Inc. created on 2025-03-25 at 08:30. using version 5.0.0.231
 */
import com.cloudframe.app.data.Field;
import com.cloudframe.app.dto.serialize.dphpctsq.*;
import com.cloudframe.app.exception.CFException;

public class GdOrdToken69 extends GdOrdToken69Serialized {

  private short gdOrdToken69L;

  private char[] gdOrdToken69T = Field.fillLowValue(515);

  /** Constructor for GdOrdToken69 */
  public GdOrdToken69() {
    // TO-DO auto generated code
  }

  /**
   * Constructor for GdOrdToken69. sets the parent value to the parent
   *
   * @param parent
   * @param begin
   */
  public GdOrdToken69(Field parent, int begin) {
    setParent(parent, begin);
  }

  /**
   * Returns the value of gdOrdToken69L
   *
   * @return gdOrdToken69L
   */
  public short getGdOrdToken69L() throws CFException {
    if (isGdOrdToken69LModified()) {
      gdOrdToken69L = refreshGdOrdToken69L();
    }
    return gdOrdToken69L;
  }

  /**
   * Update GdOrdToken69L with the passed value Corresponding COBOL Variable is GD-ORD-TOKEN-69-L
   *
   * @param number
   */
  public void setGdOrdToken69L(short number) {
    // Truncate if the number is beyond +/- Max range
    gdOrdToken69L = checkGdOrdToken69LMaxLimit(number);
    serializeGdOrdToken69L(gdOrdToken69L);
  }

  public void setGdOrdToken69L(int number) {
    number =
        checkGdOrdToken69LMaxLimit((short) number); // Truncate if value is beyond +/- Max range
    setGdOrdToken69L((short) number);
  }

  public void setGdOrdToken69L(long number) {
    number =
        checkGdOrdToken69LMaxLimit((short) number); // Truncate if value is beyond +/- Max range
    setGdOrdToken69L((short) number);
  }

  /**
   * Returns the value of gdOrdToken69T
   *
   * @return gdOrdToken69T
   */
  public char[] getGdOrdToken69T() throws CFException {
    if (isGdOrdToken69TModified()) {
      gdOrdToken69T = refreshGdOrdToken69T();
    }
    return gdOrdToken69T;
  }

  /**
   * set variable gdOrdToken69T Corresponding COBOL Variable is GD-ORD-TOKEN-69-T
   *
   * @param value
   */
  public void setGdOrdToken69T(char[] value) {
    gdOrdToken69T = checkGdOrdToken69TConstraints(value);
    serializeGdOrdToken69T(gdOrdToken69T);
  }

  /**
   * Update GdOrdToken69T with a char[] from an offset and length
   *
   * @param value
   */
  public void setGdOrdToken69T(char[] source, int sourceIndex) {
    replace(source, sourceIndex, source.length, beginGdOrdToken69T, gdOrdToken69T.length);
  }

  public void setGdOrdToken69T(char[] source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginGdOrdToken69T, gdOrdToken69T.length);
  }

  /**
   * Update GdOrdToken69T with a char[] from an offset and length to an offset and length
   *
   * @param value
   */
  public void setGdOrdToken69T(
      char[] source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginGdOrdToken69T + targetIndex, targetLen);
  }

  /**
   * Update GdOrdToken69T with another Field
   *
   * @param value
   */
  public void setGdOrdToken69T(Field source) {
    replace(source, 0, source.length(), beginGdOrdToken69T, GD_ORD_TOKEN_69_T_LEN);
  }

  /**
   * Update GdOrdToken69T with another Field from an offset and length
   *
   * @param value
   */
  public void setGdOrdToken69T(Field source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginGdOrdToken69T, GD_ORD_TOKEN_69_T_LEN);
  }

  /**
   * Update GdOrdToken69T with another Field from an offset and length to an offset and length
   *
   * @param value
   */
  public void setGdOrdToken69T(
      Field source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginGdOrdToken69T + targetIndex, targetLen);
  }

  public static int getGdOrdToken69FieldLength() {
    return GD_ORD_TOKEN_69_LENGTH;
  }
}
