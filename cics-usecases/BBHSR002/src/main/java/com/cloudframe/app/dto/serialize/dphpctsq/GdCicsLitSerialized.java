package com.cloudframe.app.dto.serialize.dphpctsq;

/**
 * The class GdCicsLitSerialized is used to define offsets in order to serialize in a fixed String
 *
 * @author CloudFrame Inc. created on 2025-03-25 at 08:30. using version 5.0.0.231
 */
import com.cloudframe.app.data.Field;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class GdCicsLitSerialized extends Field {

  protected Logger logger = LoggerFactory.getLogger(GdCicsLitSerialized.class);
  /*  Length of the field, if serialized as a String */
  protected static final int GD_CICS_LIT_LENGTH = 112;
  /*  offset of each of Child Fields when serialized as a String */
  protected int beginGdEibtrnid;
  protected int beginGdEibtaskn;
  protected int beginGdEibdate;
  protected int beginGdEibtime;
  protected int beginGdDisplayLit;

  /** Constructor for GdCicsLitSerialized */
  public GdCicsLitSerialized() {
    // TO-DO auto generated code
  }

  /**
   * Constructor for GdCicsLitSerialized. sets the parent value to the parent
   *
   * @param parent
   * @param begin
   */
  public GdCicsLitSerialized(Field parent, int begin) {
    setParent(parent, begin);
  }

  /**
   * sets parent for this GdCicsLitSerialized to the parent
   *
   * @param parent
   */
  @Override
  public void setParent(Field parent) {
    setParent(parent, 53); // serialize this field at offset 53 by default
  }

  /**
   * sets parent for this GdCicsLitSerialized to the parent and set the serialize offset to
   * parameter begin
   *
   * @param parent
   * @param begin - offset used when serializing this object to a String
   */
  public void setParent(Field parent, int begin) {
    super.setParent(parent);
    init(begin); // serialize this field at offset 53 by default
  }
  /** initializes the field in GdCicsLitSerialized */
  @Override
  protected void init(int begin) {
    setStartOffset(begin);
    setLength(GD_CICS_LIT_LENGTH);
    /*  set the offset/position of each field when this object is serialized as String */
    beginGdEibtrnid = getStartOffset() + 0; // set offset for serialization

    beginGdEibtaskn = getStartOffset() + 5; // set offset for serialization

    beginGdEibdate = getStartOffset() + 14; // set offset for serialization

    beginGdEibtime = getStartOffset() + 23; // set offset for serialization

    beginGdDisplayLit = getStartOffset() + 32; // set offset for serialization

    /*  end of offset */
  }

  int localGdEibtrnidCounter = -1;

  public boolean isGdEibtrnidModified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localGdEibtrnidCounter != sharedCounter;
    localGdEibtrnidCounter = sharedCounter;
    return hasModified;
  }

  protected static final int GD_EIBTRNID_LEN = 4;
  /** serialize this GdEibtrnid */
  protected void serializeGdEibtrnid(char[] gdEibtrnid) {
    shareString.getSerializedField().incrementCounter();
    arraycopy(gdEibtrnid, 0, getStringValue(), beginGdEibtrnid, GD_EIBTRNID_LEN);
    localGdEibtrnidCounter = shareString.getSerializedField().getModifiedCounter();
  }

  protected char[] checkGdEibtrnidConstraints(char[] value) {
    return super.checkConstraints(value, 4, false, false);
  }
  /**
   * refreshGdEibtrnid is used to refresh the latest value of a variable from the Serialized String
   * the most common reason to serialize an Object as a string in to write to a file. There can be
   * several other reasons for serialization as well
   */
  public char[] refreshGdEibtrnid() {
    return (substring(getStringValue(), beginGdEibtrnid, beginGdEibtrnid + GD_EIBTRNID_LEN));
  }

  int localGdEibtasknCounter = -1;

  public boolean isGdEibtasknModified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localGdEibtasknCounter != sharedCounter;
    localGdEibtasknCounter = sharedCounter;
    return hasModified;
  }

  protected static final int GD_EIBTASKN_LEN = 8;
  /** serialize this GdEibtaskn */
  protected void serializeGdEibtaskn(char[] gdEibtaskn) {
    shareString.getSerializedField().incrementCounter();
    arraycopy(gdEibtaskn, 0, getStringValue(), beginGdEibtaskn, GD_EIBTASKN_LEN);
    localGdEibtasknCounter = shareString.getSerializedField().getModifiedCounter();
  }

  protected char[] checkGdEibtasknConstraints(char[] value) {
    return super.checkConstraints(value, 8, false, false);
  }
  /**
   * refreshGdEibtaskn is used to refresh the latest value of a variable from the Serialized String
   * the most common reason to serialize an Object as a string in to write to a file. There can be
   * several other reasons for serialization as well
   */
  public char[] refreshGdEibtaskn() {
    return (substring(getStringValue(), beginGdEibtaskn, beginGdEibtaskn + GD_EIBTASKN_LEN));
  }

  int localGdEibdateCounter = -1;

  public boolean isGdEibdateModified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localGdEibdateCounter != sharedCounter;
    localGdEibdateCounter = sharedCounter;
    return hasModified;
  }

  protected static final int GD_EIBDATE_LEN = 8;
  /** serialize this GdEibdate */
  protected void serializeGdEibdate(char[] gdEibdate) {
    shareString.getSerializedField().incrementCounter();
    arraycopy(gdEibdate, 0, getStringValue(), beginGdEibdate, GD_EIBDATE_LEN);
    localGdEibdateCounter = shareString.getSerializedField().getModifiedCounter();
  }

  protected char[] checkGdEibdateConstraints(char[] value) {
    return super.checkConstraints(value, 8, false, false);
  }
  /**
   * refreshGdEibdate is used to refresh the latest value of a variable from the Serialized String
   * the most common reason to serialize an Object as a string in to write to a file. There can be
   * several other reasons for serialization as well
   */
  public char[] refreshGdEibdate() {
    return (substring(getStringValue(), beginGdEibdate, beginGdEibdate + GD_EIBDATE_LEN));
  }

  int localGdEibtimeCounter = -1;

  public boolean isGdEibtimeModified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localGdEibtimeCounter != sharedCounter;
    localGdEibtimeCounter = sharedCounter;
    return hasModified;
  }

  protected static final int GD_EIBTIME_LEN = 8;
  /** serialize this GdEibtime */
  protected void serializeGdEibtime(char[] gdEibtime) {
    shareString.getSerializedField().incrementCounter();
    arraycopy(gdEibtime, 0, getStringValue(), beginGdEibtime, GD_EIBTIME_LEN);
    localGdEibtimeCounter = shareString.getSerializedField().getModifiedCounter();
  }

  protected char[] checkGdEibtimeConstraints(char[] value) {
    return super.checkConstraints(value, 8, false, false);
  }
  /**
   * refreshGdEibtime is used to refresh the latest value of a variable from the Serialized String
   * the most common reason to serialize an Object as a string in to write to a file. There can be
   * several other reasons for serialization as well
   */
  public char[] refreshGdEibtime() {
    return (substring(getStringValue(), beginGdEibtime, beginGdEibtime + GD_EIBTIME_LEN));
  }

  int localGdDisplayLitCounter = -1;

  public boolean isGdDisplayLitModified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localGdDisplayLitCounter != sharedCounter;
    localGdDisplayLitCounter = sharedCounter;
    return hasModified;
  }

  protected static final int GD_DISPLAY_LIT_LEN = 80;
  /** serialize this GdDisplayLit */
  protected void serializeGdDisplayLit(char[] gdDisplayLit) {
    shareString.getSerializedField().incrementCounter();
    arraycopy(gdDisplayLit, 0, getStringValue(), beginGdDisplayLit, GD_DISPLAY_LIT_LEN);
    localGdDisplayLitCounter = shareString.getSerializedField().getModifiedCounter();
  }

  protected char[] checkGdDisplayLitConstraints(char[] value) {
    return super.checkConstraints(value, 80, false, false);
  }
  /**
   * refreshGdDisplayLit is used to refresh the latest value of a variable from the Serialized
   * String the most common reason to serialize an Object as a string in to write to a file. There
   * can be several other reasons for serialization as well
   */
  public char[] refreshGdDisplayLit() {
    return (substring(getStringValue(), beginGdDisplayLit, beginGdDisplayLit + GD_DISPLAY_LIT_LEN));
  }
}
