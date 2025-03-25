package com.cloudframe.app.dto.bbhsr002;

/**
 * The class BhiReturnArea is used to handle fields declared in it
 *
 * @author CloudFrame Inc. created on 2025-03-25 at 08:29. using version 5.0.0.231
 */
import com.cloudframe.app.data.Field;
import com.cloudframe.app.dto.serialize.bbhsr002.*;
import com.cloudframe.app.exception.CFException;
import java.util.*;

public class BhiReturnArea extends BhiReturnAreaSerialized {

  private char[] bhiDb2Table = Field.fillLowValue(30);

  private char[] bhiDb2ParaNm = Field.fillLowValue(30);

  private char[] bhiDb2Action = Field.fillLowValue(8);

  private char[] bhiDb2RetCode = Field.fillLowValue(10);

  private char[] bhiRetReasonCode = Field.fillLowValue(2);

  private short bhiNumOccurs;
  private List<BhiReturnRow> bhiReturnRow = new ArrayList<>();

  /** Constructor for BhiReturnArea */
  public BhiReturnArea() {
    // TO-DO auto generated code
  }

  /**
   * Constructor for BhiReturnArea. sets the parent value to the parent
   *
   * @param parent
   * @param begin
   */
  public BhiReturnArea(Field parent, int begin) {
    setParent(parent, begin);
  }

  /**
   * Returns the value of bhiDb2Table
   *
   * @return bhiDb2Table
   */
  public char[] getBhiDb2Table() throws CFException {
    if (isBhiDb2TableModified()) {
      bhiDb2Table = refreshBhiDb2Table();
    }
    return bhiDb2Table;
  }

  /**
   * set variable bhiDb2Table Corresponding COBOL Variable is BHI-DB2-TABLE
   *
   * @param value
   */
  public void setBhiDb2Table(char[] value) {
    bhiDb2Table = checkBhiDb2TableConstraints(value);
    serializeBhiDb2Table(bhiDb2Table);
  }

  /**
   * Update BhiDb2Table with a char[] from an offset and length
   *
   * @param value
   */
  public void setBhiDb2Table(char[] source, int sourceIndex) {
    replace(source, sourceIndex, source.length, beginBhiDb2Table, bhiDb2Table.length);
  }

