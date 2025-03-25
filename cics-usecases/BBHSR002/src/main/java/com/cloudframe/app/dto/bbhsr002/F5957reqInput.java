package com.cloudframe.app.dto.bbhsr002;

/**
 * The class F5957reqInput is used to handle fields declared in it
 *
 * @author CloudFrame Inc. created on 2025-03-25 at 08:29. using version 5.0.0.231
 */
import com.cloudframe.app.data.Field;
import com.cloudframe.app.dto.serialize.bbhsr002.*;
import com.cloudframe.app.exception.CFException;

public class F5957reqInput extends F5957reqInputSerialized {

  private char[] reqAction = Field.fillLowValue(1);
  private ReqViewName reqViewName = new ReqViewName();

  private char[] reqCoverageType = Field.fillLowValue(1);

  private char[] reqCallingProgram = Field.fillLowValue(8);

  private int reqReturnCode;

  private int reqExplanationCode;
  private ReqAddressArea reqAddressArea = new ReqAddressArea();
  private ReqAddressAreaTbl reqAddressAreaTbl = new ReqAddressAreaTbl();

  private char[] reqRequestParms = Field.fillLowValue(150);
  private ReqRequestParmsRedef reqRequestParmsRedef = new ReqRequestParmsRedef();

  /** Constructor for F5957reqInput */
  public F5957reqInput() {
    super();
    /*  set the parent of each child as this which are a group variable */
    reqViewName.setParent(this, getStartOffset() + 1);
    reqAddressArea.setParent(this, getStartOffset() + 23);
    reqAddressAreaTbl.setParent(this, getStartOffset() + 23);
    reqRequestParmsRedef.setParent(this, getStartOffset() + 83);
    /*  end of offset */
  }

  /**
   * Returns the value of reqAction
   *
   * @return reqAction
   */
  public char[] getReqAction() throws CFException {
    if (isReqActionModified()) {
      reqAction = refreshReqAction();
    }
    return reqAction;
  }

  /**
   * set variable reqAction Corresponding COBOL Variable is REQ-ACTION
   *
   * @param value
   */
  public void setReqAction(char[] value) {
    reqAction = checkReqActionConstraints(value);
    serializeReqAction(reqAction);
  }

  /**
   * Update ReqAction with a char[] from an offset and length
   *
   * @param value
   */
  public void setReqAction(char[] source, int sourceIndex) {
    replace(source, sourceIndex, source.length, beginReqAction, reqAction.length);
  }

