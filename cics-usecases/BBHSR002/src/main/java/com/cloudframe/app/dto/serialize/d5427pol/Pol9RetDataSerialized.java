package com.cloudframe.app.dto.serialize.d5427pol;

/**
 * The class Pol9RetDataSerialized is used to define offsets in order to serialize in a fixed String
 *
 * @author CloudFrame Inc. created on 2025-03-25 at 08:31. using version 5.0.0.231
 */
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Pol9RetDataSerialized extends Field {

  protected Logger logger = LoggerFactory.getLogger(Pol9RetDataSerialized.class);
  /*  Length of the field, if serialized as a String */
  protected static final int POL_9_RET_DATA_LENGTH = 18;
  /*  offset of each of Child Fields when serialized as a String */
  protected int beginPol9RetTrpyTypCd;
  protected int beginPol9RetTrpyCtgyCd;
  protected int beginPol9RetTrpyBenLmtParCnt;
  protected int beginPol9RetNtwkStsParCd;
  protected int beginPol9RetTrpyBenLmtNparCnt;
  protected int beginPol9RetNtwkStsNparCd;

  /** Constructor for Pol9RetDataSerialized */
  public Pol9RetDataSerialized() {
    // TO-DO auto generated code
  }

  /**
   * Constructor for Pol9RetDataSerialized. sets the parent value to the parent
   *
   * @param parent
   * @param begin
   */
  public Pol9RetDataSerialized(Field parent, int begin) {
    setParent(parent, begin);
  }

  /**
   * sets parent for this Pol9RetDataSerialized to the parent
   *
   * @param parent
   */
  @Override
  public void setParent(Field parent) {
    setParent(parent, 3); // serialize this field at offset 3 by default
  }

  /**
   * sets parent for this Pol9RetDataSerialized to the parent and set the serialize offset to
   * parameter begin
   *
   * @param parent
   * @param begin - offset used when serializing this object to a String
   */
  public void setParent(Field parent, int begin) {
    super.setParent(parent);
    init(begin); // serialize this field at offset 3 by default
  }
  /** initializes the field in Pol9RetDataSerialized */
  @Override
  protected void init(int begin) {
    setStartOffset(begin);
    setLength(POL_9_RET_DATA_LENGTH);
    /*  set the offset/position of each field when this object is serialized as String */
    beginPol9RetTrpyTypCd = getStartOffset() + 0; // set offset for serialization

    beginPol9RetTrpyCtgyCd = getStartOffset() + 3; // set offset for serialization

    beginPol9RetTrpyBenLmtParCnt = getStartOffset() + 6; // set offset for serialization

    beginPol9RetNtwkStsParCd = getStartOffset() + 9; // set offset for serialization

    beginPol9RetTrpyBenLmtNparCnt = getStartOffset() + 12; // set offset for serialization

    beginPol9RetNtwkStsNparCd = getStartOffset() + 15; // set offset for serialization

    /*  end of offset */
  }

  int localPol9RetTrpyTypCdCounter = -1;

  public boolean isPol9RetTrpyTypCdModified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localPol9RetTrpyTypCdCounter != sharedCounter;
    localPol9RetTrpyTypCdCounter = sharedCounter;
    return hasModified;
  }

  protected static final int POL_9_RET_TRPY_TYP_CD_LEN = 3;
  /** serialize this Pol9RetTrpyTypCd */
  protected void serializePol9RetTrpyTypCd(char[] pol9RetTrpyTypCd) {
    shareString.getSerializedField().incrementCounter();
    arraycopy(
        pol9RetTrpyTypCd, 0, getStringValue(), beginPol9RetTrpyTypCd, POL_9_RET_TRPY_TYP_CD_LEN);
    localPol9RetTrpyTypCdCounter = shareString.getSerializedField().getModifiedCounter();
  }

  protected char[] checkPol9RetTrpyTypCdConstraints(char[] value) {
    return super.checkConstraints(value, 3, false, false);
  }
  /**
   * refreshPol9RetTrpyTypCd is used to refresh the latest value of a variable from the Serialized
   * String the most common reason to serialize an Object as a string in to write to a file. There
   * can be several other reasons for serialization as well
   */
  public char[] refreshPol9RetTrpyTypCd() {
    return (substring(
        getStringValue(),
        beginPol9RetTrpyTypCd,
        beginPol9RetTrpyTypCd + POL_9_RET_TRPY_TYP_CD_LEN));
  }

  int localPol9RetTrpyCtgyCdCounter = -1;

  public boolean isPol9RetTrpyCtgyCdModified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localPol9RetTrpyCtgyCdCounter != sharedCounter;
    localPol9RetTrpyCtgyCdCounter = sharedCounter;
    return hasModified;
  }

  protected static final int POL_9_RET_TRPY_CTGY_CD_LEN = 3;
  /** serialize this Pol9RetTrpyCtgyCd */
  protected void serializePol9RetTrpyCtgyCd(char[] pol9RetTrpyCtgyCd) {
    shareString.getSerializedField().incrementCounter();
    arraycopy(
        pol9RetTrpyCtgyCd, 0, getStringValue(), beginPol9RetTrpyCtgyCd, POL_9_RET_TRPY_CTGY_CD_LEN);
    localPol9RetTrpyCtgyCdCounter = shareString.getSerializedField().getModifiedCounter();
  }

  protected char[] checkPol9RetTrpyCtgyCdConstraints(char[] value) {
    return super.checkConstraints(value, 3, false, false);
  }
  /**
   * refreshPol9RetTrpyCtgyCd is used to refresh the latest value of a variable from the Serialized
   * String the most common reason to serialize an Object as a string in to write to a file. There
   * can be several other reasons for serialization as well
   */
  public char[] refreshPol9RetTrpyCtgyCd() {
    return (substring(
        getStringValue(),
        beginPol9RetTrpyCtgyCd,
        beginPol9RetTrpyCtgyCd + POL_9_RET_TRPY_CTGY_CD_LEN));
  }

  int localPol9RetTrpyBenLmtParCntCounter = -1;

  public boolean isPol9RetTrpyBenLmtParCntModified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localPol9RetTrpyBenLmtParCntCounter != sharedCounter;
    localPol9RetTrpyBenLmtParCntCounter = sharedCounter;
    return hasModified;
  }

  /**
   * Returns String value of pol9RetTrpyBenLmtParCnt
   *
   * @return pol9RetTrpyBenLmtParCnt
   */
  public char[] getPol9RetTrpyBenLmtParCntString() {
    return getCharArray(beginPol9RetTrpyBenLmtParCnt, POL_9_RET_TRPY_BEN_LMT_PAR_CNT_LEN);
  }

  /**
   * This method allows testing if there is a numeric value stored in the serialized String
   *
   * @return true if numeric value is stored in the string
   */
  public boolean pol9RetTrpyBenLmtParCntIsNumeric() {
    return isNumeric(
        beginPol9RetTrpyBenLmtParCnt,
        beginPol9RetTrpyBenLmtParCnt + POL_9_RET_TRPY_BEN_LMT_PAR_CNT_LEN,
        false /*Signed*/,
        true /*isSign trailing*/,
        false /*isSignStoredSeparately*/);
  }

  protected static final int POL_9_RET_TRPY_BEN_LMT_PAR_CNT_LEN = 3;
  /** serializePol9RetTrpyBenLmtParCnt */
  protected void serializePol9RetTrpyBenLmtParCnt(int pol9RetTrpyBenLmtParCnt) {
    putNumber(
        beginPol9RetTrpyBenLmtParCnt,
        pol9RetTrpyBenLmtParCnt,
        POL_9_RET_TRPY_BEN_LMT_PAR_CNT_LEN,
        false /*isSigned?*/,
        true /*signTrailing?*/,
        false /*storeSignSeparate?*/);
    localPol9RetTrpyBenLmtParCntCounter = shareString.getSerializedField().getModifiedCounter();
  }
  /** serializePol9RetTrpyBenLmtParCnt */
  protected int serializePol9RetTrpyBenLmtParCnt(char[] value) {
    int pol9RetTrpyBenLmtParCnt;
    if (value.length > 0 && value.length != 3) value = new String(value).trim().toCharArray();
    if (value.length < 3) value = pad(3, value, ' ', LEFT_PAD);
    else if (value.length > 3) value = substring(value, 0, 3);
    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
    pol9RetTrpyBenLmtParCnt =
        (int)
            convertString2Number(
                value, false /*isSigned?*/, true /*signTrailing?*/, false /*storeSignSeparate?*/);
    replaceValue(padNumber(3, value, false /*isSigned?*/), beginPol9RetTrpyBenLmtParCnt, 3);
    localPol9RetTrpyBenLmtParCntCounter = shareString.getSerializedField().getModifiedCounter();
    return pol9RetTrpyBenLmtParCnt;
  }

  protected int checkPol9RetTrpyBenLmtParCntMaxLimit(long number) {

    return (int) checkMaxLimit(number, MAX_1000 /*limit*/, false /*isSigned*/);
  }
  /**
   * refreshPol9RetTrpyBenLmtParCnt is used to refresh the latest value of a variable from the
   * Serialized String the most common reason to serialize an Object as a string in to write to a
   * file. There can be several other reasons for serialization as well
   */
  public int refreshPol9RetTrpyBenLmtParCnt() throws CFException {
    try {
      return (getIntNumber(
          beginPol9RetTrpyBenLmtParCnt,
          POL_9_RET_TRPY_BEN_LMT_PAR_CNT_LEN,
          false /*isSigned*/,
          true /*isSignTrailing*/,
          false /*isSignStoredSeparate*/));
    } catch (Exception ex) {
      throw getSoc7ABend(
          "pol9RetTrpyBenLmtParCnt",
          beginPol9RetTrpyBenLmtParCnt,
          POL_9_RET_TRPY_BEN_LMT_PAR_CNT_LEN);
    }
  }

  int localPol9RetNtwkStsParCdCounter = -1;

  public boolean isPol9RetNtwkStsParCdModified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localPol9RetNtwkStsParCdCounter != sharedCounter;
    localPol9RetNtwkStsParCdCounter = sharedCounter;
    return hasModified;
  }

  protected static final int POL_9_RET_NTWK_STS_PAR_CD_LEN = 3;
  /** serialize this Pol9RetNtwkStsParCd */
  protected void serializePol9RetNtwkStsParCd(char[] pol9RetNtwkStsParCd) {
    shareString.getSerializedField().incrementCounter();
    arraycopy(
        pol9RetNtwkStsParCd,
        0,
        getStringValue(),
        beginPol9RetNtwkStsParCd,
        POL_9_RET_NTWK_STS_PAR_CD_LEN);
    localPol9RetNtwkStsParCdCounter = shareString.getSerializedField().getModifiedCounter();
  }

  protected char[] checkPol9RetNtwkStsParCdConstraints(char[] value) {
    return super.checkConstraints(value, 3, false, false);
  }
  /**
   * refreshPol9RetNtwkStsParCd is used to refresh the latest value of a variable from the
   * Serialized String the most common reason to serialize an Object as a string in to write to a
   * file. There can be several other reasons for serialization as well
   */
  public char[] refreshPol9RetNtwkStsParCd() {
    return (substring(
        getStringValue(),
        beginPol9RetNtwkStsParCd,
        beginPol9RetNtwkStsParCd + POL_9_RET_NTWK_STS_PAR_CD_LEN));
  }

  int localPol9RetTrpyBenLmtNparCntCounter = -1;

  public boolean isPol9RetTrpyBenLmtNparCntModified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localPol9RetTrpyBenLmtNparCntCounter != sharedCounter;
    localPol9RetTrpyBenLmtNparCntCounter = sharedCounter;
    return hasModified;
  }

  /**
   * Returns String value of pol9RetTrpyBenLmtNparCnt
   *
   * @return pol9RetTrpyBenLmtNparCnt
   */
  public char[] getPol9RetTrpyBenLmtNparCntString() {
    return getCharArray(beginPol9RetTrpyBenLmtNparCnt, POL_9_RET_TRPY_BEN_LMT_NPAR_CNT_LEN);
  }

  /**
   * This method allows testing if there is a numeric value stored in the serialized String
   *
   * @return true if numeric value is stored in the string
   */
  public boolean pol9RetTrpyBenLmtNparCntIsNumeric() {
    return isNumeric(
        beginPol9RetTrpyBenLmtNparCnt,
        beginPol9RetTrpyBenLmtNparCnt + POL_9_RET_TRPY_BEN_LMT_NPAR_CNT_LEN,
        false /*Signed*/,
        true /*isSign trailing*/,
        false /*isSignStoredSeparately*/);
  }

  protected static final int POL_9_RET_TRPY_BEN_LMT_NPAR_CNT_LEN = 3;
  /** serializePol9RetTrpyBenLmtNparCnt */
  protected void serializePol9RetTrpyBenLmtNparCnt(int pol9RetTrpyBenLmtNparCnt) {
    putNumber(
        beginPol9RetTrpyBenLmtNparCnt,
        pol9RetTrpyBenLmtNparCnt,
        POL_9_RET_TRPY_BEN_LMT_NPAR_CNT_LEN,
        false /*isSigned?*/,
        true /*signTrailing?*/,
        false /*storeSignSeparate?*/);
    localPol9RetTrpyBenLmtNparCntCounter = shareString.getSerializedField().getModifiedCounter();
  }
  /** serializePol9RetTrpyBenLmtNparCnt */
  protected int serializePol9RetTrpyBenLmtNparCnt(char[] value) {
    int pol9RetTrpyBenLmtNparCnt;
    if (value.length > 0 && value.length != 3) value = new String(value).trim().toCharArray();
    if (value.length < 3) value = pad(3, value, ' ', LEFT_PAD);
    else if (value.length > 3) value = substring(value, 0, 3);
    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
    pol9RetTrpyBenLmtNparCnt =
        (int)
            convertString2Number(
                value, false /*isSigned?*/, true /*signTrailing?*/, false /*storeSignSeparate?*/);
    replaceValue(padNumber(3, value, false /*isSigned?*/), beginPol9RetTrpyBenLmtNparCnt, 3);
    localPol9RetTrpyBenLmtNparCntCounter = shareString.getSerializedField().getModifiedCounter();
    return pol9RetTrpyBenLmtNparCnt;
  }

  protected int checkPol9RetTrpyBenLmtNparCntMaxLimit(long number) {

    return (int) checkMaxLimit(number, MAX_1000 /*limit*/, false /*isSigned*/);
  }
  /**
   * refreshPol9RetTrpyBenLmtNparCnt is used to refresh the latest value of a variable from the
   * Serialized String the most common reason to serialize an Object as a string in to write to a
   * file. There can be several other reasons for serialization as well
   */
  public int refreshPol9RetTrpyBenLmtNparCnt() throws CFException {
    try {
      return (getIntNumber(
          beginPol9RetTrpyBenLmtNparCnt,
          POL_9_RET_TRPY_BEN_LMT_NPAR_CNT_LEN,
          false /*isSigned*/,
          true /*isSignTrailing*/,
          false /*isSignStoredSeparate*/));
    } catch (Exception ex) {
      throw getSoc7ABend(
          "pol9RetTrpyBenLmtNparCnt",
          beginPol9RetTrpyBenLmtNparCnt,
          POL_9_RET_TRPY_BEN_LMT_NPAR_CNT_LEN);
    }
  }

  int localPol9RetNtwkStsNparCdCounter = -1;

  public boolean isPol9RetNtwkStsNparCdModified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localPol9RetNtwkStsNparCdCounter != sharedCounter;
    localPol9RetNtwkStsNparCdCounter = sharedCounter;
    return hasModified;
  }

  protected static final int POL_9_RET_NTWK_STS_NPAR_CD_LEN = 3;
  /** serialize this Pol9RetNtwkStsNparCd */
  protected void serializePol9RetNtwkStsNparCd(char[] pol9RetNtwkStsNparCd) {
    shareString.getSerializedField().incrementCounter();
    arraycopy(
        pol9RetNtwkStsNparCd,
        0,
        getStringValue(),
        beginPol9RetNtwkStsNparCd,
        POL_9_RET_NTWK_STS_NPAR_CD_LEN);
    localPol9RetNtwkStsNparCdCounter = shareString.getSerializedField().getModifiedCounter();
  }

  protected char[] checkPol9RetNtwkStsNparCdConstraints(char[] value) {
    return super.checkConstraints(value, 3, false, false);
  }
  /**
   * refreshPol9RetNtwkStsNparCd is used to refresh the latest value of a variable from the
   * Serialized String the most common reason to serialize an Object as a string in to write to a
   * file. There can be several other reasons for serialization as well
   */
  public char[] refreshPol9RetNtwkStsNparCd() {
    return (substring(
        getStringValue(),
        beginPol9RetNtwkStsNparCd,
        beginPol9RetNtwkStsNparCd + POL_9_RET_NTWK_STS_NPAR_CD_LEN));
  }
}
