package com.cloudframe.app.dto.dphpctsq;

/**
 * The class GdOrdToken49 is used to handle fields declared in it
 *
 * @author CloudFrame Inc. created on 2025-03-25 at 08:30. using version 5.0.0.231
 */
import com.cloudframe.app.data.Field;
import com.cloudframe.app.dto.serialize.dphpctsq.*;
import com.cloudframe.app.exception.CFException;

public class GdOrdToken49 extends GdOrdToken49Serialized {

  private short gdOrdToken49L;

  private char[] gdOrdToken49T = Field.fillLowValue(515);

  /** Constructor for GdOrdToken49 */
  public GdOrdToken49() {
    // TO-DO auto generated code
  }

  /**
   * Constructor for GdOrdToken49. sets the parent value to the parent
   *
   * @param parent
   * @param begin
   */
  public GdOrdToken49(Field parent, int begin) {
    setParent(parent, begin);
  }

  /**
   * Returns the value of gdOrdToken49L
   *
   * @return gdOrdToken49L
   */
  public short getGdOrdToken49L() throws CFException {
    if (isGdOrdToken49LModified()) {
      gdOrdToken49L = refreshGdOrdToken49L();
    }
    return gdOrdToken49L;
  }

  /**
   * Update GdOrdToken49L with the passed value Corresponding COBOL Variable is GD-ORD-TOKEN-49-L
   *
   * @param number
   */
  public void setGdOrdToken49L(short number) {
    // Truncate if the number is beyond +/- Max range
    gdOrdToken49L = checkGdOrdToken49LMaxLimit(number);
    serializeGdOrdToken49L(gdOrdToken49L);
  }

  public void setGdOrdToken49L(int number) {
    number =
        checkGdOrdToken49LMaxLimit((short) number); // Truncate if value is beyond +/- Max range
    setGdOrdToken49L((short) number);
  }

  public void setGdOrdToken49L(long number) {
    number =
        checkGdOrdToken49LMaxLimit((short) number); // Truncate if value is beyond +/- Max range
    setGdOrdToken49L((short) number);
  }

  /**
   * Returns the value of gdOrdToken49T
   *
   * @return gdOrdToken49T
   */
  public char[] getGdOrdToken49T() throws CFException {
    if (isGdOrdToken49TModified()) {
      gdOrdToken49T = refreshGdOrdToken49T();
    }
    return gdOrdToken49T;
  }

  /**
   * set variable gdOrdToken49T Corresponding COBOL Variable is GD-ORD-TOKEN-49-T
   *
   * @param value
   */
  public void setGdOrdToken49T(char[] value) {
    gdOrdToken49T = checkGdOrdToken49TConstraints(value);
    serializeGdOrdToken49T(gdOrdToken49T);
  }

  /**
   * Update GdOrdToken49T with a char[] from an offset and length
   *
   * @param value
   */
  public void setGdOrdToken49T(char[] source, int sourceIndex) {
    replace(source, sourceIndex, source.length, beginGdOrdToken49T, gdOrdToken49T.length);
  }

  public void setGdOrdToken49T(char[] source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginGdOrdToken49T, gdOrdToken49T.length);
  }

  /**
   * Update GdOrdToken49T with a char[] from an offset and length to an offset and length
   *
   * @param value
   */
  public void setGdOrdToken49T(
      char[] source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginGdOrdToken49T + targetIndex, targetLen);
  }

  /**
   * Update GdOrdToken49T with another Field
   *
   * @param value
   */
  public void setGdOrdToken49T(Field source) {
    replace(source, 0, source.length(), beginGdOrdToken49T, GD_ORD_TOKEN_49_T_LEN);
  }

  /**
   * Update GdOrdToken49T with another Field from an offset and length
   *
   * @param value
   */
  public void setGdOrdToken49T(Field source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginGdOrdToken49T, GD_ORD_TOKEN_49_T_LEN);
  }

  /**
   * Update GdOrdToken49T with another Field from an offset and length to an offset and length
   *
   * @param value
   */
  public void setGdOrdToken49T(
      Field source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginGdOrdToken49T + targetIndex, targetLen);
  }

  public static int getGdOrdToken49FieldLength() {
    return GD_ORD_TOKEN_49_LENGTH;
  }
}
