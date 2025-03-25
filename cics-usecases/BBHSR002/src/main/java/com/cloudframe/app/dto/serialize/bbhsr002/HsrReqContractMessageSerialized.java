package com.cloudframe.app.dto.serialize.bbhsr002;

/**
 * The class HsrReqContractMessageSerialized is used to define offsets in order to serialize in a
 * fixed String
 *
 * @author CloudFrame Inc. created on 2025-03-25 at 08:29. using version 5.0.0.231
 */
import com.cloudframe.app.data.Field;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class HsrReqContractMessageSerialized extends Field {

  protected Logger logger = LoggerFactory.getLogger(HsrReqContractMessageSerialized.class);
  /*  Length of the field, if serialized as a String */
  protected static final int HSR_REQ_CONTRACT_MESSAGE_LENGTH = 3;
  /*  offset of each of Child Fields when serialized as a String */
  protected int beginHsrReqContractRtnCd;

  /** Constructor for HsrReqContractMessageSerialized */
  public HsrReqContractMessageSerialized() {
    // TO-DO auto generated code
  }

  /**
   * Constructor for HsrReqContractMessageSerialized. sets the parent value to the parent
   *
   * @param parent
   * @param begin
   */
  public HsrReqContractMessageSerialized(Field parent, int begin) {
    setParent(parent, begin);
  }

  /**
   * sets parent for this HsrReqContractMessageSerialized to the parent
   *
   * @param parent
   */
  @Override
  public void setParent(Field parent) {
    setParent(parent, 40); // serialize this field at offset 40 by default
  }

  /**
   * sets parent for this HsrReqContractMessageSerialized to the parent and set the serialize offset
   * to parameter begin
   *
   * @param parent
   * @param begin - offset used when serializing this object to a String
   */
  public void setParent(Field parent, int begin) {
    super.setParent(parent);
    init(begin); // serialize this field at offset 40 by default
  }
  /** initializes the field in HsrReqContractMessageSerialized */
  @Override
  protected void init(int begin) {
    setStartOffset(begin);
    setLength(HSR_REQ_CONTRACT_MESSAGE_LENGTH);
    /*  set the offset/position of each field when this object is serialized as String */
    beginHsrReqContractRtnCd = getStartOffset() + 0; // set offset for serialization

    /*  end of offset */
  }

  int localHsrReqContractRtnCdCounter = -1;

  public boolean isHsrReqContractRtnCdModified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localHsrReqContractRtnCdCounter != sharedCounter;
    localHsrReqContractRtnCdCounter = sharedCounter;
    return hasModified;
  }

  protected static final int HSR_REQ_CONTRACT_RTN_CD_LEN = 3;
  /** serialize this HsrReqContractRtnCd */
  protected void serializeHsrReqContractRtnCd(char[] hsrReqContractRtnCd) {
    shareString.getSerializedField().incrementCounter();
    arraycopy(
        hsrReqContractRtnCd,
        0,
        getStringValue(),
        beginHsrReqContractRtnCd,
        HSR_REQ_CONTRACT_RTN_CD_LEN);
    localHsrReqContractRtnCdCounter = shareString.getSerializedField().getModifiedCounter();
  }

  protected char[] checkHsrReqContractRtnCdConstraints(char[] value) {
    return super.checkConstraints(value, 3, false, false);
  }
  /**
   * refreshHsrReqContractRtnCd is used to refresh the latest value of a variable from the
   * Serialized String the most common reason to serialize an Object as a string in to write to a
   * file. There can be several other reasons for serialization as well
   */
  public char[] refreshHsrReqContractRtnCd() {
    return (substring(
        getStringValue(),
        beginHsrReqContractRtnCd,
        beginHsrReqContractRtnCd + HSR_REQ_CONTRACT_RTN_CD_LEN));
  }
}
