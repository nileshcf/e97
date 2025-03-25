package com.cloudframe.app.dto.dphpctsq;

/**
 * The class GdOrdToken98 is used to handle fields declared in it
 *
 * @author CloudFrame Inc. created on 2025-03-25 at 08:30. using version 5.0.0.231
 */
import com.cloudframe.app.data.Field;
import com.cloudframe.app.dto.serialize.dphpctsq.*;
import com.cloudframe.app.exception.CFException;

public class GdOrdToken98 extends GdOrdToken98Serialized {

  private short gdOrdToken98L;

  private char[] gdOrdToken98T = Field.fillLowValue(515);

  /** Constructor for GdOrdToken98 */
  public GdOrdToken98() {
    // TO-DO auto generated code
  }

  /**
   * Constructor for GdOrdToken98. sets the parent value to the parent
   *
   * @param parent
   * @param begin
   */
  public GdOrdToken98(Field parent, int begin) {
    setParent(parent, begin);
  }

  /**
   * Returns the value of gdOrdToken98L
   *
   * @return gdOrdToken98L
   */
  public short getGdOrdToken98L() throws CFException {
    if (isGdOrdToken98LModified()) {
      gdOrdToken98L = refreshGdOrdToken98L();
    }
    return gdOrdToken98L;
  }

  /**
   * Update GdOrdToken98L with the passed value Corresponding COBOL Variable is GD-ORD-TOKEN-98-L
   *
   * @param number
   */
  public void setGdOrdToken98L(short number) {
    // Truncate if the number is beyond +/- Max range
    gdOrdToken98L = checkGdOrdToken98LMaxLimit(number);
    serializeGdOrdToken98L(gdOrdToken98L);
  }

  public void setGdOrdToken98L(int number) {
    number =
        checkGdOrdToken98LMaxLimit((short) number); // Truncate if value is beyond +/- Max range
    setGdOrdToken98L((short) number);
  }

  public void setGdOrdToken98L(long number) {
    number =
        checkGdOrdToken98LMaxLimit((short) number); // Truncate if value is beyond +/- Max range
    setGdOrdToken98L((short) number);
  }

  /**
   * Returns the value of gdOrdToken98T
   *
   * @return gdOrdToken98T
   */
  public char[] getGdOrdToken98T() throws CFException {
    if (isGdOrdToken98TModified()) {
      gdOrdToken98T = refreshGdOrdToken98T();
    }
    return gdOrdToken98T;
  }

  /**
   * set variable gdOrdToken98T Corresponding COBOL Variable is GD-ORD-TOKEN-98-T
   *
   * @param value
   */
  public void setGdOrdToken98T(char[] value) {
    gdOrdToken98T = checkGdOrdToken98TConstraints(value);
    serializeGdOrdToken98T(gdOrdToken98T);
  }

  /**
   * Update GdOrdToken98T with a char[] from an offset and length
   *
   * @param value
   */
  public void setGdOrdToken98T(char[] source, int sourceIndex) {
    replace(source, sourceIndex, source.length, beginGdOrdToken98T, gdOrdToken98T.length);
  }

  public void setGdOrdToken98T(char[] source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginGdOrdToken98T, gdOrdToken98T.length);
  }

  /**
   * Update GdOrdToken98T with a char[] from an offset and length to an offset and length
   *
   * @param value
   */
  public void setGdOrdToken98T(
      char[] source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginGdOrdToken98T + targetIndex, targetLen);
  }

  /**
   * Update GdOrdToken98T with another Field
   *
   * @param value
   */
  public void setGdOrdToken98T(Field source) {
    replace(source, 0, source.length(), beginGdOrdToken98T, GD_ORD_TOKEN_98_T_LEN);
  }

  /**
   * Update GdOrdToken98T with another Field from an offset and length
   *
   * @param value
   */
  public void setGdOrdToken98T(Field source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginGdOrdToken98T, GD_ORD_TOKEN_98_T_LEN);
  }

  /**
   * Update GdOrdToken98T with another Field from an offset and length to an offset and length
   *
   * @param value
   */
  public void setGdOrdToken98T(
      Field source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginGdOrdToken98T + targetIndex, targetLen);
  }

  public static int getGdOrdToken98FieldLength() {
    return GD_ORD_TOKEN_98_LENGTH;
  }
}
