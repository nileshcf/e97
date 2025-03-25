package com.cloudframe.app.dto.serialize.dphpctsq;

/**
 * The class GdAuthIdSerialized is used to define offsets in order to serialize in a fixed String
 *
 * @author CloudFrame Inc. created on 2025-03-25 at 08:30. using version 5.0.0.231
 */
import com.cloudframe.app.data.Field;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class GdAuthIdSerialized extends Field {

  protected Logger logger = LoggerFactory.getLogger(GdAuthIdSerialized.class);
  /*  Length of the field, if serialized as a String */
  protected static final int GD_AUTH_ID_LENGTH = 130;
  /*  offset of each of Child Fields when serialized as a String */
  protected int beginGdAuthIdL;
  protected int beginGdAuthIdT;

  /** Constructor for GdAuthIdSerialized */
  public GdAuthIdSerialized() {
    // TO-DO auto generated code
  }

  /**
   * Constructor for GdAuthIdSerialized. sets the parent value to the parent
   *
   * @param parent
   * @param begin
   */
  public GdAuthIdSerialized(Field parent, int begin) {
    setParent(parent, begin);
  }

  /**
   * sets parent for this GdAuthIdSerialized to the parent
   *
   * @param parent
   */
  @Override
  public void setParent(Field parent) {
    setParent(parent, 88603); // serialize this field at offset 88603 by default
  }

  /**
   * sets parent for this GdAuthIdSerialized to the parent and set the serialize offset to parameter
   * begin
   *
   * @param parent
   * @param begin - offset used when serializing this object to a String
   */
  public void setParent(Field parent, int begin) {
    super.setParent(parent);
    init(begin); // serialize this field at offset 88603 by default
  }
  /** initializes the field in GdAuthIdSerialized */
  @Override
  protected void init(int begin) {
    setStartOffset(begin);
    setLength(GD_AUTH_ID_LENGTH);
    /*  set the offset/position of each field when this object is serialized as String */
    beginGdAuthIdL = getStartOffset() + 0; // set offset for serialization

    beginGdAuthIdT = getStartOffset() + 2; // set offset for serialization

    /*  end of offset */
  }

  int localGdAuthIdLCounter = -1;

  public boolean isGdAuthIdLModified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localGdAuthIdLCounter != sharedCounter;
    localGdAuthIdLCounter = sharedCounter;
    return hasModified;
  }

  protected static final int GD_AUTH_ID_L_LEN = 2;
  /** serializeGdAuthIdL */
  protected void serializeGdAuthIdL(short gdAuthIdL) {
    replaceValue( //  save the value as string
        getBinaryString(gdAuthIdL, GD_AUTH_ID_L_LEN), beginGdAuthIdL, GD_AUTH_ID_L_LEN);
    localGdAuthIdLCounter = shareString.getSerializedField().getModifiedCounter();
  }

  protected short checkGdAuthIdLMaxLimit(long number) {
    return (short) checkMaxLimit(number, true /*isSigned*/, 2 /*dataLen*/);
  }
  /**
   * refreshGdAuthIdL is used to refresh the latest value of a variable from the Serialized String
   * the most common reason to serialize an Object as a string in to write to a file. There can be
   * several other reasons for serialization as well
   */
  public short refreshGdAuthIdL() {
    return (getShort(beginGdAuthIdL));
  }

  int localGdAuthIdTCounter = -1;

  public boolean isGdAuthIdTModified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localGdAuthIdTCounter != sharedCounter;
    localGdAuthIdTCounter = sharedCounter;
    return hasModified;
  }

  protected static final int GD_AUTH_ID_T_LEN = 128;
  /** serialize this GdAuthIdT */
  protected void serializeGdAuthIdT(char[] gdAuthIdT) {
    shareString.getSerializedField().incrementCounter();
    arraycopy(gdAuthIdT, 0, getStringValue(), beginGdAuthIdT, GD_AUTH_ID_T_LEN);
    localGdAuthIdTCounter = shareString.getSerializedField().getModifiedCounter();
  }

  protected char[] checkGdAuthIdTConstraints(char[] value) {
    return super.checkConstraints(value, 128, false, false);
  }
  /**
   * refreshGdAuthIdT is used to refresh the latest value of a variable from the Serialized String
   * the most common reason to serialize an Object as a string in to write to a file. There can be
   * several other reasons for serialization as well
   */
  public char[] refreshGdAuthIdT() {
    return (substring(getStringValue(), beginGdAuthIdT, beginGdAuthIdT + GD_AUTH_ID_T_LEN));
  }
}
