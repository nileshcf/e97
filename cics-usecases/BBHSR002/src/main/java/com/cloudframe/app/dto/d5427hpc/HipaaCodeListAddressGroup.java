package com.cloudframe.app.dto.d5427hpc;

/**
 * The class HipaaCodeListAddressGroup is used to handle fields declared in it
 *
 * @author CloudFrame Inc. created on 2025-03-25 at 08:29. using version 5.0.0.231
 */
import com.cloudframe.app.dto.serialize.d5427hpc.*;
import com.cloudframe.app.exception.CFException;

public class HipaaCodeListAddressGroup extends HipaaCodeListAddressGroupSerialized {

  private int hipaaCodeListAddress;

  /** Constructor for HipaaCodeListAddressGroup */
  public HipaaCodeListAddressGroup() {
    super();
    /*  set the parent of each child as this which are a group variable */
    /*  end of offset */
  }

  /**
   * Returns the value of hipaaCodeListAddress
   *
   * @return hipaaCodeListAddress
   */
  public int getHipaaCodeListAddress() throws CFException {
    if (isHipaaCodeListAddressModified()) {
      hipaaCodeListAddress = refreshHipaaCodeListAddress();
    }
    return hipaaCodeListAddress;
  }

  /**
   * Update HipaaCodeListAddress with the passed value Corresponding COBOL Variable is
   * HIPAA-CODE-LIST-ADDRESS
   *
   * @param number
   */
  public void setHipaaCodeListAddress(int number) {
    // Truncate if the number is beyond +/- Max range
    hipaaCodeListAddress = checkHipaaCodeListAddressMaxLimit(number);
    serializeHipaaCodeListAddress(hipaaCodeListAddress);
  }

  public void setHipaaCodeListAddress(long number) {
    number = checkHipaaCodeListAddressMaxLimit(number); // Truncate if value is beyond +/- Max range
    setHipaaCodeListAddress((int) number);
  }

  public static int getHipaaCodeListAddressGroupFieldLength() {
    return HIPAA_CODE_LIST_ADDRESS_GROUP_LENGTH;
  }
}
