package com.cloudframe.app.dto.d5427bhi;

/**
 * The class DclbenHipaaSrvc is used to handle fields declared in it
 *
 * @author CloudFrame Inc. created on 2025-03-25 at 08:32. using version 5.0.0.231
 */
import com.cloudframe.app.common.CONSTANTS;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.dto.serialize.d5427bhi.*;
import com.cloudframe.app.exception.CFException;

public class DclbenHipaaSrvc extends DclbenHipaaSrvcSerialized {

  private char[] dbhsSlotTblId = Field.fillLowValue(6);

  private char[] dbhsHipaaCd = Field.fillLowValue(2);

  private char[] dbhsHipaaVerNbr = Field.fillLowValue(1);

  private char[] dbhsNtwkTypCd = Field.fillLowValue(1);

  private char[] dbhsEffDt = Field.fillLowValue(10);

  private char[] dbhsCancDt = Field.fillLowValue(10);

  private char[] dbhsCreatDttm = Field.fillLowValue(26);

  private char[] dbhsStsCd = Field.fillLowValue(1);

  private char[] dbhsSrvcCd = Field.fillLowValue(6);

  private char[] dbhsPlOfSrvcCd = Field.fillLowValue(2);

  private char[] dbhsCausCd = Field.fillLowValue(1);

  private char[] dbhsBenLvlCd = Field.fillLowValue(1);

  private char[] dbhsInNtwkClssCd = Field.fillLowValue(1);

  private char[] dbhsTier1NtwkClssCd = Field.fillLowValue(1);

  private char[] dbhsProcCdRngBegnVal = Field.fillLowValue(7);

  private char[] dbhsProcCdRngEndVal = Field.fillLowValue(7);

  private char[] dbhsProcCdRngTypVal = Field.fillLowValue(1);

  private char[] dbhsLstUpdtDttm = Field.fillLowValue(26);

  private char[] dbhsLstUpdtUserId = Field.fillLowValue(9);

  private char[] dbhsProvOrgTypCd = Field.fillLowValue(3);

  /** Constructor for DclbenHipaaSrvc */
  public DclbenHipaaSrvc() {
    super();
    /*  set the parent of each child as this which are a group variable */
    /*  end of offset */
  }

  /**
   * Returns the value of dbhsSlotTblId
   *
   * @return dbhsSlotTblId
   */
  public char[] getDbhsSlotTblId() throws CFException {
    if (isDbhsSlotTblIdModified()) {
      dbhsSlotTblId = refreshDbhsSlotTblId();
    }
    return dbhsSlotTblId;
  }

  /**
   * set variable dbhsSlotTblId Corresponding COBOL Variable is DBHS-SLOT-TBL-ID
   *
   * @param value
   */
  public void setDbhsSlotTblId(char[] value) {
    dbhsSlotTblId = checkDbhsSlotTblIdConstraints(value);
    serializeDbhsSlotTblId(dbhsSlotTblId);
  }

  /**
   * Update DbhsSlotTblId with a char[] from an offset and length
   *
   * @param value
   */
  public void setDbhsSlotTblId(char[] source, int sourceIndex) {
    replace(source, sourceIndex, source.length, beginDbhsSlotTblId, dbhsSlotTblId.length);
  }

