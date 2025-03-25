package com.cloudframe.app.dto.dphpctsq;

/**
 * The class HostVarArrayArea is used to handle fields declared in it
 *
 * @author CloudFrame Inc. created on 2025-03-25 at 08:30. using version 5.0.0.231
 */
import com.cloudframe.app.common.CONSTANTS;
import com.cloudframe.app.dto.serialize.dphpctsq.*;
import com.cloudframe.app.exception.CFException;
import java.util.ArrayList;
import java.util.List;

public class HostVarArrayArea extends HostVarArrayAreaSerialized {

  private List<Integer> hvQueryTyp;

  private List<char[]> hvHipaaVerNbr;

  private List<char[]> hvSortCol1;

  private List<char[]> hvHipaaCd;

  private List<char[]> hvGrnrcRqstCd;

  private List<char[]> hvHipaaGrpCd;

  private List<Integer> hvDataTyp;

  private List<Integer> hvKeyCnt;

  private List<Integer> hvDataCnt;

  /** Constructor for HostVarArrayArea */
  public HostVarArrayArea() {
    super();
    /*  set the parent of each child as this which are a group variable */
    /*  end of offset */
  }

  /**
   * Returns the value of hvQueryTyp Corresponding COBOL Variable is HV-QUERY-TYP
   *
   * @return hvQueryTyp
   */
  public List<Integer> getHvQueryTyp() throws CFException {
    List<Integer> list = new ArrayList<>();
    for (int index = 0; index < HV_QUERY_TYP_SIZE; index++) {
      list.add(getHvQueryTyp(index));
    }
    return list;
  }
  /**
   * Returns the element at the specified position from the list
   *
   * @param index
   * @return hvQueryTyp
   */
  public int getHvQueryTyp(int index) {
    if (index < 0) {
      logger.trace("Array index was {} for getHvQueryTyp(), resetting it to 0", index);
      index = 0;
    } else if (index >= HV_QUERY_TYP_SIZE) {
      index = HV_QUERY_TYP_SIZE - 1; // can't exceed max array size
      logger.trace(
          "hvQueryTyp - Array index exceeded max Size {}, resetting it to max allowed",
          HV_QUERY_TYP_SIZE);
    }
    return getInt(beginHvQueryTyp + index * HV_QUERY_TYP_LEN);
  }

  /**
   * Update HvQueryTyp at index with the passed value Corresponding COBOL Variable is HV-QUERY-TYP
   *
   * @param index
   * @param number
   */
  public void setHvQueryTyp(int index, int number) {
    truncated = false; // reset left over truncated flag
    setHvQueryTyp(index, number, true);
  }

  public void setHvQueryTyp(int index, long number) {
    setHvQueryTyp(index, (int) number, true);
  }

  /**
   * Update HvQueryTyp at index with the passed value and serialize the object if setModified is
   * true
   *
   * @param index
   * @param value
   * @param setModified
   */
  private void setHvQueryTyp(int index, int value, boolean setModified) {
    if (index < 0) {
      logger.trace(
          "Array index was {} for setHvQueryTyp(int, String, boolean), resetting it to 0", index);
      index = 0;
    } else if (index >= HV_QUERY_TYP_SIZE) {
      index = HV_QUERY_TYP_SIZE - 1; // can't exceed max array size
      logger.trace(
          "hvQueryTyp - Array index exceeded max Size "
              + HV_QUERY_TYP_SIZE
              + ", resetting it to max allowed");
    }
    //
    //
    if (setModified) {
      serializeHvQueryTyp(index, value);
    }
  }
  /**
   * Returns the value of hvHipaaVerNbr Corresponding COBOL Variable is HV-HIPAA-VER-NBR
   *
   * @return hvHipaaVerNbr
   */
  public List<char[]> getHvHipaaVerNbr() throws CFException {
    List<char[]> list = new ArrayList<>();
    for (int index = 0; index < HV_HIPAA_VER_NBR_SIZE; index++) {
      list.add(getHvHipaaVerNbr(index));
    }
    return list;
  }
  /**
   * Returns the element at the specified position form the list.
   *
   * @param index
   * @return hvHipaaVerNbr
   */
  public char[] getHvHipaaVerNbr(int index) {
    if (index < 0) {
      logger.trace("Array index was {} for getHvHipaaVerNbr(), resetting it to 0", index);
      index = 0;
    } else if (index >= HV_HIPAA_VER_NBR_SIZE) {
      index = HV_HIPAA_VER_NBR_SIZE - 1; // can't exceed max array size
      logger.trace(
          "hvHipaaVerNbr - Array index exceeded max Size {}, resetting it to max allowed",
          HV_HIPAA_VER_NBR_SIZE);
    }
    return getCharArray((beginHvHipaaVerNbr + index * HV_HIPAA_VER_NBR_LEN), HV_HIPAA_VER_NBR_LEN);
  }

