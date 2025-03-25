package com.cloudframe.app.dto.bbhsr002;

/**
 * The class HsrReqGetmainIdentifier is used to handle fields declared in it
 *
 * @author CloudFrame Inc. created on 2025-03-25 at 08:29. using version 5.0.0.231
 */
import com.cloudframe.app.data.Field;
import com.cloudframe.app.dto.serialize.bbhsr002.*;
import com.cloudframe.app.exception.CFException;

public class HsrReqGetmainIdentifier extends HsrReqGetmainIdentifierSerialized {

  private char[] hsrReqGetmainCreator = Field.fillLowValue(8);

  private char[] hsrReqGetmainCopybook = Field.fillLowValue(8);

  /** Constructor for HsrReqGetmainIdentifier */
  public HsrReqGetmainIdentifier() {
    // TO-DO auto generated code
  }

  /**
   * Constructor for HsrReqGetmainIdentifier. sets the parent value to the parent
   *
   * @param parent
   * @param begin
   */
  public HsrReqGetmainIdentifier(Field parent, int begin) {
    setParent(parent, begin);
  }

  /**
   * Returns the value of hsrReqGetmainCreator
   *
   * @return hsrReqGetmainCreator
   */
  public char[] getHsrReqGetmainCreator() throws CFException {
    if (isHsrReqGetmainCreatorModified()) {
      hsrReqGetmainCreator = refreshHsrReqGetmainCreator();
    }
    return hsrReqGetmainCreator;
  }

  /**
   * set variable hsrReqGetmainCreator Corresponding COBOL Variable is HSR-REQ-GETMAIN-CREATOR
   *
   * @param value
   */
  public void setHsrReqGetmainCreator(char[] value) {
    hsrReqGetmainCreator = checkHsrReqGetmainCreatorConstraints(value);
    serializeHsrReqGetmainCreator(hsrReqGetmainCreator);
  }

  /**
   * Update HsrReqGetmainCreator with a char[] from an offset and length
   *
   * @param value
   */
  public void setHsrReqGetmainCreator(char[] source, int sourceIndex) {
    replace(
        source, sourceIndex, source.length, beginHsrReqGetmainCreator, hsrReqGetmainCreator.length);
  }

  public void setHsrReqGetmainCreator(char[] source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginHsrReqGetmainCreator, hsrReqGetmainCreator.length);
  }

  /**
   * Update HsrReqGetmainCreator with a char[] from an offset and length to an offset and length
   *
   * @param value
   */
  public void setHsrReqGetmainCreator(
      char[] source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginHsrReqGetmainCreator + targetIndex, targetLen);
  }

  /**
   * Update HsrReqGetmainCreator with another Field
   *
   * @param value
   */
  public void setHsrReqGetmainCreator(Field source) {
    replace(source, 0, source.length(), beginHsrReqGetmainCreator, HSR_REQ_GETMAIN_CREATOR_LEN);
  }

  /**
   * Update HsrReqGetmainCreator with another Field from an offset and length
   *
   * @param value
   */
  public void setHsrReqGetmainCreator(Field source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginHsrReqGetmainCreator, HSR_REQ_GETMAIN_CREATOR_LEN);
  }

  /**
   * Update HsrReqGetmainCreator with another Field from an offset and length to an offset and
   * length
   *
   * @param value
   */
  public void setHsrReqGetmainCreator(
      Field source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginHsrReqGetmainCreator + targetIndex, targetLen);
  }
  /**
   * Returns the value of hsrReqGetmainCopybook
   *
   * @return hsrReqGetmainCopybook
   */
  public char[] getHsrReqGetmainCopybook() throws CFException {
    if (isHsrReqGetmainCopybookModified()) {
      hsrReqGetmainCopybook = refreshHsrReqGetmainCopybook();
    }
    return hsrReqGetmainCopybook;
  }

  /**
   * set variable hsrReqGetmainCopybook Corresponding COBOL Variable is HSR-REQ-GETMAIN-COPYBOOK
   *
   * @param value
   */
  public void setHsrReqGetmainCopybook(char[] value) {
    hsrReqGetmainCopybook = checkHsrReqGetmainCopybookConstraints(value);
    serializeHsrReqGetmainCopybook(hsrReqGetmainCopybook);
  }

  /**
   * Update HsrReqGetmainCopybook with a char[] from an offset and length
   *
   * @param value
   */
  public void setHsrReqGetmainCopybook(char[] source, int sourceIndex) {
    replace(
        source,
        sourceIndex,
        source.length,
        beginHsrReqGetmainCopybook,
        hsrReqGetmainCopybook.length);
  }

  public void setHsrReqGetmainCopybook(char[] source, int sourceIndex, int sourceLen) {
    replace(
        source, sourceIndex, sourceLen, beginHsrReqGetmainCopybook, hsrReqGetmainCopybook.length);
  }

  /**
   * Update HsrReqGetmainCopybook with a char[] from an offset and length to an offset and length
   *
   * @param value
   */
  public void setHsrReqGetmainCopybook(
      char[] source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginHsrReqGetmainCopybook + targetIndex, targetLen);
  }

  /**
   * Update HsrReqGetmainCopybook with another Field
   *
   * @param value
   */
  public void setHsrReqGetmainCopybook(Field source) {
    replace(source, 0, source.length(), beginHsrReqGetmainCopybook, HSR_REQ_GETMAIN_COPYBOOK_LEN);
  }

  /**
   * Update HsrReqGetmainCopybook with another Field from an offset and length
   *
   * @param value
   */
  public void setHsrReqGetmainCopybook(Field source, int sourceIndex, int sourceLen) {
    replace(
        source, sourceIndex, sourceLen, beginHsrReqGetmainCopybook, HSR_REQ_GETMAIN_COPYBOOK_LEN);
  }

  /**
   * Update HsrReqGetmainCopybook with another Field from an offset and length to an offset and
   * length
   *
   * @param value
   */
  public void setHsrReqGetmainCopybook(
      Field source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginHsrReqGetmainCopybook + targetIndex, targetLen);
  }

  char[] hsrReqGetmainVyhsrreq88Value = "VYHSRREQ".toCharArray();
  /**
   * Test condition "VYHSRREQ" for isHsrReqGetmainVyhsrreq()
   *
   * @return Returns true if isHsrReqGetmainVyhsrreq() is "VYHSRREQ"
   */
  public boolean isHsrReqGetmainVyhsrreq() throws CFException {
    return (compareChars(getHsrReqGetmainCopybook(), hsrReqGetmainVyhsrreq88Value) == 0);
  }

  /** set values "VYHSRREQ" */
  public void setHsrReqGetmainVyhsrreqTrue() {
    setHsrReqGetmainCopybook(hsrReqGetmainVyhsrreq88Value);
  }

  public static int getHsrReqGetmainIdentifierFieldLength() {
    return HSR_REQ_GETMAIN_IDENTIFIER_LENGTH;
  }
}
