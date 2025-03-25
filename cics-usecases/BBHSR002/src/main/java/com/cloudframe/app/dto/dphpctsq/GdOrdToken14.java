package com.cloudframe.app.dto.dphpctsq;

/**
 * The class GdOrdToken14 is used to handle fields declared in it
 *
 * @author CloudFrame Inc. created on 2025-03-25 at 08:30. using version 5.0.0.231
 */
import com.cloudframe.app.data.Field;
import com.cloudframe.app.dto.serialize.dphpctsq.*;
import com.cloudframe.app.exception.CFException;

public class GdOrdToken14 extends GdOrdToken14Serialized {

  private short gdOrdToken14L;

  private char[] gdOrdToken14T = Field.fillLowValue(515);

  /** Constructor for GdOrdToken14 */
  public GdOrdToken14() {
    // TO-DO auto generated code
  }

  /**
   * Constructor for GdOrdToken14. sets the parent value to the parent
   *
   * @param parent
   * @param begin
   */
  public GdOrdToken14(Field parent, int begin) {
    setParent(parent, begin);
  }

  /**
   * Returns the value of gdOrdToken14L
   *
   * @return gdOrdToken14L
   */
  public short getGdOrdToken14L() throws CFException {
    if (isGdOrdToken14LModified()) {
      gdOrdToken14L = refreshGdOrdToken14L();
    }
    return gdOrdToken14L;
  }

  /**
   * Update GdOrdToken14L with the passed value Corresponding COBOL Variable is GD-ORD-TOKEN-14-L
   *
   * @param number
   */
  public void setGdOrdToken14L(short number) {
    // Truncate if the number is beyond +/- Max range
    gdOrdToken14L = checkGdOrdToken14LMaxLimit(number);
    serializeGdOrdToken14L(gdOrdToken14L);
  }

  public void setGdOrdToken14L(int number) {
    number =
        checkGdOrdToken14LMaxLimit((short) number); // Truncate if value is beyond +/- Max range
    setGdOrdToken14L((short) number);
  }

  public void setGdOrdToken14L(long number) {
    number =
        checkGdOrdToken14LMaxLimit((short) number); // Truncate if value is beyond +/- Max range
    setGdOrdToken14L((short) number);
  }

  /**
   * Returns the value of gdOrdToken14T
   *
   * @return gdOrdToken14T
   */
  public char[] getGdOrdToken14T() throws CFException {
    if (isGdOrdToken14TModified()) {
      gdOrdToken14T = refreshGdOrdToken14T();
    }
    return gdOrdToken14T;
  }

  /**
   * set variable gdOrdToken14T Corresponding COBOL Variable is GD-ORD-TOKEN-14-T
   *
   * @param value
   */
  public void setGdOrdToken14T(char[] value) {
    gdOrdToken14T = checkGdOrdToken14TConstraints(value);
    serializeGdOrdToken14T(gdOrdToken14T);
  }

  /**
   * Update GdOrdToken14T with a char[] from an offset and length
   *
   * @param value
   */
  public void setGdOrdToken14T(char[] source, int sourceIndex) {
    replace(source, sourceIndex, source.length, beginGdOrdToken14T, gdOrdToken14T.length);
  }

  public void setGdOrdToken14T(char[] source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginGdOrdToken14T, gdOrdToken14T.length);
  }

  /**
   * Update GdOrdToken14T with a char[] from an offset and length to an offset and length
   *
   * @param value
   */
  public void setGdOrdToken14T(
      char[] source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginGdOrdToken14T + targetIndex, targetLen);
  }

  /**
   * Update GdOrdToken14T with another Field
   *
   * @param value
   */
  public void setGdOrdToken14T(Field source) {
    replace(source, 0, source.length(), beginGdOrdToken14T, GD_ORD_TOKEN_14_T_LEN);
  }

  /**
   * Update GdOrdToken14T with another Field from an offset and length
   *
   * @param value
   */
  public void setGdOrdToken14T(Field source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginGdOrdToken14T, GD_ORD_TOKEN_14_T_LEN);
  }

  /**
   * Update GdOrdToken14T with another Field from an offset and length to an offset and length
   *
   * @param value
   */
  public void setGdOrdToken14T(
      Field source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginGdOrdToken14T + targetIndex, targetLen);
  }

  public static int getGdOrdToken14FieldLength() {
    return GD_ORD_TOKEN_14_LENGTH;
  }
}
