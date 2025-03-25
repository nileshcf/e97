package com.cloudframe.app.dto.serialize.bbhsr002;

/**
 * The class ScnReqAreaSerialized is used to define offsets in order to serialize in a fixed String
 *
 * @author CloudFrame Inc. created on 2025-03-25 at 08:29. using version 5.0.0.231
 */
import com.cloudframe.app.data.Field;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ScnReqAreaSerialized extends Field {

  protected Logger logger = LoggerFactory.getLogger(ScnReqAreaSerialized.class);
  /*  Length of the field, if serialized as a String */
  protected static final int SCN_REQ_AREA_LENGTH = 34;
  /*  offset of each of Child Fields when serialized as a String */
  protected int beginScnReqSrvcCd;
  protected int beginScnReqEffDt;
  protected int beginScnReqCancDt;
  protected int beginScnReqClngProg;

  /** Constructor for ScnReqAreaSerialized */
  public ScnReqAreaSerialized() {
    // TO-DO auto generated code
  }

  /**
   * Constructor for ScnReqAreaSerialized. sets the parent value to the parent
   *
   * @param parent
   * @param begin
   */
  public ScnReqAreaSerialized(Field parent, int begin) {
    setParent(parent, begin);
  }

  /**
   * sets parent for this ScnReqAreaSerialized to the parent
   *
   * @param parent
   */
  @Override
  public void setParent(Field parent) {
    setParent(parent, 0); // serialize this field at offset 0 by default
  }

  /**
   * sets parent for this ScnReqAreaSerialized to the parent and set the serialize offset to
   * parameter begin
   *
   * @param parent
   * @param begin - offset used when serializing this object to a String
   */
  public void setParent(Field parent, int begin) {
    super.setParent(parent);
    init(begin); // serialize this field at offset 0 by default
  }
  /** initializes the field in ScnReqAreaSerialized */
  @Override
  protected void init(int begin) {
    setStartOffset(begin);
    setLength(SCN_REQ_AREA_LENGTH);
    /*  set the offset/position of each field when this object is serialized as String */
    beginScnReqSrvcCd = getStartOffset() + 0; // set offset for serialization

    beginScnReqEffDt = getStartOffset() + 6; // set offset for serialization

    beginScnReqCancDt = getStartOffset() + 16; // set offset for serialization

    beginScnReqClngProg = getStartOffset() + 26; // set offset for serialization

    /*  end of offset */
  }

  int localScnReqSrvcCdCounter = -1;

  public boolean isScnReqSrvcCdModified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localScnReqSrvcCdCounter != sharedCounter;
    localScnReqSrvcCdCounter = sharedCounter;
    return hasModified;
  }

  protected static final int SCN_REQ_SRVC_CD_LEN = 6;
  /** serialize this ScnReqSrvcCd */
  protected void serializeScnReqSrvcCd(char[] scnReqSrvcCd) {
    shareString.getSerializedField().incrementCounter();
    arraycopy(scnReqSrvcCd, 0, getStringValue(), beginScnReqSrvcCd, SCN_REQ_SRVC_CD_LEN);
    localScnReqSrvcCdCounter = shareString.getSerializedField().getModifiedCounter();
  }

  protected char[] checkScnReqSrvcCdConstraints(char[] value) {
    return super.checkConstraints(value, 6, false, false);
  }
  /**
   * refreshScnReqSrvcCd is used to refresh the latest value of a variable from the Serialized
   * String the most common reason to serialize an Object as a string in to write to a file. There
   * can be several other reasons for serialization as well
   */
  public char[] refreshScnReqSrvcCd() {
    return (substring(
        getStringValue(), beginScnReqSrvcCd, beginScnReqSrvcCd + SCN_REQ_SRVC_CD_LEN));
  }

  int localScnReqEffDtCounter = -1;

  public boolean isScnReqEffDtModified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localScnReqEffDtCounter != sharedCounter;
    localScnReqEffDtCounter = sharedCounter;
    return hasModified;
  }

  protected static final int SCN_REQ_EFF_DT_LEN = 10;
  /** serialize this ScnReqEffDt */
  protected void serializeScnReqEffDt(char[] scnReqEffDt) {
    shareString.getSerializedField().incrementCounter();
    arraycopy(scnReqEffDt, 0, getStringValue(), beginScnReqEffDt, SCN_REQ_EFF_DT_LEN);
    localScnReqEffDtCounter = shareString.getSerializedField().getModifiedCounter();
  }

  protected char[] checkScnReqEffDtConstraints(char[] value) {
    return super.checkConstraints(value, 10, false, false);
  }
  /**
   * refreshScnReqEffDt is used to refresh the latest value of a variable from the Serialized String
   * the most common reason to serialize an Object as a string in to write to a file. There can be
   * several other reasons for serialization as well
   */
  public char[] refreshScnReqEffDt() {
    return (substring(getStringValue(), beginScnReqEffDt, beginScnReqEffDt + SCN_REQ_EFF_DT_LEN));
  }

  int localScnReqCancDtCounter = -1;

  public boolean isScnReqCancDtModified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localScnReqCancDtCounter != sharedCounter;
    localScnReqCancDtCounter = sharedCounter;
    return hasModified;
  }

  protected static final int SCN_REQ_CANC_DT_LEN = 10;
  /** serialize this ScnReqCancDt */
  protected void serializeScnReqCancDt(char[] scnReqCancDt) {
    shareString.getSerializedField().incrementCounter();
    arraycopy(scnReqCancDt, 0, getStringValue(), beginScnReqCancDt, SCN_REQ_CANC_DT_LEN);
    localScnReqCancDtCounter = shareString.getSerializedField().getModifiedCounter();
  }

  protected char[] checkScnReqCancDtConstraints(char[] value) {
    return super.checkConstraints(value, 10, false, false);
  }
  /**
   * refreshScnReqCancDt is used to refresh the latest value of a variable from the Serialized
   * String the most common reason to serialize an Object as a string in to write to a file. There
   * can be several other reasons for serialization as well
   */
  public char[] refreshScnReqCancDt() {
    return (substring(
        getStringValue(), beginScnReqCancDt, beginScnReqCancDt + SCN_REQ_CANC_DT_LEN));
  }

  int localScnReqClngProgCounter = -1;

  public boolean isScnReqClngProgModified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localScnReqClngProgCounter != sharedCounter;
    localScnReqClngProgCounter = sharedCounter;
    return hasModified;
  }

  protected static final int SCN_REQ_CLNG_PROG_LEN = 8;
  /** serialize this ScnReqClngProg */
  protected void serializeScnReqClngProg(char[] scnReqClngProg) {
    shareString.getSerializedField().incrementCounter();
    arraycopy(scnReqClngProg, 0, getStringValue(), beginScnReqClngProg, SCN_REQ_CLNG_PROG_LEN);
    localScnReqClngProgCounter = shareString.getSerializedField().getModifiedCounter();
  }

  protected char[] checkScnReqClngProgConstraints(char[] value) {
    return super.checkConstraints(value, 8, false, false);
  }
  /**
   * refreshScnReqClngProg is used to refresh the latest value of a variable from the Serialized
   * String the most common reason to serialize an Object as a string in to write to a file. There
   * can be several other reasons for serialization as well
   */
  public char[] refreshScnReqClngProg() {
    return (substring(
        getStringValue(), beginScnReqClngProg, beginScnReqClngProg + SCN_REQ_CLNG_PROG_LEN));
  }
}
