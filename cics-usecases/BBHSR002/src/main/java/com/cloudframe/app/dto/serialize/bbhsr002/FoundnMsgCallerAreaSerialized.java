package com.cloudframe.app.dto.serialize.bbhsr002;

/**
 * The class FoundnMsgCallerAreaSerialized is used to define offsets in order to serialize in a
 * fixed String
 *
 * @author CloudFrame Inc. created on 2025-03-25 at 08:29. using version 5.0.0.231
 */
import com.cloudframe.app.data.Field;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class FoundnMsgCallerAreaSerialized extends Field {

  protected Logger logger = LoggerFactory.getLogger(FoundnMsgCallerAreaSerialized.class);
  /*  Length of the field, if serialized as a String */
  protected static final int FOUNDN_MSG_CALLER_AREA_LENGTH = 1203;
  /*  offset of each of Child Fields when serialized as a String */
  protected int beginFmaFieldNumber;
  protected static final int FMA_FIELD_NUMBER_SIZE = 20;

  /** Constructor for FoundnMsgCallerAreaSerialized */
  public FoundnMsgCallerAreaSerialized() {
    init(0);
  }

  /** initializes the field in FoundnMsgCallerAreaSerialized */
  @Override
  protected void init(int begin) {
    setStartOffset(begin);
    setLength(FOUNDN_MSG_CALLER_AREA_LENGTH);
    /*  set the offset/position of each field when this object is serialized as String */

    beginFmaFieldNumber = getStartOffset() + 1143; // set offset for serialization

    /*  end of offset */
  }

  protected static final int FMA_FIELD_NUMBER_LEN = 3;
  /**
   * Collect all the arraylist value and join as a single string to serialize it.
   *
   * @param index
   * @param value
   */
  protected void serializeFmaFieldNumber(int index, short value) {
    replaceValue(
        pad(FMA_FIELD_NUMBER_LEN, String.valueOf(value).toCharArray(), '0', LEFT_PAD),
        (beginFmaFieldNumber + index * FMA_FIELD_NUMBER_LEN),
        FMA_FIELD_NUMBER_LEN);
  }

  public int fmaFieldNumberSize() {
    return FMA_FIELD_NUMBER_SIZE;
  }
}
