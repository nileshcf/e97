package com.cloudframe.app.dto.dphpctsq;

/**
 * The class GdOrdToken77 is used to handle fields declared in it
 *
 * @author CloudFrame Inc. created on 2025-03-25 at 08:30. using version 5.0.0.231
 */
import com.cloudframe.app.data.Field;
import com.cloudframe.app.dto.serialize.dphpctsq.*;
import com.cloudframe.app.exception.CFException;

public class GdOrdToken77 extends GdOrdToken77Serialized {

  private short gdOrdToken77L;

  private char[] gdOrdToken77T = Field.fillLowValue(515);

  /** Constructor for GdOrdToken77 */
  public GdOrdToken77() {
    // TO-DO auto generated code
  }

  /**
   * Constructor for GdOrdToken77. sets the parent value to the parent
   *
   * @param parent
   * @param begin
   */
  public GdOrdToken77(Field parent, int begin) {
    setParent(parent, begin);
  }

  /**
   * Returns the value of gdOrdToken77L
   *
   * @return gdOrdToken77L
   */
  public short getGdOrdToken77L() throws CFException {
    if (isGdOrdToken77LModified()) {
      gdOrdToken77L = refreshGdOrdToken77L();
    }
    return gdOrdToken77L;
  }

  /**
   * Update GdOrdToken77L with the passed value Corresponding COBOL Variable is GD-ORD-TOKEN-77-L
   *
   * @param number
   */
  public void setGdOrdToken77L(short number) {
    // Truncate if the number is beyond +/- Max range
    gdOrdToken77L = checkGdOrdToken77LMaxLimit(number);
    serializeGdOrdToken77L(gdOrdToken77L);
  }

  public void setGdOrdToken77L(int number) {
    number =
        checkGdOrdToken77LMaxLimit((short) number); // Truncate if value is beyond +/- Max range
    setGdOrdToken77L((short) number);
  }

  public void setGdOrdToken77L(long number) {
    number =
        checkGdOrdToken77LMaxLimit((short) number); // Truncate if value is beyond +/- Max range
    setGdOrdToken77L((short) number);
  }

  /**
   * Returns the value of gdOrdToken77T
   *
   * @return gdOrdToken77T
   */
  public char[] getGdOrdToken77T() throws CFException {
    if (isGdOrdToken77TModified()) {
      gdOrdToken77T = refreshGdOrdToken77T();
    }
    return gdOrdToken77T;
  }

  /**
   * set variable gdOrdToken77T Corresponding COBOL Variable is GD-ORD-TOKEN-77-T
   *
   * @param value
   */
  public void setGdOrdToken77T(char[] value) {
    gdOrdToken77T = checkGdOrdToken77TConstraints(value);
    serializeGdOrdToken77T(gdOrdToken77T);
  }

  /**
   * Update GdOrdToken77T with a char[] from an offset and length
   *
   * @param value
   */
  public void setGdOrdToken77T(char[] source, int sourceIndex) {
    replace(source, sourceIndex, source.length, beginGdOrdToken77T, gdOrdToken77T.length);
  }

  public void setGdOrdToken77T(char[] source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginGdOrdToken77T, gdOrdToken77T.length);
  }

  /**
   * Update GdOrdToken77T with a char[] from an offset and length to an offset and length
   *
   * @param value
   */
  public void setGdOrdToken77T(
      char[] source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginGdOrdToken77T + targetIndex, targetLen);
  }

  /**
   * Update GdOrdToken77T with another Field
   *
   * @param value
   */
  public void setGdOrdToken77T(Field source) {
    replace(source, 0, source.length(), beginGdOrdToken77T, GD_ORD_TOKEN_77_T_LEN);
  }

  /**
   * Update GdOrdToken77T with another Field from an offset and length
   *
   * @param value
   */
  public void setGdOrdToken77T(Field source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginGdOrdToken77T, GD_ORD_TOKEN_77_T_LEN);
  }

  /**
   * Update GdOrdToken77T with another Field from an offset and length to an offset and length
   *
   * @param value
   */
  public void setGdOrdToken77T(
      Field source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginGdOrdToken77T + targetIndex, targetLen);
  }

  public static int getGdOrdToken77FieldLength() {
    return GD_ORD_TOKEN_77_LENGTH;
  }
}
