package com.cloudframe.app.dto.dphpctsq;

/**
 * The class GdOrdToken75 is used to handle fields declared in it
 *
 * @author CloudFrame Inc. created on 2025-03-25 at 08:30. using version 5.0.0.231
 */
import com.cloudframe.app.data.Field;
import com.cloudframe.app.dto.serialize.dphpctsq.*;
import com.cloudframe.app.exception.CFException;

public class GdOrdToken75 extends GdOrdToken75Serialized {

  private short gdOrdToken75L;

  private char[] gdOrdToken75T = Field.fillLowValue(515);

  /** Constructor for GdOrdToken75 */
  public GdOrdToken75() {
    // TO-DO auto generated code
  }

  /**
   * Constructor for GdOrdToken75. sets the parent value to the parent
   *
   * @param parent
   * @param begin
   */
  public GdOrdToken75(Field parent, int begin) {
    setParent(parent, begin);
  }

  /**
   * Returns the value of gdOrdToken75L
   *
   * @return gdOrdToken75L
   */
  public short getGdOrdToken75L() throws CFException {
    if (isGdOrdToken75LModified()) {
      gdOrdToken75L = refreshGdOrdToken75L();
    }
    return gdOrdToken75L;
  }

  /**
   * Update GdOrdToken75L with the passed value Corresponding COBOL Variable is GD-ORD-TOKEN-75-L
   *
   * @param number
   */
  public void setGdOrdToken75L(short number) {
    // Truncate if the number is beyond +/- Max range
    gdOrdToken75L = checkGdOrdToken75LMaxLimit(number);
    serializeGdOrdToken75L(gdOrdToken75L);
  }

  public void setGdOrdToken75L(int number) {
    number =
        checkGdOrdToken75LMaxLimit((short) number); // Truncate if value is beyond +/- Max range
    setGdOrdToken75L((short) number);
  }

  public void setGdOrdToken75L(long number) {
    number =
        checkGdOrdToken75LMaxLimit((short) number); // Truncate if value is beyond +/- Max range
    setGdOrdToken75L((short) number);
  }

  /**
   * Returns the value of gdOrdToken75T
   *
   * @return gdOrdToken75T
   */
  public char[] getGdOrdToken75T() throws CFException {
    if (isGdOrdToken75TModified()) {
      gdOrdToken75T = refreshGdOrdToken75T();
    }
    return gdOrdToken75T;
  }

  /**
   * set variable gdOrdToken75T Corresponding COBOL Variable is GD-ORD-TOKEN-75-T
   *
   * @param value
   */
  public void setGdOrdToken75T(char[] value) {
    gdOrdToken75T = checkGdOrdToken75TConstraints(value);
    serializeGdOrdToken75T(gdOrdToken75T);
  }

  /**
   * Update GdOrdToken75T with a char[] from an offset and length
   *
   * @param value
   */
  public void setGdOrdToken75T(char[] source, int sourceIndex) {
    replace(source, sourceIndex, source.length, beginGdOrdToken75T, gdOrdToken75T.length);
  }

  public void setGdOrdToken75T(char[] source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginGdOrdToken75T, gdOrdToken75T.length);
  }

  /**
   * Update GdOrdToken75T with a char[] from an offset and length to an offset and length
   *
   * @param value
   */
  public void setGdOrdToken75T(
      char[] source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginGdOrdToken75T + targetIndex, targetLen);
  }

  /**
   * Update GdOrdToken75T with another Field
   *
   * @param value
   */
  public void setGdOrdToken75T(Field source) {
    replace(source, 0, source.length(), beginGdOrdToken75T, GD_ORD_TOKEN_75_T_LEN);
  }

  /**
   * Update GdOrdToken75T with another Field from an offset and length
   *
   * @param value
   */
  public void setGdOrdToken75T(Field source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginGdOrdToken75T, GD_ORD_TOKEN_75_T_LEN);
  }

  /**
   * Update GdOrdToken75T with another Field from an offset and length to an offset and length
   *
   * @param value
   */
  public void setGdOrdToken75T(
      Field source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginGdOrdToken75T + targetIndex, targetLen);
  }

  public static int getGdOrdToken75FieldLength() {
    return GD_ORD_TOKEN_75_LENGTH;
  }
}
