package com.cloudframe.app.dto.dphpctsq;

/**
 * The class GdOrdToken19 is used to handle fields declared in it
 *
 * @author CloudFrame Inc. created on 2025-03-25 at 08:30. using version 5.0.0.231
 */
import com.cloudframe.app.data.Field;
import com.cloudframe.app.dto.serialize.dphpctsq.*;
import com.cloudframe.app.exception.CFException;

public class GdOrdToken19 extends GdOrdToken19Serialized {

  private short gdOrdToken19L;

  private char[] gdOrdToken19T = Field.fillLowValue(515);

  /** Constructor for GdOrdToken19 */
  public GdOrdToken19() {
    // TO-DO auto generated code
  }

  /**
   * Constructor for GdOrdToken19. sets the parent value to the parent
   *
   * @param parent
   * @param begin
   */
  public GdOrdToken19(Field parent, int begin) {
    setParent(parent, begin);
  }

  /**
   * Returns the value of gdOrdToken19L
   *
   * @return gdOrdToken19L
   */
  public short getGdOrdToken19L() throws CFException {
    if (isGdOrdToken19LModified()) {
      gdOrdToken19L = refreshGdOrdToken19L();
    }
    return gdOrdToken19L;
  }

  /**
   * Update GdOrdToken19L with the passed value Corresponding COBOL Variable is GD-ORD-TOKEN-19-L
   *
   * @param number
   */
  public void setGdOrdToken19L(short number) {
    // Truncate if the number is beyond +/- Max range
    gdOrdToken19L = checkGdOrdToken19LMaxLimit(number);
    serializeGdOrdToken19L(gdOrdToken19L);
  }

  public void setGdOrdToken19L(int number) {
    number =
        checkGdOrdToken19LMaxLimit((short) number); // Truncate if value is beyond +/- Max range
    setGdOrdToken19L((short) number);
  }

  public void setGdOrdToken19L(long number) {
    number =
        checkGdOrdToken19LMaxLimit((short) number); // Truncate if value is beyond +/- Max range
    setGdOrdToken19L((short) number);
  }

  /**
   * Returns the value of gdOrdToken19T
   *
   * @return gdOrdToken19T
   */
  public char[] getGdOrdToken19T() throws CFException {
    if (isGdOrdToken19TModified()) {
      gdOrdToken19T = refreshGdOrdToken19T();
    }
    return gdOrdToken19T;
  }

  /**
   * set variable gdOrdToken19T Corresponding COBOL Variable is GD-ORD-TOKEN-19-T
   *
   * @param value
   */
  public void setGdOrdToken19T(char[] value) {
    gdOrdToken19T = checkGdOrdToken19TConstraints(value);
    serializeGdOrdToken19T(gdOrdToken19T);
  }

  /**
   * Update GdOrdToken19T with a char[] from an offset and length
   *
   * @param value
   */
  public void setGdOrdToken19T(char[] source, int sourceIndex) {
    replace(source, sourceIndex, source.length, beginGdOrdToken19T, gdOrdToken19T.length);
  }

  public void setGdOrdToken19T(char[] source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginGdOrdToken19T, gdOrdToken19T.length);
  }

  /**
   * Update GdOrdToken19T with a char[] from an offset and length to an offset and length
   *
   * @param value
   */
  public void setGdOrdToken19T(
      char[] source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginGdOrdToken19T + targetIndex, targetLen);
  }

  /**
   * Update GdOrdToken19T with another Field
   *
   * @param value
   */
  public void setGdOrdToken19T(Field source) {
    replace(source, 0, source.length(), beginGdOrdToken19T, GD_ORD_TOKEN_19_T_LEN);
  }

  /**
   * Update GdOrdToken19T with another Field from an offset and length
   *
   * @param value
   */
  public void setGdOrdToken19T(Field source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginGdOrdToken19T, GD_ORD_TOKEN_19_T_LEN);
  }

  /**
   * Update GdOrdToken19T with another Field from an offset and length to an offset and length
   *
   * @param value
   */
  public void setGdOrdToken19T(
      Field source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginGdOrdToken19T + targetIndex, targetLen);
  }

  public static int getGdOrdToken19FieldLength() {
    return GD_ORD_TOKEN_19_LENGTH;
  }
}
