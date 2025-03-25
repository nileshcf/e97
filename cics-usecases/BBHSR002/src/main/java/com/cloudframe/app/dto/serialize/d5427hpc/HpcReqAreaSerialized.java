package com.cloudframe.app.dto.serialize.d5427hpc;

/**
 * The class HpcReqAreaSerialized is used to define offsets in order to serialize in a fixed String
 *
 * @author CloudFrame Inc. created on 2025-03-25 at 08:29. using version 5.0.0.231
 */
import com.cloudframe.app.data.Field;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class HpcReqAreaSerialized extends Field {

  protected Logger logger = LoggerFactory.getLogger(HpcReqAreaSerialized.class);
  /*  Length of the field, if serialized as a String */
  protected static final int HPC_REQ_AREA_LENGTH = 11;
  /*  offset of each of Child Fields when serialized as a String */
  protected int beginHpcReqHipaaCd;
  protected int beginHpcReqHipaaVerNbr;
  protected int beginHpcReqClngProg;

  /** Constructor for HpcReqAreaSerialized */
  public HpcReqAreaSerialized() {
    // TO-DO auto generated code
  }

  /**
   * Constructor for HpcReqAreaSerialized. sets the parent value to the parent
   *
   * @param parent
   * @param begin
   */
  public HpcReqAreaSerialized(Field parent, int begin) {
    setParent(parent, begin);
  }

  /**
   * sets parent for this HpcReqAreaSerialized to the parent
   *
   * @param parent
   */
  @Override
  public void setParent(Field parent) {
    setParent(parent, 0); // serialize this field at offset 0 by default
  }

  /**
   * sets parent for this HpcReqAreaSerialized to the parent and set the serialize offset to
   * parameter begin
   *
   * @param parent
   * @param begin - offset used when serializing this object to a String
   */
  public void setParent(Field parent, int begin) {
    super.setParent(parent);
    init(begin); // serialize this field at offset 0 by default
  }
  /** initializes the field in HpcReqAreaSerialized */
  @Override
  protected void init(int begin) {
    setStartOffset(begin);
    setLength(HPC_REQ_AREA_LENGTH);
    /*  set the offset/position of each field when this object is serialized as String */
    beginHpcReqHipaaCd = getStartOffset() + 0; // set offset for serialization

    beginHpcReqHipaaVerNbr = getStartOffset() + 2; // set offset for serialization

    beginHpcReqClngProg = getStartOffset() + 3; // set offset for serialization

    /*  end of offset */
  }

  int localHpcReqHipaaCdCounter = -1;

  public boolean isHpcReqHipaaCdModified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localHpcReqHipaaCdCounter != sharedCounter;
    localHpcReqHipaaCdCounter = sharedCounter;
    return hasModified;
  }

  protected static final int HPC_REQ_HIPAA_CD_LEN = 2;
  /** serialize this HpcReqHipaaCd */
  protected void serializeHpcReqHipaaCd(char[] hpcReqHipaaCd) {
    shareString.getSerializedField().incrementCounter();
    arraycopy(hpcReqHipaaCd, 0, getStringValue(), beginHpcReqHipaaCd, HPC_REQ_HIPAA_CD_LEN);
    localHpcReqHipaaCdCounter = shareString.getSerializedField().getModifiedCounter();
  }

  protected char[] checkHpcReqHipaaCdConstraints(char[] value) {
    return super.checkConstraints(value, 2, false, false);
  }
  /**
   * refreshHpcReqHipaaCd is used to refresh the latest value of a variable from the Serialized
   * String the most common reason to serialize an Object as a string in to write to a file. There
   * can be several other reasons for serialization as well
   */
  public char[] refreshHpcReqHipaaCd() {
    return (substring(
        getStringValue(), beginHpcReqHipaaCd, beginHpcReqHipaaCd + HPC_REQ_HIPAA_CD_LEN));
  }

  int localHpcReqHipaaVerNbrCounter = -1;

  public boolean isHpcReqHipaaVerNbrModified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localHpcReqHipaaVerNbrCounter != sharedCounter;
    localHpcReqHipaaVerNbrCounter = sharedCounter;
    return hasModified;
  }

  protected static final int HPC_REQ_HIPAA_VER_NBR_LEN = 1;
  /** serialize this HpcReqHipaaVerNbr */
  protected void serializeHpcReqHipaaVerNbr(char[] hpcReqHipaaVerNbr) {
    shareString.getSerializedField().incrementCounter();
    arraycopy(
        hpcReqHipaaVerNbr, 0, getStringValue(), beginHpcReqHipaaVerNbr, HPC_REQ_HIPAA_VER_NBR_LEN);
    localHpcReqHipaaVerNbrCounter = shareString.getSerializedField().getModifiedCounter();
  }

  protected char[] checkHpcReqHipaaVerNbrConstraints(char[] value) {
    return super.checkConstraints(value, 1, false, false);
  }
  /**
   * refreshHpcReqHipaaVerNbr is used to refresh the latest value of a variable from the Serialized
   * String the most common reason to serialize an Object as a string in to write to a file. There
   * can be several other reasons for serialization as well
   */
  public char[] refreshHpcReqHipaaVerNbr() {
    return (substring(
        getStringValue(),
        beginHpcReqHipaaVerNbr,
        beginHpcReqHipaaVerNbr + HPC_REQ_HIPAA_VER_NBR_LEN));
  }

  int localHpcReqClngProgCounter = -1;

  public boolean isHpcReqClngProgModified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localHpcReqClngProgCounter != sharedCounter;
    localHpcReqClngProgCounter = sharedCounter;
    return hasModified;
  }

  protected static final int HPC_REQ_CLNG_PROG_LEN = 8;
  /** serialize this HpcReqClngProg */
  protected void serializeHpcReqClngProg(char[] hpcReqClngProg) {
    shareString.getSerializedField().incrementCounter();
    arraycopy(hpcReqClngProg, 0, getStringValue(), beginHpcReqClngProg, HPC_REQ_CLNG_PROG_LEN);
    localHpcReqClngProgCounter = shareString.getSerializedField().getModifiedCounter();
  }

  protected char[] checkHpcReqClngProgConstraints(char[] value) {
    return super.checkConstraints(value, 8, false, false);
  }
  /**
   * refreshHpcReqClngProg is used to refresh the latest value of a variable from the Serialized
   * String the most common reason to serialize an Object as a string in to write to a file. There
   * can be several other reasons for serialization as well
   */
  public char[] refreshHpcReqClngProg() {
    return (substring(
        getStringValue(), beginHpcReqClngProg, beginHpcReqClngProg + HPC_REQ_CLNG_PROG_LEN));
  }
}
