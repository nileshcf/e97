package com.cloudframe.app.dto.bbhsr002;

/**
 * The class BhiRowNonkeyData is used to handle fields declared in it
 *
 * @author CloudFrame Inc. created on 2025-03-25 at 08:29. using version 5.0.0.231
 */
import com.cloudframe.app.data.Field;
import com.cloudframe.app.dto.serialize.bbhsr002.*;
import com.cloudframe.app.exception.CFException;

public class BhiRowNonkeyData extends BhiRowNonkeyDataSerialized {

  private char[] bhiRowSrvcCd = Field.fillLowValue(6);

  private char[] bhiRowPlofsrvcCd = Field.fillLowValue(2);

  private char[] bhiRowCausCd = Field.fillLowValue(1);

  private char[] bhiRowBenLvlCd = Field.fillLowValue(1);

  private char[] bhiRowProcFrom = Field.fillLowValue(7);

  private char[] bhiRowProcTo = Field.fillLowValue(7);

  private char[] bhiRowProcType = Field.fillLowValue(1);

  private char[] bhiRowInn = Field.fillLowValue(1);

  private char[] bhiRowTier = Field.fillLowValue(1);

  private char[] bhiRowLstupdDttm = Field.fillLowValue(26);

  private char[] bhiRowLstupdUsrid = Field.fillLowValue(6);

  private char[] bhiRowStsCd = Field.fillLowValue(1);

  private char[] bhiRowProvOrgTypCd = Field.fillLowValue(3);

  /** Constructor for BhiRowNonkeyData */
  public BhiRowNonkeyData() {
    // TO-DO auto generated code
  }

  /**
   * Constructor for BhiRowNonkeyData. sets the parent value to the parent
   *
   * @param parent
   * @param begin
   */
  public BhiRowNonkeyData(Field parent, int begin) {
    setParent(parent, begin);
  }

  /**
   * Returns the value of bhiRowSrvcCd
   *
   * @return bhiRowSrvcCd
   */
  public char[] getBhiRowSrvcCd() throws CFException {
    if (isBhiRowSrvcCdModified()) {
      bhiRowSrvcCd = refreshBhiRowSrvcCd();
    }
    return bhiRowSrvcCd;
  }

  /**
   * set variable bhiRowSrvcCd Corresponding COBOL Variable is BHI-ROW-SRVC-CD
   *
   * @param value
   */
  public void setBhiRowSrvcCd(char[] value) {
    bhiRowSrvcCd = checkBhiRowSrvcCdConstraints(value);
    serializeBhiRowSrvcCd(bhiRowSrvcCd);
  }

  /**
   * Update BhiRowSrvcCd with a char[] from an offset and length
   *
   * @param value
   */
  public void setBhiRowSrvcCd(char[] source, int sourceIndex) {
    replace(source, sourceIndex, source.length, beginBhiRowSrvcCd, bhiRowSrvcCd.length);
  }

