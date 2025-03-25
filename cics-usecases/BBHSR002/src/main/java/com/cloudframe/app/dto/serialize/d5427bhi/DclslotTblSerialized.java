package com.cloudframe.app.dto.serialize.d5427bhi;

/**
 * The class DclslotTblSerialized is used to define offsets in order to serialize in a fixed String
 *
 * @author CloudFrame Inc. created on 2025-03-25 at 08:32. using version 5.0.0.231
 */
import com.cloudframe.app.data.Field;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class DclslotTblSerialized extends Field {

  protected Logger logger = LoggerFactory.getLogger(DclslotTblSerialized.class);
  /*  Length of the field, if serialized as a String */
  protected static final int DCLSLOT_TBL_LENGTH = 110;
  /*  offset of each of Child Fields when serialized as a String */
  protected int beginHdrSlotTblId;

  /** Constructor for DclslotTblSerialized */
  public DclslotTblSerialized() {
    init(0);
  }

  /** initializes the field in DclslotTblSerialized */
  @Override
  protected void init(int begin) {
    setStartOffset(begin);
    setLength(DCLSLOT_TBL_LENGTH);
    /*  set the offset/position of each field when this object is serialized as String */
    beginHdrSlotTblId = getStartOffset() + 0; // set offset for serialization

    /*  end of offset */
  }

  int localHdrSlotTblIdCounter = -1;

  public boolean isHdrSlotTblIdModified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localHdrSlotTblIdCounter != sharedCounter;
    localHdrSlotTblIdCounter = sharedCounter;
    return hasModified;
  }

  protected static final int HDR_SLOT_TBL_ID_LEN = 6;
  /** serialize this HdrSlotTblId */
  protected void serializeHdrSlotTblId(char[] hdrSlotTblId) {
    shareString.getSerializedField().incrementCounter();
    arraycopy(hdrSlotTblId, 0, getStringValue(), beginHdrSlotTblId, HDR_SLOT_TBL_ID_LEN);
    localHdrSlotTblIdCounter = shareString.getSerializedField().getModifiedCounter();
  }

  protected char[] checkHdrSlotTblIdConstraints(char[] value) {
    return super.checkConstraints(value, 6, false, false);
  }
  /**
   * refreshHdrSlotTblId is used to refresh the latest value of a variable from the Serialized
   * String the most common reason to serialize an Object as a string in to write to a file. There
   * can be several other reasons for serialization as well
   */
  public char[] refreshHdrSlotTblId() {
    return (substring(
        getStringValue(), beginHdrSlotTblId, beginHdrSlotTblId + HDR_SLOT_TBL_ID_LEN));
  }
}
