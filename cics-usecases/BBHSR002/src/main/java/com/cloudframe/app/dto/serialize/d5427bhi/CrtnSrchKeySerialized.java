package com.cloudframe.app.dto.serialize.d5427bhi;

/**
 * The class CrtnSrchKeySerialized is used to define offsets in order to serialize in a fixed String
 *
 * @author CloudFrame Inc. created on 2025-03-25 at 08:32. using version 5.0.0.231
 */
import com.cloudframe.app.data.Field;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class CrtnSrchKeySerialized extends Field {

  protected Logger logger = LoggerFactory.getLogger(CrtnSrchKeySerialized.class);
  /*  Length of the field, if serialized as a String */
  protected static final int CRTN_SRCH_KEY_LENGTH = 10;
  /*  offset of each of Child Fields when serialized as a String */
  protected int beginCrtnSlotTblId;
  protected int beginCrtnHipaaCd;
  protected int beginCrtnHipaaVerNbr;
  protected int beginCrtnStsCd;

  /** Constructor for CrtnSrchKeySerialized */
  public CrtnSrchKeySerialized() {
    // TO-DO auto generated code
  }

  /**
   * Constructor for CrtnSrchKeySerialized. sets the parent value to the parent
   *
   * @param parent
   * @param begin
   */
  public CrtnSrchKeySerialized(Field parent, int begin) {
    setParent(parent, begin);
  }

  /**
   * sets parent for this CrtnSrchKeySerialized to the parent
   *
   * @param parent
   */
  @Override
  public void setParent(Field parent) {
    setParent(parent, 0); // serialize this field at offset 0 by default
  }

  /**
   * sets parent for this CrtnSrchKeySerialized to the parent and set the serialize offset to
   * parameter begin
   *
   * @param parent
   * @param begin - offset used when serializing this object to a String
   */
  public void setParent(Field parent, int begin) {
    super.setParent(parent);
    init(begin); // serialize this field at offset 0 by default
  }
  /** initializes the field in CrtnSrchKeySerialized */
  @Override
  protected void init(int begin) {
    setStartOffset(begin);
    setLength(CRTN_SRCH_KEY_LENGTH);
    /*  set the offset/position of each field when this object is serialized as String */
    beginCrtnSlotTblId = getStartOffset() + 0; // set offset for serialization

    beginCrtnHipaaCd = getStartOffset() + 6; // set offset for serialization

    beginCrtnHipaaVerNbr = getStartOffset() + 8; // set offset for serialization

    beginCrtnStsCd = getStartOffset() + 9; // set offset for serialization

    /*  end of offset */
  }

  int localCrtnSlotTblIdCounter = -1;

  public boolean isCrtnSlotTblIdModified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localCrtnSlotTblIdCounter != sharedCounter;
    localCrtnSlotTblIdCounter = sharedCounter;
    return hasModified;
  }

  protected static final int CRTN_SLOT_TBL_ID_LEN = 6;
  /** serialize this CrtnSlotTblId */
  protected void serializeCrtnSlotTblId(char[] crtnSlotTblId) {
    shareString.getSerializedField().incrementCounter();
    arraycopy(crtnSlotTblId, 0, getStringValue(), beginCrtnSlotTblId, CRTN_SLOT_TBL_ID_LEN);
    localCrtnSlotTblIdCounter = shareString.getSerializedField().getModifiedCounter();
  }

  protected char[] checkCrtnSlotTblIdConstraints(char[] value) {
    return super.checkConstraints(value, 6, false, false);
  }
  /**
   * refreshCrtnSlotTblId is used to refresh the latest value of a variable from the Serialized
   * String the most common reason to serialize an Object as a string in to write to a file. There
   * can be several other reasons for serialization as well
   */
  public char[] refreshCrtnSlotTblId() {
    return (substring(
        getStringValue(), beginCrtnSlotTblId, beginCrtnSlotTblId + CRTN_SLOT_TBL_ID_LEN));
  }

  int localCrtnHipaaCdCounter = -1;

  public boolean isCrtnHipaaCdModified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localCrtnHipaaCdCounter != sharedCounter;
    localCrtnHipaaCdCounter = sharedCounter;
    return hasModified;
  }

  protected static final int CRTN_HIPAA_CD_LEN = 2;
  /** serialize this CrtnHipaaCd */
  protected void serializeCrtnHipaaCd(char[] crtnHipaaCd) {
    shareString.getSerializedField().incrementCounter();
    arraycopy(crtnHipaaCd, 0, getStringValue(), beginCrtnHipaaCd, CRTN_HIPAA_CD_LEN);
    localCrtnHipaaCdCounter = shareString.getSerializedField().getModifiedCounter();
  }

  protected char[] checkCrtnHipaaCdConstraints(char[] value) {
    return super.checkConstraints(value, 2, false, false);
  }
  /**
   * refreshCrtnHipaaCd is used to refresh the latest value of a variable from the Serialized String
   * the most common reason to serialize an Object as a string in to write to a file. There can be
   * several other reasons for serialization as well
   */
  public char[] refreshCrtnHipaaCd() {
    return (substring(getStringValue(), beginCrtnHipaaCd, beginCrtnHipaaCd + CRTN_HIPAA_CD_LEN));
  }

  int localCrtnHipaaVerNbrCounter = -1;

  public boolean isCrtnHipaaVerNbrModified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localCrtnHipaaVerNbrCounter != sharedCounter;
    localCrtnHipaaVerNbrCounter = sharedCounter;
    return hasModified;
  }

  protected static final int CRTN_HIPAA_VER_NBR_LEN = 1;
  /** serialize this CrtnHipaaVerNbr */
  protected void serializeCrtnHipaaVerNbr(char[] crtnHipaaVerNbr) {
    shareString.getSerializedField().incrementCounter();
    arraycopy(crtnHipaaVerNbr, 0, getStringValue(), beginCrtnHipaaVerNbr, CRTN_HIPAA_VER_NBR_LEN);
    localCrtnHipaaVerNbrCounter = shareString.getSerializedField().getModifiedCounter();
  }

  protected char[] checkCrtnHipaaVerNbrConstraints(char[] value) {
    return super.checkConstraints(value, 1, false, false);
  }
  /**
   * refreshCrtnHipaaVerNbr is used to refresh the latest value of a variable from the Serialized
   * String the most common reason to serialize an Object as a string in to write to a file. There
   * can be several other reasons for serialization as well
   */
  public char[] refreshCrtnHipaaVerNbr() {
    return (substring(
        getStringValue(), beginCrtnHipaaVerNbr, beginCrtnHipaaVerNbr + CRTN_HIPAA_VER_NBR_LEN));
  }

  int localCrtnStsCdCounter = -1;

  public boolean isCrtnStsCdModified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localCrtnStsCdCounter != sharedCounter;
    localCrtnStsCdCounter = sharedCounter;
    return hasModified;
  }

  protected static final int CRTN_STS_CD_LEN = 1;
  /** serialize this CrtnStsCd */
  protected void serializeCrtnStsCd(char[] crtnStsCd) {
    shareString.getSerializedField().incrementCounter();
    arraycopy(crtnStsCd, 0, getStringValue(), beginCrtnStsCd, CRTN_STS_CD_LEN);
    localCrtnStsCdCounter = shareString.getSerializedField().getModifiedCounter();
  }

  protected char[] checkCrtnStsCdConstraints(char[] value) {
    return super.checkConstraints(value, 1, false, false);
  }
  /**
   * refreshCrtnStsCd is used to refresh the latest value of a variable from the Serialized String
   * the most common reason to serialize an Object as a string in to write to a file. There can be
   * several other reasons for serialization as well
   */
  public char[] refreshCrtnStsCd() {
    return (substring(getStringValue(), beginCrtnStsCd, beginCrtnStsCd + CRTN_STS_CD_LEN));
  }
}
