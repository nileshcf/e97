package com.cloudframe.app.dto.d5427bhi;

/**
 * The class BhiReqRowNonkeyData is used to handle fields declared in it
 *
 * @author CloudFrame Inc. created on 2025-03-25 at 08:32. using version 5.0.0.231
 */
import com.cloudframe.app.data.Field;
import com.cloudframe.app.dto.serialize.d5427bhi.*;
import com.cloudframe.app.exception.CFException;

public class BhiReqRowNonkeyData extends BhiReqRowNonkeyDataSerialized {

  private char[] bhiReqRowSrvcCd = Field.fillLowValue(6);

  private char[] bhiReqRowPlofsrvcCd = Field.fillLowValue(2);

  private char[] bhiReqRowCausCd = Field.fillLowValue(1);

  private char[] bhiReqRowBenLvlCd = Field.fillLowValue(1);

  private char[] bhiReqRowProcFrom = Field.fillLowValue(7);

  private char[] bhiReqRowProcTo = Field.fillLowValue(7);

  private char[] bhiReqRowProcType = Field.fillLowValue(1);

  private char[] bhiReqRowInn = Field.fillLowValue(1);

  private char[] bhiReqRowTier = Field.fillLowValue(1);

  private char[] bhiReqRowLstupdUsrid = Field.fillLowValue(6);

  private char[] bhiReqRowLstupdDttm = Field.fillLowValue(26);

  private char[] bhiReqRowStsCd = Field.fillLowValue(1);

  private char[] bhiReqRowProvOrgTypCd = Field.fillLowValue(3);

  /** Constructor for BhiReqRowNonkeyData */
  public BhiReqRowNonkeyData() {
    // TO-DO auto generated code
  }

  /**
   * Constructor for BhiReqRowNonkeyData. sets the parent value to the parent
   *
   * @param parent
   * @param begin
   */
  public BhiReqRowNonkeyData(Field parent, int begin) {
    setParent(parent, begin);
  }

  /**
   * Returns the value of bhiReqRowSrvcCd
   *
   * @return bhiReqRowSrvcCd
   */
  public char[] getBhiReqRowSrvcCd() throws CFException {
    if (isBhiReqRowSrvcCdModified()) {
      bhiReqRowSrvcCd = refreshBhiReqRowSrvcCd();
    }
    return bhiReqRowSrvcCd;
  }

  /**
   * set variable bhiReqRowSrvcCd Corresponding COBOL Variable is BHI-REQ-ROW-SRVC-CD
   *
   * @param value
   */
  public void setBhiReqRowSrvcCd(char[] value) {
    bhiReqRowSrvcCd = checkBhiReqRowSrvcCdConstraints(value);
    serializeBhiReqRowSrvcCd(bhiReqRowSrvcCd);
  }

  /**
   * Update BhiReqRowSrvcCd with a char[] from an offset and length
   *
   * @param value
   */
  public void setBhiReqRowSrvcCd(char[] source, int sourceIndex) {
    replace(source, sourceIndex, source.length, beginBhiReqRowSrvcCd, bhiReqRowSrvcCd.length);
  }

