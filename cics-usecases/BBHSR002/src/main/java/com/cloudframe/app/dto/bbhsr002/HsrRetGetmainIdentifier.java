package com.cloudframe.app.dto.bbhsr002;

/**
 * The class HsrRetGetmainIdentifier is used to handle fields declared in it
 *
 * @author CloudFrame Inc. created on 2025-03-25 at 08:29. using version 5.0.0.231
 */
import com.cloudframe.app.common.CONSTANTS;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.dto.serialize.bbhsr002.*;
import com.cloudframe.app.exception.CFException;

public class HsrRetGetmainIdentifier extends HsrRetGetmainIdentifierSerialized {

  private char[] hsrRetGetmainCreator = Field.fillLowValue(8);

  private char[] hsrRetGetmainCopybook = Field.fillLowValue(8);

  /** Constructor for HsrRetGetmainIdentifier */
  public HsrRetGetmainIdentifier() {
    // TO-DO auto generated code
  }

  /**
   * Constructor for HsrRetGetmainIdentifier. sets the parent value to the parent
   *
   * @param parent
   * @param begin
   */
  public HsrRetGetmainIdentifier(Field parent, int begin) {
    setParent(parent, begin);
  }

  /**
   * Returns the value of hsrRetGetmainCreator
   *
   * @return hsrRetGetmainCreator
   */
  public char[] getHsrRetGetmainCreator() throws CFException {
    if (isHsrRetGetmainCreatorModified()) {
      hsrRetGetmainCreator = refreshHsrRetGetmainCreator();
    }
    return hsrRetGetmainCreator;
  }

  /**
   * set variable hsrRetGetmainCreator Corresponding COBOL Variable is HSR-RET-GETMAIN-CREATOR
   *
   * @param value
   */
  public void setHsrRetGetmainCreator(char[] value) {
    hsrRetGetmainCreator = checkHsrRetGetmainCreatorConstraints(value);
    serializeHsrRetGetmainCreator(hsrRetGetmainCreator);
  }

  /**
   * Update HsrRetGetmainCreator with a char[] from an offset and length
   *
   * @param value
   */
  public void setHsrRetGetmainCreator(char[] source, int sourceIndex) {
    replace(
        source, sourceIndex, source.length, beginHsrRetGetmainCreator, hsrRetGetmainCreator.length);
  }

  public void setHsrRetGetmainCreator(char[] source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginHsrRetGetmainCreator, hsrRetGetmainCreator.length);
  }

  /**
   * Update HsrRetGetmainCreator with a char[] from an offset and length to an offset and length
   *
   * @param value
   */
  public void setHsrRetGetmainCreator(
      char[] source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginHsrRetGetmainCreator + targetIndex, targetLen);
  }

  /**
   * Update HsrRetGetmainCreator with another Field
   *
   * @param value
   */
  public void setHsrRetGetmainCreator(Field source) {
    replace(source, 0, source.length(), beginHsrRetGetmainCreator, HSR_RET_GETMAIN_CREATOR_LEN);
  }

  /**
   * Update HsrRetGetmainCreator with another Field from an offset and length
   *
   * @param value
   */
  public void setHsrRetGetmainCreator(Field source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginHsrRetGetmainCreator, HSR_RET_GETMAIN_CREATOR_LEN);
  }

  /**
   * Update HsrRetGetmainCreator with another Field from an offset and length to an offset and
   * length
   *
   * @param value
   */
  public void setHsrRetGetmainCreator(
      Field source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginHsrRetGetmainCreator + targetIndex, targetLen);
  }
  /**
   * Returns the value of hsrRetGetmainCopybook
   *
   * @return hsrRetGetmainCopybook
   */
  public char[] getHsrRetGetmainCopybook() throws CFException {
    if (isHsrRetGetmainCopybookModified()) {
      hsrRetGetmainCopybook = refreshHsrRetGetmainCopybook();
    }
    return hsrRetGetmainCopybook;
  }

  /**
   * set variable hsrRetGetmainCopybook Corresponding COBOL Variable is HSR-RET-GETMAIN-COPYBOOK
   *
   * @param value
   */
  public void setHsrRetGetmainCopybook(char[] value) {
    hsrRetGetmainCopybook = checkHsrRetGetmainCopybookConstraints(value);
    serializeHsrRetGetmainCopybook(hsrRetGetmainCopybook);
  }

  /**
   * Update HsrRetGetmainCopybook with a char[] from an offset and length
   *
   * @param value
   */
  public void setHsrRetGetmainCopybook(char[] source, int sourceIndex) {
    replace(
        source,
        sourceIndex,
        source.length,
        beginHsrRetGetmainCopybook,
        hsrRetGetmainCopybook.length);
  }

  public void setHsrRetGetmainCopybook(char[] source, int sourceIndex, int sourceLen) {
    replace(
        source, sourceIndex, sourceLen, beginHsrRetGetmainCopybook, hsrRetGetmainCopybook.length);
  }

  /**
   * Update HsrRetGetmainCopybook with a char[] from an offset and length to an offset and length
   *
   * @param value
   */
  public void setHsrRetGetmainCopybook(
      char[] source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginHsrRetGetmainCopybook + targetIndex, targetLen);
  }

  /**
   * Update HsrRetGetmainCopybook with another Field
   *
   * @param value
   */
  public void setHsrRetGetmainCopybook(Field source) {
    replace(source, 0, source.length(), beginHsrRetGetmainCopybook, HSR_RET_GETMAIN_COPYBOOK_LEN);
  }

  /**
   * Update HsrRetGetmainCopybook with another Field from an offset and length
   *
   * @param value
   */
  public void setHsrRetGetmainCopybook(Field source, int sourceIndex, int sourceLen) {
    replace(
        source, sourceIndex, sourceLen, beginHsrRetGetmainCopybook, HSR_RET_GETMAIN_COPYBOOK_LEN);
  }

  /**
   * Update HsrRetGetmainCopybook with another Field from an offset and length to an offset and
   * length
   *
   * @param value
   */
  public void setHsrRetGetmainCopybook(
      Field source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginHsrRetGetmainCopybook + targetIndex, targetLen);
  }

  char[] hsrRetGetmainVyhsrret88Value = "VYHSRRT1".toCharArray();
  /**
   * Test condition "VYHSRRT1" for isHsrRetGetmainVyhsrret()
   *
   * @return Returns true if isHsrRetGetmainVyhsrret() is "VYHSRRT1"
   */
  public boolean isHsrRetGetmainVyhsrret() throws CFException {
    return (compareChars(getHsrRetGetmainCopybook(), hsrRetGetmainVyhsrret88Value) == 0);
  }

  /** set values "VYHSRRT1" */
  public void setHsrRetGetmainVyhsrretTrue() {
    setHsrRetGetmainCopybook(hsrRetGetmainVyhsrret88Value);
  }

  /**
   * initializes HsrRetGetmainIdentifier String fields defaults to Spaces short/int/long defaults to
   * zero BigDecimal defaults to BigDecimal.ZERO
   */
  public void initialize() {
    setHsrRetGetmainCreator(CONSTANTS.SPACE_8);
    setHsrRetGetmainCopybook(CONSTANTS.SPACE_8);
  }

  public static int getHsrRetGetmainIdentifierFieldLength() {
    return HSR_RET_GETMAIN_IDENTIFIER_LENGTH;
  }
}
