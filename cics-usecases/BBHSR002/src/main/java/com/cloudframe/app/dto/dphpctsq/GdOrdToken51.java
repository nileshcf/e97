package com.cloudframe.app.dto.dphpctsq;

/**
 * The class GdOrdToken51 is used to handle fields declared in it
 *
 * @author CloudFrame Inc. created on 2025-03-25 at 08:30. using version 5.0.0.231
 */
import com.cloudframe.app.data.Field;
import com.cloudframe.app.dto.serialize.dphpctsq.*;
import com.cloudframe.app.exception.CFException;

public class GdOrdToken51 extends GdOrdToken51Serialized {

  private short gdOrdToken51L;

  private char[] gdOrdToken51T = Field.fillLowValue(515);

  /** Constructor for GdOrdToken51 */
  public GdOrdToken51() {
    // TO-DO auto generated code
  }

  /**
   * Constructor for GdOrdToken51. sets the parent value to the parent
   *
   * @param parent
   * @param begin
   */
  public GdOrdToken51(Field parent, int begin) {
    setParent(parent, begin);
  }

  /**
   * Returns the value of gdOrdToken51L
   *
   * @return gdOrdToken51L
   */
  public short getGdOrdToken51L() throws CFException {
    if (isGdOrdToken51LModified()) {
      gdOrdToken51L = refreshGdOrdToken51L();
    }
    return gdOrdToken51L;
  }

  /**
   * Update GdOrdToken51L with the passed value Corresponding COBOL Variable is GD-ORD-TOKEN-51-L
   *
   * @param number
   */
  public void setGdOrdToken51L(short number) {
    // Truncate if the number is beyond +/- Max range
    gdOrdToken51L = checkGdOrdToken51LMaxLimit(number);
    serializeGdOrdToken51L(gdOrdToken51L);
  }

  public void setGdOrdToken51L(int number) {
    number =
        checkGdOrdToken51LMaxLimit((short) number); // Truncate if value is beyond +/- Max range
    setGdOrdToken51L((short) number);
  }

  public void setGdOrdToken51L(long number) {
    number =
        checkGdOrdToken51LMaxLimit((short) number); // Truncate if value is beyond +/- Max range
    setGdOrdToken51L((short) number);
  }

  /**
   * Returns the value of gdOrdToken51T
   *
   * @return gdOrdToken51T
   */
  public char[] getGdOrdToken51T() throws CFException {
    if (isGdOrdToken51TModified()) {
      gdOrdToken51T = refreshGdOrdToken51T();
    }
    return gdOrdToken51T;
  }

  /**
   * set variable gdOrdToken51T Corresponding COBOL Variable is GD-ORD-TOKEN-51-T
   *
   * @param value
   */
  public void setGdOrdToken51T(char[] value) {
    gdOrdToken51T = checkGdOrdToken51TConstraints(value);
    serializeGdOrdToken51T(gdOrdToken51T);
  }

  /**
   * Update GdOrdToken51T with a char[] from an offset and length
   *
   * @param value
   */
  public void setGdOrdToken51T(char[] source, int sourceIndex) {
    replace(source, sourceIndex, source.length, beginGdOrdToken51T, gdOrdToken51T.length);
  }

  public void setGdOrdToken51T(char[] source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginGdOrdToken51T, gdOrdToken51T.length);
  }

  /**
   * Update GdOrdToken51T with a char[] from an offset and length to an offset and length
   *
   * @param value
   */
  public void setGdOrdToken51T(
      char[] source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginGdOrdToken51T + targetIndex, targetLen);
  }

  /**
   * Update GdOrdToken51T with another Field
   *
   * @param value
   */
  public void setGdOrdToken51T(Field source) {
    replace(source, 0, source.length(), beginGdOrdToken51T, GD_ORD_TOKEN_51_T_LEN);
  }

  /**
   * Update GdOrdToken51T with another Field from an offset and length
   *
   * @param value
   */
  public void setGdOrdToken51T(Field source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginGdOrdToken51T, GD_ORD_TOKEN_51_T_LEN);
  }

  /**
   * Update GdOrdToken51T with another Field from an offset and length to an offset and length
   *
   * @param value
   */
  public void setGdOrdToken51T(
      Field source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginGdOrdToken51T + targetIndex, targetLen);
  }

  public static int getGdOrdToken51FieldLength() {
    return GD_ORD_TOKEN_51_LENGTH;
  }
}