  public void setBhiReqRowSrvcCd(char[] source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginBhiReqRowSrvcCd, bhiReqRowSrvcCd.length);
  }

  /**
   * Update BhiReqRowSrvcCd with a char[] from an offset and length to an offset and length
   *
   * @param value
   */
  public void setBhiReqRowSrvcCd(
      char[] source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginBhiReqRowSrvcCd + targetIndex, targetLen);
  }

  /**
   * Update BhiReqRowSrvcCd with another Field
   *
   * @param value
   */
  public void setBhiReqRowSrvcCd(Field source) {
    replace(source, 0, source.length(), beginBhiReqRowSrvcCd, BHI_REQ_ROW_SRVC_CD_LEN);
  }

  /**
   * Update BhiReqRowSrvcCd with another Field from an offset and length
   *
   * @param value
   */
  public void setBhiReqRowSrvcCd(Field source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginBhiReqRowSrvcCd, BHI_REQ_ROW_SRVC_CD_LEN);
  }

  /**
   * Update BhiReqRowSrvcCd with another Field from an offset and length to an offset and length
   *
   * @param value
   */
  public void setBhiReqRowSrvcCd(
      Field source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginBhiReqRowSrvcCd + targetIndex, targetLen);
  }
  /**
   * Returns the value of bhiReqRowPlofsrvcCd
   *
   * @return bhiReqRowPlofsrvcCd
   */
  public char[] getBhiReqRowPlofsrvcCd() throws CFException {
    if (isBhiReqRowPlofsrvcCdModified()) {
      bhiReqRowPlofsrvcCd = refreshBhiReqRowPlofsrvcCd();
    }
    return bhiReqRowPlofsrvcCd;
  }

  /**
   * set variable bhiReqRowPlofsrvcCd Corresponding COBOL Variable is BHI-REQ-ROW-PLOFSRVC-CD
   *
   * @param value
   */
  public void setBhiReqRowPlofsrvcCd(char[] value) {
    bhiReqRowPlofsrvcCd = checkBhiReqRowPlofsrvcCdConstraints(value);
    serializeBhiReqRowPlofsrvcCd(bhiReqRowPlofsrvcCd);
  }

  /**
   * Update BhiReqRowPlofsrvcCd with a char[] from an offset and length
   *
   * @param value
   */
  public void setBhiReqRowPlofsrvcCd(char[] source, int sourceIndex) {
    replace(
        source, sourceIndex, source.length, beginBhiReqRowPlofsrvcCd, bhiReqRowPlofsrvcCd.length);
  }

  public void setBhiReqRowPlofsrvcCd(char[] source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginBhiReqRowPlofsrvcCd, bhiReqRowPlofsrvcCd.length);
  }

  /**
   * Update BhiReqRowPlofsrvcCd with a char[] from an offset and length to an offset and length
   *
   * @param value
   */
  public void setBhiReqRowPlofsrvcCd(
      char[] source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginBhiReqRowPlofsrvcCd + targetIndex, targetLen);
  }

  /**
   * Update BhiReqRowPlofsrvcCd with another Field
   *
   * @param value
   */
  public void setBhiReqRowPlofsrvcCd(Field source) {
    replace(source, 0, source.length(), beginBhiReqRowPlofsrvcCd, BHI_REQ_ROW_PLOFSRVC_CD_LEN);
  }

  /**
   * Update BhiReqRowPlofsrvcCd with another Field from an offset and length
   *
   * @param value
   */
  public void setBhiReqRowPlofsrvcCd(Field source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginBhiReqRowPlofsrvcCd, BHI_REQ_ROW_PLOFSRVC_CD_LEN);
  }

  /**
   * Update BhiReqRowPlofsrvcCd with another Field from an offset and length to an offset and length
   *
   * @param value
   */
  public void setBhiReqRowPlofsrvcCd(
      Field source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginBhiReqRowPlofsrvcCd + targetIndex, targetLen);
  }
  /**
   * Returns the value of bhiReqRowCausCd
   *
   * @return bhiReqRowCausCd
   */
  public char[] getBhiReqRowCausCd() throws CFException {
    if (isBhiReqRowCausCdModified()) {
      bhiReqRowCausCd = refreshBhiReqRowCausCd();
    }
    return bhiReqRowCausCd;
  }

  /**
   * set variable bhiReqRowCausCd Corresponding COBOL Variable is BHI-REQ-ROW-CAUS-CD
   *
   * @param value
   */
  public void setBhiReqRowCausCd(char[] value) {
    bhiReqRowCausCd = checkBhiReqRowCausCdConstraints(value);
    serializeBhiReqRowCausCd(bhiReqRowCausCd);
  }

  /**
   * Update BhiReqRowCausCd with a char[] from an offset and length
   *
   * @param value
   */
  public void setBhiReqRowCausCd(char[] source, int sourceIndex) {
    replace(source, sourceIndex, source.length, beginBhiReqRowCausCd, bhiReqRowCausCd.length);
  }

  public void setBhiReqRowCausCd(char[] source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginBhiReqRowCausCd, bhiReqRowCausCd.length);
  }

  /**
   * Update BhiReqRowCausCd with a char[] from an offset and length to an offset and length
   *
   * @param value
   */
  public void setBhiReqRowCausCd(
      char[] source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginBhiReqRowCausCd + targetIndex, targetLen);
  }

  /**
   * Update BhiReqRowCausCd with another Field
   *
   * @param value
   */
  public void setBhiReqRowCausCd(Field source) {
    replace(source, 0, source.length(), beginBhiReqRowCausCd, BHI_REQ_ROW_CAUS_CD_LEN);
  }

  /**
   * Update BhiReqRowCausCd with another Field from an offset and length
   *
   * @param value
   */
  public void setBhiReqRowCausCd(Field source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginBhiReqRowCausCd, BHI_REQ_ROW_CAUS_CD_LEN);
  }

  /**
   * Update BhiReqRowCausCd with another Field from an offset and length to an offset and length
   *
   * @param value
   */
  public void setBhiReqRowCausCd(
      Field source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginBhiReqRowCausCd + targetIndex, targetLen);
  }
  /**
   * Returns the value of bhiReqRowBenLvlCd
   *
   * @return bhiReqRowBenLvlCd
   */
  public char[] getBhiReqRowBenLvlCd() throws CFException {
    if (isBhiReqRowBenLvlCdModified()) {
      bhiReqRowBenLvlCd = refreshBhiReqRowBenLvlCd();
    }
    return bhiReqRowBenLvlCd;
  }

  /**
   * set variable bhiReqRowBenLvlCd Corresponding COBOL Variable is BHI-REQ-ROW-BEN-LVL-CD
   *
   * @param value
   */
  public void setBhiReqRowBenLvlCd(char[] value) {
    bhiReqRowBenLvlCd = checkBhiReqRowBenLvlCdConstraints(value);
    serializeBhiReqRowBenLvlCd(bhiReqRowBenLvlCd);
  }

  /**
   * Update BhiReqRowBenLvlCd with a char[] from an offset and length
   *
   * @param value
   */
  public void setBhiReqRowBenLvlCd(char[] source, int sourceIndex) {
    replace(source, sourceIndex, source.length, beginBhiReqRowBenLvlCd, bhiReqRowBenLvlCd.length);
  }

  public void setBhiReqRowBenLvlCd(char[] source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginBhiReqRowBenLvlCd, bhiReqRowBenLvlCd.length);
  }

  /**
   * Update BhiReqRowBenLvlCd with a char[] from an offset and length to an offset and length
   *
   * @param value
   */
  public void setBhiReqRowBenLvlCd(
      char[] source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginBhiReqRowBenLvlCd + targetIndex, targetLen);
  }

  /**
   * Update BhiReqRowBenLvlCd with another Field
   *
   * @param value
   */
  public void setBhiReqRowBenLvlCd(Field source) {
    replace(source, 0, source.length(), beginBhiReqRowBenLvlCd, BHI_REQ_ROW_BEN_LVL_CD_LEN);
  }

  /**
   * Update BhiReqRowBenLvlCd with another Field from an offset and length
   *
   * @param value
   */
  public void setBhiReqRowBenLvlCd(Field source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginBhiReqRowBenLvlCd, BHI_REQ_ROW_BEN_LVL_CD_LEN);
  }

  /**
   * Update BhiReqRowBenLvlCd with another Field from an offset and length to an offset and length
   *
   * @param value
   */
  public void setBhiReqRowBenLvlCd(
      Field source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginBhiReqRowBenLvlCd + targetIndex, targetLen);
  }
  /**
   * Returns the value of bhiReqRowProcFrom
   *
   * @return bhiReqRowProcFrom
   */
  public char[] getBhiReqRowProcFrom() throws CFException {
    if (isBhiReqRowProcFromModified()) {
      bhiReqRowProcFrom = refreshBhiReqRowProcFrom();
    }
    return bhiReqRowProcFrom;
  }

  /**
   * set variable bhiReqRowProcFrom Corresponding COBOL Variable is BHI-REQ-ROW-PROC-FROM
   *
   * @param value
   */
  public void setBhiReqRowProcFrom(char[] value) {
    bhiReqRowProcFrom = checkBhiReqRowProcFromConstraints(value);
    serializeBhiReqRowProcFrom(bhiReqRowProcFrom);
  }

  /**
   * Update BhiReqRowProcFrom with a char[] from an offset and length
   *
   * @param value
   */
  public void setBhiReqRowProcFrom(char[] source, int sourceIndex) {
    replace(source, sourceIndex, source.length, beginBhiReqRowProcFrom, bhiReqRowProcFrom.length);
  }

  public void setBhiReqRowProcFrom(char[] source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginBhiReqRowProcFrom, bhiReqRowProcFrom.length);
  }

  /**
   * Update BhiReqRowProcFrom with a char[] from an offset and length to an offset and length
   *
   * @param value
   */
  public void setBhiReqRowProcFrom(
      char[] source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginBhiReqRowProcFrom + targetIndex, targetLen);
  }

  /**
   * Update BhiReqRowProcFrom with another Field
   *
   * @param value
   */
  public void setBhiReqRowProcFrom(Field source) {
    replace(source, 0, source.length(), beginBhiReqRowProcFrom, BHI_REQ_ROW_PROC_FROM_LEN);
  }

  /**
   * Update BhiReqRowProcFrom with another Field from an offset and length
   *
   * @param value
   */
  public void setBhiReqRowProcFrom(Field source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginBhiReqRowProcFrom, BHI_REQ_ROW_PROC_FROM_LEN);
  }

  /**
   * Update BhiReqRowProcFrom with another Field from an offset and length to an offset and length
   *
   * @param value
   */
  public void setBhiReqRowProcFrom(
      Field source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginBhiReqRowProcFrom + targetIndex, targetLen);
  }
  /**
   * Returns the value of bhiReqRowProcTo
   *
   * @return bhiReqRowProcTo
   */
  public char[] getBhiReqRowProcTo() throws CFException {
    if (isBhiReqRowProcToModified()) {
      bhiReqRowProcTo = refreshBhiReqRowProcTo();
    }
    return bhiReqRowProcTo;
  }

  /**
   * set variable bhiReqRowProcTo Corresponding COBOL Variable is BHI-REQ-ROW-PROC-TO
   *
   * @param value
   */
  public void setBhiReqRowProcTo(char[] value) {
    bhiReqRowProcTo = checkBhiReqRowProcToConstraints(value);
    serializeBhiReqRowProcTo(bhiReqRowProcTo);
  }

  /**
   * Update BhiReqRowProcTo with a char[] from an offset and length
   *
   * @param value
   */
  public void setBhiReqRowProcTo(char[] source, int sourceIndex) {
    replace(source, sourceIndex, source.length, beginBhiReqRowProcTo, bhiReqRowProcTo.length);
  }

  public void setBhiReqRowProcTo(char[] source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginBhiReqRowProcTo, bhiReqRowProcTo.length);
  }

  /**
   * Update BhiReqRowProcTo with a char[] from an offset and length to an offset and length
   *
   * @param value
   */
  public void setBhiReqRowProcTo(
      char[] source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginBhiReqRowProcTo + targetIndex, targetLen);
  }

  /**
   * Update BhiReqRowProcTo with another Field
   *
   * @param value
   */
  public void setBhiReqRowProcTo(Field source) {
    replace(source, 0, source.length(), beginBhiReqRowProcTo, BHI_REQ_ROW_PROC_TO_LEN);
  }

  /**
   * Update BhiReqRowProcTo with another Field from an offset and length
   *
   * @param value
   */
  public void setBhiReqRowProcTo(Field source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginBhiReqRowProcTo, BHI_REQ_ROW_PROC_TO_LEN);
  }

  /**
   * Update BhiReqRowProcTo with another Field from an offset and length to an offset and length
   *
   * @param value
   */
  public void setBhiReqRowProcTo(
      Field source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginBhiReqRowProcTo + targetIndex, targetLen);
  }
  /**
   * Returns the value of bhiReqRowProcType
   *
   * @return bhiReqRowProcType
   */
  public char[] getBhiReqRowProcType() throws CFException {
    if (isBhiReqRowProcTypeModified()) {
      bhiReqRowProcType = refreshBhiReqRowProcType();
    }
    return bhiReqRowProcType;
  }

  /**
   * set variable bhiReqRowProcType Corresponding COBOL Variable is BHI-REQ-ROW-PROC-TYPE
   *
   * @param value
   */
  public void setBhiReqRowProcType(char[] value) {
    bhiReqRowProcType = checkBhiReqRowProcTypeConstraints(value);
    serializeBhiReqRowProcType(bhiReqRowProcType);
  }

  /**
   * Update BhiReqRowProcType with a char[] from an offset and length
   *
   * @param value
   */
  public void setBhiReqRowProcType(char[] source, int sourceIndex) {
    replace(source, sourceIndex, source.length, beginBhiReqRowProcType, bhiReqRowProcType.length);
  }

  public void setBhiReqRowProcType(char[] source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginBhiReqRowProcType, bhiReqRowProcType.length);
  }

  /**
   * Update BhiReqRowProcType with a char[] from an offset and length to an offset and length
   *
   * @param value
   */
  public void setBhiReqRowProcType(
      char[] source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginBhiReqRowProcType + targetIndex, targetLen);
  }

  /**
   * Update BhiReqRowProcType with another Field
   *
   * @param value
   */
  public void setBhiReqRowProcType(Field source) {
    replace(source, 0, source.length(), beginBhiReqRowProcType, BHI_REQ_ROW_PROC_TYPE_LEN);
  }

  /**
   * Update BhiReqRowProcType with another Field from an offset and length
   *
   * @param value
   */
  public void setBhiReqRowProcType(Field source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginBhiReqRowProcType, BHI_REQ_ROW_PROC_TYPE_LEN);
  }

  /**
   * Update BhiReqRowProcType with another Field from an offset and length to an offset and length
   *
   * @param value
   */
  public void setBhiReqRowProcType(
      Field source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginBhiReqRowProcType + targetIndex, targetLen);
  }
  /**
   * Returns the value of bhiReqRowInn
   *
   * @return bhiReqRowInn
   */
  public char[] getBhiReqRowInn() throws CFException {
    if (isBhiReqRowInnModified()) {
      bhiReqRowInn = refreshBhiReqRowInn();
    }
    return bhiReqRowInn;
  }

  /**
   * set variable bhiReqRowInn Corresponding COBOL Variable is BHI-REQ-ROW-INN
   *
   * @param value
   */
  public void setBhiReqRowInn(char[] value) {
    bhiReqRowInn = checkBhiReqRowInnConstraints(value);
    serializeBhiReqRowInn(bhiReqRowInn);
  }

  /**
   * Update BhiReqRowInn with a char[] from an offset and length
   *
   * @param value
   */
  public void setBhiReqRowInn(char[] source, int sourceIndex) {
    replace(source, sourceIndex, source.length, beginBhiReqRowInn, bhiReqRowInn.length);
  }

  public void setBhiReqRowInn(char[] source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginBhiReqRowInn, bhiReqRowInn.length);
  }

  /**
   * Update BhiReqRowInn with a char[] from an offset and length to an offset and length
   *
   * @param value
   */
  public void setBhiReqRowInn(
      char[] source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginBhiReqRowInn + targetIndex, targetLen);
  }

  /**
   * Update BhiReqRowInn with another Field
   *
   * @param value
   */
  public void setBhiReqRowInn(Field source) {
    replace(source, 0, source.length(), beginBhiReqRowInn, BHI_REQ_ROW_INN_LEN);
  }

  /**
   * Update BhiReqRowInn with another Field from an offset and length
   *
   * @param value
   */
  public void setBhiReqRowInn(Field source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginBhiReqRowInn, BHI_REQ_ROW_INN_LEN);
  }

  /**
   * Update BhiReqRowInn with another Field from an offset and length to an offset and length
   *
   * @param value
   */
  public void setBhiReqRowInn(
      Field source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginBhiReqRowInn + targetIndex, targetLen);
  }
  /**
   * Returns the value of bhiReqRowTier
   *
   * @return bhiReqRowTier
   */
  public char[] getBhiReqRowTier() throws CFException {
    if (isBhiReqRowTierModified()) {
      bhiReqRowTier = refreshBhiReqRowTier();
    }
    return bhiReqRowTier;
  }

  /**
   * set variable bhiReqRowTier Corresponding COBOL Variable is BHI-REQ-ROW-TIER
   *
   * @param value
   */
  public void setBhiReqRowTier(char[] value) {
    bhiReqRowTier = checkBhiReqRowTierConstraints(value);
    serializeBhiReqRowTier(bhiReqRowTier);
  }

  /**
   * Update BhiReqRowTier with a char[] from an offset and length
   *
   * @param value
   */
  public void setBhiReqRowTier(char[] source, int sourceIndex) {
    replace(source, sourceIndex, source.length, beginBhiReqRowTier, bhiReqRowTier.length);
  }

  public void setBhiReqRowTier(char[] source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginBhiReqRowTier, bhiReqRowTier.length);
  }

  /**
   * Update BhiReqRowTier with a char[] from an offset and length to an offset and length
   *
   * @param value
   */
  public void setBhiReqRowTier(
      char[] source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginBhiReqRowTier + targetIndex, targetLen);
  }

  /**
   * Update BhiReqRowTier with another Field
   *
   * @param value
   */
  public void setBhiReqRowTier(Field source) {
    replace(source, 0, source.length(), beginBhiReqRowTier, BHI_REQ_ROW_TIER_LEN);
  }

  /**
   * Update BhiReqRowTier with another Field from an offset and length
   *
   * @param value
   */
  public void setBhiReqRowTier(Field source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginBhiReqRowTier, BHI_REQ_ROW_TIER_LEN);
  }

  /**
   * Update BhiReqRowTier with another Field from an offset and length to an offset and length
   *
   * @param value
   */
  public void setBhiReqRowTier(
      Field source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginBhiReqRowTier + targetIndex, targetLen);
  }
  /**
   * Returns the value of bhiReqRowLstupdUsrid
   *
   * @return bhiReqRowLstupdUsrid
   */
  public char[] getBhiReqRowLstupdUsrid() throws CFException {
    if (isBhiReqRowLstupdUsridModified()) {
      bhiReqRowLstupdUsrid = refreshBhiReqRowLstupdUsrid();
    }
    return bhiReqRowLstupdUsrid;
  }

  /**
   * set variable bhiReqRowLstupdUsrid Corresponding COBOL Variable is BHI-REQ-ROW-LSTUPD-USRID
   *
   * @param value
   */
  public void setBhiReqRowLstupdUsrid(char[] value) {
    bhiReqRowLstupdUsrid = checkBhiReqRowLstupdUsridConstraints(value);
    serializeBhiReqRowLstupdUsrid(bhiReqRowLstupdUsrid);
  }

  /**
   * Update BhiReqRowLstupdUsrid with a char[] from an offset and length
   *
   * @param value
   */
  public void setBhiReqRowLstupdUsrid(char[] source, int sourceIndex) {
    replace(
        source, sourceIndex, source.length, beginBhiReqRowLstupdUsrid, bhiReqRowLstupdUsrid.length);
  }

  public void setBhiReqRowLstupdUsrid(char[] source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginBhiReqRowLstupdUsrid, bhiReqRowLstupdUsrid.length);
  }

  /**
   * Update BhiReqRowLstupdUsrid with a char[] from an offset and length to an offset and length
   *
   * @param value
   */
  public void setBhiReqRowLstupdUsrid(
      char[] source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginBhiReqRowLstupdUsrid + targetIndex, targetLen);
  }

  /**
   * Update BhiReqRowLstupdUsrid with another Field
   *
   * @param value
   */
  public void setBhiReqRowLstupdUsrid(Field source) {
    replace(source, 0, source.length(), beginBhiReqRowLstupdUsrid, BHI_REQ_ROW_LSTUPD_USRID_LEN);
  }

  /**
   * Update BhiReqRowLstupdUsrid with another Field from an offset and length
   *
   * @param value
   */
  public void setBhiReqRowLstupdUsrid(Field source, int sourceIndex, int sourceLen) {
    replace(
        source, sourceIndex, sourceLen, beginBhiReqRowLstupdUsrid, BHI_REQ_ROW_LSTUPD_USRID_LEN);
  }

  /**
   * Update BhiReqRowLstupdUsrid with another Field from an offset and length to an offset and
   * length
   *
   * @param value
   */
  public void setBhiReqRowLstupdUsrid(
      Field source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginBhiReqRowLstupdUsrid + targetIndex, targetLen);
  }
  /**
   * Returns the value of bhiReqRowLstupdDttm
   *
   * @return bhiReqRowLstupdDttm
   */
  public char[] getBhiReqRowLstupdDttm() throws CFException {
    if (isBhiReqRowLstupdDttmModified()) {
      bhiReqRowLstupdDttm = refreshBhiReqRowLstupdDttm();
    }
    return bhiReqRowLstupdDttm;
  }

  /**
   * set variable bhiReqRowLstupdDttm Corresponding COBOL Variable is BHI-REQ-ROW-LSTUPD-DTTM
   *
   * @param value
   */
  public void setBhiReqRowLstupdDttm(char[] value) {
    bhiReqRowLstupdDttm = checkBhiReqRowLstupdDttmConstraints(value);
    serializeBhiReqRowLstupdDttm(bhiReqRowLstupdDttm);
  }

  /**
   * Update BhiReqRowLstupdDttm with a char[] from an offset and length
   *
   * @param value
   */
  public void setBhiReqRowLstupdDttm(char[] source, int sourceIndex) {
    replace(
        source, sourceIndex, source.length, beginBhiReqRowLstupdDttm, bhiReqRowLstupdDttm.length);
  }

  public void setBhiReqRowLstupdDttm(char[] source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginBhiReqRowLstupdDttm, bhiReqRowLstupdDttm.length);
  }

  /**
   * Update BhiReqRowLstupdDttm with a char[] from an offset and length to an offset and length
   *
   * @param value
   */
  public void setBhiReqRowLstupdDttm(
      char[] source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginBhiReqRowLstupdDttm + targetIndex, targetLen);
  }

  /**
   * Update BhiReqRowLstupdDttm with another Field
   *
   * @param value
   */
  public void setBhiReqRowLstupdDttm(Field source) {
    replace(source, 0, source.length(), beginBhiReqRowLstupdDttm, BHI_REQ_ROW_LSTUPD_DTTM_LEN);
  }

  /**
   * Update BhiReqRowLstupdDttm with another Field from an offset and length
   *
   * @param value
   */
  public void setBhiReqRowLstupdDttm(Field source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginBhiReqRowLstupdDttm, BHI_REQ_ROW_LSTUPD_DTTM_LEN);
  }

  /**
   * Update BhiReqRowLstupdDttm with another Field from an offset and length to an offset and length
   *
   * @param value
   */
  public void setBhiReqRowLstupdDttm(
      Field source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginBhiReqRowLstupdDttm + targetIndex, targetLen);
  }
  /**
   * Returns the value of bhiReqRowStsCd
   *
   * @return bhiReqRowStsCd
   */
  public char[] getBhiReqRowStsCd() throws CFException {
    if (isBhiReqRowStsCdModified()) {
      bhiReqRowStsCd = refreshBhiReqRowStsCd();
    }
    return bhiReqRowStsCd;
  }

  /**
   * set variable bhiReqRowStsCd Corresponding COBOL Variable is BHI-REQ-ROW-STS-CD
   *
   * @param value
   */
  public void setBhiReqRowStsCd(char[] value) {
    bhiReqRowStsCd = checkBhiReqRowStsCdConstraints(value);
    serializeBhiReqRowStsCd(bhiReqRowStsCd);
  }

  /**
   * Update BhiReqRowStsCd with a char[] from an offset and length
   *
   * @param value
   */
  public void setBhiReqRowStsCd(char[] source, int sourceIndex) {
    replace(source, sourceIndex, source.length, beginBhiReqRowStsCd, bhiReqRowStsCd.length);
  }

  public void setBhiReqRowStsCd(char[] source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginBhiReqRowStsCd, bhiReqRowStsCd.length);
  }

  /**
   * Update BhiReqRowStsCd with a char[] from an offset and length to an offset and length
   *
   * @param value
   */
  public void setBhiReqRowStsCd(
      char[] source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginBhiReqRowStsCd + targetIndex, targetLen);
  }

  /**
   * Update BhiReqRowStsCd with another Field
   *
   * @param value
   */
  public void setBhiReqRowStsCd(Field source) {
    replace(source, 0, source.length(), beginBhiReqRowStsCd, BHI_REQ_ROW_STS_CD_LEN);
  }

  /**
   * Update BhiReqRowStsCd with another Field from an offset and length
   *
   * @param value
   */
  public void setBhiReqRowStsCd(Field source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginBhiReqRowStsCd, BHI_REQ_ROW_STS_CD_LEN);
  }

  /**
   * Update BhiReqRowStsCd with another Field from an offset and length to an offset and length
   *
   * @param value
   */
  public void setBhiReqRowStsCd(
      Field source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginBhiReqRowStsCd + targetIndex, targetLen);
  }
  /**
   * Returns the value of bhiReqRowProvOrgTypCd
   *
   * @return bhiReqRowProvOrgTypCd
   */
  public char[] getBhiReqRowProvOrgTypCd() throws CFException {
    if (isBhiReqRowProvOrgTypCdModified()) {
      bhiReqRowProvOrgTypCd = refreshBhiReqRowProvOrgTypCd();
    }
    return bhiReqRowProvOrgTypCd;
  }

  /**
   * set variable bhiReqRowProvOrgTypCd Corresponding COBOL Variable is BHI-REQ-ROW-PROV-ORG-TYP-CD
   *
   * @param value
   */
  public void setBhiReqRowProvOrgTypCd(char[] value) {
    bhiReqRowProvOrgTypCd = checkBhiReqRowProvOrgTypCdConstraints(value);
    serializeBhiReqRowProvOrgTypCd(bhiReqRowProvOrgTypCd);
  }

  /**
   * Update BhiReqRowProvOrgTypCd with a char[] from an offset and length
   *
   * @param value
   */
  public void setBhiReqRowProvOrgTypCd(char[] source, int sourceIndex) {
    replace(
        source,
        sourceIndex,
        source.length,
        beginBhiReqRowProvOrgTypCd,
        bhiReqRowProvOrgTypCd.length);
  }

  public void setBhiReqRowProvOrgTypCd(char[] source, int sourceIndex, int sourceLen) {
    replace(
        source, sourceIndex, sourceLen, beginBhiReqRowProvOrgTypCd, bhiReqRowProvOrgTypCd.length);
  }

  /**
   * Update BhiReqRowProvOrgTypCd with a char[] from an offset and length to an offset and length
   *
   * @param value
   */
  public void setBhiReqRowProvOrgTypCd(
      char[] source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginBhiReqRowProvOrgTypCd + targetIndex, targetLen);
  }

  /**
   * Update BhiReqRowProvOrgTypCd with another Field
   *
   * @param value
   */
  public void setBhiReqRowProvOrgTypCd(Field source) {
    replace(
        source, 0, source.length(), beginBhiReqRowProvOrgTypCd, BHI_REQ_ROW_PROV_ORG_TYP_CD_LEN);
  }

  /**
   * Update BhiReqRowProvOrgTypCd with another Field from an offset and length
   *
   * @param value
   */
  public void setBhiReqRowProvOrgTypCd(Field source, int sourceIndex, int sourceLen) {
    replace(
        source,
        sourceIndex,
        sourceLen,
        beginBhiReqRowProvOrgTypCd,
        BHI_REQ_ROW_PROV_ORG_TYP_CD_LEN);
  }

  /**
   * Update BhiReqRowProvOrgTypCd with another Field from an offset and length to an offset and
   * length
   *
   * @param value
   */
  public void setBhiReqRowProvOrgTypCd(
      Field source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginBhiReqRowProvOrgTypCd + targetIndex, targetLen);
  }

  public static int getBhiReqRowNonkeyDataFieldLength() {
    return BHI_REQ_ROW_NONKEY_DATA_LENGTH;
  }
}
