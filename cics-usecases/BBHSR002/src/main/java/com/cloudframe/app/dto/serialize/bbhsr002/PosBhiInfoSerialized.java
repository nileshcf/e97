package com.cloudframe.app.dto.serialize.bbhsr002;

/**
 * The class PosBhiInfoSerialized is used to define offsets in order to serialize in a fixed String
 *
 * @author CloudFrame Inc. created on 2025-03-25 at 08:29. using version 5.0.0.231
 */
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class PosBhiInfoSerialized extends Field {

  protected Logger logger = LoggerFactory.getLogger(PosBhiInfoSerialized.class);
  /*  Length of the field, if serialized as a String */
  protected static final int POS_BHI_INFO_LENGTH = 4042;
  /*  offset of each of Child Fields when serialized as a String */
  protected int beginPosHipaaCd;
  protected int beginPosHipaaCdMod;
  protected int beginPosGrnrcReqCd;
  protected int beginPosInnCovIndicator;
  protected int beginPosT1CovIndicator;
  protected int beginPosOonCovIndicator;
  protected int beginPosNetCnt;
  protected int beginPosNetInfo;
  protected static final int POS_NET_INFO_SIZE = 12;

  /** Constructor for PosBhiInfoSerialized */
  public PosBhiInfoSerialized() {
    // TO-DO auto generated code
  }

  /**
   * Constructor for PosBhiInfoSerialized. sets the parent value to the parent
   *
   * @param parent
   * @param begin
   */
  public PosBhiInfoSerialized(Field parent, int begin) {
    setParent(parent, begin);
  }

  /**
   * sets parent for this PosBhiInfoSerialized to the parent
   *
   * @param parent
   */
  @Override
  public void setParent(Field parent) {
    setParent(parent, 21); // serialize this field at offset 21 by default
  }

  /**
   * sets parent for this PosBhiInfoSerialized to the parent and set the serialize offset to
   * parameter begin
   *
   * @param parent
   * @param begin - offset used when serializing this object to a String
   */
  public void setParent(Field parent, int begin) {
    super.setParent(parent);
    init(begin); // serialize this field at offset 21 by default
  }
  /** initializes the field in PosBhiInfoSerialized */
  @Override
  protected void init(int begin) {
    setStartOffset(begin);
    setLength(POS_BHI_INFO_LENGTH);
    /*  set the offset/position of each field when this object is serialized as String */
    beginPosHipaaCd = getStartOffset() + 0; // set offset for serialization

    beginPosHipaaCdMod = getStartOffset() + 2; // set offset for serialization

    beginPosGrnrcReqCd = getStartOffset() + 4; // set offset for serialization

    beginPosInnCovIndicator = getStartOffset() + 5; // set offset for serialization

    beginPosT1CovIndicator = getStartOffset() + 6; // set offset for serialization

    beginPosOonCovIndicator = getStartOffset() + 7; // set offset for serialization

    beginPosNetCnt = getStartOffset() + 8; // set offset for serialization

    beginPosNetInfo = getStartOffset() + 10; // set offset for serialization

    /*  end of offset */
  }

  int localPosHipaaCdCounter = -1;

  public boolean isPosHipaaCdModified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localPosHipaaCdCounter != sharedCounter;
    localPosHipaaCdCounter = sharedCounter;
    return hasModified;
  }

  protected static final int POS_HIPAA_CD_LEN = 2;
  /** serialize this PosHipaaCd */
  protected void serializePosHipaaCd(char[] posHipaaCd) {
    shareString.getSerializedField().incrementCounter();
    arraycopy(posHipaaCd, 0, getStringValue(), beginPosHipaaCd, POS_HIPAA_CD_LEN);
    localPosHipaaCdCounter = shareString.getSerializedField().getModifiedCounter();
  }

  protected char[] checkPosHipaaCdConstraints(char[] value) {
    return super.checkConstraints(value, 2, false, false);
  }
  /**
   * refreshPosHipaaCd is used to refresh the latest value of a variable from the Serialized String
   * the most common reason to serialize an Object as a string in to write to a file. There can be
   * several other reasons for serialization as well
   */
  public char[] refreshPosHipaaCd() {
    return (substring(getStringValue(), beginPosHipaaCd, beginPosHipaaCd + POS_HIPAA_CD_LEN));
  }

  int localPosHipaaCdModCounter = -1;

  public boolean isPosHipaaCdModModified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localPosHipaaCdModCounter != sharedCounter;
    localPosHipaaCdModCounter = sharedCounter;
    return hasModified;
  }

  protected static final int POS_HIPAA_CD_MOD_LEN = 2;
  /** serialize this PosHipaaCdMod */
  protected void serializePosHipaaCdMod(char[] posHipaaCdMod) {
    shareString.getSerializedField().incrementCounter();
    arraycopy(posHipaaCdMod, 0, getStringValue(), beginPosHipaaCdMod, POS_HIPAA_CD_MOD_LEN);
    localPosHipaaCdModCounter = shareString.getSerializedField().getModifiedCounter();
  }

  protected char[] checkPosHipaaCdModConstraints(char[] value) {
    return super.checkConstraints(value, 2, false, false);
  }
  /**
   * refreshPosHipaaCdMod is used to refresh the latest value of a variable from the Serialized
   * String the most common reason to serialize an Object as a string in to write to a file. There
   * can be several other reasons for serialization as well
   */
  public char[] refreshPosHipaaCdMod() {
    return (substring(
        getStringValue(), beginPosHipaaCdMod, beginPosHipaaCdMod + POS_HIPAA_CD_MOD_LEN));
  }

  int localPosGrnrcReqCdCounter = -1;

  public boolean isPosGrnrcReqCdModified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localPosGrnrcReqCdCounter != sharedCounter;
    localPosGrnrcReqCdCounter = sharedCounter;
    return hasModified;
  }

  protected static final int POS_GRNRC_REQ_CD_LEN = 1;
  /** serialize this PosGrnrcReqCd */
  protected void serializePosGrnrcReqCd(char[] posGrnrcReqCd) {
    shareString.getSerializedField().incrementCounter();
    arraycopy(posGrnrcReqCd, 0, getStringValue(), beginPosGrnrcReqCd, POS_GRNRC_REQ_CD_LEN);
    localPosGrnrcReqCdCounter = shareString.getSerializedField().getModifiedCounter();
  }

  protected char[] checkPosGrnrcReqCdConstraints(char[] value) {
    return super.checkConstraints(value, 1, false, false);
  }
  /**
   * refreshPosGrnrcReqCd is used to refresh the latest value of a variable from the Serialized
   * String the most common reason to serialize an Object as a string in to write to a file. There
   * can be several other reasons for serialization as well
   */
  public char[] refreshPosGrnrcReqCd() {
    return (substring(
        getStringValue(), beginPosGrnrcReqCd, beginPosGrnrcReqCd + POS_GRNRC_REQ_CD_LEN));
  }

  int localPosInnCovIndicatorCounter = -1;

  public boolean isPosInnCovIndicatorModified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localPosInnCovIndicatorCounter != sharedCounter;
    localPosInnCovIndicatorCounter = sharedCounter;
    return hasModified;
  }

  protected static final int POS_INN_COV_INDICATOR_LEN = 1;
  /** serialize this PosInnCovIndicator */
  protected void serializePosInnCovIndicator(char[] posInnCovIndicator) {
    shareString.getSerializedField().incrementCounter();
    arraycopy(
        posInnCovIndicator,
        0,
        getStringValue(),
        beginPosInnCovIndicator,
        POS_INN_COV_INDICATOR_LEN);
    localPosInnCovIndicatorCounter = shareString.getSerializedField().getModifiedCounter();
  }

  protected char[] checkPosInnCovIndicatorConstraints(char[] value) {
    return super.checkConstraints(value, 1, false, false);
  }
  /**
   * refreshPosInnCovIndicator is used to refresh the latest value of a variable from the Serialized
   * String the most common reason to serialize an Object as a string in to write to a file. There
   * can be several other reasons for serialization as well
   */
  public char[] refreshPosInnCovIndicator() {
    return (substring(
        getStringValue(),
        beginPosInnCovIndicator,
        beginPosInnCovIndicator + POS_INN_COV_INDICATOR_LEN));
  }

  int localPosT1CovIndicatorCounter = -1;

  public boolean isPosT1CovIndicatorModified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localPosT1CovIndicatorCounter != sharedCounter;
    localPosT1CovIndicatorCounter = sharedCounter;
    return hasModified;
  }

  protected static final int POS_T_1_COV_INDICATOR_LEN = 1;
  /** serialize this PosT1CovIndicator */
  protected void serializePosT1CovIndicator(char[] posT1CovIndicator) {
    shareString.getSerializedField().incrementCounter();
    arraycopy(
        posT1CovIndicator, 0, getStringValue(), beginPosT1CovIndicator, POS_T_1_COV_INDICATOR_LEN);
    localPosT1CovIndicatorCounter = shareString.getSerializedField().getModifiedCounter();
  }

  protected char[] checkPosT1CovIndicatorConstraints(char[] value) {
    return super.checkConstraints(value, 1, false, false);
  }
  /**
   * refreshPosT1CovIndicator is used to refresh the latest value of a variable from the Serialized
   * String the most common reason to serialize an Object as a string in to write to a file. There
   * can be several other reasons for serialization as well
   */
  public char[] refreshPosT1CovIndicator() {
    return (substring(
        getStringValue(),
        beginPosT1CovIndicator,
        beginPosT1CovIndicator + POS_T_1_COV_INDICATOR_LEN));
  }

  int localPosOonCovIndicatorCounter = -1;

  public boolean isPosOonCovIndicatorModified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localPosOonCovIndicatorCounter != sharedCounter;
    localPosOonCovIndicatorCounter = sharedCounter;
    return hasModified;
  }

  protected static final int POS_OON_COV_INDICATOR_LEN = 1;
  /** serialize this PosOonCovIndicator */
  protected void serializePosOonCovIndicator(char[] posOonCovIndicator) {
    shareString.getSerializedField().incrementCounter();
    arraycopy(
        posOonCovIndicator,
        0,
        getStringValue(),
        beginPosOonCovIndicator,
        POS_OON_COV_INDICATOR_LEN);
    localPosOonCovIndicatorCounter = shareString.getSerializedField().getModifiedCounter();
  }

  protected char[] checkPosOonCovIndicatorConstraints(char[] value) {
    return super.checkConstraints(value, 1, false, false);
  }
  /**
   * refreshPosOonCovIndicator is used to refresh the latest value of a variable from the Serialized
   * String the most common reason to serialize an Object as a string in to write to a file. There
   * can be several other reasons for serialization as well
   */
  public char[] refreshPosOonCovIndicator() {
    return (substring(
        getStringValue(),
        beginPosOonCovIndicator,
        beginPosOonCovIndicator + POS_OON_COV_INDICATOR_LEN));
  }

  int localPosNetCntCounter = -1;

  public boolean isPosNetCntModified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localPosNetCntCounter != sharedCounter;
    localPosNetCntCounter = sharedCounter;
    return hasModified;
  }

  /**
   * Returns String value of posNetCnt
   *
   * @return posNetCnt
   */
  public char[] getPosNetCntString() {
    return getCharArray(beginPosNetCnt, POS_NET_CNT_LEN);
  }

  /**
   * This method allows testing if there is a numeric value stored in the serialized String
   *
   * @return true if numeric value is stored in the string
   */
  public boolean posNetCntIsNumeric() {
    return isNumeric(
        beginPosNetCnt,
        beginPosNetCnt + POS_NET_CNT_LEN,
        false /*Signed*/,
        true /*isSign trailing*/,
        false /*isSignStoredSeparately*/);
  }

  protected static final int POS_NET_CNT_LEN = 2;
  /** serializePosNetCnt */
  protected void serializePosNetCnt(int posNetCnt) {
    putNumber(
        beginPosNetCnt,
        posNetCnt,
        POS_NET_CNT_LEN,
        false /*isSigned?*/,
        true /*signTrailing?*/,
        false /*storeSignSeparate?*/);
    localPosNetCntCounter = shareString.getSerializedField().getModifiedCounter();
  }
  /** serializePosNetCnt */
  protected int serializePosNetCnt(char[] value) {
    int posNetCnt;
    if (value.length > 0 && value.length != 2) value = new String(value).trim().toCharArray();
    if (value.length < 2) value = pad(2, value, ' ', LEFT_PAD);
    else if (value.length > 2) value = substring(value, 0, 2);
    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
    posNetCnt =
        (int)
            convertString2Number(
                value, false /*isSigned?*/, true /*signTrailing?*/, false /*storeSignSeparate?*/);
    replaceValue(padNumber(2, value, false /*isSigned?*/), beginPosNetCnt, 2);
    localPosNetCntCounter = shareString.getSerializedField().getModifiedCounter();
    return posNetCnt;
  }

  protected int checkPosNetCntMaxLimit(long number) {

    return (int) checkMaxLimit(number, MAX_100 /*limit*/, false /*isSigned*/);
  }
  /**
   * refreshPosNetCnt is used to refresh the latest value of a variable from the Serialized String
   * the most common reason to serialize an Object as a string in to write to a file. There can be
   * several other reasons for serialization as well
   */
  public int refreshPosNetCnt() throws CFException {
    try {
      return (getIntNumber(
          beginPosNetCnt,
          POS_NET_CNT_LEN,
          false /*isSigned*/,
          true /*isSignTrailing*/,
          false /*isSignStoredSeparate*/));
    } catch (Exception ex) {
      throw getSoc7ABend("posNetCnt", beginPosNetCnt, POS_NET_CNT_LEN);
    }
  }

  public int posNetInfoSize() {
    return POS_NET_INFO_SIZE;
  }
}
