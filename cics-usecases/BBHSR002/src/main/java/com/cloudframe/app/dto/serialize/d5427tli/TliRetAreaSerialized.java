package com.cloudframe.app.dto.serialize.d5427tli;

/**
 * The class TliRetAreaSerialized is used to define offsets in order to serialize in a fixed String
 *
 * @author CloudFrame Inc. created on 2025-03-25 at 08:32. using version 5.0.0.231
 */
import com.cloudframe.app.data.Field;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class TliRetAreaSerialized extends Field {

  protected Logger logger = LoggerFactory.getLogger(TliRetAreaSerialized.class);
  /*  Length of the field, if serialized as a String */
  protected static final int TLI_RET_AREA_LENGTH = 6;
  /*  offset of each of Child Fields when serialized as a String */
  protected int beginTliRetSlotTblId;

  /** Constructor for TliRetAreaSerialized */
  public TliRetAreaSerialized() {
    // TO-DO auto generated code
  }

  /**
   * Constructor for TliRetAreaSerialized. sets the parent value to the parent
   *
   * @param parent
   * @param begin
   */
  public TliRetAreaSerialized(Field parent, int begin) {
    setParent(parent, begin);
  }

  /**
   * sets parent for this TliRetAreaSerialized to the parent
   *
   * @param parent
   */
  @Override
  public void setParent(Field parent) {
    setParent(parent, 32); // serialize this field at offset 32 by default
  }

  /**
   * sets parent for this TliRetAreaSerialized to the parent and set the serialize offset to
   * parameter begin
   *
   * @param parent
   * @param begin - offset used when serializing this object to a String
   */
  public void setParent(Field parent, int begin) {
    super.setParent(parent);
    init(begin); // serialize this field at offset 32 by default
  }
  /** initializes the field in TliRetAreaSerialized */
  @Override
  protected void init(int begin) {
    setStartOffset(begin);
    setLength(TLI_RET_AREA_LENGTH);
    /*  set the offset/position of each field when this object is serialized as String */
    beginTliRetSlotTblId = getStartOffset() + 0; // set offset for serialization

    /*  end of offset */
  }

  int localTliRetSlotTblIdCounter = -1;

  public boolean isTliRetSlotTblIdModified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localTliRetSlotTblIdCounter != sharedCounter;
    localTliRetSlotTblIdCounter = sharedCounter;
    return hasModified;
  }

  protected static final int TLI_RET_SLOT_TBL_ID_LEN = 6;
  /** serialize this TliRetSlotTblId */
  protected void serializeTliRetSlotTblId(char[] tliRetSlotTblId) {
    shareString.getSerializedField().incrementCounter();
    arraycopy(tliRetSlotTblId, 0, getStringValue(), beginTliRetSlotTblId, TLI_RET_SLOT_TBL_ID_LEN);
    localTliRetSlotTblIdCounter = shareString.getSerializedField().getModifiedCounter();
  }

  protected char[] checkTliRetSlotTblIdConstraints(char[] value) {
    return super.checkConstraints(value, 6, false, false);
  }
  /**
   * refreshTliRetSlotTblId is used to refresh the latest value of a variable from the Serialized
   * String the most common reason to serialize an Object as a string in to write to a file. There
   * can be several other reasons for serialization as well
   */
  public char[] refreshTliRetSlotTblId() {
    return (substring(
        getStringValue(), beginTliRetSlotTblId, beginTliRetSlotTblId + TLI_RET_SLOT_TBL_ID_LEN));
  }
}
