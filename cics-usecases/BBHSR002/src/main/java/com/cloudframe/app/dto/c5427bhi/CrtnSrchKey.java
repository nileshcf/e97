package com.cloudframe.app.dto.c5427bhi;

/**
 * The class CrtnSrchKey is used to handle fields declared in it
 *
 * @author CloudFrame Inc. created on 2025-03-25 at 08:32. using version 5.0.0.231
 */
import com.cloudframe.app.data.Field;
import com.cloudframe.app.dto.serialize.c5427bhi.*;
import com.cloudframe.app.exception.CFException;

public class CrtnSrchKey extends CrtnSrchKeySerialized {

  private char[] crtnSlotTblId = Field.fillLowValue(6);

  private char[] crtnHipaaCd = Field.fillLowValue(2);

  private char[] crtnHipaaVerNbr = Field.fillLowValue(1);

  private char[] crtnStsCd = Field.fillLowValue(1);

  /** Constructor for CrtnSrchKey */
  public CrtnSrchKey() {
    // TO-DO auto generated code
  }

  /**
   * Constructor for CrtnSrchKey. sets the parent value to the parent
   *
   * @param parent
   * @param begin
   */
  public CrtnSrchKey(Field parent, int begin) {
    setParent(parent, begin);
  }

  /**
   * Returns the value of crtnSlotTblId
   *
   * @return crtnSlotTblId
   */
  public char[] getCrtnSlotTblId() throws CFException {
    if (isCrtnSlotTblIdModified()) {
      crtnSlotTblId = refreshCrtnSlotTblId();
    }
    return crtnSlotTblId;
  }

  /**
   * set variable crtnSlotTblId Corresponding COBOL Variable is CRTN-SLOT-TBL-ID
   *
   * @param value
   */
  public void setCrtnSlotTblId(char[] value) {
    crtnSlotTblId = checkCrtnSlotTblIdConstraints(value);
    serializeCrtnSlotTblId(crtnSlotTblId);
  }

  /**
   * Update CrtnSlotTblId with a char[] from an offset and length
   *
   * @param value
   */
  public void setCrtnSlotTblId(char[] source, int sourceIndex) {
    replace(source, sourceIndex, source.length, beginCrtnSlotTblId, crtnSlotTblId.length);
  }

