package com.cloudframe.app.dto.serialize.bbhsr002;

/**
 * The class HsrRetFunctionMessageSerialized is used to define offsets in order to serialize in a
 * fixed String
 *
 * @author CloudFrame Inc. created on 2025-03-25 at 08:29. using version 5.0.0.231
 */
import com.cloudframe.app.data.Field;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class HsrRetFunctionMessageSerialized extends Field {

  protected Logger logger = LoggerFactory.getLogger(HsrRetFunctionMessageSerialized.class);
  /*  Length of the field, if serialized as a String */
  protected static final int HSR_RET_FUNCTION_MESSAGE_LENGTH = 3;
  /*  offset of each of Child Fields when serialized as a String */
  protected int beginHsrRetFunctionRtnCd;

  /** Constructor for HsrRetFunctionMessageSerialized */
  public HsrRetFunctionMessageSerialized() {
    // TO-DO auto generated code
  }

  /**
   * Constructor for HsrRetFunctionMessageSerialized. sets the parent value to the parent
   *
   * @param parent
   * @param begin
   */
  public HsrRetFunctionMessageSerialized(Field parent, int begin) {
    setParent(parent, begin);
  }

  /**
   * sets parent for this HsrRetFunctionMessageSerialized to the parent
   *
   * @param parent
   */
  @Override
  public void setParent(Field parent) {
    setParent(parent, 1212620); // serialize this field at offset 1212620 by default
  }

  /**
   * sets parent for this HsrRetFunctionMessageSerialized to the parent and set the serialize offset
   * to parameter begin
   *
   * @param parent
   * @param begin - offset used when serializing this object to a String
   */
  public void setParent(Field parent, int begin) {
    super.setParent(parent);
    init(begin); // serialize this field at offset 1212620 by default
  }
  /** initializes the field in HsrRetFunctionMessageSerialized */
  @Override
  protected void init(int begin) {
    setStartOffset(begin);
    setLength(HSR_RET_FUNCTION_MESSAGE_LENGTH);
    /*  set the offset/position of each field when this object is serialized as String */
    beginHsrRetFunctionRtnCd = getStartOffset() + 0; // set offset for serialization

    /*  end of offset */
  }

  int localHsrRetFunctionRtnCdCounter = -1;

  public boolean isHsrRetFunctionRtnCdModified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localHsrRetFunctionRtnCdCounter != sharedCounter;
    localHsrRetFunctionRtnCdCounter = sharedCounter;
    return hasModified;
  }

  protected static final int HSR_RET_FUNCTION_RTN_CD_LEN = 3;
  /** serialize this HsrRetFunctionRtnCd */
  protected void serializeHsrRetFunctionRtnCd(char[] hsrRetFunctionRtnCd) {
    shareString.getSerializedField().incrementCounter();
    arraycopy(
        hsrRetFunctionRtnCd,
        0,
        getStringValue(),
        beginHsrRetFunctionRtnCd,
        HSR_RET_FUNCTION_RTN_CD_LEN);
    localHsrRetFunctionRtnCdCounter = shareString.getSerializedField().getModifiedCounter();
  }

  protected char[] checkHsrRetFunctionRtnCdConstraints(char[] value) {
    return super.checkConstraints(value, 3, false, false);
  }
  /**
   * refreshHsrRetFunctionRtnCd is used to refresh the latest value of a variable from the
   * Serialized String the most common reason to serialize an Object as a string in to write to a
   * file. There can be several other reasons for serialization as well
   */
  public char[] refreshHsrRetFunctionRtnCd() {
    return (substring(
        getStringValue(),
        beginHsrRetFunctionRtnCd,
        beginHsrRetFunctionRtnCd + HSR_RET_FUNCTION_RTN_CD_LEN));
  }
}
