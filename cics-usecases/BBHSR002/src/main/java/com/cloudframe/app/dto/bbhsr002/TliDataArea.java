package com.cloudframe.app.dto.bbhsr002;

/**
 * The class TliDataArea is used to handle fields declared in it
 *
 * @author CloudFrame Inc. created on 2025-03-25 at 08:29. using version 5.0.0.231
 */
import com.cloudframe.app.data.Field;
import com.cloudframe.app.dto.serialize.bbhsr002.*;

public class TliDataArea extends TliDataAreaSerialized {

  private TliReqArea tliReqArea = new TliReqArea();
  private TliRetArea tliRetArea = new TliRetArea();

  /** Constructor for TliDataArea */
  public TliDataArea() {
    // TO-DO auto generated code
  }

  /**
   * Constructor for TliDataArea. sets the parent value to the parent
   *
   * @param parent
   * @param begin
   */
  public TliDataArea(Field parent, int begin) {
    setParent(parent, begin);
  }

  @Override
  public void setParent(Field parent, int begin) {
    super.setParent(parent, begin);
    tliReqArea.setParent(this, getStartOffset() + 0);
    tliRetArea.setParent(this, getStartOffset() + 32);
  }

  /**
   * Returns the value of tliReqArea
   *
   * @return tliReqArea
   */
  public TliReqArea getTliReqArea() {
    return tliReqArea;
  }
  /**
   * Update TliReqArea with the passed value Corresponding COBOL Variable is TLI-REQ-AREA
   *
   * @param value
   */
  public void setTliReqArea(char[] value) {
    tliReqArea.setString(value);
  }

  /**
   * Update TliReqArea with a String from an offset and length
   *
   * @param value
   */
  public void setTliReqArea(char[] source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, tliReqArea.begin, tliReqArea.length());
  }

  /**
   * Update TliReqArea with a String from an offset and length to an offset and length
   *
   * @param value
   */
  public void setTliReqArea(
      char[] source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, tliReqArea.begin + targetIndex, targetLen);
  }

  /**
   * Update TliReqArea with another Field
   *
   * @param value
   */
  public void setTliReqArea(Field source) {
    replace(source, 0, source.length(), tliReqArea.begin, tliReqArea.length());
  }

  /**
   * Update TliReqArea with another Field from an offset and length
   *
   * @param value
   */
  public void setTliReqArea(Field source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, tliReqArea.begin, tliReqArea.length());
  }

  /**
   * Update TliReqArea with another Field from an offset and length to an offset and length
   *
   * @param value
   */
  public void setTliReqArea(
      Field source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, tliReqArea.begin + targetIndex, targetLen);
  }
  /**
   * Returns the value of tliRetArea
   *
   * @return tliRetArea
   */
  public TliRetArea getTliRetArea() {
    return tliRetArea;
  }
  /**
   * Update TliRetArea with the passed value Corresponding COBOL Variable is TLI-RET-AREA
   *
   * @param value
   */
  public void setTliRetArea(char[] value) {
    tliRetArea.setString(value);
  }

  /**
   * Update TliRetArea with a String from an offset and length
   *
   * @param value
   */
  public void setTliRetArea(char[] source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, tliRetArea.begin, tliRetArea.length());
  }

  /**
   * Update TliRetArea with a String from an offset and length to an offset and length
   *
   * @param value
   */
  public void setTliRetArea(
      char[] source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, tliRetArea.begin + targetIndex, targetLen);
  }

  /**
   * Update TliRetArea with another Field
   *
   * @param value
   */
  public void setTliRetArea(Field source) {
    replace(source, 0, source.length(), tliRetArea.begin, tliRetArea.length());
  }

  /**
   * Update TliRetArea with another Field from an offset and length
   *
   * @param value
   */
  public void setTliRetArea(Field source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, tliRetArea.begin, tliRetArea.length());
  }

  /**
   * Update TliRetArea with another Field from an offset and length to an offset and length
   *
   * @param value
   */
  public void setTliRetArea(
      Field source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, tliRetArea.begin + targetIndex, targetLen);
  }

  /**
   * initializes TliDataArea String fields defaults to Spaces short/int/long defaults to zero
   * BigDecimal defaults to BigDecimal.ZERO
   */
  public void initialize() {
    tliReqArea.initialize();

    tliRetArea.initialize();
  }

  public static int getTliDataAreaFieldLength() {
    return TLI_DATA_AREA_LENGTH;
  }
}
