package com.cloudframe.app.dto.dphpctsq;

/**
 * The class GdOrdToken94 is used to handle fields declared in it
 *
 * @author CloudFrame Inc. created on 2025-03-25 at 08:30. using version 5.0.0.231
 */
import com.cloudframe.app.data.Field;
import com.cloudframe.app.dto.serialize.dphpctsq.*;
import com.cloudframe.app.exception.CFException;

public class GdOrdToken94 extends GdOrdToken94Serialized {

  private short gdOrdToken94L;

  private char[] gdOrdToken94T = Field.fillLowValue(515);

  /** Constructor for GdOrdToken94 */
  public GdOrdToken94() {
    // TO-DO auto generated code
  }

  /**
   * Constructor for GdOrdToken94. sets the parent value to the parent
   *
   * @param parent
   * @param begin
   */
  public GdOrdToken94(Field parent, int begin) {
    setParent(parent, begin);
  }

  /**
   * Returns the value of gdOrdToken94L
   *
   * @return gdOrdToken94L
   */
  public short getGdOrdToken94L() throws CFException {
    if (isGdOrdToken94LModified()) {
      gdOrdToken94L = refreshGdOrdToken94L();
    }
    return gdOrdToken94L;
  }

  /**
   * Update GdOrdToken94L with the passed value Corresponding COBOL Variable is GD-ORD-TOKEN-94-L
   *
   * @param number
   */
  public void setGdOrdToken94L(short number) {
    // Truncate if the number is beyond +/- Max range
    gdOrdToken94L = checkGdOrdToken94LMaxLimit(number);
    serializeGdOrdToken94L(gdOrdToken94L);
  }

  public void setGdOrdToken94L(int number) {
    number =
        checkGdOrdToken94LMaxLimit((short) number); // Truncate if value is beyond +/- Max range
    setGdOrdToken94L((short) number);
  }

  public void setGdOrdToken94L(long number) {
    number =
        checkGdOrdToken94LMaxLimit((short) number); // Truncate if value is beyond +/- Max range
    setGdOrdToken94L((short) number);
  }

  /**
   * Returns the value of gdOrdToken94T
   *
   * @return gdOrdToken94T
   */
  public char[] getGdOrdToken94T() throws CFException {
    if (isGdOrdToken94TModified()) {
      gdOrdToken94T = refreshGdOrdToken94T();
    }
    return gdOrdToken94T;
  }

  /**
   * set variable gdOrdToken94T Corresponding COBOL Variable is GD-ORD-TOKEN-94-T
   *
   * @param value
   */
  public void setGdOrdToken94T(char[] value) {
    gdOrdToken94T = checkGdOrdToken94TConstraints(value);
    serializeGdOrdToken94T(gdOrdToken94T);
  }

  /**
   * Update GdOrdToken94T with a char[] from an offset and length
   *
   * @param value
   */
  public void setGdOrdToken94T(char[] source, int sourceIndex) {
    replace(source, sourceIndex, source.length, beginGdOrdToken94T, gdOrdToken94T.length);
  }

  public void setGdOrdToken94T(char[] source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginGdOrdToken94T, gdOrdToken94T.length);
  }

  /**
   * Update GdOrdToken94T with a char[] from an offset and length to an offset and length
   *
   * @param value
   */
  public void setGdOrdToken94T(
      char[] source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginGdOrdToken94T + targetIndex, targetLen);
  }

  /**
   * Update GdOrdToken94T with another Field
   *
   * @param value
   */
  public void setGdOrdToken94T(Field source) {
    replace(source, 0, source.length(), beginGdOrdToken94T, GD_ORD_TOKEN_94_T_LEN);
  }

  /**
   * Update GdOrdToken94T with another Field from an offset and length
   *
   * @param value
   */
  public void setGdOrdToken94T(Field source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginGdOrdToken94T, GD_ORD_TOKEN_94_T_LEN);
  }

  /**
   * Update GdOrdToken94T with another Field from an offset and length to an offset and length
   *
   * @param value
   */
  public void setGdOrdToken94T(
      Field source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginGdOrdToken94T + targetIndex, targetLen);
  }

  public static int getGdOrdToken94FieldLength() {
    return GD_ORD_TOKEN_94_LENGTH;
  }
}
