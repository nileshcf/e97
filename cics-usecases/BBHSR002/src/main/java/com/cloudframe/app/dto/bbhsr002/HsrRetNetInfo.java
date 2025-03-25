package com.cloudframe.app.dto.bbhsr002;

/**
 * The class HsrRetNetInfo is used to handle fields declared in it
 *
 * @author CloudFrame Inc. created on 2025-03-25 at 08:29. using version 5.0.0.231
 */
import com.cloudframe.app.common.CONSTANTS;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.dto.serialize.bbhsr002.*;
import com.cloudframe.app.exception.CFException;

public class HsrRetNetInfo extends HsrRetNetInfoSerialized {

  private char[] hsrRetSlotTblId = Field.fillLowValue(6);

  private char[] hsrRetSrvcCd = Field.fillLowValue(6);

  private char[] hsrRetPlOfSrvcCd = Field.fillLowValue(2);

  private char[] hsrRetCausCd = Field.fillLowValue(1);

  private char[] hsrRetBenLvlCd = Field.fillLowValue(1);

  private char[] hsrRetNetInd = Field.fillLowValue(1);

  private char[] hsrRetInNtwkClssCd = Field.fillLowValue(1);

  private char[] hsrRetT1NtwkClssCd = Field.fillLowValue(1);

  private char[] hsrRetSrvcCdNbr = Field.fillLowValue(3);

  private char[] hsrRetProcRangeFrom = Field.fillLowValue(5);

  private char[] hsrRetProcRangeTo = Field.fillLowValue(5);

  private char[] hsrRetProcCdType = Field.fillLowValue(1);

  private char[] hsrRetProvOrgTypCd = Field.fillLowValue(3);

  private char[] hsrRetHipaaCommtTxt = Field.fillLowValue(300);

  /** Constructor for HsrRetNetInfo */
  public HsrRetNetInfo() {
    // TO-DO auto generated code
  }

  /**
   * Constructor for HsrRetNetInfo. sets the parent value to the parent
   *
   * @param parent
   * @param begin
   */
  public HsrRetNetInfo(Field parent, int begin) {
    setParent(parent, begin);
  }

  /**
   * Returns the value of hsrRetSlotTblId
   *
   * @return hsrRetSlotTblId
   */
  public char[] getHsrRetSlotTblId() throws CFException {
    if (isHsrRetSlotTblIdModified()) {
      hsrRetSlotTblId = refreshHsrRetSlotTblId();
    }
    return hsrRetSlotTblId;
  }

  /**
   * set variable hsrRetSlotTblId Corresponding COBOL Variable is HSR-RET-SLOT-TBL-ID
   *
   * @param value
   */
  public void setHsrRetSlotTblId(char[] value) {
    hsrRetSlotTblId = checkHsrRetSlotTblIdConstraints(value);
    serializeHsrRetSlotTblId(hsrRetSlotTblId);
  }

  /**
   * Update HsrRetSlotTblId with a char[] from an offset and length
   *
   * @param value
   */
  public void setHsrRetSlotTblId(char[] source, int sourceIndex) {
    replace(source, sourceIndex, source.length, beginHsrRetSlotTblId, hsrRetSlotTblId.length);
  }

