package com.cloudframe.app.dto.d5427bhi;

/**
 * The class DclbenHipaaSrvcDtls is used to handle fields declared in it
 *
 * @author CloudFrame Inc. created on 2025-03-25 at 08:32. using version 5.0.0.231
 */
import com.cloudframe.app.common.CONSTANTS;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.dto.serialize.d5427bhi.*;
import com.cloudframe.app.exception.CFException;

public class DclbenHipaaSrvcDtls extends DclbenHipaaSrvcDtlsSerialized {

  private char[] dbhsdSlotTblId = Field.fillLowValue(6);

  private char[] dbhsdHipaaCd = Field.fillLowValue(2);

  private char[] dbhsdHipaaVerNbr = Field.fillLowValue(1);

  private char[] dbhsdNtwkTypCd = Field.fillLowValue(1);

  private char[] dbhsdEffDt = Field.fillLowValue(10);

  private char[] dbhsdCancDt = Field.fillLowValue(10);

  private char[] dbhsdCreatDttm = Field.fillLowValue(26);

  private char[] dbhsdLstUpdtDttm = Field.fillLowValue(26);

  private char[] dbhsdStsCd = Field.fillLowValue(1);

  private char[] dbhsdLstUpdtUserId = Field.fillLowValue(9);
  private DbhsdHipaaCommtTxt dbhsdHipaaCommtTxt = new DbhsdHipaaCommtTxt();

  /** Constructor for DclbenHipaaSrvcDtls */
  public DclbenHipaaSrvcDtls() {
    super();
    /*  set the parent of each child as this which are a group variable */
    dbhsdHipaaCommtTxt.setParent(this, getStartOffset() + 92);
    /*  end of offset */
  }

  /**
   * Returns the value of dbhsdSlotTblId
   *
   * @return dbhsdSlotTblId
   */
  public char[] getDbhsdSlotTblId() throws CFException {
    if (isDbhsdSlotTblIdModified()) {
      dbhsdSlotTblId = refreshDbhsdSlotTblId();
    }
    return dbhsdSlotTblId;
  }

  /**
   * set variable dbhsdSlotTblId Corresponding COBOL Variable is DBHSD-SLOT-TBL-ID
   *
   * @param value
   */
  public void setDbhsdSlotTblId(char[] value) {
    dbhsdSlotTblId = checkDbhsdSlotTblIdConstraints(value);
    serializeDbhsdSlotTblId(dbhsdSlotTblId);
  }

  /**
   * Update DbhsdSlotTblId with a char[] from an offset and length
   *
   * @param value
   */
  public void setDbhsdSlotTblId(char[] source, int sourceIndex) {
    replace(source, sourceIndex, source.length, beginDbhsdSlotTblId, dbhsdSlotTblId.length);
  }

