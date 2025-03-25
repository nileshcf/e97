package com.cloudframe.app.dto.d5427pol;

/**
 * The class Pol9RetArea9 is used to handle fields declared in it
 *
 * @author CloudFrame Inc. created on 2025-03-25 at 08:31. using version 5.0.0.231
 */
import com.cloudframe.app.data.Field;
import com.cloudframe.app.dto.serialize.d5427pol.*;
import com.cloudframe.app.exception.CFException;
import java.util.*;

public class Pol9RetArea9 extends Pol9RetArea9Serialized {

  private int pol9CombHabRehabCnt;
  private List<Pol9RetData> pol9RetData = new ArrayList<>();

  /** Constructor for Pol9RetArea9 */
  public Pol9RetArea9() {
    // TO-DO auto generated code
  }

  /**
   * Constructor for Pol9RetArea9. sets the parent value to the parent
   *
   * @param parent
   * @param begin
   */
  public Pol9RetArea9(Field parent, int begin) {
    setParent(parent, begin);
  }

  /**
   * Returns the value of pol9CombHabRehabCnt
   *
   * @return pol9CombHabRehabCnt
   */
  public int getPol9CombHabRehabCnt() throws CFException {
    if (isPol9CombHabRehabCntModified()) {
      pol9CombHabRehabCnt = refreshPol9CombHabRehabCnt();
    }
    return pol9CombHabRehabCnt;
  }

  /**
   * Update Pol9CombHabRehabCnt with the passed value Corresponding COBOL Variable is
   * POL9-COMB-HAB-REHAB-CNT
   *
   * @param number
   */
  public void setPol9CombHabRehabCnt(int number) {
    // Truncate if the number is beyond +/- Max range
    pol9CombHabRehabCnt = checkPol9CombHabRehabCntMaxLimit(number);
    serializePol9CombHabRehabCnt(pol9CombHabRehabCnt);
  }

  public void setPol9CombHabRehabCnt(long number) {
    number = checkPol9CombHabRehabCntMaxLimit(number); // Truncate if value is beyond +/- Max range
    setPol9CombHabRehabCnt((int) number);
  }

  /**
   * Update Pol9CombHabRehabCnt with the passed value
   *
   * @param value (String or char[])
   */
  public void setPol9CombHabRehabCnt(char[] value) throws CFException {
    pol9CombHabRehabCnt = serializePol9CombHabRehabCnt(value);
  }
  /**
   * Update Pol9CombHabRehabCnt with the passed value
   *
   * @param value (String or char[])
   */
  public void setPol9CombHabRehabCntString(char[] value) throws CFException {
    setPol9CombHabRehabCnt(value);
  }
  /**
   * Returns the value of pol9RetData Corresponding COBOL Variable is POL9-RET-DATA
   *
   * @return pol9RetData
   */
  public List<Pol9RetData> getPol9RetData() {
    return pol9RetData;
  }

  /**
   * Returns the element at the specified position in this list.
   *
   * @param index
   * @return pol9RetData
   */
  public Pol9RetData getPol9RetData(int index) {
    if (index < 0) {
      logger.trace("Array index was {} for getPol9RetData(), resetting it to 0", index);
      index = 0;
    } else if (index >= POL_9_RET_DATA_SIZE) {
      index = POL_9_RET_DATA_SIZE - 1; // can't exceed max array size
      logger.trace(
          "pol9RetData - Array index exceeded max Size {}, resetting it to max allowed",
          POL_9_RET_DATA_SIZE);
    }
    if (index >= pol9RetData.size()) {
      for (int fillIndex = pol9RetData.size() - 1; fillIndex < index; fillIndex++) {
        pol9RetData.add(null);
      }
      pol9RetData.set(
          index,
          new Pol9RetData(
              this, beginPol9RetData + index * Pol9RetData.getPol9RetDataFieldLength()));
    }
    Pol9RetData value = pol9RetData.get(index);
    if (value == null) {
      pol9RetData.set(
          index,
          new Pol9RetData(
              this, beginPol9RetData + index * Pol9RetData.getPol9RetDataFieldLength()));
      value = pol9RetData.get(index);
    }
    return value;
  }

  /**
   * Update Pol9RetData at index with the passed value Corresponding COBOL Variable is POL9-RET-DATA
   *
   * @param index
   * @param value
   */
  public void setPol9RetData(int index, char[] value) {
    getPol9RetData(index).setString(value);
  }

  public static int getPol9RetArea9FieldLength() {
    return POL_9_RET_AREA_9_LENGTH;
  }
}
