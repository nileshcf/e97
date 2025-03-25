package com.cloudframe.app.dto.dphpctsq;

/**
 * The class GdOrdToken42 is used to handle fields declared in it
 *
 * @author CloudFrame Inc. created on 2025-03-25 at 08:30. using version 5.0.0.231
 */
import com.cloudframe.app.data.Field;
import com.cloudframe.app.dto.serialize.dphpctsq.*;
import com.cloudframe.app.exception.CFException;

public class GdOrdToken42 extends GdOrdToken42Serialized {

  private short gdOrdToken42L;

  private char[] gdOrdToken42T = Field.fillLowValue(515);

  /** Constructor for GdOrdToken42 */
  public GdOrdToken42() {
    // TO-DO auto generated code
  }

  /**
   * Constructor for GdOrdToken42. sets the parent value to the parent
   *
   * @param parent
   * @param begin
   */
  public GdOrdToken42(Field parent, int begin) {
    setParent(parent, begin);
  }

  /**
   * Returns the value of gdOrdToken42L
   *
   * @return gdOrdToken42L
   */
  public short getGdOrdToken42L() throws CFException {
    if (isGdOrdToken42LModified()) {
      gdOrdToken42L = refreshGdOrdToken42L();
    }
    return gdOrdToken42L;
  }

  /**
   * Update GdOrdToken42L with the passed value Corresponding COBOL Variable is GD-ORD-TOKEN-42-L
   *
   * @param number
   */
  public void setGdOrdToken42L(short number) {
    // Truncate if the number is beyond +/- Max range
    gdOrdToken42L = checkGdOrdToken42LMaxLimit(number);
    serializeGdOrdToken42L(gdOrdToken42L);
  }

  public void setGdOrdToken42L(int number) {
    number =
        checkGdOrdToken42LMaxLimit((short) number); // Truncate if value is beyond +/- Max range
    setGdOrdToken42L((short) number);
  }

  public void setGdOrdToken42L(long number) {
    number =
        checkGdOrdToken42LMaxLimit((short) number); // Truncate if value is beyond +/- Max range
    setGdOrdToken42L((short) number);
  }

  /**
   * Returns the value of gdOrdToken42T
   *
   * @return gdOrdToken42T
   */
  public char[] getGdOrdToken42T() throws CFException {
    if (isGdOrdToken42TModified()) {
      gdOrdToken42T = refreshGdOrdToken42T();
    }
    return gdOrdToken42T;
  }

  /**
   * set variable gdOrdToken42T Corresponding COBOL Variable is GD-ORD-TOKEN-42-T
   *
   * @param value
   */
  public void setGdOrdToken42T(char[] value) {
    gdOrdToken42T = checkGdOrdToken42TConstraints(value);
    serializeGdOrdToken42T(gdOrdToken42T);
  }

  /**
   * Update GdOrdToken42T with a char[] from an offset and length
   *
   * @param value
   */
  public void setGdOrdToken42T(char[] source, int sourceIndex) {
    replace(source, sourceIndex, source.length, beginGdOrdToken42T, gdOrdToken42T.length);
  }

  public void setGdOrdToken42T(char[] source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginGdOrdToken42T, gdOrdToken42T.length);
  }

  /**
   * Update GdOrdToken42T with a char[] from an offset and length to an offset and length
   *
   * @param value
   */
  public void setGdOrdToken42T(
      char[] source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginGdOrdToken42T + targetIndex, targetLen);
  }

  /**
   * Update GdOrdToken42T with another Field
   *
   * @param value
   */
  public void setGdOrdToken42T(Field source) {
    replace(source, 0, source.length(), beginGdOrdToken42T, GD_ORD_TOKEN_42_T_LEN);
  }

  /**
   * Update GdOrdToken42T with another Field from an offset and length
   *
   * @param value
   */
  public void setGdOrdToken42T(Field source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginGdOrdToken42T, GD_ORD_TOKEN_42_T_LEN);
  }

  /**
   * Update GdOrdToken42T with another Field from an offset and length to an offset and length
   *
   * @param value
   */
  public void setGdOrdToken42T(
      Field source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginGdOrdToken42T + targetIndex, targetLen);
  }

  public static int getGdOrdToken42FieldLength() {
    return GD_ORD_TOKEN_42_LENGTH;
  }
}
