package com.cloudframe.app.dto.bbhsr002;

/**
 * The class BhiReqRowKey is used to handle fields declared in it
 *
 * @author CloudFrame Inc. created on 2025-03-25 at 08:29. using version 5.0.0.231
 */
import com.cloudframe.app.data.Field;
import com.cloudframe.app.dto.serialize.bbhsr002.*;
import com.cloudframe.app.exception.CFException;

public class BhiReqRowKey extends BhiReqRowKeySerialized {

  private char[] bhiReqRowSlotTblId = Field.fillLowValue(6);

  private char[] bhiReqRowHipaaVerNbr = Field.fillLowValue(1);

  private char[] bhiReqRowHipaaCd = Field.fillLowValue(2);

  private char[] bhiReqRowNetId = Field.fillLowValue(1);

  private char[] bhiReqRowEffDate = Field.fillLowValue(10);

  private char[] bhiReqRowCancDt = Field.fillLowValue(10);

  /** Constructor for BhiReqRowKey */
  public BhiReqRowKey() {
    // TO-DO auto generated code
  }

  /**
   * Constructor for BhiReqRowKey. sets the parent value to the parent
   *
   * @param parent
   * @param begin
   */
  public BhiReqRowKey(Field parent, int begin) {
    setParent(parent, begin);
  }

  /**
   * Returns the value of bhiReqRowSlotTblId
   *
   * @return bhiReqRowSlotTblId
   */
  public char[] getBhiReqRowSlotTblId() throws CFException {
    if (isBhiReqRowSlotTblIdModified()) {
      bhiReqRowSlotTblId = refreshBhiReqRowSlotTblId();
    }
    return bhiReqRowSlotTblId;
  }

  /**
   * set variable bhiReqRowSlotTblId Corresponding COBOL Variable is BHI-REQ-ROW-SLOT-TBL-ID
   *
   * @param value
   */
  public void setBhiReqRowSlotTblId(char[] value) {
    bhiReqRowSlotTblId = checkBhiReqRowSlotTblIdConstraints(value);
    serializeBhiReqRowSlotTblId(bhiReqRowSlotTblId);
  }

  /**
   * Update BhiReqRowSlotTblId with a char[] from an offset and length
   *
   * @param value
   */
  public void setBhiReqRowSlotTblId(char[] source, int sourceIndex) {
    replace(source, sourceIndex, source.length, beginBhiReqRowSlotTblId, bhiReqRowSlotTblId.length);
  }

