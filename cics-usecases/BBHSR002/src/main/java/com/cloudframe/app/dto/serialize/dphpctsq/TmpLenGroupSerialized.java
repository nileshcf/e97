package com.cloudframe.app.dto.serialize.dphpctsq;

/**
 * The class TmpLenGroupSerialized is used to define offsets in order to serialize in a fixed String
 *
 * @author CloudFrame Inc. created on 2025-03-25 at 08:30. using version 5.0.0.231
 */
import com.cloudframe.app.data.Field;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class TmpLenGroupSerialized extends Field {

  protected Logger logger = LoggerFactory.getLogger(TmpLenGroupSerialized.class);
  /*  Length of the field, if serialized as a String */
  protected static final int TMP_LEN_GROUP_LENGTH = 4;
  /*  offset of each of Child Fields when serialized as a String */
  protected int beginTmpLen;

  /** Constructor for TmpLenGroupSerialized */
  public TmpLenGroupSerialized() {
    init(0);
  }

  /** initializes the field in TmpLenGroupSerialized */
  @Override
  protected void init(int begin) {
    setStartOffset(begin);
    setLength(TMP_LEN_GROUP_LENGTH);
    /*  set the offset/position of each field when this object is serialized as String */
    beginTmpLen = getStartOffset() + 0; // set offset for serialization

    /*  end of offset */
  }

  int localTmpLenCounter = -1;

  public boolean isTmpLenModified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localTmpLenCounter != sharedCounter;
    localTmpLenCounter = sharedCounter;
    return hasModified;
  }

  protected static final int TMP_LEN_LEN = 4;
  /** serializeTmpLen */
  protected void serializeTmpLen(int tmpLen) {
    replaceValue( //  save the value as string
        getBinaryString(tmpLen, TMP_LEN_LEN), beginTmpLen, TMP_LEN_LEN);
    localTmpLenCounter = shareString.getSerializedField().getModifiedCounter();
  }

  protected int checkTmpLenMaxLimit(long number) {
    return (int) checkMaxLimit(number, true /*isSigned*/, 4 /*dataLen*/);
  }
  /**
   * refreshTmpLen is used to refresh the latest value of a variable from the Serialized String the
   * most common reason to serialize an Object as a string in to write to a file. There can be
   * several other reasons for serialization as well
   */
  public int refreshTmpLen() {
    return (getInt(beginTmpLen));
  }
}
