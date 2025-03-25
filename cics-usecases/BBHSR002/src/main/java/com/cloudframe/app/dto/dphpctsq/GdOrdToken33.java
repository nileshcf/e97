package com.cloudframe.app.dto.dphpctsq;

/**
 * The class GdOrdToken33 is used to handle fields declared in it
 *
 * @author CloudFrame Inc. created on 2025-03-25 at 08:30. using version 5.0.0.231
 */
import com.cloudframe.app.data.Field;
import com.cloudframe.app.dto.serialize.dphpctsq.*;
import com.cloudframe.app.exception.CFException;

public class GdOrdToken33 extends GdOrdToken33Serialized {

  private short gdOrdToken33L;

  private char[] gdOrdToken33T = Field.fillLowValue(515);

  /** Constructor for GdOrdToken33 */
  public GdOrdToken33() {
    // TO-DO auto generated code
  }

  /**
   * Constructor for GdOrdToken33. sets the parent value to the parent
   *
   * @param parent
   * @param begin
   */
  public GdOrdToken33(Field parent, int begin) {
    setParent(parent, begin);
  }

  /**
   * Returns the value of gdOrdToken33L
   *
   * @return gdOrdToken33L
   */
  public short getGdOrdToken33L() throws CFException {
    if (isGdOrdToken33LModified()) {
      gdOrdToken33L = refreshGdOrdToken33L();
    }
    return gdOrdToken33L;
  }

  /**
   * Update GdOrdToken33L with the passed value Corresponding COBOL Variable is GD-ORD-TOKEN-33-L
   *
   * @param number
   */
  public void setGdOrdToken33L(short number) {
    // Truncate if the number is beyond +/- Max range
    gdOrdToken33L = checkGdOrdToken33LMaxLimit(number);
    serializeGdOrdToken33L(gdOrdToken33L);
  }

  public void setGdOrdToken33L(int number) {
    number =
        checkGdOrdToken33LMaxLimit((short) number); // Truncate if value is beyond +/- Max range
    setGdOrdToken33L((short) number);
  }

  public void setGdOrdToken33L(long number) {
    number =
        checkGdOrdToken33LMaxLimit((short) number); // Truncate if value is beyond +/- Max range
    setGdOrdToken33L((short) number);
  }

  /**
   * Returns the value of gdOrdToken33T
   *
   * @return gdOrdToken33T
   */
  public char[] getGdOrdToken33T() throws CFException {
    if (isGdOrdToken33TModified()) {
      gdOrdToken33T = refreshGdOrdToken33T();
    }
    return gdOrdToken33T;
  }

  /**
   * set variable gdOrdToken33T Corresponding COBOL Variable is GD-ORD-TOKEN-33-T
   *
   * @param value
   */
  public void setGdOrdToken33T(char[] value) {
    gdOrdToken33T = checkGdOrdToken33TConstraints(value);
    serializeGdOrdToken33T(gdOrdToken33T);
  }

  /**
   * Update GdOrdToken33T with a char[] from an offset and length
   *
   * @param value
   */
  public void setGdOrdToken33T(char[] source, int sourceIndex) {
    replace(source, sourceIndex, source.length, beginGdOrdToken33T, gdOrdToken33T.length);
  }

  public void setGdOrdToken33T(char[] source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginGdOrdToken33T, gdOrdToken33T.length);
  }

  /**
   * Update GdOrdToken33T with a char[] from an offset and length to an offset and length
   *
   * @param value
   */
  public void setGdOrdToken33T(
      char[] source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginGdOrdToken33T + targetIndex, targetLen);
  }

  /**
   * Update GdOrdToken33T with another Field
   *
   * @param value
   */
  public void setGdOrdToken33T(Field source) {
    replace(source, 0, source.length(), beginGdOrdToken33T, GD_ORD_TOKEN_33_T_LEN);
  }

  /**
   * Update GdOrdToken33T with another Field from an offset and length
   *
   * @param value
   */
  public void setGdOrdToken33T(Field source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginGdOrdToken33T, GD_ORD_TOKEN_33_T_LEN);
  }

  /**
   * Update GdOrdToken33T with another Field from an offset and length to an offset and length
   *
   * @param value
   */
  public void setGdOrdToken33T(
      Field source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginGdOrdToken33T + targetIndex, targetLen);
  }

  public static int getGdOrdToken33FieldLength() {
    return GD_ORD_TOKEN_33_LENGTH;
  }
}
