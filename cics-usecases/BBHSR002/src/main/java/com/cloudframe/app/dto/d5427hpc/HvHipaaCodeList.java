package com.cloudframe.app.dto.d5427hpc;

/**
 * The class HvHipaaCodeList is used to handle fields declared in it
 *
 * @author CloudFrame Inc. created on 2025-03-25 at 08:29. using version 5.0.0.231
 */
import com.cloudframe.app.data.Field;
import com.cloudframe.app.dto.serialize.d5427hpc.*;
import com.cloudframe.app.exception.CFException;

public class HvHipaaCodeList extends HvHipaaCodeListSerialized {

  private char[] hvHipaaCodeItem1 = Field.fillLowValue(2);

  private char[] hvHipaaCodeItem2 = Field.fillLowValue(2);

  private char[] hvHipaaCodeItem3 = Field.fillLowValue(2);

  private char[] hvHipaaCodeItem4 = Field.fillLowValue(2);

  private char[] hvHipaaCodeItem5 = Field.fillLowValue(2);

  private char[] hvHipaaCodeItem6 = Field.fillLowValue(2);

  private char[] hvHipaaCodeItem7 = Field.fillLowValue(2);

  private char[] hvHipaaCodeItem8 = Field.fillLowValue(2);

  private char[] hvHipaaCodeItem9 = Field.fillLowValue(2);

  private char[] hvHipaaCodeItem10 = Field.fillLowValue(2);

  /** Constructor for HvHipaaCodeList */
  public HvHipaaCodeList() {
    super();
    /*  set the parent of each child as this which are a group variable */
    /*  end of offset */
  }

  /**
   * Returns the value of hvHipaaCodeItem1
   *
   * @return hvHipaaCodeItem1
   */
  public char[] getHvHipaaCodeItem1() throws CFException {
    if (isHvHipaaCodeItem1Modified()) {
      hvHipaaCodeItem1 = refreshHvHipaaCodeItem1();
    }
    return hvHipaaCodeItem1;
  }

  /**
   * set variable hvHipaaCodeItem1 Corresponding COBOL Variable is HV-HIPAA-CODE-ITEM-1
   *
   * @param value
   */
  public void setHvHipaaCodeItem1(char[] value) {
    hvHipaaCodeItem1 = checkHvHipaaCodeItem1Constraints(value);
    serializeHvHipaaCodeItem1(hvHipaaCodeItem1);
  }

  /**
   * Update HvHipaaCodeItem1 with a char[] from an offset and length
   *
   * @param value
   */
  public void setHvHipaaCodeItem1(char[] source, int sourceIndex) {
    replace(source, sourceIndex, source.length, beginHvHipaaCodeItem1, hvHipaaCodeItem1.length);
  }

