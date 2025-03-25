package com.cloudframe.app.dto.d5427bhi;

/**
 * The class BhiKey is used to handle fields declared in it
 *
 * @author CloudFrame Inc. created on 2025-03-25 at 08:32. using version 5.0.0.231
 */
import com.cloudframe.app.data.Field;
import com.cloudframe.app.dto.serialize.d5427bhi.*;
import com.cloudframe.app.exception.CFException;

public class BhiKey extends BhiKeySerialized {

  private char[] bhiSlotTblId = Field.fillLowValue(6);

  private char[] bhiHipaaVerNbr = Field.fillLowValue(1);

  private char[] bhiHipaaCd = Field.fillLowValue(2);

  private char[] bhiNetId = Field.fillLowValue(1);

  private char[] bhiEffDate = Field.fillLowValue(10);

  private char[] bhiCancDate = Field.fillLowValue(10);

  private char[] bhiLstupdDttm = Field.fillLowValue(26);

  /** Constructor for BhiKey */
  public BhiKey() {
    // TO-DO auto generated code
  }

  /**
   * Constructor for BhiKey. sets the parent value to the parent
   *
   * @param parent
   * @param begin
   */
  public BhiKey(Field parent, int begin) {
    setParent(parent, begin);
  }

  /**
   * Returns the value of bhiSlotTblId
   *
   * @return bhiSlotTblId
   */
  public char[] getBhiSlotTblId() throws CFException {
    if (isBhiSlotTblIdModified()) {
      bhiSlotTblId = refreshBhiSlotTblId();
    }
    return bhiSlotTblId;
  }

  /**
   * set variable bhiSlotTblId Corresponding COBOL Variable is WS-BHI-SLOT-TBL-ID
   *
   * @param value
   */
  public void setBhiSlotTblId(char[] value) {
    bhiSlotTblId = checkBhiSlotTblIdConstraints(value);
    serializeBhiSlotTblId(bhiSlotTblId);
  }

  /**
   * Update BhiSlotTblId with a char[] from an offset and length
   *
   * @param value
   */
  public void setBhiSlotTblId(char[] source, int sourceIndex) {
    replace(source, sourceIndex, source.length, beginBhiSlotTblId, bhiSlotTblId.length);
  }