  public void setCrtnSlotTblId(char[] source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginCrtnSlotTblId, crtnSlotTblId.length);
  }

  /**
   * Update CrtnSlotTblId with a char[] from an offset and length to an offset and length
   *
   * @param value
   */
  public void setCrtnSlotTblId(
      char[] source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginCrtnSlotTblId + targetIndex, targetLen);
  }

  /**
   * Update CrtnSlotTblId with another Field
   *
   * @param value
   */
  public void setCrtnSlotTblId(Field source) {
    replace(source, 0, source.length(), beginCrtnSlotTblId, CRTN_SLOT_TBL_ID_LEN);
  }

  /**
   * Update CrtnSlotTblId with another Field from an offset and length
   *
   * @param value
   */
  public void setCrtnSlotTblId(Field source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginCrtnSlotTblId, CRTN_SLOT_TBL_ID_LEN);
  }

  /**
   * Update CrtnSlotTblId with another Field from an offset and length to an offset and length
   *
   * @param value
   */
  public void setCrtnSlotTblId(
      Field source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginCrtnSlotTblId + targetIndex, targetLen);
  }
  /**
   * Returns the value of crtnHipaaCd
   *
   * @return crtnHipaaCd
   */
  public char[] getCrtnHipaaCd() throws CFException {
    if (isCrtnHipaaCdModified()) {
      crtnHipaaCd = refreshCrtnHipaaCd();
    }
    return crtnHipaaCd;
  }

  /**
   * set variable crtnHipaaCd Corresponding COBOL Variable is CRTN-HIPAA-CD
   *
   * @param value
   */
  public void setCrtnHipaaCd(char[] value) {
    crtnHipaaCd = checkCrtnHipaaCdConstraints(value);
    serializeCrtnHipaaCd(crtnHipaaCd);
  }

  /**
   * Update CrtnHipaaCd with a char[] from an offset and length
   *
   * @param value
   */
  public void setCrtnHipaaCd(char[] source, int sourceIndex) {
    replace(source, sourceIndex, source.length, beginCrtnHipaaCd, crtnHipaaCd.length);
  }

  public void setCrtnHipaaCd(char[] source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginCrtnHipaaCd, crtnHipaaCd.length);
  }

  /**
   * Update CrtnHipaaCd with a char[] from an offset and length to an offset and length
   *
   * @param value
   */
  public void setCrtnHipaaCd(
      char[] source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginCrtnHipaaCd + targetIndex, targetLen);
  }

  /**
   * Update CrtnHipaaCd with another Field
   *
   * @param value
   */
  public void setCrtnHipaaCd(Field source) {
    replace(source, 0, source.length(), beginCrtnHipaaCd, CRTN_HIPAA_CD_LEN);
  }

  /**
   * Update CrtnHipaaCd with another Field from an offset and length
   *
   * @param value
   */
  public void setCrtnHipaaCd(Field source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginCrtnHipaaCd, CRTN_HIPAA_CD_LEN);
  }

  /**
   * Update CrtnHipaaCd with another Field from an offset and length to an offset and length
   *
   * @param value
   */
  public void setCrtnHipaaCd(
      Field source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginCrtnHipaaCd + targetIndex, targetLen);
  }
  /**
   * Returns the value of crtnHipaaVerNbr
   *
   * @return crtnHipaaVerNbr
   */
  public char[] getCrtnHipaaVerNbr() throws CFException {
    if (isCrtnHipaaVerNbrModified()) {
      crtnHipaaVerNbr = refreshCrtnHipaaVerNbr();
    }
    return crtnHipaaVerNbr;
  }

  /**
   * set variable crtnHipaaVerNbr Corresponding COBOL Variable is CRTN-HIPAA-VER-NBR
   *
   * @param value
   */
  public void setCrtnHipaaVerNbr(char[] value) {
    crtnHipaaVerNbr = checkCrtnHipaaVerNbrConstraints(value);
    serializeCrtnHipaaVerNbr(crtnHipaaVerNbr);
  }

  /**
   * Update CrtnHipaaVerNbr with a char[] from an offset and length
   *
   * @param value
   */
  public void setCrtnHipaaVerNbr(char[] source, int sourceIndex) {
    replace(source, sourceIndex, source.length, beginCrtnHipaaVerNbr, crtnHipaaVerNbr.length);
  }

  public void setCrtnHipaaVerNbr(char[] source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginCrtnHipaaVerNbr, crtnHipaaVerNbr.length);
  }

  /**
   * Update CrtnHipaaVerNbr with a char[] from an offset and length to an offset and length
   *
   * @param value
   */
  public void setCrtnHipaaVerNbr(
      char[] source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginCrtnHipaaVerNbr + targetIndex, targetLen);
  }

  /**
   * Update CrtnHipaaVerNbr with another Field
   *
   * @param value
   */
  public void setCrtnHipaaVerNbr(Field source) {
    replace(source, 0, source.length(), beginCrtnHipaaVerNbr, CRTN_HIPAA_VER_NBR_LEN);
  }

  /**
   * Update CrtnHipaaVerNbr with another Field from an offset and length
   *
   * @param value
   */
  public void setCrtnHipaaVerNbr(Field source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginCrtnHipaaVerNbr, CRTN_HIPAA_VER_NBR_LEN);
  }

  /**
   * Update CrtnHipaaVerNbr with another Field from an offset and length to an offset and length
   *
   * @param value
   */
  public void setCrtnHipaaVerNbr(
      Field source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginCrtnHipaaVerNbr + targetIndex, targetLen);
  }
  /**
   * Returns the value of crtnStsCd
   *
   * @return crtnStsCd
   */
  public char[] getCrtnStsCd() throws CFException {
    if (isCrtnStsCdModified()) {
      crtnStsCd = refreshCrtnStsCd();
    }
    return crtnStsCd;
  }

  /**
   * set variable crtnStsCd Corresponding COBOL Variable is CRTN-STS-CD
   *
   * @param value
   */
  public void setCrtnStsCd(char[] value) {
    crtnStsCd = checkCrtnStsCdConstraints(value);
    serializeCrtnStsCd(crtnStsCd);
  }

  /**
   * Update CrtnStsCd with a char[] from an offset and length
   *
   * @param value
   */
  public void setCrtnStsCd(char[] source, int sourceIndex) {
    replace(source, sourceIndex, source.length, beginCrtnStsCd, crtnStsCd.length);
  }

  public void setCrtnStsCd(char[] source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginCrtnStsCd, crtnStsCd.length);
  }

  /**
   * Update CrtnStsCd with a char[] from an offset and length to an offset and length
   *
   * @param value
   */
  public void setCrtnStsCd(
      char[] source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginCrtnStsCd + targetIndex, targetLen);
  }

  /**
   * Update CrtnStsCd with another Field
   *
   * @param value
   */
  public void setCrtnStsCd(Field source) {
    replace(source, 0, source.length(), beginCrtnStsCd, CRTN_STS_CD_LEN);
  }

  /**
   * Update CrtnStsCd with another Field from an offset and length
   *
   * @param value
   */
  public void setCrtnStsCd(Field source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginCrtnStsCd, CRTN_STS_CD_LEN);
  }

  /**
   * Update CrtnStsCd with another Field from an offset and length to an offset and length
   *
   * @param value
   */
  public void setCrtnStsCd(
      Field source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginCrtnStsCd + targetIndex, targetLen);
  }

  public static int getCrtnSrchKeyFieldLength() {
    return CRTN_SRCH_KEY_LENGTH;
  }
}
