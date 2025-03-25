package com.cloudframe.app.dto.d5427bhi;

/**
 * The class BhiDataArea is used to handle fields declared in it
 *
 * @author CloudFrame Inc. created on 2025-03-25 at 08:32. using version 5.0.0.231
 */
import com.cloudframe.app.data.Field;
import com.cloudframe.app.dto.serialize.d5427bhi.*;

public class BhiDataArea extends BhiDataAreaSerialized {

  private BhiKey bhiKey = new BhiKey();
  private BhiNonkeyData bhiNonkeyData = new BhiNonkeyData();

  /** Constructor for BhiDataArea */
  public BhiDataArea() {
    // TO-DO auto generated code
  }

  /**
   * Constructor for BhiDataArea. sets the parent value to the parent
   *
   * @param parent
   * @param begin
   */
  public BhiDataArea(Field parent, int begin) {
    setParent(parent, begin);
  }

  @Override
  public void setParent(Field parent, int begin) {
    super.setParent(parent, begin);
    bhiKey.setParent(this, getStartOffset() + 0);
    bhiNonkeyData.setParent(this, getStartOffset() + 56);
  }

  /**
   * Returns the value of bhiKey
   *
   * @return bhiKey
   */
  public BhiKey getBhiKey() {
    return bhiKey;
  }
  /**
   * Update BhiKey with the passed value Corresponding COBOL Variable is WS-BHI-KEY
   *
   * @param value
   */
  public void setBhiKey(char[] value) {
    bhiKey.setString(value);
  }

  /**
   * Update BhiKey with a String from an offset and length
   *
   * @param value
   */
  public void setBhiKey(char[] source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, bhiKey.begin, bhiKey.length());
  }

  /**
   * Update BhiKey with a String from an offset and length to an offset and length
   *
   * @param value
   */
  public void setBhiKey(
      char[] source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, bhiKey.begin + targetIndex, targetLen);
  }

  /**
   * Update BhiKey with another Field
   *
   * @param value
   */
  public void setBhiKey(Field source) {
    replace(source, 0, source.length(), bhiKey.begin, bhiKey.length());
  }

  /**
   * Update BhiKey with another Field from an offset and length
   *
   * @param value
   */
  public void setBhiKey(Field source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, bhiKey.begin, bhiKey.length());
  }

  /**
   * Update BhiKey with another Field from an offset and length to an offset and length
   *
   * @param value
   */
  public void setBhiKey(
      Field source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, bhiKey.begin + targetIndex, targetLen);
  }
  /**
   * Returns the value of bhiNonkeyData
   *
   * @return bhiNonkeyData
   */
  public BhiNonkeyData getBhiNonkeyData() {
    return bhiNonkeyData;
  }
  /**
   * Update BhiNonkeyData with the passed value Corresponding COBOL Variable is WS-BHI-NONKEY-DATA
   *
   * @param value
   */
  public void setBhiNonkeyData(char[] value) {
    bhiNonkeyData.setString(value);
  }

  /**
   * Update BhiNonkeyData with a String from an offset and length
   *
   * @param value
   */
  public void setBhiNonkeyData(char[] source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, bhiNonkeyData.begin, bhiNonkeyData.length());
  }

  /**
   * Update BhiNonkeyData with a String from an offset and length to an offset and length
   *
   * @param value
   */
  public void setBhiNonkeyData(
      char[] source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, bhiNonkeyData.begin + targetIndex, targetLen);
  }

  /**
   * Update BhiNonkeyData with another Field
   *
   * @param value
   */
  public void setBhiNonkeyData(Field source) {
    replace(source, 0, source.length(), bhiNonkeyData.begin, bhiNonkeyData.length());
  }

  /**
   * Update BhiNonkeyData with another Field from an offset and length
   *
   * @param value
   */
  public void setBhiNonkeyData(Field source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, bhiNonkeyData.begin, bhiNonkeyData.length());
  }

  /**
   * Update BhiNonkeyData with another Field from an offset and length to an offset and length
   *
   * @param value
   */
  public void setBhiNonkeyData(
      Field source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, bhiNonkeyData.begin + targetIndex, targetLen);
  }

  public static int getBhiDataAreaFieldLength() {
    return BHI_DATA_AREA_LENGTH;
  }
}
