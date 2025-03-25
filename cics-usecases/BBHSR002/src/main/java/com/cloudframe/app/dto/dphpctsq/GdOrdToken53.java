package com.cloudframe.app.dto.dphpctsq;

/**
 * The class GdOrdToken53 is used to handle fields declared in it
 *
 * @author CloudFrame Inc. created on 2025-03-25 at 08:30. using version 5.0.0.231
 */
import com.cloudframe.app.data.Field;
import com.cloudframe.app.dto.serialize.dphpctsq.*;
import com.cloudframe.app.exception.CFException;

public class GdOrdToken53 extends GdOrdToken53Serialized {

  private short gdOrdToken53L;

  private char[] gdOrdToken53T = Field.fillLowValue(515);

  /** Constructor for GdOrdToken53 */
  public GdOrdToken53() {
    // TO-DO auto generated code
  }

  /**
   * Constructor for GdOrdToken53. sets the parent value to the parent
   *
   * @param parent
   * @param begin
   */
  public GdOrdToken53(Field parent, int begin) {
    setParent(parent, begin);
  }

  /**
   * Returns the value of gdOrdToken53L
   *
   * @return gdOrdToken53L
   */
  public short getGdOrdToken53L() throws CFException {
    if (isGdOrdToken53LModified()) {
      gdOrdToken53L = refreshGdOrdToken53L();
    }
    return gdOrdToken53L;
  }

  /**
   * Update GdOrdToken53L with the passed value Corresponding COBOL Variable is GD-ORD-TOKEN-53-L
   *
   * @param number
   */
  public void setGdOrdToken53L(short number) {
    // Truncate if the number is beyond +/- Max range
    gdOrdToken53L = checkGdOrdToken53LMaxLimit(number);
    serializeGdOrdToken53L(gdOrdToken53L);
  }

  public void setGdOrdToken53L(int number) {
    number =
        checkGdOrdToken53LMaxLimit((short) number); // Truncate if value is beyond +/- Max range
    setGdOrdToken53L((short) number);
  }

  public void setGdOrdToken53L(long number) {
    number =
        checkGdOrdToken53LMaxLimit((short) number); // Truncate if value is beyond +/- Max range
    setGdOrdToken53L((short) number);
  }

  /**
   * Returns the value of gdOrdToken53T
   *
   * @return gdOrdToken53T
   */
  public char[] getGdOrdToken53T() throws CFException {
    if (isGdOrdToken53TModified()) {
      gdOrdToken53T = refreshGdOrdToken53T();
    }
    return gdOrdToken53T;
  }

  /**
   * set variable gdOrdToken53T Corresponding COBOL Variable is GD-ORD-TOKEN-53-T
   *
   * @param value
   */
  public void setGdOrdToken53T(char[] value) {
    gdOrdToken53T = checkGdOrdToken53TConstraints(value);
    serializeGdOrdToken53T(gdOrdToken53T);
  }

  /**
   * Update GdOrdToken53T with a char[] from an offset and length
   *
   * @param value
   */
  public void setGdOrdToken53T(char[] source, int sourceIndex) {
    replace(source, sourceIndex, source.length, beginGdOrdToken53T, gdOrdToken53T.length);
  }

  public void setGdOrdToken53T(char[] source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginGdOrdToken53T, gdOrdToken53T.length);
  }

  /**
   * Update GdOrdToken53T with a char[] from an offset and length to an offset and length
   *
   * @param value
   */
  public void setGdOrdToken53T(
      char[] source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginGdOrdToken53T + targetIndex, targetLen);
  }

  /**
   * Update GdOrdToken53T with another Field
   *
   * @param value
   */
  public void setGdOrdToken53T(Field source) {
    replace(source, 0, source.length(), beginGdOrdToken53T, GD_ORD_TOKEN_53_T_LEN);
  }

  /**
   * Update GdOrdToken53T with another Field from an offset and length
   *
   * @param value
   */
  public void setGdOrdToken53T(Field source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginGdOrdToken53T, GD_ORD_TOKEN_53_T_LEN);
  }

  /**
   * Update GdOrdToken53T with another Field from an offset and length to an offset and length
   *
   * @param value
   */
  public void setGdOrdToken53T(
      Field source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginGdOrdToken53T + targetIndex, targetLen);
  }

  public static int getGdOrdToken53FieldLength() {
    return GD_ORD_TOKEN_53_LENGTH;
  }
}
