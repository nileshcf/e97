package com.cloudframe.app.dto.serialize.d5427bhi;

/**
 * The class VariablesSerialized is used to define offsets in order to serialize in a fixed String
 *
 * @author CloudFrame Inc. created on 2025-03-25 at 08:32. using version 5.0.0.231
 */
import com.cloudframe.app.data.Field;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class VariablesSerialized extends Field {

  protected Logger logger = LoggerFactory.getLogger(VariablesSerialized.class);
  /*  Length of the field, if serialized as a String */
  protected static final int VARIABLES_LENGTH = 11;
  /*  offset of each of Child Fields when serialized as a String */
  protected int beginDsmPgmName;
  protected int beginStsActive;
  protected int beginNetIndBoth;
  protected int beginTempVar;

  /** Constructor for VariablesSerialized */
  public VariablesSerialized() {
    init(0);
  }

  /** initializes the field in VariablesSerialized */
  @Override
  protected void init(int begin) {
    setStartOffset(begin);
    setLength(VARIABLES_LENGTH);
    /*  set the offset/position of each field when this object is serialized as String */
    beginDsmPgmName = getStartOffset() + 0; // set offset for serialization

    beginStsActive = getStartOffset() + 8; // set offset for serialization

    beginNetIndBoth = getStartOffset() + 9; // set offset for serialization

    beginTempVar = getStartOffset() + 10; // set offset for serialization

    /*  end of offset */
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

  int localStsActiveCounter = -1;

  public boolean isStsActiveModified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localStsActiveCounter != sharedCounter;
    localStsActiveCounter = sharedCounter;
    return hasModified;
  }

  protected static final int STS_ACTIVE_LEN = 1;
  /** serialize this StsActive */
  protected void serializeStsActive(char[] stsActive) {
    shareString.getSerializedField().incrementCounter();
    arraycopy(stsActive, 0, getStringValue(), beginStsActive, STS_ACTIVE_LEN);
    localStsActiveCounter = shareString.getSerializedField().getModifiedCounter();
  }

  protected char[] checkStsActiveConstraints(char[] value) {
    return super.checkConstraints(value, 1, false, false);
  }
  /**
   * refreshStsActive is used to refresh the latest value of a variable from the Serialized String
   * the most common reason to serialize an Object as a string in to write to a file. There can be
   * several other reasons for serialization as well
   */
  public char[] refreshStsActive() {
    return (substring(getStringValue(), beginStsActive, beginStsActive + STS_ACTIVE_LEN));
  }

  int localNetIndBothCounter = -1;

  public boolean isNetIndBothModified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localNetIndBothCounter != sharedCounter;
    localNetIndBothCounter = sharedCounter;
    return hasModified;
  }

  protected static final int NET_IND_BOTH_LEN = 1;
  /** serialize this NetIndBoth */
  protected void serializeNetIndBoth(char[] netIndBoth) {
    shareString.getSerializedField().incrementCounter();
    arraycopy(netIndBoth, 0, getStringValue(), beginNetIndBoth, NET_IND_BOTH_LEN);
    localNetIndBothCounter = shareString.getSerializedField().getModifiedCounter();
  }

  protected char[] checkNetIndBothConstraints(char[] value) {
    return super.checkConstraints(value, 1, false, false);
  }
  /**
   * refreshNetIndBoth is used to refresh the latest value of a variable from the Serialized String
   * the most common reason to serialize an Object as a string in to write to a file. There can be
   * several other reasons for serialization as well
   */
  public char[] refreshNetIndBoth() {
    return (substring(getStringValue(), beginNetIndBoth, beginNetIndBoth + NET_IND_BOTH_LEN));
  }

  int localTempVarCounter = -1;

  public boolean isTempVarModified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localTempVarCounter != sharedCounter;
    localTempVarCounter = sharedCounter;
    return hasModified;
  }

  protected static final int TEMP_VAR_LEN = 1;
  /** serialize this TempVar */
  protected void serializeTempVar(char[] tempVar) {
    shareString.getSerializedField().incrementCounter();
    arraycopy(tempVar, 0, getStringValue(), beginTempVar, TEMP_VAR_LEN);
    localTempVarCounter = shareString.getSerializedField().getModifiedCounter();
  }

  protected char[] checkTempVarConstraints(char[] value) {
    return super.checkConstraints(value, 1, false, false);
  }
  /**
   * refreshTempVar is used to refresh the latest value of a variable from the Serialized String the
   * most common reason to serialize an Object as a string in to write to a file. There can be
   * several other reasons for serialization as well
   */
  public char[] refreshTempVar() {
    return (substring(getStringValue(), beginTempVar, beginTempVar + TEMP_VAR_LEN));
  }
}
