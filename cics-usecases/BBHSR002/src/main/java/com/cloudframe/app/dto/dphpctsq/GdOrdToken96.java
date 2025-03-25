package com.cloudframe.app.dto.dphpctsq;

/**
 * The class GdOrdToken96 is used to handle fields declared in it
 *
 * @author CloudFrame Inc. created on 2025-03-25 at 08:30. using version 5.0.0.231
 */
import com.cloudframe.app.data.Field;
import com.cloudframe.app.dto.serialize.dphpctsq.*;
import com.cloudframe.app.exception.CFException;

public class GdOrdToken96 extends GdOrdToken96Serialized {

  private short gdOrdToken96L;

  private char[] gdOrdToken96T = Field.fillLowValue(515);

  /** Constructor for GdOrdToken96 */
  public GdOrdToken96() {
    // TO-DO auto generated code
  }

  /**
   * Constructor for GdOrdToken96. sets the parent value to the parent
   *
   * @param parent
   * @param begin
   */
  public GdOrdToken96(Field parent, int begin) {
    setParent(parent, begin);
  }

  /**
   * Returns the value of gdOrdToken96L
   *
   * @return gdOrdToken96L
   */
  public short getGdOrdToken96L() throws CFException {
    if (isGdOrdToken96LModified()) {
      gdOrdToken96L = refreshGdOrdToken96L();
    }
    return gdOrdToken96L;
  }

  /**
   * Update GdOrdToken96L with the passed value Corresponding COBOL Variable is GD-ORD-TOKEN-96-L
   *
   * @param number
   */
  public void setGdOrdToken96L(short number) {
    // Truncate if the number is beyond +/- Max range
    gdOrdToken96L = checkGdOrdToken96LMaxLimit(number);
    serializeGdOrdToken96L(gdOrdToken96L);
  }

  public void setGdOrdToken96L(int number) {
    number =
        checkGdOrdToken96LMaxLimit((short) number); // Truncate if value is beyond +/- Max range
    setGdOrdToken96L((short) number);
  }

  public void setGdOrdToken96L(long number) {
    number =
        checkGdOrdToken96LMaxLimit((short) number); // Truncate if value is beyond +/- Max range
    setGdOrdToken96L((short) number);
  }

  /**
   * Returns the value of gdOrdToken96T
   *
   * @return gdOrdToken96T
   */
  public char[] getGdOrdToken96T() throws CFException {
    if (isGdOrdToken96TModified()) {
      gdOrdToken96T = refreshGdOrdToken96T();
    }
    return gdOrdToken96T;
  }

  /**
   * set variable gdOrdToken96T Corresponding COBOL Variable is GD-ORD-TOKEN-96-T
   *
   * @param value
   */
  public void setGdOrdToken96T(char[] value) {
    gdOrdToken96T = checkGdOrdToken96TConstraints(value);
    serializeGdOrdToken96T(gdOrdToken96T);
  }

  /**
   * Update GdOrdToken96T with a char[] from an offset and length
   *
   * @param value
   */
  public void setGdOrdToken96T(char[] source, int sourceIndex) {
    replace(source, sourceIndex, source.length, beginGdOrdToken96T, gdOrdToken96T.length);
  }

  public void setGdOrdToken96T(char[] source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginGdOrdToken96T, gdOrdToken96T.length);
  }

  /**
   * Update GdOrdToken96T with a char[] from an offset and length to an offset and length
   *
   * @param value
   */
  public void setGdOrdToken96T(
      char[] source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginGdOrdToken96T + targetIndex, targetLen);
  }

  /**
   * Update GdOrdToken96T with another Field
   *
   * @param value
   */
  public void setGdOrdToken96T(Field source) {
    replace(source, 0, source.length(), beginGdOrdToken96T, GD_ORD_TOKEN_96_T_LEN);
  }

  /**
   * Update GdOrdToken96T with another Field from an offset and length
   *
   * @param value
   */
  public void setGdOrdToken96T(Field source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginGdOrdToken96T, GD_ORD_TOKEN_96_T_LEN);
  }

  /**
   * Update GdOrdToken96T with another Field from an offset and length to an offset and length
   *
   * @param value
   */
  public void setGdOrdToken96T(
      Field source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginGdOrdToken96T + targetIndex, targetLen);
  }

  public static int getGdOrdToken96FieldLength() {
    return GD_ORD_TOKEN_96_LENGTH;
  }
}
