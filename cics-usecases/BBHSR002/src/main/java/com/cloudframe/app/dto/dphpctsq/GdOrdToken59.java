package com.cloudframe.app.dto.dphpctsq;

/**
 * The class GdOrdToken59 is used to handle fields declared in it
 *
 * @author CloudFrame Inc. created on 2025-03-25 at 08:30. using version 5.0.0.231
 */
import com.cloudframe.app.data.Field;
import com.cloudframe.app.dto.serialize.dphpctsq.*;
import com.cloudframe.app.exception.CFException;

public class GdOrdToken59 extends GdOrdToken59Serialized {

  private short gdOrdToken59L;

  private char[] gdOrdToken59T = Field.fillLowValue(515);

  /** Constructor for GdOrdToken59 */
  public GdOrdToken59() {
    // TO-DO auto generated code
  }

  /**
   * Constructor for GdOrdToken59. sets the parent value to the parent
   *
   * @param parent
   * @param begin
   */
  public GdOrdToken59(Field parent, int begin) {
    setParent(parent, begin);
  }

  /**
   * Returns the value of gdOrdToken59L
   *
   * @return gdOrdToken59L
   */
  public short getGdOrdToken59L() throws CFException {
    if (isGdOrdToken59LModified()) {
      gdOrdToken59L = refreshGdOrdToken59L();
    }
    return gdOrdToken59L;
  }

  /**
   * Update GdOrdToken59L with the passed value Corresponding COBOL Variable is GD-ORD-TOKEN-59-L
   *
   * @param number
   */
  public void setGdOrdToken59L(short number) {
    // Truncate if the number is beyond +/- Max range
    gdOrdToken59L = checkGdOrdToken59LMaxLimit(number);
    serializeGdOrdToken59L(gdOrdToken59L);
  }

  public void setGdOrdToken59L(int number) {
    number =
        checkGdOrdToken59LMaxLimit((short) number); // Truncate if value is beyond +/- Max range
    setGdOrdToken59L((short) number);
  }

  public void setGdOrdToken59L(long number) {
    number =
        checkGdOrdToken59LMaxLimit((short) number); // Truncate if value is beyond +/- Max range
    setGdOrdToken59L((short) number);
  }

  /**
   * Returns the value of gdOrdToken59T
   *
   * @return gdOrdToken59T
   */
  public char[] getGdOrdToken59T() throws CFException {
    if (isGdOrdToken59TModified()) {
      gdOrdToken59T = refreshGdOrdToken59T();
    }
    return gdOrdToken59T;
  }

  /**
   * set variable gdOrdToken59T Corresponding COBOL Variable is GD-ORD-TOKEN-59-T
   *
   * @param value
   */
  public void setGdOrdToken59T(char[] value) {
    gdOrdToken59T = checkGdOrdToken59TConstraints(value);
    serializeGdOrdToken59T(gdOrdToken59T);
  }

  /**
   * Update GdOrdToken59T with a char[] from an offset and length
   *
   * @param value
   */
  public void setGdOrdToken59T(char[] source, int sourceIndex) {
    replace(source, sourceIndex, source.length, beginGdOrdToken59T, gdOrdToken59T.length);
  }

  public void setGdOrdToken59T(char[] source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginGdOrdToken59T, gdOrdToken59T.length);
  }

  /**
   * Update GdOrdToken59T with a char[] from an offset and length to an offset and length
   *
   * @param value
   */
  public void setGdOrdToken59T(
      char[] source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginGdOrdToken59T + targetIndex, targetLen);
  }

  /**
   * Update GdOrdToken59T with another Field
   *
   * @param value
   */
  public void setGdOrdToken59T(Field source) {
    replace(source, 0, source.length(), beginGdOrdToken59T, GD_ORD_TOKEN_59_T_LEN);
  }

  /**
   * Update GdOrdToken59T with another Field from an offset and length
   *
   * @param value
   */
  public void setGdOrdToken59T(Field source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginGdOrdToken59T, GD_ORD_TOKEN_59_T_LEN);
  }

  /**
   * Update GdOrdToken59T with another Field from an offset and length to an offset and length
   *
   * @param value
   */
  public void setGdOrdToken59T(
      Field source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginGdOrdToken59T + targetIndex, targetLen);
  }

  public static int getGdOrdToken59FieldLength() {
    return GD_ORD_TOKEN_59_LENGTH;
  }
}
