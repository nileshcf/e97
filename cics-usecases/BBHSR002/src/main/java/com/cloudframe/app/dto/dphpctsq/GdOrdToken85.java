package com.cloudframe.app.dto.dphpctsq;

/**
 * The class GdOrdToken85 is used to handle fields declared in it
 *
 * @author CloudFrame Inc. created on 2025-03-25 at 08:30. using version 5.0.0.231
 */
import com.cloudframe.app.data.Field;
import com.cloudframe.app.dto.serialize.dphpctsq.*;
import com.cloudframe.app.exception.CFException;

public class GdOrdToken85 extends GdOrdToken85Serialized {

  private short gdOrdToken85L;

  private char[] gdOrdToken85T = Field.fillLowValue(515);

  /** Constructor for GdOrdToken85 */
  public GdOrdToken85() {
    // TO-DO auto generated code
  }

  /**
   * Constructor for GdOrdToken85. sets the parent value to the parent
   *
   * @param parent
   * @param begin
   */
  public GdOrdToken85(Field parent, int begin) {
    setParent(parent, begin);
  }

  /**
   * Returns the value of gdOrdToken85L
   *
   * @return gdOrdToken85L
   */
  public short getGdOrdToken85L() throws CFException {
    if (isGdOrdToken85LModified()) {
      gdOrdToken85L = refreshGdOrdToken85L();
    }
    return gdOrdToken85L;
  }

  /**
   * Update GdOrdToken85L with the passed value Corresponding COBOL Variable is GD-ORD-TOKEN-85-L
   *
   * @param number
   */
  public void setGdOrdToken85L(short number) {
    // Truncate if the number is beyond +/- Max range
    gdOrdToken85L = checkGdOrdToken85LMaxLimit(number);
    serializeGdOrdToken85L(gdOrdToken85L);
  }

  public void setGdOrdToken85L(int number) {
    number =
        checkGdOrdToken85LMaxLimit((short) number); // Truncate if value is beyond +/- Max range
    setGdOrdToken85L((short) number);
  }

  public void setGdOrdToken85L(long number) {
    number =
        checkGdOrdToken85LMaxLimit((short) number); // Truncate if value is beyond +/- Max range
    setGdOrdToken85L((short) number);
  }

  /**
   * Returns the value of gdOrdToken85T
   *
   * @return gdOrdToken85T
   */
  public char[] getGdOrdToken85T() throws CFException {
    if (isGdOrdToken85TModified()) {
      gdOrdToken85T = refreshGdOrdToken85T();
    }
    return gdOrdToken85T;
  }

  /**
   * set variable gdOrdToken85T Corresponding COBOL Variable is GD-ORD-TOKEN-85-T
   *
   * @param value
   */
  public void setGdOrdToken85T(char[] value) {
    gdOrdToken85T = checkGdOrdToken85TConstraints(value);
    serializeGdOrdToken85T(gdOrdToken85T);
  }

  /**
   * Update GdOrdToken85T with a char[] from an offset and length
   *
   * @param value
   */
  public void setGdOrdToken85T(char[] source, int sourceIndex) {
    replace(source, sourceIndex, source.length, beginGdOrdToken85T, gdOrdToken85T.length);
  }

  public void setGdOrdToken85T(char[] source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginGdOrdToken85T, gdOrdToken85T.length);
  }

  /**
   * Update GdOrdToken85T with a char[] from an offset and length to an offset and length
   *
   * @param value
   */
  public void setGdOrdToken85T(
      char[] source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginGdOrdToken85T + targetIndex, targetLen);
  }

  /**
   * Update GdOrdToken85T with another Field
   *
   * @param value
   */
  public void setGdOrdToken85T(Field source) {
    replace(source, 0, source.length(), beginGdOrdToken85T, GD_ORD_TOKEN_85_T_LEN);
  }

  /**
   * Update GdOrdToken85T with another Field from an offset and length
   *
   * @param value
   */
  public void setGdOrdToken85T(Field source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginGdOrdToken85T, GD_ORD_TOKEN_85_T_LEN);
  }

  /**
   * Update GdOrdToken85T with another Field from an offset and length to an offset and length
   *
   * @param value
   */
  public void setGdOrdToken85T(
      Field source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginGdOrdToken85T + targetIndex, targetLen);
  }

  public static int getGdOrdToken85FieldLength() {
    return GD_ORD_TOKEN_85_LENGTH;
  }
}
