package com.cloudframe.app.dto.c5427hpc;

/**
 * The class CrtnRequestData is used to handle fields declared in it
 *
 * @author CloudFrame Inc. created on 2025-03-25 at 08:29. using version 5.0.0.231
 */
import com.cloudframe.app.data.Field;
import com.cloudframe.app.dto.serialize.c5427hpc.*;
import com.cloudframe.app.exception.CFException;
import java.util.ArrayList;
import java.util.List;

public class CrtnRequestData extends CrtnRequestDataSerialized {

  private char[] crtnCallType = Field.fillLowValue(1);
  private List<char[]> crtnSrchCd;

  private char[] crtnHipaaCd30Flag = Field.fillLowValue(1);

  /** Constructor for CrtnRequestData */
  public CrtnRequestData() {
    // TO-DO auto generated code
  }

  /**
   * Constructor for CrtnRequestData. sets the parent value to the parent
   *
   * @param parent
   * @param begin
   */
  public CrtnRequestData(Field parent, int begin) {
    setParent(parent, begin);
  }

  /**
   * Returns the value of crtnCallType
   *
   * @return crtnCallType
   */
  public char[] getCrtnCallType() throws CFException {
    if (isCrtnCallTypeModified()) {
      crtnCallType = refreshCrtnCallType();
    }
    return crtnCallType;
  }

  /**
   * set variable crtnCallType Corresponding COBOL Variable is CRTN-CALL-TYPE
   *
   * @param value
   */
  public void setCrtnCallType(char[] value) {
    crtnCallType = checkCrtnCallTypeConstraints(value);
    serializeCrtnCallType(crtnCallType);
  }

  /**
   * Update CrtnCallType with a char[] from an offset and length
   *
   * @param value
   */
  public void setCrtnCallType(char[] source, int sourceIndex) {
    replace(source, sourceIndex, source.length, beginCrtnCallType, crtnCallType.length);
  }

