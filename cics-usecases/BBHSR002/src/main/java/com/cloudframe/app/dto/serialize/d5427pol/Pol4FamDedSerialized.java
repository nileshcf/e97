package com.cloudframe.app.dto.serialize.d5427pol;

/**
 * The class Pol4FamDedSerialized is used to define offsets in order to serialize in a fixed String
 *
 * @author CloudFrame Inc. created on 2025-03-25 at 08:31. using version 5.0.0.231
 */
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;
import java.math.BigDecimal;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Pol4FamDedSerialized extends Field {

  protected Logger logger = LoggerFactory.getLogger(Pol4FamDedSerialized.class);
  /*  Length of the field, if serialized as a String */
  protected static final int POL_4_FAM_DED_LENGTH = 34;
  /*  offset of each of Child Fields when serialized as a String */
  protected int beginPol4DfdeSeqNbr;
  protected int beginPol4DfdeDedAmt;
  protected int beginPol4DfdeDedCaroCd;
  protected int beginPol4DfdeDedCd;
  protected int beginPol4DfdeDedMbrDesc;
  protected int beginPol4DfdeDedMultFct;
  protected int beginPol4DfdeDedMultSalryPct;
  protected int beginPol4DfdeOopMultFct;
  protected int beginPol4DedEePls1Amt;
  protected int beginPol4DedEeSpoAmt;
  protected int beginPol4DedEeChrgAmt;

  /** Constructor for Pol4FamDedSerialized */
  public Pol4FamDedSerialized() {
    // TO-DO auto generated code
  }

  /**
   * Constructor for Pol4FamDedSerialized. sets the parent value to the parent
   *
   * @param parent
   * @param begin
   */
  public Pol4FamDedSerialized(Field parent, int begin) {
    setParent(parent, begin);
  }

  /**
   * sets parent for this Pol4FamDedSerialized to the parent
   *
   * @param parent
   */
  @Override
  public void setParent(Field parent) {
    setParent(parent, 482); // serialize this field at offset 482 by default
  }

  /**
   * sets parent for this Pol4FamDedSerialized to the parent and set the serialize offset to
   * parameter begin
   *
   * @param parent
   * @param begin - offset used when serializing this object to a String
   */
  public void setParent(Field parent, int begin) {
    super.setParent(parent);
    init(begin); // serialize this field at offset 482 by default
  }
  /** initializes the field in Pol4FamDedSerialized */
  @Override
  protected void init(int begin) {
    setStartOffset(begin);
    setLength(POL_4_FAM_DED_LENGTH);
    /*  set the offset/position of each field when this object is serialized as String */
    beginPol4DfdeSeqNbr = getStartOffset() + 0; // set offset for serialization

    beginPol4DfdeDedAmt = getStartOffset() + 1; // set offset for serialization

    beginPol4DfdeDedCaroCd = getStartOffset() + 6; // set offset for serialization

    beginPol4DfdeDedCd = getStartOffset() + 7; // set offset for serialization

    beginPol4DfdeDedMbrDesc = getStartOffset() + 8; // set offset for serialization

    beginPol4DfdeDedMultFct = getStartOffset() + 14; // set offset for serialization

    beginPol4DfdeDedMultSalryPct = getStartOffset() + 15; // set offset for serialization

    beginPol4DfdeOopMultFct = getStartOffset() + 17; // set offset for serialization

    beginPol4DedEePls1Amt = getStartOffset() + 19; // set offset for serialization

    beginPol4DedEeSpoAmt = getStartOffset() + 24; // set offset for serialization

    beginPol4DedEeChrgAmt = getStartOffset() + 29; // set offset for serialization

    /*  end of offset */
  }

  int localPol4DfdeSeqNbrCounter = -1;

  public boolean isPol4DfdeSeqNbrModified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localPol4DfdeSeqNbrCounter != sharedCounter;
    localPol4DfdeSeqNbrCounter = sharedCounter;
    return hasModified;
  }

  /**
   * Returns String value of pol4DfdeSeqNbr
   *
   * @return pol4DfdeSeqNbr
   */
  public char[] getPol4DfdeSeqNbrString() {
    return getCharArray(beginPol4DfdeSeqNbr, POL_4_DFDE_SEQ_NBR_LEN);
  }

  /**
   * This method allows testing if there is a numeric value stored in the serialized String
   *
   * @return true if numeric value is stored in the string
   */
  public boolean pol4DfdeSeqNbrIsNumeric() {
    return isNumeric(
        beginPol4DfdeSeqNbr,
        beginPol4DfdeSeqNbr + POL_4_DFDE_SEQ_NBR_LEN,
        false /*Signed*/,
        true /*isSign trailing*/,
        false /*isSignStoredSeparately*/);
  }

  protected static final int POL_4_DFDE_SEQ_NBR_LEN = 1;
  /** serializePol4DfdeSeqNbr */
  protected void serializePol4DfdeSeqNbr(int pol4DfdeSeqNbr) {
    putNumber(
        beginPol4DfdeSeqNbr,
        pol4DfdeSeqNbr,
        POL_4_DFDE_SEQ_NBR_LEN,
        false /*isSigned?*/,
        true /*signTrailing?*/,
        false /*storeSignSeparate?*/);
    localPol4DfdeSeqNbrCounter = shareString.getSerializedField().getModifiedCounter();
  }
  /** serializePol4DfdeSeqNbr */
  protected int serializePol4DfdeSeqNbr(char[] value) {
    int pol4DfdeSeqNbr;
    if (value.length > 0 && value.length != 1) value = new String(value).trim().toCharArray();
    if (value.length < 1) value = pad(1, value, ' ', LEFT_PAD);
    else if (value.length > 1) value = substring(value, 0, 1);
    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
    pol4DfdeSeqNbr =
        (int)
            convertString2Number(
                value, false /*isSigned?*/, true /*signTrailing?*/, false /*storeSignSeparate?*/);
    replaceValue(padNumber(1, value, false /*isSigned?*/), beginPol4DfdeSeqNbr, 1);
    localPol4DfdeSeqNbrCounter = shareString.getSerializedField().getModifiedCounter();
    return pol4DfdeSeqNbr;
  }

  protected int checkPol4DfdeSeqNbrMaxLimit(long number) {

    return (int) checkMaxLimit(number, MAX_10 /*limit*/, false /*isSigned*/);
  }
  /**
   * refreshPol4DfdeSeqNbr is used to refresh the latest value of a variable from the Serialized
   * String the most common reason to serialize an Object as a string in to write to a file. There
   * can be several other reasons for serialization as well
   */
  public int refreshPol4DfdeSeqNbr() throws CFException {
    try {
      return (getIntNumber(
          beginPol4DfdeSeqNbr,
          POL_4_DFDE_SEQ_NBR_LEN,
          false /*isSigned*/,
          true /*isSignTrailing*/,
          false /*isSignStoredSeparate*/));
    } catch (Exception ex) {
      throw getSoc7ABend("pol4DfdeSeqNbr", beginPol4DfdeSeqNbr, POL_4_DFDE_SEQ_NBR_LEN);
    }
  }

  int localPol4DfdeDedAmtCounter = -1;

  public boolean isPol4DfdeDedAmtModified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localPol4DfdeDedAmtCounter != sharedCounter;
    localPol4DfdeDedAmtCounter = sharedCounter;
    return hasModified;
  }

  /**
   * Returns String value of pol4DfdeDedAmt
   *
   * @return pol4DfdeDedAmt
   */
  public char[] getPol4DfdeDedAmtString() {
    return getCharArray(beginPol4DfdeDedAmt, POL_4_DFDE_DED_AMT_LEN);
  }

  /**
   * This method allows testing if there is a numeric value stored in the serialized String
   *
   * @return true if numeric value is stored in the string
   */
  public boolean pol4DfdeDedAmtIsNumeric() {
    return isNumeric(
        beginPol4DfdeDedAmt,
        beginPol4DfdeDedAmt + POL_4_DFDE_DED_AMT_LEN,
        false /*Signed*/,
        true /*isSign trailing*/,
        false /*isSignStoredSeparately*/);
  }

  protected static final int POL_4_DFDE_DED_AMT_LEN = 5;
  /** serializePol4DfdeDedAmt */
  protected void serializePol4DfdeDedAmt(long pol4DfdeDedAmt) {
    putNumber(
        beginPol4DfdeDedAmt,
        pol4DfdeDedAmt,
        POL_4_DFDE_DED_AMT_LEN,
        false /*isSigned?*/,
        true /*signTrailing?*/,
        false /*storeSignSeparate?*/);
    localPol4DfdeDedAmtCounter = shareString.getSerializedField().getModifiedCounter();
  }
  /** serializePol4DfdeDedAmt */
  protected long serializePol4DfdeDedAmt(char[] value) {
    long pol4DfdeDedAmt;
    if (value.length > 0 && value.length != 5) value = new String(value).trim().toCharArray();
    if (value.length < 5) value = pad(5, value, ' ', LEFT_PAD);
    else if (value.length > 5) value = substring(value, 0, 5);
    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
    pol4DfdeDedAmt =
        convertString2Number(
            value, false /*isSigned?*/, true /*signTrailing?*/, false /*storeSignSeparate?*/);
    replaceValue(padNumber(5, value, false /*isSigned?*/), beginPol4DfdeDedAmt, 5);
    localPol4DfdeDedAmtCounter = shareString.getSerializedField().getModifiedCounter();
    return pol4DfdeDedAmt;
  }

  protected long checkPol4DfdeDedAmtMaxLimit(long number) {

    return checkMaxLimit(number, MAX_100K /*limit*/, false /*isSigned*/);
  }
  /**
   * refreshPol4DfdeDedAmt is used to refresh the latest value of a variable from the Serialized
   * String the most common reason to serialize an Object as a string in to write to a file. There
   * can be several other reasons for serialization as well
   */
  public long refreshPol4DfdeDedAmt() throws CFException {
    try {
      return (getLongNumber(
          beginPol4DfdeDedAmt,
          POL_4_DFDE_DED_AMT_LEN,
          false /*isSigned*/,
          true /*isSignTrailing*/,
          false /*isSignStoredSeparate*/));
    } catch (Exception ex) {
      throw getSoc7ABend("pol4DfdeDedAmt", beginPol4DfdeDedAmt, POL_4_DFDE_DED_AMT_LEN);
    }
  }

  int localPol4DfdeDedCaroCdCounter = -1;

  public boolean isPol4DfdeDedCaroCdModified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localPol4DfdeDedCaroCdCounter != sharedCounter;
    localPol4DfdeDedCaroCdCounter = sharedCounter;
    return hasModified;
  }

  /**
   * Returns String value of pol4DfdeDedCaroCd
   *
   * @return pol4DfdeDedCaroCd
   */
  public char[] getPol4DfdeDedCaroCdString() {
    return getCharArray(beginPol4DfdeDedCaroCd, POL_4_DFDE_DED_CARO_CD_LEN);
  }

  /**
   * This method allows testing if there is a numeric value stored in the serialized String
   *
   * @return true if numeric value is stored in the string
   */
  public boolean pol4DfdeDedCaroCdIsNumeric() {
    return isNumeric(
        beginPol4DfdeDedCaroCd,
        beginPol4DfdeDedCaroCd + POL_4_DFDE_DED_CARO_CD_LEN,
        false /*Signed*/,
        true /*isSign trailing*/,
        false /*isSignStoredSeparately*/);
  }

  protected static final int POL_4_DFDE_DED_CARO_CD_LEN = 1;
  /** serializePol4DfdeDedCaroCd */
  protected void serializePol4DfdeDedCaroCd(int pol4DfdeDedCaroCd) {
    putNumber(
        beginPol4DfdeDedCaroCd,
        pol4DfdeDedCaroCd,
        POL_4_DFDE_DED_CARO_CD_LEN,
        false /*isSigned?*/,
        true /*signTrailing?*/,
        false /*storeSignSeparate?*/);
    localPol4DfdeDedCaroCdCounter = shareString.getSerializedField().getModifiedCounter();
  }
  /** serializePol4DfdeDedCaroCd */
  protected int serializePol4DfdeDedCaroCd(char[] value) {
    int pol4DfdeDedCaroCd;
    if (value.length > 0 && value.length != 1) value = new String(value).trim().toCharArray();
    if (value.length < 1) value = pad(1, value, ' ', LEFT_PAD);
    else if (value.length > 1) value = substring(value, 0, 1);
    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
    pol4DfdeDedCaroCd =
        (int)
            convertString2Number(
                value, false /*isSigned?*/, true /*signTrailing?*/, false /*storeSignSeparate?*/);
    replaceValue(padNumber(1, value, false /*isSigned?*/), beginPol4DfdeDedCaroCd, 1);
    localPol4DfdeDedCaroCdCounter = shareString.getSerializedField().getModifiedCounter();
    return pol4DfdeDedCaroCd;
  }

  protected int checkPol4DfdeDedCaroCdMaxLimit(long number) {

    return (int) checkMaxLimit(number, MAX_10 /*limit*/, false /*isSigned*/);
  }
  /**
   * refreshPol4DfdeDedCaroCd is used to refresh the latest value of a variable from the Serialized
   * String the most common reason to serialize an Object as a string in to write to a file. There
   * can be several other reasons for serialization as well
   */
  public int refreshPol4DfdeDedCaroCd() throws CFException {
    try {
      return (getIntNumber(
          beginPol4DfdeDedCaroCd,
          POL_4_DFDE_DED_CARO_CD_LEN,
          false /*isSigned*/,
          true /*isSignTrailing*/,
          false /*isSignStoredSeparate*/));
    } catch (Exception ex) {
      throw getSoc7ABend("pol4DfdeDedCaroCd", beginPol4DfdeDedCaroCd, POL_4_DFDE_DED_CARO_CD_LEN);
    }
  }

  int localPol4DfdeDedCdCounter = -1;

  public boolean isPol4DfdeDedCdModified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localPol4DfdeDedCdCounter != sharedCounter;
    localPol4DfdeDedCdCounter = sharedCounter;
    return hasModified;
  }

  /**
   * Returns String value of pol4DfdeDedCd
   *
   * @return pol4DfdeDedCd
   */
  public char[] getPol4DfdeDedCdString() {
    return getCharArray(beginPol4DfdeDedCd, POL_4_DFDE_DED_CD_LEN);
  }

  /**
   * This method allows testing if there is a numeric value stored in the serialized String
   *
   * @return true if numeric value is stored in the string
   */
  public boolean pol4DfdeDedCdIsNumeric() {
    return isNumeric(
        beginPol4DfdeDedCd,
        beginPol4DfdeDedCd + POL_4_DFDE_DED_CD_LEN,
        false /*Signed*/,
        true /*isSign trailing*/,
        false /*isSignStoredSeparately*/);
  }

  protected static final int POL_4_DFDE_DED_CD_LEN = 1;
  /** serializePol4DfdeDedCd */
  protected void serializePol4DfdeDedCd(int pol4DfdeDedCd) {
    putNumber(
        beginPol4DfdeDedCd,
        pol4DfdeDedCd,
        POL_4_DFDE_DED_CD_LEN,
        false /*isSigned?*/,
        true /*signTrailing?*/,
        false /*storeSignSeparate?*/);
    localPol4DfdeDedCdCounter = shareString.getSerializedField().getModifiedCounter();
  }
  /** serializePol4DfdeDedCd */
  protected int serializePol4DfdeDedCd(char[] value) {
    int pol4DfdeDedCd;
    if (value.length > 0 && value.length != 1) value = new String(value).trim().toCharArray();
    if (value.length < 1) value = pad(1, value, ' ', LEFT_PAD);
    else if (value.length > 1) value = substring(value, 0, 1);
    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
    pol4DfdeDedCd =
        (int)
            convertString2Number(
                value, false /*isSigned?*/, true /*signTrailing?*/, false /*storeSignSeparate?*/);
    replaceValue(padNumber(1, value, false /*isSigned?*/), beginPol4DfdeDedCd, 1);
    localPol4DfdeDedCdCounter = shareString.getSerializedField().getModifiedCounter();
    return pol4DfdeDedCd;
  }

  protected int checkPol4DfdeDedCdMaxLimit(long number) {

    return (int) checkMaxLimit(number, MAX_10 /*limit*/, false /*isSigned*/);
  }
  /**
   * refreshPol4DfdeDedCd is used to refresh the latest value of a variable from the Serialized
   * String the most common reason to serialize an Object as a string in to write to a file. There
   * can be several other reasons for serialization as well
   */
  public int refreshPol4DfdeDedCd() throws CFException {
    try {
      return (getIntNumber(
          beginPol4DfdeDedCd,
          POL_4_DFDE_DED_CD_LEN,
          false /*isSigned*/,
          true /*isSignTrailing*/,
          false /*isSignStoredSeparate*/));
    } catch (Exception ex) {
      throw getSoc7ABend("pol4DfdeDedCd", beginPol4DfdeDedCd, POL_4_DFDE_DED_CD_LEN);
    }
  }

  int localPol4DfdeDedMbrDescCounter = -1;

  public boolean isPol4DfdeDedMbrDescModified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localPol4DfdeDedMbrDescCounter != sharedCounter;
    localPol4DfdeDedMbrDescCounter = sharedCounter;
    return hasModified;
  }

  protected static final int POL_4_DFDE_DED_MBR_DESC_LEN = 6;
  /** serialize this Pol4DfdeDedMbrDesc */
  protected void serializePol4DfdeDedMbrDesc(char[] pol4DfdeDedMbrDesc) {
    shareString.getSerializedField().incrementCounter();
    arraycopy(
        pol4DfdeDedMbrDesc,
        0,
        getStringValue(),
        beginPol4DfdeDedMbrDesc,
        POL_4_DFDE_DED_MBR_DESC_LEN);
    localPol4DfdeDedMbrDescCounter = shareString.getSerializedField().getModifiedCounter();
  }

  protected char[] checkPol4DfdeDedMbrDescConstraints(char[] value) {
    return super.checkConstraints(value, 6, false, false);
  }
  /**
   * refreshPol4DfdeDedMbrDesc is used to refresh the latest value of a variable from the Serialized
   * String the most common reason to serialize an Object as a string in to write to a file. There
   * can be several other reasons for serialization as well
   */
  public char[] refreshPol4DfdeDedMbrDesc() {
    return (substring(
        getStringValue(),
        beginPol4DfdeDedMbrDesc,
        beginPol4DfdeDedMbrDesc + POL_4_DFDE_DED_MBR_DESC_LEN));
  }

  int localPol4DfdeDedMultFctCounter = -1;

  public boolean isPol4DfdeDedMultFctModified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localPol4DfdeDedMultFctCounter != sharedCounter;
    localPol4DfdeDedMultFctCounter = sharedCounter;
    return hasModified;
  }

  /**
   * Returns String value of pol4DfdeDedMultFct
   *
   * @return pol4DfdeDedMultFct
   */
  public char[] getPol4DfdeDedMultFctString() {
    return getCharArray(beginPol4DfdeDedMultFct, POL_4_DFDE_DED_MULT_FCT_LEN);
  }

  /**
   * This method allows testing if there is a numeric value stored in the serialized String
   *
   * @return true if numeric value is stored in the string
   */
  public boolean pol4DfdeDedMultFctIsNumeric() {
    return isNumeric(
        beginPol4DfdeDedMultFct,
        beginPol4DfdeDedMultFct + POL_4_DFDE_DED_MULT_FCT_LEN,
        false /*Signed*/,
        true /*isSign trailing*/,
        false /*isSignStoredSeparately*/);
  }

  protected static final int POL_4_DFDE_DED_MULT_FCT_LEN = 1;
  /** serializePol4DfdeDedMultFct */
  protected void serializePol4DfdeDedMultFct(int pol4DfdeDedMultFct) {
    putNumber(
        beginPol4DfdeDedMultFct,
        pol4DfdeDedMultFct,
        POL_4_DFDE_DED_MULT_FCT_LEN,
        false /*isSigned?*/,
        true /*signTrailing?*/,
        false /*storeSignSeparate?*/);
    localPol4DfdeDedMultFctCounter = shareString.getSerializedField().getModifiedCounter();
  }
  /** serializePol4DfdeDedMultFct */
  protected int serializePol4DfdeDedMultFct(char[] value) {
    int pol4DfdeDedMultFct;
    if (value.length > 0 && value.length != 1) value = new String(value).trim().toCharArray();
    if (value.length < 1) value = pad(1, value, ' ', LEFT_PAD);
    else if (value.length > 1) value = substring(value, 0, 1);
    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
    pol4DfdeDedMultFct =
        (int)
            convertString2Number(
                value, false /*isSigned?*/, true /*signTrailing?*/, false /*storeSignSeparate?*/);
    replaceValue(padNumber(1, value, false /*isSigned?*/), beginPol4DfdeDedMultFct, 1);
    localPol4DfdeDedMultFctCounter = shareString.getSerializedField().getModifiedCounter();
    return pol4DfdeDedMultFct;
  }

  protected int checkPol4DfdeDedMultFctMaxLimit(long number) {

    return (int) checkMaxLimit(number, MAX_10 /*limit*/, false /*isSigned*/);
  }
  /**
   * refreshPol4DfdeDedMultFct is used to refresh the latest value of a variable from the Serialized
   * String the most common reason to serialize an Object as a string in to write to a file. There
   * can be several other reasons for serialization as well
   */
  public int refreshPol4DfdeDedMultFct() throws CFException {
    try {
      return (getIntNumber(
          beginPol4DfdeDedMultFct,
          POL_4_DFDE_DED_MULT_FCT_LEN,
          false /*isSigned*/,
          true /*isSignTrailing*/,
          false /*isSignStoredSeparate*/));
    } catch (Exception ex) {
      throw getSoc7ABend(
          "pol4DfdeDedMultFct", beginPol4DfdeDedMultFct, POL_4_DFDE_DED_MULT_FCT_LEN);
    }
  }

  int localPol4DfdeDedMultSalryPctCounter = -1;

  public boolean isPol4DfdeDedMultSalryPctModified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localPol4DfdeDedMultSalryPctCounter != sharedCounter;
    localPol4DfdeDedMultSalryPctCounter = sharedCounter;
    return hasModified;
  }

  public boolean pol4DfdeDedMultSalryPctIsNumeric() {
    return decimalIsNumeric(
        beginPol4DfdeDedMultSalryPct,
        POL_4_DFDE_DED_MULT_SALRY_PCT_LEN); // check Packed Decimal field to see if it contains
                                            // valid Number
  }
  /**
   * This method returns packed Decimal String in the mainframe format
   *
   * @return char[]
   */
  public char[] pol4DfdeDedMultSalryPctString() {
    return getPackedString(beginPol4DfdeDedMultSalryPct, POL_4_DFDE_DED_MULT_SALRY_PCT_LEN);
  }

  protected static final int POL_4_DFDE_DED_MULT_SALRY_PCT_LEN = 2;
  protected static final int POL_4_DFDE_DED_MULT_SALRY_PCT_SCALE = 2;
  /** serializePol4DfdeDedMultSalryPct */
  protected void serializePol4DfdeDedMultSalryPct(BigDecimal pol4DfdeDedMultSalryPct) {
    putDecimal(
        beginPol4DfdeDedMultSalryPct,
        pol4DfdeDedMultSalryPct,
        POL_4_DFDE_DED_MULT_SALRY_PCT_LEN,
        POL_4_DFDE_DED_MULT_SALRY_PCT_SCALE,
        true);
    localPol4DfdeDedMultSalryPctCounter = shareString.getSerializedField().getModifiedCounter();
  }

  protected BigDecimal checkPol4DfdeDedMultSalryPctMaxLimit(BigDecimal number) {
    return checkMaxLimit(number, 2 /*scale*/, 3 /*precision*/);
  }
  /**
   * refreshPol4DfdeDedMultSalryPct is used to refresh the latest value of a variable from the
   * Serialized String the most common reason to serialize an Object as a string in to write to a
   * file. There can be several other reasons for serialization as well
   */
  public BigDecimal refreshPol4DfdeDedMultSalryPct() throws CFException {
    try {
      return (getDecimal(
          beginPol4DfdeDedMultSalryPct,
          POL_4_DFDE_DED_MULT_SALRY_PCT_LEN,
          POL_4_DFDE_DED_MULT_SALRY_PCT_SCALE));
    } catch (Exception ex) {
      throw getSoc7ABend(
          "pol4DfdeDedMultSalryPct",
          beginPol4DfdeDedMultSalryPct,
          POL_4_DFDE_DED_MULT_SALRY_PCT_LEN);
    }
  }

  int localPol4DfdeOopMultFctCounter = -1;

  public boolean isPol4DfdeOopMultFctModified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localPol4DfdeOopMultFctCounter != sharedCounter;
    localPol4DfdeOopMultFctCounter = sharedCounter;
    return hasModified;
  }

  public boolean pol4DfdeOopMultFctIsNumeric() {
    return decimalIsNumeric(
        beginPol4DfdeOopMultFct,
        POL_4_DFDE_OOP_MULT_FCT_LEN); // check Packed Decimal field to see if it contains valid
                                      // Number
  }
  /**
   * This method returns packed Decimal String in the mainframe format
   *
   * @return char[]
   */
  public char[] pol4DfdeOopMultFctString() {
    return getPackedString(beginPol4DfdeOopMultFct, POL_4_DFDE_OOP_MULT_FCT_LEN);
  }

  protected static final int POL_4_DFDE_OOP_MULT_FCT_LEN = 2;
  protected static final int POL_4_DFDE_OOP_MULT_FCT_SCALE = 2;
  /** serializePol4DfdeOopMultFct */
  protected void serializePol4DfdeOopMultFct(BigDecimal pol4DfdeOopMultFct) {
    putDecimal(
        beginPol4DfdeOopMultFct,
        pol4DfdeOopMultFct,
        POL_4_DFDE_OOP_MULT_FCT_LEN,
        POL_4_DFDE_OOP_MULT_FCT_SCALE,
        true);
    localPol4DfdeOopMultFctCounter = shareString.getSerializedField().getModifiedCounter();
  }

  protected BigDecimal checkPol4DfdeOopMultFctMaxLimit(BigDecimal number) {
    return checkMaxLimit(number, 2 /*scale*/, 3 /*precision*/);
  }
  /**
   * refreshPol4DfdeOopMultFct is used to refresh the latest value of a variable from the Serialized
   * String the most common reason to serialize an Object as a string in to write to a file. There
   * can be several other reasons for serialization as well
   */
  public BigDecimal refreshPol4DfdeOopMultFct() throws CFException {
    try {
      return (getDecimal(
          beginPol4DfdeOopMultFct, POL_4_DFDE_OOP_MULT_FCT_LEN, POL_4_DFDE_OOP_MULT_FCT_SCALE));
    } catch (Exception ex) {
      throw getSoc7ABend(
          "pol4DfdeOopMultFct", beginPol4DfdeOopMultFct, POL_4_DFDE_OOP_MULT_FCT_LEN);
    }
  }

  int localPol4DedEePls1AmtCounter = -1;

  public boolean isPol4DedEePls1AmtModified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localPol4DedEePls1AmtCounter != sharedCounter;
    localPol4DedEePls1AmtCounter = sharedCounter;
    return hasModified;
  }

  /**
   * Returns String value of pol4DedEePls1Amt
   *
   * @return pol4DedEePls1Amt
   */
  public char[] getPol4DedEePls1AmtString() {
    return getCharArray(beginPol4DedEePls1Amt, POL_4_DED_EE_PLS_1_AMT_LEN);
  }

  /**
   * This method allows testing if there is a numeric value stored in the serialized String
   *
   * @return true if numeric value is stored in the string
   */
  public boolean pol4DedEePls1AmtIsNumeric() {
    return isNumeric(
        beginPol4DedEePls1Amt,
        beginPol4DedEePls1Amt + POL_4_DED_EE_PLS_1_AMT_LEN,
        false /*Signed*/,
        true /*isSign trailing*/,
        false /*isSignStoredSeparately*/);
  }

  protected static final int POL_4_DED_EE_PLS_1_AMT_LEN = 5;
  /** serializePol4DedEePls1Amt */
  protected void serializePol4DedEePls1Amt(long pol4DedEePls1Amt) {
    putNumber(
        beginPol4DedEePls1Amt,
        pol4DedEePls1Amt,
        POL_4_DED_EE_PLS_1_AMT_LEN,
        false /*isSigned?*/,
        true /*signTrailing?*/,
        false /*storeSignSeparate?*/);
    localPol4DedEePls1AmtCounter = shareString.getSerializedField().getModifiedCounter();
  }
  /** serializePol4DedEePls1Amt */
  protected long serializePol4DedEePls1Amt(char[] value) {
    long pol4DedEePls1Amt;
    if (value.length > 0 && value.length != 5) value = new String(value).trim().toCharArray();
    if (value.length < 5) value = pad(5, value, ' ', LEFT_PAD);
    else if (value.length > 5) value = substring(value, 0, 5);
    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
    pol4DedEePls1Amt =
        convertString2Number(
            value, false /*isSigned?*/, true /*signTrailing?*/, false /*storeSignSeparate?*/);
    replaceValue(padNumber(5, value, false /*isSigned?*/), beginPol4DedEePls1Amt, 5);
    localPol4DedEePls1AmtCounter = shareString.getSerializedField().getModifiedCounter();
    return pol4DedEePls1Amt;
  }

  protected long checkPol4DedEePls1AmtMaxLimit(long number) {

    return checkMaxLimit(number, MAX_100K /*limit*/, false /*isSigned*/);
  }
  /**
   * refreshPol4DedEePls1Amt is used to refresh the latest value of a variable from the Serialized
   * String the most common reason to serialize an Object as a string in to write to a file. There
   * can be several other reasons for serialization as well
   */
  public long refreshPol4DedEePls1Amt() throws CFException {
    try {
      return (getLongNumber(
          beginPol4DedEePls1Amt,
          POL_4_DED_EE_PLS_1_AMT_LEN,
          false /*isSigned*/,
          true /*isSignTrailing*/,
          false /*isSignStoredSeparate*/));
    } catch (Exception ex) {
      throw getSoc7ABend("pol4DedEePls1Amt", beginPol4DedEePls1Amt, POL_4_DED_EE_PLS_1_AMT_LEN);
    }
  }

  int localPol4DedEeSpoAmtCounter = -1;

  public boolean isPol4DedEeSpoAmtModified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localPol4DedEeSpoAmtCounter != sharedCounter;
    localPol4DedEeSpoAmtCounter = sharedCounter;
    return hasModified;
  }

  /**
   * Returns String value of pol4DedEeSpoAmt
   *
   * @return pol4DedEeSpoAmt
   */
  public char[] getPol4DedEeSpoAmtString() {
    return getCharArray(beginPol4DedEeSpoAmt, POL_4_DED_EE_SPO_AMT_LEN);
  }

  /**
   * This method allows testing if there is a numeric value stored in the serialized String
   *
   * @return true if numeric value is stored in the string
   */
  public boolean pol4DedEeSpoAmtIsNumeric() {
    return isNumeric(
        beginPol4DedEeSpoAmt,
        beginPol4DedEeSpoAmt + POL_4_DED_EE_SPO_AMT_LEN,
        false /*Signed*/,
        true /*isSign trailing*/,
        false /*isSignStoredSeparately*/);
  }

  protected static final int POL_4_DED_EE_SPO_AMT_LEN = 5;
  /** serializePol4DedEeSpoAmt */
  protected void serializePol4DedEeSpoAmt(long pol4DedEeSpoAmt) {
    putNumber(
        beginPol4DedEeSpoAmt,
        pol4DedEeSpoAmt,
        POL_4_DED_EE_SPO_AMT_LEN,
        false /*isSigned?*/,
        true /*signTrailing?*/,
        false /*storeSignSeparate?*/);
    localPol4DedEeSpoAmtCounter = shareString.getSerializedField().getModifiedCounter();
  }
  /** serializePol4DedEeSpoAmt */
  protected long serializePol4DedEeSpoAmt(char[] value) {
    long pol4DedEeSpoAmt;
    if (value.length > 0 && value.length != 5) value = new String(value).trim().toCharArray();
    if (value.length < 5) value = pad(5, value, ' ', LEFT_PAD);
    else if (value.length > 5) value = substring(value, 0, 5);
    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
    pol4DedEeSpoAmt =
        convertString2Number(
            value, false /*isSigned?*/, true /*signTrailing?*/, false /*storeSignSeparate?*/);
    replaceValue(padNumber(5, value, false /*isSigned?*/), beginPol4DedEeSpoAmt, 5);
    localPol4DedEeSpoAmtCounter = shareString.getSerializedField().getModifiedCounter();
    return pol4DedEeSpoAmt;
  }

  protected long checkPol4DedEeSpoAmtMaxLimit(long number) {

    return checkMaxLimit(number, MAX_100K /*limit*/, false /*isSigned*/);
  }
  /**
   * refreshPol4DedEeSpoAmt is used to refresh the latest value of a variable from the Serialized
   * String the most common reason to serialize an Object as a string in to write to a file. There
   * can be several other reasons for serialization as well
   */
  public long refreshPol4DedEeSpoAmt() throws CFException {
    try {
      return (getLongNumber(
          beginPol4DedEeSpoAmt,
          POL_4_DED_EE_SPO_AMT_LEN,
          false /*isSigned*/,
          true /*isSignTrailing*/,
          false /*isSignStoredSeparate*/));
    } catch (Exception ex) {
      throw getSoc7ABend("pol4DedEeSpoAmt", beginPol4DedEeSpoAmt, POL_4_DED_EE_SPO_AMT_LEN);
    }
  }

  int localPol4DedEeChrgAmtCounter = -1;

  public boolean isPol4DedEeChrgAmtModified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localPol4DedEeChrgAmtCounter != sharedCounter;
    localPol4DedEeChrgAmtCounter = sharedCounter;
    return hasModified;
  }

  /**
   * Returns String value of pol4DedEeChrgAmt
   *
   * @return pol4DedEeChrgAmt
   */
  public char[] getPol4DedEeChrgAmtString() {
    return getCharArray(beginPol4DedEeChrgAmt, POL_4_DED_EE_CHRG_AMT_LEN);
  }

  /**
   * This method allows testing if there is a numeric value stored in the serialized String
   *
   * @return true if numeric value is stored in the string
   */
  public boolean pol4DedEeChrgAmtIsNumeric() {
    return isNumeric(
        beginPol4DedEeChrgAmt,
        beginPol4DedEeChrgAmt + POL_4_DED_EE_CHRG_AMT_LEN,
        false /*Signed*/,
        true /*isSign trailing*/,
        false /*isSignStoredSeparately*/);
  }

  protected static final int POL_4_DED_EE_CHRG_AMT_LEN = 5;
  /** serializePol4DedEeChrgAmt */
  protected void serializePol4DedEeChrgAmt(long pol4DedEeChrgAmt) {
    putNumber(
        beginPol4DedEeChrgAmt,
        pol4DedEeChrgAmt,
        POL_4_DED_EE_CHRG_AMT_LEN,
        false /*isSigned?*/,
        true /*signTrailing?*/,
        false /*storeSignSeparate?*/);
    localPol4DedEeChrgAmtCounter = shareString.getSerializedField().getModifiedCounter();
  }
  /** serializePol4DedEeChrgAmt */
  protected long serializePol4DedEeChrgAmt(char[] value) {
    long pol4DedEeChrgAmt;
    if (value.length > 0 && value.length != 5) value = new String(value).trim().toCharArray();
    if (value.length < 5) value = pad(5, value, ' ', LEFT_PAD);
    else if (value.length > 5) value = substring(value, 0, 5);
    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
    pol4DedEeChrgAmt =
        convertString2Number(
            value, false /*isSigned?*/, true /*signTrailing?*/, false /*storeSignSeparate?*/);
    replaceValue(padNumber(5, value, false /*isSigned?*/), beginPol4DedEeChrgAmt, 5);
    localPol4DedEeChrgAmtCounter = shareString.getSerializedField().getModifiedCounter();
    return pol4DedEeChrgAmt;
  }

  protected long checkPol4DedEeChrgAmtMaxLimit(long number) {

    return checkMaxLimit(number, MAX_100K /*limit*/, false /*isSigned*/);
  }
  /**
   * refreshPol4DedEeChrgAmt is used to refresh the latest value of a variable from the Serialized
   * String the most common reason to serialize an Object as a string in to write to a file. There
   * can be several other reasons for serialization as well
   */
  public long refreshPol4DedEeChrgAmt() throws CFException {
    try {
      return (getLongNumber(
          beginPol4DedEeChrgAmt,
          POL_4_DED_EE_CHRG_AMT_LEN,
          false /*isSigned*/,
          true /*isSignTrailing*/,
          false /*isSignStoredSeparate*/));
    } catch (Exception ex) {
      throw getSoc7ABend("pol4DedEeChrgAmt", beginPol4DedEeChrgAmt, POL_4_DED_EE_CHRG_AMT_LEN);
    }
  }
}
