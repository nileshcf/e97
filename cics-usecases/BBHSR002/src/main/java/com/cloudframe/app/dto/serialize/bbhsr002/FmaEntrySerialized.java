package com.cloudframe.app.dto.serialize.bbhsr002;

/**
 * The class FmaEntrySerialized is used to define offsets in order to serialize in a fixed String
 *
 * @author CloudFrame Inc. created on 2025-03-25 at 08:29. using version 5.0.0.231
 */
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;
import java.math.BigDecimal;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class FmaEntrySerialized extends Field {

  protected Logger logger = LoggerFactory.getLogger(FmaEntrySerialized.class);
  /*  Length of the field, if serialized as a String */
  protected static final int FMA_ENTRY_LENGTH = 54;
  /*  offset of each of Child Fields when serialized as a String */
  protected int beginFmaErrCode1;
  protected int beginFmaType1;
  protected int beginFmaTypeNumeric1;
  protected int beginFmaTypeDollars1;
  protected int beginFmaTypeAlpha1;
  protected int beginFmaErrCode2;
  protected int beginFmaType2;
  protected int beginFmaTypeNumeric2;
  protected int beginFmaTypeDollars2;
  protected int beginFmaTypeAlpha2;

  /** Constructor for FmaEntrySerialized */
  public FmaEntrySerialized() {
    // TO-DO auto generated code
  }

  /**
   * Constructor for FmaEntrySerialized. sets the parent value to the parent
   *
   * @param parent
   * @param begin
   */
  public FmaEntrySerialized(Field parent, int begin) {
    setParent(parent, begin);
  }

  /**
   * sets parent for this FmaEntrySerialized to the parent
   *
   * @param parent
   */
  @Override
  public void setParent(Field parent) {
    setParent(parent, 63); // serialize this field at offset 63 by default
  }

  /**
   * sets parent for this FmaEntrySerialized to the parent and set the serialize offset to parameter
   * begin
   *
   * @param parent
   * @param begin - offset used when serializing this object to a String
   */
  public void setParent(Field parent, int begin) {
    super.setParent(parent);
    init(begin); // serialize this field at offset 63 by default
  }
  /** initializes the field in FmaEntrySerialized */
  @Override
  protected void init(int begin) {
    setStartOffset(begin);
    setLength(FMA_ENTRY_LENGTH);
    /*  set the offset/position of each field when this object is serialized as String */
    beginFmaErrCode1 = getStartOffset() + 0; // set offset for serialization

    beginFmaType1 = getStartOffset() + 4; // set offset for serialization

    beginFmaTypeNumeric1 = getStartOffset() + 5; // set offset for serialization

    beginFmaTypeDollars1 = getStartOffset() + 14; // set offset for serialization

    beginFmaTypeAlpha1 = getStartOffset() + 23; // set offset for serialization

    beginFmaErrCode2 = getStartOffset() + 27; // set offset for serialization

    beginFmaType2 = getStartOffset() + 31; // set offset for serialization

    beginFmaTypeNumeric2 = getStartOffset() + 32; // set offset for serialization

    beginFmaTypeDollars2 = getStartOffset() + 41; // set offset for serialization

    beginFmaTypeAlpha2 = getStartOffset() + 50; // set offset for serialization

    /*  end of offset */
  }

  int localFmaErrCode1Counter = -1;

  public boolean isFmaErrCode1Modified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localFmaErrCode1Counter != sharedCounter;
    localFmaErrCode1Counter = sharedCounter;
    return hasModified;
  }

  /**
   * Returns String value of fmaErrCode1
   *
   * @return fmaErrCode1
   */
  public char[] getFmaErrCode1String() {
    return getCharArray(beginFmaErrCode1, FMA_ERR_CODE_1_LEN);
  }

  /**
   * This method allows testing if there is a numeric value stored in the serialized String
   *
   * @return true if numeric value is stored in the string
   */
  public boolean fmaErrCode1IsNumeric() {
    return isNumeric(
        beginFmaErrCode1,
        beginFmaErrCode1 + FMA_ERR_CODE_1_LEN,
        true /*Signed*/,
        true /*isSign trailing*/,
        false /*isSignStoredSeparately*/);
  }

  protected static final int FMA_ERR_CODE_1_LEN = 4;
  /** serializeFmaErrCode1 */
  protected void serializeFmaErrCode1(short fmaErrCode1) {
    putNumber(
        beginFmaErrCode1,
        fmaErrCode1,
        FMA_ERR_CODE_1_LEN,
        true /*isSigned?*/,
        true /*signTrailing?*/,
        false /*storeSignSeparate?*/);
    localFmaErrCode1Counter = shareString.getSerializedField().getModifiedCounter();
  }
  /** serializeFmaErrCode1 */
  protected short serializeFmaErrCode1(char[] value) {
    short fmaErrCode1;
    if (value.length > 0 && value.length != 4) value = new String(value).trim().toCharArray();
    if (value.length < 4) value = pad(4, value, ' ', LEFT_PAD);
    else if (value.length > 4) value = substring(value, 0, 4);
    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
    fmaErrCode1 =
        (short)
            convertString2Number(
                value, true /*isSigned?*/, true /*signTrailing?*/, false /*storeSignSeparate?*/);
    replaceValue(padNumber(4, value, true /*isSigned?*/), beginFmaErrCode1, 4);
    localFmaErrCode1Counter = shareString.getSerializedField().getModifiedCounter();
    return fmaErrCode1;
  }

  protected short checkFmaErrCode1MaxLimit(long number) {

    return (short) checkMaxLimit(number, MAX_10K /*limit*/, true /*isSigned*/);
  }
  /**
   * refreshFmaErrCode1 is used to refresh the latest value of a variable from the Serialized String
   * the most common reason to serialize an Object as a string in to write to a file. There can be
   * several other reasons for serialization as well
   */
  public short refreshFmaErrCode1() throws CFException {
    try {
      return (getShortNumber(
          beginFmaErrCode1,
          FMA_ERR_CODE_1_LEN,
          true /*isSigned*/,
          true /*isSignTrailing*/,
          false /*isSignStoredSeparate*/));
    } catch (Exception ex) {
      throw getSoc7ABend("fmaErrCode1", beginFmaErrCode1, FMA_ERR_CODE_1_LEN);
    }
  }

  int localFmaType1Counter = -1;

  public boolean isFmaType1Modified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localFmaType1Counter != sharedCounter;
    localFmaType1Counter = sharedCounter;
    return hasModified;
  }

  protected static final int FMA_TYPE_1_LEN = 1;
  /** serialize this FmaType1 */
  protected void serializeFmaType1(char[] fmaType1) {
    shareString.getSerializedField().incrementCounter();
    arraycopy(fmaType1, 0, getStringValue(), beginFmaType1, FMA_TYPE_1_LEN);
    localFmaType1Counter = shareString.getSerializedField().getModifiedCounter();
  }

  protected char[] checkFmaType1Constraints(char[] value) {
    return super.checkConstraints(value, 1, false, false);
  }
  /**
   * refreshFmaType1 is used to refresh the latest value of a variable from the Serialized String
   * the most common reason to serialize an Object as a string in to write to a file. There can be
   * several other reasons for serialization as well
   */
  public char[] refreshFmaType1() {
    return (substring(getStringValue(), beginFmaType1, beginFmaType1 + FMA_TYPE_1_LEN));
  }

  int localFmaTypeNumeric1Counter = -1;

  public boolean isFmaTypeNumeric1Modified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localFmaTypeNumeric1Counter != sharedCounter;
    localFmaTypeNumeric1Counter = sharedCounter;
    return hasModified;
  }

  /**
   * Returns String value of fmaTypeNumeric1
   *
   * @return fmaTypeNumeric1
   */
  public char[] getFmaTypeNumeric1String() {
    return getCharArray(beginFmaTypeNumeric1, FMA_TYPE_NUMERIC_1_LEN);
  }

  /**
   * This method allows testing if there is a numeric value stored in the serialized String
   *
   * @return true if numeric value is stored in the string
   */
  public boolean fmaTypeNumeric1IsNumeric() {
    return isNumeric(
        beginFmaTypeNumeric1,
        beginFmaTypeNumeric1 + FMA_TYPE_NUMERIC_1_LEN,
        true /*Signed*/,
        true /*isSign trailing*/,
        false /*isSignStoredSeparately*/);
  }

  protected static final int FMA_TYPE_NUMERIC_1_LEN = 9;
  /** serializeFmaTypeNumeric1 */
  protected void serializeFmaTypeNumeric1(int fmaTypeNumeric1) {
    putNumber(
        beginFmaTypeNumeric1,
        fmaTypeNumeric1,
        FMA_TYPE_NUMERIC_1_LEN,
        true /*isSigned?*/,
        true /*signTrailing?*/,
        false /*storeSignSeparate?*/);
    localFmaTypeNumeric1Counter = shareString.getSerializedField().getModifiedCounter();
  }
  /** serializeFmaTypeNumeric1 */
  protected int serializeFmaTypeNumeric1(char[] value) {
    int fmaTypeNumeric1;
    if (value.length > 0 && value.length != 9) value = new String(value).trim().toCharArray();
    if (value.length < 9) value = pad(9, value, ' ', LEFT_PAD);
    else if (value.length > 9) value = substring(value, 0, 9);
    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
    fmaTypeNumeric1 =
        (int)
            convertString2Number(
                value, true /*isSigned?*/, true /*signTrailing?*/, false /*storeSignSeparate?*/);
    replaceValue(padNumber(9, value, true /*isSigned?*/), beginFmaTypeNumeric1, 9);
    localFmaTypeNumeric1Counter = shareString.getSerializedField().getModifiedCounter();
    return fmaTypeNumeric1;
  }

  protected int checkFmaTypeNumeric1MaxLimit(long number) {

    return (int) checkMaxLimit(number, MAX_1G /*limit*/, true /*isSigned*/);
  }
  /**
   * refreshFmaTypeNumeric1 is used to refresh the latest value of a variable from the Serialized
   * String the most common reason to serialize an Object as a string in to write to a file. There
   * can be several other reasons for serialization as well
   */
  public int refreshFmaTypeNumeric1() throws CFException {
    try {
      return (getIntNumber(
          beginFmaTypeNumeric1,
          FMA_TYPE_NUMERIC_1_LEN,
          true /*isSigned*/,
          true /*isSignTrailing*/,
          false /*isSignStoredSeparate*/));
    } catch (Exception ex) {
      throw getSoc7ABend("fmaTypeNumeric1", beginFmaTypeNumeric1, FMA_TYPE_NUMERIC_1_LEN);
    }
  }

  int localFmaTypeDollars1Counter = -1;

  public boolean isFmaTypeDollars1Modified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localFmaTypeDollars1Counter != sharedCounter;
    localFmaTypeDollars1Counter = sharedCounter;
    return hasModified;
  }

  /**
   * Returns String value of fmaTypeDollars1
   *
   * @return fmaTypeDollars1
   */
  public char[] getFmaTypeDollars1String() {
    return getCharArray(beginFmaTypeDollars1, FMA_TYPE_DOLLARS_1_LEN);
  }

  /**
   * This method allows testing if there is a numeric value stored in the serialized String
   *
   * @return true if numeric value is stored in the string
   */
  public boolean fmaTypeDollars1IsNumeric() {
    return isNumeric(
        beginFmaTypeDollars1,
        beginFmaTypeDollars1 + FMA_TYPE_DOLLARS_1_LEN,
        true /*Signed*/,
        true /*isSign trailing*/,
        false /*isSignStoredSeparately*/);
  }

  protected static final int FMA_TYPE_DOLLARS_1_LEN = 9;
  protected static final int FMA_TYPE_DOLLARS_1_SCALE = 2;

  protected BigDecimal checkFmaTypeDollars1MaxLimit(BigDecimal number) {
    return checkMaxLimit(number, 2 /*scale*/, 9 /*precision*/);
  }

  /** serializeFmaTypeDollars1 */
  protected void serializeFmaTypeDollars1(BigDecimal fmaTypeDollars1) {
    putNumber(
        beginFmaTypeDollars1,
        fmaTypeDollars1,
        FMA_TYPE_DOLLARS_1_LEN,
        FMA_TYPE_DOLLARS_1_SCALE,
        true /*isSigned?*/,
        true /*signTrailing?*/,
        false /*storeSignSeparate?*/);
    localFmaTypeDollars1Counter = shareString.getSerializedField().getModifiedCounter();
  }

  /** serializeFmaTypeDollars1 */
  protected BigDecimal serializeFmaTypeDollars1(char[] value) throws CFException {
    if (value.length < 9) value = pad(9, value, ' ', RIGHT_PAD);
    replaceValue(padNumber(9, value, true /*isSigned?*/), beginFmaTypeDollars1, 9);
    localFmaTypeDollars1Counter = shareString.getSerializedField().getModifiedCounter();
    try {
      return convertString2Decimal(
          value,
          FMA_TYPE_DOLLARS_1_LEN,
          FMA_TYPE_DOLLARS_1_SCALE,
          true /*isSigned?*/,
          true /*signTrailing?*/,
          false /*storeSignSeparate?*/);
    } catch (Exception ex) {
      throw getSoc7ABend("fmaTypeDollars1", beginFmaTypeDollars1, FMA_TYPE_DOLLARS_1_LEN);
    }
  }
  /**
   * refreshFmaTypeDollars1 is used to refresh the latest value of a variable from the Serialized
   * String the most common reason to serialize an Object as a string in to write to a file. There
   * can be several other reasons for serialization as well
   */
  public BigDecimal refreshFmaTypeDollars1() throws CFException {
    try {
      return (getDecimalNumber(
          beginFmaTypeDollars1,
          FMA_TYPE_DOLLARS_1_LEN,
          FMA_TYPE_DOLLARS_1_SCALE,
          true /*isSigned*/,
          true /*isSignTrailing*/,
          false /*isSignStoredSeparate*/));
    } catch (Exception ex) {
      throw getSoc7ABend("fmaTypeDollars1", beginFmaTypeDollars1, FMA_TYPE_DOLLARS_1_LEN);
    }
  }

  int localFmaTypeAlpha1Counter = -1;

  public boolean isFmaTypeAlpha1Modified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localFmaTypeAlpha1Counter != sharedCounter;
    localFmaTypeAlpha1Counter = sharedCounter;
    return hasModified;
  }

  protected static final int FMA_TYPE_ALPHA_1_LEN = 4;
  /** serialize this FmaTypeAlpha1 */
  protected void serializeFmaTypeAlpha1(char[] fmaTypeAlpha1) {
    shareString.getSerializedField().incrementCounter();
    arraycopy(fmaTypeAlpha1, 0, getStringValue(), beginFmaTypeAlpha1, FMA_TYPE_ALPHA_1_LEN);
    localFmaTypeAlpha1Counter = shareString.getSerializedField().getModifiedCounter();
  }

  protected char[] checkFmaTypeAlpha1Constraints(char[] value) {
    return super.checkConstraints(value, 4, false, false);
  }
  /**
   * refreshFmaTypeAlpha1 is used to refresh the latest value of a variable from the Serialized
   * String the most common reason to serialize an Object as a string in to write to a file. There
   * can be several other reasons for serialization as well
   */
  public char[] refreshFmaTypeAlpha1() {
    return (substring(
        getStringValue(), beginFmaTypeAlpha1, beginFmaTypeAlpha1 + FMA_TYPE_ALPHA_1_LEN));
  }

  int localFmaErrCode2Counter = -1;

  public boolean isFmaErrCode2Modified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localFmaErrCode2Counter != sharedCounter;
    localFmaErrCode2Counter = sharedCounter;
    return hasModified;
  }

  /**
   * Returns String value of fmaErrCode2
   *
   * @return fmaErrCode2
   */
  public char[] getFmaErrCode2String() {
    return getCharArray(beginFmaErrCode2, FMA_ERR_CODE_2_LEN);
  }

  /**
   * This method allows testing if there is a numeric value stored in the serialized String
   *
   * @return true if numeric value is stored in the string
   */
  public boolean fmaErrCode2IsNumeric() {
    return isNumeric(
        beginFmaErrCode2,
        beginFmaErrCode2 + FMA_ERR_CODE_2_LEN,
        true /*Signed*/,
        true /*isSign trailing*/,
        false /*isSignStoredSeparately*/);
  }

  protected static final int FMA_ERR_CODE_2_LEN = 4;
  /** serializeFmaErrCode2 */
  protected void serializeFmaErrCode2(short fmaErrCode2) {
    putNumber(
        beginFmaErrCode2,
        fmaErrCode2,
        FMA_ERR_CODE_2_LEN,
        true /*isSigned?*/,
        true /*signTrailing?*/,
        false /*storeSignSeparate?*/);
    localFmaErrCode2Counter = shareString.getSerializedField().getModifiedCounter();
  }
  /** serializeFmaErrCode2 */
  protected short serializeFmaErrCode2(char[] value) {
    short fmaErrCode2;
    if (value.length > 0 && value.length != 4) value = new String(value).trim().toCharArray();
    if (value.length < 4) value = pad(4, value, ' ', LEFT_PAD);
    else if (value.length > 4) value = substring(value, 0, 4);
    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
    fmaErrCode2 =
        (short)
            convertString2Number(
                value, true /*isSigned?*/, true /*signTrailing?*/, false /*storeSignSeparate?*/);
    replaceValue(padNumber(4, value, true /*isSigned?*/), beginFmaErrCode2, 4);
    localFmaErrCode2Counter = shareString.getSerializedField().getModifiedCounter();
    return fmaErrCode2;
  }

  protected short checkFmaErrCode2MaxLimit(long number) {

    return (short) checkMaxLimit(number, MAX_10K /*limit*/, true /*isSigned*/);
  }
  /**
   * refreshFmaErrCode2 is used to refresh the latest value of a variable from the Serialized String
   * the most common reason to serialize an Object as a string in to write to a file. There can be
   * several other reasons for serialization as well
   */
  public short refreshFmaErrCode2() throws CFException {
    try {
      return (getShortNumber(
          beginFmaErrCode2,
          FMA_ERR_CODE_2_LEN,
          true /*isSigned*/,
          true /*isSignTrailing*/,
          false /*isSignStoredSeparate*/));
    } catch (Exception ex) {
      throw getSoc7ABend("fmaErrCode2", beginFmaErrCode2, FMA_ERR_CODE_2_LEN);
    }
  }

  int localFmaType2Counter = -1;

  public boolean isFmaType2Modified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localFmaType2Counter != sharedCounter;
    localFmaType2Counter = sharedCounter;
    return hasModified;
  }

  protected static final int FMA_TYPE_2_LEN = 1;
  /** serialize this FmaType2 */
  protected void serializeFmaType2(char[] fmaType2) {
    shareString.getSerializedField().incrementCounter();
    arraycopy(fmaType2, 0, getStringValue(), beginFmaType2, FMA_TYPE_2_LEN);
    localFmaType2Counter = shareString.getSerializedField().getModifiedCounter();
  }

  protected char[] checkFmaType2Constraints(char[] value) {
    return super.checkConstraints(value, 1, false, false);
  }
  /**
   * refreshFmaType2 is used to refresh the latest value of a variable from the Serialized String
   * the most common reason to serialize an Object as a string in to write to a file. There can be
   * several other reasons for serialization as well
   */
  public char[] refreshFmaType2() {
    return (substring(getStringValue(), beginFmaType2, beginFmaType2 + FMA_TYPE_2_LEN));
  }

  int localFmaTypeNumeric2Counter = -1;

  public boolean isFmaTypeNumeric2Modified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localFmaTypeNumeric2Counter != sharedCounter;
    localFmaTypeNumeric2Counter = sharedCounter;
    return hasModified;
  }

  /**
   * Returns String value of fmaTypeNumeric2
   *
   * @return fmaTypeNumeric2
   */
  public char[] getFmaTypeNumeric2String() {
    return getCharArray(beginFmaTypeNumeric2, FMA_TYPE_NUMERIC_2_LEN);
  }

  /**
   * This method allows testing if there is a numeric value stored in the serialized String
   *
   * @return true if numeric value is stored in the string
   */
  public boolean fmaTypeNumeric2IsNumeric() {
    return isNumeric(
        beginFmaTypeNumeric2,
        beginFmaTypeNumeric2 + FMA_TYPE_NUMERIC_2_LEN,
        true /*Signed*/,
        true /*isSign trailing*/,
        false /*isSignStoredSeparately*/);
  }

  protected static final int FMA_TYPE_NUMERIC_2_LEN = 9;
  /** serializeFmaTypeNumeric2 */
  protected void serializeFmaTypeNumeric2(int fmaTypeNumeric2) {
    putNumber(
        beginFmaTypeNumeric2,
        fmaTypeNumeric2,
        FMA_TYPE_NUMERIC_2_LEN,
        true /*isSigned?*/,
        true /*signTrailing?*/,
        false /*storeSignSeparate?*/);
    localFmaTypeNumeric2Counter = shareString.getSerializedField().getModifiedCounter();
  }
  /** serializeFmaTypeNumeric2 */
  protected int serializeFmaTypeNumeric2(char[] value) {
    int fmaTypeNumeric2;
    if (value.length > 0 && value.length != 9) value = new String(value).trim().toCharArray();
    if (value.length < 9) value = pad(9, value, ' ', LEFT_PAD);
    else if (value.length > 9) value = substring(value, 0, 9);
    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
    fmaTypeNumeric2 =
        (int)
            convertString2Number(
                value, true /*isSigned?*/, true /*signTrailing?*/, false /*storeSignSeparate?*/);
    replaceValue(padNumber(9, value, true /*isSigned?*/), beginFmaTypeNumeric2, 9);
    localFmaTypeNumeric2Counter = shareString.getSerializedField().getModifiedCounter();
    return fmaTypeNumeric2;
  }

  protected int checkFmaTypeNumeric2MaxLimit(long number) {

    return (int) checkMaxLimit(number, MAX_1G /*limit*/, true /*isSigned*/);
  }
  /**
   * refreshFmaTypeNumeric2 is used to refresh the latest value of a variable from the Serialized
   * String the most common reason to serialize an Object as a string in to write to a file. There
   * can be several other reasons for serialization as well
   */
  public int refreshFmaTypeNumeric2() throws CFException {
    try {
      return (getIntNumber(
          beginFmaTypeNumeric2,
          FMA_TYPE_NUMERIC_2_LEN,
          true /*isSigned*/,
          true /*isSignTrailing*/,
          false /*isSignStoredSeparate*/));
    } catch (Exception ex) {
      throw getSoc7ABend("fmaTypeNumeric2", beginFmaTypeNumeric2, FMA_TYPE_NUMERIC_2_LEN);
    }
  }

  int localFmaTypeDollars2Counter = -1;

  public boolean isFmaTypeDollars2Modified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localFmaTypeDollars2Counter != sharedCounter;
    localFmaTypeDollars2Counter = sharedCounter;
    return hasModified;
  }

  /**
   * Returns String value of fmaTypeDollars2
   *
   * @return fmaTypeDollars2
   */
  public char[] getFmaTypeDollars2String() {
    return getCharArray(beginFmaTypeDollars2, FMA_TYPE_DOLLARS_2_LEN);
  }

  /**
   * This method allows testing if there is a numeric value stored in the serialized String
   *
   * @return true if numeric value is stored in the string
   */
  public boolean fmaTypeDollars2IsNumeric() {
    return isNumeric(
        beginFmaTypeDollars2,
        beginFmaTypeDollars2 + FMA_TYPE_DOLLARS_2_LEN,
        true /*Signed*/,
        true /*isSign trailing*/,
        false /*isSignStoredSeparately*/);
  }

  protected static final int FMA_TYPE_DOLLARS_2_LEN = 9;
  protected static final int FMA_TYPE_DOLLARS_2_SCALE = 2;

  protected BigDecimal checkFmaTypeDollars2MaxLimit(BigDecimal number) {
    return checkMaxLimit(number, 2 /*scale*/, 9 /*precision*/);
  }

  /** serializeFmaTypeDollars2 */
  protected void serializeFmaTypeDollars2(BigDecimal fmaTypeDollars2) {
    putNumber(
        beginFmaTypeDollars2,
        fmaTypeDollars2,
        FMA_TYPE_DOLLARS_2_LEN,
        FMA_TYPE_DOLLARS_2_SCALE,
        true /*isSigned?*/,
        true /*signTrailing?*/,
        false /*storeSignSeparate?*/);
    localFmaTypeDollars2Counter = shareString.getSerializedField().getModifiedCounter();
  }

  /** serializeFmaTypeDollars2 */
  protected BigDecimal serializeFmaTypeDollars2(char[] value) throws CFException {
    if (value.length < 9) value = pad(9, value, ' ', RIGHT_PAD);
    replaceValue(padNumber(9, value, true /*isSigned?*/), beginFmaTypeDollars2, 9);
    localFmaTypeDollars2Counter = shareString.getSerializedField().getModifiedCounter();
    try {
      return convertString2Decimal(
          value,
          FMA_TYPE_DOLLARS_2_LEN,
          FMA_TYPE_DOLLARS_2_SCALE,
          true /*isSigned?*/,
          true /*signTrailing?*/,
          false /*storeSignSeparate?*/);
    } catch (Exception ex) {
      throw getSoc7ABend("fmaTypeDollars2", beginFmaTypeDollars2, FMA_TYPE_DOLLARS_2_LEN);
    }
  }
  /**
   * refreshFmaTypeDollars2 is used to refresh the latest value of a variable from the Serialized
   * String the most common reason to serialize an Object as a string in to write to a file. There
   * can be several other reasons for serialization as well
   */
  public BigDecimal refreshFmaTypeDollars2() throws CFException {
    try {
      return (getDecimalNumber(
          beginFmaTypeDollars2,
          FMA_TYPE_DOLLARS_2_LEN,
          FMA_TYPE_DOLLARS_2_SCALE,
          true /*isSigned*/,
          true /*isSignTrailing*/,
          false /*isSignStoredSeparate*/));
    } catch (Exception ex) {
      throw getSoc7ABend("fmaTypeDollars2", beginFmaTypeDollars2, FMA_TYPE_DOLLARS_2_LEN);
    }
  }

  int localFmaTypeAlpha2Counter = -1;

  public boolean isFmaTypeAlpha2Modified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localFmaTypeAlpha2Counter != sharedCounter;
    localFmaTypeAlpha2Counter = sharedCounter;
    return hasModified;
  }

  protected static final int FMA_TYPE_ALPHA_2_LEN = 4;
  /** serialize this FmaTypeAlpha2 */
  protected void serializeFmaTypeAlpha2(char[] fmaTypeAlpha2) {
    shareString.getSerializedField().incrementCounter();
    arraycopy(fmaTypeAlpha2, 0, getStringValue(), beginFmaTypeAlpha2, FMA_TYPE_ALPHA_2_LEN);
    localFmaTypeAlpha2Counter = shareString.getSerializedField().getModifiedCounter();
  }

  protected char[] checkFmaTypeAlpha2Constraints(char[] value) {
    return super.checkConstraints(value, 4, false, false);
  }
  /**
   * refreshFmaTypeAlpha2 is used to refresh the latest value of a variable from the Serialized
   * String the most common reason to serialize an Object as a string in to write to a file. There
   * can be several other reasons for serialization as well
   */
  public char[] refreshFmaTypeAlpha2() {
    return (substring(
        getStringValue(), beginFmaTypeAlpha2, beginFmaTypeAlpha2 + FMA_TYPE_ALPHA_2_LEN));
  }
}
