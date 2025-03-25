package com.cloudframe.app.dto.serialize.d5427hpc;

/**
 * The class HvHipaaCodeListSerialized is used to define offsets in order to serialize in a fixed
 * String
 *
 * @author CloudFrame Inc. created on 2025-03-25 at 08:29. using version 5.0.0.231
 */
import com.cloudframe.app.data.Field;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class HvHipaaCodeListSerialized extends Field {

  protected Logger logger = LoggerFactory.getLogger(HvHipaaCodeListSerialized.class);
  /*  Length of the field, if serialized as a String */
  protected static final int HV_HIPAA_CODE_LIST_LENGTH = 20;
  /*  offset of each of Child Fields when serialized as a String */
  protected int beginHvHipaaCodeItem1;
  protected int beginHvHipaaCodeItem2;
  protected int beginHvHipaaCodeItem3;
  protected int beginHvHipaaCodeItem4;
  protected int beginHvHipaaCodeItem5;
  protected int beginHvHipaaCodeItem6;
  protected int beginHvHipaaCodeItem7;
  protected int beginHvHipaaCodeItem8;
  protected int beginHvHipaaCodeItem9;
  protected int beginHvHipaaCodeItem10;

  /** Constructor for HvHipaaCodeListSerialized */
  public HvHipaaCodeListSerialized() {
    init(0);
  }

  /** initializes the field in HvHipaaCodeListSerialized */
  @Override
  protected void init(int begin) {
    setStartOffset(begin);
    setLength(HV_HIPAA_CODE_LIST_LENGTH);
    /*  set the offset/position of each field when this object is serialized as String */
    beginHvHipaaCodeItem1 = getStartOffset() + 0; // set offset for serialization

    beginHvHipaaCodeItem2 = getStartOffset() + 2; // set offset for serialization

    beginHvHipaaCodeItem3 = getStartOffset() + 4; // set offset for serialization

    beginHvHipaaCodeItem4 = getStartOffset() + 6; // set offset for serialization

    beginHvHipaaCodeItem5 = getStartOffset() + 8; // set offset for serialization

    beginHvHipaaCodeItem6 = getStartOffset() + 10; // set offset for serialization

    beginHvHipaaCodeItem7 = getStartOffset() + 12; // set offset for serialization

    beginHvHipaaCodeItem8 = getStartOffset() + 14; // set offset for serialization

    beginHvHipaaCodeItem9 = getStartOffset() + 16; // set offset for serialization

    beginHvHipaaCodeItem10 = getStartOffset() + 18; // set offset for serialization

    /*  end of offset */
  }

  int localHvHipaaCodeItem1Counter = -1;

  public boolean isHvHipaaCodeItem1Modified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localHvHipaaCodeItem1Counter != sharedCounter;
    localHvHipaaCodeItem1Counter = sharedCounter;
    return hasModified;
  }

  protected static final int HV_HIPAA_CODE_ITEM_1_LEN = 2;
  /** serialize this HvHipaaCodeItem1 */
  protected void serializeHvHipaaCodeItem1(char[] hvHipaaCodeItem1) {
    shareString.getSerializedField().incrementCounter();
    arraycopy(
        hvHipaaCodeItem1, 0, getStringValue(), beginHvHipaaCodeItem1, HV_HIPAA_CODE_ITEM_1_LEN);
    localHvHipaaCodeItem1Counter = shareString.getSerializedField().getModifiedCounter();
  }

  protected char[] checkHvHipaaCodeItem1Constraints(char[] value) {
    return super.checkConstraints(value, 2, false, false);
  }
  /**
   * refreshHvHipaaCodeItem1 is used to refresh the latest value of a variable from the Serialized
   * String the most common reason to serialize an Object as a string in to write to a file. There
   * can be several other reasons for serialization as well
   */
  public char[] refreshHvHipaaCodeItem1() {
    return (substring(
        getStringValue(), beginHvHipaaCodeItem1, beginHvHipaaCodeItem1 + HV_HIPAA_CODE_ITEM_1_LEN));
  }

  int localHvHipaaCodeItem2Counter = -1;

  public boolean isHvHipaaCodeItem2Modified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localHvHipaaCodeItem2Counter != sharedCounter;
    localHvHipaaCodeItem2Counter = sharedCounter;
    return hasModified;
  }

  protected static final int HV_HIPAA_CODE_ITEM_2_LEN = 2;
  /** serialize this HvHipaaCodeItem2 */
  protected void serializeHvHipaaCodeItem2(char[] hvHipaaCodeItem2) {
    shareString.getSerializedField().incrementCounter();
    arraycopy(
        hvHipaaCodeItem2, 0, getStringValue(), beginHvHipaaCodeItem2, HV_HIPAA_CODE_ITEM_2_LEN);
    localHvHipaaCodeItem2Counter = shareString.getSerializedField().getModifiedCounter();
  }

  protected char[] checkHvHipaaCodeItem2Constraints(char[] value) {
    return super.checkConstraints(value, 2, false, false);
  }
  /**
   * refreshHvHipaaCodeItem2 is used to refresh the latest value of a variable from the Serialized
   * String the most common reason to serialize an Object as a string in to write to a file. There
   * can be several other reasons for serialization as well
   */
  public char[] refreshHvHipaaCodeItem2() {
    return (substring(
        getStringValue(), beginHvHipaaCodeItem2, beginHvHipaaCodeItem2 + HV_HIPAA_CODE_ITEM_2_LEN));
  }

  int localHvHipaaCodeItem3Counter = -1;

  public boolean isHvHipaaCodeItem3Modified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localHvHipaaCodeItem3Counter != sharedCounter;
    localHvHipaaCodeItem3Counter = sharedCounter;
    return hasModified;
  }

  protected static final int HV_HIPAA_CODE_ITEM_3_LEN = 2;
  /** serialize this HvHipaaCodeItem3 */
  protected void serializeHvHipaaCodeItem3(char[] hvHipaaCodeItem3) {
    shareString.getSerializedField().incrementCounter();
    arraycopy(
        hvHipaaCodeItem3, 0, getStringValue(), beginHvHipaaCodeItem3, HV_HIPAA_CODE_ITEM_3_LEN);
    localHvHipaaCodeItem3Counter = shareString.getSerializedField().getModifiedCounter();
  }

  protected char[] checkHvHipaaCodeItem3Constraints(char[] value) {
    return super.checkConstraints(value, 2, false, false);
  }
  /**
   * refreshHvHipaaCodeItem3 is used to refresh the latest value of a variable from the Serialized
   * String the most common reason to serialize an Object as a string in to write to a file. There
   * can be several other reasons for serialization as well
   */
  public char[] refreshHvHipaaCodeItem3() {
    return (substring(
        getStringValue(), beginHvHipaaCodeItem3, beginHvHipaaCodeItem3 + HV_HIPAA_CODE_ITEM_3_LEN));
  }

  int localHvHipaaCodeItem4Counter = -1;

  public boolean isHvHipaaCodeItem4Modified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localHvHipaaCodeItem4Counter != sharedCounter;
    localHvHipaaCodeItem4Counter = sharedCounter;
    return hasModified;
  }

  protected static final int HV_HIPAA_CODE_ITEM_4_LEN = 2;
  /** serialize this HvHipaaCodeItem4 */
  protected void serializeHvHipaaCodeItem4(char[] hvHipaaCodeItem4) {
    shareString.getSerializedField().incrementCounter();
    arraycopy(
        hvHipaaCodeItem4, 0, getStringValue(), beginHvHipaaCodeItem4, HV_HIPAA_CODE_ITEM_4_LEN);
    localHvHipaaCodeItem4Counter = shareString.getSerializedField().getModifiedCounter();
  }

  protected char[] checkHvHipaaCodeItem4Constraints(char[] value) {
    return super.checkConstraints(value, 2, false, false);
  }
  /**
   * refreshHvHipaaCodeItem4 is used to refresh the latest value of a variable from the Serialized
   * String the most common reason to serialize an Object as a string in to write to a file. There
   * can be several other reasons for serialization as well
   */
  public char[] refreshHvHipaaCodeItem4() {
    return (substring(
        getStringValue(), beginHvHipaaCodeItem4, beginHvHipaaCodeItem4 + HV_HIPAA_CODE_ITEM_4_LEN));
  }

  int localHvHipaaCodeItem5Counter = -1;

  public boolean isHvHipaaCodeItem5Modified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localHvHipaaCodeItem5Counter != sharedCounter;
    localHvHipaaCodeItem5Counter = sharedCounter;
    return hasModified;
  }

  protected static final int HV_HIPAA_CODE_ITEM_5_LEN = 2;
  /** serialize this HvHipaaCodeItem5 */
  protected void serializeHvHipaaCodeItem5(char[] hvHipaaCodeItem5) {
    shareString.getSerializedField().incrementCounter();
    arraycopy(
        hvHipaaCodeItem5, 0, getStringValue(), beginHvHipaaCodeItem5, HV_HIPAA_CODE_ITEM_5_LEN);
    localHvHipaaCodeItem5Counter = shareString.getSerializedField().getModifiedCounter();
  }

  protected char[] checkHvHipaaCodeItem5Constraints(char[] value) {
    return super.checkConstraints(value, 2, false, false);
  }
  /**
   * refreshHvHipaaCodeItem5 is used to refresh the latest value of a variable from the Serialized
   * String the most common reason to serialize an Object as a string in to write to a file. There
   * can be several other reasons for serialization as well
   */
  public char[] refreshHvHipaaCodeItem5() {
    return (substring(
        getStringValue(), beginHvHipaaCodeItem5, beginHvHipaaCodeItem5 + HV_HIPAA_CODE_ITEM_5_LEN));
  }

  int localHvHipaaCodeItem6Counter = -1;

  public boolean isHvHipaaCodeItem6Modified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localHvHipaaCodeItem6Counter != sharedCounter;
    localHvHipaaCodeItem6Counter = sharedCounter;
    return hasModified;
  }

  protected static final int HV_HIPAA_CODE_ITEM_6_LEN = 2;
  /** serialize this HvHipaaCodeItem6 */
  protected void serializeHvHipaaCodeItem6(char[] hvHipaaCodeItem6) {
    shareString.getSerializedField().incrementCounter();
    arraycopy(
        hvHipaaCodeItem6, 0, getStringValue(), beginHvHipaaCodeItem6, HV_HIPAA_CODE_ITEM_6_LEN);
    localHvHipaaCodeItem6Counter = shareString.getSerializedField().getModifiedCounter();
  }

  protected char[] checkHvHipaaCodeItem6Constraints(char[] value) {
    return super.checkConstraints(value, 2, false, false);
  }
  /**
   * refreshHvHipaaCodeItem6 is used to refresh the latest value of a variable from the Serialized
   * String the most common reason to serialize an Object as a string in to write to a file. There
   * can be several other reasons for serialization as well
   */
  public char[] refreshHvHipaaCodeItem6() {
    return (substring(
        getStringValue(), beginHvHipaaCodeItem6, beginHvHipaaCodeItem6 + HV_HIPAA_CODE_ITEM_6_LEN));
  }

  int localHvHipaaCodeItem7Counter = -1;

  public boolean isHvHipaaCodeItem7Modified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localHvHipaaCodeItem7Counter != sharedCounter;
    localHvHipaaCodeItem7Counter = sharedCounter;
    return hasModified;
  }

  protected static final int HV_HIPAA_CODE_ITEM_7_LEN = 2;
  /** serialize this HvHipaaCodeItem7 */
  protected void serializeHvHipaaCodeItem7(char[] hvHipaaCodeItem7) {
    shareString.getSerializedField().incrementCounter();
    arraycopy(
        hvHipaaCodeItem7, 0, getStringValue(), beginHvHipaaCodeItem7, HV_HIPAA_CODE_ITEM_7_LEN);
    localHvHipaaCodeItem7Counter = shareString.getSerializedField().getModifiedCounter();
  }

  protected char[] checkHvHipaaCodeItem7Constraints(char[] value) {
    return super.checkConstraints(value, 2, false, false);
  }
  /**
   * refreshHvHipaaCodeItem7 is used to refresh the latest value of a variable from the Serialized
   * String the most common reason to serialize an Object as a string in to write to a file. There
   * can be several other reasons for serialization as well
   */
  public char[] refreshHvHipaaCodeItem7() {
    return (substring(
        getStringValue(), beginHvHipaaCodeItem7, beginHvHipaaCodeItem7 + HV_HIPAA_CODE_ITEM_7_LEN));
  }

  int localHvHipaaCodeItem8Counter = -1;

  public boolean isHvHipaaCodeItem8Modified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localHvHipaaCodeItem8Counter != sharedCounter;
    localHvHipaaCodeItem8Counter = sharedCounter;
    return hasModified;
  }

  protected static final int HV_HIPAA_CODE_ITEM_8_LEN = 2;
  /** serialize this HvHipaaCodeItem8 */
  protected void serializeHvHipaaCodeItem8(char[] hvHipaaCodeItem8) {
    shareString.getSerializedField().incrementCounter();
    arraycopy(
        hvHipaaCodeItem8, 0, getStringValue(), beginHvHipaaCodeItem8, HV_HIPAA_CODE_ITEM_8_LEN);
    localHvHipaaCodeItem8Counter = shareString.getSerializedField().getModifiedCounter();
  }

  protected char[] checkHvHipaaCodeItem8Constraints(char[] value) {
    return super.checkConstraints(value, 2, false, false);
  }
  /**
   * refreshHvHipaaCodeItem8 is used to refresh the latest value of a variable from the Serialized
   * String the most common reason to serialize an Object as a string in to write to a file. There
   * can be several other reasons for serialization as well
   */
  public char[] refreshHvHipaaCodeItem8() {
    return (substring(
        getStringValue(), beginHvHipaaCodeItem8, beginHvHipaaCodeItem8 + HV_HIPAA_CODE_ITEM_8_LEN));
  }

  int localHvHipaaCodeItem9Counter = -1;

  public boolean isHvHipaaCodeItem9Modified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localHvHipaaCodeItem9Counter != sharedCounter;
    localHvHipaaCodeItem9Counter = sharedCounter;
    return hasModified;
  }

  protected static final int HV_HIPAA_CODE_ITEM_9_LEN = 2;
  /** serialize this HvHipaaCodeItem9 */
  protected void serializeHvHipaaCodeItem9(char[] hvHipaaCodeItem9) {
    shareString.getSerializedField().incrementCounter();
    arraycopy(
        hvHipaaCodeItem9, 0, getStringValue(), beginHvHipaaCodeItem9, HV_HIPAA_CODE_ITEM_9_LEN);
    localHvHipaaCodeItem9Counter = shareString.getSerializedField().getModifiedCounter();
  }

  protected char[] checkHvHipaaCodeItem9Constraints(char[] value) {
    return super.checkConstraints(value, 2, false, false);
  }
  /**
   * refreshHvHipaaCodeItem9 is used to refresh the latest value of a variable from the Serialized
   * String the most common reason to serialize an Object as a string in to write to a file. There
   * can be several other reasons for serialization as well
   */
  public char[] refreshHvHipaaCodeItem9() {
    return (substring(
        getStringValue(), beginHvHipaaCodeItem9, beginHvHipaaCodeItem9 + HV_HIPAA_CODE_ITEM_9_LEN));
  }

  int localHvHipaaCodeItem10Counter = -1;

  public boolean isHvHipaaCodeItem10Modified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localHvHipaaCodeItem10Counter != sharedCounter;
    localHvHipaaCodeItem10Counter = sharedCounter;
    return hasModified;
  }

  protected static final int HV_HIPAA_CODE_ITEM_10_LEN = 2;
  /** serialize this HvHipaaCodeItem10 */
  protected void serializeHvHipaaCodeItem10(char[] hvHipaaCodeItem10) {
    shareString.getSerializedField().incrementCounter();
    arraycopy(
        hvHipaaCodeItem10, 0, getStringValue(), beginHvHipaaCodeItem10, HV_HIPAA_CODE_ITEM_10_LEN);
    localHvHipaaCodeItem10Counter = shareString.getSerializedField().getModifiedCounter();
  }

  protected char[] checkHvHipaaCodeItem10Constraints(char[] value) {
    return super.checkConstraints(value, 2, false, false);
  }
  /**
   * refreshHvHipaaCodeItem10 is used to refresh the latest value of a variable from the Serialized
   * String the most common reason to serialize an Object as a string in to write to a file. There
   * can be several other reasons for serialization as well
   */
  public char[] refreshHvHipaaCodeItem10() {
    return (substring(
        getStringValue(),
        beginHvHipaaCodeItem10,
        beginHvHipaaCodeItem10 + HV_HIPAA_CODE_ITEM_10_LEN));
  }
}
