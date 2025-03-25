package com.cloudframe.app.dto.bbhsr002;

/**
 * The class BhiRetBhiData is used to handle fields declared in it
 *
 * @author CloudFrame Inc. created on 2025-03-25 at 08:29. using version 5.0.0.231
 */
import com.cloudframe.app.common.CONSTANTS;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.dto.serialize.bbhsr002.*;
import com.cloudframe.app.exception.CFException;

public class BhiRetBhiData extends BhiRetBhiDataSerialized {

  private char[] bhiRetHipaaCode = Field.fillLowValue(2);

  private char[] bhiRetSlotTblId = Field.fillLowValue(6);

  private char[] bhiRetSrvcCode = Field.fillLowValue(6);

  private char[] bhiRetPlOfSrvcCd = Field.fillLowValue(2);

  private char[] bhiRetCausCd = Field.fillLowValue(1);

  private char[] bhiRetBenLvlCd = Field.fillLowValue(1);

  private char[] bhiRetNetInd = Field.fillLowValue(1);

  private char[] bhiRetInNtwkClssCd = Field.fillLowValue(1);

  private char[] bhiRetTier1NtwkClssCd = Field.fillLowValue(1);

  private char[] bhiRetProcRangeFrom = Field.fillLowValue(5);

  private char[] bhiRetProcRangeTo = Field.fillLowValue(5);

  private char[] bhiRetRowProcType = Field.fillLowValue(1);

  private char[] bhiRetProvOrgTypCd = Field.fillLowValue(3);

  private short bhiRetHipaaCommtTxtLen;

  private char[] bhiRetHipaaCommtTxt = Field.fillLowValue(300);

  /** Constructor for BhiRetBhiData */
  public BhiRetBhiData() {
    // TO-DO auto generated code
  }

  /**
   * Constructor for BhiRetBhiData. sets the parent value to the parent
   *
   * @param parent
   * @param begin
   */
  public BhiRetBhiData(Field parent, int begin) {
    setParent(parent, begin);
  }

  /**
   * Returns the value of bhiRetHipaaCode
   *
   * @return bhiRetHipaaCode
   */
  public char[] getBhiRetHipaaCode() throws CFException {
    if (isBhiRetHipaaCodeModified()) {
      bhiRetHipaaCode = refreshBhiRetHipaaCode();
    }
    return bhiRetHipaaCode;
  }

  /**
   * set variable bhiRetHipaaCode Corresponding COBOL Variable is BHI-RET-HIPAA-CODE
   *
   * @param value
   */
  public void setBhiRetHipaaCode(char[] value) {
    bhiRetHipaaCode = checkBhiRetHipaaCodeConstraints(value);
    serializeBhiRetHipaaCode(bhiRetHipaaCode);
  }

  /**
   * Update BhiRetHipaaCode with a char[] from an offset and length
   *
   * @param value
   */
  public void setBhiRetHipaaCode(char[] source, int sourceIndex) {
    replace(source, sourceIndex, source.length, beginBhiRetHipaaCode, bhiRetHipaaCode.length);
  }

