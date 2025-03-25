package com.cloudframe.app.dto.dphpctsq;

/**
 * The class GdOrdToken43 is used to handle fields declared in it
 *
 * @author CloudFrame Inc. created on 2025-03-25 at 08:30. using version 5.0.0.231
 */
import com.cloudframe.app.data.Field;
import com.cloudframe.app.dto.serialize.dphpctsq.*;
import com.cloudframe.app.exception.CFException;

public class GdOrdToken43 extends GdOrdToken43Serialized {

  private short gdOrdToken43L;

  private char[] gdOrdToken43T = Field.fillLowValue(515);

  /** Constructor for GdOrdToken43 */
  public GdOrdToken43() {
    // TO-DO auto generated code
  }

  /**
   * Constructor for GdOrdToken43. sets the parent value to the parent
   *
   * @param parent
   * @param begin
   */
  public GdOrdToken43(Field parent, int begin) {
    setParent(parent, begin);
  }

  /**
   * Returns the value of gdOrdToken43L
   *
   * @return gdOrdToken43L
   */
  public short getGdOrdToken43L() throws CFException {
    if (isGdOrdToken43LModified()) {
      gdOrdToken43L = refreshGdOrdToken43L();
    }
    return gdOrdToken43L;
  }

  /**
   * Update GdOrdToken43L with the passed value Corresponding COBOL Variable is GD-ORD-TOKEN-43-L
   *
   * @param number
   */
  public void setGdOrdToken43L(short number) {
    // Truncate if the number is beyond +/- Max range
    gdOrdToken43L = checkGdOrdToken43LMaxLimit(number);
    serializeGdOrdToken43L(gdOrdToken43L);
  }

  public void setGdOrdToken43L(int number) {
    number =
        checkGdOrdToken43LMaxLimit((short) number); // Truncate if value is beyond +/- Max range
    setGdOrdToken43L((short) number);
  }

  public void setGdOrdToken43L(long number) {
    number =
        checkGdOrdToken43LMaxLimit((short) number); // Truncate if value is beyond +/- Max range
    setGdOrdToken43L((short) number);
  }

  /**
   * Returns the value of gdOrdToken43T
   *
   * @return gdOrdToken43T
   */
  public char[] getGdOrdToken43T() throws CFException {
    if (isGdOrdToken43TModified()) {
      gdOrdToken43T = refreshGdOrdToken43T();
    }
    return gdOrdToken43T;
  }

  /**
   * set variable gdOrdToken43T Corresponding COBOL Variable is GD-ORD-TOKEN-43-T
   *
   * @param value
   */
  public void setGdOrdToken43T(char[] value) {
    gdOrdToken43T = checkGdOrdToken43TConstraints(value);
    serializeGdOrdToken43T(gdOrdToken43T);
  }

  /**
   * Update GdOrdToken43T with a char[] from an offset and length
   *
   * @param value
   */
  public void setGdOrdToken43T(char[] source, int sourceIndex) {
    replace(source, sourceIndex, source.length, beginGdOrdToken43T, gdOrdToken43T.length);
  }

  public void setGdOrdToken43T(char[] source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginGdOrdToken43T, gdOrdToken43T.length);
  }

  /**
   * Update GdOrdToken43T with a char[] from an offset and length to an offset and length
   *
   * @param value
   */
  public void setGdOrdToken43T(
      char[] source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginGdOrdToken43T + targetIndex, targetLen);
  }

  /**
   * Update GdOrdToken43T with another Field
   *
   * @param value
   */
  public void setGdOrdToken43T(Field source) {
    replace(source, 0, source.length(), beginGdOrdToken43T, GD_ORD_TOKEN_43_T_LEN);
  }

  /**
   * Update GdOrdToken43T with another Field from an offset and length
   *
   * @param value
   */
  public void setGdOrdToken43T(Field source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginGdOrdToken43T, GD_ORD_TOKEN_43_T_LEN);
  }

  /**
   * Update GdOrdToken43T with another Field from an offset and length to an offset and length
   *
   * @param value
   */
  public void setGdOrdToken43T(
      Field source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginGdOrdToken43T + targetIndex, targetLen);
  }

  public static int getGdOrdToken43FieldLength() {
    return GD_ORD_TOKEN_43_LENGTH;
  }
}
