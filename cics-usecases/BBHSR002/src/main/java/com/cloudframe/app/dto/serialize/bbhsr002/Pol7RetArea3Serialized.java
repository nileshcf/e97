package com.cloudframe.app.dto.serialize.bbhsr002;

/**
 * The class Pol7RetArea3Serialized is used to define offsets in order to serialize in a fixed
 * String
 *
 * @author CloudFrame Inc. created on 2025-03-25 at 08:29. using version 5.0.0.231
 */
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Pol7RetArea3Serialized extends Field {

  protected Logger logger = LoggerFactory.getLogger(Pol7RetArea3Serialized.class);
  /*  Length of the field, if serialized as a String */
  protected static final int POL_7_RET_AREA_3_LENGTH = 12;
  /*  offset of each of Child Fields when serialized as a String */
  protected int beginPol7StdPolNbr;
  protected int beginPol7StdPlnNbr;
  protected int beginPol7RetNewOldSrvcInd;
  protected int beginPol7RetPolPresentInd;

  /** Constructor for Pol7RetArea3Serialized */
  public Pol7RetArea3Serialized() {
    // TO-DO auto generated code
  }

  /**
   * Constructor for Pol7RetArea3Serialized. sets the parent value to the parent
   *
   * @param parent
   * @param begin
   */
  public Pol7RetArea3Serialized(Field parent, int begin) {
    setParent(parent, begin);
  }

  /**
   * sets parent for this Pol7RetArea3Serialized to the parent
   *
   * @param parent
   */
  @Override
  public void setParent(Field parent) {
    setParent(parent, 0); // serialize this field at offset 0 by default
  }

  /**
   * sets parent for this Pol7RetArea3Serialized to the parent and set the serialize offset to
   * parameter begin
   *
   * @param parent
   * @param begin - offset used when serializing this object to a String
   */
  public void setParent(Field parent, int begin) {
    super.setParent(parent);
    init(begin); // serialize this field at offset 0 by default
  }
  /** initializes the field in Pol7RetArea3Serialized */
  @Override
  protected void init(int begin) {
    setStartOffset(begin);
    setLength(POL_7_RET_AREA_3_LENGTH);
    /*  set the offset/position of each field when this object is serialized as String */
    beginPol7StdPolNbr = getStartOffset() + 0; // set offset for serialization

    beginPol7StdPlnNbr = getStartOffset() + 6; // set offset for serialization

    beginPol7RetNewOldSrvcInd = getStartOffset() + 10; // set offset for serialization

    beginPol7RetPolPresentInd = getStartOffset() + 11; // set offset for serialization

    /*  end of offset */
  }

  int localPol7StdPolNbrCounter = -1;

  public boolean isPol7StdPolNbrModified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localPol7StdPolNbrCounter != sharedCounter;
    localPol7StdPolNbrCounter = sharedCounter;
    return hasModified;
  }

  protected static final int POL_7_STD_POL_NBR_LEN = 6;
  /** serialize this Pol7StdPolNbr */
  protected void serializePol7StdPolNbr(char[] pol7StdPolNbr) {
    shareString.getSerializedField().incrementCounter();
    arraycopy(pol7StdPolNbr, 0, getStringValue(), beginPol7StdPolNbr, POL_7_STD_POL_NBR_LEN);
    localPol7StdPolNbrCounter = shareString.getSerializedField().getModifiedCounter();
  }

  protected char[] checkPol7StdPolNbrConstraints(char[] value) {
    return super.checkConstraints(value, 6, false, false);
  }
  /**
   * refreshPol7StdPolNbr is used to refresh the latest value of a variable from the Serialized
   * String the most common reason to serialize an Object as a string in to write to a file. There
   * can be several other reasons for serialization as well
   */
  public char[] refreshPol7StdPolNbr() {
    return (substring(
        getStringValue(), beginPol7StdPolNbr, beginPol7StdPolNbr + POL_7_STD_POL_NBR_LEN));
  }

  int localPol7StdPlnNbrCounter = -1;

  public boolean isPol7StdPlnNbrModified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localPol7StdPlnNbrCounter != sharedCounter;
    localPol7StdPlnNbrCounter = sharedCounter;
    return hasModified;
  }

  /**
   * Returns String value of pol7StdPlnNbr
   *
   * @return pol7StdPlnNbr
   */
  public char[] getPol7StdPlnNbrString() {
    return getCharArray(beginPol7StdPlnNbr, POL_7_STD_PLN_NBR_LEN);
  }

  /**
   * This method allows testing if there is a numeric value stored in the serialized String
   *
   * @return true if numeric value is stored in the string
   */
  public boolean pol7StdPlnNbrIsNumeric() {
    return isNumeric(
        beginPol7StdPlnNbr,
        beginPol7StdPlnNbr + POL_7_STD_PLN_NBR_LEN,
        false /*Signed*/,
        true /*isSign trailing*/,
        false /*isSignStoredSeparately*/);
  }

  protected static final int POL_7_STD_PLN_NBR_LEN = 4;
  /** serializePol7StdPlnNbr */
  protected void serializePol7StdPlnNbr(int pol7StdPlnNbr) {
    putNumber(
        beginPol7StdPlnNbr,
        pol7StdPlnNbr,
        POL_7_STD_PLN_NBR_LEN,
        false /*isSigned?*/,
        true /*signTrailing?*/,
        false /*storeSignSeparate?*/);
    localPol7StdPlnNbrCounter = shareString.getSerializedField().getModifiedCounter();
  }
  /** serializePol7StdPlnNbr */
  protected int serializePol7StdPlnNbr(char[] value) {
    int pol7StdPlnNbr;
    if (value.length > 0 && value.length != 4) value = new String(value).trim().toCharArray();
    if (value.length < 4) value = pad(4, value, ' ', LEFT_PAD);
    else if (value.length > 4) value = substring(value, 0, 4);
    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
    pol7StdPlnNbr =
        (int)
            convertString2Number(
                value, false /*isSigned?*/, true /*signTrailing?*/, false /*storeSignSeparate?*/);
    replaceValue(padNumber(4, value, false /*isSigned?*/), beginPol7StdPlnNbr, 4);
    localPol7StdPlnNbrCounter = shareString.getSerializedField().getModifiedCounter();
    return pol7StdPlnNbr;
  }

  protected int checkPol7StdPlnNbrMaxLimit(long number) {

    return (int) checkMaxLimit(number, MAX_10K /*limit*/, false /*isSigned*/);
  }
  /**
   * refreshPol7StdPlnNbr is used to refresh the latest value of a variable from the Serialized
   * String the most common reason to serialize an Object as a string in to write to a file. There
   * can be several other reasons for serialization as well
   */
  public int refreshPol7StdPlnNbr() throws CFException {
    try {
      return (getIntNumber(
          beginPol7StdPlnNbr,
          POL_7_STD_PLN_NBR_LEN,
          false /*isSigned*/,
          true /*isSignTrailing*/,
          false /*isSignStoredSeparate*/));
    } catch (Exception ex) {
      throw getSoc7ABend("pol7StdPlnNbr", beginPol7StdPlnNbr, POL_7_STD_PLN_NBR_LEN);
    }
  }

  int localPol7RetNewOldSrvcIndCounter = -1;

  public boolean isPol7RetNewOldSrvcIndModified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localPol7RetNewOldSrvcIndCounter != sharedCounter;
    localPol7RetNewOldSrvcIndCounter = sharedCounter;
    return hasModified;
  }

  protected static final int POL_7_RET_NEW_OLD_SRVC_IND_LEN = 1;
  /** serialize this Pol7RetNewOldSrvcInd */
  protected void serializePol7RetNewOldSrvcInd(char[] pol7RetNewOldSrvcInd) {
    shareString.getSerializedField().incrementCounter();
    arraycopy(
        pol7RetNewOldSrvcInd,
        0,
        getStringValue(),
        beginPol7RetNewOldSrvcInd,
        POL_7_RET_NEW_OLD_SRVC_IND_LEN);
    localPol7RetNewOldSrvcIndCounter = shareString.getSerializedField().getModifiedCounter();
  }

  protected char[] checkPol7RetNewOldSrvcIndConstraints(char[] value) {
    return super.checkConstraints(value, 1, false, false);
  }
  /**
   * refreshPol7RetNewOldSrvcInd is used to refresh the latest value of a variable from the
   * Serialized String the most common reason to serialize an Object as a string in to write to a
   * file. There can be several other reasons for serialization as well
   */
  public char[] refreshPol7RetNewOldSrvcInd() {
    return (substring(
        getStringValue(),
        beginPol7RetNewOldSrvcInd,
        beginPol7RetNewOldSrvcInd + POL_7_RET_NEW_OLD_SRVC_IND_LEN));
  }

  int localPol7RetPolPresentIndCounter = -1;

  public boolean isPol7RetPolPresentIndModified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localPol7RetPolPresentIndCounter != sharedCounter;
    localPol7RetPolPresentIndCounter = sharedCounter;
    return hasModified;
  }

  protected static final int POL_7_RET_POL_PRESENT_IND_LEN = 1;
  /** serialize this Pol7RetPolPresentInd */
  protected void serializePol7RetPolPresentInd(char[] pol7RetPolPresentInd) {
    shareString.getSerializedField().incrementCounter();
    arraycopy(
        pol7RetPolPresentInd,
        0,
        getStringValue(),
        beginPol7RetPolPresentInd,
        POL_7_RET_POL_PRESENT_IND_LEN);
    localPol7RetPolPresentIndCounter = shareString.getSerializedField().getModifiedCounter();
  }

  protected char[] checkPol7RetPolPresentIndConstraints(char[] value) {
    return super.checkConstraints(value, 1, false, false);
  }
  /**
   * refreshPol7RetPolPresentInd is used to refresh the latest value of a variable from the
   * Serialized String the most common reason to serialize an Object as a string in to write to a
   * file. There can be several other reasons for serialization as well
   */
  public char[] refreshPol7RetPolPresentInd() {
    return (substring(
        getStringValue(),
        beginPol7RetPolPresentInd,
        beginPol7RetPolPresentInd + POL_7_RET_POL_PRESENT_IND_LEN));
  }
}
