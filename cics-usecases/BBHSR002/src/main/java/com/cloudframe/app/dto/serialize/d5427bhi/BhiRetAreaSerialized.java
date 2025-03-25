package com.cloudframe.app.dto.serialize.d5427bhi;

/**
 * The class BhiRetAreaSerialized is used to define offsets in order to serialize in a fixed String
 *
 * @author CloudFrame Inc. created on 2025-03-25 at 08:32. using version 5.0.0.231
 */
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class BhiRetAreaSerialized extends Field {

  protected Logger logger = LoggerFactory.getLogger(BhiRetAreaSerialized.class);
  /*  Length of the field, if serialized as a String */
  protected static final int BHI_RET_AREA_LENGTH = 4046;
  /*  offset of each of Child Fields when serialized as a String */
  protected int beginBhiRetBhiCnt;
  protected int beginBhiRetBhiData;
  protected static final int BHI_RET_BHI_DATA_SIZE = 12;

  /** Constructor for BhiRetAreaSerialized */
  public BhiRetAreaSerialized() {
    // TO-DO auto generated code
  }

  /**
   * Constructor for BhiRetAreaSerialized. sets the parent value to the parent
   *
   * @param parent
   * @param begin
   */
  public BhiRetAreaSerialized(Field parent, int begin) {
    setParent(parent, begin);
  }

  /**
   * sets parent for this BhiRetAreaSerialized to the parent
   *
   * @param parent
   */
  @Override
  public void setParent(Field parent) {
    setParent(parent, 28); // serialize this field at offset 28 by default
  }

  /**
   * sets parent for this BhiRetAreaSerialized to the parent and set the serialize offset to
   * parameter begin
   *
   * @param parent
   * @param begin - offset used when serializing this object to a String
   */
  public void setParent(Field parent, int begin) {
    super.setParent(parent);
    init(begin); // serialize this field at offset 28 by default
  }
  /** initializes the field in BhiRetAreaSerialized */
  @Override
  protected void init(int begin) {
    setStartOffset(begin);
    setLength(BHI_RET_AREA_LENGTH);
    /*  set the offset/position of each field when this object is serialized as String */
    beginBhiRetBhiCnt = getStartOffset() + 0; // set offset for serialization

    beginBhiRetBhiData = getStartOffset() + 2; // set offset for serialization

    /*  end of offset */
  }

  int localBhiRetBhiCntCounter = -1;

  public boolean isBhiRetBhiCntModified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localBhiRetBhiCntCounter != sharedCounter;
    localBhiRetBhiCntCounter = sharedCounter;
    return hasModified;
  }

  /**
   * Returns String value of bhiRetBhiCnt
   *
   * @return bhiRetBhiCnt
   */
  public char[] getBhiRetBhiCntString() {
    return getCharArray(beginBhiRetBhiCnt, BHI_RET_BHI_CNT_LEN);
  }

  /**
   * This method allows testing if there is a numeric value stored in the serialized String
   *
   * @return true if numeric value is stored in the string
   */
  public boolean bhiRetBhiCntIsNumeric() {
    return isNumeric(
        beginBhiRetBhiCnt,
        beginBhiRetBhiCnt + BHI_RET_BHI_CNT_LEN,
        false /*Signed*/,
        true /*isSign trailing*/,
        false /*isSignStoredSeparately*/);
  }

  protected static final int BHI_RET_BHI_CNT_LEN = 2;
  /** serializeBhiRetBhiCnt */
  protected void serializeBhiRetBhiCnt(int bhiRetBhiCnt) {
    putNumber(
        beginBhiRetBhiCnt,
        bhiRetBhiCnt,
        BHI_RET_BHI_CNT_LEN,
        false /*isSigned?*/,
        true /*signTrailing?*/,
        false /*storeSignSeparate?*/);
    localBhiRetBhiCntCounter = shareString.getSerializedField().getModifiedCounter();
  }
  /** serializeBhiRetBhiCnt */
  protected int serializeBhiRetBhiCnt(char[] value) {
    int bhiRetBhiCnt;
    if (value.length > 0 && value.length != 2) value = new String(value).trim().toCharArray();
    if (value.length < 2) value = pad(2, value, ' ', LEFT_PAD);
    else if (value.length > 2) value = substring(value, 0, 2);
    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
    bhiRetBhiCnt =
        (int)
            convertString2Number(
                value, false /*isSigned?*/, true /*signTrailing?*/, false /*storeSignSeparate?*/);
    replaceValue(padNumber(2, value, false /*isSigned?*/), beginBhiRetBhiCnt, 2);
    localBhiRetBhiCntCounter = shareString.getSerializedField().getModifiedCounter();
    return bhiRetBhiCnt;
  }

  protected int checkBhiRetBhiCntMaxLimit(long number) {

    return (int) checkMaxLimit(number, MAX_100 /*limit*/, false /*isSigned*/);
  }
  /**
   * refreshBhiRetBhiCnt is used to refresh the latest value of a variable from the Serialized
   * String the most common reason to serialize an Object as a string in to write to a file. There
   * can be several other reasons for serialization as well
   */
  public int refreshBhiRetBhiCnt() throws CFException {
    try {
      return (getIntNumber(
          beginBhiRetBhiCnt,
          BHI_RET_BHI_CNT_LEN,
          false /*isSigned*/,
          true /*isSignTrailing*/,
          false /*isSignStoredSeparate*/));
    } catch (Exception ex) {
      throw getSoc7ABend("bhiRetBhiCnt", beginBhiRetBhiCnt, BHI_RET_BHI_CNT_LEN);
    }
  }

  public int bhiRetBhiDataSize() {
    return BHI_RET_BHI_DATA_SIZE;
  }
}
