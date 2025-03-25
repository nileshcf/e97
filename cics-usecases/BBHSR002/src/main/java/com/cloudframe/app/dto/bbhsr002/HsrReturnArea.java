package com.cloudframe.app.dto.bbhsr002;

/**
 * The class HsrReturnArea is used to handle fields declared in it
 *
 * @author CloudFrame Inc. created on 2025-03-25 at 08:29. using version 5.0.0.231
 */
import com.cloudframe.app.data.Field;
import com.cloudframe.app.dto.serialize.bbhsr002.*;

public class HsrReturnArea extends HsrReturnAreaSerialized {

  private HsrRetGetmainIdentifier hsrRetGetmainIdentifier = new HsrRetGetmainIdentifier();
  private HsrRetArea hsrRetArea = new HsrRetArea();
  private HsrRetFunctionMessage hsrRetFunctionMessage = new HsrRetFunctionMessage();

  /** Constructor for HsrReturnArea */
  public HsrReturnArea() {
    super();
    /*  set the parent of each child as this which are a group variable */
    hsrRetGetmainIdentifier.setParent(this, getStartOffset() + 0);
    hsrRetArea.setParent(this, getStartOffset() + 16);
    hsrRetFunctionMessage.setParent(this, getStartOffset() + 1212620);
    /*  end of offset */
  }

  /**
   * Returns the value of hsrRetGetmainIdentifier
   *
   * @return hsrRetGetmainIdentifier
   */
  public HsrRetGetmainIdentifier getHsrRetGetmainIdentifier() {
    return hsrRetGetmainIdentifier;
  }
  /**
   * Update HsrRetGetmainIdentifier with the passed value Corresponding COBOL Variable is
   * HSR-RET-GETMAIN-IDENTIFIER
   *
   * @param value
   */
  public void setHsrRetGetmainIdentifier(char[] value) {
    hsrRetGetmainIdentifier.setString(value);
  }

  /**
   * Update HsrRetGetmainIdentifier with a String from an offset and length
   *
   * @param value
   */
  public void setHsrRetGetmainIdentifier(char[] source, int sourceIndex, int sourceLen) {
    replace(
        source,
        sourceIndex,
        sourceLen,
        hsrRetGetmainIdentifier.begin,
        hsrRetGetmainIdentifier.length());
  }

  /**
   * Update HsrRetGetmainIdentifier with a String from an offset and length to an offset and length
   *
   * @param value
   */
  public void setHsrRetGetmainIdentifier(
      char[] source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, hsrRetGetmainIdentifier.begin + targetIndex, targetLen);
  }

  /**
   * Update HsrRetGetmainIdentifier with another Field
   *
   * @param value
   */
  public void setHsrRetGetmainIdentifier(Field source) {
    replace(
        source,
        0,
        source.length(),
        hsrRetGetmainIdentifier.begin,
        hsrRetGetmainIdentifier.length());
  }

  /**
   * Update HsrRetGetmainIdentifier with another Field from an offset and length
   *
   * @param value
   */
  public void setHsrRetGetmainIdentifier(Field source, int sourceIndex, int sourceLen) {
    replace(
        source,
        sourceIndex,
        sourceLen,
        hsrRetGetmainIdentifier.begin,
        hsrRetGetmainIdentifier.length());
  }

  /**
   * Update HsrRetGetmainIdentifier with another Field from an offset and length to an offset and
   * length
   *
   * @param value
   */
  public void setHsrRetGetmainIdentifier(
      Field source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, hsrRetGetmainIdentifier.begin + targetIndex, targetLen);
  }
  /**
   * Returns the value of hsrRetArea
   *
   * @return hsrRetArea
   */
  public HsrRetArea getHsrRetArea() {
    return hsrRetArea;
  }
  /**
   * Update HsrRetArea with the passed value Corresponding COBOL Variable is HSR-RET-AREA
   *
   * @param value
   */
  public void setHsrRetArea(char[] value) {
    hsrRetArea.setString(value);
  }

  /**
   * Update HsrRetArea with a String from an offset and length
   *
   * @param value
   */
  public void setHsrRetArea(char[] source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, hsrRetArea.begin, hsrRetArea.length());
  }

  /**
   * Update HsrRetArea with a String from an offset and length to an offset and length
   *
   * @param value
   */
  public void setHsrRetArea(
      char[] source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, hsrRetArea.begin + targetIndex, targetLen);
  }

  /**
   * Update HsrRetArea with another Field
   *
   * @param value
   */
  public void setHsrRetArea(Field source) {
    replace(source, 0, source.length(), hsrRetArea.begin, hsrRetArea.length());
  }

  /**
   * Update HsrRetArea with another Field from an offset and length
   *
   * @param value
   */
  public void setHsrRetArea(Field source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, hsrRetArea.begin, hsrRetArea.length());
  }

  /**
   * Update HsrRetArea with another Field from an offset and length to an offset and length
   *
   * @param value
   */
  public void setHsrRetArea(
      Field source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, hsrRetArea.begin + targetIndex, targetLen);
  }
  /**
   * Returns the value of hsrRetFunctionMessage
   *
   * @return hsrRetFunctionMessage
   */
  public HsrRetFunctionMessage getHsrRetFunctionMessage() {
    return hsrRetFunctionMessage;
  }
  /**
   * Update HsrRetFunctionMessage with the passed value Corresponding COBOL Variable is
   * HSR-RET-FUNCTION-MESSAGE
   *
   * @param value
   */
  public void setHsrRetFunctionMessage(char[] value) {
    hsrRetFunctionMessage.setString(value);
  }

  /**
   * Update HsrRetFunctionMessage with a String from an offset and length
   *
   * @param value
   */
  public void setHsrRetFunctionMessage(char[] source, int sourceIndex, int sourceLen) {
    replace(
        source,
        sourceIndex,
        sourceLen,
        hsrRetFunctionMessage.begin,
        hsrRetFunctionMessage.length());
  }

  /**
   * Update HsrRetFunctionMessage with a String from an offset and length to an offset and length
   *
   * @param value
   */
  public void setHsrRetFunctionMessage(
      char[] source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, hsrRetFunctionMessage.begin + targetIndex, targetLen);
  }

  /**
   * Update HsrRetFunctionMessage with another Field
   *
   * @param value
   */
  public void setHsrRetFunctionMessage(Field source) {
    replace(
        source, 0, source.length(), hsrRetFunctionMessage.begin, hsrRetFunctionMessage.length());
  }

  /**
   * Update HsrRetFunctionMessage with another Field from an offset and length
   *
   * @param value
   */
  public void setHsrRetFunctionMessage(Field source, int sourceIndex, int sourceLen) {
    replace(
        source,
        sourceIndex,
        sourceLen,
        hsrRetFunctionMessage.begin,
        hsrRetFunctionMessage.length());
  }

  /**
   * Update HsrRetFunctionMessage with another Field from an offset and length to an offset and
   * length
   *
   * @param value
   */
  public void setHsrRetFunctionMessage(
      Field source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, hsrRetFunctionMessage.begin + targetIndex, targetLen);
  }

  /**
   * initializes HsrReturnArea String fields defaults to Spaces short/int/long defaults to zero
   * BigDecimal defaults to BigDecimal.ZERO
   */
  public void initialize() {
    hsrRetGetmainIdentifier.initialize();

    hsrRetArea.initialize();

    hsrRetFunctionMessage.initialize();
  }

  public static int getHsrReturnAreaFieldLength() {
    return HSR_RETURN_AREA_LENGTH;
  }
}
