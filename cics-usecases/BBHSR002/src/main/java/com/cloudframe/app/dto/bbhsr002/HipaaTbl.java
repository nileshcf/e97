package com.cloudframe.app.dto.bbhsr002;

/**
 * The class HipaaTbl is used to handle fields declared in it
 *
 * @author CloudFrame Inc. created on 2025-03-25 at 08:29. using version 5.0.0.231
 */
import com.cloudframe.app.dto.serialize.bbhsr002.*;
import java.util.*;

public class HipaaTbl extends HipaaTblSerialized {

  private List<HipaaCode> hipaaCode = new ArrayList<>();

  /** Constructor for HipaaTbl */
  public HipaaTbl() {
    super();
    /*  set the parent of each child as this which are a group variable */
    for (int arrayIndex = 0; arrayIndex < HIPAA_CODE_SIZE; arrayIndex++) {
      hipaaCode.add(
          new HipaaCode(this, beginHipaaCode + arrayIndex * HipaaCode.getHipaaCodeFieldLength()));
    }
    /*  end of offset */
  }

  /**
   * Returns the value of hipaaCode Corresponding COBOL Variable is WS-HIPAA-CODE
   *
   * @return hipaaCode
   */
  public List<HipaaCode> getHipaaCode() {
    return hipaaCode;
  }

  /**
   * Returns the element at the specified position in this list.
   *
   * @param index
   * @return hipaaCode
   */
  public HipaaCode getHipaaCode(int index) {
    if (index < 0) {
      logger.trace("Array index was {} for getHipaaCode(), resetting it to 0", index);
      index = 0;
    } else if (index >= HIPAA_CODE_SIZE) {
      index = HIPAA_CODE_SIZE - 1; // can't exceed max array size
      logger.trace(
          "hipaaCode - Array index exceeded max Size {}, resetting it to max allowed",
          HIPAA_CODE_SIZE);
    }
    if (index >= hipaaCode.size()) {
      for (int fillIndex = hipaaCode.size() - 1; fillIndex < index; fillIndex++) {
        hipaaCode.add(null);
      }
      hipaaCode.set(
          index, new HipaaCode(this, beginHipaaCode + index * HipaaCode.getHipaaCodeFieldLength()));
    }
    HipaaCode value = hipaaCode.get(index);
    if (value == null) {
      hipaaCode.set(
          index, new HipaaCode(this, beginHipaaCode + index * HipaaCode.getHipaaCodeFieldLength()));
      value = hipaaCode.get(index);
    }
    return value;
  }

  /**
   * Update HipaaCode at index with the passed value Corresponding COBOL Variable is WS-HIPAA-CODE
   *
   * @param index
   * @param value
   */
  public void setHipaaCode(int index, char[] value) {
    getHipaaCode(index).setString(value);
  }

  public static int getHipaaTblFieldLength() {
    return HIPAA_TBL_LENGTH;
  }
}
