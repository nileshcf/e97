package com.optum.uhg.app.dto;

public class ErrorMessage {
  String message = "";
  String errorCode = "";
  int returnCode = 0;

  public ErrorMessage() {}

  public ErrorMessage(String message, String errorCode, int returnCode) {
    this.message = message;
    this.errorCode = errorCode;
    this.returnCode = returnCode;
  }

  public String getMessage() {
    return message;
  }

  public void setMessage(String status) {
    this.message = status;
  }

  public String getErrorCode() {
    return errorCode;
  }

  public void setErrorCode(String errorCode) {
    this.errorCode = errorCode;
  }

  public int getReturnCode() {
    return returnCode;
  }

  public void setReturnCode(int returnCode) {
    this.returnCode = returnCode;
  }
}
