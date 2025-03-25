package com.cloudframe.app.dto.serialize.c5427hpc;

/**
 * The class CrtnSrchKeyPartialSerialized is used to define offsets in order to serialize in a fixed
 * String
 *
 * @author CloudFrame Inc. created on 2025-03-25 at 08:29. using version 5.0.0.231
 */
import com.cloudframe.app.data.Field;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class CrtnSrchKeyPartialSerialized extends Field {

  protected Logger logger = LoggerFactory.getLogger(CrtnSrchKeyPartialSerialized.class);
  /*  Length of the field, if serialized as a String */
  protected static final int CRTN_SRCH_KEY_PARTIAL_LENGTH = 5;
  /*  offset of each of Child Fields when serialized as a String */
  protected int beginCrtnQueryTyp;
  protected int beginCrtnHipaaVerNbr;

  /** Constructor for CrtnSrchKeyPartialSerialized */
  public CrtnSrchKeyPartialSerialized() {
    // TO-DO auto generated code
  }

  /**
   * Constructor for CrtnSrchKeyPartialSerialized. sets the parent value to the parent
   *
   * @param parent
   * @param begin
   */
  public CrtnSrchKeyPartialSerialized(Field parent, int begin) {
    setParent(parent, begin);
  }

  /**
   * sets parent for this CrtnSrchKeyPartialSerialized to the parent
   *
   * @param parent
   */
  @Override
  public void setParent(Field parent) {
    setParent(parent, 0); // serialize this field at offset 0 by default
  }

  /**
   * sets parent for this CrtnSrchKeyPartialSerialized to the parent and set the serialize offset to
   * parameter begin
   *
   * @param parent
   * @param begin - offset used when serializing this object to a String
   */
  public void setParent(Field parent, int begin) {
    super.setParent(parent);
    init(begin); // serialize this field at offset 0 by default
  }
  /** initializes the field in CrtnSrchKeyPartialSerialized */
  @Override
  protected void init(int begin) {
    setStartOffset(begin);
    setLength(CRTN_SRCH_KEY_PARTIAL_LENGTH);
    /*  set the offset/position of each field when this object is serialized as String */
    beginCrtnQueryTyp = getStartOffset() + 0; // set offset for serialization

    beginCrtnHipaaVerNbr = getStartOffset() + 4; // set offset for serialization

    /*  end of offset */
  }

  int localCrtnQueryTypCounter = -1;

  public boolean isCrtnQueryTypModified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localCrtnQueryTypCounter != sharedCounter;
    localCrtnQueryTypCounter = sharedCounter;
    return hasModified;
  }

  protected static final int CRTN_QUERY_TYP_LEN = 4;
  /** serializeCrtnQueryTyp */
  protected void serializeCrtnQueryTyp(int crtnQueryTyp) {
    replaceValue( //  save the value as string
        getBinaryString(crtnQueryTyp, CRTN_QUERY_TYP_LEN), beginCrtnQueryTyp, CRTN_QUERY_TYP_LEN);
    localCrtnQueryTypCounter = shareString.getSerializedField().getModifiedCounter();
  }

  protected int checkCrtnQueryTypMaxLimit(long number) {
    return (int) checkMaxLimit(number, true /*isSigned*/, 4 /*dataLen*/);
  }
  /**
   * refreshCrtnQueryTyp is used to refresh the latest value of a variable from the Serialized
   * String the most common reason to serialize an Object as a string in to write to a file. There
   * can be several other reasons for serialization as well
   */
  public int refreshCrtnQueryTyp() {
    return (getInt(beginCrtnQueryTyp));
  }

  int localCrtnHipaaVerNbrCounter = -1;

  public boolean isCrtnHipaaVerNbrModified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localCrtnHipaaVerNbrCounter != sharedCounter;
    localCrtnHipaaVerNbrCounter = sharedCounter;
    return hasModified;
  }

  protected static final int CRTN_HIPAA_VER_NBR_LEN = 1;
  /** serialize this CrtnHipaaVerNbr */
  protected void serializeCrtnHipaaVerNbr(char[] crtnHipaaVerNbr) {
    shareString.getSerializedField().incrementCounter();
    arraycopy(crtnHipaaVerNbr, 0, getStringValue(), beginCrtnHipaaVerNbr, CRTN_HIPAA_VER_NBR_LEN);
    localCrtnHipaaVerNbrCounter = shareString.getSerializedField().getModifiedCounter();
  }

  protected char[] checkCrtnHipaaVerNbrConstraints(char[] value) {
    return super.checkConstraints(value, 1, false, false);
  }
  /**
   * refreshCrtnHipaaVerNbr is used to refresh the latest value of a variable from the Serialized
   * String the most common reason to serialize an Object as a string in to write to a file. There
   * can be several other reasons for serialization as well
   */
  public char[] refreshCrtnHipaaVerNbr() {
    return (substring(
        getStringValue(), beginCrtnHipaaVerNbr, beginCrtnHipaaVerNbr + CRTN_HIPAA_VER_NBR_LEN));
  }
}