  public void setHsrRetSlotTblId(char[] source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginHsrRetSlotTblId, hsrRetSlotTblId.length);
  }

  /**
   * Update HsrRetSlotTblId with a char[] from an offset and length to an offset and length
   *
   * @param value
   */
  public void setHsrRetSlotTblId(
      char[] source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginHsrRetSlotTblId + targetIndex, targetLen);
  }

  /**
   * Update HsrRetSlotTblId with another Field
   *
   * @param value
   */
  public void setHsrRetSlotTblId(Field source) {
    replace(source, 0, source.length(), beginHsrRetSlotTblId, HSR_RET_SLOT_TBL_ID_LEN);
  }

  /**
   * Update HsrRetSlotTblId with another Field from an offset and length
   *
   * @param value
   */
  public void setHsrRetSlotTblId(Field source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginHsrRetSlotTblId, HSR_RET_SLOT_TBL_ID_LEN);
  }

  /**
   * Update HsrRetSlotTblId with another Field from an offset and length to an offset and length
   *
   * @param value
   */
  public void setHsrRetSlotTblId(
      Field source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginHsrRetSlotTblId + targetIndex, targetLen);
  }
  /**
   * Returns the value of hsrRetSrvcCd
   *
   * @return hsrRetSrvcCd
   */
  public char[] getHsrRetSrvcCd() throws CFException {
    if (isHsrRetSrvcCdModified()) {
      hsrRetSrvcCd = refreshHsrRetSrvcCd();
    }
    return hsrRetSrvcCd;
  }

  /**
   * set variable hsrRetSrvcCd Corresponding COBOL Variable is HSR-RET-SRVC-CD
   *
   * @param value
   */
  public void setHsrRetSrvcCd(char[] value) {
    hsrRetSrvcCd = checkHsrRetSrvcCdConstraints(value);
    serializeHsrRetSrvcCd(hsrRetSrvcCd);
  }

  /**
   * Update HsrRetSrvcCd with a char[] from an offset and length
   *
   * @param value
   */
  public void setHsrRetSrvcCd(char[] source, int sourceIndex) {
    replace(source, sourceIndex, source.length, beginHsrRetSrvcCd, hsrRetSrvcCd.length);
  }

  public void setHsrRetSrvcCd(char[] source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginHsrRetSrvcCd, hsrRetSrvcCd.length);
  }

  /**
   * Update HsrRetSrvcCd with a char[] from an offset and length to an offset and length
   *
   * @param value
   */
  public void setHsrRetSrvcCd(
      char[] source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginHsrRetSrvcCd + targetIndex, targetLen);
  }

  /**
   * Update HsrRetSrvcCd with another Field
   *
   * @param value
   */
  public void setHsrRetSrvcCd(Field source) {
    replace(source, 0, source.length(), beginHsrRetSrvcCd, HSR_RET_SRVC_CD_LEN);
  }

  /**
   * Update HsrRetSrvcCd with another Field from an offset and length
   *
   * @param value
   */
  public void setHsrRetSrvcCd(Field source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginHsrRetSrvcCd, HSR_RET_SRVC_CD_LEN);
  }

  /**
   * Update HsrRetSrvcCd with another Field from an offset and length to an offset and length
   *
   * @param value
   */
  public void setHsrRetSrvcCd(
      Field source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginHsrRetSrvcCd + targetIndex, targetLen);
  }
  /**
   * Returns the value of hsrRetPlOfSrvcCd
   *
   * @return hsrRetPlOfSrvcCd
   */
  public char[] getHsrRetPlOfSrvcCd() throws CFException {
    if (isHsrRetPlOfSrvcCdModified()) {
      hsrRetPlOfSrvcCd = refreshHsrRetPlOfSrvcCd();
    }
    return hsrRetPlOfSrvcCd;
  }

  /**
   * set variable hsrRetPlOfSrvcCd Corresponding COBOL Variable is HSR-RET-PL-OF-SRVC-CD
   *
   * @param value
   */
  public void setHsrRetPlOfSrvcCd(char[] value) {
    hsrRetPlOfSrvcCd = checkHsrRetPlOfSrvcCdConstraints(value);
    serializeHsrRetPlOfSrvcCd(hsrRetPlOfSrvcCd);
  }

  /**
   * Update HsrRetPlOfSrvcCd with a char[] from an offset and length
   *
   * @param value
   */
  public void setHsrRetPlOfSrvcCd(char[] source, int sourceIndex) {
    replace(source, sourceIndex, source.length, beginHsrRetPlOfSrvcCd, hsrRetPlOfSrvcCd.length);
  }

  public void setHsrRetPlOfSrvcCd(char[] source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginHsrRetPlOfSrvcCd, hsrRetPlOfSrvcCd.length);
  }

  /**
   * Update HsrRetPlOfSrvcCd with a char[] from an offset and length to an offset and length
   *
   * @param value
   */
  public void setHsrRetPlOfSrvcCd(
      char[] source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginHsrRetPlOfSrvcCd + targetIndex, targetLen);
  }

  /**
   * Update HsrRetPlOfSrvcCd with another Field
   *
   * @param value
   */
  public void setHsrRetPlOfSrvcCd(Field source) {
    replace(source, 0, source.length(), beginHsrRetPlOfSrvcCd, HSR_RET_PL_OF_SRVC_CD_LEN);
  }

  /**
   * Update HsrRetPlOfSrvcCd with another Field from an offset and length
   *
   * @param value
   */
  public void setHsrRetPlOfSrvcCd(Field source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginHsrRetPlOfSrvcCd, HSR_RET_PL_OF_SRVC_CD_LEN);
  }

  /**
   * Update HsrRetPlOfSrvcCd with another Field from an offset and length to an offset and length
   *
   * @param value
   */
  public void setHsrRetPlOfSrvcCd(
      Field source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginHsrRetPlOfSrvcCd + targetIndex, targetLen);
  }
  /**
   * Returns the value of hsrRetCausCd
   *
   * @return hsrRetCausCd
   */
  public char[] getHsrRetCausCd() throws CFException {
    if (isHsrRetCausCdModified()) {
      hsrRetCausCd = refreshHsrRetCausCd();
    }
    return hsrRetCausCd;
  }

  /**
   * set variable hsrRetCausCd Corresponding COBOL Variable is HSR-RET-CAUS-CD
   *
   * @param value
   */
  public void setHsrRetCausCd(char[] value) {
    hsrRetCausCd = checkHsrRetCausCdConstraints(value);
    serializeHsrRetCausCd(hsrRetCausCd);
  }

  /**
   * Update HsrRetCausCd with a char[] from an offset and length
   *
   * @param value
   */
  public void setHsrRetCausCd(char[] source, int sourceIndex) {
    replace(source, sourceIndex, source.length, beginHsrRetCausCd, hsrRetCausCd.length);
  }

  public void setHsrRetCausCd(char[] source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginHsrRetCausCd, hsrRetCausCd.length);
  }

  /**
   * Update HsrRetCausCd with a char[] from an offset and length to an offset and length
   *
   * @param value
   */
  public void setHsrRetCausCd(
      char[] source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginHsrRetCausCd + targetIndex, targetLen);
  }

  /**
   * Update HsrRetCausCd with another Field
   *
   * @param value
   */
  public void setHsrRetCausCd(Field source) {
    replace(source, 0, source.length(), beginHsrRetCausCd, HSR_RET_CAUS_CD_LEN);
  }

  /**
   * Update HsrRetCausCd with another Field from an offset and length
   *
   * @param value
   */
  public void setHsrRetCausCd(Field source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginHsrRetCausCd, HSR_RET_CAUS_CD_LEN);
  }

  /**
   * Update HsrRetCausCd with another Field from an offset and length to an offset and length
   *
   * @param value
   */
  public void setHsrRetCausCd(
      Field source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginHsrRetCausCd + targetIndex, targetLen);
  }
  /**
   * Returns the value of hsrRetBenLvlCd
   *
   * @return hsrRetBenLvlCd
   */
  public char[] getHsrRetBenLvlCd() throws CFException {
    if (isHsrRetBenLvlCdModified()) {
      hsrRetBenLvlCd = refreshHsrRetBenLvlCd();
    }
    return hsrRetBenLvlCd;
  }

  /**
   * set variable hsrRetBenLvlCd Corresponding COBOL Variable is HSR-RET-BEN-LVL-CD
   *
   * @param value
   */
  public void setHsrRetBenLvlCd(char[] value) {
    hsrRetBenLvlCd = checkHsrRetBenLvlCdConstraints(value);
    serializeHsrRetBenLvlCd(hsrRetBenLvlCd);
  }

  /**
   * Update HsrRetBenLvlCd with a char[] from an offset and length
   *
   * @param value
   */
  public void setHsrRetBenLvlCd(char[] source, int sourceIndex) {
    replace(source, sourceIndex, source.length, beginHsrRetBenLvlCd, hsrRetBenLvlCd.length);
  }

  public void setHsrRetBenLvlCd(char[] source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginHsrRetBenLvlCd, hsrRetBenLvlCd.length);
  }

  /**
   * Update HsrRetBenLvlCd with a char[] from an offset and length to an offset and length
   *
   * @param value
   */
  public void setHsrRetBenLvlCd(
      char[] source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginHsrRetBenLvlCd + targetIndex, targetLen);
  }

  /**
   * Update HsrRetBenLvlCd with another Field
   *
   * @param value
   */
  public void setHsrRetBenLvlCd(Field source) {
    replace(source, 0, source.length(), beginHsrRetBenLvlCd, HSR_RET_BEN_LVL_CD_LEN);
  }

  /**
   * Update HsrRetBenLvlCd with another Field from an offset and length
   *
   * @param value
   */
  public void setHsrRetBenLvlCd(Field source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginHsrRetBenLvlCd, HSR_RET_BEN_LVL_CD_LEN);
  }

  /**
   * Update HsrRetBenLvlCd with another Field from an offset and length to an offset and length
   *
   * @param value
   */
  public void setHsrRetBenLvlCd(
      Field source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginHsrRetBenLvlCd + targetIndex, targetLen);
  }
  /**
   * Returns the value of hsrRetNetInd
   *
   * @return hsrRetNetInd
   */
  public char[] getHsrRetNetInd() throws CFException {
    if (isHsrRetNetIndModified()) {
      hsrRetNetInd = refreshHsrRetNetInd();
    }
    return hsrRetNetInd;
  }

  /**
   * set variable hsrRetNetInd Corresponding COBOL Variable is HSR-RET-NET-IND
   *
   * @param value
   */
  public void setHsrRetNetInd(char[] value) {
    hsrRetNetInd = checkHsrRetNetIndConstraints(value);
    serializeHsrRetNetInd(hsrRetNetInd);
  }

  /**
   * Update HsrRetNetInd with a char[] from an offset and length
   *
   * @param value
   */
  public void setHsrRetNetInd(char[] source, int sourceIndex) {
    replace(source, sourceIndex, source.length, beginHsrRetNetInd, hsrRetNetInd.length);
  }

  public void setHsrRetNetInd(char[] source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginHsrRetNetInd, hsrRetNetInd.length);
  }

  /**
   * Update HsrRetNetInd with a char[] from an offset and length to an offset and length
   *
   * @param value
   */
  public void setHsrRetNetInd(
      char[] source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginHsrRetNetInd + targetIndex, targetLen);
  }

  /**
   * Update HsrRetNetInd with another Field
   *
   * @param value
   */
  public void setHsrRetNetInd(Field source) {
    replace(source, 0, source.length(), beginHsrRetNetInd, HSR_RET_NET_IND_LEN);
  }

  /**
   * Update HsrRetNetInd with another Field from an offset and length
   *
   * @param value
   */
  public void setHsrRetNetInd(Field source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginHsrRetNetInd, HSR_RET_NET_IND_LEN);
  }

  /**
   * Update HsrRetNetInd with another Field from an offset and length to an offset and length
   *
   * @param value
   */
  public void setHsrRetNetInd(
      Field source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginHsrRetNetInd + targetIndex, targetLen);
  }
  /**
   * Returns the value of hsrRetInNtwkClssCd
   *
   * @return hsrRetInNtwkClssCd
   */
  public char[] getHsrRetInNtwkClssCd() throws CFException {
    if (isHsrRetInNtwkClssCdModified()) {
      hsrRetInNtwkClssCd = refreshHsrRetInNtwkClssCd();
    }
    return hsrRetInNtwkClssCd;
  }

  /**
   * set variable hsrRetInNtwkClssCd Corresponding COBOL Variable is HSR-RET-IN-NTWK-CLSS-CD
   *
   * @param value
   */
  public void setHsrRetInNtwkClssCd(char[] value) {
    hsrRetInNtwkClssCd = checkHsrRetInNtwkClssCdConstraints(value);
    serializeHsrRetInNtwkClssCd(hsrRetInNtwkClssCd);
  }

  /**
   * Update HsrRetInNtwkClssCd with a char[] from an offset and length
   *
   * @param value
   */
  public void setHsrRetInNtwkClssCd(char[] source, int sourceIndex) {
    replace(source, sourceIndex, source.length, beginHsrRetInNtwkClssCd, hsrRetInNtwkClssCd.length);
  }

  public void setHsrRetInNtwkClssCd(char[] source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginHsrRetInNtwkClssCd, hsrRetInNtwkClssCd.length);
  }

  /**
   * Update HsrRetInNtwkClssCd with a char[] from an offset and length to an offset and length
   *
   * @param value
   */
  public void setHsrRetInNtwkClssCd(
      char[] source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginHsrRetInNtwkClssCd + targetIndex, targetLen);
  }

  /**
   * Update HsrRetInNtwkClssCd with another Field
   *
   * @param value
   */
  public void setHsrRetInNtwkClssCd(Field source) {
    replace(source, 0, source.length(), beginHsrRetInNtwkClssCd, HSR_RET_IN_NTWK_CLSS_CD_LEN);
  }

  /**
   * Update HsrRetInNtwkClssCd with another Field from an offset and length
   *
   * @param value
   */
  public void setHsrRetInNtwkClssCd(Field source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginHsrRetInNtwkClssCd, HSR_RET_IN_NTWK_CLSS_CD_LEN);
  }

  /**
   * Update HsrRetInNtwkClssCd with another Field from an offset and length to an offset and length
   *
   * @param value
   */
  public void setHsrRetInNtwkClssCd(
      Field source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginHsrRetInNtwkClssCd + targetIndex, targetLen);
  }
  /**
   * Returns the value of hsrRetT1NtwkClssCd
   *
   * @return hsrRetT1NtwkClssCd
   */
  public char[] getHsrRetT1NtwkClssCd() throws CFException {
    if (isHsrRetT1NtwkClssCdModified()) {
      hsrRetT1NtwkClssCd = refreshHsrRetT1NtwkClssCd();
    }
    return hsrRetT1NtwkClssCd;
  }

  /**
   * set variable hsrRetT1NtwkClssCd Corresponding COBOL Variable is HSR-RET-T1-NTWK-CLSS-CD
   *
   * @param value
   */
  public void setHsrRetT1NtwkClssCd(char[] value) {
    hsrRetT1NtwkClssCd = checkHsrRetT1NtwkClssCdConstraints(value);
    serializeHsrRetT1NtwkClssCd(hsrRetT1NtwkClssCd);
  }

  /**
   * Update HsrRetT1NtwkClssCd with a char[] from an offset and length
   *
   * @param value
   */
  public void setHsrRetT1NtwkClssCd(char[] source, int sourceIndex) {
    replace(source, sourceIndex, source.length, beginHsrRetT1NtwkClssCd, hsrRetT1NtwkClssCd.length);
  }

  public void setHsrRetT1NtwkClssCd(char[] source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginHsrRetT1NtwkClssCd, hsrRetT1NtwkClssCd.length);
  }

  /**
   * Update HsrRetT1NtwkClssCd with a char[] from an offset and length to an offset and length
   *
   * @param value
   */
  public void setHsrRetT1NtwkClssCd(
      char[] source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginHsrRetT1NtwkClssCd + targetIndex, targetLen);
  }

  /**
   * Update HsrRetT1NtwkClssCd with another Field
   *
   * @param value
   */
  public void setHsrRetT1NtwkClssCd(Field source) {
    replace(source, 0, source.length(), beginHsrRetT1NtwkClssCd, HSR_RET_T_1_NTWK_CLSS_CD_LEN);
  }

  /**
   * Update HsrRetT1NtwkClssCd with another Field from an offset and length
   *
   * @param value
   */
  public void setHsrRetT1NtwkClssCd(Field source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginHsrRetT1NtwkClssCd, HSR_RET_T_1_NTWK_CLSS_CD_LEN);
  }

  /**
   * Update HsrRetT1NtwkClssCd with another Field from an offset and length to an offset and length
   *
   * @param value
   */
  public void setHsrRetT1NtwkClssCd(
      Field source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginHsrRetT1NtwkClssCd + targetIndex, targetLen);
  }
  /**
   * Returns the value of hsrRetSrvcCdNbr
   *
   * @return hsrRetSrvcCdNbr
   */
  public char[] getHsrRetSrvcCdNbr() throws CFException {
    if (isHsrRetSrvcCdNbrModified()) {
      hsrRetSrvcCdNbr = refreshHsrRetSrvcCdNbr();
    }
    return hsrRetSrvcCdNbr;
  }

  /**
   * set variable hsrRetSrvcCdNbr Corresponding COBOL Variable is HSR-RET-SRVC-CD-NBR
   *
   * @param value
   */
  public void setHsrRetSrvcCdNbr(char[] value) {
    hsrRetSrvcCdNbr = checkHsrRetSrvcCdNbrConstraints(value);
    serializeHsrRetSrvcCdNbr(hsrRetSrvcCdNbr);
  }

  /**
   * Update HsrRetSrvcCdNbr with a char[] from an offset and length
   *
   * @param value
   */
  public void setHsrRetSrvcCdNbr(char[] source, int sourceIndex) {
    replace(source, sourceIndex, source.length, beginHsrRetSrvcCdNbr, hsrRetSrvcCdNbr.length);
  }

  public void setHsrRetSrvcCdNbr(char[] source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginHsrRetSrvcCdNbr, hsrRetSrvcCdNbr.length);
  }

  /**
   * Update HsrRetSrvcCdNbr with a char[] from an offset and length to an offset and length
   *
   * @param value
   */
  public void setHsrRetSrvcCdNbr(
      char[] source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginHsrRetSrvcCdNbr + targetIndex, targetLen);
  }

  /**
   * Update HsrRetSrvcCdNbr with another Field
   *
   * @param value
   */
  public void setHsrRetSrvcCdNbr(Field source) {
    replace(source, 0, source.length(), beginHsrRetSrvcCdNbr, HSR_RET_SRVC_CD_NBR_LEN);
  }

  /**
   * Update HsrRetSrvcCdNbr with another Field from an offset and length
   *
   * @param value
   */
  public void setHsrRetSrvcCdNbr(Field source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginHsrRetSrvcCdNbr, HSR_RET_SRVC_CD_NBR_LEN);
  }

  /**
   * Update HsrRetSrvcCdNbr with another Field from an offset and length to an offset and length
   *
   * @param value
   */
  public void setHsrRetSrvcCdNbr(
      Field source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginHsrRetSrvcCdNbr + targetIndex, targetLen);
  }
  /**
   * Returns the value of hsrRetProcRangeFrom
   *
   * @return hsrRetProcRangeFrom
   */
  public char[] getHsrRetProcRangeFrom() throws CFException {
    if (isHsrRetProcRangeFromModified()) {
      hsrRetProcRangeFrom = refreshHsrRetProcRangeFrom();
    }
    return hsrRetProcRangeFrom;
  }

  /**
   * set variable hsrRetProcRangeFrom Corresponding COBOL Variable is HSR-RET-PROC-RANGE-FROM
   *
   * @param value
   */
  public void setHsrRetProcRangeFrom(char[] value) {
    hsrRetProcRangeFrom = checkHsrRetProcRangeFromConstraints(value);
    serializeHsrRetProcRangeFrom(hsrRetProcRangeFrom);
  }

  /**
   * Update HsrRetProcRangeFrom with a char[] from an offset and length
   *
   * @param value
   */
  public void setHsrRetProcRangeFrom(char[] source, int sourceIndex) {
    replace(
        source, sourceIndex, source.length, beginHsrRetProcRangeFrom, hsrRetProcRangeFrom.length);
  }

  public void setHsrRetProcRangeFrom(char[] source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginHsrRetProcRangeFrom, hsrRetProcRangeFrom.length);
  }

  /**
   * Update HsrRetProcRangeFrom with a char[] from an offset and length to an offset and length
   *
   * @param value
   */
  public void setHsrRetProcRangeFrom(
      char[] source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginHsrRetProcRangeFrom + targetIndex, targetLen);
  }

  /**
   * Update HsrRetProcRangeFrom with another Field
   *
   * @param value
   */
  public void setHsrRetProcRangeFrom(Field source) {
    replace(source, 0, source.length(), beginHsrRetProcRangeFrom, HSR_RET_PROC_RANGE_FROM_LEN);
  }

  /**
   * Update HsrRetProcRangeFrom with another Field from an offset and length
   *
   * @param value
   */
  public void setHsrRetProcRangeFrom(Field source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginHsrRetProcRangeFrom, HSR_RET_PROC_RANGE_FROM_LEN);
  }

  /**
   * Update HsrRetProcRangeFrom with another Field from an offset and length to an offset and length
   *
   * @param value
   */
  public void setHsrRetProcRangeFrom(
      Field source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginHsrRetProcRangeFrom + targetIndex, targetLen);
  }
  /**
   * Returns the value of hsrRetProcRangeTo
   *
   * @return hsrRetProcRangeTo
   */
  public char[] getHsrRetProcRangeTo() throws CFException {
    if (isHsrRetProcRangeToModified()) {
      hsrRetProcRangeTo = refreshHsrRetProcRangeTo();
    }
    return hsrRetProcRangeTo;
  }

  /**
   * set variable hsrRetProcRangeTo Corresponding COBOL Variable is HSR-RET-PROC-RANGE-TO
   *
   * @param value
   */
  public void setHsrRetProcRangeTo(char[] value) {
    hsrRetProcRangeTo = checkHsrRetProcRangeToConstraints(value);
    serializeHsrRetProcRangeTo(hsrRetProcRangeTo);
  }

  /**
   * Update HsrRetProcRangeTo with a char[] from an offset and length
   *
   * @param value
   */
  public void setHsrRetProcRangeTo(char[] source, int sourceIndex) {
    replace(source, sourceIndex, source.length, beginHsrRetProcRangeTo, hsrRetProcRangeTo.length);
  }

  public void setHsrRetProcRangeTo(char[] source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginHsrRetProcRangeTo, hsrRetProcRangeTo.length);
  }

  /**
   * Update HsrRetProcRangeTo with a char[] from an offset and length to an offset and length
   *
   * @param value
   */
  public void setHsrRetProcRangeTo(
      char[] source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginHsrRetProcRangeTo + targetIndex, targetLen);
  }

  /**
   * Update HsrRetProcRangeTo with another Field
   *
   * @param value
   */
  public void setHsrRetProcRangeTo(Field source) {
    replace(source, 0, source.length(), beginHsrRetProcRangeTo, HSR_RET_PROC_RANGE_TO_LEN);
  }

  /**
   * Update HsrRetProcRangeTo with another Field from an offset and length
   *
   * @param value
   */
  public void setHsrRetProcRangeTo(Field source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginHsrRetProcRangeTo, HSR_RET_PROC_RANGE_TO_LEN);
  }

  /**
   * Update HsrRetProcRangeTo with another Field from an offset and length to an offset and length
   *
   * @param value
   */
  public void setHsrRetProcRangeTo(
      Field source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginHsrRetProcRangeTo + targetIndex, targetLen);
  }
  /**
   * Returns the value of hsrRetProcCdType
   *
   * @return hsrRetProcCdType
   */
  public char[] getHsrRetProcCdType() throws CFException {
    if (isHsrRetProcCdTypeModified()) {
      hsrRetProcCdType = refreshHsrRetProcCdType();
    }
    return hsrRetProcCdType;
  }

  /**
   * set variable hsrRetProcCdType Corresponding COBOL Variable is HSR-RET-PROC-CD-TYPE
   *
   * @param value
   */
  public void setHsrRetProcCdType(char[] value) {
    hsrRetProcCdType = checkHsrRetProcCdTypeConstraints(value);
    serializeHsrRetProcCdType(hsrRetProcCdType);
  }

  /**
   * Update HsrRetProcCdType with a char[] from an offset and length
   *
   * @param value
   */
  public void setHsrRetProcCdType(char[] source, int sourceIndex) {
    replace(source, sourceIndex, source.length, beginHsrRetProcCdType, hsrRetProcCdType.length);
  }

  public void setHsrRetProcCdType(char[] source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginHsrRetProcCdType, hsrRetProcCdType.length);
  }

  /**
   * Update HsrRetProcCdType with a char[] from an offset and length to an offset and length
   *
   * @param value
   */
  public void setHsrRetProcCdType(
      char[] source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginHsrRetProcCdType + targetIndex, targetLen);
  }

  /**
   * Update HsrRetProcCdType with another Field
   *
   * @param value
   */
  public void setHsrRetProcCdType(Field source) {
    replace(source, 0, source.length(), beginHsrRetProcCdType, HSR_RET_PROC_CD_TYPE_LEN);
  }

  /**
   * Update HsrRetProcCdType with another Field from an offset and length
   *
   * @param value
   */
  public void setHsrRetProcCdType(Field source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginHsrRetProcCdType, HSR_RET_PROC_CD_TYPE_LEN);
  }

  /**
   * Update HsrRetProcCdType with another Field from an offset and length to an offset and length
   *
   * @param value
   */
  public void setHsrRetProcCdType(
      Field source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginHsrRetProcCdType + targetIndex, targetLen);
  }
  /**
   * Returns the value of hsrRetProvOrgTypCd
   *
   * @return hsrRetProvOrgTypCd
   */
  public char[] getHsrRetProvOrgTypCd() throws CFException {
    if (isHsrRetProvOrgTypCdModified()) {
      hsrRetProvOrgTypCd = refreshHsrRetProvOrgTypCd();
    }
    return hsrRetProvOrgTypCd;
  }

  /**
   * set variable hsrRetProvOrgTypCd Corresponding COBOL Variable is HSR-RET-PROV-ORG-TYP-CD
   *
   * @param value
   */
  public void setHsrRetProvOrgTypCd(char[] value) {
    hsrRetProvOrgTypCd = checkHsrRetProvOrgTypCdConstraints(value);
    serializeHsrRetProvOrgTypCd(hsrRetProvOrgTypCd);
  }

  /**
   * Update HsrRetProvOrgTypCd with a char[] from an offset and length
   *
   * @param value
   */
  public void setHsrRetProvOrgTypCd(char[] source, int sourceIndex) {
    replace(source, sourceIndex, source.length, beginHsrRetProvOrgTypCd, hsrRetProvOrgTypCd.length);
  }

  public void setHsrRetProvOrgTypCd(char[] source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginHsrRetProvOrgTypCd, hsrRetProvOrgTypCd.length);
  }

  /**
   * Update HsrRetProvOrgTypCd with a char[] from an offset and length to an offset and length
   *
   * @param value
   */
  public void setHsrRetProvOrgTypCd(
      char[] source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginHsrRetProvOrgTypCd + targetIndex, targetLen);
  }

  /**
   * Update HsrRetProvOrgTypCd with another Field
   *
   * @param value
   */
  public void setHsrRetProvOrgTypCd(Field source) {
    replace(source, 0, source.length(), beginHsrRetProvOrgTypCd, HSR_RET_PROV_ORG_TYP_CD_LEN);
  }

  /**
   * Update HsrRetProvOrgTypCd with another Field from an offset and length
   *
   * @param value
   */
  public void setHsrRetProvOrgTypCd(Field source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginHsrRetProvOrgTypCd, HSR_RET_PROV_ORG_TYP_CD_LEN);
  }

  /**
   * Update HsrRetProvOrgTypCd with another Field from an offset and length to an offset and length
   *
   * @param value
   */
  public void setHsrRetProvOrgTypCd(
      Field source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginHsrRetProvOrgTypCd + targetIndex, targetLen);
  }
  /**
   * Returns the value of hsrRetHipaaCommtTxt
   *
   * @return hsrRetHipaaCommtTxt
   */
  public char[] getHsrRetHipaaCommtTxt() throws CFException {
    if (isHsrRetHipaaCommtTxtModified()) {
      hsrRetHipaaCommtTxt = refreshHsrRetHipaaCommtTxt();
    }
    return hsrRetHipaaCommtTxt;
  }

  /**
   * set variable hsrRetHipaaCommtTxt Corresponding COBOL Variable is HSR-RET-HIPAA-COMMT-TXT
   *
   * @param value
   */
  public void setHsrRetHipaaCommtTxt(char[] value) {
    hsrRetHipaaCommtTxt = checkHsrRetHipaaCommtTxtConstraints(value);
    serializeHsrRetHipaaCommtTxt(hsrRetHipaaCommtTxt);
  }

  /**
   * Update HsrRetHipaaCommtTxt with a char[] from an offset and length
   *
   * @param value
   */
  public void setHsrRetHipaaCommtTxt(char[] source, int sourceIndex) {
    replace(
        source, sourceIndex, source.length, beginHsrRetHipaaCommtTxt, hsrRetHipaaCommtTxt.length);
  }

  public void setHsrRetHipaaCommtTxt(char[] source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginHsrRetHipaaCommtTxt, hsrRetHipaaCommtTxt.length);
  }

  /**
   * Update HsrRetHipaaCommtTxt with a char[] from an offset and length to an offset and length
   *
   * @param value
   */
  public void setHsrRetHipaaCommtTxt(
      char[] source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginHsrRetHipaaCommtTxt + targetIndex, targetLen);
  }

  /**
   * Update HsrRetHipaaCommtTxt with another Field
   *
   * @param value
   */
  public void setHsrRetHipaaCommtTxt(Field source) {
    replace(source, 0, source.length(), beginHsrRetHipaaCommtTxt, HSR_RET_HIPAA_COMMT_TXT_LEN);
  }

  /**
   * Update HsrRetHipaaCommtTxt with another Field from an offset and length
   *
   * @param value
   */
  public void setHsrRetHipaaCommtTxt(Field source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginHsrRetHipaaCommtTxt, HSR_RET_HIPAA_COMMT_TXT_LEN);
  }

  /**
   * Update HsrRetHipaaCommtTxt with another Field from an offset and length to an offset and length
   *
   * @param value
   */
  public void setHsrRetHipaaCommtTxt(
      Field source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginHsrRetHipaaCommtTxt + targetIndex, targetLen);
  }

  /**
   * initializes HsrRetNetInfo String fields defaults to Spaces short/int/long defaults to zero
   * BigDecimal defaults to BigDecimal.ZERO
   */
  public void initialize() {
    setHsrRetSlotTblId(CONSTANTS.SPACE_6);
    setHsrRetSrvcCd(CONSTANTS.SPACE_6);
    setHsrRetPlOfSrvcCd(CONSTANTS.SPACE_2);
    setHsrRetCausCd(CONSTANTS.SPACE);
    setHsrRetBenLvlCd(CONSTANTS.SPACE);
    setHsrRetNetInd(CONSTANTS.SPACE);
    setHsrRetInNtwkClssCd(CONSTANTS.SPACE);
    setHsrRetT1NtwkClssCd(CONSTANTS.SPACE);
    setHsrRetSrvcCdNbr(CONSTANTS.SPACE_3);
    setHsrRetProcRangeFrom(CONSTANTS.SPACE_5);
    setHsrRetProcRangeTo(CONSTANTS.SPACE_5);
    setHsrRetProcCdType(CONSTANTS.SPACE);
    setHsrRetProvOrgTypCd(CONSTANTS.SPACE_3);
    setHsrRetHipaaCommtTxt(CONSTANTS.SPACE_300);
  }

  public static int getHsrRetNetInfoFieldLength() {
    return HSR_RET_NET_INFO_LENGTH;
  }
}
