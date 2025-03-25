package com.cloudframe.app.dto.d5427bhi;

/**
 * The class BhiReqRowDet is used to handle fields declared in it
 *
 * @author CloudFrame Inc. created on 2025-03-25 at 08:32. using version 5.0.0.231
 */
import com.cloudframe.app.data.Field;
import com.cloudframe.app.dto.serialize.d5427bhi.*;

public class BhiReqRowDet extends BhiReqRowDetSerialized {

  private BhiReqRowKey bhiReqRowKey = new BhiReqRowKey();
  private BhiReqRowNonkeyData bhiReqRowNonkeyData = new BhiReqRowNonkeyData();

  /** Constructor for BhiReqRowDet */
  public BhiReqRowDet() {
    // TO-DO auto generated code
  }

  /**
   * Constructor for BhiReqRowDet. sets the parent value to the parent
   *
   * @param parent
   * @param begin
   */
  public BhiReqRowDet(Field parent, int begin) {
    setParent(parent, begin);
  }

  @Override
  public void setParent(Field parent, int begin) {
    super.setParent(parent, begin);
    bhiReqRowKey.setParent(this, getStartOffset() + 0);
    bhiReqRowNonkeyData.setParent(this, getStartOffset() + 30);
  }

  /**
   * Returns the value of bhiReqRowKey
   *
   * @return bhiReqRowKey
   */
  public BhiReqRowKey getBhiReqRowKey() {
    return bhiReqRowKey;
  }
  /**
   * Update BhiReqRowKey with the passed value Corresponding COBOL Variable is BHI-REQ-ROW-KEY
   *
   * @param value
   */
  public void setBhiReqRowKey(char[] value) {
    bhiReqRowKey.setString(value);
  }

  /**
   * Update BhiReqRowKey with a String from an offset and length
   *
   * @param value
   */
  public void setBhiReqRowKey(char[] source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, bhiReqRowKey.begin, bhiReqRowKey.length());
  }

  /**
   * Update BhiReqRowKey with a String from an offset and length to an offset and length
   *
   * @param value
   */
  public void setBhiReqRowKey(
      char[] source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, bhiReqRowKey.begin + targetIndex, targetLen);
  }

  /**
   * Update BhiReqRowKey with another Field
   *
   * @param value
   */
  public void setBhiReqRowKey(Field source) {
    replace(source, 0, source.length(), bhiReqRowKey.begin, bhiReqRowKey.length());
  }

  /**
   * Update BhiReqRowKey with another Field from an offset and length
   *
   * @param value
   */
  public void setBhiReqRowKey(Field source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, bhiReqRowKey.begin, bhiReqRowKey.length());
  }

  /**
   * Update BhiReqRowKey with another Field from an offset and length to an offset and length
   *
   * @param value
   */
  public void setBhiReqRowKey(
      Field source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, bhiReqRowKey.begin + targetIndex, targetLen);
  }
  /**
   * Returns the value of bhiReqRowNonkeyData
   *
   * @return bhiReqRowNonkeyData
   */
  public BhiReqRowNonkeyData getBhiReqRowNonkeyData() {
    return bhiReqRowNonkeyData;
  }
  /**
   * Update BhiReqRowNonkeyData with the passed value Corresponding COBOL Variable is
   * BHI-REQ-ROW-NONKEY-DATA
   *
   * @param value
   */
  public void setBhiReqRowNonkeyData(char[] value) {
    bhiReqRowNonkeyData.setString(value);
  }

  /**
   * Update BhiReqRowNonkeyData with a String from an offset and length
   *
   * @param value
   */
  public void setBhiReqRowNonkeyData(char[] source, int sourceIndex, int sourceLen) {
    replace(
        source, sourceIndex, sourceLen, bhiReqRowNonkeyData.begin, bhiReqRowNonkeyData.length());
  }

  /**
   * Update BhiReqRowNonkeyData with a String from an offset and length to an offset and length
   *
   * @param value
   */
  public void setBhiReqRowNonkeyData(
      char[] source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, bhiReqRowNonkeyData.begin + targetIndex, targetLen);
  }

  /**
   * Update BhiReqRowNonkeyData with another Field
   *
   * @param value
   */
  public void setBhiReqRowNonkeyData(Field source) {
    replace(source, 0, source.length(), bhiReqRowNonkeyData.begin, bhiReqRowNonkeyData.length());
  }

  /**
   * Update BhiReqRowNonkeyData with another Field from an offset and length
   *
   * @param value
   */
  public void setBhiReqRowNonkeyData(Field source, int sourceIndex, int sourceLen) {
    replace(
        source, sourceIndex, sourceLen, bhiReqRowNonkeyData.begin, bhiReqRowNonkeyData.length());
  }

  /**
   * Update BhiReqRowNonkeyData with another Field from an offset and length to an offset and length
   *
   * @param value
   */
  public void setBhiReqRowNonkeyData(
      Field source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, bhiReqRowNonkeyData.begin + targetIndex, targetLen);
  }

  public static int getBhiReqRowDetFieldLength() {
    return BHI_REQ_ROW_DET_LENGTH;
  }
}
