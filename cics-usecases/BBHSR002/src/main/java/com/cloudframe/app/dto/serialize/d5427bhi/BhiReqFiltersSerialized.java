package com.cloudframe.app.dto.serialize.d5427bhi;

/**
 * The class BhiReqFiltersSerialized is used to define offsets in order to serialize in a fixed
 * String
 *
 * @author CloudFrame Inc. created on 2025-03-25 at 08:32. using version 5.0.0.231
 */
import com.cloudframe.app.data.Field;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class BhiReqFiltersSerialized extends Field {

  protected Logger logger = LoggerFactory.getLogger(BhiReqFiltersSerialized.class);
  /*  Length of the field, if serialized as a String */
  protected static final int BHI_REQ_FILTERS_LENGTH = 7;
  /*  offset of each of Child Fields when serialized as a String */
  protected int beginBhiReqFiltTbl;
  protected int beginBhiReqFiltStsCd;

  /** Constructor for BhiReqFiltersSerialized */
  public BhiReqFiltersSerialized() {
    // TO-DO auto generated code
  }

  /**
   * Constructor for BhiReqFiltersSerialized. sets the parent value to the parent
   *
   * @param parent
   * @param begin
   */
  public BhiReqFiltersSerialized(Field parent, int begin) {
    setParent(parent, begin);
  }

  /**
   * sets parent for this BhiReqFiltersSerialized to the parent
   *
   * @param parent
   */
  @Override
  public void setParent(Field parent) {
    setParent(parent, 12); // serialize this field at offset 12 by default
  }

  /**
   * sets parent for this BhiReqFiltersSerialized to the parent and set the serialize offset to
   * parameter begin
   *
   * @param parent
   * @param begin - offset used when serializing this object to a String
   */
  public void setParent(Field parent, int begin) {
    super.setParent(parent);
    init(begin); // serialize this field at offset 12 by default
  }
  /** initializes the field in BhiReqFiltersSerialized */
  @Override
  protected void init(int begin) {
    setStartOffset(begin);
    setLength(BHI_REQ_FILTERS_LENGTH);
    /*  set the offset/position of each field when this object is serialized as String */
    beginBhiReqFiltTbl = getStartOffset() + 0; // set offset for serialization

    beginBhiReqFiltStsCd = getStartOffset() + 6; // set offset for serialization

    /*  end of offset */
  }

  int localBhiReqFiltTblCounter = -1;

  public boolean isBhiReqFiltTblModified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localBhiReqFiltTblCounter != sharedCounter;
    localBhiReqFiltTblCounter = sharedCounter;
    return hasModified;
  }

  protected static final int BHI_REQ_FILT_TBL_LEN = 6;
  /** serialize this BhiReqFiltTbl */
  protected void serializeBhiReqFiltTbl(char[] bhiReqFiltTbl) {
    shareString.getSerializedField().incrementCounter();
    arraycopy(bhiReqFiltTbl, 0, getStringValue(), beginBhiReqFiltTbl, BHI_REQ_FILT_TBL_LEN);
    localBhiReqFiltTblCounter = shareString.getSerializedField().getModifiedCounter();
  }

  protected char[] checkBhiReqFiltTblConstraints(char[] value) {
    return super.checkConstraints(value, 6, false, false);
  }
  /**
   * refreshBhiReqFiltTbl is used to refresh the latest value of a variable from the Serialized
   * String the most common reason to serialize an Object as a string in to write to a file. There
   * can be several other reasons for serialization as well
   */
  public char[] refreshBhiReqFiltTbl() {
    return (substring(
        getStringValue(), beginBhiReqFiltTbl, beginBhiReqFiltTbl + BHI_REQ_FILT_TBL_LEN));
  }

  int localBhiReqFiltStsCdCounter = -1;

  public boolean isBhiReqFiltStsCdModified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localBhiReqFiltStsCdCounter != sharedCounter;
    localBhiReqFiltStsCdCounter = sharedCounter;
    return hasModified;
  }

  protected static final int BHI_REQ_FILT_STS_CD_LEN = 1;
  /** serialize this BhiReqFiltStsCd */
  protected void serializeBhiReqFiltStsCd(char[] bhiReqFiltStsCd) {
    shareString.getSerializedField().incrementCounter();
    arraycopy(bhiReqFiltStsCd, 0, getStringValue(), beginBhiReqFiltStsCd, BHI_REQ_FILT_STS_CD_LEN);
    localBhiReqFiltStsCdCounter = shareString.getSerializedField().getModifiedCounter();
  }

  protected char[] checkBhiReqFiltStsCdConstraints(char[] value) {
    return super.checkConstraints(value, 1, false, false);
  }
  /**
   * refreshBhiReqFiltStsCd is used to refresh the latest value of a variable from the Serialized
   * String the most common reason to serialize an Object as a string in to write to a file. There
   * can be several other reasons for serialization as well
   */
  public char[] refreshBhiReqFiltStsCd() {
    return (substring(
        getStringValue(), beginBhiReqFiltStsCd, beginBhiReqFiltStsCd + BHI_REQ_FILT_STS_CD_LEN));
  }
}
