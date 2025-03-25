package com.cloudframe.app.dto.bbhsr002;

/**
 * The class ReqAddressArea is used to handle fields declared in it
 *
 * @author CloudFrame Inc. created on 2025-03-25 at 08:29. using version 5.0.0.231
 */
import com.cloudframe.app.data.Field;
import com.cloudframe.app.dto.serialize.bbhsr002.*;
import com.cloudframe.app.exception.CFException;

public class ReqAddressArea extends ReqAddressAreaSerialized {

  private short reqAddress1Length;

  private int reqAddress1;

  private int reqAddress1Ptr;

  private short reqAddress2Length;

  private int reqAddress2;

  private int reqAddress2Ptr;

  private short reqAddress3Length;

  private int reqAddress3;

  private int reqAddress3Ptr;

  private short reqAddress4Length;

  private int reqAddress4;

  private int reqAddress4Ptr;

  private short reqAddress5Length;

  private int reqAddress5;

  private int reqAddress5Ptr;

  private short reqAddress6Length;

  private int reqAddress6;

  private int reqAddress6Ptr;

  private short reqAddress7Length;

  private int reqAddress7;

  private int reqAddress7Ptr;

  private short reqAddress8Length;

  private int reqAddress8;

  private int reqAddress8Ptr;

  private short reqAddress9Length;

  private int reqAddress9;

  private int reqAddress9Ptr;

  private short reqAddress10Length;

  private int reqAddress10;

  private int reqAddress10Ptr;

  /** Constructor for ReqAddressArea */
  public ReqAddressArea() {
    // TO-DO auto generated code
  }

  /**
   * Constructor for ReqAddressArea. sets the parent value to the parent
   *
   * @param parent
   * @param begin
   */
  public ReqAddressArea(Field parent, int begin) {
    setParent(parent, begin);
  }

  /**
   * Returns the value of reqAddress1Length
   *
   * @return reqAddress1Length
   */
  public short getReqAddress1Length() throws CFException {
    if (isReqAddress1LengthModified()) {
      reqAddress1Length = refreshReqAddress1Length();
    }
    return reqAddress1Length;
  }

  /**
   * Update ReqAddress1Length with the passed value Corresponding COBOL Variable is
   * REQ-ADDRESS-1-LENGTH
   *
   * @param number
   */
  public void setReqAddress1Length(short number) {
    // Truncate if the number is beyond +/- Max range
    reqAddress1Length = checkReqAddress1LengthMaxLimit(number);
    serializeReqAddress1Length(reqAddress1Length);
  }

  public void setReqAddress1Length(int number) {
    number =
        checkReqAddress1LengthMaxLimit((short) number); // Truncate if value is beyond +/- Max range
    setReqAddress1Length((short) number);
  }

  public void setReqAddress1Length(long number) {
    number =
        checkReqAddress1LengthMaxLimit((short) number); // Truncate if value is beyond +/- Max range
    setReqAddress1Length((short) number);
  }

  /**
   * Returns the value of reqAddress1
   *
   * @return reqAddress1
   */
  public int getReqAddress1() throws CFException {
    if (isReqAddress1Modified()) {
      reqAddress1 = refreshReqAddress1();
    }
    return reqAddress1;
  }

  /**
   * Update ReqAddress1 with the passed value Corresponding COBOL Variable is REQ-ADDRESS-1
   *
   * @param number
   */
  public void setReqAddress1(int number) {
    // Truncate if the number is beyond +/- Max range
    reqAddress1 = checkReqAddress1MaxLimit(number);
    serializeReqAddress1(reqAddress1);
  }

  public void setReqAddress1(long number) {
    number = checkReqAddress1MaxLimit(number); // Truncate if value is beyond +/- Max range
    setReqAddress1((int) number);
  }

