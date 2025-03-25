package com.cloudframe.app.dto.dphpctsq;

/**
 * The class GdOrdToken92 is used to handle fields declared in it
 *
 * @author CloudFrame Inc. created on 2025-03-25 at 08:30. using version 5.0.0.231
 */
import com.cloudframe.app.data.Field;
import com.cloudframe.app.dto.serialize.dphpctsq.*;
import com.cloudframe.app.exception.CFException;

public class GdOrdToken92 extends GdOrdToken92Serialized {

  private short gdOrdToken92L;

  private char[] gdOrdToken92T = Field.fillLowValue(515);

  /** Constructor for GdOrdToken92 */
  public GdOrdToken92() {
    // TO-DO auto generated code
  }

  /**
   * Constructor for GdOrdToken92. sets the parent value to the parent
   *
   * @param parent
   * @param begin
   */
  public GdOrdToken92(Field parent, int begin) {
    setParent(parent, begin);
  }

  /**
   * Returns the value of gdOrdToken92L
   *
   * @return gdOrdToken92L
   */
  public short getGdOrdToken92L() throws CFException {
    if (isGdOrdToken92LModified()) {
      gdOrdToken92L = refreshGdOrdToken92L();
    }
    return gdOrdToken92L;
  }

  /**
   * Update GdOrdToken92L with the passed value Corresponding COBOL Variable is GD-ORD-TOKEN-92-L
   *
   * @param number
   */
  public void setGdOrdToken92L(short number) {
    // Truncate if the number is beyond +/- Max range
    gdOrdToken92L = checkGdOrdToken92LMaxLimit(number);
    serializeGdOrdToken92L(gdOrdToken92L);
  }

  public void setGdOrdToken92L(int number) {
    number =
        checkGdOrdToken92LMaxLimit((short) number); // Truncate if value is beyond +/- Max range
    setGdOrdToken92L((short) number);
  }

  public void setGdOrdToken92L(long number) {
    number =
        checkGdOrdToken92LMaxLimit((short) number); // Truncate if value is beyond +/- Max range
    setGdOrdToken92L((short) number);
  }

  /**
   * Returns the value of gdOrdToken92T
   *
   * @return gdOrdToken92T
   */
  public char[] getGdOrdToken92T() throws CFException {
    if (isGdOrdToken92TModified()) {
      gdOrdToken92T = refreshGdOrdToken92T();
    }
    return gdOrdToken92T;
  }

  /**
   * set variable gdOrdToken92T Corresponding COBOL Variable is GD-ORD-TOKEN-92-T
   *
   * @param value
   */
  public void setGdOrdToken92T(char[] value) {
    gdOrdToken92T = checkGdOrdToken92TConstraints(value);
    serializeGdOrdToken92T(gdOrdToken92T);
  }

  /**
   * Update GdOrdToken92T with a char[] from an offset and length
   *
   * @param value
   */
  public void setGdOrdToken92T(char[] source, int sourceIndex) {
    replace(source, sourceIndex, source.length, beginGdOrdToken92T, gdOrdToken92T.length);
  }

  public void setGdOrdToken92T(char[] source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginGdOrdToken92T, gdOrdToken92T.length);
  }

  /**
   * Update GdOrdToken92T with a char[] from an offset and length to an offset and length
   *
   * @param value
   */
  public void setGdOrdToken92T(
      char[] source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginGdOrdToken92T + targetIndex, targetLen);
  }

  /**
   * Update GdOrdToken92T with another Field
   *
   * @param value
   */
  public void setGdOrdToken92T(Field source) {
    replace(source, 0, source.length(), beginGdOrdToken92T, GD_ORD_TOKEN_92_T_LEN);
  }

  /**
   * Update GdOrdToken92T with another Field from an offset and length
   *
   * @param value
   */
  public void setGdOrdToken92T(Field source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginGdOrdToken92T, GD_ORD_TOKEN_92_T_LEN);
  }

  /**
   * Update GdOrdToken92T with another Field from an offset and length to an offset and length
   *
   * @param value
   */
  public void setGdOrdToken92T(
      Field source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginGdOrdToken92T + targetIndex, targetLen);
  }

  public static int getGdOrdToken92FieldLength() {
    return GD_ORD_TOKEN_92_LENGTH;
  }
}
