package com.cloudframe.app.dto.dphpctsq;

/**
 * The class GdOrdToken57 is used to handle fields declared in it
 *
 * @author CloudFrame Inc. created on 2025-03-25 at 08:30. using version 5.0.0.231
 */
import com.cloudframe.app.data.Field;
import com.cloudframe.app.dto.serialize.dphpctsq.*;
import com.cloudframe.app.exception.CFException;

public class GdOrdToken57 extends GdOrdToken57Serialized {

  private short gdOrdToken57L;

  private char[] gdOrdToken57T = Field.fillLowValue(515);

  /** Constructor for GdOrdToken57 */
  public GdOrdToken57() {
    // TO-DO auto generated code
  }

  /**
   * Constructor for GdOrdToken57. sets the parent value to the parent
   *
   * @param parent
   * @param begin
   */
  public GdOrdToken57(Field parent, int begin) {
    setParent(parent, begin);
  }

  /**
   * Returns the value of gdOrdToken57L
   *
   * @return gdOrdToken57L
   */
  public short getGdOrdToken57L() throws CFException {
    if (isGdOrdToken57LModified()) {
      gdOrdToken57L = refreshGdOrdToken57L();
    }
    return gdOrdToken57L;
  }

  /**
   * Update GdOrdToken57L with the passed value Corresponding COBOL Variable is GD-ORD-TOKEN-57-L
   *
   * @param number
   */
  public void setGdOrdToken57L(short number) {
    // Truncate if the number is beyond +/- Max range
    gdOrdToken57L = checkGdOrdToken57LMaxLimit(number);
    serializeGdOrdToken57L(gdOrdToken57L);
  }

  public void setGdOrdToken57L(int number) {
    number =
        checkGdOrdToken57LMaxLimit((short) number); // Truncate if value is beyond +/- Max range
    setGdOrdToken57L((short) number);
  }

  public void setGdOrdToken57L(long number) {
    number =
        checkGdOrdToken57LMaxLimit((short) number); // Truncate if value is beyond +/- Max range
    setGdOrdToken57L((short) number);
  }

  /**
   * Returns the value of gdOrdToken57T
   *
   * @return gdOrdToken57T
   */
  public char[] getGdOrdToken57T() throws CFException {
    if (isGdOrdToken57TModified()) {
      gdOrdToken57T = refreshGdOrdToken57T();
    }
    return gdOrdToken57T;
  }

  /**
   * set variable gdOrdToken57T Corresponding COBOL Variable is GD-ORD-TOKEN-57-T
   *
   * @param value
   */
  public void setGdOrdToken57T(char[] value) {
    gdOrdToken57T = checkGdOrdToken57TConstraints(value);
    serializeGdOrdToken57T(gdOrdToken57T);
  }

  /**
   * Update GdOrdToken57T with a char[] from an offset and length
   *
   * @param value
   */
  public void setGdOrdToken57T(char[] source, int sourceIndex) {
    replace(source, sourceIndex, source.length, beginGdOrdToken57T, gdOrdToken57T.length);
  }

  public void setGdOrdToken57T(char[] source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginGdOrdToken57T, gdOrdToken57T.length);
  }

  /**
   * Update GdOrdToken57T with a char[] from an offset and length to an offset and length
   *
   * @param value
   */
  public void setGdOrdToken57T(
      char[] source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginGdOrdToken57T + targetIndex, targetLen);
  }

  /**
   * Update GdOrdToken57T with another Field
   *
   * @param value
   */
  public void setGdOrdToken57T(Field source) {
    replace(source, 0, source.length(), beginGdOrdToken57T, GD_ORD_TOKEN_57_T_LEN);
  }

  /**
   * Update GdOrdToken57T with another Field from an offset and length
   *
   * @param value
   */
  public void setGdOrdToken57T(Field source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginGdOrdToken57T, GD_ORD_TOKEN_57_T_LEN);
  }

  /**
   * Update GdOrdToken57T with another Field from an offset and length to an offset and length
   *
   * @param value
   */
  public void setGdOrdToken57T(
      Field source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginGdOrdToken57T + targetIndex, targetLen);
  }

  public static int getGdOrdToken57FieldLength() {
    return GD_ORD_TOKEN_57_LENGTH;
  }
}
