package com.cloudframe.app.dto.bbhsr002;

/**
 * The class ReqViewName is used to handle fields declared in it
 *
 * @author CloudFrame Inc. created on 2025-03-25 at 08:29. using version 5.0.0.231
 */
import com.cloudframe.app.data.Field;
import com.cloudframe.app.dto.serialize.bbhsr002.*;
import com.cloudframe.app.exception.CFException;

public class ReqViewName extends ReqViewNameSerialized {

  private char[] reqViewProjCode = Field.fillLowValue(5);
  private ReqView reqView = new ReqView();

  /** Constructor for ReqViewName */
  public ReqViewName() {
    // TO-DO auto generated code
  }

  /**
   * Constructor for ReqViewName. sets the parent value to the parent
   *
   * @param parent
   * @param begin
   */
  public ReqViewName(Field parent, int begin) {
    setParent(parent, begin);
  }

  @Override
  public void setParent(Field parent, int begin) {
    super.setParent(parent, begin);
    reqView.setParent(this, getStartOffset() + 5);
  }

  /**
   * Returns the value of reqViewProjCode
   *
   * @return reqViewProjCode
   */
  public char[] getReqViewProjCode() throws CFException {
    if (isReqViewProjCodeModified()) {
      reqViewProjCode = refreshReqViewProjCode();
    }
    return reqViewProjCode;
  }

  /**
   * set variable reqViewProjCode Corresponding COBOL Variable is REQ-VIEW-PROJ-CODE
   *
   * @param value
   */
  public void setReqViewProjCode(char[] value) {
    reqViewProjCode = checkReqViewProjCodeConstraints(value);
    serializeReqViewProjCode(reqViewProjCode);
  }

  /**
   * Update ReqViewProjCode with a char[] from an offset and length
   *
   * @param value
   */
  public void setReqViewProjCode(char[] source, int sourceIndex) {
    replace(source, sourceIndex, source.length, beginReqViewProjCode, reqViewProjCode.length);
  }

  public void setReqViewProjCode(char[] source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginReqViewProjCode, reqViewProjCode.length);
  }

  /**
   * Update ReqViewProjCode with a char[] from an offset and length to an offset and length
   *
   * @param value
   */
  public void setReqViewProjCode(
      char[] source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginReqViewProjCode + targetIndex, targetLen);
  }

  /**
   * Update ReqViewProjCode with another Field
   *
   * @param value
   */
  public void setReqViewProjCode(Field source) {
    replace(source, 0, source.length(), beginReqViewProjCode, REQ_VIEW_PROJ_CODE_LEN);
  }

  /**
   * Update ReqViewProjCode with another Field from an offset and length
   *
   * @param value
   */
  public void setReqViewProjCode(Field source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginReqViewProjCode, REQ_VIEW_PROJ_CODE_LEN);
  }

  /**
   * Update ReqViewProjCode with another Field from an offset and length to an offset and length
   *
   * @param value
   */
  public void setReqViewProjCode(
      Field source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginReqViewProjCode + targetIndex, targetLen);
  }
  /**
   * Returns the value of reqView
   *
   * @return reqView
   */
  public ReqView getReqView() {
    return reqView;
  }
  /**
   * Update ReqView with the passed value Corresponding COBOL Variable is REQ-VIEW
   *
   * @param value
   */
  public void setReqView(char[] value) {
    reqView.setString(value);
  }

  /**
   * Update ReqView with a String from an offset and length
   *
   * @param value
   */
  public void setReqView(char[] source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, reqView.begin, reqView.length());
  }

  /**
   * Update ReqView with a String from an offset and length to an offset and length
   *
   * @param value
   */
  public void setReqView(
      char[] source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, reqView.begin + targetIndex, targetLen);
  }

  /**
   * Update ReqView with another Field
   *
   * @param value
   */
  public void setReqView(Field source) {
    replace(source, 0, source.length(), reqView.begin, reqView.length());
  }

  /**
   * Update ReqView with another Field from an offset and length
   *
   * @param value
   */
  public void setReqView(Field source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, reqView.begin, reqView.length());
  }

  /**
   * Update ReqView with another Field from an offset and length to an offset and length
   *
   * @param value
   */
  public void setReqView(
      Field source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, reqView.begin + targetIndex, targetLen);
  }

  public static int getReqViewNameFieldLength() {
    return REQ_VIEW_NAME_LENGTH;
  }
}
