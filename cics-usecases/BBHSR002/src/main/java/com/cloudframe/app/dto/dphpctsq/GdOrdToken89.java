package com.cloudframe.app.dto.dphpctsq;

/**
 * The class GdOrdToken89 is used to handle fields declared in it
 *
 * @author CloudFrame Inc. created on 2025-03-25 at 08:30. using version 5.0.0.231
 */
import com.cloudframe.app.data.Field;
import com.cloudframe.app.dto.serialize.dphpctsq.*;
import com.cloudframe.app.exception.CFException;

public class GdOrdToken89 extends GdOrdToken89Serialized {

  private short gdOrdToken89L;

  private char[] gdOrdToken89T = Field.fillLowValue(515);

  /** Constructor for GdOrdToken89 */
  public GdOrdToken89() {
    // TO-DO auto generated code
  }

  /**
   * Constructor for GdOrdToken89. sets the parent value to the parent
   *
   * @param parent
   * @param begin
   */
  public GdOrdToken89(Field parent, int begin) {
    setParent(parent, begin);
  }

  /**
   * Returns the value of gdOrdToken89L
   *
   * @return gdOrdToken89L
   */
  public short getGdOrdToken89L() throws CFException {
    if (isGdOrdToken89LModified()) {
      gdOrdToken89L = refreshGdOrdToken89L();
    }
    return gdOrdToken89L;
  }

  /**
   * Update GdOrdToken89L with the passed value Corresponding COBOL Variable is GD-ORD-TOKEN-89-L
   *
   * @param number
   */
  public void setGdOrdToken89L(short number) {
    // Truncate if the number is beyond +/- Max range
    gdOrdToken89L = checkGdOrdToken89LMaxLimit(number);
    serializeGdOrdToken89L(gdOrdToken89L);
  }

  public void setGdOrdToken89L(int number) {
    number =
        checkGdOrdToken89LMaxLimit((short) number); // Truncate if value is beyond +/- Max range
    setGdOrdToken89L((short) number);
  }

  public void setGdOrdToken89L(long number) {
    number =
        checkGdOrdToken89LMaxLimit((short) number); // Truncate if value is beyond +/- Max range
    setGdOrdToken89L((short) number);
  }

  /**
   * Returns the value of gdOrdToken89T
   *
   * @return gdOrdToken89T
   */
  public char[] getGdOrdToken89T() throws CFException {
    if (isGdOrdToken89TModified()) {
      gdOrdToken89T = refreshGdOrdToken89T();
    }
    return gdOrdToken89T;
  }

  /**
   * set variable gdOrdToken89T Corresponding COBOL Variable is GD-ORD-TOKEN-89-T
   *
   * @param value
   */
  public void setGdOrdToken89T(char[] value) {
    gdOrdToken89T = checkGdOrdToken89TConstraints(value);
    serializeGdOrdToken89T(gdOrdToken89T);
  }

  /**
   * Update GdOrdToken89T with a char[] from an offset and length
   *
   * @param value
   */
  public void setGdOrdToken89T(char[] source, int sourceIndex) {
    replace(source, sourceIndex, source.length, beginGdOrdToken89T, gdOrdToken89T.length);
  }

  public void setGdOrdToken89T(char[] source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginGdOrdToken89T, gdOrdToken89T.length);
  }

  /**
   * Update GdOrdToken89T with a char[] from an offset and length to an offset and length
   *
   * @param value
   */
  public void setGdOrdToken89T(
      char[] source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginGdOrdToken89T + targetIndex, targetLen);
  }

  /**
   * Update GdOrdToken89T with another Field
   *
   * @param value
   */
  public void setGdOrdToken89T(Field source) {
    replace(source, 0, source.length(), beginGdOrdToken89T, GD_ORD_TOKEN_89_T_LEN);
  }

  /**
   * Update GdOrdToken89T with another Field from an offset and length
   *
   * @param value
   */
  public void setGdOrdToken89T(Field source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginGdOrdToken89T, GD_ORD_TOKEN_89_T_LEN);
  }

  /**
   * Update GdOrdToken89T with another Field from an offset and length to an offset and length
   *
   * @param value
   */
  public void setGdOrdToken89T(
      Field source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginGdOrdToken89T + targetIndex, targetLen);
  }

  public static int getGdOrdToken89FieldLength() {
    return GD_ORD_TOKEN_89_LENGTH;
  }
}
