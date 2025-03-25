package com.cloudframe.app.dto.dphpctsq;

/**
 * The class GdOrdToken56 is used to handle fields declared in it
 *
 * @author CloudFrame Inc. created on 2025-03-25 at 08:30. using version 5.0.0.231
 */
import com.cloudframe.app.data.Field;
import com.cloudframe.app.dto.serialize.dphpctsq.*;
import com.cloudframe.app.exception.CFException;

public class GdOrdToken56 extends GdOrdToken56Serialized {

  private short gdOrdToken56L;

  private char[] gdOrdToken56T = Field.fillLowValue(515);

  /** Constructor for GdOrdToken56 */
  public GdOrdToken56() {
    // TO-DO auto generated code
  }

  /**
   * Constructor for GdOrdToken56. sets the parent value to the parent
   *
   * @param parent
   * @param begin
   */
  public GdOrdToken56(Field parent, int begin) {
    setParent(parent, begin);
  }

  /**
   * Returns the value of gdOrdToken56L
   *
   * @return gdOrdToken56L
   */
  public short getGdOrdToken56L() throws CFException {
    if (isGdOrdToken56LModified()) {
      gdOrdToken56L = refreshGdOrdToken56L();
    }
    return gdOrdToken56L;
  }

  /**
   * Update GdOrdToken56L with the passed value Corresponding COBOL Variable is GD-ORD-TOKEN-56-L
   *
   * @param number
   */
  public void setGdOrdToken56L(short number) {
    // Truncate if the number is beyond +/- Max range
    gdOrdToken56L = checkGdOrdToken56LMaxLimit(number);
    serializeGdOrdToken56L(gdOrdToken56L);
  }

  public void setGdOrdToken56L(int number) {
    number =
        checkGdOrdToken56LMaxLimit((short) number); // Truncate if value is beyond +/- Max range
    setGdOrdToken56L((short) number);
  }

  public void setGdOrdToken56L(long number) {
    number =
        checkGdOrdToken56LMaxLimit((short) number); // Truncate if value is beyond +/- Max range
    setGdOrdToken56L((short) number);
  }

  /**
   * Returns the value of gdOrdToken56T
   *
   * @return gdOrdToken56T
   */
  public char[] getGdOrdToken56T() throws CFException {
    if (isGdOrdToken56TModified()) {
      gdOrdToken56T = refreshGdOrdToken56T();
    }
    return gdOrdToken56T;
  }

  /**
   * set variable gdOrdToken56T Corresponding COBOL Variable is GD-ORD-TOKEN-56-T
   *
   * @param value
   */
  public void setGdOrdToken56T(char[] value) {
    gdOrdToken56T = checkGdOrdToken56TConstraints(value);
    serializeGdOrdToken56T(gdOrdToken56T);
  }

  /**
   * Update GdOrdToken56T with a char[] from an offset and length
   *
   * @param value
   */
  public void setGdOrdToken56T(char[] source, int sourceIndex) {
    replace(source, sourceIndex, source.length, beginGdOrdToken56T, gdOrdToken56T.length);
  }

  public void setGdOrdToken56T(char[] source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginGdOrdToken56T, gdOrdToken56T.length);
  }

  /**
   * Update GdOrdToken56T with a char[] from an offset and length to an offset and length
   *
   * @param value
   */
  public void setGdOrdToken56T(
      char[] source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginGdOrdToken56T + targetIndex, targetLen);
  }

  /**
   * Update GdOrdToken56T with another Field
   *
   * @param value
   */
  public void setGdOrdToken56T(Field source) {
    replace(source, 0, source.length(), beginGdOrdToken56T, GD_ORD_TOKEN_56_T_LEN);
  }

  /**
   * Update GdOrdToken56T with another Field from an offset and length
   *
   * @param value
   */
  public void setGdOrdToken56T(Field source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginGdOrdToken56T, GD_ORD_TOKEN_56_T_LEN);
  }

  /**
   * Update GdOrdToken56T with another Field from an offset and length to an offset and length
   *
   * @param value
   */
  public void setGdOrdToken56T(
      Field source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginGdOrdToken56T + targetIndex, targetLen);
  }

  public static int getGdOrdToken56FieldLength() {
    return GD_ORD_TOKEN_56_LENGTH;
  }
}
