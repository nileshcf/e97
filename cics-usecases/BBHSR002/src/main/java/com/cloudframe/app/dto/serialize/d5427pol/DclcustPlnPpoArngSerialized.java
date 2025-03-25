package com.cloudframe.app.dto.serialize.d5427pol;

/**
 * The class DclcustPlnPpoArngSerialized is used to define offsets in order to serialize in a fixed
 * String
 *
 * @author CloudFrame Inc. created on 2025-03-25 at 08:31. using version 5.0.0.231
 */
import com.cloudframe.app.data.Field;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class DclcustPlnPpoArngSerialized extends Field {

  protected Logger logger = LoggerFactory.getLogger(DclcustPlnPpoArngSerialized.class);
  /*  Length of the field, if serialized as a String */
  protected static final int DCLCUST_PLN_PPO_ARNG_LENGTH = 38;
  /*  offset of each of Child Fields when serialized as a String */
  protected int beginPpoCovTypCd;
  protected int beginPpoPolNbr;
  protected int beginPpoPlnNbr;
  protected int beginPpoClssNbr;
  protected int beginPpoPlnSeqNbr;
  protected int beginPpoPpoArngSeqNbr;
  protected int beginPpoPrdctCd;
  protected int beginPpoMktTypCd;
  protected int beginPpoMktNbr;
  protected int beginPpoIpaId;
  protected int beginPpoPrefNtwkCd;
  protected int beginPpoAhpInd;

  /** Constructor for DclcustPlnPpoArngSerialized */
  public DclcustPlnPpoArngSerialized() {
    init(0);
  }

  /** initializes the field in DclcustPlnPpoArngSerialized */
  @Override
  protected void init(int begin) {
    setStartOffset(begin);
    setLength(DCLCUST_PLN_PPO_ARNG_LENGTH);
    /*  set the offset/position of each field when this object is serialized as String */
    beginPpoCovTypCd = getStartOffset() + 0; // set offset for serialization

    beginPpoPolNbr = getStartOffset() + 1; // set offset for serialization

    beginPpoPlnNbr = getStartOffset() + 7; // set offset for serialization

    beginPpoClssNbr = getStartOffset() + 11; // set offset for serialization

    beginPpoPlnSeqNbr = getStartOffset() + 15; // set offset for serialization

    beginPpoPpoArngSeqNbr = getStartOffset() + 17; // set offset for serialization

    beginPpoPrdctCd = getStartOffset() + 19; // set offset for serialization

    beginPpoMktTypCd = getStartOffset() + 22; // set offset for serialization

    beginPpoMktNbr = getStartOffset() + 24; // set offset for serialization

    beginPpoIpaId = getStartOffset() + 31; // set offset for serialization

    beginPpoPrefNtwkCd = getStartOffset() + 36; // set offset for serialization

    beginPpoAhpInd = getStartOffset() + 37; // set offset for serialization

    /*  end of offset */
  }

  int localPpoCovTypCdCounter = -1;

  public boolean isPpoCovTypCdModified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localPpoCovTypCdCounter != sharedCounter;
    localPpoCovTypCdCounter = sharedCounter;
    return hasModified;
  }

  protected static final int PPO_COV_TYP_CD_LEN = 1;
  /** serialize this PpoCovTypCd */
  protected void serializePpoCovTypCd(char[] ppoCovTypCd) {
    shareString.getSerializedField().incrementCounter();
    arraycopy(ppoCovTypCd, 0, getStringValue(), beginPpoCovTypCd, PPO_COV_TYP_CD_LEN);
    localPpoCovTypCdCounter = shareString.getSerializedField().getModifiedCounter();
  }

  protected char[] checkPpoCovTypCdConstraints(char[] value) {
    return super.checkConstraints(value, 1, false, false);
  }
  /**
   * refreshPpoCovTypCd is used to refresh the latest value of a variable from the Serialized String
   * the most common reason to serialize an Object as a string in to write to a file. There can be
   * several other reasons for serialization as well
   */
  public char[] refreshPpoCovTypCd() {
    return (substring(getStringValue(), beginPpoCovTypCd, beginPpoCovTypCd + PPO_COV_TYP_CD_LEN));
  }

  int localPpoPolNbrCounter = -1;

  public boolean isPpoPolNbrModified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localPpoPolNbrCounter != sharedCounter;
    localPpoPolNbrCounter = sharedCounter;
    return hasModified;
  }

  protected static final int PPO_POL_NBR_LEN = 6;
  /** serialize this PpoPolNbr */
  protected void serializePpoPolNbr(char[] ppoPolNbr) {
    shareString.getSerializedField().incrementCounter();
    arraycopy(ppoPolNbr, 0, getStringValue(), beginPpoPolNbr, PPO_POL_NBR_LEN);
    localPpoPolNbrCounter = shareString.getSerializedField().getModifiedCounter();
  }

  protected char[] checkPpoPolNbrConstraints(char[] value) {
    return super.checkConstraints(value, 6, false, false);
  }
  /**
   * refreshPpoPolNbr is used to refresh the latest value of a variable from the Serialized String
   * the most common reason to serialize an Object as a string in to write to a file. There can be
   * several other reasons for serialization as well
   */
  public char[] refreshPpoPolNbr() {
    return (substring(getStringValue(), beginPpoPolNbr, beginPpoPolNbr + PPO_POL_NBR_LEN));
  }

  int localPpoPlnNbrCounter = -1;

  public boolean isPpoPlnNbrModified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localPpoPlnNbrCounter != sharedCounter;
    localPpoPlnNbrCounter = sharedCounter;
    return hasModified;
  }

  protected static final int PPO_PLN_NBR_LEN = 4;
  /** serialize this PpoPlnNbr */
  protected void serializePpoPlnNbr(char[] ppoPlnNbr) {
    shareString.getSerializedField().incrementCounter();
    arraycopy(ppoPlnNbr, 0, getStringValue(), beginPpoPlnNbr, PPO_PLN_NBR_LEN);
    localPpoPlnNbrCounter = shareString.getSerializedField().getModifiedCounter();
  }

  protected char[] checkPpoPlnNbrConstraints(char[] value) {
    return super.checkConstraints(value, 4, false, false);
  }
  /**
   * refreshPpoPlnNbr is used to refresh the latest value of a variable from the Serialized String
   * the most common reason to serialize an Object as a string in to write to a file. There can be
   * several other reasons for serialization as well
   */
  public char[] refreshPpoPlnNbr() {
    return (substring(getStringValue(), beginPpoPlnNbr, beginPpoPlnNbr + PPO_PLN_NBR_LEN));
  }

  int localPpoClssNbrCounter = -1;

  public boolean isPpoClssNbrModified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localPpoClssNbrCounter != sharedCounter;
    localPpoClssNbrCounter = sharedCounter;
    return hasModified;
  }

  protected static final int PPO_CLSS_NBR_LEN = 4;
  /** serialize this PpoClssNbr */
  protected void serializePpoClssNbr(char[] ppoClssNbr) {
    shareString.getSerializedField().incrementCounter();
    arraycopy(ppoClssNbr, 0, getStringValue(), beginPpoClssNbr, PPO_CLSS_NBR_LEN);
    localPpoClssNbrCounter = shareString.getSerializedField().getModifiedCounter();
  }

  protected char[] checkPpoClssNbrConstraints(char[] value) {
    return super.checkConstraints(value, 4, false, false);
  }
  /**
   * refreshPpoClssNbr is used to refresh the latest value of a variable from the Serialized String
   * the most common reason to serialize an Object as a string in to write to a file. There can be
   * several other reasons for serialization as well
   */
  public char[] refreshPpoClssNbr() {
    return (substring(getStringValue(), beginPpoClssNbr, beginPpoClssNbr + PPO_CLSS_NBR_LEN));
  }

  int localPpoPlnSeqNbrCounter = -1;

  public boolean isPpoPlnSeqNbrModified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localPpoPlnSeqNbrCounter != sharedCounter;
    localPpoPlnSeqNbrCounter = sharedCounter;
    return hasModified;
  }

  protected static final int PPO_PLN_SEQ_NBR_LEN = 2;
  /** serializePpoPlnSeqNbr */
  protected void serializePpoPlnSeqNbr(short ppoPlnSeqNbr) {
    replaceValue( //  save the value as string
        getBinaryString(ppoPlnSeqNbr, PPO_PLN_SEQ_NBR_LEN), beginPpoPlnSeqNbr, PPO_PLN_SEQ_NBR_LEN);
    localPpoPlnSeqNbrCounter = shareString.getSerializedField().getModifiedCounter();
  }

  protected short checkPpoPlnSeqNbrMaxLimit(long number) {
    return (short) checkMaxLimit(number, true /*isSigned*/, 2 /*dataLen*/);
  }
  /**
   * refreshPpoPlnSeqNbr is used to refresh the latest value of a variable from the Serialized
   * String the most common reason to serialize an Object as a string in to write to a file. There
   * can be several other reasons for serialization as well
   */
  public short refreshPpoPlnSeqNbr() {
    return (getShort(beginPpoPlnSeqNbr));
  }

  int localPpoPpoArngSeqNbrCounter = -1;

  public boolean isPpoPpoArngSeqNbrModified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localPpoPpoArngSeqNbrCounter != sharedCounter;
    localPpoPpoArngSeqNbrCounter = sharedCounter;
    return hasModified;
  }

  protected static final int PPO_PPO_ARNG_SEQ_NBR_LEN = 2;
  /** serializePpoPpoArngSeqNbr */
  protected void serializePpoPpoArngSeqNbr(short ppoPpoArngSeqNbr) {
    replaceValue( //  save the value as string
        getBinaryString(ppoPpoArngSeqNbr, PPO_PPO_ARNG_SEQ_NBR_LEN),
        beginPpoPpoArngSeqNbr,
        PPO_PPO_ARNG_SEQ_NBR_LEN);
    localPpoPpoArngSeqNbrCounter = shareString.getSerializedField().getModifiedCounter();
  }

  protected short checkPpoPpoArngSeqNbrMaxLimit(long number) {
    return (short) checkMaxLimit(number, true /*isSigned*/, 2 /*dataLen*/);
  }
  /**
   * refreshPpoPpoArngSeqNbr is used to refresh the latest value of a variable from the Serialized
   * String the most common reason to serialize an Object as a string in to write to a file. There
   * can be several other reasons for serialization as well
   */
  public short refreshPpoPpoArngSeqNbr() {
    return (getShort(beginPpoPpoArngSeqNbr));
  }

  int localPpoPrdctCdCounter = -1;

  public boolean isPpoPrdctCdModified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localPpoPrdctCdCounter != sharedCounter;
    localPpoPrdctCdCounter = sharedCounter;
    return hasModified;
  }

  protected static final int PPO_PRDCT_CD_LEN = 3;
  /** serialize this PpoPrdctCd */
  protected void serializePpoPrdctCd(char[] ppoPrdctCd) {
    shareString.getSerializedField().incrementCounter();
    arraycopy(ppoPrdctCd, 0, getStringValue(), beginPpoPrdctCd, PPO_PRDCT_CD_LEN);
    localPpoPrdctCdCounter = shareString.getSerializedField().getModifiedCounter();
  }

  protected char[] checkPpoPrdctCdConstraints(char[] value) {
    return super.checkConstraints(value, 3, false, false);
  }
  /**
   * refreshPpoPrdctCd is used to refresh the latest value of a variable from the Serialized String
   * the most common reason to serialize an Object as a string in to write to a file. There can be
   * several other reasons for serialization as well
   */
  public char[] refreshPpoPrdctCd() {
    return (substring(getStringValue(), beginPpoPrdctCd, beginPpoPrdctCd + PPO_PRDCT_CD_LEN));
  }

  int localPpoMktTypCdCounter = -1;

  public boolean isPpoMktTypCdModified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localPpoMktTypCdCounter != sharedCounter;
    localPpoMktTypCdCounter = sharedCounter;
    return hasModified;
  }

  protected static final int PPO_MKT_TYP_CD_LEN = 2;
  /** serialize this PpoMktTypCd */
  protected void serializePpoMktTypCd(char[] ppoMktTypCd) {
    shareString.getSerializedField().incrementCounter();
    arraycopy(ppoMktTypCd, 0, getStringValue(), beginPpoMktTypCd, PPO_MKT_TYP_CD_LEN);
    localPpoMktTypCdCounter = shareString.getSerializedField().getModifiedCounter();
  }

  protected char[] checkPpoMktTypCdConstraints(char[] value) {
    return super.checkConstraints(value, 2, false, false);
  }
  /**
   * refreshPpoMktTypCd is used to refresh the latest value of a variable from the Serialized String
   * the most common reason to serialize an Object as a string in to write to a file. There can be
   * several other reasons for serialization as well
   */
  public char[] refreshPpoMktTypCd() {
    return (substring(getStringValue(), beginPpoMktTypCd, beginPpoMktTypCd + PPO_MKT_TYP_CD_LEN));
  }

  int localPpoMktNbrCounter = -1;

  public boolean isPpoMktNbrModified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localPpoMktNbrCounter != sharedCounter;
    localPpoMktNbrCounter = sharedCounter;
    return hasModified;
  }

  protected static final int PPO_MKT_NBR_LEN = 7;
  /** serialize this PpoMktNbr */
  protected void serializePpoMktNbr(char[] ppoMktNbr) {
    shareString.getSerializedField().incrementCounter();
    arraycopy(ppoMktNbr, 0, getStringValue(), beginPpoMktNbr, PPO_MKT_NBR_LEN);
    localPpoMktNbrCounter = shareString.getSerializedField().getModifiedCounter();
  }

  protected char[] checkPpoMktNbrConstraints(char[] value) {
    return super.checkConstraints(value, 7, false, false);
  }
  /**
   * refreshPpoMktNbr is used to refresh the latest value of a variable from the Serialized String
   * the most common reason to serialize an Object as a string in to write to a file. There can be
   * several other reasons for serialization as well
   */
  public char[] refreshPpoMktNbr() {
    return (substring(getStringValue(), beginPpoMktNbr, beginPpoMktNbr + PPO_MKT_NBR_LEN));
  }

  int localPpoIpaIdCounter = -1;

  public boolean isPpoIpaIdModified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localPpoIpaIdCounter != sharedCounter;
    localPpoIpaIdCounter = sharedCounter;
    return hasModified;
  }

  protected static final int PPO_IPA_ID_LEN = 5;
  /** serialize this PpoIpaId */
  protected void serializePpoIpaId(char[] ppoIpaId) {
    shareString.getSerializedField().incrementCounter();
    arraycopy(ppoIpaId, 0, getStringValue(), beginPpoIpaId, PPO_IPA_ID_LEN);
    localPpoIpaIdCounter = shareString.getSerializedField().getModifiedCounter();
  }

  protected char[] checkPpoIpaIdConstraints(char[] value) {
    return super.checkConstraints(value, 5, false, false);
  }
  /**
   * refreshPpoIpaId is used to refresh the latest value of a variable from the Serialized String
   * the most common reason to serialize an Object as a string in to write to a file. There can be
   * several other reasons for serialization as well
   */
  public char[] refreshPpoIpaId() {
    return (substring(getStringValue(), beginPpoIpaId, beginPpoIpaId + PPO_IPA_ID_LEN));
  }

  int localPpoPrefNtwkCdCounter = -1;

  public boolean isPpoPrefNtwkCdModified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localPpoPrefNtwkCdCounter != sharedCounter;
    localPpoPrefNtwkCdCounter = sharedCounter;
    return hasModified;
  }

  protected static final int PPO_PREF_NTWK_CD_LEN = 1;
  /** serialize this PpoPrefNtwkCd */
  protected void serializePpoPrefNtwkCd(char[] ppoPrefNtwkCd) {
    shareString.getSerializedField().incrementCounter();
    arraycopy(ppoPrefNtwkCd, 0, getStringValue(), beginPpoPrefNtwkCd, PPO_PREF_NTWK_CD_LEN);
    localPpoPrefNtwkCdCounter = shareString.getSerializedField().getModifiedCounter();
  }

  protected char[] checkPpoPrefNtwkCdConstraints(char[] value) {
    return super.checkConstraints(value, 1, false, false);
  }
  /**
   * refreshPpoPrefNtwkCd is used to refresh the latest value of a variable from the Serialized
   * String the most common reason to serialize an Object as a string in to write to a file. There
   * can be several other reasons for serialization as well
   */
  public char[] refreshPpoPrefNtwkCd() {
    return (substring(
        getStringValue(), beginPpoPrefNtwkCd, beginPpoPrefNtwkCd + PPO_PREF_NTWK_CD_LEN));
  }

  int localPpoAhpIndCounter = -1;

  public boolean isPpoAhpIndModified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localPpoAhpIndCounter != sharedCounter;
    localPpoAhpIndCounter = sharedCounter;
    return hasModified;
  }

  protected static final int PPO_AHP_IND_LEN = 1;
  /** serialize this PpoAhpInd */
  protected void serializePpoAhpInd(char[] ppoAhpInd) {
    shareString.getSerializedField().incrementCounter();
    arraycopy(ppoAhpInd, 0, getStringValue(), beginPpoAhpInd, PPO_AHP_IND_LEN);
    localPpoAhpIndCounter = shareString.getSerializedField().getModifiedCounter();
  }

  protected char[] checkPpoAhpIndConstraints(char[] value) {
    return super.checkConstraints(value, 1, false, false);
  }
  /**
   * refreshPpoAhpInd is used to refresh the latest value of a variable from the Serialized String
   * the most common reason to serialize an Object as a string in to write to a file. There can be
   * several other reasons for serialization as well
   */
  public char[] refreshPpoAhpInd() {
    return (substring(getStringValue(), beginPpoAhpInd, beginPpoAhpInd + PPO_AHP_IND_LEN));
  }
}
