package com.cloudframe.app.dto.dphpctsq;

/**
 * The class GdOrdToken90 is used to handle fields declared in it
 *
 * @author CloudFrame Inc. created on 2025-03-25 at 08:30. using version 5.0.0.231
 */
import com.cloudframe.app.data.Field;
import com.cloudframe.app.dto.serialize.dphpctsq.*;
import com.cloudframe.app.exception.CFException;

public class GdOrdToken90 extends GdOrdToken90Serialized {

  private short gdOrdToken90L;

  private char[] gdOrdToken90T = Field.fillLowValue(515);

  /** Constructor for GdOrdToken90 */
  public GdOrdToken90() {
    // TO-DO auto generated code
  }

  /**
   * Constructor for GdOrdToken90. sets the parent value to the parent
   *
   * @param parent
   * @param begin
   */
  public GdOrdToken90(Field parent, int begin) {
    setParent(parent, begin);
  }

  /**
   * Returns the value of gdOrdToken90L
   *
   * @return gdOrdToken90L
   */
  public short getGdOrdToken90L() throws CFException {
    if (isGdOrdToken90LModified()) {
      gdOrdToken90L = refreshGdOrdToken90L();
    }
    return gdOrdToken90L;
  }

  /**
   * Update GdOrdToken90L with the passed value Corresponding COBOL Variable is GD-ORD-TOKEN-90-L
   *
   * @param number
   */
  public void setGdOrdToken90L(short number) {
    // Truncate if the number is beyond +/- Max range
    gdOrdToken90L = checkGdOrdToken90LMaxLimit(number);
    serializeGdOrdToken90L(gdOrdToken90L);
  }

  public void setGdOrdToken90L(int number) {
    number =
        checkGdOrdToken90LMaxLimit((short) number); // Truncate if value is beyond +/- Max range
    setGdOrdToken90L((short) number);
  }

  public void setGdOrdToken90L(long number) {
    number =
        checkGdOrdToken90LMaxLimit((short) number); // Truncate if value is beyond +/- Max range
    setGdOrdToken90L((short) number);
  }

  /**
   * Returns the value of gdOrdToken90T
   *
   * @return gdOrdToken90T
   */
  public char[] getGdOrdToken90T() throws CFException {
    if (isGdOrdToken90TModified()) {
      gdOrdToken90T = refreshGdOrdToken90T();
    }
    return gdOrdToken90T;
  }

  /**
   * set variable gdOrdToken90T Corresponding COBOL Variable is GD-ORD-TOKEN-90-T
   *
   * @param value
   */
  public void setGdOrdToken90T(char[] value) {
    gdOrdToken90T = checkGdOrdToken90TConstraints(value);
    serializeGdOrdToken90T(gdOrdToken90T);
  }

  /**
   * Update GdOrdToken90T with a char[] from an offset and length
   *
   * @param value
   */
  public void setGdOrdToken90T(char[] source, int sourceIndex) {
    replace(source, sourceIndex, source.length, beginGdOrdToken90T, gdOrdToken90T.length);
  }

  public void setGdOrdToken90T(char[] source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginGdOrdToken90T, gdOrdToken90T.length);
  }

  /**
   * Update GdOrdToken90T with a char[] from an offset and length to an offset and length
   *
   * @param value
   */
  public void setGdOrdToken90T(
      char[] source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginGdOrdToken90T + targetIndex, targetLen);
  }

  /**
   * Update GdOrdToken90T with another Field
   *
   * @param value
   */
  public void setGdOrdToken90T(Field source) {
    replace(source, 0, source.length(), beginGdOrdToken90T, GD_ORD_TOKEN_90_T_LEN);
  }

  /**
   * Update GdOrdToken90T with another Field from an offset and length
   *
   * @param value
   */
  public void setGdOrdToken90T(Field source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginGdOrdToken90T, GD_ORD_TOKEN_90_T_LEN);
  }

  /**
   * Update GdOrdToken90T with another Field from an offset and length to an offset and length
   *
   * @param value
   */
  public void setGdOrdToken90T(
      Field source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginGdOrdToken90T + targetIndex, targetLen);
  }

  public static int getGdOrdToken90FieldLength() {
    return GD_ORD_TOKEN_90_LENGTH;
  }
}
