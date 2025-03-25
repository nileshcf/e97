package com.cloudframe.app.dto.dphpctsq;

/**
 * The class GdOrdToken12 is used to handle fields declared in it
 *
 * @author CloudFrame Inc. created on 2025-03-25 at 08:30. using version 5.0.0.231
 */
import com.cloudframe.app.data.Field;
import com.cloudframe.app.dto.serialize.dphpctsq.*;
import com.cloudframe.app.exception.CFException;

public class GdOrdToken12 extends GdOrdToken12Serialized {

  private short gdOrdToken12L;

  private char[] gdOrdToken12T = Field.fillLowValue(515);

  /** Constructor for GdOrdToken12 */
  public GdOrdToken12() {
    // TO-DO auto generated code
  }

  /**
   * Constructor for GdOrdToken12. sets the parent value to the parent
   *
   * @param parent
   * @param begin
   */
  public GdOrdToken12(Field parent, int begin) {
    setParent(parent, begin);
  }

  /**
   * Returns the value of gdOrdToken12L
   *
   * @return gdOrdToken12L
   */
  public short getGdOrdToken12L() throws CFException {
    if (isGdOrdToken12LModified()) {
      gdOrdToken12L = refreshGdOrdToken12L();
    }
    return gdOrdToken12L;
  }

  /**
   * Update GdOrdToken12L with the passed value Corresponding COBOL Variable is GD-ORD-TOKEN-12-L
   *
   * @param number
   */
  public void setGdOrdToken12L(short number) {
    // Truncate if the number is beyond +/- Max range
    gdOrdToken12L = checkGdOrdToken12LMaxLimit(number);
    serializeGdOrdToken12L(gdOrdToken12L);
  }

  public void setGdOrdToken12L(int number) {
    number =
        checkGdOrdToken12LMaxLimit((short) number); // Truncate if value is beyond +/- Max range
    setGdOrdToken12L((short) number);
  }

  public void setGdOrdToken12L(long number) {
    number =
        checkGdOrdToken12LMaxLimit((short) number); // Truncate if value is beyond +/- Max range
    setGdOrdToken12L((short) number);
  }

  /**
   * Returns the value of gdOrdToken12T
   *
   * @return gdOrdToken12T
   */
  public char[] getGdOrdToken12T() throws CFException {
    if (isGdOrdToken12TModified()) {
      gdOrdToken12T = refreshGdOrdToken12T();
    }
    return gdOrdToken12T;
  }

  /**
   * set variable gdOrdToken12T Corresponding COBOL Variable is GD-ORD-TOKEN-12-T
   *
   * @param value
   */
  public void setGdOrdToken12T(char[] value) {
    gdOrdToken12T = checkGdOrdToken12TConstraints(value);
    serializeGdOrdToken12T(gdOrdToken12T);
  }

  /**
   * Update GdOrdToken12T with a char[] from an offset and length
   *
   * @param value
   */
  public void setGdOrdToken12T(char[] source, int sourceIndex) {
    replace(source, sourceIndex, source.length, beginGdOrdToken12T, gdOrdToken12T.length);
  }

  public void setGdOrdToken12T(char[] source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginGdOrdToken12T, gdOrdToken12T.length);
  }

  /**
   * Update GdOrdToken12T with a char[] from an offset and length to an offset and length
   *
   * @param value
   */
  public void setGdOrdToken12T(
      char[] source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginGdOrdToken12T + targetIndex, targetLen);
  }

  /**
   * Update GdOrdToken12T with another Field
   *
   * @param value
   */
  public void setGdOrdToken12T(Field source) {
    replace(source, 0, source.length(), beginGdOrdToken12T, GD_ORD_TOKEN_12_T_LEN);
  }

  /**
   * Update GdOrdToken12T with another Field from an offset and length
   *
   * @param value
   */
  public void setGdOrdToken12T(Field source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginGdOrdToken12T, GD_ORD_TOKEN_12_T_LEN);
  }

  /**
   * Update GdOrdToken12T with another Field from an offset and length to an offset and length
   *
   * @param value
   */
  public void setGdOrdToken12T(
      Field source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginGdOrdToken12T + targetIndex, targetLen);
  }

  public static int getGdOrdToken12FieldLength() {
    return GD_ORD_TOKEN_12_LENGTH;
  }
}
