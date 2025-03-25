package com.cloudframe.app.dto.serialize.bbhsr002;

/**
 * The class HpcRetHipaaSerialized is used to define offsets in order to serialize in a fixed String
 *
 * @author CloudFrame Inc. created on 2025-03-25 at 08:29. using version 5.0.0.231
 */
import com.cloudframe.app.data.Field;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class HpcRetHipaaSerialized extends Field {

  protected Logger logger = LoggerFactory.getLogger(HpcRetHipaaSerialized.class);
  /*  Length of the field, if serialized as a String */
  protected static final int HPC_RET_HIPAA_LENGTH = 3;
  /*  offset of each of Child Fields when serialized as a String */
  protected int beginHpcRetHipaaCd;
  protected int beginHpcRetGrnrcRqstCd;

  /** Constructor for HpcRetHipaaSerialized */
  public HpcRetHipaaSerialized() {
    // TO-DO auto generated code
  }

  /**
   * Constructor for HpcRetHipaaSerialized. sets the parent value to the parent
   *
   * @param parent
   * @param begin
   */
  public HpcRetHipaaSerialized(Field parent, int begin) {
    setParent(parent, begin);
  }

  /**
   * sets parent for this HpcRetHipaaSerialized to the parent
   *
   * @param parent
   */
  @Override
  public void setParent(Field parent) {
    setParent(parent, 15); // serialize this field at offset 15 by default
  }

  /**
   * sets parent for this HpcRetHipaaSerialized to the parent and set the serialize offset to
   * parameter begin
   *
   * @param parent
   * @param begin - offset used when serializing this object to a String
   */
  public void setParent(Field parent, int begin) {
    super.setParent(parent);
    init(begin); // serialize this field at offset 15 by default
  }
  /** initializes the field in HpcRetHipaaSerialized */
  @Override
  protected void init(int begin) {
    setStartOffset(begin);
    setLength(HPC_RET_HIPAA_LENGTH);
    /*  set the offset/position of each field when this object is serialized as String */
    beginHpcRetHipaaCd = getStartOffset() + 0; // set offset for serialization

    beginHpcRetGrnrcRqstCd = getStartOffset() + 2; // set offset for serialization

    /*  end of offset */
  }

  int localHpcRetHipaaCdCounter = -1;

  public boolean isHpcRetHipaaCdModified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localHpcRetHipaaCdCounter != sharedCounter;
    localHpcRetHipaaCdCounter = sharedCounter;
    return hasModified;
  }

  protected static final int HPC_RET_HIPAA_CD_LEN = 2;
  /** serialize this HpcRetHipaaCd */
  protected void serializeHpcRetHipaaCd(char[] hpcRetHipaaCd) {
    shareString.getSerializedField().incrementCounter();
    arraycopy(hpcRetHipaaCd, 0, getStringValue(), beginHpcRetHipaaCd, HPC_RET_HIPAA_CD_LEN);
    localHpcRetHipaaCdCounter = shareString.getSerializedField().getModifiedCounter();
  }

  protected char[] checkHpcRetHipaaCdConstraints(char[] value) {
    return super.checkConstraints(value, 2, false, false);
  }
  /**
   * refreshHpcRetHipaaCd is used to refresh the latest value of a variable from the Serialized
   * String the most common reason to serialize an Object as a string in to write to a file. There
   * can be several other reasons for serialization as well
   */
  public char[] refreshHpcRetHipaaCd() {
    return (substring(
        getStringValue(), beginHpcRetHipaaCd, beginHpcRetHipaaCd + HPC_RET_HIPAA_CD_LEN));
  }

  int localHpcRetGrnrcRqstCdCounter = -1;

  public boolean isHpcRetGrnrcRqstCdModified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localHpcRetGrnrcRqstCdCounter != sharedCounter;
    localHpcRetGrnrcRqstCdCounter = sharedCounter;
    return hasModified;
  }

  protected static final int HPC_RET_GRNRC_RQST_CD_LEN = 1;
  /** serialize this HpcRetGrnrcRqstCd */
  protected void serializeHpcRetGrnrcRqstCd(char[] hpcRetGrnrcRqstCd) {
    shareString.getSerializedField().incrementCounter();
    arraycopy(
        hpcRetGrnrcRqstCd, 0, getStringValue(), beginHpcRetGrnrcRqstCd, HPC_RET_GRNRC_RQST_CD_LEN);
    localHpcRetGrnrcRqstCdCounter = shareString.getSerializedField().getModifiedCounter();
  }

  protected char[] checkHpcRetGrnrcRqstCdConstraints(char[] value) {
    return super.checkConstraints(value, 1, false, false);
  }
  /**
   * refreshHpcRetGrnrcRqstCd is used to refresh the latest value of a variable from the Serialized
   * String the most common reason to serialize an Object as a string in to write to a file. There
   * can be several other reasons for serialization as well
   */
  public char[] refreshHpcRetGrnrcRqstCd() {
    return (substring(
        getStringValue(),
        beginHpcRetGrnrcRqstCd,
        beginHpcRetGrnrcRqstCd + HPC_RET_GRNRC_RQST_CD_LEN));
  }
}
