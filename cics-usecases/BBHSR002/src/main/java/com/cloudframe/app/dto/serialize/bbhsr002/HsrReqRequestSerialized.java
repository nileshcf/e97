package com.cloudframe.app.dto.serialize.bbhsr002;

/**
 * The class HsrReqRequestSerialized is used to define offsets in order to serialize in a fixed
 * String
 *
 * @author CloudFrame Inc. created on 2025-03-25 at 08:29. using version 5.0.0.231
 */
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class HsrReqRequestSerialized extends Field {

  protected Logger logger = LoggerFactory.getLogger(HsrReqRequestSerialized.class);
  /*  Length of the field, if serialized as a String */
  protected static final int HSR_REQ_REQUEST_LENGTH = 42;
  /*  offset of each of Child Fields when serialized as a String */
  protected int beginHsrReqCovTypCd;
  protected int beginHsrReqMxiPolicy;
  protected int beginHsrReqMxiPlan;
  protected int beginHsrReqMxiClass;
  protected int beginHsrReqHipaaServTypCd;
  protected int beginHsrReqEffDate;
  protected int beginHsrReqCancelDate;
  protected int beginHsrReqVersionNo;
  protected int beginHsrReqBnReqStartDt;

  /** Constructor for HsrReqRequestSerialized */
  public HsrReqRequestSerialized() {
    // TO-DO auto generated code
  }

  /**
   * Constructor for HsrReqRequestSerialized. sets the parent value to the parent
   *
   * @param parent
   * @param begin
   */
  public HsrReqRequestSerialized(Field parent, int begin) {
    setParent(parent, begin);
  }

  /**
   * sets parent for this HsrReqRequestSerialized to the parent
   *
   * @param parent
   */
  @Override
  public void setParent(Field parent) {
    setParent(parent, 43); // serialize this field at offset 43 by default
  }

  /**
   * sets parent for this HsrReqRequestSerialized to the parent and set the serialize offset to
   * parameter begin
   *
   * @param parent
   * @param begin - offset used when serializing this object to a String
   */
  public void setParent(Field parent, int begin) {
    super.setParent(parent);
    init(begin); // serialize this field at offset 43 by default
  }
  /** initializes the field in HsrReqRequestSerialized */
  @Override
  protected void init(int begin) {
    setStartOffset(begin);
    setLength(HSR_REQ_REQUEST_LENGTH);
    /*  set the offset/position of each field when this object is serialized as String */
    beginHsrReqCovTypCd = getStartOffset() + 0; // set offset for serialization

    beginHsrReqMxiPolicy = getStartOffset() + 1; // set offset for serialization

    beginHsrReqMxiPlan = getStartOffset() + 7; // set offset for serialization

    beginHsrReqMxiClass = getStartOffset() + 11; // set offset for serialization

    beginHsrReqHipaaServTypCd = getStartOffset() + 15; // set offset for serialization

    beginHsrReqEffDate = getStartOffset() + 17; // set offset for serialization

    beginHsrReqCancelDate = getStartOffset() + 25; // set offset for serialization

    beginHsrReqVersionNo = getStartOffset() + 33; // set offset for serialization

    beginHsrReqBnReqStartDt = getStartOffset() + 34; // set offset for serialization

    /*  end of offset */
  }

  int localHsrReqCovTypCdCounter = -1;

  public boolean isHsrReqCovTypCdModified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localHsrReqCovTypCdCounter != sharedCounter;
    localHsrReqCovTypCdCounter = sharedCounter;
    return hasModified;
  }

  protected static final int HSR_REQ_COV_TYP_CD_LEN = 1;
  /** serialize this HsrReqCovTypCd */
  protected void serializeHsrReqCovTypCd(char[] hsrReqCovTypCd) {
    shareString.getSerializedField().incrementCounter();
    arraycopy(hsrReqCovTypCd, 0, getStringValue(), beginHsrReqCovTypCd, HSR_REQ_COV_TYP_CD_LEN);
    localHsrReqCovTypCdCounter = shareString.getSerializedField().getModifiedCounter();
  }

  protected char[] checkHsrReqCovTypCdConstraints(char[] value) {
    return super.checkConstraints(value, 1, false, false);
  }
  /**
   * refreshHsrReqCovTypCd is used to refresh the latest value of a variable from the Serialized
   * String the most common reason to serialize an Object as a string in to write to a file. There
   * can be several other reasons for serialization as well
   */
  public char[] refreshHsrReqCovTypCd() {
    return (substring(
        getStringValue(), beginHsrReqCovTypCd, beginHsrReqCovTypCd + HSR_REQ_COV_TYP_CD_LEN));
  }

  int localHsrReqMxiPolicyCounter = -1;

  public boolean isHsrReqMxiPolicyModified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localHsrReqMxiPolicyCounter != sharedCounter;
    localHsrReqMxiPolicyCounter = sharedCounter;
    return hasModified;
  }

  protected static final int HSR_REQ_MXI_POLICY_LEN = 6;
  /** serialize this HsrReqMxiPolicy */
  protected void serializeHsrReqMxiPolicy(char[] hsrReqMxiPolicy) {
    shareString.getSerializedField().incrementCounter();
    arraycopy(hsrReqMxiPolicy, 0, getStringValue(), beginHsrReqMxiPolicy, HSR_REQ_MXI_POLICY_LEN);
    localHsrReqMxiPolicyCounter = shareString.getSerializedField().getModifiedCounter();
  }

  protected char[] checkHsrReqMxiPolicyConstraints(char[] value) {
    return super.checkConstraints(value, 6, false, false);
  }
  /**
   * refreshHsrReqMxiPolicy is used to refresh the latest value of a variable from the Serialized
   * String the most common reason to serialize an Object as a string in to write to a file. There
   * can be several other reasons for serialization as well
   */
  public char[] refreshHsrReqMxiPolicy() {
    return (substring(
        getStringValue(), beginHsrReqMxiPolicy, beginHsrReqMxiPolicy + HSR_REQ_MXI_POLICY_LEN));
  }

  int localHsrReqMxiPlanCounter = -1;

  public boolean isHsrReqMxiPlanModified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localHsrReqMxiPlanCounter != sharedCounter;
    localHsrReqMxiPlanCounter = sharedCounter;
    return hasModified;
  }

  /**
   * Returns String value of hsrReqMxiPlan
   *
   * @return hsrReqMxiPlan
   */
  public char[] getHsrReqMxiPlanString() {
    return getCharArray(beginHsrReqMxiPlan, HSR_REQ_MXI_PLAN_LEN);
  }

  /**
   * This method allows testing if there is a numeric value stored in the serialized String
   *
   * @return true if numeric value is stored in the string
   */
  public boolean hsrReqMxiPlanIsNumeric() {
    return isNumeric(
        beginHsrReqMxiPlan,
        beginHsrReqMxiPlan + HSR_REQ_MXI_PLAN_LEN,
        false /*Signed*/,
        true /*isSign trailing*/,
        false /*isSignStoredSeparately*/);
  }

  protected static final int HSR_REQ_MXI_PLAN_LEN = 4;
  /** serializeHsrReqMxiPlan */
  protected void serializeHsrReqMxiPlan(int hsrReqMxiPlan) {
    putNumber(
        beginHsrReqMxiPlan,
        hsrReqMxiPlan,
        HSR_REQ_MXI_PLAN_LEN,
        false /*isSigned?*/,
        true /*signTrailing?*/,
        false /*storeSignSeparate?*/);
    localHsrReqMxiPlanCounter = shareString.getSerializedField().getModifiedCounter();
  }
  /** serializeHsrReqMxiPlan */
  protected int serializeHsrReqMxiPlan(char[] value) {
    int hsrReqMxiPlan;
    if (value.length > 0 && value.length != 4) value = new String(value).trim().toCharArray();
    if (value.length < 4) value = pad(4, value, ' ', LEFT_PAD);
    else if (value.length > 4) value = substring(value, 0, 4);
    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
    hsrReqMxiPlan =
        (int)
            convertString2Number(
                value, false /*isSigned?*/, true /*signTrailing?*/, false /*storeSignSeparate?*/);
    replaceValue(padNumber(4, value, false /*isSigned?*/), beginHsrReqMxiPlan, 4);
    localHsrReqMxiPlanCounter = shareString.getSerializedField().getModifiedCounter();
    return hsrReqMxiPlan;
  }

  protected int checkHsrReqMxiPlanMaxLimit(long number) {

    return (int) checkMaxLimit(number, MAX_10K /*limit*/, false /*isSigned*/);
  }
  /**
   * refreshHsrReqMxiPlan is used to refresh the latest value of a variable from the Serialized
   * String the most common reason to serialize an Object as a string in to write to a file. There
   * can be several other reasons for serialization as well
   */
  public int refreshHsrReqMxiPlan() throws CFException {
    try {
      return (getIntNumber(
          beginHsrReqMxiPlan,
          HSR_REQ_MXI_PLAN_LEN,
          false /*isSigned*/,
          true /*isSignTrailing*/,
          false /*isSignStoredSeparate*/));
    } catch (Exception ex) {
      throw getSoc7ABend("hsrReqMxiPlan", beginHsrReqMxiPlan, HSR_REQ_MXI_PLAN_LEN);
    }
  }

  int localHsrReqMxiClassCounter = -1;

  public boolean isHsrReqMxiClassModified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localHsrReqMxiClassCounter != sharedCounter;
    localHsrReqMxiClassCounter = sharedCounter;
    return hasModified;
  }

  /**
   * Returns String value of hsrReqMxiClass
   *
   * @return hsrReqMxiClass
   */
  public char[] getHsrReqMxiClassString() {
    return getCharArray(beginHsrReqMxiClass, HSR_REQ_MXI_CLASS_LEN);
  }

  /**
   * This method allows testing if there is a numeric value stored in the serialized String
   *
   * @return true if numeric value is stored in the string
   */
  public boolean hsrReqMxiClassIsNumeric() {
    return isNumeric(
        beginHsrReqMxiClass,
        beginHsrReqMxiClass + HSR_REQ_MXI_CLASS_LEN,
        false /*Signed*/,
        true /*isSign trailing*/,
        false /*isSignStoredSeparately*/);
  }

  protected static final int HSR_REQ_MXI_CLASS_LEN = 4;
  /** serializeHsrReqMxiClass */
  protected void serializeHsrReqMxiClass(int hsrReqMxiClass) {
    putNumber(
        beginHsrReqMxiClass,
        hsrReqMxiClass,
        HSR_REQ_MXI_CLASS_LEN,
        false /*isSigned?*/,
        true /*signTrailing?*/,
        false /*storeSignSeparate?*/);
    localHsrReqMxiClassCounter = shareString.getSerializedField().getModifiedCounter();
  }
  /** serializeHsrReqMxiClass */
  protected int serializeHsrReqMxiClass(char[] value) {
    int hsrReqMxiClass;
    if (value.length > 0 && value.length != 4) value = new String(value).trim().toCharArray();
    if (value.length < 4) value = pad(4, value, ' ', LEFT_PAD);
    else if (value.length > 4) value = substring(value, 0, 4);
    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
    hsrReqMxiClass =
        (int)
            convertString2Number(
                value, false /*isSigned?*/, true /*signTrailing?*/, false /*storeSignSeparate?*/);
    replaceValue(padNumber(4, value, false /*isSigned?*/), beginHsrReqMxiClass, 4);
    localHsrReqMxiClassCounter = shareString.getSerializedField().getModifiedCounter();
    return hsrReqMxiClass;
  }

  protected int checkHsrReqMxiClassMaxLimit(long number) {

    return (int) checkMaxLimit(number, MAX_10K /*limit*/, false /*isSigned*/);
  }
  /**
   * refreshHsrReqMxiClass is used to refresh the latest value of a variable from the Serialized
   * String the most common reason to serialize an Object as a string in to write to a file. There
   * can be several other reasons for serialization as well
   */
  public int refreshHsrReqMxiClass() throws CFException {
    try {
      return (getIntNumber(
          beginHsrReqMxiClass,
          HSR_REQ_MXI_CLASS_LEN,
          false /*isSigned*/,
          true /*isSignTrailing*/,
          false /*isSignStoredSeparate*/));
    } catch (Exception ex) {
      throw getSoc7ABend("hsrReqMxiClass", beginHsrReqMxiClass, HSR_REQ_MXI_CLASS_LEN);
    }
  }

  int localHsrReqHipaaServTypCdCounter = -1;

  public boolean isHsrReqHipaaServTypCdModified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localHsrReqHipaaServTypCdCounter != sharedCounter;
    localHsrReqHipaaServTypCdCounter = sharedCounter;
    return hasModified;
  }

  protected static final int HSR_REQ_HIPAA_SERV_TYP_CD_LEN = 2;
  /** serialize this HsrReqHipaaServTypCd */
  protected void serializeHsrReqHipaaServTypCd(char[] hsrReqHipaaServTypCd) {
    shareString.getSerializedField().incrementCounter();
    arraycopy(
        hsrReqHipaaServTypCd,
        0,
        getStringValue(),
        beginHsrReqHipaaServTypCd,
        HSR_REQ_HIPAA_SERV_TYP_CD_LEN);
    localHsrReqHipaaServTypCdCounter = shareString.getSerializedField().getModifiedCounter();
  }

  protected char[] checkHsrReqHipaaServTypCdConstraints(char[] value) {
    return super.checkConstraints(value, 2, false, false);
  }
  /**
   * refreshHsrReqHipaaServTypCd is used to refresh the latest value of a variable from the
   * Serialized String the most common reason to serialize an Object as a string in to write to a
   * file. There can be several other reasons for serialization as well
   */
  public char[] refreshHsrReqHipaaServTypCd() {
    return (substring(
        getStringValue(),
        beginHsrReqHipaaServTypCd,
        beginHsrReqHipaaServTypCd + HSR_REQ_HIPAA_SERV_TYP_CD_LEN));
  }

  int localHsrReqEffDateCounter = -1;

  public boolean isHsrReqEffDateModified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localHsrReqEffDateCounter != sharedCounter;
    localHsrReqEffDateCounter = sharedCounter;
    return hasModified;
  }

  /**
   * Returns String value of hsrReqEffDate
   *
   * @return hsrReqEffDate
   */
  public char[] getHsrReqEffDateString() {
    return getCharArray(beginHsrReqEffDate, HSR_REQ_EFF_DATE_LEN);
  }

  /**
   * This method allows testing if there is a numeric value stored in the serialized String
   *
   * @return true if numeric value is stored in the string
   */
  public boolean hsrReqEffDateIsNumeric() {
    return isNumeric(
        beginHsrReqEffDate,
        beginHsrReqEffDate + HSR_REQ_EFF_DATE_LEN,
        false /*Signed*/,
        true /*isSign trailing*/,
        false /*isSignStoredSeparately*/);
  }

  protected static final int HSR_REQ_EFF_DATE_LEN = 8;
  /** serializeHsrReqEffDate */
  protected void serializeHsrReqEffDate(long hsrReqEffDate) {
    putNumber(
        beginHsrReqEffDate,
        hsrReqEffDate,
        HSR_REQ_EFF_DATE_LEN,
        false /*isSigned?*/,
        true /*signTrailing?*/,
        false /*storeSignSeparate?*/);
    localHsrReqEffDateCounter = shareString.getSerializedField().getModifiedCounter();
  }
  /** serializeHsrReqEffDate */
  protected long serializeHsrReqEffDate(char[] value) {
    long hsrReqEffDate;
    if (value.length > 0 && value.length != 8) value = new String(value).trim().toCharArray();
    if (value.length < 8) value = pad(8, value, ' ', LEFT_PAD);
    else if (value.length > 8) value = substring(value, 0, 8);
    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
    hsrReqEffDate =
        convertString2Number(
            value, false /*isSigned?*/, true /*signTrailing?*/, false /*storeSignSeparate?*/);
    replaceValue(padNumber(8, value, false /*isSigned?*/), beginHsrReqEffDate, 8);
    localHsrReqEffDateCounter = shareString.getSerializedField().getModifiedCounter();
    return hsrReqEffDate;
  }

  protected long checkHsrReqEffDateMaxLimit(long number) {

    return checkMaxLimit(number, MAX_100M /*limit*/, false /*isSigned*/);
  }
  /**
   * refreshHsrReqEffDate is used to refresh the latest value of a variable from the Serialized
   * String the most common reason to serialize an Object as a string in to write to a file. There
   * can be several other reasons for serialization as well
   */
  public long refreshHsrReqEffDate() throws CFException {
    try {
      return (getLongNumber(
          beginHsrReqEffDate,
          HSR_REQ_EFF_DATE_LEN,
          false /*isSigned*/,
          true /*isSignTrailing*/,
          false /*isSignStoredSeparate*/));
    } catch (Exception ex) {
      throw getSoc7ABend("hsrReqEffDate", beginHsrReqEffDate, HSR_REQ_EFF_DATE_LEN);
    }
  }

  int localHsrReqCancelDateCounter = -1;

  public boolean isHsrReqCancelDateModified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localHsrReqCancelDateCounter != sharedCounter;
    localHsrReqCancelDateCounter = sharedCounter;
    return hasModified;
  }

  /**
   * Returns String value of hsrReqCancelDate
   *
   * @return hsrReqCancelDate
   */
  public char[] getHsrReqCancelDateString() {
    return getCharArray(beginHsrReqCancelDate, HSR_REQ_CANCEL_DATE_LEN);
  }

  /**
   * This method allows testing if there is a numeric value stored in the serialized String
   *
   * @return true if numeric value is stored in the string
   */
  public boolean hsrReqCancelDateIsNumeric() {
    return isNumeric(
        beginHsrReqCancelDate,
        beginHsrReqCancelDate + HSR_REQ_CANCEL_DATE_LEN,
        false /*Signed*/,
        true /*isSign trailing*/,
        false /*isSignStoredSeparately*/);
  }

  protected static final int HSR_REQ_CANCEL_DATE_LEN = 8;
  /** serializeHsrReqCancelDate */
  protected void serializeHsrReqCancelDate(long hsrReqCancelDate) {
    putNumber(
        beginHsrReqCancelDate,
        hsrReqCancelDate,
        HSR_REQ_CANCEL_DATE_LEN,
        false /*isSigned?*/,
        true /*signTrailing?*/,
        false /*storeSignSeparate?*/);
    localHsrReqCancelDateCounter = shareString.getSerializedField().getModifiedCounter();
  }
  /** serializeHsrReqCancelDate */
  protected long serializeHsrReqCancelDate(char[] value) {
    long hsrReqCancelDate;
    if (value.length > 0 && value.length != 8) value = new String(value).trim().toCharArray();
    if (value.length < 8) value = pad(8, value, ' ', LEFT_PAD);
    else if (value.length > 8) value = substring(value, 0, 8);
    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
    hsrReqCancelDate =
        convertString2Number(
            value, false /*isSigned?*/, true /*signTrailing?*/, false /*storeSignSeparate?*/);
    replaceValue(padNumber(8, value, false /*isSigned?*/), beginHsrReqCancelDate, 8);
    localHsrReqCancelDateCounter = shareString.getSerializedField().getModifiedCounter();
    return hsrReqCancelDate;
  }

  protected long checkHsrReqCancelDateMaxLimit(long number) {

    return checkMaxLimit(number, MAX_100M /*limit*/, false /*isSigned*/);
  }
  /**
   * refreshHsrReqCancelDate is used to refresh the latest value of a variable from the Serialized
   * String the most common reason to serialize an Object as a string in to write to a file. There
   * can be several other reasons for serialization as well
   */
  public long refreshHsrReqCancelDate() throws CFException {
    try {
      return (getLongNumber(
          beginHsrReqCancelDate,
          HSR_REQ_CANCEL_DATE_LEN,
          false /*isSigned*/,
          true /*isSignTrailing*/,
          false /*isSignStoredSeparate*/));
    } catch (Exception ex) {
      throw getSoc7ABend("hsrReqCancelDate", beginHsrReqCancelDate, HSR_REQ_CANCEL_DATE_LEN);
    }
  }

  int localHsrReqVersionNoCounter = -1;

  public boolean isHsrReqVersionNoModified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localHsrReqVersionNoCounter != sharedCounter;
    localHsrReqVersionNoCounter = sharedCounter;
    return hasModified;
  }

  protected static final int HSR_REQ_VERSION_NO_LEN = 1;
  /** serialize this HsrReqVersionNo */
  protected void serializeHsrReqVersionNo(char[] hsrReqVersionNo) {
    shareString.getSerializedField().incrementCounter();
    arraycopy(hsrReqVersionNo, 0, getStringValue(), beginHsrReqVersionNo, HSR_REQ_VERSION_NO_LEN);
    localHsrReqVersionNoCounter = shareString.getSerializedField().getModifiedCounter();
  }

  protected char[] checkHsrReqVersionNoConstraints(char[] value) {
    return super.checkConstraints(value, 1, false, false);
  }
  /**
   * refreshHsrReqVersionNo is used to refresh the latest value of a variable from the Serialized
   * String the most common reason to serialize an Object as a string in to write to a file. There
   * can be several other reasons for serialization as well
   */
  public char[] refreshHsrReqVersionNo() {
    return (substring(
        getStringValue(), beginHsrReqVersionNo, beginHsrReqVersionNo + HSR_REQ_VERSION_NO_LEN));
  }

  int localHsrReqBnReqStartDtCounter = -1;

  public boolean isHsrReqBnReqStartDtModified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localHsrReqBnReqStartDtCounter != sharedCounter;
    localHsrReqBnReqStartDtCounter = sharedCounter;
    return hasModified;
  }

  protected static final int HSR_REQ_BN_REQ_START_DT_LEN = 8;
  /** serialize this HsrReqBnReqStartDt */
  protected void serializeHsrReqBnReqStartDt(char[] hsrReqBnReqStartDt) {
    shareString.getSerializedField().incrementCounter();
    arraycopy(
        hsrReqBnReqStartDt,
        0,
        getStringValue(),
        beginHsrReqBnReqStartDt,
        HSR_REQ_BN_REQ_START_DT_LEN);
    localHsrReqBnReqStartDtCounter = shareString.getSerializedField().getModifiedCounter();
  }

  protected char[] checkHsrReqBnReqStartDtConstraints(char[] value) {
    return super.checkConstraints(value, 8, false, false);
  }
  /**
   * refreshHsrReqBnReqStartDt is used to refresh the latest value of a variable from the Serialized
   * String the most common reason to serialize an Object as a string in to write to a file. There
   * can be several other reasons for serialization as well
   */
  public char[] refreshHsrReqBnReqStartDt() {
    return (substring(
        getStringValue(),
        beginHsrReqBnReqStartDt,
        beginHsrReqBnReqStartDt + HSR_REQ_BN_REQ_START_DT_LEN));
  }
}