  public int hvHipaaVerNbrFieldLength() {
    return HV_HIPAA_VER_NBR_LEN;
  }

  /**
   * Update HvHipaaVerNbr with the passed value at a given index Corresponding COBOL Variable is
   * HV-HIPAA-VER-NBR
   *
   * @param index
   * @param value
   */
  public void setHvHipaaVerNbr(int index, char[] value) {
    setHvHipaaVerNbr(index, value, true);
  }

  /**
   * Update HvHipaaVerNbr with the passed value at a given index and serializes if setModified is
   * true
   *
   * @param index
   * @param value
   * @param setModified - used for serializing as String
   */
  private void setHvHipaaVerNbr(int index, char[] value, boolean setModified) {
    if (index < 0) {
      logger.trace(
          "Array index was {} for setHvHipaaVerNbr(int,String,boolean), reset it to 0", index);
      index = 0;
    }

    if (value != null) {
      if (value.length > 1) {
        value = substring(value, 0, 1);
      } else if (value.length < 1) {
        value = pad(1, value, SPACE_CHAR, RIGHT_PAD);
      }
    } else { // if value is null, fill it with spaces
      value = fillSpaces(1).toCharArray();
    }
    // String array will always read from stringValue so no need to explicitly set the array item
    if (setModified) {
      serializeHvHipaaVerNbr(index, value);
    }
  }

  /**
   * Returns the value of hvSortCol1 Corresponding COBOL Variable is HV-SORT-COL1
   *
   * @return hvSortCol1
   */
  public List<char[]> getHvSortCol1() throws CFException {
    List<char[]> list = new ArrayList<>();
    for (int index = 0; index < HV_SORT_COL_1_SIZE; index++) {
      list.add(getHvSortCol1(index));
    }
    return list;
  }
  /**
   * Returns the element at the specified position form the list.
   *
   * @param index
   * @return hvSortCol1
   */
  public char[] getHvSortCol1(int index) {
    if (index < 0) {
      logger.trace("Array index was {} for getHvSortCol1(), resetting it to 0", index);
      index = 0;
    } else if (index >= HV_SORT_COL_1_SIZE) {
      index = HV_SORT_COL_1_SIZE - 1; // can't exceed max array size
      logger.trace(
          "hvSortCol1 - Array index exceeded max Size {}, resetting it to max allowed",
          HV_SORT_COL_1_SIZE);
    }
    return getCharArray((beginHvSortCol1 + index * HV_SORT_COL_1_LEN), HV_SORT_COL_1_LEN);
  }

  public int hvSortCol1FieldLength() {
    return HV_SORT_COL_1_LEN;
  }

  /**
   * Update HvSortCol1 with the passed value at a given index Corresponding COBOL Variable is
   * HV-SORT-COL1
   *
   * @param index
   * @param value
   */
  public void setHvSortCol1(int index, char[] value) {
    setHvSortCol1(index, value, true);
  }