  public void setDbhsSlotTblId(char[] source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginDbhsSlotTblId, dbhsSlotTblId.length);
  }

  /**
   * Update DbhsSlotTblId with a char[] from an offset and length to an offset and length
   *
   * @param value
   */
  public void setDbhsSlotTblId(
      char[] source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginDbhsSlotTblId + targetIndex, targetLen);
  }

  /**
   * Update DbhsSlotTblId with another Field
   *
   * @param value
   */
  public void setDbhsSlotTblId(Field source) {
    replace(source, 0, source.length(), beginDbhsSlotTblId, DBHS_SLOT_TBL_ID_LEN);
  }

  /**
   * Update DbhsSlotTblId with another Field from an offset and length
   *
   * @param value
   */
  public void setDbhsSlotTblId(Field source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginDbhsSlotTblId, DBHS_SLOT_TBL_ID_LEN);
  }

  /**
   * Update DbhsSlotTblId with another Field from an offset and length to an offset and length
   *
   * @param value
   */
  public void setDbhsSlotTblId(
      Field source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginDbhsSlotTblId + targetIndex, targetLen);
  }
  /**
   * Returns the value of dbhsHipaaCd
   *
   * @return dbhsHipaaCd
   */
  public char[] getDbhsHipaaCd() throws CFException {
    if (isDbhsHipaaCdModified()) {
      dbhsHipaaCd = refreshDbhsHipaaCd();
    }
    return dbhsHipaaCd;
  }

  /**
   * set variable dbhsHipaaCd Corresponding COBOL Variable is DBHS-HIPAA-CD
   *
   * @param value
   */
  public void setDbhsHipaaCd(char[] value) {
    dbhsHipaaCd = checkDbhsHipaaCdConstraints(value);
    serializeDbhsHipaaCd(dbhsHipaaCd);
  }

  /**
   * Update DbhsHipaaCd with a char[] from an offset and length
   *
   * @param value
   */
  public void setDbhsHipaaCd(char[] source, int sourceIndex) {
    replace(source, sourceIndex, source.length, beginDbhsHipaaCd, dbhsHipaaCd.length);
  }

  public void setDbhsHipaaCd(char[] source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginDbhsHipaaCd, dbhsHipaaCd.length);
  }

  /**
   * Update DbhsHipaaCd with a char[] from an offset and length to an offset and length
   *
   * @param value
   */
  public void setDbhsHipaaCd(
      char[] source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginDbhsHipaaCd + targetIndex, targetLen);
  }

  /**
   * Update DbhsHipaaCd with another Field
   *
   * @param value
   */
  public void setDbhsHipaaCd(Field source) {
    replace(source, 0, source.length(), beginDbhsHipaaCd, DBHS_HIPAA_CD_LEN);
  }

  /**
   * Update DbhsHipaaCd with another Field from an offset and length
   *
   * @param value
   */
  public void setDbhsHipaaCd(Field source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginDbhsHipaaCd, DBHS_HIPAA_CD_LEN);
  }

  /**
   * Update DbhsHipaaCd with another Field from an offset and length to an offset and length
   *
   * @param value
   */
  public void setDbhsHipaaCd(
      Field source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginDbhsHipaaCd + targetIndex, targetLen);
  }
  /**
   * Returns the value of dbhsHipaaVerNbr
   *
   * @return dbhsHipaaVerNbr
   */
  public char[] getDbhsHipaaVerNbr() throws CFException {
    if (isDbhsHipaaVerNbrModified()) {
      dbhsHipaaVerNbr = refreshDbhsHipaaVerNbr();
    }
    return dbhsHipaaVerNbr;
  }

  /**
   * set variable dbhsHipaaVerNbr Corresponding COBOL Variable is DBHS-HIPAA-VER-NBR
   *
   * @param value
   */
  public void setDbhsHipaaVerNbr(char[] value) {
    dbhsHipaaVerNbr = checkDbhsHipaaVerNbrConstraints(value);
    serializeDbhsHipaaVerNbr(dbhsHipaaVerNbr);
  }

  /**
   * Update DbhsHipaaVerNbr with a char[] from an offset and length
   *
   * @param value
   */
  public void setDbhsHipaaVerNbr(char[] source, int sourceIndex) {
    replace(source, sourceIndex, source.length, beginDbhsHipaaVerNbr, dbhsHipaaVerNbr.length);
  }

  public void setDbhsHipaaVerNbr(char[] source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginDbhsHipaaVerNbr, dbhsHipaaVerNbr.length);
  }

  /**
   * Update DbhsHipaaVerNbr with a char[] from an offset and length to an offset and length
   *
   * @param value
   */
  public void setDbhsHipaaVerNbr(
      char[] source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginDbhsHipaaVerNbr + targetIndex, targetLen);
  }

  /**
   * Update DbhsHipaaVerNbr with another Field
   *
   * @param value
   */
  public void setDbhsHipaaVerNbr(Field source) {
    replace(source, 0, source.length(), beginDbhsHipaaVerNbr, DBHS_HIPAA_VER_NBR_LEN);
  }

  /**
   * Update DbhsHipaaVerNbr with another Field from an offset and length
   *
   * @param value
   */
  public void setDbhsHipaaVerNbr(Field source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginDbhsHipaaVerNbr, DBHS_HIPAA_VER_NBR_LEN);
  }

  /**
   * Update DbhsHipaaVerNbr with another Field from an offset and length to an offset and length
   *
   * @param value
   */
  public void setDbhsHipaaVerNbr(
      Field source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginDbhsHipaaVerNbr + targetIndex, targetLen);
  }
  /**
   * Returns the value of dbhsNtwkTypCd
   *
   * @return dbhsNtwkTypCd
   */
  public char[] getDbhsNtwkTypCd() throws CFException {
    if (isDbhsNtwkTypCdModified()) {
      dbhsNtwkTypCd = refreshDbhsNtwkTypCd();
    }
    return dbhsNtwkTypCd;
  }

  /**
   * set variable dbhsNtwkTypCd Corresponding COBOL Variable is DBHS-NTWK-TYP-CD
   *
   * @param value
   */
  public void setDbhsNtwkTypCd(char[] value) {
    dbhsNtwkTypCd = checkDbhsNtwkTypCdConstraints(value);
    serializeDbhsNtwkTypCd(dbhsNtwkTypCd);
  }

  /**
   * Update DbhsNtwkTypCd with a char[] from an offset and length
   *
   * @param value
   */
  public void setDbhsNtwkTypCd(char[] source, int sourceIndex) {
    replace(source, sourceIndex, source.length, beginDbhsNtwkTypCd, dbhsNtwkTypCd.length);
  }

  public void setDbhsNtwkTypCd(char[] source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginDbhsNtwkTypCd, dbhsNtwkTypCd.length);
  }

  /**
   * Update DbhsNtwkTypCd with a char[] from an offset and length to an offset and length
   *
   * @param value
   */
  public void setDbhsNtwkTypCd(
      char[] source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginDbhsNtwkTypCd + targetIndex, targetLen);
  }

  /**
   * Update DbhsNtwkTypCd with another Field
   *
   * @param value
   */
  public void setDbhsNtwkTypCd(Field source) {
    replace(source, 0, source.length(), beginDbhsNtwkTypCd, DBHS_NTWK_TYP_CD_LEN);
  }

  /**
   * Update DbhsNtwkTypCd with another Field from an offset and length
   *
   * @param value
   */
  public void setDbhsNtwkTypCd(Field source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginDbhsNtwkTypCd, DBHS_NTWK_TYP_CD_LEN);
  }

  /**
   * Update DbhsNtwkTypCd with another Field from an offset and length to an offset and length
   *
   * @param value
   */
  public void setDbhsNtwkTypCd(
      Field source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginDbhsNtwkTypCd + targetIndex, targetLen);
  }
  /**
   * Returns the value of dbhsEffDt
   *
   * @return dbhsEffDt
   */
  public char[] getDbhsEffDt() throws CFException {
    if (isDbhsEffDtModified()) {
      dbhsEffDt = refreshDbhsEffDt();
    }
    return dbhsEffDt;
  }

  /**
   * set variable dbhsEffDt Corresponding COBOL Variable is DBHS-EFF-DT
   *
   * @param value
   */
  public void setDbhsEffDt(char[] value) {
    dbhsEffDt = checkDbhsEffDtConstraints(value);
    serializeDbhsEffDt(dbhsEffDt);
  }

  /**
   * Update DbhsEffDt with a char[] from an offset and length
   *
   * @param value
   */
  public void setDbhsEffDt(char[] source, int sourceIndex) {
    replace(source, sourceIndex, source.length, beginDbhsEffDt, dbhsEffDt.length);
  }

  public void setDbhsEffDt(char[] source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginDbhsEffDt, dbhsEffDt.length);
  }

  /**
   * Update DbhsEffDt with a char[] from an offset and length to an offset and length
   *
   * @param value
   */
  public void setDbhsEffDt(
      char[] source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginDbhsEffDt + targetIndex, targetLen);
  }

  /**
   * Update DbhsEffDt with another Field
   *
   * @param value
   */
  public void setDbhsEffDt(Field source) {
    replace(source, 0, source.length(), beginDbhsEffDt, DBHS_EFF_DT_LEN);
  }

  /**
   * Update DbhsEffDt with another Field from an offset and length
   *
   * @param value
   */
  public void setDbhsEffDt(Field source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginDbhsEffDt, DBHS_EFF_DT_LEN);
  }

  /**
   * Update DbhsEffDt with another Field from an offset and length to an offset and length
   *
   * @param value
   */
  public void setDbhsEffDt(
      Field source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginDbhsEffDt + targetIndex, targetLen);
  }
  /**
   * Returns the value of dbhsCancDt
   *
   * @return dbhsCancDt
   */
  public char[] getDbhsCancDt() throws CFException {
    if (isDbhsCancDtModified()) {
      dbhsCancDt = refreshDbhsCancDt();
    }
    return dbhsCancDt;
  }

  /**
   * set variable dbhsCancDt Corresponding COBOL Variable is DBHS-CANC-DT
   *
   * @param value
   */
  public void setDbhsCancDt(char[] value) {
    dbhsCancDt = checkDbhsCancDtConstraints(value);
    serializeDbhsCancDt(dbhsCancDt);
  }

  /**
   * Update DbhsCancDt with a char[] from an offset and length
   *
   * @param value
   */
  public void setDbhsCancDt(char[] source, int sourceIndex) {
    replace(source, sourceIndex, source.length, beginDbhsCancDt, dbhsCancDt.length);
  }

  public void setDbhsCancDt(char[] source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginDbhsCancDt, dbhsCancDt.length);
  }

  /**
   * Update DbhsCancDt with a char[] from an offset and length to an offset and length
   *
   * @param value
   */
  public void setDbhsCancDt(
      char[] source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginDbhsCancDt + targetIndex, targetLen);
  }

  /**
   * Update DbhsCancDt with another Field
   *
   * @param value
   */
  public void setDbhsCancDt(Field source) {
    replace(source, 0, source.length(), beginDbhsCancDt, DBHS_CANC_DT_LEN);
  }

  /**
   * Update DbhsCancDt with another Field from an offset and length
   *
   * @param value
   */
  public void setDbhsCancDt(Field source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginDbhsCancDt, DBHS_CANC_DT_LEN);
  }

  /**
   * Update DbhsCancDt with another Field from an offset and length to an offset and length
   *
   * @param value
   */
  public void setDbhsCancDt(
      Field source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginDbhsCancDt + targetIndex, targetLen);
  }
  /**
   * Returns the value of dbhsCreatDttm
   *
   * @return dbhsCreatDttm
   */
  public char[] getDbhsCreatDttm() throws CFException {
    if (isDbhsCreatDttmModified()) {
      dbhsCreatDttm = refreshDbhsCreatDttm();
    }
    return dbhsCreatDttm;
  }

  /**
   * set variable dbhsCreatDttm Corresponding COBOL Variable is DBHS-CREAT-DTTM
   *
   * @param value
   */
  public void setDbhsCreatDttm(char[] value) {
    dbhsCreatDttm = checkDbhsCreatDttmConstraints(value);
    serializeDbhsCreatDttm(dbhsCreatDttm);
  }

  /**
   * Update DbhsCreatDttm with a char[] from an offset and length
   *
   * @param value
   */
  public void setDbhsCreatDttm(char[] source, int sourceIndex) {
    replace(source, sourceIndex, source.length, beginDbhsCreatDttm, dbhsCreatDttm.length);
  }

  public void setDbhsCreatDttm(char[] source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginDbhsCreatDttm, dbhsCreatDttm.length);
  }

  /**
   * Update DbhsCreatDttm with a char[] from an offset and length to an offset and length
   *
   * @param value
   */
  public void setDbhsCreatDttm(
      char[] source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginDbhsCreatDttm + targetIndex, targetLen);
  }

  /**
   * Update DbhsCreatDttm with another Field
   *
   * @param value
   */
  public void setDbhsCreatDttm(Field source) {
    replace(source, 0, source.length(), beginDbhsCreatDttm, DBHS_CREAT_DTTM_LEN);
  }

  /**
   * Update DbhsCreatDttm with another Field from an offset and length
   *
   * @param value
   */
  public void setDbhsCreatDttm(Field source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginDbhsCreatDttm, DBHS_CREAT_DTTM_LEN);
  }

  /**
   * Update DbhsCreatDttm with another Field from an offset and length to an offset and length
   *
   * @param value
   */
  public void setDbhsCreatDttm(
      Field source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginDbhsCreatDttm + targetIndex, targetLen);
  }
  /**
   * Returns the value of dbhsStsCd
   *
   * @return dbhsStsCd
   */
  public char[] getDbhsStsCd() throws CFException {
    if (isDbhsStsCdModified()) {
      dbhsStsCd = refreshDbhsStsCd();
    }
    return dbhsStsCd;
  }

  /**
   * set variable dbhsStsCd Corresponding COBOL Variable is DBHS-STS-CD
   *
   * @param value
   */
  public void setDbhsStsCd(char[] value) {
    dbhsStsCd = checkDbhsStsCdConstraints(value);
    serializeDbhsStsCd(dbhsStsCd);
  }

  /**
   * Update DbhsStsCd with a char[] from an offset and length
   *
   * @param value
   */
  public void setDbhsStsCd(char[] source, int sourceIndex) {
    replace(source, sourceIndex, source.length, beginDbhsStsCd, dbhsStsCd.length);
  }

  public void setDbhsStsCd(char[] source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginDbhsStsCd, dbhsStsCd.length);
  }

  /**
   * Update DbhsStsCd with a char[] from an offset and length to an offset and length
   *
   * @param value
   */
  public void setDbhsStsCd(
      char[] source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginDbhsStsCd + targetIndex, targetLen);
  }

  /**
   * Update DbhsStsCd with another Field
   *
   * @param value
   */
  public void setDbhsStsCd(Field source) {
    replace(source, 0, source.length(), beginDbhsStsCd, DBHS_STS_CD_LEN);
  }

  /**
   * Update DbhsStsCd with another Field from an offset and length
   *
   * @param value
   */
  public void setDbhsStsCd(Field source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginDbhsStsCd, DBHS_STS_CD_LEN);
  }

  /**
   * Update DbhsStsCd with another Field from an offset and length to an offset and length
   *
   * @param value
   */
  public void setDbhsStsCd(
      Field source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginDbhsStsCd + targetIndex, targetLen);
  }
  /**
   * Returns the value of dbhsSrvcCd
   *
   * @return dbhsSrvcCd
   */
  public char[] getDbhsSrvcCd() throws CFException {
    if (isDbhsSrvcCdModified()) {
      dbhsSrvcCd = refreshDbhsSrvcCd();
    }
    return dbhsSrvcCd;
  }

  /**
   * set variable dbhsSrvcCd Corresponding COBOL Variable is DBHS-SRVC-CD
   *
   * @param value
   */
  public void setDbhsSrvcCd(char[] value) {
    dbhsSrvcCd = checkDbhsSrvcCdConstraints(value);
    serializeDbhsSrvcCd(dbhsSrvcCd);
  }

  /**
   * Update DbhsSrvcCd with a char[] from an offset and length
   *
   * @param value
   */
  public void setDbhsSrvcCd(char[] source, int sourceIndex) {
    replace(source, sourceIndex, source.length, beginDbhsSrvcCd, dbhsSrvcCd.length);
  }

  public void setDbhsSrvcCd(char[] source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginDbhsSrvcCd, dbhsSrvcCd.length);
  }

  /**
   * Update DbhsSrvcCd with a char[] from an offset and length to an offset and length
   *
   * @param value
   */
  public void setDbhsSrvcCd(
      char[] source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginDbhsSrvcCd + targetIndex, targetLen);
  }

  /**
   * Update DbhsSrvcCd with another Field
   *
   * @param value
   */
  public void setDbhsSrvcCd(Field source) {
    replace(source, 0, source.length(), beginDbhsSrvcCd, DBHS_SRVC_CD_LEN);
  }

  /**
   * Update DbhsSrvcCd with another Field from an offset and length
   *
   * @param value
   */
  public void setDbhsSrvcCd(Field source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginDbhsSrvcCd, DBHS_SRVC_CD_LEN);
  }

  /**
   * Update DbhsSrvcCd with another Field from an offset and length to an offset and length
   *
   * @param value
   */
  public void setDbhsSrvcCd(
      Field source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginDbhsSrvcCd + targetIndex, targetLen);
  }
  /**
   * Returns the value of dbhsPlOfSrvcCd
   *
   * @return dbhsPlOfSrvcCd
   */
  public char[] getDbhsPlOfSrvcCd() throws CFException {
    if (isDbhsPlOfSrvcCdModified()) {
      dbhsPlOfSrvcCd = refreshDbhsPlOfSrvcCd();
    }
    return dbhsPlOfSrvcCd;
  }

  /**
   * set variable dbhsPlOfSrvcCd Corresponding COBOL Variable is DBHS-PL-OF-SRVC-CD
   *
   * @param value
   */
  public void setDbhsPlOfSrvcCd(char[] value) {
    dbhsPlOfSrvcCd = checkDbhsPlOfSrvcCdConstraints(value);
    serializeDbhsPlOfSrvcCd(dbhsPlOfSrvcCd);
  }

  /**
   * Update DbhsPlOfSrvcCd with a char[] from an offset and length
   *
   * @param value
   */
  public void setDbhsPlOfSrvcCd(char[] source, int sourceIndex) {
    replace(source, sourceIndex, source.length, beginDbhsPlOfSrvcCd, dbhsPlOfSrvcCd.length);
  }

  public void setDbhsPlOfSrvcCd(char[] source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginDbhsPlOfSrvcCd, dbhsPlOfSrvcCd.length);
  }

  /**
   * Update DbhsPlOfSrvcCd with a char[] from an offset and length to an offset and length
   *
   * @param value
   */
  public void setDbhsPlOfSrvcCd(
      char[] source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginDbhsPlOfSrvcCd + targetIndex, targetLen);
  }

  /**
   * Update DbhsPlOfSrvcCd with another Field
   *
   * @param value
   */
  public void setDbhsPlOfSrvcCd(Field source) {
    replace(source, 0, source.length(), beginDbhsPlOfSrvcCd, DBHS_PL_OF_SRVC_CD_LEN);
  }

  /**
   * Update DbhsPlOfSrvcCd with another Field from an offset and length
   *
   * @param value
   */
  public void setDbhsPlOfSrvcCd(Field source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginDbhsPlOfSrvcCd, DBHS_PL_OF_SRVC_CD_LEN);
  }

  /**
   * Update DbhsPlOfSrvcCd with another Field from an offset and length to an offset and length
   *
   * @param value
   */
  public void setDbhsPlOfSrvcCd(
      Field source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginDbhsPlOfSrvcCd + targetIndex, targetLen);
  }
  /**
   * Returns the value of dbhsCausCd
   *
   * @return dbhsCausCd
   */
  public char[] getDbhsCausCd() throws CFException {
    if (isDbhsCausCdModified()) {
      dbhsCausCd = refreshDbhsCausCd();
    }
    return dbhsCausCd;
  }

  /**
   * set variable dbhsCausCd Corresponding COBOL Variable is DBHS-CAUS-CD
   *
   * @param value
   */
  public void setDbhsCausCd(char[] value) {
    dbhsCausCd = checkDbhsCausCdConstraints(value);
    serializeDbhsCausCd(dbhsCausCd);
  }

  /**
   * Update DbhsCausCd with a char[] from an offset and length
   *
   * @param value
   */
  public void setDbhsCausCd(char[] source, int sourceIndex) {
    replace(source, sourceIndex, source.length, beginDbhsCausCd, dbhsCausCd.length);
  }

  public void setDbhsCausCd(char[] source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginDbhsCausCd, dbhsCausCd.length);
  }

  /**
   * Update DbhsCausCd with a char[] from an offset and length to an offset and length
   *
   * @param value
   */
  public void setDbhsCausCd(
      char[] source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginDbhsCausCd + targetIndex, targetLen);
  }

  /**
   * Update DbhsCausCd with another Field
   *
   * @param value
   */
  public void setDbhsCausCd(Field source) {
    replace(source, 0, source.length(), beginDbhsCausCd, DBHS_CAUS_CD_LEN);
  }

  /**
   * Update DbhsCausCd with another Field from an offset and length
   *
   * @param value
   */
  public void setDbhsCausCd(Field source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginDbhsCausCd, DBHS_CAUS_CD_LEN);
  }

  /**
   * Update DbhsCausCd with another Field from an offset and length to an offset and length
   *
   * @param value
   */
  public void setDbhsCausCd(
      Field source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginDbhsCausCd + targetIndex, targetLen);
  }
  /**
   * Returns the value of dbhsBenLvlCd
   *
   * @return dbhsBenLvlCd
   */
  public char[] getDbhsBenLvlCd() throws CFException {
    if (isDbhsBenLvlCdModified()) {
      dbhsBenLvlCd = refreshDbhsBenLvlCd();
    }
    return dbhsBenLvlCd;
  }

  /**
   * set variable dbhsBenLvlCd Corresponding COBOL Variable is DBHS-BEN-LVL-CD
   *
   * @param value
   */
  public void setDbhsBenLvlCd(char[] value) {
    dbhsBenLvlCd = checkDbhsBenLvlCdConstraints(value);
    serializeDbhsBenLvlCd(dbhsBenLvlCd);
  }

  /**
   * Update DbhsBenLvlCd with a char[] from an offset and length
   *
   * @param value
   */
  public void setDbhsBenLvlCd(char[] source, int sourceIndex) {
    replace(source, sourceIndex, source.length, beginDbhsBenLvlCd, dbhsBenLvlCd.length);
  }

  public void setDbhsBenLvlCd(char[] source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginDbhsBenLvlCd, dbhsBenLvlCd.length);
  }

  /**
   * Update DbhsBenLvlCd with a char[] from an offset and length to an offset and length
   *
   * @param value
   */
  public void setDbhsBenLvlCd(
      char[] source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginDbhsBenLvlCd + targetIndex, targetLen);
  }

  /**
   * Update DbhsBenLvlCd with another Field
   *
   * @param value
   */
  public void setDbhsBenLvlCd(Field source) {
    replace(source, 0, source.length(), beginDbhsBenLvlCd, DBHS_BEN_LVL_CD_LEN);
  }

  /**
   * Update DbhsBenLvlCd with another Field from an offset and length
   *
   * @param value
   */
  public void setDbhsBenLvlCd(Field source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginDbhsBenLvlCd, DBHS_BEN_LVL_CD_LEN);
  }

  /**
   * Update DbhsBenLvlCd with another Field from an offset and length to an offset and length
   *
   * @param value
   */
  public void setDbhsBenLvlCd(
      Field source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginDbhsBenLvlCd + targetIndex, targetLen);
  }
  /**
   * Returns the value of dbhsInNtwkClssCd
   *
   * @return dbhsInNtwkClssCd
   */
  public char[] getDbhsInNtwkClssCd() throws CFException {
    if (isDbhsInNtwkClssCdModified()) {
      dbhsInNtwkClssCd = refreshDbhsInNtwkClssCd();
    }
    return dbhsInNtwkClssCd;
  }

  /**
   * set variable dbhsInNtwkClssCd Corresponding COBOL Variable is DBHS-IN-NTWK-CLSS-CD
   *
   * @param value
   */
  public void setDbhsInNtwkClssCd(char[] value) {
    dbhsInNtwkClssCd = checkDbhsInNtwkClssCdConstraints(value);
    serializeDbhsInNtwkClssCd(dbhsInNtwkClssCd);
  }

  /**
   * Update DbhsInNtwkClssCd with a char[] from an offset and length
   *
   * @param value
   */
  public void setDbhsInNtwkClssCd(char[] source, int sourceIndex) {
    replace(source, sourceIndex, source.length, beginDbhsInNtwkClssCd, dbhsInNtwkClssCd.length);
  }

  public void setDbhsInNtwkClssCd(char[] source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginDbhsInNtwkClssCd, dbhsInNtwkClssCd.length);
  }

  /**
   * Update DbhsInNtwkClssCd with a char[] from an offset and length to an offset and length
   *
   * @param value
   */
  public void setDbhsInNtwkClssCd(
      char[] source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginDbhsInNtwkClssCd + targetIndex, targetLen);
  }

  /**
   * Update DbhsInNtwkClssCd with another Field
   *
   * @param value
   */
  public void setDbhsInNtwkClssCd(Field source) {
    replace(source, 0, source.length(), beginDbhsInNtwkClssCd, DBHS_IN_NTWK_CLSS_CD_LEN);
  }

  /**
   * Update DbhsInNtwkClssCd with another Field from an offset and length
   *
   * @param value
   */
  public void setDbhsInNtwkClssCd(Field source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginDbhsInNtwkClssCd, DBHS_IN_NTWK_CLSS_CD_LEN);
  }

  /**
   * Update DbhsInNtwkClssCd with another Field from an offset and length to an offset and length
   *
   * @param value
   */
  public void setDbhsInNtwkClssCd(
      Field source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginDbhsInNtwkClssCd + targetIndex, targetLen);
  }
  /**
   * Returns the value of dbhsTier1NtwkClssCd
   *
   * @return dbhsTier1NtwkClssCd
   */
  public char[] getDbhsTier1NtwkClssCd() throws CFException {
    if (isDbhsTier1NtwkClssCdModified()) {
      dbhsTier1NtwkClssCd = refreshDbhsTier1NtwkClssCd();
    }
    return dbhsTier1NtwkClssCd;
  }

  /**
   * set variable dbhsTier1NtwkClssCd Corresponding COBOL Variable is DBHS-TIER1-NTWK-CLSS-CD
   *
   * @param value
   */
  public void setDbhsTier1NtwkClssCd(char[] value) {
    dbhsTier1NtwkClssCd = checkDbhsTier1NtwkClssCdConstraints(value);
    serializeDbhsTier1NtwkClssCd(dbhsTier1NtwkClssCd);
  }

  /**
   * Update DbhsTier1NtwkClssCd with a char[] from an offset and length
   *
   * @param value
   */
  public void setDbhsTier1NtwkClssCd(char[] source, int sourceIndex) {
    replace(
        source, sourceIndex, source.length, beginDbhsTier1NtwkClssCd, dbhsTier1NtwkClssCd.length);
  }

  public void setDbhsTier1NtwkClssCd(char[] source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginDbhsTier1NtwkClssCd, dbhsTier1NtwkClssCd.length);
  }

  /**
   * Update DbhsTier1NtwkClssCd with a char[] from an offset and length to an offset and length
   *
   * @param value
   */
  public void setDbhsTier1NtwkClssCd(
      char[] source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginDbhsTier1NtwkClssCd + targetIndex, targetLen);
  }

  /**
   * Update DbhsTier1NtwkClssCd with another Field
   *
   * @param value
   */
  public void setDbhsTier1NtwkClssCd(Field source) {
    replace(source, 0, source.length(), beginDbhsTier1NtwkClssCd, DBHS_TIER_1_NTWK_CLSS_CD_LEN);
  }

  /**
   * Update DbhsTier1NtwkClssCd with another Field from an offset and length
   *
   * @param value
   */
  public void setDbhsTier1NtwkClssCd(Field source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginDbhsTier1NtwkClssCd, DBHS_TIER_1_NTWK_CLSS_CD_LEN);
  }

  /**
   * Update DbhsTier1NtwkClssCd with another Field from an offset and length to an offset and length
   *
   * @param value
   */
  public void setDbhsTier1NtwkClssCd(
      Field source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginDbhsTier1NtwkClssCd + targetIndex, targetLen);
  }
  /**
   * Returns the value of dbhsProcCdRngBegnVal
   *
   * @return dbhsProcCdRngBegnVal
   */
  public char[] getDbhsProcCdRngBegnVal() throws CFException {
    if (isDbhsProcCdRngBegnValModified()) {
      dbhsProcCdRngBegnVal = refreshDbhsProcCdRngBegnVal();
    }
    return dbhsProcCdRngBegnVal;
  }

  /**
   * set variable dbhsProcCdRngBegnVal Corresponding COBOL Variable is DBHS-PROC-CD-RNG-BEGN-VAL
   *
   * @param value
   */
  public void setDbhsProcCdRngBegnVal(char[] value) {
    dbhsProcCdRngBegnVal = checkDbhsProcCdRngBegnValConstraints(value);
    serializeDbhsProcCdRngBegnVal(dbhsProcCdRngBegnVal);
  }

  /**
   * Update DbhsProcCdRngBegnVal with a char[] from an offset and length
   *
   * @param value
   */
  public void setDbhsProcCdRngBegnVal(char[] source, int sourceIndex) {
    replace(
        source, sourceIndex, source.length, beginDbhsProcCdRngBegnVal, dbhsProcCdRngBegnVal.length);
  }

  public void setDbhsProcCdRngBegnVal(char[] source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginDbhsProcCdRngBegnVal, dbhsProcCdRngBegnVal.length);
  }

  /**
   * Update DbhsProcCdRngBegnVal with a char[] from an offset and length to an offset and length
   *
   * @param value
   */
  public void setDbhsProcCdRngBegnVal(
      char[] source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginDbhsProcCdRngBegnVal + targetIndex, targetLen);
  }

  /**
   * Update DbhsProcCdRngBegnVal with another Field
   *
   * @param value
   */
  public void setDbhsProcCdRngBegnVal(Field source) {
    replace(source, 0, source.length(), beginDbhsProcCdRngBegnVal, DBHS_PROC_CD_RNG_BEGN_VAL_LEN);
  }

  /**
   * Update DbhsProcCdRngBegnVal with another Field from an offset and length
   *
   * @param value
   */
  public void setDbhsProcCdRngBegnVal(Field source, int sourceIndex, int sourceLen) {
    replace(
        source, sourceIndex, sourceLen, beginDbhsProcCdRngBegnVal, DBHS_PROC_CD_RNG_BEGN_VAL_LEN);
  }

  /**
   * Update DbhsProcCdRngBegnVal with another Field from an offset and length to an offset and
   * length
   *
   * @param value
   */
  public void setDbhsProcCdRngBegnVal(
      Field source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginDbhsProcCdRngBegnVal + targetIndex, targetLen);
  }
  /**
   * Returns the value of dbhsProcCdRngEndVal
   *
   * @return dbhsProcCdRngEndVal
   */
  public char[] getDbhsProcCdRngEndVal() throws CFException {
    if (isDbhsProcCdRngEndValModified()) {
      dbhsProcCdRngEndVal = refreshDbhsProcCdRngEndVal();
    }
    return dbhsProcCdRngEndVal;
  }

  /**
   * set variable dbhsProcCdRngEndVal Corresponding COBOL Variable is DBHS-PROC-CD-RNG-END-VAL
   *
   * @param value
   */
  public void setDbhsProcCdRngEndVal(char[] value) {
    dbhsProcCdRngEndVal = checkDbhsProcCdRngEndValConstraints(value);
    serializeDbhsProcCdRngEndVal(dbhsProcCdRngEndVal);
  }

  /**
   * Update DbhsProcCdRngEndVal with a char[] from an offset and length
   *
   * @param value
   */
  public void setDbhsProcCdRngEndVal(char[] source, int sourceIndex) {
    replace(
        source, sourceIndex, source.length, beginDbhsProcCdRngEndVal, dbhsProcCdRngEndVal.length);
  }

  public void setDbhsProcCdRngEndVal(char[] source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginDbhsProcCdRngEndVal, dbhsProcCdRngEndVal.length);
  }

  /**
   * Update DbhsProcCdRngEndVal with a char[] from an offset and length to an offset and length
   *
   * @param value
   */
  public void setDbhsProcCdRngEndVal(
      char[] source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginDbhsProcCdRngEndVal + targetIndex, targetLen);
  }

  /**
   * Update DbhsProcCdRngEndVal with another Field
   *
   * @param value
   */
  public void setDbhsProcCdRngEndVal(Field source) {
    replace(source, 0, source.length(), beginDbhsProcCdRngEndVal, DBHS_PROC_CD_RNG_END_VAL_LEN);
  }

  /**
   * Update DbhsProcCdRngEndVal with another Field from an offset and length
   *
   * @param value
   */
  public void setDbhsProcCdRngEndVal(Field source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginDbhsProcCdRngEndVal, DBHS_PROC_CD_RNG_END_VAL_LEN);
  }

  /**
   * Update DbhsProcCdRngEndVal with another Field from an offset and length to an offset and length
   *
   * @param value
   */
  public void setDbhsProcCdRngEndVal(
      Field source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginDbhsProcCdRngEndVal + targetIndex, targetLen);
  }
  /**
   * Returns the value of dbhsProcCdRngTypVal
   *
   * @return dbhsProcCdRngTypVal
   */
  public char[] getDbhsProcCdRngTypVal() throws CFException {
    if (isDbhsProcCdRngTypValModified()) {
      dbhsProcCdRngTypVal = refreshDbhsProcCdRngTypVal();
    }
    return dbhsProcCdRngTypVal;
  }

  /**
   * set variable dbhsProcCdRngTypVal Corresponding COBOL Variable is DBHS-PROC-CD-RNG-TYP-VAL
   *
   * @param value
   */
  public void setDbhsProcCdRngTypVal(char[] value) {
    dbhsProcCdRngTypVal = checkDbhsProcCdRngTypValConstraints(value);
    serializeDbhsProcCdRngTypVal(dbhsProcCdRngTypVal);
  }

  /**
   * Update DbhsProcCdRngTypVal with a char[] from an offset and length
   *
   * @param value
   */
  public void setDbhsProcCdRngTypVal(char[] source, int sourceIndex) {
    replace(
        source, sourceIndex, source.length, beginDbhsProcCdRngTypVal, dbhsProcCdRngTypVal.length);
  }

  public void setDbhsProcCdRngTypVal(char[] source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginDbhsProcCdRngTypVal, dbhsProcCdRngTypVal.length);
  }

  /**
   * Update DbhsProcCdRngTypVal with a char[] from an offset and length to an offset and length
   *
   * @param value
   */
  public void setDbhsProcCdRngTypVal(
      char[] source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginDbhsProcCdRngTypVal + targetIndex, targetLen);
  }

  /**
   * Update DbhsProcCdRngTypVal with another Field
   *
   * @param value
   */
  public void setDbhsProcCdRngTypVal(Field source) {
    replace(source, 0, source.length(), beginDbhsProcCdRngTypVal, DBHS_PROC_CD_RNG_TYP_VAL_LEN);
  }

  /**
   * Update DbhsProcCdRngTypVal with another Field from an offset and length
   *
   * @param value
   */
  public void setDbhsProcCdRngTypVal(Field source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginDbhsProcCdRngTypVal, DBHS_PROC_CD_RNG_TYP_VAL_LEN);
  }

  /**
   * Update DbhsProcCdRngTypVal with another Field from an offset and length to an offset and length
   *
   * @param value
   */
  public void setDbhsProcCdRngTypVal(
      Field source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginDbhsProcCdRngTypVal + targetIndex, targetLen);
  }
  /**
   * Returns the value of dbhsLstUpdtDttm
   *
   * @return dbhsLstUpdtDttm
   */
  public char[] getDbhsLstUpdtDttm() throws CFException {
    if (isDbhsLstUpdtDttmModified()) {
      dbhsLstUpdtDttm = refreshDbhsLstUpdtDttm();
    }
    return dbhsLstUpdtDttm;
  }

  /**
   * set variable dbhsLstUpdtDttm Corresponding COBOL Variable is DBHS-LST-UPDT-DTTM
   *
   * @param value
   */
  public void setDbhsLstUpdtDttm(char[] value) {
    dbhsLstUpdtDttm = checkDbhsLstUpdtDttmConstraints(value);
    serializeDbhsLstUpdtDttm(dbhsLstUpdtDttm);
  }

  /**
   * Update DbhsLstUpdtDttm with a char[] from an offset and length
   *
   * @param value
   */
  public void setDbhsLstUpdtDttm(char[] source, int sourceIndex) {
    replace(source, sourceIndex, source.length, beginDbhsLstUpdtDttm, dbhsLstUpdtDttm.length);
  }

  public void setDbhsLstUpdtDttm(char[] source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginDbhsLstUpdtDttm, dbhsLstUpdtDttm.length);
  }

  /**
   * Update DbhsLstUpdtDttm with a char[] from an offset and length to an offset and length
   *
   * @param value
   */
  public void setDbhsLstUpdtDttm(
      char[] source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginDbhsLstUpdtDttm + targetIndex, targetLen);
  }

  /**
   * Update DbhsLstUpdtDttm with another Field
   *
   * @param value
   */
  public void setDbhsLstUpdtDttm(Field source) {
    replace(source, 0, source.length(), beginDbhsLstUpdtDttm, DBHS_LST_UPDT_DTTM_LEN);
  }

  /**
   * Update DbhsLstUpdtDttm with another Field from an offset and length
   *
   * @param value
   */
  public void setDbhsLstUpdtDttm(Field source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginDbhsLstUpdtDttm, DBHS_LST_UPDT_DTTM_LEN);
  }

  /**
   * Update DbhsLstUpdtDttm with another Field from an offset and length to an offset and length
   *
   * @param value
   */
  public void setDbhsLstUpdtDttm(
      Field source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginDbhsLstUpdtDttm + targetIndex, targetLen);
  }
  /**
   * Returns the value of dbhsLstUpdtUserId
   *
   * @return dbhsLstUpdtUserId
   */
  public char[] getDbhsLstUpdtUserId() throws CFException {
    if (isDbhsLstUpdtUserIdModified()) {
      dbhsLstUpdtUserId = refreshDbhsLstUpdtUserId();
    }
    return dbhsLstUpdtUserId;
  }

  /**
   * set variable dbhsLstUpdtUserId Corresponding COBOL Variable is DBHS-LST-UPDT-USER-ID
   *
   * @param value
   */
  public void setDbhsLstUpdtUserId(char[] value) {
    dbhsLstUpdtUserId = checkDbhsLstUpdtUserIdConstraints(value);
    serializeDbhsLstUpdtUserId(dbhsLstUpdtUserId);
  }

  /**
   * Update DbhsLstUpdtUserId with a char[] from an offset and length
   *
   * @param value
   */
  public void setDbhsLstUpdtUserId(char[] source, int sourceIndex) {
    replace(source, sourceIndex, source.length, beginDbhsLstUpdtUserId, dbhsLstUpdtUserId.length);
  }

  public void setDbhsLstUpdtUserId(char[] source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginDbhsLstUpdtUserId, dbhsLstUpdtUserId.length);
  }

  /**
   * Update DbhsLstUpdtUserId with a char[] from an offset and length to an offset and length
   *
   * @param value
   */
  public void setDbhsLstUpdtUserId(
      char[] source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginDbhsLstUpdtUserId + targetIndex, targetLen);
  }

  /**
   * Update DbhsLstUpdtUserId with another Field
   *
   * @param value
   */
  public void setDbhsLstUpdtUserId(Field source) {
    replace(source, 0, source.length(), beginDbhsLstUpdtUserId, DBHS_LST_UPDT_USER_ID_LEN);
  }

  /**
   * Update DbhsLstUpdtUserId with another Field from an offset and length
   *
   * @param value
   */
  public void setDbhsLstUpdtUserId(Field source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginDbhsLstUpdtUserId, DBHS_LST_UPDT_USER_ID_LEN);
  }

  /**
   * Update DbhsLstUpdtUserId with another Field from an offset and length to an offset and length
   *
   * @param value
   */
  public void setDbhsLstUpdtUserId(
      Field source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginDbhsLstUpdtUserId + targetIndex, targetLen);
  }
  /**
   * Returns the value of dbhsProvOrgTypCd
   *
   * @return dbhsProvOrgTypCd
   */
  public char[] getDbhsProvOrgTypCd() throws CFException {
    if (isDbhsProvOrgTypCdModified()) {
      dbhsProvOrgTypCd = refreshDbhsProvOrgTypCd();
    }
    return dbhsProvOrgTypCd;
  }

  /**
   * set variable dbhsProvOrgTypCd Corresponding COBOL Variable is DBHS-PROV-ORG-TYP-CD
   *
   * @param value
   */
  public void setDbhsProvOrgTypCd(char[] value) {
    dbhsProvOrgTypCd = checkDbhsProvOrgTypCdConstraints(value);
    serializeDbhsProvOrgTypCd(dbhsProvOrgTypCd);
  }

  /**
   * Update DbhsProvOrgTypCd with a char[] from an offset and length
   *
   * @param value
   */
  public void setDbhsProvOrgTypCd(char[] source, int sourceIndex) {
    replace(source, sourceIndex, source.length, beginDbhsProvOrgTypCd, dbhsProvOrgTypCd.length);
  }

  public void setDbhsProvOrgTypCd(char[] source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginDbhsProvOrgTypCd, dbhsProvOrgTypCd.length);
  }

  /**
   * Update DbhsProvOrgTypCd with a char[] from an offset and length to an offset and length
   *
   * @param value
   */
  public void setDbhsProvOrgTypCd(
      char[] source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginDbhsProvOrgTypCd + targetIndex, targetLen);
  }

  /**
   * Update DbhsProvOrgTypCd with another Field
   *
   * @param value
   */
  public void setDbhsProvOrgTypCd(Field source) {
    replace(source, 0, source.length(), beginDbhsProvOrgTypCd, DBHS_PROV_ORG_TYP_CD_LEN);
  }

  /**
   * Update DbhsProvOrgTypCd with another Field from an offset and length
   *
   * @param value
   */
  public void setDbhsProvOrgTypCd(Field source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginDbhsProvOrgTypCd, DBHS_PROV_ORG_TYP_CD_LEN);
  }

  /**
   * Update DbhsProvOrgTypCd with another Field from an offset and length to an offset and length
   *
   * @param value
   */
  public void setDbhsProvOrgTypCd(
      Field source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginDbhsProvOrgTypCd + targetIndex, targetLen);
  }

  /**
   * initializes DclbenHipaaSrvc String fields defaults to Spaces short/int/long defaults to zero
   * BigDecimal defaults to BigDecimal.ZERO
   */
  public void initialize() {
    setDbhsSlotTblId(CONSTANTS.SPACE_6);
    setDbhsHipaaCd(CONSTANTS.SPACE_2);
    setDbhsHipaaVerNbr(CONSTANTS.SPACE);
    setDbhsNtwkTypCd(CONSTANTS.SPACE);
    setDbhsEffDt(CONSTANTS.SPACE_10);
    setDbhsCancDt(CONSTANTS.SPACE_10);
    setDbhsCreatDttm(CONSTANTS.SPACE_26);
    setDbhsStsCd(CONSTANTS.SPACE);
    setDbhsSrvcCd(CONSTANTS.SPACE_6);
    setDbhsPlOfSrvcCd(CONSTANTS.SPACE_2);
    setDbhsCausCd(CONSTANTS.SPACE);
    setDbhsBenLvlCd(CONSTANTS.SPACE);
    setDbhsInNtwkClssCd(CONSTANTS.SPACE);
    setDbhsTier1NtwkClssCd(CONSTANTS.SPACE);
    setDbhsProcCdRngBegnVal(CONSTANTS.SPACE_7);
    setDbhsProcCdRngEndVal(CONSTANTS.SPACE_7);
    setDbhsProcCdRngTypVal(CONSTANTS.SPACE);
    setDbhsLstUpdtDttm(CONSTANTS.SPACE_26);
    setDbhsLstUpdtUserId(CONSTANTS.SPACE_9);
    setDbhsProvOrgTypCd(CONSTANTS.SPACE_3);
  }

  public static int getDclbenHipaaSrvcFieldLength() {
    return DCLBEN_HIPAA_SRVC_LENGTH;
  }
}