  /**
   * Returns the value of reqAddress1Ptr
   *
   * @return reqAddress1Ptr
   */
  public int getReqAddress1Ptr() throws CFException {
    if (isReqAddress1PtrModified()) {
      reqAddress1Ptr = refreshReqAddress1Ptr();
    }
    return reqAddress1Ptr;
  }

  /**
   * Update ReqAddress1Ptr with the passed value Corresponding COBOL Variable is REQ-ADDRESS-1-PTR
   *
   * @param number
   */
  public void setReqAddress1Ptr(int number) {
    // Truncate if the number is beyond +/- Max range
    reqAddress1Ptr = checkReqAddress1PtrMaxLimit(number);
    serializeReqAddress1Ptr(reqAddress1Ptr);
  }

  public void setReqAddress1Ptr(long number) {
    number = checkReqAddress1PtrMaxLimit(number); // Truncate if value is beyond +/- Max range
    setReqAddress1Ptr((int) number);
  }

  /**
   * Returns the value of reqAddress2Length
   *
   * @return reqAddress2Length
   */
  public short getReqAddress2Length() throws CFException {
    if (isReqAddress2LengthModified()) {
      reqAddress2Length = refreshReqAddress2Length();
    }
    return reqAddress2Length;
  }

  /**
   * Update ReqAddress2Length with the passed value Corresponding COBOL Variable is
   * REQ-ADDRESS-2-LENGTH
   *
   * @param number
   */
  public void setReqAddress2Length(short number) {
    // Truncate if the number is beyond +/- Max range
    reqAddress2Length = checkReqAddress2LengthMaxLimit(number);
    serializeReqAddress2Length(reqAddress2Length);
  }

  public void setReqAddress2Length(int number) {
    number =
        checkReqAddress2LengthMaxLimit((short) number); // Truncate if value is beyond +/- Max range
    setReqAddress2Length((short) number);
  }

  public void setReqAddress2Length(long number) {
    number =
        checkReqAddress2LengthMaxLimit((short) number); // Truncate if value is beyond +/- Max range
    setReqAddress2Length((short) number);
  }

  /**
   * Returns the value of reqAddress2
   *
   * @return reqAddress2
   */
  public int getReqAddress2() throws CFException {
    if (isReqAddress2Modified()) {
      reqAddress2 = refreshReqAddress2();
    }
    return reqAddress2;
  }

  /**
   * Update ReqAddress2 with the passed value Corresponding COBOL Variable is REQ-ADDRESS-2
   *
   * @param number
   */
  public void setReqAddress2(int number) {
    // Truncate if the number is beyond +/- Max range
    reqAddress2 = checkReqAddress2MaxLimit(number);
    serializeReqAddress2(reqAddress2);
  }

  public void setReqAddress2(long number) {
    number = checkReqAddress2MaxLimit(number); // Truncate if value is beyond +/- Max range
    setReqAddress2((int) number);
  }

  /**
   * Returns the value of reqAddress2Ptr
   *
   * @return reqAddress2Ptr
   */
  public int getReqAddress2Ptr() throws CFException {
    if (isReqAddress2PtrModified()) {
      reqAddress2Ptr = refreshReqAddress2Ptr();
    }
    return reqAddress2Ptr;
  }

  /**
   * Update ReqAddress2Ptr with the passed value Corresponding COBOL Variable is REQ-ADDRESS-2-PTR
   *
   * @param number
   */
  public void setReqAddress2Ptr(int number) {
    // Truncate if the number is beyond +/- Max range
    reqAddress2Ptr = checkReqAddress2PtrMaxLimit(number);
    serializeReqAddress2Ptr(reqAddress2Ptr);
  }

  public void setReqAddress2Ptr(long number) {
    number = checkReqAddress2PtrMaxLimit(number); // Truncate if value is beyond +/- Max range
    setReqAddress2Ptr((int) number);
  }

