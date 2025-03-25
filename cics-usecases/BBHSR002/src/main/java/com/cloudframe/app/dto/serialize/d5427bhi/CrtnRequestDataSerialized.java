package com.cloudframe.app.dto.serialize.d5427bhi;

/**
 * The class CrtnRequestDataSerialized is used to define offsets in order to serialize in a fixed
 * String
 *
 * @author CloudFrame Inc. created on 2025-03-25 at 08:32. using version 5.0.0.231
 */
import com.cloudframe.app.data.Field;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class CrtnRequestDataSerialized extends Field {

  protected Logger logger = LoggerFactory.getLogger(CrtnRequestDataSerialized.class);
  /*  Length of the field, if serialized as a String */
  protected static final int CRTN_REQUEST_DATA_LENGTH = 22;
  /*  offset of each of Child Fields when serialized as a String */
  protected int beginCrtnReqHipaaVerNbr;
  protected int beginCrtnReqEffDt;
  protected int beginCrtnReqCancDt;
  protected int beginCrtnReqStsCd;

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
    setParent(parent, 10); // serialize this field at offset 10 by default
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
    init(begin); // serialize this field at offset 10 by default
  }
  /** initializes the field in CrtnRequestDataSerialized */
  @Override
  protected void init(int begin) {
    setStartOffset(begin);
    setLength(CRTN_REQUEST_DATA_LENGTH);
    /*  set the offset/position of each field when this object is serialized as String */
    beginCrtnReqHipaaVerNbr = getStartOffset() + 0; // set offset for serialization

    beginCrtnReqEffDt = getStartOffset() + 1; // set offset for serialization

    beginCrtnReqCancDt = getStartOffset() + 11; // set offset for serialization

    beginCrtnReqStsCd = getStartOffset() + 21; // set offset for serialization

    /*  end of offset */
  }

  int localCrtnReqHipaaVerNbrCounter = -1;

  public boolean isCrtnReqHipaaVerNbrModified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localCrtnReqHipaaVerNbrCounter != sharedCounter;
    localCrtnReqHipaaVerNbrCounter = sharedCounter;
    return hasModified;
  }

  protected static final int CRTN_REQ_HIPAA_VER_NBR_LEN = 1;
  /** serialize this CrtnReqHipaaVerNbr */
  protected void serializeCrtnReqHipaaVerNbr(char[] crtnReqHipaaVerNbr) {
    shareString.getSerializedField().incrementCounter();
    arraycopy(
        crtnReqHipaaVerNbr,
        0,
        getStringValue(),
        beginCrtnReqHipaaVerNbr,
        CRTN_REQ_HIPAA_VER_NBR_LEN);
    localCrtnReqHipaaVerNbrCounter = shareString.getSerializedField().getModifiedCounter();
  }

  protected char[] checkCrtnReqHipaaVerNbrConstraints(char[] value) {
    return super.checkConstraints(value, 1, false, false);
  }
  /**
   * refreshCrtnReqHipaaVerNbr is used to refresh the latest value of a variable from the Serialized
   * String the most common reason to serialize an Object as a string in to write to a file. There
   * can be several other reasons for serialization as well
   */
  public char[] refreshCrtnReqHipaaVerNbr() {
    return (substring(
        getStringValue(),
        beginCrtnReqHipaaVerNbr,
        beginCrtnReqHipaaVerNbr + CRTN_REQ_HIPAA_VER_NBR_LEN));
  }

  int localCrtnReqEffDtCounter = -1;

  public boolean isCrtnReqEffDtModified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localCrtnReqEffDtCounter != sharedCounter;
    localCrtnReqEffDtCounter = sharedCounter;
    return hasModified;
  }

  protected static final int CRTN_REQ_EFF_DT_LEN = 10;
  /** serialize this CrtnReqEffDt */
  protected void serializeCrtnReqEffDt(char[] crtnReqEffDt) {
    shareString.getSerializedField().incrementCounter();
    arraycopy(crtnReqEffDt, 0, getStringValue(), beginCrtnReqEffDt, CRTN_REQ_EFF_DT_LEN);
    localCrtnReqEffDtCounter = shareString.getSerializedField().getModifiedCounter();
  }

  protected char[] checkCrtnReqEffDtConstraints(char[] value) {
    return super.checkConstraints(value, 10, false, false);
  }
  /**
   * refreshCrtnReqEffDt is used to refresh the latest value of a variable from the Serialized
   * String the most common reason to serialize an Object as a string in to write to a file. There
   * can be several other reasons for serialization as well
   */
  public char[] refreshCrtnReqEffDt() {
    return (substring(
        getStringValue(), beginCrtnReqEffDt, beginCrtnReqEffDt + CRTN_REQ_EFF_DT_LEN));
  }

  int localCrtnReqCancDtCounter = -1;

  public boolean isCrtnReqCancDtModified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localCrtnReqCancDtCounter != sharedCounter;
    localCrtnReqCancDtCounter = sharedCounter;
    return hasModified;
  }

  protected static final int CRTN_REQ_CANC_DT_LEN = 10;
  /** serialize this CrtnReqCancDt */
  protected void serializeCrtnReqCancDt(char[] crtnReqCancDt) {
    shareString.getSerializedField().incrementCounter();
    arraycopy(crtnReqCancDt, 0, getStringValue(), beginCrtnReqCancDt, CRTN_REQ_CANC_DT_LEN);
    localCrtnReqCancDtCounter = shareString.getSerializedField().getModifiedCounter();
  }

  protected char[] checkCrtnReqCancDtConstraints(char[] value) {
    return super.checkConstraints(value, 10, false, false);
  }
  /**
   * refreshCrtnReqCancDt is used to refresh the latest value of a variable from the Serialized
   * String the most common reason to serialize an Object as a string in to write to a file. There
   * can be several other reasons for serialization as well
   */
  public char[] refreshCrtnReqCancDt() {
    return (substring(
        getStringValue(), beginCrtnReqCancDt, beginCrtnReqCancDt + CRTN_REQ_CANC_DT_LEN));
  }

  int localCrtnReqStsCdCounter = -1;

  public boolean isCrtnReqStsCdModified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localCrtnReqStsCdCounter != sharedCounter;
    localCrtnReqStsCdCounter = sharedCounter;
    return hasModified;
  }

  protected static final int CRTN_REQ_STS_CD_LEN = 1;
  /** serialize this CrtnReqStsCd */
  protected void serializeCrtnReqStsCd(char[] crtnReqStsCd) {
    shareString.getSerializedField().incrementCounter();
    arraycopy(crtnReqStsCd, 0, getStringValue(), beginCrtnReqStsCd, CRTN_REQ_STS_CD_LEN);
    localCrtnReqStsCdCounter = shareString.getSerializedField().getModifiedCounter();
  }

  protected char[] checkCrtnReqStsCdConstraints(char[] value) {
    return super.checkConstraints(value, 1, false, false);
  }
  /**
   * refreshCrtnReqStsCd is used to refresh the latest value of a variable from the Serialized
   * String the most common reason to serialize an Object as a string in to write to a file. There
   * can be several other reasons for serialization as well
   */
  public char[] refreshCrtnReqStsCd() {
    return (substring(
        getStringValue(), beginCrtnReqStsCd, beginCrtnReqStsCd + CRTN_REQ_STS_CD_LEN));
  }
}
