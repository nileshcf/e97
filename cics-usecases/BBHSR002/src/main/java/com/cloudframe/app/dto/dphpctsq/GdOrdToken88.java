package com.cloudframe.app.dto.dphpctsq;

/**
 * The class GdOrdToken88 is used to handle fields declared in it
 *
 * @author CloudFrame Inc. created on 2025-03-25 at 08:30. using version 5.0.0.231
 */
import com.cloudframe.app.data.Field;
import com.cloudframe.app.dto.serialize.dphpctsq.*;
import com.cloudframe.app.exception.CFException;

public class GdOrdToken88 extends GdOrdToken88Serialized {

  private short gdOrdToken88L;

  private char[] gdOrdToken88T = Field.fillLowValue(515);

  /** Constructor for GdOrdToken88 */
  public GdOrdToken88() {
    // TO-DO auto generated code
  }

  /**
   * Constructor for GdOrdToken88. sets the parent value to the parent
   *
   * @param parent
   * @param begin
   */
  public GdOrdToken88(Field parent, int begin) {
    setParent(parent, begin);
  }

  /**
   * Returns the value of gdOrdToken88L
   *
   * @return gdOrdToken88L
   */
  public short getGdOrdToken88L() throws CFException {
    if (isGdOrdToken88LModified()) {
      gdOrdToken88L = refreshGdOrdToken88L();
    }
    return gdOrdToken88L;
  }

  /**
   * Update GdOrdToken88L with the passed value Corresponding COBOL Variable is GD-ORD-TOKEN-88-L
   *
   * @param number
   */
  public void setGdOrdToken88L(short number) {
    // Truncate if the number is beyond +/- Max range
    gdOrdToken88L = checkGdOrdToken88LMaxLimit(number);
    serializeGdOrdToken88L(gdOrdToken88L);
  }

  public void setGdOrdToken88L(int number) {
    number =
        checkGdOrdToken88LMaxLimit((short) number); // Truncate if value is beyond +/- Max range
    setGdOrdToken88L((short) number);
  }

  public void setGdOrdToken88L(long number) {
    number =
        checkGdOrdToken88LMaxLimit((short) number); // Truncate if value is beyond +/- Max range
    setGdOrdToken88L((short) number);
  }

  /**
   * Returns the value of gdOrdToken88T
   *
   * @return gdOrdToken88T
   */
  public char[] getGdOrdToken88T() throws CFException {
    if (isGdOrdToken88TModified()) {
      gdOrdToken88T = refreshGdOrdToken88T();
    }
    return gdOrdToken88T;
  }

  /**
   * set variable gdOrdToken88T Corresponding COBOL Variable is GD-ORD-TOKEN-88-T
   *
   * @param value
   */
  public void setGdOrdToken88T(char[] value) {
    gdOrdToken88T = checkGdOrdToken88TConstraints(value);
    serializeGdOrdToken88T(gdOrdToken88T);
  }

  /**
   * Update GdOrdToken88T with a char[] from an offset and length
   *
   * @param value
   */
  public void setGdOrdToken88T(char[] source, int sourceIndex) {
    replace(source, sourceIndex, source.length, beginGdOrdToken88T, gdOrdToken88T.length);
  }

  public void setGdOrdToken88T(char[] source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginGdOrdToken88T, gdOrdToken88T.length);
  }

  /**
   * Update GdOrdToken88T with a char[] from an offset and length to an offset and length
   *
   * @param value
   */
  public void setGdOrdToken88T(
      char[] source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginGdOrdToken88T + targetIndex, targetLen);
  }

  /**
   * Update GdOrdToken88T with another Field
   *
   * @param value
   */
  public void setGdOrdToken88T(Field source) {
    replace(source, 0, source.length(), beginGdOrdToken88T, GD_ORD_TOKEN_88_T_LEN);
  }

  /**
   * Update GdOrdToken88T with another Field from an offset and length
   *
   * @param value
   */
  public void setGdOrdToken88T(Field source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginGdOrdToken88T, GD_ORD_TOKEN_88_T_LEN);
  }

  /**
   * Update GdOrdToken88T with another Field from an offset and length to an offset and length
   *
   * @param value
   */
  public void setGdOrdToken88T(
      Field source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginGdOrdToken88T + targetIndex, targetLen);
  }

  public static int getGdOrdToken88FieldLength() {
    return GD_ORD_TOKEN_88_LENGTH;
  }
}
