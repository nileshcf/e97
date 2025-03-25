package com.cloudframe.app.dto.bbhsr002;

/**
 * The class PosNetInfo is used to handle fields declared in it
 *
 * @author CloudFrame Inc. created on 2025-03-25 at 08:29. using version 5.0.0.231
 */
import com.cloudframe.app.data.Field;
import com.cloudframe.app.dto.serialize.bbhsr002.*;
import com.cloudframe.app.exception.CFException;

public class PosNetInfo extends PosNetInfoSerialized {

  private char[] posSlotTblId = Field.fillLowValue(6);

  private char[] posSrvcCd = Field.fillLowValue(6);

  private char[] posPlOfSrvcCd = Field.fillLowValue(2);

  private char[] posCausCd = Field.fillLowValue(1);

  private char[] posBenLvlCd = Field.fillLowValue(1);

  private char[] posNetInd = Field.fillLowValue(1);

  private char[] posInNtwkClssCd = Field.fillLowValue(1);

  private char[] posT1NtwkClssCd = Field.fillLowValue(1);

  private char[] posSrvcCdNbr = Field.fillLowValue(3);

  private char[] posProcRangeFrom = Field.fillLowValue(5);

  private char[] posProcRangeTo = Field.fillLowValue(5);

  private char[] posProcCdType = Field.fillLowValue(1);

  private char[] posProvOrgTypCd = Field.fillLowValue(3);

  private char[] hipaaCommtTxt = Field.fillLowValue(300);

  /** Constructor for PosNetInfo */
  public PosNetInfo() {
    // TO-DO auto generated code
  }

  /**
   * Constructor for PosNetInfo. sets the parent value to the parent
   *
   * @param parent
   * @param begin
   */
  public PosNetInfo(Field parent, int begin) {
    setParent(parent, begin);
  }

  /**
   * Returns the value of posSlotTblId
   *
   * @return posSlotTblId
   */
  public char[] getPosSlotTblId() throws CFException {
    if (isPosSlotTblIdModified()) {
      posSlotTblId = refreshPosSlotTblId();
    }
    return posSlotTblId;
  }

  /**
   * set variable posSlotTblId Corresponding COBOL Variable is WS-POS-SLOT-TBL-ID
   *
   * @param value
   */
  public void setPosSlotTblId(char[] value) {
    posSlotTblId = checkPosSlotTblIdConstraints(value);
    serializePosSlotTblId(posSlotTblId);
  }

  /**
   * Update PosSlotTblId with a char[] from an offset and length
   *
   * @param value
   */
  public void setPosSlotTblId(char[] source, int sourceIndex) {
    replace(source, sourceIndex, source.length, beginPosSlotTblId, posSlotTblId.length);
  }

