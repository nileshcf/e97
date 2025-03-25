package com.cloudframe.app.dto.serialize.bbhsr002;

/**
 * The class HsrRetReturnSerialized is used to define offsets in order to serialize in a fixed
 * String
 *
 * @author CloudFrame Inc. created on 2025-03-25 at 08:29. using version 5.0.0.231
 */
import com.cloudframe.app.data.Field;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class HsrRetReturnSerialized extends Field {

  protected Logger logger = LoggerFactory.getLogger(HsrRetReturnSerialized.class);
  /*  Length of the field, if serialized as a String */
  protected static final int HSR_RET_RETURN_LENGTH = 1212601;
  /*  offset of each of Child Fields when serialized as a String */
  protected int beginHsrRetNOSvcInd;
  protected int beginHsrRetBhiInfo;
  protected static final int HSR_RET_BHI_INFO_SIZE = 300;

  /** Constructor for HsrRetReturnSerialized */
  public HsrRetReturnSerialized() {
    // TO-DO auto generated code
  }

  /**
   * Constructor for HsrRetReturnSerialized. sets the parent value to the parent
   *
   * @param parent
   * @param begin
   */
  public HsrRetReturnSerialized(Field parent, int begin) {
    setParent(parent, begin);
  }

  /**
   * sets parent for this HsrRetReturnSerialized to the parent
   *
   * @param parent
   */
  @Override
  public void setParent(Field parent) {
    setParent(parent, 19); // serialize this field at offset 19 by default
  }

  /**
   * sets parent for this HsrRetReturnSerialized to the parent and set the serialize offset to
   * parameter begin
   *
   * @param parent
   * @param begin - offset used when serializing this object to a String
   */
  public void setParent(Field parent, int begin) {
    super.setParent(parent);
    init(begin); // serialize this field at offset 19 by default
  }
  /** initializes the field in HsrRetReturnSerialized */
  @Override
  protected void init(int begin) {
    setStartOffset(begin);
    setLength(HSR_RET_RETURN_LENGTH);
    /*  set the offset/position of each field when this object is serialized as String */
    beginHsrRetNOSvcInd = getStartOffset() + 0; // set offset for serialization

    beginHsrRetBhiInfo = getStartOffset() + 1; // set offset for serialization

    /*  end of offset */
  }

  int localHsrRetNOSvcIndCounter = -1;

  public boolean isHsrRetNOSvcIndModified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localHsrRetNOSvcIndCounter != sharedCounter;
    localHsrRetNOSvcIndCounter = sharedCounter;
    return hasModified;
  }

  protected static final int HSR_RET_NOSVC_IND_LEN = 1;
  /** serialize this HsrRetNOSvcInd */
  protected void serializeHsrRetNOSvcInd(char[] hsrRetNOSvcInd) {
    shareString.getSerializedField().incrementCounter();
    arraycopy(hsrRetNOSvcInd, 0, getStringValue(), beginHsrRetNOSvcInd, HSR_RET_NOSVC_IND_LEN);
    localHsrRetNOSvcIndCounter = shareString.getSerializedField().getModifiedCounter();
  }

  protected char[] checkHsrRetNOSvcIndConstraints(char[] value) {
    return super.checkConstraints(value, 1, false, false);
  }
  /**
   * refreshHsrRetNOSvcInd is used to refresh the latest value of a variable from the Serialized
   * String the most common reason to serialize an Object as a string in to write to a file. There
   * can be several other reasons for serialization as well
   */
  public char[] refreshHsrRetNOSvcInd() {
    return (substring(
        getStringValue(), beginHsrRetNOSvcInd, beginHsrRetNOSvcInd + HSR_RET_NOSVC_IND_LEN));
  }

  public int hsrRetBhiInfoSize() {
    return HSR_RET_BHI_INFO_SIZE;
  }
}
