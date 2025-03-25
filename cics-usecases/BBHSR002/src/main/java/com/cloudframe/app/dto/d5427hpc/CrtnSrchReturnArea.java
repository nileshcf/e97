package com.cloudframe.app.dto.d5427hpc;

/**
 * The class CrtnSrchReturnArea is used to handle fields declared in it
 *
 * @author CloudFrame Inc. created on 2025-03-25 at 08:29. using version 5.0.0.231
 */
import com.cloudframe.app.data.Field;
import com.cloudframe.app.dto.serialize.d5427hpc.*;
import com.cloudframe.app.exception.CFException;

public class CrtnSrchReturnArea extends CrtnSrchReturnAreaSerialized {

  private int crtnSqlcode;

  private char[] crtnSrchFoundSw = Field.fillLowValue(1);

  private char[] crtnHipaaCd = Field.fillLowValue(2);

  private char[] crtnHipaaGrpCd = Field.fillLowValue(2);

  private char[] crtnGrnrcRqstCd = Field.fillLowValue(1);

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
   * Returns the value of crtnHipaaGrpCd
   *
   * @return crtnHipaaGrpCd
   */
  public char[] getCrtnHipaaGrpCd() throws CFException {
    if (isCrtnHipaaGrpCdModified()) {
      crtnHipaaGrpCd = refreshCrtnHipaaGrpCd();
    }
    return crtnHipaaGrpCd;
  }

  /**
   * set variable crtnHipaaGrpCd Corresponding COBOL Variable is CRTN-HIPAA-GRP-CD
   *
   * @param value
   */
  public void setCrtnHipaaGrpCd(char[] value) {
    crtnHipaaGrpCd = checkCrtnHipaaGrpCdConstraints(value);
    serializeCrtnHipaaGrpCd(crtnHipaaGrpCd);
  }

  /**
   * Update CrtnHipaaGrpCd with a char[] from an offset and length
   *
   * @param value
   */
  public void setCrtnHipaaGrpCd(char[] source, int sourceIndex) {
    replace(source, sourceIndex, source.length, beginCrtnHipaaGrpCd, crtnHipaaGrpCd.length);
  }

  public void setCrtnHipaaGrpCd(char[] source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginCrtnHipaaGrpCd, crtnHipaaGrpCd.length);
  }

  /**
   * Update CrtnHipaaGrpCd with a char[] from an offset and length to an offset and length
   *
   * @param value
   */
  public void setCrtnHipaaGrpCd(
      char[] source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginCrtnHipaaGrpCd + targetIndex, targetLen);
  }

  /**
   * Update CrtnHipaaGrpCd with another Field
   *
   * @param value
   */
  public void setCrtnHipaaGrpCd(Field source) {
    replace(source, 0, source.length(), beginCrtnHipaaGrpCd, CRTN_HIPAA_GRP_CD_LEN);
  }

  /**
   * Update CrtnHipaaGrpCd with another Field from an offset and length
   *
   * @param value
   */
  public void setCrtnHipaaGrpCd(Field source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginCrtnHipaaGrpCd, CRTN_HIPAA_GRP_CD_LEN);
  }

  /**
   * Update CrtnHipaaGrpCd with another Field from an offset and length to an offset and length
   *
   * @param value
   */
  public void setCrtnHipaaGrpCd(
      Field source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginCrtnHipaaGrpCd + targetIndex, targetLen);
  }
  /**
   * Returns the value of crtnGrnrcRqstCd
   *
   * @return crtnGrnrcRqstCd
   */
  public char[] getCrtnGrnrcRqstCd() throws CFException {
    if (isCrtnGrnrcRqstCdModified()) {
      crtnGrnrcRqstCd = refreshCrtnGrnrcRqstCd();
    }
    return crtnGrnrcRqstCd;
  }

  /**
   * set variable crtnGrnrcRqstCd Corresponding COBOL Variable is CRTN-GRNRC-RQST-CD
   *
   * @param value
   */
  public void setCrtnGrnrcRqstCd(char[] value) {
    crtnGrnrcRqstCd = checkCrtnGrnrcRqstCdConstraints(value);
    serializeCrtnGrnrcRqstCd(crtnGrnrcRqstCd);
  }

  /**
   * Update CrtnGrnrcRqstCd with a char[] from an offset and length
   *
   * @param value
   */
  public void setCrtnGrnrcRqstCd(char[] source, int sourceIndex) {
    replace(source, sourceIndex, source.length, beginCrtnGrnrcRqstCd, crtnGrnrcRqstCd.length);
  }

  public void setCrtnGrnrcRqstCd(char[] source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginCrtnGrnrcRqstCd, crtnGrnrcRqstCd.length);
  }

  /**
   * Update CrtnGrnrcRqstCd with a char[] from an offset and length to an offset and length
   *
   * @param value
   */
  public void setCrtnGrnrcRqstCd(
      char[] source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginCrtnGrnrcRqstCd + targetIndex, targetLen);
  }

  /**
   * Update CrtnGrnrcRqstCd with another Field
   *
   * @param value
   */
  public void setCrtnGrnrcRqstCd(Field source) {
    replace(source, 0, source.length(), beginCrtnGrnrcRqstCd, CRTN_GRNRC_RQST_CD_LEN);
  }

  /**
   * Update CrtnGrnrcRqstCd with another Field from an offset and length
   *
   * @param value
   */
  public void setCrtnGrnrcRqstCd(Field source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginCrtnGrnrcRqstCd, CRTN_GRNRC_RQST_CD_LEN);
  }

  /**
   * Update CrtnGrnrcRqstCd with another Field from an offset and length to an offset and length
   *
   * @param value
   */
  public void setCrtnGrnrcRqstCd(
      Field source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginCrtnGrnrcRqstCd + targetIndex, targetLen);
  }

  public static int getCrtnSrchReturnAreaFieldLength() {
    return CRTN_SRCH_RETURN_AREA_LENGTH;
  }
}
