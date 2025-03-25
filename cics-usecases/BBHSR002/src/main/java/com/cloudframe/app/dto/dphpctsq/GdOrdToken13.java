package com.cloudframe.app.dto.dphpctsq;

/**
 * The class GdOrdToken13 is used to handle fields declared in it
 *
 * @author CloudFrame Inc. created on 2025-03-25 at 08:30. using version 5.0.0.231
 */
import com.cloudframe.app.data.Field;
import com.cloudframe.app.dto.serialize.dphpctsq.*;
import com.cloudframe.app.exception.CFException;

public class GdOrdToken13 extends GdOrdToken13Serialized {

  private short gdOrdToken13L;

  private char[] gdOrdToken13T = Field.fillLowValue(515);

  /** Constructor for GdOrdToken13 */
  public GdOrdToken13() {
    // TO-DO auto generated code
  }

  /**
   * Constructor for GdOrdToken13. sets the parent value to the parent
   *
   * @param parent
   * @param begin
   */
  public GdOrdToken13(Field parent, int begin) {
    setParent(parent, begin);
  }

  /**
   * Returns the value of gdOrdToken13L
   *
   * @return gdOrdToken13L
   */
  public short getGdOrdToken13L() throws CFException {
    if (isGdOrdToken13LModified()) {
      gdOrdToken13L = refreshGdOrdToken13L();
    }
    return gdOrdToken13L;
  }

  /**
   * Update GdOrdToken13L with the passed value Corresponding COBOL Variable is GD-ORD-TOKEN-13-L
   *
   * @param number
   */
  public void setGdOrdToken13L(short number) {
    // Truncate if the number is beyond +/- Max range
    gdOrdToken13L = checkGdOrdToken13LMaxLimit(number);
    serializeGdOrdToken13L(gdOrdToken13L);
  }

  public void setGdOrdToken13L(int number) {
    number =
        checkGdOrdToken13LMaxLimit((short) number); // Truncate if value is beyond +/- Max range
    setGdOrdToken13L((short) number);
  }

  public void setGdOrdToken13L(long number) {
    number =
        checkGdOrdToken13LMaxLimit((short) number); // Truncate if value is beyond +/- Max range
    setGdOrdToken13L((short) number);
  }

  /**
   * Returns the value of gdOrdToken13T
   *
   * @return gdOrdToken13T
   */
  public char[] getGdOrdToken13T() throws CFException {
    if (isGdOrdToken13TModified()) {
      gdOrdToken13T = refreshGdOrdToken13T();
    }
    return gdOrdToken13T;
  }

  /**
   * set variable gdOrdToken13T Corresponding COBOL Variable is GD-ORD-TOKEN-13-T
   *
   * @param value
   */
  public void setGdOrdToken13T(char[] value) {
    gdOrdToken13T = checkGdOrdToken13TConstraints(value);
    serializeGdOrdToken13T(gdOrdToken13T);
  }

  /**
   * Update GdOrdToken13T with a char[] from an offset and length
   *
   * @param value
   */
  public void setGdOrdToken13T(char[] source, int sourceIndex) {
    replace(source, sourceIndex, source.length, beginGdOrdToken13T, gdOrdToken13T.length);
  }

  public void setGdOrdToken13T(char[] source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginGdOrdToken13T, gdOrdToken13T.length);
  }

  /**
   * Update GdOrdToken13T with a char[] from an offset and length to an offset and length
   *
   * @param value
   */
  public void setGdOrdToken13T(
      char[] source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginGdOrdToken13T + targetIndex, targetLen);
  }

  /**
   * Update GdOrdToken13T with another Field
   *
   * @param value
   */
  public void setGdOrdToken13T(Field source) {
    replace(source, 0, source.length(), beginGdOrdToken13T, GD_ORD_TOKEN_13_T_LEN);
  }

  /**
   * Update GdOrdToken13T with another Field from an offset and length
   *
   * @param value
   */
  public void setGdOrdToken13T(Field source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginGdOrdToken13T, GD_ORD_TOKEN_13_T_LEN);
  }

  /**
   * Update GdOrdToken13T with another Field from an offset and length to an offset and length
   *
   * @param value
   */
  public void setGdOrdToken13T(
      Field source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginGdOrdToken13T + targetIndex, targetLen);
  }

  public static int getGdOrdToken13FieldLength() {
    return GD_ORD_TOKEN_13_LENGTH;
  }
}
