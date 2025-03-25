package com.cloudframe.app.dto.d5427tli;

/**
 * The class DclsrvcAsgn is used to handle fields declared in it
 *
 * @author CloudFrame Inc. created on 2025-03-25 at 08:32. using version 5.0.0.231
 */
import com.cloudframe.app.common.CONSTANTS;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.dto.serialize.d5427tli.*;
import com.cloudframe.app.exception.CFException;

public class DclsrvcAsgn extends DclsrvcAsgnSerialized {

  private char[] hdrRulLvlTypId = Field.fillLowValue(1);

  private char[] hdrObligId = Field.fillLowValue(2);

  private char[] hdrShrArngCd = Field.fillLowValue(2);

  private char[] hdrPolNbr = Field.fillLowValue(6);

  private char[] hdrPlnNbr = Field.fillLowValue(4);

  private char[] hdrProcDt = Field.fillLowValue(10);

  private char[] hdrEffDt = Field.fillLowValue(10);

  private char[] hdrCancDt = Field.fillLowValue(10);

  private char[] hdrSlotTblId = Field.fillLowValue(6);

  private char[] hdrLstUpdtDt = Field.fillLowValue(10);

  private char[] hdrLstUpdtUserId = Field.fillLowValue(9);

  private char[] hdrRowStsCd = Field.fillLowValue(1);

  /** Constructor for DclsrvcAsgn */
  public DclsrvcAsgn() {
    super();
    /*  set the parent of each child as this which are a group variable */
    /*  end of offset */
  }

  /**
   * Returns the value of hdrRulLvlTypId
   *
   * @return hdrRulLvlTypId
   */
  public char[] getHdrRulLvlTypId() throws CFException {
    if (isHdrRulLvlTypIdModified()) {
      hdrRulLvlTypId = refreshHdrRulLvlTypId();
    }
    return hdrRulLvlTypId;
  }

  /**
   * set variable hdrRulLvlTypId Corresponding COBOL Variable is HDR-RUL-LVL-TYP-ID
   *
   * @param value
   */
  public void setHdrRulLvlTypId(char[] value) {
    hdrRulLvlTypId = checkHdrRulLvlTypIdConstraints(value);
    serializeHdrRulLvlTypId(hdrRulLvlTypId);
  }

  /**
   * Update HdrRulLvlTypId with a char[] from an offset and length
   *
   * @param value
   */
  public void setHdrRulLvlTypId(char[] source, int sourceIndex) {
    replace(source, sourceIndex, source.length, beginHdrRulLvlTypId, hdrRulLvlTypId.length);
  }

