package com.cloudframe.app.dto.dphpctsq;

/**
 * The class GdSqlcaMsg is used to handle fields declared in it
 *
 * @author CloudFrame Inc. created on 2025-03-25 at 08:30. using version 5.0.0.231
 */
import com.cloudframe.app.data.Field;
import com.cloudframe.app.dto.serialize.dphpctsq.*;
import com.cloudframe.app.exception.CFException;

public class GdSqlcaMsg extends GdSqlcaMsgSerialized {

  private short gdSqlcaMsgLen;

  private char[] gdSqlcaMsgText = Field.fillLowValue(2400);

  /** Constructor for GdSqlcaMsg */
  public GdSqlcaMsg() {
    // TO-DO auto generated code
  }

  /**
   * Constructor for GdSqlcaMsg. sets the parent value to the parent
   *
   * @param parent
   * @param begin
   */
  public GdSqlcaMsg(Field parent, int begin) {
    setParent(parent, begin);
  }

  /**
   * Returns the value of gdSqlcaMsgLen
   *
   * @return gdSqlcaMsgLen
   */
  public short getGdSqlcaMsgLen() throws CFException {
    if (isGdSqlcaMsgLenModified()) {
      gdSqlcaMsgLen = refreshGdSqlcaMsgLen();
    }
    return gdSqlcaMsgLen;
  }

  /**
   * Update GdSqlcaMsgLen with the passed value Corresponding COBOL Variable is GD-SQLCA-MSG-LEN
   *
   * @param number
   */
  public void setGdSqlcaMsgLen(short number) {
    // Truncate if the number is beyond +/- Max range
    gdSqlcaMsgLen = checkGdSqlcaMsgLenMaxLimit(number);
    serializeGdSqlcaMsgLen(gdSqlcaMsgLen);
  }

  public void setGdSqlcaMsgLen(int number) {
    number =
        checkGdSqlcaMsgLenMaxLimit((short) number); // Truncate if value is beyond +/- Max range
    setGdSqlcaMsgLen((short) number);
  }

  public void setGdSqlcaMsgLen(long number) {
    number =
        checkGdSqlcaMsgLenMaxLimit((short) number); // Truncate if value is beyond +/- Max range
    setGdSqlcaMsgLen((short) number);
  }

  /**
   * Returns the value of gdSqlcaMsgText
   *
   * @return gdSqlcaMsgText
   */
  public char[] getGdSqlcaMsgText() throws CFException {
    if (isGdSqlcaMsgTextModified()) {
      gdSqlcaMsgText = refreshGdSqlcaMsgText();
    }
    return gdSqlcaMsgText;
  }

  /**
   * set variable gdSqlcaMsgText Corresponding COBOL Variable is GD-SQLCA-MSG-TEXT
   *
   * @param value
   */
  public void setGdSqlcaMsgText(char[] value) {
    gdSqlcaMsgText = checkGdSqlcaMsgTextConstraints(value);
    serializeGdSqlcaMsgText(gdSqlcaMsgText);
  }

  /**
   * Update GdSqlcaMsgText with a char[] from an offset and length
   *
   * @param value
   */
  public void setGdSqlcaMsgText(char[] source, int sourceIndex) {
    replace(source, sourceIndex, source.length, beginGdSqlcaMsgText, gdSqlcaMsgText.length);
  }

  public void setGdSqlcaMsgText(char[] source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginGdSqlcaMsgText, gdSqlcaMsgText.length);
  }

  /**
   * Update GdSqlcaMsgText with a char[] from an offset and length to an offset and length
   *
   * @param value
   */
  public void setGdSqlcaMsgText(
      char[] source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginGdSqlcaMsgText + targetIndex, targetLen);
  }

  /**
   * Update GdSqlcaMsgText with another Field
   *
   * @param value
   */
  public void setGdSqlcaMsgText(Field source) {
    replace(source, 0, source.length(), beginGdSqlcaMsgText, GD_SQLCA_MSG_TEXT_LEN);
  }

  /**
   * Update GdSqlcaMsgText with another Field from an offset and length
   *
   * @param value
   */
  public void setGdSqlcaMsgText(Field source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginGdSqlcaMsgText, GD_SQLCA_MSG_TEXT_LEN);
  }

  /**
   * Update GdSqlcaMsgText with another Field from an offset and length to an offset and length
   *
   * @param value
   */
  public void setGdSqlcaMsgText(
      Field source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginGdSqlcaMsgText + targetIndex, targetLen);
  }

  public static int getGdSqlcaMsgFieldLength() {
    return GD_SQLCA_MSG_LENGTH;
  }
}
