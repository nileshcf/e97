package com.cloudframe.app.dto.d5427bhi;

/**
 * The class BhiNonkeyData is used to handle fields declared in it
 *
 * @author CloudFrame Inc. created on 2025-03-25 at 08:32. using version 5.0.0.231
 */
import com.cloudframe.app.data.Field;
import com.cloudframe.app.dto.serialize.d5427bhi.*;
import com.cloudframe.app.exception.CFException;

public class BhiNonkeyData extends BhiNonkeyDataSerialized {

  private char[] bhiStsCd = Field.fillLowValue(1);

  private char[] bhiSrvcCd = Field.fillLowValue(6);

  private char[] bhiPlofsrvcCd = Field.fillLowValue(2);

  private char[] bhiCausCd = Field.fillLowValue(1);

  private char[] bhiBenLvlCd = Field.fillLowValue(1);

  private char[] bhiProcFrom = Field.fillLowValue(7);

  private char[] bhiProcTo = Field.fillLowValue(7);

  private char[] bhiProcType = Field.fillLowValue(1);

  private char[] bhiInn = Field.fillLowValue(1);

  private char[] bhiTier = Field.fillLowValue(1);

  private char[] bhiLstupdUsrid = Field.fillLowValue(9);

  private char[] bhiProvOrgTypCd = Field.fillLowValue(3);

  /** Constructor for BhiNonkeyData */
  public BhiNonkeyData() {
    // TO-DO auto generated code
  }

  /**
   * Constructor for BhiNonkeyData. sets the parent value to the parent
   *
   * @param parent
   * @param begin
   */
  public BhiNonkeyData(Field parent, int begin) {
    setParent(parent, begin);
  }

  /**
   * Returns the value of bhiStsCd
   *
   * @return bhiStsCd
   */
  public char[] getBhiStsCd() throws CFException {
    if (isBhiStsCdModified()) {
      bhiStsCd = refreshBhiStsCd();
    }
    return bhiStsCd;
  }

  /**
   * set variable bhiStsCd Corresponding COBOL Variable is WS-BHI-STS-CD
   *
   * @param value
   */
  public void setBhiStsCd(char[] value) {
    bhiStsCd = checkBhiStsCdConstraints(value);
    serializeBhiStsCd(bhiStsCd);
  }

  /**
   * Update BhiStsCd with a char[] from an offset and length
   *
   * @param value
   */
  public void setBhiStsCd(char[] source, int sourceIndex) {
    replace(source, sourceIndex, source.length, beginBhiStsCd, bhiStsCd.length);
  }

