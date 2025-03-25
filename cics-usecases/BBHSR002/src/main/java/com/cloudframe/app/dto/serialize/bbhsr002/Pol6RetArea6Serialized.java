package com.cloudframe.app.dto.serialize.bbhsr002;

/**
 * The class Pol6RetArea6Serialized is used to define offsets in order to serialize in a fixed
 * String
 *
 * @author CloudFrame Inc. created on 2025-03-25 at 08:29. using version 5.0.0.231
 */
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Pol6RetArea6Serialized extends Field {

  protected Logger logger = LoggerFactory.getLogger(Pol6RetArea6Serialized.class);
  /*  Length of the field, if serialized as a String */
  protected static final int POL_6_RET_AREA_6_LENGTH = 129;
  /*  offset of each of Child Fields when serialized as a String */
  protected int beginPol6RetStdPolNbr;
  protected int beginPol6RetStdPlnNbr;
  protected int beginPol6RetStdClssNbr;
  protected int beginPol6RetSrvCatTableId;
  protected int beginPol6RetLftMaxAmt;
  protected int beginPol6RetNewCoinsPd;
  protected int beginPol6RetNewCoinsSalItype;
  protected int beginPol6RetNewCoinsAmt;
  protected int beginPol6RetPayLocCd;
  protected int beginPol6RetPayLocCd2;
  protected int beginPol6RetSrvcCdNSetInd;
  protected int beginPol6RetSrvcCdPSetInd;
  protected int beginPol6RetSrvcCdTSetInd;
  protected int beginPol6PcpSpecCoinsInd;
  protected int beginPol6RetIndvData;
  protected static final int POL_6_RET_INDV_DATA_SIZE = 6;
  protected int beginPol6RetFamData;
  protected static final int POL_6_RET_FAM_DATA_SIZE = 4;
  protected int beginPol6RetXrfLmtSrvcCd;
  protected int beginPol6BenMaxCombPriCd;
  protected int beginPol6SpineManipPriCd;
  protected int beginPol6PhysTrpyPriCd;
  protected int beginPol6PhyOcpTrpyPriCd;
  protected int beginPol6SpchTrpyPriCd;
  protected int beginPol6OcpTrpyPriCd;
  protected int beginPol6PhyOcpSpchPriCd;
  protected int beginPol6CrdcRehabPriCd;
  protected int beginPol6MmlCovSetNbr;

  /** Constructor for Pol6RetArea6Serialized */
  public Pol6RetArea6Serialized() {
    // TO-DO auto generated code
  }

  /**
   * Constructor for Pol6RetArea6Serialized. sets the parent value to the parent
   *
   * @param parent
   * @param begin
   */
  public Pol6RetArea6Serialized(Field parent, int begin) {
    setParent(parent, begin);
  }

  /**
   * sets parent for this Pol6RetArea6Serialized to the parent
   *
   * @param parent
   */
  @Override
  public void setParent(Field parent) {
    setParent(parent, 0); // serialize this field at offset 0 by default
  }

  /**
   * sets parent for this Pol6RetArea6Serialized to the parent and set the serialize offset to
   * parameter begin
   *
   * @param parent
   * @param begin - offset used when serializing this object to a String
   */
  public void setParent(Field parent, int begin) {
    super.setParent(parent);
    init(begin); // serialize this field at offset 0 by default
  }
  /** initializes the field in Pol6RetArea6Serialized */
  @Override
  protected void init(int begin) {
    setStartOffset(begin);
    setLength(POL_6_RET_AREA_6_LENGTH);
    /*  set the offset/position of each field when this object is serialized as String */
    beginPol6RetStdPolNbr = getStartOffset() + 0; // set offset for serialization

    beginPol6RetStdPlnNbr = getStartOffset() + 6; // set offset for serialization

    beginPol6RetStdClssNbr = getStartOffset() + 10; // set offset for serialization

    beginPol6RetSrvCatTableId = getStartOffset() + 14; // set offset for serialization

    beginPol6RetLftMaxAmt = getStartOffset() + 17; // set offset for serialization

    beginPol6RetNewCoinsPd = getStartOffset() + 24; // set offset for serialization

    beginPol6RetNewCoinsSalItype = getStartOffset() + 25; // set offset for serialization

    beginPol6RetNewCoinsAmt = getStartOffset() + 26; // set offset for serialization

    beginPol6RetPayLocCd = getStartOffset() + 31; // set offset for serialization

    beginPol6RetPayLocCd2 = getStartOffset() + 34; // set offset for serialization

    beginPol6RetSrvcCdNSetInd = getStartOffset() + 37; // set offset for serialization

    beginPol6RetSrvcCdPSetInd = getStartOffset() + 38; // set offset for serialization

    beginPol6RetSrvcCdTSetInd = getStartOffset() + 39; // set offset for serialization

    beginPol6PcpSpecCoinsInd = getStartOffset() + 40; // set offset for serialization

    beginPol6RetIndvData = getStartOffset() + 41; // set offset for serialization

    beginPol6RetFamData = getStartOffset() + 89; // set offset for serialization

    beginPol6RetXrfLmtSrvcCd = getStartOffset() + 117; // set offset for serialization

    beginPol6BenMaxCombPriCd = getStartOffset() + 118; // set offset for serialization

    beginPol6SpineManipPriCd = getStartOffset() + 119; // set offset for serialization

    beginPol6PhysTrpyPriCd = getStartOffset() + 120; // set offset for serialization

    beginPol6PhyOcpTrpyPriCd = getStartOffset() + 121; // set offset for serialization

    beginPol6SpchTrpyPriCd = getStartOffset() + 122; // set offset for serialization

    beginPol6OcpTrpyPriCd = getStartOffset() + 123; // set offset for serialization

    beginPol6PhyOcpSpchPriCd = getStartOffset() + 124; // set offset for serialization

    beginPol6CrdcRehabPriCd = getStartOffset() + 125; // set offset for serialization

    beginPol6MmlCovSetNbr = getStartOffset() + 126; // set offset for serialization

    /*  end of offset */
  }

  int localPol6RetStdPolNbrCounter = -1;

  public boolean isPol6RetStdPolNbrModified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localPol6RetStdPolNbrCounter != sharedCounter;
    localPol6RetStdPolNbrCounter = sharedCounter;
    return hasModified;
  }

  protected static final int POL_6_RET_STD_POL_NBR_LEN = 6;
  /** serialize this Pol6RetStdPolNbr */
  protected void serializePol6RetStdPolNbr(char[] pol6RetStdPolNbr) {
    shareString.getSerializedField().incrementCounter();
    arraycopy(
        pol6RetStdPolNbr, 0, getStringValue(), beginPol6RetStdPolNbr, POL_6_RET_STD_POL_NBR_LEN);
    localPol6RetStdPolNbrCounter = shareString.getSerializedField().getModifiedCounter();
  }

  protected char[] checkPol6RetStdPolNbrConstraints(char[] value) {
    return super.checkConstraints(value, 6, false, false);
  }
  /**
   * refreshPol6RetStdPolNbr is used to refresh the latest value of a variable from the Serialized
   * String the most common reason to serialize an Object as a string in to write to a file. There
   * can be several other reasons for serialization as well
   */
  public char[] refreshPol6RetStdPolNbr() {
    return (substring(
        getStringValue(),
        beginPol6RetStdPolNbr,
        beginPol6RetStdPolNbr + POL_6_RET_STD_POL_NBR_LEN));
  }

  int localPol6RetStdPlnNbrCounter = -1;

  public boolean isPol6RetStdPlnNbrModified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localPol6RetStdPlnNbrCounter != sharedCounter;
    localPol6RetStdPlnNbrCounter = sharedCounter;
    return hasModified;
  }

  /**
   * Returns String value of pol6RetStdPlnNbr
   *
   * @return pol6RetStdPlnNbr
   */
  public char[] getPol6RetStdPlnNbrString() {
    return getCharArray(beginPol6RetStdPlnNbr, POL_6_RET_STD_PLN_NBR_LEN);
  }

  /**
   * This method allows testing if there is a numeric value stored in the serialized String
   *
   * @return true if numeric value is stored in the string
   */
  public boolean pol6RetStdPlnNbrIsNumeric() {
    return isNumeric(
        beginPol6RetStdPlnNbr,
        beginPol6RetStdPlnNbr + POL_6_RET_STD_PLN_NBR_LEN,
        false /*Signed*/,
        true /*isSign trailing*/,
        false /*isSignStoredSeparately*/);
  }

  protected static final int POL_6_RET_STD_PLN_NBR_LEN = 4;
  /** serializePol6RetStdPlnNbr */
  protected void serializePol6RetStdPlnNbr(int pol6RetStdPlnNbr) {
    putNumber(
        beginPol6RetStdPlnNbr,
        pol6RetStdPlnNbr,
        POL_6_RET_STD_PLN_NBR_LEN,
        false /*isSigned?*/,
        true /*signTrailing?*/,
        false /*storeSignSeparate?*/);
    localPol6RetStdPlnNbrCounter = shareString.getSerializedField().getModifiedCounter();
  }
  /** serializePol6RetStdPlnNbr */
  protected int serializePol6RetStdPlnNbr(char[] value) {
    int pol6RetStdPlnNbr;
    if (value.length > 0 && value.length != 4) value = new String(value).trim().toCharArray();
    if (value.length < 4) value = pad(4, value, ' ', LEFT_PAD);
    else if (value.length > 4) value = substring(value, 0, 4);
    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
    pol6RetStdPlnNbr =
        (int)
            convertString2Number(
                value, false /*isSigned?*/, true /*signTrailing?*/, false /*storeSignSeparate?*/);
    replaceValue(padNumber(4, value, false /*isSigned?*/), beginPol6RetStdPlnNbr, 4);
    localPol6RetStdPlnNbrCounter = shareString.getSerializedField().getModifiedCounter();
    return pol6RetStdPlnNbr;
  }

  protected int checkPol6RetStdPlnNbrMaxLimit(long number) {

    return (int) checkMaxLimit(number, MAX_10K /*limit*/, false /*isSigned*/);
  }
  /**
   * refreshPol6RetStdPlnNbr is used to refresh the latest value of a variable from the Serialized
   * String the most common reason to serialize an Object as a string in to write to a file. There
   * can be several other reasons for serialization as well
   */
  public int refreshPol6RetStdPlnNbr() throws CFException {
    try {
      return (getIntNumber(
          beginPol6RetStdPlnNbr,
          POL_6_RET_STD_PLN_NBR_LEN,
          false /*isSigned*/,
          true /*isSignTrailing*/,
          false /*isSignStoredSeparate*/));
    } catch (Exception ex) {
      throw getSoc7ABend("pol6RetStdPlnNbr", beginPol6RetStdPlnNbr, POL_6_RET_STD_PLN_NBR_LEN);
    }
  }

  int localPol6RetStdClssNbrCounter = -1;

  public boolean isPol6RetStdClssNbrModified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localPol6RetStdClssNbrCounter != sharedCounter;
    localPol6RetStdClssNbrCounter = sharedCounter;
    return hasModified;
  }

  /**
   * Returns String value of pol6RetStdClssNbr
   *
   * @return pol6RetStdClssNbr
   */
  public char[] getPol6RetStdClssNbrString() {
    return getCharArray(beginPol6RetStdClssNbr, POL_6_RET_STD_CLSS_NBR_LEN);
  }

  /**
   * This method allows testing if there is a numeric value stored in the serialized String
   *
   * @return true if numeric value is stored in the string
   */
  public boolean pol6RetStdClssNbrIsNumeric() {
    return isNumeric(
        beginPol6RetStdClssNbr,
        beginPol6RetStdClssNbr + POL_6_RET_STD_CLSS_NBR_LEN,
        false /*Signed*/,
        true /*isSign trailing*/,
        false /*isSignStoredSeparately*/);
  }

  protected static final int POL_6_RET_STD_CLSS_NBR_LEN = 4;
  /** serializePol6RetStdClssNbr */
  protected void serializePol6RetStdClssNbr(int pol6RetStdClssNbr) {
    putNumber(
        beginPol6RetStdClssNbr,
        pol6RetStdClssNbr,
        POL_6_RET_STD_CLSS_NBR_LEN,
        false /*isSigned?*/,
        true /*signTrailing?*/,
        false /*storeSignSeparate?*/);
    localPol6RetStdClssNbrCounter = shareString.getSerializedField().getModifiedCounter();
  }
  /** serializePol6RetStdClssNbr */
  protected int serializePol6RetStdClssNbr(char[] value) {
    int pol6RetStdClssNbr;
    if (value.length > 0 && value.length != 4) value = new String(value).trim().toCharArray();
    if (value.length < 4) value = pad(4, value, ' ', LEFT_PAD);
    else if (value.length > 4) value = substring(value, 0, 4);
    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
    pol6RetStdClssNbr =
        (int)
            convertString2Number(
                value, false /*isSigned?*/, true /*signTrailing?*/, false /*storeSignSeparate?*/);
    replaceValue(padNumber(4, value, false /*isSigned?*/), beginPol6RetStdClssNbr, 4);
    localPol6RetStdClssNbrCounter = shareString.getSerializedField().getModifiedCounter();
    return pol6RetStdClssNbr;
  }

  protected int checkPol6RetStdClssNbrMaxLimit(long number) {

    return (int) checkMaxLimit(number, MAX_10K /*limit*/, false /*isSigned*/);
  }
  /**
   * refreshPol6RetStdClssNbr is used to refresh the latest value of a variable from the Serialized
   * String the most common reason to serialize an Object as a string in to write to a file. There
   * can be several other reasons for serialization as well
   */
  public int refreshPol6RetStdClssNbr() throws CFException {
    try {
      return (getIntNumber(
          beginPol6RetStdClssNbr,
          POL_6_RET_STD_CLSS_NBR_LEN,
          false /*isSigned*/,
          true /*isSignTrailing*/,
          false /*isSignStoredSeparate*/));
    } catch (Exception ex) {
      throw getSoc7ABend("pol6RetStdClssNbr", beginPol6RetStdClssNbr, POL_6_RET_STD_CLSS_NBR_LEN);
    }
  }

  int localPol6RetSrvCatTableIdCounter = -1;

  public boolean isPol6RetSrvCatTableIdModified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localPol6RetSrvCatTableIdCounter != sharedCounter;
    localPol6RetSrvCatTableIdCounter = sharedCounter;
    return hasModified;
  }

  protected static final int POL_6_RET_SRV_CAT_TABLE_ID_LEN = 3;
  /** serialize this Pol6RetSrvCatTableId */
  protected void serializePol6RetSrvCatTableId(char[] pol6RetSrvCatTableId) {
    shareString.getSerializedField().incrementCounter();
    arraycopy(
        pol6RetSrvCatTableId,
        0,
        getStringValue(),
        beginPol6RetSrvCatTableId,
        POL_6_RET_SRV_CAT_TABLE_ID_LEN);
    localPol6RetSrvCatTableIdCounter = shareString.getSerializedField().getModifiedCounter();
  }

  protected char[] checkPol6RetSrvCatTableIdConstraints(char[] value) {
    return super.checkConstraints(value, 3, false, false);
  }
  /**
   * refreshPol6RetSrvCatTableId is used to refresh the latest value of a variable from the
   * Serialized String the most common reason to serialize an Object as a string in to write to a
   * file. There can be several other reasons for serialization as well
   */
  public char[] refreshPol6RetSrvCatTableId() {
    return (substring(
        getStringValue(),
        beginPol6RetSrvCatTableId,
        beginPol6RetSrvCatTableId + POL_6_RET_SRV_CAT_TABLE_ID_LEN));
  }

  int localPol6RetLftMaxAmtCounter = -1;

  public boolean isPol6RetLftMaxAmtModified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localPol6RetLftMaxAmtCounter != sharedCounter;
    localPol6RetLftMaxAmtCounter = sharedCounter;
    return hasModified;
  }

  /**
   * Returns String value of pol6RetLftMaxAmt
   *
   * @return pol6RetLftMaxAmt
   */
  public char[] getPol6RetLftMaxAmtString() {
    return getCharArray(beginPol6RetLftMaxAmt, POL_6_RET_LFT_MAX_AMT_LEN);
  }

  /**
   * This method allows testing if there is a numeric value stored in the serialized String
   *
   * @return true if numeric value is stored in the string
   */
  public boolean pol6RetLftMaxAmtIsNumeric() {
    return isNumeric(
        beginPol6RetLftMaxAmt,
        beginPol6RetLftMaxAmt + POL_6_RET_LFT_MAX_AMT_LEN,
        false /*Signed*/,
        true /*isSign trailing*/,
        false /*isSignStoredSeparately*/);
  }

  protected static final int POL_6_RET_LFT_MAX_AMT_LEN = 7;
  /** serializePol6RetLftMaxAmt */
  protected void serializePol6RetLftMaxAmt(long pol6RetLftMaxAmt) {
    putNumber(
        beginPol6RetLftMaxAmt,
        pol6RetLftMaxAmt,
        POL_6_RET_LFT_MAX_AMT_LEN,
        false /*isSigned?*/,
        true /*signTrailing?*/,
        false /*storeSignSeparate?*/);
    localPol6RetLftMaxAmtCounter = shareString.getSerializedField().getModifiedCounter();
  }
  /** serializePol6RetLftMaxAmt */
  protected long serializePol6RetLftMaxAmt(char[] value) {
    long pol6RetLftMaxAmt;
    if (value.length > 0 && value.length != 7) value = new String(value).trim().toCharArray();
    if (value.length < 7) value = pad(7, value, ' ', LEFT_PAD);
    else if (value.length > 7) value = substring(value, 0, 7);
    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
    pol6RetLftMaxAmt =
        convertString2Number(
            value, false /*isSigned?*/, true /*signTrailing?*/, false /*storeSignSeparate?*/);
    replaceValue(padNumber(7, value, false /*isSigned?*/), beginPol6RetLftMaxAmt, 7);
    localPol6RetLftMaxAmtCounter = shareString.getSerializedField().getModifiedCounter();
    return pol6RetLftMaxAmt;
  }

  protected long checkPol6RetLftMaxAmtMaxLimit(long number) {

    return checkMaxLimit(number, MAX_10M /*limit*/, false /*isSigned*/);
  }
  /**
   * refreshPol6RetLftMaxAmt is used to refresh the latest value of a variable from the Serialized
   * String the most common reason to serialize an Object as a string in to write to a file. There
   * can be several other reasons for serialization as well
   */
  public long refreshPol6RetLftMaxAmt() throws CFException {
    try {
      return (getLongNumber(
          beginPol6RetLftMaxAmt,
          POL_6_RET_LFT_MAX_AMT_LEN,
          false /*isSigned*/,
          true /*isSignTrailing*/,
          false /*isSignStoredSeparate*/));
    } catch (Exception ex) {
      throw getSoc7ABend("pol6RetLftMaxAmt", beginPol6RetLftMaxAmt, POL_6_RET_LFT_MAX_AMT_LEN);
    }
  }

  int localPol6RetNewCoinsPdCounter = -1;

  public boolean isPol6RetNewCoinsPdModified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localPol6RetNewCoinsPdCounter != sharedCounter;
    localPol6RetNewCoinsPdCounter = sharedCounter;
    return hasModified;
  }

  /**
   * Returns String value of pol6RetNewCoinsPd
   *
   * @return pol6RetNewCoinsPd
   */
  public char[] getPol6RetNewCoinsPdString() {
    return getCharArray(beginPol6RetNewCoinsPd, POL_6_RET_NEW_COINS_PD_LEN);
  }

  /**
   * This method allows testing if there is a numeric value stored in the serialized String
   *
   * @return true if numeric value is stored in the string
   */
  public boolean pol6RetNewCoinsPdIsNumeric() {
    return isNumeric(
        beginPol6RetNewCoinsPd,
        beginPol6RetNewCoinsPd + POL_6_RET_NEW_COINS_PD_LEN,
        false /*Signed*/,
        true /*isSign trailing*/,
        false /*isSignStoredSeparately*/);
  }

  protected static final int POL_6_RET_NEW_COINS_PD_LEN = 1;
  /** serializePol6RetNewCoinsPd */
  protected void serializePol6RetNewCoinsPd(int pol6RetNewCoinsPd) {
    putNumber(
        beginPol6RetNewCoinsPd,
        pol6RetNewCoinsPd,
        POL_6_RET_NEW_COINS_PD_LEN,
        false /*isSigned?*/,
        true /*signTrailing?*/,
        false /*storeSignSeparate?*/);
    localPol6RetNewCoinsPdCounter = shareString.getSerializedField().getModifiedCounter();
  }
  /** serializePol6RetNewCoinsPd */
  protected int serializePol6RetNewCoinsPd(char[] value) {
    int pol6RetNewCoinsPd;
    if (value.length > 0 && value.length != 1) value = new String(value).trim().toCharArray();
    if (value.length < 1) value = pad(1, value, ' ', LEFT_PAD);
    else if (value.length > 1) value = substring(value, 0, 1);
    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
    pol6RetNewCoinsPd =
        (int)
            convertString2Number(
                value, false /*isSigned?*/, true /*signTrailing?*/, false /*storeSignSeparate?*/);
    replaceValue(padNumber(1, value, false /*isSigned?*/), beginPol6RetNewCoinsPd, 1);
    localPol6RetNewCoinsPdCounter = shareString.getSerializedField().getModifiedCounter();
    return pol6RetNewCoinsPd;
  }

  protected int checkPol6RetNewCoinsPdMaxLimit(long number) {

    return (int) checkMaxLimit(number, MAX_10 /*limit*/, false /*isSigned*/);
  }
  /**
   * refreshPol6RetNewCoinsPd is used to refresh the latest value of a variable from the Serialized
   * String the most common reason to serialize an Object as a string in to write to a file. There
   * can be several other reasons for serialization as well
   */
  public int refreshPol6RetNewCoinsPd() throws CFException {
    try {
      return (getIntNumber(
          beginPol6RetNewCoinsPd,
          POL_6_RET_NEW_COINS_PD_LEN,
          false /*isSigned*/,
          true /*isSignTrailing*/,
          false /*isSignStoredSeparate*/));
    } catch (Exception ex) {
      throw getSoc7ABend("pol6RetNewCoinsPd", beginPol6RetNewCoinsPd, POL_6_RET_NEW_COINS_PD_LEN);
    }
  }

  int localPol6RetNewCoinsSalItypeCounter = -1;

  public boolean isPol6RetNewCoinsSalItypeModified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localPol6RetNewCoinsSalItypeCounter != sharedCounter;
    localPol6RetNewCoinsSalItypeCounter = sharedCounter;
    return hasModified;
  }

  protected static final int POL_6_RET_NEW_COINS_SAL_ITYPE_LEN = 1;
  /** serialize this Pol6RetNewCoinsSalItype */
  protected void serializePol6RetNewCoinsSalItype(char[] pol6RetNewCoinsSalItype) {
    shareString.getSerializedField().incrementCounter();
    arraycopy(
        pol6RetNewCoinsSalItype,
        0,
        getStringValue(),
        beginPol6RetNewCoinsSalItype,
        POL_6_RET_NEW_COINS_SAL_ITYPE_LEN);
    localPol6RetNewCoinsSalItypeCounter = shareString.getSerializedField().getModifiedCounter();
  }

  protected char[] checkPol6RetNewCoinsSalItypeConstraints(char[] value) {
    return super.checkConstraints(value, 1, false, false);
  }
  /**
   * refreshPol6RetNewCoinsSalItype is used to refresh the latest value of a variable from the
   * Serialized String the most common reason to serialize an Object as a string in to write to a
   * file. There can be several other reasons for serialization as well
   */
  public char[] refreshPol6RetNewCoinsSalItype() {
    return (substring(
        getStringValue(),
        beginPol6RetNewCoinsSalItype,
        beginPol6RetNewCoinsSalItype + POL_6_RET_NEW_COINS_SAL_ITYPE_LEN));
  }

  int localPol6RetNewCoinsAmtCounter = -1;

  public boolean isPol6RetNewCoinsAmtModified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localPol6RetNewCoinsAmtCounter != sharedCounter;
    localPol6RetNewCoinsAmtCounter = sharedCounter;
    return hasModified;
  }

  /**
   * Returns String value of pol6RetNewCoinsAmt
   *
   * @return pol6RetNewCoinsAmt
   */
  public char[] getPol6RetNewCoinsAmtString() {
    return getCharArray(beginPol6RetNewCoinsAmt, POL_6_RET_NEW_COINS_AMT_LEN);
  }

  /**
   * This method allows testing if there is a numeric value stored in the serialized String
   *
   * @return true if numeric value is stored in the string
   */
  public boolean pol6RetNewCoinsAmtIsNumeric() {
    return isNumeric(
        beginPol6RetNewCoinsAmt,
        beginPol6RetNewCoinsAmt + POL_6_RET_NEW_COINS_AMT_LEN,
        false /*Signed*/,
        true /*isSign trailing*/,
        false /*isSignStoredSeparately*/);
  }

  protected static final int POL_6_RET_NEW_COINS_AMT_LEN = 5;
  /** serializePol6RetNewCoinsAmt */
  protected void serializePol6RetNewCoinsAmt(long pol6RetNewCoinsAmt) {
    putNumber(
        beginPol6RetNewCoinsAmt,
        pol6RetNewCoinsAmt,
        POL_6_RET_NEW_COINS_AMT_LEN,
        false /*isSigned?*/,
        true /*signTrailing?*/,
        false /*storeSignSeparate?*/);
    localPol6RetNewCoinsAmtCounter = shareString.getSerializedField().getModifiedCounter();
  }
  /** serializePol6RetNewCoinsAmt */
  protected long serializePol6RetNewCoinsAmt(char[] value) {
    long pol6RetNewCoinsAmt;
    if (value.length > 0 && value.length != 5) value = new String(value).trim().toCharArray();
    if (value.length < 5) value = pad(5, value, ' ', LEFT_PAD);
    else if (value.length > 5) value = substring(value, 0, 5);
    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
    pol6RetNewCoinsAmt =
        convertString2Number(
            value, false /*isSigned?*/, true /*signTrailing?*/, false /*storeSignSeparate?*/);
    replaceValue(padNumber(5, value, false /*isSigned?*/), beginPol6RetNewCoinsAmt, 5);
    localPol6RetNewCoinsAmtCounter = shareString.getSerializedField().getModifiedCounter();
    return pol6RetNewCoinsAmt;
  }

  protected long checkPol6RetNewCoinsAmtMaxLimit(long number) {

    return checkMaxLimit(number, MAX_100K /*limit*/, false /*isSigned*/);
  }
  /**
   * refreshPol6RetNewCoinsAmt is used to refresh the latest value of a variable from the Serialized
   * String the most common reason to serialize an Object as a string in to write to a file. There
   * can be several other reasons for serialization as well
   */
  public long refreshPol6RetNewCoinsAmt() throws CFException {
    try {
      return (getLongNumber(
          beginPol6RetNewCoinsAmt,
          POL_6_RET_NEW_COINS_AMT_LEN,
          false /*isSigned*/,
          true /*isSignTrailing*/,
          false /*isSignStoredSeparate*/));
    } catch (Exception ex) {
      throw getSoc7ABend(
          "pol6RetNewCoinsAmt", beginPol6RetNewCoinsAmt, POL_6_RET_NEW_COINS_AMT_LEN);
    }
  }

  int localPol6RetPayLocCdCounter = -1;

  public boolean isPol6RetPayLocCdModified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localPol6RetPayLocCdCounter != sharedCounter;
    localPol6RetPayLocCdCounter = sharedCounter;
    return hasModified;
  }

  protected static final int POL_6_RET_PAY_LOC_CD_LEN = 3;
  /** serialize this Pol6RetPayLocCd */
  protected void serializePol6RetPayLocCd(char[] pol6RetPayLocCd) {
    shareString.getSerializedField().incrementCounter();
    arraycopy(pol6RetPayLocCd, 0, getStringValue(), beginPol6RetPayLocCd, POL_6_RET_PAY_LOC_CD_LEN);
    localPol6RetPayLocCdCounter = shareString.getSerializedField().getModifiedCounter();
  }

  protected char[] checkPol6RetPayLocCdConstraints(char[] value) {
    return super.checkConstraints(value, 3, false, false);
  }
  /**
   * refreshPol6RetPayLocCd is used to refresh the latest value of a variable from the Serialized
   * String the most common reason to serialize an Object as a string in to write to a file. There
   * can be several other reasons for serialization as well
   */
  public char[] refreshPol6RetPayLocCd() {
    return (substring(
        getStringValue(), beginPol6RetPayLocCd, beginPol6RetPayLocCd + POL_6_RET_PAY_LOC_CD_LEN));
  }

  int localPol6RetPayLocCd2Counter = -1;

  public boolean isPol6RetPayLocCd2Modified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localPol6RetPayLocCd2Counter != sharedCounter;
    localPol6RetPayLocCd2Counter = sharedCounter;
    return hasModified;
  }

  protected static final int POL_6_RET_PAY_LOC_CD_2_LEN = 3;
  /** serialize this Pol6RetPayLocCd2 */
  protected void serializePol6RetPayLocCd2(char[] pol6RetPayLocCd2) {
    shareString.getSerializedField().incrementCounter();
    arraycopy(
        pol6RetPayLocCd2, 0, getStringValue(), beginPol6RetPayLocCd2, POL_6_RET_PAY_LOC_CD_2_LEN);
    localPol6RetPayLocCd2Counter = shareString.getSerializedField().getModifiedCounter();
  }

  protected char[] checkPol6RetPayLocCd2Constraints(char[] value) {
    return super.checkConstraints(value, 3, false, false);
  }
  /**
   * refreshPol6RetPayLocCd2 is used to refresh the latest value of a variable from the Serialized
   * String the most common reason to serialize an Object as a string in to write to a file. There
   * can be several other reasons for serialization as well
   */
  public char[] refreshPol6RetPayLocCd2() {
    return (substring(
        getStringValue(),
        beginPol6RetPayLocCd2,
        beginPol6RetPayLocCd2 + POL_6_RET_PAY_LOC_CD_2_LEN));
  }

  int localPol6RetSrvcCdNSetIndCounter = -1;

  public boolean isPol6RetSrvcCdNSetIndModified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localPol6RetSrvcCdNSetIndCounter != sharedCounter;
    localPol6RetSrvcCdNSetIndCounter = sharedCounter;
    return hasModified;
  }

  protected static final int POL_6_RET_SRVC_CD_NSET_IND_LEN = 1;
  /** serialize this Pol6RetSrvcCdNSetInd */
  protected void serializePol6RetSrvcCdNSetInd(char[] pol6RetSrvcCdNSetInd) {
    shareString.getSerializedField().incrementCounter();
    arraycopy(
        pol6RetSrvcCdNSetInd,
        0,
        getStringValue(),
        beginPol6RetSrvcCdNSetInd,
        POL_6_RET_SRVC_CD_NSET_IND_LEN);
    localPol6RetSrvcCdNSetIndCounter = shareString.getSerializedField().getModifiedCounter();
  }

  protected char[] checkPol6RetSrvcCdNSetIndConstraints(char[] value) {
    return super.checkConstraints(value, 1, false, false);
  }
  /**
   * refreshPol6RetSrvcCdNSetInd is used to refresh the latest value of a variable from the
   * Serialized String the most common reason to serialize an Object as a string in to write to a
   * file. There can be several other reasons for serialization as well
   */
  public char[] refreshPol6RetSrvcCdNSetInd() {
    return (substring(
        getStringValue(),
        beginPol6RetSrvcCdNSetInd,
        beginPol6RetSrvcCdNSetInd + POL_6_RET_SRVC_CD_NSET_IND_LEN));
  }

  int localPol6RetSrvcCdPSetIndCounter = -1;

  public boolean isPol6RetSrvcCdPSetIndModified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localPol6RetSrvcCdPSetIndCounter != sharedCounter;
    localPol6RetSrvcCdPSetIndCounter = sharedCounter;
    return hasModified;
  }

  protected static final int POL_6_RET_SRVC_CD_PSET_IND_LEN = 1;
  /** serialize this Pol6RetSrvcCdPSetInd */
  protected void serializePol6RetSrvcCdPSetInd(char[] pol6RetSrvcCdPSetInd) {
    shareString.getSerializedField().incrementCounter();
    arraycopy(
        pol6RetSrvcCdPSetInd,
        0,
        getStringValue(),
        beginPol6RetSrvcCdPSetInd,
        POL_6_RET_SRVC_CD_PSET_IND_LEN);
    localPol6RetSrvcCdPSetIndCounter = shareString.getSerializedField().getModifiedCounter();
  }

  protected char[] checkPol6RetSrvcCdPSetIndConstraints(char[] value) {
    return super.checkConstraints(value, 1, false, false);
  }
  /**
   * refreshPol6RetSrvcCdPSetInd is used to refresh the latest value of a variable from the
   * Serialized String the most common reason to serialize an Object as a string in to write to a
   * file. There can be several other reasons for serialization as well
   */
  public char[] refreshPol6RetSrvcCdPSetInd() {
    return (substring(
        getStringValue(),
        beginPol6RetSrvcCdPSetInd,
        beginPol6RetSrvcCdPSetInd + POL_6_RET_SRVC_CD_PSET_IND_LEN));
  }

  int localPol6RetSrvcCdTSetIndCounter = -1;

  public boolean isPol6RetSrvcCdTSetIndModified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localPol6RetSrvcCdTSetIndCounter != sharedCounter;
    localPol6RetSrvcCdTSetIndCounter = sharedCounter;
    return hasModified;
  }

  protected static final int POL_6_RET_SRVC_CD_TSET_IND_LEN = 1;
  /** serialize this Pol6RetSrvcCdTSetInd */
  protected void serializePol6RetSrvcCdTSetInd(char[] pol6RetSrvcCdTSetInd) {
    shareString.getSerializedField().incrementCounter();
    arraycopy(
        pol6RetSrvcCdTSetInd,
        0,
        getStringValue(),
        beginPol6RetSrvcCdTSetInd,
        POL_6_RET_SRVC_CD_TSET_IND_LEN);
    localPol6RetSrvcCdTSetIndCounter = shareString.getSerializedField().getModifiedCounter();
  }

  protected char[] checkPol6RetSrvcCdTSetIndConstraints(char[] value) {
    return super.checkConstraints(value, 1, false, false);
  }
  /**
   * refreshPol6RetSrvcCdTSetInd is used to refresh the latest value of a variable from the
   * Serialized String the most common reason to serialize an Object as a string in to write to a
   * file. There can be several other reasons for serialization as well
   */
  public char[] refreshPol6RetSrvcCdTSetInd() {
    return (substring(
        getStringValue(),
        beginPol6RetSrvcCdTSetInd,
        beginPol6RetSrvcCdTSetInd + POL_6_RET_SRVC_CD_TSET_IND_LEN));
  }

  int localPol6PcpSpecCoinsIndCounter = -1;

  public boolean isPol6PcpSpecCoinsIndModified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localPol6PcpSpecCoinsIndCounter != sharedCounter;
    localPol6PcpSpecCoinsIndCounter = sharedCounter;
    return hasModified;
  }

  protected static final int POL_6_PCP_SPEC_COINS_IND_LEN = 1;
  /** serialize this Pol6PcpSpecCoinsInd */
  protected void serializePol6PcpSpecCoinsInd(char[] pol6PcpSpecCoinsInd) {
    shareString.getSerializedField().incrementCounter();
    arraycopy(
        pol6PcpSpecCoinsInd,
        0,
        getStringValue(),
        beginPol6PcpSpecCoinsInd,
        POL_6_PCP_SPEC_COINS_IND_LEN);
    localPol6PcpSpecCoinsIndCounter = shareString.getSerializedField().getModifiedCounter();
  }

  protected char[] checkPol6PcpSpecCoinsIndConstraints(char[] value) {
    return super.checkConstraints(value, 1, false, false);
  }
  /**
   * refreshPol6PcpSpecCoinsInd is used to refresh the latest value of a variable from the
   * Serialized String the most common reason to serialize an Object as a string in to write to a
   * file. There can be several other reasons for serialization as well
   */
  public char[] refreshPol6PcpSpecCoinsInd() {
    return (substring(
        getStringValue(),
        beginPol6PcpSpecCoinsInd,
        beginPol6PcpSpecCoinsInd + POL_6_PCP_SPEC_COINS_IND_LEN));
  }

  int localPol6RetXrfLmtSrvcCdCounter = -1;

  public boolean isPol6RetXrfLmtSrvcCdModified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localPol6RetXrfLmtSrvcCdCounter != sharedCounter;
    localPol6RetXrfLmtSrvcCdCounter = sharedCounter;
    return hasModified;
  }

  protected static final int POL_6_RET_XRF_LMT_SRVC_CD_LEN = 1;
  /** serialize this Pol6RetXrfLmtSrvcCd */
  protected void serializePol6RetXrfLmtSrvcCd(char[] pol6RetXrfLmtSrvcCd) {
    shareString.getSerializedField().incrementCounter();
    arraycopy(
        pol6RetXrfLmtSrvcCd,
        0,
        getStringValue(),
        beginPol6RetXrfLmtSrvcCd,
        POL_6_RET_XRF_LMT_SRVC_CD_LEN);
    localPol6RetXrfLmtSrvcCdCounter = shareString.getSerializedField().getModifiedCounter();
  }

  protected char[] checkPol6RetXrfLmtSrvcCdConstraints(char[] value) {
    return super.checkConstraints(value, 1, false, false);
  }
  /**
   * refreshPol6RetXrfLmtSrvcCd is used to refresh the latest value of a variable from the
   * Serialized String the most common reason to serialize an Object as a string in to write to a
   * file. There can be several other reasons for serialization as well
   */
  public char[] refreshPol6RetXrfLmtSrvcCd() {
    return (substring(
        getStringValue(),
        beginPol6RetXrfLmtSrvcCd,
        beginPol6RetXrfLmtSrvcCd + POL_6_RET_XRF_LMT_SRVC_CD_LEN));
  }

  int localPol6BenMaxCombPriCdCounter = -1;

  public boolean isPol6BenMaxCombPriCdModified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localPol6BenMaxCombPriCdCounter != sharedCounter;
    localPol6BenMaxCombPriCdCounter = sharedCounter;
    return hasModified;
  }

  protected static final int POL_6_BEN_MAX_COMB_PRI_CD_LEN = 1;
  /** serialize this Pol6BenMaxCombPriCd */
  protected void serializePol6BenMaxCombPriCd(char[] pol6BenMaxCombPriCd) {
    shareString.getSerializedField().incrementCounter();
    arraycopy(
        pol6BenMaxCombPriCd,
        0,
        getStringValue(),
        beginPol6BenMaxCombPriCd,
        POL_6_BEN_MAX_COMB_PRI_CD_LEN);
    localPol6BenMaxCombPriCdCounter = shareString.getSerializedField().getModifiedCounter();
  }

  protected char[] checkPol6BenMaxCombPriCdConstraints(char[] value) {
    return super.checkConstraints(value, 1, false, false);
  }
  /**
   * refreshPol6BenMaxCombPriCd is used to refresh the latest value of a variable from the
   * Serialized String the most common reason to serialize an Object as a string in to write to a
   * file. There can be several other reasons for serialization as well
   */
  public char[] refreshPol6BenMaxCombPriCd() {
    return (substring(
        getStringValue(),
        beginPol6BenMaxCombPriCd,
        beginPol6BenMaxCombPriCd + POL_6_BEN_MAX_COMB_PRI_CD_LEN));
  }

  int localPol6SpineManipPriCdCounter = -1;

  public boolean isPol6SpineManipPriCdModified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localPol6SpineManipPriCdCounter != sharedCounter;
    localPol6SpineManipPriCdCounter = sharedCounter;
    return hasModified;
  }

  protected static final int POL_6_SPINE_MANIP_PRI_CD_LEN = 1;
  /** serialize this Pol6SpineManipPriCd */
  protected void serializePol6SpineManipPriCd(char[] pol6SpineManipPriCd) {
    shareString.getSerializedField().incrementCounter();
    arraycopy(
        pol6SpineManipPriCd,
        0,
        getStringValue(),
        beginPol6SpineManipPriCd,
        POL_6_SPINE_MANIP_PRI_CD_LEN);
    localPol6SpineManipPriCdCounter = shareString.getSerializedField().getModifiedCounter();
  }

  protected char[] checkPol6SpineManipPriCdConstraints(char[] value) {
    return super.checkConstraints(value, 1, false, false);
  }
  /**
   * refreshPol6SpineManipPriCd is used to refresh the latest value of a variable from the
   * Serialized String the most common reason to serialize an Object as a string in to write to a
   * file. There can be several other reasons for serialization as well
   */
  public char[] refreshPol6SpineManipPriCd() {
    return (substring(
        getStringValue(),
        beginPol6SpineManipPriCd,
        beginPol6SpineManipPriCd + POL_6_SPINE_MANIP_PRI_CD_LEN));
  }

  int localPol6PhysTrpyPriCdCounter = -1;

  public boolean isPol6PhysTrpyPriCdModified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localPol6PhysTrpyPriCdCounter != sharedCounter;
    localPol6PhysTrpyPriCdCounter = sharedCounter;
    return hasModified;
  }

  protected static final int POL_6_PHYS_TRPY_PRI_CD_LEN = 1;
  /** serialize this Pol6PhysTrpyPriCd */
  protected void serializePol6PhysTrpyPriCd(char[] pol6PhysTrpyPriCd) {
    shareString.getSerializedField().incrementCounter();
    arraycopy(
        pol6PhysTrpyPriCd, 0, getStringValue(), beginPol6PhysTrpyPriCd, POL_6_PHYS_TRPY_PRI_CD_LEN);
    localPol6PhysTrpyPriCdCounter = shareString.getSerializedField().getModifiedCounter();
  }

  protected char[] checkPol6PhysTrpyPriCdConstraints(char[] value) {
    return super.checkConstraints(value, 1, false, false);
  }
  /**
   * refreshPol6PhysTrpyPriCd is used to refresh the latest value of a variable from the Serialized
   * String the most common reason to serialize an Object as a string in to write to a file. There
   * can be several other reasons for serialization as well
   */
  public char[] refreshPol6PhysTrpyPriCd() {
    return (substring(
        getStringValue(),
        beginPol6PhysTrpyPriCd,
        beginPol6PhysTrpyPriCd + POL_6_PHYS_TRPY_PRI_CD_LEN));
  }

  int localPol6PhyOcpTrpyPriCdCounter = -1;

  public boolean isPol6PhyOcpTrpyPriCdModified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localPol6PhyOcpTrpyPriCdCounter != sharedCounter;
    localPol6PhyOcpTrpyPriCdCounter = sharedCounter;
    return hasModified;
  }

  protected static final int POL_6_PHY_OCP_TRPY_PRI_CD_LEN = 1;
  /** serialize this Pol6PhyOcpTrpyPriCd */
  protected void serializePol6PhyOcpTrpyPriCd(char[] pol6PhyOcpTrpyPriCd) {
    shareString.getSerializedField().incrementCounter();
    arraycopy(
        pol6PhyOcpTrpyPriCd,
        0,
        getStringValue(),
        beginPol6PhyOcpTrpyPriCd,
        POL_6_PHY_OCP_TRPY_PRI_CD_LEN);
    localPol6PhyOcpTrpyPriCdCounter = shareString.getSerializedField().getModifiedCounter();
  }

  protected char[] checkPol6PhyOcpTrpyPriCdConstraints(char[] value) {
    return super.checkConstraints(value, 1, false, false);
  }
  /**
   * refreshPol6PhyOcpTrpyPriCd is used to refresh the latest value of a variable from the
   * Serialized String the most common reason to serialize an Object as a string in to write to a
   * file. There can be several other reasons for serialization as well
   */
  public char[] refreshPol6PhyOcpTrpyPriCd() {
    return (substring(
        getStringValue(),
        beginPol6PhyOcpTrpyPriCd,
        beginPol6PhyOcpTrpyPriCd + POL_6_PHY_OCP_TRPY_PRI_CD_LEN));
  }

  int localPol6SpchTrpyPriCdCounter = -1;

  public boolean isPol6SpchTrpyPriCdModified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localPol6SpchTrpyPriCdCounter != sharedCounter;
    localPol6SpchTrpyPriCdCounter = sharedCounter;
    return hasModified;
  }

  protected static final int POL_6_SPCH_TRPY_PRI_CD_LEN = 1;
  /** serialize this Pol6SpchTrpyPriCd */
  protected void serializePol6SpchTrpyPriCd(char[] pol6SpchTrpyPriCd) {
    shareString.getSerializedField().incrementCounter();
    arraycopy(
        pol6SpchTrpyPriCd, 0, getStringValue(), beginPol6SpchTrpyPriCd, POL_6_SPCH_TRPY_PRI_CD_LEN);
    localPol6SpchTrpyPriCdCounter = shareString.getSerializedField().getModifiedCounter();
  }

  protected char[] checkPol6SpchTrpyPriCdConstraints(char[] value) {
    return super.checkConstraints(value, 1, false, false);
  }
  /**
   * refreshPol6SpchTrpyPriCd is used to refresh the latest value of a variable from the Serialized
   * String the most common reason to serialize an Object as a string in to write to a file. There
   * can be several other reasons for serialization as well
   */
  public char[] refreshPol6SpchTrpyPriCd() {
    return (substring(
        getStringValue(),
        beginPol6SpchTrpyPriCd,
        beginPol6SpchTrpyPriCd + POL_6_SPCH_TRPY_PRI_CD_LEN));
  }

  int localPol6OcpTrpyPriCdCounter = -1;

  public boolean isPol6OcpTrpyPriCdModified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localPol6OcpTrpyPriCdCounter != sharedCounter;
    localPol6OcpTrpyPriCdCounter = sharedCounter;
    return hasModified;
  }

  protected static final int POL_6_OCP_TRPY_PRI_CD_LEN = 1;
  /** serialize this Pol6OcpTrpyPriCd */
  protected void serializePol6OcpTrpyPriCd(char[] pol6OcpTrpyPriCd) {
    shareString.getSerializedField().incrementCounter();
    arraycopy(
        pol6OcpTrpyPriCd, 0, getStringValue(), beginPol6OcpTrpyPriCd, POL_6_OCP_TRPY_PRI_CD_LEN);
    localPol6OcpTrpyPriCdCounter = shareString.getSerializedField().getModifiedCounter();
  }

  protected char[] checkPol6OcpTrpyPriCdConstraints(char[] value) {
    return super.checkConstraints(value, 1, false, false);
  }
  /**
   * refreshPol6OcpTrpyPriCd is used to refresh the latest value of a variable from the Serialized
   * String the most common reason to serialize an Object as a string in to write to a file. There
   * can be several other reasons for serialization as well
   */
  public char[] refreshPol6OcpTrpyPriCd() {
    return (substring(
        getStringValue(),
        beginPol6OcpTrpyPriCd,
        beginPol6OcpTrpyPriCd + POL_6_OCP_TRPY_PRI_CD_LEN));
  }

  int localPol6PhyOcpSpchPriCdCounter = -1;

  public boolean isPol6PhyOcpSpchPriCdModified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localPol6PhyOcpSpchPriCdCounter != sharedCounter;
    localPol6PhyOcpSpchPriCdCounter = sharedCounter;
    return hasModified;
  }

  protected static final int POL_6_PHY_OCP_SPCH_PRI_CD_LEN = 1;
  /** serialize this Pol6PhyOcpSpchPriCd */
  protected void serializePol6PhyOcpSpchPriCd(char[] pol6PhyOcpSpchPriCd) {
    shareString.getSerializedField().incrementCounter();
    arraycopy(
        pol6PhyOcpSpchPriCd,
        0,
        getStringValue(),
        beginPol6PhyOcpSpchPriCd,
        POL_6_PHY_OCP_SPCH_PRI_CD_LEN);
    localPol6PhyOcpSpchPriCdCounter = shareString.getSerializedField().getModifiedCounter();
  }

  protected char[] checkPol6PhyOcpSpchPriCdConstraints(char[] value) {
    return super.checkConstraints(value, 1, false, false);
  }
  /**
   * refreshPol6PhyOcpSpchPriCd is used to refresh the latest value of a variable from the
   * Serialized String the most common reason to serialize an Object as a string in to write to a
   * file. There can be several other reasons for serialization as well
   */
  public char[] refreshPol6PhyOcpSpchPriCd() {
    return (substring(
        getStringValue(),
        beginPol6PhyOcpSpchPriCd,
        beginPol6PhyOcpSpchPriCd + POL_6_PHY_OCP_SPCH_PRI_CD_LEN));
  }

  int localPol6CrdcRehabPriCdCounter = -1;

  public boolean isPol6CrdcRehabPriCdModified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localPol6CrdcRehabPriCdCounter != sharedCounter;
    localPol6CrdcRehabPriCdCounter = sharedCounter;
    return hasModified;
  }

  protected static final int POL_6_CRDC_REHAB_PRI_CD_LEN = 1;
  /** serialize this Pol6CrdcRehabPriCd */
  protected void serializePol6CrdcRehabPriCd(char[] pol6CrdcRehabPriCd) {
    shareString.getSerializedField().incrementCounter();
    arraycopy(
        pol6CrdcRehabPriCd,
        0,
        getStringValue(),
        beginPol6CrdcRehabPriCd,
        POL_6_CRDC_REHAB_PRI_CD_LEN);
    localPol6CrdcRehabPriCdCounter = shareString.getSerializedField().getModifiedCounter();
  }

  protected char[] checkPol6CrdcRehabPriCdConstraints(char[] value) {
    return super.checkConstraints(value, 1, false, false);
  }
  /**
   * refreshPol6CrdcRehabPriCd is used to refresh the latest value of a variable from the Serialized
   * String the most common reason to serialize an Object as a string in to write to a file. There
   * can be several other reasons for serialization as well
   */
  public char[] refreshPol6CrdcRehabPriCd() {
    return (substring(
        getStringValue(),
        beginPol6CrdcRehabPriCd,
        beginPol6CrdcRehabPriCd + POL_6_CRDC_REHAB_PRI_CD_LEN));
  }

  int localPol6MmlCovSetNbrCounter = -1;

  public boolean isPol6MmlCovSetNbrModified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localPol6MmlCovSetNbrCounter != sharedCounter;
    localPol6MmlCovSetNbrCounter = sharedCounter;
    return hasModified;
  }

  protected static final int POL_6_MML_COV_SET_NBR_LEN = 3;
  /** serialize this Pol6MmlCovSetNbr */
  protected void serializePol6MmlCovSetNbr(char[] pol6MmlCovSetNbr) {
    shareString.getSerializedField().incrementCounter();
    arraycopy(
        pol6MmlCovSetNbr, 0, getStringValue(), beginPol6MmlCovSetNbr, POL_6_MML_COV_SET_NBR_LEN);
    localPol6MmlCovSetNbrCounter = shareString.getSerializedField().getModifiedCounter();
  }

  protected char[] checkPol6MmlCovSetNbrConstraints(char[] value) {
    return super.checkConstraints(value, 3, false, false);
  }
  /**
   * refreshPol6MmlCovSetNbr is used to refresh the latest value of a variable from the Serialized
   * String the most common reason to serialize an Object as a string in to write to a file. There
   * can be several other reasons for serialization as well
   */
  public char[] refreshPol6MmlCovSetNbr() {
    return (substring(
        getStringValue(),
        beginPol6MmlCovSetNbr,
        beginPol6MmlCovSetNbr + POL_6_MML_COV_SET_NBR_LEN));
  }

  public int pol6RetIndvDataSize() {
    return POL_6_RET_INDV_DATA_SIZE;
  }

  public int pol6RetFamDataSize() {
    return POL_6_RET_FAM_DATA_SIZE;
  }
}
