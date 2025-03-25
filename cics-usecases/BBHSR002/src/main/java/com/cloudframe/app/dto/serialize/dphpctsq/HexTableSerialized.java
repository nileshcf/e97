package com.cloudframe.app.dto.serialize.dphpctsq;

/**
 * The class HexTableSerialized is used to define offsets in order to serialize in a fixed String
 *
 * @author CloudFrame Inc. created on 2025-03-25 at 08:30. using version 5.0.0.231
 */
import com.cloudframe.app.data.Field;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class HexTableSerialized extends Field {

  protected Logger logger = LoggerFactory.getLogger(HexTableSerialized.class);
  /*  Length of the field, if serialized as a String */
  protected static final int HEX_TABLE_LENGTH = 512;
  /*  offset of each of Child Fields when serialized as a String */
  protected int beginHexRemainder;
  protected static final int HEX_REMAINDER_SIZE = 256;

  /** Constructor for HexTableSerialized */
  public HexTableSerialized() {
    // TO-DO auto generated code
  }

  /**
   * Constructor for HexTableSerialized. sets the parent value to the parent
   *
   * @param parent
   * @param begin
   */
  public HexTableSerialized(Field parent, int begin) {
    setParent(parent, begin);
  }

  /**
   * sets parent for this HexTableSerialized to the parent
   *
   * @param parent
   */
  @Override
  public void setParent(Field parent) {
    setParent(parent, 0); // serialize this field at offset 0 by default
  }

  /**
   * sets parent for this HexTableSerialized to the parent and set the serialize offset to parameter
   * begin
   *
   * @param parent
   * @param begin - offset used when serializing this object to a String
   */
  public void setParent(Field parent, int begin) {
    super.setParent(parent);
    init(begin); // serialize this field at offset 0 by default
  }
  /** initializes the field in HexTableSerialized */
  @Override
  protected void init(int begin) {
    setStartOffset(begin);
    setLength(HEX_TABLE_LENGTH);
    /*  set the offset/position of each field when this object is serialized as String */
    beginHexRemainder = getStartOffset() + 0; // set offset for serialization

    /*  end of offset */
  }

  protected static final int HEX_REMAINDER_LEN = 2;
  /**
   * serialize this HexRemainder as String
   *
   * @param index
   * @param value
   */
  protected void serializeHexRemainder(int index, short value) {
    short number = (short) value;
    replaceValue(
        getBinaryString(number),
        (beginHexRemainder + index * HEX_REMAINDER_LEN),
        HEX_REMAINDER_LEN);
  }

  public int hexRemainderSize() {
    return HEX_REMAINDER_SIZE;
  }
}
