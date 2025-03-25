package com.cloudframe.app.dto.dphpctsq;

/**
 * The class GdAuthId is used to handle fields declared in it
 *
 * @author CloudFrame Inc. created on 2025-03-25 at 08:30. using version 5.0.0.231
 */
import com.cloudframe.app.data.Field;
import com.cloudframe.app.dto.serialize.dphpctsq.*;
import com.cloudframe.app.exception.CFException;

public class GdAuthId extends GdAuthIdSerialized {

  private short gdAuthIdL;

  private char[] gdAuthIdT = Field.fillLowValue(128);

  /** Constructor for GdAuthId */
  public GdAuthId() {
    // TO-DO auto generated code
  }

  /**
   * Constructor for GdAuthId. sets the parent value to the parent
   *
   * @param parent
   * @param begin
   */
  public GdAuthId(Field parent, int begin) {
    setParent(parent, begin);
  }

  /**
   * Returns the value of gdAuthIdL
   *
   * @return gdAuthIdL
   */
  public short getGdAuthIdL() throws CFException {
    if (isGdAuthIdLModified()) {
      gdAuthIdL = refreshGdAuthIdL();
    }
    return gdAuthIdL;
  }

  /**
   * Update GdAuthIdL with the passed value Corresponding COBOL Variable is GD-AUTH-ID-L
   *
   * @param number
   */
  public void setGdAuthIdL(short number) {
    // Truncate if the number is beyond +/- Max range
    gdAuthIdL = checkGdAuthIdLMaxLimit(number);
    serializeGdAuthIdL(gdAuthIdL);
  }

  public void setGdAuthIdL(int number) {
    number = checkGdAuthIdLMaxLimit((short) number); // Truncate if value is beyond +/- Max range
    setGdAuthIdL((short) number);
  }

  public void setGdAuthIdL(long number) {
    number = checkGdAuthIdLMaxLimit((short) number); // Truncate if value is beyond +/- Max range
    setGdAuthIdL((short) number);
  }

  /**
   * Returns the value of gdAuthIdT
   *
   * @return gdAuthIdT
   */
  public char[] getGdAuthIdT() throws CFException {
    if (isGdAuthIdTModified()) {
      gdAuthIdT = refreshGdAuthIdT();
    }
    return gdAuthIdT;
  }

  /**
   * set variable gdAuthIdT Corresponding COBOL Variable is GD-AUTH-ID-T
   *
   * @param value
   */
  public void setGdAuthIdT(char[] value) {
    gdAuthIdT = checkGdAuthIdTConstraints(value);
    serializeGdAuthIdT(gdAuthIdT);
  }

  /**
   * Update GdAuthIdT with a char[] from an offset and length
   *
   * @param value
   */
  public void setGdAuthIdT(char[] source, int sourceIndex) {
    replace(source, sourceIndex, source.length, beginGdAuthIdT, gdAuthIdT.length);
  }

  public void setGdAuthIdT(char[] source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginGdAuthIdT, gdAuthIdT.length);
  }

  /**
   * Update GdAuthIdT with a char[] from an offset and length to an offset and length
   *
   * @param value
   */
  public void setGdAuthIdT(
      char[] source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginGdAuthIdT + targetIndex, targetLen);
  }

  /**
   * Update GdAuthIdT with another Field
   *
   * @param value
   */
  public void setGdAuthIdT(Field source) {
    replace(source, 0, source.length(), beginGdAuthIdT, GD_AUTH_ID_T_LEN);
  }

  /**
   * Update GdAuthIdT with another Field from an offset and length
   *
   * @param value
   */
  public void setGdAuthIdT(Field source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginGdAuthIdT, GD_AUTH_ID_T_LEN);
  }

  /**
   * Update GdAuthIdT with another Field from an offset and length to an offset and length
   *
   * @param value
   */
  public void setGdAuthIdT(
      Field source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginGdAuthIdT + targetIndex, targetLen);
  }

  public static int getGdAuthIdFieldLength() {
    return GD_AUTH_ID_LENGTH;
  }
}
