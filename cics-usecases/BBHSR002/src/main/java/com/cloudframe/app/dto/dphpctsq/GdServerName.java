package com.cloudframe.app.dto.dphpctsq;

/**
 * The class GdServerName is used to handle fields declared in it
 *
 * @author CloudFrame Inc. created on 2025-03-25 at 08:30. using version 5.0.0.231
 */
import com.cloudframe.app.data.Field;
import com.cloudframe.app.dto.serialize.dphpctsq.*;
import com.cloudframe.app.exception.CFException;

public class GdServerName extends GdServerNameSerialized {

  private short gdServerNameL;

  private char[] gdServerNameT = Field.fillLowValue(128);

  /** Constructor for GdServerName */
  public GdServerName() {
    // TO-DO auto generated code
  }

  /**
   * Constructor for GdServerName. sets the parent value to the parent
   *
   * @param parent
   * @param begin
   */
  public GdServerName(Field parent, int begin) {
    setParent(parent, begin);
  }

  /**
   * Returns the value of gdServerNameL
   *
   * @return gdServerNameL
   */
  public short getGdServerNameL() throws CFException {
    if (isGdServerNameLModified()) {
      gdServerNameL = refreshGdServerNameL();
    }
    return gdServerNameL;
  }

  /**
   * Update GdServerNameL with the passed value Corresponding COBOL Variable is GD-SERVER-NAME-L
   *
   * @param number
   */
  public void setGdServerNameL(short number) {
    // Truncate if the number is beyond +/- Max range
    gdServerNameL = checkGdServerNameLMaxLimit(number);
    serializeGdServerNameL(gdServerNameL);
  }

  public void setGdServerNameL(int number) {
    number =
        checkGdServerNameLMaxLimit((short) number); // Truncate if value is beyond +/- Max range
    setGdServerNameL((short) number);
  }

  public void setGdServerNameL(long number) {
    number =
        checkGdServerNameLMaxLimit((short) number); // Truncate if value is beyond +/- Max range
    setGdServerNameL((short) number);
  }

  /**
   * Returns the value of gdServerNameT
   *
   * @return gdServerNameT
   */
  public char[] getGdServerNameT() throws CFException {
    if (isGdServerNameTModified()) {
      gdServerNameT = refreshGdServerNameT();
    }
    return gdServerNameT;
  }

  /**
   * set variable gdServerNameT Corresponding COBOL Variable is GD-SERVER-NAME-T
   *
   * @param value
   */
  public void setGdServerNameT(char[] value) {
    gdServerNameT = checkGdServerNameTConstraints(value);
    serializeGdServerNameT(gdServerNameT);
  }

  /**
   * Update GdServerNameT with a char[] from an offset and length
   *
   * @param value
   */
  public void setGdServerNameT(char[] source, int sourceIndex) {
    replace(source, sourceIndex, source.length, beginGdServerNameT, gdServerNameT.length);
  }

  public void setGdServerNameT(char[] source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginGdServerNameT, gdServerNameT.length);
  }

  /**
   * Update GdServerNameT with a char[] from an offset and length to an offset and length
   *
   * @param value
   */
  public void setGdServerNameT(
      char[] source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginGdServerNameT + targetIndex, targetLen);
  }

  /**
   * Update GdServerNameT with another Field
   *
   * @param value
   */
  public void setGdServerNameT(Field source) {
    replace(source, 0, source.length(), beginGdServerNameT, GD_SERVER_NAME_T_LEN);
  }

  /**
   * Update GdServerNameT with another Field from an offset and length
   *
   * @param value
   */
  public void setGdServerNameT(Field source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginGdServerNameT, GD_SERVER_NAME_T_LEN);
  }

  /**
   * Update GdServerNameT with another Field from an offset and length to an offset and length
   *
   * @param value
   */
  public void setGdServerNameT(
      Field source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginGdServerNameT + targetIndex, targetLen);
  }

  public static int getGdServerNameFieldLength() {
    return GD_SERVER_NAME_LENGTH;
  }
}
