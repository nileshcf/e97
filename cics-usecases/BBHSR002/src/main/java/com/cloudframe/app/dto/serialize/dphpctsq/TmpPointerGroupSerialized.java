package com.cloudframe.app.dto.serialize.dphpctsq;

/**
 * The class TmpPointerGroupSerialized is used to define offsets in order to serialize in a fixed
 * String
 *
 * @author CloudFrame Inc. created on 2025-03-25 at 08:30. using version 5.0.0.231
 */
import com.cloudframe.app.data.Field;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class TmpPointerGroupSerialized extends Field {

  protected Logger logger = LoggerFactory.getLogger(TmpPointerGroupSerialized.class);
  /*  Length of the field, if serialized as a String */
  protected static final int TMP_POINTER_GROUP_LENGTH = 4;
  /*  offset of each of Child Fields when serialized as a String */
  protected int beginTmpPointer;
  protected int beginTmpPointerBin;

  /** Constructor for TmpPointerGroupSerialized */
  public TmpPointerGroupSerialized() {
    init(0);
  }

  /** initializes the field in TmpPointerGroupSerialized */
  @Override
  protected void init(int begin) {
    setStartOffset(begin);
    setLength(TMP_POINTER_GROUP_LENGTH);
    /*  set the offset/position of each field when this object is serialized as String */
    beginTmpPointer = getStartOffset() + 0; // set offset for serialization

    beginTmpPointerBin = getStartOffset() + 0; // set offset for serialization

    /*  end of offset */
  }

  int localTmpPointerCounter = -1;

  public boolean isTmpPointerModified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localTmpPointerCounter != sharedCounter;
    localTmpPointerCounter = sharedCounter;
    return hasModified;
  }

  protected static final int TMP_POINTER_LEN = 4;
  /** serializeTmpPointer */
  protected void serializeTmpPointer(int tmpPointer) {
    replaceValue( //  save the value as string
        getBinaryString(tmpPointer, TMP_POINTER_LEN), beginTmpPointer, TMP_POINTER_LEN);
    localTmpPointerCounter = shareString.getSerializedField().getModifiedCounter();
  }

  protected int checkTmpPointerMaxLimit(long number) {
    return (int) checkMaxLimit(number, true /*isSigned*/, 4 /*dataLen*/);
  }
  /**
   * refreshTmpPointer is used to refresh the latest value of a variable from the Serialized String
   * the most common reason to serialize an Object as a string in to write to a file. There can be
   * several other reasons for serialization as well
   */
  public int refreshTmpPointer() {
    return (getInt(beginTmpPointer));
  }

  int localTmpPointerBinCounter = -1;

  public boolean isTmpPointerBinModified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localTmpPointerBinCounter != sharedCounter;
    localTmpPointerBinCounter = sharedCounter;
    return hasModified;
  }

  protected static final int TMP_POINTER_BIN_LEN = 4;
  /** serializeTmpPointerBin */
  protected void serializeTmpPointerBin(int tmpPointerBin) {
    replaceValue( //  save the value as string
        getBinaryString(tmpPointerBin, TMP_POINTER_BIN_LEN),
        beginTmpPointerBin,
        TMP_POINTER_BIN_LEN);
    localTmpPointerBinCounter = shareString.getSerializedField().getModifiedCounter();
  }

  protected int checkTmpPointerBinMaxLimit(long number) {
    return (int) checkMaxLimit(number, true /*isSigned*/, 4 /*dataLen*/);
  }
  /**
   * refreshTmpPointerBin is used to refresh the latest value of a variable from the Serialized
   * String the most common reason to serialize an Object as a string in to write to a file. There
   * can be several other reasons for serialization as well
   */
  public int refreshTmpPointerBin() {
    return (getInt(beginTmpPointerBin));
  }
}
