package com.cloudframe.app.dto.d5427bhi;

/**
 * The class BhiTable is used to handle fields declared in it
 *
 * @author CloudFrame Inc. created on 2025-03-25 at 08:32. using version 5.0.0.231
 */
import com.cloudframe.app.dto.serialize.d5427bhi.*;
import java.util.*;

public class BhiTable extends BhiTableSerialized {

  private List<BhiDataArea> bhiDataArea = new ArrayList<>();

  /** Constructor for BhiTable */
  public BhiTable() {
    super();
    /*  set the parent of each child as this which are a group variable */
    for (int arrayIndex = 0; arrayIndex < BHI_DATA_AREA_SIZE; arrayIndex++) {
      bhiDataArea.add(
          new BhiDataArea(
              this, beginBhiDataArea + arrayIndex * BhiDataArea.getBhiDataAreaFieldLength()));
    }
    /*  end of offset */
  }

  /**
   * Returns the value of bhiDataArea Corresponding COBOL Variable is WS-BHI-DATA-AREA
   *
   * @return bhiDataArea
   */
  public List<BhiDataArea> getBhiDataArea() {
    return bhiDataArea;
  }

  /**
   * Returns the element at the specified position in this list.
   *
   * @param index
   * @return bhiDataArea
   */
  public BhiDataArea getBhiDataArea(int index) {
    if (index < 0) {
      logger.trace("Array index was {} for getBhiDataArea(), resetting it to 0", index);
      index = 0;
    } else if (index >= BHI_DATA_AREA_SIZE) {
      index = BHI_DATA_AREA_SIZE - 1; // can't exceed max array size
      logger.trace(
          "bhiDataArea - Array index exceeded max Size {}, resetting it to max allowed",
          BHI_DATA_AREA_SIZE);
    }
    if (index >= bhiDataArea.size()) {
      for (int fillIndex = bhiDataArea.size() - 1; fillIndex < index; fillIndex++) {
        bhiDataArea.add(null);
      }
      bhiDataArea.set(
          index,
          new BhiDataArea(
              this, beginBhiDataArea + index * BhiDataArea.getBhiDataAreaFieldLength()));
    }
    BhiDataArea value = bhiDataArea.get(index);
    if (value == null) {
      bhiDataArea.set(
          index,
          new BhiDataArea(
              this, beginBhiDataArea + index * BhiDataArea.getBhiDataAreaFieldLength()));
      value = bhiDataArea.get(index);
    }
    return value;
  }

  /**
   * Update BhiDataArea at index with the passed value Corresponding COBOL Variable is
   * WS-BHI-DATA-AREA
   *
   * @param index
   * @param value
   */
  public void setBhiDataArea(int index, char[] value) {
    getBhiDataArea(index).setString(value);
  }

  public static int getBhiTableFieldLength() {
    return BHI_TABLE_LENGTH;
  }
}
