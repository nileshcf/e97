package com.cloudframe.app.dto.bbhsr002;

/**
 * The class BhiRequestArea is used to handle fields declared in it
 *
 * @author CloudFrame Inc. created on 2025-03-25 at 08:29. using version 5.0.0.231
 */
import com.cloudframe.app.data.Field;
import com.cloudframe.app.dto.serialize.bbhsr002.*;
import com.cloudframe.app.exception.CFException;
import java.util.*;

public class BhiRequestArea extends BhiRequestAreaSerialized {

  private char[] bhiCallingProgram = Field.fillLowValue(8);

  private char[] bhiReqType = Field.fillLowValue(1);

  private char[] bhiBrowseTypeSw = Field.fillLowValue(1);

  private short bhiReqNum;
  private BhiReqFilters bhiReqFilters = new BhiReqFilters();
  private BhiReqKey bhiReqKey = new BhiReqKey();
  private List<BhiReqRow> bhiReqRow = new ArrayList<>();

  /** Constructor for BhiRequestArea */
  public BhiRequestArea() {
    // TO-DO auto generated code
  }

  /**
   * Constructor for BhiRequestArea. sets the parent value to the parent
   *
   * @param parent
   * @param begin
   */
  public BhiRequestArea(Field parent, int begin) {
    setParent(parent, begin);
  }

  @Override
  public void setParent(Field parent, int begin) {
    super.setParent(parent, begin);
    bhiReqFilters.setParent(this, getStartOffset() + 12);
    bhiReqKey.setParent(this, getStartOffset() + 19);
    for (int arrayIndex = 0; arrayIndex < BHI_REQ_ROW_SIZE; arrayIndex++) {
      bhiReqRow.add(
          new BhiReqRow(this, beginBhiReqRow + arrayIndex * BhiReqRow.getBhiReqRowFieldLength()));
    }
  }

  /**
   * Returns the value of bhiCallingProgram
   *
   * @return bhiCallingProgram
   */
  public char[] getBhiCallingProgram() throws CFException {
    if (isBhiCallingProgramModified()) {
      bhiCallingProgram = refreshBhiCallingProgram();
    }
    return bhiCallingProgram;
  }

  /**
   * set variable bhiCallingProgram Corresponding COBOL Variable is BHI-CALLING-PROGRAM
   *
   * @param value
   */
  public void setBhiCallingProgram(char[] value) {
    bhiCallingProgram = checkBhiCallingProgramConstraints(value);
    serializeBhiCallingProgram(bhiCallingProgram);
  }

  /**
   * Update BhiCallingProgram with a char[] from an offset and length
   *
   * @param value
   */
  public void setBhiCallingProgram(char[] source, int sourceIndex) {
    replace(source, sourceIndex, source.length, beginBhiCallingProgram, bhiCallingProgram.length);
  }

