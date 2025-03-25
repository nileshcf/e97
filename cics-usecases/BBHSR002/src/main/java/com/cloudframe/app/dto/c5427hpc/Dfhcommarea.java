package com.cloudframe.app.dto.c5427hpc;

/**
 * The class Dfhcommarea is used to handle fields declared in it
 *
 * @author CloudFrame Inc. created on 2025-03-25 at 08:29. using version 5.0.0.231
 */
import com.cloudframe.app.data.Field;
import com.cloudframe.app.dto.serialize.c5427hpc.*;
import com.cloudframe.app.exception.CFException;

public class Dfhcommarea extends DfhcommareaSerialized {

  private CrtnSrchKey crtnSrchKey = new CrtnSrchKey();
  private CrtnRequestData crtnRequestData = new CrtnRequestData();

  private char[] crtnFunction = Field.fillLowValue(1);
  private CrtnSrchReturnArea crtnSrchReturnArea = new CrtnSrchReturnArea();

  /** Constructor for Dfhcommarea */
  public Dfhcommarea() {
    super();
    /*  set the parent of each child as this which are a group variable */
    crtnSrchKey.setParent(this, getStartOffset() + 0);
    crtnRequestData.setParent(this, getStartOffset() + 7);
    crtnSrchReturnArea.setParent(this, getStartOffset() + 30);
    /*  end of offset */
  }

  /**
   * Returns the value of crtnSrchKey
   *
   * @return crtnSrchKey
   */
  public CrtnSrchKey getCrtnSrchKey() {
    return crtnSrchKey;
  }
  /**
   * Update CrtnSrchKey with the passed value Corresponding COBOL Variable is CRTN-SRCH-KEY
   *
   * @param value
   */
  public void setCrtnSrchKey(char[] value) {
    crtnSrchKey.setString(value);
  }

