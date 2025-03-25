package com.cloudframe.app.dto.dphpctsq;

/**
 * The class GdOrdToken66 is used to handle fields declared in it
 *
 * @author CloudFrame Inc. created on 2025-03-25 at 08:30. using version 5.0.0.231
 */
import com.cloudframe.app.data.Field;
import com.cloudframe.app.dto.serialize.dphpctsq.*;
import com.cloudframe.app.exception.CFException;

public class GdOrdToken66 extends GdOrdToken66Serialized {

  private short gdOrdToken66L;

  private char[] gdOrdToken66T = Field.fillLowValue(515);

  /** Constructor for GdOrdToken66 */
  public GdOrdToken66() {
    // TO-DO auto generated code
  }

  /**
   * Constructor for GdOrdToken66. sets the parent value to the parent
   *
   * @param parent
   * @param begin
   */
  public GdOrdToken66(Field parent, int begin) {
    setParent(parent, begin);
  }

  /**
   * Returns the value of gdOrdToken66L
   *
   * @return gdOrdToken66L
   */
  public short getGdOrdToken66L() throws CFException {
    if (isGdOrdToken66LModified()) {
      gdOrdToken66L = refreshGdOrdToken66L();
    }
    return gdOrdToken66L;
  }

  /**
   * Update GdOrdToken66L with the passed value Corresponding COBOL Variable is GD-ORD-TOKEN-66-L
   *
   * @param number
   */
  public void setGdOrdToken66L(short number) {
    // Truncate if the number is beyond +/- Max range
    gdOrdToken66L = checkGdOrdToken66LMaxLimit(number);
    serializeGdOrdToken66L(gdOrdToken66L);
  }

  public void setGdOrdToken66L(int number) {
    number =
        checkGdOrdToken66LMaxLimit((short) number); // Truncate if value is beyond +/- Max range
    setGdOrdToken66L((short) number);
  }

  public void setGdOrdToken66L(long number) {
    number =
        checkGdOrdToken66LMaxLimit((short) number); // Truncate if value is beyond +/- Max range
    setGdOrdToken66L((short) number);
  }

  /**
   * Returns the value of gdOrdToken66T
   *
   * @return gdOrdToken66T
   */
  public char[] getGdOrdToken66T() throws CFException {
    if (isGdOrdToken66TModified()) {
      gdOrdToken66T = refreshGdOrdToken66T();
    }
    return gdOrdToken66T;
  }

  /**
   * set variable gdOrdToken66T Corresponding COBOL Variable is GD-ORD-TOKEN-66-T
   *
   * @param value
   */
  public void setGdOrdToken66T(char[] value) {
    gdOrdToken66T = checkGdOrdToken66TConstraints(value);
    serializeGdOrdToken66T(gdOrdToken66T);
  }

  /**
   * Update GdOrdToken66T with a char[] from an offset and length
   *
   * @param value
   */
  public void setGdOrdToken66T(char[] source, int sourceIndex) {
    replace(source, sourceIndex, source.length, beginGdOrdToken66T, gdOrdToken66T.length);
  }

  public void setGdOrdToken66T(char[] source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginGdOrdToken66T, gdOrdToken66T.length);
  }

  /**
   * Update GdOrdToken66T with a char[] from an offset and length to an offset and length
   *
   * @param value
   */
  public void setGdOrdToken66T(
      char[] source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginGdOrdToken66T + targetIndex, targetLen);
  }

  /**
   * Update GdOrdToken66T with another Field
   *
   * @param value
   */
  public void setGdOrdToken66T(Field source) {
    replace(source, 0, source.length(), beginGdOrdToken66T, GD_ORD_TOKEN_66_T_LEN);
  }

  /**
   * Update GdOrdToken66T with another Field from an offset and length
   *
   * @param value
   */
  public void setGdOrdToken66T(Field source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginGdOrdToken66T, GD_ORD_TOKEN_66_T_LEN);
  }

  /**
   * Update GdOrdToken66T with another Field from an offset and length to an offset and length
   *
   * @param value
   */
  public void setGdOrdToken66T(
      Field source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginGdOrdToken66T + targetIndex, targetLen);
  }

  public static int getGdOrdToken66FieldLength() {
    return GD_ORD_TOKEN_66_LENGTH;
  }
}
