package com.cloudframe.app.dto.dphpctsq;

/**
 * The class GdOrdToken95 is used to handle fields declared in it
 *
 * @author CloudFrame Inc. created on 2025-03-25 at 08:30. using version 5.0.0.231
 */
import com.cloudframe.app.data.Field;
import com.cloudframe.app.dto.serialize.dphpctsq.*;
import com.cloudframe.app.exception.CFException;

public class GdOrdToken95 extends GdOrdToken95Serialized {

  private short gdOrdToken95L;

  private char[] gdOrdToken95T = Field.fillLowValue(515);

  /** Constructor for GdOrdToken95 */
  public GdOrdToken95() {
    // TO-DO auto generated code
  }

  /**
   * Constructor for GdOrdToken95. sets the parent value to the parent
   *
   * @param parent
   * @param begin
   */
  public GdOrdToken95(Field parent, int begin) {
    setParent(parent, begin);
  }

  /**
   * Returns the value of gdOrdToken95L
   *
   * @return gdOrdToken95L
   */
  public short getGdOrdToken95L() throws CFException {
    if (isGdOrdToken95LModified()) {
      gdOrdToken95L = refreshGdOrdToken95L();
    }
    return gdOrdToken95L;
  }

  /**
   * Update GdOrdToken95L with the passed value Corresponding COBOL Variable is GD-ORD-TOKEN-95-L
   *
   * @param number
   */
  public void setGdOrdToken95L(short number) {
    // Truncate if the number is beyond +/- Max range
    gdOrdToken95L = checkGdOrdToken95LMaxLimit(number);
    serializeGdOrdToken95L(gdOrdToken95L);
  }

  public void setGdOrdToken95L(int number) {
    number =
        checkGdOrdToken95LMaxLimit((short) number); // Truncate if value is beyond +/- Max range
    setGdOrdToken95L((short) number);
  }

  public void setGdOrdToken95L(long number) {
    number =
        checkGdOrdToken95LMaxLimit((short) number); // Truncate if value is beyond +/- Max range
    setGdOrdToken95L((short) number);
  }

  /**
   * Returns the value of gdOrdToken95T
   *
   * @return gdOrdToken95T
   */
  public char[] getGdOrdToken95T() throws CFException {
    if (isGdOrdToken95TModified()) {
      gdOrdToken95T = refreshGdOrdToken95T();
    }
    return gdOrdToken95T;
  }

  /**
   * set variable gdOrdToken95T Corresponding COBOL Variable is GD-ORD-TOKEN-95-T
   *
   * @param value
   */
  public void setGdOrdToken95T(char[] value) {
    gdOrdToken95T = checkGdOrdToken95TConstraints(value);
    serializeGdOrdToken95T(gdOrdToken95T);
  }

  /**
   * Update GdOrdToken95T with a char[] from an offset and length
   *
   * @param value
   */
  public void setGdOrdToken95T(char[] source, int sourceIndex) {
    replace(source, sourceIndex, source.length, beginGdOrdToken95T, gdOrdToken95T.length);
  }

  public void setGdOrdToken95T(char[] source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginGdOrdToken95T, gdOrdToken95T.length);
  }

  /**
   * Update GdOrdToken95T with a char[] from an offset and length to an offset and length
   *
   * @param value
   */
  public void setGdOrdToken95T(
      char[] source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginGdOrdToken95T + targetIndex, targetLen);
  }

  /**
   * Update GdOrdToken95T with another Field
   *
   * @param value
   */
  public void setGdOrdToken95T(Field source) {
    replace(source, 0, source.length(), beginGdOrdToken95T, GD_ORD_TOKEN_95_T_LEN);
  }

  /**
   * Update GdOrdToken95T with another Field from an offset and length
   *
   * @param value
   */
  public void setGdOrdToken95T(Field source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginGdOrdToken95T, GD_ORD_TOKEN_95_T_LEN);
  }

  /**
   * Update GdOrdToken95T with another Field from an offset and length to an offset and length
   *
   * @param value
   */
  public void setGdOrdToken95T(
      Field source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginGdOrdToken95T + targetIndex, targetLen);
  }

  public static int getGdOrdToken95FieldLength() {
    return GD_ORD_TOKEN_95_LENGTH;
  }
}
