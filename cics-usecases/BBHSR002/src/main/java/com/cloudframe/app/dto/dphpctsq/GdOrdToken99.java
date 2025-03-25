package com.cloudframe.app.dto.dphpctsq;

/**
 * The class GdOrdToken99 is used to handle fields declared in it
 *
 * @author CloudFrame Inc. created on 2025-03-25 at 08:30. using version 5.0.0.231
 */
import com.cloudframe.app.data.Field;
import com.cloudframe.app.dto.serialize.dphpctsq.*;
import com.cloudframe.app.exception.CFException;

public class GdOrdToken99 extends GdOrdToken99Serialized {

  private short gdOrdToken99L;

  private char[] gdOrdToken99T = Field.fillLowValue(515);

  /** Constructor for GdOrdToken99 */
  public GdOrdToken99() {
    // TO-DO auto generated code
  }

  /**
   * Constructor for GdOrdToken99. sets the parent value to the parent
   *
   * @param parent
   * @param begin
   */
  public GdOrdToken99(Field parent, int begin) {
    setParent(parent, begin);
  }

  /**
   * Returns the value of gdOrdToken99L
   *
   * @return gdOrdToken99L
   */
  public short getGdOrdToken99L() throws CFException {
    if (isGdOrdToken99LModified()) {
      gdOrdToken99L = refreshGdOrdToken99L();
    }
    return gdOrdToken99L;
  }

  /**
   * Update GdOrdToken99L with the passed value Corresponding COBOL Variable is GD-ORD-TOKEN-99-L
   *
   * @param number
   */
  public void setGdOrdToken99L(short number) {
    // Truncate if the number is beyond +/- Max range
    gdOrdToken99L = checkGdOrdToken99LMaxLimit(number);
    serializeGdOrdToken99L(gdOrdToken99L);
  }

  public void setGdOrdToken99L(int number) {
    number =
        checkGdOrdToken99LMaxLimit((short) number); // Truncate if value is beyond +/- Max range
    setGdOrdToken99L((short) number);
  }

  public void setGdOrdToken99L(long number) {
    number =
        checkGdOrdToken99LMaxLimit((short) number); // Truncate if value is beyond +/- Max range
    setGdOrdToken99L((short) number);
  }

  /**
   * Returns the value of gdOrdToken99T
   *
   * @return gdOrdToken99T
   */
  public char[] getGdOrdToken99T() throws CFException {
    if (isGdOrdToken99TModified()) {
      gdOrdToken99T = refreshGdOrdToken99T();
    }
    return gdOrdToken99T;
  }

  /**
   * set variable gdOrdToken99T Corresponding COBOL Variable is GD-ORD-TOKEN-99-T
   *
   * @param value
   */
  public void setGdOrdToken99T(char[] value) {
    gdOrdToken99T = checkGdOrdToken99TConstraints(value);
    serializeGdOrdToken99T(gdOrdToken99T);
  }

  /**
   * Update GdOrdToken99T with a char[] from an offset and length
   *
   * @param value
   */
  public void setGdOrdToken99T(char[] source, int sourceIndex) {
    replace(source, sourceIndex, source.length, beginGdOrdToken99T, gdOrdToken99T.length);
  }

  public void setGdOrdToken99T(char[] source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginGdOrdToken99T, gdOrdToken99T.length);
  }

  /**
   * Update GdOrdToken99T with a char[] from an offset and length to an offset and length
   *
   * @param value
   */
  public void setGdOrdToken99T(
      char[] source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginGdOrdToken99T + targetIndex, targetLen);
  }

  /**
   * Update GdOrdToken99T with another Field
   *
   * @param value
   */
  public void setGdOrdToken99T(Field source) {
    replace(source, 0, source.length(), beginGdOrdToken99T, GD_ORD_TOKEN_99_T_LEN);
  }

  /**
   * Update GdOrdToken99T with another Field from an offset and length
   *
   * @param value
   */
  public void setGdOrdToken99T(Field source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginGdOrdToken99T, GD_ORD_TOKEN_99_T_LEN);
  }

  /**
   * Update GdOrdToken99T with another Field from an offset and length to an offset and length
   *
   * @param value
   */
  public void setGdOrdToken99T(
      Field source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginGdOrdToken99T + targetIndex, targetLen);
  }

  public static int getGdOrdToken99FieldLength() {
    return GD_ORD_TOKEN_99_LENGTH;
  }
}
