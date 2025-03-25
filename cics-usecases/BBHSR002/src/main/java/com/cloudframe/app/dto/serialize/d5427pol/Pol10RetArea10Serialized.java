package com.cloudframe.app.dto.serialize.d5427pol;

/**
 * The class Pol10RetArea10Serialized is used to define offsets in order to serialize in a fixed
 * String
 *
 * @author CloudFrame Inc. created on 2025-03-25 at 08:31. using version 5.0.0.231
 */
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Pol10RetArea10Serialized extends Field {

  protected Logger logger = LoggerFactory.getLogger(Pol10RetArea10Serialized.class);
  /*  Length of the field, if serialized as a String */
  protected static final int POL_10_RET_AREA_10_LENGTH = 17;
  /*  offset of each of Child Fields when serialized as a String */
  protected int beginPol10StdPolNbr;
  protected int beginPol10StdPlnNbr;
  protected int beginPol10RetLglEntyCd;
  protected int beginPol10RetFundTypCd;
  protected int beginPol10RetRiskClsCd;

  /** Constructor for Pol10RetArea10Serialized */
  public Pol10RetArea10Serialized() {
    // TO-DO auto generated code
  }

  /**
   * Constructor for Pol10RetArea10Serialized. sets the parent value to the parent
   *
   * @param parent
   * @param begin
   */
  public Pol10RetArea10Serialized(Field parent, int begin) {
    setParent(parent, begin);
  }

  /**
   * sets parent for this Pol10RetArea10Serialized to the parent
   *
   * @param parent
   */
  @Override
  public void setParent(Field parent) {
    setParent(parent, 0); // serialize this field at offset 0 by default
  }

  /**
   * sets parent for this Pol10RetArea10Serialized to the parent and set the serialize offset to
   * parameter begin
   *
   * @param parent
   * @param begin - offset used when serializing this object to a String
   */
  public void setParent(Field parent, int begin) {
    super.setParent(parent);
    init(begin); // serialize this field at offset 0 by default
  }
  /** initializes the field in Pol10RetArea10Serialized */
  @Override
  protected void init(int begin) {
    setStartOffset(begin);
    setLength(POL_10_RET_AREA_10_LENGTH);
    /*  set the offset/position of each field when this object is serialized as String */
    beginPol10StdPolNbr = getStartOffset() + 0; // set offset for serialization

    beginPol10StdPlnNbr = getStartOffset() + 6; // set offset for serialization

    beginPol10RetLglEntyCd = getStartOffset() + 10; // set offset for serialization

    beginPol10RetFundTypCd = getStartOffset() + 15; // set offset for serialization

    beginPol10RetRiskClsCd = getStartOffset() + 16; // set offset for serialization

    /*  end of offset */
  }

  int localPol10StdPolNbrCounter = -1;

  public boolean isPol10StdPolNbrModified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localPol10StdPolNbrCounter != sharedCounter;
    localPol10StdPolNbrCounter = sharedCounter;
    return hasModified;
  }

  protected static final int POL_10_STD_POL_NBR_LEN = 6;
  /** serialize this Pol10StdPolNbr */
  protected void serializePol10StdPolNbr(char[] pol10StdPolNbr) {
    shareString.getSerializedField().incrementCounter();
    arraycopy(pol10StdPolNbr, 0, getStringValue(), beginPol10StdPolNbr, POL_10_STD_POL_NBR_LEN);
    localPol10StdPolNbrCounter = shareString.getSerializedField().getModifiedCounter();
  }

  protected char[] checkPol10StdPolNbrConstraints(char[] value) {
    return super.checkConstraints(value, 6, false, false);
  }
  /**
   * refreshPol10StdPolNbr is used to refresh the latest value of a variable from the Serialized
   * String the most common reason to serialize an Object as a string in to write to a file. There
   * can be several other reasons for serialization as well
   */
  public char[] refreshPol10StdPolNbr() {
    return (substring(
        getStringValue(), beginPol10StdPolNbr, beginPol10StdPolNbr + POL_10_STD_POL_NBR_LEN));
  }

  int localPol10StdPlnNbrCounter = -1;

  public boolean isPol10StdPlnNbrModified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localPol10StdPlnNbrCounter != sharedCounter;
    localPol10StdPlnNbrCounter = sharedCounter;
    return hasModified;
  }

  /**
   * Returns String value of pol10StdPlnNbr
   *
   * @return pol10StdPlnNbr
   */
  public char[] getPol10StdPlnNbrString() {
    return getCharArray(beginPol10StdPlnNbr, POL_10_STD_PLN_NBR_LEN);
  }

  /**
   * This method allows testing if there is a numeric value stored in the serialized String
   *
   * @return true if numeric value is stored in the string
   */
  public boolean pol10StdPlnNbrIsNumeric() {
    return isNumeric(
        beginPol10StdPlnNbr,
        beginPol10StdPlnNbr + POL_10_STD_PLN_NBR_LEN,
        false /*Signed*/,
        true /*isSign trailing*/,
        false /*isSignStoredSeparately*/);
  }

  protected static final int POL_10_STD_PLN_NBR_LEN = 4;
  /** serializePol10StdPlnNbr */
  protected void serializePol10StdPlnNbr(int pol10StdPlnNbr) {
    putNumber(
        beginPol10StdPlnNbr,
        pol10StdPlnNbr,
        POL_10_STD_PLN_NBR_LEN,
        false /*isSigned?*/,
        true /*signTrailing?*/,
        false /*storeSignSeparate?*/);
    localPol10StdPlnNbrCounter = shareString.getSerializedField().getModifiedCounter();
  }
  /** serializePol10StdPlnNbr */
  protected int serializePol10StdPlnNbr(char[] value) {
    int pol10StdPlnNbr;
    if (value.length > 0 && value.length != 4) value = new String(value).trim().toCharArray();
    if (value.length < 4) value = pad(4, value, ' ', LEFT_PAD);
    else if (value.length > 4) value = substring(value, 0, 4);
    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
    pol10StdPlnNbr =
        (int)
            convertString2Number(
                value, false /*isSigned?*/, true /*signTrailing?*/, false /*storeSignSeparate?*/);
    replaceValue(padNumber(4, value, false /*isSigned?*/), beginPol10StdPlnNbr, 4);
    localPol10StdPlnNbrCounter = shareString.getSerializedField().getModifiedCounter();
    return pol10StdPlnNbr;
  }

  protected int checkPol10StdPlnNbrMaxLimit(long number) {

    return (int) checkMaxLimit(number, MAX_10K /*limit*/, false /*isSigned*/);
  }
  /**
   * refreshPol10StdPlnNbr is used to refresh the latest value of a variable from the Serialized
   * String the most common reason to serialize an Object as a string in to write to a file. There
   * can be several other reasons for serialization as well
   */
  public int refreshPol10StdPlnNbr() throws CFException {
    try {
      return (getIntNumber(
          beginPol10StdPlnNbr,
          POL_10_STD_PLN_NBR_LEN,
          false /*isSigned*/,
          true /*isSignTrailing*/,
          false /*isSignStoredSeparate*/));
    } catch (Exception ex) {
      throw getSoc7ABend("pol10StdPlnNbr", beginPol10StdPlnNbr, POL_10_STD_PLN_NBR_LEN);
    }
  }

  int localPol10RetLglEntyCdCounter = -1;

  public boolean isPol10RetLglEntyCdModified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localPol10RetLglEntyCdCounter != sharedCounter;
    localPol10RetLglEntyCdCounter = sharedCounter;
    return hasModified;
  }

  protected static final int POL_10_RET_LGL_ENTY_CD_LEN = 5;
  /** serialize this Pol10RetLglEntyCd */
  protected void serializePol10RetLglEntyCd(char[] pol10RetLglEntyCd) {
    shareString.getSerializedField().incrementCounter();
    arraycopy(
        pol10RetLglEntyCd, 0, getStringValue(), beginPol10RetLglEntyCd, POL_10_RET_LGL_ENTY_CD_LEN);
    localPol10RetLglEntyCdCounter = shareString.getSerializedField().getModifiedCounter();
  }

  protected char[] checkPol10RetLglEntyCdConstraints(char[] value) {
    return super.checkConstraints(value, 5, false, false);
  }
  /**
   * refreshPol10RetLglEntyCd is used to refresh the latest value of a variable from the Serialized
   * String the most common reason to serialize an Object as a string in to write to a file. There
   * can be several other reasons for serialization as well
   */
  public char[] refreshPol10RetLglEntyCd() {
    return (substring(
        getStringValue(),
        beginPol10RetLglEntyCd,
        beginPol10RetLglEntyCd + POL_10_RET_LGL_ENTY_CD_LEN));
  }

  int localPol10RetFundTypCdCounter = -1;

  public boolean isPol10RetFundTypCdModified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localPol10RetFundTypCdCounter != sharedCounter;
    localPol10RetFundTypCdCounter = sharedCounter;
    return hasModified;
  }

  protected static final int POL_10_RET_FUND_TYP_CD_LEN = 1;
  /** serialize this Pol10RetFundTypCd */
  protected void serializePol10RetFundTypCd(char[] pol10RetFundTypCd) {
    shareString.getSerializedField().incrementCounter();
    arraycopy(
        pol10RetFundTypCd, 0, getStringValue(), beginPol10RetFundTypCd, POL_10_RET_FUND_TYP_CD_LEN);
    localPol10RetFundTypCdCounter = shareString.getSerializedField().getModifiedCounter();
  }

  protected char[] checkPol10RetFundTypCdConstraints(char[] value) {
    return super.checkConstraints(value, 1, false, false);
  }
  /**
   * refreshPol10RetFundTypCd is used to refresh the latest value of a variable from the Serialized
   * String the most common reason to serialize an Object as a string in to write to a file. There
   * can be several other reasons for serialization as well
   */
  public char[] refreshPol10RetFundTypCd() {
    return (substring(
        getStringValue(),
        beginPol10RetFundTypCd,
        beginPol10RetFundTypCd + POL_10_RET_FUND_TYP_CD_LEN));
  }

  int localPol10RetRiskClsCdCounter = -1;

  public boolean isPol10RetRiskClsCdModified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localPol10RetRiskClsCdCounter != sharedCounter;
    localPol10RetRiskClsCdCounter = sharedCounter;
    return hasModified;
  }

  protected static final int POL_10_RET_RISK_CLS_CD_LEN = 1;
  /** serialize this Pol10RetRiskClsCd */
  protected void serializePol10RetRiskClsCd(char[] pol10RetRiskClsCd) {
    shareString.getSerializedField().incrementCounter();
    arraycopy(
        pol10RetRiskClsCd, 0, getStringValue(), beginPol10RetRiskClsCd, POL_10_RET_RISK_CLS_CD_LEN);
    localPol10RetRiskClsCdCounter = shareString.getSerializedField().getModifiedCounter();
  }

  protected char[] checkPol10RetRiskClsCdConstraints(char[] value) {
    return super.checkConstraints(value, 1, false, false);
  }
  /**
   * refreshPol10RetRiskClsCd is used to refresh the latest value of a variable from the Serialized
   * String the most common reason to serialize an Object as a string in to write to a file. There
   * can be several other reasons for serialization as well
   */
  public char[] refreshPol10RetRiskClsCd() {
    return (substring(
        getStringValue(),
        beginPol10RetRiskClsCd,
        beginPol10RetRiskClsCd + POL_10_RET_RISK_CLS_CD_LEN));
  }
}
