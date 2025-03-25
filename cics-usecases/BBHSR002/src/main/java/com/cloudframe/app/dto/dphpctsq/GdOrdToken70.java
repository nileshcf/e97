package com.cloudframe.app.dto.dphpctsq;

/**
 * The class GdOrdToken70 is used to handle fields declared in it
 *
 * @author CloudFrame Inc. created on 2025-03-25 at 08:30. using version 5.0.0.231
 */
import com.cloudframe.app.data.Field;
import com.cloudframe.app.dto.serialize.dphpctsq.*;
import com.cloudframe.app.exception.CFException;

public class GdOrdToken70 extends GdOrdToken70Serialized {

  private short gdOrdToken70L;

  private char[] gdOrdToken70T = Field.fillLowValue(515);

  /** Constructor for GdOrdToken70 */
  public GdOrdToken70() {
    // TO-DO auto generated code
  }

  /**
   * Constructor for GdOrdToken70. sets the parent value to the parent
   *
   * @param parent
   * @param begin
   */
  public GdOrdToken70(Field parent, int begin) {
    setParent(parent, begin);
  }

  /**
   * Returns the value of gdOrdToken70L
   *
   * @return gdOrdToken70L
   */
  public short getGdOrdToken70L() throws CFException {
    if (isGdOrdToken70LModified()) {
      gdOrdToken70L = refreshGdOrdToken70L();
    }
    return gdOrdToken70L;
  }

  /**
   * Update GdOrdToken70L with the passed value Corresponding COBOL Variable is GD-ORD-TOKEN-70-L
   *
   * @param number
   */
  public void setGdOrdToken70L(short number) {
    // Truncate if the number is beyond +/- Max range
    gdOrdToken70L = checkGdOrdToken70LMaxLimit(number);
    serializeGdOrdToken70L(gdOrdToken70L);
  }

  public void setGdOrdToken70L(int number) {
    number =
        checkGdOrdToken70LMaxLimit((short) number); // Truncate if value is beyond +/- Max range
    setGdOrdToken70L((short) number);
  }

  public void setGdOrdToken70L(long number) {
    number =
        checkGdOrdToken70LMaxLimit((short) number); // Truncate if value is beyond +/- Max range
    setGdOrdToken70L((short) number);
  }

  /**
   * Returns the value of gdOrdToken70T
   *
   * @return gdOrdToken70T
   */
  public char[] getGdOrdToken70T() throws CFException {
    if (isGdOrdToken70TModified()) {
      gdOrdToken70T = refreshGdOrdToken70T();
    }
    return gdOrdToken70T;
  }

  /**
   * set variable gdOrdToken70T Corresponding COBOL Variable is GD-ORD-TOKEN-70-T
   *
   * @param value
   */
  public void setGdOrdToken70T(char[] value) {
    gdOrdToken70T = checkGdOrdToken70TConstraints(value);
    serializeGdOrdToken70T(gdOrdToken70T);
  }

  /**
   * Update GdOrdToken70T with a char[] from an offset and length
   *
   * @param value
   */
  public void setGdOrdToken70T(char[] source, int sourceIndex) {
    replace(source, sourceIndex, source.length, beginGdOrdToken70T, gdOrdToken70T.length);
  }

  public void setGdOrdToken70T(char[] source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginGdOrdToken70T, gdOrdToken70T.length);
  }

  /**
   * Update GdOrdToken70T with a char[] from an offset and length to an offset and length
   *
   * @param value
   */
  public void setGdOrdToken70T(
      char[] source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginGdOrdToken70T + targetIndex, targetLen);
  }

  /**
   * Update GdOrdToken70T with another Field
   *
   * @param value
   */
  public void setGdOrdToken70T(Field source) {
    replace(source, 0, source.length(), beginGdOrdToken70T, GD_ORD_TOKEN_70_T_LEN);
  }

  /**
   * Update GdOrdToken70T with another Field from an offset and length
   *
   * @param value
   */
  public void setGdOrdToken70T(Field source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginGdOrdToken70T, GD_ORD_TOKEN_70_T_LEN);
  }

  /**
   * Update GdOrdToken70T with another Field from an offset and length to an offset and length
   *
   * @param value
   */
  public void setGdOrdToken70T(
      Field source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginGdOrdToken70T + targetIndex, targetLen);
  }

  public static int getGdOrdToken70FieldLength() {
    return GD_ORD_TOKEN_70_LENGTH;
  }
}
