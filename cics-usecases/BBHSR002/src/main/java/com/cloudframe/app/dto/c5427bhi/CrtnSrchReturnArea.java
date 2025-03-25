package com.cloudframe.app.dto.c5427bhi;

/**
 * The class CrtnSrchReturnArea is used to handle fields declared in it
 *
 * @author CloudFrame Inc. created on 2025-03-25 at 08:32. using version 5.0.0.231
 */
import com.cloudframe.app.data.Field;
import com.cloudframe.app.dto.serialize.c5427bhi.*;
import com.cloudframe.app.exception.CFException;

public class CrtnSrchReturnArea extends CrtnSrchReturnAreaSerialized {

  private int crtnSqlcode;

  private char[] crtnSrchFoundSw = Field.fillLowValue(1);

  private char[] crtnNtwkTypCd = Field.fillLowValue(1);

  private char[] crtnEffDt = Field.fillLowValue(10);

  private char[] crtnCancDt = Field.fillLowValue(10);

  private char[] crtnSrvcCd = Field.fillLowValue(6);

  private char[] crtnPlOfSrvcCd = Field.fillLowValue(2);

  private char[] crtnCausCd = Field.fillLowValue(1);

  private char[] crtnBenLvlCd = Field.fillLowValue(1);

  private char[] crtnInNtwkClssCd = Field.fillLowValue(1);

  private char[] crtnTier1NtwkClssCd = Field.fillLowValue(1);

  private char[] crtnProcCdRngBegnVal = Field.fillLowValue(7);

  private char[] crtnProcCdRngEndVal = Field.fillLowValue(7);

  private char[] crtnProcCdRngTypVal = Field.fillLowValue(1);

  private char[] crtnProvOrgTypCd = Field.fillLowValue(3);

  private char[] crtnHipaaCommtTxt = Field.fillLowValue(300);

  /** Constructor for CrtnSrchReturnArea */
  public CrtnSrchReturnArea() {
    // TO-DO auto generated code
  }

  /**
   * Constructor for CrtnSrchReturnArea. sets the parent value to the parent
   *
   * @param parent
   * @param begin
   */
  public CrtnSrchReturnArea(Field parent, int begin) {
    setParent(parent, begin);
  }

  /**
   * Returns the value of crtnSqlcode
   *
   * @return crtnSqlcode
   */
  public int getCrtnSqlcode() throws CFException {
    if (isCrtnSqlcodeModified()) {
      crtnSqlcode = refreshCrtnSqlcode();
    }
    return crtnSqlcode;
  }

  /**
   * Update CrtnSqlcode with the passed value Corresponding COBOL Variable is CRTN-SQLCODE
   *
   * @param number
   */
  public void setCrtnSqlcode(int number) {
    // Truncate if the number is beyond +/- Max range
    crtnSqlcode = checkCrtnSqlcodeMaxLimit(number);
    serializeCrtnSqlcode(crtnSqlcode);
  }

  public void setCrtnSqlcode(long number) {
    number = checkCrtnSqlcodeMaxLimit(number); // Truncate if value is beyond +/- Max range
    setCrtnSqlcode((int) number);
  }

  /**
   * Returns the value of crtnSrchFoundSw
   *
   * @return crtnSrchFoundSw
   */
  public char[] getCrtnSrchFoundSw() throws CFException {
    if (isCrtnSrchFoundSwModified()) {
      crtnSrchFoundSw = refreshCrtnSrchFoundSw();
    }
    return crtnSrchFoundSw;
  }

  /**
   * set variable crtnSrchFoundSw Corresponding COBOL Variable is CRTN-SRCH-FOUND-SW
   *
   * @param value
   */
  public void setCrtnSrchFoundSw(char[] value) {
    crtnSrchFoundSw = checkCrtnSrchFoundSwConstraints(value);
    serializeCrtnSrchFoundSw(crtnSrchFoundSw);
  }

  /**
   * Update CrtnSrchFoundSw with a char[] from an offset and length
   *
   * @param value
   */
  public void setCrtnSrchFoundSw(char[] source, int sourceIndex) {
    replace(source, sourceIndex, source.length, beginCrtnSrchFoundSw, crtnSrchFoundSw.length);
  }

