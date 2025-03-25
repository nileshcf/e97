package com.cloudframe.app.dto.bbhsr002;

/**
 * The class ReqHsrHipaaList is used to handle fields declared in it
 *
 * @author CloudFrame Inc. created on 2025-03-25 at 08:29. using version 5.0.0.231
 */
import com.cloudframe.app.dto.serialize.bbhsr002.*;
import com.cloudframe.app.exception.CFException;
import java.util.ArrayList;
import java.util.List;

public class ReqHsrHipaaList extends ReqHsrHipaaListSerialized {

  private List<char[]> reqHipaaCdItem;

  /** Constructor for ReqHsrHipaaList */
  public ReqHsrHipaaList() {
    super();
    /*  set the parent of each child as this which are a group variable */
    /*  end of offset */
  }

  /**
   * Returns the value of reqHipaaCdItem Corresponding COBOL Variable is WS-REQ-HIPAA-CD-ITEM
   *
   * @return reqHipaaCdItem
   */
  public List<char[]> getReqHipaaCdItem() throws CFException {
    List<char[]> list = new ArrayList<>();
    for (int index = 0; index < REQ_HIPAA_CD_ITEM_SIZE; index++) {
      list.add(getReqHipaaCdItem(index));
    }
    return list;
  }
  /**
   * Returns the element at the specified position form the list.
   *
   * @param index
   * @return reqHipaaCdItem
   */
  public char[] getReqHipaaCdItem(int index) {
    if (index < 0) {
      logger.trace("Array index was {} for getReqHipaaCdItem(), resetting it to 0", index);
      index = 0;
    } else if (index >= REQ_HIPAA_CD_ITEM_SIZE) {
      index = REQ_HIPAA_CD_ITEM_SIZE - 1; // can't exceed max array size
      logger.trace(
          "reqHipaaCdItem - Array index exceeded max Size {}, resetting it to max allowed",
          REQ_HIPAA_CD_ITEM_SIZE);
    }
    return getCharArray(
        (beginReqHipaaCdItem + index * REQ_HIPAA_CD_ITEM_LEN), REQ_HIPAA_CD_ITEM_LEN);
  }

  public int reqHipaaCdItemFieldLength() {
    return REQ_HIPAA_CD_ITEM_LEN;
  }

  /**
   * Update ReqHipaaCdItem with the passed value at a given index Corresponding COBOL Variable is
   * WS-REQ-HIPAA-CD-ITEM
   *
   * @param index
   * @param value
   */
  public void setReqHipaaCdItem(int index, char[] value) {
    setReqHipaaCdItem(index, value, true);
  }

  /**
   * Update ReqHipaaCdItem with the passed value at a given index and serializes if setModified is
   * true
   *
   * @param index
   * @param value
   * @param setModified - used for serializing as String
   */
  private void setReqHipaaCdItem(int index, char[] value, boolean setModified) {
    if (index < 0) {
      logger.trace(
          "Array index was {} for setReqHipaaCdItem(int,String,boolean), reset it to 0", index);
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
      serializeReqHipaaCdItem(index, value);
    }
  }

  public static int getReqHsrHipaaListFieldLength() {
    return REQ_HSR_HIPAA_LIST_LENGTH;
  }
}
