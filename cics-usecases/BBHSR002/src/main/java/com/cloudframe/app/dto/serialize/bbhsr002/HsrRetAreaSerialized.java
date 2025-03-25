package com.cloudframe.app.dto.serialize.bbhsr002;

/**
 * The class HsrRetAreaSerialized is used to define offsets in order to serialize in a fixed String
 *
 * @author CloudFrame Inc. created on 2025-03-25 at 08:29. using version 5.0.0.231
 */
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class HsrRetAreaSerialized extends Field {

  protected Logger logger = LoggerFactory.getLogger(HsrRetAreaSerialized.class);
  /*  Length of the field, if serialized as a String */
  protected static final int HSR_RET_AREA_LENGTH = 1212604;
  /*  offset of each of Child Fields when serialized as a String */
  protected int beginHsrRetHipaaCnt;

  /** Constructor for HsrRetAreaSerialized */
  public HsrRetAreaSerialized() {
    // TO-DO auto generated code
  }

  /**
   * Constructor for HsrRetAreaSerialized. sets the parent value to the parent
   *
   * @param parent
   * @param begin
   */
  public HsrRetAreaSerialized(Field parent, int begin) {
    setParent(parent, begin);
  }

  /**
   * sets parent for this HsrRetAreaSerialized to the parent
   *
   * @param parent
   */
  @Override
  public void setParent(Field parent) {
    setParent(parent, 16); // serialize this field at offset 16 by default
  }

  /**
   * sets parent for this HsrRetAreaSerialized to the parent and set the serialize offset to
   * parameter begin
   *
   * @param parent
   * @param begin - offset used when serializing this object to a String
   */
  public void setParent(Field parent, int begin) {
    super.setParent(parent);
    init(begin); // serialize this field at offset 16 by default
  }
  /** initializes the field in HsrRetAreaSerialized */
  @Override
  protected void init(int begin) {
    setStartOffset(begin);
    setLength(HSR_RET_AREA_LENGTH);
    /*  set the offset/position of each field when this object is serialized as String */
    beginHsrRetHipaaCnt = getStartOffset() + 0; // set offset for serialization

    /*  end of offset */
  }

  int localHsrRetHipaaCntCounter = -1;

  public boolean isHsrRetHipaaCntModified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localHsrRetHipaaCntCounter != sharedCounter;
    localHsrRetHipaaCntCounter = sharedCounter;
    return hasModified;
  }

  /**
   * Returns String value of hsrRetHipaaCnt
   *
   * @return hsrRetHipaaCnt
   */
  public char[] getHsrRetHipaaCntString() {
    return getCharArray(beginHsrRetHipaaCnt, HSR_RET_HIPAA_CNT_LEN);
  }

  /**
   * This method allows testing if there is a numeric value stored in the serialized String
   *
   * @return true if numeric value is stored in the string
   */
  public boolean hsrRetHipaaCntIsNumeric() {
    return isNumeric(
        beginHsrRetHipaaCnt,
        beginHsrRetHipaaCnt + HSR_RET_HIPAA_CNT_LEN,
        false /*Signed*/,
        true /*isSign trailing*/,
        false /*isSignStoredSeparately*/);
  }

  protected static final int HSR_RET_HIPAA_CNT_LEN = 3;
  /** serializeHsrRetHipaaCnt */
  protected void serializeHsrRetHipaaCnt(int hsrRetHipaaCnt) {
    putNumber(
        beginHsrRetHipaaCnt,
        hsrRetHipaaCnt,
        HSR_RET_HIPAA_CNT_LEN,
        false /*isSigned?*/,
        true /*signTrailing?*/,
        false /*storeSignSeparate?*/);
    localHsrRetHipaaCntCounter = shareString.getSerializedField().getModifiedCounter();
  }
  /** serializeHsrRetHipaaCnt */
  protected int serializeHsrRetHipaaCnt(char[] value) {
    int hsrRetHipaaCnt;
    if (value.length > 0 && value.length != 3) value = new String(value).trim().toCharArray();
    if (value.length < 3) value = pad(3, value, ' ', LEFT_PAD);
    else if (value.length > 3) value = substring(value, 0, 3);
    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
    hsrRetHipaaCnt =
        (int)
            convertString2Number(
                value, false /*isSigned?*/, true /*signTrailing?*/, false /*storeSignSeparate?*/);
    replaceValue(padNumber(3, value, false /*isSigned?*/), beginHsrRetHipaaCnt, 3);
    localHsrRetHipaaCntCounter = shareString.getSerializedField().getModifiedCounter();
    return hsrRetHipaaCnt;
  }

  protected int checkHsrRetHipaaCntMaxLimit(long number) {

    return (int) checkMaxLimit(number, MAX_1000 /*limit*/, false /*isSigned*/);
  }
  /**
   * refreshHsrRetHipaaCnt is used to refresh the latest value of a variable from the Serialized
   * String the most common reason to serialize an Object as a string in to write to a file. There
   * can be several other reasons for serialization as well
   */
  public int refreshHsrRetHipaaCnt() throws CFException {
    try {
      return (getIntNumber(
          beginHsrRetHipaaCnt,
          HSR_RET_HIPAA_CNT_LEN,
          false /*isSigned*/,
          true /*isSignTrailing*/,
          false /*isSignStoredSeparate*/));
    } catch (Exception ex) {
      throw getSoc7ABend("hsrRetHipaaCnt", beginHsrRetHipaaCnt, HSR_RET_HIPAA_CNT_LEN);
    }
  }
}