  /**
   * Update CrtnSrchKey with a String from an offset and length
   *
   * @param value
   */
  public void setCrtnSrchKey(char[] source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, crtnSrchKey.begin, crtnSrchKey.length());
  }

  /**
   * Update CrtnSrchKey with a String from an offset and length to an offset and length
   *
   * @param value
   */
  public void setCrtnSrchKey(
      char[] source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, crtnSrchKey.begin + targetIndex, targetLen);
  }

  /**
   * Update CrtnSrchKey with another Field
   *
   * @param value
   */
  public void setCrtnSrchKey(Field source) {
    replace(source, 0, source.length(), crtnSrchKey.begin, crtnSrchKey.length());
  }

  /**
   * Update CrtnSrchKey with another Field from an offset and length
   *
   * @param value
   */
  public void setCrtnSrchKey(Field source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, crtnSrchKey.begin, crtnSrchKey.length());
  }

  /**
   * Update CrtnSrchKey with another Field from an offset and length to an offset and length
   *
   * @param value
   */
  public void setCrtnSrchKey(
      Field source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, crtnSrchKey.begin + targetIndex, targetLen);
  }
  /**
   * Returns the value of crtnRequestData
   *
   * @return crtnRequestData
   */
  public CrtnRequestData getCrtnRequestData() {
    return crtnRequestData;
  }
  /**
   * Update CrtnRequestData with the passed value Corresponding COBOL Variable is CRTN-REQUEST-DATA
   *
   * @param value
   */
  public void setCrtnRequestData(char[] value) {
    crtnRequestData.setString(value);
  }

  /**
   * Update CrtnRequestData with a String from an offset and length
   *
   * @param value
   */
  public void setCrtnRequestData(char[] source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, crtnRequestData.begin, crtnRequestData.length());
  }

  /**
   * Update CrtnRequestData with a String from an offset and length to an offset and length
   *
   * @param value
   */
  public void setCrtnRequestData(
      char[] source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, crtnRequestData.begin + targetIndex, targetLen);
  }

  /**
   * Update CrtnRequestData with another Field
   *
   * @param value
   */
  public void setCrtnRequestData(Field source) {
    replace(source, 0, source.length(), crtnRequestData.begin, crtnRequestData.length());
  }

  /**
   * Update CrtnRequestData with another Field from an offset and length
   *
   * @param value
   */
  public void setCrtnRequestData(Field source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, crtnRequestData.begin, crtnRequestData.length());
  }

  /**
   * Update CrtnRequestData with another Field from an offset and length to an offset and length
   *
   * @param value
   */
  public void setCrtnRequestData(
      Field source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, crtnRequestData.begin + targetIndex, targetLen);
  }
  /**
   * Returns the value of crtnFunction
   *
   * @return crtnFunction
   */
  public char[] getCrtnFunction() throws CFException {
    if (isCrtnFunctionModified()) {
      crtnFunction = refreshCrtnFunction();
    }
    return crtnFunction;
  }

  /**
   * set variable crtnFunction Corresponding COBOL Variable is CRTN-FUNCTION
   *
   * @param value
   */
  public void setCrtnFunction(char[] value) {
    crtnFunction = checkCrtnFunctionConstraints(value);
    serializeCrtnFunction(crtnFunction);
  }

  /**
   * Update CrtnFunction with a char[] from an offset and length
   *
   * @param value
   */
  public void setCrtnFunction(char[] source, int sourceIndex) {
    replace(source, sourceIndex, source.length, beginCrtnFunction, crtnFunction.length);
  }

  public void setCrtnFunction(char[] source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginCrtnFunction, crtnFunction.length);
  }

  /**
   * Update CrtnFunction with a char[] from an offset and length to an offset and length
   *
   * @param value
   */
  public void setCrtnFunction(
      char[] source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginCrtnFunction + targetIndex, targetLen);
  }

  /**
   * Update CrtnFunction with another Field
   *
   * @param value
   */
  public void setCrtnFunction(Field source) {
    replace(source, 0, source.length(), beginCrtnFunction, CRTN_FUNCTION_LEN);
  }

  /**
   * Update CrtnFunction with another Field from an offset and length
   *
   * @param value
   */
  public void setCrtnFunction(Field source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginCrtnFunction, CRTN_FUNCTION_LEN);
  }

  /**
   * Update CrtnFunction with another Field from an offset and length to an offset and length
   *
   * @param value
   */
  public void setCrtnFunction(
      Field source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginCrtnFunction + targetIndex, targetLen);
  }

  char[] crtnFunctionIsOpen88Value = "O".toCharArray();
  /**
   * Test condition "O" for isCrtnFunctionIsOpen()
   *
   * @return Returns true if isCrtnFunctionIsOpen() is "O"
   */
  public boolean isCrtnFunctionIsOpen() throws CFException {
    return (compareChars(getCrtnFunction(), crtnFunctionIsOpen88Value) == 0);
  }

  /** set values "O" */
  public void setCrtnFunctionIsOpenTrue() {
    setCrtnFunction(crtnFunctionIsOpen88Value);
  }

  char[] crtnFunctionIsFetch88Value = "F".toCharArray();
  /**
   * Test condition "F" for isCrtnFunctionIsFetch()
   *
   * @return Returns true if isCrtnFunctionIsFetch() is "F"
   */
  public boolean isCrtnFunctionIsFetch() throws CFException {
    return (compareChars(getCrtnFunction(), crtnFunctionIsFetch88Value) == 0);
  }

  /** set values "F" */
  public void setCrtnFunctionIsFetchTrue() {
    setCrtnFunction(crtnFunctionIsFetch88Value);
  }
  /**
   * Returns the value of crtnSrchReturnArea
   *
   * @return crtnSrchReturnArea
   */
  public CrtnSrchReturnArea getCrtnSrchReturnArea() {
    return crtnSrchReturnArea;
  }
  /**
   * Update CrtnSrchReturnArea with the passed value Corresponding COBOL Variable is
   * CRTN-SRCH-RETURN-AREA
   *
   * @param value
   */
  public void setCrtnSrchReturnArea(char[] value) {
    crtnSrchReturnArea.setString(value);
  }

  /**
   * Update CrtnSrchReturnArea with a String from an offset and length
   *
   * @param value
   */
  public void setCrtnSrchReturnArea(char[] source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, crtnSrchReturnArea.begin, crtnSrchReturnArea.length());
  }

  /**
   * Update CrtnSrchReturnArea with a String from an offset and length to an offset and length
   *
   * @param value
   */
  public void setCrtnSrchReturnArea(
      char[] source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, crtnSrchReturnArea.begin + targetIndex, targetLen);
  }

  /**
   * Update CrtnSrchReturnArea with another Field
   *
   * @param value
   */
  public void setCrtnSrchReturnArea(Field source) {
    replace(source, 0, source.length(), crtnSrchReturnArea.begin, crtnSrchReturnArea.length());
  }

  /**
   * Update CrtnSrchReturnArea with another Field from an offset and length
   *
   * @param value
   */
  public void setCrtnSrchReturnArea(Field source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, crtnSrchReturnArea.begin, crtnSrchReturnArea.length());
  }

  /**
   * Update CrtnSrchReturnArea with another Field from an offset and length to an offset and length
   *
   * @param value
   */
  public void setCrtnSrchReturnArea(
      Field source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, crtnSrchReturnArea.begin + targetIndex, targetLen);
  }

  public static int getDfhcommareaFieldLength() {
    return DFHCOMMAREA_LENGTH;
  }
}
