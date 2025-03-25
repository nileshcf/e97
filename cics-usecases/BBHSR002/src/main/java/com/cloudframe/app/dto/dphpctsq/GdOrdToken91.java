package com.cloudframe.app.dto.dphpctsq;

/**
 * The class GdOrdToken91 is used to handle fields declared in it
 *
 * @author CloudFrame Inc. created on 2025-03-25 at 08:30. using version 5.0.0.231
 */
import com.cloudframe.app.data.Field;
import com.cloudframe.app.dto.serialize.dphpctsq.*;
import com.cloudframe.app.exception.CFException;

public class GdOrdToken91 extends GdOrdToken91Serialized {

  private short gdOrdToken91L;

  private char[] gdOrdToken91T = Field.fillLowValue(515);

  /** Constructor for GdOrdToken91 */
  public GdOrdToken91() {
    // TO-DO auto generated code
  }

  /**
   * Constructor for GdOrdToken91. sets the parent value to the parent
   *
   * @param parent
   * @param begin
   */
  public GdOrdToken91(Field parent, int begin) {
    setParent(parent, begin);
  }

  /**
   * Returns the value of gdOrdToken91L
   *
   * @return gdOrdToken91L
   */
  public short getGdOrdToken91L() throws CFException {
    if (isGdOrdToken91LModified()) {
      gdOrdToken91L = refreshGdOrdToken91L();
    }
    return gdOrdToken91L;
  }

  /**
   * Update GdOrdToken91L with the passed value Corresponding COBOL Variable is GD-ORD-TOKEN-91-L
   *
   * @param number
   */
  public void setGdOrdToken91L(short number) {
    // Truncate if the number is beyond +/- Max range
    gdOrdToken91L = checkGdOrdToken91LMaxLimit(number);
    serializeGdOrdToken91L(gdOrdToken91L);
  }

  public void setGdOrdToken91L(int number) {
    number =
        checkGdOrdToken91LMaxLimit((short) number); // Truncate if value is beyond +/- Max range
    setGdOrdToken91L((short) number);
  }

  public void setGdOrdToken91L(long number) {
    number =
        checkGdOrdToken91LMaxLimit((short) number); // Truncate if value is beyond +/- Max range
    setGdOrdToken91L((short) number);
  }

  /**
   * Returns the value of gdOrdToken91T
   *
   * @return gdOrdToken91T
   */
  public char[] getGdOrdToken91T() throws CFException {
    if (isGdOrdToken91TModified()) {
      gdOrdToken91T = refreshGdOrdToken91T();
    }
    return gdOrdToken91T;
  }

  /**
   * set variable gdOrdToken91T Corresponding COBOL Variable is GD-ORD-TOKEN-91-T
   *
   * @param value
   */
  public void setGdOrdToken91T(char[] value) {
    gdOrdToken91T = checkGdOrdToken91TConstraints(value);
    serializeGdOrdToken91T(gdOrdToken91T);
  }

  /**
   * Update GdOrdToken91T with a char[] from an offset and length
   *
   * @param value
   */
  public void setGdOrdToken91T(char[] source, int sourceIndex) {
    replace(source, sourceIndex, source.length, beginGdOrdToken91T, gdOrdToken91T.length);
  }

  public void setGdOrdToken91T(char[] source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginGdOrdToken91T, gdOrdToken91T.length);
  }

  /**
   * Update GdOrdToken91T with a char[] from an offset and length to an offset and length
   *
   * @param value
   */
  public void setGdOrdToken91T(
      char[] source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginGdOrdToken91T + targetIndex, targetLen);
  }

  /**
   * Update GdOrdToken91T with another Field
   *
   * @param value
   */
  public void setGdOrdToken91T(Field source) {
    replace(source, 0, source.length(), beginGdOrdToken91T, GD_ORD_TOKEN_91_T_LEN);
  }

  /**
   * Update GdOrdToken91T with another Field from an offset and length
   *
   * @param value
   */
  public void setGdOrdToken91T(Field source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginGdOrdToken91T, GD_ORD_TOKEN_91_T_LEN);
  }

  /**
   * Update GdOrdToken91T with another Field from an offset and length to an offset and length
   *
   * @param value
   */
  public void setGdOrdToken91T(
      Field source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginGdOrdToken91T + targetIndex, targetLen);
  }

  public static int getGdOrdToken91FieldLength() {
    return GD_ORD_TOKEN_91_LENGTH;
  }
}
