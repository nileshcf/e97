package com.cloudframe.app.dto.d5427bhi;

/**
 * The class BhiReqKey is used to handle fields declared in it
 *
 * @author CloudFrame Inc. created on 2025-03-25 at 08:32. using version 5.0.0.231
 */
import com.cloudframe.app.data.Field;
import com.cloudframe.app.dto.serialize.d5427bhi.*;
import com.cloudframe.app.exception.CFException;

public class BhiReqKey extends BhiReqKeySerialized {

  private char[] bhiReqSlotTblId = Field.fillLowValue(6);

  private char[] bhiReqHipaaVerNbr = Field.fillLowValue(1);

  private char[] bhiReqHipaaCd = Field.fillLowValue(2);

  private char[] bhiReqNetId = Field.fillLowValue(1);

  private char[] bhiReqEffDate = Field.fillLowValue(10);

  private char[] bhiReqCancDate = Field.fillLowValue(10);

  private char[] bhiReqLstupdDttm = Field.fillLowValue(26);

  /** Constructor for BhiReqKey */
  public BhiReqKey() {
    // TO-DO auto generated code
  }

  /**
   * Constructor for BhiReqKey. sets the parent value to the parent
   *
   * @param parent
   * @param begin
   */
  public BhiReqKey(Field parent, int begin) {
    setParent(parent, begin);
  }

  /**
   * Returns the value of bhiReqSlotTblId
   *
   * @return bhiReqSlotTblId
   */
  public char[] getBhiReqSlotTblId() throws CFException {
    if (isBhiReqSlotTblIdModified()) {
      bhiReqSlotTblId = refreshBhiReqSlotTblId();
    }
    return bhiReqSlotTblId;
  }

  /**
   * set variable bhiReqSlotTblId Corresponding COBOL Variable is BHI-REQ-SLOT-TBL-ID
   *
   * @param value
   */
  public void setBhiReqSlotTblId(char[] value) {
    bhiReqSlotTblId = checkBhiReqSlotTblIdConstraints(value);
    serializeBhiReqSlotTblId(bhiReqSlotTblId);
  }

  /**
   * Update BhiReqSlotTblId with a char[] from an offset and length
   *
   * @param value
   */
  public void setBhiReqSlotTblId(char[] source, int sourceIndex) {
    replace(source, sourceIndex, source.length, beginBhiReqSlotTblId, bhiReqSlotTblId.length);
  }

