package com.cloudframe.app.dto.dphpctsq;

/**
 * The class GdOrdToken45 is used to handle fields declared in it
 *
 * @author CloudFrame Inc. created on 2025-03-25 at 08:30. using version 5.0.0.231
 */
import com.cloudframe.app.data.Field;
import com.cloudframe.app.dto.serialize.dphpctsq.*;
import com.cloudframe.app.exception.CFException;

public class GdOrdToken45 extends GdOrdToken45Serialized {

  private short gdOrdToken45L;

  private char[] gdOrdToken45T = Field.fillLowValue(515);

  /** Constructor for GdOrdToken45 */
  public GdOrdToken45() {
    // TO-DO auto generated code
  }

  /**
   * Constructor for GdOrdToken45. sets the parent value to the parent
   *
   * @param parent
   * @param begin
   */
  public GdOrdToken45(Field parent, int begin) {
    setParent(parent, begin);
  }

  /**
   * Returns the value of gdOrdToken45L
   *
   * @return gdOrdToken45L
   */
  public short getGdOrdToken45L() throws CFException {
    if (isGdOrdToken45LModified()) {
      gdOrdToken45L = refreshGdOrdToken45L();
    }
    return gdOrdToken45L;
  }

  /**
   * Update GdOrdToken45L with the passed value Corresponding COBOL Variable is GD-ORD-TOKEN-45-L
   *
   * @param number
   */
  public void setGdOrdToken45L(short number) {
    // Truncate if the number is beyond +/- Max range
    gdOrdToken45L = checkGdOrdToken45LMaxLimit(number);
    serializeGdOrdToken45L(gdOrdToken45L);
  }

  public void setGdOrdToken45L(int number) {
    number =
        checkGdOrdToken45LMaxLimit((short) number); // Truncate if value is beyond +/- Max range
    setGdOrdToken45L((short) number);
  }

  public void setGdOrdToken45L(long number) {
    number =
        checkGdOrdToken45LMaxLimit((short) number); // Truncate if value is beyond +/- Max range
    setGdOrdToken45L((short) number);
  }

  /**
   * Returns the value of gdOrdToken45T
   *
   * @return gdOrdToken45T
   */
  public char[] getGdOrdToken45T() throws CFException {
    if (isGdOrdToken45TModified()) {
      gdOrdToken45T = refreshGdOrdToken45T();
    }
    return gdOrdToken45T;
  }

  /**
   * set variable gdOrdToken45T Corresponding COBOL Variable is GD-ORD-TOKEN-45-T
   *
   * @param value
   */
  public void setGdOrdToken45T(char[] value) {
    gdOrdToken45T = checkGdOrdToken45TConstraints(value);
    serializeGdOrdToken45T(gdOrdToken45T);
  }

  /**
   * Update GdOrdToken45T with a char[] from an offset and length
   *
   * @param value
   */
  public void setGdOrdToken45T(char[] source, int sourceIndex) {
    replace(source, sourceIndex, source.length, beginGdOrdToken45T, gdOrdToken45T.length);
  }

  public void setGdOrdToken45T(char[] source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginGdOrdToken45T, gdOrdToken45T.length);
  }

  /**
   * Update GdOrdToken45T with a char[] from an offset and length to an offset and length
   *
   * @param value
   */
  public void setGdOrdToken45T(
      char[] source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginGdOrdToken45T + targetIndex, targetLen);
  }

  /**
   * Update GdOrdToken45T with another Field
   *
   * @param value
   */
  public void setGdOrdToken45T(Field source) {
    replace(source, 0, source.length(), beginGdOrdToken45T, GD_ORD_TOKEN_45_T_LEN);
  }

  /**
   * Update GdOrdToken45T with another Field from an offset and length
   *
   * @param value
   */
  public void setGdOrdToken45T(Field source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginGdOrdToken45T, GD_ORD_TOKEN_45_T_LEN);
  }

  /**
   * Update GdOrdToken45T with another Field from an offset and length to an offset and length
   *
   * @param value
   */
  public void setGdOrdToken45T(
      Field source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginGdOrdToken45T + targetIndex, targetLen);
  }

  public static int getGdOrdToken45FieldLength() {
    return GD_ORD_TOKEN_45_LENGTH;
  }
}
