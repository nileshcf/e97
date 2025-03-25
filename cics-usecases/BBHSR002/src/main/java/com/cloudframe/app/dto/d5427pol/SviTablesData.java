package com.cloudframe.app.dto.d5427pol;

/**
 * The class SviTablesData is used to handle fields declared in it
 *
 * @author CloudFrame Inc. created on 2025-03-25 at 08:31. using version 5.0.0.231
 */
import com.cloudframe.app.data.Field;
import com.cloudframe.app.dto.serialize.d5427pol.*;
import com.cloudframe.app.exception.CFException;

public class SviTablesData extends SviTablesDataSerialized {

  private char[] slot001 = Field.fillLowValue(6);

  private short slot001Ind;

  private char[] eff001 = Field.fillLowValue(10);

  private short eff001Ind;

  private char[] canc001 = Field.fillLowValue(10);

  private short canc001Ind;

  private char[] slot002 = Field.fillLowValue(6);

  private short slot002Ind;

  private char[] eff002 = Field.fillLowValue(10);

  private short eff002Ind;

  private char[] canc002 = Field.fillLowValue(10);

  private short canc002Ind;

  private char[] slot003 = Field.fillLowValue(6);

  private short slot003Ind;

  private char[] eff003 = Field.fillLowValue(10);

  private short eff003Ind;

  private char[] canc003 = Field.fillLowValue(10);

  private short canc003Ind;

  private char[] slot004 = Field.fillLowValue(6);

  private short slot004Ind;

  private char[] eff004 = Field.fillLowValue(10);

  private short eff004Ind;

  private char[] canc004 = Field.fillLowValue(10);

  private short canc004Ind;

  private char[] slot005 = Field.fillLowValue(6);

  private short slot005Ind;

  private char[] eff005 = Field.fillLowValue(10);

  private short eff005Ind;

  private char[] canc005 = Field.fillLowValue(10);

  private short canc005Ind;

  private char[] slot006 = Field.fillLowValue(6);

  private short slot006Ind;

  private char[] eff006 = Field.fillLowValue(10);

  private short eff006Ind;

  private char[] canc006 = Field.fillLowValue(10);

  private short canc006Ind;

  private char[] slot007 = Field.fillLowValue(6);

  private short slot007Ind;

  private char[] eff007 = Field.fillLowValue(10);

  private short eff007Ind;

  private char[] canc007 = Field.fillLowValue(10);

  private short canc007Ind;

  private char[] slot008 = Field.fillLowValue(6);

  private short slot008Ind;

  private char[] eff008 = Field.fillLowValue(10);

  private short eff008Ind;

  private char[] canc008 = Field.fillLowValue(10);

  private short canc008Ind;

  private char[] slot009 = Field.fillLowValue(6);

  private short slot009Ind;

  private char[] eff009 = Field.fillLowValue(10);

  private short eff009Ind;

  private char[] canc009 = Field.fillLowValue(10);

  private short canc009Ind;

  private char[] slot010 = Field.fillLowValue(6);

  private short slot010Ind;

  private char[] eff010 = Field.fillLowValue(10);

  private short eff010Ind;

  private char[] canc010 = Field.fillLowValue(10);

  private short canc010Ind;

  private char[] slot011 = Field.fillLowValue(6);

  private short slot011Ind;

  private char[] eff011 = Field.fillLowValue(10);

  private short eff011Ind;

  private char[] canc011 = Field.fillLowValue(10);

  private short canc011Ind;

  private char[] slot012 = Field.fillLowValue(6);

  private short slot012Ind;

  private char[] eff012 = Field.fillLowValue(10);

  private short eff012Ind;

  private char[] canc012 = Field.fillLowValue(10);

  private short canc012Ind;

  private char[] slot013 = Field.fillLowValue(6);

  private short slot013Ind;

  private char[] eff013 = Field.fillLowValue(10);

  private short eff013Ind;

  private char[] canc013 = Field.fillLowValue(10);

  private short canc013Ind;

  private char[] slot014 = Field.fillLowValue(6);

  private short slot014Ind;

  private char[] eff014 = Field.fillLowValue(10);

  private short eff014Ind;

  private char[] canc014 = Field.fillLowValue(10);

  private short canc014Ind;

  private char[] slot015 = Field.fillLowValue(6);

  private short slot015Ind;

  private char[] slot016 = Field.fillLowValue(6);

  private short slot016Ind;

  private char[] slot017 = Field.fillLowValue(6);

  private short slot017Ind;

  private char[] slot018 = Field.fillLowValue(6);

  private short slot018Ind;

  private char[] slot019 = Field.fillLowValue(6);

  private short slot019Ind;

  private char[] slot020 = Field.fillLowValue(6);

  private short slot020Ind;

  /** Constructor for SviTablesData */
  public SviTablesData() {
    super();
    /*  set the parent of each child as this which are a group variable */
    /*  end of offset */
  }

  /**
   * Returns the value of slot001
   *
   * @return slot001
   */
  public char[] getSlot001() throws CFException {
    if (isSlot001Modified()) {
      slot001 = refreshSlot001();
    }
    return slot001;
  }

  /**
   * set variable slot001 Corresponding COBOL Variable is WS-SLOT-001
   *
   * @param value
   */
  public void setSlot001(char[] value) {
    slot001 = checkSlot001Constraints(value);
    serializeSlot001(slot001);
  }

  /**
   * Update Slot001 with a char[] from an offset and length
   *
   * @param value
   */
  public void setSlot001(char[] source, int sourceIndex) {
    replace(source, sourceIndex, source.length, beginSlot001, slot001.length);
  }

