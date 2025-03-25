package com.cloudframe.app.dto.bbhsr002;

/**
 * The class ReqAddressAreaTbl is used to handle fields declared in it
 *
 * @author CloudFrame Inc. created on 2025-03-25 at 08:29. using version 5.0.0.231
 */
import com.cloudframe.app.data.Field;
import com.cloudframe.app.dto.serialize.bbhsr002.*;
import java.util.*;

public class ReqAddressAreaTbl extends ReqAddressAreaTblSerialized {

  private List<ReqAddressTbl> reqAddressTbl = new ArrayList<>();

  /** Constructor for ReqAddressAreaTbl */
  public ReqAddressAreaTbl() {
    // TO-DO auto generated code
  }

  /**
   * Constructor for ReqAddressAreaTbl. sets the parent value to the parent
   *
   * @param parent
   * @param begin
   */
  public ReqAddressAreaTbl(Field parent, int begin) {
    setParent(parent, begin);
  }

  /**
   * Returns the value of reqAddressTbl Corresponding COBOL Variable is REQ-ADDRESS-TBL
   *
   * @return reqAddressTbl
   */
  public List<ReqAddressTbl> getReqAddressTbl() {
    return reqAddressTbl;
  }

  /**
   * Returns the element at the specified position in this list.
   *
   * @param index
   * @return reqAddressTbl
   */
  public ReqAddressTbl getReqAddressTbl(int index) {
    if (index < 0) {
      logger.trace("Array index was {} for getReqAddressTbl(), resetting it to 0", index);
      index = 0;
    } else if (index >= REQ_ADDRESS_TBL_SIZE) {
      index = REQ_ADDRESS_TBL_SIZE - 1; // can't exceed max array size
      logger.trace(
          "reqAddressTbl - Array index exceeded max Size {}, resetting it to max allowed",
          REQ_ADDRESS_TBL_SIZE);
    }
    if (index >= reqAddressTbl.size()) {
      for (int fillIndex = reqAddressTbl.size() - 1; fillIndex < index; fillIndex++) {
        reqAddressTbl.add(null);
      }
      reqAddressTbl.set(
          index,
          new ReqAddressTbl(
              this, beginReqAddressTbl + index * ReqAddressTbl.getReqAddressTblFieldLength()));
    }
    ReqAddressTbl value = reqAddressTbl.get(index);
    if (value == null) {
      reqAddressTbl.set(
          index,
          new ReqAddressTbl(
              this, beginReqAddressTbl + index * ReqAddressTbl.getReqAddressTblFieldLength()));
      value = reqAddressTbl.get(index);
    }
    return value;
  }

  /**
   * Update ReqAddressTbl at index with the passed value Corresponding COBOL Variable is
   * REQ-ADDRESS-TBL
   *
   * @param index
   * @param value
   */
  public void setReqAddressTbl(int index, char[] value) {
    getReqAddressTbl(index).setString(value);
  }

  public static int getReqAddressAreaTblFieldLength() {
    return REQ_ADDRESS_AREA_TBL_LENGTH;
  }
}
