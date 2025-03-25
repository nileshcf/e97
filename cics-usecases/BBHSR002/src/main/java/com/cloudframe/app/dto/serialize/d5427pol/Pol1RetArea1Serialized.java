package com.cloudframe.app.dto.serialize.d5427pol;

/**
 * The class Pol1RetArea1Serialized is used to define offsets in order to serialize in a fixed
 * String
 *
 * @author CloudFrame Inc. created on 2025-03-25 at 08:31. using version 5.0.0.231
 */
import com.cloudframe.app.data.Field;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Pol1RetArea1Serialized extends Field {

  protected Logger logger = LoggerFactory.getLogger(Pol1RetArea1Serialized.class);
  /*  Length of the field, if serialized as a String */
  protected static final int POL_1_RET_AREA_1_LENGTH = 26;
  /*  offset of each of Child Fields when serialized as a String */
  protected int beginPol1RetPolEffDate;
  protected int beginPol1RetCovEndDate;
  protected int beginPol1RetPolicyType;
  protected int beginPol1RetVarPer;

  /** Constructor for Pol1RetArea1Serialized */
  public Pol1RetArea1Serialized() {
    // TO-DO auto generated code
  }

  /**
   * Constructor for Pol1RetArea1Serialized. sets the parent value to the parent
   *
   * @param parent
   * @param begin
   */
  public Pol1RetArea1Serialized(Field parent, int begin) {
    setParent(parent, begin);
  }

  /**
   * sets parent for this Pol1RetArea1Serialized to the parent
   *
   * @param parent
   */
  @Override
  public void setParent(Field parent) {
    setParent(parent, 0); // serialize this field at offset 0 by default
  }

  /**
   * sets parent for this Pol1RetArea1Serialized to the parent and set the serialize offset to
   * parameter begin
   *
   * @param parent
   * @param begin - offset used when serializing this object to a String
   */
  public void setParent(Field parent, int begin) {
    super.setParent(parent);
    init(begin); // serialize this field at offset 0 by default
  }
  /** initializes the field in Pol1RetArea1Serialized */
  @Override
  protected void init(int begin) {
    setStartOffset(begin);
    setLength(POL_1_RET_AREA_1_LENGTH);
    /*  set the offset/position of each field when this object is serialized as String */
    beginPol1RetPolEffDate = getStartOffset() + 0; // set offset for serialization

    beginPol1RetCovEndDate = getStartOffset() + 10; // set offset for serialization

    beginPol1RetPolicyType = getStartOffset() + 20; // set offset for serialization

    beginPol1RetVarPer = getStartOffset() + 22; // set offset for serialization

    /*  end of offset */
  }

  int localPol1RetPolEffDateCounter = -1;

  public boolean isPol1RetPolEffDateModified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localPol1RetPolEffDateCounter != sharedCounter;
    localPol1RetPolEffDateCounter = sharedCounter;
    return hasModified;
  }

  protected static final int POL_1_RET_POL_EFF_DATE_LEN = 10;
  /** serialize this Pol1RetPolEffDate */
  protected void serializePol1RetPolEffDate(char[] pol1RetPolEffDate) {
    shareString.getSerializedField().incrementCounter();
    arraycopy(
        pol1RetPolEffDate, 0, getStringValue(), beginPol1RetPolEffDate, POL_1_RET_POL_EFF_DATE_LEN);
    localPol1RetPolEffDateCounter = shareString.getSerializedField().getModifiedCounter();
  }

  protected char[] checkPol1RetPolEffDateConstraints(char[] value) {
    return super.checkConstraints(value, 10, false, false);
  }
  /**
   * refreshPol1RetPolEffDate is used to refresh the latest value of a variable from the Serialized
   * String the most common reason to serialize an Object as a string in to write to a file. There
   * can be several other reasons for serialization as well
   */
  public char[] refreshPol1RetPolEffDate() {
    return (substring(
        getStringValue(),
        beginPol1RetPolEffDate,
        beginPol1RetPolEffDate + POL_1_RET_POL_EFF_DATE_LEN));
  }

  int localPol1RetCovEndDateCounter = -1;

  public boolean isPol1RetCovEndDateModified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localPol1RetCovEndDateCounter != sharedCounter;
    localPol1RetCovEndDateCounter = sharedCounter;
    return hasModified;
  }

  protected static final int POL_1_RET_COV_END_DATE_LEN = 10;
  /** serialize this Pol1RetCovEndDate */
  protected void serializePol1RetCovEndDate(char[] pol1RetCovEndDate) {
    shareString.getSerializedField().incrementCounter();
    arraycopy(
        pol1RetCovEndDate, 0, getStringValue(), beginPol1RetCovEndDate, POL_1_RET_COV_END_DATE_LEN);
    localPol1RetCovEndDateCounter = shareString.getSerializedField().getModifiedCounter();
  }

  protected char[] checkPol1RetCovEndDateConstraints(char[] value) {
    return super.checkConstraints(value, 10, false, false);
  }
  /**
   * refreshPol1RetCovEndDate is used to refresh the latest value of a variable from the Serialized
   * String the most common reason to serialize an Object as a string in to write to a file. There
   * can be several other reasons for serialization as well
   */
  public char[] refreshPol1RetCovEndDate() {
    return (substring(
        getStringValue(),
        beginPol1RetCovEndDate,
        beginPol1RetCovEndDate + POL_1_RET_COV_END_DATE_LEN));
  }

  int localPol1RetPolicyTypeCounter = -1;

  public boolean isPol1RetPolicyTypeModified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localPol1RetPolicyTypeCounter != sharedCounter;
    localPol1RetPolicyTypeCounter = sharedCounter;
    return hasModified;
  }

  protected static final int POL_1_RET_POLICY_TYPE_LEN = 2;
  /** serialize this Pol1RetPolicyType */
  protected void serializePol1RetPolicyType(char[] pol1RetPolicyType) {
    shareString.getSerializedField().incrementCounter();
    arraycopy(
        pol1RetPolicyType, 0, getStringValue(), beginPol1RetPolicyType, POL_1_RET_POLICY_TYPE_LEN);
    localPol1RetPolicyTypeCounter = shareString.getSerializedField().getModifiedCounter();
  }

  protected char[] checkPol1RetPolicyTypeConstraints(char[] value) {
    return super.checkConstraints(value, 2, false, false);
  }
  /**
   * refreshPol1RetPolicyType is used to refresh the latest value of a variable from the Serialized
   * String the most common reason to serialize an Object as a string in to write to a file. There
   * can be several other reasons for serialization as well
   */
  public char[] refreshPol1RetPolicyType() {
    return (substring(
        getStringValue(),
        beginPol1RetPolicyType,
        beginPol1RetPolicyType + POL_1_RET_POLICY_TYPE_LEN));
  }

  int localPol1RetVarPerCounter = -1;

  public boolean isPol1RetVarPerModified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localPol1RetVarPerCounter != sharedCounter;
    localPol1RetVarPerCounter = sharedCounter;
    return hasModified;
  }

  protected static final int POL_1_RET_VAR_PER_LEN = 4;
  /** serialize this Pol1RetVarPer */
  protected void serializePol1RetVarPer(char[] pol1RetVarPer) {
    shareString.getSerializedField().incrementCounter();
    arraycopy(pol1RetVarPer, 0, getStringValue(), beginPol1RetVarPer, POL_1_RET_VAR_PER_LEN);
    localPol1RetVarPerCounter = shareString.getSerializedField().getModifiedCounter();
  }

  protected char[] checkPol1RetVarPerConstraints(char[] value) {
    return super.checkConstraints(value, 4, false, false);
  }
  /**
   * refreshPol1RetVarPer is used to refresh the latest value of a variable from the Serialized
   * String the most common reason to serialize an Object as a string in to write to a file. There
   * can be several other reasons for serialization as well
   */
  public char[] refreshPol1RetVarPer() {
    return (substring(
        getStringValue(), beginPol1RetVarPer, beginPol1RetVarPer + POL_1_RET_VAR_PER_LEN));
  }
}
