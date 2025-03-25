package com.cloudframe.app.dto.serialize.d5427bhi;

/**
 * The class BhiReturnRowSerialized is used to define offsets in order to serialize in a fixed
 * String
 *
 * @author CloudFrame Inc. created on 2025-03-25 at 08:32. using version 5.0.0.231
 */
import com.cloudframe.app.data.Field;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class BhiReturnRowSerialized extends Field {

  protected Logger logger = LoggerFactory.getLogger(BhiReturnRowSerialized.class);
  /*  Length of the field, if serialized as a String */
  protected static final int BHI_RETURN_ROW_LENGTH = 132;
  /*  offset of each of Child Fields when serialized as a String */
  protected int beginBhiRowReturnCd;
  protected int beginBhiRowDb2Code;
  protected int beginBhiRowAction;

  /** Constructor for BhiReturnRowSerialized */
  public BhiReturnRowSerialized() {
    // TO-DO auto generated code
  }

  /**
   * Constructor for BhiReturnRowSerialized. sets the parent value to the parent
   *
   * @param parent
   * @param begin
   */
  public BhiReturnRowSerialized(Field parent, int begin) {
    setParent(parent, begin);
  }

  /**
   * sets parent for this BhiReturnRowSerialized to the parent
   *
   * @param parent
   */
  @Override
  public void setParent(Field parent) {
    setParent(parent, 1567); // serialize this field at offset 1567 by default
  }

  /**
   * sets parent for this BhiReturnRowSerialized to the parent and set the serialize offset to
   * parameter begin
   *
   * @param parent
   * @param begin - offset used when serializing this object to a String
   */
  public void setParent(Field parent, int begin) {
    super.setParent(parent);
    init(begin); // serialize this field at offset 1567 by default
  }
  /** initializes the field in BhiReturnRowSerialized */
  @Override
  protected void init(int begin) {
    setStartOffset(begin);
    setLength(BHI_RETURN_ROW_LENGTH);
    /*  set the offset/position of each field when this object is serialized as String */
    beginBhiRowReturnCd = getStartOffset() + 0; // set offset for serialization

    beginBhiRowDb2Code = getStartOffset() + 2; // set offset for serialization

    beginBhiRowAction = getStartOffset() + 12; // set offset for serialization

    /*  end of offset */
  }

  int localBhiRowReturnCdCounter = -1;

  public boolean isBhiRowReturnCdModified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localBhiRowReturnCdCounter != sharedCounter;
    localBhiRowReturnCdCounter = sharedCounter;
    return hasModified;
  }

  protected static final int BHI_ROW_RETURN_CD_LEN = 2;
  /** serialize this BhiRowReturnCd */
  protected void serializeBhiRowReturnCd(char[] bhiRowReturnCd) {
    shareString.getSerializedField().incrementCounter();
    arraycopy(bhiRowReturnCd, 0, getStringValue(), beginBhiRowReturnCd, BHI_ROW_RETURN_CD_LEN);
    localBhiRowReturnCdCounter = shareString.getSerializedField().getModifiedCounter();
  }

  protected char[] checkBhiRowReturnCdConstraints(char[] value) {
    return super.checkConstraints(value, 2, false, false);
  }
  /**
   * refreshBhiRowReturnCd is used to refresh the latest value of a variable from the Serialized
   * String the most common reason to serialize an Object as a string in to write to a file. There
   * can be several other reasons for serialization as well
   */
  public char[] refreshBhiRowReturnCd() {
    return (substring(
        getStringValue(), beginBhiRowReturnCd, beginBhiRowReturnCd + BHI_ROW_RETURN_CD_LEN));
  }

  int localBhiRowDb2CodeCounter = -1;

  public boolean isBhiRowDb2CodeModified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localBhiRowDb2CodeCounter != sharedCounter;
    localBhiRowDb2CodeCounter = sharedCounter;
    return hasModified;
  }

  protected static final int BHI_ROW_DB_2_CODE_LEN = 10;
  /** serialize this BhiRowDb2Code */
  protected void serializeBhiRowDb2Code(char[] bhiRowDb2Code) {
    shareString.getSerializedField().incrementCounter();
    arraycopy(bhiRowDb2Code, 0, getStringValue(), beginBhiRowDb2Code, BHI_ROW_DB_2_CODE_LEN);
    localBhiRowDb2CodeCounter = shareString.getSerializedField().getModifiedCounter();
  }

  protected char[] checkBhiRowDb2CodeConstraints(char[] value) {
    return super.checkConstraints(value, 10, false, false);
  }
  /**
   * refreshBhiRowDb2Code is used to refresh the latest value of a variable from the Serialized
   * String the most common reason to serialize an Object as a string in to write to a file. There
   * can be several other reasons for serialization as well
   */
  public char[] refreshBhiRowDb2Code() {
    return (substring(
        getStringValue(), beginBhiRowDb2Code, beginBhiRowDb2Code + BHI_ROW_DB_2_CODE_LEN));
  }

  int localBhiRowActionCounter = -1;

  public boolean isBhiRowActionModified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localBhiRowActionCounter != sharedCounter;
    localBhiRowActionCounter = sharedCounter;
    return hasModified;
  }

  protected static final int BHI_ROW_ACTION_LEN = 1;
  /** serialize this BhiRowAction */
  protected void serializeBhiRowAction(char[] bhiRowAction) {
    shareString.getSerializedField().incrementCounter();
    arraycopy(bhiRowAction, 0, getStringValue(), beginBhiRowAction, BHI_ROW_ACTION_LEN);
    localBhiRowActionCounter = shareString.getSerializedField().getModifiedCounter();
  }

  protected char[] checkBhiRowActionConstraints(char[] value) {
    return super.checkConstraints(value, 1, false, false);
  }
  /**
   * refreshBhiRowAction is used to refresh the latest value of a variable from the Serialized
   * String the most common reason to serialize an Object as a string in to write to a file. There
   * can be several other reasons for serialization as well
   */
  public char[] refreshBhiRowAction() {
    return (substring(getStringValue(), beginBhiRowAction, beginBhiRowAction + BHI_ROW_ACTION_LEN));
  }
}
