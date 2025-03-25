package com.cloudframe.app.dto.serialize.c5427hpc;

/**
 * The class CrtnSrchKeySerialized is used to define offsets in order to serialize in a fixed String
 *
 * @author CloudFrame Inc. created on 2025-03-25 at 08:29. using version 5.0.0.231
 */
import com.cloudframe.app.data.Field;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class CrtnSrchKeySerialized extends Field {

  protected Logger logger = LoggerFactory.getLogger(CrtnSrchKeySerialized.class);
  /*  Length of the field, if serialized as a String */
  protected static final int CRTN_SRCH_KEY_LENGTH = 7;
  /*  offset of each of Child Fields when serialized as a String */
  protected int beginCrtnKeyCode;

  /** Constructor for CrtnSrchKeySerialized */
  public CrtnSrchKeySerialized() {
    // TO-DO auto generated code
  }

  /**
   * Constructor for CrtnSrchKeySerialized. sets the parent value to the parent
   *
   * @param parent
   * @param begin
   */
  public CrtnSrchKeySerialized(Field parent, int begin) {
    setParent(parent, begin);
  }

  /**
   * sets parent for this CrtnSrchKeySerialized to the parent
   *
   * @param parent
   */
  @Override
  public void setParent(Field parent) {
    setParent(parent, 0); // serialize this field at offset 0 by default
  }

  /**
   * sets parent for this CrtnSrchKeySerialized to the parent and set the serialize offset to
   * parameter begin
   *
   * @param parent
   * @param begin - offset used when serializing this object to a String
   */
  public void setParent(Field parent, int begin) {
    super.setParent(parent);
    init(begin); // serialize this field at offset 0 by default
  }
  /** initializes the field in CrtnSrchKeySerialized */
  @Override
  protected void init(int begin) {
    setStartOffset(begin);
    setLength(CRTN_SRCH_KEY_LENGTH);
    /*  set the offset/position of each field when this object is serialized as String */

    beginCrtnKeyCode = getStartOffset() + 5; // set offset for serialization

    /*  end of offset */
  }

  int localCrtnKeyCodeCounter = -1;

  public boolean isCrtnKeyCodeModified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localCrtnKeyCodeCounter != sharedCounter;
    localCrtnKeyCodeCounter = sharedCounter;
    return hasModified;
  }

  protected static final int CRTN_KEY_CODE_LEN = 2;
  /** serialize this CrtnKeyCode */
  protected void serializeCrtnKeyCode(char[] crtnKeyCode) {
    shareString.getSerializedField().incrementCounter();
    arraycopy(crtnKeyCode, 0, getStringValue(), beginCrtnKeyCode, CRTN_KEY_CODE_LEN);
    localCrtnKeyCodeCounter = shareString.getSerializedField().getModifiedCounter();
  }

  protected char[] checkCrtnKeyCodeConstraints(char[] value) {
    return super.checkConstraints(value, 2, false, false);
  }
  /**
   * refreshCrtnKeyCode is used to refresh the latest value of a variable from the Serialized String
   * the most common reason to serialize an Object as a string in to write to a file. There can be
   * several other reasons for serialization as well
   */
  public char[] refreshCrtnKeyCode() {
    return (substring(getStringValue(), beginCrtnKeyCode, beginCrtnKeyCode + CRTN_KEY_CODE_LEN));
  }
}
