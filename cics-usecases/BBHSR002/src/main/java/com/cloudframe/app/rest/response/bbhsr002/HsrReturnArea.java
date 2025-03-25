package com.cloudframe.app.rest.response.bbhsr002;

import com.cloudframe.app.exception.CFException;
import com.fasterxml.jackson.annotation.JsonIgnore;
import io.swagger.v3.oas.annotations.Hidden;

/* This class is generated from :com.cloudframe.app.dto.bbhsr002.HsrReturnArea
 * Copyright (C) 2023 CloudFrame, Inc - All Rights Reserved
 * Unauthorized copying of this file, via any medium is strictly prohibited
 * Proprietary and confidential
 * Written by CloudFrame Team <support@cloudframe.com>, 2023
 * created on 2025-03-25 at 08:32.
 */
public class HsrReturnArea {

  public HsrReturnArea() {}

  public HsrReturnArea(int containerLength) {
    this.containerLength = containerLength;
  }

  @JsonIgnore private int containerLength;

  private HsrRetGetmainIdentifier hsrRetGetmainIdentifier;

  private HsrRetArea hsrRetArea;

  private HsrRetFunctionMessage hsrRetFunctionMessage;

  @Hidden
  public void setContainerLength(int containerLength) {
    this.containerLength = containerLength;
  }

  public HsrRetGetmainIdentifier getHsrRetGetmainIdentifier() {
    return hsrRetGetmainIdentifier;
  }

  public void setHsrRetGetmainIdentifier(HsrRetGetmainIdentifier hsrRetGetmainIdentifier) {
    this.hsrRetGetmainIdentifier = hsrRetGetmainIdentifier;
  }

  public HsrRetArea getHsrRetArea() {
    return hsrRetArea;
  }

  public void setHsrRetArea(HsrRetArea hsrRetArea) {
    this.hsrRetArea = hsrRetArea;
  }

  public HsrRetFunctionMessage getHsrRetFunctionMessage() {
    return hsrRetFunctionMessage;
  }

  public void setHsrRetFunctionMessage(HsrRetFunctionMessage hsrRetFunctionMessage) {
    this.hsrRetFunctionMessage = hsrRetFunctionMessage;
  }

  @Hidden
  public void populateFromDto(com.cloudframe.app.dto.bbhsr002.HsrReturnArea dto)
      throws CFException {
    setHsrRetGetmainIdentifier(new HsrRetGetmainIdentifier(containerLength));
    getHsrRetGetmainIdentifier().populateFromDto(dto.getHsrRetGetmainIdentifier());
    setHsrRetArea(new HsrRetArea(containerLength));
    getHsrRetArea().populateFromDto(dto.getHsrRetArea());
    setHsrRetFunctionMessage(new HsrRetFunctionMessage(containerLength));
    getHsrRetFunctionMessage().populateFromDto(dto.getHsrRetFunctionMessage());
  }
}
