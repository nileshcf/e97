package com.cloudframe.app.dto.dphpctsq;

/**
 * The class GdOrdToken26 is used to handle fields declared in it
 *
 * @author CloudFrame Inc. created on 2025-03-25 at 08:30. using version 5.0.0.231
 */
import com.cloudframe.app.data.Field;
import com.cloudframe.app.dto.serialize.dphpctsq.*;
import com.cloudframe.app.exception.CFException;

public class GdOrdToken26 extends GdOrdToken26Serialized {

  private short gdOrdToken26L;

  private char[] gdOrdToken26T = Field.fillLowValue(515);

  /** Constructor for GdOrdToken26 */
  public GdOrdToken26() {
    // TO-DO auto generated code
  }

  /**
   * Constructor for GdOrdToken26. sets the parent value to the parent
   *
   * @param parent
   * @param begin
   */
  public GdOrdToken26(Field parent, int begin) {
    setParent(parent, begin);
  }

  /**
   * Returns the value of gdOrdToken26L
   *
   * @return gdOrdToken26L
   */
  public short getGdOrdToken26L() throws CFException {
    if (isGdOrdToken26LModified()) {
      gdOrdToken26L = refreshGdOrdToken26L();
    }
    return gdOrdToken26L;
  }

  /**
   * Update GdOrdToken26L with the passed value Corresponding COBOL Variable is GD-ORD-TOKEN-26-L
   *
   * @param number
   */
  public void setGdOrdToken26L(short number) {
    // Truncate if the number is beyond +/- Max range
    gdOrdToken26L = checkGdOrdToken26LMaxLimit(number);
    serializeGdOrdToken26L(gdOrdToken26L);
  }

  public void setGdOrdToken26L(int number) {
    number =
        checkGdOrdToken26LMaxLimit((short) number); // Truncate if value is beyond +/- Max range
    setGdOrdToken26L((short) number);
  }

  public void setGdOrdToken26L(long number) {
    number =
        checkGdOrdToken26LMaxLimit((short) number); // Truncate if value is beyond +/- Max range
    setGdOrdToken26L((short) number);
  }

  /**
   * Returns the value of gdOrdToken26T
   *
   * @return gdOrdToken26T
   */
  public char[] getGdOrdToken26T() throws CFException {
    if (isGdOrdToken26TModified()) {
      gdOrdToken26T = refreshGdOrdToken26T();
    }
    return gdOrdToken26T;
  }

  /**
   * set variable gdOrdToken26T Corresponding COBOL Variable is GD-ORD-TOKEN-26-T
   *
   * @param value
   */
  public void setGdOrdToken26T(char[] value) {
    gdOrdToken26T = checkGdOrdToken26TConstraints(value);
    serializeGdOrdToken26T(gdOrdToken26T);
  }

  /**
   * Update GdOrdToken26T with a char[] from an offset and length
   *
   * @param value
   */
  public void setGdOrdToken26T(char[] source, int sourceIndex) {
    replace(source, sourceIndex, source.length, beginGdOrdToken26T, gdOrdToken26T.length);
  }

  public void setGdOrdToken26T(char[] source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginGdOrdToken26T, gdOrdToken26T.length);
  }

  /**
   * Update GdOrdToken26T with a char[] from an offset and length to an offset and length
   *
   * @param value
   */
  public void setGdOrdToken26T(
      char[] source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginGdOrdToken26T + targetIndex, targetLen);
  }

  /**
   * Update GdOrdToken26T with another Field
   *
   * @param value
   */
  public void setGdOrdToken26T(Field source) {
    replace(source, 0, source.length(), beginGdOrdToken26T, GD_ORD_TOKEN_26_T_LEN);
  }

  /**
   * Update GdOrdToken26T with another Field from an offset and length
   *
   * @param value
   */
  public void setGdOrdToken26T(Field source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginGdOrdToken26T, GD_ORD_TOKEN_26_T_LEN);
  }

  /**
   * Update GdOrdToken26T with another Field from an offset and length to an offset and length
   *
   * @param value
   */
  public void setGdOrdToken26T(
      Field source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginGdOrdToken26T + targetIndex, targetLen);
  }

  public static int getGdOrdToken26FieldLength() {
    return GD_ORD_TOKEN_26_LENGTH;
  }
}
