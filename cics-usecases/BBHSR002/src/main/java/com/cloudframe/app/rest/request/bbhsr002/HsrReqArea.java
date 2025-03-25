package com.cloudframe.app.rest.request.bbhsr002;

import com.fasterxml.jackson.annotation.JsonIgnore;
import io.swagger.v3.oas.annotations.Hidden;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.validation.constraints.Size;

/* This class is generated from :com.cloudframe.app.dto.bbhsr002.HsrReqArea
 * Copyright (C) 2023 CloudFrame, Inc - All Rights Reserved
 * Unauthorized copying of this file, via any medium is strictly prohibited
 * Proprietary and confidential
 * Written by CloudFrame Team <support@cloudframe.com>, 2023
 * created on 2025-03-25 at 08:32.
 */
public class HsrReqArea {

  public HsrReqArea() {}

  public HsrReqArea(int containerLength) {
    this.containerLength = containerLength;
  }

  @JsonIgnore private int containerLength;

  private HsrReqFunctionCall hsrReqFunctionCall;

  private HsrReqGetmainIdentifier hsrReqGetmainIdentifier;

  @Size(max = 1)
  @Schema(description = "Default value is empty", defaultValue = " ")
  private String hsrReqCommonAreaSw = "";

  private HsrReqContractMessage hsrReqContractMessage;

  private HsrReqRequest hsrReqRequest;

  @Hidden
  public void setContainerLength(int containerLength) {
    this.containerLength = containerLength;
  }

  public HsrReqFunctionCall getHsrReqFunctionCall() {
    return hsrReqFunctionCall;
  }

  public void setHsrReqFunctionCall(HsrReqFunctionCall hsrReqFunctionCall) {
    this.hsrReqFunctionCall = hsrReqFunctionCall;
  }

  public HsrReqGetmainIdentifier getHsrReqGetmainIdentifier() {
    return hsrReqGetmainIdentifier;
  }

  public void setHsrReqGetmainIdentifier(HsrReqGetmainIdentifier hsrReqGetmainIdentifier) {
    this.hsrReqGetmainIdentifier = hsrReqGetmainIdentifier;
  }

  public String getHsrReqCommonAreaSw() {
    return hsrReqCommonAreaSw;
  }

  public void setHsrReqCommonAreaSw(String hsrReqCommonAreaSw) {
    this.hsrReqCommonAreaSw = hsrReqCommonAreaSw;
  }

  public HsrReqContractMessage getHsrReqContractMessage() {
    return hsrReqContractMessage;
  }

  public void setHsrReqContractMessage(HsrReqContractMessage hsrReqContractMessage) {
    this.hsrReqContractMessage = hsrReqContractMessage;
  }

  public HsrReqRequest getHsrReqRequest() {
    return hsrReqRequest;
  }

  public void setHsrReqRequest(HsrReqRequest hsrReqRequest) {
    this.hsrReqRequest = hsrReqRequest;
  }

  @Hidden
  public void populateToDto(com.cloudframe.app.dto.bbhsr002.HsrReqArea dto) {
    getHsrReqFunctionCall().populateToDto(dto.getHsrReqFunctionCall());
    getHsrReqGetmainIdentifier().populateToDto(dto.getHsrReqGetmainIdentifier());
    dto.setHsrReqCommonAreaSw(getHsrReqCommonAreaSw().toCharArray());
    getHsrReqContractMessage().populateToDto(dto.getHsrReqContractMessage());
    getHsrReqRequest().populateToDto(dto.getHsrReqRequest());
  }
}
