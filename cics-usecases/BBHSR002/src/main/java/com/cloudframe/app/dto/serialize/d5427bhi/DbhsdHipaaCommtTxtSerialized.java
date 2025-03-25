package com.cloudframe.app.dto.serialize.d5427bhi;

/**
 * The class DbhsdHipaaCommtTxtSerialized is used to define offsets in order to serialize in a fixed
 * String
 *
 * @author CloudFrame Inc. created on 2025-03-25 at 08:32. using version 5.0.0.231
 */
import com.cloudframe.app.data.Field;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class DbhsdHipaaCommtTxtSerialized extends Field {

  protected Logger logger = LoggerFactory.getLogger(DbhsdHipaaCommtTxtSerialized.class);
  /*  Length of the field, if serialized as a String */
  protected static final int DBHSD_HIPAA_COMMT_TXT_LENGTH = 302;
  /*  offset of each of Child Fields when serialized as a String */
  protected int beginDbhsdHipaaCommtTxtLen;
  protected int beginDbhsdHipaaCommtTxtText;

  /** Constructor for DbhsdHipaaCommtTxtSerialized */
  public DbhsdHipaaCommtTxtSerialized() {
    // TO-DO auto generated code
  }

  /**
   * Constructor for DbhsdHipaaCommtTxtSerialized. sets the parent value to the parent
   *
   * @param parent
   * @param begin
   */
  public DbhsdHipaaCommtTxtSerialized(Field parent, int begin) {
    setParent(parent, begin);
  }

  /**
   * sets parent for this DbhsdHipaaCommtTxtSerialized to the parent
   *
   * @param parent
   */
  @Override
  public void setParent(Field parent) {
    setParent(parent, 92); // serialize this field at offset 92 by default
  }

  /**
   * sets parent for this DbhsdHipaaCommtTxtSerialized to the parent and set the serialize offset to
   * parameter begin
   *
   * @param parent
   * @param begin - offset used when serializing this object to a String
   */
  public void setParent(Field parent, int begin) {
    super.setParent(parent);
    init(begin); // serialize this field at offset 92 by default
  }
  /** initializes the field in DbhsdHipaaCommtTxtSerialized */
  @Override
  protected void init(int begin) {
    setStartOffset(begin);
    setLength(DBHSD_HIPAA_COMMT_TXT_LENGTH);
    /*  set the offset/position of each field when this object is serialized as String */
    beginDbhsdHipaaCommtTxtLen = getStartOffset() + 0; // set offset for serialization

    beginDbhsdHipaaCommtTxtText = getStartOffset() + 2; // set offset for serialization

    /*  end of offset */
  }

  int localDbhsdHipaaCommtTxtLenCounter = -1;

  public boolean isDbhsdHipaaCommtTxtLenModified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localDbhsdHipaaCommtTxtLenCounter != sharedCounter;
    localDbhsdHipaaCommtTxtLenCounter = sharedCounter;
    return hasModified;
  }

  protected static final int DBHSD_HIPAA_COMMT_TXT_LEN_LEN = 2;
  /** serializeDbhsdHipaaCommtTxtLen */
  protected void serializeDbhsdHipaaCommtTxtLen(short dbhsdHipaaCommtTxtLen) {
    replaceValue( //  save the value as string
        getBinaryString(dbhsdHipaaCommtTxtLen, DBHSD_HIPAA_COMMT_TXT_LEN_LEN),
        beginDbhsdHipaaCommtTxtLen,
        DBHSD_HIPAA_COMMT_TXT_LEN_LEN);
    localDbhsdHipaaCommtTxtLenCounter = shareString.getSerializedField().getModifiedCounter();
  }

  protected short checkDbhsdHipaaCommtTxtLenMaxLimit(long number) {
    return (short) checkMaxLimit(number, true /*isSigned*/, 2 /*dataLen*/);
  }
  /**
   * refreshDbhsdHipaaCommtTxtLen is used to refresh the latest value of a variable from the
   * Serialized String the most common reason to serialize an Object as a string in to write to a
   * file. There can be several other reasons for serialization as well
   */
  public short refreshDbhsdHipaaCommtTxtLen() {
    return (getShort(beginDbhsdHipaaCommtTxtLen));
  }

  int localDbhsdHipaaCommtTxtTextCounter = -1;

  public boolean isDbhsdHipaaCommtTxtTextModified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localDbhsdHipaaCommtTxtTextCounter != sharedCounter;
    localDbhsdHipaaCommtTxtTextCounter = sharedCounter;
    return hasModified;
  }

  protected static final int DBHSD_HIPAA_COMMT_TXT_TEXT_LEN = 300;
  /** serialize this DbhsdHipaaCommtTxtText */
  protected void serializeDbhsdHipaaCommtTxtText(char[] dbhsdHipaaCommtTxtText) {
    shareString.getSerializedField().incrementCounter();
    arraycopy(
        dbhsdHipaaCommtTxtText,
        0,
        getStringValue(),
        beginDbhsdHipaaCommtTxtText,
        DBHSD_HIPAA_COMMT_TXT_TEXT_LEN);
    localDbhsdHipaaCommtTxtTextCounter = shareString.getSerializedField().getModifiedCounter();
  }

  protected char[] checkDbhsdHipaaCommtTxtTextConstraints(char[] value) {
    return super.checkConstraints(value, 300, false, false);
  }
  /**
   * refreshDbhsdHipaaCommtTxtText is used to refresh the latest value of a variable from the
   * Serialized String the most common reason to serialize an Object as a string in to write to a
   * file. There can be several other reasons for serialization as well
   */
  public char[] refreshDbhsdHipaaCommtTxtText() {
    return (substring(
        getStringValue(),
        beginDbhsdHipaaCommtTxtText,
        beginDbhsdHipaaCommtTxtText + DBHSD_HIPAA_COMMT_TXT_TEXT_LEN));
  }
}