  /**
   * Returns the value of reqAddress3Length
   *
   * @return reqAddress3Length
   */
  public short getReqAddress3Length() throws CFException {
    if (isReqAddress3LengthModified()) {
      reqAddress3Length = refreshReqAddress3Length();
    }
    return reqAddress3Length;
  }

  /**
   * Update ReqAddress3Length with the passed value Corresponding COBOL Variable is
   * REQ-ADDRESS-3-LENGTH
   *
   * @param number
   */
  public void setReqAddress3Length(short number) {
    // Truncate if the number is beyond +/- Max range
    reqAddress3Length = checkReqAddress3LengthMaxLimit(number);
    serializeReqAddress3Length(reqAddress3Length);
  }

  public void setReqAddress3Length(int number) {
    number =
        checkReqAddress3LengthMaxLimit((short) number); // Truncate if value is beyond +/- Max range
    setReqAddress3Length((short) number);
  }

  public void setReqAddress3Length(long number) {
    number =
        checkReqAddress3LengthMaxLimit((short) number); // Truncate if value is beyond +/- Max range
    setReqAddress3Length((short) number);
  }

  /**
   * Returns the value of reqAddress3
   *
   * @return reqAddress3
   */
  public int getReqAddress3() throws CFException {
    if (isReqAddress3Modified()) {
      reqAddress3 = refreshReqAddress3();
    }
    return reqAddress3;
  }

  /**
   * Update ReqAddress3 with the passed value Corresponding COBOL Variable is REQ-ADDRESS-3
   *
   * @param number
   */
  public void setReqAddress3(int number) {
    // Truncate if the number is beyond +/- Max range
    reqAddress3 = checkReqAddress3MaxLimit(number);
    serializeReqAddress3(reqAddress3);
  }

  public void setReqAddress3(long number) {
    number = checkReqAddress3MaxLimit(number); // Truncate if value is beyond +/- Max range
    setReqAddress3((int) number);
  }

  /**
   * Returns the value of reqAddress3Ptr
   *
   * @return reqAddress3Ptr
   */
  public int getReqAddress3Ptr() throws CFException {
    if (isReqAddress3PtrModified()) {
      reqAddress3Ptr = refreshReqAddress3Ptr();
    }
    return reqAddress3Ptr;
  }

  /**
   * Update ReqAddress3Ptr with the passed value Corresponding COBOL Variable is REQ-ADDRESS-3-PTR
   *
   * @param number
   */
  public void setReqAddress3Ptr(int number) {
    // Truncate if the number is beyond +/- Max range
    reqAddress3Ptr = checkReqAddress3PtrMaxLimit(number);
    serializeReqAddress3Ptr(reqAddress3Ptr);
  }

  public void setReqAddress3Ptr(long number) {
    number = checkReqAddress3PtrMaxLimit(number); // Truncate if value is beyond +/- Max range
    setReqAddress3Ptr((int) number);
  }

  /**
   * Returns the value of reqAddress4Length
   *
   * @return reqAddress4Length
   */
  public short getReqAddress4Length() throws CFException {
    if (isReqAddress4LengthModified()) {
      reqAddress4Length = refreshReqAddress4Length();
    }
    return reqAddress4Length;
  }

  /**
   * Update ReqAddress4Length with the passed value Corresponding COBOL Variable is
   * REQ-ADDRESS-4-LENGTH
   *
   * @param number
   */
  public void setReqAddress4Length(short number) {
    // Truncate if the number is beyond +/- Max range
    reqAddress4Length = checkReqAddress4LengthMaxLimit(number);
    serializeReqAddress4Length(reqAddress4Length);
  }

  public void setReqAddress4Length(int number) {
    number =
        checkReqAddress4LengthMaxLimit((short) number); // Truncate if value is beyond +/- Max range
    setReqAddress4Length((short) number);
  }

  public void setReqAddress4Length(long number) {
    number =
        checkReqAddress4LengthMaxLimit((short) number); // Truncate if value is beyond +/- Max range
    setReqAddress4Length((short) number);
  }

