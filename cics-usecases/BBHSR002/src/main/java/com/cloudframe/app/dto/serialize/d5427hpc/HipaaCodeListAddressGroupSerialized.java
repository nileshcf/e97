package com.cloudframe.app.dto.serialize.d5427hpc;

/**
 * The class HipaaCodeListAddressGroupSerialized is used to define offsets in order to serialize in
 * a fixed String
 *
 * @author CloudFrame Inc. created on 2025-03-25 at 08:29. using version 5.0.0.231
 */
import com.cloudframe.app.data.Field;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class HipaaCodeListAddressGroupSerialized extends Field {

  protected Logger logger = LoggerFactory.getLogger(HipaaCodeListAddressGroupSerialized.class);
  /*  Length of the field, if serialized as a String */
  protected static final int HIPAA_CODE_LIST_ADDRESS_GROUP_LENGTH = 4;
  /*  offset of each of Child Fields when serialized as a String */
  protected int beginHipaaCodeListAddress;

  /** Constructor for HipaaCodeListAddressGroupSerialized */
  public HipaaCodeListAddressGroupSerialized() {
    init(0);
  }

  /** initializes the field in HipaaCodeListAddressGroupSerialized */
  @Override
  protected void init(int begin) {
    setStartOffset(begin);
    setLength(HIPAA_CODE_LIST_ADDRESS_GROUP_LENGTH);
    /*  set the offset/position of each field when this object is serialized as String */
    beginHipaaCodeListAddress = getStartOffset() + 0; // set offset for serialization

    /*  end of offset */
  }

  int localHipaaCodeListAddressCounter = -1;

  public boolean isHipaaCodeListAddressModified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localHipaaCodeListAddressCounter != sharedCounter;
    localHipaaCodeListAddressCounter = sharedCounter;
    return hasModified;
  }

  protected static final int HIPAA_CODE_LIST_ADDRESS_LEN = 4;
  /** serializeHipaaCodeListAddress */
  protected void serializeHipaaCodeListAddress(int hipaaCodeListAddress) {
    replaceValue( //  save the value as string
        getBinaryString(hipaaCodeListAddress, HIPAA_CODE_LIST_ADDRESS_LEN),
        beginHipaaCodeListAddress,
        HIPAA_CODE_LIST_ADDRESS_LEN);
    localHipaaCodeListAddressCounter = shareString.getSerializedField().getModifiedCounter();
  }

  protected int checkHipaaCodeListAddressMaxLimit(long number) {
    return (int) checkMaxLimit(number, true /*isSigned*/, 4 /*dataLen*/);
  }
  /**
   * refreshHipaaCodeListAddress is used to refresh the latest value of a variable from the
   * Serialized String the most common reason to serialize an Object as a string in to write to a
   * file. There can be several other reasons for serialization as well
   */
  public int refreshHipaaCodeListAddress() {
    return (getInt(beginHipaaCodeListAddress));
  }
}