  /**
   * Update HvSortCol1 with the passed value at a given index and serializes if setModified is true
   *
   * @param index
   * @param value
   * @param setModified - used for serializing as String
   */
  private void setHvSortCol1(int index, char[] value, boolean setModified) {
    if (index < 0) {
      logger.trace(
          "Array index was {} for setHvSortCol1(int,String,boolean), reset it to 0", index);
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
      serializeHvSortCol1(index, value);
    }
  }

  /**
   * Returns the value of hvHipaaCd Corresponding COBOL Variable is HV-HIPAA-CD
   *
   * @return hvHipaaCd
   */
  public List<char[]> getHvHipaaCd() throws CFException {
    List<char[]> list = new ArrayList<>();
    for (int index = 0; index < HV_HIPAA_CD_SIZE; index++) {
      list.add(getHvHipaaCd(index));
    }
    return list;
  }
  /**
   * Returns the element at the specified position form the list.
   *
   * @param index
   * @return hvHipaaCd
   */
  public char[] getHvHipaaCd(int index) {
    if (index < 0) {
      logger.trace("Array index was {} for getHvHipaaCd(), resetting it to 0", index);
      index = 0;
    } else if (index >= HV_HIPAA_CD_SIZE) {
      index = HV_HIPAA_CD_SIZE - 1; // can't exceed max array size
      logger.trace(
          "hvHipaaCd - Array index exceeded max Size {}, resetting it to max allowed",
          HV_HIPAA_CD_SIZE);
    }
    return getCharArray((beginHvHipaaCd + index * HV_HIPAA_CD_LEN), HV_HIPAA_CD_LEN);
  }

  public int hvHipaaCdFieldLength() {
    return HV_HIPAA_CD_LEN;
  }

  /**
   * Update HvHipaaCd with the passed value at a given index Corresponding COBOL Variable is
   * HV-HIPAA-CD
   *
   * @param index
   * @param value
   */
  public void setHvHipaaCd(int index, char[] value) {
    setHvHipaaCd(index, value, true);
  }

  /**
   * Update HvHipaaCd with the passed value at a given index and serializes if setModified is true
   *
   * @param index
   * @param value
   * @param setModified - used for serializing as String
   */
  private void setHvHipaaCd(int index, char[] value, boolean setModified) {
    if (index < 0) {
      logger.trace("Array index was {} for setHvHipaaCd(int,String,boolean), reset it to 0", index);
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
      serializeHvHipaaCd(index, value);
    }
  }

  /**
   * Returns the value of hvGrnrcRqstCd Corresponding COBOL Variable is HV-GRNRC-RQST-CD
   *
   * @return hvGrnrcRqstCd
   */
  public List<char[]> getHvGrnrcRqstCd() throws CFException {
    List<char[]> list = new ArrayList<>();
    for (int index = 0; index < HV_GRNRC_RQST_CD_SIZE; index++) {
      list.add(getHvGrnrcRqstCd(index));
    }
    return list;
  }
  /**
   * Returns the element at the specified position form the list.
   *
   * @param index
   * @return hvGrnrcRqstCd
   */
  public char[] getHvGrnrcRqstCd(int index) {
    if (index < 0) {
      logger.trace("Array index was {} for getHvGrnrcRqstCd(), resetting it to 0", index);
      index = 0;
    } else if (index >= HV_GRNRC_RQST_CD_SIZE) {
      index = HV_GRNRC_RQST_CD_SIZE - 1; // can't exceed max array size
      logger.trace(
          "hvGrnrcRqstCd - Array index exceeded max Size {}, resetting it to max allowed",
          HV_GRNRC_RQST_CD_SIZE);
    }
    return getCharArray((beginHvGrnrcRqstCd + index * HV_GRNRC_RQST_CD_LEN), HV_GRNRC_RQST_CD_LEN);
  }

  public int hvGrnrcRqstCdFieldLength() {
    return HV_GRNRC_RQST_CD_LEN;
  }

  /**
   * Update HvGrnrcRqstCd with the passed value at a given index Corresponding COBOL Variable is
   * HV-GRNRC-RQST-CD
   *
   * @param index
   * @param value
   */
  public void setHvGrnrcRqstCd(int index, char[] value) {
    setHvGrnrcRqstCd(index, value, true);
  }

