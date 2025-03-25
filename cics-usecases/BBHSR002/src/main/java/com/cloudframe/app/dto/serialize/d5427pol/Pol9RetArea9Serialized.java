package com.cloudframe.app.dto.serialize.d5427pol;

/**
 * The class Pol9RetArea9Serialized is used to define offsets in order to serialize in a fixed
 * String
 *
 * @author CloudFrame Inc. created on 2025-03-25 at 08:31. using version 5.0.0.231
 */
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Pol9RetArea9Serialized extends Field {

  protected Logger logger = LoggerFactory.getLogger(Pol9RetArea9Serialized.class);
  /*  Length of the field, if serialized as a String */
  protected static final int POL_9_RET_AREA_9_LENGTH = 903;
  /*  offset of each of Child Fields when serialized as a String */
  protected int beginPol9CombHabRehabCnt;
  protected int beginPol9RetData;
  protected static final int POL_9_RET_DATA_SIZE = 50;

  /** Constructor for Pol9RetArea9Serialized */
  public Pol9RetArea9Serialized() {
    // TO-DO auto generated code
  }

  /**
   * Constructor for Pol9RetArea9Serialized. sets the parent value to the parent
   *
   * @param parent
   * @param begin
   */
  public Pol9RetArea9Serialized(Field parent, int begin) {
    setParent(parent, begin);
  }

  /**
   * sets parent for this Pol9RetArea9Serialized to the parent
   *
   * @param parent
   */
  @Override
  public void setParent(Field parent) {
    setParent(parent, 0); // serialize this field at offset 0 by default
  }

  /**
   * sets parent for this Pol9RetArea9Serialized to the parent and set the serialize offset to
   * parameter begin
   *
   * @param parent
   * @param begin - offset used when serializing this object to a String
   */
  public void setParent(Field parent, int begin) {
    super.setParent(parent);
    init(begin); // serialize this field at offset 0 by default
  }
  /** initializes the field in Pol9RetArea9Serialized */
  @Override
  protected void init(int begin) {
    setStartOffset(begin);
    setLength(POL_9_RET_AREA_9_LENGTH);
    /*  set the offset/position of each field when this object is serialized as String */
    beginPol9CombHabRehabCnt = getStartOffset() + 0; // set offset for serialization

    beginPol9RetData = getStartOffset() + 3; // set offset for serialization

    /*  end of offset */
  }

  int localPol9CombHabRehabCntCounter = -1;

  public boolean isPol9CombHabRehabCntModified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localPol9CombHabRehabCntCounter != sharedCounter;
    localPol9CombHabRehabCntCounter = sharedCounter;
    return hasModified;
  }

  /**
   * Returns String value of pol9CombHabRehabCnt
   *
   * @return pol9CombHabRehabCnt
   */
  public char[] getPol9CombHabRehabCntString() {
    return getCharArray(beginPol9CombHabRehabCnt, POL_9_COMB_HAB_REHAB_CNT_LEN);
  }

  /**
   * This method allows testing if there is a numeric value stored in the serialized String
   *
   * @return true if numeric value is stored in the string
   */
  public boolean pol9CombHabRehabCntIsNumeric() {
    return isNumeric(
        beginPol9CombHabRehabCnt,
        beginPol9CombHabRehabCnt + POL_9_COMB_HAB_REHAB_CNT_LEN,
        false /*Signed*/,
        true /*isSign trailing*/,
        false /*isSignStoredSeparately*/);
  }

  protected static final int POL_9_COMB_HAB_REHAB_CNT_LEN = 3;
  /** serializePol9CombHabRehabCnt */
  protected void serializePol9CombHabRehabCnt(int pol9CombHabRehabCnt) {
    putNumber(
        beginPol9CombHabRehabCnt,
        pol9CombHabRehabCnt,
        POL_9_COMB_HAB_REHAB_CNT_LEN,
        false /*isSigned?*/,
        true /*signTrailing?*/,
        false /*storeSignSeparate?*/);
    localPol9CombHabRehabCntCounter = shareString.getSerializedField().getModifiedCounter();
  }
  /** serializePol9CombHabRehabCnt */
  protected int serializePol9CombHabRehabCnt(char[] value) {
    int pol9CombHabRehabCnt;
    if (value.length > 0 && value.length != 3) value = new String(value).trim().toCharArray();
    if (value.length < 3) value = pad(3, value, ' ', LEFT_PAD);
    else if (value.length > 3) value = substring(value, 0, 3);
    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
    pol9CombHabRehabCnt =
        (int)
            convertString2Number(
                value, false /*isSigned?*/, true /*signTrailing?*/, false /*storeSignSeparate?*/);
    replaceValue(padNumber(3, value, false /*isSigned?*/), beginPol9CombHabRehabCnt, 3);
    localPol9CombHabRehabCntCounter = shareString.getSerializedField().getModifiedCounter();
    return pol9CombHabRehabCnt;
  }

  protected int checkPol9CombHabRehabCntMaxLimit(long number) {

    return (int) checkMaxLimit(number, MAX_1000 /*limit*/, false /*isSigned*/);
  }
  /**
   * refreshPol9CombHabRehabCnt is used to refresh the latest value of a variable from the
   * Serialized String the most common reason to serialize an Object as a string in to write to a
   * file. There can be several other reasons for serialization as well
   */
  public int refreshPol9CombHabRehabCnt() throws CFException {
    try {
      return (getIntNumber(
          beginPol9CombHabRehabCnt,
          POL_9_COMB_HAB_REHAB_CNT_LEN,
          false /*isSigned*/,
          true /*isSignTrailing*/,
          false /*isSignStoredSeparate*/));
    } catch (Exception ex) {
      throw getSoc7ABend(
          "pol9CombHabRehabCnt", beginPol9CombHabRehabCnt, POL_9_COMB_HAB_REHAB_CNT_LEN);
    }
  }

  public int pol9RetDataSize() {
    return POL_9_RET_DATA_SIZE;
  }
}
