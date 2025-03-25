package com.cloudframe.app.dto.serialize.c5427hpc;

/**
 * The class CrtnSrchReturnAreaSerialized is used to define offsets in order to serialize in a fixed
 * String
 *
 * @author CloudFrame Inc. created on 2025-03-25 at 08:29. using version 5.0.0.231
 */
import com.cloudframe.app.data.Field;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class CrtnSrchReturnAreaSerialized extends Field {

  protected Logger logger = LoggerFactory.getLogger(CrtnSrchReturnAreaSerialized.class);
  /*  Length of the field, if serialized as a String */
  protected static final int CRTN_SRCH_RETURN_AREA_LENGTH = 10;
  /*  offset of each of Child Fields when serialized as a String */
  protected int beginCrtnSqlcode;
  protected int beginCrtnSrchFoundSw;
  protected int beginCrtnHipaaCd;
  protected int beginCrtnHipaaGrpCd;
  protected int beginCrtnGrnrcRqstCd;

  /** Constructor for CrtnSrchReturnAreaSerialized */
  public CrtnSrchReturnAreaSerialized() {
    // TO-DO auto generated code
  }

  /**
   * Constructor for CrtnSrchReturnAreaSerialized. sets the parent value to the parent
   *
   * @param parent
   * @param begin
   */
  public CrtnSrchReturnAreaSerialized(Field parent, int begin) {
    setParent(parent, begin);
  }

  /**
   * sets parent for this CrtnSrchReturnAreaSerialized to the parent
   *
   * @param parent
   */
  @Override
  public void setParent(Field parent) {
    setParent(parent, 30); // serialize this field at offset 30 by default
  }

  /**
   * sets parent for this CrtnSrchReturnAreaSerialized to the parent and set the serialize offset to
   * parameter begin
   *
   * @param parent
   * @param begin - offset used when serializing this object to a String
   */
  public void setParent(Field parent, int begin) {
    super.setParent(parent);
    init(begin); // serialize this field at offset 30 by default
  }
  /** initializes the field in CrtnSrchReturnAreaSerialized */
  @Override
  protected void init(int begin) {
    setStartOffset(begin);
    setLength(CRTN_SRCH_RETURN_AREA_LENGTH);
    /*  set the offset/position of each field when this object is serialized as String */
    beginCrtnSqlcode = getStartOffset() + 0; // set offset for serialization

    beginCrtnSrchFoundSw = getStartOffset() + 4; // set offset for serialization

    beginCrtnHipaaCd = getStartOffset() + 5; // set offset for serialization

    beginCrtnHipaaGrpCd = getStartOffset() + 7; // set offset for serialization

    beginCrtnGrnrcRqstCd = getStartOffset() + 9; // set offset for serialization

    /*  end of offset */
  }

  int localCrtnSqlcodeCounter = -1;

  public boolean isCrtnSqlcodeModified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localCrtnSqlcodeCounter != sharedCounter;
    localCrtnSqlcodeCounter = sharedCounter;
    return hasModified;
  }

  protected static final int CRTN_SQLCODE_LEN = 4;
  /** serializeCrtnSqlcode */
  protected void serializeCrtnSqlcode(int crtnSqlcode) {
    replaceValue( //  save the value as string
        getBinaryString(crtnSqlcode, CRTN_SQLCODE_LEN), beginCrtnSqlcode, CRTN_SQLCODE_LEN);
    localCrtnSqlcodeCounter = shareString.getSerializedField().getModifiedCounter();
  }

  protected int checkCrtnSqlcodeMaxLimit(long number) {
    return (int) checkMaxLimit(number, true /*isSigned*/, 4 /*dataLen*/);
  }
  /**
   * refreshCrtnSqlcode is used to refresh the latest value of a variable from the Serialized String
   * the most common reason to serialize an Object as a string in to write to a file. There can be
   * several other reasons for serialization as well
   */
  public int refreshCrtnSqlcode() {
    return (getInt(beginCrtnSqlcode));
  }

  int localCrtnSrchFoundSwCounter = -1;

  public boolean isCrtnSrchFoundSwModified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localCrtnSrchFoundSwCounter != sharedCounter;
    localCrtnSrchFoundSwCounter = sharedCounter;
    return hasModified;
  }

  protected static final int CRTN_SRCH_FOUND_SW_LEN = 1;
  /** serialize this CrtnSrchFoundSw */
  protected void serializeCrtnSrchFoundSw(char[] crtnSrchFoundSw) {
    shareString.getSerializedField().incrementCounter();
    arraycopy(crtnSrchFoundSw, 0, getStringValue(), beginCrtnSrchFoundSw, CRTN_SRCH_FOUND_SW_LEN);
    localCrtnSrchFoundSwCounter = shareString.getSerializedField().getModifiedCounter();
  }

  protected char[] checkCrtnSrchFoundSwConstraints(char[] value) {
    return super.checkConstraints(value, 1, false, false);
  }
  /**
   * refreshCrtnSrchFoundSw is used to refresh the latest value of a variable from the Serialized
   * String the most common reason to serialize an Object as a string in to write to a file. There
   * can be several other reasons for serialization as well
   */
  public char[] refreshCrtnSrchFoundSw() {
    return (substring(
        getStringValue(), beginCrtnSrchFoundSw, beginCrtnSrchFoundSw + CRTN_SRCH_FOUND_SW_LEN));
  }

  int localCrtnHipaaCdCounter = -1;

  public boolean isCrtnHipaaCdModified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localCrtnHipaaCdCounter != sharedCounter;
    localCrtnHipaaCdCounter = sharedCounter;
    return hasModified;
  }

  protected static final int CRTN_HIPAA_CD_LEN = 2;
  /** serialize this CrtnHipaaCd */
  protected void serializeCrtnHipaaCd(char[] crtnHipaaCd) {
    shareString.getSerializedField().incrementCounter();
    arraycopy(crtnHipaaCd, 0, getStringValue(), beginCrtnHipaaCd, CRTN_HIPAA_CD_LEN);
    localCrtnHipaaCdCounter = shareString.getSerializedField().getModifiedCounter();
  }

  protected char[] checkCrtnHipaaCdConstraints(char[] value) {
    return super.checkConstraints(value, 2, false, false);
  }
  /**
   * refreshCrtnHipaaCd is used to refresh the latest value of a variable from the Serialized String
   * the most common reason to serialize an Object as a string in to write to a file. There can be
   * several other reasons for serialization as well
   */
  public char[] refreshCrtnHipaaCd() {
    return (substring(getStringValue(), beginCrtnHipaaCd, beginCrtnHipaaCd + CRTN_HIPAA_CD_LEN));
  }

  int localCrtnHipaaGrpCdCounter = -1;

  public boolean isCrtnHipaaGrpCdModified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localCrtnHipaaGrpCdCounter != sharedCounter;
    localCrtnHipaaGrpCdCounter = sharedCounter;
    return hasModified;
  }

  protected static final int CRTN_HIPAA_GRP_CD_LEN = 2;
  /** serialize this CrtnHipaaGrpCd */
  protected void serializeCrtnHipaaGrpCd(char[] crtnHipaaGrpCd) {
    shareString.getSerializedField().incrementCounter();
    arraycopy(crtnHipaaGrpCd, 0, getStringValue(), beginCrtnHipaaGrpCd, CRTN_HIPAA_GRP_CD_LEN);
    localCrtnHipaaGrpCdCounter = shareString.getSerializedField().getModifiedCounter();
  }

  protected char[] checkCrtnHipaaGrpCdConstraints(char[] value) {
    return super.checkConstraints(value, 2, false, false);
  }
  /**
   * refreshCrtnHipaaGrpCd is used to refresh the latest value of a variable from the Serialized
   * String the most common reason to serialize an Object as a string in to write to a file. There
   * can be several other reasons for serialization as well
   */
  public char[] refreshCrtnHipaaGrpCd() {
    return (substring(
        getStringValue(), beginCrtnHipaaGrpCd, beginCrtnHipaaGrpCd + CRTN_HIPAA_GRP_CD_LEN));
  }

  int localCrtnGrnrcRqstCdCounter = -1;

  public boolean isCrtnGrnrcRqstCdModified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localCrtnGrnrcRqstCdCounter != sharedCounter;
    localCrtnGrnrcRqstCdCounter = sharedCounter;
    return hasModified;
  }

  protected static final int CRTN_GRNRC_RQST_CD_LEN = 1;
  /** serialize this CrtnGrnrcRqstCd */
  protected void serializeCrtnGrnrcRqstCd(char[] crtnGrnrcRqstCd) {
    shareString.getSerializedField().incrementCounter();
    arraycopy(crtnGrnrcRqstCd, 0, getStringValue(), beginCrtnGrnrcRqstCd, CRTN_GRNRC_RQST_CD_LEN);
    localCrtnGrnrcRqstCdCounter = shareString.getSerializedField().getModifiedCounter();
  }

  protected char[] checkCrtnGrnrcRqstCdConstraints(char[] value) {
    return super.checkConstraints(value, 1, false, false);
  }
  /**
   * refreshCrtnGrnrcRqstCd is used to refresh the latest value of a variable from the Serialized
   * String the most common reason to serialize an Object as a string in to write to a file. There
   * can be several other reasons for serialization as well
   */
  public char[] refreshCrtnGrnrcRqstCd() {
    return (substring(
        getStringValue(), beginCrtnGrnrcRqstCd, beginCrtnGrnrcRqstCd + CRTN_GRNRC_RQST_CD_LEN));
  }
}
