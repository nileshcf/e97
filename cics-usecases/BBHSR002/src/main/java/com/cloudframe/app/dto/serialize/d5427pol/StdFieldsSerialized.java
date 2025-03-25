package com.cloudframe.app.dto.serialize.d5427pol;

/**
 * The class StdFieldsSerialized is used to define offsets in order to serialize in a fixed String
 *
 * @author CloudFrame Inc. created on 2025-03-25 at 08:31. using version 5.0.0.231
 */
import com.cloudframe.app.data.Field;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class StdFieldsSerialized extends Field {

  protected Logger logger = LoggerFactory.getLogger(StdFieldsSerialized.class);
  /*  Length of the field, if serialized as a String */
  protected static final int STD_FIELDS_LENGTH = 24;
  /*  offset of each of Child Fields when serialized as a String */
  protected int beginStdPolNbr;
  protected int beginStdPlnNbr;
  protected int beginStdClssNbr;
  protected int beginCovEndDt;

  /** Constructor for StdFieldsSerialized */
  public StdFieldsSerialized() {
    // TO-DO auto generated code
  }

  /**
   * Constructor for StdFieldsSerialized. sets the parent value to the parent
   *
   * @param parent
   * @param begin
   */
  public StdFieldsSerialized(Field parent, int begin) {
    setParent(parent, begin);
  }

  /**
   * sets parent for this StdFieldsSerialized to the parent
   *
   * @param parent
   */
  @Override
  public void setParent(Field parent) {
    setParent(parent, 0); // serialize this field at offset 0 by default
  }

  /**
   * sets parent for this StdFieldsSerialized to the parent and set the serialize offset to
   * parameter begin
   *
   * @param parent
   * @param begin - offset used when serializing this object to a String
   */
  public void setParent(Field parent, int begin) {
    super.setParent(parent);
    init(begin); // serialize this field at offset 0 by default
  }
  /** initializes the field in StdFieldsSerialized */
  @Override
  protected void init(int begin) {
    setStartOffset(begin);
    setLength(STD_FIELDS_LENGTH);
    /*  set the offset/position of each field when this object is serialized as String */
    beginStdPolNbr = getStartOffset() + 0; // set offset for serialization

    beginStdPlnNbr = getStartOffset() + 6; // set offset for serialization

    beginStdClssNbr = getStartOffset() + 10; // set offset for serialization

    beginCovEndDt = getStartOffset() + 14; // set offset for serialization

    /*  end of offset */
  }

  int localStdPolNbrCounter = -1;

  public boolean isStdPolNbrModified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localStdPolNbrCounter != sharedCounter;
    localStdPolNbrCounter = sharedCounter;
    return hasModified;
  }

  protected static final int STD_POL_NBR_LEN = 6;
  /** serialize this StdPolNbr */
  protected void serializeStdPolNbr(char[] stdPolNbr) {
    shareString.getSerializedField().incrementCounter();
    arraycopy(stdPolNbr, 0, getStringValue(), beginStdPolNbr, STD_POL_NBR_LEN);
    localStdPolNbrCounter = shareString.getSerializedField().getModifiedCounter();
  }

  protected char[] checkStdPolNbrConstraints(char[] value) {
    return super.checkConstraints(value, 6, false, false);
  }
  /**
   * refreshStdPolNbr is used to refresh the latest value of a variable from the Serialized String
   * the most common reason to serialize an Object as a string in to write to a file. There can be
   * several other reasons for serialization as well
   */
  public char[] refreshStdPolNbr() {
    return (substring(getStringValue(), beginStdPolNbr, beginStdPolNbr + STD_POL_NBR_LEN));
  }

  int localStdPlnNbrCounter = -1;

  public boolean isStdPlnNbrModified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localStdPlnNbrCounter != sharedCounter;
    localStdPlnNbrCounter = sharedCounter;
    return hasModified;
  }

  protected static final int STD_PLN_NBR_LEN = 4;
  /** serialize this StdPlnNbr */
  protected void serializeStdPlnNbr(char[] stdPlnNbr) {
    shareString.getSerializedField().incrementCounter();
    arraycopy(stdPlnNbr, 0, getStringValue(), beginStdPlnNbr, STD_PLN_NBR_LEN);
    localStdPlnNbrCounter = shareString.getSerializedField().getModifiedCounter();
  }

  protected char[] checkStdPlnNbrConstraints(char[] value) {
    return super.checkConstraints(value, 4, false, false);
  }
  /**
   * refreshStdPlnNbr is used to refresh the latest value of a variable from the Serialized String
   * the most common reason to serialize an Object as a string in to write to a file. There can be
   * several other reasons for serialization as well
   */
  public char[] refreshStdPlnNbr() {
    return (substring(getStringValue(), beginStdPlnNbr, beginStdPlnNbr + STD_PLN_NBR_LEN));
  }

  int localStdClssNbrCounter = -1;

  public boolean isStdClssNbrModified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localStdClssNbrCounter != sharedCounter;
    localStdClssNbrCounter = sharedCounter;
    return hasModified;
  }

  protected static final int STD_CLSS_NBR_LEN = 4;
  /** serialize this StdClssNbr */
  protected void serializeStdClssNbr(char[] stdClssNbr) {
    shareString.getSerializedField().incrementCounter();
    arraycopy(stdClssNbr, 0, getStringValue(), beginStdClssNbr, STD_CLSS_NBR_LEN);
    localStdClssNbrCounter = shareString.getSerializedField().getModifiedCounter();
  }

  protected char[] checkStdClssNbrConstraints(char[] value) {
    return super.checkConstraints(value, 4, false, false);
  }
  /**
   * refreshStdClssNbr is used to refresh the latest value of a variable from the Serialized String
   * the most common reason to serialize an Object as a string in to write to a file. There can be
   * several other reasons for serialization as well
   */
  public char[] refreshStdClssNbr() {
    return (substring(getStringValue(), beginStdClssNbr, beginStdClssNbr + STD_CLSS_NBR_LEN));
  }

  int localCovEndDtCounter = -1;

  public boolean isCovEndDtModified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localCovEndDtCounter != sharedCounter;
    localCovEndDtCounter = sharedCounter;
    return hasModified;
  }

  protected static final int COV_END_DT_LEN = 10;
  /** serialize this CovEndDt */
  protected void serializeCovEndDt(char[] covEndDt) {
    shareString.getSerializedField().incrementCounter();
    arraycopy(covEndDt, 0, getStringValue(), beginCovEndDt, COV_END_DT_LEN);
    localCovEndDtCounter = shareString.getSerializedField().getModifiedCounter();
  }

  protected char[] checkCovEndDtConstraints(char[] value) {
    return super.checkConstraints(value, 10, false, false);
  }
  /**
   * refreshCovEndDt is used to refresh the latest value of a variable from the Serialized String
   * the most common reason to serialize an Object as a string in to write to a file. There can be
   * several other reasons for serialization as well
   */
  public char[] refreshCovEndDt() {
    return (substring(getStringValue(), beginCovEndDt, beginCovEndDt + COV_END_DT_LEN));
  }
}
