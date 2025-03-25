package com.cloudframe.app.dto.serialize.bbhsr002;

/**
 * The class HpcRetAreaSerialized is used to define offsets in order to serialize in a fixed String
 *
 * @author CloudFrame Inc. created on 2025-03-25 at 08:29. using version 5.0.0.231
 */
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class HpcRetAreaSerialized extends Field {

  protected Logger logger = LoggerFactory.getLogger(HpcRetAreaSerialized.class);
  /*  Length of the field, if serialized as a String */
  protected static final int HPC_RET_AREA_LENGTH = 904;
  /*  offset of each of Child Fields when serialized as a String */
  protected int beginHpcRetCodeMoreSw;
  protected int beginHpcRetCnt;
  protected int beginHpcRetHipaa;
  protected static final int HPC_RET_HIPAA_SIZE = 300;

  /** Constructor for HpcRetAreaSerialized */
  public HpcRetAreaSerialized() {
    // TO-DO auto generated code
  }

  /**
   * Constructor for HpcRetAreaSerialized. sets the parent value to the parent
   *
   * @param parent
   * @param begin
   */
  public HpcRetAreaSerialized(Field parent, int begin) {
    setParent(parent, begin);
  }

  /**
   * sets parent for this HpcRetAreaSerialized to the parent
   *
   * @param parent
   */
  @Override
  public void setParent(Field parent) {
    setParent(parent, 11); // serialize this field at offset 11 by default
  }

  /**
   * sets parent for this HpcRetAreaSerialized to the parent and set the serialize offset to
   * parameter begin
   *
   * @param parent
   * @param begin - offset used when serializing this object to a String
   */
  public void setParent(Field parent, int begin) {
    super.setParent(parent);
    init(begin); // serialize this field at offset 11 by default
  }
  /** initializes the field in HpcRetAreaSerialized */
  @Override
  protected void init(int begin) {
    setStartOffset(begin);
    setLength(HPC_RET_AREA_LENGTH);
    /*  set the offset/position of each field when this object is serialized as String */
    beginHpcRetCodeMoreSw = getStartOffset() + 0; // set offset for serialization

    beginHpcRetCnt = getStartOffset() + 1; // set offset for serialization

    beginHpcRetHipaa = getStartOffset() + 4; // set offset for serialization

    /*  end of offset */
  }

  int localHpcRetCodeMoreSwCounter = -1;

  public boolean isHpcRetCodeMoreSwModified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localHpcRetCodeMoreSwCounter != sharedCounter;
    localHpcRetCodeMoreSwCounter = sharedCounter;
    return hasModified;
  }

  protected static final int HPC_RET_CODE_MORE_SW_LEN = 1;
  /** serialize this HpcRetCodeMoreSw */
  protected void serializeHpcRetCodeMoreSw(char[] hpcRetCodeMoreSw) {
    shareString.getSerializedField().incrementCounter();
    arraycopy(
        hpcRetCodeMoreSw, 0, getStringValue(), beginHpcRetCodeMoreSw, HPC_RET_CODE_MORE_SW_LEN);
    localHpcRetCodeMoreSwCounter = shareString.getSerializedField().getModifiedCounter();
  }

  protected char[] checkHpcRetCodeMoreSwConstraints(char[] value) {
    return super.checkConstraints(value, 1, false, false);
  }
  /**
   * refreshHpcRetCodeMoreSw is used to refresh the latest value of a variable from the Serialized
   * String the most common reason to serialize an Object as a string in to write to a file. There
   * can be several other reasons for serialization as well
   */
  public char[] refreshHpcRetCodeMoreSw() {
    return (substring(
        getStringValue(), beginHpcRetCodeMoreSw, beginHpcRetCodeMoreSw + HPC_RET_CODE_MORE_SW_LEN));
  }

  int localHpcRetCntCounter = -1;

  public boolean isHpcRetCntModified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localHpcRetCntCounter != sharedCounter;
    localHpcRetCntCounter = sharedCounter;
    return hasModified;
  }

  /**
   * Returns String value of hpcRetCnt
   *
   * @return hpcRetCnt
   */
  public char[] getHpcRetCntString() {
    return getCharArray(beginHpcRetCnt, HPC_RET_CNT_LEN);
  }

  /**
   * This method allows testing if there is a numeric value stored in the serialized String
   *
   * @return true if numeric value is stored in the string
   */
  public boolean hpcRetCntIsNumeric() {
    return isNumeric(
        beginHpcRetCnt,
        beginHpcRetCnt + HPC_RET_CNT_LEN,
        false /*Signed*/,
        true /*isSign trailing*/,
        false /*isSignStoredSeparately*/);
  }

  protected static final int HPC_RET_CNT_LEN = 3;
  /** serializeHpcRetCnt */
  protected void serializeHpcRetCnt(int hpcRetCnt) {
    putNumber(
        beginHpcRetCnt,
        hpcRetCnt,
        HPC_RET_CNT_LEN,
        false /*isSigned?*/,
        true /*signTrailing?*/,
        false /*storeSignSeparate?*/);
    localHpcRetCntCounter = shareString.getSerializedField().getModifiedCounter();
  }
  /** serializeHpcRetCnt */
  protected int serializeHpcRetCnt(char[] value) {
    int hpcRetCnt;
    if (value.length > 0 && value.length != 3) value = new String(value).trim().toCharArray();
    if (value.length < 3) value = pad(3, value, ' ', LEFT_PAD);
    else if (value.length > 3) value = substring(value, 0, 3);
    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
    hpcRetCnt =
        (int)
            convertString2Number(
                value, false /*isSigned?*/, true /*signTrailing?*/, false /*storeSignSeparate?*/);
    replaceValue(padNumber(3, value, false /*isSigned?*/), beginHpcRetCnt, 3);
    localHpcRetCntCounter = shareString.getSerializedField().getModifiedCounter();
    return hpcRetCnt;
  }

  protected int checkHpcRetCntMaxLimit(long number) {

    return (int) checkMaxLimit(number, MAX_1000 /*limit*/, false /*isSigned*/);
  }
  /**
   * refreshHpcRetCnt is used to refresh the latest value of a variable from the Serialized String
   * the most common reason to serialize an Object as a string in to write to a file. There can be
   * several other reasons for serialization as well
   */
  public int refreshHpcRetCnt() throws CFException {
    try {
      return (getIntNumber(
          beginHpcRetCnt,
          HPC_RET_CNT_LEN,
          false /*isSigned*/,
          true /*isSignTrailing*/,
          false /*isSignStoredSeparate*/));
    } catch (Exception ex) {
      throw getSoc7ABend("hpcRetCnt", beginHpcRetCnt, HPC_RET_CNT_LEN);
    }
  }

  public int hpcRetHipaaSize() {
    return HPC_RET_HIPAA_SIZE;
  }
}