  public void setHvHipaaCodeItem1(char[] source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginHvHipaaCodeItem1, hvHipaaCodeItem1.length);
  }

  /**
   * Update HvHipaaCodeItem1 with a char[] from an offset and length to an offset and length
   *
   * @param value
   */
  public void setHvHipaaCodeItem1(
      char[] source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginHvHipaaCodeItem1 + targetIndex, targetLen);
  }

  /**
   * Update HvHipaaCodeItem1 with another Field
   *
   * @param value
   */
  public void setHvHipaaCodeItem1(Field source) {
    replace(source, 0, source.length(), beginHvHipaaCodeItem1, HV_HIPAA_CODE_ITEM_1_LEN);
  }

  /**
   * Update HvHipaaCodeItem1 with another Field from an offset and length
   *
   * @param value
   */
  public void setHvHipaaCodeItem1(Field source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginHvHipaaCodeItem1, HV_HIPAA_CODE_ITEM_1_LEN);
  }

  /**
   * Update HvHipaaCodeItem1 with another Field from an offset and length to an offset and length
   *
   * @param value
   */
  public void setHvHipaaCodeItem1(
      Field source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginHvHipaaCodeItem1 + targetIndex, targetLen);
  }
  /**
   * Returns the value of hvHipaaCodeItem2
   *
   * @return hvHipaaCodeItem2
   */
  public char[] getHvHipaaCodeItem2() throws CFException {
    if (isHvHipaaCodeItem2Modified()) {
      hvHipaaCodeItem2 = refreshHvHipaaCodeItem2();
    }
    return hvHipaaCodeItem2;
  }

  /**
   * set variable hvHipaaCodeItem2 Corresponding COBOL Variable is HV-HIPAA-CODE-ITEM-2
   *
   * @param value
   */
  public void setHvHipaaCodeItem2(char[] value) {
    hvHipaaCodeItem2 = checkHvHipaaCodeItem2Constraints(value);
    serializeHvHipaaCodeItem2(hvHipaaCodeItem2);
  }

  /**
   * Update HvHipaaCodeItem2 with a char[] from an offset and length
   *
   * @param value
   */
  public void setHvHipaaCodeItem2(char[] source, int sourceIndex) {
    replace(source, sourceIndex, source.length, beginHvHipaaCodeItem2, hvHipaaCodeItem2.length);
  }

  public void setHvHipaaCodeItem2(char[] source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginHvHipaaCodeItem2, hvHipaaCodeItem2.length);
  }

  /**
   * Update HvHipaaCodeItem2 with a char[] from an offset and length to an offset and length
   *
   * @param value
   */
  public void setHvHipaaCodeItem2(
      char[] source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginHvHipaaCodeItem2 + targetIndex, targetLen);
  }

  /**
   * Update HvHipaaCodeItem2 with another Field
   *
   * @param value
   */
  public void setHvHipaaCodeItem2(Field source) {
    replace(source, 0, source.length(), beginHvHipaaCodeItem2, HV_HIPAA_CODE_ITEM_2_LEN);
  }

  /**
   * Update HvHipaaCodeItem2 with another Field from an offset and length
   *
   * @param value
   */
  public void setHvHipaaCodeItem2(Field source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginHvHipaaCodeItem2, HV_HIPAA_CODE_ITEM_2_LEN);
  }

  /**
   * Update HvHipaaCodeItem2 with another Field from an offset and length to an offset and length
   *
   * @param value
   */
  public void setHvHipaaCodeItem2(
      Field source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginHvHipaaCodeItem2 + targetIndex, targetLen);
  }
  /**
   * Returns the value of hvHipaaCodeItem3
   *
   * @return hvHipaaCodeItem3
   */
  public char[] getHvHipaaCodeItem3() throws CFException {
    if (isHvHipaaCodeItem3Modified()) {
      hvHipaaCodeItem3 = refreshHvHipaaCodeItem3();
    }
    return hvHipaaCodeItem3;
  }

  /**
   * set variable hvHipaaCodeItem3 Corresponding COBOL Variable is HV-HIPAA-CODE-ITEM-3
   *
   * @param value
   */
  public void setHvHipaaCodeItem3(char[] value) {
    hvHipaaCodeItem3 = checkHvHipaaCodeItem3Constraints(value);
    serializeHvHipaaCodeItem3(hvHipaaCodeItem3);
  }

  /**
   * Update HvHipaaCodeItem3 with a char[] from an offset and length
   *
   * @param value
   */
  public void setHvHipaaCodeItem3(char[] source, int sourceIndex) {
    replace(source, sourceIndex, source.length, beginHvHipaaCodeItem3, hvHipaaCodeItem3.length);
  }

  public void setHvHipaaCodeItem3(char[] source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginHvHipaaCodeItem3, hvHipaaCodeItem3.length);
  }

  /**
   * Update HvHipaaCodeItem3 with a char[] from an offset and length to an offset and length
   *
   * @param value
   */
  public void setHvHipaaCodeItem3(
      char[] source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginHvHipaaCodeItem3 + targetIndex, targetLen);
  }

  /**
   * Update HvHipaaCodeItem3 with another Field
   *
   * @param value
   */
  public void setHvHipaaCodeItem3(Field source) {
    replace(source, 0, source.length(), beginHvHipaaCodeItem3, HV_HIPAA_CODE_ITEM_3_LEN);
  }

  /**
   * Update HvHipaaCodeItem3 with another Field from an offset and length
   *
   * @param value
   */
  public void setHvHipaaCodeItem3(Field source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginHvHipaaCodeItem3, HV_HIPAA_CODE_ITEM_3_LEN);
  }

  /**
   * Update HvHipaaCodeItem3 with another Field from an offset and length to an offset and length
   *
   * @param value
   */
  public void setHvHipaaCodeItem3(
      Field source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginHvHipaaCodeItem3 + targetIndex, targetLen);
  }
  /**
   * Returns the value of hvHipaaCodeItem4
   *
   * @return hvHipaaCodeItem4
   */
  public char[] getHvHipaaCodeItem4() throws CFException {
    if (isHvHipaaCodeItem4Modified()) {
      hvHipaaCodeItem4 = refreshHvHipaaCodeItem4();
    }
    return hvHipaaCodeItem4;
  }

  /**
   * set variable hvHipaaCodeItem4 Corresponding COBOL Variable is HV-HIPAA-CODE-ITEM-4
   *
   * @param value
   */
  public void setHvHipaaCodeItem4(char[] value) {
    hvHipaaCodeItem4 = checkHvHipaaCodeItem4Constraints(value);
    serializeHvHipaaCodeItem4(hvHipaaCodeItem4);
  }

  /**
   * Update HvHipaaCodeItem4 with a char[] from an offset and length
   *
   * @param value
   */
  public void setHvHipaaCodeItem4(char[] source, int sourceIndex) {
    replace(source, sourceIndex, source.length, beginHvHipaaCodeItem4, hvHipaaCodeItem4.length);
  }

  public void setHvHipaaCodeItem4(char[] source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginHvHipaaCodeItem4, hvHipaaCodeItem4.length);
  }

  /**
   * Update HvHipaaCodeItem4 with a char[] from an offset and length to an offset and length
   *
   * @param value
   */
  public void setHvHipaaCodeItem4(
      char[] source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginHvHipaaCodeItem4 + targetIndex, targetLen);
  }

  /**
   * Update HvHipaaCodeItem4 with another Field
   *
   * @param value
   */
  public void setHvHipaaCodeItem4(Field source) {
    replace(source, 0, source.length(), beginHvHipaaCodeItem4, HV_HIPAA_CODE_ITEM_4_LEN);
  }

  /**
   * Update HvHipaaCodeItem4 with another Field from an offset and length
   *
   * @param value
   */
  public void setHvHipaaCodeItem4(Field source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginHvHipaaCodeItem4, HV_HIPAA_CODE_ITEM_4_LEN);
  }

  /**
   * Update HvHipaaCodeItem4 with another Field from an offset and length to an offset and length
   *
   * @param value
   */
  public void setHvHipaaCodeItem4(
      Field source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginHvHipaaCodeItem4 + targetIndex, targetLen);
  }
  /**
   * Returns the value of hvHipaaCodeItem5
   *
   * @return hvHipaaCodeItem5
   */
  public char[] getHvHipaaCodeItem5() throws CFException {
    if (isHvHipaaCodeItem5Modified()) {
      hvHipaaCodeItem5 = refreshHvHipaaCodeItem5();
    }
    return hvHipaaCodeItem5;
  }

  /**
   * set variable hvHipaaCodeItem5 Corresponding COBOL Variable is HV-HIPAA-CODE-ITEM-5
   *
   * @param value
   */
  public void setHvHipaaCodeItem5(char[] value) {
    hvHipaaCodeItem5 = checkHvHipaaCodeItem5Constraints(value);
    serializeHvHipaaCodeItem5(hvHipaaCodeItem5);
  }

  /**
   * Update HvHipaaCodeItem5 with a char[] from an offset and length
   *
   * @param value
   */
  public void setHvHipaaCodeItem5(char[] source, int sourceIndex) {
    replace(source, sourceIndex, source.length, beginHvHipaaCodeItem5, hvHipaaCodeItem5.length);
  }

  public void setHvHipaaCodeItem5(char[] source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginHvHipaaCodeItem5, hvHipaaCodeItem5.length);
  }

  /**
   * Update HvHipaaCodeItem5 with a char[] from an offset and length to an offset and length
   *
   * @param value
   */
  public void setHvHipaaCodeItem5(
      char[] source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginHvHipaaCodeItem5 + targetIndex, targetLen);
  }

  /**
   * Update HvHipaaCodeItem5 with another Field
   *
   * @param value
   */
  public void setHvHipaaCodeItem5(Field source) {
    replace(source, 0, source.length(), beginHvHipaaCodeItem5, HV_HIPAA_CODE_ITEM_5_LEN);
  }

  /**
   * Update HvHipaaCodeItem5 with another Field from an offset and length
   *
   * @param value
   */
  public void setHvHipaaCodeItem5(Field source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginHvHipaaCodeItem5, HV_HIPAA_CODE_ITEM_5_LEN);
  }

  /**
   * Update HvHipaaCodeItem5 with another Field from an offset and length to an offset and length
   *
   * @param value
   */
  public void setHvHipaaCodeItem5(
      Field source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginHvHipaaCodeItem5 + targetIndex, targetLen);
  }
  /**
   * Returns the value of hvHipaaCodeItem6
   *
   * @return hvHipaaCodeItem6
   */
  public char[] getHvHipaaCodeItem6() throws CFException {
    if (isHvHipaaCodeItem6Modified()) {
      hvHipaaCodeItem6 = refreshHvHipaaCodeItem6();
    }
    return hvHipaaCodeItem6;
  }

  /**
   * set variable hvHipaaCodeItem6 Corresponding COBOL Variable is HV-HIPAA-CODE-ITEM-6
   *
   * @param value
   */
  public void setHvHipaaCodeItem6(char[] value) {
    hvHipaaCodeItem6 = checkHvHipaaCodeItem6Constraints(value);
    serializeHvHipaaCodeItem6(hvHipaaCodeItem6);
  }

  /**
   * Update HvHipaaCodeItem6 with a char[] from an offset and length
   *
   * @param value
   */
  public void setHvHipaaCodeItem6(char[] source, int sourceIndex) {
    replace(source, sourceIndex, source.length, beginHvHipaaCodeItem6, hvHipaaCodeItem6.length);
  }

  public void setHvHipaaCodeItem6(char[] source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginHvHipaaCodeItem6, hvHipaaCodeItem6.length);
  }

  /**
   * Update HvHipaaCodeItem6 with a char[] from an offset and length to an offset and length
   *
   * @param value
   */
  public void setHvHipaaCodeItem6(
      char[] source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginHvHipaaCodeItem6 + targetIndex, targetLen);
  }

  /**
   * Update HvHipaaCodeItem6 with another Field
   *
   * @param value
   */
  public void setHvHipaaCodeItem6(Field source) {
    replace(source, 0, source.length(), beginHvHipaaCodeItem6, HV_HIPAA_CODE_ITEM_6_LEN);
  }

  /**
   * Update HvHipaaCodeItem6 with another Field from an offset and length
   *
   * @param value
   */
  public void setHvHipaaCodeItem6(Field source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginHvHipaaCodeItem6, HV_HIPAA_CODE_ITEM_6_LEN);
  }

  /**
   * Update HvHipaaCodeItem6 with another Field from an offset and length to an offset and length
   *
   * @param value
   */
  public void setHvHipaaCodeItem6(
      Field source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginHvHipaaCodeItem6 + targetIndex, targetLen);
  }
  /**
   * Returns the value of hvHipaaCodeItem7
   *
   * @return hvHipaaCodeItem7
   */
  public char[] getHvHipaaCodeItem7() throws CFException {
    if (isHvHipaaCodeItem7Modified()) {
      hvHipaaCodeItem7 = refreshHvHipaaCodeItem7();
    }
    return hvHipaaCodeItem7;
  }

  /**
   * set variable hvHipaaCodeItem7 Corresponding COBOL Variable is HV-HIPAA-CODE-ITEM-7
   *
   * @param value
   */
  public void setHvHipaaCodeItem7(char[] value) {
    hvHipaaCodeItem7 = checkHvHipaaCodeItem7Constraints(value);
    serializeHvHipaaCodeItem7(hvHipaaCodeItem7);
  }

  /**
   * Update HvHipaaCodeItem7 with a char[] from an offset and length
   *
   * @param value
   */
  public void setHvHipaaCodeItem7(char[] source, int sourceIndex) {
    replace(source, sourceIndex, source.length, beginHvHipaaCodeItem7, hvHipaaCodeItem7.length);
  }

  public void setHvHipaaCodeItem7(char[] source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginHvHipaaCodeItem7, hvHipaaCodeItem7.length);
  }

  /**
   * Update HvHipaaCodeItem7 with a char[] from an offset and length to an offset and length
   *
   * @param value
   */
  public void setHvHipaaCodeItem7(
      char[] source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginHvHipaaCodeItem7 + targetIndex, targetLen);
  }

  /**
   * Update HvHipaaCodeItem7 with another Field
   *
   * @param value
   */
  public void setHvHipaaCodeItem7(Field source) {
    replace(source, 0, source.length(), beginHvHipaaCodeItem7, HV_HIPAA_CODE_ITEM_7_LEN);
  }

  /**
   * Update HvHipaaCodeItem7 with another Field from an offset and length
   *
   * @param value
   */
  public void setHvHipaaCodeItem7(Field source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginHvHipaaCodeItem7, HV_HIPAA_CODE_ITEM_7_LEN);
  }

  /**
   * Update HvHipaaCodeItem7 with another Field from an offset and length to an offset and length
   *
   * @param value
   */
  public void setHvHipaaCodeItem7(
      Field source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginHvHipaaCodeItem7 + targetIndex, targetLen);
  }
  /**
   * Returns the value of hvHipaaCodeItem8
   *
   * @return hvHipaaCodeItem8
   */
  public char[] getHvHipaaCodeItem8() throws CFException {
    if (isHvHipaaCodeItem8Modified()) {
      hvHipaaCodeItem8 = refreshHvHipaaCodeItem8();
    }
    return hvHipaaCodeItem8;
  }

  /**
   * set variable hvHipaaCodeItem8 Corresponding COBOL Variable is HV-HIPAA-CODE-ITEM-8
   *
   * @param value
   */
  public void setHvHipaaCodeItem8(char[] value) {
    hvHipaaCodeItem8 = checkHvHipaaCodeItem8Constraints(value);
    serializeHvHipaaCodeItem8(hvHipaaCodeItem8);
  }

  /**
   * Update HvHipaaCodeItem8 with a char[] from an offset and length
   *
   * @param value
   */
  public void setHvHipaaCodeItem8(char[] source, int sourceIndex) {
    replace(source, sourceIndex, source.length, beginHvHipaaCodeItem8, hvHipaaCodeItem8.length);
  }

  public void setHvHipaaCodeItem8(char[] source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginHvHipaaCodeItem8, hvHipaaCodeItem8.length);
  }

  /**
   * Update HvHipaaCodeItem8 with a char[] from an offset and length to an offset and length
   *
   * @param value
   */
  public void setHvHipaaCodeItem8(
      char[] source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginHvHipaaCodeItem8 + targetIndex, targetLen);
  }

  /**
   * Update HvHipaaCodeItem8 with another Field
   *
   * @param value
   */
  public void setHvHipaaCodeItem8(Field source) {
    replace(source, 0, source.length(), beginHvHipaaCodeItem8, HV_HIPAA_CODE_ITEM_8_LEN);
  }

  /**
   * Update HvHipaaCodeItem8 with another Field from an offset and length
   *
   * @param value
   */
  public void setHvHipaaCodeItem8(Field source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginHvHipaaCodeItem8, HV_HIPAA_CODE_ITEM_8_LEN);
  }

  /**
   * Update HvHipaaCodeItem8 with another Field from an offset and length to an offset and length
   *
   * @param value
   */
  public void setHvHipaaCodeItem8(
      Field source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginHvHipaaCodeItem8 + targetIndex, targetLen);
  }
  /**
   * Returns the value of hvHipaaCodeItem9
   *
   * @return hvHipaaCodeItem9
   */
  public char[] getHvHipaaCodeItem9() throws CFException {
    if (isHvHipaaCodeItem9Modified()) {
      hvHipaaCodeItem9 = refreshHvHipaaCodeItem9();
    }
    return hvHipaaCodeItem9;
  }

  /**
   * set variable hvHipaaCodeItem9 Corresponding COBOL Variable is HV-HIPAA-CODE-ITEM-9
   *
   * @param value
   */
  public void setHvHipaaCodeItem9(char[] value) {
    hvHipaaCodeItem9 = checkHvHipaaCodeItem9Constraints(value);
    serializeHvHipaaCodeItem9(hvHipaaCodeItem9);
  }

  /**
   * Update HvHipaaCodeItem9 with a char[] from an offset and length
   *
   * @param value
   */
  public void setHvHipaaCodeItem9(char[] source, int sourceIndex) {
    replace(source, sourceIndex, source.length, beginHvHipaaCodeItem9, hvHipaaCodeItem9.length);
  }

  public void setHvHipaaCodeItem9(char[] source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginHvHipaaCodeItem9, hvHipaaCodeItem9.length);
  }

  /**
   * Update HvHipaaCodeItem9 with a char[] from an offset and length to an offset and length
   *
   * @param value
   */
  public void setHvHipaaCodeItem9(
      char[] source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginHvHipaaCodeItem9 + targetIndex, targetLen);
  }

  /**
   * Update HvHipaaCodeItem9 with another Field
   *
   * @param value
   */
  public void setHvHipaaCodeItem9(Field source) {
    replace(source, 0, source.length(), beginHvHipaaCodeItem9, HV_HIPAA_CODE_ITEM_9_LEN);
  }

  /**
   * Update HvHipaaCodeItem9 with another Field from an offset and length
   *
   * @param value
   */
  public void setHvHipaaCodeItem9(Field source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginHvHipaaCodeItem9, HV_HIPAA_CODE_ITEM_9_LEN);
  }

  /**
   * Update HvHipaaCodeItem9 with another Field from an offset and length to an offset and length
   *
   * @param value
   */
  public void setHvHipaaCodeItem9(
      Field source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginHvHipaaCodeItem9 + targetIndex, targetLen);
  }
  /**
   * Returns the value of hvHipaaCodeItem10
   *
   * @return hvHipaaCodeItem10
   */
  public char[] getHvHipaaCodeItem10() throws CFException {
    if (isHvHipaaCodeItem10Modified()) {
      hvHipaaCodeItem10 = refreshHvHipaaCodeItem10();
    }
    return hvHipaaCodeItem10;
  }

  /**
   * set variable hvHipaaCodeItem10 Corresponding COBOL Variable is HV-HIPAA-CODE-ITEM-10
   *
   * @param value
   */
  public void setHvHipaaCodeItem10(char[] value) {
    hvHipaaCodeItem10 = checkHvHipaaCodeItem10Constraints(value);
    serializeHvHipaaCodeItem10(hvHipaaCodeItem10);
  }

  /**
   * Update HvHipaaCodeItem10 with a char[] from an offset and length
   *
   * @param value
   */
  public void setHvHipaaCodeItem10(char[] source, int sourceIndex) {
    replace(source, sourceIndex, source.length, beginHvHipaaCodeItem10, hvHipaaCodeItem10.length);
  }

  public void setHvHipaaCodeItem10(char[] source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginHvHipaaCodeItem10, hvHipaaCodeItem10.length);
  }

  /**
   * Update HvHipaaCodeItem10 with a char[] from an offset and length to an offset and length
   *
   * @param value
   */
  public void setHvHipaaCodeItem10(
      char[] source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginHvHipaaCodeItem10 + targetIndex, targetLen);
  }

  /**
   * Update HvHipaaCodeItem10 with another Field
   *
   * @param value
   */
  public void setHvHipaaCodeItem10(Field source) {
    replace(source, 0, source.length(), beginHvHipaaCodeItem10, HV_HIPAA_CODE_ITEM_10_LEN);
  }

  /**
   * Update HvHipaaCodeItem10 with another Field from an offset and length
   *
   * @param value
   */
  public void setHvHipaaCodeItem10(Field source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginHvHipaaCodeItem10, HV_HIPAA_CODE_ITEM_10_LEN);
  }

  /**
   * Update HvHipaaCodeItem10 with another Field from an offset and length to an offset and length
   *
   * @param value
   */
  public void setHvHipaaCodeItem10(
      Field source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginHvHipaaCodeItem10 + targetIndex, targetLen);
  }

  public static int getHvHipaaCodeListFieldLength() {
    return HV_HIPAA_CODE_LIST_LENGTH;
  }
}
