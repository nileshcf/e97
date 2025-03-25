package com.cloudframe.app.dto.dphpctsq;

/**
 * The class GdOrdToken58 is used to handle fields declared in it
 *
 * @author CloudFrame Inc. created on 2025-03-25 at 08:30. using version 5.0.0.231
 */
import com.cloudframe.app.data.Field;
import com.cloudframe.app.dto.serialize.dphpctsq.*;
import com.cloudframe.app.exception.CFException;

public class GdOrdToken58 extends GdOrdToken58Serialized {

  private short gdOrdToken58L;

  private char[] gdOrdToken58T = Field.fillLowValue(515);

  /** Constructor for GdOrdToken58 */
  public GdOrdToken58() {
    // TO-DO auto generated code
  }

  /**
   * Constructor for GdOrdToken58. sets the parent value to the parent
   *
   * @param parent
   * @param begin
   */
  public GdOrdToken58(Field parent, int begin) {
    setParent(parent, begin);
  }

  /**
   * Returns the value of gdOrdToken58L
   *
   * @return gdOrdToken58L
   */
  public short getGdOrdToken58L() throws CFException {
    if (isGdOrdToken58LModified()) {
      gdOrdToken58L = refreshGdOrdToken58L();
    }
    return gdOrdToken58L;
  }

  /**
   * Update GdOrdToken58L with the passed value Corresponding COBOL Variable is GD-ORD-TOKEN-58-L
   *
   * @param number
   */
  public void setGdOrdToken58L(short number) {
    // Truncate if the number is beyond +/- Max range
    gdOrdToken58L = checkGdOrdToken58LMaxLimit(number);
    serializeGdOrdToken58L(gdOrdToken58L);
  }

  public void setGdOrdToken58L(int number) {
    number =
        checkGdOrdToken58LMaxLimit((short) number); // Truncate if value is beyond +/- Max range
    setGdOrdToken58L((short) number);
  }

  public void setGdOrdToken58L(long number) {
    number =
        checkGdOrdToken58LMaxLimit((short) number); // Truncate if value is beyond +/- Max range
    setGdOrdToken58L((short) number);
  }

  /**
   * Returns the value of gdOrdToken58T
   *
   * @return gdOrdToken58T
   */
  public char[] getGdOrdToken58T() throws CFException {
    if (isGdOrdToken58TModified()) {
      gdOrdToken58T = refreshGdOrdToken58T();
    }
    return gdOrdToken58T;
  }

  /**
   * set variable gdOrdToken58T Corresponding COBOL Variable is GD-ORD-TOKEN-58-T
   *
   * @param value
   */
  public void setGdOrdToken58T(char[] value) {
    gdOrdToken58T = checkGdOrdToken58TConstraints(value);
    serializeGdOrdToken58T(gdOrdToken58T);
  }

  /**
   * Update GdOrdToken58T with a char[] from an offset and length
   *
   * @param value
   */
  public void setGdOrdToken58T(char[] source, int sourceIndex) {
    replace(source, sourceIndex, source.length, beginGdOrdToken58T, gdOrdToken58T.length);
  }

  public void setGdOrdToken58T(char[] source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginGdOrdToken58T, gdOrdToken58T.length);
  }

  /**
   * Update GdOrdToken58T with a char[] from an offset and length to an offset and length
   *
   * @param value
   */
  public void setGdOrdToken58T(
      char[] source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginGdOrdToken58T + targetIndex, targetLen);
  }

  /**
   * Update GdOrdToken58T with another Field
   *
   * @param value
   */
  public void setGdOrdToken58T(Field source) {
    replace(source, 0, source.length(), beginGdOrdToken58T, GD_ORD_TOKEN_58_T_LEN);
  }

  /**
   * Update GdOrdToken58T with another Field from an offset and length
   *
   * @param value
   */
  public void setGdOrdToken58T(Field source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginGdOrdToken58T, GD_ORD_TOKEN_58_T_LEN);
  }

  /**
   * Update GdOrdToken58T with another Field from an offset and length to an offset and length
   *
   * @param value
   */
  public void setGdOrdToken58T(
      Field source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginGdOrdToken58T + targetIndex, targetLen);
  }

  public static int getGdOrdToken58FieldLength() {
    return GD_ORD_TOKEN_58_LENGTH;
  }
}
