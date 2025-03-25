package com.cloudframe.app.dto.dphpctsq;

/**
 * The class GdOrdToken74 is used to handle fields declared in it
 *
 * @author CloudFrame Inc. created on 2025-03-25 at 08:30. using version 5.0.0.231
 */
import com.cloudframe.app.data.Field;
import com.cloudframe.app.dto.serialize.dphpctsq.*;
import com.cloudframe.app.exception.CFException;

public class GdOrdToken74 extends GdOrdToken74Serialized {

  private short gdOrdToken74L;

  private char[] gdOrdToken74T = Field.fillLowValue(515);

  /** Constructor for GdOrdToken74 */
  public GdOrdToken74() {
    // TO-DO auto generated code
  }

  /**
   * Constructor for GdOrdToken74. sets the parent value to the parent
   *
   * @param parent
   * @param begin
   */
  public GdOrdToken74(Field parent, int begin) {
    setParent(parent, begin);
  }

  /**
   * Returns the value of gdOrdToken74L
   *
   * @return gdOrdToken74L
   */
  public short getGdOrdToken74L() throws CFException {
    if (isGdOrdToken74LModified()) {
      gdOrdToken74L = refreshGdOrdToken74L();
    }
    return gdOrdToken74L;
  }

  /**
   * Update GdOrdToken74L with the passed value Corresponding COBOL Variable is GD-ORD-TOKEN-74-L
   *
   * @param number
   */
  public void setGdOrdToken74L(short number) {
    // Truncate if the number is beyond +/- Max range
    gdOrdToken74L = checkGdOrdToken74LMaxLimit(number);
    serializeGdOrdToken74L(gdOrdToken74L);
  }

  public void setGdOrdToken74L(int number) {
    number =
        checkGdOrdToken74LMaxLimit((short) number); // Truncate if value is beyond +/- Max range
    setGdOrdToken74L((short) number);
  }

  public void setGdOrdToken74L(long number) {
    number =
        checkGdOrdToken74LMaxLimit((short) number); // Truncate if value is beyond +/- Max range
    setGdOrdToken74L((short) number);
  }

  /**
   * Returns the value of gdOrdToken74T
   *
   * @return gdOrdToken74T
   */
  public char[] getGdOrdToken74T() throws CFException {
    if (isGdOrdToken74TModified()) {
      gdOrdToken74T = refreshGdOrdToken74T();
    }
    return gdOrdToken74T;
  }

  /**
   * set variable gdOrdToken74T Corresponding COBOL Variable is GD-ORD-TOKEN-74-T
   *
   * @param value
   */
  public void setGdOrdToken74T(char[] value) {
    gdOrdToken74T = checkGdOrdToken74TConstraints(value);
    serializeGdOrdToken74T(gdOrdToken74T);
  }

  /**
   * Update GdOrdToken74T with a char[] from an offset and length
   *
   * @param value
   */
  public void setGdOrdToken74T(char[] source, int sourceIndex) {
    replace(source, sourceIndex, source.length, beginGdOrdToken74T, gdOrdToken74T.length);
  }

  public void setGdOrdToken74T(char[] source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginGdOrdToken74T, gdOrdToken74T.length);
  }

  /**
   * Update GdOrdToken74T with a char[] from an offset and length to an offset and length
   *
   * @param value
   */
  public void setGdOrdToken74T(
      char[] source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginGdOrdToken74T + targetIndex, targetLen);
  }

  /**
   * Update GdOrdToken74T with another Field
   *
   * @param value
   */
  public void setGdOrdToken74T(Field source) {
    replace(source, 0, source.length(), beginGdOrdToken74T, GD_ORD_TOKEN_74_T_LEN);
  }

  /**
   * Update GdOrdToken74T with another Field from an offset and length
   *
   * @param value
   */
  public void setGdOrdToken74T(Field source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginGdOrdToken74T, GD_ORD_TOKEN_74_T_LEN);
  }

  /**
   * Update GdOrdToken74T with another Field from an offset and length to an offset and length
   *
   * @param value
   */
  public void setGdOrdToken74T(
      Field source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginGdOrdToken74T + targetIndex, targetLen);
  }

  public static int getGdOrdToken74FieldLength() {
    return GD_ORD_TOKEN_74_LENGTH;
  }
}
