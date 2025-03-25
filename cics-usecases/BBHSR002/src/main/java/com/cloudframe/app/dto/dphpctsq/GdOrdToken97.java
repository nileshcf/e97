package com.cloudframe.app.dto.dphpctsq;

/**
 * The class GdOrdToken97 is used to handle fields declared in it
 *
 * @author CloudFrame Inc. created on 2025-03-25 at 08:30. using version 5.0.0.231
 */
import com.cloudframe.app.data.Field;
import com.cloudframe.app.dto.serialize.dphpctsq.*;
import com.cloudframe.app.exception.CFException;

public class GdOrdToken97 extends GdOrdToken97Serialized {

  private short gdOrdToken97L;

  private char[] gdOrdToken97T = Field.fillLowValue(515);

  /** Constructor for GdOrdToken97 */
  public GdOrdToken97() {
    // TO-DO auto generated code
  }

  /**
   * Constructor for GdOrdToken97. sets the parent value to the parent
   *
   * @param parent
   * @param begin
   */
  public GdOrdToken97(Field parent, int begin) {
    setParent(parent, begin);
  }

  /**
   * Returns the value of gdOrdToken97L
   *
   * @return gdOrdToken97L
   */
  public short getGdOrdToken97L() throws CFException {
    if (isGdOrdToken97LModified()) {
      gdOrdToken97L = refreshGdOrdToken97L();
    }
    return gdOrdToken97L;
  }

  /**
   * Update GdOrdToken97L with the passed value Corresponding COBOL Variable is GD-ORD-TOKEN-97-L
   *
   * @param number
   */
  public void setGdOrdToken97L(short number) {
    // Truncate if the number is beyond +/- Max range
    gdOrdToken97L = checkGdOrdToken97LMaxLimit(number);
    serializeGdOrdToken97L(gdOrdToken97L);
  }

  public void setGdOrdToken97L(int number) {
    number =
        checkGdOrdToken97LMaxLimit((short) number); // Truncate if value is beyond +/- Max range
    setGdOrdToken97L((short) number);
  }

  public void setGdOrdToken97L(long number) {
    number =
        checkGdOrdToken97LMaxLimit((short) number); // Truncate if value is beyond +/- Max range
    setGdOrdToken97L((short) number);
  }

  /**
   * Returns the value of gdOrdToken97T
   *
   * @return gdOrdToken97T
   */
  public char[] getGdOrdToken97T() throws CFException {
    if (isGdOrdToken97TModified()) {
      gdOrdToken97T = refreshGdOrdToken97T();
    }
    return gdOrdToken97T;
  }

  /**
   * set variable gdOrdToken97T Corresponding COBOL Variable is GD-ORD-TOKEN-97-T
   *
   * @param value
   */
  public void setGdOrdToken97T(char[] value) {
    gdOrdToken97T = checkGdOrdToken97TConstraints(value);
    serializeGdOrdToken97T(gdOrdToken97T);
  }

  /**
   * Update GdOrdToken97T with a char[] from an offset and length
   *
   * @param value
   */
  public void setGdOrdToken97T(char[] source, int sourceIndex) {
    replace(source, sourceIndex, source.length, beginGdOrdToken97T, gdOrdToken97T.length);
  }

  public void setGdOrdToken97T(char[] source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginGdOrdToken97T, gdOrdToken97T.length);
  }

  /**
   * Update GdOrdToken97T with a char[] from an offset and length to an offset and length
   *
   * @param value
   */
  public void setGdOrdToken97T(
      char[] source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginGdOrdToken97T + targetIndex, targetLen);
  }

  /**
   * Update GdOrdToken97T with another Field
   *
   * @param value
   */
  public void setGdOrdToken97T(Field source) {
    replace(source, 0, source.length(), beginGdOrdToken97T, GD_ORD_TOKEN_97_T_LEN);
  }

  /**
   * Update GdOrdToken97T with another Field from an offset and length
   *
   * @param value
   */
  public void setGdOrdToken97T(Field source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginGdOrdToken97T, GD_ORD_TOKEN_97_T_LEN);
  }

  /**
   * Update GdOrdToken97T with another Field from an offset and length to an offset and length
   *
   * @param value
   */
  public void setGdOrdToken97T(
      Field source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginGdOrdToken97T + targetIndex, targetLen);
  }

  public static int getGdOrdToken97FieldLength() {
    return GD_ORD_TOKEN_97_LENGTH;
  }
}