  public void setBhiRetHipaaCode(char[] source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginBhiRetHipaaCode, bhiRetHipaaCode.length);
  }

  /**
   * Update BhiRetHipaaCode with a char[] from an offset and length to an offset and length
   *
   * @param value
   */
  public void setBhiRetHipaaCode(
      char[] source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginBhiRetHipaaCode + targetIndex, targetLen);
  }

  /**
   * Update BhiRetHipaaCode with another Field
   *
   * @param value
   */
  public void setBhiRetHipaaCode(Field source) {
    replace(source, 0, source.length(), beginBhiRetHipaaCode, BHI_RET_HIPAA_CODE_LEN);
  }

  /**
   * Update BhiRetHipaaCode with another Field from an offset and length
   *
   * @param value
   */
  public void setBhiRetHipaaCode(Field source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginBhiRetHipaaCode, BHI_RET_HIPAA_CODE_LEN);
  }

  /**
   * Update BhiRetHipaaCode with another Field from an offset and length to an offset and length
   *
   * @param value
   */
  public void setBhiRetHipaaCode(
      Field source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginBhiRetHipaaCode + targetIndex, targetLen);
  }
  /**
   * Returns the value of bhiRetSlotTblId
   *
   * @return bhiRetSlotTblId
   */
  public char[] getBhiRetSlotTblId() throws CFException {
    if (isBhiRetSlotTblIdModified()) {
      bhiRetSlotTblId = refreshBhiRetSlotTblId();
    }
    return bhiRetSlotTblId;
  }

  /**
   * set variable bhiRetSlotTblId Corresponding COBOL Variable is BHI-RET-SLOT-TBL-ID
   *
   * @param value
   */
  public void setBhiRetSlotTblId(char[] value) {
    bhiRetSlotTblId = checkBhiRetSlotTblIdConstraints(value);
    serializeBhiRetSlotTblId(bhiRetSlotTblId);
  }

  /**
   * Update BhiRetSlotTblId with a char[] from an offset and length
   *
   * @param value
   */
  public void setBhiRetSlotTblId(char[] source, int sourceIndex) {
    replace(source, sourceIndex, source.length, beginBhiRetSlotTblId, bhiRetSlotTblId.length);
  }

  public void setBhiRetSlotTblId(char[] source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginBhiRetSlotTblId, bhiRetSlotTblId.length);
  }

  /**
   * Update BhiRetSlotTblId with a char[] from an offset and length to an offset and length
   *
   * @param value
   */
  public void setBhiRetSlotTblId(
      char[] source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginBhiRetSlotTblId + targetIndex, targetLen);
  }

  /**
   * Update BhiRetSlotTblId with another Field
   *
   * @param value
   */
  public void setBhiRetSlotTblId(Field source) {
    replace(source, 0, source.length(), beginBhiRetSlotTblId, BHI_RET_SLOT_TBL_ID_LEN);
  }

  /**
   * Update BhiRetSlotTblId with another Field from an offset and length
   *
   * @param value
   */
  public void setBhiRetSlotTblId(Field source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginBhiRetSlotTblId, BHI_RET_SLOT_TBL_ID_LEN);
  }

  /**
   * Update BhiRetSlotTblId with another Field from an offset and length to an offset and length
   *
   * @param value
   */
  public void setBhiRetSlotTblId(
      Field source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginBhiRetSlotTblId + targetIndex, targetLen);
  }
  /**
   * Returns the value of bhiRetSrvcCode
   *
   * @return bhiRetSrvcCode
   */
  public char[] getBhiRetSrvcCode() throws CFException {
    if (isBhiRetSrvcCodeModified()) {
      bhiRetSrvcCode = refreshBhiRetSrvcCode();
    }
    return bhiRetSrvcCode;
  }

  /**
   * set variable bhiRetSrvcCode Corresponding COBOL Variable is BHI-RET-SRVC-CODE
   *
   * @param value
   */
  public void setBhiRetSrvcCode(char[] value) {
    bhiRetSrvcCode = checkBhiRetSrvcCodeConstraints(value);
    serializeBhiRetSrvcCode(bhiRetSrvcCode);
  }

  /**
   * Update BhiRetSrvcCode with a char[] from an offset and length
   *
   * @param value
   */
  public void setBhiRetSrvcCode(char[] source, int sourceIndex) {
    replace(source, sourceIndex, source.length, beginBhiRetSrvcCode, bhiRetSrvcCode.length);
  }

  public void setBhiRetSrvcCode(char[] source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginBhiRetSrvcCode, bhiRetSrvcCode.length);
  }

  /**
   * Update BhiRetSrvcCode with a char[] from an offset and length to an offset and length
   *
   * @param value
   */
  public void setBhiRetSrvcCode(
      char[] source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginBhiRetSrvcCode + targetIndex, targetLen);
  }

  /**
   * Update BhiRetSrvcCode with another Field
   *
   * @param value
   */
  public void setBhiRetSrvcCode(Field source) {
    replace(source, 0, source.length(), beginBhiRetSrvcCode, BHI_RET_SRVC_CODE_LEN);
  }

  /**
   * Update BhiRetSrvcCode with another Field from an offset and length
   *
   * @param value
   */
  public void setBhiRetSrvcCode(Field source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginBhiRetSrvcCode, BHI_RET_SRVC_CODE_LEN);
  }

  /**
   * Update BhiRetSrvcCode with another Field from an offset and length to an offset and length
   *
   * @param value
   */
  public void setBhiRetSrvcCode(
      Field source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginBhiRetSrvcCode + targetIndex, targetLen);
  }
  /**
   * Returns the value of bhiRetPlOfSrvcCd
   *
   * @return bhiRetPlOfSrvcCd
   */
  public char[] getBhiRetPlOfSrvcCd() throws CFException {
    if (isBhiRetPlOfSrvcCdModified()) {
      bhiRetPlOfSrvcCd = refreshBhiRetPlOfSrvcCd();
    }
    return bhiRetPlOfSrvcCd;
  }

  /**
   * set variable bhiRetPlOfSrvcCd Corresponding COBOL Variable is BHI-RET-PL-OF-SRVC-CD
   *
   * @param value
   */
  public void setBhiRetPlOfSrvcCd(char[] value) {
    bhiRetPlOfSrvcCd = checkBhiRetPlOfSrvcCdConstraints(value);
    serializeBhiRetPlOfSrvcCd(bhiRetPlOfSrvcCd);
  }

  /**
   * Update BhiRetPlOfSrvcCd with a char[] from an offset and length
   *
   * @param value
   */
  public void setBhiRetPlOfSrvcCd(char[] source, int sourceIndex) {
    replace(source, sourceIndex, source.length, beginBhiRetPlOfSrvcCd, bhiRetPlOfSrvcCd.length);
  }

  public void setBhiRetPlOfSrvcCd(char[] source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginBhiRetPlOfSrvcCd, bhiRetPlOfSrvcCd.length);
  }

  /**
   * Update BhiRetPlOfSrvcCd with a char[] from an offset and length to an offset and length
   *
   * @param value
   */
  public void setBhiRetPlOfSrvcCd(
      char[] source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginBhiRetPlOfSrvcCd + targetIndex, targetLen);
  }

  /**
   * Update BhiRetPlOfSrvcCd with another Field
   *
   * @param value
   */
  public void setBhiRetPlOfSrvcCd(Field source) {
    replace(source, 0, source.length(), beginBhiRetPlOfSrvcCd, BHI_RET_PL_OF_SRVC_CD_LEN);
  }

  /**
   * Update BhiRetPlOfSrvcCd with another Field from an offset and length
   *
   * @param value
   */
  public void setBhiRetPlOfSrvcCd(Field source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginBhiRetPlOfSrvcCd, BHI_RET_PL_OF_SRVC_CD_LEN);
  }

  /**
   * Update BhiRetPlOfSrvcCd with another Field from an offset and length to an offset and length
   *
   * @param value
   */
  public void setBhiRetPlOfSrvcCd(
      Field source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginBhiRetPlOfSrvcCd + targetIndex, targetLen);
  }
  /**
   * Returns the value of bhiRetCausCd
   *
   * @return bhiRetCausCd
   */
  public char[] getBhiRetCausCd() throws CFException {
    if (isBhiRetCausCdModified()) {
      bhiRetCausCd = refreshBhiRetCausCd();
    }
    return bhiRetCausCd;
  }

  /**
   * set variable bhiRetCausCd Corresponding COBOL Variable is BHI-RET-CAUS-CD
   *
   * @param value
   */
  public void setBhiRetCausCd(char[] value) {
    bhiRetCausCd = checkBhiRetCausCdConstraints(value);
    serializeBhiRetCausCd(bhiRetCausCd);
  }

  /**
   * Update BhiRetCausCd with a char[] from an offset and length
   *
   * @param value
   */
  public void setBhiRetCausCd(char[] source, int sourceIndex) {
    replace(source, sourceIndex, source.length, beginBhiRetCausCd, bhiRetCausCd.length);
  }

  public void setBhiRetCausCd(char[] source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginBhiRetCausCd, bhiRetCausCd.length);
  }

  /**
   * Update BhiRetCausCd with a char[] from an offset and length to an offset and length
   *
   * @param value
   */
  public void setBhiRetCausCd(
      char[] source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginBhiRetCausCd + targetIndex, targetLen);
  }

  /**
   * Update BhiRetCausCd with another Field
   *
   * @param value
   */
  public void setBhiRetCausCd(Field source) {
    replace(source, 0, source.length(), beginBhiRetCausCd, BHI_RET_CAUS_CD_LEN);
  }

  /**
   * Update BhiRetCausCd with another Field from an offset and length
   *
   * @param value
   */
  public void setBhiRetCausCd(Field source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginBhiRetCausCd, BHI_RET_CAUS_CD_LEN);
  }

  /**
   * Update BhiRetCausCd with another Field from an offset and length to an offset and length
   *
   * @param value
   */
  public void setBhiRetCausCd(
      Field source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginBhiRetCausCd + targetIndex, targetLen);
  }
  /**
   * Returns the value of bhiRetBenLvlCd
   *
   * @return bhiRetBenLvlCd
   */
  public char[] getBhiRetBenLvlCd() throws CFException {
    if (isBhiRetBenLvlCdModified()) {
      bhiRetBenLvlCd = refreshBhiRetBenLvlCd();
    }
    return bhiRetBenLvlCd;
  }

  /**
   * set variable bhiRetBenLvlCd Corresponding COBOL Variable is BHI-RET-BEN-LVL-CD
   *
   * @param value
   */
  public void setBhiRetBenLvlCd(char[] value) {
    bhiRetBenLvlCd = checkBhiRetBenLvlCdConstraints(value);
    serializeBhiRetBenLvlCd(bhiRetBenLvlCd);
  }

  /**
   * Update BhiRetBenLvlCd with a char[] from an offset and length
   *
   * @param value
   */
  public void setBhiRetBenLvlCd(char[] source, int sourceIndex) {
    replace(source, sourceIndex, source.length, beginBhiRetBenLvlCd, bhiRetBenLvlCd.length);
  }

  public void setBhiRetBenLvlCd(char[] source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginBhiRetBenLvlCd, bhiRetBenLvlCd.length);
  }

  /**
   * Update BhiRetBenLvlCd with a char[] from an offset and length to an offset and length
   *
   * @param value
   */
  public void setBhiRetBenLvlCd(
      char[] source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginBhiRetBenLvlCd + targetIndex, targetLen);
  }

  /**
   * Update BhiRetBenLvlCd with another Field
   *
   * @param value
   */
  public void setBhiRetBenLvlCd(Field source) {
    replace(source, 0, source.length(), beginBhiRetBenLvlCd, BHI_RET_BEN_LVL_CD_LEN);
  }

  /**
   * Update BhiRetBenLvlCd with another Field from an offset and length
   *
   * @param value
   */
  public void setBhiRetBenLvlCd(Field source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginBhiRetBenLvlCd, BHI_RET_BEN_LVL_CD_LEN);
  }

  /**
   * Update BhiRetBenLvlCd with another Field from an offset and length to an offset and length
   *
   * @param value
   */
  public void setBhiRetBenLvlCd(
      Field source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginBhiRetBenLvlCd + targetIndex, targetLen);
  }
  /**
   * Returns the value of bhiRetNetInd
   *
   * @return bhiRetNetInd
   */
  public char[] getBhiRetNetInd() throws CFException {
    if (isBhiRetNetIndModified()) {
      bhiRetNetInd = refreshBhiRetNetInd();
    }
    return bhiRetNetInd;
  }

  /**
   * set variable bhiRetNetInd Corresponding COBOL Variable is BHI-RET-NET-IND
   *
   * @param value
   */
  public void setBhiRetNetInd(char[] value) {
    bhiRetNetInd = checkBhiRetNetIndConstraints(value);
    serializeBhiRetNetInd(bhiRetNetInd);
  }

  /**
   * Update BhiRetNetInd with a char[] from an offset and length
   *
   * @param value
   */
  public void setBhiRetNetInd(char[] source, int sourceIndex) {
    replace(source, sourceIndex, source.length, beginBhiRetNetInd, bhiRetNetInd.length);
  }

  public void setBhiRetNetInd(char[] source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginBhiRetNetInd, bhiRetNetInd.length);
  }

  /**
   * Update BhiRetNetInd with a char[] from an offset and length to an offset and length
   *
   * @param value
   */
  public void setBhiRetNetInd(
      char[] source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginBhiRetNetInd + targetIndex, targetLen);
  }

  /**
   * Update BhiRetNetInd with another Field
   *
   * @param value
   */
  public void setBhiRetNetInd(Field source) {
    replace(source, 0, source.length(), beginBhiRetNetInd, BHI_RET_NET_IND_LEN);
  }

  /**
   * Update BhiRetNetInd with another Field from an offset and length
   *
   * @param value
   */
  public void setBhiRetNetInd(Field source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginBhiRetNetInd, BHI_RET_NET_IND_LEN);
  }

  /**
   * Update BhiRetNetInd with another Field from an offset and length to an offset and length
   *
   * @param value
   */
  public void setBhiRetNetInd(
      Field source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginBhiRetNetInd + targetIndex, targetLen);
  }
  /**
   * Returns the value of bhiRetInNtwkClssCd
   *
   * @return bhiRetInNtwkClssCd
   */
  public char[] getBhiRetInNtwkClssCd() throws CFException {
    if (isBhiRetInNtwkClssCdModified()) {
      bhiRetInNtwkClssCd = refreshBhiRetInNtwkClssCd();
    }
    return bhiRetInNtwkClssCd;
  }

  /**
   * set variable bhiRetInNtwkClssCd Corresponding COBOL Variable is BHI-RET-IN-NTWK-CLSS-CD
   *
   * @param value
   */
  public void setBhiRetInNtwkClssCd(char[] value) {
    bhiRetInNtwkClssCd = checkBhiRetInNtwkClssCdConstraints(value);
    serializeBhiRetInNtwkClssCd(bhiRetInNtwkClssCd);
  }

  /**
   * Update BhiRetInNtwkClssCd with a char[] from an offset and length
   *
   * @param value
   */
  public void setBhiRetInNtwkClssCd(char[] source, int sourceIndex) {
    replace(source, sourceIndex, source.length, beginBhiRetInNtwkClssCd, bhiRetInNtwkClssCd.length);
  }

  public void setBhiRetInNtwkClssCd(char[] source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginBhiRetInNtwkClssCd, bhiRetInNtwkClssCd.length);
  }

  /**
   * Update BhiRetInNtwkClssCd with a char[] from an offset and length to an offset and length
   *
   * @param value
   */
  public void setBhiRetInNtwkClssCd(
      char[] source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginBhiRetInNtwkClssCd + targetIndex, targetLen);
  }

  /**
   * Update BhiRetInNtwkClssCd with another Field
   *
   * @param value
   */
  public void setBhiRetInNtwkClssCd(Field source) {
    replace(source, 0, source.length(), beginBhiRetInNtwkClssCd, BHI_RET_IN_NTWK_CLSS_CD_LEN);
  }

  /**
   * Update BhiRetInNtwkClssCd with another Field from an offset and length
   *
   * @param value
   */
  public void setBhiRetInNtwkClssCd(Field source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginBhiRetInNtwkClssCd, BHI_RET_IN_NTWK_CLSS_CD_LEN);
  }

  /**
   * Update BhiRetInNtwkClssCd with another Field from an offset and length to an offset and length
   *
   * @param value
   */
  public void setBhiRetInNtwkClssCd(
      Field source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginBhiRetInNtwkClssCd + targetIndex, targetLen);
  }
  /**
   * Returns the value of bhiRetTier1NtwkClssCd
   *
   * @return bhiRetTier1NtwkClssCd
   */
  public char[] getBhiRetTier1NtwkClssCd() throws CFException {
    if (isBhiRetTier1NtwkClssCdModified()) {
      bhiRetTier1NtwkClssCd = refreshBhiRetTier1NtwkClssCd();
    }
    return bhiRetTier1NtwkClssCd;
  }

  /**
   * set variable bhiRetTier1NtwkClssCd Corresponding COBOL Variable is BHI-RET-TIER1-NTWK-CLSS-CD
   *
   * @param value
   */
  public void setBhiRetTier1NtwkClssCd(char[] value) {
    bhiRetTier1NtwkClssCd = checkBhiRetTier1NtwkClssCdConstraints(value);
    serializeBhiRetTier1NtwkClssCd(bhiRetTier1NtwkClssCd);
  }

  /**
   * Update BhiRetTier1NtwkClssCd with a char[] from an offset and length
   *
   * @param value
   */
  public void setBhiRetTier1NtwkClssCd(char[] source, int sourceIndex) {
    replace(
        source,
        sourceIndex,
        source.length,
        beginBhiRetTier1NtwkClssCd,
        bhiRetTier1NtwkClssCd.length);
  }

  public void setBhiRetTier1NtwkClssCd(char[] source, int sourceIndex, int sourceLen) {
    replace(
        source, sourceIndex, sourceLen, beginBhiRetTier1NtwkClssCd, bhiRetTier1NtwkClssCd.length);
  }

  /**
   * Update BhiRetTier1NtwkClssCd with a char[] from an offset and length to an offset and length
   *
   * @param value
   */
  public void setBhiRetTier1NtwkClssCd(
      char[] source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginBhiRetTier1NtwkClssCd + targetIndex, targetLen);
  }

  /**
   * Update BhiRetTier1NtwkClssCd with another Field
   *
   * @param value
   */
  public void setBhiRetTier1NtwkClssCd(Field source) {
    replace(
        source, 0, source.length(), beginBhiRetTier1NtwkClssCd, BHI_RET_TIER_1_NTWK_CLSS_CD_LEN);
  }

  /**
   * Update BhiRetTier1NtwkClssCd with another Field from an offset and length
   *
   * @param value
   */
  public void setBhiRetTier1NtwkClssCd(Field source, int sourceIndex, int sourceLen) {
    replace(
        source,
        sourceIndex,
        sourceLen,
        beginBhiRetTier1NtwkClssCd,
        BHI_RET_TIER_1_NTWK_CLSS_CD_LEN);
  }

  /**
   * Update BhiRetTier1NtwkClssCd with another Field from an offset and length to an offset and
   * length
   *
   * @param value
   */
  public void setBhiRetTier1NtwkClssCd(
      Field source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginBhiRetTier1NtwkClssCd + targetIndex, targetLen);
  }
  /**
   * Returns the value of bhiRetProcRangeFrom
   *
   * @return bhiRetProcRangeFrom
   */
  public char[] getBhiRetProcRangeFrom() throws CFException {
    if (isBhiRetProcRangeFromModified()) {
      bhiRetProcRangeFrom = refreshBhiRetProcRangeFrom();
    }
    return bhiRetProcRangeFrom;
  }

  /**
   * set variable bhiRetProcRangeFrom Corresponding COBOL Variable is BHI-RET-PROC-RANGE-FROM
   *
   * @param value
   */
  public void setBhiRetProcRangeFrom(char[] value) {
    bhiRetProcRangeFrom = checkBhiRetProcRangeFromConstraints(value);
    serializeBhiRetProcRangeFrom(bhiRetProcRangeFrom);
  }

  /**
   * Update BhiRetProcRangeFrom with a char[] from an offset and length
   *
   * @param value
   */
  public void setBhiRetProcRangeFrom(char[] source, int sourceIndex) {
    replace(
        source, sourceIndex, source.length, beginBhiRetProcRangeFrom, bhiRetProcRangeFrom.length);
  }

  public void setBhiRetProcRangeFrom(char[] source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginBhiRetProcRangeFrom, bhiRetProcRangeFrom.length);
  }

  /**
   * Update BhiRetProcRangeFrom with a char[] from an offset and length to an offset and length
   *
   * @param value
   */
  public void setBhiRetProcRangeFrom(
      char[] source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginBhiRetProcRangeFrom + targetIndex, targetLen);
  }

  /**
   * Update BhiRetProcRangeFrom with another Field
   *
   * @param value
   */
  public void setBhiRetProcRangeFrom(Field source) {
    replace(source, 0, source.length(), beginBhiRetProcRangeFrom, BHI_RET_PROC_RANGE_FROM_LEN);
  }

  /**
   * Update BhiRetProcRangeFrom with another Field from an offset and length
   *
   * @param value
   */
  public void setBhiRetProcRangeFrom(Field source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginBhiRetProcRangeFrom, BHI_RET_PROC_RANGE_FROM_LEN);
  }

  /**
   * Update BhiRetProcRangeFrom with another Field from an offset and length to an offset and length
   *
   * @param value
   */
  public void setBhiRetProcRangeFrom(
      Field source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginBhiRetProcRangeFrom + targetIndex, targetLen);
  }
  /**
   * Returns the value of bhiRetProcRangeTo
   *
   * @return bhiRetProcRangeTo
   */
  public char[] getBhiRetProcRangeTo() throws CFException {
    if (isBhiRetProcRangeToModified()) {
      bhiRetProcRangeTo = refreshBhiRetProcRangeTo();
    }
    return bhiRetProcRangeTo;
  }

  /**
   * set variable bhiRetProcRangeTo Corresponding COBOL Variable is BHI-RET-PROC-RANGE-TO
   *
   * @param value
   */
  public void setBhiRetProcRangeTo(char[] value) {
    bhiRetProcRangeTo = checkBhiRetProcRangeToConstraints(value);
    serializeBhiRetProcRangeTo(bhiRetProcRangeTo);
  }

  /**
   * Update BhiRetProcRangeTo with a char[] from an offset and length
   *
   * @param value
   */
  public void setBhiRetProcRangeTo(char[] source, int sourceIndex) {
    replace(source, sourceIndex, source.length, beginBhiRetProcRangeTo, bhiRetProcRangeTo.length);
  }

  public void setBhiRetProcRangeTo(char[] source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginBhiRetProcRangeTo, bhiRetProcRangeTo.length);
  }

  /**
   * Update BhiRetProcRangeTo with a char[] from an offset and length to an offset and length
   *
   * @param value
   */
  public void setBhiRetProcRangeTo(
      char[] source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginBhiRetProcRangeTo + targetIndex, targetLen);
  }

  /**
   * Update BhiRetProcRangeTo with another Field
   *
   * @param value
   */
  public void setBhiRetProcRangeTo(Field source) {
    replace(source, 0, source.length(), beginBhiRetProcRangeTo, BHI_RET_PROC_RANGE_TO_LEN);
  }

  /**
   * Update BhiRetProcRangeTo with another Field from an offset and length
   *
   * @param value
   */
  public void setBhiRetProcRangeTo(Field source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginBhiRetProcRangeTo, BHI_RET_PROC_RANGE_TO_LEN);
  }

  /**
   * Update BhiRetProcRangeTo with another Field from an offset and length to an offset and length
   *
   * @param value
   */
  public void setBhiRetProcRangeTo(
      Field source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginBhiRetProcRangeTo + targetIndex, targetLen);
  }
  /**
   * Returns the value of bhiRetRowProcType
   *
   * @return bhiRetRowProcType
   */
  public char[] getBhiRetRowProcType() throws CFException {
    if (isBhiRetRowProcTypeModified()) {
      bhiRetRowProcType = refreshBhiRetRowProcType();
    }
    return bhiRetRowProcType;
  }

  /**
   * set variable bhiRetRowProcType Corresponding COBOL Variable is BHI-RET-ROW-PROC-TYPE
   *
   * @param value
   */
  public void setBhiRetRowProcType(char[] value) {
    bhiRetRowProcType = checkBhiRetRowProcTypeConstraints(value);
    serializeBhiRetRowProcType(bhiRetRowProcType);
  }

  /**
   * Update BhiRetRowProcType with a char[] from an offset and length
   *
   * @param value
   */
  public void setBhiRetRowProcType(char[] source, int sourceIndex) {
    replace(source, sourceIndex, source.length, beginBhiRetRowProcType, bhiRetRowProcType.length);
  }

  public void setBhiRetRowProcType(char[] source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginBhiRetRowProcType, bhiRetRowProcType.length);
  }

  /**
   * Update BhiRetRowProcType with a char[] from an offset and length to an offset and length
   *
   * @param value
   */
  public void setBhiRetRowProcType(
      char[] source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginBhiRetRowProcType + targetIndex, targetLen);
  }

  /**
   * Update BhiRetRowProcType with another Field
   *
   * @param value
   */
  public void setBhiRetRowProcType(Field source) {
    replace(source, 0, source.length(), beginBhiRetRowProcType, BHI_RET_ROW_PROC_TYPE_LEN);
  }

  /**
   * Update BhiRetRowProcType with another Field from an offset and length
   *
   * @param value
   */
  public void setBhiRetRowProcType(Field source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginBhiRetRowProcType, BHI_RET_ROW_PROC_TYPE_LEN);
  }

  /**
   * Update BhiRetRowProcType with another Field from an offset and length to an offset and length
   *
   * @param value
   */
  public void setBhiRetRowProcType(
      Field source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginBhiRetRowProcType + targetIndex, targetLen);
  }
  /**
   * Returns the value of bhiRetProvOrgTypCd
   *
   * @return bhiRetProvOrgTypCd
   */
  public char[] getBhiRetProvOrgTypCd() throws CFException {
    if (isBhiRetProvOrgTypCdModified()) {
      bhiRetProvOrgTypCd = refreshBhiRetProvOrgTypCd();
    }
    return bhiRetProvOrgTypCd;
  }

  /**
   * set variable bhiRetProvOrgTypCd Corresponding COBOL Variable is BHI-RET-PROV-ORG-TYP-CD
   *
   * @param value
   */
  public void setBhiRetProvOrgTypCd(char[] value) {
    bhiRetProvOrgTypCd = checkBhiRetProvOrgTypCdConstraints(value);
    serializeBhiRetProvOrgTypCd(bhiRetProvOrgTypCd);
  }

  /**
   * Update BhiRetProvOrgTypCd with a char[] from an offset and length
   *
   * @param value
   */
  public void setBhiRetProvOrgTypCd(char[] source, int sourceIndex) {
    replace(source, sourceIndex, source.length, beginBhiRetProvOrgTypCd, bhiRetProvOrgTypCd.length);
  }

  public void setBhiRetProvOrgTypCd(char[] source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginBhiRetProvOrgTypCd, bhiRetProvOrgTypCd.length);
  }

  /**
   * Update BhiRetProvOrgTypCd with a char[] from an offset and length to an offset and length
   *
   * @param value
   */
  public void setBhiRetProvOrgTypCd(
      char[] source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginBhiRetProvOrgTypCd + targetIndex, targetLen);
  }

  /**
   * Update BhiRetProvOrgTypCd with another Field
   *
   * @param value
   */
  public void setBhiRetProvOrgTypCd(Field source) {
    replace(source, 0, source.length(), beginBhiRetProvOrgTypCd, BHI_RET_PROV_ORG_TYP_CD_LEN);
  }

  /**
   * Update BhiRetProvOrgTypCd with another Field from an offset and length
   *
   * @param value
   */
  public void setBhiRetProvOrgTypCd(Field source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginBhiRetProvOrgTypCd, BHI_RET_PROV_ORG_TYP_CD_LEN);
  }

  /**
   * Update BhiRetProvOrgTypCd with another Field from an offset and length to an offset and length
   *
   * @param value
   */
  public void setBhiRetProvOrgTypCd(
      Field source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginBhiRetProvOrgTypCd + targetIndex, targetLen);
  }
  /**
   * Returns the value of bhiRetHipaaCommtTxtLen
   *
   * @return bhiRetHipaaCommtTxtLen
   */
  public short getBhiRetHipaaCommtTxtLen() throws CFException {
    if (isBhiRetHipaaCommtTxtLenModified()) {
      bhiRetHipaaCommtTxtLen = refreshBhiRetHipaaCommtTxtLen();
    }
    return bhiRetHipaaCommtTxtLen;
  }

  /**
   * Update BhiRetHipaaCommtTxtLen with the passed value Corresponding COBOL Variable is
   * BHI-RET-HIPAA-COMMT-TXT-LEN
   *
   * @param number
   */
  public void setBhiRetHipaaCommtTxtLen(short number) {
    // Truncate if the number is beyond +/- Max range
    bhiRetHipaaCommtTxtLen = checkBhiRetHipaaCommtTxtLenMaxLimit(number);
    serializeBhiRetHipaaCommtTxtLen(bhiRetHipaaCommtTxtLen);
  }

  public void setBhiRetHipaaCommtTxtLen(int number) {
    number =
        checkBhiRetHipaaCommtTxtLenMaxLimit(
            (short) number); // Truncate if value is beyond +/- Max range
    setBhiRetHipaaCommtTxtLen((short) number);
  }

  public void setBhiRetHipaaCommtTxtLen(long number) {
    number =
        checkBhiRetHipaaCommtTxtLenMaxLimit(
            (short) number); // Truncate if value is beyond +/- Max range
    setBhiRetHipaaCommtTxtLen((short) number);
  }

  /**
   * Returns the value of bhiRetHipaaCommtTxt
   *
   * @return bhiRetHipaaCommtTxt
   */
  public char[] getBhiRetHipaaCommtTxt() throws CFException {
    if (isBhiRetHipaaCommtTxtModified()) {
      bhiRetHipaaCommtTxt = refreshBhiRetHipaaCommtTxt();
    }
    return bhiRetHipaaCommtTxt;
  }

  /**
   * set variable bhiRetHipaaCommtTxt Corresponding COBOL Variable is BHI-RET-HIPAA-COMMT-TXT
   *
   * @param value
   */
  public void setBhiRetHipaaCommtTxt(char[] value) {
    bhiRetHipaaCommtTxt = checkBhiRetHipaaCommtTxtConstraints(value);
    serializeBhiRetHipaaCommtTxt(bhiRetHipaaCommtTxt);
  }

  /**
   * Update BhiRetHipaaCommtTxt with a char[] from an offset and length
   *
   * @param value
   */
  public void setBhiRetHipaaCommtTxt(char[] source, int sourceIndex) {
    replace(
        source, sourceIndex, source.length, beginBhiRetHipaaCommtTxt, bhiRetHipaaCommtTxt.length);
  }

  public void setBhiRetHipaaCommtTxt(char[] source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginBhiRetHipaaCommtTxt, bhiRetHipaaCommtTxt.length);
  }

  /**
   * Update BhiRetHipaaCommtTxt with a char[] from an offset and length to an offset and length
   *
   * @param value
   */
  public void setBhiRetHipaaCommtTxt(
      char[] source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginBhiRetHipaaCommtTxt + targetIndex, targetLen);
  }

  /**
   * Update BhiRetHipaaCommtTxt with another Field
   *
   * @param value
   */
  public void setBhiRetHipaaCommtTxt(Field source) {
    replace(source, 0, source.length(), beginBhiRetHipaaCommtTxt, BHI_RET_HIPAA_COMMT_TXT_LEN);
  }

  /**
   * Update BhiRetHipaaCommtTxt with another Field from an offset and length
   *
   * @param value
   */
  public void setBhiRetHipaaCommtTxt(Field source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginBhiRetHipaaCommtTxt, BHI_RET_HIPAA_COMMT_TXT_LEN);
  }

  /**
   * Update BhiRetHipaaCommtTxt with another Field from an offset and length to an offset and length
   *
   * @param value
   */
  public void setBhiRetHipaaCommtTxt(
      Field source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginBhiRetHipaaCommtTxt + targetIndex, targetLen);
  }

  /**
   * initializes BhiRetBhiData String fields defaults to Spaces short/int/long defaults to zero
   * BigDecimal defaults to BigDecimal.ZERO
   */
  public void initialize() {
    setBhiRetHipaaCode(CONSTANTS.SPACE_2);
    setBhiRetSlotTblId(CONSTANTS.SPACE_6);
    setBhiRetSrvcCode(CONSTANTS.SPACE_6);
    setBhiRetPlOfSrvcCd(CONSTANTS.SPACE_2);
    setBhiRetCausCd(CONSTANTS.SPACE);
    setBhiRetBenLvlCd(CONSTANTS.SPACE);
    setBhiRetNetInd(CONSTANTS.SPACE);
    setBhiRetInNtwkClssCd(CONSTANTS.SPACE);
    setBhiRetTier1NtwkClssCd(CONSTANTS.SPACE);
    setBhiRetProcRangeFrom(CONSTANTS.SPACE_5);
    setBhiRetProcRangeTo(CONSTANTS.SPACE_5);
    setBhiRetRowProcType(CONSTANTS.SPACE);
    setBhiRetProvOrgTypCd(CONSTANTS.SPACE_3);
    setBhiRetHipaaCommtTxtLen((short) 0);
    setBhiRetHipaaCommtTxt(CONSTANTS.SPACE_300);
  }

  public static int getBhiRetBhiDataFieldLength() {
    return BHI_RET_BHI_DATA_LENGTH;
  }
}
