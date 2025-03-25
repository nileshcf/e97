package com.cloudframe.app.dto.d5427scn;

/**
 * The class DclsrvcCdTransTbl is used to handle fields declared in it
 *
 * @author CloudFrame Inc. created on 2025-03-25 at 08:32. using version 5.0.0.231
 */
import com.cloudframe.app.common.CONSTANTS;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.dto.serialize.d5427scn.*;
import com.cloudframe.app.exception.CFException;

public class DclsrvcCdTransTbl extends DclsrvcCdTransTblSerialized {

  private char[] svcaSrvcCd = Field.fillLowValue(6);

  private char[] svcaSrvcCdNbr = Field.fillLowValue(3);

  private char[] svcaSrvcCdTxt = Field.fillLowValue(20);

  private char[] svcaEffDt = Field.fillLowValue(10);

  private char[] svcaCancDt = Field.fillLowValue(10);

  private char[] svcaLstUpdtDttm = Field.fillLowValue(26);

  private char[] svcaLstUpdtUserId = Field.fillLowValue(9);

  /** Constructor for DclsrvcCdTransTbl */
  public DclsrvcCdTransTbl() {
    super();
    /*  set the parent of each child as this which are a group variable */
    /*  end of offset */
  }

  /**
   * Returns the value of svcaSrvcCd
   *
   * @return svcaSrvcCd
   */
  public char[] getSvcaSrvcCd() throws CFException {
    if (isSvcaSrvcCdModified()) {
      svcaSrvcCd = refreshSvcaSrvcCd();
    }
    return svcaSrvcCd;
  }

  /**
   * set variable svcaSrvcCd Corresponding COBOL Variable is SVCA-SRVC-CD
   *
   * @param value
   */
  public void setSvcaSrvcCd(char[] value) {
    svcaSrvcCd = checkSvcaSrvcCdConstraints(value);
    serializeSvcaSrvcCd(svcaSrvcCd);
  }

  /**
   * Update SvcaSrvcCd with a char[] from an offset and length
   *
   * @param value
   */
  public void setSvcaSrvcCd(char[] source, int sourceIndex) {
    replace(source, sourceIndex, source.length, beginSvcaSrvcCd, svcaSrvcCd.length);
  }

