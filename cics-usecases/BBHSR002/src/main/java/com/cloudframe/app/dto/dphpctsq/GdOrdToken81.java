package com.cloudframe.app.dto.dphpctsq;

/**
 * The class GdOrdToken81 is used to handle fields declared in it
 *
 * @author CloudFrame Inc. created on 2025-03-25 at 08:30. using version 5.0.0.231
 */
import com.cloudframe.app.data.Field;
import com.cloudframe.app.dto.serialize.dphpctsq.*;
import com.cloudframe.app.exception.CFException;

public class GdOrdToken81 extends GdOrdToken81Serialized {

  private short gdOrdToken81L;

  private char[] gdOrdToken81T = Field.fillLowValue(515);

  /** Constructor for GdOrdToken81 */
  public GdOrdToken81() {
    // TO-DO auto generated code
  }

  /**
   * Constructor for GdOrdToken81. sets the parent value to the parent
   *
   * @param parent
   * @param begin
   */
  public GdOrdToken81(Field parent, int begin) {
    setParent(parent, begin);
  }

  /**
   * Returns the value of gdOrdToken81L
   *
   * @return gdOrdToken81L
   */
  public short getGdOrdToken81L() throws CFException {
    if (isGdOrdToken81LModified()) {
      gdOrdToken81L = refreshGdOrdToken81L();
    }
    return gdOrdToken81L;
  }

  /**
   * Update GdOrdToken81L with the passed value Corresponding COBOL Variable is GD-ORD-TOKEN-81-L
   *
   * @param number
   */
  public void setGdOrdToken81L(short number) {
    // Truncate if the number is beyond +/- Max range
    gdOrdToken81L = checkGdOrdToken81LMaxLimit(number);
    serializeGdOrdToken81L(gdOrdToken81L);
  }

  public void setGdOrdToken81L(int number) {
    number =
        checkGdOrdToken81LMaxLimit((short) number); // Truncate if value is beyond +/- Max range
    setGdOrdToken81L((short) number);
  }

  public void setGdOrdToken81L(long number) {
    number =
        checkGdOrdToken81LMaxLimit((short) number); // Truncate if value is beyond +/- Max range
    setGdOrdToken81L((short) number);
  }

  /**
   * Returns the value of gdOrdToken81T
   *
   * @return gdOrdToken81T
   */
  public char[] getGdOrdToken81T() throws CFException {
    if (isGdOrdToken81TModified()) {
      gdOrdToken81T = refreshGdOrdToken81T();
    }
    return gdOrdToken81T;
  }

  /**
   * set variable gdOrdToken81T Corresponding COBOL Variable is GD-ORD-TOKEN-81-T
   *
   * @param value
   */
  public void setGdOrdToken81T(char[] value) {
    gdOrdToken81T = checkGdOrdToken81TConstraints(value);
    serializeGdOrdToken81T(gdOrdToken81T);
  }

  /**
   * Update GdOrdToken81T with a char[] from an offset and length
   *
   * @param value
   */
  public void setGdOrdToken81T(char[] source, int sourceIndex) {
    replace(source, sourceIndex, source.length, beginGdOrdToken81T, gdOrdToken81T.length);
  }

  public void setGdOrdToken81T(char[] source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginGdOrdToken81T, gdOrdToken81T.length);
  }

  /**
   * Update GdOrdToken81T with a char[] from an offset and length to an offset and length
   *
   * @param value
   */
  public void setGdOrdToken81T(
      char[] source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginGdOrdToken81T + targetIndex, targetLen);
  }

  /**
   * Update GdOrdToken81T with another Field
   *
   * @param value
   */
  public void setGdOrdToken81T(Field source) {
    replace(source, 0, source.length(), beginGdOrdToken81T, GD_ORD_TOKEN_81_T_LEN);
  }

  /**
   * Update GdOrdToken81T with another Field from an offset and length
   *
   * @param value
   */
  public void setGdOrdToken81T(Field source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginGdOrdToken81T, GD_ORD_TOKEN_81_T_LEN);
  }

  /**
   * Update GdOrdToken81T with another Field from an offset and length to an offset and length
   *
   * @param value
   */
  public void setGdOrdToken81T(
      Field source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginGdOrdToken81T + targetIndex, targetLen);
  }

  public static int getGdOrdToken81FieldLength() {
    return GD_ORD_TOKEN_81_LENGTH;
  }
}