  /**
   * Returns the value of reqAddress4
   *
   * @return reqAddress4
   */
  public int getReqAddress4() throws CFException {
    if (isReqAddress4Modified()) {
      reqAddress4 = refreshReqAddress4();
    }
    return reqAddress4;
  }

  /**
   * Update ReqAddress4 with the passed value Corresponding COBOL Variable is REQ-ADDRESS-4
   *
   * @param number
   */
  public void setReqAddress4(int number) {
    // Truncate if the number is beyond +/- Max range
    reqAddress4 = checkReqAddress4MaxLimit(number);
    serializeReqAddress4(reqAddress4);
  }

  public void setReqAddress4(long number) {
    number = checkReqAddress4MaxLimit(number); // Truncate if value is beyond +/- Max range
    setReqAddress4((int) number);
  }

  /**
   * Returns the value of reqAddress4Ptr
   *
   * @return reqAddress4Ptr
   */
  public int getReqAddress4Ptr() throws CFException {
    if (isReqAddress4PtrModified()) {
      reqAddress4Ptr = refreshReqAddress4Ptr();
    }
    return reqAddress4Ptr;
  }

  /**
   * Update ReqAddress4Ptr with the passed value Corresponding COBOL Variable is REQ-ADDRESS-4-PTR
   *
   * @param number
   */
  public void setReqAddress4Ptr(int number) {
    // Truncate if the number is beyond +/- Max range
    reqAddress4Ptr = checkReqAddress4PtrMaxLimit(number);
    serializeReqAddress4Ptr(reqAddress4Ptr);
  }

  public void setReqAddress4Ptr(long number) {
    number = checkReqAddress4PtrMaxLimit(number); // Truncate if value is beyond +/- Max range
    setReqAddress4Ptr((int) number);
  }

  /**
   * Returns the value of reqAddress5Length
   *
   * @return reqAddress5Length
   */
  public short getReqAddress5Length() throws CFException {
    if (isReqAddress5LengthModified()) {
      reqAddress5Length = refreshReqAddress5Length();
    }
    return reqAddress5Length;
  }

  /**
   * Update ReqAddress5Length with the passed value Corresponding COBOL Variable is
   * REQ-ADDRESS-5-LENGTH
   *
   * @param number
   */
  public void setReqAddress5Length(short number) {
    // Truncate if the number is beyond +/- Max range
    reqAddress5Length = checkReqAddress5LengthMaxLimit(number);
    serializeReqAddress5Length(reqAddress5Length);
  }

  public void setReqAddress5Length(int number) {
    number =
        checkReqAddress5LengthMaxLimit((short) number); // Truncate if value is beyond +/- Max range
    setReqAddress5Length((short) number);
  }

  public void setReqAddress5Length(long number) {
    number =
        checkReqAddress5LengthMaxLimit((short) number); // Truncate if value is beyond +/- Max range
    setReqAddress5Length((short) number);
  }

  /**
   * Returns the value of reqAddress5
   *
   * @return reqAddress5
   */
  public int getReqAddress5() throws CFException {
    if (isReqAddress5Modified()) {
      reqAddress5 = refreshReqAddress5();
    }
    return reqAddress5;
  }

  /**
   * Update ReqAddress5 with the passed value Corresponding COBOL Variable is REQ-ADDRESS-5
   *
   * @param number
   */
  public void setReqAddress5(int number) {
    // Truncate if the number is beyond +/- Max range
    reqAddress5 = checkReqAddress5MaxLimit(number);
    serializeReqAddress5(reqAddress5);
  }

  public void setReqAddress5(long number) {
    number = checkReqAddress5MaxLimit(number); // Truncate if value is beyond +/- Max range
    setReqAddress5((int) number);
  }

