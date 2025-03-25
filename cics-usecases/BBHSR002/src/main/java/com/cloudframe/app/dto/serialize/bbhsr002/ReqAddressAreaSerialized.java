package com.cloudframe.app.dto.serialize.bbhsr002;

/**
 * The class ReqAddressAreaSerialized is used to define offsets in order to serialize in a fixed
 * String
 *
 * @author CloudFrame Inc. created on 2025-03-25 at 08:29. using version 5.0.0.231
 */
import com.cloudframe.app.data.Field;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ReqAddressAreaSerialized extends Field {

  protected Logger logger = LoggerFactory.getLogger(ReqAddressAreaSerialized.class);
  /*  Length of the field, if serialized as a String */
  protected static final int REQ_ADDRESS_AREA_LENGTH = 60;
  /*  offset of each of Child Fields when serialized as a String */
  protected int beginReqAddress1Length;
  protected int beginReqAddress1;
  protected int beginReqAddress1Ptr;
  protected int beginReqAddress2Length;
  protected int beginReqAddress2;
  protected int beginReqAddress2Ptr;
  protected int beginReqAddress3Length;
  protected int beginReqAddress3;
  protected int beginReqAddress3Ptr;
  protected int beginReqAddress4Length;
  protected int beginReqAddress4;
  protected int beginReqAddress4Ptr;
  protected int beginReqAddress5Length;
  protected int beginReqAddress5;
  protected int beginReqAddress5Ptr;
  protected int beginReqAddress6Length;
  protected int beginReqAddress6;
  protected int beginReqAddress6Ptr;
  protected int beginReqAddress7Length;
  protected int beginReqAddress7;
  protected int beginReqAddress7Ptr;
  protected int beginReqAddress8Length;
  protected int beginReqAddress8;
  protected int beginReqAddress8Ptr;
  protected int beginReqAddress9Length;
  protected int beginReqAddress9;
  protected int beginReqAddress9Ptr;
  protected int beginReqAddress10Length;
  protected int beginReqAddress10;
  protected int beginReqAddress10Ptr;

  /** Constructor for ReqAddressAreaSerialized */
  public ReqAddressAreaSerialized() {
    // TO-DO auto generated code
  }

  /**
   * Constructor for ReqAddressAreaSerialized. sets the parent value to the parent
   *
   * @param parent
   * @param begin
   */
  public ReqAddressAreaSerialized(Field parent, int begin) {
    setParent(parent, begin);
  }

  /**
   * sets parent for this ReqAddressAreaSerialized to the parent
   *
   * @param parent
   */
  @Override
  public void setParent(Field parent) {
    setParent(parent, 23); // serialize this field at offset 23 by default
  }

  /**
   * sets parent for this ReqAddressAreaSerialized to the parent and set the serialize offset to
   * parameter begin
   *
   * @param parent
   * @param begin - offset used when serializing this object to a String
   */
  public void setParent(Field parent, int begin) {
    super.setParent(parent);
    init(begin); // serialize this field at offset 23 by default
  }
  /** initializes the field in ReqAddressAreaSerialized */
  @Override
  protected void init(int begin) {
    setStartOffset(begin);
    setLength(REQ_ADDRESS_AREA_LENGTH);
    /*  set the offset/position of each field when this object is serialized as String */
    beginReqAddress1Length = getStartOffset() + 0; // set offset for serialization

    beginReqAddress1 = getStartOffset() + 2; // set offset for serialization

    beginReqAddress1Ptr = getStartOffset() + 2; // set offset for serialization

    beginReqAddress2Length = getStartOffset() + 6; // set offset for serialization

    beginReqAddress2 = getStartOffset() + 8; // set offset for serialization

    beginReqAddress2Ptr = getStartOffset() + 8; // set offset for serialization

    beginReqAddress3Length = getStartOffset() + 12; // set offset for serialization

    beginReqAddress3 = getStartOffset() + 14; // set offset for serialization

    beginReqAddress3Ptr = getStartOffset() + 14; // set offset for serialization

    beginReqAddress4Length = getStartOffset() + 18; // set offset for serialization

    beginReqAddress4 = getStartOffset() + 20; // set offset for serialization

    beginReqAddress4Ptr = getStartOffset() + 20; // set offset for serialization

    beginReqAddress5Length = getStartOffset() + 24; // set offset for serialization

    beginReqAddress5 = getStartOffset() + 26; // set offset for serialization

    beginReqAddress5Ptr = getStartOffset() + 26; // set offset for serialization

    beginReqAddress6Length = getStartOffset() + 30; // set offset for serialization

    beginReqAddress6 = getStartOffset() + 32; // set offset for serialization

    beginReqAddress6Ptr = getStartOffset() + 32; // set offset for serialization

    beginReqAddress7Length = getStartOffset() + 36; // set offset for serialization

    beginReqAddress7 = getStartOffset() + 38; // set offset for serialization

    beginReqAddress7Ptr = getStartOffset() + 38; // set offset for serialization

    beginReqAddress8Length = getStartOffset() + 42; // set offset for serialization

    beginReqAddress8 = getStartOffset() + 44; // set offset for serialization

    beginReqAddress8Ptr = getStartOffset() + 44; // set offset for serialization

    beginReqAddress9Length = getStartOffset() + 48; // set offset for serialization

    beginReqAddress9 = getStartOffset() + 50; // set offset for serialization

    beginReqAddress9Ptr = getStartOffset() + 50; // set offset for serialization

    beginReqAddress10Length = getStartOffset() + 54; // set offset for serialization

    beginReqAddress10 = getStartOffset() + 56; // set offset for serialization

    beginReqAddress10Ptr = getStartOffset() + 56; // set offset for serialization

    /*  end of offset */
  }

  int localReqAddress1LengthCounter = -1;

  public boolean isReqAddress1LengthModified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localReqAddress1LengthCounter != sharedCounter;
    localReqAddress1LengthCounter = sharedCounter;
    return hasModified;
  }

  protected static final int REQ_ADDRESS_1_LENGTH_LEN = 2;
  /** serializeReqAddress1Length */
  protected void serializeReqAddress1Length(short reqAddress1Length) {
    replaceValue( //  save the value as string
        getBinaryString(reqAddress1Length, REQ_ADDRESS_1_LENGTH_LEN),
        beginReqAddress1Length,
        REQ_ADDRESS_1_LENGTH_LEN);
    localReqAddress1LengthCounter = shareString.getSerializedField().getModifiedCounter();
  }

  protected short checkReqAddress1LengthMaxLimit(long number) {
    return (short) checkMaxLimit(number, true /*isSigned*/, 2 /*dataLen*/);
  }
  /**
   * refreshReqAddress1Length is used to refresh the latest value of a variable from the Serialized
   * String the most common reason to serialize an Object as a string in to write to a file. There
   * can be several other reasons for serialization as well
   */
  public short refreshReqAddress1Length() {
    return (getShort(beginReqAddress1Length));
  }

  int localReqAddress1Counter = -1;

  public boolean isReqAddress1Modified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localReqAddress1Counter != sharedCounter;
    localReqAddress1Counter = sharedCounter;
    return hasModified;
  }

  protected static final int REQ_ADDRESS_1_LEN = 4;
  /** serializeReqAddress1 */
  protected void serializeReqAddress1(int reqAddress1) {
    replaceValue( //  save the value as string
        getBinaryString(reqAddress1, REQ_ADDRESS_1_LEN), beginReqAddress1, REQ_ADDRESS_1_LEN);
    localReqAddress1Counter = shareString.getSerializedField().getModifiedCounter();
  }

  protected int checkReqAddress1MaxLimit(long number) {
    return (int) checkMaxLimit(number, true /*isSigned*/, 4 /*dataLen*/);
  }
  /**
   * refreshReqAddress1 is used to refresh the latest value of a variable from the Serialized String
   * the most common reason to serialize an Object as a string in to write to a file. There can be
   * several other reasons for serialization as well
   */
  public int refreshReqAddress1() {
    return (getInt(beginReqAddress1));
  }

  int localReqAddress1PtrCounter = -1;

  public boolean isReqAddress1PtrModified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localReqAddress1PtrCounter != sharedCounter;
    localReqAddress1PtrCounter = sharedCounter;
    return hasModified;
  }

  protected static final int REQ_ADDRESS_1_PTR_LEN = 4;
  /** serializeReqAddress1Ptr */
  protected void serializeReqAddress1Ptr(int reqAddress1Ptr) {
    replaceValue( //  save the value as string
        getBinaryString(reqAddress1Ptr, REQ_ADDRESS_1_PTR_LEN),
        beginReqAddress1Ptr,
        REQ_ADDRESS_1_PTR_LEN);
    localReqAddress1PtrCounter = shareString.getSerializedField().getModifiedCounter();
  }

  protected int checkReqAddress1PtrMaxLimit(long number) {
    return (int) checkMaxLimit(number, true /*isSigned*/, 4 /*dataLen*/);
  }
  /**
   * refreshReqAddress1Ptr is used to refresh the latest value of a variable from the Serialized
   * String the most common reason to serialize an Object as a string in to write to a file. There
   * can be several other reasons for serialization as well
   */
  public int refreshReqAddress1Ptr() {
    return (getInt(beginReqAddress1Ptr));
  }

  int localReqAddress2LengthCounter = -1;

  public boolean isReqAddress2LengthModified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localReqAddress2LengthCounter != sharedCounter;
    localReqAddress2LengthCounter = sharedCounter;
    return hasModified;
  }

  protected static final int REQ_ADDRESS_2_LENGTH_LEN = 2;
  /** serializeReqAddress2Length */
  protected void serializeReqAddress2Length(short reqAddress2Length) {
    replaceValue( //  save the value as string
        getBinaryString(reqAddress2Length, REQ_ADDRESS_2_LENGTH_LEN),
        beginReqAddress2Length,
        REQ_ADDRESS_2_LENGTH_LEN);
    localReqAddress2LengthCounter = shareString.getSerializedField().getModifiedCounter();
  }

  protected short checkReqAddress2LengthMaxLimit(long number) {
    return (short) checkMaxLimit(number, true /*isSigned*/, 2 /*dataLen*/);
  }
  /**
   * refreshReqAddress2Length is used to refresh the latest value of a variable from the Serialized
   * String the most common reason to serialize an Object as a string in to write to a file. There
   * can be several other reasons for serialization as well
   */
  public short refreshReqAddress2Length() {
    return (getShort(beginReqAddress2Length));
  }

  int localReqAddress2Counter = -1;

  public boolean isReqAddress2Modified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localReqAddress2Counter != sharedCounter;
    localReqAddress2Counter = sharedCounter;
    return hasModified;
  }

  protected static final int REQ_ADDRESS_2_LEN = 4;
  /** serializeReqAddress2 */
  protected void serializeReqAddress2(int reqAddress2) {
    replaceValue( //  save the value as string
        getBinaryString(reqAddress2, REQ_ADDRESS_2_LEN), beginReqAddress2, REQ_ADDRESS_2_LEN);
    localReqAddress2Counter = shareString.getSerializedField().getModifiedCounter();
  }

  protected int checkReqAddress2MaxLimit(long number) {
    return (int) checkMaxLimit(number, true /*isSigned*/, 4 /*dataLen*/);
  }
  /**
   * refreshReqAddress2 is used to refresh the latest value of a variable from the Serialized String
   * the most common reason to serialize an Object as a string in to write to a file. There can be
   * several other reasons for serialization as well
   */
  public int refreshReqAddress2() {
    return (getInt(beginReqAddress2));
  }

  int localReqAddress2PtrCounter = -1;

  public boolean isReqAddress2PtrModified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localReqAddress2PtrCounter != sharedCounter;
    localReqAddress2PtrCounter = sharedCounter;
    return hasModified;
  }

  protected static final int REQ_ADDRESS_2_PTR_LEN = 4;
  /** serializeReqAddress2Ptr */
  protected void serializeReqAddress2Ptr(int reqAddress2Ptr) {
    replaceValue( //  save the value as string
        getBinaryString(reqAddress2Ptr, REQ_ADDRESS_2_PTR_LEN),
        beginReqAddress2Ptr,
        REQ_ADDRESS_2_PTR_LEN);
    localReqAddress2PtrCounter = shareString.getSerializedField().getModifiedCounter();
  }

  protected int checkReqAddress2PtrMaxLimit(long number) {
    return (int) checkMaxLimit(number, true /*isSigned*/, 4 /*dataLen*/);
  }
  /**
   * refreshReqAddress2Ptr is used to refresh the latest value of a variable from the Serialized
   * String the most common reason to serialize an Object as a string in to write to a file. There
   * can be several other reasons for serialization as well
   */
  public int refreshReqAddress2Ptr() {
    return (getInt(beginReqAddress2Ptr));
  }

  int localReqAddress3LengthCounter = -1;

  public boolean isReqAddress3LengthModified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localReqAddress3LengthCounter != sharedCounter;
    localReqAddress3LengthCounter = sharedCounter;
    return hasModified;
  }

  protected static final int REQ_ADDRESS_3_LENGTH_LEN = 2;
  /** serializeReqAddress3Length */
  protected void serializeReqAddress3Length(short reqAddress3Length) {
    replaceValue( //  save the value as string
        getBinaryString(reqAddress3Length, REQ_ADDRESS_3_LENGTH_LEN),
        beginReqAddress3Length,
        REQ_ADDRESS_3_LENGTH_LEN);
    localReqAddress3LengthCounter = shareString.getSerializedField().getModifiedCounter();
  }

  protected short checkReqAddress3LengthMaxLimit(long number) {
    return (short) checkMaxLimit(number, true /*isSigned*/, 2 /*dataLen*/);
  }
  /**
   * refreshReqAddress3Length is used to refresh the latest value of a variable from the Serialized
   * String the most common reason to serialize an Object as a string in to write to a file. There
   * can be several other reasons for serialization as well
   */
  public short refreshReqAddress3Length() {
    return (getShort(beginReqAddress3Length));
  }

  int localReqAddress3Counter = -1;

  public boolean isReqAddress3Modified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localReqAddress3Counter != sharedCounter;
    localReqAddress3Counter = sharedCounter;
    return hasModified;
  }

  protected static final int REQ_ADDRESS_3_LEN = 4;
  /** serializeReqAddress3 */
  protected void serializeReqAddress3(int reqAddress3) {
    replaceValue( //  save the value as string
        getBinaryString(reqAddress3, REQ_ADDRESS_3_LEN), beginReqAddress3, REQ_ADDRESS_3_LEN);
    localReqAddress3Counter = shareString.getSerializedField().getModifiedCounter();
  }

  protected int checkReqAddress3MaxLimit(long number) {
    return (int) checkMaxLimit(number, true /*isSigned*/, 4 /*dataLen*/);
  }
  /**
   * refreshReqAddress3 is used to refresh the latest value of a variable from the Serialized String
   * the most common reason to serialize an Object as a string in to write to a file. There can be
   * several other reasons for serialization as well
   */
  public int refreshReqAddress3() {
    return (getInt(beginReqAddress3));
  }

  int localReqAddress3PtrCounter = -1;

  public boolean isReqAddress3PtrModified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localReqAddress3PtrCounter != sharedCounter;
    localReqAddress3PtrCounter = sharedCounter;
    return hasModified;
  }

  protected static final int REQ_ADDRESS_3_PTR_LEN = 4;
  /** serializeReqAddress3Ptr */
  protected void serializeReqAddress3Ptr(int reqAddress3Ptr) {
    replaceValue( //  save the value as string
        getBinaryString(reqAddress3Ptr, REQ_ADDRESS_3_PTR_LEN),
        beginReqAddress3Ptr,
        REQ_ADDRESS_3_PTR_LEN);
    localReqAddress3PtrCounter = shareString.getSerializedField().getModifiedCounter();
  }

  protected int checkReqAddress3PtrMaxLimit(long number) {
    return (int) checkMaxLimit(number, true /*isSigned*/, 4 /*dataLen*/);
  }
  /**
   * refreshReqAddress3Ptr is used to refresh the latest value of a variable from the Serialized
   * String the most common reason to serialize an Object as a string in to write to a file. There
   * can be several other reasons for serialization as well
   */
  public int refreshReqAddress3Ptr() {
    return (getInt(beginReqAddress3Ptr));
  }

  int localReqAddress4LengthCounter = -1;

  public boolean isReqAddress4LengthModified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localReqAddress4LengthCounter != sharedCounter;
    localReqAddress4LengthCounter = sharedCounter;
    return hasModified;
  }

  protected static final int REQ_ADDRESS_4_LENGTH_LEN = 2;
  /** serializeReqAddress4Length */
  protected void serializeReqAddress4Length(short reqAddress4Length) {
    replaceValue( //  save the value as string
        getBinaryString(reqAddress4Length, REQ_ADDRESS_4_LENGTH_LEN),
        beginReqAddress4Length,
        REQ_ADDRESS_4_LENGTH_LEN);
    localReqAddress4LengthCounter = shareString.getSerializedField().getModifiedCounter();
  }

  protected short checkReqAddress4LengthMaxLimit(long number) {
    return (short) checkMaxLimit(number, true /*isSigned*/, 2 /*dataLen*/);
  }
  /**
   * refreshReqAddress4Length is used to refresh the latest value of a variable from the Serialized
   * String the most common reason to serialize an Object as a string in to write to a file. There
   * can be several other reasons for serialization as well
   */
  public short refreshReqAddress4Length() {
    return (getShort(beginReqAddress4Length));
  }

  int localReqAddress4Counter = -1;

  public boolean isReqAddress4Modified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localReqAddress4Counter != sharedCounter;
    localReqAddress4Counter = sharedCounter;
    return hasModified;
  }

  protected static final int REQ_ADDRESS_4_LEN = 4;
  /** serializeReqAddress4 */
  protected void serializeReqAddress4(int reqAddress4) {
    replaceValue( //  save the value as string
        getBinaryString(reqAddress4, REQ_ADDRESS_4_LEN), beginReqAddress4, REQ_ADDRESS_4_LEN);
    localReqAddress4Counter = shareString.getSerializedField().getModifiedCounter();
  }

  protected int checkReqAddress4MaxLimit(long number) {
    return (int) checkMaxLimit(number, true /*isSigned*/, 4 /*dataLen*/);
  }
  /**
   * refreshReqAddress4 is used to refresh the latest value of a variable from the Serialized String
   * the most common reason to serialize an Object as a string in to write to a file. There can be
   * several other reasons for serialization as well
   */
  public int refreshReqAddress4() {
    return (getInt(beginReqAddress4));
  }

  int localReqAddress4PtrCounter = -1;

  public boolean isReqAddress4PtrModified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localReqAddress4PtrCounter != sharedCounter;
    localReqAddress4PtrCounter = sharedCounter;
    return hasModified;
  }

  protected static final int REQ_ADDRESS_4_PTR_LEN = 4;
  /** serializeReqAddress4Ptr */
  protected void serializeReqAddress4Ptr(int reqAddress4Ptr) {
    replaceValue( //  save the value as string
        getBinaryString(reqAddress4Ptr, REQ_ADDRESS_4_PTR_LEN),
        beginReqAddress4Ptr,
        REQ_ADDRESS_4_PTR_LEN);
    localReqAddress4PtrCounter = shareString.getSerializedField().getModifiedCounter();
  }

  protected int checkReqAddress4PtrMaxLimit(long number) {
    return (int) checkMaxLimit(number, true /*isSigned*/, 4 /*dataLen*/);
  }
  /**
   * refreshReqAddress4Ptr is used to refresh the latest value of a variable from the Serialized
   * String the most common reason to serialize an Object as a string in to write to a file. There
   * can be several other reasons for serialization as well
   */
  public int refreshReqAddress4Ptr() {
    return (getInt(beginReqAddress4Ptr));
  }

  int localReqAddress5LengthCounter = -1;

  public boolean isReqAddress5LengthModified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localReqAddress5LengthCounter != sharedCounter;
    localReqAddress5LengthCounter = sharedCounter;
    return hasModified;
  }

  protected static final int REQ_ADDRESS_5_LENGTH_LEN = 2;
  /** serializeReqAddress5Length */
  protected void serializeReqAddress5Length(short reqAddress5Length) {
    replaceValue( //  save the value as string
        getBinaryString(reqAddress5Length, REQ_ADDRESS_5_LENGTH_LEN),
        beginReqAddress5Length,
        REQ_ADDRESS_5_LENGTH_LEN);
    localReqAddress5LengthCounter = shareString.getSerializedField().getModifiedCounter();
  }

  protected short checkReqAddress5LengthMaxLimit(long number) {
    return (short) checkMaxLimit(number, true /*isSigned*/, 2 /*dataLen*/);
  }
  /**
   * refreshReqAddress5Length is used to refresh the latest value of a variable from the Serialized
   * String the most common reason to serialize an Object as a string in to write to a file. There
   * can be several other reasons for serialization as well
   */
  public short refreshReqAddress5Length() {
    return (getShort(beginReqAddress5Length));
  }

  int localReqAddress5Counter = -1;

  public boolean isReqAddress5Modified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localReqAddress5Counter != sharedCounter;
    localReqAddress5Counter = sharedCounter;
    return hasModified;
  }

  protected static final int REQ_ADDRESS_5_LEN = 4;
  /** serializeReqAddress5 */
  protected void serializeReqAddress5(int reqAddress5) {
    replaceValue( //  save the value as string
        getBinaryString(reqAddress5, REQ_ADDRESS_5_LEN), beginReqAddress5, REQ_ADDRESS_5_LEN);
    localReqAddress5Counter = shareString.getSerializedField().getModifiedCounter();
  }

  protected int checkReqAddress5MaxLimit(long number) {
    return (int) checkMaxLimit(number, true /*isSigned*/, 4 /*dataLen*/);
  }
  /**
   * refreshReqAddress5 is used to refresh the latest value of a variable from the Serialized String
   * the most common reason to serialize an Object as a string in to write to a file. There can be
   * several other reasons for serialization as well
   */
  public int refreshReqAddress5() {
    return (getInt(beginReqAddress5));
  }

  int localReqAddress5PtrCounter = -1;

  public boolean isReqAddress5PtrModified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localReqAddress5PtrCounter != sharedCounter;
    localReqAddress5PtrCounter = sharedCounter;
    return hasModified;
  }

  protected static final int REQ_ADDRESS_5_PTR_LEN = 4;
  /** serializeReqAddress5Ptr */
  protected void serializeReqAddress5Ptr(int reqAddress5Ptr) {
    replaceValue( //  save the value as string
        getBinaryString(reqAddress5Ptr, REQ_ADDRESS_5_PTR_LEN),
        beginReqAddress5Ptr,
        REQ_ADDRESS_5_PTR_LEN);
    localReqAddress5PtrCounter = shareString.getSerializedField().getModifiedCounter();
  }

  protected int checkReqAddress5PtrMaxLimit(long number) {
    return (int) checkMaxLimit(number, true /*isSigned*/, 4 /*dataLen*/);
  }
  /**
   * refreshReqAddress5Ptr is used to refresh the latest value of a variable from the Serialized
   * String the most common reason to serialize an Object as a string in to write to a file. There
   * can be several other reasons for serialization as well
   */
  public int refreshReqAddress5Ptr() {
    return (getInt(beginReqAddress5Ptr));
  }

  int localReqAddress6LengthCounter = -1;

  public boolean isReqAddress6LengthModified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localReqAddress6LengthCounter != sharedCounter;
    localReqAddress6LengthCounter = sharedCounter;
    return hasModified;
  }

  protected static final int REQ_ADDRESS_6_LENGTH_LEN = 2;
  /** serializeReqAddress6Length */
  protected void serializeReqAddress6Length(short reqAddress6Length) {
    replaceValue( //  save the value as string
        getBinaryString(reqAddress6Length, REQ_ADDRESS_6_LENGTH_LEN),
        beginReqAddress6Length,
        REQ_ADDRESS_6_LENGTH_LEN);
    localReqAddress6LengthCounter = shareString.getSerializedField().getModifiedCounter();
  }

  protected short checkReqAddress6LengthMaxLimit(long number) {
    return (short) checkMaxLimit(number, true /*isSigned*/, 2 /*dataLen*/);
  }
  /**
   * refreshReqAddress6Length is used to refresh the latest value of a variable from the Serialized
   * String the most common reason to serialize an Object as a string in to write to a file. There
   * can be several other reasons for serialization as well
   */
  public short refreshReqAddress6Length() {
    return (getShort(beginReqAddress6Length));
  }

  int localReqAddress6Counter = -1;

  public boolean isReqAddress6Modified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localReqAddress6Counter != sharedCounter;
    localReqAddress6Counter = sharedCounter;
    return hasModified;
  }

  protected static final int REQ_ADDRESS_6_LEN = 4;
  /** serializeReqAddress6 */
  protected void serializeReqAddress6(int reqAddress6) {
    replaceValue( //  save the value as string
        getBinaryString(reqAddress6, REQ_ADDRESS_6_LEN), beginReqAddress6, REQ_ADDRESS_6_LEN);
    localReqAddress6Counter = shareString.getSerializedField().getModifiedCounter();
  }

  protected int checkReqAddress6MaxLimit(long number) {
    return (int) checkMaxLimit(number, true /*isSigned*/, 4 /*dataLen*/);
  }
  /**
   * refreshReqAddress6 is used to refresh the latest value of a variable from the Serialized String
   * the most common reason to serialize an Object as a string in to write to a file. There can be
   * several other reasons for serialization as well
   */
  public int refreshReqAddress6() {
    return (getInt(beginReqAddress6));
  }

  int localReqAddress6PtrCounter = -1;

  public boolean isReqAddress6PtrModified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localReqAddress6PtrCounter != sharedCounter;
    localReqAddress6PtrCounter = sharedCounter;
    return hasModified;
  }

  protected static final int REQ_ADDRESS_6_PTR_LEN = 4;
  /** serializeReqAddress6Ptr */
  protected void serializeReqAddress6Ptr(int reqAddress6Ptr) {
    replaceValue( //  save the value as string
        getBinaryString(reqAddress6Ptr, REQ_ADDRESS_6_PTR_LEN),
        beginReqAddress6Ptr,
        REQ_ADDRESS_6_PTR_LEN);
    localReqAddress6PtrCounter = shareString.getSerializedField().getModifiedCounter();
  }

  protected int checkReqAddress6PtrMaxLimit(long number) {
    return (int) checkMaxLimit(number, true /*isSigned*/, 4 /*dataLen*/);
  }
  /**
   * refreshReqAddress6Ptr is used to refresh the latest value of a variable from the Serialized
   * String the most common reason to serialize an Object as a string in to write to a file. There
   * can be several other reasons for serialization as well
   */
  public int refreshReqAddress6Ptr() {
    return (getInt(beginReqAddress6Ptr));
  }

  int localReqAddress7LengthCounter = -1;

  public boolean isReqAddress7LengthModified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localReqAddress7LengthCounter != sharedCounter;
    localReqAddress7LengthCounter = sharedCounter;
    return hasModified;
  }

  protected static final int REQ_ADDRESS_7_LENGTH_LEN = 2;
  /** serializeReqAddress7Length */
  protected void serializeReqAddress7Length(short reqAddress7Length) {
    replaceValue( //  save the value as string
        getBinaryString(reqAddress7Length, REQ_ADDRESS_7_LENGTH_LEN),
        beginReqAddress7Length,
        REQ_ADDRESS_7_LENGTH_LEN);
    localReqAddress7LengthCounter = shareString.getSerializedField().getModifiedCounter();
  }

  protected short checkReqAddress7LengthMaxLimit(long number) {
    return (short) checkMaxLimit(number, true /*isSigned*/, 2 /*dataLen*/);
  }
  /**
   * refreshReqAddress7Length is used to refresh the latest value of a variable from the Serialized
   * String the most common reason to serialize an Object as a string in to write to a file. There
   * can be several other reasons for serialization as well
   */
  public short refreshReqAddress7Length() {
    return (getShort(beginReqAddress7Length));
  }

  int localReqAddress7Counter = -1;

  public boolean isReqAddress7Modified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localReqAddress7Counter != sharedCounter;
    localReqAddress7Counter = sharedCounter;
    return hasModified;
  }

  protected static final int REQ_ADDRESS_7_LEN = 4;
  /** serializeReqAddress7 */
  protected void serializeReqAddress7(int reqAddress7) {
    replaceValue( //  save the value as string
        getBinaryString(reqAddress7, REQ_ADDRESS_7_LEN), beginReqAddress7, REQ_ADDRESS_7_LEN);
    localReqAddress7Counter = shareString.getSerializedField().getModifiedCounter();
  }

  protected int checkReqAddress7MaxLimit(long number) {
    return (int) checkMaxLimit(number, true /*isSigned*/, 4 /*dataLen*/);
  }
  /**
   * refreshReqAddress7 is used to refresh the latest value of a variable from the Serialized String
   * the most common reason to serialize an Object as a string in to write to a file. There can be
   * several other reasons for serialization as well
   */
  public int refreshReqAddress7() {
    return (getInt(beginReqAddress7));
  }

  int localReqAddress7PtrCounter = -1;

  public boolean isReqAddress7PtrModified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localReqAddress7PtrCounter != sharedCounter;
    localReqAddress7PtrCounter = sharedCounter;
    return hasModified;
  }

  protected static final int REQ_ADDRESS_7_PTR_LEN = 4;
  /** serializeReqAddress7Ptr */
  protected void serializeReqAddress7Ptr(int reqAddress7Ptr) {
    replaceValue( //  save the value as string
        getBinaryString(reqAddress7Ptr, REQ_ADDRESS_7_PTR_LEN),
        beginReqAddress7Ptr,
        REQ_ADDRESS_7_PTR_LEN);
    localReqAddress7PtrCounter = shareString.getSerializedField().getModifiedCounter();
  }

  protected int checkReqAddress7PtrMaxLimit(long number) {
    return (int) checkMaxLimit(number, true /*isSigned*/, 4 /*dataLen*/);
  }
  /**
   * refreshReqAddress7Ptr is used to refresh the latest value of a variable from the Serialized
   * String the most common reason to serialize an Object as a string in to write to a file. There
   * can be several other reasons for serialization as well
   */
  public int refreshReqAddress7Ptr() {
    return (getInt(beginReqAddress7Ptr));
  }

  int localReqAddress8LengthCounter = -1;

  public boolean isReqAddress8LengthModified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localReqAddress8LengthCounter != sharedCounter;
    localReqAddress8LengthCounter = sharedCounter;
    return hasModified;
  }

  protected static final int REQ_ADDRESS_8_LENGTH_LEN = 2;
  /** serializeReqAddress8Length */
  protected void serializeReqAddress8Length(short reqAddress8Length) {
    replaceValue( //  save the value as string
        getBinaryString(reqAddress8Length, REQ_ADDRESS_8_LENGTH_LEN),
        beginReqAddress8Length,
        REQ_ADDRESS_8_LENGTH_LEN);
    localReqAddress8LengthCounter = shareString.getSerializedField().getModifiedCounter();
  }

  protected short checkReqAddress8LengthMaxLimit(long number) {
    return (short) checkMaxLimit(number, true /*isSigned*/, 2 /*dataLen*/);
  }
  /**
   * refreshReqAddress8Length is used to refresh the latest value of a variable from the Serialized
   * String the most common reason to serialize an Object as a string in to write to a file. There
   * can be several other reasons for serialization as well
   */
  public short refreshReqAddress8Length() {
    return (getShort(beginReqAddress8Length));
  }

  int localReqAddress8Counter = -1;

  public boolean isReqAddress8Modified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localReqAddress8Counter != sharedCounter;
    localReqAddress8Counter = sharedCounter;
    return hasModified;
  }

  protected static final int REQ_ADDRESS_8_LEN = 4;
  /** serializeReqAddress8 */
  protected void serializeReqAddress8(int reqAddress8) {
    replaceValue( //  save the value as string
        getBinaryString(reqAddress8, REQ_ADDRESS_8_LEN), beginReqAddress8, REQ_ADDRESS_8_LEN);
    localReqAddress8Counter = shareString.getSerializedField().getModifiedCounter();
  }

  protected int checkReqAddress8MaxLimit(long number) {
    return (int) checkMaxLimit(number, true /*isSigned*/, 4 /*dataLen*/);
  }
  /**
   * refreshReqAddress8 is used to refresh the latest value of a variable from the Serialized String
   * the most common reason to serialize an Object as a string in to write to a file. There can be
   * several other reasons for serialization as well
   */
  public int refreshReqAddress8() {
    return (getInt(beginReqAddress8));
  }

  int localReqAddress8PtrCounter = -1;

  public boolean isReqAddress8PtrModified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localReqAddress8PtrCounter != sharedCounter;
    localReqAddress8PtrCounter = sharedCounter;
    return hasModified;
  }

  protected static final int REQ_ADDRESS_8_PTR_LEN = 4;
  /** serializeReqAddress8Ptr */
  protected void serializeReqAddress8Ptr(int reqAddress8Ptr) {
    replaceValue( //  save the value as string
        getBinaryString(reqAddress8Ptr, REQ_ADDRESS_8_PTR_LEN),
        beginReqAddress8Ptr,
        REQ_ADDRESS_8_PTR_LEN);
    localReqAddress8PtrCounter = shareString.getSerializedField().getModifiedCounter();
  }

  protected int checkReqAddress8PtrMaxLimit(long number) {
    return (int) checkMaxLimit(number, true /*isSigned*/, 4 /*dataLen*/);
  }
  /**
   * refreshReqAddress8Ptr is used to refresh the latest value of a variable from the Serialized
   * String the most common reason to serialize an Object as a string in to write to a file. There
   * can be several other reasons for serialization as well
   */
  public int refreshReqAddress8Ptr() {
    return (getInt(beginReqAddress8Ptr));
  }

  int localReqAddress9LengthCounter = -1;

  public boolean isReqAddress9LengthModified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localReqAddress9LengthCounter != sharedCounter;
    localReqAddress9LengthCounter = sharedCounter;
    return hasModified;
  }

  protected static final int REQ_ADDRESS_9_LENGTH_LEN = 2;
  /** serializeReqAddress9Length */
  protected void serializeReqAddress9Length(short reqAddress9Length) {
    replaceValue( //  save the value as string
        getBinaryString(reqAddress9Length, REQ_ADDRESS_9_LENGTH_LEN),
        beginReqAddress9Length,
        REQ_ADDRESS_9_LENGTH_LEN);
    localReqAddress9LengthCounter = shareString.getSerializedField().getModifiedCounter();
  }

  protected short checkReqAddress9LengthMaxLimit(long number) {
    return (short) checkMaxLimit(number, true /*isSigned*/, 2 /*dataLen*/);
  }
  /**
   * refreshReqAddress9Length is used to refresh the latest value of a variable from the Serialized
   * String the most common reason to serialize an Object as a string in to write to a file. There
   * can be several other reasons for serialization as well
   */
  public short refreshReqAddress9Length() {
    return (getShort(beginReqAddress9Length));
  }

  int localReqAddress9Counter = -1;

  public boolean isReqAddress9Modified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localReqAddress9Counter != sharedCounter;
    localReqAddress9Counter = sharedCounter;
    return hasModified;
  }

  protected static final int REQ_ADDRESS_9_LEN = 4;
  /** serializeReqAddress9 */
  protected void serializeReqAddress9(int reqAddress9) {
    replaceValue( //  save the value as string
        getBinaryString(reqAddress9, REQ_ADDRESS_9_LEN), beginReqAddress9, REQ_ADDRESS_9_LEN);
    localReqAddress9Counter = shareString.getSerializedField().getModifiedCounter();
  }

  protected int checkReqAddress9MaxLimit(long number) {
    return (int) checkMaxLimit(number, true /*isSigned*/, 4 /*dataLen*/);
  }
  /**
   * refreshReqAddress9 is used to refresh the latest value of a variable from the Serialized String
   * the most common reason to serialize an Object as a string in to write to a file. There can be
   * several other reasons for serialization as well
   */
  public int refreshReqAddress9() {
    return (getInt(beginReqAddress9));
  }

  int localReqAddress9PtrCounter = -1;

  public boolean isReqAddress9PtrModified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localReqAddress9PtrCounter != sharedCounter;
    localReqAddress9PtrCounter = sharedCounter;
    return hasModified;
  }

  protected static final int REQ_ADDRESS_9_PTR_LEN = 4;
  /** serializeReqAddress9Ptr */
  protected void serializeReqAddress9Ptr(int reqAddress9Ptr) {
    replaceValue( //  save the value as string
        getBinaryString(reqAddress9Ptr, REQ_ADDRESS_9_PTR_LEN),
        beginReqAddress9Ptr,
        REQ_ADDRESS_9_PTR_LEN);
    localReqAddress9PtrCounter = shareString.getSerializedField().getModifiedCounter();
  }

  protected int checkReqAddress9PtrMaxLimit(long number) {
    return (int) checkMaxLimit(number, true /*isSigned*/, 4 /*dataLen*/);
  }
  /**
   * refreshReqAddress9Ptr is used to refresh the latest value of a variable from the Serialized
   * String the most common reason to serialize an Object as a string in to write to a file. There
   * can be several other reasons for serialization as well
   */
  public int refreshReqAddress9Ptr() {
    return (getInt(beginReqAddress9Ptr));
  }

  int localReqAddress10LengthCounter = -1;

  public boolean isReqAddress10LengthModified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localReqAddress10LengthCounter != sharedCounter;
    localReqAddress10LengthCounter = sharedCounter;
    return hasModified;
  }

  protected static final int REQ_ADDRESS_10_LENGTH_LEN = 2;
  /** serializeReqAddress10Length */
  protected void serializeReqAddress10Length(short reqAddress10Length) {
    replaceValue( //  save the value as string
        getBinaryString(reqAddress10Length, REQ_ADDRESS_10_LENGTH_LEN),
        beginReqAddress10Length,
        REQ_ADDRESS_10_LENGTH_LEN);
    localReqAddress10LengthCounter = shareString.getSerializedField().getModifiedCounter();
  }

  protected short checkReqAddress10LengthMaxLimit(long number) {
    return (short) checkMaxLimit(number, true /*isSigned*/, 2 /*dataLen*/);
  }
  /**
   * refreshReqAddress10Length is used to refresh the latest value of a variable from the Serialized
   * String the most common reason to serialize an Object as a string in to write to a file. There
   * can be several other reasons for serialization as well
   */
  public short refreshReqAddress10Length() {
    return (getShort(beginReqAddress10Length));
  }

  int localReqAddress10Counter = -1;

  public boolean isReqAddress10Modified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localReqAddress10Counter != sharedCounter;
    localReqAddress10Counter = sharedCounter;
    return hasModified;
  }

  protected static final int REQ_ADDRESS_10_LEN = 4;
  /** serializeReqAddress10 */
  protected void serializeReqAddress10(int reqAddress10) {
    replaceValue( //  save the value as string
        getBinaryString(reqAddress10, REQ_ADDRESS_10_LEN), beginReqAddress10, REQ_ADDRESS_10_LEN);
    localReqAddress10Counter = shareString.getSerializedField().getModifiedCounter();
  }

  protected int checkReqAddress10MaxLimit(long number) {
    return (int) checkMaxLimit(number, true /*isSigned*/, 4 /*dataLen*/);
  }
  /**
   * refreshReqAddress10 is used to refresh the latest value of a variable from the Serialized
   * String the most common reason to serialize an Object as a string in to write to a file. There
   * can be several other reasons for serialization as well
   */
  public int refreshReqAddress10() {
    return (getInt(beginReqAddress10));
  }

  int localReqAddress10PtrCounter = -1;

  public boolean isReqAddress10PtrModified() {
    int sharedCounter = shareString.getSerializedField().getModifiedCounter();
    boolean hasModified = localReqAddress10PtrCounter != sharedCounter;
    localReqAddress10PtrCounter = sharedCounter;
    return hasModified;
  }

  protected static final int REQ_ADDRESS_10_PTR_LEN = 4;
  /** serializeReqAddress10Ptr */
  protected void serializeReqAddress10Ptr(int reqAddress10Ptr) {
    replaceValue( //  save the value as string
        getBinaryString(reqAddress10Ptr, REQ_ADDRESS_10_PTR_LEN),
        beginReqAddress10Ptr,
        REQ_ADDRESS_10_PTR_LEN);
    localReqAddress10PtrCounter = shareString.getSerializedField().getModifiedCounter();
  }

  protected int checkReqAddress10PtrMaxLimit(long number) {
    return (int) checkMaxLimit(number, true /*isSigned*/, 4 /*dataLen*/);
  }
  /**
   * refreshReqAddress10Ptr is used to refresh the latest value of a variable from the Serialized
   * String the most common reason to serialize an Object as a string in to write to a file. There
   * can be several other reasons for serialization as well
   */
  public int refreshReqAddress10Ptr() {
    return (getInt(beginReqAddress10Ptr));
  }
}
