package com.cloudframe.app.dto.bbhsr002;

/**
 * The class BhiRowKey is used to handle fields declared in it
 *
 * @author CloudFrame Inc. created on 2025-03-25 at 08:29. using version 5.0.0.231
 */
import com.cloudframe.app.data.Field;
import com.cloudframe.app.dto.serialize.bbhsr002.*;
import com.cloudframe.app.exception.CFException;

public class BhiRowKey extends BhiRowKeySerialized {

  private char[] bhiRowSlotTblId = Field.fillLowValue(6);

  private char[] bhiRowHipaaVerNbr = Field.fillLowValue(1);

  private char[] bhiRowHipaaCd = Field.fillLowValue(2);

  private char[] bhiRowNetId = Field.fillLowValue(1);

  private char[] bhiRowEffDate = Field.fillLowValue(10);

  private char[] bhiRowCancDt = Field.fillLowValue(10);

  private char[] bhiRowCreateDttm = Field.fillLowValue(26);

  /** Constructor for BhiRowKey */
  public BhiRowKey() {
    // TO-DO auto generated code
  }

  /**
   * Constructor for BhiRowKey. sets the parent value to the parent
   *
   * @param parent
   * @param begin
   */
  public BhiRowKey(Field parent, int begin) {
    setParent(parent, begin);
  }

  /**
   * Returns the value of bhiRowSlotTblId
   *
   * @return bhiRowSlotTblId
   */
  public char[] getBhiRowSlotTblId() throws CFException {
    if (isBhiRowSlotTblIdModified()) {
      bhiRowSlotTblId = refreshBhiRowSlotTblId();
    }
    return bhiRowSlotTblId;
  }

  /**
   * set variable bhiRowSlotTblId Corresponding COBOL Variable is BHI-ROW-SLOT-TBL-ID
   *
   * @param value
   */
  public void setBhiRowSlotTblId(char[] value) {
    bhiRowSlotTblId = checkBhiRowSlotTblIdConstraints(value);
    serializeBhiRowSlotTblId(bhiRowSlotTblId);
  }

  /**
   * Update BhiRowSlotTblId with a char[] from an offset and length
   *
   * @param value
   */
  public void setBhiRowSlotTblId(char[] source, int sourceIndex) {
    replace(source, sourceIndex, source.length, beginBhiRowSlotTblId, bhiRowSlotTblId.length);
  }

