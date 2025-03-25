package com.cloudframe.app.dto.dphpctsq;

/**
 * The class GdOrdToken73 is used to handle fields declared in it
 *
 * @author CloudFrame Inc. created on 2025-03-25 at 08:30. using version 5.0.0.231
 */
import com.cloudframe.app.data.Field;
import com.cloudframe.app.dto.serialize.dphpctsq.*;
import com.cloudframe.app.exception.CFException;

public class GdOrdToken73 extends GdOrdToken73Serialized {

  private short gdOrdToken73L;

  private char[] gdOrdToken73T = Field.fillLowValue(515);

  /** Constructor for GdOrdToken73 */
  public GdOrdToken73() {
    // TO-DO auto generated code
  }

  /**
   * Constructor for GdOrdToken73. sets the parent value to the parent
   *
   * @param parent
   * @param begin
   */
  public GdOrdToken73(Field parent, int begin) {
    setParent(parent, begin);
  }

  /**
   * Returns the value of gdOrdToken73L
   *
   * @return gdOrdToken73L
   */
  public short getGdOrdToken73L() throws CFException {
    if (isGdOrdToken73LModified()) {
      gdOrdToken73L = refreshGdOrdToken73L();
    }
    return gdOrdToken73L;
  }

  /**
   * Update GdOrdToken73L with the passed value Corresponding COBOL Variable is GD-ORD-TOKEN-73-L
   *
   * @param number
   */
  public void setGdOrdToken73L(short number) {
    // Truncate if the number is beyond +/- Max range
    gdOrdToken73L = checkGdOrdToken73LMaxLimit(number);
    serializeGdOrdToken73L(gdOrdToken73L);
  }

  public void setGdOrdToken73L(int number) {
    number =
        checkGdOrdToken73LMaxLimit((short) number); // Truncate if value is beyond +/- Max range
    setGdOrdToken73L((short) number);
  }

  public void setGdOrdToken73L(long number) {
    number =
        checkGdOrdToken73LMaxLimit((short) number); // Truncate if value is beyond +/- Max range
    setGdOrdToken73L((short) number);
  }

  /**
   * Returns the value of gdOrdToken73T
   *
   * @return gdOrdToken73T
   */
  public char[] getGdOrdToken73T() throws CFException {
    if (isGdOrdToken73TModified()) {
      gdOrdToken73T = refreshGdOrdToken73T();
    }
    return gdOrdToken73T;
  }

  /**
   * set variable gdOrdToken73T Corresponding COBOL Variable is GD-ORD-TOKEN-73-T
   *
   * @param value
   */
  public void setGdOrdToken73T(char[] value) {
    gdOrdToken73T = checkGdOrdToken73TConstraints(value);
    serializeGdOrdToken73T(gdOrdToken73T);
  }

  /**
   * Update GdOrdToken73T with a char[] from an offset and length
   *
   * @param value
   */
  public void setGdOrdToken73T(char[] source, int sourceIndex) {
    replace(source, sourceIndex, source.length, beginGdOrdToken73T, gdOrdToken73T.length);
  }

  public void setGdOrdToken73T(char[] source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginGdOrdToken73T, gdOrdToken73T.length);
  }

  /**
   * Update GdOrdToken73T with a char[] from an offset and length to an offset and length
   *
   * @param value
   */
  public void setGdOrdToken73T(
      char[] source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginGdOrdToken73T + targetIndex, targetLen);
  }

  /**
   * Update GdOrdToken73T with another Field
   *
   * @param value
   */
  public void setGdOrdToken73T(Field source) {
    replace(source, 0, source.length(), beginGdOrdToken73T, GD_ORD_TOKEN_73_T_LEN);
  }

  /**
   * Update GdOrdToken73T with another Field from an offset and length
   *
   * @param value
   */
  public void setGdOrdToken73T(Field source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginGdOrdToken73T, GD_ORD_TOKEN_73_T_LEN);
  }

  /**
   * Update GdOrdToken73T with another Field from an offset and length to an offset and length
   *
   * @param value
   */
  public void setGdOrdToken73T(
      Field source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginGdOrdToken73T + targetIndex, targetLen);
  }

  public static int getGdOrdToken73FieldLength() {
    return GD_ORD_TOKEN_73_LENGTH;
  }
}