  public void setBhiDb2Table(char[] source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginBhiDb2Table, bhiDb2Table.length);
  }

  /**
   * Update BhiDb2Table with a char[] from an offset and length to an offset and length
   *
   * @param value
   */
  public void setBhiDb2Table(
      char[] source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginBhiDb2Table + targetIndex, targetLen);
  }

  /**
   * Update BhiDb2Table with another Field
   *
   * @param value
   */
  public void setBhiDb2Table(Field source) {
    replace(source, 0, source.length(), beginBhiDb2Table, BHI_DB_2_TABLE_LEN);
  }

  /**
   * Update BhiDb2Table with another Field from an offset and length
   *
   * @param value
   */
  public void setBhiDb2Table(Field source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginBhiDb2Table, BHI_DB_2_TABLE_LEN);
  }

  /**
   * Update BhiDb2Table with another Field from an offset and length to an offset and length
   *
   * @param value
   */
  public void setBhiDb2Table(
      Field source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginBhiDb2Table + targetIndex, targetLen);
  }
  /**
   * Returns the value of bhiDb2ParaNm
   *
   * @return bhiDb2ParaNm
   */
  public char[] getBhiDb2ParaNm() throws CFException {
    if (isBhiDb2ParaNmModified()) {
      bhiDb2ParaNm = refreshBhiDb2ParaNm();
    }
    return bhiDb2ParaNm;
  }

  /**
   * set variable bhiDb2ParaNm Corresponding COBOL Variable is BHI-DB2-PARA-NM
   *
   * @param value
   */
  public void setBhiDb2ParaNm(char[] value) {
    bhiDb2ParaNm = checkBhiDb2ParaNmConstraints(value);
    serializeBhiDb2ParaNm(bhiDb2ParaNm);
  }

  /**
   * Update BhiDb2ParaNm with a char[] from an offset and length
   *
   * @param value
   */
  public void setBhiDb2ParaNm(char[] source, int sourceIndex) {
    replace(source, sourceIndex, source.length, beginBhiDb2ParaNm, bhiDb2ParaNm.length);
  }

  public void setBhiDb2ParaNm(char[] source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginBhiDb2ParaNm, bhiDb2ParaNm.length);
  }

  /**
   * Update BhiDb2ParaNm with a char[] from an offset and length to an offset and length
   *
   * @param value
   */
  public void setBhiDb2ParaNm(
      char[] source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginBhiDb2ParaNm + targetIndex, targetLen);
  }

  /**
   * Update BhiDb2ParaNm with another Field
   *
   * @param value
   */
  public void setBhiDb2ParaNm(Field source) {
    replace(source, 0, source.length(), beginBhiDb2ParaNm, BHI_DB_2_PARA_NM_LEN);
  }

  /**
   * Update BhiDb2ParaNm with another Field from an offset and length
   *
   * @param value
   */
  public void setBhiDb2ParaNm(Field source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginBhiDb2ParaNm, BHI_DB_2_PARA_NM_LEN);
  }

  /**
   * Update BhiDb2ParaNm with another Field from an offset and length to an offset and length
   *
   * @param value
   */
  public void setBhiDb2ParaNm(
      Field source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginBhiDb2ParaNm + targetIndex, targetLen);
  }
  /**
   * Returns the value of bhiDb2Action
   *
   * @return bhiDb2Action
   */
  public char[] getBhiDb2Action() throws CFException {
    if (isBhiDb2ActionModified()) {
      bhiDb2Action = refreshBhiDb2Action();
    }
    return bhiDb2Action;
  }

  /**
   * set variable bhiDb2Action Corresponding COBOL Variable is BHI-DB2-ACTION
   *
   * @param value
   */
  public void setBhiDb2Action(char[] value) {
    bhiDb2Action = checkBhiDb2ActionConstraints(value);
    serializeBhiDb2Action(bhiDb2Action);
  }

  /**
   * Update BhiDb2Action with a char[] from an offset and length
   *
   * @param value
   */
  public void setBhiDb2Action(char[] source, int sourceIndex) {
    replace(source, sourceIndex, source.length, beginBhiDb2Action, bhiDb2Action.length);
  }

  public void setBhiDb2Action(char[] source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginBhiDb2Action, bhiDb2Action.length);
  }

  /**
   * Update BhiDb2Action with a char[] from an offset and length to an offset and length
   *
   * @param value
   */
  public void setBhiDb2Action(
      char[] source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginBhiDb2Action + targetIndex, targetLen);
  }

  /**
   * Update BhiDb2Action with another Field
   *
   * @param value
   */
  public void setBhiDb2Action(Field source) {
    replace(source, 0, source.length(), beginBhiDb2Action, BHI_DB_2_ACTION_LEN);
  }

  /**
   * Update BhiDb2Action with another Field from an offset and length
   *
   * @param value
   */
  public void setBhiDb2Action(Field source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginBhiDb2Action, BHI_DB_2_ACTION_LEN);
  }

  /**
   * Update BhiDb2Action with another Field from an offset and length to an offset and length
   *
   * @param value
   */
  public void setBhiDb2Action(
      Field source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginBhiDb2Action + targetIndex, targetLen);
  }
  /**
   * Returns the value of bhiDb2RetCode
   *
   * @return bhiDb2RetCode
   */
  public char[] getBhiDb2RetCode() throws CFException {
    if (isBhiDb2RetCodeModified()) {
      bhiDb2RetCode = refreshBhiDb2RetCode();
    }
    return bhiDb2RetCode;
  }

  /**
   * set variable bhiDb2RetCode Corresponding COBOL Variable is BHI-DB2-RET-CODE
   *
   * @param value
   */
  public void setBhiDb2RetCode(char[] value) {
    bhiDb2RetCode = checkBhiDb2RetCodeConstraints(value);
    serializeBhiDb2RetCode(bhiDb2RetCode);
  }

  /**
   * Update BhiDb2RetCode with a char[] from an offset and length
   *
   * @param value
   */
  public void setBhiDb2RetCode(char[] source, int sourceIndex) {
    replace(source, sourceIndex, source.length, beginBhiDb2RetCode, bhiDb2RetCode.length);
  }

  public void setBhiDb2RetCode(char[] source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginBhiDb2RetCode, bhiDb2RetCode.length);
  }

  /**
   * Update BhiDb2RetCode with a char[] from an offset and length to an offset and length
   *
   * @param value
   */
  public void setBhiDb2RetCode(
      char[] source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginBhiDb2RetCode + targetIndex, targetLen);
  }

  /**
   * Update BhiDb2RetCode with another Field
   *
   * @param value
   */
  public void setBhiDb2RetCode(Field source) {
    replace(source, 0, source.length(), beginBhiDb2RetCode, BHI_DB_2_RET_CODE_LEN);
  }

  /**
   * Update BhiDb2RetCode with another Field from an offset and length
   *
   * @param value
   */
  public void setBhiDb2RetCode(Field source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginBhiDb2RetCode, BHI_DB_2_RET_CODE_LEN);
  }

  /**
   * Update BhiDb2RetCode with another Field from an offset and length to an offset and length
   *
   * @param value
   */
  public void setBhiDb2RetCode(
      Field source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginBhiDb2RetCode + targetIndex, targetLen);
  }
  /**
   * Returns the value of bhiRetReasonCode
   *
   * @return bhiRetReasonCode
   */
  public char[] getBhiRetReasonCode() throws CFException {
    if (isBhiRetReasonCodeModified()) {
      bhiRetReasonCode = refreshBhiRetReasonCode();
    }
    return bhiRetReasonCode;
  }

  /**
   * set variable bhiRetReasonCode Corresponding COBOL Variable is BHI-RET-REASON-CODE
   *
   * @param value
   */
  public void setBhiRetReasonCode(char[] value) {
    bhiRetReasonCode = checkBhiRetReasonCodeConstraints(value);
    serializeBhiRetReasonCode(bhiRetReasonCode);
  }

  /**
   * Update BhiRetReasonCode with a char[] from an offset and length
   *
   * @param value
   */
  public void setBhiRetReasonCode(char[] source, int sourceIndex) {
    replace(source, sourceIndex, source.length, beginBhiRetReasonCode, bhiRetReasonCode.length);
  }

  public void setBhiRetReasonCode(char[] source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginBhiRetReasonCode, bhiRetReasonCode.length);
  }

  /**
   * Update BhiRetReasonCode with a char[] from an offset and length to an offset and length
   *
   * @param value
   */
  public void setBhiRetReasonCode(
      char[] source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginBhiRetReasonCode + targetIndex, targetLen);
  }

  /**
   * Update BhiRetReasonCode with another Field
   *
   * @param value
   */
  public void setBhiRetReasonCode(Field source) {
    replace(source, 0, source.length(), beginBhiRetReasonCode, BHI_RET_REASON_CODE_LEN);
  }

  /**
   * Update BhiRetReasonCode with another Field from an offset and length
   *
   * @param value
   */
  public void setBhiRetReasonCode(Field source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginBhiRetReasonCode, BHI_RET_REASON_CODE_LEN);
  }

  /**
   * Update BhiRetReasonCode with another Field from an offset and length to an offset and length
   *
   * @param value
   */
  public void setBhiRetReasonCode(
      Field source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginBhiRetReasonCode + targetIndex, targetLen);
  }

  char[] bhiNoErrors88Value = "  ".toCharArray();
  /**
   * Test condition " " for isBhiNoErrors()
   *
   * @return Returns true if isBhiNoErrors() is " "
   */
  public boolean isBhiNoErrors() throws CFException {
    return (compareChars(getBhiRetReasonCode(), bhiNoErrors88Value) == 0);
  }

  /** set values " " */
  public void setBhiNoErrorsTrue() {
    setBhiRetReasonCode(bhiNoErrors88Value);
  }

  char[] bhiNoErrsMoreRows88Value = "MR".toCharArray();
  /**
   * Test condition "MR" for isBhiNoErrsMoreRows()
   *
   * @return Returns true if isBhiNoErrsMoreRows() is "MR"
   */
  public boolean isBhiNoErrsMoreRows() throws CFException {
    return (compareChars(getBhiRetReasonCode(), bhiNoErrsMoreRows88Value) == 0);
  }

  /** set values "MR" */
  public void setBhiNoErrsMoreRowsTrue() {
    setBhiRetReasonCode(bhiNoErrsMoreRows88Value);
  }

  char[] bhiInvalidReqType88Value = "RT".toCharArray();
  /**
   * Test condition "RT" for isBhiInvalidReqType()
   *
   * @return Returns true if isBhiInvalidReqType() is "RT"
   */
  public boolean isBhiInvalidReqType() throws CFException {
    return (compareChars(getBhiRetReasonCode(), bhiInvalidReqType88Value) == 0);
  }

  /** set values "RT" */
  public void setBhiInvalidReqTypeTrue() {
    setBhiRetReasonCode(bhiInvalidReqType88Value);
  }

  char[] bhiInvFilterData88Value = "FT".toCharArray();
  /**
   * Test condition "FT" for isBhiInvFilterData()
   *
   * @return Returns true if isBhiInvFilterData() is "FT"
   */
  public boolean isBhiInvFilterData() throws CFException {
    return (compareChars(getBhiRetReasonCode(), bhiInvFilterData88Value) == 0);
  }

  /** set values "FT" */
  public void setBhiInvFilterDataTrue() {
    setBhiRetReasonCode(bhiInvFilterData88Value);
  }

  char[] bhiInvBrowseType88Value = "BT".toCharArray();
  /**
   * Test condition "BT" for isBhiInvBrowseType()
   *
   * @return Returns true if isBhiInvBrowseType() is "BT"
   */
  public boolean isBhiInvBrowseType() throws CFException {
    return (compareChars(getBhiRetReasonCode(), bhiInvBrowseType88Value) == 0);
  }

  /** set values "BT" */
  public void setBhiInvBrowseTypeTrue() {
    setBhiRetReasonCode(bhiInvBrowseType88Value);
  }

  char[] bhiMissingReqData88Value = "RQ".toCharArray();
  /**
   * Test condition "RQ" for isBhiMissingReqData()
   *
   * @return Returns true if isBhiMissingReqData() is "RQ"
   */
  public boolean isBhiMissingReqData() throws CFException {
    return (compareChars(getBhiRetReasonCode(), bhiMissingReqData88Value) == 0);
  }

  /** set values "RQ" */
  public void setBhiMissingReqDataTrue() {
    setBhiRetReasonCode(bhiMissingReqData88Value);
  }

  char[] bhiInvRowActionCd88Value = "RC".toCharArray();
  /**
   * Test condition "RC" for isBhiInvRowActionCd()
   *
   * @return Returns true if isBhiInvRowActionCd() is "RC"
   */
  public boolean isBhiInvRowActionCd() throws CFException {
    return (compareChars(getBhiRetReasonCode(), bhiInvRowActionCd88Value) == 0);
  }

  /** set values "RC" */
  public void setBhiInvRowActionCdTrue() {
    setBhiRetReasonCode(bhiInvRowActionCd88Value);
  }

  char[] bhiInvReqTblNofnd88Value = "TN".toCharArray();
  /**
   * Test condition "TN" for isBhiInvReqTblNofnd()
   *
   * @return Returns true if isBhiInvReqTblNofnd() is "TN"
   */
  public boolean isBhiInvReqTblNofnd() throws CFException {
    return (compareChars(getBhiRetReasonCode(), bhiInvReqTblNofnd88Value) == 0);
  }

  /** set values "TN" */
  public void setBhiInvReqTblNofndTrue() {
    setBhiRetReasonCode(bhiInvReqTblNofnd88Value);
  }

  char[] bhiInvReqSrvcNotfnd88Value = "SN".toCharArray();
  /**
   * Test condition "SN" for isBhiInvReqSrvcNotfnd()
   *
   * @return Returns true if isBhiInvReqSrvcNotfnd() is "SN"
   */
  public boolean isBhiInvReqSrvcNotfnd() throws CFException {
    return (compareChars(getBhiRetReasonCode(), bhiInvReqSrvcNotfnd88Value) == 0);
  }

  /** set values "SN" */
  public void setBhiInvReqSrvcNotfndTrue() {
    setBhiRetReasonCode(bhiInvReqSrvcNotfnd88Value);
  }

  char[] bhiInvReqHippaNotfnd88Value = "HN".toCharArray();
  /**
   * Test condition "HN" for isBhiInvReqHippaNotfnd()
   *
   * @return Returns true if isBhiInvReqHippaNotfnd() is "HN"
   */
  public boolean isBhiInvReqHippaNotfnd() throws CFException {
    return (compareChars(getBhiRetReasonCode(), bhiInvReqHippaNotfnd88Value) == 0);
  }

  /** set values "HN" */
  public void setBhiInvReqHippaNotfndTrue() {
    setBhiRetReasonCode(bhiInvReqHippaNotfnd88Value);
  }

  char[] bhiInvRowError88Value = "RE".toCharArray();
  /**
   * Test condition "RE" for isBhiInvRowError()
   *
   * @return Returns true if isBhiInvRowError() is "RE"
   */
  public boolean isBhiInvRowError() throws CFException {
    return (compareChars(getBhiRetReasonCode(), bhiInvRowError88Value) == 0);
  }

  /** set values "RE" */
  public void setBhiInvRowErrorTrue() {
    setBhiRetReasonCode(bhiInvRowError88Value);
  }

  char[] bhiGeneralDb2Error88Value = "DB".toCharArray();
  /**
   * Test condition "DB" for isBhiGeneralDb2Error()
   *
   * @return Returns true if isBhiGeneralDb2Error() is "DB"
   */
  public boolean isBhiGeneralDb2Error() throws CFException {
    return (compareChars(getBhiRetReasonCode(), bhiGeneralDb2Error88Value) == 0);
  }

  /** set values "DB" */
  public void setBhiGeneralDb2ErrorTrue() {
    setBhiRetReasonCode(bhiGeneralDb2Error88Value);
  }

  char[] bhiDb2OpenError88Value = "DO".toCharArray();
  /**
   * Test condition "DO" for isBhiDb2OpenError()
   *
   * @return Returns true if isBhiDb2OpenError() is "DO"
   */
  public boolean isBhiDb2OpenError() throws CFException {
    return (compareChars(getBhiRetReasonCode(), bhiDb2OpenError88Value) == 0);
  }

  /** set values "DO" */
  public void setBhiDb2OpenErrorTrue() {
    setBhiRetReasonCode(bhiDb2OpenError88Value);
  }

  char[] bhiDb2CloseError88Value = "DC".toCharArray();
  /**
   * Test condition "DC" for isBhiDb2CloseError()
   *
   * @return Returns true if isBhiDb2CloseError() is "DC"
   */
  public boolean isBhiDb2CloseError() throws CFException {
    return (compareChars(getBhiRetReasonCode(), bhiDb2CloseError88Value) == 0);
  }

  /** set values "DC" */
  public void setBhiDb2CloseErrorTrue() {
    setBhiRetReasonCode(bhiDb2CloseError88Value);
  }

  char[] bhiDb2FetchError88Value = "DF".toCharArray();
  /**
   * Test condition "DF" for isBhiDb2FetchError()
   *
   * @return Returns true if isBhiDb2FetchError() is "DF"
   */
  public boolean isBhiDb2FetchError() throws CFException {
    return (compareChars(getBhiRetReasonCode(), bhiDb2FetchError88Value) == 0);
  }

  /** set values "DF" */
  public void setBhiDb2FetchErrorTrue() {
    setBhiRetReasonCode(bhiDb2FetchError88Value);
  }

  char[] bhiDb2DeadlockErr88Value = "DL".toCharArray();
  /**
   * Test condition "DL" for isBhiDb2DeadlockErr()
   *
   * @return Returns true if isBhiDb2DeadlockErr() is "DL"
   */
  public boolean isBhiDb2DeadlockErr() throws CFException {
    return (compareChars(getBhiRetReasonCode(), bhiDb2DeadlockErr88Value) == 0);
  }

  /** set values "DL" */
  public void setBhiDb2DeadlockErrTrue() {
    setBhiRetReasonCode(bhiDb2DeadlockErr88Value);
  }
  /**
   * Returns the value of bhiNumOccurs
   *
   * @return bhiNumOccurs
   */
  public short getBhiNumOccurs() throws CFException {
    if (isBhiNumOccursModified()) {
      bhiNumOccurs = refreshBhiNumOccurs();
    }
    return bhiNumOccurs;
  }

  /**
   * Returns the String value of bhiNumOccurs
   *
   * @return bhiNumOccurs
   */
  public char[] getBhiNumOccursActualString() {
    String value = String.valueOf(bhiNumOccurs).trim();
    if (value.startsWith("+") || value.startsWith("-")) {
      value = value.substring(1);
    }
    return value.toCharArray();
  }

  /**
   * Update BhiNumOccurs with the passed value Corresponding COBOL Variable is BHI-NUM-OCCURS
   *
   * @param number
   */
  public void setBhiNumOccurs(short number) {
    // Truncate if the number is beyond +/- Max range
    bhiNumOccurs = checkBhiNumOccursMaxLimit(number);
    serializeBhiNumOccurs(bhiNumOccurs);
  }

  public void setBhiNumOccurs(int number) {
    number = checkBhiNumOccursMaxLimit((short) number); // Truncate if value is beyond +/- Max range
    setBhiNumOccurs((short) number);
  }

  public void setBhiNumOccurs(long number) {
    number = checkBhiNumOccursMaxLimit((short) number); // Truncate if value is beyond +/- Max range
    setBhiNumOccurs((short) number);
  }

  /**
   * Update BhiNumOccurs with the passed value
   *
   * @param value (String or char[])
   */
  public void setBhiNumOccurs(char[] value) throws CFException {
    bhiNumOccurs = serializeBhiNumOccurs(value);
  }
  /**
   * Update BhiNumOccurs with the passed value
   *
   * @param value (String or char[])
   */
  public void setBhiNumOccursString(char[] value) throws CFException {
    setBhiNumOccurs(value);
  }
  /**
   * Returns the value of bhiReturnRow Corresponding COBOL Variable is BHI-RETURN-ROW
   *
   * @return bhiReturnRow
   */
  public List<BhiReturnRow> getBhiReturnRow() {
    return bhiReturnRow;
  }

  /**
   * Returns the element at the specified position in this list.
   *
   * @param index
   * @return bhiReturnRow
   */
  public BhiReturnRow getBhiReturnRow(int index) {
    if (index < 0) {
      logger.trace("Array index was {} for getBhiReturnRow(), resetting it to 0", index);
      index = 0;
    } else if (index >= BHI_RETURN_ROW_SIZE) {
      index = BHI_RETURN_ROW_SIZE - 1; // can't exceed max array size
      logger.trace(
          "bhiReturnRow - Array index exceeded max Size {}, resetting it to max allowed",
          BHI_RETURN_ROW_SIZE);
    }
    if (index >= bhiReturnRow.size()) {
      for (int fillIndex = bhiReturnRow.size() - 1; fillIndex < index; fillIndex++) {
        bhiReturnRow.add(null);
      }
      bhiReturnRow.set(
          index,
          new BhiReturnRow(
              this, beginBhiReturnRow + index * BhiReturnRow.getBhiReturnRowFieldLength()));
    }
    BhiReturnRow value = bhiReturnRow.get(index);
    if (value == null) {
      bhiReturnRow.set(
          index,
          new BhiReturnRow(
              this, beginBhiReturnRow + index * BhiReturnRow.getBhiReturnRowFieldLength()));
      value = bhiReturnRow.get(index);
    }
    return value;
  }

  /**
   * Update BhiReturnRow at index with the passed value Corresponding COBOL Variable is
   * BHI-RETURN-ROW
   *
   * @param index
   * @param value
   */
  public void setBhiReturnRow(int index, char[] value) {
    getBhiReturnRow(index).setString(value);
  }

  public static int getBhiReturnAreaFieldLength() {
    return BHI_RETURN_AREA_LENGTH;
  }
}
