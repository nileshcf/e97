package com.cloudframe.app.dto.serialize.d5427hpc;

/**
 * The class CacheCommAreaSerialized is used to define offsets in order to serialize in a fixed
 * String
 *
 * @author CloudFrame Inc. created on 2025-03-25 at 08:29. using version 5.0.0.231
 */
import com.cloudframe.app.data.Field;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class CacheCommAreaSerialized extends Field {

  protected Logger logger = LoggerFactory.getLogger(CacheCommAreaSerialized.class);
  /*  Length of the field, if serialized as a String */
  protected static final int CACHE_COMM_AREA_LENGTH = 40;
  /*  offset of each of Child Fields when serialized as a String */
  protected int beginCrtnFunction;

  /** Constructor for CacheCommAreaSerialized */
  public CacheCommAreaSerialized() {
    init(0);
  }

  /** initializes the field in CacheCommAreaSerialized */
  @Override
  protected void init(int begin) {
    setStartOffset(begin);
    setLength(CACHE_COMM_AREA_LENGTH);
    /*  set the offset/position of each field when this object is serialized as String */

    beginCrtnFunction = getStartOffset() + 29; // set offset for serialization

    /*  end of offset */
  }

  int localCrtnFunctionCounter = -1;

  public boolean isCrtnFunctionModified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localCrtnFunctionCounter != sharedCounter;
    localCrtnFunctionCounter = sharedCounter;
    return hasModified;
  }

  protected static final int CRTN_FUNCTION_LEN = 1;
  /** serialize this CrtnFunction */
  protected void serializeCrtnFunction(char[] crtnFunction) {
    shareString.getSerializedField().incrementCounter();
    arraycopy(crtnFunction, 0, getStringValue(), beginCrtnFunction, CRTN_FUNCTION_LEN);
    localCrtnFunctionCounter = shareString.getSerializedField().getModifiedCounter();
  }

  protected char[] checkCrtnFunctionConstraints(char[] value) {
    return super.checkConstraints(value, 1, false, false);
  }
  /**
   * refreshCrtnFunction is used to refresh the latest value of a variable from the Serialized
   * String the most common reason to serialize an Object as a string in to write to a file. There
   * can be several other reasons for serialization as well
   */
  public char[] refreshCrtnFunction() {
    return (substring(getStringValue(), beginCrtnFunction, beginCrtnFunction + CRTN_FUNCTION_LEN));
  }
}
