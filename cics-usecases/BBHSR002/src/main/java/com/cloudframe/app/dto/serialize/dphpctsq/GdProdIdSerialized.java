package com.cloudframe.app.dto.serialize.dphpctsq;

/**
 * The class GdProdIdSerialized is used to define offsets in order to serialize in a fixed String
 *
 * @author CloudFrame Inc. created on 2025-03-25 at 08:30. using version 5.0.0.231
 */
import com.cloudframe.app.data.Field;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class GdProdIdSerialized extends Field {

  protected Logger logger = LoggerFactory.getLogger(GdProdIdSerialized.class);
  /*  Length of the field, if serialized as a String */
  protected static final int GD_PROD_ID_LENGTH = 10;
  /*  offset of each of Child Fields when serialized as a String */
  protected int beginGdProdIdL;
  protected int beginGdProdIdT;

  /** Constructor for GdProdIdSerialized */
  public GdProdIdSerialized() {
    // TO-DO auto generated code
  }

  /**
   * Constructor for GdProdIdSerialized. sets the parent value to the parent
   *
   * @param parent
   * @param begin
   */
  public GdProdIdSerialized(Field parent, int begin) {
    setParent(parent, begin);
  }

  /**
   * sets parent for this GdProdIdSerialized to the parent
   *
   * @param parent
   */
  @Override
  public void setParent(Field parent) {
    setParent(parent, 88742); // serialize this field at offset 88742 by default
  }

  /**
   * sets parent for this GdProdIdSerialized to the parent and set the serialize offset to parameter
   * begin
   *
   * @param parent
   * @param begin - offset used when serializing this object to a String
   */
  public void setParent(Field parent, int begin) {
    super.setParent(parent);
    init(begin); // serialize this field at offset 88742 by default
  }
  /** initializes the field in GdProdIdSerialized */
  @Override
  protected void init(int begin) {
    setStartOffset(begin);
    setLength(GD_PROD_ID_LENGTH);
    /*  set the offset/position of each field when this object is serialized as String */
    beginGdProdIdL = getStartOffset() + 0; // set offset for serialization

    beginGdProdIdT = getStartOffset() + 2; // set offset for serialization

    /*  end of offset */
  }

  int localGdProdIdLCounter = -1;

  public boolean isGdProdIdLModified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localGdProdIdLCounter != sharedCounter;
    localGdProdIdLCounter = sharedCounter;
    return hasModified;
  }

  protected static final int GD_PROD_ID_L_LEN = 2;
  /** serializeGdProdIdL */
  protected void serializeGdProdIdL(short gdProdIdL) {
    replaceValue( //  save the value as string
        getBinaryString(gdProdIdL, GD_PROD_ID_L_LEN), beginGdProdIdL, GD_PROD_ID_L_LEN);
    localGdProdIdLCounter = shareString.getSerializedField().getModifiedCounter();
  }

  protected short checkGdProdIdLMaxLimit(long number) {
    return (short) checkMaxLimit(number, true /*isSigned*/, 2 /*dataLen*/);
  }
  /**
   * refreshGdProdIdL is used to refresh the latest value of a variable from the Serialized String
   * the most common reason to serialize an Object as a string in to write to a file. There can be
   * several other reasons for serialization as well
   */
  public short refreshGdProdIdL() {
    return (getShort(beginGdProdIdL));
  }

  int localGdProdIdTCounter = -1;

  public boolean isGdProdIdTModified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localGdProdIdTCounter != sharedCounter;
    localGdProdIdTCounter = sharedCounter;
    return hasModified;
  }

  protected static final int GD_PROD_ID_T_LEN = 8;
  /** serialize this GdProdIdT */
  protected void serializeGdProdIdT(char[] gdProdIdT) {
    shareString.getSerializedField().incrementCounter();
    arraycopy(gdProdIdT, 0, getStringValue(), beginGdProdIdT, GD_PROD_ID_T_LEN);
    localGdProdIdTCounter = shareString.getSerializedField().getModifiedCounter();
  }

  protected char[] checkGdProdIdTConstraints(char[] value) {
    return super.checkConstraints(value, 8, false, false);
  }
  /**
   * refreshGdProdIdT is used to refresh the latest value of a variable from the Serialized String
   * the most common reason to serialize an Object as a string in to write to a file. There can be
   * several other reasons for serialization as well
   */
  public char[] refreshGdProdIdT() {
    return (substring(getStringValue(), beginGdProdIdT, beginGdProdIdT + GD_PROD_ID_T_LEN));
  }
}
