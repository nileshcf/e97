package com.cloudframe.app.dto.dphpctsq;

/**
 * The class GdOrdToken82 is used to handle fields declared in it
 *
 * @author CloudFrame Inc. created on 2025-03-25 at 08:30. using version 5.0.0.231
 */
import com.cloudframe.app.data.Field;
import com.cloudframe.app.dto.serialize.dphpctsq.*;
import com.cloudframe.app.exception.CFException;

public class GdOrdToken82 extends GdOrdToken82Serialized {

  private short gdOrdToken82L;

  private char[] gdOrdToken82T = Field.fillLowValue(515);

  /** Constructor for GdOrdToken82 */
  public GdOrdToken82() {
    // TO-DO auto generated code
  }

  /**
   * Constructor for GdOrdToken82. sets the parent value to the parent
   *
   * @param parent
   * @param begin
   */
  public GdOrdToken82(Field parent, int begin) {
    setParent(parent, begin);
  }

  /**
   * Returns the value of gdOrdToken82L
   *
   * @return gdOrdToken82L
   */
  public short getGdOrdToken82L() throws CFException {
    if (isGdOrdToken82LModified()) {
      gdOrdToken82L = refreshGdOrdToken82L();
    }
    return gdOrdToken82L;
  }

  /**
   * Update GdOrdToken82L with the passed value Corresponding COBOL Variable is GD-ORD-TOKEN-82-L
   *
   * @param number
   */
  public void setGdOrdToken82L(short number) {
    // Truncate if the number is beyond +/- Max range
    gdOrdToken82L = checkGdOrdToken82LMaxLimit(number);
    serializeGdOrdToken82L(gdOrdToken82L);
  }

  public void setGdOrdToken82L(int number) {
    number =
        checkGdOrdToken82LMaxLimit((short) number); // Truncate if value is beyond +/- Max range
    setGdOrdToken82L((short) number);
  }

  public void setGdOrdToken82L(long number) {
    number =
        checkGdOrdToken82LMaxLimit((short) number); // Truncate if value is beyond +/- Max range
    setGdOrdToken82L((short) number);
  }

  /**
   * Returns the value of gdOrdToken82T
   *
   * @return gdOrdToken82T
   */
  public char[] getGdOrdToken82T() throws CFException {
    if (isGdOrdToken82TModified()) {
      gdOrdToken82T = refreshGdOrdToken82T();
    }
    return gdOrdToken82T;
  }

  /**
   * set variable gdOrdToken82T Corresponding COBOL Variable is GD-ORD-TOKEN-82-T
   *
   * @param value
   */
  public void setGdOrdToken82T(char[] value) {
    gdOrdToken82T = checkGdOrdToken82TConstraints(value);
    serializeGdOrdToken82T(gdOrdToken82T);
  }

  /**
   * Update GdOrdToken82T with a char[] from an offset and length
   *
   * @param value
   */
  public void setGdOrdToken82T(char[] source, int sourceIndex) {
    replace(source, sourceIndex, source.length, beginGdOrdToken82T, gdOrdToken82T.length);
  }

  public void setGdOrdToken82T(char[] source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginGdOrdToken82T, gdOrdToken82T.length);
  }

  /**
   * Update GdOrdToken82T with a char[] from an offset and length to an offset and length
   *
   * @param value
   */
  public void setGdOrdToken82T(
      char[] source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginGdOrdToken82T + targetIndex, targetLen);
  }

  /**
   * Update GdOrdToken82T with another Field
   *
   * @param value
   */
  public void setGdOrdToken82T(Field source) {
    replace(source, 0, source.length(), beginGdOrdToken82T, GD_ORD_TOKEN_82_T_LEN);
  }

  /**
   * Update GdOrdToken82T with another Field from an offset and length
   *
   * @param value
   */
  public void setGdOrdToken82T(Field source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginGdOrdToken82T, GD_ORD_TOKEN_82_T_LEN);
  }

  /**
   * Update GdOrdToken82T with another Field from an offset and length to an offset and length
   *
   * @param value
   */
  public void setGdOrdToken82T(
      Field source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginGdOrdToken82T + targetIndex, targetLen);
  }

  public static int getGdOrdToken82FieldLength() {
    return GD_ORD_TOKEN_82_LENGTH;
  }
}
