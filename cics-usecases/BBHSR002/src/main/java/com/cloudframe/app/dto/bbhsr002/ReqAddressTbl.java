package com.cloudframe.app.dto.bbhsr002;

/**
 * The class ReqAddressTbl is used to handle fields declared in it
 *
 * @author CloudFrame Inc. created on 2025-03-25 at 08:29. using version 5.0.0.231
 */
import com.cloudframe.app.data.Field;
import com.cloudframe.app.dto.serialize.bbhsr002.*;
import com.cloudframe.app.exception.CFException;

public class ReqAddressTbl extends ReqAddressTblSerialized {

  private long reqTblLength;
  private ReqTblLengthRedefined reqTblLengthRedefined = new ReqTblLengthRedefined();

  /** Constructor for ReqAddressTbl */
  public ReqAddressTbl() {
    // TO-DO auto generated code
  }

  /**
   * Constructor for ReqAddressTbl. sets the parent value to the parent
   *
   * @param parent
   * @param begin
   */
  public ReqAddressTbl(Field parent, int begin) {
    setParent(parent, begin);
  }

  @Override
  public void setParent(Field parent, int begin) {
    super.setParent(parent, begin);
    reqTblLengthRedefined.setParent(this, getStartOffset() + 0);
  }

  /**
   * Returns the value of reqTblLength
   *
   * @return reqTblLength
   */
  public long getReqTblLength() throws CFException {
    if (isReqTblLengthModified()) {
      reqTblLength = refreshReqTblLength();
    }
    return reqTblLength;
  }

  /**
   * Update ReqTblLength with the passed value Corresponding COBOL Variable is REQ-TBL-LENGTH
   *
   * @param number
   */
  public void setReqTblLength(long number) {
    // Truncate if the number is beyond +/- Max range
    reqTblLength = checkReqTblLengthMaxLimit(number);
    serializeReqTblLength(reqTblLength);
  }

  /**
   * Update ReqTblLength with the passed value
   *
   * @param value (String or char[])
   */
  public void setReqTblLength(char[] value) throws CFException {
    reqTblLength = serializeReqTblLength(value);
  }
  /**
   * Update ReqTblLength with the passed value
   *
   * @param value (String or char[])
   */
  public void setReqTblLengthString(char[] value) throws CFException {
    setReqTblLength(value);
  }
  /**
   * Returns the value of reqTblLengthRedefined
   *
   * @return reqTblLengthRedefined
   */
  public ReqTblLengthRedefined getReqTblLengthRedefined() {
    return reqTblLengthRedefined;
  }
  /**
   * Update ReqTblLengthRedefined with the passed value Corresponding COBOL Variable is
   * REQ-TBL-LENGTH-REDEFINED
   *
   * @param value
   */
  public void setReqTblLengthRedefined(char[] value) {
    reqTblLengthRedefined.setString(value);
  }

  /**
   * Update ReqTblLengthRedefined with a String from an offset and length
   *
   * @param value
   */
  public void setReqTblLengthRedefined(char[] source, int sourceIndex, int sourceLen) {
    replace(
        source,
        sourceIndex,
        sourceLen,
        reqTblLengthRedefined.begin,
        reqTblLengthRedefined.length());
  }

  /**
   * Update ReqTblLengthRedefined with a String from an offset and length to an offset and length
   *
   * @param value
   */
  public void setReqTblLengthRedefined(
      char[] source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, reqTblLengthRedefined.begin + targetIndex, targetLen);
  }

  /**
   * Update ReqTblLengthRedefined with another Field
   *
   * @param value
   */
  public void setReqTblLengthRedefined(Field source) {
    replace(
        source, 0, source.length(), reqTblLengthRedefined.begin, reqTblLengthRedefined.length());
  }

  /**
   * Update ReqTblLengthRedefined with another Field from an offset and length
   *
   * @param value
   */
  public void setReqTblLengthRedefined(Field source, int sourceIndex, int sourceLen) {
    replace(
        source,
        sourceIndex,
        sourceLen,
        reqTblLengthRedefined.begin,
        reqTblLengthRedefined.length());
  }

  /**
   * Update ReqTblLengthRedefined with another Field from an offset and length to an offset and
   * length
   *
   * @param value
   */
  public void setReqTblLengthRedefined(
      Field source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, reqTblLengthRedefined.begin + targetIndex, targetLen);
  }

  public static int getReqAddressTblFieldLength() {
    return REQ_ADDRESS_TBL_LENGTH;
  }
}
