package com.cloudframe.app.dto.dphpctsq;

/**
 * The class GdOrdToken86 is used to handle fields declared in it
 *
 * @author CloudFrame Inc. created on 2025-03-25 at 08:30. using version 5.0.0.231
 */
import com.cloudframe.app.data.Field;
import com.cloudframe.app.dto.serialize.dphpctsq.*;
import com.cloudframe.app.exception.CFException;

public class GdOrdToken86 extends GdOrdToken86Serialized {

  private short gdOrdToken86L;

  private char[] gdOrdToken86T = Field.fillLowValue(515);

  /** Constructor for GdOrdToken86 */
  public GdOrdToken86() {
    // TO-DO auto generated code
  }

  /**
   * Constructor for GdOrdToken86. sets the parent value to the parent
   *
   * @param parent
   * @param begin
   */
  public GdOrdToken86(Field parent, int begin) {
    setParent(parent, begin);
  }

  /**
   * Returns the value of gdOrdToken86L
   *
   * @return gdOrdToken86L
   */
  public short getGdOrdToken86L() throws CFException {
    if (isGdOrdToken86LModified()) {
      gdOrdToken86L = refreshGdOrdToken86L();
    }
    return gdOrdToken86L;
  }

  /**
   * Update GdOrdToken86L with the passed value Corresponding COBOL Variable is GD-ORD-TOKEN-86-L
   *
   * @param number
   */
  public void setGdOrdToken86L(short number) {
    // Truncate if the number is beyond +/- Max range
    gdOrdToken86L = checkGdOrdToken86LMaxLimit(number);
    serializeGdOrdToken86L(gdOrdToken86L);
  }

  public void setGdOrdToken86L(int number) {
    number =
        checkGdOrdToken86LMaxLimit((short) number); // Truncate if value is beyond +/- Max range
    setGdOrdToken86L((short) number);
  }

  public void setGdOrdToken86L(long number) {
    number =
        checkGdOrdToken86LMaxLimit((short) number); // Truncate if value is beyond +/- Max range
    setGdOrdToken86L((short) number);
  }

  /**
   * Returns the value of gdOrdToken86T
   *
   * @return gdOrdToken86T
   */
  public char[] getGdOrdToken86T() throws CFException {
    if (isGdOrdToken86TModified()) {
      gdOrdToken86T = refreshGdOrdToken86T();
    }
    return gdOrdToken86T;
  }

  /**
   * set variable gdOrdToken86T Corresponding COBOL Variable is GD-ORD-TOKEN-86-T
   *
   * @param value
   */
  public void setGdOrdToken86T(char[] value) {
    gdOrdToken86T = checkGdOrdToken86TConstraints(value);
    serializeGdOrdToken86T(gdOrdToken86T);
  }

  /**
   * Update GdOrdToken86T with a char[] from an offset and length
   *
   * @param value
   */
  public void setGdOrdToken86T(char[] source, int sourceIndex) {
    replace(source, sourceIndex, source.length, beginGdOrdToken86T, gdOrdToken86T.length);
  }

  public void setGdOrdToken86T(char[] source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginGdOrdToken86T, gdOrdToken86T.length);
  }

  /**
   * Update GdOrdToken86T with a char[] from an offset and length to an offset and length
   *
   * @param value
   */
  public void setGdOrdToken86T(
      char[] source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginGdOrdToken86T + targetIndex, targetLen);
  }

  /**
   * Update GdOrdToken86T with another Field
   *
   * @param value
   */
  public void setGdOrdToken86T(Field source) {
    replace(source, 0, source.length(), beginGdOrdToken86T, GD_ORD_TOKEN_86_T_LEN);
  }

  /**
   * Update GdOrdToken86T with another Field from an offset and length
   *
   * @param value
   */
  public void setGdOrdToken86T(Field source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginGdOrdToken86T, GD_ORD_TOKEN_86_T_LEN);
  }

  /**
   * Update GdOrdToken86T with another Field from an offset and length to an offset and length
   *
   * @param value
   */
  public void setGdOrdToken86T(
      Field source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginGdOrdToken86T + targetIndex, targetLen);
  }

  public static int getGdOrdToken86FieldLength() {
    return GD_ORD_TOKEN_86_LENGTH;
  }
}
