package com.cloudframe.app.dto.serialize.bbhsr002;

/**
 * The class AdaAcqDataAreaGroupSerialized is used to define offsets in order to serialize in a
 * fixed String
 *
 * @author CloudFrame Inc. created on 2025-03-25 at 08:29. using version 5.0.0.231
 */
import com.cloudframe.app.data.Field;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class AdaAcqDataAreaGroupSerialized extends Field {

  protected Logger logger = LoggerFactory.getLogger(AdaAcqDataAreaGroupSerialized.class);
  /*  Length of the field, if serialized as a String */
  protected static final int ADA_ACQ_DATA_AREA_GROUP_LENGTH = 32000;
  /*  offset of each of Child Fields when serialized as a String */
  protected int beginAdaAcqDataArea;

  /** Constructor for AdaAcqDataAreaGroupSerialized */
  public AdaAcqDataAreaGroupSerialized() {
    init(0);
  }

  /** initializes the field in AdaAcqDataAreaGroupSerialized */
  @Override
  protected void init(int begin) {
    setStartOffset(begin);
    setLength(ADA_ACQ_DATA_AREA_GROUP_LENGTH);
    /*  set the offset/position of each field when this object is serialized as String */
    beginAdaAcqDataArea = getStartOffset() + 0; // set offset for serialization

    /*  end of offset */
  }

  int localAdaAcqDataAreaCounter = -1;

  public boolean isAdaAcqDataAreaModified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localAdaAcqDataAreaCounter != sharedCounter;
    localAdaAcqDataAreaCounter = sharedCounter;
    return hasModified;
  }

  protected static final int ADA_ACQ_DATA_AREA_LEN = 32000;
  /** serialize this AdaAcqDataArea */
  protected void serializeAdaAcqDataArea(char[] adaAcqDataArea) {
    shareString.getSerializedField().incrementCounter();
    arraycopy(adaAcqDataArea, 0, getStringValue(), beginAdaAcqDataArea, ADA_ACQ_DATA_AREA_LEN);
    localAdaAcqDataAreaCounter = shareString.getSerializedField().getModifiedCounter();
  }

  protected char[] checkAdaAcqDataAreaConstraints(char[] value) {
    return super.checkConstraints(value, 32000, false, false);
  }
  /**
   * refreshAdaAcqDataArea is used to refresh the latest value of a variable from the Serialized
   * String the most common reason to serialize an Object as a string in to write to a file. There
   * can be several other reasons for serialization as well
   */
  public char[] refreshAdaAcqDataArea() {
    return (substring(
        getStringValue(), beginAdaAcqDataArea, beginAdaAcqDataArea + ADA_ACQ_DATA_AREA_LEN));
  }
}
