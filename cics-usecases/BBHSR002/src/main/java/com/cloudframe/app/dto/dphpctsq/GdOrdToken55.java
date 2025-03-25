package com.cloudframe.app.dto.dphpctsq;

/**
 * The class GdOrdToken55 is used to handle fields declared in it
 *
 * @author CloudFrame Inc. created on 2025-03-25 at 08:30. using version 5.0.0.231
 */
import com.cloudframe.app.data.Field;
import com.cloudframe.app.dto.serialize.dphpctsq.*;
import com.cloudframe.app.exception.CFException;

public class GdOrdToken55 extends GdOrdToken55Serialized {

  private short gdOrdToken55L;

  private char[] gdOrdToken55T = Field.fillLowValue(515);

  /** Constructor for GdOrdToken55 */
  public GdOrdToken55() {
    // TO-DO auto generated code
  }

  /**
   * Constructor for GdOrdToken55. sets the parent value to the parent
   *
   * @param parent
   * @param begin
   */
  public GdOrdToken55(Field parent, int begin) {
    setParent(parent, begin);
  }

  /**
   * Returns the value of gdOrdToken55L
   *
   * @return gdOrdToken55L
   */
  public short getGdOrdToken55L() throws CFException {
    if (isGdOrdToken55LModified()) {
      gdOrdToken55L = refreshGdOrdToken55L();
    }
    return gdOrdToken55L;
  }

  /**
   * Update GdOrdToken55L with the passed value Corresponding COBOL Variable is GD-ORD-TOKEN-55-L
   *
   * @param number
   */
  public void setGdOrdToken55L(short number) {
    // Truncate if the number is beyond +/- Max range
    gdOrdToken55L = checkGdOrdToken55LMaxLimit(number);
    serializeGdOrdToken55L(gdOrdToken55L);
  }

  public void setGdOrdToken55L(int number) {
    number =
        checkGdOrdToken55LMaxLimit((short) number); // Truncate if value is beyond +/- Max range
    setGdOrdToken55L((short) number);
  }

  public void setGdOrdToken55L(long number) {
    number =
        checkGdOrdToken55LMaxLimit((short) number); // Truncate if value is beyond +/- Max range
    setGdOrdToken55L((short) number);
  }

  /**
   * Returns the value of gdOrdToken55T
   *
   * @return gdOrdToken55T
   */
  public char[] getGdOrdToken55T() throws CFException {
    if (isGdOrdToken55TModified()) {
      gdOrdToken55T = refreshGdOrdToken55T();
    }
    return gdOrdToken55T;
  }

  /**
   * set variable gdOrdToken55T Corresponding COBOL Variable is GD-ORD-TOKEN-55-T
   *
   * @param value
   */
  public void setGdOrdToken55T(char[] value) {
    gdOrdToken55T = checkGdOrdToken55TConstraints(value);
    serializeGdOrdToken55T(gdOrdToken55T);
  }

  /**
   * Update GdOrdToken55T with a char[] from an offset and length
   *
   * @param value
   */
  public void setGdOrdToken55T(char[] source, int sourceIndex) {
    replace(source, sourceIndex, source.length, beginGdOrdToken55T, gdOrdToken55T.length);
  }

  public void setGdOrdToken55T(char[] source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginGdOrdToken55T, gdOrdToken55T.length);
  }

  /**
   * Update GdOrdToken55T with a char[] from an offset and length to an offset and length
   *
   * @param value
   */
  public void setGdOrdToken55T(
      char[] source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginGdOrdToken55T + targetIndex, targetLen);
  }

  /**
   * Update GdOrdToken55T with another Field
   *
   * @param value
   */
  public void setGdOrdToken55T(Field source) {
    replace(source, 0, source.length(), beginGdOrdToken55T, GD_ORD_TOKEN_55_T_LEN);
  }

  /**
   * Update GdOrdToken55T with another Field from an offset and length
   *
   * @param value
   */
  public void setGdOrdToken55T(Field source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginGdOrdToken55T, GD_ORD_TOKEN_55_T_LEN);
  }

  /**
   * Update GdOrdToken55T with another Field from an offset and length to an offset and length
   *
   * @param value
   */
  public void setGdOrdToken55T(
      Field source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginGdOrdToken55T + targetIndex, targetLen);
  }

  public static int getGdOrdToken55FieldLength() {
    return GD_ORD_TOKEN_55_LENGTH;
  }
}
