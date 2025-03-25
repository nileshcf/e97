package com.cloudframe.app.dto.serialize.dphpctsq;

/**
 * The class GdCatalogNameSerialized is used to define offsets in order to serialize in a fixed
 * String
 *
 * @author CloudFrame Inc. created on 2025-03-25 at 08:30. using version 5.0.0.231
 */
import com.cloudframe.app.data.Field;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class GdCatalogNameSerialized extends Field {

  protected Logger logger = LoggerFactory.getLogger(GdCatalogNameSerialized.class);
  /*  Length of the field, if serialized as a String */
  protected static final int GD_CATALOG_NAME_LENGTH = 130;
  /*  offset of each of Child Fields when serialized as a String */
  protected int beginGdCatalogNameL;
  protected int beginGdCatalogNameT;

  /** Constructor for GdCatalogNameSerialized */
  public GdCatalogNameSerialized() {
    // TO-DO auto generated code
  }

  /**
   * Constructor for GdCatalogNameSerialized. sets the parent value to the parent
   *
   * @param parent
   * @param begin
   */
  public GdCatalogNameSerialized(Field parent, int begin) {
    setParent(parent, begin);
  }

  /**
   * sets parent for this GdCatalogNameSerialized to the parent
   *
   * @param parent
   */
  @Override
  public void setParent(Field parent) {
    setParent(parent, 3734); // serialize this field at offset 3734 by default
  }

  /**
   * sets parent for this GdCatalogNameSerialized to the parent and set the serialize offset to
   * parameter begin
   *
   * @param parent
   * @param begin - offset used when serializing this object to a String
   */
  public void setParent(Field parent, int begin) {
    super.setParent(parent);
    init(begin); // serialize this field at offset 3734 by default
  }
  /** initializes the field in GdCatalogNameSerialized */
  @Override
  protected void init(int begin) {
    setStartOffset(begin);
    setLength(GD_CATALOG_NAME_LENGTH);
    /*  set the offset/position of each field when this object is serialized as String */
    beginGdCatalogNameL = getStartOffset() + 0; // set offset for serialization

    beginGdCatalogNameT = getStartOffset() + 2; // set offset for serialization

    /*  end of offset */
  }

  int localGdCatalogNameLCounter = -1;

  public boolean isGdCatalogNameLModified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localGdCatalogNameLCounter != sharedCounter;
    localGdCatalogNameLCounter = sharedCounter;
    return hasModified;
  }

  protected static final int GD_CATALOG_NAME_L_LEN = 2;
  /** serializeGdCatalogNameL */
  protected void serializeGdCatalogNameL(short gdCatalogNameL) {
    replaceValue( //  save the value as string
        getBinaryString(gdCatalogNameL, GD_CATALOG_NAME_L_LEN),
        beginGdCatalogNameL,
        GD_CATALOG_NAME_L_LEN);
    localGdCatalogNameLCounter = shareString.getSerializedField().getModifiedCounter();
  }

  protected short checkGdCatalogNameLMaxLimit(long number) {
    return (short) checkMaxLimit(number, true /*isSigned*/, 2 /*dataLen*/);
  }
  /**
   * refreshGdCatalogNameL is used to refresh the latest value of a variable from the Serialized
   * String the most common reason to serialize an Object as a string in to write to a file. There
   * can be several other reasons for serialization as well
   */
  public short refreshGdCatalogNameL() {
    return (getShort(beginGdCatalogNameL));
  }

  int localGdCatalogNameTCounter = -1;

  public boolean isGdCatalogNameTModified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localGdCatalogNameTCounter != sharedCounter;
    localGdCatalogNameTCounter = sharedCounter;
    return hasModified;
  }

  protected static final int GD_CATALOG_NAME_T_LEN = 128;
  /** serialize this GdCatalogNameT */
  protected void serializeGdCatalogNameT(char[] gdCatalogNameT) {
    shareString.getSerializedField().incrementCounter();
    arraycopy(gdCatalogNameT, 0, getStringValue(), beginGdCatalogNameT, GD_CATALOG_NAME_T_LEN);
    localGdCatalogNameTCounter = shareString.getSerializedField().getModifiedCounter();
  }

  protected char[] checkGdCatalogNameTConstraints(char[] value) {
    return super.checkConstraints(value, 128, false, false);
  }
  /**
   * refreshGdCatalogNameT is used to refresh the latest value of a variable from the Serialized
   * String the most common reason to serialize an Object as a string in to write to a file. There
   * can be several other reasons for serialization as well
   */
  public char[] refreshGdCatalogNameT() {
    return (substring(
        getStringValue(), beginGdCatalogNameT, beginGdCatalogNameT + GD_CATALOG_NAME_T_LEN));
  }
}
