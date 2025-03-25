package com.cloudframe.app.dto.dphpctsq;

/**
 * The class GdOrdToken34 is used to handle fields declared in it
 *
 * @author CloudFrame Inc. created on 2025-03-25 at 08:30. using version 5.0.0.231
 */
import com.cloudframe.app.data.Field;
import com.cloudframe.app.dto.serialize.dphpctsq.*;
import com.cloudframe.app.exception.CFException;

public class GdOrdToken34 extends GdOrdToken34Serialized {

  private short gdOrdToken34L;

  private char[] gdOrdToken34T = Field.fillLowValue(515);

  /** Constructor for GdOrdToken34 */
  public GdOrdToken34() {
    // TO-DO auto generated code
  }

  /**
   * Constructor for GdOrdToken34. sets the parent value to the parent
   *
   * @param parent
   * @param begin
   */
  public GdOrdToken34(Field parent, int begin) {
    setParent(parent, begin);
  }

  /**
   * Returns the value of gdOrdToken34L
   *
   * @return gdOrdToken34L
   */
  public short getGdOrdToken34L() throws CFException {
    if (isGdOrdToken34LModified()) {
      gdOrdToken34L = refreshGdOrdToken34L();
    }
    return gdOrdToken34L;
  }

  /**
   * Update GdOrdToken34L with the passed value Corresponding COBOL Variable is GD-ORD-TOKEN-34-L
   *
   * @param number
   */
  public void setGdOrdToken34L(short number) {
    // Truncate if the number is beyond +/- Max range
    gdOrdToken34L = checkGdOrdToken34LMaxLimit(number);
    serializeGdOrdToken34L(gdOrdToken34L);
  }

  public void setGdOrdToken34L(int number) {
    number =
        checkGdOrdToken34LMaxLimit((short) number); // Truncate if value is beyond +/- Max range
    setGdOrdToken34L((short) number);
  }

  public void setGdOrdToken34L(long number) {
    number =
        checkGdOrdToken34LMaxLimit((short) number); // Truncate if value is beyond +/- Max range
    setGdOrdToken34L((short) number);
  }

  /**
   * Returns the value of gdOrdToken34T
   *
   * @return gdOrdToken34T
   */
  public char[] getGdOrdToken34T() throws CFException {
    if (isGdOrdToken34TModified()) {
      gdOrdToken34T = refreshGdOrdToken34T();
    }
    return gdOrdToken34T;
  }

  /**
   * set variable gdOrdToken34T Corresponding COBOL Variable is GD-ORD-TOKEN-34-T
   *
   * @param value
   */
  public void setGdOrdToken34T(char[] value) {
    gdOrdToken34T = checkGdOrdToken34TConstraints(value);
    serializeGdOrdToken34T(gdOrdToken34T);
  }

  /**
   * Update GdOrdToken34T with a char[] from an offset and length
   *
   * @param value
   */
  public void setGdOrdToken34T(char[] source, int sourceIndex) {
    replace(source, sourceIndex, source.length, beginGdOrdToken34T, gdOrdToken34T.length);
  }

  public void setGdOrdToken34T(char[] source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginGdOrdToken34T, gdOrdToken34T.length);
  }

  /**
   * Update GdOrdToken34T with a char[] from an offset and length to an offset and length
   *
   * @param value
   */
  public void setGdOrdToken34T(
      char[] source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginGdOrdToken34T + targetIndex, targetLen);
  }

  /**
   * Update GdOrdToken34T with another Field
   *
   * @param value
   */
  public void setGdOrdToken34T(Field source) {
    replace(source, 0, source.length(), beginGdOrdToken34T, GD_ORD_TOKEN_34_T_LEN);
  }

  /**
   * Update GdOrdToken34T with another Field from an offset and length
   *
   * @param value
   */
  public void setGdOrdToken34T(Field source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginGdOrdToken34T, GD_ORD_TOKEN_34_T_LEN);
  }

  /**
   * Update GdOrdToken34T with another Field from an offset and length to an offset and length
   *
   * @param value
   */
  public void setGdOrdToken34T(
      Field source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginGdOrdToken34T + targetIndex, targetLen);
  }

  public static int getGdOrdToken34FieldLength() {
    return GD_ORD_TOKEN_34_LENGTH;
  }
}