  /**
   * Update HvGrnrcRqstCd with the passed value at a given index and serializes if setModified is
   * true
   *
   * @param index
   * @param value
   * @param setModified - used for serializing as String
   */
  private void setHvGrnrcRqstCd(int index, char[] value, boolean setModified) {
    if (index < 0) {
      logger.trace(
          "Array index was {} for setHvGrnrcRqstCd(int,String,boolean), reset it to 0", index);
      index = 0;
    }

    if (value != null) {
      if (value.length > 1) {
        value = substring(value, 0, 1);
      } else if (value.length < 1) {
        value = pad(1, value, SPACE_CHAR, RIGHT_PAD);
      }
    } else { // if value is null, fill it with spaces
      value = fillSpaces(1).toCharArray();
    }
    // String array will always read from stringValue so no need to explicitly set the array item
    if (setModified) {
      serializeHvGrnrcRqstCd(index, value);
    }
  }

  /**
   * Returns the value of hvHipaaGrpCd Corresponding COBOL Variable is HV-HIPAA-GRP-CD
   *
   * @return hvHipaaGrpCd
   */
  public List<char[]> getHvHipaaGrpCd() throws CFException {
    List<char[]> list = new ArrayList<>();
    for (int index = 0; index < HV_HIPAA_GRP_CD_SIZE; index++) {
      list.add(getHvHipaaGrpCd(index));
    }
    return list;
  }
  /**
   * Returns the element at the specified position form the list.
   *
   * @param index
   * @return hvHipaaGrpCd
   */
  public char[] getHvHipaaGrpCd(int index) {
    if (index < 0) {
      logger.trace("Array index was {} for getHvHipaaGrpCd(), resetting it to 0", index);
      index = 0;
    } else if (index >= HV_HIPAA_GRP_CD_SIZE) {
      index = HV_HIPAA_GRP_CD_SIZE - 1; // can't exceed max array size
      logger.trace(
          "hvHipaaGrpCd - Array index exceeded max Size {}, resetting it to max allowed",
          HV_HIPAA_GRP_CD_SIZE);
    }
    return getCharArray((beginHvHipaaGrpCd + index * HV_HIPAA_GRP_CD_LEN), HV_HIPAA_GRP_CD_LEN);
  }

  public int hvHipaaGrpCdFieldLength() {
    return HV_HIPAA_GRP_CD_LEN;
  }

  /**
   * Update HvHipaaGrpCd with the passed value at a given index Corresponding COBOL Variable is
   * HV-HIPAA-GRP-CD
   *
   * @param index
   * @param value
   */
  public void setHvHipaaGrpCd(int index, char[] value) {
    setHvHipaaGrpCd(index, value, true);
  }

  /**
   * Update HvHipaaGrpCd with the passed value at a given index and serializes if setModified is
   * true
   *
   * @param index
   * @param value
   * @param setModified - used for serializing as String
   */
  private void setHvHipaaGrpCd(int index, char[] value, boolean setModified) {
    if (index < 0) {
      logger.trace(
          "Array index was {} for setHvHipaaGrpCd(int,String,boolean), reset it to 0", index);
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
      serializeHvHipaaGrpCd(index, value);
    }
  }

  /**
   * Returns the value of hvDataTyp Corresponding COBOL Variable is HV-DATA-TYP
   *
   * @return hvDataTyp
   */
  public List<Integer> getHvDataTyp() throws CFException {
    List<Integer> list = new ArrayList<>();
    for (int index = 0; index < HV_DATA_TYP_SIZE; index++) {
      list.add(getHvDataTyp(index));
    }
    return list;
  }
  /**
   * Returns the element at the specified position from the list
   *
   * @param index
   * @return hvDataTyp
   */
  public int getHvDataTyp(int index) {
    if (index < 0) {
      logger.trace("Array index was {} for getHvDataTyp(), resetting it to 0", index);
      index = 0;
    } else if (index >= HV_DATA_TYP_SIZE) {
      index = HV_DATA_TYP_SIZE - 1; // can't exceed max array size
      logger.trace(
          "hvDataTyp - Array index exceeded max Size {}, resetting it to max allowed",
          HV_DATA_TYP_SIZE);
    }
    return getInt(beginHvDataTyp + index * HV_DATA_TYP_LEN);
  }

