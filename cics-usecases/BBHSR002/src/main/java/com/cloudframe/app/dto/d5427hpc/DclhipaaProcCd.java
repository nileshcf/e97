package com.cloudframe.app.dto.d5427hpc;

/**
 * The class DclhipaaProcCd is used to handle fields declared in it
 *
 * @author CloudFrame Inc. created on 2025-03-25 at 08:29. using version 5.0.0.231
 */
import com.cloudframe.app.common.CONSTANTS;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.dto.serialize.d5427hpc.*;
import com.cloudframe.app.exception.CFException;

public class DclhipaaProcCd extends DclhipaaProcCdSerialized {

  private char[] hipaaCd = Field.fillLowValue(2);

  private char[] hipaaVerNbr = Field.fillLowValue(1);

  private char[] effDt = Field.fillLowValue(10);

  private char[] cancDt = Field.fillLowValue(10);

  private char[] creatDttm = Field.fillLowValue(26);

  private char[] lstUpdtDttm = Field.fillLowValue(26);

  private char[] lstUpdtUserId = Field.fillLowValue(9);

  private char[] benFndViewInd = Field.fillLowValue(1);

  private char[] hipaaCdTxt = Field.fillLowValue(50);

  private char[] grnrcRqstCd = Field.fillLowValue(1);

  private char[] hipaaGrpCd = Field.fillLowValue(2);

  /** Constructor for DclhipaaProcCd */
  public DclhipaaProcCd() {
    super();
    /*  set the parent of each child as this which are a group variable */
    /*  end of offset */
  }

  /**
   * Returns the value of hipaaCd
   *
   * @return hipaaCd
   */
  public char[] getHipaaCd() throws CFException {
    if (isHipaaCdModified()) {
      hipaaCd = refreshHipaaCd();
    }
    return hipaaCd;
  }

  /**
   * set variable hipaaCd Corresponding COBOL Variable is HIPAA-CD
   *
   * @param value
   */
  public void setHipaaCd(char[] value) {
    hipaaCd = checkHipaaCdConstraints(value);
    serializeHipaaCd(hipaaCd);
  }

  /**
   * Update HipaaCd with a char[] from an offset and length
   *
   * @param value
   */
  public void setHipaaCd(char[] source, int sourceIndex) {
    replace(source, sourceIndex, source.length, beginHipaaCd, hipaaCd.length);
  }

