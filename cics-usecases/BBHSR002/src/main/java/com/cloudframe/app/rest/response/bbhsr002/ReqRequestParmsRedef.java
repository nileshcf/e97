package com.cloudframe.app.rest.response.bbhsr002;

import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.utility.CFUtil;
import com.fasterxml.jackson.annotation.JsonIgnore;
import io.swagger.v3.oas.annotations.Hidden;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.validation.constraints.Size;

/* This class is generated from :com.cloudframe.app.dto.bbhsr002.ReqRequestParmsRedef
 * Copyright (C) 2023 CloudFrame, Inc - All Rights Reserved
 * Unauthorized copying of this file, via any medium is strictly prohibited
 * Proprietary and confidential
 * Written by CloudFrame Team <support@cloudframe.com>, 2023
 * created on 2025-03-25 at 08:32.
 */
public class ReqRequestParmsRedef {

  public ReqRequestParmsRedef() {}

  public ReqRequestParmsRedef(int containerLength) {
    this.containerLength = containerLength;
  }

  @JsonIgnore private int containerLength;

  @Size(max = 146)
  @Schema(description = "Default value is empty", defaultValue = " ")
  private String reqRequestParms146 = "";

  @Size(max = 3)
  @Schema(description = "Default value is empty", defaultValue = " ")
  private String reqRequestParms147149 = "";

  @Size(max = 1)
  @Schema(description = "Default value is empty", defaultValue = " ")
  private String reqRequestParms150 = "";

  @Hidden
  public void setContainerLength(int containerLength) {
    this.containerLength = containerLength;
  }

  public String getReqRequestParms146() {
    return reqRequestParms146;
  }

  public void setReqRequestParms146(String reqRequestParms146) {
    this.reqRequestParms146 = reqRequestParms146;
  }

  public String getReqRequestParms147149() {
    return reqRequestParms147149;
  }

  public void setReqRequestParms147149(String reqRequestParms147149) {
    this.reqRequestParms147149 = reqRequestParms147149;
  }

  public String getReqRequestParms150() {
    return reqRequestParms150;
  }

  public void setReqRequestParms150(String reqRequestParms150) {
    this.reqRequestParms150 = reqRequestParms150;
  }

  @Hidden
  public void populateFromDto(com.cloudframe.app.dto.bbhsr002.ReqRequestParmsRedef dto)
      throws CFException {
    setReqRequestParms146(CFUtil.trim(dto.getReqRequestParms146()));
    setReqRequestParms147149(CFUtil.trim(dto.getReqRequestParms147149()));
    setReqRequestParms150(CFUtil.trim(dto.getReqRequestParms150()));
  }
}