  public void setReqAction(char[] source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginReqAction, reqAction.length);
  }

  /**
   * Update ReqAction with a char[] from an offset and length to an offset and length
   *
   * @param value
   */
  public void setReqAction(
      char[] source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginReqAction + targetIndex, targetLen);
  }

  /**
   * Update ReqAction with another Field
   *
   * @param value
   */
  public void setReqAction(Field source) {
    replace(source, 0, source.length(), beginReqAction, REQ_ACTION_LEN);
  }

  /**
   * Update ReqAction with another Field from an offset and length
   *
   * @param value
   */
  public void setReqAction(Field source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginReqAction, REQ_ACTION_LEN);
  }

  /**
   * Update ReqAction with another Field from an offset and length to an offset and length
   *
   * @param value
   */
  public void setReqAction(
      Field source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginReqAction + targetIndex, targetLen);
  }

  char[] reqRead88Value = "R".toCharArray();
  /**
   * Test condition "R" for isReqRead()
   *
   * @return Returns true if isReqRead() is "R"
   */
  public boolean isReqRead() throws CFException {
    return (compareChars(getReqAction(), reqRead88Value) == 0);
  }

  /** set values "R" */
  public void setReqReadTrue() {
    setReqAction(reqRead88Value);
  }

  char[] reqReadNext88Value = "N".toCharArray();
  /**
   * Test condition "N" for isReqReadNext()
   *
   * @return Returns true if isReqReadNext() is "N"
   */
  public boolean isReqReadNext() throws CFException {
    return (compareChars(getReqAction(), reqReadNext88Value) == 0);
  }

  /** set values "N" */
  public void setReqReadNextTrue() {
    setReqAction(reqReadNext88Value);
  }

  char[] reqReadPrevious88Value = "P".toCharArray();
  /**
   * Test condition "P" for isReqReadPrevious()
   *
   * @return Returns true if isReqReadPrevious() is "P"
   */
  public boolean isReqReadPrevious() throws CFException {
    return (compareChars(getReqAction(), reqReadPrevious88Value) == 0);
  }

  /** set values "P" */
  public void setReqReadPreviousTrue() {
    setReqAction(reqReadPrevious88Value);
  }

  char[] reqReadContinue88Value = "C".toCharArray();
  /**
   * Test condition "C" for isReqReadContinue()
   *
   * @return Returns true if isReqReadContinue() is "C"
   */
  public boolean isReqReadContinue() throws CFException {
    return (compareChars(getReqAction(), reqReadContinue88Value) == 0);
  }

  /** set values "C" */
  public void setReqReadContinueTrue() {
    setReqAction(reqReadContinue88Value);
  }

  char[] reqReadForUpdate88Value = "U".toCharArray();
  /**
   * Test condition "U" for isReqReadForUpdate()
   *
   * @return Returns true if isReqReadForUpdate() is "U"
   */
  public boolean isReqReadForUpdate() throws CFException {
    return (compareChars(getReqAction(), reqReadForUpdate88Value) == 0);
  }

  /** set values "U" */
  public void setReqReadForUpdateTrue() {
    setReqAction(reqReadForUpdate88Value);
  }

  char[] reqUpdate88Value = "U".toCharArray();
  /**
   * Test condition "U" for isReqUpdate()
   *
   * @return Returns true if isReqUpdate() is "U"
   */
  public boolean isReqUpdate() throws CFException {
    return (compareChars(getReqAction(), reqUpdate88Value) == 0);
  }

  /** set values "U" */
  public void setReqUpdateTrue() {
    setReqAction(reqUpdate88Value);
  }

  char[] reqDelete88Value = "D".toCharArray();
  /**
   * Test condition "D" for isReqDelete()
   *
   * @return Returns true if isReqDelete() is "D"
   */
  public boolean isReqDelete() throws CFException {
    return (compareChars(getReqAction(), reqDelete88Value) == 0);
  }

  /** set values "D" */
  public void setReqDeleteTrue() {
    setReqAction(reqDelete88Value);
  }

  char[] reqRewrite88Value = "W".toCharArray();
  /**
   * Test condition "W" for isReqRewrite()
   *
   * @return Returns true if isReqRewrite() is "W"
   */
  public boolean isReqRewrite() throws CFException {
    return (compareChars(getReqAction(), reqRewrite88Value) == 0);
  }

  /** set values "W" */
  public void setReqRewriteTrue() {
    setReqAction(reqRewrite88Value);
  }

  char[] reqStartBrowse88Value = "S".toCharArray();
  /**
   * Test condition "S" for isReqStartBrowse()
   *
   * @return Returns true if isReqStartBrowse() is "S"
   */
  public boolean isReqStartBrowse() throws CFException {
    return (compareChars(getReqAction(), reqStartBrowse88Value) == 0);
  }

  /** set values "S" */
  public void setReqStartBrowseTrue() {
    setReqAction(reqStartBrowse88Value);
  }

  char[] reqEndBrowse88Value = "E".toCharArray();
  /**
   * Test condition "E" for isReqEndBrowse()
   *
   * @return Returns true if isReqEndBrowse() is "E"
   */
  public boolean isReqEndBrowse() throws CFException {
    return (compareChars(getReqAction(), reqEndBrowse88Value) == 0);
  }

  /** set values "E" */
  public void setReqEndBrowseTrue() {
    setReqAction(reqEndBrowse88Value);
  }

  char[] reqBrowseWithMapping88Value = "M".toCharArray();
  /**
   * Test condition "M" for isReqBrowseWithMapping()
   *
   * @return Returns true if isReqBrowseWithMapping() is "M"
   */
  public boolean isReqBrowseWithMapping() throws CFException {
    return (compareChars(getReqAction(), reqBrowseWithMapping88Value) == 0);
  }

  /** set values "M" */
  public void setReqBrowseWithMappingTrue() {
    setReqAction(reqBrowseWithMapping88Value);
  }

  char[] reqAdd88Value = "A".toCharArray();
  /**
   * Test condition "A" for isReqAdd()
   *
   * @return Returns true if isReqAdd() is "A"
   */
  public boolean isReqAdd() throws CFException {
    return (compareChars(getReqAction(), reqAdd88Value) == 0);
  }

  /** set values "A" */
  public void setReqAddTrue() {
    setReqAction(reqAdd88Value);
  }

  char[] reqTerminate88Value = "T".toCharArray();
  /**
   * Test condition "T" for isReqTerminate()
   *
   * @return Returns true if isReqTerminate() is "T"
   */
  public boolean isReqTerminate() throws CFException {
    return (compareChars(getReqAction(), reqTerminate88Value) == 0);
  }

  /** set values "T" */
  public void setReqTerminateTrue() {
    setReqAction(reqTerminate88Value);
  }

  char[] reqCopy88Value = "Y".toCharArray();
  /**
   * Test condition "Y" for isReqCopy()
   *
   * @return Returns true if isReqCopy() is "Y"
   */
  public boolean isReqCopy() throws CFException {
    return (compareChars(getReqAction(), reqCopy88Value) == 0);
  }

  /** set values "Y" */
  public void setReqCopyTrue() {
    setReqAction(reqCopy88Value);
  }

  char[] reqMove88Value = "X".toCharArray();
  /**
   * Test condition "X" for isReqMove()
   *
   * @return Returns true if isReqMove() is "X"
   */
  public boolean isReqMove() throws CFException {
    return (compareChars(getReqAction(), reqMove88Value) == 0);
  }

  /** set values "X" */
  public void setReqMoveTrue() {
    setReqAction(reqMove88Value);
  }
  /**
   * Returns the value of reqViewName
   *
   * @return reqViewName
   */
  public ReqViewName getReqViewName() {
    return reqViewName;
  }
  /**
   * Update ReqViewName with the passed value Corresponding COBOL Variable is REQ-VIEW-NAME
   *
   * @param value
   */
  public void setReqViewName(char[] value) {
    reqViewName.setString(value);
  }

  /**
   * Update ReqViewName with a String from an offset and length
   *
   * @param value
   */
  public void setReqViewName(char[] source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, reqViewName.begin, reqViewName.length());
  }

  /**
   * Update ReqViewName with a String from an offset and length to an offset and length
   *
   * @param value
   */
  public void setReqViewName(
      char[] source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, reqViewName.begin + targetIndex, targetLen);
  }

  /**
   * Update ReqViewName with another Field
   *
   * @param value
   */
  public void setReqViewName(Field source) {
    replace(source, 0, source.length(), reqViewName.begin, reqViewName.length());
  }

  /**
   * Update ReqViewName with another Field from an offset and length
   *
   * @param value
   */
  public void setReqViewName(Field source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, reqViewName.begin, reqViewName.length());
  }

  /**
   * Update ReqViewName with another Field from an offset and length to an offset and length
   *
   * @param value
   */
  public void setReqViewName(
      Field source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, reqViewName.begin + targetIndex, targetLen);
  }
  /**
   * Returns the value of reqCoverageType
   *
   * @return reqCoverageType
   */
  public char[] getReqCoverageType() throws CFException {
    if (isReqCoverageTypeModified()) {
      reqCoverageType = refreshReqCoverageType();
    }
    return reqCoverageType;
  }

  /**
   * set variable reqCoverageType Corresponding COBOL Variable is REQ-COVERAGE-TYPE
   *
   * @param value
   */
  public void setReqCoverageType(char[] value) {
    reqCoverageType = checkReqCoverageTypeConstraints(value);
    serializeReqCoverageType(reqCoverageType);
  }

  /**
   * Update ReqCoverageType with a char[] from an offset and length
   *
   * @param value
   */
  public void setReqCoverageType(char[] source, int sourceIndex) {
    replace(source, sourceIndex, source.length, beginReqCoverageType, reqCoverageType.length);
  }

  public void setReqCoverageType(char[] source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginReqCoverageType, reqCoverageType.length);
  }

  /**
   * Update ReqCoverageType with a char[] from an offset and length to an offset and length
   *
   * @param value
   */
  public void setReqCoverageType(
      char[] source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginReqCoverageType + targetIndex, targetLen);
  }

  /**
   * Update ReqCoverageType with another Field
   *
   * @param value
   */
  public void setReqCoverageType(Field source) {
    replace(source, 0, source.length(), beginReqCoverageType, REQ_COVERAGE_TYPE_LEN);
  }

  /**
   * Update ReqCoverageType with another Field from an offset and length
   *
   * @param value
   */
  public void setReqCoverageType(Field source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginReqCoverageType, REQ_COVERAGE_TYPE_LEN);
  }

  /**
   * Update ReqCoverageType with another Field from an offset and length to an offset and length
   *
   * @param value
   */
  public void setReqCoverageType(
      Field source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginReqCoverageType + targetIndex, targetLen);
  }

  char[] reqMedical88Value = "M".toCharArray();
  /**
   * Test condition "M" for isReqMedical()
   *
   * @return Returns true if isReqMedical() is "M"
   */
  public boolean isReqMedical() throws CFException {
    return (compareChars(getReqCoverageType(), reqMedical88Value) == 0);
  }

  /** set values "M" */
  public void setReqMedicalTrue() {
    setReqCoverageType(reqMedical88Value);
  }

  char[] reqDental88Value = "D".toCharArray();
  /**
   * Test condition "D" for isReqDental()
   *
   * @return Returns true if isReqDental() is "D"
   */
  public boolean isReqDental() throws CFException {
    return (compareChars(getReqCoverageType(), reqDental88Value) == 0);
  }

  /** set values "D" */
  public void setReqDentalTrue() {
    setReqCoverageType(reqDental88Value);
  }
  /**
   * Returns the value of reqCallingProgram
   *
   * @return reqCallingProgram
   */
  public char[] getReqCallingProgram() throws CFException {
    if (isReqCallingProgramModified()) {
      reqCallingProgram = refreshReqCallingProgram();
    }
    return reqCallingProgram;
  }

  /**
   * set variable reqCallingProgram Corresponding COBOL Variable is REQ-CALLING-PROGRAM
   *
   * @param value
   */
  public void setReqCallingProgram(char[] value) {
    reqCallingProgram = checkReqCallingProgramConstraints(value);
    serializeReqCallingProgram(reqCallingProgram);
  }

  /**
   * Update ReqCallingProgram with a char[] from an offset and length
   *
   * @param value
   */
  public void setReqCallingProgram(char[] source, int sourceIndex) {
    replace(source, sourceIndex, source.length, beginReqCallingProgram, reqCallingProgram.length);
  }

  public void setReqCallingProgram(char[] source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginReqCallingProgram, reqCallingProgram.length);
  }

  /**
   * Update ReqCallingProgram with a char[] from an offset and length to an offset and length
   *
   * @param value
   */
  public void setReqCallingProgram(
      char[] source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginReqCallingProgram + targetIndex, targetLen);
  }

  /**
   * Update ReqCallingProgram with another Field
   *
   * @param value
   */
  public void setReqCallingProgram(Field source) {
    replace(source, 0, source.length(), beginReqCallingProgram, REQ_CALLING_PROGRAM_LEN);
  }

  /**
   * Update ReqCallingProgram with another Field from an offset and length
   *
   * @param value
   */
  public void setReqCallingProgram(Field source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginReqCallingProgram, REQ_CALLING_PROGRAM_LEN);
  }

  /**
   * Update ReqCallingProgram with another Field from an offset and length to an offset and length
   *
   * @param value
   */
  public void setReqCallingProgram(
      Field source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginReqCallingProgram + targetIndex, targetLen);
  }
  /**
   * Returns the value of reqReturnCode
   *
   * @return reqReturnCode
   */
  public int getReqReturnCode() throws CFException {
    if (isReqReturnCodeModified()) {
      reqReturnCode = refreshReqReturnCode();
    }
    return reqReturnCode;
  }

  /**
   * Update ReqReturnCode with the passed value Corresponding COBOL Variable is REQ-RETURN-CODE
   *
   * @param number
   */
  public void setReqReturnCode(int number) {
    // Truncate if the number is beyond +/- Max range
    reqReturnCode = checkReqReturnCodeMaxLimit(number);
    serializeReqReturnCode(reqReturnCode);
  }

  public void setReqReturnCode(long number) {
    number = checkReqReturnCodeMaxLimit(number); // Truncate if value is beyond +/- Max range
    setReqReturnCode((int) number);
  }

  /**
   * Update ReqReturnCode with the passed value
   *
   * @param value (String or char[])
   */
  public void setReqReturnCode(char[] value) throws CFException {
    reqReturnCode = serializeReqReturnCode(value);
  }
  /**
   * Update ReqReturnCode with the passed value
   *
   * @param value (String or char[])
   */
  public void setReqReturnCodeString(char[] value) throws CFException {
    setReqReturnCode(value);
  }

  /**
   * Test condition 0 for isReqOk()
   *
   * @return Returns true if isReqOk() is 0
   */
  public boolean isReqOk() throws CFException {
    return (getReqReturnCode() == 0);
  }

  /** set values 0 */
  public void setReqOkTrue() {
    setReqReturnCode(0);
  }

  /**
   * Test condition 1 for isReqNotFound()
   *
   * @return Returns true if isReqNotFound() is 1
   */
  public boolean isReqNotFound() throws CFException {
    return (getReqReturnCode() == 1);
  }

  /** set values 1 */
  public void setReqNotFoundTrue() {
    setReqReturnCode(1);
  }

  /**
   * Test condition 2 for isReqNotUnique()
   *
   * @return Returns true if isReqNotUnique() is 2
   */
  public boolean isReqNotUnique() throws CFException {
    return (getReqReturnCode() == 2);
  }

  /** set values 2 */
  public void setReqNotUniqueTrue() {
    setReqReturnCode(2);
  }

  /**
   * Test condition 3 for isReqFileClosed()
   *
   * @return Returns true if isReqFileClosed() is 3
   */
  public boolean isReqFileClosed() throws CFException {
    return (getReqReturnCode() == 3);
  }

  /** set values 3 */
  public void setReqFileClosedTrue() {
    setReqReturnCode(3);
  }

  /**
   * Test condition 4 for isReqPartialData()
   *
   * @return Returns true if isReqPartialData() is 4
   */
  public boolean isReqPartialData() throws CFException {
    return (getReqReturnCode() == 4);
  }

  /** set values 4 */
  public void setReqPartialDataTrue() {
    setReqReturnCode(4);
  }

  /**
   * Test condition 5 for isReqEndOfFile()
   *
   * @return Returns true if isReqEndOfFile() is 5
   */
  public boolean isReqEndOfFile() throws CFException {
    return (getReqReturnCode() == 5);
  }

  /** set values 5 */
  public void setReqEndOfFileTrue() {
    setReqReturnCode(5);
  }

  /**
   * Test condition 6 for isReqFailedSeeExpCode()
   *
   * @return Returns true if isReqFailedSeeExpCode() is 6
   */
  public boolean isReqFailedSeeExpCode() throws CFException {
    return (getReqReturnCode() == 6);
  }

  /** set values 6 */
  public void setReqFailedSeeExpCodeTrue() {
    setReqReturnCode(6);
  }

  /**
   * Test condition 7 for isReqDatabaseError()
   *
   * @return Returns true if isReqDatabaseError() is 7
   */
  public boolean isReqDatabaseError() throws CFException {
    return (getReqReturnCode() == 7);
  }

  /** set values 7 */
  public void setReqDatabaseErrorTrue() {
    setReqReturnCode(7);
  }

  /**
   * Test condition 8 for isReqNotAuthorizedForView()
   *
   * @return Returns true if isReqNotAuthorizedForView() is 8
   */
  public boolean isReqNotAuthorizedForView() throws CFException {
    return (getReqReturnCode() == 8);
  }

  /** set values 8 */
  public void setReqNotAuthorizedForViewTrue() {
    setReqReturnCode(8);
  }

  /**
   * Test condition 9 for isReqInvalidCommareaLength()
   *
   * @return Returns true if isReqInvalidCommareaLength() is 9
   */
  public boolean isReqInvalidCommareaLength() throws CFException {
    return (getReqReturnCode() == 9);
  }

  /** set values 9 */
  public void setReqInvalidCommareaLengthTrue() {
    setReqReturnCode(9);
  }

  /**
   * Test condition 21 for isReqLg1FileError()
   *
   * @return Returns true if isReqLg1FileError() is 21
   */
  public boolean isReqLg1FileError() throws CFException {
    return (getReqReturnCode() == 21);
  }

  /** set values 21 */
  public void setReqLg1FileErrorTrue() {
    setReqReturnCode(21);
  }

  /**
   * Test condition 22 for isReqLg2FileError()
   *
   * @return Returns true if isReqLg2FileError() is 22
   */
  public boolean isReqLg2FileError() throws CFException {
    return (getReqReturnCode() == 22);
  }

  /** set values 22 */
  public void setReqLg2FileErrorTrue() {
    setReqReturnCode(22);
  }

  /**
   * Test condition 23 for isReqLg3FileError()
   *
   * @return Returns true if isReqLg3FileError() is 23
   */
  public boolean isReqLg3FileError() throws CFException {
    return (getReqReturnCode() == 23);
  }

  /** set values 23 */
  public void setReqLg3FileErrorTrue() {
    setReqReturnCode(23);
  }

  /**
   * Test condition 24 for isReqLg4FileError()
   *
   * @return Returns true if isReqLg4FileError() is 24
   */
  public boolean isReqLg4FileError() throws CFException {
    return (getReqReturnCode() == 24);
  }

  /** set values 24 */
  public void setReqLg4FileErrorTrue() {
    setReqReturnCode(24);
  }

  /**
   * Test condition 25 for isReqLocFileError()
   *
   * @return Returns true if isReqLocFileError() is 25
   */
  public boolean isReqLocFileError() throws CFException {
    return (getReqReturnCode() == 25);
  }

  /** set values 25 */
  public void setReqLocFileErrorTrue() {
    setReqReturnCode(25);
  }

  /**
   * Test condition 26 for isReqLobFileError()
   *
   * @return Returns true if isReqLobFileError() is 26
   */
  public boolean isReqLobFileError() throws CFException {
    return (getReqReturnCode() == 26);
  }

  /** set values 26 */
  public void setReqLobFileErrorTrue() {
    setReqReturnCode(26);
  }

  /**
   * Test condition 31 for isReqCtlFileError()
   *
   * @return Returns true if isReqCtlFileError() is 31
   */
  public boolean isReqCtlFileError() throws CFException {
    return (getReqReturnCode() == 31);
  }

  /** set values 31 */
  public void setReqCtlFileErrorTrue() {
    setReqReturnCode(31);
  }

  /**
   * Test condition 32 for isReqXrfFileError()
   *
   * @return Returns true if isReqXrfFileError() is 32
   */
  public boolean isReqXrfFileError() throws CFException {
    return (getReqReturnCode() == 32);
  }

  /** set values 32 */
  public void setReqXrfFileErrorTrue() {
    setReqReturnCode(32);
  }

  /**
   * Test condition 33 for isReqSecFileError()
   *
   * @return Returns true if isReqSecFileError() is 33
   */
  public boolean isReqSecFileError() throws CFException {
    return (getReqReturnCode() == 33);
  }

  /** set values 33 */
  public void setReqSecFileErrorTrue() {
    setReqReturnCode(33);
  }

  /**
   * Test condition 40 41 42 43 50 51 52 53 60 61 62 63 70 71 72 73 for isReqMqImsServices()
   *
   * @return Returns true if isReqMqImsServices() is 40 41 42 43 50 51 52 53 60 61 62 63 70 71 72 73
   */
  public boolean isReqMqImsServices() throws CFException {
    return (getReqReturnCode() == 40
        || getReqReturnCode() == 41
        || getReqReturnCode() == 42
        || getReqReturnCode() == 43
        || getReqReturnCode() == 50
        || getReqReturnCode() == 51
        || getReqReturnCode() == 52
        || getReqReturnCode() == 53
        || getReqReturnCode() == 60
        || getReqReturnCode() == 61
        || getReqReturnCode() == 62
        || getReqReturnCode() == 63
        || getReqReturnCode() == 70
        || getReqReturnCode() == 71
        || getReqReturnCode() == 72
        || getReqReturnCode() == 73);
  }

  /** set values 40 41 42 43 50 51 52 53 60 61 62 63 70 71 72 73 */
  public void setReqMqImsServicesTrue() {
    setReqReturnCode(40);
  }

  /**
   * Test condition 40 41 42 43 for isReqMqGet()
   *
   * @return Returns true if isReqMqGet() is 40 41 42 43
   */
  public boolean isReqMqGet() throws CFException {
    return (getReqReturnCode() == 40
        || getReqReturnCode() == 41
        || getReqReturnCode() == 42
        || getReqReturnCode() == 43);
  }

  /** set values 40 41 42 43 */
  public void setReqMqGetTrue() {
    setReqReturnCode(40);
  }

  /**
   * Test condition 50 51 52 53 for isReqMqInq()
   *
   * @return Returns true if isReqMqInq() is 50 51 52 53
   */
  public boolean isReqMqInq() throws CFException {
    return (getReqReturnCode() == 50
        || getReqReturnCode() == 51
        || getReqReturnCode() == 52
        || getReqReturnCode() == 53);
  }

  /** set values 50 51 52 53 */
  public void setReqMqInqTrue() {
    setReqReturnCode(50);
  }

  /**
   * Test condition 60 61 62 63 for isReqMqOpen()
   *
   * @return Returns true if isReqMqOpen() is 60 61 62 63
   */
  public boolean isReqMqOpen() throws CFException {
    return (getReqReturnCode() == 60
        || getReqReturnCode() == 61
        || getReqReturnCode() == 62
        || getReqReturnCode() == 63);
  }

  /** set values 60 61 62 63 */
  public void setReqMqOpenTrue() {
    setReqReturnCode(60);
  }

  /**
   * Test condition 70 71 72 73 for isReqMqPut()
   *
   * @return Returns true if isReqMqPut() is 70 71 72 73
   */
  public boolean isReqMqPut() throws CFException {
    return (getReqReturnCode() == 70
        || getReqReturnCode() == 71
        || getReqReturnCode() == 72
        || getReqReturnCode() == 73);
  }

  /** set values 70 71 72 73 */
  public void setReqMqPutTrue() {
    setReqReturnCode(70);
  }

  /**
   * Test condition 81 for isReqVlenError()
   *
   * @return Returns true if isReqVlenError() is 81
   */
  public boolean isReqVlenError() throws CFException {
    return (getReqReturnCode() == 81);
  }

  /** set values 81 */
  public void setReqVlenErrorTrue() {
    setReqReturnCode(81);
  }

  /**
   * Test condition 82 for isReqTotAddrlen31kErr()
   *
   * @return Returns true if isReqTotAddrlen31kErr() is 82
   */
  public boolean isReqTotAddrlen31kErr() throws CFException {
    return (getReqReturnCode() == 82);
  }

  /** set values 82 */
  public void setReqTotAddrlen31kErrTrue() {
    setReqReturnCode(82);
  }

  /**
   * Test condition 84 for isReqCommareaAddrLenError()
   *
   * @return Returns true if isReqCommareaAddrLenError() is 84
   */
  public boolean isReqCommareaAddrLenError() throws CFException {
    return (getReqReturnCode() == 84);
  }

  /** set values 84 */
  public void setReqCommareaAddrLenErrorTrue() {
    setReqReturnCode(84);
  }

  /**
   * Test condition 88 for isReqFailSlotting()
   *
   * @return Returns true if isReqFailSlotting() is 88
   */
  public boolean isReqFailSlotting() throws CFException {
    return (getReqReturnCode() == 88);
  }

  /** set values 88 */
  public void setReqFailSlottingTrue() {
    setReqReturnCode(88);
  }

  /**
   * Test condition 91 for isReqQxiFileErr()
   *
   * @return Returns true if isReqQxiFileErr() is 91
   */
  public boolean isReqQxiFileErr() throws CFException {
    return (getReqReturnCode() == 91);
  }

  /** set values 91 */
  public void setReqQxiFileErrTrue() {
    setReqReturnCode(91);
  }

  /**
   * Test condition 92 for isReqQnmFileError()
   *
   * @return Returns true if isReqQnmFileError() is 92
   */
  public boolean isReqQnmFileError() throws CFException {
    return (getReqReturnCode() == 92);
  }

  /** set values 92 */
  public void setReqQnmFileErrorTrue() {
    setReqReturnCode(92);
  }

  /**
   * Test condition 93 for isReqWqnFileError()
   *
   * @return Returns true if isReqWqnFileError() is 93
   */
  public boolean isReqWqnFileError() throws CFException {
    return (getReqReturnCode() == 93);
  }

  /** set values 93 */
  public void setReqWqnFileErrorTrue() {
    setReqReturnCode(93);
  }

  /**
   * Test condition 94 for isReqQlvFileError()
   *
   * @return Returns true if isReqQlvFileError() is 94
   */
  public boolean isReqQlvFileError() throws CFException {
    return (getReqReturnCode() == 94);
  }

  /** set values 94 */
  public void setReqQlvFileErrorTrue() {
    setReqReturnCode(94);
  }

  /**
   * Test condition 95 for isReqXcaFileError()
   *
   * @return Returns true if isReqXcaFileError() is 95
   */
  public boolean isReqXcaFileError() throws CFException {
    return (getReqReturnCode() == 95);
  }

  /** set values 95 */
  public void setReqXcaFileErrorTrue() {
    setReqReturnCode(95);
  }

  /**
   * Test condition 99 for isReqFail()
   *
   * @return Returns true if isReqFail() is 99
   */
  public boolean isReqFail() throws CFException {
    return (getReqReturnCode() == 99);
  }

  /** set values 99 */
  public void setReqFailTrue() {
    setReqReturnCode(99);
  }

  /**
   * Test condition 1 THRU 99 for isReqNotOk()
   *
   * @return Returns true if isReqNotOk() is 1 THRU 99
   */
  public boolean isReqNotOk() throws CFException {
    return ((getReqReturnCode() >= 1) && (getReqReturnCode() <= 99));
  }

  /** set values 1 THRU 99 */
  public void setReqNotOkTrue() {
    setReqReturnCode(1);
  }
  /**
   * Returns the value of reqExplanationCode
   *
   * @return reqExplanationCode
   */
  public int getReqExplanationCode() throws CFException {
    if (isReqExplanationCodeModified()) {
      reqExplanationCode = refreshReqExplanationCode();
    }
    return reqExplanationCode;
  }

  /**
   * Update ReqExplanationCode with the passed value Corresponding COBOL Variable is
   * REQ-EXPLANATION-CODE
   *
   * @param number
   */
  public void setReqExplanationCode(int number) {
    // Truncate if the number is beyond +/- Max range
    reqExplanationCode = checkReqExplanationCodeMaxLimit(number);
    serializeReqExplanationCode(reqExplanationCode);
  }

  public void setReqExplanationCode(long number) {
    number = checkReqExplanationCodeMaxLimit(number); // Truncate if value is beyond +/- Max range
    setReqExplanationCode((int) number);
  }

  /**
   * Update ReqExplanationCode with the passed value
   *
   * @param value (String or char[])
   */
  public void setReqExplanationCode(char[] value) throws CFException {
    reqExplanationCode = serializeReqExplanationCode(value);
  }
  /**
   * Update ReqExplanationCode with the passed value
   *
   * @param value (String or char[])
   */
  public void setReqExplanationCodeString(char[] value) throws CFException {
    setReqExplanationCode(value);
  }

  /**
   * Test condition 0 for isReqExplOk()
   *
   * @return Returns true if isReqExplOk() is 0
   */
  public boolean isReqExplOk() throws CFException {
    return (getReqExplanationCode() == 0);
  }

  /** set values 0 */
  public void setReqExplOkTrue() {
    setReqExplanationCode(0);
  }

  /**
   * Test condition 1 for isReqInvalidActCode()
   *
   * @return Returns true if isReqInvalidActCode() is 1
   */
  public boolean isReqInvalidActCode() throws CFException {
    return (getReqExplanationCode() == 1);
  }

  /** set values 1 */
  public void setReqInvalidActCodeTrue() {
    setReqExplanationCode(1);
  }

  /**
   * Test condition 2 for isReqInvalidView()
   *
   * @return Returns true if isReqInvalidView() is 2
   */
  public boolean isReqInvalidView() throws CFException {
    return (getReqExplanationCode() == 2);
  }

  /** set values 2 */
  public void setReqInvalidViewTrue() {
    setReqExplanationCode(2);
  }

  /**
   * Test condition 3 for isReqInvalidParms()
   *
   * @return Returns true if isReqInvalidParms() is 3
   */
  public boolean isReqInvalidParms() throws CFException {
    return (getReqExplanationCode() == 3);
  }

  /** set values 3 */
  public void setReqInvalidParmsTrue() {
    setReqExplanationCode(3);
  }

  /**
   * Test condition 4 for isReqNoCovTypeSpecified()
   *
   * @return Returns true if isReqNoCovTypeSpecified() is 4
   */
  public boolean isReqNoCovTypeSpecified() throws CFException {
    return (getReqExplanationCode() == 4);
  }

  /** set values 4 */
  public void setReqNoCovTypeSpecifiedTrue() {
    setReqExplanationCode(4);
  }

  /**
   * Test condition 5 for isReqIOError()
   *
   * @return Returns true if isReqIOError() is 5
   */
  public boolean isReqIOError() throws CFException {
    return (getReqExplanationCode() == 5);
  }

  /** set values 5 */
  public void setReqIOErrorTrue() {
    setReqExplanationCode(5);
  }

  /**
   * Test condition 6 for isReqGetmainError()
   *
   * @return Returns true if isReqGetmainError() is 6
   */
  public boolean isReqGetmainError() throws CFException {
    return (getReqExplanationCode() == 6);
  }

  /** set values 6 */
  public void setReqGetmainErrorTrue() {
    setReqExplanationCode(6);
  }

  /**
   * Test condition 7 for isReqIncoreTblError()
   *
   * @return Returns true if isReqIncoreTblError() is 7
   */
  public boolean isReqIncoreTblError() throws CFException {
    return (getReqExplanationCode() == 7);
  }

  /** set values 7 */
  public void setReqIncoreTblErrorTrue() {
    setReqExplanationCode(7);
  }

  /**
   * Test condition 8 for isReqSegmentationError()
   *
   * @return Returns true if isReqSegmentationError() is 8
   */
  public boolean isReqSegmentationError() throws CFException {
    return (getReqExplanationCode() == 8);
  }

  /** set values 8 */
  public void setReqSegmentationErrorTrue() {
    setReqExplanationCode(8);
  }

  /**
   * Test condition 9 for isReqSiteAorTblError()
   *
   * @return Returns true if isReqSiteAorTblError() is 9
   */
  public boolean isReqSiteAorTblError() throws CFException {
    return (getReqExplanationCode() == 9);
  }

  /** set values 9 */
  public void setReqSiteAorTblErrorTrue() {
    setReqExplanationCode(9);
  }

  /**
   * Test condition 10 for isReqEeNotFound()
   *
   * @return Returns true if isReqEeNotFound() is 10
   */
  public boolean isReqEeNotFound() throws CFException {
    return (getReqExplanationCode() == 10);
  }

  /** set values 10 */
  public void setReqEeNotFoundTrue() {
    setReqExplanationCode(10);
  }

  /**
   * Test condition 11 for isReqPatNotFound()
   *
   * @return Returns true if isReqPatNotFound() is 11
   */
  public boolean isReqPatNotFound() throws CFException {
    return (getReqExplanationCode() == 11);
  }

  /** set values 11 */
  public void setReqPatNotFoundTrue() {
    setReqExplanationCode(11);
  }

  /**
   * Test condition 12 for isReqExactPatNotFound()
   *
   * @return Returns true if isReqExactPatNotFound() is 12
   */
  public boolean isReqExactPatNotFound() throws CFException {
    return (getReqExplanationCode() == 12);
  }

  /** set values 12 */
  public void setReqExactPatNotFoundTrue() {
    setReqExplanationCode(12);
  }

  /**
   * Test condition 13 for isReqDuplicateEe()
   *
   * @return Returns true if isReqDuplicateEe() is 13
   */
  public boolean isReqDuplicateEe() throws CFException {
    return (getReqExplanationCode() == 13);
  }

  /** set values 13 */
  public void setReqDuplicateEeTrue() {
    setReqExplanationCode(13);
  }

  /**
   * Test condition 14 for isReqGroupCustRequired()
   *
   * @return Returns true if isReqGroupCustRequired() is 14
   */
  public boolean isReqGroupCustRequired() throws CFException {
    return (getReqExplanationCode() == 14);
  }

  /** set values 14 */
  public void setReqGroupCustRequiredTrue() {
    setReqExplanationCode(14);
  }

  /**
   * Test condition 15 for isReqDuplicateSsn()
   *
   * @return Returns true if isReqDuplicateSsn() is 15
   */
  public boolean isReqDuplicateSsn() throws CFException {
    return (getReqExplanationCode() == 15);
  }

  /** set values 15 */
  public void setReqDuplicateSsnTrue() {
    setReqExplanationCode(15);
  }

  /**
   * Test condition 16 for isReqLocatorRecordError()
   *
   * @return Returns true if isReqLocatorRecordError() is 16
   */
  public boolean isReqLocatorRecordError() throws CFException {
    return (getReqExplanationCode() == 16);
  }

  /** set values 16 */
  public void setReqLocatorRecordErrorTrue() {
    setReqExplanationCode(16);
  }

  /**
   * Test condition 17 for isReqKeyNotFound()
   *
   * @return Returns true if isReqKeyNotFound() is 17
   */
  public boolean isReqKeyNotFound() throws CFException {
    return (getReqExplanationCode() == 17);
  }

  /** set values 17 */
  public void setReqKeyNotFoundTrue() {
    setReqExplanationCode(17);
  }

  /**
   * Test condition 18 for isReqKeyHasDuplicates()
   *
   * @return Returns true if isReqKeyHasDuplicates() is 18
   */
  public boolean isReqKeyHasDuplicates() throws CFException {
    return (getReqExplanationCode() == 18);
  }

  /** set values 18 */
  public void setReqKeyHasDuplicatesTrue() {
    setReqExplanationCode(18);
  }

  /**
   * Test condition 19 for isReqRequestCtrErr()
   *
   * @return Returns true if isReqRequestCtrErr() is 19
   */
  public boolean isReqRequestCtrErr() throws CFException {
    return (getReqExplanationCode() == 19);
  }

  /** set values 19 */
  public void setReqRequestCtrErrTrue() {
    setReqExplanationCode(19);
  }

  /**
   * Test condition 20 for isReqInvalidGroup()
   *
   * @return Returns true if isReqInvalidGroup() is 20
   */
  public boolean isReqInvalidGroup() throws CFException {
    return (getReqExplanationCode() == 20);
  }

  /** set values 20 */
  public void setReqInvalidGroupTrue() {
    setReqExplanationCode(20);
  }

  /**
   * Test condition 21 for isReqInvalidCustomer()
   *
   * @return Returns true if isReqInvalidCustomer() is 21
   */
  public boolean isReqInvalidCustomer() throws CFException {
    return (getReqExplanationCode() == 21);
  }

  /** set values 21 */
  public void setReqInvalidCustomerTrue() {
    setReqExplanationCode(21);
  }

  /**
   * Test condition 22 for isReqLgTblOverflow()
   *
   * @return Returns true if isReqLgTblOverflow() is 22
   */
  public boolean isReqLgTblOverflow() throws CFException {
    return (getReqExplanationCode() == 22);
  }

  /** set values 22 */
  public void setReqLgTblOverflowTrue() {
    setReqExplanationCode(22);
  }

  /**
   * Test condition 23 for isReqSmRepositionErr()
   *
   * @return Returns true if isReqSmRepositionErr() is 23
   */
  public boolean isReqSmRepositionErr() throws CFException {
    return (getReqExplanationCode() == 23);
  }

  /** set values 23 */
  public void setReqSmRepositionErrTrue() {
    setReqExplanationCode(23);
  }

  /**
   * Test condition 24 for isReqTooManyEntries()
   *
   * @return Returns true if isReqTooManyEntries() is 24
   */
  public boolean isReqTooManyEntries() throws CFException {
    return (getReqExplanationCode() == 24);
  }

  /** set values 24 */
  public void setReqTooManyEntriesTrue() {
    setReqExplanationCode(24);
  }

  /**
   * Test condition 25 for isReqGoodReadButNoData()
   *
   * @return Returns true if isReqGoodReadButNoData() is 25
   */
  public boolean isReqGoodReadButNoData() throws CFException {
    return (getReqExplanationCode() == 25);
  }

  /** set values 25 */
  public void setReqGoodReadButNoDataTrue() {
    setReqExplanationCode(25);
  }

  /**
   * Test condition 26 for isReqDuplicateDataFound()
   *
   * @return Returns true if isReqDuplicateDataFound() is 26
   */
  public boolean isReqDuplicateDataFound() throws CFException {
    return (getReqExplanationCode() == 26);
  }

  /** set values 26 */
  public void setReqDuplicateDataFoundTrue() {
    setReqExplanationCode(26);
  }

  /**
   * Test condition 27 for isReqDupSsnReturnedAddr2()
   *
   * @return Returns true if isReqDupSsnReturnedAddr2() is 27
   */
  public boolean isReqDupSsnReturnedAddr2() throws CFException {
    return (getReqExplanationCode() == 27);
  }

  /** set values 27 */
  public void setReqDupSsnReturnedAddr2True() {
    setReqExplanationCode(27);
  }

  /**
   * Test condition 28 for isReqSsnNotFound()
   *
   * @return Returns true if isReqSsnNotFound() is 28
   */
  public boolean isReqSsnNotFound() throws CFException {
    return (getReqExplanationCode() == 28);
  }

  /** set values 28 */
  public void setReqSsnNotFoundTrue() {
    setReqExplanationCode(28);
  }

  /**
   * Test condition 29 for isReqMaxDupSsnExceeded()
   *
   * @return Returns true if isReqMaxDupSsnExceeded() is 29
   */
  public boolean isReqMaxDupSsnExceeded() throws CFException {
    return (getReqExplanationCode() == 29);
  }

  /** set values 29 */
  public void setReqMaxDupSsnExceededTrue() {
    setReqExplanationCode(29);
  }

  /**
   * Test condition 30 for isReqPlanNotFound()
   *
   * @return Returns true if isReqPlanNotFound() is 30
   */
  public boolean isReqPlanNotFound() throws CFException {
    return (getReqExplanationCode() == 30);
  }

  /** set values 30 */
  public void setReqPlanNotFoundTrue() {
    setReqExplanationCode(30);
  }

  /**
   * Test condition 31 for isReqPlanCancelled()
   *
   * @return Returns true if isReqPlanCancelled() is 31
   */
  public boolean isReqPlanCancelled() throws CFException {
    return (getReqExplanationCode() == 31);
  }

  /** set values 31 */
  public void setReqPlanCancelledTrue() {
    setReqExplanationCode(31);
  }

  /**
   * Test condition 32 for isReqPlanInFuture()
   *
   * @return Returns true if isReqPlanInFuture() is 32
   */
  public boolean isReqPlanInFuture() throws CFException {
    return (getReqExplanationCode() == 32);
  }

  /** set values 32 */
  public void setReqPlanInFutureTrue() {
    setReqExplanationCode(32);
  }

  /**
   * Test condition 33 for isReqNoFlipPlan()
   *
   * @return Returns true if isReqNoFlipPlan() is 33
   */
  public boolean isReqNoFlipPlan() throws CFException {
    return (getReqExplanationCode() == 33);
  }

  /** set values 33 */
  public void setReqNoFlipPlanTrue() {
    setReqExplanationCode(33);
  }

  /**
   * Test condition 34 for isReqPltNotFound()
   *
   * @return Returns true if isReqPltNotFound() is 34
   */
  public boolean isReqPltNotFound() throws CFException {
    return (getReqExplanationCode() == 34);
  }

  /** set values 34 */
  public void setReqPltNotFoundTrue() {
    setReqExplanationCode(34);
  }

  /**
   * Test condition 35 for isReqPcpRecNotFound()
   *
   * @return Returns true if isReqPcpRecNotFound() is 35
   */
  public boolean isReqPcpRecNotFound() throws CFException {
    return (getReqExplanationCode() == 35);
  }

  /** set values 35 */
  public void setReqPcpRecNotFoundTrue() {
    setReqExplanationCode(35);
  }

  /**
   * Test condition 36 for isReqPatientNotFound()
   *
   * @return Returns true if isReqPatientNotFound() is 36
   */
  public boolean isReqPatientNotFound() throws CFException {
    return (getReqExplanationCode() == 36);
  }

  /** set values 36 */
  public void setReqPatientNotFoundTrue() {
    setReqExplanationCode(36);
  }

  /**
   * Test condition 37 for isReqProfContractError()
   *
   * @return Returns true if isReqProfContractError() is 37
   */
  public boolean isReqProfContractError() throws CFException {
    return (getReqExplanationCode() == 37);
  }

  /** set values 37 */
  public void setReqProfContractErrorTrue() {
    setReqExplanationCode(37);
  }

  /**
   * Test condition 38 for isReqInstContractError()
   *
   * @return Returns true if isReqInstContractError() is 38
   */
  public boolean isReqInstContractError() throws CFException {
    return (getReqExplanationCode() == 38);
  }

  /** set values 38 */
  public void setReqInstContractErrorTrue() {
    setReqExplanationCode(38);
  }

  /**
   * Test condition 39 for isReqCpinError()
   *
   * @return Returns true if isReqCpinError() is 39
   */
  public boolean isReqCpinError() throws CFException {
    return (getReqExplanationCode() == 39);
  }

  /** set values 39 */
  public void setReqCpinErrorTrue() {
    setReqExplanationCode(39);
  }

  /**
   * Test condition 40 for isReqNoClaimsFound()
   *
   * @return Returns true if isReqNoClaimsFound() is 40
   */
  public boolean isReqNoClaimsFound() throws CFException {
    return (getReqExplanationCode() == 40);
  }

  /** set values 40 */
  public void setReqNoClaimsFoundTrue() {
    setReqExplanationCode(40);
  }

  /**
   * Test condition 41 for isReqClaimNotFound()
   *
   * @return Returns true if isReqClaimNotFound() is 41
   */
  public boolean isReqClaimNotFound() throws CFException {
    return (getReqExplanationCode() == 41);
  }

  /** set values 41 */
  public void setReqClaimNotFoundTrue() {
    setReqExplanationCode(41);
  }

  /**
   * Test condition 42 for isReqPgmIdError()
   *
   * @return Returns true if isReqPgmIdError() is 42
   */
  public boolean isReqPgmIdError() throws CFException {
    return (getReqExplanationCode() == 42);
  }

  /** set values 42 */
  public void setReqPgmIdErrorTrue() {
    setReqExplanationCode(42);
  }

  /**
   * Test condition 43 for isReqParmAddressesError()
   *
   * @return Returns true if isReqParmAddressesError() is 43
   */
  public boolean isReqParmAddressesError() throws CFException {
    return (getReqExplanationCode() == 43);
  }

  /** set values 43 */
  public void setReqParmAddressesErrorTrue() {
    setReqExplanationCode(43);
  }

  /**
   * Test condition 44 for isReqDplError()
   *
   * @return Returns true if isReqDplError() is 44
   */
  public boolean isReqDplError() throws CFException {
    return (getReqExplanationCode() == 44);
  }

  /** set values 44 */
  public void setReqDplErrorTrue() {
    setReqExplanationCode(44);
  }

  /**
   * Test condition 45 for isReqDplSysiderr()
   *
   * @return Returns true if isReqDplSysiderr() is 45
   */
  public boolean isReqDplSysiderr() throws CFException {
    return (getReqExplanationCode() == 45);
  }

  /** set values 45 */
  public void setReqDplSysiderrTrue() {
    setReqExplanationCode(45);
  }

  /**
   * Test condition 46 for isReqDplSysbusy()
   *
   * @return Returns true if isReqDplSysbusy() is 46
   */
  public boolean isReqDplSysbusy() throws CFException {
    return (getReqExplanationCode() == 46);
  }

  /** set values 46 */
  public void setReqDplSysbusyTrue() {
    setReqExplanationCode(46);
  }

  /**
   * Test condition 47 for isReqDplLengerr()
   *
   * @return Returns true if isReqDplLengerr() is 47
   */
  public boolean isReqDplLengerr() throws CFException {
    return (getReqExplanationCode() == 47);
  }

  /** set values 47 */
  public void setReqDplLengerrTrue() {
    setReqExplanationCode(47);
  }

  /**
   * Test condition 48 for isReqMaxDataError()
   *
   * @return Returns true if isReqMaxDataError() is 48
   */
  public boolean isReqMaxDataError() throws CFException {
    return (getReqExplanationCode() == 48);
  }

  /** set values 48 */
  public void setReqMaxDataErrorTrue() {
    setReqExplanationCode(48);
  }

  /**
   * Test condition 49 for isReqSysiderr()
   *
   * @return Returns true if isReqSysiderr() is 49
   */
  public boolean isReqSysiderr() throws CFException {
    return (getReqExplanationCode() == 49);
  }

  /** set values 49 */
  public void setReqSysiderrTrue() {
    setReqExplanationCode(49);
  }

  /**
   * Test condition 50 for isReqDplTermerr()
   *
   * @return Returns true if isReqDplTermerr() is 50
   */
  public boolean isReqDplTermerr() throws CFException {
    return (getReqExplanationCode() == 50);
  }

  /** set values 50 */
  public void setReqDplTermerrTrue() {
    setReqExplanationCode(50);
  }

  /**
   * Test condition 51 for isReqDplBackendError()
   *
   * @return Returns true if isReqDplBackendError() is 51
   */
  public boolean isReqDplBackendError() throws CFException {
    return (getReqExplanationCode() == 51);
  }

  /** set values 51 */
  public void setReqDplBackendErrorTrue() {
    setReqExplanationCode(51);
  }

  /**
   * Test condition 52 for isReqDsiderr()
   *
   * @return Returns true if isReqDsiderr() is 52
   */
  public boolean isReqDsiderr() throws CFException {
    return (getReqExplanationCode() == 52);
  }

  /** set values 52 */
  public void setReqDsiderrTrue() {
    setReqExplanationCode(52);
  }

  /**
   * Test condition 53 for isReqBatchProcessActivating()
   *
   * @return Returns true if isReqBatchProcessActivating() is 53
   */
  public boolean isReqBatchProcessActivating() throws CFException {
    return (getReqExplanationCode() == 53);
  }

  /** set values 53 */
  public void setReqBatchProcessActivatingTrue() {
    setReqExplanationCode(53);
  }

  /**
   * Test condition 54 for isReqBatchProcessActive()
   *
   * @return Returns true if isReqBatchProcessActive() is 54
   */
  public boolean isReqBatchProcessActive() throws CFException {
    return (getReqExplanationCode() == 54);
  }

  /** set values 54 */
  public void setReqBatchProcessActiveTrue() {
    setReqExplanationCode(54);
  }

  /**
   * Test condition 55 for isReqWasMissCallAppl()
   *
   * @return Returns true if isReqWasMissCallAppl() is 55
   */
  public boolean isReqWasMissCallAppl() throws CFException {
    return (getReqExplanationCode() == 55);
  }

  /** set values 55 */
  public void setReqWasMissCallApplTrue() {
    setReqExplanationCode(55);
  }

  /**
   * Test condition 63 for isReqSegLoadError()
   *
   * @return Returns true if isReqSegLoadError() is 63
   */
  public boolean isReqSegLoadError() throws CFException {
    return (getReqExplanationCode() == 63);
  }

  /** set values 63 */
  public void setReqSegLoadErrorTrue() {
    setReqExplanationCode(63);
  }

  /**
   * Test condition 64 for isReqDupSsnNoneOpen()
   *
   * @return Returns true if isReqDupSsnNoneOpen() is 64
   */
  public boolean isReqDupSsnNoneOpen() throws CFException {
    return (getReqExplanationCode() == 64);
  }

  /** set values 64 */
  public void setReqDupSsnNoneOpenTrue() {
    setReqExplanationCode(64);
  }

  /**
   * Test condition 65 for isReqWasFileXcaErr()
   *
   * @return Returns true if isReqWasFileXcaErr() is 65
   */
  public boolean isReqWasFileXcaErr() throws CFException {
    return (getReqExplanationCode() == 65);
  }

  /** set values 65 */
  public void setReqWasFileXcaErrTrue() {
    setReqExplanationCode(65);
  }

  /**
   * Test condition 70 for isReqRetryRegnUnavailable()
   *
   * @return Returns true if isReqRetryRegnUnavailable() is 70
   */
  public boolean isReqRetryRegnUnavailable() throws CFException {
    return (getReqExplanationCode() == 70);
  }

  /** set values 70 */
  public void setReqRetryRegnUnavailableTrue() {
    setReqExplanationCode(70);
  }

  /**
   * Test condition 71 for isReqXrfCtlRetryRegnError()
   *
   * @return Returns true if isReqXrfCtlRetryRegnError() is 71
   */
  public boolean isReqXrfCtlRetryRegnError() throws CFException {
    return (getReqExplanationCode() == 71);
  }

  /** set values 71 */
  public void setReqXrfCtlRetryRegnErrorTrue() {
    setReqExplanationCode(71);
  }

  /**
   * Test condition 75 for isReqWasMismtchTrnId()
   *
   * @return Returns true if isReqWasMismtchTrnId() is 75
   */
  public boolean isReqWasMismtchTrnId() throws CFException {
    return (getReqExplanationCode() == 75);
  }

  /** set values 75 */
  public void setReqWasMismtchTrnIdTrue() {
    setReqExplanationCode(75);
  }

  /**
   * Test condition 83 for isReqWrongRegion()
   *
   * @return Returns true if isReqWrongRegion() is 83
   */
  public boolean isReqWrongRegion() throws CFException {
    return (getReqExplanationCode() == 83);
  }

  /** set values 83 */
  public void setReqWrongRegionTrue() {
    setReqExplanationCode(83);
  }

  /**
   * Test condition 84 for isReqCommareaAddrlen24kErr()
   *
   * @return Returns true if isReqCommareaAddrlen24kErr() is 84
   */
  public boolean isReqCommareaAddrlen24kErr() throws CFException {
    return (getReqExplanationCode() == 84);
  }

  /** set values 84 */
  public void setReqCommareaAddrlen24kErrTrue() {
    setReqExplanationCode(84);
  }

  /**
   * Test condition 85 for isReqMercatorGenError()
   *
   * @return Returns true if isReqMercatorGenError() is 85
   */
  public boolean isReqMercatorGenError() throws CFException {
    return (getReqExplanationCode() == 85);
  }

  /** set values 85 */
  public void setReqMercatorGenErrorTrue() {
    setReqExplanationCode(85);
  }

  /**
   * Test condition 86 for isReqMercatorLinkError()
   *
   * @return Returns true if isReqMercatorLinkError() is 86
   */
  public boolean isReqMercatorLinkError() throws CFException {
    return (getReqExplanationCode() == 86);
  }

  /** set values 86 */
  public void setReqMercatorLinkErrorTrue() {
    setReqExplanationCode(86);
  }

  /**
   * Test condition 89 for isReqAddress8NoData()
   *
   * @return Returns true if isReqAddress8NoData() is 89
   */
  public boolean isReqAddress8NoData() throws CFException {
    return (getReqExplanationCode() == 89);
  }

  /** set values 89 */
  public void setReqAddress8NoDataTrue() {
    setReqExplanationCode(89);
  }

  /**
   * Test condition 90 for isReqFoundPgmError()
   *
   * @return Returns true if isReqFoundPgmError() is 90
   */
  public boolean isReqFoundPgmError() throws CFException {
    return (getReqExplanationCode() == 90);
  }

  /** set values 90 */
  public void setReqFoundPgmErrorTrue() {
    setReqExplanationCode(90);
  }

  /**
   * Test condition 91 for isReqReplayPgmError()
   *
   * @return Returns true if isReqReplayPgmError() is 91
   */
  public boolean isReqReplayPgmError() throws CFException {
    return (getReqExplanationCode() == 91);
  }

  /** set values 91 */
  public void setReqReplayPgmErrorTrue() {
    setReqExplanationCode(91);
  }

  /**
   * Test condition 92 for isReqHiaaTblLoadError()
   *
   * @return Returns true if isReqHiaaTblLoadError() is 92
   */
  public boolean isReqHiaaTblLoadError() throws CFException {
    return (getReqExplanationCode() == 92);
  }

  /** set values 92 */
  public void setReqHiaaTblLoadErrorTrue() {
    setReqExplanationCode(92);
  }

  /**
   * Test condition 98 for isReqCtrlRecordError()
   *
   * @return Returns true if isReqCtrlRecordError() is 98
   */
  public boolean isReqCtrlRecordError() throws CFException {
    return (getReqExplanationCode() == 98);
  }

  /** set values 98 */
  public void setReqCtrlRecordErrorTrue() {
    setReqExplanationCode(98);
  }

  /**
   * Test condition 1 THRU 99 for isReqMqErrorRange20()
   *
   * @return Returns true if isReqMqErrorRange20() is 1 THRU 99
   */
  public boolean isReqMqErrorRange20() throws CFException {
    return ((getReqExplanationCode() >= 1) && (getReqExplanationCode() <= 99));
  }

  /** set values 1 THRU 99 */
  public void setReqMqErrorRange20True() {
    setReqExplanationCode(1);
  }

  /**
   * Test condition 0 THRU 99 for isReqMqErrorRange21()
   *
   * @return Returns true if isReqMqErrorRange21() is 0 THRU 99
   */
  public boolean isReqMqErrorRange21() throws CFException {
    return ((getReqExplanationCode() >= 0) && (getReqExplanationCode() <= 99));
  }

  /** set values 0 THRU 99 */
  public void setReqMqErrorRange21True() {
    setReqExplanationCode(0);
  }

  /**
   * Test condition 1 THRU 96 for isReqMqErrorRange22()
   *
   * @return Returns true if isReqMqErrorRange22() is 1 THRU 96
   */
  public boolean isReqMqErrorRange22() throws CFException {
    return ((getReqExplanationCode() >= 1) && (getReqExplanationCode() <= 96));
  }

  /** set values 1 THRU 96 */
  public void setReqMqErrorRange22True() {
    setReqExplanationCode(1);
  }

  /**
   * Test condition 1 THRU 66 for isReqMqErrorRange23()
   *
   * @return Returns true if isReqMqErrorRange23() is 1 THRU 66
   */
  public boolean isReqMqErrorRange23() throws CFException {
    return ((getReqExplanationCode() >= 1) && (getReqExplanationCode() <= 66));
  }

  /** set values 1 THRU 66 */
  public void setReqMqErrorRange23True() {
    setReqExplanationCode(1);
  }

  /**
   * Test condition 888 for isReqErrorSlotting()
   *
   * @return Returns true if isReqErrorSlotting() is 888
   */
  public boolean isReqErrorSlotting() throws CFException {
    return (getReqExplanationCode() == 888);
  }

  /** set values 888 */
  public void setReqErrorSlottingTrue() {
    setReqExplanationCode(888);
  }

  /**
   * Test condition 900 for isReqMercatorMissgSvcnm()
   *
   * @return Returns true if isReqMercatorMissgSvcnm() is 900
   */
  public boolean isReqMercatorMissgSvcnm() throws CFException {
    return (getReqExplanationCode() == 900);
  }

  /** set values 900 */
  public void setReqMercatorMissgSvcnmTrue() {
    setReqExplanationCode(900);
  }

  /**
   * Test condition 903 for isReqMercatorMisgLasttag()
   *
   * @return Returns true if isReqMercatorMisgLasttag() is 903
   */
  public boolean isReqMercatorMisgLasttag() throws CFException {
    return (getReqExplanationCode() == 903);
  }

  /** set values 903 */
  public void setReqMercatorMisgLasttagTrue() {
    setReqExplanationCode(903);
  }

  /**
   * Test condition 912 for isReqMercatorInvalidMapping()
   *
   * @return Returns true if isReqMercatorInvalidMapping() is 912
   */
  public boolean isReqMercatorInvalidMapping() throws CFException {
    return (getReqExplanationCode() == 912);
  }

  /** set values 912 */
  public void setReqMercatorInvalidMappingTrue() {
    setReqExplanationCode(912);
  }

  /**
   * Test condition 916 for isReqMercatorDiskWriteErr()
   *
   * @return Returns true if isReqMercatorDiskWriteErr() is 916
   */
  public boolean isReqMercatorDiskWriteErr() throws CFException {
    return (getReqExplanationCode() == 916);
  }

  /** set values 916 */
  public void setReqMercatorDiskWriteErrTrue() {
    setReqExplanationCode(916);
  }

  /**
   * Test condition 981 for isReqMercatorVlenErr()
   *
   * @return Returns true if isReqMercatorVlenErr() is 981
   */
  public boolean isReqMercatorVlenErr() throws CFException {
    return (getReqExplanationCode() == 981);
  }

  /** set values 981 */
  public void setReqMercatorVlenErrTrue() {
    setReqExplanationCode(981);
  }

  /**
   * Test condition 982 for isReqMercatorAddrlen24kReq()
   *
   * @return Returns true if isReqMercatorAddrlen24kReq() is 982
   */
  public boolean isReqMercatorAddrlen24kReq() throws CFException {
    return (getReqExplanationCode() == 982);
  }

  /** set values 982 */
  public void setReqMercatorAddrlen24kReqTrue() {
    setReqExplanationCode(982);
  }

  /**
   * Test condition 983 for isReqMercatorAddrlen24kResp()
   *
   * @return Returns true if isReqMercatorAddrlen24kResp() is 983
   */
  public boolean isReqMercatorAddrlen24kResp() throws CFException {
    return (getReqExplanationCode() == 983);
  }

  /** set values 983 */
  public void setReqMercatorAddrlen24kRespTrue() {
    setReqExplanationCode(983);
  }

  /**
   * Test condition 985 for isReqMercatorErr()
   *
   * @return Returns true if isReqMercatorErr() is 985
   */
  public boolean isReqMercatorErr() throws CFException {
    return (getReqExplanationCode() == 985);
  }

  /** set values 985 */
  public void setReqMercatorErrTrue() {
    setReqExplanationCode(985);
  }

  /**
   * Test condition 987 for isReqMercatorPgmidErr()
   *
   * @return Returns true if isReqMercatorPgmidErr() is 987
   */
  public boolean isReqMercatorPgmidErr() throws CFException {
    return (getReqExplanationCode() == 987);
  }

  /** set values 987 */
  public void setReqMercatorPgmidErrTrue() {
    setReqExplanationCode(987);
  }

  /**
   * Test condition 995 for isReqErrorWarning()
   *
   * @return Returns true if isReqErrorWarning() is 995
   */
  public boolean isReqErrorWarning() throws CFException {
    return (getReqExplanationCode() == 995);
  }

  /** set values 995 */
  public void setReqErrorWarningTrue() {
    setReqExplanationCode(995);
  }

  /**
   * Test condition 996 for isReqSeeMsgAddress9()
   *
   * @return Returns true if isReqSeeMsgAddress9() is 996
   */
  public boolean isReqSeeMsgAddress9() throws CFException {
    return (getReqExplanationCode() == 996);
  }

  /** set values 996 */
  public void setReqSeeMsgAddress9True() {
    setReqExplanationCode(996);
  }

  /**
   * Test condition 997 for isReqSeeParmsForMoreInfo()
   *
   * @return Returns true if isReqSeeParmsForMoreInfo() is 997
   */
  public boolean isReqSeeParmsForMoreInfo() throws CFException {
    return (getReqExplanationCode() == 997);
  }

  /** set values 997 */
  public void setReqSeeParmsForMoreInfoTrue() {
    setReqExplanationCode(997);
  }

  /**
   * Test condition 998 for isReqSeeViewForMoreInfo()
   *
   * @return Returns true if isReqSeeViewForMoreInfo() is 998
   */
  public boolean isReqSeeViewForMoreInfo() throws CFException {
    return (getReqExplanationCode() == 998);
  }

  /** set values 998 */
  public void setReqSeeViewForMoreInfoTrue() {
    setReqExplanationCode(998);
  }

  /**
   * Test condition 999 for isReqNoExplCode()
   *
   * @return Returns true if isReqNoExplCode() is 999
   */
  public boolean isReqNoExplCode() throws CFException {
    return (getReqExplanationCode() == 999);
  }

  /** set values 999 */
  public void setReqNoExplCodeTrue() {
    setReqExplanationCode(999);
  }
  /**
   * Returns the value of reqAddressArea
   *
   * @return reqAddressArea
   */
  public ReqAddressArea getReqAddressArea() {
    return reqAddressArea;
  }
  /**
   * Update ReqAddressArea with the passed value Corresponding COBOL Variable is REQ-ADDRESS-AREA
   *
   * @param value
   */
  public void setReqAddressArea(char[] value) {
    reqAddressArea.setString(value);
  }

  /**
   * Update ReqAddressArea with a String from an offset and length
   *
   * @param value
   */
  public void setReqAddressArea(char[] source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, reqAddressArea.begin, reqAddressArea.length());
  }

  /**
   * Update ReqAddressArea with a String from an offset and length to an offset and length
   *
   * @param value
   */
  public void setReqAddressArea(
      char[] source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, reqAddressArea.begin + targetIndex, targetLen);
  }

  /**
   * Update ReqAddressArea with another Field
   *
   * @param value
   */
  public void setReqAddressArea(Field source) {
    replace(source, 0, source.length(), reqAddressArea.begin, reqAddressArea.length());
  }

  /**
   * Update ReqAddressArea with another Field from an offset and length
   *
   * @param value
   */
  public void setReqAddressArea(Field source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, reqAddressArea.begin, reqAddressArea.length());
  }

  /**
   * Update ReqAddressArea with another Field from an offset and length to an offset and length
   *
   * @param value
   */
  public void setReqAddressArea(
      Field source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, reqAddressArea.begin + targetIndex, targetLen);
  }
  /**
   * Returns the value of reqAddressAreaTbl
   *
   * @return reqAddressAreaTbl
   */
  public ReqAddressAreaTbl getReqAddressAreaTbl() {
    return reqAddressAreaTbl;
  }
  /**
   * Update ReqAddressAreaTbl with the passed value Corresponding COBOL Variable is
   * REQ-ADDRESS-AREA-TBL
   *
   * @param value
   */
  public void setReqAddressAreaTbl(char[] value) {
    reqAddressAreaTbl.setString(value);
  }

  /**
   * Update ReqAddressAreaTbl with a String from an offset and length
   *
   * @param value
   */
  public void setReqAddressAreaTbl(char[] source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, reqAddressAreaTbl.begin, reqAddressAreaTbl.length());
  }

  /**
   * Update ReqAddressAreaTbl with a String from an offset and length to an offset and length
   *
   * @param value
   */
  public void setReqAddressAreaTbl(
      char[] source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, reqAddressAreaTbl.begin + targetIndex, targetLen);
  }

  /**
   * Update ReqAddressAreaTbl with another Field
   *
   * @param value
   */
  public void setReqAddressAreaTbl(Field source) {
    replace(source, 0, source.length(), reqAddressAreaTbl.begin, reqAddressAreaTbl.length());
  }

  /**
   * Update ReqAddressAreaTbl with another Field from an offset and length
   *
   * @param value
   */
  public void setReqAddressAreaTbl(Field source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, reqAddressAreaTbl.begin, reqAddressAreaTbl.length());
  }

  /**
   * Update ReqAddressAreaTbl with another Field from an offset and length to an offset and length
   *
   * @param value
   */
  public void setReqAddressAreaTbl(
      Field source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, reqAddressAreaTbl.begin + targetIndex, targetLen);
  }
  /**
   * Returns the value of reqRequestParms
   *
   * @return reqRequestParms
   */
  public char[] getReqRequestParms() throws CFException {
    if (isReqRequestParmsModified()) {
      reqRequestParms = refreshReqRequestParms();
    }
    return reqRequestParms;
  }

  /**
   * set variable reqRequestParms Corresponding COBOL Variable is REQ-REQUEST-PARMS
   *
   * @param value
   */
  public void setReqRequestParms(char[] value) {
    reqRequestParms = checkReqRequestParmsConstraints(value);
    serializeReqRequestParms(reqRequestParms);
  }

  /**
   * Update ReqRequestParms with a char[] from an offset and length
   *
   * @param value
   */
  public void setReqRequestParms(char[] source, int sourceIndex) {
    replace(source, sourceIndex, source.length, beginReqRequestParms, reqRequestParms.length);
  }

  public void setReqRequestParms(char[] source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginReqRequestParms, reqRequestParms.length);
  }

  /**
   * Update ReqRequestParms with a char[] from an offset and length to an offset and length
   *
   * @param value
   */
  public void setReqRequestParms(
      char[] source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginReqRequestParms + targetIndex, targetLen);
  }

  /**
   * Update ReqRequestParms with another Field
   *
   * @param value
   */
  public void setReqRequestParms(Field source) {
    replace(source, 0, source.length(), beginReqRequestParms, REQ_REQUEST_PARMS_LEN);
  }

  /**
   * Update ReqRequestParms with another Field from an offset and length
   *
   * @param value
   */
  public void setReqRequestParms(Field source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginReqRequestParms, REQ_REQUEST_PARMS_LEN);
  }

  /**
   * Update ReqRequestParms with another Field from an offset and length to an offset and length
   *
   * @param value
   */
  public void setReqRequestParms(
      Field source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginReqRequestParms + targetIndex, targetLen);
  }
  /**
   * Returns the value of reqRequestParmsRedef
   *
   * @return reqRequestParmsRedef
   */
  public ReqRequestParmsRedef getReqRequestParmsRedef() {
    return reqRequestParmsRedef;
  }
  /**
   * Update ReqRequestParmsRedef with the passed value Corresponding COBOL Variable is
   * REQ-REQUEST-PARMS-REDEF
   *
   * @param value
   */
  public void setReqRequestParmsRedef(char[] value) {
    reqRequestParmsRedef.setString(value);
  }

  /**
   * Update ReqRequestParmsRedef with a String from an offset and length
   *
   * @param value
   */
  public void setReqRequestParmsRedef(char[] source, int sourceIndex, int sourceLen) {
    replace(
        source, sourceIndex, sourceLen, reqRequestParmsRedef.begin, reqRequestParmsRedef.length());
  }

  /**
   * Update ReqRequestParmsRedef with a String from an offset and length to an offset and length
   *
   * @param value
   */
  public void setReqRequestParmsRedef(
      char[] source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, reqRequestParmsRedef.begin + targetIndex, targetLen);
  }

  /**
   * Update ReqRequestParmsRedef with another Field
   *
   * @param value
   */
  public void setReqRequestParmsRedef(Field source) {
    replace(source, 0, source.length(), reqRequestParmsRedef.begin, reqRequestParmsRedef.length());
  }

  /**
   * Update ReqRequestParmsRedef with another Field from an offset and length
   *
   * @param value
   */
  public void setReqRequestParmsRedef(Field source, int sourceIndex, int sourceLen) {
    replace(
        source, sourceIndex, sourceLen, reqRequestParmsRedef.begin, reqRequestParmsRedef.length());
  }

  /**
   * Update ReqRequestParmsRedef with another Field from an offset and length to an offset and
   * length
   *
   * @param value
   */
  public void setReqRequestParmsRedef(
      Field source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, reqRequestParmsRedef.begin + targetIndex, targetLen);
  }

  public static int getF5957reqInputFieldLength() {
    return F_5957REQ_INPUT_LENGTH;
  }
}
