package com.cloudframe.app.dto.bbhsr002;

/**
 * The class BhiReturnRow is used to handle fields declared in it
 *
 * @author CloudFrame Inc. created on 2025-03-25 at 08:29. using version 5.0.0.231
 */
import com.cloudframe.app.data.Field;
import com.cloudframe.app.dto.serialize.bbhsr002.*;
import com.cloudframe.app.exception.CFException;

public class BhiReturnRow extends BhiReturnRowSerialized {

  private char[] bhiRowReturnCd = Field.fillLowValue(2);

  private char[] bhiRowDb2Code = Field.fillLowValue(10);

  private char[] bhiRowAction = Field.fillLowValue(1);
  private BhiRowReturnDet bhiRowReturnDet = new BhiRowReturnDet();

  /** Constructor for BhiReturnRow */
  public BhiReturnRow() {
    // TO-DO auto generated code
  }

  /**
   * Constructor for BhiReturnRow. sets the parent value to the parent
   *
   * @param parent
   * @param begin
   */
  public BhiReturnRow(Field parent, int begin) {
    setParent(parent, begin);
  }

  @Override
  public void setParent(Field parent, int begin) {
    super.setParent(parent, begin);
    bhiRowReturnDet.setParent(this, getStartOffset() + 13);
  }

  /**
   * Returns the value of bhiRowReturnCd
   *
   * @return bhiRowReturnCd
   */
  public char[] getBhiRowReturnCd() throws CFException {
    if (isBhiRowReturnCdModified()) {
      bhiRowReturnCd = refreshBhiRowReturnCd();
    }
    return bhiRowReturnCd;
  }

  /**
   * set variable bhiRowReturnCd Corresponding COBOL Variable is BHI-ROW-RETURN-CD
   *
   * @param value
   */
  public void setBhiRowReturnCd(char[] value) {
    bhiRowReturnCd = checkBhiRowReturnCdConstraints(value);
    serializeBhiRowReturnCd(bhiRowReturnCd);
  }

  /**
   * Update BhiRowReturnCd with a char[] from an offset and length
   *
   * @param value
   */
  public void setBhiRowReturnCd(char[] source, int sourceIndex) {
    replace(source, sourceIndex, source.length, beginBhiRowReturnCd, bhiRowReturnCd.length);
  }

