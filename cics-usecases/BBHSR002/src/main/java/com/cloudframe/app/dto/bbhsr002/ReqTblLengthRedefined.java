package com.cloudframe.app.dto.bbhsr002;

/**
 * The class ReqTblLengthRedefined is used to handle fields declared in it
 *
 * @author CloudFrame Inc. created on 2025-03-25 at 08:29. using version 5.0.0.231
 */
import com.cloudframe.app.data.Field;
import com.cloudframe.app.dto.serialize.bbhsr002.*;
import com.cloudframe.app.exception.CFException;

public class ReqTblLengthRedefined extends ReqTblLengthRedefinedSerialized {

  private short reqTblAddressLength;

  private int reqTblAddress;

  private int reqTblAddressPtr;

  /** Constructor for ReqTblLengthRedefined */
  public ReqTblLengthRedefined() {
    // TO-DO auto generated code
  }

  /**
   * Constructor for ReqTblLengthRedefined. sets the parent value to the parent
   *
   * @param parent
   * @param begin
   */
  public ReqTblLengthRedefined(Field parent, int begin) {
    setParent(parent, begin);
  }

  /**
   * Returns the value of reqTblAddressLength
   *
   * @return reqTblAddressLength
   */
  public short getReqTblAddressLength() throws CFException {
    if (isReqTblAddressLengthModified()) {
      reqTblAddressLength = refreshReqTblAddressLength();
    }
    return reqTblAddressLength;
  }

  /**
   * Update ReqTblAddressLength with the passed value Corresponding COBOL Variable is
   * REQ-TBL-ADDRESS-LENGTH
   *
   * @param number
   */
  public void setReqTblAddressLength(short number) {
    // Truncate if the number is beyond +/- Max range
    reqTblAddressLength = checkReqTblAddressLengthMaxLimit(number);
    serializeReqTblAddressLength(reqTblAddressLength);
  }

  public void setReqTblAddressLength(int number) {
    number =
        checkReqTblAddressLengthMaxLimit(
            (short) number); // Truncate if value is beyond +/- Max range
    setReqTblAddressLength((short) number);
  }

  public void setReqTblAddressLength(long number) {
    number =
        checkReqTblAddressLengthMaxLimit(
            (short) number); // Truncate if value is beyond +/- Max range
    setReqTblAddressLength((short) number);
  }

  /**
   * Returns the value of reqTblAddress
   *
   * @return reqTblAddress
   */
  public int getReqTblAddress() throws CFException {
    if (isReqTblAddressModified()) {
      reqTblAddress = refreshReqTblAddress();
    }
    return reqTblAddress;
  }

  /**
   * Update ReqTblAddress with the passed value Corresponding COBOL Variable is REQ-TBL-ADDRESS
   *
   * @param number
   */
  public void setReqTblAddress(int number) {
    // Truncate if the number is beyond +/- Max range
    reqTblAddress = checkReqTblAddressMaxLimit(number);
    serializeReqTblAddress(reqTblAddress);
  }

  public void setReqTblAddress(long number) {
    number = checkReqTblAddressMaxLimit(number); // Truncate if value is beyond +/- Max range
    setReqTblAddress((int) number);
  }

  /**
   * Returns the value of reqTblAddressPtr
   *
   * @return reqTblAddressPtr
   */
  public int getReqTblAddressPtr() throws CFException {
    if (isReqTblAddressPtrModified()) {
      reqTblAddressPtr = refreshReqTblAddressPtr();
    }
    return reqTblAddressPtr;
  }

  /**
   * Update ReqTblAddressPtr with the passed value Corresponding COBOL Variable is
   * REQ-TBL-ADDRESS-PTR
   *
   * @param number
   */
  public void setReqTblAddressPtr(int number) {
    // Truncate if the number is beyond +/- Max range
    reqTblAddressPtr = checkReqTblAddressPtrMaxLimit(number);
    serializeReqTblAddressPtr(reqTblAddressPtr);
  }

  public void setReqTblAddressPtr(long number) {
    number = checkReqTblAddressPtrMaxLimit(number); // Truncate if value is beyond +/- Max range
    setReqTblAddressPtr((int) number);
  }

  public static int getReqTblLengthRedefinedFieldLength() {
    return REQ_TBL_LENGTH_REDEFINED_LENGTH;
  }
}
