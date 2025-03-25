package com.cloudframe.app.rest.request.bbhsr002;

import com.fasterxml.jackson.annotation.JsonIgnore;
import io.swagger.v3.oas.annotations.Hidden;

/* This class is generated from :com.cloudframe.app.dto.bbhsr002.HsrRequestArea
 * Copyright (C) 2023 CloudFrame, Inc - All Rights Reserved
 * Unauthorized copying of this file, via any medium is strictly prohibited
 * Proprietary and confidential
 * Written by CloudFrame Team <support@cloudframe.com>, 2023
 * created on 2025-03-25 at 08:32.
 */
public class HsrRequestArea {

  public HsrRequestArea() {}

  public HsrRequestArea(int containerLength) {
    this.containerLength = containerLength;
  }

  @JsonIgnore private int containerLength;

  private HsrReqArea hsrReqArea;

  @Hidden
  public void setContainerLength(int containerLength) {
    this.containerLength = containerLength;
  }

  public HsrReqArea getHsrReqArea() {
    return hsrReqArea;
  }

  public void setHsrReqArea(HsrReqArea hsrReqArea) {
    this.hsrReqArea = hsrReqArea;
  }

  @Hidden
  public void populateToDto(com.cloudframe.app.dto.bbhsr002.HsrRequestArea dto) {
    getHsrReqArea().populateToDto(dto.getHsrReqArea());
  }
}
