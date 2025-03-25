package com.cloudframe.app.dto.dphpctsq;

/**
 * The class GdOrdToken41 is used to handle fields declared in it
 *
 * @author CloudFrame Inc. created on 2025-03-25 at 08:30. using version 5.0.0.231
 */
import com.cloudframe.app.data.Field;
import com.cloudframe.app.dto.serialize.dphpctsq.*;
import com.cloudframe.app.exception.CFException;

public class GdOrdToken41 extends GdOrdToken41Serialized {

  private short gdOrdToken41L;

  private char[] gdOrdToken41T = Field.fillLowValue(515);

  /** Constructor for GdOrdToken41 */
  public GdOrdToken41() {
    // TO-DO auto generated code
  }

  /**
   * Constructor for GdOrdToken41. sets the parent value to the parent
   *
   * @param parent
   * @param begin
   */
  public GdOrdToken41(Field parent, int begin) {
    setParent(parent, begin);
  }

  /**
   * Returns the value of gdOrdToken41L
   *
   * @return gdOrdToken41L
   */
  public short getGdOrdToken41L() throws CFException {
    if (isGdOrdToken41LModified()) {
      gdOrdToken41L = refreshGdOrdToken41L();
    }
    return gdOrdToken41L;
  }

  /**
   * Update GdOrdToken41L with the passed value Corresponding COBOL Variable is GD-ORD-TOKEN-41-L
   *
   * @param number
   */
  public void setGdOrdToken41L(short number) {
    // Truncate if the number is beyond +/- Max range
    gdOrdToken41L = checkGdOrdToken41LMaxLimit(number);
    serializeGdOrdToken41L(gdOrdToken41L);
  }

  public void setGdOrdToken41L(int number) {
    number =
        checkGdOrdToken41LMaxLimit((short) number); // Truncate if value is beyond +/- Max range
    setGdOrdToken41L((short) number);
  }

  public void setGdOrdToken41L(long number) {
    number =
        checkGdOrdToken41LMaxLimit((short) number); // Truncate if value is beyond +/- Max range
    setGdOrdToken41L((short) number);
  }

  /**
   * Returns the value of gdOrdToken41T
   *
   * @return gdOrdToken41T
   */
  public char[] getGdOrdToken41T() throws CFException {
    if (isGdOrdToken41TModified()) {
      gdOrdToken41T = refreshGdOrdToken41T();
    }
    return gdOrdToken41T;
  }

  /**
   * set variable gdOrdToken41T Corresponding COBOL Variable is GD-ORD-TOKEN-41-T
   *
   * @param value
   */
  public void setGdOrdToken41T(char[] value) {
    gdOrdToken41T = checkGdOrdToken41TConstraints(value);
    serializeGdOrdToken41T(gdOrdToken41T);
  }

  /**
   * Update GdOrdToken41T with a char[] from an offset and length
   *
   * @param value
   */
  public void setGdOrdToken41T(char[] source, int sourceIndex) {
    replace(source, sourceIndex, source.length, beginGdOrdToken41T, gdOrdToken41T.length);
  }

  public void setGdOrdToken41T(char[] source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginGdOrdToken41T, gdOrdToken41T.length);
  }

  /**
   * Update GdOrdToken41T with a char[] from an offset and length to an offset and length
   *
   * @param value
   */
  public void setGdOrdToken41T(
      char[] source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginGdOrdToken41T + targetIndex, targetLen);
  }

  /**
   * Update GdOrdToken41T with another Field
   *
   * @param value
   */
  public void setGdOrdToken41T(Field source) {
    replace(source, 0, source.length(), beginGdOrdToken41T, GD_ORD_TOKEN_41_T_LEN);
  }

  /**
   * Update GdOrdToken41T with another Field from an offset and length
   *
   * @param value
   */
  public void setGdOrdToken41T(Field source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginGdOrdToken41T, GD_ORD_TOKEN_41_T_LEN);
  }

  /**
   * Update GdOrdToken41T with another Field from an offset and length to an offset and length
   *
   * @param value
   */
  public void setGdOrdToken41T(
      Field source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginGdOrdToken41T + targetIndex, targetLen);
  }

  public static int getGdOrdToken41FieldLength() {
    return GD_ORD_TOKEN_41_LENGTH;
  }
}
