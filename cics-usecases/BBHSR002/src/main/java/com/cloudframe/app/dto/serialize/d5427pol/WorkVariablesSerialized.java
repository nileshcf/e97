package com.cloudframe.app.dto.serialize.d5427pol;

/**
 * The class WorkVariablesSerialized is used to define offsets in order to serialize in a fixed
 * String
 *
 * @author CloudFrame Inc. created on 2025-03-25 at 08:31. using version 5.0.0.231
 */
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class WorkVariablesSerialized extends Field {

  protected Logger logger = LoggerFactory.getLogger(WorkVariablesSerialized.class);
  /*  Length of the field, if serialized as a String */
  protected static final int WORK_VARIABLES_LENGTH = 267;
  /*  offset of each of Child Fields when serialized as a String */
  protected int beginStdFields;
  protected static final int STD_FIELDS_SIZE = 10;
  protected int beginLineSub;
  protected int beginDsmPgmName;
  protected int beginDfltChgPct;
  protected int beginPolicyNbr;
  protected int beginPolicyInd;
  protected int beginObligId;

  /** Constructor for WorkVariablesSerialized */
  public WorkVariablesSerialized() {
    init(0);
  }

  /** initializes the field in WorkVariablesSerialized */
  @Override
  protected void init(int begin) {
    setStartOffset(begin);
    setLength(WORK_VARIABLES_LENGTH);
    /*  set the offset/position of each field when this object is serialized as String */
    beginStdFields = getStartOffset() + 0; // set offset for serialization

    beginLineSub = getStartOffset() + 240; // set offset for serialization

    beginDsmPgmName = getStartOffset() + 248; // set offset for serialization

    beginDfltChgPct = getStartOffset() + 256; // set offset for serialization

    beginPolicyNbr = getStartOffset() + 258; // set offset for serialization

    beginPolicyInd = getStartOffset() + 264; // set offset for serialization

    beginObligId = getStartOffset() + 265; // set offset for serialization

    /*  end of offset */
  }

  int localLineSubCounter = -1;

  public boolean isLineSubModified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localLineSubCounter != sharedCounter;
    localLineSubCounter = sharedCounter;
    return hasModified;
  }

  protected static final int LINE_SUB_LEN = 4;
  /** serializeLineSub */
  protected void serializeLineSub(int lineSub) {
    replaceValue( //  save the value as string
        getBinaryString(lineSub, LINE_SUB_LEN), beginLineSub, LINE_SUB_LEN);
    localLineSubCounter = shareString.getSerializedField().getModifiedCounter();
  }

  protected int checkLineSubMaxLimit(long number) {
    return (int) checkMaxLimit(number, true /*isSigned*/, 4 /*dataLen*/);
  }
  /**
   * refreshLineSub is used to refresh the latest value of a variable from the Serialized String the
   * most common reason to serialize an Object as a string in to write to a file. There can be
   * several other reasons for serialization as well
   */
  public int refreshLineSub() {
    return (getInt(beginLineSub));
  }

  int localDsmPgmNameCounter = -1;

  public boolean isDsmPgmNameModified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localDsmPgmNameCounter != sharedCounter;
    localDsmPgmNameCounter = sharedCounter;
    return hasModified;
  }

  protected static final int DSM_PGM_NAME_LEN = 8;
  /** serialize this DsmPgmName */
  protected void serializeDsmPgmName(char[] dsmPgmName) {
    shareString.getSerializedField().incrementCounter();
    arraycopy(dsmPgmName, 0, getStringValue(), beginDsmPgmName, DSM_PGM_NAME_LEN);
    localDsmPgmNameCounter = shareString.getSerializedField().getModifiedCounter();
  }

  protected char[] checkDsmPgmNameConstraints(char[] value) {
    return super.checkConstraints(value, 8, false, false);
  }
  /**
   * refreshDsmPgmName is used to refresh the latest value of a variable from the Serialized String
   * the most common reason to serialize an Object as a string in to write to a file. There can be
   * several other reasons for serialization as well
   */
  public char[] refreshDsmPgmName() {
    return (substring(getStringValue(), beginDsmPgmName, beginDsmPgmName + DSM_PGM_NAME_LEN));
  }

  int localDfltChgPctCounter = -1;

  public boolean isDfltChgPctModified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localDfltChgPctCounter != sharedCounter;
    localDfltChgPctCounter = sharedCounter;
    return hasModified;
  }

  /**
   * Returns String value of dfltChgPct
   *
   * @return dfltChgPct
   */
  public char[] getDfltChgPctString() {
    return getCharArray(beginDfltChgPct, DFLT_CHG_PCT_LEN);
  }

  /**
   * This method allows testing if there is a numeric value stored in the serialized String
   *
   * @return true if numeric value is stored in the string
   */
  public boolean dfltChgPctIsNumeric() {
    return isNumeric(
        beginDfltChgPct,
        beginDfltChgPct + DFLT_CHG_PCT_LEN,
        false /*Signed*/,
        true /*isSign trailing*/,
        false /*isSignStoredSeparately*/);
  }

  protected static final int DFLT_CHG_PCT_LEN = 2;
  /** serializeDfltChgPct */
  protected void serializeDfltChgPct(int dfltChgPct) {
    putNumber(
        beginDfltChgPct,
        dfltChgPct,
        DFLT_CHG_PCT_LEN,
        false /*isSigned?*/,
        true /*signTrailing?*/,
        false /*storeSignSeparate?*/);
    localDfltChgPctCounter = shareString.getSerializedField().getModifiedCounter();
  }
  /** serializeDfltChgPct */
  protected int serializeDfltChgPct(char[] value) {
    int dfltChgPct;
    if (value.length > 0 && value.length != 2) value = new String(value).trim().toCharArray();
    if (value.length < 2) value = pad(2, value, ' ', LEFT_PAD);
    else if (value.length > 2) value = substring(value, 0, 2);
    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
    dfltChgPct =
        (int)
            convertString2Number(
                value, false /*isSigned?*/, true /*signTrailing?*/, false /*storeSignSeparate?*/);
    replaceValue(padNumber(2, value, false /*isSigned?*/), beginDfltChgPct, 2);
    localDfltChgPctCounter = shareString.getSerializedField().getModifiedCounter();
    return dfltChgPct;
  }

  protected int checkDfltChgPctMaxLimit(long number) {

    return (int) checkMaxLimit(number, MAX_100 /*limit*/, false /*isSigned*/);
  }
  /**
   * refreshDfltChgPct is used to refresh the latest value of a variable from the Serialized String
   * the most common reason to serialize an Object as a string in to write to a file. There can be
   * several other reasons for serialization as well
   */
  public int refreshDfltChgPct() throws CFException {
    try {
      return (getIntNumber(
          beginDfltChgPct,
          DFLT_CHG_PCT_LEN,
          false /*isSigned*/,
          true /*isSignTrailing*/,
          false /*isSignStoredSeparate*/));
    } catch (Exception ex) {
      throw getSoc7ABend("dfltChgPct", beginDfltChgPct, DFLT_CHG_PCT_LEN);
    }
  }

  int localPolicyNbrCounter = -1;

  public boolean isPolicyNbrModified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localPolicyNbrCounter != sharedCounter;
    localPolicyNbrCounter = sharedCounter;
    return hasModified;
  }

  protected static final int POLICY_NBR_LEN = 6;
  /** serialize this PolicyNbr */
  protected void serializePolicyNbr(char[] policyNbr) {
    shareString.getSerializedField().incrementCounter();
    arraycopy(policyNbr, 0, getStringValue(), beginPolicyNbr, POLICY_NBR_LEN);
    localPolicyNbrCounter = shareString.getSerializedField().getModifiedCounter();
  }

  protected char[] checkPolicyNbrConstraints(char[] value) {
    return super.checkConstraints(value, 6, false, false);
  }
  /**
   * refreshPolicyNbr is used to refresh the latest value of a variable from the Serialized String
   * the most common reason to serialize an Object as a string in to write to a file. There can be
   * several other reasons for serialization as well
   */
  public char[] refreshPolicyNbr() {
    return (substring(getStringValue(), beginPolicyNbr, beginPolicyNbr + POLICY_NBR_LEN));
  }

  int localPolicyIndCounter = -1;

  public boolean isPolicyIndModified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localPolicyIndCounter != sharedCounter;
    localPolicyIndCounter = sharedCounter;
    return hasModified;
  }

  protected static final int POLICY_IND_LEN = 1;
  /** serialize this PolicyInd */
  protected void serializePolicyInd(char[] policyInd) {
    shareString.getSerializedField().incrementCounter();
    arraycopy(policyInd, 0, getStringValue(), beginPolicyInd, POLICY_IND_LEN);
    localPolicyIndCounter = shareString.getSerializedField().getModifiedCounter();
  }

  protected char[] checkPolicyIndConstraints(char[] value) {
    return super.checkConstraints(value, 1, false, false);
  }
  /**
   * refreshPolicyInd is used to refresh the latest value of a variable from the Serialized String
   * the most common reason to serialize an Object as a string in to write to a file. There can be
   * several other reasons for serialization as well
   */
  public char[] refreshPolicyInd() {
    return (substring(getStringValue(), beginPolicyInd, beginPolicyInd + POLICY_IND_LEN));
  }

  int localObligIdCounter = -1;

  public boolean isObligIdModified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localObligIdCounter != sharedCounter;
    localObligIdCounter = sharedCounter;
    return hasModified;
  }

  protected static final int OBLIG_ID_LEN = 2;
  /** serialize this ObligId */
  protected void serializeObligId(char[] obligId) {
    shareString.getSerializedField().incrementCounter();
    arraycopy(obligId, 0, getStringValue(), beginObligId, OBLIG_ID_LEN);
    localObligIdCounter = shareString.getSerializedField().getModifiedCounter();
  }

  protected char[] checkObligIdConstraints(char[] value) {
    return super.checkConstraints(value, 2, false, false);
  }
  /**
   * refreshObligId is used to refresh the latest value of a variable from the Serialized String the
   * most common reason to serialize an Object as a string in to write to a file. There can be
   * several other reasons for serialization as well
   */
  public char[] refreshObligId() {
    return (substring(getStringValue(), beginObligId, beginObligId + OBLIG_ID_LEN));
  }

  public int stdFieldsSize() {
    return STD_FIELDS_SIZE;
  }
}
