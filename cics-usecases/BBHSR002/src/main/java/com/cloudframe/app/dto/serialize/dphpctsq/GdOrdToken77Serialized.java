package com.cloudframe.app.dto.serialize.dphpctsq;

/**
 * The class GdOrdToken77Serialized is used to define offsets in order to serialize in a fixed
 * String
 *
 * @author CloudFrame Inc. created on 2025-03-25 at 08:30. using version 5.0.0.231
 */
import com.cloudframe.app.data.Field;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class GdOrdToken77Serialized extends Field {

  protected Logger logger = LoggerFactory.getLogger(GdOrdToken77Serialized.class);
  /*  Length of the field, if serialized as a String */
  protected static final int GD_ORD_TOKEN_77_LENGTH = 517;
  /*  offset of each of Child Fields when serialized as a String */
  protected int beginGdOrdToken77L;
  protected int beginGdOrdToken77T;

  /** Constructor for GdOrdToken77Serialized */
  public GdOrdToken77Serialized() {
    // TO-DO auto generated code
  }

  /**
   * Constructor for GdOrdToken77Serialized. sets the parent value to the parent
   *
   * @param parent
   * @param begin
   */
  public GdOrdToken77Serialized(Field parent, int begin) {
    setParent(parent, begin);
  }

  /**
   * sets parent for this GdOrdToken77Serialized to the parent
   *
   * @param parent
   */
  @Override
  public void setParent(Field parent) {
    setParent(parent, 43332); // serialize this field at offset 43332 by default
  }

  /**
   * sets parent for this GdOrdToken77Serialized to the parent and set the serialize offset to
   * parameter begin
   *
   * @param parent
   * @param begin - offset used when serializing this object to a String
   */
  public void setParent(Field parent, int begin) {
    super.setParent(parent);
    init(begin); // serialize this field at offset 43332 by default
  }
  /** initializes the field in GdOrdToken77Serialized */
  @Override
  protected void init(int begin) {
    setStartOffset(begin);
    setLength(GD_ORD_TOKEN_77_LENGTH);
    /*  set the offset/position of each field when this object is serialized as String */
    beginGdOrdToken77L = getStartOffset() + 0; // set offset for serialization

    beginGdOrdToken77T = getStartOffset() + 2; // set offset for serialization

    /*  end of offset */
  }

  int localGdOrdToken77LCounter = -1;

  public boolean isGdOrdToken77LModified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localGdOrdToken77LCounter != sharedCounter;
    localGdOrdToken77LCounter = sharedCounter;
    return hasModified;
  }

  protected static final int GD_ORD_TOKEN_77_L_LEN = 2;
  /** serializeGdOrdToken77L */
  protected void serializeGdOrdToken77L(short gdOrdToken77L) {
    replaceValue( //  save the value as string
        getBinaryString(gdOrdToken77L, GD_ORD_TOKEN_77_L_LEN),
        beginGdOrdToken77L,
        GD_ORD_TOKEN_77_L_LEN);
    localGdOrdToken77LCounter = shareString.getSerializedField().getModifiedCounter();
  }

  protected short checkGdOrdToken77LMaxLimit(long number) {
    return (short) checkMaxLimit(number, true /*isSigned*/, 2 /*dataLen*/);
  }
  /**
   * refreshGdOrdToken77L is used to refresh the latest value of a variable from the Serialized
   * String the most common reason to serialize an Object as a string in to write to a file. There
   * can be several other reasons for serialization as well
   */
  public short refreshGdOrdToken77L() {
    return (getShort(beginGdOrdToken77L));
  }

  int localGdOrdToken77TCounter = -1;

  public boolean isGdOrdToken77TModified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localGdOrdToken77TCounter != sharedCounter;
    localGdOrdToken77TCounter = sharedCounter;
    return hasModified;
  }

  protected static final int GD_ORD_TOKEN_77_T_LEN = 515;
  /** serialize this GdOrdToken77T */
  protected void serializeGdOrdToken77T(char[] gdOrdToken77T) {
    shareString.getSerializedField().incrementCounter();
    arraycopy(gdOrdToken77T, 0, getStringValue(), beginGdOrdToken77T, GD_ORD_TOKEN_77_T_LEN);
    localGdOrdToken77TCounter = shareString.getSerializedField().getModifiedCounter();
  }

  protected char[] checkGdOrdToken77TConstraints(char[] value) {
    return super.checkConstraints(value, 515, false, false);
  }
  /**
   * refreshGdOrdToken77T is used to refresh the latest value of a variable from the Serialized
   * String the most common reason to serialize an Object as a string in to write to a file. There
   * can be several other reasons for serialization as well
   */
  public char[] refreshGdOrdToken77T() {
    return (substring(
        getStringValue(), beginGdOrdToken77T, beginGdOrdToken77T + GD_ORD_TOKEN_77_T_LEN));
  }
}