  public void setHdrRulLvlTypId(char[] source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginHdrRulLvlTypId, hdrRulLvlTypId.length);
  }

  /**
   * Update HdrRulLvlTypId with a char[] from an offset and length to an offset and length
   *
   * @param value
   */
  public void setHdrRulLvlTypId(
      char[] source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginHdrRulLvlTypId + targetIndex, targetLen);
  }

  /**
   * Update HdrRulLvlTypId with another Field
   *
   * @param value
   */
  public void setHdrRulLvlTypId(Field source) {
    replace(source, 0, source.length(), beginHdrRulLvlTypId, HDR_RUL_LVL_TYP_ID_LEN);
  }

  /**
   * Update HdrRulLvlTypId with another Field from an offset and length
   *
   * @param value
   */
  public void setHdrRulLvlTypId(Field source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginHdrRulLvlTypId, HDR_RUL_LVL_TYP_ID_LEN);
  }

  /**
   * Update HdrRulLvlTypId with another Field from an offset and length to an offset and length
   *
   * @param value
   */
  public void setHdrRulLvlTypId(
      Field source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginHdrRulLvlTypId + targetIndex, targetLen);
  }
  /**
   * Returns the value of hdrObligId
   *
   * @return hdrObligId
   */
  public char[] getHdrObligId() throws CFException {
    if (isHdrObligIdModified()) {
      hdrObligId = refreshHdrObligId();
    }
    return hdrObligId;
  }

  /**
   * set variable hdrObligId Corresponding COBOL Variable is HDR-OBLIG-ID
   *
   * @param value
   */
  public void setHdrObligId(char[] value) {
    hdrObligId = checkHdrObligIdConstraints(value);
    serializeHdrObligId(hdrObligId);
  }

  /**
   * Update HdrObligId with a char[] from an offset and length
   *
   * @param value
   */
  public void setHdrObligId(char[] source, int sourceIndex) {
    replace(source, sourceIndex, source.length, beginHdrObligId, hdrObligId.length);
  }

  public void setHdrObligId(char[] source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginHdrObligId, hdrObligId.length);
  }

  /**
   * Update HdrObligId with a char[] from an offset and length to an offset and length
   *
   * @param value
   */
  public void setHdrObligId(
      char[] source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginHdrObligId + targetIndex, targetLen);
  }

  /**
   * Update HdrObligId with another Field
   *
   * @param value
   */
  public void setHdrObligId(Field source) {
    replace(source, 0, source.length(), beginHdrObligId, HDR_OBLIG_ID_LEN);
  }

  /**
   * Update HdrObligId with another Field from an offset and length
   *
   * @param value
   */
  public void setHdrObligId(Field source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginHdrObligId, HDR_OBLIG_ID_LEN);
  }

  /**
   * Update HdrObligId with another Field from an offset and length to an offset and length
   *
   * @param value
   */
  public void setHdrObligId(
      Field source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginHdrObligId + targetIndex, targetLen);
  }
  /**
   * Returns the value of hdrShrArngCd
   *
   * @return hdrShrArngCd
   */
  public char[] getHdrShrArngCd() throws CFException {
    if (isHdrShrArngCdModified()) {
      hdrShrArngCd = refreshHdrShrArngCd();
    }
    return hdrShrArngCd;
  }

  /**
   * set variable hdrShrArngCd Corresponding COBOL Variable is HDR-SHR-ARNG-CD
   *
   * @param value
   */
  public void setHdrShrArngCd(char[] value) {
    hdrShrArngCd = checkHdrShrArngCdConstraints(value);
    serializeHdrShrArngCd(hdrShrArngCd);
  }

  /**
   * Update HdrShrArngCd with a char[] from an offset and length
   *
   * @param value
   */
  public void setHdrShrArngCd(char[] source, int sourceIndex) {
    replace(source, sourceIndex, source.length, beginHdrShrArngCd, hdrShrArngCd.length);
  }

  public void setHdrShrArngCd(char[] source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginHdrShrArngCd, hdrShrArngCd.length);
  }

  /**
   * Update HdrShrArngCd with a char[] from an offset and length to an offset and length
   *
   * @param value
   */
  public void setHdrShrArngCd(
      char[] source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginHdrShrArngCd + targetIndex, targetLen);
  }

  /**
   * Update HdrShrArngCd with another Field
   *
   * @param value
   */
  public void setHdrShrArngCd(Field source) {
    replace(source, 0, source.length(), beginHdrShrArngCd, HDR_SHR_ARNG_CD_LEN);
  }

  /**
   * Update HdrShrArngCd with another Field from an offset and length
   *
   * @param value
   */
  public void setHdrShrArngCd(Field source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginHdrShrArngCd, HDR_SHR_ARNG_CD_LEN);
  }

  /**
   * Update HdrShrArngCd with another Field from an offset and length to an offset and length
   *
   * @param value
   */
  public void setHdrShrArngCd(
      Field source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginHdrShrArngCd + targetIndex, targetLen);
  }
  /**
   * Returns the value of hdrPolNbr
   *
   * @return hdrPolNbr
   */
  public char[] getHdrPolNbr() throws CFException {
    if (isHdrPolNbrModified()) {
      hdrPolNbr = refreshHdrPolNbr();
    }
    return hdrPolNbr;
  }

  /**
   * set variable hdrPolNbr Corresponding COBOL Variable is HDR-POL-NBR
   *
   * @param value
   */
  public void setHdrPolNbr(char[] value) {
    hdrPolNbr = checkHdrPolNbrConstraints(value);
    serializeHdrPolNbr(hdrPolNbr);
  }

  /**
   * Update HdrPolNbr with a char[] from an offset and length
   *
   * @param value
   */
  public void setHdrPolNbr(char[] source, int sourceIndex) {
    replace(source, sourceIndex, source.length, beginHdrPolNbr, hdrPolNbr.length);
  }

  public void setHdrPolNbr(char[] source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginHdrPolNbr, hdrPolNbr.length);
  }

  /**
   * Update HdrPolNbr with a char[] from an offset and length to an offset and length
   *
   * @param value
   */
  public void setHdrPolNbr(
      char[] source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginHdrPolNbr + targetIndex, targetLen);
  }

  /**
   * Update HdrPolNbr with another Field
   *
   * @param value
   */
  public void setHdrPolNbr(Field source) {
    replace(source, 0, source.length(), beginHdrPolNbr, HDR_POL_NBR_LEN);
  }

  /**
   * Update HdrPolNbr with another Field from an offset and length
   *
   * @param value
   */
  public void setHdrPolNbr(Field source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginHdrPolNbr, HDR_POL_NBR_LEN);
  }

  /**
   * Update HdrPolNbr with another Field from an offset and length to an offset and length
   *
   * @param value
   */
  public void setHdrPolNbr(
      Field source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginHdrPolNbr + targetIndex, targetLen);
  }
  /**
   * Returns the value of hdrPlnNbr
   *
   * @return hdrPlnNbr
   */
  public char[] getHdrPlnNbr() throws CFException {
    if (isHdrPlnNbrModified()) {
      hdrPlnNbr = refreshHdrPlnNbr();
    }
    return hdrPlnNbr;
  }

  /**
   * set variable hdrPlnNbr Corresponding COBOL Variable is HDR-PLN-NBR
   *
   * @param value
   */
  public void setHdrPlnNbr(char[] value) {
    hdrPlnNbr = checkHdrPlnNbrConstraints(value);
    serializeHdrPlnNbr(hdrPlnNbr);
  }

  /**
   * Update HdrPlnNbr with a char[] from an offset and length
   *
   * @param value
   */
  public void setHdrPlnNbr(char[] source, int sourceIndex) {
    replace(source, sourceIndex, source.length, beginHdrPlnNbr, hdrPlnNbr.length);
  }

  public void setHdrPlnNbr(char[] source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginHdrPlnNbr, hdrPlnNbr.length);
  }

  /**
   * Update HdrPlnNbr with a char[] from an offset and length to an offset and length
   *
   * @param value
   */
  public void setHdrPlnNbr(
      char[] source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginHdrPlnNbr + targetIndex, targetLen);
  }

  /**
   * Update HdrPlnNbr with another Field
   *
   * @param value
   */
  public void setHdrPlnNbr(Field source) {
    replace(source, 0, source.length(), beginHdrPlnNbr, HDR_PLN_NBR_LEN);
  }

  /**
   * Update HdrPlnNbr with another Field from an offset and length
   *
   * @param value
   */
  public void setHdrPlnNbr(Field source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginHdrPlnNbr, HDR_PLN_NBR_LEN);
  }

  /**
   * Update HdrPlnNbr with another Field from an offset and length to an offset and length
   *
   * @param value
   */
  public void setHdrPlnNbr(
      Field source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginHdrPlnNbr + targetIndex, targetLen);
  }
  /**
   * Returns the value of hdrProcDt
   *
   * @return hdrProcDt
   */
  public char[] getHdrProcDt() throws CFException {
    if (isHdrProcDtModified()) {
      hdrProcDt = refreshHdrProcDt();
    }
    return hdrProcDt;
  }

  /**
   * set variable hdrProcDt Corresponding COBOL Variable is HDR-PROC-DT
   *
   * @param value
   */
  public void setHdrProcDt(char[] value) {
    hdrProcDt = checkHdrProcDtConstraints(value);
    serializeHdrProcDt(hdrProcDt);
  }

  /**
   * Update HdrProcDt with a char[] from an offset and length
   *
   * @param value
   */
  public void setHdrProcDt(char[] source, int sourceIndex) {
    replace(source, sourceIndex, source.length, beginHdrProcDt, hdrProcDt.length);
  }

  public void setHdrProcDt(char[] source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginHdrProcDt, hdrProcDt.length);
  }

  /**
   * Update HdrProcDt with a char[] from an offset and length to an offset and length
   *
   * @param value
   */
  public void setHdrProcDt(
      char[] source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginHdrProcDt + targetIndex, targetLen);
  }

  /**
   * Update HdrProcDt with another Field
   *
   * @param value
   */
  public void setHdrProcDt(Field source) {
    replace(source, 0, source.length(), beginHdrProcDt, HDR_PROC_DT_LEN);
  }

  /**
   * Update HdrProcDt with another Field from an offset and length
   *
   * @param value
   */
  public void setHdrProcDt(Field source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginHdrProcDt, HDR_PROC_DT_LEN);
  }

  /**
   * Update HdrProcDt with another Field from an offset and length to an offset and length
   *
   * @param value
   */
  public void setHdrProcDt(
      Field source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginHdrProcDt + targetIndex, targetLen);
  }
  /**
   * Returns the value of hdrEffDt
   *
   * @return hdrEffDt
   */
  public char[] getHdrEffDt() throws CFException {
    if (isHdrEffDtModified()) {
      hdrEffDt = refreshHdrEffDt();
    }
    return hdrEffDt;
  }

  /**
   * set variable hdrEffDt Corresponding COBOL Variable is HDR-EFF-DT
   *
   * @param value
   */
  public void setHdrEffDt(char[] value) {
    hdrEffDt = checkHdrEffDtConstraints(value);
    serializeHdrEffDt(hdrEffDt);
  }

  /**
   * Update HdrEffDt with a char[] from an offset and length
   *
   * @param value
   */
  public void setHdrEffDt(char[] source, int sourceIndex) {
    replace(source, sourceIndex, source.length, beginHdrEffDt, hdrEffDt.length);
  }

  public void setHdrEffDt(char[] source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginHdrEffDt, hdrEffDt.length);
  }

  /**
   * Update HdrEffDt with a char[] from an offset and length to an offset and length
   *
   * @param value
   */
  public void setHdrEffDt(
      char[] source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginHdrEffDt + targetIndex, targetLen);
  }

  /**
   * Update HdrEffDt with another Field
   *
   * @param value
   */
  public void setHdrEffDt(Field source) {
    replace(source, 0, source.length(), beginHdrEffDt, HDR_EFF_DT_LEN);
  }

  /**
   * Update HdrEffDt with another Field from an offset and length
   *
   * @param value
   */
  public void setHdrEffDt(Field source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginHdrEffDt, HDR_EFF_DT_LEN);
  }

  /**
   * Update HdrEffDt with another Field from an offset and length to an offset and length
   *
   * @param value
   */
  public void setHdrEffDt(
      Field source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginHdrEffDt + targetIndex, targetLen);
  }
  /**
   * Returns the value of hdrCancDt
   *
   * @return hdrCancDt
   */
  public char[] getHdrCancDt() throws CFException {
    if (isHdrCancDtModified()) {
      hdrCancDt = refreshHdrCancDt();
    }
    return hdrCancDt;
  }

  /**
   * set variable hdrCancDt Corresponding COBOL Variable is HDR-CANC-DT
   *
   * @param value
   */
  public void setHdrCancDt(char[] value) {
    hdrCancDt = checkHdrCancDtConstraints(value);
    serializeHdrCancDt(hdrCancDt);
  }

  /**
   * Update HdrCancDt with a char[] from an offset and length
   *
   * @param value
   */
  public void setHdrCancDt(char[] source, int sourceIndex) {
    replace(source, sourceIndex, source.length, beginHdrCancDt, hdrCancDt.length);
  }

  public void setHdrCancDt(char[] source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginHdrCancDt, hdrCancDt.length);
  }

  /**
   * Update HdrCancDt with a char[] from an offset and length to an offset and length
   *
   * @param value
   */
  public void setHdrCancDt(
      char[] source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginHdrCancDt + targetIndex, targetLen);
  }

  /**
   * Update HdrCancDt with another Field
   *
   * @param value
   */
  public void setHdrCancDt(Field source) {
    replace(source, 0, source.length(), beginHdrCancDt, HDR_CANC_DT_LEN);
  }

  /**
   * Update HdrCancDt with another Field from an offset and length
   *
   * @param value
   */
  public void setHdrCancDt(Field source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginHdrCancDt, HDR_CANC_DT_LEN);
  }

  /**
   * Update HdrCancDt with another Field from an offset and length to an offset and length
   *
   * @param value
   */
  public void setHdrCancDt(
      Field source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginHdrCancDt + targetIndex, targetLen);
  }
  /**
   * Returns the value of hdrSlotTblId
   *
   * @return hdrSlotTblId
   */
  public char[] getHdrSlotTblId() throws CFException {
    if (isHdrSlotTblIdModified()) {
      hdrSlotTblId = refreshHdrSlotTblId();
    }
    return hdrSlotTblId;
  }

  /**
   * set variable hdrSlotTblId Corresponding COBOL Variable is HDR-SLOT-TBL-ID
   *
   * @param value
   */
  public void setHdrSlotTblId(char[] value) {
    hdrSlotTblId = checkHdrSlotTblIdConstraints(value);
    serializeHdrSlotTblId(hdrSlotTblId);
  }

  /**
   * Update HdrSlotTblId with a char[] from an offset and length
   *
   * @param value
   */
  public void setHdrSlotTblId(char[] source, int sourceIndex) {
    replace(source, sourceIndex, source.length, beginHdrSlotTblId, hdrSlotTblId.length);
  }

  public void setHdrSlotTblId(char[] source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginHdrSlotTblId, hdrSlotTblId.length);
  }

  /**
   * Update HdrSlotTblId with a char[] from an offset and length to an offset and length
   *
   * @param value
   */
  public void setHdrSlotTblId(
      char[] source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginHdrSlotTblId + targetIndex, targetLen);
  }

  /**
   * Update HdrSlotTblId with another Field
   *
   * @param value
   */
  public void setHdrSlotTblId(Field source) {
    replace(source, 0, source.length(), beginHdrSlotTblId, HDR_SLOT_TBL_ID_LEN);
  }

  /**
   * Update HdrSlotTblId with another Field from an offset and length
   *
   * @param value
   */
  public void setHdrSlotTblId(Field source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginHdrSlotTblId, HDR_SLOT_TBL_ID_LEN);
  }

  /**
   * Update HdrSlotTblId with another Field from an offset and length to an offset and length
   *
   * @param value
   */
  public void setHdrSlotTblId(
      Field source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginHdrSlotTblId + targetIndex, targetLen);
  }
  /**
   * Returns the value of hdrLstUpdtDt
   *
   * @return hdrLstUpdtDt
   */
  public char[] getHdrLstUpdtDt() throws CFException {
    if (isHdrLstUpdtDtModified()) {
      hdrLstUpdtDt = refreshHdrLstUpdtDt();
    }
    return hdrLstUpdtDt;
  }

  /**
   * set variable hdrLstUpdtDt Corresponding COBOL Variable is HDR-LST-UPDT-DT
   *
   * @param value
   */
  public void setHdrLstUpdtDt(char[] value) {
    hdrLstUpdtDt = checkHdrLstUpdtDtConstraints(value);
    serializeHdrLstUpdtDt(hdrLstUpdtDt);
  }

  /**
   * Update HdrLstUpdtDt with a char[] from an offset and length
   *
   * @param value
   */
  public void setHdrLstUpdtDt(char[] source, int sourceIndex) {
    replace(source, sourceIndex, source.length, beginHdrLstUpdtDt, hdrLstUpdtDt.length);
  }

  public void setHdrLstUpdtDt(char[] source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginHdrLstUpdtDt, hdrLstUpdtDt.length);
  }

  /**
   * Update HdrLstUpdtDt with a char[] from an offset and length to an offset and length
   *
   * @param value
   */
  public void setHdrLstUpdtDt(
      char[] source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginHdrLstUpdtDt + targetIndex, targetLen);
  }

  /**
   * Update HdrLstUpdtDt with another Field
   *
   * @param value
   */
  public void setHdrLstUpdtDt(Field source) {
    replace(source, 0, source.length(), beginHdrLstUpdtDt, HDR_LST_UPDT_DT_LEN);
  }

  /**
   * Update HdrLstUpdtDt with another Field from an offset and length
   *
   * @param value
   */
  public void setHdrLstUpdtDt(Field source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginHdrLstUpdtDt, HDR_LST_UPDT_DT_LEN);
  }

  /**
   * Update HdrLstUpdtDt with another Field from an offset and length to an offset and length
   *
   * @param value
   */
  public void setHdrLstUpdtDt(
      Field source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginHdrLstUpdtDt + targetIndex, targetLen);
  }
  /**
   * Returns the value of hdrLstUpdtUserId
   *
   * @return hdrLstUpdtUserId
   */
  public char[] getHdrLstUpdtUserId() throws CFException {
    if (isHdrLstUpdtUserIdModified()) {
      hdrLstUpdtUserId = refreshHdrLstUpdtUserId();
    }
    return hdrLstUpdtUserId;
  }

  /**
   * set variable hdrLstUpdtUserId Corresponding COBOL Variable is HDR-LST-UPDT-USER-ID
   *
   * @param value
   */
  public void setHdrLstUpdtUserId(char[] value) {
    hdrLstUpdtUserId = checkHdrLstUpdtUserIdConstraints(value);
    serializeHdrLstUpdtUserId(hdrLstUpdtUserId);
  }

  /**
   * Update HdrLstUpdtUserId with a char[] from an offset and length
   *
   * @param value
   */
  public void setHdrLstUpdtUserId(char[] source, int sourceIndex) {
    replace(source, sourceIndex, source.length, beginHdrLstUpdtUserId, hdrLstUpdtUserId.length);
  }

  public void setHdrLstUpdtUserId(char[] source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginHdrLstUpdtUserId, hdrLstUpdtUserId.length);
  }

  /**
   * Update HdrLstUpdtUserId with a char[] from an offset and length to an offset and length
   *
   * @param value
   */
  public void setHdrLstUpdtUserId(
      char[] source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginHdrLstUpdtUserId + targetIndex, targetLen);
  }

  /**
   * Update HdrLstUpdtUserId with another Field
   *
   * @param value
   */
  public void setHdrLstUpdtUserId(Field source) {
    replace(source, 0, source.length(), beginHdrLstUpdtUserId, HDR_LST_UPDT_USER_ID_LEN);
  }

  /**
   * Update HdrLstUpdtUserId with another Field from an offset and length
   *
   * @param value
   */
  public void setHdrLstUpdtUserId(Field source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginHdrLstUpdtUserId, HDR_LST_UPDT_USER_ID_LEN);
  }

  /**
   * Update HdrLstUpdtUserId with another Field from an offset and length to an offset and length
   *
   * @param value
   */
  public void setHdrLstUpdtUserId(
      Field source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginHdrLstUpdtUserId + targetIndex, targetLen);
  }
  /**
   * Returns the value of hdrRowStsCd
   *
   * @return hdrRowStsCd
   */
  public char[] getHdrRowStsCd() throws CFException {
    if (isHdrRowStsCdModified()) {
      hdrRowStsCd = refreshHdrRowStsCd();
    }
    return hdrRowStsCd;
  }

  /**
   * set variable hdrRowStsCd Corresponding COBOL Variable is HDR-ROW-STS-CD
   *
   * @param value
   */
  public void setHdrRowStsCd(char[] value) {
    hdrRowStsCd = checkHdrRowStsCdConstraints(value);
    serializeHdrRowStsCd(hdrRowStsCd);
  }

  /**
   * Update HdrRowStsCd with a char[] from an offset and length
   *
   * @param value
   */
  public void setHdrRowStsCd(char[] source, int sourceIndex) {
    replace(source, sourceIndex, source.length, beginHdrRowStsCd, hdrRowStsCd.length);
  }

  public void setHdrRowStsCd(char[] source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginHdrRowStsCd, hdrRowStsCd.length);
  }

  /**
   * Update HdrRowStsCd with a char[] from an offset and length to an offset and length
   *
   * @param value
   */
  public void setHdrRowStsCd(
      char[] source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginHdrRowStsCd + targetIndex, targetLen);
  }

  /**
   * Update HdrRowStsCd with another Field
   *
   * @param value
   */
  public void setHdrRowStsCd(Field source) {
    replace(source, 0, source.length(), beginHdrRowStsCd, HDR_ROW_STS_CD_LEN);
  }

  /**
   * Update HdrRowStsCd with another Field from an offset and length
   *
   * @param value
   */
  public void setHdrRowStsCd(Field source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginHdrRowStsCd, HDR_ROW_STS_CD_LEN);
  }

  /**
   * Update HdrRowStsCd with another Field from an offset and length to an offset and length
   *
   * @param value
   */
  public void setHdrRowStsCd(
      Field source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginHdrRowStsCd + targetIndex, targetLen);
  }

  /**
   * initializes DclsrvcAsgn String fields defaults to Spaces short/int/long defaults to zero
   * BigDecimal defaults to BigDecimal.ZERO
   */
  public void initialize() {
    setHdrRulLvlTypId(CONSTANTS.SPACE);
    setHdrObligId(CONSTANTS.SPACE_2);
    setHdrShrArngCd(CONSTANTS.SPACE_2);
    setHdrPolNbr(CONSTANTS.SPACE_6);
    setHdrPlnNbr(CONSTANTS.SPACE_4);
    setHdrProcDt(CONSTANTS.SPACE_10);
    setHdrEffDt(CONSTANTS.SPACE_10);
    setHdrCancDt(CONSTANTS.SPACE_10);
    setHdrSlotTblId(CONSTANTS.SPACE_6);
    setHdrLstUpdtDt(CONSTANTS.SPACE_10);
    setHdrLstUpdtUserId(CONSTANTS.SPACE_9);
    setHdrRowStsCd(CONSTANTS.SPACE);
  }

  public static int getDclsrvcAsgnFieldLength() {
    return DCLSRVC_ASGN_LENGTH;
  }
}
