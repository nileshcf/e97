package com.cloudframe.app.dto.dphpctsq;

/**
 * The class WtdqRequestArea is used to handle fields declared in it
 *
 * @author CloudFrame Inc. created on 2025-03-25 at 08:30. using version 5.0.0.231
 */
import com.cloudframe.app.data.Field;
import com.cloudframe.app.dto.serialize.dphpctsq.*;
import com.cloudframe.app.exception.CFException;

public class WtdqRequestArea extends WtdqRequestAreaSerialized {

  private char[] wtdqMessageTyp = new char[1];

  private char[] wtdqApplication = new char[4];

  private char[] wtdqProgram = new char[8];

  private char[] wtdqParagraph = new char[30];

  private char[] wtdqMessage = Field.fillLowValue(5000);

  /** Constructor for WtdqRequestArea */
  public WtdqRequestArea() {
    // TO-DO auto generated code
  }

  /**
   * Constructor for WtdqRequestArea. sets the parent value to the parent
   *
   * @param parent
   * @param begin
   */
  public WtdqRequestArea(Field parent, int begin) {
    setParent(parent, begin);
  }

  @Override
  public void setParent(Field parent, int begin) {
    super.setParent(parent, begin);
    setWtdqMessageTyp(fillSpace(1));
    setWtdqApplication(fillSpace(4));
    setWtdqProgram(fillSpace(8));
    setWtdqParagraph(fillSpace(30));
  }

  /**
   * Returns the value of wtdqMessageTyp
   *
   * @return wtdqMessageTyp
   */
  public char[] getWtdqMessageTyp() throws CFException {
    if (isWtdqMessageTypModified()) {
      wtdqMessageTyp = refreshWtdqMessageTyp();
    }
    return wtdqMessageTyp;
  }

  /**
   * set variable wtdqMessageTyp Corresponding COBOL Variable is WTDQ-MESSAGE-TYP
   *
   * @param value
   */
  public void setWtdqMessageTyp(char[] value) {
    wtdqMessageTyp = checkWtdqMessageTypConstraints(value);
    serializeWtdqMessageTyp(wtdqMessageTyp);
  }

  /**
   * Update WtdqMessageTyp with a char[] from an offset and length
   *
   * @param value
   */
  public void setWtdqMessageTyp(char[] source, int sourceIndex) {
    replace(source, sourceIndex, source.length, beginWtdqMessageTyp, wtdqMessageTyp.length);
  }

