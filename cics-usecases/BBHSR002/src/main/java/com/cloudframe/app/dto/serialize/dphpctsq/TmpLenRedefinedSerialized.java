package com.cloudframe.app.dto.serialize.dphpctsq;

/**
 * The class TmpLenRedefinedSerialized is used to define offsets in order to serialize in a fixed
 * String
 *
 * @author CloudFrame Inc. created on 2025-03-25 at 08:30. using version 5.0.0.231
 */
import com.cloudframe.app.data.Field;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class TmpLenRedefinedSerialized extends Field {

  protected Logger logger = LoggerFactory.getLogger(TmpLenRedefinedSerialized.class);
  /*  Length of the field, if serialized as a String */
  protected static final int TMP_LEN_REDEFINED_LENGTH = 4;
  /*  offset of each of Child Fields when serialized as a String */
  protected int beginTmpLenByte4;

  /** Constructor for TmpLenRedefinedSerialized */
  public TmpLenRedefinedSerialized() {
    // TO-DO auto generated code
  }

  /**
   * Constructor for TmpLenRedefinedSerialized. sets the parent value to the parent
   *
   * @param parent
   * @param begin
   */
  public TmpLenRedefinedSerialized(Field parent, int begin) {
    setParent(parent, begin);
  }

  /**
   * sets parent for this TmpLenRedefinedSerialized to the parent
   *
   * @param parent
   */
  @Override
  public void setParent(Field parent) {
    setParent(parent, 0); // serialize this field at offset 0 by default
  }

  /**
   * sets parent for this TmpLenRedefinedSerialized to the parent and set the serialize offset to
   * parameter begin
   *
   * @param parent
   * @param begin - offset used when serializing this object to a String
   */
  public void setParent(Field parent, int begin) {
    super.setParent(parent);
    init(begin); // serialize this field at offset 0 by default
  }
  /** initializes the field in TmpLenRedefinedSerialized */
  @Override
  protected void init(int begin) {
    setStartOffset(begin);
    setLength(TMP_LEN_REDEFINED_LENGTH);
    /*  set the offset/position of each field when this object is serialized as String */
    beginTmpLenByte4 = getStartOffset() + 3; // set offset for serialization

    /*  end of offset */
  }

  int localTmpLenByte4Counter = -1;

  public boolean isTmpLenByte4Modified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localTmpLenByte4Counter != sharedCounter;
    localTmpLenByte4Counter = sharedCounter;
    return hasModified;
  }

  protected static final int TMP_LEN_BYTE_4_LEN = 1;
  /** serialize this TmpLenByte4 */
  protected void serializeTmpLenByte4(char[] tmpLenByte4) {
    shareString.getSerializedField().incrementCounter();
    arraycopy(tmpLenByte4, 0, getStringValue(), beginTmpLenByte4, TMP_LEN_BYTE_4_LEN);
    localTmpLenByte4Counter = shareString.getSerializedField().getModifiedCounter();
  }

  protected char[] checkTmpLenByte4Constraints(char[] value) {
    return super.checkConstraints(value, 1, false, false);
  }
  /**
   * refreshTmpLenByte4 is used to refresh the latest value of a variable from the Serialized String
   * the most common reason to serialize an Object as a string in to write to a file. There can be
   * several other reasons for serialization as well
   */
  public char[] refreshTmpLenByte4() {
    return (substring(getStringValue(), beginTmpLenByte4, beginTmpLenByte4 + TMP_LEN_BYTE_4_LEN));
  }
}