  /**
   * Returns the value of reqAddress5Ptr
   *
   * @return reqAddress5Ptr
   */
  public int getReqAddress5Ptr() throws CFException {
    if (isReqAddress5PtrModified()) {
      reqAddress5Ptr = refreshReqAddress5Ptr();
    }
    return reqAddress5Ptr;
  }

  /**
   * Update ReqAddress5Ptr with the passed value Corresponding COBOL Variable is REQ-ADDRESS-5-PTR
   *
   * @param number
   */
  public void setReqAddress5Ptr(int number) {
    // Truncate if the number is beyond +/- Max range
    reqAddress5Ptr = checkReqAddress5PtrMaxLimit(number);
    serializeReqAddress5Ptr(reqAddress5Ptr);
  }

  public void setReqAddress5Ptr(long number) {
    number = checkReqAddress5PtrMaxLimit(number); // Truncate if value is beyond +/- Max range
    setReqAddress5Ptr((int) number);
  }

  /**
   * Returns the value of reqAddress6Length
   *
   * @return reqAddress6Length
   */
  public short getReqAddress6Length() throws CFException {
    if (isReqAddress6LengthModified()) {
      reqAddress6Length = refreshReqAddress6Length();
    }
    return reqAddress6Length;
  }

  /**
   * Update ReqAddress6Length with the passed value Corresponding COBOL Variable is
   * REQ-ADDRESS-6-LENGTH
   *
   * @param number
   */
  public void setReqAddress6Length(short number) {
    // Truncate if the number is beyond +/- Max range
    reqAddress6Length = checkReqAddress6LengthMaxLimit(number);
    serializeReqAddress6Length(reqAddress6Length);
  }

  public void setReqAddress6Length(int number) {
    number =
        checkReqAddress6LengthMaxLimit((short) number); // Truncate if value is beyond +/- Max range
    setReqAddress6Length((short) number);
  }

  public void setReqAddress6Length(long number) {
    number =
        checkReqAddress6LengthMaxLimit((short) number); // Truncate if value is beyond +/- Max range
    setReqAddress6Length((short) number);
  }

  /**
   * Returns the value of reqAddress6
   *
   * @return reqAddress6
   */
  public int getReqAddress6() throws CFException {
    if (isReqAddress6Modified()) {
      reqAddress6 = refreshReqAddress6();
    }
    return reqAddress6;
  }

  /**
   * Update ReqAddress6 with the passed value Corresponding COBOL Variable is REQ-ADDRESS-6
   *
   * @param number
   */
  public void setReqAddress6(int number) {
    // Truncate if the number is beyond +/- Max range
    reqAddress6 = checkReqAddress6MaxLimit(number);
    serializeReqAddress6(reqAddress6);
  }

  public void setReqAddress6(long number) {
    number = checkReqAddress6MaxLimit(number); // Truncate if value is beyond +/- Max range
    setReqAddress6((int) number);
  }

  /**
   * Returns the value of reqAddress6Ptr
   *
   * @return reqAddress6Ptr
   */
  public int getReqAddress6Ptr() throws CFException {
    if (isReqAddress6PtrModified()) {
      reqAddress6Ptr = refreshReqAddress6Ptr();
    }
    return reqAddress6Ptr;
  }

  /**
   * Update ReqAddress6Ptr with the passed value Corresponding COBOL Variable is REQ-ADDRESS-6-PTR
   *
   * @param number
   */
  public void setReqAddress6Ptr(int number) {
    // Truncate if the number is beyond +/- Max range
    reqAddress6Ptr = checkReqAddress6PtrMaxLimit(number);
    serializeReqAddress6Ptr(reqAddress6Ptr);
  }

  public void setReqAddress6Ptr(long number) {
    number = checkReqAddress6PtrMaxLimit(number); // Truncate if value is beyond +/- Max range
    setReqAddress6Ptr((int) number);
  }

