package com.cloudframe.app.dto.dphpctsq;

/**
 * The class GdOrdToken44 is used to handle fields declared in it
 *
 * @author CloudFrame Inc. created on 2025-03-25 at 08:30. using version 5.0.0.231
 */
import com.cloudframe.app.data.Field;
import com.cloudframe.app.dto.serialize.dphpctsq.*;
import com.cloudframe.app.exception.CFException;

public class GdOrdToken44 extends GdOrdToken44Serialized {

  private short gdOrdToken44L;

  private char[] gdOrdToken44T = Field.fillLowValue(515);

  /** Constructor for GdOrdToken44 */
  public GdOrdToken44() {
    // TO-DO auto generated code
  }

  /**
   * Constructor for GdOrdToken44. sets the parent value to the parent
   *
   * @param parent
   * @param begin
   */
  public GdOrdToken44(Field parent, int begin) {
    setParent(parent, begin);
  }

  /**
   * Returns the value of gdOrdToken44L
   *
   * @return gdOrdToken44L
   */
  public short getGdOrdToken44L() throws CFException {
    if (isGdOrdToken44LModified()) {
      gdOrdToken44L = refreshGdOrdToken44L();
    }
    return gdOrdToken44L;
  }

  /**
   * Update GdOrdToken44L with the passed value Corresponding COBOL Variable is GD-ORD-TOKEN-44-L
   *
   * @param number
   */
  public void setGdOrdToken44L(short number) {
    // Truncate if the number is beyond +/- Max range
    gdOrdToken44L = checkGdOrdToken44LMaxLimit(number);
    serializeGdOrdToken44L(gdOrdToken44L);
  }

  public void setGdOrdToken44L(int number) {
    number =
        checkGdOrdToken44LMaxLimit((short) number); // Truncate if value is beyond +/- Max range
    setGdOrdToken44L((short) number);
  }

  public void setGdOrdToken44L(long number) {
    number =
        checkGdOrdToken44LMaxLimit((short) number); // Truncate if value is beyond +/- Max range
    setGdOrdToken44L((short) number);
  }

  /**
   * Returns the value of gdOrdToken44T
   *
   * @return gdOrdToken44T
   */
  public char[] getGdOrdToken44T() throws CFException {
    if (isGdOrdToken44TModified()) {
      gdOrdToken44T = refreshGdOrdToken44T();
    }
    return gdOrdToken44T;
  }

  /**
   * set variable gdOrdToken44T Corresponding COBOL Variable is GD-ORD-TOKEN-44-T
   *
   * @param value
   */
  public void setGdOrdToken44T(char[] value) {
    gdOrdToken44T = checkGdOrdToken44TConstraints(value);
    serializeGdOrdToken44T(gdOrdToken44T);
  }

  /**
   * Update GdOrdToken44T with a char[] from an offset and length
   *
   * @param value
   */
  public void setGdOrdToken44T(char[] source, int sourceIndex) {
    replace(source, sourceIndex, source.length, beginGdOrdToken44T, gdOrdToken44T.length);
  }

  public void setGdOrdToken44T(char[] source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginGdOrdToken44T, gdOrdToken44T.length);
  }

  /**
   * Update GdOrdToken44T with a char[] from an offset and length to an offset and length
   *
   * @param value
   */
  public void setGdOrdToken44T(
      char[] source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginGdOrdToken44T + targetIndex, targetLen);
  }

  /**
   * Update GdOrdToken44T with another Field
   *
   * @param value
   */
  public void setGdOrdToken44T(Field source) {
    replace(source, 0, source.length(), beginGdOrdToken44T, GD_ORD_TOKEN_44_T_LEN);
  }

  /**
   * Update GdOrdToken44T with another Field from an offset and length
   *
   * @param value
   */
  public void setGdOrdToken44T(Field source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginGdOrdToken44T, GD_ORD_TOKEN_44_T_LEN);
  }

  /**
   * Update GdOrdToken44T with another Field from an offset and length to an offset and length
   *
   * @param value
   */
  public void setGdOrdToken44T(
      Field source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginGdOrdToken44T + targetIndex, targetLen);
  }

  public static int getGdOrdToken44FieldLength() {
    return GD_ORD_TOKEN_44_LENGTH;
  }
}
