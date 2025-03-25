package com.cloudframe.app.dto.dphpctsq;

/**
 * The class GdOrdToken2 is used to handle fields declared in it
 *
 * @author CloudFrame Inc. created on 2025-03-25 at 08:30. using version 5.0.0.231
 */
import com.cloudframe.app.data.Field;
import com.cloudframe.app.dto.serialize.dphpctsq.*;
import com.cloudframe.app.exception.CFException;

public class GdOrdToken2 extends GdOrdToken2Serialized {

  private short gdOrdToken2L;

  private char[] gdOrdToken2T = Field.fillLowValue(515);

  /** Constructor for GdOrdToken2 */
  public GdOrdToken2() {
    // TO-DO auto generated code
  }

  /**
   * Constructor for GdOrdToken2. sets the parent value to the parent
   *
   * @param parent
   * @param begin
   */
  public GdOrdToken2(Field parent, int begin) {
    setParent(parent, begin);
  }

  /**
   * Returns the value of gdOrdToken2L
   *
   * @return gdOrdToken2L
   */
  public short getGdOrdToken2L() throws CFException {
    if (isGdOrdToken2LModified()) {
      gdOrdToken2L = refreshGdOrdToken2L();
    }
    return gdOrdToken2L;
  }

  /**
   * Update GdOrdToken2L with the passed value Corresponding COBOL Variable is GD-ORD-TOKEN-2-L
   *
   * @param number
   */
  public void setGdOrdToken2L(short number) {
    // Truncate if the number is beyond +/- Max range
    gdOrdToken2L = checkGdOrdToken2LMaxLimit(number);
    serializeGdOrdToken2L(gdOrdToken2L);
  }

  public void setGdOrdToken2L(int number) {
    number = checkGdOrdToken2LMaxLimit((short) number); // Truncate if value is beyond +/- Max range
    setGdOrdToken2L((short) number);
  }

  public void setGdOrdToken2L(long number) {
    number = checkGdOrdToken2LMaxLimit((short) number); // Truncate if value is beyond +/- Max range
    setGdOrdToken2L((short) number);
  }

  /**
   * Returns the value of gdOrdToken2T
   *
   * @return gdOrdToken2T
   */
  public char[] getGdOrdToken2T() throws CFException {
    if (isGdOrdToken2TModified()) {
      gdOrdToken2T = refreshGdOrdToken2T();
    }
    return gdOrdToken2T;
  }

  /**
   * set variable gdOrdToken2T Corresponding COBOL Variable is GD-ORD-TOKEN-2-T
   *
   * @param value
   */
  public void setGdOrdToken2T(char[] value) {
    gdOrdToken2T = checkGdOrdToken2TConstraints(value);
    serializeGdOrdToken2T(gdOrdToken2T);
  }

  /**
   * Update GdOrdToken2T with a char[] from an offset and length
   *
   * @param value
   */
  public void setGdOrdToken2T(char[] source, int sourceIndex) {
    replace(source, sourceIndex, source.length, beginGdOrdToken2T, gdOrdToken2T.length);
  }

  public void setGdOrdToken2T(char[] source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginGdOrdToken2T, gdOrdToken2T.length);
  }

  /**
   * Update GdOrdToken2T with a char[] from an offset and length to an offset and length
   *
   * @param value
   */
  public void setGdOrdToken2T(
      char[] source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginGdOrdToken2T + targetIndex, targetLen);
  }

  /**
   * Update GdOrdToken2T with another Field
   *
   * @param value
   */
  public void setGdOrdToken2T(Field source) {
    replace(source, 0, source.length(), beginGdOrdToken2T, GD_ORD_TOKEN_2_T_LEN);
  }

  /**
   * Update GdOrdToken2T with another Field from an offset and length
   *
   * @param value
   */
  public void setGdOrdToken2T(Field source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginGdOrdToken2T, GD_ORD_TOKEN_2_T_LEN);
  }

  /**
   * Update GdOrdToken2T with another Field from an offset and length to an offset and length
   *
   * @param value
   */
  public void setGdOrdToken2T(
      Field source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginGdOrdToken2T + targetIndex, targetLen);
  }

  public static int getGdOrdToken2FieldLength() {
    return GD_ORD_TOKEN_2_LENGTH;
  }
}
