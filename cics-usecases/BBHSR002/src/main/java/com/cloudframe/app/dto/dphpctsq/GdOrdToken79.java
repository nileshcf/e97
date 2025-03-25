package com.cloudframe.app.dto.dphpctsq;

/**
 * The class GdOrdToken79 is used to handle fields declared in it
 *
 * @author CloudFrame Inc. created on 2025-03-25 at 08:30. using version 5.0.0.231
 */
import com.cloudframe.app.data.Field;
import com.cloudframe.app.dto.serialize.dphpctsq.*;
import com.cloudframe.app.exception.CFException;

public class GdOrdToken79 extends GdOrdToken79Serialized {

  private short gdOrdToken79L;

  private char[] gdOrdToken79T = Field.fillLowValue(515);

  /** Constructor for GdOrdToken79 */
  public GdOrdToken79() {
    // TO-DO auto generated code
  }

  /**
   * Constructor for GdOrdToken79. sets the parent value to the parent
   *
   * @param parent
   * @param begin
   */
  public GdOrdToken79(Field parent, int begin) {
    setParent(parent, begin);
  }

  /**
   * Returns the value of gdOrdToken79L
   *
   * @return gdOrdToken79L
   */
  public short getGdOrdToken79L() throws CFException {
    if (isGdOrdToken79LModified()) {
      gdOrdToken79L = refreshGdOrdToken79L();
    }
    return gdOrdToken79L;
  }

  /**
   * Update GdOrdToken79L with the passed value Corresponding COBOL Variable is GD-ORD-TOKEN-79-L
   *
   * @param number
   */
  public void setGdOrdToken79L(short number) {
    // Truncate if the number is beyond +/- Max range
    gdOrdToken79L = checkGdOrdToken79LMaxLimit(number);
    serializeGdOrdToken79L(gdOrdToken79L);
  }

  public void setGdOrdToken79L(int number) {
    number =
        checkGdOrdToken79LMaxLimit((short) number); // Truncate if value is beyond +/- Max range
    setGdOrdToken79L((short) number);
  }

  public void setGdOrdToken79L(long number) {
    number =
        checkGdOrdToken79LMaxLimit((short) number); // Truncate if value is beyond +/- Max range
    setGdOrdToken79L((short) number);
  }

  /**
   * Returns the value of gdOrdToken79T
   *
   * @return gdOrdToken79T
   */
  public char[] getGdOrdToken79T() throws CFException {
    if (isGdOrdToken79TModified()) {
      gdOrdToken79T = refreshGdOrdToken79T();
    }
    return gdOrdToken79T;
  }

  /**
   * set variable gdOrdToken79T Corresponding COBOL Variable is GD-ORD-TOKEN-79-T
   *
   * @param value
   */
  public void setGdOrdToken79T(char[] value) {
    gdOrdToken79T = checkGdOrdToken79TConstraints(value);
    serializeGdOrdToken79T(gdOrdToken79T);
  }

  /**
   * Update GdOrdToken79T with a char[] from an offset and length
   *
   * @param value
   */
  public void setGdOrdToken79T(char[] source, int sourceIndex) {
    replace(source, sourceIndex, source.length, beginGdOrdToken79T, gdOrdToken79T.length);
  }

  public void setGdOrdToken79T(char[] source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginGdOrdToken79T, gdOrdToken79T.length);
  }

  /**
   * Update GdOrdToken79T with a char[] from an offset and length to an offset and length
   *
   * @param value
   */
  public void setGdOrdToken79T(
      char[] source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginGdOrdToken79T + targetIndex, targetLen);
  }

  /**
   * Update GdOrdToken79T with another Field
   *
   * @param value
   */
  public void setGdOrdToken79T(Field source) {
    replace(source, 0, source.length(), beginGdOrdToken79T, GD_ORD_TOKEN_79_T_LEN);
  }

  /**
   * Update GdOrdToken79T with another Field from an offset and length
   *
   * @param value
   */
  public void setGdOrdToken79T(Field source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginGdOrdToken79T, GD_ORD_TOKEN_79_T_LEN);
  }

  /**
   * Update GdOrdToken79T with another Field from an offset and length to an offset and length
   *
   * @param value
   */
  public void setGdOrdToken79T(
      Field source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginGdOrdToken79T + targetIndex, targetLen);
  }

  public static int getGdOrdToken79FieldLength() {
    return GD_ORD_TOKEN_79_LENGTH;
  }
}