  public void setCrtnSrchFoundSw(char[] source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginCrtnSrchFoundSw, crtnSrchFoundSw.length);
  }

  /**
   * Update CrtnSrchFoundSw with a char[] from an offset and length to an offset and length
   *
   * @param value
   */
  public void setCrtnSrchFoundSw(
      char[] source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginCrtnSrchFoundSw + targetIndex, targetLen);
  }

  /**
   * Update CrtnSrchFoundSw with another Field
   *
   * @param value
   */
  public void setCrtnSrchFoundSw(Field source) {
    replace(source, 0, source.length(), beginCrtnSrchFoundSw, CRTN_SRCH_FOUND_SW_LEN);
  }

  /**
   * Update CrtnSrchFoundSw with another Field from an offset and length
   *
   * @param value
   */
  public void setCrtnSrchFoundSw(Field source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginCrtnSrchFoundSw, CRTN_SRCH_FOUND_SW_LEN);
  }

  /**
   * Update CrtnSrchFoundSw with another Field from an offset and length to an offset and length
   *
   * @param value
   */
  public void setCrtnSrchFoundSw(
      Field source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginCrtnSrchFoundSw + targetIndex, targetLen);
  }

  char[] crtnSrchFoundSwIsYes88Value = "Y".toCharArray();
  /**
   * Test condition "Y" for isCrtnSrchFoundSwIsYes()
   *
   * @return Returns true if isCrtnSrchFoundSwIsYes() is "Y"
   */
  public boolean isCrtnSrchFoundSwIsYes() throws CFException {
    return (compareChars(getCrtnSrchFoundSw(), crtnSrchFoundSwIsYes88Value) == 0);
  }

  /** set values "Y" */
  public void setCrtnSrchFoundSwIsYesTrue() {
    setCrtnSrchFoundSw(crtnSrchFoundSwIsYes88Value);
  }

  char[] crtnSrchFoundSwIsNo88Value = "N".toCharArray();
  /**
   * Test condition "N" for isCrtnSrchFoundSwIsNo()
   *
   * @return Returns true if isCrtnSrchFoundSwIsNo() is "N"
   */
  public boolean isCrtnSrchFoundSwIsNo() throws CFException {
    return (compareChars(getCrtnSrchFoundSw(), crtnSrchFoundSwIsNo88Value) == 0);
  }

  /** set values "N" */
  public void setCrtnSrchFoundSwIsNoTrue() {
    setCrtnSrchFoundSw(crtnSrchFoundSwIsNo88Value);
  }

  char[] crtnSrchFoundSwIsOverflow88Value = "?".toCharArray();
  /**
   * Test condition "?" for isCrtnSrchFoundSwIsOverflow()
   *
   * @return Returns true if isCrtnSrchFoundSwIsOverflow() is "?"
   */
  public boolean isCrtnSrchFoundSwIsOverflow() throws CFException {
    return (compareChars(getCrtnSrchFoundSw(), crtnSrchFoundSwIsOverflow88Value) == 0);
  }

  /** set values "?" */
  public void setCrtnSrchFoundSwIsOverflowTrue() {
    setCrtnSrchFoundSw(crtnSrchFoundSwIsOverflow88Value);
  }
  /**
   * Returns the value of crtnNtwkTypCd
   *
   * @return crtnNtwkTypCd
   */
  public char[] getCrtnNtwkTypCd() throws CFException {
    if (isCrtnNtwkTypCdModified()) {
      crtnNtwkTypCd = refreshCrtnNtwkTypCd();
    }
    return crtnNtwkTypCd;
  }

  /**
   * set variable crtnNtwkTypCd Corresponding COBOL Variable is CRTN-NTWK-TYP-CD
   *
   * @param value
   */
  public void setCrtnNtwkTypCd(char[] value) {
    crtnNtwkTypCd = checkCrtnNtwkTypCdConstraints(value);
    serializeCrtnNtwkTypCd(crtnNtwkTypCd);
  }

  /**
   * Update CrtnNtwkTypCd with a char[] from an offset and length
   *
   * @param value
   */
  public void setCrtnNtwkTypCd(char[] source, int sourceIndex) {
    replace(source, sourceIndex, source.length, beginCrtnNtwkTypCd, crtnNtwkTypCd.length);
  }

  public void setCrtnNtwkTypCd(char[] source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginCrtnNtwkTypCd, crtnNtwkTypCd.length);
  }

  /**
   * Update CrtnNtwkTypCd with a char[] from an offset and length to an offset and length
   *
   * @param value
   */
  public void setCrtnNtwkTypCd(
      char[] source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginCrtnNtwkTypCd + targetIndex, targetLen);
  }

  /**
   * Update CrtnNtwkTypCd with another Field
   *
   * @param value
   */
  public void setCrtnNtwkTypCd(Field source) {
    replace(source, 0, source.length(), beginCrtnNtwkTypCd, CRTN_NTWK_TYP_CD_LEN);
  }

  /**
   * Update CrtnNtwkTypCd with another Field from an offset and length
   *
   * @param value
   */
  public void setCrtnNtwkTypCd(Field source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginCrtnNtwkTypCd, CRTN_NTWK_TYP_CD_LEN);
  }

  /**
   * Update CrtnNtwkTypCd with another Field from an offset and length to an offset and length
   *
   * @param value
   */
  public void setCrtnNtwkTypCd(
      Field source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginCrtnNtwkTypCd + targetIndex, targetLen);
  }
  /**
   * Returns the value of crtnEffDt
   *
   * @return crtnEffDt
   */
  public char[] getCrtnEffDt() throws CFException {
    if (isCrtnEffDtModified()) {
      crtnEffDt = refreshCrtnEffDt();
    }
    return crtnEffDt;
  }

  /**
   * set variable crtnEffDt Corresponding COBOL Variable is CRTN-EFF-DT
   *
   * @param value
   */
  public void setCrtnEffDt(char[] value) {
    crtnEffDt = checkCrtnEffDtConstraints(value);
    serializeCrtnEffDt(crtnEffDt);
  }

  /**
   * Update CrtnEffDt with a char[] from an offset and length
   *
   * @param value
   */
  public void setCrtnEffDt(char[] source, int sourceIndex) {
    replace(source, sourceIndex, source.length, beginCrtnEffDt, crtnEffDt.length);
  }

  public void setCrtnEffDt(char[] source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginCrtnEffDt, crtnEffDt.length);
  }

  /**
   * Update CrtnEffDt with a char[] from an offset and length to an offset and length
   *
   * @param value
   */
  public void setCrtnEffDt(
      char[] source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginCrtnEffDt + targetIndex, targetLen);
  }

  /**
   * Update CrtnEffDt with another Field
   *
   * @param value
   */
  public void setCrtnEffDt(Field source) {
    replace(source, 0, source.length(), beginCrtnEffDt, CRTN_EFF_DT_LEN);
  }

  /**
   * Update CrtnEffDt with another Field from an offset and length
   *
   * @param value
   */
  public void setCrtnEffDt(Field source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginCrtnEffDt, CRTN_EFF_DT_LEN);
  }

  /**
   * Update CrtnEffDt with another Field from an offset and length to an offset and length
   *
   * @param value
   */
  public void setCrtnEffDt(
      Field source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginCrtnEffDt + targetIndex, targetLen);
  }
  /**
   * Returns the value of crtnCancDt
   *
   * @return crtnCancDt
   */
  public char[] getCrtnCancDt() throws CFException {
    if (isCrtnCancDtModified()) {
      crtnCancDt = refreshCrtnCancDt();
    }
    return crtnCancDt;
  }

  /**
   * set variable crtnCancDt Corresponding COBOL Variable is CRTN-CANC-DT
   *
   * @param value
   */
  public void setCrtnCancDt(char[] value) {
    crtnCancDt = checkCrtnCancDtConstraints(value);
    serializeCrtnCancDt(crtnCancDt);
  }

  /**
   * Update CrtnCancDt with a char[] from an offset and length
   *
   * @param value
   */
  public void setCrtnCancDt(char[] source, int sourceIndex) {
    replace(source, sourceIndex, source.length, beginCrtnCancDt, crtnCancDt.length);
  }

  public void setCrtnCancDt(char[] source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginCrtnCancDt, crtnCancDt.length);
  }

  /**
   * Update CrtnCancDt with a char[] from an offset and length to an offset and length
   *
   * @param value
   */
  public void setCrtnCancDt(
      char[] source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginCrtnCancDt + targetIndex, targetLen);
  }

  /**
   * Update CrtnCancDt with another Field
   *
   * @param value
   */
  public void setCrtnCancDt(Field source) {
    replace(source, 0, source.length(), beginCrtnCancDt, CRTN_CANC_DT_LEN);
  }

  /**
   * Update CrtnCancDt with another Field from an offset and length
   *
   * @param value
   */
  public void setCrtnCancDt(Field source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginCrtnCancDt, CRTN_CANC_DT_LEN);
  }

  /**
   * Update CrtnCancDt with another Field from an offset and length to an offset and length
   *
   * @param value
   */
  public void setCrtnCancDt(
      Field source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginCrtnCancDt + targetIndex, targetLen);
  }
  /**
   * Returns the value of crtnSrvcCd
   *
   * @return crtnSrvcCd
   */
  public char[] getCrtnSrvcCd() throws CFException {
    if (isCrtnSrvcCdModified()) {
      crtnSrvcCd = refreshCrtnSrvcCd();
    }
    return crtnSrvcCd;
  }

  /**
   * set variable crtnSrvcCd Corresponding COBOL Variable is CRTN-SRVC-CD
   *
   * @param value
   */
  public void setCrtnSrvcCd(char[] value) {
    crtnSrvcCd = checkCrtnSrvcCdConstraints(value);
    serializeCrtnSrvcCd(crtnSrvcCd);
  }

  /**
   * Update CrtnSrvcCd with a char[] from an offset and length
   *
   * @param value
   */
  public void setCrtnSrvcCd(char[] source, int sourceIndex) {
    replace(source, sourceIndex, source.length, beginCrtnSrvcCd, crtnSrvcCd.length);
  }

  public void setCrtnSrvcCd(char[] source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginCrtnSrvcCd, crtnSrvcCd.length);
  }

  /**
   * Update CrtnSrvcCd with a char[] from an offset and length to an offset and length
   *
   * @param value
   */
  public void setCrtnSrvcCd(
      char[] source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginCrtnSrvcCd + targetIndex, targetLen);
  }

  /**
   * Update CrtnSrvcCd with another Field
   *
   * @param value
   */
  public void setCrtnSrvcCd(Field source) {
    replace(source, 0, source.length(), beginCrtnSrvcCd, CRTN_SRVC_CD_LEN);
  }

  /**
   * Update CrtnSrvcCd with another Field from an offset and length
   *
   * @param value
   */
  public void setCrtnSrvcCd(Field source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginCrtnSrvcCd, CRTN_SRVC_CD_LEN);
  }

  /**
   * Update CrtnSrvcCd with another Field from an offset and length to an offset and length
   *
   * @param value
   */
  public void setCrtnSrvcCd(
      Field source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginCrtnSrvcCd + targetIndex, targetLen);
  }
  /**
   * Returns the value of crtnPlOfSrvcCd
   *
   * @return crtnPlOfSrvcCd
   */
  public char[] getCrtnPlOfSrvcCd() throws CFException {
    if (isCrtnPlOfSrvcCdModified()) {
      crtnPlOfSrvcCd = refreshCrtnPlOfSrvcCd();
    }
    return crtnPlOfSrvcCd;
  }

  /**
   * set variable crtnPlOfSrvcCd Corresponding COBOL Variable is CRTN-PL-OF-SRVC-CD
   *
   * @param value
   */
  public void setCrtnPlOfSrvcCd(char[] value) {
    crtnPlOfSrvcCd = checkCrtnPlOfSrvcCdConstraints(value);
    serializeCrtnPlOfSrvcCd(crtnPlOfSrvcCd);
  }

  /**
   * Update CrtnPlOfSrvcCd with a char[] from an offset and length
   *
   * @param value
   */
  public void setCrtnPlOfSrvcCd(char[] source, int sourceIndex) {
    replace(source, sourceIndex, source.length, beginCrtnPlOfSrvcCd, crtnPlOfSrvcCd.length);
  }

  public void setCrtnPlOfSrvcCd(char[] source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginCrtnPlOfSrvcCd, crtnPlOfSrvcCd.length);
  }

  /**
   * Update CrtnPlOfSrvcCd with a char[] from an offset and length to an offset and length
   *
   * @param value
   */
  public void setCrtnPlOfSrvcCd(
      char[] source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginCrtnPlOfSrvcCd + targetIndex, targetLen);
  }

  /**
   * Update CrtnPlOfSrvcCd with another Field
   *
   * @param value
   */
  public void setCrtnPlOfSrvcCd(Field source) {
    replace(source, 0, source.length(), beginCrtnPlOfSrvcCd, CRTN_PL_OF_SRVC_CD_LEN);
  }

  /**
   * Update CrtnPlOfSrvcCd with another Field from an offset and length
   *
   * @param value
   */
  public void setCrtnPlOfSrvcCd(Field source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginCrtnPlOfSrvcCd, CRTN_PL_OF_SRVC_CD_LEN);
  }

  /**
   * Update CrtnPlOfSrvcCd with another Field from an offset and length to an offset and length
   *
   * @param value
   */
  public void setCrtnPlOfSrvcCd(
      Field source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginCrtnPlOfSrvcCd + targetIndex, targetLen);
  }
  /**
   * Returns the value of crtnCausCd
   *
   * @return crtnCausCd
   */
  public char[] getCrtnCausCd() throws CFException {
    if (isCrtnCausCdModified()) {
      crtnCausCd = refreshCrtnCausCd();
    }
    return crtnCausCd;
  }

  /**
   * set variable crtnCausCd Corresponding COBOL Variable is CRTN-CAUS-CD
   *
   * @param value
   */
  public void setCrtnCausCd(char[] value) {
    crtnCausCd = checkCrtnCausCdConstraints(value);
    serializeCrtnCausCd(crtnCausCd);
  }

  /**
   * Update CrtnCausCd with a char[] from an offset and length
   *
   * @param value
   */
  public void setCrtnCausCd(char[] source, int sourceIndex) {
    replace(source, sourceIndex, source.length, beginCrtnCausCd, crtnCausCd.length);
  }

  public void setCrtnCausCd(char[] source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginCrtnCausCd, crtnCausCd.length);
  }

  /**
   * Update CrtnCausCd with a char[] from an offset and length to an offset and length
   *
   * @param value
   */
  public void setCrtnCausCd(
      char[] source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginCrtnCausCd + targetIndex, targetLen);
  }

  /**
   * Update CrtnCausCd with another Field
   *
   * @param value
   */
  public void setCrtnCausCd(Field source) {
    replace(source, 0, source.length(), beginCrtnCausCd, CRTN_CAUS_CD_LEN);
  }

  /**
   * Update CrtnCausCd with another Field from an offset and length
   *
   * @param value
   */
  public void setCrtnCausCd(Field source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginCrtnCausCd, CRTN_CAUS_CD_LEN);
  }

  /**
   * Update CrtnCausCd with another Field from an offset and length to an offset and length
   *
   * @param value
   */
  public void setCrtnCausCd(
      Field source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginCrtnCausCd + targetIndex, targetLen);
  }
  /**
   * Returns the value of crtnBenLvlCd
   *
   * @return crtnBenLvlCd
   */
  public char[] getCrtnBenLvlCd() throws CFException {
    if (isCrtnBenLvlCdModified()) {
      crtnBenLvlCd = refreshCrtnBenLvlCd();
    }
    return crtnBenLvlCd;
  }

  /**
   * set variable crtnBenLvlCd Corresponding COBOL Variable is CRTN-BEN-LVL-CD
   *
   * @param value
   */
  public void setCrtnBenLvlCd(char[] value) {
    crtnBenLvlCd = checkCrtnBenLvlCdConstraints(value);
    serializeCrtnBenLvlCd(crtnBenLvlCd);
  }

  /**
   * Update CrtnBenLvlCd with a char[] from an offset and length
   *
   * @param value
   */
  public void setCrtnBenLvlCd(char[] source, int sourceIndex) {
    replace(source, sourceIndex, source.length, beginCrtnBenLvlCd, crtnBenLvlCd.length);
  }

  public void setCrtnBenLvlCd(char[] source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginCrtnBenLvlCd, crtnBenLvlCd.length);
  }

  /**
   * Update CrtnBenLvlCd with a char[] from an offset and length to an offset and length
   *
   * @param value
   */
  public void setCrtnBenLvlCd(
      char[] source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginCrtnBenLvlCd + targetIndex, targetLen);
  }

  /**
   * Update CrtnBenLvlCd with another Field
   *
   * @param value
   */
  public void setCrtnBenLvlCd(Field source) {
    replace(source, 0, source.length(), beginCrtnBenLvlCd, CRTN_BEN_LVL_CD_LEN);
  }

  /**
   * Update CrtnBenLvlCd with another Field from an offset and length
   *
   * @param value
   */
  public void setCrtnBenLvlCd(Field source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginCrtnBenLvlCd, CRTN_BEN_LVL_CD_LEN);
  }

  /**
   * Update CrtnBenLvlCd with another Field from an offset and length to an offset and length
   *
   * @param value
   */
  public void setCrtnBenLvlCd(
      Field source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginCrtnBenLvlCd + targetIndex, targetLen);
  }
  /**
   * Returns the value of crtnInNtwkClssCd
   *
   * @return crtnInNtwkClssCd
   */
  public char[] getCrtnInNtwkClssCd() throws CFException {
    if (isCrtnInNtwkClssCdModified()) {
      crtnInNtwkClssCd = refreshCrtnInNtwkClssCd();
    }
    return crtnInNtwkClssCd;
  }

  /**
   * set variable crtnInNtwkClssCd Corresponding COBOL Variable is CRTN-IN-NTWK-CLSS-CD
   *
   * @param value
   */
  public void setCrtnInNtwkClssCd(char[] value) {
    crtnInNtwkClssCd = checkCrtnInNtwkClssCdConstraints(value);
    serializeCrtnInNtwkClssCd(crtnInNtwkClssCd);
  }

  /**
   * Update CrtnInNtwkClssCd with a char[] from an offset and length
   *
   * @param value
   */
  public void setCrtnInNtwkClssCd(char[] source, int sourceIndex) {
    replace(source, sourceIndex, source.length, beginCrtnInNtwkClssCd, crtnInNtwkClssCd.length);
  }

  public void setCrtnInNtwkClssCd(char[] source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginCrtnInNtwkClssCd, crtnInNtwkClssCd.length);
  }

  /**
   * Update CrtnInNtwkClssCd with a char[] from an offset and length to an offset and length
   *
   * @param value
   */
  public void setCrtnInNtwkClssCd(
      char[] source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginCrtnInNtwkClssCd + targetIndex, targetLen);
  }

  /**
   * Update CrtnInNtwkClssCd with another Field
   *
   * @param value
   */
  public void setCrtnInNtwkClssCd(Field source) {
    replace(source, 0, source.length(), beginCrtnInNtwkClssCd, CRTN_IN_NTWK_CLSS_CD_LEN);
  }

  /**
   * Update CrtnInNtwkClssCd with another Field from an offset and length
   *
   * @param value
   */
  public void setCrtnInNtwkClssCd(Field source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginCrtnInNtwkClssCd, CRTN_IN_NTWK_CLSS_CD_LEN);
  }

  /**
   * Update CrtnInNtwkClssCd with another Field from an offset and length to an offset and length
   *
   * @param value
   */
  public void setCrtnInNtwkClssCd(
      Field source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginCrtnInNtwkClssCd + targetIndex, targetLen);
  }
  /**
   * Returns the value of crtnTier1NtwkClssCd
   *
   * @return crtnTier1NtwkClssCd
   */
  public char[] getCrtnTier1NtwkClssCd() throws CFException {
    if (isCrtnTier1NtwkClssCdModified()) {
      crtnTier1NtwkClssCd = refreshCrtnTier1NtwkClssCd();
    }
    return crtnTier1NtwkClssCd;
  }

  /**
   * set variable crtnTier1NtwkClssCd Corresponding COBOL Variable is CRTN-TIER1-NTWK-CLSS-CD
   *
   * @param value
   */
  public void setCrtnTier1NtwkClssCd(char[] value) {
    crtnTier1NtwkClssCd = checkCrtnTier1NtwkClssCdConstraints(value);
    serializeCrtnTier1NtwkClssCd(crtnTier1NtwkClssCd);
  }

  /**
   * Update CrtnTier1NtwkClssCd with a char[] from an offset and length
   *
   * @param value
   */
  public void setCrtnTier1NtwkClssCd(char[] source, int sourceIndex) {
    replace(
        source, sourceIndex, source.length, beginCrtnTier1NtwkClssCd, crtnTier1NtwkClssCd.length);
  }

  public void setCrtnTier1NtwkClssCd(char[] source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginCrtnTier1NtwkClssCd, crtnTier1NtwkClssCd.length);
  }

  /**
   * Update CrtnTier1NtwkClssCd with a char[] from an offset and length to an offset and length
   *
   * @param value
   */
  public void setCrtnTier1NtwkClssCd(
      char[] source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginCrtnTier1NtwkClssCd + targetIndex, targetLen);
  }

  /**
   * Update CrtnTier1NtwkClssCd with another Field
   *
   * @param value
   */
  public void setCrtnTier1NtwkClssCd(Field source) {
    replace(source, 0, source.length(), beginCrtnTier1NtwkClssCd, CRTN_TIER_1_NTWK_CLSS_CD_LEN);
  }

  /**
   * Update CrtnTier1NtwkClssCd with another Field from an offset and length
   *
   * @param value
   */
  public void setCrtnTier1NtwkClssCd(Field source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginCrtnTier1NtwkClssCd, CRTN_TIER_1_NTWK_CLSS_CD_LEN);
  }

  /**
   * Update CrtnTier1NtwkClssCd with another Field from an offset and length to an offset and length
   *
   * @param value
   */
  public void setCrtnTier1NtwkClssCd(
      Field source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginCrtnTier1NtwkClssCd + targetIndex, targetLen);
  }
  /**
   * Returns the value of crtnProcCdRngBegnVal
   *
   * @return crtnProcCdRngBegnVal
   */
  public char[] getCrtnProcCdRngBegnVal() throws CFException {
    if (isCrtnProcCdRngBegnValModified()) {
      crtnProcCdRngBegnVal = refreshCrtnProcCdRngBegnVal();
    }
    return crtnProcCdRngBegnVal;
  }

  /**
   * set variable crtnProcCdRngBegnVal Corresponding COBOL Variable is CRTN-PROC-CD-RNG-BEGN-VAL
   *
   * @param value
   */
  public void setCrtnProcCdRngBegnVal(char[] value) {
    crtnProcCdRngBegnVal = checkCrtnProcCdRngBegnValConstraints(value);
    serializeCrtnProcCdRngBegnVal(crtnProcCdRngBegnVal);
  }

  /**
   * Update CrtnProcCdRngBegnVal with a char[] from an offset and length
   *
   * @param value
   */
  public void setCrtnProcCdRngBegnVal(char[] source, int sourceIndex) {
    replace(
        source, sourceIndex, source.length, beginCrtnProcCdRngBegnVal, crtnProcCdRngBegnVal.length);
  }

  public void setCrtnProcCdRngBegnVal(char[] source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginCrtnProcCdRngBegnVal, crtnProcCdRngBegnVal.length);
  }

  /**
   * Update CrtnProcCdRngBegnVal with a char[] from an offset and length to an offset and length
   *
   * @param value
   */
  public void setCrtnProcCdRngBegnVal(
      char[] source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginCrtnProcCdRngBegnVal + targetIndex, targetLen);
  }

  /**
   * Update CrtnProcCdRngBegnVal with another Field
   *
   * @param value
   */
  public void setCrtnProcCdRngBegnVal(Field source) {
    replace(source, 0, source.length(), beginCrtnProcCdRngBegnVal, CRTN_PROC_CD_RNG_BEGN_VAL_LEN);
  }

  /**
   * Update CrtnProcCdRngBegnVal with another Field from an offset and length
   *
   * @param value
   */
  public void setCrtnProcCdRngBegnVal(Field source, int sourceIndex, int sourceLen) {
    replace(
        source, sourceIndex, sourceLen, beginCrtnProcCdRngBegnVal, CRTN_PROC_CD_RNG_BEGN_VAL_LEN);
  }

  /**
   * Update CrtnProcCdRngBegnVal with another Field from an offset and length to an offset and
   * length
   *
   * @param value
   */
  public void setCrtnProcCdRngBegnVal(
      Field source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginCrtnProcCdRngBegnVal + targetIndex, targetLen);
  }
  /**
   * Returns the value of crtnProcCdRngEndVal
   *
   * @return crtnProcCdRngEndVal
   */
  public char[] getCrtnProcCdRngEndVal() throws CFException {
    if (isCrtnProcCdRngEndValModified()) {
      crtnProcCdRngEndVal = refreshCrtnProcCdRngEndVal();
    }
    return crtnProcCdRngEndVal;
  }

  /**
   * set variable crtnProcCdRngEndVal Corresponding COBOL Variable is CRTN-PROC-CD-RNG-END-VAL
   *
   * @param value
   */
  public void setCrtnProcCdRngEndVal(char[] value) {
    crtnProcCdRngEndVal = checkCrtnProcCdRngEndValConstraints(value);
    serializeCrtnProcCdRngEndVal(crtnProcCdRngEndVal);
  }

  /**
   * Update CrtnProcCdRngEndVal with a char[] from an offset and length
   *
   * @param value
   */
  public void setCrtnProcCdRngEndVal(char[] source, int sourceIndex) {
    replace(
        source, sourceIndex, source.length, beginCrtnProcCdRngEndVal, crtnProcCdRngEndVal.length);
  }

  public void setCrtnProcCdRngEndVal(char[] source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginCrtnProcCdRngEndVal, crtnProcCdRngEndVal.length);
  }

  /**
   * Update CrtnProcCdRngEndVal with a char[] from an offset and length to an offset and length
   *
   * @param value
   */
  public void setCrtnProcCdRngEndVal(
      char[] source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginCrtnProcCdRngEndVal + targetIndex, targetLen);
  }

  /**
   * Update CrtnProcCdRngEndVal with another Field
   *
   * @param value
   */
  public void setCrtnProcCdRngEndVal(Field source) {
    replace(source, 0, source.length(), beginCrtnProcCdRngEndVal, CRTN_PROC_CD_RNG_END_VAL_LEN);
  }

  /**
   * Update CrtnProcCdRngEndVal with another Field from an offset and length
   *
   * @param value
   */
  public void setCrtnProcCdRngEndVal(Field source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginCrtnProcCdRngEndVal, CRTN_PROC_CD_RNG_END_VAL_LEN);
  }

  /**
   * Update CrtnProcCdRngEndVal with another Field from an offset and length to an offset and length
   *
   * @param value
   */
  public void setCrtnProcCdRngEndVal(
      Field source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginCrtnProcCdRngEndVal + targetIndex, targetLen);
  }
  /**
   * Returns the value of crtnProcCdRngTypVal
   *
   * @return crtnProcCdRngTypVal
   */
  public char[] getCrtnProcCdRngTypVal() throws CFException {
    if (isCrtnProcCdRngTypValModified()) {
      crtnProcCdRngTypVal = refreshCrtnProcCdRngTypVal();
    }
    return crtnProcCdRngTypVal;
  }

  /**
   * set variable crtnProcCdRngTypVal Corresponding COBOL Variable is CRTN-PROC-CD-RNG-TYP-VAL
   *
   * @param value
   */
  public void setCrtnProcCdRngTypVal(char[] value) {
    crtnProcCdRngTypVal = checkCrtnProcCdRngTypValConstraints(value);
    serializeCrtnProcCdRngTypVal(crtnProcCdRngTypVal);
  }

  /**
   * Update CrtnProcCdRngTypVal with a char[] from an offset and length
   *
   * @param value
   */
  public void setCrtnProcCdRngTypVal(char[] source, int sourceIndex) {
    replace(
        source, sourceIndex, source.length, beginCrtnProcCdRngTypVal, crtnProcCdRngTypVal.length);
  }

  public void setCrtnProcCdRngTypVal(char[] source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginCrtnProcCdRngTypVal, crtnProcCdRngTypVal.length);
  }

  /**
   * Update CrtnProcCdRngTypVal with a char[] from an offset and length to an offset and length
   *
   * @param value
   */
  public void setCrtnProcCdRngTypVal(
      char[] source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginCrtnProcCdRngTypVal + targetIndex, targetLen);
  }

  /**
   * Update CrtnProcCdRngTypVal with another Field
   *
   * @param value
   */
  public void setCrtnProcCdRngTypVal(Field source) {
    replace(source, 0, source.length(), beginCrtnProcCdRngTypVal, CRTN_PROC_CD_RNG_TYP_VAL_LEN);
  }

  /**
   * Update CrtnProcCdRngTypVal with another Field from an offset and length
   *
   * @param value
   */
  public void setCrtnProcCdRngTypVal(Field source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginCrtnProcCdRngTypVal, CRTN_PROC_CD_RNG_TYP_VAL_LEN);
  }

  /**
   * Update CrtnProcCdRngTypVal with another Field from an offset and length to an offset and length
   *
   * @param value
   */
  public void setCrtnProcCdRngTypVal(
      Field source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginCrtnProcCdRngTypVal + targetIndex, targetLen);
  }
  /**
   * Returns the value of crtnProvOrgTypCd
   *
   * @return crtnProvOrgTypCd
   */
  public char[] getCrtnProvOrgTypCd() throws CFException {
    if (isCrtnProvOrgTypCdModified()) {
      crtnProvOrgTypCd = refreshCrtnProvOrgTypCd();
    }
    return crtnProvOrgTypCd;
  }

  /**
   * set variable crtnProvOrgTypCd Corresponding COBOL Variable is CRTN-PROV-ORG-TYP-CD
   *
   * @param value
   */
  public void setCrtnProvOrgTypCd(char[] value) {
    crtnProvOrgTypCd = checkCrtnProvOrgTypCdConstraints(value);
    serializeCrtnProvOrgTypCd(crtnProvOrgTypCd);
  }

  /**
   * Update CrtnProvOrgTypCd with a char[] from an offset and length
   *
   * @param value
   */
  public void setCrtnProvOrgTypCd(char[] source, int sourceIndex) {
    replace(source, sourceIndex, source.length, beginCrtnProvOrgTypCd, crtnProvOrgTypCd.length);
  }

  public void setCrtnProvOrgTypCd(char[] source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginCrtnProvOrgTypCd, crtnProvOrgTypCd.length);
  }

  /**
   * Update CrtnProvOrgTypCd with a char[] from an offset and length to an offset and length
   *
   * @param value
   */
  public void setCrtnProvOrgTypCd(
      char[] source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginCrtnProvOrgTypCd + targetIndex, targetLen);
  }

  /**
   * Update CrtnProvOrgTypCd with another Field
   *
   * @param value
   */
  public void setCrtnProvOrgTypCd(Field source) {
    replace(source, 0, source.length(), beginCrtnProvOrgTypCd, CRTN_PROV_ORG_TYP_CD_LEN);
  }

  /**
   * Update CrtnProvOrgTypCd with another Field from an offset and length
   *
   * @param value
   */
  public void setCrtnProvOrgTypCd(Field source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginCrtnProvOrgTypCd, CRTN_PROV_ORG_TYP_CD_LEN);
  }

  /**
   * Update CrtnProvOrgTypCd with another Field from an offset and length to an offset and length
   *
   * @param value
   */
  public void setCrtnProvOrgTypCd(
      Field source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginCrtnProvOrgTypCd + targetIndex, targetLen);
  }
  /**
   * Returns the value of crtnHipaaCommtTxt
   *
   * @return crtnHipaaCommtTxt
   */
  public char[] getCrtnHipaaCommtTxt() throws CFException {
    if (isCrtnHipaaCommtTxtModified()) {
      crtnHipaaCommtTxt = refreshCrtnHipaaCommtTxt();
    }
    return crtnHipaaCommtTxt;
  }

  /**
   * set variable crtnHipaaCommtTxt Corresponding COBOL Variable is CRTN-HIPAA-COMMT-TXT
   *
   * @param value
   */
  public void setCrtnHipaaCommtTxt(char[] value) {
    crtnHipaaCommtTxt = checkCrtnHipaaCommtTxtConstraints(value);
    serializeCrtnHipaaCommtTxt(crtnHipaaCommtTxt);
  }

  /**
   * Update CrtnHipaaCommtTxt with a char[] from an offset and length
   *
   * @param value
   */
  public void setCrtnHipaaCommtTxt(char[] source, int sourceIndex) {
    replace(source, sourceIndex, source.length, beginCrtnHipaaCommtTxt, crtnHipaaCommtTxt.length);
  }

  public void setCrtnHipaaCommtTxt(char[] source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginCrtnHipaaCommtTxt, crtnHipaaCommtTxt.length);
  }

  /**
   * Update CrtnHipaaCommtTxt with a char[] from an offset and length to an offset and length
   *
   * @param value
   */
  public void setCrtnHipaaCommtTxt(
      char[] source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginCrtnHipaaCommtTxt + targetIndex, targetLen);
  }

  /**
   * Update CrtnHipaaCommtTxt with another Field
   *
   * @param value
   */
  public void setCrtnHipaaCommtTxt(Field source) {
    replace(source, 0, source.length(), beginCrtnHipaaCommtTxt, CRTN_HIPAA_COMMT_TXT_LEN);
  }

  /**
   * Update CrtnHipaaCommtTxt with another Field from an offset and length
   *
   * @param value
   */
  public void setCrtnHipaaCommtTxt(Field source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginCrtnHipaaCommtTxt, CRTN_HIPAA_COMMT_TXT_LEN);
  }

  /**
   * Update CrtnHipaaCommtTxt with another Field from an offset and length to an offset and length
   *
   * @param value
   */
  public void setCrtnHipaaCommtTxt(
      Field source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginCrtnHipaaCommtTxt + targetIndex, targetLen);
  }

  public static int getCrtnSrchReturnAreaFieldLength() {
    return CRTN_SRCH_RETURN_AREA_LENGTH;
  }
}
