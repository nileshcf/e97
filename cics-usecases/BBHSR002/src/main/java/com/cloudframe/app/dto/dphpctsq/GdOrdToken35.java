package com.cloudframe.app.dto.dphpctsq;

/**
 * The class GdOrdToken35 is used to handle fields declared in it
 *
 * @author CloudFrame Inc. created on 2025-03-25 at 08:30. using version 5.0.0.231
 */
import com.cloudframe.app.data.Field;
import com.cloudframe.app.dto.serialize.dphpctsq.*;
import com.cloudframe.app.exception.CFException;

public class GdOrdToken35 extends GdOrdToken35Serialized {

  private short gdOrdToken35L;

  private char[] gdOrdToken35T = Field.fillLowValue(515);

  /** Constructor for GdOrdToken35 */
  public GdOrdToken35() {
    // TO-DO auto generated code
  }

  /**
   * Constructor for GdOrdToken35. sets the parent value to the parent
   *
   * @param parent
   * @param begin
   */
  public GdOrdToken35(Field parent, int begin) {
    setParent(parent, begin);
  }

  /**
   * Returns the value of gdOrdToken35L
   *
   * @return gdOrdToken35L
   */
  public short getGdOrdToken35L() throws CFException {
    if (isGdOrdToken35LModified()) {
      gdOrdToken35L = refreshGdOrdToken35L();
    }
    return gdOrdToken35L;
  }

  /**
   * Update GdOrdToken35L with the passed value Corresponding COBOL Variable is GD-ORD-TOKEN-35-L
   *
   * @param number
   */
  public void setGdOrdToken35L(short number) {
    // Truncate if the number is beyond +/- Max range
    gdOrdToken35L = checkGdOrdToken35LMaxLimit(number);
    serializeGdOrdToken35L(gdOrdToken35L);
  }

  public void setGdOrdToken35L(int number) {
    number =
        checkGdOrdToken35LMaxLimit((short) number); // Truncate if value is beyond +/- Max range
    setGdOrdToken35L((short) number);
  }

  public void setGdOrdToken35L(long number) {
    number =
        checkGdOrdToken35LMaxLimit((short) number); // Truncate if value is beyond +/- Max range
    setGdOrdToken35L((short) number);
  }

  /**
   * Returns the value of gdOrdToken35T
   *
   * @return gdOrdToken35T
   */
  public char[] getGdOrdToken35T() throws CFException {
    if (isGdOrdToken35TModified()) {
      gdOrdToken35T = refreshGdOrdToken35T();
    }
    return gdOrdToken35T;
  }

  /**
   * set variable gdOrdToken35T Corresponding COBOL Variable is GD-ORD-TOKEN-35-T
   *
   * @param value
   */
  public void setGdOrdToken35T(char[] value) {
    gdOrdToken35T = checkGdOrdToken35TConstraints(value);
    serializeGdOrdToken35T(gdOrdToken35T);
  }

  /**
   * Update GdOrdToken35T with a char[] from an offset and length
   *
   * @param value
   */
  public void setGdOrdToken35T(char[] source, int sourceIndex) {
    replace(source, sourceIndex, source.length, beginGdOrdToken35T, gdOrdToken35T.length);
  }

  public void setGdOrdToken35T(char[] source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginGdOrdToken35T, gdOrdToken35T.length);
  }

  /**
   * Update GdOrdToken35T with a char[] from an offset and length to an offset and length
   *
   * @param value
   */
  public void setGdOrdToken35T(
      char[] source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginGdOrdToken35T + targetIndex, targetLen);
  }

  /**
   * Update GdOrdToken35T with another Field
   *
   * @param value
   */
  public void setGdOrdToken35T(Field source) {
    replace(source, 0, source.length(), beginGdOrdToken35T, GD_ORD_TOKEN_35_T_LEN);
  }

  /**
   * Update GdOrdToken35T with another Field from an offset and length
   *
   * @param value
   */
  public void setGdOrdToken35T(Field source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginGdOrdToken35T, GD_ORD_TOKEN_35_T_LEN);
  }

  /**
   * Update GdOrdToken35T with another Field from an offset and length to an offset and length
   *
   * @param value
   */
  public void setGdOrdToken35T(
      Field source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginGdOrdToken35T + targetIndex, targetLen);
  }

  public static int getGdOrdToken35FieldLength() {
    return GD_ORD_TOKEN_35_LENGTH;
  }
}
