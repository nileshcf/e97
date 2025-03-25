package com.cloudframe.app.dto.serialize.d5427hpc;

/**
 * The class HipaaCodeListSerialized is used to define offsets in order to serialize in a fixed
 * String
 *
 * @author CloudFrame Inc. created on 2025-03-25 at 08:29. using version 5.0.0.231
 */
import com.cloudframe.app.data.Field;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class HipaaCodeListSerialized extends Field {

  protected Logger logger = LoggerFactory.getLogger(HipaaCodeListSerialized.class);
  /*  Length of the field, if serialized as a String */
  protected static final int HIPAA_CODE_LIST_LENGTH = 18;
  /*  offset of each of Child Fields when serialized as a String */
  protected int beginHipaaCodeItem;
  protected static final int HIPAA_CODE_ITEM_SIZE = 9;

  /** Constructor for HipaaCodeListSerialized */
  public HipaaCodeListSerialized() {
    init(0);
  }

  /** initializes the field in HipaaCodeListSerialized */
  @Override
  protected void init(int begin) {
    setStartOffset(begin);
    setLength(HIPAA_CODE_LIST_LENGTH);
    /*  set the offset/position of each field when this object is serialized as String */
    beginHipaaCodeItem = getStartOffset() + 0; // set offset for serialization

    /*  end of offset */
  }

  protected static final int HIPAA_CODE_ITEM_LEN = 2;
  /**
   * serializeHipaaCodeItem as String
   *
   * @param index
   * @param value
   */
  protected void serializeHipaaCodeItem(int index, char[] value) {
    replaceValue(value, (beginHipaaCodeItem + index * HIPAA_CODE_ITEM_LEN), HIPAA_CODE_ITEM_LEN);
  }

  public int hipaaCodeItemSize() {
    return HIPAA_CODE_ITEM_SIZE;
  }
}
