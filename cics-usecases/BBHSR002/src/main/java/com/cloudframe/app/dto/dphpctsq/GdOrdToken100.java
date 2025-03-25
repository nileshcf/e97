package com.cloudframe.app.dto.dphpctsq;

/**
 * The class GdOrdToken100 is used to handle fields declared in it
 *
 * @author CloudFrame Inc. created on 2025-03-25 at 08:30. using version 5.0.0.231
 */
import com.cloudframe.app.data.Field;
import com.cloudframe.app.dto.serialize.dphpctsq.*;
import com.cloudframe.app.exception.CFException;

public class GdOrdToken100 extends GdOrdToken100Serialized {

  private short gdOrdToken100L;

  private char[] gdOrdToken100T = Field.fillLowValue(515);

  /** Constructor for GdOrdToken100 */
  public GdOrdToken100() {
    // TO-DO auto generated code
  }

  /**
   * Constructor for GdOrdToken100. sets the parent value to the parent
   *
   * @param parent
   * @param begin
   */
  public GdOrdToken100(Field parent, int begin) {
    setParent(parent, begin);
  }

  /**
   * Returns the value of gdOrdToken100L
   *
   * @return gdOrdToken100L
   */
  public short getGdOrdToken100L() throws CFException {
    if (isGdOrdToken100LModified()) {
      gdOrdToken100L = refreshGdOrdToken100L();
    }
    return gdOrdToken100L;
  }

  /**
   * Update GdOrdToken100L with the passed value Corresponding COBOL Variable is GD-ORD-TOKEN-100-L
   *
   * @param number
   */
  public void setGdOrdToken100L(short number) {
    // Truncate if the number is beyond +/- Max range
    gdOrdToken100L = checkGdOrdToken100LMaxLimit(number);
    serializeGdOrdToken100L(gdOrdToken100L);
  }

  public void setGdOrdToken100L(int number) {
    number =
        checkGdOrdToken100LMaxLimit((short) number); // Truncate if value is beyond +/- Max range
    setGdOrdToken100L((short) number);
  }

  public void setGdOrdToken100L(long number) {
    number =
        checkGdOrdToken100LMaxLimit((short) number); // Truncate if value is beyond +/- Max range
    setGdOrdToken100L((short) number);
  }

  /**
   * Returns the value of gdOrdToken100T
   *
   * @return gdOrdToken100T
   */
  public char[] getGdOrdToken100T() throws CFException {
    if (isGdOrdToken100TModified()) {
      gdOrdToken100T = refreshGdOrdToken100T();
    }
    return gdOrdToken100T;
  }

  /**
   * set variable gdOrdToken100T Corresponding COBOL Variable is GD-ORD-TOKEN-100-T
   *
   * @param value
   */
  public void setGdOrdToken100T(char[] value) {
    gdOrdToken100T = checkGdOrdToken100TConstraints(value);
    serializeGdOrdToken100T(gdOrdToken100T);
  }

  /**
   * Update GdOrdToken100T with a char[] from an offset and length
   *
   * @param value
   */
  public void setGdOrdToken100T(char[] source, int sourceIndex) {
    replace(source, sourceIndex, source.length, beginGdOrdToken100T, gdOrdToken100T.length);
  }

  public void setGdOrdToken100T(char[] source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginGdOrdToken100T, gdOrdToken100T.length);
  }

  /**
   * Update GdOrdToken100T with a char[] from an offset and length to an offset and length
   *
   * @param value
   */
  public void setGdOrdToken100T(
      char[] source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginGdOrdToken100T + targetIndex, targetLen);
  }

  /**
   * Update GdOrdToken100T with another Field
   *
   * @param value
   */
  public void setGdOrdToken100T(Field source) {
    replace(source, 0, source.length(), beginGdOrdToken100T, GD_ORD_TOKEN_100_T_LEN);
  }

  /**
   * Update GdOrdToken100T with another Field from an offset and length
   *
   * @param value
   */
  public void setGdOrdToken100T(Field source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginGdOrdToken100T, GD_ORD_TOKEN_100_T_LEN);
  }

  /**
   * Update GdOrdToken100T with another Field from an offset and length to an offset and length
   *
   * @param value
   */
  public void setGdOrdToken100T(
      Field source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginGdOrdToken100T + targetIndex, targetLen);
  }

  public static int getGdOrdToken100FieldLength() {
    return GD_ORD_TOKEN_100_LENGTH;
  }
}
