package com.cloudframe.app.dto.serialize.c5427hpc;

/**
 * The class CrtnRequestDataSerialized is used to define offsets in order to serialize in a fixed
 * String
 *
 * @author CloudFrame Inc. created on 2025-03-25 at 08:29. using version 5.0.0.231
 */
import com.cloudframe.app.data.Field;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class CrtnRequestDataSerialized extends Field {

  protected Logger logger = LoggerFactory.getLogger(CrtnRequestDataSerialized.class);
  /*  Length of the field, if serialized as a String */
  protected static final int CRTN_REQUEST_DATA_LENGTH = 22;
  /*  offset of each of Child Fields when serialized as a String */
  protected int beginCrtnCallType;
  protected int beginCrtnSrchCd;
  protected static final int CRTN_SRCH_CD_SIZE = 10;
  protected int beginCrtnHipaaCd30Flag;

  /** Constructor for CrtnRequestDataSerialized */
  public CrtnRequestDataSerialized() {
    // TO-DO auto generated code
  }

  /**
   * Constructor for CrtnRequestDataSerialized. sets the parent value to the parent
   *
   * @param parent
   * @param begin
   */
  public CrtnRequestDataSerialized(Field parent, int begin) {
    setParent(parent, begin);
  }

  /**
   * sets parent for this CrtnRequestDataSerialized to the parent
   *
   * @param parent
   */
  @Override
  public void setParent(Field parent) {
    setParent(parent, 7); // serialize this field at offset 7 by default
  }

  /**
   * sets parent for this CrtnRequestDataSerialized to the parent and set the serialize offset to
   * parameter begin
   *
   * @param parent
   * @param begin - offset used when serializing this object to a String
   */
  public void setParent(Field parent, int begin) {
    super.setParent(parent);
    init(begin); // serialize this field at offset 7 by default
  }
  /** initializes the field in CrtnRequestDataSerialized */
  @Override
  protected void init(int begin) {
    setStartOffset(begin);
    setLength(CRTN_REQUEST_DATA_LENGTH);
    /*  set the offset/position of each field when this object is serialized as String */
    beginCrtnCallType = getStartOffset() + 0; // set offset for serialization

    beginCrtnSrchCd = getStartOffset() + 1; // set offset for serialization

    beginCrtnHipaaCd30Flag = getStartOffset() + 21; // set offset for serialization

    /*  end of offset */
  }

  int localCrtnCallTypeCounter = -1;

  public boolean isCrtnCallTypeModified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localCrtnCallTypeCounter != sharedCounter;
    localCrtnCallTypeCounter = sharedCounter;
    return hasModified;
  }

  protected static final int CRTN_CALL_TYPE_LEN = 1;
  /** serialize this CrtnCallType */
  protected void serializeCrtnCallType(char[] crtnCallType) {
    shareString.getSerializedField().incrementCounter();
    arraycopy(crtnCallType, 0, getStringValue(), beginCrtnCallType, CRTN_CALL_TYPE_LEN);
    localCrtnCallTypeCounter = shareString.getSerializedField().getModifiedCounter();
  }

  protected char[] checkCrtnCallTypeConstraints(char[] value) {
    return super.checkConstraints(value, 1, false, false);
  }
  /**
   * refreshCrtnCallType is used to refresh the latest value of a variable from the Serialized
   * String the most common reason to serialize an Object as a string in to write to a file. There
   * can be several other reasons for serialization as well
   */
  public char[] refreshCrtnCallType() {
    return (substring(getStringValue(), beginCrtnCallType, beginCrtnCallType + CRTN_CALL_TYPE_LEN));
  }

  protected static final int CRTN_SRCH_CD_LEN = 2;
  /**
   * serializeCrtnSrchCd as String
   *
   * @param index
   * @param value
   */
  protected void serializeCrtnSrchCd(int index, char[] value) {
    replaceValue(value, (beginCrtnSrchCd + index * CRTN_SRCH_CD_LEN), CRTN_SRCH_CD_LEN);
  }

  int localCrtnHipaaCd30FlagCounter = -1;

  public boolean isCrtnHipaaCd30FlagModified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localCrtnHipaaCd30FlagCounter != sharedCounter;
    localCrtnHipaaCd30FlagCounter = sharedCounter;
    return hasModified;
  }

  protected static final int CRTN_HIPAA_CD_30_FLAG_LEN = 1;
  /** serialize this CrtnHipaaCd30Flag */
  protected void serializeCrtnHipaaCd30Flag(char[] crtnHipaaCd30Flag) {
    shareString.getSerializedField().incrementCounter();
    arraycopy(
        crtnHipaaCd30Flag, 0, getStringValue(), beginCrtnHipaaCd30Flag, CRTN_HIPAA_CD_30_FLAG_LEN);
    localCrtnHipaaCd30FlagCounter = shareString.getSerializedField().getModifiedCounter();
  }

  protected char[] checkCrtnHipaaCd30FlagConstraints(char[] value) {
    return super.checkConstraints(value, 1, false, false);
  }
  /**
   * refreshCrtnHipaaCd30Flag is used to refresh the latest value of a variable from the Serialized
   * String the most common reason to serialize an Object as a string in to write to a file. There
   * can be several other reasons for serialization as well
   */
  public char[] refreshCrtnHipaaCd30Flag() {
    return (substring(
        getStringValue(),
        beginCrtnHipaaCd30Flag,
        beginCrtnHipaaCd30Flag + CRTN_HIPAA_CD_30_FLAG_LEN));
  }

  public int crtnSrchCdSize() {
    return CRTN_SRCH_CD_SIZE;
  }
}
