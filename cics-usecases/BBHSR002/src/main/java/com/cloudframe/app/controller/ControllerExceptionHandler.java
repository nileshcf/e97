package com.cloudframe.app.controller;

import com.cloudframe.app.dto.ErrorMessage;
import com.cloudframe.app.exception.BusinessException;
import com.cloudframe.app.exception.DatabaseException;
import com.cloudframe.app.exception.RuntimeException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.WebRequest;

@ControllerAdvice
public class ControllerExceptionHandler {
  @ExceptionHandler(value = {BusinessException.class})
  public ResponseEntity<ErrorMessage> applicationException(
      BusinessException businessException, WebRequest request) {
    return new ResponseEntity<>(
        new ErrorMessage(
            businessException.getMessage(), "BUSSINES_ERROR", businessException.getRc()),
        HttpStatus.INTERNAL_SERVER_ERROR);
  }

  @ExceptionHandler(value = {DatabaseException.class})
  public ResponseEntity<ErrorMessage> applicationException(
      DatabaseException databaseException, WebRequest request) {
    return new ResponseEntity<>(
        new ErrorMessage(
            databaseException.getMessage(), "DATABASE_ERROR", databaseException.getRc()),
        HttpStatus.INTERNAL_SERVER_ERROR);
  }

  @ExceptionHandler(value = {RuntimeException.class})
  public ResponseEntity<ErrorMessage> applicationException(
      RuntimeException runtimeException, WebRequest request) {
    return new ResponseEntity<>(
        new ErrorMessage(runtimeException.getMessage(), "RUNTIME_ERROR", runtimeException.getRc()),
        HttpStatus.INTERNAL_SERVER_ERROR);
  }
}
