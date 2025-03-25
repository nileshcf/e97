package com.cloudframe.app.dto.bbhsr002;

/**
 * The class ReqView is used to handle fields declared in it
 *
 * @author CloudFrame Inc. created on 2025-03-25 at 08:29. using version 5.0.0.231
 */
import com.cloudframe.app.data.Field;
import com.cloudframe.app.dto.serialize.bbhsr002.*;
import com.cloudframe.app.exception.CFException;

public class ReqView extends ReqViewSerialized {

  private char[] reqView2Bytes = Field.fillLowValue(2);

  private char[] reqView1Byte = Field.fillLowValue(1);

  /** Constructor for ReqView */
  public ReqView() {
    // TO-DO auto generated code
  }

  /**
   * Constructor for ReqView. sets the parent value to the parent
   *
   * @param parent
   * @param begin
   */
  public ReqView(Field parent, int begin) {
    setParent(parent, begin);
  }

  /**
   * Returns the value of reqView2Bytes
   *
   * @return reqView2Bytes
   */
  public char[] getReqView2Bytes() throws CFException {
    if (isReqView2BytesModified()) {
      reqView2Bytes = refreshReqView2Bytes();
    }
    return reqView2Bytes;
  }

  /**
   * set variable reqView2Bytes Corresponding COBOL Variable is REQ-VIEW-2-BYTES
   *
   * @param value
   */
  public void setReqView2Bytes(char[] value) {
    reqView2Bytes = checkReqView2BytesConstraints(value);
    serializeReqView2Bytes(reqView2Bytes);
  }

  /**
   * Update ReqView2Bytes with a char[] from an offset and length
   *
   * @param value
   */
  public void setReqView2Bytes(char[] source, int sourceIndex) {
    replace(source, sourceIndex, source.length, beginReqView2Bytes, reqView2Bytes.length);
  }

  public void setReqView2Bytes(char[] source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginReqView2Bytes, reqView2Bytes.length);
  }

  /**
   * Update ReqView2Bytes with a char[] from an offset and length to an offset and length
   *
   * @param value
   */
  public void setReqView2Bytes(
      char[] source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginReqView2Bytes + targetIndex, targetLen);
  }

  /**
   * Update ReqView2Bytes with another Field
   *
   * @param value
   */
  public void setReqView2Bytes(Field source) {
    replace(source, 0, source.length(), beginReqView2Bytes, REQ_VIEW_2_BYTES_LEN);
  }

  /**
   * Update ReqView2Bytes with another Field from an offset and length
   *
   * @param value
   */
  public void setReqView2Bytes(Field source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginReqView2Bytes, REQ_VIEW_2_BYTES_LEN);
  }

  /**
   * Update ReqView2Bytes with another Field from an offset and length to an offset and length
   *
   * @param value
   */
  public void setReqView2Bytes(
      Field source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginReqView2Bytes + targetIndex, targetLen);
  }
  /**
   * Returns the value of reqView1Byte
   *
   * @return reqView1Byte
   */
  public char[] getReqView1Byte() throws CFException {
    if (isReqView1ByteModified()) {
      reqView1Byte = refreshReqView1Byte();
    }
    return reqView1Byte;
  }

  /**
   * set variable reqView1Byte Corresponding COBOL Variable is REQ-VIEW-1-BYTE
   *
   * @param value
   */
  public void setReqView1Byte(char[] value) {
    reqView1Byte = checkReqView1ByteConstraints(value);
    serializeReqView1Byte(reqView1Byte);
  }

  /**
   * Update ReqView1Byte with a char[] from an offset and length
   *
   * @param value
   */
  public void setReqView1Byte(char[] source, int sourceIndex) {
    replace(source, sourceIndex, source.length, beginReqView1Byte, reqView1Byte.length);
  }

  public void setReqView1Byte(char[] source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginReqView1Byte, reqView1Byte.length);
  }

  /**
   * Update ReqView1Byte with a char[] from an offset and length to an offset and length
   *
   * @param value
   */
  public void setReqView1Byte(
      char[] source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginReqView1Byte + targetIndex, targetLen);
  }

  /**
   * Update ReqView1Byte with another Field
   *
   * @param value
   */
  public void setReqView1Byte(Field source) {
    replace(source, 0, source.length(), beginReqView1Byte, REQ_VIEW_1_BYTE_LEN);
  }

  /**
   * Update ReqView1Byte with another Field from an offset and length
   *
   * @param value
   */
  public void setReqView1Byte(Field source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginReqView1Byte, REQ_VIEW_1_BYTE_LEN);
  }

  /**
   * Update ReqView1Byte with another Field from an offset and length to an offset and length
   *
   * @param value
   */
  public void setReqView1Byte(
      Field source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginReqView1Byte + targetIndex, targetLen);
  }

  public static int getReqViewFieldLength() {
    return REQ_VIEW_LENGTH;
  }
}