  /**
   * Returns the value of reqAddress7Length
   *
   * @return reqAddress7Length
   */
  public short getReqAddress7Length() throws CFException {
    if (isReqAddress7LengthModified()) {
      reqAddress7Length = refreshReqAddress7Length();
    }
    return reqAddress7Length;
  }

  /**
   * Update ReqAddress7Length with the passed value Corresponding COBOL Variable is
   * REQ-ADDRESS-7-LENGTH
   *
   * @param number
   */
  public void setReqAddress7Length(short number) {
    // Truncate if the number is beyond +/- Max range
    reqAddress7Length = checkReqAddress7LengthMaxLimit(number);
    serializeReqAddress7Length(reqAddress7Length);
  }

  public void setReqAddress7Length(int number) {
    number =
        checkReqAddress7LengthMaxLimit((short) number); // Truncate if value is beyond +/- Max range
    setReqAddress7Length((short) number);
  }

  public void setReqAddress7Length(long number) {
    number =
        checkReqAddress7LengthMaxLimit((short) number); // Truncate if value is beyond +/- Max range
    setReqAddress7Length((short) number);
  }

  /**
   * Returns the value of reqAddress7
   *
   * @return reqAddress7
   */
  public int getReqAddress7() throws CFException {
    if (isReqAddress7Modified()) {
      reqAddress7 = refreshReqAddress7();
    }
    return reqAddress7;
  }

  /**
   * Update ReqAddress7 with the passed value Corresponding COBOL Variable is REQ-ADDRESS-7
   *
   * @param number
   */
  public void setReqAddress7(int number) {
    // Truncate if the number is beyond +/- Max range
    reqAddress7 = checkReqAddress7MaxLimit(number);
    serializeReqAddress7(reqAddress7);
  }

  public void setReqAddress7(long number) {
    number = checkReqAddress7MaxLimit(number); // Truncate if value is beyond +/- Max range
    setReqAddress7((int) number);
  }

  /**
   * Returns the value of reqAddress7Ptr
   *
   * @return reqAddress7Ptr
   */
  public int getReqAddress7Ptr() throws CFException {
    if (isReqAddress7PtrModified()) {
      reqAddress7Ptr = refreshReqAddress7Ptr();
    }
    return reqAddress7Ptr;
  }

  /**
   * Update ReqAddress7Ptr with the passed value Corresponding COBOL Variable is REQ-ADDRESS-7-PTR
   *
   * @param number
   */
  public void setReqAddress7Ptr(int number) {
    // Truncate if the number is beyond +/- Max range
    reqAddress7Ptr = checkReqAddress7PtrMaxLimit(number);
    serializeReqAddress7Ptr(reqAddress7Ptr);
  }

  public void setReqAddress7Ptr(long number) {
    number = checkReqAddress7PtrMaxLimit(number); // Truncate if value is beyond +/- Max range
    setReqAddress7Ptr((int) number);
  }

  /**
   * Returns the value of reqAddress8Length
   *
   * @return reqAddress8Length
   */
  public short getReqAddress8Length() throws CFException {
    if (isReqAddress8LengthModified()) {
      reqAddress8Length = refreshReqAddress8Length();
    }
    return reqAddress8Length;
  }

  /**
   * Update ReqAddress8Length with the passed value Corresponding COBOL Variable is
   * REQ-ADDRESS-8-LENGTH
   *
   * @param number
   */
  public void setReqAddress8Length(short number) {
    // Truncate if the number is beyond +/- Max range
    reqAddress8Length = checkReqAddress8LengthMaxLimit(number);
    serializeReqAddress8Length(reqAddress8Length);
  }

  public void setReqAddress8Length(int number) {
    number =
        checkReqAddress8LengthMaxLimit((short) number); // Truncate if value is beyond +/- Max range
    setReqAddress8Length((short) number);
  }

  public void setReqAddress8Length(long number) {
    number =
        checkReqAddress8LengthMaxLimit((short) number); // Truncate if value is beyond +/- Max range
    setReqAddress8Length((short) number);
  }

