package com.cloudframe.app.dto.serialize.d5427bhi;

/**
 * The class BhiReqRowSerialized is used to define offsets in order to serialize in a fixed String
 *
 * @author CloudFrame Inc. created on 2025-03-25 at 08:32. using version 5.0.0.231
 */
import com.cloudframe.app.data.Field;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class BhiReqRowSerialized extends Field {

  protected Logger logger = LoggerFactory.getLogger(BhiReqRowSerialized.class);
  /*  Length of the field, if serialized as a String */
  protected static final int BHI_REQ_ROW_LENGTH = 94;
  /*  offset of each of Child Fields when serialized as a String */
  protected int beginBhiReqRowAct;

  /** Constructor for BhiReqRowSerialized */
  public BhiReqRowSerialized() {
    // TO-DO auto generated code
  }

  /**
   * Constructor for BhiReqRowSerialized. sets the parent value to the parent
   *
   * @param parent
   * @param begin
   */
  public BhiReqRowSerialized(Field parent, int begin) {
    setParent(parent, begin);
  }

  /**
   * sets parent for this BhiReqRowSerialized to the parent
   *
   * @param parent
   */
  @Override
  public void setParent(Field parent) {
    setParent(parent, 75); // serialize this field at offset 75 by default
  }

  /**
   * sets parent for this BhiReqRowSerialized to the parent and set the serialize offset to
   * parameter begin
   *
   * @param parent
   * @param begin - offset used when serializing this object to a String
   */
  public void setParent(Field parent, int begin) {
    super.setParent(parent);
    init(begin); // serialize this field at offset 75 by default
  }
  /** initializes the field in BhiReqRowSerialized */
  @Override
  protected void init(int begin) {
    setStartOffset(begin);
    setLength(BHI_REQ_ROW_LENGTH);
    /*  set the offset/position of each field when this object is serialized as String */
    beginBhiReqRowAct = getStartOffset() + 0; // set offset for serialization

    /*  end of offset */
  }

  int localBhiReqRowActCounter = -1;

  public boolean isBhiReqRowActModified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localBhiReqRowActCounter != sharedCounter;
    localBhiReqRowActCounter = sharedCounter;
    return hasModified;
  }

  protected static final int BHI_REQ_ROW_ACT_LEN = 1;
  /** serialize this BhiReqRowAct */
  protected void serializeBhiReqRowAct(char[] bhiReqRowAct) {
    shareString.getSerializedField().incrementCounter();
    arraycopy(bhiReqRowAct, 0, getStringValue(), beginBhiReqRowAct, BHI_REQ_ROW_ACT_LEN);
    localBhiReqRowActCounter = shareString.getSerializedField().getModifiedCounter();
  }

  protected char[] checkBhiReqRowActConstraints(char[] value) {
    return super.checkConstraints(value, 1, false, false);
  }
  /**
   * refreshBhiReqRowAct is used to refresh the latest value of a variable from the Serialized
   * String the most common reason to serialize an Object as a string in to write to a file. There
   * can be several other reasons for serialization as well
   */
  public char[] refreshBhiReqRowAct() {
    return (substring(
        getStringValue(), beginBhiReqRowAct, beginBhiReqRowAct + BHI_REQ_ROW_ACT_LEN));
  }
}