  /**
   * Update HvDataTyp at index with the passed value Corresponding COBOL Variable is HV-DATA-TYP
   *
   * @param index
   * @param number
   */
  public void setHvDataTyp(int index, int number) {
    truncated = false; // reset left over truncated flag
    setHvDataTyp(index, number, true);
  }

  public void setHvDataTyp(int index, long number) {
    setHvDataTyp(index, (int) number, true);
  }

  /**
   * Update HvDataTyp at index with the passed value and serialize the object if setModified is true
   *
   * @param index
   * @param value
   * @param setModified
   */
  private void setHvDataTyp(int index, int value, boolean setModified) {
    if (index < 0) {
      logger.trace(
          "Array index was {} for setHvDataTyp(int, String, boolean), resetting it to 0", index);
      index = 0;
    } else if (index >= HV_DATA_TYP_SIZE) {
      index = HV_DATA_TYP_SIZE - 1; // can't exceed max array size
      logger.trace(
          "hvDataTyp - Array index exceeded max Size "
              + HV_DATA_TYP_SIZE
              + ", resetting it to max allowed");
    }
    //
    //
    if (setModified) {
      serializeHvDataTyp(index, value);
    }
  }
  /**
   * Returns the value of hvKeyCnt Corresponding COBOL Variable is HV-KEY-CNT
   *
   * @return hvKeyCnt
   */
  public List<Integer> getHvKeyCnt() throws CFException {
    List<Integer> list = new ArrayList<>();
    for (int index = 0; index < HV_KEY_CNT_SIZE; index++) {
      list.add(getHvKeyCnt(index));
    }
    return list;
  }
  /**
   * Returns the element at the specified position from the list
   *
   * @param index
   * @return hvKeyCnt
   */
  public int getHvKeyCnt(int index) {
    if (index < 0) {
      logger.trace("Array index was {} for getHvKeyCnt(), resetting it to 0", index);
      index = 0;
    } else if (index >= HV_KEY_CNT_SIZE) {
      index = HV_KEY_CNT_SIZE - 1; // can't exceed max array size
      logger.trace(
          "hvKeyCnt - Array index exceeded max Size {}, resetting it to max allowed",
          HV_KEY_CNT_SIZE);
    }
    return getInt(beginHvKeyCnt + index * HV_KEY_CNT_LEN);
  }

  /**
   * Update HvKeyCnt at index with the passed value Corresponding COBOL Variable is HV-KEY-CNT
   *
   * @param index
   * @param number
   */
  public void setHvKeyCnt(int index, int number) {
    truncated = false; // reset left over truncated flag
    setHvKeyCnt(index, number, true);
  }

  public void setHvKeyCnt(int index, long number) {
    setHvKeyCnt(index, (int) number, true);
  }

