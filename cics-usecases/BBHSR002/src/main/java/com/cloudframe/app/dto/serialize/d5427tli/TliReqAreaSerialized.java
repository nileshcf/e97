package com.cloudframe.app.dto.serialize.d5427tli;

/**
 * The class TliReqAreaSerialized is used to define offsets in order to serialize in a fixed String
 *
 * @author CloudFrame Inc. created on 2025-03-25 at 08:32. using version 5.0.0.231
 */
import com.cloudframe.app.data.Field;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class TliReqAreaSerialized extends Field {

  protected Logger logger = LoggerFactory.getLogger(TliReqAreaSerialized.class);
  /*  Length of the field, if serialized as a String */
  protected static final int TLI_REQ_AREA_LENGTH = 32;
  /*  offset of each of Child Fields when serialized as a String */
  protected int beginTliReqClngProg;
  protected int beginTliReqPolNbr;
  protected int beginTliReqPlnNbr;
  protected int beginTliReqObligId;
  protected int beginTliReqShrArngCd;
  protected int beginTliReqStartDt;

  /** Constructor for TliReqAreaSerialized */
  public TliReqAreaSerialized() {
    // TO-DO auto generated code
  }

  /**
   * Constructor for TliReqAreaSerialized. sets the parent value to the parent
   *
   * @param parent
   * @param begin
   */
  public TliReqAreaSerialized(Field parent, int begin) {
    setParent(parent, begin);
  }

  /**
   * sets parent for this TliReqAreaSerialized to the parent
   *
   * @param parent
   */
  @Override
  public void setParent(Field parent) {
    setParent(parent, 0); // serialize this field at offset 0 by default
  }

  /**
   * sets parent for this TliReqAreaSerialized to the parent and set the serialize offset to
   * parameter begin
   *
   * @param parent
   * @param begin - offset used when serializing this object to a String
   */
  public void setParent(Field parent, int begin) {
    super.setParent(parent);
    init(begin); // serialize this field at offset 0 by default
  }
  /** initializes the field in TliReqAreaSerialized */
  @Override
  protected void init(int begin) {
    setStartOffset(begin);
    setLength(TLI_REQ_AREA_LENGTH);
    /*  set the offset/position of each field when this object is serialized as String */
    beginTliReqClngProg = getStartOffset() + 0; // set offset for serialization

    beginTliReqPolNbr = getStartOffset() + 8; // set offset for serialization

    beginTliReqPlnNbr = getStartOffset() + 14; // set offset for serialization

    beginTliReqObligId = getStartOffset() + 18; // set offset for serialization

    beginTliReqShrArngCd = getStartOffset() + 20; // set offset for serialization

    beginTliReqStartDt = getStartOffset() + 22; // set offset for serialization

    /*  end of offset */
  }

  int localTliReqClngProgCounter = -1;

  public boolean isTliReqClngProgModified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localTliReqClngProgCounter != sharedCounter;
    localTliReqClngProgCounter = sharedCounter;
    return hasModified;
  }

  protected static final int TLI_REQ_CLNG_PROG_LEN = 8;
  /** serialize this TliReqClngProg */
  protected void serializeTliReqClngProg(char[] tliReqClngProg) {
    shareString.getSerializedField().incrementCounter();
    arraycopy(tliReqClngProg, 0, getStringValue(), beginTliReqClngProg, TLI_REQ_CLNG_PROG_LEN);
    localTliReqClngProgCounter = shareString.getSerializedField().getModifiedCounter();
  }

  protected char[] checkTliReqClngProgConstraints(char[] value) {
    return super.checkConstraints(value, 8, false, false);
  }
  /**
   * refreshTliReqClngProg is used to refresh the latest value of a variable from the Serialized
   * String the most common reason to serialize an Object as a string in to write to a file. There
   * can be several other reasons for serialization as well
   */
  public char[] refreshTliReqClngProg() {
    return (substring(
        getStringValue(), beginTliReqClngProg, beginTliReqClngProg + TLI_REQ_CLNG_PROG_LEN));
  }

  int localTliReqPolNbrCounter = -1;

  public boolean isTliReqPolNbrModified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localTliReqPolNbrCounter != sharedCounter;
    localTliReqPolNbrCounter = sharedCounter;
    return hasModified;
  }

  protected static final int TLI_REQ_POL_NBR_LEN = 6;
  /** serialize this TliReqPolNbr */
  protected void serializeTliReqPolNbr(char[] tliReqPolNbr) {
    shareString.getSerializedField().incrementCounter();
    arraycopy(tliReqPolNbr, 0, getStringValue(), beginTliReqPolNbr, TLI_REQ_POL_NBR_LEN);
    localTliReqPolNbrCounter = shareString.getSerializedField().getModifiedCounter();
  }

  protected char[] checkTliReqPolNbrConstraints(char[] value) {
    return super.checkConstraints(value, 6, false, false);
  }
  /**
   * refreshTliReqPolNbr is used to refresh the latest value of a variable from the Serialized
   * String the most common reason to serialize an Object as a string in to write to a file. There
   * can be several other reasons for serialization as well
   */
  public char[] refreshTliReqPolNbr() {
    return (substring(
        getStringValue(), beginTliReqPolNbr, beginTliReqPolNbr + TLI_REQ_POL_NBR_LEN));
  }

  int localTliReqPlnNbrCounter = -1;

  public boolean isTliReqPlnNbrModified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localTliReqPlnNbrCounter != sharedCounter;
    localTliReqPlnNbrCounter = sharedCounter;
    return hasModified;
  }

  protected static final int TLI_REQ_PLN_NBR_LEN = 4;
  /** serialize this TliReqPlnNbr */
  protected void serializeTliReqPlnNbr(char[] tliReqPlnNbr) {
    shareString.getSerializedField().incrementCounter();
    arraycopy(tliReqPlnNbr, 0, getStringValue(), beginTliReqPlnNbr, TLI_REQ_PLN_NBR_LEN);
    localTliReqPlnNbrCounter = shareString.getSerializedField().getModifiedCounter();
  }

  protected char[] checkTliReqPlnNbrConstraints(char[] value) {
    return super.checkConstraints(value, 4, false, false);
  }
  /**
   * refreshTliReqPlnNbr is used to refresh the latest value of a variable from the Serialized
   * String the most common reason to serialize an Object as a string in to write to a file. There
   * can be several other reasons for serialization as well
   */
  public char[] refreshTliReqPlnNbr() {
    return (substring(
        getStringValue(), beginTliReqPlnNbr, beginTliReqPlnNbr + TLI_REQ_PLN_NBR_LEN));
  }

  int localTliReqObligIdCounter = -1;

  public boolean isTliReqObligIdModified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localTliReqObligIdCounter != sharedCounter;
    localTliReqObligIdCounter = sharedCounter;
    return hasModified;
  }

  protected static final int TLI_REQ_OBLIG_ID_LEN = 2;
  /** serialize this TliReqObligId */
  protected void serializeTliReqObligId(char[] tliReqObligId) {
    shareString.getSerializedField().incrementCounter();
    arraycopy(tliReqObligId, 0, getStringValue(), beginTliReqObligId, TLI_REQ_OBLIG_ID_LEN);
    localTliReqObligIdCounter = shareString.getSerializedField().getModifiedCounter();
  }

  protected char[] checkTliReqObligIdConstraints(char[] value) {
    return super.checkConstraints(value, 2, false, false);
  }
  /**
   * refreshTliReqObligId is used to refresh the latest value of a variable from the Serialized
   * String the most common reason to serialize an Object as a string in to write to a file. There
   * can be several other reasons for serialization as well
   */
  public char[] refreshTliReqObligId() {
    return (substring(
        getStringValue(), beginTliReqObligId, beginTliReqObligId + TLI_REQ_OBLIG_ID_LEN));
  }

  int localTliReqShrArngCdCounter = -1;

  public boolean isTliReqShrArngCdModified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localTliReqShrArngCdCounter != sharedCounter;
    localTliReqShrArngCdCounter = sharedCounter;
    return hasModified;
  }

  protected static final int TLI_REQ_SHR_ARNG_CD_LEN = 2;
  /** serialize this TliReqShrArngCd */
  protected void serializeTliReqShrArngCd(char[] tliReqShrArngCd) {
    shareString.getSerializedField().incrementCounter();
    arraycopy(tliReqShrArngCd, 0, getStringValue(), beginTliReqShrArngCd, TLI_REQ_SHR_ARNG_CD_LEN);
    localTliReqShrArngCdCounter = shareString.getSerializedField().getModifiedCounter();
  }

  protected char[] checkTliReqShrArngCdConstraints(char[] value) {
    return super.checkConstraints(value, 2, false, false);
  }
  /**
   * refreshTliReqShrArngCd is used to refresh the latest value of a variable from the Serialized
   * String the most common reason to serialize an Object as a string in to write to a file. There
   * can be several other reasons for serialization as well
   */
  public char[] refreshTliReqShrArngCd() {
    return (substring(
        getStringValue(), beginTliReqShrArngCd, beginTliReqShrArngCd + TLI_REQ_SHR_ARNG_CD_LEN));
  }

  int localTliReqStartDtCounter = -1;

  public boolean isTliReqStartDtModified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localTliReqStartDtCounter != sharedCounter;
    localTliReqStartDtCounter = sharedCounter;
    return hasModified;
  }

  protected static final int TLI_REQ_START_DT_LEN = 10;
  /** serialize this TliReqStartDt */
  protected void serializeTliReqStartDt(char[] tliReqStartDt) {
    shareString.getSerializedField().incrementCounter();
    arraycopy(tliReqStartDt, 0, getStringValue(), beginTliReqStartDt, TLI_REQ_START_DT_LEN);
    localTliReqStartDtCounter = shareString.getSerializedField().getModifiedCounter();
  }

  protected char[] checkTliReqStartDtConstraints(char[] value) {
    return super.checkConstraints(value, 10, false, false);
  }
  /**
   * refreshTliReqStartDt is used to refresh the latest value of a variable from the Serialized
   * String the most common reason to serialize an Object as a string in to write to a file. There
   * can be several other reasons for serialization as well
   */
  public char[] refreshTliReqStartDt() {
    return (substring(
        getStringValue(), beginTliReqStartDt, beginTliReqStartDt + TLI_REQ_START_DT_LEN));
  }
}
