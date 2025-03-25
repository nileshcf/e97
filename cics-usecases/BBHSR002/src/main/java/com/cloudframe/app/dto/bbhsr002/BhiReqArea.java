package com.cloudframe.app.dto.bbhsr002;

/**
 * The class BhiReqArea is used to handle fields declared in it
 *
 * @author CloudFrame Inc. created on 2025-03-25 at 08:29. using version 5.0.0.231
 */
import com.cloudframe.app.common.CONSTANTS;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.dto.serialize.bbhsr002.*;
import com.cloudframe.app.exception.CFException;

public class BhiReqArea extends BhiReqAreaSerialized {

  private char[] bhiReqHipaaCode = Field.fillLowValue(2);

  private char[] bhiReqSlotTable = Field.fillLowValue(6);

  private char[] bhiReqEffectDate = Field.fillLowValue(10);

  private char[] bhiReqCancelDate = Field.fillLowValue(10);

  /** Constructor for BhiReqArea */
  public BhiReqArea() {
    // TO-DO auto generated code
  }

  /**
   * Constructor for BhiReqArea. sets the parent value to the parent
   *
   * @param parent
   * @param begin
   */
  public BhiReqArea(Field parent, int begin) {
    setParent(parent, begin);
  }

  /**
   * Returns the value of bhiReqHipaaCode
   *
   * @return bhiReqHipaaCode
   */
  public char[] getBhiReqHipaaCode() throws CFException {
    if (isBhiReqHipaaCodeModified()) {
      bhiReqHipaaCode = refreshBhiReqHipaaCode();
    }
    return bhiReqHipaaCode;
  }

  /**
   * set variable bhiReqHipaaCode Corresponding COBOL Variable is BHI-REQ-HIPAA-CODE
   *
   * @param value
   */
  public void setBhiReqHipaaCode(char[] value) {
    bhiReqHipaaCode = checkBhiReqHipaaCodeConstraints(value);
    serializeBhiReqHipaaCode(bhiReqHipaaCode);
  }

  /**
   * Update BhiReqHipaaCode with a char[] from an offset and length
   *
   * @param value
   */
  public void setBhiReqHipaaCode(char[] source, int sourceIndex) {
    replace(source, sourceIndex, source.length, beginBhiReqHipaaCode, bhiReqHipaaCode.length);
  }