  public void setDbhsdSlotTblId(char[] source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginDbhsdSlotTblId, dbhsdSlotTblId.length);
  }

  /**
   * Update DbhsdSlotTblId with a char[] from an offset and length to an offset and length
   *
   * @param value
   */
  public void setDbhsdSlotTblId(
      char[] source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginDbhsdSlotTblId + targetIndex, targetLen);
  }

  /**
   * Update DbhsdSlotTblId with another Field
   *
   * @param value
   */
  public void setDbhsdSlotTblId(Field source) {
    replace(source, 0, source.length(), beginDbhsdSlotTblId, DBHSD_SLOT_TBL_ID_LEN);
  }

  /**
   * Update DbhsdSlotTblId with another Field from an offset and length
   *
   * @param value
   */
  public void setDbhsdSlotTblId(Field source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginDbhsdSlotTblId, DBHSD_SLOT_TBL_ID_LEN);
  }

  /**
   * Update DbhsdSlotTblId with another Field from an offset and length to an offset and length
   *
   * @param value
   */
  public void setDbhsdSlotTblId(
      Field source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginDbhsdSlotTblId + targetIndex, targetLen);
  }
  /**
   * Returns the value of dbhsdHipaaCd
   *
   * @return dbhsdHipaaCd
   */
  public char[] getDbhsdHipaaCd() throws CFException {
    if (isDbhsdHipaaCdModified()) {
      dbhsdHipaaCd = refreshDbhsdHipaaCd();
    }
    return dbhsdHipaaCd;
  }

  /**
   * set variable dbhsdHipaaCd Corresponding COBOL Variable is DBHSD-HIPAA-CD
   *
   * @param value
   */
  public void setDbhsdHipaaCd(char[] value) {
    dbhsdHipaaCd = checkDbhsdHipaaCdConstraints(value);
    serializeDbhsdHipaaCd(dbhsdHipaaCd);
  }

  /**
   * Update DbhsdHipaaCd with a char[] from an offset and length
   *
   * @param value
   */
  public void setDbhsdHipaaCd(char[] source, int sourceIndex) {
    replace(source, sourceIndex, source.length, beginDbhsdHipaaCd, dbhsdHipaaCd.length);
  }

  public void setDbhsdHipaaCd(char[] source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginDbhsdHipaaCd, dbhsdHipaaCd.length);
  }

  /**
   * Update DbhsdHipaaCd with a char[] from an offset and length to an offset and length
   *
   * @param value
   */
  public void setDbhsdHipaaCd(
      char[] source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginDbhsdHipaaCd + targetIndex, targetLen);
  }

  /**
   * Update DbhsdHipaaCd with another Field
   *
   * @param value
   */
  public void setDbhsdHipaaCd(Field source) {
    replace(source, 0, source.length(), beginDbhsdHipaaCd, DBHSD_HIPAA_CD_LEN);
  }

  /**
   * Update DbhsdHipaaCd with another Field from an offset and length
   *
   * @param value
   */
  public void setDbhsdHipaaCd(Field source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginDbhsdHipaaCd, DBHSD_HIPAA_CD_LEN);
  }

  /**
   * Update DbhsdHipaaCd with another Field from an offset and length to an offset and length
   *
   * @param value
   */
  public void setDbhsdHipaaCd(
      Field source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginDbhsdHipaaCd + targetIndex, targetLen);
  }
  /**
   * Returns the value of dbhsdHipaaVerNbr
   *
   * @return dbhsdHipaaVerNbr
   */
  public char[] getDbhsdHipaaVerNbr() throws CFException {
    if (isDbhsdHipaaVerNbrModified()) {
      dbhsdHipaaVerNbr = refreshDbhsdHipaaVerNbr();
    }
    return dbhsdHipaaVerNbr;
  }

  /**
   * set variable dbhsdHipaaVerNbr Corresponding COBOL Variable is DBHSD-HIPAA-VER-NBR
   *
   * @param value
   */
  public void setDbhsdHipaaVerNbr(char[] value) {
    dbhsdHipaaVerNbr = checkDbhsdHipaaVerNbrConstraints(value);
    serializeDbhsdHipaaVerNbr(dbhsdHipaaVerNbr);
  }

  /**
   * Update DbhsdHipaaVerNbr with a char[] from an offset and length
   *
   * @param value
   */
  public void setDbhsdHipaaVerNbr(char[] source, int sourceIndex) {
    replace(source, sourceIndex, source.length, beginDbhsdHipaaVerNbr, dbhsdHipaaVerNbr.length);
  }

  public void setDbhsdHipaaVerNbr(char[] source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginDbhsdHipaaVerNbr, dbhsdHipaaVerNbr.length);
  }

  /**
   * Update DbhsdHipaaVerNbr with a char[] from an offset and length to an offset and length
   *
   * @param value
   */
  public void setDbhsdHipaaVerNbr(
      char[] source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginDbhsdHipaaVerNbr + targetIndex, targetLen);
  }

  /**
   * Update DbhsdHipaaVerNbr with another Field
   *
   * @param value
   */
  public void setDbhsdHipaaVerNbr(Field source) {
    replace(source, 0, source.length(), beginDbhsdHipaaVerNbr, DBHSD_HIPAA_VER_NBR_LEN);
  }

  /**
   * Update DbhsdHipaaVerNbr with another Field from an offset and length
   *
   * @param value
   */
  public void setDbhsdHipaaVerNbr(Field source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginDbhsdHipaaVerNbr, DBHSD_HIPAA_VER_NBR_LEN);
  }

  /**
   * Update DbhsdHipaaVerNbr with another Field from an offset and length to an offset and length
   *
   * @param value
   */
  public void setDbhsdHipaaVerNbr(
      Field source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginDbhsdHipaaVerNbr + targetIndex, targetLen);
  }
  /**
   * Returns the value of dbhsdNtwkTypCd
   *
   * @return dbhsdNtwkTypCd
   */
  public char[] getDbhsdNtwkTypCd() throws CFException {
    if (isDbhsdNtwkTypCdModified()) {
      dbhsdNtwkTypCd = refreshDbhsdNtwkTypCd();
    }
    return dbhsdNtwkTypCd;
  }

  /**
   * set variable dbhsdNtwkTypCd Corresponding COBOL Variable is DBHSD-NTWK-TYP-CD
   *
   * @param value
   */
  public void setDbhsdNtwkTypCd(char[] value) {
    dbhsdNtwkTypCd = checkDbhsdNtwkTypCdConstraints(value);
    serializeDbhsdNtwkTypCd(dbhsdNtwkTypCd);
  }

  /**
   * Update DbhsdNtwkTypCd with a char[] from an offset and length
   *
   * @param value
   */
  public void setDbhsdNtwkTypCd(char[] source, int sourceIndex) {
    replace(source, sourceIndex, source.length, beginDbhsdNtwkTypCd, dbhsdNtwkTypCd.length);
  }

  public void setDbhsdNtwkTypCd(char[] source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginDbhsdNtwkTypCd, dbhsdNtwkTypCd.length);
  }

  /**
   * Update DbhsdNtwkTypCd with a char[] from an offset and length to an offset and length
   *
   * @param value
   */
  public void setDbhsdNtwkTypCd(
      char[] source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginDbhsdNtwkTypCd + targetIndex, targetLen);
  }

  /**
   * Update DbhsdNtwkTypCd with another Field
   *
   * @param value
   */
  public void setDbhsdNtwkTypCd(Field source) {
    replace(source, 0, source.length(), beginDbhsdNtwkTypCd, DBHSD_NTWK_TYP_CD_LEN);
  }

  /**
   * Update DbhsdNtwkTypCd with another Field from an offset and length
   *
   * @param value
   */
  public void setDbhsdNtwkTypCd(Field source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginDbhsdNtwkTypCd, DBHSD_NTWK_TYP_CD_LEN);
  }

  /**
   * Update DbhsdNtwkTypCd with another Field from an offset and length to an offset and length
   *
   * @param value
   */
  public void setDbhsdNtwkTypCd(
      Field source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginDbhsdNtwkTypCd + targetIndex, targetLen);
  }
  /**
   * Returns the value of dbhsdEffDt
   *
   * @return dbhsdEffDt
   */
  public char[] getDbhsdEffDt() throws CFException {
    if (isDbhsdEffDtModified()) {
      dbhsdEffDt = refreshDbhsdEffDt();
    }
    return dbhsdEffDt;
  }

  /**
   * set variable dbhsdEffDt Corresponding COBOL Variable is DBHSD-EFF-DT
   *
   * @param value
   */
  public void setDbhsdEffDt(char[] value) {
    dbhsdEffDt = checkDbhsdEffDtConstraints(value);
    serializeDbhsdEffDt(dbhsdEffDt);
  }

  /**
   * Update DbhsdEffDt with a char[] from an offset and length
   *
   * @param value
   */
  public void setDbhsdEffDt(char[] source, int sourceIndex) {
    replace(source, sourceIndex, source.length, beginDbhsdEffDt, dbhsdEffDt.length);
  }

  public void setDbhsdEffDt(char[] source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginDbhsdEffDt, dbhsdEffDt.length);
  }

  /**
   * Update DbhsdEffDt with a char[] from an offset and length to an offset and length
   *
   * @param value
   */
  public void setDbhsdEffDt(
      char[] source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginDbhsdEffDt + targetIndex, targetLen);
  }

  /**
   * Update DbhsdEffDt with another Field
   *
   * @param value
   */
  public void setDbhsdEffDt(Field source) {
    replace(source, 0, source.length(), beginDbhsdEffDt, DBHSD_EFF_DT_LEN);
  }

  /**
   * Update DbhsdEffDt with another Field from an offset and length
   *
   * @param value
   */
  public void setDbhsdEffDt(Field source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginDbhsdEffDt, DBHSD_EFF_DT_LEN);
  }

  /**
   * Update DbhsdEffDt with another Field from an offset and length to an offset and length
   *
   * @param value
   */
  public void setDbhsdEffDt(
      Field source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginDbhsdEffDt + targetIndex, targetLen);
  }
  /**
   * Returns the value of dbhsdCancDt
   *
   * @return dbhsdCancDt
   */
  public char[] getDbhsdCancDt() throws CFException {
    if (isDbhsdCancDtModified()) {
      dbhsdCancDt = refreshDbhsdCancDt();
    }
    return dbhsdCancDt;
  }

  /**
   * set variable dbhsdCancDt Corresponding COBOL Variable is DBHSD-CANC-DT
   *
   * @param value
   */
  public void setDbhsdCancDt(char[] value) {
    dbhsdCancDt = checkDbhsdCancDtConstraints(value);
    serializeDbhsdCancDt(dbhsdCancDt);
  }

  /**
   * Update DbhsdCancDt with a char[] from an offset and length
   *
   * @param value
   */
  public void setDbhsdCancDt(char[] source, int sourceIndex) {
    replace(source, sourceIndex, source.length, beginDbhsdCancDt, dbhsdCancDt.length);
  }

  public void setDbhsdCancDt(char[] source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginDbhsdCancDt, dbhsdCancDt.length);
  }

  /**
   * Update DbhsdCancDt with a char[] from an offset and length to an offset and length
   *
   * @param value
   */
  public void setDbhsdCancDt(
      char[] source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginDbhsdCancDt + targetIndex, targetLen);
  }

  /**
   * Update DbhsdCancDt with another Field
   *
   * @param value
   */
  public void setDbhsdCancDt(Field source) {
    replace(source, 0, source.length(), beginDbhsdCancDt, DBHSD_CANC_DT_LEN);
  }

  /**
   * Update DbhsdCancDt with another Field from an offset and length
   *
   * @param value
   */
  public void setDbhsdCancDt(Field source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginDbhsdCancDt, DBHSD_CANC_DT_LEN);
  }

  /**
   * Update DbhsdCancDt with another Field from an offset and length to an offset and length
   *
   * @param value
   */
  public void setDbhsdCancDt(
      Field source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginDbhsdCancDt + targetIndex, targetLen);
  }
  /**
   * Returns the value of dbhsdCreatDttm
   *
   * @return dbhsdCreatDttm
   */
  public char[] getDbhsdCreatDttm() throws CFException {
    if (isDbhsdCreatDttmModified()) {
      dbhsdCreatDttm = refreshDbhsdCreatDttm();
    }
    return dbhsdCreatDttm;
  }

  /**
   * set variable dbhsdCreatDttm Corresponding COBOL Variable is DBHSD-CREAT-DTTM
   *
   * @param value
   */
  public void setDbhsdCreatDttm(char[] value) {
    dbhsdCreatDttm = checkDbhsdCreatDttmConstraints(value);
    serializeDbhsdCreatDttm(dbhsdCreatDttm);
  }

  /**
   * Update DbhsdCreatDttm with a char[] from an offset and length
   *
   * @param value
   */
  public void setDbhsdCreatDttm(char[] source, int sourceIndex) {
    replace(source, sourceIndex, source.length, beginDbhsdCreatDttm, dbhsdCreatDttm.length);
  }

  public void setDbhsdCreatDttm(char[] source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginDbhsdCreatDttm, dbhsdCreatDttm.length);
  }

  /**
   * Update DbhsdCreatDttm with a char[] from an offset and length to an offset and length
   *
   * @param value
   */
  public void setDbhsdCreatDttm(
      char[] source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginDbhsdCreatDttm + targetIndex, targetLen);
  }

  /**
   * Update DbhsdCreatDttm with another Field
   *
   * @param value
   */
  public void setDbhsdCreatDttm(Field source) {
    replace(source, 0, source.length(), beginDbhsdCreatDttm, DBHSD_CREAT_DTTM_LEN);
  }

  /**
   * Update DbhsdCreatDttm with another Field from an offset and length
   *
   * @param value
   */
  public void setDbhsdCreatDttm(Field source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginDbhsdCreatDttm, DBHSD_CREAT_DTTM_LEN);
  }

  /**
   * Update DbhsdCreatDttm with another Field from an offset and length to an offset and length
   *
   * @param value
   */
  public void setDbhsdCreatDttm(
      Field source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginDbhsdCreatDttm + targetIndex, targetLen);
  }
  /**
   * Returns the value of dbhsdLstUpdtDttm
   *
   * @return dbhsdLstUpdtDttm
   */
  public char[] getDbhsdLstUpdtDttm() throws CFException {
    if (isDbhsdLstUpdtDttmModified()) {
      dbhsdLstUpdtDttm = refreshDbhsdLstUpdtDttm();
    }
    return dbhsdLstUpdtDttm;
  }

  /**
   * set variable dbhsdLstUpdtDttm Corresponding COBOL Variable is DBHSD-LST-UPDT-DTTM
   *
   * @param value
   */
  public void setDbhsdLstUpdtDttm(char[] value) {
    dbhsdLstUpdtDttm = checkDbhsdLstUpdtDttmConstraints(value);
    serializeDbhsdLstUpdtDttm(dbhsdLstUpdtDttm);
  }

  /**
   * Update DbhsdLstUpdtDttm with a char[] from an offset and length
   *
   * @param value
   */
  public void setDbhsdLstUpdtDttm(char[] source, int sourceIndex) {
    replace(source, sourceIndex, source.length, beginDbhsdLstUpdtDttm, dbhsdLstUpdtDttm.length);
  }

  public void setDbhsdLstUpdtDttm(char[] source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginDbhsdLstUpdtDttm, dbhsdLstUpdtDttm.length);
  }

  /**
   * Update DbhsdLstUpdtDttm with a char[] from an offset and length to an offset and length
   *
   * @param value
   */
  public void setDbhsdLstUpdtDttm(
      char[] source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginDbhsdLstUpdtDttm + targetIndex, targetLen);
  }

  /**
   * Update DbhsdLstUpdtDttm with another Field
   *
   * @param value
   */
  public void setDbhsdLstUpdtDttm(Field source) {
    replace(source, 0, source.length(), beginDbhsdLstUpdtDttm, DBHSD_LST_UPDT_DTTM_LEN);
  }

  /**
   * Update DbhsdLstUpdtDttm with another Field from an offset and length
   *
   * @param value
   */
  public void setDbhsdLstUpdtDttm(Field source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginDbhsdLstUpdtDttm, DBHSD_LST_UPDT_DTTM_LEN);
  }

  /**
   * Update DbhsdLstUpdtDttm with another Field from an offset and length to an offset and length
   *
   * @param value
   */
  public void setDbhsdLstUpdtDttm(
      Field source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginDbhsdLstUpdtDttm + targetIndex, targetLen);
  }
  /**
   * Returns the value of dbhsdStsCd
   *
   * @return dbhsdStsCd
   */
  public char[] getDbhsdStsCd() throws CFException {
    if (isDbhsdStsCdModified()) {
      dbhsdStsCd = refreshDbhsdStsCd();
    }
    return dbhsdStsCd;
  }

  /**
   * set variable dbhsdStsCd Corresponding COBOL Variable is DBHSD-STS-CD
   *
   * @param value
   */
  public void setDbhsdStsCd(char[] value) {
    dbhsdStsCd = checkDbhsdStsCdConstraints(value);
    serializeDbhsdStsCd(dbhsdStsCd);
  }

  /**
   * Update DbhsdStsCd with a char[] from an offset and length
   *
   * @param value
   */
  public void setDbhsdStsCd(char[] source, int sourceIndex) {
    replace(source, sourceIndex, source.length, beginDbhsdStsCd, dbhsdStsCd.length);
  }

  public void setDbhsdStsCd(char[] source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginDbhsdStsCd, dbhsdStsCd.length);
  }

  /**
   * Update DbhsdStsCd with a char[] from an offset and length to an offset and length
   *
   * @param value
   */
  public void setDbhsdStsCd(
      char[] source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginDbhsdStsCd + targetIndex, targetLen);
  }

  /**
   * Update DbhsdStsCd with another Field
   *
   * @param value
   */
  public void setDbhsdStsCd(Field source) {
    replace(source, 0, source.length(), beginDbhsdStsCd, DBHSD_STS_CD_LEN);
  }

  /**
   * Update DbhsdStsCd with another Field from an offset and length
   *
   * @param value
   */
  public void setDbhsdStsCd(Field source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginDbhsdStsCd, DBHSD_STS_CD_LEN);
  }

  /**
   * Update DbhsdStsCd with another Field from an offset and length to an offset and length
   *
   * @param value
   */
  public void setDbhsdStsCd(
      Field source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginDbhsdStsCd + targetIndex, targetLen);
  }
  /**
   * Returns the value of dbhsdLstUpdtUserId
   *
   * @return dbhsdLstUpdtUserId
   */
  public char[] getDbhsdLstUpdtUserId() throws CFException {
    if (isDbhsdLstUpdtUserIdModified()) {
      dbhsdLstUpdtUserId = refreshDbhsdLstUpdtUserId();
    }
    return dbhsdLstUpdtUserId;
  }

  /**
   * set variable dbhsdLstUpdtUserId Corresponding COBOL Variable is DBHSD-LST-UPDT-USER-ID
   *
   * @param value
   */
  public void setDbhsdLstUpdtUserId(char[] value) {
    dbhsdLstUpdtUserId = checkDbhsdLstUpdtUserIdConstraints(value);
    serializeDbhsdLstUpdtUserId(dbhsdLstUpdtUserId);
  }

  /**
   * Update DbhsdLstUpdtUserId with a char[] from an offset and length
   *
   * @param value
   */
  public void setDbhsdLstUpdtUserId(char[] source, int sourceIndex) {
    replace(source, sourceIndex, source.length, beginDbhsdLstUpdtUserId, dbhsdLstUpdtUserId.length);
  }

  public void setDbhsdLstUpdtUserId(char[] source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginDbhsdLstUpdtUserId, dbhsdLstUpdtUserId.length);
  }

  /**
   * Update DbhsdLstUpdtUserId with a char[] from an offset and length to an offset and length
   *
   * @param value
   */
  public void setDbhsdLstUpdtUserId(
      char[] source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginDbhsdLstUpdtUserId + targetIndex, targetLen);
  }

  /**
   * Update DbhsdLstUpdtUserId with another Field
   *
   * @param value
   */
  public void setDbhsdLstUpdtUserId(Field source) {
    replace(source, 0, source.length(), beginDbhsdLstUpdtUserId, DBHSD_LST_UPDT_USER_ID_LEN);
  }

  /**
   * Update DbhsdLstUpdtUserId with another Field from an offset and length
   *
   * @param value
   */
  public void setDbhsdLstUpdtUserId(Field source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginDbhsdLstUpdtUserId, DBHSD_LST_UPDT_USER_ID_LEN);
  }

  /**
   * Update DbhsdLstUpdtUserId with another Field from an offset and length to an offset and length
   *
   * @param value
   */
  public void setDbhsdLstUpdtUserId(
      Field source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginDbhsdLstUpdtUserId + targetIndex, targetLen);
  }
  /**
   * Returns the value of dbhsdHipaaCommtTxt
   *
   * @return dbhsdHipaaCommtTxt
   */
  public DbhsdHipaaCommtTxt getDbhsdHipaaCommtTxt() {
    return dbhsdHipaaCommtTxt;
  }
  /**
   * Update DbhsdHipaaCommtTxt with the passed value Corresponding COBOL Variable is
   * DBHSD-HIPAA-COMMT-TXT
   *
   * @param value
   */
  public void setDbhsdHipaaCommtTxt(char[] value) {
    dbhsdHipaaCommtTxt.setString(value);
  }

  /**
   * Update DbhsdHipaaCommtTxt with a String from an offset and length
   *
   * @param value
   */
  public void setDbhsdHipaaCommtTxt(char[] source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, dbhsdHipaaCommtTxt.begin, dbhsdHipaaCommtTxt.length());
  }

  /**
   * Update DbhsdHipaaCommtTxt with a String from an offset and length to an offset and length
   *
   * @param value
   */
  public void setDbhsdHipaaCommtTxt(
      char[] source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, dbhsdHipaaCommtTxt.begin + targetIndex, targetLen);
  }

  /**
   * Update DbhsdHipaaCommtTxt with another Field
   *
   * @param value
   */
  public void setDbhsdHipaaCommtTxt(Field source) {
    replace(source, 0, source.length(), dbhsdHipaaCommtTxt.begin, dbhsdHipaaCommtTxt.length());
  }

  /**
   * Update DbhsdHipaaCommtTxt with another Field from an offset and length
   *
   * @param value
   */
  public void setDbhsdHipaaCommtTxt(Field source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, dbhsdHipaaCommtTxt.begin, dbhsdHipaaCommtTxt.length());
  }

  /**
   * Update DbhsdHipaaCommtTxt with another Field from an offset and length to an offset and length
   *
   * @param value
   */
  public void setDbhsdHipaaCommtTxt(
      Field source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, dbhsdHipaaCommtTxt.begin + targetIndex, targetLen);
  }

  /**
   * initializes DclbenHipaaSrvcDtls String fields defaults to Spaces short/int/long defaults to
   * zero BigDecimal defaults to BigDecimal.ZERO
   */
  public void initialize() {
    setDbhsdSlotTblId(CONSTANTS.SPACE_6);
    setDbhsdHipaaCd(CONSTANTS.SPACE_2);
    setDbhsdHipaaVerNbr(CONSTANTS.SPACE);
    setDbhsdNtwkTypCd(CONSTANTS.SPACE);
    setDbhsdEffDt(CONSTANTS.SPACE_10);
    setDbhsdCancDt(CONSTANTS.SPACE_10);
    setDbhsdCreatDttm(CONSTANTS.SPACE_26);
    setDbhsdLstUpdtDttm(CONSTANTS.SPACE_26);
    setDbhsdStsCd(CONSTANTS.SPACE);
    setDbhsdLstUpdtUserId(CONSTANTS.SPACE_9);
    dbhsdHipaaCommtTxt.initialize();
  }

  public static int getDclbenHipaaSrvcDtlsFieldLength() {
    return DCLBEN_HIPAA_SRVC_DTLS_LENGTH;
  }
}