  public void setCrtnCallType(char[] source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginCrtnCallType, crtnCallType.length);
  }

  /**
   * Update CrtnCallType with a char[] from an offset and length to an offset and length
   *
   * @param value
   */
  public void setCrtnCallType(
      char[] source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginCrtnCallType + targetIndex, targetLen);
  }

  /**
   * Update CrtnCallType with another Field
   *
   * @param value
   */
  public void setCrtnCallType(Field source) {
    replace(source, 0, source.length(), beginCrtnCallType, CRTN_CALL_TYPE_LEN);
  }

  /**
   * Update CrtnCallType with another Field from an offset and length
   *
   * @param value
   */
  public void setCrtnCallType(Field source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginCrtnCallType, CRTN_CALL_TYPE_LEN);
  }

  /**
   * Update CrtnCallType with another Field from an offset and length to an offset and length
   *
   * @param value
   */
  public void setCrtnCallType(
      Field source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginCrtnCallType + targetIndex, targetLen);
  }

  char[] crtnListCsr88Value = "A".toCharArray();
  /**
   * Test condition "A" for isCrtnListCsr()
   *
   * @return Returns true if isCrtnListCsr() is "A"
   */
  public boolean isCrtnListCsr() throws CFException {
    return (compareChars(getCrtnCallType(), crtnListCsr88Value) == 0);
  }

  /** set values "A" */
  public void setCrtnListCsrTrue() {
    setCrtnCallType(crtnListCsr88Value);
  }

  char[] crtnGenericCsr88Value = "B".toCharArray();
  /**
   * Test condition "B" for isCrtnGenericCsr()
   *
   * @return Returns true if isCrtnGenericCsr() is "B"
   */
  public boolean isCrtnGenericCsr() throws CFException {
    return (compareChars(getCrtnCallType(), crtnGenericCsr88Value) == 0);
  }

  /** set values "B" */
  public void setCrtnGenericCsrTrue() {
    setCrtnCallType(crtnGenericCsr88Value);
  }

  char[] crtnGroupCsr88Value = "C".toCharArray();
  /**
   * Test condition "C" for isCrtnGroupCsr()
   *
   * @return Returns true if isCrtnGroupCsr() is "C"
   */
  public boolean isCrtnGroupCsr() throws CFException {
    return (compareChars(getCrtnCallType(), crtnGroupCsr88Value) == 0);
  }

  /** set values "C" */
  public void setCrtnGroupCsrTrue() {
    setCrtnCallType(crtnGroupCsr88Value);
  }

  char[] crtnSelect88Value = "D".toCharArray();
  /**
   * Test condition "D" for isCrtnSelect()
   *
   * @return Returns true if isCrtnSelect() is "D"
   */
  public boolean isCrtnSelect() throws CFException {
    return (compareChars(getCrtnCallType(), crtnSelect88Value) == 0);
  }

  /** set values "D" */
  public void setCrtnSelectTrue() {
    setCrtnCallType(crtnSelect88Value);
  }
  /**
   * Returns the value of crtnSrchCd Corresponding COBOL Variable is CRTN-SRCH-CD
   *
   * @return crtnSrchCd
   */
  public List<char[]> getCrtnSrchCd() throws CFException {
    List<char[]> list = new ArrayList<>();
    for (int index = 0; index < CRTN_SRCH_CD_SIZE; index++) {
      list.add(getCrtnSrchCd(index));
    }
    return list;
  }
  /**
   * Returns the element at the specified position form the list.
   *
   * @param index
   * @return crtnSrchCd
   */
  public char[] getCrtnSrchCd(int index) {
    if (index < 0) {
      logger.trace("Array index was {} for getCrtnSrchCd(), resetting it to 0", index);
      index = 0;
    } else if (index >= CRTN_SRCH_CD_SIZE) {
      index = CRTN_SRCH_CD_SIZE - 1; // can't exceed max array size
      logger.trace(
          "crtnSrchCd - Array index exceeded max Size {}, resetting it to max allowed",
          CRTN_SRCH_CD_SIZE);
    }
    return getCharArray((beginCrtnSrchCd + index * CRTN_SRCH_CD_LEN), CRTN_SRCH_CD_LEN);
  }

  public int crtnSrchCdFieldLength() {
    return CRTN_SRCH_CD_LEN;
  }

  /**
   * Update CrtnSrchCd with the passed value at a given index Corresponding COBOL Variable is
   * CRTN-SRCH-CD
   *
   * @param index
   * @param value
   */
  public void setCrtnSrchCd(int index, char[] value) {
    setCrtnSrchCd(index, value, true);
  }

  /**
   * Update CrtnSrchCd with the passed value at a given index and serializes if setModified is true
   *
   * @param index
   * @param value
   * @param setModified - used for serializing as String
   */
  private void setCrtnSrchCd(int index, char[] value, boolean setModified) {
    if (index < 0) {
      logger.trace(
          "Array index was {} for setCrtnSrchCd(int,String,boolean), reset it to 0", index);
      index = 0;
    }

    if (value != null) {
      if (value.length > 2) {
        value = substring(value, 0, 2);
      } else if (value.length < 2) {
        value = pad(2, value, SPACE_CHAR, RIGHT_PAD);
      }
    } else { // if value is null, fill it with spaces
      value = fillSpaces(2).toCharArray();
    }
    // String array will always read from stringValue so no need to explicitly set the array item
    if (setModified) {
      serializeCrtnSrchCd(index, value);
    }
  }

  /**
   * Returns the value of crtnHipaaCd30Flag
   *
   * @return crtnHipaaCd30Flag
   */
  public char[] getCrtnHipaaCd30Flag() throws CFException {
    if (isCrtnHipaaCd30FlagModified()) {
      crtnHipaaCd30Flag = refreshCrtnHipaaCd30Flag();
    }
    return crtnHipaaCd30Flag;
  }

  /**
   * set variable crtnHipaaCd30Flag Corresponding COBOL Variable is CRTN-HIPAA-CD-30-FLAG
   *
   * @param value
   */
  public void setCrtnHipaaCd30Flag(char[] value) {
    crtnHipaaCd30Flag = checkCrtnHipaaCd30FlagConstraints(value);
    serializeCrtnHipaaCd30Flag(crtnHipaaCd30Flag);
  }

  /**
   * Update CrtnHipaaCd30Flag with a char[] from an offset and length
   *
   * @param value
   */
  public void setCrtnHipaaCd30Flag(char[] source, int sourceIndex) {
    replace(source, sourceIndex, source.length, beginCrtnHipaaCd30Flag, crtnHipaaCd30Flag.length);
  }

  public void setCrtnHipaaCd30Flag(char[] source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginCrtnHipaaCd30Flag, crtnHipaaCd30Flag.length);
  }

  /**
   * Update CrtnHipaaCd30Flag with a char[] from an offset and length to an offset and length
   *
   * @param value
   */
  public void setCrtnHipaaCd30Flag(
      char[] source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginCrtnHipaaCd30Flag + targetIndex, targetLen);
  }

  /**
   * Update CrtnHipaaCd30Flag with another Field
   *
   * @param value
   */
  public void setCrtnHipaaCd30Flag(Field source) {
    replace(source, 0, source.length(), beginCrtnHipaaCd30Flag, CRTN_HIPAA_CD_30_FLAG_LEN);
  }

  /**
   * Update CrtnHipaaCd30Flag with another Field from an offset and length
   *
   * @param value
   */
  public void setCrtnHipaaCd30Flag(Field source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginCrtnHipaaCd30Flag, CRTN_HIPAA_CD_30_FLAG_LEN);
  }

  /**
   * Update CrtnHipaaCd30Flag with another Field from an offset and length to an offset and length
   *
   * @param value
   */
  public void setCrtnHipaaCd30Flag(
      Field source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginCrtnHipaaCd30Flag + targetIndex, targetLen);
  }

  char[] crtnHipaaCd30Y88Value = "Y".toCharArray();
  /**
   * Test condition "Y" for isCrtnHipaaCd30Y()
   *
   * @return Returns true if isCrtnHipaaCd30Y() is "Y"
   */
  public boolean isCrtnHipaaCd30Y() throws CFException {
    return (compareChars(getCrtnHipaaCd30Flag(), crtnHipaaCd30Y88Value) == 0);
  }

  /** set values "Y" */
  public void setCrtnHipaaCd30YTrue() {
    setCrtnHipaaCd30Flag(crtnHipaaCd30Y88Value);
  }

  char[] crtnHipaaCd30N88Value = "N".toCharArray();
  /**
   * Test condition "N" for isCrtnHipaaCd30N()
   *
   * @return Returns true if isCrtnHipaaCd30N() is "N"
   */
  public boolean isCrtnHipaaCd30N() throws CFException {
    return (compareChars(getCrtnHipaaCd30Flag(), crtnHipaaCd30N88Value) == 0);
  }

  /** set values "N" */
  public void setCrtnHipaaCd30NTrue() {
    setCrtnHipaaCd30Flag(crtnHipaaCd30N88Value);
  }

  public static int getCrtnRequestDataFieldLength() {
    return CRTN_REQUEST_DATA_LENGTH;
  }
}
