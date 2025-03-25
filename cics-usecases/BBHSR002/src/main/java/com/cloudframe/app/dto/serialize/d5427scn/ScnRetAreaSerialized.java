package com.cloudframe.app.dto.serialize.d5427scn;

/**
 * The class ScnRetAreaSerialized is used to define offsets in order to serialize in a fixed String
 *
 * @author CloudFrame Inc. created on 2025-03-25 at 08:32. using version 5.0.0.231
 */
import com.cloudframe.app.data.Field;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ScnRetAreaSerialized extends Field {

  protected Logger logger = LoggerFactory.getLogger(ScnRetAreaSerialized.class);
  /*  Length of the field, if serialized as a String */
  protected static final int SCN_RET_AREA_LENGTH = 3;
  /*  offset of each of Child Fields when serialized as a String */
  protected int beginScnRetSrvcCdNbr;

  /** Constructor for ScnRetAreaSerialized */
  public ScnRetAreaSerialized() {
    // TO-DO auto generated code
  }

  /**
   * Constructor for ScnRetAreaSerialized. sets the parent value to the parent
   *
   * @param parent
   * @param begin
   */
  public ScnRetAreaSerialized(Field parent, int begin) {
    setParent(parent, begin);
  }

  /**
   * sets parent for this ScnRetAreaSerialized to the parent
   *
   * @param parent
   */
  @Override
  public void setParent(Field parent) {
    setParent(parent, 34); // serialize this field at offset 34 by default
  }

  /**
   * sets parent for this ScnRetAreaSerialized to the parent and set the serialize offset to
   * parameter begin
   *
   * @param parent
   * @param begin - offset used when serializing this object to a String
   */
  public void setParent(Field parent, int begin) {
    super.setParent(parent);
    init(begin); // serialize this field at offset 34 by default
  }
  /** initializes the field in ScnRetAreaSerialized */
  @Override
  protected void init(int begin) {
    setStartOffset(begin);
    setLength(SCN_RET_AREA_LENGTH);
    /*  set the offset/position of each field when this object is serialized as String */
    beginScnRetSrvcCdNbr = getStartOffset() + 0; // set offset for serialization

    /*  end of offset */
  }

  int localScnRetSrvcCdNbrCounter = -1;

  public boolean isScnRetSrvcCdNbrModified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localScnRetSrvcCdNbrCounter != sharedCounter;
    localScnRetSrvcCdNbrCounter = sharedCounter;
    return hasModified;
  }

  protected static final int SCN_RET_SRVC_CD_NBR_LEN = 3;
  /** serialize this ScnRetSrvcCdNbr */
  protected void serializeScnRetSrvcCdNbr(char[] scnRetSrvcCdNbr) {
    shareString.getSerializedField().incrementCounter();
    arraycopy(scnRetSrvcCdNbr, 0, getStringValue(), beginScnRetSrvcCdNbr, SCN_RET_SRVC_CD_NBR_LEN);
    localScnRetSrvcCdNbrCounter = shareString.getSerializedField().getModifiedCounter();
  }

  protected char[] checkScnRetSrvcCdNbrConstraints(char[] value) {
    return super.checkConstraints(value, 3, false, false);
  }
  /**
   * refreshScnRetSrvcCdNbr is used to refresh the latest value of a variable from the Serialized
   * String the most common reason to serialize an Object as a string in to write to a file. There
   * can be several other reasons for serialization as well
   */
  public char[] refreshScnRetSrvcCdNbr() {
    return (substring(
        getStringValue(), beginScnRetSrvcCdNbr, beginScnRetSrvcCdNbr + SCN_RET_SRVC_CD_NBR_LEN));
  }
}