  /**
   * Returns the value of reqAddress8
   *
   * @return reqAddress8
   */
  public int getReqAddress8() throws CFException {
    if (isReqAddress8Modified()) {
      reqAddress8 = refreshReqAddress8();
    }
    return reqAddress8;
  }

  /**
   * Update ReqAddress8 with the passed value Corresponding COBOL Variable is REQ-ADDRESS-8
   *
   * @param number
   */
  public void setReqAddress8(int number) {
    // Truncate if the number is beyond +/- Max range
    reqAddress8 = checkReqAddress8MaxLimit(number);
    serializeReqAddress8(reqAddress8);
  }

  public void setReqAddress8(long number) {
    number = checkReqAddress8MaxLimit(number); // Truncate if value is beyond +/- Max range
    setReqAddress8((int) number);
  }

  /**
   * Returns the value of reqAddress8Ptr
   *
   * @return reqAddress8Ptr
   */
  public int getReqAddress8Ptr() throws CFException {
    if (isReqAddress8PtrModified()) {
      reqAddress8Ptr = refreshReqAddress8Ptr();
    }
    return reqAddress8Ptr;
  }

  /**
   * Update ReqAddress8Ptr with the passed value Corresponding COBOL Variable is REQ-ADDRESS-8-PTR
   *
   * @param number
   */
  public void setReqAddress8Ptr(int number) {
    // Truncate if the number is beyond +/- Max range
    reqAddress8Ptr = checkReqAddress8PtrMaxLimit(number);
    serializeReqAddress8Ptr(reqAddress8Ptr);
  }

  public void setReqAddress8Ptr(long number) {
    number = checkReqAddress8PtrMaxLimit(number); // Truncate if value is beyond +/- Max range
    setReqAddress8Ptr((int) number);
  }

  /**
   * Returns the value of reqAddress9Length
   *
   * @return reqAddress9Length
   */
  public short getReqAddress9Length() throws CFException {
    if (isReqAddress9LengthModified()) {
      reqAddress9Length = refreshReqAddress9Length();
    }
    return reqAddress9Length;
  }

  /**
   * Update ReqAddress9Length with the passed value Corresponding COBOL Variable is
   * REQ-ADDRESS-9-LENGTH
   *
   * @param number
   */
  public void setReqAddress9Length(short number) {
    // Truncate if the number is beyond +/- Max range
    reqAddress9Length = checkReqAddress9LengthMaxLimit(number);
    serializeReqAddress9Length(reqAddress9Length);
  }

  public void setReqAddress9Length(int number) {
    number =
        checkReqAddress9LengthMaxLimit((short) number); // Truncate if value is beyond +/- Max range
    setReqAddress9Length((short) number);
  }

  public void setReqAddress9Length(long number) {
    number =
        checkReqAddress9LengthMaxLimit((short) number); // Truncate if value is beyond +/- Max range
    setReqAddress9Length((short) number);
  }

  /**
   * Returns the value of reqAddress9
   *
   * @return reqAddress9
   */
  public int getReqAddress9() throws CFException {
    if (isReqAddress9Modified()) {
      reqAddress9 = refreshReqAddress9();
    }
    return reqAddress9;
  }

  /**
   * Update ReqAddress9 with the passed value Corresponding COBOL Variable is REQ-ADDRESS-9
   *
   * @param number
   */
  public void setReqAddress9(int number) {
    // Truncate if the number is beyond +/- Max range
    reqAddress9 = checkReqAddress9MaxLimit(number);
    serializeReqAddress9(reqAddress9);
  }

  public void setReqAddress9(long number) {
    number = checkReqAddress9MaxLimit(number); // Truncate if value is beyond +/- Max range
    setReqAddress9((int) number);
  }