  public void setBhiRowReturnCd(char[] source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginBhiRowReturnCd, bhiRowReturnCd.length);
  }

  /**
   * Update BhiRowReturnCd with a char[] from an offset and length to an offset and length
   *
   * @param value
   */
  public void setBhiRowReturnCd(
      char[] source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginBhiRowReturnCd + targetIndex, targetLen);
  }

  /**
   * Update BhiRowReturnCd with another Field
   *
   * @param value
   */
  public void setBhiRowReturnCd(Field source) {
    replace(source, 0, source.length(), beginBhiRowReturnCd, BHI_ROW_RETURN_CD_LEN);
  }

  /**
   * Update BhiRowReturnCd with another Field from an offset and length
   *
   * @param value
   */
  public void setBhiRowReturnCd(Field source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginBhiRowReturnCd, BHI_ROW_RETURN_CD_LEN);
  }

  /**
   * Update BhiRowReturnCd with another Field from an offset and length to an offset and length
   *
   * @param value
   */
  public void setBhiRowReturnCd(
      Field source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginBhiRowReturnCd + targetIndex, targetLen);
  }

  char[] bhiRowRetGood88Value = "  ".toCharArray();
  /**
   * Test condition " " for isBhiRowRetGood()
   *
   * @return Returns true if isBhiRowRetGood() is " "
   */
  public boolean isBhiRowRetGood() throws CFException {
    return (compareChars(getBhiRowReturnCd(), bhiRowRetGood88Value) == 0);
  }

  /** set values " " */
  public void setBhiRowRetGoodTrue() {
    setBhiRowReturnCd(bhiRowRetGood88Value);
  }

  char[] bhiRowDb2Err88Value = "DB".toCharArray();
  /**
   * Test condition "DB" for isBhiRowDb2Err()
   *
   * @return Returns true if isBhiRowDb2Err() is "DB"
   */
  public boolean isBhiRowDb2Err() throws CFException {
    return (compareChars(getBhiRowReturnCd(), bhiRowDb2Err88Value) == 0);
  }

  /** set values "DB" */
  public void setBhiRowDb2ErrTrue() {
    setBhiRowReturnCd(bhiRowDb2Err88Value);
  }

  char[] bhiRowBadDate88Value = "RD".toCharArray();
  /**
   * Test condition "RD" for isBhiRowBadDate()
   *
   * @return Returns true if isBhiRowBadDate() is "RD"
   */
  public boolean isBhiRowBadDate() throws CFException {
    return (compareChars(getBhiRowReturnCd(), bhiRowBadDate88Value) == 0);
  }

  /** set values "RD" */
  public void setBhiRowBadDateTrue() {
    setBhiRowReturnCd(bhiRowBadDate88Value);
  }

  char[] bhiRowNotFound188Value = "NF".toCharArray();
  /**
   * Test condition "NF" for isBhiRowNotFound1()
   *
   * @return Returns true if isBhiRowNotFound1() is "NF"
   */
  public boolean isBhiRowNotFound1() throws CFException {
    return (compareChars(getBhiRowReturnCd(), bhiRowNotFound188Value) == 0);
  }

  /** set values "NF" */
  public void setBhiRowNotFound1True() {
    setBhiRowReturnCd(bhiRowNotFound188Value);
  }

  char[] bhiRowMissingData88Value = "MD".toCharArray();
  /**
   * Test condition "MD" for isBhiRowMissingData()
   *
   * @return Returns true if isBhiRowMissingData() is "MD"
   */
  public boolean isBhiRowMissingData() throws CFException {
    return (compareChars(getBhiRowReturnCd(), bhiRowMissingData88Value) == 0);
  }

  /** set values "MD" */
  public void setBhiRowMissingDataTrue() {
    setBhiRowReturnCd(bhiRowMissingData88Value);
  }

  char[] bhiRowDatesOverlap88Value = "DO".toCharArray();
  /**
   * Test condition "DO" for isBhiRowDatesOverlap()
   *
   * @return Returns true if isBhiRowDatesOverlap() is "DO"
   */
  public boolean isBhiRowDatesOverlap() throws CFException {
    return (compareChars(getBhiRowReturnCd(), bhiRowDatesOverlap88Value) == 0);
  }

  /** set values "DO" */
  public void setBhiRowDatesOverlapTrue() {
    setBhiRowReturnCd(bhiRowDatesOverlap88Value);
  }

  char[] bhiRowNotAddTblNotDef88Value = "TN".toCharArray();
  /**
   * Test condition "TN" for isBhiRowNotAddTblNotDef()
   *
   * @return Returns true if isBhiRowNotAddTblNotDef() is "TN"
   */
  public boolean isBhiRowNotAddTblNotDef() throws CFException {
    return (compareChars(getBhiRowReturnCd(), bhiRowNotAddTblNotDef88Value) == 0);
  }

  /** set values "TN" */
  public void setBhiRowNotAddTblNotDefTrue() {
    setBhiRowReturnCd(bhiRowNotAddTblNotDef88Value);
  }

  char[] bhiRowNotAddSrvcNotDef88Value = "SN".toCharArray();
  /**
   * Test condition "SN" for isBhiRowNotAddSrvcNotDef()
   *
   * @return Returns true if isBhiRowNotAddSrvcNotDef() is "SN"
   */
  public boolean isBhiRowNotAddSrvcNotDef() throws CFException {
    return (compareChars(getBhiRowReturnCd(), bhiRowNotAddSrvcNotDef88Value) == 0);
  }

  /** set values "SN" */
  public void setBhiRowNotAddSrvcNotDefTrue() {
    setBhiRowReturnCd(bhiRowNotAddSrvcNotDef88Value);
  }

  char[] bhiRowNotAddHipaaNotDef88Value = "HN".toCharArray();
  /**
   * Test condition "HN" for isBhiRowNotAddHipaaNotDef()
   *
   * @return Returns true if isBhiRowNotAddHipaaNotDef() is "HN"
   */
  public boolean isBhiRowNotAddHipaaNotDef() throws CFException {
    return (compareChars(getBhiRowReturnCd(), bhiRowNotAddHipaaNotDef88Value) == 0);
  }

  /** set values "HN" */
  public void setBhiRowNotAddHipaaNotDefTrue() {
    setBhiRowReturnCd(bhiRowNotAddHipaaNotDef88Value);
  }

  char[] bhiRowNotActive88Value = "NA".toCharArray();
  /**
   * Test condition "NA" for isBhiRowNotActive()
   *
   * @return Returns true if isBhiRowNotActive() is "NA"
   */
  public boolean isBhiRowNotActive() throws CFException {
    return (compareChars(getBhiRowReturnCd(), bhiRowNotActive88Value) == 0);
  }

  /** set values "NA" */
  public void setBhiRowNotActiveTrue() {
    setBhiRowReturnCd(bhiRowNotActive88Value);
  }

  char[] bhiRowDeadlock88Value = "DL".toCharArray();
  /**
   * Test condition "DL" for isBhiRowDeadlock()
   *
   * @return Returns true if isBhiRowDeadlock() is "DL"
   */
  public boolean isBhiRowDeadlock() throws CFException {
    return (compareChars(getBhiRowReturnCd(), bhiRowDeadlock88Value) == 0);
  }

  /** set values "DL" */
  public void setBhiRowDeadlockTrue() {
    setBhiRowReturnCd(bhiRowDeadlock88Value);
  }

  char[] bhiRowAlreadyExist88Value = "AE".toCharArray();
  /**
   * Test condition "AE" for isBhiRowAlreadyExist()
   *
   * @return Returns true if isBhiRowAlreadyExist() is "AE"
   */
  public boolean isBhiRowAlreadyExist() throws CFException {
    return (compareChars(getBhiRowReturnCd(), bhiRowAlreadyExist88Value) == 0);
  }

  /** set values "AE" */
  public void setBhiRowAlreadyExistTrue() {
    setBhiRowReturnCd(bhiRowAlreadyExist88Value);
  }

  char[] bhiRowNetIndConfl88Value = "NC".toCharArray();
  /**
   * Test condition "NC" for isBhiRowNetIndConfl()
   *
   * @return Returns true if isBhiRowNetIndConfl() is "NC"
   */
  public boolean isBhiRowNetIndConfl() throws CFException {
    return (compareChars(getBhiRowReturnCd(), bhiRowNetIndConfl88Value) == 0);
  }

  /** set values "NC" */
  public void setBhiRowNetIndConflTrue() {
    setBhiRowReturnCd(bhiRowNetIndConfl88Value);
  }
  /**
   * Returns the value of bhiRowDb2Code
   *
   * @return bhiRowDb2Code
   */
  public char[] getBhiRowDb2Code() throws CFException {
    if (isBhiRowDb2CodeModified()) {
      bhiRowDb2Code = refreshBhiRowDb2Code();
    }
    return bhiRowDb2Code;
  }

  /**
   * set variable bhiRowDb2Code Corresponding COBOL Variable is BHI-ROW-DB2-CODE
   *
   * @param value
   */
  public void setBhiRowDb2Code(char[] value) {
    bhiRowDb2Code = checkBhiRowDb2CodeConstraints(value);
    serializeBhiRowDb2Code(bhiRowDb2Code);
  }

  /**
   * Update BhiRowDb2Code with a char[] from an offset and length
   *
   * @param value
   */
  public void setBhiRowDb2Code(char[] source, int sourceIndex) {
    replace(source, sourceIndex, source.length, beginBhiRowDb2Code, bhiRowDb2Code.length);
  }

  public void setBhiRowDb2Code(char[] source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginBhiRowDb2Code, bhiRowDb2Code.length);
  }

  /**
   * Update BhiRowDb2Code with a char[] from an offset and length to an offset and length
   *
   * @param value
   */
  public void setBhiRowDb2Code(
      char[] source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginBhiRowDb2Code + targetIndex, targetLen);
  }

  /**
   * Update BhiRowDb2Code with another Field
   *
   * @param value
   */
  public void setBhiRowDb2Code(Field source) {
    replace(source, 0, source.length(), beginBhiRowDb2Code, BHI_ROW_DB_2_CODE_LEN);
  }

  /**
   * Update BhiRowDb2Code with another Field from an offset and length
   *
   * @param value
   */
  public void setBhiRowDb2Code(Field source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginBhiRowDb2Code, BHI_ROW_DB_2_CODE_LEN);
  }

  /**
   * Update BhiRowDb2Code with another Field from an offset and length to an offset and length
   *
   * @param value
   */
  public void setBhiRowDb2Code(
      Field source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginBhiRowDb2Code + targetIndex, targetLen);
  }
  /**
   * Returns the value of bhiRowAction
   *
   * @return bhiRowAction
   */
  public char[] getBhiRowAction() throws CFException {
    if (isBhiRowActionModified()) {
      bhiRowAction = refreshBhiRowAction();
    }
    return bhiRowAction;
  }

  /**
   * set variable bhiRowAction Corresponding COBOL Variable is BHI-ROW-ACTION
   *
   * @param value
   */
  public void setBhiRowAction(char[] value) {
    bhiRowAction = checkBhiRowActionConstraints(value);
    serializeBhiRowAction(bhiRowAction);
  }

  /**
   * Update BhiRowAction with a char[] from an offset and length
   *
   * @param value
   */
  public void setBhiRowAction(char[] source, int sourceIndex) {
    replace(source, sourceIndex, source.length, beginBhiRowAction, bhiRowAction.length);
  }

  public void setBhiRowAction(char[] source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginBhiRowAction, bhiRowAction.length);
  }

  /**
   * Update BhiRowAction with a char[] from an offset and length to an offset and length
   *
   * @param value
   */
  public void setBhiRowAction(
      char[] source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginBhiRowAction + targetIndex, targetLen);
  }

  /**
   * Update BhiRowAction with another Field
   *
   * @param value
   */
  public void setBhiRowAction(Field source) {
    replace(source, 0, source.length(), beginBhiRowAction, BHI_ROW_ACTION_LEN);
  }

  /**
   * Update BhiRowAction with another Field from an offset and length
   *
   * @param value
   */
  public void setBhiRowAction(Field source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginBhiRowAction, BHI_ROW_ACTION_LEN);
  }

  /**
   * Update BhiRowAction with another Field from an offset and length to an offset and length
   *
   * @param value
   */
  public void setBhiRowAction(
      Field source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginBhiRowAction + targetIndex, targetLen);
  }

  char[] bhiRowBrowse88Value = " ".toCharArray();
  /**
   * Test condition " " for isBhiRowBrowse()
   *
   * @return Returns true if isBhiRowBrowse() is " "
   */
  public boolean isBhiRowBrowse() throws CFException {
    return (compareChars(getBhiRowAction(), bhiRowBrowse88Value) == 0);
  }

  /** set values " " */
  public void setBhiRowBrowseTrue() {
    setBhiRowAction(bhiRowBrowse88Value);
  }

  char[] bhiRowAdd88Value = "A".toCharArray();
  /**
   * Test condition "A" for isBhiRowAdd()
   *
   * @return Returns true if isBhiRowAdd() is "A"
   */
  public boolean isBhiRowAdd() throws CFException {
    return (compareChars(getBhiRowAction(), bhiRowAdd88Value) == 0);
  }

  /** set values "A" */
  public void setBhiRowAddTrue() {
    setBhiRowAction(bhiRowAdd88Value);
  }

  char[] bhiRowInactivate88Value = "I".toCharArray();
  /**
   * Test condition "I" for isBhiRowInactivate()
   *
   * @return Returns true if isBhiRowInactivate() is "I"
   */
  public boolean isBhiRowInactivate() throws CFException {
    return (compareChars(getBhiRowAction(), bhiRowInactivate88Value) == 0);
  }

  /** set values "I" */
  public void setBhiRowInactivateTrue() {
    setBhiRowAction(bhiRowInactivate88Value);
  }
  /**
   * Returns the value of bhiRowReturnDet
   *
   * @return bhiRowReturnDet
   */
  public BhiRowReturnDet getBhiRowReturnDet() {
    return bhiRowReturnDet;
  }
  /**
   * Update BhiRowReturnDet with the passed value Corresponding COBOL Variable is BHI-ROW-RETURN-DET
   *
   * @param value
   */
  public void setBhiRowReturnDet(char[] value) {
    bhiRowReturnDet.setString(value);
  }

  /**
   * Update BhiRowReturnDet with a String from an offset and length
   *
   * @param value
   */
  public void setBhiRowReturnDet(char[] source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, bhiRowReturnDet.begin, bhiRowReturnDet.length());
  }

  /**
   * Update BhiRowReturnDet with a String from an offset and length to an offset and length
   *
   * @param value
   */
  public void setBhiRowReturnDet(
      char[] source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, bhiRowReturnDet.begin + targetIndex, targetLen);
  }

  /**
   * Update BhiRowReturnDet with another Field
   *
   * @param value
   */
  public void setBhiRowReturnDet(Field source) {
    replace(source, 0, source.length(), bhiRowReturnDet.begin, bhiRowReturnDet.length());
  }

  /**
   * Update BhiRowReturnDet with another Field from an offset and length
   *
   * @param value
   */
  public void setBhiRowReturnDet(Field source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, bhiRowReturnDet.begin, bhiRowReturnDet.length());
  }

  /**
   * Update BhiRowReturnDet with another Field from an offset and length to an offset and length
   *
   * @param value
   */
  public void setBhiRowReturnDet(
      Field source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, bhiRowReturnDet.begin + targetIndex, targetLen);
  }

  public static int getBhiReturnRowFieldLength() {
    return BHI_RETURN_ROW_LENGTH;
  }
}
