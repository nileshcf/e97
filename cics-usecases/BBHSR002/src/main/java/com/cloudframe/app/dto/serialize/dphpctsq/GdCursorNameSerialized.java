package com.cloudframe.app.dto.serialize.dphpctsq;

/**
 * The class GdCursorNameSerialized is used to define offsets in order to serialize in a fixed
 * String
 *
 * @author CloudFrame Inc. created on 2025-03-25 at 08:30. using version 5.0.0.231
 */
import com.cloudframe.app.data.Field;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class GdCursorNameSerialized extends Field {

  protected Logger logger = LoggerFactory.getLogger(GdCursorNameSerialized.class);
  /*  Length of the field, if serialized as a String */
  protected static final int GD_CURSOR_NAME_LENGTH = 130;
  /*  offset of each of Child Fields when serialized as a String */
  protected int beginGdCursorNameL;
  protected int beginGdCursorNameT;

  /** Constructor for GdCursorNameSerialized */
  public GdCursorNameSerialized() {
    // TO-DO auto generated code
  }

  /**
   * Constructor for GdCursorNameSerialized. sets the parent value to the parent
   *
   * @param parent
   * @param begin
   */
  public GdCursorNameSerialized(Field parent, int begin) {
    setParent(parent, begin);
  }

  /**
   * sets parent for this GdCursorNameSerialized to the parent
   *
   * @param parent
   */
  @Override
  public void setParent(Field parent) {
    setParent(parent, 3868); // serialize this field at offset 3868 by default
  }

  /**
   * sets parent for this GdCursorNameSerialized to the parent and set the serialize offset to
   * parameter begin
   *
   * @param parent
   * @param begin - offset used when serializing this object to a String
   */
  public void setParent(Field parent, int begin) {
    super.setParent(parent);
    init(begin); // serialize this field at offset 3868 by default
  }
  /** initializes the field in GdCursorNameSerialized */
  @Override
  protected void init(int begin) {
    setStartOffset(begin);
    setLength(GD_CURSOR_NAME_LENGTH);
    /*  set the offset/position of each field when this object is serialized as String */
    beginGdCursorNameL = getStartOffset() + 0; // set offset for serialization

    beginGdCursorNameT = getStartOffset() + 2; // set offset for serialization

    /*  end of offset */
  }

  int localGdCursorNameLCounter = -1;

  public boolean isGdCursorNameLModified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localGdCursorNameLCounter != sharedCounter;
    localGdCursorNameLCounter = sharedCounter;
    return hasModified;
  }

  protected static final int GD_CURSOR_NAME_L_LEN = 2;
  /** serializeGdCursorNameL */
  protected void serializeGdCursorNameL(short gdCursorNameL) {
    replaceValue( //  save the value as string
        getBinaryString(gdCursorNameL, GD_CURSOR_NAME_L_LEN),
        beginGdCursorNameL,
        GD_CURSOR_NAME_L_LEN);
    localGdCursorNameLCounter = shareString.getSerializedField().getModifiedCounter();
  }

  protected short checkGdCursorNameLMaxLimit(long number) {
    return (short) checkMaxLimit(number, true /*isSigned*/, 2 /*dataLen*/);
  }
  /**
   * refreshGdCursorNameL is used to refresh the latest value of a variable from the Serialized
   * String the most common reason to serialize an Object as a string in to write to a file. There
   * can be several other reasons for serialization as well
   */
  public short refreshGdCursorNameL() {
    return (getShort(beginGdCursorNameL));
  }

  int localGdCursorNameTCounter = -1;

  public boolean isGdCursorNameTModified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localGdCursorNameTCounter != sharedCounter;
    localGdCursorNameTCounter = sharedCounter;
    return hasModified;
  }

  protected static final int GD_CURSOR_NAME_T_LEN = 128;
  /** serialize this GdCursorNameT */
  protected void serializeGdCursorNameT(char[] gdCursorNameT) {
    shareString.getSerializedField().incrementCounter();
    arraycopy(gdCursorNameT, 0, getStringValue(), beginGdCursorNameT, GD_CURSOR_NAME_T_LEN);
    localGdCursorNameTCounter = shareString.getSerializedField().getModifiedCounter();
  }

  protected char[] checkGdCursorNameTConstraints(char[] value) {
    return super.checkConstraints(value, 128, false, false);
  }
  /**
   * refreshGdCursorNameT is used to refresh the latest value of a variable from the Serialized
   * String the most common reason to serialize an Object as a string in to write to a file. There
   * can be several other reasons for serialization as well
   */
  public char[] refreshGdCursorNameT() {
    return (substring(
        getStringValue(), beginGdCursorNameT, beginGdCursorNameT + GD_CURSOR_NAME_T_LEN));
  }
}
