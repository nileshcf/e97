package com.cloudframe.app.dto.serialize.bbhsr002;

/**
 * The class Pol6RetIndvDataSerialized is used to define offsets in order to serialize in a fixed
 * String
 *
 * @author CloudFrame Inc. created on 2025-03-25 at 08:29. using version 5.0.0.231
 */
import com.cloudframe.app.data.Field;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Pol6RetIndvDataSerialized extends Field {

  protected Logger logger = LoggerFactory.getLogger(Pol6RetIndvDataSerialized.class);
  /*  Length of the field, if serialized as a String */
  protected static final int POL_6_RET_INDV_DATA_LENGTH = 8;
  /*  offset of each of Child Fields when serialized as a String */
  protected int beginPol6RetIndDedDesc;
  protected int beginPol6RetIndDedNetTyp;
  protected int beginPol6RetIndvDedCaroCd;

  /** Constructor for Pol6RetIndvDataSerialized */
  public Pol6RetIndvDataSerialized() {
    // TO-DO auto generated code
  }

  /**
   * Constructor for Pol6RetIndvDataSerialized. sets the parent value to the parent
   *
   * @param parent
   * @param begin
   */
  public Pol6RetIndvDataSerialized(Field parent, int begin) {
    setParent(parent, begin);
  }

  /**
   * sets parent for this Pol6RetIndvDataSerialized to the parent
   *
   * @param parent
   */
  @Override
  public void setParent(Field parent) {
    setParent(parent, 41); // serialize this field at offset 41 by default
  }

  /**
   * sets parent for this Pol6RetIndvDataSerialized to the parent and set the serialize offset to
   * parameter begin
   *
   * @param parent
   * @param begin - offset used when serializing this object to a String
   */
  public void setParent(Field parent, int begin) {
    super.setParent(parent);
    init(begin); // serialize this field at offset 41 by default
  }
  /** initializes the field in Pol6RetIndvDataSerialized */
  @Override
  protected void init(int begin) {
    setStartOffset(begin);
    setLength(POL_6_RET_INDV_DATA_LENGTH);
    /*  set the offset/position of each field when this object is serialized as String */
    beginPol6RetIndDedDesc = getStartOffset() + 0; // set offset for serialization

    beginPol6RetIndDedNetTyp = getStartOffset() + 6; // set offset for serialization

    beginPol6RetIndvDedCaroCd = getStartOffset() + 7; // set offset for serialization

    /*  end of offset */
  }

  int localPol6RetIndDedDescCounter = -1;

  public boolean isPol6RetIndDedDescModified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localPol6RetIndDedDescCounter != sharedCounter;
    localPol6RetIndDedDescCounter = sharedCounter;
    return hasModified;
  }

  protected static final int POL_6_RET_IND_DED_DESC_LEN = 6;
  /** serialize this Pol6RetIndDedDesc */
  protected void serializePol6RetIndDedDesc(char[] pol6RetIndDedDesc) {
    shareString.getSerializedField().incrementCounter();
    arraycopy(
        pol6RetIndDedDesc, 0, getStringValue(), beginPol6RetIndDedDesc, POL_6_RET_IND_DED_DESC_LEN);
    localPol6RetIndDedDescCounter = shareString.getSerializedField().getModifiedCounter();
  }

  protected char[] checkPol6RetIndDedDescConstraints(char[] value) {
    return super.checkConstraints(value, 6, false, false);
  }
  /**
   * refreshPol6RetIndDedDesc is used to refresh the latest value of a variable from the Serialized
   * String the most common reason to serialize an Object as a string in to write to a file. There
   * can be several other reasons for serialization as well
   */
  public char[] refreshPol6RetIndDedDesc() {
    return (substring(
        getStringValue(),
        beginPol6RetIndDedDesc,
        beginPol6RetIndDedDesc + POL_6_RET_IND_DED_DESC_LEN));
  }

  int localPol6RetIndDedNetTypCounter = -1;

  public boolean isPol6RetIndDedNetTypModified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localPol6RetIndDedNetTypCounter != sharedCounter;
    localPol6RetIndDedNetTypCounter = sharedCounter;
    return hasModified;
  }

  protected static final int POL_6_RET_IND_DED_NET_TYP_LEN = 1;
  /** serialize this Pol6RetIndDedNetTyp */
  protected void serializePol6RetIndDedNetTyp(char[] pol6RetIndDedNetTyp) {
    shareString.getSerializedField().incrementCounter();
    arraycopy(
        pol6RetIndDedNetTyp,
        0,
        getStringValue(),
        beginPol6RetIndDedNetTyp,
        POL_6_RET_IND_DED_NET_TYP_LEN);
    localPol6RetIndDedNetTypCounter = shareString.getSerializedField().getModifiedCounter();
  }

  protected char[] checkPol6RetIndDedNetTypConstraints(char[] value) {
    return super.checkConstraints(value, 1, false, false);
  }
  /**
   * refreshPol6RetIndDedNetTyp is used to refresh the latest value of a variable from the
   * Serialized String the most common reason to serialize an Object as a string in to write to a
   * file. There can be several other reasons for serialization as well
   */
  public char[] refreshPol6RetIndDedNetTyp() {
    return (substring(
        getStringValue(),
        beginPol6RetIndDedNetTyp,
        beginPol6RetIndDedNetTyp + POL_6_RET_IND_DED_NET_TYP_LEN));
  }

  int localPol6RetIndvDedCaroCdCounter = -1;

  public boolean isPol6RetIndvDedCaroCdModified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localPol6RetIndvDedCaroCdCounter != sharedCounter;
    localPol6RetIndvDedCaroCdCounter = sharedCounter;
    return hasModified;
  }

  protected static final int POL_6_RET_INDV_DED_CARO_CD_LEN = 1;
  /** serialize this Pol6RetIndvDedCaroCd */
  protected void serializePol6RetIndvDedCaroCd(char[] pol6RetIndvDedCaroCd) {
    shareString.getSerializedField().incrementCounter();
    arraycopy(
        pol6RetIndvDedCaroCd,
        0,
        getStringValue(),
        beginPol6RetIndvDedCaroCd,
        POL_6_RET_INDV_DED_CARO_CD_LEN);
    localPol6RetIndvDedCaroCdCounter = shareString.getSerializedField().getModifiedCounter();
  }

  protected char[] checkPol6RetIndvDedCaroCdConstraints(char[] value) {
    return super.checkConstraints(value, 1, false, false);
  }
  /**
   * refreshPol6RetIndvDedCaroCd is used to refresh the latest value of a variable from the
   * Serialized String the most common reason to serialize an Object as a string in to write to a
   * file. There can be several other reasons for serialization as well
   */
  public char[] refreshPol6RetIndvDedCaroCd() {
    return (substring(
        getStringValue(),
        beginPol6RetIndvDedCaroCd,
        beginPol6RetIndvDedCaroCd + POL_6_RET_INDV_DED_CARO_CD_LEN));
  }
}
