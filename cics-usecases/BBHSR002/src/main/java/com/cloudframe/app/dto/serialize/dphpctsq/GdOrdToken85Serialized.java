package com.cloudframe.app.dto.serialize.dphpctsq;

/**
 * The class GdOrdToken85Serialized is used to define offsets in order to serialize in a fixed
 * String
 *
 * @author CloudFrame Inc. created on 2025-03-25 at 08:30. using version 5.0.0.231
 */
import com.cloudframe.app.data.Field;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class GdOrdToken85Serialized extends Field {

  protected Logger logger = LoggerFactory.getLogger(GdOrdToken85Serialized.class);
  /*  Length of the field, if serialized as a String */
  protected static final int GD_ORD_TOKEN_85_LENGTH = 517;
  /*  offset of each of Child Fields when serialized as a String */
  protected int beginGdOrdToken85L;
  protected int beginGdOrdToken85T;

  /** Constructor for GdOrdToken85Serialized */
  public GdOrdToken85Serialized() {
    // TO-DO auto generated code
  }

  /**
   * Constructor for GdOrdToken85Serialized. sets the parent value to the parent
   *
   * @param parent
   * @param begin
   */
  public GdOrdToken85Serialized(Field parent, int begin) {
    setParent(parent, begin);
  }

  /**
   * sets parent for this GdOrdToken85Serialized to the parent
   *
   * @param parent
   */
  @Override
  public void setParent(Field parent) {
    setParent(parent, 47468); // serialize this field at offset 47468 by default
  }

  /**
   * sets parent for this GdOrdToken85Serialized to the parent and set the serialize offset to
   * parameter begin
   *
   * @param parent
   * @param begin - offset used when serializing this object to a String
   */
  public void setParent(Field parent, int begin) {
    super.setParent(parent);
    init(begin); // serialize this field at offset 47468 by default
  }
  /** initializes the field in GdOrdToken85Serialized */
  @Override
  protected void init(int begin) {
    setStartOffset(begin);
    setLength(GD_ORD_TOKEN_85_LENGTH);
    /*  set the offset/position of each field when this object is serialized as String */
    beginGdOrdToken85L = getStartOffset() + 0; // set offset for serialization

    beginGdOrdToken85T = getStartOffset() + 2; // set offset for serialization

    /*  end of offset */
  }

  int localGdOrdToken85LCounter = -1;

  public boolean isGdOrdToken85LModified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localGdOrdToken85LCounter != sharedCounter;
    localGdOrdToken85LCounter = sharedCounter;
    return hasModified;
  }

  protected static final int GD_ORD_TOKEN_85_L_LEN = 2;
  /** serializeGdOrdToken85L */
  protected void serializeGdOrdToken85L(short gdOrdToken85L) {
    replaceValue( //  save the value as string
        getBinaryString(gdOrdToken85L, GD_ORD_TOKEN_85_L_LEN),
        beginGdOrdToken85L,
        GD_ORD_TOKEN_85_L_LEN);
    localGdOrdToken85LCounter = shareString.getSerializedField().getModifiedCounter();
  }

  protected short checkGdOrdToken85LMaxLimit(long number) {
    return (short) checkMaxLimit(number, true /*isSigned*/, 2 /*dataLen*/);
  }
  /**
   * refreshGdOrdToken85L is used to refresh the latest value of a variable from the Serialized
   * String the most common reason to serialize an Object as a string in to write to a file. There
   * can be several other reasons for serialization as well
   */
  public short refreshGdOrdToken85L() {
    return (getShort(beginGdOrdToken85L));
  }

  int localGdOrdToken85TCounter = -1;

  public boolean isGdOrdToken85TModified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localGdOrdToken85TCounter != sharedCounter;
    localGdOrdToken85TCounter = sharedCounter;
    return hasModified;
  }

  protected static final int GD_ORD_TOKEN_85_T_LEN = 515;
  /** serialize this GdOrdToken85T */
  protected void serializeGdOrdToken85T(char[] gdOrdToken85T) {
    shareString.getSerializedField().incrementCounter();
    arraycopy(gdOrdToken85T, 0, getStringValue(), beginGdOrdToken85T, GD_ORD_TOKEN_85_T_LEN);
    localGdOrdToken85TCounter = shareString.getSerializedField().getModifiedCounter();
  }

  protected char[] checkGdOrdToken85TConstraints(char[] value) {
    return super.checkConstraints(value, 515, false, false);
  }
  /**
   * refreshGdOrdToken85T is used to refresh the latest value of a variable from the Serialized
   * String the most common reason to serialize an Object as a string in to write to a file. There
   * can be several other reasons for serialization as well
   */
  public char[] refreshGdOrdToken85T() {
    return (substring(
        getStringValue(), beginGdOrdToken85T, beginGdOrdToken85T + GD_ORD_TOKEN_85_T_LEN));
  }
}