  public void setBhiRowSlotTblId(char[] source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginBhiRowSlotTblId, bhiRowSlotTblId.length);
  }

  /**
   * Update BhiRowSlotTblId with a char[] from an offset and length to an offset and length
   *
   * @param value
   */
  public void setBhiRowSlotTblId(
      char[] source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginBhiRowSlotTblId + targetIndex, targetLen);
  }

  /**
   * Update BhiRowSlotTblId with another Field
   *
   * @param value
   */
  public void setBhiRowSlotTblId(Field source) {
    replace(source, 0, source.length(), beginBhiRowSlotTblId, BHI_ROW_SLOT_TBL_ID_LEN);
  }

  /**
   * Update BhiRowSlotTblId with another Field from an offset and length
   *
   * @param value
   */
  public void setBhiRowSlotTblId(Field source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginBhiRowSlotTblId, BHI_ROW_SLOT_TBL_ID_LEN);
  }

  /**
   * Update BhiRowSlotTblId with another Field from an offset and length to an offset and length
   *
   * @param value
   */
  public void setBhiRowSlotTblId(
      Field source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginBhiRowSlotTblId + targetIndex, targetLen);
  }
  /**
   * Returns the value of bhiRowHipaaVerNbr
   *
   * @return bhiRowHipaaVerNbr
   */
  public char[] getBhiRowHipaaVerNbr() throws CFException {
    if (isBhiRowHipaaVerNbrModified()) {
      bhiRowHipaaVerNbr = refreshBhiRowHipaaVerNbr();
    }
    return bhiRowHipaaVerNbr;
  }

  /**
   * set variable bhiRowHipaaVerNbr Corresponding COBOL Variable is BHI-ROW-HIPAA-VER-NBR
   *
   * @param value
   */
  public void setBhiRowHipaaVerNbr(char[] value) {
    bhiRowHipaaVerNbr = checkBhiRowHipaaVerNbrConstraints(value);
    serializeBhiRowHipaaVerNbr(bhiRowHipaaVerNbr);
  }

  /**
   * Update BhiRowHipaaVerNbr with a char[] from an offset and length
   *
   * @param value
   */
  public void setBhiRowHipaaVerNbr(char[] source, int sourceIndex) {
    replace(source, sourceIndex, source.length, beginBhiRowHipaaVerNbr, bhiRowHipaaVerNbr.length);
  }

  public void setBhiRowHipaaVerNbr(char[] source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginBhiRowHipaaVerNbr, bhiRowHipaaVerNbr.length);
  }

  /**
   * Update BhiRowHipaaVerNbr with a char[] from an offset and length to an offset and length
   *
   * @param value
   */
  public void setBhiRowHipaaVerNbr(
      char[] source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginBhiRowHipaaVerNbr + targetIndex, targetLen);
  }

  /**
   * Update BhiRowHipaaVerNbr with another Field
   *
   * @param value
   */
  public void setBhiRowHipaaVerNbr(Field source) {
    replace(source, 0, source.length(), beginBhiRowHipaaVerNbr, BHI_ROW_HIPAA_VER_NBR_LEN);
  }

  /**
   * Update BhiRowHipaaVerNbr with another Field from an offset and length
   *
   * @param value
   */
  public void setBhiRowHipaaVerNbr(Field source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginBhiRowHipaaVerNbr, BHI_ROW_HIPAA_VER_NBR_LEN);
  }

  /**
   * Update BhiRowHipaaVerNbr with another Field from an offset and length to an offset and length
   *
   * @param value
   */
  public void setBhiRowHipaaVerNbr(
      Field source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginBhiRowHipaaVerNbr + targetIndex, targetLen);
  }
  /**
   * Returns the value of bhiRowHipaaCd
   *
   * @return bhiRowHipaaCd
   */
  public char[] getBhiRowHipaaCd() throws CFException {
    if (isBhiRowHipaaCdModified()) {
      bhiRowHipaaCd = refreshBhiRowHipaaCd();
    }
    return bhiRowHipaaCd;
  }

  /**
   * set variable bhiRowHipaaCd Corresponding COBOL Variable is BHI-ROW-HIPAA-CD
   *
   * @param value
   */
  public void setBhiRowHipaaCd(char[] value) {
    bhiRowHipaaCd = checkBhiRowHipaaCdConstraints(value);
    serializeBhiRowHipaaCd(bhiRowHipaaCd);
  }

  /**
   * Update BhiRowHipaaCd with a char[] from an offset and length
   *
   * @param value
   */
  public void setBhiRowHipaaCd(char[] source, int sourceIndex) {
    replace(source, sourceIndex, source.length, beginBhiRowHipaaCd, bhiRowHipaaCd.length);
  }

  public void setBhiRowHipaaCd(char[] source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginBhiRowHipaaCd, bhiRowHipaaCd.length);
  }

  /**
   * Update BhiRowHipaaCd with a char[] from an offset and length to an offset and length
   *
   * @param value
   */
  public void setBhiRowHipaaCd(
      char[] source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginBhiRowHipaaCd + targetIndex, targetLen);
  }

  /**
   * Update BhiRowHipaaCd with another Field
   *
   * @param value
   */
  public void setBhiRowHipaaCd(Field source) {
    replace(source, 0, source.length(), beginBhiRowHipaaCd, BHI_ROW_HIPAA_CD_LEN);
  }

  /**
   * Update BhiRowHipaaCd with another Field from an offset and length
   *
   * @param value
   */
  public void setBhiRowHipaaCd(Field source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginBhiRowHipaaCd, BHI_ROW_HIPAA_CD_LEN);
  }

  /**
   * Update BhiRowHipaaCd with another Field from an offset and length to an offset and length
   *
   * @param value
   */
  public void setBhiRowHipaaCd(
      Field source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginBhiRowHipaaCd + targetIndex, targetLen);
  }
  /**
   * Returns the value of bhiRowNetId
   *
   * @return bhiRowNetId
   */
  public char[] getBhiRowNetId() throws CFException {
    if (isBhiRowNetIdModified()) {
      bhiRowNetId = refreshBhiRowNetId();
    }
    return bhiRowNetId;
  }

  /**
   * set variable bhiRowNetId Corresponding COBOL Variable is BHI-ROW-NET-ID
   *
   * @param value
   */
  public void setBhiRowNetId(char[] value) {
    bhiRowNetId = checkBhiRowNetIdConstraints(value);
    serializeBhiRowNetId(bhiRowNetId);
  }

  /**
   * Update BhiRowNetId with a char[] from an offset and length
   *
   * @param value
   */
  public void setBhiRowNetId(char[] source, int sourceIndex) {
    replace(source, sourceIndex, source.length, beginBhiRowNetId, bhiRowNetId.length);
  }

  public void setBhiRowNetId(char[] source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginBhiRowNetId, bhiRowNetId.length);
  }

  /**
   * Update BhiRowNetId with a char[] from an offset and length to an offset and length
   *
   * @param value
   */
  public void setBhiRowNetId(
      char[] source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginBhiRowNetId + targetIndex, targetLen);
  }

  /**
   * Update BhiRowNetId with another Field
   *
   * @param value
   */
  public void setBhiRowNetId(Field source) {
    replace(source, 0, source.length(), beginBhiRowNetId, BHI_ROW_NET_ID_LEN);
  }

  /**
   * Update BhiRowNetId with another Field from an offset and length
   *
   * @param value
   */
  public void setBhiRowNetId(Field source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginBhiRowNetId, BHI_ROW_NET_ID_LEN);
  }

  /**
   * Update BhiRowNetId with another Field from an offset and length to an offset and length
   *
   * @param value
   */
  public void setBhiRowNetId(
      Field source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginBhiRowNetId + targetIndex, targetLen);
  }
  /**
   * Returns the value of bhiRowEffDate
   *
   * @return bhiRowEffDate
   */
  public char[] getBhiRowEffDate() throws CFException {
    if (isBhiRowEffDateModified()) {
      bhiRowEffDate = refreshBhiRowEffDate();
    }
    return bhiRowEffDate;
  }

  /**
   * set variable bhiRowEffDate Corresponding COBOL Variable is BHI-ROW-EFF-DATE
   *
   * @param value
   */
  public void setBhiRowEffDate(char[] value) {
    bhiRowEffDate = checkBhiRowEffDateConstraints(value);
    serializeBhiRowEffDate(bhiRowEffDate);
  }

  /**
   * Update BhiRowEffDate with a char[] from an offset and length
   *
   * @param value
   */
  public void setBhiRowEffDate(char[] source, int sourceIndex) {
    replace(source, sourceIndex, source.length, beginBhiRowEffDate, bhiRowEffDate.length);
  }

  public void setBhiRowEffDate(char[] source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginBhiRowEffDate, bhiRowEffDate.length);
  }

  /**
   * Update BhiRowEffDate with a char[] from an offset and length to an offset and length
   *
   * @param value
   */
  public void setBhiRowEffDate(
      char[] source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginBhiRowEffDate + targetIndex, targetLen);
  }

  /**
   * Update BhiRowEffDate with another Field
   *
   * @param value
   */
  public void setBhiRowEffDate(Field source) {
    replace(source, 0, source.length(), beginBhiRowEffDate, BHI_ROW_EFF_DATE_LEN);
  }

  /**
   * Update BhiRowEffDate with another Field from an offset and length
   *
   * @param value
   */
  public void setBhiRowEffDate(Field source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginBhiRowEffDate, BHI_ROW_EFF_DATE_LEN);
  }

  /**
   * Update BhiRowEffDate with another Field from an offset and length to an offset and length
   *
   * @param value
   */
  public void setBhiRowEffDate(
      Field source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginBhiRowEffDate + targetIndex, targetLen);
  }
  /**
   * Returns the value of bhiRowCancDt
   *
   * @return bhiRowCancDt
   */
  public char[] getBhiRowCancDt() throws CFException {
    if (isBhiRowCancDtModified()) {
      bhiRowCancDt = refreshBhiRowCancDt();
    }
    return bhiRowCancDt;
  }

  /**
   * set variable bhiRowCancDt Corresponding COBOL Variable is BHI-ROW-CANC-DT
   *
   * @param value
   */
  public void setBhiRowCancDt(char[] value) {
    bhiRowCancDt = checkBhiRowCancDtConstraints(value);
    serializeBhiRowCancDt(bhiRowCancDt);
  }

  /**
   * Update BhiRowCancDt with a char[] from an offset and length
   *
   * @param value
   */
  public void setBhiRowCancDt(char[] source, int sourceIndex) {
    replace(source, sourceIndex, source.length, beginBhiRowCancDt, bhiRowCancDt.length);
  }

  public void setBhiRowCancDt(char[] source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginBhiRowCancDt, bhiRowCancDt.length);
  }

  /**
   * Update BhiRowCancDt with a char[] from an offset and length to an offset and length
   *
   * @param value
   */
  public void setBhiRowCancDt(
      char[] source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginBhiRowCancDt + targetIndex, targetLen);
  }

  /**
   * Update BhiRowCancDt with another Field
   *
   * @param value
   */
  public void setBhiRowCancDt(Field source) {
    replace(source, 0, source.length(), beginBhiRowCancDt, BHI_ROW_CANC_DT_LEN);
  }

  /**
   * Update BhiRowCancDt with another Field from an offset and length
   *
   * @param value
   */
  public void setBhiRowCancDt(Field source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginBhiRowCancDt, BHI_ROW_CANC_DT_LEN);
  }

  /**
   * Update BhiRowCancDt with another Field from an offset and length to an offset and length
   *
   * @param value
   */
  public void setBhiRowCancDt(
      Field source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginBhiRowCancDt + targetIndex, targetLen);
  }
  /**
   * Returns the value of bhiRowCreateDttm
   *
   * @return bhiRowCreateDttm
   */
  public char[] getBhiRowCreateDttm() throws CFException {
    if (isBhiRowCreateDttmModified()) {
      bhiRowCreateDttm = refreshBhiRowCreateDttm();
    }
    return bhiRowCreateDttm;
  }

  /**
   * set variable bhiRowCreateDttm Corresponding COBOL Variable is BHI-ROW-CREATE-DTTM
   *
   * @param value
   */
  public void setBhiRowCreateDttm(char[] value) {
    bhiRowCreateDttm = checkBhiRowCreateDttmConstraints(value);
    serializeBhiRowCreateDttm(bhiRowCreateDttm);
  }

  /**
   * Update BhiRowCreateDttm with a char[] from an offset and length
   *
   * @param value
   */
  public void setBhiRowCreateDttm(char[] source, int sourceIndex) {
    replace(source, sourceIndex, source.length, beginBhiRowCreateDttm, bhiRowCreateDttm.length);
  }

  public void setBhiRowCreateDttm(char[] source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginBhiRowCreateDttm, bhiRowCreateDttm.length);
  }

  /**
   * Update BhiRowCreateDttm with a char[] from an offset and length to an offset and length
   *
   * @param value
   */
  public void setBhiRowCreateDttm(
      char[] source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginBhiRowCreateDttm + targetIndex, targetLen);
  }

  /**
   * Update BhiRowCreateDttm with another Field
   *
   * @param value
   */
  public void setBhiRowCreateDttm(Field source) {
    replace(source, 0, source.length(), beginBhiRowCreateDttm, BHI_ROW_CREATE_DTTM_LEN);
  }

  /**
   * Update BhiRowCreateDttm with another Field from an offset and length
   *
   * @param value
   */
  public void setBhiRowCreateDttm(Field source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginBhiRowCreateDttm, BHI_ROW_CREATE_DTTM_LEN);
  }

  /**
   * Update BhiRowCreateDttm with another Field from an offset and length to an offset and length
   *
   * @param value
   */
  public void setBhiRowCreateDttm(
      Field source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginBhiRowCreateDttm + targetIndex, targetLen);
  }

  public static int getBhiRowKeyFieldLength() {
    return BHI_ROW_KEY_LENGTH;
  }
}
