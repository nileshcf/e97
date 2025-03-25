package com.cloudframe.app.dto.dphpctsq;

/**
 * The class GdOrdToken23 is used to handle fields declared in it
 *
 * @author CloudFrame Inc. created on 2025-03-25 at 08:30. using version 5.0.0.231
 */
import com.cloudframe.app.data.Field;
import com.cloudframe.app.dto.serialize.dphpctsq.*;
import com.cloudframe.app.exception.CFException;

public class GdOrdToken23 extends GdOrdToken23Serialized {

  private short gdOrdToken23L;

  private char[] gdOrdToken23T = Field.fillLowValue(515);

  /** Constructor for GdOrdToken23 */
  public GdOrdToken23() {
    // TO-DO auto generated code
  }

  /**
   * Constructor for GdOrdToken23. sets the parent value to the parent
   *
   * @param parent
   * @param begin
   */
  public GdOrdToken23(Field parent, int begin) {
    setParent(parent, begin);
  }

  /**
   * Returns the value of gdOrdToken23L
   *
   * @return gdOrdToken23L
   */
  public short getGdOrdToken23L() throws CFException {
    if (isGdOrdToken23LModified()) {
      gdOrdToken23L = refreshGdOrdToken23L();
    }
    return gdOrdToken23L;
  }

  /**
   * Update GdOrdToken23L with the passed value Corresponding COBOL Variable is GD-ORD-TOKEN-23-L
   *
   * @param number
   */
  public void setGdOrdToken23L(short number) {
    // Truncate if the number is beyond +/- Max range
    gdOrdToken23L = checkGdOrdToken23LMaxLimit(number);
    serializeGdOrdToken23L(gdOrdToken23L);
  }

  public void setGdOrdToken23L(int number) {
    number =
        checkGdOrdToken23LMaxLimit((short) number); // Truncate if value is beyond +/- Max range
    setGdOrdToken23L((short) number);
  }

  public void setGdOrdToken23L(long number) {
    number =
        checkGdOrdToken23LMaxLimit((short) number); // Truncate if value is beyond +/- Max range
    setGdOrdToken23L((short) number);
  }

  /**
   * Returns the value of gdOrdToken23T
   *
   * @return gdOrdToken23T
   */
  public char[] getGdOrdToken23T() throws CFException {
    if (isGdOrdToken23TModified()) {
      gdOrdToken23T = refreshGdOrdToken23T();
    }
    return gdOrdToken23T;
  }

  /**
   * set variable gdOrdToken23T Corresponding COBOL Variable is GD-ORD-TOKEN-23-T
   *
   * @param value
   */
  public void setGdOrdToken23T(char[] value) {
    gdOrdToken23T = checkGdOrdToken23TConstraints(value);
    serializeGdOrdToken23T(gdOrdToken23T);
  }

  /**
   * Update GdOrdToken23T with a char[] from an offset and length
   *
   * @param value
   */
  public void setGdOrdToken23T(char[] source, int sourceIndex) {
    replace(source, sourceIndex, source.length, beginGdOrdToken23T, gdOrdToken23T.length);
  }

  public void setGdOrdToken23T(char[] source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginGdOrdToken23T, gdOrdToken23T.length);
  }

  /**
   * Update GdOrdToken23T with a char[] from an offset and length to an offset and length
   *
   * @param value
   */
  public void setGdOrdToken23T(
      char[] source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginGdOrdToken23T + targetIndex, targetLen);
  }

  /**
   * Update GdOrdToken23T with another Field
   *
   * @param value
   */
  public void setGdOrdToken23T(Field source) {
    replace(source, 0, source.length(), beginGdOrdToken23T, GD_ORD_TOKEN_23_T_LEN);
  }

  /**
   * Update GdOrdToken23T with another Field from an offset and length
   *
   * @param value
   */
  public void setGdOrdToken23T(Field source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginGdOrdToken23T, GD_ORD_TOKEN_23_T_LEN);
  }

  /**
   * Update GdOrdToken23T with another Field from an offset and length to an offset and length
   *
   * @param value
   */
  public void setGdOrdToken23T(
      Field source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginGdOrdToken23T + targetIndex, targetLen);
  }

  public static int getGdOrdToken23FieldLength() {
    return GD_ORD_TOKEN_23_LENGTH;
  }
}
