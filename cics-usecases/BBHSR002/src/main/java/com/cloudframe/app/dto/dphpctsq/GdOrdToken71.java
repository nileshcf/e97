package com.cloudframe.app.dto.dphpctsq;

/**
 * The class GdOrdToken71 is used to handle fields declared in it
 *
 * @author CloudFrame Inc. created on 2025-03-25 at 08:30. using version 5.0.0.231
 */
import com.cloudframe.app.data.Field;
import com.cloudframe.app.dto.serialize.dphpctsq.*;
import com.cloudframe.app.exception.CFException;

public class GdOrdToken71 extends GdOrdToken71Serialized {

  private short gdOrdToken71L;

  private char[] gdOrdToken71T = Field.fillLowValue(515);

  /** Constructor for GdOrdToken71 */
  public GdOrdToken71() {
    // TO-DO auto generated code
  }

  /**
   * Constructor for GdOrdToken71. sets the parent value to the parent
   *
   * @param parent
   * @param begin
   */
  public GdOrdToken71(Field parent, int begin) {
    setParent(parent, begin);
  }

  /**
   * Returns the value of gdOrdToken71L
   *
   * @return gdOrdToken71L
   */
  public short getGdOrdToken71L() throws CFException {
    if (isGdOrdToken71LModified()) {
      gdOrdToken71L = refreshGdOrdToken71L();
    }
    return gdOrdToken71L;
  }

  /**
   * Update GdOrdToken71L with the passed value Corresponding COBOL Variable is GD-ORD-TOKEN-71-L
   *
   * @param number
   */
  public void setGdOrdToken71L(short number) {
    // Truncate if the number is beyond +/- Max range
    gdOrdToken71L = checkGdOrdToken71LMaxLimit(number);
    serializeGdOrdToken71L(gdOrdToken71L);
  }

  public void setGdOrdToken71L(int number) {
    number =
        checkGdOrdToken71LMaxLimit((short) number); // Truncate if value is beyond +/- Max range
    setGdOrdToken71L((short) number);
  }

  public void setGdOrdToken71L(long number) {
    number =
        checkGdOrdToken71LMaxLimit((short) number); // Truncate if value is beyond +/- Max range
    setGdOrdToken71L((short) number);
  }

  /**
   * Returns the value of gdOrdToken71T
   *
   * @return gdOrdToken71T
   */
  public char[] getGdOrdToken71T() throws CFException {
    if (isGdOrdToken71TModified()) {
      gdOrdToken71T = refreshGdOrdToken71T();
    }
    return gdOrdToken71T;
  }

  /**
   * set variable gdOrdToken71T Corresponding COBOL Variable is GD-ORD-TOKEN-71-T
   *
   * @param value
   */
  public void setGdOrdToken71T(char[] value) {
    gdOrdToken71T = checkGdOrdToken71TConstraints(value);
    serializeGdOrdToken71T(gdOrdToken71T);
  }

  /**
   * Update GdOrdToken71T with a char[] from an offset and length
   *
   * @param value
   */
  public void setGdOrdToken71T(char[] source, int sourceIndex) {
    replace(source, sourceIndex, source.length, beginGdOrdToken71T, gdOrdToken71T.length);
  }

  public void setGdOrdToken71T(char[] source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginGdOrdToken71T, gdOrdToken71T.length);
  }

  /**
   * Update GdOrdToken71T with a char[] from an offset and length to an offset and length
   *
   * @param value
   */
  public void setGdOrdToken71T(
      char[] source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginGdOrdToken71T + targetIndex, targetLen);
  }

  /**
   * Update GdOrdToken71T with another Field
   *
   * @param value
   */
  public void setGdOrdToken71T(Field source) {
    replace(source, 0, source.length(), beginGdOrdToken71T, GD_ORD_TOKEN_71_T_LEN);
  }

  /**
   * Update GdOrdToken71T with another Field from an offset and length
   *
   * @param value
   */
  public void setGdOrdToken71T(Field source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginGdOrdToken71T, GD_ORD_TOKEN_71_T_LEN);
  }

  /**
   * Update GdOrdToken71T with another Field from an offset and length to an offset and length
   *
   * @param value
   */
  public void setGdOrdToken71T(
      Field source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginGdOrdToken71T + targetIndex, targetLen);
  }

  public static int getGdOrdToken71FieldLength() {
    return GD_ORD_TOKEN_71_LENGTH;
  }
}
