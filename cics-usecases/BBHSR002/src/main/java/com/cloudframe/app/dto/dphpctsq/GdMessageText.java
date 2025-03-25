package com.cloudframe.app.dto.dphpctsq;

/**
 * The class GdMessageText is used to handle fields declared in it
 *
 * @author CloudFrame Inc. created on 2025-03-25 at 08:30. using version 5.0.0.231
 */
import com.cloudframe.app.data.Field;
import com.cloudframe.app.dto.serialize.dphpctsq.*;
import com.cloudframe.app.exception.CFException;

public class GdMessageText extends GdMessageTextSerialized {

  private short gdMessageTextL;

  private char[] gdMessageTextT = Field.fillLowValue(32672);

  /** Constructor for GdMessageText */
  public GdMessageText() {
    // TO-DO auto generated code
  }

  /**
   * Constructor for GdMessageText. sets the parent value to the parent
   *
   * @param parent
   * @param begin
   */
  public GdMessageText(Field parent, int begin) {
    setParent(parent, begin);
  }

  /**
   * Returns the value of gdMessageTextL
   *
   * @return gdMessageTextL
   */
  public short getGdMessageTextL() throws CFException {
    if (isGdMessageTextLModified()) {
      gdMessageTextL = refreshGdMessageTextL();
    }
    return gdMessageTextL;
  }

  /**
   * Update GdMessageTextL with the passed value Corresponding COBOL Variable is GD-MESSAGE-TEXT-L
   *
   * @param number
   */
  public void setGdMessageTextL(short number) {
    // Truncate if the number is beyond +/- Max range
    gdMessageTextL = checkGdMessageTextLMaxLimit(number);
    serializeGdMessageTextL(gdMessageTextL);
  }

  public void setGdMessageTextL(int number) {
    number =
        checkGdMessageTextLMaxLimit((short) number); // Truncate if value is beyond +/- Max range
    setGdMessageTextL((short) number);
  }

  public void setGdMessageTextL(long number) {
    number =
        checkGdMessageTextLMaxLimit((short) number); // Truncate if value is beyond +/- Max range
    setGdMessageTextL((short) number);
  }

  /**
   * Returns the value of gdMessageTextT
   *
   * @return gdMessageTextT
   */
  public char[] getGdMessageTextT() throws CFException {
    if (isGdMessageTextTModified()) {
      gdMessageTextT = refreshGdMessageTextT();
    }
    return gdMessageTextT;
  }

  /**
   * set variable gdMessageTextT Corresponding COBOL Variable is GD-MESSAGE-TEXT-T
   *
   * @param value
   */
  public void setGdMessageTextT(char[] value) {
    gdMessageTextT = checkGdMessageTextTConstraints(value);
    serializeGdMessageTextT(gdMessageTextT);
  }

  /**
   * Update GdMessageTextT with a char[] from an offset and length
   *
   * @param value
   */
  public void setGdMessageTextT(char[] source, int sourceIndex) {
    replace(source, sourceIndex, source.length, beginGdMessageTextT, gdMessageTextT.length);
  }

  public void setGdMessageTextT(char[] source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginGdMessageTextT, gdMessageTextT.length);
  }

  /**
   * Update GdMessageTextT with a char[] from an offset and length to an offset and length
   *
   * @param value
   */
  public void setGdMessageTextT(
      char[] source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginGdMessageTextT + targetIndex, targetLen);
  }

  /**
   * Update GdMessageTextT with another Field
   *
   * @param value
   */
  public void setGdMessageTextT(Field source) {
    replace(source, 0, source.length(), beginGdMessageTextT, GD_MESSAGE_TEXT_T_LEN);
  }

  /**
   * Update GdMessageTextT with another Field from an offset and length
   *
   * @param value
   */
  public void setGdMessageTextT(Field source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginGdMessageTextT, GD_MESSAGE_TEXT_T_LEN);
  }

  /**
   * Update GdMessageTextT with another Field from an offset and length to an offset and length
   *
   * @param value
   */
  public void setGdMessageTextT(
      Field source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginGdMessageTextT + targetIndex, targetLen);
  }

  public static int getGdMessageTextFieldLength() {
    return GD_MESSAGE_TEXT_LENGTH;
  }
}
