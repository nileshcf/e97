package com.cloudframe.app.dto.serialize.bbhsr002;

/**
 * The class BhiReqAreaSerialized is used to define offsets in order to serialize in a fixed String
 *
 * @author CloudFrame Inc. created on 2025-03-25 at 08:29. using version 5.0.0.231
 */
import com.cloudframe.app.data.Field;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class BhiReqAreaSerialized extends Field {

  protected Logger logger = LoggerFactory.getLogger(BhiReqAreaSerialized.class);
  /*  Length of the field, if serialized as a String */
  protected static final int BHI_REQ_AREA_LENGTH = 28;
  /*  offset of each of Child Fields when serialized as a String */
  protected int beginBhiReqHipaaCode;
  protected int beginBhiReqSlotTable;
  protected int beginBhiReqEffectDate;
  protected int beginBhiReqCancelDate;

  /** Constructor for BhiReqAreaSerialized */
  public BhiReqAreaSerialized() {
    // TO-DO auto generated code
  }

  /**
   * Constructor for BhiReqAreaSerialized. sets the parent value to the parent
   *
   * @param parent
   * @param begin
   */
  public BhiReqAreaSerialized(Field parent, int begin) {
    setParent(parent, begin);
  }

  /**
   * sets parent for this BhiReqAreaSerialized to the parent
   *
   * @param parent
   */
  @Override
  public void setParent(Field parent) {
    setParent(parent, 0); // serialize this field at offset 0 by default
  }

  /**
   * sets parent for this BhiReqAreaSerialized to the parent and set the serialize offset to
   * parameter begin
   *
   * @param parent
   * @param begin - offset used when serializing this object to a String
   */
  public void setParent(Field parent, int begin) {
    super.setParent(parent);
    init(begin); // serialize this field at offset 0 by default
  }
  /** initializes the field in BhiReqAreaSerialized */
  @Override
  protected void init(int begin) {
    setStartOffset(begin);
    setLength(BHI_REQ_AREA_LENGTH);
    /*  set the offset/position of each field when this object is serialized as String */
    beginBhiReqHipaaCode = getStartOffset() + 0; // set offset for serialization

    beginBhiReqSlotTable = getStartOffset() + 2; // set offset for serialization

    beginBhiReqEffectDate = getStartOffset() + 8; // set offset for serialization

    beginBhiReqCancelDate = getStartOffset() + 18; // set offset for serialization

    /*  end of offset */
  }

  int localBhiReqHipaaCodeCounter = -1;

  public boolean isBhiReqHipaaCodeModified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localBhiReqHipaaCodeCounter != sharedCounter;
    localBhiReqHipaaCodeCounter = sharedCounter;
    return hasModified;
  }

  protected static final int BHI_REQ_HIPAA_CODE_LEN = 2;
  /** serialize this BhiReqHipaaCode */
  protected void serializeBhiReqHipaaCode(char[] bhiReqHipaaCode) {
    shareString.getSerializedField().incrementCounter();
    arraycopy(bhiReqHipaaCode, 0, getStringValue(), beginBhiReqHipaaCode, BHI_REQ_HIPAA_CODE_LEN);
    localBhiReqHipaaCodeCounter = shareString.getSerializedField().getModifiedCounter();
  }

  protected char[] checkBhiReqHipaaCodeConstraints(char[] value) {
    return super.checkConstraints(value, 2, false, false);
  }
  /**
   * refreshBhiReqHipaaCode is used to refresh the latest value of a variable from the Serialized
   * String the most common reason to serialize an Object as a string in to write to a file. There
   * can be several other reasons for serialization as well
   */
  public char[] refreshBhiReqHipaaCode() {
    return (substring(
        getStringValue(), beginBhiReqHipaaCode, beginBhiReqHipaaCode + BHI_REQ_HIPAA_CODE_LEN));
  }

  int localBhiReqSlotTableCounter = -1;

  public boolean isBhiReqSlotTableModified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localBhiReqSlotTableCounter != sharedCounter;
    localBhiReqSlotTableCounter = sharedCounter;
    return hasModified;
  }

  protected static final int BHI_REQ_SLOT_TABLE_LEN = 6;
  /** serialize this BhiReqSlotTable */
  protected void serializeBhiReqSlotTable(char[] bhiReqSlotTable) {
    shareString.getSerializedField().incrementCounter();
    arraycopy(bhiReqSlotTable, 0, getStringValue(), beginBhiReqSlotTable, BHI_REQ_SLOT_TABLE_LEN);
    localBhiReqSlotTableCounter = shareString.getSerializedField().getModifiedCounter();
  }

  protected char[] checkBhiReqSlotTableConstraints(char[] value) {
    return super.checkConstraints(value, 6, false, false);
  }
  /**
   * refreshBhiReqSlotTable is used to refresh the latest value of a variable from the Serialized
   * String the most common reason to serialize an Object as a string in to write to a file. There
   * can be several other reasons for serialization as well
   */
  public char[] refreshBhiReqSlotTable() {
    return (substring(
        getStringValue(), beginBhiReqSlotTable, beginBhiReqSlotTable + BHI_REQ_SLOT_TABLE_LEN));
  }

  int localBhiReqEffectDateCounter = -1;

  public boolean isBhiReqEffectDateModified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localBhiReqEffectDateCounter != sharedCounter;
    localBhiReqEffectDateCounter = sharedCounter;
    return hasModified;
  }

  protected static final int BHI_REQ_EFFECT_DATE_LEN = 10;
  /** serialize this BhiReqEffectDate */
  protected void serializeBhiReqEffectDate(char[] bhiReqEffectDate) {
    shareString.getSerializedField().incrementCounter();
    arraycopy(
        bhiReqEffectDate, 0, getStringValue(), beginBhiReqEffectDate, BHI_REQ_EFFECT_DATE_LEN);
    localBhiReqEffectDateCounter = shareString.getSerializedField().getModifiedCounter();
  }

  protected char[] checkBhiReqEffectDateConstraints(char[] value) {
    return super.checkConstraints(value, 10, false, false);
  }
  /**
   * refreshBhiReqEffectDate is used to refresh the latest value of a variable from the Serialized
   * String the most common reason to serialize an Object as a string in to write to a file. There
   * can be several other reasons for serialization as well
   */
  public char[] refreshBhiReqEffectDate() {
    return (substring(
        getStringValue(), beginBhiReqEffectDate, beginBhiReqEffectDate + BHI_REQ_EFFECT_DATE_LEN));
  }

  int localBhiReqCancelDateCounter = -1;

  public boolean isBhiReqCancelDateModified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localBhiReqCancelDateCounter != sharedCounter;
    localBhiReqCancelDateCounter = sharedCounter;
    return hasModified;
  }

  protected static final int BHI_REQ_CANCEL_DATE_LEN = 10;
  /** serialize this BhiReqCancelDate */
  protected void serializeBhiReqCancelDate(char[] bhiReqCancelDate) {
    shareString.getSerializedField().incrementCounter();
    arraycopy(
        bhiReqCancelDate, 0, getStringValue(), beginBhiReqCancelDate, BHI_REQ_CANCEL_DATE_LEN);
    localBhiReqCancelDateCounter = shareString.getSerializedField().getModifiedCounter();
  }

  protected char[] checkBhiReqCancelDateConstraints(char[] value) {
    return super.checkConstraints(value, 10, false, false);
  }
  /**
   * refreshBhiReqCancelDate is used to refresh the latest value of a variable from the Serialized
   * String the most common reason to serialize an Object as a string in to write to a file. There
   * can be several other reasons for serialization as well
   */
  public char[] refreshBhiReqCancelDate() {
    return (substring(
        getStringValue(), beginBhiReqCancelDate, beginBhiReqCancelDate + BHI_REQ_CANCEL_DATE_LEN));
  }
}
