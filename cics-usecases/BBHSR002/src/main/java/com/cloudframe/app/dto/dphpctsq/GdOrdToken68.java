package com.cloudframe.app.dto.dphpctsq;

/**
 * The class GdOrdToken68 is used to handle fields declared in it
 *
 * @author CloudFrame Inc. created on 2025-03-25 at 08:30. using version 5.0.0.231
 */
import com.cloudframe.app.data.Field;
import com.cloudframe.app.dto.serialize.dphpctsq.*;
import com.cloudframe.app.exception.CFException;

public class GdOrdToken68 extends GdOrdToken68Serialized {

  private short gdOrdToken68L;

  private char[] gdOrdToken68T = Field.fillLowValue(515);

  /** Constructor for GdOrdToken68 */
  public GdOrdToken68() {
    // TO-DO auto generated code
  }

  /**
   * Constructor for GdOrdToken68. sets the parent value to the parent
   *
   * @param parent
   * @param begin
   */
  public GdOrdToken68(Field parent, int begin) {
    setParent(parent, begin);
  }

  /**
   * Returns the value of gdOrdToken68L
   *
   * @return gdOrdToken68L
   */
  public short getGdOrdToken68L() throws CFException {
    if (isGdOrdToken68LModified()) {
      gdOrdToken68L = refreshGdOrdToken68L();
    }
    return gdOrdToken68L;
  }

  /**
   * Update GdOrdToken68L with the passed value Corresponding COBOL Variable is GD-ORD-TOKEN-68-L
   *
   * @param number
   */
  public void setGdOrdToken68L(short number) {
    // Truncate if the number is beyond +/- Max range
    gdOrdToken68L = checkGdOrdToken68LMaxLimit(number);
    serializeGdOrdToken68L(gdOrdToken68L);
  }

  public void setGdOrdToken68L(int number) {
    number =
        checkGdOrdToken68LMaxLimit((short) number); // Truncate if value is beyond +/- Max range
    setGdOrdToken68L((short) number);
  }

  public void setGdOrdToken68L(long number) {
    number =
        checkGdOrdToken68LMaxLimit((short) number); // Truncate if value is beyond +/- Max range
    setGdOrdToken68L((short) number);
  }

  /**
   * Returns the value of gdOrdToken68T
   *
   * @return gdOrdToken68T
   */
  public char[] getGdOrdToken68T() throws CFException {
    if (isGdOrdToken68TModified()) {
      gdOrdToken68T = refreshGdOrdToken68T();
    }
    return gdOrdToken68T;
  }

  /**
   * set variable gdOrdToken68T Corresponding COBOL Variable is GD-ORD-TOKEN-68-T
   *
   * @param value
   */
  public void setGdOrdToken68T(char[] value) {
    gdOrdToken68T = checkGdOrdToken68TConstraints(value);
    serializeGdOrdToken68T(gdOrdToken68T);
  }

  /**
   * Update GdOrdToken68T with a char[] from an offset and length
   *
   * @param value
   */
  public void setGdOrdToken68T(char[] source, int sourceIndex) {
    replace(source, sourceIndex, source.length, beginGdOrdToken68T, gdOrdToken68T.length);
  }

  public void setGdOrdToken68T(char[] source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginGdOrdToken68T, gdOrdToken68T.length);
  }

  /**
   * Update GdOrdToken68T with a char[] from an offset and length to an offset and length
   *
   * @param value
   */
  public void setGdOrdToken68T(
      char[] source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginGdOrdToken68T + targetIndex, targetLen);
  }

  /**
   * Update GdOrdToken68T with another Field
   *
   * @param value
   */
  public void setGdOrdToken68T(Field source) {
    replace(source, 0, source.length(), beginGdOrdToken68T, GD_ORD_TOKEN_68_T_LEN);
  }

  /**
   * Update GdOrdToken68T with another Field from an offset and length
   *
   * @param value
   */
  public void setGdOrdToken68T(Field source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginGdOrdToken68T, GD_ORD_TOKEN_68_T_LEN);
  }

  /**
   * Update GdOrdToken68T with another Field from an offset and length to an offset and length
   *
   * @param value
   */
  public void setGdOrdToken68T(
      Field source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginGdOrdToken68T + targetIndex, targetLen);
  }

  public static int getGdOrdToken68FieldLength() {
    return GD_ORD_TOKEN_68_LENGTH;
  }
}
