package com.cloudframe.app.dto.dphpctsq;

/**
 * The class GdOrdToken78 is used to handle fields declared in it
 *
 * @author CloudFrame Inc. created on 2025-03-25 at 08:30. using version 5.0.0.231
 */
import com.cloudframe.app.data.Field;
import com.cloudframe.app.dto.serialize.dphpctsq.*;
import com.cloudframe.app.exception.CFException;

public class GdOrdToken78 extends GdOrdToken78Serialized {

  private short gdOrdToken78L;

  private char[] gdOrdToken78T = Field.fillLowValue(515);

  /** Constructor for GdOrdToken78 */
  public GdOrdToken78() {
    // TO-DO auto generated code
  }

  /**
   * Constructor for GdOrdToken78. sets the parent value to the parent
   *
   * @param parent
   * @param begin
   */
  public GdOrdToken78(Field parent, int begin) {
    setParent(parent, begin);
  }

  /**
   * Returns the value of gdOrdToken78L
   *
   * @return gdOrdToken78L
   */
  public short getGdOrdToken78L() throws CFException {
    if (isGdOrdToken78LModified()) {
      gdOrdToken78L = refreshGdOrdToken78L();
    }
    return gdOrdToken78L;
  }

  /**
   * Update GdOrdToken78L with the passed value Corresponding COBOL Variable is GD-ORD-TOKEN-78-L
   *
   * @param number
   */
  public void setGdOrdToken78L(short number) {
    // Truncate if the number is beyond +/- Max range
    gdOrdToken78L = checkGdOrdToken78LMaxLimit(number);
    serializeGdOrdToken78L(gdOrdToken78L);
  }

  public void setGdOrdToken78L(int number) {
    number =
        checkGdOrdToken78LMaxLimit((short) number); // Truncate if value is beyond +/- Max range
    setGdOrdToken78L((short) number);
  }

  public void setGdOrdToken78L(long number) {
    number =
        checkGdOrdToken78LMaxLimit((short) number); // Truncate if value is beyond +/- Max range
    setGdOrdToken78L((short) number);
  }

  /**
   * Returns the value of gdOrdToken78T
   *
   * @return gdOrdToken78T
   */
  public char[] getGdOrdToken78T() throws CFException {
    if (isGdOrdToken78TModified()) {
      gdOrdToken78T = refreshGdOrdToken78T();
    }
    return gdOrdToken78T;
  }

  /**
   * set variable gdOrdToken78T Corresponding COBOL Variable is GD-ORD-TOKEN-78-T
   *
   * @param value
   */
  public void setGdOrdToken78T(char[] value) {
    gdOrdToken78T = checkGdOrdToken78TConstraints(value);
    serializeGdOrdToken78T(gdOrdToken78T);
  }

  /**
   * Update GdOrdToken78T with a char[] from an offset and length
   *
   * @param value
   */
  public void setGdOrdToken78T(char[] source, int sourceIndex) {
    replace(source, sourceIndex, source.length, beginGdOrdToken78T, gdOrdToken78T.length);
  }

  public void setGdOrdToken78T(char[] source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginGdOrdToken78T, gdOrdToken78T.length);
  }

  /**
   * Update GdOrdToken78T with a char[] from an offset and length to an offset and length
   *
   * @param value
   */
  public void setGdOrdToken78T(
      char[] source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginGdOrdToken78T + targetIndex, targetLen);
  }

  /**
   * Update GdOrdToken78T with another Field
   *
   * @param value
   */
  public void setGdOrdToken78T(Field source) {
    replace(source, 0, source.length(), beginGdOrdToken78T, GD_ORD_TOKEN_78_T_LEN);
  }

  /**
   * Update GdOrdToken78T with another Field from an offset and length
   *
   * @param value
   */
  public void setGdOrdToken78T(Field source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginGdOrdToken78T, GD_ORD_TOKEN_78_T_LEN);
  }

  /**
   * Update GdOrdToken78T with another Field from an offset and length to an offset and length
   *
   * @param value
   */
  public void setGdOrdToken78T(
      Field source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginGdOrdToken78T + targetIndex, targetLen);
  }

  public static int getGdOrdToken78FieldLength() {
    return GD_ORD_TOKEN_78_LENGTH;
  }
}
