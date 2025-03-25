package com.cloudframe.app.dto.serialize.bbhsr002;

/**
 * The class ReqHsrHipaaListSerialized is used to define offsets in order to serialize in a fixed
 * String
 *
 * @author CloudFrame Inc. created on 2025-03-25 at 08:29. using version 5.0.0.231
 */
import com.cloudframe.app.data.Field;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ReqHsrHipaaListSerialized extends Field {

  protected Logger logger = LoggerFactory.getLogger(ReqHsrHipaaListSerialized.class);
  /*  Length of the field, if serialized as a String */
  protected static final int REQ_HSR_HIPAA_LIST_LENGTH = 18;
  /*  offset of each of Child Fields when serialized as a String */
  protected int beginReqHipaaCdItem;
  protected static final int REQ_HIPAA_CD_ITEM_SIZE = 9;

  /** Constructor for ReqHsrHipaaListSerialized */
  public ReqHsrHipaaListSerialized() {
    init(0);
  }

  /** initializes the field in ReqHsrHipaaListSerialized */
  @Override
  protected void init(int begin) {
    setStartOffset(begin);
    setLength(REQ_HSR_HIPAA_LIST_LENGTH);
    /*  set the offset/position of each field when this object is serialized as String */
    beginReqHipaaCdItem = getStartOffset() + 0; // set offset for serialization

    /*  end of offset */
  }

  protected static final int REQ_HIPAA_CD_ITEM_LEN = 2;
  /**
   * serializeReqHipaaCdItem as String
   *
   * @param index
   * @param value
   */
  protected void serializeReqHipaaCdItem(int index, char[] value) {
    replaceValue(
        value, (beginReqHipaaCdItem + index * REQ_HIPAA_CD_ITEM_LEN), REQ_HIPAA_CD_ITEM_LEN);
  }

  public int reqHipaaCdItemSize() {
    return REQ_HIPAA_CD_ITEM_SIZE;
  }
}
