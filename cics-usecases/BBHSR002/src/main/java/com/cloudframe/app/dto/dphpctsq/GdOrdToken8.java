package com.cloudframe.app.dto.dphpctsq;

/**
 * The class GdOrdToken8 is used to handle fields declared in it
 *
 * @author CloudFrame Inc. created on 2025-03-25 at 08:30. using version 5.0.0.231
 */
import com.cloudframe.app.data.Field;
import com.cloudframe.app.dto.serialize.dphpctsq.*;
import com.cloudframe.app.exception.CFException;

public class GdOrdToken8 extends GdOrdToken8Serialized {

  private short gdOrdToken8L;

  private char[] gdOrdToken8T = Field.fillLowValue(515);

  /** Constructor for GdOrdToken8 */
  public GdOrdToken8() {
    // TO-DO auto generated code
  }

  /**
   * Constructor for GdOrdToken8. sets the parent value to the parent
   *
   * @param parent
   * @param begin
   */
  public GdOrdToken8(Field parent, int begin) {
    setParent(parent, begin);
  }

  /**
   * Returns the value of gdOrdToken8L
   *
   * @return gdOrdToken8L
   */
  public short getGdOrdToken8L() throws CFException {
    if (isGdOrdToken8LModified()) {
      gdOrdToken8L = refreshGdOrdToken8L();
    }
    return gdOrdToken8L;
  }

  /**
   * Update GdOrdToken8L with the passed value Corresponding COBOL Variable is GD-ORD-TOKEN-8-L
   *
   * @param number
   */
  public void setGdOrdToken8L(short number) {
    // Truncate if the number is beyond +/- Max range
    gdOrdToken8L = checkGdOrdToken8LMaxLimit(number);
    serializeGdOrdToken8L(gdOrdToken8L);
  }

  public void setGdOrdToken8L(int number) {
    number = checkGdOrdToken8LMaxLimit((short) number); // Truncate if value is beyond +/- Max range
    setGdOrdToken8L((short) number);
  }

  public void setGdOrdToken8L(long number) {
    number = checkGdOrdToken8LMaxLimit((short) number); // Truncate if value is beyond +/- Max range
    setGdOrdToken8L((short) number);
  }

  /**
   * Returns the value of gdOrdToken8T
   *
   * @return gdOrdToken8T
   */
  public char[] getGdOrdToken8T() throws CFException {
    if (isGdOrdToken8TModified()) {
      gdOrdToken8T = refreshGdOrdToken8T();
    }
    return gdOrdToken8T;
  }

  /**
   * set variable gdOrdToken8T Corresponding COBOL Variable is GD-ORD-TOKEN-8-T
   *
   * @param value
   */
  public void setGdOrdToken8T(char[] value) {
    gdOrdToken8T = checkGdOrdToken8TConstraints(value);
    serializeGdOrdToken8T(gdOrdToken8T);
  }

  /**
   * Update GdOrdToken8T with a char[] from an offset and length
   *
   * @param value
   */
  public void setGdOrdToken8T(char[] source, int sourceIndex) {
    replace(source, sourceIndex, source.length, beginGdOrdToken8T, gdOrdToken8T.length);
  }

  public void setGdOrdToken8T(char[] source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginGdOrdToken8T, gdOrdToken8T.length);
  }

  /**
   * Update GdOrdToken8T with a char[] from an offset and length to an offset and length
   *
   * @param value
   */
  public void setGdOrdToken8T(
      char[] source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginGdOrdToken8T + targetIndex, targetLen);
  }

  /**
   * Update GdOrdToken8T with another Field
   *
   * @param value
   */
  public void setGdOrdToken8T(Field source) {
    replace(source, 0, source.length(), beginGdOrdToken8T, GD_ORD_TOKEN_8_T_LEN);
  }

  /**
   * Update GdOrdToken8T with another Field from an offset and length
   *
   * @param value
   */
  public void setGdOrdToken8T(Field source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginGdOrdToken8T, GD_ORD_TOKEN_8_T_LEN);
  }

  /**
   * Update GdOrdToken8T with another Field from an offset and length to an offset and length
   *
   * @param value
   */
  public void setGdOrdToken8T(
      Field source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginGdOrdToken8T + targetIndex, targetLen);
  }

  public static int getGdOrdToken8FieldLength() {
    return GD_ORD_TOKEN_8_LENGTH;
  }
}
