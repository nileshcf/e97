package com.cloudframe.app.rest.request.bbhsr002;

import com.fasterxml.jackson.annotation.JsonIgnore;
import io.swagger.v3.oas.annotations.Hidden;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.validation.constraints.Size;

/* This class is generated from :com.cloudframe.app.dto.bbhsr002.HsrReqContractMessage
 * Copyright (C) 2023 CloudFrame, Inc - All Rights Reserved
 * Unauthorized copying of this file, via any medium is strictly prohibited
 * Proprietary and confidential
 * Written by CloudFrame Team <support@cloudframe.com>, 2023
 * created on 2025-03-25 at 08:32.
 */
public class HsrReqContractMessage {

  public HsrReqContractMessage() {}

  public HsrReqContractMessage(int containerLength) {
    this.containerLength = containerLength;
  }

  @JsonIgnore private int containerLength;

  @Size(max = 3)
  @Schema(description = "Default value is empty", defaultValue = " ")
  private String hsrReqContractRtnCd = "";

  @Hidden
  public void setContainerLength(int containerLength) {
    this.containerLength = containerLength;
  }

  public String getHsrReqContractRtnCd() {
    return hsrReqContractRtnCd;
  }

  public void setHsrReqContractRtnCd(String hsrReqContractRtnCd) {
    this.hsrReqContractRtnCd = hsrReqContractRtnCd;
  }

  @Hidden
  public void populateToDto(com.cloudframe.app.dto.bbhsr002.HsrReqContractMessage dto) {
    dto.setHsrReqContractRtnCd(getHsrReqContractRtnCd().toCharArray());
  }
}
