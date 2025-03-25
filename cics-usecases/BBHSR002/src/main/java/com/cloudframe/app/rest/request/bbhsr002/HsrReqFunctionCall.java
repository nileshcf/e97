package com.cloudframe.app.rest.request.bbhsr002;

import com.fasterxml.jackson.annotation.JsonIgnore;
import io.swagger.v3.oas.annotations.Hidden;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.validation.constraints.Size;

/* This class is generated from :com.cloudframe.app.dto.bbhsr002.HsrReqFunctionCall
 * Copyright (C) 2023 CloudFrame, Inc - All Rights Reserved
 * Unauthorized copying of this file, via any medium is strictly prohibited
 * Proprietary and confidential
 * Written by CloudFrame Team <support@cloudframe.com>, 2023
 * created on 2025-03-25 at 08:32.
 */
public class HsrReqFunctionCall {

  public HsrReqFunctionCall() {}

  public HsrReqFunctionCall(int containerLength) {
    this.containerLength = containerLength;
  }

  @JsonIgnore private int containerLength;

  @Size(max = 12)
  @Schema(description = "Default value is empty", defaultValue = " ")
  private String hsrReqRequestType = "";

  @Size(max = 3)
  @Schema(description = "Default value is empty", defaultValue = " ")
  private String hsrReqVersion = "";

  @Size(max = 8)
  @Schema(description = "Default value is empty", defaultValue = " ")
  private String hsrReqCreator = "";

  @Hidden
  public void setContainerLength(int containerLength) {
    this.containerLength = containerLength;
  }

  public String getHsrReqRequestType() {
    return hsrReqRequestType;
  }

  public void setHsrReqRequestType(String hsrReqRequestType) {
    this.hsrReqRequestType = hsrReqRequestType;
  }

  public String getHsrReqVersion() {
    return hsrReqVersion;
  }

  public void setHsrReqVersion(String hsrReqVersion) {
    this.hsrReqVersion = hsrReqVersion;
  }

  public String getHsrReqCreator() {
    return hsrReqCreator;
  }

  public void setHsrReqCreator(String hsrReqCreator) {
    this.hsrReqCreator = hsrReqCreator;
  }

  @Hidden
  public void populateToDto(com.cloudframe.app.dto.bbhsr002.HsrReqFunctionCall dto) {
    dto.setHsrReqRequestType(getHsrReqRequestType().toCharArray());
    dto.setHsrReqVersion(getHsrReqVersion().toCharArray());
    dto.setHsrReqCreator(getHsrReqCreator().toCharArray());
  }
}
