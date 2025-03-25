package com.cloudframe.app.dto.bbhsr002;

/**
 * The class BhiReqRow is used to handle fields declared in it
 *
 * @author CloudFrame Inc. created on 2025-03-25 at 08:29. using version 5.0.0.231
 */
import com.cloudframe.app.data.Field;
import com.cloudframe.app.dto.serialize.bbhsr002.*;
import com.cloudframe.app.exception.CFException;

public class BhiReqRow extends BhiReqRowSerialized {

  private char[] bhiReqRowAct = Field.fillLowValue(1);
  private BhiReqRowDet bhiReqRowDet = new BhiReqRowDet();

  /** Constructor for BhiReqRow */
  public BhiReqRow() {
    // TO-DO auto generated code
  }

  /**
   * Constructor for BhiReqRow. sets the parent value to the parent
   *
   * @param parent
   * @param begin
   */
  public BhiReqRow(Field parent, int begin) {
    setParent(parent, begin);
  }

  @Override
  public void setParent(Field parent, int begin) {
    super.setParent(parent, begin);
    bhiReqRowDet.setParent(this, getStartOffset() + 1);
  }

  /**
   * Returns the value of bhiReqRowAct
   *
   * @return bhiReqRowAct
   */
  public char[] getBhiReqRowAct() throws CFException {
    if (isBhiReqRowActModified()) {
      bhiReqRowAct = refreshBhiReqRowAct();
    }
    return bhiReqRowAct;
  }

  /**
   * set variable bhiReqRowAct Corresponding COBOL Variable is BHI-REQ-ROW-ACT
   *
   * @param value
   */
  public void setBhiReqRowAct(char[] value) {
    bhiReqRowAct = checkBhiReqRowActConstraints(value);
    serializeBhiReqRowAct(bhiReqRowAct);
  }

  /**
   * Update BhiReqRowAct with a char[] from an offset and length
   *
   * @param value
   */
  public void setBhiReqRowAct(char[] source, int sourceIndex) {
    replace(source, sourceIndex, source.length, beginBhiReqRowAct, bhiReqRowAct.length);
  }

  public void setBhiReqRowAct(char[] source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginBhiReqRowAct, bhiReqRowAct.length);
  }

  /**
   * Update BhiReqRowAct with a char[] from an offset and length to an offset and length
   *
   * @param value
   */
  public void setBhiReqRowAct(
      char[] source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginBhiReqRowAct + targetIndex, targetLen);
  }

  /**
   * Update BhiReqRowAct with another Field
   *
   * @param value
   */
  public void setBhiReqRowAct(Field source) {
    replace(source, 0, source.length(), beginBhiReqRowAct, BHI_REQ_ROW_ACT_LEN);
  }

  /**
   * Update BhiReqRowAct with another Field from an offset and length
   *
   * @param value
   */
  public void setBhiReqRowAct(Field source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginBhiReqRowAct, BHI_REQ_ROW_ACT_LEN);
  }

  /**
   * Update BhiReqRowAct with another Field from an offset and length to an offset and length
   *
   * @param value
   */
  public void setBhiReqRowAct(
      Field source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginBhiReqRowAct + targetIndex, targetLen);
  }
  /**
   * Returns the value of bhiReqRowDet
   *
   * @return bhiReqRowDet
   */
  public BhiReqRowDet getBhiReqRowDet() {
    return bhiReqRowDet;
  }
  /**
   * Update BhiReqRowDet with the passed value Corresponding COBOL Variable is BHI-REQ-ROW-DET
   *
   * @param value
   */
  public void setBhiReqRowDet(char[] value) {
    bhiReqRowDet.setString(value);
  }

  /**
   * Update BhiReqRowDet with a String from an offset and length
   *
   * @param value
   */
  public void setBhiReqRowDet(char[] source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, bhiReqRowDet.begin, bhiReqRowDet.length());
  }

  /**
   * Update BhiReqRowDet with a String from an offset and length to an offset and length
   *
   * @param value
   */
  public void setBhiReqRowDet(
      char[] source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, bhiReqRowDet.begin + targetIndex, targetLen);
  }

  /**
   * Update BhiReqRowDet with another Field
   *
   * @param value
   */
  public void setBhiReqRowDet(Field source) {
    replace(source, 0, source.length(), bhiReqRowDet.begin, bhiReqRowDet.length());
  }

  /**
   * Update BhiReqRowDet with another Field from an offset and length
   *
   * @param value
   */
  public void setBhiReqRowDet(Field source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, bhiReqRowDet.begin, bhiReqRowDet.length());
  }

  /**
   * Update BhiReqRowDet with another Field from an offset and length to an offset and length
   *
   * @param value
   */
  public void setBhiReqRowDet(
      Field source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, bhiReqRowDet.begin + targetIndex, targetLen);
  }

  public static int getBhiReqRowFieldLength() {
    return BHI_REQ_ROW_LENGTH;
  }
}
