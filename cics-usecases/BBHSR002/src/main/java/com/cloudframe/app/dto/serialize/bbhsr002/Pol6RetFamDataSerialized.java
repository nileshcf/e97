package com.cloudframe.app.dto.serialize.bbhsr002;

/**
 * The class Pol6RetFamDataSerialized is used to define offsets in order to serialize in a fixed
 * String
 *
 * @author CloudFrame Inc. created on 2025-03-25 at 08:29. using version 5.0.0.231
 */
import com.cloudframe.app.data.Field;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Pol6RetFamDataSerialized extends Field {

  protected Logger logger = LoggerFactory.getLogger(Pol6RetFamDataSerialized.class);
  /*  Length of the field, if serialized as a String */
  protected static final int POL_6_RET_FAM_DATA_LENGTH = 7;
  /*  offset of each of Child Fields when serialized as a String */
  protected int beginPol6RetFamDedDesc;
  protected int beginPol6RetFamDedCaroCd;

  /** Constructor for Pol6RetFamDataSerialized */
  public Pol6RetFamDataSerialized() {
    // TO-DO auto generated code
  }

  /**
   * Constructor for Pol6RetFamDataSerialized. sets the parent value to the parent
   *
   * @param parent
   * @param begin
   */
  public Pol6RetFamDataSerialized(Field parent, int begin) {
    setParent(parent, begin);
  }

  /**
   * sets parent for this Pol6RetFamDataSerialized to the parent
   *
   * @param parent
   */
  @Override
  public void setParent(Field parent) {
    setParent(parent, 89); // serialize this field at offset 89 by default
  }

  /**
   * sets parent for this Pol6RetFamDataSerialized to the parent and set the serialize offset to
   * parameter begin
   *
   * @param parent
   * @param begin - offset used when serializing this object to a String
   */
  public void setParent(Field parent, int begin) {
    super.setParent(parent);
    init(begin); // serialize this field at offset 89 by default
  }
  /** initializes the field in Pol6RetFamDataSerialized */
  @Override
  protected void init(int begin) {
    setStartOffset(begin);
    setLength(POL_6_RET_FAM_DATA_LENGTH);
    /*  set the offset/position of each field when this object is serialized as String */
    beginPol6RetFamDedDesc = getStartOffset() + 0; // set offset for serialization

    beginPol6RetFamDedCaroCd = getStartOffset() + 6; // set offset for serialization

    /*  end of offset */
  }

  int localPol6RetFamDedDescCounter = -1;

  public boolean isPol6RetFamDedDescModified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localPol6RetFamDedDescCounter != sharedCounter;
    localPol6RetFamDedDescCounter = sharedCounter;
    return hasModified;
  }

  protected static final int POL_6_RET_FAM_DED_DESC_LEN = 6;
  /** serialize this Pol6RetFamDedDesc */
  protected void serializePol6RetFamDedDesc(char[] pol6RetFamDedDesc) {
    shareString.getSerializedField().incrementCounter();
    arraycopy(
        pol6RetFamDedDesc, 0, getStringValue(), beginPol6RetFamDedDesc, POL_6_RET_FAM_DED_DESC_LEN);
    localPol6RetFamDedDescCounter = shareString.getSerializedField().getModifiedCounter();
  }

  protected char[] checkPol6RetFamDedDescConstraints(char[] value) {
    return super.checkConstraints(value, 6, false, false);
  }
  /**
   * refreshPol6RetFamDedDesc is used to refresh the latest value of a variable from the Serialized
   * String the most common reason to serialize an Object as a string in to write to a file. There
   * can be several other reasons for serialization as well
   */
  public char[] refreshPol6RetFamDedDesc() {
    return (substring(
        getStringValue(),
        beginPol6RetFamDedDesc,
        beginPol6RetFamDedDesc + POL_6_RET_FAM_DED_DESC_LEN));
  }

  int localPol6RetFamDedCaroCdCounter = -1;

  public boolean isPol6RetFamDedCaroCdModified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localPol6RetFamDedCaroCdCounter != sharedCounter;
    localPol6RetFamDedCaroCdCounter = sharedCounter;
    return hasModified;
  }

  protected static final int POL_6_RET_FAM_DED_CARO_CD_LEN = 1;
  /** serialize this Pol6RetFamDedCaroCd */
  protected void serializePol6RetFamDedCaroCd(char[] pol6RetFamDedCaroCd) {
    shareString.getSerializedField().incrementCounter();
    arraycopy(
        pol6RetFamDedCaroCd,
        0,
        getStringValue(),
        beginPol6RetFamDedCaroCd,
        POL_6_RET_FAM_DED_CARO_CD_LEN);
    localPol6RetFamDedCaroCdCounter = shareString.getSerializedField().getModifiedCounter();
  }

  protected char[] checkPol6RetFamDedCaroCdConstraints(char[] value) {
    return super.checkConstraints(value, 1, false, false);
  }
  /**
   * refreshPol6RetFamDedCaroCd is used to refresh the latest value of a variable from the
   * Serialized String the most common reason to serialize an Object as a string in to write to a
   * file. There can be several other reasons for serialization as well
   */
  public char[] refreshPol6RetFamDedCaroCd() {
    return (substring(
        getStringValue(),
        beginPol6RetFamDedCaroCd,
        beginPol6RetFamDedCaroCd + POL_6_RET_FAM_DED_CARO_CD_LEN));
  }
}
