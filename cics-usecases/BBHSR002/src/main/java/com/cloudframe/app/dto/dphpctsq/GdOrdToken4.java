package com.cloudframe.app.dto.dphpctsq;

/**
 * The class GdOrdToken4 is used to handle fields declared in it
 *
 * @author CloudFrame Inc. created on 2025-03-25 at 08:30. using version 5.0.0.231
 */
import com.cloudframe.app.data.Field;
import com.cloudframe.app.dto.serialize.dphpctsq.*;
import com.cloudframe.app.exception.CFException;

public class GdOrdToken4 extends GdOrdToken4Serialized {

  private short gdOrdToken4L;

  private char[] gdOrdToken4T = Field.fillLowValue(515);

  /** Constructor for GdOrdToken4 */
  public GdOrdToken4() {
    // TO-DO auto generated code
  }

  /**
   * Constructor for GdOrdToken4. sets the parent value to the parent
   *
   * @param parent
   * @param begin
   */
  public GdOrdToken4(Field parent, int begin) {
    setParent(parent, begin);
  }

  /**
   * Returns the value of gdOrdToken4L
   *
   * @return gdOrdToken4L
   */
  public short getGdOrdToken4L() throws CFException {
    if (isGdOrdToken4LModified()) {
      gdOrdToken4L = refreshGdOrdToken4L();
    }
    return gdOrdToken4L;
  }

  /**
   * Update GdOrdToken4L with the passed value Corresponding COBOL Variable is GD-ORD-TOKEN-4-L
   *
   * @param number
   */
  public void setGdOrdToken4L(short number) {
    // Truncate if the number is beyond +/- Max range
    gdOrdToken4L = checkGdOrdToken4LMaxLimit(number);
    serializeGdOrdToken4L(gdOrdToken4L);
  }

  public void setGdOrdToken4L(int number) {
    number = checkGdOrdToken4LMaxLimit((short) number); // Truncate if value is beyond +/- Max range
    setGdOrdToken4L((short) number);
  }

  public void setGdOrdToken4L(long number) {
    number = checkGdOrdToken4LMaxLimit((short) number); // Truncate if value is beyond +/- Max range
    setGdOrdToken4L((short) number);
  }

  /**
   * Returns the value of gdOrdToken4T
   *
   * @return gdOrdToken4T
   */
  public char[] getGdOrdToken4T() throws CFException {
    if (isGdOrdToken4TModified()) {
      gdOrdToken4T = refreshGdOrdToken4T();
    }
    return gdOrdToken4T;
  }

  /**
   * set variable gdOrdToken4T Corresponding COBOL Variable is GD-ORD-TOKEN-4-T
   *
   * @param value
   */
  public void setGdOrdToken4T(char[] value) {
    gdOrdToken4T = checkGdOrdToken4TConstraints(value);
    serializeGdOrdToken4T(gdOrdToken4T);
  }

  /**
   * Update GdOrdToken4T with a char[] from an offset and length
   *
   * @param value
   */
  public void setGdOrdToken4T(char[] source, int sourceIndex) {
    replace(source, sourceIndex, source.length, beginGdOrdToken4T, gdOrdToken4T.length);
  }

  public void setGdOrdToken4T(char[] source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginGdOrdToken4T, gdOrdToken4T.length);
  }

  /**
   * Update GdOrdToken4T with a char[] from an offset and length to an offset and length
   *
   * @param value
   */
  public void setGdOrdToken4T(
      char[] source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginGdOrdToken4T + targetIndex, targetLen);
  }

  /**
   * Update GdOrdToken4T with another Field
   *
   * @param value
   */
  public void setGdOrdToken4T(Field source) {
    replace(source, 0, source.length(), beginGdOrdToken4T, GD_ORD_TOKEN_4_T_LEN);
  }

  /**
   * Update GdOrdToken4T with another Field from an offset and length
   *
   * @param value
   */
  public void setGdOrdToken4T(Field source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginGdOrdToken4T, GD_ORD_TOKEN_4_T_LEN);
  }

  /**
   * Update GdOrdToken4T with another Field from an offset and length to an offset and length
   *
   * @param value
   */
  public void setGdOrdToken4T(
      Field source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginGdOrdToken4T + targetIndex, targetLen);
  }

  public static int getGdOrdToken4FieldLength() {
    return GD_ORD_TOKEN_4_LENGTH;
  }
}