  public void setBhiSlotTblId(char[] source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginBhiSlotTblId, bhiSlotTblId.length);
  }

  /**
   * Update BhiSlotTblId with a char[] from an offset and length to an offset and length
   *
   * @param value
   */
  public void setBhiSlotTblId(
      char[] source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginBhiSlotTblId + targetIndex, targetLen);
  }

  /**
   * Update BhiSlotTblId with another Field
   *
   * @param value
   */
  public void setBhiSlotTblId(Field source) {
    replace(source, 0, source.length(), beginBhiSlotTblId, BHI_SLOT_TBL_ID_LEN);
  }

  /**
   * Update BhiSlotTblId with another Field from an offset and length
   *
   * @param value
   */
  public void setBhiSlotTblId(Field source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginBhiSlotTblId, BHI_SLOT_TBL_ID_LEN);
  }

  /**
   * Update BhiSlotTblId with another Field from an offset and length to an offset and length
   *
   * @param value
   */
  public void setBhiSlotTblId(
      Field source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginBhiSlotTblId + targetIndex, targetLen);
  }
  /**
   * Returns the value of bhiHipaaVerNbr
   *
   * @return bhiHipaaVerNbr
   */
  public char[] getBhiHipaaVerNbr() throws CFException {
    if (isBhiHipaaVerNbrModified()) {
      bhiHipaaVerNbr = refreshBhiHipaaVerNbr();
    }
    return bhiHipaaVerNbr;
  }

  /**
   * set variable bhiHipaaVerNbr Corresponding COBOL Variable is WS-BHI-HIPAA-VER-NBR
   *
   * @param value
   */
  public void setBhiHipaaVerNbr(char[] value) {
    bhiHipaaVerNbr = checkBhiHipaaVerNbrConstraints(value);
    serializeBhiHipaaVerNbr(bhiHipaaVerNbr);
  }

  /**
   * Update BhiHipaaVerNbr with a char[] from an offset and length
   *
   * @param value
   */
  public void setBhiHipaaVerNbr(char[] source, int sourceIndex) {
    replace(source, sourceIndex, source.length, beginBhiHipaaVerNbr, bhiHipaaVerNbr.length);
  }

  public void setBhiHipaaVerNbr(char[] source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginBhiHipaaVerNbr, bhiHipaaVerNbr.length);
  }

  /**
   * Update BhiHipaaVerNbr with a char[] from an offset and length to an offset and length
   *
   * @param value
   */
  public void setBhiHipaaVerNbr(
      char[] source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginBhiHipaaVerNbr + targetIndex, targetLen);
  }

  /**
   * Update BhiHipaaVerNbr with another Field
   *
   * @param value
   */
  public void setBhiHipaaVerNbr(Field source) {
    replace(source, 0, source.length(), beginBhiHipaaVerNbr, BHI_HIPAA_VER_NBR_LEN);
  }

  /**
   * Update BhiHipaaVerNbr with another Field from an offset and length
   *
   * @param value
   */
  public void setBhiHipaaVerNbr(Field source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginBhiHipaaVerNbr, BHI_HIPAA_VER_NBR_LEN);
  }

  /**
   * Update BhiHipaaVerNbr with another Field from an offset and length to an offset and length
   *
   * @param value
   */
  public void setBhiHipaaVerNbr(
      Field source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginBhiHipaaVerNbr + targetIndex, targetLen);
  }
  /**
   * Returns the value of bhiHipaaCd
   *
   * @return bhiHipaaCd
   */
  public char[] getBhiHipaaCd() throws CFException {
    if (isBhiHipaaCdModified()) {
      bhiHipaaCd = refreshBhiHipaaCd();
    }
    return bhiHipaaCd;
  }

  /**
   * set variable bhiHipaaCd Corresponding COBOL Variable is WS-BHI-HIPAA-CD
   *
   * @param value
   */
  public void setBhiHipaaCd(char[] value) {
    bhiHipaaCd = checkBhiHipaaCdConstraints(value);
    serializeBhiHipaaCd(bhiHipaaCd);
  }

  /**
   * Update BhiHipaaCd with a char[] from an offset and length
   *
   * @param value
   */
  public void setBhiHipaaCd(char[] source, int sourceIndex) {
    replace(source, sourceIndex, source.length, beginBhiHipaaCd, bhiHipaaCd.length);
  }

  public void setBhiHipaaCd(char[] source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginBhiHipaaCd, bhiHipaaCd.length);
  }

  /**
   * Update BhiHipaaCd with a char[] from an offset and length to an offset and length
   *
   * @param value
   */
  public void setBhiHipaaCd(
      char[] source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginBhiHipaaCd + targetIndex, targetLen);
  }

  /**
   * Update BhiHipaaCd with another Field
   *
   * @param value
   */
  public void setBhiHipaaCd(Field source) {
    replace(source, 0, source.length(), beginBhiHipaaCd, BHI_HIPAA_CD_LEN);
  }

  /**
   * Update BhiHipaaCd with another Field from an offset and length
   *
   * @param value
   */
  public void setBhiHipaaCd(Field source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginBhiHipaaCd, BHI_HIPAA_CD_LEN);
  }

  /**
   * Update BhiHipaaCd with another Field from an offset and length to an offset and length
   *
   * @param value
   */
  public void setBhiHipaaCd(
      Field source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginBhiHipaaCd + targetIndex, targetLen);
  }
  /**
   * Returns the value of bhiNetId
   *
   * @return bhiNetId
   */
  public char[] getBhiNetId() throws CFException {
    if (isBhiNetIdModified()) {
      bhiNetId = refreshBhiNetId();
    }
    return bhiNetId;
  }

  /**
   * set variable bhiNetId Corresponding COBOL Variable is WS-BHI-NET-ID
   *
   * @param value
   */
  public void setBhiNetId(char[] value) {
    bhiNetId = checkBhiNetIdConstraints(value);
    serializeBhiNetId(bhiNetId);
  }

  /**
   * Update BhiNetId with a char[] from an offset and length
   *
   * @param value
   */
  public void setBhiNetId(char[] source, int sourceIndex) {
    replace(source, sourceIndex, source.length, beginBhiNetId, bhiNetId.length);
  }

  public void setBhiNetId(char[] source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginBhiNetId, bhiNetId.length);
  }

  /**
   * Update BhiNetId with a char[] from an offset and length to an offset and length
   *
   * @param value
   */
  public void setBhiNetId(
      char[] source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginBhiNetId + targetIndex, targetLen);
  }

  /**
   * Update BhiNetId with another Field
   *
   * @param value
   */
  public void setBhiNetId(Field source) {
    replace(source, 0, source.length(), beginBhiNetId, BHI_NET_ID_LEN);
  }

  /**
   * Update BhiNetId with another Field from an offset and length
   *
   * @param value
   */
  public void setBhiNetId(Field source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginBhiNetId, BHI_NET_ID_LEN);
  }

  /**
   * Update BhiNetId with another Field from an offset and length to an offset and length
   *
   * @param value
   */
  public void setBhiNetId(
      Field source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginBhiNetId + targetIndex, targetLen);
  }
  /**
   * Returns the value of bhiEffDate
   *
   * @return bhiEffDate
   */
  public char[] getBhiEffDate() throws CFException {
    if (isBhiEffDateModified()) {
      bhiEffDate = refreshBhiEffDate();
    }
    return bhiEffDate;
  }

  /**
   * set variable bhiEffDate Corresponding COBOL Variable is WS-BHI-EFF-DATE
   *
   * @param value
   */
  public void setBhiEffDate(char[] value) {
    bhiEffDate = checkBhiEffDateConstraints(value);
    serializeBhiEffDate(bhiEffDate);
  }

  /**
   * Update BhiEffDate with a char[] from an offset and length
   *
   * @param value
   */
  public void setBhiEffDate(char[] source, int sourceIndex) {
    replace(source, sourceIndex, source.length, beginBhiEffDate, bhiEffDate.length);
  }

  public void setBhiEffDate(char[] source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginBhiEffDate, bhiEffDate.length);
  }

  /**
   * Update BhiEffDate with a char[] from an offset and length to an offset and length
   *
   * @param value
   */
  public void setBhiEffDate(
      char[] source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginBhiEffDate + targetIndex, targetLen);
  }

  /**
   * Update BhiEffDate with another Field
   *
   * @param value
   */
  public void setBhiEffDate(Field source) {
    replace(source, 0, source.length(), beginBhiEffDate, BHI_EFF_DATE_LEN);
  }

  /**
   * Update BhiEffDate with another Field from an offset and length
   *
   * @param value
   */
  public void setBhiEffDate(Field source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginBhiEffDate, BHI_EFF_DATE_LEN);
  }

  /**
   * Update BhiEffDate with another Field from an offset and length to an offset and length
   *
   * @param value
   */
  public void setBhiEffDate(
      Field source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginBhiEffDate + targetIndex, targetLen);
  }
  /**
   * Returns the value of bhiCancDate
   *
   * @return bhiCancDate
   */
  public char[] getBhiCancDate() throws CFException {
    if (isBhiCancDateModified()) {
      bhiCancDate = refreshBhiCancDate();
    }
    return bhiCancDate;
  }

  /**
   * set variable bhiCancDate Corresponding COBOL Variable is WS-BHI-CANC-DATE
   *
   * @param value
   */
  public void setBhiCancDate(char[] value) {
    bhiCancDate = checkBhiCancDateConstraints(value);
    serializeBhiCancDate(bhiCancDate);
  }

  /**
   * Update BhiCancDate with a char[] from an offset and length
   *
   * @param value
   */
  public void setBhiCancDate(char[] source, int sourceIndex) {
    replace(source, sourceIndex, source.length, beginBhiCancDate, bhiCancDate.length);
  }

  public void setBhiCancDate(char[] source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginBhiCancDate, bhiCancDate.length);
  }

  /**
   * Update BhiCancDate with a char[] from an offset and length to an offset and length
   *
   * @param value
   */
  public void setBhiCancDate(
      char[] source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginBhiCancDate + targetIndex, targetLen);
  }

  /**
   * Update BhiCancDate with another Field
   *
   * @param value
   */
  public void setBhiCancDate(Field source) {
    replace(source, 0, source.length(), beginBhiCancDate, BHI_CANC_DATE_LEN);
  }

  /**
   * Update BhiCancDate with another Field from an offset and length
   *
   * @param value
   */
  public void setBhiCancDate(Field source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginBhiCancDate, BHI_CANC_DATE_LEN);
  }

  /**
   * Update BhiCancDate with another Field from an offset and length to an offset and length
   *
   * @param value
   */
  public void setBhiCancDate(
      Field source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginBhiCancDate + targetIndex, targetLen);
  }
  /**
   * Returns the value of bhiLstupdDttm
   *
   * @return bhiLstupdDttm
   */
  public char[] getBhiLstupdDttm() throws CFException {
    if (isBhiLstupdDttmModified()) {
      bhiLstupdDttm = refreshBhiLstupdDttm();
    }
    return bhiLstupdDttm;
  }

  /**
   * set variable bhiLstupdDttm Corresponding COBOL Variable is WS-BHI-LSTUPD-DTTM
   *
   * @param value
   */
  public void setBhiLstupdDttm(char[] value) {
    bhiLstupdDttm = checkBhiLstupdDttmConstraints(value);
    serializeBhiLstupdDttm(bhiLstupdDttm);
  }

  /**
   * Update BhiLstupdDttm with a char[] from an offset and length
   *
   * @param value
   */
  public void setBhiLstupdDttm(char[] source, int sourceIndex) {
    replace(source, sourceIndex, source.length, beginBhiLstupdDttm, bhiLstupdDttm.length);
  }

  public void setBhiLstupdDttm(char[] source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginBhiLstupdDttm, bhiLstupdDttm.length);
  }

  /**
   * Update BhiLstupdDttm with a char[] from an offset and length to an offset and length
   *
   * @param value
   */
  public void setBhiLstupdDttm(
      char[] source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginBhiLstupdDttm + targetIndex, targetLen);
  }

  /**
   * Update BhiLstupdDttm with another Field
   *
   * @param value
   */
  public void setBhiLstupdDttm(Field source) {
    replace(source, 0, source.length(), beginBhiLstupdDttm, BHI_LSTUPD_DTTM_LEN);
  }

  /**
   * Update BhiLstupdDttm with another Field from an offset and length
   *
   * @param value
   */
  public void setBhiLstupdDttm(Field source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginBhiLstupdDttm, BHI_LSTUPD_DTTM_LEN);
  }

  /**
   * Update BhiLstupdDttm with another Field from an offset and length to an offset and length
   *
   * @param value
   */
  public void setBhiLstupdDttm(
      Field source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginBhiLstupdDttm + targetIndex, targetLen);
  }

  public static int getBhiKeyFieldLength() {
    return BHI_KEY_LENGTH;
  }
}
