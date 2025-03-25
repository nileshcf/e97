package com.cloudframe.app.dto.dphpctsq;

/**
 * The class GdOrdToken38 is used to handle fields declared in it
 *
 * @author CloudFrame Inc. created on 2025-03-25 at 08:30. using version 5.0.0.231
 */
import com.cloudframe.app.data.Field;
import com.cloudframe.app.dto.serialize.dphpctsq.*;
import com.cloudframe.app.exception.CFException;

public class GdOrdToken38 extends GdOrdToken38Serialized {

  private short gdOrdToken38L;

  private char[] gdOrdToken38T = Field.fillLowValue(515);

  /** Constructor for GdOrdToken38 */
  public GdOrdToken38() {
    // TO-DO auto generated code
  }

  /**
   * Constructor for GdOrdToken38. sets the parent value to the parent
   *
   * @param parent
   * @param begin
   */
  public GdOrdToken38(Field parent, int begin) {
    setParent(parent, begin);
  }

  /**
   * Returns the value of gdOrdToken38L
   *
   * @return gdOrdToken38L
   */
  public short getGdOrdToken38L() throws CFException {
    if (isGdOrdToken38LModified()) {
      gdOrdToken38L = refreshGdOrdToken38L();
    }
    return gdOrdToken38L;
  }

  /**
   * Update GdOrdToken38L with the passed value Corresponding COBOL Variable is GD-ORD-TOKEN-38-L
   *
   * @param number
   */
  public void setGdOrdToken38L(short number) {
    // Truncate if the number is beyond +/- Max range
    gdOrdToken38L = checkGdOrdToken38LMaxLimit(number);
    serializeGdOrdToken38L(gdOrdToken38L);
  }

  public void setGdOrdToken38L(int number) {
    number =
        checkGdOrdToken38LMaxLimit((short) number); // Truncate if value is beyond +/- Max range
    setGdOrdToken38L((short) number);
  }

  public void setGdOrdToken38L(long number) {
    number =
        checkGdOrdToken38LMaxLimit((short) number); // Truncate if value is beyond +/- Max range
    setGdOrdToken38L((short) number);
  }

  /**
   * Returns the value of gdOrdToken38T
   *
   * @return gdOrdToken38T
   */
  public char[] getGdOrdToken38T() throws CFException {
    if (isGdOrdToken38TModified()) {
      gdOrdToken38T = refreshGdOrdToken38T();
    }
    return gdOrdToken38T;
  }

  /**
   * set variable gdOrdToken38T Corresponding COBOL Variable is GD-ORD-TOKEN-38-T
   *
   * @param value
   */
  public void setGdOrdToken38T(char[] value) {
    gdOrdToken38T = checkGdOrdToken38TConstraints(value);
    serializeGdOrdToken38T(gdOrdToken38T);
  }

  /**
   * Update GdOrdToken38T with a char[] from an offset and length
   *
   * @param value
   */
  public void setGdOrdToken38T(char[] source, int sourceIndex) {
    replace(source, sourceIndex, source.length, beginGdOrdToken38T, gdOrdToken38T.length);
  }

  public void setGdOrdToken38T(char[] source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginGdOrdToken38T, gdOrdToken38T.length);
  }

  /**
   * Update GdOrdToken38T with a char[] from an offset and length to an offset and length
   *
   * @param value
   */
  public void setGdOrdToken38T(
      char[] source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginGdOrdToken38T + targetIndex, targetLen);
  }

  /**
   * Update GdOrdToken38T with another Field
   *
   * @param value
   */
  public void setGdOrdToken38T(Field source) {
    replace(source, 0, source.length(), beginGdOrdToken38T, GD_ORD_TOKEN_38_T_LEN);
  }

  /**
   * Update GdOrdToken38T with another Field from an offset and length
   *
   * @param value
   */
  public void setGdOrdToken38T(Field source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginGdOrdToken38T, GD_ORD_TOKEN_38_T_LEN);
  }

  /**
   * Update GdOrdToken38T with another Field from an offset and length to an offset and length
   *
   * @param value
   */
  public void setGdOrdToken38T(
      Field source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginGdOrdToken38T + targetIndex, targetLen);
  }

  public static int getGdOrdToken38FieldLength() {
    return GD_ORD_TOKEN_38_LENGTH;
  }
}