  public void setBhiReqRowSlotTblId(char[] source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginBhiReqRowSlotTblId, bhiReqRowSlotTblId.length);
  }

  /**
   * Update BhiReqRowSlotTblId with a char[] from an offset and length to an offset and length
   *
   * @param value
   */
  public void setBhiReqRowSlotTblId(
      char[] source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginBhiReqRowSlotTblId + targetIndex, targetLen);
  }

  /**
   * Update BhiReqRowSlotTblId with another Field
   *
   * @param value
   */
  public void setBhiReqRowSlotTblId(Field source) {
    replace(source, 0, source.length(), beginBhiReqRowSlotTblId, BHI_REQ_ROW_SLOT_TBL_ID_LEN);
  }

  /**
   * Update BhiReqRowSlotTblId with another Field from an offset and length
   *
   * @param value
   */
  public void setBhiReqRowSlotTblId(Field source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginBhiReqRowSlotTblId, BHI_REQ_ROW_SLOT_TBL_ID_LEN);
  }

  /**
   * Update BhiReqRowSlotTblId with another Field from an offset and length to an offset and length
   *
   * @param value
   */
  public void setBhiReqRowSlotTblId(
      Field source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginBhiReqRowSlotTblId + targetIndex, targetLen);
  }
  /**
   * Returns the value of bhiReqRowHipaaVerNbr
   *
   * @return bhiReqRowHipaaVerNbr
   */
  public char[] getBhiReqRowHipaaVerNbr() throws CFException {
    if (isBhiReqRowHipaaVerNbrModified()) {
      bhiReqRowHipaaVerNbr = refreshBhiReqRowHipaaVerNbr();
    }
    return bhiReqRowHipaaVerNbr;
  }

  /**
   * set variable bhiReqRowHipaaVerNbr Corresponding COBOL Variable is BHI-REQ-ROW-HIPAA-VER-NBR
   *
   * @param value
   */
  public void setBhiReqRowHipaaVerNbr(char[] value) {
    bhiReqRowHipaaVerNbr = checkBhiReqRowHipaaVerNbrConstraints(value);
    serializeBhiReqRowHipaaVerNbr(bhiReqRowHipaaVerNbr);
  }

  /**
   * Update BhiReqRowHipaaVerNbr with a char[] from an offset and length
   *
   * @param value
   */
  public void setBhiReqRowHipaaVerNbr(char[] source, int sourceIndex) {
    replace(
        source, sourceIndex, source.length, beginBhiReqRowHipaaVerNbr, bhiReqRowHipaaVerNbr.length);
  }

  public void setBhiReqRowHipaaVerNbr(char[] source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginBhiReqRowHipaaVerNbr, bhiReqRowHipaaVerNbr.length);
  }

  /**
   * Update BhiReqRowHipaaVerNbr with a char[] from an offset and length to an offset and length
   *
   * @param value
   */
  public void setBhiReqRowHipaaVerNbr(
      char[] source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginBhiReqRowHipaaVerNbr + targetIndex, targetLen);
  }

  /**
   * Update BhiReqRowHipaaVerNbr with another Field
   *
   * @param value
   */
  public void setBhiReqRowHipaaVerNbr(Field source) {
    replace(source, 0, source.length(), beginBhiReqRowHipaaVerNbr, BHI_REQ_ROW_HIPAA_VER_NBR_LEN);
  }

  /**
   * Update BhiReqRowHipaaVerNbr with another Field from an offset and length
   *
   * @param value
   */
  public void setBhiReqRowHipaaVerNbr(Field source, int sourceIndex, int sourceLen) {
    replace(
        source, sourceIndex, sourceLen, beginBhiReqRowHipaaVerNbr, BHI_REQ_ROW_HIPAA_VER_NBR_LEN);
  }

  /**
   * Update BhiReqRowHipaaVerNbr with another Field from an offset and length to an offset and
   * length
   *
   * @param value
   */
  public void setBhiReqRowHipaaVerNbr(
      Field source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginBhiReqRowHipaaVerNbr + targetIndex, targetLen);
  }
  /**
   * Returns the value of bhiReqRowHipaaCd
   *
   * @return bhiReqRowHipaaCd
   */
  public char[] getBhiReqRowHipaaCd() throws CFException {
    if (isBhiReqRowHipaaCdModified()) {
      bhiReqRowHipaaCd = refreshBhiReqRowHipaaCd();
    }
    return bhiReqRowHipaaCd;
  }

  /**
   * set variable bhiReqRowHipaaCd Corresponding COBOL Variable is BHI-REQ-ROW-HIPAA-CD
   *
   * @param value
   */
  public void setBhiReqRowHipaaCd(char[] value) {
    bhiReqRowHipaaCd = checkBhiReqRowHipaaCdConstraints(value);
    serializeBhiReqRowHipaaCd(bhiReqRowHipaaCd);
  }

  /**
   * Update BhiReqRowHipaaCd with a char[] from an offset and length
   *
   * @param value
   */
  public void setBhiReqRowHipaaCd(char[] source, int sourceIndex) {
    replace(source, sourceIndex, source.length, beginBhiReqRowHipaaCd, bhiReqRowHipaaCd.length);
  }

  public void setBhiReqRowHipaaCd(char[] source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginBhiReqRowHipaaCd, bhiReqRowHipaaCd.length);
  }

  /**
   * Update BhiReqRowHipaaCd with a char[] from an offset and length to an offset and length
   *
   * @param value
   */
  public void setBhiReqRowHipaaCd(
      char[] source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginBhiReqRowHipaaCd + targetIndex, targetLen);
  }

  /**
   * Update BhiReqRowHipaaCd with another Field
   *
   * @param value
   */
  public void setBhiReqRowHipaaCd(Field source) {
    replace(source, 0, source.length(), beginBhiReqRowHipaaCd, BHI_REQ_ROW_HIPAA_CD_LEN);
  }

  /**
   * Update BhiReqRowHipaaCd with another Field from an offset and length
   *
   * @param value
   */
  public void setBhiReqRowHipaaCd(Field source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginBhiReqRowHipaaCd, BHI_REQ_ROW_HIPAA_CD_LEN);
  }

  /**
   * Update BhiReqRowHipaaCd with another Field from an offset and length to an offset and length
   *
   * @param value
   */
  public void setBhiReqRowHipaaCd(
      Field source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginBhiReqRowHipaaCd + targetIndex, targetLen);
  }
  /**
   * Returns the value of bhiReqRowNetId
   *
   * @return bhiReqRowNetId
   */
  public char[] getBhiReqRowNetId() throws CFException {
    if (isBhiReqRowNetIdModified()) {
      bhiReqRowNetId = refreshBhiReqRowNetId();
    }
    return bhiReqRowNetId;
  }

  /**
   * set variable bhiReqRowNetId Corresponding COBOL Variable is BHI-REQ-ROW-NET-ID
   *
   * @param value
   */
  public void setBhiReqRowNetId(char[] value) {
    bhiReqRowNetId = checkBhiReqRowNetIdConstraints(value);
    serializeBhiReqRowNetId(bhiReqRowNetId);
  }

  /**
   * Update BhiReqRowNetId with a char[] from an offset and length
   *
   * @param value
   */
  public void setBhiReqRowNetId(char[] source, int sourceIndex) {
    replace(source, sourceIndex, source.length, beginBhiReqRowNetId, bhiReqRowNetId.length);
  }

  public void setBhiReqRowNetId(char[] source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginBhiReqRowNetId, bhiReqRowNetId.length);
  }

  /**
   * Update BhiReqRowNetId with a char[] from an offset and length to an offset and length
   *
   * @param value
   */
  public void setBhiReqRowNetId(
      char[] source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginBhiReqRowNetId + targetIndex, targetLen);
  }

  /**
   * Update BhiReqRowNetId with another Field
   *
   * @param value
   */
  public void setBhiReqRowNetId(Field source) {
    replace(source, 0, source.length(), beginBhiReqRowNetId, BHI_REQ_ROW_NET_ID_LEN);
  }

  /**
   * Update BhiReqRowNetId with another Field from an offset and length
   *
   * @param value
   */
  public void setBhiReqRowNetId(Field source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginBhiReqRowNetId, BHI_REQ_ROW_NET_ID_LEN);
  }

  /**
   * Update BhiReqRowNetId with another Field from an offset and length to an offset and length
   *
   * @param value
   */
  public void setBhiReqRowNetId(
      Field source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginBhiReqRowNetId + targetIndex, targetLen);
  }
  /**
   * Returns the value of bhiReqRowEffDate
   *
   * @return bhiReqRowEffDate
   */
  public char[] getBhiReqRowEffDate() throws CFException {
    if (isBhiReqRowEffDateModified()) {
      bhiReqRowEffDate = refreshBhiReqRowEffDate();
    }
    return bhiReqRowEffDate;
  }

  /**
   * set variable bhiReqRowEffDate Corresponding COBOL Variable is BHI-REQ-ROW-EFF-DATE
   *
   * @param value
   */
  public void setBhiReqRowEffDate(char[] value) {
    bhiReqRowEffDate = checkBhiReqRowEffDateConstraints(value);
    serializeBhiReqRowEffDate(bhiReqRowEffDate);
  }

  /**
   * Update BhiReqRowEffDate with a char[] from an offset and length
   *
   * @param value
   */
  public void setBhiReqRowEffDate(char[] source, int sourceIndex) {
    replace(source, sourceIndex, source.length, beginBhiReqRowEffDate, bhiReqRowEffDate.length);
  }

  public void setBhiReqRowEffDate(char[] source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginBhiReqRowEffDate, bhiReqRowEffDate.length);
  }

  /**
   * Update BhiReqRowEffDate with a char[] from an offset and length to an offset and length
   *
   * @param value
   */
  public void setBhiReqRowEffDate(
      char[] source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginBhiReqRowEffDate + targetIndex, targetLen);
  }

  /**
   * Update BhiReqRowEffDate with another Field
   *
   * @param value
   */
  public void setBhiReqRowEffDate(Field source) {
    replace(source, 0, source.length(), beginBhiReqRowEffDate, BHI_REQ_ROW_EFF_DATE_LEN);
  }

  /**
   * Update BhiReqRowEffDate with another Field from an offset and length
   *
   * @param value
   */
  public void setBhiReqRowEffDate(Field source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginBhiReqRowEffDate, BHI_REQ_ROW_EFF_DATE_LEN);
  }

  /**
   * Update BhiReqRowEffDate with another Field from an offset and length to an offset and length
   *
   * @param value
   */
  public void setBhiReqRowEffDate(
      Field source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginBhiReqRowEffDate + targetIndex, targetLen);
  }
  /**
   * Returns the value of bhiReqRowCancDt
   *
   * @return bhiReqRowCancDt
   */
  public char[] getBhiReqRowCancDt() throws CFException {
    if (isBhiReqRowCancDtModified()) {
      bhiReqRowCancDt = refreshBhiReqRowCancDt();
    }
    return bhiReqRowCancDt;
  }

  /**
   * set variable bhiReqRowCancDt Corresponding COBOL Variable is BHI-REQ-ROW-CANC-DT
   *
   * @param value
   */
  public void setBhiReqRowCancDt(char[] value) {
    bhiReqRowCancDt = checkBhiReqRowCancDtConstraints(value);
    serializeBhiReqRowCancDt(bhiReqRowCancDt);
  }

  /**
   * Update BhiReqRowCancDt with a char[] from an offset and length
   *
   * @param value
   */
  public void setBhiReqRowCancDt(char[] source, int sourceIndex) {
    replace(source, sourceIndex, source.length, beginBhiReqRowCancDt, bhiReqRowCancDt.length);
  }

  public void setBhiReqRowCancDt(char[] source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginBhiReqRowCancDt, bhiReqRowCancDt.length);
  }

  /**
   * Update BhiReqRowCancDt with a char[] from an offset and length to an offset and length
   *
   * @param value
   */
  public void setBhiReqRowCancDt(
      char[] source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginBhiReqRowCancDt + targetIndex, targetLen);
  }

  /**
   * Update BhiReqRowCancDt with another Field
   *
   * @param value
   */
  public void setBhiReqRowCancDt(Field source) {
    replace(source, 0, source.length(), beginBhiReqRowCancDt, BHI_REQ_ROW_CANC_DT_LEN);
  }

  /**
   * Update BhiReqRowCancDt with another Field from an offset and length
   *
   * @param value
   */
  public void setBhiReqRowCancDt(Field source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginBhiReqRowCancDt, BHI_REQ_ROW_CANC_DT_LEN);
  }

  /**
   * Update BhiReqRowCancDt with another Field from an offset and length to an offset and length
   *
   * @param value
   */
  public void setBhiReqRowCancDt(
      Field source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginBhiReqRowCancDt + targetIndex, targetLen);
  }

  public static int getBhiReqRowKeyFieldLength() {
    return BHI_REQ_ROW_KEY_LENGTH;
  }
}
