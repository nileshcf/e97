package com.cloudframe.app.dto.dphpctsq;

/**
 * The class GdOrdToken30 is used to handle fields declared in it
 *
 * @author CloudFrame Inc. created on 2025-03-25 at 08:30. using version 5.0.0.231
 */
import com.cloudframe.app.data.Field;
import com.cloudframe.app.dto.serialize.dphpctsq.*;
import com.cloudframe.app.exception.CFException;

public class GdOrdToken30 extends GdOrdToken30Serialized {

  private short gdOrdToken30L;

  private char[] gdOrdToken30T = Field.fillLowValue(515);

  /** Constructor for GdOrdToken30 */
  public GdOrdToken30() {
    // TO-DO auto generated code
  }

  /**
   * Constructor for GdOrdToken30. sets the parent value to the parent
   *
   * @param parent
   * @param begin
   */
  public GdOrdToken30(Field parent, int begin) {
    setParent(parent, begin);
  }

  /**
   * Returns the value of gdOrdToken30L
   *
   * @return gdOrdToken30L
   */
  public short getGdOrdToken30L() throws CFException {
    if (isGdOrdToken30LModified()) {
      gdOrdToken30L = refreshGdOrdToken30L();
    }
    return gdOrdToken30L;
  }

  /**
   * Update GdOrdToken30L with the passed value Corresponding COBOL Variable is GD-ORD-TOKEN-30-L
   *
   * @param number
   */
  public void setGdOrdToken30L(short number) {
    // Truncate if the number is beyond +/- Max range
    gdOrdToken30L = checkGdOrdToken30LMaxLimit(number);
    serializeGdOrdToken30L(gdOrdToken30L);
  }

  public void setGdOrdToken30L(int number) {
    number =
        checkGdOrdToken30LMaxLimit((short) number); // Truncate if value is beyond +/- Max range
    setGdOrdToken30L((short) number);
  }

  public void setGdOrdToken30L(long number) {
    number =
        checkGdOrdToken30LMaxLimit((short) number); // Truncate if value is beyond +/- Max range
    setGdOrdToken30L((short) number);
  }

  /**
   * Returns the value of gdOrdToken30T
   *
   * @return gdOrdToken30T
   */
  public char[] getGdOrdToken30T() throws CFException {
    if (isGdOrdToken30TModified()) {
      gdOrdToken30T = refreshGdOrdToken30T();
    }
    return gdOrdToken30T;
  }

  /**
   * set variable gdOrdToken30T Corresponding COBOL Variable is GD-ORD-TOKEN-30-T
   *
   * @param value
   */
  public void setGdOrdToken30T(char[] value) {
    gdOrdToken30T = checkGdOrdToken30TConstraints(value);
    serializeGdOrdToken30T(gdOrdToken30T);
  }

  /**
   * Update GdOrdToken30T with a char[] from an offset and length
   *
   * @param value
   */
  public void setGdOrdToken30T(char[] source, int sourceIndex) {
    replace(source, sourceIndex, source.length, beginGdOrdToken30T, gdOrdToken30T.length);
  }

  public void setGdOrdToken30T(char[] source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginGdOrdToken30T, gdOrdToken30T.length);
  }

  /**
   * Update GdOrdToken30T with a char[] from an offset and length to an offset and length
   *
   * @param value
   */
  public void setGdOrdToken30T(
      char[] source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginGdOrdToken30T + targetIndex, targetLen);
  }

  /**
   * Update GdOrdToken30T with another Field
   *
   * @param value
   */
  public void setGdOrdToken30T(Field source) {
    replace(source, 0, source.length(), beginGdOrdToken30T, GD_ORD_TOKEN_30_T_LEN);
  }

  /**
   * Update GdOrdToken30T with another Field from an offset and length
   *
   * @param value
   */
  public void setGdOrdToken30T(Field source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginGdOrdToken30T, GD_ORD_TOKEN_30_T_LEN);
  }

  /**
   * Update GdOrdToken30T with another Field from an offset and length to an offset and length
   *
   * @param value
   */
  public void setGdOrdToken30T(
      Field source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginGdOrdToken30T + targetIndex, targetLen);
  }

  public static int getGdOrdToken30FieldLength() {
    return GD_ORD_TOKEN_30_LENGTH;
  }
}
