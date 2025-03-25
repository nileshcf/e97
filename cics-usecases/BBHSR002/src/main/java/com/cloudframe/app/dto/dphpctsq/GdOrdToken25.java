package com.cloudframe.app.dto.dphpctsq;

/**
 * The class GdOrdToken25 is used to handle fields declared in it
 *
 * @author CloudFrame Inc. created on 2025-03-25 at 08:30. using version 5.0.0.231
 */
import com.cloudframe.app.data.Field;
import com.cloudframe.app.dto.serialize.dphpctsq.*;
import com.cloudframe.app.exception.CFException;

public class GdOrdToken25 extends GdOrdToken25Serialized {

  private short gdOrdToken25L;

  private char[] gdOrdToken25T = Field.fillLowValue(515);

  /** Constructor for GdOrdToken25 */
  public GdOrdToken25() {
    // TO-DO auto generated code
  }

  /**
   * Constructor for GdOrdToken25. sets the parent value to the parent
   *
   * @param parent
   * @param begin
   */
  public GdOrdToken25(Field parent, int begin) {
    setParent(parent, begin);
  }

  /**
   * Returns the value of gdOrdToken25L
   *
   * @return gdOrdToken25L
   */
  public short getGdOrdToken25L() throws CFException {
    if (isGdOrdToken25LModified()) {
      gdOrdToken25L = refreshGdOrdToken25L();
    }
    return gdOrdToken25L;
  }

  /**
   * Update GdOrdToken25L with the passed value Corresponding COBOL Variable is GD-ORD-TOKEN-25-L
   *
   * @param number
   */
  public void setGdOrdToken25L(short number) {
    // Truncate if the number is beyond +/- Max range
    gdOrdToken25L = checkGdOrdToken25LMaxLimit(number);
    serializeGdOrdToken25L(gdOrdToken25L);
  }

  public void setGdOrdToken25L(int number) {
    number =
        checkGdOrdToken25LMaxLimit((short) number); // Truncate if value is beyond +/- Max range
    setGdOrdToken25L((short) number);
  }

  public void setGdOrdToken25L(long number) {
    number =
        checkGdOrdToken25LMaxLimit((short) number); // Truncate if value is beyond +/- Max range
    setGdOrdToken25L((short) number);
  }

  /**
   * Returns the value of gdOrdToken25T
   *
   * @return gdOrdToken25T
   */
  public char[] getGdOrdToken25T() throws CFException {
    if (isGdOrdToken25TModified()) {
      gdOrdToken25T = refreshGdOrdToken25T();
    }
    return gdOrdToken25T;
  }

  /**
   * set variable gdOrdToken25T Corresponding COBOL Variable is GD-ORD-TOKEN-25-T
   *
   * @param value
   */
  public void setGdOrdToken25T(char[] value) {
    gdOrdToken25T = checkGdOrdToken25TConstraints(value);
    serializeGdOrdToken25T(gdOrdToken25T);
  }

  /**
   * Update GdOrdToken25T with a char[] from an offset and length
   *
   * @param value
   */
  public void setGdOrdToken25T(char[] source, int sourceIndex) {
    replace(source, sourceIndex, source.length, beginGdOrdToken25T, gdOrdToken25T.length);
  }

  public void setGdOrdToken25T(char[] source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginGdOrdToken25T, gdOrdToken25T.length);
  }

  /**
   * Update GdOrdToken25T with a char[] from an offset and length to an offset and length
   *
   * @param value
   */
  public void setGdOrdToken25T(
      char[] source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginGdOrdToken25T + targetIndex, targetLen);
  }

  /**
   * Update GdOrdToken25T with another Field
   *
   * @param value
   */
  public void setGdOrdToken25T(Field source) {
    replace(source, 0, source.length(), beginGdOrdToken25T, GD_ORD_TOKEN_25_T_LEN);
  }

  /**
   * Update GdOrdToken25T with another Field from an offset and length
   *
   * @param value
   */
  public void setGdOrdToken25T(Field source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginGdOrdToken25T, GD_ORD_TOKEN_25_T_LEN);
  }

  /**
   * Update GdOrdToken25T with another Field from an offset and length to an offset and length
   *
   * @param value
   */
  public void setGdOrdToken25T(
      Field source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginGdOrdToken25T + targetIndex, targetLen);
  }

  public static int getGdOrdToken25FieldLength() {
    return GD_ORD_TOKEN_25_LENGTH;
  }
}
