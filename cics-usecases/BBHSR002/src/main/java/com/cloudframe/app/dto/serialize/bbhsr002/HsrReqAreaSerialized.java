package com.cloudframe.app.dto.serialize.bbhsr002;

/**
 * The class HsrReqAreaSerialized is used to define offsets in order to serialize in a fixed String
 *
 * @author CloudFrame Inc. created on 2025-03-25 at 08:29. using version 5.0.0.231
 */
import com.cloudframe.app.data.Field;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class HsrReqAreaSerialized extends Field {

  protected Logger logger = LoggerFactory.getLogger(HsrReqAreaSerialized.class);
  /*  Length of the field, if serialized as a String */
  protected static final int HSR_REQ_AREA_LENGTH = 85;
  /*  offset of each of Child Fields when serialized as a String */
  protected int beginHsrReqCommonAreaSw;

  /** Constructor for HsrReqAreaSerialized */
  public HsrReqAreaSerialized() {
    // TO-DO auto generated code
  }

  /**
   * Constructor for HsrReqAreaSerialized. sets the parent value to the parent
   *
   * @param parent
   * @param begin
   */
  public HsrReqAreaSerialized(Field parent, int begin) {
    setParent(parent, begin);
  }

  /**
   * sets parent for this HsrReqAreaSerialized to the parent
   *
   * @param parent
   */
  @Override
  public void setParent(Field parent) {
    setParent(parent, 0); // serialize this field at offset 0 by default
  }

  /**
   * sets parent for this HsrReqAreaSerialized to the parent and set the serialize offset to
   * parameter begin
   *
   * @param parent
   * @param begin - offset used when serializing this object to a String
   */
  public void setParent(Field parent, int begin) {
    super.setParent(parent);
    init(begin); // serialize this field at offset 0 by default
  }
  /** initializes the field in HsrReqAreaSerialized */
  @Override
  protected void init(int begin) {
    setStartOffset(begin);
    setLength(HSR_REQ_AREA_LENGTH);
    /*  set the offset/position of each field when this object is serialized as String */

    beginHsrReqCommonAreaSw = getStartOffset() + 39; // set offset for serialization

    /*  end of offset */
  }

  int localHsrReqCommonAreaSwCounter = -1;

  public boolean isHsrReqCommonAreaSwModified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localHsrReqCommonAreaSwCounter != sharedCounter;
    localHsrReqCommonAreaSwCounter = sharedCounter;
    return hasModified;
  }

  protected static final int HSR_REQ_COMMON_AREA_SW_LEN = 1;
  /** serialize this HsrReqCommonAreaSw */
  protected void serializeHsrReqCommonAreaSw(char[] hsrReqCommonAreaSw) {
    shareString.getSerializedField().incrementCounter();
    arraycopy(
        hsrReqCommonAreaSw,
        0,
        getStringValue(),
        beginHsrReqCommonAreaSw,
        HSR_REQ_COMMON_AREA_SW_LEN);
    localHsrReqCommonAreaSwCounter = shareString.getSerializedField().getModifiedCounter();
  }

  protected char[] checkHsrReqCommonAreaSwConstraints(char[] value) {
    return super.checkConstraints(value, 1, false, false);
  }
  /**
   * refreshHsrReqCommonAreaSw is used to refresh the latest value of a variable from the Serialized
   * String the most common reason to serialize an Object as a string in to write to a file. There
   * can be several other reasons for serialization as well
   */
  public char[] refreshHsrReqCommonAreaSw() {
    return (substring(
        getStringValue(),
        beginHsrReqCommonAreaSw,
        beginHsrReqCommonAreaSw + HSR_REQ_COMMON_AREA_SW_LEN));
  }
}
