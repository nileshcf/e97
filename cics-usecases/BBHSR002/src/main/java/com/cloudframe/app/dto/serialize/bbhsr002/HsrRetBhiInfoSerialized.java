package com.cloudframe.app.dto.serialize.bbhsr002;

/**
 * The class HsrRetBhiInfoSerialized is used to define offsets in order to serialize in a fixed
 * String
 *
 * @author CloudFrame Inc. created on 2025-03-25 at 08:29. using version 5.0.0.231
 */
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class HsrRetBhiInfoSerialized extends Field {

  protected Logger logger = LoggerFactory.getLogger(HsrRetBhiInfoSerialized.class);
  /*  Length of the field, if serialized as a String */
  protected static final int HSR_RET_BHI_INFO_LENGTH = 4042;
  /*  offset of each of Child Fields when serialized as a String */
  protected int beginHsrRetHipaaCd;
  protected int beginHsrRetHipaaCdMod;
  protected int beginHsrRetGrnrcReqCd;
  protected int beginHsrRetInnCovIndicator;
  protected int beginHsrRetT1CovIndicator;
  protected int beginHsrRetOonCovIndicator;
  protected int beginHsrRetNetCnt;
  protected int beginHsrRetNetInfo;
  protected static final int HSR_RET_NET_INFO_SIZE = 12;

  /** Constructor for HsrRetBhiInfoSerialized */
  public HsrRetBhiInfoSerialized() {
    // TO-DO auto generated code
  }

  /**
   * Constructor for HsrRetBhiInfoSerialized. sets the parent value to the parent
   *
   * @param parent
   * @param begin
   */
  public HsrRetBhiInfoSerialized(Field parent, int begin) {
    setParent(parent, begin);
  }

  /**
   * sets parent for this HsrRetBhiInfoSerialized to the parent
   *
   * @param parent
   */
  @Override
  public void setParent(Field parent) {
    setParent(parent, 20); // serialize this field at offset 20 by default
  }

  /**
   * sets parent for this HsrRetBhiInfoSerialized to the parent and set the serialize offset to
   * parameter begin
   *
   * @param parent
   * @param begin - offset used when serializing this object to a String
   */
  public void setParent(Field parent, int begin) {
    super.setParent(parent);
    init(begin); // serialize this field at offset 20 by default
  }
  /** initializes the field in HsrRetBhiInfoSerialized */
  @Override
  protected void init(int begin) {
    setStartOffset(begin);
    setLength(HSR_RET_BHI_INFO_LENGTH);
    /*  set the offset/position of each field when this object is serialized as String */
    beginHsrRetHipaaCd = getStartOffset() + 0; // set offset for serialization

    beginHsrRetHipaaCdMod = getStartOffset() + 2; // set offset for serialization

    beginHsrRetGrnrcReqCd = getStartOffset() + 4; // set offset for serialization

    beginHsrRetInnCovIndicator = getStartOffset() + 5; // set offset for serialization

    beginHsrRetT1CovIndicator = getStartOffset() + 6; // set offset for serialization

    beginHsrRetOonCovIndicator = getStartOffset() + 7; // set offset for serialization

    beginHsrRetNetCnt = getStartOffset() + 8; // set offset for serialization

    beginHsrRetNetInfo = getStartOffset() + 10; // set offset for serialization

    /*  end of offset */
  }

  int localHsrRetHipaaCdCounter = -1;

  public boolean isHsrRetHipaaCdModified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localHsrRetHipaaCdCounter != sharedCounter;
    localHsrRetHipaaCdCounter = sharedCounter;
    return hasModified;
  }

  protected static final int HSR_RET_HIPAA_CD_LEN = 2;
  /** serialize this HsrRetHipaaCd */
  protected void serializeHsrRetHipaaCd(char[] hsrRetHipaaCd) {
    shareString.getSerializedField().incrementCounter();
    arraycopy(hsrRetHipaaCd, 0, getStringValue(), beginHsrRetHipaaCd, HSR_RET_HIPAA_CD_LEN);
    localHsrRetHipaaCdCounter = shareString.getSerializedField().getModifiedCounter();
  }

  protected char[] checkHsrRetHipaaCdConstraints(char[] value) {
    return super.checkConstraints(value, 2, false, false);
  }
  /**
   * refreshHsrRetHipaaCd is used to refresh the latest value of a variable from the Serialized
   * String the most common reason to serialize an Object as a string in to write to a file. There
   * can be several other reasons for serialization as well
   */
  public char[] refreshHsrRetHipaaCd() {
    return (substring(
        getStringValue(), beginHsrRetHipaaCd, beginHsrRetHipaaCd + HSR_RET_HIPAA_CD_LEN));
  }

  int localHsrRetHipaaCdModCounter = -1;

  public boolean isHsrRetHipaaCdModModified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localHsrRetHipaaCdModCounter != sharedCounter;
    localHsrRetHipaaCdModCounter = sharedCounter;
    return hasModified;
  }

  protected static final int HSR_RET_HIPAA_CD_MOD_LEN = 2;
  /** serialize this HsrRetHipaaCdMod */
  protected void serializeHsrRetHipaaCdMod(char[] hsrRetHipaaCdMod) {
    shareString.getSerializedField().incrementCounter();
    arraycopy(
        hsrRetHipaaCdMod, 0, getStringValue(), beginHsrRetHipaaCdMod, HSR_RET_HIPAA_CD_MOD_LEN);
    localHsrRetHipaaCdModCounter = shareString.getSerializedField().getModifiedCounter();
  }

  protected char[] checkHsrRetHipaaCdModConstraints(char[] value) {
    return super.checkConstraints(value, 2, false, false);
  }
  /**
   * refreshHsrRetHipaaCdMod is used to refresh the latest value of a variable from the Serialized
   * String the most common reason to serialize an Object as a string in to write to a file. There
   * can be several other reasons for serialization as well
   */
  public char[] refreshHsrRetHipaaCdMod() {
    return (substring(
        getStringValue(), beginHsrRetHipaaCdMod, beginHsrRetHipaaCdMod + HSR_RET_HIPAA_CD_MOD_LEN));
  }

  int localHsrRetGrnrcReqCdCounter = -1;

  public boolean isHsrRetGrnrcReqCdModified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localHsrRetGrnrcReqCdCounter != sharedCounter;
    localHsrRetGrnrcReqCdCounter = sharedCounter;
    return hasModified;
  }

  protected static final int HSR_RET_GRNRC_REQ_CD_LEN = 1;
  /** serialize this HsrRetGrnrcReqCd */
  protected void serializeHsrRetGrnrcReqCd(char[] hsrRetGrnrcReqCd) {
    shareString.getSerializedField().incrementCounter();
    arraycopy(
        hsrRetGrnrcReqCd, 0, getStringValue(), beginHsrRetGrnrcReqCd, HSR_RET_GRNRC_REQ_CD_LEN);
    localHsrRetGrnrcReqCdCounter = shareString.getSerializedField().getModifiedCounter();
  }

  protected char[] checkHsrRetGrnrcReqCdConstraints(char[] value) {
    return super.checkConstraints(value, 1, false, false);
  }
  /**
   * refreshHsrRetGrnrcReqCd is used to refresh the latest value of a variable from the Serialized
   * String the most common reason to serialize an Object as a string in to write to a file. There
   * can be several other reasons for serialization as well
   */
  public char[] refreshHsrRetGrnrcReqCd() {
    return (substring(
        getStringValue(), beginHsrRetGrnrcReqCd, beginHsrRetGrnrcReqCd + HSR_RET_GRNRC_REQ_CD_LEN));
  }

  int localHsrRetInnCovIndicatorCounter = -1;

  public boolean isHsrRetInnCovIndicatorModified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localHsrRetInnCovIndicatorCounter != sharedCounter;
    localHsrRetInnCovIndicatorCounter = sharedCounter;
    return hasModified;
  }

  protected static final int HSR_RET_INN_COV_INDICATOR_LEN = 1;
  /** serialize this HsrRetInnCovIndicator */
  protected void serializeHsrRetInnCovIndicator(char[] hsrRetInnCovIndicator) {
    shareString.getSerializedField().incrementCounter();
    arraycopy(
        hsrRetInnCovIndicator,
        0,
        getStringValue(),
        beginHsrRetInnCovIndicator,
        HSR_RET_INN_COV_INDICATOR_LEN);
    localHsrRetInnCovIndicatorCounter = shareString.getSerializedField().getModifiedCounter();
  }

  protected char[] checkHsrRetInnCovIndicatorConstraints(char[] value) {
    return super.checkConstraints(value, 1, false, false);
  }
  /**
   * refreshHsrRetInnCovIndicator is used to refresh the latest value of a variable from the
   * Serialized String the most common reason to serialize an Object as a string in to write to a
   * file. There can be several other reasons for serialization as well
   */
  public char[] refreshHsrRetInnCovIndicator() {
    return (substring(
        getStringValue(),
        beginHsrRetInnCovIndicator,
        beginHsrRetInnCovIndicator + HSR_RET_INN_COV_INDICATOR_LEN));
  }

  int localHsrRetT1CovIndicatorCounter = -1;

  public boolean isHsrRetT1CovIndicatorModified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localHsrRetT1CovIndicatorCounter != sharedCounter;
    localHsrRetT1CovIndicatorCounter = sharedCounter;
    return hasModified;
  }

  protected static final int HSR_RET_T_1_COV_INDICATOR_LEN = 1;
  /** serialize this HsrRetT1CovIndicator */
  protected void serializeHsrRetT1CovIndicator(char[] hsrRetT1CovIndicator) {
    shareString.getSerializedField().incrementCounter();
    arraycopy(
        hsrRetT1CovIndicator,
        0,
        getStringValue(),
        beginHsrRetT1CovIndicator,
        HSR_RET_T_1_COV_INDICATOR_LEN);
    localHsrRetT1CovIndicatorCounter = shareString.getSerializedField().getModifiedCounter();
  }

  protected char[] checkHsrRetT1CovIndicatorConstraints(char[] value) {
    return super.checkConstraints(value, 1, false, false);
  }
  /**
   * refreshHsrRetT1CovIndicator is used to refresh the latest value of a variable from the
   * Serialized String the most common reason to serialize an Object as a string in to write to a
   * file. There can be several other reasons for serialization as well
   */
  public char[] refreshHsrRetT1CovIndicator() {
    return (substring(
        getStringValue(),
        beginHsrRetT1CovIndicator,
        beginHsrRetT1CovIndicator + HSR_RET_T_1_COV_INDICATOR_LEN));
  }

  int localHsrRetOonCovIndicatorCounter = -1;

  public boolean isHsrRetOonCovIndicatorModified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localHsrRetOonCovIndicatorCounter != sharedCounter;
    localHsrRetOonCovIndicatorCounter = sharedCounter;
    return hasModified;
  }

  protected static final int HSR_RET_OON_COV_INDICATOR_LEN = 1;
  /** serialize this HsrRetOonCovIndicator */
  protected void serializeHsrRetOonCovIndicator(char[] hsrRetOonCovIndicator) {
    shareString.getSerializedField().incrementCounter();
    arraycopy(
        hsrRetOonCovIndicator,
        0,
        getStringValue(),
        beginHsrRetOonCovIndicator,
        HSR_RET_OON_COV_INDICATOR_LEN);
    localHsrRetOonCovIndicatorCounter = shareString.getSerializedField().getModifiedCounter();
  }

  protected char[] checkHsrRetOonCovIndicatorConstraints(char[] value) {
    return super.checkConstraints(value, 1, false, false);
  }
  /**
   * refreshHsrRetOonCovIndicator is used to refresh the latest value of a variable from the
   * Serialized String the most common reason to serialize an Object as a string in to write to a
   * file. There can be several other reasons for serialization as well
   */
  public char[] refreshHsrRetOonCovIndicator() {
    return (substring(
        getStringValue(),
        beginHsrRetOonCovIndicator,
        beginHsrRetOonCovIndicator + HSR_RET_OON_COV_INDICATOR_LEN));
  }

  int localHsrRetNetCntCounter = -1;

  public boolean isHsrRetNetCntModified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localHsrRetNetCntCounter != sharedCounter;
    localHsrRetNetCntCounter = sharedCounter;
    return hasModified;
  }

  /**
   * Returns String value of hsrRetNetCnt
   *
   * @return hsrRetNetCnt
   */
  public char[] getHsrRetNetCntString() {
    return getCharArray(beginHsrRetNetCnt, HSR_RET_NET_CNT_LEN);
  }

  /**
   * This method allows testing if there is a numeric value stored in the serialized String
   *
   * @return true if numeric value is stored in the string
   */
  public boolean hsrRetNetCntIsNumeric() {
    return isNumeric(
        beginHsrRetNetCnt,
        beginHsrRetNetCnt + HSR_RET_NET_CNT_LEN,
        false /*Signed*/,
        true /*isSign trailing*/,
        false /*isSignStoredSeparately*/);
  }

  protected static final int HSR_RET_NET_CNT_LEN = 2;
  /** serializeHsrRetNetCnt */
  protected void serializeHsrRetNetCnt(int hsrRetNetCnt) {
    putNumber(
        beginHsrRetNetCnt,
        hsrRetNetCnt,
        HSR_RET_NET_CNT_LEN,
        false /*isSigned?*/,
        true /*signTrailing?*/,
        false /*storeSignSeparate?*/);
    localHsrRetNetCntCounter = shareString.getSerializedField().getModifiedCounter();
  }
  /** serializeHsrRetNetCnt */
  protected int serializeHsrRetNetCnt(char[] value) {
    int hsrRetNetCnt;
    if (value.length > 0 && value.length != 2) value = new String(value).trim().toCharArray();
    if (value.length < 2) value = pad(2, value, ' ', LEFT_PAD);
    else if (value.length > 2) value = substring(value, 0, 2);
    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
    hsrRetNetCnt =
        (int)
            convertString2Number(
                value, false /*isSigned?*/, true /*signTrailing?*/, false /*storeSignSeparate?*/);
    replaceValue(padNumber(2, value, false /*isSigned?*/), beginHsrRetNetCnt, 2);
    localHsrRetNetCntCounter = shareString.getSerializedField().getModifiedCounter();
    return hsrRetNetCnt;
  }

  protected int checkHsrRetNetCntMaxLimit(long number) {

    return (int) checkMaxLimit(number, MAX_100 /*limit*/, false /*isSigned*/);
  }
  /**
   * refreshHsrRetNetCnt is used to refresh the latest value of a variable from the Serialized
   * String the most common reason to serialize an Object as a string in to write to a file. There
   * can be several other reasons for serialization as well
   */
  public int refreshHsrRetNetCnt() throws CFException {
    try {
      return (getIntNumber(
          beginHsrRetNetCnt,
          HSR_RET_NET_CNT_LEN,
          false /*isSigned*/,
          true /*isSignTrailing*/,
          false /*isSignStoredSeparate*/));
    } catch (Exception ex) {
      throw getSoc7ABend("hsrRetNetCnt", beginHsrRetNetCnt, HSR_RET_NET_CNT_LEN);
    }
  }

  public int hsrRetNetInfoSize() {
    return HSR_RET_NET_INFO_SIZE;
  }
}
