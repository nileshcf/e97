package com.cloudframe.app.dto.dphpctsq;

/**
 * The class GdOrdToken31 is used to handle fields declared in it
 *
 * @author CloudFrame Inc. created on 2025-03-25 at 08:30. using version 5.0.0.231
 */
import com.cloudframe.app.data.Field;
import com.cloudframe.app.dto.serialize.dphpctsq.*;
import com.cloudframe.app.exception.CFException;

public class GdOrdToken31 extends GdOrdToken31Serialized {

  private short gdOrdToken31L;

  private char[] gdOrdToken31T = Field.fillLowValue(515);

  /** Constructor for GdOrdToken31 */
  public GdOrdToken31() {
    // TO-DO auto generated code
  }

  /**
   * Constructor for GdOrdToken31. sets the parent value to the parent
   *
   * @param parent
   * @param begin
   */
  public GdOrdToken31(Field parent, int begin) {
    setParent(parent, begin);
  }

  /**
   * Returns the value of gdOrdToken31L
   *
   * @return gdOrdToken31L
   */
  public short getGdOrdToken31L() throws CFException {
    if (isGdOrdToken31LModified()) {
      gdOrdToken31L = refreshGdOrdToken31L();
    }
    return gdOrdToken31L;
  }

  /**
   * Update GdOrdToken31L with the passed value Corresponding COBOL Variable is GD-ORD-TOKEN-31-L
   *
   * @param number
   */
  public void setGdOrdToken31L(short number) {
    // Truncate if the number is beyond +/- Max range
    gdOrdToken31L = checkGdOrdToken31LMaxLimit(number);
    serializeGdOrdToken31L(gdOrdToken31L);
  }

  public void setGdOrdToken31L(int number) {
    number =
        checkGdOrdToken31LMaxLimit((short) number); // Truncate if value is beyond +/- Max range
    setGdOrdToken31L((short) number);
  }

  public void setGdOrdToken31L(long number) {
    number =
        checkGdOrdToken31LMaxLimit((short) number); // Truncate if value is beyond +/- Max range
    setGdOrdToken31L((short) number);
  }

  /**
   * Returns the value of gdOrdToken31T
   *
   * @return gdOrdToken31T
   */
  public char[] getGdOrdToken31T() throws CFException {
    if (isGdOrdToken31TModified()) {
      gdOrdToken31T = refreshGdOrdToken31T();
    }
    return gdOrdToken31T;
  }

  /**
   * set variable gdOrdToken31T Corresponding COBOL Variable is GD-ORD-TOKEN-31-T
   *
   * @param value
   */
  public void setGdOrdToken31T(char[] value) {
    gdOrdToken31T = checkGdOrdToken31TConstraints(value);
    serializeGdOrdToken31T(gdOrdToken31T);
  }

  /**
   * Update GdOrdToken31T with a char[] from an offset and length
   *
   * @param value
   */
  public void setGdOrdToken31T(char[] source, int sourceIndex) {
    replace(source, sourceIndex, source.length, beginGdOrdToken31T, gdOrdToken31T.length);
  }

  public void setGdOrdToken31T(char[] source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginGdOrdToken31T, gdOrdToken31T.length);
  }

  /**
   * Update GdOrdToken31T with a char[] from an offset and length to an offset and length
   *
   * @param value
   */
  public void setGdOrdToken31T(
      char[] source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginGdOrdToken31T + targetIndex, targetLen);
  }

  /**
   * Update GdOrdToken31T with another Field
   *
   * @param value
   */
  public void setGdOrdToken31T(Field source) {
    replace(source, 0, source.length(), beginGdOrdToken31T, GD_ORD_TOKEN_31_T_LEN);
  }

  /**
   * Update GdOrdToken31T with another Field from an offset and length
   *
   * @param value
   */
  public void setGdOrdToken31T(Field source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginGdOrdToken31T, GD_ORD_TOKEN_31_T_LEN);
  }

  /**
   * Update GdOrdToken31T with another Field from an offset and length to an offset and length
   *
   * @param value
   */
  public void setGdOrdToken31T(
      Field source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginGdOrdToken31T + targetIndex, targetLen);
  }

  public static int getGdOrdToken31FieldLength() {
    return GD_ORD_TOKEN_31_LENGTH;
  }
}
