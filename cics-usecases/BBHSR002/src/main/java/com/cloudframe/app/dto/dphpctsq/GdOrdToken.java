package com.cloudframe.app.dto.dphpctsq;

/**
 * The class GdOrdToken is used to handle fields declared in it
 *
 * @author CloudFrame Inc. created on 2025-03-25 at 08:30. using version 5.0.0.231
 */
import com.cloudframe.app.data.Field;
import com.cloudframe.app.dto.serialize.dphpctsq.*;
import com.cloudframe.app.exception.CFException;

public class GdOrdToken extends GdOrdTokenSerialized {

  private short gdOrdTokenL;

  private char[] gdOrdTokenT = Field.fillLowValue(515);

  /** Constructor for GdOrdToken */
  public GdOrdToken() {
    // TO-DO auto generated code
  }

  /**
   * Constructor for GdOrdToken. sets the parent value to the parent
   *
   * @param parent
   * @param begin
   */
  public GdOrdToken(Field parent, int begin) {
    setParent(parent, begin);
  }

  /**
   * Returns the value of gdOrdTokenL
   *
   * @return gdOrdTokenL
   */
  public short getGdOrdTokenL() throws CFException {
    if (isGdOrdTokenLModified()) {
      gdOrdTokenL = refreshGdOrdTokenL();
    }
    return gdOrdTokenL;
  }

  /**
   * Update GdOrdTokenL with the passed value Corresponding COBOL Variable is GD-ORD-TOKEN-L
   *
   * @param number
   */
  public void setGdOrdTokenL(short number) {
    // Truncate if the number is beyond +/- Max range
    gdOrdTokenL = checkGdOrdTokenLMaxLimit(number);
    serializeGdOrdTokenL(gdOrdTokenL);
  }

  public void setGdOrdTokenL(int number) {
    number = checkGdOrdTokenLMaxLimit((short) number); // Truncate if value is beyond +/- Max range
    setGdOrdTokenL((short) number);
  }

  public void setGdOrdTokenL(long number) {
    number = checkGdOrdTokenLMaxLimit((short) number); // Truncate if value is beyond +/- Max range
    setGdOrdTokenL((short) number);
  }

  /**
   * Returns the value of gdOrdTokenT
   *
   * @return gdOrdTokenT
   */
  public char[] getGdOrdTokenT() throws CFException {
    if (isGdOrdTokenTModified()) {
      gdOrdTokenT = refreshGdOrdTokenT();
    }
    return gdOrdTokenT;
  }

  /**
   * set variable gdOrdTokenT Corresponding COBOL Variable is GD-ORD-TOKEN-T
   *
   * @param value
   */
  public void setGdOrdTokenT(char[] value) {
    gdOrdTokenT = checkGdOrdTokenTConstraints(value);
    serializeGdOrdTokenT(gdOrdTokenT);
  }

  /**
   * Update GdOrdTokenT with a char[] from an offset and length
   *
   * @param value
   */
  public void setGdOrdTokenT(char[] source, int sourceIndex) {
    replace(source, sourceIndex, source.length, beginGdOrdTokenT, gdOrdTokenT.length);
  }

  public void setGdOrdTokenT(char[] source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginGdOrdTokenT, gdOrdTokenT.length);
  }

  /**
   * Update GdOrdTokenT with a char[] from an offset and length to an offset and length
   *
   * @param value
   */
  public void setGdOrdTokenT(
      char[] source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginGdOrdTokenT + targetIndex, targetLen);
  }

  /**
   * Update GdOrdTokenT with another Field
   *
   * @param value
   */
  public void setGdOrdTokenT(Field source) {
    replace(source, 0, source.length(), beginGdOrdTokenT, GD_ORD_TOKEN_T_LEN);
  }

  /**
   * Update GdOrdTokenT with another Field from an offset and length
   *
   * @param value
   */
  public void setGdOrdTokenT(Field source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginGdOrdTokenT, GD_ORD_TOKEN_T_LEN);
  }

  /**
   * Update GdOrdTokenT with another Field from an offset and length to an offset and length
   *
   * @param value
   */
  public void setGdOrdTokenT(
      Field source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginGdOrdTokenT + targetIndex, targetLen);
  }

  public static int getGdOrdTokenFieldLength() {
    return GD_ORD_TOKEN_LENGTH;
  }
}