  /**
   * Update HvKeyCnt at index with the passed value and serialize the object if setModified is true
   *
   * @param index
   * @param value
   * @param setModified
   */
  private void setHvKeyCnt(int index, int value, boolean setModified) {
    if (index < 0) {
      logger.trace(
          "Array index was {} for setHvKeyCnt(int, String, boolean), resetting it to 0", index);
      index = 0;
    } else if (index >= HV_KEY_CNT_SIZE) {
      index = HV_KEY_CNT_SIZE - 1; // can't exceed max array size
      logger.trace(
          "hvKeyCnt - Array index exceeded max Size "
              + HV_KEY_CNT_SIZE
              + ", resetting it to max allowed");
    }
    //
    //
    if (setModified) {
      serializeHvKeyCnt(index, value);
    }
  }
  /**
   * Returns the value of hvDataCnt Corresponding COBOL Variable is HV-DATA-CNT
   *
   * @return hvDataCnt
   */
  public List<Integer> getHvDataCnt() throws CFException {
    List<Integer> list = new ArrayList<>();
    for (int index = 0; index < HV_DATA_CNT_SIZE; index++) {
      list.add(getHvDataCnt(index));
    }
    return list;
  }
  /**
   * Returns the element at the specified position from the list
   *
   * @param index
   * @return hvDataCnt
   */
  public int getHvDataCnt(int index) {
    if (index < 0) {
      logger.trace("Array index was {} for getHvDataCnt(), resetting it to 0", index);
      index = 0;
    } else if (index >= HV_DATA_CNT_SIZE) {
      index = HV_DATA_CNT_SIZE - 1; // can't exceed max array size
      logger.trace(
          "hvDataCnt - Array index exceeded max Size {}, resetting it to max allowed",
          HV_DATA_CNT_SIZE);
    }
    return getInt(beginHvDataCnt + index * HV_DATA_CNT_LEN);
  }

  /**
   * Update HvDataCnt at index with the passed value Corresponding COBOL Variable is HV-DATA-CNT
   *
   * @param index
   * @param number
   */
  public void setHvDataCnt(int index, int number) {
    truncated = false; // reset left over truncated flag
    setHvDataCnt(index, number, true);
  }

  public void setHvDataCnt(int index, long number) {
    setHvDataCnt(index, (int) number, true);
  }

  /**
   * Update HvDataCnt at index with the passed value and serialize the object if setModified is true
   *
   * @param index
   * @param value
   * @param setModified
   */
  private void setHvDataCnt(int index, int value, boolean setModified) {
    if (index < 0) {
      logger.trace(
          "Array index was {} for setHvDataCnt(int, String, boolean), resetting it to 0", index);
      index = 0;
    } else if (index >= HV_DATA_CNT_SIZE) {
      index = HV_DATA_CNT_SIZE - 1; // can't exceed max array size
      logger.trace(
          "hvDataCnt - Array index exceeded max Size "
              + HV_DATA_CNT_SIZE
              + ", resetting it to max allowed");
    }
    //
    //
    if (setModified) {
      serializeHvDataCnt(index, value);
    }
  }

  /**
   * initializes HostVarArrayArea String fields defaults to Spaces short/int/long defaults to zero
   * BigDecimal defaults to BigDecimal.ZERO
   */
  public void initialize() {
    for (int index = 0; index < HV_QUERY_TYP_SIZE; index++) {
      setHvQueryTyp(index, 0);
    }
    for (int index = 0; index < HV_HIPAA_VER_NBR_SIZE; index++) {
      setHvHipaaVerNbr(index, CONSTANTS.SPACE);
    }
    for (int index = 0; index < HV_SORT_COL_1_SIZE; index++) {
      setHvSortCol1(index, CONSTANTS.SPACE_2);
    }
    for (int index = 0; index < HV_HIPAA_CD_SIZE; index++) {
      setHvHipaaCd(index, CONSTANTS.SPACE_2);
    }
    for (int index = 0; index < HV_GRNRC_RQST_CD_SIZE; index++) {
      setHvGrnrcRqstCd(index, CONSTANTS.SPACE);
    }
    for (int index = 0; index < HV_HIPAA_GRP_CD_SIZE; index++) {
      setHvHipaaGrpCd(index, CONSTANTS.SPACE_2);
    }
    for (int index = 0; index < HV_DATA_TYP_SIZE; index++) {
      setHvDataTyp(index, 0);
    }
    for (int index = 0; index < HV_KEY_CNT_SIZE; index++) {
      setHvKeyCnt(index, 0);
    }
    for (int index = 0; index < HV_DATA_CNT_SIZE; index++) {
      setHvDataCnt(index, 0);
    }
  }

  public static int getHostVarArrayAreaFieldLength() {
    return HOST_VAR_ARRAY_AREA_LENGTH;
  }
}
