package com.cloudframe.app.dto.d5427bhi;

/**
 * The class BhiRowReturnDet is used to handle fields declared in it
 *
 * @author CloudFrame Inc. created on 2025-03-25 at 08:32. using version 5.0.0.231
 */
import com.cloudframe.app.data.Field;
import com.cloudframe.app.dto.serialize.d5427bhi.*;

public class BhiRowReturnDet extends BhiRowReturnDetSerialized {

  private BhiRowKey bhiRowKey = new BhiRowKey();
  private BhiRowNonkeyData bhiRowNonkeyData = new BhiRowNonkeyData();

  /** Constructor for BhiRowReturnDet */
  public BhiRowReturnDet() {
    // TO-DO auto generated code
  }

  /**
   * Constructor for BhiRowReturnDet. sets the parent value to the parent
   *
   * @param parent
   * @param begin
   */
  public BhiRowReturnDet(Field parent, int begin) {
    setParent(parent, begin);
  }

  @Override
  public void setParent(Field parent, int begin) {
    super.setParent(parent, begin);
    bhiRowKey.setParent(this, getStartOffset() + 0);
    bhiRowNonkeyData.setParent(this, getStartOffset() + 56);
  }

  /**
   * Returns the value of bhiRowKey
   *
   * @return bhiRowKey
   */
  public BhiRowKey getBhiRowKey() {
    return bhiRowKey;
  }
  /**
   * Update BhiRowKey with the passed value Corresponding COBOL Variable is BHI-ROW-KEY
   *
   * @param value
   */
  public void setBhiRowKey(char[] value) {
    bhiRowKey.setString(value);
  }

  /**
   * Update BhiRowKey with a String from an offset and length
   *
   * @param value
   */
  public void setBhiRowKey(char[] source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, bhiRowKey.begin, bhiRowKey.length());
  }

  /**
   * Update BhiRowKey with a String from an offset and length to an offset and length
   *
   * @param value
   */
  public void setBhiRowKey(
      char[] source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, bhiRowKey.begin + targetIndex, targetLen);
  }

  /**
   * Update BhiRowKey with another Field
   *
   * @param value
   */
  public void setBhiRowKey(Field source) {
    replace(source, 0, source.length(), bhiRowKey.begin, bhiRowKey.length());
  }

  /**
   * Update BhiRowKey with another Field from an offset and length
   *
   * @param value
   */
  public void setBhiRowKey(Field source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, bhiRowKey.begin, bhiRowKey.length());
  }

  /**
   * Update BhiRowKey with another Field from an offset and length to an offset and length
   *
   * @param value
   */
  public void setBhiRowKey(
      Field source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, bhiRowKey.begin + targetIndex, targetLen);
  }
  /**
   * Returns the value of bhiRowNonkeyData
   *
   * @return bhiRowNonkeyData
   */
  public BhiRowNonkeyData getBhiRowNonkeyData() {
    return bhiRowNonkeyData;
  }
  /**
   * Update BhiRowNonkeyData with the passed value Corresponding COBOL Variable is
   * BHI-ROW-NONKEY-DATA
   *
   * @param value
   */
  public void setBhiRowNonkeyData(char[] value) {
    bhiRowNonkeyData.setString(value);
  }

  /**
   * Update BhiRowNonkeyData with a String from an offset and length
   *
   * @param value
   */
  public void setBhiRowNonkeyData(char[] source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, bhiRowNonkeyData.begin, bhiRowNonkeyData.length());
  }

  /**
   * Update BhiRowNonkeyData with a String from an offset and length to an offset and length
   *
   * @param value
   */
  public void setBhiRowNonkeyData(
      char[] source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, bhiRowNonkeyData.begin + targetIndex, targetLen);
  }

  /**
   * Update BhiRowNonkeyData with another Field
   *
   * @param value
   */
  public void setBhiRowNonkeyData(Field source) {
    replace(source, 0, source.length(), bhiRowNonkeyData.begin, bhiRowNonkeyData.length());
  }

  /**
   * Update BhiRowNonkeyData with another Field from an offset and length
   *
   * @param value
   */
  public void setBhiRowNonkeyData(Field source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, bhiRowNonkeyData.begin, bhiRowNonkeyData.length());
  }

  /**
   * Update BhiRowNonkeyData with another Field from an offset and length to an offset and length
   *
   * @param value
   */
  public void setBhiRowNonkeyData(
      Field source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, bhiRowNonkeyData.begin + targetIndex, targetLen);
  }

  /**
   * initializes BhiRowReturnDet String fields defaults to Spaces short/int/long defaults to zero
   * BigDecimal defaults to BigDecimal.ZERO
   */
  public void initialize() {
    bhiRowKey.initialize();

    bhiRowNonkeyData.initialize();
  }

  public static int getBhiRowReturnDetFieldLength() {
    return BHI_ROW_RETURN_DET_LENGTH;
  }
}