  public void setHipaaCd(char[] source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginHipaaCd, hipaaCd.length);
  }

  /**
   * Update HipaaCd with a char[] from an offset and length to an offset and length
   *
   * @param value
   */
  public void setHipaaCd(
      char[] source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginHipaaCd + targetIndex, targetLen);
  }

  /**
   * Update HipaaCd with another Field
   *
   * @param value
   */
  public void setHipaaCd(Field source) {
    replace(source, 0, source.length(), beginHipaaCd, HIPAA_CD_LEN);
  }

  /**
   * Update HipaaCd with another Field from an offset and length
   *
   * @param value
   */
  public void setHipaaCd(Field source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginHipaaCd, HIPAA_CD_LEN);
  }

  /**
   * Update HipaaCd with another Field from an offset and length to an offset and length
   *
   * @param value
   */
  public void setHipaaCd(
      Field source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginHipaaCd + targetIndex, targetLen);
  }
  /**
   * Returns the value of hipaaVerNbr
   *
   * @return hipaaVerNbr
   */
  public char[] getHipaaVerNbr() throws CFException {
    if (isHipaaVerNbrModified()) {
      hipaaVerNbr = refreshHipaaVerNbr();
    }
    return hipaaVerNbr;
  }

  /**
   * set variable hipaaVerNbr Corresponding COBOL Variable is HIPAA-VER-NBR
   *
   * @param value
   */
  public void setHipaaVerNbr(char[] value) {
    hipaaVerNbr = checkHipaaVerNbrConstraints(value);
    serializeHipaaVerNbr(hipaaVerNbr);
  }

  /**
   * Update HipaaVerNbr with a char[] from an offset and length
   *
   * @param value
   */
  public void setHipaaVerNbr(char[] source, int sourceIndex) {
    replace(source, sourceIndex, source.length, beginHipaaVerNbr, hipaaVerNbr.length);
  }

  public void setHipaaVerNbr(char[] source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginHipaaVerNbr, hipaaVerNbr.length);
  }

  /**
   * Update HipaaVerNbr with a char[] from an offset and length to an offset and length
   *
   * @param value
   */
  public void setHipaaVerNbr(
      char[] source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginHipaaVerNbr + targetIndex, targetLen);
  }

  /**
   * Update HipaaVerNbr with another Field
   *
   * @param value
   */
  public void setHipaaVerNbr(Field source) {
    replace(source, 0, source.length(), beginHipaaVerNbr, HIPAA_VER_NBR_LEN);
  }

  /**
   * Update HipaaVerNbr with another Field from an offset and length
   *
   * @param value
   */
  public void setHipaaVerNbr(Field source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginHipaaVerNbr, HIPAA_VER_NBR_LEN);
  }

  /**
   * Update HipaaVerNbr with another Field from an offset and length to an offset and length
   *
   * @param value
   */
  public void setHipaaVerNbr(
      Field source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginHipaaVerNbr + targetIndex, targetLen);
  }
  /**
   * Returns the value of effDt
   *
   * @return effDt
   */
  public char[] getEffDt() throws CFException {
    if (isEffDtModified()) {
      effDt = refreshEffDt();
    }
    return effDt;
  }

  /**
   * set variable effDt Corresponding COBOL Variable is EFF-DT
   *
   * @param value
   */
  public void setEffDt(char[] value) {
    effDt = checkEffDtConstraints(value);
    serializeEffDt(effDt);
  }

  /**
   * Update EffDt with a char[] from an offset and length
   *
   * @param value
   */
  public void setEffDt(char[] source, int sourceIndex) {
    replace(source, sourceIndex, source.length, beginEffDt, effDt.length);
  }

  public void setEffDt(char[] source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginEffDt, effDt.length);
  }

  /**
   * Update EffDt with a char[] from an offset and length to an offset and length
   *
   * @param value
   */
  public void setEffDt(
      char[] source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginEffDt + targetIndex, targetLen);
  }

  /**
   * Update EffDt with another Field
   *
   * @param value
   */
  public void setEffDt(Field source) {
    replace(source, 0, source.length(), beginEffDt, EFF_DT_LEN);
  }

  /**
   * Update EffDt with another Field from an offset and length
   *
   * @param value
   */
  public void setEffDt(Field source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginEffDt, EFF_DT_LEN);
  }

  /**
   * Update EffDt with another Field from an offset and length to an offset and length
   *
   * @param value
   */
  public void setEffDt(
      Field source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginEffDt + targetIndex, targetLen);
  }
  /**
   * Returns the value of cancDt
   *
   * @return cancDt
   */
  public char[] getCancDt() throws CFException {
    if (isCancDtModified()) {
      cancDt = refreshCancDt();
    }
    return cancDt;
  }

  /**
   * set variable cancDt Corresponding COBOL Variable is CANC-DT
   *
   * @param value
   */
  public void setCancDt(char[] value) {
    cancDt = checkCancDtConstraints(value);
    serializeCancDt(cancDt);
  }

  /**
   * Update CancDt with a char[] from an offset and length
   *
   * @param value
   */
  public void setCancDt(char[] source, int sourceIndex) {
    replace(source, sourceIndex, source.length, beginCancDt, cancDt.length);
  }

  public void setCancDt(char[] source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginCancDt, cancDt.length);
  }

  /**
   * Update CancDt with a char[] from an offset and length to an offset and length
   *
   * @param value
   */
  public void setCancDt(
      char[] source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginCancDt + targetIndex, targetLen);
  }

  /**
   * Update CancDt with another Field
   *
   * @param value
   */
  public void setCancDt(Field source) {
    replace(source, 0, source.length(), beginCancDt, CANC_DT_LEN);
  }

  /**
   * Update CancDt with another Field from an offset and length
   *
   * @param value
   */
  public void setCancDt(Field source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginCancDt, CANC_DT_LEN);
  }

  /**
   * Update CancDt with another Field from an offset and length to an offset and length
   *
   * @param value
   */
  public void setCancDt(
      Field source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginCancDt + targetIndex, targetLen);
  }
  /**
   * Returns the value of creatDttm
   *
   * @return creatDttm
   */
  public char[] getCreatDttm() throws CFException {
    if (isCreatDttmModified()) {
      creatDttm = refreshCreatDttm();
    }
    return creatDttm;
  }

  /**
   * set variable creatDttm Corresponding COBOL Variable is CREAT-DTTM
   *
   * @param value
   */
  public void setCreatDttm(char[] value) {
    creatDttm = checkCreatDttmConstraints(value);
    serializeCreatDttm(creatDttm);
  }

  /**
   * Update CreatDttm with a char[] from an offset and length
   *
   * @param value
   */
  public void setCreatDttm(char[] source, int sourceIndex) {
    replace(source, sourceIndex, source.length, beginCreatDttm, creatDttm.length);
  }

  public void setCreatDttm(char[] source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginCreatDttm, creatDttm.length);
  }

  /**
   * Update CreatDttm with a char[] from an offset and length to an offset and length
   *
   * @param value
   */
  public void setCreatDttm(
      char[] source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginCreatDttm + targetIndex, targetLen);
  }

  /**
   * Update CreatDttm with another Field
   *
   * @param value
   */
  public void setCreatDttm(Field source) {
    replace(source, 0, source.length(), beginCreatDttm, CREAT_DTTM_LEN);
  }

  /**
   * Update CreatDttm with another Field from an offset and length
   *
   * @param value
   */
  public void setCreatDttm(Field source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginCreatDttm, CREAT_DTTM_LEN);
  }

  /**
   * Update CreatDttm with another Field from an offset and length to an offset and length
   *
   * @param value
   */
  public void setCreatDttm(
      Field source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginCreatDttm + targetIndex, targetLen);
  }
  /**
   * Returns the value of lstUpdtDttm
   *
   * @return lstUpdtDttm
   */
  public char[] getLstUpdtDttm() throws CFException {
    if (isLstUpdtDttmModified()) {
      lstUpdtDttm = refreshLstUpdtDttm();
    }
    return lstUpdtDttm;
  }

  /**
   * set variable lstUpdtDttm Corresponding COBOL Variable is LST-UPDT-DTTM
   *
   * @param value
   */
  public void setLstUpdtDttm(char[] value) {
    lstUpdtDttm = checkLstUpdtDttmConstraints(value);
    serializeLstUpdtDttm(lstUpdtDttm);
  }

  /**
   * Update LstUpdtDttm with a char[] from an offset and length
   *
   * @param value
   */
  public void setLstUpdtDttm(char[] source, int sourceIndex) {
    replace(source, sourceIndex, source.length, beginLstUpdtDttm, lstUpdtDttm.length);
  }

  public void setLstUpdtDttm(char[] source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginLstUpdtDttm, lstUpdtDttm.length);
  }

  /**
   * Update LstUpdtDttm with a char[] from an offset and length to an offset and length
   *
   * @param value
   */
  public void setLstUpdtDttm(
      char[] source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginLstUpdtDttm + targetIndex, targetLen);
  }

  /**
   * Update LstUpdtDttm with another Field
   *
   * @param value
   */
  public void setLstUpdtDttm(Field source) {
    replace(source, 0, source.length(), beginLstUpdtDttm, LST_UPDT_DTTM_LEN);
  }

  /**
   * Update LstUpdtDttm with another Field from an offset and length
   *
   * @param value
   */
  public void setLstUpdtDttm(Field source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginLstUpdtDttm, LST_UPDT_DTTM_LEN);
  }

  /**
   * Update LstUpdtDttm with another Field from an offset and length to an offset and length
   *
   * @param value
   */
  public void setLstUpdtDttm(
      Field source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginLstUpdtDttm + targetIndex, targetLen);
  }
  /**
   * Returns the value of lstUpdtUserId
   *
   * @return lstUpdtUserId
   */
  public char[] getLstUpdtUserId() throws CFException {
    if (isLstUpdtUserIdModified()) {
      lstUpdtUserId = refreshLstUpdtUserId();
    }
    return lstUpdtUserId;
  }

  /**
   * set variable lstUpdtUserId Corresponding COBOL Variable is LST-UPDT-USER-ID
   *
   * @param value
   */
  public void setLstUpdtUserId(char[] value) {
    lstUpdtUserId = checkLstUpdtUserIdConstraints(value);
    serializeLstUpdtUserId(lstUpdtUserId);
  }

  /**
   * Update LstUpdtUserId with a char[] from an offset and length
   *
   * @param value
   */
  public void setLstUpdtUserId(char[] source, int sourceIndex) {
    replace(source, sourceIndex, source.length, beginLstUpdtUserId, lstUpdtUserId.length);
  }

  public void setLstUpdtUserId(char[] source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginLstUpdtUserId, lstUpdtUserId.length);
  }

  /**
   * Update LstUpdtUserId with a char[] from an offset and length to an offset and length
   *
   * @param value
   */
  public void setLstUpdtUserId(
      char[] source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginLstUpdtUserId + targetIndex, targetLen);
  }

  /**
   * Update LstUpdtUserId with another Field
   *
   * @param value
   */
  public void setLstUpdtUserId(Field source) {
    replace(source, 0, source.length(), beginLstUpdtUserId, LST_UPDT_USER_ID_LEN);
  }

  /**
   * Update LstUpdtUserId with another Field from an offset and length
   *
   * @param value
   */
  public void setLstUpdtUserId(Field source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginLstUpdtUserId, LST_UPDT_USER_ID_LEN);
  }

  /**
   * Update LstUpdtUserId with another Field from an offset and length to an offset and length
   *
   * @param value
   */
  public void setLstUpdtUserId(
      Field source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginLstUpdtUserId + targetIndex, targetLen);
  }
  /**
   * Returns the value of benFndViewInd
   *
   * @return benFndViewInd
   */
  public char[] getBenFndViewInd() throws CFException {
    if (isBenFndViewIndModified()) {
      benFndViewInd = refreshBenFndViewInd();
    }
    return benFndViewInd;
  }

  /**
   * set variable benFndViewInd Corresponding COBOL Variable is BEN-FND-VIEW-IND
   *
   * @param value
   */
  public void setBenFndViewInd(char[] value) {
    benFndViewInd = checkBenFndViewIndConstraints(value);
    serializeBenFndViewInd(benFndViewInd);
  }

  /**
   * Update BenFndViewInd with a char[] from an offset and length
   *
   * @param value
   */
  public void setBenFndViewInd(char[] source, int sourceIndex) {
    replace(source, sourceIndex, source.length, beginBenFndViewInd, benFndViewInd.length);
  }

  public void setBenFndViewInd(char[] source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginBenFndViewInd, benFndViewInd.length);
  }

  /**
   * Update BenFndViewInd with a char[] from an offset and length to an offset and length
   *
   * @param value
   */
  public void setBenFndViewInd(
      char[] source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginBenFndViewInd + targetIndex, targetLen);
  }

  /**
   * Update BenFndViewInd with another Field
   *
   * @param value
   */
  public void setBenFndViewInd(Field source) {
    replace(source, 0, source.length(), beginBenFndViewInd, BEN_FND_VIEW_IND_LEN);
  }

  /**
   * Update BenFndViewInd with another Field from an offset and length
   *
   * @param value
   */
  public void setBenFndViewInd(Field source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginBenFndViewInd, BEN_FND_VIEW_IND_LEN);
  }

  /**
   * Update BenFndViewInd with another Field from an offset and length to an offset and length
   *
   * @param value
   */
  public void setBenFndViewInd(
      Field source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginBenFndViewInd + targetIndex, targetLen);
  }
  /**
   * Returns the value of hipaaCdTxt
   *
   * @return hipaaCdTxt
   */
  public char[] getHipaaCdTxt() throws CFException {
    if (isHipaaCdTxtModified()) {
      hipaaCdTxt = refreshHipaaCdTxt();
    }
    return hipaaCdTxt;
  }

  /**
   * set variable hipaaCdTxt Corresponding COBOL Variable is HIPAA-CD-TXT
   *
   * @param value
   */
  public void setHipaaCdTxt(char[] value) {
    hipaaCdTxt = checkHipaaCdTxtConstraints(value);
    serializeHipaaCdTxt(hipaaCdTxt);
  }

  /**
   * Update HipaaCdTxt with a char[] from an offset and length
   *
   * @param value
   */
  public void setHipaaCdTxt(char[] source, int sourceIndex) {
    replace(source, sourceIndex, source.length, beginHipaaCdTxt, hipaaCdTxt.length);
  }

  public void setHipaaCdTxt(char[] source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginHipaaCdTxt, hipaaCdTxt.length);
  }

  /**
   * Update HipaaCdTxt with a char[] from an offset and length to an offset and length
   *
   * @param value
   */
  public void setHipaaCdTxt(
      char[] source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginHipaaCdTxt + targetIndex, targetLen);
  }

  /**
   * Update HipaaCdTxt with another Field
   *
   * @param value
   */
  public void setHipaaCdTxt(Field source) {
    replace(source, 0, source.length(), beginHipaaCdTxt, HIPAA_CD_TXT_LEN);
  }

  /**
   * Update HipaaCdTxt with another Field from an offset and length
   *
   * @param value
   */
  public void setHipaaCdTxt(Field source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginHipaaCdTxt, HIPAA_CD_TXT_LEN);
  }

  /**
   * Update HipaaCdTxt with another Field from an offset and length to an offset and length
   *
   * @param value
   */
  public void setHipaaCdTxt(
      Field source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginHipaaCdTxt + targetIndex, targetLen);
  }
  /**
   * Returns the value of grnrcRqstCd
   *
   * @return grnrcRqstCd
   */
  public char[] getGrnrcRqstCd() throws CFException {
    if (isGrnrcRqstCdModified()) {
      grnrcRqstCd = refreshGrnrcRqstCd();
    }
    return grnrcRqstCd;
  }

  /**
   * set variable grnrcRqstCd Corresponding COBOL Variable is GRNRC-RQST-CD
   *
   * @param value
   */
  public void setGrnrcRqstCd(char[] value) {
    grnrcRqstCd = checkGrnrcRqstCdConstraints(value);
    serializeGrnrcRqstCd(grnrcRqstCd);
  }

  /**
   * Update GrnrcRqstCd with a char[] from an offset and length
   *
   * @param value
   */
  public void setGrnrcRqstCd(char[] source, int sourceIndex) {
    replace(source, sourceIndex, source.length, beginGrnrcRqstCd, grnrcRqstCd.length);
  }

  public void setGrnrcRqstCd(char[] source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginGrnrcRqstCd, grnrcRqstCd.length);
  }

  /**
   * Update GrnrcRqstCd with a char[] from an offset and length to an offset and length
   *
   * @param value
   */
  public void setGrnrcRqstCd(
      char[] source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginGrnrcRqstCd + targetIndex, targetLen);
  }

  /**
   * Update GrnrcRqstCd with another Field
   *
   * @param value
   */
  public void setGrnrcRqstCd(Field source) {
    replace(source, 0, source.length(), beginGrnrcRqstCd, GRNRC_RQST_CD_LEN);
  }

  /**
   * Update GrnrcRqstCd with another Field from an offset and length
   *
   * @param value
   */
  public void setGrnrcRqstCd(Field source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginGrnrcRqstCd, GRNRC_RQST_CD_LEN);
  }

  /**
   * Update GrnrcRqstCd with another Field from an offset and length to an offset and length
   *
   * @param value
   */
  public void setGrnrcRqstCd(
      Field source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginGrnrcRqstCd + targetIndex, targetLen);
  }
  /**
   * Returns the value of hipaaGrpCd
   *
   * @return hipaaGrpCd
   */
  public char[] getHipaaGrpCd() throws CFException {
    if (isHipaaGrpCdModified()) {
      hipaaGrpCd = refreshHipaaGrpCd();
    }
    return hipaaGrpCd;
  }

  /**
   * set variable hipaaGrpCd Corresponding COBOL Variable is HIPAA-GRP-CD
   *
   * @param value
   */
  public void setHipaaGrpCd(char[] value) {
    hipaaGrpCd = checkHipaaGrpCdConstraints(value);
    serializeHipaaGrpCd(hipaaGrpCd);
  }

  /**
   * Update HipaaGrpCd with a char[] from an offset and length
   *
   * @param value
   */
  public void setHipaaGrpCd(char[] source, int sourceIndex) {
    replace(source, sourceIndex, source.length, beginHipaaGrpCd, hipaaGrpCd.length);
  }

  public void setHipaaGrpCd(char[] source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginHipaaGrpCd, hipaaGrpCd.length);
  }

  /**
   * Update HipaaGrpCd with a char[] from an offset and length to an offset and length
   *
   * @param value
   */
  public void setHipaaGrpCd(
      char[] source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginHipaaGrpCd + targetIndex, targetLen);
  }

  /**
   * Update HipaaGrpCd with another Field
   *
   * @param value
   */
  public void setHipaaGrpCd(Field source) {
    replace(source, 0, source.length(), beginHipaaGrpCd, HIPAA_GRP_CD_LEN);
  }

  /**
   * Update HipaaGrpCd with another Field from an offset and length
   *
   * @param value
   */
  public void setHipaaGrpCd(Field source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginHipaaGrpCd, HIPAA_GRP_CD_LEN);
  }

  /**
   * Update HipaaGrpCd with another Field from an offset and length to an offset and length
   *
   * @param value
   */
  public void setHipaaGrpCd(
      Field source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginHipaaGrpCd + targetIndex, targetLen);
  }

  /**
   * initializes DclhipaaProcCd String fields defaults to Spaces short/int/long defaults to zero
   * BigDecimal defaults to BigDecimal.ZERO
   */
  public void initialize() {
    setHipaaCd(CONSTANTS.SPACE_2);
    setHipaaVerNbr(CONSTANTS.SPACE);
    setEffDt(CONSTANTS.SPACE_10);
    setCancDt(CONSTANTS.SPACE_10);
    setCreatDttm(CONSTANTS.SPACE_26);
    setLstUpdtDttm(CONSTANTS.SPACE_26);
    setLstUpdtUserId(CONSTANTS.SPACE_9);
    setBenFndViewInd(CONSTANTS.SPACE);
    setHipaaCdTxt(CONSTANTS.SPACE_50);
    setGrnrcRqstCd(CONSTANTS.SPACE);
    setHipaaGrpCd(CONSTANTS.SPACE_2);
  }

  public static int getDclhipaaProcCdFieldLength() {
    return DCLHIPAA_PROC_CD_LENGTH;
  }
}
