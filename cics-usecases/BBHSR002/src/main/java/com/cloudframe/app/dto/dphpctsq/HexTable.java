package com.cloudframe.app.dto.dphpctsq;

/**
 * The class HexTable is used to handle fields declared in it
 *
 * @author CloudFrame Inc. created on 2025-03-25 at 08:30. using version 5.0.0.231
 */
import com.cloudframe.app.data.Field;
import com.cloudframe.app.dto.serialize.dphpctsq.*;
import com.cloudframe.app.exception.CFException;
import java.util.ArrayList;
import java.util.List;

public class HexTable extends HexTableSerialized {

  private List<Short> hexRemainder;

  /** Constructor for HexTable */
  public HexTable() {
    // TO-DO auto generated code
  }

  /**
   * Constructor for HexTable. sets the parent value to the parent
   *
   * @param parent
   * @param begin
   */
  public HexTable(Field parent, int begin) {
    setParent(parent, begin);
  }

  /**
   * Returns the value of hexRemainder Corresponding COBOL Variable is HEX-REMAINDER
   *
   * @return hexRemainder
   */
  public List<Short> getHexRemainder() throws CFException {
    List<Short> list = new ArrayList<>();
    for (int index = 0; index < HEX_REMAINDER_SIZE; index++) {
      list.add(getHexRemainder(index));
    }
    return list;
  }
  /**
   * Returns the element at the specified position from the list
   *
   * @param index
   * @return hexRemainder
   */
  public short getHexRemainder(int index) {
    if (index < 0) {
      logger.trace("Array index was {} for getHexRemainder(), resetting it to 0", index);
      index = 0;
    } else if (index >= HEX_REMAINDER_SIZE) {
      index = HEX_REMAINDER_SIZE - 1; // can't exceed max array size
      logger.trace(
          "hexRemainder - Array index exceeded max Size {}, resetting it to max allowed",
          HEX_REMAINDER_SIZE);
    }
    return getShort(beginHexRemainder + index * HEX_REMAINDER_LEN);
  }

  /**
   * Update HexRemainder at index with the passed value Corresponding COBOL Variable is
   * HEX-REMAINDER
   *
   * @param index
   * @param number
   */
  public void setHexRemainder(int index, short number) {
    truncated = false; // reset left over truncated flag
    setHexRemainder(index, number, true);
  }

  public void setHexRemainder(int index, int number) {
    setHexRemainder(index, (short) number, true);
  }

  public void setHexRemainder(int index, long number) {
    setHexRemainder(index, (short) number, true);
  }

  /**
   * Update HexRemainder at index with the passed value and serialize the object if setModified is
   * true
   *
   * @param index
   * @param value
   * @param setModified
   */
  private void setHexRemainder(int index, short value, boolean setModified) {
    if (index < 0) {
      logger.trace(
          "Array index was {} for setHexRemainder(int, String, boolean), resetting it to 0", index);
      index = 0;
    } else if (index >= HEX_REMAINDER_SIZE) {
      index = HEX_REMAINDER_SIZE - 1; // can't exceed max array size
      logger.trace(
          "hexRemainder - Array index exceeded max Size "
              + HEX_REMAINDER_SIZE
              + ", resetting it to max allowed");
    }
    //
    //
    if (setModified) {
      serializeHexRemainder(index, value);
    }
  }

  public static int getHexTableFieldLength() {
    return HEX_TABLE_LENGTH;
  }
}