  public void setPosSlotTblId(char[] source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginPosSlotTblId, posSlotTblId.length);
  }

  /**
   * Update PosSlotTblId with a char[] from an offset and length to an offset and length
   *
   * @param value
   */
  public void setPosSlotTblId(
      char[] source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginPosSlotTblId + targetIndex, targetLen);
  }

  /**
   * Update PosSlotTblId with another Field
   *
   * @param value
   */
  public void setPosSlotTblId(Field source) {
    replace(source, 0, source.length(), beginPosSlotTblId, POS_SLOT_TBL_ID_LEN);
  }

  /**
   * Update PosSlotTblId with another Field from an offset and length
   *
   * @param value
   */
  public void setPosSlotTblId(Field source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginPosSlotTblId, POS_SLOT_TBL_ID_LEN);
  }

  /**
   * Update PosSlotTblId with another Field from an offset and length to an offset and length
   *
   * @param value
   */
  public void setPosSlotTblId(
      Field source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginPosSlotTblId + targetIndex, targetLen);
  }
  /**
   * Returns the value of posSrvcCd
   *
   * @return posSrvcCd
   */
  public char[] getPosSrvcCd() throws CFException {
    if (isPosSrvcCdModified()) {
      posSrvcCd = refreshPosSrvcCd();
    }
    return posSrvcCd;
  }

  /**
   * set variable posSrvcCd Corresponding COBOL Variable is WS-POS-SRVC-CD
   *
   * @param value
   */
  public void setPosSrvcCd(char[] value) {
    posSrvcCd = checkPosSrvcCdConstraints(value);
    serializePosSrvcCd(posSrvcCd);
  }

  /**
   * Update PosSrvcCd with a char[] from an offset and length
   *
   * @param value
   */
  public void setPosSrvcCd(char[] source, int sourceIndex) {
    replace(source, sourceIndex, source.length, beginPosSrvcCd, posSrvcCd.length);
  }

  public void setPosSrvcCd(char[] source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginPosSrvcCd, posSrvcCd.length);
  }

  /**
   * Update PosSrvcCd with a char[] from an offset and length to an offset and length
   *
   * @param value
   */
  public void setPosSrvcCd(
      char[] source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginPosSrvcCd + targetIndex, targetLen);
  }

  /**
   * Update PosSrvcCd with another Field
   *
   * @param value
   */
  public void setPosSrvcCd(Field source) {
    replace(source, 0, source.length(), beginPosSrvcCd, POS_SRVC_CD_LEN);
  }

  /**
   * Update PosSrvcCd with another Field from an offset and length
   *
   * @param value
   */
  public void setPosSrvcCd(Field source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginPosSrvcCd, POS_SRVC_CD_LEN);
  }

  /**
   * Update PosSrvcCd with another Field from an offset and length to an offset and length
   *
   * @param value
   */
  public void setPosSrvcCd(
      Field source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginPosSrvcCd + targetIndex, targetLen);
  }
  /**
   * Returns the value of posPlOfSrvcCd
   *
   * @return posPlOfSrvcCd
   */
  public char[] getPosPlOfSrvcCd() throws CFException {
    if (isPosPlOfSrvcCdModified()) {
      posPlOfSrvcCd = refreshPosPlOfSrvcCd();
    }
    return posPlOfSrvcCd;
  }

  /**
   * set variable posPlOfSrvcCd Corresponding COBOL Variable is WS-POS-PL-OF-SRVC-CD
   *
   * @param value
   */
  public void setPosPlOfSrvcCd(char[] value) {
    posPlOfSrvcCd = checkPosPlOfSrvcCdConstraints(value);
    serializePosPlOfSrvcCd(posPlOfSrvcCd);
  }

  /**
   * Update PosPlOfSrvcCd with a char[] from an offset and length
   *
   * @param value
   */
  public void setPosPlOfSrvcCd(char[] source, int sourceIndex) {
    replace(source, sourceIndex, source.length, beginPosPlOfSrvcCd, posPlOfSrvcCd.length);
  }

  public void setPosPlOfSrvcCd(char[] source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginPosPlOfSrvcCd, posPlOfSrvcCd.length);
  }

  /**
   * Update PosPlOfSrvcCd with a char[] from an offset and length to an offset and length
   *
   * @param value
   */
  public void setPosPlOfSrvcCd(
      char[] source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginPosPlOfSrvcCd + targetIndex, targetLen);
  }

  /**
   * Update PosPlOfSrvcCd with another Field
   *
   * @param value
   */
  public void setPosPlOfSrvcCd(Field source) {
    replace(source, 0, source.length(), beginPosPlOfSrvcCd, POS_PL_OF_SRVC_CD_LEN);
  }

  /**
   * Update PosPlOfSrvcCd with another Field from an offset and length
   *
   * @param value
   */
  public void setPosPlOfSrvcCd(Field source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginPosPlOfSrvcCd, POS_PL_OF_SRVC_CD_LEN);
  }

  /**
   * Update PosPlOfSrvcCd with another Field from an offset and length to an offset and length
   *
   * @param value
   */
  public void setPosPlOfSrvcCd(
      Field source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginPosPlOfSrvcCd + targetIndex, targetLen);
  }
  /**
   * Returns the value of posCausCd
   *
   * @return posCausCd
   */
  public char[] getPosCausCd() throws CFException {
    if (isPosCausCdModified()) {
      posCausCd = refreshPosCausCd();
    }
    return posCausCd;
  }

  /**
   * set variable posCausCd Corresponding COBOL Variable is WS-POS-CAUS-CD
   *
   * @param value
   */
  public void setPosCausCd(char[] value) {
    posCausCd = checkPosCausCdConstraints(value);
    serializePosCausCd(posCausCd);
  }

  /**
   * Update PosCausCd with a char[] from an offset and length
   *
   * @param value
   */
  public void setPosCausCd(char[] source, int sourceIndex) {
    replace(source, sourceIndex, source.length, beginPosCausCd, posCausCd.length);
  }

  public void setPosCausCd(char[] source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginPosCausCd, posCausCd.length);
  }

  /**
   * Update PosCausCd with a char[] from an offset and length to an offset and length
   *
   * @param value
   */
  public void setPosCausCd(
      char[] source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginPosCausCd + targetIndex, targetLen);
  }

  /**
   * Update PosCausCd with another Field
   *
   * @param value
   */
  public void setPosCausCd(Field source) {
    replace(source, 0, source.length(), beginPosCausCd, POS_CAUS_CD_LEN);
  }

  /**
   * Update PosCausCd with another Field from an offset and length
   *
   * @param value
   */
  public void setPosCausCd(Field source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginPosCausCd, POS_CAUS_CD_LEN);
  }

  /**
   * Update PosCausCd with another Field from an offset and length to an offset and length
   *
   * @param value
   */
  public void setPosCausCd(
      Field source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginPosCausCd + targetIndex, targetLen);
  }
  /**
   * Returns the value of posBenLvlCd
   *
   * @return posBenLvlCd
   */
  public char[] getPosBenLvlCd() throws CFException {
    if (isPosBenLvlCdModified()) {
      posBenLvlCd = refreshPosBenLvlCd();
    }
    return posBenLvlCd;
  }

  /**
   * set variable posBenLvlCd Corresponding COBOL Variable is WS-POS-BEN-LVL-CD
   *
   * @param value
   */
  public void setPosBenLvlCd(char[] value) {
    posBenLvlCd = checkPosBenLvlCdConstraints(value);
    serializePosBenLvlCd(posBenLvlCd);
  }

  /**
   * Update PosBenLvlCd with a char[] from an offset and length
   *
   * @param value
   */
  public void setPosBenLvlCd(char[] source, int sourceIndex) {
    replace(source, sourceIndex, source.length, beginPosBenLvlCd, posBenLvlCd.length);
  }

  public void setPosBenLvlCd(char[] source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginPosBenLvlCd, posBenLvlCd.length);
  }

  /**
   * Update PosBenLvlCd with a char[] from an offset and length to an offset and length
   *
   * @param value
   */
  public void setPosBenLvlCd(
      char[] source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginPosBenLvlCd + targetIndex, targetLen);
  }

  /**
   * Update PosBenLvlCd with another Field
   *
   * @param value
   */
  public void setPosBenLvlCd(Field source) {
    replace(source, 0, source.length(), beginPosBenLvlCd, POS_BEN_LVL_CD_LEN);
  }

  /**
   * Update PosBenLvlCd with another Field from an offset and length
   *
   * @param value
   */
  public void setPosBenLvlCd(Field source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginPosBenLvlCd, POS_BEN_LVL_CD_LEN);
  }

  /**
   * Update PosBenLvlCd with another Field from an offset and length to an offset and length
   *
   * @param value
   */
  public void setPosBenLvlCd(
      Field source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginPosBenLvlCd + targetIndex, targetLen);
  }
  /**
   * Returns the value of posNetInd
   *
   * @return posNetInd
   */
  public char[] getPosNetInd() throws CFException {
    if (isPosNetIndModified()) {
      posNetInd = refreshPosNetInd();
    }
    return posNetInd;
  }

  /**
   * set variable posNetInd Corresponding COBOL Variable is WS-POS-NET-IND
   *
   * @param value
   */
  public void setPosNetInd(char[] value) {
    posNetInd = checkPosNetIndConstraints(value);
    serializePosNetInd(posNetInd);
  }

  /**
   * Update PosNetInd with a char[] from an offset and length
   *
   * @param value
   */
  public void setPosNetInd(char[] source, int sourceIndex) {
    replace(source, sourceIndex, source.length, beginPosNetInd, posNetInd.length);
  }

  public void setPosNetInd(char[] source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginPosNetInd, posNetInd.length);
  }

  /**
   * Update PosNetInd with a char[] from an offset and length to an offset and length
   *
   * @param value
   */
  public void setPosNetInd(
      char[] source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginPosNetInd + targetIndex, targetLen);
  }

  /**
   * Update PosNetInd with another Field
   *
   * @param value
   */
  public void setPosNetInd(Field source) {
    replace(source, 0, source.length(), beginPosNetInd, POS_NET_IND_LEN);
  }

  /**
   * Update PosNetInd with another Field from an offset and length
   *
   * @param value
   */
  public void setPosNetInd(Field source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginPosNetInd, POS_NET_IND_LEN);
  }

  /**
   * Update PosNetInd with another Field from an offset and length to an offset and length
   *
   * @param value
   */
  public void setPosNetInd(
      Field source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginPosNetInd + targetIndex, targetLen);
  }
  /**
   * Returns the value of posInNtwkClssCd
   *
   * @return posInNtwkClssCd
   */
  public char[] getPosInNtwkClssCd() throws CFException {
    if (isPosInNtwkClssCdModified()) {
      posInNtwkClssCd = refreshPosInNtwkClssCd();
    }
    return posInNtwkClssCd;
  }

  /**
   * set variable posInNtwkClssCd Corresponding COBOL Variable is WS-POS-IN-NTWK-CLSS-CD
   *
   * @param value
   */
  public void setPosInNtwkClssCd(char[] value) {
    posInNtwkClssCd = checkPosInNtwkClssCdConstraints(value);
    serializePosInNtwkClssCd(posInNtwkClssCd);
  }

  /**
   * Update PosInNtwkClssCd with a char[] from an offset and length
   *
   * @param value
   */
  public void setPosInNtwkClssCd(char[] source, int sourceIndex) {
    replace(source, sourceIndex, source.length, beginPosInNtwkClssCd, posInNtwkClssCd.length);
  }

  public void setPosInNtwkClssCd(char[] source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginPosInNtwkClssCd, posInNtwkClssCd.length);
  }

  /**
   * Update PosInNtwkClssCd with a char[] from an offset and length to an offset and length
   *
   * @param value
   */
  public void setPosInNtwkClssCd(
      char[] source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginPosInNtwkClssCd + targetIndex, targetLen);
  }

  /**
   * Update PosInNtwkClssCd with another Field
   *
   * @param value
   */
  public void setPosInNtwkClssCd(Field source) {
    replace(source, 0, source.length(), beginPosInNtwkClssCd, POS_IN_NTWK_CLSS_CD_LEN);
  }

  /**
   * Update PosInNtwkClssCd with another Field from an offset and length
   *
   * @param value
   */
  public void setPosInNtwkClssCd(Field source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginPosInNtwkClssCd, POS_IN_NTWK_CLSS_CD_LEN);
  }

  /**
   * Update PosInNtwkClssCd with another Field from an offset and length to an offset and length
   *
   * @param value
   */
  public void setPosInNtwkClssCd(
      Field source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginPosInNtwkClssCd + targetIndex, targetLen);
  }
  /**
   * Returns the value of posT1NtwkClssCd
   *
   * @return posT1NtwkClssCd
   */
  public char[] getPosT1NtwkClssCd() throws CFException {
    if (isPosT1NtwkClssCdModified()) {
      posT1NtwkClssCd = refreshPosT1NtwkClssCd();
    }
    return posT1NtwkClssCd;
  }

  /**
   * set variable posT1NtwkClssCd Corresponding COBOL Variable is WS-POS-T1-NTWK-CLSS-CD
   *
   * @param value
   */
  public void setPosT1NtwkClssCd(char[] value) {
    posT1NtwkClssCd = checkPosT1NtwkClssCdConstraints(value);
    serializePosT1NtwkClssCd(posT1NtwkClssCd);
  }

  /**
   * Update PosT1NtwkClssCd with a char[] from an offset and length
   *
   * @param value
   */
  public void setPosT1NtwkClssCd(char[] source, int sourceIndex) {
    replace(source, sourceIndex, source.length, beginPosT1NtwkClssCd, posT1NtwkClssCd.length);
  }

  public void setPosT1NtwkClssCd(char[] source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginPosT1NtwkClssCd, posT1NtwkClssCd.length);
  }

  /**
   * Update PosT1NtwkClssCd with a char[] from an offset and length to an offset and length
   *
   * @param value
   */
  public void setPosT1NtwkClssCd(
      char[] source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginPosT1NtwkClssCd + targetIndex, targetLen);
  }

  /**
   * Update PosT1NtwkClssCd with another Field
   *
   * @param value
   */
  public void setPosT1NtwkClssCd(Field source) {
    replace(source, 0, source.length(), beginPosT1NtwkClssCd, POS_T_1_NTWK_CLSS_CD_LEN);
  }

  /**
   * Update PosT1NtwkClssCd with another Field from an offset and length
   *
   * @param value
   */
  public void setPosT1NtwkClssCd(Field source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginPosT1NtwkClssCd, POS_T_1_NTWK_CLSS_CD_LEN);
  }

  /**
   * Update PosT1NtwkClssCd with another Field from an offset and length to an offset and length
   *
   * @param value
   */
  public void setPosT1NtwkClssCd(
      Field source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginPosT1NtwkClssCd + targetIndex, targetLen);
  }
  /**
   * Returns the value of posSrvcCdNbr
   *
   * @return posSrvcCdNbr
   */
  public char[] getPosSrvcCdNbr() throws CFException {
    if (isPosSrvcCdNbrModified()) {
      posSrvcCdNbr = refreshPosSrvcCdNbr();
    }
    return posSrvcCdNbr;
  }

  /**
   * set variable posSrvcCdNbr Corresponding COBOL Variable is WS-POS-SRVC-CD-NBR
   *
   * @param value
   */
  public void setPosSrvcCdNbr(char[] value) {
    posSrvcCdNbr = checkPosSrvcCdNbrConstraints(value);
    serializePosSrvcCdNbr(posSrvcCdNbr);
  }

  /**
   * Update PosSrvcCdNbr with a char[] from an offset and length
   *
   * @param value
   */
  public void setPosSrvcCdNbr(char[] source, int sourceIndex) {
    replace(source, sourceIndex, source.length, beginPosSrvcCdNbr, posSrvcCdNbr.length);
  }

  public void setPosSrvcCdNbr(char[] source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginPosSrvcCdNbr, posSrvcCdNbr.length);
  }

  /**
   * Update PosSrvcCdNbr with a char[] from an offset and length to an offset and length
   *
   * @param value
   */
  public void setPosSrvcCdNbr(
      char[] source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginPosSrvcCdNbr + targetIndex, targetLen);
  }

  /**
   * Update PosSrvcCdNbr with another Field
   *
   * @param value
   */
  public void setPosSrvcCdNbr(Field source) {
    replace(source, 0, source.length(), beginPosSrvcCdNbr, POS_SRVC_CD_NBR_LEN);
  }

  /**
   * Update PosSrvcCdNbr with another Field from an offset and length
   *
   * @param value
   */
  public void setPosSrvcCdNbr(Field source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginPosSrvcCdNbr, POS_SRVC_CD_NBR_LEN);
  }

  /**
   * Update PosSrvcCdNbr with another Field from an offset and length to an offset and length
   *
   * @param value
   */
  public void setPosSrvcCdNbr(
      Field source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginPosSrvcCdNbr + targetIndex, targetLen);
  }
  /**
   * Returns the value of posProcRangeFrom
   *
   * @return posProcRangeFrom
   */
  public char[] getPosProcRangeFrom() throws CFException {
    if (isPosProcRangeFromModified()) {
      posProcRangeFrom = refreshPosProcRangeFrom();
    }
    return posProcRangeFrom;
  }

  /**
   * set variable posProcRangeFrom Corresponding COBOL Variable is WS-POS-PROC-RANGE-FROM
   *
   * @param value
   */
  public void setPosProcRangeFrom(char[] value) {
    posProcRangeFrom = checkPosProcRangeFromConstraints(value);
    serializePosProcRangeFrom(posProcRangeFrom);
  }

  /**
   * Update PosProcRangeFrom with a char[] from an offset and length
   *
   * @param value
   */
  public void setPosProcRangeFrom(char[] source, int sourceIndex) {
    replace(source, sourceIndex, source.length, beginPosProcRangeFrom, posProcRangeFrom.length);
  }

  public void setPosProcRangeFrom(char[] source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginPosProcRangeFrom, posProcRangeFrom.length);
  }

  /**
   * Update PosProcRangeFrom with a char[] from an offset and length to an offset and length
   *
   * @param value
   */
  public void setPosProcRangeFrom(
      char[] source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginPosProcRangeFrom + targetIndex, targetLen);
  }

  /**
   * Update PosProcRangeFrom with another Field
   *
   * @param value
   */
  public void setPosProcRangeFrom(Field source) {
    replace(source, 0, source.length(), beginPosProcRangeFrom, POS_PROC_RANGE_FROM_LEN);
  }

  /**
   * Update PosProcRangeFrom with another Field from an offset and length
   *
   * @param value
   */
  public void setPosProcRangeFrom(Field source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginPosProcRangeFrom, POS_PROC_RANGE_FROM_LEN);
  }

  /**
   * Update PosProcRangeFrom with another Field from an offset and length to an offset and length
   *
   * @param value
   */
  public void setPosProcRangeFrom(
      Field source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginPosProcRangeFrom + targetIndex, targetLen);
  }
  /**
   * Returns the value of posProcRangeTo
   *
   * @return posProcRangeTo
   */
  public char[] getPosProcRangeTo() throws CFException {
    if (isPosProcRangeToModified()) {
      posProcRangeTo = refreshPosProcRangeTo();
    }
    return posProcRangeTo;
  }

  /**
   * set variable posProcRangeTo Corresponding COBOL Variable is WS-POS-PROC-RANGE-TO
   *
   * @param value
   */
  public void setPosProcRangeTo(char[] value) {
    posProcRangeTo = checkPosProcRangeToConstraints(value);
    serializePosProcRangeTo(posProcRangeTo);
  }

  /**
   * Update PosProcRangeTo with a char[] from an offset and length
   *
   * @param value
   */
  public void setPosProcRangeTo(char[] source, int sourceIndex) {
    replace(source, sourceIndex, source.length, beginPosProcRangeTo, posProcRangeTo.length);
  }

  public void setPosProcRangeTo(char[] source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginPosProcRangeTo, posProcRangeTo.length);
  }

  /**
   * Update PosProcRangeTo with a char[] from an offset and length to an offset and length
   *
   * @param value
   */
  public void setPosProcRangeTo(
      char[] source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginPosProcRangeTo + targetIndex, targetLen);
  }

  /**
   * Update PosProcRangeTo with another Field
   *
   * @param value
   */
  public void setPosProcRangeTo(Field source) {
    replace(source, 0, source.length(), beginPosProcRangeTo, POS_PROC_RANGE_TO_LEN);
  }

  /**
   * Update PosProcRangeTo with another Field from an offset and length
   *
   * @param value
   */
  public void setPosProcRangeTo(Field source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginPosProcRangeTo, POS_PROC_RANGE_TO_LEN);
  }

  /**
   * Update PosProcRangeTo with another Field from an offset and length to an offset and length
   *
   * @param value
   */
  public void setPosProcRangeTo(
      Field source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginPosProcRangeTo + targetIndex, targetLen);
  }
  /**
   * Returns the value of posProcCdType
   *
   * @return posProcCdType
   */
  public char[] getPosProcCdType() throws CFException {
    if (isPosProcCdTypeModified()) {
      posProcCdType = refreshPosProcCdType();
    }
    return posProcCdType;
  }

  /**
   * set variable posProcCdType Corresponding COBOL Variable is WS-POS-PROC-CD-TYPE
   *
   * @param value
   */
  public void setPosProcCdType(char[] value) {
    posProcCdType = checkPosProcCdTypeConstraints(value);
    serializePosProcCdType(posProcCdType);
  }

  /**
   * Update PosProcCdType with a char[] from an offset and length
   *
   * @param value
   */
  public void setPosProcCdType(char[] source, int sourceIndex) {
    replace(source, sourceIndex, source.length, beginPosProcCdType, posProcCdType.length);
  }

  public void setPosProcCdType(char[] source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginPosProcCdType, posProcCdType.length);
  }

  /**
   * Update PosProcCdType with a char[] from an offset and length to an offset and length
   *
   * @param value
   */
  public void setPosProcCdType(
      char[] source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginPosProcCdType + targetIndex, targetLen);
  }

  /**
   * Update PosProcCdType with another Field
   *
   * @param value
   */
  public void setPosProcCdType(Field source) {
    replace(source, 0, source.length(), beginPosProcCdType, POS_PROC_CD_TYPE_LEN);
  }

  /**
   * Update PosProcCdType with another Field from an offset and length
   *
   * @param value
   */
  public void setPosProcCdType(Field source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginPosProcCdType, POS_PROC_CD_TYPE_LEN);
  }

  /**
   * Update PosProcCdType with another Field from an offset and length to an offset and length
   *
   * @param value
   */
  public void setPosProcCdType(
      Field source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginPosProcCdType + targetIndex, targetLen);
  }
  /**
   * Returns the value of posProvOrgTypCd
   *
   * @return posProvOrgTypCd
   */
  public char[] getPosProvOrgTypCd() throws CFException {
    if (isPosProvOrgTypCdModified()) {
      posProvOrgTypCd = refreshPosProvOrgTypCd();
    }
    return posProvOrgTypCd;
  }

  /**
   * set variable posProvOrgTypCd Corresponding COBOL Variable is WS-POS-PROV-ORG-TYP-CD
   *
   * @param value
   */
  public void setPosProvOrgTypCd(char[] value) {
    posProvOrgTypCd = checkPosProvOrgTypCdConstraints(value);
    serializePosProvOrgTypCd(posProvOrgTypCd);
  }

  /**
   * Update PosProvOrgTypCd with a char[] from an offset and length
   *
   * @param value
   */
  public void setPosProvOrgTypCd(char[] source, int sourceIndex) {
    replace(source, sourceIndex, source.length, beginPosProvOrgTypCd, posProvOrgTypCd.length);
  }

  public void setPosProvOrgTypCd(char[] source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginPosProvOrgTypCd, posProvOrgTypCd.length);
  }

  /**
   * Update PosProvOrgTypCd with a char[] from an offset and length to an offset and length
   *
   * @param value
   */
  public void setPosProvOrgTypCd(
      char[] source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginPosProvOrgTypCd + targetIndex, targetLen);
  }

  /**
   * Update PosProvOrgTypCd with another Field
   *
   * @param value
   */
  public void setPosProvOrgTypCd(Field source) {
    replace(source, 0, source.length(), beginPosProvOrgTypCd, POS_PROV_ORG_TYP_CD_LEN);
  }

  /**
   * Update PosProvOrgTypCd with another Field from an offset and length
   *
   * @param value
   */
  public void setPosProvOrgTypCd(Field source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginPosProvOrgTypCd, POS_PROV_ORG_TYP_CD_LEN);
  }

  /**
   * Update PosProvOrgTypCd with another Field from an offset and length to an offset and length
   *
   * @param value
   */
  public void setPosProvOrgTypCd(
      Field source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginPosProvOrgTypCd + targetIndex, targetLen);
  }
  /**
   * Returns the value of hipaaCommtTxt
   *
   * @return hipaaCommtTxt
   */
  public char[] getHipaaCommtTxt() throws CFException {
    if (isHipaaCommtTxtModified()) {
      hipaaCommtTxt = refreshHipaaCommtTxt();
    }
    return hipaaCommtTxt;
  }

  /**
   * set variable hipaaCommtTxt Corresponding COBOL Variable is WS-HIPAA-COMMT-TXT
   *
   * @param value
   */
  public void setHipaaCommtTxt(char[] value) {
    hipaaCommtTxt = checkHipaaCommtTxtConstraints(value);
    serializeHipaaCommtTxt(hipaaCommtTxt);
  }

  /**
   * Update HipaaCommtTxt with a char[] from an offset and length
   *
   * @param value
   */
  public void setHipaaCommtTxt(char[] source, int sourceIndex) {
    replace(source, sourceIndex, source.length, beginHipaaCommtTxt, hipaaCommtTxt.length);
  }

  public void setHipaaCommtTxt(char[] source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginHipaaCommtTxt, hipaaCommtTxt.length);
  }

  /**
   * Update HipaaCommtTxt with a char[] from an offset and length to an offset and length
   *
   * @param value
   */
  public void setHipaaCommtTxt(
      char[] source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginHipaaCommtTxt + targetIndex, targetLen);
  }

  /**
   * Update HipaaCommtTxt with another Field
   *
   * @param value
   */
  public void setHipaaCommtTxt(Field source) {
    replace(source, 0, source.length(), beginHipaaCommtTxt, HIPAA_COMMT_TXT_LEN);
  }

  /**
   * Update HipaaCommtTxt with another Field from an offset and length
   *
   * @param value
   */
  public void setHipaaCommtTxt(Field source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginHipaaCommtTxt, HIPAA_COMMT_TXT_LEN);
  }

  /**
   * Update HipaaCommtTxt with another Field from an offset and length to an offset and length
   *
   * @param value
   */
  public void setHipaaCommtTxt(
      Field source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginHipaaCommtTxt + targetIndex, targetLen);
  }

  public static int getPosNetInfoFieldLength() {
    return POS_NET_INFO_LENGTH;
  }
}
