package com.cloudframe.app.dto.serialize.d5427pol;

/**
 * The class PolReqAreaSerialized is used to define offsets in order to serialize in a fixed String
 *
 * @author CloudFrame Inc. created on 2025-03-25 at 08:31. using version 5.0.0.231
 */
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class PolReqAreaSerialized extends Field {

  protected Logger logger = LoggerFactory.getLogger(PolReqAreaSerialized.class);
  /*  Length of the field, if serialized as a String */
  protected static final int POL_REQ_AREA_LENGTH = 51;
  /*  offset of each of Child Fields when serialized as a String */
  protected int beginPolReqClngProg;
  protected int beginPolReqCovTypCd;
  protected int beginPolReqMxiPolNbr;
  protected int beginPolReqMxiPlnNbr;
  protected int beginPolReqMxiClssNbr;
  protected int beginPolReqEffDt;
  protected int beginPolReqCancDt;
  protected int beginPolReqGetmainCreator;

  /** Constructor for PolReqAreaSerialized */
  public PolReqAreaSerialized() {
    // TO-DO auto generated code
  }

  /**
   * Constructor for PolReqAreaSerialized. sets the parent value to the parent
   *
   * @param parent
   * @param begin
   */
  public PolReqAreaSerialized(Field parent, int begin) {
    setParent(parent, begin);
  }

  /**
   * sets parent for this PolReqAreaSerialized to the parent
   *
   * @param parent
   */
  @Override
  public void setParent(Field parent) {
    setParent(parent, 0); // serialize this field at offset 0 by default
  }

  /**
   * sets parent for this PolReqAreaSerialized to the parent and set the serialize offset to
   * parameter begin
   *
   * @param parent
   * @param begin - offset used when serializing this object to a String
   */
  public void setParent(Field parent, int begin) {
    super.setParent(parent);
    init(begin); // serialize this field at offset 0 by default
  }
  /** initializes the field in PolReqAreaSerialized */
  @Override
  protected void init(int begin) {
    setStartOffset(begin);
    setLength(POL_REQ_AREA_LENGTH);
    /*  set the offset/position of each field when this object is serialized as String */
    beginPolReqClngProg = getStartOffset() + 0; // set offset for serialization

    beginPolReqCovTypCd = getStartOffset() + 8; // set offset for serialization

    beginPolReqMxiPolNbr = getStartOffset() + 9; // set offset for serialization

    beginPolReqMxiPlnNbr = getStartOffset() + 15; // set offset for serialization

    beginPolReqMxiClssNbr = getStartOffset() + 19; // set offset for serialization

    beginPolReqEffDt = getStartOffset() + 23; // set offset for serialization

    beginPolReqCancDt = getStartOffset() + 33; // set offset for serialization

    beginPolReqGetmainCreator = getStartOffset() + 43; // set offset for serialization

    /*  end of offset */
  }

  int localPolReqClngProgCounter = -1;

  public boolean isPolReqClngProgModified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localPolReqClngProgCounter != sharedCounter;
    localPolReqClngProgCounter = sharedCounter;
    return hasModified;
  }

  protected static final int POL_REQ_CLNG_PROG_LEN = 8;
  /** serialize this PolReqClngProg */
  protected void serializePolReqClngProg(char[] polReqClngProg) {
    shareString.getSerializedField().incrementCounter();
    arraycopy(polReqClngProg, 0, getStringValue(), beginPolReqClngProg, POL_REQ_CLNG_PROG_LEN);
    localPolReqClngProgCounter = shareString.getSerializedField().getModifiedCounter();
  }

  protected char[] checkPolReqClngProgConstraints(char[] value) {
    return super.checkConstraints(value, 8, false, false);
  }
  /**
   * refreshPolReqClngProg is used to refresh the latest value of a variable from the Serialized
   * String the most common reason to serialize an Object as a string in to write to a file. There
   * can be several other reasons for serialization as well
   */
  public char[] refreshPolReqClngProg() {
    return (substring(
        getStringValue(), beginPolReqClngProg, beginPolReqClngProg + POL_REQ_CLNG_PROG_LEN));
  }

  int localPolReqCovTypCdCounter = -1;

  public boolean isPolReqCovTypCdModified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localPolReqCovTypCdCounter != sharedCounter;
    localPolReqCovTypCdCounter = sharedCounter;
    return hasModified;
  }

  protected static final int POL_REQ_COV_TYP_CD_LEN = 1;
  /** serialize this PolReqCovTypCd */
  protected void serializePolReqCovTypCd(char[] polReqCovTypCd) {
    shareString.getSerializedField().incrementCounter();
    arraycopy(polReqCovTypCd, 0, getStringValue(), beginPolReqCovTypCd, POL_REQ_COV_TYP_CD_LEN);
    localPolReqCovTypCdCounter = shareString.getSerializedField().getModifiedCounter();
  }

  protected char[] checkPolReqCovTypCdConstraints(char[] value) {
    return super.checkConstraints(value, 1, false, false);
  }
  /**
   * refreshPolReqCovTypCd is used to refresh the latest value of a variable from the Serialized
   * String the most common reason to serialize an Object as a string in to write to a file. There
   * can be several other reasons for serialization as well
   */
  public char[] refreshPolReqCovTypCd() {
    return (substring(
        getStringValue(), beginPolReqCovTypCd, beginPolReqCovTypCd + POL_REQ_COV_TYP_CD_LEN));
  }

  int localPolReqMxiPolNbrCounter = -1;

  public boolean isPolReqMxiPolNbrModified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localPolReqMxiPolNbrCounter != sharedCounter;
    localPolReqMxiPolNbrCounter = sharedCounter;
    return hasModified;
  }

  protected static final int POL_REQ_MXI_POL_NBR_LEN = 6;
  /** serialize this PolReqMxiPolNbr */
  protected void serializePolReqMxiPolNbr(char[] polReqMxiPolNbr) {
    shareString.getSerializedField().incrementCounter();
    arraycopy(polReqMxiPolNbr, 0, getStringValue(), beginPolReqMxiPolNbr, POL_REQ_MXI_POL_NBR_LEN);
    localPolReqMxiPolNbrCounter = shareString.getSerializedField().getModifiedCounter();
  }

  protected char[] checkPolReqMxiPolNbrConstraints(char[] value) {
    return super.checkConstraints(value, 6, false, false);
  }
  /**
   * refreshPolReqMxiPolNbr is used to refresh the latest value of a variable from the Serialized
   * String the most common reason to serialize an Object as a string in to write to a file. There
   * can be several other reasons for serialization as well
   */
  public char[] refreshPolReqMxiPolNbr() {
    return (substring(
        getStringValue(), beginPolReqMxiPolNbr, beginPolReqMxiPolNbr + POL_REQ_MXI_POL_NBR_LEN));
  }

  int localPolReqMxiPlnNbrCounter = -1;

  public boolean isPolReqMxiPlnNbrModified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localPolReqMxiPlnNbrCounter != sharedCounter;
    localPolReqMxiPlnNbrCounter = sharedCounter;
    return hasModified;
  }

  /**
   * Returns String value of polReqMxiPlnNbr
   *
   * @return polReqMxiPlnNbr
   */
  public char[] getPolReqMxiPlnNbrString() {
    return getCharArray(beginPolReqMxiPlnNbr, POL_REQ_MXI_PLN_NBR_LEN);
  }

  /**
   * This method allows testing if there is a numeric value stored in the serialized String
   *
   * @return true if numeric value is stored in the string
   */
  public boolean polReqMxiPlnNbrIsNumeric() {
    return isNumeric(
        beginPolReqMxiPlnNbr,
        beginPolReqMxiPlnNbr + POL_REQ_MXI_PLN_NBR_LEN,
        false /*Signed*/,
        true /*isSign trailing*/,
        false /*isSignStoredSeparately*/);
  }

  protected static final int POL_REQ_MXI_PLN_NBR_LEN = 4;
  /** serializePolReqMxiPlnNbr */
  protected void serializePolReqMxiPlnNbr(int polReqMxiPlnNbr) {
    putNumber(
        beginPolReqMxiPlnNbr,
        polReqMxiPlnNbr,
        POL_REQ_MXI_PLN_NBR_LEN,
        false /*isSigned?*/,
        true /*signTrailing?*/,
        false /*storeSignSeparate?*/);
    localPolReqMxiPlnNbrCounter = shareString.getSerializedField().getModifiedCounter();
  }
  /** serializePolReqMxiPlnNbr */
  protected int serializePolReqMxiPlnNbr(char[] value) {
    int polReqMxiPlnNbr;
    if (value.length > 0 && value.length != 4) value = new String(value).trim().toCharArray();
    if (value.length < 4) value = pad(4, value, ' ', LEFT_PAD);
    else if (value.length > 4) value = substring(value, 0, 4);
    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
    polReqMxiPlnNbr =
        (int)
            convertString2Number(
                value, false /*isSigned?*/, true /*signTrailing?*/, false /*storeSignSeparate?*/);
    replaceValue(padNumber(4, value, false /*isSigned?*/), beginPolReqMxiPlnNbr, 4);
    localPolReqMxiPlnNbrCounter = shareString.getSerializedField().getModifiedCounter();
    return polReqMxiPlnNbr;
  }

  protected int checkPolReqMxiPlnNbrMaxLimit(long number) {

    return (int) checkMaxLimit(number, MAX_10K /*limit*/, false /*isSigned*/);
  }
  /**
   * refreshPolReqMxiPlnNbr is used to refresh the latest value of a variable from the Serialized
   * String the most common reason to serialize an Object as a string in to write to a file. There
   * can be several other reasons for serialization as well
   */
  public int refreshPolReqMxiPlnNbr() throws CFException {
    try {
      return (getIntNumber(
          beginPolReqMxiPlnNbr,
          POL_REQ_MXI_PLN_NBR_LEN,
          false /*isSigned*/,
          true /*isSignTrailing*/,
          false /*isSignStoredSeparate*/));
    } catch (Exception ex) {
      throw getSoc7ABend("polReqMxiPlnNbr", beginPolReqMxiPlnNbr, POL_REQ_MXI_PLN_NBR_LEN);
    }
  }

  int localPolReqMxiClssNbrCounter = -1;

  public boolean isPolReqMxiClssNbrModified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localPolReqMxiClssNbrCounter != sharedCounter;
    localPolReqMxiClssNbrCounter = sharedCounter;
    return hasModified;
  }

  /**
   * Returns String value of polReqMxiClssNbr
   *
   * @return polReqMxiClssNbr
   */
  public char[] getPolReqMxiClssNbrString() {
    return getCharArray(beginPolReqMxiClssNbr, POL_REQ_MXI_CLSS_NBR_LEN);
  }

  /**
   * This method allows testing if there is a numeric value stored in the serialized String
   *
   * @return true if numeric value is stored in the string
   */
  public boolean polReqMxiClssNbrIsNumeric() {
    return isNumeric(
        beginPolReqMxiClssNbr,
        beginPolReqMxiClssNbr + POL_REQ_MXI_CLSS_NBR_LEN,
        false /*Signed*/,
        true /*isSign trailing*/,
        false /*isSignStoredSeparately*/);
  }

  protected static final int POL_REQ_MXI_CLSS_NBR_LEN = 4;
  /** serializePolReqMxiClssNbr */
  protected void serializePolReqMxiClssNbr(int polReqMxiClssNbr) {
    putNumber(
        beginPolReqMxiClssNbr,
        polReqMxiClssNbr,
        POL_REQ_MXI_CLSS_NBR_LEN,
        false /*isSigned?*/,
        true /*signTrailing?*/,
        false /*storeSignSeparate?*/);
    localPolReqMxiClssNbrCounter = shareString.getSerializedField().getModifiedCounter();
  }
  /** serializePolReqMxiClssNbr */
  protected int serializePolReqMxiClssNbr(char[] value) {
    int polReqMxiClssNbr;
    if (value.length > 0 && value.length != 4) value = new String(value).trim().toCharArray();
    if (value.length < 4) value = pad(4, value, ' ', LEFT_PAD);
    else if (value.length > 4) value = substring(value, 0, 4);
    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
    polReqMxiClssNbr =
        (int)
            convertString2Number(
                value, false /*isSigned?*/, true /*signTrailing?*/, false /*storeSignSeparate?*/);
    replaceValue(padNumber(4, value, false /*isSigned?*/), beginPolReqMxiClssNbr, 4);
    localPolReqMxiClssNbrCounter = shareString.getSerializedField().getModifiedCounter();
    return polReqMxiClssNbr;
  }

  protected int checkPolReqMxiClssNbrMaxLimit(long number) {

    return (int) checkMaxLimit(number, MAX_10K /*limit*/, false /*isSigned*/);
  }
  /**
   * refreshPolReqMxiClssNbr is used to refresh the latest value of a variable from the Serialized
   * String the most common reason to serialize an Object as a string in to write to a file. There
   * can be several other reasons for serialization as well
   */
  public int refreshPolReqMxiClssNbr() throws CFException {
    try {
      return (getIntNumber(
          beginPolReqMxiClssNbr,
          POL_REQ_MXI_CLSS_NBR_LEN,
          false /*isSigned*/,
          true /*isSignTrailing*/,
          false /*isSignStoredSeparate*/));
    } catch (Exception ex) {
      throw getSoc7ABend("polReqMxiClssNbr", beginPolReqMxiClssNbr, POL_REQ_MXI_CLSS_NBR_LEN);
    }
  }

  int localPolReqEffDtCounter = -1;

  public boolean isPolReqEffDtModified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localPolReqEffDtCounter != sharedCounter;
    localPolReqEffDtCounter = sharedCounter;
    return hasModified;
  }

  protected static final int POL_REQ_EFF_DT_LEN = 10;
  /** serialize this PolReqEffDt */
  protected void serializePolReqEffDt(char[] polReqEffDt) {
    shareString.getSerializedField().incrementCounter();
    arraycopy(polReqEffDt, 0, getStringValue(), beginPolReqEffDt, POL_REQ_EFF_DT_LEN);
    localPolReqEffDtCounter = shareString.getSerializedField().getModifiedCounter();
  }

  protected char[] checkPolReqEffDtConstraints(char[] value) {
    return super.checkConstraints(value, 10, false, false);
  }
  /**
   * refreshPolReqEffDt is used to refresh the latest value of a variable from the Serialized String
   * the most common reason to serialize an Object as a string in to write to a file. There can be
   * several other reasons for serialization as well
   */
  public char[] refreshPolReqEffDt() {
    return (substring(getStringValue(), beginPolReqEffDt, beginPolReqEffDt + POL_REQ_EFF_DT_LEN));
  }

  int localPolReqCancDtCounter = -1;

  public boolean isPolReqCancDtModified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localPolReqCancDtCounter != sharedCounter;
    localPolReqCancDtCounter = sharedCounter;
    return hasModified;
  }

  protected static final int POL_REQ_CANC_DT_LEN = 10;
  /** serialize this PolReqCancDt */
  protected void serializePolReqCancDt(char[] polReqCancDt) {
    shareString.getSerializedField().incrementCounter();
    arraycopy(polReqCancDt, 0, getStringValue(), beginPolReqCancDt, POL_REQ_CANC_DT_LEN);
    localPolReqCancDtCounter = shareString.getSerializedField().getModifiedCounter();
  }

  protected char[] checkPolReqCancDtConstraints(char[] value) {
    return super.checkConstraints(value, 10, false, false);
  }
  /**
   * refreshPolReqCancDt is used to refresh the latest value of a variable from the Serialized
   * String the most common reason to serialize an Object as a string in to write to a file. There
   * can be several other reasons for serialization as well
   */
  public char[] refreshPolReqCancDt() {
    return (substring(
        getStringValue(), beginPolReqCancDt, beginPolReqCancDt + POL_REQ_CANC_DT_LEN));
  }

  int localPolReqGetmainCreatorCounter = -1;

  public boolean isPolReqGetmainCreatorModified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localPolReqGetmainCreatorCounter != sharedCounter;
    localPolReqGetmainCreatorCounter = sharedCounter;
    return hasModified;
  }

  protected static final int POL_REQ_GETMAIN_CREATOR_LEN = 8;
  /** serialize this PolReqGetmainCreator */
  protected void serializePolReqGetmainCreator(char[] polReqGetmainCreator) {
    shareString.getSerializedField().incrementCounter();
    arraycopy(
        polReqGetmainCreator,
        0,
        getStringValue(),
        beginPolReqGetmainCreator,
        POL_REQ_GETMAIN_CREATOR_LEN);
    localPolReqGetmainCreatorCounter = shareString.getSerializedField().getModifiedCounter();
  }

  protected char[] checkPolReqGetmainCreatorConstraints(char[] value) {
    return super.checkConstraints(value, 8, false, false);
  }
  /**
   * refreshPolReqGetmainCreator is used to refresh the latest value of a variable from the
   * Serialized String the most common reason to serialize an Object as a string in to write to a
   * file. There can be several other reasons for serialization as well
   */
  public char[] refreshPolReqGetmainCreator() {
    return (substring(
        getStringValue(),
        beginPolReqGetmainCreator,
        beginPolReqGetmainCreator + POL_REQ_GETMAIN_CREATOR_LEN));
  }
}
