package com.cloudframe.app.dto.dphpctsq;

/**
 * The class GdOrdToken72 is used to handle fields declared in it
 *
 * @author CloudFrame Inc. created on 2025-03-25 at 08:30. using version 5.0.0.231
 */
import com.cloudframe.app.data.Field;
import com.cloudframe.app.dto.serialize.dphpctsq.*;
import com.cloudframe.app.exception.CFException;

public class GdOrdToken72 extends GdOrdToken72Serialized {

  private short gdOrdToken72L;

  private char[] gdOrdToken72T = Field.fillLowValue(515);

  /** Constructor for GdOrdToken72 */
  public GdOrdToken72() {
    // TO-DO auto generated code
  }

  /**
   * Constructor for GdOrdToken72. sets the parent value to the parent
   *
   * @param parent
   * @param begin
   */
  public GdOrdToken72(Field parent, int begin) {
    setParent(parent, begin);
  }

  /**
   * Returns the value of gdOrdToken72L
   *
   * @return gdOrdToken72L
   */
  public short getGdOrdToken72L() throws CFException {
    if (isGdOrdToken72LModified()) {
      gdOrdToken72L = refreshGdOrdToken72L();
    }
    return gdOrdToken72L;
  }

  /**
   * Update GdOrdToken72L with the passed value Corresponding COBOL Variable is GD-ORD-TOKEN-72-L
   *
   * @param number
   */
  public void setGdOrdToken72L(short number) {
    // Truncate if the number is beyond +/- Max range
    gdOrdToken72L = checkGdOrdToken72LMaxLimit(number);
    serializeGdOrdToken72L(gdOrdToken72L);
  }

  public void setGdOrdToken72L(int number) {
    number =
        checkGdOrdToken72LMaxLimit((short) number); // Truncate if value is beyond +/- Max range
    setGdOrdToken72L((short) number);
  }

  public void setGdOrdToken72L(long number) {
    number =
        checkGdOrdToken72LMaxLimit((short) number); // Truncate if value is beyond +/- Max range
    setGdOrdToken72L((short) number);
  }

  /**
   * Returns the value of gdOrdToken72T
   *
   * @return gdOrdToken72T
   */
  public char[] getGdOrdToken72T() throws CFException {
    if (isGdOrdToken72TModified()) {
      gdOrdToken72T = refreshGdOrdToken72T();
    }
    return gdOrdToken72T;
  }

  /**
   * set variable gdOrdToken72T Corresponding COBOL Variable is GD-ORD-TOKEN-72-T
   *
   * @param value
   */
  public void setGdOrdToken72T(char[] value) {
    gdOrdToken72T = checkGdOrdToken72TConstraints(value);
    serializeGdOrdToken72T(gdOrdToken72T);
  }

  /**
   * Update GdOrdToken72T with a char[] from an offset and length
   *
   * @param value
   */
  public void setGdOrdToken72T(char[] source, int sourceIndex) {
    replace(source, sourceIndex, source.length, beginGdOrdToken72T, gdOrdToken72T.length);
  }

  public void setGdOrdToken72T(char[] source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginGdOrdToken72T, gdOrdToken72T.length);
  }

  /**
   * Update GdOrdToken72T with a char[] from an offset and length to an offset and length
   *
   * @param value
   */
  public void setGdOrdToken72T(
      char[] source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginGdOrdToken72T + targetIndex, targetLen);
  }

  /**
   * Update GdOrdToken72T with another Field
   *
   * @param value
   */
  public void setGdOrdToken72T(Field source) {
    replace(source, 0, source.length(), beginGdOrdToken72T, GD_ORD_TOKEN_72_T_LEN);
  }

  /**
   * Update GdOrdToken72T with another Field from an offset and length
   *
   * @param value
   */
  public void setGdOrdToken72T(Field source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginGdOrdToken72T, GD_ORD_TOKEN_72_T_LEN);
  }

  /**
   * Update GdOrdToken72T with another Field from an offset and length to an offset and length
   *
   * @param value
   */
  public void setGdOrdToken72T(
      Field source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginGdOrdToken72T + targetIndex, targetLen);
  }

  public static int getGdOrdToken72FieldLength() {
    return GD_ORD_TOKEN_72_LENGTH;
  }
}