  public void setBhiCallingProgram(char[] source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginBhiCallingProgram, bhiCallingProgram.length);
  }

  /**
   * Update BhiCallingProgram with a char[] from an offset and length to an offset and length
   *
   * @param value
   */
  public void setBhiCallingProgram(
      char[] source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginBhiCallingProgram + targetIndex, targetLen);
  }

  /**
   * Update BhiCallingProgram with another Field
   *
   * @param value
   */
  public void setBhiCallingProgram(Field source) {
    replace(source, 0, source.length(), beginBhiCallingProgram, BHI_CALLING_PROGRAM_LEN);
  }

  /**
   * Update BhiCallingProgram with another Field from an offset and length
   *
   * @param value
   */
  public void setBhiCallingProgram(Field source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginBhiCallingProgram, BHI_CALLING_PROGRAM_LEN);
  }

  /**
   * Update BhiCallingProgram with another Field from an offset and length to an offset and length
   *
   * @param value
   */
  public void setBhiCallingProgram(
      Field source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginBhiCallingProgram + targetIndex, targetLen);
  }
  /**
   * Returns the value of bhiReqType
   *
   * @return bhiReqType
   */
  public char[] getBhiReqType() throws CFException {
    if (isBhiReqTypeModified()) {
      bhiReqType = refreshBhiReqType();
    }
    return bhiReqType;
  }

  /**
   * set variable bhiReqType Corresponding COBOL Variable is BHI-REQ-TYPE
   *
   * @param value
   */
  public void setBhiReqType(char[] value) {
    bhiReqType = checkBhiReqTypeConstraints(value);
    serializeBhiReqType(bhiReqType);
  }

  /**
   * Update BhiReqType with a char[] from an offset and length
   *
   * @param value
   */
  public void setBhiReqType(char[] source, int sourceIndex) {
    replace(source, sourceIndex, source.length, beginBhiReqType, bhiReqType.length);
  }

  public void setBhiReqType(char[] source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginBhiReqType, bhiReqType.length);
  }

  /**
   * Update BhiReqType with a char[] from an offset and length to an offset and length
   *
   * @param value
   */
  public void setBhiReqType(
      char[] source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginBhiReqType + targetIndex, targetLen);
  }

  /**
   * Update BhiReqType with another Field
   *
   * @param value
   */
  public void setBhiReqType(Field source) {
    replace(source, 0, source.length(), beginBhiReqType, BHI_REQ_TYPE_LEN);
  }

  /**
   * Update BhiReqType with another Field from an offset and length
   *
   * @param value
   */
  public void setBhiReqType(Field source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginBhiReqType, BHI_REQ_TYPE_LEN);
  }

  /**
   * Update BhiReqType with another Field from an offset and length to an offset and length
   *
   * @param value
   */
  public void setBhiReqType(
      Field source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginBhiReqType + targetIndex, targetLen);
  }

  char[] bhiValidReq88Value1 = "U".toCharArray();
  char[] bhiValidReq88Value2 = "B".toCharArray();
  char[] bhiValidReq88Value3 = "V".toCharArray();

  /**
   * Test condition "U" "B" "V" for isBhiValidReq()
   *
   * @return Returns true if isBhiValidReq() is "U" "B" "V"
   */
  public boolean isBhiValidReq() throws CFException {
    return (compareChars(getBhiReqType(), bhiValidReq88Value1) == 0
        || compareChars(getBhiReqType(), bhiValidReq88Value2) == 0
        || compareChars(getBhiReqType(), bhiValidReq88Value3) == 0);
  }

  /** set values "U" "B" "V" */
  public void setBhiValidReqTrue() {
    setBhiReqType(bhiValidReq88Value1);
  }

  char[] bhiScreenUpdate88Value = "U".toCharArray();
  /**
   * Test condition "U" for isBhiScreenUpdate()
   *
   * @return Returns true if isBhiScreenUpdate() is "U"
   */
  public boolean isBhiScreenUpdate() throws CFException {
    return (compareChars(getBhiReqType(), bhiScreenUpdate88Value) == 0);
  }

  /** set values "U" */
  public void setBhiScreenUpdateTrue() {
    setBhiReqType(bhiScreenUpdate88Value);
  }

  char[] bhiScreenBrowse88Value = "B".toCharArray();
  /**
   * Test condition "B" for isBhiScreenBrowse()
   *
   * @return Returns true if isBhiScreenBrowse() is "B"
   */
  public boolean isBhiScreenBrowse() throws CFException {
    return (compareChars(getBhiReqType(), bhiScreenBrowse88Value) == 0);
  }

  /** set values "B" */
  public void setBhiScreenBrowseTrue() {
    setBhiReqType(bhiScreenBrowse88Value);
  }

  char[] bhiScreenValidate88Value = "V".toCharArray();
  /**
   * Test condition "V" for isBhiScreenValidate()
   *
   * @return Returns true if isBhiScreenValidate() is "V"
   */
  public boolean isBhiScreenValidate() throws CFException {
    return (compareChars(getBhiReqType(), bhiScreenValidate88Value) == 0);
  }

  /** set values "V" */
  public void setBhiScreenValidateTrue() {
    setBhiReqType(bhiScreenValidate88Value);
  }
  /**
   * Returns the value of bhiBrowseTypeSw
   *
   * @return bhiBrowseTypeSw
   */
  public char[] getBhiBrowseTypeSw() throws CFException {
    if (isBhiBrowseTypeSwModified()) {
      bhiBrowseTypeSw = refreshBhiBrowseTypeSw();
    }
    return bhiBrowseTypeSw;
  }

  /**
   * set variable bhiBrowseTypeSw Corresponding COBOL Variable is BHI-BROWSE-TYPE-SW
   *
   * @param value
   */
  public void setBhiBrowseTypeSw(char[] value) {
    bhiBrowseTypeSw = checkBhiBrowseTypeSwConstraints(value);
    serializeBhiBrowseTypeSw(bhiBrowseTypeSw);
  }

  /**
   * Update BhiBrowseTypeSw with a char[] from an offset and length
   *
   * @param value
   */
  public void setBhiBrowseTypeSw(char[] source, int sourceIndex) {
    replace(source, sourceIndex, source.length, beginBhiBrowseTypeSw, bhiBrowseTypeSw.length);
  }

  public void setBhiBrowseTypeSw(char[] source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginBhiBrowseTypeSw, bhiBrowseTypeSw.length);
  }

  /**
   * Update BhiBrowseTypeSw with a char[] from an offset and length to an offset and length
   *
   * @param value
   */
  public void setBhiBrowseTypeSw(
      char[] source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginBhiBrowseTypeSw + targetIndex, targetLen);
  }

  /**
   * Update BhiBrowseTypeSw with another Field
   *
   * @param value
   */
  public void setBhiBrowseTypeSw(Field source) {
    replace(source, 0, source.length(), beginBhiBrowseTypeSw, BHI_BROWSE_TYPE_SW_LEN);
  }

  /**
   * Update BhiBrowseTypeSw with another Field from an offset and length
   *
   * @param value
   */
  public void setBhiBrowseTypeSw(Field source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginBhiBrowseTypeSw, BHI_BROWSE_TYPE_SW_LEN);
  }

  /**
   * Update BhiBrowseTypeSw with another Field from an offset and length to an offset and length
   *
   * @param value
   */
  public void setBhiBrowseTypeSw(
      Field source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginBhiBrowseTypeSw + targetIndex, targetLen);
  }

  char[] validBrowseType88Value1 = "B".toCharArray();
  char[] validBrowseType88Value2 = "F".toCharArray();
  char[] validBrowseType88Value3 = "I".toCharArray();

  /**
   * Test condition "B" "F" "I" for isValidBrowseType()
   *
   * @return Returns true if isValidBrowseType() is "B" "F" "I"
   */
  public boolean isValidBrowseType() throws CFException {
    return (compareChars(getBhiBrowseTypeSw(), validBrowseType88Value1) == 0
        || compareChars(getBhiBrowseTypeSw(), validBrowseType88Value2) == 0
        || compareChars(getBhiBrowseTypeSw(), validBrowseType88Value3) == 0);
  }

  /** set values "B" "F" "I" */
  public void setValidBrowseTypeTrue() {
    setBhiBrowseTypeSw(validBrowseType88Value1);
  }

  char[] browseBack88Value = "B".toCharArray();
  /**
   * Test condition "B" for isBrowseBack()
   *
   * @return Returns true if isBrowseBack() is "B"
   */
  public boolean isBrowseBack() throws CFException {
    return (compareChars(getBhiBrowseTypeSw(), browseBack88Value) == 0);
  }

  /** set values "B" */
  public void setBrowseBackTrue() {
    setBhiBrowseTypeSw(browseBack88Value);
  }

  char[] browseForward88Value = "F".toCharArray();
  /**
   * Test condition "F" for isBrowseForward()
   *
   * @return Returns true if isBrowseForward() is "F"
   */
  public boolean isBrowseForward() throws CFException {
    return (compareChars(getBhiBrowseTypeSw(), browseForward88Value) == 0);
  }

  /** set values "F" */
  public void setBrowseForwardTrue() {
    setBhiBrowseTypeSw(browseForward88Value);
  }

  char[] initReqBhi88Value = "I".toCharArray();
  /**
   * Test condition "I" for isInitReqBhi()
   *
   * @return Returns true if isInitReqBhi() is "I"
   */
  public boolean isInitReqBhi() throws CFException {
    return (compareChars(getBhiBrowseTypeSw(), initReqBhi88Value) == 0);
  }

  /** set values "I" */
  public void setInitReqBhiTrue() {
    setBhiBrowseTypeSw(initReqBhi88Value);
  }
  /**
   * Returns the value of bhiReqNum
   *
   * @return bhiReqNum
   */
  public short getBhiReqNum() throws CFException {
    if (isBhiReqNumModified()) {
      bhiReqNum = refreshBhiReqNum();
    }
    return bhiReqNum;
  }

  /**
   * Update BhiReqNum with the passed value Corresponding COBOL Variable is BHI-REQ-NUM
   *
   * @param number
   */
  public void setBhiReqNum(short number) {
    // Truncate if the number is beyond +/- Max range
    bhiReqNum = checkBhiReqNumMaxLimit(number);
    serializeBhiReqNum(bhiReqNum);
  }

  public void setBhiReqNum(int number) {
    number = checkBhiReqNumMaxLimit((short) number); // Truncate if value is beyond +/- Max range
    setBhiReqNum((short) number);
  }

  public void setBhiReqNum(long number) {
    number = checkBhiReqNumMaxLimit((short) number); // Truncate if value is beyond +/- Max range
    setBhiReqNum((short) number);
  }

  /**
   * Returns the value of bhiReqFilters
   *
   * @return bhiReqFilters
   */
  public BhiReqFilters getBhiReqFilters() {
    return bhiReqFilters;
  }
  /**
   * Update BhiReqFilters with the passed value Corresponding COBOL Variable is BHI-REQ-FILTERS
   *
   * @param value
   */
  public void setBhiReqFilters(char[] value) {
    bhiReqFilters.setString(value);
  }

  /**
   * Update BhiReqFilters with a String from an offset and length
   *
   * @param value
   */
  public void setBhiReqFilters(char[] source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, bhiReqFilters.begin, bhiReqFilters.length());
  }

  /**
   * Update BhiReqFilters with a String from an offset and length to an offset and length
   *
   * @param value
   */
  public void setBhiReqFilters(
      char[] source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, bhiReqFilters.begin + targetIndex, targetLen);
  }

  /**
   * Update BhiReqFilters with another Field
   *
   * @param value
   */
  public void setBhiReqFilters(Field source) {
    replace(source, 0, source.length(), bhiReqFilters.begin, bhiReqFilters.length());
  }

  /**
   * Update BhiReqFilters with another Field from an offset and length
   *
   * @param value
   */
  public void setBhiReqFilters(Field source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, bhiReqFilters.begin, bhiReqFilters.length());
  }

  /**
   * Update BhiReqFilters with another Field from an offset and length to an offset and length
   *
   * @param value
   */
  public void setBhiReqFilters(
      Field source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, bhiReqFilters.begin + targetIndex, targetLen);
  }
  /**
   * Returns the value of bhiReqKey
   *
   * @return bhiReqKey
   */
  public BhiReqKey getBhiReqKey() {
    return bhiReqKey;
  }
  /**
   * Update BhiReqKey with the passed value Corresponding COBOL Variable is BHI-REQ-KEY
   *
   * @param value
   */
  public void setBhiReqKey(char[] value) {
    bhiReqKey.setString(value);
  }

  /**
   * Update BhiReqKey with a String from an offset and length
   *
   * @param value
   */
  public void setBhiReqKey(char[] source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, bhiReqKey.begin, bhiReqKey.length());
  }

  /**
   * Update BhiReqKey with a String from an offset and length to an offset and length
   *
   * @param value
   */
  public void setBhiReqKey(
      char[] source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, bhiReqKey.begin + targetIndex, targetLen);
  }

  /**
   * Update BhiReqKey with another Field
   *
   * @param value
   */
  public void setBhiReqKey(Field source) {
    replace(source, 0, source.length(), bhiReqKey.begin, bhiReqKey.length());
  }

  /**
   * Update BhiReqKey with another Field from an offset and length
   *
   * @param value
   */
  public void setBhiReqKey(Field source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, bhiReqKey.begin, bhiReqKey.length());
  }

  /**
   * Update BhiReqKey with another Field from an offset and length to an offset and length
   *
   * @param value
   */
  public void setBhiReqKey(
      Field source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, bhiReqKey.begin + targetIndex, targetLen);
  }
  /**
   * Returns the value of bhiReqRow Corresponding COBOL Variable is BHI-REQ-ROW
   *
   * @return bhiReqRow
   */
  public List<BhiReqRow> getBhiReqRow() {
    return bhiReqRow;
  }

  /**
   * Returns the element at the specified position in this list.
   *
   * @param index
   * @return bhiReqRow
   */
  public BhiReqRow getBhiReqRow(int index) {
    if (index < 0) {
      logger.trace("Array index was {} for getBhiReqRow(), resetting it to 0", index);
      index = 0;
    } else if (index >= BHI_REQ_ROW_SIZE) {
      index = BHI_REQ_ROW_SIZE - 1; // can't exceed max array size
      logger.trace(
          "bhiReqRow - Array index exceeded max Size {}, resetting it to max allowed",
          BHI_REQ_ROW_SIZE);
    }
    if (index >= bhiReqRow.size()) {
      for (int fillIndex = bhiReqRow.size() - 1; fillIndex < index; fillIndex++) {
        bhiReqRow.add(null);
      }
      bhiReqRow.set(
          index, new BhiReqRow(this, beginBhiReqRow + index * BhiReqRow.getBhiReqRowFieldLength()));
    }
    BhiReqRow value = bhiReqRow.get(index);
    if (value == null) {
      bhiReqRow.set(
          index, new BhiReqRow(this, beginBhiReqRow + index * BhiReqRow.getBhiReqRowFieldLength()));
      value = bhiReqRow.get(index);
    }
    return value;
  }

  /**
   * Update BhiReqRow at index with the passed value Corresponding COBOL Variable is BHI-REQ-ROW
   *
   * @param index
   * @param value
   */
  public void setBhiReqRow(int index, char[] value) {
    getBhiReqRow(index).setString(value);
  }

  public static int getBhiRequestAreaFieldLength() {
    return BHI_REQUEST_AREA_LENGTH;
  }
}