  public void setBhiRowSrvcCd(char[] source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginBhiRowSrvcCd, bhiRowSrvcCd.length);
  }

  /**
   * Update BhiRowSrvcCd with a char[] from an offset and length to an offset and length
   *
   * @param value
   */
  public void setBhiRowSrvcCd(
      char[] source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginBhiRowSrvcCd + targetIndex, targetLen);
  }

  /**
   * Update BhiRowSrvcCd with another Field
   *
   * @param value
   */
  public void setBhiRowSrvcCd(Field source) {
    replace(source, 0, source.length(), beginBhiRowSrvcCd, BHI_ROW_SRVC_CD_LEN);
  }

  /**
   * Update BhiRowSrvcCd with another Field from an offset and length
   *
   * @param value
   */
  public void setBhiRowSrvcCd(Field source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginBhiRowSrvcCd, BHI_ROW_SRVC_CD_LEN);
  }

  /**
   * Update BhiRowSrvcCd with another Field from an offset and length to an offset and length
   *
   * @param value
   */
  public void setBhiRowSrvcCd(
      Field source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginBhiRowSrvcCd + targetIndex, targetLen);
  }
  /**
   * Returns the value of bhiRowPlofsrvcCd
   *
   * @return bhiRowPlofsrvcCd
   */
  public char[] getBhiRowPlofsrvcCd() throws CFException {
    if (isBhiRowPlofsrvcCdModified()) {
      bhiRowPlofsrvcCd = refreshBhiRowPlofsrvcCd();
    }
    return bhiRowPlofsrvcCd;
  }

  /**
   * set variable bhiRowPlofsrvcCd Corresponding COBOL Variable is BHI-ROW-PLOFSRVC-CD
   *
   * @param value
   */
  public void setBhiRowPlofsrvcCd(char[] value) {
    bhiRowPlofsrvcCd = checkBhiRowPlofsrvcCdConstraints(value);
    serializeBhiRowPlofsrvcCd(bhiRowPlofsrvcCd);
  }

  /**
   * Update BhiRowPlofsrvcCd with a char[] from an offset and length
   *
   * @param value
   */
  public void setBhiRowPlofsrvcCd(char[] source, int sourceIndex) {
    replace(source, sourceIndex, source.length, beginBhiRowPlofsrvcCd, bhiRowPlofsrvcCd.length);
  }

  public void setBhiRowPlofsrvcCd(char[] source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginBhiRowPlofsrvcCd, bhiRowPlofsrvcCd.length);
  }

  /**
   * Update BhiRowPlofsrvcCd with a char[] from an offset and length to an offset and length
   *
   * @param value
   */
  public void setBhiRowPlofsrvcCd(
      char[] source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginBhiRowPlofsrvcCd + targetIndex, targetLen);
  }

  /**
   * Update BhiRowPlofsrvcCd with another Field
   *
   * @param value
   */
  public void setBhiRowPlofsrvcCd(Field source) {
    replace(source, 0, source.length(), beginBhiRowPlofsrvcCd, BHI_ROW_PLOFSRVC_CD_LEN);
  }

  /**
   * Update BhiRowPlofsrvcCd with another Field from an offset and length
   *
   * @param value
   */
  public void setBhiRowPlofsrvcCd(Field source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginBhiRowPlofsrvcCd, BHI_ROW_PLOFSRVC_CD_LEN);
  }

  /**
   * Update BhiRowPlofsrvcCd with another Field from an offset and length to an offset and length
   *
   * @param value
   */
  public void setBhiRowPlofsrvcCd(
      Field source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginBhiRowPlofsrvcCd + targetIndex, targetLen);
  }
  /**
   * Returns the value of bhiRowCausCd
   *
   * @return bhiRowCausCd
   */
  public char[] getBhiRowCausCd() throws CFException {
    if (isBhiRowCausCdModified()) {
      bhiRowCausCd = refreshBhiRowCausCd();
    }
    return bhiRowCausCd;
  }

  /**
   * set variable bhiRowCausCd Corresponding COBOL Variable is BHI-ROW-CAUS-CD
   *
   * @param value
   */
  public void setBhiRowCausCd(char[] value) {
    bhiRowCausCd = checkBhiRowCausCdConstraints(value);
    serializeBhiRowCausCd(bhiRowCausCd);
  }

  /**
   * Update BhiRowCausCd with a char[] from an offset and length
   *
   * @param value
   */
  public void setBhiRowCausCd(char[] source, int sourceIndex) {
    replace(source, sourceIndex, source.length, beginBhiRowCausCd, bhiRowCausCd.length);
  }

  public void setBhiRowCausCd(char[] source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginBhiRowCausCd, bhiRowCausCd.length);
  }

  /**
   * Update BhiRowCausCd with a char[] from an offset and length to an offset and length
   *
   * @param value
   */
  public void setBhiRowCausCd(
      char[] source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginBhiRowCausCd + targetIndex, targetLen);
  }

  /**
   * Update BhiRowCausCd with another Field
   *
   * @param value
   */
  public void setBhiRowCausCd(Field source) {
    replace(source, 0, source.length(), beginBhiRowCausCd, BHI_ROW_CAUS_CD_LEN);
  }

  /**
   * Update BhiRowCausCd with another Field from an offset and length
   *
   * @param value
   */
  public void setBhiRowCausCd(Field source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginBhiRowCausCd, BHI_ROW_CAUS_CD_LEN);
  }

  /**
   * Update BhiRowCausCd with another Field from an offset and length to an offset and length
   *
   * @param value
   */
  public void setBhiRowCausCd(
      Field source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginBhiRowCausCd + targetIndex, targetLen);
  }
  /**
   * Returns the value of bhiRowBenLvlCd
   *
   * @return bhiRowBenLvlCd
   */
  public char[] getBhiRowBenLvlCd() throws CFException {
    if (isBhiRowBenLvlCdModified()) {
      bhiRowBenLvlCd = refreshBhiRowBenLvlCd();
    }
    return bhiRowBenLvlCd;
  }

  /**
   * set variable bhiRowBenLvlCd Corresponding COBOL Variable is BHI-ROW-BEN-LVL-CD
   *
   * @param value
   */
  public void setBhiRowBenLvlCd(char[] value) {
    bhiRowBenLvlCd = checkBhiRowBenLvlCdConstraints(value);
    serializeBhiRowBenLvlCd(bhiRowBenLvlCd);
  }

  /**
   * Update BhiRowBenLvlCd with a char[] from an offset and length
   *
   * @param value
   */
  public void setBhiRowBenLvlCd(char[] source, int sourceIndex) {
    replace(source, sourceIndex, source.length, beginBhiRowBenLvlCd, bhiRowBenLvlCd.length);
  }

  public void setBhiRowBenLvlCd(char[] source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginBhiRowBenLvlCd, bhiRowBenLvlCd.length);
  }

  /**
   * Update BhiRowBenLvlCd with a char[] from an offset and length to an offset and length
   *
   * @param value
   */
  public void setBhiRowBenLvlCd(
      char[] source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginBhiRowBenLvlCd + targetIndex, targetLen);
  }

  /**
   * Update BhiRowBenLvlCd with another Field
   *
   * @param value
   */
  public void setBhiRowBenLvlCd(Field source) {
    replace(source, 0, source.length(), beginBhiRowBenLvlCd, BHI_ROW_BEN_LVL_CD_LEN);
  }

  /**
   * Update BhiRowBenLvlCd with another Field from an offset and length
   *
   * @param value
   */
  public void setBhiRowBenLvlCd(Field source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginBhiRowBenLvlCd, BHI_ROW_BEN_LVL_CD_LEN);
  }

  /**
   * Update BhiRowBenLvlCd with another Field from an offset and length to an offset and length
   *
   * @param value
   */
  public void setBhiRowBenLvlCd(
      Field source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginBhiRowBenLvlCd + targetIndex, targetLen);
  }
  /**
   * Returns the value of bhiRowProcFrom
   *
   * @return bhiRowProcFrom
   */
  public char[] getBhiRowProcFrom() throws CFException {
    if (isBhiRowProcFromModified()) {
      bhiRowProcFrom = refreshBhiRowProcFrom();
    }
    return bhiRowProcFrom;
  }

  /**
   * set variable bhiRowProcFrom Corresponding COBOL Variable is BHI-ROW-PROC-FROM
   *
   * @param value
   */
  public void setBhiRowProcFrom(char[] value) {
    bhiRowProcFrom = checkBhiRowProcFromConstraints(value);
    serializeBhiRowProcFrom(bhiRowProcFrom);
  }

  /**
   * Update BhiRowProcFrom with a char[] from an offset and length
   *
   * @param value
   */
  public void setBhiRowProcFrom(char[] source, int sourceIndex) {
    replace(source, sourceIndex, source.length, beginBhiRowProcFrom, bhiRowProcFrom.length);
  }

  public void setBhiRowProcFrom(char[] source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginBhiRowProcFrom, bhiRowProcFrom.length);
  }

  /**
   * Update BhiRowProcFrom with a char[] from an offset and length to an offset and length
   *
   * @param value
   */
  public void setBhiRowProcFrom(
      char[] source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginBhiRowProcFrom + targetIndex, targetLen);
  }

  /**
   * Update BhiRowProcFrom with another Field
   *
   * @param value
   */
  public void setBhiRowProcFrom(Field source) {
    replace(source, 0, source.length(), beginBhiRowProcFrom, BHI_ROW_PROC_FROM_LEN);
  }

  /**
   * Update BhiRowProcFrom with another Field from an offset and length
   *
   * @param value
   */
  public void setBhiRowProcFrom(Field source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginBhiRowProcFrom, BHI_ROW_PROC_FROM_LEN);
  }

  /**
   * Update BhiRowProcFrom with another Field from an offset and length to an offset and length
   *
   * @param value
   */
  public void setBhiRowProcFrom(
      Field source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginBhiRowProcFrom + targetIndex, targetLen);
  }
  /**
   * Returns the value of bhiRowProcTo
   *
   * @return bhiRowProcTo
   */
  public char[] getBhiRowProcTo() throws CFException {
    if (isBhiRowProcToModified()) {
      bhiRowProcTo = refreshBhiRowProcTo();
    }
    return bhiRowProcTo;
  }

  /**
   * set variable bhiRowProcTo Corresponding COBOL Variable is BHI-ROW-PROC-TO
   *
   * @param value
   */
  public void setBhiRowProcTo(char[] value) {
    bhiRowProcTo = checkBhiRowProcToConstraints(value);
    serializeBhiRowProcTo(bhiRowProcTo);
  }

  /**
   * Update BhiRowProcTo with a char[] from an offset and length
   *
   * @param value
   */
  public void setBhiRowProcTo(char[] source, int sourceIndex) {
    replace(source, sourceIndex, source.length, beginBhiRowProcTo, bhiRowProcTo.length);
  }

  public void setBhiRowProcTo(char[] source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginBhiRowProcTo, bhiRowProcTo.length);
  }

  /**
   * Update BhiRowProcTo with a char[] from an offset and length to an offset and length
   *
   * @param value
   */
  public void setBhiRowProcTo(
      char[] source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginBhiRowProcTo + targetIndex, targetLen);
  }

  /**
   * Update BhiRowProcTo with another Field
   *
   * @param value
   */
  public void setBhiRowProcTo(Field source) {
    replace(source, 0, source.length(), beginBhiRowProcTo, BHI_ROW_PROC_TO_LEN);
  }

  /**
   * Update BhiRowProcTo with another Field from an offset and length
   *
   * @param value
   */
  public void setBhiRowProcTo(Field source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginBhiRowProcTo, BHI_ROW_PROC_TO_LEN);
  }

  /**
   * Update BhiRowProcTo with another Field from an offset and length to an offset and length
   *
   * @param value
   */
  public void setBhiRowProcTo(
      Field source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginBhiRowProcTo + targetIndex, targetLen);
  }
  /**
   * Returns the value of bhiRowProcType
   *
   * @return bhiRowProcType
   */
  public char[] getBhiRowProcType() throws CFException {
    if (isBhiRowProcTypeModified()) {
      bhiRowProcType = refreshBhiRowProcType();
    }
    return bhiRowProcType;
  }

  /**
   * set variable bhiRowProcType Corresponding COBOL Variable is BHI-ROW-PROC-TYPE
   *
   * @param value
   */
  public void setBhiRowProcType(char[] value) {
    bhiRowProcType = checkBhiRowProcTypeConstraints(value);
    serializeBhiRowProcType(bhiRowProcType);
  }

  /**
   * Update BhiRowProcType with a char[] from an offset and length
   *
   * @param value
   */
  public void setBhiRowProcType(char[] source, int sourceIndex) {
    replace(source, sourceIndex, source.length, beginBhiRowProcType, bhiRowProcType.length);
  }

  public void setBhiRowProcType(char[] source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginBhiRowProcType, bhiRowProcType.length);
  }

  /**
   * Update BhiRowProcType with a char[] from an offset and length to an offset and length
   *
   * @param value
   */
  public void setBhiRowProcType(
      char[] source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginBhiRowProcType + targetIndex, targetLen);
  }

  /**
   * Update BhiRowProcType with another Field
   *
   * @param value
   */
  public void setBhiRowProcType(Field source) {
    replace(source, 0, source.length(), beginBhiRowProcType, BHI_ROW_PROC_TYPE_LEN);
  }

  /**
   * Update BhiRowProcType with another Field from an offset and length
   *
   * @param value
   */
  public void setBhiRowProcType(Field source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginBhiRowProcType, BHI_ROW_PROC_TYPE_LEN);
  }

  /**
   * Update BhiRowProcType with another Field from an offset and length to an offset and length
   *
   * @param value
   */
  public void setBhiRowProcType(
      Field source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginBhiRowProcType + targetIndex, targetLen);
  }
  /**
   * Returns the value of bhiRowInn
   *
   * @return bhiRowInn
   */
  public char[] getBhiRowInn() throws CFException {
    if (isBhiRowInnModified()) {
      bhiRowInn = refreshBhiRowInn();
    }
    return bhiRowInn;
  }

  /**
   * set variable bhiRowInn Corresponding COBOL Variable is BHI-ROW-INN
   *
   * @param value
   */
  public void setBhiRowInn(char[] value) {
    bhiRowInn = checkBhiRowInnConstraints(value);
    serializeBhiRowInn(bhiRowInn);
  }

  /**
   * Update BhiRowInn with a char[] from an offset and length
   *
   * @param value
   */
  public void setBhiRowInn(char[] source, int sourceIndex) {
    replace(source, sourceIndex, source.length, beginBhiRowInn, bhiRowInn.length);
  }

  public void setBhiRowInn(char[] source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginBhiRowInn, bhiRowInn.length);
  }

  /**
   * Update BhiRowInn with a char[] from an offset and length to an offset and length
   *
   * @param value
   */
  public void setBhiRowInn(
      char[] source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginBhiRowInn + targetIndex, targetLen);
  }

  /**
   * Update BhiRowInn with another Field
   *
   * @param value
   */
  public void setBhiRowInn(Field source) {
    replace(source, 0, source.length(), beginBhiRowInn, BHI_ROW_INN_LEN);
  }

  /**
   * Update BhiRowInn with another Field from an offset and length
   *
   * @param value
   */
  public void setBhiRowInn(Field source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginBhiRowInn, BHI_ROW_INN_LEN);
  }

  /**
   * Update BhiRowInn with another Field from an offset and length to an offset and length
   *
   * @param value
   */
  public void setBhiRowInn(
      Field source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginBhiRowInn + targetIndex, targetLen);
  }
  /**
   * Returns the value of bhiRowTier
   *
   * @return bhiRowTier
   */
  public char[] getBhiRowTier() throws CFException {
    if (isBhiRowTierModified()) {
      bhiRowTier = refreshBhiRowTier();
    }
    return bhiRowTier;
  }

  /**
   * set variable bhiRowTier Corresponding COBOL Variable is BHI-ROW-TIER
   *
   * @param value
   */
  public void setBhiRowTier(char[] value) {
    bhiRowTier = checkBhiRowTierConstraints(value);
    serializeBhiRowTier(bhiRowTier);
  }

  /**
   * Update BhiRowTier with a char[] from an offset and length
   *
   * @param value
   */
  public void setBhiRowTier(char[] source, int sourceIndex) {
    replace(source, sourceIndex, source.length, beginBhiRowTier, bhiRowTier.length);
  }

  public void setBhiRowTier(char[] source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginBhiRowTier, bhiRowTier.length);
  }

  /**
   * Update BhiRowTier with a char[] from an offset and length to an offset and length
   *
   * @param value
   */
  public void setBhiRowTier(
      char[] source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginBhiRowTier + targetIndex, targetLen);
  }

  /**
   * Update BhiRowTier with another Field
   *
   * @param value
   */
  public void setBhiRowTier(Field source) {
    replace(source, 0, source.length(), beginBhiRowTier, BHI_ROW_TIER_LEN);
  }

  /**
   * Update BhiRowTier with another Field from an offset and length
   *
   * @param value
   */
  public void setBhiRowTier(Field source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginBhiRowTier, BHI_ROW_TIER_LEN);
  }

  /**
   * Update BhiRowTier with another Field from an offset and length to an offset and length
   *
   * @param value
   */
  public void setBhiRowTier(
      Field source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginBhiRowTier + targetIndex, targetLen);
  }
  /**
   * Returns the value of bhiRowLstupdDttm
   *
   * @return bhiRowLstupdDttm
   */
  public char[] getBhiRowLstupdDttm() throws CFException {
    if (isBhiRowLstupdDttmModified()) {
      bhiRowLstupdDttm = refreshBhiRowLstupdDttm();
    }
    return bhiRowLstupdDttm;
  }

  /**
   * set variable bhiRowLstupdDttm Corresponding COBOL Variable is BHI-ROW-LSTUPD-DTTM
   *
   * @param value
   */
  public void setBhiRowLstupdDttm(char[] value) {
    bhiRowLstupdDttm = checkBhiRowLstupdDttmConstraints(value);
    serializeBhiRowLstupdDttm(bhiRowLstupdDttm);
  }

  /**
   * Update BhiRowLstupdDttm with a char[] from an offset and length
   *
   * @param value
   */
  public void setBhiRowLstupdDttm(char[] source, int sourceIndex) {
    replace(source, sourceIndex, source.length, beginBhiRowLstupdDttm, bhiRowLstupdDttm.length);
  }

  public void setBhiRowLstupdDttm(char[] source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginBhiRowLstupdDttm, bhiRowLstupdDttm.length);
  }

  /**
   * Update BhiRowLstupdDttm with a char[] from an offset and length to an offset and length
   *
   * @param value
   */
  public void setBhiRowLstupdDttm(
      char[] source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginBhiRowLstupdDttm + targetIndex, targetLen);
  }

  /**
   * Update BhiRowLstupdDttm with another Field
   *
   * @param value
   */
  public void setBhiRowLstupdDttm(Field source) {
    replace(source, 0, source.length(), beginBhiRowLstupdDttm, BHI_ROW_LSTUPD_DTTM_LEN);
  }

  /**
   * Update BhiRowLstupdDttm with another Field from an offset and length
   *
   * @param value
   */
  public void setBhiRowLstupdDttm(Field source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginBhiRowLstupdDttm, BHI_ROW_LSTUPD_DTTM_LEN);
  }

  /**
   * Update BhiRowLstupdDttm with another Field from an offset and length to an offset and length
   *
   * @param value
   */
  public void setBhiRowLstupdDttm(
      Field source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginBhiRowLstupdDttm + targetIndex, targetLen);
  }
  /**
   * Returns the value of bhiRowLstupdUsrid
   *
   * @return bhiRowLstupdUsrid
   */
  public char[] getBhiRowLstupdUsrid() throws CFException {
    if (isBhiRowLstupdUsridModified()) {
      bhiRowLstupdUsrid = refreshBhiRowLstupdUsrid();
    }
    return bhiRowLstupdUsrid;
  }

  /**
   * set variable bhiRowLstupdUsrid Corresponding COBOL Variable is BHI-ROW-LSTUPD-USRID
   *
   * @param value
   */
  public void setBhiRowLstupdUsrid(char[] value) {
    bhiRowLstupdUsrid = checkBhiRowLstupdUsridConstraints(value);
    serializeBhiRowLstupdUsrid(bhiRowLstupdUsrid);
  }

  /**
   * Update BhiRowLstupdUsrid with a char[] from an offset and length
   *
   * @param value
   */
  public void setBhiRowLstupdUsrid(char[] source, int sourceIndex) {
    replace(source, sourceIndex, source.length, beginBhiRowLstupdUsrid, bhiRowLstupdUsrid.length);
  }

  public void setBhiRowLstupdUsrid(char[] source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginBhiRowLstupdUsrid, bhiRowLstupdUsrid.length);
  }

  /**
   * Update BhiRowLstupdUsrid with a char[] from an offset and length to an offset and length
   *
   * @param value
   */
  public void setBhiRowLstupdUsrid(
      char[] source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginBhiRowLstupdUsrid + targetIndex, targetLen);
  }

  /**
   * Update BhiRowLstupdUsrid with another Field
   *
   * @param value
   */
  public void setBhiRowLstupdUsrid(Field source) {
    replace(source, 0, source.length(), beginBhiRowLstupdUsrid, BHI_ROW_LSTUPD_USRID_LEN);
  }

  /**
   * Update BhiRowLstupdUsrid with another Field from an offset and length
   *
   * @param value
   */
  public void setBhiRowLstupdUsrid(Field source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginBhiRowLstupdUsrid, BHI_ROW_LSTUPD_USRID_LEN);
  }

  /**
   * Update BhiRowLstupdUsrid with another Field from an offset and length to an offset and length
   *
   * @param value
   */
  public void setBhiRowLstupdUsrid(
      Field source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginBhiRowLstupdUsrid + targetIndex, targetLen);
  }
  /**
   * Returns the value of bhiRowStsCd
   *
   * @return bhiRowStsCd
   */
  public char[] getBhiRowStsCd() throws CFException {
    if (isBhiRowStsCdModified()) {
      bhiRowStsCd = refreshBhiRowStsCd();
    }
    return bhiRowStsCd;
  }

  /**
   * set variable bhiRowStsCd Corresponding COBOL Variable is BHI-ROW-STS-CD
   *
   * @param value
   */
  public void setBhiRowStsCd(char[] value) {
    bhiRowStsCd = checkBhiRowStsCdConstraints(value);
    serializeBhiRowStsCd(bhiRowStsCd);
  }

  /**
   * Update BhiRowStsCd with a char[] from an offset and length
   *
   * @param value
   */
  public void setBhiRowStsCd(char[] source, int sourceIndex) {
    replace(source, sourceIndex, source.length, beginBhiRowStsCd, bhiRowStsCd.length);
  }

  public void setBhiRowStsCd(char[] source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginBhiRowStsCd, bhiRowStsCd.length);
  }

  /**
   * Update BhiRowStsCd with a char[] from an offset and length to an offset and length
   *
   * @param value
   */
  public void setBhiRowStsCd(
      char[] source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginBhiRowStsCd + targetIndex, targetLen);
  }

  /**
   * Update BhiRowStsCd with another Field
   *
   * @param value
   */
  public void setBhiRowStsCd(Field source) {
    replace(source, 0, source.length(), beginBhiRowStsCd, BHI_ROW_STS_CD_LEN);
  }

  /**
   * Update BhiRowStsCd with another Field from an offset and length
   *
   * @param value
   */
  public void setBhiRowStsCd(Field source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginBhiRowStsCd, BHI_ROW_STS_CD_LEN);
  }

  /**
   * Update BhiRowStsCd with another Field from an offset and length to an offset and length
   *
   * @param value
   */
  public void setBhiRowStsCd(
      Field source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginBhiRowStsCd + targetIndex, targetLen);
  }
  /**
   * Returns the value of bhiRowProvOrgTypCd
   *
   * @return bhiRowProvOrgTypCd
   */
  public char[] getBhiRowProvOrgTypCd() throws CFException {
    if (isBhiRowProvOrgTypCdModified()) {
      bhiRowProvOrgTypCd = refreshBhiRowProvOrgTypCd();
    }
    return bhiRowProvOrgTypCd;
  }

  /**
   * set variable bhiRowProvOrgTypCd Corresponding COBOL Variable is BHI-ROW-PROV-ORG-TYP-CD
   *
   * @param value
   */
  public void setBhiRowProvOrgTypCd(char[] value) {
    bhiRowProvOrgTypCd = checkBhiRowProvOrgTypCdConstraints(value);
    serializeBhiRowProvOrgTypCd(bhiRowProvOrgTypCd);
  }

  /**
   * Update BhiRowProvOrgTypCd with a char[] from an offset and length
   *
   * @param value
   */
  public void setBhiRowProvOrgTypCd(char[] source, int sourceIndex) {
    replace(source, sourceIndex, source.length, beginBhiRowProvOrgTypCd, bhiRowProvOrgTypCd.length);
  }

  public void setBhiRowProvOrgTypCd(char[] source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginBhiRowProvOrgTypCd, bhiRowProvOrgTypCd.length);
  }

  /**
   * Update BhiRowProvOrgTypCd with a char[] from an offset and length to an offset and length
   *
   * @param value
   */
  public void setBhiRowProvOrgTypCd(
      char[] source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginBhiRowProvOrgTypCd + targetIndex, targetLen);
  }

  /**
   * Update BhiRowProvOrgTypCd with another Field
   *
   * @param value
   */
  public void setBhiRowProvOrgTypCd(Field source) {
    replace(source, 0, source.length(), beginBhiRowProvOrgTypCd, BHI_ROW_PROV_ORG_TYP_CD_LEN);
  }

  /**
   * Update BhiRowProvOrgTypCd with another Field from an offset and length
   *
   * @param value
   */
  public void setBhiRowProvOrgTypCd(Field source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginBhiRowProvOrgTypCd, BHI_ROW_PROV_ORG_TYP_CD_LEN);
  }

  /**
   * Update BhiRowProvOrgTypCd with another Field from an offset and length to an offset and length
   *
   * @param value
   */
  public void setBhiRowProvOrgTypCd(
      Field source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginBhiRowProvOrgTypCd + targetIndex, targetLen);
  }

  public static int getBhiRowNonkeyDataFieldLength() {
    return BHI_ROW_NONKEY_DATA_LENGTH;
  }
}
