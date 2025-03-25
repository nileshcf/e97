package com.cloudframe.app.dto.dphpctsq;

/**
 * The class GdOrdToken17 is used to handle fields declared in it
 *
 * @author CloudFrame Inc. created on 2025-03-25 at 08:30. using version 5.0.0.231
 */
import com.cloudframe.app.data.Field;
import com.cloudframe.app.dto.serialize.dphpctsq.*;
import com.cloudframe.app.exception.CFException;

public class GdOrdToken17 extends GdOrdToken17Serialized {

  private short gdOrdToken17L;

  private char[] gdOrdToken17T = Field.fillLowValue(515);

  /** Constructor for GdOrdToken17 */
  public GdOrdToken17() {
    // TO-DO auto generated code
  }

  /**
   * Constructor for GdOrdToken17. sets the parent value to the parent
   *
   * @param parent
   * @param begin
   */
  public GdOrdToken17(Field parent, int begin) {
    setParent(parent, begin);
  }

  /**
   * Returns the value of gdOrdToken17L
   *
   * @return gdOrdToken17L
   */
  public short getGdOrdToken17L() throws CFException {
    if (isGdOrdToken17LModified()) {
      gdOrdToken17L = refreshGdOrdToken17L();
    }
    return gdOrdToken17L;
  }

  /**
   * Update GdOrdToken17L with the passed value Corresponding COBOL Variable is GD-ORD-TOKEN-17-L
   *
   * @param number
   */
  public void setGdOrdToken17L(short number) {
    // Truncate if the number is beyond +/- Max range
    gdOrdToken17L = checkGdOrdToken17LMaxLimit(number);
    serializeGdOrdToken17L(gdOrdToken17L);
  }

  public void setGdOrdToken17L(int number) {
    number =
        checkGdOrdToken17LMaxLimit((short) number); // Truncate if value is beyond +/- Max range
    setGdOrdToken17L((short) number);
  }

  public void setGdOrdToken17L(long number) {
    number =
        checkGdOrdToken17LMaxLimit((short) number); // Truncate if value is beyond +/- Max range
    setGdOrdToken17L((short) number);
  }

  /**
   * Returns the value of gdOrdToken17T
   *
   * @return gdOrdToken17T
   */
  public char[] getGdOrdToken17T() throws CFException {
    if (isGdOrdToken17TModified()) {
      gdOrdToken17T = refreshGdOrdToken17T();
    }
    return gdOrdToken17T;
  }

  /**
   * set variable gdOrdToken17T Corresponding COBOL Variable is GD-ORD-TOKEN-17-T
   *
   * @param value
   */
  public void setGdOrdToken17T(char[] value) {
    gdOrdToken17T = checkGdOrdToken17TConstraints(value);
    serializeGdOrdToken17T(gdOrdToken17T);
  }

  /**
   * Update GdOrdToken17T with a char[] from an offset and length
   *
   * @param value
   */
  public void setGdOrdToken17T(char[] source, int sourceIndex) {
    replace(source, sourceIndex, source.length, beginGdOrdToken17T, gdOrdToken17T.length);
  }

  public void setGdOrdToken17T(char[] source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginGdOrdToken17T, gdOrdToken17T.length);
  }

  /**
   * Update GdOrdToken17T with a char[] from an offset and length to an offset and length
   *
   * @param value
   */
  public void setGdOrdToken17T(
      char[] source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginGdOrdToken17T + targetIndex, targetLen);
  }

  /**
   * Update GdOrdToken17T with another Field
   *
   * @param value
   */
  public void setGdOrdToken17T(Field source) {
    replace(source, 0, source.length(), beginGdOrdToken17T, GD_ORD_TOKEN_17_T_LEN);
  }

  /**
   * Update GdOrdToken17T with another Field from an offset and length
   *
   * @param value
   */
  public void setGdOrdToken17T(Field source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginGdOrdToken17T, GD_ORD_TOKEN_17_T_LEN);
  }

  /**
   * Update GdOrdToken17T with another Field from an offset and length to an offset and length
   *
   * @param value
   */
  public void setGdOrdToken17T(
      Field source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginGdOrdToken17T + targetIndex, targetLen);
  }

  public static int getGdOrdToken17FieldLength() {
    return GD_ORD_TOKEN_17_LENGTH;
  }
}
