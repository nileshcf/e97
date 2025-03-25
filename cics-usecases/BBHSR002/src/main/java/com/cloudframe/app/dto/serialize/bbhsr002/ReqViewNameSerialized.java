package com.cloudframe.app.dto.serialize.bbhsr002;

/**
 * The class ReqViewNameSerialized is used to define offsets in order to serialize in a fixed String
 *
 * @author CloudFrame Inc. created on 2025-03-25 at 08:29. using version 5.0.0.231
 */
import com.cloudframe.app.data.Field;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ReqViewNameSerialized extends Field {

  protected Logger logger = LoggerFactory.getLogger(ReqViewNameSerialized.class);
  /*  Length of the field, if serialized as a String */
  protected static final int REQ_VIEW_NAME_LENGTH = 8;
  /*  offset of each of Child Fields when serialized as a String */
  protected int beginReqViewProjCode;

  /** Constructor for ReqViewNameSerialized */
  public ReqViewNameSerialized() {
    // TO-DO auto generated code
  }

  /**
   * Constructor for ReqViewNameSerialized. sets the parent value to the parent
   *
   * @param parent
   * @param begin
   */
  public ReqViewNameSerialized(Field parent, int begin) {
    setParent(parent, begin);
  }

  /**
   * sets parent for this ReqViewNameSerialized to the parent
   *
   * @param parent
   */
  @Override
  public void setParent(Field parent) {
    setParent(parent, 1); // serialize this field at offset 1 by default
  }

  /**
   * sets parent for this ReqViewNameSerialized to the parent and set the serialize offset to
   * parameter begin
   *
   * @param parent
   * @param begin - offset used when serializing this object to a String
   */
  public void setParent(Field parent, int begin) {
    super.setParent(parent);
    init(begin); // serialize this field at offset 1 by default
  }
  /** initializes the field in ReqViewNameSerialized */
  @Override
  protected void init(int begin) {
    setStartOffset(begin);
    setLength(REQ_VIEW_NAME_LENGTH);
    /*  set the offset/position of each field when this object is serialized as String */
    beginReqViewProjCode = getStartOffset() + 0; // set offset for serialization

    /*  end of offset */
  }

  int localReqViewProjCodeCounter = -1;

  public boolean isReqViewProjCodeModified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localReqViewProjCodeCounter != sharedCounter;
    localReqViewProjCodeCounter = sharedCounter;
    return hasModified;
  }

  protected static final int REQ_VIEW_PROJ_CODE_LEN = 5;
  /** serialize this ReqViewProjCode */
  protected void serializeReqViewProjCode(char[] reqViewProjCode) {
    shareString.getSerializedField().incrementCounter();
    arraycopy(reqViewProjCode, 0, getStringValue(), beginReqViewProjCode, REQ_VIEW_PROJ_CODE_LEN);
    localReqViewProjCodeCounter = shareString.getSerializedField().getModifiedCounter();
  }

  protected char[] checkReqViewProjCodeConstraints(char[] value) {
    return super.checkConstraints(value, 5, false, false);
  }
  /**
   * refreshReqViewProjCode is used to refresh the latest value of a variable from the Serialized
   * String the most common reason to serialize an Object as a string in to write to a file. There
   * can be several other reasons for serialization as well
   */
  public char[] refreshReqViewProjCode() {
    return (substring(
        getStringValue(), beginReqViewProjCode, beginReqViewProjCode + REQ_VIEW_PROJ_CODE_LEN));
  }
}
