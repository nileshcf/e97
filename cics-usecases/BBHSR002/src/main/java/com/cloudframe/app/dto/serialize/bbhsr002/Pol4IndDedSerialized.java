package com.cloudframe.app.dto.serialize.bbhsr002;

/**
 * The class Pol4IndDedSerialized is used to define offsets in order to serialize in a fixed String
 *
 * @author CloudFrame Inc. created on 2025-03-25 at 08:29. using version 5.0.0.231
 */
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Pol4IndDedSerialized extends Field {

  protected Logger logger = LoggerFactory.getLogger(Pol4IndDedSerialized.class);
  /*  Length of the field, if serialized as a String */
  protected static final int POL_4_IND_DED_LENGTH = 15;
  /*  offset of each of Child Fields when serialized as a String */
  protected int beginPol4DideSeqNbr;
  protected int beginPol4DideDedAmt;
  protected int beginPol4DideDedCd;
  protected int beginPol4DideDedFreqCd;
  protected int beginPol4DideDedNtwkTypCd;
  protected int beginPol4DideDedSrvcDesc;

  /** Constructor for Pol4IndDedSerialized */
  public Pol4IndDedSerialized() {
    // TO-DO auto generated code
  }

  /**
   * Constructor for Pol4IndDedSerialized. sets the parent value to the parent
   *
   * @param parent
   * @param begin
   */
  public Pol4IndDedSerialized(Field parent, int begin) {
    setParent(parent, begin);
  }

  /**
   * sets parent for this Pol4IndDedSerialized to the parent
   *
   * @param parent
   */
  @Override
  public void setParent(Field parent) {
    setParent(parent, 618); // serialize this field at offset 618 by default
  }

  /**
   * sets parent for this Pol4IndDedSerialized to the parent and set the serialize offset to
   * parameter begin
   *
   * @param parent
   * @param begin - offset used when serializing this object to a String
   */
  public void setParent(Field parent, int begin) {
    super.setParent(parent);
    init(begin); // serialize this field at offset 618 by default
  }
  /** initializes the field in Pol4IndDedSerialized */
  @Override
  protected void init(int begin) {
    setStartOffset(begin);
    setLength(POL_4_IND_DED_LENGTH);
    /*  set the offset/position of each field when this object is serialized as String */
    beginPol4DideSeqNbr = getStartOffset() + 0; // set offset for serialization

    beginPol4DideDedAmt = getStartOffset() + 1; // set offset for serialization

    beginPol4DideDedCd = getStartOffset() + 6; // set offset for serialization

    beginPol4DideDedFreqCd = getStartOffset() + 7; // set offset for serialization

    beginPol4DideDedNtwkTypCd = getStartOffset() + 8; // set offset for serialization

    beginPol4DideDedSrvcDesc = getStartOffset() + 9; // set offset for serialization

    /*  end of offset */
  }

  int localPol4DideSeqNbrCounter = -1;

  public boolean isPol4DideSeqNbrModified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localPol4DideSeqNbrCounter != sharedCounter;
    localPol4DideSeqNbrCounter = sharedCounter;
    return hasModified;
  }

  /**
   * Returns String value of pol4DideSeqNbr
   *
   * @return pol4DideSeqNbr
   */
  public char[] getPol4DideSeqNbrString() {
    return getCharArray(beginPol4DideSeqNbr, POL_4_DIDE_SEQ_NBR_LEN);
  }

  /**
   * This method allows testing if there is a numeric value stored in the serialized String
   *
   * @return true if numeric value is stored in the string
   */
  public boolean pol4DideSeqNbrIsNumeric() {
    return isNumeric(
        beginPol4DideSeqNbr,
        beginPol4DideSeqNbr + POL_4_DIDE_SEQ_NBR_LEN,
        false /*Signed*/,
        true /*isSign trailing*/,
        false /*isSignStoredSeparately*/);
  }

  protected static final int POL_4_DIDE_SEQ_NBR_LEN = 1;
  /** serializePol4DideSeqNbr */
  protected void serializePol4DideSeqNbr(int pol4DideSeqNbr) {
    putNumber(
        beginPol4DideSeqNbr,
        pol4DideSeqNbr,
        POL_4_DIDE_SEQ_NBR_LEN,
        false /*isSigned?*/,
        true /*signTrailing?*/,
        false /*storeSignSeparate?*/);
    localPol4DideSeqNbrCounter = shareString.getSerializedField().getModifiedCounter();
  }
  /** serializePol4DideSeqNbr */
  protected int serializePol4DideSeqNbr(char[] value) {
    int pol4DideSeqNbr;
    if (value.length > 0 && value.length != 1) value = new String(value).trim().toCharArray();
    if (value.length < 1) value = pad(1, value, ' ', LEFT_PAD);
    else if (value.length > 1) value = substring(value, 0, 1);
    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
    pol4DideSeqNbr =
        (int)
            convertString2Number(
                value, false /*isSigned?*/, true /*signTrailing?*/, false /*storeSignSeparate?*/);
    replaceValue(padNumber(1, value, false /*isSigned?*/), beginPol4DideSeqNbr, 1);
    localPol4DideSeqNbrCounter = shareString.getSerializedField().getModifiedCounter();
    return pol4DideSeqNbr;
  }

  protected int checkPol4DideSeqNbrMaxLimit(long number) {

    return (int) checkMaxLimit(number, MAX_10 /*limit*/, false /*isSigned*/);
  }
  /**
   * refreshPol4DideSeqNbr is used to refresh the latest value of a variable from the Serialized
   * String the most common reason to serialize an Object as a string in to write to a file. There
   * can be several other reasons for serialization as well
   */
  public int refreshPol4DideSeqNbr() throws CFException {
    try {
      return (getIntNumber(
          beginPol4DideSeqNbr,
          POL_4_DIDE_SEQ_NBR_LEN,
          false /*isSigned*/,
          true /*isSignTrailing*/,
          false /*isSignStoredSeparate*/));
    } catch (Exception ex) {
      throw getSoc7ABend("pol4DideSeqNbr", beginPol4DideSeqNbr, POL_4_DIDE_SEQ_NBR_LEN);
    }
  }

  int localPol4DideDedAmtCounter = -1;

  public boolean isPol4DideDedAmtModified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localPol4DideDedAmtCounter != sharedCounter;
    localPol4DideDedAmtCounter = sharedCounter;
    return hasModified;
  }

  /**
   * Returns String value of pol4DideDedAmt
   *
   * @return pol4DideDedAmt
   */
  public char[] getPol4DideDedAmtString() {
    return getCharArray(beginPol4DideDedAmt, POL_4_DIDE_DED_AMT_LEN);
  }

  /**
   * This method allows testing if there is a numeric value stored in the serialized String
   *
   * @return true if numeric value is stored in the string
   */
  public boolean pol4DideDedAmtIsNumeric() {
    return isNumeric(
        beginPol4DideDedAmt,
        beginPol4DideDedAmt + POL_4_DIDE_DED_AMT_LEN,
        false /*Signed*/,
        true /*isSign trailing*/,
        false /*isSignStoredSeparately*/);
  }

  protected static final int POL_4_DIDE_DED_AMT_LEN = 5;
  /** serializePol4DideDedAmt */
  protected void serializePol4DideDedAmt(long pol4DideDedAmt) {
    putNumber(
        beginPol4DideDedAmt,
        pol4DideDedAmt,
        POL_4_DIDE_DED_AMT_LEN,
        false /*isSigned?*/,
        true /*signTrailing?*/,
        false /*storeSignSeparate?*/);
    localPol4DideDedAmtCounter = shareString.getSerializedField().getModifiedCounter();
  }
  /** serializePol4DideDedAmt */
  protected long serializePol4DideDedAmt(char[] value) {
    long pol4DideDedAmt;
    if (value.length > 0 && value.length != 5) value = new String(value).trim().toCharArray();
    if (value.length < 5) value = pad(5, value, ' ', LEFT_PAD);
    else if (value.length > 5) value = substring(value, 0, 5);
    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
    pol4DideDedAmt =
        convertString2Number(
            value, false /*isSigned?*/, true /*signTrailing?*/, false /*storeSignSeparate?*/);
    replaceValue(padNumber(5, value, false /*isSigned?*/), beginPol4DideDedAmt, 5);
    localPol4DideDedAmtCounter = shareString.getSerializedField().getModifiedCounter();
    return pol4DideDedAmt;
  }

  protected long checkPol4DideDedAmtMaxLimit(long number) {

    return checkMaxLimit(number, MAX_100K /*limit*/, false /*isSigned*/);
  }
  /**
   * refreshPol4DideDedAmt is used to refresh the latest value of a variable from the Serialized
   * String the most common reason to serialize an Object as a string in to write to a file. There
   * can be several other reasons for serialization as well
   */
  public long refreshPol4DideDedAmt() throws CFException {
    try {
      return (getLongNumber(
          beginPol4DideDedAmt,
          POL_4_DIDE_DED_AMT_LEN,
          false /*isSigned*/,
          true /*isSignTrailing*/,
          false /*isSignStoredSeparate*/));
    } catch (Exception ex) {
      throw getSoc7ABend("pol4DideDedAmt", beginPol4DideDedAmt, POL_4_DIDE_DED_AMT_LEN);
    }
  }

  int localPol4DideDedCdCounter = -1;

  public boolean isPol4DideDedCdModified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localPol4DideDedCdCounter != sharedCounter;
    localPol4DideDedCdCounter = sharedCounter;
    return hasModified;
  }

  /**
   * Returns String value of pol4DideDedCd
   *
   * @return pol4DideDedCd
   */
  public char[] getPol4DideDedCdString() {
    return getCharArray(beginPol4DideDedCd, POL_4_DIDE_DED_CD_LEN);
  }

  /**
   * This method allows testing if there is a numeric value stored in the serialized String
   *
   * @return true if numeric value is stored in the string
   */
  public boolean pol4DideDedCdIsNumeric() {
    return isNumeric(
        beginPol4DideDedCd,
        beginPol4DideDedCd + POL_4_DIDE_DED_CD_LEN,
        false /*Signed*/,
        true /*isSign trailing*/,
        false /*isSignStoredSeparately*/);
  }

  protected static final int POL_4_DIDE_DED_CD_LEN = 1;
  /** serializePol4DideDedCd */
  protected void serializePol4DideDedCd(int pol4DideDedCd) {
    putNumber(
        beginPol4DideDedCd,
        pol4DideDedCd,
        POL_4_DIDE_DED_CD_LEN,
        false /*isSigned?*/,
        true /*signTrailing?*/,
        false /*storeSignSeparate?*/);
    localPol4DideDedCdCounter = shareString.getSerializedField().getModifiedCounter();
  }
  /** serializePol4DideDedCd */
  protected int serializePol4DideDedCd(char[] value) {
    int pol4DideDedCd;
    if (value.length > 0 && value.length != 1) value = new String(value).trim().toCharArray();
    if (value.length < 1) value = pad(1, value, ' ', LEFT_PAD);
    else if (value.length > 1) value = substring(value, 0, 1);
    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
    pol4DideDedCd =
        (int)
            convertString2Number(
                value, false /*isSigned?*/, true /*signTrailing?*/, false /*storeSignSeparate?*/);
    replaceValue(padNumber(1, value, false /*isSigned?*/), beginPol4DideDedCd, 1);
    localPol4DideDedCdCounter = shareString.getSerializedField().getModifiedCounter();
    return pol4DideDedCd;
  }

  protected int checkPol4DideDedCdMaxLimit(long number) {

    return (int) checkMaxLimit(number, MAX_10 /*limit*/, false /*isSigned*/);
  }
  /**
   * refreshPol4DideDedCd is used to refresh the latest value of a variable from the Serialized
   * String the most common reason to serialize an Object as a string in to write to a file. There
   * can be several other reasons for serialization as well
   */
  public int refreshPol4DideDedCd() throws CFException {
    try {
      return (getIntNumber(
          beginPol4DideDedCd,
          POL_4_DIDE_DED_CD_LEN,
          false /*isSigned*/,
          true /*isSignTrailing*/,
          false /*isSignStoredSeparate*/));
    } catch (Exception ex) {
      throw getSoc7ABend("pol4DideDedCd", beginPol4DideDedCd, POL_4_DIDE_DED_CD_LEN);
    }
  }

  int localPol4DideDedFreqCdCounter = -1;

  public boolean isPol4DideDedFreqCdModified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localPol4DideDedFreqCdCounter != sharedCounter;
    localPol4DideDedFreqCdCounter = sharedCounter;
    return hasModified;
  }

  protected static final int POL_4_DIDE_DED_FREQ_CD_LEN = 1;
  /** serialize this Pol4DideDedFreqCd */
  protected void serializePol4DideDedFreqCd(char[] pol4DideDedFreqCd) {
    shareString.getSerializedField().incrementCounter();
    arraycopy(
        pol4DideDedFreqCd, 0, getStringValue(), beginPol4DideDedFreqCd, POL_4_DIDE_DED_FREQ_CD_LEN);
    localPol4DideDedFreqCdCounter = shareString.getSerializedField().getModifiedCounter();
  }

  protected char[] checkPol4DideDedFreqCdConstraints(char[] value) {
    return super.checkConstraints(value, 1, false, false);
  }
  /**
   * refreshPol4DideDedFreqCd is used to refresh the latest value of a variable from the Serialized
   * String the most common reason to serialize an Object as a string in to write to a file. There
   * can be several other reasons for serialization as well
   */
  public char[] refreshPol4DideDedFreqCd() {
    return (substring(
        getStringValue(),
        beginPol4DideDedFreqCd,
        beginPol4DideDedFreqCd + POL_4_DIDE_DED_FREQ_CD_LEN));
  }

  int localPol4DideDedNtwkTypCdCounter = -1;

  public boolean isPol4DideDedNtwkTypCdModified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localPol4DideDedNtwkTypCdCounter != sharedCounter;
    localPol4DideDedNtwkTypCdCounter = sharedCounter;
    return hasModified;
  }

  protected static final int POL_4_DIDE_DED_NTWK_TYP_CD_LEN = 1;
  /** serialize this Pol4DideDedNtwkTypCd */
  protected void serializePol4DideDedNtwkTypCd(char[] pol4DideDedNtwkTypCd) {
    shareString.getSerializedField().incrementCounter();
    arraycopy(
        pol4DideDedNtwkTypCd,
        0,
        getStringValue(),
        beginPol4DideDedNtwkTypCd,
        POL_4_DIDE_DED_NTWK_TYP_CD_LEN);
    localPol4DideDedNtwkTypCdCounter = shareString.getSerializedField().getModifiedCounter();
  }

  protected char[] checkPol4DideDedNtwkTypCdConstraints(char[] value) {
    return super.checkConstraints(value, 1, false, false);
  }
  /**
   * refreshPol4DideDedNtwkTypCd is used to refresh the latest value of a variable from the
   * Serialized String the most common reason to serialize an Object as a string in to write to a
   * file. There can be several other reasons for serialization as well
   */
  public char[] refreshPol4DideDedNtwkTypCd() {
    return (substring(
        getStringValue(),
        beginPol4DideDedNtwkTypCd,
        beginPol4DideDedNtwkTypCd + POL_4_DIDE_DED_NTWK_TYP_CD_LEN));
  }

  int localPol4DideDedSrvcDescCounter = -1;

  public boolean isPol4DideDedSrvcDescModified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localPol4DideDedSrvcDescCounter != sharedCounter;
    localPol4DideDedSrvcDescCounter = sharedCounter;
    return hasModified;
  }

  protected static final int POL_4_DIDE_DED_SRVC_DESC_LEN = 6;
  /** serialize this Pol4DideDedSrvcDesc */
  protected void serializePol4DideDedSrvcDesc(char[] pol4DideDedSrvcDesc) {
    shareString.getSerializedField().incrementCounter();
    arraycopy(
        pol4DideDedSrvcDesc,
        0,
        getStringValue(),
        beginPol4DideDedSrvcDesc,
        POL_4_DIDE_DED_SRVC_DESC_LEN);
    localPol4DideDedSrvcDescCounter = shareString.getSerializedField().getModifiedCounter();
  }

  protected char[] checkPol4DideDedSrvcDescConstraints(char[] value) {
    return super.checkConstraints(value, 6, false, false);
  }
  /**
   * refreshPol4DideDedSrvcDesc is used to refresh the latest value of a variable from the
   * Serialized String the most common reason to serialize an Object as a string in to write to a
   * file. There can be several other reasons for serialization as well
   */
  public char[] refreshPol4DideDedSrvcDesc() {
    return (substring(
        getStringValue(),
        beginPol4DideDedSrvcDesc,
        beginPol4DideDedSrvcDesc + POL_4_DIDE_DED_SRVC_DESC_LEN));
  }
}
