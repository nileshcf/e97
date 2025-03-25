package com.cloudframe.app.rest.response.bbhsr002;

import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.utility.CFUtil;
import com.fasterxml.jackson.annotation.JsonIgnore;
import io.swagger.v3.oas.annotations.Hidden;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.validation.constraints.Size;

/* This class is generated from :com.cloudframe.app.dto.bbhsr002.ReqViewName
 * Copyright (C) 2023 CloudFrame, Inc - All Rights Reserved
 * Unauthorized copying of this file, via any medium is strictly prohibited
 * Proprietary and confidential
 * Written by CloudFrame Team <support@cloudframe.com>, 2023
 * created on 2025-03-25 at 08:32.
 */
public class ReqViewName {

  public ReqViewName() {}

  public ReqViewName(int containerLength) {
    this.containerLength = containerLength;
  }

  @JsonIgnore private int containerLength;

  @Size(max = 5)
  @Schema(description = "Default value is empty", defaultValue = " ")
  private String reqViewProjCode = "";

  private ReqView reqView;

  @Hidden
  public void setContainerLength(int containerLength) {
    this.containerLength = containerLength;
  }

  public String getReqViewProjCode() {
    return reqViewProjCode;
  }

  public void setReqViewProjCode(String reqViewProjCode) {
    this.reqViewProjCode = reqViewProjCode;
  }

  public ReqView getReqView() {
    return reqView;
  }

  public void setReqView(ReqView reqView) {
    this.reqView = reqView;
  }

  @Hidden
  public void populateFromDto(com.cloudframe.app.dto.bbhsr002.ReqViewName dto) throws CFException {
    setReqViewProjCode(CFUtil.trim(dto.getReqViewProjCode()));
    setReqView(new ReqView(containerLength));
    getReqView().populateFromDto(dto.getReqView());
  }
}
