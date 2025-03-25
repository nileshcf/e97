package com.cloudframe.app.dto.d5427hpc;

/**
 * The class HipaaCodeList is used to handle fields declared in it
 *
 * @author CloudFrame Inc. created on 2025-03-25 at 08:29. using version 5.0.0.231
 */
import com.cloudframe.app.dto.serialize.d5427hpc.*;
import com.cloudframe.app.exception.CFException;
import java.util.ArrayList;
import java.util.List;

public class HipaaCodeList extends HipaaCodeListSerialized {

  private List<char[]> hipaaCodeItem;

  /** Constructor for HipaaCodeList */
  public HipaaCodeList() {
    super();
    /*  set the parent of each child as this which are a group variable */
    /*  end of offset */
  }

  /**
   * Returns the value of hipaaCodeItem Corresponding COBOL Variable is HIPAA-CODE-ITEM
   *
   * @return hipaaCodeItem
   */
  public List<char[]> getHipaaCodeItem() throws CFException {
    List<char[]> list = new ArrayList<>();
    for (int index = 0; index < HIPAA_CODE_ITEM_SIZE; index++) {
      list.add(getHipaaCodeItem(index));
    }
    return list;
  }
  /**
   * Returns the element at the specified position form the list.
   *
   * @param index
   * @return hipaaCodeItem
   */
  public char[] getHipaaCodeItem(int index) {
    if (index < 0) {
      logger.trace("Array index was {} for getHipaaCodeItem(), resetting it to 0", index);
      index = 0;
    } else if (index >= HIPAA_CODE_ITEM_SIZE) {
      index = HIPAA_CODE_ITEM_SIZE - 1; // can't exceed max array size
      logger.trace(
          "hipaaCodeItem - Array index exceeded max Size {}, resetting it to max allowed",
          HIPAA_CODE_ITEM_SIZE);
    }
    return getCharArray((beginHipaaCodeItem + index * HIPAA_CODE_ITEM_LEN), HIPAA_CODE_ITEM_LEN);
  }

  public int hipaaCodeItemFieldLength() {
    return HIPAA_CODE_ITEM_LEN;
  }

  /**
   * Update HipaaCodeItem with the passed value at a given index Corresponding COBOL Variable is
   * HIPAA-CODE-ITEM
   *
   * @param index
   * @param value
   */
  public void setHipaaCodeItem(int index, char[] value) {
    setHipaaCodeItem(index, value, true);
  }

  /**
   * Update HipaaCodeItem with the passed value at a given index and serializes if setModified is
   * true
   *
   * @param index
   * @param value
   * @param setModified - used for serializing as String
   */
  private void setHipaaCodeItem(int index, char[] value, boolean setModified) {
    if (index < 0) {
      logger.trace(
          "Array index was {} for setHipaaCodeItem(int,String,boolean), reset it to 0", index);
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
      serializeHipaaCodeItem(index, value);
    }
  }

  public static int getHipaaCodeListFieldLength() {
    return HIPAA_CODE_LIST_LENGTH;
  }
}
