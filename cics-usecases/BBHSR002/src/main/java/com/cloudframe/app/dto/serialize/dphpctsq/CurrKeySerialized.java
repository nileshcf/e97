package com.cloudframe.app.dto.serialize.dphpctsq;

/**
 * The class CurrKeySerialized is used to define offsets in order to serialize in a fixed String
 *
 * @author CloudFrame Inc. created on 2025-03-25 at 08:30. using version 5.0.0.231
 */
import com.cloudframe.app.data.Field;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class CurrKeySerialized extends Field {

  protected Logger logger = LoggerFactory.getLogger(CurrKeySerialized.class);
  /*  Length of the field, if serialized as a String */
  protected static final int CURR_KEY_LENGTH = 7;
  /*  offset of each of Child Fields when serialized as a String */
  protected int beginWKeyQueryTyp;
  protected int beginWKeyHipaaVerNbr;
  protected int beginWKeySortCol1;

  /** Constructor for CurrKeySerialized */
  public CurrKeySerialized() {
    init(0);
  }

  /** initializes the field in CurrKeySerialized */
  @Override
  protected void init(int begin) {
    setStartOffset(begin);
    setLength(CURR_KEY_LENGTH);
    /*  set the offset/position of each field when this object is serialized as String */
    beginWKeyQueryTyp = getStartOffset() + 0; // set offset for serialization

    beginWKeyHipaaVerNbr = getStartOffset() + 4; // set offset for serialization

    beginWKeySortCol1 = getStartOffset() + 5; // set offset for serialization

    /*  end of offset */
  }

  int localWKeyQueryTypCounter = -1;

  public boolean isWKeyQueryTypModified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localWKeyQueryTypCounter != sharedCounter;
    localWKeyQueryTypCounter = sharedCounter;
    return hasModified;
  }

  protected static final int W_KEY_QUERY_TYP_LEN = 4;
  /** serializeWKeyQueryTyp */
  protected void serializeWKeyQueryTyp(int wKeyQueryTyp) {
    replaceValue( //  save the value as string
        getBinaryString(wKeyQueryTyp, W_KEY_QUERY_TYP_LEN), beginWKeyQueryTyp, W_KEY_QUERY_TYP_LEN);
    localWKeyQueryTypCounter = shareString.getSerializedField().getModifiedCounter();
  }

  protected int checkWKeyQueryTypMaxLimit(long number) {
    return (int) checkMaxLimit(number, true /*isSigned*/, 4 /*dataLen*/);
  }
  /**
   * refreshWKeyQueryTyp is used to refresh the latest value of a variable from the Serialized
   * String the most common reason to serialize an Object as a string in to write to a file. There
   * can be several other reasons for serialization as well
   */
  public int refreshWKeyQueryTyp() {
    return (getInt(beginWKeyQueryTyp));
  }

  int localWKeyHipaaVerNbrCounter = -1;

  public boolean isWKeyHipaaVerNbrModified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localWKeyHipaaVerNbrCounter != sharedCounter;
    localWKeyHipaaVerNbrCounter = sharedCounter;
    return hasModified;
  }

  protected static final int W_KEY_HIPAA_VER_NBR_LEN = 1;
  /** serialize this WKeyHipaaVerNbr */
  protected void serializeWKeyHipaaVerNbr(char[] wKeyHipaaVerNbr) {
    shareString.getSerializedField().incrementCounter();
    arraycopy(wKeyHipaaVerNbr, 0, getStringValue(), beginWKeyHipaaVerNbr, W_KEY_HIPAA_VER_NBR_LEN);
    localWKeyHipaaVerNbrCounter = shareString.getSerializedField().getModifiedCounter();
  }

  protected char[] checkWKeyHipaaVerNbrConstraints(char[] value) {
    return super.checkConstraints(value, 1, false, false);
  }
  /**
   * refreshWKeyHipaaVerNbr is used to refresh the latest value of a variable from the Serialized
   * String the most common reason to serialize an Object as a string in to write to a file. There
   * can be several other reasons for serialization as well
   */
  public char[] refreshWKeyHipaaVerNbr() {
    return (substring(
        getStringValue(), beginWKeyHipaaVerNbr, beginWKeyHipaaVerNbr + W_KEY_HIPAA_VER_NBR_LEN));
  }

  int localWKeySortCol1Counter = -1;

  public boolean isWKeySortCol1Modified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localWKeySortCol1Counter != sharedCounter;
    localWKeySortCol1Counter = sharedCounter;
    return hasModified;
  }

  protected static final int W_KEY_SORT_COL_1_LEN = 2;
  /** serialize this WKeySortCol1 */
  protected void serializeWKeySortCol1(char[] wKeySortCol1) {
    shareString.getSerializedField().incrementCounter();
    arraycopy(wKeySortCol1, 0, getStringValue(), beginWKeySortCol1, W_KEY_SORT_COL_1_LEN);
    localWKeySortCol1Counter = shareString.getSerializedField().getModifiedCounter();
  }

  protected char[] checkWKeySortCol1Constraints(char[] value) {
    return super.checkConstraints(value, 2, false, false);
  }
  /**
   * refreshWKeySortCol1 is used to refresh the latest value of a variable from the Serialized
   * String the most common reason to serialize an Object as a string in to write to a file. There
   * can be several other reasons for serialization as well
   */
  public char[] refreshWKeySortCol1() {
    return (substring(
        getStringValue(), beginWKeySortCol1, beginWKeySortCol1 + W_KEY_SORT_COL_1_LEN));
  }
}
