package com.cloudframe.app.dto.bbhsr002;

/**
 * The class BhiRetArea is used to handle fields declared in it
 *
 * @author CloudFrame Inc. created on 2025-03-25 at 08:29. using version 5.0.0.231
 */
import com.cloudframe.app.data.Field;
import com.cloudframe.app.dto.serialize.bbhsr002.*;
import com.cloudframe.app.exception.CFException;
import java.util.*;
import java.util.ArrayList;
import java.util.List;

public class BhiRetArea extends BhiRetAreaSerialized {

  private int bhiRetBhiCnt;
  private List<BhiRetBhiData> bhiRetBhiData = new ArrayList<>();

  /** Constructor for BhiRetArea */
  public BhiRetArea() {
    // TO-DO auto generated code
  }

  /**
   * Constructor for BhiRetArea. sets the parent value to the parent
   *
   * @param parent
   * @param begin
   */
  public BhiRetArea(Field parent, int begin) {
    setParent(parent, begin);
  }

  /**
   * Returns the value of bhiRetBhiCnt
   *
   * @return bhiRetBhiCnt
   */
  public int getBhiRetBhiCnt() throws CFException {
    if (isBhiRetBhiCntModified()) {
      bhiRetBhiCnt = refreshBhiRetBhiCnt();
    }
    return bhiRetBhiCnt;
  }

  /**
   * Update BhiRetBhiCnt with the passed value Corresponding COBOL Variable is BHI-RET-BHI-CNT
   *
   * @param number
   */
  public void setBhiRetBhiCnt(int number) {
    // Truncate if the number is beyond +/- Max range
    bhiRetBhiCnt = checkBhiRetBhiCntMaxLimit(number);
    serializeBhiRetBhiCnt(bhiRetBhiCnt);
  }

  public void setBhiRetBhiCnt(long number) {
    number = checkBhiRetBhiCntMaxLimit(number); // Truncate if value is beyond +/- Max range
    setBhiRetBhiCnt((int) number);
  }

  /**
   * Update BhiRetBhiCnt with the passed value
   *
   * @param value (String or char[])
   */
  public void setBhiRetBhiCnt(char[] value) throws CFException {
    bhiRetBhiCnt = serializeBhiRetBhiCnt(value);
  }
  /**
   * Update BhiRetBhiCnt with the passed value
   *
   * @param value (String or char[])
   */
  public void setBhiRetBhiCntString(char[] value) throws CFException {
    setBhiRetBhiCnt(value);
  }
  /**
   * Returns the value of bhiRetBhiData Corresponding COBOL Variable is BHI-RET-BHI-DATA
   *
   * @return bhiRetBhiData
   */
  public List<BhiRetBhiData> getBhiRetBhiData() {
    return bhiRetBhiData;
  }

  /**
   * Returns the element at the specified position in this list.
   *
   * @param index
   * @return bhiRetBhiData
   */
  public BhiRetBhiData getBhiRetBhiData(int index) {
    if (index < 0) {
      logger.trace("Array index was {} for getBhiRetBhiData(), resetting it to 0", index);
      index = 0;
    } else if (index >= BHI_RET_BHI_DATA_SIZE) {
      index = BHI_RET_BHI_DATA_SIZE - 1; // can't exceed max array size
      logger.trace(
          "bhiRetBhiData - Array index exceeded max Size {}, resetting it to max allowed",
          BHI_RET_BHI_DATA_SIZE);
    }
    if (index >= bhiRetBhiData.size()) {
      for (int fillIndex = bhiRetBhiData.size() - 1; fillIndex < index; fillIndex++) {
        bhiRetBhiData.add(null);
      }
      bhiRetBhiData.set(
          index,
          new BhiRetBhiData(
              this, beginBhiRetBhiData + index * BhiRetBhiData.getBhiRetBhiDataFieldLength()));
    }
    BhiRetBhiData value = bhiRetBhiData.get(index);
    if (value == null) {
      bhiRetBhiData.set(
          index,
          new BhiRetBhiData(
              this, beginBhiRetBhiData + index * BhiRetBhiData.getBhiRetBhiDataFieldLength()));
      value = bhiRetBhiData.get(index);
    }
    return value;
  }

  /**
   * Update BhiRetBhiData at index with the passed value Corresponding COBOL Variable is
   * BHI-RET-BHI-DATA
   *
   * @param index
   * @param value
   */
  public void setBhiRetBhiData(int index, char[] value) {
    getBhiRetBhiData(index).setString(value);
  }

  /**
   * initializes BhiRetArea String fields defaults to Spaces short/int/long defaults to zero
   * BigDecimal defaults to BigDecimal.ZERO
   */
  public void initialize() {
    setBhiRetBhiCnt(0);
    if (bhiRetBhiData.isEmpty()) {
      // fill the Array to the full capacity
      for (int index = 0; index < BHI_RET_BHI_DATA_SIZE; index++) {
        BhiRetBhiData newElement =
            new BhiRetBhiData(
                this, beginBhiRetBhiData + index * BhiRetBhiData.getBhiRetBhiDataFieldLength());
        newElement.initialize();
        bhiRetBhiData.add(newElement);
      }
    } else {
      if (bhiRetBhiData.size() < BHI_RET_BHI_DATA_SIZE) {
        // prefill it first
        for (int index = bhiRetBhiData.size(); index < BHI_RET_BHI_DATA_SIZE; index++) {
          BhiRetBhiData newElement =
              new BhiRetBhiData(
                  this, beginBhiRetBhiData + index * BhiRetBhiData.getBhiRetBhiDataFieldLength());
          bhiRetBhiData.add(newElement);
        }
      }

      for (int index = 0; index < BHI_RET_BHI_DATA_SIZE; index++) {
        BhiRetBhiData bhiRetBhiDataVar = bhiRetBhiData.get(index);
        if (bhiRetBhiDataVar == null) {
          bhiRetBhiDataVar =
              new BhiRetBhiData(
                  this, beginBhiRetBhiData + index * BhiRetBhiData.getBhiRetBhiDataFieldLength());
          bhiRetBhiData.set(index, bhiRetBhiDataVar);
        }
        bhiRetBhiDataVar.initialize();
      }
    }
  }

  public static int getBhiRetAreaFieldLength() {
    return BHI_RET_AREA_LENGTH;
  }
}