  /**
   * Returns the value of reqAddress9Ptr
   *
   * @return reqAddress9Ptr
   */
  public int getReqAddress9Ptr() throws CFException {
    if (isReqAddress9PtrModified()) {
      reqAddress9Ptr = refreshReqAddress9Ptr();
    }
    return reqAddress9Ptr;
  }

  /**
   * Update ReqAddress9Ptr with the passed value Corresponding COBOL Variable is REQ-ADDRESS-9-PTR
   *
   * @param number
   */
  public void setReqAddress9Ptr(int number) {
    // Truncate if the number is beyond +/- Max range
    reqAddress9Ptr = checkReqAddress9PtrMaxLimit(number);
    serializeReqAddress9Ptr(reqAddress9Ptr);
  }

  public void setReqAddress9Ptr(long number) {
    number = checkReqAddress9PtrMaxLimit(number); // Truncate if value is beyond +/- Max range
    setReqAddress9Ptr((int) number);
  }

  /**
   * Returns the value of reqAddress10Length
   *
   * @return reqAddress10Length
   */
  public short getReqAddress10Length() throws CFException {
    if (isReqAddress10LengthModified()) {
      reqAddress10Length = refreshReqAddress10Length();
    }
    return reqAddress10Length;
  }

  /**
   * Update ReqAddress10Length with the passed value Corresponding COBOL Variable is
   * REQ-ADDRESS-10-LENGTH
   *
   * @param number
   */
  public void setReqAddress10Length(short number) {
    // Truncate if the number is beyond +/- Max range
    reqAddress10Length = checkReqAddress10LengthMaxLimit(number);
    serializeReqAddress10Length(reqAddress10Length);
  }

  public void setReqAddress10Length(int number) {
    number =
        checkReqAddress10LengthMaxLimit(
            (short) number); // Truncate if value is beyond +/- Max range
    setReqAddress10Length((short) number);
  }

  public void setReqAddress10Length(long number) {
    number =
        checkReqAddress10LengthMaxLimit(
            (short) number); // Truncate if value is beyond +/- Max range
    setReqAddress10Length((short) number);
  }

  /**
   * Returns the value of reqAddress10
   *
   * @return reqAddress10
   */
  public int getReqAddress10() throws CFException {
    if (isReqAddress10Modified()) {
      reqAddress10 = refreshReqAddress10();
    }
    return reqAddress10;
  }

  /**
   * Update ReqAddress10 with the passed value Corresponding COBOL Variable is REQ-ADDRESS-10
   *
   * @param number
   */
  public void setReqAddress10(int number) {
    // Truncate if the number is beyond +/- Max range
    reqAddress10 = checkReqAddress10MaxLimit(number);
    serializeReqAddress10(reqAddress10);
  }

  public void setReqAddress10(long number) {
    number = checkReqAddress10MaxLimit(number); // Truncate if value is beyond +/- Max range
    setReqAddress10((int) number);
  }

  /**
   * Returns the value of reqAddress10Ptr
   *
   * @return reqAddress10Ptr
   */
  public int getReqAddress10Ptr() throws CFException {
    if (isReqAddress10PtrModified()) {
      reqAddress10Ptr = refreshReqAddress10Ptr();
    }
    return reqAddress10Ptr;
  }

  /**
   * Update ReqAddress10Ptr with the passed value Corresponding COBOL Variable is REQ-ADDRESS-10-PTR
   *
   * @param number
   */
  public void setReqAddress10Ptr(int number) {
    // Truncate if the number is beyond +/- Max range
    reqAddress10Ptr = checkReqAddress10PtrMaxLimit(number);
    serializeReqAddress10Ptr(reqAddress10Ptr);
  }

  public void setReqAddress10Ptr(long number) {
    number = checkReqAddress10PtrMaxLimit(number); // Truncate if value is beyond +/- Max range
    setReqAddress10Ptr((int) number);
  }

  public static int getReqAddressAreaFieldLength() {
    return REQ_ADDRESS_AREA_LENGTH;
  }
}