  public void setBhiReqSlotTblId(char[] source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginBhiReqSlotTblId, bhiReqSlotTblId.length);
  }

  /**
   * Update BhiReqSlotTblId with a char[] from an offset and length to an offset and length
   *
   * @param value
   */
  public void setBhiReqSlotTblId(
      char[] source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginBhiReqSlotTblId + targetIndex, targetLen);
  }

  /**
   * Update BhiReqSlotTblId with another Field
   *
   * @param value
   */
  public void setBhiReqSlotTblId(Field source) {
    replace(source, 0, source.length(), beginBhiReqSlotTblId, BHI_REQ_SLOT_TBL_ID_LEN);
  }

  /**
   * Update BhiReqSlotTblId with another Field from an offset and length
   *
   * @param value
   */
  public void setBhiReqSlotTblId(Field source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginBhiReqSlotTblId, BHI_REQ_SLOT_TBL_ID_LEN);
  }

  /**
   * Update BhiReqSlotTblId with another Field from an offset and length to an offset and length
   *
   * @param value
   */
  public void setBhiReqSlotTblId(
      Field source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginBhiReqSlotTblId + targetIndex, targetLen);
  }
  /**
   * Returns the value of bhiReqHipaaVerNbr
   *
   * @return bhiReqHipaaVerNbr
   */
  public char[] getBhiReqHipaaVerNbr() throws CFException {
    if (isBhiReqHipaaVerNbrModified()) {
      bhiReqHipaaVerNbr = refreshBhiReqHipaaVerNbr();
    }
    return bhiReqHipaaVerNbr;
  }

  /**
   * set variable bhiReqHipaaVerNbr Corresponding COBOL Variable is BHI-REQ-HIPAA-VER-NBR
   *
   * @param value
   */
  public void setBhiReqHipaaVerNbr(char[] value) {
    bhiReqHipaaVerNbr = checkBhiReqHipaaVerNbrConstraints(value);
    serializeBhiReqHipaaVerNbr(bhiReqHipaaVerNbr);
  }

  /**
   * Update BhiReqHipaaVerNbr with a char[] from an offset and length
   *
   * @param value
   */
  public void setBhiReqHipaaVerNbr(char[] source, int sourceIndex) {
    replace(source, sourceIndex, source.length, beginBhiReqHipaaVerNbr, bhiReqHipaaVerNbr.length);
  }

  public void setBhiReqHipaaVerNbr(char[] source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginBhiReqHipaaVerNbr, bhiReqHipaaVerNbr.length);
  }

  /**
   * Update BhiReqHipaaVerNbr with a char[] from an offset and length to an offset and length
   *
   * @param value
   */
  public void setBhiReqHipaaVerNbr(
      char[] source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginBhiReqHipaaVerNbr + targetIndex, targetLen);
  }

  /**
   * Update BhiReqHipaaVerNbr with another Field
   *
   * @param value
   */
  public void setBhiReqHipaaVerNbr(Field source) {
    replace(source, 0, source.length(), beginBhiReqHipaaVerNbr, BHI_REQ_HIPAA_VER_NBR_LEN);
  }

  /**
   * Update BhiReqHipaaVerNbr with another Field from an offset and length
   *
   * @param value
   */
  public void setBhiReqHipaaVerNbr(Field source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginBhiReqHipaaVerNbr, BHI_REQ_HIPAA_VER_NBR_LEN);
  }

  /**
   * Update BhiReqHipaaVerNbr with another Field from an offset and length to an offset and length
   *
   * @param value
   */
  public void setBhiReqHipaaVerNbr(
      Field source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginBhiReqHipaaVerNbr + targetIndex, targetLen);
  }
  /**
   * Returns the value of bhiReqHipaaCd
   *
   * @return bhiReqHipaaCd
   */
  public char[] getBhiReqHipaaCd() throws CFException {
    if (isBhiReqHipaaCdModified()) {
      bhiReqHipaaCd = refreshBhiReqHipaaCd();
    }
    return bhiReqHipaaCd;
  }

  /**
   * set variable bhiReqHipaaCd Corresponding COBOL Variable is BHI-REQ-HIPAA-CD
   *
   * @param value
   */
  public void setBhiReqHipaaCd(char[] value) {
    bhiReqHipaaCd = checkBhiReqHipaaCdConstraints(value);
    serializeBhiReqHipaaCd(bhiReqHipaaCd);
  }

  /**
   * Update BhiReqHipaaCd with a char[] from an offset and length
   *
   * @param value
   */
  public void setBhiReqHipaaCd(char[] source, int sourceIndex) {
    replace(source, sourceIndex, source.length, beginBhiReqHipaaCd, bhiReqHipaaCd.length);
  }

  public void setBhiReqHipaaCd(char[] source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginBhiReqHipaaCd, bhiReqHipaaCd.length);
  }

  /**
   * Update BhiReqHipaaCd with a char[] from an offset and length to an offset and length
   *
   * @param value
   */
  public void setBhiReqHipaaCd(
      char[] source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginBhiReqHipaaCd + targetIndex, targetLen);
  }

  /**
   * Update BhiReqHipaaCd with another Field
   *
   * @param value
   */
  public void setBhiReqHipaaCd(Field source) {
    replace(source, 0, source.length(), beginBhiReqHipaaCd, BHI_REQ_HIPAA_CD_LEN);
  }

  /**
   * Update BhiReqHipaaCd with another Field from an offset and length
   *
   * @param value
   */
  public void setBhiReqHipaaCd(Field source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginBhiReqHipaaCd, BHI_REQ_HIPAA_CD_LEN);
  }

  /**
   * Update BhiReqHipaaCd with another Field from an offset and length to an offset and length
   *
   * @param value
   */
  public void setBhiReqHipaaCd(
      Field source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginBhiReqHipaaCd + targetIndex, targetLen);
  }
  /**
   * Returns the value of bhiReqNetId
   *
   * @return bhiReqNetId
   */
  public char[] getBhiReqNetId() throws CFException {
    if (isBhiReqNetIdModified()) {
      bhiReqNetId = refreshBhiReqNetId();
    }
    return bhiReqNetId;
  }

  /**
   * set variable bhiReqNetId Corresponding COBOL Variable is BHI-REQ-NET-ID
   *
   * @param value
   */
  public void setBhiReqNetId(char[] value) {
    bhiReqNetId = checkBhiReqNetIdConstraints(value);
    serializeBhiReqNetId(bhiReqNetId);
  }

  /**
   * Update BhiReqNetId with a char[] from an offset and length
   *
   * @param value
   */
  public void setBhiReqNetId(char[] source, int sourceIndex) {
    replace(source, sourceIndex, source.length, beginBhiReqNetId, bhiReqNetId.length);
  }

  public void setBhiReqNetId(char[] source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginBhiReqNetId, bhiReqNetId.length);
  }

  /**
   * Update BhiReqNetId with a char[] from an offset and length to an offset and length
   *
   * @param value
   */
  public void setBhiReqNetId(
      char[] source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginBhiReqNetId + targetIndex, targetLen);
  }

  /**
   * Update BhiReqNetId with another Field
   *
   * @param value
   */
  public void setBhiReqNetId(Field source) {
    replace(source, 0, source.length(), beginBhiReqNetId, BHI_REQ_NET_ID_LEN);
  }

  /**
   * Update BhiReqNetId with another Field from an offset and length
   *
   * @param value
   */
  public void setBhiReqNetId(Field source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginBhiReqNetId, BHI_REQ_NET_ID_LEN);
  }

  /**
   * Update BhiReqNetId with another Field from an offset and length to an offset and length
   *
   * @param value
   */
  public void setBhiReqNetId(
      Field source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginBhiReqNetId + targetIndex, targetLen);
  }
  /**
   * Returns the value of bhiReqEffDate
   *
   * @return bhiReqEffDate
   */
  public char[] getBhiReqEffDate() throws CFException {
    if (isBhiReqEffDateModified()) {
      bhiReqEffDate = refreshBhiReqEffDate();
    }
    return bhiReqEffDate;
  }

  /**
   * set variable bhiReqEffDate Corresponding COBOL Variable is BHI-REQ-EFF-DATE
   *
   * @param value
   */
  public void setBhiReqEffDate(char[] value) {
    bhiReqEffDate = checkBhiReqEffDateConstraints(value);
    serializeBhiReqEffDate(bhiReqEffDate);
  }

  /**
   * Update BhiReqEffDate with a char[] from an offset and length
   *
   * @param value
   */
  public void setBhiReqEffDate(char[] source, int sourceIndex) {
    replace(source, sourceIndex, source.length, beginBhiReqEffDate, bhiReqEffDate.length);
  }

  public void setBhiReqEffDate(char[] source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginBhiReqEffDate, bhiReqEffDate.length);
  }

  /**
   * Update BhiReqEffDate with a char[] from an offset and length to an offset and length
   *
   * @param value
   */
  public void setBhiReqEffDate(
      char[] source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginBhiReqEffDate + targetIndex, targetLen);
  }

  /**
   * Update BhiReqEffDate with another Field
   *
   * @param value
   */
  public void setBhiReqEffDate(Field source) {
    replace(source, 0, source.length(), beginBhiReqEffDate, BHI_REQ_EFF_DATE_LEN);
  }

  /**
   * Update BhiReqEffDate with another Field from an offset and length
   *
   * @param value
   */
  public void setBhiReqEffDate(Field source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginBhiReqEffDate, BHI_REQ_EFF_DATE_LEN);
  }

  /**
   * Update BhiReqEffDate with another Field from an offset and length to an offset and length
   *
   * @param value
   */
  public void setBhiReqEffDate(
      Field source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginBhiReqEffDate + targetIndex, targetLen);
  }
  /**
   * Returns the value of bhiReqCancDate
   *
   * @return bhiReqCancDate
   */
  public char[] getBhiReqCancDate() throws CFException {
    if (isBhiReqCancDateModified()) {
      bhiReqCancDate = refreshBhiReqCancDate();
    }
    return bhiReqCancDate;
  }

  /**
   * set variable bhiReqCancDate Corresponding COBOL Variable is BHI-REQ-CANC-DATE
   *
   * @param value
   */
  public void setBhiReqCancDate(char[] value) {
    bhiReqCancDate = checkBhiReqCancDateConstraints(value);
    serializeBhiReqCancDate(bhiReqCancDate);
  }

  /**
   * Update BhiReqCancDate with a char[] from an offset and length
   *
   * @param value
   */
  public void setBhiReqCancDate(char[] source, int sourceIndex) {
    replace(source, sourceIndex, source.length, beginBhiReqCancDate, bhiReqCancDate.length);
  }

  public void setBhiReqCancDate(char[] source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginBhiReqCancDate, bhiReqCancDate.length);
  }

  /**
   * Update BhiReqCancDate with a char[] from an offset and length to an offset and length
   *
   * @param value
   */
  public void setBhiReqCancDate(
      char[] source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginBhiReqCancDate + targetIndex, targetLen);
  }

  /**
   * Update BhiReqCancDate with another Field
   *
   * @param value
   */
  public void setBhiReqCancDate(Field source) {
    replace(source, 0, source.length(), beginBhiReqCancDate, BHI_REQ_CANC_DATE_LEN);
  }

  /**
   * Update BhiReqCancDate with another Field from an offset and length
   *
   * @param value
   */
  public void setBhiReqCancDate(Field source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginBhiReqCancDate, BHI_REQ_CANC_DATE_LEN);
  }

  /**
   * Update BhiReqCancDate with another Field from an offset and length to an offset and length
   *
   * @param value
   */
  public void setBhiReqCancDate(
      Field source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginBhiReqCancDate + targetIndex, targetLen);
  }
  /**
   * Returns the value of bhiReqLstupdDttm
   *
   * @return bhiReqLstupdDttm
   */
  public char[] getBhiReqLstupdDttm() throws CFException {
    if (isBhiReqLstupdDttmModified()) {
      bhiReqLstupdDttm = refreshBhiReqLstupdDttm();
    }
    return bhiReqLstupdDttm;
  }

  /**
   * set variable bhiReqLstupdDttm Corresponding COBOL Variable is BHI-REQ-LSTUPD-DTTM
   *
   * @param value
   */
  public void setBhiReqLstupdDttm(char[] value) {
    bhiReqLstupdDttm = checkBhiReqLstupdDttmConstraints(value);
    serializeBhiReqLstupdDttm(bhiReqLstupdDttm);
  }

  /**
   * Update BhiReqLstupdDttm with a char[] from an offset and length
   *
   * @param value
   */
  public void setBhiReqLstupdDttm(char[] source, int sourceIndex) {
    replace(source, sourceIndex, source.length, beginBhiReqLstupdDttm, bhiReqLstupdDttm.length);
  }

  public void setBhiReqLstupdDttm(char[] source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginBhiReqLstupdDttm, bhiReqLstupdDttm.length);
  }

  /**
   * Update BhiReqLstupdDttm with a char[] from an offset and length to an offset and length
   *
   * @param value
   */
  public void setBhiReqLstupdDttm(
      char[] source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginBhiReqLstupdDttm + targetIndex, targetLen);
  }

  /**
   * Update BhiReqLstupdDttm with another Field
   *
   * @param value
   */
  public void setBhiReqLstupdDttm(Field source) {
    replace(source, 0, source.length(), beginBhiReqLstupdDttm, BHI_REQ_LSTUPD_DTTM_LEN);
  }

  /**
   * Update BhiReqLstupdDttm with another Field from an offset and length
   *
   * @param value
   */
  public void setBhiReqLstupdDttm(Field source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginBhiReqLstupdDttm, BHI_REQ_LSTUPD_DTTM_LEN);
  }

  /**
   * Update BhiReqLstupdDttm with another Field from an offset and length to an offset and length
   *
   * @param value
   */
  public void setBhiReqLstupdDttm(
      Field source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginBhiReqLstupdDttm + targetIndex, targetLen);
  }

  public static int getBhiReqKeyFieldLength() {
    return BHI_REQ_KEY_LENGTH;
  }
}
