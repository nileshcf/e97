package com.cloudframe.app.dto.dphpctsq;

/**
 * The class GdOrdToken37 is used to handle fields declared in it
 *
 * @author CloudFrame Inc. created on 2025-03-25 at 08:30. using version 5.0.0.231
 */
import com.cloudframe.app.data.Field;
import com.cloudframe.app.dto.serialize.dphpctsq.*;
import com.cloudframe.app.exception.CFException;

public class GdOrdToken37 extends GdOrdToken37Serialized {

  private short gdOrdToken37L;

  private char[] gdOrdToken37T = Field.fillLowValue(515);

  /** Constructor for GdOrdToken37 */
  public GdOrdToken37() {
    // TO-DO auto generated code
  }

  /**
   * Constructor for GdOrdToken37. sets the parent value to the parent
   *
   * @param parent
   * @param begin
   */
  public GdOrdToken37(Field parent, int begin) {
    setParent(parent, begin);
  }

  /**
   * Returns the value of gdOrdToken37L
   *
   * @return gdOrdToken37L
   */
  public short getGdOrdToken37L() throws CFException {
    if (isGdOrdToken37LModified()) {
      gdOrdToken37L = refreshGdOrdToken37L();
    }
    return gdOrdToken37L;
  }

  /**
   * Update GdOrdToken37L with the passed value Corresponding COBOL Variable is GD-ORD-TOKEN-37-L
   *
   * @param number
   */
  public void setGdOrdToken37L(short number) {
    // Truncate if the number is beyond +/- Max range
    gdOrdToken37L = checkGdOrdToken37LMaxLimit(number);
    serializeGdOrdToken37L(gdOrdToken37L);
  }

  public void setGdOrdToken37L(int number) {
    number =
        checkGdOrdToken37LMaxLimit((short) number); // Truncate if value is beyond +/- Max range
    setGdOrdToken37L((short) number);
  }

  public void setGdOrdToken37L(long number) {
    number =
        checkGdOrdToken37LMaxLimit((short) number); // Truncate if value is beyond +/- Max range
    setGdOrdToken37L((short) number);
  }

  /**
   * Returns the value of gdOrdToken37T
   *
   * @return gdOrdToken37T
   */
  public char[] getGdOrdToken37T() throws CFException {
    if (isGdOrdToken37TModified()) {
      gdOrdToken37T = refreshGdOrdToken37T();
    }
    return gdOrdToken37T;
  }

  /**
   * set variable gdOrdToken37T Corresponding COBOL Variable is GD-ORD-TOKEN-37-T
   *
   * @param value
   */
  public void setGdOrdToken37T(char[] value) {
    gdOrdToken37T = checkGdOrdToken37TConstraints(value);
    serializeGdOrdToken37T(gdOrdToken37T);
  }

  /**
   * Update GdOrdToken37T with a char[] from an offset and length
   *
   * @param value
   */
  public void setGdOrdToken37T(char[] source, int sourceIndex) {
    replace(source, sourceIndex, source.length, beginGdOrdToken37T, gdOrdToken37T.length);
  }

  public void setGdOrdToken37T(char[] source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginGdOrdToken37T, gdOrdToken37T.length);
  }

  /**
   * Update GdOrdToken37T with a char[] from an offset and length to an offset and length
   *
   * @param value
   */
  public void setGdOrdToken37T(
      char[] source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginGdOrdToken37T + targetIndex, targetLen);
  }

  /**
   * Update GdOrdToken37T with another Field
   *
   * @param value
   */
  public void setGdOrdToken37T(Field source) {
    replace(source, 0, source.length(), beginGdOrdToken37T, GD_ORD_TOKEN_37_T_LEN);
  }

  /**
   * Update GdOrdToken37T with another Field from an offset and length
   *
   * @param value
   */
  public void setGdOrdToken37T(Field source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginGdOrdToken37T, GD_ORD_TOKEN_37_T_LEN);
  }

  /**
   * Update GdOrdToken37T with another Field from an offset and length to an offset and length
   *
   * @param value
   */
  public void setGdOrdToken37T(
      Field source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginGdOrdToken37T + targetIndex, targetLen);
  }

  public static int getGdOrdToken37FieldLength() {
    return GD_ORD_TOKEN_37_LENGTH;
  }
}