  public void setBhiReqHipaaCode(char[] source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginBhiReqHipaaCode, bhiReqHipaaCode.length);
  }

  /**
   * Update BhiReqHipaaCode with a char[] from an offset and length to an offset and length
   *
   * @param value
   */
  public void setBhiReqHipaaCode(
      char[] source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginBhiReqHipaaCode + targetIndex, targetLen);
  }

  /**
   * Update BhiReqHipaaCode with another Field
   *
   * @param value
   */
  public void setBhiReqHipaaCode(Field source) {
    replace(source, 0, source.length(), beginBhiReqHipaaCode, BHI_REQ_HIPAA_CODE_LEN);
  }

  /**
   * Update BhiReqHipaaCode with another Field from an offset and length
   *
   * @param value
   */
  public void setBhiReqHipaaCode(Field source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginBhiReqHipaaCode, BHI_REQ_HIPAA_CODE_LEN);
  }

  /**
   * Update BhiReqHipaaCode with another Field from an offset and length to an offset and length
   *
   * @param value
   */
  public void setBhiReqHipaaCode(
      Field source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginBhiReqHipaaCode + targetIndex, targetLen);
  }
  /**
   * Returns the value of bhiReqSlotTable
   *
   * @return bhiReqSlotTable
   */
  public char[] getBhiReqSlotTable() throws CFException {
    if (isBhiReqSlotTableModified()) {
      bhiReqSlotTable = refreshBhiReqSlotTable();
    }
    return bhiReqSlotTable;
  }

  /**
   * set variable bhiReqSlotTable Corresponding COBOL Variable is BHI-REQ-SLOT-TABLE
   *
   * @param value
   */
  public void setBhiReqSlotTable(char[] value) {
    bhiReqSlotTable = checkBhiReqSlotTableConstraints(value);
    serializeBhiReqSlotTable(bhiReqSlotTable);
  }

  /**
   * Update BhiReqSlotTable with a char[] from an offset and length
   *
   * @param value
   */
  public void setBhiReqSlotTable(char[] source, int sourceIndex) {
    replace(source, sourceIndex, source.length, beginBhiReqSlotTable, bhiReqSlotTable.length);
  }

  public void setBhiReqSlotTable(char[] source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginBhiReqSlotTable, bhiReqSlotTable.length);
  }

  /**
   * Update BhiReqSlotTable with a char[] from an offset and length to an offset and length
   *
   * @param value
   */
  public void setBhiReqSlotTable(
      char[] source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginBhiReqSlotTable + targetIndex, targetLen);
  }

  /**
   * Update BhiReqSlotTable with another Field
   *
   * @param value
   */
  public void setBhiReqSlotTable(Field source) {
    replace(source, 0, source.length(), beginBhiReqSlotTable, BHI_REQ_SLOT_TABLE_LEN);
  }

  /**
   * Update BhiReqSlotTable with another Field from an offset and length
   *
   * @param value
   */
  public void setBhiReqSlotTable(Field source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginBhiReqSlotTable, BHI_REQ_SLOT_TABLE_LEN);
  }

  /**
   * Update BhiReqSlotTable with another Field from an offset and length to an offset and length
   *
   * @param value
   */
  public void setBhiReqSlotTable(
      Field source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginBhiReqSlotTable + targetIndex, targetLen);
  }
  /**
   * Returns the value of bhiReqEffectDate
   *
   * @return bhiReqEffectDate
   */
  public char[] getBhiReqEffectDate() throws CFException {
    if (isBhiReqEffectDateModified()) {
      bhiReqEffectDate = refreshBhiReqEffectDate();
    }
    return bhiReqEffectDate;
  }

  /**
   * set variable bhiReqEffectDate Corresponding COBOL Variable is BHI-REQ-EFFECT-DATE
   *
   * @param value
   */
  public void setBhiReqEffectDate(char[] value) {
    bhiReqEffectDate = checkBhiReqEffectDateConstraints(value);
    serializeBhiReqEffectDate(bhiReqEffectDate);
  }

  /**
   * Update BhiReqEffectDate with a char[] from an offset and length
   *
   * @param value
   */
  public void setBhiReqEffectDate(char[] source, int sourceIndex) {
    replace(source, sourceIndex, source.length, beginBhiReqEffectDate, bhiReqEffectDate.length);
  }

  public void setBhiReqEffectDate(char[] source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginBhiReqEffectDate, bhiReqEffectDate.length);
  }

  /**
   * Update BhiReqEffectDate with a char[] from an offset and length to an offset and length
   *
   * @param value
   */
  public void setBhiReqEffectDate(
      char[] source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginBhiReqEffectDate + targetIndex, targetLen);
  }

  /**
   * Update BhiReqEffectDate with another Field
   *
   * @param value
   */
  public void setBhiReqEffectDate(Field source) {
    replace(source, 0, source.length(), beginBhiReqEffectDate, BHI_REQ_EFFECT_DATE_LEN);
  }

  /**
   * Update BhiReqEffectDate with another Field from an offset and length
   *
   * @param value
   */
  public void setBhiReqEffectDate(Field source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginBhiReqEffectDate, BHI_REQ_EFFECT_DATE_LEN);
  }

  /**
   * Update BhiReqEffectDate with another Field from an offset and length to an offset and length
   *
   * @param value
   */
  public void setBhiReqEffectDate(
      Field source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginBhiReqEffectDate + targetIndex, targetLen);
  }
  /**
   * Returns the value of bhiReqCancelDate
   *
   * @return bhiReqCancelDate
   */
  public char[] getBhiReqCancelDate() throws CFException {
    if (isBhiReqCancelDateModified()) {
      bhiReqCancelDate = refreshBhiReqCancelDate();
    }
    return bhiReqCancelDate;
  }

  /**
   * set variable bhiReqCancelDate Corresponding COBOL Variable is BHI-REQ-CANCEL-DATE
   *
   * @param value
   */
  public void setBhiReqCancelDate(char[] value) {
    bhiReqCancelDate = checkBhiReqCancelDateConstraints(value);
    serializeBhiReqCancelDate(bhiReqCancelDate);
  }

  /**
   * Update BhiReqCancelDate with a char[] from an offset and length
   *
   * @param value
   */
  public void setBhiReqCancelDate(char[] source, int sourceIndex) {
    replace(source, sourceIndex, source.length, beginBhiReqCancelDate, bhiReqCancelDate.length);
  }

  public void setBhiReqCancelDate(char[] source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginBhiReqCancelDate, bhiReqCancelDate.length);
  }

  /**
   * Update BhiReqCancelDate with a char[] from an offset and length to an offset and length
   *
   * @param value
   */
  public void setBhiReqCancelDate(
      char[] source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginBhiReqCancelDate + targetIndex, targetLen);
  }

  /**
   * Update BhiReqCancelDate with another Field
   *
   * @param value
   */
  public void setBhiReqCancelDate(Field source) {
    replace(source, 0, source.length(), beginBhiReqCancelDate, BHI_REQ_CANCEL_DATE_LEN);
  }

  /**
   * Update BhiReqCancelDate with another Field from an offset and length
   *
   * @param value
   */
  public void setBhiReqCancelDate(Field source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginBhiReqCancelDate, BHI_REQ_CANCEL_DATE_LEN);
  }

  /**
   * Update BhiReqCancelDate with another Field from an offset and length to an offset and length
   *
   * @param value
   */
  public void setBhiReqCancelDate(
      Field source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginBhiReqCancelDate + targetIndex, targetLen);
  }

  /**
   * initializes BhiReqArea String fields defaults to Spaces short/int/long defaults to zero
   * BigDecimal defaults to BigDecimal.ZERO
   */
  public void initialize() {
    setBhiReqHipaaCode(CONSTANTS.SPACE_2);
    setBhiReqSlotTable(CONSTANTS.SPACE_6);
    setBhiReqEffectDate(CONSTANTS.SPACE_10);
    setBhiReqCancelDate(CONSTANTS.SPACE_10);
  }

  public static int getBhiReqAreaFieldLength() {
    return BHI_REQ_AREA_LENGTH;
  }
}
