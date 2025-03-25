package com.cloudframe.app.dto.serialize.bbhsr002;

/**
 * The class HipaaCodeSerialized is used to define offsets in order to serialize in a fixed String
 *
 * @author CloudFrame Inc. created on 2025-03-25 at 08:29. using version 5.0.0.231
 */
import com.cloudframe.app.data.Field;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class HipaaCodeSerialized extends Field {

  protected Logger logger = LoggerFactory.getLogger(HipaaCodeSerialized.class);
  /*  Length of the field, if serialized as a String */
  protected static final int HIPAA_CODE_LENGTH = 3;
  /*  offset of each of Child Fields when serialized as a String */
  protected int beginHipaaCd;

  /** Constructor for HipaaCodeSerialized */
  public HipaaCodeSerialized() {
    // TO-DO auto generated code
  }

  /**
   * Constructor for HipaaCodeSerialized. sets the parent value to the parent
   *
   * @param parent
   * @param begin
   */
  public HipaaCodeSerialized(Field parent, int begin) {
    setParent(parent, begin);
  }

  /**
   * sets parent for this HipaaCodeSerialized to the parent
   *
   * @param parent
   */
  @Override
  public void setParent(Field parent) {
    setParent(parent, 0); // serialize this field at offset 0 by default
  }

  /**
   * sets parent for this HipaaCodeSerialized to the parent and set the serialize offset to
   * parameter begin
   *
   * @param parent
   * @param begin - offset used when serializing this object to a String
   */
  public void setParent(Field parent, int begin) {
    super.setParent(parent);
    init(begin); // serialize this field at offset 0 by default
  }
  /** initializes the field in HipaaCodeSerialized */
  @Override
  protected void init(int begin) {
    setStartOffset(begin);
    setLength(HIPAA_CODE_LENGTH);
    /*  set the offset/position of each field when this object is serialized as String */
    beginHipaaCd = getStartOffset() + 0; // set offset for serialization

    /*  end of offset */
  }

  int localHipaaCdCounter = -1;

  public boolean isHipaaCdModified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localHipaaCdCounter != sharedCounter;
    localHipaaCdCounter = sharedCounter;
    return hasModified;
  }

  protected static final int HIPAA_CD_LEN = 2;
  /** serialize this HipaaCd */
  protected void serializeHipaaCd(char[] hipaaCd) {
    shareString.getSerializedField().incrementCounter();
    arraycopy(hipaaCd, 0, getStringValue(), beginHipaaCd, HIPAA_CD_LEN);
    localHipaaCdCounter = shareString.getSerializedField().getModifiedCounter();
  }

  protected char[] checkHipaaCdConstraints(char[] value) {
    return super.checkConstraints(value, 2, false, false);
  }
  /**
   * refreshHipaaCd is used to refresh the latest value of a variable from the Serialized String the
   * most common reason to serialize an Object as a string in to write to a file. There can be
   * several other reasons for serialization as well
   */
  public char[] refreshHipaaCd() {
    return (substring(getStringValue(), beginHipaaCd, beginHipaaCd + HIPAA_CD_LEN));
  }
}
