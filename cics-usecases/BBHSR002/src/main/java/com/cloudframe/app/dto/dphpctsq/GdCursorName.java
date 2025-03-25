package com.cloudframe.app.dto.dphpctsq;

/**
 * The class GdCursorName is used to handle fields declared in it
 *
 * @author CloudFrame Inc. created on 2025-03-25 at 08:30. using version 5.0.0.231
 */
import com.cloudframe.app.data.Field;
import com.cloudframe.app.dto.serialize.dphpctsq.*;
import com.cloudframe.app.exception.CFException;

public class GdCursorName extends GdCursorNameSerialized {

  private short gdCursorNameL;

  private char[] gdCursorNameT = Field.fillLowValue(128);

  /** Constructor for GdCursorName */
  public GdCursorName() {
    // TO-DO auto generated code
  }

  /**
   * Constructor for GdCursorName. sets the parent value to the parent
   *
   * @param parent
   * @param begin
   */
  public GdCursorName(Field parent, int begin) {
    setParent(parent, begin);
  }

  /**
   * Returns the value of gdCursorNameL
   *
   * @return gdCursorNameL
   */
  public short getGdCursorNameL() throws CFException {
    if (isGdCursorNameLModified()) {
      gdCursorNameL = refreshGdCursorNameL();
    }
    return gdCursorNameL;
  }

  /**
   * Update GdCursorNameL with the passed value Corresponding COBOL Variable is GD-CURSOR-NAME-L
   *
   * @param number
   */
  public void setGdCursorNameL(short number) {
    // Truncate if the number is beyond +/- Max range
    gdCursorNameL = checkGdCursorNameLMaxLimit(number);
    serializeGdCursorNameL(gdCursorNameL);
  }

  public void setGdCursorNameL(int number) {
    number =
        checkGdCursorNameLMaxLimit((short) number); // Truncate if value is beyond +/- Max range
    setGdCursorNameL((short) number);
  }

  public void setGdCursorNameL(long number) {
    number =
        checkGdCursorNameLMaxLimit((short) number); // Truncate if value is beyond +/- Max range
    setGdCursorNameL((short) number);
  }

  /**
   * Returns the value of gdCursorNameT
   *
   * @return gdCursorNameT
   */
  public char[] getGdCursorNameT() throws CFException {
    if (isGdCursorNameTModified()) {
      gdCursorNameT = refreshGdCursorNameT();
    }
    return gdCursorNameT;
  }

  /**
   * set variable gdCursorNameT Corresponding COBOL Variable is GD-CURSOR-NAME-T
   *
   * @param value
   */
  public void setGdCursorNameT(char[] value) {
    gdCursorNameT = checkGdCursorNameTConstraints(value);
    serializeGdCursorNameT(gdCursorNameT);
  }

  /**
   * Update GdCursorNameT with a char[] from an offset and length
   *
   * @param value
   */
  public void setGdCursorNameT(char[] source, int sourceIndex) {
    replace(source, sourceIndex, source.length, beginGdCursorNameT, gdCursorNameT.length);
  }

  public void setGdCursorNameT(char[] source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginGdCursorNameT, gdCursorNameT.length);
  }

  /**
   * Update GdCursorNameT with a char[] from an offset and length to an offset and length
   *
   * @param value
   */
  public void setGdCursorNameT(
      char[] source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginGdCursorNameT + targetIndex, targetLen);
  }

  /**
   * Update GdCursorNameT with another Field
   *
   * @param value
   */
  public void setGdCursorNameT(Field source) {
    replace(source, 0, source.length(), beginGdCursorNameT, GD_CURSOR_NAME_T_LEN);
  }

  /**
   * Update GdCursorNameT with another Field from an offset and length
   *
   * @param value
   */
  public void setGdCursorNameT(Field source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginGdCursorNameT, GD_CURSOR_NAME_T_LEN);
  }

  /**
   * Update GdCursorNameT with another Field from an offset and length to an offset and length
   *
   * @param value
   */
  public void setGdCursorNameT(
      Field source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginGdCursorNameT + targetIndex, targetLen);
  }

  public static int getGdCursorNameFieldLength() {
    return GD_CURSOR_NAME_LENGTH;
  }
}
