package com.cloudframe.app.dto.bbhsr002;

/**
 * The class FmaEntryTable is used to handle fields declared in it
 *
 * @author CloudFrame Inc. created on 2025-03-25 at 08:29. using version 5.0.0.231
 */
import com.cloudframe.app.data.Field;
import com.cloudframe.app.dto.serialize.bbhsr002.*;
import java.util.*;
import java.util.ArrayList;
import java.util.List;

public class FmaEntryTable extends FmaEntryTableSerialized {

  private List<FmaEntry> fmaEntry = new ArrayList<>();

  /** Constructor for FmaEntryTable */
  public FmaEntryTable() {
    // TO-DO auto generated code
  }

  /**
   * Constructor for FmaEntryTable. sets the parent value to the parent
   *
   * @param parent
   * @param begin
   */
  public FmaEntryTable(Field parent, int begin) {
    setParent(parent, begin);
  }

  /**
   * Returns the value of fmaEntry Corresponding COBOL Variable is FMA-ENTRY
   *
   * @return fmaEntry
   */
  public List<FmaEntry> getFmaEntry() {
    return fmaEntry;
  }

  /**
   * Returns the element at the specified position in this list.
   *
   * @param index
   * @return fmaEntry
   */
  public FmaEntry getFmaEntry(int index) {
    if (index < 0) {
      logger.trace("Array index was {} for getFmaEntry(), resetting it to 0", index);
      index = 0;
    } else if (index >= FMA_ENTRY_SIZE) {
      index = FMA_ENTRY_SIZE - 1; // can't exceed max array size
      logger.trace(
          "fmaEntry - Array index exceeded max Size {}, resetting it to max allowed",
          FMA_ENTRY_SIZE);
    }
    if (index >= fmaEntry.size()) {
      for (int fillIndex = fmaEntry.size() - 1; fillIndex < index; fillIndex++) {
        fmaEntry.add(null);
      }
      fmaEntry.set(
          index, new FmaEntry(this, beginFmaEntry + index * FmaEntry.getFmaEntryFieldLength()));
    }
    FmaEntry value = fmaEntry.get(index);
    if (value == null) {
      fmaEntry.set(
          index, new FmaEntry(this, beginFmaEntry + index * FmaEntry.getFmaEntryFieldLength()));
      value = fmaEntry.get(index);
    }
    return value;
  }

  /**
   * Update FmaEntry at index with the passed value Corresponding COBOL Variable is FMA-ENTRY
   *
   * @param index
   * @param value
   */
  public void setFmaEntry(int index, char[] value) {
    getFmaEntry(index).setString(value);
  }

  /**
   * initializes FmaEntryTable String fields defaults to Spaces short/int/long defaults to zero
   * BigDecimal defaults to BigDecimal.ZERO
   */
  public void initialize() {
    if (fmaEntry.isEmpty()) {
      // fill the Array to the full capacity
      for (int index = 0; index < FMA_ENTRY_SIZE; index++) {
        FmaEntry newElement =
            new FmaEntry(this, beginFmaEntry + index * FmaEntry.getFmaEntryFieldLength());
        newElement.initialize();
        fmaEntry.add(newElement);
      }
    } else {
      if (fmaEntry.size() < FMA_ENTRY_SIZE) {
        // prefill it first
        for (int index = fmaEntry.size(); index < FMA_ENTRY_SIZE; index++) {
          FmaEntry newElement =
              new FmaEntry(this, beginFmaEntry + index * FmaEntry.getFmaEntryFieldLength());
          fmaEntry.add(newElement);
        }
      }

      for (int index = 0; index < FMA_ENTRY_SIZE; index++) {
        FmaEntry fmaEntryVar = fmaEntry.get(index);
        if (fmaEntryVar == null) {
          fmaEntryVar =
              new FmaEntry(this, beginFmaEntry + index * FmaEntry.getFmaEntryFieldLength());
          fmaEntry.set(index, fmaEntryVar);
        }
        fmaEntryVar.initialize();
      }
    }
  }

  public static int getFmaEntryTableFieldLength() {
    return FMA_ENTRY_TABLE_LENGTH;
  }
}
