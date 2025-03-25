package com.cloudframe.app.dto.serialize.dphpctsq;

/**
 * The class GdServerNameSerialized is used to define offsets in order to serialize in a fixed
 * String
 *
 * @author CloudFrame Inc. created on 2025-03-25 at 08:30. using version 5.0.0.231
 */
import com.cloudframe.app.data.Field;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class GdServerNameSerialized extends Field {

  protected Logger logger = LoggerFactory.getLogger(GdServerNameSerialized.class);
  /*  Length of the field, if serialized as a String */
  protected static final int GD_SERVER_NAME_LENGTH = 130;
  /*  offset of each of Child Fields when serialized as a String */
  protected int beginGdServerNameL;
  protected int beginGdServerNameT;

  /** Constructor for GdServerNameSerialized */
  public GdServerNameSerialized() {
    // TO-DO auto generated code
  }

  /**
   * Constructor for GdServerNameSerialized. sets the parent value to the parent
   *
   * @param parent
   * @param begin
   */
  public GdServerNameSerialized(Field parent, int begin) {
    setParent(parent, begin);
  }

  /**
   * sets parent for this GdServerNameSerialized to the parent
   *
   * @param parent
   */
  @Override
  public void setParent(Field parent) {
    setParent(parent, 88472); // serialize this field at offset 88472 by default
  }

  /**
   * sets parent for this GdServerNameSerialized to the parent and set the serialize offset to
   * parameter begin
   *
   * @param parent
   * @param begin - offset used when serializing this object to a String
   */
  public void setParent(Field parent, int begin) {
    super.setParent(parent);
    init(begin); // serialize this field at offset 88472 by default
  }
  /** initializes the field in GdServerNameSerialized */
  @Override
  protected void init(int begin) {
    setStartOffset(begin);
    setLength(GD_SERVER_NAME_LENGTH);
    /*  set the offset/position of each field when this object is serialized as String */
    beginGdServerNameL = getStartOffset() + 0; // set offset for serialization

    beginGdServerNameT = getStartOffset() + 2; // set offset for serialization

    /*  end of offset */
  }

  int localGdServerNameLCounter = -1;

  public boolean isGdServerNameLModified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localGdServerNameLCounter != sharedCounter;
    localGdServerNameLCounter = sharedCounter;
    return hasModified;
  }

  protected static final int GD_SERVER_NAME_L_LEN = 2;
  /** serializeGdServerNameL */
  protected void serializeGdServerNameL(short gdServerNameL) {
    replaceValue( //  save the value as string
        getBinaryString(gdServerNameL, GD_SERVER_NAME_L_LEN),
        beginGdServerNameL,
        GD_SERVER_NAME_L_LEN);
    localGdServerNameLCounter = shareString.getSerializedField().getModifiedCounter();
  }

  protected short checkGdServerNameLMaxLimit(long number) {
    return (short) checkMaxLimit(number, true /*isSigned*/, 2 /*dataLen*/);
  }
  /**
   * refreshGdServerNameL is used to refresh the latest value of a variable from the Serialized
   * String the most common reason to serialize an Object as a string in to write to a file. There
   * can be several other reasons for serialization as well
   */
  public short refreshGdServerNameL() {
    return (getShort(beginGdServerNameL));
  }

  int localGdServerNameTCounter = -1;

  public boolean isGdServerNameTModified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localGdServerNameTCounter != sharedCounter;
    localGdServerNameTCounter = sharedCounter;
    return hasModified;
  }

  protected static final int GD_SERVER_NAME_T_LEN = 128;
  /** serialize this GdServerNameT */
  protected void serializeGdServerNameT(char[] gdServerNameT) {
    shareString.getSerializedField().incrementCounter();
    arraycopy(gdServerNameT, 0, getStringValue(), beginGdServerNameT, GD_SERVER_NAME_T_LEN);
    localGdServerNameTCounter = shareString.getSerializedField().getModifiedCounter();
  }

  protected char[] checkGdServerNameTConstraints(char[] value) {
    return super.checkConstraints(value, 128, false, false);
  }
  /**
   * refreshGdServerNameT is used to refresh the latest value of a variable from the Serialized
   * String the most common reason to serialize an Object as a string in to write to a file. There
   * can be several other reasons for serialization as well
   */
  public char[] refreshGdServerNameT() {
    return (substring(
        getStringValue(), beginGdServerNameT, beginGdServerNameT + GD_SERVER_NAME_T_LEN));
  }
}
