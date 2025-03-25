package com.cloudframe.app.dto.dphpctsq;

/**
 * The class GdOrdToken36 is used to handle fields declared in it
 *
 * @author CloudFrame Inc. created on 2025-03-25 at 08:30. using version 5.0.0.231
 */
import com.cloudframe.app.data.Field;
import com.cloudframe.app.dto.serialize.dphpctsq.*;
import com.cloudframe.app.exception.CFException;

public class GdOrdToken36 extends GdOrdToken36Serialized {

  private short gdOrdToken36L;

  private char[] gdOrdToken36T = Field.fillLowValue(515);

  /** Constructor for GdOrdToken36 */
  public GdOrdToken36() {
    // TO-DO auto generated code
  }

  /**
   * Constructor for GdOrdToken36. sets the parent value to the parent
   *
   * @param parent
   * @param begin
   */
  public GdOrdToken36(Field parent, int begin) {
    setParent(parent, begin);
  }

  /**
   * Returns the value of gdOrdToken36L
   *
   * @return gdOrdToken36L
   */
  public short getGdOrdToken36L() throws CFException {
    if (isGdOrdToken36LModified()) {
      gdOrdToken36L = refreshGdOrdToken36L();
    }
    return gdOrdToken36L;
  }

  /**
   * Update GdOrdToken36L with the passed value Corresponding COBOL Variable is GD-ORD-TOKEN-36-L
   *
   * @param number
   */
  public void setGdOrdToken36L(short number) {
    // Truncate if the number is beyond +/- Max range
    gdOrdToken36L = checkGdOrdToken36LMaxLimit(number);
    serializeGdOrdToken36L(gdOrdToken36L);
  }

  public void setGdOrdToken36L(int number) {
    number =
        checkGdOrdToken36LMaxLimit((short) number); // Truncate if value is beyond +/- Max range
    setGdOrdToken36L((short) number);
  }

  public void setGdOrdToken36L(long number) {
    number =
        checkGdOrdToken36LMaxLimit((short) number); // Truncate if value is beyond +/- Max range
    setGdOrdToken36L((short) number);
  }

  /**
   * Returns the value of gdOrdToken36T
   *
   * @return gdOrdToken36T
   */
  public char[] getGdOrdToken36T() throws CFException {
    if (isGdOrdToken36TModified()) {
      gdOrdToken36T = refreshGdOrdToken36T();
    }
    return gdOrdToken36T;
  }

  /**
   * set variable gdOrdToken36T Corresponding COBOL Variable is GD-ORD-TOKEN-36-T
   *
   * @param value
   */
  public void setGdOrdToken36T(char[] value) {
    gdOrdToken36T = checkGdOrdToken36TConstraints(value);
    serializeGdOrdToken36T(gdOrdToken36T);
  }

  /**
   * Update GdOrdToken36T with a char[] from an offset and length
   *
   * @param value
   */
  public void setGdOrdToken36T(char[] source, int sourceIndex) {
    replace(source, sourceIndex, source.length, beginGdOrdToken36T, gdOrdToken36T.length);
  }

  public void setGdOrdToken36T(char[] source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginGdOrdToken36T, gdOrdToken36T.length);
  }

  /**
   * Update GdOrdToken36T with a char[] from an offset and length to an offset and length
   *
   * @param value
   */
  public void setGdOrdToken36T(
      char[] source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginGdOrdToken36T + targetIndex, targetLen);
  }

  /**
   * Update GdOrdToken36T with another Field
   *
   * @param value
   */
  public void setGdOrdToken36T(Field source) {
    replace(source, 0, source.length(), beginGdOrdToken36T, GD_ORD_TOKEN_36_T_LEN);
  }

  /**
   * Update GdOrdToken36T with another Field from an offset and length
   *
   * @param value
   */
  public void setGdOrdToken36T(Field source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginGdOrdToken36T, GD_ORD_TOKEN_36_T_LEN);
  }

  /**
   * Update GdOrdToken36T with another Field from an offset and length to an offset and length
   *
   * @param value
   */
  public void setGdOrdToken36T(
      Field source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginGdOrdToken36T + targetIndex, targetLen);
  }

  public static int getGdOrdToken36FieldLength() {
    return GD_ORD_TOKEN_36_LENGTH;
  }
}