  public void setSvcaSrvcCd(char[] source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginSvcaSrvcCd, svcaSrvcCd.length);
  }

  /**
   * Update SvcaSrvcCd with a char[] from an offset and length to an offset and length
   *
   * @param value
   */
  public void setSvcaSrvcCd(
      char[] source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginSvcaSrvcCd + targetIndex, targetLen);
  }

  /**
   * Update SvcaSrvcCd with another Field
   *
   * @param value
   */
  public void setSvcaSrvcCd(Field source) {
    replace(source, 0, source.length(), beginSvcaSrvcCd, SVCA_SRVC_CD_LEN);
  }

  /**
   * Update SvcaSrvcCd with another Field from an offset and length
   *
   * @param value
   */
  public void setSvcaSrvcCd(Field source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginSvcaSrvcCd, SVCA_SRVC_CD_LEN);
  }

  /**
   * Update SvcaSrvcCd with another Field from an offset and length to an offset and length
   *
   * @param value
   */
  public void setSvcaSrvcCd(
      Field source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginSvcaSrvcCd + targetIndex, targetLen);
  }
  /**
   * Returns the value of svcaSrvcCdNbr
   *
   * @return svcaSrvcCdNbr
   */
  public char[] getSvcaSrvcCdNbr() throws CFException {
    if (isSvcaSrvcCdNbrModified()) {
      svcaSrvcCdNbr = refreshSvcaSrvcCdNbr();
    }
    return svcaSrvcCdNbr;
  }

  /**
   * set variable svcaSrvcCdNbr Corresponding COBOL Variable is SVCA-SRVC-CD-NBR
   *
   * @param value
   */
  public void setSvcaSrvcCdNbr(char[] value) {
    svcaSrvcCdNbr = checkSvcaSrvcCdNbrConstraints(value);
    serializeSvcaSrvcCdNbr(svcaSrvcCdNbr);
  }

  /**
   * Update SvcaSrvcCdNbr with a char[] from an offset and length
   *
   * @param value
   */
  public void setSvcaSrvcCdNbr(char[] source, int sourceIndex) {
    replace(source, sourceIndex, source.length, beginSvcaSrvcCdNbr, svcaSrvcCdNbr.length);
  }

  public void setSvcaSrvcCdNbr(char[] source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginSvcaSrvcCdNbr, svcaSrvcCdNbr.length);
  }

  /**
   * Update SvcaSrvcCdNbr with a char[] from an offset and length to an offset and length
   *
   * @param value
   */
  public void setSvcaSrvcCdNbr(
      char[] source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginSvcaSrvcCdNbr + targetIndex, targetLen);
  }

  /**
   * Update SvcaSrvcCdNbr with another Field
   *
   * @param value
   */
  public void setSvcaSrvcCdNbr(Field source) {
    replace(source, 0, source.length(), beginSvcaSrvcCdNbr, SVCA_SRVC_CD_NBR_LEN);
  }

  /**
   * Update SvcaSrvcCdNbr with another Field from an offset and length
   *
   * @param value
   */
  public void setSvcaSrvcCdNbr(Field source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginSvcaSrvcCdNbr, SVCA_SRVC_CD_NBR_LEN);
  }

  /**
   * Update SvcaSrvcCdNbr with another Field from an offset and length to an offset and length
   *
   * @param value
   */
  public void setSvcaSrvcCdNbr(
      Field source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginSvcaSrvcCdNbr + targetIndex, targetLen);
  }
  /**
   * Returns the value of svcaSrvcCdTxt
   *
   * @return svcaSrvcCdTxt
   */
  public char[] getSvcaSrvcCdTxt() throws CFException {
    if (isSvcaSrvcCdTxtModified()) {
      svcaSrvcCdTxt = refreshSvcaSrvcCdTxt();
    }
    return svcaSrvcCdTxt;
  }

  /**
   * set variable svcaSrvcCdTxt Corresponding COBOL Variable is SVCA-SRVC-CD-TXT
   *
   * @param value
   */
  public void setSvcaSrvcCdTxt(char[] value) {
    svcaSrvcCdTxt = checkSvcaSrvcCdTxtConstraints(value);
    serializeSvcaSrvcCdTxt(svcaSrvcCdTxt);
  }

  /**
   * Update SvcaSrvcCdTxt with a char[] from an offset and length
   *
   * @param value
   */
  public void setSvcaSrvcCdTxt(char[] source, int sourceIndex) {
    replace(source, sourceIndex, source.length, beginSvcaSrvcCdTxt, svcaSrvcCdTxt.length);
  }

  public void setSvcaSrvcCdTxt(char[] source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginSvcaSrvcCdTxt, svcaSrvcCdTxt.length);
  }

  /**
   * Update SvcaSrvcCdTxt with a char[] from an offset and length to an offset and length
   *
   * @param value
   */
  public void setSvcaSrvcCdTxt(
      char[] source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginSvcaSrvcCdTxt + targetIndex, targetLen);
  }

  /**
   * Update SvcaSrvcCdTxt with another Field
   *
   * @param value
   */
  public void setSvcaSrvcCdTxt(Field source) {
    replace(source, 0, source.length(), beginSvcaSrvcCdTxt, SVCA_SRVC_CD_TXT_LEN);
  }

  /**
   * Update SvcaSrvcCdTxt with another Field from an offset and length
   *
   * @param value
   */
  public void setSvcaSrvcCdTxt(Field source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginSvcaSrvcCdTxt, SVCA_SRVC_CD_TXT_LEN);
  }

  /**
   * Update SvcaSrvcCdTxt with another Field from an offset and length to an offset and length
   *
   * @param value
   */
  public void setSvcaSrvcCdTxt(
      Field source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginSvcaSrvcCdTxt + targetIndex, targetLen);
  }
  /**
   * Returns the value of svcaEffDt
   *
   * @return svcaEffDt
   */
  public char[] getSvcaEffDt() throws CFException {
    if (isSvcaEffDtModified()) {
      svcaEffDt = refreshSvcaEffDt();
    }
    return svcaEffDt;
  }

  /**
   * set variable svcaEffDt Corresponding COBOL Variable is SVCA-EFF-DT
   *
   * @param value
   */
  public void setSvcaEffDt(char[] value) {
    svcaEffDt = checkSvcaEffDtConstraints(value);
    serializeSvcaEffDt(svcaEffDt);
  }

  /**
   * Update SvcaEffDt with a char[] from an offset and length
   *
   * @param value
   */
  public void setSvcaEffDt(char[] source, int sourceIndex) {
    replace(source, sourceIndex, source.length, beginSvcaEffDt, svcaEffDt.length);
  }

  public void setSvcaEffDt(char[] source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginSvcaEffDt, svcaEffDt.length);
  }

  /**
   * Update SvcaEffDt with a char[] from an offset and length to an offset and length
   *
   * @param value
   */
  public void setSvcaEffDt(
      char[] source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginSvcaEffDt + targetIndex, targetLen);
  }

  /**
   * Update SvcaEffDt with another Field
   *
   * @param value
   */
  public void setSvcaEffDt(Field source) {
    replace(source, 0, source.length(), beginSvcaEffDt, SVCA_EFF_DT_LEN);
  }

  /**
   * Update SvcaEffDt with another Field from an offset and length
   *
   * @param value
   */
  public void setSvcaEffDt(Field source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginSvcaEffDt, SVCA_EFF_DT_LEN);
  }

  /**
   * Update SvcaEffDt with another Field from an offset and length to an offset and length
   *
   * @param value
   */
  public void setSvcaEffDt(
      Field source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginSvcaEffDt + targetIndex, targetLen);
  }
  /**
   * Returns the value of svcaCancDt
   *
   * @return svcaCancDt
   */
  public char[] getSvcaCancDt() throws CFException {
    if (isSvcaCancDtModified()) {
      svcaCancDt = refreshSvcaCancDt();
    }
    return svcaCancDt;
  }

  /**
   * set variable svcaCancDt Corresponding COBOL Variable is SVCA-CANC-DT
   *
   * @param value
   */
  public void setSvcaCancDt(char[] value) {
    svcaCancDt = checkSvcaCancDtConstraints(value);
    serializeSvcaCancDt(svcaCancDt);
  }

  /**
   * Update SvcaCancDt with a char[] from an offset and length
   *
   * @param value
   */
  public void setSvcaCancDt(char[] source, int sourceIndex) {
    replace(source, sourceIndex, source.length, beginSvcaCancDt, svcaCancDt.length);
  }

  public void setSvcaCancDt(char[] source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginSvcaCancDt, svcaCancDt.length);
  }

  /**
   * Update SvcaCancDt with a char[] from an offset and length to an offset and length
   *
   * @param value
   */
  public void setSvcaCancDt(
      char[] source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginSvcaCancDt + targetIndex, targetLen);
  }

  /**
   * Update SvcaCancDt with another Field
   *
   * @param value
   */
  public void setSvcaCancDt(Field source) {
    replace(source, 0, source.length(), beginSvcaCancDt, SVCA_CANC_DT_LEN);
  }

  /**
   * Update SvcaCancDt with another Field from an offset and length
   *
   * @param value
   */
  public void setSvcaCancDt(Field source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginSvcaCancDt, SVCA_CANC_DT_LEN);
  }

  /**
   * Update SvcaCancDt with another Field from an offset and length to an offset and length
   *
   * @param value
   */
  public void setSvcaCancDt(
      Field source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginSvcaCancDt + targetIndex, targetLen);
  }
  /**
   * Returns the value of svcaLstUpdtDttm
   *
   * @return svcaLstUpdtDttm
   */
  public char[] getSvcaLstUpdtDttm() throws CFException {
    if (isSvcaLstUpdtDttmModified()) {
      svcaLstUpdtDttm = refreshSvcaLstUpdtDttm();
    }
    return svcaLstUpdtDttm;
  }

  /**
   * set variable svcaLstUpdtDttm Corresponding COBOL Variable is SVCA-LST-UPDT-DTTM
   *
   * @param value
   */
  public void setSvcaLstUpdtDttm(char[] value) {
    svcaLstUpdtDttm = checkSvcaLstUpdtDttmConstraints(value);
    serializeSvcaLstUpdtDttm(svcaLstUpdtDttm);
  }

  /**
   * Update SvcaLstUpdtDttm with a char[] from an offset and length
   *
   * @param value
   */
  public void setSvcaLstUpdtDttm(char[] source, int sourceIndex) {
    replace(source, sourceIndex, source.length, beginSvcaLstUpdtDttm, svcaLstUpdtDttm.length);
  }

  public void setSvcaLstUpdtDttm(char[] source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginSvcaLstUpdtDttm, svcaLstUpdtDttm.length);
  }

  /**
   * Update SvcaLstUpdtDttm with a char[] from an offset and length to an offset and length
   *
   * @param value
   */
  public void setSvcaLstUpdtDttm(
      char[] source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginSvcaLstUpdtDttm + targetIndex, targetLen);
  }

  /**
   * Update SvcaLstUpdtDttm with another Field
   *
   * @param value
   */
  public void setSvcaLstUpdtDttm(Field source) {
    replace(source, 0, source.length(), beginSvcaLstUpdtDttm, SVCA_LST_UPDT_DTTM_LEN);
  }

  /**
   * Update SvcaLstUpdtDttm with another Field from an offset and length
   *
   * @param value
   */
  public void setSvcaLstUpdtDttm(Field source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginSvcaLstUpdtDttm, SVCA_LST_UPDT_DTTM_LEN);
  }

  /**
   * Update SvcaLstUpdtDttm with another Field from an offset and length to an offset and length
   *
   * @param value
   */
  public void setSvcaLstUpdtDttm(
      Field source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginSvcaLstUpdtDttm + targetIndex, targetLen);
  }
  /**
   * Returns the value of svcaLstUpdtUserId
   *
   * @return svcaLstUpdtUserId
   */
  public char[] getSvcaLstUpdtUserId() throws CFException {
    if (isSvcaLstUpdtUserIdModified()) {
      svcaLstUpdtUserId = refreshSvcaLstUpdtUserId();
    }
    return svcaLstUpdtUserId;
  }

  /**
   * set variable svcaLstUpdtUserId Corresponding COBOL Variable is SVCA-LST-UPDT-USER-ID
   *
   * @param value
   */
  public void setSvcaLstUpdtUserId(char[] value) {
    svcaLstUpdtUserId = checkSvcaLstUpdtUserIdConstraints(value);
    serializeSvcaLstUpdtUserId(svcaLstUpdtUserId);
  }

  /**
   * Update SvcaLstUpdtUserId with a char[] from an offset and length
   *
   * @param value
   */
  public void setSvcaLstUpdtUserId(char[] source, int sourceIndex) {
    replace(source, sourceIndex, source.length, beginSvcaLstUpdtUserId, svcaLstUpdtUserId.length);
  }

  public void setSvcaLstUpdtUserId(char[] source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginSvcaLstUpdtUserId, svcaLstUpdtUserId.length);
  }

  /**
   * Update SvcaLstUpdtUserId with a char[] from an offset and length to an offset and length
   *
   * @param value
   */
  public void setSvcaLstUpdtUserId(
      char[] source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginSvcaLstUpdtUserId + targetIndex, targetLen);
  }

  /**
   * Update SvcaLstUpdtUserId with another Field
   *
   * @param value
   */
  public void setSvcaLstUpdtUserId(Field source) {
    replace(source, 0, source.length(), beginSvcaLstUpdtUserId, SVCA_LST_UPDT_USER_ID_LEN);
  }

  /**
   * Update SvcaLstUpdtUserId with another Field from an offset and length
   *
   * @param value
   */
  public void setSvcaLstUpdtUserId(Field source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginSvcaLstUpdtUserId, SVCA_LST_UPDT_USER_ID_LEN);
  }

  /**
   * Update SvcaLstUpdtUserId with another Field from an offset and length to an offset and length
   *
   * @param value
   */
  public void setSvcaLstUpdtUserId(
      Field source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginSvcaLstUpdtUserId + targetIndex, targetLen);
  }

  /**
   * initializes DclsrvcCdTransTbl String fields defaults to Spaces short/int/long defaults to zero
   * BigDecimal defaults to BigDecimal.ZERO
   */
  public void initialize() {
    setSvcaSrvcCd(CONSTANTS.SPACE_6);
    setSvcaSrvcCdNbr(CONSTANTS.SPACE_3);
    setSvcaSrvcCdTxt(CONSTANTS.SPACE_20);
    setSvcaEffDt(CONSTANTS.SPACE_10);
    setSvcaCancDt(CONSTANTS.SPACE_10);
    setSvcaLstUpdtDttm(CONSTANTS.SPACE_26);
    setSvcaLstUpdtUserId(CONSTANTS.SPACE_9);
  }

  public static int getDclsrvcCdTransTblFieldLength() {
    return DCLSRVC_CD_TRANS_TBL_LENGTH;
  }
}
