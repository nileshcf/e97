package com.cloudframe.app.dto.dphpctsq;

/**
 * The class GdOrdToken18 is used to handle fields declared in it
 *
 * @author CloudFrame Inc. created on 2025-03-25 at 08:30. using version 5.0.0.231
 */
import com.cloudframe.app.data.Field;
import com.cloudframe.app.dto.serialize.dphpctsq.*;
import com.cloudframe.app.exception.CFException;

public class GdOrdToken18 extends GdOrdToken18Serialized {

  private short gdOrdToken18L;

  private char[] gdOrdToken18T = Field.fillLowValue(515);

  /** Constructor for GdOrdToken18 */
  public GdOrdToken18() {
    // TO-DO auto generated code
  }

  /**
   * Constructor for GdOrdToken18. sets the parent value to the parent
   *
   * @param parent
   * @param begin
   */
  public GdOrdToken18(Field parent, int begin) {
    setParent(parent, begin);
  }

  /**
   * Returns the value of gdOrdToken18L
   *
   * @return gdOrdToken18L
   */
  public short getGdOrdToken18L() throws CFException {
    if (isGdOrdToken18LModified()) {
      gdOrdToken18L = refreshGdOrdToken18L();
    }
    return gdOrdToken18L;
  }

  /**
   * Update GdOrdToken18L with the passed value Corresponding COBOL Variable is GD-ORD-TOKEN-18-L
   *
   * @param number
   */
  public void setGdOrdToken18L(short number) {
    // Truncate if the number is beyond +/- Max range
    gdOrdToken18L = checkGdOrdToken18LMaxLimit(number);
    serializeGdOrdToken18L(gdOrdToken18L);
  }

  public void setGdOrdToken18L(int number) {
    number =
        checkGdOrdToken18LMaxLimit((short) number); // Truncate if value is beyond +/- Max range
    setGdOrdToken18L((short) number);
  }

  public void setGdOrdToken18L(long number) {
    number =
        checkGdOrdToken18LMaxLimit((short) number); // Truncate if value is beyond +/- Max range
    setGdOrdToken18L((short) number);
  }

  /**
   * Returns the value of gdOrdToken18T
   *
   * @return gdOrdToken18T
   */
  public char[] getGdOrdToken18T() throws CFException {
    if (isGdOrdToken18TModified()) {
      gdOrdToken18T = refreshGdOrdToken18T();
    }
    return gdOrdToken18T;
  }

  /**
   * set variable gdOrdToken18T Corresponding COBOL Variable is GD-ORD-TOKEN-18-T
   *
   * @param value
   */
  public void setGdOrdToken18T(char[] value) {
    gdOrdToken18T = checkGdOrdToken18TConstraints(value);
    serializeGdOrdToken18T(gdOrdToken18T);
  }

  /**
   * Update GdOrdToken18T with a char[] from an offset and length
   *
   * @param value
   */
  public void setGdOrdToken18T(char[] source, int sourceIndex) {
    replace(source, sourceIndex, source.length, beginGdOrdToken18T, gdOrdToken18T.length);
  }

  public void setGdOrdToken18T(char[] source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginGdOrdToken18T, gdOrdToken18T.length);
  }

  /**
   * Update GdOrdToken18T with a char[] from an offset and length to an offset and length
   *
   * @param value
   */
  public void setGdOrdToken18T(
      char[] source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginGdOrdToken18T + targetIndex, targetLen);
  }

  /**
   * Update GdOrdToken18T with another Field
   *
   * @param value
   */
  public void setGdOrdToken18T(Field source) {
    replace(source, 0, source.length(), beginGdOrdToken18T, GD_ORD_TOKEN_18_T_LEN);
  }

  /**
   * Update GdOrdToken18T with another Field from an offset and length
   *
   * @param value
   */
  public void setGdOrdToken18T(Field source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginGdOrdToken18T, GD_ORD_TOKEN_18_T_LEN);
  }

  /**
   * Update GdOrdToken18T with another Field from an offset and length to an offset and length
   *
   * @param value
   */
  public void setGdOrdToken18T(
      Field source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginGdOrdToken18T + targetIndex, targetLen);
  }

  public static int getGdOrdToken18FieldLength() {
    return GD_ORD_TOKEN_18_LENGTH;
  }
}
