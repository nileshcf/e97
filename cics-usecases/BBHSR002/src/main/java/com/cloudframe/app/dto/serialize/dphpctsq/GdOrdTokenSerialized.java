package com.cloudframe.app.dto.serialize.dphpctsq;

/**
 * The class GdOrdTokenSerialized is used to define offsets in order to serialize in a fixed String
 *
 * @author CloudFrame Inc. created on 2025-03-25 at 08:30. using version 5.0.0.231
 */
import com.cloudframe.app.data.Field;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class GdOrdTokenSerialized extends Field {

  protected Logger logger = LoggerFactory.getLogger(GdOrdTokenSerialized.class);
  /*  Length of the field, if serialized as a String */
  protected static final int GD_ORD_TOKEN_LENGTH = 517;
  /*  offset of each of Child Fields when serialized as a String */
  protected int beginGdOrdTokenL;
  protected int beginGdOrdTokenT;

  /** Constructor for GdOrdTokenSerialized */
  public GdOrdTokenSerialized() {
    // TO-DO auto generated code
  }

  /**
   * Constructor for GdOrdTokenSerialized. sets the parent value to the parent
   *
   * @param parent
   * @param begin
   */
  public GdOrdTokenSerialized(Field parent, int begin) {
    setParent(parent, begin);
  }

  /**
   * sets parent for this GdOrdTokenSerialized to the parent
   *
   * @param parent
   */
  @Override
  public void setParent(Field parent) {
    setParent(parent, 4040); // serialize this field at offset 4040 by default
  }

  /**
   * sets parent for this GdOrdTokenSerialized to the parent and set the serialize offset to
   * parameter begin
   *
   * @param parent
   * @param begin - offset used when serializing this object to a String
   */
  public void setParent(Field parent, int begin) {
    super.setParent(parent);
    init(begin); // serialize this field at offset 4040 by default
  }
  /** initializes the field in GdOrdTokenSerialized */
  @Override
  protected void init(int begin) {
    setStartOffset(begin);
    setLength(GD_ORD_TOKEN_LENGTH);
    /*  set the offset/position of each field when this object is serialized as String */
    beginGdOrdTokenL = getStartOffset() + 0; // set offset for serialization

    beginGdOrdTokenT = getStartOffset() + 2; // set offset for serialization

    /*  end of offset */
  }

  int localGdOrdTokenLCounter = -1;

  public boolean isGdOrdTokenLModified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localGdOrdTokenLCounter != sharedCounter;
    localGdOrdTokenLCounter = sharedCounter;
    return hasModified;
  }

  protected static final int GD_ORD_TOKEN_L_LEN = 2;
  /** serializeGdOrdTokenL */
  protected void serializeGdOrdTokenL(short gdOrdTokenL) {
    replaceValue( //  save the value as string
        getBinaryString(gdOrdTokenL, GD_ORD_TOKEN_L_LEN), beginGdOrdTokenL, GD_ORD_TOKEN_L_LEN);
    localGdOrdTokenLCounter = shareString.getSerializedField().getModifiedCounter();
  }

  protected short checkGdOrdTokenLMaxLimit(long number) {
    return (short) checkMaxLimit(number, true /*isSigned*/, 2 /*dataLen*/);
  }
  /**
   * refreshGdOrdTokenL is used to refresh the latest value of a variable from the Serialized String
   * the most common reason to serialize an Object as a string in to write to a file. There can be
   * several other reasons for serialization as well
   */
  public short refreshGdOrdTokenL() {
    return (getShort(beginGdOrdTokenL));
  }

  int localGdOrdTokenTCounter = -1;

  public boolean isGdOrdTokenTModified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localGdOrdTokenTCounter != sharedCounter;
    localGdOrdTokenTCounter = sharedCounter;
    return hasModified;
  }

  protected static final int GD_ORD_TOKEN_T_LEN = 515;
  /** serialize this GdOrdTokenT */
  protected void serializeGdOrdTokenT(char[] gdOrdTokenT) {
    shareString.getSerializedField().incrementCounter();
    arraycopy(gdOrdTokenT, 0, getStringValue(), beginGdOrdTokenT, GD_ORD_TOKEN_T_LEN);
    localGdOrdTokenTCounter = shareString.getSerializedField().getModifiedCounter();
  }

  protected char[] checkGdOrdTokenTConstraints(char[] value) {
    return super.checkConstraints(value, 515, false, false);
  }
  /**
   * refreshGdOrdTokenT is used to refresh the latest value of a variable from the Serialized String
   * the most common reason to serialize an Object as a string in to write to a file. There can be
   * several other reasons for serialization as well
   */
  public char[] refreshGdOrdTokenT() {
    return (substring(getStringValue(), beginGdOrdTokenT, beginGdOrdTokenT + GD_ORD_TOKEN_T_LEN));
  }
}