  public void setSlot001(char[] source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginSlot001, slot001.length);
  }

  /**
   * Update Slot001 with a char[] from an offset and length to an offset and length
   *
   * @param value
   */
  public void setSlot001(
      char[] source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginSlot001 + targetIndex, targetLen);
  }

  /**
   * Update Slot001 with another Field
   *
   * @param value
   */
  public void setSlot001(Field source) {
    replace(source, 0, source.length(), beginSlot001, SLOT_001_LEN);
  }

  /**
   * Update Slot001 with another Field from an offset and length
   *
   * @param value
   */
  public void setSlot001(Field source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginSlot001, SLOT_001_LEN);
  }

  /**
   * Update Slot001 with another Field from an offset and length to an offset and length
   *
   * @param value
   */
  public void setSlot001(
      Field source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginSlot001 + targetIndex, targetLen);
  }
  /**
   * Returns the value of slot001Ind
   *
   * @return slot001Ind
   */
  public short getSlot001Ind() throws CFException {
    if (isSlot001IndModified()) {
      slot001Ind = refreshSlot001Ind();
    }
    return slot001Ind;
  }

  /**
   * Update Slot001Ind with the passed value Corresponding COBOL Variable is WS-SLOT-001-IND
   *
   * @param number
   */
  public void setSlot001Ind(short number) {
    // Truncate if the number is beyond +/- Max range
    slot001Ind = checkSlot001IndMaxLimit(number);
    serializeSlot001Ind(slot001Ind);
  }

  public void setSlot001Ind(int number) {
    number = checkSlot001IndMaxLimit((short) number); // Truncate if value is beyond +/- Max range
    setSlot001Ind((short) number);
  }

  public void setSlot001Ind(long number) {
    number = checkSlot001IndMaxLimit((short) number); // Truncate if value is beyond +/- Max range
    setSlot001Ind((short) number);
  }

  /**
   * Returns the value of eff001
   *
   * @return eff001
   */
  public char[] getEff001() throws CFException {
    if (isEff001Modified()) {
      eff001 = refreshEff001();
    }
    return eff001;
  }

  /**
   * set variable eff001 Corresponding COBOL Variable is WS-EFF-001
   *
   * @param value
   */
  public void setEff001(char[] value) {
    eff001 = checkEff001Constraints(value);
    serializeEff001(eff001);
  }

  /**
   * Update Eff001 with a char[] from an offset and length
   *
   * @param value
   */
  public void setEff001(char[] source, int sourceIndex) {
    replace(source, sourceIndex, source.length, beginEff001, eff001.length);
  }

  public void setEff001(char[] source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginEff001, eff001.length);
  }

  /**
   * Update Eff001 with a char[] from an offset and length to an offset and length
   *
   * @param value
   */
  public void setEff001(
      char[] source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginEff001 + targetIndex, targetLen);
  }

  /**
   * Update Eff001 with another Field
   *
   * @param value
   */
  public void setEff001(Field source) {
    replace(source, 0, source.length(), beginEff001, EFF_001_LEN);
  }

  /**
   * Update Eff001 with another Field from an offset and length
   *
   * @param value
   */
  public void setEff001(Field source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginEff001, EFF_001_LEN);
  }

  /**
   * Update Eff001 with another Field from an offset and length to an offset and length
   *
   * @param value
   */
  public void setEff001(
      Field source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginEff001 + targetIndex, targetLen);
  }
  /**
   * Returns the value of eff001Ind
   *
   * @return eff001Ind
   */
  public short getEff001Ind() throws CFException {
    if (isEff001IndModified()) {
      eff001Ind = refreshEff001Ind();
    }
    return eff001Ind;
  }

  /**
   * Update Eff001Ind with the passed value Corresponding COBOL Variable is WS-EFF-001-IND
   *
   * @param number
   */
  public void setEff001Ind(short number) {
    // Truncate if the number is beyond +/- Max range
    eff001Ind = checkEff001IndMaxLimit(number);
    serializeEff001Ind(eff001Ind);
  }

  public void setEff001Ind(int number) {
    number = checkEff001IndMaxLimit((short) number); // Truncate if value is beyond +/- Max range
    setEff001Ind((short) number);
  }

  public void setEff001Ind(long number) {
    number = checkEff001IndMaxLimit((short) number); // Truncate if value is beyond +/- Max range
    setEff001Ind((short) number);
  }

  /**
   * Returns the value of canc001
   *
   * @return canc001
   */
  public char[] getCanc001() throws CFException {
    if (isCanc001Modified()) {
      canc001 = refreshCanc001();
    }
    return canc001;
  }

  /**
   * set variable canc001 Corresponding COBOL Variable is WS-CANC-001
   *
   * @param value
   */
  public void setCanc001(char[] value) {
    canc001 = checkCanc001Constraints(value);
    serializeCanc001(canc001);
  }

  /**
   * Update Canc001 with a char[] from an offset and length
   *
   * @param value
   */
  public void setCanc001(char[] source, int sourceIndex) {
    replace(source, sourceIndex, source.length, beginCanc001, canc001.length);
  }

  public void setCanc001(char[] source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginCanc001, canc001.length);
  }

  /**
   * Update Canc001 with a char[] from an offset and length to an offset and length
   *
   * @param value
   */
  public void setCanc001(
      char[] source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginCanc001 + targetIndex, targetLen);
  }

  /**
   * Update Canc001 with another Field
   *
   * @param value
   */
  public void setCanc001(Field source) {
    replace(source, 0, source.length(), beginCanc001, CANC_001_LEN);
  }

  /**
   * Update Canc001 with another Field from an offset and length
   *
   * @param value
   */
  public void setCanc001(Field source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginCanc001, CANC_001_LEN);
  }

  /**
   * Update Canc001 with another Field from an offset and length to an offset and length
   *
   * @param value
   */
  public void setCanc001(
      Field source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginCanc001 + targetIndex, targetLen);
  }
  /**
   * Returns the value of canc001Ind
   *
   * @return canc001Ind
   */
  public short getCanc001Ind() throws CFException {
    if (isCanc001IndModified()) {
      canc001Ind = refreshCanc001Ind();
    }
    return canc001Ind;
  }

  /**
   * Update Canc001Ind with the passed value Corresponding COBOL Variable is WS-CANC-001-IND
   *
   * @param number
   */
  public void setCanc001Ind(short number) {
    // Truncate if the number is beyond +/- Max range
    canc001Ind = checkCanc001IndMaxLimit(number);
    serializeCanc001Ind(canc001Ind);
  }

  public void setCanc001Ind(int number) {
    number = checkCanc001IndMaxLimit((short) number); // Truncate if value is beyond +/- Max range
    setCanc001Ind((short) number);
  }

  public void setCanc001Ind(long number) {
    number = checkCanc001IndMaxLimit((short) number); // Truncate if value is beyond +/- Max range
    setCanc001Ind((short) number);
  }

  /**
   * Returns the value of slot002
   *
   * @return slot002
   */
  public char[] getSlot002() throws CFException {
    if (isSlot002Modified()) {
      slot002 = refreshSlot002();
    }
    return slot002;
  }

  /**
   * set variable slot002 Corresponding COBOL Variable is WS-SLOT-002
   *
   * @param value
   */
  public void setSlot002(char[] value) {
    slot002 = checkSlot002Constraints(value);
    serializeSlot002(slot002);
  }

  /**
   * Update Slot002 with a char[] from an offset and length
   *
   * @param value
   */
  public void setSlot002(char[] source, int sourceIndex) {
    replace(source, sourceIndex, source.length, beginSlot002, slot002.length);
  }

  public void setSlot002(char[] source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginSlot002, slot002.length);
  }

  /**
   * Update Slot002 with a char[] from an offset and length to an offset and length
   *
   * @param value
   */
  public void setSlot002(
      char[] source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginSlot002 + targetIndex, targetLen);
  }

  /**
   * Update Slot002 with another Field
   *
   * @param value
   */
  public void setSlot002(Field source) {
    replace(source, 0, source.length(), beginSlot002, SLOT_002_LEN);
  }

  /**
   * Update Slot002 with another Field from an offset and length
   *
   * @param value
   */
  public void setSlot002(Field source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginSlot002, SLOT_002_LEN);
  }

  /**
   * Update Slot002 with another Field from an offset and length to an offset and length
   *
   * @param value
   */
  public void setSlot002(
      Field source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginSlot002 + targetIndex, targetLen);
  }
  /**
   * Returns the value of slot002Ind
   *
   * @return slot002Ind
   */
  public short getSlot002Ind() throws CFException {
    if (isSlot002IndModified()) {
      slot002Ind = refreshSlot002Ind();
    }
    return slot002Ind;
  }

  /**
   * Update Slot002Ind with the passed value Corresponding COBOL Variable is WS-SLOT-002-IND
   *
   * @param number
   */
  public void setSlot002Ind(short number) {
    // Truncate if the number is beyond +/- Max range
    slot002Ind = checkSlot002IndMaxLimit(number);
    serializeSlot002Ind(slot002Ind);
  }

  public void setSlot002Ind(int number) {
    number = checkSlot002IndMaxLimit((short) number); // Truncate if value is beyond +/- Max range
    setSlot002Ind((short) number);
  }

  public void setSlot002Ind(long number) {
    number = checkSlot002IndMaxLimit((short) number); // Truncate if value is beyond +/- Max range
    setSlot002Ind((short) number);
  }

  /**
   * Returns the value of eff002
   *
   * @return eff002
   */
  public char[] getEff002() throws CFException {
    if (isEff002Modified()) {
      eff002 = refreshEff002();
    }
    return eff002;
  }

  /**
   * set variable eff002 Corresponding COBOL Variable is WS-EFF-002
   *
   * @param value
   */
  public void setEff002(char[] value) {
    eff002 = checkEff002Constraints(value);
    serializeEff002(eff002);
  }

  /**
   * Update Eff002 with a char[] from an offset and length
   *
   * @param value
   */
  public void setEff002(char[] source, int sourceIndex) {
    replace(source, sourceIndex, source.length, beginEff002, eff002.length);
  }

  public void setEff002(char[] source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginEff002, eff002.length);
  }

  /**
   * Update Eff002 with a char[] from an offset and length to an offset and length
   *
   * @param value
   */
  public void setEff002(
      char[] source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginEff002 + targetIndex, targetLen);
  }

  /**
   * Update Eff002 with another Field
   *
   * @param value
   */
  public void setEff002(Field source) {
    replace(source, 0, source.length(), beginEff002, EFF_002_LEN);
  }

  /**
   * Update Eff002 with another Field from an offset and length
   *
   * @param value
   */
  public void setEff002(Field source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginEff002, EFF_002_LEN);
  }

  /**
   * Update Eff002 with another Field from an offset and length to an offset and length
   *
   * @param value
   */
  public void setEff002(
      Field source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginEff002 + targetIndex, targetLen);
  }
  /**
   * Returns the value of eff002Ind
   *
   * @return eff002Ind
   */
  public short getEff002Ind() throws CFException {
    if (isEff002IndModified()) {
      eff002Ind = refreshEff002Ind();
    }
    return eff002Ind;
  }

  /**
   * Update Eff002Ind with the passed value Corresponding COBOL Variable is WS-EFF-002-IND
   *
   * @param number
   */
  public void setEff002Ind(short number) {
    // Truncate if the number is beyond +/- Max range
    eff002Ind = checkEff002IndMaxLimit(number);
    serializeEff002Ind(eff002Ind);
  }

  public void setEff002Ind(int number) {
    number = checkEff002IndMaxLimit((short) number); // Truncate if value is beyond +/- Max range
    setEff002Ind((short) number);
  }

  public void setEff002Ind(long number) {
    number = checkEff002IndMaxLimit((short) number); // Truncate if value is beyond +/- Max range
    setEff002Ind((short) number);
  }

  /**
   * Returns the value of canc002
   *
   * @return canc002
   */
  public char[] getCanc002() throws CFException {
    if (isCanc002Modified()) {
      canc002 = refreshCanc002();
    }
    return canc002;
  }

  /**
   * set variable canc002 Corresponding COBOL Variable is WS-CANC-002
   *
   * @param value
   */
  public void setCanc002(char[] value) {
    canc002 = checkCanc002Constraints(value);
    serializeCanc002(canc002);
  }

  /**
   * Update Canc002 with a char[] from an offset and length
   *
   * @param value
   */
  public void setCanc002(char[] source, int sourceIndex) {
    replace(source, sourceIndex, source.length, beginCanc002, canc002.length);
  }

  public void setCanc002(char[] source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginCanc002, canc002.length);
  }

  /**
   * Update Canc002 with a char[] from an offset and length to an offset and length
   *
   * @param value
   */
  public void setCanc002(
      char[] source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginCanc002 + targetIndex, targetLen);
  }

  /**
   * Update Canc002 with another Field
   *
   * @param value
   */
  public void setCanc002(Field source) {
    replace(source, 0, source.length(), beginCanc002, CANC_002_LEN);
  }

  /**
   * Update Canc002 with another Field from an offset and length
   *
   * @param value
   */
  public void setCanc002(Field source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginCanc002, CANC_002_LEN);
  }

  /**
   * Update Canc002 with another Field from an offset and length to an offset and length
   *
   * @param value
   */
  public void setCanc002(
      Field source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginCanc002 + targetIndex, targetLen);
  }
  /**
   * Returns the value of canc002Ind
   *
   * @return canc002Ind
   */
  public short getCanc002Ind() throws CFException {
    if (isCanc002IndModified()) {
      canc002Ind = refreshCanc002Ind();
    }
    return canc002Ind;
  }

  /**
   * Update Canc002Ind with the passed value Corresponding COBOL Variable is WS-CANC-002-IND
   *
   * @param number
   */
  public void setCanc002Ind(short number) {
    // Truncate if the number is beyond +/- Max range
    canc002Ind = checkCanc002IndMaxLimit(number);
    serializeCanc002Ind(canc002Ind);
  }

  public void setCanc002Ind(int number) {
    number = checkCanc002IndMaxLimit((short) number); // Truncate if value is beyond +/- Max range
    setCanc002Ind((short) number);
  }

  public void setCanc002Ind(long number) {
    number = checkCanc002IndMaxLimit((short) number); // Truncate if value is beyond +/- Max range
    setCanc002Ind((short) number);
  }

  /**
   * Returns the value of slot003
   *
   * @return slot003
   */
  public char[] getSlot003() throws CFException {
    if (isSlot003Modified()) {
      slot003 = refreshSlot003();
    }
    return slot003;
  }

  /**
   * set variable slot003 Corresponding COBOL Variable is WS-SLOT-003
   *
   * @param value
   */
  public void setSlot003(char[] value) {
    slot003 = checkSlot003Constraints(value);
    serializeSlot003(slot003);
  }

  /**
   * Update Slot003 with a char[] from an offset and length
   *
   * @param value
   */
  public void setSlot003(char[] source, int sourceIndex) {
    replace(source, sourceIndex, source.length, beginSlot003, slot003.length);
  }

  public void setSlot003(char[] source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginSlot003, slot003.length);
  }

  /**
   * Update Slot003 with a char[] from an offset and length to an offset and length
   *
   * @param value
   */
  public void setSlot003(
      char[] source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginSlot003 + targetIndex, targetLen);
  }

  /**
   * Update Slot003 with another Field
   *
   * @param value
   */
  public void setSlot003(Field source) {
    replace(source, 0, source.length(), beginSlot003, SLOT_003_LEN);
  }

  /**
   * Update Slot003 with another Field from an offset and length
   *
   * @param value
   */
  public void setSlot003(Field source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginSlot003, SLOT_003_LEN);
  }

  /**
   * Update Slot003 with another Field from an offset and length to an offset and length
   *
   * @param value
   */
  public void setSlot003(
      Field source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginSlot003 + targetIndex, targetLen);
  }
  /**
   * Returns the value of slot003Ind
   *
   * @return slot003Ind
   */
  public short getSlot003Ind() throws CFException {
    if (isSlot003IndModified()) {
      slot003Ind = refreshSlot003Ind();
    }
    return slot003Ind;
  }

  /**
   * Update Slot003Ind with the passed value Corresponding COBOL Variable is WS-SLOT-003-IND
   *
   * @param number
   */
  public void setSlot003Ind(short number) {
    // Truncate if the number is beyond +/- Max range
    slot003Ind = checkSlot003IndMaxLimit(number);
    serializeSlot003Ind(slot003Ind);
  }

  public void setSlot003Ind(int number) {
    number = checkSlot003IndMaxLimit((short) number); // Truncate if value is beyond +/- Max range
    setSlot003Ind((short) number);
  }

  public void setSlot003Ind(long number) {
    number = checkSlot003IndMaxLimit((short) number); // Truncate if value is beyond +/- Max range
    setSlot003Ind((short) number);
  }

  /**
   * Returns the value of eff003
   *
   * @return eff003
   */
  public char[] getEff003() throws CFException {
    if (isEff003Modified()) {
      eff003 = refreshEff003();
    }
    return eff003;
  }

  /**
   * set variable eff003 Corresponding COBOL Variable is WS-EFF-003
   *
   * @param value
   */
  public void setEff003(char[] value) {
    eff003 = checkEff003Constraints(value);
    serializeEff003(eff003);
  }

  /**
   * Update Eff003 with a char[] from an offset and length
   *
   * @param value
   */
  public void setEff003(char[] source, int sourceIndex) {
    replace(source, sourceIndex, source.length, beginEff003, eff003.length);
  }

  public void setEff003(char[] source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginEff003, eff003.length);
  }

  /**
   * Update Eff003 with a char[] from an offset and length to an offset and length
   *
   * @param value
   */
  public void setEff003(
      char[] source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginEff003 + targetIndex, targetLen);
  }

  /**
   * Update Eff003 with another Field
   *
   * @param value
   */
  public void setEff003(Field source) {
    replace(source, 0, source.length(), beginEff003, EFF_003_LEN);
  }

  /**
   * Update Eff003 with another Field from an offset and length
   *
   * @param value
   */
  public void setEff003(Field source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginEff003, EFF_003_LEN);
  }

  /**
   * Update Eff003 with another Field from an offset and length to an offset and length
   *
   * @param value
   */
  public void setEff003(
      Field source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginEff003 + targetIndex, targetLen);
  }
  /**
   * Returns the value of eff003Ind
   *
   * @return eff003Ind
   */
  public short getEff003Ind() throws CFException {
    if (isEff003IndModified()) {
      eff003Ind = refreshEff003Ind();
    }
    return eff003Ind;
  }

  /**
   * Update Eff003Ind with the passed value Corresponding COBOL Variable is WS-EFF-003-IND
   *
   * @param number
   */
  public void setEff003Ind(short number) {
    // Truncate if the number is beyond +/- Max range
    eff003Ind = checkEff003IndMaxLimit(number);
    serializeEff003Ind(eff003Ind);
  }

  public void setEff003Ind(int number) {
    number = checkEff003IndMaxLimit((short) number); // Truncate if value is beyond +/- Max range
    setEff003Ind((short) number);
  }

  public void setEff003Ind(long number) {
    number = checkEff003IndMaxLimit((short) number); // Truncate if value is beyond +/- Max range
    setEff003Ind((short) number);
  }

  /**
   * Returns the value of canc003
   *
   * @return canc003
   */
  public char[] getCanc003() throws CFException {
    if (isCanc003Modified()) {
      canc003 = refreshCanc003();
    }
    return canc003;
  }

  /**
   * set variable canc003 Corresponding COBOL Variable is WS-CANC-003
   *
   * @param value
   */
  public void setCanc003(char[] value) {
    canc003 = checkCanc003Constraints(value);
    serializeCanc003(canc003);
  }

  /**
   * Update Canc003 with a char[] from an offset and length
   *
   * @param value
   */
  public void setCanc003(char[] source, int sourceIndex) {
    replace(source, sourceIndex, source.length, beginCanc003, canc003.length);
  }

  public void setCanc003(char[] source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginCanc003, canc003.length);
  }

  /**
   * Update Canc003 with a char[] from an offset and length to an offset and length
   *
   * @param value
   */
  public void setCanc003(
      char[] source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginCanc003 + targetIndex, targetLen);
  }

  /**
   * Update Canc003 with another Field
   *
   * @param value
   */
  public void setCanc003(Field source) {
    replace(source, 0, source.length(), beginCanc003, CANC_003_LEN);
  }

  /**
   * Update Canc003 with another Field from an offset and length
   *
   * @param value
   */
  public void setCanc003(Field source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginCanc003, CANC_003_LEN);
  }

  /**
   * Update Canc003 with another Field from an offset and length to an offset and length
   *
   * @param value
   */
  public void setCanc003(
      Field source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginCanc003 + targetIndex, targetLen);
  }
  /**
   * Returns the value of canc003Ind
   *
   * @return canc003Ind
   */
  public short getCanc003Ind() throws CFException {
    if (isCanc003IndModified()) {
      canc003Ind = refreshCanc003Ind();
    }
    return canc003Ind;
  }

  /**
   * Update Canc003Ind with the passed value Corresponding COBOL Variable is WS-CANC-003-IND
   *
   * @param number
   */
  public void setCanc003Ind(short number) {
    // Truncate if the number is beyond +/- Max range
    canc003Ind = checkCanc003IndMaxLimit(number);
    serializeCanc003Ind(canc003Ind);
  }

  public void setCanc003Ind(int number) {
    number = checkCanc003IndMaxLimit((short) number); // Truncate if value is beyond +/- Max range
    setCanc003Ind((short) number);
  }

  public void setCanc003Ind(long number) {
    number = checkCanc003IndMaxLimit((short) number); // Truncate if value is beyond +/- Max range
    setCanc003Ind((short) number);
  }

  /**
   * Returns the value of slot004
   *
   * @return slot004
   */
  public char[] getSlot004() throws CFException {
    if (isSlot004Modified()) {
      slot004 = refreshSlot004();
    }
    return slot004;
  }

  /**
   * set variable slot004 Corresponding COBOL Variable is WS-SLOT-004
   *
   * @param value
   */
  public void setSlot004(char[] value) {
    slot004 = checkSlot004Constraints(value);
    serializeSlot004(slot004);
  }

  /**
   * Update Slot004 with a char[] from an offset and length
   *
   * @param value
   */
  public void setSlot004(char[] source, int sourceIndex) {
    replace(source, sourceIndex, source.length, beginSlot004, slot004.length);
  }

  public void setSlot004(char[] source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginSlot004, slot004.length);
  }

  /**
   * Update Slot004 with a char[] from an offset and length to an offset and length
   *
   * @param value
   */
  public void setSlot004(
      char[] source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginSlot004 + targetIndex, targetLen);
  }

  /**
   * Update Slot004 with another Field
   *
   * @param value
   */
  public void setSlot004(Field source) {
    replace(source, 0, source.length(), beginSlot004, SLOT_004_LEN);
  }

  /**
   * Update Slot004 with another Field from an offset and length
   *
   * @param value
   */
  public void setSlot004(Field source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginSlot004, SLOT_004_LEN);
  }

  /**
   * Update Slot004 with another Field from an offset and length to an offset and length
   *
   * @param value
   */
  public void setSlot004(
      Field source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginSlot004 + targetIndex, targetLen);
  }
  /**
   * Returns the value of slot004Ind
   *
   * @return slot004Ind
   */
  public short getSlot004Ind() throws CFException {
    if (isSlot004IndModified()) {
      slot004Ind = refreshSlot004Ind();
    }
    return slot004Ind;
  }

  /**
   * Update Slot004Ind with the passed value Corresponding COBOL Variable is WS-SLOT-004-IND
   *
   * @param number
   */
  public void setSlot004Ind(short number) {
    // Truncate if the number is beyond +/- Max range
    slot004Ind = checkSlot004IndMaxLimit(number);
    serializeSlot004Ind(slot004Ind);
  }

  public void setSlot004Ind(int number) {
    number = checkSlot004IndMaxLimit((short) number); // Truncate if value is beyond +/- Max range
    setSlot004Ind((short) number);
  }

  public void setSlot004Ind(long number) {
    number = checkSlot004IndMaxLimit((short) number); // Truncate if value is beyond +/- Max range
    setSlot004Ind((short) number);
  }

  /**
   * Returns the value of eff004
   *
   * @return eff004
   */
  public char[] getEff004() throws CFException {
    if (isEff004Modified()) {
      eff004 = refreshEff004();
    }
    return eff004;
  }

  /**
   * set variable eff004 Corresponding COBOL Variable is WS-EFF-004
   *
   * @param value
   */
  public void setEff004(char[] value) {
    eff004 = checkEff004Constraints(value);
    serializeEff004(eff004);
  }

  /**
   * Update Eff004 with a char[] from an offset and length
   *
   * @param value
   */
  public void setEff004(char[] source, int sourceIndex) {
    replace(source, sourceIndex, source.length, beginEff004, eff004.length);
  }

  public void setEff004(char[] source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginEff004, eff004.length);
  }

  /**
   * Update Eff004 with a char[] from an offset and length to an offset and length
   *
   * @param value
   */
  public void setEff004(
      char[] source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginEff004 + targetIndex, targetLen);
  }

  /**
   * Update Eff004 with another Field
   *
   * @param value
   */
  public void setEff004(Field source) {
    replace(source, 0, source.length(), beginEff004, EFF_004_LEN);
  }

  /**
   * Update Eff004 with another Field from an offset and length
   *
   * @param value
   */
  public void setEff004(Field source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginEff004, EFF_004_LEN);
  }

  /**
   * Update Eff004 with another Field from an offset and length to an offset and length
   *
   * @param value
   */
  public void setEff004(
      Field source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginEff004 + targetIndex, targetLen);
  }
  /**
   * Returns the value of eff004Ind
   *
   * @return eff004Ind
   */
  public short getEff004Ind() throws CFException {
    if (isEff004IndModified()) {
      eff004Ind = refreshEff004Ind();
    }
    return eff004Ind;
  }

  /**
   * Update Eff004Ind with the passed value Corresponding COBOL Variable is WS-EFF-004-IND
   *
   * @param number
   */
  public void setEff004Ind(short number) {
    // Truncate if the number is beyond +/- Max range
    eff004Ind = checkEff004IndMaxLimit(number);
    serializeEff004Ind(eff004Ind);
  }

  public void setEff004Ind(int number) {
    number = checkEff004IndMaxLimit((short) number); // Truncate if value is beyond +/- Max range
    setEff004Ind((short) number);
  }

  public void setEff004Ind(long number) {
    number = checkEff004IndMaxLimit((short) number); // Truncate if value is beyond +/- Max range
    setEff004Ind((short) number);
  }

  /**
   * Returns the value of canc004
   *
   * @return canc004
   */
  public char[] getCanc004() throws CFException {
    if (isCanc004Modified()) {
      canc004 = refreshCanc004();
    }
    return canc004;
  }

  /**
   * set variable canc004 Corresponding COBOL Variable is WS-CANC-004
   *
   * @param value
   */
  public void setCanc004(char[] value) {
    canc004 = checkCanc004Constraints(value);
    serializeCanc004(canc004);
  }

  /**
   * Update Canc004 with a char[] from an offset and length
   *
   * @param value
   */
  public void setCanc004(char[] source, int sourceIndex) {
    replace(source, sourceIndex, source.length, beginCanc004, canc004.length);
  }

  public void setCanc004(char[] source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginCanc004, canc004.length);
  }

  /**
   * Update Canc004 with a char[] from an offset and length to an offset and length
   *
   * @param value
   */
  public void setCanc004(
      char[] source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginCanc004 + targetIndex, targetLen);
  }

  /**
   * Update Canc004 with another Field
   *
   * @param value
   */
  public void setCanc004(Field source) {
    replace(source, 0, source.length(), beginCanc004, CANC_004_LEN);
  }

  /**
   * Update Canc004 with another Field from an offset and length
   *
   * @param value
   */
  public void setCanc004(Field source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginCanc004, CANC_004_LEN);
  }

  /**
   * Update Canc004 with another Field from an offset and length to an offset and length
   *
   * @param value
   */
  public void setCanc004(
      Field source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginCanc004 + targetIndex, targetLen);
  }
  /**
   * Returns the value of canc004Ind
   *
   * @return canc004Ind
   */
  public short getCanc004Ind() throws CFException {
    if (isCanc004IndModified()) {
      canc004Ind = refreshCanc004Ind();
    }
    return canc004Ind;
  }

  /**
   * Update Canc004Ind with the passed value Corresponding COBOL Variable is WS-CANC-004-IND
   *
   * @param number
   */
  public void setCanc004Ind(short number) {
    // Truncate if the number is beyond +/- Max range
    canc004Ind = checkCanc004IndMaxLimit(number);
    serializeCanc004Ind(canc004Ind);
  }

  public void setCanc004Ind(int number) {
    number = checkCanc004IndMaxLimit((short) number); // Truncate if value is beyond +/- Max range
    setCanc004Ind((short) number);
  }

  public void setCanc004Ind(long number) {
    number = checkCanc004IndMaxLimit((short) number); // Truncate if value is beyond +/- Max range
    setCanc004Ind((short) number);
  }

  /**
   * Returns the value of slot005
   *
   * @return slot005
   */
  public char[] getSlot005() throws CFException {
    if (isSlot005Modified()) {
      slot005 = refreshSlot005();
    }
    return slot005;
  }

  /**
   * set variable slot005 Corresponding COBOL Variable is WS-SLOT-005
   *
   * @param value
   */
  public void setSlot005(char[] value) {
    slot005 = checkSlot005Constraints(value);
    serializeSlot005(slot005);
  }

  /**
   * Update Slot005 with a char[] from an offset and length
   *
   * @param value
   */
  public void setSlot005(char[] source, int sourceIndex) {
    replace(source, sourceIndex, source.length, beginSlot005, slot005.length);
  }

  public void setSlot005(char[] source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginSlot005, slot005.length);
  }

  /**
   * Update Slot005 with a char[] from an offset and length to an offset and length
   *
   * @param value
   */
  public void setSlot005(
      char[] source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginSlot005 + targetIndex, targetLen);
  }

  /**
   * Update Slot005 with another Field
   *
   * @param value
   */
  public void setSlot005(Field source) {
    replace(source, 0, source.length(), beginSlot005, SLOT_005_LEN);
  }

  /**
   * Update Slot005 with another Field from an offset and length
   *
   * @param value
   */
  public void setSlot005(Field source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginSlot005, SLOT_005_LEN);
  }

  /**
   * Update Slot005 with another Field from an offset and length to an offset and length
   *
   * @param value
   */
  public void setSlot005(
      Field source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginSlot005 + targetIndex, targetLen);
  }
  /**
   * Returns the value of slot005Ind
   *
   * @return slot005Ind
   */
  public short getSlot005Ind() throws CFException {
    if (isSlot005IndModified()) {
      slot005Ind = refreshSlot005Ind();
    }
    return slot005Ind;
  }

  /**
   * Update Slot005Ind with the passed value Corresponding COBOL Variable is WS-SLOT-005-IND
   *
   * @param number
   */
  public void setSlot005Ind(short number) {
    // Truncate if the number is beyond +/- Max range
    slot005Ind = checkSlot005IndMaxLimit(number);
    serializeSlot005Ind(slot005Ind);
  }

  public void setSlot005Ind(int number) {
    number = checkSlot005IndMaxLimit((short) number); // Truncate if value is beyond +/- Max range
    setSlot005Ind((short) number);
  }

  public void setSlot005Ind(long number) {
    number = checkSlot005IndMaxLimit((short) number); // Truncate if value is beyond +/- Max range
    setSlot005Ind((short) number);
  }

  /**
   * Returns the value of eff005
   *
   * @return eff005
   */
  public char[] getEff005() throws CFException {
    if (isEff005Modified()) {
      eff005 = refreshEff005();
    }
    return eff005;
  }

  /**
   * set variable eff005 Corresponding COBOL Variable is WS-EFF-005
   *
   * @param value
   */
  public void setEff005(char[] value) {
    eff005 = checkEff005Constraints(value);
    serializeEff005(eff005);
  }

  /**
   * Update Eff005 with a char[] from an offset and length
   *
   * @param value
   */
  public void setEff005(char[] source, int sourceIndex) {
    replace(source, sourceIndex, source.length, beginEff005, eff005.length);
  }

  public void setEff005(char[] source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginEff005, eff005.length);
  }

  /**
   * Update Eff005 with a char[] from an offset and length to an offset and length
   *
   * @param value
   */
  public void setEff005(
      char[] source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginEff005 + targetIndex, targetLen);
  }

  /**
   * Update Eff005 with another Field
   *
   * @param value
   */
  public void setEff005(Field source) {
    replace(source, 0, source.length(), beginEff005, EFF_005_LEN);
  }

  /**
   * Update Eff005 with another Field from an offset and length
   *
   * @param value
   */
  public void setEff005(Field source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginEff005, EFF_005_LEN);
  }

  /**
   * Update Eff005 with another Field from an offset and length to an offset and length
   *
   * @param value
   */
  public void setEff005(
      Field source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginEff005 + targetIndex, targetLen);
  }
  /**
   * Returns the value of eff005Ind
   *
   * @return eff005Ind
   */
  public short getEff005Ind() throws CFException {
    if (isEff005IndModified()) {
      eff005Ind = refreshEff005Ind();
    }
    return eff005Ind;
  }

  /**
   * Update Eff005Ind with the passed value Corresponding COBOL Variable is WS-EFF-005-IND
   *
   * @param number
   */
  public void setEff005Ind(short number) {
    // Truncate if the number is beyond +/- Max range
    eff005Ind = checkEff005IndMaxLimit(number);
    serializeEff005Ind(eff005Ind);
  }

  public void setEff005Ind(int number) {
    number = checkEff005IndMaxLimit((short) number); // Truncate if value is beyond +/- Max range
    setEff005Ind((short) number);
  }

  public void setEff005Ind(long number) {
    number = checkEff005IndMaxLimit((short) number); // Truncate if value is beyond +/- Max range
    setEff005Ind((short) number);
  }

  /**
   * Returns the value of canc005
   *
   * @return canc005
   */
  public char[] getCanc005() throws CFException {
    if (isCanc005Modified()) {
      canc005 = refreshCanc005();
    }
    return canc005;
  }

  /**
   * set variable canc005 Corresponding COBOL Variable is WS-CANC-005
   *
   * @param value
   */
  public void setCanc005(char[] value) {
    canc005 = checkCanc005Constraints(value);
    serializeCanc005(canc005);
  }

  /**
   * Update Canc005 with a char[] from an offset and length
   *
   * @param value
   */
  public void setCanc005(char[] source, int sourceIndex) {
    replace(source, sourceIndex, source.length, beginCanc005, canc005.length);
  }

  public void setCanc005(char[] source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginCanc005, canc005.length);
  }

  /**
   * Update Canc005 with a char[] from an offset and length to an offset and length
   *
   * @param value
   */
  public void setCanc005(
      char[] source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginCanc005 + targetIndex, targetLen);
  }

  /**
   * Update Canc005 with another Field
   *
   * @param value
   */
  public void setCanc005(Field source) {
    replace(source, 0, source.length(), beginCanc005, CANC_005_LEN);
  }

  /**
   * Update Canc005 with another Field from an offset and length
   *
   * @param value
   */
  public void setCanc005(Field source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginCanc005, CANC_005_LEN);
  }

  /**
   * Update Canc005 with another Field from an offset and length to an offset and length
   *
   * @param value
   */
  public void setCanc005(
      Field source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginCanc005 + targetIndex, targetLen);
  }
  /**
   * Returns the value of canc005Ind
   *
   * @return canc005Ind
   */
  public short getCanc005Ind() throws CFException {
    if (isCanc005IndModified()) {
      canc005Ind = refreshCanc005Ind();
    }
    return canc005Ind;
  }

  /**
   * Update Canc005Ind with the passed value Corresponding COBOL Variable is WS-CANC-005-IND
   *
   * @param number
   */
  public void setCanc005Ind(short number) {
    // Truncate if the number is beyond +/- Max range
    canc005Ind = checkCanc005IndMaxLimit(number);
    serializeCanc005Ind(canc005Ind);
  }

  public void setCanc005Ind(int number) {
    number = checkCanc005IndMaxLimit((short) number); // Truncate if value is beyond +/- Max range
    setCanc005Ind((short) number);
  }

  public void setCanc005Ind(long number) {
    number = checkCanc005IndMaxLimit((short) number); // Truncate if value is beyond +/- Max range
    setCanc005Ind((short) number);
  }

  /**
   * Returns the value of slot006
   *
   * @return slot006
   */
  public char[] getSlot006() throws CFException {
    if (isSlot006Modified()) {
      slot006 = refreshSlot006();
    }
    return slot006;
  }

  /**
   * set variable slot006 Corresponding COBOL Variable is WS-SLOT-006
   *
   * @param value
   */
  public void setSlot006(char[] value) {
    slot006 = checkSlot006Constraints(value);
    serializeSlot006(slot006);
  }

  /**
   * Update Slot006 with a char[] from an offset and length
   *
   * @param value
   */
  public void setSlot006(char[] source, int sourceIndex) {
    replace(source, sourceIndex, source.length, beginSlot006, slot006.length);
  }

  public void setSlot006(char[] source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginSlot006, slot006.length);
  }

  /**
   * Update Slot006 with a char[] from an offset and length to an offset and length
   *
   * @param value
   */
  public void setSlot006(
      char[] source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginSlot006 + targetIndex, targetLen);
  }

  /**
   * Update Slot006 with another Field
   *
   * @param value
   */
  public void setSlot006(Field source) {
    replace(source, 0, source.length(), beginSlot006, SLOT_006_LEN);
  }

  /**
   * Update Slot006 with another Field from an offset and length
   *
   * @param value
   */
  public void setSlot006(Field source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginSlot006, SLOT_006_LEN);
  }

  /**
   * Update Slot006 with another Field from an offset and length to an offset and length
   *
   * @param value
   */
  public void setSlot006(
      Field source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginSlot006 + targetIndex, targetLen);
  }
  /**
   * Returns the value of slot006Ind
   *
   * @return slot006Ind
   */
  public short getSlot006Ind() throws CFException {
    if (isSlot006IndModified()) {
      slot006Ind = refreshSlot006Ind();
    }
    return slot006Ind;
  }

  /**
   * Update Slot006Ind with the passed value Corresponding COBOL Variable is WS-SLOT-006-IND
   *
   * @param number
   */
  public void setSlot006Ind(short number) {
    // Truncate if the number is beyond +/- Max range
    slot006Ind = checkSlot006IndMaxLimit(number);
    serializeSlot006Ind(slot006Ind);
  }

  public void setSlot006Ind(int number) {
    number = checkSlot006IndMaxLimit((short) number); // Truncate if value is beyond +/- Max range
    setSlot006Ind((short) number);
  }

  public void setSlot006Ind(long number) {
    number = checkSlot006IndMaxLimit((short) number); // Truncate if value is beyond +/- Max range
    setSlot006Ind((short) number);
  }

  /**
   * Returns the value of eff006
   *
   * @return eff006
   */
  public char[] getEff006() throws CFException {
    if (isEff006Modified()) {
      eff006 = refreshEff006();
    }
    return eff006;
  }

  /**
   * set variable eff006 Corresponding COBOL Variable is WS-EFF-006
   *
   * @param value
   */
  public void setEff006(char[] value) {
    eff006 = checkEff006Constraints(value);
    serializeEff006(eff006);
  }

  /**
   * Update Eff006 with a char[] from an offset and length
   *
   * @param value
   */
  public void setEff006(char[] source, int sourceIndex) {
    replace(source, sourceIndex, source.length, beginEff006, eff006.length);
  }

  public void setEff006(char[] source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginEff006, eff006.length);
  }

  /**
   * Update Eff006 with a char[] from an offset and length to an offset and length
   *
   * @param value
   */
  public void setEff006(
      char[] source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginEff006 + targetIndex, targetLen);
  }

  /**
   * Update Eff006 with another Field
   *
   * @param value
   */
  public void setEff006(Field source) {
    replace(source, 0, source.length(), beginEff006, EFF_006_LEN);
  }

  /**
   * Update Eff006 with another Field from an offset and length
   *
   * @param value
   */
  public void setEff006(Field source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginEff006, EFF_006_LEN);
  }

  /**
   * Update Eff006 with another Field from an offset and length to an offset and length
   *
   * @param value
   */
  public void setEff006(
      Field source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginEff006 + targetIndex, targetLen);
  }
  /**
   * Returns the value of eff006Ind
   *
   * @return eff006Ind
   */
  public short getEff006Ind() throws CFException {
    if (isEff006IndModified()) {
      eff006Ind = refreshEff006Ind();
    }
    return eff006Ind;
  }

  /**
   * Update Eff006Ind with the passed value Corresponding COBOL Variable is WS-EFF-006-IND
   *
   * @param number
   */
  public void setEff006Ind(short number) {
    // Truncate if the number is beyond +/- Max range
    eff006Ind = checkEff006IndMaxLimit(number);
    serializeEff006Ind(eff006Ind);
  }

  public void setEff006Ind(int number) {
    number = checkEff006IndMaxLimit((short) number); // Truncate if value is beyond +/- Max range
    setEff006Ind((short) number);
  }

  public void setEff006Ind(long number) {
    number = checkEff006IndMaxLimit((short) number); // Truncate if value is beyond +/- Max range
    setEff006Ind((short) number);
  }

  /**
   * Returns the value of canc006
   *
   * @return canc006
   */
  public char[] getCanc006() throws CFException {
    if (isCanc006Modified()) {
      canc006 = refreshCanc006();
    }
    return canc006;
  }

  /**
   * set variable canc006 Corresponding COBOL Variable is WS-CANC-006
   *
   * @param value
   */
  public void setCanc006(char[] value) {
    canc006 = checkCanc006Constraints(value);
    serializeCanc006(canc006);
  }

  /**
   * Update Canc006 with a char[] from an offset and length
   *
   * @param value
   */
  public void setCanc006(char[] source, int sourceIndex) {
    replace(source, sourceIndex, source.length, beginCanc006, canc006.length);
  }

  public void setCanc006(char[] source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginCanc006, canc006.length);
  }

  /**
   * Update Canc006 with a char[] from an offset and length to an offset and length
   *
   * @param value
   */
  public void setCanc006(
      char[] source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginCanc006 + targetIndex, targetLen);
  }

  /**
   * Update Canc006 with another Field
   *
   * @param value
   */
  public void setCanc006(Field source) {
    replace(source, 0, source.length(), beginCanc006, CANC_006_LEN);
  }

  /**
   * Update Canc006 with another Field from an offset and length
   *
   * @param value
   */
  public void setCanc006(Field source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginCanc006, CANC_006_LEN);
  }

  /**
   * Update Canc006 with another Field from an offset and length to an offset and length
   *
   * @param value
   */
  public void setCanc006(
      Field source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginCanc006 + targetIndex, targetLen);
  }
  /**
   * Returns the value of canc006Ind
   *
   * @return canc006Ind
   */
  public short getCanc006Ind() throws CFException {
    if (isCanc006IndModified()) {
      canc006Ind = refreshCanc006Ind();
    }
    return canc006Ind;
  }

  /**
   * Update Canc006Ind with the passed value Corresponding COBOL Variable is WS-CANC-006-IND
   *
   * @param number
   */
  public void setCanc006Ind(short number) {
    // Truncate if the number is beyond +/- Max range
    canc006Ind = checkCanc006IndMaxLimit(number);
    serializeCanc006Ind(canc006Ind);
  }

  public void setCanc006Ind(int number) {
    number = checkCanc006IndMaxLimit((short) number); // Truncate if value is beyond +/- Max range
    setCanc006Ind((short) number);
  }

  public void setCanc006Ind(long number) {
    number = checkCanc006IndMaxLimit((short) number); // Truncate if value is beyond +/- Max range
    setCanc006Ind((short) number);
  }

  /**
   * Returns the value of slot007
   *
   * @return slot007
   */
  public char[] getSlot007() throws CFException {
    if (isSlot007Modified()) {
      slot007 = refreshSlot007();
    }
    return slot007;
  }

  /**
   * set variable slot007 Corresponding COBOL Variable is WS-SLOT-007
   *
   * @param value
   */
  public void setSlot007(char[] value) {
    slot007 = checkSlot007Constraints(value);
    serializeSlot007(slot007);
  }

  /**
   * Update Slot007 with a char[] from an offset and length
   *
   * @param value
   */
  public void setSlot007(char[] source, int sourceIndex) {
    replace(source, sourceIndex, source.length, beginSlot007, slot007.length);
  }

  public void setSlot007(char[] source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginSlot007, slot007.length);
  }

  /**
   * Update Slot007 with a char[] from an offset and length to an offset and length
   *
   * @param value
   */
  public void setSlot007(
      char[] source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginSlot007 + targetIndex, targetLen);
  }

  /**
   * Update Slot007 with another Field
   *
   * @param value
   */
  public void setSlot007(Field source) {
    replace(source, 0, source.length(), beginSlot007, SLOT_007_LEN);
  }

  /**
   * Update Slot007 with another Field from an offset and length
   *
   * @param value
   */
  public void setSlot007(Field source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginSlot007, SLOT_007_LEN);
  }

  /**
   * Update Slot007 with another Field from an offset and length to an offset and length
   *
   * @param value
   */
  public void setSlot007(
      Field source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginSlot007 + targetIndex, targetLen);
  }
  /**
   * Returns the value of slot007Ind
   *
   * @return slot007Ind
   */
  public short getSlot007Ind() throws CFException {
    if (isSlot007IndModified()) {
      slot007Ind = refreshSlot007Ind();
    }
    return slot007Ind;
  }

  /**
   * Update Slot007Ind with the passed value Corresponding COBOL Variable is WS-SLOT-007-IND
   *
   * @param number
   */
  public void setSlot007Ind(short number) {
    // Truncate if the number is beyond +/- Max range
    slot007Ind = checkSlot007IndMaxLimit(number);
    serializeSlot007Ind(slot007Ind);
  }

  public void setSlot007Ind(int number) {
    number = checkSlot007IndMaxLimit((short) number); // Truncate if value is beyond +/- Max range
    setSlot007Ind((short) number);
  }

  public void setSlot007Ind(long number) {
    number = checkSlot007IndMaxLimit((short) number); // Truncate if value is beyond +/- Max range
    setSlot007Ind((short) number);
  }

  /**
   * Returns the value of eff007
   *
   * @return eff007
   */
  public char[] getEff007() throws CFException {
    if (isEff007Modified()) {
      eff007 = refreshEff007();
    }
    return eff007;
  }

  /**
   * set variable eff007 Corresponding COBOL Variable is WS-EFF-007
   *
   * @param value
   */
  public void setEff007(char[] value) {
    eff007 = checkEff007Constraints(value);
    serializeEff007(eff007);
  }

  /**
   * Update Eff007 with a char[] from an offset and length
   *
   * @param value
   */
  public void setEff007(char[] source, int sourceIndex) {
    replace(source, sourceIndex, source.length, beginEff007, eff007.length);
  }

  public void setEff007(char[] source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginEff007, eff007.length);
  }

  /**
   * Update Eff007 with a char[] from an offset and length to an offset and length
   *
   * @param value
   */
  public void setEff007(
      char[] source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginEff007 + targetIndex, targetLen);
  }

  /**
   * Update Eff007 with another Field
   *
   * @param value
   */
  public void setEff007(Field source) {
    replace(source, 0, source.length(), beginEff007, EFF_007_LEN);
  }

  /**
   * Update Eff007 with another Field from an offset and length
   *
   * @param value
   */
  public void setEff007(Field source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginEff007, EFF_007_LEN);
  }

  /**
   * Update Eff007 with another Field from an offset and length to an offset and length
   *
   * @param value
   */
  public void setEff007(
      Field source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginEff007 + targetIndex, targetLen);
  }
  /**
   * Returns the value of eff007Ind
   *
   * @return eff007Ind
   */
  public short getEff007Ind() throws CFException {
    if (isEff007IndModified()) {
      eff007Ind = refreshEff007Ind();
    }
    return eff007Ind;
  }

  /**
   * Update Eff007Ind with the passed value Corresponding COBOL Variable is WS-EFF-007-IND
   *
   * @param number
   */
  public void setEff007Ind(short number) {
    // Truncate if the number is beyond +/- Max range
    eff007Ind = checkEff007IndMaxLimit(number);
    serializeEff007Ind(eff007Ind);
  }

  public void setEff007Ind(int number) {
    number = checkEff007IndMaxLimit((short) number); // Truncate if value is beyond +/- Max range
    setEff007Ind((short) number);
  }

  public void setEff007Ind(long number) {
    number = checkEff007IndMaxLimit((short) number); // Truncate if value is beyond +/- Max range
    setEff007Ind((short) number);
  }

  /**
   * Returns the value of canc007
   *
   * @return canc007
   */
  public char[] getCanc007() throws CFException {
    if (isCanc007Modified()) {
      canc007 = refreshCanc007();
    }
    return canc007;
  }

  /**
   * set variable canc007 Corresponding COBOL Variable is WS-CANC-007
   *
   * @param value
   */
  public void setCanc007(char[] value) {
    canc007 = checkCanc007Constraints(value);
    serializeCanc007(canc007);
  }

  /**
   * Update Canc007 with a char[] from an offset and length
   *
   * @param value
   */
  public void setCanc007(char[] source, int sourceIndex) {
    replace(source, sourceIndex, source.length, beginCanc007, canc007.length);
  }

  public void setCanc007(char[] source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginCanc007, canc007.length);
  }

  /**
   * Update Canc007 with a char[] from an offset and length to an offset and length
   *
   * @param value
   */
  public void setCanc007(
      char[] source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginCanc007 + targetIndex, targetLen);
  }

  /**
   * Update Canc007 with another Field
   *
   * @param value
   */
  public void setCanc007(Field source) {
    replace(source, 0, source.length(), beginCanc007, CANC_007_LEN);
  }

  /**
   * Update Canc007 with another Field from an offset and length
   *
   * @param value
   */
  public void setCanc007(Field source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginCanc007, CANC_007_LEN);
  }

  /**
   * Update Canc007 with another Field from an offset and length to an offset and length
   *
   * @param value
   */
  public void setCanc007(
      Field source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginCanc007 + targetIndex, targetLen);
  }
  /**
   * Returns the value of canc007Ind
   *
   * @return canc007Ind
   */
  public short getCanc007Ind() throws CFException {
    if (isCanc007IndModified()) {
      canc007Ind = refreshCanc007Ind();
    }
    return canc007Ind;
  }

  /**
   * Update Canc007Ind with the passed value Corresponding COBOL Variable is WS-CANC-007-IND
   *
   * @param number
   */
  public void setCanc007Ind(short number) {
    // Truncate if the number is beyond +/- Max range
    canc007Ind = checkCanc007IndMaxLimit(number);
    serializeCanc007Ind(canc007Ind);
  }

  public void setCanc007Ind(int number) {
    number = checkCanc007IndMaxLimit((short) number); // Truncate if value is beyond +/- Max range
    setCanc007Ind((short) number);
  }

  public void setCanc007Ind(long number) {
    number = checkCanc007IndMaxLimit((short) number); // Truncate if value is beyond +/- Max range
    setCanc007Ind((short) number);
  }

  /**
   * Returns the value of slot008
   *
   * @return slot008
   */
  public char[] getSlot008() throws CFException {
    if (isSlot008Modified()) {
      slot008 = refreshSlot008();
    }
    return slot008;
  }

  /**
   * set variable slot008 Corresponding COBOL Variable is WS-SLOT-008
   *
   * @param value
   */
  public void setSlot008(char[] value) {
    slot008 = checkSlot008Constraints(value);
    serializeSlot008(slot008);
  }

  /**
   * Update Slot008 with a char[] from an offset and length
   *
   * @param value
   */
  public void setSlot008(char[] source, int sourceIndex) {
    replace(source, sourceIndex, source.length, beginSlot008, slot008.length);
  }

  public void setSlot008(char[] source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginSlot008, slot008.length);
  }

  /**
   * Update Slot008 with a char[] from an offset and length to an offset and length
   *
   * @param value
   */
  public void setSlot008(
      char[] source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginSlot008 + targetIndex, targetLen);
  }

  /**
   * Update Slot008 with another Field
   *
   * @param value
   */
  public void setSlot008(Field source) {
    replace(source, 0, source.length(), beginSlot008, SLOT_008_LEN);
  }

  /**
   * Update Slot008 with another Field from an offset and length
   *
   * @param value
   */
  public void setSlot008(Field source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginSlot008, SLOT_008_LEN);
  }

  /**
   * Update Slot008 with another Field from an offset and length to an offset and length
   *
   * @param value
   */
  public void setSlot008(
      Field source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginSlot008 + targetIndex, targetLen);
  }
  /**
   * Returns the value of slot008Ind
   *
   * @return slot008Ind
   */
  public short getSlot008Ind() throws CFException {
    if (isSlot008IndModified()) {
      slot008Ind = refreshSlot008Ind();
    }
    return slot008Ind;
  }

  /**
   * Update Slot008Ind with the passed value Corresponding COBOL Variable is WS-SLOT-008-IND
   *
   * @param number
   */
  public void setSlot008Ind(short number) {
    // Truncate if the number is beyond +/- Max range
    slot008Ind = checkSlot008IndMaxLimit(number);
    serializeSlot008Ind(slot008Ind);
  }

  public void setSlot008Ind(int number) {
    number = checkSlot008IndMaxLimit((short) number); // Truncate if value is beyond +/- Max range
    setSlot008Ind((short) number);
  }

  public void setSlot008Ind(long number) {
    number = checkSlot008IndMaxLimit((short) number); // Truncate if value is beyond +/- Max range
    setSlot008Ind((short) number);
  }

  /**
   * Returns the value of eff008
   *
   * @return eff008
   */
  public char[] getEff008() throws CFException {
    if (isEff008Modified()) {
      eff008 = refreshEff008();
    }
    return eff008;
  }

  /**
   * set variable eff008 Corresponding COBOL Variable is WS-EFF-008
   *
   * @param value
   */
  public void setEff008(char[] value) {
    eff008 = checkEff008Constraints(value);
    serializeEff008(eff008);
  }

  /**
   * Update Eff008 with a char[] from an offset and length
   *
   * @param value
   */
  public void setEff008(char[] source, int sourceIndex) {
    replace(source, sourceIndex, source.length, beginEff008, eff008.length);
  }

  public void setEff008(char[] source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginEff008, eff008.length);
  }

  /**
   * Update Eff008 with a char[] from an offset and length to an offset and length
   *
   * @param value
   */
  public void setEff008(
      char[] source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginEff008 + targetIndex, targetLen);
  }

  /**
   * Update Eff008 with another Field
   *
   * @param value
   */
  public void setEff008(Field source) {
    replace(source, 0, source.length(), beginEff008, EFF_008_LEN);
  }

  /**
   * Update Eff008 with another Field from an offset and length
   *
   * @param value
   */
  public void setEff008(Field source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginEff008, EFF_008_LEN);
  }

  /**
   * Update Eff008 with another Field from an offset and length to an offset and length
   *
   * @param value
   */
  public void setEff008(
      Field source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginEff008 + targetIndex, targetLen);
  }
  /**
   * Returns the value of eff008Ind
   *
   * @return eff008Ind
   */
  public short getEff008Ind() throws CFException {
    if (isEff008IndModified()) {
      eff008Ind = refreshEff008Ind();
    }
    return eff008Ind;
  }

  /**
   * Update Eff008Ind with the passed value Corresponding COBOL Variable is WS-EFF-008-IND
   *
   * @param number
   */
  public void setEff008Ind(short number) {
    // Truncate if the number is beyond +/- Max range
    eff008Ind = checkEff008IndMaxLimit(number);
    serializeEff008Ind(eff008Ind);
  }

  public void setEff008Ind(int number) {
    number = checkEff008IndMaxLimit((short) number); // Truncate if value is beyond +/- Max range
    setEff008Ind((short) number);
  }

  public void setEff008Ind(long number) {
    number = checkEff008IndMaxLimit((short) number); // Truncate if value is beyond +/- Max range
    setEff008Ind((short) number);
  }

  /**
   * Returns the value of canc008
   *
   * @return canc008
   */
  public char[] getCanc008() throws CFException {
    if (isCanc008Modified()) {
      canc008 = refreshCanc008();
    }
    return canc008;
  }

  /**
   * set variable canc008 Corresponding COBOL Variable is WS-CANC-008
   *
   * @param value
   */
  public void setCanc008(char[] value) {
    canc008 = checkCanc008Constraints(value);
    serializeCanc008(canc008);
  }

  /**
   * Update Canc008 with a char[] from an offset and length
   *
   * @param value
   */
  public void setCanc008(char[] source, int sourceIndex) {
    replace(source, sourceIndex, source.length, beginCanc008, canc008.length);
  }

  public void setCanc008(char[] source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginCanc008, canc008.length);
  }

  /**
   * Update Canc008 with a char[] from an offset and length to an offset and length
   *
   * @param value
   */
  public void setCanc008(
      char[] source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginCanc008 + targetIndex, targetLen);
  }

  /**
   * Update Canc008 with another Field
   *
   * @param value
   */
  public void setCanc008(Field source) {
    replace(source, 0, source.length(), beginCanc008, CANC_008_LEN);
  }

  /**
   * Update Canc008 with another Field from an offset and length
   *
   * @param value
   */
  public void setCanc008(Field source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginCanc008, CANC_008_LEN);
  }

  /**
   * Update Canc008 with another Field from an offset and length to an offset and length
   *
   * @param value
   */
  public void setCanc008(
      Field source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginCanc008 + targetIndex, targetLen);
  }
  /**
   * Returns the value of canc008Ind
   *
   * @return canc008Ind
   */
  public short getCanc008Ind() throws CFException {
    if (isCanc008IndModified()) {
      canc008Ind = refreshCanc008Ind();
    }
    return canc008Ind;
  }

  /**
   * Update Canc008Ind with the passed value Corresponding COBOL Variable is WS-CANC-008-IND
   *
   * @param number
   */
  public void setCanc008Ind(short number) {
    // Truncate if the number is beyond +/- Max range
    canc008Ind = checkCanc008IndMaxLimit(number);
    serializeCanc008Ind(canc008Ind);
  }

  public void setCanc008Ind(int number) {
    number = checkCanc008IndMaxLimit((short) number); // Truncate if value is beyond +/- Max range
    setCanc008Ind((short) number);
  }

  public void setCanc008Ind(long number) {
    number = checkCanc008IndMaxLimit((short) number); // Truncate if value is beyond +/- Max range
    setCanc008Ind((short) number);
  }

  /**
   * Returns the value of slot009
   *
   * @return slot009
   */
  public char[] getSlot009() throws CFException {
    if (isSlot009Modified()) {
      slot009 = refreshSlot009();
    }
    return slot009;
  }

  /**
   * set variable slot009 Corresponding COBOL Variable is WS-SLOT-009
   *
   * @param value
   */
  public void setSlot009(char[] value) {
    slot009 = checkSlot009Constraints(value);
    serializeSlot009(slot009);
  }

  /**
   * Update Slot009 with a char[] from an offset and length
   *
   * @param value
   */
  public void setSlot009(char[] source, int sourceIndex) {
    replace(source, sourceIndex, source.length, beginSlot009, slot009.length);
  }

  public void setSlot009(char[] source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginSlot009, slot009.length);
  }

  /**
   * Update Slot009 with a char[] from an offset and length to an offset and length
   *
   * @param value
   */
  public void setSlot009(
      char[] source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginSlot009 + targetIndex, targetLen);
  }

  /**
   * Update Slot009 with another Field
   *
   * @param value
   */
  public void setSlot009(Field source) {
    replace(source, 0, source.length(), beginSlot009, SLOT_009_LEN);
  }

  /**
   * Update Slot009 with another Field from an offset and length
   *
   * @param value
   */
  public void setSlot009(Field source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginSlot009, SLOT_009_LEN);
  }

  /**
   * Update Slot009 with another Field from an offset and length to an offset and length
   *
   * @param value
   */
  public void setSlot009(
      Field source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginSlot009 + targetIndex, targetLen);
  }
  /**
   * Returns the value of slot009Ind
   *
   * @return slot009Ind
   */
  public short getSlot009Ind() throws CFException {
    if (isSlot009IndModified()) {
      slot009Ind = refreshSlot009Ind();
    }
    return slot009Ind;
  }

  /**
   * Update Slot009Ind with the passed value Corresponding COBOL Variable is WS-SLOT-009-IND
   *
   * @param number
   */
  public void setSlot009Ind(short number) {
    // Truncate if the number is beyond +/- Max range
    slot009Ind = checkSlot009IndMaxLimit(number);
    serializeSlot009Ind(slot009Ind);
  }

  public void setSlot009Ind(int number) {
    number = checkSlot009IndMaxLimit((short) number); // Truncate if value is beyond +/- Max range
    setSlot009Ind((short) number);
  }

  public void setSlot009Ind(long number) {
    number = checkSlot009IndMaxLimit((short) number); // Truncate if value is beyond +/- Max range
    setSlot009Ind((short) number);
  }

  /**
   * Returns the value of eff009
   *
   * @return eff009
   */
  public char[] getEff009() throws CFException {
    if (isEff009Modified()) {
      eff009 = refreshEff009();
    }
    return eff009;
  }

  /**
   * set variable eff009 Corresponding COBOL Variable is WS-EFF-009
   *
   * @param value
   */
  public void setEff009(char[] value) {
    eff009 = checkEff009Constraints(value);
    serializeEff009(eff009);
  }

  /**
   * Update Eff009 with a char[] from an offset and length
   *
   * @param value
   */
  public void setEff009(char[] source, int sourceIndex) {
    replace(source, sourceIndex, source.length, beginEff009, eff009.length);
  }

  public void setEff009(char[] source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginEff009, eff009.length);
  }

  /**
   * Update Eff009 with a char[] from an offset and length to an offset and length
   *
   * @param value
   */
  public void setEff009(
      char[] source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginEff009 + targetIndex, targetLen);
  }

  /**
   * Update Eff009 with another Field
   *
   * @param value
   */
  public void setEff009(Field source) {
    replace(source, 0, source.length(), beginEff009, EFF_009_LEN);
  }

  /**
   * Update Eff009 with another Field from an offset and length
   *
   * @param value
   */
  public void setEff009(Field source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginEff009, EFF_009_LEN);
  }

  /**
   * Update Eff009 with another Field from an offset and length to an offset and length
   *
   * @param value
   */
  public void setEff009(
      Field source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginEff009 + targetIndex, targetLen);
  }
  /**
   * Returns the value of eff009Ind
   *
   * @return eff009Ind
   */
  public short getEff009Ind() throws CFException {
    if (isEff009IndModified()) {
      eff009Ind = refreshEff009Ind();
    }
    return eff009Ind;
  }

  /**
   * Update Eff009Ind with the passed value Corresponding COBOL Variable is WS-EFF-009-IND
   *
   * @param number
   */
  public void setEff009Ind(short number) {
    // Truncate if the number is beyond +/- Max range
    eff009Ind = checkEff009IndMaxLimit(number);
    serializeEff009Ind(eff009Ind);
  }

  public void setEff009Ind(int number) {
    number = checkEff009IndMaxLimit((short) number); // Truncate if value is beyond +/- Max range
    setEff009Ind((short) number);
  }

  public void setEff009Ind(long number) {
    number = checkEff009IndMaxLimit((short) number); // Truncate if value is beyond +/- Max range
    setEff009Ind((short) number);
  }

  /**
   * Returns the value of canc009
   *
   * @return canc009
   */
  public char[] getCanc009() throws CFException {
    if (isCanc009Modified()) {
      canc009 = refreshCanc009();
    }
    return canc009;
  }

  /**
   * set variable canc009 Corresponding COBOL Variable is WS-CANC-009
   *
   * @param value
   */
  public void setCanc009(char[] value) {
    canc009 = checkCanc009Constraints(value);
    serializeCanc009(canc009);
  }

  /**
   * Update Canc009 with a char[] from an offset and length
   *
   * @param value
   */
  public void setCanc009(char[] source, int sourceIndex) {
    replace(source, sourceIndex, source.length, beginCanc009, canc009.length);
  }

  public void setCanc009(char[] source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginCanc009, canc009.length);
  }

  /**
   * Update Canc009 with a char[] from an offset and length to an offset and length
   *
   * @param value
   */
  public void setCanc009(
      char[] source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginCanc009 + targetIndex, targetLen);
  }

  /**
   * Update Canc009 with another Field
   *
   * @param value
   */
  public void setCanc009(Field source) {
    replace(source, 0, source.length(), beginCanc009, CANC_009_LEN);
  }

  /**
   * Update Canc009 with another Field from an offset and length
   *
   * @param value
   */
  public void setCanc009(Field source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginCanc009, CANC_009_LEN);
  }

  /**
   * Update Canc009 with another Field from an offset and length to an offset and length
   *
   * @param value
   */
  public void setCanc009(
      Field source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginCanc009 + targetIndex, targetLen);
  }
  /**
   * Returns the value of canc009Ind
   *
   * @return canc009Ind
   */
  public short getCanc009Ind() throws CFException {
    if (isCanc009IndModified()) {
      canc009Ind = refreshCanc009Ind();
    }
    return canc009Ind;
  }

  /**
   * Update Canc009Ind with the passed value Corresponding COBOL Variable is WS-CANC-009-IND
   *
   * @param number
   */
  public void setCanc009Ind(short number) {
    // Truncate if the number is beyond +/- Max range
    canc009Ind = checkCanc009IndMaxLimit(number);
    serializeCanc009Ind(canc009Ind);
  }

  public void setCanc009Ind(int number) {
    number = checkCanc009IndMaxLimit((short) number); // Truncate if value is beyond +/- Max range
    setCanc009Ind((short) number);
  }

  public void setCanc009Ind(long number) {
    number = checkCanc009IndMaxLimit((short) number); // Truncate if value is beyond +/- Max range
    setCanc009Ind((short) number);
  }

  /**
   * Returns the value of slot010
   *
   * @return slot010
   */
  public char[] getSlot010() throws CFException {
    if (isSlot010Modified()) {
      slot010 = refreshSlot010();
    }
    return slot010;
  }

  /**
   * set variable slot010 Corresponding COBOL Variable is WS-SLOT-010
   *
   * @param value
   */
  public void setSlot010(char[] value) {
    slot010 = checkSlot010Constraints(value);
    serializeSlot010(slot010);
  }

  /**
   * Update Slot010 with a char[] from an offset and length
   *
   * @param value
   */
  public void setSlot010(char[] source, int sourceIndex) {
    replace(source, sourceIndex, source.length, beginSlot010, slot010.length);
  }

  public void setSlot010(char[] source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginSlot010, slot010.length);
  }

  /**
   * Update Slot010 with a char[] from an offset and length to an offset and length
   *
   * @param value
   */
  public void setSlot010(
      char[] source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginSlot010 + targetIndex, targetLen);
  }

  /**
   * Update Slot010 with another Field
   *
   * @param value
   */
  public void setSlot010(Field source) {
    replace(source, 0, source.length(), beginSlot010, SLOT_010_LEN);
  }

  /**
   * Update Slot010 with another Field from an offset and length
   *
   * @param value
   */
  public void setSlot010(Field source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginSlot010, SLOT_010_LEN);
  }

  /**
   * Update Slot010 with another Field from an offset and length to an offset and length
   *
   * @param value
   */
  public void setSlot010(
      Field source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginSlot010 + targetIndex, targetLen);
  }
  /**
   * Returns the value of slot010Ind
   *
   * @return slot010Ind
   */
  public short getSlot010Ind() throws CFException {
    if (isSlot010IndModified()) {
      slot010Ind = refreshSlot010Ind();
    }
    return slot010Ind;
  }

  /**
   * Update Slot010Ind with the passed value Corresponding COBOL Variable is WS-SLOT-010-IND
   *
   * @param number
   */
  public void setSlot010Ind(short number) {
    // Truncate if the number is beyond +/- Max range
    slot010Ind = checkSlot010IndMaxLimit(number);
    serializeSlot010Ind(slot010Ind);
  }

  public void setSlot010Ind(int number) {
    number = checkSlot010IndMaxLimit((short) number); // Truncate if value is beyond +/- Max range
    setSlot010Ind((short) number);
  }

  public void setSlot010Ind(long number) {
    number = checkSlot010IndMaxLimit((short) number); // Truncate if value is beyond +/- Max range
    setSlot010Ind((short) number);
  }

  /**
   * Returns the value of eff010
   *
   * @return eff010
   */
  public char[] getEff010() throws CFException {
    if (isEff010Modified()) {
      eff010 = refreshEff010();
    }
    return eff010;
  }

  /**
   * set variable eff010 Corresponding COBOL Variable is WS-EFF-010
   *
   * @param value
   */
  public void setEff010(char[] value) {
    eff010 = checkEff010Constraints(value);
    serializeEff010(eff010);
  }

  /**
   * Update Eff010 with a char[] from an offset and length
   *
   * @param value
   */
  public void setEff010(char[] source, int sourceIndex) {
    replace(source, sourceIndex, source.length, beginEff010, eff010.length);
  }

  public void setEff010(char[] source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginEff010, eff010.length);
  }

  /**
   * Update Eff010 with a char[] from an offset and length to an offset and length
   *
   * @param value
   */
  public void setEff010(
      char[] source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginEff010 + targetIndex, targetLen);
  }

  /**
   * Update Eff010 with another Field
   *
   * @param value
   */
  public void setEff010(Field source) {
    replace(source, 0, source.length(), beginEff010, EFF_010_LEN);
  }

  /**
   * Update Eff010 with another Field from an offset and length
   *
   * @param value
   */
  public void setEff010(Field source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginEff010, EFF_010_LEN);
  }

  /**
   * Update Eff010 with another Field from an offset and length to an offset and length
   *
   * @param value
   */
  public void setEff010(
      Field source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginEff010 + targetIndex, targetLen);
  }
  /**
   * Returns the value of eff010Ind
   *
   * @return eff010Ind
   */
  public short getEff010Ind() throws CFException {
    if (isEff010IndModified()) {
      eff010Ind = refreshEff010Ind();
    }
    return eff010Ind;
  }

  /**
   * Update Eff010Ind with the passed value Corresponding COBOL Variable is WS-EFF-010-IND
   *
   * @param number
   */
  public void setEff010Ind(short number) {
    // Truncate if the number is beyond +/- Max range
    eff010Ind = checkEff010IndMaxLimit(number);
    serializeEff010Ind(eff010Ind);
  }

  public void setEff010Ind(int number) {
    number = checkEff010IndMaxLimit((short) number); // Truncate if value is beyond +/- Max range
    setEff010Ind((short) number);
  }

  public void setEff010Ind(long number) {
    number = checkEff010IndMaxLimit((short) number); // Truncate if value is beyond +/- Max range
    setEff010Ind((short) number);
  }

  /**
   * Returns the value of canc010
   *
   * @return canc010
   */
  public char[] getCanc010() throws CFException {
    if (isCanc010Modified()) {
      canc010 = refreshCanc010();
    }
    return canc010;
  }

  /**
   * set variable canc010 Corresponding COBOL Variable is WS-CANC-010
   *
   * @param value
   */
  public void setCanc010(char[] value) {
    canc010 = checkCanc010Constraints(value);
    serializeCanc010(canc010);
  }

  /**
   * Update Canc010 with a char[] from an offset and length
   *
   * @param value
   */
  public void setCanc010(char[] source, int sourceIndex) {
    replace(source, sourceIndex, source.length, beginCanc010, canc010.length);
  }

  public void setCanc010(char[] source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginCanc010, canc010.length);
  }

  /**
   * Update Canc010 with a char[] from an offset and length to an offset and length
   *
   * @param value
   */
  public void setCanc010(
      char[] source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginCanc010 + targetIndex, targetLen);
  }

  /**
   * Update Canc010 with another Field
   *
   * @param value
   */
  public void setCanc010(Field source) {
    replace(source, 0, source.length(), beginCanc010, CANC_010_LEN);
  }

  /**
   * Update Canc010 with another Field from an offset and length
   *
   * @param value
   */
  public void setCanc010(Field source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginCanc010, CANC_010_LEN);
  }

  /**
   * Update Canc010 with another Field from an offset and length to an offset and length
   *
   * @param value
   */
  public void setCanc010(
      Field source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginCanc010 + targetIndex, targetLen);
  }
  /**
   * Returns the value of canc010Ind
   *
   * @return canc010Ind
   */
  public short getCanc010Ind() throws CFException {
    if (isCanc010IndModified()) {
      canc010Ind = refreshCanc010Ind();
    }
    return canc010Ind;
  }

  /**
   * Update Canc010Ind with the passed value Corresponding COBOL Variable is WS-CANC-010-IND
   *
   * @param number
   */
  public void setCanc010Ind(short number) {
    // Truncate if the number is beyond +/- Max range
    canc010Ind = checkCanc010IndMaxLimit(number);
    serializeCanc010Ind(canc010Ind);
  }

  public void setCanc010Ind(int number) {
    number = checkCanc010IndMaxLimit((short) number); // Truncate if value is beyond +/- Max range
    setCanc010Ind((short) number);
  }

  public void setCanc010Ind(long number) {
    number = checkCanc010IndMaxLimit((short) number); // Truncate if value is beyond +/- Max range
    setCanc010Ind((short) number);
  }

  /**
   * Returns the value of slot011
   *
   * @return slot011
   */
  public char[] getSlot011() throws CFException {
    if (isSlot011Modified()) {
      slot011 = refreshSlot011();
    }
    return slot011;
  }

  /**
   * set variable slot011 Corresponding COBOL Variable is WS-SLOT-011
   *
   * @param value
   */
  public void setSlot011(char[] value) {
    slot011 = checkSlot011Constraints(value);
    serializeSlot011(slot011);
  }

  /**
   * Update Slot011 with a char[] from an offset and length
   *
   * @param value
   */
  public void setSlot011(char[] source, int sourceIndex) {
    replace(source, sourceIndex, source.length, beginSlot011, slot011.length);
  }

  public void setSlot011(char[] source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginSlot011, slot011.length);
  }

  /**
   * Update Slot011 with a char[] from an offset and length to an offset and length
   *
   * @param value
   */
  public void setSlot011(
      char[] source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginSlot011 + targetIndex, targetLen);
  }

  /**
   * Update Slot011 with another Field
   *
   * @param value
   */
  public void setSlot011(Field source) {
    replace(source, 0, source.length(), beginSlot011, SLOT_011_LEN);
  }

  /**
   * Update Slot011 with another Field from an offset and length
   *
   * @param value
   */
  public void setSlot011(Field source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginSlot011, SLOT_011_LEN);
  }

  /**
   * Update Slot011 with another Field from an offset and length to an offset and length
   *
   * @param value
   */
  public void setSlot011(
      Field source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginSlot011 + targetIndex, targetLen);
  }
  /**
   * Returns the value of slot011Ind
   *
   * @return slot011Ind
   */
  public short getSlot011Ind() throws CFException {
    if (isSlot011IndModified()) {
      slot011Ind = refreshSlot011Ind();
    }
    return slot011Ind;
  }

  /**
   * Update Slot011Ind with the passed value Corresponding COBOL Variable is WS-SLOT-011-IND
   *
   * @param number
   */
  public void setSlot011Ind(short number) {
    // Truncate if the number is beyond +/- Max range
    slot011Ind = checkSlot011IndMaxLimit(number);
    serializeSlot011Ind(slot011Ind);
  }

  public void setSlot011Ind(int number) {
    number = checkSlot011IndMaxLimit((short) number); // Truncate if value is beyond +/- Max range
    setSlot011Ind((short) number);
  }

  public void setSlot011Ind(long number) {
    number = checkSlot011IndMaxLimit((short) number); // Truncate if value is beyond +/- Max range
    setSlot011Ind((short) number);
  }

  /**
   * Returns the value of eff011
   *
   * @return eff011
   */
  public char[] getEff011() throws CFException {
    if (isEff011Modified()) {
      eff011 = refreshEff011();
    }
    return eff011;
  }

  /**
   * set variable eff011 Corresponding COBOL Variable is WS-EFF-011
   *
   * @param value
   */
  public void setEff011(char[] value) {
    eff011 = checkEff011Constraints(value);
    serializeEff011(eff011);
  }

  /**
   * Update Eff011 with a char[] from an offset and length
   *
   * @param value
   */
  public void setEff011(char[] source, int sourceIndex) {
    replace(source, sourceIndex, source.length, beginEff011, eff011.length);
  }

  public void setEff011(char[] source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginEff011, eff011.length);
  }

  /**
   * Update Eff011 with a char[] from an offset and length to an offset and length
   *
   * @param value
   */
  public void setEff011(
      char[] source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginEff011 + targetIndex, targetLen);
  }

  /**
   * Update Eff011 with another Field
   *
   * @param value
   */
  public void setEff011(Field source) {
    replace(source, 0, source.length(), beginEff011, EFF_011_LEN);
  }

  /**
   * Update Eff011 with another Field from an offset and length
   *
   * @param value
   */
  public void setEff011(Field source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginEff011, EFF_011_LEN);
  }

  /**
   * Update Eff011 with another Field from an offset and length to an offset and length
   *
   * @param value
   */
  public void setEff011(
      Field source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginEff011 + targetIndex, targetLen);
  }
  /**
   * Returns the value of eff011Ind
   *
   * @return eff011Ind
   */
  public short getEff011Ind() throws CFException {
    if (isEff011IndModified()) {
      eff011Ind = refreshEff011Ind();
    }
    return eff011Ind;
  }

  /**
   * Update Eff011Ind with the passed value Corresponding COBOL Variable is WS-EFF-011-IND
   *
   * @param number
   */
  public void setEff011Ind(short number) {
    // Truncate if the number is beyond +/- Max range
    eff011Ind = checkEff011IndMaxLimit(number);
    serializeEff011Ind(eff011Ind);
  }

  public void setEff011Ind(int number) {
    number = checkEff011IndMaxLimit((short) number); // Truncate if value is beyond +/- Max range
    setEff011Ind((short) number);
  }

  public void setEff011Ind(long number) {
    number = checkEff011IndMaxLimit((short) number); // Truncate if value is beyond +/- Max range
    setEff011Ind((short) number);
  }

  /**
   * Returns the value of canc011
   *
   * @return canc011
   */
  public char[] getCanc011() throws CFException {
    if (isCanc011Modified()) {
      canc011 = refreshCanc011();
    }
    return canc011;
  }

  /**
   * set variable canc011 Corresponding COBOL Variable is WS-CANC-011
   *
   * @param value
   */
  public void setCanc011(char[] value) {
    canc011 = checkCanc011Constraints(value);
    serializeCanc011(canc011);
  }

  /**
   * Update Canc011 with a char[] from an offset and length
   *
   * @param value
   */
  public void setCanc011(char[] source, int sourceIndex) {
    replace(source, sourceIndex, source.length, beginCanc011, canc011.length);
  }

  public void setCanc011(char[] source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginCanc011, canc011.length);
  }

  /**
   * Update Canc011 with a char[] from an offset and length to an offset and length
   *
   * @param value
   */
  public void setCanc011(
      char[] source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginCanc011 + targetIndex, targetLen);
  }

  /**
   * Update Canc011 with another Field
   *
   * @param value
   */
  public void setCanc011(Field source) {
    replace(source, 0, source.length(), beginCanc011, CANC_011_LEN);
  }

  /**
   * Update Canc011 with another Field from an offset and length
   *
   * @param value
   */
  public void setCanc011(Field source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginCanc011, CANC_011_LEN);
  }

  /**
   * Update Canc011 with another Field from an offset and length to an offset and length
   *
   * @param value
   */
  public void setCanc011(
      Field source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginCanc011 + targetIndex, targetLen);
  }
  /**
   * Returns the value of canc011Ind
   *
   * @return canc011Ind
   */
  public short getCanc011Ind() throws CFException {
    if (isCanc011IndModified()) {
      canc011Ind = refreshCanc011Ind();
    }
    return canc011Ind;
  }

  /**
   * Update Canc011Ind with the passed value Corresponding COBOL Variable is WS-CANC-011-IND
   *
   * @param number
   */
  public void setCanc011Ind(short number) {
    // Truncate if the number is beyond +/- Max range
    canc011Ind = checkCanc011IndMaxLimit(number);
    serializeCanc011Ind(canc011Ind);
  }

  public void setCanc011Ind(int number) {
    number = checkCanc011IndMaxLimit((short) number); // Truncate if value is beyond +/- Max range
    setCanc011Ind((short) number);
  }

  public void setCanc011Ind(long number) {
    number = checkCanc011IndMaxLimit((short) number); // Truncate if value is beyond +/- Max range
    setCanc011Ind((short) number);
  }

  /**
   * Returns the value of slot012
   *
   * @return slot012
   */
  public char[] getSlot012() throws CFException {
    if (isSlot012Modified()) {
      slot012 = refreshSlot012();
    }
    return slot012;
  }

  /**
   * set variable slot012 Corresponding COBOL Variable is WS-SLOT-012
   *
   * @param value
   */
  public void setSlot012(char[] value) {
    slot012 = checkSlot012Constraints(value);
    serializeSlot012(slot012);
  }

  /**
   * Update Slot012 with a char[] from an offset and length
   *
   * @param value
   */
  public void setSlot012(char[] source, int sourceIndex) {
    replace(source, sourceIndex, source.length, beginSlot012, slot012.length);
  }

  public void setSlot012(char[] source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginSlot012, slot012.length);
  }

  /**
   * Update Slot012 with a char[] from an offset and length to an offset and length
   *
   * @param value
   */
  public void setSlot012(
      char[] source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginSlot012 + targetIndex, targetLen);
  }

  /**
   * Update Slot012 with another Field
   *
   * @param value
   */
  public void setSlot012(Field source) {
    replace(source, 0, source.length(), beginSlot012, SLOT_012_LEN);
  }

  /**
   * Update Slot012 with another Field from an offset and length
   *
   * @param value
   */
  public void setSlot012(Field source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginSlot012, SLOT_012_LEN);
  }

  /**
   * Update Slot012 with another Field from an offset and length to an offset and length
   *
   * @param value
   */
  public void setSlot012(
      Field source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginSlot012 + targetIndex, targetLen);
  }
  /**
   * Returns the value of slot012Ind
   *
   * @return slot012Ind
   */
  public short getSlot012Ind() throws CFException {
    if (isSlot012IndModified()) {
      slot012Ind = refreshSlot012Ind();
    }
    return slot012Ind;
  }

  /**
   * Update Slot012Ind with the passed value Corresponding COBOL Variable is WS-SLOT-012-IND
   *
   * @param number
   */
  public void setSlot012Ind(short number) {
    // Truncate if the number is beyond +/- Max range
    slot012Ind = checkSlot012IndMaxLimit(number);
    serializeSlot012Ind(slot012Ind);
  }

  public void setSlot012Ind(int number) {
    number = checkSlot012IndMaxLimit((short) number); // Truncate if value is beyond +/- Max range
    setSlot012Ind((short) number);
  }

  public void setSlot012Ind(long number) {
    number = checkSlot012IndMaxLimit((short) number); // Truncate if value is beyond +/- Max range
    setSlot012Ind((short) number);
  }

  /**
   * Returns the value of eff012
   *
   * @return eff012
   */
  public char[] getEff012() throws CFException {
    if (isEff012Modified()) {
      eff012 = refreshEff012();
    }
    return eff012;
  }

  /**
   * set variable eff012 Corresponding COBOL Variable is WS-EFF-012
   *
   * @param value
   */
  public void setEff012(char[] value) {
    eff012 = checkEff012Constraints(value);
    serializeEff012(eff012);
  }

  /**
   * Update Eff012 with a char[] from an offset and length
   *
   * @param value
   */
  public void setEff012(char[] source, int sourceIndex) {
    replace(source, sourceIndex, source.length, beginEff012, eff012.length);
  }

  public void setEff012(char[] source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginEff012, eff012.length);
  }

  /**
   * Update Eff012 with a char[] from an offset and length to an offset and length
   *
   * @param value
   */
  public void setEff012(
      char[] source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginEff012 + targetIndex, targetLen);
  }

  /**
   * Update Eff012 with another Field
   *
   * @param value
   */
  public void setEff012(Field source) {
    replace(source, 0, source.length(), beginEff012, EFF_012_LEN);
  }

  /**
   * Update Eff012 with another Field from an offset and length
   *
   * @param value
   */
  public void setEff012(Field source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginEff012, EFF_012_LEN);
  }

  /**
   * Update Eff012 with another Field from an offset and length to an offset and length
   *
   * @param value
   */
  public void setEff012(
      Field source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginEff012 + targetIndex, targetLen);
  }
  /**
   * Returns the value of eff012Ind
   *
   * @return eff012Ind
   */
  public short getEff012Ind() throws CFException {
    if (isEff012IndModified()) {
      eff012Ind = refreshEff012Ind();
    }
    return eff012Ind;
  }

  /**
   * Update Eff012Ind with the passed value Corresponding COBOL Variable is WS-EFF-012-IND
   *
   * @param number
   */
  public void setEff012Ind(short number) {
    // Truncate if the number is beyond +/- Max range
    eff012Ind = checkEff012IndMaxLimit(number);
    serializeEff012Ind(eff012Ind);
  }

  public void setEff012Ind(int number) {
    number = checkEff012IndMaxLimit((short) number); // Truncate if value is beyond +/- Max range
    setEff012Ind((short) number);
  }

  public void setEff012Ind(long number) {
    number = checkEff012IndMaxLimit((short) number); // Truncate if value is beyond +/- Max range
    setEff012Ind((short) number);
  }

  /**
   * Returns the value of canc012
   *
   * @return canc012
   */
  public char[] getCanc012() throws CFException {
    if (isCanc012Modified()) {
      canc012 = refreshCanc012();
    }
    return canc012;
  }

  /**
   * set variable canc012 Corresponding COBOL Variable is WS-CANC-012
   *
   * @param value
   */
  public void setCanc012(char[] value) {
    canc012 = checkCanc012Constraints(value);
    serializeCanc012(canc012);
  }

  /**
   * Update Canc012 with a char[] from an offset and length
   *
   * @param value
   */
  public void setCanc012(char[] source, int sourceIndex) {
    replace(source, sourceIndex, source.length, beginCanc012, canc012.length);
  }

  public void setCanc012(char[] source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginCanc012, canc012.length);
  }

  /**
   * Update Canc012 with a char[] from an offset and length to an offset and length
   *
   * @param value
   */
  public void setCanc012(
      char[] source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginCanc012 + targetIndex, targetLen);
  }

  /**
   * Update Canc012 with another Field
   *
   * @param value
   */
  public void setCanc012(Field source) {
    replace(source, 0, source.length(), beginCanc012, CANC_012_LEN);
  }

  /**
   * Update Canc012 with another Field from an offset and length
   *
   * @param value
   */
  public void setCanc012(Field source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginCanc012, CANC_012_LEN);
  }

  /**
   * Update Canc012 with another Field from an offset and length to an offset and length
   *
   * @param value
   */
  public void setCanc012(
      Field source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginCanc012 + targetIndex, targetLen);
  }
  /**
   * Returns the value of canc012Ind
   *
   * @return canc012Ind
   */
  public short getCanc012Ind() throws CFException {
    if (isCanc012IndModified()) {
      canc012Ind = refreshCanc012Ind();
    }
    return canc012Ind;
  }

  /**
   * Update Canc012Ind with the passed value Corresponding COBOL Variable is WS-CANC-012-IND
   *
   * @param number
   */
  public void setCanc012Ind(short number) {
    // Truncate if the number is beyond +/- Max range
    canc012Ind = checkCanc012IndMaxLimit(number);
    serializeCanc012Ind(canc012Ind);
  }

  public void setCanc012Ind(int number) {
    number = checkCanc012IndMaxLimit((short) number); // Truncate if value is beyond +/- Max range
    setCanc012Ind((short) number);
  }

  public void setCanc012Ind(long number) {
    number = checkCanc012IndMaxLimit((short) number); // Truncate if value is beyond +/- Max range
    setCanc012Ind((short) number);
  }

  /**
   * Returns the value of slot013
   *
   * @return slot013
   */
  public char[] getSlot013() throws CFException {
    if (isSlot013Modified()) {
      slot013 = refreshSlot013();
    }
    return slot013;
  }

  /**
   * set variable slot013 Corresponding COBOL Variable is WS-SLOT-013
   *
   * @param value
   */
  public void setSlot013(char[] value) {
    slot013 = checkSlot013Constraints(value);
    serializeSlot013(slot013);
  }

  /**
   * Update Slot013 with a char[] from an offset and length
   *
   * @param value
   */
  public void setSlot013(char[] source, int sourceIndex) {
    replace(source, sourceIndex, source.length, beginSlot013, slot013.length);
  }

  public void setSlot013(char[] source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginSlot013, slot013.length);
  }

  /**
   * Update Slot013 with a char[] from an offset and length to an offset and length
   *
   * @param value
   */
  public void setSlot013(
      char[] source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginSlot013 + targetIndex, targetLen);
  }

  /**
   * Update Slot013 with another Field
   *
   * @param value
   */
  public void setSlot013(Field source) {
    replace(source, 0, source.length(), beginSlot013, SLOT_013_LEN);
  }

  /**
   * Update Slot013 with another Field from an offset and length
   *
   * @param value
   */
  public void setSlot013(Field source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginSlot013, SLOT_013_LEN);
  }

  /**
   * Update Slot013 with another Field from an offset and length to an offset and length
   *
   * @param value
   */
  public void setSlot013(
      Field source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginSlot013 + targetIndex, targetLen);
  }
  /**
   * Returns the value of slot013Ind
   *
   * @return slot013Ind
   */
  public short getSlot013Ind() throws CFException {
    if (isSlot013IndModified()) {
      slot013Ind = refreshSlot013Ind();
    }
    return slot013Ind;
  }

  /**
   * Update Slot013Ind with the passed value Corresponding COBOL Variable is WS-SLOT-013-IND
   *
   * @param number
   */
  public void setSlot013Ind(short number) {
    // Truncate if the number is beyond +/- Max range
    slot013Ind = checkSlot013IndMaxLimit(number);
    serializeSlot013Ind(slot013Ind);
  }

  public void setSlot013Ind(int number) {
    number = checkSlot013IndMaxLimit((short) number); // Truncate if value is beyond +/- Max range
    setSlot013Ind((short) number);
  }

  public void setSlot013Ind(long number) {
    number = checkSlot013IndMaxLimit((short) number); // Truncate if value is beyond +/- Max range
    setSlot013Ind((short) number);
  }

  /**
   * Returns the value of eff013
   *
   * @return eff013
   */
  public char[] getEff013() throws CFException {
    if (isEff013Modified()) {
      eff013 = refreshEff013();
    }
    return eff013;
  }

  /**
   * set variable eff013 Corresponding COBOL Variable is WS-EFF-013
   *
   * @param value
   */
  public void setEff013(char[] value) {
    eff013 = checkEff013Constraints(value);
    serializeEff013(eff013);
  }

  /**
   * Update Eff013 with a char[] from an offset and length
   *
   * @param value
   */
  public void setEff013(char[] source, int sourceIndex) {
    replace(source, sourceIndex, source.length, beginEff013, eff013.length);
  }

  public void setEff013(char[] source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginEff013, eff013.length);
  }

  /**
   * Update Eff013 with a char[] from an offset and length to an offset and length
   *
   * @param value
   */
  public void setEff013(
      char[] source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginEff013 + targetIndex, targetLen);
  }

  /**
   * Update Eff013 with another Field
   *
   * @param value
   */
  public void setEff013(Field source) {
    replace(source, 0, source.length(), beginEff013, EFF_013_LEN);
  }

  /**
   * Update Eff013 with another Field from an offset and length
   *
   * @param value
   */
  public void setEff013(Field source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginEff013, EFF_013_LEN);
  }

  /**
   * Update Eff013 with another Field from an offset and length to an offset and length
   *
   * @param value
   */
  public void setEff013(
      Field source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginEff013 + targetIndex, targetLen);
  }
  /**
   * Returns the value of eff013Ind
   *
   * @return eff013Ind
   */
  public short getEff013Ind() throws CFException {
    if (isEff013IndModified()) {
      eff013Ind = refreshEff013Ind();
    }
    return eff013Ind;
  }

  /**
   * Update Eff013Ind with the passed value Corresponding COBOL Variable is WS-EFF-013-IND
   *
   * @param number
   */
  public void setEff013Ind(short number) {
    // Truncate if the number is beyond +/- Max range
    eff013Ind = checkEff013IndMaxLimit(number);
    serializeEff013Ind(eff013Ind);
  }

  public void setEff013Ind(int number) {
    number = checkEff013IndMaxLimit((short) number); // Truncate if value is beyond +/- Max range
    setEff013Ind((short) number);
  }

  public void setEff013Ind(long number) {
    number = checkEff013IndMaxLimit((short) number); // Truncate if value is beyond +/- Max range
    setEff013Ind((short) number);
  }

  /**
   * Returns the value of canc013
   *
   * @return canc013
   */
  public char[] getCanc013() throws CFException {
    if (isCanc013Modified()) {
      canc013 = refreshCanc013();
    }
    return canc013;
  }

  /**
   * set variable canc013 Corresponding COBOL Variable is WS-CANC-013
   *
   * @param value
   */
  public void setCanc013(char[] value) {
    canc013 = checkCanc013Constraints(value);
    serializeCanc013(canc013);
  }

  /**
   * Update Canc013 with a char[] from an offset and length
   *
   * @param value
   */
  public void setCanc013(char[] source, int sourceIndex) {
    replace(source, sourceIndex, source.length, beginCanc013, canc013.length);
  }

  public void setCanc013(char[] source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginCanc013, canc013.length);
  }

  /**
   * Update Canc013 with a char[] from an offset and length to an offset and length
   *
   * @param value
   */
  public void setCanc013(
      char[] source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginCanc013 + targetIndex, targetLen);
  }

  /**
   * Update Canc013 with another Field
   *
   * @param value
   */
  public void setCanc013(Field source) {
    replace(source, 0, source.length(), beginCanc013, CANC_013_LEN);
  }

  /**
   * Update Canc013 with another Field from an offset and length
   *
   * @param value
   */
  public void setCanc013(Field source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginCanc013, CANC_013_LEN);
  }

  /**
   * Update Canc013 with another Field from an offset and length to an offset and length
   *
   * @param value
   */
  public void setCanc013(
      Field source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginCanc013 + targetIndex, targetLen);
  }
  /**
   * Returns the value of canc013Ind
   *
   * @return canc013Ind
   */
  public short getCanc013Ind() throws CFException {
    if (isCanc013IndModified()) {
      canc013Ind = refreshCanc013Ind();
    }
    return canc013Ind;
  }

  /**
   * Update Canc013Ind with the passed value Corresponding COBOL Variable is WS-CANC-013-IND
   *
   * @param number
   */
  public void setCanc013Ind(short number) {
    // Truncate if the number is beyond +/- Max range
    canc013Ind = checkCanc013IndMaxLimit(number);
    serializeCanc013Ind(canc013Ind);
  }

  public void setCanc013Ind(int number) {
    number = checkCanc013IndMaxLimit((short) number); // Truncate if value is beyond +/- Max range
    setCanc013Ind((short) number);
  }

  public void setCanc013Ind(long number) {
    number = checkCanc013IndMaxLimit((short) number); // Truncate if value is beyond +/- Max range
    setCanc013Ind((short) number);
  }

  /**
   * Returns the value of slot014
   *
   * @return slot014
   */
  public char[] getSlot014() throws CFException {
    if (isSlot014Modified()) {
      slot014 = refreshSlot014();
    }
    return slot014;
  }

  /**
   * set variable slot014 Corresponding COBOL Variable is WS-SLOT-014
   *
   * @param value
   */
  public void setSlot014(char[] value) {
    slot014 = checkSlot014Constraints(value);
    serializeSlot014(slot014);
  }

  /**
   * Update Slot014 with a char[] from an offset and length
   *
   * @param value
   */
  public void setSlot014(char[] source, int sourceIndex) {
    replace(source, sourceIndex, source.length, beginSlot014, slot014.length);
  }

  public void setSlot014(char[] source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginSlot014, slot014.length);
  }

  /**
   * Update Slot014 with a char[] from an offset and length to an offset and length
   *
   * @param value
   */
  public void setSlot014(
      char[] source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginSlot014 + targetIndex, targetLen);
  }

  /**
   * Update Slot014 with another Field
   *
   * @param value
   */
  public void setSlot014(Field source) {
    replace(source, 0, source.length(), beginSlot014, SLOT_014_LEN);
  }

  /**
   * Update Slot014 with another Field from an offset and length
   *
   * @param value
   */
  public void setSlot014(Field source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginSlot014, SLOT_014_LEN);
  }

  /**
   * Update Slot014 with another Field from an offset and length to an offset and length
   *
   * @param value
   */
  public void setSlot014(
      Field source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginSlot014 + targetIndex, targetLen);
  }
  /**
   * Returns the value of slot014Ind
   *
   * @return slot014Ind
   */
  public short getSlot014Ind() throws CFException {
    if (isSlot014IndModified()) {
      slot014Ind = refreshSlot014Ind();
    }
    return slot014Ind;
  }

  /**
   * Update Slot014Ind with the passed value Corresponding COBOL Variable is WS-SLOT-014-IND
   *
   * @param number
   */
  public void setSlot014Ind(short number) {
    // Truncate if the number is beyond +/- Max range
    slot014Ind = checkSlot014IndMaxLimit(number);
    serializeSlot014Ind(slot014Ind);
  }

  public void setSlot014Ind(int number) {
    number = checkSlot014IndMaxLimit((short) number); // Truncate if value is beyond +/- Max range
    setSlot014Ind((short) number);
  }

  public void setSlot014Ind(long number) {
    number = checkSlot014IndMaxLimit((short) number); // Truncate if value is beyond +/- Max range
    setSlot014Ind((short) number);
  }

  /**
   * Returns the value of eff014
   *
   * @return eff014
   */
  public char[] getEff014() throws CFException {
    if (isEff014Modified()) {
      eff014 = refreshEff014();
    }
    return eff014;
  }

  /**
   * set variable eff014 Corresponding COBOL Variable is WS-EFF-014
   *
   * @param value
   */
  public void setEff014(char[] value) {
    eff014 = checkEff014Constraints(value);
    serializeEff014(eff014);
  }

  /**
   * Update Eff014 with a char[] from an offset and length
   *
   * @param value
   */
  public void setEff014(char[] source, int sourceIndex) {
    replace(source, sourceIndex, source.length, beginEff014, eff014.length);
  }

  public void setEff014(char[] source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginEff014, eff014.length);
  }

  /**
   * Update Eff014 with a char[] from an offset and length to an offset and length
   *
   * @param value
   */
  public void setEff014(
      char[] source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginEff014 + targetIndex, targetLen);
  }

  /**
   * Update Eff014 with another Field
   *
   * @param value
   */
  public void setEff014(Field source) {
    replace(source, 0, source.length(), beginEff014, EFF_014_LEN);
  }

  /**
   * Update Eff014 with another Field from an offset and length
   *
   * @param value
   */
  public void setEff014(Field source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginEff014, EFF_014_LEN);
  }

  /**
   * Update Eff014 with another Field from an offset and length to an offset and length
   *
   * @param value
   */
  public void setEff014(
      Field source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginEff014 + targetIndex, targetLen);
  }
  /**
   * Returns the value of eff014Ind
   *
   * @return eff014Ind
   */
  public short getEff014Ind() throws CFException {
    if (isEff014IndModified()) {
      eff014Ind = refreshEff014Ind();
    }
    return eff014Ind;
  }

  /**
   * Update Eff014Ind with the passed value Corresponding COBOL Variable is WS-EFF-014-IND
   *
   * @param number
   */
  public void setEff014Ind(short number) {
    // Truncate if the number is beyond +/- Max range
    eff014Ind = checkEff014IndMaxLimit(number);
    serializeEff014Ind(eff014Ind);
  }

  public void setEff014Ind(int number) {
    number = checkEff014IndMaxLimit((short) number); // Truncate if value is beyond +/- Max range
    setEff014Ind((short) number);
  }

  public void setEff014Ind(long number) {
    number = checkEff014IndMaxLimit((short) number); // Truncate if value is beyond +/- Max range
    setEff014Ind((short) number);
  }

  /**
   * Returns the value of canc014
   *
   * @return canc014
   */
  public char[] getCanc014() throws CFException {
    if (isCanc014Modified()) {
      canc014 = refreshCanc014();
    }
    return canc014;
  }

  /**
   * set variable canc014 Corresponding COBOL Variable is WS-CANC-014
   *
   * @param value
   */
  public void setCanc014(char[] value) {
    canc014 = checkCanc014Constraints(value);
    serializeCanc014(canc014);
  }

  /**
   * Update Canc014 with a char[] from an offset and length
   *
   * @param value
   */
  public void setCanc014(char[] source, int sourceIndex) {
    replace(source, sourceIndex, source.length, beginCanc014, canc014.length);
  }

  public void setCanc014(char[] source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginCanc014, canc014.length);
  }

  /**
   * Update Canc014 with a char[] from an offset and length to an offset and length
   *
   * @param value
   */
  public void setCanc014(
      char[] source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginCanc014 + targetIndex, targetLen);
  }

  /**
   * Update Canc014 with another Field
   *
   * @param value
   */
  public void setCanc014(Field source) {
    replace(source, 0, source.length(), beginCanc014, CANC_014_LEN);
  }

  /**
   * Update Canc014 with another Field from an offset and length
   *
   * @param value
   */
  public void setCanc014(Field source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginCanc014, CANC_014_LEN);
  }

  /**
   * Update Canc014 with another Field from an offset and length to an offset and length
   *
   * @param value
   */
  public void setCanc014(
      Field source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginCanc014 + targetIndex, targetLen);
  }
  /**
   * Returns the value of canc014Ind
   *
   * @return canc014Ind
   */
  public short getCanc014Ind() throws CFException {
    if (isCanc014IndModified()) {
      canc014Ind = refreshCanc014Ind();
    }
    return canc014Ind;
  }

  /**
   * Update Canc014Ind with the passed value Corresponding COBOL Variable is WS-CANC-014-IND
   *
   * @param number
   */
  public void setCanc014Ind(short number) {
    // Truncate if the number is beyond +/- Max range
    canc014Ind = checkCanc014IndMaxLimit(number);
    serializeCanc014Ind(canc014Ind);
  }

  public void setCanc014Ind(int number) {
    number = checkCanc014IndMaxLimit((short) number); // Truncate if value is beyond +/- Max range
    setCanc014Ind((short) number);
  }

  public void setCanc014Ind(long number) {
    number = checkCanc014IndMaxLimit((short) number); // Truncate if value is beyond +/- Max range
    setCanc014Ind((short) number);
  }

  /**
   * Returns the value of slot015
   *
   * @return slot015
   */
  public char[] getSlot015() throws CFException {
    if (isSlot015Modified()) {
      slot015 = refreshSlot015();
    }
    return slot015;
  }

  /**
   * set variable slot015 Corresponding COBOL Variable is WS-SLOT-015
   *
   * @param value
   */
  public void setSlot015(char[] value) {
    slot015 = checkSlot015Constraints(value);
    serializeSlot015(slot015);
  }

  /**
   * Update Slot015 with a char[] from an offset and length
   *
   * @param value
   */
  public void setSlot015(char[] source, int sourceIndex) {
    replace(source, sourceIndex, source.length, beginSlot015, slot015.length);
  }

  public void setSlot015(char[] source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginSlot015, slot015.length);
  }

  /**
   * Update Slot015 with a char[] from an offset and length to an offset and length
   *
   * @param value
   */
  public void setSlot015(
      char[] source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginSlot015 + targetIndex, targetLen);
  }

  /**
   * Update Slot015 with another Field
   *
   * @param value
   */
  public void setSlot015(Field source) {
    replace(source, 0, source.length(), beginSlot015, SLOT_015_LEN);
  }

  /**
   * Update Slot015 with another Field from an offset and length
   *
   * @param value
   */
  public void setSlot015(Field source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginSlot015, SLOT_015_LEN);
  }

  /**
   * Update Slot015 with another Field from an offset and length to an offset and length
   *
   * @param value
   */
  public void setSlot015(
      Field source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginSlot015 + targetIndex, targetLen);
  }
  /**
   * Returns the value of slot015Ind
   *
   * @return slot015Ind
   */
  public short getSlot015Ind() throws CFException {
    if (isSlot015IndModified()) {
      slot015Ind = refreshSlot015Ind();
    }
    return slot015Ind;
  }

  /**
   * Update Slot015Ind with the passed value Corresponding COBOL Variable is WS-SLOT-015-IND
   *
   * @param number
   */
  public void setSlot015Ind(short number) {
    // Truncate if the number is beyond +/- Max range
    slot015Ind = checkSlot015IndMaxLimit(number);
    serializeSlot015Ind(slot015Ind);
  }

  public void setSlot015Ind(int number) {
    number = checkSlot015IndMaxLimit((short) number); // Truncate if value is beyond +/- Max range
    setSlot015Ind((short) number);
  }

  public void setSlot015Ind(long number) {
    number = checkSlot015IndMaxLimit((short) number); // Truncate if value is beyond +/- Max range
    setSlot015Ind((short) number);
  }

  /**
   * Returns the value of slot016
   *
   * @return slot016
   */
  public char[] getSlot016() throws CFException {
    if (isSlot016Modified()) {
      slot016 = refreshSlot016();
    }
    return slot016;
  }

  /**
   * set variable slot016 Corresponding COBOL Variable is WS-SLOT-016
   *
   * @param value
   */
  public void setSlot016(char[] value) {
    slot016 = checkSlot016Constraints(value);
    serializeSlot016(slot016);
  }

  /**
   * Update Slot016 with a char[] from an offset and length
   *
   * @param value
   */
  public void setSlot016(char[] source, int sourceIndex) {
    replace(source, sourceIndex, source.length, beginSlot016, slot016.length);
  }

  public void setSlot016(char[] source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginSlot016, slot016.length);
  }

  /**
   * Update Slot016 with a char[] from an offset and length to an offset and length
   *
   * @param value
   */
  public void setSlot016(
      char[] source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginSlot016 + targetIndex, targetLen);
  }

  /**
   * Update Slot016 with another Field
   *
   * @param value
   */
  public void setSlot016(Field source) {
    replace(source, 0, source.length(), beginSlot016, SLOT_016_LEN);
  }

  /**
   * Update Slot016 with another Field from an offset and length
   *
   * @param value
   */
  public void setSlot016(Field source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginSlot016, SLOT_016_LEN);
  }

  /**
   * Update Slot016 with another Field from an offset and length to an offset and length
   *
   * @param value
   */
  public void setSlot016(
      Field source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginSlot016 + targetIndex, targetLen);
  }
  /**
   * Returns the value of slot016Ind
   *
   * @return slot016Ind
   */
  public short getSlot016Ind() throws CFException {
    if (isSlot016IndModified()) {
      slot016Ind = refreshSlot016Ind();
    }
    return slot016Ind;
  }

  /**
   * Update Slot016Ind with the passed value Corresponding COBOL Variable is WS-SLOT-016-IND
   *
   * @param number
   */
  public void setSlot016Ind(short number) {
    // Truncate if the number is beyond +/- Max range
    slot016Ind = checkSlot016IndMaxLimit(number);
    serializeSlot016Ind(slot016Ind);
  }

  public void setSlot016Ind(int number) {
    number = checkSlot016IndMaxLimit((short) number); // Truncate if value is beyond +/- Max range
    setSlot016Ind((short) number);
  }

  public void setSlot016Ind(long number) {
    number = checkSlot016IndMaxLimit((short) number); // Truncate if value is beyond +/- Max range
    setSlot016Ind((short) number);
  }

  /**
   * Returns the value of slot017
   *
   * @return slot017
   */
  public char[] getSlot017() throws CFException {
    if (isSlot017Modified()) {
      slot017 = refreshSlot017();
    }
    return slot017;
  }

  /**
   * set variable slot017 Corresponding COBOL Variable is WS-SLOT-017
   *
   * @param value
   */
  public void setSlot017(char[] value) {
    slot017 = checkSlot017Constraints(value);
    serializeSlot017(slot017);
  }

  /**
   * Update Slot017 with a char[] from an offset and length
   *
   * @param value
   */
  public void setSlot017(char[] source, int sourceIndex) {
    replace(source, sourceIndex, source.length, beginSlot017, slot017.length);
  }

  public void setSlot017(char[] source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginSlot017, slot017.length);
  }

  /**
   * Update Slot017 with a char[] from an offset and length to an offset and length
   *
   * @param value
   */
  public void setSlot017(
      char[] source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginSlot017 + targetIndex, targetLen);
  }

  /**
   * Update Slot017 with another Field
   *
   * @param value
   */
  public void setSlot017(Field source) {
    replace(source, 0, source.length(), beginSlot017, SLOT_017_LEN);
  }

  /**
   * Update Slot017 with another Field from an offset and length
   *
   * @param value
   */
  public void setSlot017(Field source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginSlot017, SLOT_017_LEN);
  }

  /**
   * Update Slot017 with another Field from an offset and length to an offset and length
   *
   * @param value
   */
  public void setSlot017(
      Field source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginSlot017 + targetIndex, targetLen);
  }
  /**
   * Returns the value of slot017Ind
   *
   * @return slot017Ind
   */
  public short getSlot017Ind() throws CFException {
    if (isSlot017IndModified()) {
      slot017Ind = refreshSlot017Ind();
    }
    return slot017Ind;
  }

  /**
   * Update Slot017Ind with the passed value Corresponding COBOL Variable is WS-SLOT-017-IND
   *
   * @param number
   */
  public void setSlot017Ind(short number) {
    // Truncate if the number is beyond +/- Max range
    slot017Ind = checkSlot017IndMaxLimit(number);
    serializeSlot017Ind(slot017Ind);
  }

  public void setSlot017Ind(int number) {
    number = checkSlot017IndMaxLimit((short) number); // Truncate if value is beyond +/- Max range
    setSlot017Ind((short) number);
  }

  public void setSlot017Ind(long number) {
    number = checkSlot017IndMaxLimit((short) number); // Truncate if value is beyond +/- Max range
    setSlot017Ind((short) number);
  }

  /**
   * Returns the value of slot018
   *
   * @return slot018
   */
  public char[] getSlot018() throws CFException {
    if (isSlot018Modified()) {
      slot018 = refreshSlot018();
    }
    return slot018;
  }

  /**
   * set variable slot018 Corresponding COBOL Variable is WS-SLOT-018
   *
   * @param value
   */
  public void setSlot018(char[] value) {
    slot018 = checkSlot018Constraints(value);
    serializeSlot018(slot018);
  }

  /**
   * Update Slot018 with a char[] from an offset and length
   *
   * @param value
   */
  public void setSlot018(char[] source, int sourceIndex) {
    replace(source, sourceIndex, source.length, beginSlot018, slot018.length);
  }

  public void setSlot018(char[] source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginSlot018, slot018.length);
  }

  /**
   * Update Slot018 with a char[] from an offset and length to an offset and length
   *
   * @param value
   */
  public void setSlot018(
      char[] source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginSlot018 + targetIndex, targetLen);
  }

  /**
   * Update Slot018 with another Field
   *
   * @param value
   */
  public void setSlot018(Field source) {
    replace(source, 0, source.length(), beginSlot018, SLOT_018_LEN);
  }

  /**
   * Update Slot018 with another Field from an offset and length
   *
   * @param value
   */
  public void setSlot018(Field source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginSlot018, SLOT_018_LEN);
  }

  /**
   * Update Slot018 with another Field from an offset and length to an offset and length
   *
   * @param value
   */
  public void setSlot018(
      Field source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginSlot018 + targetIndex, targetLen);
  }
  /**
   * Returns the value of slot018Ind
   *
   * @return slot018Ind
   */
  public short getSlot018Ind() throws CFException {
    if (isSlot018IndModified()) {
      slot018Ind = refreshSlot018Ind();
    }
    return slot018Ind;
  }

  /**
   * Update Slot018Ind with the passed value Corresponding COBOL Variable is WS-SLOT-018-IND
   *
   * @param number
   */
  public void setSlot018Ind(short number) {
    // Truncate if the number is beyond +/- Max range
    slot018Ind = checkSlot018IndMaxLimit(number);
    serializeSlot018Ind(slot018Ind);
  }

  public void setSlot018Ind(int number) {
    number = checkSlot018IndMaxLimit((short) number); // Truncate if value is beyond +/- Max range
    setSlot018Ind((short) number);
  }

  public void setSlot018Ind(long number) {
    number = checkSlot018IndMaxLimit((short) number); // Truncate if value is beyond +/- Max range
    setSlot018Ind((short) number);
  }

  /**
   * Returns the value of slot019
   *
   * @return slot019
   */
  public char[] getSlot019() throws CFException {
    if (isSlot019Modified()) {
      slot019 = refreshSlot019();
    }
    return slot019;
  }

  /**
   * set variable slot019 Corresponding COBOL Variable is WS-SLOT-019
   *
   * @param value
   */
  public void setSlot019(char[] value) {
    slot019 = checkSlot019Constraints(value);
    serializeSlot019(slot019);
  }

  /**
   * Update Slot019 with a char[] from an offset and length
   *
   * @param value
   */
  public void setSlot019(char[] source, int sourceIndex) {
    replace(source, sourceIndex, source.length, beginSlot019, slot019.length);
  }

  public void setSlot019(char[] source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginSlot019, slot019.length);
  }

  /**
   * Update Slot019 with a char[] from an offset and length to an offset and length
   *
   * @param value
   */
  public void setSlot019(
      char[] source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginSlot019 + targetIndex, targetLen);
  }

  /**
   * Update Slot019 with another Field
   *
   * @param value
   */
  public void setSlot019(Field source) {
    replace(source, 0, source.length(), beginSlot019, SLOT_019_LEN);
  }

  /**
   * Update Slot019 with another Field from an offset and length
   *
   * @param value
   */
  public void setSlot019(Field source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginSlot019, SLOT_019_LEN);
  }

  /**
   * Update Slot019 with another Field from an offset and length to an offset and length
   *
   * @param value
   */
  public void setSlot019(
      Field source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginSlot019 + targetIndex, targetLen);
  }
  /**
   * Returns the value of slot019Ind
   *
   * @return slot019Ind
   */
  public short getSlot019Ind() throws CFException {
    if (isSlot019IndModified()) {
      slot019Ind = refreshSlot019Ind();
    }
    return slot019Ind;
  }

  /**
   * Update Slot019Ind with the passed value Corresponding COBOL Variable is WS-SLOT-019-IND
   *
   * @param number
   */
  public void setSlot019Ind(short number) {
    // Truncate if the number is beyond +/- Max range
    slot019Ind = checkSlot019IndMaxLimit(number);
    serializeSlot019Ind(slot019Ind);
  }

  public void setSlot019Ind(int number) {
    number = checkSlot019IndMaxLimit((short) number); // Truncate if value is beyond +/- Max range
    setSlot019Ind((short) number);
  }

  public void setSlot019Ind(long number) {
    number = checkSlot019IndMaxLimit((short) number); // Truncate if value is beyond +/- Max range
    setSlot019Ind((short) number);
  }

  /**
   * Returns the value of slot020
   *
   * @return slot020
   */
  public char[] getSlot020() throws CFException {
    if (isSlot020Modified()) {
      slot020 = refreshSlot020();
    }
    return slot020;
  }

  /**
   * set variable slot020 Corresponding COBOL Variable is WS-SLOT-020
   *
   * @param value
   */
  public void setSlot020(char[] value) {
    slot020 = checkSlot020Constraints(value);
    serializeSlot020(slot020);
  }

  /**
   * Update Slot020 with a char[] from an offset and length
   *
   * @param value
   */
  public void setSlot020(char[] source, int sourceIndex) {
    replace(source, sourceIndex, source.length, beginSlot020, slot020.length);
  }

  public void setSlot020(char[] source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginSlot020, slot020.length);
  }

  /**
   * Update Slot020 with a char[] from an offset and length to an offset and length
   *
   * @param value
   */
  public void setSlot020(
      char[] source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginSlot020 + targetIndex, targetLen);
  }

  /**
   * Update Slot020 with another Field
   *
   * @param value
   */
  public void setSlot020(Field source) {
    replace(source, 0, source.length(), beginSlot020, SLOT_020_LEN);
  }

  /**
   * Update Slot020 with another Field from an offset and length
   *
   * @param value
   */
  public void setSlot020(Field source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginSlot020, SLOT_020_LEN);
  }

  /**
   * Update Slot020 with another Field from an offset and length to an offset and length
   *
   * @param value
   */
  public void setSlot020(
      Field source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginSlot020 + targetIndex, targetLen);
  }
  /**
   * Returns the value of slot020Ind
   *
   * @return slot020Ind
   */
  public short getSlot020Ind() throws CFException {
    if (isSlot020IndModified()) {
      slot020Ind = refreshSlot020Ind();
    }
    return slot020Ind;
  }

  /**
   * Update Slot020Ind with the passed value Corresponding COBOL Variable is WS-SLOT-020-IND
   *
   * @param number
   */
  public void setSlot020Ind(short number) {
    // Truncate if the number is beyond +/- Max range
    slot020Ind = checkSlot020IndMaxLimit(number);
    serializeSlot020Ind(slot020Ind);
  }

  public void setSlot020Ind(int number) {
    number = checkSlot020IndMaxLimit((short) number); // Truncate if value is beyond +/- Max range
    setSlot020Ind((short) number);
  }

  public void setSlot020Ind(long number) {
    number = checkSlot020IndMaxLimit((short) number); // Truncate if value is beyond +/- Max range
    setSlot020Ind((short) number);
  }

  public static int getSviTablesDataFieldLength() {
    return SVI_TABLES_DATA_LENGTH;
  }
}