  public void setBhiStsCd(char[] source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginBhiStsCd, bhiStsCd.length);
  }

  /**
   * Update BhiStsCd with a char[] from an offset and length to an offset and length
   *
   * @param value
   */
  public void setBhiStsCd(
      char[] source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginBhiStsCd + targetIndex, targetLen);
  }

  /**
   * Update BhiStsCd with another Field
   *
   * @param value
   */
  public void setBhiStsCd(Field source) {
    replace(source, 0, source.length(), beginBhiStsCd, BHI_STS_CD_LEN);
  }

  /**
   * Update BhiStsCd with another Field from an offset and length
   *
   * @param value
   */
  public void setBhiStsCd(Field source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginBhiStsCd, BHI_STS_CD_LEN);
  }

  /**
   * Update BhiStsCd with another Field from an offset and length to an offset and length
   *
   * @param value
   */
  public void setBhiStsCd(
      Field source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginBhiStsCd + targetIndex, targetLen);
  }
  /**
   * Returns the value of bhiSrvcCd
   *
   * @return bhiSrvcCd
   */
  public char[] getBhiSrvcCd() throws CFException {
    if (isBhiSrvcCdModified()) {
      bhiSrvcCd = refreshBhiSrvcCd();
    }
    return bhiSrvcCd;
  }

  /**
   * set variable bhiSrvcCd Corresponding COBOL Variable is WS-BHI-SRVC-CD
   *
   * @param value
   */
  public void setBhiSrvcCd(char[] value) {
    bhiSrvcCd = checkBhiSrvcCdConstraints(value);
    serializeBhiSrvcCd(bhiSrvcCd);
  }

  /**
   * Update BhiSrvcCd with a char[] from an offset and length
   *
   * @param value
   */
  public void setBhiSrvcCd(char[] source, int sourceIndex) {
    replace(source, sourceIndex, source.length, beginBhiSrvcCd, bhiSrvcCd.length);
  }

  public void setBhiSrvcCd(char[] source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginBhiSrvcCd, bhiSrvcCd.length);
  }

  /**
   * Update BhiSrvcCd with a char[] from an offset and length to an offset and length
   *
   * @param value
   */
  public void setBhiSrvcCd(
      char[] source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginBhiSrvcCd + targetIndex, targetLen);
  }

  /**
   * Update BhiSrvcCd with another Field
   *
   * @param value
   */
  public void setBhiSrvcCd(Field source) {
    replace(source, 0, source.length(), beginBhiSrvcCd, BHI_SRVC_CD_LEN);
  }

  /**
   * Update BhiSrvcCd with another Field from an offset and length
   *
   * @param value
   */
  public void setBhiSrvcCd(Field source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginBhiSrvcCd, BHI_SRVC_CD_LEN);
  }

  /**
   * Update BhiSrvcCd with another Field from an offset and length to an offset and length
   *
   * @param value
   */
  public void setBhiSrvcCd(
      Field source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginBhiSrvcCd + targetIndex, targetLen);
  }
  /**
   * Returns the value of bhiPlofsrvcCd
   *
   * @return bhiPlofsrvcCd
   */
  public char[] getBhiPlofsrvcCd() throws CFException {
    if (isBhiPlofsrvcCdModified()) {
      bhiPlofsrvcCd = refreshBhiPlofsrvcCd();
    }
    return bhiPlofsrvcCd;
  }

  /**
   * set variable bhiPlofsrvcCd Corresponding COBOL Variable is WS-BHI-PLOFSRVC-CD
   *
   * @param value
   */
  public void setBhiPlofsrvcCd(char[] value) {
    bhiPlofsrvcCd = checkBhiPlofsrvcCdConstraints(value);
    serializeBhiPlofsrvcCd(bhiPlofsrvcCd);
  }

  /**
   * Update BhiPlofsrvcCd with a char[] from an offset and length
   *
   * @param value
   */
  public void setBhiPlofsrvcCd(char[] source, int sourceIndex) {
    replace(source, sourceIndex, source.length, beginBhiPlofsrvcCd, bhiPlofsrvcCd.length);
  }

  public void setBhiPlofsrvcCd(char[] source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginBhiPlofsrvcCd, bhiPlofsrvcCd.length);
  }

  /**
   * Update BhiPlofsrvcCd with a char[] from an offset and length to an offset and length
   *
   * @param value
   */
  public void setBhiPlofsrvcCd(
      char[] source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginBhiPlofsrvcCd + targetIndex, targetLen);
  }

  /**
   * Update BhiPlofsrvcCd with another Field
   *
   * @param value
   */
  public void setBhiPlofsrvcCd(Field source) {
    replace(source, 0, source.length(), beginBhiPlofsrvcCd, BHI_PLOFSRVC_CD_LEN);
  }

  /**
   * Update BhiPlofsrvcCd with another Field from an offset and length
   *
   * @param value
   */
  public void setBhiPlofsrvcCd(Field source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginBhiPlofsrvcCd, BHI_PLOFSRVC_CD_LEN);
  }

  /**
   * Update BhiPlofsrvcCd with another Field from an offset and length to an offset and length
   *
   * @param value
   */
  public void setBhiPlofsrvcCd(
      Field source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginBhiPlofsrvcCd + targetIndex, targetLen);
  }
  /**
   * Returns the value of bhiCausCd
   *
   * @return bhiCausCd
   */
  public char[] getBhiCausCd() throws CFException {
    if (isBhiCausCdModified()) {
      bhiCausCd = refreshBhiCausCd();
    }
    return bhiCausCd;
  }

  /**
   * set variable bhiCausCd Corresponding COBOL Variable is WS-BHI-CAUS-CD
   *
   * @param value
   */
  public void setBhiCausCd(char[] value) {
    bhiCausCd = checkBhiCausCdConstraints(value);
    serializeBhiCausCd(bhiCausCd);
  }

  /**
   * Update BhiCausCd with a char[] from an offset and length
   *
   * @param value
   */
  public void setBhiCausCd(char[] source, int sourceIndex) {
    replace(source, sourceIndex, source.length, beginBhiCausCd, bhiCausCd.length);
  }

  public void setBhiCausCd(char[] source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginBhiCausCd, bhiCausCd.length);
  }

  /**
   * Update BhiCausCd with a char[] from an offset and length to an offset and length
   *
   * @param value
   */
  public void setBhiCausCd(
      char[] source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginBhiCausCd + targetIndex, targetLen);
  }

  /**
   * Update BhiCausCd with another Field
   *
   * @param value
   */
  public void setBhiCausCd(Field source) {
    replace(source, 0, source.length(), beginBhiCausCd, BHI_CAUS_CD_LEN);
  }

  /**
   * Update BhiCausCd with another Field from an offset and length
   *
   * @param value
   */
  public void setBhiCausCd(Field source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginBhiCausCd, BHI_CAUS_CD_LEN);
  }

  /**
   * Update BhiCausCd with another Field from an offset and length to an offset and length
   *
   * @param value
   */
  public void setBhiCausCd(
      Field source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginBhiCausCd + targetIndex, targetLen);
  }
  /**
   * Returns the value of bhiBenLvlCd
   *
   * @return bhiBenLvlCd
   */
  public char[] getBhiBenLvlCd() throws CFException {
    if (isBhiBenLvlCdModified()) {
      bhiBenLvlCd = refreshBhiBenLvlCd();
    }
    return bhiBenLvlCd;
  }

  /**
   * set variable bhiBenLvlCd Corresponding COBOL Variable is WS-BHI-BEN-LVL-CD
   *
   * @param value
   */
  public void setBhiBenLvlCd(char[] value) {
    bhiBenLvlCd = checkBhiBenLvlCdConstraints(value);
    serializeBhiBenLvlCd(bhiBenLvlCd);
  }

  /**
   * Update BhiBenLvlCd with a char[] from an offset and length
   *
   * @param value
   */
  public void setBhiBenLvlCd(char[] source, int sourceIndex) {
    replace(source, sourceIndex, source.length, beginBhiBenLvlCd, bhiBenLvlCd.length);
  }

  public void setBhiBenLvlCd(char[] source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginBhiBenLvlCd, bhiBenLvlCd.length);
  }

  /**
   * Update BhiBenLvlCd with a char[] from an offset and length to an offset and length
   *
   * @param value
   */
  public void setBhiBenLvlCd(
      char[] source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginBhiBenLvlCd + targetIndex, targetLen);
  }

  /**
   * Update BhiBenLvlCd with another Field
   *
   * @param value
   */
  public void setBhiBenLvlCd(Field source) {
    replace(source, 0, source.length(), beginBhiBenLvlCd, BHI_BEN_LVL_CD_LEN);
  }

  /**
   * Update BhiBenLvlCd with another Field from an offset and length
   *
   * @param value
   */
  public void setBhiBenLvlCd(Field source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginBhiBenLvlCd, BHI_BEN_LVL_CD_LEN);
  }

  /**
   * Update BhiBenLvlCd with another Field from an offset and length to an offset and length
   *
   * @param value
   */
  public void setBhiBenLvlCd(
      Field source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginBhiBenLvlCd + targetIndex, targetLen);
  }
  /**
   * Returns the value of bhiProcFrom
   *
   * @return bhiProcFrom
   */
  public char[] getBhiProcFrom() throws CFException {
    if (isBhiProcFromModified()) {
      bhiProcFrom = refreshBhiProcFrom();
    }
    return bhiProcFrom;
  }

  /**
   * set variable bhiProcFrom Corresponding COBOL Variable is WS-BHI-PROC-FROM
   *
   * @param value
   */
  public void setBhiProcFrom(char[] value) {
    bhiProcFrom = checkBhiProcFromConstraints(value);
    serializeBhiProcFrom(bhiProcFrom);
  }

  /**
   * Update BhiProcFrom with a char[] from an offset and length
   *
   * @param value
   */
  public void setBhiProcFrom(char[] source, int sourceIndex) {
    replace(source, sourceIndex, source.length, beginBhiProcFrom, bhiProcFrom.length);
  }

  public void setBhiProcFrom(char[] source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginBhiProcFrom, bhiProcFrom.length);
  }

  /**
   * Update BhiProcFrom with a char[] from an offset and length to an offset and length
   *
   * @param value
   */
  public void setBhiProcFrom(
      char[] source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginBhiProcFrom + targetIndex, targetLen);
  }

  /**
   * Update BhiProcFrom with another Field
   *
   * @param value
   */
  public void setBhiProcFrom(Field source) {
    replace(source, 0, source.length(), beginBhiProcFrom, BHI_PROC_FROM_LEN);
  }

  /**
   * Update BhiProcFrom with another Field from an offset and length
   *
   * @param value
   */
  public void setBhiProcFrom(Field source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginBhiProcFrom, BHI_PROC_FROM_LEN);
  }

  /**
   * Update BhiProcFrom with another Field from an offset and length to an offset and length
   *
   * @param value
   */
  public void setBhiProcFrom(
      Field source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginBhiProcFrom + targetIndex, targetLen);
  }
  /**
   * Returns the value of bhiProcTo
   *
   * @return bhiProcTo
   */
  public char[] getBhiProcTo() throws CFException {
    if (isBhiProcToModified()) {
      bhiProcTo = refreshBhiProcTo();
    }
    return bhiProcTo;
  }

  /**
   * set variable bhiProcTo Corresponding COBOL Variable is WS-BHI-PROC-TO
   *
   * @param value
   */
  public void setBhiProcTo(char[] value) {
    bhiProcTo = checkBhiProcToConstraints(value);
    serializeBhiProcTo(bhiProcTo);
  }

  /**
   * Update BhiProcTo with a char[] from an offset and length
   *
   * @param value
   */
  public void setBhiProcTo(char[] source, int sourceIndex) {
    replace(source, sourceIndex, source.length, beginBhiProcTo, bhiProcTo.length);
  }

  public void setBhiProcTo(char[] source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginBhiProcTo, bhiProcTo.length);
  }

  /**
   * Update BhiProcTo with a char[] from an offset and length to an offset and length
   *
   * @param value
   */
  public void setBhiProcTo(
      char[] source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginBhiProcTo + targetIndex, targetLen);
  }

  /**
   * Update BhiProcTo with another Field
   *
   * @param value
   */
  public void setBhiProcTo(Field source) {
    replace(source, 0, source.length(), beginBhiProcTo, BHI_PROC_TO_LEN);
  }

  /**
   * Update BhiProcTo with another Field from an offset and length
   *
   * @param value
   */
  public void setBhiProcTo(Field source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginBhiProcTo, BHI_PROC_TO_LEN);
  }

  /**
   * Update BhiProcTo with another Field from an offset and length to an offset and length
   *
   * @param value
   */
  public void setBhiProcTo(
      Field source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginBhiProcTo + targetIndex, targetLen);
  }
  /**
   * Returns the value of bhiProcType
   *
   * @return bhiProcType
   */
  public char[] getBhiProcType() throws CFException {
    if (isBhiProcTypeModified()) {
      bhiProcType = refreshBhiProcType();
    }
    return bhiProcType;
  }

  /**
   * set variable bhiProcType Corresponding COBOL Variable is WS-BHI-PROC-TYPE
   *
   * @param value
   */
  public void setBhiProcType(char[] value) {
    bhiProcType = checkBhiProcTypeConstraints(value);
    serializeBhiProcType(bhiProcType);
  }

  /**
   * Update BhiProcType with a char[] from an offset and length
   *
   * @param value
   */
  public void setBhiProcType(char[] source, int sourceIndex) {
    replace(source, sourceIndex, source.length, beginBhiProcType, bhiProcType.length);
  }

  public void setBhiProcType(char[] source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginBhiProcType, bhiProcType.length);
  }

  /**
   * Update BhiProcType with a char[] from an offset and length to an offset and length
   *
   * @param value
   */
  public void setBhiProcType(
      char[] source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginBhiProcType + targetIndex, targetLen);
  }

  /**
   * Update BhiProcType with another Field
   *
   * @param value
   */
  public void setBhiProcType(Field source) {
    replace(source, 0, source.length(), beginBhiProcType, BHI_PROC_TYPE_LEN);
  }

  /**
   * Update BhiProcType with another Field from an offset and length
   *
   * @param value
   */
  public void setBhiProcType(Field source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginBhiProcType, BHI_PROC_TYPE_LEN);
  }

  /**
   * Update BhiProcType with another Field from an offset and length to an offset and length
   *
   * @param value
   */
  public void setBhiProcType(
      Field source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginBhiProcType + targetIndex, targetLen);
  }
  /**
   * Returns the value of bhiInn
   *
   * @return bhiInn
   */
  public char[] getBhiInn() throws CFException {
    if (isBhiInnModified()) {
      bhiInn = refreshBhiInn();
    }
    return bhiInn;
  }

  /**
   * set variable bhiInn Corresponding COBOL Variable is WS-BHI-INN
   *
   * @param value
   */
  public void setBhiInn(char[] value) {
    bhiInn = checkBhiInnConstraints(value);
    serializeBhiInn(bhiInn);
  }

  /**
   * Update BhiInn with a char[] from an offset and length
   *
   * @param value
   */
  public void setBhiInn(char[] source, int sourceIndex) {
    replace(source, sourceIndex, source.length, beginBhiInn, bhiInn.length);
  }

  public void setBhiInn(char[] source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginBhiInn, bhiInn.length);
  }

  /**
   * Update BhiInn with a char[] from an offset and length to an offset and length
   *
   * @param value
   */
  public void setBhiInn(
      char[] source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginBhiInn + targetIndex, targetLen);
  }

  /**
   * Update BhiInn with another Field
   *
   * @param value
   */
  public void setBhiInn(Field source) {
    replace(source, 0, source.length(), beginBhiInn, BHI_INN_LEN);
  }

  /**
   * Update BhiInn with another Field from an offset and length
   *
   * @param value
   */
  public void setBhiInn(Field source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginBhiInn, BHI_INN_LEN);
  }

  /**
   * Update BhiInn with another Field from an offset and length to an offset and length
   *
   * @param value
   */
  public void setBhiInn(
      Field source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginBhiInn + targetIndex, targetLen);
  }
  /**
   * Returns the value of bhiTier
   *
   * @return bhiTier
   */
  public char[] getBhiTier() throws CFException {
    if (isBhiTierModified()) {
      bhiTier = refreshBhiTier();
    }
    return bhiTier;
  }

  /**
   * set variable bhiTier Corresponding COBOL Variable is WS-BHI-TIER
   *
   * @param value
   */
  public void setBhiTier(char[] value) {
    bhiTier = checkBhiTierConstraints(value);
    serializeBhiTier(bhiTier);
  }

  /**
   * Update BhiTier with a char[] from an offset and length
   *
   * @param value
   */
  public void setBhiTier(char[] source, int sourceIndex) {
    replace(source, sourceIndex, source.length, beginBhiTier, bhiTier.length);
  }

  public void setBhiTier(char[] source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginBhiTier, bhiTier.length);
  }

  /**
   * Update BhiTier with a char[] from an offset and length to an offset and length
   *
   * @param value
   */
  public void setBhiTier(
      char[] source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginBhiTier + targetIndex, targetLen);
  }

  /**
   * Update BhiTier with another Field
   *
   * @param value
   */
  public void setBhiTier(Field source) {
    replace(source, 0, source.length(), beginBhiTier, BHI_TIER_LEN);
  }

  /**
   * Update BhiTier with another Field from an offset and length
   *
   * @param value
   */
  public void setBhiTier(Field source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginBhiTier, BHI_TIER_LEN);
  }

  /**
   * Update BhiTier with another Field from an offset and length to an offset and length
   *
   * @param value
   */
  public void setBhiTier(
      Field source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginBhiTier + targetIndex, targetLen);
  }
  /**
   * Returns the value of bhiLstupdUsrid
   *
   * @return bhiLstupdUsrid
   */
  public char[] getBhiLstupdUsrid() throws CFException {
    if (isBhiLstupdUsridModified()) {
      bhiLstupdUsrid = refreshBhiLstupdUsrid();
    }
    return bhiLstupdUsrid;
  }

  /**
   * set variable bhiLstupdUsrid Corresponding COBOL Variable is WS-BHI-LSTUPD-USRID
   *
   * @param value
   */
  public void setBhiLstupdUsrid(char[] value) {
    bhiLstupdUsrid = checkBhiLstupdUsridConstraints(value);
    serializeBhiLstupdUsrid(bhiLstupdUsrid);
  }

  /**
   * Update BhiLstupdUsrid with a char[] from an offset and length
   *
   * @param value
   */
  public void setBhiLstupdUsrid(char[] source, int sourceIndex) {
    replace(source, sourceIndex, source.length, beginBhiLstupdUsrid, bhiLstupdUsrid.length);
  }

  public void setBhiLstupdUsrid(char[] source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginBhiLstupdUsrid, bhiLstupdUsrid.length);
  }

  /**
   * Update BhiLstupdUsrid with a char[] from an offset and length to an offset and length
   *
   * @param value
   */
  public void setBhiLstupdUsrid(
      char[] source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginBhiLstupdUsrid + targetIndex, targetLen);
  }

  /**
   * Update BhiLstupdUsrid with another Field
   *
   * @param value
   */
  public void setBhiLstupdUsrid(Field source) {
    replace(source, 0, source.length(), beginBhiLstupdUsrid, BHI_LSTUPD_USRID_LEN);
  }

  /**
   * Update BhiLstupdUsrid with another Field from an offset and length
   *
   * @param value
   */
  public void setBhiLstupdUsrid(Field source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginBhiLstupdUsrid, BHI_LSTUPD_USRID_LEN);
  }

  /**
   * Update BhiLstupdUsrid with another Field from an offset and length to an offset and length
   *
   * @param value
   */
  public void setBhiLstupdUsrid(
      Field source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginBhiLstupdUsrid + targetIndex, targetLen);
  }
  /**
   * Returns the value of bhiProvOrgTypCd
   *
   * @return bhiProvOrgTypCd
   */
  public char[] getBhiProvOrgTypCd() throws CFException {
    if (isBhiProvOrgTypCdModified()) {
      bhiProvOrgTypCd = refreshBhiProvOrgTypCd();
    }
    return bhiProvOrgTypCd;
  }

  /**
   * set variable bhiProvOrgTypCd Corresponding COBOL Variable is WS-BHI-PROV-ORG-TYP-CD
   *
   * @param value
   */
  public void setBhiProvOrgTypCd(char[] value) {
    bhiProvOrgTypCd = checkBhiProvOrgTypCdConstraints(value);
    serializeBhiProvOrgTypCd(bhiProvOrgTypCd);
  }

  /**
   * Update BhiProvOrgTypCd with a char[] from an offset and length
   *
   * @param value
   */
  public void setBhiProvOrgTypCd(char[] source, int sourceIndex) {
    replace(source, sourceIndex, source.length, beginBhiProvOrgTypCd, bhiProvOrgTypCd.length);
  }

  public void setBhiProvOrgTypCd(char[] source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginBhiProvOrgTypCd, bhiProvOrgTypCd.length);
  }

  /**
   * Update BhiProvOrgTypCd with a char[] from an offset and length to an offset and length
   *
   * @param value
   */
  public void setBhiProvOrgTypCd(
      char[] source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginBhiProvOrgTypCd + targetIndex, targetLen);
  }

  /**
   * Update BhiProvOrgTypCd with another Field
   *
   * @param value
   */
  public void setBhiProvOrgTypCd(Field source) {
    replace(source, 0, source.length(), beginBhiProvOrgTypCd, BHI_PROV_ORG_TYP_CD_LEN);
  }

  /**
   * Update BhiProvOrgTypCd with another Field from an offset and length
   *
   * @param value
   */
  public void setBhiProvOrgTypCd(Field source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginBhiProvOrgTypCd, BHI_PROV_ORG_TYP_CD_LEN);
  }

  /**
   * Update BhiProvOrgTypCd with another Field from an offset and length to an offset and length
   *
   * @param value
   */
  public void setBhiProvOrgTypCd(
      Field source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginBhiProvOrgTypCd + targetIndex, targetLen);
  }

  public static int getBhiNonkeyDataFieldLength() {
    return BHI_NONKEY_DATA_LENGTH;
  }
}
