package com.cloudframe.app.dto.serialize.bbhsr002;

/**
 * The class FmaIpEntrySerialized is used to define offsets in order to serialize in a fixed String
 *
 * @author CloudFrame Inc. created on 2025-03-25 at 08:29. using version 5.0.0.231
 */
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;
import java.math.BigDecimal;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class FmaIpEntrySerialized extends Field {

  protected Logger logger = LoggerFactory.getLogger(FmaIpEntrySerialized.class);
  /*  Length of the field, if serialized as a String */
  protected static final int FMA_IP_ENTRY_LENGTH = 54;
  /*  offset of each of Child Fields when serialized as a String */
  protected int beginFmaIpErrCode1;
  protected int beginFmaIpType1;
  protected int beginFmaIpTypeNumeric1;
  protected int beginFmaIpTypeDollars1;
  protected int beginFmaIpTypeAlpha1;
  protected int beginFmaIpErrCode2;
  protected int beginFmaIpType2;
  protected int beginFmaIpTypeNumeric2;
  protected int beginFmaIpTypeDollars2;
  protected int beginFmaIpTypeAlpha2;

  /** Constructor for FmaIpEntrySerialized */
  public FmaIpEntrySerialized() {
    // TO-DO auto generated code
  }

  /**
   * Constructor for FmaIpEntrySerialized. sets the parent value to the parent
   *
   * @param parent
   * @param begin
   */
  public FmaIpEntrySerialized(Field parent, int begin) {
    setParent(parent, begin);
  }

  /**
   * sets parent for this FmaIpEntrySerialized to the parent
   *
   * @param parent
   */
  @Override
  public void setParent(Field parent) {
    setParent(parent, 9); // serialize this field at offset 9 by default
  }

  /**
   * sets parent for this FmaIpEntrySerialized to the parent and set the serialize offset to
   * parameter begin
   *
   * @param parent
   * @param begin - offset used when serializing this object to a String
   */
  public void setParent(Field parent, int begin) {
    super.setParent(parent);
    init(begin); // serialize this field at offset 9 by default
  }
  /** initializes the field in FmaIpEntrySerialized */
  @Override
  protected void init(int begin) {
    setStartOffset(begin);
    setLength(FMA_IP_ENTRY_LENGTH);
    /*  set the offset/position of each field when this object is serialized as String */
    beginFmaIpErrCode1 = getStartOffset() + 0; // set offset for serialization

    beginFmaIpType1 = getStartOffset() + 4; // set offset for serialization

    beginFmaIpTypeNumeric1 = getStartOffset() + 5; // set offset for serialization

    beginFmaIpTypeDollars1 = getStartOffset() + 14; // set offset for serialization

    beginFmaIpTypeAlpha1 = getStartOffset() + 23; // set offset for serialization

    beginFmaIpErrCode2 = getStartOffset() + 27; // set offset for serialization

    beginFmaIpType2 = getStartOffset() + 31; // set offset for serialization

    beginFmaIpTypeNumeric2 = getStartOffset() + 32; // set offset for serialization

    beginFmaIpTypeDollars2 = getStartOffset() + 41; // set offset for serialization

    beginFmaIpTypeAlpha2 = getStartOffset() + 50; // set offset for serialization

    /*  end of offset */
  }

  int localFmaIpErrCode1Counter = -1;

  public boolean isFmaIpErrCode1Modified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localFmaIpErrCode1Counter != sharedCounter;
    localFmaIpErrCode1Counter = sharedCounter;
    return hasModified;
  }

  /**
   * Returns String value of fmaIpErrCode1
   *
   * @return fmaIpErrCode1
   */
  public char[] getFmaIpErrCode1String() {
    return getCharArray(beginFmaIpErrCode1, FMA_IP_ERR_CODE_1_LEN);
  }

  /**
   * This method allows testing if there is a numeric value stored in the serialized String
   *
   * @return true if numeric value is stored in the string
   */
  public boolean fmaIpErrCode1IsNumeric() {
    return isNumeric(
        beginFmaIpErrCode1,
        beginFmaIpErrCode1 + FMA_IP_ERR_CODE_1_LEN,
        true /*Signed*/,
        true /*isSign trailing*/,
        false /*isSignStoredSeparately*/);
  }

  protected static final int FMA_IP_ERR_CODE_1_LEN = 4;
  /** serializeFmaIpErrCode1 */
  protected void serializeFmaIpErrCode1(short fmaIpErrCode1) {
    putNumber(
        beginFmaIpErrCode1,
        fmaIpErrCode1,
        FMA_IP_ERR_CODE_1_LEN,
        true /*isSigned?*/,
        true /*signTrailing?*/,
        false /*storeSignSeparate?*/);
    localFmaIpErrCode1Counter = shareString.getSerializedField().getModifiedCounter();
  }
  /** serializeFmaIpErrCode1 */
  protected short serializeFmaIpErrCode1(char[] value) {
    short fmaIpErrCode1;
    if (value.length > 0 && value.length != 4) value = new String(value).trim().toCharArray();
    if (value.length < 4) value = pad(4, value, ' ', LEFT_PAD);
    else if (value.length > 4) value = substring(value, 0, 4);
    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
    fmaIpErrCode1 =
        (short)
            convertString2Number(
                value, true /*isSigned?*/, true /*signTrailing?*/, false /*storeSignSeparate?*/);
    replaceValue(padNumber(4, value, true /*isSigned?*/), beginFmaIpErrCode1, 4);
    localFmaIpErrCode1Counter = shareString.getSerializedField().getModifiedCounter();
    return fmaIpErrCode1;
  }

  protected short checkFmaIpErrCode1MaxLimit(long number) {

    return (short) checkMaxLimit(number, MAX_10K /*limit*/, true /*isSigned*/);
  }
  /**
   * refreshFmaIpErrCode1 is used to refresh the latest value of a variable from the Serialized
   * String the most common reason to serialize an Object as a string in to write to a file. There
   * can be several other reasons for serialization as well
   */
  public short refreshFmaIpErrCode1() throws CFException {
    try {
      return (getShortNumber(
          beginFmaIpErrCode1,
          FMA_IP_ERR_CODE_1_LEN,
          true /*isSigned*/,
          true /*isSignTrailing*/,
          false /*isSignStoredSeparate*/));
    } catch (Exception ex) {
      throw getSoc7ABend("fmaIpErrCode1", beginFmaIpErrCode1, FMA_IP_ERR_CODE_1_LEN);
    }
  }

  int localFmaIpType1Counter = -1;

  public boolean isFmaIpType1Modified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localFmaIpType1Counter != sharedCounter;
    localFmaIpType1Counter = sharedCounter;
    return hasModified;
  }

  protected static final int FMA_IP_TYPE_1_LEN = 1;
  /** serialize this FmaIpType1 */
  protected void serializeFmaIpType1(char[] fmaIpType1) {
    shareString.getSerializedField().incrementCounter();
    arraycopy(fmaIpType1, 0, getStringValue(), beginFmaIpType1, FMA_IP_TYPE_1_LEN);
    localFmaIpType1Counter = shareString.getSerializedField().getModifiedCounter();
  }

  protected char[] checkFmaIpType1Constraints(char[] value) {
    return super.checkConstraints(value, 1, false, false);
  }
  /**
   * refreshFmaIpType1 is used to refresh the latest value of a variable from the Serialized String
   * the most common reason to serialize an Object as a string in to write to a file. There can be
   * several other reasons for serialization as well
   */
  public char[] refreshFmaIpType1() {
    return (substring(getStringValue(), beginFmaIpType1, beginFmaIpType1 + FMA_IP_TYPE_1_LEN));
  }

  int localFmaIpTypeNumeric1Counter = -1;

  public boolean isFmaIpTypeNumeric1Modified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localFmaIpTypeNumeric1Counter != sharedCounter;
    localFmaIpTypeNumeric1Counter = sharedCounter;
    return hasModified;
  }

  /**
   * Returns String value of fmaIpTypeNumeric1
   *
   * @return fmaIpTypeNumeric1
   */
  public char[] getFmaIpTypeNumeric1String() {
    return getCharArray(beginFmaIpTypeNumeric1, FMA_IP_TYPE_NUMERIC_1_LEN);
  }

  /**
   * This method allows testing if there is a numeric value stored in the serialized String
   *
   * @return true if numeric value is stored in the string
   */
  public boolean fmaIpTypeNumeric1IsNumeric() {
    return isNumeric(
        beginFmaIpTypeNumeric1,
        beginFmaIpTypeNumeric1 + FMA_IP_TYPE_NUMERIC_1_LEN,
        true /*Signed*/,
        true /*isSign trailing*/,
        false /*isSignStoredSeparately*/);
  }

  protected static final int FMA_IP_TYPE_NUMERIC_1_LEN = 9;
  /** serializeFmaIpTypeNumeric1 */
  protected void serializeFmaIpTypeNumeric1(int fmaIpTypeNumeric1) {
    putNumber(
        beginFmaIpTypeNumeric1,
        fmaIpTypeNumeric1,
        FMA_IP_TYPE_NUMERIC_1_LEN,
        true /*isSigned?*/,
        true /*signTrailing?*/,
        false /*storeSignSeparate?*/);
    localFmaIpTypeNumeric1Counter = shareString.getSerializedField().getModifiedCounter();
  }
  /** serializeFmaIpTypeNumeric1 */
  protected int serializeFmaIpTypeNumeric1(char[] value) {
    int fmaIpTypeNumeric1;
    if (value.length > 0 && value.length != 9) value = new String(value).trim().toCharArray();
    if (value.length < 9) value = pad(9, value, ' ', LEFT_PAD);
    else if (value.length > 9) value = substring(value, 0, 9);
    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
    fmaIpTypeNumeric1 =
        (int)
            convertString2Number(
                value, true /*isSigned?*/, true /*signTrailing?*/, false /*storeSignSeparate?*/);
    replaceValue(padNumber(9, value, true /*isSigned?*/), beginFmaIpTypeNumeric1, 9);
    localFmaIpTypeNumeric1Counter = shareString.getSerializedField().getModifiedCounter();
    return fmaIpTypeNumeric1;
  }

  protected int checkFmaIpTypeNumeric1MaxLimit(long number) {

    return (int) checkMaxLimit(number, MAX_1G /*limit*/, true /*isSigned*/);
  }
  /**
   * refreshFmaIpTypeNumeric1 is used to refresh the latest value of a variable from the Serialized
   * String the most common reason to serialize an Object as a string in to write to a file. There
   * can be several other reasons for serialization as well
   */
  public int refreshFmaIpTypeNumeric1() throws CFException {
    try {
      return (getIntNumber(
          beginFmaIpTypeNumeric1,
          FMA_IP_TYPE_NUMERIC_1_LEN,
          true /*isSigned*/,
          true /*isSignTrailing*/,
          false /*isSignStoredSeparate*/));
    } catch (Exception ex) {
      throw getSoc7ABend("fmaIpTypeNumeric1", beginFmaIpTypeNumeric1, FMA_IP_TYPE_NUMERIC_1_LEN);
    }
  }

  int localFmaIpTypeDollars1Counter = -1;

  public boolean isFmaIpTypeDollars1Modified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localFmaIpTypeDollars1Counter != sharedCounter;
    localFmaIpTypeDollars1Counter = sharedCounter;
    return hasModified;
  }

  /**
   * Returns String value of fmaIpTypeDollars1
   *
   * @return fmaIpTypeDollars1
   */
  public char[] getFmaIpTypeDollars1String() {
    return getCharArray(beginFmaIpTypeDollars1, FMA_IP_TYPE_DOLLARS_1_LEN);
  }

  /**
   * This method allows testing if there is a numeric value stored in the serialized String
   *
   * @return true if numeric value is stored in the string
   */
  public boolean fmaIpTypeDollars1IsNumeric() {
    return isNumeric(
        beginFmaIpTypeDollars1,
        beginFmaIpTypeDollars1 + FMA_IP_TYPE_DOLLARS_1_LEN,
        true /*Signed*/,
        true /*isSign trailing*/,
        false /*isSignStoredSeparately*/);
  }

  protected static final int FMA_IP_TYPE_DOLLARS_1_LEN = 9;
  protected static final int FMA_IP_TYPE_DOLLARS_1_SCALE = 2;

  protected BigDecimal checkFmaIpTypeDollars1MaxLimit(BigDecimal number) {
    return checkMaxLimit(number, 2 /*scale*/, 9 /*precision*/);
  }

  /** serializeFmaIpTypeDollars1 */
  protected void serializeFmaIpTypeDollars1(BigDecimal fmaIpTypeDollars1) {
    putNumber(
        beginFmaIpTypeDollars1,
        fmaIpTypeDollars1,
        FMA_IP_TYPE_DOLLARS_1_LEN,
        FMA_IP_TYPE_DOLLARS_1_SCALE,
        true /*isSigned?*/,
        true /*signTrailing?*/,
        false /*storeSignSeparate?*/);
    localFmaIpTypeDollars1Counter = shareString.getSerializedField().getModifiedCounter();
  }

  /** serializeFmaIpTypeDollars1 */
  protected BigDecimal serializeFmaIpTypeDollars1(char[] value) throws CFException {
    if (value.length < 9) value = pad(9, value, ' ', RIGHT_PAD);
    replaceValue(padNumber(9, value, true /*isSigned?*/), beginFmaIpTypeDollars1, 9);
    localFmaIpTypeDollars1Counter = shareString.getSerializedField().getModifiedCounter();
    try {
      return convertString2Decimal(
          value,
          FMA_IP_TYPE_DOLLARS_1_LEN,
          FMA_IP_TYPE_DOLLARS_1_SCALE,
          true /*isSigned?*/,
          true /*signTrailing?*/,
          false /*storeSignSeparate?*/);
    } catch (Exception ex) {
      throw getSoc7ABend("fmaIpTypeDollars1", beginFmaIpTypeDollars1, FMA_IP_TYPE_DOLLARS_1_LEN);
    }
  }
  /**
   * refreshFmaIpTypeDollars1 is used to refresh the latest value of a variable from the Serialized
   * String the most common reason to serialize an Object as a string in to write to a file. There
   * can be several other reasons for serialization as well
   */
  public BigDecimal refreshFmaIpTypeDollars1() throws CFException {
    try {
      return (getDecimalNumber(
          beginFmaIpTypeDollars1,
          FMA_IP_TYPE_DOLLARS_1_LEN,
          FMA_IP_TYPE_DOLLARS_1_SCALE,
          true /*isSigned*/,
          true /*isSignTrailing*/,
          false /*isSignStoredSeparate*/));
    } catch (Exception ex) {
      throw getSoc7ABend("fmaIpTypeDollars1", beginFmaIpTypeDollars1, FMA_IP_TYPE_DOLLARS_1_LEN);
    }
  }

  int localFmaIpTypeAlpha1Counter = -1;

  public boolean isFmaIpTypeAlpha1Modified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localFmaIpTypeAlpha1Counter != sharedCounter;
    localFmaIpTypeAlpha1Counter = sharedCounter;
    return hasModified;
  }

  protected static final int FMA_IP_TYPE_ALPHA_1_LEN = 4;
  /** serialize this FmaIpTypeAlpha1 */
  protected void serializeFmaIpTypeAlpha1(char[] fmaIpTypeAlpha1) {
    shareString.getSerializedField().incrementCounter();
    arraycopy(fmaIpTypeAlpha1, 0, getStringValue(), beginFmaIpTypeAlpha1, FMA_IP_TYPE_ALPHA_1_LEN);
    localFmaIpTypeAlpha1Counter = shareString.getSerializedField().getModifiedCounter();
  }

  protected char[] checkFmaIpTypeAlpha1Constraints(char[] value) {
    return super.checkConstraints(value, 4, false, false);
  }
  /**
   * refreshFmaIpTypeAlpha1 is used to refresh the latest value of a variable from the Serialized
   * String the most common reason to serialize an Object as a string in to write to a file. There
   * can be several other reasons for serialization as well
   */
  public char[] refreshFmaIpTypeAlpha1() {
    return (substring(
        getStringValue(), beginFmaIpTypeAlpha1, beginFmaIpTypeAlpha1 + FMA_IP_TYPE_ALPHA_1_LEN));
  }

  int localFmaIpErrCode2Counter = -1;

  public boolean isFmaIpErrCode2Modified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localFmaIpErrCode2Counter != sharedCounter;
    localFmaIpErrCode2Counter = sharedCounter;
    return hasModified;
  }

  /**
   * Returns String value of fmaIpErrCode2
   *
   * @return fmaIpErrCode2
   */
  public char[] getFmaIpErrCode2String() {
    return getCharArray(beginFmaIpErrCode2, FMA_IP_ERR_CODE_2_LEN);
  }

  /**
   * This method allows testing if there is a numeric value stored in the serialized String
   *
   * @return true if numeric value is stored in the string
   */
  public boolean fmaIpErrCode2IsNumeric() {
    return isNumeric(
        beginFmaIpErrCode2,
        beginFmaIpErrCode2 + FMA_IP_ERR_CODE_2_LEN,
        true /*Signed*/,
        true /*isSign trailing*/,
        false /*isSignStoredSeparately*/);
  }

  protected static final int FMA_IP_ERR_CODE_2_LEN = 4;
  /** serializeFmaIpErrCode2 */
  protected void serializeFmaIpErrCode2(short fmaIpErrCode2) {
    putNumber(
        beginFmaIpErrCode2,
        fmaIpErrCode2,
        FMA_IP_ERR_CODE_2_LEN,
        true /*isSigned?*/,
        true /*signTrailing?*/,
        false /*storeSignSeparate?*/);
    localFmaIpErrCode2Counter = shareString.getSerializedField().getModifiedCounter();
  }
  /** serializeFmaIpErrCode2 */
  protected short serializeFmaIpErrCode2(char[] value) {
    short fmaIpErrCode2;
    if (value.length > 0 && value.length != 4) value = new String(value).trim().toCharArray();
    if (value.length < 4) value = pad(4, value, ' ', LEFT_PAD);
    else if (value.length > 4) value = substring(value, 0, 4);
    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
    fmaIpErrCode2 =
        (short)
            convertString2Number(
                value, true /*isSigned?*/, true /*signTrailing?*/, false /*storeSignSeparate?*/);
    replaceValue(padNumber(4, value, true /*isSigned?*/), beginFmaIpErrCode2, 4);
    localFmaIpErrCode2Counter = shareString.getSerializedField().getModifiedCounter();
    return fmaIpErrCode2;
  }

  protected short checkFmaIpErrCode2MaxLimit(long number) {

    return (short) checkMaxLimit(number, MAX_10K /*limit*/, true /*isSigned*/);
  }
  /**
   * refreshFmaIpErrCode2 is used to refresh the latest value of a variable from the Serialized
   * String the most common reason to serialize an Object as a string in to write to a file. There
   * can be several other reasons for serialization as well
   */
  public short refreshFmaIpErrCode2() throws CFException {
    try {
      return (getShortNumber(
          beginFmaIpErrCode2,
          FMA_IP_ERR_CODE_2_LEN,
          true /*isSigned*/,
          true /*isSignTrailing*/,
          false /*isSignStoredSeparate*/));
    } catch (Exception ex) {
      throw getSoc7ABend("fmaIpErrCode2", beginFmaIpErrCode2, FMA_IP_ERR_CODE_2_LEN);
    }
  }

  int localFmaIpType2Counter = -1;

  public boolean isFmaIpType2Modified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localFmaIpType2Counter != sharedCounter;
    localFmaIpType2Counter = sharedCounter;
    return hasModified;
  }

  protected static final int FMA_IP_TYPE_2_LEN = 1;
  /** serialize this FmaIpType2 */
  protected void serializeFmaIpType2(char[] fmaIpType2) {
    shareString.getSerializedField().incrementCounter();
    arraycopy(fmaIpType2, 0, getStringValue(), beginFmaIpType2, FMA_IP_TYPE_2_LEN);
    localFmaIpType2Counter = shareString.getSerializedField().getModifiedCounter();
  }

  protected char[] checkFmaIpType2Constraints(char[] value) {
    return super.checkConstraints(value, 1, false, false);
  }
  /**
   * refreshFmaIpType2 is used to refresh the latest value of a variable from the Serialized String
   * the most common reason to serialize an Object as a string in to write to a file. There can be
   * several other reasons for serialization as well
   */
  public char[] refreshFmaIpType2() {
    return (substring(getStringValue(), beginFmaIpType2, beginFmaIpType2 + FMA_IP_TYPE_2_LEN));
  }

  int localFmaIpTypeNumeric2Counter = -1;

  public boolean isFmaIpTypeNumeric2Modified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localFmaIpTypeNumeric2Counter != sharedCounter;
    localFmaIpTypeNumeric2Counter = sharedCounter;
    return hasModified;
  }

  /**
   * Returns String value of fmaIpTypeNumeric2
   *
   * @return fmaIpTypeNumeric2
   */
  public char[] getFmaIpTypeNumeric2String() {
    return getCharArray(beginFmaIpTypeNumeric2, FMA_IP_TYPE_NUMERIC_2_LEN);
  }

  /**
   * This method allows testing if there is a numeric value stored in the serialized String
   *
   * @return true if numeric value is stored in the string
   */
  public boolean fmaIpTypeNumeric2IsNumeric() {
    return isNumeric(
        beginFmaIpTypeNumeric2,
        beginFmaIpTypeNumeric2 + FMA_IP_TYPE_NUMERIC_2_LEN,
        true /*Signed*/,
        true /*isSign trailing*/,
        false /*isSignStoredSeparately*/);
  }

  protected static final int FMA_IP_TYPE_NUMERIC_2_LEN = 9;
  /** serializeFmaIpTypeNumeric2 */
  protected void serializeFmaIpTypeNumeric2(int fmaIpTypeNumeric2) {
    putNumber(
        beginFmaIpTypeNumeric2,
        fmaIpTypeNumeric2,
        FMA_IP_TYPE_NUMERIC_2_LEN,
        true /*isSigned?*/,
        true /*signTrailing?*/,
        false /*storeSignSeparate?*/);
    localFmaIpTypeNumeric2Counter = shareString.getSerializedField().getModifiedCounter();
  }
  /** serializeFmaIpTypeNumeric2 */
  protected int serializeFmaIpTypeNumeric2(char[] value) {
    int fmaIpTypeNumeric2;
    if (value.length > 0 && value.length != 9) value = new String(value).trim().toCharArray();
    if (value.length < 9) value = pad(9, value, ' ', LEFT_PAD);
    else if (value.length > 9) value = substring(value, 0, 9);
    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
    fmaIpTypeNumeric2 =
        (int)
            convertString2Number(
                value, true /*isSigned?*/, true /*signTrailing?*/, false /*storeSignSeparate?*/);
    replaceValue(padNumber(9, value, true /*isSigned?*/), beginFmaIpTypeNumeric2, 9);
    localFmaIpTypeNumeric2Counter = shareString.getSerializedField().getModifiedCounter();
    return fmaIpTypeNumeric2;
  }

  protected int checkFmaIpTypeNumeric2MaxLimit(long number) {

    return (int) checkMaxLimit(number, MAX_1G /*limit*/, true /*isSigned*/);
  }
  /**
   * refreshFmaIpTypeNumeric2 is used to refresh the latest value of a variable from the Serialized
   * String the most common reason to serialize an Object as a string in to write to a file. There
   * can be several other reasons for serialization as well
   */
  public int refreshFmaIpTypeNumeric2() throws CFException {
    try {
      return (getIntNumber(
          beginFmaIpTypeNumeric2,
          FMA_IP_TYPE_NUMERIC_2_LEN,
          true /*isSigned*/,
          true /*isSignTrailing*/,
          false /*isSignStoredSeparate*/));
    } catch (Exception ex) {
      throw getSoc7ABend("fmaIpTypeNumeric2", beginFmaIpTypeNumeric2, FMA_IP_TYPE_NUMERIC_2_LEN);
    }
  }

  int localFmaIpTypeDollars2Counter = -1;

  public boolean isFmaIpTypeDollars2Modified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localFmaIpTypeDollars2Counter != sharedCounter;
    localFmaIpTypeDollars2Counter = sharedCounter;
    return hasModified;
  }

  /**
   * Returns String value of fmaIpTypeDollars2
   *
   * @return fmaIpTypeDollars2
   */
  public char[] getFmaIpTypeDollars2String() {
    return getCharArray(beginFmaIpTypeDollars2, FMA_IP_TYPE_DOLLARS_2_LEN);
  }

  /**
   * This method allows testing if there is a numeric value stored in the serialized String
   *
   * @return true if numeric value is stored in the string
   */
  public boolean fmaIpTypeDollars2IsNumeric() {
    return isNumeric(
        beginFmaIpTypeDollars2,
        beginFmaIpTypeDollars2 + FMA_IP_TYPE_DOLLARS_2_LEN,
        true /*Signed*/,
        true /*isSign trailing*/,
        false /*isSignStoredSeparately*/);
  }

  protected static final int FMA_IP_TYPE_DOLLARS_2_LEN = 9;
  protected static final int FMA_IP_TYPE_DOLLARS_2_SCALE = 2;

  protected BigDecimal checkFmaIpTypeDollars2MaxLimit(BigDecimal number) {
    return checkMaxLimit(number, 2 /*scale*/, 9 /*precision*/);
  }

  /** serializeFmaIpTypeDollars2 */
  protected void serializeFmaIpTypeDollars2(BigDecimal fmaIpTypeDollars2) {
    putNumber(
        beginFmaIpTypeDollars2,
        fmaIpTypeDollars2,
        FMA_IP_TYPE_DOLLARS_2_LEN,
        FMA_IP_TYPE_DOLLARS_2_SCALE,
        true /*isSigned?*/,
        true /*signTrailing?*/,
        false /*storeSignSeparate?*/);
    localFmaIpTypeDollars2Counter = shareString.getSerializedField().getModifiedCounter();
  }

  /** serializeFmaIpTypeDollars2 */
  protected BigDecimal serializeFmaIpTypeDollars2(char[] value) throws CFException {
    if (value.length < 9) value = pad(9, value, ' ', RIGHT_PAD);
    replaceValue(padNumber(9, value, true /*isSigned?*/), beginFmaIpTypeDollars2, 9);
    localFmaIpTypeDollars2Counter = shareString.getSerializedField().getModifiedCounter();
    try {
      return convertString2Decimal(
          value,
          FMA_IP_TYPE_DOLLARS_2_LEN,
          FMA_IP_TYPE_DOLLARS_2_SCALE,
          true /*isSigned?*/,
          true /*signTrailing?*/,
          false /*storeSignSeparate?*/);
    } catch (Exception ex) {
      throw getSoc7ABend("fmaIpTypeDollars2", beginFmaIpTypeDollars2, FMA_IP_TYPE_DOLLARS_2_LEN);
    }
  }
  /**
   * refreshFmaIpTypeDollars2 is used to refresh the latest value of a variable from the Serialized
   * String the most common reason to serialize an Object as a string in to write to a file. There
   * can be several other reasons for serialization as well
   */
  public BigDecimal refreshFmaIpTypeDollars2() throws CFException {
    try {
      return (getDecimalNumber(
          beginFmaIpTypeDollars2,
          FMA_IP_TYPE_DOLLARS_2_LEN,
          FMA_IP_TYPE_DOLLARS_2_SCALE,
          true /*isSigned*/,
          true /*isSignTrailing*/,
          false /*isSignStoredSeparate*/));
    } catch (Exception ex) {
      throw getSoc7ABend("fmaIpTypeDollars2", beginFmaIpTypeDollars2, FMA_IP_TYPE_DOLLARS_2_LEN);
    }
  }

  int localFmaIpTypeAlpha2Counter = -1;

  public boolean isFmaIpTypeAlpha2Modified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localFmaIpTypeAlpha2Counter != sharedCounter;
    localFmaIpTypeAlpha2Counter = sharedCounter;
    return hasModified;
  }

  protected static final int FMA_IP_TYPE_ALPHA_2_LEN = 4;
  /** serialize this FmaIpTypeAlpha2 */
  protected void serializeFmaIpTypeAlpha2(char[] fmaIpTypeAlpha2) {
    shareString.getSerializedField().incrementCounter();
    arraycopy(fmaIpTypeAlpha2, 0, getStringValue(), beginFmaIpTypeAlpha2, FMA_IP_TYPE_ALPHA_2_LEN);
    localFmaIpTypeAlpha2Counter = shareString.getSerializedField().getModifiedCounter();
  }

  protected char[] checkFmaIpTypeAlpha2Constraints(char[] value) {
    return super.checkConstraints(value, 4, false, false);
  }
  /**
   * refreshFmaIpTypeAlpha2 is used to refresh the latest value of a variable from the Serialized
   * String the most common reason to serialize an Object as a string in to write to a file. There
   * can be several other reasons for serialization as well
   */
  public char[] refreshFmaIpTypeAlpha2() {
    return (substring(
        getStringValue(), beginFmaIpTypeAlpha2, beginFmaIpTypeAlpha2 + FMA_IP_TYPE_ALPHA_2_LEN));
  }
}