  public void setWtdqMessageTyp(char[] source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginWtdqMessageTyp, wtdqMessageTyp.length);
  }

  /**
   * Update WtdqMessageTyp with a char[] from an offset and length to an offset and length
   *
   * @param value
   */
  public void setWtdqMessageTyp(
      char[] source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginWtdqMessageTyp + targetIndex, targetLen);
  }

  /**
   * Update WtdqMessageTyp with another Field
   *
   * @param value
   */
  public void setWtdqMessageTyp(Field source) {
    replace(source, 0, source.length(), beginWtdqMessageTyp, WTDQ_MESSAGE_TYP_LEN);
  }

  /**
   * Update WtdqMessageTyp with another Field from an offset and length
   *
   * @param value
   */
  public void setWtdqMessageTyp(Field source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginWtdqMessageTyp, WTDQ_MESSAGE_TYP_LEN);
  }

  /**
   * Update WtdqMessageTyp with another Field from an offset and length to an offset and length
   *
   * @param value
   */
  public void setWtdqMessageTyp(
      Field source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginWtdqMessageTyp + targetIndex, targetLen);
  }

  char[] wtdqInfoMsg88Value = "I".toCharArray();
  /**
   * Test condition "I" for isWtdqInfoMsg()
   *
   * @return Returns true if isWtdqInfoMsg() is "I"
   */
  public boolean isWtdqInfoMsg() throws CFException {
    return (compareChars(getWtdqMessageTyp(), wtdqInfoMsg88Value) == 0);
  }

  /** set values "I" */
  public void setWtdqInfoMsgTrue() {
    setWtdqMessageTyp(wtdqInfoMsg88Value);
  }

  char[] wtdqWarnMsg88Value = "W".toCharArray();
  /**
   * Test condition "W" for isWtdqWarnMsg()
   *
   * @return Returns true if isWtdqWarnMsg() is "W"
   */
  public boolean isWtdqWarnMsg() throws CFException {
    return (compareChars(getWtdqMessageTyp(), wtdqWarnMsg88Value) == 0);
  }

  /** set values "W" */
  public void setWtdqWarnMsgTrue() {
    setWtdqMessageTyp(wtdqWarnMsg88Value);
  }

  char[] wtdqErrorMsg88Value = "E".toCharArray();
  /**
   * Test condition "E" for isWtdqErrorMsg()
   *
   * @return Returns true if isWtdqErrorMsg() is "E"
   */
  public boolean isWtdqErrorMsg() throws CFException {
    return (compareChars(getWtdqMessageTyp(), wtdqErrorMsg88Value) == 0);
  }

  /** set values "E" */
  public void setWtdqErrorMsgTrue() {
    setWtdqMessageTyp(wtdqErrorMsg88Value);
  }
  /**
   * Returns the value of wtdqApplication
   *
   * @return wtdqApplication
   */
  public char[] getWtdqApplication() throws CFException {
    if (isWtdqApplicationModified()) {
      wtdqApplication = refreshWtdqApplication();
    }
    return wtdqApplication;
  }

  /**
   * set variable wtdqApplication Corresponding COBOL Variable is WTDQ-APPLICATION
   *
   * @param value
   */
  public void setWtdqApplication(char[] value) {
    wtdqApplication = checkWtdqApplicationConstraints(value);
    serializeWtdqApplication(wtdqApplication);
  }

  /**
   * Update WtdqApplication with a char[] from an offset and length
   *
   * @param value
   */
  public void setWtdqApplication(char[] source, int sourceIndex) {
    replace(source, sourceIndex, source.length, beginWtdqApplication, wtdqApplication.length);
  }

  public void setWtdqApplication(char[] source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginWtdqApplication, wtdqApplication.length);
  }

  /**
   * Update WtdqApplication with a char[] from an offset and length to an offset and length
   *
   * @param value
   */
  public void setWtdqApplication(
      char[] source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginWtdqApplication + targetIndex, targetLen);
  }

  /**
   * Update WtdqApplication with another Field
   *
   * @param value
   */
  public void setWtdqApplication(Field source) {
    replace(source, 0, source.length(), beginWtdqApplication, WTDQ_APPLICATION_LEN);
  }

  /**
   * Update WtdqApplication with another Field from an offset and length
   *
   * @param value
   */
  public void setWtdqApplication(Field source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginWtdqApplication, WTDQ_APPLICATION_LEN);
  }

  /**
   * Update WtdqApplication with another Field from an offset and length to an offset and length
   *
   * @param value
   */
  public void setWtdqApplication(
      Field source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginWtdqApplication + targetIndex, targetLen);
  }
  /**
   * Returns the value of wtdqProgram
   *
   * @return wtdqProgram
   */
  public char[] getWtdqProgram() throws CFException {
    if (isWtdqProgramModified()) {
      wtdqProgram = refreshWtdqProgram();
    }
    return wtdqProgram;
  }

  /**
   * set variable wtdqProgram Corresponding COBOL Variable is WTDQ-PROGRAM
   *
   * @param value
   */
  public void setWtdqProgram(char[] value) {
    wtdqProgram = checkWtdqProgramConstraints(value);
    serializeWtdqProgram(wtdqProgram);
  }

  /**
   * Update WtdqProgram with a char[] from an offset and length
   *
   * @param value
   */
  public void setWtdqProgram(char[] source, int sourceIndex) {
    replace(source, sourceIndex, source.length, beginWtdqProgram, wtdqProgram.length);
  }

  public void setWtdqProgram(char[] source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginWtdqProgram, wtdqProgram.length);
  }

  /**
   * Update WtdqProgram with a char[] from an offset and length to an offset and length
   *
   * @param value
   */
  public void setWtdqProgram(
      char[] source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginWtdqProgram + targetIndex, targetLen);
  }

  /**
   * Update WtdqProgram with another Field
   *
   * @param value
   */
  public void setWtdqProgram(Field source) {
    replace(source, 0, source.length(), beginWtdqProgram, WTDQ_PROGRAM_LEN);
  }

  /**
   * Update WtdqProgram with another Field from an offset and length
   *
   * @param value
   */
  public void setWtdqProgram(Field source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginWtdqProgram, WTDQ_PROGRAM_LEN);
  }

  /**
   * Update WtdqProgram with another Field from an offset and length to an offset and length
   *
   * @param value
   */
  public void setWtdqProgram(
      Field source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginWtdqProgram + targetIndex, targetLen);
  }
  /**
   * Returns the value of wtdqParagraph
   *
   * @return wtdqParagraph
   */
  public char[] getWtdqParagraph() throws CFException {
    if (isWtdqParagraphModified()) {
      wtdqParagraph = refreshWtdqParagraph();
    }
    return wtdqParagraph;
  }

  /**
   * set variable wtdqParagraph Corresponding COBOL Variable is WTDQ-PARAGRAPH
   *
   * @param value
   */
  public void setWtdqParagraph(char[] value) {
    wtdqParagraph = checkWtdqParagraphConstraints(value);
    serializeWtdqParagraph(wtdqParagraph);
  }

  /**
   * Update WtdqParagraph with a char[] from an offset and length
   *
   * @param value
   */
  public void setWtdqParagraph(char[] source, int sourceIndex) {
    replace(source, sourceIndex, source.length, beginWtdqParagraph, wtdqParagraph.length);
  }

  public void setWtdqParagraph(char[] source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginWtdqParagraph, wtdqParagraph.length);
  }

  /**
   * Update WtdqParagraph with a char[] from an offset and length to an offset and length
   *
   * @param value
   */
  public void setWtdqParagraph(
      char[] source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginWtdqParagraph + targetIndex, targetLen);
  }

  /**
   * Update WtdqParagraph with another Field
   *
   * @param value
   */
  public void setWtdqParagraph(Field source) {
    replace(source, 0, source.length(), beginWtdqParagraph, WTDQ_PARAGRAPH_LEN);
  }

  /**
   * Update WtdqParagraph with another Field from an offset and length
   *
   * @param value
   */
  public void setWtdqParagraph(Field source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginWtdqParagraph, WTDQ_PARAGRAPH_LEN);
  }

  /**
   * Update WtdqParagraph with another Field from an offset and length to an offset and length
   *
   * @param value
   */
  public void setWtdqParagraph(
      Field source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginWtdqParagraph + targetIndex, targetLen);
  }
  /**
   * Returns the value of wtdqMessage
   *
   * @return wtdqMessage
   */
  public char[] getWtdqMessage() throws CFException {
    if (isWtdqMessageModified()) {
      wtdqMessage = refreshWtdqMessage();
    }
    return wtdqMessage;
  }

  /**
   * set variable wtdqMessage Corresponding COBOL Variable is WTDQ-MESSAGE
   *
   * @param value
   */
  public void setWtdqMessage(char[] value) {
    wtdqMessage = checkWtdqMessageConstraints(value);
    serializeWtdqMessage(wtdqMessage);
  }

  /**
   * Update WtdqMessage with a char[] from an offset and length
   *
   * @param value
   */
  public void setWtdqMessage(char[] source, int sourceIndex) {
    replace(source, sourceIndex, source.length, beginWtdqMessage, wtdqMessage.length);
  }

  public void setWtdqMessage(char[] source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginWtdqMessage, wtdqMessage.length);
  }

  /**
   * Update WtdqMessage with a char[] from an offset and length to an offset and length
   *
   * @param value
   */
  public void setWtdqMessage(
      char[] source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginWtdqMessage + targetIndex, targetLen);
  }

  /**
   * Update WtdqMessage with another Field
   *
   * @param value
   */
  public void setWtdqMessage(Field source) {
    replace(source, 0, source.length(), beginWtdqMessage, WTDQ_MESSAGE_LEN);
  }

  /**
   * Update WtdqMessage with another Field from an offset and length
   *
   * @param value
   */
  public void setWtdqMessage(Field source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginWtdqMessage, WTDQ_MESSAGE_LEN);
  }

  /**
   * Update WtdqMessage with another Field from an offset and length to an offset and length
   *
   * @param value
   */
  public void setWtdqMessage(
      Field source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginWtdqMessage + targetIndex, targetLen);
  }

  public static int getWtdqRequestAreaFieldLength() {
    return WTDQ_REQUEST_AREA_LENGTH;
  }
}
