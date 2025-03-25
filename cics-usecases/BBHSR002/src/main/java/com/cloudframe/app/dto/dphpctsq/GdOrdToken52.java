package com.cloudframe.app.dto.dphpctsq;

/**
 * The class GdOrdToken52 is used to handle fields declared in it
 *
 * @author CloudFrame Inc. created on 2025-03-25 at 08:30. using version 5.0.0.231
 */
import com.cloudframe.app.data.Field;
import com.cloudframe.app.dto.serialize.dphpctsq.*;
import com.cloudframe.app.exception.CFException;

public class GdOrdToken52 extends GdOrdToken52Serialized {

  private short gdOrdToken52L;

  private char[] gdOrdToken52T = Field.fillLowValue(515);

  /** Constructor for GdOrdToken52 */
  public GdOrdToken52() {
    // TO-DO auto generated code
  }

  /**
   * Constructor for GdOrdToken52. sets the parent value to the parent
   *
   * @param parent
   * @param begin
   */
  public GdOrdToken52(Field parent, int begin) {
    setParent(parent, begin);
  }

  /**
   * Returns the value of gdOrdToken52L
   *
   * @return gdOrdToken52L
   */
  public short getGdOrdToken52L() throws CFException {
    if (isGdOrdToken52LModified()) {
      gdOrdToken52L = refreshGdOrdToken52L();
    }
    return gdOrdToken52L;
  }

  /**
   * Update GdOrdToken52L with the passed value Corresponding COBOL Variable is GD-ORD-TOKEN-52-L
   *
   * @param number
   */
  public void setGdOrdToken52L(short number) {
    // Truncate if the number is beyond +/- Max range
    gdOrdToken52L = checkGdOrdToken52LMaxLimit(number);
    serializeGdOrdToken52L(gdOrdToken52L);
  }

  public void setGdOrdToken52L(int number) {
    number =
        checkGdOrdToken52LMaxLimit((short) number); // Truncate if value is beyond +/- Max range
    setGdOrdToken52L((short) number);
  }

  public void setGdOrdToken52L(long number) {
    number =
        checkGdOrdToken52LMaxLimit((short) number); // Truncate if value is beyond +/- Max range
    setGdOrdToken52L((short) number);
  }

  /**
   * Returns the value of gdOrdToken52T
   *
   * @return gdOrdToken52T
   */
  public char[] getGdOrdToken52T() throws CFException {
    if (isGdOrdToken52TModified()) {
      gdOrdToken52T = refreshGdOrdToken52T();
    }
    return gdOrdToken52T;
  }

  /**
   * set variable gdOrdToken52T Corresponding COBOL Variable is GD-ORD-TOKEN-52-T
   *
   * @param value
   */
  public void setGdOrdToken52T(char[] value) {
    gdOrdToken52T = checkGdOrdToken52TConstraints(value);
    serializeGdOrdToken52T(gdOrdToken52T);
  }

  /**
   * Update GdOrdToken52T with a char[] from an offset and length
   *
   * @param value
   */
  public void setGdOrdToken52T(char[] source, int sourceIndex) {
    replace(source, sourceIndex, source.length, beginGdOrdToken52T, gdOrdToken52T.length);
  }

  public void setGdOrdToken52T(char[] source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginGdOrdToken52T, gdOrdToken52T.length);
  }

  /**
   * Update GdOrdToken52T with a char[] from an offset and length to an offset and length
   *
   * @param value
   */
  public void setGdOrdToken52T(
      char[] source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginGdOrdToken52T + targetIndex, targetLen);
  }

  /**
   * Update GdOrdToken52T with another Field
   *
   * @param value
   */
  public void setGdOrdToken52T(Field source) {
    replace(source, 0, source.length(), beginGdOrdToken52T, GD_ORD_TOKEN_52_T_LEN);
  }

  /**
   * Update GdOrdToken52T with another Field from an offset and length
   *
   * @param value
   */
  public void setGdOrdToken52T(Field source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginGdOrdToken52T, GD_ORD_TOKEN_52_T_LEN);
  }

  /**
   * Update GdOrdToken52T with another Field from an offset and length to an offset and length
   *
   * @param value
   */
  public void setGdOrdToken52T(
      Field source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginGdOrdToken52T + targetIndex, targetLen);
  }

  public static int getGdOrdToken52FieldLength() {
    return GD_ORD_TOKEN_52_LENGTH;
  }
}
