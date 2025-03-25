package com.cloudframe.app.dto.serialize.bbhsr002;

/**
 * The class FmaEntryTableSerialized is used to define offsets in order to serialize in a fixed
 * String
 *
 * @author CloudFrame Inc. created on 2025-03-25 at 08:29. using version 5.0.0.231
 */
import com.cloudframe.app.data.Field;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class FmaEntryTableSerialized extends Field {

  protected Logger logger = LoggerFactory.getLogger(FmaEntryTableSerialized.class);
  /*  Length of the field, if serialized as a String */
  protected static final int FMA_ENTRY_TABLE_LENGTH = 1080;
  /*  offset of each of Child Fields when serialized as a String */
  protected int beginFmaEntry;
  protected static final int FMA_ENTRY_SIZE = 20;

  /** Constructor for FmaEntryTableSerialized */
  public FmaEntryTableSerialized() {
    // TO-DO auto generated code
  }

  /**
   * Constructor for FmaEntryTableSerialized. sets the parent value to the parent
   *
   * @param parent
   * @param begin
   */
  public FmaEntryTableSerialized(Field parent, int begin) {
    setParent(parent, begin);
  }

  /**
   * sets parent for this FmaEntryTableSerialized to the parent
   *
   * @param parent
   */
  @Override
  public void setParent(Field parent) {
    setParent(parent, 63); // serialize this field at offset 63 by default
  }

  /**
   * sets parent for this FmaEntryTableSerialized to the parent and set the serialize offset to
   * parameter begin
   *
   * @param parent
   * @param begin - offset used when serializing this object to a String
   */
  public void setParent(Field parent, int begin) {
    super.setParent(parent);
    init(begin); // serialize this field at offset 63 by default
  }
  /** initializes the field in FmaEntryTableSerialized */
  @Override
  protected void init(int begin) {
    setStartOffset(begin);
    setLength(FMA_ENTRY_TABLE_LENGTH);
    /*  set the offset/position of each field when this object is serialized as String */
    beginFmaEntry = getStartOffset() + 0; // set offset for serialization

    /*  end of offset */
  }

  public int fmaEntrySize() {
    return FMA_ENTRY_SIZE;
  }
}
